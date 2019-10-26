;;; Sierra Script 1.0 - (do not remove this comment)
(script# 255)
(include sci.sh)
(use n000)
(use n999)

(public
	proc255_0 0
	proc255_1 1
	proc255_2 2
	proc255_3 3
	proc255_4 4
	proc255_5 5
)

(procedure (proc255_0 param1 &tmp newDialog newDText_2 newDIcon newDEdit temp4 temp5 temp6 temp7 temp8 theNewDialog temp10 temp11 [newDButton 6] temp18 temp19 temp20 [temp21 1001] temp1022 newDText temp1024 temp1025 temp1026 temp1027 temp1028 temp1029 temp1030 temp1031 temp1032)
	(= temp1028 0)
	(= temp1029 0)
	(= temp6 (= temp7 -1))
	(= temp1026 (global1 printLang?))
	(= temp1027 (global1 subtitleLang?))
	(= temp1032
		(= theNewDialog
			(= temp8
				(= temp18
					(= newDIcon
						(= newDEdit (= newDText (= temp1030 (= temp19 0))))
					)
				)
			)
		)
	)
	((= newDialog (Dialog new:))
		window: global38
		name: {PrintD}
	)
	(cond 
		((u< [param1 0] 1000) (GetFarText [param1 0] [param1 1] @temp21) (= temp5 2))
		([param1 0] (StrCpy @temp21 [param1 0]) (= temp5 1))
		(else (= temp21 0) (= temp5 0))
	)
	(= temp1022 0)
	(while (StrAt @temp21 temp1022)
		(if
			(and
				(== (StrAt @temp21 temp1022) 14848)
				(== (StrAt @temp21 (+ 1 temp1022)) 74)
			)
			(global1 printLang: 1 subtitleLang: 81)
			(kernel_123 @temp21 @temp21 {#J})
			(global1 printLang: temp1026 subtitleLang: temp1027)
			(StrAt @temp21 temp1022 0)
			(if (proc999_5 81 temp1026 temp1027)
				((= newDText (DText new:))
					text: (+ @temp21 2 temp1022)
					font: 900
					name: {jDText}
				)
			)
		)
		(++ temp1022)
	)
	((= newDText_2 (DText new:))
		text: @temp21
		font: global22
	)
	(= temp1024
		(if (and newDText (== temp1026 81))
			newDText
		else
			newDText_2
		)
	)
	(= temp1025
		(cond 
			((== temp1027 81) newDText)
			(newDText
				(if temp1027
					newDText_2
				else
					(newDText_2 dispose:)
					(= newDText_2 0)
				)
			)
		)
	)
	(temp1024 moveTo: 4 4 setSize:)
	(newDialog add: temp1024 setSize:)
	(if temp1025
		(temp1025
			setSize:
			moveTo: (temp1024 nsLeft?) (+ 4 (temp1024 nsBottom?))
		)
		(newDialog add: temp1025 setSize:)
	)
	(= temp5 temp5)
	(while (< temp5 argc)
		(switch [param1 temp5]
			(30
				(++ temp5)
				(if (and newDText_2 (not temp1025))
					(newDText_2 mode: [param1 temp5])
				)
			)
			(33
				(++ temp5)
				(if newDText_2
					(newDText_2 font: [param1 temp5] setSize: temp8)
				)
			)
			(70
				(= temp1028 1)
				(= temp8 [param1 (++ temp5)])
				(temp1024 setSize: temp8)
				(if temp1025
					(temp1025
						setSize: temp8
						moveTo: (temp1024 nsLeft?) (+ 4 (temp1024 nsBottom?))
					)
				)
			)
			(25
				(newDialog time: [param1 (++ temp5)])
			)
			(80
				(newDialog text: [param1 (++ temp5)])
			)
			(67
				(= temp6 [param1 (++ temp5)])
				(= temp7 [param1 (++ temp5)])
			)
			(83
				(Animate (gNewCast elements?) 0)
			)
			(41
				((= newDEdit (DEdit new:)) text: [param1 (++ temp5)])
				(newDEdit max: [param1 (++ temp5)] setSize:)
			)
			(81
				((= [newDButton temp19] (DButton new:))
					text: [param1 (++ temp5)]
					value: [param1 (++ temp5)]
					setSize:
				)
				(= temp18 (+ temp18 ([newDButton temp19] nsRight?) 4))
				(++ temp19)
			)
			(82
				(= temp1029 1)
				(if (IsObject [param1 (+ temp5 1)])
					((= newDIcon ([param1 (+ temp5 1)] new:)) setSize:)
					(= temp5 (+ temp5 1))
				else
					(= newDIcon (DIcon new:))
					(newDIcon
						view: [param1 (+ temp5 1)]
						loop: [param1 (+ temp5 2)]
						cel: [param1 (+ temp5 3)]
						setSize:
					)
					(= temp5 (+ temp5 3))
				)
			)
			(108
				(if
					(and
						(< (+ temp5 1) argc)
						(IsObject [param1 (+ temp5 1)])
					)
					(newDialog caller: [param1 (+ temp5 1)])
					(++ temp5)
				)
				(if (!= 0 81)
					(if gTheNewDialog (gTheNewDialog dispose:))
					(= theNewDialog newDialog)
				)
			)
			(35
				(newDialog window: [param1 (++ temp5)])
			)
			(121 (= temp1032 1))
		)
		(++ temp5)
	)
	(if temp1032 (= theNewDialog 0))
	(if
		(and
			(not (if temp1028 else temp1029))
			(> (- (newDialog nsBottom?) (newDialog nsTop?)) 100)
		)
		(temp1024 setSize: 300)
		(if temp1025
			(temp1025
				setSize: 300
				moveTo: (temp1024 nsLeft?) (+ 4 (temp1024 nsBottom?))
			)
		)
	)
	(if newDIcon
		(newDIcon moveTo: 4 4)
		(if
		(or (== temp1024 newDText) (== temp1025 newDText))
			(= temp1030 8)
		)
		(if (& (newDIcon state?) $0010)
			(temp1024
				moveTo: (+ 4 temp1030) (+ (newDIcon nsBottom?) (temp1024 nsTop?))
				setSize:
			)
		else
			(temp1024
				moveTo: (+ 4 (newDIcon nsRight?) temp1030) (temp1024 nsTop?)
				setSize:
			)
		)
		(if temp1025
			(temp1025
				moveTo: (temp1024 nsLeft?) (+ 4 (temp1024 nsBottom?))
			)
		)
		(newDialog add: newDIcon)
	)
	(newDialog setSize:)
	(if newDEdit
		(newDEdit
			moveTo:
				((if temp1025 else temp1024) nsLeft?)
				(+ 4 ((if temp1025 else temp1024) nsBottom?))
		)
		(newDialog add: newDEdit setSize:)
	)
	(= temp20
		(if (> temp18 (newDialog nsRight?))
			4
		else
			(- (newDialog nsRight?) temp18)
		)
	)
	(= temp5 0)
	(while (< temp5 temp19)
		([newDButton temp5] moveTo: temp20 (newDialog nsBottom?))
		(newDialog add: [newDButton temp5])
		(= temp20 (+ 4 ([newDButton temp5] nsRight?)))
		(++ temp5)
	)
	(newDialog setSize: center:)
	(if
		(or
			(and newDIcon (& (newDIcon state?) $0010))
			(and newDIcon (not (StrLen @temp21)))
		)
		(newDIcon
			moveTo:
				(/
					(-
						(- (newDialog nsRight?) (newDialog nsLeft?))
						(- (newDIcon nsRight?) (newDIcon nsLeft?))
					)
					2
				)
				4
		)
	)
	(newDialog
		moveTo:
			(if (== -1 temp6) (newDialog nsLeft?) else temp6)
			(if (== -1 temp7) (newDialog nsTop?) else temp7)
	)
	(= temp11 (GetPort))
	(newDialog
		open: (if (newDialog text?) 4 else 0) (if theNewDialog 15 else -1)
	)
	(if theNewDialog
		(= global41 (GetPort))
		(SetPort temp11)
		(return (= gTheNewDialog theNewDialog))
	else
		(global8 pause: 1)
	)
	(if
		(and
			(= temp10 (newDialog firstTrue: #checkState 1))
			(not (newDialog firstTrue: #checkState 2))
		)
		(temp10 state: (| (temp10 state?) $0002))
	)
	(if (== (= temp4 (newDialog doit: temp10)) -1)
		(= temp4 0)
	)
	(= temp5 0)
	(while (< temp5 temp19)
		(breakif (== temp4 [newDButton temp5]))
		(++ temp5)
	)
	(if (not (newDialog theItem?)) (= temp4 1))
	(newDialog dispose:)
	(global8 pause: 0)
	(return temp4)
)

(procedure (proc255_1 param1 param2 param3 param4)
	(proc255_0 param1 82 param2 param3 param4 &rest)
)

(procedure (proc255_2 param1 param2 param3 &tmp [temp0 4])
	(if
		(proc255_0
			(if (>= argc 3) param3 else {})
			41
			param1
			param2
			&rest
		)
		(StrLen param1)
	)
)

(procedure (proc255_3 param1 param2 &tmp [temp0 40])
	(= temp0 0)
	(if (> argc 1) (Format @temp0 255 0 param2))
	(return
		(if (proc255_2 @temp0 5 param1)
			(ReadNumber @temp0)
		else
			-1
		)
	)
)

(procedure (proc255_4 &tmp [temp0 500])
	(Format @temp0 &rest)
	(proc255_0 @temp0)
)

(procedure (proc255_5 param1 param2)
	(return
		(if
			(and
				(< (param1 nsLeft?) (param2 x?))
				(< (param2 x?) (param1 nsRight?))
				(< (param1 nsTop?) (param2 y?))
			)
			(< (param2 y?) (param1 nsBottom?))
		else
			0
		)
	)
)

(procedure (localproc_0022 &tmp newEvent temp1)
	(= temp1 (!= ((= newEvent (Event new:)) type?) 2))
	(newEvent dispose:)
	(return temp1)
)

(class Class_255_0 of Obj
	(properties
		state $0000
	)
	
	(method (draw)
		(= state 1)
		(DrawMenuBar 1)
	)
	
	(method (hide)
		(DrawMenuBar 0)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1)
		(= temp0 0)
		(if state
			(= temp1 (Joystick 12 30))
			(= temp0 (MenuSelect pEvent &rest))
			(Joystick 12 temp1)
		)
		(return temp0)
	)
	
	(method (add)
		(AddMenu &rest)
	)
)

(class Class_255_1 of Obj
	(properties
		type $0000
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
	)
	
	(method (doit)
		(return value)
	)
	
	(method (enable param1)
		(if param1
			(= state (| state $0001))
		else
			(= state (& state $fffe))
		)
	)
	
	(method (select param1)
		(if param1
			(= state (| state $0008))
		else
			(= state (& state $fff7))
		)
		(self draw:)
	)
	
	(method (handleEvent pEvent &tmp temp0 pEventType temp2)
		(if (pEvent claimed?) (return 0))
		(= temp0 0)
		(if
			(and
				(& state $0001)
				(or
					(and
						(== (= pEventType (pEvent type?)) 128)
						(Said said)
					)
					(and
						(== pEventType evKEYBOARD)
						(== (pEvent message?) key)
					)
					(and (== pEventType evMOUSEBUTTON) (self check: pEvent))
				)
			)
			(pEvent claimed: 1)
			(= temp0 (self track: pEvent))
		)
		(return temp0)
	)
	
	(method (check param1)
		(return
			(if
				(and
					(>= (param1 x?) nsLeft)
					(>= (param1 y?) nsTop)
					(< (param1 x?) nsRight)
				)
				(< (param1 y?) nsBottom)
			else
				0
			)
		)
	)
	
	(method (track param1 &tmp temp0 temp1)
		(return
			(if (== 1 (param1 type?))
				(= temp1 0)
				(repeat
					((= param1 (Event new: -32768)) localize:)
					(if (!= (= temp0 (self check: param1)) temp1)
						(HiliteControl self)
						(= temp1 temp0)
					)
					(param1 dispose:)
					(breakif (not (localproc_0022)))
				)
				(if temp0 (HiliteControl self))
				(return temp0)
			else
				(return self)
			)
		)
	)
	
	(method (setSize)
	)
	
	(method (move param1 param2)
		(= nsRight (+ nsRight param1))
		(= nsLeft (+ nsLeft param1))
		(= nsTop (+ nsTop param2))
		(= nsBottom (+ nsBottom param2))
	)
	
	(method (moveTo param1 param2)
		(self move: (- param1 nsLeft) (- param2 nsTop))
	)
	
	(method (draw)
		(DrawControl self)
	)
	
	(method (isType param1)
		(return (== type param1))
	)
	
	(method (checkState param1)
		(return (& state param1))
	)
	
	(method (cycle)
	)
)

(class DText of Class_255_1
	(properties
		type $0002
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		text 0
		font 1
		mode 0
	)
	
	(method (new &tmp temp0)
		((super new:) font: global22 yourself:)
	)
	
	(method (setSize param1 &tmp [temp0 4])
		(TextSize
			@[temp0
			0]
			text
			font
			(if argc param1 else 0)
			{\n----------\n}
		)
		(= nsBottom (+ nsTop [temp0 2]))
		(= nsRight (+ nsLeft [temp0 3]))
	)
)

(class DIcon of Class_255_1
	(properties
		type $0004
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		view 0
		loop 0
		cel 0
	)
	
	(method (setSize &tmp [temp0 4])
		(= nsRight (+ nsLeft (CelWide view loop cel)))
		(= nsBottom (+ nsTop (CelHigh view loop cel)))
	)
)

(class DButton of Class_255_1
	(properties
		type $0001
		state $0003
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		text 0
		font 0
	)
	
	(method (setSize &tmp [temp0 4])
		(TextSize @[temp0 0] text font 0 0)
		(= [temp0 2] (+ [temp0 2] 2))
		(= [temp0 3] (+ [temp0 3] 2))
		(= nsBottom (+ nsTop [temp0 2]))
		(= [temp0 3] (* (/ (+ [temp0 3] 15) 16) 16))
		(= nsRight (+ [temp0 3] nsLeft))
	)
)

(class DEdit of Class_255_1
	(properties
		type $0003
		state $0001
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		text 0
		font 0
		max 0
		cursor 0
	)
	
	(method (track param1)
		(EditControl self param1)
		(return self)
	)
	
	(method (setSize &tmp [temp0 4])
		(= font gFont)
		(TextSize @[temp0 0] {M} font 0 0)
		(= nsBottom (+ nsTop [temp0 2]))
		(= nsRight (+ nsLeft (/ (* [temp0 3] max 3) 4)))
		(= cursor (StrLen text))
	)
)

(class DSelector of Class_255_1
	(properties
		type $0006
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		font 0
		x 20
		y 6
		text 0
		cursor 0
		topString 0
		mark 0
	)
	
	(method (handleEvent pEvent &tmp temp0 [temp1 3] temp4 [temp5 4])
		(if (pEvent claimed?) (return 0))
		(= temp0 0)
		(switch (pEvent type?)
			(evKEYBOARD
				(pEvent
					claimed:
						(switch (pEvent message?)
							(KEY_NUMPAD7 (self retreat: 50))
							(KEY_NUMPAD1 (self advance: 50))
							(KEY_PAGEUP
								(self advance: (- y 1))
							)
							(KEY_PAGEDOWN
								(self retreat: (- y 1))
							)
							(KEY_NUMPAD2 (self advance: 1))
							(KEY_UP (self retreat: 1))
							(else  0)
						)
				)
			)
			(evMOUSEBUTTON
				(if (self check: pEvent)
					(pEvent claimed: 1)
					(cond 
						((< (pEvent y?) (+ nsTop 10))
							(repeat
								(self retreat: 1)
								(breakif (not (localproc_0022)))
							)
						)
						((> (pEvent y?) (- nsBottom 10))
							(repeat
								(self advance: 1)
								(breakif (not (localproc_0022)))
							)
						)
						(else
							(TextSize @[temp5 0] {M} font 0 0)
							(if
								(>
									(= temp4 (/ (- (pEvent y?) (+ nsTop 10)) [temp5 2]))
									mark
								)
								(self advance: (- temp4 mark))
							else
								(self retreat: (- mark temp4))
							)
						)
					)
				)
			)
		)
		(return
			(if (and (pEvent claimed?) (& state $0002))
				self
			else
				0
			)
		)
	)
	
	(method (setSize &tmp [temp0 4])
		(TextSize @[temp0 0] {M} font 0 0)
		(= nsBottom (+ nsTop 20 (* [temp0 2] y)))
		(= nsRight (+ nsLeft (/ (* [temp0 3] x 3) 4)))
		(= topString (= cursor text))
		(= mark 0)
	)
	
	(method (indexOf param1 &tmp theText temp1)
		(= theText text)
		(= temp1 0)
		(return
			(while (< temp1 300)
				(if (== 0 (StrLen theText)) (return -1))
				(if (not (StrCmp param1 theText)) (return temp1))
				(= theText (+ theText x))
				(++ temp1)
			)
		)
	)
	
	(method (at param1)
		(return (+ text (* x param1)))
	)
	
	(method (advance param1 &tmp temp0)
		(if (not (StrAt cursor 0))
			(return (not (StrAt cursor 0)))
		)
		(= temp0 0)
		(while (and param1 (StrAt cursor x))
			(= temp0 1)
			(= cursor (+ cursor x))
			(if (< (+ mark 1) y)
				(++ mark)
			else
				(= topString (+ topString x))
			)
			(-- param1)
		)
		(return (if temp0 (self draw:) 1 else 0))
	)
	
	(method (retreat param1 &tmp temp0)
		(= temp0 0)
		(while (and param1 (!= cursor text))
			(= temp0 1)
			(= cursor (- cursor x))
			(if mark (-- mark) else (= topString (- topString x)))
			(-- param1)
		)
		(return (if temp0 (self draw:) 1 else 0))
	)
)

(class Dialog of List
	(properties
		elements 0
		size 0
		text 0
		window 0
		theItem 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		time 0
		busy 0
		caller 0
		seconds 0
		lastSeconds 0
	)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(= global88 (+ global86 (GetTime)))
		(= temp0 0)
		(= busy 1)
		(self eachElementDo: #init)
		(if theItem (theItem select: 0))
		(= theItem
			(if (and argc param1)
				param1
			else
				(self firstTrue: #checkState 1)
			)
		)
		(if theItem (theItem select: 1))
		(if (not theItem)
			(= temp3 global79)
			(= temp4 (GetTime))
		else
			(= temp3 0)
		)
		(= temp2 0)
		(while (not temp2)
			(= global88 (+ global86 (GetTime)))
			(self eachElementDo: #cycle)
			(= temp1 ((Event new:) localize:))
			(if temp3
				(-- temp3)
				(if (== (temp1 type?) 1) (temp1 type: 0))
				(while (== temp4 (GetTime))
				)
				(= temp4 (GetTime))
			)
			(= temp2 (self handleEvent: temp1))
			(temp1 dispose:)
			(self check:)
			(breakif (or (== temp2 -1) (not busy)))
			(Wait 1)
		)
		(= busy 0)
		(return temp2)
	)
	
	(method (dispose &tmp theCaller)
		(self eachElementDo: #dispose release:)
		(if (== self gTheNewDialog)
			(SetPort global41)
			(= gTheNewDialog 0)
			(= global41 0)
		)
		(if window (window dispose:))
		(= theItem (= window 0))
		(= theCaller caller)
		(super dispose:)
		(if theCaller (theCaller cue:))
	)
	
	(method (open param1 param2)
		(if (and (PicNotValid) gNewCast)
			(Animate (gNewCast elements?) 0)
		)
		(= window (window new:))
		(window
			top: nsTop
			left: nsLeft
			bottom: nsBottom
			right: nsRight
			title: text
			type: param1
			priority: param2
			open:
		)
		(= seconds time)
		(self draw:)
	)
	
	(method (draw)
		(self eachElementDo: #draw)
	)
	
	(method (cue)
		(if (not busy) (self dispose:) else (= busy 0))
	)
	
	(method (advance &tmp temp0 dialogFirst)
		(if theItem
			(theItem select: 0)
			(= dialogFirst (self contains: theItem))
			(repeat
				(if (not (= dialogFirst (self next: dialogFirst)))
					(= dialogFirst (self first:))
				)
				(= theItem (NodeValue dialogFirst))
				(breakif (& (theItem state?) $0001))
			)
			(theItem select: 1)
			(global1
				setCursor:
					global19
					1
					(+
						(theItem nsLeft?)
						(/ (- (theItem nsRight?) (theItem nsLeft?)) 2)
					)
					(- (theItem nsBottom?) 3)
			)
		)
	)
	
	(method (retreat &tmp temp0 dialogLast)
		(if theItem
			(theItem select: 0)
			(= dialogLast (self contains: theItem))
			(repeat
				(if (not (= dialogLast (self prev: dialogLast)))
					(= dialogLast (self last:))
				)
				(= theItem (NodeValue dialogLast))
				(breakif (& (theItem state?) $0001))
			)
			(theItem select: 1)
			(global1
				setCursor:
					global19
					1
					(+
						(theItem nsLeft?)
						(/ (- (theItem nsRight?) (theItem nsLeft?)) 2)
					)
					(- (theItem nsBottom?) 3)
			)
		)
	)
	
	(method (move param1 param2)
		(= nsRight (+ nsRight param1))
		(= nsLeft (+ nsLeft param1))
		(= nsTop (+ nsTop param2))
		(= nsBottom (+ nsBottom param2))
	)
	
	(method (moveTo param1 param2)
		(self move: (- param1 nsLeft) (- param2 nsTop))
	)
	
	(method (center)
		(self
			moveTo:
				(+
					(window brLeft?)
					(/
						(-
							(- (window brRight?) (window brLeft?))
							(- nsRight nsLeft)
						)
						2
					)
				)
				(+
					(window brTop?)
					(/
						(-
							(- (window brBottom?) (window brTop?))
							(- nsBottom nsTop)
						)
						2
					)
				)
		)
	)
	
	(method (setSize &tmp dialogFirst temp1 [theNsTop 4])
		(if text
			(TextSize @[theNsTop 0] text 0 -1 0)
			(= nsTop [theNsTop 0])
			(= nsLeft [theNsTop 1])
			(= nsBottom [theNsTop 2])
			(= nsRight [theNsTop 3])
		else
			(= nsRight (= nsBottom (= nsLeft (= nsTop 0))))
		)
		(= dialogFirst (self first:))
		(while dialogFirst
			(if
			(< ((= temp1 (NodeValue dialogFirst)) nsLeft?) nsLeft)
				(= nsLeft (temp1 nsLeft?))
			)
			(if (< (temp1 nsTop?) nsTop) (= nsTop (temp1 nsTop?)))
			(if (> (temp1 nsRight?) nsRight)
				(= nsRight (temp1 nsRight?))
			)
			(if (> (temp1 nsBottom?) nsBottom)
				(= nsBottom (temp1 nsBottom?))
			)
			(= dialogFirst (self next: dialogFirst))
		)
		(= nsRight (+ nsRight 4))
		(= nsBottom (+ nsBottom 4))
		(self moveTo: 0 0)
	)
	
	(method (handleEvent pEvent &tmp theTheItem)
		(if (& (pEvent type?) evJOYSTICK)
			(pEvent type: 4)
			(switch (pEvent message?)
				(JOY_DOWN
					(pEvent message: 20480)
				)
				(JOY_UP (pEvent message: 18432))
				(JOY_LEFT
					(pEvent message: 19200)
				)
				(JOY_RIGHT
					(pEvent message: 19712)
				)
				(else  (pEvent type: 64))
			)
		)
		(if
			(or
				(pEvent claimed?)
				(== (pEvent type?) evNULL)
				(and
					(!= evMOUSEBUTTON (pEvent type?))
					(!= evKEYBOARD (pEvent type?))
					(!= evJOYSTICK (pEvent type?))
					(!= evJOYDOWN (pEvent type?))
				)
			)
			(EditControl theItem pEvent)
			(return 0)
		)
		(if
		(= theTheItem (self firstTrue: #handleEvent pEvent))
			(EditControl theItem 0)
			(if (not (theTheItem checkState: 2))
				(if theItem (theItem select: 0))
				((= theItem theTheItem) select: 1)
				(theTheItem doit:)
				(= theTheItem 0)
			)
		else
			(= theTheItem 0)
			(cond 
				(
					(and
						(or
							(== (pEvent type?) evJOYDOWN)
							(and
								(== evKEYBOARD (pEvent type?))
								(== KEY_RETURN (pEvent message?))
							)
						)
						theItem
						(theItem checkState: 1)
					)
					(= theTheItem theItem)
					(EditControl theItem 0)
					(pEvent claimed: 1)
				)
				(
					(or
						(and
							(not (self firstTrue: #checkState 1))
							(or
								(and
									(== evKEYBOARD (pEvent type?))
									(== KEY_RETURN (pEvent message?))
								)
								(== evMOUSEBUTTON (pEvent type?))
								(== evJOYDOWN (pEvent type?))
							)
						)
						(and
							(== evKEYBOARD (pEvent type?))
							(== KEY_ESCAPE (pEvent message?))
						)
					)
					(pEvent claimed: 1)
					(= theTheItem -1)
				)
				(
					(and
						(IsObject theItem)
						(theItem isType: 3)
						(== (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RIGHT)
					)
					(if
					(>= (theItem cursor?) (StrLen (theItem text?)))
						(self advance:)
					else
						(EditControl theItem pEvent)
					)
				)
				(
					(and
						(IsObject theItem)
						(theItem isType: 3)
						(== (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_NUMPAD4)
					)
					(if (<= (theItem cursor?) 0)
						(self retreat:)
					else
						(EditControl theItem pEvent)
					)
				)
				(
					(and
						(== evKEYBOARD (pEvent type?))
						(proc999_5 (pEvent message?) 9 19712 20480)
					)
					(pEvent claimed: 1)
					(self advance:)
				)
				(
					(and
						(== evKEYBOARD (pEvent type?))
						(proc999_5 (pEvent message?) 3840 19200 18432)
					)
					(pEvent claimed: 1)
					(self retreat:)
				)
				(else (EditControl theItem pEvent))
			)
		)
		(return theTheItem)
	)
	
	(method (check &tmp theLastSeconds)
		(if
			(and
				seconds
				(!= lastSeconds (= theLastSeconds (GetTime 1)))
			)
			(= lastSeconds theLastSeconds)
			(if (not (-- seconds)) (self cue:))
		)
	)
)

(class Controls of List
	(properties
		elements 0
		size 0
	)
	
	(method (draw)
		(self eachElementDo: #setSize)
		(self eachElementDo: #draw)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(if (pEvent claimed?) (return 0))
		(if
			(and
				(= temp0 (self firstTrue: #handleEvent pEvent))
				(not
					((= temp0 (self firstTrue: #handleEvent pEvent))
						checkState: 2
					)
				)
			)
			(temp0 doit:)
			(= temp0 0)
		)
		(return temp0)
	)
)
