;;; Sierra Script 1.0 - (do not remove this comment)
(script# 179)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n994)
(use n999)

(public
	synop 0
)

(local
	local0
	local1
)
(procedure (localproc_000e param1)
	(asm
		pushi    #number
		pushi    1
		pushi    916
		pushi    6
		pushi    1
		pushi    1
		pushi    42
		pushi    0
		lag      global114
		send     16
		lsg      global15
		lap      param1
		add     
		sag      global15
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		ret     
	)
)

(procedure (localproc_0032)
	(asm
		lsg      global138
		ldi      22
		le?     
		bnt      code_0046
		pushi    1
		pushi    65529
		calle    proc806_5,  2
		jmp      code_009e
code_0046:
		lsg      global138
		ldi      24
		le?     
		bnt      code_005a
		pushi    1
		pushi    65531
		calle    proc806_5,  2
		jmp      code_009e
code_005a:
		lsg      global138
		ldi      27
		le?     
		bnt      code_006e
		pushi    1
		pushi    65533
		calle    proc806_5,  2
		jmp      code_009e
code_006e:
		lsg      global138
		ldi      30
		le?     
		bnt      code_0082
		pushi    1
		pushi    65534
		calle    proc806_5,  2
		jmp      code_009e
code_0082:
		lsg      global138
		ldi      33
		le?     
		bnt      code_0096
		pushi    1
		pushi    65535
		calle    proc806_5,  2
		jmp      code_009e
code_0096:
		pushi    1
		pushi    0
		calle    proc806_5,  2
code_009e:
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		ret     
	)
)

(procedure (localproc_00aa)
	(asm
		lsg      global138
		ldi      27
		le?     
		bnt      code_00be
		pushi    1
		pushi    65529
		calle    proc806_5,  2
		jmp      code_00ef
code_00be:
		lsg      global138
		ldi      30
		le?     
		bnt      code_00d2
		pushi    1
		pushi    65531
		calle    proc806_5,  2
		jmp      code_00ef
code_00d2:
		lsg      global138
		ldi      33
		le?     
		bnt      code_00e6
		pushi    1
		pushi    65532
		calle    proc806_5,  2
		jmp      code_00ef
code_00e6:
		pushi    1
		pushi    65534
		calle    proc806_5,  2
code_00ef:
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		ret     
	)
)

(procedure (localproc_00fb)
	(asm
		lsg      global138
		ldi      25
		le?     
		bnt      code_010f
		pushi    1
		pushi    65529
		calle    proc806_5,  2
		jmp      code_0154
code_010f:
		lsg      global138
		ldi      27
		le?     
		bnt      code_0123
		pushi    1
		pushi    65528
		calle    proc806_5,  2
		jmp      code_0154
code_0123:
		lsg      global138
		ldi      30
		le?     
		bnt      code_0137
		pushi    1
		pushi    65530
		calle    proc806_5,  2
		jmp      code_0154
code_0137:
		lsg      global138
		ldi      33
		le?     
		bnt      code_014b
		pushi    1
		pushi    65531
		calle    proc806_5,  2
		jmp      code_0154
code_014b:
		pushi    1
		pushi    65533
		calle    proc806_5,  2
code_0154:
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		ret     
	)
)

(procedure (localproc_0160)
	(asm
		lsg      global138
		ldi      27
		le?     
		bnt      code_0174
		pushi    1
		pushi    65529
		calle    proc806_5,  2
		jmp      code_01a5
code_0174:
		lsg      global138
		ldi      30
		le?     
		bnt      code_0188
		pushi    1
		pushi    65527
		calle    proc806_5,  2
		jmp      code_01a5
code_0188:
		lsg      global138
		ldi      33
		le?     
		bnt      code_019c
		pushi    1
		pushi    65529
		calle    proc806_5,  2
		jmp      code_01a5
code_019c:
		pushi    1
		pushi    65532
		calle    proc806_5,  2
code_01a5:
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		ret     
	)
)

(instance synop of Rm
	(properties
		picture 803
		style $0008
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			ldi      0
			sal      local1
			lsg      global12
			ldi      176
			eq?     
			bnt      code_01c8
			ldi      1
			sal      local1
code_01c8:
			pushi    #setScript
			pushi    1
			lofsa    whatHappened
			push    
			self     6
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    1
			pushi    806
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance whatHappened of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0779
			lsg      global146
			dup     
			ldi      10
			eq?     
			bnt      code_0264
			pushi    1
			pushi    65534
			calle    proc806_5,  2
			pushi    1
			pushi    200
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0264:
			dup     
			ldi      11
			eq?     
			bnt      code_028c
			pushi    1
			pushi    65533
			calle    proc806_5,  2
			pushi    1
			pushi    150
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_028c:
			dup     
			ldi      12
			eq?     
			bnt      code_02b3
			pushi    1
			pushi    65531
			calle    proc806_5,  2
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_02b3:
			dup     
			ldi      13
			eq?     
			bnt      code_02db
			pushi    1
			pushi    65529
			calle    proc806_5,  2
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_02db:
			dup     
			ldi      20
			eq?     
			bnt      code_0304
			pushi    1
			pushi    65534
			calle    proc806_5,  2
			pushi    1
			pushi    200
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    4
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0304:
			dup     
			ldi      21
			eq?     
			bnt      code_032d
			pushi    1
			pushi    65533
			calle    proc806_5,  2
			pushi    1
			pushi    150
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    5
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_032d:
			dup     
			ldi      22
			eq?     
			bnt      code_0354
			pushi    1
			pushi    65531
			calle    proc806_5,  2
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0354:
			dup     
			ldi      23
			eq?     
			bnt      code_037c
			pushi    1
			pushi    65529
			calle    proc806_5,  2
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    3
			pushi    1179
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_037c:
			dup     
			ldi      30
			eq?     
			bnt      code_03ae
			pushi    1
			pushi    0
			calle    proc806_5,  2
			pushi    1
			pushi    500
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    24
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_03ae:
			dup     
			ldi      31
			eq?     
			bnt      code_03e1
			pushi    1
			pushi    65534
			calle    proc806_5,  2
			pushi    1
			pushi    400
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    13
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_03e1:
			dup     
			ldi      32
			eq?     
			bnt      code_0414
			pushi    1
			pushi    65533
			calle    proc806_5,  2
			pushi    1
			pushi    300
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    14
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0414:
			dup     
			ldi      34
			eq?     
			bnt      code_0446
			pushi    1
			pushi    65532
			calle    proc806_5,  2
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    15
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0446:
			dup     
			ldi      33
			eq?     
			bnt      code_0478
			pushi    1
			pushi    65531
			calle    proc806_5,  2
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    16
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0478:
			dup     
			ldi      40
			eq?     
			bnt      code_04ab
			pushi    1
			pushi    65534
			calle    proc806_5,  2
			pushi    1
			pushi    500
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    12
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_04ab:
			dup     
			ldi      41
			eq?     
			bnt      code_04de
			pushi    1
			pushi    65533
			calle    proc806_5,  2
			pushi    1
			pushi    400
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    13
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_04de:
			dup     
			ldi      42
			eq?     
			bnt      code_0511
			pushi    1
			pushi    65531
			calle    proc806_5,  2
			pushi    1
			pushi    300
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    14
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0511:
			dup     
			ldi      44
			eq?     
			bnt      code_0543
			pushi    1
			pushi    65530
			calle    proc806_5,  2
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    15
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0543:
			dup     
			ldi      43
			eq?     
			bnt      code_0575
			pushi    1
			pushi    65529
			calle    proc806_5,  2
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    16
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0575:
			dup     
			ldi      50
			eq?     
			bnt      code_05a8
			pushi    1
			pushi    65534
			calle    proc806_5,  2
			pushi    1
			pushi    200
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    12
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_05a8:
			dup     
			ldi      51
			eq?     
			bnt      code_05db
			pushi    1
			pushi    65533
			calle    proc806_5,  2
			pushi    1
			pushi    150
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    13
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_05db:
			dup     
			ldi      52
			eq?     
			bnt      code_060d
			pushi    1
			pushi    65531
			calle    proc806_5,  2
			pushi    1
			pushi    75
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    14
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_060d:
			dup     
			ldi      54
			eq?     
			bnt      code_063f
			pushi    1
			pushi    65530
			calle    proc806_5,  2
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    15
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_063f:
			dup     
			ldi      53
			eq?     
			bnt      code_0671
			pushi    1
			pushi    65529
			calle    proc806_5,  2
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    2
			pushi    1179
			pushi    16
			calle    proc13_4,  4
			pushi    3
			pushi    1179
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0671:
			dup     
			ldi      60
			eq?     
			bnt      code_06b2
			pushi    0
			call     localproc_00fb,  0
			lal      local1
			bnt      code_0691
			pushi    3
			pushi    1179
			pushi    23
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0691:
			pushi    1
			pushi    500
			call     localproc_000e,  2
			pushi    1
			pushi    50000
			calle    proc806_4,  2
			pushi    3
			pushi    1179
			pushi    19
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_06b2:
			dup     
			ldi      61
			eq?     
			bnt      code_06f3
			pushi    0
			call     localproc_00aa,  0
			lal      local1
			bnt      code_06d2
			pushi    3
			pushi    1179
			pushi    23
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_06d2:
			pushi    1
			pushi    500
			call     localproc_000e,  2
			pushi    1
			pushi    50000
			calle    proc806_4,  2
			pushi    3
			pushi    1179
			pushi    18
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_06f3:
			dup     
			ldi      62
			eq?     
			bnt      code_0734
			pushi    0
			call     localproc_0160,  0
			lal      local1
			bnt      code_0713
			pushi    3
			pushi    1179
			pushi    23
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0713:
			pushi    1
			pushi    500
			call     localproc_000e,  2
			pushi    1
			pushi    50000
			calle    proc806_4,  2
			pushi    3
			pushi    1179
			pushi    20
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0734:
			dup     
			ldi      64
			eq?     
			bnt      code_0761
			pushi    0
			call     localproc_0032,  0
			pushi    1
			pushi    500
			call     localproc_000e,  2
			pushi    1
			pushi    50000
			calle    proc806_4,  2
			pushi    3
			pushi    1179
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_0775
code_0761:
			dup     
			ldi      65
			eq?     
			bnt      code_0775
			pushi    1
			pushi    65529
			calle    proc806_5,  2
			ldi      6
			aTop     ticks
code_0775:
			toss    
			jmp      code_07c3
code_0779:
			dup     
			ldi      1
			eq?     
			bnt      code_07c3
			pushi    30
			lag      global146
			le?     
			bnt      code_079d
			pprev   
			ldi      54
			le?     
			bnt      code_079d
			pushi    #newRoom
			pushi    1
			pushi    210
			lag      global2
			send     6
			jmp      code_07be
code_079d:
			lsg      global146
			ldi      23
			le?     
			bnt      code_07b3
			pushi    #newRoom
			pushi    1
			pushi    250
			lag      global2
			send     6
			jmp      code_07be
code_07b3:
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_07be:
			pushi    #dispose
			pushi    0
			self     4
code_07c3:
			toss    
			ret     
		)
	)
)
