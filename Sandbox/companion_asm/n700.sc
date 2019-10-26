;;; Sierra Script 1.0 - (do not remove this comment)
(script# 700)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n949)
(use n950)
(use n958)
(use n968)
(use n969)
(use n970)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm700 0
	longPole 1
	theBow 2
	theBoat 3
	quiver 4
)

(local
	local0
	[local1 8]
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	local16
	local17
	local18
	local19
	local20
	[local21 26]
	[local47 26] = [133 175 137 153 157 132 157 170 168 134 133 147 135 162 159 133 134 174 172 170 174 160 178 176 138 158]
	[local73 26] = [89 79 66 53 42 32 70 28 104 108 18 97 63 75 39 73 45 110 94 74 55 30 9 28 21 15]
	[local99 26] = [3 0 1 3 3 3 0 0 0 1 1 1 2 2 2 3 3 0 0 0 0 3 2 2 1 3]
	[local125 12]
	[local137 13] = [252 0 249 126 71 295 259 195 232 26 291 170 7]
	[local150 13] = [169 184 74 175 158 62 189 165 148 168 137 154 155]
	[local163 4] = [1700 42 1]
)
(procedure (localproc_001e &tmp temp0)
	(asm
		pushi    #init
		pushi    0
		lofsa    wispHolder
		send     4
		lsg      global87
		dup     
		ldi      0
		eq?     
		bnt      code_0038
		ldi      4
		sal      local0
		jmp      code_004a
code_0038:
		dup     
		ldi      1
		eq?     
		bnt      code_0046
		ldi      6
		sal      local0
		jmp      code_004a
code_0046:
		ldi      8
		sal      local0
code_004a:
		toss    
		ldi      0
		sat      temp0
code_004f:
		lst      temp0
		lal      local0
		lt?     
		bnt      code_00bc
		pushi    #new
		pushi    0
		lofsa    wisp
		send     4
		push    
		lat      temp0
		sali     local1
		pushi    #x
		pushi    1
		pushi    2
		pushi    15
		pushi    305
		callk    Random,  4
		push    
		pushi    3
		pushi    1
		pushi    2
		pushi    166
		pushi    203
		callk    Random,  4
		push    
		pushi    162
		pushi    1
		pushi    2
		pushi    0
		pushi    2
		callk    Random,  4
		push    
		pushi    308
		pushi    2
		pushi    2
		pushi    2
		pushi    107
		pushi    0
		pushi    289
		pushi    1
		pushi    1
		pushi    303
		pushi    1
		lofsa    wispHolder
		push    
		pushi    150
		pushi    1
		class    Fwd
		push    
		pushi    283
		pushi    2
		class    Wander
		push    
		pushi    230
		lat      temp0
		lali     local1
		send     56
		+at      temp0
		jmp      code_004f
code_00bc:
		pushi    #number
		pushi    1
		pushi    582
		pushi    6
		pushi    1
		pushi    65535
		pushi    42
		pushi    0
		lag      global168
		send     16
		ret     
	)
)

(procedure (localproc_00cf &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_00d5:
		lst      temp0
		ldi      12
		lt?     
		bnt      code_0100
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local137
		pushi    3
		pushi    1
		lsli     local150
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local125
		send     16
		+at      temp0
		jmp      code_00d5
code_0100:
		ret     
	)
)

(procedure (localproc_0101 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0107:
		lst      temp0
		ldi      26
		lt?     
		bnt      code_014a
		pushi    #new
		pushi    0
		lofsa    clIvy
		send     4
		push    
		lat      temp0
		sali     local21
		pushi    #x
		pushi    1
		lat      temp0
		lsli     local47
		pushi    3
		pushi    1
		lsli     local73
		pushi    162
		pushi    1
		lsli     local99
		pushi    288
		pushi    1
		pushi    221
		pushi    289
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		pushi    285
		pushi    0
		lali     local21
		send     38
		+at      temp0
		jmp      code_0107
code_014a:
		ret     
	)
)

(procedure (localproc_014b param1)
	(asm
		pushi    #obstacles
		pushi    0
		lag      global2
		send     4
		bnt      code_016c
		pushi    #dispose
		pushi    0
		pushi    #obstacles
		pushi    0
		lag      global2
		send     4
		send     4
		pushi    #obstacles
		pushi    1
		pushi    0
		lag      global2
		send     6
code_016c:
		pushi    374
		pushi    1
		lap      param1
		bnt      code_019c
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    8
		pushi    0
		pushi    0
		pushi    319
		pushi    0
		pushi    319
		pushi    153
		pushi    0
		pushi    153
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     30
		jmp      code_01f0
code_019c:
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    30
		pushi    0
		pushi    113
		pushi    57
		pushi    123
		pushi    136
		pushi    126
		pushi    221
		pushi    120
		pushi    256
		pushi    111
		pushi    239
		pushi    107
		pushi    197
		pushi    115
		pushi    149
		pushi    118
		pushi    92
		pushi    118
		pushi    34
		pushi    112
		pushi    0
		pushi    104
		pushi    0
		pushi    0
		pushi    319
		pushi    0
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
		send     74
code_01f0:
		push    
		lag      global2
		send     6
		ret     
	)
)

(instance rm700 of Rm
	(properties
		picture 700
		horizon 30
	)
	
	(method (init)
		(asm
			pushi    10
			pushi    128
			pushi    700
			pushi    703
			pushi    708
			pushi    711
			pushi    709
			pushi    21
			pushi    587
			pushi    15
			pushi    702
			calle    proc958_0,  20
			lag      global34
			sal      local20
			ldi      0
			sag      global34
			lsg      global12
			ldi      701
			eq?     
			bnt      code_02ac
			pushi    #style
			pushi    1
			pushi    13
			self     6
			pushi    #view
			pushi    1
			pushi    709
			pushi    6
			pushi    1
			pushi    2
			pushi    66
			pushi    1
			pushi    12
			pushi    267
			pushi    1
			lofsa    unusualDoVerb
			push    
			pushi    300
			pushi    1
			pushi    1
			pushi    3
			pushi    1
			pushi    31
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lag      global0
			send     46
			jmp      code_02b3
code_02ac:
			pushi    #style
			pushi    1
			pushi    10
			self     6
code_02b3:
			pushi    #init
			pushi    0
			super    Rm,  4
			lsg      global115
			ldi      1
			eq?     
			bnt      code_02d3
			pushi    #contains
			pushi    1
			lsl      local1
			lag      global5
			send     6
			not     
			bnt      code_02d3
			pushi    0
			call     localproc_001e,  0
code_02d3:
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      585
			ne?     
			bnt      code_02f4
			pushi    #number
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_02f4:
			pushi    #number
			pushi    0
			lag      global113
			send     4
			push    
			ldi      581
			ne?     
			bnt      code_0315
			pushi    #number
			pushi    1
			pushi    581
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
code_0315:
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0323
			pushi    0
			call     localproc_00cf,  0
code_0323:
			pushi    6
			lofsa    sky
			push    
			lofsa    theReeds
			push    
			lofsa    theIvy
			push    
			lofsa    bottomTower
			push    
			lofsa    clFog
			push    
			lofsa    theWater
			push    
			calle    proc806_3,  12
			lsg      global12
			ldi      701
			eq?     
			bnt      code_03c9
			ldi      21
			sag      global124
			ldi      1
			sal      local17
			ldi      1
			sal      local16
			pushi    0
			call     localproc_0101,  0
			pushi    #posn
			pushi    2
			pushi    149
			pushi    122
			pushi    107
			pushi    0
			lofsa    theBow
			send     12
			pushi    #init
			pushi    0
			lofsa    quiver
			send     4
			pushi    #init
			pushi    0
			lofsa    longPole
			send     4
			pushi    #view
			pushi    1
			pushi    21
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    2
			pushi    66
			pushi    1
			pushi    11
			pushi    284
			pushi    2
			pushi    110
			pushi    124
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    theBoat
			send     46
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			lag      global69
			send     8
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			jmp      code_0421
code_03c9:
			pushi    5
			pushi    #superClass
			pushi    587
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    20
			pushi    175
			pushi    308
			pushi    2
			pushi    4
			dup     
			pushi    219
			pushi    1
			pushi    18
			pushi    267
			pushi    1
			lofsa    unusualDoVerb
			push    
			pushi    62
			pushi    1
			lofsa    boatLooper
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4096
			or      
			push    
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lofsa    egoTogether
			push    
			lag      global0
			send     68
			pushi    1
			pushi    1
			call     localproc_014b,  2
code_0421:
			ret     
		)
	)
	
	(method (doit param1 &tmp temp0)
		(asm
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      118
			lt?     
			bnt      code_0465
			pushi    161
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			div     
			push    
			ldi      95
			add     
			push    
			lag      global100
			send     6
			pushi    161
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			div     
			push    
			ldi      95
			add     
			push    
			lag      global113
			send     6
code_0465:
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_049b
			+al      local14
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_049b
			lsl      local14
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_049b
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    65535
			callk    Palette,  8
code_049b:
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_04e7
			pushi    1
			pushi    110
			callb    proc0_7,  2
			lsg      global124
			ldi      21
			eq?     
			bnt      code_04db
			pushi    #contains
			pushi    1
			lofsa    clIvy
			push    
			lag      global5
			send     6
			not     
			bnt      code_04e7
			pushi    2
			pushi    25
			pushi    84
			calle    proc806_1,  4
			pushi    #setScript
			pushi    1
			lofsa    ivyDoubled
			push    
			lag      global0
			send     6
			jmp      code_04e7
code_04db:
			pushi    3
			pushi    1700
			pushi    7
			pushi    1
			calle    proc13_4,  6
code_04e7:
			lsg      global115
			ldi      1
			eq?     
			bnt      code_050c
			lsg      global19
			ldi      5
			ne?     
			bnt      code_050c
			pushi    #contains
			pushi    1
			lsl      local1
			lag      global5
			send     6
			not     
			bnt      code_050c
			pushi    0
			call     localproc_001e,  0
			jmp      code_062f
code_050c:
			lsg      global115
			ldi      1
			ne?     
			bnt      code_0558
			pushi    #contains
			pushi    1
			lsl      local1
			lag      global5
			send     6
			bnt      code_0558
			pushi    #stop
			pushi    0
			lag      global168
			send     4
			pushi    #dispose
			pushi    0
			lofsa    wispHolder
			send     4
			ldi      0
			sat      temp0
code_0534:
			lst      temp0
			lal      local0
			lt?     
			bnt      code_062f
			pushi    1
			lat      temp0
			lsli     local1
			callk    IsObject,  2
			bnt      code_0550
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local1
			send     4
code_0550:
			+at      temp0
			jmp      code_0534
			jmp      code_062f
code_0558:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0566
			jmp      code_062f
code_0566:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_059e
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_058f
			pushi    #setScript
			pushi    1
			lofsa    N
			push    
			lag      global0
			send     6
			jmp      code_062f
code_058f:
			pushi    #setScript
			pushi    1
			lofsa    outtaHere
			push    
			lag      global0
			send     6
			jmp      code_062f
code_059e:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      75
			gt?     
			bnt      code_05e8
			lal      local17
			bnt      code_05e8
			ldi      0
			sal      local17
			pushi    #enable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #message
			pushi    1
			pushi    3
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    704
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			pushi    1
			pushi    0
			call     localproc_014b,  2
			jmp      code_062f
code_05e8:
			pushi    130
			pushi    #x
			pushi    0
			lag      global0
			send     4
			le?     
			bnt      code_05fb
			pprev   
			ldi      170
			le?     
code_05fb:
			not     
			bnt      code_0627
			lal      local15
			not     
			bnt      code_0627
			lal      local17
			bnt      code_0627
			ldi      1
			sal      local15
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			pushi    2
			pushi    704
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global0
			send     12
			jmp      code_062f
code_0627:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
code_062f:
			pushi    #contains
			pushi    1
			lsl      local1
			lag      global5
			send     6
			bnt      code_0658
			pushi    161
			pushi    1
			pushi    #addAfter
			pushi    #distanceTo
			pushi    1
			lsl      local1
			lag      global0
			send     6
			push    
			ldi      3
			div     
			sub     
			push    
			lag      global168
			send     6
			jmp      code_0660
code_0658:
			pushi    #stop
			pushi    0
			lag      global168
			send     4
code_0660:
			ret     
		)
	)
	
	(method (dispose &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_0667:
			lst      temp0
			ldi      26
			lt?     
			bnt      code_0696
			pushi    #contains
			pushi    1
			lat      temp0
			lsli     local21
			lag      global5
			send     6
			bnt      code_0691
			pushi    1
			lat      temp0
			lsli     local21
			callk    IsObject,  2
			bnt      code_0691
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local21
			send     4
code_0691:
			+at      temp0
			jmp      code_0667
code_0696:
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global168
			send     12
			pushi    4
			pushi    0
			pushi    968
			pushi    970
			pushi    949
			calle    proc958_0,  8
			pushi    #contains
			pushi    1
			lofsa    chIvy
			push    
			lag      global5
			send     6
			bnt      code_06d0
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    chIvy
			send     8
code_06d0:
			ldi      0
			sag      global124
			lal      local20
			sag      global34
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (notify param1)
		(asm
			lsp      param1
			dup     
			ldi      1
			eq?     
			bnt      code_020a
			ldi      1
			sal      local16
			ldi      0
			sal      local15
			jmp      code_023c
code_020a:
			dup     
			ldi      2
			eq?     
			bnt      code_023c
			lsg      global115
			ldi      1
			eq?     
			bnt      code_023c
			lal      local12
			not     
			bnt      code_023c
			ldi      1
			sal      local12
			ldi      3
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushi    0
			pushi    9
			lag      global2
			send     10
code_023c:
			toss    
			ret     
		)
	)
	
	(method (reflectPosn)
		(asm
			ldi      0
			ret     
		)
	)
)

(instance boatLooper of SmoothLooper
	(properties
		cycleSpeed 18
		vChangeDir 588
	)
)

(instance wispHolder of Cage
	(properties)
	
	(method (init)
		(asm
			pushi    #top
			pushi    1
			pushi    165
			pushi    185
			pushi    1
			pushi    195
			pushi    184
			pushi    1
			pushi    15
			pushi    186
			pushi    1
			pushi    305
			self     24
			pushi    #init
			pushi    0
			super    Cage,  4
			ret     
		)
	)
)

(instance unusualDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_07ff
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      587
			eq?     
			bnt      code_07d7
			pushi    3
			pushi    1601
			pushi    99
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_0832
code_07d7:
			pushi    #contains
			pushi    1
			lofsa    clIvy
			push    
			lag      global5
			send     6
			not     
			bnt      code_0832
			lsg      global124
			ldi      21
			eq?     
			bnt      code_0832
			pushi    3
			pushi    1700
			pushi    8
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_0832
code_07ff:
			dup     
			ldi      4
			eq?     
			bnt      code_0832
			lal      local17
			bnt      code_081c
			pushi    3
			pushi    1700
			pushi    31
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_0832
code_081c:
			lsp      param2
			ldi      1
			eq?     
			bnt      code_0832
			pushi    3
			pushi    1700
			pushi    32
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_0832:
			toss    
			ret     
		)
	)
)

(instance sky of Feature
	(properties
		x 273
		y 25
		nsLeft 227
		nsBottom 50
		nsRight 319
		lookStr 47
	)
)

(instance bottomTower of Feature
	(properties
		x 118
		y 52
		nsBottom 137
		nsRight 236
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_08bc
			lal      local17
			bnt      code_08ad
			pushi    3
			pushi    1700
			pushi    14
			pushi    1
			calle    proc13_4,  6
			jmp      code_0905
code_08ad:
			pushi    3
			pushi    1700
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_0905
code_08bc:
			dup     
			ldi      3
			eq?     
			bnt      code_08fa
			lal      local17
			bt       code_08ca
			lal      local16
code_08ca:
			bnt      code_08dc
			pushi    3
			pushi    1700
			pushi    16
			pushi    1
			calle    proc13_4,  6
			jmp      code_0905
code_08dc:
			ldi      1
			sal      local16
			pushi    1
			pushi    0
			call     localproc_014b,  2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    704
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_0905
code_08fa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0905:
			toss    
			ret     
		)
	)
)

(instance theReeds of Feature
	(properties
		x 92
		y 84
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    48
			pushi    0
			pushi    116
			pushi    18
			pushi    98
			pushi    34
			pushi    98
			pushi    40
			pushi    119
			pushi    68
			pushi    102
			pushi    85
			pushi    122
			pushi    100
			pushi    118
			pushi    103
			pushi    99
			pushi    136
			pushi    128
			pushi    148
			pushi    118
			pushi    171
			pushi    117
			pushi    180
			pushi    127
			pushi    194
			pushi    113
			pushi    206
			pushi    104
			pushi    219
			pushi    101
			pushi    236
			pushi    117
			pushi    247
			pushi    86
			pushi    271
			pushi    94
			pushi    278
			pushi    84
			pushi    309
			pushi    111
			pushi    304
			pushi    129
			pushi    250
			pushi    146
			pushi    141
			pushi    150
			pushi    0
			pushi    149
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     110
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
			bnt      code_0964
			pushi    3
			pushi    1700
			pushi    17
			pushi    1
			calle    proc13_4,  6
			jmp      code_0985
code_0964:
			dup     
			ldi      3
			eq?     
			bnt      code_097a
			pushi    3
			pushi    1700
			pushi    18
			pushi    1
			calle    proc13_4,  6
			jmp      code_0985
code_097a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0985:
			toss    
			ret     
		)
	)
)

(instance clFog of Feature
	(properties
		x 278
		y 74
		nsTop 47
		nsLeft 237
		nsBottom 101
		nsRight 319
		lookStr 33
	)
)

(instance theWater of Feature
	(properties
		x 159
		y 145
		nsTop 101
		nsBottom 189
		nsRight 319
		lookStr 19
	)
)

(instance theIvy of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    32
			pushi    148
			pushi    0
			pushi    186
			pushi    0
			pushi    190
			pushi    12
			pushi    190
			pushi    43
			pushi    173
			pushi    55
			pushi    172
			pushi    70
			pushi    151
			pushi    84
			pushi    165
			pushi    107
			pushi    160
			pushi    119
			pushi    152
			pushi    118
			dup     
			pushi    100
			pushi    98
			pushi    82
			pushi    113
			pushi    59
			pushi    138
			pushi    48
			pushi    163
			pushi    56
			pushi    171
			pushi    27
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     78
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
			bnt      code_0b15
			pushi    #contains
			pushi    1
			lofsa    chIvy
			push    
			lag      global5
			send     6
			bnt      code_0b0a
			pushi    #dispose
			pushi    0
			lofsa    chIvy
			send     4
			jmp      code_0ba1
code_0b0a:
			pushi    #init
			pushi    0
			lofsa    chIvy
			send     4
			jmp      code_0ba1
code_0b15:
			dup     
			ldi      3
			eq?     
			bnt      code_0b96
			lsg      global124
			ldi      21
			eq?     
			bnt      code_0b33
			pushi    #setScript
			pushi    1
			lofsa    egoClimbQuiverBow
			push    
			lag      global0
			send     6
			jmp      code_0ba1
code_0b33:
			lal      local17
			bnt      code_0b47
			pushi    3
			pushi    1700
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ba1
code_0b47:
			lal      local16
			bnt      code_0b78
			lal      local19
			not     
			bnt      code_0b69
			ldi      1
			sal      local19
			ldi      1
			sal      local18
			pushi    #setScript
			pushi    1
			lofsa    egoClimbQuiverBow
			push    
			lag      global0
			send     6
			jmp      code_0ba1
code_0b69:
			pushi    3
			pushi    1700
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ba1
code_0b78:
			ldi      1
			sal      local16
			pushi    1
			pushi    0
			call     localproc_014b,  2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    704
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_0ba1
code_0b96:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0ba1:
			toss    
			ret     
		)
	)
)

(instance chIvy of View
	(properties
		x 30
		y 25
		view 700
		loop 4
		signal $4001
	)
	
	(method (doVerb)
		(asm
			pushi    #contains
			pushi    1
			lofsa    chIvy
			push    
			lag      global5
			send     6
			bnt      code_0c79
			pushi    #dispose
			pushi    0
			self     4
code_0c79:
			ret     
		)
	)
)

(instance quiver of View
	(properties
		x 157
		y 123
		lookStr 30
		view 15
		loop 4
		cel 6
		priority 9
		signal $0011
	)
)

(instance wave of Prop
	(properties
		view 700
		loop 6
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_0d5a
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			self     12
			jmp      code_0d6e
code_0d5a:
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Rev
			push    
			self     12
code_0d6e:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance clIvy of Prop
	(properties
		view 700
		signal $6000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0dfc
			pushi    3
			pushi    1700
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e8f
code_0dfc:
			dup     
			ldi      3
			eq?     
			bnt      code_0e84
			lsg      global124
			ldi      21
			eq?     
			bnt      code_0e25
			lal      local16
			bnt      code_0e25
			lal      local17
			not     
			bnt      code_0e25
			pushi    #setScript
			pushi    1
			lofsa    egoClimbQuiverBow
			push    
			lag      global0
			send     6
			jmp      code_0e8f
code_0e25:
			lal      local17
			bnt      code_0e39
			pushi    3
			pushi    1700
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e8f
code_0e39:
			lal      local16
			bnt      code_0e66
			lal      local19
			not     
			bnt      code_0e57
			ldi      1
			sal      local19
			pushi    #setScript
			pushi    1
			lofsa    egoClimbQuiverBow
			push    
			lag      global0
			send     6
			jmp      code_0e8f
code_0e57:
			pushi    3
			pushi    1700
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e8f
code_0e66:
			ldi      1
			sal      local16
			pushi    1
			pushi    0
			call     localproc_014b,  2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    704
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_0e8f
code_0e84:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0e8f:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #stopUpd
			pushi    0
			self     4
			ret     
		)
	)
)

(instance longPole of Prop
	(properties
		x 142
		y 148
		lookStr 28
		view 15
		loop 5
		cel 3
		priority 12
		signal $4011
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    theBoat
			send     6
			ret     
		)
	)
)

(instance wisp of Actor
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f9b
			pushi    3
			pushi    1601
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_104f
code_0f9b:
			dup     
			ldi      10
			eq?     
			bnt      code_0fb0
			pushi    3
			pushi    1601
			pushi    2
			pushi    0
			calle    proc13_4,  6
			jmp      code_104f
code_0fb0:
			dup     
			ldi      3
			eq?     
			bnt      code_0fc5
			pushi    3
			pushi    1601
			pushi    1
			pushi    0
			calle    proc13_4,  6
			jmp      code_104f
code_0fc5:
			dup     
			ldi      5
			eq?     
			bnt      code_1006
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      587
			eq?     
			bnt      code_0fea
			pushi    #setScript
			pushi    1
			lofsa    fraidyCat
			push    
			lag      global2
			send     6
			jmp      code_104f
code_0fea:
			ldi      3
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushi    0
			pushi    43
			lag      global0
			send     10
			jmp      code_104f
code_1006:
			dup     
			ldi      4
			eq?     
			bnt      code_1044
			pushi    1
			pushi    30
			calle    proc13_6,  2
			pushi    8
			pushi    1601
			pushi    6
			pushi    1
			pushi    67
			pushi    2
			pushi    15
			pushi    200
			callk    Random,  4
			push    
			pushi    2
			pushi    5
			pushi    100
			callk    Random,  4
			push    
			pushi    80
			lofsa    {Will-o-th'Wisps}
			push    
			calle    proc13_4,  16
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_104f
code_1044:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_104f:
			toss    
			ret     
		)
	)
)

(instance theBow of Prop
	(properties
		x 142
		y 150
		lookStr 29
		view 15
		loop 6
		cel 3
		priority 12
		signal $4811
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lal      local17
			bnt      code_10f2
			lal      local16
			bnt      code_10f2
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
			jmp      code_10ff
code_10f2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			lofsa    theBoat
			send     6
code_10ff:
			ret     
		)
	)
)

(instance theBoat of Prop
	(properties
		view 21
		loop 2
		cel 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_119a
			lal      local16
			bnt      code_118b
			pushi    3
			pushi    1700
			pushi    27
			pushi    1
			calle    proc13_4,  6
			jmp      code_11bb
code_118b:
			pushi    3
			pushi    1700
			pushi    26
			pushi    1
			calle    proc13_4,  6
			jmp      code_11bb
code_119a:
			dup     
			ldi      3
			eq?     
			bnt      code_11b0
			pushi    #setScript
			pushi    1
			lofsa    egoBoat
			push    
			lag      global0
			send     6
			jmp      code_11bb
code_11b0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_11bb:
			toss    
			ret     
		)
	)
)

(instance egoBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1251
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    144
			pushi    124
			pushSelf
			lag      global0
			send     12
			jmp      code_1439
code_1251:
			dup     
			ldi      1
			eq?     
			bnt      code_1273
			pushi    #setPri
			pushi    1
			pushi    10
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    142
			pushi    148
			pushSelf
			lag      global0
			send     18
			jmp      code_1439
code_1273:
			dup     
			ldi      2
			eq?     
			bnt      code_128f
			pushi    #y
			pushi    1
			pushi    150
			pushi    228
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     14
			jmp      code_1439
code_128f:
			dup     
			ldi      3
			eq?     
			bnt      code_12e7
			pushi    #view
			pushi    1
			pushi    15
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    289
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     38
			pushi    284
			pushi    #-info-
			pushi    142
			pushi    150
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    theBow
			send     24
			jmp      code_1439
code_12e7:
			dup     
			ldi      4
			eq?     
			bnt      code_12f5
			ldi      24
			aTop     cycles
			jmp      code_1439
code_12f5:
			dup     
			ldi      5
			eq?     
			bnt      code_131f
			pushi    #dispose
			pushi    0
			lofsa    theBow
			send     4
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lag      global0
			send     6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    longPole
			send     8
			jmp      code_1439
code_131f:
			dup     
			ldi      6
			eq?     
			bnt      code_1353
			pushi    #dispose
			pushi    0
			lofsa    longPole
			send     4
			pushi    #posn
			pushi    2
			pushi    133
			pushi    149
			pushi    162
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    11
			pushi    288
			pushi    1
			pushi    3
			lag      global0
			send     26
			ldi      12
			aTop     ticks
			jmp      code_1439
code_1353:
			dup     
			ldi      7
			eq?     
			bnt      code_137b
			pushi    #posn
			pushi    2
			pushi    136
			pushi    149
			pushi    162
			pushi    1
			pushi    7
			pushi    288
			pushi    1
			pushi    4
			lag      global0
			send     20
			ldi      12
			aTop     ticks
			jmp      code_1439
code_137b:
			dup     
			ldi      8
			eq?     
			bnt      code_13ae
			pushi    #dispose
			pushi    0
			lofsa    theBoat
			send     4
			pushi    #view
			pushi    1
			pushi    587
			pushi    162
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    148
			pushi    146
			lag      global0
			send     26
			ldi      12
			aTop     ticks
			jmp      code_1439
code_13ae:
			dup     
			ldi      9
			eq?     
			bnt      code_141f
			pushi    308
			pushi    2
			pushi    4
			dup     
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    267
			pushi    1
			lofsa    unusualDoVerb
			push    
			pushi    62
			pushi    1
			lofsa    boatLooper
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4096
			or      
			push    
			ldi      63487
			and     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      50
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      20
			add     
			push    
			pushSelf
			lag      global0
			send     50
			ldi      0
			sal      local16
			pushi    1
			pushi    1
			call     localproc_014b,  2
			jmp      code_1439
code_141f:
			dup     
			ldi      10
			eq?     
			bnt      code_1439
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1439:
			toss    
			ret     
		)
	)
)

(instance egoClimbQuiverBow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_149b
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    148
			pushi    121
			pushSelf
			lag      global0
			send     12
			jmp      code_1692
code_149b:
			dup     
			ldi      1
			eq?     
			bnt      code_14b0
			pushi    #setHeading
			pushi    2
			pushi    45
			pushSelf
			lag      global0
			send     8
			jmp      code_1692
code_14b0:
			dup     
			ldi      2
			eq?     
			bnt      code_14be
			ldi      12
			aTop     ticks
			jmp      code_1692
code_14be:
			dup     
			ldi      3
			eq?     
			bnt      code_150f
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    149
			pushi    122
			pushi    66
			pushi    1
			pushi    9
			pushi    219
			pushi    1
			pushi    18
			pushi    107
			pushi    0
			lofsa    theBow
			send     30
			pushi    #view
			pushi    1
			pushi    15
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    284
			pushi    2
			pushi    152
			pushi    126
			lag      global0
			send     32
			ldi      12
			aTop     ticks
			jmp      code_1692
code_150f:
			dup     
			ldi      4
			eq?     
			bnt      code_1531
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    theBow
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1692
code_1531:
			dup     
			ldi      5
			eq?     
			bnt      code_1550
			pushi    #stopUpd
			pushi    0
			lofsa    theBow
			send     4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1692
code_1550:
			dup     
			ldi      6
			eq?     
			bnt      code_157e
			pushi    #posn
			pushi    2
			pushi    149
			pushi    123
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lag      global0
			send     32
			jmp      code_1692
code_157e:
			dup     
			ldi      7
			eq?     
			bnt      code_15b1
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    quiver
			send     8
			pushi    #posn
			pushi    2
			pushi    152
			pushi    116
			lag      global0
			send     8
			pushi    3
			pushi    2
			pushi    702
			pushi    703
			callb    proc0_2,  6
			ldi      24
			aTop     ticks
			jmp      code_1692
code_15b1:
			dup     
			ldi      8
			eq?     
			bnt      code_15d7
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    145
			pushi    119
			pushSelf
			lag      global0
			send     12
			jmp      code_1692
code_15d7:
			dup     
			ldi      9
			eq?     
			bnt      code_161f
			lal      local18
			bnt      code_15f2
			pushi    #setScript
			pushi    1
			lofsa    moveToVines
			push    
			lag      global0
			send     6
			jmp      code_1692
code_15f2:
			pushi    #view
			pushi    1
			pushi    708
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    12
			pushi    289
			pushi    1
			pushi    1
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     42
			jmp      code_1692
code_161f:
			dup     
			ldi      10
			eq?     
			bnt      code_1692
			pushi    #view
			pushi    1
			pushi    709
			pushi    162
			pushi    1
			pushi    65535
			pushi    6
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    156
			pushi    75
			pushi    308
			pushi    2
			pushi    2
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			lag      global0
			send     40
			ldi      1
			sal      local17
			pushi    #eachElementDo
			pushi    1
			pushi    108
			dup     
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     10
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			lag      global69
			send     8
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1692:
			toss    
			ret     
		)
	)
)

(instance ivyDoubled of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16ef
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    theIvy
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_17b1
code_16ef:
			dup     
			ldi      1
			eq?     
			bnt      code_1755
			pushi    #contains
			pushi    1
			lofsa    chIvy
			push    
			lag      global5
			send     6
			bnt      code_170c
			pushi    #dispose
			pushi    0
			lofsa    chIvy
			send     4
code_170c:
			ldi      0
			sat      temp0
code_1710:
			lst      temp0
			ldi      26
			lt?     
			bnt      code_174e
			pushi    #new
			pushi    0
			lofsa    clIvy
			send     4
			push    
			lat      temp0
			sali     local21
			pushi    #x
			pushi    1
			lat      temp0
			lsli     local47
			pushi    3
			pushi    1
			lsli     local73
			pushi    162
			pushi    1
			lsli     local99
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			lat      temp0
			lsli     local21
			lali     local21
			send     30
			+at      temp0
			jmp      code_1710
code_174e:
			ldi      3
			aTop     seconds
			jmp      code_17b1
code_1755:
			dup     
			ldi      2
			eq?     
			bnt      code_1791
			ldi      0
			sat      temp0
code_1760:
			lst      temp0
			ldi      26
			lt?     
			bnt      code_1782
			pushi    1
			lat      temp0
			lsli     local21
			callk    IsObject,  2
			bnt      code_177d
			pushi    #stopUpd
			pushi    0
			lat      temp0
			lali     local21
			send     4
code_177d:
			+at      temp0
			jmp      code_1760
code_1782:
			pushi    3
			pushi    1700
			pushi    24
			pushSelf
			calle    proc13_4,  6
			jmp      code_17b1
code_1791:
			dup     
			ldi      3
			eq?     
			bnt      code_17b1
			pushi    0
			callb    proc0_4,  0
			lal      local16
			not     
			bnt      code_17ac
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
code_17ac:
			pushi    #dispose
			pushi    0
			self     4
code_17b1:
			toss    
			ret     
		)
	)
)

(instance N of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1826
			pushi    0
			callb    proc0_3,  0
			pushi    300
			pushi    #species
			pushi    283
			pushi    4
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
			ldi      65
			sub     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_1838
code_1826:
			dup     
			ldi      1
			eq?     
			bnt      code_1838
			pushi    #newRoom
			pushi    1
			pushi    701
			lag      global2
			send     6
code_1838:
			toss    
			ret     
		)
	)
)

(instance moveToVines of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18b5
			pushi    0
			callb    proc0_3,  0
			ldi      0
			sal      local18
			pushi    #view
			pushi    1
			pushi    708
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    1
			pushi    289
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    146
			pushi    119
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     40
			jmp      code_1991
code_18b5:
			dup     
			ldi      1
			eq?     
			bnt      code_18cb
			pushi    3
			pushi    1700
			pushi    22
			pushSelf
			calle    proc13_4,  6
			jmp      code_1991
code_18cb:
			dup     
			ldi      2
			eq?     
			bnt      code_1909
			pushi    #dispose
			pushi    0
			lofsa    quiver
			send     4
			pushi    #view
			pushi    1
			pushi    15
			pushi    284
			pushi    2
			pushi    149
			pushi    121
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    5
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     40
			jmp      code_1991
code_1909:
			dup     
			ldi      3
			eq?     
			bnt      code_192e
			pushi    #view
			pushi    1
			pushi    15
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
			jmp      code_1991
code_192e:
			dup     
			ldi      4
			eq?     
			bnt      code_196b
			pushi    288
			pushi    #superClass
			pushi    3
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    theBow
			send     24
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1991
code_196b:
			dup     
			ldi      5
			eq?     
			bnt      code_1991
			pushi    #dispose
			pushi    0
			lofsa    theBow
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
code_1991:
			toss    
			ret     
		)
	)
)

(instance egoTogether of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19f3
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    175
			pushSelf
			lag      global0
			send     12
			jmp      code_1a92
code_19f3:
			dup     
			ldi      1
			eq?     
			bnt      code_1a3b
			pushi    1
			pushi    26
			callb    proc0_5,  2
			not     
			bnt      code_1a2b
			lsg      global115
			ldi      1
			eq?     
			bnt      code_1a2b
			pushi    1
			pushi    26
			callb    proc0_6,  2
			ldi      2
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushSelf
			pushi    0
			self     10
			jmp      code_1a92
code_1a2b:
			pTos     state
			ldi      3
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1a92
code_1a3b:
			dup     
			ldi      2
			eq?     
			bnt      code_1a49
			ldi      2
			aTop     cycles
			jmp      code_1a92
code_1a49:
			dup     
			ldi      3
			eq?     
			bnt      code_1a6a
			ldi      3
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushSelf
			pushi    3
			self     10
			jmp      code_1a92
code_1a6a:
			dup     
			ldi      4
			eq?     
			bnt      code_1a78
			ldi      6
			aTop     ticks
			jmp      code_1a92
code_1a78:
			dup     
			ldi      5
			eq?     
			bnt      code_1a92
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
code_1a92:
			toss    
			ret     
		)
	)
)

(instance fraidyCat of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1afa
			pushi    0
			callb    proc0_3,  0
			ldi      3
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushSelf
			pushi    35
			self     10
			jmp      code_1c2a
code_1afa:
			dup     
			ldi      1
			eq?     
			bnt      code_1bb0
			pushi    0
			calle    proc851_1,  0
			bnt      code_1b9e
			ldi      0
			sat      temp0
code_1b0f:
			lst      temp0
			lal      local0
			lt?     
			bnt      code_1b73
			pushi    1
			lat      temp0
			lsli     local1
			callk    IsObject,  2
			bnt      code_1b6e
			pushi    162
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    304
			pushi    1
			lofsa    wispHolder
			push    
			pushi    308
			pushi    2
			pushi    5
			pushi    2
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    2
			pushi    #x
			pushi    0
			lat      temp0
			lali     local1
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #x
			pushi    0
			lat      temp0
			lali     local1
			send     4
			push    
			ldi      30
			add     
			push    
			callk    Random,  4
			push    
			pushi    250
			lat      temp0
			lali     local1
			send     30
code_1b6e:
			+at      temp0
			jmp      code_1b0f
code_1b73:
			pTos     state
			ldi      3
			add     
			aTop     state
			ldi      1
			sal      local13
			ldi      2
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushSelf
			pushi    39
			self     10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1c2a
code_1b9e:
			pushi    4
			lea      @local163
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1c2a
code_1bb0:
			dup     
			ldi      2
			eq?     
			bnt      code_1bbe
			ldi      2
			aTop     cycles
			jmp      code_1c2a
code_1bbe:
			dup     
			ldi      3
			eq?     
			bnt      code_1bdf
			ldi      3
			sal      local11
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    naiadPrinter
			send     4
			push    
			pushSelf
			pushi    43
			self     10
			jmp      code_1c2a
code_1bdf:
			dup     
			ldi      4
			eq?     
			bnt      code_1bfc
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1c2a
code_1bfc:
			dup     
			ldi      5
			eq?     
			bnt      code_1c2a
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			pushi    56
			pushi    1
			pushi    6
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    189
			lag      global0
			send     22
			pushi    #dispose
			pushi    0
			self     4
code_1c2a:
			toss    
			ret     
		)
	)
)

(instance outtaHere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d1a
			pushi    0
			callb    proc0_3,  0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			dup     
			ldi      3
			eq?     
			bnt      code_1caa
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
			ldi      40
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1d16
code_1caa:
			dup     
			ldi      4
			eq?     
			bnt      code_1cee
			lal      local16
			bnt      code_1cca
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    704
			pushi    1
			callk    ScriptID,  4
			push    
			pToa     client
			send     6
			jmp      code_1d16
code_1cca:
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1d16
code_1cee:
			dup     
			ldi      2
			eq?     
			bnt      code_1d16
			pushi    283
			pushi    #x
			class    PolyPath
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
			pushSelf
			lag      global0
			send     12
code_1d16:
			toss    
			jmp      code_1d38
code_1d1a:
			dup     
			ldi      1
			eq?     
			bnt      code_1d38
			pushi    377
			pushi    1
			lal      local13
			bnt      code_1d30
			ldi      600
			jmp      code_1d33
code_1d30:
			ldi      620
code_1d33:
			push    
			lag      global2
			send     6
code_1d38:
			toss    
			ret     
		)
	)
)

(instance naiadPrinter of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1dd2
			lag      global143
			sal      local9
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    1
			pushi    8
			lag      global69
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1e64
code_1dd2:
			dup     
			ldi      1
			eq?     
			bnt      code_1e16
			pushi    1
			pushi    30
			calle    proc13_6,  2
			pushi    8
			pushi    1700
			pTos     register
			lal      local10
			add     
			push    
			pushSelf
			pushi    67
			pushi    2
			pushi    15
			pushi    200
			callk    Random,  4
			push    
			pushi    2
			pushi    90
			pushi    150
			callk    Random,  4
			push    
			pushi    80
			lofsa    {Will-o-th'Wisps}
			push    
			calle    proc13_4,  16
			lal      local11
			bnt      code_1e64
			+al      local10
			jmp      code_1e64
code_1e16:
			dup     
			ldi      2
			eq?     
			bnt      code_1e38
			lal      local11
			bnt      code_1e2f
			lsl      local10
			le?     
			bnt      code_1e2f
			pTos     state
			ldi      2
			sub     
			aTop     state
code_1e2f:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1e64
code_1e38:
			dup     
			ldi      3
			eq?     
			bnt      code_1e64
			ldi      0
			sal      local10
			sal      local11
			lal      local9
			not     
			bnt      code_1e4f
			pushi    0
			callb    proc0_4,  0
code_1e4f:
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1e64:
			toss    
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			pToa     notKilled
			not     
			bnt      code_1da3
			pushi    1
			pushi    0
			calle    proc13_6,  2
			lal      local9
			not     
			bnt      code_1d8b
			pushi    1
			pushi    1
			callb    proc0_4,  2
code_1d8b:
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			ldi      0
			sal      local10
			sal      local11
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1dac
code_1da3:
			pushi    #cue
			pushi    0
			&rest    param1
			super    TScript,  4
code_1dac:
			ret     
		)
	)
)
