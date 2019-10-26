;;; Sierra Script 1.0 - (do not remove this comment)
(script# 991)
(include sci.sh)
(use n000)
(use n992)


(class Jump of Motion
	(properties
		client 0
		caller 0
		x 20000
		y 20000
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
		gx 0
		gy 3
		xStep 20000
		yStep 0
		signal $0000
		illegalBits $0000
		waitApogeeX 1
		waitApogeeY 1
	)
	
	(method (init param1 param2 &tmp temp0)
		(asm
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			eq?     
			bnt      code_0016
			lap      param2
			aTop     caller
code_0016:
			pushi    #illegalBits
			pushi    0
			pToa     client
			send     4
			aTop     illegalBits
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			aTop     signal
			pushi    #illegalBits
			pushi    1
			pushi    0
			pushi    66
			pushi    0
			pToa     client
			send     10
			pTos     xStep
			ldi      20000
			eq?     
			bnt      code_0088
			pushi    #heading
			pushi    0
			pToa     client
			send     4
			sat      temp0
			push    
			ldi      330
			gt?     
			bt       code_0063
			lst      temp0
			ldi      30
			lt?     
			bt       code_0063
			pushi    150
			lat      temp0
			lt?     
			bnt      code_006b
			pprev   
			ldi      210
			lt?     
code_0063:
			bnt      code_006b
			ldi      0
			jmp      code_0086
code_006b:
			lst      temp0
			ldi      180
			lt?     
			bnt      code_007e
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			jmp      code_0086
code_007e:
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			neg     
code_0086:
			aTop     xStep
code_0088:
			pToa     waitApogeeX
			bnt      code_0096
			pTos     xStep
			pToa     gx
			mul     
			push    
			ldi      0
			lt?     
code_0096:
			not     
			bnt      code_009e
			ldi      0
			aTop     waitApogeeX
code_009e:
			pToa     waitApogeeY
			bnt      code_00ac
			pTos     yStep
			pToa     gy
			mul     
			push    
			ldi      0
			lt?     
code_00ac:
			not     
			bnt      code_00b4
			ldi      0
			aTop     waitApogeeY
code_00b4:
			pushi    #setTest
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
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
			pushi    1
			pTos     xLast
			pToa     xStep
			add     
			push    
			pushi    3
			pushi    1
			pTos     yLast
			pToa     yStep
			add     
			push    
			pToa     client
			send     12
			pToa     xStep
			sat      temp0
			pToa     yStep
			sat      temp1
			pTos     xStep
			pToa     gx
			add     
			aTop     xStep
			pTos     yStep
			pToa     gy
			add     
			aTop     yStep
			pToa     waitApogeeX
			not     
			bnt      code_012c
			pTos     x
			ldi      20000
			ne?     
			bnt      code_012c
			pushi    0
			pTos     dx
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pToa     x
			sub     
			mul     
			le?     
			bnt      code_012c
			pushi    #x
			pushi    1
			pTos     x
			pToa     client
			send     6
			pushi    #moveDone
			pushi    0
			self     4
			ret     
code_012c:
			pToa     waitApogeeY
			not     
			bnt      code_015d
			pTos     y
			ldi      20000
			ne?     
			bnt      code_015d
			pushi    0
			pTos     dy
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pToa     y
			sub     
			mul     
			le?     
			bnt      code_015d
			pushi    #y
			pushi    1
			pTos     y
			pToa     client
			send     6
			pushi    #moveDone
			pushi    0
			self     4
			ret     
code_015d:
			lst      temp0
			pToa     xStep
			mul     
			push    
			ldi      0
			le?     
			bnt      code_0173
			ldi      0
			aTop     waitApogeeX
			pushi    #setTest
			pushi    0
			self     4
code_0173:
			lst      temp1
			pToa     yStep
			mul     
			push    
			ldi      0
			le?     
			bnt      code_0189
			ldi      0
			aTop     waitApogeeY
			pushi    #setTest
			pushi    0
			self     4
code_0189:
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			pushi    #illegalBits
			pushi    1
			pTos     illegalBits
			pushi    17
			pushi    1
			pTos     signal
			pToa     client
			send     12
			pToa     caller
			bnt      code_01a5
			ldi      1
			sag      global37
			ldi      1
			aTop     completed
code_01a5:
			ret     
		)
	)
	
	(method (motionCue)
		(asm
			pushi    #mover
			pushi    1
			pushi    0
			pToa     client
			send     6
			pToa     completed
			bnt      code_021f
			pushi    1
			pTos     caller
			callk    IsObject,  2
			bnt      code_021f
			pushi    #cue
			pushi    0
			pToa     caller
			send     4
code_021f:
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (setTest)
		(asm
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pToa     x
			gt?     
			bt       code_01c7
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pToa     x
			eq?     
			bnt      code_01cf
			pTos     xStep
			ldi      0
			gt?     
code_01c7:
			bnt      code_01cf
			ldi      65535
			jmp      code_01d1
code_01cf:
			ldi      1
code_01d1:
			aTop     dx
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pToa     y
			gt?     
			bt       code_01f4
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pToa     y
			eq?     
			bnt      code_01fc
			pTos     yStep
			ldi      0
			gt?     
code_01f4:
			bnt      code_01fc
			ldi      65535
			jmp      code_01fe
code_01fc:
			ldi      1
code_01fe:
			aTop     dy
			ret     
		)
	)
)

(class JumpTo of Jump
	(properties
		client 0
		caller 0
		x 20000
		y 20000
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
		gx 0
		gy 3
		xStep 20000
		yStep 0
		signal $0000
		illegalBits $0000
		waitApogeeX 1
		waitApogeeY 1
	)
	
	(method (init param1 param2 param3 param4 &tmp temp0 temp1 [temp2 52])
		(asm
			lap      param1
			aTop     client
			lap      param2
			aTop     x
			lap      param3
			aTop     y
			pTos     x
			pushi    #x
			pushi    0
			lap      param1
			send     4
			eq?     
			bnt      code_02fa
			pTos     y
			pushi    #y
			pushi    0
			lap      param1
			send     4
			eq?     
			bnt      code_02fa
			pushi    #illegalBits
			pushi    0
			pToa     client
			send     4
			aTop     illegalBits
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			aTop     signal
			pushi    #moveDone
			pushi    0
			self     4
			ret     
code_02fa:
			pTos     x
			pushi    #x
			pushi    0
			lap      param1
			send     4
			sub     
			sat      temp0
			pTos     y
			pushi    #y
			pushi    0
			lap      param1
			send     4
			sub     
			sat      temp1
			pushi    4
			pushSelf
			lst      temp0
			push    
			pTos     gy
			callk    SetJump,  8
			lat      temp0
			not     
			bnt      code_0328
			ldi      20000
			aTop     x
code_0328:
			lat      temp1
			not     
			bnt      code_0333
			ldi      20000
			aTop     y
code_0333:
			lsp      argc
			dup     
			ldi      3
			eq?     
			bnt      code_0347
			pushi    #init
			pushi    1
			lsp      param1
			super    Jump,  6
			jmp      code_0358
code_0347:
			dup     
			ldi      4
			eq?     
			bnt      code_0358
			pushi    #init
			pushi    2
			lsp      param1
			lsp      param4
			super    Jump,  8
code_0358:
			toss    
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			pTos     x
			ldi      20000
			ne?     
			bnt      code_036c
			pushi    #x
			pushi    1
			pTos     x
			pToa     client
			send     6
code_036c:
			pTos     y
			ldi      20000
			ne?     
			bnt      code_037e
			pushi    #y
			pushi    1
			pTos     y
			pToa     client
			send     6
code_037e:
			pushi    #moveDone
			pushi    0
			super    Jump,  4
			ret     
		)
	)
)
