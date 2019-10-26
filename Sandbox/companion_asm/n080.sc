;;; Sierra Script 1.0 - (do not remove this comment)
(script# 80)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge11 0
)

(local
	[local0 30]
	[local30 29] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1]
	[local59 29] = [1 1 1 1 1 1 1 1 1 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
	[local88 29] = [7 7 7 10 10 10 12 12 12 12 12 13 13 13 14 14 14 13 14 15 15 15 15 15 15 15 15 15 15]
	[local117 29] = [306 327 340 239 260 274 181 202 216 277 266 300 290 321 261 282 302 342 323 106 127 148 169 190 211 232 253 232 211]
	[local146 72] = [31 63 83 31 64 85 31 64 85 85 85 123 123 157 154 186 218 189 250 7 40 73 105 137 169 201 233 201 169 0 0 0 0 0 0 0 1 0 0 0 0 1 1 0 0 15 14 14 12 13 12 12 11 11 61 150 93 80 138 132 86 112 59 250 222 222 201 203 199 199 169 169]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      29
		lt?     
		bnt      code_005f
		pushi    6
		pushi    #superClass
		lat      temp0
		lsli     local30
		pushi    7
		pushi    1
		lsli     local59
		pushi    63
		pushi    1
		lsli     local88
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local117
		pushi    3
		pushi    1
		lsli     local146
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
code_005f:
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

(instance hedge11 of HedgeRow
	(properties
		teleX 291
		teleY 66
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			pushi    30
			lag      global12
			le?     
			bnt      code_0124
			pprev   
			ldi      85
			le?     
code_0124:
			not     
			bnt      code_013d
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
			jmp      code_014d
code_013d:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_014d:
			pushi    0
			call     localproc_000e,  0
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    105
			pushi    0
			pushi    229
			pushi    189
			pushi    200
			pushi    189
			pushi    78
			pushi    0
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
			pushi    192
			pushi    87
			pushi    137
			pushi    1
			pushi    131
			pushi    0
			pushi    165
			pushi    0
			pushi    218
			pushi    75
			pushi    243
			pushi    75
			pushi    197
			pushi    1
			pushi    192
			pushi    0
			pushi    223
			pushi    0
			pushi    288
			pushi    87
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
			pushi    18
			pushi    260
			pushi    189
			pushi    209
			pushi    109
			pushi    294
			pushi    109
			pushi    319
			pushi    145
			pushi    319
			pushi    189
			pushi    318
			pushi    189
			pushi    277
			pushi    126
			pushi    248
			pushi    126
			pushi    289
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
			pushi    319
			pushi    87
			pushi    261
			pushi    0
			pushi    297
			pushi    0
			pushi    319
			pushi    30
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     12
			ret     
		)
	)
)
