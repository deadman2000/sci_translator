;;; Sierra Script 1.0 - (do not remove this comment)
(script# 360)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm360 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	[local11 4] = [1360 75 1]
	[local15 4] = [1360 0 1]
	[local19 8] = [1360 1 1 0 1360 2 1]
	[local27 4] = [1360 19 1]
	[local31 4] = [1360 31 1]
	[local35 4] = [1360 30 1]
	[local39 7] = [1360 24 1 2 1 2]
	[local46 5] = [1360 28 1 2]
	[local51 6] = [1360 39 1 2 2]
	[local57 4] = [1360 42 1]
	[local61 4] = [1360 54 1]
	[local65 4] = [1360 55 1]
	[local69 4] = [1360 57 1]
	[local73 4] = [1360 82 1]
	[local77 4] = [1360 83 1]
	[local81 5] = [1360 84 1 1]
	[local86 4] = [1360 65 1]
	[local90 4] = [1360 66 1]
	[local94 4] = [1360 67 1]
	[local98 4] = [1360 74 1]
	[local102 4] = [1360 68 1]
	[local106 8] = [1360 69 2 2 1 2 1]
	[local114 5] = [1360 76 1 1]
	[local119 4] = [1360 16 1]
	[local123 4] = [1360 17 1]
	[local127 4] = [1360 18 1]
	[local131 4] = [1360 32 1]
	[local135 8] = [1360 33 2 2 1 2 2]
	[local143 4] = [1360 38 1]
	[local147 6] = [1360 43 1 2 1]
	[local153 11] = [1360 46 2 1 2 2 1 2 1 2]
	[local164 7] = [1360 58 2 1 2 2]
	[local171 6] = [1360 62 2 1 2]
	[local177 7] = [1360 86 2 1 2 2]
	[local184 4] = [1360 90 1]
	[local188 9] = [44 0 2 3 26 37 20 25 20]
)
(instance rm360 of Rm
	(properties
		picture 360
		north 350
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    2
			pushi    130
			pushi    927
			callk    Load,  4
			pushi    4
			pushi    128
			pushi    362
			pushi    39
			pushi    361
			calle    proc958_0,  8
			lsg      global126
			ldi      3
			eq?     
			bnt      code_0048
			pushi    1
			pushi    162
			callb    proc0_6,  2
			ldi      1
			sal      local9
			ldi      1
			sal      local6
code_0048:
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    15
			lofsa    lobbWindow
			push    
			lofsa    lobbShelfDoor
			push    
			lofsa    lobbDoor
			push    
			lofsa    lobbBoots
			push    
			lofsa    lobbTopShelf
			push    
			lofsa    lobbCloak
			push    
			lofsa    lobbTools
			push    
			lofsa    lobbStool
			push    
			lofsa    lobbChest
			push    
			lofsa    lobbFrontWall
			push    
			lofsa    lobbLeftWall
			push    
			lofsa    lobbRightWall
			push    
			lofsa    lobbCeiling
			push    
			lofsa    lobbFloor
			push    
			lofsa    lobbBackWall
			push    
			calle    proc806_3,  30
			pushi    #init
			pushi    0
			lofsa    openDoor
			send     4
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      362
			ne?     
			bt       code_00c2
			pushi    #vol
			pushi    0
			lag      global100
			send     4
			push    
			ldi      127
			lt?     
code_00c2:
			bnt      code_00d7
			pushi    #number
			pushi    1
			pushi    362
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_00d7:
			pushi    0
			callb    proc0_2,  0
			lsg      global12
			ldi      350
			eq?     
			bnt      code_010c
			pushi    #init
			pushi    0
			lofsa    lobb
			send     4
			pushi    #posn
			pushi    2
			pushi    131
			pushi    142
			pushi    107
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			lofsa    stepIn
			push    
			lag      global0
			send     24
			jmp      code_017e
code_010c:
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    191
			pushi    148
			pushi    209
			pushi    163
			pushi    195
			pushi    172
			pushi    179
			pushi    160
			pushi    185
			pushi    154
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #posn
			pushi    2
			pushi    159
			pushi    165
			pushi    6
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     18
			pushi    #posn
			pushi    2
			pushi    195
			pushi    165
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    lobb
			send     18
			pushi    1
			pushi    0
			calle    proc806_6,  2
code_017e:
			pushi    #observeControl
			pushi    1
			pushi    32768
			lag      global0
			send     6
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    53
			pushi    0
			pushi    132
			pushi    88
			pushi    119
			pushi    91
			pushi    123
			pushi    146
			pushi    85
			pushi    162
			pushi    58
			pushi    165
			pushi    13
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    16
			pushi    152
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    308
			pushi    189
			pushi    278
			pushi    171
			pushi    222
			pushi    163
			pushi    204
			pushi    142
			pushi    140
			pushi    143
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			lag      global2
			send     8
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_021e
			ldi      0
			jmp      code_028a
code_021e:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      146
			lt?     
			bnt      code_023c
			pushi    #setScript
			pushi    1
			lofsa    goOutside
			push    
			lag      global0
			send     6
			jmp      code_028a
code_023c:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      185
			gt?     
			bnt      code_025f
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			lofsa    moveFromTheWall
			push    
			lag      global0
			send     12
			jmp      code_028a
code_025f:
			lsg      global126
			ldi      3
			eq?     
			bnt      code_027b
			lal      local8
			not     
			bnt      code_027b
			pushi    1
			pushi    162
			callb    proc0_6,  2
			ldi      1
			sal      local8
			jmp      code_028a
code_027b:
			lal      local8
			bnt      code_028a
			lal      local9
			not     
			bnt      code_028a
			ldi      1
			sal      local9
code_028a:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    927
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance lobbWindow of Feature
	(properties
		x 198
		y 106
		nsTop 78
		nsLeft 174
		nsBottom 114
		nsRight 226
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0313
			pushi    1
			pushi    20
			calle    proc13_6,  2
			pushi    3
			pushi    1360
			pushi    6
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0339
code_0313:
			dup     
			ldi      3
			eq?     
			bnt      code_032e
			pushi    3
			lea      @local27
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0339
code_032e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0339:
			toss    
			ret     
		)
	)
)

(instance lobbShelfDoor of Feature
	(properties
		x 130
		y 64
		nsTop 60
		nsLeft 107
		nsBottom 68
		nsRight 154
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0398
			pushi    3
			pushi    1360
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b9
code_0398:
			dup     
			ldi      3
			eq?     
			bnt      code_03ae
			pushi    3
			pushi    1360
			pushi    20
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b9
code_03ae:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_03b9:
			toss    
			ret     
		)
	)
)

(instance lobbDoor of Feature
	(properties
		x 129
		y 113
		nsTop 87
		nsLeft 115
		nsBottom 139
		nsRight 144
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0425
			pushi    1
			pushi    20
			calle    proc13_6,  2
			pushi    3
			pushi    1360
			pushi    5
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_044b
code_0425:
			dup     
			ldi      3
			eq?     
			bnt      code_0440
			pushi    3
			lea      @local27
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_044b
code_0440:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_044b:
			toss    
			ret     
		)
	)
)

(instance lobbCloak of Feature
	(properties
		x 158
		y 106
		nsTop 79
		nsLeft 152
		nsBottom 133
		nsRight 165
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04aa
			pushi    3
			pushi    1360
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_04cb
code_04aa:
			dup     
			ldi      3
			eq?     
			bnt      code_04c0
			pushi    3
			pushi    1360
			pushi    20
			pushi    1
			calle    proc13_4,  6
			jmp      code_04cb
code_04c0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_04cb:
			toss    
			ret     
		)
	)
)

(instance lobbStool of Feature
	(properties
		x 131
		y 143
		nsTop 131
		nsLeft 224
		nsBottom 155
		nsRight 239
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_052a
			pushi    3
			pushi    1360
			pushi    12
			pushi    1
			calle    proc13_4,  6
			jmp      code_0535
code_052a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0535:
			toss    
			ret     
		)
	)
)

(instance lobbBoots of Feature
	(properties
		x 47
		y 108
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    47
			pushi    94
			pushi    63
			pushi    94
			pushi    102
			pushi    89
			pushi    102
			pushi    98
			pushi    64
			pushi    108
			pushi    47
			pushi    107
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0593
			pushi    3
			pushi    1360
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d4
code_0593:
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_05aa
			pushi    3
			pushi    1360
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d4
code_05aa:
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_05c9
			lsp      param2
			ldi      0
			eq?     
			bnt      code_05d4
			pushi    3
			pushi    1360
			pushi    56
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d4
code_05c9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_05d4:
			ret     
		)
	)
)

(instance lobbTopShelf of Feature
	(properties
		x 47
		y 91
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    47
			pushi    78
			pushi    100
			pushi    77
			pushi    101
			pushi    85
			pushi    62
			pushi    90
			pushi    46
			pushi    91
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_067b
			pushi    3
			pushi    1360
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_069d
code_067b:
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0692
			pushi    3
			pushi    1360
			pushi    20
			pushi    1
			calle    proc13_4,  6
			jmp      code_069d
code_0692:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_069d:
			ret     
		)
	)
)

(instance lobbTools of Feature
	(properties
		x 234
		y 128
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    234
			pushi    117
			pushi    256
			pushi    105
			pushi    275
			pushi    125
			pushi    252
			pushi    128
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0741
			pushi    3
			pushi    1360
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_0763
code_0741:
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0758
			pushi    3
			pushi    1360
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_0763
code_0758:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0763:
			ret     
		)
	)
)

(instance lobbChest of Feature
	(properties
		x 53
		y 160
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    53
			pushi    135
			pushi    80
			pushi    124
			pushi    96
			pushi    124
			pushi    99
			pushi    148
			pushi    78
			pushi    160
			pushi    52
			pushi    157
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0807
			pushi    3
			pushi    1360
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_0829
code_0807:
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_081e
			pushi    3
			pushi    1360
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_0829
code_081e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0829:
			ret     
		)
	)
)

(instance lobbFrontWall of Feature
	(properties
		x 89
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    89
			pushi    58
			pushi    234
			pushi    59
			pushi    224
			pushi    138
			pushi    100
			pushi    139
			pushi    98
			pushi    122
			pushi    79
			pushi    122
			pushi    80
			pushi    108
			pushi    103
			pushi    101
			pushi    103
			pushi    75
			pushi    86
			pushi    75
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     54
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_08d5
			pushi    3
			pushi    1360
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_08e0
code_08d5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_08e0:
			ret     
		)
	)
)

(instance lobbLeftWall of Feature
	(properties
		x 1
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    0
			pushi    1
			pushi    29
			pushi    3
			pushi    84
			pushi    58
			pushi    82
			pushi    73
			pushi    44
			pushi    75
			pushi    42
			pushi    111
			pushi    76
			pushi    110
			pushi    75
			pushi    124
			pushi    47
			pushi    134
			pushi    50
			pushi    158
			pushi    4
			pushi    187
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     58
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_099b
			pushi    3
			pushi    1360
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_09a6
code_099b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_09a6:
			ret     
		)
	)
)

(instance lobbRightWall of Feature
	(properties
		x 315
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    315
			pushi    180
			pushi    260
			pushi    148
			pushi    285
			pushi    129
			pushi    258
			pushi    100
			pushi    234
			pushi    112
			pushi    236
			pushi    63
			pushi    317
			pushi    1
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0a63
			pushi    3
			pushi    1360
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a6e
code_0a63:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a6e:
			ret     
		)
	)
)

(instance lobbCeiling of Feature
	(properties
		x 34
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    34
			pushi    0
			pushi    303
			pushi    1
			pushi    240
			pushi    58
			pushi    87
			pushi    56
			pushi    36
			pushi    1
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0b23
			pushi    3
			pushi    1360
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b2e
code_0b23:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0b2e:
			ret     
		)
	)
)

(instance lobbFloor of Feature
	(properties
		x 27
		y 139
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    27
			pushi    173
			pushi    52
			pushi    160
			pushi    79
			pushi    160
			pushi    110
			pushi    141
			pushi    216
			pushi    141
			pushi    216
			pushi    159
			pushi    273
			pushi    163
			pushi    299
			pushi    174
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0bd1
			pushi    3
			pushi    1360
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bdc
code_0bd1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0bdc:
			ret     
		)
	)
)

(instance lobbBackWall of Feature
	(properties
		x 17
		y 178
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    17
			pushi    180
			pushi    308
			pushi    178
			pushi    316
			pushi    185
			pushi    9
			pushi    187
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0c97
			pushi    3
			pushi    1360
			pushi    14
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ca2
code_0c97:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0ca2:
			ret     
		)
	)
)

(instance openDoor of View
	(properties
		x 114
		y 84
		view 350
		loop 5
		priority 10
		signal $0011
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d55
			pushi    1
			pushi    20
			calle    proc13_6,  2
			pushi    3
			pushi    1360
			pushi    5
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0d7b
code_0d55:
			dup     
			ldi      3
			eq?     
			bnt      code_0d70
			pushi    3
			lea      @local27
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0d7b
code_0d70:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0d7b:
			toss    
			ret     
		)
	)
)

(instance lobb of Actor
	(properties
		x 266
		y 162
		view 361
		loop 3
		cel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e16
			pushi    #has
			pushi    1
			pushi    3
			lag      global0
			send     6
			bnt      code_0e07
			pushi    3
			pushi    1360
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_121d
code_0e07:
			pushi    3
			pushi    1360
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_121d
code_0e16:
			dup     
			ldi      3
			eq?     
			bnt      code_0e2c
			pushi    #setScript
			pushi    1
			lofsa    handLobb
			push    
			lag      global0
			send     6
			jmp      code_121d
code_0e2c:
			dup     
			ldi      5
			eq?     
			bnt      code_1026
			lsg      global126
			ldi      1
			eq?     
			bnt      code_0e5d
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bnt      code_0e5d
			pushi    4
			lea      @local31
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_0e5d:
			pushi    #has
			pushi    1
			pushi    3
			lag      global0
			send     6
			bnt      code_0edd
			lsg      global126
			ldi      1
			eq?     
			bnt      code_0edd
			pushi    1
			pushi    8
			callb    proc0_5,  2
			not     
			bnt      code_0edd
			lsl      local3
			ldi      1
			eq?     
			bnt      code_0e96
			pushi    4
			lea      @local35
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
code_0e96:
			bt       code_121d
			lsl      local2
			ldi      0
			eq?     
			bnt      code_0eb8
			pushi    4
			lea      @local39
			push    
			pushi    7
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local2
code_0eb8:
			bt       code_121d
			lsl      local2
			ldi      1
			eq?     
			bnt      code_121d
			pushi    4
			lea      @local46
			push    
			pushi    7
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local3
			jmp      code_121d
code_0edd:
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0f89
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0f89
			pushi    1
			pushi    162
			callb    proc0_5,  2
			bnt      code_0f19
			lsl      local7
			ldi      0
			eq?     
			bnt      code_0f19
			ldi      1
			sal      local7
			pushi    3
			lea      @local177
			push    
			pushi    999
			lea      @local188
			push    
			calle    proc851_0,  6
			jmp      code_121d
code_0f19:
			pushi    1
			pushi    162
			callb    proc0_5,  2
			bnt      code_0f3f
			lsl      local7
			ldi      1
			eq?     
			bnt      code_0f3f
			pushi    3
			lea      @local184
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_0f3f:
			pushi    1
			pushi    138
			callb    proc0_5,  2
			not     
			bnt      code_0f74
			pushi    #has
			pushi    1
			pushi    8
			lag      global0
			send     6
			bnt      code_0f74
			pushi    1
			pushi    138
			callb    proc0_6,  2
			pushi    1
			pushi    24
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    moveToRobin
			push    
			lofsa    lobb
			send     6
			jmp      code_121d
code_0f74:
			pushi    4
			lea      @local143
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_0f89:
			lsg      global126
			ldi      3
			eq?     
			bnt      code_121d
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			lsl      local1
			ldi      0
			eq?     
			bnt      code_0fc6
			pushi    1
			pushi    24
			callb    proc0_5,  2
			not     
			bnt      code_0fc6
			ldi      1
			sal      local1
			pushi    1
			pushi    24
			callb    proc0_6,  2
			pushi    #setScript
			pushi    2
			lofsa    moveCloseAndAway
			push    
			pushSelf
			lofsa    lobb
			send     8
			jmp      code_121d
code_0fc6:
			lsl      local8
			ldi      1
			eq?     
			bnt      code_1011
			lsl      local6
			ldi      0
			eq?     
			bnt      code_1011
			ldi      1
			sal      local6
			lsl      local5
			ldi      0
			eq?     
			bnt      code_0ffc
			pushi    4
			lea      @local51
			push    
			pushi    5
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local5
			jmp      code_121d
code_0ffc:
			pushi    4
			lea      @local57
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_1011:
			pushi    4
			lea      @local61
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_1026:
			dup     
			ldi      4
			eq?     
			bnt      code_1212
			lsp      param2
			ldi      0
			eq?     
			bnt      code_10c1
			lsg      global130
			ldi      3
			eq?     
			bnt      code_105e
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bnt      code_105e
			pushi    3
			lea      @local73
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_105e:
			lsg      global130
			ldi      3
			eq?     
			bnt      code_1088
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			not     
			bnt      code_1088
			pushi    3
			lea      @local77
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1088:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_10ad
			pushi    1
			pushi    24
			callb    proc0_5,  2
			bnt      code_10ad
			pushi    3
			lea      @local81
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_10ad:
			pushi    3
			lea      @local65
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_10c1:
			lsp      param2
			ldi      2
			eq?     
			bnt      code_10dd
			pushi    3
			lea      @local69
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_10dd:
			lsp      param2
			ldi      3
			eq?     
			bnt      code_111c
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_110b
			pushi    1
			pushi    190
			callb    proc0_5,  2
			not     
			bnt      code_110b
			pushi    #setScript
			pushi    2
			lofsa    goBackRoom
			push    
			pushSelf
			lofsa    lobb
			send     8
			jmp      code_121d
code_110b:
			pushi    #setScript
			pushi    2
			lofsa    killRobinScript
			push    
			pushSelf
			lofsa    lobb
			send     8
			jmp      code_121d
code_111c:
			lsp      param2
			ldi      15
			eq?     
			bnt      code_1138
			pushi    3
			lea      @local86
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1138:
			lsp      param2
			ldi      14
			eq?     
			bnt      code_1154
			pushi    3
			lea      @local90
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1154:
			lsp      param2
			ldi      10
			eq?     
			bt       code_1161
			lsp      param2
			ldi      18
			eq?     
code_1161:
			bnt      code_1180
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			pushi    3
			lea      @local94
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1180:
			lsp      param2
			ldi      7
			eq?     
			bnt      code_11ee
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			lsl      local4
			ldi      1
			eq?     
			bnt      code_11ac
			pushi    3
			lea      @local98
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_11ac:
			pushi    1
			pushi    24
			callb    proc0_5,  2
			not     
			bnt      code_11ca
			pushi    3
			lea      @local102
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_11ca:
			pushi    1
			pushi    24
			callb    proc0_5,  2
			bnt      code_121d
			pushi    4
			lea      @local106
			push    
			pushi    999
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local4
			jmp      code_121d
code_11ee:
			lsp      param2
			ldi      8
			eq?     
			bnt      code_121d
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			pushi    3
			lea      @local114
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1212:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_121d:
			toss    
			ret     
		)
	)
)

(instance goOutside of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12e4
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      136
			ge?     
			bnt      code_12db
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    130
			pushi    146
			pushSelf
			lag      global0
			send     12
			jmp      code_1322
code_12db:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1322
code_12e4:
			dup     
			ldi      1
			eq?     
			bnt      code_1301
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    130
			pushSelf
			lag      global0
			send     12
			jmp      code_1322
code_1301:
			dup     
			ldi      2
			eq?     
			bnt      code_1322
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			pushi    350
			lag      global2
			send     6
code_1322:
			toss    
			ret     
		)
	)
)

(instance putOnRouge of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_138a
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lea      @local11
			push    
			pushi    4
			pushi    0
			calle    proc851_0,  6
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			lag      global0
			send     8
			jmp      code_13af
code_138a:
			dup     
			ldi      1
			eq?     
			bnt      code_139f
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lag      global0
			send     8
			jmp      code_13af
code_139f:
			dup     
			ldi      2
			eq?     
			bnt      code_13af
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_13af:
			toss    
			ret     
		)
	)
)

(instance stepIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_141c
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lofsa    lobb
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    131
			pushi    170
			pushSelf
			lag      global0
			send     12
			jmp      code_14ca
code_141c:
			dup     
			ldi      1
			eq?     
			bnt      code_1445
			pushi    3
			lsg      global0
			lofsa    lobb
			push    
			pushSelf
			callb    proc0_9,  6
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			lofsa    lobb
			send     18
			jmp      code_14ca
code_1445:
			dup     
			ldi      2
			eq?     
			bnt      code_14ba
			lsg      global126
			ldi      1
			eq?     
			bnt      code_1478
			pushi    1
			pushi    19
			callb    proc0_5,  2
			not     
			bnt      code_1478
			pushi    1
			pushi    19
			callb    proc0_6,  2
			pushi    3
			lea      @local15
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_14a9
code_1478:
			pushi    1
			pushi    20
			callb    proc0_5,  2
			not     
			bnt      code_14a9
			lsg      global126
			ldi      2
			eq?     
			bt       code_148f
			lsg      global126
			ldi      3
			eq?     
code_148f:
			bnt      code_14a9
			pushi    1
			pushi    20
			callb    proc0_6,  2
			pushi    3
			lea      @local19
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
code_14a9:
			pushi    #illegalBits
			pushi    1
			pushi    32768
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_14ca
code_14ba:
			dup     
			ldi      3
			eq?     
			bnt      code_14ca
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_14ca:
			toss    
			ret     
		)
	)
)

(instance moveFromTheWall of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1528
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local10
			pushi    3
			pushi    1360
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_1567
code_1528:
			dup     
			ldi      1
			eq?     
			bnt      code_1553
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1567
code_1553:
			dup     
			ldi      2
			eq?     
			bnt      code_1567
			pushi    0
			callb    proc0_4,  0
			ldi      0
			sal      local10
			pushi    #dispose
			pushi    0
			self     4
code_1567:
			toss    
			ret     
		)
	)
)

(instance handLobb of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_15c3
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    lobb
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1640
code_15c3:
			dup     
			ldi      1
			eq?     
			bnt      code_1630
			lsg      global130
			ldi      3
			eq?     
			bnt      code_15f4
			pushi    #has
			pushi    1
			pushi    3
			lag      global0
			send     6
			bnt      code_15f4
			pushi    4
			lea      @local119
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1640
code_15f4:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_161b
			pushi    1
			pushi    24
			callb    proc0_5,  2
			not     
			bnt      code_161b
			pushi    4
			lea      @local123
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1640
code_161b:
			pushi    4
			lea      @local127
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1640
code_1630:
			dup     
			ldi      2
			eq?     
			bnt      code_1640
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1640:
			toss    
			ret     
		)
	)
)

(instance moveToRobin of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_169b
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    lobb
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1779
code_169b:
			dup     
			ldi      1
			eq?     
			bnt      code_16b1
			pushi    3
			lofsa    lobb
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1779
code_16b1:
			dup     
			ldi      2
			eq?     
			bnt      code_16dc
			lsl      local0
			ldi      0
			eq?     
			bnt      code_16d3
			pushi    4
			lea      @local131
			push    
			pushi    4
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1779
code_16d3:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1779
code_16dc:
			dup     
			ldi      3
			eq?     
			bnt      code_172b
			pushi    #distanceTo
			pushi    1
			lofsa    lobb
			push    
			lag      global0
			send     6
			push    
			ldi      30
			gt?     
			bnt      code_1722
			pushi    150
			pushi    #superClass
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lofsa    lobb
			send     18
			jmp      code_1779
code_1722:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1779
code_172b:
			dup     
			ldi      4
			eq?     
			bnt      code_1769
			lsl      local0
			ldi      0
			eq?     
			bnt      code_1754
			ldi      1
			sal      local0
			pushi    4
			lea      @local135
			push    
			pushi    4
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1779
code_1754:
			pushi    4
			lea      @local143
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1779
code_1769:
			dup     
			ldi      5
			eq?     
			bnt      code_1779
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1779:
			toss    
			ret     
		)
	)
)

(instance moveCloseAndAway of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17d5
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lofsa    lobb
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_189a
code_17d5:
			dup     
			ldi      1
			eq?     
			bnt      code_17eb
			pushi    3
			lsg      global0
			lofsa    lobb
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_189a
code_17eb:
			dup     
			ldi      2
			eq?     
			bnt      code_1808
			pushi    4
			lea      @local147
			push    
			pushi    5
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_189a
code_1808:
			dup     
			ldi      3
			eq?     
			bnt      code_1857
			pushi    #distanceTo
			pushi    1
			lofsa    lobb
			push    
			lag      global0
			send     6
			push    
			ldi      30
			gt?     
			bnt      code_184e
			pushi    150
			pushi    #superClass
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lofsa    lobb
			send     18
			jmp      code_189a
code_184e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_189a
code_1857:
			dup     
			ldi      4
			eq?     
			bnt      code_186d
			pushi    3
			lofsa    lobb
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_189a
code_186d:
			dup     
			ldi      5
			eq?     
			bnt      code_188a
			pushi    4
			lea      @local153
			push    
			pushi    5
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_189a
code_188a:
			dup     
			ldi      6
			eq?     
			bnt      code_189a
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_189a:
			toss    
			ret     
		)
	)
)

(instance goBackRoom of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1917
			pushi    0
			callb    proc0_3,  0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    lobb
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    lobb
			send     4
			push    
			ldi      5
			add     
			push    
			pushSelf
			lag      global0
			send     18
			jmp      code_1a3e
code_1917:
			dup     
			ldi      1
			eq?     
			bnt      code_1958
			pushi    #view
			pushi    1
			pushi    362
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    lobb
			send     24
			pushi    #view
			pushi    1
			pushi    39
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_1a3e
code_1958:
			dup     
			ldi      2
			eq?     
			bnt      code_197e
			pushi    4
			lea      @local164
			push    
			pushi    7
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			pushi    1
			pushi    25
			calle    proc806_1,  2
			jmp      code_1a3e
code_197e:
			dup     
			ldi      3
			eq?     
			bnt      code_199a
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    lobb
			send     14
			jmp      code_1a3e
code_199a:
			dup     
			ldi      4
			eq?     
			bnt      code_19b4
			pushi    #setHeading
			pushi    1
			pushi    180
			lofsa    lobb
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1a3e
code_19b4:
			dup     
			ldi      5
			eq?     
			bnt      code_1a1c
			pushi    #view
			pushi    1
			pushi    361
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    lobb
			send     4
			push    
			pushi    190
			lofsa    lobb
			send     34
			pushi    #view
			pushi    1
			pushi    36
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    180
			pushSelf
			lag      global0
			send     36
			jmp      code_1a3e
code_1a1c:
			dup     
			ldi      6
			eq?     
			bnt      code_1a3e
			pushi    1
			pushi    8
			callb    proc0_6,  2
			pushi    #put
			pushi    1
			pushi    3
			lag      global0
			send     6
			pushi    #newRoom
			pushi    1
			pushi    370
			lag      global2
			send     6
code_1a3e:
			toss    
			ret     
		)
	)
)

(instance killRobinScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ab0
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    lobb
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    lobb
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1b92
code_1ab0:
			dup     
			ldi      1
			eq?     
			bnt      code_1ac6
			pushi    3
			lofsa    lobb
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1b92
code_1ac6:
			dup     
			ldi      2
			eq?     
			bnt      code_1b07
			pushi    #view
			pushi    1
			pushi    362
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    lobb
			send     24
			pushi    #view
			pushi    1
			pushi    39
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_1b92
code_1b07:
			dup     
			ldi      3
			eq?     
			bnt      code_1b29
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    lobb
			send     20
			jmp      code_1b92
code_1b29:
			dup     
			ldi      4
			eq?     
			bnt      code_1b46
			pushi    4
			lea      @local171
			push    
			pushi    7
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1b92
code_1b46:
			dup     
			ldi      5
			eq?     
			bnt      code_1b6d
			pushi    #view
			pushi    1
			pushi    362
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    lobb
			send     26
			jmp      code_1b92
code_1b6d:
			dup     
			ldi      6
			eq?     
			bnt      code_1b92
			ldi      5
			sag      global145
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_1b92:
			toss    
			ret     
		)
	)
)
