;;; Sierra Script 1.0 - (do not remove this comment)
(script# 35)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge2 0
)

(local
	[local0 27]
	[local27 26] = [1 1 1 1 1 1 1 1 0 0 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1]
	[local53 26] = [1 1 1 1 1 1 1 1 4 4 4 5 4 5 4 5 4 5 6 15 6 2 3 3 3 3]
	[local79 26] = [94 115 135 156 177 198 219 239 108 85 129 60 149 79 168 100 184 116 4 58 16 72 77 59 7 20]
	[local105 87] = [15 47 77 109 141 173 205 235 121 121 155 155 186 183 216 215 240 239 158 252 174 69 70 70 69 70 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0 0 0 0 1 1 0 0 2 2 3 3 4 5 6 6 7 7 8 8 293 232 310 262 249 306 325 272 362 295 356 296 28 28 58 61 53 56 82 82 115 113 112 112]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      26
		lt?     
		bnt      code_005e
		pushi    6
		pushi    #superClass
		pushi    0
		pushi    7
		pushi    1
		lat      temp0
		lsli     local27
		pushi    63
		pushi    1
		lsli     local53
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local79
		pushi    3
		pushi    1
		lsli     local105
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

(instance hedge2 of HedgeRow
	(properties
		teleX 20
		teleY 90
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			pushi    30
			lag      global12
			le?     
			bnt      code_0122
			pprev   
			ldi      85
			le?     
code_0122:
			not     
			bnt      code_013b
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
			jmp      code_014b
code_013b:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_014b:
			pushi    0
			call     localproc_000e,  0
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    185
			pushi    189
			pushi    62
			pushi    1
			pushi    59
			pushi    0
			pushi    93
			pushi    0
			pushi    218
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
			pushi    59
			pushi    189
			pushi    4
			pushi    108
			pushi    104
			pushi    108
			pushi    156
			pushi    189
			pushi    127
			pushi    189
			pushi    84
			pushi    123
			pushi    46
			pushi    123
			pushi    88
			pushi    189
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
			pushi    18
			pushi    0
			pushi    75
			pushi    0
			pushi    1
			pushi    2
			pushi    1
			pushi    2
			pushi    31
			pushi    24
			pushi    65
			pushi    50
			pushi    65
			pushi    31
			pushi    40
			pushi    62
			pushi    40
			pushi    86
			pushi    75
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
			pushi    0
			pushi    176
			pushi    0
			pushi    110
			pushi    28
			pushi    168
			pushi    28
			pushi    176
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
