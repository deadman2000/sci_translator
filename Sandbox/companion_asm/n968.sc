;;; Sierra Script 1.0 - (do not remove this comment)
(script# 968)
(include sci.sh)
(use n992)
(use n999)

(public
	SmoothLooper 0
)

(class SmoothLooper of Code
	(properties
		nextLoop 0
		client 0
		oldCycler 0
		oldMover 0
		newMover 0
		oldCycleSpeed 0
		cycleSpeed 0
		inProgress 0
		vNormal 0
		vChangeDir 0
	)
	
	(method (doit param1 param2 &tmp temp0 temp1)
		(asm
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			push    
			ldi      2048
			and     
			bnt      code_0020
			ret     
code_0020:
			ldi      0
			sat      temp1
			pToa     inProgress
			bnt      code_0048
			pToa     newMover
			bnt      code_0033
			pushi    #dispose
			pushi    0
			send     4
code_0033:
			pushi    #mover
			pushi    0
			lap      param1
			send     4
			aTop     newMover
			pushi    #mover
			pushi    1
			pushi    0
			lap      param1
			send     6
			ret     
			jmp      code_005f
code_0048:
			pToa     vNormal
			not     
			bnt      code_0057
			pushi    #view
			pushi    0
			lap      param1
			send     4
			aTop     vNormal
code_0057:
			lap      param1
			aTop     client
			ldi      1
			aTop     inProgress
code_005f:
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			ldi      3
			gt?     
			bnt      code_00a4
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vNormal
			eq?     
			bnt      code_00a4
			pToa     inProgress
			bnt      code_0093
			pushi    1
			pTos     oldMover
			callk    IsObject,  2
			bnt      code_00a4
			pushi    #dispose
			pushi    0
			pToa     oldMover
			send     4
			jmp      code_00a4
code_0093:
			pushi    #view
			pushi    1
			pTos     vNormal
			pToa     client
			send     6
			pushi    2
			pTos     client
			lsp      param2
			callk    DirLoop,  4
code_00a4:
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			sat      temp0
			push    
			dup     
			ldi      3
			eq?     
			bnt      code_010f
			lsp      param2
			ldi      45
			le?     
			bt       code_00c3
			lsp      param2
			ldi      315
			gt?     
code_00c3:
			bnt      code_00c9
			jmp      code_0233
code_00c9:
			lsp      param2
			ldi      135
			le?     
			bnt      code_00e1
			ldi      4
			sat      temp0
			ldi      0
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_00e1:
			lsp      param2
			ldi      225
			le?     
			bnt      code_00f9
			ldi      4
			sat      temp0
			ldi      16
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_00f9:
			lsp      param2
			ldi      315
			le?     
			bnt      code_0233
			ldi      5
			sat      temp0
			ldi      1
			aTop     nextLoop
			sat      temp1
			jmp      code_0233
code_010f:
			dup     
			ldi      0
			eq?     
			bnt      code_0172
			lsp      param2
			ldi      45
			le?     
			bt       code_0124
			lsp      param2
			ldi      315
			gt?     
code_0124:
			bnt      code_0136
			ldi      6
			sat      temp0
			ldi      3
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_0136:
			lsp      param2
			ldi      135
			le?     
			bnt      code_0142
			jmp      code_0233
code_0142:
			lsp      param2
			ldi      225
			le?     
			bnt      code_015a
			ldi      0
			sat      temp0
			ldi      2
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_015a:
			lsp      param2
			ldi      315
			le?     
			bnt      code_0233
			ldi      6
			sat      temp0
			ldi      21
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_0172:
			dup     
			ldi      1
			eq?     
			bnt      code_01d5
			lsp      param2
			ldi      45
			le?     
			bt       code_0187
			lsp      param2
			ldi      315
			gt?     
code_0187:
			bnt      code_0199
			ldi      7
			sat      temp0
			ldi      3
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_0199:
			lsp      param2
			ldi      135
			le?     
			bnt      code_01b1
			ldi      1
			sat      temp0
			ldi      18
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_01b1:
			lsp      param2
			ldi      225
			le?     
			bnt      code_01c9
			ldi      1
			sat      temp0
			ldi      2
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_01c9:
			lsp      param2
			ldi      315
			le?     
			bnt      code_0233
			jmp      code_0233
code_01d5:
			dup     
			ldi      2
			eq?     
			bnt      code_0233
			lsp      param2
			ldi      45
			le?     
			bt       code_01ea
			lsp      param2
			ldi      315
			gt?     
code_01ea:
			bnt      code_01fc
			ldi      3
			sat      temp0
			ldi      23
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_01fc:
			lsp      param2
			ldi      135
			le?     
			bnt      code_0214
			ldi      2
			sat      temp0
			ldi      0
			aTop     nextLoop
			ldi      1
			sat      temp1
			jmp      code_0233
code_0214:
			lsp      param2
			ldi      225
			le?     
			bnt      code_0220
			jmp      code_0233
code_0220:
			lsp      param2
			ldi      315
			le?     
			bnt      code_0233
			ldi      3
			sat      temp0
			ldi      1
			aTop     nextLoop
			sat      temp1
code_0233:
			toss    
			lat      temp1
			bnt      code_0273
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			aTop     oldCycler
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			aTop     oldMover
			pushi    #view
			pushi    1
			pTos     vChangeDir
			pushi    59
			pushi    1
			pushi    0
			pushi    220
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			lst      temp0
			pushi    7
			pushi    1
			pushi    65535
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     38
			jmp      code_0277
code_0273:
			ldi      0
			aTop     inProgress
code_0277:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     oldMover
			bnt      code_0312
			pushi    #dispose
			pushi    0
			send     4
code_0312:
			pToa     newMover
			bnt      code_031c
			pushi    #dispose
			pushi    0
			send     4
code_031c:
			pToa     oldCycler
			bnt      code_0326
			pushi    #dispose
			pushi    0
			send     4
code_0326:
			pushi    #view
			pushi    1
			pTos     vNormal
			pushi    62
			pushi    1
			pushi    0
			pToa     client
			send     12
			pushi    2
			pTos     client
			pushi    #heading
			pushi    0
			pToa     client
			send     4
			push    
			callk    DirLoop,  4
			pushi    #dispose
			pushi    0
			super    Code,  4
			ret     
		)
	)
	
	(method (cue &tmp [temp0 2])
		(asm
			pTos     nextLoop
			ldi      15
			lt?     
			bnt      code_02b8
			pushi    #view
			pushi    1
			pTos     vNormal
			pushi    6
			pushi    1
			pTos     nextLoop
			pushi    59
			pushi    1
			pTos     oldMover
			pushi    220
			pushi    1
			pTos     oldCycler
			pToa     client
			send     24
			ldi      0
			aTop     oldMover
			aTop     oldCycler
			aTop     inProgress
			pToa     newMover
			bnt      code_0307
			pushi    #setMotion
			pushi    1
			push    
			pToa     client
			send     6
			ldi      0
			aTop     newMover
			jmp      code_0307
code_02b8:
			pTos     nextLoop
			ldi      16
			sub     
			aTop     nextLoop
			pushi    #loop
			pushi    1
			pTos     nextLoop
			pushi    7
			pushi    1
			pushi    65535
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			pTos     nextLoop
			dup     
			ldi      0
			eq?     
			bnt      code_02e3
			ldi      2
			jmp      code_0304
code_02e3:
			dup     
			ldi      5
			eq?     
			bnt      code_02ef
			ldi      1
			jmp      code_0304
code_02ef:
			dup     
			ldi      2
			eq?     
			bnt      code_02fb
			ldi      0
			jmp      code_0304
code_02fb:
			dup     
			ldi      7
			eq?     
			bnt      code_0304
			ldi      3
code_0304:
			toss    
			aTop     nextLoop
code_0307:
			ret     
		)
	)
)
