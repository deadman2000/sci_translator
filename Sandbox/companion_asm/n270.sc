;;; Sierra Script 1.0 - (do not remove this comment)
(script# 270)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	rm270 0
)

(local
	[local0 4] = [1270 0 1]
	local4
)
(instance rm270 of Rm
	(properties
		picture 270
		style $0064
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_3,  0
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    74
			pushi    140
			pushi    154
			pushi    134
			pushi    156
			pushi    119
			pushi    158
			pushi    114
			pushi    161
			pushi    106
			pushi    160
			pushi    95
			pushi    164
			pushi    101
			pushi    176
			pushi    112
			pushi    176
			pushi    118
			pushi    172
			pushi    122
			pushi    173
			pushi    126
			pushi    169
			pushi    136
			pushi    169
			pushi    145
			pushi    170
			pushi    153
			pushi    176
			pushi    153
			pushi    182
			pushi    149
			pushi    188
			pushi    147
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    163
			pushi    312
			pushi    161
			pushi    308
			pushi    160
			pushi    239
			pushi    147
			pushi    243
			pushi    153
			pushi    253
			pushi    156
			pushi    237
			pushi    158
			pushi    230
			pushi    162
			pushi    214
			pushi    161
			pushi    206
			pushi    159
			pushi    188
			pushi    158
			pushi    171
			pushi    156
			pushi    160
			pushi    154
			dup     
			pushi    153
			dup     
			pushi    146
			dup     
			pushi    145
			pushi    146
			pushi    153
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     162
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    32
			pushi    167
			pushi    171
			pushi    169
			pushi    162
			pushi    192
			pushi    164
			pushi    211
			pushi    169
			pushi    220
			pushi    179
			pushi    188
			pushi    185
			pushi    190
			pushi    189
			pushi    168
			pushi    189
			pushi    169
			pushi    185
			pushi    173
			pushi    184
			pushi    174
			pushi    179
			pushi    182
			pushi    177
			pushi    186
			pushi    178
			pushi    187
			pushi    175
			pushi    176
			pushi    175
			dup     
			pushi    173
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     78
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    48
			pushi    235
			pushi    166
			pushi    240
			pushi    163
			pushi    245
			pushi    164
			pushi    249
			pushi    169
			pushi    260
			pushi    167
			pushi    272
			pushi    166
			pushi    276
			pushi    168
			pushi    279
			pushi    163
			pushi    285
			pushi    163
			pushi    319
			pushi    172
			pushi    319
			pushi    189
			pushi    306
			pushi    189
			pushi    303
			pushi    187
			pushi    293
			pushi    183
			pushi    287
			pushi    182
			pushi    277
			pushi    180
			pushi    272
			pushi    173
			pushi    260
			pushi    173
			pushi    258
			pushi    177
			pushi    249
			pushi    181
			pushi    239
			pushi    181
			pushi    234
			pushi    174
			pushi    227
			pushi    173
			pushi    214
			pushi    163
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     110
			push    
			lag      global2
			send     10
			pushi    6
			lofsa    bluff
			push    
			lofsa    egg
			push    
			lofsa    pub
			push    
			lofsa    castle
			push    
			lofsa    town
			push    
			lofsa    everything
			push    
			calle    proc806_3,  12
			pushi    #setPri
			pushi    1
			pushi    14
			pushi    284
			pushi    2
			pushi    96
			pushi    21
			pushi    107
			pushi    0
			lofsa    alice
			send     18
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0261
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    door
			send     8
			jmp      code_027b
code_0261:
			pushi    #setPri
			pushi    1
			pushi    15
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			lofsa    smokeOne
			send     22
code_027b:
			pushi    #number
			pushi    1
			pushi    905
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_02f2
			pushi    1
			pushi    175
			callb    proc0_5,  2
			not     
			bnt      code_02f2
			pushi    1
			pushi    175
			callb    proc0_6,  2
			pushi    #init
			pushi    0
			lofsa    hal
			send     4
			pushi    #init
			pushi    0
			lofsa    hob
			send     4
			pushi    #init
			pushi    0
			lofsa    dicken
			send     4
			pushi    #view
			pushi    1
			pushi    50
			pushi    284
			pushi    2
			pushi    152
			pushi    153
			pushi    107
			pushi    0
			pushi    412
			pushi    1
			pushi    0
			pushi    516
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    142
			pushi    1
			lofsa    saved
			push    
			lag      global0
			send     42
			jmp      code_03b0
code_02f2:
			pushi    5
			pushi    1
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0303
			ldi      67
			jmp      code_0348
code_0303:
			dup     
			ldi      1
			eq?     
			bnt      code_030f
			ldi      69
			jmp      code_0348
code_030f:
			dup     
			ldi      2
			eq?     
			bnt      code_031b
			ldi      74
			jmp      code_0348
code_031b:
			dup     
			ldi      3
			eq?     
			bnt      code_0327
			ldi      74
			jmp      code_0348
code_0327:
			dup     
			ldi      4
			eq?     
			bnt      code_0333
			ldi      68
			jmp      code_0348
code_0333:
			dup     
			ldi      5
			eq?     
			bnt      code_033f
			ldi      50
			jmp      code_0348
code_033f:
			dup     
			ldi      6
			eq?     
			bnt      code_0348
			ldi      48
code_0348:
			toss    
			push    
			pushi    4
			pushi    1
			lsg      global12
			ldi      530
			eq?     
			bnt      code_035c
			ldi      162
			jmp      code_035f
code_035c:
			ldi      245
code_035f:
			push    
			pushi    3
			pushi    1
			lsg      global12
			ldi      530
			eq?     
			bnt      code_0372
			ldi      155
			jmp      code_0375
code_0372:
			ldi      160
code_0375:
			push    
			pushi    228
			pushi    1
			lsg      global12
			ldi      530
			eq?     
			bnt      code_0388
			ldi      90
			jmp      code_038b
code_0388:
			ldi      270
code_038b:
			push    
			pushi    267
			pushi    1
			lofsa    egoActions
			push    
			pushi    107
			pushi    0
			pushi    412
			pushi    1
			pushi    0
			pushi    516
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lag      global0
			send     52
			pushi    0
			callb    proc0_4,  0
code_03b0:
			pushi    #setStep
			pushi    2
			pushi    2
			pushi    1
			lag      global0
			send     8
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_03f6
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_03f6
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
			jmp      code_045d
code_03f6:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			bnt      code_0428
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0428
			lsg      global130
			ldi      8
			ne?     
			bnt      code_0428
			pushi    #newRoom
			pushi    1
			pushi    530
			lag      global2
			send     6
			jmp      code_045d
code_0428:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			ldi      2
			eq?     
			bt       code_044f
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			ldi      3
			eq?     
code_044f:
			bnt      code_045d
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
code_045d:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance smokeOne of Prop
	(properties
		x 140
		y 126
		view 529
		loop 1
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04c8
			pushi    2
			pushi    1270
			pushi    4
			calle    proc13_4,  4
			jmp      code_04d3
code_04c8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_04d3:
			toss    
			ret     
		)
	)
)

(instance door of View
	(properties
		x 150
		y 152
		view 529
		loop 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_055a
			pushi    2
			pushi    1270
			pushi    3
			calle    proc13_4,  4
			jmp      code_05a4
code_055a:
			dup     
			ldi      10
			eq?     
			bnt      code_0583
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0576
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_05a4
code_0576:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_05a4
code_0583:
			dup     
			ldi      3
			eq?     
			bnt      code_0599
			pushi    #setScript
			pushi    1
			lofsa    tryToEnter
			push    
			lag      global0
			send     6
			jmp      code_05a4
code_0599:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_05a4:
			toss    
			ret     
		)
	)
)

(instance egg of Feature
	(properties
		x 10
		y 10
		nsTop 16
		nsLeft 95
		nsBottom 19
		nsRight 97
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0620
			pushi    2
			pushi    1270
			pushi    5
			calle    proc13_4,  4
			jmp      code_066b
code_0620:
			dup     
			ldi      3
			eq?     
			bnt      code_0637
			pushi    #setScript
			pushi    1
			lofsa    launch
			push    
			lofsa    alice
			send     6
			jmp      code_066b
code_0637:
			dup     
			ldi      10
			eq?     
			bnt      code_0660
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0653
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_066b
code_0653:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_066b
code_0660:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_066b:
			toss    
			ret     
		)
	)
)

(instance bluff of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    118
			pushi    0
			pushi    71
			pushi    12
			pushi    71
			pushi    16
			pushi    68
			pushi    17
			pushi    66
			pushi    18
			pushi    60
			pushi    23
			pushi    62
			pushi    30
			pushi    66
			pushi    33
			pushi    69
			pushi    40
			pushi    66
			pushi    58
			pushi    69
			pushi    76
			pushi    71
			pushi    77
			pushi    69
			pushi    89
			pushi    69
			pushi    91
			pushi    71
			pushi    98
			pushi    69
			pushi    104
			pushi    68
			pushi    113
			pushi    71
			pushi    115
			pushi    71
			pushi    119
			pushi    69
			pushi    130
			pushi    69
			pushi    136
			pushi    66
			pushi    141
			pushi    66
			pushi    145
			pushi    61
			pushi    148
			pushi    64
			pushi    155
			pushi    67
			pushi    166
			pushi    68
			pushi    177
			pushi    66
			pushi    182
			pushi    63
			pushi    189
			pushi    68
			pushi    190
			pushi    73
			pushi    216
			pushi    115
			pushi    237
			pushi    142
			pushi    252
			pushi    151
			pushi    252
			pushi    154
			pushi    250
			pushi    155
			pushi    238
			pushi    156
			pushi    226
			pushi    160
			pushi    213
			pushi    160
			pushi    207
			pushi    156
			pushi    196
			pushi    157
			pushi    192
			pushi    155
			pushi    166
			pushi    154
			pushi    162
			pushi    152
			pushi    166
			pushi    131
			pushi    155
			pushi    122
			pushi    135
			pushi    130
			pushi    140
			pushi    152
			pushi    135
			pushi    155
			pushi    123
			pushi    154
			pushi    108
			pushi    158
			pushi    97
			pushi    160
			pushi    91
			pushi    163
			pushi    98
			pushi    173
			pushi    95
			pushi    175
			pushi    88
			pushi    176
			pushi    67
			pushi    179
			pushi    78
			pushi    184
			pushi    82
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     250
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
			bnt      code_0806
			pushi    2
			pushi    1270
			pushi    1
			calle    proc13_4,  4
			jmp      code_083a
code_0806:
			dup     
			ldi      10
			eq?     
			bnt      code_082f
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0822
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_083a
code_0822:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_083a
code_082f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_083a:
			toss    
			ret     
		)
	)
)

(instance pub of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    135
			pushi    130
			pushi    154
			pushi    122
			pushi    166
			pushi    131
			pushi    161
			pushi    153
			pushi    140
			pushi    153
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
			bnt      code_08e8
			lsg      global130
			ldi      8
			ne?     
			bnt      code_08db
			pushi    2
			pushi    1270
			pushi    2
			calle    proc13_4,  4
			jmp      code_094f
code_08db:
			pushi    2
			pushi    1270
			pushi    3
			calle    proc13_4,  4
			jmp      code_094f
code_08e8:
			dup     
			ldi      3
			eq?     
			bnt      code_091b
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0906
			pushi    #setScript
			pushi    1
			lofsa    tryToEnter
			push    
			lag      global0
			send     6
			jmp      code_094f
code_0906:
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    152
			pushi    153
			lag      global0
			send     10
			jmp      code_094f
code_091b:
			dup     
			ldi      10
			eq?     
			bnt      code_0944
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0937
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_094f
code_0937:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_094f
code_0944:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_094f:
			toss    
			ret     
		)
	)
)

(instance castle of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    80
			pushi    0
			pushi    71
			pushi    0
			pushi    4
			pushi    19
			pushi    4
			pushi    19
			pushi    10
			pushi    30
			pushi    10
			pushi    31
			pushi    10
			pushi    31
			pushi    7
			pushi    66
			pushi    7
			pushi    66
			pushi    11
			pushi    137
			pushi    11
			pushi    137
			pushi    8
			pushi    134
			pushi    7
			pushi    134
			pushi    4
			pushi    184
			pushi    4
			pushi    183
			pushi    9
			pushi    182
			pushi    9
			pushi    182
			pushi    64
			pushi    168
			pushi    67
			pushi    160
			pushi    67
			pushi    154
			pushi    66
			pushi    144
			pushi    61
			pushi    141
			pushi    66
			pushi    134
			pushi    66
			pushi    131
			pushi    69
			pushi    118
			pushi    69
			pushi    114
			pushi    71
			pushi    112
			pushi    71
			pushi    104
			pushi    68
			pushi    100
			pushi    68
			pushi    91
			pushi    71
			pushi    89
			pushi    69
			pushi    75
			pushi    69
			pushi    75
			pushi    71
			dup     
			pushi    70
			pushi    38
			pushi    66
			pushi    32
			pushi    69
			pushi    27
			pushi    64
			pushi    18
			pushi    61
			pushi    17
			pushi    65
			pushi    12
			pushi    71
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     174
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
			bnt      code_0a79
			pushi    2
			pushi    1270
			pushi    5
			calle    proc13_4,  4
			jmp      code_0aad
code_0a79:
			dup     
			ldi      10
			eq?     
			bnt      code_0aa2
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0a95
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_0aad
code_0a95:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_0aad
code_0aa2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0aad:
			toss    
			ret     
		)
	)
)

(instance town of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    319
			pushi    47
			pushi    319
			pushi    142
			pushi    232
			pushi    134
			pushi    219
			pushi    119
			pushi    191
			pushi    75
			pushi    189
			pushi    67
			pushi    182
			pushi    63
			pushi    182
			pushi    47
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
			bnt      code_0b55
			pushi    2
			pushi    1270
			pushi    6
			calle    proc13_4,  4
			jmp      code_0b89
code_0b55:
			dup     
			ldi      10
			eq?     
			bnt      code_0b7e
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0b71
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_0b89
code_0b71:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_0b89
code_0b7e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b89:
			toss    
			ret     
		)
	)
)

(instance everything of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0bff
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0bf2
			pushi    2
			pushi    1270
			pushi    7
			calle    proc13_4,  4
			jmp      code_0c0a
code_0bf2:
			pushi    2
			pushi    1270
			pushi    8
			calle    proc13_4,  4
			jmp      code_0c0a
code_0bff:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0c0a:
			toss    
			ret     
		)
	)
)

(instance alice of Actor
	(properties
		x 96
		y 21
		view 529
		loop 3
		signal $2000
	)
)

(instance hal of Actor
	(properties
		x 199
		y 163
		view 50
	)
)

(instance hob of Actor
	(properties
		x 204
		y 160
		view 50
	)
)

(instance dicken of Actor
	(properties
		x 195
		y 159
		view 50
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      4
			eq?     
			bnt      code_0e99
			lsp      param2
			dup     
			ldi      8
			eq?     
			bnt      code_0e73
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0e98
			ldi      3
			sag      global126
			pushi    2
			pushi    1270
			pushi    12
			calle    proc13_4,  4
			jmp      code_0e98
code_0e73:
			dup     
			ldi      1
			eq?     
			bnt      code_0e87
			pushi    2
			pushi    1270
			pushi    9
			calle    proc13_4,  4
			jmp      code_0e98
code_0e87:
			dup     
			ldi      5
			eq?     
			bnt      code_0e98
			pushi    2
			pushi    1270
			pushi    10
			calle    proc13_4,  4
code_0e98:
			toss    
code_0e99:
			toss    
			ret     
		)
	)
)

(instance tryToEnter of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ede
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    152
			pushi    153
			pushSelf
			lag      global0
			send     12
			jmp      code_0ef4
code_0ede:
			dup     
			ldi      1
			eq?     
			bnt      code_0ef4
			pushi    2
			pushi    1270
			pushi    11
			calle    proc13_4,  4
			pushi    #dispose
			pushi    0
			self     4
code_0ef4:
			toss    
			ret     
		)
	)
)

(instance saved of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f47
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_0fdc
code_0f47:
			dup     
			ldi      1
			eq?     
			bnt      code_0f61
			pushi    4
			lea      @local0
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0fdc
code_0f61:
			dup     
			ldi      2
			eq?     
			bnt      code_0fb7
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    226
			pushi    179
			lofsa    hal
			send     10
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    216
			pushi    169
			lofsa    hob
			send     10
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    206
			pushi    159
			lofsa    dicken
			send     10
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    196
			pushi    149
			pushSelf
			lag      global0
			send     12
			jmp      code_0fdc
code_0fb7:
			dup     
			ldi      3
			eq?     
			bnt      code_0fdc
			pushi    1
			pushi    300
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    250
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0fdc:
			toss    
			ret     
		)
	)
)

(instance launch of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #prevSignal
			pushi    0
			lofsa    launchSound
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_103a
			lal      local4
			not     
			bnt      code_103a
			pushi    #play
			pushi    0
			lofsa    aliceSound
			send     4
			ldi      1
			sal      local4
code_103a:
			pushi    #doit
			pushi    0
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
			bnt      code_106d
			pushi    0
			callb    proc0_3,  0
			pushi    #setPri
			pushi    1
			pushi    14
			pushi    284
			pushi    2
			pushi    96
			pushi    21
			pushi    107
			pushi    0
			lofsa    alice
			send     18
			ldi      2
			aTop     cycles
			jmp      code_111d
code_106d:
			dup     
			ldi      1
			eq?     
			bnt      code_1087
			ldi      0
			sal      local4
			pushi    #play
			pushi    0
			lofsa    launchSound
			send     4
			ldi      2
			aTop     cycles
			jmp      code_111d
code_1087:
			dup     
			ldi      2
			eq?     
			bnt      code_10bc
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    56
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    3
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    164
			pushi    65509
			pushSelf
			lofsa    alice
			send     36
			jmp      code_111d
code_10bc:
			dup     
			ldi      3
			eq?     
			bnt      code_10df
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    260
			pushi    61
			pushSelf
			lofsa    alice
			send     18
			jmp      code_111d
code_10df:
			dup     
			ldi      4
			eq?     
			bnt      code_1105
			pushi    #stop
			pushi    0
			lofsa    aliceSound
			send     4
			pushi    #play
			pushi    0
			lofsa    landSound
			send     4
			pushi    2
			pushi    10
			pushi    1
			callk    ShakeScreen,  4
			ldi      1
			aTop     cycles
			jmp      code_111d
code_1105:
			dup     
			ldi      5
			eq?     
			bnt      code_111d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			lofsa    alice
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_111d:
			toss    
			ret     
		)
	)
)

(instance aliceSound of Sound
	(properties
		flags $0001
		number 360
	)
)

(instance landSound of Sound
	(properties
		flags $0001
		number 361
	)
)

(instance launchSound of Sound
	(properties
		flags $0001
		number 906
	)
)
