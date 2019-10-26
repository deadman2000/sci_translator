;;; Sierra Script 1.0 - (do not remove this comment)
(script# 65)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge8 0
)

(local
	[local0 48]
	[local48 47] = [0 0 0 0 0 1 1 0 1 1 1 0 1 1 1 0 0 0 1 1 1 1 1 1 0 0 1 1 1 1 0 0 0 0 1 1 1 0 0 0 1 1 1 1 1 1 1]
	[local95 47] = [5 4 4 4 4 7 7 5 6 6 6 7 7 8 8 8 8 10 8 8 8 8 10 10 10 10 9 9 9 10 10 10 11 11 11 11 11 15 15 15 12 12 12 12 13 13 13]
	[local142 47] = [327 330 302 264 204 165 179 298 249 332 343 247 266 200 221 280 271 305 301 101 122 133 175 186 255 235 44 65 76 19 80 70 103 93 124 145 166 325 260 211 64 82 103 115 9 30 51]
	[local189 47] = [57 24 24 24 24 45 66 57 84 124 141 79 110 98 130 130 130 165 164 34 66 83 147 165 165 165 33 66 83 83 83 83 123 123 157 189 221 215 215 215 153 181 214 233 169 202 234]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      47
		lt?     
		bnt      code_005e
		pushi    6
		pushi    #superClass
		pushi    0
		pushi    7
		pushi    1
		lat      temp0
		lsli     local48
		pushi    63
		pushi    1
		lsli     local95
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local142
		pushi    3
		pushi    1
		lsli     local189
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

(instance hedge8 of HedgeRow
	(properties
		teleX 196
		teleY 34
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
			pushi    6
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    48
			pushi    164
			pushi    168
			pushi    126
			pushi    110
			pushi    158
			pushi    110
			pushi    188
			pushi    155
			pushi    276
			pushi    155
			pushi    260
			pushi    132
			pushi    199
			pushi    132
			pushi    113
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    26
			pushi    156
			pushi    26
			pushi    183
			pushi    65
			pushi    219
			pushi    65
			pushi    202
			pushi    45
			pushi    319
			pushi    45
			pushi    319
			pushi    63
			pushi    238
			pushi    63
			pushi    273
			pushi    108
			pushi    243
			pushi    108
			pushi    226
			pushi    85
			pushi    196
			pushi    85
			pushi    219
			pushi    120
			pushi    279
			pushi    120
			pushi    314
			pushi    168
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     110
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    319
			pushi    141
			pushi    283
			pushi    88
			pushi    313
			pushi    88
			pushi    319
			pushi    94
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
			pushi    319
			pushi    185
			pushi    319
			pushi    189
			pushi    121
			pushi    189
			pushi    80
			pushi    125
			pushi    53
			pushi    125
			pushi    91
			pushi    189
			pushi    63
			pushi    189
			pushi    13
			pushi    111
			pushi    98
			pushi    111
			pushi    147
			pushi    185
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
			pushi    110
			pushi    85
			pushi    57
			pushi    1
			pushi    53
			pushi    0
			pushi    85
			pushi    0
			pushi    143
			pushi    85
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
			pushi    0
			pushi    85
			pushi    0
			pushi    30
			pushi    21
			pushi    74
			pushi    50
			pushi    74
			pushi    0
			pushi    0
			pushi    30
			pushi    0
			pushi    89
			pushi    85
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
			pushi    6
			pushi    0
			pushi    189
			pushi    0
			pushi    144
			pushi    29
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     26
			push    
			lag      global2
			send     16
			ret     
		)
	)
)
