;;; Sierra Script 1.0 - (do not remove this comment)
(script# 630)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n964)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm630 0
)

(local
	[local0 16]
	[local16 17] = [36 264 22 292 298 105 210 55 53 272 272 289 215 29 110 34 159]
	[local33 17] = [10 4 41 44 180 9 6 78 105 72 110 141 179 173 182 147 17]
	[local50 17] = [1 2 3 3 4 2 1 7 7 8 8 2 3 3 4 1 5]
	local67
	[local68 2]
	local70
	local71
	local72
	local73
	local74
	local75
	local76
	[local77 4] = [1630 19 1]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      16
		lt?     
		bnt      code_0044
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local16
		pushi    3
		pushi    1
		lsli     local33
		pushi    6
		pushi    1
		lsli     local50
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
		jmp      code_0014
code_0044:
		ret     
	)
)

(instance rm630 of Rm
	(properties
		picture 630
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    130
			pushi    964
			callk    Load,  4
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      630
			ne?     
			bnt      code_0076
			pushi    #number
			pushi    1
			pushi    630
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_0076:
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0088
			pushi    0
			call     localproc_000e,  0
code_0088:
			pushi    2
			pushi    128
			pushi    630
			callk    Load,  4
			pushi    26
			lofsa    monastery
			push    
			lofsa    tortureTower
			push    
			lofsa    swTower
			push    
			lofsa    nwTower
			push    
			lofsa    neTower
			push    
			lofsa    mainGate
			push    
			lofsa    refectory
			push    
			lofsa    yard
			push    
			lofsa    extraRms
			push    
			lofsa    emptyRms
			push    
			lofsa    cel1
			push    
			lofsa    cel2
			push    
			lofsa    cel3
			push    
			lofsa    cel4
			push    
			lofsa    cel5
			push    
			lofsa    cel6
			push    
			lofsa    cel7
			push    
			lofsa    cel8
			push    
			lofsa    cel9
			push    
			lofsa    cel10
			push    
			lofsa    cel11
			push    
			lofsa    cel12
			push    
			lofsa    cel13
			push    
			lofsa    cel14
			push    
			lofsa    cel15
			push    
			lofsa    cel16
			push    
			calle    proc806_3,  52
			pushi    #view
			pushi    1
			pushi    48
			pushi    107
			pushi    0
			lag      global0
			send     10
			lsg      global12
			dup     
			ldi      680
			eq?     
			bnt      code_014f
			pushi    #init
			pushi    0
			lofsa    waterGate
			send     4
			pushi    #addToFront
			pushi    1
			lofsa    waterGate
			push    
			pushi    60
			pushi    0
			lag      global32
			send     10
			ldi      161
			sal      local74
			ldi      48
			sal      local75
			pushi    #posn
			pushi    2
			pushi    161
			pushi    37
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0313
code_014f:
			dup     
			ldi      650
			eq?     
			bnt      code_0166
			pushi    #setScript
			pushi    1
			lofsa    inFromScribes
			push    
			lag      global0
			send     6
			jmp      code_0313
code_0166:
			dup     
			ldi      670
			eq?     
			bnt      code_01d7
			pushi    0
			callb    proc0_3,  0
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_01b8
			lsl      local76
			ldi      0
			eq?     
			bnt      code_01b8
			pushi    #posn
			pushi    2
			pushi    98
			pushi    51
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    98
			pushi    61
			lag      global0
			send     18
			pushi    #init
			pushi    0
			lofsa    fulk
			send     4
			pushi    #setScript
			pushi    1
			lofsa    splitToTheGate
			push    
			lag      global0
			send     6
			jmp      code_0313
code_01b8:
			ldi      98
			sal      local74
			ldi      61
			sal      local75
			pushi    #posn
			pushi    2
			pushi    98
			pushi    51
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0313
code_01d7:
			dup     
			ldi      640
			eq?     
			bnt      code_0307
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0210
			ldi      130
			sal      local74
			ldi      100
			sal      local75
			pushi    #posn
			pushi    2
			pushi    132
			pushi    100
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0303
code_0210:
			dup     
			ldi      1
			eq?     
			bnt      code_0238
			ldi      130
			sal      local74
			ldi      115
			sal      local75
			pushi    #posn
			pushi    2
			pushi    132
			pushi    115
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0303
code_0238:
			dup     
			ldi      2
			eq?     
			bnt      code_0262
			ldi      130
			sal      local74
			ldi      129
			sal      local75
			pushi    #posn
			pushi    2
			pushi    132
			pushi    129
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0303
code_0262:
			dup     
			ldi      3
			eq?     
			bnt      code_028c
			ldi      161
			sal      local74
			ldi      145
			sal      local75
			pushi    #posn
			pushi    2
			pushi    161
			pushi    141
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0303
code_028c:
			dup     
			ldi      4
			eq?     
			bnt      code_02b6
			ldi      190
			sal      local74
			ldi      129
			sal      local75
			pushi    #posn
			pushi    2
			pushi    190
			pushi    129
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0303
code_02b6:
			dup     
			ldi      5
			eq?     
			bnt      code_02de
			ldi      192
			sal      local74
			ldi      115
			sal      local75
			pushi    #posn
			pushi    2
			pushi    190
			pushi    115
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
			jmp      code_0303
code_02de:
			dup     
			ldi      6
			eq?     
			bnt      code_0303
			ldi      192
			sal      local74
			ldi      100
			sal      local75
			pushi    #posn
			pushi    2
			pushi    190
			pushi    100
			pushi    142
			pushi    1
			lofsa    movinOnIn
			push    
			lag      global0
			send     14
code_0303:
			toss    
			jmp      code_0313
code_0307:
			pushi    #setScript
			pushi    1
			lofsa    enterTheMap
			push    
			lag      global0
			send     6
code_0313:
			toss    
			pushi    #addObstacle
			pushi    14
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    74
			pushi    106
			pushi    103
			pushi    106
			pushi    109
			pushi    106
			pushi    118
			pushi    106
			pushi    124
			pushi    121
			pushi    133
			pushi    121
			pushi    138
			pushi    108
			pushi    138
			pushi    98
			pushi    126
			pushi    98
			pushi    80
			pushi    108
			pushi    80
			pushi    108
			pushi    83
			pushi    152
			pushi    83
			pushi    153
			pushi    81
			pushi    170
			pushi    81
			pushi    170
			pushi    83
			pushi    215
			pushi    83
			pushi    215
			pushi    81
			pushi    225
			pushi    81
			pushi    225
			pushi    128
			pushi    214
			pushi    138
			pushi    203
			pushi    138
			pushi    203
			pushi    137
			pushi    203
			pushi    133
			pushi    216
			pushi    124
			pushi    217
			pushi    118
			pushi    217
			pushi    109
			pushi    217
			pushi    103
			pushi    217
			pushi    94
			pushi    188
			pushi    94
			pushi    188
			pushi    97
			pushi    180
			pushi    97
			pushi    180
			pushi    94
			pushi    143
			pushi    94
			pushi    143
			pushi    97
			pushi    135
			pushi    97
			pushi    135
			pushi    94
			pushi    106
			pushi    94
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
			pushi    20
			pushi    98
			pushi    76
			pushi    98
			pushi    64
			pushi    108
			pushi    54
			pushi    214
			pushi    54
			pushi    225
			pushi    65
			pushi    225
			pushi    76
			pushi    215
			pushi    76
			pushi    209
			pushi    63
			pushi    114
			pushi    63
			pushi    107
			pushi    76
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
			pushi    8
			pushi    135
			pushi    101
			pushi    143
			pushi    101
			pushi    143
			pushi    112
			pushi    135
			pushi    112
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
			pushi    135
			pushi    115
			pushi    143
			pushi    115
			pushi    143
			pushi    126
			pushi    135
			pushi    126
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
			pushi    16
			pushi    124
			pushi    132
			pushi    135
			pushi    132
			pushi    135
			pushi    130
			pushi    143
			pushi    130
			pushi    143
			pushi    132
			pushi    159
			pushi    132
			pushi    159
			pushi    138
			pushi    124
			pushi    138
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
			pushi    180
			pushi    101
			pushi    188
			pushi    101
			pushi    188
			pushi    112
			pushi    180
			pushi    112
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
			pushi    180
			pushi    115
			pushi    188
			pushi    115
			pushi    188
			pushi    125
			pushi    180
			pushi    125
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
			pushi    16
			pushi    162
			pushi    132
			pushi    180
			pushi    132
			pushi    180
			pushi    130
			pushi    188
			pushi    130
			pushi    188
			pushi    132
			pushi    200
			pushi    132
			pushi    200
			pushi    138
			pushi    162
			pushi    138
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
			pushi    60
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    162
			pushi    189
			pushi    162
			pushi    160
			pushi    175
			pushi    143
			pushi    225
			pushi    143
			pushi    226
			pushi    167
			pushi    231
			pushi    178
			pushi    249
			pushi    185
			pushi    272
			pushi    176
			pushi    275
			pushi    153
			pushi    258
			pushi    142
			pushi    229
			pushi    139
			pushi    229
			pushi    52
			pushi    242
			pushi    47
			pushi    237
			pushi    40
			pushi    226
			pushi    49
			pushi    99
			pushi    49
			pushi    86
			pushi    30
			pushi    72
			pushi    39
			pushi    95
			pushi    52
			pushi    95
			pushi    140
			pushi    93
			pushi    145
			pushi    96
			pushi    148
			pushi    97
			pushi    143
			pushi    149
			pushi    143
			pushi    159
			pushi    160
			pushi    159
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     134
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    147
			pushi    96
			pushi    160
			pushi    96
			pushi    160
			pushi    112
			pushi    147
			pushi    112
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
			pushi    163
			pushi    96
			pushi    176
			pushi    96
			pushi    176
			pushi    112
			pushi    163
			pushi    112
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
			pushi    147
			pushi    114
			pushi    160
			pushi    114
			pushi    160
			pushi    130
			pushi    147
			pushi    130
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
			pushi    163
			pushi    114
			pushi    176
			pushi    114
			pushi    176
			pushi    130
			pushi    163
			pushi    130
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
			pushi    169
			pushi    74
			pushi    160
			pushi    80
			pushi    153
			pushi    74
			pushi    160
			pushi    68
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     32
			pushi    0
			callb    proc0_3,  0
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0737
			ldi      0
			jmp      code_09aa
code_0737:
			pushi    32766
			pushi    #onControl
			pushi    0
			lag      global0
			send     4
			and     
			sat      temp0
			push    
			ldi      1024
			uge?    
			bnt      code_075e
			pushi    #setScript
			pushi    3
			lofsa    takeOff
			push    
			pushi    0
			lst      temp0
			self     10
			jmp      code_0977
code_075e:
			lat      temp0
			bnt      code_0977
			lsl      local71
			and     
			not     
			bnt      code_0977
			lst      temp0
			ldi      2
			and     
			bnt      code_083c
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_083c
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      2
			sal      local71
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_0977
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      130
			ge?     
			bnt      code_07b5
			pushi    3
			pushi    1630
			pushi    16
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_07b5:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_07d3
			pushi    3
			pushi    1630
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_07d3:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_07f1
			pushi    3
			pushi    1630
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_07f1:
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_080f
			pushi    3
			pushi    1630
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_080f:
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bt       code_082a
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
code_082a:
			bnt      code_0977
			pushi    3
			pushi    1630
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_083c:
			lst      temp0
			ldi      4
			and     
			bnt      code_0897
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      4
			sal      local71
			lal      local70
			bnt      code_0865
			pushi    #setScript
			pushi    1
			lofsa    inFromScribes
			push    
			lag      global0
			send     6
			jmp      code_0977
code_0865:
			pushi    #stairsMessage
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0977
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_0977
			pushi    #stairsMessage
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    3
			pushi    1630
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_0897:
			lst      temp0
			ldi      8
			and     
			bnt      code_08db
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      8
			sal      local71
			pushi    #stairMessage
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_0977
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_0977
			pushi    #stairMessage
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    3
			pushi    1630
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_08db:
			lst      temp0
			ldi      32
			and     
			bnt      code_090b
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      32
			sal      local71
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_0977
			pushi    3
			pushi    1630
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_090b:
			lst      temp0
			ldi      64
			and     
			bnt      code_0959
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      64
			sal      local71
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_0977
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_094a
			pushi    3
			pushi    1630
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_094a:
			pushi    3
			pushi    1630
			pushi    12
			pushi    1
			calle    proc13_4,  6
			jmp      code_0977
code_0959:
			lst      temp0
			ldi      512
			and     
			bnt      code_0977
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			lofsa    goOnIn
			push    
			lag      global0
			send     6
code_0977:
			lsg      global88
			ldi      2
			mod     
			bnt      code_09aa
			+al      local67
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_09aa
			lsl      local67
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_09aa
			pushi    4
			pushi    6
			pushi    216
			pushi    239
			pushi    1
			callk    Palette,  8
code_09aa:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    964
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    3
			dup     
			pushi    48
			pushi    49
			callb    proc0_2,  6
			pushi    #cue
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			bnt      code_071b
			lsp      newRoomNumber
			ldi      680
			ne?     
			bnt      code_071b
			pushi    #roomToDie
			pushi    1
			lsp      newRoomNumber
			class    Monastery
			send     6
			pushi    #newRoom
			pushi    1
			pushi    695
			super    Rm,  6
			jmp      code_0724
code_071b:
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			super    Rm,  6
code_0724:
			ret     
		)
	)
)

(instance yard of Feature
	(properties
		x 133
		y 59
		nsTop 59
		nsLeft 90
		nsBottom 90
		nsRight 218
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0a2d
			pushi    #setScript
			pushi    1
			lofsa    toTheYard
			push    
			lag      global0
			send     6
			jmp      code_0a36
code_0a2d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0a36:
			ret     
		)
	)
)

(instance extraRms of Feature
	(properties
		x 114
		y 92
		nsTop 92
		nsLeft 101
		nsBottom 134
		nsRight 136
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0a93
			pushi    #setScript
			pushi    1
			lofsa    extraRooms
			push    
			lag      global0
			send     6
			jmp      code_0a9c
code_0a93:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0a9c:
			ret     
		)
	)
)

(instance emptyRms of Feature
	(properties
		x 201
		y 93
		nsTop 93
		nsLeft 184
		nsBottom 134
		nsRight 219
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0af9
			pushi    #setScript
			pushi    1
			lofsa    emptyRooms
			push    
			lag      global0
			send     6
			jmp      code_0b02
code_0af9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0b02:
			ret     
		)
	)
)

(instance tortureTower of Feature
	(properties
		x 87
		y 52
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    87
			pushi    47
			pushi    67
			pushi    50
			pushi    56
			pushi    45
			pushi    47
			pushi    35
			pushi    47
			pushi    23
			pushi    63
			pushi    12
			pushi    82
			pushi    11
			pushi    94
			pushi    16
			pushi    101
			pushi    28
			pushi    96
			pushi    39
			pushi    94
			pushi    42
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			aTop     onMeCheck
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
			bnt      code_0ba8
			pushi    #setScript
			pushi    1
			lofsa    theTortureTower
			push    
			lag      global0
			send     6
			jmp      code_0bb1
code_0ba8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0bb1:
			ret     
		)
	)
)

(instance swTower of Feature
	(properties
		x 223
		y 52
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    26
			pushi    223
			pushi    23
			pushi    233
			pushi    12
			pushi    249
			pushi    8
			pushi    267
			pushi    12
			pushi    277
			pushi    21
			pushi    280
			pushi    30
			pushi    277
			pushi    39
			pushi    271
			pushi    46
			pushi    265
			pushi    51
			pushi    250
			pushi    52
			pushi    237
			pushi    48
			pushi    230
			pushi    42
			pushi    223
			pushi    31
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     66
			aTop     onMeCheck
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
			bnt      code_0c81
			pushi    #setScript
			pushi    1
			lofsa    prisonTower
			push    
			lag      global0
			send     6
			jmp      code_0c8a
code_0c81:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0c8a:
			ret     
		)
	)
)

(instance neTower of Feature
	(properties
		x 102
		y 184
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    28
			pushi    102
			pushi    163
			pushi    101
			pushi    171
			pushi    94
			pushi    178
			pushi    86
			pushi    183
			pushi    71
			pushi    184
			pushi    56
			pushi    180
			pushi    46
			pushi    169
			pushi    46
			pushi    156
			pushi    54
			pushi    146
			pushi    67
			pushi    140
			pushi    81
			pushi    141
			pushi    90
			pushi    144
			pushi    95
			pushi    149
			pushi    100
			pushi    155
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			aTop     onMeCheck
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
			bnt      code_0d60
			pushi    #setScript
			pushi    1
			lofsa    ToTheNETower
			push    
			lag      global0
			send     6
			jmp      code_0d69
code_0d60:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0d69:
			ret     
		)
	)
)

(instance nwTower of Feature
	(properties
		x 252
		y 184
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    252
			pushi    139
			pushi    264
			pushi    142
			pushi    274
			pushi    148
			pushi    279
			pushi    157
			pushi    277
			pushi    167
			pushi    270
			pushi    176
			pushi    260
			pushi    181
			pushi    250
			pushi    184
			pushi    232
			pushi    179
			pushi    222
			pushi    169
			pushi    223
			pushi    151
			pushi    232
			pushi    140
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			aTop     onMeCheck
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
			bnt      code_0e40
			pushi    #setScript
			pushi    1
			lofsa    scribesTower
			push    
			lag      global0
			send     6
			jmp      code_0e49
code_0e40:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0e49:
			ret     
		)
	)
)

(instance monastery of Feature
	(properties
		x 162
		y 30
		nsTop 32
		nsLeft 72
		nsBottom 162
		nsRight 252
		lookStr 6
	)
)

(instance cel1 of Feature
	(properties
		x 95
		y 118
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    75
			pushi    118
			pushi    90
			pushi    118
			pushi    91
			pushi    141
			pushi    75
			pushi    141
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_0f35
			ldi      95
			sal      local72
			pushi    2
			pushi    120
			pushi    139
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_0f3e
code_0f35:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0f3e:
			ret     
		)
	)
)

(instance cel2 of Feature
	(properties
		x 93
		y 95
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    73
			pushi    95
			pushi    89
			pushi    96
			pushi    90
			pushi    116
			pushi    75
			pushi    117
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_0fec
			ldi      95
			sal      local72
			pushi    2
			pushi    97
			pushi    115
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_0ff5
code_0fec:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0ff5:
			ret     
		)
	)
)

(instance cel3 of Feature
	(properties
		x 93
		y 73
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    75
			pushi    73
			pushi    90
			pushi    73
			pushi    89
			pushi    95
			pushi    75
			pushi    94
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_10a2
			ldi      95
			sal      local72
			pushi    2
			pushi    75
			pushi    92
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_10ab
code_10a2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_10ab:
			ret     
		)
	)
)

(instance cel4 of Feature
	(properties
		x 93
		y 51
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    74
			pushi    51
			pushi    88
			pushi    51
			pushi    91
			pushi    73
			pushi    75
			pushi    73
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1158
			ldi      95
			sal      local72
			pushi    2
			pushi    53
			pushi    71
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_1161
code_1158:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1161:
			ret     
		)
	)
)

(instance cel5 of Feature
	(properties
		x 101
		y 32
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    112
			pushi    31
			pushi    112
			pushi    44
			pushi    101
			pushi    44
			pushi    101
			pushi    32
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_120e
			pushi    2
			pushi    102
			pushi    112
			callk    Random,  4
			sal      local72
			ldi      49
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_1217
code_120e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1217:
			ret     
		)
	)
)

(instance cel6 of Feature
	(properties
		x 124
		y 32
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    134
			pushi    32
			pushi    134
			pushi    45
			pushi    114
			pushi    45
			pushi    114
			pushi    33
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_12c7
			pushi    2
			pushi    116
			pushi    132
			callk    Random,  4
			sal      local72
			ldi      49
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_12d0
code_12c7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_12d0:
			ret     
		)
	)
)

(instance cel7 of Feature
	(properties
		x 200
		y 32
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    211
			pushi    32
			pushi    211
			pushi    45
			pushi    189
			pushi    45
			pushi    188
			pushi    33
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1384
			pushi    2
			pushi    190
			pushi    209
			callk    Random,  4
			sal      local72
			ldi      49
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_138d
code_1384:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_138d:
			ret     
		)
	)
)

(instance cel8 of Feature
	(properties
		x 218
		y 32
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    222
			pushi    32
			pushi    223
			pushi    45
			pushi    211
			pushi    45
			pushi    211
			pushi    32
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1440
			pushi    2
			pushi    213
			pushi    221
			callk    Random,  4
			sal      local72
			ldi      49
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_1449
code_1440:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1449:
			ret     
		)
	)
)

(instance cel9 of Feature
	(properties
		x 240
		y 75
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    233
			pushi    75
			pushi    250
			pushi    76
			pushi    250
			pushi    97
			pushi    234
			pushi    97
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_14fb
			ldi      229
			sal      local72
			pushi    2
			pushi    77
			pushi    95
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_1504
code_14fb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1504:
			ret     
		)
	)
)

(instance cel10 of Feature
	(properties
		x 240
		y 51
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    248
			pushi    51
			pushi    249
			pushi    74
			pushi    234
			pushi    75
			pushi    233
			pushi    51
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_15b7
			ldi      229
			sal      local72
			pushi    2
			pushi    53
			pushi    75
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_15c0
code_15b7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_15c0:
			ret     
		)
	)
)

(instance cel11 of Feature
	(properties
		x 229
		y 96
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    250
			pushi    96
			pushi    251
			pushi    119
			pushi    234
			pushi    119
			pushi    234
			pushi    97
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1673
			ldi      229
			sal      local72
			pushi    2
			pushi    98
			pushi    117
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_167c
code_1673:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_167c:
			ret     
		)
	)
)

(instance cel12 of Feature
	(properties
		x 240
		y 120
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    249
			pushi    120
			pushi    250
			pushi    140
			pushi    234
			pushi    141
			pushi    235
			pushi    120
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1732
			ldi      229
			sal      local72
			pushi    2
			pushi    122
			pushi    139
			callk    Random,  4
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_173b
code_1732:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_173b:
			ret     
		)
	)
)

(instance cel13 of Feature
	(properties
		x 218
		y 146
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    223
			pushi    147
			pushi    224
			pushi    161
			pushi    212
			pushi    161
			pushi    212
			pushi    146
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_17f3
			pushi    2
			pushi    214
			pushi    222
			callk    Random,  4
			sal      local72
			ldi      142
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_17fc
code_17f3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_17fc:
			ret     
		)
	)
)

(instance cel14 of Feature
	(properties
		x 200
		y 147
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    188
			pushi    147
			pushi    211
			pushi    147
			pushi    212
			pushi    160
			pushi    189
			pushi    161
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_18b5
			pushi    2
			pushi    190
			pushi    210
			callk    Random,  4
			sal      local72
			ldi      142
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_18be
code_18b5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_18be:
			ret     
		)
	)
)

(instance cel15 of Feature
	(properties
		x 122
		y 147
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    114
			pushi    147
			pushi    138
			pushi    147
			pushi    137
			pushi    159
			pushi    113
			pushi    159
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1974
			pushi    2
			pushi    115
			pushi    136
			callk    Random,  4
			sal      local72
			ldi      142
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_197d
code_1974:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_197d:
			ret     
		)
	)
)

(instance cel16 of Feature
	(properties
		x 110
		y 146
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    100
			pushi    146
			pushi    114
			pushi    147
			pushi    114
			pushi    160
			pushi    101
			pushi    160
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
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
			bnt      code_1a2f
			pushi    2
			pushi    102
			pushi    112
			callk    Random,  4
			sal      local72
			ldi      142
			sal      local73
			pushi    #setScript
			pushi    1
			lofsa    moveToCell
			push    
			lag      global0
			send     6
			jmp      code_1a38
code_1a2f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1a38:
			ret     
		)
	)
)

(instance waterGate of Feature
	(properties
		x 162
		y 38
		nsTop 30
		nsLeft 137
		nsBottom 46
		nsRight 187
		lookStr 20
	)
)

(instance mainGate of Feature
	(properties
		x 162
		y 158
		nsTop 147
		nsLeft 137
		nsBottom 170
		nsRight 187
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1ae7
			pushi    #setScript
			pushi    1
			lofsa    moveToFGate
			push    
			lag      global0
			send     6
			jmp      code_1af0
code_1ae7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1af0:
			ret     
		)
	)
)

(instance refectory of Feature
	(properties
		x 162
		y 112
		nsTop 94
		nsLeft 143
		nsBottom 135
		nsRight 181
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1b4d
			pushi    #setScript
			pushi    1
			lofsa    toTheRefec
			push    
			lag      global0
			send     6
			jmp      code_1b56
code_1b4d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1b56:
			ret     
		)
	)
)

(instance wave of Prop
	(properties
		view 630
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
			bnt      code_1bbc
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
			jmp      code_1bd0
code_1bbc:
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
code_1bd0:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance fulk of Actor
	(properties
		x 88
		y 51
		view 675
	)
)

(instance takeOff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1e64
			pTos     register
			ldi      1024
			and     
			bnt      code_1cf7
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1e5f
			pushi    #setScript
			pushi    1
			lofsa    makeIt
			push    
			lag      global0
			send     6
			jmp      code_1e5f
code_1cf7:
			pTos     register
			ldi      2048
			and     
			bnt      code_1d0f
			pushi    #setScript
			pushi    1
			lofsa    moveToScribes
			push    
			lag      global0
			send     6
			jmp      code_1e5f
code_1d0f:
			pTos     register
			ldi      4096
			and     
			bnt      code_1d4b
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      151
			ge?     
			bnt      code_1d39
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    620
			lag      global2
			send     6
			jmp      code_1e5f
code_1d39:
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    670
			lag      global2
			send     6
			jmp      code_1e5f
code_1d4b:
			pTos     register
			ldi      8192
			and     
			bnt      code_1d63
			pushi    #setScript
			pushi    1
			lofsa    moveToPTower
			push    
			lag      global0
			send     6
			jmp      code_1e5f
code_1d63:
			pTos     register
			ldi      16384
			and     
			bnt      code_1e5f
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sag      global104
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sag      global105
			lsg      global104
			ldi      147
			lt?     
			bnt      code_1dd9
			pushi    95
			lag      global105
			lt?     
			bnt      code_1da2
			pprev   
			ldi      104
			lt?     
			bnt      code_1da2
			pushi    #whichDoor
			pushi    1
			pushi    0
			class    Monastery
			send     6
			jmp      code_1e53
code_1da2:
			pushi    110
			lag      global105
			lt?     
			bnt      code_1dbd
			pprev   
			ldi      116
			lt?     
			bnt      code_1dbd
			pushi    #whichDoor
			pushi    1
			pushi    1
			class    Monastery
			send     6
			jmp      code_1e53
code_1dbd:
			pushi    124
			lag      global105
			lt?     
			bnt      code_1e53
			pprev   
			ldi      132
			lt?     
			bnt      code_1e53
			pushi    #whichDoor
			pushi    1
			pushi    2
			class    Monastery
			send     6
			jmp      code_1e53
code_1dd9:
			lsg      global104
			ldi      170
			lt?     
			bnt      code_1df8
			lsg      global105
			ldi      138
			lt?     
			bnt      code_1df8
			pushi    #whichDoor
			pushi    1
			pushi    3
			class    Monastery
			send     6
			jmp      code_1e53
code_1df8:
			lsg      global104
			ldi      189
			lt?     
			bnt      code_1e53
			pushi    126
			lag      global105
			lt?     
			bnt      code_1e1e
			pprev   
			ldi      138
			lt?     
			bnt      code_1e1e
			pushi    #whichDoor
			pushi    1
			pushi    4
			class    Monastery
			send     6
			jmp      code_1e53
code_1e1e:
			pushi    110
			lag      global105
			lt?     
			bnt      code_1e3a
			pprev   
			ldi      116
			lt?     
			bnt      code_1e3a
			pushi    #whichDoor
			pushi    1
			pushi    5
			class    Monastery
			send     6
			jmp      code_1e53
code_1e3a:
			pushi    95
			lag      global105
			lt?     
			bnt      code_1e53
			pprev   
			ldi      104
			lt?     
			bnt      code_1e53
			pushi    #whichDoor
			pushi    1
			pushi    6
			class    Monastery
			send     6
code_1e53:
			pushi    #setScript
			pushi    1
			lofsa    moveToRef
			push    
			lag      global0
			send     6
code_1e5f:
			aTop     register
			jmp      code_1e70
code_1e64:
			dup     
			ldi      1
			eq?     
			bnt      code_1e70
			pushi    #dispose
			pushi    0
			self     4
code_1e70:
			toss    
			ret     
		)
	)
)

(instance moveToScribes of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f02
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    20
			class    DPath
			push    
			pushi    252
			pushi    148
			pushi    261
			pushi    149
			pushi    268
			pushi    153
			pushi    271
			pushi    161
			pushi    269
			pushi    169
			pushi    262
			pushi    176
			pushi    251
			pushi    179
			pushi    240
			pushi    177
			pushi    232
			pushi    172
			pushSelf
			lag      global0
			send     44
			jmp      code_1f2c
code_1f02:
			dup     
			ldi      1
			eq?     
			bnt      code_1f2c
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			not     
			bnt      code_1f1f
			pushi    2
			pushi    1630
			pushi    11
			calle    proc13_4,  4
code_1f1f:
			ldi      1
			sal      local70
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1f2c:
			toss    
			ret     
		)
	)
)

(instance inFromScribes of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f96
			pushi    0
			callb    proc0_3,  0
			lsg      global12
			ldi      650
			eq?     
			bnt      code_1f8f
			pushi    #posn
			pushi    2
			pushi    227
			pushi    168
			lag      global0
			send     8
code_1f8f:
			ldi      1
			aTop     cycles
			jmp      code_2005
code_1f96:
			dup     
			ldi      1
			eq?     
			bnt      code_1ff5
			pushi    #setMotion
			pushi    26
			class    DPath
			push    
			pushi    229
			pushi    168
			pushi    240
			pushi    177
			pushi    251
			pushi    179
			pushi    262
			pushi    176
			pushi    269
			pushi    169
			pushi    271
			pushi    161
			pushi    268
			pushi    153
			pushi    261
			pushi    149
			pushi    252
			pushi    148
			pushi    234
			pushi    147
			pushi    221
			pushi    145
			pushi    221
			pushi    135
			pushSelf
			lag      global0
			send     56
			jmp      code_2005
code_1ff5:
			dup     
			ldi      2
			eq?     
			bnt      code_2005
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2005:
			toss    
			ret     
		)
	)
)

(instance moveToRef of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2059
			pushi    0
			callb    proc0_3,  0
			ldi      1
			aTop     cycles
			jmp      code_21a2
code_2059:
			dup     
			ldi      1
			eq?     
			bnt      code_2190
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2094
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
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
			jmp      code_218c
code_2094:
			dup     
			ldi      1
			eq?     
			bnt      code_20bf
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
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
			jmp      code_218c
code_20bf:
			dup     
			ldi      2
			eq?     
			bnt      code_20ea
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
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
			jmp      code_218c
code_20ea:
			dup     
			ldi      3
			eq?     
			bnt      code_2107
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    161
			pushi    130
			pushSelf
			lag      global0
			send     12
			jmp      code_218c
code_2107:
			dup     
			ldi      4
			eq?     
			bnt      code_2132
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
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
			jmp      code_218c
code_2132:
			dup     
			ldi      5
			eq?     
			bnt      code_215d
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
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
			jmp      code_218c
code_215d:
			dup     
			ldi      6
			eq?     
			bnt      code_2188
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
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
			jmp      code_218c
code_2188:
			ldi      1
			aTop     cycles
code_218c:
			toss    
			jmp      code_21a2
code_2190:
			dup     
			ldi      2
			eq?     
			bnt      code_21a2
			pushi    #newRoom
			pushi    1
			pushi    640
			lag      global2
			send     6
code_21a2:
			toss    
			ret     
		)
	)
)

(instance moveToPTower of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_222b
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    20
			class    DPath
			push    
			pushi    240
			pushi    46
			pushi    256
			pushi    46
			pushi    264
			pushi    42
			pushi    269
			pushi    34
			pushi    269
			pushi    24
			pushi    260
			pushi    18
			pushi    244
			pushi    15
			pushi    236
			pushi    20
			pushi    229
			pushi    27
			pushSelf
			lag      global0
			send     44
			jmp      code_2294
code_222b:
			dup     
			ldi      1
			eq?     
			bnt      code_2240
			pushi    3
			pushi    1630
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_2294
code_2240:
			dup     
			ldi      2
			eq?     
			bnt      code_2284
			pushi    #setMotion
			pushi    20
			class    DPath
			push    
			pushi    229
			pushi    27
			pushi    236
			pushi    20
			pushi    244
			pushi    15
			pushi    260
			pushi    18
			pushi    269
			pushi    24
			pushi    264
			pushi    42
			pushi    256
			pushi    46
			pushi    240
			pushi    46
			pushi    223
			pushi    51
			pushSelf
			lag      global0
			send     44
			jmp      code_2294
code_2284:
			dup     
			ldi      3
			eq?     
			bnt      code_2294
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2294:
			toss    
			ret     
		)
	)
)

(instance moveToCell of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_22f4
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local72
			lsl      local73
			pushSelf
			lag      global0
			send     12
			jmp      code_233a
code_22f4:
			dup     
			ldi      1
			eq?     
			bnt      code_232a
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			not     
			bnt      code_231b
			pushi    7
			pushi    1630
			pushi    15
			pushSelf
			pushi    82
			pushi    630
			pushi    0
			pushi    0
			calle    proc13_4,  14
			jmp      code_233a
code_231b:
			pushi    3
			pushi    1630
			pushi    14
			pushSelf
			calle    proc13_4,  6
			jmp      code_233a
code_232a:
			dup     
			ldi      2
			eq?     
			bnt      code_233a
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_233a:
			toss    
			ret     
		)
	)
)

(instance enterTheMap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23a4
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    160
			dup     
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    150
			pushi    145
			pushSelf
			lag      global0
			send     20
			jmp      code_23b4
code_23a4:
			dup     
			ldi      1
			eq?     
			bnt      code_23b4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_23b4:
			toss    
			ret     
		)
	)
)

(instance prisonTower of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2415
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    230
			pushi    52
			pushSelf
			lag      global0
			send     12
			jmp      code_2443
code_2415:
			dup     
			ldi      1
			eq?     
			bnt      code_2433
			pushi    #stairsMessage
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    3
			pushi    1630
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_2443
code_2433:
			dup     
			ldi      2
			eq?     
			bnt      code_2443
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2443:
			toss    
			ret     
		)
	)
)

(instance scribesTower of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_24a6
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    232
			pushi    145
			pushSelf
			lag      global0
			send     12
			jmp      code_24d4
code_24a6:
			dup     
			ldi      1
			eq?     
			bnt      code_24c4
			pushi    #stairMessage
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    3
			pushi    1630
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_24d4
code_24c4:
			dup     
			ldi      2
			eq?     
			bnt      code_24d4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_24d4:
			toss    
			ret     
		)
	)
)

(instance extraRooms of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2535
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    122
			pushi    136
			pushSelf
			lag      global0
			send     12
			jmp      code_254f
code_2535:
			dup     
			ldi      1
			eq?     
			bnt      code_254f
			pushi    2
			pushi    1630
			pushi    17
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_254f:
			toss    
			ret     
		)
	)
)

(instance toTheYard of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_25d4
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      162
			gt?     
			bnt      code_25c0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    221
			pushi    79
			pushSelf
			lag      global0
			send     12
			jmp      code_25ee
code_25c0:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    104
			pushi    79
			pushSelf
			lag      global0
			send     12
			jmp      code_25ee
code_25d4:
			dup     
			ldi      1
			eq?     
			bnt      code_25ee
			pushi    2
			pushi    1630
			pushi    5
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_25ee:
			toss    
			ret     
		)
	)
)

(instance emptyRooms of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2650
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    202
			pushi    136
			pushSelf
			lag      global0
			send     12
			jmp      code_266a
code_2650:
			dup     
			ldi      1
			eq?     
			bnt      code_266a
			pushi    2
			pushi    1630
			pushi    18
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_266a:
			toss    
			ret     
		)
	)
)

(instance moveToFGate of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_26cc
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    159
			pushi    149
			pushSelf
			lag      global0
			send     12
			jmp      code_26e6
code_26cc:
			dup     
			ldi      1
			eq?     
			bnt      code_26e6
			pushi    2
			pushi    1630
			pushi    16
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_26e6:
			toss    
			ret     
		)
	)
)

(instance toTheRefec of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2748
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    161
			pushi    141
			pushSelf
			lag      global0
			send     12
			jmp      code_277e
code_2748:
			dup     
			ldi      1
			eq?     
			bnt      code_277e
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_276b
			pushi    2
			pushi    1630
			pushi    13
			calle    proc13_4,  4
			jmp      code_2775
code_276b:
			pushi    2
			pushi    1630
			pushi    12
			calle    proc13_4,  4
code_2775:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_277e:
			toss    
			ret     
		)
	)
)

(instance makeIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_27df
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    162
			pushi    48
			pushSelf
			lag      global0
			send     12
			jmp      code_280d
code_27df:
			dup     
			ldi      1
			eq?     
			bnt      code_27fb
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    162
			pushi    38
			pushSelf
			lag      global0
			send     12
			jmp      code_280d
code_27fb:
			dup     
			ldi      2
			eq?     
			bnt      code_280d
			pushi    #newRoom
			pushi    1
			pushi    680
			lag      global2
			send     6
code_280d:
			toss    
			ret     
		)
	)
)

(instance splitToTheGate of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2876
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    112
			pushi    53
			pushSelf
			lofsa    fulk
			send     18
			jmp      code_2923
code_2876:
			dup     
			ldi      1
			eq?     
			bnt      code_2891
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    98
			pushi    53
			pushSelf
			lag      global0
			send     12
			jmp      code_2923
code_2891:
			dup     
			ldi      2
			eq?     
			bnt      code_28ae
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    165
			pushi    53
			pushSelf
			lofsa    fulk
			send     12
			jmp      code_2923
code_28ae:
			dup     
			ldi      3
			eq?     
			bnt      code_28ca
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    153
			pushi    53
			pushSelf
			lag      global0
			send     12
			jmp      code_2923
code_28ca:
			dup     
			ldi      4
			eq?     
			bnt      code_28eb
			pushi    4
			lea      @local77
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2923
code_28eb:
			dup     
			ldi      5
			eq?     
			bnt      code_2911
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    165
			pushi    46
			pushSelf
			lofsa    fulk
			send     12
			jmp      code_2923
code_2911:
			dup     
			ldi      6
			eq?     
			bnt      code_2923
			pushi    #newRoom
			pushi    1
			pushi    680
			lag      global2
			send     6
code_2923:
			toss    
			ret     
		)
	)
)

(instance theTortureTower of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2984
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    95
			pushi    47
			pushSelf
			lag      global0
			send     12
			jmp      code_2a2d
code_2984:
			dup     
			ldi      1
			eq?     
			bnt      code_2a1d
			ldi      2
			sal      local71
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_29ad
			pushi    3
			pushi    1630
			pushi    7
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a2d
code_29ad:
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_29cb
			pushi    3
			pushi    1630
			pushi    8
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a2d
code_29cb:
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_29e9
			pushi    3
			pushi    1630
			pushi    9
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a2d
code_29e9:
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bt       code_2a04
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
code_2a04:
			bnt      code_2a16
			pushi    3
			pushi    1630
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a2d
code_2a16:
			ldi      1
			aTop     cycles
			jmp      code_2a2d
code_2a1d:
			dup     
			ldi      2
			eq?     
			bnt      code_2a2d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2a2d:
			toss    
			ret     
		)
	)
)

(instance movinOnIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2a8e
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lsl      local74
			lsl      local75
			pushSelf
			lag      global0
			send     12
			jmp      code_2ac9
code_2a8e:
			dup     
			ldi      1
			eq?     
			bnt      code_2ab9
			lsg      global12
			ldi      680
			eq?     
			bnt      code_2ab2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    98
			pushi    53
			pushSelf
			lag      global0
			send     12
			jmp      code_2ac9
code_2ab2:
			ldi      1
			aTop     cycles
			jmp      code_2ac9
code_2ab9:
			dup     
			ldi      2
			eq?     
			bnt      code_2ac9
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2ac9:
			toss    
			ret     
		)
	)
)

(instance goOnIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2b3e
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2b50
code_2b3e:
			dup     
			ldi      1
			eq?     
			bnt      code_2b50
			pushi    #newRoom
			pushi    1
			pushi    650
			lag      global2
			send     6
code_2b50:
			toss    
			ret     
		)
	)
)

(instance ToTheNETower of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2bb1
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    96
			pushi    141
			pushSelf
			lag      global0
			send     12
			jmp      code_2bd7
code_2bb1:
			dup     
			ldi      1
			eq?     
			bnt      code_2bc7
			pushi    3
			pushi    1630
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_2bd7
code_2bc7:
			dup     
			ldi      2
			eq?     
			bnt      code_2bd7
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2bd7:
			toss    
			ret     
		)
	)
)
