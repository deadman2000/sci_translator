;;; Sierra Script 1.0 - (do not remove this comment)
(script# 930)
(include sci.sh)
(use n000)
(use n945)
(use n999)


(class PChase of PolyPath
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
		who 0
		distance 0
		targetX 0
		targetY 0
	)
	
	(method (init param1 param2 param3 param4 param5)
		(asm
			lsp      argc
			ldi      5
			ge?     
			bnt      code_0013
			lap      param5
			aTop     obstacles
			jmp      code_0027
code_0013:
			pushi    1
			pTos     obstacles
			callk    IsObject,  2
			not     
			bnt      code_0027
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			aTop     obstacles
code_0027:
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0069
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0069
			lap      param2
			aTop     who
			pushi    #x
			pushi    0
			pToa     who
			send     4
			aTop     targetX
			pushi    #y
			pushi    0
			pToa     who
			send     4
			aTop     targetY
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0069
			lap      param3
			aTop     distance
			lsp      argc
			ldi      4
			ge?     
			bnt      code_0069
			lap      param4
			aTop     caller
code_0069:
			pushi    #init
			pushi    6
			pTos     client
			pTos     targetX
			pTos     targetY
			pTos     caller
			pushi    1
			pTos     obstacles
			super    PolyPath,  16
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    4
			pTos     targetX
			pTos     targetY
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
			callk    GetDistance,  8
			push    
			pToa     distance
			gt?     
			bnt      code_00be
			pToa     points
			bnt      code_00aa
			pushi    2
			pushi    3
			push    
			callk    Memory,  4
code_00aa:
			ldi      0
			aTop     points
			ldi      2
			aTop     value
			pushi    #init
			pushi    2
			pTos     client
			pTos     who
			self     8
			jmp      code_00df
code_00be:
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			sat      temp0
			push    
			pToa     distance
			le?     
			bnt      code_00d9
			pushi    #moveDone
			pushi    0
			self     4
			jmp      code_00df
code_00d9:
			pushi    #doit
			pushi    0
			super    PolyPath,  4
code_00df:
			ret     
		)
	)
	
	(method (moveDone &tmp temp0)
		(asm
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			sat      temp0
			push    
			pToa     distance
			le?     
			bnt      code_00fe
			pushi    #moveDone
			pushi    0
			super    PolyPath,  4
			jmp      code_0136
code_00fe:
			pushi    2
			pTos     points
			pTos     value
			calle    proc999_6,  4
			push    
			ldi      30583
			eq?     
			bnt      code_0131
			pToa     points
			bnt      code_011d
			pushi    2
			pushi    3
			push    
			callk    Memory,  4
code_011d:
			ldi      0
			aTop     points
			ldi      2
			aTop     value
			pushi    #init
			pushi    2
			pTos     client
			pTos     who
			self     8
			jmp      code_0136
code_0131:
			pushi    #init
			pushi    0
			self     4
code_0136:
			ret     
		)
	)
)

(class PFollow of PolyPath
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
		who 0
		distance 0
		targetX 0
		targetY 0
	)
	
	(method (init param1 param2 param3 param4 &tmp temp0)
		(asm
			lsp      argc
			ldi      4
			ge?     
			bnt      code_01d7
			lap      param4
			jmp      code_01df
code_01d7:
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
code_01df:
			sat      temp0
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0217
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0217
			lap      param2
			aTop     who
			pushi    #x
			pushi    0
			pToa     who
			send     4
			aTop     targetX
			pushi    #y
			pushi    0
			pToa     who
			send     4
			aTop     targetY
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0217
			lap      param3
			aTop     distance
code_0217:
			pushi    #init
			pushi    6
			pTos     client
			pTos     targetX
			pTos     targetY
			pushi    0
			pushi    1
			lst      temp0
			super    PolyPath,  16
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    4
			pTos     targetX
			pTos     targetY
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
			callk    GetDistance,  8
			push    
			pToa     distance
			gt?     
			bnt      code_026b
			pToa     points
			bnt      code_0257
			pushi    2
			pushi    3
			push    
			callk    Memory,  4
code_0257:
			ldi      0
			aTop     points
			ldi      2
			aTop     value
			pushi    #init
			pushi    2
			pTos     client
			pTos     who
			self     8
			jmp      code_02c7
code_026b:
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			sat      temp0
			push    
			pToa     distance
			le?     
			bnt      code_02c1
			pushi    #setHeading
			pushi    1
			pushi    4
			dup     
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
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
			push    
			pToa     client
			send     6
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
			ret     
			jmp      code_02c7
code_02c1:
			pushi    #doit
			pushi    0
			super    PolyPath,  4
code_02c7:
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
)
