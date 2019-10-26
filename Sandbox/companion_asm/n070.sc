;;; Sierra Script 1.0 - (do not remove this comment)
(script# 70)
(include sci.sh)
(use n000)
(use n013)
(use n490)
(use n806)
(use n945)
(use n946)
(use n996)
(use n998)
(use n999)

(public
	hedge9 0
)

(local
	local0
	[local1 43]
	[local44 40] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1]
	[local84 40] = [1 1 1 1 1 1 2 2 2 2 2 2 4 4 4 4 4 5 5 5 7 7 7 6 7 6 6 8 8 9 9 9 9 9 9 9 10 10 10 10]
	[local124 40] = [327 264 202 138 77 16 327 264 202 140 77 16 327 264 202 140 109 348 308 245 130 66 36 216 149 326 267 152 117 322 258 226 198 194 87 106 15 35 56 170]
	[local164 54] = [45 45 45 45 45 45 83 83 83 83 83 83 115 115 115 115 115 142 142 142 142 142 142 173 173 173 173 173 173 213 213 213 213 243 203 232 179 211 243 244 0 1070 2 1 0 431 0 2 4 23 34 24 25 1]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      42
		lt?     
		bnt      code_005e
		pushi    6
		pushi    #superClass
		pushi    0
		pushi    7
		pushi    1
		lat      temp0
		lsli     local44
		pushi    63
		pushi    1
		lsli     local84
		pushi    17
		pushi    1
		pushi    16400
		pushi    4
		pushi    1
		lsli     local124
		pushi    3
		pushi    1
		lsli     local164
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    hedgeMaster
		send     4
		push    
		lat      temp0
		sali     local1
		send     40
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local1
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

(instance hedge9 of HedgeRow
	(properties
		teleX 150
		teleY 50
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    HedgeRow,  4
			lsg      global130
			ldi      10
			eq?     
			bnt      code_00cc
			pushi    #north
			pushi    1
			pushi    501
			self     6
			jmp      code_00d5
code_00cc:
			pushi    #north
			pushi    1
			pushi    500
			self     6
code_00d5:
			pushi    30
			lag      global12
			le?     
			bnt      code_00e1
			pprev   
			ldi      85
			le?     
code_00e1:
			not     
			bnt      code_00fa
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
			jmp      code_010a
code_00fa:
			pushi    #fade
			pushi    4
			pushi    127
			pushi    8
			pushi    30
			pushi    0
			lag      global100
			send     12
code_010a:
			pushi    0
			call     localproc_000e,  0
			pushi    1
			lofsa    theDoor
			push    
			calle    proc806_2,  2
			pushi    #addObstacle
			pushi    6
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    0
			pushi    47
			pushi    0
			pushi    20
			pushi    319
			pushi    20
			pushi    319
			pushi    47
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
			pushi    0
			pushi    85
			pushi    0
			pushi    74
			pushi    319
			pushi    74
			pushi    319
			pushi    85
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
			pushi    34
			pushi    117
			pushi    26
			pushi    105
			pushi    319
			pushi    105
			pushi    319
			pushi    117
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
			pushi    16
			pushi    319
			pushi    144
			pushi    204
			pushi    144
			pushi    222
			pushi    165
			pushi    319
			pushi    165
			pushi    319
			pushi    175
			pushi    195
			pushi    175
			pushi    164
			pushi    130
			pushi    319
			pushi    130
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
			pushi    24
			pushi    0
			pushi    189
			pushi    0
			pushi    130
			pushi    132
			pushi    130
			pushi    161
			pushi    175
			pushi    72
			pushi    175
			pushi    82
			pushi    189
			pushi    53
			pushi    189
			pushi    33
			pushi    160
			pushi    114
			pushi    160
			pushi    105
			pushi    146
			pushi    8
			pushi    146
			pushi    37
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    113
			pushi    189
			pushi    111
			pushi    187
			pushi    319
			pushi    187
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
			lag      global2
			send     16
			ret     
		)
	)
)

(instance theDoor of PicView
	(properties
		x 168
		y 47
		view 500
		loop 2
		priority 1
		signal $4010
	)
	
	(method (init)
		(asm
			pushi    #add
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #add
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #dispose
			pushi    0
			super    PicView,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #canControl
			pushi    0
			class    User
			send     4
			bnt      code_03b6
			pushi    #canInput
			pushi    0
			class    User
			send     4
			bnt      code_03b6
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_02fd
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      0
			eq?     
code_02fd:
			bt       code_0319
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_03b6
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0319:
			bnt      code_03b6
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			push    
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			eq?     
			bt       code_0343
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			push    
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			eq?     
code_0343:
			bnt      code_03b6
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_03b6
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0360
			pushi    1
			pushi    172
			callb    proc0_6,  2
code_0360:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      75
			gt?     
			bnt      code_0384
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			pushi    3
			pushi    1070
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_03bf
code_0384:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_03a0
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    490
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_03bf
code_03a0:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			pushi    #setScript
			pushi    1
			lofsa    goToDoor
			push    
			lag      global0
			send     6
			jmp      code_03bf
code_03b6:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    PicView,  6
code_03bf:
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_03d6
			pushi    3
			pushi    1070
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_03df
code_03d6:
			pushi    #doVerb
			pushi    0
			&rest    param3
			super    PicView,  4
code_03df:
			ret     
		)
	)
)

(instance goToDoor of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0476
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    theDoor
			send     4
			push    
			ldi      62
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theDoor
			send     4
			push    
			ldi      2
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_04bb
code_0476:
			dup     
			ldi      1
			eq?     
			bnt      code_04a1
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_04bb
code_04a1:
			dup     
			ldi      2
			eq?     
			bnt      code_04bb
			ldi      0
			sag      global158
			pushi    #newRoom
			pushi    1
			pushi    500
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
code_04bb:
			toss    
			ret     
		)
	)
)
