;;; Sierra Script 1.0 - (do not remove this comment)
(script# 670)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	rm670 0
)

(local
	[local0 4]
	local4
	[local5 5]
	[local10 5]
	[local15 26] = [1670 0 2 1 2 1 2 1 2 1 2 1 2 1 2 2 1 2 1 2 1 2 1 2 2]
	[local41 6] = [1670 23 2 1 2]
	[local47 8] = [1670 26 2 1 2 1 2]
	[local55 6] = [1670 31 2 1 2]
	[local61 4] = [1670 34 1]
	[local65 4] = [1670 45 1]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      5
		lt?     
		bnt      code_0116
		pushi    #new
		pushi    0
		lofsa    oRat
		send     4
		push    
		lat      temp0
		sali     local5
		pushi    6
		pushi    1
		lst      temp0
		dup     
		ldi      0
		eq?     
		bnt      code_003a
		ldi      0
		jmp      code_0067
code_003a:
		dup     
		ldi      1
		eq?     
		bnt      code_0046
		ldi      1
		jmp      code_0067
code_0046:
		dup     
		ldi      2
		eq?     
		bnt      code_0052
		ldi      3
		jmp      code_0067
code_0052:
		dup     
		ldi      3
		eq?     
		bnt      code_005e
		ldi      5
		jmp      code_0067
code_005e:
		dup     
		ldi      4
		eq?     
		bnt      code_0067
		ldi      10
code_0067:
		toss    
		push    
		pushi    4
		pushi    1
		lst      temp0
		dup     
		ldi      0
		eq?     
		bnt      code_007a
		ldi      101
		jmp      code_00a9
code_007a:
		dup     
		ldi      1
		eq?     
		bnt      code_0087
		ldi      243
		jmp      code_00a9
code_0087:
		dup     
		ldi      2
		eq?     
		bnt      code_0093
		ldi      93
		jmp      code_00a9
code_0093:
		dup     
		ldi      3
		eq?     
		bnt      code_00a0
		ldi      167
		jmp      code_00a9
code_00a0:
		dup     
		ldi      4
		eq?     
		bnt      code_00a9
		ldi      70
code_00a9:
		toss    
		push    
		pushi    3
		pushi    1
		lst      temp0
		dup     
		ldi      0
		eq?     
		bnt      code_00bd
		ldi      150
		jmp      code_00ee
code_00bd:
		dup     
		ldi      1
		eq?     
		bnt      code_00ca
		ldi      173
		jmp      code_00ee
code_00ca:
		dup     
		ldi      2
		eq?     
		bnt      code_00d7
		ldi      159
		jmp      code_00ee
code_00d7:
		dup     
		ldi      3
		eq?     
		bnt      code_00e4
		ldi      150
		jmp      code_00ee
code_00e4:
		dup     
		ldi      4
		eq?     
		bnt      code_00ee
		ldi      160
code_00ee:
		toss    
		push    
		pushi    219
		pushi    1
		pushi    3
		pushi    107
		pushi    0
		pushi    142
		pushi    1
		pushi    #new
		pushi    0
		lofsa    runAround
		send     4
		push    
		lat      temp0
		sali     local10
		push    
		lat      temp0
		lali     local5
		send     34
		+at      temp0
		jmp      code_0014
code_0116:
		ret     
	)
)

(instance rm670 of Rm
	(properties
		picture 670
	)
	
	(method (init &tmp temp0 temp1)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			call     localproc_000e,  0
			pushi    12
			lofsa    bucket
			push    
			lofsa    highWindow
			push    
			lofsa    rack
			push    
			lofsa    strappado
			push    
			lofsa    wheel
			push    
			lofsa    leftRope
			push    
			lofsa    rightRope
			push    
			lofsa    rightTopRope
			push    
			lofsa    wallChain
			push    
			lofsa    highChain
			push    
			lofsa    walls
			push    
			lofsa    floor
			push    
			calle    proc806_3,  24
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    36
			pushi    78
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    65535
			pushi    319
			pushi    65535
			pushi    319
			pushi    189
			pushi    243
			pushi    189
			pushi    251
			pushi    183
			pushi    229
			pushi    178
			pushi    226
			pushi    167
			pushi    266
			pushi    166
			pushi    265
			pushi    164
			pushi    215
			pushi    166
			pushi    188
			pushi    159
			pushi    158
			pushi    151
			pushi    47
			pushi    151
			pushi    48
			pushi    176
			pushi    83
			pushi    176
			pushi    83
			pushi    184
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     86
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    14
			pushi    56
			pushi    154
			pushi    162
			pushi    154
			pushi    187
			pushi    160
			pushi    179
			pushi    169
			pushi    147
			pushi    169
			pushi    124
			pushi    163
			pushi    61
			pushi    163
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			push    
			lag      global2
			send     8
			pushi    0
			callb    proc0_2,  0
			pushi    #wherePrior
			pushi    0
			class    Monastery
			send     4
			sat      temp0
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			sat      temp1
			push    
			ldi      0
			eq?     
			bnt      code_027b
			lst      temp0
			ldi      1
			gt?     
			bnt      code_0246
			pushi    1
			pushi    65486
			calle    proc806_1,  2
code_0246:
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    171
			pushi    126
			pushi    107
			pushi    0
			pushi    273
			pushi    1
			pushi    178
			pushi    274
			pushi    1
			pushi    155
			pushi    281
			pushi    1
			pushi    3
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     42
			jmp      code_02ae
code_027b:
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    9
			pushi    284
			pushi    2
			pushi    162
			pushi    165
			pushi    107
			pushi    0
			pushi    273
			pushi    1
			pushi    172
			pushi    274
			pushi    1
			pushi    165
			pushi    281
			pushi    1
			pushi    3
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     42
code_02ae:
			lst      temp0
			dup     
			ldi      0
			eq?     
			bnt      code_02f5
			pushi    #posn
			pushi    2
			pushi    95
			pushi    230
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    4
			pushi    284
			pushi    2
			pushi    161
			pushi    170
			pushi    107
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     24
			pushi    #setScript
			pushi    1
			lofsa    meetTheMonk
			push    
			self     6
			jmp      code_0355
code_02f5:
			dup     
			ldi      1
			eq?     
			bnt      code_0339
			pushi    #posn
			pushi    2
			pushi    95
			pushi    230
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    206
			pushi    169
			pushi    107
			pushi    0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     24
			pushi    #setScript
			pushi    1
			lofsa    meetThePrior
			push    
			self     6
			jmp      code_0355
code_0339:
			pushi    #posn
			pushi    2
			pushi    160
			pushi    240
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    #setScript
			pushi    2
			lofsa    walkIn
			push    
			pushSelf
			self     8
code_0355:
			toss    
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    sqeakSound
			send     8
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0370
			jmp      code_03a9
code_0370:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0395
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_0395
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
			jmp      code_03a9
code_0395:
			lsg      global115
			ldi      2
			eq?     
			bnt      code_03a9
			pushi    #setScript
			pushi    1
			lofsa    burnedByFire
			push    
			lag      global0
			send     6
code_03a9:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    927
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance oRat of Actor
	(properties
		yStep 4
		view 705
		signal $4000
		cycleSpeed 40
		illegalBits $0000
		xStep 6
		moveSpeed 0
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0422
			pushi    2
			pushi    1670
			pushi    50
			calle    proc13_4,  4
			jmp      code_0491
code_0422:
			dup     
			ldi      3
			eq?     
			bnt      code_0436
			pushi    2
			pushi    1670
			pushi    51
			calle    proc13_4,  4
			jmp      code_0491
code_0436:
			dup     
			ldi      5
			eq?     
			bnt      code_045e
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    4
			pushi    1670
			pushi    52
			pushi    80
			lofsa    {Rat}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0491
code_045e:
			dup     
			ldi      4
			eq?     
			bnt      code_0486
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    4
			pushi    1670
			pushi    53
			pushi    80
			lofsa    {Rat}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0491
code_0486:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_0491:
			toss    
			ret     
		)
	)
)

(instance bucket of Feature
	(properties
		x 73
		y 175
		nsTop 164
		nsLeft 68
		nsBottom 186
		nsRight 79
		sightAngle 90
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0530
			pushi    2
			pushi    1670
			pushi    43
			calle    proc13_4,  4
			jmp      code_054f
code_0530:
			dup     
			ldi      3
			eq?     
			bnt      code_0544
			pushi    2
			pushi    1670
			pushi    44
			calle    proc13_4,  4
			jmp      code_054f
code_0544:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_054f:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties
		y 10
		nsLeft 47
		nsBottom 150
		nsRight 268
		lookStr 40
	)
)

(instance floor of Feature
	(properties
		y 10
		nsTop 150
		nsLeft 47
		nsBottom 189
		nsRight 268
		lookStr 42
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_05e8
			pushi    2
			pushi    1670
			pushi    46
			calle    proc13_4,  4
			jmp      code_05f3
code_05e8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_05f3:
			toss    
			ret     
		)
	)
)

(instance highWindow of Feature
	(properties
		x 198
		y 24
		nsTop 4
		nsLeft 190
		nsBottom 44
		nsRight 207
		sightAngle 90
		lookStr 41
	)
)

(instance rack of Feature
	(properties
		y 20
		lookStr 37
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    52
			pushi    67
			pushi    141
			pushi    77
			pushi    135
			pushi    79
			pushi    128
			pushi    81
			pushi    128
			pushi    81
			pushi    133
			pushi    110
			pushi    122
			pushi    110
			pushi    117
			pushi    114
			pushi    117
			pushi    116
			pushi    120
			pushi    130
			pushi    119
			pushi    132
			pushi    116
			pushi    136
			pushi    116
			pushi    137
			pushi    120
			pushi    137
			pushi    124
			pushi    120
			pushi    134
			pushi    123
			pushi    156
			pushi    120
			pushi    157
			pushi    118
			pushi    147
			pushi    107
			pushi    148
			pushi    104
			pushi    159
			pushi    99
			pushi    159
			pushi    100
			pushi    155
			pushi    91
			pushi    155
			pushi    88
			pushi    159
			pushi    82
			pushi    159
			pushi    67
			pushi    155
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     118
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

(instance strappado of Feature
	(properties
		y 20
		lookStr 35
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    28
			pushi    115
			pushi    27
			pushi    124
			pushi    24
			pushi    180
			pushi    42
			pushi    179
			pushi    48
			pushi    165
			pushi    47
			pushi    159
			pushi    52
			pushi    158
			pushi    136
			pushi    167
			pushi    158
			pushi    147
			pushi    165
			pushi    132
			pushi    161
			pushi    144
			pushi    137
			pushi    147
			pushi    54
			pushi    136
			pushi    38
			pushi    115
			pushi    32
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     70
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

(instance wheel of Feature
	(properties
		y 20
		lookStr 38
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    248
			pushi    108
			pushi    248
			pushi    162
			pushi    241
			pushi    162
			pushi    233
			pushi    154
			pushi    230
			pushi    140
			pushi    232
			pushi    128
			pushi    237
			pushi    116
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
)

(instance leftRope of Feature
	(properties
		y 20
		lookStr 36
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    38
			pushi    69
			pushi    44
			pushi    77
			pushi    48
			pushi    98
			pushi    48
			pushi    113
			pushi    43
			pushi    123
			pushi    35
			pushi    130
			pushi    35
			pushi    131
			pushi    40
			pushi    128
			pushi    42
			pushi    129
			pushi    66
			pushi    122
			pushi    83
			pushi    119
			pushi    83
			pushi    117
			pushi    78
			pushi    120
			pushi    72
			pushi    123
			pushi    42
			pushi    121
			pushi    42
			pushi    116
			pushi    45
			pushi    94
			pushi    53
			pushi    73
			pushi    53
			pushi    69
			pushi    50
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     90
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0943
			pushi    2
			pushi    1670
			pushi    47
			calle    proc13_4,  4
			jmp      code_094e
code_0943:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_094e:
			toss    
			ret     
		)
	)
)

(instance rightRope of Feature
	(properties
		y 44
		lookStr 36
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    42
			pushi    224
			pushi    44
			pushi    228
			pushi    48
			pushi    229
			pushi    54
			pushi    221
			pushi    59
			pushi    220
			pushi    76
			pushi    219
			pushi    102
			pushi    219
			pushi    130
			pushi    219
			pushi    149
			pushi    215
			pushi    148
			pushi    214
			pushi    135
			pushi    210
			pushi    136
			pushi    207
			pushi    130
			pushi    213
			pushi    127
			pushi    213
			pushi    117
			pushi    215
			pushi    93
			pushi    213
			pushi    63
			pushi    217
			pushi    59
			pushi    211
			pushi    59
			pushi    209
			pushi    52
			pushi    211
			pushi    48
			pushi    217
			pushi    44
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0a6a
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0a5d
			pushi    #setScript
			pushi    1
			lofsa    freeFulk
			push    
			lag      global0
			send     6
			jmp      code_0a75
code_0a5d:
			pushi    2
			pushi    1670
			pushi    49
			calle    proc13_4,  4
			jmp      code_0a75
code_0a6a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0a75:
			toss    
			ret     
		)
	)
)

(instance rightTopRope of Feature
	(properties
		y 48
		lookStr 36
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    36
			pushi    208
			pushi    57
			pushi    186
			pushi    55
			pushi    195
			pushi    60
			pushi    205
			pushi    63
			pushi    215
			pushi    60
			pushi    216
			pushi    63
			pushi    204
			pushi    67
			pushi    189
			pushi    64
			pushi    177
			pushi    56
			pushi    177
			pushi    75
			pushi    174
			pushi    77
			pushi    174
			pushi    127
			pushi    168
			pushi    124
			pushi    170
			pushi    56
			pushi    169
			pushi    55
			pushi    169
			pushi    51
			pushi    172
			pushi    48
			pushi    208
			pushi    53
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     86
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0b7b
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0b6e
			pushi    2
			pushi    1670
			pushi    48
			calle    proc13_4,  4
			jmp      code_0b86
code_0b6e:
			pushi    2
			pushi    1670
			pushi    49
			calle    proc13_4,  4
			jmp      code_0b86
code_0b7b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b86:
			toss    
			ret     
		)
	)
)

(instance wallChain of Feature
	(properties
		y 20
		lookStr 39
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    30
			pushi    182
			pushi    95
			pushi    186
			pushi    95
			pushi    190
			pushi    99
			pushi    187
			pushi    104
			pushi    184
			pushi    106
			pushi    186
			pushi    110
			pushi    186
			pushi    119
			pushi    182
			pushi    122
			pushi    182
			pushi    142
			pushi    180
			pushi    142
			pushi    179
			pushi    116
			pushi    180
			pushi    108
			pushi    181
			pushi    105
			pushi    177
			pushi    103
			pushi    177
			pushi    97
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
)

(instance highChain of Feature
	(properties
		y 20
		lookStr 39
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    30
			pushi    230
			pushi    22
			pushi    250
			pushi    16
			pushi    250
			pushi    25
			pushi    249
			pushi    36
			pushi    241
			pushi    32
			pushi    243
			pushi    37
			pushi    241
			pushi    55
			pushi    240
			pushi    70
			pushi    241
			pushi    76
			pushi    239
			pushi    77
			pushi    236
			pushi    68
			pushi    238
			pushi    37
			pushi    235
			pushi    34
			pushi    237
			pushi    31
			pushi    232
			pushi    30
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
			bnt      code_0d85
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    106
			pushi    180
			pushSelf
			lag      global0
			send     12
			jmp      code_0e06
code_0d85:
			dup     
			ldi      1
			eq?     
			bnt      code_0db6
			pushi    2
			lsg      global0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			push    
			callb    proc0_9,  4
			pushi    4
			lea      @local47
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0e06
code_0db6:
			dup     
			ldi      2
			eq?     
			bnt      code_0de0
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    180
			pushi    250
			pushSelf
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_0e06
code_0de0:
			dup     
			ldi      3
			eq?     
			bnt      code_0e06
			pushi    #wherePrior
			pushi    1
			pushi    2
			class    Monastery
			send     6
			pushi    0
			callb    proc0_4,  0
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
code_0e06:
			toss    
			ret     
		)
	)
)

(instance meetTheMonk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e67
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    106
			pushi    180
			pushSelf
			lag      global0
			send     12
			jmp      code_0efc
code_0e67:
			dup     
			ldi      1
			eq?     
			bnt      code_0e91
			pushi    2
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    3
			lsg      global0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0efc
code_0e91:
			dup     
			ldi      2
			eq?     
			bnt      code_0eab
			pushi    4
			lea      @local61
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0efc
code_0eab:
			dup     
			ldi      3
			eq?     
			bnt      code_0ee5
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    126
			pushi    180
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     16
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    106
			pushi    250
			pushSelf
			lag      global0
			send     12
			jmp      code_0efc
code_0ee5:
			dup     
			ldi      4
			eq?     
			bnt      code_0efc
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
code_0efc:
			toss    
			ret     
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
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
			bnt      code_0f69
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    202
			pushi    172
			pushSelf
			lag      global0
			send     12
			jmp      code_1093
code_0f69:
			dup     
			ldi      1
			eq?     
			bnt      code_0f82
			pushi    3
			lsg      global0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1093
code_0f82:
			dup     
			ldi      2
			eq?     
			bnt      code_0fe3
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0fdb
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_0fc0
			pushi    4
			lea      @local55
			push    
			pushi    8
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1093
code_0fc0:
			pushi    4
			lea      @local41
			push    
			pushi    8
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1093
code_0fdb:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1093
code_0fe3:
			dup     
			ldi      3
			eq?     
			bnt      code_1020
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_1019
			pushi    #fulkStatus
			pushi    1
			pushi    3
			class    Monastery
			send     6
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    65535
			pushSelf
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     12
			jmp      code_1093
code_1019:
			ldi      2
			aTop     cycles
			jmp      code_1093
code_1020:
			dup     
			ldi      4
			eq?     
			bnt      code_107c
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_1074
			pushi    #view
			pushi    1
			pushi    671
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    110
			pushi    250
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     34
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    170
			pushi    250
			pushSelf
			lag      global0
			send     12
			jmp      code_1093
code_1074:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1093
code_107c:
			dup     
			ldi      5
			eq?     
			bnt      code_1093
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1093:
			toss    
			ret     
		)
	)
)

(instance freeFulk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10fa
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    233
			pushi    157
			pushSelf
			lag      global0
			send     12
			jmp      code_13e9
code_10fa:
			dup     
			ldi      1
			eq?     
			bnt      code_1110
			pushi    #setHeading
			pushi    2
			pushi    270
			pushSelf
			lag      global0
			send     8
			jmp      code_13e9
code_1110:
			dup     
			ldi      2
			eq?     
			bnt      code_1186
			pushi    #setPri
			pushi    1
			pushi    10
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     6
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     26
			pushi    56
			pushi    1
			lsg      global141
			ldi      3
			mul     
			push    
			pushi    55
			pushi    1
			pushi    6
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     4
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     22
			jmp      code_13e9
code_1186:
			dup     
			ldi      3
			eq?     
			bnt      code_11bb
			pushi    #play
			pushi    0
			lofsa    pulleySound
			send     4
			pushi    #play
			pushi    0
			lofsa    ropeSound
			send     4
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_13e9
code_11bb:
			dup     
			ldi      4
			eq?     
			bnt      code_11e0
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_13e9
code_11e0:
			dup     
			ldi      5
			eq?     
			bnt      code_1205
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_13e9
code_1205:
			dup     
			ldi      6
			eq?     
			bnt      code_122a
			pushi    #view
			pushi    1
			pushi    20
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_13e9
code_122a:
			dup     
			ldi      7
			eq?     
			bnt      code_126a
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     6
			pushi    #stop
			pushi    0
			lofsa    pulleySound
			send     4
			pushi    #stop
			pushi    0
			lofsa    ropeSound
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    168
			pushi    164
			pushSelf
			lag      global0
			send     12
			jmp      code_13e9
code_126a:
			dup     
			ldi      8
			eq?     
			bnt      code_1285
			pushi    2
			lsg      global0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      1
			aTop     cycles
			jmp      code_13e9
code_1285:
			dup     
			ldi      9
			eq?     
			bnt      code_12f0
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    16
			class    Inv
			send     6
			send     4
			push    
			ldi      670
			eq?     
			bnt      code_12c9
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_12bd
			pushi    #fulkStatus
			pushi    1
			pushi    3
			class    Monastery
			send     6
			jmp      code_12d2
code_12bd:
			pushi    #fulkStatus
			pushi    1
			pushi    2
			class    Monastery
			send     6
			jmp      code_12d2
code_12c9:
			pushi    #fulkStatus
			pushi    1
			pushi    1
			class    Monastery
			send     6
code_12d2:
			pushi    #yStep
			pushi    1
			pushi    2
			pushi    56
			pushi    1
			pushi    6
			pushi    5
			pushi    1
			pushi    671
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     18
			ldi      10
			aTop     cycles
			jmp      code_13e9
code_12f0:
			dup     
			ldi      10
			eq?     
			bnt      code_1317
			pushi    #loop
			pushi    1
			pushi    2
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     6
			pushi    #cel
			pushi    1
			pushi    5
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     6
			ldi      2
			aTop     cycles
			jmp      code_13e9
code_1317:
			dup     
			ldi      11
			eq?     
			bnt      code_1352
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    162
			pushi    165
			pushSelf
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     18
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    195
			pushi    168
			pushSelf
			lag      global0
			send     12
			jmp      code_13e9
code_1352:
			dup     
			ldi      12
			eq?     
			bnt      code_135c
			jmp      code_13e9
code_135c:
			dup     
			ldi      13
			eq?     
			bnt      code_1384
			pushi    2
			pushi    1
			pushi    15
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      3
			aTop     cycles
			jmp      code_13e9
code_1384:
			dup     
			ldi      14
			eq?     
			bnt      code_13ae
			pushi    #view
			pushi    1
			pushi    674
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    5
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     26
			jmp      code_13e9
code_13ae:
			dup     
			ldi      15
			eq?     
			bnt      code_13d0
			pushi    4
			lea      @local15
			push    
			pushi    8
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_13e9
code_13d0:
			dup     
			ldi      16
			eq?     
			bnt      code_13e9
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_13e9:
			toss    
			ret     
		)
	)
)

(class runAround of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_143f
			pushi    2
			pushi    30
			pushi    120
			callk    Random,  4
			aTop     ticks
			jmp      code_1489
code_143f:
			dup     
			ldi      1
			eq?     
			bnt      code_1478
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			lt?     
			bnt      code_1469
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1489
code_1469:
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1489
code_1478:
			dup     
			ldi      2
			eq?     
			bnt      code_1489
			ldi      65535
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_1489:
			toss    
			ret     
		)
	)
)

(instance burnedByFire of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1512
			pushi    0
			callb    proc0_3,  0
			ldi      20
			sag      global145
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    168
			pushi    163
			pushSelf
			lag      global0
			send     12
			jmp      code_1608
code_1512:
			dup     
			ldi      1
			eq?     
			bnt      code_155d
			pushi    #view
			pushi    1
			pushi    16
			pushi    162
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    85
			pushi    238
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    168
			pushi    183
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local4
			send     48
			jmp      code_1608
code_155d:
			dup     
			ldi      2
			eq?     
			bnt      code_1571
			pushi    3
			lsg      global0
			lsl      local4
			pushSelf
			callb    proc0_9,  6
			jmp      code_1608
code_1571:
			dup     
			ldi      3
			eq?     
			bnt      code_1585
			pushi    3
			lsl      local4
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1608
code_1585:
			dup     
			ldi      4
			eq?     
			bnt      code_159f
			pushi    4
			lea      @local65
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1608
code_159f:
			dup     
			ldi      5
			eq?     
			bnt      code_15c9
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
			pushi    1
			class    End
			push    
			lal      local4
			send     24
			ldi      2
			aTop     cycles
			jmp      code_1608
code_15c9:
			dup     
			ldi      6
			eq?     
			bnt      code_15f6
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
			jmp      code_1608
code_15f6:
			dup     
			ldi      7
			eq?     
			bnt      code_1608
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_1608:
			toss    
			ret     
		)
	)
)

(instance sqeakSound of Sound
	(properties
		flags $0001
		number 671
		loop -1
	)
)

(instance ropeSound of Sound
	(properties
		flags $0001
		number 670
		loop -1
	)
)

(instance pulleySound of Sound
	(properties
		flags $0001
		number 672
		loop -1
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
