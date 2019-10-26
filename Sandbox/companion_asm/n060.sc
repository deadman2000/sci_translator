;;; Sierra Script 1.0 - (do not remove this comment)
(script# 60)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge7 0
)

(local
	[local0 33]
	[local33 32] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
	[local65 32] = [0 0 0 1 1 0 0 0 1 0 1 1 1 1 0 0 0 0 0 0 1 1 1 1 1 1]
	[local97 32] = [0 0 0 0 12 12 12 12 12 12 13 13 13 13 13 13 13 13 13 13 14 14 14 14 15 15 15 15 15 15 15 15]
	[local129 32] = [326 277 219 164 107 326 280 219 128 184 30 45 66 87 349 319 278 214 151 136 22 43 64 85 7 27 326 286 223 159 95 85]
	[local161 32] = [21 21 27 27 29 61 61 61 62 61 10 35 67 99 99 99 99 99 99 99 90 122 154 186 155 187 187 187 187 187 187 187]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      32
		lt?     
		bnt      code_005f
		pushi    6
		pushi    #superClass
		lat      temp0
		lsli     local33
		pushi    7
		pushi    1
		lsli     local65
		pushi    63
		pushi    1
		lsli     local97
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local129
		pushi    3
		pushi    1
		lsli     local161
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

(instance hedge7 of HedgeRow
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
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    319
			pushi    188
			pushi    0
			pushi    188
			pushi    0
			pushi    135
			pushi    30
			pushi    178
			pushi    56
			pushi    178
			pushi    0
			pushi    93
			pushi    0
			pushi    33
			pushi    96
			pushi    178
			pushi    319
			pushi    178
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
			pushi    12
			pushi    319
			pushi    102
			pushi    66
			pushi    102
			pushi    0
			pushi    0
			pushi    28
			pushi    0
			pushi    88
			pushi    89
			pushi    319
			pushi    89
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
			pushi    14
			pushi    319
			pushi    63
			pushi    105
			pushi    63
			pushi    65
			pushi    1
			pushi    60
			pushi    0
			pushi    93
			pushi    0
			pushi    131
			pushi    52
			pushi    319
			pushi    52
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
			pushi    8
			pushi    319
			pushi    29
			pushi    143
			pushi    29
			pushi    122
			pushi    0
			pushi    319
			pushi    0
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
