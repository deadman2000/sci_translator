;;; Sierra Script 1.0 - (do not remove this comment)
(script# 964)
(include sci.sh)
(use n992)
(use n999)


(class DPath of Motion
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
		points 0
		value 0
	)
	
	(method (init param1 param2 &tmp temp0)
		(asm
			pToa     points
			bt       code_0012
			pushi    #new
			pushi    0
			class    List
			send     4
code_0012:
			aTop     points
			lap      argc
			bnt      code_0051
			lap      param1
			aTop     client
			ldi      0
			sat      temp0
code_0021:
			lst      temp0
			lsp      argc
			ldi      3
			sub     
			le?     
			bnt      code_0040
			pushi    #add
			pushi    2
			lat      temp0
			lspi     param2
			+at      temp0
			lspi     param2
			pToa     points
			send     8
			+at      temp0
			jmp      code_0021
code_0040:
			lst      temp0
			lsp      argc
			ldi      2
			sub     
			le?     
			bnt      code_0051
			lat      temp0
			lapi     param2
			aTop     caller
code_0051:
			pushi    #contains
			pushi    1
			pushi    32768
			pToa     points
			send     6
			bt       code_0068
			pushi    #add
			pushi    1
			pushi    32768
			pToa     points
			send     6
code_0068:
			pushi    #setTarget
			pushi    0
			self     4
			pushi    #init
			pushi    0
			super    Motion,  4
			lap      argc
			not     
			bnt      code_007f
			pushi    #doit
			pushi    0
			self     4
code_007f:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pTos     points
			callk    IsObject,  2
			bnt      code_0090
			pushi    #dispose
			pushi    0
			pToa     points
			send     4
code_0090:
			pushi    #dispose
			pushi    0
			super    Motion,  4
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			pushi    #at
			pushi    1
			pTos     value
			pToa     points
			send     6
			push    
			ldi      32768
			eq?     
			bnt      code_00dc
			pushi    #moveDone
			pushi    0
			super    Motion,  4
			jmp      code_00e1
code_00dc:
			pushi    #init
			pushi    0
			self     4
code_00e1:
			ret     
		)
	)
	
	(method (setTarget)
		(asm
			pushi    #at
			pushi    1
			pTos     value
			pToa     points
			send     6
			push    
			ldi      32768
			ne?     
			bnt      code_00c1
			pushi    #at
			pushi    1
			pTos     value
			pToa     points
			send     6
			aTop     x
			pushi    #at
			pushi    1
			ipToa    value
			push    
			pToa     points
			send     6
			aTop     y
			ipToa    value
code_00c1:
			ret     
		)
	)
)
