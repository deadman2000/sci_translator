;;; Sierra Script 1.0 - (do not remove this comment)
(script# 314)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n851)
(use n852)
(use n950)
(use n992)
(use n998)
(use n999)

(public
	scholar3 0
)

(local
	local0 =  1
	local1
	[local2 7] = [1314 0 1 2 1 2]
	[local9 4] = [1314 5 2]
	[local13 4] = [1314 6 2]
	[local17 4] = [1314 8 2]
	[local21 4] = [1314 7 2]
	[local25 5] = [1314 9 1 2]
	[local30 5] = [1314 11 1 2]
	[local35 5] = [1314 13 2 2]
	[local40 4] = [1314 15 2]
	[local44 4] = [1314 16 2]
	[local48 5] = [1314 17 2 2]
	[local53 4] = [1314 19 2]
	[local57 6] = [1314 20 2 1 2]
	local63
	[local64 5]
	local69
	local70
	local71
	local72
	local73
	local74
	local75
	[local76 9] = [323 3 2 4 25 35 20 25 24]
)
(instance scholar3 of Actor
	(properties
		cycleSpeed 10
		moveSpeed 10
	)
	
	(method (init param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2)
		(asm
			lap      param2
			sal      local75
			lap      param1
			sal      local74
			lap      param5
			bnt      code_0043
			lsl      local74
			ldi      0
			gt?     
			bnt      code_002d
			pushi    801
			lap      param5
			sub     
			sap      param5
code_002d:
			lsp      param5
			lsp      param4
			ldi      1
			sub     
			mul     
			push    
			ldi      801
			div     
			push    
			ldi      1
			add     
			sat      temp0
			jmp      code_0054
code_0043:
			lsl      local74
			ldi      0
			gt?     
			bnt      code_0050
			ldi      0
			jmp      code_0052
code_0050:
			lap      param4
code_0052:
			sat      temp0
code_0054:
			lsl      local74
			ldi      0
			gt?     
			bnt      code_006a
			lst      temp0
			ldi      1
			add     
			sat      temp1
			lap      param4
			sat      temp2
			jmp      code_0075
code_006a:
			lst      temp0
			ldi      1
			sub     
			sat      temp1
			ldi      0
			sat      temp2
code_0075:
			pushi    #init
			pushi    0
			super    Actor,  4
			pushi    5
			pushi    1
			pushi    #mapKeyToDir
			pushi    150
			pushi    1
			class    SyncWalk
			push    
			pushi    284
			pushi    2
			pushi    2
			lsp      param3
			lst      temp0
			ldi      2
			mul     
			sat      temp0
			push    
			calle    proc999_6,  4
			push    
			pushi    2
			lsp      param3
			lst      temp0
			ldi      1
			add     
			push    
			calle    proc999_6,  4
			push    
			pushi    283
			pushi    5
			class    PPath
			push    
			lsp      param3
			lst      temp1
			lst      temp2
			lofsa    leave
			push    
			self     34
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lsg      global197
			ldi      2
			eq?     
			bnt      code_02b1
			ldi      3
			sag      global197
code_02b1:
			pushi    #dispose
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_01b0
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_00e5
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0295
code_00e5:
			pushi    #distanceTo
			pushi    1
			lofsa    scholar3
			push    
			lag      global0
			send     6
			push    
			ldi      50
			gt?     
			bt       code_0114
			pushi    #x
			pushi    0
			lofsa    scholar3
			send     4
			push    
			ldi      312
			gt?     
			bt       code_0114
			pushi    #x
			pushi    0
			lofsa    scholar3
			send     4
			push    
			ldi      5
			lt?     
code_0114:
			bnt      code_0123
			pushi    2
			pushi    1311
			pushi    0
			calle    proc13_4,  4
			jmp      code_0295
code_0123:
			lag      global197
			bnt      code_01a1
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_014c
			pushi    5
			lea      @local25
			push    
			pushi    999
			lea      @local76
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			ldi      2
			sag      global197
			jmp      code_019d
code_014c:
			dup     
			ldi      2
			eq?     
			bnt      code_016b
			pushi    5
			lea      @local21
			push    
			pushi    999
			lea      @local76
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_019d
code_016b:
			dup     
			ldi      3
			eq?     
			bnt      code_0181
			pushi    #setScript
			pushi    1
			lofsa    converse
			push    
			lag      global2
			send     6
			jmp      code_019d
code_0181:
			dup     
			ldi      4
			eq?     
			bnt      code_019d
			pushi    5
			lea      @local44
			push    
			pushi    999
			lea      @local76
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
code_019d:
			toss    
			jmp      code_0295
code_01a1:
			pushi    #setScript
			pushi    1
			lofsa    converse
			push    
			lag      global2
			send     6
			jmp      code_0295
code_01b0:
			dup     
			ldi      2
			eq?     
			bnt      code_01d9
			lal      local0
			bnt      code_01cc
			pushi    2
			pushi    1311
			pushi    2
			calle    proc13_4,  4
			ldi      0
			sal      local0
			jmp      code_0295
code_01cc:
			pushi    2
			pushi    1311
			pushi    3
			calle    proc13_4,  4
			jmp      code_0295
code_01d9:
			dup     
			ldi      4
			eq?     
			bnt      code_028a
			pushi    #distanceTo
			pushi    1
			lofsa    scholar3
			push    
			lag      global0
			send     6
			push    
			ldi      50
			gt?     
			bt       code_020f
			pushi    #x
			pushi    0
			lofsa    scholar3
			send     4
			push    
			ldi      312
			gt?     
			bt       code_020f
			pushi    #x
			pushi    0
			lofsa    scholar3
			send     4
			push    
			ldi      5
			lt?     
code_020f:
			bnt      code_021e
			pushi    2
			pushi    1311
			pushi    0
			calle    proc13_4,  4
			jmp      code_0295
code_021e:
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_023f
			pushi    5
			lea      @local48
			push    
			pushi    999
			lea      @local76
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0286
code_023f:
			dup     
			ldi      0
			eq?     
			bnt      code_027b
			lag      global197
			bnt      code_0263
			pushi    5
			lea      @local53
			push    
			pushi    999
			lea      @local76
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0286
code_0263:
			pushi    5
			lea      @local57
			push    
			pushi    999
			lea      @local76
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0286
code_027b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0286:
			toss    
			jmp      code_0295
code_028a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0295:
			toss    
			ret     
		)
	)
	
	(method (delete)
		(asm
			pushi    #delete
			pushi    0
			super    Actor,  4
			pushi    1
			pushi    314
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance leave of CueObj
	(properties)
	
	(method (cue &tmp temp0)
		(asm
			pushi    3
			lsl      local75
			lsl      local74
			lofsa    scholar3
			push    
			calle    proc311_1,  6
			ret     
		)
	)
)

(instance showIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03bc
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    scholar3
			send     8
			jmp      code_0482
code_03bc:
			dup     
			ldi      1
			eq?     
			bnt      code_0422
			pushi    12
			pushi    3
			pushi    71
			pushi    12
			pushi    0
			callk    CelHigh,  6
			add     
			sal      local69
			pushi    245
			pushi    3
			pushi    71
			pushi    12
			pushi    0
			callk    CelWide,  6
			add     
			sal      local70
			pushi    6
			pushi    7
			pushi    12
			pushi    245
			lsl      local69
			push    
			pushi    3
			callk    Graph,  12
			sal      local71
			pushi    7
			pushi    71
			pushi    12
			pushi    0
			pushi    245
			pushi    12
			pushi    15
			pushi    1
			callk    DrawCel,  14
			pushi    7
			pushi    71
			lal      local63
			lsli     local64
			pushi    0
			pushi    256
			pushi    14
			pushi    15
			pushi    1
			callk    DrawCel,  14
			ldi      1
			aTop     cycles
			jmp      code_0482
code_0422:
			dup     
			ldi      2
			eq?     
			bnt      code_0439
			pushi    0
			calle    proc851_1,  0
			sal      local1
			ldi      2
			aTop     cycles
			jmp      code_0482
code_0439:
			dup     
			ldi      3
			eq?     
			bnt      code_045f
			pushi    2
			pushi    8
			lsl      local71
			callk    Graph,  4
			pushi    6
			pushi    12
			dup     
			pushi    245
			lsl      local69
			lsl      local70
			pushi    1
			callk    Graph,  12
			ldi      2
			aTop     cycles
			jmp      code_0482
code_045f:
			dup     
			ldi      4
			eq?     
			bnt      code_0476
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    scholar3
			send     8
			jmp      code_0482
code_0476:
			dup     
			ldi      5
			eq?     
			bnt      code_0482
			pushi    #dispose
			pushi    0
			self     4
code_0482:
			toss    
			ret     
		)
	)
)

(instance converse of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    59
			pushi    1
			lsl      local72
			pushi    6
			pushi    1
			lsl      local73
			lofsa    scholar3
			send     18
			pushi    #dispose
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 [temp2 70])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_055a
			pushi    0
			callb    proc0_3,  0
			ldi      0
			sat      temp0
code_04d4:
			lst      temp0
			ldi      5
			lt?     
			bnt      code_0519
			pushi    2
			pushi    1
			pushi    11
			callk    Random,  4
			aTop     register
			pTos     register
			lag      global123
			le?     
			bnt      code_04ef
			dpToa    register
code_04ef:
			pTos     register
			lat      temp0
			sali     local64
			ldi      0
			sat      temp1
code_04f9:
			lst      temp1
			lat      temp0
			lt?     
			bnt      code_0514
			lat      temp1
			lsli     local64
			lat      temp0
			lali     local64
			eq?     
			bnt      code_050f
			-at      temp0
code_050f:
			+at      temp1
			jmp      code_04f9
code_0514:
			+at      temp0
			jmp      code_04d4
code_0519:
			pushi    #mover
			pushi    0
			lofsa    scholar3
			send     4
			sal      local72
			pushi    #loop
			pushi    0
			lofsa    scholar3
			send     4
			sal      local73
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar3
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			push    
			pushi    59
			pushi    1
			pushi    0
			lofsa    scholar3
			send     12
			pushi    3
			lsg      global0
			lofsa    scholar3
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_06db
code_055a:
			dup     
			ldi      1
			eq?     
			bnt      code_0581
			pushi    6
			pushi    #superClass
			pushi    #loop
			pushi    0
			lofsa    scholar3
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			lofsa    scholar3
			send     12
			ldi      2
			aTop     cycles
			jmp      code_06db
code_0581:
			dup     
			ldi      2
			eq?     
			bnt      code_05c7
			lsg      global197
			ldi      3
			eq?     
			bnt      code_05af
			pTos     state
			ldi      2
			add     
			aTop     state
			pushi    5
			lea      @local30
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_06db
code_05af:
			pushi    5
			lea      @local2
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_06db
code_05c7:
			dup     
			ldi      3
			eq?     
			bnt      code_0612
			pushi    3
			pushi    1314
			pushi    4
			lea      @temp2
			push    
			callk    GetFarText,  6
			pushi    3
			pushi    1317
			lsg      global123
			lea      @temp2
			push    
			pushi    1
			lea      @temp2
			push    
			callk    StrLen,  2
			add     
			push    
			callk    GetFarText,  6
			pushi    #show
			pushi    0
			pushi    509
			pushi    5
			lea      @temp2
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			pushi    2
			pushi    851
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_06db
code_0612:
			dup     
			ldi      4
			eq?     
			bnt      code_0631
			pushi    5
			lea      @local9
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_06db
code_0631:
			dup     
			ldi      5
			eq?     
			bnt      code_0646
			pushi    #setScript
			pushi    2
			lofsa    showIt
			push    
			pushSelf
			self     8
			jmp      code_06db
code_0646:
			dup     
			ldi      6
			eq?     
			bnt      code_06cb
			lsg      global197
			ldi      3
			eq?     
			bnt      code_068e
			lal      local1
			bnt      code_0672
			pushi    5
			lea      @local35
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0687
code_0672:
			pushi    5
			lea      @local40
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
code_0687:
			ldi      4
			sag      global197
			jmp      code_06db
code_068e:
			lal      local1
			bnt      code_06af
			ldi      1
			sag      global197
			pushi    5
			lea      @local17
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_06db
code_06af:
			ldi      2
			sag      global197
			pushi    5
			lea      @local13
			push    
			pushi    999
			lea      @local76
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_06db
code_06cb:
			dup     
			ldi      7
			eq?     
			bnt      code_06db
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_06db:
			toss    
			ret     
		)
	)
)
