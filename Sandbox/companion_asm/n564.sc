;;; Sierra Script 1.0 - (do not remove this comment)
(script# 564)
(include sci.sh)
(use n994)
(use n999)

(public
	TheDungeon 0
	shortTimer 1
	longTimer 2
	warningTimer 3
)

(class TheDungeon of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		firstLook 1
		coinsLeft 0
		firstShortTimer 0
		boysRescued 0
		firstAfterRescue 1
		timerHasFired 0
		tooLate 0
		longTimerGone 0
		trapDoorOpen 0
		firstTimeOpened 1
		timeToDie 0
		guardsGone 0
		neverBefore 1
		numberCoins 0
		valueCoins 0
		doneTalking 0
		coinsDoneBeenTook 0
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    6
			lsp      newRoomNumber
			pushi    550
			pushi    560
			pushi    561
			pushi    562
			pushi    570
			calle    proc999_5,  12
			not     
			bnt      code_003e
			pushi    #keep
			pushi    1
			pushi    0
			self     6
code_003e:
			ret     
		)
	)
)

(instance shortTimer of Script
	(properties
		seconds 15
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_00f5
			pushi    #seconds
			pushi    1
			pushi    15
			lofsa    warningTimer
			send     6
			pushi    #setScript
			pushi    1
			lofsa    warningTimer
			push    
			class    TheDungeon
			send     6
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_00f5:
			toss    
			ret     
		)
	)
)

(instance longTimer of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_016c
			pushi    #seconds
			pushi    1
			pushi    15
			lofsa    warningTimer
			send     6
			pushi    #setScript
			pushi    1
			lofsa    warningTimer
			push    
			class    TheDungeon
			send     6
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #longTimerGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_016c:
			toss    
			ret     
		)
	)
)

(instance warningTimer of Script
	(properties
		seconds 15
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_01cb
			pushi    #guardsGone
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #timeToDie
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_01cb:
			toss    
			ret     
		)
	)
)
