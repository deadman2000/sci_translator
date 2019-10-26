;;; Sierra Script 1.0 - (do not remove this comment)
(script# 934)
(include sci.sh)
(use n000)
(use n255)
(use n937)
(use n999)

(public
	GameControls 0
)

(class Slider of IconI
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		sliderView 0
		sliderLoop 0
		sliderCel 0
		sTop 0
		sLeft 0
		sRight 0
		maxY 0
		minY 0
		underBits 0
		yStep 1
		theObj 0
		selector 0
		bottomValue 0
		topValue 0
	)
	
	(method (doit)
		(if theObj (proc999_7 theObj selector &rest))
	)
	
	(method (show)
		(super show: &rest)
		(if (not sRight)
			(= sLeft nsLeft)
			(= sRight nsRight)
			(= maxY
				(- nsBottom (CelHigh sliderView sliderLoop sliderCel))
			)
			(= minY nsTop)
		)
		(= sTop (self valueToPosn:))
		(DrawCel sliderView sliderLoop sliderCel sLeft sTop -1)
	)
	
	(method (select param1 &tmp newEvent)
		(return
			(if (and argc param1)
				(while (!= ((= newEvent (Event new:)) type?) 2)
					(newEvent localize:)
					(cond 
						((< (newEvent y?) (- sTop yStep)) (self move: yStep (not (& signal isExtra))))
						((> (newEvent y?) (+ sTop yStep)) (self move: (- yStep) (not (& signal isExtra))))
					)
					(newEvent dispose:)
				)
				(if (& signal isExtra)
					(self doit: (self posnToValue: sTop))
				)
				(newEvent dispose:)
			else
				(return 1)
			)
		)
	)
	
	(method (highlight)
	)
	
	(method (advance)
		(self
			move:
				(proc999_3
					yStep
					(-
						sTop
						(self
							valueToPosn: (+ (self doit:) (proc999_0 (- topValue bottomValue)))
						)
					)
				)
				(not (& signal isExtra))
		)
		(if (& signal isExtra)
			(self doit: (self posnToValue: sTop))
		)
	)
	
	(method (retreat)
		(self
			move:
				(proc999_2
					(- yStep)
					(-
						sTop
						(self
							valueToPosn: (- (self doit:) (proc999_0 (- topValue bottomValue)))
						)
					)
				)
				(not (& signal isExtra))
		)
		(if (& signal isExtra)
			(self doit: (self posnToValue: sTop))
		)
	)
	
	(method (move param1 param2 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(= temp7 (if (not argc) else param2))
		(= temp5 (proc999_0 param1))
		(= temp4 param1)
		(while (<= yStep (Abs temp4))
			(= temp0 (- sTop (* temp5 yStep)))
			(= temp1 (CelHigh sliderView sliderLoop sliderCel))
			(= sTop
				(cond 
					((< temp0 minY) minY)
					((> temp0 maxY) maxY)
					(else temp0)
				)
			)
			(= temp2 (PicNotValid))
			(PicNotValid 1)
			(DrawCel view loop cel nsLeft nsTop -1)
			(DrawCel sliderView sliderLoop sliderCel sLeft sTop -1)
			(Graph
				grUPDATE_BOX
				(- nsTop 1)
				(- nsLeft 1)
				(+ 2 nsBottom)
				(+ 2 nsRight)
				1
			)
			(PicNotValid temp2)
			(= temp3 (self posnToValue: sTop))
			(= temp6
				(if temp7 (self doit: temp3) else (self doit:))
			)
			(= temp4 (- temp4 (* yStep temp5)))
		)
		(return temp6)
	)
	
	(method (valueToPosn param1 &tmp temp0)
		(return
			(cond 
				(
					(and
						(<
							(= temp0 (if argc param1 else (self doit:)))
							topValue
						)
						(< temp0 bottomValue)
					)
					(if (< bottomValue topValue) maxY else minY)
				)
				((and (> temp0 topValue) (> temp0 bottomValue)) (if (< bottomValue topValue) minY else maxY))
				(else
					(+
						minY
						(/
							(* (Abs (- topValue temp0)) (- maxY minY))
							(Abs (- topValue bottomValue))
						)
					)
				)
			)
		)
	)
	
	(method (posnToValue param1)
		(return
			(+
				bottomValue
				(/
					(* (- maxY param1) (- topValue bottomValue))
					(- maxY minY)
				)
			)
		)
	)
)

(class GameControls of IconBar
	(properties
		elements 0
		size 0
		height 200
		underBits 0
		oldMouseX 0
		oldMouseY 0
		curIcon 0
		highlightedIcon 0
		prevIcon 0
		curInvIcon 0
		useIconItem 0
		helpIconItem 0
		port 0
		window 0
		state $0000
		activateHeight 0
		y 0
		okButton 0
	)
	
	(method (show &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(gNewSounds pause:)
		(if (and global77 (global77 respondsTo: #stop))
			(global77 stop:)
		)
		(= temp5 (PicNotValid))
		(PicNotValid 1)
		(= state (| state $0020))
		(if (IsObject window)
			(window open:)
		else
			(= window
				((global38 new:)
					top: 46
					left: 24
					bottom: 155
					right: 296
					priority: 15
					open:
					yourself:
				)
			)
		)
		(= temp0 30)
		(= temp1 30)
		(= temp2 (FirstNode elements))
		(while temp2
			(= temp3 (NextNode temp2))
			(if (not (IsObject (= temp4 (NodeValue temp2))))
				(return)
			)
			(if
				(and
					(not (& (temp4 signal?) $0080))
					(<= (temp4 nsRight?) 0)
				)
				(temp4 show: temp0 temp1)
				(= temp0 (+ 20 (temp4 nsRight?)))
			else
				(temp4 show:)
			)
			(= temp2 temp3)
		)
		(PicNotValid temp5)
		(if (not okButton)
			(= okButton (NodeValue (self first:)))
		)
		(Graph
			grUPDATE_BOX
			0
			0
			(- (window bottom?) (window top?))
			(- (window right?) (window left?))
			1
		)
		(if curIcon
			(global1
				setCursor:
					global19
					1
					(+
						(curIcon nsLeft?)
						(/ (- (curIcon nsRight?) (curIcon nsLeft?)) 2)
					)
					(- (curIcon nsBottom?) 3)
			)
		)
		(self doit: hide:)
	)
	
	(method (hide)
		(if window (window dispose:))
		(if (& state $0020)
			(gNewSounds pause: 0)
			(= state (& state $ffdf))
		)
	)
	
	(method (select param1 param2)
		(param1 select: (if (>= argc 2) param2 else 0))
	)
	
	(method (swapCurIcon)
	)
	
	(method (advanceCurIcon &tmp temp0)
	)
	
	(method (dispatchEvent pEvent &tmp temp0 temp1 temp2)
		(return
			(cond 
				(
					(and
						(& (pEvent type?) $4000)
						(== (pEvent message?) JOY_DOWNLEFT)
					)
					(= temp1 (self firstTrue: #onMe pEvent))
					(pEvent dispose:)
					(if (and temp1 (temp1 helpStr?))
						(= temp2 (GetPort))
						(if (global38 respondsTo: #eraseOnly)
							(= temp0 (global38 eraseOnly?))
							(global38 eraseOnly: 1)
							(proc255_4 934 0 (temp1 helpStr?))
							(global38 eraseOnly: temp0)
						else
							(proc255_4 934 0 (temp1 helpStr?))
						)
						(SetPort temp2)
					)
					(if helpIconItem
						(helpIconItem signal: (& (helpIconItem signal?) $ffef))
					)
					(global1 setCursor: 999)
					(return 0)
				)
				((& (pEvent type?) evJOYSTICK)
					(switch (pEvent message?)
						(JOY_DOWN
							(pEvent dispose:)
							(cond 
								(
									(and
										(IsObject highlightedIcon)
										(highlightedIcon respondsTo: #retreat)
									)
									(highlightedIcon retreat:)
									(return 0)
								)
								(
									(or
										(not (IsObject highlightedIcon))
										(& (highlightedIcon signal?) $0100)
									)
									(self advance:)
									(return 0)
								)
							)
						)
						(JOY_UP
							(pEvent dispose:)
							(cond 
								(
									(and
										(IsObject highlightedIcon)
										(highlightedIcon respondsTo: #advance)
									)
									(highlightedIcon advance:)
									(return 0)
								)
								(
									(or
										(not (IsObject highlightedIcon))
										(& (highlightedIcon signal?) $0100)
									)
									(self retreat:)
									(return 0)
								)
							)
						)
						(else 
							(super dispatchEvent: pEvent)
						)
					)
				)
				(else (super dispatchEvent: pEvent))
			)
		)
	)
)

(class ControlIcon of IconI
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		theObj 0
		selector 0
	)
	
	(method (select)
		(if theObj
			(if (super select: &rest)
				(if (& signal $0040)
					((if global63 else GameControls) hide:)
				)
				(proc999_7 theObj selector)
			)
		else
			(super select: &rest)
		)
	)
)
