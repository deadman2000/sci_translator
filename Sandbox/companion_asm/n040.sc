;;; Sierra Script 1.0 - (do not remove this comment)
(script# 40)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge3 0
)

(local
	[local0 9]
	[local9 8] = [1 1 1 1 1 1 1 1]
	[local17 8] = [0 0 0 0 0 0 1 15]
	[local25 8] = [10 30 51 72 93 114 16 73]
	[local33 123] = [73 105 137 169 201 233 172 261 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 1 0 0 0 0 0 1 1 1 0 0 1 1 0 0 0 0 1 1 0 6 7 7 7 8 9 9 10 10 11 11 11 12 12 12 12 13 13 14 14 15 14 15 92 178 199 147 144 210 154 225 168 244 194 140 252 196 270 222 214 273 288 231 309 261 247 89 63 94 94 89 108 108 128 126 158 158 155 170 170 195 195 194 197 217 217 247 249 239]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      8
		lt?     
		bnt      code_005e
		pushi    6
		pushi    #superClass
		pushi    0
		pushi    7
		pushi    1
		lat      temp0
		lsli     local9
		pushi    63
		pushi    1
		lsli     local17
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local25
		pushi    3
		pushi    1
		lsli     local33
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

(instance hedge3 of HedgeRow
	(properties
		teleX 15
		teleY 160
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
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    62
			pushi    189
			pushi    0
			pushi    94
			pushi    0
			pushi    46
			pushi    95
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
			pushi    27
			pushi    174
			pushi    0
			pushi    174
			pushi    0
			pushi    100
			pushi    27
			pushi    160
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     8
			ret     
		)
	)
)
