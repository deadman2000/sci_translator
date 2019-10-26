;;; Sierra Script 1.0 - (do not remove this comment)
(script# 185)
(include sci.sh)
(use n000)
(use n013)
(use n221)
(use n228)
(use n231)
(use n233)
(use n241)
(use n806)
(use n813)
(use n851)
(use n926)
(use n945)
(use n946)
(use n958)
(use n992)
(use n998)
(use n999)

(public
	sprite 0
	runFerIt 1
	spriteCaught 2
	bag 3
	dumpSprite 4
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	[local10 5] = [1185 4 1 2]
	[local15 6] = [1185 6 1 2 2]
	[local21 5] = [1185 9 1 2]
	[local26 5] = [1185 15 1 1]
	[local31 9] = [186 0 2 4 22 24 19 16 26]
	[local40 8] = [-1]
)
(instance sprite of Actor
	(properties
		yStep 5
		view 185
		signal $4000
		xStep 9
	)
	
	(method (dispose)
		(asm
			pushi    #setScript
			pushi    1
			pushi    0
			self     6
			pushi    #dispose
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0070
			lal      local1
			bnt      code_005d
			pushi    3
			pushi    1185
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_00e7
code_005d:
			ldi      1
			sal      local1
			pushi    #setScript
			pushi    1
			lofsa    lookSprite
			push    
			lag      global0
			send     6
			jmp      code_00e7
code_0070:
			dup     
			ldi      10
			eq?     
			bnt      code_008c
			pushi    #setScript
			pushi    1
			lofsa    skewerSprite
			push    
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			jmp      code_00e7
code_008c:
			dup     
			ldi      4
			eq?     
			bnt      code_00dc
			lsp      param2
			ldi      4
			eq?     
			bnt      code_00ce
			lsg      global71
			pushi    #horizon
			pushi    0
			lag      global2
			send     4
			gt?     
			bnt      code_00ce
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_00ce
			pushi    #setScript
			pushi    3
			pushi    2
			pushi    181
			pushi    1
			callk    ScriptID,  4
			push    
			lsg      global70
			lsg      global71
			lag      global0
			send     10
			jmp      code_00e7
code_00ce:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_00e7
code_00dc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_00e7:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
)

(instance funnySprite of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			self     30
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance bag of View
	(properties
		view 771
		loop 3
		cel 7
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    View,  4
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      11
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      11
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      13
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_02ff
			pushi    1
			pushi    178
			callb    proc0_5,  2
			bnt      code_02f0
			pushi    3
			pushi    1185
			pushi    11
			pushi    0
			calle    proc13_4,  6
			jmp      code_034c
code_02f0:
			pushi    #setScript
			pushi    1
			lofsa    bagLook
			push    
			lag      global0
			send     6
			jmp      code_034c
code_02ff:
			dup     
			ldi      3
			eq?     
			bnt      code_0315
			pushi    #setScript
			pushi    1
			lofsa    easterEgg
			push    
			lag      global0
			send     6
			jmp      code_034c
code_0315:
			dup     
			ldi      10
			eq?     
			bnt      code_032b
			pushi    3
			pushi    1185
			pushi    12
			pushi    0
			calle    proc13_4,  6
			jmp      code_034c
code_032b:
			dup     
			ldi      4
			eq?     
			bnt      code_0341
			pushi    #setScript
			pushi    1
			lofsa    easterEgg
			push    
			lag      global0
			send     6
			jmp      code_034c
code_0341:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_034c:
			toss    
			ret     
		)
	)
)

(instance extraNet of Prop
	(properties
		view 188
		loop 4
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      4
			add     
			push    
			self     8
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance flash of View
	(properties
		view 245
		loop 1
		cel 5
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0470
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			self     8
			jmp      code_048a
code_0470:
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			self     8
code_048a:
			pushi    #init
			pushi    0
			super    View,  4
			ret     
		)
	)
)

(instance runFerIt of Script
	(properties)
	
	(method (doit &tmp [temp0 4])
		(asm
			lal      local3
			bnt      code_0611
			ldi      0
			sal      local3
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0514
			pushi    0
			callb    proc0_4,  0
code_0514:
			pushi    20
			lsg      global112
			pushi    19
			pushi    21
			pushi    23
			pushi    35
			pushi    50
			pushi    52
			pushi    65
			pushi    68
			pushi    82
			pushi    83
			pushi    85
			pushi    86
			pushi    89
			pushi    115
			pushi    121
			pushi    131
			pushi    133
			pushi    151
			pushi    154
			calle    proc999_5,  40
			bnt      code_056b
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			ldi      230
			eq?     
			bnt      code_0563
			pushi    0
			calle    proc233_0,  0
			jmp      code_05a2
code_0563:
			pushi    0
			calle    proc228_0,  0
			jmp      code_05a2
code_056b:
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			dup     
			ldi      220
			eq?     
			bnt      code_0584
			pushi    0
			calle    proc221_0,  0
			jmp      code_05a1
code_0584:
			dup     
			ldi      230
			eq?     
			bnt      code_0594
			pushi    0
			calle    proc231_0,  0
			jmp      code_05a1
code_0594:
			dup     
			ldi      240
			eq?     
			bnt      code_05a1
			pushi    0
			calle    proc241_0,  0
code_05a1:
			toss    
code_05a2:
			pushi    20
			lsg      global112
			pushi    19
			pushi    21
			pushi    23
			pushi    35
			pushi    50
			pushi    52
			pushi    65
			pushi    68
			pushi    82
			pushi    83
			pushi    85
			pushi    86
			pushi    89
			pushi    115
			pushi    121
			pushi    131
			pushi    133
			pushi    151
			pushi    154
			calle    proc999_5,  40
			not     
			bnt      code_083c
			pushi    16
			lsg      global112
			pushi    21
			pushi    36
			pushi    37
			pushi    38
			pushi    50
			pushi    56
			pushi    67
			pushi    75
			pushi    98
			pushi    99
			pushi    103
			pushi    115
			pushi    119
			pushi    135
			pushi    167
			calle    proc999_5,  32
			bnt      code_083c
			pushi    0
			calle    proc926_0,  0
			jmp      code_083c
code_0611:
			pushi    #distanceTo
			pushi    1
			lsg      global0
			lofsa    sprite
			send     6
			push    
			ldi      35
			lt?     
			bnt      code_0708
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      319
			gt?     
			not     
			bnt      code_0708
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      1
			lt?     
			not     
			bnt      code_0708
			lal      local2
			not     
			bnt      code_0708
			ldi      1
			sal      local2
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    289
			pushi    1
			pushi    1
			lag      global0
			send     12
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
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
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      12
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			add     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			add     
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
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			sub     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      12
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			jmp      code_083c
code_0708:
			pushi    #distanceTo
			pushi    1
			lsg      global0
			lofsa    sprite
			send     6
			push    
			ldi      30
			gt?     
			bt       code_0736
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      319
			gt?     
			bt       code_0736
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      1
			lt?     
code_0736:
			bnt      code_0773
			lal      local2
			bnt      code_0773
			ldi      0
			sal      local2
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_075a
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_075a:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #ignoreActors
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      1
			sal      local3
			jmp      code_083c
code_0773:
			pushi    #loop
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      4
			eq?     
			bt       code_078e
			pushi    #loop
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      5
			eq?     
code_078e:
			bnt      code_07df
			pushi    #cel
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_07df
			pushi    #loop
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_07bc
			pushi    #setLoop
			pushi    1
			pushi    0
			lofsa    sprite
			send     6
			jmp      code_07c6
code_07bc:
			pushi    #setLoop
			pushi    1
			pushi    1
			lofsa    sprite
			send     6
code_07c6:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			lofsa    sprite
			send     6
			pushi    2
			pushi    10
			pushi    25
			callk    Random,  4
			sal      local0
			jmp      code_083c
code_07df:
			lal      local0
			not     
			bnt      code_07e8
			jmp      code_083c
code_07e8:
			-al      local0
			bnt      code_07f0
			jmp      code_083c
code_07f0:
			pushi    #loop
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0811
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			lofsa    sprite
			send     12
			jmp      code_083c
code_0811:
			pushi    #loop
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0832
			pushi    #setLoop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			lofsa    sprite
			send     12
			jmp      code_083c
code_0832:
			pushi    2
			pushi    10
			pushi    25
			callk    Random,  4
			sal      local0
code_083c:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0901
			pushi    3
			pushi    128
			pushi    185
			pushi    188
			calle    proc958_0,  6
			pushi    #actions
			pushi    1
			lofsa    noPuzzleBox
			push    
			lag      global0
			send     6
			pushi    1
			pushi    37
			callb    proc0_6,  2
			pushi    #number
			pushi    1
			pushi    901
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    2
			pushi    10
			pushi    25
			callk    Random,  4
			sal      local0
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			sal      local9
			bnt      code_08b1
			pushi    #setLoop
			pushi    1
			pushi    0
			lofsa    sprite
			send     6
			ldi      330
			sat      temp0
			ldi      65526
			sat      temp1
			jmp      code_08c4
code_08b1:
			pushi    #setLoop
			pushi    1
			pushi    1
			lofsa    sprite
			send     6
			ldi      65526
			sat      temp0
			ldi      330
			sat      temp1
code_08c4:
			pushi    #view
			pushi    1
			pushi    185
			pushi    284
			pushi    2
			lst      temp1
			pushi    2
			pushi    80
			pushi    180
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lst      temp0
			pushi    2
			pushi    100
			pushi    200
			callk    Random,  4
			push    
			pushSelf
			lofsa    sprite
			send     36
			jmp      code_095b
code_0901:
			dup     
			ldi      1
			eq?     
			bnt      code_094c
			pushi    1
			pushi    104
			callb    proc0_5,  2
			bnt      code_0917
			pushi    1
			pushi    104
			callb    proc0_7,  2
code_0917:
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    1
			pushi    37
			callb    proc0_7,  2
			pushi    1
			pushi    218
			callb    proc0_5,  2
			bnt      code_093d
			pushi    #cue
			pushi    0
			pushi    2
			pushi    181
			pushi    1
			callk    ScriptID,  4
			send     4
code_093d:
			pushi    #dispose
			pushi    0
			lofsa    sprite
			send     4
			ldi      6
			aTop     ticks
			jmp      code_095b
code_094c:
			dup     
			ldi      2
			eq?     
			bnt      code_095b
			pushi    #doit
			pushi    0
			lofsa    dumpSprite
			send     4
code_095b:
			toss    
			ret     
		)
	)
)

(instance spriteCaught of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     4
			bnt      code_09c3
			lal      local4
			not     
			bnt      code_09c3
			ldi      0
			jmp      code_0ac3
code_09c3:
			lal      local4
			bnt      code_0ac3
			lsl      local8
			dup     
			ldi      1
			eq?     
			bnt      code_09e9
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      83
			le?     
			bnt      code_0ac2
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ac2
code_09e9:
			dup     
			ldi      4
			eq?     
			bnt      code_0a35
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      319
			ge?     
			bt       code_0a29
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      100
			sub     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			bnt      code_0ac2
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
code_0a29:
			bnt      code_0ac2
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ac2
code_0a35:
			dup     
			ldi      3
			eq?     
			bnt      code_0a81
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      189
			ge?     
			bt       code_0a75
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      50
			sub     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			bnt      code_0ac2
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			gt?     
code_0a75:
			bnt      code_0ac2
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ac2
code_0a81:
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      0
			le?     
			bt       code_0ab9
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      100
			sub     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_0ac2
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
code_0ab9:
			bnt      code_0ac2
			pushi    #cue
			pushi    0
			self     4
code_0ac2:
			toss    
code_0ac3:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
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
			bnt      code_0afa
			pushi    0
			callb    proc0_3,  0
			pushi    150
			pushi    #superClass
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lsg      global104
			lsg      global105
			ldi      10
			sub     
			push    
			pushSelf
			lofsa    sprite
			send     18
			jmp      code_1014
code_0afa:
			dup     
			ldi      1
			eq?     
			bnt      code_0b44
			pushi    2
			lsg      global0
			lofsa    sprite
			push    
			callb    proc0_9,  4
			pushi    150
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			pushi    2
			pushi    181
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    5
			pushi    1
			pushi    188
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    2
			lofsa    sprite
			send     36
			ldi      24
			aTop     ticks
			jmp      code_1014
code_0b44:
			dup     
			ldi      2
			eq?     
			bnt      code_0ba1
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    8
			lofsa    sprite
			send     12
			pushi    #view
			pushi    1
			pushi    188
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    2
			pushi    181
			pushi    2
			callk    ScriptID,  4
			send     26
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #init
			pushi    0
			lofsa    extraNet
			send     4
			ldi      18
			aTop     ticks
			jmp      code_1014
code_0ba1:
			dup     
			ldi      3
			eq?     
			bnt      code_0bbe
			pushi    4
			lea      @local10
			push    
			pushi    3
			lea      @local31
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1014
code_0bbe:
			dup     
			ldi      4
			eq?     
			bnt      code_0bda
			pushi    4
			lea      @local15
			push    
			pushi    2
			lea      @local31
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1014
code_0bda:
			dup     
			ldi      5
			eq?     
			bnt      code_0bf7
			pushi    4
			lea      @local21
			push    
			pushi    3
			lea      @local31
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1014
code_0bf7:
			dup     
			ldi      6
			eq?     
			bnt      code_0c14
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    2
			pushi    181
			pushi    2
			callk    ScriptID,  4
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1014
code_0c14:
			dup     
			ldi      7
			eq?     
			bnt      code_0c3d
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    181
			pushi    2
			callk    ScriptID,  4
			send     8
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    extraNet
			send     8
			jmp      code_1014
code_0c3d:
			dup     
			ldi      8
			eq?     
			bnt      code_0c76
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      180
			gt?     
			bnt      code_0c6d
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    165
			lag      global0
			send     10
			jmp      code_1014
code_0c6d:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1014
code_0c76:
			dup     
			ldi      9
			eq?     
			bnt      code_0fe2
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    181
			pushi    2
			callk    ScriptID,  4
			send     8
			pushi    #dispose
			pushi    0
			lofsa    extraNet
			send     4
			pushi    #ignoreActors
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      32
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      23
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      32
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      23
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			lsg      global112
			ldi      18
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      19
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      20
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      21
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      22
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      23
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      33
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      34
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      35
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      36
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      37
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      38
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      39
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      50
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      51
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      52
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      53
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      54
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      67
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      68
			eq?     
			bt       code_0de8
			lsg      global112
			ldi      69
			eq?     
code_0de8:
			bnt      code_0e0f
			pushi    #setLoop
			pushi    1
			pushi    2
			lofsa    sprite
			send     6
			ldi      3
			sal      local8
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			sal      local6
			ldi      240
			sal      local7
			ldi      2
			sal      local5
			jmp      code_0fa3
code_0e0f:
			lsg      global112
			ldi      49
			eq?     
			bt       code_0e44
			lsg      global112
			ldi      65
			eq?     
			bt       code_0e44
			lsg      global112
			ldi      66
			eq?     
			bt       code_0e44
			lsg      global112
			ldi      82
			eq?     
			bt       code_0e44
			lsg      global112
			ldi      83
			eq?     
			bt       code_0e44
			lsg      global112
			ldi      97
			eq?     
			bt       code_0e44
			lsg      global112
			ldi      98
			eq?     
code_0e44:
			bnt      code_0e6b
			pushi    #setLoop
			pushi    1
			pushi    0
			lofsa    sprite
			send     6
			ldi      4
			sal      local8
			ldi      340
			sal      local6
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			sal      local7
			ldi      0
			sal      local5
			jmp      code_0fa3
code_0e6b:
			lsg      global112
			ldi      99
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      100
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      101
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      102
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      114
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      115
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      116
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      117
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      118
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      130
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      131
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      132
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      133
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      134
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      135
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      150
			eq?     
			bt       code_0ef8
			lsg      global112
			ldi      166
			eq?     
code_0ef8:
			bnt      code_0f83
			pushi    #setLoop
			pushi    1
			pushi    3
			lofsa    sprite
			send     6
			ldi      1
			sal      local8
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			ldi      230
			eq?     
			bnt      code_0f4d
			ldi      21
			bnt      code_0f45
			ldi      36
			ldi      37
			ldi      38
			ldi      50
			ldi      56
			ldi      67
			ldi      75
			ldi      98
			ldi      99
			ldi      103
			ldi      115
			ldi      119
			ldi      135
			ldi      167
			ldi      139
			sal      local6
			jmp      code_0f7c
code_0f45:
			ldi      180
			sal      local6
			jmp      code_0f7c
code_0f4d:
			ldi      21
			bnt      code_0f77
			ldi      36
			ldi      37
			ldi      38
			ldi      50
			ldi      56
			ldi      67
			ldi      75
			ldi      98
			ldi      99
			ldi      103
			ldi      115
			ldi      119
			ldi      135
			ldi      167
			ldi      100
			sal      local6
			jmp      code_0f7c
code_0f77:
			ldi      219
			sal      local6
code_0f7c:
			ldi      75
			sal      local7
			jmp      code_0fa3
code_0f83:
			pushi    #setLoop
			pushi    1
			pushi    1
			lofsa    sprite
			send     6
			ldi      2
			sal      local8
			ldi      65516
			sal      local6
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			sal      local7
			ldi      1
			sal      local5
code_0fa3:
			pushi    5
			pushi    #superClass
			pushi    185
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    sprite
			send     4
			push    
			ldi      8192
			or      
			push    
			pushi    66
			pushi    1
			pushi    65535
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local6
			lsl      local7
			lofsa    sprite
			push    
			lofsa    sprite
			send     36
			ldi      1
			sal      local4
			jmp      code_1014
code_0fe2:
			dup     
			ldi      10
			eq?     
			bnt      code_1014
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local6
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			ldi      0
			sal      local4
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    0
			lag      global113
			send     12
code_1014:
			toss    
			ret     
		)
	)
)

(instance skewerSprite of Script
	(properties)
	
	(method (changeState newState param2)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1096
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    159
			callb    proc0_6,  2
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			pushi    5
			pushi    1
			pushi    188
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    3
			lofsa    sprite
			send     30
			ldi      6
			aTop     ticks
			jmp      code_122e
code_1096:
			dup     
			ldi      1
			eq?     
			bnt      code_1196
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    4
			dup     
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			callk    GetAngle,  8
			sap      param2
			push    
			ldi      20
			le?     
			bt       code_10db
			lsp      param2
			ldi      340
			gt?     
code_10db:
			bnt      code_10eb
			pushi    #setLoop
			pushi    1
			pushi    3
			lag      global0
			send     6
			jmp      code_117d
code_10eb:
			lsp      param2
			ldi      80
			le?     
			bnt      code_1100
			pushi    #setLoop
			pushi    1
			pushi    6
			lag      global0
			send     6
			jmp      code_117d
code_1100:
			lsp      param2
			ldi      100
			le?     
			bnt      code_1114
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_117d
code_1114:
			lsp      param2
			ldi      160
			le?     
			bnt      code_112a
			pushi    #setLoop
			pushi    1
			pushi    4
			lag      global0
			send     6
			jmp      code_117d
code_112a:
			lsp      param2
			ldi      200
			le?     
			bnt      code_113f
			pushi    #setLoop
			pushi    1
			pushi    2
			lag      global0
			send     6
			jmp      code_117d
code_113f:
			lsp      param2
			ldi      260
			le?     
			bnt      code_1155
			pushi    #setLoop
			pushi    1
			pushi    5
			lag      global0
			send     6
			jmp      code_117d
code_1155:
			lsp      param2
			ldi      280
			le?     
			bnt      code_116a
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			jmp      code_117d
code_116a:
			lsp      param2
			ldi      340
			le?     
			bnt      code_117d
			pushi    #setLoop
			pushi    1
			pushi    7
			lag      global0
			send     6
code_117d:
			pushi    #view
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_122e
code_1196:
			dup     
			ldi      2
			eq?     
			bnt      code_11b6
			pushi    #view
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_122e
code_11b6:
			dup     
			ldi      3
			eq?     
			bnt      code_11d5
			pushi    #number
			pushi    1
			pushi    906
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			ldi      6
			aTop     ticks
			jmp      code_122e
code_11d5:
			dup     
			ldi      4
			eq?     
			bnt      code_1209
			pushi    #posn
			pushi    2
			pushi    #x
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    sprite
			send     4
			push    
			pushi    107
			pushi    0
			lofsa    bag
			send     12
			pushi    #dispose
			pushi    0
			lofsa    sprite
			send     4
			ldi      20
			aTop     ticks
			jmp      code_122e
code_1209:
			dup     
			ldi      5
			eq?     
			bnt      code_122e
			pushi    #number
			pushi    1
			pushi    213
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_122e:
			toss    
			ret     
		)
	)
)

(instance easterEgg of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12e2
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			lt?     
			bnt      code_12b8
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_15cb
code_12b8:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      8
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bag
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_15cb
code_12e2:
			dup     
			ldi      1
			eq?     
			bnt      code_1326
			pushi    5
			pushi    1
			pushi    7
			pushi    288
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			lt?     
			bnt      code_1310
			ldi      1
			jmp      code_1312
code_1310:
			ldi      0
code_1312:
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_15cb
code_1326:
			dup     
			ldi      2
			eq?     
			bnt      code_138b
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    1
			pushi    178
			callb    proc0_6,  2
			pushi    1
			pushi    159
			callb    proc0_7,  2
			pushi    #hide
			pushi    0
			lofsa    bag
			send     4
			pushi    #init
			pushi    0
			lofsa    flash
			send     4
			pushi    #number
			pushi    1
			pushi    216
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_137b
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_137b:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			ldi      6
			aTop     ticks
			jmp      code_15cb
code_138b:
			dup     
			ldi      3
			eq?     
			bnt      code_158d
			pushi    20
			lsg      global112
			pushi    19
			pushi    21
			pushi    23
			pushi    35
			pushi    50
			pushi    52
			pushi    65
			pushi    68
			pushi    82
			pushi    83
			pushi    85
			pushi    86
			pushi    89
			pushi    115
			pushi    121
			pushi    131
			pushi    133
			pushi    151
			pushi    154
			calle    proc999_5,  40
			bnt      code_13e9
			pushi    #curPic
			pushi    0
			lag      global2
			send     4
			push    
			ldi      230
			eq?     
			bnt      code_13e1
			pushi    0
			calle    proc233_0,  0
			jmp      code_1420
code_13e1:
			pushi    0
			calle    proc228_0,  0
			jmp      code_1420
code_13e9:
			pushi    #curPic
			pushi    0
			lag      global2
			send     4
			push    
			dup     
			ldi      220
			eq?     
			bnt      code_1402
			pushi    0
			calle    proc221_0,  0
			jmp      code_141f
code_1402:
			dup     
			ldi      230
			eq?     
			bnt      code_1412
			pushi    0
			calle    proc231_0,  0
			jmp      code_141f
code_1412:
			dup     
			ldi      240
			eq?     
			bnt      code_141f
			pushi    0
			calle    proc241_0,  0
code_141f:
			toss    
code_1420:
			pushi    20
			lsg      global112
			pushi    19
			pushi    21
			pushi    23
			pushi    35
			pushi    50
			pushi    52
			pushi    65
			pushi    68
			pushi    82
			pushi    83
			pushi    85
			pushi    86
			pushi    89
			pushi    115
			pushi    121
			pushi    131
			pushi    133
			pushi    151
			pushi    154
			calle    proc999_5,  40
			not     
			bnt      code_148c
			pushi    16
			lsg      global112
			pushi    21
			pushi    36
			pushi    37
			pushi    38
			pushi    50
			pushi    56
			pushi    67
			pushi    75
			pushi    98
			pushi    99
			pushi    103
			pushi    115
			pushi    119
			pushi    135
			pushi    167
			calle    proc999_5,  32
			bnt      code_148c
			pushi    0
			calle    proc926_0,  0
code_148c:
			pushi    1
			pushi    179
			callb    proc0_6,  2
			pushi    #actions
			pushi    1
			lofsa    egoShrimp
			push    
			lag      global0
			send     6
			pushi    #disable
			pushi    4
			pushi    5
			pushi    4
			pushi    6
			pushi    7
			lag      global69
			send     12
			pushi    #dispose
			pushi    0
			lofsa    flash
			send     4
			pushi    3
			pushi    2
			pushi    67
			dup     
			callb    proc0_2,  6
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      188
			gt?     
			bnt      code_1518
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			lt?     
			bnt      code_14fe
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			add     
			push    
			pushi    188
			lag      global0
			send     8
			jmp      code_1567
code_14fe:
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    188
			lag      global0
			send     8
			jmp      code_1567
code_1518:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    bag
			send     4
			lt?     
			bnt      code_154b
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
			jmp      code_1567
code_154b:
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
code_1567:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    308
			pushi    2
			pushi    6
			pushi    4
			pushi    194
			pushi    0
			lag      global0
			send     18
			pushi    #dispose
			pushi    0
			lofsa    bag
			send     4
			ldi      24
			aTop     ticks
			jmp      code_15cb
code_158d:
			dup     
			ldi      4
			eq?     
			bnt      code_15aa
			pushi    5
			pushi    1
			lea      @local26
			push    
			lea      @local40
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_15cb
code_15aa:
			dup     
			ldi      5
			eq?     
			bnt      code_15cb
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    4
			pushi    5
			pushi    4
			pushi    6
			pushi    7
			lag      global69
			send     12
			pushi    #dispose
			pushi    0
			self     4
code_15cb:
			toss    
			ret     
		)
	)
)

(instance bagLook of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1627
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1185
			pushi    13
			pushSelf
			calle    proc13_4,  6
			jmp      code_164d
code_1627:
			dup     
			ldi      1
			eq?     
			bnt      code_163d
			pushi    3
			pushi    1185
			pushi    14
			pushSelf
			calle    proc13_4,  6
			jmp      code_164d
code_163d:
			dup     
			ldi      2
			eq?     
			bnt      code_164d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_164d:
			toss    
			ret     
		)
	)
)

(instance lookSprite of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16a4
			pushi    3
			pushi    1185
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_16db
code_16a4:
			dup     
			ldi      1
			eq?     
			bnt      code_16b9
			pushi    3
			pushi    1185
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_16db
code_16b9:
			dup     
			ldi      2
			eq?     
			bnt      code_16cf
			pushi    3
			pushi    1185
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_16db
code_16cf:
			dup     
			ldi      3
			eq?     
			bnt      code_16db
			pushi    #dispose
			pushi    0
			self     4
code_16db:
			toss    
			ret     
		)
	)
)

(instance egoShrimp of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1732
			pushi    3
			pushi    1185
			pushi    17
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_1747
code_1732:
			dup     
			ldi      3
			eq?     
			bnt      code_1747
			pushi    3
			pushi    1185
			pushi    18
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_1747:
			toss    
			ret     
		)
	)
)

(instance noPuzzleBox of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_1788
			lsp      param2
			ldi      12
			eq?     
			bnt      code_1788
			pushi    3
			pushi    1185
			pushi    19
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_1788:
			ret     
		)
	)
)

(instance dumpSprite of Code
	(properties)
	
	(method (doit)
		(asm
			pushi    #contains
			pushi    1
			lofsa    sprite
			push    
			lag      global5
			send     6
			bnt      code_17d2
			pushi    #add
			pushi    1
			lofsa    funnySprite
			push    
			lag      global10
			send     6
			pushi    #init
			pushi    0
			lofsa    funnySprite
			send     4
			pushi    #doit
			pushi    0
			lag      global10
			send     4
code_17d2:
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    141
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     10
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #contains
			pushi    1
			lofsa    sprite
			push    
			lag      global5
			send     6
			bnt      code_1814
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    sprite
			send     14
code_1814:
			pushi    #contains
			pushi    1
			lofsa    bag
			push    
			lag      global5
			send     6
			bnt      code_182d
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    bag
			send     8
code_182d:
			pushi    3
			pushi    0
			pushi    181
			pushi    185
			calle    proc958_0,  6
			ret     
		)
	)
)
