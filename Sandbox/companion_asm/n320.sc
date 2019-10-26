;;; Sierra Script 1.0 - (do not remove this comment)
(script# 320)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n927)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm320 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	[local7 4] = [1320 0 1]
	[local11 4] = [1320 1 1]
	[local15 4] = [1320 3 1]
	[local19 5] = [1320 4 1 1]
	[local24 7] = [1320 6 2 1 2 1]
	[local31 5] = [1320 10 2 1]
	[local36 4] = [1320 12 1]
	[local40 9] = [327 0 3 4 15 31 12 21 21]
)
(procedure (localproc_000e)
	(asm
		lsg      global12
		ldi      330
		ne?     
		bnt      code_004d
		lsg      global125
		ldi      1
		eq?     
		bnt      code_004d
		pushi    1
		pushi    164
		callb    proc0_5,  2
		bnt      code_003e
		pushi    1
		pushi    10
		callb    proc0_6,  2
		pushi    #setScript
		pushi    1
		lofsa    beforeGoldenArrow
		push    
		lag      global0
		send     6
		jmp      code_008a
code_003e:
		pushi    3
		pushi    1320
		pushi    55
		pushi    1
		calle    proc13_4,  6
		jmp      code_008a
code_004d:
		pushi    1
		pushi    160
		callb    proc0_5,  2
		bnt      code_0066
		pushi    3
		pushi    1320
		pushi    55
		pushi    1
		calle    proc13_4,  6
		jmp      code_008a
code_0066:
		pushi    1
		pushi    164
		callb    proc0_5,  2
		bnt      code_007e
		pushi    #newRoom
		pushi    1
		pushi    330
		lag      global2
		send     6
		jmp      code_008a
code_007e:
		pushi    3
		pushi    1320
		pushi    55
		pushi    1
		calle    proc13_4,  6
code_008a:
		ret     
	)
)

(procedure (localproc_008b param1)
	(asm
		pushi    1
		pushi    19
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Roger}
		push    
		calle    proc13_4,  4
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_00a6 param1)
	(asm
		pushi    1
		pushi    19
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Giles}
		push    
		calle    proc13_4,  4
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_00c1 param1)
	(asm
		pushi    1
		pushi    19
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Jack}
		push    
		calle    proc13_4,  4
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_00dc)
	(asm
		pushi    2
		pushi    12
		pushi    16
		callk    Random,  4
		sal      local3
		pushi    2
		pushi    10
		pushi    16
		callk    Random,  4
		sal      local4
		pushi    2
		pushi    9
		pushi    14
		callk    Random,  4
		sal      local5
		pushi    #init
		pushi    0
		lofsa    leftFlag
		send     4
		pushi    #init
		pushi    0
		lofsa    middleFlag
		send     4
		pushi    #init
		pushi    0
		lofsa    rightFlag
		send     4
		pushi    2
		pushi    100
		pushi    300
		callk    Random,  4
		sal      local2
		ret     
	)
)

(procedure (localproc_011e)
	(asm
		pushi    #eachElementDo
		pushi    1
		pushi    105
		lag      global5
		send     6
		pushi    #drawPic
		pushi    1
		pushi    803
		lag      global2
		send     6
		ret     
	)
)

(procedure (localproc_0133)
	(asm
		pushi    #drawPic
		pushi    1
		pushi    320
		lag      global2
		send     6
		pushi    #loop
		pushi    1
		pushi    1
		pushi    284
		pushi    2
		pushi    125
		pushi    148
		lag      global0
		send     14
		pushi    #loop
		pushi    1
		pushi    3
		pushi    288
		pushi    1
		pushi    0
		pushi    284
		pushi    2
		pushi    99
		pushi    181
		lofsa    guard1Roger
		send     20
		pushi    #loop
		pushi    1
		pushi    3
		pushi    288
		pushi    1
		pushi    1
		pushi    284
		pushi    2
		pushi    136
		pushi    183
		lofsa    guard2Jack
		send     20
		pushi    #loop
		pushi    1
		pushi    3
		pushi    288
		pushi    1
		pushi    5
		pushi    284
		pushi    2
		pushi    209
		pushi    178
		lofsa    guard3Giles
		send     20
		pushi    #posn
		pushi    2
		pushi    165
		pushi    166
		lofsa    adamBell
		send     8
		pushi    #posn
		pushi    2
		pushi    302
		pushi    160
		lofsa    archer2
		send     8
		pushi    #eachElementDo
		pushi    1
		pushi    194
		lag      global5
		send     6
		ret     
	)
)

(instance rm320 of Rm
	(properties
		picture 320
		style $8002
		south 280
	)
	
	(method (init)
		(asm
			lsg      global12
			ldi      280
			eq?     
			bnt      code_01d0
			ldi      100
			aTop     style
code_01d0:
			pushi    #init
			pushi    0
			super    Rm,  4
			lsg      global12
			ldi      280
			eq?     
			bnt      code_01ef
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    8
			pushi    0
			lag      global100
			send     12
code_01ef:
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    0
			call     localproc_00dc,  0
			pushi    #init
			pushi    0
			lofsa    puckTarget
			send     4
			pushi    6
			lofsa    sheriffBox
			push    
			lofsa    ladiesBox
			push    
			lofsa    crowd1
			push    
			lofsa    crowd2
			push    
			lofsa    targetRight
			push    
			lofsa    targetLeft
			push    
			calle    proc806_3,  12
			lsg      global12
			ldi      330
			eq?     
			bnt      code_0389
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    16
			pushi    255
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    277
			pushi    189
			pushi    277
			pushi    177
			pushi    255
			pushi    177
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			lag      global2
			send     6
			pushi    #posn
			pushi    2
			pushi    165
			pushi    166
			pushi    107
			pushi    0
			lofsa    adamBell
			send     12
			pushi    #posn
			pushi    2
			pushi    302
			pushi    160
			pushi    107
			pushi    0
			lofsa    archer2
			send     12
			pushi    #loop
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    99
			pushi    181
			pushi    107
			pushi    0
			lofsa    guard1Roger
			send     30
			pushi    #loop
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    136
			pushi    183
			pushi    107
			pushi    0
			lofsa    guard2Jack
			send     30
			pushi    #loop
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    5
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    284
			pushi    2
			pushi    209
			pushi    178
			pushi    107
			pushi    0
			lofsa    guard3Giles
			send     30
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_0327
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    125
			pushi    148
			pushi    107
			pushi    0
			pushi    299
			pushi    1
			class    PAvoider
			push    
			lag      global0
			send     24
			jmp      code_0440
code_0327:
			pushi    1
			pushi    131
			callb    proc0_5,  2
			bnt      code_035b
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    260
			pushi    185
			pushi    107
			pushi    0
			pushi    301
			pushi    3
			pushi    2
			pushi    4
			pushi    16
			pushi    299
			pushi    1
			class    PAvoider
			push    
			lag      global0
			send     34
			jmp      code_0440
code_035b:
			ldi      43
			sag      global155
			pushi    #loop
			pushi    1
			pushi    7
			pushi    284
			pushi    2
			pushi    239
			pushi    170
			pushi    107
			pushi    0
			pushi    301
			pushi    3
			pushi    2
			pushi    4
			pushi    16
			pushi    299
			pushi    1
			class    PAvoider
			push    
			lag      global0
			send     34
			jmp      code_0440
code_0389:
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    249
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    277
			pushi    189
			pushi    277
			pushi    177
			pushi    248
			pushi    177
			pushi    248
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
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    265
			pushi    187
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    301
			pushi    3
			pushi    2
			pushi    4
			pushi    16
			lag      global0
			send     34
			lsg      global155
			ldi      42
			lt?     
			bnt      code_0413
			pushi    #init
			pushi    0
			lofsa    adamBell
			send     4
			pushi    #init
			pushi    0
			lofsa    archer2
			send     4
code_0413:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    guard1Roger
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    guard2Jack
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    guard3Giles
			send     10
code_0440:
			lsg      global155
			ldi      42
			gt?     
			bnt      code_046f
			lsg      global12
			ldi      330
			eq?     
			bnt      code_0460
			pushi    #setScript
			pushi    1
			lofsa    leaveInHuff
			push    
			lag      global0
			send     6
			jmp      code_057a
code_0460:
			pushi    #setScript
			pushi    1
			lofsa    tormentIsOver
			push    
			lag      global0
			send     6
			jmp      code_057a
code_046f:
			pushi    1
			pushi    160
			callb    proc0_5,  2
			bnt      code_0491
			lsg      global12
			ldi      330
			eq?     
			bnt      code_0491
			pushi    #setScript
			pushi    1
			lofsa    kickOutPoorPlay
			push    
			lag      global0
			send     6
			jmp      code_057a
code_0491:
			pushi    1
			pushi    131
			callb    proc0_5,  2
			bnt      code_04e1
			+ag      global148
			push    
			ldi      1
			eq?     
			bnt      code_04b3
			pushi    #setScript
			pushi    1
			lofsa    forceOutComeIn
			push    
			lag      global0
			send     6
			jmp      code_057a
code_04b3:
			lsg      global148
			ldi      2
			eq?     
			bnt      code_04ca
			pushi    #setScript
			pushi    1
			lofsa    afterToldMoveOut
			push    
			lag      global0
			send     6
			jmp      code_057a
code_04ca:
			lsg      global148
			ldi      3
			eq?     
			bnt      code_057a
			pushi    #setScript
			pushi    1
			lofsa    goToDeathMesg
			push    
			lag      global0
			send     6
			jmp      code_057a
code_04e1:
			pushi    31
			lag      global155
			lt?     
			bnt      code_04ff
			pprev   
			ldi      43
			lt?     
			bnt      code_04ff
			pushi    #setScript
			pushi    1
			lofsa    tormentHasStarted
			push    
			lag      global0
			send     6
			jmp      code_057a
code_04ff:
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_0517
			pushi    #setScript
			pushi    1
			lofsa    goldenArrowAward
			push    
			lag      global0
			send     6
			jmp      code_057a
code_0517:
			pushi    1
			pushi    130
			callb    proc0_5,  2
			bnt      code_0543
			lsg      global155
			ldi      31
			lt?     
			bnt      code_0543
			pushi    1
			pushi    164
			callb    proc0_5,  2
			not     
			bnt      code_0543
			pushi    #setScript
			pushi    1
			lofsa    returnBeforeStarted
			push    
			lag      global0
			send     6
			jmp      code_057a
code_0543:
			pushi    1
			pushi    58
			callb    proc0_5,  2
			not     
			bnt      code_055c
			pushi    #setScript
			pushi    1
			lofsa    stillHasScroll
			push    
			lag      global0
			send     6
			jmp      code_057a
code_055c:
			pushi    1
			pushi    130
			callb    proc0_5,  2
			not     
			bnt      code_057a
			pushi    1
			pushi    130
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    firstEntWithNoScrol
			push    
			lag      global0
			send     6
code_057a:
			ret     
		)
	)
	
	(method (doit)
		(asm
			-al      local2
			push    
			ldi      0
			eq?     
			bnt      code_05e9
			pushi    0
			call     localproc_00dc,  0
code_05e9:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_05f9
			ldi      0
			jmp      code_064a
code_05f9:
			pushi    1
			pushi    164
			callb    proc0_5,  2
			bnt      code_064a
			lsg      global155
			ldi      31
			lt?     
			bnt      code_064a
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      290
			gt?     
			bt       code_0626
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      185
			gt?     
code_0626:
			bnt      code_064a
			pushi    1
			pushi    131
			callb    proc0_5,  2
			not     
			bnt      code_064a
			lal      local0
			not     
			bnt      code_064a
			ldi      1
			sal      local0
			pushi    #setScript
			pushi    1
			lofsa    leaveAfterPaid
			push    
			lag      global0
			send     6
code_064a:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    1
			pushi    927
			callk    DisposeScript,  2
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
			ldi      2
			eq?     
			bnt      code_0593
			pushi    3
			pushi    1320
			pushi    65
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d9
code_0593:
			dup     
			ldi      3
			eq?     
			bnt      code_05a9
			pushi    3
			pushi    1320
			pushi    66
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d9
code_05a9:
			dup     
			ldi      4
			eq?     
			bnt      code_05bf
			pushi    3
			pushi    1320
			pushi    66
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d9
code_05bf:
			dup     
			ldi      10
			eq?     
			bnt      code_05ce
			pushi    0
			call     localproc_000e,  0
			jmp      code_05d9
code_05ce:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
code_05d9:
			toss    
			ret     
		)
	)
)

(instance sheriffBox of Feature
	(properties
		x 46
		y 76
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    0
			pushi    40
			pushi    68
			pushi    72
			pushi    66
			pushi    79
			pushi    40
			pushi    79
			pushi    69
			pushi    105
			pushi    66
			pushi    155
			pushi    0
			pushi    156
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
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
			bnt      code_0715
			pushi    3
			pushi    1320
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_072d
code_0715:
			dup     
			ldi      10
			eq?     
			bnt      code_0724
			pushi    0
			call     localproc_000e,  0
			jmp      code_072d
code_0724:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_072d:
			toss    
			ret     
		)
	)
)

(instance ladiesBox of Feature
	(properties
		x 300
		y 36
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    302
			pushi    36
			pushi    300
			pushi    46
			pushi    290
			pushi    55
			pushi    291
			pushi    68
			pushi    273
			pushi    66
			pushi    274
			pushi    90
			pushi    232
			pushi    80
			pushi    232
			pushi    54
			pushi    249
			pushi    35
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
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
			bnt      code_07ec
			pushi    3
			pushi    1320
			pushi    35
			pushi    1
			calle    proc13_4,  6
			jmp      code_0804
code_07ec:
			dup     
			ldi      10
			eq?     
			bnt      code_07fb
			pushi    0
			call     localproc_000e,  0
			jmp      code_0804
code_07fb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_0804:
			toss    
			ret     
		)
	)
)

(instance crowd1 of Feature
	(properties
		x 205
		y 46
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    198
			pushi    42
			pushi    211
			pushi    34
			pushi    225
			pushi    32
			pushi    240
			pushi    46
			pushi    231
			pushi    54
			pushi    232
			pushi    80
			pushi    164
			pushi    65
			pushi    165
			pushi    50
			pushi    189
			pushi    31
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
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
			bnt      code_08c2
			pushi    3
			pushi    1320
			pushi    36
			pushi    1
			calle    proc13_4,  6
			jmp      code_08da
code_08c2:
			dup     
			ldi      10
			eq?     
			bnt      code_08d1
			pushi    0
			call     localproc_000e,  0
			jmp      code_08da
code_08d1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_08da:
			toss    
			ret     
		)
	)
)

(instance crowd2 of Feature
	(properties
		x 295
		y 63
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    319
			pushi    50
			pushi    319
			pushi    96
			pushi    274
			pushi    88
			pushi    273
			pushi    66
			pushi    292
			pushi    66
			pushi    291
			pushi    55
			pushi    307
			pushi    37
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
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
			bnt      code_098e
			pushi    3
			pushi    1320
			pushi    36
			pushi    1
			calle    proc13_4,  6
			jmp      code_09a6
code_098e:
			dup     
			ldi      10
			eq?     
			bnt      code_099d
			pushi    0
			call     localproc_000e,  0
			jmp      code_09a6
code_099d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_09a6:
			toss    
			ret     
		)
	)
)

(instance targetLeft of Feature
	(properties
		x 65
		y 62
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    63
			pushi    64
			pushi    72
			pushi    64
			pushi    72
			pushi    71
			pushi    67
			pushi    71
			pushi    62
			pushi    70
			pushi    61
			pushi    66
			pushi    64
			dup     
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a52
			pushi    3
			pushi    1320
			pushi    33
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a6c
code_0a52:
			dup     
			ldi      10
			eq?     
			bnt      code_0a61
			pushi    0
			call     localproc_000e,  0
			jmp      code_0a6c
code_0a61:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0a6c:
			toss    
			ret     
		)
	)
)

(instance targetRight of Feature
	(properties
		x 137
		y 61
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    137
			pushi    61
			pushi    139
			pushi    63
			pushi    139
			pushi    68
			pushi    135
			pushi    69
			pushi    128
			pushi    68
			pushi    128
			pushi    64
			pushi    132
			pushi    61
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b20
			pushi    3
			pushi    1320
			pushi    33
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b3a
code_0b20:
			dup     
			ldi      10
			eq?     
			bnt      code_0b2f
			pushi    0
			call     localproc_000e,  0
			jmp      code_0b3a
code_0b2f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b3a:
			toss    
			ret     
		)
	)
)

(instance closeUpArrow of View
	(properties
		x 90
		y 83
		view 330
		loop 6
	)
)

(instance puckTarget of View
	(properties
		x 97
		y 68
		view 325
		loop 1
		signal $0001
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c0a
			pushi    3
			pushi    1320
			pushi    33
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c22
code_0c0a:
			dup     
			ldi      10
			eq?     
			bnt      code_0c19
			pushi    0
			call     localproc_000e,  0
			jmp      code_0c22
code_0c19:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    View,  6
code_0c22:
			toss    
			ret     
		)
	)
)

(instance adamBell of View
	(properties
		x 153
		y 180
		view 325
		loop 2
		signal $0001
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0ca0
			pushi    3
			pushi    1320
			pushi    30
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d37
code_0ca0:
			dup     
			ldi      5
			eq?     
			bnt      code_0ccf
			pushi    1
			pushi    164
			callb    proc0_5,  2
			bnt      code_0cc0
			pushi    #setScript
			pushi    1
			lofsa    talkAdamConv
			push    
			lag      global0
			send     6
			jmp      code_0d37
code_0cc0:
			pushi    3
			pushi    1320
			pushi    61
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d37
code_0ccf:
			dup     
			ldi      10
			eq?     
			bnt      code_0cde
			pushi    0
			call     localproc_000e,  0
			jmp      code_0d37
code_0cde:
			dup     
			ldi      4
			eq?     
			bnt      code_0d2c
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0d1d
			pushi    1
			pushi    164
			callb    proc0_5,  2
			bnt      code_0d0f
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #setScript
			pushi    1
			lofsa    moneyConv
			push    
			lag      global0
			send     6
			jmp      code_0d28
code_0d0f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
			jmp      code_0d28
code_0d1d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_0d28:
			toss    
			jmp      code_0d37
code_0d2c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_0d37:
			toss    
			ret     
		)
	)
)

(instance archer2 of View
	(properties
		x 303
		y 158
		view 325
		loop 2
		cel 1
		signal $0001
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0db6
			pushi    3
			pushi    1320
			pushi    31
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e71
code_0db6:
			dup     
			ldi      5
			eq?     
			bnt      code_0df7
			pushi    1
			pushi    164
			callb    proc0_5,  2
			bnt      code_0de8
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1320
			pushi    38
			pushi    80
			lofsa    {Archer}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0e71
code_0de8:
			pushi    3
			pushi    1320
			pushi    61
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e71
code_0df7:
			dup     
			ldi      10
			eq?     
			bnt      code_0e06
			pushi    0
			call     localproc_000e,  0
			jmp      code_0e71
code_0e06:
			dup     
			ldi      4
			eq?     
			bnt      code_0e66
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0e57
			pushi    1
			pushi    164
			callb    proc0_5,  2
			bnt      code_0e49
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1320
			pushi    51
			pushi    80
			lofsa    {Archer}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0e62
code_0e49:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
			jmp      code_0e62
code_0e57:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_0e62:
			toss    
			jmp      code_0e71
code_0e66:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_0e71:
			toss    
			ret     
		)
	)
)

(instance leftFlag of Prop
	(properties
		x 52
		y 56
		view 333
		priority 1
		signal $0010
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			lsl      local3
			self     12
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f06
			pushi    3
			pushi    1320
			pushi    56
			pushi    1
			calle    proc13_4,  6
			jmp      code_0f0f
code_0f06:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_0f0f:
			toss    
			ret     
		)
	)
)

(instance middleFlag of Prop
	(properties
		x 203
		y 29
		lookStr 9360
		view 333
		loop 1
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			lsl      local4
			self     12
			ret     
		)
	)
)

(instance rightFlag of Prop
	(properties
		x 272
		y 30
		lookStr 9360
		view 333
		loop 2
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			lsl      local5
			self     12
			ret     
		)
	)
)

(instance guard1Roger of Actor
	(properties
		x 240
		y 185
		view 750
		signal $0001
	)
	
	(method (doVerb theVerb param2 &tmp temp0)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_10a6
			pushi    3
			pushi    1320
			pushi    32
			pushi    1
			calle    proc13_4,  6
			jmp      code_120d
code_10a6:
			dup     
			ldi      3
			eq?     
			bnt      code_10d5
			lal      local6
			not     
			bnt      code_10c6
			ldi      1
			sal      local6
			pushi    3
			pushi    1320
			pushi    39
			pushi    1
			call     localproc_008b,  6
			jmp      code_120d
code_10c6:
			pushi    3
			pushi    1320
			pushi    62
			pushi    1
			call     localproc_008b,  6
			jmp      code_120d
code_10d5:
			dup     
			ldi      4
			eq?     
			bnt      code_11a3
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_118c
			pushi    1
			pushi    58
			callb    proc0_5,  2
			bnt      code_117d
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			sat      temp0
			push    
			ldi      0
			eq?     
			bnt      code_1101
			jmp      code_119f
code_1101:
			pushi    1
			pushi    164
			callb    proc0_5,  2
			bnt      code_111a
			pushi    3
			pushi    1320
			pushi    46
			pushSelf
			call     localproc_008b,  6
			jmp      code_119f
code_111a:
			lst      temp0
			ldi      4
			eq?     
			bnt      code_113e
			pushi    1
			pushi    164
			callb    proc0_6,  2
			pushi    #ignoreControl
			pushi    1
			pushi    4
			pushi    142
			pushi    1
			lofsa    letPuckGoIn
			push    
			lag      global0
			send     12
			jmp      code_119f
code_113e:
			lst      temp0
			ldi      4
			gt?     
			bnt      code_116e
			pushi    3
			pushi    1320
			pushi    46
			pushSelf
			call     localproc_008b,  6
			pushi    1
			pushi    164
			callb    proc0_6,  2
			pushi    #ignoreControl
			pushi    1
			pushi    4
			pushi    142
			pushi    1
			lofsa    letPuckGoIn
			push    
			lag      global0
			send     12
			jmp      code_119f
code_116e:
			pushi    3
			pushi    1320
			pushi    44
			pushSelf
			call     localproc_008b,  6
			jmp      code_119f
code_117d:
			pushi    3
			pushi    1320
			pushi    43
			pushSelf
			call     localproc_008b,  6
			jmp      code_119f
code_118c:
			dup     
			ldi      17
			eq?     
			bnt      code_119f
			pushi    3
			pushi    1320
			pushi    52
			pushSelf
			call     localproc_008b,  6
code_119f:
			toss    
			jmp      code_120d
code_11a3:
			dup     
			ldi      5
			eq?     
			bnt      code_11f5
			pushi    1
			pushi    58
			callb    proc0_5,  2
			not     
			bnt      code_11c3
			pushi    3
			pushi    1320
			pushi    40
			pushSelf
			call     localproc_008b,  6
			jmp      code_120d
code_11c3:
			pushi    1
			pushi    164
			callb    proc0_5,  2
			not     
			bnt      code_11e6
			pushi    1
			pushi    58
			callb    proc0_5,  2
			bnt      code_11e6
			pushi    3
			pushi    1320
			pushi    41
			pushSelf
			call     localproc_008b,  6
			jmp      code_120d
code_11e6:
			pushi    3
			pushi    1320
			pushi    42
			pushSelf
			call     localproc_008b,  6
			jmp      code_120d
code_11f5:
			dup     
			ldi      10
			eq?     
			bnt      code_1204
			pushi    0
			call     localproc_000e,  0
			jmp      code_120d
code_1204:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_120d:
			toss    
			ret     
		)
	)
)

(instance guard2Jack of Actor
	(properties
		x 285
		y 185
		view 750
		loop 2
		cel 1
		signal $0001
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_12ae
			pushi    3
			pushi    1320
			pushi    32
			pushi    1
			calle    proc13_4,  6
			jmp      code_139a
code_12ae:
			dup     
			ldi      3
			eq?     
			bnt      code_12c4
			pushi    3
			pushi    1320
			pushi    64
			pushSelf
			call     localproc_00c1,  6
			jmp      code_139a
code_12c4:
			dup     
			ldi      5
			eq?     
			bnt      code_1316
			pushi    1
			pushi    58
			callb    proc0_5,  2
			not     
			bnt      code_12e4
			pushi    3
			pushi    1320
			pushi    40
			pushSelf
			call     localproc_00c1,  6
			jmp      code_139a
code_12e4:
			pushi    1
			pushi    164
			callb    proc0_5,  2
			not     
			bnt      code_1307
			pushi    1
			pushi    58
			callb    proc0_5,  2
			bnt      code_1307
			pushi    3
			pushi    1320
			pushi    41
			pushSelf
			call     localproc_00c1,  6
			jmp      code_139a
code_1307:
			pushi    3
			pushi    1320
			pushi    42
			pushSelf
			call     localproc_00c1,  6
			jmp      code_139a
code_1316:
			dup     
			ldi      10
			eq?     
			bnt      code_1325
			pushi    0
			call     localproc_000e,  0
			jmp      code_139a
code_1325:
			dup     
			ldi      4
			eq?     
			bnt      code_1391
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_137a
			pushi    1
			pushi    164
			callb    proc0_5,  2
			not     
			bnt      code_134f
			pushi    3
			pushi    1320
			pushi    47
			pushSelf
			call     localproc_00c1,  6
			jmp      code_138d
code_134f:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_136c
			pushi    3
			pushi    1320
			pushi    59
			pushSelf
			call     localproc_00c1,  6
			jmp      code_138d
code_136c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_138d
code_137a:
			dup     
			ldi      17
			eq?     
			bnt      code_138d
			pushi    3
			pushi    1320
			pushi    54
			pushSelf
			call     localproc_00c1,  6
code_138d:
			toss    
			jmp      code_139a
code_1391:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_139a:
			toss    
			ret     
		)
	)
)

(instance guard3Giles of Actor
	(properties
		x 256
		y 175
		view 750
		loop 2
		signal $0001
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_143a
			pushi    3
			pushi    1320
			pushi    32
			pushi    1
			calle    proc13_4,  6
			jmp      code_1526
code_143a:
			dup     
			ldi      3
			eq?     
			bnt      code_1450
			pushi    3
			pushi    1320
			pushi    63
			pushSelf
			call     localproc_00a6,  6
			jmp      code_1526
code_1450:
			dup     
			ldi      4
			eq?     
			bnt      code_14bc
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_14a5
			pushi    1
			pushi    164
			callb    proc0_5,  2
			not     
			bnt      code_147a
			pushi    3
			pushi    1320
			pushi    47
			pushSelf
			call     localproc_00a6,  6
			jmp      code_14b8
code_147a:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_1497
			pushi    3
			pushi    1320
			pushi    48
			pushSelf
			call     localproc_00a6,  6
			jmp      code_14b8
code_1497:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_14b8
code_14a5:
			dup     
			ldi      17
			eq?     
			bnt      code_14b8
			pushi    3
			pushi    1320
			pushi    53
			pushSelf
			call     localproc_00a6,  6
code_14b8:
			toss    
			jmp      code_1526
code_14bc:
			dup     
			ldi      5
			eq?     
			bnt      code_150e
			pushi    1
			pushi    58
			callb    proc0_5,  2
			not     
			bnt      code_14dc
			pushi    3
			pushi    1320
			pushi    40
			pushSelf
			call     localproc_00a6,  6
			jmp      code_1526
code_14dc:
			pushi    1
			pushi    164
			callb    proc0_5,  2
			not     
			bnt      code_14ff
			pushi    1
			pushi    58
			callb    proc0_5,  2
			bnt      code_14ff
			pushi    3
			pushi    1320
			pushi    41
			pushSelf
			call     localproc_00a6,  6
			jmp      code_1526
code_14ff:
			pushi    3
			pushi    1320
			pushi    42
			pushSelf
			call     localproc_00a6,  6
			jmp      code_1526
code_150e:
			dup     
			ldi      10
			eq?     
			bnt      code_151d
			pushi    0
			call     localproc_000e,  0
			jmp      code_1526
code_151d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_1526:
			toss    
			ret     
		)
	)
)

(instance leaveInHuff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_15cd
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1320
			pushi    60
			pushSelf
			calle    proc13_4,  6
			jmp      code_1600
code_15cd:
			dup     
			ldi      1
			eq?     
			bnt      code_15ee
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    325
			pushi    180
			pushSelf
			lag      global0
			send     12
			jmp      code_1600
code_15ee:
			dup     
			ldi      2
			eq?     
			bnt      code_1600
			pushi    #newRoom
			pushi    1
			pushi    280
			lag      global2
			send     6
code_1600:
			toss    
			ret     
		)
	)
)

(instance stillHasScroll of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1657
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_16ae
code_1657:
			dup     
			ldi      1
			eq?     
			bnt      code_1672
			pushi    5
			pushi    1
			lea      @local7
			push    
			pushi    6
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_16ae
code_1672:
			dup     
			ldi      2
			eq?     
			bnt      code_1688
			pushi    3
			pushi    1320
			pushi    13
			pushSelf
			call     localproc_008b,  6
			jmp      code_16ae
code_1688:
			dup     
			ldi      3
			eq?     
			bnt      code_169e
			pushi    3
			pushi    1320
			pushi    14
			pushSelf
			call     localproc_008b,  6
			jmp      code_16ae
code_169e:
			dup     
			ldi      4
			eq?     
			bnt      code_16ae
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_16ae:
			toss    
			ret     
		)
	)
)

(instance firstEntWithNoScrol of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1705
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_175c
code_1705:
			dup     
			ldi      1
			eq?     
			bnt      code_171b
			pushi    3
			pushi    1320
			pushi    15
			pushSelf
			call     localproc_008b,  6
			jmp      code_175c
code_171b:
			dup     
			ldi      2
			eq?     
			bnt      code_1736
			pushi    5
			pushi    1
			lea      @local11
			push    
			pushi    6
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_175c
code_1736:
			dup     
			ldi      3
			eq?     
			bnt      code_174c
			pushi    3
			pushi    1320
			pushi    16
			pushSelf
			call     localproc_008b,  6
			jmp      code_175c
code_174c:
			dup     
			ldi      4
			eq?     
			bnt      code_175c
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_175c:
			toss    
			ret     
		)
	)
)

(instance returnBeforeStarted of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17b3
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_17ef
code_17b3:
			dup     
			ldi      1
			eq?     
			bnt      code_17c9
			pushi    3
			pushi    1320
			pushi    17
			pushSelf
			call     localproc_008b,  6
			jmp      code_17ef
code_17c9:
			dup     
			ldi      2
			eq?     
			bnt      code_17df
			pushi    3
			pushi    1320
			pushi    18
			pushSelf
			call     localproc_008b,  6
			jmp      code_17ef
code_17df:
			dup     
			ldi      3
			eq?     
			bnt      code_17ef
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_17ef:
			toss    
			ret     
		)
	)
)

(instance takeHimOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_187a
			pushi    0
			callb    proc0_3,  0
			lsg      global148
			dup     
			ldi      2
			eq?     
			bnt      code_1854
			pushi    3
			pushi    1320
			pushi    24
			pushSelf
			call     localproc_008b,  6
			jmp      code_1876
code_1854:
			dup     
			ldi      3
			eq?     
			bnt      code_186a
			pushi    #setScript
			pushi    1
			lofsa    goToDeathMesg
			push    
			lag      global0
			send     6
			jmp      code_1876
code_186a:
			pushi    3
			pushi    1320
			pushi    20
			pushSelf
			call     localproc_008b,  6
code_1876:
			toss    
			jmp      code_18ed
code_187a:
			dup     
			ldi      1
			eq?     
			bnt      code_18db
			pushi    1
			pushi    131
			callb    proc0_6,  2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    200
			pushSelf
			lag      global0
			send     12
			pushi    283
			pushi    #y
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    200
			lofsa    guard1Roger
			send     10
			pushi    283
			pushi    #y
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    200
			lofsa    guard2Jack
			send     10
			jmp      code_18ed
code_18db:
			dup     
			ldi      2
			eq?     
			bnt      code_18ed
			pushi    #newRoom
			pushi    1
			pushi    280
			lag      global2
			send     6
code_18ed:
			toss    
			ret     
		)
	)
)

(instance afterToldMoveOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1945
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_1958
code_1945:
			dup     
			ldi      1
			eq?     
			bnt      code_1958
			pushi    #setScript
			pushi    1
			lofsa    takeHimOut
			push    
			pToa     client
			send     6
code_1958:
			toss    
			ret     
		)
	)
)

(instance goToDeathMesg of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19b3
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1320
			pushi    25
			pushSelf
			call     localproc_008b,  6
			jmp      code_1a51
code_19b3:
			dup     
			ldi      1
			eq?     
			bnt      code_19e3
			pushi    283
			pushi    4
			class    MoveTo
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
			ldi      10
			add     
			push    
			pushSelf
			lofsa    guard1Roger
			send     12
			jmp      code_1a51
code_19e3:
			dup     
			ldi      2
			eq?     
			bnt      code_19f9
			pushi    3
			lofsa    guard1Roger
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1a51
code_19f9:
			dup     
			ldi      3
			eq?     
			bnt      code_1a0f
			pushi    3
			pushi    1320
			pushi    26
			pushSelf
			call     localproc_00a6,  6
			jmp      code_1a51
code_1a0f:
			dup     
			ldi      4
			eq?     
			bnt      code_1a25
			pushi    3
			pushi    1320
			pushi    27
			pushSelf
			call     localproc_00c1,  6
			jmp      code_1a51
code_1a25:
			dup     
			ldi      5
			eq?     
			bnt      code_1a3b
			pushi    3
			pushi    1320
			pushi    28
			pushSelf
			call     localproc_008b,  6
			jmp      code_1a51
code_1a3b:
			dup     
			ldi      6
			eq?     
			bnt      code_1a51
			ldi      34
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_1a51:
			toss    
			ret     
		)
	)
)

(instance goldenArrowAward of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1aab
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local1
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1b82
code_1aab:
			dup     
			ldi      1
			eq?     
			bnt      code_1abe
			pushi    0
			call     localproc_0133,  0
			ldi      6
			aTop     ticks
			jmp      code_1b82
code_1abe:
			dup     
			ldi      2
			eq?     
			bnt      code_1ada
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    90
			pushi    128
			pushSelf
			lag      global0
			send     12
			jmp      code_1b82
code_1ada:
			dup     
			ldi      3
			eq?     
			bnt      code_1af8
			pushi    7
			pushi    2
			lea      @local24
			push    
			pushi    6
			pushi    0
			pushi    12
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b82
code_1af8:
			dup     
			ldi      4
			eq?     
			bnt      code_1b13
			pushi    #setPri
			pushi    1
			pushi    15
			pushi    107
			pushi    0
			lofsa    closeUpArrow
			send     10
			ldi      3
			aTop     cycles
			jmp      code_1b82
code_1b13:
			dup     
			ldi      5
			eq?     
			bnt      code_1b31
			pushi    7
			pushi    2
			lea      @local31
			push    
			pushi    6
			pushi    0
			pushi    12
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b82
code_1b31:
			dup     
			ldi      6
			eq?     
			bnt      code_1b56
			pushi    1
			pushi    10000
			calle    proc806_4,  2
			pushi    #hide
			pushi    0
			lofsa    closeUpArrow
			send     4
			pushi    0
			call     localproc_011e,  0
			ldi      6
			aTop     ticks
			jmp      code_1b82
code_1b56:
			dup     
			ldi      7
			eq?     
			bnt      code_1b82
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_1b82:
			toss    
			ret     
		)
	)
)

(instance moneyConv of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1bf0
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    5
			pushi    1320
			pushi    49
			pushSelf
			pushi    80
			lofsa    {Adam Bell}
			push    
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1c44
code_1bf0:
			dup     
			ldi      1
			eq?     
			bnt      code_1c0b
			pushi    5
			pushi    1
			lea      @local36
			push    
			pushi    6
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c44
code_1c0b:
			dup     
			ldi      2
			eq?     
			bnt      code_1c34
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    5
			pushi    1320
			pushi    50
			pushSelf
			pushi    80
			lofsa    {Adam Bell}
			push    
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_1c44
code_1c34:
			dup     
			ldi      3
			eq?     
			bnt      code_1c44
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1c44:
			toss    
			ret     
		)
	)
)

(instance letPuckGoIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ccd
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    275
			pushi    166
			lofsa    guard3Giles
			send     10
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    170
			pushi    173
			lofsa    guard1Roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    200
			pushi    168
			pushSelf
			lofsa    guard2Jack
			send     12
			jmp      code_1dd2
code_1ccd:
			dup     
			ldi      1
			eq?     
			bnt      code_1d0e
			pushi    #ignoreControl
			pushi    1
			pushi    4
			lag      global0
			send     6
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_1cf6
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_1cf6:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    3
			pushi    1320
			pushi    45
			pushSelf
			call     localproc_008b,  6
			jmp      code_1dd2
code_1d0e:
			dup     
			ldi      2
			eq?     
			bnt      code_1d6c
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    guard3Giles
			send     4
			push    
			ldi      16385
			or      
			push    
			lofsa    guard3Giles
			send     6
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    guard1Roger
			send     4
			push    
			ldi      1
			or      
			push    
			lofsa    guard1Roger
			send     6
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    guard2Jack
			send     4
			push    
			ldi      16385
			or      
			push    
			lofsa    guard2Jack
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    252
			pushi    173
			pushSelf
			lag      global0
			send     12
			jmp      code_1dd2
code_1d6c:
			dup     
			ldi      3
			eq?     
			bnt      code_1dc2
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    14
			pushi    319
			pushi    189
			pushi    264
			pushi    172
			pushi    242
			pushi    157
			pushi    221
			pushi    155
			pushi    218
			pushi    168
			pushi    199
			pushi    174
			pushi    183
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			push    
			lag      global2
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1dd2
code_1dc2:
			dup     
			ldi      4
			eq?     
			bnt      code_1dd2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1dd2:
			toss    
			ret     
		)
	)
)

(instance kickOutPoorPlay of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1e34
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    131
			callb    proc0_6,  2
			pushi    3
			pushi    1320
			pushi    57
			pushSelf
			call     localproc_008b,  6
			jmp      code_1e93
code_1e34:
			dup     
			ldi      1
			eq?     
			bnt      code_1e51
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    280
			pushi    178
			pushSelf
			lag      global0
			send     12
			jmp      code_1e93
code_1e51:
			dup     
			ldi      2
			eq?     
			bnt      code_1e81
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    319
			pushi    179
			lag      global0
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    295
			pushi    178
			pushSelf
			lofsa    guard3Giles
			send     12
			jmp      code_1e93
code_1e81:
			dup     
			ldi      3
			eq?     
			bnt      code_1e93
			pushi    #newRoom
			pushi    1
			pushi    280
			lag      global2
			send     6
code_1e93:
			toss    
			ret     
		)
	)
)

(instance forceOutComeIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1eeb
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_1f23
code_1eeb:
			dup     
			ldi      1
			eq?     
			bnt      code_1f01
			pushi    3
			pushi    1320
			pushi    23
			pushSelf
			call     localproc_008b,  6
			jmp      code_1f23
code_1f01:
			dup     
			ldi      2
			eq?     
			bnt      code_1f10
			ldi      300
			aTop     ticks
			jmp      code_1f23
code_1f10:
			dup     
			ldi      3
			eq?     
			bnt      code_1f23
			pushi    #setScript
			pushi    1
			lofsa    takeHimOut
			push    
			pToa     client
			send     6
code_1f23:
			toss    
			ret     
		)
	)
)

(instance tormentHasStarted of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f7b
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_1fb7
code_1f7b:
			dup     
			ldi      1
			eq?     
			bnt      code_1f91
			pushi    3
			pushi    1320
			pushi    19
			pushSelf
			call     localproc_008b,  6
			jmp      code_1fb7
code_1f91:
			dup     
			ldi      2
			eq?     
			bnt      code_1fa4
			pushi    0
			callb    proc0_4,  0
			ldi      300
			aTop     ticks
			jmp      code_1fb7
code_1fa4:
			dup     
			ldi      3
			eq?     
			bnt      code_1fb7
			pushi    #setScript
			pushi    1
			lofsa    takeHimOut
			push    
			pToa     client
			send     6
code_1fb7:
			toss    
			ret     
		)
	)
)

(instance tormentIsOver of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_200f
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      24
			aTop     ticks
			jmp      code_2057
code_200f:
			dup     
			ldi      1
			eq?     
			bnt      code_2025
			pushi    3
			pushi    1320
			pushi    29
			pushSelf
			call     localproc_008b,  6
			jmp      code_2057
code_2025:
			dup     
			ldi      2
			eq?     
			bnt      code_2047
			pushi    #setMotion
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
			send     12
			jmp      code_2057
code_2047:
			dup     
			ldi      3
			eq?     
			bnt      code_2057
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2057:
			toss    
			ret     
		)
	)
)

(instance tooLateToComeIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20ba
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    234
			pushi    181
			pushSelf
			lag      global0
			send     12
			jmp      code_2164
code_20ba:
			dup     
			ldi      1
			eq?     
			bnt      code_20fe
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    210
			pushi    175
			lofsa    guard2Jack
			send     10
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    243
			pushi    171
			lofsa    guard3Giles
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    199
			pushi    182
			pushSelf
			lofsa    guard1Roger
			send     12
			jmp      code_2164
code_20fe:
			dup     
			ldi      2
			eq?     
			bnt      code_2111
			pushi    0
			call     localproc_011e,  0
			ldi      5
			aTop     cycles
			jmp      code_2164
code_2111:
			dup     
			ldi      3
			eq?     
			bnt      code_212d
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      10
			aTop     cycles
			jmp      code_2164
code_212d:
			dup     
			ldi      4
			eq?     
			bnt      code_214e
			pushi    5
			pushi    1320
			pushi    58
			pushi    67
			pushi    60
			pushi    50
			calle    proc13_4,  10
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2164
code_214e:
			dup     
			ldi      5
			eq?     
			bnt      code_2164
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_2164:
			toss    
			ret     
		)
	)
)

(instance leaveAfterPaid of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_21d2
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    131
			callb    proc0_6,  2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    265
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2230
code_21d2:
			dup     
			ldi      1
			eq?     
			bnt      code_21f4
			pushi    2
			lsg      global0
			lofsa    guard1Roger
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    guard1Roger
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_2230
code_21f4:
			dup     
			ldi      2
			eq?     
			bnt      code_220a
			pushi    3
			pushi    1320
			pushi    21
			pushSelf
			call     localproc_008b,  6
			jmp      code_2230
code_220a:
			dup     
			ldi      3
			eq?     
			bnt      code_2220
			pushi    3
			pushi    1320
			pushi    22
			pushSelf
			call     localproc_008b,  6
			jmp      code_2230
code_2220:
			dup     
			ldi      4
			eq?     
			bnt      code_2230
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2230:
			toss    
			ret     
		)
	)
)

(instance talkAdamConv of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_22a2
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    21
			calle    proc13_6,  2
			pushi    4
			pushi    1320
			pushi    2
			pushi    80
			lofsa    {Adam Bell}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #cue
			pushi    0
			self     4
			jmp      code_22cc
code_22a2:
			dup     
			ldi      1
			eq?     
			bnt      code_22bc
			pushi    4
			lea      @local15
			push    
			pushi    6
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_22cc
code_22bc:
			dup     
			ldi      2
			eq?     
			bnt      code_22cc
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_22cc:
			toss    
			ret     
		)
	)
)

(instance beforeGoldenArrow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2324
			pushi    0
			callb    proc0_3,  0
			pushi    0
			call     localproc_011e,  0
			ldi      5
			aTop     seconds
			jmp      code_2354
code_2324:
			dup     
			ldi      1
			eq?     
			bnt      code_2341
			pushi    5
			pushi    1
			lea      @local19
			push    
			lea      @local40
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2354
code_2341:
			dup     
			ldi      2
			eq?     
			bnt      code_2354
			pushi    #setScript
			pushi    1
			lofsa    goldenArrowAward
			push    
			lag      global0
			send     6
code_2354:
			toss    
			ret     
		)
	)
)

(instance sExitEast of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23b7
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    335
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_23c9
code_23b7:
			dup     
			ldi      1
			eq?     
			bnt      code_23c9
			pushi    #newRoom
			pushi    1
			pushi    280
			lag      global2
			send     6
code_23c9:
			toss    
			ret     
		)
	)
)
