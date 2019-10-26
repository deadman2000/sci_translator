;;; Sierra Script 1.0 - (do not remove this comment)
(script# 550)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n852)
(use n946)
(use n950)
(use n969)
(use n977)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm550 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 3] = [-1 7174 11]
	[local12 3] = [-1 7178 13]
	local15
	[local16 4] = [1550 59 1]
	[local20 5] = [1550 60 1 1]
	[local25 4] = [1550 0 1]
	[local29 9] = [1550 1 2 2 1 2 1 3]
	[local38 8] = [1550 7 1 1 1 1 1]
	[local46 5] = [1550 12 1 1]
	[local51 7] = [1550 19 2 2 2 1]
	[local58 5] = [1550 23 1 2]
	[local63 5] = [1550 25 1 1]
	[local68 4] = [1550 27 1]
	[local72 4] = [1550 42 1]
	[local76 4] = [1550 56 1]
	[local80 4] = [1550 68 1]
	[local84 4] = [1550 14 1]
	[local88 7] = [1550 15 1 1 1 1]
	[local95 5] = [93 129 40 84 -32768]
)
(instance rm550 of Rm
	(properties
		picture 550
		north 530
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_3,  0
			pushi    142
			pushi    1
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_002f
			lofsa    resc
			jmp      code_0041
code_002f:
			lsg      global12
			ldi      530
			eq?     
			bnt      code_003e
			lofsa    gateIn
			jmp      code_0041
code_003e:
			lofsa    barrelIn
code_0041:
			push    
			self     6
			pushi    #init
			pushi    0
			lag      global0
			send     4
			pushi    #init
			pushi    0
			lofsa    sDoor
			send     4
			lsg      global130
			ldi      10
			eq?     
			bnt      code_006c
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    gate
			send     10
			jmp      code_007c
code_006c:
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    3
			lofsa    gate
			send     12
code_007c:
			pTos     script
			lofsa    resc
			ne?     
			bnt      code_0093
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    tap4
			send     10
code_0093:
			pushi    3
			lofsa    tap3
			push    
			lofsa    tap5
			push    
			lofsa    tap6
			push    
			calle    proc806_2,  6
			pushi    #approachVerbs
			pushi    1
			pushi    3
			lofsa    tap3
			send     6
			pushi    #approachVerbs
			pushi    1
			pushi    3
			lofsa    tap5
			send     6
			pushi    #approachVerbs
			pushi    1
			pushi    3
			lofsa    tap6
			send     6
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk1
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk2
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk3
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk4
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk5
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk6
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk7
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk8
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    csk9
			send     10
			pushi    #init
			pushi    0
			lofsa    base
			send     4
			pushi    #init
			pushi    0
			lofsa    sacks
			send     4
			pushi    #init
			pushi    0
			lofsa    walls
			send     4
			pushi    #init
			pushi    0
			lofsa    floor
			send     4
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    38
			pushi    58
			pushi    118
			pushi    26
			pushi    118
			pushi    25
			pushi    124
			pushi    76
			pushi    124
			pushi    89
			pushi    134
			pushi    91
			pushi    151
			pushi    55
			pushi    151
			pushi    105
			pushi    154
			pushi    108
			pushi    171
			pushi    185
			pushi    187
			pushi    273
			pushi    187
			pushi    185
			pushi    109
			pushi    227
			pushi    102
			pushi    224
			pushi    98
			pushi    147
			pushi    105
			pushi    140
			pushi    116
			pushi    101
			pushi    123
			pushi    80
			pushi    106
			pushi    58
			pushi    106
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     90
			push    
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      10
			eq?     
			bnt      code_01f3
			pushi    3
			pushi    1550
			pushi    66
			pushi    1
			calle    proc13_4,  6
code_01f3:
			ret     
		)
	)
)

(instance sDoor of Prop
	(properties
		x 215
		y 102
		view 550
		loop 1
		priority 9
		signal $6911
		cycleSpeed 18
	)
	
	(method (onMe)
		(asm
			ldi      0
			ret     
		)
	)
)

(instance gate of Prop
	(properties
		x 84
		y 101
		approachX 65
		approachY 106
		view 550
		loop 2
		signal $6901
		cycleSpeed 7
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_02d8
			pToa     cel
			bnt      code_02cb
			pushi    2
			pushi    1550
			pushi    38
			calle    proc13_4,  4
			jmp      code_0333
code_02cb:
			pushi    2
			pushi    1550
			pushi    39
			calle    proc13_4,  4
			jmp      code_0333
code_02d8:
			dup     
			ldi      3
			eq?     
			bnt      code_02fe
			pToa     cel
			bnt      code_02f1
			pushi    2
			pushi    1550
			pushi    40
			calle    proc13_4,  4
			jmp      code_0333
code_02f1:
			pushi    2
			pushi    1550
			pushi    41
			calle    proc13_4,  4
			jmp      code_0333
code_02fe:
			dup     
			ldi      5
			eq?     
			bnt      code_0328
			lsg      global130
			ldi      10
			ne?     
			bnt      code_031a
			pushi    #setScript
			pushi    1
			lofsa    screwUp
			push    
			self     6
			jmp      code_0333
code_031a:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
			jmp      code_0333
code_0328:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_0333:
			toss    
			ret     
		)
	)
)

(instance tap3 of PicView
	(properties
		x 204
		y 121
		z 4
		approachX 187
		approachY 130
		lookStr 32
		view 550
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_03bd
			pushi    #setScript
			pushi    2
			lofsa    turnTap
			push    
			pushSelf
			lag      global2
			send     8
			jmp      code_03c8
code_03bd:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    PicView,  8
code_03c8:
			toss    
			ret     
		)
	)
)

(instance tap4 of Feature
	(properties
		x 218
		y 135
		z 4
		nsTop 115
		nsLeft 214
		nsBottom 127
		nsRight 222
		approachX 201
		approachY 144
		lookStr 32
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0432
			pushi    #setScript
			pushi    1
			lofsa    barrelOut
			push    
			lag      global2
			send     6
			jmp      code_043d
code_0432:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_043d:
			toss    
			ret     
		)
	)
)

(instance tap5 of PicView
	(properties
		x 237
		y 147
		z 4
		approachX 220
		approachY 156
		lookStr 32
		view 550
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_049d
			pushi    #setScript
			pushi    2
			lofsa    turnTap
			push    
			pushSelf
			lag      global2
			send     8
			jmp      code_04a8
code_049d:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    PicView,  8
code_04a8:
			toss    
			ret     
		)
	)
)

(instance tap6 of PicView
	(properties
		x 257
		y 166
		z 4
		approachX 240
		approachY 175
		lookStr 32
		view 550
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0513
			pushi    #setScript
			pushi    2
			lofsa    turnTap
			push    
			pushSelf
			lag      global2
			send     8
			jmp      code_051e
code_0513:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    PicView,  8
code_051e:
			toss    
			ret     
		)
	)
)

(instance turnTap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05dc
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_0590
			ldi      28
			jmp      code_0593
code_0590:
			ldi      550
code_0593:
			push    
			pushi    6
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_05a4
			ldi      11
			jmp      code_05a6
code_05a4:
			ldi      8
code_05a6:
			push    
			pushi    4
			pushi    1
			pushi    65519
			pushi    #x
			pushi    0
			pToa     caller
			send     4
			add     
			push    
			pushi    3
			pushi    1
			pushi    13
			pushi    #y
			pushi    0
			pToa     caller
			send     4
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     44
			jmp      code_0695
code_05dc:
			dup     
			ldi      1
			eq?     
			bnt      code_0632
			pushi    #play
			pushi    0
			lofsa    spigotSound
			send     4
			pushi    #view
			pushi    1
			pushi    550
			pushi    6
			pushi    1
			pushi    3
			pushi    289
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pToa     caller
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pToa     caller
			send     4
			push    
			pushi    85
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    #new
			pushi    0
			class    Prop
			send     4
			aTop     register
			send     46
			ldi      30
			aTop     ticks
			jmp      code_0695
code_0632:
			dup     
			ldi      2
			eq?     
			bnt      code_0654
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			pushi    #play
			pushi    0
			lofsa    spigotSound
			send     4
			ldi      9
			aTop     ticks
			jmp      code_0695
code_0654:
			dup     
			ldi      3
			eq?     
			bnt      code_0665
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
			jmp      code_0695
code_0665:
			dup     
			ldi      4
			eq?     
			bnt      code_067b
			pushi    3
			pushi    1550
			pushi    49
			pushSelf
			calle    proc13_4,  6
			jmp      code_0695
code_067b:
			dup     
			ldi      5
			eq?     
			bnt      code_0695
			pushi    1
			pushi    4
			callb    proc0_2,  2
			pushi    0
			callb    proc0_4,  0
			ldi      0
			aTop     caller
			pushi    #dispose
			pushi    0
			self     4
code_0695:
			toss    
			ret     
		)
	)
)

(instance guardX of Actor
	(properties
		x 58
		y 88
		view 753
	)
)

(instance keeper of Actor
	(properties
		view 533
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0768
			pushi    3
			pushi    1550
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_07cf
code_0768:
			dup     
			ldi      5
			eq?     
			bnt      code_0784
			pushi    4
			pushi    1
			lea      @local76
			push    
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_07cf
code_0784:
			dup     
			ldi      3
			eq?     
			bnt      code_07a0
			pushi    4
			pushi    1
			lea      @local72
			push    
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_07cf
code_07a0:
			dup     
			ldi      10
			eq?     
			bnt      code_07b6
			pushi    3
			pushi    1550
			pushi    67
			pushi    1
			calle    proc13_4,  6
			jmp      code_07cf
code_07b6:
			dup     
			ldi      4
			eq?     
			bnt      code_07cf
			pushi    4
			pushi    1
			lea      @local80
			push    
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  8
code_07cf:
			toss    
			ret     
		)
	)
)

(instance gateIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_08de
			pushi    #x
			pushi    1
			pushi    58
			pushi    3
			pushi    1
			pushi    90
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    keeper
			send     28
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    gate
			send     4
			push    
			lofsa    gate
			send     6
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_08bc
			pushi    #x
			pushi    1
			pushi    197
			pushi    3
			pushi    1
			pushi    140
			pushi    6
			pushi    1
			pushi    1
			lag      global0
			send     18
			ldi      2
			aTop     cycles
			pushi    0
			callb    proc0_4,  0
			jmp      code_0a0d
code_08bc:
			pushi    #x
			pushi    1
			pushi    63
			pushi    3
			pushi    1
			pushi    104
			pushi    6
			pushi    1
			pushi    2
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    67
			pushi    110
			pushSelf
			lag      global0
			send     30
			jmp      code_0a0d
code_08de:
			dup     
			ldi      1
			eq?     
			bnt      code_0950
			lsg      global130
			ldi      10
			ne?     
			bt       code_08f4
			pushi    1
			pushi    141
			callb    proc0_5,  2
code_08f4:
			bnt      code_0908
			pushi    #setScript
			pushi    2
			lofsa    openGate
			push    
			pushSelf
			lofsa    keeper
			send     8
			jmp      code_0a0d
code_0908:
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_0931
			pushi    3
			lea      @local58
			push    
			pushi    999
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0a0d
code_0931:
			pushi    3
			lea      @local51
			push    
			pushi    999
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0a0d
code_0950:
			dup     
			ldi      2
			eq?     
			bnt      code_0995
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    gate
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lofsa    gate
			send     10
			lsg      global130
			ldi      10
			eq?     
			bnt      code_098e
			pushi    4
			lea      @local63
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a0d
code_098e:
			ldi      1
			aTop     cycles
			jmp      code_0a0d
code_0995:
			dup     
			ldi      3
			eq?     
			bnt      code_09b1
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    38
			pushi    88
			pushSelf
			lofsa    keeper
			send     12
			jmp      code_0a0d
code_09b1:
			dup     
			ldi      4
			eq?     
			bnt      code_09e7
			pushi    #dispose
			pushi    0
			lofsa    keeper
			send     4
			lsg      global130
			ldi      10
			eq?     
			bnt      code_09de
			pushi    5
			pushi    1
			lea      @local68
			push    
			pushi    999
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0a0d
code_09de:
			ldi      1
			aTop     cycles
			ipToa    state
			jmp      code_0a0d
code_09e7:
			dup     
			ldi      5
			eq?     
			bnt      code_09fd
			pushi    3
			pushi    1550
			pushi    28
			pushSelf
			calle    proc13_4,  6
			jmp      code_0a0d
code_09fd:
			dup     
			ldi      6
			eq?     
			bnt      code_0a0d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0a0d:
			toss    
			ret     
		)
	)
)

(instance barrelIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ad7
			pushi    5
			pushi    1
			pushi    550
			pushi    6
			pushi    1
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0a6c
			ldi      6
			jmp      code_0a6e
code_0a6c:
			ldi      4
code_0a6e:
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    193
			pushi    138
			pushi    66
			pushi    1
			pushi    8
			lag      global0
			send     32
			pushi    #signal
			pushi    1
			pushi    26640
			lofsa    sDoor
			send     6
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0aa0
			ipToa    state
			ldi      1
			aTop     cycles
			ret     
code_0aa0:
			pushi    #view
			pushi    1
			pushi    753
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    58
			pushi    88
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    37
			pushi    78
			pushSelf
			pushi    #new
			pushi    0
			class    Actor
			send     4
			aTop     register
			send     42
			jmp      code_0bcf
code_0ad7:
			dup     
			ldi      1
			eq?     
			bnt      code_0aec
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
			ldi      45
			aTop     ticks
			jmp      code_0bcf
code_0aec:
			dup     
			ldi      2
			eq?     
			bnt      code_0b0b
			pushi    #play
			pushi    0
			lofsa    caskSound
			send     4
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sDoor
			send     8
			jmp      code_0bcf
code_0b0b:
			dup     
			ldi      3
			eq?     
			bnt      code_0b2b
			pushi    #priority
			pushi    1
			pushi    8
			lofsa    sDoor
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0bcf
code_0b2b:
			dup     
			ldi      4
			eq?     
			bnt      code_0b56
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			pushi    199
			pushi    137
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    189
			pushi    141
			pushSelf
			lag      global0
			send     20
			jmp      code_0bcf
code_0b56:
			dup     
			ldi      5
			eq?     
			bnt      code_0b6b
			pushi    #setHeading
			pushi    2
			pushi    80
			pushSelf
			lag      global0
			send     8
			jmp      code_0bcf
code_0b6b:
			dup     
			ldi      6
			eq?     
			bnt      code_0b87
			pushi    #priority
			pushi    1
			pushi    9
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sDoor
			send     14
			jmp      code_0bcf
code_0b87:
			dup     
			ldi      7
			eq?     
			bnt      code_0bbf
			pushi    #play
			pushi    0
			lofsa    caskCloseSound
			send     4
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    sDoor
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lofsa    sDoor
			send     10
			pushi    #setHeading
			pushi    2
			pushi    260
			pushSelf
			lag      global0
			send     8
			jmp      code_0bcf
code_0bbf:
			dup     
			ldi      8
			eq?     
			bnt      code_0bcf
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0bcf:
			toss    
			ret     
		)
	)
)

(instance barrelOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c56
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_0c2c
			ldi      28
			jmp      code_0c2f
code_0c2c:
			ldi      550
code_0c2f:
			push    
			pushi    6
			pushi    1
			lsg      global126
			ldi      0
			ne?     
			bnt      code_0c40
			ldi      11
			jmp      code_0c42
code_0c40:
			ldi      8
code_0c42:
			push    
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
			jmp      code_0e36
code_0c56:
			dup     
			ldi      1
			eq?     
			bnt      code_0c7a
			pushi    1
			pushi    2
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			mul     
			add     
			aTop     ticks
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_0e36
			ipToa    state
			jmp      code_0e36
code_0c7a:
			dup     
			ldi      2
			eq?     
			bnt      code_0c93
			pushi    3
			pushi    1550
			ldi      50
			aTop     register
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e36
code_0c93:
			dup     
			ldi      3
			eq?     
			bnt      code_0cf0
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    sDoor
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			pushi    63
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sDoor
			send     24
			pushi    #play
			pushi    0
			lofsa    caskSound
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #setLoop
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Rev
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    190
			pushi    152
			pushSelf
			lag      global0
			send     24
			jmp      code_0e36
code_0cf0:
			dup     
			ldi      4
			eq?     
			bnt      code_0d1a
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_0d03
			ipToa    state
code_0d03:
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0e36
			pushi    #setCycle
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_0e36
code_0d1a:
			dup     
			ldi      5
			eq?     
			bnt      code_0d3a
			pushi    #setCycle
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    3
			pushi    1550
			ipToa    register
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e36
code_0d3a:
			dup     
			ldi      6
			eq?     
			bnt      code_0d5b
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    213
			pushi    133
			pushSelf
			lag      global0
			send     12
			jmp      code_0e36
code_0d5b:
			dup     
			ldi      7
			eq?     
			bnt      code_0d99
			pushi    5
			pushi    1
			pushi    550
			pushi    6
			pushi    1
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0d78
			ldi      7
			jmp      code_0d7a
code_0d78:
			ldi      5
code_0d7a:
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    8
			lag      global0
			send     24
			pushi    1
			pushi    2
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			mul     
			add     
			aTop     ticks
			jmp      code_0e36
code_0d99:
			dup     
			ldi      8
			eq?     
			bnt      code_0dbe
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lag      global0
			send     12
			pushi    1
			pushi    140
			callb    proc0_5,  2
			bnt      code_0e36
			ipToa    state
			jmp      code_0e36
code_0dbe:
			dup     
			ldi      9
			eq?     
			bnt      code_0dd5
			pushi    3
			pushi    1550
			ipToa    register
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e36
code_0dd5:
			dup     
			ldi      10
			eq?     
			bnt      code_0deb
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0e36
code_0deb:
			dup     
			ldi      11
			eq?     
			bnt      code_0e03
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			aTop     ticks
			jmp      code_0e36
code_0e03:
			dup     
			ldi      12
			eq?     
			bnt      code_0e18
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			ldi      2
			aTop     cycles
			jmp      code_0e36
code_0e18:
			dup     
			ldi      13
			eq?     
			bnt      code_0e36
			pushi    2
			pushi    100
			pushi    140
			calle    proc806_1,  4
			pushi    #newRoom
			pushi    1
			pushi    560
			lag      global2
			send     6
code_0e36:
			toss    
			ret     
		)
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 param4 param5)
		(asm
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
			bnt      code_0ec5
			lal      local15
			bnt      code_0eb7
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pTos     register
			pTos     state
			pushSelf
			pushi    80
			lsl      local15
			calle    proc13_4,  10
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0eca
code_0eb7:
			pushi    3
			pTos     register
			pTos     state
			pushSelf
			calle    proc13_4,  6
			jmp      code_0eca
code_0ec5:
			pushi    #dispose
			pushi    0
			self     4
code_0eca:
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			lap      param1
			not     
			bnt      code_0ed5
			pToa     state
			aTop     start
code_0ed5:
			pushi    #cue
			pushi    0
			super    Script,  4
			ret     
		)
	)
)

(instance screwUp of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_0f47
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1550
			pushi    57
			pushi    58
			lag      global2
			send     14
			ipToa    register
			jmp      code_108d
code_0f47:
			dup     
			ldi      1
			eq?     
			bnt      code_1000
			lsp      newState
			dup     
			ldi      0
			eq?     
			bnt      code_0f6f
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local16
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ffc
code_0f6f:
			dup     
			ldi      1
			eq?     
			bnt      code_0fab
			pushi    #view
			pushi    1
			pushi    533
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    50
			pushi    76
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    69
			pushi    76
			pushSelf
			lofsa    keeper
			send     48
			jmp      code_0ffc
code_0fab:
			dup     
			ldi      2
			eq?     
			bnt      code_0fc7
			pushi    4
			lea      @local20
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ffc
code_0fc7:
			dup     
			ldi      3
			eq?     
			bnt      code_0fe3
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    50
			pushi    76
			pushSelf
			lofsa    keeper
			send     12
			jmp      code_0ffc
code_0fe3:
			dup     
			ldi      4
			eq?     
			bnt      code_0ffc
			pushi    #hide
			pushi    0
			pushi    285
			pushi    0
			lofsa    keeper
			send     8
			pushi    0
			callb    proc0_4,  0
			ipToa    register
code_0ffc:
			toss    
			jmp      code_108d
code_1000:
			dup     
			ldi      2
			eq?     
			bnt      code_108d
			lsp      newState
			dup     
			ldi      0
			eq?     
			bnt      code_1028
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local16
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_108c
code_1028:
			dup     
			ldi      1
			eq?     
			bnt      code_1052
			pushi    #loop
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65
			pushi    88
			pushSelf
			lofsa    guardX
			send     28
			jmp      code_108c
code_1052:
			dup     
			ldi      2
			eq?     
			bnt      code_1076
			lofsa    {Roger}
			sal      local15
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1550
			pushi    62
			pushi    65
			lag      global2
			send     14
			jmp      code_108c
code_1076:
			dup     
			ldi      3
			eq?     
			bnt      code_108c
			ldi      30
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_108c:
			toss    
code_108d:
			toss    
			ret     
		)
	)
)

(instance openGate of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10fb
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    sDoor
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    gate
			send     18
			jmp      code_110f
code_10fb:
			dup     
			ldi      1
			eq?     
			bnt      code_110f
			pushi    #play
			pushi    0
			lofsa    gateSound
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_110f:
			toss    
			ret     
		)
	)
)

(instance resc of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11e4
			pushi    0
			callb    proc0_3,  0
			pushi    #number
			pushi    1
			pushi    530
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    sDoor
			send     4
			push    
			pushi    63
			pushi    1
			pushi    8
			pushi    285
			pushi    0
			lofsa    sDoor
			send     16
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    gate
			send     4
			push    
			lofsa    gate
			send     6
			pushi    #view
			pushi    1
			pushi    550
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    193
			pushi    138
			pushi    66
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     40
			pushi    #init
			pushi    0
			lofsa    hal
			send     4
			pushi    #init
			pushi    0
			lofsa    hob
			send     4
			pushi    #init
			pushi    0
			lofsa    dick
			send     4
			ldi      1
			aTop     cycles
			jmp      code_14c5
code_11e4:
			dup     
			ldi      1
			eq?     
			bnt      code_11f7
			pushi    #addToPic
			pushi    0
			lofsa    gate
			send     4
			jmp      code_14c5
code_11f7:
			dup     
			ldi      2
			eq?     
			bnt      code_120a
			pushi    1
			pushi    1
			callb    proc0_2,  2
			ldi      2
			aTop     cycles
			jmp      code_14c5
code_120a:
			dup     
			ldi      3
			eq?     
			bnt      code_1247
			pushi    1
			pushi    211
			callb    proc0_5,  2
			bnt      code_1231
			pushi    5
			pushi    1
			lea      @local84
			push    
			lea      @local9
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_14c5
code_1231:
			pushi    5
			pushi    1
			lea      @local25
			push    
			pushi    999
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_14c5
code_1247:
			dup     
			ldi      4
			eq?     
			bnt      code_125d
			pushi    #setHeading
			pushi    2
			pushi    110
			pushSelf
			lofsa    hal
			send     8
			jmp      code_14c5
code_125d:
			dup     
			ldi      5
			eq?     
			bnt      code_12a5
			pushi    1
			pushi    211
			callb    proc0_5,  2
			bnt      code_1284
			pushi    5
			pushi    1
			lea      @local88
			push    
			pushi    999
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_14c5
code_1284:
			pushi    9
			pushi    3
			lea      @local29
			push    
			pushi    999
			pushi    3
			lea      @local9
			push    
			pushi    1
			lea      @local12
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  18
			jmp      code_14c5
code_12a5:
			dup     
			ldi      6
			eq?     
			bnt      code_133c
			pushi    1
			pushi    211
			callb    proc0_5,  2
			bnt      code_12bd
			ldi      1
			aTop     cycles
			jmp      code_1300
code_12bd:
			pushi    0
			calle    proc851_1,  0
			bnt      code_12e6
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    5
			pushi    1
			lea      @local38
			push    
			pushi    999
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1300
code_12e6:
			pTos     state
			ldi      3
			add     
			aTop     state
			pushi    5
			pushi    1
			lea      @local46
			push    
			pushi    999
			pushi    3
			pushSelf
			calle    proc851_0,  10
code_1300:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			class    Grooper
			push    
			lofsa    hal
			send     12
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			class    Grooper
			push    
			lofsa    hob
			send     12
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			class    Grooper
			push    
			lofsa    dick
			send     12
			jmp      code_14c5
code_133c:
			dup     
			ldi      7
			eq?     
			bnt      code_1381
			pushi    #setMotion
			pushi    2
			class    PPath
			push    
			lea      @local95
			push    
			lofsa    hal
			send     8
			pushi    #setMotion
			pushi    2
			class    PPath
			push    
			lea      @local95
			push    
			lofsa    hob
			send     8
			pushi    #setMotion
			pushi    2
			class    PPath
			push    
			lea      @local95
			push    
			lofsa    dick
			send     8
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lag      global0
			send     8
			jmp      code_14c5
code_1381:
			dup     
			ldi      8
			eq?     
			bnt      code_13ba
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    sDoor
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    sDoor
			send     12
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    110
			pushi    130
			pushSelf
			lag      global0
			send     12
			jmp      code_14c5
code_13ba:
			dup     
			ldi      9
			eq?     
			bnt      code_13f4
			pushi    #newRoom
			pushi    1
			pushi    530
			lag      global2
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    hal
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    hob
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    dick
			send     6
			pushi    1
			pushi    852
			callk    DisposeScript,  2
			jmp      code_14c5
code_13f4:
			dup     
			ldi      10
			eq?     
			bnt      code_1418
			pushi    1
			pushi    211
			callb    proc0_6,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    213
			pushi    133
			pushSelf
			lag      global0
			send     12
			jmp      code_14c5
code_1418:
			dup     
			ldi      11
			eq?     
			bnt      code_147b
			pushi    #view
			pushi    1
			pushi    550
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     32
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    193
			pushi    138
			lofsa    hal
			send     10
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    193
			pushi    138
			lofsa    hob
			send     10
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    193
			pushi    138
			lofsa    dick
			send     10
			jmp      code_14c5
code_147b:
			dup     
			ldi      12
			eq?     
			bnt      code_148f
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			aTop     ticks
			jmp      code_14c5
code_148f:
			dup     
			ldi      13
			eq?     
			bnt      code_14a4
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			ldi      2
			aTop     cycles
			jmp      code_14c5
code_14a4:
			dup     
			ldi      14
			eq?     
			bnt      code_14c5
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			pushi    560
			lag      global2
			send     6
code_14c5:
			toss    
			ret     
		)
	)
)

(instance hal of Actor
	(properties
		x 110
		y 130
		view 23
		loop 7
		cel 5
		signal $6000
	)
)

(instance hob of Actor
	(properties
		x 128
		y 121
		view 23
		loop 5
		cel 1
		signal $6000
	)
)

(instance dick of Actor
	(properties
		x 144
		y 130
		view 23
		loop 1
		cel 5
		signal $6000
	)
)

(instance spigotSound of Sound
	(properties
		flags $0001
		number 552
	)
)

(instance caskSound of Sound
	(properties
		flags $0001
		number 551
	)
)

(instance caskCloseSound of Sound
	(properties
		flags $0001
		number 553
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 532
	)
)

(instance csk1 of Feature
	(properties
		x 157
		y 89
		onMeCheck $0002
		approachX 163
		approachY 105
		lookStr 30
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_176a
			pushi    2
			pushi    1550
			pushi    43
			calle    proc13_4,  4
			jmp      code_1775
code_176a:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1775:
			toss    
			ret     
		)
	)
)

(instance csk2 of Feature
	(properties
		x 197
		y 85
		onMeCheck $1000
		approachX 201
		approachY 101
		lookStr 30
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    csk1
			send     4
			ret     
		)
	)
)

(instance csk3 of Feature
	(properties
		x 220
		y 117
		onMeCheck $0004
		approachX 187
		approachY 130
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1822
			pushi    2
			pushi    1550
			pushi    44
			calle    proc13_4,  4
			jmp      code_182d
code_1822:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_182d:
			toss    
			ret     
		)
	)
)

(instance csk4 of Feature
	(properties
		x 231
		y 133
		onMeCheck $0008
		approachX 201
		approachY 144
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1894
			pushi    2
			pushi    1550
			pushi    45
			calle    proc13_4,  4
			pushi    2
			pushi    1550
			pushi    46
			calle    proc13_4,  4
			jmp      code_189f
code_1894:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_189f:
			toss    
			ret     
		)
	)
)

(instance csk5 of Feature
	(properties
		x 252
		y 146
		onMeCheck $0010
		approachX 220
		approachY 156
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_18fc
			pushi    2
			pushi    1550
			pushi    47
			calle    proc13_4,  4
			jmp      code_1907
code_18fc:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1907:
			toss    
			ret     
		)
	)
)

(instance csk6 of Feature
	(properties
		x 271
		y 165
		onMeCheck $0020
		approachX 240
		approachY 175
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1964
			pushi    2
			pushi    1550
			pushi    48
			calle    proc13_4,  4
			jmp      code_196f
code_1964:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_196f:
			toss    
			ret     
		)
	)
)

(instance csk7 of Feature
	(properties
		x 100
		y 189
		onMeCheck $0400
		approachX 110
		approachY 170
		lookStr 34
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    csk8
			send     4
			ret     
		)
	)
)

(instance csk8 of Feature
	(properties
		x 30
		y 161
		onMeCheck $0080
		approachX 55
		approachY 151
		lookStr 34
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1a1c
			pushi    2
			pushi    1550
			pushi    54
			calle    proc13_4,  4
			jmp      code_1a27
code_1a1c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1a27:
			toss    
			ret     
		)
	)
)

(instance csk9 of Feature
	(properties
		x 25
		y 134
		onMeCheck $0800
		approachX 38
		approachY 124
		lookStr 34
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    csk8
			send     4
			ret     
		)
	)
)

(instance base of Feature
	(properties
		onMeCheck $0040
		lookStr 33
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1ad4
			pushi    2
			pushi    1550
			pushi    53
			calle    proc13_4,  4
			jmp      code_1adf
code_1ad4:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1adf:
			toss    
			ret     
		)
	)
)

(instance sacks of Feature
	(properties
		onMeCheck $0100
		lookStr 35
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1b3c
			pushi    2
			pushi    1550
			pushi    55
			calle    proc13_4,  4
			jmp      code_1b47
code_1b3c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1b47:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties
		onMeCheck $0001
		lookStr 36
	)
)

(instance floor of Feature
	(properties
		onMeCheck $0200
		lookStr 37
	)
)
