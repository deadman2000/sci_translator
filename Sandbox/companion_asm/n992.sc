;;; Sierra Script 1.0 - (do not remove this comment)
(script# 992)
(include sci.sh)
(use n000)
(use n999)


(class Cycle of Obj
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
	)
	
	(method (init param1)
		(asm
			lap      argc
			bnt      code_000d
			lap      param1
			aTop     client
code_000d:
			lsg      global88
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      1
			sub     
			aTop     cycleCnt
			ldi      0
			aTop     completed
			ret     
		)
	)
	
	(method (nextCel)
		(asm
			pushi    1
			lsg      global88
			pToa     cycleCnt
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			lt?     
			bnt      code_0044
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			jmp      code_0053
code_0044:
			lag      global88
			aTop     cycleCnt
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pToa     cycleDir
			add     
code_0053:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			ret     
		)
	)
	
	(method (motionCue)
		(asm
			pushi    #cycler
			pushi    1
			pushi    0
			pToa     client
			send     6
			pToa     completed
			bnt      code_0074
			pushi    1
			pTos     caller
			callk    IsObject,  2
			bnt      code_0074
			pushi    #cue
			pushi    0
			pToa     caller
			send     4
code_0074:
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
)

(class Fwd of Cycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #nextCel
			pushi    0
			self     4
			sat      temp0
			push    
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			gt?     
			bnt      code_00e2
			pushi    #cycleDone
			pushi    0
			self     4
			jmp      code_00eb
code_00e2:
			pushi    #cel
			pushi    1
			lst      temp0
			pToa     client
			send     6
code_00eb:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ret     
		)
	)
)

(class Walk of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_014a
			pushi    #doit
			pushi    0
			super    Fwd,  4
code_014a:
			ret     
		)
	)
)

(class CT of Cycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		endCel 0
	)
	
	(method (init param1 param2 param3 param4 &tmp temp0)
		(asm
			pushi    #init
			pushi    1
			lsp      param1
			super    Cycle,  6
			lap      param3
			aTop     cycleDir
			lsp      argc
			ldi      4
			eq?     
			bnt      code_01a2
			lap      param4
			aTop     caller
code_01a2:
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			sat      temp0
			lsp      param2
			gt?     
			bnt      code_01b7
			lat      temp0
			jmp      code_01b9
code_01b7:
			lap      param2
code_01b9:
			aTop     endCel
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			sat      temp1
			pTos     endCel
			gt?     
			bnt      code_01d2
			lat      temp1
			aTop     endCel
code_01d2:
			pushi    #nextCel
			pushi    0
			self     4
			sat      temp0
			pushi    7
			pushi    1
			push    
			lat      temp1
			gt?     
			bnt      code_01e9
			ldi      0
			jmp      code_01f8
code_01e9:
			lst      temp0
			ldi      0
			lt?     
			bnt      code_01f6
			lat      temp1
			jmp      code_01f8
code_01f6:
			lat      temp0
code_01f8:
			push    
			pToa     client
			send     6
			lsg      global88
			pToa     cycleCnt
			eq?     
			bnt      code_0218
			pTos     endCel
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			eq?     
			bnt      code_0218
			pushi    #cycleDone
			pushi    0
			self     4
code_0218:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			ldi      1
			aTop     completed
			pToa     caller
			bnt      code_0229
			ldi      1
			sag      global37
			jmp      code_022f
code_0229:
			pushi    #motionCue
			pushi    0
			self     4
code_022f:
			ret     
		)
	)
)

(class End of CT
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		endCel 0
	)
	
	(method (init param1 param2)
		(asm
			pushi    107
			pushi    4
			lsp      param1
			pushi    #lastCel
			pushi    0
			lap      param1
			send     4
			push    
			pushi    1
			lsp      argc
			ldi      2
			eq?     
			bnt      code_0295
			lap      param2
			jmp      code_0297
code_0295:
			ldi      0
code_0297:
			push    
			super    CT,  12
			ret     
		)
	)
)

(class Beg of CT
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		endCel 0
	)
	
	(method (init param1 param2)
		(asm
			pushi    107
			pushi    4
			lsp      param1
			pushi    0
			pushi    65535
			lsp      argc
			ldi      2
			eq?     
			bnt      code_02f2
			lap      param2
			jmp      code_02f4
code_02f2:
			ldi      0
code_02f4:
			push    
			super    CT,  12
			ret     
		)
	)
)

(class SyncWalk of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		xLast 0
		yLast 0
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    1
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp0
			push    
			callk    IsObject,  2
			bnt      code_0381
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pToa     xLast
			ne?     
			bt       code_0366
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pToa     yLast
			ne?     
code_0366:
			bnt      code_0381
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
			pushi    #doit
			pushi    0
			super    Fwd,  4
code_0381:
			ret     
		)
	)
	
	(method (nextCel)
		(asm
			lsg      global88
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			add     
			aTop     cycleCnt
			pushi    #nextCel
			pushi    0
			super    Fwd,  4
			ret     
		)
	)
)

(class Motion of Obj
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
	)
	
	(method (init param1 param2 param3 param4 &tmp [temp0 2] temp2 temp3)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0412
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0412
			lap      param2
			aTop     x
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0412
			lap      param3
			aTop     y
			lsp      argc
			ldi      4
			ge?     
			bnt      code_0412
			lap      param4
			aTop     caller
code_0412:
			ldi      0
			aTop     completed
			aTop     xLast
			aTop     yLast
			pushi    1
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			add     
			push    
			lag      global88
			add     
			aTop     b-moveCnt
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			sat      temp3
			bnt      code_043e
			pushi    #cycleCnt
			pushi    1
			pTos     b-moveCnt
			send     6
code_043e:
			pushi    4
			dup     
			pushi    0
			pToa     client
			send     4
			sat      temp2
			push    
			pushi    #y
			pushi    0
			pToa     client
			send     4
			sat      temp3
			push    
			pTos     x
			pTos     y
			callk    GetDistance,  8
			bnt      code_0473
			pushi    #setHeading
			pushi    1
			pushi    4
			lst      temp2
			lst      temp3
			pTos     x
			pTos     y
			callk    GetAngle,  8
			push    
			pToa     client
			send     6
code_0473:
			pushi    1
			pushSelf
			callk    InitBresen,  2
			ret     
		)
	)
	
	(method (doit &tmp [temp0 6])
		(asm
			pushi    1
			lsg      global88
			pToa     b-moveCnt
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			ge?     
			bnt      code_04c2
			lag      global88
			aTop     b-moveCnt
			pushi    1
			pushSelf
			callk    DoBresen,  2
code_04c2:
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			ldi      1
			aTop     completed
			pToa     caller
			bnt      code_04d3
			ldi      1
			sag      global37
			jmp      code_04d9
code_04d3:
			pushi    #motionCue
			pushi    0
			self     4
code_04d9:
			ret     
		)
	)
	
	(method (setTarget param1 param2)
		(asm
			lap      argc
			bnt      code_04a0
			lap      param1
			aTop     x
			lap      param2
			aTop     y
code_04a0:
			ret     
		)
	)
	
	(method (onTarget)
		(asm
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pToa     x
			eq?     
			bnt      code_0492
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pToa     y
			eq?     
code_0492:
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
			bnt      code_04f8
			pushi    1
			pTos     caller
			callk    IsObject,  2
			bnt      code_04f8
			pushi    #cue
			pushi    0
			pToa     caller
			send     4
code_04f8:
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
)

(class MoveTo of Motion
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
	)
	
	(method (init param1)
		(asm
			pushi    #init
			pushi    0
			&rest    param1
			super    Motion,  4
			ret     
		)
	)
	
	(method (onTarget)
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
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			le?     
			bnt      code_05b4
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
			pushi    #yStep
			pushi    0
			pToa     client
			send     4
			le?     
code_05b4:
			ret     
		)
	)
)
