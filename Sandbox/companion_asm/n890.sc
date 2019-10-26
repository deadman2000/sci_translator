;;; Sierra Script 1.0 - (do not remove this comment)
(script# 890)
(include sci.sh)
(use n992)


(class SlowDown of MoveTo
	(properties
		client 0
		caller 0
		x 0
		y 0
		dx 0
		dy 0
		b-moveCnt 0
		b-i1 0
		b-i2 0
		b-di 0
		b-xAxis 0
		b-incr 0
		completed 0
		xLast 0
		yLast 0
		cycleSpeed 12
		moveSpeed 12
		cycleCnt 4
		oldCycSpd 0
		oldMvSpd 0
	)
	
	(method (init param1 param2 param3 param4 param5 param6 param7 param8)
		(asm
			lsp      argc
			ldi      5
			ge?     
			bnt      code_0028
			lap      param5
			aTop     cycleSpeed
			lsp      argc
			ldi      6
			ge?     
			bnt      code_0028
			lap      param6
			aTop     moveSpeed
			lsp      argc
			ldi      7
			ge?     
			bnt      code_0028
			lap      param7
			aTop     cycleCnt
code_0028:
			pushi    #init
			pushi    4
			lsp      param1
			lsp      param2
			lsp      param3
			lsp      param4
			&rest    param8
			super    MoveTo,  12
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			aTop     oldCycSpd
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			aTop     oldMvSpd
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    1
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pToa     x
			sub     
			push    
			callk    Abs,  2
			push    
			pTos     cycleCnt
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			mul     
			le?     
			bnt      code_009a
			pushi    1
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pToa     y
			sub     
			push    
			callk    Abs,  2
			push    
			pTos     cycleCnt
			pushi    #yStep
			pushi    0
			pToa     client
			send     4
			mul     
			le?     
			bnt      code_009a
			pushi    #cycleSpeed
			pushi    1
			pTos     cycleSpeed
			pushi    56
			pushi    1
			pTos     moveSpeed
			pToa     client
			send     12
code_009a:
			pushi    #doit
			pushi    0
			&rest    param1
			super    MoveTo,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #cycleSpeed
			pushi    1
			pTos     oldCycSpd
			pushi    56
			pushi    1
			pTos     oldMvSpd
			pToa     client
			send     12
			pushi    #dispose
			pushi    0
			&rest    param1
			super    MoveTo,  4
			ret     
		)
	)
)
