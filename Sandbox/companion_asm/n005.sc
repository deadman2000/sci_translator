;;; Sierra Script 1.0 - (do not remove this comment)
(script# 5)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n945)
(use n961)
(use n974)
(use n977)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	blowArbitrator 0
	blowinIt 1
)

(local
	local0
	local1
	[local2 4] = [-17 -20 -23 -27]
	[local6 4] = [-44 -43 -41 -39]
	[local10 4] = [19 20 24 28]
	[local14 4] = [-50 -50 -48 -47]
	local18
	[local19 15] = [1005 10 1 2 1 2 2 2 1 0 1005 17 1 1]
	[local34 6] = [1005 18 1 2 2]
	[local40 7] = [1005 21 1 2 2 2]
	[local47 6] = [1005 25 1 2 2]
	[local53 12] = [1005 28 2 1 2 0 1005 31 2 1 2]
	[local65 9] = [1005 34 1 2 2 1 2 2]
	[local74 6] = [1005 40 2 1 2]
	[local80 4] = [1005 43 1]
	[local84 5] = [1005 44 2 1]
	[local89 5] = [1005 0 1 1]
	[local94 6] = [1005 46 2 1 2]
	[local100 5] = [1005 49 1 1]
	[local105 5] = [1005 51 1 1]
	[local110 4] = [1005 53 1]
	local114
	local115
	local116
	local117
)
(instance hornSound of Sound
	(properties
		flags $0001
		number 904
	)
)

(instance blowinIt of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			pushi    585
			pushi    160
			pushi    905
			calle    proc999_5,  8
			bnt      code_00d3
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			eq?     
			bnt      code_00d3
			pushi    #setVol
			pushi    1
			pushi    0
			lag      global100
			send     6
			pushi    #fade
			pushi    4
			pushi    127
			pushi    30
			pushi    8
			pushi    0
			lag      global100
			send     12
code_00d3:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose param1 &tmp temp0)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    hornSound
			send     4
			ldi      0
			sat      temp0
			pushi    5
			pTos     client
			lofsa    blowArbitrator
			push    
			lofsa    summonWill
			push    
			lofsa    willEnters
			push    
			lofsa    campWillComes
			push    
			calle    proc999_5,  10
			not     
			bnt      code_0078
			ldi      1
			sat      temp0
code_0078:
			ldi      1
			aTop     register
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			lat      temp0
			bnt      code_008f
			pushi    1
			pushi    5
			callk    DisposeScript,  2
code_008f:
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
			bnt      code_0167
			pTos     client
			lofsa    blowArbitrator
			eq?     
			bt       code_00f5
			pTos     client
			lofsa    summonWill
			eq?     
code_00f5:
			not     
			bnt      code_0101
			lag      global143
			sal      local0
			pushi    0
			callb    proc0_3,  0
code_0101:
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			pushi    5
			pushi    1
			pushi    10
			pushi    288
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bt       code_014d
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_014d
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_014d
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_014d:
			bnt      code_0155
			ldi      0
			jmp      code_0157
code_0155:
			ldi      1
code_0157:
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_01fd
code_0167:
			dup     
			ldi      1
			eq?     
			bnt      code_01a0
			pushi    2
			pushi    0
			pushi    50
			callk    Random,  4
			not     
			bnt      code_0191
			lsg      global11
			ldi      120
			ne?     
			bnt      code_0191
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    tinyBubbles
			push    
			lofsa    bubble
			send     10
code_0191:
			pushi    #play
			pushi    0
			lofsa    hornSound
			send     4
			ldi      5
			aTop     seconds
			jmp      code_01fd
code_01a0:
			dup     
			ldi      2
			eq?     
			bnt      code_01ae
			ldi      30
			aTop     ticks
			jmp      code_01fd
code_01ae:
			dup     
			ldi      3
			eq?     
			bnt      code_01c4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_01fd
code_01c4:
			dup     
			ldi      4
			eq?     
			bnt      code_01fd
			pushi    3
			lsg      global111
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    1
			pushi    148
			callb    proc0_6,  2
			pTos     client
			lofsa    blowArbitrator
			eq?     
			bt       code_01ea
			pTos     client
			lofsa    summonWill
			eq?     
code_01ea:
			not     
			bnt      code_01f8
			lal      local0
			not     
			bnt      code_01f8
			pushi    0
			callb    proc0_4,  0
code_01f8:
			pushi    #dispose
			pushi    0
			self     4
code_01fd:
			toss    
			ret     
		)
	)
)

(instance blowArbitrator of Script
	(properties)
	
	(method (init param1)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    0
			callb    proc0_4,  0
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
			bnt      code_02d2
			pushi    21
			lsg      global11
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			pushi    452
			pushi    455
			pushi    460
			pushi    470
			pushi    480
			pushi    530
			pushi    550
			pushi    560
			pushi    561
			pushi    562
			pushi    570
			calle    proc999_5,  42
			bnt      code_02c3
			pushi    2
			pushi    1005
			pushi    3
			calle    proc13_4,  4
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_02c3:
			lag      global143
			sal      local0
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_09ec
code_02d2:
			dup     
			ldi      1
			eq?     
			bnt      code_06a9
			lsg      global11
			ldi      220
			eq?     
			bnt      code_03fb
			lsg      global112
			ldi      2
			eq?     
			bnt      code_03fb
			pprev   
			ldi      3
			eq?     
			bnt      code_03fb
			pprev   
			ldi      4
			eq?     
			bnt      code_03fb
			pprev   
			ldi      5
			eq?     
			bnt      code_03fb
			pprev   
			ldi      6
			eq?     
			bnt      code_03fb
			pprev   
			ldi      7
			eq?     
			bnt      code_03fb
			pprev   
			ldi      17
			eq?     
			bnt      code_03fb
			pprev   
			ldi      24
			eq?     
			bnt      code_03fb
			pprev   
			ldi      25
			eq?     
			bnt      code_03fb
			pprev   
			ldi      26
			eq?     
			bnt      code_03fb
			pprev   
			ldi      27
			eq?     
			bnt      code_03fb
			pprev   
			ldi      32
			eq?     
			bnt      code_03fb
			pprev   
			ldi      43
			eq?     
			bnt      code_03fb
			pprev   
			ldi      48
			eq?     
			bnt      code_03fb
			pprev   
			ldi      60
			eq?     
			bnt      code_03fb
			pprev   
			ldi      64
			eq?     
			bnt      code_03fb
			pprev   
			ldi      76
			eq?     
			bnt      code_03fb
			pprev   
			ldi      81
			eq?     
			bnt      code_03fb
			pprev   
			ldi      91
			eq?     
			bnt      code_03fb
			pprev   
			ldi      97
			eq?     
			bnt      code_03fb
			pprev   
			ldi      107
			eq?     
			bnt      code_03fb
			pprev   
			ldi      113
			eq?     
			bnt      code_03fb
			pprev   
			ldi      123
			eq?     
			bnt      code_03fb
			pprev   
			ldi      129
			eq?     
			bnt      code_03fb
			pprev   
			ldi      139
			eq?     
			bnt      code_03fb
			pprev   
			ldi      146
			eq?     
			bnt      code_03fb
			pprev   
			ldi      147
			eq?     
			bnt      code_03fb
			pprev   
			ldi      148
			eq?     
			bnt      code_03fb
			pprev   
			ldi      149
			eq?     
			bnt      code_03fb
			pprev   
			ldi      156
			eq?     
			bnt      code_03fb
			pprev   
			ldi      168
			eq?     
			bnt      code_03fb
			pprev   
			ldi      169
			eq?     
			bnt      code_03fb
			pprev   
			ldi      170
			eq?     
			bnt      code_03fb
			pprev   
			ldi      171
			eq?     
			bnt      code_03fb
			pprev   
			ldi      182
			eq?     
			bnt      code_03fb
			pprev   
			ldi      183
			eq?     
			bnt      code_03fb
			pushi    3
			pushi    1005
			pushi    55
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_03fb:
			lsg      global130
			ldi      2
			eq?     
			bnt      code_0423
			pushi    1
			pushi    182
			callb    proc0_5,  2
			bnt      code_0423
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_09ec
code_0423:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_045f
			pushi    2
			lofsa    {Tuck}
			push    
			lsg      global5
			calle    proc974_0,  4
			bnt      code_045f
			lsg      global160
			ldi      0
			eq?     
			bnt      code_0451
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0451:
			pushi    3
			pushi    1005
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_045f:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_04d0
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_04d0
			pushi    1
			pushi    111
			callb    proc0_5,  2
			not     
			bnt      code_0489
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0489:
			lsg      global150
			ldi      1
			ge?     
			bnt      code_04ab
			pushi    1
			pushi    147
			callb    proc0_5,  2
			not     
			bnt      code_04ab
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_04ab:
			lsg      global160
			ldi      1
			ge?     
			bnt      code_04c2
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_04c2:
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_04d0:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0558
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0558
			lsg      global142
			ldi      3
			ge?     
			bnt      code_04f1
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_04f1:
			lsg      global160
			ldi      1
			ge?     
			bnt      code_0510
			lsg      global142
			ldi      0
			eq?     
			bnt      code_0510
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_0510:
			lsg      global150
			ldi      1
			ge?     
			bnt      code_0531
			pushi    1
			pushi    55
			callb    proc0_5,  2
			not     
			bnt      code_0531
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_0531:
			pushi    1
			pushi    111
			callb    proc0_5,  2
			not     
			bnt      code_054a
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_054a:
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0558:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_05c8
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_05c8
			lsg      global142
			ldi      3
			ge?     
			bnt      code_057a
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_057a:
			lsg      global160
			ldi      1
			ge?     
			bnt      code_0599
			lsg      global142
			ldi      0
			eq?     
			bnt      code_0599
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_0599:
			lsg      global150
			ldi      1
			ge?     
			bnt      code_05ba
			pushi    1
			pushi    55
			callb    proc0_5,  2
			not     
			bnt      code_05ba
			pushi    3
			pushi    1005
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_05ba:
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_05c8:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_05e7
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_05e7
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_05e7:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0615
			pushi    1
			pushi    36
			callb    proc0_5,  2
			bnt      code_0606
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0606:
			pushi    3
			pushi    1005
			pushi    7
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_0615:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_062b
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_062b:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0657
			lsg      global150
			ldi      0
			eq?     
			bnt      code_0649
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0649:
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0657:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0685
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_0676
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0676:
			pushi    3
			pushi    1005
			pushi    8
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_0685:
			lsg      global130
			ldi      13
			eq?     
			bnt      code_069b
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_069b:
			pushi    #setScript
			pushi    2
			lofsa    summonWill
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_06a9:
			dup     
			ldi      2
			eq?     
			bnt      code_0932
			lsg      global11
			ldi      220
			eq?     
			bnt      code_07cb
			lsg      global112
			ldi      2
			eq?     
			bnt      code_07cb
			pprev   
			ldi      3
			eq?     
			bnt      code_07cb
			pprev   
			ldi      4
			eq?     
			bnt      code_07cb
			pprev   
			ldi      5
			eq?     
			bnt      code_07cb
			pprev   
			ldi      6
			eq?     
			bnt      code_07cb
			pprev   
			ldi      7
			eq?     
			bnt      code_07cb
			pprev   
			ldi      17
			eq?     
			bnt      code_07cb
			pprev   
			ldi      24
			eq?     
			bnt      code_07cb
			pprev   
			ldi      25
			eq?     
			bnt      code_07cb
			pprev   
			ldi      26
			eq?     
			bnt      code_07cb
			pprev   
			ldi      27
			eq?     
			bnt      code_07cb
			pprev   
			ldi      32
			eq?     
			bnt      code_07cb
			pprev   
			ldi      43
			eq?     
			bnt      code_07cb
			pprev   
			ldi      48
			eq?     
			bnt      code_07cb
			pprev   
			ldi      60
			eq?     
			bnt      code_07cb
			pprev   
			ldi      64
			eq?     
			bnt      code_07cb
			pprev   
			ldi      76
			eq?     
			bnt      code_07cb
			pprev   
			ldi      81
			eq?     
			bnt      code_07cb
			pprev   
			ldi      91
			eq?     
			bnt      code_07cb
			pprev   
			ldi      97
			eq?     
			bnt      code_07cb
			pprev   
			ldi      107
			eq?     
			bnt      code_07cb
			pprev   
			ldi      113
			eq?     
			bnt      code_07cb
			pprev   
			ldi      123
			eq?     
			bnt      code_07cb
			pprev   
			ldi      129
			eq?     
			bnt      code_07cb
			pprev   
			ldi      139
			eq?     
			bnt      code_07cb
			pprev   
			ldi      146
			eq?     
			bnt      code_07cb
			pprev   
			ldi      147
			eq?     
			bnt      code_07cb
			pprev   
			ldi      148
			eq?     
			bnt      code_07cb
			pprev   
			ldi      149
			eq?     
			bnt      code_07cb
			pprev   
			ldi      156
			eq?     
			bnt      code_07cb
			pprev   
			ldi      168
			eq?     
			bnt      code_07cb
			pprev   
			ldi      169
			eq?     
			bnt      code_07cb
			pprev   
			ldi      170
			eq?     
			bnt      code_07cb
			pprev   
			ldi      171
			eq?     
			bnt      code_07cb
			pprev   
			ldi      182
			eq?     
			bnt      code_07cb
			pprev   
			ldi      183
			eq?     
			bnt      code_07cb
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_07cb:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_080b
			pushi    2
			lofsa    {Tuck}
			push    
			lsg      global5
			calle    proc974_0,  4
			bnt      code_080b
			lsg      global160
			ldi      0
			eq?     
			bnt      code_0801
			+ag      global160
			pushi    5
			pushi    1
			lea      @local89
			push    
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_09ec
code_0801:
			+ag      global160
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_080b:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0836
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_0836
			pushi    1
			pushi    111
			callb    proc0_5,  2
			not     
			bnt      code_0836
			pushi    3
			pushi    1005
			pushi    54
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ec
code_0836:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_086c
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_086c
			pushi    3
			lsg      global142
			pushi    1
			pushi    2
			calle    proc999_5,  6
			bnt      code_0864
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_0864:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_086c:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_08a2
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_08a2
			pushi    2
			lag      global142
			ge?     
			bnt      code_089a
			pprev   
			ldi      1
			ge?     
			bnt      code_089a
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_089a:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_08a2:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_08de
			lsg      global159
			ldi      2
			eq?     
			bnt      code_08d0
			lsg      global11
			ldi      220
			eq?     
			bnt      code_08c2
			pushi    1
			pushi    176
			callb    proc0_6,  2
code_08c2:
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
			jmp      code_09ec
code_08d0:
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_09ec
code_08de:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0904
			lsg      global11
			ldi      220
			eq?     
			bnt      code_08f6
			pushi    1
			pushi    176
			callb    proc0_6,  2
code_08f6:
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
			jmp      code_09ec
code_0904:
			lsg      global130
			ldi      13
			eq?     
			bnt      code_092a
			lsg      global11
			ldi      220
			eq?     
			bnt      code_091c
			pushi    1
			pushi    176
			callb    proc0_6,  2
code_091c:
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
			jmp      code_09ec
code_092a:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_0932:
			dup     
			ldi      3
			eq?     
			bnt      code_09e0
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0953
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_0953
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_0953:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_0983
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_0983
			lsg      global11
			ldi      220
			eq?     
			bnt      code_0975
			pushi    1
			pushi    176
			callb    proc0_6,  2
code_0975:
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
			jmp      code_09ec
code_0983:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_09b2
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_09b2
			lsg      global11
			ldi      220
			eq?     
			bnt      code_09a4
			pushi    1
			pushi    176
			callb    proc0_6,  2
code_09a4:
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
			jmp      code_09ec
code_09b2:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_09d8
			lsg      global11
			ldi      220
			eq?     
			bnt      code_09ca
			pushi    1
			pushi    176
			callb    proc0_6,  2
code_09ca:
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
			jmp      code_09ec
code_09d8:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_09ec
code_09e0:
			dup     
			ldi      4
			eq?     
			bnt      code_09ec
			pushi    #dispose
			pushi    0
			self     4
code_09ec:
			toss    
			ret     
		)
	)
)

(instance summonWill of Script
	(properties)
	
	(method (init param1)
		(asm
			ldi      0
			sal      local1
			pushi    #init
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
			bnt      code_0a7b
			pushi    4
			lsg      global11
			pushi    220
			pushi    180
			pushi    250
			calle    proc999_5,  8
			bnt      code_0a6d
			pushi    #setScript
			pushi    2
			lofsa    willEnters
			push    
			pushSelf
			self     8
			jmp      code_0e55
code_0a6d:
			pushi    #setScript
			pushi    2
			lofsa    campWillComes
			push    
			pushSelf
			self     8
			jmp      code_0e55
code_0a7b:
			dup     
			ldi      1
			eq?     
			bnt      code_0df9
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0af9
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_0af9
			pushi    1
			pushi    147
			callb    proc0_5,  2
			bnt      code_0ac3
			lsg      global160
			ldi      0
			eq?     
			bnt      code_0ac3
			lsg      global160
			ldi      1
			add     
			sag      global160
			pushi    7
			pushi    2
			lea      @local19
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0ac3:
			pushi    1
			pushi    111
			callb    proc0_5,  2
			bnt      code_0af1
			lsg      global150
			ldi      0
			eq?     
			bnt      code_0af1
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    7
			pushi    2
			lea      @local34
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0af1:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0e55
code_0af9:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0bcb
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0bcb
			pushi    3
			lsg      global142
			pushi    1
			pushi    2
			calle    proc999_5,  6
			bnt      code_0b3a
			lsg      global160
			ldi      1
			add     
			sag      global160
			ldi      1
			sal      local1
			pushi    7
			pushi    2
			lea      @local53
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0b3a:
			lsg      global142
			ldi      0
			eq?     
			bnt      code_0b67
			lsg      global160
			ldi      0
			ne?     
			bnt      code_0b67
			lsg      global160
			ldi      1
			add     
			sag      global160
			pushi    7
			pushi    2
			lea      @local47
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0b67:
			pushi    1
			pushi    55
			callb    proc0_5,  2
			bnt      code_0b95
			lsg      global160
			ldi      0
			eq?     
			bnt      code_0b95
			lsg      global160
			ldi      1
			add     
			sag      global160
			pushi    7
			pushi    2
			lea      @local47
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0b95:
			pushi    1
			pushi    111
			callb    proc0_5,  2
			bnt      code_0bc3
			lsg      global150
			ldi      0
			eq?     
			bnt      code_0bc3
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    7
			pushi    2
			lea      @local34
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0bc3:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0e55
code_0bcb:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_0c67
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_0c67
			pushi    1
			pushi    55
			callb    proc0_5,  2
			not     
			bnt      code_0c04
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    7
			pushi    2
			lea      @local40
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0c04:
			pushi    2
			lag      global142
			ge?     
			bnt      code_0c33
			pprev   
			ldi      1
			ge?     
			bnt      code_0c33
			lsg      global160
			ldi      1
			add     
			sag      global160
			ldi      1
			sal      local1
			pushi    7
			pushi    2
			lea      @local53
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0c33:
			lsg      global142
			ldi      0
			eq?     
			bnt      code_0c58
			lsg      global160
			ldi      1
			add     
			sag      global160
			pushi    7
			pushi    2
			lea      @local47
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0c58:
			lsg      global160
			ldi      1
			add     
			sag      global160
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0e55
code_0c67:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_0cfe
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0cfe
			lsg      global150
			dup     
			ldi      0
			eq?     
			bnt      code_0c9e
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    7
			pushi    2
			lea      @local94
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0cfa
code_0c9e:
			dup     
			ldi      1
			eq?     
			bnt      code_0cc0
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    5
			pushi    1
			lea      @local100
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0cfa
code_0cc0:
			dup     
			ldi      2
			eq?     
			bnt      code_0ce2
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    5
			pushi    1
			lea      @local105
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0cfa
code_0ce2:
			lsg      global150
			ldi      1
			add     
			sag      global150
			pushi    5
			pushi    1
			lea      @local110
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
code_0cfa:
			toss    
			jmp      code_0e55
code_0cfe:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0d65
			+ag      global160
			lsg      global159
			dup     
			ldi      0
			eq?     
			bnt      code_0d2b
			ldi      1
			sal      local1
			pushi    7
			pushi    2
			lea      @local65
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0d61
code_0d2b:
			dup     
			ldi      1
			eq?     
			bnt      code_0d4c
			ldi      1
			sal      local1
			pushi    7
			pushi    2
			lea      @local74
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0d61
code_0d4c:
			ldi      1
			sal      local1
			pushi    5
			pushi    1
			lea      @local80
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
code_0d61:
			toss    
			jmp      code_0e55
code_0d65:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0d87
			ldi      1
			sal      local1
			pushi    7
			pushi    2
			lea      @local84
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0e55
code_0d87:
			lsg      global150
			dup     
			ldi      0
			eq?     
			bnt      code_0da8
			+ag      global150
			pushi    7
			pushi    2
			lea      @local94
			push    
			pushi    1
			pushi    1
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_0df5
code_0da8:
			dup     
			ldi      1
			eq?     
			bnt      code_0dc5
			+ag      global150
			pushi    5
			pushi    1
			lea      @local100
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0df5
code_0dc5:
			dup     
			ldi      2
			eq?     
			bnt      code_0de2
			+ag      global150
			pushi    5
			pushi    1
			lea      @local105
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0df5
code_0de2:
			+ag      global150
			pushi    5
			pushi    1
			lea      @local110
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
code_0df5:
			toss    
			jmp      code_0e55
code_0df9:
			dup     
			ldi      2
			eq?     
			bnt      code_0e49
			lal      local1
			not     
			bnt      code_0e42
			pushi    4
			lsg      global11
			pushi    220
			pushi    180
			pushi    250
			calle    proc999_5,  8
			bnt      code_0e2a
			pushi    #setScript
			pushi    2
			lofsa    willLeaves
			push    
			pushSelf
			self     8
			jmp      code_0e55
code_0e2a:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65526
			pushi    120
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_0e55
code_0e42:
			ldi      6
			aTop     ticks
			jmp      code_0e55
code_0e49:
			dup     
			ldi      3
			eq?     
			bnt      code_0e55
			pushi    #dispose
			pushi    0
			self     4
code_0e55:
			toss    
			ret     
		)
	)
)

(instance willEnters of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ec8
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0ec1
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    150
			pushi    175
			pushSelf
			lag      global0
			send     12
			jmp      code_0ff4
code_0ec1:
			ldi      6
			aTop     ticks
			jmp      code_0ff4
code_0ec8:
			dup     
			ldi      1
			eq?     
			bnt      code_0edd
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_0ff4
code_0edd:
			dup     
			ldi      2
			eq?     
			bnt      code_0f38
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      185
			gt?     
			bnt      code_0f10
			ldi      65521
			sal      local114
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0f08
			ldi      187
			sal      local115
			jmp      code_0f2b
code_0f08:
			ldi      145
			sal      local115
			jmp      code_0f2b
code_0f10:
			ldi      335
			sal      local114
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0f26
			ldi      187
			sal      local115
			jmp      code_0f2b
code_0f26:
			ldi      145
			sal      local115
code_0f2b:
			pushi    2
			pushi    10
			pushi    60
			callk    Random,  4
			aTop     ticks
			jmp      code_0ff4
code_0f38:
			dup     
			ldi      3
			eq?     
			bnt      code_0fc6
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      185
			gt?     
			bnt      code_0f88
			pushi    284
			pushi    #-info-
			lsl      local114
			lsl      local115
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      35
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lofsa    Willbert
			send     32
			jmp      code_0fbf
code_0f88:
			pushi    284
			pushi    #-info-
			lsl      local114
			lsl      local115
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      35
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lofsa    Willbert
			send     32
code_0fbf:
			ldi      15
			aTop     cycles
			jmp      code_0ff4
code_0fc6:
			dup     
			ldi      4
			eq?     
			bnt      code_0fda
			pushi    2
			lsg      global0
			lofsa    Willbert
			push    
			callb    proc0_9,  4
			jmp      code_0ff4
code_0fda:
			dup     
			ldi      5
			eq?     
			bnt      code_0fe8
			ldi      30
			aTop     cycles
			jmp      code_0ff4
code_0fe8:
			dup     
			ldi      6
			eq?     
			bnt      code_0ff4
			pushi    #dispose
			pushi    0
			self     4
code_0ff4:
			toss    
			ret     
		)
	)
)

(instance campWillComes of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1059
			pushi    #setCycle
			pushi    2
			class    StopWalk
			push    
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    140
			pushi    78
			pushSelf
			lag      global0
			send     20
			jmp      code_1106
code_1059:
			dup     
			ldi      1
			eq?     
			bnt      code_106f
			pushi    #setHeading
			pushi    2
			pushi    225
			pushSelf
			lag      global0
			send     8
			jmp      code_1106
code_106f:
			dup     
			ldi      2
			eq?     
			bnt      code_107d
			ldi      6
			aTop     ticks
			jmp      code_1106
code_107d:
			dup     
			ldi      3
			eq?     
			bnt      code_10c3
			pushi    2
			lofsa    {Will}
			push    
			lsg      global5
			calle    proc974_0,  4
			not     
			bnt      code_10ae
			pushi    #init
			pushi    0
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    65511
			pushi    3
			pushi    1
			pushi    120
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     22
code_10ae:
			pushi    1
			pushi    974
			callk    DisposeScript,  2
			pushi    #setScript
			pushi    2
			lofsa    blowinIt
			push    
			pushSelf
			self     8
			jmp      code_1106
code_10c3:
			dup     
			ldi      4
			eq?     
			bnt      code_10ec
			pushi    #setCycle
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    100
			pushi    84
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     20
			jmp      code_1106
code_10ec:
			dup     
			ldi      5
			eq?     
			bnt      code_10fa
			ldi      6
			aTop     ticks
			jmp      code_1106
code_10fa:
			dup     
			ldi      6
			eq?     
			bnt      code_1106
			pushi    #dispose
			pushi    0
			self     4
code_1106:
			toss    
			ret     
		)
	)
)

(instance willLeaves of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_116b
			lal      local114
			sal      local116
			lal      local115
			sal      local117
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local116
			lsl      local117
			pushSelf
			lofsa    Willbert
			send     12
			jmp      code_1177
code_116b:
			dup     
			ldi      1
			eq?     
			bnt      code_1177
			pushi    #dispose
			pushi    0
			self     4
code_1177:
			toss    
			ret     
		)
	)
)

(instance thornyHorn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11cf
			pushi    3
			pushi    1005
			pushi    55
			pushSelf
			calle    proc13_4,  6
			jmp      code_11db
code_11cf:
			dup     
			ldi      1
			eq?     
			bnt      code_11db
			pushi    #dispose
			pushi    0
			self     4
code_11db:
			toss    
			ret     
		)
	)
)

(instance tinyBubbles of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_127b
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sat      temp0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			lat      temp0
			bnt      code_1247
			lal      local18
			lali     local2
			jmp      code_124b
code_1247:
			lal      local18
			lali     local10
code_124b:
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lat      temp0
			bnt      code_1261
			lal      local18
			lali     local6
			jmp      code_1265
code_1261:
			lal      local18
			lali     local14
code_1265:
			add     
			push    
			pushi    288
			pushi    1
			lsl      local18
			lofsa    bubble
			send     14
			+al      local18
			ldi      12
			aTop     ticks
			jmp      code_12e6
code_127b:
			dup     
			ldi      1
			eq?     
			bnt      code_129a
			lsl      local18
			ldi      4
			lt?     
			bnt      code_1291
			pTos     state
			ldi      2
			sub     
			aTop     state
code_1291:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_12e6
code_129a:
			dup     
			ldi      2
			eq?     
			bnt      code_12d8
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			bnt      code_12c1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      75
			sub     
			jmp      code_12cc
code_12c1:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      75
			add     
code_12cc:
			push    
			pushi    65516
			pushSelf
			lofsa    bubble
			send     12
			jmp      code_12e6
code_12d8:
			dup     
			ldi      3
			eq?     
			bnt      code_12e6
			pushi    #dispose
			pushi    0
			pToa     client
			send     4
code_12e6:
			toss    
			ret     
		)
	)
)

(instance bubble of Actor
	(properties
		yStep 8
		view 10
		loop 2
		signal $6000
		xStep 6
	)
	
	(method (init)
		(asm
			pushi    #setPri
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			self     6
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance Willbert of Actor
	(properties
		description 5398
		view 160
	)
	
	(method (init)
		(asm
			pushi    #setLoop
			pushi    1
			lofsa    scarletGroop
			push    
			self     6
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    267
			pushi    1
			pushi    0
			self     18
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			ret     
		)
	)
)

(instance scarletGroop of Grooper
	(properties)
)
