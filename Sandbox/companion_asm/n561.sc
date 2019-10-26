;;; Sierra Script 1.0 - (do not remove this comment)
(script# 561)
(include sci.sh)
(use n000)
(use n013)
(use n564)
(use n806)
(use n813)
(use n851)
(use n926)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	tunnel2 0
)

(local
	[local0 7] = [1561 0 1 2 1 1]
	[local7 4] = [1561 4 1]
	[local11 5] = [1561 5 1 2]
	[local16 4] = [1561 7 1]
	[local20 4] = [1561 8 1]
	[local24 6] = [1561 25 1 2 1]
	[local30 9] = [1561 28 1 2 1 1 2 1]
	local39
	local40
	local41
	local42
	[local43 3] = [-1 6848 11]
	[local46 3] = [-1 6852 12]
	[local49 3] = [-1 6856 13]
)
(procedure (localproc_000e param1)
	(asm
		pushi    1
		pushi    11
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Hal}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_0023 param1)
	(asm
		pushi    1
		pushi    12
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Hob}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_0038 param1)
	(asm
		pushi    1
		pushi    13
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Dicken}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(instance tunnel2 of Rm
	(properties
		picture 561
		style $800a
	)
	
	(method (init)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			lag      global34
			sal      local42
			ldi      0
			sag      global34
			ldi      1
			sal      local39
			pushi    2
			pushi    19
			pushi    20
			callk    DoSound,  4
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0080
			pushi    3
			pushi    2
			pushi    23
			pushi    24
			callb    proc0_2,  6
			jmp      code_0084
code_0080:
			pushi    0
			callb    proc0_2,  0
code_0084:
			pushi    0
			callb    proc0_4,  0
			lsg      global12
			ldi      562
			eq?     
			bt       code_0097
			lsg      global12
			ldi      460
			eq?     
code_0097:
			bnt      code_019e
			ldi      49162
			aTop     style
			ldi      1
			sal      local41
			pushi    1
			pushi    105
			callb    proc0_6,  2
			lsg      global130
			ldi      10
			ne?     
			bnt      code_0107
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_00c0
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_00c0:
			bnt      code_0107
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    284
			pushi    2
			pushi    18
			pushi    175
			pushi    107
			pushi    0
			lofsa    sonHal
			send     18
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    77
			pushi    167
			pushi    107
			pushi    0
			lofsa    sonHob
			send     18
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    130
			pushi    155
			pushi    107
			pushi    0
			lofsa    sonDicken
			send     18
code_0107:
			lsg      global12
			dup     
			ldi      562
			eq?     
			bnt      code_0157
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0120
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0120:
			bnt      code_013f
			pushi    #posn
			pushi    2
			pushi    130
			pushi    166
			pushi    107
			pushi    0
			pushi    228
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     20
			jmp      code_0188
code_013f:
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    90
			pushi    170
			pushi    107
			pushi    0
			lag      global0
			send     18
			jmp      code_0188
code_0157:
			dup     
			ldi      460
			eq?     
			bnt      code_0177
			pushi    #loop
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    237
			pushi    134
			pushi    107
			pushi    0
			lag      global0
			send     18
			jmp      code_0188
code_0177:
			pushi    #posn
			pushi    2
			pushi    235
			pushi    130
			pushi    107
			pushi    0
			lag      global0
			send     12
code_0188:
			toss    
			pushi    #approachVerbs
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    theTapestry
			send     14
			jmp      code_0349
code_019e:
			ldi      1
			sal      local40
			pushi    1
			pushi    106
			callb    proc0_6,  2
			lsg      global130
			ldi      10
			ne?     
			bnt      code_021a
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_01bf
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_01bf:
			bnt      code_021a
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    159
			pushi    178
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    sonHal
			send     24
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    190
			pushi    179
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    sonHob
			send     24
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    223
			pushi    185
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    sonDicken
			send     24
code_021a:
			lsg      global12
			dup     
			ldi      570
			eq?     
			bnt      code_02b6
			pushi    #posn
			pushi    2
			pushi    175
			pushi    155
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0244
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0244:
			bnt      code_0265
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #longTimerGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #guardsGone
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			jmp      code_02a7
code_0265:
			pushi    #seconds
			pushi    1
			pushi    0
			pushi    32
			pushi    1
			pushi    1
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     12
			pushi    #seconds
			pushi    1
			pushi    0
			pushi    32
			pushi    1
			pushi    1
			pushi    2
			pushi    564
			pushi    3
			callk    ScriptID,  4
			send     12
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     4
			not     
			bnt      code_02a7
			pushi    #guardsGone
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
code_02a7:
			pushi    #setScript
			pushi    1
			lofsa    call565Scpt
			push    
			lag      global2
			send     6
			jmp      code_0336
code_02b6:
			dup     
			ldi      560
			eq?     
			bnt      code_0316
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_02dc
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_02dc:
			bnt      code_0302
			pushi    #posn
			pushi    2
			pushi    200
			pushi    170
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    150
			pushi    160
			pushSelf
			lag      global0
			send     24
			jmp      code_0336
code_0302:
			pushi    #posn
			pushi    2
			pushi    247
			pushi    180
			pushi    107
			pushi    0
			lag      global0
			send     12
			jmp      code_0336
code_0316:
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    #posn
			pushi    2
			pushi    166
			pushi    165
			pushi    107
			pushi    0
			lag      global0
			send     12
code_0336:
			toss    
			pushi    #approachVerbs
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    theDoor
			send     14
code_0349:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    40
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    180
			pushi    258
			pushi    169
			pushi    224
			pushi    162
			pushi    217
			pushi    157
			pushi    202
			pushi    156
			pushi    167
			pushi    151
			pushi    159
			pushi    144
			pushi    157
			pushi    145
			pushi    135
			pushi    143
			pushi    102
			pushi    133
			pushi    67
			pushi    133
			pushi    78
			pushi    146
			pushi    102
			pushi    164
			pushi    122
			pushi    164
			pushi    154
			pushi    178
			pushi    179
			pushi    181
			pushi    212
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     94
			push    
			lag      global2
			send     6
			pushi    4
			lofsa    westWallArea
			push    
			lofsa    eastWallArea
			push    
			lofsa    endWallArea
			push    
			lofsa    floorArea
			push    
			calle    proc806_3,  8
			lsg      global12
			ldi      562
			eq?     
			bt       code_03fe
			lsg      global12
			ldi      460
			eq?     
code_03fe:
			bnt      code_040f
			pushi    0
			calle    proc926_1,  0
			pushi    0
			calle    proc926_0,  0
code_040f:
			lsg      global12
			ldi      560
			eq?     
			bt       code_041e
			lsg      global12
			ldi      570
			eq?     
code_041e:
			bnt      code_04b5
			lsg      global130
			ldi      5
			eq?     
			bt       code_042e
			lsg      global130
			ldi      6
			eq?     
code_042e:
			bnt      code_0452
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0440
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0440:
			bnt      code_04b5
			pushi    #setScript
			pushi    1
			lofsa    westTunnelDay5_6
			push    
			lag      global2
			send     6
			jmp      code_04b5
code_0452:
			lsg      global130
			ldi      5
			eq?     
			bt       code_045f
			lsg      global130
			ldi      6
			eq?     
code_045f:
			bnt      code_04b5
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0471
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0471:
			bnt      code_04b5
			lsg      global12
			ldi      570
			eq?     
			bnt      code_04b5
			pushi    #coinsLeft
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0497
			pushi    #setScript
			pushi    1
			lofsa    afterCoinLeft
			push    
			lag      global2
			send     6
			jmp      code_04b5
code_0497:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_04a6
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_04a6:
			bnt      code_04b5
			pushi    #setScript
			pushi    1
			lofsa    comeWithSons570
			push    
			lag      global2
			send     6
code_04b5:
			lsg      global12
			ldi      562
			eq?     
			bt       code_04c4
			lsg      global12
			ldi      460
			eq?     
code_04c4:
			bnt      code_0547
			lsg      global12
			ldi      460
			eq?     
			bnt      code_0519
			pushi    1
			pushi    114
			callb    proc0_5,  2
			bnt      code_0519
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_04e8
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_04e8:
			bnt      code_04fa
			pushi    #setScript
			pushi    1
			lofsa    hurryFrom460
			push    
			lag      global2
			send     6
			jmp      code_0547
code_04fa:
			lsg      global130
			ldi      5
			eq?     
			bt       code_0507
			lsg      global130
			ldi      6
			eq?     
code_0507:
			bnt      code_0547
			pushi    3
			pushi    1561
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_0547
code_0519:
			lsg      global130
			ldi      5
			eq?     
			bt       code_0526
			lsg      global130
			ldi      6
			eq?     
code_0526:
			bnt      code_0547
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0538
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0538:
			bnt      code_0547
			pushi    #setScript
			pushi    1
			lofsa    mirrorTunnelDay5_6
			push    
			lag      global2
			send     6
code_0547:
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      560
			ne?     
			bnt      code_0568
			pushi    #number
			pushi    1
			pushi    560
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_0568:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      189
			ge?     
			bt       code_05ab
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			le?     
			bt       code_05ab
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      319
			ge?     
code_05ab:
			bnt      code_05c6
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_05c6
			pushi    #setScript
			pushi    1
			lofsa    goToTunnels
			push    
			lag      global0
			send     6
code_05c6:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local42
			sag      global34
			pushi    #dispose
			pushi    0
			super    Rm,  4
			pushi    2
			pushi    19
			pushi    0
			callk    DoSound,  4
			pushi    1
			pushi    971
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_05e5
			pushi    3
			pushi    1561
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_05ee
code_05e5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Rm,  6
code_05ee:
			toss    
			ret     
		)
	)
)

(instance sonHal of Actor
	(properties
		view 434
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_065a
			pushi    3
			pushi    1561
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_074d
code_065a:
			dup     
			ldi      3
			eq?     
			bnt      code_0676
			pushi    3
			pushi    1561
			pushi    47
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_074d
code_0676:
			dup     
			ldi      5
			eq?     
			bnt      code_0692
			pushi    3
			pushi    1561
			pushi    12
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_074d
code_0692:
			dup     
			ldi      4
			eq?     
			bnt      code_0744
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_06b7
			pushi    3
			pushi    1561
			pushi    13
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0740
code_06b7:
			dup     
			ldi      2
			eq?     
			bnt      code_06d3
			pushi    3
			pushi    1561
			pushi    14
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0740
code_06d3:
			dup     
			ldi      14
			eq?     
			bnt      code_06ef
			pushi    3
			pushi    1561
			pushi    14
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0740
code_06ef:
			dup     
			ldi      12
			eq?     
			bnt      code_070b
			pushi    3
			pushi    1561
			pushi    15
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0740
code_070b:
			dup     
			ldi      18
			eq?     
			bnt      code_0727
			pushi    3
			pushi    1561
			pushi    16
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0740
code_0727:
			dup     
			ldi      10
			eq?     
			bnt      code_0740
			pushi    3
			pushi    1561
			pushi    16
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_0740:
			toss    
			jmp      code_074d
code_0744:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_074d:
			toss    
			ret     
		)
	)
)

(instance sonHob of Actor
	(properties
		view 434
		loop 1
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_07ee
			pushi    3
			pushi    1561
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_08e1
code_07ee:
			dup     
			ldi      3
			eq?     
			bnt      code_080a
			pushi    3
			pushi    1561
			pushi    47
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08e1
code_080a:
			dup     
			ldi      5
			eq?     
			bnt      code_0826
			pushi    3
			pushi    1561
			pushi    17
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08e1
code_0826:
			dup     
			ldi      4
			eq?     
			bnt      code_08d8
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_084b
			pushi    3
			pushi    1561
			pushi    18
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08d4
code_084b:
			dup     
			ldi      2
			eq?     
			bnt      code_0867
			pushi    3
			pushi    1561
			pushi    19
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08d4
code_0867:
			dup     
			ldi      14
			eq?     
			bnt      code_0883
			pushi    3
			pushi    1561
			pushi    19
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08d4
code_0883:
			dup     
			ldi      12
			eq?     
			bnt      code_089f
			pushi    3
			pushi    1561
			pushi    20
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08d4
code_089f:
			dup     
			ldi      18
			eq?     
			bnt      code_08bb
			pushi    3
			pushi    1561
			pushi    21
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08d4
code_08bb:
			dup     
			ldi      10
			eq?     
			bnt      code_08d4
			pushi    3
			pushi    1561
			pushi    21
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_08d4:
			toss    
			jmp      code_08e1
code_08d8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_08e1:
			toss    
			ret     
		)
	)
)

(instance sonDicken of Actor
	(properties
		view 434
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0982
			pushi    3
			pushi    1561
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a63
code_0982:
			dup     
			ldi      3
			eq?     
			bnt      code_099e
			pushi    3
			pushi    1561
			pushi    47
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a63
code_099e:
			dup     
			ldi      5
			eq?     
			bnt      code_09ba
			pushi    3
			pushi    1561
			pushi    22
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a63
code_09ba:
			dup     
			ldi      4
			eq?     
			bnt      code_0a5a
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_09df
			pushi    3
			pushi    1561
			pushi    23
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a56
code_09df:
			dup     
			ldi      2
			eq?     
			bnt      code_09fb
			pushi    3
			pushi    1561
			pushi    24
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a56
code_09fb:
			dup     
			ldi      14
			eq?     
			bnt      code_0a17
			pushi    3
			pushi    1561
			pushi    24
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a56
code_0a17:
			dup     
			ldi      12
			eq?     
			bnt      code_0a2d
			pushi    #setScript
			pushi    1
			lofsa    dickenPuzBoxTalk
			push    
			lag      global2
			send     6
			jmp      code_0a56
code_0a2d:
			dup     
			ldi      18
			eq?     
			bnt      code_0a43
			pushi    #setScript
			pushi    1
			lofsa    waterOrFireRingTalk
			push    
			lag      global2
			send     6
			jmp      code_0a56
code_0a43:
			dup     
			ldi      10
			eq?     
			bnt      code_0a56
			pushi    #setScript
			pushi    1
			lofsa    waterOrFireRingTalk
			push    
			lag      global2
			send     6
code_0a56:
			toss    
			jmp      code_0a63
code_0a5a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_0a63:
			toss    
			ret     
		)
	)
)

(instance cannotUsePuzbox of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_0b0a
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0b09
			pushi    3
			pushi    1561
			pushi    46
			pushi    1
			calle    proc13_4,  6
code_0b09:
			toss    
code_0b0a:
			ret     
		)
	)
)

(instance theDoor of Prop
	(properties
		x 97
		y 124
		approachX 80
		approachY 134
		view 561
		signal $4004
	)
	
	(method (doVerb theVerb &tmp temp0)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ba9
			pushi    #curEvent
			pushi    0
			class    User
			send     4
			sat      temp0
			pushi    76
			pushi    #x
			pushi    0
			send     4
			gt?     
			bnt      code_0b76
			pprev   
			ldi      60
			gt?     
			bnt      code_0b76
			pushi    92
			pushi    #y
			pushi    0
			lat      temp0
			send     4
			gt?     
			bnt      code_0b76
			pprev   
			ldi      76
			gt?     
			bnt      code_0b76
			pushi    #setScript
			pushi    1
			lofsa    call565Scpt
			push    
			lag      global2
			send     6
			jmp      code_0bda
code_0b76:
			pushi    #setHeading
			pushi    1
			pushi    0
			lag      global0
			send     6
			lsl      local40
			ldi      1
			eq?     
			bnt      code_0b9a
			pushi    3
			pushi    1561
			pushi    35
			pushi    1
			calle    proc13_4,  6
			ldi      0
			sal      local40
			jmp      code_0bda
code_0b9a:
			pushi    3
			pushi    1561
			pushi    36
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bda
code_0ba9:
			dup     
			ldi      3
			eq?     
			bnt      code_0bd1
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    80
			pushi    134
			pushSelf
			lag      global0
			send     12
			pushi    #setScript
			pushi    1
			lofsa    openDoorGoto570
			push    
			lag      global2
			send     6
			jmp      code_0bda
code_0bd1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0bda:
			toss    
			ret     
		)
	)
)

(instance theTapestry of Prop
	(properties
		x 261
		y 122
		approachX 239
		approachY 134
		view 561
		loop 1
		priority 9
		signal $4014
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c87
			lsl      local41
			ldi      1
			eq?     
			bnt      code_0c78
			pushi    1
			pushi    29
			callb    proc0_5,  2
			not     
			bnt      code_0c78
			pushi    3
			pushi    1561
			pushi    37
			pushi    1
			calle    proc13_4,  6
			ldi      0
			sal      local41
			jmp      code_0cdb
code_0c78:
			pushi    3
			pushi    1561
			pushi    38
			pushi    1
			calle    proc13_4,  6
			jmp      code_0cdb
code_0c87:
			dup     
			ldi      3
			eq?     
			bnt      code_0cd2
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0cb5
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0ca5
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0ca5:
			bnt      code_0cb5
			pushi    #setScript
			pushi    1
			lofsa    moveTapestryTo460
			push    
			self     6
			jmp      code_0cdb
code_0cb5:
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			pushi    460
			lag      global2
			send     6
			jmp      code_0cdb
code_0cd2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0cdb:
			toss    
			ret     
		)
	)
)

(instance westWallArea of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    46
			pushi    0
			pushi    0
			pushi    86
			pushi    0
			pushi    86
			pushi    36
			pushi    56
			pushi    38
			pushi    45
			dup     
			pushi    33
			pushi    61
			pushi    31
			pushi    80
			pushi    33
			pushi    94
			pushi    37
			pushi    101
			pushi    37
			pushi    115
			pushi    37
			pushi    123
			pushi    62
			pushi    133
			pushi    73
			pushi    147
			pushi    75
			pushi    152
			pushi    88
			pushi    158
			pushi    96
			pushi    167
			pushi    102
			pushi    169
			pushi    119
			pushi    167
			pushi    136
			pushi    172
			pushi    165
			pushi    184
			pushi    189
			pushi    181
			pushi    214
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     106
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    2
			pushi    19
			pushi    0
			callk    DoSound,  4
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0de8
			pushi    3
			pushi    1561
			pushi    39
			pushi    1
			calle    proc13_4,  6
			jmp      code_0df1
code_0de8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0df1:
			toss    
			ret     
		)
	)
)

(instance eastWallArea of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    87
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    173
			pushi    212
			pushi    153
			pushi    102
			pushi    128
			pushi    113
			pushi    120
			pushi    121
			pushi    91
			pushi    127
			pushi    75
			pushi    109
			pushi    47
			pushi    98
			pushi    38
			pushi    87
			pushi    36
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     58
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0eb9
			pushi    3
			pushi    1561
			pushi    39
			pushi    1
			calle    proc13_4,  6
			jmp      code_0ec2
code_0eb9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0ec2:
			toss    
			ret     
		)
	)
)

(instance endWallArea of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    42
			pushi    40
			pushi    100
			pushi    35
			pushi    94
			pushi    34
			pushi    81
			pushi    35
			pushi    65
			pushi    39
			pushi    58
			pushi    46
			pushi    48
			pushi    55
			pushi    43
			pushi    66
			pushi    41
			pushi    90
			pushi    40
			pushi    107
			pushi    48
			pushi    112
			pushi    58
			pushi    123
			pushi    73
			pushi    122
			pushi    86
			pushi    117
			pushi    94
			pushi    112
			pushi    117
			pushi    107
			pushi    121
			pushi    98
			pushi    121
			pushi    98
			pushi    63
			pushi    57
			pushi    62
			pushi    58
			pushi    121
			pushi    40
			pushi    120
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     98
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_102c
			lsl      local39
			ldi      1
			eq?     
			bnt      code_0fed
			lsg      global12
			ldi      560
			eq?     
			bt       code_0faf
			lsg      global12
			ldi      570
			eq?     
code_0faf:
			bnt      code_0fc8
			pushi    2
			pushi    1561
			pushi    40
			calle    proc13_4,  4
			pushi    3
			pushi    1561
			pushi    41
			pushi    1
			calle    proc13_4,  6
code_0fc8:
			lsg      global12
			ldi      562
			eq?     
			bt       code_0fd7
			lsg      global12
			ldi      460
			eq?     
code_0fd7:
			bnt      code_0fe6
			pushi    3
			pushi    1561
			pushi    42
			pushi    1
			calle    proc13_4,  6
code_0fe6:
			ldi      0
			sal      local39
			jmp      code_1035
code_0fed:
			lsg      global12
			ldi      560
			eq?     
			bt       code_0ffc
			lsg      global12
			ldi      570
			eq?     
code_0ffc:
			bnt      code_100b
			pushi    3
			pushi    1561
			pushi    43
			pushi    1
			calle    proc13_4,  6
code_100b:
			lsg      global12
			ldi      562
			eq?     
			bt       code_101a
			lsg      global12
			ldi      460
			eq?     
code_101a:
			bnt      code_1035
			pushi    3
			pushi    1561
			pushi    44
			pushi    1
			calle    proc13_4,  6
			jmp      code_1035
code_102c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1035:
			toss    
			ret     
		)
	)
)

(instance floorArea of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    34
			pushi    66
			pushi    133
			pushi    101
			pushi    131
			pushi    132
			pushi    139
			pushi    159
			pushi    144
			pushi    193
			pushi    152
			pushi    231
			pushi    160
			pushi    266
			pushi    169
			pushi    319
			pushi    178
			pushi    319
			pushi    189
			pushi    221
			pushi    189
			pushi    190
			pushi    180
			pushi    166
			pushi    182
			pushi    133
			pushi    169
			pushi    120
			pushi    165
			pushi    101
			pushi    167
			pushi    86
			pushi    153
			pushi    75
			pushi    149
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     82
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1127
			pushi    3
			pushi    1561
			pushi    45
			pushi    1
			calle    proc13_4,  6
			jmp      code_1130
code_1127:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_1130:
			toss    
			ret     
		)
	)
)

(instance call565Scpt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_119f
			ldi      2
			aTop     cycles
			jmp      code_121b
code_119f:
			dup     
			ldi      1
			eq?     
			bnt      code_11bf
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    70
			pushi    133
			pushSelf
			lag      global0
			send     12
			jmp      code_121b
code_11bf:
			dup     
			ldi      2
			eq?     
			bnt      code_11d6
			pushi    #setHeading
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_121b
code_11d6:
			dup     
			ldi      3
			eq?     
			bnt      code_11f2
			pushi    #doit
			pushi    0
			pushi    1
			pushi    565
			callk    ScriptID,  2
			send     4
			pushi    #cue
			pushi    0
			self     4
			jmp      code_121b
code_11f2:
			dup     
			ldi      4
			eq?     
			bnt      code_121b
			pushi    0
			callb    proc0_4,  0
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_121b:
			toss    
			ret     
		)
	)
)

(instance goToTunnels of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12a4
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_128d
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			jmp      code_1298
code_128d:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
code_1298:
			push    
			pushi    240
			pushSelf
			lag      global0
			send     12
			jmp      code_12d3
code_12a4:
			dup     
			ldi      1
			eq?     
			bnt      code_12d3
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_12c8
			pushi    #newRoom
			pushi    1
			pushi    562
			lag      global2
			send     6
			jmp      code_12d3
code_12c8:
			pushi    #newRoom
			pushi    1
			pushi    560
			lag      global2
			send     6
code_12d3:
			toss    
			ret     
		)
	)
)

(instance openDoorGoto570 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1327
			pushi    0
			callb    proc0_3,  0
			ldi      5
			aTop     cycles
			jmp      code_1374
code_1327:
			dup     
			ldi      1
			eq?     
			bnt      code_133e
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    theDoor
			send     8
			jmp      code_1374
code_133e:
			dup     
			ldi      2
			eq?     
			bnt      code_1368
			pushi    #stopUpd
			pushi    0
			lofsa    theDoor
			send     4
			pushi    #play
			pushi    0
			lofsa    doorSound
			send     4
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    570
			lag      global2
			send     6
			jmp      code_1374
code_1368:
			dup     
			ldi      3
			eq?     
			bnt      code_1374
			pushi    #dispose
			pushi    0
			self     4
code_1374:
			toss    
			ret     
		)
	)
)

(instance moveTapestryTo460 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13c7
			pushi    0
			callb    proc0_3,  0
			ldi      7
			aTop     cycles
			jmp      code_1436
code_13c7:
			dup     
			ldi      1
			eq?     
			bnt      code_13dd
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_1436
code_13dd:
			dup     
			ldi      2
			eq?     
			bnt      code_13f8
			pushi    5
			pushi    1
			lea      @local20
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1436
code_13f8:
			dup     
			ldi      3
			eq?     
			bnt      code_140c
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			lag      global0
			send     8
			jmp      code_1436
code_140c:
			dup     
			ldi      4
			eq?     
			bnt      code_1436
			pushi    0
			callb    proc0_4,  0
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			pushi    460
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1436:
			toss    
			ret     
		)
	)
)

(instance westTunnelDay5_6 of Script
	(properties
		name "westTunnelDay5&6"
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1489
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_1513
code_1489:
			dup     
			ldi      1
			eq?     
			bnt      code_14a5
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    127
			pushi    154
			pushSelf
			lag      global0
			send     12
			jmp      code_1513
code_14a5:
			dup     
			ldi      2
			eq?     
			bnt      code_14b3
			ldi      2
			aTop     cycles
			jmp      code_1513
code_14b3:
			dup     
			ldi      3
			eq?     
			bnt      code_14c9
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_1513
code_14c9:
			dup     
			ldi      4
			eq?     
			bnt      code_14f9
			lsg      global12
			ldi      570
			ne?     
			bnt      code_14f2
			pushi    7
			pushi    2
			lea      @local11
			push    
			lea      @local46
			push    
			pushi    1
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_1513
code_14f2:
			ldi      6
			aTop     ticks
			jmp      code_1513
code_14f9:
			dup     
			ldi      5
			eq?     
			bnt      code_1513
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1513:
			toss    
			ret     
		)
	)
)

(instance mirrorTunnelDay5_6 of Script
	(properties
		name "mirrorTunnelDay5&6"
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1567
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_15cf
code_1567:
			dup     
			ldi      1
			eq?     
			bnt      code_1584
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    169
			pushi    161
			pushSelf
			lag      global0
			send     12
			jmp      code_15cf
code_1584:
			dup     
			ldi      2
			eq?     
			bnt      code_159a
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			jmp      code_15cf
code_159a:
			dup     
			ldi      3
			eq?     
			bnt      code_15b5
			pushi    5
			pushi    1
			lea      @local16
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_15cf
code_15b5:
			dup     
			ldi      4
			eq?     
			bnt      code_15cf
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_15cf:
			toss    
			ret     
		)
	)
)

(instance comeWithSonsFrom560 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1679
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    293
			pushi    189
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    sonHal
			send     24
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    267
			pushi    189
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    sonHob
			send     24
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    241
			pushi    188
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    sonDicken
			send     24
			jmp      code_1711
code_1679:
			dup     
			ldi      1
			eq?     
			bnt      code_16cd
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    142
			pushi    157
			pushSelf
			lag      global0
			send     12
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    156
			pushi    176
			lofsa    sonDicken
			send     10
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    179
			dup     
			lofsa    sonHob
			send     10
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    211
			pushi    188
			lofsa    sonHal
			send     10
			jmp      code_1711
code_16cd:
			dup     
			ldi      2
			eq?     
			bnt      code_1701
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lag      global0
			send     8
			pushi    #setHeading
			pushi    1
			pushi    0
			lofsa    sonDicken
			send     6
			pushi    #setHeading
			pushi    1
			pushi    0
			lofsa    sonHob
			send     6
			pushi    #setHeading
			pushi    1
			pushi    0
			lofsa    sonHal
			send     6
			jmp      code_1711
code_1701:
			dup     
			ldi      3
			eq?     
			bnt      code_1711
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1711:
			toss    
			ret     
		)
	)
)

(instance comeWithSons570 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1774
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    185
			pushi    168
			pushSelf
			lag      global0
			send     12
			jmp      code_17ae
code_1774:
			dup     
			ldi      1
			eq?     
			bnt      code_1794
			pushi    7
			pushi    2
			lea      @local0
			push    
			pushi    9
			pushi    0
			lea      @local43
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_17ae
code_1794:
			dup     
			ldi      2
			eq?     
			bnt      code_17ae
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_17ae:
			toss    
			ret     
		)
	)
)

(instance hurryFrom460 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_180c
			pushi    0
			callb    proc0_3,  0
			pushi    #setCursor
			pushi    2
			lsg      global21
			pushi    1
			lag      global1
			send     8
			ldi      1
			aTop     cycles
			jmp      code_189b
code_180c:
			dup     
			ldi      1
			eq?     
			bnt      code_1828
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    120
			pushi    170
			pushSelf
			lag      global0
			send     12
			jmp      code_189b
code_1828:
			dup     
			ldi      2
			eq?     
			bnt      code_1844
			pushi    3
			pushi    1561
			pushi    9
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_189b
code_1844:
			dup     
			ldi      3
			eq?     
			bnt      code_185f
			pushi    5
			pushi    1
			lea      @local7
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_189b
code_185f:
			dup     
			ldi      4
			eq?     
			bnt      code_187b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    50
			pushi    195
			pushSelf
			lag      global0
			send     12
			jmp      code_189b
code_187b:
			dup     
			ldi      5
			eq?     
			bnt      code_189b
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #newRoom
			pushi    1
			pushi    562
			lag      global2
			send     6
code_189b:
			toss    
			ret     
		)
	)
)

(instance afterCoinLeft of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1900
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    80
			pushi    134
			lag      global0
			send     10
			ldi      10
			aTop     cycles
			jmp      code_1936
code_1900:
			dup     
			ldi      1
			eq?     
			bnt      code_192a
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #doit
			pushi    0
			pushi    1
			pushi    565
			callk    ScriptID,  2
			send     4
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1936
code_192a:
			dup     
			ldi      2
			eq?     
			bnt      code_1936
			pushi    #dispose
			pushi    0
			self     4
code_1936:
			toss    
			ret     
		)
	)
)

(instance dickenPuzBoxTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1989
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_19c1
code_1989:
			dup     
			ldi      1
			eq?     
			bnt      code_19ab
			pushi    7
			pushi    2
			lea      @local24
			push    
			lea      @local49
			push    
			pushi    0
			lea      @local43
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_19c1
code_19ab:
			dup     
			ldi      2
			eq?     
			bnt      code_19c1
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_19c1:
			toss    
			ret     
		)
	)
)

(instance waterOrFireRingTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a15
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_1a4d
code_1a15:
			dup     
			ldi      1
			eq?     
			bnt      code_1a37
			pushi    7
			pushi    2
			lea      @local30
			push    
			lea      @local49
			push    
			pushi    0
			lea      @local43
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1a4d
code_1a37:
			dup     
			ldi      2
			eq?     
			bnt      code_1a4d
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1a4d:
			toss    
			ret     
		)
	)
)

(instance doorSound of Sound
	(properties
		flags $0001
		number 503
	)
)
