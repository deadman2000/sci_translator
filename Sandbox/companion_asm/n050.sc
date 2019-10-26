;;; Sierra Script 1.0 - (do not remove this comment)
(script# 50)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge5 0
)

(local
	[local0 52]
	[local52 51] = [1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 0 0 0 1 1 0 0 1 1 1 1 1 0 0 1 1 0 0 0 0 1 1 1 0 0 0 0 1]
	[local103 51] = [0 0 0 0 0 1 1 1 1 1 2 2 2 2 2 2 3 3 4 4 4 3 4 4 4 5 5 5 6 6 10 10 10 10 5 5 5 6 5 8 8 7 7 9 9 9 11 11 15 15 8]
	[local154 51] = [293 311 329 380 238 260 280 301 322 336 201 222 242 263 284 305 118 139 56 77 84 158 96 157 145 25 44 66 71 57 17 38 59 73 201 180 169 141 222 227 226 144 140 112 132 147 74 22 306 245 198]
	[local205 51] = [16 43 70 70 26 61 92 124 156 174 61 93 124 156 188 220 29 61 24 57 67 91 85 85 85 57 91 124 125 125 131 163 195 217 159 125 125 155 191 193 193 156 156 187 218 241 215 215 221 221 226]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      51
		lt?     
		bnt      code_005e
		pushi    6
		pushi    #superClass
		pushi    0
		pushi    7
		pushi    1
		lat      temp0
		lsli     local52
		pushi    63
		pushi    1
		lsli     local103
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local154
		pushi    3
		pushi    1
		lsli     local205
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

(instance hedge5 of HedgeRow
	(properties
		teleX 140
		teleY 140
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
			pushi    5
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    307
			pushi    73
			pushi    257
			pushi    0
			pushi    290
			pushi    0
			pushi    319
			pushi    36
			pushi    319
			pushi    73
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
			pushi    175
			pushi    312
			pushi    175
			pushi    196
			pushi    0
			pushi    226
			pushi    0
			pushi    319
			pushi    141
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
			pushi    36
			pushi    153
			pushi    189
			pushi    143
			pushi    178
			pushi    193
			pushi    178
			pushi    156
			pushi    127
			pushi    135
			pushi    127
			pushi    155
			pushi    159
			pushi    99
			pushi    159
			pushi    119
			pushi    189
			pushi    90
			pushi    189
			pushi    60
			pushi    143
			pushi    108
			pushi    143
			pushi    88
			pushi    116
			pushi    180
			pushi    116
			pushi    229
			pushi    187
			pushi    259
			pushi    187
			pushi    154
			pushi    26
			pushi    185
			pushi    26
			pushi    290
			pushi    189
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
			pushi    22
			pushi    74
			pushi    87
			pushi    34
			pushi    26
			pushi    0
			pushi    26
			pushi    0
			pushi    0
			pushi    47
			pushi    0
			pushi    97
			pushi    76
			pushi    127
			pushi    76
			pushi    77
			pushi    1
			pushi    74
			pushi    0
			pushi    103
			pushi    0
			pushi    166
			pushi    87
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    28
			dup     
			pushi    185
			pushi    0
			pushi    141
			pushi    0
			pushi    88
			pushi    17
			pushi    116
			pushi    35
			pushi    114
			pushi    4
			pushi    63
			pushi    0
			pushi    63
			pushi    0
			pushi    45
			pushi    25
			pushi    45
			pushi    81
			pushi    127
			pushi    22
			pushi    127
			pushi    63
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    185
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			push    
			lag      global2
			send     14
			ret     
		)
	)
)
