;;; Sierra Script 1.0 - (do not remove this comment)
(script# 955)
(include sci.sh)
(use n992)


(class Track of Motion
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
		who 0
		xOffset 0
		yOffset 0
		zOffset 0
	)
	
	(method (init param1 param2 param3 param4 param5 param6)
		(asm
			lap      param1
			aTop     client
			lap      param2
			aTop     who
			lsp      argc
			ldi      3
			ge?     
			bnt      code_003c
			lap      param3
			aTop     xOffset
			lsp      argc
			ldi      4
			ge?     
			bnt      code_003c
			lap      param4
			aTop     yOffset
			lsp      argc
			ldi      5
			ge?     
			bnt      code_003c
			lap      param5
			aTop     zOffset
			lsp      argc
			ldi      6
			ge?     
			bnt      code_003c
			lap      param6
			aTop     caller
code_003c:
			pushi    #ignoreActors
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			pToa     client
			send     10
			pushi    #doit
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #heading
			pushi    0
			pToa     who
			send     4
			sat      temp0
			pushi    58
			pushi    1
			push    
			pushi    #x
			pushi    1
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pToa     xOffset
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			pToa     yOffset
			add     
			push    
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			pToa     who
			send     4
			push    
			pToa     zOffset
			add     
			push    
			pToa     client
			send     24
			pushi    #looper
			pushi    0
			pToa     client
			send     4
			bnt      code_00ab
			pushi    #doit
			pushi    2
			pTos     client
			lst      temp0
			pushi    #looper
			pushi    0
			pToa     client
			send     4
			send     8
			jmp      code_00b3
code_00ab:
			pushi    2
			pTos     client
			lst      temp0
			callk    DirLoop,  4
code_00b3:
			ret     
		)
	)
)
