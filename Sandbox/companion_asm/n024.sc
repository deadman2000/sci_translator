;;; Sierra Script 1.0 - (do not remove this comment)
(script# 24)
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
(use n958)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	yeo 0
	yeoScript 1
)

(local
	[local0 9] = [133 0 2 4 24 37 20 24 16]
	[local9 9] = [133 3 2 4 24 37 20 24 16]
	local18
	local19
	local20
	local21 =  10
	local22
	[local23 6] = [1024 0 2 1 2]
	[local29 5] = [1024 3 1 2]
	[local34 5] = [1024 20 1 2]
	[local39 6] = [1024 5 2 1 2]
	[local45 10] = [1024 12 1 2 1 2 1 2 2]
	[local55 5] = [1024 10 1 1]
	[local60 4] = [1024 19 1]
	[local64 4] = [1024 22 1]
	[local68 6] = [1024 23 2 1 2]
	[local74 17] = [1024 26 1 2 1 2 1 2 1 2 1 2 1 2 2 2]
	[local91 6] = [1024 40 1 2 2]
	[local97 15] = [1024 43 1 2 1 1 1 2 1 2 1 2 1 1]
	[local112 12] = [1024 55 1 2 1 2 1 2 1 1 2]
	[local124 10] = [1024 64 3 1 1 1 2 1 2]
	[local134 7] = [1024 71 1 2 1 2]
	[local141 6] = [1024 75 2 1 2]
	[local147 4] = [1024 78 1]
	[local151 4] = [1024 79 1]
	[local155 7] = [1024 80 2 2 1 2]
	[local162 5] = [1024 84 2 1]
	[local167 4] = [1024 86 1]
)
(instance yeo of Actor
	(properties
		x 285
		y -5
		view 132
		loop 1
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
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_0069
			-al      local21
			not     
			bnt      code_0069
			lal      local22
			not     
			bnt      code_0069
			ldi      1
			sal      local22
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    4
			lea      @local39
			push    
			pushi    3
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_00b3
code_0069:
			lal      local20
			not     
			bnt      code_00b3
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_00b3
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_00b3
			ldi      1
			sal      local20
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			le?     
			bnt      code_00a7
			pushi    #setScript
			pushi    1
			lofsa    dropIt
			push    
			lag      global0
			send     6
			jmp      code_00b3
code_00a7:
			pushi    #setScript
			pushi    1
			lofsa    noMoreChances
			push    
			lag      global0
			send     6
code_00b3:
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
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			bnt      code_02d2
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
code_02d2:
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    1
			pushi    24
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_00d2
			pushi    3
			pushi    1024
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_028d
code_00d2:
			dup     
			ldi      5
			eq?     
			bnt      code_0118
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			bnt      code_00fa
			pushi    4
			pushi    1
			lea      @local55
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_028d
code_00fa:
			pushi    3
			lea      @local45
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_028d
code_0118:
			dup     
			ldi      10
			eq?     
			bnt      code_012e
			pushi    #setScript
			pushi    1
			lofsa    twoBirds
			push    
			lag      global2
			send     6
			jmp      code_028d
code_012e:
			dup     
			ldi      4
			eq?     
			bnt      code_025a
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0154
			pushi    4
			pushi    1
			lea      @local60
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_0256
code_0154:
			dup     
			ldi      0
			eq?     
			bnt      code_016a
			pushi    #setScript
			pushi    1
			lofsa    buyClothes
			push    
			lag      global0
			send     6
			jmp      code_0256
code_016a:
			dup     
			ldi      14
			eq?     
			bnt      code_0186
			pushi    3
			lea      @local23
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_0186:
			dup     
			ldi      2
			eq?     
			bnt      code_01a2
			pushi    3
			lea      @local23
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_01a2:
			dup     
			ldi      10
			eq?     
			bnt      code_01be
			pushi    3
			lea      @local29
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_01be:
			dup     
			ldi      18
			eq?     
			bnt      code_01da
			pushi    3
			lea      @local29
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_01da:
			dup     
			ldi      16
			eq?     
			bnt      code_01f7
			pushi    4
			pushi    1
			lea      @local64
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_0256
code_01f7:
			dup     
			ldi      17
			eq?     
			bnt      code_0214
			pushi    4
			pushi    1
			lea      @local64
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_0256
code_0214:
			dup     
			ldi      4
			eq?     
			bnt      code_0230
			pushi    3
			lea      @local68
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_0230:
			dup     
			ldi      12
			eq?     
			bnt      code_024b
			pushi    3
			lea      @local34
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_0256
code_024b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0256:
			toss    
			jmp      code_028d
code_025a:
			dup     
			ldi      3
			eq?     
			bnt      code_0282
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    yeo
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    yeo
			send     4
			push    
			lag      global0
			send     10
			jmp      code_028d
code_0282:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_028d:
			toss    
			ret     
		)
	)
)

(instance yeoScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03fc
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
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_03bf
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_0491
code_03bf:
			pushi    #contains
			pushi    1
			lofsa    yeo
			push    
			lag      global5
			send     6
			not     
			bnt      code_03d6
			pushi    #init
			pushi    0
			lofsa    yeo
			send     4
code_03d6:
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
			lofsa    yeo
			send     26
			jmp      code_0491
code_03fc:
			dup     
			ldi      1
			eq?     
			bnt      code_0453
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    yeo
			send     26
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    202
			pushi    52
			pushi    243
			pushi    52
			pushi    243
			pushi    65
			pushi    202
			pushi    65
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     6
			jmp      code_0491
code_0453:
			dup     
			ldi      2
			eq?     
			bnt      code_0477
			pushi    4
			lea      @local74
			push    
			pushi    3
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			pushi    24
			ldi      0
			dup     
			ldi      1
			jmp      code_0491
code_0477:
			dup     
			ldi      3
			eq?     
			bnt      code_0491
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
code_0491:
			toss    
			ret     
		)
	)
)

(instance repeatEncounter of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			super    TScript,  4
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
			bnt      code_0533
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    202
			pushi    52
			pushi    243
			pushi    52
			pushi    243
			pushi    65
			pushi    202
			pushi    65
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     6
			ldi      30
			aTop     ticks
			jmp      code_055b
code_0533:
			dup     
			ldi      2
			eq?     
			bnt      code_054f
			pushi    3
			lea      @local91
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_055b
code_054f:
			dup     
			ldi      3
			eq?     
			bnt      code_055b
			pushi    #dispose
			pushi    0
			self     4
code_055b:
			toss    
			ret     
		)
	)
)

(instance buyClothes of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    57
			callb    proc0_6,  2
			pushi    0
			calle    proc125_2,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			lofsa    yeo
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
			bnt      code_060e
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lea      @local97
			push    
			pushi    3
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    #stopUpd
			pushi    0
			lofsa    yeo
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
			jmp      code_0825
code_060e:
			dup     
			ldi      1
			eq?     
			bnt      code_061c
			ldi      12
			aTop     ticks
			jmp      code_0825
code_061c:
			dup     
			ldi      2
			eq?     
			bnt      code_063d
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
			jmp      code_0825
code_063d:
			dup     
			ldi      3
			eq?     
			bnt      code_0669
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    30
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			pushi    2
			lsg      global0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			jmp      code_0825
code_0669:
			dup     
			ldi      4
			eq?     
			bnt      code_0684
			pushi    4
			lea      @local112
			push    
			pushi    3
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_0825
code_0684:
			dup     
			ldi      5
			eq?     
			bnt      code_06a4
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
			ldi      2
			aTop     cycles
			jmp      code_0825
code_06a4:
			dup     
			ldi      6
			eq?     
			bnt      code_0730
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    219
			pushi    64
			lofsa    yeo
			send     14
			ldi      4
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
			pushi    188
			pushi    55
			lag      global0
			send     20
			pushi    #posn
			pushi    2
			pushi    188
			pushi    55
			lag      global109
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			ldi      60
			aTop     ticks
			jmp      code_0825
code_0730:
			dup     
			ldi      7
			eq?     
			bnt      code_076f
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    249
			pushi    74
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     14
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
			jmp      code_0825
code_076f:
			dup     
			ldi      8
			eq?     
			bnt      code_0795
			pushi    9
			pushi    3
			lea      @local124
			push    
			pushi    6
			pushi    2
			lea      @local9
			push    
			pushi    3
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_0825
code_0795:
			dup     
			ldi      9
			eq?     
			bnt      code_07ef
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    300
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    285
			pushi    65531
			pushSelf
			lofsa    yeo
			send     30
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    yeo
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    yeo
			send     4
			push    
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_0825
code_07ef:
			dup     
			ldi      10
			eq?     
			bnt      code_080f
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    285
			pushi    65531
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_0825
code_080f:
			dup     
			ldi      11
			eq?     
			bnt      code_0819
			jmp      code_0825
code_0819:
			dup     
			ldi      12
			eq?     
			bnt      code_0825
			pushi    #dispose
			pushi    0
			self     4
code_0825:
			toss    
			ret     
		)
	)
)

(instance twoBirds of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_08a0
			pushi    4
			pushi    128
			pushi    4
			pushi    5
			pushi    792
			calle    proc958_0,  8
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lea      @local134
			push    
			pushi    2
			lea      @local0
			push    
			calle    proc851_0,  6
			ldi      30
			aTop     ticks
			jmp      code_0a0f
code_08a0:
			dup     
			ldi      1
			eq?     
			bnt      code_08c9
			pushi    #view
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_0a0f
code_08c9:
			dup     
			ldi      2
			eq?     
			bnt      code_08fd
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    yeo
			send     26
			jmp      code_0a0f
code_08fd:
			dup     
			ldi      3
			eq?     
			bnt      code_0924
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #view
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     18
			jmp      code_0a0f
code_0924:
			dup     
			ldi      4
			eq?     
			bnt      code_0932
			ldi      30
			aTop     ticks
			jmp      code_0a0f
code_0932:
			dup     
			ldi      5
			eq?     
			bnt      code_0991
			pushi    #view
			pushi    1
			pushi    792
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			lag      global0
			send     36
			pushi    #number
			pushi    1
			pushi    907
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lofsa    shootSound
			send     16
			pushi    #setLoop
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    yeo
			send     24
			jmp      code_0a0f
code_0991:
			dup     
			ldi      6
			eq?     
			bnt      code_09f1
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
			pushi    #setCel
			pushi    1
			pushi    7
			lag      global0
			send     6
			pushi    5
			pushi    1
			pushi    #sel_792
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      33
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			send     30
			ldi      60
			aTop     ticks
			jmp      code_0a0f
code_09f1:
			dup     
			ldi      7
			eq?     
			bnt      code_0a0f
			ldi      2
			sag      global145
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0a0f:
			toss    
			ret     
		)
	)
)

(instance egoSkewered of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a6e
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0bc9
code_0a6e:
			dup     
			ldi      1
			eq?     
			bnt      code_0a7c
			ldi      30
			aTop     ticks
			jmp      code_0bc9
code_0a7c:
			dup     
			ldi      2
			eq?     
			bnt      code_0a99
			pushi    4
			lea      @local141
			push    
			pushi    3
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0bc9
code_0a99:
			dup     
			ldi      3
			eq?     
			bnt      code_0ac1
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    yeo
			send     26
			jmp      code_0bc9
code_0ac1:
			dup     
			ldi      4
			eq?     
			bnt      code_0b11
			pushi    #number
			pushi    1
			pushi    907
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lofsa    shootSound
			send     16
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #view
			pushi    1
			pushi    792
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			lag      global0
			send     36
			ldi      30
			aTop     ticks
			jmp      code_0bc9
code_0b11:
			dup     
			ldi      5
			eq?     
			bnt      code_0b2d
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    yeo
			send     12
			jmp      code_0bc9
code_0b2d:
			dup     
			ldi      6
			eq?     
			bnt      code_0b7c
			pushi    #setCel
			pushi    1
			pushi    7
			lag      global0
			send     6
			pushi    5
			pushi    1
			pushi    #sel_792
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      33
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			send     30
			ldi      30
			aTop     ticks
			jmp      code_0bc9
code_0b7c:
			dup     
			ldi      7
			eq?     
			bnt      code_0bab
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
			pushi    5
			pushi    1
			lea      @local147
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0bc9
code_0bab:
			dup     
			ldi      8
			eq?     
			bnt      code_0bc9
			ldi      1
			sag      global145
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0bc9:
			toss    
			ret     
		)
	)
)

(instance noMoreChances of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c1d
			pushi    0
			callb    proc0_3,  0
			ldi      20
			aTop     ticks
			jmp      code_0d0a
code_0c1d:
			dup     
			ldi      1
			eq?     
			bnt      code_0c58
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    yeo
			send     26
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    2
			lsg      global0
			lofsa    yeo
			push    
			callb    proc0_9,  4
			jmp      code_0d0a
code_0c58:
			dup     
			ldi      2
			eq?     
			bnt      code_0ca4
			pushi    #number
			pushi    1
			pushi    907
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lofsa    shootSound
			send     16
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    yeo
			send     6
			pushi    #view
			pushi    1
			pushi    792
			pushi    162
			pushi    1
			pushi    0
			pushi    288
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
			lag      global0
			send     32
			ldi      48
			aTop     ticks
			jmp      code_0d0a
code_0ca4:
			dup     
			ldi      3
			eq?     
			bnt      code_0cc0
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    yeo
			send     12
			jmp      code_0d0a
code_0cc0:
			dup     
			ldi      4
			eq?     
			bnt      code_0cce
			ldi      30
			aTop     ticks
			jmp      code_0d0a
code_0cce:
			dup     
			ldi      5
			eq?     
			bnt      code_0cec
			pushi    5
			pushi    1
			lea      @local151
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0d0a
code_0cec:
			dup     
			ldi      6
			eq?     
			bnt      code_0d0a
			ldi      1
			sag      global145
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0d0a:
			toss    
			ret     
		)
	)
)

(instance dropIt of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			lofsa    yeo
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
			bnt      code_0d76
			pushi    0
			callb    proc0_3,  0
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			ldi      30
			aTop     ticks
			jmp      code_11cf
code_0d76:
			dup     
			ldi      1
			eq?     
			bnt      code_0db0
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lofsa    yeo
			send     30
			jmp      code_11cf
code_0db0:
			dup     
			ldi      2
			eq?     
			bnt      code_0de2
			pushi    #number
			pushi    1
			pushi    900
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lofsa    shootSound
			send     16
			pushi    3
			lea      @local155
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			ldi      30
			aTop     ticks
			jmp      code_11cf
code_0de2:
			dup     
			ldi      3
			eq?     
			bnt      code_0df7
			pushi    #setHeading
			pushi    2
			pushi    45
			pushSelf
			lag      global0
			send     8
			jmp      code_11cf
code_0df7:
			dup     
			ldi      4
			eq?     
			bnt      code_0e05
			ldi      60
			aTop     ticks
			jmp      code_11cf
code_0e05:
			dup     
			ldi      5
			eq?     
			bnt      code_0e8e
			pushi    5
			pushi    1
			pushi    #lsBottom
			pushi    284
			pushi    2
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
			ldi      5
			add     
			push    
			pushi    162
			pushi    1
			pushi    2
			pushi    288
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
			lag      global0
			send     40
			pushi    #view
			pushi    1
			pushi    15
			pushi    289
			pushi    1
			pushi    1
			pushi    284
			pushi    2
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
			pushi    6
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    #new
			pushi    0
			class    Prop
			send     4
			sal      local18
			send     48
			jmp      code_11cf
code_0e8e:
			dup     
			ldi      6
			eq?     
			bnt      code_0ea4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_11cf
code_0ea4:
			dup     
			ldi      7
			eq?     
			bnt      code_0ee0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    162
			pushi    1
			pushi    3
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lag      global0
			send     26
			jmp      code_11cf
code_0ee0:
			dup     
			ldi      8
			eq?     
			bnt      code_0f3f
			pushi    3
			pushi    2
			pushi    702
			pushi    703
			callb    proc0_2,  6
			pushi    3
			lsg      global0
			lofsa    yeo
			push    
			pushSelf
			callb    proc0_9,  6
			pushi    5
			pushi    1
			pushi    #lsBottom
			pushi    289
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			sal      local19
			send     36
			jmp      code_11cf
code_0f3f:
			dup     
			ldi      9
			eq?     
			bnt      code_0f4d
			ldi      12
			aTop     ticks
			jmp      code_11cf
code_0f4d:
			dup     
			ldi      10
			eq?     
			bnt      code_0f6c
			pushi    3
			lea      @local162
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			ldi      30
			aTop     ticks
			jmp      code_11cf
code_0f6c:
			dup     
			ldi      11
			eq?     
			bnt      code_0fad
			pushi    #setSpeed
			pushi    1
			lsg      global157
			lag      global1
			send     6
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
			bnt      code_0f99
			ldi      10
			jmp      code_0f9c
code_0f99:
			ldi      305
code_0f9c:
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_11cf
code_0fad:
			dup     
			ldi      12
			eq?     
			bnt      code_0fc3
			pushi    3
			lsg      global0
			lofsa    yeo
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_11cf
code_0fc3:
			dup     
			ldi      13
			eq?     
			bnt      code_0fd1
			ldi      12
			aTop     ticks
			jmp      code_11cf
code_0fd1:
			dup     
			ldi      14
			eq?     
			bnt      code_100a
			pushi    2
			lea      @local167
			push    
			pushi    1
			calle    proc851_0,  4
			pushi    #setPri
			pushi    1
			pushi    0
			lal      local19
			send     6
			pushi    #setPri
			pushi    1
			pushi    0
			lal      local18
			send     6
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    yeo
			send     14
			jmp      code_11cf
code_100a:
			dup     
			ldi      15
			eq?     
			bnt      code_104a
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    shootSound
			send     8
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			lsg      global157
			pushi    56
			pushi    1
			lsg      global157
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65526
			pushi    235
			pushSelf
			lofsa    yeo
			send     36
			jmp      code_11cf
code_104a:
			dup     
			ldi      16
			eq?     
			bnt      code_1079
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lal      local19
			send     4
			push    
			ldi      6
			sub     
			push    
			pushi    #y
			pushi    0
			lal      local19
			send     4
			push    
			ldi      2
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_11cf
code_1079:
			dup     
			ldi      17
			eq?     
			bnt      code_10ad
			pushi    #view
			pushi    1
			pushi    15
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    5
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     32
			pushi    #dispose
			pushi    0
			lal      local19
			send     4
			jmp      code_11cf
code_10ad:
			dup     
			ldi      18
			eq?     
			bnt      code_10e9
			pushi    162
			pushi    1
			pushi    #-info-
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      9
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
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
			lag      global0
			send     28
			jmp      code_11cf
code_10e9:
			dup     
			ldi      19
			eq?     
			bnt      code_110a
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lal      local18
			send     6
			jmp      code_11cf
code_110a:
			dup     
			ldi      20
			eq?     
			bnt      code_1143
			pushi    #dispose
			pushi    0
			lal      local18
			send     4
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			sub     
			push    
			lag      global0
			send     8
			pushi    0
			callb    proc0_2,  0
			ldi      30
			aTop     ticks
			jmp      code_11cf
code_1143:
			dup     
			ldi      21
			eq?     
			bnt      code_1175
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_1165
			pushi    3
			pushi    1024
			pushi    87
			pushSelf
			calle    proc13_4,  6
			jmp      code_11cf
code_1165:
			pTos     state
			ldi      1
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_11cf
code_1175:
			dup     
			ldi      22
			eq?     
			bnt      code_118b
			pushi    3
			pushi    1024
			pushi    88
			pushSelf
			calle    proc13_4,  6
			jmp      code_11cf
code_118b:
			dup     
			ldi      23
			eq?     
			bnt      code_11cf
			pushi    142
			pushi    #superClass
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			pushi    559
			pushi    1
			pushi    1
			pushi    565
			pushi    1
			pushi    0
			pushi    567
			pushi    1
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			push    
			class    Wat
			send     24
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_11cf:
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
			dup     
			ldi      3
			eq?     
			bnt      code_1236
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_1253
			lal      local22
			bnt      code_1253
			pushi    3
			pushi    1024
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_1253
code_1236:
			dup     
			ldi      4
			eq?     
			bnt      code_1253
			lsp      param2
			ldi      1
			eq?     
			bnt      code_1253
			pushi    #setScript
			pushi    1
			lofsa    egoSkewered
			push    
			lag      global0
			send     6
			ldi      1
code_1253:
			toss    
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
