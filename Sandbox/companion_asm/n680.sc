;;; Sierra Script 1.0 - (do not remove this comment)
(script# 680)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n946)
(use n950)
(use n958)
(use n969)
(use n989)
(use n991)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm680 0
)

(local
	[local0 2]
	[local2 2] = [206 49]
	[local4 2] = [144 117]
	[local6 2] = [6 7]
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	local16
	[local17 4] = [1680 0 1]
	[local21 5] = [1680 24 1 2]
	[local26 4] = [1680 27 1]
	[local30 4] = [1680 28 1]
	[local34 4] = [1680 29 1]
	[local38 4] = [1680 31 1]
	[local42 4] = [1680 32 1]
	[local46 5] = [1680 34 1 2]
	[local51 4] = [1680 38 1]
	[local55 4] = [1680 39 1]
	[local59 4] = [1680 41 1]
	[local63 4] = [1680 42 1]
	[local67 4] = [1680 43 1]
	[local71 6] = [1680 44 2 1 2]
	[local77 4] = [1680 47 2]
	[local81 4] = [1680 49 2]
	[local85 4] = [1680 30 1]
	local89
)
(procedure (localproc_000e param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    cogito
		send     6
		pushi    1
		pushi    32
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    80
		lofsa    {Cogito}
		push    
		pushi    67
		pushi    160
		pushi    142
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_0038)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    cogito
		send     6
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_004b param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    vocalis
		send     6
		pushi    1
		pushi    32
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    80
		lofsa    {Vocalis}
		push    
		pushi    67
		pushi    160
		pushi    142
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_0075)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    vocalis
		send     6
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_0088 param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    hilaris
		send     6
		pushi    1
		pushi    32
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    80
		lofsa    {Hilaris}
		push    
		pushi    67
		pushi    160
		pushi    142
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_00b2)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    hilaris
		send     6
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_00c5 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_00cb:
		lst      temp0
		ldi      2
		lt?     
		bnt      code_00fb
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local2
		pushi    3
		pushi    1
		lsli     local4
		pushi    6
		pushi    1
		lsli     local6
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local0
		send     22
		+at      temp0
		jmp      code_00cb
code_00fb:
		ret     
	)
)

(instance rm680 of Rm
	(properties
		picture 680
		north 690
		east 630
		south 630
	)
	
	(method (init)
		(asm
			pushi    3
			pushi    130
			pushi    939
			pushi    991
			calle    proc958_0,  6
			pushi    8
			pushi    128
			pushi    22
			pushi    620
			pushi    15
			pushi    19
			pushi    20
			pushi    585
			pushi    674
			calle    proc958_0,  16
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0137
			pushi    0
			call     localproc_00c5,  0
code_0137:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    207
			pushi    189
			pushi    207
			pushi    186
			pushi    276
			pushi    171
			pushi    319
			pushi    179
			pushi    319
			pushi    183
			pushi    282
			pushi    176
			pushi    273
			pushi    180
			pushi    267
			pushi    177
			pushi    216
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
			pushi    28
			pushi    12
			pushi    31
			pushi    319
			pushi    55
			pushi    318
			pushi    147
			pushi    276
			pushi    146
			pushi    228
			pushi    153
			pushi    166
			pushi    127
			pushi    121
			pushi    135
			pushi    84
			pushi    123
			pushi    73
			pushi    133
			pushi    68
			pushi    139
			pushi    47
			pushi    152
			pushi    14
			pushi    155
			pushi    106
			pushi    189
			pushi    0
			pushi    179
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			push    
			lag      global2
			send     8
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
			pushi    #number
			pushi    1
			pushi    24
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #init
			pushi    0
			lofsa    cogito
			send     4
			pushi    #init
			pushi    0
			lofsa    ineptus
			send     4
			pushi    #init
			pushi    0
			lofsa    vocalis
			send     4
			pushi    #init
			pushi    0
			lofsa    hilaris
			send     4
			pushi    #init
			pushi    0
			lofsa    waterGate
			send     4
			pushi    6
			lofsa    malitia
			push    
			lofsa    ieiunus
			push    
			lofsa    deformis
			push    
			lofsa    mooringPost
			push    
			lofsa    water
			push    
			lofsa    everything
			push    
			calle    proc806_3,  12
			pushi    #firstTimeEnter
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_02c2
			pushi    #firstTimeEnter
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    #init
			pushi    0
			lofsa    fulk
			send     4
			pushi    #init
			pushi    0
			lofsa    theBoat
			send     4
			pushi    #init
			pushi    0
			lofsa    thePole
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    95
			pushi    182
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     24
			pushi    #setScript
			pushi    1
			lofsa    stepInBoat
			push    
			lag      global0
			send     6
			jmp      code_036a
code_02c2:
			pushi    #view
			pushi    1
			pushi    674
			pushi    162
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			pushi    17
			pushi    1
			pushi    16
			pushi    4
			pushi    1
			pushi    154
			pushi    3
			pushi    1
			pushi    173
			pushi    107
			pushi    0
			lofsa    fulk
			send     46
			pushi    #view
			pushi    1
			pushi    21
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    6
			pushi    17
			pushi    1
			pushi    16
			pushi    284
			pushi    2
			pushi    177
			pushi    157
			pushi    107
			pushi    0
			lofsa    theBoat
			send     42
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    95
			pushi    182
			pushi    66
			pushi    1
			pushi    10
			pushi    17
			pushi    1
			pushi    16
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     36
			pushi    #posn
			pushi    2
			pushi    120
			pushi    161
			pushi    66
			pushi    1
			pushi    8
			pushi    107
			pushi    0
			lofsa    thePole
			send     18
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
code_036a:
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			+al      local9
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_03a1
			lsl      local9
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_03a1
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    65535
			callk    Palette,  8
code_03a1:
			lal      local89
			not     
			bnt      code_03f7
			pushi    #waterDie
			pushi    0
			class    Monastery
			send     4
			bnt      code_03b5
			lal      local12
			not     
code_03b5:
			bt       code_03c3
			lsg      global115
			ldi      2
			eq?     
			bnt      code_03f7
			lal      local12
			not     
code_03c3:
			bnt      code_03f7
			ldi      1
			sal      local89
			lal      local16
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    theBoat
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #waterDie
			pushi    1
			pushi    0
			class    Monastery
			send     6
			pushi    #setScript
			pushi    1
			lofsa    monkKillBoat
			push    
			lag      global0
			send     6
			jmp      code_04b6
code_03f7:
			lal      local89
			not     
			bnt      code_0441
			pushi    #waterDie
			pushi    0
			class    Monastery
			send     4
			bt       code_040d
			lsg      global115
			ldi      2
			eq?     
code_040d:
			bnt      code_0441
			ldi      1
			sal      local89
			lal      local16
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    theBoat
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #waterDie
			pushi    1
			pushi    0
			class    Monastery
			send     6
			pushi    #setScript
			pushi    1
			lofsa    timesUp
			push    
			lag      global0
			send     6
			jmp      code_04b6
code_0441:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0451
			ldi      0
			jmp      code_04b6
code_0451:
			lal      local12
			bnt      code_0494
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_0475
			pushi    #setScript
			pushi    1
			lofsa    moveAway
			push    
			lag      global0
			send     6
			jmp      code_04b6
code_0475:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      16
			and     
			bnt      code_04b6
			pushi    #setScript
			pushi    1
			lofsa    egoDock
			push    
			lag      global0
			send     6
			jmp      code_04b6
code_0494:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			bnt      code_04b6
			lal      local12
			not     
			bnt      code_04b6
			pushi    #setScript
			pushi    1
			lofsa    egoGetsInBoat
			push    
			lag      global0
			send     6
code_04b6:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global74
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    1
			pushi    991
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
	
	(method (handleEvent pEvent)
		(asm
			lal      local12
			bnt      code_061d
			lsg      global19
			ldi      2
			eq?     
			bnt      code_061d
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_04f5
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			not     
			bnt      code_04f5
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			not     
code_04f5:
			bt       code_0511
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_061d
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0511:
			bnt      code_061d
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    ineptus
			send     6
			bnt      code_0545
			lsl      local10
			ldi      2
			eq?     
			bnt      code_0545
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      3
			sal      local10
			pushi    #setScript
			pushi    1
			lofsa    raiseTheGrate
			push    
			lag      global0
			send     6
			jmp      code_0611
code_0545:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    ieiunus
			send     6
			bnt      code_057b
			lsl      local10
			ldi      1
			eq?     
			bnt      code_057b
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      2
			sal      local10
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0611
code_057b:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    cogito
			send     6
			bnt      code_05b2
			lsl      local10
			ldi      0
			eq?     
			bnt      code_05b2
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      1
			sal      local10
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0611
code_05b2:
			ldi      0
			sal      local10
			lal      local12
			bnt      code_060f
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    ineptus
			send     6
			bnt      code_05e5
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0611
code_05e5:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    ieiunus
			send     6
			bnt      code_0611
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0611
code_060f:
			ldi      0
code_0611:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Rm,  6
			jmp      code_0626
code_061d:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Rm,  6
code_0626:
			ret     
		)
	)
)

(instance water of Feature
	(properties
		x 52
		y 110
		lookStr 20
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    42
			pushi    52
			pushi    115
			pushi    67
			pushi    110
			pushi    114
			pushi    126
			pushi    139
			pushi    126
			pushi    164
			pushi    118
			pushi    201
			pushi    124
			pushi    197
			pushi    131
			pushi    238
			pushi    140
			pushi    271
			pushi    135
			pushi    319
			pushi    144
			pushi    319
			pushi    179
			pushi    274
			pushi    171
			pushi    209
			pushi    189
			pushi    181
			pushi    189
			pushi    126
			pushi    172
			pushi    99
			pushi    170
			pushi    72
			pushi    162
			pushi    58
			pushi    161
			pushi    58
			pushi    156
			pushi    33
			pushi    149
			pushi    59
			pushi    134
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
)

(instance everything of Feature
	(properties
		x 160
		nsBottom 189
		nsRight 319
		sightAngle 180
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_079f
			pushi    3
			pushi    1680
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_07aa
code_079f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_07aa:
			ret     
		)
	)
)

(instance mooringPost of Feature
	(properties
		x 262
		y 184
		lookStr 22
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    262
			pushi    178
			pushi    274
			pushi    173
			pushi    270
			pushi    168
			pushi    276
			pushi    164
			pushi    280
			pushi    167
			pushi    277
			pushi    171
			pushi    290
			pushi    176
			pushi    273
			pushi    184
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
)

(instance malitia of Feature
	(properties
		x 20
		y 112
		approachX 87
		approachY 126
		lookStr 10
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    20
			pushi    82
			pushi    42
			pushi    80
			pushi    54
			pushi    91
			pushi    54
			pushi    99
			pushi    43
			pushi    111
			pushi    24
			pushi    112
			pushi    14
			pushi    104
			pushi    13
			pushi    91
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
			ldi      3
			eq?     
			bnt      code_08c6
			lal      local12
			bnt      code_08b7
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    4
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_097c
code_08b7:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_097c
code_08c6:
			dup     
			ldi      5
			eq?     
			bnt      code_0973
			lsl      local11
			dup     
			ldi      0
			eq?     
			bnt      code_0901
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    7
			pushi    1680
			pushi    11
			pushi    80
			lofsa    {Malitia}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  14
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0962
code_0901:
			dup     
			ldi      1
			eq?     
			bnt      code_0933
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    7
			pushi    1680
			pushi    13
			pushi    80
			lofsa    {Malitia}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  14
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0962
code_0933:
			dup     
			ldi      2
			eq?     
			bnt      code_0962
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    7
			pushi    1680
			pushi    14
			pushi    80
			lofsa    {Malitia}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  14
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_0962:
			toss    
			+al      local11
			push    
			ldi      2
			gt?     
			bnt      code_097c
			ldi      0
			sal      local11
			jmp      code_097c
code_0973:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_097c:
			toss    
			ret     
		)
	)
)

(instance ieiunus of Feature
	(properties
		x 106
		y 79
		approachX 126
		approachY 131
		lookStr 16
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    106
			pushi    33
			pushi    109
			pushi    45
			pushi    118
			pushi    44
			pushi    137
			pushi    68
			pushi    115
			pushi    71
			pushi    110
			pushi    77
			pushi    106
			pushi    79
			pushi    95
			pushi    71
			pushi    90
			pushi    59
			pushi    93
			pushi    46
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
			ldi      3
			eq?     
			bnt      code_0a8d
			lal      local12
			bnt      code_0a7e
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0ac8
code_0a7e:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ac8
code_0a8d:
			dup     
			ldi      5
			eq?     
			bnt      code_0abf
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    7
			pushi    1680
			pushi    17
			pushi    80
			lofsa    {Ieiunus}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  14
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0ac8
code_0abf:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0ac8:
			toss    
			ret     
		)
	)
)

(instance deformis of Feature
	(properties
		x 111
		y 127
		approachX 126
		approachY 131
		lookStr 18
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    111
			pushi    100
			pushi    139
			pushi    100
			pushi    149
			pushi    117
			pushi    141
			pushi    125
			pushi    117
			pushi    127
			pushi    108
			pushi    115
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
			ldi      3
			eq?     
			bnt      code_0b8e
			lal      local12
			bnt      code_0b7f
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    7
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0bc9
code_0b7f:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bc9
code_0b8e:
			dup     
			ldi      5
			eq?     
			bnt      code_0bc0
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    7
			pushi    1680
			pushi    19
			pushi    80
			lofsa    {Deformis}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  14
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0bc9
code_0bc0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0bc9:
			toss    
			ret     
		)
	)
)

(instance cogito of Prop
	(properties
		x 36
		y 145
		approachX 69
		approachY 134
		lookStr 1
		view 681
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0c52
			lal      local12
			bnt      code_0c43
			pushi    3
			pushi    1680
			pushi    52
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c71
code_0c43:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c71
code_0c52:
			dup     
			ldi      5
			eq?     
			bnt      code_0c68
			pushi    #setScript
			pushi    1
			lofsa    cogitoTalks
			push    
			lag      global0
			send     6
			jmp      code_0c71
code_0c68:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0c71:
			toss    
			ret     
		)
	)
)

(instance ineptus of Prop
	(properties
		x 46
		y 78
		approachX 69
		approachY 134
		lookStr 4
		view 681
		loop 1
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0d0e
			lal      local12
			bnt      code_0cff
			pushi    #setScript
			pushi    1
			lofsa    viciouslyPullTongue
			push    
			lag      global0
			send     6
			jmp      code_0d49
code_0cff:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d49
code_0d0e:
			dup     
			ldi      5
			eq?     
			bnt      code_0d40
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    7
			pushi    1680
			pushi    5
			pushi    80
			lofsa    {Ineptus}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  14
			ldi      1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0d49
code_0d40:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0d49:
			toss    
			ret     
		)
	)
)

(instance vocalis of Prop
	(properties
		x 80
		y 65
		approachX 87
		approachY 126
		lookStr 6
		view 681
		loop 2
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0dec
			lal      local12
			bnt      code_0ddd
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    5
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0e0b
code_0ddd:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e0b
code_0dec:
			dup     
			ldi      5
			eq?     
			bnt      code_0e02
			pushi    #setScript
			pushi    1
			lofsa    vocalisTalks
			push    
			lag      global0
			send     6
			jmp      code_0e0b
code_0e02:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0e0b:
			toss    
			ret     
		)
	)
)

(instance hilaris of Prop
	(properties
		x 125
		y 95
		approachX 126
		approachY 131
		lookStr 8
		view 681
		loop 3
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0eae
			lal      local12
			bnt      code_0e9f
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    681
			pushi    6
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0ecd
code_0e9f:
			pushi    3
			pushi    1680
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ecd
code_0eae:
			dup     
			ldi      5
			eq?     
			bnt      code_0ec4
			pushi    #setScript
			pushi    1
			lofsa    hilarisTalks
			push    
			lag      global0
			send     6
			jmp      code_0ecd
code_0ec4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0ecd:
			toss    
			ret     
		)
	)
)

(instance waterGate of Prop
	(properties
		x 72
		y 65
		view 681
		loop 5
		signal $4001
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f71
			lsl      local14
			ldi      0
			eq?     
			bnt      code_0f62
			ldi      1
			sal      local14
			pushi    #setScript
			pushi    1
			lofsa    askTheDwarf
			push    
			lag      global0
			send     6
			jmp      code_0f90
code_0f62:
			pushi    3
			pushi    1680
			pushi    36
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f90
code_0f71:
			dup     
			ldi      3
			eq?     
			bnt      code_0f87
			pushi    3
			pushi    1680
			pushi    37
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f90
code_0f87:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0f90:
			toss    
			ret     
		)
	)
)

(instance wave of Prop
	(properties
		view 681
		priority 1
		signal $4010
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_1020
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
			jmp      code_1034
code_1020:
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
code_1034:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance theBoat of Actor
	(properties
		x 231
		y 177
		lookStr 23
		view 21
		loop 1
		cel 1
		priority 4
		signal $4011
	)
	
	(method (doit)
		(asm
			lal      local12
			bnt      code_111a
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_111a
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_1120
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      68
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			self     8
			jmp      code_1120
code_111a:
			pushi    #doit
			pushi    0
			super    Actor,  4
code_1120:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_10d4
			lal      local12
			bnt      code_10c5
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
			jmp      code_10dd
code_10c5:
			pushi    #setScript
			pushi    1
			lofsa    egoGetsInBoat
			push    
			lag      global0
			send     6
			jmp      code_10dd
code_10d4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_10dd:
			ret     
		)
	)
)

(instance fulk of Actor
	(properties
		x 277
		y 189
		view 671
		loop 1
		cel 1
		signal $4000
	)
	
	(method (doit)
		(asm
			lal      local12
			bnt      code_11e8
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_11e8
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_11ee
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      45
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			self     8
			jmp      code_11ee
code_11e8:
			pushi    #doit
			pushi    0
			super    Actor,  4
code_11ee:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1207
			pushi    #setScript
			pushi    1
			lofsa    lookAtFulk
			push    
			lag      global0
			send     6
			jmp      code_12e1
code_1207:
			dup     
			ldi      3
			eq?     
			bnt      code_1228
			pushi    4
			lea      @local26
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_12e1
code_1228:
			dup     
			ldi      5
			eq?     
			bnt      code_1249
			pushi    4
			lea      @local30
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_12e1
code_1249:
			dup     
			ldi      4
			eq?     
			bnt      code_12e1
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1276
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_12e0
			pushi    #setScript
			pushi    1
			lofsa    giveFulkMoney
			push    
			lag      global0
			send     6
			jmp      code_12e0
code_1276:
			dup     
			ldi      2
			eq?     
			bnt      code_1297
			pushi    4
			lea      @local85
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_12e0
code_1297:
			dup     
			ldi      14
			eq?     
			bnt      code_12c2
			pushi    4
			lea      @local38
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #put
			pushi    1
			pushi    14
			lag      global0
			send     6
			jmp      code_12e0
code_12c2:
			dup     
			ldi      17
			eq?     
			bnt      code_12e0
			pushi    4
			lea      @local42
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
code_12e0:
			toss    
code_12e1:
			toss    
			ret     
		)
	)
)

(instance killMonk of Actor
	(properties
		x 124
		y 225
		view 128
		loop 3
		signal $4000
	)
)

(instance theRock of Actor
	(properties
		x 85
		y 9
		view 620
		loop 3
		priority 10
		signal $4810
		illegalBits $0000
	)
)

(instance thePole of Actor
	(properties
		x 175
		y 181
		view 19
		loop 5
		priority 5
		signal $4000
		illegalBits $0000
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_147e
			pushi    #setScript
			pushi    1
			lofsa    egoGetsInBoat
			push    
			lag      global0
			send     6
code_147e:
			ret     
		)
	)
)

(instance thePrior of Actor
	(properties
		x 119
		y 225
		view 641
		loop 4
		signal $4000
	)
)

(instance viciouslyPullTongue of Script
	(properties)
	
	(method (init)
		(asm
			pushi    66
			pushi    #superClass
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    2064
			lag      global0
			send     12
			pushi    66
			pushi    #superClass
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    16
			lofsa    fulk
			send     12
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     18
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			lofsa    fulk
			send     12
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			lofsa    theBoat
			send     12
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
			bnt      code_1670
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      126
			eq?     
			bnt      code_1653
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      119
			eq?     
			bnt      code_1653
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1711
code_1653:
			pushi    #cel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    3
			class    CT
			push    
			class    End
			push    
			pushSelf
			lag      global0
			send     22
			jmp      code_1711
code_1670:
			dup     
			ldi      1
			eq?     
			bnt      code_168c
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    126
			pushi    119
			pushSelf
			lofsa    theBoat
			send     12
			jmp      code_1711
code_168c:
			dup     
			ldi      2
			eq?     
			bnt      code_16bd
			pushi    #view
			pushi    1
			pushi    20
			pushi    162
			pushi    1
			pushi    65535
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     38
			jmp      code_1711
code_16bd:
			dup     
			ldi      3
			eq?     
			bnt      code_16f7
			pushi    5
			pushi    #superClass
			pushi    585
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2048
			or      
			push    
			lag      global0
			send     24
			pushi    3
			pushi    1680
			pushi    40
			pushSelf
			calle    proc13_4,  6
			jmp      code_1711
code_16f7:
			dup     
			ldi      4
			eq?     
			bnt      code_1711
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
code_1711:
			toss    
			ret     
		)
	)
)

(instance stepInBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17ad
			pushi    0
			callb    proc0_3,  0
			pushi    #setPri
			pushi    1
			pushi    5
			pushi    17
			pushi    1
			pushi    16
			lofsa    thePole
			send     12
			pushi    #view
			pushi    1
			pushi    674
			pushi    18
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    204
			pushi    193
			pushi    56
			pushi    1
			pushi    6
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lofsa    fulk
			send     50
			jmp      code_1827
code_17ad:
			dup     
			ldi      1
			eq?     
			bnt      code_17ee
			pushi    162
			pushi    #superClass
			pushi    5
			pushi    284
			pushi    2
			pushi    213
			pushi    193
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    288
			pushi    1
			pushi    4
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    65535
			pushSelf
			lofsa    fulk
			send     38
			jmp      code_1827
code_17ee:
			dup     
			ldi      2
			eq?     
			bnt      code_180f
			pushi    4
			lea      @local51
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1827
code_180f:
			dup     
			ldi      3
			eq?     
			bnt      code_1827
			pushi    #setScript
			pushi    1
			lofsa    fulkBoat
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1827:
			toss    
			ret     
		)
	)
)

(instance egoGetsInBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1898
			pushi    0
			callb    proc0_3,  0
			pushi    #illegalBits
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    12
			pushi    17
			pushi    1
			pushi    16400
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    105
			pushi    173
			pushSelf
			lag      global0
			send     30
			jmp      code_1a0b
code_1898:
			dup     
			ldi      1
			eq?     
			bnt      code_18c0
			pushi    #view
			pushi    1
			pushi    19
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_1a0b
code_18c0:
			dup     
			ldi      2
			eq?     
			bnt      code_18f2
			pushi    #dispose
			pushi    0
			lofsa    thePole
			send     4
			pushi    #posn
			pushi    2
			pushi    101
			pushi    167
			pushi    162
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     28
			jmp      code_1a0b
code_18f2:
			dup     
			ldi      3
			eq?     
			bnt      code_1936
			pushi    5
			pushi    #superClass
			pushi    65535
			pushi    5
			pushi    1
			pushi    585
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    103
			pushi    167
			pushi    18
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global0
			send     44
			ldi      6
			aTop     ticks
			jmp      code_1a0b
code_1936:
			dup     
			ldi      4
			eq?     
			bnt      code_19a5
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    17
			pushi    1
			pushi    16384
			lofsa    fulk
			send     14
			pushi    6
			pushi    1
			pushi    #-info-
			pushi    18
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     40
			jmp      code_1a0b
code_19a5:
			dup     
			ldi      5
			eq?     
			bnt      code_19d3
			pushi    162
			pushi    #superClass
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      2048
			or      
			push    
			lofsa    theBoat
			send     18
			ldi      6
			aTop     ticks
			jmp      code_1a0b
code_19d3:
			dup     
			ldi      6
			eq?     
			bnt      code_1a0b
			ldi      1
			sal      local12
			lsl      local13
			ldi      1
			eq?     
			bnt      code_19fa
			ldi      0
			sal      local13
			pushi    4
			lea      @local55
			push    
			pushi    8
			pushi    0
			pushSelf
			calle    proc851_0,  8
code_19fa:
			pushi    #setScript
			pushi    1
			lofsa    toTheGate
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1a0b:
			toss    
			ret     
		)
	)
)

(instance toTheGate of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    2064
			lag      global0
			send     24
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    16
			lofsa    fulk
			send     24
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			lofsa    theBoat
			send     12
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
			bnt      code_1b66
			pushi    0
			callb    proc0_3,  0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			lofsa    fulk
			send     8
			pushi    298
			pushi    1
			lofsa    egoCode
			push    
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			lag      global0
			send     14
			pushi    18
			pushi    1
			pushi    #species
			pushi    54
			pushi    1
			pushi    2
			pushi    55
			pushi    1
			pushi    2
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      15
			sub     
			push    
			pushSelf
			lofsa    theBoat
			send     30
			jmp      code_1be6
code_1b66:
			dup     
			ldi      1
			eq?     
			bnt      code_1bcc
			pushi    66
			pushi    #superClass
			pushi    4
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    141
			pushi    121
			pushSelf
			lofsa    theBoat
			send     24
			pushi    5
			pushi    #superClass
			pushi    585
			pushi    162
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    32768
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2064
			or      
			push    
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     36
			ldi      1
			sal      local15
			jmp      code_1be6
code_1bcc:
			dup     
			ldi      2
			eq?     
			bnt      code_1be6
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
code_1be6:
			toss    
			ret     
		)
	)
)

(instance split of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			pushi    17
			pushi    1
			pushi    18448
			pushi    18
			pushi    1
			pushi    0
			lag      global0
			send     30
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16400
			pushi    18
			pushi    1
			pushi    0
			lofsa    fulk
			send     30
			pushi    66
			pushi    #superClass
			pushi    1
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16400
			or      
			push    
			pushi    18
			pushi    1
			pushi    0
			lofsa    theBoat
			send     18
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
			bnt      code_1ce8
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1d5f
code_1ce8:
			dup     
			ldi      1
			eq?     
			bnt      code_1d4d
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			lofsa    fulk
			send     8
			pushi    7
			pushi    1
			pushi    #species
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			lag      global0
			send     14
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    107
			pushi    106
			pushSelf
			lofsa    theBoat
			send     12
			jmp      code_1d5f
code_1d4d:
			dup     
			ldi      2
			eq?     
			bnt      code_1d5f
			pushi    #newRoom
			pushi    1
			pushi    690
			lag      global2
			send     6
code_1d5f:
			toss    
			ret     
		)
	)
)

(instance fulkBoat of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    16
			lofsa    fulk
			send     24
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      57
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			lofsa    thePole
			send     12
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
			bnt      code_1e4b
			pushi    0
			callb    proc0_3,  0
			pushi    #setPri
			pushi    1
			pushi    5
			pushi    17
			pushi    1
			pushi    16
			lofsa    thePole
			send     12
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			pushi    56
			pushi    1
			pushi    6
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    177
			pushi    157
			pushSelf
			lofsa    theBoat
			send     30
			jmp      code_1e7b
code_1e4b:
			dup     
			ldi      1
			eq?     
			bnt      code_1e61
			pushi    3
			lsg      global0
			lofsa    fulk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1e7b
code_1e61:
			dup     
			ldi      2
			eq?     
			bnt      code_1e7b
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
code_1e7b:
			toss    
			ret     
		)
	)
)

(instance raiseTheGrate of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    2064
			lag      global0
			send     30
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    17
			pushi    1
			pushi    16
			lofsa    fulk
			send     24
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			lofsa    theBoat
			send     12
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
			bnt      code_1f98
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      130
			eq?     
			bnt      code_1f82
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      119
			eq?     
			bnt      code_1f82
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1fab
code_1f82:
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    130
			pushi    119
			pushSelf
			lofsa    theBoat
			send     12
			jmp      code_1fab
code_1f98:
			dup     
			ldi      1
			eq?     
			bnt      code_1fab
			pushi    #setScript
			pushi    1
			lofsa    blowTheJoint
			push    
			lag      global0
			send     6
code_1fab:
			toss    
			ret     
		)
	)
)

(instance blowTheJoint of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    secretSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    gateSound
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
			bnt      code_204a
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    ineptus
			send     6
			pushi    #view
			pushi    1
			pushi    20
			pushi    162
			pushi    1
			pushi    65535
			pushi    162
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    1
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lag      global0
			send     36
			jmp      code_20e0
code_204a:
			dup     
			ldi      1
			eq?     
			bnt      code_2060
			pushi    #play
			pushi    0
			lofsa    secretSound
			send     4
			ldi      2
			aTop     cycles
			jmp      code_20e0
code_2060:
			dup     
			ldi      2
			eq?     
			bnt      code_2076
			pushi    3
			pushi    1680
			pushi    55
			pushSelf
			calle    proc13_4,  6
			jmp      code_20e0
code_2076:
			dup     
			ldi      3
			eq?     
			bnt      code_209f
			pushi    2
			pushi    1680
			pushi    56
			calle    proc13_4,  4
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    waterGate
			send     8
			pushi    #play
			pushi    0
			lofsa    gateSound
			send     4
			jmp      code_20e0
code_209f:
			dup     
			ldi      4
			eq?     
			bnt      code_20e0
			pushi    5
			pushi    #superClass
			pushi    585
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    142
			pushi    1
			lofsa    split
			push    
			lag      global0
			send     30
			pushi    #stop
			pushi    0
			lofsa    gateSound
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_20e0:
			toss    
			ret     
		)
	)
)

(instance moveAway of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      68
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			pushi    17
			pushi    1
			pushi    18448
			pushi    18
			pushi    1
			pushi    0
			lofsa    theBoat
			send     30
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      45
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16400
			pushi    18
			pushi    1
			pushi    0
			lofsa    fulk
			send     30
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
			bnt      code_21e1
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lea      @local59
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			pushi    7
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     18
			jmp      code_21ff
code_21e1:
			dup     
			ldi      1
			eq?     
			bnt      code_21ff
			pushi    0
			callb    proc0_4,  0
			ldi      0
			sal      local8
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_21ff:
			toss    
			ret     
		)
	)
)

(instance egoDock of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      68
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			pushi    17
			pushi    1
			pushi    18448
			pushi    18
			pushi    1
			pushi    0
			lofsa    theBoat
			send     30
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      45
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16400
			pushi    18
			pushi    1
			pushi    0
			lofsa    fulk
			send     30
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
			bnt      code_22e6
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    4
			lea      @local63
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_233a
code_22e6:
			dup     
			ldi      1
			eq?     
			bnt      code_231c
			pushi    7
			pushi    #superClass
			pushi    0
			pushi    150
			pushi    1
			class    End
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
			ldi      15
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     24
			jmp      code_233a
code_231c:
			dup     
			ldi      2
			eq?     
			bnt      code_233a
			pushi    0
			callb    proc0_4,  0
			ldi      0
			sal      local8
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_233a:
			toss    
			ret     
		)
	)
)

(instance timesUp of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23af
			pushi    0
			callb    proc0_3,  0
			lal      local12
			bnt      code_239f
			pushi    #setScript
			pushi    2
			lofsa    priorKillBoat
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_23bf
code_239f:
			pushi    #setScript
			pushi    2
			lofsa    monkKillDock
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_23bf
code_23af:
			dup     
			ldi      1
			eq?     
			bnt      code_23bf
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_23bf:
			toss    
			ret     
		)
	)
)

(instance monkKillDock of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_243f
			pushi    0
			callb    proc0_3,  0
			pushi    107
			pushi    0
			pushi    #setCycle
			pushi    1
			class    Walk
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
			ldi      15
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lofsa    killMonk
			send     22
			jmp      code_24fd
code_243f:
			dup     
			ldi      1
			eq?     
			bnt      code_2455
			pushi    3
			lofsa    killMonk
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_24fd
code_2455:
			dup     
			ldi      2
			eq?     
			bnt      code_246e
			pushi    3
			lea      @local67
			push    
			pushi    11
			pushSelf
			calle    proc851_0,  6
			jmp      code_24fd
code_246e:
			dup     
			ldi      3
			eq?     
			bnt      code_2496
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
			lofsa    killMonk
			send     26
			jmp      code_24fd
code_2496:
			dup     
			ldi      4
			eq?     
			bnt      code_24cd
			pushi    #number
			pushi    1
			pushi    588
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
			pushi    #view
			pushi    1
			pushi    22
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_24fd
code_24cd:
			dup     
			ldi      5
			eq?     
			bnt      code_24fd
			ldi      2
			sag      global115
			bnt      code_24ed
			ldi      20
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			jmp      code_24fd
code_24ed:
			pushi    2
			pushi    680
			pushi    0
			calle    proc806_0,  4
			pushi    #dispose
			pushi    0
			self     4
code_24fd:
			toss    
			ret     
		)
	)
)

(instance monkKillBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2579
			pushi    0
			callb    proc0_3,  0
			pushi    107
			pushi    #species
			pushi    150
			pushi    1
			class    Walk
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
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lofsa    killMonk
			send     22
			jmp      code_2623
code_2579:
			dup     
			ldi      1
			eq?     
			bnt      code_2594
			pushi    4
			lea      @local67
			push    
			pushi    11
			pushi    8
			pushSelf
			calle    proc851_0,  8
			jmp      code_2623
code_2594:
			dup     
			ldi      2
			eq?     
			bnt      code_25bc
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
			lofsa    killMonk
			send     26
			jmp      code_2623
code_25bc:
			dup     
			ldi      3
			eq?     
			bnt      code_25f3
			pushi    #number
			pushi    1
			pushi    588
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
			pushi    #view
			pushi    1
			pushi    22
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_2623
code_25f3:
			dup     
			ldi      4
			eq?     
			bnt      code_2623
			ldi      2
			sag      global115
			bnt      code_2613
			ldi      20
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			jmp      code_2623
code_2613:
			pushi    2
			pushi    680
			pushi    0
			calle    proc806_0,  4
			pushi    #dispose
			pushi    0
			self     4
code_2623:
			toss    
			ret     
		)
	)
)

(instance priorKillBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2690
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    116
			pushi    180
			pushSelf
			lofsa    thePrior
			send     22
			jmp      code_2751
code_2690:
			dup     
			ldi      1
			eq?     
			bnt      code_26b2
			pushi    4
			lea      @local71
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_2751
code_26b2:
			dup     
			ldi      2
			eq?     
			bnt      code_26c9
			pushi    #setHeading
			pushi    2
			pushi    310
			pushSelf
			lofsa    thePrior
			send     8
			jmp      code_2751
code_26c9:
			dup     
			ldi      3
			eq?     
			bnt      code_26eb
			pushi    4
			lea      @local77
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_2751
code_26eb:
			dup     
			ldi      4
			eq?     
			bnt      code_271c
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    8
			pushi    1680
			pushi    48
			pushSelf
			pushi    80
			lofsa    {Vocalis}
			push    
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  16
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2751
code_271c:
			dup     
			ldi      5
			eq?     
			bnt      code_273e
			pushi    4
			lea      @local81
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_2751
code_273e:
			dup     
			ldi      6
			eq?     
			bnt      code_2751
			pushi    #setScript
			pushi    1
			lofsa    moveAndShake
			push    
			lag      global0
			send     6
code_2751:
			toss    
			ret     
		)
	)
)

(instance moveAndShake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_27c1
			pushi    0
			callb    proc0_3,  0
			pushi    #signal
			pushi    1
			pushi    16384
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    vocalis
			send     14
			pushi    #number
			pushi    1
			pushi    19
			pushi    42
			pushi    0
			lofsa    secretSound
			send     10
			jmp      code_2918
code_27c1:
			dup     
			ldi      1
			eq?     
			bnt      code_27d5
			pushi    1
			pushi    3
			callk    ShakeScreen,  2
			ldi      66
			aTop     ticks
			jmp      code_2918
code_27d5:
			dup     
			ldi      2
			eq?     
			bnt      code_289e
			pushi    #signal
			pushi    1
			pushi    16384
			pushi    18
			pushi    1
			pushi    0
			lofsa    theBoat
			send     12
			pushi    #signal
			pushi    1
			pushi    16384
			pushi    18
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    waterGate
			send     6
			pushi    #signal
			pushi    1
			pushi    16384
			pushi    18
			pushi    1
			pushi    0
			lofsa    fulk
			send     12
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    ineptus
			send     6
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    hilaris
			send     6
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    cogito
			send     6
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    vocalis
			send     6
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    #superClass
			pushi    0
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      119
			sub     
			push    
			pushi    107
			pushi    0
			pushi    17
			pushi    1
			pushi    18432
			pushi    18
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    JumpTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      47
			sub     
			push    
			pushSelf
			lofsa    theRock
			send     52
			jmp      code_2918
code_289e:
			dup     
			ldi      3
			eq?     
			bnt      code_28dd
			pushi    #number
			pushi    1
			pushi    20
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
			pushi    #view
			pushi    1
			pushi    22
			pushi    162
			pushi    1
			pushi    65535
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    4
			pushi    1
			lag      global0
			send     34
			ldi      2
			aTop     cycles
			jmp      code_2918
code_28dd:
			dup     
			ldi      4
			eq?     
			bnt      code_2905
			pushi    #setMotion
			pushi    4
			class    JumpTo
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
			pushSelf
			lofsa    theRock
			send     12
			jmp      code_2918
code_2905:
			dup     
			ldi      5
			eq?     
			bnt      code_2918
			pushi    0
			calle    proc806_0,  0
			pushi    #dispose
			pushi    0
			self     4
code_2918:
			toss    
			ret     
		)
	)
)

(instance askTheDwarf of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2977
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local14
			pushi    3
			pushi    1680
			pushi    33
			pushSelf
			calle    proc13_4,  6
			jmp      code_29a9
code_2977:
			dup     
			ldi      1
			eq?     
			bnt      code_2999
			pushi    4
			lea      @local46
			push    
			pushi    8
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_29a9
code_2999:
			dup     
			ldi      2
			eq?     
			bnt      code_29a9
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_29a9:
			toss    
			ret     
		)
	)
)

(instance lookAtFulk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2a05
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1680
			pushi    26
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a37
code_2a05:
			dup     
			ldi      1
			eq?     
			bnt      code_2a27
			pushi    4
			lea      @local21
			push    
			pushi    8
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_2a37
code_2a27:
			dup     
			ldi      2
			eq?     
			bnt      code_2a37
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2a37:
			toss    
			ret     
		)
	)
)

(instance giveFulkMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2aa9
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    25
			pushi    96
			calle    proc806_1,  4
			pushi    4
			lea      @local34
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2ab9
code_2aa9:
			dup     
			ldi      1
			eq?     
			bnt      code_2ab9
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2ab9:
			toss    
			ret     
		)
	)
)

(instance cogitoTalks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2b15
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1680
			pushi    3
			pushSelf
			call     localproc_000e,  6
			jmp      code_2b4d
code_2b15:
			dup     
			ldi      1
			eq?     
			bnt      code_2b28
			pushi    0
			call     localproc_0038,  0
			ldi      6
			aTop     ticks
			jmp      code_2b4d
code_2b28:
			dup     
			ldi      2
			eq?     
			bnt      code_2b4d
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    cogito
			send     4
			push    
			ldi      1
			or      
			push    
			lofsa    cogito
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2b4d:
			toss    
			ret     
		)
	)
)

(instance vocalisTalks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2ba9
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1680
			pushi    7
			pushSelf
			call     localproc_004b,  6
			jmp      code_2be1
code_2ba9:
			dup     
			ldi      1
			eq?     
			bnt      code_2bbc
			pushi    0
			call     localproc_0075,  0
			ldi      6
			aTop     ticks
			jmp      code_2be1
code_2bbc:
			dup     
			ldi      2
			eq?     
			bnt      code_2be1
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    vocalis
			send     4
			push    
			ldi      1
			or      
			push    
			lofsa    vocalis
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2be1:
			toss    
			ret     
		)
	)
)

(instance hilarisTalks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2c3d
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1680
			pushi    9
			pushSelf
			call     localproc_0088,  6
			jmp      code_2c75
code_2c3d:
			dup     
			ldi      1
			eq?     
			bnt      code_2c50
			pushi    0
			call     localproc_00b2,  0
			ldi      6
			aTop     ticks
			jmp      code_2c75
code_2c50:
			dup     
			ldi      2
			eq?     
			bnt      code_2c75
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    hilaris
			send     4
			push    
			ldi      1
			or      
			push    
			lofsa    hilaris
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2c75:
			toss    
			ret     
		)
	)
)

(instance BackWalk of Rev
	(properties)
	
	(method (doit)
		(asm
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_2cc4
			pushi    #doit
			pushi    0
			super    Rev,  4
code_2cc4:
			ret     
		)
	)
)

(instance egoCode of Code
	(properties)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_2d7a
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_2d0a
			ldi      0
			jmp      code_2d7a
code_2d0a:
			pushi    0
			pushi    #heading
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_2d3d
			pprev   
			ldi      180
			lt?     
			bnt      code_2d3d
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    BackWalk
			ne?     
			bnt      code_2d3d
			pushi    #setCycle
			pushi    1
			lofsa    BackWalk
			push    
			lag      global0
			send     6
			jmp      code_2d7a
code_2d3d:
			pushi    180
			pushi    #heading
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_2d7a
			pprev   
			ldi      360
			lt?     
			bnt      code_2d7a
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    BackWalk
			eq?     
			bt       code_2d6c
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			not     
code_2d6c:
			bnt      code_2d7a
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			lag      global0
			send     6
code_2d7a:
			ret     
		)
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 673
		loop -1
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
	)
)

(instance secretSound of Sound
	(properties
		flags $0001
		number 21
	)
)
