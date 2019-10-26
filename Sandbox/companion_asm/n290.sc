;;; Sierra Script 1.0 - (do not remove this comment)
(script# 290)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n812)
(use n851)
(use n860)
(use n945)
(use n946)
(use n992)
(use n998)
(use n999)

(public
	rm290 0
)

(local
	local0
	[local1 5] = [1290 10 1 2]
	[local6 12] = [1290 13 1 1 1 1 1 2 2 2 1]
	[local18 8] = [1290 25 1 2 1 2 1]
	[local26 5] = [1290 44 1 2]
	[local31 6] = [1290 46 1 2 2]
	[local37 12] = [1290 57 1 2 2 2 1 2 2 2 1]
	[local49 6] = [1290 69 1 2 1]
	[local55 8] = [1290 73 1 2 2 2 1]
	[local63 7] = [1290 89 1 2 2 2]
	[local70 9] = [1290 106 1 2 2 1 2 2]
	[local79 7] = [1290 114 1 2 1 2]
	[local86 11] = [1290 121 1 2 2 2 2 1 2 1]
	[local97 6] = [1290 130 1 2 2]
	[local103 8] = [1290 137 1 1 1 1 2]
	[local111 8] = [1290 145 2 2 1 2 2]
	[local119 7] = [1290 95 2 1 2 2]
	[local126 7] = [1290 99 1 2 1 2]
	[local133 3] = [-1 13056 21]
	[local136 3] = [-1 13067 21]
	[local139 3] = [-1 13077 21]
	[local142 3] = [-1 13094 21]
	[local145 3] = [-1 13114 21]
	[local148 3] = [-1 13128 21]
	[local151 3] = [-1 13138 21]
	[local154 3] = [-1 13150 21]
	[local157 3] = [-1 13171 21]
	[local160 3] = [-1 13178 21]
	[local163 3] = [-1 13189 21]
	[local166 3] = [-1 13203 21]
	[local169 3] = [-1 13218 21]
	[local172 3] = [-1 13231 21]
)
(instance rm290 of StdRoom
	(properties
		picture 290
		style $0064
		north 260
		east 300
		south 260
		west 280
	)
	
	(method (init)
		(asm
			pushi    #setRegions
			pushi    1
			pushi    311
			self     6
			pushi    0
			calle    proc311_3,  0
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    table1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    wall
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    barrel1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    table2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    crate
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    rugs1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    rugs2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    barrels2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person3
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person13
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person23
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person24
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person25
			send     10
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_028c
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    tail
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    sRandom
			push    
			pushi    281
			pushi    1
			pushi    0
			lofsa    pigarm
			send     16
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    carm1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    carm2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    head
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    doom
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    arm
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person4
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person5
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person6
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person7
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person8
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person9
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person10
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person11
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person12
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person14
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person15
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person16
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person17
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person18
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person19
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person20
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person21
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person22
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person26
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person27
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person28
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    stall
			send     10
			jmp      code_0447
code_028c:
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    4
			lofsa    tail
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    sRandom
			push    
			pushi    281
			pushi    1
			pushi    5
			lofsa    pigarm
			send     16
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    doom
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    arm
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    head
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    carm1
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    carm2
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person4
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person5
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person6
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person7
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person8
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person9
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person10
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person11
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person12
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person14
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person15
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person16
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person17
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person18
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    3
			lofsa    person19
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    3
			lofsa    person20
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person21
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person22
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person26
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    4
			pushi    5
			lofsa    person27
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person28
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    stall
			send     10
code_0447:
			pushi    #boughtRoseOil
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_0460
			pushi    #setPri
			pushi    1
			pushi    13
			pushi    107
			pushi    0
			lofsa    bottle
			send     10
code_0460:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_05d0
			pushi    #addObstacle
			pushi    6
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    0
			pushi    65535
			pushi    319
			pushi    0
			pushi    319
			pushi    110
			pushi    311
			pushi    110
			pushi    284
			pushi    125
			pushi    203
			pushi    125
			pushi    191
			pushi    104
			pushi    32
			pushi    104
			pushi    30
			pushi    110
			pushi    0
			pushi    110
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    16
			pushi    0
			pushi    182
			pushi    164
			pushi    182
			pushi    180
			pushi    175
			pushi    244
			pushi    175
			pushi    268
			pushi    163
			pushi    319
			pushi    163
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    229
			pushi    127
			pushi    290
			pushi    127
			pushi    304
			pushi    139
			pushi    226
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
			pushi    10
			pushi    319
			pushi    130
			pushi    304
			pushi    130
			pushi    294
			pushi    124
			pushi    305
			pushi    117
			pushi    319
			pushi    117
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    319
			pushi    160
			pushi    259
			pushi    160
			pushi    259
			pushi    155
			pushi    319
			pushi    155
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
			pushi    22
			pushi    12
			pushi    131
			pushi    35
			pushi    131
			pushi    55
			pushi    114
			pushi    173
			pushi    115
			pushi    199
			pushi    141
			pushi    231
			pushi    141
			pushi    231
			pushi    155
			pushi    138
			pushi    155
			pushi    124
			pushi    149
			pushi    12
			pushi    149
			pushi    8
			pushi    140
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			self     16
			jmp      code_0694
code_05d0:
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    25
			pushi    257
			pushi    25
			pushi    245
			pushi    39
			pushi    176
			pushi    39
			pushi    152
			pushi    32
			pushi    158
			pushi    44
			pushi    91
			pushi    44
			pushi    19
			pushi    58
			pushi    0
			pushi    46
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
			pushi    8
			pushi    294
			pushi    42
			pushi    264
			pushi    42
			pushi    260
			pushi    34
			pushi    293
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
			pushi    0
			pushi    78
			pushi    319
			pushi    78
			pushi    319
			pushi    189
			pushi    0
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
			pushi    319
			pushi    57
			pushi    298
			pushi    57
			pushi    298
			pushi    49
			pushi    319
			pushi    49
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     12
code_0694:
			lag      global198
			not     
			bt       code_06a0
			lsg      global198
			ldi      270
			gt?     
code_06a0:
			bnt      code_06af
			pushi    #init
			pushi    0
			pushi    1
			pushi    316
			callk    ScriptID,  2
			send     4
code_06af:
			lsg      global12
			pToa     west
			eq?     
			bnt      code_06fa
			ldi      12
			aTop     style
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      180
			gt?     
			bnt      code_06d4
			pushi    #y
			pushi    1
			pushi    180
			lag      global0
			send     6
code_06d4:
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
			jmp      code_074b
code_06fa:
			lsg      global12
			pToa     east
			eq?     
			bnt      code_0745
			ldi      11
			aTop     style
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      155
			gt?     
			bnt      code_071f
			pushi    #y
			pushi    1
			pushi    165
			lag      global0
			send     6
code_071f:
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      320
			add     
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
			jmp      code_074b
code_0745:
			pushi    #init
			pushi    0
			super    StdRoom,  4
code_074b:
			pushi    0
			callb    proc0_4,  0
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_0758
			jmp      code_0799
code_0758:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_077a
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitEast
			push    
			lag      global2
			send     6
			jmp      code_0799
code_077a:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0799
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitWest
			push    
			lag      global2
			send     6
code_0799:
			pushi    #doit
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
)

(instance person1 of FairFeature
	(properties
		x 13
		y 12
		nsTop -1
		nsLeft 7
		nsBottom 25
		nsRight 20
		sightAngle 90
		approachX 20
		approachY 58
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0804
			pushi    2
			pushi    1290
			pushi    9
			calle    proc13_4,  4
			jmp      code_085e
code_0804:
			dup     
			ldi      5
			eq?     
			bnt      code_083d
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0826
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_085e
code_0826:
			pushi    5
			lea      @local1
			push    
			pushi    6
			lea      @local133
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_085e
code_083d:
			dup     
			ldi      3
			eq?     
			bnt      code_0853
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_085e
code_0853:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_085e:
			toss    
			ret     
		)
	)
)

(instance person2 of FairFeature
	(properties
		x 44
		y 12
		nsTop -1
		nsLeft 36
		nsBottom 25
		nsRight 53
		sightAngle 90
		approachX 20
		approachY 58
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_08ba
			pushi    2
			pushi    1290
			pushi    12
			calle    proc13_4,  4
			jmp      code_0914
code_08ba:
			dup     
			ldi      5
			eq?     
			bnt      code_08f3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_08dc
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_0914
code_08dc:
			pushi    5
			lea      @local6
			push    
			lea      @local136
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0914
code_08f3:
			dup     
			ldi      3
			eq?     
			bnt      code_0909
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0914
code_0909:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0914:
			toss    
			ret     
		)
	)
)

(instance person3 of FairFeature
	(properties
		x 64
		y 50
		nsTop 36
		nsLeft 49
		nsBottom 65
		nsRight 79
		sightAngle 90
		approachX 63
		approachY 64
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0970
			pushi    2
			pushi    1290
			pushi    22
			calle    proc13_4,  4
			jmp      code_09a7
code_0970:
			dup     
			ldi      5
			eq?     
			bnt      code_0986
			pushi    3
			pushi    1290
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_09a7
code_0986:
			dup     
			ldi      3
			eq?     
			bnt      code_099c
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_09a7
code_099c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_09a7:
			toss    
			ret     
		)
	)
)

(instance person4 of FairFeature
	(properties
		x 91
		y 19
		nsTop -1
		nsLeft 79
		nsBottom 39
		nsRight 104
		sightAngle 90
		onMeCheck $0004
		approachX 89
		approachY 54
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a04
			pushi    2
			pushi    1290
			pushi    23
			calle    proc13_4,  4
			jmp      code_0a3b
code_0a04:
			dup     
			ldi      5
			eq?     
			bnt      code_0a1a
			pushi    3
			pushi    1290
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a3b
code_0a1a:
			dup     
			ldi      3
			eq?     
			bnt      code_0a30
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a3b
code_0a30:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0a3b:
			toss    
			ret     
		)
	)
)

(instance person5 of FairFeature
	(properties
		x 105
		y 18
		nsLeft 93
		nsBottom 37
		nsRight 122
		sightAngle 90
		approachX 89
		approachY 54
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a98
			pushi    2
			pushi    1290
			pushi    24
			calle    proc13_4,  4
			jmp      code_0af2
code_0a98:
			dup     
			ldi      5
			eq?     
			bnt      code_0ad1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0aba
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_0af2
code_0aba:
			pushi    5
			lea      @local18
			push    
			pushi    6
			lea      @local139
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0af2
code_0ad1:
			dup     
			ldi      3
			eq?     
			bnt      code_0ae7
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0af2
code_0ae7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0af2:
			toss    
			ret     
		)
	)
)

(instance person6 of FairFeature
	(properties
		x 139
		y 20
		nsTop -1
		nsLeft 126
		nsBottom 41
		nsRight 152
		sightAngle 90
		approachX 113
		approachY 43
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b4e
			pushi    2
			pushi    1290
			pushi    31
			calle    proc13_4,  4
			jmp      code_0bb2
code_0b4e:
			dup     
			ldi      5
			eq?     
			bnt      code_0b91
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0b70
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_0bb2
code_0b70:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    32
			pushi    80
			lofsa    {Mistress Baker}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0bb2
code_0b91:
			dup     
			ldi      3
			eq?     
			bnt      code_0ba7
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bb2
code_0ba7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0bb2:
			toss    
			ret     
		)
	)
)

(instance person7 of FairFeature
	(properties
		x 173
		y 17
		nsTop -1
		nsLeft 163
		nsBottom 36
		nsRight 184
		sightAngle 90
		approachX 169
		approachY 39
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c0e
			pushi    2
			pushi    1290
			pushi    33
			calle    proc13_4,  4
			jmp      code_0cc3
code_0c0e:
			dup     
			ldi      5
			eq?     
			bnt      code_0c51
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0c30
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_0cc3
code_0c30:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    34
			pushi    80
			lofsa    {Todd Powers}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0cc3
code_0c51:
			dup     
			ldi      4
			eq?     
			bnt      code_0ca2
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0c93
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    35
			pushi    80
			lofsa    {Todd Powers}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1290
			pushi    36
			pushi    80
			lofsa    {Todd Powers}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0c9e
code_0c93:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0c9e:
			toss    
			jmp      code_0cc3
code_0ca2:
			dup     
			ldi      3
			eq?     
			bnt      code_0cb8
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0cc3
code_0cb8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0cc3:
			toss    
			ret     
		)
	)
)

(instance person8 of FairFeature
	(properties
		x 192
		y 19
		nsTop 1
		nsLeft 182
		nsBottom 37
		nsRight 202
		sightAngle 90
		approachX 182
		approachY 43
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d20
			pushi    2
			pushi    1290
			pushi    37
			calle    proc13_4,  4
			jmp      code_0dc4
code_0d20:
			dup     
			ldi      5
			eq?     
			bnt      code_0d63
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0d42
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_0dc4
code_0d42:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    38
			pushi    80
			lofsa    {Robert of Mallory}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0dc4
code_0d63:
			dup     
			ldi      4
			eq?     
			bnt      code_0da3
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0d94
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    39
			pushi    80
			lofsa    {Robert of Mallory}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0d9f
code_0d94:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0d9f:
			toss    
			jmp      code_0dc4
code_0da3:
			dup     
			ldi      3
			eq?     
			bnt      code_0db9
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0dc4
code_0db9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0dc4:
			toss    
			ret     
		)
	)
)

(instance person9 of FairFeature
	(properties
		x 209
		y 19
		nsTop 2
		nsLeft 201
		nsBottom 36
		nsRight 218
		sightAngle 90
		approachX 209
		approachY 43
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e20
			pushi    2
			pushi    1290
			pushi    40
			calle    proc13_4,  4
			jmp      code_0ec4
code_0e20:
			dup     
			ldi      5
			eq?     
			bnt      code_0e63
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0e42
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_0ec4
code_0e42:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    41
			pushi    80
			lofsa    {Sir Brian de Hughes}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0ec4
code_0e63:
			dup     
			ldi      4
			eq?     
			bnt      code_0ea3
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0e94
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    42
			pushi    80
			lofsa    {Sir Brian de Hughes}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0e9f
code_0e94:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0e9f:
			toss    
			jmp      code_0ec4
code_0ea3:
			dup     
			ldi      3
			eq?     
			bnt      code_0eb9
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ec4
code_0eb9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0ec4:
			toss    
			ret     
		)
	)
)

(instance person10 of FairFeature
	(properties
		x 235
		y 18
		nsTop 1
		nsLeft 220
		nsBottom 36
		nsRight 245
		sightAngle 90
		onMeCheck $0004
		approachX 225
		approachY 41
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f20
			pushi    2
			pushi    1290
			pushi    43
			calle    proc13_4,  4
			jmp      code_1003
code_0f20:
			dup     
			ldi      5
			eq?     
			bnt      code_0fa6
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0f42
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1003
code_0f42:
			pushi    #doneGambled
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_0f6e
			pushi    5
			lea      @local26
			push    
			pushi    6
			lea      @local142
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    #doneGambled
			pushi    1
			pushi    1
			class    Fair
			send     6
			jmp      code_1003
code_0f6e:
			pushi    #firstAfterGambling
			pushi    0
			class    Fair
			send     4
			bnt      code_0f99
			pushi    5
			lea      @local31
			push    
			pushi    6
			lea      @local142
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    #firstAfterGambling
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_1003
code_0f99:
			pushi    2
			pushi    1290
			pushi    49
			calle    proc13_4,  4
			jmp      code_1003
code_0fa6:
			dup     
			ldi      4
			eq?     
			bnt      code_0fe2
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0fd3
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_0fde
			pushi    #setScript
			pushi    1
			lofsa    gamble
			push    
			lag      global0
			send     6
			jmp      code_0fde
code_0fd3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0fde:
			toss    
			jmp      code_1003
code_0fe2:
			dup     
			ldi      3
			eq?     
			bnt      code_0ff8
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1003
code_0ff8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1003:
			toss    
			ret     
		)
	)
)

(instance person11 of FairFeature
	(properties
		x 239
		y 17
		nsLeft 230
		nsBottom 34
		nsRight 249
		sightAngle 90
		approachX 249
		approachY 40
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1060
			pushi    2
			pushi    1290
			pushi    54
			calle    proc13_4,  4
			jmp      code_10c4
code_1060:
			dup     
			ldi      5
			eq?     
			bnt      code_10a3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_1082
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_10c4
code_1082:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    55
			pushi    80
			lofsa    {Mistress Goff}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_10c4
code_10a3:
			dup     
			ldi      3
			eq?     
			bnt      code_10b9
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_10c4
code_10b9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_10c4:
			toss    
			ret     
		)
	)
)

(instance person12 of FairFeature
	(properties
		x 272
		y 22
		nsLeft 261
		nsBottom 44
		nsRight 284
		sightAngle 90
		approachX 249
		approachY 40
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1120
			pushi    2
			pushi    1290
			pushi    56
			calle    proc13_4,  4
			jmp      code_119b
code_1120:
			dup     
			ldi      5
			eq?     
			bnt      code_117a
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_1142
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_119b
code_1142:
			pushi    #firstCricket
			pushi    0
			class    Fair
			send     4
			bnt      code_116d
			pushi    5
			lea      @local37
			push    
			pushi    6
			lea      @local145
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    #firstCricket
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_119b
code_116d:
			pushi    2
			pushi    1290
			pushi    66
			calle    proc13_4,  4
			jmp      code_119b
code_117a:
			dup     
			ldi      3
			eq?     
			bnt      code_1190
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_119b
code_1190:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_119b:
			toss    
			ret     
		)
	)
)

(instance person13 of FairFeature
	(properties
		x 218
		y 57
		nsTop 50
		nsLeft 200
		nsBottom 64
		nsRight 237
		sightAngle 90
		approachX 223
		approachY 63
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11f8
			pushi    2
			pushi    1290
			pushi    67
			calle    proc13_4,  4
			jmp      code_122e
code_11f8:
			dup     
			ldi      5
			eq?     
			bnt      code_120d
			pushi    3
			pushi    1290
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_122e
code_120d:
			dup     
			ldi      3
			eq?     
			bnt      code_1223
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_122e
code_1223:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_122e:
			toss    
			ret     
		)
	)
)

(instance person14 of FairFeature
	(properties
		x 250
		y 92
		z 40
		nsTop 40
		nsLeft 242
		nsBottom 65
		nsRight 259
		sightAngle 90
		approachX 246
		approachY 76
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_128a
			pushi    2
			pushi    1290
			pushi    68
			calle    proc13_4,  4
			jmp      code_12e4
code_128a:
			dup     
			ldi      5
			eq?     
			bnt      code_12c3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_12ac
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_12e4
code_12ac:
			pushi    5
			lea      @local49
			push    
			pushi    6
			lea      @local148
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_12e4
code_12c3:
			dup     
			ldi      3
			eq?     
			bnt      code_12d9
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_12e4
code_12d9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_12e4:
			toss    
			ret     
		)
	)
)

(instance person15 of FairFeature
	(properties
		x 287
		y 91
		z 40
		nsTop 39
		nsLeft 278
		nsBottom 64
		nsRight 296
		sightAngle 90
		approachX 282
		approachY 72
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1340
			pushi    2
			pushi    1290
			pushi    72
			calle    proc13_4,  4
			jmp      code_139a
code_1340:
			dup     
			ldi      5
			eq?     
			bnt      code_1379
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_1362
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_139a
code_1362:
			pushi    5
			lea      @local55
			push    
			pushi    6
			lea      @local151
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_139a
code_1379:
			dup     
			ldi      3
			eq?     
			bnt      code_138f
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_139a
code_138f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_139a:
			toss    
			ret     
		)
	)
)

(instance person16 of FairFeature
	(properties
		x 43
		y 117
		nsTop 95
		nsLeft 30
		nsBottom 140
		nsRight 56
		sightAngle 90
		approachX 76
		approachY 151
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_13f6
			pushi    2
			pushi    1290
			pushi    78
			calle    proc13_4,  4
			jmp      code_14f6
code_13f6:
			dup     
			ldi      5
			eq?     
			bnt      code_146d
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1418
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_14f6
code_1418:
			pushi    #firstChristy
			pushi    0
			class    Fair
			send     4
			bnt      code_143b
			pushi    #setScript
			pushi    1
			lofsa    christy
			push    
			lag      global0
			send     6
			pushi    #firstChristy
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_14f6
code_143b:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    84
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1290
			pushi    85
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14f6
code_146d:
			dup     
			ldi      4
			eq?     
			bnt      code_14d5
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_149e
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    86
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14d1
code_149e:
			dup     
			ldi      17
			eq?     
			bnt      code_14c6
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    87
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_14d1
code_14c6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_14d1:
			toss    
			jmp      code_14f6
code_14d5:
			dup     
			ldi      3
			eq?     
			bnt      code_14eb
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_14f6
code_14eb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_14f6:
			toss    
			ret     
		)
	)
)

(instance person17 of FairProp
	(properties
		x 142
		y 142
		z 30
		approachX 105
		approachY 151
		view 290
		priority 10
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1552
			pushi    2
			pushi    1290
			pushi    88
			calle    proc13_4,  4
			jmp      code_1661
code_1552:
			dup     
			ldi      5
			eq?     
			bnt      code_15b8
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1574
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1661
code_1574:
			pushi    #boughtRoseOil
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_1597
			pushi    5
			lea      @local63
			push    
			pushi    6
			lea      @local154
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1661
code_1597:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    93
			pushi    80
			lofsa    {Hippocrates Socrates}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1661
code_15b8:
			dup     
			ldi      4
			eq?     
			bnt      code_1640
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1631
			pushi    #boughtRoseOil
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_1624
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      8
			lt?     
			bnt      code_160b
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    94
			pushi    80
			lofsa    {Hippocrates Socrates}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_163c
code_160b:
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    pigarm
			send     6
			pushi    #setScript
			pushi    1
			lofsa    buyOil
			push    
			lag      global2
			send     6
			jmp      code_163c
code_1624:
			pushi    2
			pushi    1290
			pushi    103
			calle    proc13_4,  4
			jmp      code_163c
code_1631:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_163c:
			toss    
			jmp      code_1661
code_1640:
			dup     
			ldi      3
			eq?     
			bnt      code_1656
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1661
code_1656:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_1661:
			toss    
			ret     
		)
	)
)

(instance person18 of FairFeature
	(properties
		x 166
		y 127
		nsTop 102
		nsLeft 156
		nsBottom 153
		nsRight 176
		sightAngle 90
		approachX 137
		approachY 159
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_16e8
			pushi    2
			pushi    1290
			pushi    104
			calle    proc13_4,  4
			jmp      code_1740
code_16e8:
			dup     
			ldi      5
			eq?     
			bnt      code_1721
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_170a
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1740
code_170a:
			pushi    5
			lea      @local70
			push    
			pushi    6
			lea      @local157
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1740
code_1721:
			dup     
			ldi      3
			eq?     
			bnt      code_1735
			pushi    2
			pushi    1290
			pushi    105
			calle    proc13_4,  4
			jmp      code_1740
code_1735:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1740:
			toss    
			ret     
		)
	)
)

(instance person19 of FairFeature
	(properties
		x 217
		y 138
		nsTop 123
		nsLeft 208
		nsBottom 153
		nsRight 227
		sightAngle 90
		approachX 195
		approachY 158
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_179c
			pushi    2
			pushi    1290
			pushi    112
			calle    proc13_4,  4
			jmp      code_1808
code_179c:
			dup     
			ldi      5
			eq?     
			bnt      code_17d5
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_17be
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1808
code_17be:
			pushi    5
			lea      @local79
			push    
			pushi    6
			lea      @local160
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1808
code_17d5:
			dup     
			ldi      3
			eq?     
			bnt      code_17fd
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    113
			pushi    80
			lofsa    {Ugly Child}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1808
code_17fd:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1808:
			toss    
			ret     
		)
	)
)

(instance person20 of FairFeature
	(properties
		x 265
		y 132
		nsTop 125
		nsLeft 233
		nsBottom 139
		nsRight 298
		sightAngle 90
		approachX 226
		approachY 131
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1864
			pushi    2
			pushi    1290
			pushi    118
			calle    proc13_4,  4
			jmp      code_1897
code_1864:
			dup     
			ldi      3
			eq?     
			bnt      code_1878
			pushi    2
			pushi    1290
			pushi    119
			calle    proc13_4,  4
			jmp      code_1897
code_1878:
			dup     
			ldi      5
			eq?     
			bnt      code_188c
			pushi    2
			pushi    1290
			pushi    8
			calle    proc13_4,  4
			jmp      code_1897
code_188c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1897:
			toss    
			ret     
		)
	)
)

(instance person21 of FairFeature
	(properties
		x 259
		y 102
		z 10
		nsTop 76
		nsLeft 245
		nsBottom 109
		nsRight 274
		sightAngle 90
		approachX 249
		approachY 116
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_18f4
			pushi    2
			pushi    1290
			pushi    120
			calle    proc13_4,  4
			jmp      code_194e
code_18f4:
			dup     
			ldi      5
			eq?     
			bnt      code_192d
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1916
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_194e
code_1916:
			pushi    5
			lea      @local86
			push    
			pushi    6
			lea      @local163
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_194e
code_192d:
			dup     
			ldi      3
			eq?     
			bnt      code_1943
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_194e
code_1943:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_194e:
			toss    
			ret     
		)
	)
)

(instance person22 of FairFeature
	(properties
		x 307
		y 103
		nsTop 79
		nsLeft 298
		nsBottom 128
		nsRight 316
		sightAngle 90
		approachX 285
		approachY 125
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_19ab
			pushi    2
			pushi    1290
			pushi    129
			calle    proc13_4,  4
			jmp      code_1a05
code_19ab:
			dup     
			ldi      5
			eq?     
			bnt      code_19e4
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_19cd
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1a05
code_19cd:
			pushi    5
			lea      @local97
			push    
			pushi    6
			lea      @local166
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1a05
code_19e4:
			dup     
			ldi      3
			eq?     
			bnt      code_19fa
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a05
code_19fa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1a05:
			toss    
			ret     
		)
	)
)

(instance person23 of FairFeature
	(properties
		x 11
		y 273
		z 100
		nsTop 157
		nsBottom 189
		nsRight 23
		sightAngle 90
		approachX 23
		approachY 177
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a63
			pushi    2
			pushi    1290
			pushi    133
			calle    proc13_4,  4
			jmp      code_1a9a
code_1a63:
			dup     
			ldi      5
			eq?     
			bnt      code_1a79
			pushi    3
			pushi    1290
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a9a
code_1a79:
			dup     
			ldi      3
			eq?     
			bnt      code_1a8f
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a9a
code_1a8f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1a9a:
			toss    
			ret     
		)
	)
)

(instance person24 of FairFeature
	(properties
		x 49
		y 268
		z 100
		nsTop 148
		nsLeft 26
		nsBottom 189
		nsRight 73
		sightAngle 90
		approachX 23
		approachY 177
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1af7
			pushi    2
			pushi    1290
			pushi    134
			calle    proc13_4,  4
			jmp      code_1b2e
code_1af7:
			dup     
			ldi      5
			eq?     
			bnt      code_1b0d
			pushi    3
			pushi    1290
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_1b2e
code_1b0d:
			dup     
			ldi      3
			eq?     
			bnt      code_1b23
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1b2e
code_1b23:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1b2e:
			toss    
			ret     
		)
	)
)

(instance person25 of FairFeature
	(properties
		x 129
		y 283
		z 100
		nsTop 178
		nsLeft 114
		nsBottom 189
		nsRight 145
		sightAngle 90
		approachX 113
		approachY 188
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1b8b
			pushi    2
			pushi    1290
			pushi    135
			calle    proc13_4,  4
			jmp      code_1bc2
code_1b8b:
			dup     
			ldi      5
			eq?     
			bnt      code_1ba1
			pushi    3
			pushi    1290
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_1bc2
code_1ba1:
			dup     
			ldi      3
			eq?     
			bnt      code_1bb7
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1bc2
code_1bb7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1bc2:
			toss    
			ret     
		)
	)
)

(instance person26 of FairFeature
	(properties
		x 192
		y 267
		z 100
		nsTop 148
		nsLeft 174
		nsBottom 186
		nsRight 211
		sightAngle 90
		approachX 204
		approachY 176
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1c1f
			pushi    2
			pushi    1290
			pushi    136
			calle    proc13_4,  4
			jmp      code_1c79
code_1c1f:
			dup     
			ldi      5
			eq?     
			bnt      code_1c58
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1c41
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1c79
code_1c41:
			pushi    5
			lea      @local103
			push    
			lea      @local169
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1c79
code_1c58:
			dup     
			ldi      3
			eq?     
			bnt      code_1c6e
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c79
code_1c6e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1c79:
			toss    
			ret     
		)
	)
)

(instance person27 of FairFeature
	(properties
		x 229
		y 274
		z 100
		nsTop 160
		nsLeft 199
		nsBottom 189
		nsRight 260
		sightAngle 90
		approachX 228
		approachY 175
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1cd7
			pushi    2
			pushi    1290
			pushi    142
			calle    proc13_4,  4
			jmp      code_1d47
code_1cd7:
			dup     
			ldi      4
			eq?     
			bnt      code_1d04
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1cf5
			pushi    2
			pushi    1290
			pushi    143
			calle    proc13_4,  4
			jmp      code_1d00
code_1cf5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1d00:
			toss    
			jmp      code_1d47
code_1d04:
			dup     
			ldi      5
			eq?     
			bnt      code_1d26
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    3
			pushi    1290
			pushi    0
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1d47
code_1d26:
			dup     
			ldi      3
			eq?     
			bnt      code_1d3c
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1d47
code_1d3c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1d47:
			toss    
			ret     
		)
	)
)

(instance person28 of FairFeature
	(properties
		x 291
		y 267
		z 100
		nsTop 151
		nsLeft 270
		nsBottom 184
		nsRight 312
		sightAngle 90
		approachX 253
		approachY 165
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1da5
			pushi    2
			pushi    1290
			pushi    144
			calle    proc13_4,  4
			jmp      code_1dff
code_1da5:
			dup     
			ldi      5
			eq?     
			bnt      code_1dde
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1dc7
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_1dff
code_1dc7:
			pushi    5
			lea      @local111
			push    
			pushi    6
			lea      @local172
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_1dff
code_1dde:
			dup     
			ldi      3
			eq?     
			bnt      code_1df4
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1dff
code_1df4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1dff:
			toss    
			ret     
		)
	)
)

(instance table1 of FairFeature
	(properties
		x 297
		y 13
		nsTop 4
		nsLeft 280
		nsBottom 23
		nsRight 315
		sightAngle 90
		approachX 297
		approachY 32
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1e5d
			pushi    2
			pushi    1290
			pushi    150
			calle    proc13_4,  4
			jmp      code_1e68
code_1e5d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1e68:
			toss    
			ret     
		)
	)
)

(instance wall of FairFeature
	(properties
		x 159
		y 81
		nsTop 64
		nsBottom 99
		nsRight 319
		sightAngle 90
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1ec5
			pushi    2
			pushi    1290
			pushi    151
			calle    proc13_4,  4
			jmp      code_1ed0
code_1ec5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1ed0:
			toss    
			ret     
		)
	)
)

(instance barrel1 of FairFeature
	(properties
		x 24
		y 57
		nsTop 52
		nsLeft 4
		nsBottom 63
		nsRight 44
		sightAngle 90
		approachX 16
		approachY 71
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1f2d
			pushi    2
			pushi    1290
			pushi    152
			calle    proc13_4,  4
			jmp      code_1f38
code_1f2d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1f38:
			toss    
			ret     
		)
	)
)

(instance table2 of FairFeature
	(properties
		x 16
		y 95
		nsTop 84
		nsLeft 3
		nsBottom 107
		nsRight 29
		sightAngle 90
		approachX 45
		approachY 108
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1f95
			pushi    2
			pushi    1290
			pushi    153
			calle    proc13_4,  4
			jmp      code_1fa0
code_1f95:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1fa0:
			toss    
			ret     
		)
	)
)

(instance barrels2 of FairFeature
	(properties
		x 79
		y 118
		nsTop 94
		nsLeft 58
		nsBottom 142
		nsRight 101
		sightAngle 90
		approachX 106
		approachY 108
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1ffd
			pushi    2
			pushi    1290
			pushi    154
			calle    proc13_4,  4
			jmp      code_2008
code_1ffd:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2008:
			toss    
			ret     
		)
	)
)

(instance stall of FairFeature
	(properties
		x 152
		y 98
		nsTop 47
		nsLeft 111
		nsBottom 149
		nsRight 193
		sightAngle 90
		approachX 105
		approachY 151
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2065
			pushi    2
			pushi    1290
			pushi    155
			calle    proc13_4,  4
			jmp      code_2099
code_2065:
			dup     
			ldi      3
			eq?     
			bnt      code_208e
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    156
			pushi    80
			lofsa    {Hippocrates Socrates}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2099
code_208e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2099:
			toss    
			ret     
		)
	)
)

(instance crate of FairFeature
	(properties
		x 225
		y 109
		nsTop 96
		nsLeft 207
		nsBottom 122
		nsRight 243
		sightAngle 90
		approachX 207
		approachY 123
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_20f7
			pushi    2
			pushi    1290
			pushi    157
			calle    proc13_4,  4
			jmp      code_2102
code_20f7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2102:
			toss    
			ret     
		)
	)
)

(instance rugs1 of FairFeature
	(properties
		x 281
		y 114
		nsTop 109
		nsLeft 259
		nsBottom 119
		nsRight 303
		sightAngle 90
		approachX 249
		approachY 116
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_215f
			pushi    2
			pushi    1290
			pushi    158
			calle    proc13_4,  4
			jmp      code_216a
code_215f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_216a:
			toss    
			ret     
		)
	)
)

(instance rugs2 of FairFeature
	(properties
		x 289
		y 155
		nsTop 149
		nsLeft 260
		nsBottom 162
		nsRight 318
		sightAngle 90
		approachX 264
		approachY 150
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_21c7
			pushi    2
			pushi    1290
			pushi    159
			calle    proc13_4,  4
			jmp      code_21d2
code_21c7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_21d2:
			toss    
			ret     
		)
	)
)

(instance bottle of View
	(properties
		x 156
		y 83
		view 290
		loop 1
	)
)

(instance doom of FairProp
	(properties
		x 48
		y 105
		z 100
		sightAngle 45
		approachX 20
		approachY 58
		view 290
		loop 2
		priority 1
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_228a
			pushi    2
			pushi    1290
			pushi    12
			calle    proc13_4,  4
			jmp      code_22e4
code_228a:
			dup     
			ldi      5
			eq?     
			bnt      code_22c3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_22ac
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_22e4
code_22ac:
			pushi    5
			lea      @local6
			push    
			lea      @local136
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_22e4
code_22c3:
			dup     
			ldi      3
			eq?     
			bnt      code_22d9
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_22e4
code_22d9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_22e4:
			toss    
			ret     
		)
	)
)

(instance arm of FairProp
	(properties
		x 224
		y 10
		sightAngle 45
		approachX 249
		approachY 40
		view 290
		loop 3
		priority 1
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_236a
			pushi    2
			pushi    1290
			pushi    43
			calle    proc13_4,  4
			jmp      code_2444
code_236a:
			dup     
			ldi      5
			eq?     
			bnt      code_23ee
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_238c
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_2444
code_238c:
			pushi    #doneGambled
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_23b8
			pushi    5
			lea      @local26
			push    
			pushi    6
			lea      @local142
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    #doneGambled
			pushi    1
			pushi    1
			class    Fair
			send     6
			jmp      code_2444
code_23b8:
			pushi    #firstAfterGambling
			pushi    0
			class    Fair
			send     4
			bnt      code_23e1
			pushi    3
			lea      @local31
			push    
			pushi    6
			lea      @local142
			push    
			calle    proc851_0,  6
			pushi    #firstAfterGambling
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_2444
code_23e1:
			pushi    2
			pushi    1290
			pushi    49
			calle    proc13_4,  4
			jmp      code_2444
code_23ee:
			dup     
			ldi      4
			eq?     
			bnt      code_2423
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_2414
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			pushi    #setScript
			pushi    1
			lofsa    gamble
			push    
			lag      global0
			send     6
			jmp      code_241f
code_2414:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_241f:
			toss    
			jmp      code_2444
code_2423:
			dup     
			ldi      3
			eq?     
			bnt      code_2439
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_2444
code_2439:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_2444:
			toss    
			ret     
		)
	)
)

(instance head of FairProp
	(properties
		x 258
		y 106
		z 20
		sightAngle 45
		approachX 249
		approachY 116
		view 290
		loop 4
		priority 7
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_24ca
			pushi    2
			pushi    1290
			pushi    120
			calle    proc13_4,  4
			jmp      code_2524
code_24ca:
			dup     
			ldi      5
			eq?     
			bnt      code_2503
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_24ec
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_2524
code_24ec:
			pushi    5
			lea      @local86
			push    
			pushi    6
			lea      @local163
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_2524
code_2503:
			dup     
			ldi      3
			eq?     
			bnt      code_2519
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_2524
code_2519:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_2524:
			toss    
			ret     
		)
	)
)

(instance carm1 of FairProp
	(properties
		x 36
		y 105
		sightAngle 45
		approachX 76
		approachY 151
		view 290
		loop 5
		priority 10
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_25aa
			pushi    2
			pushi    1290
			pushi    78
			calle    proc13_4,  4
			jmp      code_26aa
code_25aa:
			dup     
			ldi      5
			eq?     
			bnt      code_2621
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_25cc
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_26aa
code_25cc:
			pushi    #firstChristy
			pushi    0
			class    Fair
			send     4
			bnt      code_25ef
			pushi    #setScript
			pushi    1
			lofsa    christy
			push    
			lag      global0
			send     6
			pushi    #firstChristy
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_26aa
code_25ef:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    84
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1290
			pushi    85
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_26aa
code_2621:
			dup     
			ldi      4
			eq?     
			bnt      code_2689
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_2652
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    86
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2685
code_2652:
			dup     
			ldi      17
			eq?     
			bnt      code_267a
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    87
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2685
code_267a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_2685:
			toss    
			jmp      code_26aa
code_2689:
			dup     
			ldi      3
			eq?     
			bnt      code_269f
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_26aa
code_269f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_26aa:
			toss    
			ret     
		)
	)
)

(instance carm2 of FairProp
	(properties
		x 50
		y 105
		sightAngle 45
		approachX 76
		approachY 151
		view 290
		loop 6
		priority 10
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2730
			pushi    2
			pushi    1290
			pushi    78
			calle    proc13_4,  4
			jmp      code_2830
code_2730:
			dup     
			ldi      5
			eq?     
			bnt      code_27a7
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_2752
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_2830
code_2752:
			pushi    #firstChristy
			pushi    0
			class    Fair
			send     4
			bnt      code_2775
			pushi    #setScript
			pushi    1
			lofsa    christy
			push    
			lag      global0
			send     6
			pushi    #firstChristy
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_2830
code_2775:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    84
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1290
			pushi    85
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2830
code_27a7:
			dup     
			ldi      4
			eq?     
			bnt      code_280f
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_27d8
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    86
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_280b
code_27d8:
			dup     
			ldi      17
			eq?     
			bnt      code_2800
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1290
			pushi    87
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_280b
code_2800:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_280b:
			toss    
			jmp      code_2830
code_280f:
			dup     
			ldi      3
			eq?     
			bnt      code_2825
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_2830
code_2825:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_2830:
			toss    
			ret     
		)
	)
)

(instance pigarm of FairProp
	(properties
		x 203
		y 165
		sightAngle 45
		approachX 204
		approachY 176
		view 290
		loop 7
		priority 14
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_28b7
			pushi    2
			pushi    1290
			pushi    136
			calle    proc13_4,  4
			jmp      code_2911
code_28b7:
			dup     
			ldi      5
			eq?     
			bnt      code_28f0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_28d9
			pushi    2
			pushi    1290
			pushi    7
			calle    proc13_4,  4
			jmp      code_2911
code_28d9:
			pushi    5
			lea      @local103
			push    
			lea      @local169
			push    
			pushi    6
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_2911
code_28f0:
			dup     
			ldi      3
			eq?     
			bnt      code_2906
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_2911
code_2906:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_2911:
			toss    
			ret     
		)
	)
)

(instance tail of FairProp
	(properties
		x 257
		y 163
		sightAngle 45
		approachX 204
		approachY 176
		view 290
		loop 8
		priority 14
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2999
			pushi    2
			pushi    1290
			pushi    142
			calle    proc13_4,  4
			jmp      code_29e7
code_2999:
			dup     
			ldi      4
			eq?     
			bnt      code_29c6
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_29b7
			pushi    2
			pushi    1290
			pushi    143
			calle    proc13_4,  4
			jmp      code_29c2
code_29b7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_29c2:
			toss    
			jmp      code_29e7
code_29c6:
			dup     
			ldi      3
			eq?     
			bnt      code_29dc
			pushi    3
			pushi    1290
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_29e7
code_29dc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_29e7:
			toss    
			ret     
		)
	)
)

(instance gamble of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2a7f
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    arm
			send     8
			jmp      code_2b67
code_2a7f:
			dup     
			ldi      1
			eq?     
			bnt      code_2a9b
			pushi    5
			pushi    1290
			pushi    50
			pushSelf
			pushi    80
			lofsa    {Robert of Fischbach}
			push    
			calle    proc13_5,  10
			jmp      code_2b67
code_2a9b:
			dup     
			ldi      2
			eq?     
			bnt      code_2ab2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    arm
			send     8
			jmp      code_2b67
code_2ab2:
			dup     
			ldi      3
			eq?     
			bnt      code_2ace
			pushi    5
			pushi    1290
			pushi    51
			pushSelf
			pushi    80
			lofsa    {Robert of Fischbach}
			push    
			calle    proc13_5,  10
			jmp      code_2b67
code_2ace:
			dup     
			ldi      4
			eq?     
			bnt      code_2aea
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    195
			pushi    45
			pushSelf
			lag      global0
			send     12
			jmp      code_2b67
code_2aea:
			dup     
			ldi      5
			eq?     
			bnt      code_2b05
			pushi    #view
			pushi    1
			pushi    52
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_2b67
code_2b05:
			dup     
			ldi      6
			eq?     
			bnt      code_2b1b
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_2b67
code_2b1b:
			dup     
			ldi      7
			eq?     
			bnt      code_2b3d
			pushi    5
			pushi    1290
			pushi    52
			pushSelf
			pushi    80
			lofsa    {Robert of Fischbach}
			push    
			calle    proc13_5,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2b67
code_2b3d:
			dup     
			ldi      8
			eq?     
			bnt      code_2b53
			pushi    3
			pushi    1290
			pushi    53
			pushSelf
			calle    proc13_5,  6
			jmp      code_2b67
code_2b53:
			dup     
			ldi      9
			eq?     
			bnt      code_2b67
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2b67:
			toss    
			ret     
		)
	)
)

(instance christy of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2bd0
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    5
			pushi    1290
			pushi    79
			pushSelf
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  10
			jmp      code_2c74
code_2bd0:
			dup     
			ldi      1
			eq?     
			bnt      code_2bec
			pushi    5
			pushi    1290
			pushi    80
			pushSelf
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  10
			jmp      code_2c74
code_2bec:
			dup     
			ldi      2
			eq?     
			bnt      code_2c12
			pushi    1
			pushi    600
			calle    proc806_1,  2
			pushi    5
			pushi    1290
			pushi    81
			pushSelf
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  10
			jmp      code_2c74
code_2c12:
			dup     
			ldi      3
			eq?     
			bnt      code_2c38
			pushi    1
			pushi    64636
			calle    proc806_1,  2
			pushi    5
			pushi    1290
			pushi    82
			pushSelf
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  10
			jmp      code_2c74
code_2c38:
			dup     
			ldi      4
			eq?     
			bnt      code_2c5e
			pushi    1
			pushi    300
			calle    proc806_1,  2
			pushi    5
			pushi    1290
			pushi    83
			pushSelf
			pushi    80
			lofsa    {Christy Marx}
			push    
			calle    proc13_4,  10
			jmp      code_2c74
code_2c5e:
			dup     
			ldi      5
			eq?     
			bnt      code_2c74
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_2c74:
			toss    
			ret     
		)
	)
)

(instance buyOil of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2cc7
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_2dd0
code_2cc7:
			dup     
			ldi      1
			eq?     
			bnt      code_2cf3
			pushi    #cel
			pushi    0
			lofsa    person17
			send     4
			not     
			bnt      code_2ce3
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2dd0
code_2ce3:
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    person17
			send     8
			jmp      code_2dd0
code_2cf3:
			dup     
			ldi      2
			eq?     
			bnt      code_2d01
			ldi      10
			aTop     ticks
			jmp      code_2dd0
code_2d01:
			dup     
			ldi      3
			eq?     
			bnt      code_2d31
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    #boughtRoseOil
			pushi    1
			pushi    1
			class    Fair
			send     6
			pushi    5
			lea      @local119
			push    
			pushi    6
			lea      @local154
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_2dd0
code_2d31:
			dup     
			ldi      4
			eq?     
			bnt      code_2d48
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    person17
			send     8
			jmp      code_2dd0
code_2d48:
			dup     
			ldi      5
			eq?     
			bnt      code_2d5e
			pushi    #hide
			pushi    0
			lofsa    bottle
			send     4
			ldi      2
			aTop     cycles
			jmp      code_2dd0
code_2d5e:
			dup     
			ldi      6
			eq?     
			bnt      code_2d75
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    person17
			send     8
			jmp      code_2dd0
code_2d75:
			dup     
			ldi      7
			eq?     
			bnt      code_2d95
			pushi    #posn
			pushi    2
			pushi    141
			pushi    114
			pushi    194
			pushi    0
			lofsa    bottle
			send     12
			ldi      3
			aTop     cycles
			jmp      code_2dd0
code_2d95:
			dup     
			ldi      8
			eq?     
			bnt      code_2db3
			pushi    5
			lea      @local126
			push    
			pushi    6
			lea      @local154
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_2dd0
code_2db3:
			dup     
			ldi      9
			eq?     
			bnt      code_2dd0
			pushi    0
			callb    proc0_4,  0
			pushi    #setScript
			pushi    1
			lofsa    sRandom
			push    
			lofsa    pigarm
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_2dd0:
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
			bnt      code_2eb0
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2e32
			pushi    #changeState
			pushi    1
			pushi    10
			self     6
			jmp      code_2eac
code_2e32:
			dup     
			ldi      1
			eq?     
			bnt      code_2e44
			pushi    #changeState
			pushi    1
			pushi    20
			self     6
			jmp      code_2eac
code_2e44:
			dup     
			ldi      2
			eq?     
			bnt      code_2e56
			pushi    #changeState
			pushi    1
			pushi    30
			self     6
			jmp      code_2eac
code_2e56:
			dup     
			ldi      3
			eq?     
			bnt      code_2e68
			pushi    #changeState
			pushi    1
			pushi    40
			self     6
			jmp      code_2eac
code_2e68:
			dup     
			ldi      4
			eq?     
			bnt      code_2e7a
			pushi    #changeState
			pushi    1
			pushi    50
			self     6
			jmp      code_2eac
code_2e7a:
			dup     
			ldi      5
			eq?     
			bnt      code_2e8c
			pushi    #changeState
			pushi    1
			pushi    60
			self     6
			jmp      code_2eac
code_2e8c:
			dup     
			ldi      6
			eq?     
			bnt      code_2e9e
			pushi    #changeState
			pushi    1
			pushi    70
			self     6
			jmp      code_2eac
code_2e9e:
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
code_2eac:
			toss    
			jmp      code_31a8
code_2eb0:
			dup     
			ldi      10
			eq?     
			bnt      code_2ed8
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    person17
			send     18
			jmp      code_31a8
code_2ed8:
			dup     
			ldi      11
			eq?     
			bnt      code_2efc
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    person17
			send     14
			jmp      code_31a8
code_2efc:
			dup     
			ldi      12
			eq?     
			bnt      code_2f1d
			pushi    #stopUpd
			pushi    0
			lofsa    person17
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_31a8
code_2f1d:
			dup     
			ldi      20
			eq?     
			bnt      code_2f45
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    doom
			send     18
			jmp      code_31a8
code_2f45:
			dup     
			ldi      21
			eq?     
			bnt      code_2f69
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    doom
			send     14
			jmp      code_31a8
code_2f69:
			dup     
			ldi      22
			eq?     
			bnt      code_2f8a
			pushi    #stopUpd
			pushi    0
			lofsa    doom
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_31a8
code_2f8a:
			dup     
			ldi      30
			eq?     
			bnt      code_2fb2
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    head
			send     18
			jmp      code_31a8
code_2fb2:
			dup     
			ldi      31
			eq?     
			bnt      code_2fd6
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    head
			send     14
			jmp      code_31a8
code_2fd6:
			dup     
			ldi      32
			eq?     
			bnt      code_2ff7
			pushi    #stopUpd
			pushi    0
			lofsa    head
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_31a8
code_2ff7:
			dup     
			ldi      40
			eq?     
			bnt      code_301f
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    carm1
			send     18
			jmp      code_31a8
code_301f:
			dup     
			ldi      41
			eq?     
			bnt      code_3043
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    carm1
			send     14
			jmp      code_31a8
code_3043:
			dup     
			ldi      42
			eq?     
			bnt      code_3064
			pushi    #stopUpd
			pushi    0
			lofsa    carm1
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_31a8
code_3064:
			dup     
			ldi      50
			eq?     
			bnt      code_308c
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    carm2
			send     18
			jmp      code_31a8
code_308c:
			dup     
			ldi      51
			eq?     
			bnt      code_30b0
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    carm2
			send     14
			jmp      code_31a8
code_30b0:
			dup     
			ldi      52
			eq?     
			bnt      code_30d1
			pushi    #stopUpd
			pushi    0
			lofsa    carm2
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_31a8
code_30d1:
			dup     
			ldi      60
			eq?     
			bnt      code_30f9
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    pigarm
			send     18
			jmp      code_31a8
code_30f9:
			dup     
			ldi      61
			eq?     
			bnt      code_311d
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    pigarm
			send     14
			jmp      code_31a8
code_311d:
			dup     
			ldi      62
			eq?     
			bnt      code_313e
			pushi    #stopUpd
			pushi    0
			lofsa    pigarm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_31a8
code_313e:
			dup     
			ldi      70
			eq?     
			bnt      code_3166
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tail
			send     18
			jmp      code_31a8
code_3166:
			dup     
			ldi      71
			eq?     
			bnt      code_318a
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    tail
			send     14
			jmp      code_31a8
code_318a:
			dup     
			ldi      72
			eq?     
			bnt      code_31a8
			pushi    #stopUpd
			pushi    0
			lofsa    tail
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
code_31a8:
			toss    
			ret     
		)
	)
)

(instance sExitEast of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_320f
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    335
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_3236
code_320f:
			dup     
			ldi      1
			eq?     
			bnt      code_3236
			pushi    #walkingOut
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_3230
			pushi    #newRoom
			pushi    1
			pushi    300
			lag      global2
			send     6
			jmp      code_3236
code_3230:
			dpToa    state
			ldi      1
			aTop     cycles
code_3236:
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
			bnt      code_329c
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
			jmp      code_32c3
code_329c:
			dup     
			ldi      1
			eq?     
			bnt      code_32c3
			pushi    #walkingOut
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_32bd
			pushi    #newRoom
			pushi    1
			pushi    280
			lag      global2
			send     6
			jmp      code_32c3
code_32bd:
			dpToa    state
			ldi      1
			aTop     cycles
code_32c3:
			toss    
			ret     
		)
	)
)
