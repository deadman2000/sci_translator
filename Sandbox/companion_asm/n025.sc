;;; Sierra Script 1.0 - (do not remove this comment)
(script# 25)
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
(use n951)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	beg 0
	begScript 1
)

(local
	[local0 9] = [131 0 2 4 26 42 23 27 14]
	[local9 9] = [-1 5108 14]
	local18 =  10
	local19
	local20
	local21
	local22
	local23
	[local24 13] = [1025 0 1 2 2 1 2 1 2 1 2 2]
	[local37 4] = [1025 10 1]
	[local41 6] = [1025 11 1 2 2]
	[local47 4] = [1025 14 1]
	[local51 8] = [1025 16 1 2 2 1 2]
	[local59 6] = [1025 21 1 2 2]
	[local65 4] = [1025 24 1]
	[local69 4] = [1025 25 1]
	[local73 5] = [1025 26 1 1]
	[local78 4] = [1025 28 1]
	[local82 4] = [1025 29 1]
	[local86 5] = [1025 30 1 2]
	[local91 4] = [1025 32 1]
	[local95 4] = [1025 33 1]
	[local99 6] = [1025 34 2 2 1]
	[local105 11] = [1025 37 1 2 3 2 1 1 1 1]
	[local116 6] = [1025 45 2 1 2]
	[local122 5] = [1025 49 2 1]
	[local127 6] = [1025 51 2 1 2]
	[local133 7] = [1025 54 1 2 1 2]
	[local140 7] = [1025 58 2 1 1 1]
	[local147 9] = [1025 62 3 1 2 1 4 1]
)
(instance beg of Actor
	(properties
		view 130
		signal $2800
	)
	
	(method (init)
		(asm
			pushi    #number
			pushi    1
			pushi    125
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
	
	(method (doit &tmp temp0 temp1)
		(asm
			pushi    4
			pTos     x
			pTos     y
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
			callk    GetAngle,  8
			sat      temp1
			pushi    1
			push    
			pToa     heading
			sub     
			push    
			callk    Abs,  2
			sat      temp0
			lal      local18
			not     
			bnt      code_00e0
			pToa     mover
			not     
			bnt      code_00e0
			lal      local19
			not     
			bnt      code_00e0
			lst      temp0
			ldi      30
			gt?     
			bnt      code_00e0
			lst      temp1
			ldi      338
			ge?     
			bnt      code_007a
			ldi      3
			jmp      code_00db
code_007a:
			lst      temp1
			ldi      293
			ge?     
			bnt      code_0088
			ldi      7
			jmp      code_00db
code_0088:
			lst      temp1
			ldi      248
			ge?     
			bnt      code_0096
			ldi      1
			jmp      code_00db
code_0096:
			lst      temp1
			ldi      203
			ge?     
			bnt      code_00a4
			ldi      5
			jmp      code_00db
code_00a4:
			lst      temp1
			ldi      158
			ge?     
			bnt      code_00b2
			ldi      2
			jmp      code_00db
code_00b2:
			lst      temp1
			ldi      113
			ge?     
			bnt      code_00bf
			ldi      4
			jmp      code_00db
code_00bf:
			lst      temp1
			ldi      68
			ge?     
			bnt      code_00cc
			ldi      0
			jmp      code_00db
code_00cc:
			lst      temp1
			ldi      23
			ge?     
			bnt      code_00d9
			ldi      6
			jmp      code_00db
code_00d9:
			ldi      3
code_00db:
			aTop     cel
			jmp      code_0116
code_00e0:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_010f
			pushi    #script
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_010f
			pushi    #setScript
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			class    Wat
			send     6
			jmp      code_0116
code_010f:
			lal      local18
			bnt      code_0116
			-al      local18
code_0116:
			pushi    #doit
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
			pushi    #weMeetAgain
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    1
			pushi    25
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3 &tmp temp0)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0135
			pushi    2
			pushi    1025
			pushi    15
			calle    proc13_5,  4
			jmp      code_0256
code_0135:
			dup     
			ldi      5
			eq?     
			bnt      code_01b9
			pushi    #offRoad
			pushi    0
			class    Wat
			send     4
			bnt      code_017b
			lal      local21
			bnt      code_0162
			pushi    4
			pushi    1
			lea      @local47
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_0256
code_0162:
			ldi      1
			sal      local21
			pushi    3
			lea      @local41
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_017b:
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			bnt      code_019c
			pushi    4
			pushi    1
			lea      @local37
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_0256
code_019c:
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    3
			lea      @local24
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_01b9:
			dup     
			ldi      10
			eq?     
			bnt      code_01cf
			pushi    #setScript
			pushi    1
			lofsa    threat
			push    
			lag      global0
			send     6
			jmp      code_0256
code_01cf:
			dup     
			ldi      4
			eq?     
			bnt      code_0235
			pushi    4
			lsp      param2
			pushi    1
			pushi    2
			pushi    3
			calle    proc999_5,  8
			bnt      code_01fa
			pushi    #setScript
			pushi    3
			lofsa    approachBeggar
			push    
			pushi    0
			lsp      param2
			lag      global0
			send     10
			jmp      code_0256
code_01fa:
			lsp      param2
			ldi      0
			eq?     
			bnt      code_0227
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			bnt      code_0256
			pushi    #setScript
			pushi    3
			lofsa    approachBeggar
			push    
			pushi    0
			lsp      param2
			lag      global0
			send     10
			jmp      code_0256
code_0227:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0256
code_0235:
			dup     
			ldi      3
			eq?     
			bnt      code_024b
			pushi    #setScript
			pushi    1
			lofsa    beggarDo
			push    
			lag      global0
			send     6
			jmp      code_0256
code_024b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0256:
			toss    
			ret     
		)
	)
)

(instance begScript of Script
	(properties)
	
	(method (init param1)
		(asm
			pushi    #init
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
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
			bnt      code_03b2
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_0375
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_0473
code_0375:
			pushi    #contains
			pushi    1
			lofsa    beg
			push    
			lag      global5
			send     6
			not     
			bnt      code_038c
			pushi    #init
			pushi    0
			lofsa    beg
			send     4
code_038c:
			pushi    #posn
			pushi    2
			pushi    235
			pushi    50
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    205
			pushi    70
			pushSelf
			lofsa    beg
			send     26
			jmp      code_0473
code_03b2:
			dup     
			ldi      1
			eq?     
			bnt      code_0413
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    5
			pushi    289
			pushi    1
			pushi    1
			lofsa    beg
			send     18
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    225
			pushi    58
			pushi    226
			pushi    77
			pushi    204
			pushi    82
			pushi    182
			pushi    77
			pushi    182
			pushi    58
			pushi    205
			pushi    52
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
			pushi    0
			callb    proc0_2,  0
			ldi      18
			aTop     ticks
			jmp      code_0473
code_0413:
			dup     
			ldi      2
			eq?     
			bnt      code_0431
			pushi    5
			lea      @local51
			push    
			pushi    3
			lea      @local0
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0473
code_0431:
			dup     
			ldi      3
			eq?     
			bnt      code_044d
			pushi    4
			lea      @local59
			push    
			pushi    1
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0473
code_044d:
			dup     
			ldi      4
			eq?     
			bnt      code_0473
			pushi    0
			callb    proc0_4,  0
			pushi    #horizon
			pushi    1
			pushi    30
			lag      global2
			send     6
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0473:
			toss    
			ret     
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0516
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    225
			pushi    58
			pushi    226
			pushi    77
			pushi    204
			pushi    82
			pushi    182
			pushi    77
			pushi    182
			pushi    58
			pushi    205
			pushi    52
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
			pushi    5
			pushi    1
			lea      @local65
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0546
code_0516:
			dup     
			ldi      2
			eq?     
			bnt      code_0546
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #horizon
			pushi    1
			pushi    30
			lag      global2
			send     6
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0546:
			toss    
			ret     
		)
	)
)

(instance approachBeggar of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0610
			pushi    #distanceTo
			pushi    1
			lofsa    beg
			push    
			lag      global0
			send     6
			push    
			ldi      15
			gt?     
			bnt      code_0605
			pTos     register
			ldi      0
			eq?     
			bt       code_05ae
			pTos     register
			ldi      2
			eq?     
code_05ae:
			bnt      code_05db
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    beg
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    beg
			send     4
			push    
			ldi      3
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_06d7
code_05db:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    beg
			send     4
			push    
			ldi      15
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    beg
			send     4
			push    
			ldi      5
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_06d7
code_0605:
			ipToa    state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_06d7
code_0610:
			dup     
			ldi      1
			eq?     
			bnt      code_0645
			pushi    3
			lsg      global0
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			pTos     register
			ldi      0
			eq?     
			bt       code_0630
			pTos     register
			ldi      2
			eq?     
code_0630:
			bnt      code_06d7
			ldi      1
			sal      local19
			pushi    #setCel
			pushi    1
			pushi    7
			lofsa    beg
			send     6
			jmp      code_06d7
code_0645:
			dup     
			ldi      2
			eq?     
			bnt      code_0653
			ldi      12
			aTop     ticks
			jmp      code_06d7
code_0653:
			dup     
			ldi      3
			eq?     
			bnt      code_06d7
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_067e
			pushi    4
			pushi    1
			lea      @local69
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_06d6
code_067e:
			dup     
			ldi      0
			eq?     
			bnt      code_0698
			ldi      1
			sal      local20
			pushi    #setScript
			pushi    1
			lofsa    buyClothes
			push    
			lag      global0
			send     6
			jmp      code_06d6
code_0698:
			dup     
			ldi      2
			eq?     
			bnt      code_06b7
			pushi    #put
			pushi    1
			pushi    2
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			lofsa    buyClothes
			push    
			lag      global0
			send     6
			jmp      code_06d6
code_06b7:
			dup     
			ldi      3
			eq?     
			bnt      code_06d6
			pushi    4
			pushi    1
			lea      @local73
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			pushi    #dispose
			pushi    0
			self     4
code_06d6:
			toss    
code_06d7:
			toss    
			ret     
		)
	)
)

(instance buyClothes of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			lofsa    beg
			send     4
			ret     
		)
	)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0771
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			aTop     register
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    2
			pushi    128
			pushi    7
			callk    Load,  4
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    7
			pushi    162
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
			send     26
			jmp      code_0ae7
code_0771:
			dup     
			ldi      1
			eq?     
			bnt      code_077f
			ldi      30
			aTop     ticks
			jmp      code_0ae7
code_077f:
			dup     
			ldi      2
			eq?     
			bnt      code_0795
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0ae7
code_0795:
			dup     
			ldi      3
			eq?     
			bnt      code_07a7
			pushi    0
			callb    proc0_2,  0
			ldi      60
			aTop     ticks
			jmp      code_0ae7
code_07a7:
			dup     
			ldi      4
			eq?     
			bnt      code_07e1
			lal      local20
			bnt      code_07ca
			pushi    5
			pushi    1
			lea      @local78
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ae7
code_07ca:
			pushi    5
			pushi    1
			lea      @local82
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ae7
code_07e1:
			dup     
			ldi      5
			eq?     
			bnt      code_0802
			pushi    7
			pushi    2
			lea      @local86
			push    
			pushi    3
			pushi    0
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ae7
code_0802:
			dup     
			ldi      6
			eq?     
			bnt      code_0836
			lal      local20
			bnt      code_0822
			pushi    5
			pushi    1
			lea      @local91
			push    
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ae7
code_0822:
			pushi    5
			pushi    1
			lea      @local95
			push    
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ae7
code_0836:
			dup     
			ldi      7
			eq?     
			bnt      code_0857
			pushi    7
			pushi    2
			lea      @local99
			push    
			pushi    3
			pushi    0
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ae7
code_0857:
			dup     
			ldi      8
			eq?     
			bnt      code_08a9
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_087b
			ldi      140
			jmp      code_087e
code_087b:
			ldi      205
code_087e:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0893
			ldi      115
			jmp      code_0895
code_0893:
			ldi      75
code_0895:
			push    
			pushSelf
			lag      global0
			send     12
			pushi    #setCel
			pushi    1
			pushi    5
			lofsa    beg
			send     6
			jmp      code_0ae7
code_08a9:
			dup     
			ldi      9
			eq?     
			bnt      code_08cb
			pushi    #stopUpd
			pushi    0
			lofsa    beg
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
			jmp      code_0ae7
code_08cb:
			dup     
			ldi      10
			eq?     
			bnt      code_08e1
			pushi    3
			lsg      global0
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0ae7
code_08e1:
			dup     
			ldi      11
			eq?     
			bnt      code_08ef
			ldi      12
			aTop     ticks
			jmp      code_0ae7
code_08ef:
			dup     
			ldi      12
			eq?     
			bnt      code_0910
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
			jmp      code_0ae7
code_0910:
			dup     
			ldi      13
			eq?     
			bnt      code_0934
			pushi    9
			pushi    3
			lea      @local105
			push    
			pushi    3
			pushi    0
			lea      @local0
			push    
			pushi    3
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ae7
code_0934:
			dup     
			ldi      14
			eq?     
			bnt      code_09b4
			pushi    #number
			pushi    1
			pushi    128
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #view
			pushi    1
			pushi    130
			pushi    162
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    190
			pushi    77
			lofsa    beg
			send     20
			ldi      1
			sag      global126
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    170
			pushi    64
			lag      global0
			send     20
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      60
			aTop     ticks
			jmp      code_0ae7
code_09b4:
			dup     
			ldi      15
			eq?     
			bnt      code_0a09
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
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    229
			pushi    71
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     14
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_0ae7
code_0a09:
			dup     
			ldi      16
			eq?     
			bnt      code_0a24
			pushi    4
			lea      @local116
			push    
			pushi    7
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ae7
code_0a24:
			dup     
			ldi      17
			eq?     
			bnt      code_0a73
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    0
			pushi    240
			lag      global0
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    270
			pushi    65534
			pushSelf
			lofsa    beg
			send     18
			pushi    #ignoreHorizon
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    300
			pushi    65534
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     18
			jmp      code_0ae7
code_0a73:
			dup     
			ldi      18
			eq?     
			bnt      code_0a7f
			ldi      0
			jmp      code_0ae7
code_0a7f:
			dup     
			ldi      19
			eq?     
			bnt      code_0ab1
			pushi    1
			pushi    151
			callb    proc0_6,  2
			pushi    1
			pushi    54
			callb    proc0_6,  2
			pushi    0
			calle    proc125_2,  0
			pushi    #setSpeed
			pushi    1
			pTos     register
			lag      global1
			send     6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      12
			aTop     ticks
			jmp      code_0ae7
code_0ab1:
			dup     
			ldi      20
			eq?     
			bnt      code_0ae7
			lal      local20
			bnt      code_0ac9
			pushi    1
			pushi    100
			calle    proc806_1,  2
			jmp      code_0ad3
code_0ac9:
			pushi    1
			pushi    65336
			calle    proc806_1,  2
code_0ad3:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0ae7:
			toss    
			ret     
		)
	)
)

(instance beggarDo of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b69
			lal      local22
			bnt      code_0b4b
			pushi    2
			pushi    1025
			pushi    48
			calle    proc13_4,  4
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0bf4
code_0b4b:
			ldi      1
			sal      local22
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lofsa    beg
			push    
			pushi    25
			pushSelf
			lag      global0
			send     12
			jmp      code_0bf4
code_0b69:
			dup     
			ldi      1
			eq?     
			bnt      code_0b86
			pushi    4
			lea      @local122
			push    
			pushi    3
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0bf4
code_0b86:
			dup     
			ldi      2
			eq?     
			bnt      code_0b94
			ldi      30
			aTop     ticks
			jmp      code_0bf4
code_0b94:
			dup     
			ldi      3
			eq?     
			bnt      code_0bd6
			pushi    150
			pushi    1
			class    Rev
			push    
			pushi    162
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    228
			pushi    1
			pushi    #heading
			pushi    0
			lag      global0
			send     4
			push    
			ldi      180
			add     
			push    
			ldi      360
			mod     
			push    
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    25
			pushSelf
			lag      global0
			send     28
			jmp      code_0bf4
code_0bd6:
			dup     
			ldi      4
			eq?     
			bnt      code_0bf4
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
code_0bf4:
			toss    
			ret     
		)
	)
)

(instance getWill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ceb
			pushi    0
			callb    proc0_3,  0
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0c78
			pushi    125
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      155
			lt?     
			bnt      code_0cab
			pushi    105
			pushi    #y
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      125
			lt?     
			jmp      code_0c9f
code_0c78:
			pushi    190
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      230
			lt?     
			bnt      code_0cab
			pushi    65
			pushi    #y
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      85
			lt?     
code_0c9f:
			bnt      code_0cab
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0e12
code_0cab:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0cc8
			ldi      140
			jmp      code_0ccb
code_0cc8:
			ldi      205
code_0ccb:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0ce0
			ldi      115
			jmp      code_0ce2
code_0ce0:
			ldi      75
code_0ce2:
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0e12
code_0ceb:
			dup     
			ldi      1
			eq?     
			bnt      code_0d01
			pushi    3
			lsg      global0
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0e12
code_0d01:
			dup     
			ldi      2
			eq?     
			bnt      code_0d23
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			pushi    #blewHorn
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_0e12
code_0d23:
			dup     
			ldi      3
			eq?     
			bnt      code_0d4b
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    4
			pushi    128
			pushi    160
			pushi    161
			pushi    162
			calle    proc958_0,  8
			ldi      60
			aTop     ticks
			jmp      code_0e12
code_0d4b:
			dup     
			ldi      4
			eq?     
			bnt      code_0d8e
			pushi    #posn
			pushi    2
			pushi    335
			pushi    120
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    270
			pushi    120
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     32
			pushi    2
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			jmp      code_0e12
code_0d8e:
			dup     
			ldi      5
			eq?     
			bnt      code_0d9c
			ldi      12
			aTop     ticks
			jmp      code_0e12
code_0d9c:
			dup     
			ldi      6
			eq?     
			bnt      code_0db7
			pushi    4
			lea      @local127
			push    
			pushi    3
			pushi    14
			pushSelf
			calle    proc851_0,  8
			jmp      code_0e12
code_0db7:
			dup     
			ldi      7
			eq?     
			bnt      code_0dd7
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    335
			pushi    120
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_0e12
code_0dd7:
			dup     
			ldi      8
			eq?     
			bnt      code_0ded
			pushi    3
			lsg      global0
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0e12
code_0ded:
			dup     
			ldi      9
			eq?     
			bnt      code_0e12
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e12:
			toss    
			ret     
		)
	)
)

(instance threat of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			lofsa    beg
			send     4
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
			bnt      code_0efd
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			aTop     register
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    0
			callb    proc0_3,  0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      50
			le?     
			bnt      code_0ea4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    175
			pushi    95
			pushSelf
			lag      global0
			send     12
			jmp      code_1325
code_0ea4:
			pushi    #distanceTo
			pushi    1
			lofsa    beg
			push    
			lag      global0
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_0ef4
			pushi    228
			pushi    2
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
			lofsa    beg
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    beg
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      180
			add     
			push    
			ldi      360
			mod     
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1325
code_0ef4:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1325
code_0efd:
			dup     
			ldi      1
			eq?     
			bnt      code_0f32
			pushi    #distanceTo
			pushi    1
			lofsa    beg
			push    
			lag      global0
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_0f29
			pushi    #setMotion
			pushi    3
			class    MoveFwd
			push    
			pushi    30
			pushSelf
			lag      global0
			send     10
			jmp      code_1325
code_0f29:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1325
code_0f32:
			dup     
			ldi      2
			eq?     
			bnt      code_0f48
			pushi    3
			lsg      global0
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1325
code_0f48:
			dup     
			ldi      3
			eq?     
			bnt      code_0f56
			ldi      12
			aTop     ticks
			jmp      code_1325
code_0f56:
			dup     
			ldi      4
			eq?     
			bnt      code_0f7c
			pushi    #view
			pushi    1
			pushi    4
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    threatSound
			send     8
			jmp      code_1325
code_0f7c:
			dup     
			ldi      5
			eq?     
			bnt      code_0f8a
			ldi      48
			aTop     ticks
			jmp      code_1325
code_0f8a:
			dup     
			ldi      6
			eq?     
			bnt      code_0fa6
			pushi    4
			lea      @local133
			push    
			pushi    2
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1325
code_0fa6:
			dup     
			ldi      7
			eq?     
			bnt      code_0fb4
			ldi      60
			aTop     ticks
			jmp      code_1325
code_0fb4:
			dup     
			ldi      8
			eq?     
			bnt      code_0fd6
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    threatSound
			send     8
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1325
code_0fd6:
			dup     
			ldi      9
			eq?     
			bnt      code_0fe4
			ldi      12
			aTop     ticks
			jmp      code_1325
code_0fe4:
			dup     
			ldi      10
			eq?     
			bnt      code_1006
			pushi    #stopUpd
			pushi    0
			lofsa    beg
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
			jmp      code_1325
code_1006:
			dup     
			ldi      11
			eq?     
			bnt      code_10b8
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1045
			pushi    125
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      155
			lt?     
			bnt      code_1078
			pushi    105
			pushi    #y
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      125
			lt?     
			jmp      code_106c
code_1045:
			pushi    190
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      230
			lt?     
			bnt      code_1078
			pushi    65
			pushi    #y
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      85
			lt?     
code_106c:
			bnt      code_1078
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1325
code_1078:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1095
			ldi      140
			jmp      code_1098
code_1095:
			ldi      205
code_1098:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_10ad
			ldi      115
			jmp      code_10af
code_10ad:
			ldi      75
code_10af:
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1325
code_10b8:
			dup     
			ldi      12
			eq?     
			bnt      code_10c6
			ldi      12
			aTop     ticks
			jmp      code_1325
code_10c6:
			dup     
			ldi      13
			eq?     
			bnt      code_10e7
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
			jmp      code_1325
code_10e7:
			dup     
			ldi      14
			eq?     
			bnt      code_1106
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    30
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_1325
code_1106:
			dup     
			ldi      15
			eq?     
			bnt      code_1121
			pushi    4
			lea      @local140
			push    
			pushi    3
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_1325
code_1121:
			dup     
			ldi      16
			eq?     
			bnt      code_119b
			pushi    #number
			pushi    1
			pushi    127
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #view
			pushi    1
			pushi    130
			pushi    284
			pushi    2
			pushi    158
			pushi    81
			pushi    162
			pushi    1
			pushi    1
			lofsa    beg
			send     20
			ldi      1
			sag      global126
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    191
			pushi    79
			lag      global0
			send     14
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      60
			aTop     ticks
			jmp      code_1325
code_119b:
			dup     
			ldi      17
			eq?     
			bnt      code_11fa
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    214
			pushi    60
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     14
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    138
			pushi    76
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     14
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_1325
code_11fa:
			dup     
			ldi      18
			eq?     
			bnt      code_1222
			pushi    11
			pushi    4
			lea      @local147
			push    
			pushi    7
			pushi    0
			lea      @local9
			push    
			pushi    3
			pushi    13
			pushi    2
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  22
			jmp      code_1325
code_1222:
			dup     
			ldi      19
			eq?     
			bnt      code_128d
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    270
			pushi    65534
			pushSelf
			lofsa    beg
			send     18
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    0
			pushi    240
			pushSelf
			lag      global0
			send     12
			pushi    #ignoreHorizon
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    300
			pushi    65534
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     18
			pushi    #ignoreHorizon
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    245
			pushi    65534
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     18
			jmp      code_1325
code_128d:
			dup     
			ldi      20
			eq?     
			bnt      code_1297
			jmp      code_1325
code_1297:
			dup     
			ldi      21
			eq?     
			bnt      code_12a1
			jmp      code_1325
code_12a1:
			dup     
			ldi      22
			eq?     
			bnt      code_12ab
			jmp      code_1325
code_12ab:
			dup     
			ldi      23
			eq?     
			bnt      code_12f0
			pushi    1
			pushi    54
			callb    proc0_6,  2
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
			pushi    0
			calle    proc125_2,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #setSpeed
			pushi    1
			pTos     register
			lag      global1
			send     6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      12
			aTop     ticks
			jmp      code_1325
code_12f0:
			dup     
			ldi      24
			eq?     
			bnt      code_1325
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			eq?     
			bnt      code_1320
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_1325
code_1320:
			pushi    #dispose
			pushi    0
			self     4
code_1325:
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
			bnt      code_139c
			lsp      param2
			ldi      1
			eq?     
			bnt      code_139c
			ldi      1
			pushi    #blewHorn
			pushi    0
			class    Wat
			send     4
			bnt      code_1390
			pushi    2
			pushi    1025
			pushi    68
			calle    proc13_4,  4
			jmp      code_139c
code_1390:
			pushi    #setScript
			pushi    1
			lofsa    getWill
			push    
			lag      global0
			send     6
code_139c:
			ret     
		)
	)
)

(instance threatSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)
