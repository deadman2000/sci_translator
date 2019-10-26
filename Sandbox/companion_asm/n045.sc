;;; Sierra Script 1.0 - (do not remove this comment)
(script# 45)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge4 0
)

(local
	[local0 28]
	[local28 28] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1]
	[local56 28] = [1 1 1 1 1 1 0 0 1 0 0 0 0 1 0 0 0 0 0 0 0 1 0 0 0 0 1 1]
	[local84 28] = [9 9 9 9 9 9 13 13 12 12 12 10 10 8 8 8 7 7 7 6 6 6 15 15 15 15 15 15]
	[local112 28] = [237 216 196 175 154 135 121 60 116 95 37 74 18 242 353 296 302 328 267 306 245 192 178 117 55 355 258 279]
	[local140 28] = [185 154 123 92 60 32 99 99 95 61 61 27 27 93 99 99 59 59 59 27 27 22 187 187 187 187 214 243]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      28
		lt?     
		bnt      code_005f
		pushi    6
		pushi    #superClass
		lat      temp0
		lsli     local28
		pushi    7
		pushi    1
		lsli     local56
		pushi    63
		pushi    1
		lsli     local84
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local112
		pushi    3
		pushi    1
		lsli     local140
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

(instance hedge4 of HedgeRow
	(properties
		teleX 250
		teleY 150
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
			pushi    7
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    0
			pushi    176
			pushi    174
			pushi    176
			pushi    186
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
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    276
			pushi    189
			pushi    264
			pushi    176
			pushi    319
			pushi    176
			pushi    319
			pushi    189
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
			pushi    10
			pushi    216
			pushi    189
			pushi    92
			pushi    1
			pushi    88
			pushi    0
			pushi    121
			pushi    0
			pushi    251
			pushi    189
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
			pushi    0
			pushi    88
			pushi    87
			pushi    88
			pushi    75
			pushi    62
			pushi    0
			pushi    62
			pushi    0
			pushi    47
			pushi    93
			pushi    47
			pushi    129
			pushi    101
			pushi    0
			pushi    101
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
			pushi    221
			pushi    101
			pushi    184
			pushi    47
			pushi    319
			pushi    47
			pushi    319
			pushi    64
			pushi    226
			pushi    64
			pushi    243
			pushi    88
			pushi    319
			pushi    88
			pushi    319
			pushi    101
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
			pushi    81
			pushi    29
			pushi    0
			pushi    29
			pushi    0
			pushi    0
			pushi    65
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
			pushi    8
			pushi    175
			pushi    29
			pushi    153
			pushi    0
			pushi    292
			pushi    0
			pushi    314
			pushi    29
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
