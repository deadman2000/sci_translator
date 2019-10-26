;;; Sierra Script 1.0 - (do not remove this comment)
(script# 312)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n851)
(use n852)
(use n950)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	scholar1 0
)

(local
	local0
	local1
	local2 =  1
	[local3 9] = [323 6 2 4 25 35 20 25 22]
	local12
	[local13 11] = [1312 0 1 2 1 2 0 1312 4 1]
	[local24 4] = [1312 5 2]
	[local28 4] = [1312 6 1]
	[local32 4] = [1312 7 1]
	[local36 6] = [1312 8 2 1 2]
	[local42 4] = [1312 11 1]
	[local46 4] = [1312 14 1]
	[local50 4] = [1312 12 2]
	[local54 4] = [1312 13 1]
	[local58 5] = [1312 21 1 2]
	[local63 4] = [1312 19 1]
	[local67 4] = [1312 23 1]
	[local71 4] = [1312 17 1]
	[local75 4] = [1312 20 1]
	[local79 5] = [1312 15 1 1]
	[local84 4] = [1312 18 1]
	[local88 5] = [1312 24 1 2]
	[local93 4] = [1312 26 1]
	[local97 4] = [1312 27 1]
	[local101 7] = [1312 28 2 1 2 2]
	[local108 5] = [1312 32 1 1]
	local113
	local114
	local115
	local116
	local117
	local118
)
(instance scholar1 of Actor
	(properties
		cycleSpeed 10
		xStep 4
		moveSpeed 10
	)
	
	(method (init param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2)
		(asm
			lap      param2
			sal      local1
			lap      param1
			sal      local0
			lap      param5
			bnt      code_0043
			lsl      local0
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
			lsl      local0
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
			lsl      local0
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
			pushi    162
			pushi    1
			pushi    #sel_65535
			pushi    5
			pushi    1
			pushi    321
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
			lofsa    lv
			push    
			self     40
			pushi    #mover
			pushi    0
			lofsa    scholar1
			send     4
			sal      local114
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_01c7
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_00f5
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_02ba
code_00f5:
			pushi    #distanceTo
			pushi    1
			lofsa    scholar1
			push    
			lag      global0
			send     6
			push    
			ldi      50
			gt?     
			bt       code_0124
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			push    
			ldi      312
			gt?     
			bt       code_0124
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			push    
			ldi      5
			lt?     
code_0124:
			bnt      code_0133
			pushi    2
			pushi    1311
			pushi    0
			calle    proc13_4,  4
			jmp      code_02ba
code_0133:
			lsg      global195
			ldi      7
			eq?     
			bnt      code_0149
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_02ba
code_0149:
			lsg      global195
			dup     
			ldi      0
			eq?     
			bnt      code_0161
			pushi    #setScript
			pushi    1
			lofsa    converse
			push    
			lag      global2
			send     6
			jmp      code_01c3
code_0161:
			dup     
			ldi      1
			eq?     
			bnt      code_0177
			pushi    #setScript
			pushi    1
			lofsa    converse
			push    
			lag      global2
			send     6
			jmp      code_01c3
code_0177:
			dup     
			ldi      4
			eq?     
			bnt      code_018d
			pushi    #setScript
			pushi    1
			lofsa    waitForGive
			push    
			lag      global2
			send     6
			jmp      code_01c3
code_018d:
			dup     
			ldi      3
			eq?     
			bnt      code_01b0
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_01c3
			pushi    #setScript
			pushi    1
			lofsa    waitForGive
			push    
			lag      global2
			send     6
			jmp      code_01c3
code_01b0:
			dup     
			ldi      5
			eq?     
			bnt      code_01c3
			pushi    #setScript
			pushi    1
			lofsa    getMon
			push    
			lag      global2
			send     6
code_01c3:
			toss    
			jmp      code_02ba
code_01c7:
			dup     
			ldi      2
			eq?     
			bnt      code_01f0
			lal      local2
			bnt      code_01e3
			pushi    2
			pushi    1311
			pushi    2
			calle    proc13_4,  4
			ldi      0
			sal      local2
			jmp      code_02ba
code_01e3:
			pushi    2
			pushi    1311
			pushi    3
			calle    proc13_4,  4
			jmp      code_02ba
code_01f0:
			dup     
			ldi      3
			eq?     
			bnt      code_0204
			pushi    2
			pushi    1311
			pushi    4
			calle    proc13_4,  4
			jmp      code_02ba
code_0204:
			dup     
			ldi      4
			eq?     
			bnt      code_02af
			pushi    #distanceTo
			pushi    1
			lofsa    scholar1
			push    
			lag      global0
			send     6
			push    
			ldi      50
			gt?     
			bt       code_023a
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			push    
			ldi      312
			gt?     
			bt       code_023a
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			push    
			ldi      5
			lt?     
code_023a:
			bnt      code_0249
			pushi    2
			pushi    1311
			pushi    1
			calle    proc13_4,  4
			jmp      code_02ba
code_0249:
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_028a
			pushi    1
			pushi    203
			callb    proc0_5,  2
			bt       code_0269
			pushi    #script
			pushi    0
			lag      global2
			send     4
			push    
			lofsa    waitForGive
			eq?     
code_0269:
			bnt      code_027b
			pushi    #setScript
			pushi    1
			lofsa    give
			push    
			lag      global2
			send     6
			jmp      code_02ab
code_027b:
			pushi    #setScript
			pushi    1
			lofsa    noTake
			push    
			lag      global2
			send     6
			jmp      code_02ab
code_028a:
			dup     
			ldi      0
			eq?     
			bnt      code_02a0
			pushi    #setScript
			pushi    1
			lofsa    giveMon
			push    
			lag      global2
			send     6
			jmp      code_02ab
code_02a0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_02ab:
			toss    
			jmp      code_02ba
code_02af:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_02ba:
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
			pushi    312
			callk    DisposeScript,  2
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
			bnt      code_03e0
			pToa     register
			bnt      code_0370
			lag      global123
			aTop     register
			jmp      code_0383
code_0370:
			pushi    2
			pushi    1
			pushi    11
			callk    Random,  4
			aTop     register
			pTos     register
			lag      global123
			le?     
			bnt      code_0383
			dpToa    register
code_0383:
			pushi    12
			pushi    3
			pushi    71
			pushi    12
			pushi    0
			callk    CelHigh,  6
			add     
			sal      local116
			pushi    245
			pushi    3
			pushi    71
			pushi    12
			pushi    0
			callk    CelWide,  6
			add     
			sal      local117
			pushi    6
			pushi    7
			pushi    12
			pushi    245
			lsl      local116
			push    
			pushi    3
			callk    Graph,  12
			sal      local118
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
			pTos     register
			pushi    0
			pushi    256
			pushi    14
			pushi    15
			pushi    1
			callk    DrawCel,  14
			ldi      1
			aTop     cycles
			jmp      code_0446
code_03e0:
			dup     
			ldi      1
			eq?     
			bnt      code_03fd
			pushi    6
			pushi    1
			lsl      local12
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0446
code_03fd:
			dup     
			ldi      2
			eq?     
			bnt      code_0414
			pushi    0
			calle    proc851_1,  0
			sal      local113
			ldi      2
			aTop     cycles
			jmp      code_0446
code_0414:
			dup     
			ldi      3
			eq?     
			bnt      code_043a
			pushi    2
			pushi    8
			lsl      local118
			callk    Graph,  4
			pushi    6
			pushi    12
			dup     
			pushi    245
			lsl      local116
			lsl      local117
			pushi    1
			callk    Graph,  12
			ldi      2
			aTop     cycles
			jmp      code_0446
code_043a:
			dup     
			ldi      4
			eq?     
			bnt      code_0446
			pushi    #dispose
			pushi    0
			self     4
code_0446:
			toss    
			ret     
		)
	)
)

(instance converse of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 70])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04c3
			pushi    0
			callb    proc0_3,  0
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar1
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
			lofsa    scholar1
			send     12
			pushi    2
			lsg      global0
			lofsa    scholar1
			push    
			callb    proc0_9,  4
			ldi      10
			aTop     ticks
			jmp      code_0724
code_04c3:
			dup     
			ldi      1
			eq?     
			bnt      code_04f3
			lsg      global195
			ldi      1
			ne?     
			bnt      code_04ea
			pushi    5
			lea      @local13
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0724
code_04ea:
			ipToa    state
			ldi      2
			aTop     cycles
			jmp      code_0724
code_04f3:
			dup     
			ldi      2
			eq?     
			bnt      code_053e
			pushi    3
			pushi    1312
			pushi    4
			lea      @temp0
			push    
			callk    GetFarText,  6
			pushi    3
			pushi    1317
			lsg      global123
			lea      @temp0
			push    
			pushi    1
			lea      @temp0
			push    
			callk    StrLen,  2
			add     
			push    
			callk    GetFarText,  6
			pushi    #show
			pushi    0
			pushi    509
			pushi    5
			lea      @temp0
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
			jmp      code_0724
code_053e:
			dup     
			ldi      3
			eq?     
			bnt      code_057d
			lsg      global195
			ldi      1
			lt?     
			bnt      code_0565
			pushi    5
			lea      @local24
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0724
code_0565:
			pushi    5
			lea      @local50
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0724
code_057d:
			dup     
			ldi      4
			eq?     
			bnt      code_05a8
			pushi    6
			pushi    #superClass
			pushi    #loop
			pushi    0
			lofsa    scholar1
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    scholar1
			send     20
			jmp      code_0724
code_05a8:
			dup     
			ldi      5
			eq?     
			bnt      code_05d4
			lsg      global195
			ldi      1
			ne?     
			bnt      code_05bf
			lea      @local28
			sal      local12
			jmp      code_05c4
code_05bf:
			lea      @local32
			sal      local12
code_05c4:
			pushi    #setScript
			pushi    3
			lofsa    showIt
			push    
			pushSelf
			pushi    0
			self     10
			jmp      code_0724
code_05d4:
			dup     
			ldi      6
			eq?     
			bnt      code_05e2
			ldi      2
			aTop     cycles
			jmp      code_0724
code_05e2:
			dup     
			ldi      7
			eq?     
			bnt      code_05f9
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    scholar1
			send     8
			jmp      code_0724
code_05f9:
			dup     
			ldi      8
			eq?     
			bnt      code_0639
			lal      local113
			bnt      code_0629
			pushi    6
			pushi    1
			lea      @local42
			push    
			lea      @local3
			push    
			pushi    3
			pushi    0
			pushi    1
			calle    proc851_0,  12
			ldi      1
			sag      global195
			pushi    #changeState
			pushi    1
			pushi    12
			self     6
			jmp      code_0724
code_0629:
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    scholar1
			send     8
			jmp      code_0724
code_0639:
			dup     
			ldi      9
			eq?     
			bnt      code_0655
			lea      @local32
			sal      local12
			pushi    #setScript
			pushi    3
			lofsa    showIt
			push    
			pushSelf
			pushi    1
			self     10
			jmp      code_0724
code_0655:
			dup     
			ldi      10
			eq?     
			bnt      code_066c
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    scholar1
			send     8
			jmp      code_0724
code_066c:
			dup     
			ldi      11
			eq?     
			bnt      code_06e0
			lal      local113
			bnt      code_06c4
			pushi    1
			pushi    203
			callb    proc0_6,  2
			pushi    5
			lea      @local36
			push    
			pushi    999
			lea      @local3
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			lsg      global195
			ldi      1
			lt?     
			bnt      code_06a8
			pushi    1
			pushi    100
			calle    proc806_1,  2
			jmp      code_06b1
code_06a8:
			pushi    1
			pushi    50
			calle    proc806_1,  2
code_06b1:
			ldi      2
			sag      global195
			pushi    #setScript
			pushi    1
			lofsa    waitForGive
			push    
			lag      global2
			send     6
			jmp      code_0724
code_06c4:
			pushi    6
			pushi    1
			lea      @local42
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			ldi      1
			sag      global195
			jmp      code_0724
code_06e0:
			dup     
			ldi      12
			eq?     
			bnt      code_0714
			pushi    150
			pushi    #superClass
			class    SyncWalk
			push    
			pushi    59
			pushi    1
			lsl      local114
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local114
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			lt?     
			push    
			lofsa    scholar1
			send     18
			ldi      2
			aTop     cycles
			jmp      code_0724
code_0714:
			dup     
			ldi      13
			eq?     
			bnt      code_0724
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0724:
			toss    
			ret     
		)
	)
)

(instance waitForGive of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_079a
			pushi    0
			callb    proc0_3,  0
			pushi    #canInput
			pushi    1
			pushi    1
			class    User
			send     6
			pushi    #enable
			pushi    2
			pushi    7
			pushi    6
			pushi    206
			pushi    1
			pushi    #at
			pushi    1
			pushi    7
			lag      global69
			send     6
			push    
			lag      global69
			send     14
			ldi      4
			aTop     cycles
			jmp      code_088e
code_079a:
			dup     
			ldi      1
			eq?     
			bnt      code_07b4
			pushi    #setCursor
			pushi    2
			pushi    999
			pushi    1
			lag      global1
			send     8
			ldi      4
			aTop     cycles
			jmp      code_088e
code_07b4:
			dup     
			ldi      2
			eq?     
			bnt      code_0815
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar1
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
			lofsa    scholar1
			send     12
			pushi    3
			lsg      global195
			pushi    4
			pushi    3
			calle    proc999_5,  6
			bnt      code_0802
			pushi    6
			pushi    1
			lea      @local46
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_088e
code_0802:
			lsg      global195
			ldi      2
			eq?     
			bnt      code_080e
			ldi      3
			sag      global195
code_080e:
			ldi      2
			aTop     cycles
			jmp      code_088e
code_0815:
			dup     
			ldi      3
			eq?     
			bnt      code_0823
			ldi      7
			aTop     seconds
			jmp      code_088e
code_0823:
			dup     
			ldi      4
			eq?     
			bnt      code_0842
			pushi    6
			pushi    1
			lea      @local54
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_088e
code_0842:
			dup     
			ldi      5
			eq?     
			bnt      code_087a
			pushi    0
			callb    proc0_3,  0
			pushi    150
			pushi    #superClass
			class    SyncWalk
			push    
			pushi    59
			pushi    1
			lsl      local114
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local114
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			lt?     
			push    
			lofsa    scholar1
			send     18
			ldi      5
			aTop     ticks
			jmp      code_088e
code_087a:
			dup     
			ldi      6
			eq?     
			bnt      code_088e
			pushi    0
			callb    proc0_4,  0
			ldi      4
			sag      global195
			pushi    #dispose
			pushi    0
			self     4
code_088e:
			toss    
			ret     
		)
	)
)

(instance lv of CueObj
	(properties)
	
	(method (cue &tmp temp0)
		(asm
			pushi    3
			lsl      local1
			lsl      local0
			lofsa    scholar1
			push    
			calle    proc311_1,  6
			ret     
		)
	)
)

(instance getMon of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0962
			lsg      global195
			ldi      5
			ne?     
			bnt      code_0948
			pushi    6
			pushi    1
			lea      @local84
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_09c5
code_0948:
			ipToa    state
			pushi    5
			lea      @local58
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_09c5
code_0962:
			dup     
			ldi      1
			eq?     
			bnt      code_097f
			pushi    6
			pushi    1
			lea      @local63
			push    
			pushi    999
			pushi    0
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_09c5
code_097f:
			dup     
			ldi      2
			eq?     
			bnt      code_09c5
			pushi    #put
			pushi    1
			pushi    7
			lag      global133
			send     6
			pushi    #put
			pushi    1
			pushi    6
			lag      global134
			send     6
			pushi    #put
			pushi    1
			pushi    5
			lag      global135
			send     6
			pushi    1
			pushi    58
			callb    proc0_5,  2
			not     
			bnt      code_09b5
			ldi      6
			sag      global195
			jmp      code_09c0
code_09b5:
			ldi      7
			sag      global195
			pushi    1
			pushi    217
			callb    proc0_6,  2
code_09c0:
			pushi    #dispose
			pushi    0
			self     4
code_09c5:
			toss    
			ret     
		)
	)
)

(instance noTake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a3f
			pushi    0
			callb    proc0_3,  0
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar1
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
			lofsa    scholar1
			send     12
			pushi    3
			lsg      global0
			lofsa    scholar1
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0abe
code_0a3f:
			dup     
			ldi      1
			eq?     
			bnt      code_0a57
			pushi    2
			lofsa    scholar1
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      10
			aTop     ticks
			jmp      code_0abe
code_0a57:
			dup     
			ldi      2
			eq?     
			bnt      code_0a76
			pushi    5
			lea      @local88
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0abe
code_0a76:
			dup     
			ldi      3
			eq?     
			bnt      code_0aaa
			pushi    150
			pushi    #superClass
			class    SyncWalk
			push    
			pushi    59
			pushi    1
			lsl      local114
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local114
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			lt?     
			push    
			lofsa    scholar1
			send     18
			ldi      2
			aTop     cycles
			jmp      code_0abe
code_0aaa:
			dup     
			ldi      4
			eq?     
			bnt      code_0abe
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0abe:
			toss    
			ret     
		)
	)
)

(instance giveMon of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b37
			pushi    0
			callb    proc0_3,  0
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar1
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
			lofsa    scholar1
			send     12
			pushi    3
			lsg      global0
			lofsa    scholar1
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0c66
code_0b37:
			dup     
			ldi      1
			eq?     
			bnt      code_0b70
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_0b65
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    2
			lofsa    scholar1
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      2
			aTop     cycles
			jmp      code_0c66
code_0b65:
			pushi    #changeState
			pushi    1
			pushi    4
			self     6
			jmp      code_0c66
code_0b70:
			dup     
			ldi      2
			eq?     
			bnt      code_0bd8
			lsg      global195
			ldi      5
			eq?     
			bnt      code_0b97
			pushi    5
			lea      @local101
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0c66
code_0b97:
			pushi    3
			lsg      global195
			pushi    6
			pushi    7
			calle    proc999_5,  6
			bnt      code_0bc0
			pushi    6
			pushi    1
			lea      @local97
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0c66
code_0bc0:
			pushi    6
			pushi    1
			lea      @local93
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0c66
code_0bd8:
			dup     
			ldi      3
			eq?     
			bnt      code_0c1e
			lsg      global195
			ldi      5
			eq?     
			bnt      code_0c17
			pushi    0
			calle    proc851_1,  0
			bnt      code_0bff
			pushi    #setScript
			pushi    2
			lofsa    getMon
			push    
			pushSelf
			self     8
			jmp      code_0c66
code_0bff:
			pushi    6
			pushi    1
			lea      @local108
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0c66
code_0c17:
			ldi      2
			aTop     cycles
			jmp      code_0c66
code_0c1e:
			dup     
			ldi      4
			eq?     
			bnt      code_0c52
			pushi    150
			pushi    #superClass
			class    SyncWalk
			push    
			pushi    59
			pushi    1
			lsl      local114
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local114
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			lt?     
			push    
			lofsa    scholar1
			send     18
			ldi      2
			aTop     cycles
			jmp      code_0c66
code_0c52:
			dup     
			ldi      5
			eq?     
			bnt      code_0c66
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0c66:
			toss    
			ret     
		)
	)
)

(instance give of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cc3
			pushi    #put
			pushi    1
			pushi    17
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			ldi      5
			aTop     cycles
			jmp      code_0ddf
code_0cc3:
			dup     
			ldi      1
			eq?     
			bnt      code_0ce5
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    58
			callb    proc0_6,  2
			pushi    2
			lsg      global0
			lofsa    scholar1
			push    
			callb    proc0_9,  4
			ldi      10
			aTop     ticks
			jmp      code_0ddf
code_0ce5:
			dup     
			ldi      2
			eq?     
			bnt      code_0d24
			lsg      global195
			ldi      4
			eq?     
			bnt      code_0d0c
			pushi    6
			pushi    1
			lea      @local79
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    0
			calle    proc851_0,  12
			jmp      code_0ddf
code_0d0c:
			pushi    6
			pushi    1
			lea      @local67
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    0
			calle    proc851_0,  12
			jmp      code_0ddf
code_0d24:
			dup     
			ldi      3
			eq?     
			bnt      code_0d60
			lsg      global195
			ldi      4
			eq?     
			bnt      code_0d3f
			pushi    1
			pushi    25
			calle    proc806_1,  2
			jmp      code_0d48
code_0d3f:
			pushi    1
			pushi    50
			calle    proc806_1,  2
code_0d48:
			pushi    6
			pushi    1
			lea      @local71
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0ddf
code_0d60:
			dup     
			ldi      4
			eq?     
			bnt      code_0d9b
			pushi    0
			calle    proc851_1,  0
			bnt      code_0d7f
			pushi    #setScript
			pushi    2
			lofsa    getMon
			push    
			pushSelf
			self     8
			jmp      code_0ddf
code_0d7f:
			ldi      5
			sag      global195
			pushi    6
			pushi    1
			lea      @local75
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0ddf
code_0d9b:
			dup     
			ldi      5
			eq?     
			bnt      code_0dcf
			pushi    150
			pushi    #superClass
			class    SyncWalk
			push    
			pushi    59
			pushi    1
			lsl      local114
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local114
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar1
			send     4
			lt?     
			push    
			lofsa    scholar1
			send     18
			ldi      2
			aTop     cycles
			jmp      code_0ddf
code_0dcf:
			dup     
			ldi      6
			eq?     
			bnt      code_0ddf
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ddf:
			toss    
			ret     
		)
	)
)
