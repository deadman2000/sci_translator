;;; Sierra Script 1.0 - (do not remove this comment)
(script# 300)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n812)
(use n851)
(use n860)
(use n946)
(use n950)
(use n992)
(use n999)

(public
	rm300 0
)

(local
	[local0 10] = [1300 14 1 1 2 2 1 2 1]
	[local10 5] = [1300 26 1 2]
	[local15 5] = [1300 123 1 2]
	[local20 14] = [1300 30 1 1 2 1 1 1 2 1 1 2 1]
	[local34 7] = [1300 49 1 1 2 1]
	[local41 11] = [1300 71 1 1 1 2 1 2 1 2]
	[local52 6] = [1300 81 1 2 2]
	[local58 9] = [1300 88 1 1 2 1 2 1]
	[local67 7] = [1300 99 1 2 1 2]
	[local74 7] = [1300 104 1 2 2 1]
	[local81 3] = [-1 11570 21]
	[local84 3] = [-1 11583 21]
	[local87 3] = [-1 11602 21]
	[local90 3] = [-1 11615 21]
	[local93 3] = [-1 11631 21]
	[local96 3] = [-1 11643 21]
	[local99 3] = [-1 11650 21]
	[local102 3] = [-1 11657 21]
	[local105 3] = [-1 11668 21]
)
(instance rm300 of StdRoom
	(properties
		picture 300
		style $000b
		north 260
		east 310
		south 260
		west 290
	)
	
	(method (init)
		(asm
			pushi    #setRegions
			pushi    1
			pushi    311
			self     6
			pushi    0
			calle    proc311_3,  0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_00fc
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    39
			pushi    305
			pushi    39
			pushi    202
			pushi    58
			pushi    140
			pushi    34
			pushi    45
			pushi    34
			pushi    45
			pushi    24
			pushi    0
			pushi    24
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
			pushi    0
			pushi    77
			pushi    241
			pushi    77
			pushi    217
			pushi    60
			pushi    262
			pushi    51
			pushi    311
			pushi    51
			pushi    319
			pushi    61
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
			pushi    10
			pushi    154
			pushi    49
			pushi    178
			pushi    59
			pushi    170
			pushi    64
			pushi    138
			pushi    64
			pushi    132
			pushi    56
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
			pushi    0
			pushi    39
			pushi    40
			pushi    39
			pushi    40
			pushi    54
			pushi    0
			pushi    54
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     12
			jmp      code_0193
code_00fc:
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    237
			pushi    182
			pushi    242
			pushi    175
			pushi    298
			pushi    175
			pushi    289
			pushi    189
			pushi    26
			pushi    189
			pushi    26
			pushi    182
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
			pushi    12
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    118
			pushi    121
			pushi    118
			pushi    83
			pushi    137
			pushi    0
			pushi    137
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
			pushi    319
			pushi    124
			pushi    319
			pushi    138
			pushi    122
			pushi    138
			pushi    141
			pushi    124
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     10
code_0193:
			pushi    #init
			pushi    0
			lofsa    swordsArm
			send     4
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    merchantArm
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    markArm
			send     8
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    furs
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
			lofsa    person22
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
			lofsa    person26
			send     10
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_0389
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    sheepsArm
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			lofsa    sRandom
			push    
			lofsa    beggarArm
			send     16
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    knivesArm
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
			lofsa    person16
			send     10
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
			lofsa    person3
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
			pushi    1
			pushi    5
			lofsa    person7
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person8
			send     10
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
			pushi    2
			pushi    4
			pushi    5
			lofsa    person13
			send     12
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
			lofsa    person24
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    0
			lofsa    person25
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
			pushi    3
			lofsa    table1
			send     10
			jmp      code_04f4
code_0389:
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
			lofsa    person3
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
			lofsa    person10
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
			pushi    2
			pushi    3
			pushi    5
			lofsa    person16
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    knivesArm
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
			pushi    5
			lofsa    person17
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person18
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person19
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person20
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person24
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person25
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person27
			send     10
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
			pushi    0
			lofsa    table1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    3
			pushi    5
			lofsa    sheepsArm
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    3
			pushi    4
			pushi    3
			pushi    5
			pushi    142
			pushi    1
			lofsa    sRandom
			push    
			lofsa    beggarArm
			send     20
			pushi    #init
			pushi    0
			pushi    281
			pushi    3
			pushi    4
			pushi    3
			pushi    5
			lofsa    person21
			send     14
code_04f4:
			pushi    #add
			pushi    11
			lofsa    baskets
			push    
			lofsa    wheel
			push    
			lofsa    table2
			push    
			lofsa    wall
			push    
			lofsa    knives
			push    
			lofsa    tools
			push    
			lofsa    leather
			push    
			lofsa    box
			push    
			lofsa    swords
			push    
			lofsa    mysteries
			push    
			lofsa    mysteries2
			push    
			pushi    116
			pushi    1
			pushi    107
			lag      global32
			send     32
			lsg      global12
			pToa     west
			eq?     
			bnt      code_05ae
			ldi      12
			aTop     style
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      38
			gt?     
			bnt      code_0561
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      55
			lt?     
			bnt      code_0561
			pushi    #y
			pushi    1
			pushi    55
			lag      global0
			send     6
			jmp      code_0588
code_0561:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      137
			lt?     
			bnt      code_0588
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0588
			pushi    #y
			pushi    1
			pushi    137
			lag      global0
			send     6
code_0588:
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
			jmp      code_06a2
code_05ae:
			lsg      global12
			pToa     east
			eq?     
			bnt      code_0698
			ldi      11
			aTop     style
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      138
			lt?     
			bnt      code_05e4
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      124
			gt?     
			bnt      code_05e4
			pushi    #y
			pushi    1
			pushi    138
			lag      global0
			send     6
			jmp      code_064b
code_05e4:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_060c
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      118
			lt?     
			bnt      code_060c
			pushi    #y
			pushi    1
			pushi    118
			lag      global0
			send     6
			jmp      code_064b
code_060c:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_0634
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      51
			gt?     
			bnt      code_0634
			pushi    #y
			pushi    1
			pushi    51
			lag      global0
			send     6
			jmp      code_064b
code_0634:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      48
			lt?     
			bnt      code_064b
			pushi    #y
			pushi    1
			pushi    48
			lag      global0
			send     6
code_064b:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      138
			lt?     
			bnt      code_0672
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      124
			gt?     
			bnt      code_0672
			pushi    #y
			pushi    1
			pushi    138
			lag      global0
			send     6
code_0672:
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
			jmp      code_06a2
code_0698:
			ldi      100
			aTop     style
			pushi    #init
			pushi    0
			super    StdRoom,  4
code_06a2:
			pushi    0
			callb    proc0_4,  0
			lag      global198
			not     
			bt       code_06b2
			lsg      global198
			ldi      270
			gt?     
code_06b2:
			bnt      code_06c1
			pushi    #init
			pushi    0
			pushi    1
			pushi    316
			callk    ScriptID,  2
			send     4
code_06c1:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_06ca
			jmp      code_072d
code_06ca:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_06ec
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitSouth
			push    
			lag      global2
			send     6
			jmp      code_072d
code_06ec:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_070e
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitEast
			push    
			lag      global2
			send     6
			jmp      code_072d
code_070e:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_072d
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitWest
			push    
			lag      global2
			send     6
code_072d:
			pushi    #doit
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
)

(instance beggarArm of FairProp
	(properties
		x 34
		y 169
		approachX 46
		approachY 182
		view 300
		loop 3
		priority 14
		signal $4010
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    person21
			send     4
			ret     
		)
	)
)

(instance sheepsArm of FairProp
	(properties
		x 143
		y 107
		approachX 156
		approachY 140
		view 300
		loop 2
		priority 11
		signal $4010
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    person16
			send     4
			ret     
		)
	)
)

(instance swordsArm of FairProp
	(properties
		x 307
		y 100
		view 300
		loop 1
		priority 11
		signal $4010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_088c
			pushi    2
			pushi    1300
			pushi    70
			calle    proc13_4,  4
			jmp      code_0923
code_088c:
			dup     
			ldi      5
			eq?     
			bnt      code_08c3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_08ae
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0923
code_08ae:
			pushi    3
			lea      @local41
			push    
			lea      @local93
			push    
			pushi    6
			calle    proc851_0,  6
			jmp      code_0923
code_08c3:
			dup     
			ldi      4
			eq?     
			bnt      code_0903
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_08f4
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    79
			pushi    80
			lofsa    {Edgar Sharp}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08ff
code_08f4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_08ff:
			toss    
			jmp      code_0923
code_0903:
			dup     
			ldi      3
			eq?     
			bnt      code_0918
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0923
code_0918:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_0923:
			toss    
			ret     
		)
	)
)

(instance merchantArm of FairProp
	(properties
		x 257
		y 41
		view 300
		loop 5
		priority 7
		signal $4010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_09aa
			pushi    2
			pushi    1300
			pushi    48
			calle    proc13_4,  4
			jmp      code_0a41
code_09aa:
			dup     
			ldi      5
			eq?     
			bnt      code_09e1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_09cc
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0a41
code_09cc:
			pushi    3
			lea      @local34
			push    
			lea      @local90
			push    
			pushi    6
			calle    proc851_0,  6
			jmp      code_0a41
code_09e1:
			dup     
			ldi      4
			eq?     
			bnt      code_0a21
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0a12
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    53
			pushi    80
			lofsa    {Garrett of York}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a1d
code_0a12:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_0a1d:
			toss    
			jmp      code_0a41
code_0a21:
			dup     
			ldi      3
			eq?     
			bnt      code_0a36
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a41
code_0a36:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_0a41:
			toss    
			ret     
		)
	)
)

(instance markArm of FairProp
	(properties
		x 248
		y 161
		view 300
		loop 4
		priority 14
		signal $4010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ac8
			pushi    2
			pushi    1300
			pushi    98
			calle    proc13_4,  4
			jmp      code_0b21
code_0ac8:
			dup     
			ldi      5
			eq?     
			bnt      code_0b01
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_0aea
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0b21
code_0aea:
			pushi    3
			lea      @local67
			push    
			lea      @local105
			push    
			lea      @local102
			push    
			calle    proc851_0,  6
			jmp      code_0b21
code_0b01:
			dup     
			ldi      3
			eq?     
			bnt      code_0b16
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b21
code_0b16:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairProp,  6
code_0b21:
			toss    
			ret     
		)
	)
)

(instance person1 of FairFeature
	(properties
		x 9
		y 25
		nsBottom 50
		nsRight 19
		sightAngle 90
		approachX 14
		approachY 55
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ba8
			pushi    2
			pushi    1300
			pushi    6
			calle    proc13_4,  4
			jmp      code_0c0b
code_0ba8:
			dup     
			ldi      5
			eq?     
			bnt      code_0beb
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0bca
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0c0b
code_0bca:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    7
			pushi    80
			lofsa    {Gammer Hedda}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0c0b
code_0beb:
			dup     
			ldi      3
			eq?     
			bnt      code_0c00
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c0b
code_0c00:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0c0b:
			toss    
			ret     
		)
	)
)

(instance person2 of FairFeature
	(properties
		x 32
		y 88
		z 40
		nsTop 32
		nsLeft 25
		nsBottom 65
		nsRight 39
		sightAngle 90
		approachX 40
		approachY 56
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c68
			pushi    2
			pushi    1300
			pushi    8
			calle    proc13_4,  4
			jmp      code_0ccb
code_0c68:
			dup     
			ldi      5
			eq?     
			bnt      code_0cab
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0c8a
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0ccb
code_0c8a:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    9
			pushi    80
			lofsa    {Clyde Kadiddlehopper}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0ccb
code_0cab:
			dup     
			ldi      3
			eq?     
			bnt      code_0cc0
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ccb
code_0cc0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0ccb:
			toss    
			ret     
		)
	)
)

(instance person3 of FairFeature
	(properties
		x 46
		y 80
		z 30
		nsTop 34
		nsLeft 38
		nsBottom 67
		nsRight 55
		sightAngle 90
		approachX 40
		approachY 56
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d28
			pushi    2
			pushi    1300
			pushi    10
			calle    proc13_4,  4
			jmp      code_0d9c
code_0d28:
			dup     
			ldi      5
			eq?     
			bnt      code_0d7c
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0d4a
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0d9c
code_0d4a:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    11
			pushi    80
			lofsa    {Ichabod Idlebody}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1300
			pushi    12
			pushi    80
			lofsa    {Ichabod Idlebody}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0d9c
code_0d7c:
			dup     
			ldi      3
			eq?     
			bnt      code_0d91
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d9c
code_0d91:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0d9c:
			toss    
			ret     
		)
	)
)

(instance person4 of FairFeature
	(properties
		x 65
		y 89
		z 40
		nsTop 32
		nsLeft 54
		nsBottom 67
		nsRight 76
		sightAngle 90
		approachX 40
		approachY 56
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0df8
			pushi    2
			pushi    1300
			pushi    13
			calle    proc13_4,  4
			jmp      code_0e4f
code_0df8:
			dup     
			ldi      5
			eq?     
			bnt      code_0e2f
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0e1a
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0e4f
code_0e1a:
			pushi    3
			lea      @local0
			push    
			lea      @local81
			push    
			pushi    6
			calle    proc851_0,  6
			jmp      code_0e4f
code_0e2f:
			dup     
			ldi      3
			eq?     
			bnt      code_0e44
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e4f
code_0e44:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0e4f:
			toss    
			ret     
		)
	)
)

(instance person5 of FairFeature
	(properties
		x 100
		y 16
		nsTop 1
		nsLeft 91
		nsBottom 31
		nsRight 110
		sightAngle 90
		approachX 122
		approachY 34
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0eac
			pushi    2
			pushi    1300
			pushi    21
			calle    proc13_4,  4
			jmp      code_0f2a
code_0eac:
			dup     
			ldi      5
			eq?     
			bnt      code_0f0a
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0ece
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0f2a
code_0ece:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    22
			pushi    80
			lofsa    {Winifred Weaver}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1300
			pushi    23
			pushi    80
			lofsa    {Winifred Weaver}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1300
			pushi    24
			calle    proc13_4,  4
			jmp      code_0f2a
code_0f0a:
			dup     
			ldi      3
			eq?     
			bnt      code_0f1f
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f2a
code_0f1f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0f2a:
			toss    
			ret     
		)
	)
)

(instance person6 of FairFeature
	(properties
		x 154
		y 64
		z 30
		nsTop 6
		nsLeft 142
		nsBottom 63
		nsRight 166
		sightAngle 90
		onMeCheck $0010
		approachX 134
		approachY 57
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f86
			pushi    2
			pushi    1300
			pushi    25
			calle    proc13_4,  4
			jmp      code_0ffa
code_0f86:
			dup     
			ldi      5
			eq?     
			bnt      code_0fda
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0fa8
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_0ffa
code_0fa8:
			lsg      global155
			ldi      42
			gt?     
			bnt      code_0fc5
			pushi    3
			lea      @local15
			push    
			pushi    6
			lea      @local84
			push    
			calle    proc851_0,  6
			jmp      code_0ffa
code_0fc5:
			pushi    3
			lea      @local10
			push    
			pushi    6
			lea      @local84
			push    
			calle    proc851_0,  6
			jmp      code_0ffa
code_0fda:
			dup     
			ldi      3
			eq?     
			bnt      code_0fef
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ffa
code_0fef:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_0ffa:
			toss    
			ret     
		)
	)
)

(instance person7 of FairFeature
	(properties
		x 176
		y 18
		nsTop -1
		nsLeft 168
		nsBottom 38
		nsRight 185
		sightAngle 90
		approachX 182
		approachY 46
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1056
			pushi    2
			pushi    1300
			pushi    28
			calle    proc13_4,  4
			jmp      code_10b9
code_1056:
			dup     
			ldi      5
			eq?     
			bnt      code_1099
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_1078
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_10b9
code_1078:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    122
			pushi    80
			lofsa    {Mistress Hayasher}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_10b9
code_1099:
			dup     
			ldi      3
			eq?     
			bnt      code_10ae
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_10b9
code_10ae:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_10b9:
			toss    
			ret     
		)
	)
)

(instance person8 of FairFeature
	(properties
		x 185
		y 81
		z 30
		nsTop 39
		nsLeft 170
		nsBottom 63
		nsRight 201
		sightAngle 90
		onMeCheck $0008
		approachX 197
		approachY 74
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1116
			pushi    2
			pushi    1300
			pushi    29
			calle    proc13_4,  4
			jmp      code_11a2
code_1116:
			dup     
			ldi      5
			eq?     
			bnt      code_1182
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_1138
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_11a2
code_1138:
			pushi    #firstTalkMorgan
			pushi    0
			class    Fair
			send     4
			bnt      code_1161
			pushi    3
			lea      @local20
			push    
			lea      @local87
			push    
			pushi    6
			calle    proc851_0,  6
			pushi    #firstTalkMorgan
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_11a2
code_1161:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    41
			pushi    80
			lofsa    {Morgan Creek}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_11a2
code_1182:
			dup     
			ldi      3
			eq?     
			bnt      code_1197
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_11a2
code_1197:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_11a2:
			toss    
			ret     
		)
	)
)

(instance person9 of FairFeature
	(properties
		x 206
		y 18
		z -10
		nsTop 3
		nsLeft 196
		nsBottom 53
		nsRight 216
		sightAngle 90
		approachX 182
		approachY 46
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11fe
			pushi    2
			pushi    1300
			pushi    42
			calle    proc13_4,  4
			jmp      code_1233
code_11fe:
			dup     
			ldi      5
			eq?     
			bnt      code_1213
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1233
code_1213:
			dup     
			ldi      3
			eq?     
			bnt      code_1228
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1233
code_1228:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1233:
			toss    
			ret     
		)
	)
)

(instance person10 of FairFeature
	(properties
		x 228
		y 7
		nsLeft 218
		nsBottom 15
		nsRight 239
		sightAngle 90
		approachX 220
		approachY 45
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1290
			pushi    2
			pushi    1300
			pushi    43
			calle    proc13_4,  4
			jmp      code_131f
code_1290:
			dup     
			ldi      5
			eq?     
			bnt      code_12d3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_12b2
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_131f
code_12b2:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    44
			pushi    80
			lofsa    {Bruce the Baker}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_131f
code_12d3:
			dup     
			ldi      4
			eq?     
			bnt      code_12ff
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_12f0
			pushi    2
			pushi    1300
			pushi    45
			calle    proc13_4,  4
			jmp      code_12fb
code_12f0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_12fb:
			toss    
			jmp      code_131f
code_12ff:
			dup     
			ldi      3
			eq?     
			bnt      code_1314
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_131f
code_1314:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_131f:
			toss    
			ret     
		)
	)
)

(instance person11 of FairFeature
	(properties
		x 267
		y 8
		nsLeft 254
		nsBottom 16
		nsRight 281
		sightAngle 90
		approachX 251
		approachY 45
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_137c
			pushi    2
			pushi    1300
			pushi    46
			calle    proc13_4,  4
			jmp      code_13b1
code_137c:
			dup     
			ldi      5
			eq?     
			bnt      code_1391
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_13b1
code_1391:
			dup     
			ldi      3
			eq?     
			bnt      code_13a6
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_13b1
code_13a6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_13b1:
			toss    
			ret     
		)
	)
)

(instance person12 of FairFeature
	(properties
		x 290
		y 20
		nsLeft 283
		nsBottom 40
		nsRight 297
		sightAngle 90
		approachX 251
		approachY 45
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_140e
			pushi    2
			pushi    1300
			pushi    47
			calle    proc13_4,  4
			jmp      code_1443
code_140e:
			dup     
			ldi      5
			eq?     
			bnt      code_1423
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1443
code_1423:
			dup     
			ldi      3
			eq?     
			bnt      code_1438
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1443
code_1438:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1443:
			toss    
			ret     
		)
	)
)

(instance person13 of FairFeature
	(properties
		x 262
		y 86
		z 40
		nsTop 28
		nsLeft 251
		nsBottom 65
		nsRight 273
		sightAngle 90
		onMeCheck $0008
		approachX 253
		approachY 48
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_14a0
			pushi    2
			pushi    1300
			pushi    48
			calle    proc13_4,  4
			jmp      code_1545
code_14a0:
			dup     
			ldi      5
			eq?     
			bnt      code_14d7
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_14c2
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1545
code_14c2:
			pushi    3
			lea      @local34
			push    
			lea      @local90
			push    
			pushi    6
			calle    proc851_0,  6
			jmp      code_1545
code_14d7:
			dup     
			ldi      4
			eq?     
			bnt      code_1525
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1516
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_1521
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    53
			pushi    80
			lofsa    {Garrett of York}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1521
code_1516:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1521:
			toss    
			jmp      code_1545
code_1525:
			dup     
			ldi      3
			eq?     
			bnt      code_153a
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1545
code_153a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1545:
			toss    
			ret     
		)
	)
)

(instance person14 of FairFeature
	(properties
		x 305
		y 86
		z 40
		nsTop 32
		nsLeft 296
		nsBottom 61
		nsRight 314
		sightAngle 90
		approachX 271
		approachY 47
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_15a2
			pushi    2
			pushi    1300
			pushi    54
			calle    proc13_4,  4
			jmp      code_15d7
code_15a2:
			dup     
			ldi      5
			eq?     
			bnt      code_15b7
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_15d7
code_15b7:
			dup     
			ldi      3
			eq?     
			bnt      code_15cc
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_15d7
code_15cc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_15d7:
			toss    
			ret     
		)
	)
)

(instance knivesArm of FairProp
	(properties
		x 27
		y 113
		approachX 52
		approachY 134
		view 300
		priority 12
		signal $4010
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    person15
			send     4
			ret     
		)
	)
)

(instance person15 of FairFeature
	(properties
		x 25
		y 110
		nsTop 92
		nsLeft 9
		nsBottom 129
		nsRight 41
		sightAngle 90
		approachX 52
		approachY 134
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_16ae
			pushi    2
			pushi    1300
			pushi    55
			calle    proc13_4,  4
			jmp      code_1711
code_16ae:
			dup     
			ldi      5
			eq?     
			bnt      code_16f1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_16d0
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1711
code_16d0:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    56
			pushi    80
			lofsa    {Cuthbert Codswallop}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1711
code_16f1:
			dup     
			ldi      3
			eq?     
			bnt      code_1706
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1711
code_1706:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1711:
			toss    
			ret     
		)
	)
)

(instance person16 of FairFeature
	(properties
		x 151
		y 103
		nsTop 75
		nsLeft 139
		nsBottom 131
		nsRight 164
		sightAngle 90
		approachX 156
		approachY 140
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_176e
			pushi    2
			pushi    1300
			pushi    57
			calle    proc13_4,  4
			jmp      code_181f
code_176e:
			dup     
			ldi      5
			eq?     
			bnt      code_17d3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1790
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_181f
code_1790:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    58
			pushi    80
			lofsa    {Ned Courage}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1300
			pushi    59
			pushi    80
			lofsa    {Ned Courage}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1300
			pushi    60
			pushi    80
			lofsa    {Ned Courage}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_181f
code_17d3:
			dup     
			ldi      4
			eq?     
			bnt      code_17ff
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_17f0
			pushi    2
			pushi    1300
			pushi    61
			calle    proc13_4,  4
			jmp      code_17fb
code_17f0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_17fb:
			toss    
			jmp      code_181f
code_17ff:
			dup     
			ldi      3
			eq?     
			bnt      code_1814
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_181f
code_1814:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_181f:
			toss    
			ret     
		)
	)
)

(instance person17 of FairFeature
	(properties
		x 212
		y 119
		nsTop 104
		nsLeft 197
		nsBottom 134
		nsRight 228
		sightAngle 90
		approachX 213
		approachY 118
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_187c
			pushi    2
			pushi    1300
			pushi    62
			calle    proc13_4,  4
			jmp      code_18df
code_187c:
			dup     
			ldi      5
			eq?     
			bnt      code_18bf
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_189e
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_18df
code_189e:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    63
			pushi    80
			lofsa    {Ned Courage}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_18df
code_18bf:
			dup     
			ldi      3
			eq?     
			bnt      code_18d4
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_18df
code_18d4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_18df:
			toss    
			ret     
		)
	)
)

(instance person18 of FairFeature
	(properties
		x 249
		y 205
		z 100
		nsTop 77
		nsLeft 240
		nsBottom 133
		nsRight 258
		sightAngle 90
		approachX 267
		approachY 120
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_193c
			pushi    2
			pushi    1300
			pushi    64
			calle    proc13_4,  4
			jmp      code_19b0
code_193c:
			dup     
			ldi      5
			eq?     
			bnt      code_1990
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_195e
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_19b0
code_195e:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    65
			pushi    80
			lofsa    {Erik the Tall}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1300
			pushi    66
			pushi    80
			lofsa    {Erik the Tall}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_19b0
code_1990:
			dup     
			ldi      3
			eq?     
			bnt      code_19a5
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_19b0
code_19a5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_19b0:
			toss    
			ret     
		)
	)
)

(instance person19 of FairFeature
	(properties
		x 273
		y 223
		z 100
		nsTop 111
		nsLeft 259
		nsBottom 136
		nsRight 288
		sightAngle 90
		approachX 267
		approachY 120
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a0c
			pushi    2
			pushi    1300
			pushi    67
			calle    proc13_4,  4
			jmp      code_1a80
code_1a0c:
			dup     
			ldi      5
			eq?     
			bnt      code_1a60
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1a2e
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1a80
code_1a2e:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    68
			pushi    80
			lofsa    {Lester Luskin}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1300
			pushi    69
			pushi    80
			lofsa    {Lester Luskin}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1a80
code_1a60:
			dup     
			ldi      3
			eq?     
			bnt      code_1a75
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a80
code_1a75:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1a80:
			toss    
			ret     
		)
	)
)

(instance person20 of FairFeature
	(properties
		x 302
		y 154
		z 50
		nsTop 76
		nsLeft 289
		nsBottom 132
		nsRight 316
		sightAngle 90
		approachX 267
		approachY 120
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1adc
			pushi    2
			pushi    1300
			pushi    70
			calle    proc13_4,  4
			jmp      code_1b81
code_1adc:
			dup     
			ldi      5
			eq?     
			bnt      code_1b13
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1afe
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1b81
code_1afe:
			pushi    3
			lea      @local41
			push    
			lea      @local93
			push    
			pushi    6
			calle    proc851_0,  6
			jmp      code_1b81
code_1b13:
			dup     
			ldi      4
			eq?     
			bnt      code_1b61
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1b52
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_1b5d
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    79
			pushi    80
			lofsa    {Edgar Sharp}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1b5d
code_1b52:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1b5d:
			toss    
			jmp      code_1b81
code_1b61:
			dup     
			ldi      3
			eq?     
			bnt      code_1b76
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1b81
code_1b76:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1b81:
			toss    
			ret     
		)
	)
)

(instance person21 of FairFeature
	(properties
		x 44
		y 266
		z 100
		nsTop 143
		nsLeft 27
		nsBottom 189
		nsRight 61
		sightAngle 90
		approachX 46
		approachY 182
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1bde
			pushi    2
			pushi    1300
			pushi    80
			calle    proc13_4,  4
			jmp      code_1c8f
code_1bde:
			dup     
			ldi      5
			eq?     
			bnt      code_1c15
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1c00
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1c8f
code_1c00:
			pushi    3
			lea      @local52
			push    
			pushi    6
			lea      @local96
			push    
			calle    proc851_0,  6
			jmp      code_1c8f
code_1c15:
			dup     
			ldi      4
			eq?     
			bnt      code_1c6f
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1c60
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_1c6b
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    84
			pushi    80
			lofsa    {Beggar}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    10
			pushi    150
			calle    proc806_1,  4
			jmp      code_1c6b
code_1c60:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1c6b:
			toss    
			jmp      code_1c8f
code_1c6f:
			dup     
			ldi      3
			eq?     
			bnt      code_1c84
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c8f
code_1c84:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1c8f:
			toss    
			ret     
		)
	)
)

(instance person22 of FairFeature
	(properties
		x 86
		y 268
		z 100
		nsTop 147
		nsLeft 76
		nsBottom 189
		nsRight 97
		sightAngle 90
		approachX 94
		approachY 166
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1cec
			pushi    2
			pushi    1300
			pushi    85
			calle    proc13_4,  4
			jmp      code_1d21
code_1cec:
			dup     
			ldi      5
			eq?     
			bnt      code_1d01
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1d21
code_1d01:
			dup     
			ldi      3
			eq?     
			bnt      code_1d16
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1d21
code_1d16:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1d21:
			toss    
			ret     
		)
	)
)

(instance person23 of FairFeature
	(properties
		x 108
		y 266
		z 100
		nsTop 144
		nsLeft 95
		nsBottom 189
		nsRight 122
		sightAngle 90
		approachX 94
		approachY 166
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1d7e
			pushi    2
			pushi    1300
			pushi    86
			calle    proc13_4,  4
			jmp      code_1db3
code_1d7e:
			dup     
			ldi      5
			eq?     
			bnt      code_1d93
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1db3
code_1d93:
			dup     
			ldi      3
			eq?     
			bnt      code_1da8
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1db3
code_1da8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1db3:
			toss    
			ret     
		)
	)
)

(instance person24 of FairFeature
	(properties
		x 164
		y 280
		z 100
		nsTop 171
		nsLeft 151
		nsBottom 189
		nsRight 178
		sightAngle 90
		approachX 163
		approachY 183
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1e10
			pushi    2
			pushi    1300
			pushi    87
			calle    proc13_4,  4
			jmp      code_1e65
code_1e10:
			dup     
			ldi      5
			eq?     
			bnt      code_1e45
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1e32
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1e65
code_1e32:
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    talkScript
			push    
			lag      global2
			send     6
			jmp      code_1e65
code_1e45:
			dup     
			ldi      3
			eq?     
			bnt      code_1e5a
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1e65
code_1e5a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1e65:
			toss    
			ret     
		)
	)
)

(instance person25 of FairFeature
	(properties
		x 209
		y 271
		z 100
		nsTop 154
		nsLeft 196
		nsBottom 189
		nsRight 222
		sightAngle 90
		approachX 221
		approachY 177
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1ec2
			pushi    2
			pushi    1300
			pushi    95
			calle    proc13_4,  4
			jmp      code_1f25
code_1ec2:
			dup     
			ldi      5
			eq?     
			bnt      code_1f05
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1ee4
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_1f25
code_1ee4:
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    96
			pushi    80
			lofsa    {Rowena Sly}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1f25
code_1f05:
			dup     
			ldi      3
			eq?     
			bnt      code_1f1a
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f25
code_1f1a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1f25:
			toss    
			ret     
		)
	)
)

(instance person26 of FairFeature
	(properties
		x 237
		y 272
		z 100
		nsTop 156
		nsLeft 223
		nsBottom 189
		nsRight 252
		sightAngle 90
		approachX 221
		approachY 177
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1f82
			pushi    2
			pushi    1300
			pushi    97
			calle    proc13_4,  4
			jmp      code_1fb7
code_1f82:
			dup     
			ldi      5
			eq?     
			bnt      code_1f97
			pushi    3
			pushi    1300
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1fb7
code_1f97:
			dup     
			ldi      3
			eq?     
			bnt      code_1fac
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1fb7
code_1fac:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_1fb7:
			toss    
			ret     
		)
	)
)

(instance person27 of FairFeature
	(properties
		x 257
		y 267
		z 100
		nsTop 146
		nsLeft 245
		nsBottom 189
		nsRight 269
		sightAngle 90
		approachX 267
		approachY 171
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2014
			pushi    2
			pushi    1300
			pushi    98
			calle    proc13_4,  4
			jmp      code_206d
code_2014:
			dup     
			ldi      5
			eq?     
			bnt      code_204d
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_2036
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_206d
code_2036:
			pushi    3
			lea      @local67
			push    
			lea      @local105
			push    
			lea      @local102
			push    
			calle    proc851_0,  6
			jmp      code_206d
code_204d:
			dup     
			ldi      3
			eq?     
			bnt      code_2062
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_206d
code_2062:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_206d:
			toss    
			ret     
		)
	)
)

(instance person28 of FairFeature
	(properties
		x 276
		y 270
		z 100
		nsTop 152
		nsLeft 264
		nsBottom 189
		nsRight 289
		sightAngle 90
		approachX 267
		approachY 171
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_20ca
			pushi    2
			pushi    1300
			pushi    103
			calle    proc13_4,  4
			jmp      code_2123
code_20ca:
			dup     
			ldi      5
			eq?     
			bnt      code_2103
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_20ec
			pushi    2
			pushi    1300
			pushi    5
			calle    proc13_4,  4
			jmp      code_2123
code_20ec:
			pushi    3
			lea      @local74
			push    
			lea      @local102
			push    
			lea      @local105
			push    
			calle    proc851_0,  6
			jmp      code_2123
code_2103:
			dup     
			ldi      3
			eq?     
			bnt      code_2118
			pushi    3
			pushi    1300
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_2123
code_2118:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2123:
			toss    
			ret     
		)
	)
)

(instance baskets of FairFeature
	(properties
		x 94
		y 15
		nsTop -1
		nsLeft 48
		nsBottom 32
		nsRight 141
		sightAngle 90
		approachX 121
		approachY 35
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2180
			pushi    2
			pushi    1300
			pushi    108
			calle    proc13_4,  4
			jmp      code_218b
code_2180:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_218b:
			toss    
			ret     
		)
	)
)

(instance wheel of FairFeature
	(properties
		x 105
		y 82
		z 30
		nsTop 38
		nsLeft 78
		nsBottom 66
		nsRight 133
		sightAngle 90
		onMeCheck $0004
		approachX 76
		approachY 64
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_21e8
			pushi    2
			pushi    1300
			pushi    109
			calle    proc13_4,  4
			jmp      code_21f3
code_21e8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_21f3:
			toss    
			ret     
		)
	)
)

(instance table1 of FairFeature
	(properties
		x 222
		y 23
		nsLeft 155
		nsBottom 47
		nsRight 290
		sightAngle 90
		onMeCheck $0004
		approachX 180
		approachY 45
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2250
			pushi    2
			pushi    1300
			pushi    110
			calle    proc13_4,  4
			jmp      code_2283
code_2250:
			dup     
			ldi      3
			eq?     
			bnt      code_2278
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    111
			pushi    80
			lofsa    {Bruce the Baker}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2283
code_2278:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2283:
			toss    
			ret     
		)
	)
)

(instance table2 of FairFeature
	(properties
		x 274
		y 35
		z -20
		nsTop 42
		nsLeft 230
		nsBottom 68
		nsRight 319
		sightAngle 90
		approachX 271
		approachY 47
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_22e0
			pushi    2
			pushi    1300
			pushi    112
			calle    proc13_4,  4
			jmp      code_22eb
code_22e0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_22eb:
			toss    
			ret     
		)
	)
)

(instance wall of Feature
	(properties
		x 159
		y 82
		nsTop 63
		nsBottom 102
		nsRight 319
		sightAngle 45
		onMeCheck $0002
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2348
			pushi    2
			pushi    1300
			pushi    113
			calle    proc13_4,  4
			jmp      code_2353
code_2348:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2353:
			toss    
			ret     
		)
	)
)

(instance knives of FairFeature
	(properties
		x 23
		y 89
		nsTop 73
		nsLeft 2
		nsBottom 106
		nsRight 45
		sightAngle 90
		approachX 52
		approachY 134
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_23b0
			pushi    2
			pushi    1300
			pushi    114
			calle    proc13_4,  4
			jmp      code_23bb
code_23b0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_23bb:
			toss    
			ret     
		)
	)
)

(instance tools of FairFeature
	(properties
		x 72
		y 102
		nsTop 73
		nsLeft 47
		nsBottom 131
		nsRight 98
		sightAngle 90
		onMeCheck $0004
		approachX 52
		approachY 134
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2418
			pushi    2
			pushi    1300
			pushi    115
			calle    proc13_4,  4
			jmp      code_2423
code_2418:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2423:
			toss    
			ret     
		)
	)
)

(instance furs of Feature
	(properties
		x 148
		y 84
		nsTop 58
		nsLeft 98
		nsBottom 110
		nsRight 199
		sightAngle 90
		onMeCheck $0020
		approachX 120
		approachY 116
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2480
			pushi    2
			pushi    1300
			pushi    116
			calle    proc13_4,  4
			jmp      code_24b3
code_2480:
			dup     
			ldi      3
			eq?     
			bnt      code_24a8
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1300
			pushi    117
			pushi    80
			lofsa    {Ned Courage}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_24b3
code_24a8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_24b3:
			toss    
			ret     
		)
	)
)

(instance leather of FairFeature
	(properties
		x 215
		y 74
		nsTop 61
		nsLeft 187
		nsBottom 87
		nsRight 243
		sightAngle 90
		approachX 214
		approachY 78
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2510
			pushi    2
			pushi    1300
			pushi    118
			calle    proc13_4,  4
			jmp      code_251b
code_2510:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_251b:
			toss    
			ret     
		)
	)
)

(instance box of FairFeature
	(properties
		x 215
		y 101
		sightAngle 45
		approachX 201
		approachY 111
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    234
			pushi    94
			pushi    239
			pushi    100
			pushi    197
			pushi    101
			pushi    193
			pushi    96
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
			super    FairFeature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_25a9
			pushi    2
			pushi    1300
			pushi    119
			calle    proc13_4,  4
			jmp      code_25b4
code_25a9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_25b4:
			toss    
			ret     
		)
	)
)

(instance swords of FairFeature
	(properties
		x 270
		y 93
		nsTop 71
		nsLeft 238
		nsBottom 116
		nsRight 303
		sightAngle 90
		approachX 234
		approachY 116
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2614
			pushi    2
			pushi    1300
			pushi    120
			calle    proc13_4,  4
			jmp      code_261f
code_2614:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_261f:
			toss    
			ret     
		)
	)
)

(instance mysteries of FairFeature
	(properties
		x 131
		y 179
		nsTop 169
		nsLeft 100
		nsBottom 189
		nsRight 162
		sightAngle 90
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_267c
			pushi    2
			pushi    1300
			pushi    121
			calle    proc13_4,  4
			jmp      code_2687
code_267c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_2687:
			toss    
			ret     
		)
	)
)

(instance mysteries2 of FairFeature
	(properties
		x 183
		y 177
		nsTop 166
		nsLeft 157
		nsBottom 188
		nsRight 210
		sightAngle 90
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_26e4
			pushi    2
			pushi    1300
			pushi    121
			calle    proc13_4,  4
			jmp      code_26ef
code_26e4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    FairFeature,  6
code_26ef:
			toss    
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
			bnt      code_279d
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      187
			gt?     
			bnt      code_2779
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
			jmp      code_27af
code_2779:
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
			jmp      code_27af
code_279d:
			dup     
			ldi      1
			eq?     
			bnt      code_27af
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
code_27af:
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
			bnt      code_286d
			pushi    2
			pushi    0
			pushi    3
			callk    Random,  4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2812
			pushi    #changeState
			pushi    1
			pushi    10
			self     6
			jmp      code_2869
code_2812:
			dup     
			ldi      1
			eq?     
			bnt      code_2824
			pushi    #changeState
			pushi    1
			pushi    20
			self     6
			jmp      code_2869
code_2824:
			dup     
			ldi      2
			eq?     
			bnt      code_2836
			pushi    #changeState
			pushi    1
			pushi    30
			self     6
			jmp      code_2869
code_2836:
			dup     
			ldi      3
			eq?     
			bnt      code_2848
			pushi    #changeState
			pushi    1
			pushi    40
			self     6
			jmp      code_2869
code_2848:
			dup     
			ldi      4
			eq?     
			bnt      code_285a
			pushi    #changeState
			pushi    1
			pushi    60
			self     6
			jmp      code_2869
code_285a:
			dup     
			ldi      5
			eq?     
			bnt      code_2869
			pushi    #changeState
			pushi    1
			pushi    50
			self     6
code_2869:
			toss    
			jmp      code_2b56
code_286d:
			dup     
			ldi      10
			eq?     
			bnt      code_2895
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    5
			pushi    15
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    beggarArm
			send     18
			jmp      code_2b56
code_2895:
			dup     
			ldi      11
			eq?     
			bnt      code_28a9
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     cycles
			jmp      code_2b56
code_28a9:
			dup     
			ldi      12
			eq?     
			bnt      code_28cd
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    5
			pushi    15
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    beggarArm
			send     14
			jmp      code_2b56
code_28cd:
			dup     
			ldi      13
			eq?     
			bnt      code_28ee
			pushi    #stopUpd
			pushi    0
			lofsa    beggarArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2b56
code_28ee:
			dup     
			ldi      20
			eq?     
			bnt      code_2916
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    knivesArm
			send     18
			jmp      code_2b56
code_2916:
			dup     
			ldi      21
			eq?     
			bnt      code_292a
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     cycles
			jmp      code_2b56
code_292a:
			dup     
			ldi      22
			eq?     
			bnt      code_294e
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    knivesArm
			send     14
			jmp      code_2b56
code_294e:
			dup     
			ldi      23
			eq?     
			bnt      code_296f
			pushi    #stopUpd
			pushi    0
			lofsa    knivesArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2b56
code_296f:
			dup     
			ldi      30
			eq?     
			bnt      code_298a
			pushi    #startUpd
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheepsArm
			send     12
			jmp      code_2b56
code_298a:
			dup     
			ldi      31
			eq?     
			bnt      code_299e
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     cycles
			jmp      code_2b56
code_299e:
			dup     
			ldi      32
			eq?     
			bnt      code_29b5
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sheepsArm
			send     8
			jmp      code_2b56
code_29b5:
			dup     
			ldi      33
			eq?     
			bnt      code_29d6
			pushi    #stopUpd
			pushi    0
			lofsa    sheepsArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2b56
code_29d6:
			dup     
			ldi      40
			eq?     
			bnt      code_29fe
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    swordsArm
			send     18
			jmp      code_2b56
code_29fe:
			dup     
			ldi      41
			eq?     
			bnt      code_2a12
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     cycles
			jmp      code_2b56
code_2a12:
			dup     
			ldi      42
			eq?     
			bnt      code_2a36
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    swordsArm
			send     14
			jmp      code_2b56
code_2a36:
			dup     
			ldi      43
			eq?     
			bnt      code_2a57
			pushi    #stopUpd
			pushi    0
			lofsa    swordsArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2b56
code_2a57:
			dup     
			ldi      50
			eq?     
			bnt      code_2a7f
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    merchantArm
			send     18
			jmp      code_2b56
code_2a7f:
			dup     
			ldi      51
			eq?     
			bnt      code_2a93
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     cycles
			jmp      code_2b56
code_2a93:
			dup     
			ldi      52
			eq?     
			bnt      code_2ab7
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    merchantArm
			send     14
			jmp      code_2b56
code_2ab7:
			dup     
			ldi      53
			eq?     
			bnt      code_2ad8
			pushi    #stopUpd
			pushi    0
			lofsa    merchantArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
			jmp      code_2b56
code_2ad8:
			dup     
			ldi      60
			eq?     
			bnt      code_2b00
			pushi    #startUpd
			pushi    0
			pushi    219
			pushi    1
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    markArm
			send     18
			jmp      code_2b56
code_2b00:
			dup     
			ldi      61
			eq?     
			bnt      code_2b14
			pushi    2
			pushi    5
			pushi    20
			callk    Random,  4
			aTop     cycles
			jmp      code_2b56
code_2b14:
			dup     
			ldi      62
			eq?     
			bnt      code_2b38
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    markArm
			send     14
			jmp      code_2b56
code_2b38:
			dup     
			ldi      63
			eq?     
			bnt      code_2b56
			pushi    #stopUpd
			pushi    0
			lofsa    markArm
			send     4
			ldi      65535
			aTop     state
			pushi    2
			pushi    5
			pushi    10
			callk    Random,  4
			aTop     ticks
code_2b56:
			toss    
			ret     
		)
	)
)

(instance talkScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2bb4
			pushi    4
			lea      @local58
			push    
			lea      @local99
			push    
			pushi    6
			pushSelf
			calle    proc851_0,  8
			jmp      code_2bda
code_2bb4:
			dup     
			ldi      1
			eq?     
			bnt      code_2bca
			pushi    3
			pushi    1300
			pushi    94
			pushSelf
			calle    proc13_4,  6
			jmp      code_2bda
code_2bca:
			dup     
			ldi      2
			eq?     
			bnt      code_2bda
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2bda:
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
			bnt      code_2c41
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
			jmp      code_2c68
code_2c41:
			dup     
			ldi      1
			eq?     
			bnt      code_2c68
			pushi    #walkingOut
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_2c62
			pushi    #newRoom
			pushi    1
			pushi    310
			lag      global2
			send     6
			jmp      code_2c68
code_2c62:
			dpToa    state
			ldi      1
			aTop     cycles
code_2c68:
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
			bnt      code_2cce
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
			jmp      code_2cf5
code_2cce:
			dup     
			ldi      1
			eq?     
			bnt      code_2cf5
			pushi    #walkingOut
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_2cef
			pushi    #newRoom
			pushi    1
			pushi    290
			lag      global2
			send     6
			jmp      code_2cf5
code_2cef:
			dpToa    state
			ldi      1
			aTop     cycles
code_2cf5:
			toss    
			ret     
		)
	)
)
