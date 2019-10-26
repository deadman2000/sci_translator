;;; Sierra Script 1.0 - (do not remove this comment)
(script# 223)
(include sci.sh)
(use n000)
(use n013)
(use n221)
(use n231)
(use n241)
(use n750)
(use n945)
(use n946)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	englishTreeName 0
	notSweeping 1
	notBlessed 2
	turnToTree 3
	unTreeEgo 4
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	local11
	local12
	local13
)
(instance englishTreeName of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0035
			pushi    0
			callb    proc0_3,  0
			ldi      60
			aTop     ticks
			jmp      code_00eb
code_0035:
			dup     
			ldi      1
			eq?     
			bnt      code_00b9
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			bnt      code_00ab
			pushi    3
			pushi    1223
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_00eb
code_00ab:
			pushi    3
			pushi    1223
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_00eb
code_00b9:
			dup     
			ldi      2
			eq?     
			bnt      code_00eb
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_00db
			pushi    0
			calle    proc750_2,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
code_00db:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    223
			callk    DisposeScript,  2
code_00eb:
			toss    
			ret     
		)
	)
)

(instance notSweeping of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_013b
			ldi      60
			aTop     ticks
			jmp      code_01d5
code_013b:
			dup     
			ldi      1
			eq?     
			bnt      code_01c9
			pushi    5
			pushi    1223
			pushi    8
			pushSelf
			pushi    80
			lsg      global124
			dup     
			ldi      11
			eq?     
			bnt      code_015b
			lofsa    {Birch}
			jmp      code_01c0
code_015b:
			dup     
			ldi      12
			eq?     
			bnt      code_0168
			lofsa    {Rowan}
			jmp      code_01c0
code_0168:
			dup     
			ldi      13
			eq?     
			bnt      code_0175
			lofsa    {Ash}
			jmp      code_01c0
code_0175:
			dup     
			ldi      14
			eq?     
			bnt      code_0182
			lofsa    {Alder}
			jmp      code_01c0
code_0182:
			dup     
			ldi      15
			eq?     
			bnt      code_018f
			lofsa    {Holly}
			jmp      code_01c0
code_018f:
			dup     
			ldi      16
			eq?     
			bnt      code_019c
			lofsa    {Hazel}
			jmp      code_01c0
code_019c:
			dup     
			ldi      17
			eq?     
			bnt      code_01a9
			lofsa    {Elder}
			jmp      code_01c0
code_01a9:
			dup     
			ldi      18
			eq?     
			bnt      code_01b6
			lofsa    {Oak}
			jmp      code_01c0
code_01b6:
			dup     
			ldi      20
			eq?     
			bnt      code_01c0
			lofsa    {Blackberry}
code_01c0:
			toss    
			push    
			calle    proc13_4,  10
			jmp      code_01d5
code_01c9:
			dup     
			ldi      2
			eq?     
			bnt      code_01d5
			pushi    #dispose
			pushi    0
			self     4
code_01d5:
			toss    
			ret     
		)
	)
)

(instance notBlessed of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0229
			pushi    0
			callb    proc0_3,  0
			ldi      60
			aTop     ticks
			jmp      code_0286
code_0229:
			dup     
			ldi      1
			eq?     
			bnt      code_023e
			pushi    3
			pushi    1223
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_0286
code_023e:
			dup     
			ldi      2
			eq?     
			bnt      code_0254
			pushi    3
			pushi    1223
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_0286
code_0254:
			dup     
			ldi      3
			eq?     
			bnt      code_0286
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_0276
			pushi    0
			calle    proc750_2,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
code_0276:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    223
			callk    DisposeScript,  2
code_0286:
			toss    
			ret     
		)
	)
)

(instance turnToTree of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0300
			pushi    0
			callb    proc0_3,  0
			lsg      global112
			ldi      88
			eq?     
			bt       code_02df
			lsg      global112
			ldi      49
			eq?     
code_02df:
			bnt      code_02f7
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    175
			pushi    106
			pushSelf
			lag      global0
			send     12
			jmp      code_0616
code_02f7:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0616
code_0300:
			dup     
			ldi      1
			eq?     
			bnt      code_0344
			lsg      global112
			ldi      88
			eq?     
			bt       code_0314
			lsg      global112
			ldi      49
			eq?     
code_0314:
			bnt      code_033b
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
			ldi      3
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0616
code_033b:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0616
code_0344:
			dup     
			ldi      2
			eq?     
			bnt      code_0557
			lsg      global112
			ldi      88
			eq?     
			bt       code_0358
			lsg      global112
			ldi      49
			eq?     
code_0358:
			not     
			bnt      code_051e
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0371
			ldi      3
			sal      local1
			ldi      236
			sal      local0
			jmp      code_0414
code_0371:
			lsg      global112
			ldi      132
			eq?     
			bt       code_0380
			lsg      global112
			ldi      155
			eq?     
code_0380:
			bnt      code_038f
			ldi      2
			sal      local1
			ldi      234
			sal      local0
			jmp      code_0414
code_038f:
			lsg      global112
			ldi      34
			eq?     
			bnt      code_03a3
			ldi      2
			sal      local1
			ldi      230
			sal      local0
			jmp      code_0414
code_03a3:
			lsg      global112
			ldi      53
			eq?     
			bt       code_03b0
			lsg      global112
			ldi      120
			eq?     
code_03b0:
			bnt      code_03bf
			ldi      1
			sal      local1
			ldi      233
			sal      local0
			jmp      code_0414
code_03bf:
			lsg      global112
			ldi      66
			eq?     
			bnt      code_03d3
			ldi      0
			sal      local1
			ldi      231
			sal      local0
			jmp      code_0414
code_03d3:
			lsg      global112
			ldi      20
			eq?     
			bnt      code_03e7
			ldi      1
			sal      local1
			ldi      237
			sal      local0
			jmp      code_0414
code_03e7:
			lsg      global112
			ldi      114
			eq?     
			bnt      code_03fb
			ldi      2
			sal      local1
			ldi      232
			sal      local0
			jmp      code_0414
code_03fb:
			lsg      global112
			ldi      22
			eq?     
			bt       code_0408
			lsg      global112
			ldi      122
			eq?     
code_0408:
			bnt      code_0414
			ldi      1
			sal      local1
			ldi      235
			sal      local0
code_0414:
			lsl      local1
			dup     
			ldi      0
			eq?     
			bnt      code_043a
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65496
			add     
			sal      local2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			add     
			sal      local8
			jmp      code_049c
code_043a:
			dup     
			ldi      1
			eq?     
			bnt      code_045e
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65486
			add     
			sal      local2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      50
			add     
			sal      local8
			jmp      code_049c
code_045e:
			dup     
			ldi      3
			eq?     
			bnt      code_0482
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65426
			add     
			sal      local2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      110
			add     
			sal      local8
			jmp      code_049c
code_0482:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65476
			add     
			sal      local2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      60
			add     
			sal      local8
code_049c:
			toss    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sal      local3
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sal      local9
			lsl      local2
			ldi      10
			add     
			sal      local4
			lsl      local3
			ldi      10
			sub     
			sal      local5
			lsl      local2
			ldi      10
			add     
			sal      local12
			lsl      local3
			ldi      7
			add     
			sal      local13
			lsl      local8
			ldi      10
			sub     
			sal      local6
			lsl      local9
			ldi      10
			sub     
			sal      local7
			lsl      local8
			ldi      10
			sub     
			sal      local10
			lsl      local9
			ldi      7
			add     
			sal      local11
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			lsl      local2
			lsl      local3
			lsl      local4
			lsl      local5
			lsl      local6
			lsl      local7
			lsl      local8
			lsl      local9
			lsl      local10
			push    
			lsl      local12
			lsl      local13
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			jmp      code_0523
code_051e:
			ldi      236
			sal      local0
code_0523:
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    razzleDazzle
			send     8
			pushi    #x
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sparkle
			send     24
			jmp      code_0616
code_0557:
			dup     
			ldi      3
			eq?     
			bnt      code_0590
			lsg      global112
			ldi      88
			eq?     
			bt       code_056b
			lsg      global112
			ldi      49
			eq?     
code_056b:
			bnt      code_0578
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			jmp      code_0589
code_0578:
			pushi    #view
			pushi    1
			lsl      local0
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     18
code_0589:
			ldi      12
			aTop     ticks
			jmp      code_0616
code_0590:
			dup     
			ldi      4
			eq?     
			bnt      code_05e2
			pushi    #dispose
			pushi    0
			lofsa    sparkle
			send     4
			lsg      global154
			ldi      3
			lt?     
			bnt      code_05cc
			+ag      global154
			pushi    #number
			pushi    1
			pushi    916
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global114
			send     16
			lsg      global15
			ldi      75
			add     
			sag      global15
			pushi    #doit
			pushi    0
			pushi    2
			pushi    0
			pushi    1
			callk    ScriptID,  4
			send     4
code_05cc:
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    750
			pushi    0
			callk    ScriptID,  4
			send     6
			ldi      60
			aTop     ticks
			jmp      code_0616
code_05e2:
			dup     
			ldi      5
			eq?     
			bnt      code_0616
			pushi    #dispose
			pushi    0
			lofsa    razzleDazzle
			send     4
			pushi    #number
			pushi    1
			pushi    401
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    0
			calle    proc750_1,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    223
			callk    DisposeScript,  2
code_0616:
			toss    
			ret     
		)
	)
)

(instance razzleDazzle of Sound
	(properties
		number 216
	)
)

(instance unTreeEgo of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06a7
			lag      global143
			not     
			bnt      code_06a0
			pushi    0
			callb    proc0_3,  0
code_06a0:
			ldi      4
			aTop     seconds
			jmp      code_0b0b
code_06a7:
			dup     
			ldi      1
			eq?     
			bnt      code_0728
			pushi    5
			pushi    1223
			pushi    4
			pushSelf
			pushi    80
			lsg      global124
			dup     
			ldi      11
			eq?     
			bnt      code_06c7
			lofsa    {Birch}
			jmp      code_071f
code_06c7:
			dup     
			ldi      12
			eq?     
			bnt      code_06d4
			lofsa    {Rowan}
			jmp      code_071f
code_06d4:
			dup     
			ldi      13
			eq?     
			bnt      code_06e1
			lofsa    {Ash}
			jmp      code_071f
code_06e1:
			dup     
			ldi      14
			eq?     
			bnt      code_06ee
			lofsa    {Alder}
			jmp      code_071f
code_06ee:
			dup     
			ldi      15
			eq?     
			bnt      code_06fb
			lofsa    {Holly}
			jmp      code_071f
code_06fb:
			dup     
			ldi      16
			eq?     
			bnt      code_0708
			lofsa    {Hazel}
			jmp      code_071f
code_0708:
			dup     
			ldi      17
			eq?     
			bnt      code_0715
			lofsa    {Elder}
			jmp      code_071f
code_0715:
			dup     
			ldi      18
			eq?     
			bnt      code_071f
			lofsa    {Oak}
code_071f:
			toss    
			push    
			calle    proc13_4,  10
			jmp      code_0b0b
code_0728:
			dup     
			ldi      2
			eq?     
			bnt      code_0770
			lsg      global112
			ldi      88
			eq?     
			bt       code_073c
			lsg      global112
			ldi      49
			eq?     
code_073c:
			bnt      code_0748
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0b0b
code_0748:
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_0760
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_0760:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			ldi      120
			aTop     ticks
			jmp      code_0b0b
code_0770:
			dup     
			ldi      3
			eq?     
			bnt      code_07b5
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    razzleDazzle
			send     8
			pushi    #x
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sparkle
			send     36
			jmp      code_0b0b
code_07b5:
			dup     
			ldi      4
			eq?     
			bnt      code_0805
			pushi    #dispose
			pushi    0
			lofsa    sparkle
			send     4
			lsg      global112
			ldi      88
			eq?     
			bt       code_07d1
			lsg      global112
			ldi      49
			eq?     
code_07d1:
			bnt      code_07fc
			pushi    194
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
			ldi      6
			add     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_0b0b
code_07fc:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0b0b
code_0805:
			dup     
			ldi      5
			eq?     
			bnt      code_0a1f
			pushi    #dispose
			pushi    0
			lofsa    razzleDazzle
			send     4
			pushi    0
			callb    proc0_2,  0
			lsg      global112
			ldi      88
			eq?     
			bt       code_0825
			lsg      global112
			ldi      49
			eq?     
code_0825:
			bnt      code_0831
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0993
code_0831:
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0958
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    64
			pushi    189
			pushi    156
			pushi    178
			pushi    160
			pushi    181
			pushi    170
			pushi    176
			pushi    173
			pushi    169
			pushi    171
			pushi    160
			pushi    166
			pushi    136
			pushi    166
			pushi    140
			pushi    161
			pushi    177
			pushi    153
			pushi    170
			pushi    145
			pushi    179
			pushi    136
			pushi    158
			pushi    131
			pushi    153
			pushi    126
			pushi    136
			pushi    126
			pushi    122
			pushi    136
			pushi    60
			pushi    157
			pushi    50
			pushi    165
			pushi    30
			pushi    165
			pushi    30
			pushi    160
			pushi    50
			pushi    155
			pushi    68
			pushi    144
			pushi    43
			pushi    152
			pushi    31
			pushi    152
			pushi    39
			pushi    142
			pushi    80
			pushi    141
			pushi    125
			pushi    121
			pushi    199
			pushi    125
			pushi    222
			pushi    121
			pushi    243
			pushi    136
			pushi    247
			pushi    156
			pushi    248
			pushi    165
			pushi    225
			pushi    151
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     142
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    300
			pushi    167
			pushi    277
			pushi    166
			pushi    266
			pushi    154
			pushi    251
			pushi    145
			pushi    255
			pushi    137
			pushi    277
			pushi    138
			pushi    319
			pushi    139
			pushi    319
			pushi    159
			pushi    300
			pushi    158
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     8
			ldi      30
			aTop     ticks
			jmp      code_0993
code_0958:
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			dup     
			ldi      220
			eq?     
			bnt      code_0971
			pushi    0
			calle    proc221_0,  0
			jmp      code_098e
code_0971:
			dup     
			ldi      230
			eq?     
			bnt      code_0981
			pushi    0
			calle    proc231_0,  0
			jmp      code_098e
code_0981:
			dup     
			ldi      240
			eq?     
			bnt      code_098e
			pushi    0
			calle    proc241_0,  0
code_098e:
			toss    
			ldi      30
			aTop     ticks
code_0993:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_09d7
			pushi    1
			pushi    36
			callb    proc0_5,  2
			not     
			bnt      code_09d7
			pushi    1
			pushi    36
			callb    proc0_6,  2
			pushi    1
			pushi    129
			callb    proc0_7,  2
			ldi      0
			sag      global137
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #keep
			pushi    1
			pushi    0
			pushi    2
			pushi    750
			pushi    0
			callk    ScriptID,  4
			send     6
			jmp      code_0a18
code_09d7:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0a18
			pushi    1
			pushi    38
			callb    proc0_5,  2
			not     
			bnt      code_0a18
			pushi    1
			pushi    38
			callb    proc0_6,  2
			pushi    1
			pushi    129
			callb    proc0_7,  2
			ldi      0
			sag      global137
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #keep
			pushi    1
			pushi    0
			pushi    2
			pushi    750
			pushi    0
			callk    ScriptID,  4
			send     6
code_0a18:
			ldi      2
			aTop     seconds
			jmp      code_0b0b
code_0a1f:
			dup     
			ldi      6
			eq?     
			bnt      code_0a48
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0a35
			ldi      5
			sat      temp0
			jmp      code_0a39
code_0a35:
			ldi      6
			sat      temp0
code_0a39:
			pushi    3
			pushi    1223
			lst      temp0
			pushSelf
			calle    proc13_4,  6
			jmp      code_0b0b
code_0a48:
			dup     
			ldi      7
			eq?     
			bnt      code_0a67
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0a5e
			ldi      100
			aTop     ticks
			jmp      code_0b0b
code_0a5e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0b0b
code_0a67:
			dup     
			ldi      8
			eq?     
			bnt      code_0af0
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0b0b
			pushi    5
			pushi    1223
			pushi    7
			pushSelf
			pushi    80
			lsg      global124
			dup     
			ldi      11
			eq?     
			bnt      code_0a8f
			lofsa    {Birch}
			jmp      code_0ae7
code_0a8f:
			dup     
			ldi      12
			eq?     
			bnt      code_0a9c
			lofsa    {Rowan}
			jmp      code_0ae7
code_0a9c:
			dup     
			ldi      13
			eq?     
			bnt      code_0aa9
			lofsa    {Ash}
			jmp      code_0ae7
code_0aa9:
			dup     
			ldi      14
			eq?     
			bnt      code_0ab6
			lofsa    {Alder}
			jmp      code_0ae7
code_0ab6:
			dup     
			ldi      15
			eq?     
			bnt      code_0ac3
			lofsa    {Holly}
			jmp      code_0ae7
code_0ac3:
			dup     
			ldi      16
			eq?     
			bnt      code_0ad0
			lofsa    {Hazel}
			jmp      code_0ae7
code_0ad0:
			dup     
			ldi      17
			eq?     
			bnt      code_0add
			lofsa    {Elder}
			jmp      code_0ae7
code_0add:
			dup     
			ldi      18
			eq?     
			bnt      code_0ae7
			lofsa    {Oak}
code_0ae7:
			toss    
			push    
			calle    proc13_4,  10
			jmp      code_0b0b
code_0af0:
			dup     
			ldi      9
			eq?     
			bnt      code_0b0b
			pushi    0
			callb    proc0_4,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    223
			callk    DisposeScript,  2
code_0b0b:
			toss    
			ret     
		)
	)
)

(instance sparkle of Prop
	(properties
		view 245
		loop 1
		signal $4000
	)
)
