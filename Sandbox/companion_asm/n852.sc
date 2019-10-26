;;; Sierra Script 1.0 - (do not remove this comment)
(script# 852)
(include sci.sh)
(use n992)
(use n999)


(class PPath of MoveTo
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
		pathPts 0
		intermediate 0
		value 1
		endPt 0
		dir 2
	)
	
	(method (init param1 param2 param3 param4 param5 param6)
		(asm
			lap      param1
			aTop     client
			lap      param2
			aTop     pathPts
			lsp      argc
			ldi      2
			gt?     
			bnt      code_006f
			pushi    1
			lsp      param3
			callk    IsObject,  2
			bnt      code_0030
			lap      param3
			aTop     caller
			lsp      argc
			ldi      4
			ge?     
			bnt      code_006f
			lap      param4
			aTop     intermediate
			jmp      code_006f
code_0030:
			pushi    2
			lap      param3
			mul     
			push    
			ldi      1
			add     
			aTop     value
			pushi    2
			lap      param4
			mul     
			push    
			ldi      1
			add     
			aTop     endPt
			lsp      argc
			ldi      5
			ge?     
			bnt      code_0050
			lap      param5
			aTop     caller
code_0050:
			lsp      argc
			ldi      6
			ge?     
			bnt      code_005c
			lap      param6
			aTop     intermediate
code_005c:
			pTos     value
			pToa     endPt
			gt?     
			bnt      code_0068
			ldi      65534
			aTop     dir
code_0068:
			pTos     endPt
			pToa     dir
			add     
			aTop     endPt
code_006f:
			pushi    #x
			pushi    0
			pToa     client
			send     4
			aTop     x
			pushi    #y
			pushi    0
			pToa     client
			send     4
			aTop     y
			pushi    #atEnd
			pushi    0
			self     4
			bnt      code_0092
			pushi    #moveDone
			pushi    0
			self     4
			jmp      code_00a4
code_0092:
			pushi    #next
			pushi    0
			self     4
			pushi    #init
			pushi    3
			pTos     client
			pTos     x
			pTos     y
			super    MoveTo,  10
code_00a4:
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			pushi    #atEnd
			pushi    0
			self     4
			bnt      code_00b7
			pushi    #moveDone
			pushi    0
			super    MoveTo,  4
			jmp      code_00dc
code_00b7:
			pToa     intermediate
			bnt      code_00ca
			pushi    141
			pushi    #superClass
			pTos     value
			ldi      2
			div     
			push    
			pToa     intermediate
			send     6
code_00ca:
			pushi    #next
			pushi    0
			self     4
			pushi    #init
			pushi    3
			pTos     client
			pTos     x
			pTos     y
			super    MoveTo,  10
code_00dc:
			ret     
		)
	)
	
	(method (next)
		(asm
			pushi    2
			pTos     pathPts
			pTos     value
			ldi      1
			sub     
			push    
			calle    proc999_6,  4
			aTop     x
			pushi    2
			pTos     pathPts
			pTos     value
			calle    proc999_6,  4
			aTop     y
			pTos     value
			pToa     dir
			add     
			aTop     value
			ret     
		)
	)
	
	(method (atEnd)
		(asm
			pToa     endPt
			bnt      code_010f
			push    
			pToa     value
			eq?     
			jmp      code_0136
code_010f:
			pushi    2
			pTos     pathPts
			pTos     value
			ldi      1
			sub     
			push    
			calle    proc999_6,  4
			push    
			ldi      32768
			eq?     
			bt       code_0136
			pushi    2
			pTos     pathPts
			pTos     value
			calle    proc999_6,  4
			push    
			ldi      32768
			eq?     
code_0136:
			ret     
		)
	)
)
