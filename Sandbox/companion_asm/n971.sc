;;; Sierra Script 1.0 - (do not remove this comment)
(script# 971)
(include sci.sh)
(use n992)


(class Follow of Motion
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
	
	(method (init param1 param2 param3)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0028
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0028
			lap      param2
			aTop     who
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0028
			lap      param3
			aTop     distance
code_0028:
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			push    
			pToa     distance
			gt?     
			bnt      code_0052
			pushi    #init
			pushi    3
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
			super    Motion,  10
code_0052:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			push    
			pToa     distance
			gt?     
			bnt      code_00d2
			pTos     b-moveCnt
			ldi      0
			eq?     
			bnt      code_00c9
			pushi    #init
			pushi    3
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
			super    Motion,  10
code_00c9:
			pushi    #doit
			pushi    0
			super    Motion,  4
			jmp      code_012c
code_00d2:
			pushi    #x
			pushi    0
			pToa     client
			send     4
			aTop     xLast
			pushi    #y
			pushi    0
			pToa     client
			send     4
			aTop     yLast
			pushi    4
			pTos     xLast
			pTos     yLast
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
			callk    GetAngle,  8
			sat      temp0
			pushi    #heading
			pushi    1
			push    
			pToa     client
			send     6
			pushi    #looper
			pushi    0
			pToa     client
			send     4
			bnt      code_0124
			pushi    #doit
			pushi    2
			pTos     client
			lst      temp0
			pushi    #looper
			pushi    0
			pToa     client
			send     4
			send     8
			jmp      code_012c
code_0124:
			pushi    2
			pTos     client
			lst      temp0
			callk    DirLoop,  4
code_012c:
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			ret     
		)
	)
	
	(method (setTarget param1)
		(asm
			lap      argc
			bnt      code_0073
			pushi    #setTarget
			pushi    0
			&rest    param1
			super    Motion,  4
			jmp      code_0094
code_0073:
			pushi    #onTarget
			pushi    0
			self     4
			not     
			bnt      code_0094
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
code_0094:
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
