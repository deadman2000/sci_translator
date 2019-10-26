;;; Sierra Script 1.0 - (do not remove this comment)
(script# 533)
(include sci.sh)
(use n000)
(use n806)
(use n813)
(use n851)
(use n852)
(use n930)
(use n946)
(use n951)
(use n961)
(use n989)
(use n992)
(use n999)

(public
	day10 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 9] = [1533 0 1 2 1 2 1 1]
	[local18 6] = [1533 6 2 1 1]
	[local24 4] = [1533 9 1]
	[local28 6] = [1533 10 1 2 1]
	[local34 4] = [1533 13 1]
	[local38 8] = [1533 14 2 1 2 2 1]
	[local46 9] = [1533 19 2 1 2 1 2 1]
	[local55 4] = [1533 25 2]
	[local59 4] = [1533 26 1]
	[local63 8] = [1533 27 1 2 1 1 2]
	[local71 4] = [1533 32 1]
	[local75 6] = [1533 33 1 2 1]
	[local81 4] = [1533 36 2]
	[local85 4] = [1533 37 1]
	[local89 5] = [1533 38 2 1]
	[local94 4] = [1533 40 1]
	[local98 5] = [1533 41 1 2]
	[local103 5] = [1533 43 2 1]
	[local108 6] = [1533 45 2 1 1]
	[local114 5] = [1533 48 2 1]
	[local119 5] = [1533 50 2 1]
	[local124 4] = [1533 53 1]
	local128
	[local129 9] = [257 124 233 121 212 123 183 129 -32768]
)
(instance day10 of Script
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
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    153
			pushi    220
			pushi    228
			pushi    1
			pushi    0
			pushi    283
			pushi    2
			class    MoveFwd
			push    
			pushi    40
			lag      global0
			send     22
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    36
			pushi    150
			pushi    240
			pushi    171
			pushi    183
			pushi    198
			pushi    176
			pushi    226
			pushi    176
			pushi    226
			pushi    170
			pushi    254
			pushi    170
			pushi    247
			pushi    164
			pushi    290
			pushi    151
			pushi    235
			pushi    158
			pushi    227
			pushi    148
			pushi    202
			pushi    148
			pushi    202
			pushi    136
			pushi    209
			pushi    136
			pushi    209
			pushi    129
			pushi    50
			pushi    129
			pushi    85
			pushi    132
			pushi    43
			pushi    162
			pushi    0
			pushi    181
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     86
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    175
			pushi    141
			pushi    136
			pushi    188
			pushi    93
			pushi    188
			pushi    97
			pushi    180
			pushi    83
			pushi    180
			pushi    77
			pushi    187
			pushi    46
			pushi    187
			pushi    91
			pushi    148
			pushi    142
			pushi    148
			dup     
			pushi    141
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			push    
			lag      global2
			send     8
			ldi      2
			aTop     seconds
			jmp      code_0253
code_010f:
			dup     
			ldi      1
			eq?     
			bnt      code_013e
			pushi    #approachX
			pushi    1
			pushi    183
			pushi    274
			pushi    1
			pushi    160
			pushi    283
			pushi    3
			class    PPath
			push    
			lea      @local129
			push    
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     22
			jmp      code_0253
code_013e:
			dup     
			ldi      2
			eq?     
			bnt      code_0159
			pushi    3
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_0253
code_0159:
			dup     
			ldi      3
			eq?     
			bnt      code_0167
			ldi      2
			aTop     cycles
			jmp      code_0253
code_0167:
			dup     
			ldi      4
			eq?     
			bnt      code_020e
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_017a
			ldi      2
code_017a:
			push    
			pushi    1
			pushi    210
			callb    proc0_5,  2
			bnt      code_0187
			ldi      1
code_0187:
			add     
			aTop     register
			pushi    1
			pushi    210
			callb    proc0_6,  2
			+ag      global155
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_01b2
			pushi    5
			lea      @local9
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0203
code_01b2:
			dup     
			ldi      1
			eq?     
			bnt      code_01ce
			pushi    4
			lea      @local24
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0203
code_01ce:
			dup     
			ldi      2
			eq?     
			bnt      code_01ea
			pushi    4
			lea      @local28
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  8
			jmp      code_0203
code_01ea:
			dup     
			ldi      3
			eq?     
			bnt      code_0203
			pushi    4
			lea      @local34
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
code_0203:
			toss    
			pToa     register
			bnt      code_0253
			ipToa    state
			jmp      code_0253
code_020e:
			dup     
			ldi      5
			eq?     
			bnt      code_022c
			pushi    4
			lea      @local18
			push    
			lea      @local0
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_0253
code_022c:
			dup     
			ldi      6
			eq?     
			bnt      code_0253
			pushi    #ignoreActors
			pushi    1
			pushi    0
			pushi    267
			pushi    1
			lofsa    guardTunnels
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     12
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0253:
			toss    
			ret     
		)
	)
)

(instance guardTunnels of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_02ad
			pushi    3
			lea      @local124
			push    
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_03e8
code_02ad:
			dup     
			ldi      5
			eq?     
			bnt      code_03a2
			pushi    1
			pushi    32
			callb    proc0_5,  2
			bnt      code_02c4
			ldi      2
			sal      local128
			jmp      code_02e4
code_02c4:
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_02da
			ldi      1
			sal      local128
			pushi    1
			pushi    32
			callb    proc0_6,  2
			jmp      code_02e4
code_02da:
			ldi      0
			sal      local128
			pushi    1
			pushi    31
			callb    proc0_6,  2
code_02e4:
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_0348
			lsl      local128
			dup     
			ldi      0
			eq?     
			bnt      code_030b
			pushi    3
			lea      @local38
			push    
			lea      @local0
			push    
			pushi    2
			calle    proc851_0,  6
			jmp      code_0344
code_030b:
			dup     
			ldi      1
			eq?     
			bnt      code_0328
			pushi    3
			lea      @local46
			push    
			lea      @local0
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_0344
code_0328:
			dup     
			ldi      2
			eq?     
			bnt      code_0344
			pushi    #setScript
			pushi    3
			lofsa    letIn
			push    
			pushi    0
			pushi    1
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     10
code_0344:
			toss    
			jmp      code_03e8
code_0348:
			lsl      local128
			dup     
			ldi      0
			eq?     
			bnt      code_0365
			pushi    3
			lea      @local38
			push    
			lea      @local0
			push    
			pushi    2
			calle    proc851_0,  6
			jmp      code_039e
code_0365:
			dup     
			ldi      1
			eq?     
			bnt      code_0382
			pushi    3
			lea      @local75
			push    
			lea      @local0
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_039e
code_0382:
			dup     
			ldi      2
			eq?     
			bnt      code_039e
			pushi    #setScript
			pushi    3
			lofsa    letIn
			push    
			pushi    0
			pushi    0
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     10
code_039e:
			toss    
			jmp      code_03e8
code_03a2:
			dup     
			ldi      10
			eq?     
			bnt      code_03be
			pushi    #setScript
			pushi    1
			lofsa    threaten
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     6
			jmp      code_03e8
code_03be:
			dup     
			ldi      4
			eq?     
			bnt      code_03e8
			lsp      param2
			ldi      0
			eq?     
			bnt      code_03e5
			pushi    #setScript
			pushi    1
			lofsa    bribe
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     6
			ldi      1
			ret     
			jmp      code_03e8
code_03e5:
			ldi      0
			ret     
code_03e8:
			toss    
			ret     
		)
	)
)

(instance letIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0440
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    5
			pToa     register
			bnt      code_042c
			lea      @local55
			jmp      code_042f
code_042c:
			lea      @local81
code_042f:
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_050d
code_0440:
			dup     
			ldi      1
			eq?     
			bnt      code_045d
			pushi    5
			lea      @local63
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_050d
code_045d:
			dup     
			ldi      2
			eq?     
			bnt      code_0484
			pushi    4
			pToa     register
			bnt      code_0471
			lea      @local59
			jmp      code_0474
code_0471:
			lea      @local85
code_0474:
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  8
			jmp      code_050d
code_0484:
			dup     
			ldi      3
			eq?     
			bnt      code_04d3
			pushi    #moveSpeed
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    3
			pushi    283
			pushi    3
			class    PFollow
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			pushi    25
			lag      global0
			send     22
			pushi    #moveSpeed
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    3
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    181
			pushi    107
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     24
			jmp      code_050d
code_04d3:
			dup     
			ldi      4
			eq?     
			bnt      code_04fb
			pToa     register
			bnt      code_04f4
			pushi    4
			lea      @local71
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_050d
code_04f4:
			ldi      1
			aTop     cycles
			jmp      code_050d
code_04fb:
			dup     
			ldi      5
			eq?     
			bnt      code_050d
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
code_050d:
			toss    
			ret     
		)
	)
)

(instance threaten of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    shootSound
			send     8
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0583
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_07c4
code_0583:
			dup     
			ldi      1
			eq?     
			bnt      code_05a2
			pushi    #view
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_07c4
code_05a2:
			dup     
			ldi      2
			eq?     
			bnt      code_05dc
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #view
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    150
			pushi    #x
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushSelf
			lag      global0
			send     12
			jmp      code_07c4
code_05dc:
			dup     
			ldi      3
			eq?     
			bnt      code_05f8
			pushi    4
			lea      @local89
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  8
			jmp      code_07c4
code_05f8:
			dup     
			ldi      4
			eq?     
			bnt      code_060e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_07c4
code_060e:
			dup     
			ldi      5
			eq?     
			bnt      code_0653
			pushi    #view
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    1
			pushi    283
			pushi    3
			class    PFollow
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			pushi    60
			lag      global0
			send     24
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    196
			pushi    113
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     12
			jmp      code_07c4
code_0653:
			dup     
			ldi      6
			eq?     
			bnt      code_0675
			pushi    3
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_07c4
code_0675:
			dup     
			ldi      7
			eq?     
			bnt      code_06ab
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
			jmp      code_07c4
code_06ab:
			dup     
			ldi      8
			eq?     
			bnt      code_06e2
			pushi    #view
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			lag      global0
			send     18
			pushi    150
			pushi    #x
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushSelf
			lag      global0
			send     12
			jmp      code_07c4
code_06e2:
			dup     
			ldi      9
			eq?     
			bnt      code_06f0
			ldi      20
			aTop     ticks
			jmp      code_07c4
code_06f0:
			dup     
			ldi      10
			eq?     
			bnt      code_070b
			pushi    5
			pushi    1
			lea      @local94
			push    
			pushi    2
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_07c4
code_070b:
			dup     
			ldi      11
			eq?     
			bnt      code_072d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    251
			pushi    123
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     12
			jmp      code_07c4
code_072d:
			dup     
			ldi      12
			eq?     
			bnt      code_0748
			pushi    3
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_07c4
code_0748:
			dup     
			ldi      13
			eq?     
			bnt      code_0764
			pushi    4
			lea      @local98
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  8
			jmp      code_07c4
code_0764:
			dup     
			ldi      14
			eq?     
			bnt      code_077a
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_07c4
code_077a:
			dup     
			ldi      15
			eq?     
			bnt      code_07a2
			pushi    #view
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    191
			pushi    107
			pushSelf
			lag      global0
			send     26
			jmp      code_07c4
code_07a2:
			dup     
			ldi      16
			eq?     
			bnt      code_07c4
			pushi    1
			pushi    65461
			calle    proc806_1,  2
			pushi    1
			pushi    141
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
code_07c4:
			toss    
			ret     
		)
	)
)

(instance bribe of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0866
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			aTop     register
			pToa     register
			not     
			bnt      code_0825
			pushi    #dispose
			pushi    0
			self     4
			ret     
code_0825:
			pushi    4
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_0845
			pTos     register
			ldi      40
			lt?     
			bnt      code_083f
			lea      @local103
			jmp      code_0856
code_083f:
			lea      @local108
			jmp      code_0856
code_0845:
			pTos     register
			ldi      40
			lt?     
			bnt      code_0853
			lea      @local114
			jmp      code_0856
code_0853:
			lea      @local119
code_0856:
			push    
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  8
			jmp      code_08e8
code_0866:
			dup     
			ldi      1
			eq?     
			bnt      code_08d6
			pTos     register
			ldi      40
			lt?     
			bnt      code_0885
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_08e8
code_0885:
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #moveSpeed
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    3
			pushi    283
			pushi    3
			class    PFollow
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			push    
			pushi    25
			lag      global0
			send     22
			pushi    #moveSpeed
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    3
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    181
			pushi    107
			pushSelf
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     24
			jmp      code_08e8
code_08d6:
			dup     
			ldi      2
			eq?     
			bnt      code_08e8
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
code_08e8:
			toss    
			ret     
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)
