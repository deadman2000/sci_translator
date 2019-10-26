;;; Sierra Script 1.0 - (do not remove this comment)
(script# 970)
(include sci.sh)
(use n992)


(class Wander of Motion
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
		distance 30
	)
	
	(method (init param1 param2)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_001c
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_001c
			lap      param2
			aTop     distance
code_001c:
			pushi    #setTarget
			pushi    0
			self     4
			pushi    #init
			pushi    1
			pTos     client
			super    Motion,  6
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Motion,  4
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			bnt      code_0077
			pushi    #moveDone
			pushi    0
			self     4
code_0077:
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			pushi    #init
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (setTarget &tmp temp0)
		(asm
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pTos     distance
			pushi    2
			pushi    0
			pTos     distance
			ldi      2
			mul     
			sat      temp0
			push    
			callk    Random,  4
			sub     
			add     
			aTop     x
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pTos     distance
			pushi    2
			pushi    0
			lst      temp0
			callk    Random,  4
			sub     
			add     
			aTop     y
			ret     
		)
	)
	
	(method (onTarget)
		(asm
			ldi      0
			ret     
		)
	)
)
