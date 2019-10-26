;;; Sierra Script 1.0 - (do not remove this comment)
(script# 390)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n851)
(use n946)
(use n950)
(use n951)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm390 0
)

(local
	[local0 4] = [1390 217 2]
	[local4 8] = [1390 0 2 1 2 1 2]
	[local12 4] = [1390 5 2]
	[local16 9] = [1390 6 2 1 2 1 2 2]
	[local25 4] = [1390 12 2]
	[local29 4] = [1390 13 2]
	[local33 4] = [1390 14 2]
	[local37 4] = [1390 15 2]
	[local41 4] = [1390 16 2]
	[local45 4] = [1390 17 2]
	[local49 4] = [1390 18 2]
	[local53 5] = [1390 19 1 2]
	[local58 5] = [1390 21 1 2]
	[local63 4] = [1390 23 1]
	[local67 4] = [1390 24 1]
	[local71 4] = [1390 25 2]
	[local75 8] = [1390 26 1 2 1 2 2]
	[local83 6] = [1390 31 1 2 2]
	[local89 5] = [1390 34 1 2]
	[local94 5] = [1390 36 1 2]
	[local99 7] = [1390 38 1 2 2 2]
	[local106 4] = [1390 42 2]
	[local110 5] = [1390 43 1 2]
	[local115 5] = [1390 45 1 2]
	[local120 6] = [1390 47 1 2 2]
	[local126 4] = [1390 50 2]
	[local130 5] = [1390 51 1 2]
	[local135 5] = [1390 53 1 2]
	[local140 7] = [1390 55 2 1 2 2]
	[local147 9] = [1390 59 1 2 1 2 1 2]
	[local156 5] = [1390 65 2 1]
	[local161 5] = [1390 67 1 2]
	[local166 11] = [1390 69 1 2 1 2 1 2 2 2]
	[local177 9] = [1390 77 1 1 2 1 2 2]
	[local186 4] = [1390 83 2]
	[local190 7] = [1390 84 1 2 1 2]
	[local197 7] = [1390 88 1 2 1 2]
	[local204 4] = [1390 92 2]
	[local208 11] = [1390 93 1 1 1 2 1 2 2 2]
	[local219 5] = [1390 101 2 2]
	[local224 5] = [1390 103 1 2]
	[local229 5] = [1390 105 1 2]
	[local234 3] = [1390 107]
	[local237 5] = [1390 108 2 1]
	[local242 4] = [1390 110 1]
	[local246 12] = [1390 111 1 2 1 2 2 0 1390 116 1]
	[local258 5] = [1390 117 1 2]
	[local263 7] = [1390 119 1 1 2 2]
	[local270 4] = [1390 123 2]
	[local274 5] = [1390 124 2 2]
	[local279 5] = [1390 126 2 2]
	[local284 4] = [1390 128 2]
	[local288 10] = [1390 129 2 1 2 1 2 1 2]
	[local298 4] = [1390 136 2]
	[local302 5] = [1390 137 2 2]
	[local307 6] = [1390 139 2 2 1]
	[local313 4] = [1390 142 2]
	[local317 8] = [1390 143 2 1 2 1 2]
	[local325 4] = [1390 148 1]
	[local329 4] = [1390 149 2]
	[local333 6] = [1390 150 1 2 2]
	[local339 4] = [1390 153 2]
	[local343 4] = [1390 154 2]
	[local347 7] = [1390 155 2 1 2 2]
	[local354 4] = [1390 159 2]
	[local358 5] = [1390 160 2 2]
	[local363 9] = [1390 162 1 2 1 2 2 2]
	[local372 5] = [1390 168 2 2]
	[local377 4] = [1390 170 2]
	[local381 5] = [1390 171 1 2]
	[local386 7] = [1390 173 2 1 2 2]
	[local393 5] = [1390 177 2 2]
	[local398 7] = [1390 179 2 1 2 2]
	[local405 4] = [1390 183 2]
	[local409 4] = [1390 184 2]
	[local413 4] = [1390 185 2]
	[local417 6] = [1390 186 1 2 2]
	[local423 4] = [1390 189 2]
	[local427 4] = [1390 190 2]
	[local431 5] = [1390 191 1 2]
	[local436 4] = [1390 193 2]
	[local440 6] = [1390 194 2 2 2]
	[local446 4] = [1390 197 2]
	[local450 4] = [1390 198 2]
	[local454 5] = [1390 199 1 2]
	[local459 4] = [1390 201 2]
	[local463 4] = [1390 202 2]
	[local467 4] = [1390 203 2]
	[local471 7] = [1390 204 1 2 2 2]
	[local478 5] = [1390 208 2 2]
	[local483 4] = [1390 210 2]
	[local487 5] = [1390 211 1 2]
	[local492 6] = [1390 213 2 1 2]
	[local498 9] = [-1 8728 19]
)
(procedure (localproc_000e param1 param2 param3 param4)
	(asm
		lsp      argc
		ldi      4
		lt?     
		bt       code_0018
		lap      param4
code_0018:
		bnt      code_002b
		pushi    4
		lsp      param1
		lsp      param2
		pushi    80
		lofsa    {***STUB:}
		push    
		calle    proc255_0,  8
code_002b:
		lsp      argc
		ldi      3
		ge?     
		bnt      code_0040
		lap      param3
		bnt      code_0040
		pushi    #cue
		pushi    0
		lap      param3
		send     4
code_0040:
		ret     
	)
)

(procedure (localproc_0041 param1 param2)
	(asm
		pushi    6
		pushi    2
		lsp      param1
		pushi    999
		pushi    1
		lea      @local498
		push    
		pushi    0
		&rest    param2
		calle    proc851_0,  12
		ret     
	)
)

(instance MoveBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_007f
			pTos     client
			lag      global0
			eq?     
			bnt      code_0072
			pushi    0
			callb    proc0_2,  0
code_0072:
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			pToa     client
			send     8
			jmp      code_00d1
code_007f:
			dup     
			ldi      1
			eq?     
			bnt      code_00a5
			pushi    #setCycle
			pushi    1
			class    Rev
			push    
			pushi    162
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pToa     register
			neg     
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_00d1
code_00a5:
			dup     
			ldi      2
			eq?     
			bnt      code_00d1
			pTos     client
			lag      global0
			eq?     
			bnt      code_00bb
			pushi    0
			callb    proc0_2,  0
			jmp      code_00cc
code_00bb:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			pushi    65535
			pToa     client
			send     12
code_00cc:
			pushi    #dispose
			pushi    0
			self     4
code_00d1:
			toss    
			ret     
		)
	)
)

(instance rm390 of Rm
	(properties
		lookStr 8753
		picture 390
		style $0064
		horizon 175
		south 260
	)
	
	(method (init param1)
		(asm
			pushi    2
			pushi    131
			pushi    1390
			callk    Load,  4
			lsg      global126
			dup     
			ldi      2
			eq?     
			bnt      code_016c
			pushi    1
			pushi    80
			callb    proc0_6,  2
			jmp      code_0179
code_016c:
			dup     
			ldi      3
			eq?     
			bnt      code_0179
			pushi    1
			pushi    63
			callb    proc0_6,  2
code_0179:
			toss    
			pushi    #init
			pushi    0
			&rest    param1
			super    Rm,  4
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lofsa    castle
			push    
			lofsa    arch
			push    
			calle    proc806_3,  4
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    113
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    206
			pushi    189
			pushi    179
			dup     
			pushi    148
			pushi    179
			pushi    115
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     6
			pushi    #init
			pushi    0
			lofsa    Hubert
			send     4
			pushi    #approachVerbs
			pushi    3
			dup     
			pushi    4
			pushi    5
			lofsa    Hubert
			send     10
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lofsa    Hubert
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    185
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    1
			pushi    3
			lsg      global12
			pushi    400
			pushi    570
			calle    proc999_5,  6
			bnt      code_0227
			ldi      2
			jmp      code_0229
code_0227:
			ldi      3
code_0229:
			push    
			callb    proc0_2,  2
			pushi    #number
			pushi    1
			pushi    390
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #setScript
			pushi    1
			lofsa    roomInit
			push    
			self     6
			ret     
		)
	)
	
	(method (newRoom newRoomNumber param2)
		(asm
			lsp      newRoomNumber
			dup     
			ldi      570
			eq?     
			bnt      code_0130
			pushi    1
			pushi    81
			callb    proc0_6,  2
			lsg      global126
			ldi      5
			ne?     
			bnt      code_0130
			pushi    2
			pushi    390
			pushi    0
			calle    proc255_0,  4
			ret     
code_0130:
			toss    
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			&rest    param2
			super    Rm,  6
			ret     
		)
	)
)

(instance roomInit of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_02da
			lsg      global126
			ldi      3
			eq?     
			bnt      code_02ae
			pushi    1
			pushi    80
			callb    proc0_5,  2
code_02ae:
			bt       code_02bf
			lsg      global126
			ldi      2
			eq?     
			bnt      code_02d1
			pushi    1
			pushi    63
			callb    proc0_5,  2
code_02bf:
			bnt      code_02d1
			pushi    #setScript
			pushi    1
			lofsa    BeardChanged
			push    
			pToa     client
			send     6
			jmp      code_02da
code_02d1:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_02da:
			toss    
			ret     
		)
	)
)

(instance GilesAndRogerAppear of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0358
			pushi    #init
			pushi    0
			pushi    66
			pushi    1
			pushi    9
			pushi    18
			pushi    1
			pushi    0
			pushi    300
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    158
			pushi    #y
			pushi    0
			lofsa    Giles
			send     4
			push    
			pushSelf
			lofsa    Giles
			send     38
			jmp      code_039a
code_0358:
			dup     
			ldi      1
			eq?     
			bnt      code_038e
			pushi    #init
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			pushi    300
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    168
			pushi    #y
			pushi    0
			lofsa    Roger
			send     4
			push    
			pushSelf
			lofsa    Roger
			send     32
			jmp      code_039a
code_038e:
			dup     
			ldi      2
			eq?     
			bnt      code_039a
			pushi    #dispose
			pushi    0
			self     4
code_039a:
			toss    
			ret     
		)
	)
)

(instance BeardChanged of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03f7
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lsg      global0
			lofsa    Hubert
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_047d
code_03f7:
			dup     
			ldi      1
			eq?     
			bnt      code_0419
			pushi    2
			lsg      global126
			ldi      2
			eq?     
			bnt      code_040d
			lea      @local16
			jmp      code_0410
code_040d:
			lea      @local4
code_0410:
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_047d
code_0419:
			dup     
			ldi      2
			eq?     
			bnt      code_0433
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_047d
code_0433:
			dup     
			ldi      3
			eq?     
			bnt      code_0455
			pushi    2
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0449
			lea      @local25
			jmp      code_044c
code_0449:
			lea      @local12
code_044c:
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_047d
code_0455:
			dup     
			ldi      4
			eq?     
			bnt      code_047d
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0469
			ldi      39
			jmp      code_046b
code_0469:
			ldi      7
code_046b:
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_047d:
			toss    
			ret     
		)
	)
)

(instance Giles of Actor
	(properties
		x 120
		y 170
		view 755
	)
)

(instance Roger of Actor
	(properties
		x 200
		y 170
		view 755
	)
)

(instance castle of Feature
	(properties
		y 4
		description 8925
		lookStr 8872
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    28
			pushi    0
			pushi    68
			pushi    12
			pushi    66
			pushi    15
			pushi    20
			pushi    51
			pushi    5
			pushi    88
			pushi    5
			pushi    129
			pushi    22
			pushi    185
			pushi    22
			pushi    222
			pushi    5
			pushi    273
			pushi    4
			pushi    304
			pushi    20
			pushi    304
			pushi    70
			pushi    318
			pushi    71
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
			send     70
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance arch of Feature
	(properties
		y 49
		description 9027
		lookStr 8947
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    115
			pushi    50
			pushi    206
			pushi    49
			pushi    207
			pushi    176
			pushi    114
			pushi    177
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance stopTresspasser of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_070e
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			lsg      global126
			ldi      1
			eq?     
			bnt      code_0705
			pushi    #setScript
			pushi    2
			lofsa    KickBeggar
			push    
			pushSelf
			self     8
			jmp      code_0752
code_0705:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0752
code_070e:
			dup     
			ldi      1
			eq?     
			bnt      code_0732
			ldi      1
			aTop     notKilled
			pushi    2
			lsg      global126
			eq?     
			bnt      code_0726
			lea      @local0
			jmp      code_0729
code_0726:
			lea      @local37
code_0729:
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0752
code_0732:
			dup     
			ldi      2
			eq?     
			bnt      code_0752
			pushi    #setScript
			pushi    3
			lofsa    MoveBack
			push    
			pushSelf
			pushi    4
			lag      global0
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0752:
			toss    
			ret     
		)
	)
)

(instance Hubert of Actor
	(properties
		x 147
		y 175
		heading 180
		description 9141
		approachX 184
		approachY 185
		lookStr 9061
		view 392
	)
	
	(method (doit param1 &tmp temp0 temp1)
		(asm
			pToa     script
			not     
			bnt      code_07cb
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			sat      temp0
			bnt      code_07cb
			pTos     y
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			ge?     
			bnt      code_07cb
			pprev   
			pushi    #y
			pushi    0
			lat      temp0
			send     4
			ge?     
			bnt      code_07cb
			pushi    #setScript
			pushi    1
			lofsa    stopTresspasser
			push    
			self     6
code_07cb:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_07fa
			pushi    142
			pushi    1
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_07f0
			lofsa    BeggarTouchesHubert
			jmp      code_07f3
code_07f0:
			lofsa    TryToTouchHubert
code_07f3:
			toss    
			push    
			self     6
			jmp      code_0ad7
code_07fa:
			dup     
			ldi      5
			eq?     
			bnt      code_0888
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_0817
			pushi    #setScript
			pushi    1
			lofsa    BeggarTalkToHubert
			push    
			self     6
			jmp      code_0884
code_0817:
			dup     
			ldi      4
			eq?     
			bnt      code_082b
			pushi    #setScript
			pushi    1
			lofsa    PuckTalkToHubert
			push    
			self     6
			jmp      code_0884
code_082b:
			dup     
			ldi      6
			eq?     
			bnt      code_083f
			pushi    #setScript
			pushi    1
			lofsa    FensTalkToHubert
			push    
			self     6
			jmp      code_0884
code_083f:
			dup     
			ldi      5
			eq?     
			bnt      code_0853
			pushi    #setScript
			pushi    1
			lofsa    AbbeyTalkToHubert
			push    
			self     6
			jmp      code_0884
code_0853:
			dup     
			ldi      2
			eq?     
			bnt      code_0867
			pushi    #setScript
			pushi    1
			lofsa    JewelerTalkToHubert
			push    
			self     6
			jmp      code_0884
code_0867:
			dup     
			ldi      3
			eq?     
			bnt      code_087b
			pushi    #setScript
			pushi    1
			lofsa    JewelerTalkToHubert
			push    
			self     6
			jmp      code_0884
code_087b:
			pushi    2
			pushi    390
			pushi    1
			calle    proc13_4,  4
code_0884:
			toss    
			jmp      code_0ad7
code_0888:
			dup     
			ldi      10
			eq?     
			bnt      code_08a7
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0ad7
			pushi    2
			ldi      0
			lsli     local234
			ldi      1
			lsli     local234
			calle    proc13_4,  4
			jmp      code_0ad7
code_08a7:
			dup     
			ldi      11
			eq?     
			bnt      code_08bc
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
			jmp      code_0ad7
code_08bc:
			dup     
			ldi      4
			eq?     
			bnt      code_0aca
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0947
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_08e2
			pushi    #setScript
			pushi    1
			lofsa    BeggarBribesHubert
			push    
			self     6
			jmp      code_0943
code_08e2:
			dup     
			ldi      5
			eq?     
			bnt      code_08f6
			pushi    #setScript
			pushi    1
			lofsa    AbbeyBribesHubert
			push    
			self     6
			jmp      code_0943
code_08f6:
			dup     
			ldi      6
			eq?     
			bnt      code_090a
			pushi    #setScript
			pushi    1
			lofsa    FensBribesHubert
			push    
			self     6
			jmp      code_0943
code_090a:
			dup     
			ldi      4
			eq?     
			bnt      code_091e
			pushi    #setScript
			pushi    1
			lofsa    PuckBribesHubert
			push    
			self     6
			jmp      code_0943
code_091e:
			dup     
			ldi      2
			eq?     
			bnt      code_0932
			pushi    #setScript
			pushi    1
			lofsa    JewelerBribesHubert
			push    
			self     6
			jmp      code_0943
code_0932:
			dup     
			ldi      3
			eq?     
			bnt      code_0943
			pushi    #setScript
			pushi    1
			lofsa    JewelerBribesHubert
			push    
			self     6
code_0943:
			toss    
			jmp      code_0ac6
code_0947:
			dup     
			ldi      2
			eq?     
			bnt      code_098a
			pushi    3
			lsg      global126
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_096d
			pushi    1
			lea      @local358
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_096d:
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0ac6
			pushi    #setScript
			pushi    1
			lofsa    JewelerGivesEmeraldToHubert
			push    
			self     6
			jmp      code_0ac6
code_098a:
			dup     
			ldi      3
			eq?     
			bnt      code_099e
			pushi    #setScript
			pushi    1
			lofsa    GiveSlipperToHubert
			push    
			self     6
			jmp      code_0ac6
code_099e:
			dup     
			ldi      15
			eq?     
			bnt      code_09c2
			lsg      global126
			ldi      1
			eq?     
			bnt      code_0ac6
			lsg      global130
			ldi      3
			eq?     
			bnt      code_0ac6
			pushi    #setScript
			pushi    1
			lofsa    GiveCombToHubert
			push    
			self     6
			jmp      code_0ac6
code_09c2:
			dup     
			ldi      11
			eq?     
			bnt      code_09ee
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_09e0
			pushi    1
			lea      @local405
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_09e0:
			pushi    1
			lea      @local409
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_09ee:
			dup     
			ldi      14
			eq?     
			bnt      code_0a02
			pushi    #setScript
			pushi    1
			lofsa    GiveAmethystToHubert
			push    
			self     6
			jmp      code_0ac6
code_0a02:
			dup     
			ldi      12
			eq?     
			bnt      code_0a17
			pushi    1
			lea      @local436
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_0a17:
			dup     
			ldi      13
			eq?     
			bnt      code_0a2c
			pushi    1
			lea      @local459
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_0a2c:
			dup     
			ldi      5
			eq?     
			bnt      code_0a41
			pushi    1
			lea      @local463
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_0a41:
			dup     
			ldi      6
			eq?     
			bnt      code_0a55
			pushi    #setScript
			pushi    1
			lofsa    GiveAmethystToHubert
			push    
			self     6
			jmp      code_0ac6
code_0a55:
			dup     
			ldi      7
			eq?     
			bnt      code_0a69
			pushi    #setScript
			pushi    1
			lofsa    GiveJewelsToHubert
			push    
			self     6
			jmp      code_0ac6
code_0a69:
			dup     
			ldi      8
			eq?     
			bnt      code_0a7e
			pushi    1
			lea      @local492
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_0a7e:
			pushi    3
			lsp      param2
			pushi    10
			pushi    18
			calle    proc999_5,  6
			bnt      code_0a9c
			pushi    #setScript
			pushi    1
			lofsa    GiveRingToHubert
			push    
			self     6
			jmp      code_0ac6
code_0a9c:
			pushi    3
			lsp      param2
			pushi    16
			pushi    17
			calle    proc999_5,  6
			bnt      code_0abb
			pushi    1
			lea      @local467
			push    
			call     localproc_0041,  2
			jmp      code_0ac6
code_0abb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0ac6:
			toss    
			jmp      code_0ad7
code_0aca:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Actor,  8
code_0ad7:
			toss    
			ret     
		)
	)
)

(instance GiveAmethystToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bf9
			ipToa    register
			pushi    3
			lsg      global126
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_0b92
			pushi    2
			lea      @local413
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0c05
code_0b92:
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0c05
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_0bd3
			pTos     register
			ldi      1
			eq?     
			bnt      code_0bc4
			pushi    2
			lea      @local417
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0c05
code_0bc4:
			pushi    2
			lea      @local423
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0c05
code_0bd3:
			pTos     register
			ldi      1
			eq?     
			bnt      code_0bea
			pushi    2
			lea      @local427
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0c05
code_0bea:
			pushi    2
			lea      @local431
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0c05
code_0bf9:
			dup     
			ldi      1
			eq?     
			bnt      code_0c05
			pushi    #dispose
			pushi    0
			self     4
code_0c05:
			toss    
			ret     
		)
	)
)

(instance GiveJewelsToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cb3
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			not     
			bnt      code_0c6f
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0d61
code_0c6f:
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_0c8d
			ldi      65535
			aTop     register
			pushi    2
			lea      @local471
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0d61
code_0c8d:
			pTos     register
			ldi      1
			eq?     
			bnt      code_0ca4
			pushi    2
			lea      @local483
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0d61
code_0ca4:
			pushi    2
			lea      @local487
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0d61
code_0cb3:
			dup     
			ldi      1
			eq?     
			bnt      code_0ce1
			pTos     register
			ldi      65535
			eq?     
			bnt      code_0cd5
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_0d61
code_0cd5:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0d61
code_0ce1:
			dup     
			ldi      2
			eq?     
			bnt      code_0d02
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_0d61
code_0d02:
			dup     
			ldi      3
			eq?     
			bnt      code_0d18
			pushi    2
			lea      @local478
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0d61
code_0d18:
			dup     
			ldi      4
			eq?     
			bnt      code_0d3d
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_0d61
code_0d3d:
			dup     
			ldi      5
			eq?     
			bnt      code_0d61
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0d61:
			toss    
			ret     
		)
	)
)

(instance GiveRingToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e31
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    3
			lsg      global126
			pushi    6
			pushi    5
			calle    proc999_5,  6
			bt       code_0ddb
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0df1
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
code_0ddb:
			bnt      code_0df1
			ldi      65535
			aTop     register
			pushi    2
			lea      @local440
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0e90
code_0df1:
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0e90
			pushi    1
			pushi    145
			callb    proc0_5,  2
			bnt      code_0e90
			pTos     register
			ldi      1
			eq?     
			bnt      code_0e22
			pushi    2
			lea      @local450
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0e90
code_0e22:
			pushi    2
			lea      @local454
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0e90
code_0e31:
			dup     
			ldi      1
			eq?     
			bnt      code_0e5f
			pTos     register
			ldi      65535
			eq?     
			bnt      code_0e53
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_0e90
code_0e53:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0e90
code_0e5f:
			dup     
			ldi      2
			eq?     
			bnt      code_0e75
			pushi    2
			lea      @local446
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0e90
code_0e75:
			dup     
			ldi      3
			eq?     
			bnt      code_0e90
			ldi      8
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0e90:
			toss    
			ret     
		)
	)
)

(instance JewelerGivesEmeraldToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f20
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_0efa
			pushi    2
			lea      @local363
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0fcd
code_0efa:
			pTos     register
			ldi      1
			eq?     
			bnt      code_0f11
			pushi    2
			lea      @local377
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0fcd
code_0f11:
			pushi    2
			lea      @local381
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0fcd
code_0f20:
			dup     
			ldi      1
			eq?     
			bnt      code_0f51
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_0f45
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_0fcd
code_0f45:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0fcd
code_0f51:
			dup     
			ldi      2
			eq?     
			bnt      code_0f72
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_0fcd
code_0f72:
			dup     
			ldi      3
			eq?     
			bnt      code_0f88
			pushi    2
			lea      @local372
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0fcd
code_0f88:
			dup     
			ldi      4
			eq?     
			bnt      code_0fad
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_0fcd
code_0fad:
			dup     
			ldi      5
			eq?     
			bnt      code_0fcd
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0fcd:
			toss    
			ret     
		)
	)
)

(instance GiveCombToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1027
			pushi    2
			lea      @local398
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_103d
code_1027:
			dup     
			ldi      1
			eq?     
			bnt      code_103d
			ldi      6
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_103d:
			toss    
			ret     
		)
	)
)

(instance GiveSlipperToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10c0
			ipToa    register
			lsg      global126
			ldi      1
			eq?     
			bnt      code_10cc
			lsg      global130
			ldi      3
			eq?     
			bnt      code_10cc
			pTos     register
			ldi      1
			eq?     
			bnt      code_10b1
			pushi    2
			lea      @local386
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_10cc
code_10b1:
			pushi    2
			lea      @local393
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_10cc
code_10c0:
			dup     
			ldi      1
			eq?     
			bnt      code_10cc
			pushi    #dispose
			pushi    0
			self     4
code_10cc:
			toss    
			ret     
		)
	)
)

(instance AbbeyBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11fc
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global130
			ldi      5
			eq?     
			bnt      code_112a
			pushi    1
			pushi    25
			callb    proc0_5,  2
code_112a:
			bt       code_113c
			lsg      global130
			ldi      6
			eq?     
			bnt      code_11a6
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
code_113c:
			bnt      code_11a6
			pushi    1
			pushi    81
			callb    proc0_5,  2
			bnt      code_1157
			pushi    2
			lea      @local274
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_12a1
code_1157:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_116d
			dpToa    register
			pushi    #cue
			pushi    0
			self     4
			jmp      code_12a1
code_116d:
			pushi    #taken
			pushi    0
			lag      global152
			send     4
			push    
			ldi      3
			lt?     
			bnt      code_1193
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    2
			lea      @local258
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_12a1
code_1193:
			ldi      65535
			aTop     register
			pushi    2
			lea      @local263
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_12a1
code_11a6:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_11b4
			pushi    1
			pushi    25
			callb    proc0_5,  2
code_11b4:
			bt       code_11c5
			pushi    3
			lsg      global130
			pushi    7
			pushi    8
			calle    proc999_5,  6
code_11c5:
			bnt      code_11d7
			pushi    2
			lea      @local279
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_12a1
code_11d7:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_11ee
			pushi    2
			lea      @local284
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_12a1
code_11ee:
			pushi    3
			pushi    390
			pushi    2
			pushSelf
			call     localproc_000e,  6
			jmp      code_12a1
code_11fc:
			dup     
			ldi      1
			eq?     
			bnt      code_1233
			pTos     register
			ldi      65535
			eq?     
			bnt      code_1227
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_12a1
code_1227:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_12a1
code_1233:
			dup     
			ldi      2
			eq?     
			bnt      code_1254
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_12a1
code_1254:
			dup     
			ldi      3
			eq?     
			bnt      code_126a
			pushi    2
			lea      @local270
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_12a1
code_126a:
			dup     
			ldi      4
			eq?     
			bnt      code_128f
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_12a1
code_128f:
			dup     
			ldi      5
			eq?     
			bnt      code_12a1
			pushi    #newRoom
			pushi    1
			pushi    570
			lag      global2
			send     6
code_12a1:
			toss    
			ret     
		)
	)
)

(instance FensBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13b1
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global130
			ldi      5
			eq?     
			bnt      code_1346
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_1346
			pushi    1
			pushi    144
			callb    proc0_5,  2
			bnt      code_131d
			pushi    2
			lea      @local302
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_144d
code_131d:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_1333
			dpToa    register
			pushi    #cue
			pushi    0
			self     4
			jmp      code_144d
code_1333:
			ldi      65535
			aTop     register
			pushi    2
			lea      @local288
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_144d
code_1346:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_1355
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
code_1355:
			bt       code_1379
			lsg      global130
			ldi      6
			eq?     
			bnt      code_1366
			pushi    1
			pushi    25
			callb    proc0_5,  2
code_1366:
			bt       code_1379
			pushi    4
			lsg      global130
			pushi    7
			pushi    8
			pushi    9
			calle    proc999_5,  8
code_1379:
			bnt      code_13a2
			pTos     register
			ldi      1
			eq?     
			bnt      code_1393
			pushi    2
			lea      @local307
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_144d
code_1393:
			pushi    2
			lea      @local313
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_144d
code_13a2:
			pushi    3
			pushi    390
			pushi    3
			pushSelf
			call     localproc_000e,  6
			jmp      code_144d
code_13b1:
			dup     
			ldi      1
			eq?     
			bnt      code_13df
			pTos     register
			ldi      65535
			eq?     
			bnt      code_13d3
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_144d
code_13d3:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_144d
code_13df:
			dup     
			ldi      2
			eq?     
			bnt      code_1400
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_144d
code_1400:
			dup     
			ldi      3
			eq?     
			bnt      code_1416
			pushi    2
			lea      @local298
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_144d
code_1416:
			dup     
			ldi      4
			eq?     
			bnt      code_143b
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_144d
code_143b:
			dup     
			ldi      5
			eq?     
			bnt      code_144d
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
code_144d:
			toss    
			ret     
		)
	)
)

(instance PuckBribesHubert of TScript
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
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global130
			dup     
			ldi      8
			eq?     
			bnt      code_14e8
			pTos     register
			ldi      1
			gt?     
			bnt      code_14c3
			pushi    3
			ldi      0
			lsli     local325
			ldi      1
			lsli     local325
			pushSelf
			calle    proc13_4,  6
			jmp      code_1563
code_14c3:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_14d9
			dpToa    register
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1563
code_14d9:
			pushi    2
			lea      @local317
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1563
code_14e8:
			dup     
			ldi      9
			eq?     
			bnt      code_1557
			pushi    1
			pushi    146
			callb    proc0_5,  2
			bnt      code_1508
			pushi    2
			lea      @local343
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1563
code_1508:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_151e
			dpToa    register
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1563
code_151e:
			pushi    #taken
			pushi    0
			lag      global152
			send     4
			push    
			ldi      3
			lt?     
			bnt      code_1544
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    2
			lea      @local329
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1563
code_1544:
			ldi      65535
			aTop     register
			pushi    2
			lea      @local333
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1563
code_1557:
			pushi    3
			pushi    390
			pushi    4
			pushSelf
			call     localproc_000e,  6
code_1563:
			toss    
			jmp      code_160c
code_1567:
			dup     
			ldi      1
			eq?     
			bnt      code_159e
			pTos     register
			ldi      65535
			eq?     
			bnt      code_1592
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_160c
code_1592:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_160c
code_159e:
			dup     
			ldi      2
			eq?     
			bnt      code_15bf
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_160c
code_15bf:
			dup     
			ldi      3
			eq?     
			bnt      code_15d5
			pushi    2
			lea      @local339
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_160c
code_15d5:
			dup     
			ldi      4
			eq?     
			bnt      code_15fa
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_160c
code_15fa:
			dup     
			ldi      5
			eq?     
			bnt      code_160c
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
code_160c:
			toss    
			ret     
		)
	)
)

(instance JewelerBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16be
			pushi    0
			callb    proc0_3,  0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_166e
			pushi    #cue
			pushi    0
			self     4
			jmp      code_16ce
code_166e:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_16a7
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_1690
			pushi    2
			lea      @local347
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_16ce
code_1690:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    2
			lea      @local354
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_16ce
code_16a7:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    3
			pushi    390
			pushi    5
			pushSelf
			call     localproc_000e,  6
			jmp      code_16ce
code_16be:
			dup     
			ldi      1
			eq?     
			bnt      code_16ce
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_16ce:
			toss    
			ret     
		)
	)
)

(instance BeggarBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_175d
			ipToa    register
			pTos     register
			ldi      1
			gt?     
			bnt      code_1731
			pushi    3
			pushi    1390
			pushi    116
			pushSelf
			calle    proc13_4,  6
			jmp      code_17c6
code_1731:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_1744
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_17c6
code_1744:
			pushi    0
			callb    proc0_3,  0
			pTos     register
			ldi      1
			eq?     
			bnt      code_17c6
			pushi    2
			lea      @local237
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_17c6
code_175d:
			dup     
			ldi      1
			eq?     
			bnt      code_178e
			pTos     register
			ldi      1
			gt?     
			bnt      code_1780
			pushi    0
			callb    proc0_4,  0
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_17c6
code_1780:
			pushi    #setScript
			pushi    2
			lofsa    KickBeggar
			push    
			pushSelf
			self     8
			jmp      code_17c6
code_178e:
			dup     
			ldi      2
			eq?     
			bnt      code_17a2
			pushi    2
			lea      @local242
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_17c6
code_17a2:
			dup     
			ldi      3
			eq?     
			bnt      code_17b6
			pushi    2
			lea      @local246
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_17c6
code_17b6:
			dup     
			ldi      4
			eq?     
			bnt      code_17c6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_17c6:
			toss    
			ret     
		)
	)
)

(instance BeggarTouchesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1822
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    KickBeggar
			push    
			pushSelf
			self     8
			jmp      code_1846
code_1822:
			dup     
			ldi      1
			eq?     
			bnt      code_1836
			pushi    2
			lea      @local29
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1846
code_1836:
			dup     
			ldi      2
			eq?     
			bnt      code_1846
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1846:
			toss    
			ret     
		)
	)
)

(instance KickBeggar of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18ab
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    Hubert
			send     24
			jmp      code_19a5
code_18ab:
			dup     
			ldi      1
			eq?     
			bnt      code_18fa
			pushi    #view
			pushi    1
			pushi    392
			pushi    6
			pushi    1
			pushi    2
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
			pushi    65532
			pushi    #x
			pushi    0
			lofsa    Hubert
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sub     
			ge?     
			bnt      code_18f3
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     8
			jmp      code_19a5
code_18f3:
			ldi      1
			aTop     cycles
			jmp      code_19a5
code_18fa:
			dup     
			ldi      2
			eq?     
			bnt      code_1938
			pushi    65532
			pushi    #x
			pushi    0
			lofsa    Hubert
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sub     
			ge?     
			bnt      code_1928
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    Hubert
			send     8
			jmp      code_192c
code_1928:
			ldi      1
			aTop     cycles
code_192c:
			pushi    #loop
			pushi    1
			pushi    0
			lofsa    Hubert
			send     6
			jmp      code_19a5
code_1938:
			dup     
			ldi      3
			eq?     
			bnt      code_194c
			pushi    2
			lea      @local67
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_19a5
code_194c:
			dup     
			ldi      4
			eq?     
			bnt      code_195a
			ldi      60
			aTop     ticks
			jmp      code_19a5
code_195a:
			dup     
			ldi      5
			eq?     
			bnt      code_197a
			pushi    #view
			pushi    1
			pushi    392
			pushi    6
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_19a5
code_197a:
			dup     
			ldi      6
			eq?     
			bnt      code_1999
			pushi    1
			pushi    3
			callb    proc0_2,  2
			pushi    #setScript
			pushi    3
			lofsa    MoveBack
			push    
			pushSelf
			pushi    2
			lag      global0
			send     10
			jmp      code_19a5
code_1999:
			dup     
			ldi      7
			eq?     
			bnt      code_19a5
			pushi    #dispose
			pushi    0
			self     4
code_19a5:
			toss    
			ret     
		)
	)
)

(instance BeggarTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a03
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    3
			lsg      global0
			lofsa    Hubert
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1a7a
code_1a03:
			dup     
			ldi      1
			eq?     
			bnt      code_1a2c
			pTos     register
			ldi      1
			eq?     
			bnt      code_1a1f
			pushi    2
			lea      @local53
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1a7a
code_1a1f:
			pushi    2
			lea      @local63
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1a7a
code_1a2c:
			dup     
			ldi      2
			eq?     
			bnt      code_1a41
			pushi    #setScript
			pushi    2
			lofsa    KickBeggar
			push    
			pushSelf
			self     8
			jmp      code_1a7a
code_1a41:
			dup     
			ldi      3
			eq?     
			bnt      code_1a6a
			pTos     register
			ldi      1
			eq?     
			bnt      code_1a5d
			pushi    2
			lea      @local58
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1a7a
code_1a5d:
			pushi    2
			lea      @local71
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1a7a
code_1a6a:
			dup     
			ldi      4
			eq?     
			bnt      code_1a7a
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1a7a:
			toss    
			ret     
		)
	)
)

(instance TryToTouchHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b3b
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global126
			dup     
			ldi      4
			eq?     
			bnt      code_1af5
			pTos     register
			ldi      1
			eq?     
			bnt      code_1ae8
			pushi    2
			lea      @local41
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1b37
code_1ae8:
			pushi    2
			lea      @local45
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1b37
code_1af5:
			dup     
			ldi      5
			eq?     
			bnt      code_1b09
			pushi    2
			lea      @local33
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1b37
code_1b09:
			dup     
			ldi      6
			eq?     
			bnt      code_1b1d
			pushi    2
			lea      @local37
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1b37
code_1b1d:
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_1b37
			pushi    2
			lea      @local49
			push    
			pushSelf
			call     localproc_0041,  4
code_1b37:
			toss    
			jmp      code_1b6a
code_1b3b:
			dup     
			ldi      1
			eq?     
			bnt      code_1b5a
			pushi    1
			pushi    3
			callb    proc0_2,  2
			pushi    #setScript
			pushi    3
			lofsa    MoveBack
			push    
			pushSelf
			pushi    2
			lag      global0
			send     10
			jmp      code_1b6a
code_1b5a:
			dup     
			ldi      2
			eq?     
			bnt      code_1b6a
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1b6a:
			toss    
			ret     
		)
	)
)

(instance PuckTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cec
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global130
			dup     
			ldi      8
			eq?     
			bnt      code_1c45
			lsg      global155
			ldi      42
			ge?     
			bnt      code_1c0d
			pushi    1
			pushi    10
			callb    proc0_5,  2
			not     
			bnt      code_1c0d
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1beb
			pushi    2
			lea      @local190
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1c09
code_1beb:
			dup     
			ldi      2
			eq?     
			bnt      code_1bff
			pushi    2
			lea      @local197
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1c09
code_1bff:
			pushi    2
			lea      @local204
			push    
			pushSelf
			call     localproc_0041,  4
code_1c09:
			toss    
			jmp      code_1ce8
code_1c0d:
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1c23
			pushi    2
			lea      @local140
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1c41
code_1c23:
			dup     
			ldi      2
			eq?     
			bnt      code_1c37
			pushi    2
			lea      @local147
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1c41
code_1c37:
			pushi    2
			lea      @local156
			push    
			pushSelf
			call     localproc_0041,  4
code_1c41:
			toss    
			jmp      code_1ce8
code_1c45:
			dup     
			ldi      9
			eq?     
			bnt      code_1cdc
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_1ca4
			pushi    1
			pushi    146
			callb    proc0_5,  2
			bnt      code_1c6c
			pushi    2
			lea      @local204
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1ce8
code_1c6c:
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1c82
			pushi    2
			lea      @local161
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1ca0
code_1c82:
			dup     
			ldi      2
			eq?     
			bnt      code_1c96
			pushi    2
			lea      @local166
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1ca0
code_1c96:
			pushi    2
			lea      @local177
			push    
			pushSelf
			call     localproc_0041,  4
code_1ca0:
			toss    
			jmp      code_1ce8
code_1ca4:
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1cba
			pushi    2
			lea      @local190
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1cd8
code_1cba:
			dup     
			ldi      2
			eq?     
			bnt      code_1cce
			pushi    2
			lea      @local197
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1cd8
code_1cce:
			pushi    2
			lea      @local204
			push    
			pushSelf
			call     localproc_0041,  4
code_1cd8:
			toss    
			jmp      code_1ce8
code_1cdc:
			pushi    3
			pushi    390
			pushi    6
			pushSelf
			call     localproc_000e,  6
code_1ce8:
			toss    
			jmp      code_1da3
code_1cec:
			dup     
			ldi      1
			eq?     
			bnt      code_1d2e
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_1d22
			pTos     register
			ldi      3
			ge?     
			bnt      code_1d22
			pushi    1
			pushi    146
			callb    proc0_5,  2
			not     
			bnt      code_1d22
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_1da3
code_1d22:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1da3
code_1d2e:
			dup     
			ldi      2
			eq?     
			bnt      code_1d4f
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_1da3
code_1d4f:
			dup     
			ldi      3
			eq?     
			bnt      code_1d6c
			pushi    1
			pushi    75
			calle    proc806_1,  2
			pushi    2
			lea      @local186
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1da3
code_1d6c:
			dup     
			ldi      4
			eq?     
			bnt      code_1d91
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_1da3
code_1d91:
			dup     
			ldi      5
			eq?     
			bnt      code_1da3
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
code_1da3:
			toss    
			ret     
		)
	)
)

(instance FensTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ebe
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global130
			ldi      6
			eq?     
			bnt      code_1e27
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_1e27
			pTos     register
			ldi      1
			eq?     
			bnt      code_1e1a
			pushi    2
			lea      @local99
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1f58
code_1e1a:
			pushi    2
			lea      @local106
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1f58
code_1e27:
			lsg      global130
			ldi      8
			eq?     
			bnt      code_1e3c
			pushi    2
			lea      @local115
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1f58
code_1e3c:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_1e7f
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_1e7f
			pTos     register
			ldi      1
			eq?     
			bnt      code_1e72
			pushi    1
			pushi    144
			callb    proc0_5,  2
			not     
			bnt      code_1e72
			pushi    2
			lea      @local120
			push    
			pushSelf
			call     localproc_0041,  4
			ldi      65535
			aTop     register
			jmp      code_1f58
code_1e72:
			pushi    2
			lea      @local130
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1f58
code_1e7f:
			pushi    3
			lsg      global130
			pushi    7
			pushi    9
			calle    proc999_5,  6
			bt       code_1e9f
			lsg      global130
			ldi      6
			eq?     
			bnt      code_1eaf
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
code_1e9f:
			bnt      code_1eaf
			pushi    2
			lea      @local135
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1f58
code_1eaf:
			pushi    3
			pushi    390
			pushi    7
			pushSelf
			call     localproc_000e,  6
			jmp      code_1f58
code_1ebe:
			dup     
			ldi      1
			eq?     
			bnt      code_1eec
			pTos     register
			ldi      65535
			eq?     
			bnt      code_1ee0
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_1f58
code_1ee0:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1f58
code_1eec:
			dup     
			ldi      2
			eq?     
			bnt      code_1f0d
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_1f58
code_1f0d:
			dup     
			ldi      3
			eq?     
			bnt      code_1f21
			pushi    2
			lea      @local126
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_1f58
code_1f21:
			dup     
			ldi      4
			eq?     
			bnt      code_1f46
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			jmp      code_1f58
code_1f46:
			dup     
			ldi      5
			eq?     
			bnt      code_1f58
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
code_1f58:
			toss    
			ret     
		)
	)
)

(instance AbbeyTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20a4
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			lsg      global130
			ldi      5
			eq?     
			bnt      code_1fb6
			pushi    1
			pushi    25
			callb    proc0_5,  2
code_1fb6:
			bt       code_1fc8
			lsg      global130
			ldi      6
			eq?     
			bnt      code_202f
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
code_1fc8:
			bnt      code_202f
			pushi    1
			pushi    81
			callb    proc0_5,  2
			not     
			bnt      code_200d
			pTos     register
			ldi      1
			eq?     
			bnt      code_1ffa
			pushi    1
			pushi    17
			callb    proc0_5,  2
			not     
			bnt      code_1ffa
			pushi    1
			pushi    17
			callb    proc0_6,  2
			pushi    2
			lea      @local75
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_1ffa:
			pushi    1
			pushi    17
			callb    proc0_6,  2
			pushi    2
			lea      @local83
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_200d:
			pTos     register
			ldi      1
			eq?     
			bnt      code_2022
			pushi    2
			lea      @local89
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_2022:
			pushi    2
			lea      @local94
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_202f:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_2062
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_2062
			pTos     register
			ldi      1
			eq?     
			bnt      code_2055
			pushi    2
			lea      @local99
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_2055:
			pushi    2
			lea      @local106
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_2062:
			pushi    3
			lsg      global130
			pushi    7
			pushi    9
			calle    proc999_5,  6
			bnt      code_2080
			pushi    2
			lea      @local110
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_2080:
			lsg      global130
			ldi      8
			eq?     
			bnt      code_2095
			pushi    2
			lea      @local115
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_20b4
code_2095:
			pushi    3
			pushi    390
			pushi    8
			pushSelf
			call     localproc_000e,  6
			jmp      code_20b4
code_20a4:
			dup     
			ldi      1
			eq?     
			bnt      code_20b4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_20b4:
			toss    
			ret     
		)
	)
)

(instance JewelerTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_213e
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_211c
			pushi    2
			lea      @local208
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_21da
code_211c:
			pTos     register
			ldi      1
			eq?     
			bnt      code_2131
			pushi    2
			lea      @local224
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_21da
code_2131:
			pushi    2
			lea      @local229
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_21da
code_213e:
			dup     
			ldi      1
			eq?     
			bnt      code_216f
			pushi    1
			pushi    145
			callb    proc0_5,  2
			not     
			bnt      code_2163
			pushi    #setScript
			pushi    4
			lofsa    GilesAndRogerAppear
			push    
			pushSelf
			pTos     register
			pTos     notKilled
			self     12
			jmp      code_21da
code_2163:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_21da
code_216f:
			dup     
			ldi      2
			eq?     
			bnt      code_2190
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Hubert
			send     20
			jmp      code_21da
code_2190:
			dup     
			ldi      3
			eq?     
			bnt      code_21a4
			pushi    2
			lea      @local219
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_21da
code_21a4:
			dup     
			ldi      4
			eq?     
			bnt      code_21da
			pushi    58
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    2
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			mul     
			push    
			pushSelf
			lag      global0
			send     16
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #newRoom
			pushi    1
			pushi    400
			lag      global2
			send     6
code_21da:
			toss    
			ret     
		)
	)
)
