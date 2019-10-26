;;; Sierra Script 1.0 - (do not remove this comment)
(script# 85)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge12 0
)

(local
	[local0 38]
	[local38 37] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1]
	[local75 37] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
	[local112 37] = [1 1 1 1 1 1 3 3 3 3 5 5 5 6 6 6 7 7 7 7 10 10 10 10 10 12 12 12 12 12 12 13 13 13 13 13 13]
	[local149 37] = [327 264 201 138 74 34 339 309 246 195 321 307 286 358 331 352 257 277 298 313 170 190 211 232 248 88 110 131 152 173 190 28 48 69 90 109 128]
	[local186 37] = [45 45 45 45 45 45 83 83 83 83 115 115 115 142 173 205 146 177 209 233 114 146 178 210 233 79 112 144 176 208 233 78 109 141 173 203 233]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      37
		lt?     
		bnt      code_005f
		pushi    6
		pushi    #superClass
		lat      temp0
		lsli     local38
		pushi    7
		pushi    1
		lsli     local75
		pushi    63
		pushi    1
		lsli     local112
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local149
		pushi    3
		pushi    1
		lsli     local186
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

(instance hedge12 of HedgeRow
	(properties
		teleX 131
		teleY 188
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			pushi    30
			lag      global12
			le?     
			bnt      code_00c6
			pprev   
			ldi      85
			le?     
code_00c6:
			not     
			bnt      code_00df
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
			jmp      code_00ef
code_00df:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_00ef:
			pushi    0
			call     localproc_000e,  0
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    77
			pushi    189
			pushi    0
			pushi    71
			pushi    0
			pushi    20
			pushi    319
			pushi    20
			pushi    319
			pushi    47
			pushi    70
			pushi    47
			pushi    164
			pushi    189
			pushi    135
			pushi    189
			pushi    40
			pushi    47
			pushi    14
			pushi    47
			pushi    105
			pushi    189
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
			pushi    12
			pushi    193
			pushi    189
			pushi    114
			pushi    74
			pushi    319
			pushi    74
			pushi    319
			pushi    85
			pushi    153
			pushi    85
			pushi    222
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
			pushi    262
			pushi    189
			pushi    204
			pushi    105
			pushi    319
			pushi    105
			pushi    319
			pushi    117
			pushi    243
			pushi    117
			pushi    289
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
			pushi    319
			pushi    189
			pushi    317
			pushi    189
			pushi    317
			pushi    187
			pushi    278
			pushi    130
			pushi    319
			pushi    130
			pushi    319
			pushi    144
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     12
			ret     
		)
	)
)
