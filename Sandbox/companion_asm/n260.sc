;;; Sierra Script 1.0 - (do not remove this comment)
(script# 260)
(include sci.sh)
(use n000)
(use n012)
(use n013)
(use n806)
(use n851)
(use n946)
(use n950)
(use n994)
(use n998)
(use n999)

(public
	rm260 0
)

(local
	local0
	local1
	local2
	local3
	local4
)
(instance rm260 of Rm
	(properties
		picture 260
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			lsg      global87
			dup     
			ldi      0
			eq?     
			bnt      code_0022
			ldi      40
			jmp      code_0037
code_0022:
			dup     
			ldi      1
			eq?     
			bnt      code_002e
			ldi      60
			jmp      code_0037
code_002e:
			dup     
			ldi      2
			eq?     
			bnt      code_0037
			ldi      80
code_0037:
			toss    
			sal      local3
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0077
			pushi    10
			lsg      global12
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  20
			not     
			bnt      code_0077
			lsg      global160
			ldi      1
			ge?     
			bnt      code_0077
			lag      global159
			sag      global151
code_0077:
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      902
			ne?     
			bt       code_0091
			pushi    #vol
			pushi    0
			lag      global100
			send     4
			push    
			ldi      127
			lt?     
code_0091:
			bnt      code_00ab
			pushi    #number
			pushi    1
			pushi    902
			pushi    97
			pushi    1
			pushi    127
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     22
code_00ab:
			lag      global34
			sal      local1
			ldi      0
			sag      global34
			pushi    12
			lofsa    castle
			push    
			lofsa    pub
			push    
			lofsa    shop
			push    
			lofsa    abbey
			push    
			lofsa    fair
			push    
			lofsa    river
			push    
			lofsa    watling
			push    
			lofsa    inField
			push    
			lofsa    inTown
			push    
			lofsa    midTown
			push    
			lofsa    northOfTown
			push    
			lofsa    southOfTown
			push    
			calle    proc806_3,  24
			pushi    #init
			pushi    0
			lofsa    castleFlag
			send     4
			pushi    #init
			pushi    0
			lofsa    pubFlag
			send     4
			pushi    #init
			pushi    0
			lofsa    abbeyFlag
			send     4
			pushi    #init
			pushi    0
			lofsa    lobbFlag
			send     4
			lsg      global130
			ldi      8
			eq?     
			bnt      code_011b
			pushi    #init
			pushi    0
			lofsa    fairFlag
			send     4
code_011b:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    4
			pushi    2
			pushi    3
			pushi    6
			pushi    4
			lag      global69
			send     12
			pushi    5
			lag      global130
			le?     
			bnt      code_01c0
			pprev   
			ldi      6
			le?     
			bnt      code_01c0
			lsg      global142
			ldi      1
			ge?     
			bnt      code_0185
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0185
			pushi    10
			lsg      global12
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  20
			not     
			bnt      code_0185
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ldi      1
			sal      local4
code_0185:
			lsg      global142
			ldi      2
			ge?     
			bnt      code_01c0
			pushi    10
			lsg      global12
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  20
			bnt      code_01c0
			pushi    #newRoom
			pushi    1
			pushi    150
			lag      global2
			send     6
code_01c0:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_01e6
			lsg      global151
			lag      global159
			eq?     
			bnt      code_01e6
			lsg      global156
			lag      global160
			ne?     
			bnt      code_01e6
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ldi      1
			sal      local4
code_01e6:
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #message
			pushi    1
			pushi    11
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			+al      local2
			push    
			lal      local3
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_021a
			pushi    4
			pushi    6
			pushi    245
			pushi    254
			pushi    65535
			callk    Palette,  8
code_021a:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local1
			sag      global34
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    10
			lsg      global12
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  20
			bnt      code_0297
			pushi    10
			lsp      newRoomNumber
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  20
			not     
			bnt      code_0297
			lsg      global130
			ldi      10
			ne?     
			bnt      code_0291
			ldi      0
			sag      global160
code_0291:
			lag      global160
			sag      global156
			+ag      global142
code_0297:
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			super    Rm,  6
			ret     
		)
	)
)

(instance castle of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    23
			pushi    76
			pushi    47
			pushi    75
			pushi    66
			pushi    88
			pushi    68
			pushi    103
			pushi    48
			pushi    109
			pushi    26
			pushi    111
			pushi    14
			pushi    96
			pushi    14
			pushi    85
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_0360
			pushi    #setScript
			pushi    1
			lofsa    castleMessage
			push    
			lag      global2
			send     6
			jmp      code_0397
code_0360:
			dup     
			ldi      11
			eq?     
			bnt      code_038c
			lsg      global126
			ldi      0
			eq?     
			bnt      code_037e
			pushi    3
			pushi    1260
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_0397
code_037e:
			pushi    #newRoom
			pushi    1
			pushi    390
			lag      global2
			send     6
			jmp      code_0397
code_038c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0397:
			toss    
			ret     
		)
	)
)

(instance pub of Feature
	(properties
		lookStr 5
	)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    52
			pushi    109
			pushi    62
			pushi    106
			pushi    64
			pushi    121
			pushi    51
			pushi    121
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			ldi      11
			eq?     
			bnt      code_03fc
			pushi    #newRoom
			pushi    1
			pushi    270
			lag      global2
			send     6
			jmp      code_0407
code_03fc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0407:
			ret     
		)
	)
)

(instance shop of Feature
	(properties
		lookStr 6
	)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    193
			pushi    94
			pushi    235
			pushi    94
			pushi    235
			pushi    109
			pushi    193
			pushi    116
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			ldi      11
			eq?     
			bnt      code_04c5
			lsg      global126
			ldi      0
			eq?     
			bnt      code_04b7
			pushi    3
			pushi    1260
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_04d0
code_04b7:
			pushi    #newRoom
			pushi    1
			pushi    350
			lag      global2
			send     6
			jmp      code_04d0
code_04c5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_04d0:
			ret     
		)
	)
)

(instance abbey of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    209
			pushi    53
			pushi    227
			pushi    53
			pushi    252
			pushi    77
			pushi    252
			pushi    87
			pushi    235
			pushi    89
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_05cb
			pushi    #setScript
			pushi    1
			lofsa    abbeyMessage
			push    
			lag      global2
			send     6
			jmp      code_0602
code_05cb:
			dup     
			ldi      11
			eq?     
			bnt      code_05f7
			lsg      global126
			ldi      0
			eq?     
			bnt      code_05e9
			pushi    3
			pushi    1260
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_0602
code_05e9:
			pushi    #newRoom
			pushi    1
			pushi    440
			lag      global2
			send     6
			jmp      code_0602
code_05f7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0602:
			toss    
			ret     
		)
	)
)

(instance fair of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    76
			pushi    47
			pushi    116
			pushi    47
			pushi    74
			pushi    71
			pushi    60
			pushi    64
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
			push    
			lag      global2
			send     6
			pushi    5
			lsg      global12
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  10
			bnt      code_069c
			lag      global12
			aTop     heading
code_069c:
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
			dup     
			ldi      2
			eq?     
			bnt      code_06e0
			lsg      global130
			ldi      8
			eq?     
			bnt      code_06d1
			pushi    3
			pushi    1260
			pushi    16
			pushi    1
			calle    proc13_4,  6
			jmp      code_072e
code_06d1:
			pushi    #setScript
			pushi    1
			lofsa    fairMessage
			push    
			lag      global2
			send     6
			jmp      code_072e
code_06e0:
			dup     
			ldi      11
			eq?     
			bnt      code_0723
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0714
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0706
			pushi    3
			pushi    1260
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_072e
code_0706:
			pushi    #newRoom
			pushi    1
			pushi    310
			lag      global2
			send     6
			jmp      code_072e
code_0714:
			pushi    3
			pushi    1260
			pushi    17
			pushi    1
			calle    proc13_4,  6
			jmp      code_072e
code_0723:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_072e:
			toss    
			ret     
		)
	)
)

(instance river of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    48
			pushi    0
			pushi    137
			pushi    28
			pushi    153
			pushi    48
			pushi    155
			pushi    86
			pushi    142
			pushi    125
			pushi    144
			pushi    172
			pushi    133
			pushi    201
			pushi    135
			pushi    222
			pushi    131
			pushi    255
			pushi    125
			pushi    273
			pushi    120
			pushi    293
			pushi    114
			pushi    319
			pushi    109
			pushi    319
			pushi    132
			pushi    298
			pushi    135
			pushi    251
			pushi    130
			pushi    218
			pushi    140
			pushi    189
			pushi    139
			pushi    173
			pushi    138
			pushi    130
			pushi    150
			pushi    113
			pushi    150
			pushi    88
			pushi    146
			pushi    50
			pushi    161
			pushi    24
			pushi    160
			pushi    0
			pushi    144
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     110
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_0848
			pushi    3
			pushi    1260
			pushi    19
			pushi    1
			calle    proc13_4,  6
			jmp      code_0869
code_0848:
			dup     
			ldi      11
			eq?     
			bnt      code_085e
			pushi    3
			pushi    1260
			pushi    20
			pushi    1
			calle    proc13_4,  6
			jmp      code_0869
code_085e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0869:
			toss    
			ret     
		)
	)
)

(instance watling of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    298
			pushi    0
			pushi    319
			pushi    65
			pushi    319
			pushi    75
			pushi    307
			pushi    80
			pushi    296
			pushi    77
			pushi    296
			pushi    71
			pushi    310
			pushi    71
			pushi    313
			pushi    65
			pushi    300
			pushi    48
			pushi    276
			pushi    30
			pushi    270
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_0939
			pushi    3
			pushi    1260
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_095e
code_0939:
			dup     
			ldi      11
			eq?     
			bnt      code_0953
			lal      local4
			not     
			bnt      code_095e
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_095e
code_0953:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_095e:
			toss    
			ret     
		)
	)
)

(instance inField of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    81
			pushi    44
			pushi    119
			pushi    45
			pushi    108
			pushi    76
			pushi    91
			pushi    77
			pushi    110
			pushi    103
			pushi    122
			pushi    105
			pushi    101
			pushi    118
			pushi    64
			pushi    119
			pushi    61
			pushi    105
			pushi    71
			pushi    100
			pushi    65
			pushi    87
			pushi    46
			pushi    74
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_0a28
			pushi    3
			pushi    1260
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a60
code_0a28:
			dup     
			ldi      11
			eq?     
			bnt      code_0a55
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0a46
			pushi    3
			pushi    1260
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a60
code_0a46:
			pushi    3
			pushi    1260
			pushi    26
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a60
code_0a55:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a60:
			toss    
			ret     
		)
	)
)

(instance inTown of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    34
			pushi    82
			pushi    43
			pushi    86
			pushi    34
			pushi    114
			pushi    26
			pushi    228
			pushi    24
			pushi    263
			pushi    46
			pushi    277
			pushi    66
			pushi    284
			pushi    91
			pushi    271
			pushi    104
			pushi    244
			pushi    105
			pushi    224
			pushi    115
			pushi    202
			pushi    121
			pushi    178
			pushi    121
			pushi    159
			pushi    109
			pushi    128
			pushi    110
			pushi    99
			pushi    122
			pushi    48
			pushi    122
			pushi    46
			pushi    72
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     82
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_0b49
			pushi    3
			pushi    1260
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b81
code_0b49:
			dup     
			ldi      11
			eq?     
			bnt      code_0b76
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0b67
			pushi    3
			pushi    1260
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b81
code_0b67:
			pushi    3
			pushi    1260
			pushi    24
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b81
code_0b76:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0b81:
			toss    
			ret     
		)
	)
)

(instance midTown of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    52
			pushi    0
			pushi    101
			pushi    13
			pushi    89
			pushi    14
			pushi    97
			pushi    26
			pushi    111
			pushi    49
			pushi    110
			pushi    49
			pushi    123
			pushi    101
			pushi    123
			pushi    128
			pushi    110
			pushi    159
			pushi    110
			pushi    178
			pushi    121
			pushi    202
			pushi    121
			pushi    235
			pushi    110
			pushi    244
			pushi    105
			pushi    271
			pushi    104
			pushi    284
			pushi    91
			pushi    281
			pushi    78
			pushi    319
			pushi    75
			pushi    319
			pushi    108
			pushi    253
			pushi    126
			pushi    202
			pushi    136
			pushi    166
			pushi    134
			pushi    126
			pushi    145
			pushi    86
			pushi    143
			pushi    49
			pushi    155
			pushi    28
			pushi    153
			pushi    0
			pushi    137
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     118
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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
			dup     
			ldi      2
			eq?     
			bnt      code_0c97
			pushi    3
			pushi    1260
			pushi    28
			pushi    1
			calle    proc13_4,  6
			jmp      code_0cbc
code_0c97:
			dup     
			ldi      11
			eq?     
			bnt      code_0cb1
			lal      local4
			not     
			bnt      code_0cbc
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_0cbc
code_0cb1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0cbc:
			toss    
			ret     
		)
	)
)

(instance northOfTown of Feature
	(properties
		nsBottom 95
		nsRight 319
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d22
			pushi    3
			pushi    1260
			pushi    27
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d47
code_0d22:
			dup     
			ldi      11
			eq?     
			bnt      code_0d3c
			lal      local4
			not     
			bnt      code_0d47
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_0d47
code_0d3c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0d47:
			toss    
			ret     
		)
	)
)

(instance southOfTown of Feature
	(properties
		nsTop 95
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0da6
			pushi    3
			pushi    1260
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_0dcb
code_0da6:
			dup     
			ldi      11
			eq?     
			bnt      code_0dc0
			lal      local4
			not     
			bnt      code_0dcb
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_0dcb
code_0dc0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0dcb:
			toss    
			ret     
		)
	)
)

(instance castleFlag of MapButton
	(properties
		x 38
		y 81
		heading 390
		view 260
	)
	
	(method (init)
		(asm
			pushi    #x
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    aPole
			send     4
			send     16
			pushi    #init
			pushi    0
			super    MapButton,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_0e65
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_0ea6
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0e65:
			bnt      code_0ea6
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_0ea6
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0ea6
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0ea6
			pushi    3
			pushi    1260
			pushi    4
			pushi    1
			calle    proc13_4,  6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0eaf
code_0ea6:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    MapButton,  6
code_0eaf:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			lofsa    castle
			send     6
			ret     
		)
	)
)

(instance pubFlag of MapButton
	(properties
		x 58
		y 100
		heading 270
		view 260
		loop 1
	)
	
	(method (init)
		(asm
			pushi    #x
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    aPole
			send     4
			send     16
			pushi    #init
			pushi    0
			super    MapButton,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			lofsa    pub
			send     6
			ret     
		)
	)
)

(instance fairFlag of MapButton
	(properties
		x 81
		y 45
		heading 310
		view 260
		loop 2
	)
	
	(method (init)
		(asm
			pushi    #x
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    aPole
			send     4
			send     16
			pushi    #init
			pushi    0
			super    MapButton,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_1003
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_1044
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_1003:
			bnt      code_1044
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_1044
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_1044
			lsg      global126
			ldi      0
			eq?     
			bnt      code_1044
			pushi    3
			pushi    1260
			pushi    23
			pushi    1
			calle    proc13_4,  6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_104d
code_1044:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    MapButton,  6
code_104d:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			lofsa    fair
			send     6
			ret     
		)
	)
)

(instance abbeyFlag of MapButton
	(properties
		x 243
		y 62
		heading 440
		view 260
		loop 3
	)
	
	(method (init)
		(asm
			pushi    #x
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    aPole
			send     4
			send     16
			pushi    #init
			pushi    0
			super    MapButton,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_110d
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_114e
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_110d:
			bnt      code_114e
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_114e
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_114e
			lsg      global126
			ldi      0
			eq?     
			bnt      code_114e
			pushi    3
			pushi    1260
			pushi    13
			pushi    1
			calle    proc13_4,  6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_1157
code_114e:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    MapButton,  6
code_1157:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			lofsa    abbey
			send     6
			ret     
		)
	)
)

(instance lobbFlag of MapButton
	(properties
		x 199
		y 94
		heading 350
		view 260
		loop 4
	)
	
	(method (init)
		(asm
			pushi    #x
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    aPole
			send     4
			send     16
			pushi    #init
			pushi    0
			super    MapButton,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_1217
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_1258
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_1217:
			bnt      code_1258
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_1258
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_1258
			lsg      global126
			ldi      0
			eq?     
			bnt      code_1258
			pushi    3
			pushi    1260
			pushi    7
			pushi    1
			calle    proc13_4,  6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_1261
code_1258:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    MapButton,  6
code_1261:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			lofsa    shop
			send     6
			ret     
		)
	)
)

(instance aPole of View
	(properties
		view 260
		loop 5
		signal $0001
	)
)

(instance castleMessage of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1344
			pushi    3
			pushi    1260
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_13a6
code_1344:
			dup     
			ldi      1
			eq?     
			bnt      code_136f
			pushi    1
			pushi    2
			callb    proc0_5,  2
			not     
			bnt      code_1367
			pushi    1
			pushi    2
			callb    proc0_6,  2
			pushi    3
			pushi    1260
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_13a6
code_1367:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_13a6
code_136f:
			dup     
			ldi      2
			eq?     
			bnt      code_1384
			pushi    3
			pushi    1260
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_13a6
code_1384:
			dup     
			ldi      3
			eq?     
			bnt      code_139a
			pushi    3
			pushi    1260
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_13a6
code_139a:
			dup     
			ldi      4
			eq?     
			bnt      code_13a6
			pushi    #dispose
			pushi    0
			self     4
code_13a6:
			toss    
			ret     
		)
	)
)

(instance abbeyMessage of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13ff
			pushi    3
			pushi    1260
			pushi    8
			pushSelf
			calle    proc13_4,  6
			jmp      code_1491
code_13ff:
			dup     
			ldi      1
			eq?     
			bnt      code_142a
			pushi    1
			pushi    3
			callb    proc0_5,  2
			not     
			bnt      code_141f
			pushi    3
			pushi    1260
			pushi    9
			pushSelf
			calle    proc13_4,  6
			jmp      code_1491
code_141f:
			ipToa    state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1491
code_142a:
			dup     
			ldi      2
			eq?     
			bnt      code_1440
			pushi    3
			pushi    1260
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_1491
code_1440:
			dup     
			ldi      3
			eq?     
			bnt      code_1456
			pushi    3
			pushi    1260
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_1491
code_1456:
			dup     
			ldi      4
			eq?     
			bnt      code_1485
			pushi    1
			pushi    3
			callb    proc0_5,  2
			not     
			bnt      code_147c
			pushi    1
			pushi    3
			callb    proc0_6,  2
			pushi    3
			pushi    1260
			pushi    12
			pushSelf
			calle    proc13_4,  6
			jmp      code_1491
code_147c:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1491
code_1485:
			dup     
			ldi      5
			eq?     
			bnt      code_1491
			pushi    #dispose
			pushi    0
			self     4
code_1491:
			toss    
			ret     
		)
	)
)

(instance fairMessage of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14eb
			pushi    3
			pushi    1260
			pushi    14
			pushSelf
			calle    proc13_4,  6
			jmp      code_150d
code_14eb:
			dup     
			ldi      1
			eq?     
			bnt      code_1501
			pushi    3
			pushi    1260
			pushi    15
			pushSelf
			calle    proc13_4,  6
			jmp      code_150d
code_1501:
			dup     
			ldi      2
			eq?     
			bnt      code_150d
			pushi    #dispose
			pushi    0
			self     4
code_150d:
			toss    
			ret     
		)
	)
)
