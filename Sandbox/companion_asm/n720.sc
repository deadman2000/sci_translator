;;; Sierra Script 1.0 - (do not remove this comment)
(script# 720)
(include sci.sh)
(use n994)
(use n999)

(public
	theTower 0
)

(class theTower of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		climbing 0
		outBoat 0
		ivyDone 0
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    4
			lsp      newRoomNumber
			pushi    701
			pushi    702
			pushi    705
			calle    proc999_5,  8
			not     
			bnt      code_002c
			pushi    #keep
			pushi    1
			pushi    0
			self     6
code_002c:
			ret     
		)
	)
)
