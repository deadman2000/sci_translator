;;; Sierra Script 1.0 - (do not remove this comment)
(script# 953)
(include sci.sh)
(use n992)


(class Approach of Motion
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
		distance 20
	)
	
	(method (init param1 param2 param3 param4)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0034
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0034
			lap      param2
			aTop     who
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0034
			lap      param3
			aTop     distance
			lsp      argc
			ldi      4
			ge?     
			bnt      code_0034
			lap      param4
			aTop     caller
code_0034:
			pushi    #init
			pushi    4
			pTos     client
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			pTos     caller
			super    Motion,  12
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #onTarget
			pushi    0
			self     4
			bnt      code_00a3
			pushi    #moveDone
			pushi    0
			self     4
			jmp      code_00a9
code_00a3:
			pushi    #doit
			pushi    0
			super    Motion,  4
code_00a9:
			ret     
		)
	)
	
	(method (setTarget param1)
		(asm
			lap      argc
			bnt      code_0070
			pushi    #setTarget
			pushi    0
			&rest    param1
			super    Motion,  4
			jmp      code_0091
code_0070:
			pushi    #onTarget
			pushi    0
			self     4
			not     
			bnt      code_0091
			pushi    #setTarget
			pushi    2
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			super    Motion,  8
code_0091:
			ret     
		)
	)
	
	(method (onTarget)
		(asm
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			push    
			pToa     distance
			le?     
			ret     
		)
	)
)
