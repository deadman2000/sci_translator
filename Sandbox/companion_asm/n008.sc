;;; Sierra Script 1.0 - (do not remove this comment)
(script# 8)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n951)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	theMan 0
	poach 1
	shootist 2
	poachScript 3
)

(local
	[local0 9] = [-1 8172 19]
	[local9 9] = [-1 8178 6]
	[local18 9] = [-1 8186 19]
	local27
	local28
	local29
	local30
	local31
	local32
	local33
	[local34 6] = [1008 0 1 2 3]
	[local40 11] = [1008 3 2 2 1 2 1 2 1 2]
	[local51 5] = [1008 11 1 2]
	[local56 4] = [1008 13 1]
	[local60 12] = [1008 14 1 2 1 2 1 2 2 3 2]
	[local72 12] = [1008 32 1 2 1 1 2 1 2 2 1]
	[local84 7] = [1008 41 1 2 1 2]
	[local91 4] = [1008 45 1]
	[local95 4] = [1008 31 1]
	[local99 4] = [1008 46 1]
	[local103 4] = [1008 47 1]
	[local107 4] = [1008 60 1]
	[local111 4] = [1008 49 1]
	[local115 5] = [1008 50 1 2]
	[local120 5] = [1008 52 2 1]
	[local125 4] = [1008 54 1]
	[local129 6] = [1008 24 2 1 2]
	[local135 4] = [1008 23 1]
	[local139 6] = [1008 55 2 1 3]
	[local145 5] = [1008 58 2 1]
	[local150 4] = [1008 27 1]
	[local154 6] = [1008 61 1 1 2]
	[local160 7] = [1008 64 2 1 3 2]
	[local167 4] = [1008 68 1]
	[local171 5] = [1008 69 2 1]
	[local176 9] = [1008 71 1 3 2 2 1 2]
	[local185 5] = [1008 84 1 2]
	[local190 5] = [1008 86 1 2]
	[local195 7] = [1008 88 1 2 2 2]
	[local202 4] = [1008 77 1]
	[local206 5] = [1008 78 1 2]
	[local211 9] = [1008 80 1 2 0 1008 48 1]
	[local220 11] = [1008 95 1 2 1 2 1 1 2 2]
	[local231 5] = [1008 103 1 1]
	[local236 8] = [1008 105 1 2 2 1 2]
)
(instance theMan of Actor
	(properties
		x 215
		y 60
		view 113
		loop 2
		cel 1
		signal $7800
	)
	
	(method (doit)
		(asm
			pToa     script
			bt       code_0032
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bt       code_0032
			pushi    #script
			pushi    0
			lag      global2
			send     4
code_0032:
			bnt      code_0038
			jmp      code_006c
code_0038:
			pushi    #signal
			pushi    0
			lofsa    theMan
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_006c
			lal      local31
			not     
			bnt      code_006c
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    closePoly
			send     6
			bnt      code_006c
			ldi      1
			sal      local31
			pushi    #setScript
			pushi    1
			lofsa    getBack
			push    
			lag      global0
			send     6
code_006c:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #signal
			pushi    0
			lofsa    theMan
			send     4
			push    
			ldi      32
			and     
			bnt      code_0096
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     6
			jmp      code_020a
code_0096:
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_00ae
			pushi    3
			pushi    1008
			pushi    28
			pushi    1
			calle    proc13_4,  6
			jmp      code_0209
code_00ae:
			dup     
			ldi      3
			eq?     
			bnt      code_00ce
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			lofsa    theMan
			push    
			pushi    30
			lag      global0
			send     10
			jmp      code_0209
code_00ce:
			dup     
			ldi      10
			eq?     
			bnt      code_00e4
			pushi    #setScript
			pushi    1
			lofsa    flunkyKilled
			push    
			lag      global0
			send     6
			jmp      code_0209
code_00e4:
			dup     
			ldi      5
			eq?     
			bnt      code_0173
			pushi    #offRoad
			pushi    0
			class    Wat
			send     4
			bnt      code_012c
			lal      local33
			bnt      code_0110
			pushi    4
			pushi    1
			lea      @local91
			push    
			lea      @local0
			push    
			pushi    2
			calle    proc851_0,  8
			jmp      code_0209
code_0110:
			ldi      1
			sal      local33
			pushi    6
			pushi    2
			lea      @local84
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  12
			jmp      code_0209
code_012c:
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			bnt      code_014c
			pushi    4
			pushi    1
			lea      @local91
			push    
			lea      @local0
			push    
			pushi    2
			calle    proc851_0,  8
			jmp      code_0209
code_014c:
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    8
			pushi    3
			lea      @local72
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			lea      @local9
			push    
			pushi    2
			calle    proc851_0,  16
			jmp      code_0209
code_0173:
			dup     
			ldi      4
			eq?     
			bnt      code_0209
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_01b9
			pushi    #gaveManBucks
			pushi    0
			class    Wat
			send     4
			bnt      code_01a1
			pushi    3
			pushi    1008
			pushi    92
			pushi    1
			calle    proc13_4,  6
			pushi    8
			ldi      0
			jmp      code_0208
code_01a1:
			pushi    #gaveManBucks
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			lofsa    buckTalk
			push    
			lag      global0
			send     6
			jmp      code_0208
code_01b9:
			dup     
			ldi      2
			eq?     
			bnt      code_01f2
			pushi    #offeredEmerald
			pushi    0
			class    Wat
			send     4
			bnt      code_01da
			pushi    3
			pushi    1008
			pushi    110
			pushi    1
			calle    proc13_4,  6
			jmp      code_0208
code_01da:
			pushi    #offeredEmerald
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			lofsa    offerEmerald
			push    
			lag      global0
			send     6
			jmp      code_0208
code_01f2:
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			lofsa    theMan
			push    
			pushi    30
			lag      global0
			send     10
code_0208:
			toss    
code_0209:
			toss    
code_020a:
			ret     
		)
	)
)

(instance poach of Actor
	(properties
		x 226
		y 68
		view 113
		cel 2
		signal $7800
	)
	
	(method (init)
		(asm
			pushi    #number
			pushi    1
			pushi    126
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #enable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #notify
			pushi    0
			lag      global2
			send     4
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			self     12
			pushi    #signal
			pushi    0
			lofsa    theMan
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_02fc
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lofsa    theMan
			send     16
code_02fc:
			pushi    #contains
			pushi    1
			lofsa    closePoly
			push    
			lag      global32
			send     6
			bnt      code_0312
			pushi    #dispose
			pushi    0
			lofsa    closePoly
			send     4
code_0312:
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			bnt      code_0332
			pushi    552
			pushi    #superClass
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			push    
			class    Wat
			send     6
code_0332:
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0358
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    0
			calle    proc125_2,  0
			pushi    #canControl
			pushi    1
			pushi    1
			class    User
			send     6
code_0358:
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    #signal
			pushi    0
			lofsa    theMan
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_037e
			pushi    #delete
			pushi    0
			lofsa    theMan
			send     4
			jmp      code_0389
code_037e:
			pushi    #delete
			pushi    1
			lofsa    theMan
			push    
			lag      global32
			send     6
code_0389:
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			ne?     
			bnt      code_03a8
			pushi    1
			pushi    8
			callk    DisposeScript,  2
code_03a8:
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #signal
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      32
			and     
			bnt      code_03cc
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     6
			jmp      code_056b
code_03cc:
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0402
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_03f3
			pushi    3
			pushi    1008
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_056a
code_03f3:
			pushi    3
			pushi    1008
			pushi    30
			pushi    1
			calle    proc13_4,  6
			jmp      code_056a
code_0402:
			dup     
			ldi      3
			eq?     
			bnt      code_0447
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0431
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			lofsa    theMan
			push    
			pushi    30
			lag      global0
			send     10
			jmp      code_056a
code_0431:
			pushi    4
			pushi    1
			lea      @local95
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_056a
code_0447:
			dup     
			ldi      5
			eq?     
			bnt      code_0482
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_046c
			pushi    #setScript
			pushi    1
			lofsa    iTrustYou
			push    
			lag      global0
			send     6
			jmp      code_056a
code_046c:
			pushi    4
			pushi    1
			lea      @local107
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_056a
code_0482:
			dup     
			ldi      10
			eq?     
			bnt      code_04a7
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			ne?     
			bnt      code_056a
			pushi    3
			pushi    1008
			pushi    113
			pushi    1
			calle    proc13_4,  6
			jmp      code_056a
code_04a7:
			dup     
			ldi      4
			eq?     
			bnt      code_055f
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0546
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0506
			lal      local27
			bnt      code_04d8
			pushi    2
			pushi    1008
			pushi    93
			calle    proc13_4,  4
			jmp      code_0542
code_04d8:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			bnt      code_04f8
			ldi      1
			sal      local27
			pushi    #setScript
			pushi    3
			lofsa    givePoacherBucks
			push    
			pushi    0
			pushi    0
			lag      global0
			send     10
			jmp      code_0542
code_04f8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0542
code_0506:
			dup     
			ldi      2
			eq?     
			bnt      code_0537
			lal      local28
			bnt      code_0521
			pushi    3
			pushi    1008
			pushi    93
			pushi    1
			calle    proc13_4,  6
			jmp      code_0542
code_0521:
			ldi      1
			sal      local28
			pushi    #setScript
			pushi    3
			lofsa    givePoacherBucks
			push    
			pushi    0
			pushi    2
			lag      global0
			send     10
			jmp      code_0542
code_0537:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0542:
			toss    
			jmp      code_056a
code_0546:
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			lofsa    theMan
			push    
			pushi    30
			lag      global0
			send     10
			jmp      code_056a
code_055f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_056a:
			toss    
code_056b:
			ret     
		)
	)
)

(instance shootist of Prop
	(properties
		view 393
		cel 4
	)
)

(instance closePoly of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    164
			pushi    97
			pushi    116
			pushi    60
			pushi    212
			pushi    40
			pushi    269
			pushi    64
			pushi    269
			pushi    89
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
	
	(method (doVerb theVerb)
		(asm
			pushi    #onMe
			pushi    1
			pushSelf
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     6
			bnt      code_06c8
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     6
			jmp      code_06fc
code_06c8:
			pushi    #onMe
			pushi    1
			pushSelf
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     6
			bnt      code_06ed
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     6
			jmp      code_06fc
code_06ed:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     6
code_06fc:
			ret     
		)
	)
)

(instance poachScript of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
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
			bnt      code_07b9
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #init
			pushi    0
			lofsa    closePoly
			send     4
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_07a2
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_0905
code_07a2:
			pushi    #init
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			lofsa    theMan
			send     16
			jmp      code_0905
code_07b9:
			dup     
			ldi      1
			eq?     
			bnt      code_07f6
			pushi    #cel
			pushi    1
			pushi    7
			lofsa    theMan
			send     6
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    308
			pushi    2
			pushi    6
			pushi    4
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    224
			pushi    75
			pushSelf
			lofsa    poach
			send     30
			ldi      6
			aTop     ticks
			jmp      code_0905
code_07f6:
			dup     
			ldi      2
			eq?     
			bnt      code_0823
			pushi    #view
			pushi    1
			pushi    752
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    207
			pushi    3
			pushi    1
			pushi    66
			dup     
			pushi    1
			pushi    3
			lofsa    theMan
			send     36
			jmp      code_0905
code_0823:
			dup     
			ldi      3
			eq?     
			bnt      code_084f
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    308
			pushi    2
			pushi    3
			pushi    2
			pushi    284
			pushi    2
			pushi    205
			pushi    74
			lofsa    poach
			send     28
			ldi      6
			aTop     ticks
			jmp      code_0905
code_084f:
			dup     
			ldi      4
			eq?     
			bnt      code_0875
			pushi    9
			pushi    3
			lea      @local34
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			lea      @local9
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0905
code_0875:
			dup     
			ldi      5
			eq?     
			bnt      code_088c
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    theMan
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0905
code_088c:
			dup     
			ldi      6
			eq?     
			bnt      code_08ac
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    theMan
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    poach
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0905
code_08ac:
			dup     
			ldi      7
			eq?     
			bnt      code_08d1
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    65535
			pushSelf
			lofsa    theMan
			send     12
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    poach
			send     6
			jmp      code_0905
code_08d1:
			dup     
			ldi      8
			eq?     
			bnt      code_08f1
			pushi    7
			pushi    2
			lea      @local40
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0905
code_08f1:
			dup     
			ldi      9
			eq?     
			bnt      code_0905
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0905:
			toss    
			ret     
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
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
			ldi      1
			eq?     
			bnt      code_09ae
			pushi    0
			callb    proc0_3,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			gt?     
			bnt      code_0995
			pushi    5
			pushi    1
			lea      @local56
			push    
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_09e0
code_0995:
			pushi    7
			pushi    2
			lea      @local51
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_09e0
code_09ae:
			dup     
			ldi      2
			eq?     
			bnt      code_09e0
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			gt?     
			bnt      code_09d3
			pushi    #setScript
			pushi    1
			lofsa    lastChance
			push    
			pToa     client
			send     6
			jmp      code_09e0
code_09d3:
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_09e0:
			toss    
			ret     
		)
	)
)

(instance lastChance of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
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
			bnt      code_0a50
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    shootist
			send     12
			jmp      code_0b0b
code_0a50:
			dup     
			ldi      1
			eq?     
			bnt      code_0a93
			pushi    #number
			pushi    1
			pushi    906
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lofsa    shootist
			send     12
			pushi    #view
			pushi    1
			pushi    792
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_0b0b
code_0a93:
			dup     
			ldi      2
			eq?     
			bnt      code_0ac2
			pushi    #number
			pushi    1
			pushi    907
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    #view
			pushi    1
			pushi    752
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lofsa    theMan
			send     18
			ldi      60
			aTop     ticks
			jmp      code_0b0b
code_0ac2:
			dup     
			ldi      3
			eq?     
			bnt      code_0acc
			jmp      code_0b0b
code_0acc:
			dup     
			ldi      4
			eq?     
			bnt      code_0af5
			pushi    9
			pushi    3
			lea      @local60
			push    
			lea      @local18
			push    
			pushi    2
			lea      @local0
			push    
			pushi    3
			lea      @local9
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0b0b
code_0af5:
			dup     
			ldi      5
			eq?     
			bnt      code_0b0b
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    0
			calle    proc806_0,  0
code_0b0b:
			toss    
			ret     
		)
	)
)

(instance getBack of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
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
			bnt      code_0b85
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0c0b
code_0b85:
			dup     
			ldi      1
			eq?     
			bnt      code_0bbd
			+al      local32
			push    
			ldi      3
			eq?     
			bnt      code_0ba4
			pushi    #setScript
			pushi    1
			lofsa    poacherKilled
			push    
			pToa     client
			send     6
			jmp      code_0c0b
code_0ba4:
			pushi    7
			pushi    2
			lea      @local129
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0c0b
code_0bbd:
			dup     
			ldi      2
			eq?     
			bnt      code_0be9
			pushi    #setLoop
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    1
			class    Rev
			push    
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    65511
			pushSelf
			lag      global0
			send     22
			jmp      code_0c0b
code_0be9:
			dup     
			ldi      3
			eq?     
			bnt      code_0c0b
			ldi      0
			sal      local31
			pushi    0
			callb    proc0_2,  0
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
code_0c0b:
			toss    
			ret     
		)
	)
)

(instance getYerMen of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cb6
			lsg      global87
			ldi      1
			lt?     
			aTop     register
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    128
			pushi    151
			pushi    152
			pushi    160
			pushi    161
			pushi    154
			pushi    155
			calle    proc958_0,  14
			pushi    1
			pushi    19
			callk    ScriptID,  2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    #stopUpd
			pushi    0
			lofsa    theMan
			send     4
			pushi    #stopUpd
			pushi    0
			lofsa    poach
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0fd4
code_0cb6:
			dup     
			ldi      1
			eq?     
			bnt      code_0cdd
			pushi    #blewHorn
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    5
			pushi    1
			lea      @local167
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0fd4
code_0cdd:
			dup     
			ldi      2
			eq?     
			bnt      code_0cff
			pushi    1
			pushi    5
			callk    DisposeScript,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_0fd4
code_0cff:
			dup     
			ldi      3
			eq?     
			bnt      code_0d15
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0fd4
code_0d15:
			dup     
			ldi      4
			eq?     
			bnt      code_0d23
			ldi      12
			aTop     ticks
			jmp      code_0fd4
code_0d23:
			dup     
			ldi      5
			eq?     
			bnt      code_0d67
			pToa     register
			bnt      code_0d4d
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32777
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      30
			aTop     ticks
			jmp      code_0fd4
code_0d4d:
			pushi    #stopUpd
			pushi    0
			lag      global0
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0fd4
code_0d67:
			dup     
			ldi      6
			eq?     
			bnt      code_0df6
			pToa     register
			bnt      code_0def
			pushi    #loop
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    185
			pushi    50
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     22
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    95
			pushi    70
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    152
			pushi    107
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     26
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    240
			pushi    125
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     22
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32777
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_0fd4
code_0def:
			ldi      30
			aTop     ticks
			jmp      code_0fd4
code_0df6:
			dup     
			ldi      7
			eq?     
			bnt      code_0e22
			pushi    2
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    40
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_0fd4
code_0e22:
			dup     
			ldi      8
			eq?     
			bnt      code_0e30
			ldi      30
			aTop     ticks
			jmp      code_0fd4
code_0e30:
			dup     
			ldi      9
			eq?     
			bnt      code_0e4f
			pushi    7
			pushi    2
			lea      @local171
			push    
			pushi    3
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0fd4
code_0e4f:
			dup     
			ldi      10
			eq?     
			bnt      code_0e73
			pushi    9
			pushi    3
			lea      @local176
			push    
			pushi    1
			pushi    2
			pushi    13
			pushi    3
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0fd4
code_0e73:
			dup     
			ldi      11
			eq?     
			bnt      code_0f30
			pToa     register
			bnt      code_0ebe
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32777
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      30
			aTop     ticks
			jmp      code_0fd4
code_0ebe:
			pushi    #stopUpd
			pushi    0
			lag      global0
			send     4
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    65511
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      15
			sub     
			push    
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    335
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      10
			sub     
			push    
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    335
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			jmp      code_0fd4
code_0f30:
			dup     
			ldi      12
			eq?     
			bnt      code_0f5f
			pToa     register
			bnt      code_0fd4
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32777
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_0fd4
code_0f5f:
			dup     
			ldi      13
			eq?     
			bnt      code_0f6d
			ldi      6
			aTop     ticks
			jmp      code_0fd4
code_0f6d:
			dup     
			ldi      14
			eq?     
			bnt      code_0f83
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0fd4
code_0f83:
			dup     
			ldi      15
			eq?     
			bnt      code_0fd4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #startUpd
			pushi    0
			lofsa    theMan
			send     4
			pushi    #startUpd
			pushi    0
			lofsa    poach
			send     4
			ldi      1
			sal      local30
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
code_0fd4:
			toss    
			ret     
		)
	)
)

(instance poacherKilled of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    screamSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
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
			bnt      code_1046
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lofsa    theMan
			send     18
			jmp      code_1106
code_1046:
			dup     
			ldi      1
			eq?     
			bnt      code_1076
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    theMan
			send     12
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    2
			pushi    1
			lofsa    poach
			send     16
			jmp      code_1106
code_1076:
			dup     
			ldi      2
			eq?     
			bnt      code_109b
			pushi    #play
			pushi    0
			lofsa    screamSound
			send     4
			pushi    5
			pushi    1
			lea      @local135
			push    
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_1106
code_109b:
			dup     
			ldi      3
			eq?     
			bnt      code_10c7
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    theMan
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    poach
			send     8
			pushi    #poachStatus
			pushi    1
			pushi    2
			class    Wat
			send     6
			jmp      code_1106
code_10c7:
			dup     
			ldi      4
			eq?     
			bnt      code_10f3
			pushi    #addToPic
			pushi    0
			lofsa    poach
			send     4
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    5
			pushi    1
			lea      @local150
			push    
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_1106
code_10f3:
			dup     
			ldi      5
			eq?     
			bnt      code_1106
			pushi    #setScript
			pushi    1
			lofsa    flunkyKilled
			push    
			pToa     client
			send     6
code_1106:
			toss    
			ret     
		)
	)
)

(instance flunkyKilled of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #signal
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      32
			and     
			bnt      code_116c
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
code_116c:
			pushi    #dispose
			pushi    0
			&rest    param1
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
			bnt      code_119e
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			aTop     register
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1500
code_119e:
			dup     
			ldi      1
			eq?     
			bnt      code_11cb
			pushi    380
			pushi    #superClass
			lsg      global141
			ldi      2
			div     
			push    
			lag      global1
			send     6
			pushi    #view
			pushi    1
			pushi    4
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
			jmp      code_1500
code_11cb:
			dup     
			ldi      2
			eq?     
			bnt      code_11f3
			pushi    #view
			pushi    1
			pushi    5
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
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    theMan
			send     6
			jmp      code_1500
code_11f3:
			dup     
			ldi      3
			eq?     
			bnt      code_123a
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #signal
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_1225
			pushi    #view
			pushi    1
			pushi    745
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lofsa    poach
			send     18
code_1225:
			pushi    #distanceTo
			pushi    1
			lofsa    theMan
			push    
			lag      global0
			send     6
			push    
			ldi      4
			div     
			aTop     ticks
			jmp      code_1500
code_123a:
			dup     
			ldi      4
			eq?     
			bnt      code_12a5
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #number
			pushi    1
			pushi    907
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    #setSpeed
			pushi    1
			pTos     register
			lag      global1
			send     6
			pushi    6
			pushi    #superClass
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theMan
			send     4
			push    
			ldi      3
			add     
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    theMan
			send     26
			pushi    #signal
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_1500
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    poach
			send     6
			jmp      code_1500
code_12a5:
			dup     
			ldi      5
			eq?     
			bnt      code_12c0
			pushi    #addToPic
			pushi    0
			lofsa    theMan
			send     4
			pushi    0
			callb    proc0_2,  0
			ldi      60
			aTop     ticks
			jmp      code_1500
code_12c0:
			dup     
			ldi      6
			eq?     
			bnt      code_1341
			pushi    43
			pushi    1
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_12de
			ldi      127
			jmp      code_12e1
code_12de:
			ldi      128
code_12e1:
			push    
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_1316
			pushi    1
			pushi    153
			callb    proc0_6,  2
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1500
code_1316:
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    poach
			send     6
			pushi    1
			pushi    153
			callb    proc0_7,  2
			pushi    #poachStatus
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			lofsa    savedThePoacher
			push    
			pToa     client
			send     6
			jmp      code_1500
code_1341:
			dup     
			ldi      7
			eq?     
			bnt      code_135d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_1500
code_135d:
			dup     
			ldi      8
			eq?     
			bnt      code_1379
			pushi    1
			pushi    5
			callk    DisposeScript,  2
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1500
code_1379:
			dup     
			ldi      9
			eq?     
			bnt      code_1387
			ldi      12
			aTop     ticks
			jmp      code_1500
code_1387:
			dup     
			ldi      10
			eq?     
			bnt      code_13a0
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1500
code_13a0:
			dup     
			ldi      11
			eq?     
			bnt      code_13bd
			ldi      1
			sal      local29
			pushi    3
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1500
code_13bd:
			dup     
			ldi      12
			eq?     
			bnt      code_13cb
			ldi      12
			aTop     ticks
			jmp      code_1500
code_13cb:
			dup     
			ldi      13
			eq?     
			bnt      code_13ed
			pushi    9
			pushi    3
			lea      @local139
			push    
			pushi    2
			pushi    0
			pushi    13
			pushi    2
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_1500
code_13ed:
			dup     
			ldi      14
			eq?     
			bnt      code_140a
			pushi    7
			pushi    2
			lea      @local145
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_1500
code_140a:
			dup     
			ldi      15
			eq?     
			bnt      code_1418
			ldi      60
			aTop     ticks
			jmp      code_1500
code_1418:
			dup     
			ldi      16
			eq?     
			bnt      code_1468
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    160
			pushi    95
			lag      global0
			send     20
			pushi    #cel
			pushi    1
			pushi    7
			pushi    284
			pushi    2
			pushi    120
			pushi    125
			lag      global109
			send     14
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      120
			aTop     ticks
			jmp      code_1500
code_1468:
			dup     
			ldi      17
			eq?     
			bnt      code_14db
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_1493
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_1500
code_1493:
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			ldi      1
			sal      local30
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_1500
code_14db:
			dup     
			ldi      18
			eq?     
			bnt      code_1500
			pushi    0
			calle    proc125_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    poach
			send     4
code_1500:
			toss    
			ret     
		)
	)
)

(instance savedThePoacher of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_156d
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			aTop     register
			pushi    5
			pushi    1
			lea      @local111
			push    
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1950
code_156d:
			dup     
			ldi      1
			eq?     
			bnt      code_159a
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    poach
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      4
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1950
code_159a:
			dup     
			ldi      2
			eq?     
			bnt      code_15af
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lag      global0
			send     8
			jmp      code_1950
code_15af:
			dup     
			ldi      3
			eq?     
			bnt      code_15dc
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    Fwd
			push    
			lag      global0
			send     30
			ldi      60
			aTop     ticks
			jmp      code_1950
code_15dc:
			dup     
			ldi      4
			eq?     
			bnt      code_1606
			pushi    7
			pushi    2
			lea      @local115
			push    
			pushi    3
			pushi    2
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			pushi    1
			pushi    100
			calle    proc806_1,  2
			jmp      code_1950
code_1606:
			dup     
			ldi      5
			eq?     
			bnt      code_165d
			pushi    #setSpeed
			pushi    1
			pTos     register
			lag      global1
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    5
			pushi    #superClass
			pushi    113
			pushi    6
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      19
			add     
			push    
			lofsa    poach
			send     18
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      45
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
			jmp      code_1950
code_165d:
			dup     
			ldi      6
			eq?     
			bnt      code_1673
			pushi    3
			lsg      global0
			lofsa    poach
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1950
code_1673:
			dup     
			ldi      7
			eq?     
			bnt      code_1693
			pushi    7
			pushi    2
			lea      @local120
			push    
			pushi    1
			pushi    2
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1950
code_1693:
			dup     
			ldi      8
			eq?     
			bnt      code_16b8
			pushi    #stopUpd
			pushi    0
			lofsa    poach
			send     4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_1950
code_16b8:
			dup     
			ldi      9
			eq?     
			bnt      code_16d1
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1950
code_16d1:
			dup     
			ldi      10
			eq?     
			bnt      code_16df
			ldi      12
			aTop     ticks
			jmp      code_1950
code_16df:
			dup     
			ldi      11
			eq?     
			bnt      code_1706
			pushi    1
			pushi    5
			callk    DisposeScript,  2
			pushi    #stopUpd
			pushi    0
			lag      global0
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1950
code_1706:
			dup     
			ldi      12
			eq?     
			bnt      code_172c
			ldi      1
			sal      local29
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    3
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1950
code_172c:
			dup     
			ldi      13
			eq?     
			bnt      code_173a
			ldi      5
			aTop     cycles
			jmp      code_1950
code_173a:
			dup     
			ldi      14
			eq?     
			bnt      code_1759
			pushi    7
			pushi    2
			lea      @local154
			push    
			pushi    3
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1950
code_1759:
			dup     
			ldi      15
			eq?     
			bnt      code_177b
			pushi    9
			pushi    3
			lea      @local160
			push    
			pushi    1
			pushi    2
			pushi    13
			pushi    3
			pushi    15
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_1950
code_177b:
			dup     
			ldi      16
			eq?     
			bnt      code_1789
			ldi      60
			aTop     ticks
			jmp      code_1950
code_1789:
			dup     
			ldi      17
			eq?     
			bnt      code_17f8
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			pushi    #view
			pushi    1
			pushi    113
			pushi    284
			pushi    2
			pushi    190
			pushi    105
			lofsa    poach
			send     14
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    160
			pushi    95
			lag      global0
			send     20
			pushi    #cel
			pushi    1
			pushi    7
			pushi    284
			pushi    2
			pushi    120
			pushi    125
			lag      global109
			send     14
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      120
			aTop     ticks
			jmp      code_1950
code_17f8:
			dup     
			ldi      18
			eq?     
			bnt      code_184f
			pushi    #dispose
			pushi    0
			lofsa    closePoly
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			ldi      1
			sal      local30
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_1950
code_184f:
			dup     
			ldi      19
			eq?     
			bnt      code_186d
			pushi    5
			pushi    1
			lea      @local125
			push    
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1950
code_186d:
			dup     
			ldi      20
			eq?     
			bnt      code_18c8
			pushi    #poachStatus
			pushi    1
			pushi    3
			class    Wat
			send     6
			pushi    1
			pushi    174
			callb    proc0_6,  2
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    20
			pushi    240
			pushSelf
			lofsa    poach
			send     24
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    1
			calle    proc806_6,  2
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
			pushi    #disable
			pushi    2
			pushi    0
			pushi    5
			lag      global69
			send     8
			jmp      code_1950
code_18c8:
			dup     
			ldi      21
			eq?     
			bnt      code_192b
			pushi    #canControl
			pushi    1
			pushi    1
			class    User
			send     6
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_1904
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_1950
code_1904:
			pushi    0
			callb    proc0_3,  0
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_191c
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global2
			send     6
code_191c:
			pushi    3
			pushi    1008
			pushi    112
			pushSelf
			calle    proc13_4,  6
			jmp      code_1950
code_192b:
			dup     
			ldi      22
			eq?     
			bnt      code_1950
			pushi    0
			callb    proc0_4,  0
			pushi    0
			calle    proc125_2,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			lofsa    poach
			send     4
code_1950:
			toss    
			ret     
		)
	)
)

(instance offerEmerald of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19b1
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    130
			pushi    100
			pushSelf
			lag      global0
			send     12
			jmp      code_1a5c
code_19b1:
			dup     
			ldi      1
			eq?     
			bnt      code_19c6
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lag      global0
			send     8
			jmp      code_1a5c
code_19c6:
			dup     
			ldi      2
			eq?     
			bnt      code_19f4
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     36
			jmp      code_1a5c
code_19f4:
			dup     
			ldi      3
			eq?     
			bnt      code_1a15
			pushi    8
			pushi    2
			lea      @local220
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			pushi    0
			calle    proc851_0,  16
			jmp      code_1a5c
code_1a15:
			dup     
			ldi      4
			eq?     
			bnt      code_1a30
			pushi    6
			pushi    1
			lea      @local231
			push    
			pushi    2
			pushi    2
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_1a5c
code_1a30:
			dup     
			ldi      5
			eq?     
			bnt      code_1a46
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1a5c
code_1a46:
			dup     
			ldi      6
			eq?     
			bnt      code_1a5c
			pushi    1
			pushi    6
			callb    proc0_2,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1a5c:
			toss    
			ret     
		)
	)
)

(instance buckTalk of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1abf
			pushi    7
			pushi    2
			lea      @local185
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b0c
code_1abf:
			dup     
			ldi      1
			eq?     
			bnt      code_1ae0
			pushi    7
			pushi    2
			lea      @local190
			push    
			pushi    3
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b0c
code_1ae0:
			dup     
			ldi      2
			eq?     
			bnt      code_1b00
			pushi    7
			pushi    2
			lea      @local195
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b0c
code_1b00:
			dup     
			ldi      3
			eq?     
			bnt      code_1b0c
			pushi    #dispose
			pushi    0
			self     4
code_1b0c:
			toss    
			ret     
		)
	)
)

(instance givePoacherBucks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b86
			pushi    2
			pushi    128
			pushi    7
			callk    Load,  4
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    283
			pushi    1
			pushi    0
			lofsa    poach
			send     12
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local202
			push    
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1d97
code_1b86:
			dup     
			ldi      1
			eq?     
			bnt      code_1bc8
			pTos     register
			ldi      2
			ne?     
			bnt      code_1b9e
			pushi    1
			pushi    50
			calle    proc806_1,  2
code_1b9e:
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      22
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    poach
			send     4
			push    
			ldi      3
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1d97
code_1bc8:
			dup     
			ldi      2
			eq?     
			bnt      code_1bde
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_1d97
code_1bde:
			dup     
			ldi      3
			eq?     
			bnt      code_1c10
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_1d97
code_1c10:
			dup     
			ldi      4
			eq?     
			bnt      code_1c50
			pTos     register
			ldi      2
			eq?     
			bnt      code_1c37
			pushi    7
			pushi    2
			lea      @local236
			push    
			pushi    1
			pushi    0
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1d97
code_1c37:
			pushi    7
			pushi    2
			lea      @local206
			push    
			pushi    3
			pushi    0
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1d97
code_1c50:
			dup     
			ldi      5
			eq?     
			bnt      code_1c6f
			pushi    7
			pushi    2
			lea      @local211
			push    
			pushi    1
			pushi    0
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1d97
code_1c6f:
			dup     
			ldi      6
			eq?     
			bnt      code_1c85
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1d97
code_1c85:
			dup     
			ldi      7
			eq?     
			bnt      code_1cbe
			pushi    0
			callb    proc0_2,  0
			pushi    #setSpeed
			pushi    1
			lsg      global157
			lag      global1
			send     6
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      25
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
			jmp      code_1d97
code_1cbe:
			dup     
			ldi      8
			eq?     
			bnt      code_1d35
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    20
			pushi    240
			pushSelf
			lofsa    poach
			send     18
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      188
			gt?     
			bnt      code_1d0c
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    178
			pushSelf
			lag      global0
			send     12
			jmp      code_1d12
code_1d0c:
			pushi    #cue
			pushi    0
			self     4
code_1d12:
			pushi    0
			callb    proc0_4,  0
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
			pushi    #disable
			pushi    2
			pushi    0
			pushi    5
			lag      global69
			send     8
			pushi    1
			pushi    1
			calle    proc806_6,  2
			jmp      code_1d97
code_1d35:
			dup     
			ldi      9
			eq?     
			bnt      code_1d4a
			pushi    #setHeading
			pushi    1
			pushi    225
			lag      global0
			send     6
			jmp      code_1d97
code_1d4a:
			dup     
			ldi      10
			eq?     
			bnt      code_1d60
			pushi    3
			pushi    1008
			pushi    112
			pushSelf
			calle    proc13_4,  6
			jmp      code_1d97
code_1d60:
			dup     
			ldi      11
			eq?     
			bnt      code_1d97
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_1d83
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_1d97
code_1d83:
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			lofsa    poach
			send     4
code_1d97:
			toss    
			ret     
		)
	)
)

(instance iTrustYou of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1dfb
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local99
			push    
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1e8f
code_1dfb:
			dup     
			ldi      1
			eq?     
			bnt      code_1e12
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    theMan
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1e8f
code_1e12:
			dup     
			ldi      2
			eq?     
			bnt      code_1e32
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    theMan
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    poach
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1e8f
code_1e32:
			dup     
			ldi      3
			eq?     
			bnt      code_1e57
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    65535
			pushSelf
			lofsa    theMan
			send     12
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    poach
			send     6
			jmp      code_1e8f
code_1e57:
			dup     
			ldi      4
			eq?     
			bnt      code_1e75
			pushi    5
			pushi    1
			lea      @local103
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1e8f
code_1e75:
			dup     
			ldi      5
			eq?     
			bnt      code_1e8f
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
code_1e8f:
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
			bnt      code_1f5e
			lsp      param2
			ldi      1
			eq?     
			bnt      code_1f5e
			lal      local30
			bt       code_1ee9
			pushi    #blewHorn
			pushi    0
			class    Wat
			send     4
code_1ee9:
			bnt      code_1f1f
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f0d
			pushi    3
			pushi    1008
			pushi    82
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_1f1b
code_1f0d:
			pushi    3
			pushi    1008
			pushi    83
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_1f1b:
			toss    
			jmp      code_1f5e
code_1f1f:
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_1f3d
			pushi    3
			pushi    1008
			pushi    94
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f5e
code_1f3d:
			lal      local29
			not     
			bnt      code_1f5e
			pushi    #poachStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_1f5e
			pushi    #setScript
			pushi    1
			lofsa    getYerMen
			push    
			lag      global0
			send     6
code_1f5e:
			ret     
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 906
	)
)

(instance screamSound of Sound
	(properties
		flags $0001
		number 932
	)
)
