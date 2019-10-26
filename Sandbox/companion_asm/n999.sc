;;; Sierra Script 1.0 - (do not remove this comment)
(script# 999)
(include sci.sh)
(use n000)
(use n255)

(public
	proc999_0 0
	proc999_1 1
	proc999_2 2
	proc999_3 3
	proc999_4 4
	proc999_5 5
	proc999_6 6
	proc999_7 7
)

(procedure (proc999_0 param1)
	(asm
		lsp      param1
		ldi      0
		lt?     
		bnt      code_0037
		ldi      65535
		jmp      code_003c
code_0037:
		lsp      param1
		ldi      0
		gt?     
code_003c:
		ret     
	)
)

(procedure (proc999_1 param1 param2)
	(asm
		lsp      param1
		lsp      param2
		lsp      param1
		lap      param2
		div     
		mul     
		sub     
		sap      param1
		push    
		ldi      0
		lt?     
		bnt      code_0058
		lsp      param1
		lap      param2
		add     
		sap      param1
code_0058:
		lap      param1
		ret     
	)
)

(procedure (proc999_2 param1 param2 &tmp temp0)
	(asm
		lsp      argc
		ldi      1
		eq?     
		bt       code_0071
		lsp      param1
		pushi    0
		&rest    param2
		call     localproc_005b,  0
		sat      temp0
		lt?     
code_0071:
		bnt      code_0079
		lap      param1
		jmp      code_007b
code_0079:
		lat      temp0
code_007b:
		ret     
	)
)

(procedure (proc999_3 param1 param2 &tmp temp0)
	(asm
		lsp      argc
		ldi      1
		eq?     
		bt       code_0092
		lsp      param1
		pushi    0
		&rest    param2
		call     localproc_007c,  0
		sat      temp0
		gt?     
code_0092:
		bnt      code_009a
		lap      param1
		jmp      code_009c
code_009a:
		lat      temp0
code_009c:
		ret     
	)
)

(procedure (proc999_4 param1 param2 param3 param4 param5 param6)
	(asm
		lsp      param1
		lsp      argc
		ldi      6
		lt?     
		bnt      code_00b1
		pushi    #x
		pushi    0
		lap      param5
		send     4
		jmp      code_00b3
code_00b1:
		lap      param5
code_00b3:
		le?     
		bnt      code_00dc
		pprev   
		lap      param3
		le?     
		bnt      code_00dc
		lsp      param2
		lsp      argc
		ldi      6
		lt?     
		bnt      code_00d2
		pushi    #y
		pushi    0
		lap      param5
		send     4
		jmp      code_00d4
code_00d2:
		lap      param6
code_00d4:
		le?     
		bnt      code_00dc
		pprev   
		lap      param4
		le?     
code_00dc:
		ret     
	)
)

(procedure (proc999_5 param1 param2 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_00e3:
		lst      temp0
		lsp      argc
		ldi      1
		sub     
		lt?     
		bnt      code_0105
		lsp      param1
		lat      temp0
		lapi     param2
		eq?     
		bnt      code_0100
		lap      param1
		bt       code_00ff
		ldi      1
code_00ff:
		ret     
code_0100:
		+at      temp0
		jmp      code_00e3
code_0105:
		ldi      0
		ret     
	)
)

(procedure (proc999_6 param1 param2)
	(asm
		pushi    2
		pushi    5
		lsp      param1
		pushi    2
		lap      param2
		mul     
		add     
		push    
		callk    Memory,  4
		ret     
	)
)

(procedure (proc999_7 param1 param2 param3)
	(asm
		lsp      param2
		pushi    0
		&rest    param3
		lap      param1
		send     4
		ret     
	)
)

(class Obj
	(properties)
	
	(method (new)
		(asm
			pushi    1
			pushSelf
			callk    Clone,  2
			ret     
		)
	)
	
	(method (init)
		(asm
			ret     
		)
	)
	
	(method (doit)
		(asm
			selfID  
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushSelf
			callk    DisposeClone,  2
			ret     
		)
	)
	
	(method (showStr param1)
		(asm
			pushi    2
			lsp      param1
			pTos     name
			callk    StrCpy,  4
			ret     
		)
	)
	
	(method (showSelf &tmp [temp0 200])
		(asm
			pushi    1
			pushi    #showStr
			pushi    1
			lea      @temp0
			push    
			self     6
			push    
			calle    proc255_0,  2
			ret     
		)
	)
	
	(method (perform param1 param2)
		(asm
			pushi    #doit
			pushi    1
			pushSelf
			&rest    param2
			lap      param1
			send     6
			ret     
		)
	)
	
	(method (isKindOf param1 &tmp temp0)
		(asm
			pushi    #superClass
			pushi    0
			self     4
			sat      temp0
			pTos     species
			pushi    #species
			pushi    0
			lap      param1
			send     4
			eq?     
			bt       code_01a6
			pushi    1
			lst      temp0
			callk    IsObject,  2
			bnt      code_01a6
			pushi    #isKindOf
			pushi    1
			lsp      param1
			lat      temp0
			send     6
code_01a6:
			ret     
		)
	)
	
	(method (isMemberOf param1)
		(asm
			pushi    #-info-
			pushi    0
			lap      param1
			send     4
			push    
			ldi      32768
			and     
			bnt      code_017f
			pTos     -info-
			ldi      32768
			and     
			not     
			bnt      code_017f
			pTos     species
			pushi    #species
			pushi    0
			lap      param1
			send     4
			eq?     
code_017f:
			ret     
		)
	)
	
	(method (respondsTo param1)
		(asm
			pushi    2
			pushSelf
			lsp      param1
			callk    RespondsTo,  4
			ret     
		)
	)
	
	(method (yourself)
		(asm
			selfID  
			ret     
		)
	)
)

(class Code of Obj
	(properties)
	
	(method (doit)
		(asm
			ret     
		)
	)
)

(class Collect of Obj
	(properties
		elements 0
		size 0
	)
	
	(method (doit param1)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    60
			&rest    param1
			self     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     elements
			bnt      code_02c1
			pushi    #eachElementDo
			pushi    1
			pushi    108
			self     6
			pushi    1
			pTos     elements
			callk    DisposeList,  2
code_02c1:
			ldi      0
			aTop     elements
			aTop     size
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (showStr param1)
		(asm
			pushi    5
			lsp      param1
			pushi    999
			pushi    0
			pTos     name
			pTos     size
			callk    Format,  10
			ret     
		)
	)
	
	(method (showSelf &tmp [temp0 40])
		(asm
			pushi    1
			pushi    #showStr
			pushi    1
			lea      @temp0
			push    
			self     6
			push    
			calle    proc255_0,  2
			pushi    #eachElementDo
			pushi    1
			pushi    110
			self     6
			ret     
		)
	)
	
	(method (add param1 &tmp temp0 temp1 temp2)
		(asm
			pToa     elements
			not     
			bnt      code_0265
			pushi    0
			callk    NewList,  0
			aTop     elements
code_0265:
			ldi      0
			sat      temp1
code_0269:
			lst      temp1
			lap      argc
			lt?     
			bnt      code_0289
			pushi    2
			pTos     elements
			pushi    2
			lat      temp1
			lspi     param1
			lspi     param1
			callk    NewNode,  4
			push    
			callk    AddToEnd,  4
			ipToa    size
			+at      temp1
			jmp      code_0269
code_0289:
			selfID  
			ret     
		)
	)
	
	(method (delete param1 &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_0291:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_02ad
			pushi    2
			pTos     elements
			lat      temp0
			lspi     param1
			callk    DeleteKey,  4
			bnt      code_02a8
			dpToa    size
code_02a8:
			+at      temp0
			jmp      code_0291
code_02ad:
			selfID  
			ret     
		)
	)
	
	(method (eachElementDo param1 param2 &tmp temp0 temp1 temp2)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_02fe:
			lat      temp0
			bnt      code_032c
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp1
			pushi    1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			push    
			callk    IsObject,  2
			not     
			bnt      code_031c
			ret     
code_031c:
			lsp      param1
			pushi    0
			&rest    param2
			lat      temp2
			send     4
			lat      temp1
			sat      temp0
			jmp      code_02fe
code_032c:
			ret     
		)
	)
	
	(method (firstTrue param1 param2 &tmp temp0 temp1 temp2)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_0337:
			lat      temp0
			bnt      code_035f
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			lsp      param1
			pushi    0
			&rest    param2
			send     4
			bnt      code_0358
			lat      temp2
			ret     
code_0358:
			lat      temp1
			sat      temp0
			jmp      code_0337
code_035f:
			ldi      0
			ret     
		)
	)
	
	(method (allTrue param1 param2 &tmp temp0 temp1 temp2)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_036c:
			lat      temp0
			bnt      code_0395
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			lsp      param1
			pushi    0
			&rest    param2
			send     4
			not     
			bnt      code_038e
			ldi      0
			ret     
code_038e:
			lat      temp1
			sat      temp0
			jmp      code_036c
code_0395:
			ldi      1
			ret     
		)
	)
	
	(method (contains param1)
		(asm
			pushi    2
			pTos     elements
			lsp      param1
			callk    FindKey,  4
			ret     
		)
	)
	
	(method (isEmpty)
		(asm
			pTos     elements
			ldi      0
			eq?     
			bt       code_02ea
			pushi    1
			pTos     elements
			callk    EmptyList,  2
code_02ea:
			ret     
		)
	)
	
	(method (first)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			ret     
		)
	)
	
	(method (next param1)
		(asm
			pushi    1
			lsp      param1
			callk    NextNode,  2
			ret     
		)
	)
	
	(method (release &tmp temp0 temp1)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_03a2:
			lat      temp0
			bnt      code_03c1
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp1
			pushi    #delete
			pushi    1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			push    
			self     6
			lat      temp1
			sat      temp0
			jmp      code_03a2
code_03c1:
			ret     
		)
	)
)

(class List of Collect
	(properties
		elements 0
		size 0
	)
	
	(method (showStr param1)
		(asm
			pushi    5
			lsp      param1
			pushi    999
			pushi    1
			pTos     name
			pTos     size
			callk    Format,  10
			ret     
		)
	)
	
	(method (at param1 &tmp temp0)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_0440:
			lap      param1
			bnt      code_0457
			lat      temp0
			bnt      code_0457
			-ap      param1
			pushi    1
			lst      temp0
			callk    NextNode,  2
			sat      temp0
			jmp      code_0440
code_0457:
			lat      temp0
			bnt      code_0464
			pushi    1
			push    
			callk    NodeValue,  2
			jmp      code_0466
code_0464:
			ldi      0
code_0466:
			ret     
		)
	)
	
	(method (last)
		(asm
			pushi    1
			pTos     elements
			callk    LastNode,  2
			ret     
		)
	)
	
	(method (prev param1)
		(asm
			pushi    1
			lsp      param1
			callk    PrevNode,  2
			ret     
		)
	)
	
	(method (addToFront param1 &tmp temp0)
		(asm
			pToa     elements
			not     
			bnt      code_0483
			pushi    0
			callk    NewList,  0
			aTop     elements
code_0483:
			lsp      argc
			ldi      1
			sub     
			sat      temp0
code_048a:
			pushi    0
			lat      temp0
			le?     
			bnt      code_04a9
			pushi    2
			pTos     elements
			pushi    2
			lat      temp0
			lspi     param1
			lspi     param1
			callk    NewNode,  4
			push    
			callk    AddToFront,  4
			ipToa    size
			-at      temp0
			jmp      code_048a
code_04a9:
			selfID  
			ret     
		)
	)
	
	(method (addToEnd param1 &tmp temp0)
		(asm
			pToa     elements
			not     
			bnt      code_04b9
			pushi    0
			callk    NewList,  0
			aTop     elements
code_04b9:
			ldi      0
			sat      temp0
code_04bd:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_04dd
			pushi    2
			pTos     elements
			pushi    2
			lat      temp0
			lspi     param1
			lspi     param1
			callk    NewNode,  4
			push    
			callk    AddToEnd,  4
			ipToa    size
			+at      temp0
			jmp      code_04bd
code_04dd:
			selfID  
			ret     
		)
	)
	
	(method (addAfter param1 param2 &tmp temp0 temp1 temp2)
		(asm
			pushi    2
			pTos     elements
			lsp      param1
			callk    FindKey,  4
			sat      temp2
			bnt      code_0519
			-ap      argc
			ldi      0
			sat      temp0
code_04f4:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_0519
			pushi    3
			pTos     elements
			lst      temp2
			pushi    2
			lat      temp0
			lspi     param2
			lspi     param2
			callk    NewNode,  4
			push    
			callk    AddAfter,  6
			sat      temp2
			ipToa    size
			+at      temp0
			jmp      code_04f4
code_0519:
			selfID  
			ret     
		)
	)
	
	(method (indexOf param1 &tmp temp0 temp1)
		(asm
			ldi      0
			sat      temp0
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp1
code_0529:
			lat      temp1
			bnt      code_0549
			lsp      param1
			pushi    1
			push    
			callk    NodeValue,  2
			eq?     
			bnt      code_053c
			lat      temp0
			ret     
code_053c:
			+at      temp0
			pushi    1
			lst      temp1
			callk    NextNode,  2
			sat      temp1
			jmp      code_0529
code_0549:
			ldi      65535
			ret     
		)
	)
)

(class Set of List
	(properties
		elements 0
		size 0
	)
	
	(method (showStr param1)
		(asm
			pushi    5
			lsp      param1
			pushi    999
			pushi    2
			pTos     name
			pTos     size
			callk    Format,  10
			ret     
		)
	)
	
	(method (add param1 &tmp temp0 temp1 temp2)
		(asm
			pToa     elements
			not     
			bnt      code_05b6
			pushi    0
			callk    NewList,  0
			aTop     elements
code_05b6:
			ldi      0
			sat      temp1
code_05ba:
			lst      temp1
			lap      argc
			lt?     
			bnt      code_05e7
			lat      temp1
			lapi     param1
			sat      temp2
			pushi    #contains
			pushi    1
			push    
			self     6
			not     
			bnt      code_05e2
			pushi    2
			pTos     elements
			pushi    2
			lst      temp2
			dup     
			callk    NewNode,  4
			push    
			callk    AddToEnd,  4
			ipToa    size
code_05e2:
			+at      temp1
			jmp      code_05ba
code_05e7:
			ret     
		)
	)
)

(class EventHandler of Set
	(properties
		elements 0
		size 0
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 temp2)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_0626:
			lat      temp0
			bnt      code_0660
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_0660
			pushi    1
			lst      temp0
			callk    NextNode,  2
			sat      temp1
			pushi    1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			push    
			callk    IsObject,  2
			not     
			bt       code_0660
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lat      temp2
			send     6
			lat      temp1
			sat      temp0
			jmp      code_0626
code_0660:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
)

(class Script of Obj
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
	)
	
	(method (init param1 param2 param3)
		(asm
			lag      global88
			aTop     lastTicks
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0735
			pushi    #script
			pushi    1
			pushSelf
			lap      param1
			aTop     client
			send     6
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0735
			lap      param2
			aTop     caller
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0735
			lap      param3
			aTop     register
code_0735:
			pTos     start
			ldi      1
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			bnt      code_06a4
			pushi    #doit
			pushi    0
			send     4
code_06a4:
			pToa     cycles
			bnt      code_06b8
			dpToa    cycles
			not     
			bnt      code_0701
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0701
code_06b8:
			pToa     seconds
			bnt      code_06dd
			pushi    1
			pushi    1
			callk    GetTime,  2
			sat      temp0
			pTos     lastSeconds
			ne?     
			bnt      code_0701
			lat      temp0
			aTop     lastSeconds
			dpToa    seconds
			not     
			bnt      code_0701
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0701
code_06dd:
			pToa     ticks
			bnt      code_0701
			push    
			pushi    1
			lsg      global88
			pToa     lastTicks
			sub     
			push    
			callk    Abs,  2
			sub     
			aTop     ticks
			push    
			ldi      0
			le?     
			bnt      code_0701
			ldi      0
			aTop     ticks
			pushi    #cue
			pushi    0
			self     4
code_0701:
			lag      global88
			aTop     lastTicks
			ret     
		)
	)
	
	(method (dispose &tmp temp0)
		(asm
			pushi    1
			pTos     script
			callk    IsObject,  2
			bnt      code_0755
			pushi    #dispose
			pushi    0
			pToa     script
			send     4
code_0755:
			pushi    1
			pTos     timer
			callk    IsObject,  2
			bnt      code_0765
			pushi    #dispose
			pushi    0
			pToa     timer
			send     4
code_0765:
			pushi    1
			pTos     client
			callk    IsObject,  2
			bnt      code_07b7
			pushi    138
			pushi    1
			pushi    1
			pTos     next
			callk    IsObject,  2
			bnt      code_0780
			pToa     next
			jmp      code_078a
code_0780:
			pToa     next
			bnt      code_078a
			pushi    1
			push    
			callk    ScriptID,  2
code_078a:
			sat      temp0
			push    
			pToa     client
			send     6
			lat      temp0
			not     
			bnt      code_079c
			ldi      0
			jmp      code_07b7
code_079c:
			lsg      global13
			lag      global11
			eq?     
			bnt      code_07b0
			pushi    #init
			pushi    1
			pTos     client
			lat      temp0
			send     6
			jmp      code_07b7
code_07b0:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
code_07b7:
			pushi    1
			pTos     caller
			callk    IsObject,  2
			bnt      code_07d2
			lsg      global13
			lag      global11
			eq?     
			bnt      code_07d2
			pushi    #cue
			pushi    1
			pTos     register
			pToa     caller
			send     6
code_07d2:
			ldi      0
			aTop     caller
			aTop     next
			aTop     client
			aTop     timer
			aTop     script
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			pToa     client
			bnt      code_07fd
			pushi    140
			pushi    #superClass
			pTos     state
			ldi      1
			add     
			push    
			&rest    param1
			self     6
code_07fd:
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pToa     script
			bnt      code_0829
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_0829:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (setScript theScript sendParams)
		(asm
			pushi    1
			pTos     script
			callk    IsObject,  2
			bnt      code_080e
			pushi    #dispose
			pushi    0
			pToa     script
			send     4
code_080e:
			lap      theScript
			bnt      code_081b
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			send     6
code_081b:
			ret     
		)
	)
)

(class Event of Obj
	(properties
		type $0000
		message 0
		modifiers $0000
		y 0
		x 0
		claimed 0
		port 0
	)
	
	(method (new param1 &tmp temp0)
		(asm
			pushi    #new
			pushi    0
			super    Obj,  4
			sat      temp0
			pushi    2
			lap      argc
			bnt      code_08bb
			lap      param1
			jmp      code_08be
code_08bb:
			ldi      32767
code_08be:
			push    
			lst      temp0
			callk    GetEvent,  4
			lat      temp0
			ret     
		)
	)
	
	(method (localize &tmp temp0)
		(asm
			pTos     type
			ldi      16384
			ne?     
			bnt      code_0908
			pushi    0
			callk    GetPort,  0
			sat      temp0
			pToa     port
			not     
			bnt      code_08e6
			pushi    1
			pushSelf
			callk    GlobalToLocal,  2
			jmp      code_0904
code_08e6:
			pTos     port
			lat      temp0
			ne?     
			bnt      code_0904
			pushi    1
			pTos     port
			callk    SetPort,  2
			pushi    1
			pushSelf
			callk    LocalToGlobal,  2
			pushi    1
			lst      temp0
			callk    SetPort,  2
			pushi    1
			pushSelf
			callk    GlobalToLocal,  2
code_0904:
			lat      temp0
			aTop     port
code_0908:
			selfID  
			ret     
		)
	)
	
	(method (globalize &tmp temp0)
		(asm
			pTos     type
			ldi      16384
			ne?     
			bnt      code_0942
			pushi    0
			callk    GetPort,  0
			sat      temp0
			pTos     port
			eq?     
			bnt      code_0929
			pushi    1
			pushSelf
			callk    LocalToGlobal,  2
			jmp      code_093e
code_0929:
			pToa     port
			bnt      code_093e
			pushi    1
			push    
			callk    SetPort,  2
			pushi    1
			pushSelf
			callk    LocalToGlobal,  2
			pushi    1
			lst      temp0
			callk    SetPort,  2
code_093e:
			ldi      0
			aTop     port
code_0942:
			selfID  
			ret     
		)
	)
)
