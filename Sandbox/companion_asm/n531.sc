;;; Sierra Script 1.0 - (do not remove this comment)
(script# 531)
(include sci.sh)
(use n000)
(use n806)
(use n813)
(use n851)
(use n945)
(use n989)
(use n992)
(use n999)

(public
	monkCode 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 4] = [1531 66 1]
	[local13 5] = [1531 10 1 2]
	[local18 4] = [1531 12 1]
	[local22 8] = [1531 59 1 2 1 1 1]
	[local30 5] = [1531 64 1 2]
	[local35 5] = [1531 67 1 2]
	[local40 8] = [1531 13 1 2 1 2 1]
	[local48 5] = [1531 18 1 1]
	[local53 4] = [1531 18 1]
	[local57 5] = [1531 20 1 1]
	[local62 4] = [1531 20 1]
	[local66 5] = [1531 22 1 1]
	[local71 4] = [1531 22 1]
	[local75 4] = [1531 57 1]
	[local79 6] = [1531 36 1 2 2]
	[local85 10] = [1531 40 2 1 2 1 2 1 2]
	[local95 9] = [1531 47 1 2 1 2 2 2]
	[local104 6] = [1531 53 1 2 1]
	[local110 4] = [1531 56 1]
	[local114 5] = [1531 24 1 2]
	[local119 6] = [1531 26 1 2 1]
	[local125 7] = [1531 29 1 2 1 2]
	[local132 5] = [1531 0 1 1]
	[local137 5] = [1531 2 1 1]
	[local142 4] = [1531 4 1]
	[local146 4] = [1531 5 1]
	[local150 4] = [1531 6 1]
	[local154 5] = [1531 8 1 1]
	[local159 4] = [1531 7 1]
	local163
	local164
	local165
	local166
	local167
)
(instance monkCode of Code
	(properties)
	
	(method (init)
		(asm
			pushi    #actions
			pushi    1
			lofsa    vbKeeperMonk
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #actions
			pushi    1
			lofsa    vbGateMonk
			push    
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     6
			ret     
		)
	)
)

(instance payBill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_010f
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			aTop     register
			pToa     register
			not     
			bnt      code_0075
			pushi    #dispose
			pushi    0
			self     4
			ret     
code_0075:
			pushi    1
			pushi    86
			callb    proc0_5,  2
			bnt      code_00bb
			pTos     register
			ldi      48
			ge?     
			bnt      code_00b4
			pushi    1
			pushi    116
			callb    proc0_5,  2
			not     
			bnt      code_00b4
			ipToa    state
			pushi    4
			lea      @local125
			push    
			lea      @local0
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			pushi    2
			pushi    20
			pushi    116
			calle    proc806_1,  4
			jmp      code_0141
code_00b4:
			ldi      1
			aTop     cycles
			jmp      code_0141
code_00bb:
			lal      local167
			not     
			bnt      code_00e6
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_00e6
			ldi      1
			sal      local167
			pushi    5
			lea      @local114
			push    
			lea      @local0
			push    
			pushi    999
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0141
code_00e6:
			lal      local166
			not     
			bnt      code_0108
			ldi      1
			sal      local166
			pushi    5
			lea      @local119
			push    
			lea      @local0
			push    
			pushi    999
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0141
code_0108:
			ldi      1
			aTop     cycles
			jmp      code_0141
code_010f:
			dup     
			ldi      1
			eq?     
			bnt      code_0135
			pushi    #setScript
			pushi    3
			pushi    2
			pushi    530
			pushi    3
			callk    ScriptID,  4
			push    
			pushi    0
			pTos     register
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     10
			jmp      code_0141
code_0135:
			dup     
			ldi      2
			eq?     
			bnt      code_0141
			pushi    #dispose
			pushi    0
			self     4
code_0141:
			toss    
			ret     
		)
	)
)

(instance tryNOpen of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_028a
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_019c
			lsg      global130
			ldi      6
			eq?     
code_019c:
			bt       code_01a4
			lsg      global130
			ldi      6
			gt?     
code_01a4:
			bnt      code_01c3
			pushi    4
			lea      @local154
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pTos     state
			ldi      4
			add     
			aTop     state
			jmp      code_034e
code_01c3:
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_01ee
			pushi    #has
			pushi    1
			pushi    11
			lag      global0
			send     6
			bnt      code_01ee
			pushi    4
			lea      @local132
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_034e
code_01ee:
			pushi    1
			pushi    117
			callb    proc0_5,  2
			bnt      code_026e
			pushi    1
			pushi    116
			callb    proc0_5,  2
			bnt      code_0215
			pushi    4
			lea      @local150
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_034e
code_0215:
			lal      local165
			bnt      code_022f
			pushi    4
			lea      @local146
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_034e
code_022f:
			pushi    #has
			pushi    1
			pushi    11
			lag      global0
			send     6
			not     
			bnt      code_0252
			pushi    4
			lea      @local159
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_034e
code_0252:
			pushi    4
			lea      @local142
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pTos     state
			ldi      4
			add     
			aTop     state
			jmp      code_034e
code_026e:
			pushi    4
			lea      @local137
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pTos     state
			ldi      4
			add     
			aTop     state
			jmp      code_034e
code_028a:
			dup     
			ldi      1
			eq?     
			bnt      code_02ac
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    210
			pushi    113
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     12
			jmp      code_034e
code_02ac:
			dup     
			ldi      2
			eq?     
			bnt      code_02ea
			pushi    #play
			pushi    0
			lofsa    gateSound
			send     4
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_034e
code_02ea:
			dup     
			ldi      3
			eq?     
			bnt      code_02ff
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
			jmp      code_034e
code_02ff:
			dup     
			ldi      4
			eq?     
			bnt      code_0322
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    265
			pushi    133
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     12
			jmp      code_034e
code_0322:
			dup     
			ldi      5
			eq?     
			bnt      code_033e
			pushi    #setHeading
			pushi    2
			pushi    270
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     8
			jmp      code_034e
code_033e:
			dup     
			ldi      6
			eq?     
			bnt      code_034e
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_034e:
			toss    
			ret     
		)
	)
)

(instance fillCask of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03b5
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    4
			lea      @local79
			push    
			pushi    9
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0428
code_03b5:
			dup     
			ldi      1
			eq?     
			bnt      code_03cf
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     8
			jmp      code_0428
code_03cf:
			dup     
			ldi      2
			eq?     
			bnt      code_03dd
			ldi      2
			aTop     seconds
			jmp      code_0428
code_03dd:
			dup     
			ldi      3
			eq?     
			bnt      code_03f9
			pushi    #setHeading
			pushi    2
			pushi    270
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     8
			jmp      code_0428
code_03f9:
			dup     
			ldi      4
			eq?     
			bnt      code_041c
			pushi    1
			pushi    31
			callb    proc0_6,  2
			pushi    4
			lea      @local85
			push    
			pushi    9
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0428
code_041c:
			dup     
			ldi      5
			eq?     
			bnt      code_0428
			pushi    #dispose
			pushi    0
			self     4
code_0428:
			toss    
			ret     
		)
	)
)

(instance vbKeeperMonk of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_062b
			pushi    1
			pushi    117
			callb    proc0_5,  2
			bnt      code_0574
			pushi    1
			pushi    116
			callb    proc0_5,  2
			bnt      code_0484
			ldi      2
			jmp      code_0486
code_0484:
			ldi      0
code_0486:
			push    
			lal      local165
			add     
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04a7
			pushi    3
			lea      @local40
			push    
			lea      @local0
			push    
			pushi    9
			calle    proc851_0,  6
			jmp      code_0570
code_04a7:
			dup     
			ldi      1
			eq?     
			bnt      code_04eb
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_04bc
			lsg      global130
			ldi      6
			eq?     
code_04bc:
			bt       code_04c4
			lsg      global130
			ldi      6
			gt?     
code_04c4:
			bnt      code_04d9
			pushi    2
			lea      @local53
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0570
code_04d9:
			pushi    2
			lea      @local48
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0570
code_04eb:
			dup     
			ldi      2
			eq?     
			bnt      code_052f
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0500
			lsg      global130
			ldi      6
			eq?     
code_0500:
			bt       code_0508
			lsg      global130
			ldi      6
			gt?     
code_0508:
			bnt      code_051d
			pushi    2
			lea      @local62
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0570
code_051d:
			pushi    2
			lea      @local57
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0570
code_052f:
			dup     
			ldi      3
			eq?     
			bnt      code_0570
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0544
			lsg      global130
			ldi      6
			eq?     
code_0544:
			bt       code_054c
			lsg      global130
			ldi      6
			gt?     
code_054c:
			bnt      code_0561
			pushi    2
			lea      @local71
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0570
code_0561:
			pushi    2
			lea      @local66
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
code_0570:
			toss    
			jmp      code_0716
code_0574:
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_05ba
			pushi    #has
			pushi    1
			pushi    11
			lag      global0
			send     6
			bnt      code_05ba
			lal      local164
			bnt      code_05a1
			pushi    2
			lea      @local18
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0716
code_05a1:
			pushi    3
			lea      @local13
			push    
			lea      @local0
			push    
			pushi    9
			calle    proc851_0,  6
			ldi      1
			sal      local164
			jmp      code_0716
code_05ba:
			lsl      local163
			dup     
			ldi      0
			eq?     
			bnt      code_05fa
			+al      local163
			pushi    1
			pushi    187
			callb    proc0_6,  2
			not     
			bnt      code_05e5
			pushi    3
			lea      @local22
			push    
			lea      @local0
			push    
			pushi    9
			calle    proc851_0,  6
			jmp      code_0627
code_05e5:
			pushi    3
			lea      @local35
			push    
			pushi    9
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0627
code_05fa:
			dup     
			ldi      1
			eq?     
			bnt      code_0618
			pushi    3
			lea      @local30
			push    
			pushi    9
			lea      @local0
			push    
			calle    proc851_0,  6
			+al      local163
			jmp      code_0627
code_0618:
			pushi    2
			lea      @local9
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
code_0627:
			toss    
			jmp      code_0716
code_062b:
			dup     
			ldi      4
			eq?     
			bnt      code_0713
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0653
			pushi    #setScript
			pushi    1
			lofsa    payBill
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     6
			ldi      1
			ret     
			jmp      code_070f
code_0653:
			dup     
			ldi      11
			eq?     
			bnt      code_070c
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_0675
			pushi    2
			lea      @local75
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0705
code_0675:
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0683
			lsg      global130
			ldi      6
			eq?     
code_0683:
			bt       code_068b
			lsg      global130
			ldi      6
			gt?     
code_068b:
			bnt      code_06aa
			pushi    #put
			pushi    1
			pushi    11
			lag      global0
			send     6
			pushi    2
			lea      @local110
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_0705
code_06aa:
			pushi    1
			pushi    117
			callb    proc0_5,  2
			bnt      code_06f9
			pushi    #put
			pushi    1
			pushi    11
			lag      global0
			send     6
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    1
			pushi    116
			callb    proc0_5,  2
			bnt      code_06e4
			pushi    3
			lea      @local104
			push    
			pushi    9
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0705
code_06e4:
			pushi    3
			lea      @local95
			push    
			pushi    9
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0705
code_06f9:
			pushi    #setScript
			pushi    1
			lofsa    fillCask
			push    
			lag      global2
			send     6
code_0705:
			ldi      1
			sal      local165
			jmp      code_070f
code_070c:
			ldi      0
			ret     
code_070f:
			toss    
			jmp      code_0716
code_0713:
			ldi      0
			ret     
code_0716:
			toss    
			ret     
		)
	)
)

(instance vbGateMonk of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0750
			pushi    #setScript
			pushi    1
			lofsa    tryNOpen
			push    
			lag      global2
			send     6
			ldi      1
			ret     
code_0750:
			toss    
			ldi      0
			ret     
		)
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 532
	)
)
