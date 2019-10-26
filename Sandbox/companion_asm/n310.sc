;;; Sierra Script 1.0 - (do not remove this comment)
(script# 310)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n812)
(use n851)
(use n946)
(use n950)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	rm310 0
)

(local
	local0
	local1
	[local2 18] = [58 0 2 4 26 40 17 31 26 42 0 2 4 25 43 18 31 29]
	[local20 4] = [1310 0 1]
	[local24 4] = [1310 1 1]
	[local28 4] = [1310 2 1]
	[local32 4] = [1310 3 1]
	[local36 8] = [1310 11 1 2 1 2 1]
	[local44 5] = [1310 16 1 2]
	[local49 5] = [1310 19 1 2]
	[local54 6] = [1310 22 2 1 2]
	[local60 12] = [1310 41 1 2 1 2 1 1 1 2 1]
	[local72 7] = [1310 59 1 1 2 1]
	[local79 12] = [1310 68 1 2 1 2 1 2 1 2 1]
	[local91 5] = [1310 85 1 2]
	[local96 5] = [1310 88 2 1]
	[local101 3] = [-1 11788 21]
	[local104 3] = [-1 11809 21]
	[local107 3] = [-1 11823 21]
	[local110 3] = [-1 11834 21]
	[local113 3] = [-1 11851 21]
	[local116 3] = [-1 11865 21]
	[local119 3] = [-1 11881 21]
	[local122 3] = [-1 11898 21]
	[local125 3] = [-1 11909 21]
)
(instance rm310 of StdRoom
	(properties
		picture 310
		style $0064
		north 260
		east 260
		south 260
		west 300
	)
	
	(method (init)
		(asm
			pushi    #setRegions
			pushi    1
			pushi    311
			self     6
			pushi    0
			calle    proc311_3,  0
			pushi    3
			lsg      global126
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_0087
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    246
			pushi    189
			pushi    197
			pushi    172
			pushi    233
			pushi    166
			pushi    195
			pushi    138
			pushi    142
			pushi    154
			pushi    153
			pushi    177
			pushi    186
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			self     6
			jmp      code_0277
code_0087:
			pushi    #addObstacle
			pushi    9
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    28
			pushi    319
			pushi    0
			pushi    319
			pushi    75
			pushi    288
			pushi    75
			pushi    288
			pushi    66
			pushi    262
			pushi    66
			pushi    262
			pushi    23
			pushi    248
			pushi    23
			pushi    209
			pushi    37
			pushi    124
			pushi    37
			pushi    109
			pushi    49
			pushi    43
			pushi    49
			pushi    0
			pushi    31
			pushi    0
			pushi    0
			pushi    259
			pushi    0
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
			pushi    34
			pushi    0
			pushi    80
			pushi    121
			pushi    80
			pushi    195
			pushi    61
			pushi    236
			pushi    61
			pushi    273
			pushi    75
			pushi    273
			pushi    96
			pushi    236
			pushi    106
			pushi    251
			pushi    120
			pushi    206
			pushi    132
			pushi    177
			pushi    136
			pushi    149
			pushi    119
			pushi    146
			pushi    123
			pushi    138
			pushi    135
			pushi    35
			pushi    135
			pushi    35
			pushi    119
			pushi    22
			pushi    104
			pushi    0
			pushi    104
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     82
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    277
			pushi    168
			pushi    271
			pushi    181
			pushi    206
			pushi    181
			pushi    201
			pushi    168
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
			pushi    319
			pushi    189
			pushi    273
			pushi    157
			pushi    278
			pushi    130
			pushi    319
			pushi    119
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
			pushi    0
			pushi    189
			pushi    0
			pushi    184
			pushi    36
			pushi    184
			pushi    36
			pushi    189
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
			pushi    65
			pushi    189
			pushi    65
			pushi    184
			pushi    187
			pushi    184
			pushi    187
			pushi    189
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
			pushi    12
			pushi    0
			pushi    133
			pushi    48
			pushi    147
			pushi    48
			pushi    157
			pushi    25
			pushi    157
			pushi    20
			pushi    152
			pushi    0
			pushi    152
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    254
			pushi    44
			pushi    230
			pushi    44
			pushi    230
			pushi    34
			pushi    254
			pushi    34
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
			pushi    138
			pushi    139
			pushi    164
			pushi    139
			pushi    164
			pushi    149
			pushi    138
			pushi    149
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     22
code_0277:
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    rugArm1
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    rugArm2
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    rugHead
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    coryHead
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    ear1
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    ear2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    sRandom
			push    
			lofsa    gameArm
			send     10
			pushi    #add
			pushi    48
			lofsa    person1
			push    
			lofsa    person2
			push    
			lofsa    person3
			push    
			lofsa    person4
			push    
			lofsa    person5
			push    
			lofsa    person6
			push    
			lofsa    person7
			push    
			lofsa    person8
			push    
			lofsa    person9
			push    
			lofsa    person10
			push    
			lofsa    person11
			push    
			lofsa    person12
			push    
			lofsa    person13
			push    
			lofsa    person14
			push    
			lofsa    person15
			push    
			lofsa    person16
			push    
			lofsa    person17
			push    
			lofsa    person18
			push    
			lofsa    person19
			push    
			lofsa    person20
			push    
			lofsa    person21
			push    
			lofsa    person22
			push    
			lofsa    gameTable
			push    
			lofsa    stall
			push    
			lofsa    table
			push    
			lofsa    potA
			push    
			lofsa    potB
			push    
			lofsa    potC
			push    
			lofsa    potC2
			push    
			lofsa    potD
			push    
			lofsa    potE
			push    
			lofsa    potE2
			push    
			lofsa    potF
			push    
			lofsa    potF2
			push    
			lofsa    potG
			push    
			lofsa    potG2
			push    
			lofsa    potH
			push    
			lofsa    potH2
			push    
			lofsa    mat
			push    
			lofsa    rug1
			push    
			lofsa    rug2
			push    
			lofsa    rug3
			push    
			lofsa    rug4
			push    
			lofsa    wall
			push    
			lofsa    satOnRug
			push    
			lofsa    cart
			push    
			lofsa    person55
			push    
			lofsa    mule
			push    
			pushi    116
			pushi    1
			pushi    107
			lag      global32
			send     106
			pushi    3
			lsg      global126
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_03e6
			pushi    107
			pushi    0
			pushi    5
			pushi    1
			lsg      global126
			ldi      5
			eq?     
			bnt      code_03c1
			ldi      129
			jmp      code_03c4
code_03c1:
			ldi      128
code_03c4:
			push    
			pushi    142
			pushi    1
			lofsa    sMonk
			push    
			lofsa    badMonk
			send     16
			pushi    #init
			pushi    0
			lofsa    sheriffMan1
			send     4
			pushi    #init
			pushi    0
			lofsa    sheriffMan2
			send     4
			ldi      1
			sal      local1
code_03e6:
			lag      global198
			not     
			bt       code_03f2
			lsg      global198
			ldi      270
			gt?     
code_03f2:
			bnt      code_0401
			pushi    #init
			pushi    0
			pushi    1
			pushi    316
			callk    ScriptID,  2
			send     4
code_0401:
			lsg      global12
			dup     
			pToa     west
			eq?     
			bnt      code_0438
			ldi      12
			aTop     style
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      320
			sub     
			push    
			lag      global0
			send     6
			pushi    #init
			pushi    1
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			super    StdRoom,  6
			pushi    0
			callb    proc0_4,  0
			jmp      code_04e5
code_0438:
			dup     
			ldi      260
			eq?     
			bnt      code_046f
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			pushi    284
			pushi    2
			pushi    263
			pushi    239
			pushi    228
			pushi    1
			pushi    315
			lag      global0
			send     18
			pushi    #setScript
			pushi    1
			lofsa    sEnter
			push    
			self     6
			pushi    #init
			pushi    0
			super    StdRoom,  4
			jmp      code_04e5
code_046f:
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sEnter
			push    
			self     6
			ldi      20
			sal      local0
			pushi    328
			pushi    #superClass
			push    
			ldi      4
			div     
			push    
			lag      global133
			send     6
			pushi    328
			pushi    1
			lsl      local0
			ldi      4
			mod     
			push    
			ldi      2
			div     
			push    
			lag      global134
			send     6
			pushi    328
			pushi    #superClass
			lsl      local0
			ldi      2
			mod     
			push    
			lag      global135
			send     6
			ldi      4
			sag      global126
			ldi      8
			sag      global130
			pushi    1
			pushi    34
			callb    proc0_6,  2
			pushi    #init
			pushi    0
			pushi    284
			pushi    2
			pushi    263
			pushi    239
			pushi    327
			pushi    1
			pushi    17
			pushi    327
			pushi    1
			pushi    0
			pushi    228
			pushi    1
			pushi    315
			lag      global0
			send     30
			pushi    #init
			pushi    0
			super    StdRoom,  4
code_04e5:
			toss    
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_04ef
			jmp      code_0530
code_04ef:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0511
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitSouth
			push    
			lag      global2
			send     6
			jmp      code_0530
code_0511:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0530
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitWest
			push    
			lag      global2
			send     6
code_0530:
			pushi    #doit
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
)

(instance rugArm1 of Prop
	(properties
		x 177
		y 93
		view 310
		loop 1
		priority 9
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_059c
			pushi    2
			pushi    1310
			pushi    58
			calle    proc13_4,  4
			jmp      code_061b
code_059c:
			dup     
			ldi      5
			eq?     
			bnt      code_05ba
			pushi    5
			lea      @local72
			push    
			lea      @local116
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_061b
code_05ba:
			dup     
			ldi      4
			eq?     
			bnt      code_05fa
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_05eb
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    63
			pushi    80
			lofsa    {Oswald Oakhurst}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f6
code_05eb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_05f6:
			toss    
			jmp      code_061b
code_05fa:
			dup     
			ldi      3
			eq?     
			bnt      code_0610
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_061b
code_0610:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_061b:
			toss    
			ret     
		)
	)
)

(instance rugArm2 of Prop
	(properties
		x 188
		y 93
		view 310
		loop 2
		priority 9
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06a2
			pushi    2
			pushi    1310
			pushi    58
			calle    proc13_4,  4
			jmp      code_0721
code_06a2:
			dup     
			ldi      5
			eq?     
			bnt      code_06c0
			pushi    5
			lea      @local72
			push    
			lea      @local116
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0721
code_06c0:
			dup     
			ldi      4
			eq?     
			bnt      code_0700
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_06f1
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    63
			pushi    80
			lofsa    {Oswald Oakhurst}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_06fc
code_06f1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_06fc:
			toss    
			jmp      code_0721
code_0700:
			dup     
			ldi      3
			eq?     
			bnt      code_0716
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0721
code_0716:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0721:
			toss    
			ret     
		)
	)
)

(instance rugHead of Prop
	(properties
		x 183
		y 92
		view 310
		loop 4
		priority 9
		signal $4010
		cycleSpeed 5
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_07a8
			pushi    2
			pushi    1310
			pushi    58
			calle    proc13_4,  4
			jmp      code_0827
code_07a8:
			dup     
			ldi      5
			eq?     
			bnt      code_07c6
			pushi    5
			lea      @local72
			push    
			lea      @local116
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0827
code_07c6:
			dup     
			ldi      4
			eq?     
			bnt      code_0806
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_07f7
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    63
			pushi    80
			lofsa    {Oswald Oakhurst}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0802
code_07f7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0802:
			toss    
			jmp      code_0827
code_0806:
			dup     
			ldi      3
			eq?     
			bnt      code_081c
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0827
code_081c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0827:
			toss    
			ret     
		)
	)
)

(instance coryHead of Prop
	(properties
		x 298
		y 119
		view 310
		loop 3
		priority 14
		signal $4010
		cycleSpeed 5
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_08ae
			pushi    2
			pushi    1310
			pushi    84
			calle    proc13_4,  4
			jmp      code_08ef
code_08ae:
			dup     
			ldi      5
			eq?     
			bnt      code_08ce
			pushi    5
			lea      @local91
			push    
			lea      @local122
			push    
			lea      @local125
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_08ef
code_08ce:
			dup     
			ldi      3
			eq?     
			bnt      code_08e4
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_08ef
code_08e4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_08ef:
			toss    
			ret     
		)
	)
)

(instance ear1 of View
	(properties
		x 176
		y 160
		view 310
		loop 5
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0976
			pushi    2
			pushi    1310
			pushi    110
			calle    proc13_4,  4
			jmp      code_09bf
code_0976:
			dup     
			ldi      5
			eq?     
			bnt      code_099e
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    111
			pushi    80
			lofsa    {Francis the Mule}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_09bf
code_099e:
			dup     
			ldi      3
			eq?     
			bnt      code_09b4
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_09bf
code_09b4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_09bf:
			toss    
			ret     
		)
	)
)

(instance ear2 of View
	(properties
		x 184
		y 160
		view 310
		loop 6
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a3c
			pushi    2
			pushi    1310
			pushi    110
			calle    proc13_4,  4
			jmp      code_0a85
code_0a3c:
			dup     
			ldi      5
			eq?     
			bnt      code_0a64
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    111
			pushi    80
			lofsa    {Francis the Mule}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a85
code_0a64:
			dup     
			ldi      3
			eq?     
			bnt      code_0a7a
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a85
code_0a7a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_0a85:
			toss    
			ret     
		)
	)
)

(instance gameArm of Prop
	(properties
		x 2
		y 48
		view 310
		priority 9
		signal $4010
		cycleSpeed 5
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b02
			pushi    2
			pushi    1310
			pushi    25
			calle    proc13_4,  4
			jmp      code_0b4b
code_0b02:
			dup     
			ldi      5
			eq?     
			bnt      code_0b2a
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    26
			pushi    80
			lofsa    {Joshua Mandel}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0b4b
code_0b2a:
			dup     
			ldi      3
			eq?     
			bnt      code_0b40
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b4b
code_0b40:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0b4b:
			toss    
			ret     
		)
	)
)

(instance person1 of Feature
	(properties
		x 26
		y 19
		nsTop 1
		nsLeft 16
		nsBottom 38
		nsRight 37
		sightAngle 90
		approachX 38
		approachY 43
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0bd2
			pushi    2
			pushi    1310
			pushi    9
			calle    proc13_4,  4
			jmp      code_0c09
code_0bd2:
			dup     
			ldi      5
			eq?     
			bnt      code_0be8
			pushi    3
			pushi    1310
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c09
code_0be8:
			dup     
			ldi      3
			eq?     
			bnt      code_0bfe
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c09
code_0bfe:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0c09:
			toss    
			ret     
		)
	)
)

(instance person2 of Feature
	(properties
		x 68
		y 20
		nsLeft 57
		nsBottom 41
		nsRight 79
		sightAngle 90
		approachX 85
		approachY 54
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c66
			pushi    2
			pushi    1310
			pushi    10
			calle    proc13_4,  4
			jmp      code_0cd0
code_0c66:
			dup     
			ldi      5
			eq?     
			bnt      code_0caf
			pushi    #firstPickpocket
			pushi    0
			class    Fair
			send     4
			bnt      code_0c98
			pushi    5
			lea      @local36
			push    
			pushi    6
			lea      @local101
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    #firstPickpocket
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_0cd0
code_0c98:
			pushi    5
			lea      @local44
			push    
			pushi    6
			lea      @local101
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0cd0
code_0caf:
			dup     
			ldi      3
			eq?     
			bnt      code_0cc5
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0cd0
code_0cc5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0cd0:
			toss    
			ret     
		)
	)
)

(instance person3 of Feature
	(properties
		x 101
		y 20
		nsLeft 86
		nsBottom 41
		nsRight 116
		sightAngle 90
		approachX 85
		approachY 54
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d2c
			pushi    2
			pushi    1310
			pushi    18
			calle    proc13_4,  4
			jmp      code_0d6b
code_0d2c:
			dup     
			ldi      5
			eq?     
			bnt      code_0d4a
			pushi    5
			lea      @local49
			push    
			pushi    6
			lea      @local104
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0d6b
code_0d4a:
			dup     
			ldi      3
			eq?     
			bnt      code_0d60
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d6b
code_0d60:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0d6b:
			toss    
			ret     
		)
	)
)

(instance person4 of Feature
	(properties
		x 173
		y 15
		nsLeft 163
		nsBottom 30
		nsRight 184
		sightAngle 90
		approachX 197
		approachY 43
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0dc8
			pushi    2
			pushi    1310
			pushi    21
			calle    proc13_4,  4
			jmp      code_0e07
code_0dc8:
			dup     
			ldi      5
			eq?     
			bnt      code_0de6
			pushi    5
			lea      @local54
			push    
			pushi    6
			lea      @local107
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0e07
code_0de6:
			dup     
			ldi      3
			eq?     
			bnt      code_0dfc
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e07
code_0dfc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0e07:
			toss    
			ret     
		)
	)
)

(instance person5 of Feature
	(properties
		x 8
		y 81
		z 30
		nsTop 35
		nsBottom 67
		nsRight 17
		sightAngle 90
		approachX 24
		approachY 58
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e64
			pushi    2
			pushi    1310
			pushi    25
			calle    proc13_4,  4
			jmp      code_0ead
code_0e64:
			dup     
			ldi      5
			eq?     
			bnt      code_0e8c
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    26
			pushi    80
			lofsa    {Joshua Mandel}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0ead
code_0e8c:
			dup     
			ldi      3
			eq?     
			bnt      code_0ea2
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ead
code_0ea2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0ead:
			toss    
			ret     
		)
	)
)

(instance person6 of Feature
	(properties
		x 75
		y 98
		z 20
		nsTop 52
		nsLeft 65
		nsBottom 105
		nsRight 85
		sightAngle 90
		approachX 74
		approachY 80
		_approachVerbs 20
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f0a
			pushi    2
			pushi    1310
			pushi    27
			calle    proc13_4,  4
			jmp      code_0f65
code_0f0a:
			dup     
			ldi      5
			eq?     
			bnt      code_0f32
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    29
			pushi    80
			lofsa    {George Bush}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0f65
code_0f32:
			dup     
			ldi      3
			eq?     
			bnt      code_0f5a
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    28
			pushi    80
			lofsa    {George Bush}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0f65
code_0f5a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0f65:
			toss    
			ret     
		)
	)
)

(instance person7 of Feature
	(properties
		x 88
		y 84
		z 30
		nsTop 44
		nsLeft 79
		nsBottom 65
		nsRight 97
		sightAngle 90
		approachX 74
		approachY 74
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0fc2
			pushi    2
			pushi    1310
			pushi    30
			calle    proc13_4,  4
			jmp      code_101c
code_0fc2:
			dup     
			ldi      5
			eq?     
			bnt      code_0ffb
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    31
			pushi    80
			lofsa    {Daniel Quail}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1310
			pushi    32
			pushi    80
			lofsa    {Daniel Quail}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_101c
code_0ffb:
			dup     
			ldi      3
			eq?     
			bnt      code_1011
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_101c
code_1011:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_101c:
			toss    
			ret     
		)
	)
)

(instance person8 of Feature
	(properties
		x 109
		y 93
		z 40
		nsTop 42
		nsLeft 102
		nsBottom 65
		nsRight 116
		sightAngle 90
		approachX 101
		approachY 78
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1078
			pushi    2
			pushi    1310
			pushi    33
			calle    proc13_4,  4
			jmp      code_10e3
code_1078:
			dup     
			ldi      5
			eq?     
			bnt      code_10c2
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    34
			pushi    80
			lofsa    {Christopher Shankarmour}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1310
			pushi    35
			pushi    80
			lofsa    {Christopher Shankarmour}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1310
			pushi    36
			pushi    80
			lofsa    {Christopher Shankarmour}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_10e3
code_10c2:
			dup     
			ldi      3
			eq?     
			bnt      code_10d8
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_10e3
code_10d8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_10e3:
			toss    
			ret     
		)
	)
)

(instance person9 of Feature
	(properties
		x 243
		y 21
		nsTop -1
		nsLeft 234
		nsBottom 43
		nsRight 253
		sightAngle 90
		approachX 222
		approachY 43
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1140
			pushi    2
			pushi    1310
			pushi    37
			calle    proc13_4,  4
			jmp      code_119a
code_1140:
			dup     
			ldi      5
			eq?     
			bnt      code_1179
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    38
			pushi    80
			lofsa    {Mistress Yhalkee}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1310
			pushi    39
			pushi    80
			lofsa    {Mistress Yhalkee}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_119a
code_1179:
			dup     
			ldi      3
			eq?     
			bnt      code_118f
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_119a
code_118f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_119a:
			toss    
			ret     
		)
	)
)

(instance person10 of Feature
	(properties
		x 281
		y 33
		nsTop 2
		nsLeft 269
		nsBottom 65
		nsRight 293
		sightAngle 90
		onMeCheck $0004
		approachX 276
		approachY 75
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11f6
			pushi    2
			pushi    1310
			pushi    40
			calle    proc13_4,  4
			jmp      code_1244
code_11f6:
			dup     
			ldi      5
			eq?     
			bnt      code_1223
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    5
			lea      @local60
			push    
			lea      @local110
			push    
			lea      @local113
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1244
code_1223:
			dup     
			ldi      3
			eq?     
			bnt      code_1239
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_1244
code_1239:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1244:
			toss    
			ret     
		)
	)
)

(instance person11 of Feature
	(properties
		x 302
		y 40
		nsTop 15
		nsLeft 292
		nsBottom 66
		nsRight 312
		sightAngle 90
		approachX 276
		approachY 75
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_12a0
			pushi    2
			pushi    1310
			pushi    50
			calle    proc13_4,  4
			jmp      code_12e9
code_12a0:
			dup     
			ldi      5
			eq?     
			bnt      code_12c8
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    51
			pushi    80
			lofsa    {Biddy Bigears}
			push    
			calle    proc13_5,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_12e9
code_12c8:
			dup     
			ldi      3
			eq?     
			bnt      code_12de
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_12e9
code_12de:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_12e9:
			toss    
			ret     
		)
	)
)

(instance person12 of Feature
	(properties
		x 14
		y 120
		nsTop 93
		nsLeft 6
		nsBottom 148
		nsRight 23
		sightAngle 90
		approachX 32
		approachY 127
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1346
			pushi    2
			pushi    1310
			pushi    52
			calle    proc13_4,  4
			jmp      code_138f
code_1346:
			dup     
			ldi      5
			eq?     
			bnt      code_136e
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    53
			pushi    80
			lofsa    {Cedric Nimfadoro}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_138f
code_136e:
			dup     
			ldi      3
			eq?     
			bnt      code_1384
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_138f
code_1384:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_138f:
			toss    
			ret     
		)
	)
)

(instance person13 of Feature
	(properties
		x 33
		y 128
		nsTop 104
		nsLeft 23
		nsBottom 152
		nsRight 43
		sightAngle 90
		approachX 32
		approachY 127
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_13ec
			pushi    2
			pushi    1310
			pushi    54
			calle    proc13_4,  4
			jmp      code_1435
code_13ec:
			dup     
			ldi      5
			eq?     
			bnt      code_1414
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    55
			pushi    80
			lofsa    {Old Gaffer}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1435
code_1414:
			dup     
			ldi      3
			eq?     
			bnt      code_142a
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_1435
code_142a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1435:
			toss    
			ret     
		)
	)
)

(instance person14 of Feature
	(properties
		x 150
		y 150
		z 30
		nsTop 94
		nsLeft 139
		nsBottom 146
		nsRight 161
		sightAngle 90
		approachX 119
		approachY 143
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1492
			pushi    2
			pushi    1310
			pushi    56
			calle    proc13_4,  4
			jmp      code_14db
code_1492:
			dup     
			ldi      5
			eq?     
			bnt      code_14ba
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    57
			pushi    80
			lofsa    {Patience Witzend}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14db
code_14ba:
			dup     
			ldi      3
			eq?     
			bnt      code_14d0
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_14db
code_14d0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_14db:
			toss    
			ret     
		)
	)
)

(instance person15 of Feature
	(properties
		x 181
		y 98
		nsTop 83
		nsLeft 167
		nsBottom 113
		nsRight 195
		sightAngle 90
		approachX 164
		approachY 123
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1538
			pushi    2
			pushi    1310
			pushi    58
			calle    proc13_4,  4
			jmp      code_15b7
code_1538:
			dup     
			ldi      5
			eq?     
			bnt      code_1556
			pushi    5
			lea      @local72
			push    
			lea      @local116
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_15b7
code_1556:
			dup     
			ldi      4
			eq?     
			bnt      code_1596
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1587
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    63
			pushi    80
			lofsa    {Oswald Oakhurst}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1592
code_1587:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1592:
			toss    
			jmp      code_15b7
code_1596:
			dup     
			ldi      3
			eq?     
			bnt      code_15ac
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_15b7
code_15ac:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_15b7:
			toss    
			ret     
		)
	)
)

(instance person16 of Feature
	(properties
		x 201
		y 104
		nsTop 78
		nsLeft 191
		nsBottom 130
		nsRight 212
		sightAngle 90
		approachX 174
		approachY 130
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1614
			pushi    2
			pushi    1310
			pushi    64
			calle    proc13_4,  4
			jmp      code_166e
code_1614:
			dup     
			ldi      5
			eq?     
			bnt      code_164d
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    65
			pushi    80
			lofsa    {Mark Hood}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1310
			pushi    66
			pushi    80
			lofsa    {Oswald Oakhurst}
			push    
			calle    proc13_5,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_166e
code_164d:
			dup     
			ldi      3
			eq?     
			bnt      code_1663
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_166e
code_1663:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_166e:
			toss    
			ret     
		)
	)
)

(instance person17 of Feature
	(properties
		x 20
		y 269
		z 100
		nsTop 150
		nsLeft 6
		nsBottom 189
		nsRight 34
		sightAngle 90
		approachX 23
		approachY 179
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_16ca
			pushi    2
			pushi    1310
			pushi    67
			calle    proc13_4,  4
			jmp      code_1709
code_16ca:
			dup     
			ldi      5
			eq?     
			bnt      code_16e8
			pushi    5
			lea      @local79
			push    
			pushi    6
			lea      @local119
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1709
code_16e8:
			dup     
			ldi      3
			eq?     
			bnt      code_16fe
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_1709
code_16fe:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1709:
			toss    
			ret     
		)
	)
)

(instance person18 of Feature
	(properties
		x 132
		y 271
		z 100
		nsTop 154
		nsLeft 116
		nsBottom 189
		nsRight 149
		sightAngle 90
		approachX 132
		approachY 184
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1766
			pushi    2
			pushi    1310
			pushi    77
			calle    proc13_4,  4
			jmp      code_17c0
code_1766:
			dup     
			ldi      5
			eq?     
			bnt      code_179f
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    78
			pushi    80
			lofsa    {Wystan Wheelwright}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1310
			pushi    79
			pushi    80
			lofsa    {Wystan Wheelwright}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_17c0
code_179f:
			dup     
			ldi      3
			eq?     
			bnt      code_17b5
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_17c0
code_17b5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_17c0:
			toss    
			ret     
		)
	)
)

(instance person19 of Feature
	(properties
		x 218
		y 259
		z 100
		nsTop 141
		nsLeft 210
		nsBottom 178
		nsRight 226
		sightAngle 90
		approachX 228
		approachY 162
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_181c
			pushi    2
			pushi    1310
			pushi    80
			calle    proc13_4,  4
			jmp      code_1865
code_181c:
			dup     
			ldi      5
			eq?     
			bnt      code_1844
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    81
			pushi    80
			lofsa    {Richard}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1865
code_1844:
			dup     
			ldi      3
			eq?     
			bnt      code_185a
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_1865
code_185a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1865:
			toss    
			ret     
		)
	)
)

(instance person20 of Feature
	(properties
		x 248
		y 253
		z 100
		nsTop 124
		nsLeft 226
		nsBottom 182
		nsRight 270
		sightAngle 90
		approachX 228
		approachY 162
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_18c2
			pushi    2
			pushi    1310
			pushi    82
			calle    proc13_4,  4
			jmp      code_190b
code_18c2:
			dup     
			ldi      5
			eq?     
			bnt      code_18ea
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    83
			pushi    80
			lofsa    {Aaron}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_190b
code_18ea:
			dup     
			ldi      3
			eq?     
			bnt      code_1900
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_190b
code_1900:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_190b:
			toss    
			ret     
		)
	)
)

(instance person21 of Feature
	(properties
		x 299
		y 123
		nsTop 110
		nsLeft 289
		nsBottom 136
		nsRight 309
		sightAngle 90
		approachX 279
		approachY 128
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1968
			pushi    2
			pushi    1310
			pushi    84
			calle    proc13_4,  4
			jmp      code_19a9
code_1968:
			dup     
			ldi      5
			eq?     
			bnt      code_1988
			pushi    5
			lea      @local91
			push    
			lea      @local122
			push    
			lea      @local125
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_19a9
code_1988:
			dup     
			ldi      3
			eq?     
			bnt      code_199e
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_19a9
code_199e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_19a9:
			toss    
			ret     
		)
	)
)

(instance person22 of Feature
	(properties
		x 305
		y 105
		nsTop 81
		nsLeft 297
		nsBottom 130
		nsRight 314
		sightAngle 90
		approachX 279
		approachY 128
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a06
			pushi    2
			pushi    1310
			pushi    87
			calle    proc13_4,  4
			jmp      code_1a47
code_1a06:
			dup     
			ldi      5
			eq?     
			bnt      code_1a26
			pushi    5
			lea      @local96
			push    
			lea      @local122
			push    
			lea      @local125
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1a47
code_1a26:
			dup     
			ldi      3
			eq?     
			bnt      code_1a3c
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a47
code_1a3c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1a47:
			toss    
			ret     
		)
	)
)

(instance gameTable of Feature
	(properties
		x 19
		y 62
		nsTop 53
		nsLeft 4
		nsBottom 71
		nsRight 35
		sightAngle 90
		onMeCheck $0004
		approachX 24
		approachY 58
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1aa4
			pushi    2
			pushi    1310
			pushi    90
			calle    proc13_4,  4
			jmp      code_1aaf
code_1aa4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1aaf:
			toss    
			ret     
		)
	)
)

(instance stall of Feature
	(properties
		x 150
		y 86
		z 40
		nsTop 33
		nsLeft 112
		nsBottom 60
		nsRight 188
		sightAngle 90
		approachX 140
		approachY 68
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1b0c
			pushi    2
			pushi    1310
			pushi    91
			calle    proc13_4,  4
			jmp      code_1b2b
code_1b0c:
			dup     
			ldi      3
			eq?     
			bnt      code_1b20
			pushi    2
			pushi    1310
			pushi    92
			calle    proc13_4,  4
			jmp      code_1b2b
code_1b20:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1b2b:
			toss    
			ret     
		)
	)
)

(instance table of Feature
	(properties
		x 193
		y 15
		nsLeft 155
		nsBottom 31
		nsRight 231
		sightAngle 90
		approachX 197
		approachY 43
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1b88
			pushi    2
			pushi    1310
			pushi    93
			calle    proc13_4,  4
			jmp      code_1bb4
code_1b88:
			dup     
			ldi      3
			eq?     
			bnt      code_1ba9
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    2
			pushi    1310
			pushi    94
			calle    proc13_4,  4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1bb4
code_1ba9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1bb4:
			toss    
			ret     
		)
	)
)

(instance mat of Feature
	(properties
		x 89
		y 117
		nsTop 101
		nsLeft 39
		nsBottom 134
		nsRight 139
		sightAngle 90
		onMeCheck $0004
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1c10
			pushi    2
			pushi    1310
			pushi    95
			calle    proc13_4,  4
			jmp      code_1c1b
code_1c10:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1c1b:
			toss    
			ret     
		)
	)
)

(instance potA of Feature
	(properties
		x 107
		y 97
		nsTop 89
		nsLeft 98
		nsBottom 105
		nsRight 117
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1c78
			pushi    2
			pushi    1310
			pushi    96
			calle    proc13_4,  4
			jmp      code_1c83
code_1c78:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1c83:
			toss    
			ret     
		)
	)
)

(instance potB of Feature
	(properties
		x 38
		y 101
		nsTop 93
		nsLeft 29
		nsBottom 110
		nsRight 48
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1ce0
			pushi    2
			pushi    1310
			pushi    97
			calle    proc13_4,  4
			jmp      code_1ceb
code_1ce0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1ceb:
			toss    
			ret     
		)
	)
)

(instance potC of Feature
	(properties
		x 49
		y 118
		nsTop 112
		nsLeft 43
		nsBottom 124
		nsRight 55
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1d48
			pushi    2
			pushi    1310
			pushi    98
			calle    proc13_4,  4
			jmp      code_1d53
code_1d48:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1d53:
			toss    
			ret     
		)
	)
)

(instance potC2 of Feature
	(properties
		x 62
		y 124
		nsTop 119
		nsLeft 54
		nsBottom 130
		nsRight 70
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1db0
			pushi    2
			pushi    1310
			pushi    98
			calle    proc13_4,  4
			jmp      code_1dbb
code_1db0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1dbb:
			toss    
			ret     
		)
	)
)

(instance potD of Feature
	(properties
		x 80
		y 125
		nsTop 121
		nsLeft 72
		nsBottom 130
		nsRight 88
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1e18
			pushi    2
			pushi    1310
			pushi    99
			calle    proc13_4,  4
			jmp      code_1e23
code_1e18:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1e23:
			toss    
			ret     
		)
	)
)

(instance potE of Feature
	(properties
		x 92
		y 102
		nsTop 99
		nsLeft 88
		nsBottom 105
		nsRight 96
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1e80
			pushi    2
			pushi    1310
			pushi    100
			calle    proc13_4,  4
			jmp      code_1e8b
code_1e80:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1e8b:
			toss    
			ret     
		)
	)
)

(instance potE2 of Feature
	(properties
		x 97
		y 109
		nsTop 105
		nsLeft 91
		nsBottom 114
		nsRight 103
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1ee8
			pushi    2
			pushi    1310
			pushi    100
			calle    proc13_4,  4
			jmp      code_1ef3
code_1ee8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1ef3:
			toss    
			ret     
		)
	)
)

(instance potF of Feature
	(properties
		x 108
		y 116
		nsTop 111
		nsLeft 103
		nsBottom 122
		nsRight 113
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1f50
			pushi    2
			pushi    1310
			pushi    101
			calle    proc13_4,  4
			jmp      code_1f5b
code_1f50:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1f5b:
			toss    
			ret     
		)
	)
)

(instance potF2 of Feature
	(properties
		x 117
		y 122
		nsTop 118
		nsLeft 110
		nsBottom 127
		nsRight 124
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1fb8
			pushi    2
			pushi    1310
			pushi    101
			calle    proc13_4,  4
			jmp      code_1fc3
code_1fb8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1fc3:
			toss    
			ret     
		)
	)
)

(instance potG of Feature
	(properties
		x 54
		y 107
		nsTop 104
		nsLeft 50
		nsBottom 111
		nsRight 59
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2020
			pushi    2
			pushi    1310
			pushi    102
			calle    proc13_4,  4
			jmp      code_202b
code_2020:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_202b:
			toss    
			ret     
		)
	)
)

(instance potG2 of Feature
	(properties
		x 62
		y 114
		nsTop 110
		nsLeft 58
		nsBottom 118
		nsRight 67
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2088
			pushi    2
			pushi    1310
			pushi    102
			calle    proc13_4,  4
			jmp      code_2093
code_2088:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2093:
			toss    
			ret     
		)
	)
)

(instance potH of Feature
	(properties
		x 99
		y 123
		nsTop 120
		nsLeft 94
		nsBottom 127
		nsRight 105
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_20f0
			pushi    2
			pushi    1310
			pushi    103
			calle    proc13_4,  4
			jmp      code_20fb
code_20f0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_20fb:
			toss    
			ret     
		)
	)
)

(instance potH2 of Feature
	(properties
		x 70
		y 126
		sightAngle 45
		approachX 92
		approachY 137
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    92
			pushi    105
			pushi    91
			pushi    111
			pushi    88
			pushi    112
			pushi    84
			pushi    109
			pushi    85
			pushi    103
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
			bnt      code_2189
			pushi    2
			pushi    1310
			pushi    103
			calle    proc13_4,  4
			jmp      code_2194
code_2189:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2194:
			toss    
			ret     
		)
	)
)

(instance wall of Feature
	(properties
		x 131
		y 74
		nsTop 48
		nsBottom 100
		nsRight 263
		sightAngle 90
		onMeCheck $0002
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_21fe
			pushi    2
			pushi    1310
			pushi    104
			calle    proc13_4,  4
			pushi    2
			pushi    1310
			pushi    105
			calle    proc13_4,  4
			jmp      code_2209
code_21fe:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2209:
			toss    
			ret     
		)
	)
)

(instance rug1 of Feature
	(properties
		x 165
		y 71
		nsTop 59
		nsLeft 141
		nsBottom 84
		nsRight 189
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2266
			pushi    2
			pushi    1310
			pushi    106
			calle    proc13_4,  4
			jmp      code_2271
code_2266:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2271:
			toss    
			ret     
		)
	)
)

(instance rug2 of Feature
	(properties
		x 208
		y 60
		nsTop 52
		nsLeft 191
		nsBottom 69
		nsRight 225
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_22ce
			pushi    2
			pushi    1310
			pushi    106
			calle    proc13_4,  4
			jmp      code_22d9
code_22ce:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_22d9:
			toss    
			ret     
		)
	)
)

(instance rug3 of Feature
	(properties
		x 245
		y 60
		nsTop 46
		nsLeft 231
		nsBottom 74
		nsRight 260
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2336
			pushi    2
			pushi    1310
			pushi    106
			calle    proc13_4,  4
			jmp      code_2341
code_2336:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2341:
			toss    
			ret     
		)
	)
)

(instance rug4 of Feature
	(properties
		x 235
		y 94
		nsTop 87
		nsLeft 208
		nsBottom 102
		nsRight 262
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_239e
			pushi    2
			pushi    1310
			pushi    106
			calle    proc13_4,  4
			jmp      code_23a9
code_239e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_23a9:
			toss    
			ret     
		)
	)
)

(instance satOnRug of Feature
	(properties
		x 196
		y 114
		nsTop 102
		nsLeft 153
		nsBottom 127
		nsRight 240
		sightAngle 90
		onMeCheck $0004
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2406
			pushi    2
			pushi    1310
			pushi    107
			calle    proc13_4,  4
			jmp      code_2411
code_2406:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2411:
			toss    
			ret     
		)
	)
)

(instance cart of Feature
	(properties
		x 93
		y 176
		nsTop 163
		nsLeft 57
		nsBottom 189
		nsRight 130
		sightAngle 90
		onMeCheck $0004
		approachX 111
		approachY 173
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_246e
			pushi    2
			pushi    1310
			pushi    108
			calle    proc13_4,  4
			jmp      code_248d
code_246e:
			dup     
			ldi      3
			eq?     
			bnt      code_2482
			pushi    2
			pushi    1310
			pushi    109
			calle    proc13_4,  4
			jmp      code_248d
code_2482:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_248d:
			toss    
			ret     
		)
	)
)

(instance mule of Feature
	(properties
		x 168
		y 273
		z 100
		nsTop 157
		nsLeft 146
		nsBottom 189
		nsRight 190
		sightAngle 90
		onMeCheck $0004
		approachX 172
		approachY 184
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_24ea
			pushi    2
			pushi    1310
			pushi    110
			calle    proc13_4,  4
			jmp      code_2533
code_24ea:
			dup     
			ldi      5
			eq?     
			bnt      code_2512
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1310
			pushi    111
			pushi    80
			lofsa    {Francis the Mule}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2533
code_2512:
			dup     
			ldi      3
			eq?     
			bnt      code_2528
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_2533
code_2528:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2533:
			toss    
			ret     
		)
	)
)

(instance badMonk of Actor
	(properties
		x 325
		y 110
		signal $4800
	)
)

(instance sheriffMan1 of Actor
	(properties
		x -11
		y 175
		view 750
		signal $4800
	)
	
	(method (cue)
		(asm
			pushi    #cue
			pushi    0
			super    Actor,  4
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			self     12
			ret     
		)
	)
)

(instance sheriffMan2 of Actor
	(properties
		x -16
		y 162
		view 750
		signal $4800
	)
	
	(method (cue)
		(asm
			pushi    #cue
			pushi    0
			super    Actor,  4
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			self     12
			ret     
		)
	)
)

(instance sExitSouth of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2793
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      187
			gt?     
			bnt      code_276f
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      60
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_27a5
code_276f:
			pushi    283
			pushi    #x
			class    MoveTo
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
			ldi      60
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_27a5
code_2793:
			dup     
			ldi      1
			eq?     
			bnt      code_27a5
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
code_27a5:
			toss    
			ret     
		)
	)
)

(instance sMonk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_27f5
			ldi      5
			aTop     seconds
			jmp      code_291e
code_27f5:
			dup     
			ldi      1
			eq?     
			bnt      code_2862
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    203
			pushi    157
			pushSelf
			lofsa    badMonk
			send     18
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    145
			pushi    #y
			pushi    0
			lofsa    sheriffMan1
			send     4
			push    
			lofsa    sheriffMan1
			push    
			lofsa    sheriffMan1
			send     18
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    164
			pushi    #y
			pushi    0
			lofsa    sheriffMan2
			send     4
			push    
			lofsa    sheriffMan2
			push    
			lofsa    sheriffMan2
			send     18
			jmp      code_291e
code_2862:
			dup     
			ldi      2
			eq?     
			bnt      code_28cd
			pushi    #setCel
			pushi    1
			pushi    0
			lofsa    badMonk
			send     6
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      198
			lt?     
			bnt      code_28c5
			pushi    0
			callb    proc0_3,  0
			pushi    #setHeading
			pushi    1
			pushi    315
			lag      global0
			send     6
			lsg      global126
			ldi      5
			eq?     
			bnt      code_28af
			pushi    6
			pushi    1
			lea      @local20
			push    
			pushi    10
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_291e
code_28af:
			pushi    6
			pushi    1
			lea      @local28
			push    
			pushi    11
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_291e
code_28c5:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_291e
code_28cd:
			dup     
			ldi      3
			eq?     
			bnt      code_2908
			lsg      global126
			ldi      5
			eq?     
			bnt      code_28f2
			pushi    6
			pushi    1
			lea      @local24
			push    
			pushi    10
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_291e
code_28f2:
			pushi    6
			pushi    1
			lea      @local32
			push    
			pushi    11
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_291e
code_2908:
			dup     
			ldi      4
			eq?     
			bnt      code_291e
			ldi      4
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_291e:
			toss    
			ret     
		)
	)
)

(instance sRandom of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_29da
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2980
			pushi    #changeState
			pushi    1
			pushi    5
			self     6
			jmp      code_29d6
code_2980:
			dup     
			ldi      1
			eq?     
			bnt      code_2992
			pushi    #changeState
			pushi    1
			pushi    10
			self     6
			jmp      code_29d6
code_2992:
			dup     
			ldi      2
			eq?     
			bnt      code_29a4
			pushi    #changeState
			pushi    1
			pushi    15
			self     6
			jmp      code_29d6
code_29a4:
			dup     
			ldi      3
			eq?     
			bnt      code_29b6
			pushi    #changeState
			pushi    1
			pushi    20
			self     6
			jmp      code_29d6
code_29b6:
			dup     
			ldi      4
			eq?     
			bnt      code_29c8
			pushi    #changeState
			pushi    1
			pushi    40
			self     6
			jmp      code_29d6
code_29c8:
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     ticks
code_29d6:
			toss    
			jmp      code_2bf4
code_29da:
			dup     
			ldi      5
			eq?     
			bnt      code_29fc
			pushi    #startUpd
			pushi    0
			pushi    288
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			lofsa    rugHead
			send     10
			ldi      2
			aTop     cycles
			jmp      code_2bf4
code_29fc:
			dup     
			ldi      6
			eq?     
			bnt      code_2a1d
			pushi    #stopUpd
			pushi    0
			lofsa    rugHead
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2bf4
code_2a1d:
			dup     
			ldi      10
			eq?     
			bnt      code_2a45
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    30
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    rugArm1
			send     18
			jmp      code_2bf4
code_2a45:
			dup     
			ldi      11
			eq?     
			bnt      code_2a69
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    30
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    rugArm1
			send     14
			jmp      code_2bf4
code_2a69:
			dup     
			ldi      12
			eq?     
			bnt      code_2a8a
			pushi    #stopUpd
			pushi    0
			lofsa    rugArm1
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2bf4
code_2a8a:
			dup     
			ldi      15
			eq?     
			bnt      code_2ab2
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    30
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    rugArm2
			send     18
			jmp      code_2bf4
code_2ab2:
			dup     
			ldi      16
			eq?     
			bnt      code_2ad6
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    30
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    rugArm2
			send     14
			jmp      code_2bf4
code_2ad6:
			dup     
			ldi      17
			eq?     
			bnt      code_2af7
			pushi    #stopUpd
			pushi    0
			lofsa    rugArm2
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2bf4
code_2af7:
			dup     
			ldi      20
			eq?     
			bnt      code_2b19
			pushi    #startUpd
			pushi    0
			pushi    288
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			lofsa    coryHead
			send     10
			ldi      2
			aTop     cycles
			jmp      code_2bf4
code_2b19:
			dup     
			ldi      21
			eq?     
			bnt      code_2b3a
			pushi    #stopUpd
			pushi    0
			lofsa    coryHead
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2bf4
code_2b3a:
			dup     
			ldi      25
			eq?     
			bnt      code_2b62
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			lofsa    ear1
			send     6
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2bf4
code_2b62:
			dup     
			ldi      30
			eq?     
			bnt      code_2b8a
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			lofsa    ear2
			send     6
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2bf4
code_2b8a:
			dup     
			ldi      40
			eq?     
			bnt      code_2bb2
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    30
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    gameArm
			send     18
			jmp      code_2bf4
code_2bb2:
			dup     
			ldi      41
			eq?     
			bnt      code_2bd6
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    30
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    gameArm
			send     14
			jmp      code_2bf4
code_2bd6:
			dup     
			ldi      42
			eq?     
			bnt      code_2bf4
			pushi    #stopUpd
			pushi    0
			lofsa    gameArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
code_2bf4:
			toss    
			ret     
		)
	)
)

(instance sEnter of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2c43
			ldi      2
			aTop     cycles
			jmp      code_2cd7
code_2c43:
			dup     
			ldi      1
			eq?     
			bnt      code_2c72
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    195
			pushi    185
			pushSelf
			lag      global0
			send     12
			pushi    #number
			pushi    1
			pushi    280
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			jmp      code_2cd7
code_2c72:
			dup     
			ldi      2
			eq?     
			bnt      code_2cc1
			pushi    3
			lsg      global126
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_2cb5
			pushi    #canControl
			pushi    1
			pushi    1
			pushi    324
			pushi    1
			pushi    1
			class    User
			send     12
			pushi    #enable
			pushi    1
			pushi    0
			pushi    206
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			push    
			lag      global69
			send     12
			ldi      2
			aTop     cycles
			jmp      code_2cd7
code_2cb5:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2cd7
code_2cc1:
			dup     
			ldi      3
			eq?     
			bnt      code_2cd7
			pushi    #setCursor
			pushi    2
			pushi    0
			pushi    1
			lag      global1
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_2cd7:
			toss    
			ret     
		)
	)
)

(instance sExitWest of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2d3e
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    65521
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2d65
code_2d3e:
			dup     
			ldi      1
			eq?     
			bnt      code_2d65
			pushi    #walkingOut
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_2d5f
			pushi    #newRoom
			pushi    1
			pushi    300
			lag      global2
			send     6
			jmp      code_2d65
code_2d5f:
			dpToa    state
			ldi      1
			aTop     cycles
code_2d65:
			toss    
			ret     
		)
	)
)

(instance person55 of Feature
	(properties
		x 52
		y 87
		z 30
		nsTop 47
		nsLeft 41
		nsBottom 67
		nsRight 63
		sightAngle 90
		onMeCheck $0008
		approachX 24
		approachY 58
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_2dba
			pushi    3
			pushi    1310
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_2dc5
code_2dba:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2dc5:
			toss    
			ret     
		)
	)
)
