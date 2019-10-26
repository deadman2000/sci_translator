;;; Sierra Script 1.0 - (do not remove this comment)
(script# 562)
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
	tunnel3 0
)

(local
	local0
	local1
	[local2 9] = [1561 28 1 2 1 1 2 1]
	[local11 6] = [1561 25 1 2 1]
	[local17 6] = [-1 3492 11 -1 3496 12]
	[local23 3] = [-1 3500 13]
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

(instance tunnel3 of Rm
	(properties
		picture 562
		style $800a
		north 561
	)
	
	(method (init param1)
		(asm
			ldi      0
			sal      local0
			pushi    #init
			pushi    0
			&rest    param1
			super    Rm,  4
			lag      global34
			sal      local1
			ldi      0
			sag      global34
			pushi    #disable
			pushi    2
			pushi    5
			pushi    3
			lag      global69
			send     8
			pushi    2
			pushi    128
			pushi    562
			callk    Load,  4
			pushi    2
			pushi    130
			pushi    930
			callk    Load,  4
			pushi    2
			pushi    19
			pushi    20
			callk    DoSound,  4
			pushi    0
			callb    proc0_4,  0
			lsg      global12
			dup     
			ldi      560
			eq?     
			bnt      code_013e
			pushi    #posn
			pushi    2
			pushi    143
			pushi    175
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			lsg      global130
			ldi      10
			ne?     
			bnt      code_027f
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_00c3
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_00c3:
			bnt      code_027f
			pushi    0
			callb    proc0_3,  0
			pushi    #setCursor
			pushi    4
			lsg      global21
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    PFollow
			push    
			lsg      global0
			pushi    30
			lofsa    sonHal
			send     20
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    15
			lofsa    sonHob
			send     20
			pushi    #setCycle
			pushi    1
			class    SyncWalk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHob
			push    
			pushi    10
			lofsa    sonDicken
			send     20
			pushi    #setScript
			pushi    1
			lofsa    onwardsHo
			push    
			lag      global2
			send     6
			jmp      code_027f
code_013e:
			dup     
			ldi      561
			eq?     
			bnt      code_0250
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local0
			pushi    107
			pushi    0
			pushi    5
			pushi    1
			pushi    562
			pushi    162
			pushi    1
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0168
			ldi      2
			jmp      code_016a
code_0168:
			ldi      0
code_016a:
			push    
			pushi    284
			pushi    2
			pushi    169
			pushi    125
			pushi    150
			pushi    1
			class    Fwd
			push    
			lag      global0
			send     30
			pushi    0
			callb    proc0_2,  0
			lsg      global130
			ldi      10
			ne?     
			bnt      code_0241
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bt       code_019a
			pushi    1
			pushi    56
			callb    proc0_5,  2
code_019a:
			bnt      code_0241
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    562
			pushi    162
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    SyncWalk
			push    
			pushi    284
			pushi    2
			pushi    166
			pushi    111
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    PFollow
			push    
			lsg      global0
			pushi    30
			lofsa    sonHal
			send     40
			pushi    #view
			pushi    1
			pushi    562
			pushi    162
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    SyncWalk
			push    
			pushi    284
			pushi    2
			pushi    167
			pushi    95
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHal
			push    
			pushi    12
			lofsa    sonHob
			send     40
			pushi    #view
			pushi    1
			pushi    562
			pushi    162
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    SyncWalk
			push    
			pushi    284
			pushi    2
			pushi    169
			pushi    88
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    sonHob
			push    
			pushi    10
			lofsa    sonDicken
			send     40
			pushi    #setScript
			pushi    1
			lofsa    theLeader
			push    
			lag      global2
			send     6
			jmp      code_027f
code_0241:
			pushi    #setScript
			pushi    1
			lofsa    walkIn
			push    
			lag      global2
			send     6
			jmp      code_027f
code_0250:
			pushi    #setCursor
			pushi    4
			pushi    0
			pushi    1
			pushi    10
			pushi    25
			lag      global1
			send     12
			pushi    3
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    #posn
			pushi    2
			pushi    146
			pushi    150
			pushi    107
			pushi    0
			lag      global0
			send     12
code_027f:
			toss    
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    36
			pushi    0
			pushi    189
			pushi    0
			pushi    65534
			pushi    319
			pushi    65535
			pushi    319
			pushi    81
			pushi    319
			pushi    189
			pushi    262
			pushi    189
			pushi    255
			pushi    181
			pushi    248
			pushi    171
			pushi    231
			pushi    166
			pushi    196
			pushi    153
			pushi    173
			pushi    129
			pushi    176
			pushi    100
			pushi    169
			pushi    100
			pushi    156
			pushi    100
			pushi    147
			pushi    108
			pushi    116
			pushi    136
			pushi    74
			pushi    164
			pushi    59
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     86
			push    
			lag      global2
			send     6
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      560
			ne?     
			bnt      code_031c
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
code_031c:
			pushi    1
			lofsa    tunnelWall
			push    
			calle    proc806_3,  2
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      150
			lt?     
			bnt      code_0353
			lsl      local0
			ldi      1
			ne?     
			bnt      code_0353
			ldi      1
			sal      local0
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    changeTunnels
			push    
			lag      global0
			send     6
code_0353:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      186
			gt?     
			bnt      code_037e
			lsl      local0
			ldi      1
			ne?     
			bnt      code_037e
			ldi      1
			sal      local0
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    backAgain
			push    
			lag      global0
			send     6
code_037e:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local1
			sag      global34
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    sonHal
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    sonHob
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    sonDicken
			send     6
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
			pushi    0
			callb    proc0_4,  0
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_03d8
			pushi    2
			pushi    1561
			pushi    48
			calle    proc13_4,  4
			jmp      code_03e1
code_03d8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Rm,  6
code_03e1:
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
			pushi    8
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
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
			bnt      code_0479
			pushi    2
			pushi    1561
			pushi    49
			calle    proc13_4,  4
			jmp      code_0496
code_0479:
			dup     
			ldi      3
			eq?     
			bnt      code_048d
			pushi    2
			pushi    1561
			pushi    50
			calle    proc13_4,  4
			jmp      code_0496
code_048d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0496:
			toss    
			ret     
		)
	)
)

(instance sonHal of Actor
	(properties
		x 166
		y 189
		view 434
		loop 3
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_050a
			pushi    3
			pushi    1561
			pushi    34
			pushSelf
			calle    proc13_4,  6
			jmp      code_05fd
code_050a:
			dup     
			ldi      3
			eq?     
			bnt      code_0526
			pushi    3
			pushi    1561
			pushi    47
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05fd
code_0526:
			dup     
			ldi      5
			eq?     
			bnt      code_0542
			pushi    3
			pushi    1561
			pushi    12
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05fd
code_0542:
			dup     
			ldi      4
			eq?     
			bnt      code_05f4
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0567
			pushi    3
			pushi    1561
			pushi    13
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f0
code_0567:
			dup     
			ldi      2
			eq?     
			bnt      code_0583
			pushi    3
			pushi    1561
			pushi    14
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f0
code_0583:
			dup     
			ldi      14
			eq?     
			bnt      code_059f
			pushi    3
			pushi    1561
			pushi    14
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f0
code_059f:
			dup     
			ldi      12
			eq?     
			bnt      code_05bb
			pushi    3
			pushi    1561
			pushi    15
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f0
code_05bb:
			dup     
			ldi      18
			eq?     
			bnt      code_05d7
			pushi    3
			pushi    1561
			pushi    16
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05f0
code_05d7:
			dup     
			ldi      10
			eq?     
			bnt      code_05f0
			pushi    3
			pushi    1561
			pushi    16
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_05f0:
			toss    
			jmp      code_05fd
code_05f4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_05fd:
			toss    
			ret     
		)
	)
)

(instance sonHob of Actor
	(properties
		x 111
		y 195
		view 434
		loop 3
		cel 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_069e
			pushi    3
			pushi    1561
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_0791
code_069e:
			dup     
			ldi      3
			eq?     
			bnt      code_06ba
			pushi    3
			pushi    1561
			pushi    47
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0791
code_06ba:
			dup     
			ldi      5
			eq?     
			bnt      code_06d6
			pushi    3
			pushi    1561
			pushi    17
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0791
code_06d6:
			dup     
			ldi      4
			eq?     
			bnt      code_0788
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_06fb
			pushi    3
			pushi    1561
			pushi    18
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0784
code_06fb:
			dup     
			ldi      2
			eq?     
			bnt      code_0717
			pushi    3
			pushi    1561
			pushi    19
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0784
code_0717:
			dup     
			ldi      14
			eq?     
			bnt      code_0733
			pushi    3
			pushi    1561
			pushi    19
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0784
code_0733:
			dup     
			ldi      12
			eq?     
			bnt      code_074f
			pushi    3
			pushi    1561
			pushi    20
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0784
code_074f:
			dup     
			ldi      18
			eq?     
			bnt      code_076b
			pushi    3
			pushi    1561
			pushi    21
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0784
code_076b:
			dup     
			ldi      10
			eq?     
			bnt      code_0784
			pushi    3
			pushi    1561
			pushi    21
			pushSelf
			call     localproc_0023,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
code_0784:
			toss    
			jmp      code_0791
code_0788:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_0791:
			toss    
			ret     
		)
	)
)

(instance sonDicken of Actor
	(properties
		x 135
		y 210
		view 434
		loop 3
		cel 4
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0832
			pushi    3
			pushi    1561
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_0913
code_0832:
			dup     
			ldi      3
			eq?     
			bnt      code_084e
			pushi    3
			pushi    1561
			pushi    47
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0913
code_084e:
			dup     
			ldi      5
			eq?     
			bnt      code_086a
			pushi    3
			pushi    1561
			pushi    22
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0913
code_086a:
			dup     
			ldi      4
			eq?     
			bnt      code_090a
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_088f
			pushi    3
			pushi    1561
			pushi    23
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0906
code_088f:
			dup     
			ldi      2
			eq?     
			bnt      code_08ab
			pushi    3
			pushi    1561
			pushi    24
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0906
code_08ab:
			dup     
			ldi      14
			eq?     
			bnt      code_08c7
			pushi    3
			pushi    1561
			pushi    24
			pushSelf
			call     localproc_0038,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0906
code_08c7:
			dup     
			ldi      12
			eq?     
			bnt      code_08dd
			pushi    #setScript
			pushi    1
			lofsa    dickenPuzBoxTalk
			push    
			lag      global2
			send     6
			jmp      code_0906
code_08dd:
			dup     
			ldi      18
			eq?     
			bnt      code_08f3
			pushi    #setScript
			pushi    1
			lofsa    waterOrFireRingTalk
			push    
			lag      global2
			send     6
			jmp      code_0906
code_08f3:
			dup     
			ldi      10
			eq?     
			bnt      code_0906
			pushi    #setScript
			pushi    1
			lofsa    waterOrFireRingTalk
			push    
			lag      global2
			send     6
code_0906:
			toss    
			jmp      code_0913
code_090a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_0913:
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
			bnt      code_09b8
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_09b7
			pushi    2
			pushi    1561
			pushi    46
			calle    proc13_4,  4
code_09b7:
			toss    
code_09b8:
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
			bnt      code_09f1
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_0a29
code_09f1:
			dup     
			ldi      1
			eq?     
			bnt      code_0a13
			pushi    7
			pushi    2
			lea      @local2
			push    
			lea      @local23
			push    
			pushi    0
			lea      @local17
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0a29
code_0a13:
			dup     
			ldi      2
			eq?     
			bnt      code_0a29
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_0a29:
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
			bnt      code_0a7d
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     cycles
			jmp      code_0ab5
code_0a7d:
			dup     
			ldi      1
			eq?     
			bnt      code_0a9f
			pushi    7
			pushi    2
			lea      @local11
			push    
			lea      @local23
			push    
			pushi    0
			lea      @local17
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ab5
code_0a9f:
			dup     
			ldi      2
			eq?     
			bnt      code_0ab5
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_0ab5:
			toss    
			ret     
		)
	)
)

(instance changeTunnels of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b38
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			pushi    562
			pushi    162
			pushi    1
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0b19
			ldi      3
			jmp      code_0b1b
code_0b19:
			ldi      1
code_0b1b:
			push    
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    167
			pushi    113
			pushSelf
			lag      global0
			send     30
			jmp      code_0b4f
code_0b38:
			dup     
			ldi      1
			eq?     
			bnt      code_0b4f
			pushi    #newRoom
			pushi    1
			pushi    561
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0b4f:
			toss    
			ret     
		)
	)
)

(instance backAgain of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bbe
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    240
			pushSelf
			lag      global0
			send     18
			jmp      code_0bd5
code_0bbe:
			dup     
			ldi      1
			eq?     
			bnt      code_0bd5
			pushi    #newRoom
			pushi    1
			pushi    560
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0bd5:
			toss    
			ret     
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c34
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    159
			pushSelf
			lag      global0
			send     12
			jmp      code_0c7d
code_0c34:
			dup     
			ldi      1
			eq?     
			bnt      code_0c7d
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
			pushi    3
			pushi    2
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0c5e
			ldi      23
			jmp      code_0c60
code_0c5e:
			ldi      0
code_0c60:
			push    
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0c6e
			ldi      24
			jmp      code_0c70
code_0c6e:
			ldi      1
code_0c70:
			push    
			callb    proc0_2,  6
			ldi      0
			sal      local0
			pushi    #dispose
			pushi    0
			self     4
code_0c7d:
			toss    
			ret     
		)
	)
)

(instance theLeader of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cdc
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    240
			pushSelf
			lag      global0
			send     12
			jmp      code_0cf3
code_0cdc:
			dup     
			ldi      1
			eq?     
			bnt      code_0cf3
			pushi    #newRoom
			pushi    1
			pushi    560
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0cf3:
			toss    
			ret     
		)
	)
)

(instance onwardsHo of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d51
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    111
			pushSelf
			lag      global0
			send     12
			jmp      code_0d68
code_0d51:
			dup     
			ldi      1
			eq?     
			bnt      code_0d68
			pushi    #newRoom
			pushi    1
			pushi    561
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0d68:
			toss    
			ret     
		)
	)
)
