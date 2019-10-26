;;; Sierra Script 1.0 - (do not remove this comment)
(script# 945)
(include sci.sh)
(use n000)
(use n992)
(use n999)


(class PolyPath of Motion
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
		value 2
		points 0
		finalX 0
		finalY 0
		obstacles 0
	)
	
	(method (init param1 param2 param3 param4 param5 param6)
		(asm
			lap      argc
			bnt      code_0097
			lap      param1
			aTop     client
			lsp      argc
			ldi      1
			gt?     
			bnt      code_0097
			lsp      argc
			ldi      6
			ge?     
			bnt      code_0024
			lap      param6
			aTop     obstacles
			jmp      code_0038
code_0024:
			pushi    1
			pTos     obstacles
			callk    IsObject,  2
			not     
			bnt      code_0038
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			aTop     obstacles
code_0038:
			pToa     points
			bnt      code_0044
			pushi    2
			pushi    3
			push    
			callk    Memory,  4
code_0044:
			pushi    7
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			lap      param2
			aTop     finalX
			push    
			lap      param3
			aTop     finalY
			push    
			pToa     obstacles
			bnt      code_006a
			pushi    #elements
			pushi    0
			send     4
code_006a:
			push    
			pToa     obstacles
			bnt      code_0075
			pushi    #size
			pushi    0
			send     4
code_0075:
			push    
			lsp      argc
			ldi      5
			ge?     
			bnt      code_0083
			lap      param5
			jmp      code_0085
code_0083:
			ldi      1
code_0085:
			push    
			callk    AvoidPath,  14
			aTop     points
			lsp      argc
			ldi      3
			gt?     
			bnt      code_0097
			lap      param4
			aTop     caller
code_0097:
			pushi    #setTarget
			pushi    0
			self     4
			pushi    #init
			pushi    0
			super    Motion,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     points
			bnt      code_00b0
			pushi    2
			pushi    3
			push    
			callk    Memory,  4
code_00b0:
			ldi      0
			aTop     points
			pushi    #dispose
			pushi    0
			super    Motion,  4
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			pushi    2
			pTos     points
			pTos     value
			calle    proc999_6,  4
			push    
			ldi      30583
			eq?     
			bnt      code_0108
			pushi    #moveDone
			pushi    0
			super    Motion,  4
			jmp      code_010d
code_0108:
			pushi    #init
			pushi    0
			self     4
code_010d:
			ret     
		)
	)
	
	(method (setTarget)
		(asm
			pushi    2
			pTos     points
			pTos     value
			calle    proc999_6,  4
			push    
			ldi      30583
			ne?     
			bnt      code_00eb
			pushi    2
			pTos     points
			pTos     value
			calle    proc999_6,  4
			aTop     x
			pushi    2
			pTos     points
			ipToa    value
			push    
			calle    proc999_6,  4
			aTop     y
			ipToa    value
code_00eb:
			ret     
		)
	)
)
