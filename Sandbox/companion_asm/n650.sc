;;; Sierra Script 1.0 - (do not remove this comment)
(script# 650)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n927)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm650 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	[local6 11] = [1650 34 1 2 1 2 1 2 1 2]
	[local17 4] = [1650 50 1]
	[local21 4] = [1650 23 1]
	[local25 8] = [1650 42 1 2 1 2 1]
	[local33 6] = [1650 47 2 1 2]
	[local39 4] = [1650 29 1]
	[local43 8] = [1650 30 1 0 1650 31 1]
	[local51 4] = [1650 55 1]
	[local55 4] = [1650 56 1]
	[local59 4] = [1650 57 1]
	[local63 39] = [1650 58 1 0 1650 59 1 0 1650 60 2 1 2 1 2 0 1650 65 2 1 2 0 1650 68 2 1 2 2 0 1650 72 2 1 2 0 1650 75 1]
	[local102 8] = [1650 76 1 0 1650 77 1]
	[local110 4] = [1650 52 1]
	[local114 4] = [1650 53 1]
	[local118 4] = [1650 54 1]
	[local122 4] = [1650 78 1]
)
(instance rm650 of Rm
	(properties
		picture 650
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    40
			pushi    158
			pushi    103
			pushi    120
			pushi    100
			pushi    62
			pushi    124
			pushi    47
			pushi    119
			pushi    6
			pushi    135
			pushi    6
			pushi    149
			pushi    166
			pushi    168
			pushi    173
			pushi    170
			pushi    243
			pushi    171
			pushi    233
			pushi    159
			pushi    247
			pushi    159
			pushi    247
			pushi    156
			pushi    226
			pushi    157
			pushi    223
			pushi    162
			pushi    215
			pushi    162
			pushi    202
			pushi    149
			pushi    203
			pushi    136
			pushi    223
			pushi    127
			pushi    221
			pushi    100
			pushi    170
			pushi    96
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     94
			push    
			self     6
			pushi    #setScript
			pushi    1
			lofsa    enterTheRoom
			push    
			lag      global0
			send     6
			ldi      0
			sal      local4
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    284
			pushi    2
			pushi    0
			pushi    145
			pushi    107
			pushi    0
			lofsa    monk
			send     24
			pushi    #gobletTipped
			pushi    0
			class    Monastery
			send     4
			bnt      code_00e8
			pushi    #setPri
			pushi    1
			pushi    15
			pushi    288
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			lofsa    goblet
			send     16
code_00e8:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_011c
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    thePrior
			send     10
			pushi    #noPriorExperience
			pushi    1
			pushi    0
			class    Monastery
			send     6
			pushi    #setPri
			pushi    1
			pushi    15
			pushi    107
			pushi    0
			lofsa    goblet
			send     10
code_011c:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_014f
			pushi    1
			pushi    83
			callb    proc0_5,  2
			not     
			bnt      code_014f
			pushi    #cel
			pushi    1
			pushi    2
			pushi    66
			pushi    1
			pushi    15
			pushi    284
			pushi    2
			pushi    99
			pushi    148
			pushi    107
			pushi    0
			lofsa    scroll
			send     24
code_014f:
			pushi    11
			lofsa    rack
			push    
			lofsa    steps
			push    
			lofsa    pDesk
			push    
			lofsa    desk
			push    
			lofsa    chest
			push    
			lofsa    desk2
			push    
			lofsa    candle
			push    
			lofsa    fWindow
			push    
			lofsa    sWindow
			push    
			lofsa    floor
			push    
			lofsa    walls
			push    
			calle    proc806_3,  22
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #onControl
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			and     
			bnt      code_01a0
			pushi    #observeControl
			pushi    1
			pushi    2
			lag      global0
			send     6
			jmp      code_01a9
code_01a0:
			pushi    #ignoreControl
			pushi    1
			pushi    2
			lag      global0
			send     6
code_01a9:
			lal      local2
			bnt      code_01e1
			pushi    #onControl
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			and     
			bnt      code_01e1
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			ne?     
			bnt      code_01e1
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    2
			pushi    1650
			pushi    51
			calle    proc13_4,  4
			jmp      code_0223
code_01e1:
			lal      local5
			bnt      code_0203
			pushi    #onControl
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			and     
			bnt      code_0203
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
			jmp      code_0223
code_0203:
			lsg      global115
			ldi      2
			eq?     
			bnt      code_0223
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0223
			pushi    #setScript
			pushi    1
			lofsa    burnedByFire
			push    
			lag      global0
			send     6
code_0223:
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

(instance rack of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    228
			pushi    1
			pushi    228
			pushi    96
			pushi    173
			pushi    92
			pushi    173
			pushi    1
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_02d0
			pushi    #setScript
			pushi    3
			lofsa    goDoIt
			push    
			pushi    0
			pushi    1
			lag      global0
			send     10
			jmp      code_032e
code_02d0:
			dup     
			ldi      3
			eq?     
			bnt      code_02e3
			pushi    2
			pushi    1650
			pushi    1
			calle    proc13_4,  4
			jmp      code_032e
code_02e3:
			dup     
			ldi      4
			eq?     
			bnt      code_0323
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_02ff
			pushi    2
			pushi    1650
			pushi    2
			calle    proc13_4,  4
			jmp      code_031f
code_02ff:
			dup     
			ldi      16
			eq?     
			bnt      code_0312
			pushi    2
			pushi    1650
			pushi    2
			calle    proc13_4,  4
			jmp      code_031f
code_0312:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Feature,  8
code_031f:
			toss    
			jmp      code_032e
code_0323:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_032e:
			toss    
			ret     
		)
	)
)

(instance steps of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    167
			pushi    62
			pushi    167
			pushi    92
			pushi    154
			pushi    100
			pushi    137
			pushi    98
			pushi    137
			pushi    90
			pushi    150
			pushi    62
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_03c9
			pushi    2
			pushi    1650
			pushi    3
			calle    proc13_4,  4
			jmp      code_03e8
code_03c9:
			dup     
			ldi      3
			eq?     
			bnt      code_03dd
			pushi    2
			pushi    1650
			pushi    4
			calle    proc13_4,  4
			jmp      code_03e8
code_03dd:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_03e8:
			toss    
			ret     
		)
	)
)

(instance pDesk of Feature
	(properties
		y 167
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    35
			pushi    140
			pushi    39
			pushi    137
			pushi    155
			pushi    150
			pushi    155
			pushi    158
			pushi    35
			pushi    145
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04cb
			pushi    #noPriorExperience
			pushi    0
			class    Monastery
			send     4
			bnt      code_048b
			pushi    2
			pushi    1650
			pushi    5
			calle    proc13_4,  4
			jmp      code_0569
code_048b:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_04a7
			pushi    2
			pushi    1650
			pushi    6
			calle    proc13_4,  4
			jmp      code_0569
code_04a7:
			pushi    1
			pushi    83
			callb    proc0_5,  2
			not     
			bnt      code_04be
			pushi    2
			pushi    1650
			pushi    7
			calle    proc13_4,  4
			jmp      code_0569
code_04be:
			pushi    2
			pushi    1650
			pushi    8
			calle    proc13_4,  4
			jmp      code_0569
code_04cb:
			dup     
			ldi      3
			eq?     
			bnt      code_051c
			pushi    #noPriorExperience
			pushi    0
			class    Monastery
			send     4
			bnt      code_04ea
			pushi    2
			pushi    1650
			pushi    9
			calle    proc13_4,  4
			jmp      code_0569
code_04ea:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0506
			pushi    2
			pushi    1650
			pushi    10
			calle    proc13_4,  4
			jmp      code_0569
code_0506:
			pushi    1
			pushi    83
			callb    proc0_5,  2
			bnt      code_0569
			pushi    2
			pushi    1650
			pushi    11
			calle    proc13_4,  4
			jmp      code_0569
code_051c:
			dup     
			ldi      4
			eq?     
			bnt      code_055e
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_0539
			pushi    2
			pushi    1650
			pushi    12
			calle    proc13_4,  4
			jmp      code_055a
code_0539:
			dup     
			ldi      16
			eq?     
			bnt      code_054d
			pushi    2
			pushi    1650
			pushi    12
			calle    proc13_4,  4
			jmp      code_055a
code_054d:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Feature,  8
code_055a:
			toss    
			jmp      code_0569
code_055e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0569:
			toss    
			ret     
		)
	)
)

(instance desk of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    49
			pushi    93
			pushi    100
			pushi    79
			pushi    112
			pushi    90
			pushi    112
			pushi    100
			pushi    64
			pushi    119
			pushi    47
			pushi    115
			pushi    48
			pushi    93
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0603
			pushi    2
			pushi    1650
			pushi    13
			calle    proc13_4,  4
			jmp      code_0664
code_0603:
			dup     
			ldi      3
			eq?     
			bnt      code_0617
			pushi    2
			pushi    1650
			pushi    14
			calle    proc13_4,  4
			jmp      code_0664
code_0617:
			dup     
			ldi      4
			eq?     
			bnt      code_0659
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_0634
			pushi    2
			pushi    1650
			pushi    12
			calle    proc13_4,  4
			jmp      code_0655
code_0634:
			dup     
			ldi      16
			eq?     
			bnt      code_0648
			pushi    2
			pushi    1650
			pushi    12
			calle    proc13_4,  4
			jmp      code_0655
code_0648:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Feature,  8
code_0655:
			toss    
			jmp      code_0664
code_0659:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0664:
			toss    
			ret     
		)
	)
)

(instance desk2 of Feature
	(properties
		y 132
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    254
			pushi    127
			pushi    251
			pushi    154
			pushi    226
			pushi    154
			pushi    214
			pushi    141
			pushi    211
			pushi    128
			pushi    228
			pushi    116
			pushi    237
			pushi    116
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0708
			pushi    2
			pushi    1650
			pushi    13
			calle    proc13_4,  4
			jmp      code_0769
code_0708:
			dup     
			ldi      3
			eq?     
			bnt      code_071c
			pushi    2
			pushi    1650
			pushi    14
			calle    proc13_4,  4
			jmp      code_0769
code_071c:
			dup     
			ldi      4
			eq?     
			bnt      code_075e
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_0739
			pushi    2
			pushi    1650
			pushi    12
			calle    proc13_4,  4
			jmp      code_075a
code_0739:
			dup     
			ldi      16
			eq?     
			bnt      code_074d
			pushi    2
			pushi    1650
			pushi    12
			calle    proc13_4,  4
			jmp      code_075a
code_074d:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Feature,  8
code_075a:
			toss    
			jmp      code_0769
code_075e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0769:
			toss    
			ret     
		)
	)
)

(instance candle of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    123
			pushi    53
			pushi    124
			pushi    62
			pushi    118
			pushi    71
			pushi    117
			pushi    95
			pushi    112
			pushi    98
			pushi    111
			pushi    76
			pushi    105
			pushi    68
			pushi    110
			pushi    67
			pushi    111
			pushi    42
			pushi    114
			pushi    42
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_080f
			pushi    2
			pushi    1650
			pushi    15
			calle    proc13_4,  4
			jmp      code_082e
code_080f:
			dup     
			ldi      3
			eq?     
			bnt      code_0823
			pushi    2
			pushi    1650
			pushi    16
			calle    proc13_4,  4
			jmp      code_082e
code_0823:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_082e:
			toss    
			ret     
		)
	)
)

(instance chest of Feature
	(properties
		y 160
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    270
			pushi    152
			pushi    275
			pushi    157
			pushi    274
			pushi    167
			pushi    236
			pushi    164
			pushi    237
			pushi    147
			pushi    242
			pushi    142
			pushi    248
			pushi    141
			pushi    255
			pushi    141
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_08db
			pushi    2
			pushi    1650
			pushi    17
			calle    proc13_4,  4
			jmp      code_08fc
code_08db:
			dup     
			ldi      3
			eq?     
			bnt      code_08f1
			pushi    #setScript
			pushi    1
			lofsa    openChest
			push    
			lag      global0
			send     6
			jmp      code_08fc
code_08f1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_08fc:
			toss    
			ret     
		)
	)
)

(instance floor of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    115
			pushi    88
			pushi    227
			pushi    96
			pushi    227
			pushi    135
			pushi    274
			pushi    168
			pushi    35
			pushi    144
			pushi    34
			pushi    120
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0997
			pushi    2
			pushi    1650
			pushi    18
			calle    proc13_4,  4
			jmp      code_09a2
code_0997:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_09a2:
			toss    
			ret     
		)
	)
)

(instance fWindow of Feature
	(properties
		y 172
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    42
			pushi    57
			pushi    0
			pushi    42
			pushi    22
			pushi    33
			pushi    57
			pushi    35
			pushi    145
			pushi    92
			pushi    153
			pushi    181
			pushi    160
			pushi    263
			pushi    167
			pushi    289
			pushi    167
			pushi    293
			pushi    77
			pushi    290
			pushi    32
			pushi    280
			pushi    9
			pushi    271
			pushi    0
			pushi    293
			pushi    0
			pushi    300
			pushi    11
			pushi    308
			pushi    47
			pushi    303
			pushi    181
			pushi    160
			pushi    174
			pushi    16
			pushi    152
			pushi    13
			pushi    43
			pushi    15
			pushi    29
			pushi    34
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     98
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a83
			pushi    2
			pushi    1650
			pushi    19
			calle    proc13_4,  4
			jmp      code_0a8e
code_0a83:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0a8e:
			toss    
			ret     
		)
	)
)

(instance sWindow of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    235
			pushi    113
			pushi    236
			pushi    56
			pushi    239
			pushi    39
			pushi    247
			pushi    31
			pushi    255
			pushi    29
			pushi    264
			pushi    31
			pushi    271
			pushi    38
			pushi    274
			pushi    45
			pushi    277
			pushi    57
			pushi    275
			pushi    131
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b5b
			pushi    #onControl
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			and     
			bnt      code_0b4d
			pushi    2
			pushi    1650
			pushi    20
			calle    proc13_4,  4
			jmp      code_0b66
code_0b4d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
			jmp      code_0b66
code_0b5b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b66:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties
		nsBottom 189
		nsRight 319
		description 8511
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0bc6
			pushi    2
			pushi    1650
			pushi    21
			calle    proc13_4,  4
			jmp      code_0bd1
code_0bc6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0bd1:
			toss    
			ret     
		)
	)
)

(instance thePrior of Actor
	(properties
		x 93
		y 162
		view 643
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c2e
			pushi    2
			pushi    1650
			pushi    22
			calle    proc13_4,  4
			jmp      code_0c69
code_0c2e:
			dup     
			ldi      5
			eq?     
			bnt      code_0c44
			pushi    #setScript
			pushi    1
			lofsa    talkToPrior
			push    
			lag      global0
			send     6
			jmp      code_0c69
code_0c44:
			dup     
			ldi      3
			eq?     
			bnt      code_0c58
			pushi    2
			pushi    1650
			pushi    79
			calle    proc13_4,  4
			jmp      code_0c69
code_0c58:
			dup     
			ldi      4
			eq?     
			bnt      code_0c69
			pushi    2
			pushi    1650
			pushi    80
			calle    proc13_4,  4
code_0c69:
			toss    
			ret     
		)
	)
)

(instance monk of Actor
	(properties
		x 200
		y 101
		view 16
		loop 3
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      34
			lt?     
			bnt      code_0d11
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			lofsa    walls
			send     6
			jmp      code_0e4b
code_0d11:
			lofsa    monk
			sal      local1
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d2c
			pushi    2
			pushi    1650
			pushi    33
			calle    proc13_4,  4
			jmp      code_0e4a
code_0d2c:
			dup     
			ldi      5
			eq?     
			bnt      code_0d43
			pushi    2
			lea      @local110
			push    
			pushi    11
			calle    proc851_0,  4
			jmp      code_0e4a
code_0d43:
			dup     
			ldi      3
			eq?     
			bnt      code_0d5a
			pushi    2
			lea      @local114
			push    
			pushi    11
			calle    proc851_0,  4
			jmp      code_0e4a
code_0d5a:
			dup     
			ldi      4
			eq?     
			bnt      code_0e4a
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0d7a
			pushi    2
			lea      @local118
			push    
			pushi    11
			calle    proc851_0,  4
			jmp      code_0e49
code_0d7a:
			dup     
			ldi      2
			eq?     
			bnt      code_0db5
			pushi    2
			lea      @local51
			push    
			pushi    11
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    2
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65336
			calle    proc806_1,  2
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    1
			lag      global0
			send     10
			jmp      code_0e49
code_0db5:
			dup     
			ldi      14
			eq?     
			bnt      code_0df0
			pushi    2
			lea      @local55
			push    
			pushi    11
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    14
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65486
			calle    proc806_1,  2
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    2
			lag      global0
			send     10
			jmp      code_0e49
code_0df0:
			dup     
			ldi      17
			eq?     
			bnt      code_0e09
			pushi    #setScript
			pushi    3
			lofsa    giveItBack
			push    
			pushi    0
			pushi    1
			lag      global0
			send     10
			jmp      code_0e49
code_0e09:
			dup     
			ldi      16
			eq?     
			bnt      code_0e3c
			pushi    2
			lea      @local63
			push    
			pushi    11
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    16
			pushi    65535
			lag      global0
			send     8
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    4
			lag      global0
			send     10
			jmp      code_0e49
code_0e3c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Actor,  8
code_0e49:
			toss    
code_0e4a:
			toss    
code_0e4b:
			ret     
		)
	)
)

(instance monk2 of Actor
	(properties
		y 145
		view 128
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #x
			pushi    0
			lofsa    monk2
			send     4
			push    
			ldi      34
			lt?     
			bnt      code_0ef1
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			lofsa    walls
			send     6
			jmp      code_102b
code_0ef1:
			lofsa    monk2
			sal      local1
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f0c
			pushi    2
			pushi    1650
			pushi    33
			calle    proc13_4,  4
			jmp      code_102a
code_0f0c:
			dup     
			ldi      5
			eq?     
			bnt      code_0f23
			pushi    2
			lea      @local110
			push    
			pushi    11
			calle    proc851_0,  4
			jmp      code_102a
code_0f23:
			dup     
			ldi      3
			eq?     
			bnt      code_0f3a
			pushi    2
			lea      @local114
			push    
			pushi    11
			calle    proc851_0,  4
			jmp      code_102a
code_0f3a:
			dup     
			ldi      4
			eq?     
			bnt      code_102a
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0f5a
			pushi    2
			lea      @local118
			push    
			pushi    11
			calle    proc851_0,  4
			jmp      code_1029
code_0f5a:
			dup     
			ldi      2
			eq?     
			bnt      code_0f95
			pushi    2
			lea      @local51
			push    
			pushi    11
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    2
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65336
			calle    proc806_1,  2
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    1
			lag      global0
			send     10
			jmp      code_1029
code_0f95:
			dup     
			ldi      14
			eq?     
			bnt      code_0fd0
			pushi    2
			lea      @local55
			push    
			pushi    11
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    14
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65486
			calle    proc806_1,  2
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    2
			lag      global0
			send     10
			jmp      code_1029
code_0fd0:
			dup     
			ldi      17
			eq?     
			bnt      code_0fe9
			pushi    #setScript
			pushi    3
			lofsa    giveItBack
			push    
			pushi    0
			pushi    1
			lag      global0
			send     10
			jmp      code_1029
code_0fe9:
			dup     
			ldi      16
			eq?     
			bnt      code_101c
			pushi    2
			lea      @local63
			push    
			pushi    11
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    16
			pushi    65535
			lag      global0
			send     8
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    4
			lag      global0
			send     10
			jmp      code_1029
code_101c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Actor,  8
code_1029:
			toss    
code_102a:
			toss    
code_102b:
			ret     
		)
	)
)

(instance scroll of Prop
	(properties
		x 113
		y 152
		view 643
		loop 2
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_10c8
			pushi    2
			pushi    1650
			pushi    32
			calle    proc13_4,  4
			jmp      code_10db
code_10c8:
			dup     
			ldi      3
			eq?     
			bnt      code_10db
			pushi    #setScript
			pushi    1
			lofsa    getScroll
			push    
			lag      global0
			send     6
code_10db:
			toss    
			ret     
		)
	)
)

(instance goblet of Prop
	(properties
		x 123
		y 189
		z 36
		view 643
		loop 4
		signal $4000
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_117e
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_1171
			pushi    2
			pushi    1650
			pushi    24
			calle    proc13_4,  4
			jmp      code_11fa
code_1171:
			pushi    2
			pushi    1650
			pushi    25
			calle    proc13_4,  4
			jmp      code_11fa
code_117e:
			dup     
			ldi      3
			eq?     
			bnt      code_11b3
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_11a6
			pushi    #setScript
			pushi    3
			lofsa    goDoIt
			push    
			pushi    0
			pushi    0
			lag      global0
			send     10
			jmp      code_11fa
code_11a6:
			pushi    2
			pushi    1650
			pushi    26
			calle    proc13_4,  4
			jmp      code_11fa
code_11b3:
			dup     
			ldi      4
			eq?     
			bnt      code_11ef
			lsp      param2
			dup     
			ldi      14
			eq?     
			bnt      code_11de
			pushi    #gobletTipped
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_11eb
			pushi    #setScript
			pushi    1
			lofsa    dropStone
			push    
			lag      global0
			send     6
			jmp      code_11eb
code_11de:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Prop,  8
code_11eb:
			toss    
			jmp      code_11fa
code_11ef:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_11fa:
			toss    
			ret     
		)
	)
)

(instance openChest of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_129b
			pushi    0
			callb    proc0_3,  0
			pushi    #setAvoider
			pushi    1
			class    PAvoider
			push    
			lag      global0
			send     6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    244
			pushi    171
			pushSelf
			lag      global0
			send     12
			jmp      code_12d6
code_129b:
			dup     
			ldi      1
			eq?     
			bnt      code_12b3
			pushi    2
			lsg      global0
			lofsa    chest
			push    
			callb    proc0_9,  4
			ldi      3
			aTop     cycles
			jmp      code_12d6
code_12b3:
			dup     
			ldi      2
			eq?     
			bnt      code_12d6
			pushi    2
			pushi    1650
			pushi    27
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #setAvoider
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_12d6:
			toss    
			ret     
		)
	)
)

(instance enterTheRoom of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1347
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    6
			pushi    145
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    72
			pushi    147
			pushSelf
			lag      global0
			send     24
			jmp      code_135b
code_1347:
			dup     
			ldi      1
			eq?     
			bnt      code_135b
			ldi      1
			sal      local5
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_135b:
			toss    
			ret     
		)
	)
)

(instance knockOverGoblet of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13cc
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			pushi    2
			lsg      global0
			lofsa    thePrior
			push    
			callb    proc0_9,  4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    thePrior
			send     8
			jmp      code_14d4
code_13cc:
			dup     
			ldi      1
			eq?     
			bnt      code_1414
			pushi    #play
			pushi    0
			lofsa    scrollSound
			send     4
			pushi    #firstTimeTalk
			pushi    0
			class    Monastery
			send     4
			bnt      code_1401
			pushi    4
			lea      @local25
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_14d4
code_1401:
			pushi    4
			lea      @local39
			push    
			pushi    8
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_14d4
code_1414:
			dup     
			ldi      2
			eq?     
			bnt      code_142b
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    thePrior
			send     8
			jmp      code_14d4
code_142b:
			dup     
			ldi      3
			eq?     
			bnt      code_144b
			pushi    #play
			pushi    0
			lofsa    scrollSound
			send     4
			pushi    #setScript
			pushi    2
			lofsa    tipGoblet
			push    
			pushSelf
			lofsa    goblet
			send     8
			jmp      code_14d4
code_144b:
			dup     
			ldi      4
			eq?     
			bnt      code_1492
			pushi    #firstTimeTalk
			pushi    0
			class    Monastery
			send     4
			bnt      code_1478
			pushi    4
			lea      @local33
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_14d4
code_1478:
			pushi    4
			lea      @local43
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_14d4
code_1492:
			dup     
			ldi      5
			eq?     
			bnt      code_14aa
			pushi    #setScript
			pushi    2
			lofsa    priorLeave
			push    
			pushSelf
			lofsa    thePrior
			send     8
			jmp      code_14d4
code_14aa:
			dup     
			ldi      6
			eq?     
			bnt      code_14d4
			pushi    #firstTimeTalk
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_14c7
			pushi    2
			pushi    1650
			pushi    31
			calle    proc13_4,  4
code_14c7:
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_14d4:
			toss    
			ret     
		)
	)
)

(instance tipGoblet of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_153c
			pushi    #ignoreActors
			pushi    1
			pushi    1
			lofsa    thePrior
			send     6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    132
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_16a2
code_153c:
			dup     
			ldi      1
			eq?     
			bnt      code_1552
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_16a2
code_1552:
			dup     
			ldi      2
			eq?     
			bnt      code_157a
			pushi    #posn
			pushi    2
			pushi    126
			pushi    151
			pushi    5
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     26
			ldi      6
			aTop     ticks
			jmp      code_16a2
code_157a:
			dup     
			ldi      3
			eq?     
			bnt      code_159c
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lag      global0
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    goblet
			send     8
			jmp      code_16a2
code_159c:
			dup     
			ldi      4
			eq?     
			bnt      code_15c7
			pushi    #play
			pushi    0
			lofsa    spillSound
			send     4
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			lofsa    thePrior
			send     12
			pushi    #init
			pushi    0
			lofsa    scroll
			send     4
			ldi      6
			aTop     ticks
			jmp      code_16a2
code_15c7:
			dup     
			ldi      5
			eq?     
			bnt      code_15ef
			pushi    #posn
			pushi    2
			pushi    106
			pushi    145
			lofsa    scroll
			send     8
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lofsa    thePrior
			send     12
			jmp      code_16a2
code_15ef:
			dup     
			ldi      6
			eq?     
			bnt      code_1617
			pushi    #posn
			pushi    2
			pushi    99
			pushi    148
			lofsa    scroll
			send     8
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    thePrior
			send     12
			jmp      code_16a2
code_1617:
			dup     
			ldi      7
			eq?     
			bnt      code_163a
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    thePrior
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    scroll
			send     8
			jmp      code_16a2
code_163a:
			dup     
			ldi      8
			eq?     
			bnt      code_166b
			pushi    #y
			pushi    1
			pushi    168
			pushi    85
			pushi    1
			pushi    20
			lofsa    scroll
			send     12
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    128
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_16a2
code_166b:
			dup     
			ldi      9
			eq?     
			bnt      code_1689
			pushi    #play
			pushi    0
			lofsa    scrollSound
			send     4
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_16a2
code_1689:
			dup     
			ldi      10
			eq?     
			bnt      code_16a2
			pushi    #gobletTipped
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
code_16a2:
			toss    
			ret     
		)
	)
)

(instance priorLeave of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1714
			pushi    #setAvoider
			pushi    1
			class    PAvoider
			push    
			pushi    5
			pushi    1
			pushi    641
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65526
			pushi    145
			pushSelf
			lofsa    thePrior
			send     30
			jmp      code_1732
code_1714:
			dup     
			ldi      1
			eq?     
			bnt      code_1732
			pushi    #wherePrior
			pushi    1
			pushi    3
			class    Monastery
			send     6
			pushi    #dispose
			pushi    0
			lofsa    thePrior
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1732:
			toss    
			ret     
		)
	)
)

(instance talkToPrior of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1794
			pushi    2
			lsg      global0
			lofsa    thePrior
			push    
			callb    proc0_9,  4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    thePrior
			send     8
			jmp      code_181b
code_1794:
			dup     
			ldi      1
			eq?     
			bnt      code_17ec
			pushi    #play
			pushi    0
			lofsa    scrollSound
			send     4
			pushi    #firstTimeTalk
			pushi    0
			class    Monastery
			send     4
			bnt      code_17d2
			pushi    4
			lea      @local6
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			pushi    #firstTimeTalk
			pushi    1
			pushi    0
			class    Monastery
			send     6
			jmp      code_181b
code_17d2:
			pushi    4
			lea      @local21
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_181b
code_17ec:
			dup     
			ldi      2
			eq?     
			bnt      code_1803
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    thePrior
			send     8
			jmp      code_181b
code_1803:
			dup     
			ldi      3
			eq?     
			bnt      code_181b
			pushi    #play
			pushi    0
			lofsa    scrollSound
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
code_181b:
			toss    
			ret     
		)
	)
)

(instance getScroll of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_187d
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    109
			pushi    163
			pushSelf
			lag      global0
			send     12
			jmp      code_18fc
code_187d:
			dup     
			ldi      1
			eq?     
			bnt      code_189c
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     18
			ldi      6
			aTop     ticks
			jmp      code_18fc
code_189c:
			dup     
			ldi      2
			eq?     
			bnt      code_18c0
			pushi    #get
			pushi    1
			pushi    16
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			pushi    #hide
			pushi    0
			lofsa    scroll
			send     4
			jmp      code_18fc
code_18c0:
			dup     
			ldi      3
			eq?     
			bnt      code_18e0
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    110
			pushi    160
			pushSelf
			lag      global0
			send     12
			jmp      code_18fc
code_18e0:
			dup     
			ldi      4
			eq?     
			bnt      code_18fc
			pushi    2
			pushi    150
			pushi    83
			calle    proc806_1,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_18fc:
			toss    
			ret     
		)
	)
)

(instance dropStone of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1969
			pushi    0
			callb    proc0_3,  0
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    thePrior
			send     6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    132
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_1afa
code_1969:
			dup     
			ldi      1
			eq?     
			bnt      code_197f
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_1afa
code_197f:
			dup     
			ldi      2
			eq?     
			bnt      code_19a7
			pushi    #posn
			pushi    2
			pushi    122
			pushi    149
			pushi    5
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     26
			ldi      3
			aTop     cycles
			jmp      code_1afa
code_19a7:
			dup     
			ldi      3
			eq?     
			bnt      code_19c0
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lag      global0
			send     12
			jmp      code_1afa
code_19c0:
			dup     
			ldi      4
			eq?     
			bnt      code_19da
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    65535
			pushSelf
			lag      global0
			send     12
			jmp      code_1afa
code_19da:
			dup     
			ldi      5
			eq?     
			bnt      code_1a31
			pushi    #loop
			pushi    1
			pushi    1
			lofsa    thePrior
			send     6
			pushi    #setPri
			pushi    1
			pushi    15
			pushi    107
			pushi    0
			lofsa    scroll
			send     10
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    thePrior
			send     6
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    scroll
			send     6
			pushi    #view
			pushi    1
			pushi    16
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    128
			pushi    150
			pushSelf
			lag      global0
			send     24
			jmp      code_1afa
code_1a31:
			dup     
			ldi      6
			eq?     
			bnt      code_1a4f
			pushi    #play
			pushi    0
			lofsa    scrollSound
			send     4
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_1afa
code_1a4f:
			dup     
			ldi      7
			eq?     
			bnt      code_1a70
			pushi    4
			lea      @local17
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1afa
code_1a70:
			dup     
			ldi      8
			eq?     
			bnt      code_1ac9
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    41
			pushi    147
			pushSelf
			lofsa    monk2
			send     28
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      145
			lt?     
			bnt      code_1afa
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    108
			pushi    140
			pushSelf
			lofsa    monk
			send     12
			jmp      code_1afa
code_1ac9:
			dup     
			ldi      9
			eq?     
			bnt      code_1ad7
			ldi      2
			aTop     cycles
			jmp      code_1afa
code_1ad7:
			dup     
			ldi      10
			eq?     
			bnt      code_1afa
			ldi      22
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1afa:
			toss    
			ret     
		)
	)
)

(instance burnedByFire of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b6f
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk2
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    thePrior
			send     6
			ldi      20
			sag      global145
			ldi      1
			aTop     cycles
			jmp      code_1c5e
code_1b6f:
			dup     
			ldi      1
			eq?     
			bnt      code_1b8a
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65
			pushi    114
			pushSelf
			lag      global0
			send     12
			jmp      code_1c5e
code_1b8a:
			dup     
			ldi      2
			eq?     
			bnt      code_1bdb
			pushi    #view
			pushi    1
			pushi    16
			pushi    162
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    19
			pushi    138
			pushi    107
			pushi    0
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    61
			pushi    134
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local3
			send     54
			jmp      code_1c5e
code_1bdb:
			dup     
			ldi      3
			eq?     
			bnt      code_1bf5
			pushi    4
			lea      @local122
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1c5e
code_1bf5:
			dup     
			ldi      4
			eq?     
			bnt      code_1c1f
			pushi    #view
			pushi    1
			pushi    585
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lal      local3
			send     24
			ldi      2
			aTop     cycles
			jmp      code_1c5e
code_1c1f:
			dup     
			ldi      5
			eq?     
			bnt      code_1c4c
			pushi    #play
			pushi    0
			lofsa    dieSound
			send     4
			pushi    #view
			pushi    1
			pushi    22
			pushi    162
			pushi    1
			pushi    2
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
			jmp      code_1c5e
code_1c4c:
			dup     
			ldi      6
			eq?     
			bnt      code_1c5e
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_1c5e:
			toss    
			ret     
		)
	)
)

(instance ripsOff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cf7
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk2
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    thePrior
			send     6
			pushi    299
			pushi    1
			class    PAvoider
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
			ldi      20
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
			add     
			push    
			pushSelf
			lal      local1
			send     18
			jmp      code_1d7c
code_1cf7:
			dup     
			ldi      1
			eq?     
			bnt      code_1d6c
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1d1c
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    6
			pushi    145
			pushSelf
			lal      local1
			send     12
			jmp      code_1d68
code_1d1c:
			dup     
			ldi      2
			eq?     
			bnt      code_1d38
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    6
			pushi    145
			pushSelf
			lal      local1
			send     12
			jmp      code_1d68
code_1d38:
			dup     
			ldi      3
			eq?     
			bnt      code_1d54
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    200
			pushi    101
			pushSelf
			lal      local1
			send     12
			jmp      code_1d68
code_1d54:
			dup     
			ldi      4
			eq?     
			bnt      code_1d68
			pushi    #setScript
			pushi    2
			lofsa    putItBack
			push    
			pushSelf
			lal      local1
			send     8
code_1d68:
			toss    
			jmp      code_1d7c
code_1d6c:
			dup     
			ldi      2
			eq?     
			bnt      code_1d7c
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1d7c:
			toss    
			ret     
		)
	)
)

(instance putItBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1dd9
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    109
			pushi    163
			pushSelf
			lal      local1
			send     12
			jmp      code_1e54
code_1dd9:
			dup     
			ldi      1
			eq?     
			bnt      code_1df8
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			lal      local1
			send     18
			ldi      3
			aTop     cycles
			jmp      code_1e54
code_1df8:
			dup     
			ldi      2
			eq?     
			bnt      code_1e17
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lal      local1
			send     8
			pushi    #show
			pushi    0
			lofsa    scroll
			send     4
			jmp      code_1e54
code_1e17:
			dup     
			ldi      3
			eq?     
			bnt      code_1e48
			pushi    #view
			pushi    1
			pushi    16
			pushi    6
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			lal      local1
			send     18
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    6
			pushi    145
			pushSelf
			lal      local1
			send     12
			jmp      code_1e54
code_1e48:
			dup     
			ldi      4
			eq?     
			bnt      code_1e54
			pushi    #dispose
			pushi    0
			self     4
code_1e54:
			toss    
			ret     
		)
	)
)

(instance giveItBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1eb6
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    133
			pushi    154
			pushSelf
			lag      global0
			send     12
			jmp      code_1f4d
code_1eb6:
			dup     
			ldi      1
			eq?     
			bnt      code_1eef
			pToa     register
			bnt      code_1ed5
			pushi    4
			lea      @local59
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1f4d
code_1ed5:
			pushi    4
			lea      @local102
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1f4d
code_1eef:
			dup     
			ldi      2
			eq?     
			bnt      code_1f0b
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    218
			pushi    110
			pushSelf
			lag      global0
			send     12
			jmp      code_1f4d
code_1f0b:
			dup     
			ldi      3
			eq?     
			bnt      code_1f31
			pToa     register
			bnt      code_1f2a
			pushi    #setScript
			pushi    3
			lofsa    ripsOff
			push    
			pushi    0
			pushi    3
			lag      global0
			send     10
			jmp      code_1f4d
code_1f2a:
			ldi      1
			aTop     cycles
			jmp      code_1f4d
code_1f31:
			dup     
			ldi      4
			eq?     
			bnt      code_1f4d
			pushi    0
			callb    proc0_4,  0
			pushi    #put
			pushi    2
			pushi    17
			pushi    65535
			lag      global0
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_1f4d:
			toss    
			ret     
		)
	)
)

(instance goDoIt of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1fa3
			ldi      2
			aTop     cycles
			pushi    0
			callb    proc0_3,  0
			jmp      code_201b
code_1fa3:
			dup     
			ldi      1
			eq?     
			bnt      code_1fdd
			pToa     register
			bnt      code_1fb5
			ldi      190
			jmp      code_1fb8
code_1fb5:
			ldi      140
code_1fb8:
			sat      temp0
			pToa     register
			bnt      code_1fc4
			ldi      97
			jmp      code_1fc7
code_1fc4:
			ldi      140
code_1fc7:
			sat      temp1
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     12
			jmp      code_201b
code_1fdd:
			dup     
			ldi      2
			eq?     
			bnt      code_200f
			pToa     register
			bnt      code_1ffc
			pushi    #doit
			pushi    0
			pushi    1
			pushi    660
			callk    ScriptID,  2
			send     4
			pushi    0
			callb    proc0_4,  0
			jmp      code_2008
code_1ffc:
			pushi    #setScript
			pushi    1
			lofsa    knockOverGoblet
			push    
			lag      global0
			send     6
code_2008:
			ldi      1
			aTop     cycles
			jmp      code_201b
code_200f:
			dup     
			ldi      3
			eq?     
			bnt      code_201b
			pushi    #dispose
			pushi    0
			self     4
code_201b:
			toss    
			ret     
		)
	)
)

(instance scrollSound of Sound
	(properties
		flags $0001
		number 633
	)
)

(instance spillSound of Sound
	(properties
		flags $0001
		number 634
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
