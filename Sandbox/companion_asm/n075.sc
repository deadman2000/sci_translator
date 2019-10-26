;;; Sierra Script 1.0 - (do not remove this comment)
(script# 75)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge10 0
)

(local
	[local0 10]
	[local10 9] = [1 1 1 1 1 0 0 0 1]
	[local19 9] = [1 1 1 1 1 1 1 1 1]
	[local28 9] = [15 15 15 15 15 14 14 14 15]
	[local37 9] = [340 319 298 277 256 340 319 298 235]
	[local46 112] = [177 145 113 81 49 85 53 21 17 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 0 1 1 1 0 0 1 0 0 0 0 1 0 0 0 0 15 14 14 14 13 12 12 12 11 11 10 9 9 8 8 7 6 6 5 5 210 264 212 154 242 233 182 128 214 156 98 188 127 171 112 59 150 93 132 77 225 227 225 219 194 178 178 178 149 149 131 104 104 82 82 77 52 52 29 29]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      9
		lt?     
		bnt      code_005f
		pushi    6
		pushi    #superClass
		lat      temp0
		lsli     local10
		pushi    7
		pushi    1
		lsli     local19
		pushi    63
		pushi    1
		lsli     local28
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local37
		pushi    3
		pushi    1
		lsli     local46
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

(instance hedge10 of HedgeRow
	(properties
		teleX 293
		teleY 56
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			pushi    30
			lag      global12
			le?     
			bnt      code_0128
			pprev   
			ldi      85
			le?     
code_0128:
			not     
			bnt      code_0141
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
			jmp      code_0151
code_0141:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_0151:
			pushi    0
			call     localproc_000e,  0
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    319
			pushi    183
			pushi    199
			pushi    0
			pushi    234
			pushi    0
			pushi    319
			pushi    128
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
			pushi    319
			pushi    92
			pushi    259
			pushi    0
			pushi    293
			pushi    0
			pushi    319
			pushi    39
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
