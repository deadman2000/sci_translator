;;; Sierra Script 1.0 - (do not remove this comment)
(script# 610)
(include sci.sh)
(use n000)
(use n013)
(use n945)
(use n946)
(use n964)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm610 0
	hiddenWisp 1
)

(local
	local0
	local1
	local2
	[local3 24]
	[local27 24] = [3 3 3 3 2 2 3 3 3 2 2 2 2 2 2 3 2 3 2 2 3 3 3 3]
	[local51 24] = [7 7 7 7 6 7 6 6 6 6 6 4 1 4 3 7 7 6 5 6 5 6 7 5]
	[local75 24] = [269 0 20 252 50 0 22 0 281 243 286 23 -3 281 -4 228 233 258 268 286 302 -5 37 224]
	[local99 24] = [189 24 189 28 189 189 173 12 21 19 181 17 43 17 170 189 183 175 166 36 39 34 10 12]
	[local123 10]
	[local133 13] = [266 265 196 299 124 210 240 127 91 125 34 185 278]
	[local146 13] = [47 66 50 76 17 115 85 62 121 85 103 129 142]
	[local159 20]
	[local179 14] = [65 295 0 194 319 147 83 226 -27 195 60 318 98 191]
	[local193 14] = [24 22 58 51 69 62 97 108 121 140 150 172 181 201]
)
(procedure (localproc_0012)
	(asm
		pushi    #contains
		pushi    1
		lofsa    hiddenWisp
		push    
		lag      global5
		send     6
		bnt      code_0021
		ret     
code_0021:
		pushi    2
		pushi    1
		pushi    4
		callk    Random,  4
		sal      local2
		push    
		ldi      3
		eq?     
		bnt      code_0035
		ldi      2
		sal      local2
code_0035:
		lsl      local2
		dup     
		ldi      1
		eq?     
		bnt      code_0074
		pushi    #init
		pushi    0
		pushi    283
		pushi    15
		class    DPath
		push    
		pushi    215
		pushi    160
		pushi    240
		pushi    110
		pushi    165
		pushi    105
		pushi    115
		pushi    85
		pushi    165
		pushi    50
		pushi    180
		pushi    10
		pushi    170
		pushi    65456
		lofsa    hiddenWisp
		send     38
		jmp      code_00de
code_0074:
		dup     
		ldi      2
		eq?     
		bnt      code_00ab
		pushi    #init
		pushi    0
		pushi    283
		pushi    13
		class    DPath
		push    
		pushi    120
		pushi    150
		pushi    90
		pushi    120
		pushi    165
		pushi    90
		pushi    240
		pushi    70
		pushi    305
		pushi    105
		pushi    400
		pushi    100
		lofsa    hiddenWisp
		send     34
		jmp      code_00de
code_00ab:
		dup     
		ldi      4
		eq?     
		bnt      code_00de
		pushi    #init
		pushi    0
		pushi    283
		pushi    13
		class    DPath
		push    
		pushi    210
		pushi    140
		pushi    230
		pushi    105
		pushi    185
		pushi    70
		pushi    105
		pushi    60
		pushi    45
		pushi    105
		pushi    65456
		pushi    100
		lofsa    hiddenWisp
		send     34
code_00de:
		toss    
		ret     
	)
)

(procedure (localproc_00e0 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_00e6:
		lst      temp0
		ldi      14
		lt?     
		bnt      code_012a
		pushi    #new
		pushi    0
		lofsa    cloud
		send     4
		push    
		lat      temp0
		sali     local159
		pushi    #x
		pushi    1
		lat      temp0
		lsli     local179
		pushi    3
		pushi    1
		lsli     local193
		pushi    6
		pushi    1
		pushi    2
		pushi    0
		pushi    1
		callk    Random,  4
		push    
		pushi    107
		pushi    0
		lat      temp0
		lali     local159
		send     22
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local159
		lag      global10
		send     6
		+at      temp0
		jmp      code_00e6
code_012a:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(procedure (localproc_0132 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0138:
		lst      temp0
		ldi      24
		lt?     
		bnt      code_0186
		pushi    #new
		pushi    0
		lofsa    plant
		send     4
		push    
		lat      temp0
		sali     local3
		pushi    #view
		pushi    1
		pushi    600
		pushi    6
		pushi    1
		lat      temp0
		lsli     local27
		pushi    7
		pushi    1
		lsli     local51
		pushi    17
		pushi    1
		pushi    16384
		pushi    4
		pushi    1
		lsli     local75
		pushi    3
		pushi    1
		lsli     local99
		pushi    107
		pushi    0
		lali     local3
		send     40
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local3
		lag      global10
		send     6
		+at      temp0
		jmp      code_0138
code_0186:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(procedure (localproc_018e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0194:
		lst      temp0
		ldi      13
		lt?     
		bnt      code_01c3
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local133
		pushi    3
		pushi    1
		lsli     local146
		pushi    66
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local123
		send     22
		+at      temp0
		jmp      code_0194
code_01c3:
		ret     
	)
)

(instance rm610 of Rm
	(properties
		picture 610
		horizon 24
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			lag      global34
			sal      local0
			ldi      0
			sag      global34
			pushi    0
			call     localproc_0132,  0
			pushi    0
			call     localproc_00e0,  0
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0224
			pushi    0
			call     localproc_018e,  0
code_0224:
			pushi    #actions
			pushi    1
			pushi    2
			pushi    601
			pushi    7
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    0
			pushi    50
			pushi    0
			pushi    0
			pushi    117
			pushi    0
			pushi    117
			pushi    23
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
			pushi    195
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    47
			pushi    195
			pushi    23
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
			pushi    0
			pushi    161
			pushi    49
			pushi    161
			pushi    121
			pushi    183
			pushi    121
			pushi    189
			pushi    0
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
			pushi    10
			pushi    196
			pushi    189
			pushi    196
			pushi    181
			pushi    268
			pushi    155
			pushi    319
			pushi    155
			pushi    319
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			self     12
			lsg      global126
			ldi      6
			eq?     
			bnt      code_02fb
			pushi    #setScript
			pushi    1
			lofsa    withMonk
			push    
			lag      global2
			send     6
			jmp      code_0307
code_02fb:
			pushi    #setScript
			pushi    1
			lofsa    onTheWater
			push    
			lag      global0
			send     6
code_0307:
			ret     
		)
	)
	
	(method (doit &tmp [temp0 2] temp2)
		(asm
			+al      local1
			push    
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0326
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    65535
			callk    Palette,  8
code_0326:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			sat      temp2
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_033f
			jmp      code_0375
code_033f:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0359
			pushi    #setScript
			pushi    1
			lofsa    outtaHere
			push    
			lag      global0
			send     6
			jmp      code_0375
code_0359:
			lsg      global115
			ldi      1
			eq?     
			bnt      code_0375
			pushi    #contains
			pushi    1
			lofsa    hiddenWisp
			push    
			lag      global5
			send     6
			not     
			bnt      code_0375
			pushi    0
			call     localproc_0012,  0
code_0375:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local0
			sag      global34
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_01db
			pushi    3
			pushi    1610
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_01fc
code_01db:
			dup     
			ldi      3
			eq?     
			bnt      code_01f1
			pushi    3
			pushi    1610
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_01fc
code_01f1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_01fc:
			toss    
			ret     
		)
	)
)

(instance cloud of PicView
	(properties
		z 15
		lookStr 4
		view 590
		signal $6000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_03f1
			pushi    3
			pushi    1610
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_03fc
code_03f1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_03fc:
			ret     
		)
	)
)

(instance plant of PicView
	(properties
		lookStr 1
	)
)

(instance wave of Prop
	(properties
		view 610
		loop 4
		signal $4000
		cycleSpeed 18
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_04b6
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			self     12
			jmp      code_04ca
code_04b6:
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Rev
			push    
			self     12
code_04ca:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance hiddenWisp of Actor
	(properties
		x 130
		y 190
		yStep 6
		view 610
		loop 3
		signal $6800
		xStep 6
		moveSpeed 12
	)
)

(instance onTheWater of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2] temp2)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0649
			lsg      global87
			ldi      0
			gt?     
			bnt      code_05d9
			ldi      2
			jmp      code_05db
code_05d9:
			ldi      3
code_05db:
			sat      temp2
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			pushi    #agonize
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    170
			pushi    240
			pushi    308
			pushi    2
			lst      temp2
			dup     
			pushi    56
			pushi    1
			pushi    6
			pushi    219
			pushi    1
			pushi    24
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    62
			pushi    1
			pushi    2
			pushi    601
			pushi    6
			callk    ScriptID,  4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      12288
			or      
			push    
			ldi      63487
			and     
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    176
			pushi    170
			pushSelf
			lag      global0
			send     74
			jmp      code_0670
code_0649:
			dup     
			ldi      1
			eq?     
			bnt      code_0670
			lsg      global115
			ldi      1
			eq?     
			bnt      code_065d
			pushi    0
			call     localproc_0012,  0
code_065d:
			pushi    0
			callb    proc0_4,  0
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0670:
			toss    
			ret     
		)
	)
)

(instance outtaHere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0768
			pushi    0
			callb    proc0_3,  0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_06e6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    65531
			pushSelf
			lag      global0
			send     12
			jmp      code_0764
code_06e6:
			dup     
			ldi      3
			eq?     
			bnt      code_0711
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
			ldi      30
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0764
code_0711:
			dup     
			ldi      4
			eq?     
			bnt      code_073c
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0764
code_073c:
			dup     
			ldi      2
			eq?     
			bnt      code_0764
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
code_0764:
			toss    
			jmp      code_07a7
code_0768:
			dup     
			ldi      1
			eq?     
			bnt      code_07a7
			lsg      global115
			ldi      1
			eq?     
			bnt      code_079c
			lsg      global130
			ldi      13
			eq?     
			bnt      code_079c
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			lal      local2
			eq?     
			bnt      code_079c
			pushi    #newRoom
			pushi    1
			pushi    700
			lag      global2
			send     6
			jmp      code_07a7
code_079c:
			pushi    #newRoom
			pushi    1
			pushi    620
			lag      global2
			send     6
code_07a7:
			toss    
			ret     
		)
	)
)

(instance withMonk of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      36
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      19
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     14
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      70
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      25
			add     
			push    
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     8
			pushi    #setPri
			pushi    1
			pushi    #priority
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_098d
			lsg      global87
			ldi      0
			gt?     
			bnt      code_0897
			ldi      2
			jmp      code_0899
code_0897:
			ldi      3
code_0899:
			sat      temp0
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    3
			pushi    0
			pushi    4
			pushi    5
			lag      global69
			send     10
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    0
			pushi    138
			pushi    17
			pushi    1
			pushi    18432
			pushi    308
			pushi    2
			lst      temp0
			dup     
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    409
			pushi    53
			pushSelf
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     50
			pushi    5
			pushi    1
			pushi    #notice
			pushi    162
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			pushi    24
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      70
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      25
			add     
			push    
			pushi    17
			pushi    1
			pushi    16384
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     42
			pushi    5
			pushi    1
			pushi    #brRight
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      36
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      19
			add     
			push    
			pushi    17
			pushi    1
			pushi    16384
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     42
			jmp      code_09a3
code_098d:
			dup     
			ldi      1
			eq?     
			bnt      code_09a3
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    620
			lag      global2
			send     6
code_09a3:
			toss    
			ret     
		)
	)
)
