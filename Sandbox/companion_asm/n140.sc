;;; Sierra Script 1.0 - (do not remove this comment)
(script# 140)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n813)
(use n945)
(use n946)
(use n950)
(use n958)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm140 0
	fire 1
	ledge 2
	peg 3
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
	local14
	[local15 5] = [1140 0 1 1]
)
(procedure (localproc_001a)
	(asm
		lsg      global130
		ldi      1
		eq?     
		bnt      code_003b
		pushi    #has
		pushi    1
		pushi    1
		lag      global0
		send     6
		not     
		bnt      code_003b
		pushi    #init
		pushi    0
		pushi    285
		pushi    0
		lofsa    horn
		send     8
code_003b:
		lsg      global126
		ldi      0
		eq?     
		bt       code_0048
		lsg      global126
		ldi      4
		eq?     
code_0048:
		bnt      code_0056
		pushi    #dispose
		pushi    0
		lofsa    bow
		send     4
		jmp      code_0062
code_0056:
		pushi    #init
		pushi    0
		pushi    285
		pushi    0
		lofsa    bow
		send     8
code_0062:
		ret     
	)
)

(procedure (localproc_0063)
	(asm
		lsg      global126
		ldi      0
		eq?     
		bnt      code_0099
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    1
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_008a
		pushi    #has
		pushi    1
		pushi    1
		lag      global0
		send     6
code_008a:
		bnt      code_0099
		pushi    #get
		pushi    1
		pushi    1
		lag      global0
		send     6
		jmp      code_00b1
code_0099:
		pushi    #has
		pushi    1
		pushi    1
		lag      global0
		send     6
		bnt      code_00b1
		pushi    #put
		pushi    2
		pushi    1
		pushi    140
		lag      global0
		send     8
code_00b1:
		pushi    6
		lsg      global126
		pushi    0
		pushi    5
		pushi    6
		pushi    2
		pushi    3
		calle    proc999_5,  12
		bnt      code_00f4
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    2
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_00e5
		pushi    #has
		pushi    1
		pushi    2
		lag      global0
		send     6
code_00e5:
		bnt      code_00f4
		pushi    #get
		pushi    1
		pushi    2
		lag      global0
		send     6
		jmp      code_010c
code_00f4:
		pushi    #has
		pushi    1
		pushi    2
		lag      global0
		send     6
		bnt      code_010c
		pushi    #put
		pushi    2
		pushi    2
		pushi    140
		lag      global0
		send     8
code_010c:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    3
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_012d
		pushi    #has
		pushi    1
		pushi    3
		lag      global0
		send     6
code_012d:
		bnt      code_014d
		lsg      global126
		ldi      0
		eq?     
		bt       code_013d
		lsg      global126
		ldi      1
		eq?     
code_013d:
		bnt      code_014d
		pushi    #get
		pushi    1
		pushi    3
		lag      global0
		send     6
		jmp      code_0167
code_014d:
		pushi    #has
		pushi    1
		pushi    3
		lag      global0
		send     6
		bnt      code_0167
		pushi    #put
		pushi    2
		pushi    3
		pushi    140
		lag      global0
		send     8
code_0167:
		lsg      global126
		ldi      0
		eq?     
		bnt      code_01a0
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    4
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_0190
		pushi    #has
		pushi    1
		pushi    4
		lag      global0
		send     6
code_0190:
		bnt      code_01a0
		pushi    #get
		pushi    1
		pushi    4
		lag      global0
		send     6
		jmp      code_01ba
code_01a0:
		pushi    #has
		pushi    1
		pushi    4
		lag      global0
		send     6
		bnt      code_01ba
		pushi    #put
		pushi    2
		pushi    4
		pushi    140
		lag      global0
		send     8
code_01ba:
		lsg      global126
		ldi      6
		eq?     
		bnt      code_01f3
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    5
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_01e3
		pushi    #has
		pushi    1
		pushi    5
		lag      global0
		send     6
code_01e3:
		bnt      code_01f3
		pushi    #get
		pushi    1
		pushi    5
		lag      global0
		send     6
		jmp      code_020d
code_01f3:
		pushi    #has
		pushi    1
		pushi    5
		lag      global0
		send     6
		bnt      code_020d
		pushi    #put
		pushi    2
		pushi    5
		pushi    140
		lag      global0
		send     8
code_020d:
		lsg      global126
		ldi      6
		eq?     
		bnt      code_0246
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    6
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_0236
		pushi    #has
		pushi    1
		pushi    6
		lag      global0
		send     6
code_0236:
		bnt      code_0246
		pushi    #get
		pushi    1
		pushi    6
		lag      global0
		send     6
		jmp      code_0260
code_0246:
		pushi    #has
		pushi    1
		pushi    6
		lag      global0
		send     6
		bnt      code_0260
		pushi    #put
		pushi    2
		pushi    6
		pushi    140
		lag      global0
		send     8
code_0260:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    7
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_0281
		pushi    #has
		pushi    1
		pushi    7
		lag      global0
		send     6
code_0281:
		bnt      code_02a1
		lsg      global126
		ldi      2
		eq?     
		bt       code_0291
		lsg      global126
		ldi      3
		eq?     
code_0291:
		bnt      code_02a1
		pushi    #get
		pushi    1
		pushi    7
		lag      global0
		send     6
		jmp      code_02bb
code_02a1:
		pushi    #has
		pushi    1
		pushi    7
		lag      global0
		send     6
		bnt      code_02bb
		pushi    #put
		pushi    2
		pushi    7
		pushi    140
		lag      global0
		send     8
code_02bb:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    8
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_02dc
		pushi    #has
		pushi    1
		pushi    8
		lag      global0
		send     6
code_02dc:
		bnt      code_02fc
		lsg      global126
		ldi      2
		eq?     
		bt       code_02ec
		lsg      global126
		ldi      3
		eq?     
code_02ec:
		bnt      code_02fc
		pushi    #get
		pushi    1
		pushi    8
		lag      global0
		send     6
		jmp      code_0316
code_02fc:
		pushi    #has
		pushi    1
		pushi    8
		lag      global0
		send     6
		bnt      code_0316
		pushi    #put
		pushi    2
		pushi    8
		pushi    140
		lag      global0
		send     8
code_0316:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    9
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_0337
		pushi    #has
		pushi    1
		pushi    9
		lag      global0
		send     6
code_0337:
		bnt      code_034f
		lsg      global126
		ldi      0
		eq?     
		bnt      code_034f
		pushi    #get
		pushi    1
		pushi    9
		lag      global0
		send     6
		jmp      code_0369
code_034f:
		pushi    #has
		pushi    1
		pushi    9
		lag      global0
		send     6
		bnt      code_0369
		pushi    #put
		pushi    2
		pushi    9
		pushi    140
		lag      global0
		send     8
code_0369:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    10
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_038a
		pushi    #has
		pushi    1
		pushi    10
		lag      global0
		send     6
code_038a:
		bnt      code_03af
		pushi    6
		lsg      global126
		pushi    0
		pushi    5
		pushi    6
		pushi    2
		pushi    3
		calle    proc999_5,  12
		bnt      code_03af
		pushi    #get
		pushi    1
		pushi    10
		lag      global0
		send     6
		jmp      code_03c9
code_03af:
		pushi    #has
		pushi    1
		pushi    10
		lag      global0
		send     6
		bnt      code_03c9
		pushi    #put
		pushi    2
		pushi    10
		pushi    140
		lag      global0
		send     8
code_03c9:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    11
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_03ea
		pushi    #has
		pushi    1
		pushi    11
		lag      global0
		send     6
code_03ea:
		bnt      code_0402
		lsg      global126
		ldi      5
		eq?     
		bnt      code_0402
		pushi    #get
		pushi    1
		pushi    11
		lag      global0
		send     6
		jmp      code_041c
code_0402:
		pushi    #has
		pushi    1
		pushi    11
		lag      global0
		send     6
		bnt      code_041c
		pushi    #put
		pushi    2
		pushi    11
		pushi    140
		lag      global0
		send     8
code_041c:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    12
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_043d
		pushi    #has
		pushi    1
		pushi    12
		lag      global0
		send     6
code_043d:
		bnt      code_045d
		lsg      global126
		ldi      0
		eq?     
		bt       code_044d
		lsg      global126
		ldi      5
		eq?     
code_044d:
		bnt      code_045d
		pushi    #get
		pushi    1
		pushi    12
		lag      global0
		send     6
		jmp      code_0477
code_045d:
		pushi    #has
		pushi    1
		pushi    12
		lag      global0
		send     6
		bnt      code_0477
		pushi    #put
		pushi    2
		pushi    12
		pushi    140
		lag      global0
		send     8
code_0477:
		pushi    1
		pushi    101
		callb    proc0_5,  2
		bnt      code_048a
		pushi    #put
		pushi    1
		pushi    12
		lag      global0
		send     6
code_048a:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    13
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_04ab
		pushi    #has
		pushi    1
		pushi    13
		lag      global0
		send     6
code_04ab:
		bnt      code_04c3
		lsg      global126
		ldi      5
		eq?     
		bnt      code_04c3
		pushi    #get
		pushi    1
		pushi    13
		lag      global0
		send     6
		jmp      code_04dd
code_04c3:
		pushi    #has
		pushi    1
		pushi    13
		lag      global0
		send     6
		bnt      code_04dd
		pushi    #put
		pushi    2
		pushi    13
		pushi    140
		lag      global0
		send     8
code_04dd:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    14
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_04fe
		pushi    #has
		pushi    1
		pushi    14
		lag      global0
		send     6
code_04fe:
		bnt      code_0523
		pushi    6
		lsg      global126
		pushi    0
		pushi    5
		pushi    6
		pushi    2
		pushi    3
		calle    proc999_5,  12
		bnt      code_0523
		pushi    #get
		pushi    1
		pushi    14
		lag      global0
		send     6
		jmp      code_053d
code_0523:
		pushi    #has
		pushi    1
		pushi    14
		lag      global0
		send     6
		bnt      code_053d
		pushi    #put
		pushi    2
		pushi    14
		pushi    140
		lag      global0
		send     8
code_053d:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    15
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_055e
		pushi    #has
		pushi    1
		pushi    15
		lag      global0
		send     6
code_055e:
		bnt      code_057e
		lsg      global126
		ldi      0
		eq?     
		bt       code_056e
		lsg      global126
		ldi      1
		eq?     
code_056e:
		bnt      code_057e
		pushi    #get
		pushi    1
		pushi    15
		lag      global0
		send     6
		jmp      code_0598
code_057e:
		pushi    #has
		pushi    1
		pushi    15
		lag      global0
		send     6
		bnt      code_0598
		pushi    #put
		pushi    2
		pushi    15
		pushi    140
		lag      global0
		send     8
code_0598:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    16
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_05b9
		pushi    #has
		pushi    1
		pushi    16
		lag      global0
		send     6
code_05b9:
		bnt      code_05d9
		lsg      global126
		ldi      0
		eq?     
		bt       code_05c9
		lsg      global126
		ldi      6
		eq?     
code_05c9:
		bnt      code_05d9
		pushi    #get
		pushi    1
		pushi    16
		lag      global0
		send     6
		jmp      code_05f3
code_05d9:
		pushi    #has
		pushi    1
		pushi    16
		lag      global0
		send     6
		bnt      code_05f3
		pushi    #put
		pushi    2
		pushi    16
		pushi    140
		lag      global0
		send     8
code_05f3:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    17
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_0614
		pushi    #has
		pushi    1
		pushi    17
		lag      global0
		send     6
code_0614:
		bnt      code_063c
		lsg      global126
		ldi      0
		eq?     
		bt       code_062c
		lsg      global126
		ldi      6
		eq?     
		bt       code_062c
		lsg      global126
		ldi      4
		eq?     
code_062c:
		bnt      code_063c
		pushi    #get
		pushi    1
		pushi    17
		lag      global0
		send     6
		jmp      code_0656
code_063c:
		pushi    #has
		pushi    1
		pushi    17
		lag      global0
		send     6
		bnt      code_0656
		pushi    #put
		pushi    2
		pushi    17
		pushi    140
		lag      global0
		send     8
code_0656:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    18
		lag      global9
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bt       code_0677
		pushi    #has
		pushi    1
		pushi    18
		lag      global0
		send     6
code_0677:
		bnt      code_06af
		lsg      global126
		ldi      0
		eq?     
		bt       code_069f
		lsg      global126
		ldi      5
		eq?     
		bt       code_069f
		lsg      global126
		ldi      6
		eq?     
		bt       code_069f
		lsg      global126
		ldi      2
		eq?     
		bt       code_069f
		lsg      global126
		ldi      3
		eq?     
code_069f:
		bnt      code_06af
		pushi    #get
		pushi    1
		pushi    18
		lag      global0
		send     6
		jmp      code_06c9
code_06af:
		pushi    #has
		pushi    1
		pushi    18
		lag      global0
		send     6
		bnt      code_06c9
		pushi    #put
		pushi    2
		pushi    18
		pushi    140
		lag      global0
		send     8
code_06c9:
		ret     
	)
)

(procedure (localproc_06ca)
	(asm
		pushi    #addObstacle
		pushi    2
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    86
		pushi    224
		pushi    0
		pushi    224
		pushi    71
		pushi    221
		pushi    75
		pushi    212
		pushi    75
		pushi    221
		pushi    84
		pushi    204
		pushi    87
		pushi    202
		pushi    92
		pushi    208
		pushi    98
		pushi    182
		pushi    106
		pushi    166
		pushi    107
		pushi    156
		pushi    102
		pushi    135
		pushi    102
		pushi    127
		pushi    99
		pushi    77
		pushi    104
		pushi    94
		pushi    115
		pushi    94
		pushi    125
		pushi    70
		pushi    125
		pushi    56
		pushi    122
		pushi    45
		pushi    118
		pushi    21
		pushi    118
		pushi    34
		pushi    123
		pushi    34
		pushi    146
		pushi    30
		pushi    160
		pushi    42
		pushi    175
		pushi    59
		pushi    184
		pushi    121
		pushi    187
		pushi    247
		pushi    187
		pushi    277
		pushi    170
		pushi    292
		pushi    141
		pushi    274
		pushi    124
		pushi    269
		pushi    119
		pushi    251
		pushi    111
		pushi    253
		pushi    107
		pushi    263
		pushi    96
		pushi    256
		pushi    89
		pushi    258
		pushi    83
		pushi    261
		pushi    80
		pushi    247
		pushi    68
		pushi    247
		pushi    0
		pushi    319
		pushi    0
		pushi    319
		pushi    189
		pushi    0
		pushi    189
		pushi    0
		pushi    0
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     186
		push    
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    22
		pushi    205
		pushi    139
		pushi    205
		pushi    146
		pushi    192
		pushi    146
		pushi    182
		pushi    150
		pushi    156
		pushi    148
		pushi    147
		pushi    142
		pushi    134
		pushi    142
		pushi    134
		pushi    136
		pushi    156
		pushi    130
		pushi    169
		pushi    129
		pushi    184
		pushi    131
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
		lsg      global126
		ldi      0
		ne?     
		bnt      code_08cc
		pushi    374
		pushi    1
		pushi    34
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    #x
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      19
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      17
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gRobin
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		sal      local4
		send     38
		push    
		lag      global2
		send     6
code_08cc:
		lsg      global126
		ldi      4
		ne?     
		bnt      code_09a7
		pushi    7
		lag      global130
		lt?     
		bnt      code_09a7
		pprev   
		ldi      10
		lt?     
		bnt      code_09a7
		pushi    1
		pushi    57
		callb    proc0_5,  2
		bnt      code_09a7
		pushi    374
		pushi    1
		pushi    34
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    #x
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      19
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      17
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gPuck
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		sal      local5
		send     38
		push    
		lag      global2
		send     6
code_09a7:
		lsg      global126
		ldi      2
		ne?     
		bnt      code_0a83
		pushi    1
		pushi    113
		callb    proc0_5,  2
		bnt      code_0a83
		lsg      global126
		ldi      3
		ne?     
		bnt      code_0a83
		lsg      global130
		ldi      9
		eq?     
		bnt      code_0a83
		pushi    374
		pushi    1
		pushi    34
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    #x
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      19
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      17
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gJeweler
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		sal      local6
		send     38
		push    
		lag      global2
		send     6
code_0a83:
		lsg      global126
		ldi      1
		ne?     
		bnt      code_0b57
		pushi    1
		pushi    54
		callb    proc0_5,  2
		bnt      code_0b57
		lsg      global130
		ldi      3
		eq?     
		bnt      code_0b57
		pushi    374
		pushi    1
		pushi    34
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    #x
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      19
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      17
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gBeggar
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		sal      local7
		send     38
		push    
		lag      global2
		send     6
code_0b57:
		lsg      global126
		ldi      5
		ne?     
		bnt      code_0c32
		pushi    1
		pushi    55
		callb    proc0_5,  2
		bnt      code_0c32
		pushi    4
		lag      global130
		lt?     
		bnt      code_0c32
		pprev   
		ldi      10
		lt?     
		bnt      code_0c32
		pushi    374
		pushi    1
		pushi    34
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    #x
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      19
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      17
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gAbbey
		send     4
		push    
		ldi      1
		sub     
		push    
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		sal      local8
		send     38
		push    
		lag      global2
		send     6
code_0c32:
		lsg      global126
		ldi      6
		ne?     
		bnt      code_0d0e
		pushi    1
		pushi    147
		callb    proc0_5,  2
		bnt      code_0d0e
		pushi    4
		lag      global130
		lt?     
		bnt      code_0d0e
		pprev   
		ldi      10
		lt?     
		bnt      code_0d0e
		pushi    374
		pushi    1
		pushi    34
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    #x
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      5
		add     
		push    
		pushi    #x
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      19
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      15
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      11
		sub     
		push    
		pushi    #y
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      15
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      9
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    #x
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      17
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    gFens
		send     4
		push    
		ldi      10
		sub     
		push    
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		sal      local9
		send     38
		push    
		lag      global2
		send     6
code_0d0e:
		ret     
	)
)

(instance rm140 of Rm
	(properties
		picture 140
		style $0008
		north 150
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    #number
			pushi    1
			pushi    141
			pushi    6
			pushi    1
			pushi    65535
			pushi    97
			pushi    1
			pushi    70
			pushi    42
			pushi    0
			lag      global100
			send     22
			pushi    2
			pushi    19
			pushi    20
			callk    DoSound,  4
			pushi    5
			pushi    128
			pushi    140
			pushi    213
			pushi    142
			pushi    7
			calle    proc958_0,  10
			pushi    2
			pushi    130
			pushi    969
			callk    Load,  4
			pushi    2
			pushi    129
			pushi    803
			callk    Load,  4
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #actions
			pushi    1
			lofsa    egoHorn
			push    
			lag      global0
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
			pushi    #init
			pushi    0
			lofsa    fire
			send     4
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    ledge
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    peg
			send     8
			pushi    0
			call     localproc_0063,  0
			pushi    8
			lofsa    skin1
			push    
			lofsa    skin2
			push    
			lofsa    skin3
			push    
			lofsa    bed
			push    
			lofsa    vines
			push    
			lofsa    floor
			push    
			lofsa    drape
			push    
			lofsa    entry
			push    
			calle    proc806_3,  16
			pushi    0
			call     localproc_06ca,  0
			lsg      global126
			ldi      0
			ne?     
			bnt      code_0e1b
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    gRobin
			send     8
code_0e1b:
			lsg      global126
			ldi      4
			ne?     
			bnt      code_0e47
			pushi    7
			lag      global130
			lt?     
			bnt      code_0e47
			pprev   
			ldi      10
			lt?     
			bnt      code_0e47
			pushi    1
			pushi    57
			callb    proc0_5,  2
			bnt      code_0e47
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    gPuck
			send     8
code_0e47:
			lsg      global126
			ldi      2
			ne?     
			bnt      code_0e74
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_0e74
			lsg      global126
			ldi      3
			ne?     
			bnt      code_0e74
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0e74
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    gJeweler
			send     8
code_0e74:
			lsg      global126
			ldi      1
			ne?     
			bnt      code_0e99
			pushi    1
			pushi    54
			callb    proc0_5,  2
			bnt      code_0e99
			lsg      global130
			ldi      3
			eq?     
			bnt      code_0e99
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    gBeggar
			send     8
code_0e99:
			lsg      global126
			ldi      5
			ne?     
			bnt      code_0ec5
			pushi    1
			pushi    55
			callb    proc0_5,  2
			bnt      code_0ec5
			pushi    4
			lag      global130
			lt?     
			bnt      code_0ec5
			pprev   
			ldi      10
			lt?     
			bnt      code_0ec5
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    gAbbey
			send     8
code_0ec5:
			lsg      global126
			ldi      6
			ne?     
			bnt      code_0ef2
			pushi    1
			pushi    147
			callb    proc0_5,  2
			bnt      code_0ef2
			pushi    4
			lag      global130
			lt?     
			bnt      code_0ef2
			pprev   
			ldi      10
			lt?     
			bnt      code_0ef2
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    gFens
			send     8
code_0ef2:
			pushi    0
			call     localproc_001a,  0
			pushi    0
			call     localproc_0063,  0
			lsg      global12
			ldi      150
			eq?     
			bnt      code_0f29
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    235
			pushi    82
			pushi    6
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lofsa    enterTheCave
			push    
			lag      global0
			send     24
			jmp      code_0fb5
code_0f29:
			lsg      global12
			ldi      160
			eq?     
			bnt      code_0f98
			lsg      global130
			ldi      2
			eq?     
			bnt      code_0f98
			pushi    4
			pushi    129
			pushi    803
			pushi    210
			pushi    215
			calle    proc958_0,  8
			pushi    #put
			pushi    2
			pushi    4
			pushi    140
			lag      global0
			send     8
			pushi    #view
			pushi    1
			pushi    142
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    74
			pushi    3
			pushi    1
			pushi    91
			pushi    107
			pushi    0
			pushi    66
			pushi    1
			pushi    7
			pushi    142
			pushi    1
			pushi    2
			pushi    141
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     46
			pushi    #stop
			pushi    0
			lofsa    fireSound
			send     4
			jmp      code_0fb5
code_0f98:
			pushi    #loop
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			pushi    200
			pushi    108
			pushi    107
			pushi    0
			lag      global0
			send     18
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
code_0fb5:
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0fc6
			ldi      0
			jmp      code_0fdf
code_0fc6:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      78
			lt?     
			bnt      code_0fdf
			pushi    #newRoom
			pushi    1
			pushi    150
			lag      global2
			send     6
code_0fdf:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    2
			pushi    19
			pushi    0
			callk    DoSound,  4
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_1007
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_1007:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d27
			pushi    3
			pushi    1140
			pushi    31
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d48
code_0d27:
			dup     
			ldi      3
			eq?     
			bnt      code_0d3d
			pushi    3
			pushi    1140
			pushi    32
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d48
code_0d3d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_0d48:
			toss    
			ret     
		)
	)
)

(instance floor of Feature
	(properties
		x 219
		y 90
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    108
			pushi    219
			pushi    70
			pushi    252
			pushi    70
			pushi    265
			pushi    76
			pushi    262
			pushi    89
			pushi    269
			pushi    95
			pushi    259
			pushi    110
			pushi    261
			pushi    112
			pushi    276
			pushi    115
			pushi    277
			pushi    119
			pushi    278
			pushi    123
			pushi    283
			pushi    125
			pushi    277
			pushi    135
			pushi    277
			pushi    141
			pushi    273
			pushi    143
			pushi    273
			pushi    146
			pushi    249
			pushi    164
			pushi    223
			pushi    166
			pushi    221
			pushi    167
			pushi    218
			pushi    168
			pushi    214
			pushi    171
			pushi    208
			pushi    171
			pushi    202
			pushi    176
			pushi    196
			pushi    178
			pushi    133
			pushi    178
			pushi    122
			pushi    169
			pushi    111
			pushi    167
			pushi    100
			pushi    163
			pushi    83
			pushi    159
			pushi    77
			pushi    151
			pushi    49
			pushi    144
			pushi    32
			pushi    133
			pushi    28
			pushi    128
			pushi    27
			pushi    124
			pushi    48
			pushi    112
			pushi    64
			pushi    118
			pushi    78
			pushi    118
			pushi    89
			pushi    113
			pushi    77
			pushi    104
			pushi    124
			pushi    97
			pushi    124
			pushi    92
			pushi    133
			pushi    94
			pushi    137
			pushi    98
			pushi    157
			pushi    97
			pushi    170
			pushi    103
			pushi    180
			pushi    103
			pushi    193
			pushi    102
			pushi    202
			pushi    98
			pushi    200
			pushi    94
			pushi    197
			pushi    90
			pushi    200
			pushi    89
			pushi    198
			pushi    84
			pushi    214
			pushi    83
			pushi    208
			pushi    75
			pushi    215
			pushi    73
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     230
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
			bnt      code_11c8
			pushi    3
			pushi    1140
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_11e9
code_11c8:
			dup     
			ldi      3
			eq?     
			bnt      code_11de
			pushi    3
			pushi    1140
			pushi    30
			pushi    1
			calle    proc13_4,  6
			jmp      code_11e9
code_11de:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_11e9:
			toss    
			ret     
		)
	)
)

(instance vines of Feature
	(properties
		x 224
		y 20
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    233
			pushi    18
			pushi    229
			pushi    22
			pushi    224
			pushi    17
			pushi    219
			pushi    22
			pushi    216
			pushi    19
			pushi    220
			pushi    12
			pushi    230
			pushi    6
			pushi    233
			pushi    15
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_12a3
			pushi    3
			pushi    1140
			pushi    27
			pushi    1
			calle    proc13_4,  6
			jmp      code_12c4
code_12a3:
			dup     
			ldi      3
			eq?     
			bnt      code_12b9
			pushi    3
			pushi    1140
			pushi    28
			pushi    1
			calle    proc13_4,  6
			jmp      code_12c4
code_12b9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_12c4:
			toss    
			ret     
		)
	)
)

(instance skin1 of Feature
	(properties
		x 278
		y 119
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    278
			pushi    133
			pushi    249
			pushi    139
			pushi    226
			pushi    138
			pushi    212
			pushi    139
			pushi    194
			pushi    131
			pushi    198
			pushi    127
			pushi    215
			pushi    120
			pushi    247
			pushi    122
			pushi    251
			pushi    119
			pushi    267
			pushi    120
			pushi    277
			pushi    129
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     58
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    skinDoVerb
			send     8
			ret     
		)
	)
)

(instance skin2 of Feature
	(properties
		x 260
		y 151
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    28
			pushi    260
			pushi    157
			pushi    250
			pushi    165
			pushi    222
			pushi    166
			pushi    215
			pushi    170
			pushi    195
			pushi    168
			pushi    185
			pushi    169
			pushi    185
			pushi    165
			pushi    175
			pushi    165
			pushi    175
			pushi    160
			pushi    194
			pushi    158
			pushi    199
			pushi    155
			pushi    212
			pushi    155
			pushi    220
			pushi    151
			pushi    244
			pushi    151
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
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    skinDoVerb
			send     8
			ret     
		)
	)
)

(instance skin3 of Feature
	(properties
		x 169
		y 149
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    169
			pushi    165
			pushi    163
			pushi    168
			pushi    118
			pushi    167
			pushi    104
			pushi    165
			pushi    83
			pushi    159
			pushi    80
			pushi    156
			pushi    88
			pushi    152
			pushi    107
			pushi    149
			pushi    122
			pushi    149
			pushi    138
			pushi    155
			pushi    147
			pushi    155
			pushi    162
			dup     
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    skinDoVerb
			send     8
			ret     
		)
	)
)

(instance bed of Feature
	(properties
		x 121
		y 85
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    121
			pushi    96
			pushi    80
			pushi    100
			pushi    76
			pushi    97
			pushi    71
			pushi    89
			pushi    71
			dup     
			pushi    101
			pushi    73
			pushi    124
			pushi    77
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_15ce
			pushi    3
			pushi    1140
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_1605
code_15ce:
			dup     
			ldi      3
			eq?     
			bnt      code_15e4
			pushi    3
			pushi    1140
			pushi    26
			pushi    1
			calle    proc13_4,  6
			jmp      code_1605
code_15e4:
			dup     
			ldi      4
			eq?     
			bnt      code_15fa
			pushi    3
			pushi    1140
			pushi    33
			pushi    1
			calle    proc13_4,  6
			jmp      code_1605
code_15fa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_1605:
			toss    
			ret     
		)
	)
)

(instance entry of Feature
	(properties
		x 259
		y 31
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    30
			pushi    259
			pushi    63
			pushi    255
			pushi    66
			pushi    212
			pushi    66
			pushi    206
			pushi    58
			pushi    208
			pushi    38
			pushi    216
			pushi    19
			pushi    219
			pushi    22
			pushi    225
			pushi    17
			pushi    228
			pushi    22
			pushi    234
			pushi    17
			pushi    235
			pushi    20
			pushi    245
			pushi    32
			pushi    252
			pushi    41
			pushi    250
			pushi    49
			pushi    249
			pushi    63
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_16e2
			pushi    3
			pushi    1140
			pushi    24
			pushi    1
			calle    proc13_4,  6
			jmp      code_16ed
code_16e2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_16ed:
			toss    
			ret     
		)
	)
)

(instance drape of Feature
	(properties
		x 253
		y 36
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    253
			pushi    41
			pushi    235
			pushi    19
			pushi    231
			pushi    6
			pushi    239
			pushi    4
			pushi    244
			pushi    6
			pushi    252
			pushi    7
			pushi    263
			pushi    18
			pushi    266
			pushi    33
			pushi    263
			pushi    59
			pushi    259
			pushi    62
			pushi    250
			pushi    62
			pushi    251
			pushi    50
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_17bb
			pushi    3
			pushi    1140
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_17dc
code_17bb:
			dup     
			ldi      3
			eq?     
			bnt      code_17d1
			pushi    3
			pushi    1140
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_17dc
code_17d1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_17dc:
			toss    
			ret     
		)
	)
)

(instance cover of View
	(properties
		x 237
		y 67
		view 140
		loop 4
		priority 4
		signal $0010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1842
			pushi    3
			pushi    1140
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_1863
code_1842:
			dup     
			ldi      3
			eq?     
			bnt      code_1858
			pushi    3
			pushi    1140
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_1863
code_1858:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_1863:
			toss    
			ret     
		)
	)
)

(instance bow of View
	(properties
		x 158
		y 97
		view 140
		loop 6
		priority 3
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_18e2
			pushi    3
			pushi    1140
			pushi    20
			pushi    1
			calle    proc13_4,  6
			jmp      code_1903
code_18e2:
			dup     
			ldi      3
			eq?     
			bnt      code_18f8
			pushi    3
			pushi    1140
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_1903
code_18f8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_1903:
			toss    
			ret     
		)
	)
)

(instance horn of View
	(properties
		x 156
		y 73
		view 140
		loop 6
		cel 1
		priority 6
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1982
			pushi    3
			pushi    1140
			pushi    16
			pushi    1
			calle    proc13_4,  6
			jmp      code_19a3
code_1982:
			dup     
			ldi      3
			eq?     
			bnt      code_1998
			pushi    #setScript
			pushi    1
			lofsa    getHorn
			push    
			lag      global0
			send     6
			jmp      code_19a3
code_1998:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_19a3:
			toss    
			ret     
		)
	)
)

(instance peg of View
	(properties
		x 158
		y 60
		view 140
		loop 1
		priority 7
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a22
			pushi    3
			pushi    1140
			pushi    66
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a59
code_1a22:
			dup     
			ldi      3
			eq?     
			bnt      code_1a38
			pushi    3
			pushi    1140
			pushi    67
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a59
code_1a38:
			dup     
			ldi      5
			eq?     
			bnt      code_1a4e
			pushi    3
			pushi    1140
			pushi    68
			pushi    1
			calle    proc13_4,  6
			jmp      code_1a59
code_1a4e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_1a59:
			toss    
			ret     
		)
	)
)

(instance ledge of View
	(properties
		x 38
		y 103
		view 140
		loop 3
		priority 8
		signal $0011
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1af8
			pushi    1
			pushi    196
			callb    proc0_5,  2
			bnt      code_1ae2
			pushi    3
			pushi    1140
			pushi    19
			pushi    1
			calle    proc13_4,  6
			jmp      code_1cef
code_1ae2:
			pushi    #setScript
			pushi    1
			lofsa    lookAtChest
			push    
			lag      global0
			send     6
			pushi    1
			pushi    196
			callb    proc0_6,  2
			jmp      code_1cef
code_1af8:
			dup     
			ldi      3
			eq?     
			bnt      code_1b38
			pushi    #value
			pushi    0
			lag      global152
			send     4
			push    
			ldi      50
			lt?     
			bt       code_1b17
			pushi    #has
			pushi    1
			pushi    0
			lag      global0
			send     6
			not     
code_1b17:
			bnt      code_1b29
			pushi    #setScript
			pushi    1
			lofsa    stashIt
			push    
			lag      global0
			send     6
			jmp      code_1cef
code_1b29:
			pushi    3
			pushi    1140
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_1cef
code_1b38:
			dup     
			ldi      4
			eq?     
			bnt      code_1ce4
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1b57
			pushi    #setScript
			pushi    1
			lofsa    putMoneyBack
			push    
			lag      global0
			send     6
			jmp      code_1ce0
code_1b57:
			dup     
			ldi      1
			eq?     
			bnt      code_1b6d
			pushi    3
			pushi    1140
			pushi    49
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1b6d:
			dup     
			ldi      2
			eq?     
			bnt      code_1b83
			pushi    3
			pushi    1140
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1b83:
			dup     
			ldi      3
			eq?     
			bnt      code_1b99
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1b99:
			dup     
			ldi      15
			eq?     
			bnt      code_1baf
			pushi    3
			pushi    1140
			pushi    52
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1baf:
			dup     
			ldi      11
			eq?     
			bnt      code_1bc5
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1bc5:
			dup     
			ldi      14
			eq?     
			bnt      code_1bdb
			pushi    3
			pushi    1140
			pushi    53
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1bdb:
			dup     
			ldi      12
			eq?     
			bnt      code_1bf1
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1bf1:
			dup     
			ldi      10
			eq?     
			bnt      code_1c07
			pushi    3
			pushi    1140
			pushi    54
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c07:
			dup     
			ldi      13
			eq?     
			bnt      code_1c1d
			pushi    3
			pushi    1140
			pushi    55
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c1d:
			dup     
			ldi      5
			eq?     
			bnt      code_1c33
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c33:
			dup     
			ldi      6
			eq?     
			bnt      code_1c49
			pushi    3
			pushi    1140
			pushi    56
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c49:
			dup     
			ldi      17
			eq?     
			bnt      code_1c5f
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c5f:
			dup     
			ldi      16
			eq?     
			bnt      code_1c75
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c75:
			dup     
			ldi      18
			eq?     
			bnt      code_1c8b
			pushi    3
			pushi    1140
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1c8b:
			dup     
			ldi      4
			eq?     
			bnt      code_1ca1
			pushi    3
			pushi    1140
			pushi    58
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1ca1:
			dup     
			ldi      7
			eq?     
			bnt      code_1cb7
			pushi    3
			pushi    1140
			pushi    59
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1cb7:
			dup     
			ldi      8
			eq?     
			bnt      code_1ccd
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ce0
code_1ccd:
			dup     
			ldi      9
			eq?     
			bnt      code_1ce0
			pushi    3
			pushi    1140
			pushi    51
			pushi    1
			calle    proc13_4,  6
code_1ce0:
			toss    
			jmp      code_1cef
code_1ce4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_1cef:
			toss    
			ret     
		)
	)
)

(class Garb of View
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 140
		loop 5
		cel 0
		priority 0
		underBits 0
		signal $4000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		newGuise 0
		garbX 0
		garbY 0
	)
	
	(method (doVerb theVerb param2 param3 &tmp [temp0 40])
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1d84
			pushi    4
			dup     
			lea      @temp0
			push    
			pushi    140
			pushi    0
			pushi    #lookStr
			pushi    0
			self     4
			push    
			callk    Format,  8
			push    
			pushi    67
			pushi    65535
			pushi    10
			calle    proc255_0,  8
			jmp      code_1f66
code_1d84:
			dup     
			ldi      3
			eq?     
			bnt      code_1daf
			lag      global126
			sal      local3
			pToa     newGuise
			sag      global126
			pushi    0
			call     localproc_0063,  0
			pToa     garbX
			sal      local11
			pToa     garbY
			sal      local12
			pushi    #setScript
			pushi    1
			lofsa    wardrobeChange
			push    
			lag      global2
			send     6
			jmp      code_1f66
code_1daf:
			dup     
			ldi      4
			eq?     
			bnt      code_1f5b
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_1dce
			pushi    3
			pushi    1140
			pushi    61
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1dce:
			dup     
			ldi      1
			eq?     
			bnt      code_1de4
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1de4:
			dup     
			ldi      2
			eq?     
			bnt      code_1dfa
			pushi    3
			pushi    1140
			pushi    62
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1dfa:
			dup     
			ldi      3
			eq?     
			bnt      code_1e10
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e10:
			dup     
			ldi      15
			eq?     
			bnt      code_1e26
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e26:
			dup     
			ldi      11
			eq?     
			bnt      code_1e3c
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e3c:
			dup     
			ldi      14
			eq?     
			bnt      code_1e52
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e52:
			dup     
			ldi      12
			eq?     
			bnt      code_1e68
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e68:
			dup     
			ldi      10
			eq?     
			bnt      code_1e7e
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e7e:
			dup     
			ldi      13
			eq?     
			bnt      code_1e94
			pushi    3
			pushi    1140
			pushi    63
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1e94:
			dup     
			ldi      5
			eq?     
			bnt      code_1eaa
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1eaa:
			dup     
			ldi      6
			eq?     
			bnt      code_1ec0
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1ec0:
			dup     
			ldi      17
			eq?     
			bnt      code_1ed6
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1ed6:
			dup     
			ldi      16
			eq?     
			bnt      code_1eec
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1eec:
			dup     
			ldi      18
			eq?     
			bnt      code_1f02
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1f02:
			dup     
			ldi      4
			eq?     
			bnt      code_1f18
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1f18:
			dup     
			ldi      7
			eq?     
			bnt      code_1f2e
			pushi    3
			pushi    1140
			pushi    64
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1f2e:
			dup     
			ldi      8
			eq?     
			bnt      code_1f44
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f57
code_1f44:
			dup     
			ldi      9
			eq?     
			bnt      code_1f57
			pushi    3
			pushi    1140
			pushi    60
			pushi    1
			calle    proc13_4,  6
code_1f57:
			toss    
			jmp      code_1f66
code_1f5b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_1f66:
			toss    
			ret     
		)
	)
)

(instance gRobin of Garb
	(properties
		x 95
		y 153
		lookStr 13168
		garbX 91
		garbY 138
	)
)

(instance gBeggar of Garb
	(properties
		x 248
		y 160
		lookStr 13196
		cel 3
		newGuise 1
		garbX 244
		garbY 145
	)
)

(instance gJeweler of Garb
	(properties
		x 195
		y 165
		lookStr 13249
		cel 2
		newGuise 2
		garbX 189
		garbY 147
	)
)

(instance gPuck of Garb
	(properties
		x 140
		y 163
		lookStr 13298
		cel 1
		newGuise 4
		garbX 134
		garbY 148
	)
)

(instance gAbbey of Garb
	(properties
		x 255
		y 128
		lookStr 13333
		cel 5
		newGuise 5
		garbX 250
		garbY 113
	)
)

(instance gFens of Garb
	(properties
		x 210
		y 129
		lookStr 13368
		cel 4
		newGuise 6
		garbX 206
		garbY 114
	)
)

(instance fire of Prop
	(properties
		x 167
		y 140
		view 140
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_22d6
			pushi    3
			pushi    1140
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_230e
code_22d6:
			dup     
			ldi      3
			eq?     
			bnt      code_2303
			lsg      global115
			ldi      2
			eq?     
			bnt      code_22f4
			pushi    #setScript
			pushi    1
			lofsa    burnHand
			push    
			lag      global0
			send     6
			jmp      code_230e
code_22f4:
			pushi    3
			pushi    1140
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_230e
code_2303:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_230e:
			toss    
			ret     
		)
	)
	
	(method (cue &tmp temp0)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			sat      temp0
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    6
			pushi    18
			callk    Random,  4
			push    
			self     6
			lat      temp0
			bnt      code_22ac
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			jmp      code_22b6
code_22ac:
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			self     8
code_22b6:
			pushi    #cue
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance lookAtChest of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23a5
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1140
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_23cb
code_23a5:
			dup     
			ldi      1
			eq?     
			bnt      code_23bb
			pushi    3
			pushi    1140
			pushi    18
			pushSelf
			calle    proc13_4,  6
			jmp      code_23cb
code_23bb:
			dup     
			ldi      2
			eq?     
			bnt      code_23cb
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_23cb:
			toss    
			ret     
		)
	)
)

(instance getHorn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_242d
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    162
			pushi    110
			pushSelf
			lag      global0
			send     12
			jmp      code_2492
code_242d:
			dup     
			ldi      1
			eq?     
			bnt      code_2471
			pushi    #setLoop
			pushi    1
			pushi    3
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			lofsa    horn
			send     4
			pushi    #get
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    1
			pushi    171
			callb    proc0_5,  2
			not     
			bnt      code_246a
			pushi    1
			pushi    171
			callb    proc0_6,  2
			pushi    1
			pushi    50
			calle    proc806_1,  2
code_246a:
			ldi      20
			aTop     ticks
			jmp      code_2492
code_2471:
			dup     
			ldi      2
			eq?     
			bnt      code_2492
			pushi    #actions
			pushi    1
			lofsa    egoHorn
			push    
			lag      global0
			send     6
			pushi    1
			pushi    0
			callb    proc0_2,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2492:
			toss    
			ret     
		)
	)
)

(instance wardrobeChange of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_24f2
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local11
			lsl      local12
			pushSelf
			lag      global0
			send     12
			jmp      code_28bf
code_24f2:
			dup     
			ldi      1
			eq?     
			bnt      code_2509
			pushi    #setLoop
			pushi    1
			pushi    2
			lag      global0
			send     6
			ldi      30
			aTop     ticks
			jmp      code_28bf
code_2509:
			dup     
			ldi      2
			eq?     
			bnt      code_2597
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_2528
			pushi    3
			pushi    1140
			pushi    71
			pushSelf
			calle    proc13_4,  6
			jmp      code_2593
code_2528:
			dup     
			ldi      1
			eq?     
			bnt      code_253e
			pushi    3
			pushi    1140
			pushi    76
			pushSelf
			calle    proc13_4,  6
			jmp      code_2593
code_253e:
			dup     
			ldi      2
			eq?     
			bnt      code_2554
			pushi    3
			pushi    1140
			pushi    75
			pushSelf
			calle    proc13_4,  6
			jmp      code_2593
code_2554:
			dup     
			ldi      4
			eq?     
			bnt      code_256a
			pushi    3
			pushi    1140
			pushi    74
			pushSelf
			calle    proc13_4,  6
			jmp      code_2593
code_256a:
			dup     
			ldi      5
			eq?     
			bnt      code_2580
			pushi    3
			pushi    1140
			pushi    73
			pushSelf
			calle    proc13_4,  6
			jmp      code_2593
code_2580:
			dup     
			ldi      6
			eq?     
			bnt      code_2593
			pushi    3
			pushi    1140
			pushi    72
			pushSelf
			calle    proc13_4,  6
code_2593:
			toss    
			jmp      code_28bf
code_2597:
			dup     
			ldi      3
			eq?     
			bnt      code_264b
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_25b2
			pushi    #dispose
			pushi    0
			lofsa    gRobin
			send     4
			jmp      code_2609
code_25b2:
			dup     
			ldi      1
			eq?     
			bnt      code_25c4
			pushi    #dispose
			pushi    0
			lofsa    gBeggar
			send     4
			jmp      code_2609
code_25c4:
			dup     
			ldi      2
			eq?     
			bnt      code_25d6
			pushi    #dispose
			pushi    0
			lofsa    gJeweler
			send     4
			jmp      code_2609
code_25d6:
			dup     
			ldi      4
			eq?     
			bnt      code_25e8
			pushi    #dispose
			pushi    0
			lofsa    gPuck
			send     4
			jmp      code_2609
code_25e8:
			dup     
			ldi      5
			eq?     
			bnt      code_25fa
			pushi    #dispose
			pushi    0
			lofsa    gAbbey
			send     4
			jmp      code_2609
code_25fa:
			dup     
			ldi      6
			eq?     
			bnt      code_2609
			pushi    #dispose
			pushi    0
			lofsa    gFens
			send     4
code_2609:
			toss    
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_2622
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_2622:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    4
			pushi    803
			pushi    6
			pushi    1
			pushi    0
			lag      global2
			send     12
			ldi      50
			aTop     ticks
			jmp      code_28bf
code_264b:
			dup     
			ldi      4
			eq?     
			bnt      code_273e
			lsl      local3
			dup     
			ldi      0
			eq?     
			bnt      code_2674
			pushi    #garbX
			pushi    0
			lofsa    gRobin
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gRobin
			send     4
			sal      local14
			jmp      code_2731
code_2674:
			dup     
			ldi      1
			eq?     
			bnt      code_2694
			pushi    #garbX
			pushi    0
			lofsa    gBeggar
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gBeggar
			send     4
			sal      local14
			jmp      code_2731
code_2694:
			dup     
			ldi      2
			eq?     
			bnt      code_26b4
			pushi    #garbX
			pushi    0
			lofsa    gJeweler
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gJeweler
			send     4
			sal      local14
			jmp      code_2731
code_26b4:
			dup     
			ldi      3
			eq?     
			bnt      code_26d4
			pushi    #garbX
			pushi    0
			lofsa    gJeweler
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gJeweler
			send     4
			sal      local14
			jmp      code_2731
code_26d4:
			dup     
			ldi      4
			eq?     
			bnt      code_26f4
			pushi    #garbX
			pushi    0
			lofsa    gPuck
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gPuck
			send     4
			sal      local14
			jmp      code_2731
code_26f4:
			dup     
			ldi      5
			eq?     
			bnt      code_2714
			pushi    #garbX
			pushi    0
			lofsa    gAbbey
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gAbbey
			send     4
			sal      local14
			jmp      code_2731
code_2714:
			dup     
			ldi      6
			eq?     
			bnt      code_2731
			pushi    #garbX
			pushi    0
			lofsa    gFens
			send     4
			sal      local13
			pushi    #garbY
			pushi    0
			lofsa    gFens
			send     4
			sal      local14
code_2731:
			toss    
			pushi    0
			call     localproc_06ca,  0
			ldi      30
			aTop     ticks
			jmp      code_28bf
code_273e:
			dup     
			ldi      5
			eq?     
			bnt      code_289c
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    0
			call     localproc_001a,  0
			lsg      global126
			ldi      0
			ne?     
			bnt      code_2777
			pushi    #contains
			pushi    1
			lofsa    gRobin
			push    
			lag      global5
			send     6
			not     
			bnt      code_2777
			pushi    #init
			pushi    0
			lofsa    gRobin
			send     4
code_2777:
			lsg      global126
			ldi      1
			ne?     
			bnt      code_27a7
			pushi    1
			pushi    54
			callb    proc0_5,  2
			bnt      code_27a7
			lsg      global130
			ldi      3
			eq?     
			bnt      code_27a7
			pushi    #contains
			pushi    1
			lofsa    gBeggar
			push    
			lag      global5
			send     6
			not     
			bnt      code_27a7
			pushi    #init
			pushi    0
			lofsa    gBeggar
			send     4
code_27a7:
			lsg      global126
			ldi      2
			ne?     
			bnt      code_27df
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_27df
			lsg      global126
			ldi      3
			ne?     
			bnt      code_27df
			lsg      global130
			ldi      9
			eq?     
			bnt      code_27df
			pushi    #contains
			pushi    1
			lofsa    gJeweler
			push    
			lag      global5
			send     6
			not     
			bnt      code_27df
			pushi    #init
			pushi    0
			lofsa    gJeweler
			send     4
code_27df:
			lsg      global126
			ldi      4
			ne?     
			bnt      code_2816
			pushi    7
			lag      global130
			lt?     
			bnt      code_2816
			pprev   
			ldi      10
			lt?     
			bnt      code_2816
			pushi    #contains
			pushi    1
			lofsa    gPuck
			push    
			lag      global5
			send     6
			not     
			bnt      code_2816
			pushi    1
			pushi    57
			callb    proc0_5,  2
			bnt      code_2816
			pushi    #init
			pushi    0
			lofsa    gPuck
			send     4
code_2816:
			lsg      global126
			ldi      5
			ne?     
			bnt      code_284d
			pushi    1
			pushi    55
			callb    proc0_5,  2
			bnt      code_284d
			pushi    4
			lag      global130
			lt?     
			bnt      code_284d
			pprev   
			ldi      10
			lt?     
			bnt      code_284d
			pushi    #contains
			pushi    1
			lofsa    gAbbey
			push    
			lag      global5
			send     6
			not     
			bnt      code_284d
			pushi    #init
			pushi    0
			lofsa    gAbbey
			send     4
code_284d:
			lsg      global126
			ldi      6
			ne?     
			bnt      code_2885
			pushi    1
			pushi    147
			callb    proc0_5,  2
			bnt      code_2885
			pushi    4
			lag      global130
			lt?     
			bnt      code_2885
			pprev   
			ldi      10
			lt?     
			bnt      code_2885
			pushi    #contains
			pushi    1
			lofsa    gFens
			push    
			lag      global5
			send     6
			not     
			bnt      code_2885
			pushi    #init
			pushi    0
			lofsa    gFens
			send     4
code_2885:
			pushi    #drawPic
			pushi    4
			pushi    140
			pushi    6
			pushi    1
			pushi    0
			lag      global2
			send     12
			ldi      30
			aTop     ticks
			jmp      code_28bf
code_289c:
			dup     
			ldi      6
			eq?     
			bnt      code_28bf
			pushi    #eachElementDo
			pushi    1
			pushi    285
			lag      global5
			send     6
			pushi    #cue
			pushi    0
			lofsa    fire
			send     4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_28bf:
			toss    
			ret     
		)
	)
)

(instance stashIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2920
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    44
			pushi    118
			pushSelf
			lag      global0
			send     12
			jmp      code_2aba
code_2920:
			dup     
			ldi      1
			eq?     
			bnt      code_2959
			lsg      global126
			ldi      0
			eq?     
			bnt      code_2950
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    5
			pushi    7
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
			jmp      code_2aba
code_2950:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2aba
code_2959:
			dup     
			ldi      2
			eq?     
			bnt      code_2977
			pushi    #play
			pushi    0
			lofsa    chestSound
			send     4
			pushi    3
			pushi    1140
			pushi    13
			pushSelf
			calle    proc13_4,  6
			jmp      code_2aba
code_2977:
			dup     
			ldi      3
			eq?     
			bnt      code_298d
			pushi    #play
			pushi    0
			lofsa    chingSound
			send     4
			ldi      10
			aTop     ticks
			jmp      code_2aba
code_298d:
			dup     
			ldi      4
			eq?     
			bnt      code_29a3
			pushi    #play
			pushi    0
			lofsa    chingSound
			send     4
			ldi      10
			aTop     ticks
			jmp      code_2aba
code_29a3:
			dup     
			ldi      5
			eq?     
			bnt      code_29b9
			pushi    #play
			pushi    0
			lofsa    chingSound
			send     4
			ldi      10
			aTop     ticks
			jmp      code_2aba
code_29b9:
			dup     
			ldi      6
			eq?     
			bnt      code_29cf
			pushi    3
			pushi    1140
			pushi    14
			pushSelf
			calle    proc13_4,  6
			jmp      code_2aba
code_29cf:
			dup     
			ldi      7
			eq?     
			bnt      code_29f6
			lsg      global126
			ldi      0
			eq?     
			bnt      code_29ed
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_2aba
code_29ed:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2aba
code_29f6:
			dup     
			ldi      8
			eq?     
			bnt      code_2a6f
			pushi    #play
			pushi    0
			lofsa    chestSound
			send     4
			pushi    #has
			pushi    1
			pushi    0
			lag      global0
			send     6
			not     
			bnt      code_2a4a
			pushi    #get
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #value
			pushi    0
			lag      global152
			send     4
			push    
			ldi      50
			lt?     
			bnt      code_2a68
			pushi    #put
			pushi    1
			pushi    5
			lag      global133
			send     6
			pushi    #put
			pushi    1
			pushi    19
			lag      global134
			send     6
			pushi    #put
			pushi    1
			pushi    26
			lag      global135
			send     6
			jmp      code_2a68
code_2a4a:
			pushi    #put
			pushi    1
			pushi    5
			lag      global133
			send     6
			pushi    #put
			pushi    1
			pushi    19
			lag      global134
			send     6
			pushi    #put
			pushi    1
			pushi    26
			lag      global135
			send     6
code_2a68:
			ldi      30
			aTop     ticks
			jmp      code_2aba
code_2a6f:
			dup     
			ldi      9
			eq?     
			bnt      code_2aaa
			pushi    2
			pushi    50
			pushi    193
			calle    proc806_1,  4
			pushi    0
			callb    proc0_2,  0
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      20
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
			jmp      code_2aba
code_2aaa:
			dup     
			ldi      10
			eq?     
			bnt      code_2aba
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2aba:
			toss    
			ret     
		)
	)
)

(instance putMoneyBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2b1a
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    44
			pushi    118
			pushSelf
			lag      global0
			send     12
			jmp      code_2c38
code_2b1a:
			dup     
			ldi      1
			eq?     
			bnt      code_2b53
			lsg      global126
			ldi      0
			eq?     
			bnt      code_2b4a
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    5
			pushi    7
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
			jmp      code_2c38
code_2b4a:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2c38
code_2b53:
			dup     
			ldi      2
			eq?     
			bnt      code_2b69
			pushi    #play
			pushi    0
			lofsa    chestSound
			send     4
			ldi      2
			aTop     seconds
			jmp      code_2c38
code_2b69:
			dup     
			ldi      3
			eq?     
			bnt      code_2b7f
			pushi    #play
			pushi    0
			lofsa    chingSound
			send     4
			ldi      10
			aTop     ticks
			jmp      code_2c38
code_2b7f:
			dup     
			ldi      4
			eq?     
			bnt      code_2b95
			pushi    #play
			pushi    0
			lofsa    chingSound
			send     4
			ldi      10
			aTop     ticks
			jmp      code_2c38
code_2b95:
			dup     
			ldi      5
			eq?     
			bnt      code_2bab
			pushi    #play
			pushi    0
			lofsa    chingSound
			send     4
			ldi      10
			aTop     ticks
			jmp      code_2c38
code_2bab:
			dup     
			ldi      6
			eq?     
			bnt      code_2bd2
			lsg      global126
			ldi      0
			eq?     
			bnt      code_2bc9
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_2c38
code_2bc9:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2c38
code_2bd2:
			dup     
			ldi      7
			eq?     
			bnt      code_2bf8
			pushi    #play
			pushi    0
			lofsa    chestSound
			send     4
			pushi    #put
			pushi    1
			pushi    0
			pushi    228
			pushi    1
			pushi    180
			lag      global0
			send     12
			ldi      36
			aTop     ticks
			jmp      code_2c38
code_2bf8:
			dup     
			ldi      8
			eq?     
			bnt      code_2c0e
			pushi    3
			pushi    1140
			pushi    65
			pushSelf
			calle    proc13_4,  6
			jmp      code_2c38
code_2c0e:
			dup     
			ldi      9
			eq?     
			bnt      code_2c28
			pushi    0
			callb    proc0_2,  0
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_2c38
code_2c28:
			dup     
			ldi      10
			eq?     
			bnt      code_2c38
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2c38:
			toss    
			ret     
		)
	)
)

(instance cantRap of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			eq?     
			bnt      code_2c9b
			pushi    #setVol
			pushi    1
			pushi    0
			lag      global100
			send     6
			pushi    #fade
			pushi    4
			pushi    127
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
code_2c9b:
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
			bnt      code_2d21
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bt       code_2cf0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_2cf0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_2cf0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_2cf0:
			bnt      code_2cff
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_2d08
code_2cff:
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
code_2d08:
			pushi    #view
			pushi    1
			pushi    10
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_2d9b
code_2d21:
			dup     
			ldi      1
			eq?     
			bnt      code_2d37
			pushi    #play
			pushi    0
			lofsa    hornBadSound
			send     4
			ldi      4
			aTop     seconds
			jmp      code_2d9b
code_2d37:
			dup     
			ldi      2
			eq?     
			bnt      code_2d4d
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_2d9b
code_2d4d:
			dup     
			ldi      3
			eq?     
			bnt      code_2d6c
			pushi    3
			lsg      global111
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    3
			pushi    1140
			pushi    42
			pushSelf
			calle    proc13_4,  6
			jmp      code_2d9b
code_2d6c:
			dup     
			ldi      4
			eq?     
			bnt      code_2d82
			pushi    3
			pushi    1140
			pushi    43
			pushSelf
			calle    proc13_4,  6
			jmp      code_2d9b
code_2d82:
			dup     
			ldi      5
			eq?     
			bnt      code_2d9b
			pushi    0
			callb    proc0_4,  0
			pushi    #stop
			pushi    0
			lofsa    hornBadSound
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_2d9b:
			toss    
			ret     
		)
	)
)

(instance blowOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2e5b
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bt       code_2e2a
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_2e2a
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_2e2a
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_2e2a:
			bnt      code_2e39
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_2e42
code_2e39:
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
code_2e42:
			pushi    #view
			pushi    1
			pushi    10
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_2ec5
code_2e5b:
			dup     
			ldi      1
			eq?     
			bnt      code_2e77
			pushi    #number
			pushi    1
			pushi    904
			pushi    42
			pushi    0
			lofsa    hornBadSound
			send     10
			ldi      4
			aTop     seconds
			jmp      code_2ec5
code_2e77:
			dup     
			ldi      2
			eq?     
			bnt      code_2e8d
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_2ec5
code_2e8d:
			dup     
			ldi      3
			eq?     
			bnt      code_2eac
			pushi    3
			lsg      global111
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    3
			pushi    1140
			pushi    43
			pushSelf
			calle    proc13_4,  6
			jmp      code_2ec5
code_2eac:
			dup     
			ldi      4
			eq?     
			bnt      code_2ec5
			pushi    0
			callb    proc0_4,  0
			pushi    #stop
			pushi    0
			lofsa    hornBadSound
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_2ec5:
			toss    
			ret     
		)
	)
)

(instance burnHand of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2f28
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    156
			pushi    149
			pushSelf
			lag      global0
			send     12
			jmp      code_2fc7
code_2f28:
			dup     
			ldi      1
			eq?     
			bnt      code_2f40
			pushi    2
			lsg      global0
			lofsa    fire
			push    
			callb    proc0_9,  4
			ldi      12
			aTop     ticks
			jmp      code_2fc7
code_2f40:
			dup     
			ldi      2
			eq?     
			bnt      code_2f6d
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     36
			jmp      code_2fc7
code_2f6d:
			dup     
			ldi      3
			eq?     
			bnt      code_2f83
			pushi    3
			pushi    1140
			pushi    44
			pushSelf
			calle    proc13_4,  6
			jmp      code_2fc7
code_2f83:
			dup     
			ldi      4
			eq?     
			bnt      code_2f99
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_2fc7
code_2f99:
			dup     
			ldi      5
			eq?     
			bnt      code_2fb7
			pushi    1
			pushi    6
			callb    proc0_2,  2
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_2fc7
code_2fb7:
			dup     
			ldi      6
			eq?     
			bnt      code_2fc7
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2fc7:
			toss    
			ret     
		)
	)
)

(instance enterTheCave of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3029
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    235
			pushi    95
			pushSelf
			lag      global0
			send     12
			jmp      code_3039
code_3029:
			dup     
			ldi      1
			eq?     
			bnt      code_3039
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_3039:
			toss    
			ret     
		)
	)
)

(instance skinDoVerb of Code
	(properties)
	
	(method (doit param1 param2 param3)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_308e
			pushi    3
			pushi    1140
			pushi    45
			pushi    1
			calle    proc13_4,  6
			jmp      code_30c5
code_308e:
			dup     
			ldi      3
			eq?     
			bnt      code_30a4
			pushi    3
			pushi    1140
			pushi    46
			pushi    1
			calle    proc13_4,  6
			jmp      code_30c5
code_30a4:
			dup     
			ldi      4
			eq?     
			bnt      code_30ba
			pushi    3
			pushi    1140
			pushi    33
			pushi    1
			calle    proc13_4,  6
			jmp      code_30c5
code_30ba:
			pushi    #doit
			pushi    1
			lsp      param1
			&rest    param3
			lag      global65
			send     6
code_30c5:
			toss    
			ret     
		)
	)
)

(instance egoHorn of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_3117
			lsg      global126
			ldi      0
			eq?     
			bnt      code_3108
			pushi    2
			pushi    1140
			pushi    70
			calle    proc13_4,  4
			ldi      1
			jmp      code_31b8
code_3108:
			pushi    2
			pushi    1140
			pushi    69
			calle    proc13_4,  4
			ldi      1
			jmp      code_31b8
code_3117:
			dup     
			ldi      4
			eq?     
			bnt      code_31b8
			lsp      param2
			ldi      1
			eq?     
			bnt      code_31b8
			lsl      local1
			ldi      0
			eq?     
			bnt      code_317b
			lsg      global12
			ldi      160
			eq?     
			bnt      code_317b
			lsg      global130
			ldi      2
			eq?     
			bnt      code_317b
			pushi    1
			pushi    208
			callb    proc0_5,  2
			not     
			bnt      code_317b
			pushi    1
			pushi    208
			callb    proc0_6,  2
			ldi      1
			sal      local1
			pushi    #number
			pushi    1
			pushi    160
			pushi    155
			pushi    1
			pushSelf
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lag      global100
			send     20
			pushi    #setScript
			pushi    1
			lofsa    cantRap
			push    
			lag      global0
			send     6
			ldi      1
			jmp      code_31b8
code_317b:
			lsl      local0
			ldi      0
			eq?     
			bnt      code_31aa
			pushi    1
			pushi    208
			callb    proc0_5,  2
			not     
			bnt      code_31aa
			ldi      1
			sal      local0
			pushi    1
			pushi    208
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    blowOut
			push    
			lag      global0
			send     6
			ldi      1
			jmp      code_31b8
code_31aa:
			pushi    3
			pushi    1140
			pushi    47
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_31b8:
			toss    
			ret     
		)
	)
)

(instance hornBadSound of Sound
	(properties
		flags $0001
		number 903
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)

(instance chestSound of Sound
	(properties
		flags $0001
		number 459
	)
)

(instance chingSound of Sound
	(properties
		flags $0001
		number 914
		loop 3
	)
)

(instance magicSound of Sound
	(properties
		flags $0001
		number 216
	)
)

(instance vanishSound of Sound
	(properties
		flags $0001
		number 213
	)
)
