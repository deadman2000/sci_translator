;;; Sierra Script 1.0 - (do not remove this comment)
(script# 222)
(include sci.sh)
(use n000)
(use n946)

(public
	proc222_0 0
)

(procedure (proc222_0)
	(asm
		lsg      global112
		ldi      3
		eq?     
		bt       code_0043
		lsg      global112
		ldi      4
		eq?     
		bt       code_0043
		lsg      global112
		ldi      5
		eq?     
		bt       code_0043
		lsg      global112
		ldi      6
		eq?     
		bt       code_0043
		lsg      global112
		ldi      24
		eq?     
		bt       code_0043
		lsg      global112
		ldi      25
		eq?     
		bt       code_0043
		lsg      global112
		ldi      26
		eq?     
code_0043:
		bnt      code_01c2
		pushi    #addObstacle
		pushi    7
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    319
		pushi    149
		pushi    228
		pushi    143
		pushi    195
		pushi    135
		pushi    184
		pushi    130
		pushi    189
		pushi    125
		pushi    319
		pushi    125
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
		pushi    285
		pushi    189
		pushi    167
		pushi    189
		pushi    200
		pushi    183
		pushi    247
		pushi    179
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
		pushi    20
		pushi    169
		pushi    113
		pushi    164
		pushi    119
		pushi    120
		pushi    124
		pushi    69
		pushi    126
		pushi    40
		pushi    120
		pushi    23
		pushi    123
		pushi    0
		pushi    123
		pushi    0
		pushi    107
		pushi    87
		pushi    99
		pushi    158
		pushi    107
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
		pushi    12
		pushi    307
		pushi    121
		pushi    231
		pushi    121
		pushi    216
		pushi    118
		pushi    230
		pushi    114
		pushi    306
		pushi    114
		pushi    314
		pushi    118
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
		pushi    10
		pushi    319
		pushi    104
		pushi    319
		pushi    109
		pushi    281
		pushi    109
		pushi    277
		pushi    107
		pushi    283
		pushi    104
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
		pushi    16
		pushi    130
		pushi    85
		pushi    120
		pushi    91
		pushi    0
		pushi    91
		pushi    0
		pushi    0
		pushi    70
		pushi    0
		pushi    70
		pushi    57
		pushi    101
		pushi    75
		pushi    122
		pushi    75
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
		pushi    16
		pushi    171
		pushi    91
		pushi    159
		pushi    84
		pushi    167
		pushi    75
		pushi    193
		pushi    75
		pushi    230
		pushi    58
		pushi    229
		pushi    0
		pushi    319
		pushi    0
		pushi    319
		pushi    91
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     46
		push    
		lag      global2
		send     18
		jmp      code_065a
code_01c2:
		lsg      global112
		ldi      43
		eq?     
		bt       code_01e8
		lsg      global112
		ldi      91
		eq?     
		bt       code_01e8
		lsg      global112
		ldi      107
		eq?     
		bt       code_01e8
		lsg      global112
		ldi      123
		eq?     
		bt       code_01e8
		lsg      global112
		ldi      139
		eq?     
code_01e8:
		bnt      code_0324
		pushi    #addObstacle
		pushi    6
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    14
		pushi    200
		pushi    93
		pushi    115
		pushi    93
		pushi    107
		pushi    81
		pushi    115
		pushi    75
		pushi    319
		pushi    75
		pushi    319
		pushi    110
		pushi    207
		pushi    105
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     42
		push    
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    319
		pushi    145
		pushi    277
		pushi    145
		pushi    198
		pushi    135
		pushi    193
		pushi    129
		pushi    199
		pushi    125
		pushi    319
		pushi    125
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
		pushi    301
		pushi    121
		pushi    222
		pushi    121
		pushi    215
		pushi    117
		pushi    223
		pushi    114
		pushi    301
		pushi    114
		pushi    310
		pushi    116
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
		pushi    10
		pushi    319
		pushi    189
		pushi    186
		pushi    189
		pushi    183
		pushi    175
		pushi    190
		pushi    150
		pushi    319
		pushi    150
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
		pushi    10
		pushi    71
		pushi    91
		pushi    0
		pushi    91
		pushi    0
		pushi    75
		pushi    71
		pushi    75
		pushi    80
		pushi    82
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
		pushi    14
		pushi    164
		pushi    120
		pushi    84
		pushi    128
		pushi    0
		pushi    122
		pushi    0
		pushi    107
		pushi    149
		pushi    107
		pushi    158
		pushi    109
		pushi    165
		pushi    113
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     42
		push    
		lag      global2
		send     16
		jmp      code_065a
code_0324:
		lsg      global112
		ldi      147
		eq?     
		bt       code_0360
		lsg      global112
		ldi      148
		eq?     
		bt       code_0360
		lsg      global112
		ldi      149
		eq?     
		bt       code_0360
		lsg      global112
		ldi      168
		eq?     
		bt       code_0360
		lsg      global112
		ldi      169
		eq?     
		bt       code_0360
		lsg      global112
		ldi      170
		eq?     
		bt       code_0360
		lsg      global112
		ldi      182
		eq?     
code_0360:
		bnt      code_04bc
		pushi    #addObstacle
		pushi    7
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    10
		pushi    111
		pushi    91
		pushi    108
		pushi    82
		pushi    115
		pushi    75
		pushi    319
		pushi    75
		pushi    319
		pushi    91
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
		pushi    10
		pushi    319
		pushi    189
		pushi    85
		pushi    189
		pushi    85
		pushi    153
		pushi    113
		pushi    146
		pushi    319
		pushi    146
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
		pushi    12
		pushi    296
		pushi    120
		pushi    225
		pushi    120
		pushi    216
		pushi    116
		pushi    223
		pushi    113
		pushi    300
		pushi    113
		pushi    311
		pushi    116
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
		pushi    10
		pushi    319
		pushi    111
		pushi    288
		pushi    111
		pushi    280
		pushi    109
		pushi    291
		pushi    107
		pushi    319
		pushi    107
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
		pushi    14
		pushi    168
		pushi    116
		pushi    141
		pushi    125
		pushi    64
		pushi    127
		pushi    0
		pushi    125
		pushi    0
		pushi    105
		pushi    150
		pushi    105
		pushi    164
		pushi    110
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     42
		push    
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    10
		pushi    0
		pushi    75
		pushi    71
		pushi    75
		pushi    77
		pushi    83
		pushi    71
		pushi    89
		pushi    0
		pushi    89
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
		pushi    12
		pushi    319
		pushi    139
		pushi    241
		pushi    136
		pushi    197
		pushi    134
		pushi    194
		pushi    128
		pushi    198
		pushi    126
		pushi    319
		pushi    127
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     38
		push    
		lag      global2
		send     18
		jmp      code_065a
code_04bc:
		lsg      global112
		ldi      48
		eq?     
		bt       code_04d9
		lsg      global112
		ldi      81
		eq?     
		bt       code_04d9
		lsg      global112
		ldi      97
		eq?     
		bt       code_04d9
		lsg      global112
		ldi      113
		eq?     
code_04d9:
		bnt      code_065a
		pushi    #addObstacle
		pushi    8
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    319
		pushi    147
		pushi    224
		pushi    138
		pushi    203
		pushi    133
		pushi    192
		pushi    129
		pushi    203
		pushi    125
		pushi    319
		pushi    125
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
		pushi    288
		pushi    189
		pushi    165
		pushi    189
		pushi    200
		pushi    183
		pushi    247
		pushi    179
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
		pushi    14
		pushi    170
		pushi    115
		pushi    167
		pushi    121
		pushi    81
		pushi    125
		pushi    0
		pushi    118
		pushi    0
		pushi    102
		pushi    120
		pushi    102
		pushi    164
		pushi    109
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     42
		push    
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    12
		pushi    297
		pushi    121
		pushi    231
		pushi    121
		pushi    221
		pushi    118
		pushi    229
		pushi    114
		pushi    296
		pushi    114
		pushi    309
		pushi    117
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
		pushi    104
		pushi    319
		pushi    109
		pushi    281
		pushi    109
		pushi    277
		pushi    107
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
		pushi    124
		pushi    92
		pushi    116
		pushi    82
		pushi    124
		pushi    73
		pushi    258
		pushi    73
		pushi    265
		pushi    84
		pushi    258
		pushi    92
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
		pushi    10
		pushi    109
		pushi    189
		pushi    0
		pushi    189
		pushi    0
		pushi    140
		pushi    108
		pushi    141
		pushi    120
		pushi    175
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
		pushi    10
		pushi    102
		pushi    95
		pushi    0
		pushi    95
		pushi    0
		pushi    53
		pushi    104
		pushi    53
		pushi    115
		pushi    75
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     34
		push    
		lag      global2
		send     20
code_065a:
		pushi    1
		pushi    222
		callk    DisposeScript,  2
		ret     
	)
)