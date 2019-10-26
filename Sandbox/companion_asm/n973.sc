;;; Sierra Script 1.0 - (do not remove this comment)
(script# 973)
(include sci.sh)
(use n000)
(use n999)


(class Timer of Obj
	(properties
		cycleCnt -1
		seconds -1
		ticksToDo -1
		lastTime -1
		client 0
	)
	
	(procedure (localproc_0004 &tmp temp0)
		(asm
			pToa     client
			sat      temp0
			ldi      0
			aTop     client
			pushi    1
			lst      temp0
			callk    IsObject,  2
			bnt      code_0042
			pushi    #respondsTo
			pushi    1
			pushi    131
			lat      temp0
			send     6
			bnt      code_002d
			pushi    #timer
			pushi    1
			pushi    0
			lat      temp0
			send     6
code_002d:
			pushi    #respondsTo
			pushi    1
			pushi    141
			lat      temp0
			send     6
			bnt      code_0042
			pushi    #cue
			pushi    0
			lat      temp0
			send     4
code_0042:
			ret     
		)
	)
	
	
	(method (new)
		(asm
			pushSelf
			class    Timer
			eq?     
			bnt      code_0053
			pushi    #new
			pushi    0
			super    Obj,  4
			jmp      code_0054
code_0053:
			selfID  
code_0054:
			ret     
		)
	)
	
	(method (init param1)
		(asm
			lap      param1
			aTop     client
			pushi    #add
			pushi    1
			pushSelf
			lag      global7
			send     6
			pushi    #respondsTo
			pushi    1
			pushi    131
			lap      param1
			send     6
			bnt      code_0094
			pushi    1
			pushi    #timer
			pushi    0
			lap      param1
			send     4
			push    
			callk    IsObject,  2
			bnt      code_008b
			pushi    #dispose
			pushi    0
			pushi    #timer
			pushi    0
			lap      param1
			send     4
			send     4
code_008b:
			pushi    #timer
			pushi    1
			pushSelf
			lap      param1
			send     6
code_0094:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pTos     cycleCnt
			ldi      65535
			ne?     
			bnt      code_00ad
			dpToa    cycleCnt
			not     
			bnt      code_00fd
			pushi    0
			call     localproc_0004,  0
			jmp      code_00fd
code_00ad:
			pTos     seconds
			ldi      65535
			ne?     
			bnt      code_00d4
			pTos     lastTime
			pushi    1
			pushi    1
			callk    GetTime,  2
			sat      temp0
			ne?     
			bnt      code_00fd
			lat      temp0
			aTop     lastTime
			dpToa    seconds
			not     
			bnt      code_00fd
			pushi    0
			call     localproc_0004,  0
			jmp      code_00fd
code_00d4:
			pTos     ticksToDo
			pToa     lastTime
			add     
			push    
			pushi    0
			callk    GetTime,  0
			ult?    
			bt       code_00f5
			pTos     lastTime
			pushi    0
			callk    GetTime,  0
			ugt?    
			bnt      code_00fd
			pTos     ticksToDo
			pToa     lastTime
			add     
			push    
			pToa     lastTime
			ugt?    
code_00f5:
			bnt      code_00fd
			pushi    0
			call     localproc_0004,  0
code_00fd:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pTos     client
			callk    IsObject,  2
			bnt      code_011d
			pushi    #respondsTo
			pushi    1
			pushi    131
			pToa     client
			send     6
			bnt      code_011d
			pushi    #timer
			pushi    1
			pushi    0
			pToa     client
			send     6
code_011d:
			ldi      0
			aTop     client
			ret     
		)
	)
	
	(method (set param1 param2 param3 param4 &tmp temp0 temp1 temp2 [temp3 50])
		(asm
			lag      global3
			sat      temp2
			push    
			ldi      0
			eq?     
			bnt      code_0170
			ldi      1
			sat      temp2
code_0170:
			lsp      param2
			ldi      60
			mul     
			push    
			lat      temp2
			div     
			sat      temp1
			lsp      argc
			ldi      2
			gt?     
			bnt      code_0192
			lst      temp1
			lsp      param3
			ldi      3600
			mul     
			push    
			lat      temp2
			div     
			add     
			sat      temp1
code_0192:
			lsp      argc
			ldi      3
			gt?     
			bnt      code_01ad
			lst      temp1
			lsp      param4
			ldi      3600
			mul     
			push    
			lat      temp2
			div     
			push    
			ldi      60
			mul     
			add     
			sat      temp1
code_01ad:
			pTos     -info-
			ldi      32768
			and     
			bnt      code_01be
			pushi    #new
			pushi    0
			self     4
			jmp      code_01bf
code_01be:
			selfID  
code_01bf:
			sat      temp0
			pushi    #init
			pushi    1
			lsp      param1
			pushi    146
			pushi    1
			lst      temp1
			send     12
			lat      temp0
			ret     
		)
	)
	
	(method (setCycle theCycler sendParams &tmp temp0)
		(asm
			pTos     -info-
			ldi      32768
			and     
			bnt      code_014c
			pushi    #new
			pushi    0
			self     4
			jmp      code_014d
code_014c:
			selfID  
code_014d:
			sat      temp0
			pushi    #init
			pushi    1
			lsp      theCycler
			pushi    146
			pushi    1
			lsp      sendParams
			send     12
			lat      temp0
			ret     
		)
	)
	
	(method (setReal param1 param2 param3 param4 &tmp temp0 temp1)
		(asm
			lap      param2
			sat      temp1
			lsp      argc
			ldi      2
			gt?     
			bnt      code_01e9
			lst      temp1
			lsp      param3
			ldi      60
			mul     
			add     
			sat      temp1
code_01e9:
			lsp      argc
			ldi      3
			gt?     
			bnt      code_01fc
			lst      temp1
			lsp      param4
			ldi      3600
			mul     
			add     
			sat      temp1
code_01fc:
			pTos     -info-
			ldi      32768
			and     
			bnt      code_020d
			pushi    #new
			pushi    0
			self     4
			jmp      code_020e
code_020d:
			selfID  
code_020e:
			sat      temp0
			pushi    #init
			pushi    1
			lsp      param1
			pushi    133
			pushi    1
			lst      temp1
			send     12
			lat      temp0
			ret     
		)
	)
	
	(method (delete)
		(asm
			pTos     client
			ldi      0
			eq?     
			bnt      code_0138
			pushi    #delete
			pushi    1
			pushSelf
			lag      global7
			send     6
			pushi    #dispose
			pushi    0
			super    Obj,  4
code_0138:
			ret     
		)
	)
	
	(method (set60ths param1 param2 &tmp temp0)
		(asm
			pushi    0
			callk    GetTime,  0
			aTop     lastTime
			pTos     -info-
			ldi      32768
			and     
			bnt      code_0239
			pushi    #new
			pushi    0
			self     4
			jmp      code_023a
code_0239:
			selfID  
code_023a:
			sat      temp0
			pushi    #init
			pushi    1
			lsp      param1
			pushi    147
			pushi    1
			lsp      param2
			pushi    148
			pushi    1
			pushi    0
			callk    GetTime,  0
			push    
			lat      temp0
			send     18
			lat      temp0
			ret     
		)
	)
)

(class TO of Obj
	(properties
		timeLeft 0
	)
	
	(method (doit)
		(asm
			pToa     timeLeft
			bnt      code_02c0
			dpToa    timeLeft
code_02c0:
			ret     
		)
	)
	
	(method (set param1)
		(asm
			lap      param1
			aTop     timeLeft
			ret     
		)
	)
)
