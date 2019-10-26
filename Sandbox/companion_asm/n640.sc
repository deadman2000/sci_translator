;;; Sierra Script 1.0 - (do not remove this comment)
(script# 640)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm640 0
)

(local
	[local0 6] = [9 53 85 238 271 311]
	[local6 7] = [132 114 101 101 117 131]
	local13
	local14
	local15
	local16
	local17
	local18
	local19
	local20
	[local21 14] = [1640 16 2 1 2 1 2 1 2 1 2 1 2]
	[local35 11] = [1640 27 2 1 2 1 2 1 2 2]
	[local46 4] = [1625 1 1]
	[local50 4] = [1625 2 1]
	[local54 4] = [1625 3 1]
	[local58 4] = [1625 4 1]
	[local62 4] = [1625 5 1]
	[local66 4] = [1625 7 1]
	[local70 4] = [1625 6 1]
	[local74 4] = [1640 37 1]
)
(instance rm640 of Rm
	(properties
		picture 640
		picAngle 70
		vanishingX 164
		vanishingY 6
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			lag      global34
			sal      local20
			ldi      0
			sag      global34
			pushi    3
			pushi    128
			pushi    22
			pushi    585
			calle    proc958_0,  6
			pushi    20
			lofsa    bench1
			push    
			lofsa    bench2
			push    
			lofsa    bench3
			push    
			lofsa    bench4
			push    
			lofsa    bench5
			push    
			lofsa    bench6
			push    
			lofsa    bench7
			push    
			lofsa    bench8
			push    
			lofsa    upLeftTable
			push    
			lofsa    upRightTable
			push    
			lofsa    lowLeftTable
			push    
			lofsa    lowRightTable
			push    
			lofsa    floor
			push    
			lofsa    statue
			push    
			lofsa    niche
			push    
			lofsa    upLeftDoor
			push    
			lofsa    lowLeftDoor
			push    
			lofsa    upRightDoor
			push    
			lofsa    lowRightDoor
			push    
			lofsa    everything
			push    
			calle    proc806_3,  40
			ldi      0
			sat      temp0
code_008a:
			lst      temp0
			ldi      6
			lt?     
			bnt      code_00bf
			pushi    4
			pushi    #superClass
			lat      temp0
			lsli     local0
			pushi    3
			pushi    1
			lsli     local6
			pushi    7
			pushi    1
			push    
			ldi      3
			mod     
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    #new
			pushi    0
			lofsa    aTorch
			send     4
			send     28
			+at      temp0
			jmp      code_008a
code_00bf:
			pushi    #addObstacle
			pushi    9
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    260
			pushi    113
			pushi    319
			pushi    113
			pushi    319
			pushi    139
			pushi    286
			pushi    139
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    6
			pushi    297
			pushi    148
			pushi    319
			pushi    148
			pushi    319
			pushi    170
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     26
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    6
			pushi    0
			pushi    150
			pushi    22
			pushi    150
			pushi    0
			pushi    172
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     26
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    0
			pushi    111
			pushi    62
			pushi    111
			pushi    31
			pushi    142
			pushi    0
			pushi    142
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    28
			pushi    0
			pushi    0
			pushi    319
			pushi    65535
			pushi    319
			pushi    101
			pushi    250
			pushi    101
			pushi    235
			pushi    87
			pushi    205
			pushi    87
			pushi    201
			pushi    91
			pushi    190
			pushi    91
			pushi    171
			pushi    90
			pushi    150
			pushi    90
			pushi    131
			pushi    91
			pushi    82
			pushi    91
			pushi    70
			pushi    103
			pushi    0
			pushi    103
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    40
			pushi    138
			pushi    78
			pushi    100
			pushi    155
			pushi    102
			pushi    138
			pushi    140
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    166
			pushi    102
			pushi    247
			pushi    103
			pushi    273
			pushi    137
			pushi    168
			pushi    136
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    150
			pushi    146
			pushi    144
			pushi    186
			pushi    13
			pushi    186
			pushi    43
			pushi    150
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    313
			pushi    186
			pushi    170
			pushi    186
			pushi    166
			pushi    150
			pushi    291
			pushi    150
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     22
			pushi    #posn
			pushi    2
			pushi    1000
			dup     
			pushi    6
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     18
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_3,  0
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_02cc
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    177
			pushi    91
			pushi    56
			pushi    1
			pushi    6
			pushi    219
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     36
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    monkey1
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    monkey2
			send     8
code_02cc:
			pushi    #setScript
			pushi    1
			lofsa    cmonIn
			push    
			self     6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			lsg      global115
			ldi      2
			eq?     
			bnt      code_02f9
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_02f9
			pushi    #setScript
			pushi    1
			lofsa    gotchaRobin
			push    
			lag      global0
			send     6
code_02f9:
			pushi    32766
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			and     
			sat      temp0
			bnt      code_03ad
			pToa     script
			not     
			bnt      code_03ad
			lst      temp0
			ldi      2
			and     
			bnt      code_0325
			pushi    #whichDoor
			pushi    1
			pushi    0
			class    Monastery
			send     6
			jmp      code_039f
code_0325:
			lst      temp0
			ldi      4
			and     
			bnt      code_0339
			pushi    #whichDoor
			pushi    1
			pushi    1
			class    Monastery
			send     6
			jmp      code_039f
code_0339:
			lst      temp0
			ldi      8
			and     
			bnt      code_034d
			pushi    #whichDoor
			pushi    1
			pushi    2
			class    Monastery
			send     6
			jmp      code_039f
code_034d:
			lst      temp0
			ldi      128
			and     
			bnt      code_0363
			pushi    #whichDoor
			pushi    1
			pushi    3
			class    Monastery
			send     6
			jmp      code_039f
code_0363:
			lst      temp0
			ldi      16
			and     
			bnt      code_0378
			pushi    #whichDoor
			pushi    1
			pushi    4
			class    Monastery
			send     6
			jmp      code_039f
code_0378:
			lst      temp0
			ldi      32
			and     
			bnt      code_038d
			pushi    #whichDoor
			pushi    1
			pushi    5
			class    Monastery
			send     6
			jmp      code_039f
code_038d:
			lst      temp0
			ldi      64
			and     
			bnt      code_039f
			pushi    #whichDoor
			pushi    1
			pushi    6
			class    Monastery
			send     6
code_039f:
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
			jmp      code_03b3
code_03ad:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_03b3:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    927
			callk    DisposeScript,  2
			lal      local20
			sag      global34
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance upLeftTable of Feature
	(properties
		x 72
		y 140
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    30
			pushi    72
			pushi    140
			pushi    98
			pushi    141
			pushi    120
			pushi    144
			pushi    112
			pushi    163
			pushi    104
			pushi    166
			pushi    106
			pushi    185
			pushi    93
			pushi    185
			pushi    92
			pushi    180
			pushi    77
			pushi    173
			pushi    64
			pushi    177
			pushi    60
			pushi    183
			pushi    41
			pushi    186
			pushi    49
			pushi    166
			pushi    35
			pushi    164
			pushi    51
			pushi    140
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     74
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0494
			pushi    3
			pushi    1640
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_04b3
code_0494:
			dup     
			ldi      3
			eq?     
			bnt      code_04aa
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_04b3
code_04aa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_04b3:
			toss    
			ret     
		)
	)
)

(instance upRightTable of Feature
	(properties
		x 261
		y 98
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    261
			pushi    137
			pushi    275
			pushi    162
			pushi    263
			pushi    163
			pushi    261
			pushi    182
			pushi    255
			pushi    182
			pushi    240
			pushi    172
			pushi    229
			pushi    173
			pushi    216
			pushi    185
			pushi    200
			pushi    185
			pushi    210
			pushi    164
			pushi    194
			pushi    166
			pushi    186
			pushi    139
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     62
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_058d
			pushi    3
			pushi    1640
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_05ac
code_058d:
			dup     
			ldi      3
			eq?     
			bnt      code_05a3
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_05ac
code_05a3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_05ac:
			toss    
			ret     
		)
	)
)

(instance lowLeftTable of Feature
	(properties
		x 232
		y 92
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    232
			pushi    92
			pushi    246
			pushi    118
			pushi    236
			pushi    120
			pushi    244
			pushi    134
			pushi    192
			pushi    136
			pushi    202
			pushi    123
			pushi    193
			pushi    122
			pushi    180
			pushi    92
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0667
			pushi    3
			pushi    1640
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_0686
code_0667:
			dup     
			ldi      3
			eq?     
			bnt      code_067d
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0686
code_067d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0686:
			toss    
			ret     
		)
	)
)

(instance lowRightTable of Feature
	(properties
		x 134
		y 91
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    134
			pushi    91
			pushi    120
			dup     
			pushi    115
			pushi    124
			dup     
			pushi    134
			pushi    121
			pushi    139
			pushi    72
			pushi    137
			pushi    76
			pushi    123
			pushi    65
			pushi    122
			pushi    87
			pushi    91
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_073d
			pushi    3
			pushi    1640
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_075c
code_073d:
			dup     
			ldi      3
			eq?     
			bnt      code_0753
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_075c
code_0753:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_075c:
			toss    
			ret     
		)
	)
)

(instance bench1 of Feature
	(properties
		x 74
		y 97
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    74
			pushi    97
			pushi    83
			pushi    97
			pushi    65
			pushi    120
			pushi    73
			pushi    121
			pushi    68
			pushi    136
			pushi    53
			pushi    136
			pushi    52
			pushi    122
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_080b
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_082a
code_080b:
			dup     
			ldi      3
			eq?     
			bnt      code_0821
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_082a
code_0821:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_082a:
			toss    
			ret     
		)
	)
)

(instance bench2 of Feature
	(properties
		x 132
		y 135
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    132
			pushi    98
			pushi    142
			pushi    97
			pushi    133
			dup     
			pushi    124
			pushi    135
			pushi    116
			pushi    128
			pushi    115
			pushi    124
			dup     
			pushi    113
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_08da
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_08f9
code_08da:
			dup     
			ldi      3
			eq?     
			bnt      code_08f0
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_08f9
code_08f0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_08f9:
			toss    
			ret     
		)
	)
)

(instance bench3 of Feature
	(properties
		x 173
		y 135
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    173
			pushi    97
			pushi    181
			pushi    95
			pushi    191
			pushi    122
			pushi    200
			pushi    122
			pushi    192
			pushi    135
			pushi    182
			pushi    135
			pushi    184
			pushi    123
			pushi    178
			pushi    122
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_09b5
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_09d4
code_09b5:
			dup     
			ldi      3
			eq?     
			bnt      code_09cb
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_09d4
code_09cb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_09d4:
			toss    
			ret     
		)
	)
)

(instance bench4 of Feature
	(properties
		x 235
		y 136
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    235
			pushi    94
			pushi    248
			pushi    97
			pushi    262
			pushi    124
			pushi    260
			pushi    136
			pushi    249
			pushi    135
			pushi    237
			pushi    121
			pushi    247
			pushi    119
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a8a
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_0aa9
code_0a8a:
			dup     
			ldi      3
			eq?     
			bnt      code_0aa0
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0aa9
code_0aa0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0aa9:
			toss    
			ret     
		)
	)
)

(instance bench5 of Feature
	(properties
		x 42
		y 184
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    42
			pushi    141
			pushi    53
			pushi    140
			pushi    38
			pushi    161
			pushi    45
			pushi    164
			pushi    40
			pushi    184
			pushi    22
			pushi    183
			pushi    20
			pushi    168
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b5e
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b7d
code_0b5e:
			dup     
			ldi      3
			eq?     
			bnt      code_0b74
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b7d
code_0b74:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0b7d:
			toss    
			ret     
		)
	)
)

(instance bench6 of Feature
	(properties
		x 123
		y 184
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    123
			pushi    145
			pushi    138
			pushi    144
			pushi    137
			pushi    157
			pushi    132
			pushi    184
			pushi    115
			pushi    184
			pushi    111
			pushi    165
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c30
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c4f
code_0c30:
			dup     
			ldi      3
			eq?     
			bnt      code_0c46
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c4f
code_0c46:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0c4f:
			toss    
			ret     
		)
	)
)

(instance bench7 of Feature
	(properties
		x 170
		y 184
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    170
			pushi    143
			pushi    186
			pushi    142
			pushi    194
			pushi    166
			pushi    195
			pushi    184
			pushi    175
			pushi    184
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0cff
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d1e
code_0cff:
			dup     
			ldi      3
			eq?     
			bnt      code_0d15
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d1e
code_0d15:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0d1e:
			toss    
			ret     
		)
	)
)

(instance bench8 of Feature
	(properties
		x 267
		y 184
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    267
			pushi    140
			pushi    279
			pushi    142
			pushi    296
			pushi    165
			pushi    295
			pushi    182
			pushi    277
			pushi    182
			pushi    273
			pushi    163
			pushi    277
			pushi    161
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0dd9
			pushi    3
			pushi    1640
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_0df8
code_0dd9:
			dup     
			ldi      3
			eq?     
			bnt      code_0def
			pushi    3
			pushi    1640
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0df8
code_0def:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0df8:
			toss    
			ret     
		)
	)
)

(instance floor of Feature
	(properties
		x 158
		y 84
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    81
			pushi    87
			pushi    238
			pushi    84
			pushi    319
			pushi    164
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    160
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ea6
			pushi    3
			pushi    1640
			pushi    36
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eaf
code_0ea6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0eaf:
			toss    
			ret     
		)
	)
)

(instance statue of Feature
	(properties
		x 163
		y 13
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    34
			pushi    163
			pushi    13
			pushi    169
			pushi    26
			pushi    173
			pushi    29
			pushi    171
			pushi    62
			pushi    169
			pushi    72
			pushi    173
			pushi    75
			pushi    174
			pushi    85
			pushi    162
			pushi    87
			pushi    148
			pushi    86
			pushi    148
			pushi    77
			pushi    152
			pushi    74
			pushi    151
			pushi    52
			pushi    146
			pushi    51
			pushi    149
			pushi    38
			pushi    152
			pushi    30
			pushi    157
			pushi    24
			pushi    157
			pushi    17
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     82
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f24
			pushi    3
			pushi    1640
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f43
code_0f24:
			dup     
			ldi      3
			eq?     
			bnt      code_0f3a
			pushi    3
			pushi    1640
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f43
code_0f3a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0f43:
			toss    
			ret     
		)
	)
)

(instance niche of Feature
	(properties
		x 128
		y 7
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    128
			pushi    86
			pushi    127
			pushi    36
			pushi    132
			pushi    21
			pushi    146
			pushi    9
			pushi    158
			pushi    7
			pushi    170
			pushi    8
			pushi    188
			pushi    17
			pushi    193
			pushi    26
			pushi    193
			pushi    87
			pushi    177
			pushi    78
			pushi    146
			pushi    78
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_107c
			pushi    3
			pushi    1640
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_1085
code_107c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1085:
			ret     
		)
	)
)

(instance upLeftDoor of Feature
	(properties
		x 49
		y 30
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    49
			pushi    117
			pushi    48
			pushi    46
			pushi    50
			pushi    33
			pushi    54
			pushi    30
			pushi    62
			pushi    33
			pushi    65
			pushi    91
			pushi    69
			pushi    99
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1130
			pushi    3
			pushi    1640
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_1139
code_1130:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1139:
			ret     
		)
	)
)

(instance lowLeftDoor of Feature
	(properties
		x 10
		y 40
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    10
			pushi    154
			pushi    6
			pushi    140
			pushi    5
			pushi    47
			pushi    10
			pushi    40
			pushi    17
			pushi    40
			pushi    23
			pushi    46
			pushi    25
			pushi    138
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_11e7
			pushi    3
			pushi    1640
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_11f0
code_11e7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_11f0:
			ret     
		)
	)
)

(instance upRightDoor of Feature
	(properties
		x 253
		y 33
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    253
			pushi    97
			pushi    256
			pushi    40
			pushi    259
			pushi    33
			pushi    266
			pushi    33
			pushi    271
			pushi    37
			pushi    273
			pushi    51
			pushi    274
			pushi    119
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_12a3
			pushi    3
			pushi    1640
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_12ac
code_12a3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_12ac:
			ret     
		)
	)
)

(instance lowRightDoor of Feature
	(properties
		x 293
		y 46
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    293
			pushi    136
			pushi    298
			pushi    51
			pushi    300
			pushi    46
			pushi    307
			pushi    46
			pushi    314
			pushi    61
			pushi    312
			pushi    155
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
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_135c
			pushi    3
			pushi    1640
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_1365
code_135c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1365:
			ret     
		)
	)
)

(instance everything of Feature
	(properties
		x 160
		nsBottom 189
		nsRight 319
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_13d7
			pushi    3
			pushi    1640
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_13e0
code_13d7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_13e0:
			ret     
		)
	)
)

(instance aTorch of Prop
	(properties
		z 70
		view 640
		signal $4000
		cycleSpeed 12
		detailLevel 2
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_143d
			pushi    3
			pushi    1640
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_145b
code_143d:
			dup     
			ldi      3
			eq?     
			bnt      code_1452
			pushi    3
			pushi    1640
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_145b
code_1452:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_145b:
			toss    
			ret     
		)
	)
)

(instance monkey1 of Actor
	(properties
		x 215
		y 100
		view 16
		loop 1
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lofsa    monkey1
			sal      local15
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_14e8
			pushi    3
			pushi    1625
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_15bd
code_14e8:
			dup     
			ldi      5
			eq?     
			bnt      code_1502
			pushi    4
			lea      @local46
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_15bd
code_1502:
			dup     
			ldi      3
			eq?     
			bnt      code_151c
			pushi    4
			lea      @local50
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_15bd
code_151c:
			dup     
			ldi      4
			eq?     
			bnt      code_15b2
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1549
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_15ae
			pushi    #setScript
			pushi    1
			lofsa    buckMonkeys
			push    
			lag      global0
			send     6
			jmp      code_15ae
code_1549:
			dup     
			ldi      2
			eq?     
			bnt      code_1563
			ldi      1
			sal      local16
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
			jmp      code_15ae
code_1563:
			dup     
			ldi      14
			eq?     
			bnt      code_157d
			ldi      1
			sal      local17
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
			jmp      code_15ae
code_157d:
			dup     
			ldi      17
			eq?     
			bnt      code_1597
			ldi      1
			sal      local18
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
			jmp      code_15ae
code_1597:
			dup     
			ldi      16
			eq?     
			bnt      code_15ae
			ldi      1
			sal      local19
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
code_15ae:
			toss    
			jmp      code_15bd
code_15b2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_15bd:
			toss    
			ret     
		)
	)
)

(instance monkey2 of Actor
	(properties
		x 198
		y 105
		view 16
		loop 7
		cel 3
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lofsa    monkey2
			sal      local15
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1662
			pushi    3
			pushi    1625
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_1737
code_1662:
			dup     
			ldi      5
			eq?     
			bnt      code_167c
			pushi    4
			lea      @local46
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1737
code_167c:
			dup     
			ldi      3
			eq?     
			bnt      code_1696
			pushi    4
			lea      @local50
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1737
code_1696:
			dup     
			ldi      4
			eq?     
			bnt      code_172c
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_16c3
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_1728
			pushi    #setScript
			pushi    1
			lofsa    buckMonkeys
			push    
			lag      global0
			send     6
			jmp      code_1728
code_16c3:
			dup     
			ldi      2
			eq?     
			bnt      code_16dd
			ldi      1
			sal      local16
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
			jmp      code_1728
code_16dd:
			dup     
			ldi      14
			eq?     
			bnt      code_16f7
			ldi      1
			sal      local17
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
			jmp      code_1728
code_16f7:
			dup     
			ldi      17
			eq?     
			bnt      code_1711
			ldi      1
			sal      local18
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
			jmp      code_1728
code_1711:
			dup     
			ldi      16
			eq?     
			bnt      code_1728
			ldi      1
			sal      local19
			pushi    #setScript
			pushi    1
			lofsa    takeAndRun
			push    
			lag      global0
			send     6
code_1728:
			toss    
			jmp      code_1737
code_172c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_1737:
			toss    
			ret     
		)
	)
)

(instance cmonIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18f2
			pushi    0
			callb    proc0_3,  0
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17fc
			pushi    #posn
			pushi    2
			pushi    43
			pushi    106
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    67
			pushi    104
			pushSelf
			lag      global0
			send     20
			jmp      code_18ee
code_17fc:
			dup     
			ldi      1
			eq?     
			bnt      code_1821
			pushi    #posn
			pushi    2
			pushi    20
			pushi    145
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    48
			pushi    143
			pushSelf
			lag      global0
			send     20
			jmp      code_18ee
code_1821:
			dup     
			ldi      2
			eq?     
			bnt      code_1845
			pushi    #posn
			pushi    2
			pushi    2
			pushi    189
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    29
			pushi    171
			pushSelf
			lag      global0
			send     20
			jmp      code_18ee
code_1845:
			dup     
			ldi      3
			eq?     
			bnt      code_1871
			pushi    #posn
			pushi    2
			pushi    155
			pushi    230
			pushi    6
			pushi    1
			pushi    3
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    128
			pushi    184
			pushSelf
			lag      global0
			send     26
			jmp      code_18ee
code_1871:
			dup     
			ldi      4
			eq?     
			bnt      code_189c
			pushi    #posn
			pushi    2
			pushi    283
			pushi    189
			pushi    6
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    295
			pushi    188
			pushSelf
			lag      global0
			send     26
			jmp      code_18ee
code_189c:
			dup     
			ldi      5
			eq?     
			bnt      code_18c7
			pushi    #posn
			pushi    2
			pushi    283
			pushi    137
			pushi    6
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    259
			pushi    138
			pushSelf
			lag      global0
			send     26
			jmp      code_18ee
code_18c7:
			dup     
			ldi      6
			eq?     
			bnt      code_18ee
			pushi    #posn
			pushi    2
			pushi    283
			pushi    106
			pushi    6
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    265
			pushi    137
			pushSelf
			lag      global0
			send     26
code_18ee:
			toss    
			jmp      code_19b0
code_18f2:
			dup     
			ldi      1
			eq?     
			bnt      code_1944
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      6
			eq?     
			bt       code_1923
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      5
			eq?     
			bt       code_1923
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      4
			eq?     
code_1923:
			bnt      code_193b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    123
			pushi    137
			pushSelf
			lag      global0
			send     12
			jmp      code_19b0
code_193b:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_19b0
code_1944:
			dup     
			ldi      2
			eq?     
			bnt      code_195f
			pushi    3
			lsg      global0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_19b0
code_195f:
			dup     
			ldi      3
			eq?     
			bnt      code_19b0
			pushi    #south
			pushi    1
			pushi    630
			pushi    389
			pushi    1
			pushi    630
			pushi    391
			pushi    1
			pushi    630
			lag      global2
			send     18
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_199d
			pushi    #setScript
			pushi    1
			lofsa    meetThePrior
			push    
			pToa     client
			send     6
			jmp      code_19b0
code_199d:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_19b0:
			toss    
			ret     
		)
	)
)

(instance meetThePrior of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a03
			pushi    0
			callb    proc0_3,  0
			ldi      15
			aTop     ticks
			jmp      code_1b18
code_1a03:
			dup     
			ldi      1
			eq?     
			bnt      code_1a2f
			pushi    2
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			push    
			callb    proc0_9,  4
			ldi      60
			aTop     ticks
			jmp      code_1b18
code_1a2f:
			dup     
			ldi      2
			eq?     
			bnt      code_1a3d
			ldi      60
			aTop     ticks
			jmp      code_1b18
code_1a3d:
			dup     
			ldi      3
			eq?     
			bnt      code_1a5f
			pushi    4
			lea      @local21
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1b18
code_1a5f:
			dup     
			ldi      4
			eq?     
			bnt      code_1ab7
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_1aae
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bt       code_1a90
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			lag      global9
			send     6
			send     4
			push    
			ldi      140
			eq?     
code_1a90:
			bnt      code_1aae
			pushi    4
			lea      @local35
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1b18
code_1aae:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1b18
code_1ab7:
			dup     
			ldi      5
			eq?     
			bnt      code_1ae8
			pushi    #setStep
			pushi    2
			pushi    4
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    155
			pushi    230
			pushSelf
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     26
			jmp      code_1b18
code_1ae8:
			dup     
			ldi      6
			eq?     
			bnt      code_1b18
			pushi    #wherePrior
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1b18:
			toss    
			ret     
		)
	)
)

(instance takeAndRun of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b79
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    162
			pushi    95
			pushSelf
			lag      global0
			send     12
			jmp      code_1cdf
code_1b79:
			dup     
			ldi      1
			eq?     
			bnt      code_1b91
			pushi    #setHeading
			pushi    1
			pushi    90
			lag      global0
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1cdf
code_1b91:
			dup     
			ldi      2
			eq?     
			bnt      code_1c5f
			lsl      local16
			ldi      1
			eq?     
			bnt      code_1bcc
			pushi    4
			lea      @local58
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    2
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65336
			calle    proc806_1,  2
			ldi      0
			sal      local16
			jmp      code_1cdf
code_1bcc:
			lsl      local17
			ldi      1
			eq?     
			bnt      code_1c00
			pushi    4
			lea      @local62
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    14
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65486
			calle    proc806_1,  2
			ldi      0
			sal      local17
			jmp      code_1cdf
code_1c00:
			lsl      local18
			ldi      1
			eq?     
			bnt      code_1c2b
			pushi    4
			lea      @local70
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    17
			pushi    65535
			lag      global0
			send     8
			ldi      0
			sal      local18
			jmp      code_1cdf
code_1c2b:
			lsl      local19
			ldi      1
			eq?     
			bnt      code_1c56
			pushi    4
			lea      @local66
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    16
			pushi    65535
			lag      global0
			send     8
			ldi      0
			sal      local19
			jmp      code_1cdf
code_1c56:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1cdf
code_1c5f:
			dup     
			ldi      3
			eq?     
			bnt      code_1ca9
			lsl      local15
			lofsa    monkey1
			eq?     
			bnt      code_1c8c
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    310
			pushi    110
			pushSelf
			lofsa    monkey1
			send     18
			jmp      code_1cdf
code_1c8c:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    310
			pushi    110
			pushSelf
			lofsa    monkey2
			send     18
			jmp      code_1cdf
code_1ca9:
			dup     
			ldi      4
			eq?     
			bnt      code_1cdf
			lsl      local15
			lofsa    monkey1
			eq?     
			bnt      code_1cc4
			pushi    #dispose
			pushi    0
			lofsa    monkey1
			send     4
			jmp      code_1ccc
code_1cc4:
			pushi    #dispose
			pushi    0
			lofsa    monkey2
			send     4
code_1ccc:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1cdf:
			toss    
			ret     
		)
	)
)

(instance gotchaRobin of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d37
			pushi    0
			callb    proc0_3,  0
			ldi      20
			sag      global145
			ldi      1
			aTop     cycles
			jmp      code_1e56
code_1d37:
			dup     
			ldi      1
			eq?     
			bnt      code_1d54
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    152
			pushi    135
			pushSelf
			lag      global0
			send     12
			jmp      code_1e56
code_1d54:
			dup     
			ldi      2
			eq?     
			bnt      code_1da0
			pushi    #view
			pushi    1
			pushi    16
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    12
			pushi    3
			pushi    1
			pushi    146
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    152
			pushi    155
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local13
			send     52
			jmp      code_1e56
code_1da0:
			dup     
			ldi      3
			eq?     
			bnt      code_1db4
			pushi    3
			lsg      global0
			lsl      local13
			pushSelf
			callb    proc0_9,  6
			jmp      code_1e56
code_1db4:
			dup     
			ldi      4
			eq?     
			bnt      code_1dc8
			pushi    3
			lsl      local13
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1e56
code_1dc8:
			dup     
			ldi      5
			eq?     
			bnt      code_1dd6
			ldi      10
			aTop     cycles
			jmp      code_1e56
code_1dd6:
			dup     
			ldi      6
			eq?     
			bnt      code_1df0
			pushi    4
			lea      @local74
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1e56
code_1df0:
			dup     
			ldi      7
			eq?     
			bnt      code_1e17
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
			pushi    2
			class    End
			push    
			pushSelf
			lal      local13
			send     26
			jmp      code_1e56
code_1e17:
			dup     
			ldi      8
			eq?     
			bnt      code_1e44
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
			jmp      code_1e56
code_1e44:
			dup     
			ldi      9
			eq?     
			bnt      code_1e56
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_1e56:
			toss    
			ret     
		)
	)
)

(instance buckMonkeys of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1eb5
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local54
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1ecf
code_1eb5:
			dup     
			ldi      1
			eq?     
			bnt      code_1ecf
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1ecf:
			toss    
			ret     
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
