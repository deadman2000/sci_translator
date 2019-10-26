;;; Sierra Script 1.0 - (do not remove this comment)
(script# 280)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n812)
(use n851)
(use n939)
(use n945)
(use n946)
(use n950)
(use n992)
(use n998)
(use n999)

(public
	rm280 0
)

(local
	local0
	[local1 5] = [1280 54 1 2]
	[local6 7] = [1280 6 1 2 2 2]
	[local13 7] = [1280 13 1 1 1 1]
	[local20 8] = [1280 19 1 2 2 1 2]
	[local28 4] = [1280 24 2]
	[local32 7] = [1280 25 2 1 1 2]
	[local39 4] = [1280 29 2]
	[local43 4] = [1280 30 2]
	[local47 10] = [1280 31 2 1 2 2 1 2 2]
	[local57 9] = [1280 40 1 2 1 2 1 2]
	[local66 5] = [1280 48 1 2]
	[local71 6] = [1280 83 2 1 2]
	[local77 6] = [1280 86 2 1 2]
	[local83 7] = [1280 91 1 2 1 2]
	[local90 6] = [1280 96 1 2 2]
	[local96 7] = [1280 105 1 2 1 2]
	[local103 8] = [1280 115 1 2 1 2 1]
	[local111 5] = [1280 120 1 2]
	[local116 10] = [1280 127 2 1 2 2 2 2 2]
	[local126 13] = [1280 138 1 2 2 2 1 0 1280 149 1 2]
	[local139 10] = [1280 51 1 2 0 1280 52 1 2]
	[local149 16] = [1280 58 2 1 2 1 2 2 2 2 2 1 2 2 2]
	[local165 8] = [1280 76 1 2 1 2 1]
	[local173 4] = [1280 81 1]
	[local177 6] = [1280 111 1 1 1]
	[local183 3] = [-1 9396 21]
	[local186 3] = [-1 9417 21]
	[local189 3] = [-1 9430 21]
	[local192 3] = [-1 9444 21]
	[local195 3] = [-1 9459 21]
	[local198 3] = [-1 9469 21]
	[local201 3] = [-1 9479 21]
	[local204 3] = [-1 9492 21]
	[local207 3] = [-1 9497 21]
	[local210 3] = [-1 9506 21]
	[local213 3] = [-1 9513 21]
	[local216 3] = [-1 9520 21]
	[local219 3] = [-1 9528 21]
	[local222 3] = [-1 9536 21]
	[local225 3] = [-1 9547 21]
)
(procedure (localproc_000e param1)
	(asm
		pushi    1
		pushi    21
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Myrddin}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_0023 param1)
	(asm
		pushi    1
		pushi    21
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Cook}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_0038 param1)
	(asm
		pushi    1
		pushi    21
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {John Chapman}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_004d param1)
	(asm
		pushi    1
		pushi    21
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    67
		pushi    90
		pushi    100
		pushi    80
		lofsa    {Beggar}
		push    
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_0069 param1)
	(asm
		pushi    1
		pushi    21
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Confustis Obscuratus}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(instance rm280 of StdRoom
	(properties
		picture 280
		style $0064
		horizon 1
		north 260
		east 290
		south 260
		west 320
	)
	
	(method (init)
		(asm
			pushi    #setRegions
			pushi    1
			pushi    311
			self     6
			pushi    0
			calle    proc311_3,  0
			pushi    #addObstacle
			pushi    7
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    320
			pushi    49
			pushi    242
			pushi    49
			pushi    242
			pushi    40
			pushi    0
			pushi    40
			pushi    0
			pushi    0
			pushi    320
			pushi    0
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
			pushi    143
			pushi    54
			pushi    10
			pushi    54
			pushi    10
			pushi    50
			pushi    143
			pushi    50
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
			pushi    30
			pushi    281
			pushi    117
			pushi    292
			pushi    117
			pushi    292
			pushi    127
			pushi    920
			pushi    127
			pushi    920
			pushi    147
			pushi    287
			pushi    147
			pushi    274
			pushi    152
			pushi    133
			pushi    152
			pushi    137
			pushi    141
			pushi    95
			pushi    141
			pushi    69
			pushi    126
			pushi    69
			pushi    117
			pushi    224
			pushi    117
			pushi    241
			pushi    134
			pushi    257
			pushi    117
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     74
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    920
			pushi    103
			pushi    244
			pushi    103
			pushi    234
			pushi    111
			pushi    65
			pushi    111
			pushi    57
			pushi    123
			pushi    3
			pushi    123
			pushi    3
			pushi    90
			pushi    251
			pushi    90
			pushi    251
			pushi    75
			pushi    920
			pushi    75
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
			pushi    10
			pushi    91
			pushi    154
			pushi    18
			pushi    154
			pushi    18
			pushi    142
			pushi    91
			pushi    142
			pushi    97
			pushi    148
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
			pushi    18
			pushi    0
			pushi    185
			pushi    133
			pushi    185
			pushi    147
			pushi    175
			pushi    196
			pushi    175
			pushi    204
			pushi    186
			pushi    220
			pushi    175
			pushi    285
			pushi    175
			pushi    285
			pushi    189
			pushi    0
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
			pushi    8
			pushi    142
			pushi    58
			pushi    246
			pushi    58
			pushi    246
			pushi    80
			pushi    142
			pushi    80
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     18
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    107
			pushi    0
			lofsa    beggarHead
			send     10
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    107
			pushi    0
			lofsa    drinkerHand
			send     10
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    107
			pushi    0
			lofsa    fire
			send     10
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    107
			pushi    0
			lofsa    smoke
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    3
			dup     
			pushi    5
			pushi    4
			lofsa    fortuneTeller
			send     14
			pushi    #init
			pushi    0
			pushi    281
			pushi    3
			dup     
			pushi    5
			pushi    4
			lofsa    fortuneTellerBooth
			send     14
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    person24
			send     12
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    5
			lofsa    person20
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
			pushi    1
			pushi    5
			lofsa    person19
			send     10
			pushi    30
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
			lofsa    person16
			push    
			lofsa    person17
			push    
			lofsa    person18
			push    
			lofsa    person22
			push    
			lofsa    person23
			push    
			lofsa    person25
			push    
			lofsa    dogUnderTable
			push    
			lofsa    rectanglObject
			push    
			lofsa    garlic
			push    
			lofsa    cauldron
			push    
			lofsa    lowerRightTable
			push    
			lofsa    silkScarves
			push    
			lofsa    theFence
			push    
			lofsa    bigKeg
			push    
			lofsa    barrels
			push    
			lofsa    smallCask
			push    
			lofsa    largeDog
			push    
			lofsa    rugs
			push    
			calle    proc806_3,  60
			lag      global198
			not     
			bt       code_0369
			lsg      global198
			ldi      270
			gt?     
code_0369:
			bnt      code_0378
			pushi    #init
			pushi    0
			pushi    1
			pushi    316
			callk    ScriptID,  2
			send     4
code_0378:
			lsg      global12
			pToa     east
			eq?     
			bnt      code_03c5
			ldi      11
			aTop     style
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      49
			lt?     
			bnt      code_039b
			pushi    #y
			pushi    1
			pushi    49
			lag      global0
			send     6
code_039b:
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
			pushi    0
			callb    proc0_4,  0
			jmp      code_03f8
code_03c5:
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    65526
			pushi    160
			lag      global0
			send     8
			pushi    #setScript
			pushi    1
			lofsa    sEnterWest
			push    
			lag      global2
			send     6
			pushi    #fade
			pushi    4
			pushi    127
			pushi    30
			pushi    8
			pushi    0
			lag      global100
			send     12
			pushi    #init
			pushi    0
			super    StdRoom,  4
code_03f8:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_0401
			jmp      code_0442
code_0401:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0423
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitSouth
			push    
			lag      global2
			send     6
			jmp      code_0442
code_0423:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0442
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    sExitEast
			push    
			lag      global2
			send     6
code_0442:
			pushi    #doit
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
)

(instance smoke of Prop
	(properties
		x 274
		y 116
		view 280
		loop 4
		priority 10
		signal $4010
		cycleSpeed 24
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04af
			pushi    2
			pushi    1280
			pushi    160
			calle    proc13_4,  4
			jmp      code_04d7
code_04af:
			dup     
			ldi      3
			eq?     
			bnt      code_04cc
			pushi    3
			pushi    1280
			pushi    161
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_04d7
code_04cc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_04d7:
			toss    
			ret     
		)
	)
)

(instance beggarHead of Prop
	(properties
		x 169
		y 192
		approachX 143
		approachY 179
		view 280
		loop 1
		cel 5
		cycleSpeed 26
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_055e
			pushi    2
			pushi    1280
			pushi    126
			calle    proc13_4,  4
			jmp      code_05fd
code_055e:
			dup     
			ldi      5
			eq?     
			bnt      code_05a1
			pushi    #firstClikMan24
			pushi    0
			class    Fair
			send     4
			bnt      code_0593
			pushi    8
			pushi    2
			lea      @local116
			push    
			pushi    6
			pushi    0
			lea      @local213
			push    
			pushi    1
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClikMan24
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_05fd
code_0593:
			pushi    2
			pushi    1280
			pushi    134
			calle    proc13_4,  4
			jmp      code_05fd
code_05a1:
			dup     
			ldi      4
			eq?     
			bnt      code_05dd
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_05ce
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_05d9
			pushi    #setScript
			pushi    1
			lofsa    giveMoneyToBeg
			push    
			lag      global2
			send     6
			jmp      code_05d9
code_05ce:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_05d9:
			toss    
			jmp      code_05fd
code_05dd:
			dup     
			ldi      3
			eq?     
			bnt      code_05f2
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_05fd
code_05f2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_05fd:
			toss    
			ret     
		)
	)
)

(instance drinkerHand of Prop
	(properties
		x 77
		y 110
		approachX 106
		approachY 150
		view 280
		loop 2
		priority 12
		signal $4010
		cycleSpeed 28
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0684
			pushi    2
			pushi    1280
			pushi    90
			calle    proc13_4,  4
			jmp      code_0727
code_0684:
			dup     
			ldi      5
			eq?     
			bnt      code_06ce
			pushi    #firstClickMan13
			pushi    0
			class    Fair
			send     4
			bnt      code_06b9
			pushi    8
			pushi    2
			lea      @local83
			push    
			pushi    6
			pushi    0
			lea      @local201
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClickMan13
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_0727
code_06b9:
			pushi    3
			pushi    1280
			pushi    95
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0727
code_06ce:
			dup     
			ldi      4
			eq?     
			bnt      code_0707
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_06f8
			pushi    8
			pushi    2
			lea      @local90
			push    
			pushi    6
			pushi    0
			lea      @local201
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0703
code_06f8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0703:
			toss    
			jmp      code_0727
code_0707:
			dup     
			ldi      3
			eq?     
			bnt      code_071c
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0727
code_071c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0727:
			toss    
			ret     
		)
	)
)

(instance fire of Prop
	(properties
		x 274
		y 142
		view 280
		loop 3
		cel 2
		signal $4000
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_07af
			pushi    2
			pushi    1280
			pushi    160
			calle    proc13_4,  4
			jmp      code_07d7
code_07af:
			dup     
			ldi      3
			eq?     
			bnt      code_07cc
			pushi    3
			pushi    1280
			pushi    161
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_07d7
code_07cc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_07d7:
			toss    
			ret     
		)
	)
)

(instance person1 of Feature
	(properties
		x 42
		y 28
		nsTop 6
		nsLeft 33
		nsBottom 51
		nsRight 52
		sightAngle 90
		approachX 36
		approachY 57
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_085e
			pushi    2
			pushi    1280
			pushi    5
			calle    proc13_4,  4
			jmp      code_08db
code_085e:
			dup     
			ldi      5
			eq?     
			bnt      code_087f
			pushi    8
			pushi    2
			lea      @local6
			push    
			pushi    6
			pushi    0
			lea      @local183
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_08db
code_087f:
			dup     
			ldi      4
			eq?     
			bnt      code_08bb
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_08ac
			pushi    2
			pushi    1280
			pushi    10
			call     localproc_0069,  4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1280
			pushi    11
			calle    proc13_4,  4
			jmp      code_08b7
code_08ac:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_08b7:
			toss    
			jmp      code_08db
code_08bb:
			dup     
			ldi      3
			eq?     
			bnt      code_08d0
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_08db
code_08d0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_08db:
			toss    
			ret     
		)
	)
)

(instance person2 of Feature
	(properties
		x 85
		y 29
		nsTop 6
		nsLeft 76
		nsBottom 52
		nsRight 95
		sightAngle 90
		approachX 84
		approachY 60
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0938
			pushi    2
			pushi    1280
			pushi    12
			calle    proc13_4,  4
			jmp      code_09a2
code_0938:
			dup     
			ldi      5
			eq?     
			bnt      code_0956
			pushi    6
			pushi    1
			lea      @local13
			push    
			lea      @local186
			push    
			pushi    0
			pushi    0
			pushi    1
			calle    proc851_0,  12
			jmp      code_09a2
code_0956:
			dup     
			ldi      4
			eq?     
			bnt      code_0982
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0973
			pushi    2
			pushi    1280
			pushi    17
			calle    proc13_4,  4
			jmp      code_097e
code_0973:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_097e:
			toss    
			jmp      code_09a2
code_0982:
			dup     
			ldi      3
			eq?     
			bnt      code_0997
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
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

(instance person3 of Feature
	(properties
		x 46
		y 89
		z 40
		nsTop 36
		nsLeft 36
		nsBottom 62
		nsRight 56
		sightAngle 90
		approachX 47
		approachY 74
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_09fe
			pushi    2
			pushi    1280
			pushi    18
			calle    proc13_4,  4
			jmp      code_0b5b
code_09fe:
			dup     
			ldi      5
			eq?     
			bnt      code_0aaa
			pushi    1
			pushi    156
			callb    proc0_5,  2
			not     
			bnt      code_0a58
			pushi    #firstClickF3Talk
			pushi    0
			class    Fair
			send     4
			bnt      code_0a3e
			pushi    8
			pushi    2
			lea      @local20
			push    
			pushi    6
			pushi    0
			lea      @local189
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClickF3Talk
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_0b5b
code_0a3e:
			pushi    8
			pushi    2
			lea      @local28
			push    
			pushi    6
			pushi    0
			lea      @local189
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0b5b
code_0a58:
			pushi    1
			pushi    156
			callb    proc0_5,  2
			bnt      code_0b5b
			pushi    #firstClickF3Talk
			pushi    0
			class    Fair
			send     4
			bnt      code_0a90
			pushi    8
			pushi    2
			lea      @local32
			push    
			pushi    6
			pushi    0
			lea      @local189
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClickF3Talk
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_0b5b
code_0a90:
			pushi    8
			pushi    2
			lea      @local39
			push    
			pushi    6
			pushi    0
			lea      @local189
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0b5b
code_0aaa:
			dup     
			ldi      4
			eq?     
			bnt      code_0b3b
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0b2c
			pushi    1
			pushi    156
			callb    proc0_5,  2
			not     
			bnt      code_0b1f
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      6
			lt?     
			bnt      code_0af5
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    8
			pushi    2
			lea      @local43
			push    
			pushi    6
			pushi    0
			lea      @local189
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0b37
code_0af5:
			pushi    1
			pushi    156
			callb    proc0_6,  2
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    8
			pushi    2
			lea      @local47
			push    
			pushi    6
			pushi    0
			lea      @local189
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0b37
code_0b1f:
			pushi    2
			pushi    1280
			pushi    38
			calle    proc13_4,  4
			jmp      code_0b37
code_0b2c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b37:
			toss    
			jmp      code_0b5b
code_0b3b:
			dup     
			ldi      3
			eq?     
			bnt      code_0b50
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b5b
code_0b50:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b5b:
			toss    
			ret     
		)
	)
)

(instance person4 of Feature
	(properties
		x 96
		y 155
		z 100
		nsTop 49
		nsLeft 84
		nsBottom 61
		nsRight 109
		sightAngle 90
		approachX 104
		approachY 68
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0bb8
			pushi    2
			pushi    1280
			pushi    39
			calle    proc13_4,  4
			jmp      code_0c1a
code_0bb8:
			dup     
			ldi      5
			eq?     
			bnt      code_0bfa
			pushi    #man4FirstClickTk
			pushi    0
			class    Fair
			send     4
			bnt      code_0bed
			pushi    8
			pushi    2
			lea      @local57
			push    
			pushi    6
			pushi    0
			lea      @local192
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #talkedWithMan4
			pushi    1
			pushi    1
			class    Fair
			send     6
			jmp      code_0c1a
code_0bed:
			pushi    2
			pushi    1280
			pushi    46
			calle    proc13_4,  4
			jmp      code_0c1a
code_0bfa:
			dup     
			ldi      3
			eq?     
			bnt      code_0c0f
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c1a
code_0c0f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0c1a:
			toss    
			ret     
		)
	)
)

(instance person5 of Feature
	(properties
		x 116
		y 151
		z 100
		nsTop 40
		nsLeft 105
		nsBottom 62
		nsRight 128
		sightAngle 90
		approachX 104
		approachY 68
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c76
			pushi    2
			pushi    1280
			pushi    47
			calle    proc13_4,  4
			jmp      code_0cd0
code_0c76:
			dup     
			ldi      5
			eq?     
			bnt      code_0cb0
			pushi    #talkedWithMan4
			pushi    0
			class    Fair
			send     4
			bnt      code_0ca2
			pushi    8
			pushi    2
			lea      @local66
			push    
			pushi    6
			pushi    0
			lea      @local195
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0cd0
code_0ca2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
			jmp      code_0cd0
code_0cb0:
			dup     
			ldi      3
			eq?     
			bnt      code_0cc5
			pushi    3
			pushi    1280
			pushi    1
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

(instance person7 of Feature
	(properties
		x 271
		y 26
		nsTop 3
		nsLeft 261
		nsBottom 50
		nsRight 281
		sightAngle 90
		approachX 258
		approachY 53
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d2c
			pushi    2
			pushi    1280
			pushi    73
			calle    proc13_4,  4
			jmp      code_0d61
code_0d2c:
			dup     
			ldi      5
			eq?     
			bnt      code_0d41
			pushi    3
			pushi    1280
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d61
code_0d41:
			dup     
			ldi      3
			eq?     
			bnt      code_0d56
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d61
code_0d56:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0d61:
			toss    
			ret     
		)
	)
)

(instance person8 of Feature
	(properties
		x 300
		y 25
		nsTop 1
		nsLeft 285
		nsBottom 49
		nsRight 315
		sightAngle 90
		approachX 314
		approachY 57
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0dbe
			pushi    2
			pushi    1280
			pushi    74
			calle    proc13_4,  4
			jmp      code_0df3
code_0dbe:
			dup     
			ldi      5
			eq?     
			bnt      code_0dd3
			pushi    3
			pushi    1280
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_0df3
code_0dd3:
			dup     
			ldi      3
			eq?     
			bnt      code_0de8
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0df3
code_0de8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0df3:
			toss    
			ret     
		)
	)
)

(instance person9 of Feature
	(properties
		x 275
		y 149
		z 100
		nsTop 33
		nsLeft 265
		nsBottom 65
		nsRight 285
		sightAngle 90
		approachX 286
		approachY 76
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e50
			pushi    2
			pushi    1280
			pushi    75
			calle    proc13_4,  4
			jmp      code_0e86
code_0e50:
			dup     
			ldi      5
			eq?     
			bnt      code_0e66
			pushi    #setScript
			pushi    1
			lofsa    talkPerson9
			push    
			lag      global2
			send     6
			jmp      code_0e86
code_0e66:
			dup     
			ldi      3
			eq?     
			bnt      code_0e7b
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e86
code_0e7b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0e86:
			toss    
			ret     
		)
	)
)

(instance person10 of Feature
	(properties
		x 299
		y 149
		z 100
		nsTop 34
		nsLeft 285
		nsBottom 64
		nsRight 314
		sightAngle 90
		approachX 286
		approachY 76
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ee2
			pushi    2
			pushi    1280
			pushi    75
			calle    proc13_4,  4
			jmp      code_0f18
code_0ee2:
			dup     
			ldi      5
			eq?     
			bnt      code_0ef8
			pushi    #setScript
			pushi    1
			lofsa    talkWithPerson10
			push    
			lag      global2
			send     6
			jmp      code_0f18
code_0ef8:
			dup     
			ldi      3
			eq?     
			bnt      code_0f0d
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f18
code_0f0d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0f18:
			toss    
			ret     
		)
	)
)

(instance person11 of Feature
	(properties
		x 37
		y 123
		nsTop 97
		nsLeft 24
		nsBottom 149
		nsRight 51
		sightAngle 90
		approachX 20
		approachY 156
		_approachVerbs 20
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f74
			pushi    2
			pushi    1280
			pushi    82
			calle    proc13_4,  4
			jmp      code_0fc1
code_0f74:
			dup     
			ldi      3
			eq?     
			bnt      code_0f95
			pushi    8
			pushi    2
			lea      @local71
			push    
			pushi    6
			pushi    0
			lea      @local198
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0fc1
code_0f95:
			dup     
			ldi      5
			eq?     
			bnt      code_0fb6
			pushi    8
			pushi    2
			lea      @local77
			push    
			pushi    6
			pushi    0
			lea      @local198
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_0fc1
code_0fb6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0fc1:
			toss    
			ret     
		)
	)
)

(instance person12 of Feature
	(properties
		x 54
		y 126
		nsTop 101
		nsLeft 45
		nsBottom 151
		nsRight 63
		sightAngle 90
		approachX 41
		approachY 158
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_101e
			pushi    2
			pushi    1280
			pushi    89
			calle    proc13_4,  4
			jmp      code_1053
code_101e:
			dup     
			ldi      5
			eq?     
			bnt      code_1033
			pushi    3
			pushi    1280
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1053
code_1033:
			dup     
			ldi      3
			eq?     
			bnt      code_1048
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1053
code_1048:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1053:
			toss    
			ret     
		)
	)
)

(instance person13 of Feature
	(properties
		x 80
		y 124
		nsTop 96
		nsLeft 70
		nsBottom 152
		nsRight 91
		sightAngle 90
		approachX 106
		approachY 150
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_10b0
			pushi    2
			pushi    1280
			pushi    90
			calle    proc13_4,  4
			jmp      code_1151
code_10b0:
			dup     
			ldi      5
			eq?     
			bnt      code_10f8
			pushi    #firstClickMan13
			pushi    0
			class    Fair
			send     4
			bnt      code_10e5
			pushi    8
			pushi    2
			lea      @local83
			push    
			pushi    6
			pushi    0
			lea      @local201
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClickMan13
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_1151
code_10e5:
			pushi    2
			pushi    1280
			pushi    95
			call     localproc_0038,  4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1151
code_10f8:
			dup     
			ldi      4
			eq?     
			bnt      code_1131
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1122
			pushi    8
			pushi    2
			lea      @local90
			push    
			pushi    6
			pushi    0
			lea      @local201
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_112d
code_1122:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_112d:
			toss    
			jmp      code_1151
code_1131:
			dup     
			ldi      3
			eq?     
			bnt      code_1146
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1151
code_1146:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1151:
			toss    
			ret     
		)
	)
)

(instance person16 of Feature
	(properties
		x 215
		y 128
		nsTop 111
		nsLeft 197
		nsBottom 146
		nsRight 233
		sightAngle 90
		approachX 204
		approachY 159
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11ae
			pushi    2
			pushi    1280
			pushi    100
			calle    proc13_4,  4
			jmp      code_11e2
code_11ae:
			dup     
			ldi      5
			eq?     
			bnt      code_11c2
			pushi    2
			pushi    1280
			pushi    101
			calle    proc13_4,  4
			jmp      code_11e2
code_11c2:
			dup     
			ldi      3
			eq?     
			bnt      code_11d7
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_11e2
code_11d7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_11e2:
			toss    
			ret     
		)
	)
)

(instance person17 of Feature
	(properties
		x 216
		y 96
		nsTop 83
		nsLeft 198
		nsBottom 109
		nsRight 235
		sightAngle 90
		approachX 242
		approachY 113
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_123e
			pushi    2
			pushi    1280
			pushi    102
			calle    proc13_4,  4
			jmp      code_1272
code_123e:
			dup     
			ldi      5
			eq?     
			bnt      code_1252
			pushi    2
			pushi    1280
			pushi    103
			calle    proc13_4,  4
			jmp      code_1272
code_1252:
			dup     
			ldi      3
			eq?     
			bnt      code_1267
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1272
code_1267:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1272:
			toss    
			ret     
		)
	)
)

(instance person18 of Feature
	(properties
		x 258
		y 124
		nsTop 98
		nsLeft 248
		nsBottom 150
		nsRight 268
		sightAngle 90
		approachX 286
		approachY 148
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_12ce
			pushi    2
			pushi    1280
			pushi    104
			calle    proc13_4,  4
			jmp      code_1341
code_12ce:
			dup     
			ldi      5
			eq?     
			bnt      code_12ef
			pushi    8
			pushi    2
			lea      @local96
			push    
			pushi    6
			pushi    0
			lea      @local204
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_1341
code_12ef:
			dup     
			ldi      4
			eq?     
			bnt      code_1321
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1312
			pushi    2
			pushi    1280
			pushi    109
			call     localproc_0023,  4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_131d
code_1312:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_131d:
			toss    
			jmp      code_1341
code_1321:
			dup     
			ldi      3
			eq?     
			bnt      code_1336
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1341
code_1336:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1341:
			toss    
			ret     
		)
	)
)

(instance person19 of Feature
	(properties
		x 298
		y 120
		nsTop 99
		nsLeft 285
		nsBottom 141
		nsRight 311
		sightAngle 90
		approachX 301
		approachY 147
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_139e
			pushi    2
			pushi    1280
			pushi    110
			calle    proc13_4,  4
			jmp      code_13dc
code_139e:
			dup     
			ldi      5
			eq?     
			bnt      code_13bc
			pushi    6
			pushi    1
			lea      @local177
			push    
			lea      @local207
			push    
			pushi    0
			pushi    0
			pushi    1
			calle    proc851_0,  12
			jmp      code_13dc
code_13bc:
			dup     
			ldi      3
			eq?     
			bnt      code_13d1
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_13dc
code_13d1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_13dc:
			toss    
			ret     
		)
	)
)

(instance person20 of Feature
	(properties
		x 43
		y 274
		z 100
		nsTop 160
		nsLeft 27
		nsBottom 189
		nsRight 60
		sightAngle 90
		approachX 40
		approachY 183
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1438
			pushi    2
			pushi    1280
			pushi    114
			calle    proc13_4,  4
			jmp      code_14a7
code_1438:
			dup     
			ldi      5
			eq?     
			bnt      code_1487
			pushi    #firstClickMan20
			pushi    0
			class    Fair
			send     4
			bnt      code_146d
			pushi    8
			pushi    2
			lea      @local103
			push    
			pushi    6
			pushi    0
			lea      @local210
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClickMan20
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_14a7
code_146d:
			pushi    8
			pushi    2
			lea      @local111
			push    
			pushi    6
			pushi    0
			lea      @local210
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_14a7
code_1487:
			dup     
			ldi      3
			eq?     
			bnt      code_149c
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_14a7
code_149c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_14a7:
			toss    
			ret     
		)
	)
)

(instance person22 of Feature
	(properties
		x 115
		y 173
		nsTop 158
		nsLeft 105
		nsBottom 189
		nsRight 125
		sightAngle 90
		approachX 126
		approachY 188
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1504
			pushi    2
			pushi    1280
			pushi    124
			calle    proc13_4,  4
			jmp      code_1539
code_1504:
			dup     
			ldi      5
			eq?     
			bnt      code_1519
			pushi    3
			pushi    1280
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1539
code_1519:
			dup     
			ldi      3
			eq?     
			bnt      code_152e
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1539
code_152e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1539:
			toss    
			ret     
		)
	)
)

(instance person23 of Feature
	(properties
		x 136
		y 176
		nsTop 163
		nsLeft 126
		nsBottom 189
		nsRight 147
		sightAngle 90
		approachX 126
		approachY 188
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1596
			pushi    2
			pushi    1280
			pushi    125
			calle    proc13_4,  4
			jmp      code_15cb
code_1596:
			dup     
			ldi      5
			eq?     
			bnt      code_15ab
			pushi    3
			pushi    1280
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_15cb
code_15ab:
			dup     
			ldi      3
			eq?     
			bnt      code_15c0
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_15cb
code_15c0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_15cb:
			toss    
			ret     
		)
	)
)

(instance person24 of Feature
	(properties
		x 169
		y 278
		z 100
		nsTop 167
		nsLeft 144
		nsBottom 189
		nsRight 194
		sightAngle 90
		approachX 174
		approachY 175
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1628
			pushi    2
			pushi    1280
			pushi    126
			calle    proc13_4,  4
			jmp      code_16c7
code_1628:
			dup     
			ldi      5
			eq?     
			bnt      code_166b
			pushi    #firstClikMan24
			pushi    0
			class    Fair
			send     4
			bnt      code_165d
			pushi    8
			pushi    2
			lea      @local116
			push    
			pushi    6
			pushi    0
			lea      @local213
			push    
			pushi    1
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClikMan24
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_16c7
code_165d:
			pushi    2
			pushi    1280
			pushi    134
			calle    proc13_4,  4
			jmp      code_16c7
code_166b:
			dup     
			ldi      4
			eq?     
			bnt      code_16a7
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1698
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      1
			ge?     
			bnt      code_16a3
			pushi    #setScript
			pushi    1
			lofsa    giveMoneyToBeg
			push    
			lag      global2
			send     6
			jmp      code_16a3
code_1698:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_16a3:
			toss    
			jmp      code_16c7
code_16a7:
			dup     
			ldi      3
			eq?     
			bnt      code_16bc
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_16c7
code_16bc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_16c7:
			toss    
			ret     
		)
	)
)

(instance person25 of Feature
	(properties
		x 236
		y 170
		nsTop 164
		nsLeft 221
		nsBottom 177
		nsRight 251
		sightAngle 90
		approachX 254
		approachY 178
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1725
			pushi    2
			pushi    1280
			pushi    136
			calle    proc13_4,  4
			jmp      code_175a
code_1725:
			dup     
			ldi      5
			eq?     
			bnt      code_173a
			pushi    3
			pushi    1280
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_175a
code_173a:
			dup     
			ldi      3
			eq?     
			bnt      code_174f
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_175a
code_174f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_175a:
			toss    
			ret     
		)
	)
)

(instance person26 of Feature
	(properties
		x 268
		y 275
		z 100
		nsTop 162
		nsLeft 255
		nsBottom 189
		nsRight 282
		sightAngle 90
		approachX 269
		approachY 175
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_17b7
			pushi    2
			pushi    1280
			pushi    137
			calle    proc13_4,  4
			jmp      code_181a
code_17b7:
			dup     
			ldi      5
			eq?     
			bnt      code_17fa
			pushi    #firstClickF26
			pushi    0
			class    Fair
			send     4
			bnt      code_17ec
			pushi    8
			pushi    2
			lea      @local126
			push    
			pushi    6
			pushi    0
			lea      @local216
			push    
			pushi    1
			pushi    0
			pushi    1
			calle    proc851_0,  16
			pushi    #firstClickF26
			pushi    1
			pushi    0
			class    Fair
			send     6
			jmp      code_181a
code_17ec:
			pushi    2
			pushi    1280
			pushi    143
			calle    proc13_4,  4
			jmp      code_181a
code_17fa:
			dup     
			ldi      3
			eq?     
			bnt      code_180f
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_181a
code_180f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_181a:
			toss    
			ret     
		)
	)
)

(instance dogUnderTable of Feature
	(properties
		x 188
		y 143
		nsTop 136
		nsLeft 177
		nsBottom 150
		nsRight 200
		sightAngle 90
		approachX 176
		approachY 158
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1876
			pushi    2
			pushi    1280
			pushi    99
			calle    proc13_4,  4
			jmp      code_1896
code_1876:
			dup     
			ldi      3
			eq?     
			bnt      code_188b
			pushi    3
			pushi    1280
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1896
code_188b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1896:
			toss    
			ret     
		)
	)
)

(instance rectanglObject of Feature
	(properties
		x 23
		y 30
		nsTop 7
		nsLeft 13
		nsBottom 53
		nsRight 34
		sightAngle 90
		approachX 14
		approachY 61
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_18f3
			pushi    2
			pushi    1280
			pushi    144
			calle    proc13_4,  4
			jmp      code_1913
code_18f3:
			dup     
			ldi      3
			eq?     
			bnt      code_1908
			pushi    2
			pushi    1280
			pushi    145
			calle    proc13_4,  4
			jmp      code_1913
code_1908:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1913:
			toss    
			ret     
		)
	)
)

(instance garlic of Feature
	(properties
		x 124
		y 14
		nsLeft 111
		nsBottom 29
		nsRight 137
		sightAngle 90
		approachX 113
		approachY 57
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1971
			pushi    2
			pushi    1280
			pushi    146
			calle    proc13_4,  4
			jmp      code_1991
code_1971:
			dup     
			ldi      3
			eq?     
			bnt      code_1986
			pushi    2
			pushi    1280
			pushi    147
			calle    proc13_4,  4
			jmp      code_1991
code_1986:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1991:
			toss    
			ret     
		)
	)
)

(instance cauldron of Feature
	(properties
		x 277
		y 127
		nsTop 114
		nsLeft 264
		nsBottom 141
		nsRight 291
		sightAngle 90
		approachX 291
		approachY 146
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_19ef
			pushi    2
			pushi    1280
			pushi    160
			calle    proc13_4,  4
			jmp      code_1a15
code_19ef:
			dup     
			ldi      3
			eq?     
			bnt      code_1a0a
			pushi    2
			pushi    1280
			pushi    161
			call     localproc_0023,  4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1a15
code_1a0a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1a15:
			toss    
			ret     
		)
	)
)

(instance lowerRightTable of Feature
	(properties
		x 235
		y 181
		nsTop 174
		nsLeft 211
		nsBottom 189
		nsRight 259
		sightAngle 90
		approachX 254
		approachY 178
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a73
			pushi    2
			pushi    1280
			pushi    162
			calle    proc13_4,  4
			jmp      code_1a93
code_1a73:
			dup     
			ldi      3
			eq?     
			bnt      code_1a88
			pushi    2
			pushi    1280
			pushi    163
			calle    proc13_4,  4
			jmp      code_1a93
code_1a88:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1a93:
			toss    
			ret     
		)
	)
)

(instance silkScarves of Feature
	(properties
		x 48
		y 172
		z 100
		nsTop 59
		nsLeft 18
		nsBottom 85
		nsRight 78
		sightAngle 90
		approachX 2
		approachY 89
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1af1
			pushi    2
			pushi    1280
			pushi    153
			calle    proc13_4,  4
			jmp      code_1b11
code_1af1:
			dup     
			ldi      3
			eq?     
			bnt      code_1b06
			pushi    2
			pushi    1280
			pushi    154
			calle    proc13_4,  4
			jmp      code_1b11
code_1b06:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1b11:
			toss    
			ret     
		)
	)
)

(instance theFence of Feature
	(properties
		x 166
		y 80
		nsTop 59
		nsLeft 14
		nsBottom 102
		nsRight 319
		sightAngle 90
		onMeCheck $0002
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1b7a
			pushi    2
			pushi    1280
			pushi    151
			calle    proc13_4,  4
			pushi    2
			pushi    1280
			pushi    152
			calle    proc13_4,  4
			jmp      code_1b85
code_1b7a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1b85:
			toss    
			ret     
		)
	)
)

(instance bigKeg of Feature
	(properties
		x 106
		y 123
		z 20
		nsTop 75
		nsLeft 78
		nsBottom 131
		nsRight 135
		sightAngle 90
		approachX 131
		approachY 141
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1be3
			pushi    2
			pushi    1280
			pushi    155
			calle    proc13_4,  4
			jmp      code_1c03
code_1be3:
			dup     
			ldi      3
			eq?     
			bnt      code_1bf8
			pushi    2
			pushi    1280
			pushi    156
			calle    proc13_4,  4
			jmp      code_1c03
code_1bf8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1c03:
			toss    
			ret     
		)
	)
)

(instance barrels of Feature
	(properties
		x 160
		y 95
		nsTop 84
		nsLeft 140
		nsBottom 107
		nsRight 180
		sightAngle 90
		approachX 131
		approachY 141
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1c61
			pushi    2
			pushi    1280
			pushi    157
			calle    proc13_4,  4
			jmp      code_1c6c
code_1c61:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1c6c:
			toss    
			ret     
		)
	)
)

(instance smallCask of Feature
	(properties
		x 191
		y 106
		z 4
		nsTop 97
		nsLeft 185
		nsBottom 107
		nsRight 198
		sightAngle 90
		approachX 242
		approachY 113
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1cc9
			pushi    2
			pushi    1280
			pushi    158
			calle    proc13_4,  4
			jmp      code_1ce9
code_1cc9:
			dup     
			ldi      3
			eq?     
			bnt      code_1cde
			pushi    2
			pushi    1280
			pushi    159
			calle    proc13_4,  4
			jmp      code_1ce9
code_1cde:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1ce9:
			toss    
			ret     
		)
	)
)

(instance largeDog of Feature
	(properties
		x 79
		y 175
		nsTop 161
		nsLeft 68
		nsBottom 189
		nsRight 91
		sightAngle 90
		approachX 96
		approachY 179
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1d46
			pushi    2
			pushi    1280
			pushi    122
			calle    proc13_4,  4
			jmp      code_1d65
code_1d46:
			dup     
			ldi      3
			eq?     
			bnt      code_1d5a
			pushi    2
			pushi    1280
			pushi    123
			calle    proc13_4,  4
			jmp      code_1d65
code_1d5a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1d65:
			toss    
			ret     
		)
	)
)

(instance fortuneConv of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1dca
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    157
			callb    proc0_6,  2
			ldi      12
			aTop     ticks
			jmp      code_1e31
code_1dca:
			dup     
			ldi      1
			eq?     
			bnt      code_1de6
			pushi    3
			pushi    1280
			pushi    57
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1e31
code_1de6:
			dup     
			ldi      2
			eq?     
			bnt      code_1e00
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    3
			pushSelf
			lofsa    fortuneTeller
			send     10
			jmp      code_1e31
code_1e00:
			dup     
			ldi      3
			eq?     
			bnt      code_1e21
			pushi    8
			pushi    2
			lea      @local149
			push    
			pushi    6
			pushi    0
			lea      @local219
			push    
			pushi    2
			pushSelf
			pushi    1
			calle    proc851_0,  16
			jmp      code_1e31
code_1e21:
			dup     
			ldi      4
			eq?     
			bnt      code_1e31
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1e31:
			toss    
			ret     
		)
	)
)

(instance giveMoneyToBeg of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ea0
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    158
			callb    proc0_5,  2
			not     
			bnt      code_1e99
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    1
			pushi    158
			callb    proc0_6,  2
code_1e99:
			ldi      12
			aTop     ticks
			jmp      code_1f1d
code_1ea0:
			dup     
			ldi      1
			eq?     
			bnt      code_1ebd
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    154
			pushi    177
			pushSelf
			lag      global0
			send     12
			jmp      code_1f1d
code_1ebd:
			dup     
			ldi      2
			eq?     
			bnt      code_1eec
			pushi    #view
			pushi    1
			pushi    52
			pushi    284
			pushi    2
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
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     22
			jmp      code_1f1d
code_1eec:
			dup     
			ldi      3
			eq?     
			bnt      code_1f09
			pushi    3
			pushi    1280
			pushi    135
			pushSelf
			call     localproc_004d,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1f1d
code_1f09:
			dup     
			ldi      4
			eq?     
			bnt      code_1f1d
			pushi    0
			callb    proc0_4,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
code_1f1d:
			toss    
			ret     
		)
	)
)

(instance talkPerson9 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f71
			pushi    0
			callb    proc0_3,  0
			ldi      12
			aTop     ticks
			jmp      code_1fa4
code_1f71:
			dup     
			ldi      1
			eq?     
			bnt      code_1f94
			pushi    8
			pushi    2
			lea      @local165
			push    
			lea      @local222
			push    
			pushi    1
			lea      @local225
			push    
			pushi    2
			pushSelf
			pushi    1
			calle    proc851_0,  16
			jmp      code_1fa4
code_1f94:
			dup     
			ldi      2
			eq?     
			bnt      code_1fa4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1fa4:
			toss    
			ret     
		)
	)
)

(instance talkWithPerson10 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ff7
			pushi    0
			callb    proc0_3,  0
			ldi      12
			aTop     ticks
			jmp      code_2048
code_1ff7:
			dup     
			ldi      1
			eq?     
			bnt      code_2015
			pushi    6
			pushi    1
			lea      @local173
			push    
			lea      @local225
			push    
			pushi    0
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_2048
code_2015:
			dup     
			ldi      2
			eq?     
			bnt      code_2038
			pushi    8
			pushi    2
			lea      @local165
			push    
			lea      @local222
			push    
			pushi    1
			lea      @local225
			push    
			pushi    2
			pushSelf
			pushi    1
			calle    proc851_0,  16
			jmp      code_2048
code_2038:
			dup     
			ldi      3
			eq?     
			bnt      code_2048
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2048:
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
			bnt      code_20eb
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      187
			gt?     
			bnt      code_20c7
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
			jmp      code_20fd
code_20c7:
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
			jmp      code_20fd
code_20eb:
			dup     
			ldi      1
			eq?     
			bnt      code_20fd
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
code_20fd:
			toss    
			ret     
		)
	)
)

(instance fortuneTeller of Actor
	(properties
		x 189
		y 42
		nsTop 23
		nsLeft 173
		nsBottom 43
		nsRight 196
		approachX 185
		approachY 83
		view 280
		priority 4
		signal $4010
		cycleSpeed 24
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2150
			pushi    2
			pushi    1280
			pushi    50
			calle    proc13_4,  4
			jmp      code_225a
code_2150:
			dup     
			ldi      3
			eq?     
			bnt      code_2171
			pushi    8
			pushi    2
			lea      @local139
			push    
			pushi    6
			pushi    0
			lea      @local219
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_225a
code_2171:
			dup     
			ldi      5
			eq?     
			bnt      code_21ad
			lal      local0
			not     
			bnt      code_2193
			pushi    3
			pushi    1280
			pushi    53
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_225a
code_2193:
			pushi    8
			pushi    2
			lea      @local1
			push    
			pushi    6
			pushi    0
			lea      @local219
			push    
			pushi    2
			pushi    0
			pushi    1
			calle    proc851_0,  16
			jmp      code_225a
code_21ad:
			dup     
			ldi      4
			eq?     
			bnt      code_224f
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_2224
			pushi    1
			pushi    157
			callb    proc0_5,  2
			not     
			bnt      code_220f
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      2
			lt?     
			bnt      code_21f3
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    3
			pushi    1280
			pushi    56
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_224b
code_21f3:
			pushi    1
			pushi    25
			calle    proc806_1,  2
			ldi      1
			sal      local0
			pushi    #setScript
			pushi    1
			lofsa    fortuneConv
			push    
			lag      global2
			send     6
			jmp      code_224b
code_220f:
			pushi    3
			pushi    1280
			pushi    71
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_224b
code_2224:
			dup     
			ldi      17
			eq?     
			bnt      code_2240
			pushi    3
			pushi    1280
			pushi    72
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_224b
code_2240:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_224b:
			toss    
			jmp      code_225a
code_224f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_225a:
			toss    
			ret     
		)
	)
)

(instance fortuneTellerBooth of Feature
	(properties
		x 194
		y 32
		nsLeft 155
		nsBottom 65
		nsRight 233
		sightAngle 90
		approachX 185
		approachY 83
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_22f9
			pushi    2
			pushi    1280
			pushi    148
			calle    proc13_4,  4
			jmp      code_2306
code_22f9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			lofsa    fortuneTeller
			send     6
code_2306:
			toss    
			ret     
		)
	)
)

(instance rugs of Feature
	(properties
		x 31
		y 108
		nsTop 90
		nsLeft 1
		nsBottom 127
		nsRight 62
		sightAngle 90
		onMeCheck $0004
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2363
			pushi    2
			pushi    1280
			pushi    164
			calle    proc13_4,  4
			jmp      code_236e
code_2363:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_236e:
			toss    
			ret     
		)
	)
)

(instance sEnterWest of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23da
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    15
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_23ea
code_23da:
			dup     
			ldi      1
			eq?     
			bnt      code_23ea
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_23ea:
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
			bnt      code_2451
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
			jmp      code_2478
code_2451:
			dup     
			ldi      1
			eq?     
			bnt      code_2478
			pushi    #walkingOut
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_2472
			pushi    #newRoom
			pushi    1
			pushi    290
			lag      global2
			send     6
			jmp      code_2478
code_2472:
			dpToa    state
			ldi      1
			aTop     cycles
code_2478:
			toss    
			ret     
		)
	)
)
