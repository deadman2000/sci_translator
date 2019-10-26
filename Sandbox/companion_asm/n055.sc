;;; Sierra Script 1.0 - (do not remove this comment)
(script# 55)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge6 0
)

(local
	[local0 40]
	[local40 39] = [1 0 1 0 0 0 0 0 1 1 1 1 0 1 1 0 0 0 1 1 0 1 1 1 1 0 0 0 1 0 0 0 1 1 0 0 0 1 1]
	[local79 39] = [0 0 0 0 0 0 0 0 1 1 1 1 2 2 2 2 2 2 3 3 4 4 4 4 4 4 4 5 5 5 5 6 6 6 6 7 7 15 7]
	[local118 39] = [333 313 354 257 194 131 67 37 275 296 317 335 215 235 243 154 91 45 289 310 174 193 207 228 249 109 44 133 154 68 38 88 110 130 26 59 27 201 80]
	[local157 39] = [78 45 109 45 45 45 45 45 79 111 143 171 83 117 129 83 83 83 201 233 115 147 169 201 233 115 115 142 176 142 142 173 207 237 173 213 213 252 247]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      39
		lt?     
		bnt      code_005e
		pushi    6
		pushi    #superClass
		pushi    0
		pushi    7
		pushi    1
		lat      temp0
		lsli     local40
		pushi    63
		pushi    1
		lsli     local79
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local118
		pushi    3
		pushi    1
		lsli     local157
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    hedgeMaster
		send     4
		push    
		lat      temp0
		sali     local0
		send     40
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local0
		lag      global10
		send     6
		+at      temp0
		jmp      code_0014
code_005e:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(instance hedgeMaster of Hedge
	(properties)
)

(instance hedge6 of HedgeRow
	(properties
		teleX 39
		teleY 177
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			pushi    30
			lag      global12
			le?     
			bnt      code_00c4
			pprev   
			ldi      85
			le?     
code_00c4:
			not     
			bnt      code_00dd
			pushi    #number
			pushi    1
			pushi    490
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			jmp      code_00ed
code_00dd:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_00ed:
			pushi    0
			call     localproc_000e,  0
			pushi    #addObstacle
			pushi    7
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    319
			pushi    174
			pushi    311
			pushi    174
			pushi    228
			pushi    47
			pushi    0
			pushi    47
			pushi    0
			pushi    2
			pushi    319
			pushi    2
			pushi    319
			pushi    91
			pushi    290
			pushi    47
			pushi    270
			pushi    47
			pushi    319
			pushi    109
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
			pushi    149
			pushi    117
			pushi    0
			pushi    117
			pushi    0
			pushi    99
			pushi    175
			pushi    99
			pushi    234
			pushi    189
			pushi    196
			pushi    189
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
			pushi    107
			pushi    144
			pushi    0
			pushi    144
			pushi    0
			pushi    130
			pushi    138
			pushi    130
			pushi    166
			pushi    175
			pushi    128
			pushi    175
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
			pushi    66
			pushi    175
			pushi    0
			pushi    175
			pushi    0
			pushi    165
			pushi    92
			pushi    165
			pushi    112
			pushi    189
			pushi    75
			pushi    189
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
			pushi    189
			pushi    85
			pushi    0
			pushi    85
			pushi    0
			pushi    74
			pushi    215
			pushi    74
			pushi    257
			pushi    131
			pushi    218
			pushi    131
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
			pushi    257
			pushi    189
			pushi    239
			pushi    164
			pushi    279
			pushi    164
			pushi    297
			pushi    188
			pushi    319
			pushi    188
			pushi    319
			pushi    189
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
			pushi    0
			pushi    187
			pushi    53
			pushi    187
			pushi    56
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
			lag      global2
			send     18
			ret     
		)
	)
)
