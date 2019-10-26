;;; Sierra Script 1.0 - (do not remove this comment)
(script# 30)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge1 0
)

(local
	[local0 27]
	[local27 26] = [1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1]
	[local53 26] = [0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 0 1]
	[local79 26] = [15 15 15 15 15 3 3 3 3 3 3 4 4 4 4 4 4 5 5 5 8 8 8 7 7 15]
	[local105 26] = [326 261 196 131 67 224 246 267 288 309 330 168 190 211 232 253 273 106 127 148 150 111 46 58 59 40]
	[local131 26] = [187 187 187 187 187 25 59 91 123 155 186 27 60 92 124 156 186 35 67 99 99 99 99 59 59 187]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      26
		lt?     
		bnt      code_005f
		pushi    6
		pushi    #superClass
		lat      temp0
		lsli     local27
		pushi    7
		pushi    1
		lsli     local53
		pushi    63
		pushi    1
		lsli     local79
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local105
		pushi    3
		pushi    1
		lsli     local131
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

(instance hedge1 of HedgeRow
	(properties
		teleX 126
		teleY 126
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			pushi    30
			lag      global12
			le?     
			bnt      code_00c8
			pprev   
			ldi      85
			le?     
code_00c8:
			not     
			bnt      code_00e1
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
			jmp      code_00f1
code_00e1:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_00f1:
			pushi    0
			call     localproc_000e,  0
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    26
			pushi    0
			pushi    176
			pushi    243
			pushi    176
			pushi    127
			pushi    1
			pushi    123
			pushi    0
			pushi    156
			pushi    0
			pushi    275
			pushi    176
			pushi    299
			pushi    176
			pushi    185
			pushi    2
			pushi    181
			pushi    0
			pushi    215
			pushi    0
			pushi    319
			pushi    157
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     66
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    14
			pushi    0
			pushi    88
			pushi    119
			pushi    88
			pushi    61
			pushi    1
			pushi    57
			pushi    0
			pushi    88
			pushi    0
			pushi    159
			pushi    101
			pushi    0
			pushi    101
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
			pushi    0
			pushi    47
			pushi    13
			pushi    47
			pushi    5
			pushi    35
			pushi    45
			pushi    35
			pushi    67
			pushi    64
			pushi    0
			pushi    64
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     10
			ret     
		)
	)
)
