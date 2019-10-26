;;; Sierra Script 1.0 - (do not remove this comment)
(script# 350)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n945)
(use n946)
(use n949)
(use n950)
(use n951)
(use n970)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm350 0
)

(local
	[local0 4] = [1350 1 1]
	[local4 4] = [1350 41 1]
	[local8 4] = [1350 29 1]
	local12
	local13
	local14
	local15
	[local16 9] = [-1 11286 6]
	[local25 7] = [1350 45 2 1 1 2]
)
(instance rm350 of Rm
	(properties
		picture 350
		style $0064
		horizon 110
		north 260
		south 260
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    2
			pushi    130
			pushi    939
			callk    Load,  4
			pushi    2
			pushi    128
			pushi    182
			callk    Load,  4
			lsg      global130
			ldi      3
			eq?     
			bnt      code_006c
			pushi    #add
			pushi    2
			lofsa    tailorWoman
			push    
			lofsa    day9Door
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    116
			pushi    3
			pushi    281
			pushi    3
			pushi    4
			pushi    60
			pushi    0
			lag      global10
			send     28
			pushi    #add
			pushi    2
			lofsa    lobbsCover
			push    
			lofsa    tailorCover
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     18
			jmp      code_0201
code_006c:
			pushi    5
			lag      global130
			le?     
			bnt      code_00c5
			pprev   
			ldi      7
			le?     
			bnt      code_00c5
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    lobbsCover
			send     6
			pushi    #add
			pushi    3
			lofsa    tailorWoman
			push    
			lofsa    lobbsDoor
			push    
			lofsa    day9Door
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    116
			pushi    3
			pushi    281
			pushi    3
			pushi    4
			pushi    60
			pushi    0
			lag      global10
			send     30
			pushi    #add
			pushi    2
			lofsa    tailorCover
			push    
			lofsa    lobbsCover
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     18
			jmp      code_0201
code_00c5:
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0127
			pushi    #cel
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    94
			pushi    3
			pushi    1
			pushi    78
			lofsa    tailorCover
			send     18
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    lobbsCover
			send     6
			pushi    #add
			pushi    3
			lofsa    tailorDoor
			push    
			lofsa    lobbsDoor
			push    
			lofsa    day9Door
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    116
			pushi    2
			pushi    281
			pushi    3
			pushi    60
			pushi    0
			lag      global10
			send     28
			pushi    #add
			pushi    2
			lofsa    tailorCover
			push    
			lofsa    lobbsCover
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     18
			jmp      code_0201
code_0127:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_01aa
			lsg      global126
			ldi      4
			eq?     
			not     
			bnt      code_01aa
			pushi    #loop
			pushi    1
			pushi    3
			pushi    4
			pushi    1
			pushi    96
			pushi    3
			pushi    1
			pushi    78
			lofsa    tailorCover
			send     18
			pushi    #init
			pushi    0
			pushi    17
			pushi    1
			pushi    1
			lofsa    swineMan
			send     10
			pushi    #init
			pushi    0
			lofsa    pig1
			send     4
			pushi    #init
			pushi    0
			lofsa    pig2
			send     4
			pushi    #setScript
			pushi    1
			lofsa    pigScript
			push    
			lofsa    pig2
			send     6
			pushi    #add
			pushi    1
			lofsa    tailorDoor
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    116
			pushi    2
			pushi    281
			pushi    3
			pushi    60
			pushi    0
			lag      global10
			send     24
			pushi    #add
			pushi    2
			lofsa    tailorCover
			push    
			lofsa    lobbsCover
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     18
			jmp      code_0201
code_01aa:
			pushi    #cel
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    96
			pushi    3
			pushi    1
			pushi    78
			lofsa    tailorCover
			send     18
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    lobbsCover
			send     6
			pushi    #add
			pushi    3
			lofsa    day9Door
			push    
			lofsa    lobbsDoor
			push    
			lofsa    tailorDoor
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    116
			pushi    2
			pushi    281
			pushi    3
			pushi    60
			pushi    0
			lag      global10
			send     28
			pushi    #add
			pushi    2
			lofsa    tailorCover
			push    
			lofsa    lobbsCover
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     18
code_0201:
			pushi    6
			lofsa    bucket
			push    
			lofsa    leftHut
			push    
			lofsa    middleHut
			push    
			lofsa    rightHut
			push    
			lofsa    tailorHut
			push    
			lofsa    lobbsHut
			push    
			calle    proc806_3,  12
			pushi    #init
			pushi    0
			lofsa    chicken
			send     4
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    catChickenScript
			push    
			lofsa    cat
			send     10
			lsg      global130
			ldi      9
			eq?     
			bnt      code_02e3
			lsg      global126
			ldi      4
			eq?     
			not     
			bnt      code_02e3
			pushi    #init
			pushi    0
			lofsa    flyCage
			send     4
			pushi    #x
			pushi    1
			pushi    120
			pushi    3
			pushi    1
			pushi    130
			pushi    308
			pushi    2
			pushi    10
			pushi    8
			pushi    107
			pushi    0
			pushi    303
			pushi    1
			lofsa    flyCage
			push    
			pushi    283
			pushi    2
			class    Wander
			push    
			pushi    10
			lofsa    fly
			send     38
			pushi    #x
			pushi    1
			pushi    125
			pushi    3
			pushi    1
			pushi    130
			pushi    308
			pushi    2
			pushi    10
			pushi    8
			pushi    107
			pushi    0
			pushi    303
			pushi    1
			lofsa    flyCage
			push    
			pushi    283
			pushi    2
			class    Wander
			push    
			pushi    10
			lofsa    fly2
			send     38
			pushi    2
			pushi    1
			pushi    9
			callk    Random,  4
			push    
			ldi      4
			eq?     
			bnt      code_02e3
			pushi    1
			pushi    209
			callb    proc0_5,  2
			not     
			bnt      code_02e3
			lsg      global126
			ldi      4
			eq?     
			not     
			bnt      code_02e3
			pushi    1
			pushi    209
			callb    proc0_6,  2
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    getBuggy
			push    
			lofsa    bigOlFly
			send     10
code_02e3:
			pushi    0
			callb    proc0_2,  0
			lsg      global12
			ldi      360
			eq?     
			bnt      code_0321
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_0321
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0321
			pushi    #posn
			pushi    2
			pushi    251
			pushi    145
			pushi    6
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			lag      global0
			send     18
			jmp      code_0332
code_0321:
			pushi    #posn
			pushi    2
			pushi    160
			pushi    180
			pushi    107
			pushi    0
			lag      global0
			send     12
code_0332:
			pushi    #setScript
			pushi    1
			lofsa    comeIn
			push    
			lag      global0
			send     6
			pushi    4
			lsg      global130
			pushi    5
			pushi    6
			pushi    7
			calle    proc999_5,  8
			bt       code_035e
			lsg      global130
			ldi      8
			eq?     
			bt       code_035e
			lsg      global130
			ldi      4
			eq?     
code_035e:
			bnt      code_0416
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    197
			pushi    89
			pushi    194
			pushi    114
			pushi    188
			pushi    116
			pushi    147
			pushi    129
			pushi    84
			pushi    154
			pushi    78
			pushi    162
			pushi    66
			pushi    173
			pushi    51
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    58
			pushi    177
			pushi    21
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    26
			pushi    319
			pushi    142
			pushi    319
			pushi    189
			pushi    285
			pushi    189
			pushi    285
			pushi    177
			pushi    286
			pushi    168
			pushi    274
			pushi    165
			pushi    254
			pushi    145
			pushi    231
			pushi    142
			pushi    215
			pushi    144
			pushi    197
			pushi    135
			pushi    187
			pushi    121
			pushi    197
			pushi    118
			pushi    202
			pushi    80
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     66
			push    
			lag      global2
			send     8
			jmp      code_0562
code_0416:
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    14
			pushi    284
			pushi    189
			pushi    287
			pushi    187
			pushi    288
			pushi    177
			pushi    274
			pushi    166
			pushi    274
			pushi    140
			pushi    319
			pushi    142
			pushi    319
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    262
			pushi    146
			pushi    235
			pushi    147
			pushi    220
			pushi    147
			pushi    197
			pushi    135
			pushi    187
			pushi    121
			pushi    196
			pushi    118
			pushi    200
			pushi    97
			pushi    202
			pushi    16
			pushi    319
			pushi    73
			pushi    319
			pushi    95
			pushi    262
			pushi    116
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			lag      global2
			send     8
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0510
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    24
			pushi    197
			pushi    89
			pushi    194
			pushi    114
			pushi    188
			pushi    116
			pushi    147
			pushi    129
			pushi    151
			pushi    146
			pushi    84
			pushi    154
			pushi    77
			pushi    155
			pushi    64
			pushi    170
			pushi    51
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    58
			pushi    177
			pushi    21
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			push    
			lag      global2
			send     6
			jmp      code_0562
code_0510:
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    197
			pushi    89
			pushi    194
			pushi    114
			pushi    188
			pushi    116
			pushi    147
			pushi    129
			pushi    84
			pushi    154
			pushi    77
			pushi    155
			pushi    64
			pushi    170
			pushi    51
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    58
			pushi    177
			pushi    21
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			lag      global2
			send     6
code_0562:
			pushi    #contains
			pushi    1
			lofsa    lobbsDoor
			push    
			lag      global10
			send     6
			bnt      code_057a
			pushi    #observeControl
			pushi    1
			pushi    4
			lag      global0
			send     6
code_057a:
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #script
			pushi    0
			lofsa    pig1
			send     4
			not     
			bnt      code_0595
			pushi    #setScript
			pushi    1
			lofsa    pigCycle
			push    
			lofsa    pig1
			send     6
code_0595:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_05a5
			ldi      0
			jmp      code_0608
code_05a5:
			lsg      global130
			ldi      3
			eq?     
			bnt      code_05d4
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_05d4
			lsg      global126
			ldi      1
			eq?     
			bnt      code_05d4
			pushi    #setScript
			pushi    1
			lofsa    enterShop
			push    
			lag      global0
			send     6
			jmp      code_0608
code_05d4:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0608
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_0608
			lsg      global126
			ldi      2
			eq?     
			bt       code_05f9
			lsg      global126
			ldi      3
			eq?     
code_05f9:
			bnt      code_0608
			pushi    #setScript
			pushi    1
			lofsa    enterShop
			push    
			lag      global0
			send     6
code_0608:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #script
			pushi    0
			lofsa    pig1
			send     4
			bnt      code_0627
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    pig1
			send     6
code_0627:
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    fly
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    fly2
			send     6
			pushi    #dispose
			pushi    0
			lofsa    flyCage
			send     4
			pushi    1
			pushi    949
			callk    DisposeScript,  2
			pushi    1
			pushi    970
			callk    DisposeScript,  2
			pushi    1
			pushi    939
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance lobbsHut of Feature
	(properties
		x 316
		y 28
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    316
			pushi    28
			pushi    316
			pushi    41
			pushi    293
			pushi    44
			pushi    283
			pushi    104
			pushi    297
			pushi    108
			pushi    295
			pushi    153
			pushi    252
			pushi    139
			pushi    230
			pushi    118
			pushi    206
			pushi    121
			pushi    205
			pushi    61
			pushi    200
			pushi    56
			pushi    240
			pushi    22
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06fc
			lsg      global130
			ldi      3
			eq?     
			bt       code_06c4
			lsg      global130
			ldi      9
			eq?     
code_06c4:
			bnt      code_06ed
			lsg      global126
			ldi      4
			eq?     
			bnt      code_06de
			pushi    3
			pushi    1350
			pushi    56
			pushi    1
			calle    proc13_4,  6
			jmp      code_0733
code_06de:
			pushi    3
			pushi    1350
			pushi    62
			pushi    1
			calle    proc13_4,  6
			jmp      code_0733
code_06ed:
			pushi    3
			pushi    1350
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_0733
code_06fc:
			dup     
			ldi      3
			eq?     
			bnt      code_0728
			lsg      global126
			ldi      4
			eq?     
			bnt      code_071a
			pushi    3
			pushi    1350
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0733
code_071a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
			jmp      code_0733
code_0728:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0733:
			toss    
			ret     
		)
	)
)

(instance tailorHut of Feature
	(properties
		x 83
		y 24
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    2
			pushi    29
			pushi    83
			pushi    24
			pushi    134
			pushi    62
			pushi    130
			pushi    132
			pushi    64
			pushi    153
			pushi    64
			pushi    89
			pushi    1
			pushi    46
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
			bnt      code_0825
			pushi    5
			lsg      global130
			pushi    3
			pushi    5
			pushi    6
			pushi    7
			calle    proc999_5,  10
			bnt      code_0816
			pushi    3
			pushi    1350
			pushi    63
			pushi    1
			calle    proc13_4,  6
			jmp      code_0830
code_0816:
			pushi    3
			pushi    1350
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_0830
code_0825:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0830:
			ret     
		)
	)
)

(instance leftHut of Feature
	(properties
		x 61
		y 50
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    1
			pushi    50
			pushi    61
			pushi    90
			pushi    57
			pushi    171
			pushi    36
			pushi    188
			pushi    1
			pushi    188
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
			bnt      code_08dd
			pushi    3
			pushi    1350
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_08e8
code_08dd:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_08e8:
			ret     
		)
	)
)

(instance middleHut of Feature
	(properties
		x 84
		y 16
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    84
			pushi    21
			pushi    0
			pushi    26
			pushi    0
			pushi    16
			pushi    231
			pushi    22
			pushi    204
			pushi    48
			pushi    194
			pushi    40
			pushi    181
			pushi    112
			pushi    135
			pushi    129
			pushi    136
			pushi    56
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_098d
			pushi    3
			pushi    1350
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_0998
code_098d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0998:
			ret     
		)
	)
)

(instance rightHut of Feature
	(properties
		x 314
		y 46
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    314
			pushi    188
			pushi    297
			pushi    188
			pushi    307
			pushi    106
			pushi    287
			pushi    101
			pushi    297
			pushi    46
			pushi    317
			pushi    46
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
			bnt      code_0a51
			pushi    3
			pushi    1350
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a5c
code_0a51:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a5c:
			ret     
		)
	)
)

(instance bucket of Feature
	(properties
		x 223
		y 129
		nsTop 124
		nsLeft 218
		nsBottom 134
		nsRight 229
		lookStr 11
	)
)

(instance day9Door of PicView
	(properties
		x 146
		y 122
		approachX 152
		approachY 130
		lookStr 33
		view 350
		loop 2
		priority 8
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b48
			pushi    3
			pushi    1350
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b7f
code_0b48:
			dup     
			ldi      3
			eq?     
			bnt      code_0b74
			lsg      global130
			ldi      9
			ne?     
			bnt      code_0b66
			pushi    3
			pushi    1350
			pushi    61
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b7f
code_0b66:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
			jmp      code_0b7f
code_0b74:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_0b7f:
			toss    
			ret     
		)
	)
)

(instance tailorDoor of PicView
	(properties
		x 81
		y 84
		approachX 84
		approachY 175
		view 350
		loop 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c0e
			pushi    5
			lsg      global130
			pushi    3
			pushi    5
			pushi    6
			pushi    7
			calle    proc999_5,  10
			bnt      code_0bff
			pushi    3
			pushi    1350
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c70
code_0bff:
			pushi    3
			pushi    1350
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c70
code_0c0e:
			dup     
			ldi      3
			eq?     
			bnt      code_0c65
			lsg      global130
			ldi      9
			eq?     
			bt       code_0c22
			lsg      global130
			ldi      8
			eq?     
code_0c22:
			bnt      code_0c57
			lsg      global126
			ldi      3
			eq?     
			bt       code_0c3a
			lsg      global126
			ldi      2
			eq?     
			bt       code_0c3a
			lsg      global126
			ldi      4
			eq?     
code_0c3a:
			bnt      code_0c57
			pushi    #setHeading
			pushi    1
			pushi    270
			lag      global0
			send     6
			pushi    3
			pushi    1350
			pushi    36
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c70
code_0c57:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    PicView,  6
			jmp      code_0c70
code_0c65:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    PicView,  6
code_0c70:
			toss    
			ret     
		)
	)
)

(instance lobbsDoor of PicView
	(properties
		x 281
		y 152
		approachX 250
		approachY 157
		view 350
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d10
			lsg      global130
			ldi      3
			eq?     
			bt       code_0cd8
			lsg      global130
			ldi      9
			eq?     
code_0cd8:
			bnt      code_0d01
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0cf2
			pushi    3
			pushi    1350
			pushi    56
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d90
code_0cf2:
			pushi    3
			pushi    1350
			pushi    62
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d90
code_0d01:
			pushi    3
			pushi    1350
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d90
code_0d10:
			dup     
			ldi      3
			eq?     
			bnt      code_0d85
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0d2e
			pushi    3
			pushi    1350
			pushi    38
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d90
code_0d2e:
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0d45
			pushi    3
			pushi    1350
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d90
code_0d45:
			pushi    4
			lsg      global130
			pushi    5
			pushi    6
			pushi    7
			calle    proc999_5,  8
			bnt      code_0d77
			lsg      global126
			ldi      5
			eq?     
			bt       code_0d65
			lsg      global126
			ldi      6
			eq?     
code_0d65:
			bnt      code_0d77
			pushi    #setScript
			pushi    1
			lofsa    knockLobb
			push    
			lag      global0
			send     6
			jmp      code_0d90
code_0d77:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
			jmp      code_0d90
code_0d85:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_0d90:
			toss    
			ret     
		)
	)
)

(instance lobbsCover of PicView
	(properties
		x 242
		y 70
		view 350
		loop 1
		cel 1
		priority 10
		signal $0010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e30
			lsg      global130
			ldi      3
			eq?     
			bt       code_0df8
			lsg      global130
			ldi      9
			eq?     
code_0df8:
			bnt      code_0e21
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0e12
			pushi    3
			pushi    1350
			pushi    56
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e67
code_0e12:
			pushi    3
			pushi    1350
			pushi    62
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e67
code_0e21:
			pushi    3
			pushi    1350
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e67
code_0e30:
			dup     
			ldi      3
			eq?     
			bnt      code_0e5c
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0e4e
			pushi    3
			pushi    1350
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e67
code_0e4e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
			jmp      code_0e67
code_0e5c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_0e67:
			toss    
			ret     
		)
	)
)

(instance tailorCover of PicView
	(properties
		x 95
		y 76
		view 350
		loop 3
		priority 10
		signal $0010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0ef5
			pushi    5
			lsg      global130
			pushi    3
			pushi    5
			pushi    6
			pushi    7
			calle    proc999_5,  10
			bnt      code_0ee6
			pushi    3
			pushi    1350
			pushi    63
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f00
code_0ee6:
			pushi    3
			pushi    1350
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f00
code_0ef5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_0f00:
			ret     
		)
	)
)

(instance handView of Actor
	(properties
		lookStr 65
		view 182
		loop 1
		priority 15
		signal $6810
	)
)

(instance tailorWoman of View
	(properties
		x 75
		y 154
		approachX 108
		approachY 164
		view 742
		cel 1
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0fe8
			pushi    #setScript
			pushi    1
			lofsa    tailorLook
			push    
			lag      global0
			send     6
			jmp      code_1328
code_0fe8:
			dup     
			ldi      3
			eq?     
			bnt      code_1051
			pushi    2
			lsg      global0
			lofsa    tailorWoman
			push    
			callb    proc0_9,  4
			lsg      global126
			ldi      5
			eq?     
			bt       code_1006
			lsg      global126
			ldi      6
			eq?     
code_1006:
			bnt      code_1018
			pushi    #setScript
			pushi    1
			lofsa    tailorDo
			push    
			lag      global0
			send     6
			jmp      code_1328
code_1018:
			lsg      global126
			ldi      1
			eq?     
			bnt      code_1043
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    44
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1328
code_1043:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
			jmp      code_1328
code_1051:
			dup     
			ldi      5
			eq?     
			bnt      code_1067
			pushi    #setScript
			pushi    1
			lofsa    tailorTalk
			push    
			lag      global0
			send     6
			jmp      code_1328
code_1067:
			dup     
			ldi      4
			eq?     
			bnt      code_131d
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1156
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_1319
			lsg      global126
			ldi      1
			eq?     
			bnt      code_10b2
			lsl      local14
			ldi      0
			eq?     
			bnt      code_10b2
			ldi      1
			sal      local14
			pushi    6
			pushi    2
			lea      @local25
			push    
			pushi    7
			pushi    0
			lea      @local16
			push    
			pushi    3
			calle    proc851_0,  12
			jmp      code_1319
code_10b2:
			lsg      global126
			ldi      1
			eq?     
			bnt      code_10ef
			lsl      local14
			ldi      1
			eq?     
			bnt      code_10ef
			lsl      local15
			ldi      0
			eq?     
			bnt      code_10ef
			ldi      1
			sal      local15
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    49
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_10ef:
			lsg      global126
			ldi      5
			eq?     
			bnt      code_1112
			lsl      local13
			ldi      0
			eq?     
			bnt      code_1112
			ldi      1
			sal      local13
			pushi    #setScript
			pushi    1
			lofsa    giveWomanMoney
			push    
			lag      global0
			send     6
			jmp      code_1319
code_1112:
			lsg      global126
			ldi      6
			eq?     
			bnt      code_1135
			lsl      local12
			ldi      0
			eq?     
			bnt      code_1135
			ldi      1
			sal      local12
			pushi    #setScript
			pushi    1
			lofsa    giveWomanMon
			push    
			lag      global0
			send     6
			jmp      code_1319
code_1135:
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    3
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_1156:
			dup     
			ldi      2
			eq?     
			bnt      code_117e
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    19
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_117e:
			dup     
			ldi      6
			eq?     
			bnt      code_11a6
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    19
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_11a6:
			dup     
			ldi      7
			eq?     
			bnt      code_11ce
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    19
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_11ce:
			dup     
			ldi      10
			eq?     
			bnt      code_11f6
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    19
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_11f6:
			dup     
			ldi      14
			eq?     
			bnt      code_121e
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    19
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_121e:
			dup     
			ldi      18
			eq?     
			bnt      code_1246
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    19
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_1246:
			dup     
			ldi      3
			eq?     
			bnt      code_126e
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    20
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_126e:
			dup     
			ldi      5
			eq?     
			bnt      code_1296
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    21
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_1296:
			dup     
			ldi      11
			eq?     
			bnt      code_12be
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    22
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_12be:
			dup     
			ldi      13
			eq?     
			bnt      code_12e6
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    23
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_12e6:
			dup     
			ldi      15
			eq?     
			bnt      code_130e
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    25
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1319
code_130e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_1319:
			toss    
			jmp      code_1328
code_131d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_1328:
			toss    
			ret     
		)
	)
)

(instance swineMan of View
	(properties
		x 157
		y 115
		approachX 167
		approachY 115
		view 740
		loop 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_13a6
			pushi    3
			pushi    1350
			pushi    58
			pushi    1
			calle    proc13_4,  6
			jmp      code_14cc
code_13a6:
			dup     
			ldi      5
			eq?     
			bnt      code_13bc
			pushi    #setScript
			pushi    1
			lofsa    talkToSwine
			push    
			lag      global0
			send     6
			jmp      code_14cc
code_13bc:
			dup     
			ldi      3
			eq?     
			bnt      code_13d2
			pushi    3
			pushi    1350
			pushi    59
			pushi    1
			calle    proc13_4,  6
			jmp      code_14cc
code_13d2:
			dup     
			ldi      4
			eq?     
			bnt      code_14c1
			lsp      param2
			ldi      0
			eq?     
			bnt      code_1439
			lsg      global126
			ldi      2
			eq?     
			bt       code_13ee
			lsg      global126
			ldi      3
			eq?     
code_13ee:
			bnt      code_14cc
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_14cc
			pushi    1
			pushi    132
			callb    proc0_5,  2
			bnt      code_142a
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    27
			pushi    80
			lofsa    {Swineherd}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14cc
code_142a:
			pushi    #setScript
			pushi    1
			lofsa    giveManMoney
			push    
			lag      global0
			send     6
			jmp      code_14cc
code_1439:
			lsp      param2
			ldi      8
			eq?     
			bnt      code_1462
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    31
			pushi    80
			lofsa    {Swineherd}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14cc
code_1462:
			lsp      param2
			ldi      2
			eq?     
			bt       code_148f
			lsp      param2
			ldi      6
			eq?     
			bt       code_148f
			lsp      param2
			ldi      7
			eq?     
			bt       code_148f
			lsp      param2
			ldi      10
			eq?     
			bt       code_148f
			lsp      param2
			ldi      14
			eq?     
			bt       code_148f
			lsp      param2
			ldi      18
			eq?     
code_148f:
			bnt      code_14b3
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    32
			pushi    80
			lofsa    {Swineherd}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14cc
code_14b3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
			jmp      code_14cc
code_14c1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_14cc:
			toss    
			ret     
		)
	)
)

(instance fly of Actor
	(properties
		z 15
		view 370
		cel 1
		signal $6810
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1549
			pushi    3
			pushi    1350
			pushi    65
			pushi    1
			calle    proc13_4,  6
			jmp      code_1555
code_1549:
			pushi    3
			pushi    1350
			pushi    64
			pushi    1
			calle    proc13_4,  6
code_1555:
			ret     
		)
	)
)

(instance fly2 of Actor
	(properties
		z 15
		view 370
		cel 1
		signal $6810
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_15f3
			pushi    3
			pushi    1350
			pushi    65
			pushi    1
			calle    proc13_4,  6
			jmp      code_15ff
code_15f3:
			pushi    3
			pushi    1350
			pushi    64
			pushi    1
			calle    proc13_4,  6
code_15ff:
			ret     
		)
	)
)

(instance bigOlFly of Actor
	(properties
		x 15
		y 210
		lookStr 65
		yStep 12
		view 370
		loop 2
		cel 1
		priority 15
		signal $6810
		illegalBits $0000
		xStep 18
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_169e
			pushi    3
			pushi    1350
			pushi    66
			pushi    1
			calle    proc13_4,  6
			jmp      code_16f9
code_169e:
			dup     
			ldi      3
			eq?     
			bnt      code_16b5
			pushi    #setScript
			pushi    1
			lofsa    smashed
			push    
			lofsa    bigOlFly
			send     6
			jmp      code_16f9
code_16b5:
			dup     
			ldi      5
			eq?     
			bnt      code_16d8
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    3
			pushi    1350
			pushi    68
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_16f9
code_16d8:
			dup     
			ldi      4
			eq?     
			bnt      code_16ee
			pushi    3
			pushi    1350
			pushi    69
			pushi    1
			calle    proc13_4,  6
			jmp      code_16f9
code_16ee:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_16f9:
			toss    
			ret     
		)
	)
)

(instance pig1 of Actor
	(properties
		x 115
		y 144
		view 762
		loop 5
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_179a
			pushi    3
			pushi    1350
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_17bb
code_179a:
			dup     
			ldi      3
			eq?     
			bnt      code_17b0
			pushi    3
			pushi    1350
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_17bb
code_17b0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_17bb:
			toss    
			ret     
		)
	)
)

(instance pig2 of Actor
	(properties
		x 113
		y 139
		view 762
		loop 6
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_185c
			pushi    3
			pushi    1350
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_187d
code_185c:
			dup     
			ldi      3
			eq?     
			bnt      code_1872
			pushi    3
			pushi    1350
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_187d
code_1872:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_187d:
			toss    
			ret     
		)
	)
)

(instance cat of Actor
	(properties
		x 65
		y 168
		view 767
		loop 2
		cel 8
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_191e
			pushi    3
			pushi    1350
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_197e
code_191e:
			dup     
			ldi      3
			eq?     
			bnt      code_1934
			pushi    3
			pushi    1350
			pushi    70
			pushi    1
			calle    proc13_4,  6
			jmp      code_197e
code_1934:
			dup     
			ldi      5
			eq?     
			bnt      code_195d
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    5
			pushi    1350
			pushi    71
			pushi    80
			lofsa    {Noble Feline}
			push    
			pushi    1
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_197e
code_195d:
			dup     
			ldi      4
			eq?     
			bnt      code_1973
			pushi    3
			pushi    1350
			pushi    72
			pushi    1
			calle    proc13_4,  6
			jmp      code_197e
code_1973:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_197e:
			toss    
			ret     
		)
	)
)

(instance chicken of Actor
	(properties
		x 89
		y 186
		view 761
		loop 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a1e
			pushi    3
			pushi    1350
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a68
code_1a1e:
			dup     
			ldi      3
			eq?     
			bnt      code_1a34
			pushi    3
			pushi    1350
			pushi    54
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a68
code_1a34:
			dup     
			ldi      5
			eq?     
			bnt      code_1a5d
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    5
			pushi    1350
			pushi    55
			pushi    1
			pushi    80
			lofsa    {Duck}
			push    
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1a68
code_1a5d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_1a68:
			toss    
			ret     
		)
	)
)

(instance flyCage of Cage
	(properties)
	
	(method (init)
		(asm
			pushi    #top
			pushi    1
			pushi    123
			pushi    185
			pushi    1
			pushi    148
			pushi    184
			pushi    1
			pushi    97
			pushi    186
			pushi    1
			pushi    140
			self     24
			pushi    #init
			pushi    0
			super    Cage,  4
			ret     
		)
	)
)

(instance enterShop of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b62
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    273
			pushi    147
			pushSelf
			lag      global0
			send     12
			jmp      code_1b74
code_1b62:
			dup     
			ldi      1
			eq?     
			bnt      code_1b74
			pushi    #newRoom
			pushi    1
			pushi    360
			lag      global2
			send     6
code_1b74:
			toss    
			ret     
		)
	)
)

(instance tailorLook of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1bcd
			pushi    2
			lsg      global0
			lofsa    tailorWoman
			push    
			callb    proc0_9,  4
			ldi      12
			aTop     ticks
			jmp      code_1c0d
code_1bcd:
			dup     
			ldi      1
			eq?     
			bnt      code_1c01
			pushi    1
			pushi    16
			callb    proc0_5,  2
			bnt      code_1bec
			pushi    3
			pushi    1350
			pushi    12
			pushSelf
			calle    proc13_4,  6
			jmp      code_1c0d
code_1bec:
			pushi    3
			pushi    1350
			pushi    13
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    16
			callb    proc0_6,  2
			jmp      code_1c0d
code_1c01:
			dup     
			ldi      2
			eq?     
			bnt      code_1c0d
			pushi    #dispose
			pushi    0
			self     4
code_1c0d:
			toss    
			ret     
		)
	)
)

(instance tailorTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c69
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    tailorWoman
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1cce
code_1c69:
			dup     
			ldi      1
			eq?     
			bnt      code_1cb8
			lsg      global130
			ldi      3
			eq?     
			bnt      code_1c84
			pushi    #setScript
			pushi    1
			lofsa    day3Talk
			push    
			lag      global0
			send     6
code_1c84:
			pushi    5
			lag      global130
			le?     
			bnt      code_1caf
			pprev   
			ldi      7
			le?     
			bnt      code_1caf
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    5
			pushi    1350
			pushi    16
			pushSelf
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  10
			jmp      code_1cce
code_1caf:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1cce
code_1cb8:
			dup     
			ldi      2
			eq?     
			bnt      code_1cce
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1cce:
			toss    
			ret     
		)
	)
)

(instance catChickenScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d68
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    cat
			send     6
			pushi    #number
			pushi    1
			pushi    2
			pushi    354
			pushi    355
			callk    Random,  4
			push    
			pushi    42
			pushi    0
			lofsa    catSound
			send     10
			pushi    #play
			pushi    0
			lofsa    chickenSound
			send     4
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    290
			pushi    166
			pushSelf
			lofsa    chicken
			send     30
			jmp      code_1eef
code_1d68:
			dup     
			ldi      1
			eq?     
			bnt      code_1d86
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    310
			pushi    160
			pushSelf
			lofsa    chicken
			send     12
			jmp      code_1eef
code_1d86:
			dup     
			ldi      2
			eq?     
			bnt      code_1ddc
			pushi    #stop
			pushi    0
			lofsa    chickenSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    chicken
			send     4
			pushi    #number
			pushi    1
			pushi    2
			pushi    354
			pushi    355
			callk    Random,  4
			push    
			pushi    42
			pushi    0
			lofsa    catSound
			send     10
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    330
			pushi    170
			pushSelf
			lofsa    cat
			send     30
			jmp      code_1eef
code_1ddc:
			dup     
			ldi      3
			eq?     
			bnt      code_1df2
			pushi    #hide
			pushi    0
			lofsa    cat
			send     4
			ldi      10
			aTop     seconds
			jmp      code_1eef
code_1df2:
			dup     
			ldi      4
			eq?     
			bnt      code_1e3a
			pushi    #number
			pushi    1
			pushi    2
			pushi    354
			pushi    355
			callk    Random,  4
			push    
			pushi    42
			pushi    0
			lofsa    catSound
			send     10
			pushi    #show
			pushi    0
			pushi    162
			pushi    1
			pushi    1
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
			pushi    65
			pushi    168
			pushSelf
			lofsa    cat
			send     34
			jmp      code_1eef
code_1e3a:
			dup     
			ldi      5
			eq?     
			bnt      code_1e71
			pushi    #number
			pushi    1
			pushi    2
			pushi    354
			pushi    355
			callk    Random,  4
			push    
			pushi    42
			pushi    0
			lofsa    catSound
			send     10
			pushi    #setLoop
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
			lofsa    cat
			send     20
			jmp      code_1eef
code_1e71:
			dup     
			ldi      6
			eq?     
			bnt      code_1e7f
			ldi      10
			aTop     seconds
			jmp      code_1eef
code_1e7f:
			dup     
			ldi      7
			eq?     
			bnt      code_1e96
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    cat
			send     8
			jmp      code_1eef
code_1e96:
			dup     
			ldi      8
			eq?     
			bnt      code_1edb
			pushi    #number
			pushi    1
			pushi    2
			pushi    354
			pushi    355
			callk    Random,  4
			push    
			pushi    42
			pushi    0
			lofsa    catSound
			send     10
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    330
			pushi    170
			pushSelf
			lofsa    cat
			send     30
			jmp      code_1eef
code_1edb:
			dup     
			ldi      9
			eq?     
			bnt      code_1eef
			pushi    #dispose
			pushi    0
			lofsa    cat
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1eef:
			toss    
			ret     
		)
	)
)

(instance giveWomanMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f43
			pushi    0
			callb    proc0_3,  0
			ldi      5
			aTop     seconds
			jmp      code_1fc1
code_1f43:
			dup     
			ldi      1
			eq?     
			bnt      code_1f6e
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    0
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_1fc1
code_1f6e:
			dup     
			ldi      2
			eq?     
			bnt      code_1f89
			pushi    4
			lea      @local0
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1fc1
code_1f89:
			dup     
			ldi      3
			eq?     
			bnt      code_1fb1
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    5
			pushi    1350
			pushi    2
			pushSelf
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1fc1
code_1fb1:
			dup     
			ldi      4
			eq?     
			bnt      code_1fc1
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1fc1:
			toss    
			ret     
		)
	)
)

(instance giveWomanMon of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2015
			pushi    0
			callb    proc0_3,  0
			ldi      5
			aTop     seconds
			jmp      code_2098
code_2015:
			dup     
			ldi      1
			eq?     
			bnt      code_2041
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    40
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_2098
code_2041:
			dup     
			ldi      2
			eq?     
			bnt      code_205c
			pushi    4
			lea      @local4
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2098
code_205c:
			dup     
			ldi      3
			eq?     
			bnt      code_2088
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    42
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_2098
code_2088:
			dup     
			ldi      4
			eq?     
			bnt      code_2098
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2098:
			toss    
			ret     
		)
	)
)

(instance giveManMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20eb
			pushi    0
			callb    proc0_3,  0
			ldi      5
			aTop     seconds
			jmp      code_2175
code_20eb:
			dup     
			ldi      1
			eq?     
			bnt      code_211e
			pushi    1
			pushi    132
			callb    proc0_6,  2
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    28
			pushi    80
			lofsa    {Swineherd}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_2175
code_211e:
			dup     
			ldi      2
			eq?     
			bnt      code_2139
			pushi    4
			lea      @local8
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2175
code_2139:
			dup     
			ldi      3
			eq?     
			bnt      code_2165
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    30
			pushi    80
			lofsa    {Swineherd}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_2175
code_2165:
			dup     
			ldi      4
			eq?     
			bnt      code_2175
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2175:
			toss    
			ret     
		)
	)
)

(instance day3Talk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_21e1
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    14
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			ldi      1
			aTop     cycles
			jmp      code_2216
code_21e1:
			dup     
			ldi      1
			eq?     
			bnt      code_2206
			pushi    4
			pushi    1350
			pushi    15
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_2216
code_2206:
			dup     
			ldi      2
			eq?     
			bnt      code_2216
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2216:
			toss    
			ret     
		)
	)
)

(instance tailorDo of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2281
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    17
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			ldi      1
			aTop     cycles
			jmp      code_22b6
code_2281:
			dup     
			ldi      1
			eq?     
			bnt      code_22a6
			pushi    4
			pushi    1350
			pushi    18
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_22b6
code_22a6:
			dup     
			ldi      2
			eq?     
			bnt      code_22b6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_22b6:
			toss    
			ret     
		)
	)
)

(instance knockLobb of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    knockSound
			send     4
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
			bnt      code_2325
			pushi    0
			callb    proc0_3,  0
			pushi    #setHeading
			pushi    1
			pushi    90
			lag      global0
			send     6
			ldi      180
			aTop     ticks
			jmp      code_2374
code_2325:
			dup     
			ldi      1
			eq?     
			bnt      code_233b
			pushi    #play
			pushi    0
			lofsa    knockSound
			send     4
			ldi      2
			aTop     cycles
			jmp      code_2374
code_233b:
			dup     
			ldi      2
			eq?     
			bnt      code_2364
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    5
			pushi    1350
			pushi    39
			pushSelf
			pushi    80
			lofsa    {Tailor Woman}
			push    
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2374
code_2364:
			dup     
			ldi      3
			eq?     
			bnt      code_2374
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2374:
			toss    
			ret     
		)
	)
)

(instance talkToSwine of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23d3
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    swineMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_240f
code_23d3:
			dup     
			ldi      1
			eq?     
			bnt      code_23ff
			pushi    1
			pushi    6
			calle    proc13_6,  2
			pushi    4
			pushi    1350
			pushi    26
			pushi    80
			lofsa    {Swineherd}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      1
			aTop     cycles
			jmp      code_240f
code_23ff:
			dup     
			ldi      2
			eq?     
			bnt      code_240f
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_240f:
			toss    
			ret     
		)
	)
)

(instance pigCycle of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_245f
			ldi      10
			aTop     cycles
			jmp      code_2560
code_245f:
			dup     
			ldi      1
			eq?     
			bnt      code_248a
			pushi    #setCycle
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    1
			lofsa    pig2
			send     10
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lofsa    pig1
			send     12
			jmp      code_2560
code_248a:
			dup     
			ldi      2
			eq?     
			bnt      code_2498
			ldi      1
			aTop     cycles
			jmp      code_2560
code_2498:
			dup     
			ldi      3
			eq?     
			bnt      code_24c3
			pushi    #setCycle
			pushi    3
			class    CT
			push    
			pushi    5
			pushi    1
			lofsa    pig2
			send     10
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lofsa    pig1
			send     12
			jmp      code_2560
code_24c3:
			dup     
			ldi      4
			eq?     
			bnt      code_24d1
			ldi      10
			aTop     cycles
			jmp      code_2560
code_24d1:
			dup     
			ldi      5
			eq?     
			bnt      code_24fc
			pushi    #setCycle
			pushi    3
			class    CT
			push    
			pushi    0
			pushi    65535
			lofsa    pig2
			send     10
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lofsa    pig1
			send     12
			jmp      code_2560
code_24fc:
			dup     
			ldi      6
			eq?     
			bnt      code_250a
			ldi      5
			aTop     cycles
			jmp      code_2560
code_250a:
			dup     
			ldi      7
			eq?     
			bnt      code_2535
			pushi    #setCycle
			pushi    3
			class    CT
			push    
			pushi    4
			pushi    1
			lofsa    pig2
			send     10
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lofsa    pig1
			send     12
			jmp      code_2560
code_2535:
			dup     
			ldi      8
			eq?     
			bnt      code_2554
			pushi    2
			pushi    0
			pushi    5
			callk    Random,  4
			bnt      code_254d
			pTos     state
			ldi      3
			sub     
			aTop     state
code_254d:
			ldi      1
			aTop     seconds
			jmp      code_2560
code_2554:
			dup     
			ldi      9
			eq?     
			bnt      code_2560
			pushi    #dispose
			pushi    0
			self     4
code_2560:
			toss    
			ret     
		)
	)
)

(instance comeIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_25c0
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    160
			dup     
			pushSelf
			lag      global0
			send     12
			jmp      code_25d0
code_25c0:
			dup     
			ldi      1
			eq?     
			bnt      code_25d0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_25d0:
			toss    
			ret     
		)
	)
)

(instance getBuggy of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    flySound
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
			bnt      code_264b
			pushi    #play
			pushi    0
			lofsa    flySound
			send     4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    165
			pushi    110
			pushSelf
			lofsa    bigOlFly
			send     12
			jmp      code_2794
code_264b:
			dup     
			ldi      1
			eq?     
			bnt      code_267a
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    #cel
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    2
			pushi    0
			pushi    7
			callk    Random,  4
			add     
			push    
			ldi      7
			mod     
			push    
			pushi    1
			pushSelf
			lofsa    bigOlFly
			send     12
			jmp      code_2794
code_267a:
			dup     
			ldi      2
			eq?     
			bnt      code_26b6
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    150
			pushi    1
			pushi    0
			pushi    58
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			ldi      45
			mul     
			push    
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    20
			pushSelf
			lofsa    bigOlFly
			send     28
			jmp      code_2794
code_26b6:
			dup     
			ldi      3
			eq?     
			bnt      code_26f6
			pushi    2
			pushi    0
			pushi    5
			callk    Random,  4
			bnt      code_26ce
			pTos     state
			ldi      3
			sub     
			aTop     state
code_26ce:
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    #cel
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    2
			pushi    0
			pushi    7
			callk    Random,  4
			add     
			push    
			ldi      7
			mod     
			push    
			pushi    1
			pushSelf
			lofsa    bigOlFly
			send     12
			jmp      code_2794
code_26f6:
			dup     
			ldi      4
			eq?     
			bnt      code_2710
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lofsa    bigOlFly
			send     12
			jmp      code_2794
code_2710:
			dup     
			ldi      5
			eq?     
			bnt      code_2735
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    bigOlFly
			send     18
			ldi      120
			aTop     ticks
			jmp      code_2794
code_2735:
			dup     
			ldi      6
			eq?     
			bnt      code_274c
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    bigOlFly
			send     8
			jmp      code_2794
code_274c:
			dup     
			ldi      7
			eq?     
			bnt      code_2780
			pushi    #setCel
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    58
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    65521
			pushSelf
			lofsa    bigOlFly
			send     24
			jmp      code_2794
code_2780:
			dup     
			ldi      8
			eq?     
			bnt      code_2794
			pushi    #dispose
			pushi    0
			lofsa    bigOlFly
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_2794:
			toss    
			ret     
		)
	)
)

(instance smashed of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2820
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    1
			pushi    #x
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    107
			pushi    0
			lofsa    handView
			send     16
			pushi    #view
			pushi    1
			pushi    370
			pushi    162
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			lofsa    bigOlFly
			send     18
			ldi      4
			aTop     seconds
			jmp      code_2a4d
code_2820:
			dup     
			ldi      1
			eq?     
			bnt      code_284e
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_284e:
			dup     
			ldi      2
			eq?     
			bnt      code_287c
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_287c:
			dup     
			ldi      3
			eq?     
			bnt      code_28aa
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_28aa:
			dup     
			ldi      4
			eq?     
			bnt      code_28d8
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_28d8:
			dup     
			ldi      5
			eq?     
			bnt      code_2906
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_2906:
			dup     
			ldi      6
			eq?     
			bnt      code_2934
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_2934:
			dup     
			ldi      7
			eq?     
			bnt      code_2962
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_2962:
			dup     
			ldi      8
			eq?     
			bnt      code_2990
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_2990:
			dup     
			ldi      9
			eq?     
			bnt      code_29be
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    handView
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    handView
			send     4
			push    
			pushSelf
			lofsa    handView
			send     12
			jmp      code_2a4d
code_29be:
			dup     
			ldi      10
			eq?     
			bnt      code_29dc
			pushi    #dispose
			pushi    0
			lofsa    handView
			send     4
			pushi    3
			pushi    1350
			pushi    67
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a4d
code_29dc:
			dup     
			ldi      11
			eq?     
			bnt      code_29ea
			ldi      6
			aTop     ticks
			jmp      code_2a4d
code_29ea:
			dup     
			ldi      12
			eq?     
			bnt      code_2a13
			pushi    #moveSpeed
			pushi    1
			pushi    18
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			pushi    200
			pushSelf
			lofsa    bigOlFly
			send     18
			jmp      code_2a4d
code_2a13:
			dup     
			ldi      13
			eq?     
			bnt      code_2a3d
			pushi    #y
			pushi    0
			lofsa    bigOlFly
			send     4
			push    
			ldi      180
			lt?     
			bnt      code_2a34
			lsp      newState
			ldi      2
			sub     
			sap      newState
			jmp      code_2a4d
code_2a34:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2a4d
code_2a3d:
			dup     
			ldi      14
			eq?     
			bnt      code_2a4d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2a4d:
			toss    
			ret     
		)
	)
)

(instance pigScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2aa5
			pushi    2
			pushi    450
			pushi    700
			callk    Random,  4
			aTop     ticks
			jmp      code_2acc
code_2aa5:
			dup     
			ldi      1
			eq?     
			bnt      code_2abb
			pushi    #play
			pushi    0
			lofsa    pigSound
			send     4
			ldi      2
			aTop     cycles
			jmp      code_2acc
code_2abb:
			dup     
			ldi      2
			eq?     
			bnt      code_2acc
			ldi      65535
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_2acc:
			toss    
			ret     
		)
	)
)

(instance catSound of Sound
	(properties
		flags $0001
	)
)

(instance chickenSound of Sound
	(properties
		flags $0001
		number 353
		loop -1
	)
)

(instance pigSound of Sound
	(properties
		flags $0001
		number 352
	)
)

(instance knockSound of Sound
	(properties
		flags $0001
		number 933
	)
)

(instance flySound of Sound
	(properties
		flags $0001
		number 363
		loop -1
	)
)
