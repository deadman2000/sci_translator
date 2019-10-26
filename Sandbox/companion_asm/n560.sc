;;; Sierra Script 1.0 - (do not remove this comment)
(script# 560)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	tunnel1 0
)

(local
	[local0 2]
	[local2 5] = [1560 1 2 1]
	[local7 9] = [1560 3 2 4 1 1 3 1]
	[local16 7] = [1560 9 1 1 2 1]
	[local23 6] = [1560 13 1 1 2]
	[local29 4] = [1560 16 1]
	[local33 9] = [1560 42 1 2 1 1 2 1]
	[local42 6] = [1560 39 1 2 1]
	[local48 3] = [-1 5558 11]
	[local51 3] = [-1 5562 12]
	[local54 3] = [-1 5566 13]
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

(instance tunnel1 of Rm
	(properties
		picture 560
		style $800a
		north 561
		east 562
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    2
			pushi    19
			pushi    20
			callk    DoSound,  4
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_00f2
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_008d
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_008d:
			bnt      code_00f2
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    #heading
			pushi    1
			pushi    225
			pushi    6
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    100
			pushi    155
			pushi    107
			pushi    0
			lofsa    sonHal
			send     24
			pushi    #heading
			pushi    1
			pushi    180
			pushi    6
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    130
			pushi    155
			pushi    107
			pushi    0
			lofsa    sonHob
			send     24
			pushi    #heading
			pushi    1
			pushi    270
			pushi    6
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    190
			pushi    155
			pushi    107
			pushi    0
			lofsa    sonDicken
			send     24
code_00f2:
			lsg      global12
			dup     
			ldi      562
			eq?     
			bnt      code_019b
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_0163
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_011c
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_011c:
			bnt      code_0163
			pushi    1
			pushi    114
			callb    proc0_5,  2
			bnt      code_0163
			pushi    0
			callb    proc0_2,  0
			pushi    #setHeading
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    160
			pushi    171
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     30
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    114
			callb    proc0_7,  2
			pushi    #setScript
			pushi    1
			lofsa    comeFromEstWithSons
			push    
			self     6
			jmp      code_02ca
code_0163:
			pushi    0
			callb    proc0_2,  0
			pushi    #setHeading
			pushi    1
			pushi    270
			pushi    284
			pushi    2
			pushi    283
			pushi    161
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     30
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			jmp      code_02ca
code_019b:
			dup     
			ldi      561
			eq?     
			bnt      code_01d3
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    22
			pushi    160
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     24
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			jmp      code_02ca
code_01d3:
			dup     
			ldi      550
			eq?     
			bnt      code_02ca
			pushi    1
			pushi    107
			callb    proc0_5,  2
			not     
			bnt      code_0216
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    11
			pushi    170
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     24
			pushi    #setScript
			pushi    1
			lofsa    firstInFrom550
			push    
			lag      global0
			send     6
			jmp      code_02ca
code_0216:
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_029a
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0236
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0236:
			bnt      code_0266
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    22
			pushi    160
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     24
			pushi    #setScript
			pushi    1
			lofsa    withSon5B6A
			push    
			lag      global2
			send     6
			jmp      code_02ca
code_0266:
			pushi    0
			callb    proc0_2,  0
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    11
			pushi    160
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     30
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			jmp      code_02ca
code_029a:
			pushi    0
			callb    proc0_2,  0
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    11
			pushi    160
			pushi    302
			pushi    1
			pushi    1
			pushi    300
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    100
			pushi    167
			pushSelf
			lag      global0
			send     42
code_02ca:
			toss    
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    8
			pushi    73
			pushi    158
			pushi    209
			pushi    158
			pushi    209
			pushi    153
			pushi    73
			pushi    153
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
			pushi    3
			pushi    107
			pushi    26
			pushi    24
			pushi    148
			pushi    0
			pushi    154
			pushi    0
			pushi    186
			pushi    202
			pushi    186
			pushi    276
			pushi    186
			pushi    319
			pushi    146
			pushi    211
			pushi    151
			pushi    211
			pushi    160
			pushi    66
			pushi    160
			pushi    66
			pushi    151
			pushi    40
			pushi    151
			pushi    24
			pushi    121
			pushi    14
			pushi    121
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     66
			push    
			lag      global2
			send     8
			pushi    5
			lofsa    tunnelWall
			push    
			lofsa    caskArea
			push    
			lofsa    eastTunlWay
			push    
			lofsa    westTunlWay
			push    
			lofsa    tunnelFloor
			push    
			calle    proc806_3,  10
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      560
			ne?     
			bnt      code_0394
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
code_0394:
			pushi    0
			callb    proc0_4,  0
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			lt?     
			bnt      code_0427
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_0427
			lsg      global126
			ldi      5
			eq?     
			bnt      code_041c
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_03da
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_03da:
			bnt      code_041c
			pushi    1
			pushi    108
			callb    proc0_5,  2
			not     
			bnt      code_03f6
			pushi    #setScript
			pushi    1
			lofsa    caskClikFirst
			push    
			lag      global2
			send     6
			jmp      code_0427
code_03f6:
			pushi    1
			pushi    108
			callb    proc0_5,  2
			bnt      code_040e
			pushi    #setScript
			pushi    1
			lofsa    caskClikSecond
			push    
			lag      global2
			send     6
			jmp      code_0427
code_040e:
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
			jmp      code_0427
code_041c:
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
code_0427:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      290
			gt?     
			bnt      code_0445
			pushi    0
			callb    proc0_3,  0
			pushi    #newRoom
			pushi    1
			pushi    562
			lag      global2
			send     6
code_0445:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      140
			lt?     
			bnt      code_0463
			pushi    0
			callb    proc0_3,  0
			pushi    #newRoom
			pushi    1
			pushi    561
			lag      global2
			send     6
code_0463:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    2
			pushi    19
			pushi    0
			callk    DoSound,  4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_048a
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0493
			pushi    3
			pushi    1560
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_0493
code_048a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Rm,  6
code_0493:
			toss    
			ret     
		)
	)
)

(instance sonHal of Actor
	(properties
		x 109
		y 160
		view 434
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0500
			pushi    3
			pushi    1560
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_05f3
code_0500:
			dup     
			ldi      5
			eq?     
			bnt      code_051c
			pushi    3
			pushi    1560
			pushi    26
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f3
code_051c:
			dup     
			ldi      3
			eq?     
			bnt      code_0538
			pushi    3
			pushi    1560
			pushi    50
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f3
code_0538:
			dup     
			ldi      4
			eq?     
			bnt      code_05ea
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_055d
			pushi    3
			pushi    1560
			pushi    27
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05e6
code_055d:
			dup     
			ldi      2
			eq?     
			bnt      code_0579
			pushi    3
			pushi    1560
			pushi    28
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05e6
code_0579:
			dup     
			ldi      14
			eq?     
			bnt      code_0595
			pushi    3
			pushi    1560
			pushi    28
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05e6
code_0595:
			dup     
			ldi      12
			eq?     
			bnt      code_05b1
			pushi    3
			pushi    1560
			pushi    29
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05e6
code_05b1:
			dup     
			ldi      18
			eq?     
			bnt      code_05cd
			pushi    3
			pushi    1560
			pushi    30
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05e6
code_05cd:
			dup     
			ldi      10
			eq?     
			bnt      code_05e6
			pushi    3
			pushi    1560
			pushi    30
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_05e6:
			toss    
			jmp      code_05f3
code_05ea:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_05f3:
			toss    
			ret     
		)
	)
)

(instance sonHob of Actor
	(properties
		x 161
		y 169
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
			bnt      code_0694
			pushi    3
			pushi    1560
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_0787
code_0694:
			dup     
			ldi      5
			eq?     
			bnt      code_06b0
			pushi    3
			pushi    1560
			pushi    31
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0787
code_06b0:
			dup     
			ldi      3
			eq?     
			bnt      code_06cc
			pushi    3
			pushi    1560
			pushi    50
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0787
code_06cc:
			dup     
			ldi      4
			eq?     
			bnt      code_077e
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_06f1
			pushi    3
			pushi    1560
			pushi    32
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_077a
code_06f1:
			dup     
			ldi      2
			eq?     
			bnt      code_070d
			pushi    3
			pushi    1560
			pushi    33
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_077a
code_070d:
			dup     
			ldi      14
			eq?     
			bnt      code_0729
			pushi    3
			pushi    1560
			pushi    33
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_077a
code_0729:
			dup     
			ldi      12
			eq?     
			bnt      code_0745
			pushi    3
			pushi    1560
			pushi    34
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_077a
code_0745:
			dup     
			ldi      18
			eq?     
			bnt      code_0761
			pushi    3
			pushi    1560
			pushi    35
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_077a
code_0761:
			dup     
			ldi      10
			eq?     
			bnt      code_077a
			pushi    3
			pushi    1560
			pushi    35
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_077a:
			toss    
			jmp      code_0787
code_077e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_0787:
			toss    
			ret     
		)
	)
)

(instance sonDicken of Actor
	(properties
		y 173
		view 434
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0828
			pushi    3
			pushi    1560
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_0909
code_0828:
			dup     
			ldi      5
			eq?     
			bnt      code_0844
			pushi    3
			pushi    1560
			pushi    36
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0909
code_0844:
			dup     
			ldi      3
			eq?     
			bnt      code_0860
			pushi    3
			pushi    1560
			pushi    50
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0909
code_0860:
			dup     
			ldi      4
			eq?     
			bnt      code_0900
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0885
			pushi    3
			pushi    1560
			pushi    37
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08fc
code_0885:
			dup     
			ldi      2
			eq?     
			bnt      code_08a1
			pushi    3
			pushi    1560
			pushi    38
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08fc
code_08a1:
			dup     
			ldi      14
			eq?     
			bnt      code_08bd
			pushi    3
			pushi    1560
			pushi    38
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_08fc
code_08bd:
			dup     
			ldi      12
			eq?     
			bnt      code_08d3
			pushi    #setScript
			pushi    1
			lofsa    dickenPuzBoxTalk
			push    
			lag      global2
			send     6
			jmp      code_08fc
code_08d3:
			dup     
			ldi      18
			eq?     
			bnt      code_08e9
			pushi    #setScript
			pushi    1
			lofsa    waterOrFireRingTalk
			push    
			lag      global2
			send     6
			jmp      code_08fc
code_08e9:
			dup     
			ldi      10
			eq?     
			bnt      code_08fc
			pushi    #setScript
			pushi    1
			lofsa    waterOrFireRingTalk
			push    
			lag      global2
			send     6
code_08fc:
			toss    
			jmp      code_0909
code_0900:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_0909:
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
			bnt      code_09b6
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_09b5
			pushi    3
			pushi    1560
			pushi    49
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_09b5:
			toss    
code_09b6:
			ret     
		)
	)
)

(instance firstInFrom550 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09eb
			ldi      2
			aTop     cycles
			jmp      code_0a54
code_09eb:
			dup     
			ldi      1
			eq?     
			bnt      code_0a1a
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    107
			callb    proc0_6,  2
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    194
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    100
			pushi    160
			pushSelf
			lag      global0
			send     22
			jmp      code_0a54
code_0a1a:
			dup     
			ldi      2
			eq?     
			bnt      code_0a35
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    3
			pushi    1560
			pushi    0
			pushSelf
			calle    proc13_5,  6
			jmp      code_0a54
code_0a35:
			dup     
			ldi      3
			eq?     
			bnt      code_0a54
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
			pushi    #dispose
			pushi    0
			self     4
code_0a54:
			toss    
			ret     
		)
	)
)

(instance withSon5B6A of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ab5
			pushi    7
			pushi    2
			lea      @local2
			push    
			pushi    9
			pushi    0
			lea      @local51
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ad0
code_0ab5:
			dup     
			ldi      1
			eq?     
			bnt      code_0ad0
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    #dispose
			pushi    0
			self     4
code_0ad0:
			toss    
			ret     
		)
	)
)

(instance comeFromEstWithSons of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b3d
			pushi    11
			pushi    4
			lea      @local7
			push    
			pushi    9
			pushi    0
			lea      @local48
			push    
			pushi    1
			lea      @local51
			push    
			pushi    2
			lea      @local54
			push    
			pushi    4
			pushSelf
			calle    proc851_0,  22
			jmp      code_0b5c
code_0b3d:
			dup     
			ldi      1
			eq?     
			bnt      code_0b5c
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
			pushi    #dispose
			pushi    0
			self     4
code_0b5c:
			toss    
			ret     
		)
	)
)

(instance caskArea of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    0
			pushi    124
			pushi    16
			pushi    125
			pushi    30
			pushi    147
			pushi    26
			pushi    163
			pushi    0
			pushi    167
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
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
			bnt      code_0bf0
			pushi    3
			pushi    1560
			pushi    17
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c21
code_0bf0:
			dup     
			ldi      3
			eq?     
			bnt      code_0c18
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_0c06
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_0c06:
			bnt      code_0c21
			pushi    #setScript
			pushi    1
			lofsa    caskConvToSon
			push    
			lag      global2
			send     6
			jmp      code_0c21
code_0c18:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0c21:
			toss    
			ret     
		)
	)
)

(instance tunnelFloor of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    50
			pushi    16
			pushi    122
			pushi    31
			pushi    122
			pushi    46
			pushi    142
			pushi    48
			pushi    148
			pushi    62
			pushi    150
			pushi    93
			pushi    155
			pushi    139
			pushi    155
			pushi    165
			pushi    147
			pushi    208
			pushi    152
			pushi    253
			pushi    149
			pushi    276
			pushi    149
			pushi    289
			pushi    150
			pushi    280
			pushi    162
			pushi    249
			pushi    157
			pushi    211
			pushi    163
			pushi    200
			pushi    170
			pushi    176
			pushi    172
			pushi    159
			pushi    183
			pushi    150
			pushi    170
			pushi    132
			pushi    166
			pushi    113
			pushi    162
			pushi    81
			pushi    174
			pushi    76
			pushi    165
			pushi    45
			pushi    160
			pushi    22
			pushi    165
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     114
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
			bnt      code_0d3c
			pushi    3
			pushi    1560
			pushi    48
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d45
code_0d3c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0d45:
			toss    
			ret     
		)
	)
)

(instance caskConvToSon of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0db9
			pushi    7
			pushi    2
			lea      @local16
			push    
			pushi    9
			pushi    0
			lea      @local48
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0dc5
code_0db9:
			dup     
			ldi      1
			eq?     
			bnt      code_0dc5
			pushi    #dispose
			pushi    0
			self     4
code_0dc5:
			toss    
			ret     
		)
	)
)

(instance caskClikFirst of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e2c
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    108
			callb    proc0_6,  2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    0
			pushi    173
			pushSelf
			lag      global0
			send     12
			jmp      code_0f54
code_0e2c:
			dup     
			ldi      1
			eq?     
			bnt      code_0e41
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			ldi      95
			aTop     cycles
			jmp      code_0f54
code_0e41:
			dup     
			ldi      2
			eq?     
			bnt      code_0e5b
			pushi    #loop
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			lag      global0
			send     10
			ldi      6
			aTop     cycles
			jmp      code_0f54
code_0e5b:
			dup     
			ldi      3
			eq?     
			bnt      code_0e77
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    90
			pushi    160
			pushSelf
			lag      global0
			send     12
			jmp      code_0f54
code_0e77:
			dup     
			ldi      4
			eq?     
			bnt      code_0e97
			pushi    7
			pushi    2
			lea      @local23
			push    
			pushi    9
			pushi    0
			lea      @local48
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0f54
code_0e97:
			dup     
			ldi      5
			eq?     
			bnt      code_0ec8
			pushi    #setHeading
			pushi    1
			pushi    270
			lofsa    sonHob
			send     6
			pushi    #setHeading
			pushi    1
			pushi    270
			lofsa    sonDicken
			send     6
			pushi    #setHeading
			pushi    1
			pushi    270
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0f54
code_0ec8:
			dup     
			ldi      6
			eq?     
			bnt      code_0f39
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    40
			lofsa    sonHob
			send     16
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    80
			lofsa    sonDicken
			send     16
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    5
			pushi    155
			pushSelf
			lofsa    sonHal
			send     18
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    15
			lag      global0
			send     16
			jmp      code_0f54
code_0f39:
			dup     
			ldi      7
			eq?     
			bnt      code_0f54
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0f54:
			toss    
			ret     
		)
	)
)

(instance caskClikSecond of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0fba
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    109
			callb    proc0_6,  2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    0
			pushi    173
			pushSelf
			lag      global0
			send     12
			jmp      code_10dd
code_0fba:
			dup     
			ldi      1
			eq?     
			bnt      code_0fcf
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			ldi      95
			aTop     cycles
			jmp      code_10dd
code_0fcf:
			dup     
			ldi      2
			eq?     
			bnt      code_0fe9
			pushi    #loop
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			lag      global0
			send     10
			ldi      6
			aTop     cycles
			jmp      code_10dd
code_0fe9:
			dup     
			ldi      3
			eq?     
			bnt      code_1005
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    90
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_10dd
code_1005:
			dup     
			ldi      4
			eq?     
			bnt      code_1020
			pushi    5
			pushi    1
			lea      @local29
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_10dd
code_1020:
			dup     
			ldi      5
			eq?     
			bnt      code_1051
			pushi    #setHeading
			pushi    1
			pushi    270
			lofsa    sonHob
			send     6
			pushi    #setHeading
			pushi    1
			pushi    270
			lofsa    sonDicken
			send     6
			pushi    #setHeading
			pushi    1
			pushi    270
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_10dd
code_1051:
			dup     
			ldi      6
			eq?     
			bnt      code_10c2
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    40
			lofsa    sonHob
			send     16
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    80
			lofsa    sonDicken
			send     16
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    5
			pushi    155
			pushSelf
			lofsa    sonHal
			send     18
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    15
			lag      global0
			send     16
			jmp      code_10dd
code_10c2:
			dup     
			ldi      7
			eq?     
			bnt      code_10dd
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    550
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_10dd:
			toss    
			ret     
		)
	)
)

(instance eastTunlWay of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    40
			pushi    277
			pushi    147
			pushi    280
			pushi    123
			pushi    280
			pushi    108
			pushi    281
			pushi    98
			pushi    278
			pushi    89
			pushi    277
			pushi    80
			pushi    281
			pushi    72
			pushi    290
			pushi    72
			pushi    295
			pushi    68
			pushi    305
			pushi    69
			pushi    304
			pushi    76
			pushi    305
			pushi    80
			pushi    303
			pushi    88
			pushi    305
			pushi    94
			pushi    310
			pushi    104
			pushi    308
			pushi    117
			pushi    312
			pushi    121
			pushi    303
			pushi    125
			pushi    295
			pushi    141
			pushi    292
			pushi    149
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     94
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
			bnt      code_11e7
			pushi    1
			pushi    105
			callb    proc0_5,  2
			not     
			bnt      code_11d8
			pushi    2
			pushi    1560
			pushi    20
			calle    proc13_4,  4
			pushi    3
			pushi    1560
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_11f0
code_11d8:
			pushi    3
			pushi    1560
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_11f0
code_11e7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_11f0:
			toss    
			ret     
		)
	)
)

(instance westTunlWay of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    26
			pushi    14
			pushi    120
			pushi    15
			pushi    79
			pushi    11
			pushi    74
			pushi    12
			pushi    62
			pushi    20
			pushi    51
			pushi    30
			pushi    61
			pushi    34
			pushi    63
			pushi    33
			pushi    79
			pushi    35
			pushi    84
			pushi    35
			pushi    91
			pushi    38
			pushi    98
			pushi    34
			pushi    104
			pushi    33
			pushi    118
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     66
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
			bnt      code_12ce
			pushi    1
			pushi    106
			callb    proc0_5,  2
			not     
			bnt      code_12bf
			pushi    3
			pushi    1560
			pushi    18
			pushi    1
			calle    proc13_4,  6
			jmp      code_12d7
code_12bf:
			pushi    3
			pushi    1560
			pushi    19
			pushi    1
			calle    proc13_4,  6
			jmp      code_12d7
code_12ce:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_12d7:
			toss    
			ret     
		)
	)
)

(instance tunnelWall of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    98
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    168
			pushi    39
			pushi    161
			pushi    54
			pushi    162
			pushi    75
			pushi    166
			pushi    81
			pushi    176
			pushi    98
			pushi    168
			pushi    118
			pushi    164
			pushi    130
			pushi    170
			pushi    139
			pushi    170
			pushi    151
			pushi    175
			pushi    156
			pushi    187
			pushi    188
			pushi    172
			pushi    202
			pushi    173
			pushi    215
			pushi    165
			pushi    230
			pushi    161
			pushi    255
			pushi    158
			pushi    282
			pushi    164
			pushi    293
			pushi    151
			pushi    300
			pushi    132
			pushi    313
			pushi    122
			pushi    310
			pushi    114
			pushi    312
			pushi    108
			pushi    305
			pushi    90
			pushi    306
			pushi    81
			pushi    305
			pushi    67
			pushi    294
			pushi    68
			pushi    279
			pushi    71
			pushi    275
			pushi    86
			pushi    279
			pushi    95
			pushi    277
			pushi    146
			pushi    221
			pushi    147
			pushi    163
			pushi    140
			pushi    159
			pushi    147
			pushi    72
			pushi    146
			pushi    35
			pushi    120
			pushi    34
			pushi    108
			pushi    38
			pushi    96
			pushi    35
			pushi    83
			pushi    35
			pushi    63
			pushi    29
			pushi    59
			pushi    21
			pushi    51
			pushi    11
			pushi    60
			pushi    13
			pushi    79
			pushi    13
			pushi    124
			pushi    0
			pushi    123
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     210
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
			ldi      3
			eq?     
			bnt      code_145d
			pushi    3
			pushi    1560
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_147c
code_145d:
			dup     
			ldi      2
			eq?     
			bnt      code_1473
			pushi    3
			pushi    1560
			pushi    24
			pushi    1
			calle    proc13_4,  6
			jmp      code_147c
code_1473:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_147c:
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
			bnt      code_14f1
			pushi    7
			pushi    2
			lea      @local33
			push    
			lea      @local54
			push    
			pushi    0
			lea      @local48
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1503
code_14f1:
			dup     
			ldi      1
			eq?     
			bnt      code_1503
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1503:
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
			bnt      code_1567
			pushi    7
			pushi    2
			lea      @local42
			push    
			lea      @local54
			push    
			pushi    0
			lea      @local48
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1579
code_1567:
			dup     
			ldi      1
			eq?     
			bnt      code_1579
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1579:
			toss    
			ret     
		)
	)
)
