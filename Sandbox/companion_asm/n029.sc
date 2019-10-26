;;; Sierra Script 1.0 - (do not remove this comment)
(script# 29)
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
	theWoman 1
	shooter 2
	womanScript 3
)

(local
	[local0 9] = [-1 6876 19]
	[local9 9] = [-1 6881 6]
	[local18 9] = [-1 6895 19]
	local27
	local28
	local29
	local30
	local31
	local32
	[local33 8] = [1029 0 1 2 3 1 2]
	[local41 5] = [1029 5 1 2]
	[local46 4] = [1029 7 1]
	[local50 8] = [1029 8 1 2 1 2 1]
	[local58 14] = [1029 14 1 2 1 2 1 2 3 2 2 1 2]
	[local72 11] = [1029 25 1 2 1 3 2 1 2 2]
	[local83 4] = [1029 33 1]
	[local87 4] = [1029 36 1]
	[local91 4] = [1029 37 1]
	[local95 4] = [1029 38 1]
	[local99 6] = [1029 61 2 1 2]
	[local105 4] = [1029 64 1]
	[local109 6] = [1029 51 2 1 2]
	[local115 4] = [1029 54 1]
	[local119 4] = [1029 56 1]
	[local123 7] = [1029 57 2 1 2 3]
	[local130 4] = [1029 55 1]
	[local134 5] = [1029 65 2 1]
	[local139 5] = [1029 41 2 1]
	[local144 6] = [1029 43 2 1 3]
	[local150 5] = [1029 46 1 2]
	[local155 4] = [1029 48 1]
	[local159 9] = [1029 67 1 2 1 2 2 3]
	[local168 7] = [1029 73 1 2 1 2]
	[local175 4] = [1029 78 1]
	[local179 7] = [1029 79 1 2 2 1]
)
(instance theMan of Actor
	(properties
		x 215
		y 60
		view 112
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
			lal      local30
			not     
			bnt      code_006c
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    closePoly
			send     6
			bnt      code_006c
			ldi      1
			sal      local30
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
			jmp      code_01cf
code_0096:
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_00ac
			pushi    2
			pushi    1029
			pushi    13
			calle    proc13_4,  4
			jmp      code_01ce
code_00ac:
			dup     
			ldi      3
			eq?     
			bnt      code_00cc
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
			jmp      code_01ce
code_00cc:
			dup     
			ldi      10
			eq?     
			bnt      code_00e2
			pushi    #setScript
			pushi    1
			lofsa    flunkyKilled
			push    
			lag      global0
			send     6
			jmp      code_01ce
code_00e2:
			dup     
			ldi      5
			eq?     
			bnt      code_0177
			pushi    #offRoad
			pushi    0
			class    Wat
			send     4
			bnt      code_0130
			lal      local32
			bnt      code_010e
			pushi    4
			pushi    1
			lea      @local83
			push    
			lea      @local0
			push    
			pushi    2
			calle    proc851_0,  8
			jmp      code_01ce
code_010e:
			ldi      1
			sal      local32
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
			jmp      code_01ce
code_0130:
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			bnt      code_0150
			pushi    4
			pushi    1
			lea      @local83
			push    
			lea      @local0
			push    
			pushi    2
			calle    proc851_0,  8
			jmp      code_01ce
code_0150:
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    8
			pushi    3
			lea      @local58
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
			jmp      code_01ce
code_0177:
			dup     
			ldi      4
			eq?     
			bnt      code_01ce
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_01b7
			pushi    #gaveManBucks
			pushi    0
			class    Wat
			send     4
			bnt      code_019f
			pushi    2
			pushi    1029
			pushi    77
			calle    proc13_4,  4
			jmp      code_01cd
code_019f:
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
			jmp      code_01cd
code_01b7:
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
code_01cd:
			toss    
code_01ce:
			toss    
code_01cf:
			ret     
		)
	)
)

(instance theWoman of Actor
	(properties
		x 220
		y 69
		view 112
		cel 5
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
			bnt      code_02c0
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
code_02c0:
			pushi    #contains
			pushi    1
			lofsa    closePoly
			push    
			lag      global32
			send     6
			bnt      code_02d6
			pushi    #dispose
			pushi    0
			lofsa    closePoly
			send     4
code_02d6:
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			bnt      code_02f6
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
code_02f6:
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_031c
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
code_031c:
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
			bnt      code_0342
			pushi    #delete
			pushi    0
			lofsa    theMan
			send     4
			jmp      code_034d
code_0342:
			pushi    #delete
			pushi    1
			lofsa    theMan
			push    
			lag      global32
			send     6
code_034d:
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #signal
			pushi    0
			lofsa    theWoman
			send     4
			push    
			ldi      32
			and     
			bnt      code_037b
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     6
			jmp      code_04d9
code_037b:
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_03ad
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_03a0
			pushi    2
			pushi    1029
			pushi    34
			calle    proc13_4,  4
			jmp      code_04d8
code_03a0:
			pushi    2
			pushi    1029
			pushi    35
			calle    proc13_4,  4
			jmp      code_04d8
code_03ad:
			dup     
			ldi      3
			eq?     
			bnt      code_03f1
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_03dc
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
			jmp      code_04d8
code_03dc:
			pushi    4
			pushi    1
			lea      @local87
			push    
			lea      @local9
			push    
			pushi    1
			calle    proc851_0,  8
			jmp      code_04d8
code_03f1:
			dup     
			ldi      5
			eq?     
			bnt      code_0432
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_041d
			pushi    4
			pushi    1
			lea      @local91
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_04d8
code_041d:
			pushi    4
			pushi    1
			lea      @local95
			push    
			lea      @local9
			push    
			pushi    1
			calle    proc851_0,  8
			jmp      code_04d8
code_0432:
			dup     
			ldi      10
			eq?     
			bnt      code_0457
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			ne?     
			bnt      code_04d8
			pushi    3
			pushi    1029
			pushi    84
			pushi    1
			calle    proc13_4,  6
			jmp      code_04d8
code_0457:
			dup     
			ldi      4
			eq?     
			bnt      code_04cd
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_04be
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_04a5
			lal      local27
			bnt      code_0488
			pushi    2
			pushi    1029
			pushi    39
			calle    proc13_4,  4
			jmp      code_04c9
code_0488:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			bnt      code_04c9
			ldi      1
			sal      local27
			pushi    #setScript
			pushi    1
			lofsa    giveWomanBucks
			push    
			lag      global0
			send     6
			jmp      code_04c9
code_04a5:
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
			jmp      code_04c9
code_04be:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_04c9:
			toss    
			jmp      code_04d8
code_04cd:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_04d8:
			toss    
code_04d9:
			ret     
		)
	)
)

(instance shooter of Prop
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
			bnt      code_0636
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     6
			jmp      code_066a
code_0636:
			pushi    #onMe
			pushi    1
			pushSelf
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     6
			bnt      code_065b
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     6
			jmp      code_066a
code_065b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     6
code_066a:
			ret     
		)
	)
)

(instance womanScript of Script
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
			bnt      code_0727
			pushi    0
			callb    proc0_3,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #init
			pushi    0
			lofsa    closePoly
			send     4
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_0710
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_07f8
code_0710:
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
			jmp      code_07f8
code_0727:
			dup     
			ldi      1
			eq?     
			bnt      code_0764
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
			pushi    212
			pushi    76
			pushSelf
			lofsa    theWoman
			send     30
			ldi      6
			aTop     ticks
			jmp      code_07f8
code_0764:
			dup     
			ldi      2
			eq?     
			bnt      code_0792
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
			pushi    205
			pushi    3
			pushi    1
			pushi    65
			pushi    66
			pushi    1
			pushi    3
			lofsa    theMan
			send     36
			jmp      code_07f8
code_0792:
			dup     
			ldi      3
			eq?     
			bnt      code_07be
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    308
			pushi    2
			pushi    3
			pushi    2
			pushi    284
			pushi    2
			pushi    197
			pushi    73
			lofsa    theWoman
			send     28
			ldi      6
			aTop     ticks
			jmp      code_07f8
code_07be:
			dup     
			ldi      4
			eq?     
			bnt      code_07e4
			pushi    9
			pushi    3
			lea      @local33
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
			jmp      code_07f8
code_07e4:
			dup     
			ldi      5
			eq?     
			bnt      code_07f8
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_07f8:
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
			bnt      code_08a0
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
			bnt      code_0887
			pushi    5
			pushi    1
			lea      @local46
			push    
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_08d2
code_0887:
			pushi    7
			pushi    2
			lea      @local41
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_08d2
code_08a0:
			dup     
			ldi      2
			eq?     
			bnt      code_08d2
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			gt?     
			bnt      code_08c5
			pushi    #setScript
			pushi    1
			lofsa    lastChance
			push    
			pToa     client
			send     6
			jmp      code_08d2
code_08c5:
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_08d2:
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
			bnt      code_0942
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    shooter
			send     12
			jmp      code_09f7
code_0942:
			dup     
			ldi      1
			eq?     
			bnt      code_0985
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
			lofsa    shooter
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
			jmp      code_09f7
code_0985:
			dup     
			ldi      2
			eq?     
			bnt      code_09b4
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
			jmp      code_09f7
code_09b4:
			dup     
			ldi      3
			eq?     
			bnt      code_09be
			jmp      code_09f7
code_09be:
			dup     
			ldi      4
			eq?     
			bnt      code_09e1
			pushi    7
			pushi    2
			lea      @local50
			push    
			lea      @local18
			push    
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_09f7
code_09e1:
			dup     
			ldi      5
			eq?     
			bnt      code_09f7
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    0
			calle    proc806_0,  0
code_09f7:
			toss    
			ret     
		)
	)
)

(instance getBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a60
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
			jmp      code_0ae6
code_0a60:
			dup     
			ldi      1
			eq?     
			bnt      code_0a98
			+al      local31
			push    
			ldi      3
			eq?     
			bnt      code_0a7f
			pushi    #setScript
			pushi    1
			lofsa    womanKilled
			push    
			pToa     client
			send     6
			jmp      code_0ae6
code_0a7f:
			pushi    7
			pushi    2
			lea      @local109
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ae6
code_0a98:
			dup     
			ldi      2
			eq?     
			bnt      code_0ac4
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
			jmp      code_0ae6
code_0ac4:
			dup     
			ldi      3
			eq?     
			bnt      code_0ae6
			ldi      0
			sal      local30
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
code_0ae6:
			toss    
			ret     
		)
	)
)

(instance womanKilled of Script
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
			bnt      code_0b6e
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    theMan
			send     18
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    1
			lofsa    theWoman
			send     16
			jmp      code_0bfe
code_0b6e:
			dup     
			ldi      1
			eq?     
			bnt      code_0b93
			pushi    #play
			pushi    0
			lofsa    screamSound
			send     4
			pushi    5
			pushi    1
			lea      @local115
			push    
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0bfe
code_0b93:
			dup     
			ldi      2
			eq?     
			bnt      code_0bbf
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
			lofsa    theWoman
			send     8
			pushi    #womanStatus
			pushi    1
			pushi    2
			class    Wat
			send     6
			jmp      code_0bfe
code_0bbf:
			dup     
			ldi      3
			eq?     
			bnt      code_0beb
			pushi    #addToPic
			pushi    0
			lofsa    theWoman
			send     4
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    5
			pushi    1
			lea      @local130
			push    
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0bfe
code_0beb:
			dup     
			ldi      4
			eq?     
			bnt      code_0bfe
			pushi    #setScript
			pushi    1
			lofsa    flunkyKilled
			push    
			pToa     client
			send     6
code_0bfe:
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
			lofsa    theWoman
			send     4
			push    
			ldi      32
			and     
			bnt      code_0c64
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
code_0c64:
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
			bnt      code_0c8c
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0f91
code_0c8c:
			dup     
			ldi      1
			eq?     
			bnt      code_0cb9
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
			jmp      code_0f91
code_0cb9:
			dup     
			ldi      2
			eq?     
			bnt      code_0ce1
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
			jmp      code_0f91
code_0ce1:
			dup     
			ldi      3
			eq?     
			bnt      code_0d0b
			pushi    #number
			pushi    1
			pushi    906
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
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
			jmp      code_0f91
code_0d0b:
			dup     
			ldi      4
			eq?     
			bnt      code_0d50
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
			jmp      code_0f91
code_0d50:
			dup     
			ldi      5
			eq?     
			bnt      code_0d75
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #addToPic
			pushi    0
			lofsa    theMan
			send     4
			pushi    0
			callb    proc0_2,  0
			ldi      60
			aTop     ticks
			jmp      code_0f91
code_0d75:
			dup     
			ldi      6
			eq?     
			bnt      code_0dea
			pushi    43
			pushi    1
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0d93
			ldi      127
			jmp      code_0d96
code_0d93:
			ldi      128
code_0d96:
			push    
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0dcc
			pushi    1
			pushi    75
			callb    proc0_6,  2
			pushi    5
			pushi    1
			lea      @local119
			push    
			pushi    2
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0f91
code_0dcc:
			pushi    1
			pushi    75
			callb    proc0_7,  2
			pushi    #womanStatus
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			lofsa    savedTheWoman
			push    
			pToa     client
			send     6
			jmp      code_0f91
code_0dea:
			dup     
			ldi      7
			eq?     
			bnt      code_0e03
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0f91
code_0e03:
			dup     
			ldi      8
			eq?     
			bnt      code_0e1f
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_0f91
code_0e1f:
			dup     
			ldi      9
			eq?     
			bnt      code_0e35
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0f91
code_0e35:
			dup     
			ldi      10
			eq?     
			bnt      code_0e4e
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0f91
code_0e4e:
			dup     
			ldi      11
			eq?     
			bnt      code_0e75
			ldi      1
			sal      local28
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    3
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0f91
code_0e75:
			dup     
			ldi      12
			eq?     
			bnt      code_0e97
			pushi    9
			pushi    3
			lea      @local123
			push    
			pushi    2
			pushi    0
			pushi    13
			pushi    2
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_0f91
code_0e97:
			dup     
			ldi      13
			eq?     
			bnt      code_0eb5
			pushi    7
			pushi    2
			lea      @local134
			push    
			pushi    2
			pushi    2
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0f91
code_0eb5:
			dup     
			ldi      14
			eq?     
			bnt      code_0f05
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			pushi    0
			callb    proc0_2,  0
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
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      120
			aTop     ticks
			jmp      code_0f91
code_0f05:
			dup     
			ldi      15
			eq?     
			bnt      code_0f81
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_0f2c
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_0f2c
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0f91
code_0f2c:
			pushi    1
			pushi    0
			calle    proc806_6,  2
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
			sal      local29
			pushi    0
			calle    proc125_2,  0
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
			jmp      code_0f91
code_0f81:
			dup     
			ldi      16
			eq?     
			bnt      code_0f91
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0f91:
			toss    
			ret     
		)
	)
)

(instance savedTheWoman of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lofsa    theWoman
			send     4
			bnt      code_1004
			pushi    #signal
			pushi    0
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_1004
			pushi    #disable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
code_1004:
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
			bnt      code_1059
			pushi    5
			pushi    1
			pushi    #sel_745
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    theWoman
			send     4
			push    
			ldi      12
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    theWoman
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    theWoman
			send     40
			jmp      code_1307
code_1059:
			dup     
			ldi      1
			eq?     
			bnt      code_1083
			pushi    7
			pushi    2
			lea      @local99
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
			jmp      code_1307
code_1083:
			dup     
			ldi      2
			eq?     
			bnt      code_10a5
			pushi    #stopUpd
			pushi    0
			lofsa    theWoman
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
			jmp      code_1307
code_10a5:
			dup     
			ldi      3
			eq?     
			bnt      code_10c1
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_1307
code_10c1:
			dup     
			ldi      4
			eq?     
			bnt      code_10d7
			pushi    3
			lsg      global0
			lofsa    theWoman
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1307
code_10d7:
			dup     
			ldi      5
			eq?     
			bnt      code_10e5
			ldi      12
			aTop     ticks
			jmp      code_1307
code_10e5:
			dup     
			ldi      6
			eq?     
			bnt      code_1106
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
			jmp      code_1307
code_1106:
			dup     
			ldi      7
			eq?     
			bnt      code_1123
			ldi      1
			sal      local28
			pushi    3
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1307
code_1123:
			dup     
			ldi      8
			eq?     
			bnt      code_1141
			pushi    7
			pushi    2
			lea      @local134
			push    
			pushi    2
			pushi    2
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1307
code_1141:
			dup     
			ldi      9
			eq?     
			bnt      code_114f
			ldi      18
			aTop     ticks
			jmp      code_1307
code_114f:
			dup     
			ldi      10
			eq?     
			bnt      code_11b2
			pushi    #view
			pushi    1
			pushi    112
			pushi    162
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    190
			pushi    105
			lofsa    theWoman
			send     20
			pushi    0
			callb    proc0_2,  0
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
			pushi    #posn
			pushi    2
			pushi    120
			pushi    125
			lag      global109
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			ldi      120
			aTop     ticks
			jmp      code_1307
code_11b2:
			dup     
			ldi      11
			eq?     
			bnt      code_1201
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
			sal      local29
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
			jmp      code_1307
code_1201:
			dup     
			ldi      12
			eq?     
			bnt      code_121f
			pushi    5
			pushi    1
			lea      @local105
			push    
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1307
code_121f:
			dup     
			ldi      13
			eq?     
			bnt      code_127d
			pushi    #womanStatus
			pushi    1
			pushi    3
			class    Wat
			send     6
			pushi    #cycleSpeed
			pushi    1
			pushi    6
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
			lofsa    theWoman
			send     24
			pushi    #setHeading
			pushi    1
			pushi    225
			lag      global0
			send     6
			pushi    1
			pushi    173
			callb    proc0_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    5
			lag      global69
			send     8
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
			jmp      code_1307
code_127d:
			dup     
			ldi      14
			eq?     
			bnt      code_12d0
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_12a9
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_12a9
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_1307
code_12a9:
			pushi    0
			callb    proc0_3,  0
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_12c1
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global2
			send     6
code_12c1:
			pushi    3
			pushi    1029
			pushi    83
			pushSelf
			calle    proc13_4,  6
			jmp      code_1307
code_12d0:
			dup     
			ldi      15
			eq?     
			bnt      code_1307
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			calle    proc125_2,  0
			pushi    #canControl
			pushi    1
			pushi    1
			class    User
			send     6
			pushi    #enable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			lofsa    theWoman
			send     4
code_1307:
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
			bnt      code_1373
			pushi    9
			pushi    3
			lea      @local159
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			lea      @local9
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_139f
code_1373:
			dup     
			ldi      1
			eq?     
			bnt      code_1393
			pushi    7
			pushi    2
			lea      @local168
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_139f
code_1393:
			dup     
			ldi      2
			eq?     
			bnt      code_139f
			pushi    #dispose
			pushi    0
			self     4
code_139f:
			toss    
			ret     
		)
	)
)

(instance giveWomanBucks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_141a
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
			lofsa    theWoman
			send     12
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local175
			push    
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_15d7
code_141a:
			dup     
			ldi      1
			eq?     
			bnt      code_1454
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    theWoman
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theWoman
			send     4
			push    
			ldi      4
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_15d7
code_1454:
			dup     
			ldi      2
			eq?     
			bnt      code_146a
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_15d7
code_146a:
			dup     
			ldi      3
			eq?     
			bnt      code_149c
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
			jmp      code_15d7
code_149c:
			dup     
			ldi      4
			eq?     
			bnt      code_14bc
			pushi    7
			pushi    2
			lea      @local179
			push    
			pushi    3
			pushi    0
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_15d7
code_14bc:
			dup     
			ldi      5
			eq?     
			bnt      code_14d2
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_15d7
code_14d2:
			dup     
			ldi      6
			eq?     
			bnt      code_1501
			pushi    0
			callb    proc0_2,  0
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
			jmp      code_15d7
code_1501:
			dup     
			ldi      7
			eq?     
			bnt      code_156f
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    20
			pushi    240
			pushSelf
			lofsa    theWoman
			send     18
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      188
			gt?     
			bnt      code_154e
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
			jmp      code_1554
code_154e:
			pushi    #cue
			pushi    0
			self     4
code_1554:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    5
			lag      global69
			send     8
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
			jmp      code_15d7
code_156f:
			dup     
			ldi      8
			eq?     
			bnt      code_1584
			pushi    #setHeading
			pushi    1
			pushi    225
			lag      global0
			send     6
			jmp      code_15d7
code_1584:
			dup     
			ldi      9
			eq?     
			bnt      code_159a
			pushi    3
			pushi    1029
			pushi    83
			pushSelf
			calle    proc13_4,  6
			jmp      code_15d7
code_159a:
			dup     
			ldi      10
			eq?     
			bnt      code_15d7
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_15c6
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_15c6
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_15d7
code_15c6:
			pushi    0
			calle    proc125_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			lofsa    theWoman
			send     4
code_15d7:
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
			bnt      code_166d
			lsp      param2
			ldi      1
			eq?     
			bnt      code_166d
			pushi    #womanStatus
			pushi    0
			class    Wat
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_1661
			lal      local29
			bt       code_1640
			pushi    #blewHorn
			pushi    0
			class    Wat
			send     4
code_1640:
			bnt      code_1652
			pushi    2
			pushi    1029
			pushi    49
			calle    proc13_4,  4
			ldi      1
			jmp      code_166d
code_1652:
			pushi    #setScript
			pushi    1
			lofsa    getYerMen
			push    
			lag      global0
			send     6
			jmp      code_166d
code_1661:
			pushi    2
			pushi    1029
			pushi    50
			calle    proc13_4,  4
			ldi      1
code_166d:
			ret     
		)
	)
)

(instance getYerMen of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16f8
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
			lofsa    theWoman
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
			jmp      code_1a31
code_16f8:
			dup     
			ldi      1
			eq?     
			bnt      code_1721
			pushi    #blewHorn
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    7
			pushi    2
			lea      @local139
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1a31
code_1721:
			dup     
			ldi      2
			eq?     
			bnt      code_173d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_1a31
code_173d:
			dup     
			ldi      3
			eq?     
			bnt      code_1753
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1a31
code_1753:
			dup     
			ldi      4
			eq?     
			bnt      code_1761
			ldi      12
			aTop     ticks
			jmp      code_1a31
code_1761:
			dup     
			ldi      5
			eq?     
			bnt      code_17a5
			pToa     register
			bnt      code_178b
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
			jmp      code_1a31
code_178b:
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
			jmp      code_1a31
code_17a5:
			dup     
			ldi      6
			eq?     
			bnt      code_1834
			pToa     register
			bnt      code_182d
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
			jmp      code_1a31
code_182d:
			ldi      30
			aTop     ticks
			jmp      code_1a31
code_1834:
			dup     
			ldi      7
			eq?     
			bnt      code_1860
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
			jmp      code_1a31
code_1860:
			dup     
			ldi      8
			eq?     
			bnt      code_186e
			ldi      30
			aTop     ticks
			jmp      code_1a31
code_186e:
			dup     
			ldi      9
			eq?     
			bnt      code_1896
			ldi      1
			aTop     notKilled
			pushi    9
			pushi    3
			lea      @local144
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
			jmp      code_1a31
code_1896:
			dup     
			ldi      10
			eq?     
			bnt      code_18b6
			pushi    7
			pushi    2
			lea      @local150
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1a31
code_18b6:
			dup     
			ldi      11
			eq?     
			bnt      code_18d0
			pushi    5
			pushi    1
			lea      @local155
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1a31
code_18d0:
			dup     
			ldi      12
			eq?     
			bnt      code_198d
			pToa     register
			bnt      code_191b
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
			ldi      60
			aTop     ticks
			jmp      code_1a31
code_191b:
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
			jmp      code_1a31
code_198d:
			dup     
			ldi      13
			eq?     
			bnt      code_19bc
			pToa     register
			bnt      code_1a31
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
			jmp      code_1a31
code_19bc:
			dup     
			ldi      14
			eq?     
			bnt      code_19ca
			ldi      6
			aTop     ticks
			jmp      code_1a31
code_19ca:
			dup     
			ldi      15
			eq?     
			bnt      code_19e0
			pushi    3
			lsg      global0
			lofsa    theMan
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1a31
code_19e0:
			dup     
			ldi      16
			eq?     
			bnt      code_1a31
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
			ldi      1
			sal      local29
			pushi    #startUpd
			pushi    0
			lofsa    theMan
			send     4
			pushi    #startUpd
			pushi    0
			lofsa    theWoman
			send     4
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
code_1a31:
			toss    
			ret     
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
	)
)

(instance screamSound of Sound
	(properties
		flags $0001
		number 129
	)
)
