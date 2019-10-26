;;; Sierra Script 1.0 - (do not remove this comment)
(script# 110)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n992)
(use n994)
(use n999)

(public
	rm110 0
)

(local
	local0
	local1
	[local2 6] = [1110 26 1 1 1]
	[local8 4] = [1110 29 1]
	[local12 4] = [1110 30 1]
	[local16 5] = [1110 31 2 1]
)
(instance rm110 of Rm
	(properties)
	
	(method (init)
		(asm
			ldi      71
			sag      global112
			lsg      global130
			ldi      11
			eq?     
			bnt      code_005d
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_005d
			lsg      global155
			ldi      20
			ge?     
			bnt      code_005d
			pushi    #picture
			pushi    3
			pushi    803
			pTos     style
			pushi    7
			self     10
			jmp      code_006a
code_005d:
			pushi    #picture
			pushi    3
			pushi    110
			pTos     style
			pushi    10
			self     10
code_006a:
			pushi    #init
			pushi    0
			super    Rm,  4
			lsg      global130
			ldi      11
			eq?     
			bnt      code_00a5
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_00a5
			lsg      global155
			ldi      20
			ge?     
			bnt      code_00a5
			pushi    2
			pushi    1110
			pushi    33
			calle    proc13_4,  4
			ldi      65
			sag      global146
			pushi    #newRoom
			pushi    1
			pushi    176
			lag      global2
			send     6
			jmp      code_04c1
code_00a5:
			pushi    #section
			pushi    1
			pushi    4
			class    Wat
			send     6
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    147
			pushi    170
			pushi    188
			pushi    171
			pushi    184
			pushi    183
			pushi    166
			pushi    183
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     6
			lsg      global126
			ldi      0
			eq?     
			bnt      code_03f4
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_012d
			pushi    1
			pushi    137
			callb    proc0_5,  2
			not     
			bnt      code_0103
			ldi      0
			jmp      code_03f3
code_0103:
			pushi    1
			pushi    44
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    3
			pushi    128
			pushi    110
			pushi    755
			calle    proc958_0,  6
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    1
			self     10
			jmp      code_03f3
code_012d:
			dup     
			ldi      3
			eq?     
			bnt      code_0157
			pushi    1
			pushi    49
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    2
			pushi    128
			pushi    55
			callk    Load,  4
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    2
			self     10
			jmp      code_03f3
code_0157:
			dup     
			ldi      4
			eq?     
			bnt      code_0189
			pushi    1
			pushi    47
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    3
			pushi    128
			pushi    110
			pushi    755
			calle    proc958_0,  6
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    3
			self     10
			jmp      code_03f3
code_0189:
			dup     
			ldi      5
			eq?     
			bnt      code_026a
			pushi    1
			pushi    111
			callb    proc0_5,  2
			not     
			bnt      code_019d
			jmp      code_03f3
code_019d:
			pushi    1
			pushi    50
			callb    proc0_5,  2
			not     
			bnt      code_01d2
			pushi    1
			pushi    50
			callb    proc0_6,  2
			pushi    3
			pushi    128
			pushi    106
			pushi    25
			calle    proc958_0,  6
			ldi      1
			sal      local0
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    3
			callk    ScriptID,  4
			push    
			self     6
			jmp      code_03f3
code_01d2:
			pushi    1
			pushi    147
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    1
			pushi    55
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    #script
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_03f3
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			push    
			ldi      50
			lt?     
			bnt      code_0245
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			push    
			ldi      50
			lt?     
			bnt      code_022a
			pushi    2
			pushi    128
			pushi    25
			callk    Load,  4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    4
			callk    ScriptID,  4
			push    
			self     6
			jmp      code_03f3
code_022a:
			pushi    2
			pushi    128
			pushi    106
			callk    Load,  4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    5
			callk    ScriptID,  4
			push    
			self     6
			jmp      code_03f3
code_0245:
			pushi    142
			pushi    3
			lofsa    waitForMonk
			push    
			pushi    0
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			push    
			ldi      50
			lt?     
			bnt      code_0262
			ldi      5
			jmp      code_0264
code_0262:
			ldi      4
code_0264:
			push    
			self     10
			jmp      code_03f3
code_026a:
			dup     
			ldi      6
			eq?     
			bnt      code_0311
			pushi    #script
			pushi    0
			class    Wat
			send     4
			bnt      code_027f
			jmp      code_03f3
code_027f:
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_02cd
			pushi    1
			pushi    147
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			push    
			ldi      50
			lt?     
			bnt      code_02bc
			pushi    2
			pushi    128
			pushi    106
			callk    Load,  4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    5
			callk    ScriptID,  4
			push    
			self     6
			jmp      code_03f3
code_02bc:
			pushi    #setScript
			pushi    3
			lofsa    waitForMonk
			push    
			pushi    0
			pushi    4
			self     10
			jmp      code_03f3
code_02cd:
			pushi    1
			pushi    55
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			push    
			ldi      50
			lt?     
			bnt      code_0300
			pushi    2
			pushi    128
			pushi    25
			callk    Load,  4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    4
			callk    ScriptID,  4
			push    
			self     6
			jmp      code_03f3
code_0300:
			pushi    #setScript
			pushi    3
			lofsa    waitForMonk
			push    
			pushi    0
			pushi    5
			self     10
			jmp      code_03f3
code_0311:
			dup     
			ldi      8
			eq?     
			bnt      code_033d
			pushi    1
			pushi    135
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    2
			pushi    128
			pushi    53
			callk    Load,  4
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    6
			self     10
			jmp      code_03f3
code_033d:
			dup     
			ldi      9
			eq?     
			bnt      code_0371
			pushi    1
			pushi    36
			callb    proc0_5,  2
			bnt      code_03f3
			pushi    1
			pushi    28
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    2
			pushi    128
			pushi    72
			callk    Load,  4
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    7
			self     10
			jmp      code_03f3
code_0371:
			dup     
			ldi      11
			eq?     
			bnt      code_03c3
			pushi    4
			pushi    128
			pushi    160
			pushi    161
			pushi    162
			calle    proc958_0,  8
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    160
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    75
			pushi    150
			pushi    267
			pushi    1
			lofsa    willActions
			push    
			pushi    107
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     36
			jmp      code_03f3
code_03c3:
			dup     
			ldi      12
			eq?     
			bnt      code_03f3
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_03f3
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_03f3
			pushi    1
			pushi    136
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    8
			callk    ScriptID,  4
			push    
			self     6
code_03f3:
			toss    
code_03f4:
			pushi    2
			lofsa    street
			push    
			lofsa    ridge
			push    
			calle    proc806_3,  4
			pushi    0
			callb    proc0_2,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			lsg      global12
			dup     
			ldi      220
			eq?     
			bnt      code_043f
			lsg      global108
			ldi      4
			eq?     
			bnt      code_042c
			ldi      0
			sag      global116
			jmp      code_0430
code_042c:
			ldi      1
			sag      global116
code_0430:
			pushi    #setScript
			pushi    1
			lofsa    fromTheForest
			push    
			lag      global0
			send     6
			jmp      code_0496
code_043f:
			dup     
			ldi      120
			eq?     
			bnt      code_0455
			pushi    #setScript
			pushi    1
			lofsa    fromTheStreet
			push    
			lag      global0
			send     6
			jmp      code_0496
code_0455:
			dup     
			ldi      100
			eq?     
			bnt      code_047a
			lsg      global130
			ldi      1
			gt?     
			bnt      code_046b
			pushi    1
			pushi    137
			callb    proc0_6,  2
code_046b:
			pushi    #setScript
			pushi    1
			lofsa    fromTheForest
			push    
			lag      global0
			send     6
			jmp      code_0496
code_047a:
			pushi    #posn
			pushi    2
			pushi    120
			pushi    155
			pushi    6
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			lag      global0
			send     18
			pushi    1
			pushi    137
			callb    proc0_6,  2
code_0496:
			toss    
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      905
			ne?     
			bt       code_04b1
			pushi    #vol
			pushi    0
			lag      global100
			send     4
			push    
			ldi      127
			lt?     
code_04b1:
			bnt      code_04c1
			pushi    #number
			pushi    1
			pushi    905
			pushi    42
			pushi    0
			lag      global100
			send     10
code_04c1:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_04d0
			jmp      code_0532
code_04d0:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			bnt      code_051b
			lsg      global130
			ldi      5
			eq?     
			bnt      code_050c
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_050c
			lal      local0
			bnt      code_050c
			pushi    #qFight
			pushi    1
			pushi    #x
			pushi    0
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			send     4
			push    
			class    Wat
			send     6
code_050c:
			pushi    #setScript
			pushi    1
			lofsa    takeTheLowRoad
			push    
			lag      global0
			send     6
			jmp      code_0532
code_051b:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0532
			pushi    #setScript
			pushi    1
			lofsa    offScreen
			push    
			lag      global0
			send     6
code_0532:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0023
			pushi    2
			pushi    1110
			pushi    13
			calle    proc13_4,  4
			jmp      code_002e
code_0023:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_002e:
			ret     
		)
	)
)

(instance ridge of Feature
	(properties
		lookStr 12
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    0
			pushi    145
			pushi    319
			pushi    64
			pushi    319
			pushi    91
			pushi    199
			pushi    123
			pushi    184
			pushi    119
			pushi    163
			pushi    127
			pushi    157
			pushi    137
			pushi    127
			pushi    146
			pushi    169
			pushi    160
			pushi    319
			pushi    177
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
			send     62
			aTop     onMeCheck
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
)

(instance street of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    76
			pushi    123
			pushi    319
			pushi    67
			pushi    319
			pushi    94
			pushi    125
			pushi    146
			pushi    74
			pushi    144
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			aTop     onMeCheck
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0693
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_066b
			pushi    #script
			pushi    0
			lag      global2
			send     4
			push    
			lofsa    waitForEncounter
			ne?     
			bnt      code_066b
			pushi    #script
			pushi    0
			lag      global2
			send     4
			push    
			lofsa    waitForMonk
			ne?     
code_066b:
			bt       code_0676
			pushi    #script
			pushi    0
			class    Wat
			send     4
code_0676:
			bnt      code_0686
			pushi    2
			pushi    1110
			pushi    15
			calle    proc13_4,  4
			jmp      code_06c2
code_0686:
			pushi    2
			pushi    1110
			pushi    14
			calle    proc13_4,  4
			jmp      code_06c2
code_0693:
			dup     
			ldi      3
			eq?     
			bnt      code_06b7
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    50
			lag      global0
			send     10
			jmp      code_06c2
code_06b7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_06c2:
			toss    
			ret     
		)
	)
)

(instance takeTheLowRoad of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0771
			pushi    0
			callb    proc0_3,  0
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			lag      global0
			send     8
			jmp      code_0833
code_0771:
			dup     
			ldi      1
			eq?     
			bnt      code_07a7
			pushi    66
			pushi    #superClass
			pushi    11
			pushi    162
			pushi    1
			pushi    3
			pushi    283
			pushi    4
			class    MoveTo
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
			ldi      55
			add     
			push    
			pushSelf
			lag      global0
			send     24
			jmp      code_0833
code_07a7:
			dup     
			ldi      2
			eq?     
			bnt      code_0833
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_07ed
			pushi    569
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_07d6
			ldi      1
			jmp      code_07e4
code_07d6:
			dup     
			ldi      3
			eq?     
			bnt      code_07e2
			ldi      3
			jmp      code_07e4
code_07e2:
			ldi      2
code_07e4:
			toss    
			push    
			class    Wat
			send     6
			jmp      code_07f6
code_07ed:
			pushi    #enterDir
			pushi    1
			pushi    2
			class    Wat
			send     6
code_07f6:
			lsg      global130
			ldi      4
			eq?     
			bnt      code_0829
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_0829
			pushi    1
			pushi    153
			callb    proc0_5,  2
			bt       code_0818
			pushi    1
			pushi    174
			callb    proc0_5,  2
code_0818:
			bnt      code_0829
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0833
code_0829:
			pushi    #newRoom
			pushi    1
			pushi    120
			lag      global2
			send     6
code_0833:
			toss    
			ret     
		)
	)
)

(instance offScreen of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0910
			pushi    0
			callb    proc0_3,  0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			dup     
			ldi      2
			eq?     
			bnt      code_08b8
			ldi      1
			sag      global116
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
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
			jmp      code_090c
code_08b8:
			dup     
			ldi      4
			eq?     
			bnt      code_08e7
			ldi      0
			sag      global116
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
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
			jmp      code_090c
code_08e7:
			ldi      1
			sag      global116
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
			ldi      55
			add     
			push    
			pushSelf
			lag      global0
			send     12
code_090c:
			toss    
			jmp      code_09ec
code_0910:
			dup     
			ldi      1
			eq?     
			bnt      code_09ec
			lsg      global130
			ldi      4
			eq?     
			bnt      code_094a
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_094a
			pushi    1
			pushi    153
			callb    proc0_5,  2
			bt       code_0939
			pushi    1
			pushi    174
			callb    proc0_5,  2
code_0939:
			bnt      code_094a
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_09ec
code_094a:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_09a7
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0975
			pushi    #enterDir
			pushi    1
			pushi    2
			class    Wat
			send     6
			jmp      code_0999
code_0975:
			dup     
			ldi      1
			eq?     
			bnt      code_0988
			pushi    #enterDir
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_0999
code_0988:
			dup     
			ldi      3
			eq?     
			bnt      code_0999
			pushi    #enterDir
			pushi    1
			pushi    3
			class    Wat
			send     6
code_0999:
			toss    
			pushi    #newRoom
			pushi    1
			pushi    120
			lag      global2
			send     6
			jmp      code_09ec
code_09a7:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_09d8
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_09d8
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_09d8
			pushi    1
			pushi    44
			callb    proc0_5,  2
			bnt      code_09d8
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_09ec
code_09d8:
			pushi    #edgeHit
			pushi    1
			pushi    2
			lag      global0
			send     6
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
code_09ec:
			toss    
			ret     
		)
	)
)

(instance fromTheForest of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a59
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    46
			pushi    233
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    107
			pushi    150
			pushSelf
			lag      global0
			send     24
			jmp      code_0afb
code_0a59:
			dup     
			ldi      1
			eq?     
			bnt      code_0a6e
			pushi    #setHeading
			pushi    2
			pushi    45
			pushSelf
			lag      global0
			send     8
			jmp      code_0afb
code_0a6e:
			dup     
			ldi      2
			eq?     
			bnt      code_0ae0
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0a9b
			pushi    1
			pushi    137
			callb    proc0_5,  2
			not     
			bnt      code_0a9b
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    18
			pushi    9
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0afb
code_0a9b:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0ab2
			pushi    #setScript
			pushi    1
			lofsa    day11Script
			push    
			pToa     client
			send     6
			jmp      code_0afb
code_0ab2:
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_0ad4
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_0ad4
			pushi    #setScript
			pushi    1
			lofsa    seeKnight
			push    
			pToa     client
			send     6
			jmp      code_0afb
code_0ad4:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0afb
code_0ae0:
			dup     
			ldi      3
			eq?     
			bnt      code_0afb
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    1
			lag      global2
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_0afb:
			toss    
			ret     
		)
	)
)

(instance fromTheStreet of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b7c
			pushi    0
			callb    proc0_3,  0
			pushi    #setPri
			pushi    1
			pushi    11
			lag      global109
			send     6
			pushi    #posn
			pushi    2
			pushi    119
			pushi    195
			pushi    107
			pushi    0
			pushi    66
			pushi    1
			pushi    11
			pushi    162
			pushi    1
			pushi    2
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    119
			pushi    143
			pushSelf
			lag      global0
			send     36
			jmp      code_0c6d
code_0b7c:
			dup     
			ldi      1
			eq?     
			bnt      code_0bac
			pushi    #setPri
			pushi    1
			pushi    65535
			lag      global109
			send     6
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    160
			pushSelf
			lag      global0
			send     18
			jmp      code_0c6d
code_0bac:
			dup     
			ldi      2
			eq?     
			bnt      code_0bc7
			pushi    #setLoop
			pushi    1
			pushi    65535
			pushi    228
			pushi    2
			pushi    45
			pushSelf
			lag      global0
			send     14
			jmp      code_0c6d
code_0bc7:
			dup     
			ldi      3
			eq?     
			bnt      code_0c52
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0bf4
			pushi    1
			pushi    137
			callb    proc0_5,  2
			not     
			bnt      code_0bf4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    18
			pushi    9
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0c6d
code_0bf4:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0c0b
			pushi    #setScript
			pushi    1
			lofsa    day11Script
			push    
			pToa     client
			send     6
			jmp      code_0c6d
code_0c0b:
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_0c2d
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_0c2d
			pushi    #setScript
			pushi    1
			lofsa    seeKnight
			push    
			pToa     client
			send     6
			jmp      code_0c6d
code_0c2d:
			pushi    1
			pushi    70
			callb    proc0_5,  2
			bnt      code_0c46
			pushi    1
			pushi    70
			callb    proc0_7,  2
			pushi    2
			pushi    1110
			pushi    3
			calle    proc13_4,  4
code_0c46:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0c6d
code_0c52:
			dup     
			ldi      4
			eq?     
			bnt      code_0c6d
			pushi    #setScript
			pushi    3
			lofsa    waitForEncounter
			push    
			pushi    0
			pushi    1
			lag      global2
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_0c6d:
			toss    
			ret     
		)
	)
)

(instance waitForEncounter of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cc3
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			aTop     seconds
			jmp      code_0d5d
code_0cc3:
			dup     
			ldi      1
			eq?     
			bnt      code_0d5d
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0d58
			pushi    142
			pushi    1
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_0cf3
			pushi    1
			pushi    44
			callb    proc0_6,  2
			pushi    2
			pushi    18
			pushi    0
			callk    ScriptID,  4
			jmp      code_0d4f
code_0cf3:
			dup     
			ldi      2
			eq?     
			bnt      code_0d0a
			pushi    1
			pushi    49
			callb    proc0_6,  2
			pushi    2
			pushi    18
			pushi    1
			callk    ScriptID,  4
			jmp      code_0d4f
code_0d0a:
			dup     
			ldi      3
			eq?     
			bnt      code_0d21
			pushi    1
			pushi    47
			callb    proc0_6,  2
			pushi    2
			pushi    18
			pushi    2
			callk    ScriptID,  4
			jmp      code_0d4f
code_0d21:
			dup     
			ldi      6
			eq?     
			bnt      code_0d3a
			pushi    1
			pushi    135
			callb    proc0_6,  2
			pushi    2
			pushi    18
			pushi    6
			callk    ScriptID,  4
			jmp      code_0d4f
code_0d3a:
			dup     
			ldi      7
			eq?     
			bnt      code_0d4f
			pushi    1
			pushi    28
			callb    proc0_6,  2
			pushi    2
			pushi    18
			pushi    7
			callk    ScriptID,  4
code_0d4f:
			toss    
			push    
			pToa     client
			send     6
			jmp      code_0d5d
code_0d58:
			pushi    #dispose
			pushi    0
			self     4
code_0d5d:
			toss    
			ret     
		)
	)
)

(instance waitForMonk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0db3
			pushi    2
			pushi    10
			pushi    20
			callk    Random,  4
			aTop     seconds
			jmp      code_0e16
code_0db3:
			dup     
			ldi      1
			eq?     
			bnt      code_0e16
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0e11
			pTos     register
			dup     
			ldi      4
			eq?     
			bnt      code_0dec
			pushi    2
			pushi    128
			pushi    106
			callk    Load,  4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    5
			callk    ScriptID,  4
			push    
			pToa     client
			send     6
			jmp      code_0e0d
code_0dec:
			dup     
			ldi      5
			eq?     
			bnt      code_0e0d
			pushi    2
			pushi    128
			pushi    25
			callk    Load,  4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    18
			pushi    4
			callk    ScriptID,  4
			push    
			pToa     client
			send     6
code_0e0d:
			toss    
			jmp      code_0e16
code_0e11:
			pushi    #dispose
			pushi    0
			self     4
code_0e16:
			toss    
			ret     
		)
	)
)

(instance blewHornDay11 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e70
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0ead
code_0e70:
			dup     
			ldi      1
			eq?     
			bnt      code_0e7e
			ldi      12
			aTop     ticks
			jmp      code_0ead
code_0e7e:
			dup     
			ldi      2
			eq?     
			bnt      code_0e9b
			pushi    7
			pushi    2
			lea      @local16
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ead
code_0e9b:
			dup     
			ldi      3
			eq?     
			bnt      code_0ead
			pushi    #newRoom
			pushi    1
			pushi    171
			lag      global2
			send     6
code_0ead:
			toss    
			ret     
		)
	)
)

(instance day11Script of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f01
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_0f61
code_0f01:
			dup     
			ldi      1
			eq?     
			bnt      code_0f43
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_0f25
			pushi    5
			pushi    1
			lea      @local8
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0f61
code_0f25:
			ldi      0
			sag      global155
			pushi    1
			pushi    64
			callb    proc0_6,  2
			pushi    5
			pushi    1
			lea      @local2
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0f61
code_0f43:
			dup     
			ldi      2
			eq?     
			bnt      code_0f51
			ldi      60
			aTop     ticks
			jmp      code_0f61
code_0f51:
			dup     
			ldi      3
			eq?     
			bnt      code_0f61
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0f61:
			toss    
			ret     
		)
	)
)

(instance seeKnight of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0fb1
			ldi      12
			aTop     ticks
			jmp      code_100b
code_0fb1:
			dup     
			ldi      1
			eq?     
			bnt      code_0fc7
			pushi    3
			pushi    1110
			pushi    4
			pushSelf
			calle    proc13_4,  6
			jmp      code_100b
code_0fc7:
			dup     
			ldi      2
			eq?     
			bnt      code_0fdd
			pushi    3
			pushi    1110
			pushi    5
			pushSelf
			calle    proc13_4,  6
			jmp      code_100b
code_0fdd:
			dup     
			ldi      3
			eq?     
			bnt      code_0ff3
			pushi    3
			pushi    1110
			pushi    6
			pushSelf
			calle    proc13_4,  6
			jmp      code_100b
code_0ff3:
			dup     
			ldi      4
			eq?     
			bnt      code_100b
			pushi    #setScript
			pushi    1
			lofsa    takeTheLowRoad
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_100b:
			toss    
			ret     
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_110b
			lsp      param2
			ldi      1
			eq?     
			bnt      code_110b
			lsg      global130
			ldi      11
			eq?     
			bnt      code_1073
			pushi    #setScript
			pushi    1
			lofsa    blewHornDay11
			push    
			lag      global2
			send     6
			ldi      1
			jmp      code_110b
code_1073:
			pushi    4
			pushi    #script
			pushi    0
			lag      global2
			send     4
			push    
			pushi    0
			lofsa    waitForEncounter
			push    
			lofsa    waitForMonk
			push    
			calle    proc999_5,  8
			bnt      code_10b9
			ldi      1
			lal      local1
			bnt      code_10a8
			ldi      0
			sal      local1
			pushi    2
			pushi    1110
			pushi    8
			calle    proc13_4,  4
			jmp      code_110b
code_10a8:
			ldi      1
			sal      local1
			pushi    2
			pushi    1110
			pushi    7
			calle    proc13_4,  4
			jmp      code_110b
code_10b9:
			ldi      1
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      9
			eq?     
			bnt      code_10d8
			pushi    2
			pushi    1110
			pushi    9
			calle    proc13_4,  4
			jmp      code_110a
code_10d8:
			dup     
			ldi      1
			eq?     
			bnt      code_10ec
			pushi    2
			pushi    1110
			pushi    10
			calle    proc13_4,  4
			jmp      code_110a
code_10ec:
			dup     
			ldi      3
			eq?     
			bnt      code_1100
			pushi    2
			pushi    1110
			pushi    10
			calle    proc13_4,  4
			jmp      code_110a
code_1100:
			pushi    2
			pushi    1110
			pushi    11
			calle    proc13_4,  4
code_110a:
			toss    
code_110b:
			ret     
		)
	)
)

(instance willActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      5
			eq?     
			bnt      code_1146
			ldi      1
			pushi    4
			pushi    1
			lea      @local12
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
code_1146:
			ret     
		)
	)
)
