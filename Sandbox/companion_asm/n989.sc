;;; Sierra Script 1.0 - (do not remove this comment)
(script# 989)
(include sci.sh)
(use n000)
(use n999)


(class Sound of Obj
	(properties
		nodePtr 0
		handle 0
		flags $0000
		number 0
		vol 127
		priority 0
		loop 1
		signal $0000
		prevSignal 0
		dataInc 0
		min 0
		sec 0
		frame 0
		client 0
		owner 0
	)
	
	(method (new param1)
		(asm
			pushi    155
			pushi    1
			lap      argc
			bnt      code_0012
			lap      param1
			jmp      code_0014
code_0012:
			ldi      0
code_0014:
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			super    Obj,  4
			send     10
			ret     
		)
	)
	
	(method (init)
		(asm
			ldi      0
			aTop     signal
			aTop     prevSignal
			pushi    #add
			pushi    1
			pushSelf
			lag      global8
			send     6
			pushi    2
			pushi    6
			pushSelf
			callk    DoSound,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global8
			send     6
			pToa     nodePtr
			bnt      code_01f5
			pushi    2
			pushi    7
			pushSelf
			callk    DoSound,  4
			ldi      0
			aTop     nodePtr
code_01f5:
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (play param1 &tmp temp0)
		(asm
			lap      argc
			sat      temp0
			lap      argc
			bnt      code_005d
			pushi    1
			push    
			ldi      1
			sub     
			lspi     param1
			callk    IsObject,  2
			bnt      code_005d
			lsp      argc
			ldi      1
			sub     
			sat      temp0
			lapi     param1
			aTop     client
			jmp      code_0061
code_005d:
			ldi      0
			aTop     client
code_0061:
			pushi    #init
			pushi    0
			self     4
			pToa     loop
			not     
			bnt      code_0070
			ldi      1
			aTop     loop
code_0070:
			lat      temp0
			bnt      code_007c
			lap      param1
			aTop     vol
			jmp      code_0080
code_007c:
			ldi      127
			aTop     vol
code_0080:
			pushi    3
			pushi    8
			pushSelf
			pushi    0
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (stop)
		(asm
			pToa     handle
			bnt      code_009d
			pushi    2
			pushi    17
			pushSelf
			callk    DoSound,  4
			pushi    2
			pushi    9
			pushSelf
			callk    DoSound,  4
code_009d:
			ret     
		)
	)
	
	(method (pause param1)
		(asm
			lap      argc
			not     
			bnt      code_00a8
			ldi      1
			sap      param1
code_00a8:
			pushi    3
			pushi    10
			pushi    #isMemberOf
			pushi    1
			class    Sound
			push    
			self     6
			bnt      code_00bb
			selfID  
			jmp      code_00bd
code_00bb:
			ldi      0
code_00bd:
			push    
			lsp      param1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (hold param1)
		(asm
			lap      argc
			not     
			bnt      code_00ce
			ldi      1
			sap      param1
code_00ce:
			pushi    3
			pushi    12
			pushSelf
			lsp      param1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (release)
		(asm
			pushi    3
			pushi    12
			pushSelf
			pushi    0
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (fade param1 param2 param3 param4 &tmp temp0)
		(asm
			lap      argc
			sat      temp0
			lap      argc
			bnt      code_0106
			pushi    1
			push    
			ldi      1
			sub     
			lspi     param1
			callk    IsObject,  2
			bnt      code_0106
			lsp      argc
			ldi      1
			sub     
			sat      temp0
			lapi     param1
			aTop     client
code_0106:
			lat      temp0
			bnt      code_011e
			pushi    6
			pushi    11
			pushSelf
			lsp      param1
			lsp      param2
			lsp      param3
			lsp      param4
			callk    DoSound,  12
			jmp      code_012c
code_011e:
			pushi    6
			pushi    11
			pushSelf
			pushi    0
			pushi    25
			pushi    10
			pushi    1
			callk    DoSound,  12
code_012c:
			ret     
		)
	)
	
	(method (mute param1)
		(asm
			lap      argc
			not     
			bnt      code_0137
			ldi      1
			sap      param1
code_0137:
			pushi    3
			pushi    13
			pushSelf
			lsp      param1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (setVol param1)
		(asm
			pushi    3
			pushi    14
			pushSelf
			lsp      param1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (setPri param1)
		(asm
			pushi    3
			pushi    15
			pushSelf
			lsp      param1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (setLoop param1)
		(asm
			pushi    3
			pushi    16
			pushSelf
			lsp      param1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (send param1 param2 param3 param4)
		(asm
			pushi    1
			lap      param1
			le?     
			bnt      code_019e
			pprev   
			ldi      15
			le?     
			bnt      code_019e
			lsp      param2
			ldi      128
			lt?     
			bnt      code_018e
			pushi    6
			pushi    18
			pushSelf
			lsp      param1
			pushi    176
			lsp      param2
			lsp      param3
			callk    DoSound,  12
			jmp      code_019e
code_018e:
			pushi    6
			pushi    18
			pushSelf
			lsp      param1
			lsp      param2
			lsp      param3
			lsp      param4
			callk    DoSound,  12
code_019e:
			ret     
		)
	)
	
	(method (check)
		(asm
			pToa     handle
			bnt      code_01ab
			pushi    2
			pushi    17
			pushSelf
			callk    DoSound,  4
code_01ab:
			pToa     signal
			bnt      code_01c8
			aTop     prevSignal
			ldi      0
			aTop     signal
			pushi    1
			pTos     client
			callk    IsObject,  2
			bnt      code_01c8
			pushi    #cue
			pushi    1
			pushSelf
			pToa     client
			send     6
code_01c8:
			ret     
		)
	)
	
	(method (clean param1)
		(asm
			pToa     owner
			not     
			bt       code_01d4
			pTos     owner
			lap      param1
			eq?     
code_01d4:
			bnt      code_01dc
			pushi    #dispose
			pushi    0
			self     4
code_01dc:
			ret     
		)
	)
	
	(method (playBed param1 &tmp temp0)
		(asm
			lap      argc
			sat      temp0
			lap      argc
			bnt      code_0222
			pushi    1
			push    
			ldi      1
			sub     
			lspi     param1
			callk    IsObject,  2
			bnt      code_0222
			lsp      argc
			ldi      1
			sub     
			sat      temp0
			lapi     param1
			aTop     client
			jmp      code_0226
code_0222:
			ldi      0
			aTop     client
code_0226:
			pushi    #init
			pushi    0
			self     4
			pToa     loop
			not     
			bnt      code_0235
			ldi      1
			aTop     loop
code_0235:
			lat      temp0
			bnt      code_0241
			lap      param1
			aTop     vol
			jmp      code_0245
code_0241:
			ldi      127
			aTop     vol
code_0245:
			pushi    3
			pushi    8
			pushSelf
			pushi    1
			callk    DoSound,  6
			ret     
		)
	)
	
	(method (changeState)
		(asm
			pushi    2
			pushi    20
			pushSelf
			callk    DoSound,  4
			ret     
		)
	)
)
