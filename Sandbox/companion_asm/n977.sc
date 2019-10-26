;;; Sierra Script 1.0 - (do not remove this comment)
(script# 977)
(include sci.sh)
(use n000)
(use n982)
(use n992)
(use n999)


(local
	[local0 8] = [2 6 4 0 3 5 1 7]
	[local8 8] = [3 6 0 4 2 5 1 7]
)
(class Grooper of Code
	(properties
		client 0
		oldCycler 0
		oldMover 0
		caller 0
	)
	
	(method (doit param1 param2 param3 param4 &tmp temp0 temp1)
		(asm
			pToa     client
			not     
			bnt      code_0010
			lap      param1
			aTop     client
code_0010:
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			push    
			ldi      2048
			and     
			bnt      code_002f
			pToa     caller
			bnt      code_002a
			pushi    #cue
			pushi    0
			send     4
code_002a:
			ldi      0
			aTop     caller
			ret     
code_002f:
			lsp      argc
			ldi      3
			ge?     
			bnt      code_003b
			lap      param3
			aTop     caller
code_003b:
			pushi    1
			pTos     client
			callk    NumLoops,  2
			push    
			ldi      8
			lt?     
			bnt      code_004d
			ldi      4
			jmp      code_004f
code_004d:
			ldi      8
code_004f:
			sat      temp1
			pushi    #contains
			pushi    1
			pTos     client
			lag      global5
			send     6
			not     
			bt       code_0068
			lsp      argc
			ldi      4
			ge?     
			bnt      code_00b7
			lap      param4
code_0068:
			bnt      code_00b7
			pushi    6
			pushi    1
			lst      temp1
			ldi      4
			eq?     
			bnt      code_007b
			ldi      2
			jmp      code_007d
code_007b:
			ldi      1
code_007d:
			push    
			pushi    2
			pushi    #heading
			pushi    0
			pToa     client
			send     4
			push    
			pushi    180
			lat      temp1
			div     
			add     
			push    
			pushi    360
			calle    proc999_1,  4
			push    
			pushi    360
			lat      temp1
			div     
			div     
			mul     
			lsli     local8
			pToa     client
			send     6
			pToa     caller
			bnt      code_00b2
			pushi    #cue
			pushi    0
			send     4
code_00b2:
			ldi      0
			aTop     caller
			ret     
code_00b7:
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			lali     local0
			sat      temp0
			pToa     oldMover
			bnt      code_00d0
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     oldMover
code_00d0:
			pushi    1
			pTos     oldCycler
			callk    IsObject,  2
			bnt      code_0107
			pushi    #isMemberOf
			pushi    1
			lofsa    Grycler
			push    
			pToa     oldCycler
			send     6
			bt       code_00f9
			pushi    #isMemberOf
			pushi    1
			lofsa    Grycler
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     6
			not     
code_00f9:
			bnt      code_0107
			pushi    #dispose
			pushi    0
			pToa     oldCycler
			send     4
			ldi      0
			aTop     oldCycler
code_0107:
			pToa     oldCycler
			not     
			bnt      code_0117
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			aTop     oldCycler
code_0117:
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			bnt      code_0143
			pushi    #isMemberOf
			pushi    1
			lofsa    Grycler
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     6
			bnt      code_0143
			pushi    #dispose
			pushi    0
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     4
code_0143:
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			aTop     oldMover
			pushi    #cycler
			pushi    1
			pushi    0
			pushi    59
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    150
			pushi    3
			lofsa    Grycler
			push    
			pushSelf
			lst      temp0
			pToa     client
			send     28
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pTos     oldCycler
			callk    IsObject,  2
			bnt      code_01c7
			pushi    #dispose
			pushi    0
			pToa     oldCycler
			send     4
			ldi      0
			aTop     oldCycler
code_01c7:
			pushi    1
			pTos     oldMover
			callk    IsObject,  2
			bnt      code_01db
			pushi    #dispose
			pushi    0
			pToa     oldMover
			send     4
			ldi      0
			aTop     oldMover
code_01db:
			pToa     client
			bnt      code_01e6
			pushi    #looper
			pushi    1
			pushi    0
			send     6
code_01e6:
			pushi    #dispose
			pushi    0
			super    Code,  4
			ret     
		)
	)
	
	(method (cue param1 &tmp temp0)
		(asm
			pushi    1
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			push    
			callk    IsObject,  2
			not     
			bnt      code_0186
			pushi    #mover
			pushi    1
			pTos     oldMover
			pToa     client
			send     6
code_0186:
			pushi    1
			pTos     oldCycler
			callk    IsObject,  2
			bnt      code_0199
			pushi    #cycler
			pushi    1
			pTos     oldCycler
			pToa     client
			send     6
code_0199:
			pToa     caller
			sat      temp0
			ldi      0
			aTop     oldCycler
			aTop     oldMover
			aTop     caller
			lat      temp0
			bnt      code_01b2
			pushi    #cue
			pushi    0
			&rest    param1
			send     4
code_01b2:
			ret     
		)
	)
)

(class Grycler of Cycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		loopIndex 0
		numOfLoops 0
	)
	
	(method (init param1 param2 param3)
		(asm
			pushi    #init
			pushi    1
			lsp      param1
			super    Cycle,  6
			lap      param2
			aTop     caller
			pushi    1
			pTos     client
			callk    NumLoops,  2
			push    
			ldi      8
			lt?     
			bnt      code_024c
			ldi      4
			jmp      code_024e
code_024c:
			ldi      8
code_024e:
			aTop     numOfLoops
			pushi    1
			pushi    2
			lsp      param3
			ldi      45
			mul     
			push    
			pushi    #heading
			pushi    0
			lap      param1
			send     4
			push    
			calle    proc982_2,  4
			push    
			calle    proc999_0,  2
			neg     
			aTop     cycleDir
			lap      param3
			aTop     loopIndex
			pushi    #loopIsCorrect
			pushi    0
			self     4
			bnt      code_0283
			pushi    #cycleDone
			pushi    0
			self     4
code_0283:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #loop
			pushi    1
			pushi    #nextCel
			pushi    0
			self     4
			push    
			pToa     client
			send     6
			pushi    #loopIsCorrect
			pushi    0
			self     4
			bnt      code_02a1
			pushi    #cycleDone
			pushi    0
			self     4
code_02a1:
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
			bt       code_02ed
			pushi    #loopIsCorrect
			pushi    0
			self     4
code_02ed:
			bnt      code_02fa
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			jmp      code_031c
code_02fa:
			lag      global88
			aTop     cycleCnt
			pTos     loopIndex
			pTos     cycleDir
			pushi    8
			pToa     numOfLoops
			div     
			mul     
			add     
			aTop     loopIndex
			pushi    2
			pTos     loopIndex
			pushi    8
			calle    proc999_1,  4
			aTop     loopIndex
			pToa     loopIndex
			lali     local8
code_031c:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			ldi      1
			aTop     completed
			sag      global37
			ret     
		)
	)
	
	(method (loopIsCorrect)
		(asm
			pushi    1
			pushi    2
			pTos     loopIndex
			ldi      45
			mul     
			push    
			pushi    #heading
			pushi    0
			pToa     client
			send     4
			push    
			calle    proc982_2,  4
			push    
			callk    Abs,  2
			push    
			pushi    180
			pToa     numOfLoops
			div     
			push    
			ldi      1
			add     
			lt?     
			ret     
		)
	)
)
