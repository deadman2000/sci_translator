;;; Sierra Script 1.0 - (do not remove this comment)
(script# 460)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n852)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n995)
(use n998)
(use n999)

(public
	rm460 0
)

(local
	local0
	[local1 9] = [431 0 2 4 23 34 24 25 25]
	[local10 9] = [431 3 2 4 5 39 25 33 25]
	[local19 3] = [-1 13128 32]
	[local22 3] = [-1 13135 32]
	[local25 3] = [-1 13143 32]
	[local28 14] = [1460 0 1 1 2 1 1 1 2 1 1 2 1]
	[local42 6] = [1460 11 1 2 1]
	[local48 6] = [1460 14 1 2 1]
	[local54 6] = [1460 17 1 2 1]
	[local60 7] = [1460 20 1 2 1 1]
	[local67 7] = [1460 24 1 2 1 2]
	[local74 4] = [1460 28 1]
	[local78 4] = [1460 29 1]
	[local82 6] = [1460 30 2 1 1]
	[local88 4] = [1460 33 1]
	[local92 5] = [1460 34 1 1]
	[local97 4] = [1460 36 1]
	[local101 7] = [1460 37 1 2 1 1]
	[local108 4] = [1460 42 1]
	[local112 4] = [1460 43 1]
	[local116 4] = [1460 44 1]
	[local120 4] = [1460 45 1]
	[local124 5] = [1460 47 1 2]
	[local129 4] = [1460 49 1]
	[local133 4] = [1460 50 1]
	[local137 5] = [1460 51 1 1]
	[local142 8] = [1460 53 1 2 1 1 2]
	[local150 8] = [1460 58 1 2 1 2 1]
	[local158 7] = [1460 63 1 2 1 3]
	[local165 12] = [1460 67 1 2 1 2 1 2 1 2 1]
	[local177 13] = [1460 76 1 2 1 1 1 2 1 2 1 1]
	[local190 5] = [1460 113 1 1]
	[local195 4] = [1460 115 1]
	[local199 4] = [1460 116 1]
	[local203 5] = [1460 123 1 1]
	[local208 5] = [1460 125 2 1]
	[local213 4] = [1460 127 1]
	[local217 4] = [1460 129 1]
	[local221 4] = [1460 130 1]
	[local225 5] = [1460 144 2 1]
	[local230 6] = [1460 146 2 1 1]
	[local236 5] = [1460 149 2 1]
	[local241 6] = [1460 151 2 1 1]
	[local247 8] = [1460 154 2 1 1 2 1]
	[local255 6] = [1460 159 2 2 1]
	[local261 8] = [1460 162 2 2 1 1 1]
	[local269 4] = [1460 184 1]
	[local273 4] = [1460 185 1]
	[local277 5] = [1460 186 1 2]
	[local282 7] = [1460 173 1 2 3 1]
	[local289 5] = [1460 136 1 1]
	[local294 4] = [1460 138 1]
	[local298 7] = [1460 169 1 1 2 1]
	[local305 5] = [1460 182 1 1]
	[local310 5] = [1460 177 1 1]
	[local315 4] = [1460 197 1]
	[local319 6] = [1460 199 1 1 1]
	[local325 6] = [1460 202 1 1 1]
	[local331 4] = [1460 122 1]
	[local335 6] = [1460 192 1 2 1]
	[local341 5] = [1460 195 1 2]
	[local346 5] = [1460 190 1 1]
	local351
	local352
	local353
	local354
	[local355 5] = [282 100 279 105 -32768]
	local360 =  12
	local361
	local362
	[local363 8] = [237 112 227 112 224 101 233 100]
)
(procedure (localproc_3146 param1)
	(asm
		pushi    #view
		pushi    1
		pushi    435
		pushi    6
		pushi    1
		pushi    5
		pushi    4
		pushi    1
		pushi    292
		pushi    3
		pushi    1
		pushi    121
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		class    View
		send     4
		send     28
		pushi    #register
		pushi    1
		pushi    2
		pushi    452
		pushi    1
		callk    ScriptID,  4
		push    
		lap      param1
		send     6
		pushi    #view
		pushi    1
		pushi    435
		pushi    6
		pushi    1
		pushi    4
		dup     
		pushi    1
		pushi    248
		pushi    3
		pushi    1
		pushi    115
		pushi    107
		pushi    0
		pushi    #register
		pushi    0
		lap      param1
		send     4
		send     28
		pushi    #view
		pushi    1
		pushi    435
		pushi    6
		pushi    1
		pushi    0
		pushi    4
		pushi    1
		pushi    222
		pushi    3
		pushi    1
		pushi    129
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		class    View
		send     4
		send     28
		pushi    #next
		pushi    1
		lsp      param1
		pushi    #script
		pushi    0
		lag      global2
		send     4
		send     6
		ret     
	)
)

(instance rm460 of StdRoom
	(properties
		picture 460
		east 450
		south 450
		west 450
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    212
			callb    proc0_5,  2
			bnt      code_0023
			pushi    1
			pushi    213
			callb    proc0_6,  2
code_0023:
			lsg      global12
			ldi      450
			eq?     
			bnt      code_0055
			pushi    #setScript
			pushi    1
			lofsa    comeIn
			push    
			self     6
			pushi    #init
			pushi    2
			pushi    0
			pushi    1
			super    StdRoom,  8
			pushi    1
			pushi    29
			callb    proc0_5,  2
			bnt      code_00a6
			pushi    #add
			pushi    1
			lofsa    tunnel
			push    
			lag      global32
			send     6
			jmp      code_00a6
code_0055:
			lsg      global126
			ldi      3
			eq?     
			bt       code_0062
			lsg      global126
			ldi      2
			eq?     
code_0062:
			bnt      code_0079
			pushi    #setScript
			pushi    1
			lofsa    sell
			push    
			self     6
			pushi    #init
			pushi    1
			pushi    1
			super    StdRoom,  6
			jmp      code_00a6
code_0079:
			lsg      global126
			ldi      6
			eq?     
			bnt      code_0095
			pushi    #setScript
			pushi    1
			lofsa    deliver
			push    
			self     6
			pushi    #init
			pushi    1
			pushi    1
			super    StdRoom,  6
			jmp      code_00a6
code_0095:
			pushi    #setScript
			pushi    1
			lofsa    tunnelExit
			push    
			self     6
			pushi    #init
			pushi    1
			pushi    1
			super    StdRoom,  6
code_00a6:
			lsg      global12
			ldi      450
			ne?     
			bnt      code_00c1
			pushi    #number
			pushi    1
			pushi    455
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_00c1:
			lsg      global126
			ldi      5
			ne?     
			bnt      code_00ce
			ldi      0
			jmp      code_0179
code_00ce:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_00e3
			pushi    1
			lofsa    betterLeave
			push    
			call     localproc_3146,  2
			jmp      code_0179
code_00e3:
			pushi    1
			pushi    117
			callb    proc0_5,  2
			bnt      code_0102
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    4
			lofsa    abbot
			send     12
			ldi      2
			sal      local352
			jmp      code_0179
code_0102:
			pushi    1
			pushi    33
			callb    proc0_5,  2
			bnt      code_0117
			pushi    1
			lofsa    mad
			push    
			call     localproc_3146,  2
			jmp      code_0179
code_0117:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    11
			class    Inv
			send     6
			send     4
			push    
			lag      global0
			eq?     
			bnt      code_014a
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_014a
			pushi    #next
			pushi    1
			lofsa    drinkingMatch
			push    
			pushi    #script
			pushi    0
			lag      global2
			send     4
			send     6
			jmp      code_0179
code_014a:
			pushi    1
			pushi    32
			callb    proc0_5,  2
			bnt      code_015f
			pushi    1
			lofsa    frock
			push    
			call     localproc_3146,  2
			jmp      code_0179
code_015f:
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_0179
			pushi    #next
			pushi    1
			lofsa    warn
			push    
			pushi    #script
			pushi    0
			lag      global2
			send     4
			send     6
code_0179:
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fire
			send     10
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
			pushi    #init
			pushi    0
			lofsa    tapestry
			send     4
			pushi    #init
			pushi    0
			lofsa    tables
			send     4
			pushi    #init
			pushi    0
			lofsa    walls
			send     4
			pushi    #init
			pushi    0
			lofsa    lChairs
			send     4
			pushi    #init
			pushi    0
			lofsa    rChairs
			send     4
			pushi    #init
			pushi    0
			lofsa    windows
			send     4
			pushi    #init
			pushi    0
			lofsa    abbotsChair
			send     4
			pushi    #init
			pushi    0
			lofsa    arthur
			send     4
			lsg      global126
			ldi      0
			ne?     
			bnt      code_027d
			pushi    #init
			pushi    0
			lofsa    abbot
			send     4
			pushi    1
			pushi    117
			callb    proc0_5,  2
			not     
			bnt      code_01f6
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    abbot
			send     6
code_01f6:
			pushi    #add
			pushi    1
			lofsa    chair
			push    
			pushi    60
			pushi    0
			lag      global10
			send     10
			pushi    #points
			pushi    1
			lea      @local363
			push    
			lofsa    chrPoly
			send     6
			pushi    #onMeCheck
			pushi    1
			lofsa    chrPoly
			push    
			lofsa    chair
			send     6
			pushi    #add
			pushi    1
			lofsa    chair
			push    
			lag      global32
			send     6
			pushi    #init
			pushi    0
			lofsa    rMug
			send     4
			lsg      global126
			ldi      5
			ne?     
			bnt      code_0243
			pushi    #addToPic
			pushi    0
			lofsa    rMug
			send     4
code_0243:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    11
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_0272
			pushi    #init
			pushi    0
			lofsa    caskV
			send     4
			lsg      global126
			ldi      5
			ne?     
			bnt      code_0272
			pushi    #addToPic
			pushi    0
			lofsa    caskV
			send     4
code_0272:
			pushi    #lookStr
			pushi    1
			pushi    106
			lofsa    abbotsChair
			send     6
code_027d:
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    122
			dup     
			pushi    209
			pushi    122
			pushi    150
			pushi    176
			pushi    122
			pushi    180
			pushi    56
			pushi    175
			pushi    40
			pushi    166
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
			pushi    18
			pushi    225
			pushi    118
			pushi    251
			pushi    118
			pushi    251
			pushi    126
			pushi    256
			pushi    118
			pushi    271
			pushi    119
			pushi    314
			pushi    129
			pushi    278
			pushi    186
			pushi    180
			pushi    182
			pushi    160
			pushi    175
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
			pushi    18
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    99
			pushi    138
			pushi    99
			pushi    111
			pushi    109
			pushi    113
			pushi    121
			pushi    74
			pushi    139
			pushi    39
			pushi    138
			pushi    0
			pushi    156
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     10
			pushi    #actions
			pushi    1
			pushi    2
			pushi    452
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			not     
			bnt      code_036e
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      16384
			and     
			bnt      code_036e
			pushi    #edgeHit
			pushi    1
			pushi    2
			lag      global0
			send     6
code_036e:
			pushi    #doit
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    StdRoom,  4
			pushi    1
			pushi    852
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance comeIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0404
			pushi    #x
			pushi    1
			pushi    320
			pushi    3
			pushi    1
			pushi    170
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    299
			pushi    170
			pushSelf
			lag      global0
			send     24
			jmp      code_0414
code_0404:
			dup     
			ldi      1
			eq?     
			bnt      code_0414
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0414:
			toss    
			ret     
		)
	)
)

(instance tunnelExit of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04b9
			pushi    1
			pushi    29
			callb    proc0_6,  2
			pushi    5
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_0472
			ldi      28
			jmp      code_0474
code_0472:
			ldi      9
code_0474:
			push    
			pushi    284
			pushi    2
			pushi    183
			pushi    99
			pushi    6
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_048e
			ldi      5
			jmp      code_0490
code_048e:
			ldi      0
code_0490:
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     38
			pushi    #init
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tunnel
			send     12
			jmp      code_0547
code_04b9:
			dup     
			ldi      1
			eq?     
			bnt      code_04cf
			pushi    #play
			pushi    0
			lofsa    tapestrySound
			send     4
			ldi      2
			aTop     cycles
			jmp      code_0547
code_04cf:
			dup     
			ldi      2
			eq?     
			bnt      code_04eb
			pushi    #dispose
			pushi    0
			lofsa    tunnel
			send     4
			pushi    1
			pushi    4
			callb    proc0_2,  2
			ldi      2
			aTop     cycles
			jmp      code_0547
code_04eb:
			dup     
			ldi      3
			eq?     
			bnt      code_0537
			pushi    #addToFront
			pushi    1
			lofsa    tunnel
			push    
			lag      global32
			send     6
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    tunnel
			send     6
			lsg      global126
			ldi      0
			ne?     
			bt       code_0517
			pushi    1
			pushi    192
			callb    proc0_5,  2
code_0517:
			bnt      code_0521
			ldi      1
			aTop     cycles
			jmp      code_0547
code_0521:
			pushi    3
			pushi    1460
			pushi    86
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    192
			callb    proc0_6,  2
			jmp      code_0547
code_0537:
			dup     
			ldi      4
			eq?     
			bnt      code_0547
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0547:
			toss    
			ret     
		)
	)
)

(instance leave of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05a9
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    183
			pushi    99
			pushSelf
			lag      global0
			send     12
			jmp      code_0647
code_05a9:
			dup     
			ldi      1
			eq?     
			bnt      code_0602
			pushi    5
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_05c0
			ldi      28
			jmp      code_05c2
code_05c0:
			ldi      9
code_05c2:
			push    
			pushi    6
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_05d3
			ldi      6
			jmp      code_05d5
code_05d3:
			ldi      1
code_05d5:
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     30
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tunnel
			send     18
			jmp      code_0647
code_0602:
			dup     
			ldi      2
			eq?     
			bnt      code_0618
			pushi    #play
			pushi    0
			lofsa    tapestrySound
			send     4
			ldi      2
			aTop     cycles
			jmp      code_0647
code_0618:
			dup     
			ldi      3
			eq?     
			bnt      code_0635
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			pushi    #dispose
			pushi    0
			lofsa    tunnel
			send     4
			ldi      2
			aTop     cycles
			jmp      code_0647
code_0635:
			dup     
			ldi      4
			eq?     
			bnt      code_0647
			pushi    #newRoom
			pushi    1
			pushi    561
			lag      global2
			send     6
code_0647:
			toss    
			ret     
		)
	)
)

(instance abbot of Actor
	(properties
		x 269
		y 132
		z 18
		view 432
		loop 1
		priority 10
		signal $4810
		cycleSpeed 70
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06f1
			lsl      local352
			dup     
			ldi      0
			eq?     
			bnt      code_06ba
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_06ad
			pushi    2
			pushi    1460
			pushi    88
			calle    proc13_4,  4
			jmp      code_06ed
code_06ad:
			pushi    2
			pushi    1460
			pushi    87
			calle    proc13_4,  4
			jmp      code_06ed
code_06ba:
			dup     
			ldi      1
			eq?     
			bnt      code_06ce
			pushi    2
			pushi    1460
			pushi    89
			calle    proc13_4,  4
			jmp      code_06ed
code_06ce:
			dup     
			ldi      2
			eq?     
			bnt      code_06e2
			pushi    2
			pushi    1460
			pushi    90
			calle    proc13_4,  4
			jmp      code_06ed
code_06e2:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_06ed:
			toss    
			jmp      code_092d
code_06f1:
			dup     
			ldi      3
			eq?     
			bnt      code_0755
			lsl      local352
			dup     
			ldi      0
			eq?     
			bnt      code_070f
			pushi    #setScript
			pushi    1
			lofsa    tapBefore
			push    
			self     6
			jmp      code_0751
code_070f:
			dup     
			ldi      1
			eq?     
			bnt      code_0728
			pushi    2
			lea      @local199
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			jmp      code_0751
code_0728:
			dup     
			ldi      2
			eq?     
			bnt      code_0751
			pushi    1
			pushi    86
			callb    proc0_5,  2
			bnt      code_0745
			pushi    2
			pushi    1460
			pushi    120
			calle    proc13_4,  4
			jmp      code_0751
code_0745:
			pushi    #setScript
			pushi    1
			lofsa    robAbbot
			push    
			lag      global2
			send     6
code_0751:
			toss    
			jmp      code_092d
code_0755:
			dup     
			ldi      5
			eq?     
			bnt      code_080e
			lsl      local352
			dup     
			ldi      0
			eq?     
			bnt      code_0791
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_0784
			pushi    3
			lea      @local230
			push    
			lea      @local1
			push    
			pushi    9
			calle    proc851_0,  6
			jmp      code_080a
code_0784:
			pushi    #setScript
			pushi    1
			lofsa    talkBefore
			push    
			self     6
			jmp      code_080a
code_0791:
			dup     
			ldi      1
			eq?     
			bnt      code_07f8
			lsl      local351
			ldi      4
			gt?     
			bnt      code_07af
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
			jmp      code_080a
code_07af:
			pushi    #seconds
			pushi    0
			lofsa    drinkingMatch
			send     4
			bt       code_07c4
			pushi    #cycles
			pushi    0
			lofsa    drinkingMatch
			send     4
code_07c4:
			bnt      code_07e8
			pushi    #script
			pushi    0
			lofsa    drinkingMatch
			send     4
			not     
			bnt      code_07e8
			pushi    #setScript
			pushi    2
			lofsa    prodAbbot
			push    
			lofsa    drinkingMatch
			push    
			lofsa    drinkingMatch
			send     8
			jmp      code_080a
code_07e8:
			pushi    3
			pushi    1460
			pushi    205
			pushi    1
			calle    proc13_4,  6
			jmp      code_080a
code_07f8:
			dup     
			ldi      2
			eq?     
			bnt      code_080a
			pushi    2
			pushi    1460
			pushi    167
			calle    proc13_4,  4
code_080a:
			toss    
			jmp      code_092d
code_080e:
			dup     
			ldi      4
			eq?     
			bnt      code_0922
			lsp      param2
			ldi      0
			eq?     
			bnt      code_0875
			lsl      local352
			dup     
			ldi      1
			eq?     
			bnt      code_085f
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			lsl      local360
			pushi    #taken
			pushi    0
			lag      global133
			send     4
			add     
			sal      local360
			lsl      local361
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			add     
			sal      local361
			lsl      local362
			pushi    #taken
			pushi    0
			lag      global135
			send     4
			add     
			sal      local362
			ret     
			jmp      code_0874
code_085f:
			dup     
			ldi      2
			eq?     
			bnt      code_0874
			pushi    3
			pushi    1460
			pushi    168
			pushi    1
			calle    proc13_4,  6
			ret     
code_0874:
			toss    
code_0875:
			lsl      local352
			ldi      2
			eq?     
			bnt      code_088a
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
			ret     
code_088a:
			pushi    #register
			pushi    1
			lsp      param2
			lofsa    giveIt
			send     6
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_08a1
			jmp      code_08f6
code_08a1:
			dup     
			ldi      2
			eq?     
			bnt      code_08ab
			jmp      code_08f6
code_08ab:
			dup     
			ldi      14
			eq?     
			bnt      code_08b5
			jmp      code_08f6
code_08b5:
			dup     
			ldi      11
			eq?     
			bnt      code_08bf
			jmp      code_08f6
code_08bf:
			dup     
			ldi      18
			eq?     
			bnt      code_08c9
			jmp      code_08f6
code_08c9:
			dup     
			ldi      13
			eq?     
			bnt      code_08ea
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_08f6
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
			ret     
			jmp      code_08f6
code_08ea:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
			ret     
code_08f6:
			toss    
			lsl      local352
			ldi      1
			eq?     
			bnt      code_090a
			pushi    #cue
			pushi    0
			lofsa    giveIt
			send     4
			ret     
code_090a:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    251
			pushi    126
			lofsa    giveIt
			push    
			lag      global0
			send     12
			jmp      code_092d
code_0922:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_092d:
			toss    
			ret     
		)
	)
)

(instance giveIt of Script
	(properties)
	
	(method (cue)
		(asm
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_0a08
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			lsl      local360
			pushi    #taken
			pushi    0
			lag      global133
			send     4
			add     
			sal      local360
			lsl      local361
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			add     
			sal      local361
			lsl      local362
			pushi    #taken
			pushi    0
			lag      global135
			send     4
			add     
			sal      local362
			pushi    2
			lea      @local346
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			ret     
			jmp      code_0ab8
code_0a08:
			dup     
			ldi      2
			eq?     
			bnt      code_0a3c
			pushi    1
			pushi    65336
			calle    proc806_1,  2
			pushi    3
			lea      @local298
			push    
			lea      @local1
			push    
			pushi    999
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    2
			lsg      global11
			lag      global0
			send     8
			jmp      code_0ab8
code_0a3c:
			dup     
			ldi      14
			eq?     
			bnt      code_0a6c
			pushi    1
			pushi    65511
			calle    proc806_1,  2
			pushi    2
			lea      @local305
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			pushi    #put
			pushi    2
			pushi    14
			lsg      global11
			lag      global0
			send     8
			jmp      code_0ab8
code_0a6c:
			dup     
			ldi      11
			eq?     
			bnt      code_0a87
			pushi    2
			lea      @local310
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			jmp      code_0ab8
code_0a87:
			dup     
			ldi      13
			eq?     
			bnt      code_0a9d
			pushi    #setScript
			pushi    1
			lofsa    giveRobes
			push    
			lag      global2
			send     6
			jmp      code_0ab8
code_0a9d:
			dup     
			ldi      18
			eq?     
			bnt      code_0ab8
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local315
			push    
			lag      global2
			send     10
code_0ab8:
			toss    
			ret     
		)
	)
)

(instance waterDeath of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b17
			pushi    0
			callb    proc0_3,  0
			pushi    4
			pTos     register
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0b3d
code_0b17:
			dup     
			ldi      1
			eq?     
			bnt      code_0b3d
			pTos     register
			lea      @local315
			eq?     
			bnt      code_0b2e
			ldi      18
			jmp      code_0b30
code_0b2e:
			ldi      17
code_0b30:
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0b3d:
			toss    
			ret     
		)
	)
)

(instance giveRobes of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bbf
			pushi    0
			callb    proc0_3,  0
			lsg      global115
			ldi      1
			eq?     
			bnt      code_0ba7
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local325
			push    
			lag      global2
			send     10
			ret     
code_0ba7:
			pushi    4
			lea      @local335
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_0cf5
code_0bbf:
			dup     
			ldi      1
			eq?     
			bnt      code_0c0d
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    243
			pushi    114
			pushSelf
			lag      global0
			send     12
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    316
			pushi    106
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    289
			pushi    105
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			send     4
			aTop     register
			send     30
			jmp      code_0cf5
code_0c0d:
			dup     
			ldi      2
			eq?     
			bnt      code_0c17
			jmp      code_0cf5
code_0c17:
			dup     
			ldi      3
			eq?     
			bnt      code_0c2d
			pushi    3
			lsg      global0
			lofsa    abbot
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0cf5
code_0c2d:
			dup     
			ldi      4
			eq?     
			bnt      code_0c5d
			pushi    3
			lea      @local341
			push    
			lea      @local1
			push    
			pushi    10
			calle    proc851_0,  6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    256
			pushi    122
			pushSelf
			pToa     register
			send     12
			jmp      code_0cf5
code_0c5d:
			dup     
			ldi      5
			eq?     
			bnt      code_0c8b
			pushi    #loop
			pushi    1
			pushi    2
			pToa     register
			send     6
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    abbot
			send     26
			jmp      code_0cf5
code_0c8b:
			dup     
			ldi      6
			eq?     
			bnt      code_0ccf
			pushi    #put
			pushi    2
			pushi    13
			pushi    456
			lag      global0
			send     8
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    316
			pushi    120
			lofsa    goAway
			push    
			pToa     register
			send     12
			pushi    #register
			pushi    1
			pTos     register
			lofsa    goAway
			send     6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    abbot
			send     8
			jmp      code_0cf5
code_0ccf:
			dup     
			ldi      7
			eq?     
			bnt      code_0cf5
			pushi    #loop
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			pushi    70
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    abbot
			send     18
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0cf5:
			toss    
			ret     
		)
	)
)

(instance caskV of View
	(properties
		x 252
		y 131
		z 7
		view 28
		loop 10
		cel 1
		priority 11
		signal $4111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d75
			pushi    1
			pushi    30
			callb    proc0_5,  2
			not     
			bnt      code_0d52
			pushi    2
			pushi    1460
			pushi    100
			calle    proc13_4,  4
			jmp      code_0e2a
code_0d52:
			lsl      local352
			ldi      0
			eq?     
			bnt      code_0d68
			pushi    2
			pushi    1460
			pushi    101
			calle    proc13_4,  4
			jmp      code_0e2a
code_0d68:
			pushi    2
			pushi    1460
			pushi    102
			calle    proc13_4,  4
			jmp      code_0e2a
code_0d75:
			dup     
			ldi      3
			eq?     
			bnt      code_0df2
			lsl      local352
			dup     
			ldi      0
			eq?     
			bnt      code_0dad
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_0d9e
			pushi    #setScript
			pushi    1
			lofsa    grabCask
			push    
			lag      global2
			send     6
			jmp      code_0dee
code_0d9e:
			pushi    #setScript
			pushi    1
			lofsa    tryToGrabCask
			push    
			lag      global2
			send     6
			jmp      code_0dee
code_0dad:
			dup     
			ldi      1
			eq?     
			bnt      code_0ddb
			lal      local354
			bnt      code_0dcb
			pushi    #seconds
			pushi    1
			pushi    0
			pushi    141
			pushi    0
			lofsa    drinkingMatch
			send     10
			jmp      code_0dee
code_0dcb:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    View,  8
			jmp      code_0dee
code_0ddb:
			dup     
			ldi      2
			eq?     
			bnt      code_0dee
			pushi    #setScript
			pushi    1
			lofsa    grabCask
			push    
			lag      global2
			send     6
code_0dee:
			toss    
			jmp      code_0e2a
code_0df2:
			dup     
			ldi      4
			eq?     
			bnt      code_0e1f
			lsp      param2
			ldi      14
			eq?     
			bnt      code_0e11
			pushi    3
			pushi    1460
			pushi    189
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e2a
code_0e11:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    View,  8
			jmp      code_0e2a
code_0e1f:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    View,  8
code_0e2a:
			toss    
			ret     
		)
	)
)

(instance chair of PicView
	(properties
		x 235
		y 131
		lookStr 105
		view 460
		loop 2
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0ebd
			lal      local353
			not     
			bnt      code_0eaf
			pushi    #setScript
			pushi    1
			lofsa    tryToSit
			push    
			lag      global2
			send     6
			jmp      code_0ec8
code_0eaf:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    PicView,  8
			jmp      code_0ec8
code_0ebd:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    PicView,  8
code_0ec8:
			toss    
			ret     
		)
	)
)

(instance chrPoly of Polygon
	(properties
		size 4
	)
)

(instance aMug of View
	(properties
		view 28
	)
)

(instance rMug of View
	(properties
		x 244
		y 132
		z 16
		view 28
		loop 10
		priority 10
		signal $4111
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ff4
			lsl      local352
			dup     
			ldi      0
			eq?     
			bnt      code_0fb6
			pushi    2
			pushi    1460
			pushi    95
			calle    proc13_4,  4
			jmp      code_0ff0
code_0fb6:
			dup     
			ldi      1
			eq?     
			bnt      code_0fca
			pushi    2
			pushi    1460
			pushi    96
			calle    proc13_4,  4
			jmp      code_0ff0
code_0fca:
			dup     
			ldi      2
			eq?     
			bnt      code_0ff0
			lal      local353
			bnt      code_0fe6
			pushi    #setScript
			pushi    1
			lofsa    lInRMug
			push    
			lag      global2
			send     6
			jmp      code_0ff0
code_0fe6:
			pushi    2
			pushi    1460
			pushi    99
			calle    proc13_4,  4
code_0ff0:
			toss    
			jmp      code_10e1
code_0ff4:
			dup     
			ldi      3
			eq?     
			bnt      code_1075
			lsl      local352
			dup     
			ldi      0
			eq?     
			bnt      code_1031
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_1022
			pushi    2
			lea      @local294
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			jmp      code_1071
code_1022:
			pushi    #setScript
			pushi    1
			lofsa    mugBefore
			push    
			lag      global2
			send     6
			jmp      code_1071
code_1031:
			dup     
			ldi      1
			eq?     
			bnt      code_105f
			lal      local354
			bnt      code_104f
			pushi    #seconds
			pushi    1
			pushi    0
			pushi    141
			pushi    0
			lofsa    drinkingMatch
			send     10
			jmp      code_1071
code_104f:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    View,  8
			jmp      code_1071
code_105f:
			dup     
			ldi      2
			eq?     
			bnt      code_1071
			pushi    2
			pushi    1460
			pushi    139
			calle    proc13_4,  4
code_1071:
			toss    
			jmp      code_10e1
code_1075:
			dup     
			ldi      4
			eq?     
			bnt      code_10d6
			lsp      param2
			ldi      14
			eq?     
			bnt      code_10c8
			lsl      local352
			ldi      1
			eq?     
			bnt      code_10b8
			pushi    #put
			pushi    2
			pushi    14
			lofsa    rMug
			push    
			lag      global0
			send     8
			pushi    #setScript
			pushi    2
			lofsa    dropInDrink
			push    
			lofsa    drinkingMatch
			push    
			lofsa    drinkingMatch
			send     8
			pushi    1
			pushi    50
			calle    proc806_1,  2
			jmp      code_10e1
code_10b8:
			pushi    3
			pushi    1460
			pushi    188
			pushi    1
			calle    proc13_4,  6
			jmp      code_10e1
code_10c8:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    View,  8
			jmp      code_10e1
code_10d6:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    View,  8
code_10e1:
			toss    
			ret     
		)
	)
)

(instance tunnel of Prop
	(properties
		x 182
		y 98
		nsTop 44
		nsLeft 167
		nsBottom 99
		nsRight 198
		view 460
		loop 1
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_1168
			lsl      local352
			ldi      1
			ne?     
			bnt      code_1168
			pushi    #setScript
			pushi    1
			lofsa    leave
			push    
			lag      global2
			send     6
			jmp      code_1175
code_1168:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    tapestry
			send     8
code_1175:
			ret     
		)
	)
)

(instance fire of Prop
	(properties
		x 75
		y 120
		lookStr 109
		view 460
		signal $4000
	)
)

(instance tapestry of Feature
	(properties
		nsTop 10
		nsLeft 173
		nsBottom 98
		nsRight 302
		lookStr 107
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			ne?     
			bt       code_125a
			pushi    #script
			pushi    0
			lag      global2
			send     4
code_125a:
			bnt      code_126b
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
			jmp      code_1277
code_126b:
			pushi    #setScript
			pushi    1
			lofsa    feelTap
			push    
			lag      global2
			send     6
code_1277:
			ret     
		)
	)
)

(instance feelTap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12e1
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    224
			pushi    101
			pushSelf
			lag      global0
			send     12
			jmp      code_134f
code_12e1:
			dup     
			ldi      1
			eq?     
			bnt      code_1321
			pushi    1
			pushi    7
			callb    proc0_2,  2
			pushi    3
			pushi    1460
			pushi    121
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    30
			callb    proc0_5,  2
			not     
			bt       code_1319
			lsl      local352
			ldi      2
			eq?     
			bt       code_1319
			pushi    #contains
			pushi    1
			lofsa    abbot
			push    
			lag      global5
			send     6
			not     
code_1319:
			bnt      code_134f
			ipToa    state
			jmp      code_134f
code_1321:
			dup     
			ldi      2
			eq?     
			bnt      code_133f
			pushi    4
			lea      @local331
			push    
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_134f
code_133f:
			dup     
			ldi      3
			eq?     
			bnt      code_134f
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_134f:
			toss    
			ret     
		)
	)
)

(instance tables of Feature
	(properties
		onMeCheck $0002
		lookStr 104
	)
)

(instance walls of Feature
	(properties
		onMeCheck $0001
		lookStr 103
	)
)

(instance lChairs of Feature
	(properties
		y 126
		onMeCheck $0004
		lookStr 105
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_144e
			lsl      local352
			ldi      0
			ne?     
			bnt      code_1426
			pushi    3
			pushi    1460
			pushi    141
			pushi    1
			calle    proc13_4,  6
			jmp      code_1459
code_1426:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_143e
			pushi    3
			pushi    1460
			pushi    142
			pushi    1
			calle    proc13_4,  6
			jmp      code_1459
code_143e:
			pushi    3
			pushi    1460
			pushi    140
			pushi    1
			calle    proc13_4,  6
			jmp      code_1459
code_144e:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1459:
			toss    
			ret     
		)
	)
)

(instance rChairs of Feature
	(properties
		y 172
		onMeCheck $0040
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    lChairs
			send     8
			ret     
		)
	)
)

(instance windows of Feature
	(properties
		onMeCheck $0008
		lookStr 108
	)
)

(instance abbotsChair of Feature
	(properties
		onMeCheck $0010
		lookStr 143
	)
)

(instance arthur of Feature
	(properties
		y 99
		onMeCheck $0020
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_15a9
			lsp      param2
			ldi      2
			eq?     
			bnt      code_15a9
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_15a9
			pushi    8
			pushi    3
			lea      @local282
			push    
			lea      @local19
			push    
			pushi    0
			lea      @local22
			push    
			pushi    3
			lea      @local25
			push    
			pushi    2
			calle    proc851_0,  16
			jmp      code_15b6
code_15a9:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    tapestry
			send     8
code_15b6:
			ret     
		)
	)
)

(instance tryToSit of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1621
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    251
			pushi    126
			pushSelf
			lag      global0
			send     12
			jmp      code_1778
code_1621:
			dup     
			ldi      1
			eq?     
			bnt      code_1650
			pushi    #view
			pushi    1
			pushi    28
			pushi    219
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    9
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     38
			jmp      code_1778
code_1650:
			dup     
			ldi      2
			eq?     
			bnt      code_16d4
			lsl      local352
			ldi      2
			eq?     
			bnt      code_1695
			ldi      1
			sal      local353
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    10
			pushi    284
			pushi    2
			pushi    243
			pushi    113
			pushi    142
			pushi    1
			lofsa    waitToStand
			push    
			lag      global0
			send     32
			pushi    #dispose
			pushi    0
			lofsa    rMug
			send     4
			ldi      2
			aTop     cycles
			ret     
code_1695:
			lsg      global115
			ldi      1
			eq?     
			bnt      code_16b0
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			self     10
			ret     
code_16b0:
			pushi    4
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_16c1
			lea      @local213
			jmp      code_16c4
code_16c1:
			lea      @local203
code_16c4:
			push    
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1778
code_16d4:
			dup     
			ldi      3
			eq?     
			bnt      code_1723
			lsl      local352
			ldi      2
			eq?     
			bnt      code_1704
			pushi    #signal
			pushi    1
			pushi    16657
			lofsa    rMug
			send     6
			pushi    #add
			pushi    1
			lofsa    rMug
			push    
			lag      global32
			send     6
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
			ret     
code_1704:
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_1778
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_1778
code_1723:
			dup     
			ldi      4
			eq?     
			bnt      code_1741
			pushi    5
			lea      @local208
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1778
code_1741:
			dup     
			ldi      5
			eq?     
			bnt      code_1764
			pushi    4
			lea      @local28
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			pushi    1
			pushi    30
			callb    proc0_6,  2
			jmp      code_1778
code_1764:
			dup     
			ldi      6
			eq?     
			bnt      code_1778
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1778:
			toss    
			ret     
		)
	)
)

(instance tapBefore of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17da
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    245
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_1866
code_17da:
			dup     
			ldi      1
			eq?     
			bnt      code_1833
			lsg      global115
			ldi      1
			eq?     
			bnt      code_17fc
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			self     10
			ret     
code_17fc:
			pushi    1
			pushi    30
			callb    proc0_5,  2
			bnt      code_181c
			pushi    4
			lea      @local195
			push    
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			ipToa    state
			jmp      code_1866
code_181c:
			pushi    5
			lea      @local190
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1866
code_1833:
			dup     
			ldi      2
			eq?     
			bnt      code_1856
			pushi    4
			lea      @local28
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			pushi    1
			pushi    30
			callb    proc0_6,  2
			jmp      code_1866
code_1856:
			dup     
			ldi      3
			eq?     
			bnt      code_1866
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1866:
			toss    
			ret     
		)
	)
)

(instance mugBefore of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18c8
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    245
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_1936
code_18c8:
			dup     
			ldi      1
			eq?     
			bnt      code_1903
			lsg      global115
			ldi      1
			eq?     
			bnt      code_18ea
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			self     10
			ret     
code_18ea:
			pushi    5
			lea      @local289
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1936
code_1903:
			dup     
			ldi      2
			eq?     
			bnt      code_1920
			pushi    4
			lea      @local28
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_1936
code_1920:
			dup     
			ldi      3
			eq?     
			bnt      code_1936
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    30
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1936:
			toss    
			ret     
		)
	)
)

(instance talkBefore of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1997
			pushi    5
			lea      @local225
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_19bb
code_1997:
			dup     
			ldi      1
			eq?     
			bnt      code_19bb
			pushi    3
			lea      @local28
			push    
			lea      @local1
			push    
			pushi    9
			calle    proc851_0,  6
			pushi    1
			pushi    30
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_19bb:
			toss    
			ret     
		)
	)
)

(instance tryToGrabCask of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a1e
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    245
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_1af0
code_1a1e:
			dup     
			ldi      1
			eq?     
			bnt      code_1a55
			lsg      global115
			ldi      1
			eq?     
			bnt      code_1a40
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			self     10
			ret     
code_1a40:
			pushi    4
			lea      @local217
			push    
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1af0
code_1a55:
			dup     
			ldi      2
			eq?     
			bnt      code_1a76
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    4
			lofsa    abbot
			send     18
			ldi      3
			aTop     seconds
			jmp      code_1af0
code_1a76:
			dup     
			ldi      3
			eq?     
			bnt      code_1a8f
			pushi    #setCel
			pushi    1
			pushi    3
			lofsa    abbot
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1af0
code_1a8f:
			dup     
			ldi      4
			eq?     
			bnt      code_1aad
			pushi    5
			lea      @local221
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1af0
code_1aad:
			dup     
			ldi      5
			eq?     
			bnt      code_1aca
			pushi    4
			lea      @local28
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_1af0
code_1aca:
			dup     
			ldi      6
			eq?     
			bnt      code_1af0
			pushi    #loop
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    abbot
			send     12
			pushi    1
			pushi    30
			callb    proc0_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1af0:
			toss    
			ret     
		)
	)
)

(instance grabCask of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b52
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    245
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_1c12
code_1b52:
			dup     
			ldi      1
			eq?     
			bnt      code_1bac
			lsg      global115
			ldi      1
			eq?     
			bnt      code_1b74
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			self     10
			ret     
code_1b74:
			pushi    #view
			pushi    1
			pushi    28
			pushi    162
			pushi    1
			pushi    8
			lag      global0
			send     12
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			pushi    219
			pushi    1
			pushi    10
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     20
			pushi    #dispose
			pushi    0
			lofsa    caskV
			send     4
			jmp      code_1c12
code_1bac:
			dup     
			ldi      2
			eq?     
			bnt      code_1c02
			pushi    #cycleSpeed
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lag      global0
			send     4
			push    
			pushi    327
			pushi    1
			pushi    11
			lag      global0
			send     12
			lsl      local352
			ldi      2
			eq?     
			bnt      code_1be2
			pushi    3
			pushi    1460
			pushi    131
			pushSelf
			calle    proc13_4,  6
			jmp      code_1bef
code_1be2:
			pushi    1
			pushi    25
			calle    proc806_1,  2
			ldi      1
			aTop     cycles
code_1bef:
			pushi    0
			callb    proc0_2,  0
			pushi    #doit
			pushi    0
			pushi    #looper
			pushi    0
			lag      global0
			send     4
			send     4
			jmp      code_1c12
code_1c02:
			dup     
			ldi      3
			eq?     
			bnt      code_1c12
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1c12:
			toss    
			ret     
		)
	)
)

(instance drinkingMatch of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c65
			pushi    0
			callb    proc0_3,  0
			ldi      3
			aTop     cycles
			jmp      code_20b1
code_1c65:
			dup     
			ldi      1
			eq?     
			bnt      code_1c82
			pushi    4
			lea      @local67
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_20b1
code_1c82:
			dup     
			ldi      2
			eq?     
			bnt      code_1c9e
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    251
			pushi    126
			pushSelf
			lag      global0
			send     12
			jmp      code_20b1
code_1c9e:
			dup     
			ldi      3
			eq?     
			bnt      code_1cc9
			pushi    #view
			pushi    1
			pushi    28
			pushi    162
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    10
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     32
			jmp      code_20b1
code_1cc9:
			dup     
			ldi      4
			eq?     
			bnt      code_1cef
			pushi    #init
			pushi    0
			lofsa    caskV
			send     4
			pushi    #put
			pushi    2
			pushi    11
			lsg      global11
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     14
			ldi      1
			aTop     cycles
			jmp      code_20b1
code_1cef:
			dup     
			ldi      5
			eq?     
			bnt      code_1d2a
			lsg      global115
			ldi      1
			eq?     
			bnt      code_1d13
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local325
			push    
			lag      global2
			send     10
			ret     
code_1d13:
			pushi    5
			lea      @local74
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_20b1
code_1d2a:
			dup     
			ldi      6
			eq?     
			bnt      code_1d4c
			ldi      1
			aTop     notKilled
			pushi    5
			lea      @local78
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_20b1
code_1d4c:
			dup     
			ldi      7
			eq?     
			bnt      code_1db6
			pushi    0
			calle    proc851_1,  0
			bnt      code_1d73
			pushi    4
			lea      @local97
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_20b1
code_1d73:
			pushi    3
			lea      @local82
			push    
			lea      @local1
			push    
			pushi    9
			calle    proc851_0,  6
			pushi    0
			callb    proc0_2,  0
			pushi    #cycleSpeed
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lag      global0
			send     4
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    150
			pushi    200
			pushSelf
			lag      global0
			send     18
			pushi    1
			pushi    33
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_20b1
code_1db6:
			dup     
			ldi      8
			eq?     
			bnt      code_1de2
			ldi      1
			sal      local353
			pushi    #loop
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    9
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     24
			ldi      20
			aTop     ticks
			jmp      code_20b1
code_1de2:
			dup     
			ldi      9
			eq?     
			bnt      code_1e27
			pushi    #view
			pushi    1
			pushi    28
			lag      global109
			send     6
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    316
			pushi    106
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    289
			pushi    105
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			send     4
			aTop     register
			send     30
			jmp      code_20b1
code_1e27:
			dup     
			ldi      10
			eq?     
			bnt      code_1e55
			pushi    3
			lea      @local101
			push    
			lea      @local1
			push    
			pushi    10
			calle    proc851_0,  6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    256
			pushi    122
			pushSelf
			pToa     register
			send     12
			jmp      code_20b1
code_1e55:
			dup     
			ldi      11
			eq?     
			bnt      code_1e7b
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    abbot
			send     26
			jmp      code_20b1
code_1e7b:
			dup     
			ldi      12
			eq?     
			bnt      code_1ec4
			pushi    #moveTo
			pushi    1
			pushi    470
			pushi    #at
			pushi    1
			pushi    12
			lag      global9
			send     6
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    316
			pushi    120
			lofsa    goAway
			push    
			pToa     register
			send     12
			pushi    #register
			pushi    1
			pTos     register
			lofsa    goAway
			send     6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    abbot
			send     8
			jmp      code_20b1
code_1ec4:
			dup     
			ldi      13
			eq?     
			bnt      code_1f0d
			ldi      1
			aTop     notKilled
			pushi    2
			lea      @local108
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			ldi      0
			aTop     register
			pushi    #posn
			pushi    2
			pushi    243
			pushi    113
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    10
			lag      global0
			send     26
			pushi    #dispose
			pushi    0
			lofsa    rMug
			send     4
			ldi      2
			aTop     cycles
			jmp      code_20b1
code_1f0d:
			dup     
			ldi      14
			eq?     
			bnt      code_1f42
			pushi    #add
			pushi    1
			lofsa    rMug
			push    
			lag      global32
			send     6
			ldi      1
			sal      local352
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ldi      1
			aTop     cycles
			jmp      code_20b1
code_1f42:
			dup     
			ldi      15
			eq?     
			bnt      code_1f75
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    4
			lofsa    abbot
			send     12
			ldi      2
			aTop     seconds
			jmp      code_20b1
code_1f75:
			dup     
			ldi      16
			eq?     
			bnt      code_1f8d
			pushi    #cel
			pushi    1
			pushi    3
			lofsa    abbot
			send     6
			ldi      12
			aTop     ticks
			jmp      code_20b1
code_1f8d:
			dup     
			ldi      17
			eq?     
			bnt      code_1fb6
			pToa     script
			bnt      code_1f9c
			dpToa    state
			ret     
code_1f9c:
			pushi    #signal
			pushi    1
			pushi    8
			lofsa    rMug
			send     6
			pushi    #setCel
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      60
			aTop     ticks
			jmp      code_20b1
code_1fb6:
			dup     
			ldi      18
			eq?     
			bnt      code_200e
			pTos     register
			ldi      4
			eq?     
			bnt      code_1feb
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    14
			class    Inv
			send     6
			send     4
			push    
			lofsa    rMug
			ne?     
			bnt      code_1feb
			pushi    #setScript
			pushi    1
			lofsa    rPassOut
			push    
			lag      global2
			send     6
			jmp      code_20b1
code_1feb:
			pushi    #cycleSpeed
			pushi    1
			pushi    10
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    abbot
			send     6
			ipToa    register
			jmp      code_20b1
code_200e:
			dup     
			ldi      19
			eq?     
			bnt      code_2038
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lag      global0
			send     12
			pushi    #setCycle
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    1
			lofsa    abbot
			send     10
			jmp      code_20b1
code_2038:
			dup     
			ldi      20
			eq?     
			bnt      code_205e
			pushi    #play
			pushi    0
			lofsa    mugSound
			send     4
			pushi    #signal
			pushi    1
			pushi    26897
			lofsa    rMug
			send     6
			ldi      1
			sal      local354
			ldi      5
			aTop     seconds
			jmp      code_20b1
code_205e:
			dup     
			ldi      21
			eq?     
			bnt      code_20b1
			pToa     script
			bnt      code_206d
			dpToa    state
			ret     
code_206d:
			ldi      0
			sal      local354
			pushi    0
			callb    proc0_3,  0
			lag      global25
			bnt      code_2080
			pushi    #dispose
			pushi    0
			send     4
code_2080:
			pTos     register
			ldi      6
			eq?     
			bnt      code_2097
			pushi    #setScript
			pushi    1
			lofsa    aPassOut
			push    
			lag      global2
			send     6
			jmp      code_20b1
code_2097:
			pushi    2
			lea      @local112
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			pTos     state
			ldi      7
			sub     
			aTop     state
			ldi      1
			aTop     cycles
code_20b1:
			toss    
			ret     
		)
	)
)

(instance goAway of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
			ret     
		)
	)
)

(instance dropInDrink of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2159
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local269
			push    
			pushi    9
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_2296
code_2159:
			dup     
			ldi      1
			eq?     
			bnt      code_2167
			ldi      1
			aTop     cycles
			jmp      code_2296
code_2167:
			dup     
			ldi      2
			eq?     
			bnt      code_2175
			ldi      30
			aTop     ticks
			jmp      code_2296
code_2175:
			dup     
			ldi      3
			eq?     
			bnt      code_219a
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			dup     
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    abbot
			send     26
			jmp      code_2296
code_219a:
			dup     
			ldi      4
			eq?     
			bnt      code_21c4
			pushi    #cycleSpeed
			pushi    1
			pushi    15
			pushi    162
			pushi    1
			pushi    7
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_2296
code_21c4:
			dup     
			ldi      5
			eq?     
			bnt      code_21da
			pushi    #play
			pushi    0
			lofsa    plopSound
			send     4
			ldi      45
			aTop     ticks
			jmp      code_2296
code_21da:
			dup     
			ldi      6
			eq?     
			bnt      code_21f8
			pushi    4
			lea      @local273
			push    
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2296
code_21f8:
			dup     
			ldi      7
			eq?     
			bnt      code_220f
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    abbot
			send     8
			jmp      code_2296
code_220f:
			dup     
			ldi      8
			eq?     
			bnt      code_221d
			ldi      30
			aTop     ticks
			jmp      code_2296
code_221d:
			dup     
			ldi      9
			eq?     
			bnt      code_225e
			pushi    4
			lea      @local277
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    1
			lag      global0
			send     12
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    11
			lofsa    abbot
			send     18
			jmp      code_2296
code_225e:
			dup     
			ldi      10
			eq?     
			bnt      code_226c
			ldi      2
			aTop     seconds
			jmp      code_2296
code_226c:
			dup     
			ldi      11
			eq?     
			bnt      code_2296
			pushi    #seconds
			pushi    0
			pToa     client
			send     4
			bt       code_2286
			pushi    #cycles
			pushi    0
			pToa     client
			send     4
code_2286:
			bnt      code_228d
			ldi      0
			aTop     caller
code_228d:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2296:
			toss    
			ret     
		)
	)
)

(instance aPassOut of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2306
			pushi    1
			pushi    31
			callb    proc0_7,  2
			pushi    1
			pushi    117
			callb    proc0_6,  2
			ldi      2
			sal      local352
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local129
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_23ac
code_2306:
			dup     
			ldi      1
			eq?     
			bnt      code_231d
			lsg      global86
			pushi    0
			callk    GetTime,  0
			add     
			aTop     lastTicks
			ldi      20
			aTop     ticks
			jmp      code_23ac
code_231d:
			dup     
			ldi      2
			eq?     
			bnt      code_233e
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    abbot
			send     20
			jmp      code_23ac
code_233e:
			dup     
			ldi      3
			eq?     
			bnt      code_2365
			pushi    #play
			pushi    0
			lofsa    mugSound
			send     4
			pushi    #setScript
			pushi    1
			lofsa    snoreScript
			push    
			lofsa    abbot
			send     6
			ldi      20
			aTop     ticks
			ldi      1
			aTop     notKilled
			jmp      code_23ac
code_2365:
			dup     
			ldi      4
			eq?     
			bnt      code_2383
			pushi    5
			pushi    1
			lea      @local133
			push    
			lea      @local10
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_23ac
code_2383:
			dup     
			ldi      5
			eq?     
			bnt      code_23ac
			pushi    2
			lea      @local137
			push    
			pushi    9
			calle    proc851_0,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #setScript
			pushi    1
			lofsa    waitToStand
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_23ac:
			toss    
			ret     
		)
	)
)

(instance waitToStand of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_2513
			pushi    #cue
			pushi    0
			self     4
code_2513:
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_2459
			ldi      0
			sal      local353
			pushi    0
			callb    proc0_3,  0
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			aTop     register
			pushi    #mover
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    65535
			pushi    284
			pushi    2
			pushi    248
			pushi    128
			pushi    162
			pushi    1
			pushi    9
			lag      global0
			send     26
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			pushi    219
			pushi    1
			pushi    10
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     20
			pushi    #delete
			pushi    1
			lofsa    rMug
			push    
			lag      global32
			send     6
			pushi    #init
			pushi    0
			lofsa    rMug
			send     4
			jmp      code_2501
code_2459:
			dup     
			ldi      2
			eq?     
			bnt      code_2481
			pushi    #cycleSpeed
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lag      global0
			send     4
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    251
			pushi    126
			pushSelf
			lag      global0
			send     18
			jmp      code_2501
code_2481:
			dup     
			ldi      3
			eq?     
			bnt      code_2501
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pToa     register
			bnt      code_24ce
			pushi    #isMemberOf
			pushi    1
			class    PolyPath
			push    
			pToa     register
			send     6
			bnt      code_24ce
			pushi    #mover
			pushi    1
			pTos     register
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #finalX
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #finalY
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #caller
			pushi    0
			pToa     register
			send     4
			push    
			lag      global0
			send     18
			jmp      code_24f8
code_24ce:
			pushi    #mover
			pushi    1
			pTos     register
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #caller
			pushi    0
			pToa     register
			send     4
			push    
			lag      global0
			send     18
code_24f8:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2501:
			toss    
			ret     
		)
	)
)

(instance rPassOut of Script
	(properties)
	
	(method (doit)
		(asm
			lal      local0
			not     
			bnt      code_2572
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_2572
			pushi    #play
			pushi    0
			lofsa    mugSound
			send     4
			ldi      1
			sal      local0
code_2572:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_259c
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local116
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_26bc
code_259c:
			dup     
			ldi      1
			eq?     
			bnt      code_25f1
			pushi    #cycleSpeed
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     24
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    316
			pushi    106
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    289
			pushi    105
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			send     4
			aTop     register
			send     30
			jmp      code_26bc
code_25f1:
			dup     
			ldi      2
			eq?     
			bnt      code_262a
			pushi    2
			lea      @local120
			push    
			lea      @local1
			push    
			calle    proc851_0,  4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    255
			pushi    130
			pushSelf
			pToa     register
			send     12
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    abbot
			send     8
			jmp      code_26bc
code_262a:
			dup     
			ldi      3
			eq?     
			bnt      code_2644
			pushi    #setCycle
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    1
			lofsa    abbot
			send     10
			jmp      code_26bc
code_2644:
			dup     
			ldi      4
			eq?     
			bnt      code_267f
			pushi    #view
			pushi    1
			pushi    28
			pushi    162
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     register
			send     26
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_26bc
code_267f:
			dup     
			ldi      5
			eq?     
			bnt      code_2689
			jmp      code_26bc
code_2689:
			dup     
			ldi      6
			eq?     
			bnt      code_26a6
			pushi    4
			lea      @local124
			push    
			pushi    10
			lea      @local1
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_26bc
code_26a6:
			dup     
			ldi      7
			eq?     
			bnt      code_26bc
			ldi      16
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_26bc:
			toss    
			ret     
		)
	)
)

(instance prodAbbot of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_27ab
			lsl      local351
			dup     
			ldi      0
			eq?     
			bnt      code_2728
			pushi    4
			lea      @local236
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_27a4
code_2728:
			dup     
			ldi      1
			eq?     
			bnt      code_2745
			pushi    4
			lea      @local241
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_27a4
code_2745:
			dup     
			ldi      2
			eq?     
			bnt      code_2762
			pushi    4
			lea      @local247
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_27a4
code_2762:
			dup     
			ldi      3
			eq?     
			bnt      code_277f
			pushi    4
			lea      @local255
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_27a4
code_277f:
			dup     
			ldi      4
			eq?     
			bnt      code_27a4
			pushi    4
			lea      @local261
			push    
			lea      @local1
			push    
			pushi    9
			pushSelf
			calle    proc851_0,  8
			pushi    1
			pushi    25
			calle    proc806_1,  2
code_27a4:
			toss    
			+al      local351
			jmp      code_27df
code_27ab:
			dup     
			ldi      1
			eq?     
			bnt      code_27b9
			ldi      2
			aTop     seconds
			jmp      code_27df
code_27b9:
			dup     
			ldi      2
			eq?     
			bnt      code_27df
			pushi    #seconds
			pushi    0
			pToa     client
			send     4
			bt       code_27d3
			pushi    #cycles
			pushi    0
			pToa     client
			send     4
code_27d3:
			bnt      code_27da
			ldi      0
			aTop     caller
code_27da:
			pushi    #dispose
			pushi    0
			self     4
code_27df:
			toss    
			ret     
		)
	)
)

(instance robAbbot of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_283b
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1460
			pushi    117
			pushSelf
			calle    proc13_4,  6
			jmp      code_29b7
code_283b:
			dup     
			ldi      1
			eq?     
			bnt      code_28a1
			lal      local353
			bnt      code_284f
			pTos     state
			ldi      2
			add     
			aTop     state
code_284f:
			lsl      local360
			ldi      12
			eq?     
			bnt      code_286a
			lal      local361
			not     
			bnt      code_286a
			lal      local362
			not     
			bnt      code_286a
			ldi      1
			aTop     cycles
code_286a:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    2
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_288c
			pushi    #get
			pushi    1
			pushi    2
			lag      global0
			send     6
			ldi      0
			aTop     cycles
code_288c:
			pToa     cycles
			not     
			bnt      code_29b7
			pushi    3
			pushi    1460
			pushi    118
			pushSelf
			calle    proc13_4,  6
			jmp      code_29b7
code_28a1:
			dup     
			ldi      2
			eq?     
			bnt      code_28bd
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    251
			pushi    126
			pushSelf
			lag      global0
			send     12
			jmp      code_29b7
code_28bd:
			dup     
			ldi      3
			eq?     
			bnt      code_28ec
			pushi    #view
			pushi    1
			pushi    28
			pushi    219
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    9
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     38
			jmp      code_29b7
code_28ec:
			dup     
			ldi      4
			eq?     
			bnt      code_291e
			pushi    #posn
			pushi    2
			pushi    243
			pushi    113
			pushi    66
			pushi    1
			pushi    10
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			lag      global0
			send     26
			pushi    #dispose
			pushi    0
			lofsa    rMug
			send     4
			ldi      2
			aTop     cycles
			jmp      code_29b7
code_291e:
			dup     
			ldi      5
			eq?     
			bnt      code_294d
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    1
			pushSelf
			lag      global0
			send     12
			pushi    #signal
			pushi    1
			pushi    16657
			lofsa    rMug
			send     6
			pushi    #add
			pushi    1
			lofsa    rMug
			push    
			lag      global32
			send     6
			jmp      code_29b7
code_294d:
			dup     
			ldi      6
			eq?     
			bnt      code_298f
			pushi    2
			pushi    10
			pushi    86
			calle    proc806_1,  4
			pushi    #put
			pushi    1
			lsl      local360
			lag      global133
			send     6
			pushi    #put
			pushi    1
			lsl      local361
			lag      global134
			send     6
			pushi    #put
			pushi    1
			lsl      local362
			lag      global135
			send     6
			pushi    3
			pushi    1460
			pushi    119
			pushSelf
			calle    proc13_4,  6
			jmp      code_29b7
code_298f:
			dup     
			ldi      7
			eq?     
			bnt      code_29b7
			lal      local353
			not     
			bnt      code_29ae
			ldi      1
			sal      local353
			pushi    #setScript
			pushi    1
			lofsa    waitToStand
			push    
			lag      global0
			send     6
code_29ae:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_29b7:
			toss    
			ret     
		)
	)
)

(instance lInRMug of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2a15
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    2
			lag      global0
			send     12
			ldi      30
			aTop     ticks
			jmp      code_2a55
code_2a15:
			dup     
			ldi      1
			eq?     
			bnt      code_2a2b
			pushi    3
			pushi    1460
			pushi    97
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a55
code_2a2b:
			dup     
			ldi      2
			eq?     
			bnt      code_2a41
			pushi    3
			pushi    1460
			pushi    98
			pushSelf
			calle    proc13_4,  6
			jmp      code_2a55
code_2a41:
			dup     
			ldi      3
			eq?     
			bnt      code_2a55
			pushi    #cel
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_2a55:
			toss    
			ret     
		)
	)
)

(instance sell of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2af7
			pushi    1
			pushi    0
			callb    proc0_2,  2
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    316
			pushi    106
			pushi    283
			pushi    3
			class    PPath
			push    
			lea      @local355
			push    
			pushSelf
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			aTop     register
			send     34
			pushi    #posn
			pushi    2
			pushi    326
			pushi    106
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    289
			pushi    131
			pushSelf
			lag      global0
			send     20
			jmp      code_2b98
code_2af7:
			dup     
			ldi      1
			eq?     
			bnt      code_2b01
			jmp      code_2b98
code_2b01:
			dup     
			ldi      2
			eq?     
			bnt      code_2b59
			lsg      global115
			ldi      1
			eq?     
			bnt      code_2b25
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			lag      global2
			send     10
			ret     
code_2b25:
			lsg      global126
			ldi      3
			eq?     
			bnt      code_2b43
			pushi    4
			lea      @local177
			push    
			lea      @local1
			push    
			pushi    5
			pushSelf
			calle    proc851_0,  8
			jmp      code_2b98
code_2b43:
			pushi    4
			lea      @local177
			push    
			lea      @local1
			push    
			pushi    4
			pushSelf
			calle    proc851_0,  8
			jmp      code_2b98
code_2b59:
			dup     
			ldi      3
			eq?     
			bnt      code_2b86
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    326
			pushi    106
			pushSelf
			pToa     register
			send     12
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    316
			pushi    106
			lag      global0
			send     10
			jmp      code_2b98
code_2b86:
			dup     
			ldi      4
			eq?     
			bnt      code_2b98
			pushi    #newRoom
			pushi    1
			pushi    440
			lag      global2
			send     6
code_2b98:
			toss    
			ret     
		)
	)
)

(instance deliver of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2c39
			pushi    1
			pushi    0
			callb    proc0_2,  2
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    316
			pushi    106
			pushi    283
			pushi    3
			class    PPath
			push    
			lea      @local355
			push    
			pushSelf
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			aTop     register
			send     34
			pushi    #x
			pushi    1
			pushi    326
			pushi    3
			pushi    1
			pushi    106
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    289
			pushi    131
			pushSelf
			lag      global0
			send     24
			jmp      code_2cbc
code_2c39:
			dup     
			ldi      1
			eq?     
			bnt      code_2c43
			jmp      code_2cbc
code_2c43:
			dup     
			ldi      2
			eq?     
			bnt      code_2c7d
			lsg      global115
			ldi      1
			eq?     
			bnt      code_2c67
			pushi    #setScript
			pushi    3
			lofsa    waterDeath
			push    
			pushi    0
			lea      @local319
			push    
			lag      global2
			send     10
			ret     
code_2c67:
			pushi    4
			lea      @local165
			push    
			lea      @local1
			push    
			pushi    8
			pushSelf
			calle    proc851_0,  8
			jmp      code_2cbc
code_2c7d:
			dup     
			ldi      3
			eq?     
			bnt      code_2caa
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    326
			pushi    106
			pushSelf
			pToa     register
			send     12
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    316
			pushi    106
			lag      global0
			send     10
			jmp      code_2cbc
code_2caa:
			dup     
			ldi      4
			eq?     
			bnt      code_2cbc
			pushi    #newRoom
			pushi    1
			pushi    440
			lag      global2
			send     6
code_2cbc:
			toss    
			ret     
		)
	)
)

(instance frock of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2d4b
			pushi    0
			callb    proc0_3,  0
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    11
			class    Inv
			send     6
			send     4
			push    
			lag      global0
			eq?     
			bnt      code_2d34
			pushi    4
			lea      @local54
			push    
			lea      @local1
			push    
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_2d8b
code_2d34:
			pushi    4
			lea      @local60
			push    
			lea      @local1
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_2d8b
code_2d4b:
			dup     
			ldi      1
			eq?     
			bnt      code_2d75
			pushi    #setMotion
			pushi    3
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
			pToa     register
			send     10
			ldi      2
			aTop     seconds
			jmp      code_2d8b
code_2d75:
			dup     
			ldi      2
			eq?     
			bnt      code_2d8b
			ldi      15
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_2d8b:
			toss    
			ret     
		)
	)
)

(instance warn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2e24
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    32
			callb    proc0_6,  2
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    11
			class    Inv
			send     6
			send     4
			push    
			lag      global0
			eq?     
			bnt      code_2e0b
			pushi    4
			lea      @local48
			push    
			lea      @local1
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_2e51
code_2e0b:
			pushi    4
			lea      @local42
			push    
			lea      @local1
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			ipToa    state
			jmp      code_2e51
code_2e24:
			dup     
			ldi      1
			eq?     
			bnt      code_2e41
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    321
			pushi    190
			pushSelf
			lag      global0
			send     12
			jmp      code_2e51
code_2e41:
			dup     
			ldi      2
			eq?     
			bnt      code_2e51
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2e51:
			toss    
			ret     
		)
	)
)

(instance betterLeave of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2eb3
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    169
			pushi    102
			pushSelf
			lag      global0
			send     12
			jmp      code_2fe1
code_2eb3:
			dup     
			ldi      1
			eq?     
			bnt      code_2ed9
			pushi    3
			lsg      global0
			lofsa    abbot
			push    
			pushSelf
			callb    proc0_9,  6
			pushi    1
			pushi    114
			callb    proc0_5,  2
			bnt      code_2fe1
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_2fe1
code_2ed9:
			dup     
			ldi      2
			eq?     
			bnt      code_2f38
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			lag      global0
			eq?     
			bt       code_2f09
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    10
			class    Inv
			send     6
			send     4
			push    
			lag      global0
			eq?     
code_2f09:
			bnt      code_2f22
			pushi    4
			lea      @local142
			push    
			lea      @local1
			push    
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_2fe1
code_2f22:
			pushi    4
			lea      @local150
			push    
			lea      @local1
			push    
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_2fe1
code_2f38:
			dup     
			ldi      3
			eq?     
			bnt      code_2f61
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #actions
			pushi    1
			lofsa    escape
			push    
			lofsa    tunnel
			send     6
			ldi      4
			aTop     seconds
			jmp      code_2fe1
code_2f61:
			dup     
			ldi      4
			eq?     
			bnt      code_2f7b
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pTos     register
			lsg      global0
			callb    proc0_9,  4
			ldi      1
			aTop     cycles
			jmp      code_2fe1
code_2f7b:
			dup     
			ldi      5
			eq?     
			bnt      code_2fa1
			pushi    9
			pushi    3
			lea      @local158
			push    
			pushi    10
			pushi    1
			pushi    999
			pushi    0
			lea      @local1
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_2fe1
code_2fa1:
			dup     
			ldi      6
			eq?     
			bnt      code_2fcb
			pushi    #setMotion
			pushi    3
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
			pToa     register
			send     10
			ldi      2
			aTop     seconds
			jmp      code_2fe1
code_2fcb:
			dup     
			ldi      7
			eq?     
			bnt      code_2fe1
			ldi      17
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_2fe1:
			toss    
			ret     
		)
	)
)

(instance escape of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_3034
			pushi    1
			pushi    114
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			lofsa    betterLeave
			send     4
code_3034:
			ldi      0
			ret     
		)
	)
)

(instance mad of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3093
			pushi    0
			callb    proc0_3,  0
			pushi    4
			pushi    1
			pushi    112
			callb    proc0_5,  2
			bnt      code_3079
			lea      @local92
			jmp      code_3083
code_3079:
			pTos     state
			ldi      2
			add     
			aTop     state
			lea      @local88
code_3083:
			push    
			lea      @local1
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_3109
code_3093:
			dup     
			ldi      1
			eq?     
			bnt      code_30bd
			pushi    #setMotion
			pushi    3
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
			pToa     register
			send     10
			ldi      2
			aTop     seconds
			jmp      code_3109
code_30bd:
			dup     
			ldi      2
			eq?     
			bnt      code_30d6
			ldi      15
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			jmp      code_3109
code_30d6:
			dup     
			ldi      3
			eq?     
			bnt      code_30f3
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    321
			pushi    190
			pushSelf
			lag      global0
			send     12
			jmp      code_3109
code_30f3:
			dup     
			ldi      4
			eq?     
			bnt      code_3109
			pushi    1
			pushi    112
			callb    proc0_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_3109:
			toss    
			ret     
		)
	)
)

(instance snoreScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_31e6
			pushi    2
			pushi    3
			pushi    10
			callk    Random,  4
			aTop     seconds
			jmp      code_31fd
code_31e6:
			dup     
			ldi      1
			eq?     
			bnt      code_31fd
			pushi    #play
			pushi    0
			lofsa    snoreSound
			send     4
			ldi      65535
			aTop     state
			ldi      1
			aTop     cycles
code_31fd:
			toss    
			ret     
		)
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)

(instance mugSound of Sound
	(properties
		flags $0001
		number 457
	)
)

(instance tapestrySound of Sound
	(properties
		flags $0001
		number 458
	)
)

(instance snoreSound of Sound
	(properties
		flags $0001
		number 535
	)
)

(instance plopSound of Sound
	(properties
		flags $0001
		number 22
	)
)
