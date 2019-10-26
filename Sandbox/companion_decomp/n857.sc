;;; Sierra Script 1.0 - (do not remove this comment)
(script# 857)
(include sci.sh)
(use n000)
(use n255)
(use n999)


(class GiveOrTakeIcon of DIcon
	(properties
		type $0004
		state $0001
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
		client 0
		dialog 0
		theLastX 0
		theLastY 0
		theLastVal 0
	)
	
	(method (doit)
		(client get: self)
	)
	
	(method (handleEvent pEvent)
		(cond 
			(
				(and
					(or
						(== (pEvent type?) evJOYDOWN)
						(and
							(== (pEvent type?) evKEYBOARD)
							(== (pEvent message?) KEY_RETURN)
						)
					)
					(self check: pEvent)
				)
				(pEvent claimed: 1)
				1
			)
			((== (pEvent type?) evMOUSEBUTTON) (super handleEvent: pEvent &rest))
		)
	)
	
	(method (track newEvent &tmp temp0 temp1 temp2)
		(return
			(if (== 1 (newEvent type?))
				(= temp1 0)
				(repeat
					(= temp2 ((= newEvent (Event new:)) type?))
					(newEvent localize:)
					(if (!= (= temp0 (self check: newEvent)) temp1)
						(self highlight:)
						(= temp1 temp0)
					)
					(newEvent dispose:)
					(breakif (== temp2 2))
				)
				(if temp0 (self highlight:))
				(return temp0)
			else
				(return self)
			)
		)
	)
	
	(method (draw &tmp temp0 temp1 temp2 theTheLastX [temp4 10] [temp14 10] [temp24 4])
		(super draw: &rest)
		(= temp0 (== self (client giver?)))
		(= temp1 ((dialog client?) font?))
		(= temp2
			(if temp0
				((dialog client?) color?)
			else
				((dialog window?) color?)
			)
		)
		(if temp0
			(Format @temp4 {%d} (client taken?))
			(TextSize @temp24 @temp4 temp1)
			(= theTheLastX (+ nsRight 5))
		else
			(Format @temp4 {%d} (client number?))
			(TextSize @temp24 @temp4 temp1)
			(= theTheLastX (- (- nsLeft [temp24 2]) 5))
		)
		(Format @temp14 {%d} theLastVal)
		(Display
			@temp14
			102
			((dialog window?) back?)
			105
			temp1
			100
			theLastX
			theLastY
		)
		(Display
			@temp4
			102
			temp2
			105
			temp1
			100
			(= theLastX theTheLastX)
			(= theLastY (/ (- (+ nsBottom nsTop) [temp24 3]) 2))
		)
		(= theLastVal
			(if temp0 (client taken?) else (client number?))
		)
	)
	
	(method (highlight)
		(return 1)
	)
)

(instance keepButton of DButton
	(properties)
)

(instance giveButton of DButton
	(properties
		value 1
	)
)

(class MoneyDialog of Dialog
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
		margin 30
		taker 0
		giver 0
		client 0
	)
	
	(method (init theClient &tmp temp0 temp1 theClientView theClientLoop newGiveOrTakeIcon temp5 theClientFont temp7)
		(= window
			(if ((= client theClient) window?) else global38)
		)
		(if text
			(window title: text)
		else
			(= text (window title?))
		)
		(= theClientFont (theClient font?))
		(= theClientView (theClient view?))
		(= theClientLoop (theClient loop?))
		(= temp0 0)
		(= temp7 10)
		(while (= temp1 (theClient at: temp0))
			((= newGiveOrTakeIcon (GiveOrTakeIcon new:))
				dialog: self
				client: (= temp1 (theClient at: temp0))
				view: theClientView
				loop: theClientLoop
				cel: 0
				setSize:
				moveTo: margin temp7
			)
			(temp1
				state: 0
				view: theClientView
				loop: theClientLoop
				cel: (+ temp0 2)
				setSize:
				moveTo: (+ 5 (newGiveOrTakeIcon nsRight?)) temp7
				taker: newGiveOrTakeIcon
				giver: (= temp5 (Clone newGiveOrTakeIcon))
				taken: 0
			)
			(temp5
				cel: 1
				setSize:
				moveTo: (+ 5 (temp1 nsRight?)) temp7
			)
			(self add: newGiveOrTakeIcon temp1 temp5)
			(++ temp0)
			(= temp7 (+ 15 (temp1 nsBottom?)))
		)
		(keepButton
			font: theClientFont
			text: (theClient keepStr?)
			setSize:
		)
		(keepButton
			moveTo:
				(-
					(/
						(+
							(newGiveOrTakeIcon nsLeft?)
							(newGiveOrTakeIcon nsRight?)
						)
						2
					)
					(/ (keepButton nsRight?) 2)
				)
				temp7
		)
		(giveButton
			font: theClientFont
			text: (theClient giveStr?)
			setSize:
		)
		(giveButton
			moveTo:
				(-
					(/ (+ (temp5 nsLeft?) (temp5 nsRight?)) 2)
					(/ (giveButton nsRight?) 2)
				)
				temp7
		)
		(self add: keepButton giveButton setSize:)
		(self nsRight: (+ margin nsRight) center:)
	)
	
	(method (doit &tmp temp0 temp1 temp2 temp3)
		(= temp3
			(if
				(or
					(client cursor?)
					((global9 at: (client number?)) cursor?)
				)
			else
				999
			)
		)
		(= temp1 (global1 setCursor: temp3))
		(self open: 4 -1)
		(self eachElementDo: #select)
		(= temp0 (super doit: &rest))
		(if (IsObject temp0) (= temp0 (temp0 value?)))
		(if (not temp0) (client put:))
		(if (client value?)
			(global1 setCursor: temp1)
		else
			(gIconBar curIcon: (= temp2 (gIconBar at: 0)))
			(global1 setCursor: (temp2 cursor?))
		)
	)
	
	(method (dispose)
		(super dispose: &rest)
		(DisposeScript 857)
	)
)
