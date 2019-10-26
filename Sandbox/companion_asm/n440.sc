;;; Sierra Script 1.0 - (do not remove this comment)
(script# 440)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	rm440 0
)

(local
	[local0 5] = [1440 0 1 2]
	[local5 5] = [1440 2 1 2]
	[local10 6] = [1440 4 1 2 1]
	[local16 4] = [1440 8 1]
	[local20 6] = [1440 12 1 2 1]
	[local26 4] = [1440 15 1]
	[local30 8] = [1440 38 2 1 2 1 2]
	[local38 9] = [1440 44 1 2 1 2 1 1]
	[local47 8] = [1440 50 1 2 1 2 1]
	[local55 5] = [1440 55 1 1]
)
(instance rm440 of StdRoom
	(properties
		picture 440
		style $0064
		east 260
		south 260
	)
	
	(method (init &tmp temp0 temp1)
		(asm
			pushi    0
			callb    proc0_3,  0
			lofsa    arrived
			aTop     script
			pushi    #client
			pushi    1
			pushSelf
			lofsa    arrived
			send     6
			ldi      0
			sat      temp1
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0036
			ldi      67
			sat      temp0
			jmp      code_008f
code_0036:
			dup     
			ldi      1
			eq?     
			bnt      code_0044
			ldi      69
			sat      temp0
			jmp      code_008f
code_0044:
			dup     
			ldi      2
			eq?     
			bnt      code_0052
			ldi      74
			sat      temp0
			jmp      code_008f
code_0052:
			dup     
			ldi      3
			eq?     
			bnt      code_0060
			ldi      74
			sat      temp0
			jmp      code_008f
code_0060:
			dup     
			ldi      4
			eq?     
			bnt      code_006e
			ldi      68
			sat      temp0
			jmp      code_008f
code_006e:
			dup     
			ldi      5
			eq?     
			bnt      code_0080
			ldi      50
			sat      temp0
			ldi      51
			sat      temp1
			jmp      code_008f
code_0080:
			dup     
			ldi      6
			eq?     
			bnt      code_008f
			ldi      48
			sat      temp0
			ldi      49
			sat      temp1
code_008f:
			toss    
			pushi    3
			pushi    0
			lst      temp0
			lst      temp1
			callb    proc0_2,  6
			lat      temp1
			not     
			bnt      code_00ab
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			lag      global0
			send     6
code_00ab:
			pushi    #actions
			pushi    1
			lofsa    noBig
			push    
			pushi    308
			pushi    2
			pushi    2
			pushi    1
			lag      global0
			send     14
			pushi    #init
			pushi    1
			pushi    1
			super    StdRoom,  6
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    52
			pushi    102
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    108
			pushi    295
			pushi    103
			pushi    277
			pushi    102
			pushi    269
			pushi    107
			pushi    272
			pushi    115
			pushi    253
			pushi    114
			pushi    243
			pushi    119
			pushi    258
			pushi    125
			pushi    258
			pushi    128
			pushi    231
			pushi    131
			pushi    218
			pushi    126
			pushi    212
			pushi    128
			pushi    195
			pushi    122
			pushi    173
			pushi    129
			pushi    181
			pushi    138
			pushi    204
			pushi    145
			pushi    184
			pushi    157
			pushi    172
			pushi    152
			pushi    143
			pushi    167
			pushi    134
			pushi    165
			pushi    117
			pushi    177
			pushi    91
			pushi    185
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     118
			push    
			lag      global2
			send     6
			lsg      global12
			ldi      450
			eq?     
			bt       code_0177
			lsg      global12
			ldi      460
			eq?     
code_0177:
			bnt      code_019c
			pushi    #posn
			pushi    2
			pushi    175
			pushi    121
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    218
			pushi    138
			lofsa    arrived
			push    
			lag      global0
			send     20
			jmp      code_01c4
code_019c:
			pushi    #setScript
			pushi    1
			lofsa    changeMusic
			push    
			pushi    284
			pushi    2
			pushi    325
			pushi    164
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    309
			pushi    160
			lofsa    arrived
			push    
			lag      global0
			send     26
code_01c4:
			pushi    #number
			pushi    1
			pushi    905
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #init
			pushi    0
			lofsa    facade
			send     4
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    fDoor
			send     10
			pushi    #init
			pushi    0
			lofsa    entrance
			send     4
			pushi    #init
			pushi    0
			lofsa    maryTop
			send     4
			pushi    #init
			pushi    0
			lofsa    maryB
			send     4
			pushi    #init
			pushi    0
			lofsa    privies
			send     4
			pushi    #init
			pushi    0
			lofsa    build
			send     4
			pushi    #init
			pushi    0
			lofsa    maze
			send     4
			pushi    #init
			pushi    0
			lofsa    trees
			send     4
			pushi    #init
			pushi    0
			lofsa    town
			send     4
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			bnt      code_023c
			pushi    #doit
			pushi    0
			send     4
			jmp      code_0259
code_023c:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			sat      temp0
			bnt      code_0259
			pushi    #setScript
			pushi    1
			lofsa    walkOut
			push    
			self     6
code_0259:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    StdRoom,  4
			pushi    #script
			pushi    1
			pushi    0
			lag      global0
			send     6
			ret     
		)
	)
)

(instance arrived of Script
	(properties
		state $0000
	)
	
	(method (cue)
		(asm
			lsg      global12
			ldi      460
			ne?     
			bt       code_02d9
			lsg      global126
			ldi      6
			ne?     
			bt       code_02d9
			pToa     state
code_02d9:
			bnt      code_0310
			pushi    0
			callb    proc0_4,  0
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0308
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ldi      14
			sag      global145
			pushi    #south
			pushi    1
			pushi    170
			pushi    389
			pushi    1
			pushi    170
			lag      global2
			send     12
code_0308:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0320
code_0310:
			pushi    3
			pushi    1440
			pushi    7
			pushSelf
			calle    proc13_4,  6
			ldi      1
			aTop     state
code_0320:
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_039b
			pushi    0
			callb    proc0_3,  0
			pushi    289
			pushi    1
			pushi    #superClass
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      18
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      16
			add     
			push    
			pushSelf
			lag      global0
			send     18
			jmp      code_03b3
code_039b:
			dup     
			ldi      1
			eq?     
			bnt      code_03b3
			pushi    #newRoom
			pushi    1
			pushi    #south
			pushi    0
			lag      global2
			send     4
			push    
			lag      global2
			send     6
code_03b3:
			toss    
			ret     
		)
	)
)

(instance monkLeaves of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			bnt      code_041a
			pushi    #dispose
			pushi    0
			self     4
			pushi    #next
			pushi    1
			pushi    0
			lofsa    changeMusic
			send     6
			pushi    #setScript
			pushi    1
			lofsa    monkAtDoor
			push    
			lag      global2
			send     6
code_041a:
			ret     
		)
	)
)

(instance monkAtDoor of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04a4
			pushi    1
			pushi    94
			callb    proc0_6,  2
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    190
			pushi    129
			pushSelf
			lag      global0
			send     12
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    183
			pushi    126
			pushSelf
			lofsa    doorMonk
			send     22
			jmp      code_0501
code_04a4:
			dup     
			ldi      2
			eq?     
			bnt      code_04c0
			pushi    4
			lea      @local0
			push    
			pushi    10
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_0501
code_04c0:
			dup     
			ldi      3
			eq?     
			bnt      code_04ef
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    325
			pushi    164
			lofsa    doorMonk
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    175
			pushi    121
			pushSelf
			lag      global0
			send     12
			jmp      code_0501
code_04ef:
			dup     
			ldi      4
			eq?     
			bnt      code_0501
			pushi    #newRoom
			pushi    1
			pushi    450
			lag      global2
			send     6
code_0501:
			toss    
			ret     
		)
	)
)

(instance doKnock of Script
	(properties
		register 1
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0563
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    183
			pushi    126
			pushSelf
			lag      global0
			send     12
			jmp      code_05b7
code_0563:
			dup     
			ldi      1
			eq?     
			bnt      code_0576
			pushi    #play
			pushi    1
			pushSelf
			lofsa    knockSound
			send     6
			jmp      code_05b7
code_0576:
			dup     
			ldi      2
			eq?     
			bnt      code_0593
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    190
			pushi    129
			pushSelf
			lag      global0
			send     12
			jmp      code_05b7
code_0593:
			dup     
			ldi      3
			eq?     
			bnt      code_05ab
			pushi    2
			lsg      global0
			lofsa    fDoor
			push    
			callb    proc0_9,  4
			ldi      2
			aTop     seconds
			jmp      code_05b7
code_05ab:
			dup     
			ldi      4
			eq?     
			bnt      code_05b7
			pushi    #dispose
			pushi    0
			self     4
code_05b7:
			toss    
			ret     
		)
	)
)

(instance atDoor of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0620
			pushi    #setScript
			pushi    2
			lofsa    doKnock
			push    
			pushSelf
			self     8
			pTos     register
			ldi      8
			eq?     
			bt       code_0618
			pTos     register
			ldi      2
			eq?     
code_0618:
			bnt      code_0875
			ipToa    state
			jmp      code_0875
code_0620:
			dup     
			ldi      1
			eq?     
			bnt      code_0647
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    183
			pushi    126
			pushSelf
			lofsa    doorMonk
			send     22
			jmp      code_0875
code_0647:
			dup     
			ldi      2
			eq?     
			bnt      code_07b5
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_066c
			pushi    4
			lea      @local20
			push    
			pushi    10
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_07b1
code_066c:
			dup     
			ldi      1
			eq?     
			bnt      code_06a1
			pushi    4
			lea      @local5
			push    
			pushi    999
			pushi    10
			pushSelf
			calle    proc851_0,  8
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    doorMonk
			send     10
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_07b1
code_06a1:
			dup     
			ldi      2
			eq?     
			bnt      code_06be
			pushi    3
			pushi    1440
			pushi    58
			pushSelf
			calle    proc13_4,  6
			pTos     state
			ldi      3
			add     
			aTop     state
			jmp      code_07b1
code_06be:
			dup     
			ldi      3
			eq?     
			bnt      code_06da
			pushi    4
			lea      @local0
			push    
			pushi    10
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_07b1
code_06da:
			dup     
			ldi      4
			eq?     
			bnt      code_06f6
			pushi    4
			lea      @local10
			push    
			pushi    10
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_07b1
code_06f6:
			dup     
			ldi      5
			eq?     
			bnt      code_0729
			pushi    4
			lea      @local16
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    doorMonk
			send     10
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_07b1
code_0729:
			dup     
			ldi      6
			eq?     
			bnt      code_075c
			pushi    4
			lea      @local26
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    doorMonk
			send     10
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_07b1
code_075c:
			dup     
			ldi      7
			eq?     
			bnt      code_0791
			pushi    4
			lea      @local38
			push    
			pushi    10
			pushi    999
			pushSelf
			calle    proc851_0,  8
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    doorMonk
			send     10
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_07b1
code_0791:
			dup     
			ldi      8
			eq?     
			bnt      code_07b1
			pushi    4
			lea      @local30
			push    
			pushi    999
			pushi    10
			pushSelf
			calle    proc851_0,  8
			pTos     state
			ldi      3
			add     
			aTop     state
code_07b1:
			toss    
			jmp      code_0875
code_07b5:
			dup     
			ldi      3
			eq?     
			bnt      code_07fc
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    doorMonk
			send     10
			pushi    #moveSpeed
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lofsa    doorMonk
			send     4
			push    
			pushi    219
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lofsa    doorMonk
			send     4
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    175
			pushi    121
			pushSelf
			lag      global0
			send     24
			jmp      code_0875
code_07fc:
			dup     
			ldi      4
			eq?     
			bnt      code_0830
			pushi    377
			pushi    1
			lsg      global126
			ldi      2
			eq?     
			bt       code_081c
			lsg      global126
			ldi      3
			eq?     
			bt       code_081c
			lsg      global126
			ldi      6
			eq?     
code_081c:
			bnt      code_0825
			ldi      460
			jmp      code_0828
code_0825:
			ldi      450
code_0828:
			push    
			lag      global2
			send     6
			jmp      code_0875
code_0830:
			dup     
			ldi      5
			eq?     
			bnt      code_084d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    175
			pushi    121
			pushSelf
			lofsa    doorMonk
			send     12
			jmp      code_0875
code_084d:
			dup     
			ldi      6
			eq?     
			bnt      code_0875
			pushi    0
			callb    proc0_4,  0
			pTos     register
			ldi      8
			ne?     
			bnt      code_0870
			pTos     register
			ldi      2
			ne?     
			bnt      code_0870
			pushi    #dispose
			pushi    0
			lofsa    doorMonk
			send     4
code_0870:
			pushi    #dispose
			pushi    0
			self     4
code_0875:
			toss    
			ret     
		)
	)
)

(instance noAnswer of TScript
	(properties)
	
	(method (init param1 param2 param3 param4)
		(asm
			ldi      0
			aTop     start
			pushi    #init
			pushi    3
			lsp      param1
			lsp      param2
			lsp      param3
			super    TScript,  10
			lap      param4
			aTop     start
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
			bnt      code_08e2
			pushi    #setScript
			pushi    2
			lofsa    doKnock
			push    
			pushSelf
			self     8
			jmp      code_0917
code_08e2:
			dup     
			ldi      1
			eq?     
			bnt      code_0907
			ipToa    register
			push    
			pToa     start
			le?     
			bnt      code_08f4
			dpToa    state
code_08f4:
			pushi    3
			pushi    1440
			pTos     register
			ldi      1
			sub     
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_0917
code_0907:
			dup     
			ldi      2
			eq?     
			bnt      code_0917
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0917:
			toss    
			ret     
		)
	)
)

(instance getTheo of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0974
			pushi    #setScript
			pushi    2
			lofsa    doKnock
			push    
			pushSelf
			self     8
			jmp      code_0a90
code_0974:
			dup     
			ldi      1
			eq?     
			bnt      code_099b
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    183
			pushi    126
			pushSelf
			lofsa    doorMonk
			send     22
			jmp      code_0a90
code_099b:
			dup     
			ldi      2
			eq?     
			bnt      code_09b7
			pushi    4
			lea      @local47
			push    
			pushi    10
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a90
code_09b7:
			dup     
			ldi      3
			eq?     
			bnt      code_09d4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    175
			pushi    121
			pushSelf
			lofsa    doorMonk
			send     12
			jmp      code_0a90
code_09d4:
			dup     
			ldi      4
			eq?     
			bnt      code_09fe
			pushi    #script
			pushi    1
			pushSelf
			lofsa    doorMonk
			send     6
			pushi    #script
			pushi    1
			pushi    0
			pToa     client
			send     6
			lofsa    doorMonk
			aTop     client
			pushi    0
			callb    proc0_4,  0
			ldi      15
			aTop     seconds
			jmp      code_0a90
code_09fe:
			dup     
			ldi      5
			eq?     
			bnt      code_0a56
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #setMotion
			pushi    3
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
			lofsa    doorMonk
			send     10
			pushi    #distanceTo
			pushi    1
			lofsa    doorMonk
			push    
			lag      global0
			send     6
			push    
			ldi      4
			mul     
			push    
			ldi      60
			sub     
			aTop     ticks
			pTos     ticks
			ldi      200
			gt?     
			bnt      code_0a90
			ldi      200
			aTop     ticks
			jmp      code_0a90
code_0a56:
			dup     
			ldi      6
			eq?     
			bnt      code_0a7a
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    doorMonk
			send     6
			pushi    4
			lea      @local55
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a90
code_0a7a:
			dup     
			ldi      7
			eq?     
			bnt      code_0a90
			ldi      13
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0a90:
			toss    
			ret     
		)
	)
)

(instance doorMonk of Actor
	(properties
		x 176
		y 123
		yStep 1
		view 50
		signal $6000
		illegalBits $0000
		xStep 2
	)
)

(instance facade of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0b6a
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1440
			pushi    17
			pushi    19
			lag      global2
			send     14
			jmp      code_0b75
code_0b6a:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0b75:
			ret     
		)
	)
)

(instance fDoor of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0004
		approachX 191
		approachY 128
		lookStr 20
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			ne?     
			bnt      code_0bd0
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
			jmp      code_0e5a
code_0bd0:
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0c0c
			pushi    #state
			pushi    1
			pushi    3
			pushi    45
			pushi    1
			lsg      global2
			lofsa    monkAtDoor
			send     12
			pushi    #script
			pushi    1
			lofsa    monkAtDoor
			push    
			lag      global2
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    monkAtDoor
			push    
			lag      global0
			send     12
			jmp      code_0e59
code_0c0c:
			dup     
			ldi      1
			eq?     
			bnt      code_0c38
			pushi    142
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    #register
			pushi    0
			lofsa    atDoor
			send     4
			bnt      code_0c2e
			ldi      2
			jmp      code_0c30
code_0c2e:
			ldi      1
code_0c30:
			push    
			lag      global2
			send     10
			jmp      code_0e59
code_0c38:
			dup     
			ldi      4
			eq?     
			bnt      code_0ca6
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0c6b
			pushi    1
			pushi    89
			callb    proc0_5,  2
			not     
			bnt      code_0e59
			pushi    1
			pushi    89
			callb    proc0_6,  2
			pushi    #setScript
			pushi    4
			lofsa    noAnswer
			push    
			pushi    0
			pushi    9
			dup     
			lag      global2
			send     12
			jmp      code_0e59
code_0c6b:
			pushi    1
			pushi    90
			callb    proc0_5,  2
			bnt      code_0c88
			pushi    #setScript
			pushi    4
			lofsa    noAnswer
			push    
			pushi    0
			pushi    43
			dup     
			lag      global2
			send     12
			jmp      code_0e59
code_0c88:
			ldi      1
			bnt      code_0e59
			pushi    1
			pushi    90
			callb    proc0_6,  2
			pushi    #setScript
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    8
			lag      global2
			send     10
			jmp      code_0e59
code_0ca6:
			dup     
			ldi      5
			eq?     
			bnt      code_0d75
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0cca
			pushi    #setScript
			pushi    4
			lofsa    noAnswer
			push    
			pushi    0
			pushi    10
			pushi    11
			lag      global2
			send     12
			jmp      code_0e59
code_0cca:
			pushi    #script
			pushi    0
			lofsa    doorMonk
			send     4
			push    
			lofsa    getTheo
			eq?     
			bnt      code_0cea
			pushi    3
			pushi    1440
			pushi    57
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e59
code_0cea:
			lsg      global130
			ldi      5
			eq?     
			bt       code_0d01
			lsg      global130
			ldi      6
			eq?     
			bnt      code_0d01
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
code_0d01:
			not     
			bnt      code_0d14
			pushi    #setScript
			pushi    1
			lofsa    getTheo
			push    
			lag      global2
			send     6
			jmp      code_0e59
code_0d14:
			pushi    1
			pushi    94
			callb    proc0_5,  2
			bnt      code_0d50
			pushi    #state
			pushi    1
			pushi    3
			pushi    45
			pushi    1
			lsg      global2
			lofsa    monkAtDoor
			send     12
			pushi    #script
			pushi    1
			lofsa    monkAtDoor
			push    
			lag      global2
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    175
			pushi    121
			lofsa    monkAtDoor
			push    
			lag      global0
			send     12
			jmp      code_0e59
code_0d50:
			ldi      1
			bnt      code_0e59
			pushi    #dispose
			pushi    0
			lofsa    monkLeaves
			send     4
			pushi    #next
			pushi    1
			pushi    0
			lofsa    changeMusic
			send     6
			pushi    #setScript
			pushi    1
			lofsa    monkAtDoor
			push    
			lag      global2
			send     6
			jmp      code_0e59
code_0d75:
			dup     
			ldi      6
			eq?     
			bnt      code_0db1
			pushi    1
			pushi    93
			callb    proc0_5,  2
			bnt      code_0d98
			pushi    #setScript
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    5
			lag      global2
			send     10
			jmp      code_0e59
code_0d98:
			pushi    1
			pushi    93
			callb    proc0_6,  2
			pushi    #setScript
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    4
			lag      global2
			send     10
			jmp      code_0e59
code_0db1:
			pushi    1
			pushi    91
			callb    proc0_5,  2
			bnt      code_0dbf
			lsg      global126
			ldi      3
			eq?     
code_0dbf:
			bt       code_0dd0
			pushi    1
			pushi    92
			callb    proc0_5,  2
			bnt      code_0e09
			lsg      global126
			ldi      2
			eq?     
code_0dd0:
			bnt      code_0e09
			lsg      global126
			ldi      3
			eq?     
			bnt      code_0dea
			pushi    1
			pushi    92
			callb    proc0_6,  2
			pushi    1
			pushi    91
			callb    proc0_7,  2
			jmp      code_0df6
code_0dea:
			pushi    1
			pushi    91
			callb    proc0_6,  2
			pushi    1
			pushi    92
			callb    proc0_7,  2
code_0df6:
			pushi    #setScript
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    7
			lag      global2
			send     10
			jmp      code_0e59
code_0e09:
			pushi    1
			pushi    91
			callb    proc0_5,  2
			bt       code_0e18
			pushi    1
			pushi    92
			callb    proc0_5,  2
code_0e18:
			bnt      code_0e2e
			pushi    #setScript
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    6
			lag      global2
			send     10
			jmp      code_0e59
code_0e2e:
			ldi      1
			bnt      code_0e59
			lsg      global126
			ldi      3
			eq?     
			bnt      code_0e44
			pushi    1
			pushi    92
			callb    proc0_6,  2
			jmp      code_0e4a
code_0e44:
			pushi    1
			pushi    91
			callb    proc0_6,  2
code_0e4a:
			pushi    #setScript
			pushi    3
			lofsa    atDoor
			push    
			pushi    0
			pushi    0
			lag      global2
			send     10
code_0e59:
			toss    
code_0e5a:
			ret     
		)
	)
)

(instance entrance of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0008
		lookStr 21
	)
)

(instance maryTop of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0020
		lookStr 22
	)
)

(instance maryB of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0040
		lookStr 23
	)
)

(instance privies of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0080
		lookStr 24
	)
)

(instance build of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0100
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0fb0
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1440
			pushi    26
			pushi    27
			lag      global2
			send     14
			jmp      code_0fbb
code_0fb0:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0fbb:
			ret     
		)
	)
)

(instance maze of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0200
		lookStr 29
	)
)

(instance trees of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0400
		lookStr 31
	)
)

(instance town of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0800
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1098
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1440
			pushi    32
			pushi    33
			lag      global2
			send     14
			jmp      code_10a3
code_1098:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_10a3:
			ret     
		)
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 param4 param5)
		(asm
			pushi    0
			callb    proc0_3,  0
			lap      param4
			aTop     start
			pushi    #init
			pushi    3
			lsp      param1
			lsp      param2
			lsp      param3
			super    Script,  10
			lap      param5
			aTop     start
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			pToa     start
			le?     
			bnt      code_111b
			pushi    3
			pTos     register
			pTos     state
			pushSelf
			calle    proc13_4,  6
			jmp      code_1124
code_111b:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1124:
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			lap      param1
			not     
			bnt      code_112f
			pToa     state
			aTop     start
code_112f:
			pushi    #cue
			pushi    0
			super    Script,  4
			ret     
		)
	)
)

(instance noBig of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_11b3
			lsp      param2
			ldi      8
			eq?     
			bnt      code_11b3
			lsg      global126
			ldi      2
			eq?     
			bnt      code_11a3
			ldi      3
			sag      global126
			pushi    2
			pushi    1804
			pushi    22
			calle    proc13_4,  4
			jmp      code_11ae
code_11a3:
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lag      global65
			send     8
code_11ae:
			ldi      1
			jmp      code_11d1
code_11b3:
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_11d1
			lsp      param2
			ldi      1
			eq?     
			bnt      code_11d1
			pushi    3
			pushi    1005
			pushi    3
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_11d1:
			ret     
		)
	)
)

(instance changeMusic of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_124e
			lsg      global126
			ldi      5
			eq?     
			bnt      code_1239
			lsg      global130
			ldi      5
			eq?     
			bt       code_121d
			lsg      global130
			ldi      6
			eq?     
			bnt      code_1239
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
code_121d:
			bnt      code_1239
			pushi    1
			pushi    94
			callb    proc0_5,  2
			not     
			bnt      code_1239
			pushi    #setScript
			pushi    1
			lofsa    monkLeaves
			push    
			self     6
			lofsa    monkLeaves
			aTop     next
code_1239:
			pushi    #number
			pushi    1
			pushi    461
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			lag      global100
			send     18
			jmp      code_1288
code_124e:
			dup     
			ldi      1
			eq?     
			bnt      code_125c
			ldi      60
			aTop     ticks
			jmp      code_1288
code_125c:
			dup     
			ldi      2
			eq?     
			bnt      code_127c
			pushi    #number
			pushi    1
			pushi    455
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			ldi      1
			aTop     cycles
			jmp      code_1288
code_127c:
			dup     
			ldi      3
			eq?     
			bnt      code_1288
			pushi    #dispose
			pushi    0
			self     4
code_1288:
			toss    
			ret     
		)
	)
)

(instance knockSound of Sound
	(properties
		flags $0001
		number 933
	)
)
