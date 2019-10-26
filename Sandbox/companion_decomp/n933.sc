;;; Sierra Script 1.0 - (do not remove this comment)
(script# 933)
(include sci.sh)
(use n000)
(use n999)


(class PseudoMouse of Code
	(properties
		cursorInc 2
		minInc 2
		maxInc 20
		prevDir 0
		joyInc 5
	)
	
	(method (doit &tmp temp0 temp1)
		(= temp0 (global24 x?))
		(= temp1 (global24 y?))
		(switch prevDir
			(1
				(= temp1 (- temp1 cursorInc))
			)
			(2
				(= temp0 (+ temp0 cursorInc))
				(= temp1 (- temp1 cursorInc))
			)
			(3
				(= temp0 (+ temp0 cursorInc))
			)
			(4
				(= temp0 (+ temp0 cursorInc))
				(= temp1 (+ temp1 cursorInc))
			)
			(5
				(= temp1 (+ temp1 cursorInc))
			)
			(6
				(= temp0 (- temp0 cursorInc))
				(= temp1 (+ temp1 cursorInc))
			)
			(7
				(= temp0 (- temp0 cursorInc))
			)
			(8
				(= temp0 (- temp0 cursorInc))
				(= temp1 (- temp1 cursorInc))
			)
		)
		(global1 setCursor: global19 1 temp0 temp1)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(global80 canInput:)
				(& (pEvent type?) evJOYSTICK)
			)
			(= prevDir
				(if
					(or
						(not gIconBar)
						(!= ((gIconBar curIcon?) message?) 1)
					)
					(= prevDir (pEvent message?))
				else
					(return)
				)
			)
			(= cursorInc
				(if (& (pEvent type?) evKEYBOARD)
					(if (& (pEvent modifiers?) emSHIFT) minInc else maxInc)
				else
					joyInc
				)
			)
			(cond 
				((& (pEvent type?) evKEYBOARD)
					(if prevDir
						(self doit:)
					else
						(pEvent claimed: 0)
						(return)
					)
				)
				(prevDir (self start:))
				(else (self stop:))
			)
			(pEvent claimed: 1)
			(return)
		)
	)
	
	(method (start thePrevDir)
		(if argc (= prevDir thePrevDir))
		(global78 add: self)
	)
	
	(method (stop)
		(= prevDir 0)
		(global78 delete: self)
	)
)
