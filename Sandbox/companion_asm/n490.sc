;;; Sierra Script 1.0 - (do not remove this comment)
(script# 490)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n813)
(use n851)
(use n945)
(use n950)
(use n958)
(use n989)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	HedgeRow 0
	itsToLate 1
	runFerDoor 2
)

(local
	local0
	[local1 4] = [1490 7 1]
	[local5 4] = [1490 8 1]
	[local9 4] = [1490 14 1]
	[local13 9] = [431 0 2 4 23 34 24 25 1]
)
(procedure (localproc_0016 param1 param2)
	(asm
		lsp      param2
		lap      param1
		lt?     
		bnt      code_0023
		ldi      0
		jmp      code_0032
code_0023:
		pushi    1
		pushi    2
		lsp      param1
		lsp      param2
		lap      param1
		div     
		push    
		call     localproc_0016,  4
		add     
code_0032:
		ret     
	)
)

(class HedgeRow of Rm
	(properties
		script 0
		number 0
		timer 0
		keep 0
		initialized 0
		lookStr 0
		picture 490
		style $ffff
		horizon 0
		controls 0
		north 0
		east 0
		south 0
		west 0
		curPic 0
		picAngle 0
		vanishingX -4000
		vanishingY -6000
		obstacles 0
		teleX 0
		teleY 0
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_4,  0
			lag      global25
			bnt      code_00de
			pushi    #dispose
			pushi    0
			send     4
code_00de:
			lsg      global12
			ldi      85
			gt?     
			bnt      code_011b
			pushi    13
			pushi    130
			pushi    30
			pushi    35
			pushi    40
			pushi    45
			pushi    50
			pushi    55
			pushi    60
			pushi    65
			pushi    70
			pushi    75
			pushi    80
			pushi    85
			calle    proc958_0,  26
			pushi    4
			pushi    128
			pushi    500
			pushi    12
			pushi    13
			calle    proc958_0,  8
code_011b:
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    1
			lofsa    DMZ
			push    
			calle    proc806_3,  2
			+ag      global158
			lsg      global130
			ldi      5
			eq?     
			bt       code_013f
			lsg      global130
			ldi      6
			eq?     
code_013f:
			bnt      code_0151
			pushi    #actions
			pushi    1
			lofsa    egoMonkActions
			push    
			lag      global0
			send     6
			jmp      code_0174
code_0151:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0168
			pushi    #actions
			pushi    1
			lofsa    egoOutlawActions
			push    
			lag      global0
			send     6
			jmp      code_0174
code_0168:
			pushi    #actions
			pushi    1
			lofsa    egoHornActions
			push    
			lag      global0
			send     6
code_0174:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_018a
			pushi    3
			lsg      global111
			pushi    12
			pushi    13
			callb    proc0_2,  6
			jmp      code_0195
code_018a:
			pushi    3
			lsg      global111
			pushi    25
			pushi    26
			callb    proc0_2,  6
code_0195:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_01a9
			pushi    #z
			pushi    1
			pushi    22
			lag      global109
			send     6
			jmp      code_01b2
code_01a9:
			pushi    #z
			pushi    1
			pushi    20
			lag      global109
			send     6
code_01b2:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_01d2
			pushi    #style
			pushi    1
			pushi    14
			self     6
			jmp      code_020c
code_01d2:
			dup     
			ldi      3
			eq?     
			bnt      code_01e3
			pushi    #style
			pushi    1
			pushi    13
			self     6
			jmp      code_020c
code_01e3:
			dup     
			ldi      2
			eq?     
			bnt      code_01f4
			pushi    #style
			pushi    1
			pushi    12
			self     6
			jmp      code_020c
code_01f4:
			dup     
			ldi      4
			eq?     
			bnt      code_0205
			pushi    #style
			pushi    1
			pushi    11
			self     6
			jmp      code_020c
code_0205:
			pushi    #style
			pushi    1
			pushi    100
			self     6
code_020c:
			toss    
			pushi    #setScript
			pushi    1
			lofsa    egoEnters
			push    
			lag      global0
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #overlay
			pushi    1
			lsg      global11
			self     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    63
			pushi    #superClass
			pushi    2
			pushi    2
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			call     localproc_0016,  4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      16
			or      
			push    
			lag      global0
			send     12
			pushi    63
			pushi    #superClass
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global109
			send     4
			push    
			ldi      16
			or      
			push    
			lag      global109
			send     12
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			le?     
			bt       code_02a4
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      317
			ge?     
			bt       code_02a4
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			le?     
			bt       code_02a4
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      187
			ge?     
code_02a4:
			bnt      code_02d0
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_02d0
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			sag      global131
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			sag      global137
code_02d0:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			bnt      code_038f
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_038f
			pushi    0
			callb    proc0_3,  0
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0318
			pushi    377
			pushi    #superClass
			lsg      global11
			ldi      5
			add     
			push    
			lag      global2
			send     6
			jmp      code_038e
code_0318:
			dup     
			ldi      3
			eq?     
			bnt      code_0361
			lsg      global11
			ldi      45
			eq?     
			bnt      code_0350
			lsg      global130
			ldi      10
			eq?     
			bnt      code_033e
			pushi    #setScript
			pushi    1
			lofsa    itsToLate
			push    
			lag      global0
			send     6
			jmp      code_038e
code_033e:
			ldi      0
			sag      global158
			pushi    #newRoom
			pushi    1
			pushi    480
			lag      global2
			send     6
			jmp      code_038e
code_0350:
			pushi    377
			pushi    #superClass
			lsg      global11
			ldi      5
			sub     
			push    
			lag      global2
			send     6
			jmp      code_038e
code_0361:
			dup     
			ldi      2
			eq?     
			bnt      code_0379
			pushi    377
			pushi    #superClass
			lsg      global11
			ldi      15
			sub     
			push    
			lag      global2
			send     6
			jmp      code_038e
code_0379:
			dup     
			ldi      4
			eq?     
			bnt      code_038e
			pushi    377
			pushi    #superClass
			lsg      global11
			ldi      15
			add     
			push    
			lag      global2
			send     6
code_038e:
			toss    
code_038f:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     6
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			lsg      global13
			ldi      85
			gt?     
			bnt      code_03e6
			pushi    13
			pushi    490
			pushi    30
			pushi    35
			pushi    40
			pushi    45
			pushi    50
			pushi    55
			pushi    60
			pushi    65
			pushi    70
			pushi    75
			pushi    80
			pushi    85
			callk    DisposeScript,  26
code_03e6:
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0060
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0052
			pushi    3
			pushi    1490
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_00ce
code_0052:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
			jmp      code_00ce
code_0060:
			dup     
			ldi      4
			eq?     
			bnt      code_00c3
			lsp      param2
			ldi      0
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      2
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      11
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      14
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      12
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      10
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      18
			eq?     
			bt       code_00a4
			lsp      param2
			ldi      13
			eq?     
code_00a4:
			bnt      code_00b5
			pushi    3
			pushi    1490
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_00ce
code_00b5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
			jmp      code_00ce
code_00c3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
code_00ce:
			toss    
			ret     
		)
	)
)

(class Hedge of PicView
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		view 500
		loop 0
		cel 0
		priority -1
		signal $0000
		palette 0
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04a4
			pTos     loop
			ldi      1
			eq?     
			bnt      code_0496
			pushi    3
			pushi    1490
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_04dc
code_0496:
			pushi    3
			pushi    1490
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_04dc
code_04a4:
			dup     
			ldi      3
			eq?     
			bnt      code_04d1
			pTos     loop
			ldi      1
			eq?     
			bnt      code_04c2
			pushi    3
			pushi    1490
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_04dc
code_04c2:
			pushi    3
			pushi    1490
			pushi    12
			pushi    1
			calle    proc13_4,  6
			jmp      code_04dc
code_04d1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_04dc:
			toss    
			ret     
		)
	)
)

(instance hornSound of Sound
	(properties
		flags $0001
		number 904
	)
)

(instance DMZ of Feature
	(properties
		y 6
		nsBottom 12
		nsRight 319
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
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			lsg      global19
			ldi      0
			eq?     
			bnt      code_05ee
			lsg      global70
			ldi      0
			gt?     
			bnt      code_05ee
			lsg      global70
			ldi      319
			lt?     
			bnt      code_05ee
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_05ee
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #setScript
			pushi    1
			lofsa    northToAlaska
			push    
			lag      global0
			send     6
			jmp      code_05f7
code_05ee:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
code_05f7:
			ret     
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0acd
			lag      global143
			not     
			bnt      code_0672
			pushi    0
			callb    proc0_3,  0
code_0672:
			lsg      global12
			ldi      500
			eq?     
			bnt      code_06b2
			pushi    #posn
			pushi    2
			pushi    108
			pushi    50
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lag      global0
			send     18
			lsg      global126
			ldi      0
			eq?     
			bnt      code_06a2
			pushi    #z
			pushi    1
			pushi    22
			lag      global109
			send     6
			jmp      code_06ab
code_06a2:
			pushi    #z
			pushi    1
			pushi    20
			lag      global109
			send     6
code_06ab:
			ldi      18
			aTop     ticks
			jmp      code_0b89
code_06b2:
			lsg      global12
			ldi      480
			eq?     
			bnt      code_073b
			lsg      global104
			ldi      160
			lt?     
			bnt      code_06f1
			pushi    #posn
			pushi    2
			pushi    204
			pushi    188
			pushi    412
			pushi    1
			pushi    1
			pushi    516
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    191
			pushi    171
			pushSelf
			lag      global0
			send     36
			jmp      code_071b
code_06f1:
			pushi    #posn
			pushi    2
			pushi    264
			pushi    188
			pushi    412
			pushi    1
			pushi    1
			pushi    516
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    267
			pushi    154
			pushSelf
			lag      global0
			send     36
code_071b:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_072f
			pushi    #z
			pushi    1
			pushi    22
			lag      global109
			send     6
			jmp      code_0b89
code_072f:
			pushi    #z
			pushi    1
			pushi    20
			lag      global109
			send     6
			jmp      code_0b89
code_073b:
			pushi    4
			pushi    1
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0759
			lag      global104
			jmp      code_0786
code_0759:
			dup     
			ldi      3
			eq?     
			bnt      code_0765
			lag      global104
			jmp      code_0786
code_0765:
			dup     
			ldi      2
			eq?     
			bnt      code_0771
			ldi      0
			jmp      code_0786
code_0771:
			dup     
			ldi      4
			eq?     
			bnt      code_077e
			ldi      319
			jmp      code_0786
code_077e:
			pushi    #teleX
			pushi    0
			lag      global2
			send     4
code_0786:
			toss    
			push    
			pushi    3
			pushi    1
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			dup     
			ldi      2
			eq?     
			bnt      code_07a6
			lag      global105
			jmp      code_07d3
code_07a6:
			dup     
			ldi      4
			eq?     
			bnt      code_07b2
			lag      global105
			jmp      code_07d3
code_07b2:
			dup     
			ldi      1
			eq?     
			bnt      code_07bf
			ldi      189
			jmp      code_07d3
code_07bf:
			dup     
			ldi      3
			eq?     
			bnt      code_07cb
			ldi      0
			jmp      code_07d3
code_07cb:
			pushi    #teleY
			pushi    0
			lag      global2
			send     4
code_07d3:
			toss    
			push    
			pushi    54
			pushi    1
			pushi    3
			pushi    55
			pushi    1
			pushi    2
			pushi    66
			pushi    1
			lsg      global131
			pushi    288
			pushi    1
			lsg      global137
			pushi    412
			pushi    1
			pushi    1
			pushi    516
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lag      global0
			send     52
			lsg      global126
			ldi      0
			eq?     
			bnt      code_080e
			pushi    #z
			pushi    1
			pushi    22
			lag      global109
			send     6
			jmp      code_0817
code_080e:
			pushi    #z
			pushi    1
			pushi    20
			lag      global109
			send     6
code_0817:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_08ac
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      290
			gt?     
			bnt      code_0858
			lsg      global12
			ldi      50
			eq?     
			bnt      code_0858
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    317
			pushi    24
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_0858:
			lsg      global12
			ldi      50
			eq?     
			bnt      code_0884
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      290
			gt?     
			bnt      code_0884
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    314
			pushi    27
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_0884:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      33
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_08ac:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_08e9
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      11
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_08e9:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_09ba
			lsg      global12
			ldi      75
			eq?     
			bnt      code_0928
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      78
			lt?     
			bnt      code_0928
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    13
			pushi    32
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_0928:
			lsg      global12
			ldi      50
			eq?     
			bnt      code_094a
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      150
			lt?     
			bnt      code_094a
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			gt?     
code_094a:
			bt       code_098c
			lsg      global12
			ldi      75
			eq?     
			bt       code_098c
			lsg      global12
			ldi      55
			eq?     
			bnt      code_0976
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      118
			lt?     
			bnt      code_0976
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      88
			gt?     
code_0976:
			bt       code_098c
			lsg      global12
			ldi      65
			eq?     
			bnt      code_0996
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      60
			ge?     
code_098c:
			bnt      code_0996
			ldi      12
			aTop     ticks
			jmp      code_0b89
code_0996:
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      20
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
			jmp      code_0b89
code_09ba:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0ac6
			lsg      global12
			ldi      60
			eq?     
			bnt      code_09fa
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      70
			lt?     
			bnt      code_09fa
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    317
			pushi    24
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_09fa:
			lsg      global12
			ldi      35
			eq?     
			bnt      code_0a1c
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      150
			lt?     
			bnt      code_0a1c
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			gt?     
code_0a1c:
			bt       code_0a42
			lsg      global12
			ldi      65
			eq?     
			bnt      code_0a32
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      120
			gt?     
code_0a32:
			bt       code_0a42
			lsg      global12
			ldi      40
			eq?     
			bt       code_0a42
			lsg      global12
			ldi      60
			eq?     
code_0a42:
			bnt      code_0a4c
			ldi      12
			aTop     ticks
			jmp      code_0b89
code_0a4c:
			lsg      global12
			ldi      65
			eq?     
			bnt      code_0a77
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      78
			lt?     
			bnt      code_0a77
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    317
			pushi    24
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_0a77:
			lsg      global12
			ldi      30
			eq?     
			bnt      code_0aa2
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      22
			lt?     
			bnt      code_0aa2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    314
			pushi    27
			pushSelf
			lag      global0
			send     12
			jmp      code_0b89
code_0aa2:
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      20
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
			jmp      code_0b89
code_0ac6:
			ldi      12
			aTop     ticks
			jmp      code_0b89
code_0acd:
			dup     
			ldi      1
			eq?     
			bnt      code_0b89
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0b09
			lsg      global158
			ldi      11
			ge?     
			bnt      code_0b09
			pushi    #setScript
			pushi    1
			lofsa    itsToLate
			push    
			lag      global0
			send     6
			jmp      code_0b89
code_0b09:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0b36
			lsg      global11
			ldi      70
			eq?     
			bnt      code_0b36
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      75
			lt?     
			bnt      code_0b36
			pushi    #setScript
			pushi    1
			lofsa    thisIsIt
			push    
			lag      global0
			send     6
			jmp      code_0b89
code_0b36:
			lsg      global12
			ldi      480
			eq?     
			bnt      code_0b84
			pushi    #style
			pushi    1
			pushi    100
			lag      global2
			send     6
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0b5f
			pushi    #setScript
			pushi    1
			lofsa    hurryDay10
			push    
			lag      global0
			send     6
			jmp      code_0b64
code_0b5f:
			pushi    #dispose
			pushi    0
			self     4
code_0b64:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0b78
			pushi    #z
			pushi    1
			pushi    22
			lag      global109
			send     6
			jmp      code_0b89
code_0b78:
			pushi    #z
			pushi    1
			pushi    20
			lag      global109
			send     6
			jmp      code_0b89
code_0b84:
			pushi    #dispose
			pushi    0
			self     4
code_0b89:
			toss    
			ret     
		)
	)
)

(instance thisIsIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bea
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    116
			pushi    52
			pushSelf
			lag      global0
			send     12
			jmp      code_0c77
code_0bea:
			dup     
			ldi      1
			eq?     
			bnt      code_0c00
			pushi    3
			pushi    1490
			pushi    13
			pushSelf
			calle    proc13_4,  6
			jmp      code_0c77
code_0c00:
			dup     
			ldi      2
			eq?     
			bnt      code_0c1d
			pushi    5
			pushi    1
			lea      @local9
			push    
			lea      @local13
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0c77
code_0c1d:
			dup     
			ldi      3
			eq?     
			bnt      code_0c33
			pushi    3
			pushi    1490
			pushi    15
			pushSelf
			calle    proc13_4,  6
			jmp      code_0c77
code_0c33:
			dup     
			ldi      4
			eq?     
			bnt      code_0c50
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    5
			lag      global69
			send     8
			ldi      5
			aTop     seconds
			jmp      code_0c77
code_0c50:
			dup     
			ldi      5
			eq?     
			bnt      code_0c77
			pushi    #script
			pushi    0
			lag      global1
			send     4
			bnt      code_0c6b
			dpToa    state
			ldi      1
			aTop     cycles
			jmp      code_0c77
code_0c6b:
			pushi    #setScript
			pushi    1
			lofsa    runFerDoor
			push    
			lag      global0
			send     6
code_0c77:
			toss    
			ret     
		)
	)
)

(instance runFerDoor of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cd8
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    116
			pushi    52
			pushSelf
			lag      global0
			send     12
			jmp      code_0dab
code_0cd8:
			dup     
			ldi      1
			eq?     
			bnt      code_0d0b
			lsg      global146
			ldi      30
			eq?     
			bt       code_0cec
			lsg      global146
			ldi      40
			eq?     
code_0cec:
			bnt      code_0d02
			ldi      1
			sal      local0
			pushi    3
			pushi    1490
			pushi    16
			pushSelf
			calle    proc13_4,  6
			jmp      code_0dab
code_0d02:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0dab
code_0d0b:
			dup     
			ldi      2
			eq?     
			bnt      code_0d2f
			lal      local0
			bnt      code_0d26
			pushi    #init
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			lofsa    hornSound
			send     10
			jmp      code_0dab
code_0d26:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0dab
code_0d2f:
			dup     
			ldi      3
			eq?     
			bnt      code_0d5b
			lal      local0
			bnt      code_0d52
			pushi    3
			pushi    1490
			pushi    17
			pushSelf
			calle    proc13_4,  6
			pushi    #dispose
			pushi    0
			lofsa    hornSound
			send     4
			jmp      code_0dab
code_0d52:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0dab
code_0d5b:
			dup     
			ldi      4
			eq?     
			bnt      code_0d76
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    106
			pushi    52
			pushSelf
			lag      global0
			send     12
			jmp      code_0dab
code_0d76:
			dup     
			ldi      5
			eq?     
			bnt      code_0d91
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    106
			pushi    49
			pushSelf
			lag      global0
			send     12
			jmp      code_0dab
code_0d91:
			dup     
			ldi      6
			eq?     
			bnt      code_0dab
			ldi      0
			sag      global158
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
code_0dab:
			toss    
			ret     
		)
	)
)

(instance hurryDay10 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0dff
			pushi    0
			callb    proc0_3,  0
			ldi      16
			aTop     ticks
			jmp      code_0e6e
code_0dff:
			dup     
			ldi      1
			eq?     
			bnt      code_0e15
			pushi    3
			pushi    1490
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e6e
code_0e15:
			dup     
			ldi      2
			eq?     
			bnt      code_0e2b
			pushi    3
			pushi    1490
			pushi    4
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e6e
code_0e2b:
			dup     
			ldi      3
			eq?     
			bnt      code_0e48
			pushi    5
			pushi    1
			lea      @local1
			push    
			lea      @local13
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0e6e
code_0e48:
			dup     
			ldi      4
			eq?     
			bnt      code_0e5e
			pushi    3
			pushi    1490
			pushi    6
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e6e
code_0e5e:
			dup     
			ldi      5
			eq?     
			bnt      code_0e6e
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0e6e:
			toss    
			ret     
		)
	)
)

(instance itsToLate of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ed9
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    5
			pushi    1
			lea      @local5
			push    
			lea      @local13
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0f15
code_0ed9:
			dup     
			ldi      1
			eq?     
			bnt      code_0eef
			pushi    3
			pushi    1490
			pushi    9
			pushSelf
			calle    proc13_4,  6
			jmp      code_0f15
code_0eef:
			dup     
			ldi      2
			eq?     
			bnt      code_0f15
			pushi    2
			pushi    65036
			pushi    5
			calle    proc806_1,  4
			ldi      40
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
code_0f15:
			toss    
			ret     
		)
	)
)

(instance northToAlaska of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0f93
			pushi    0
			callb    proc0_4,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      12
			lt?     
			bnt      code_0f8e
			pushi    #posn
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    0
			lag      global0
			send     8
code_0f8e:
			pushi    #dispose
			pushi    0
			self     4
code_0f93:
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
			bnt      code_0fce
			pushi    0
			callb    proc0_3,  0
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8192
			or      
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsg      global70
			pushi    65534
			pushSelf
			lag      global0
			send     18
			jmp      code_0fde
code_0fce:
			dup     
			ldi      1
			eq?     
			bnt      code_0fde
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0fde:
			toss    
			ret     
		)
	)
)

(instance egoMonkActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_1039
			lsp      param2
			ldi      12
			eq?     
			bnt      code_1039
			pushi    2
			pushi    490
			pushi    0
			calle    proc13_1,  4
			ldi      1
code_1039:
			ret     
		)
	)
)

(instance egoOutlawActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_108c
			lsp      param2
			dup     
			ldi      12
			eq?     
			bnt      code_1079
			pushi    2
			pushi    490
			pushi    1
			calle    proc13_1,  4
			ldi      1
			jmp      code_108b
code_1079:
			dup     
			ldi      1
			eq?     
			bnt      code_108b
			pushi    3
			pushi    490
			pushi    2
			pushi    1
			calle    proc255_0,  6
code_108b:
			toss    
code_108c:
			ret     
		)
	)
)

(instance egoHornActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_10c9
			lsp      param2
			ldi      1
			eq?     
			bnt      code_10c9
			pushi    2
			pushi    490
			pushi    2
			calle    proc255_0,  4
			ldi      1
code_10c9:
			ret     
		)
	)
)
