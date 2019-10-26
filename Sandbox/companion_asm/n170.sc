;;; Sierra Script 1.0 - (do not remove this comment)
(script# 170)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n992)
(use n994)
(use n998)

(public
	robinDeath 0
)

(procedure (localproc_000e param1 param2)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    willHead
		send     6
		pushi    1
		pushi    2
		calle    proc13_6,  2
		pushi    8
		lsp      param1
		lsp      param2
		pushSelf
		pushi    67
		pushi    10
		dup     
		pushi    80
		lofsa    {Will}
		push    
		calle    proc13_4,  16
		ret     
	)
)

(procedure (localproc_0037 param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    johnHead
		send     6
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    johnArm
		send     6
		pushi    1
		pushi    1
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {John}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_0063 param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    tuckHead
		send     6
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    tuckHands
		send     6
		pushi    1
		pushi    3
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    67
		pushi    80
		pushi    20
		pushi    80
		lofsa    {Tuck}
		push    
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_0097 param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    alanHead
		send     6
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    alanArm
		send     6
		pushi    1
		pushi    4
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    67
		pushi    100
		pushi    25
		pushi    80
		lofsa    {Alan}
		push    
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_00cb param1)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    muchHead
		send     6
		pushi    1
		pushi    5
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    67
		pushi    130
		pushi    10
		pushi    80
		lofsa    {Much}
		push    
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_00f4)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    willHead
		send     6
		ret     
	)
)

(procedure (localproc_0101)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    muchHead
		send     6
		ret     
	)
)

(procedure (localproc_010e)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    tuckHead
		send     6
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    tuckHands
		send     6
		ret     
	)
)

(procedure (localproc_0127)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    johnHead
		send     6
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    johnArm
		send     6
		ret     
	)
)

(procedure (localproc_0140)
	(asm
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    alanHead
		send     6
		pushi    #setCycle
		pushi    1
		class    Beg
		push    
		lofsa    alanArm
		send     6
		ret     
	)
)

(procedure (localproc_0159)
	(asm
		pushi    0
		callb    proc0_4,  0
		pushi    #enable
		pushi    0
		lag      global69
		send     4
		pushi    1
		pushi    0
		calle    proc13_6,  2
		pushi    0
		calle    proc806_0,  0
		ret     
	)
)

(instance robinDeath of Rm
	(properties
		picture 160
		style $000a
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			lofsa    johnHead
			send     4
			pushi    #init
			pushi    0
			lofsa    johnArm
			send     4
			pushi    #init
			pushi    0
			lofsa    tuckHead
			send     4
			pushi    #init
			pushi    0
			lofsa    tuckHands
			send     4
			pushi    #init
			pushi    0
			lofsa    alanHead
			send     4
			pushi    #init
			pushi    0
			lofsa    alanArm
			send     4
			pushi    #init
			pushi    0
			lofsa    willHead
			send     4
			pushi    #init
			pushi    0
			lofsa    muchHead
			send     4
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    5
			lofsa    johnBody
			push    
			lofsa    tuckBody
			push    
			lofsa    alanBody
			push    
			lofsa    willBody
			push    
			lofsa    muchBody
			push    
			calle    proc806_2,  10
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #number
			pushi    1
			pushi    173
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			lsg      global145
			dup     
			ldi      0
			eq?     
			bnt      code_021c
			pushi    #setScript
			pushi    1
			lofsa    death2InRm120
			push    
			lag      global2
			send     6
			jmp      code_0589
code_021c:
			dup     
			ldi      1
			eq?     
			bnt      code_0232
			pushi    #setScript
			pushi    1
			lofsa    death3InRm120
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0232:
			dup     
			ldi      2
			eq?     
			bnt      code_0248
			pushi    #setScript
			pushi    1
			lofsa    death4InRm120
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0248:
			dup     
			ldi      3
			eq?     
			bnt      code_025e
			pushi    #setScript
			pushi    1
			lofsa    death5InRm120
			push    
			lag      global2
			send     6
			jmp      code_0589
code_025e:
			dup     
			ldi      4
			eq?     
			bnt      code_0274
			pushi    #setScript
			pushi    1
			lofsa    death1InFairRgn
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0274:
			dup     
			ldi      5
			eq?     
			bnt      code_028a
			pushi    #setScript
			pushi    1
			lofsa    deathInRm360
			push    
			lag      global2
			send     6
			jmp      code_0589
code_028a:
			dup     
			ldi      6
			eq?     
			bnt      code_02a0
			pushi    #setScript
			pushi    1
			lofsa    death1InRm390
			push    
			lag      global2
			send     6
			jmp      code_0589
code_02a0:
			dup     
			ldi      7
			eq?     
			bnt      code_02b6
			pushi    #setScript
			pushi    1
			lofsa    death2InRm390
			push    
			lag      global2
			send     6
			jmp      code_0589
code_02b6:
			dup     
			ldi      8
			eq?     
			bnt      code_02cc
			pushi    #setScript
			pushi    1
			lofsa    death3InRm390
			push    
			lag      global2
			send     6
			jmp      code_0589
code_02cc:
			dup     
			ldi      9
			eq?     
			bnt      code_02e2
			pushi    #setScript
			pushi    1
			lofsa    death4InRm390
			push    
			lag      global2
			send     6
			jmp      code_0589
code_02e2:
			dup     
			ldi      10
			eq?     
			bnt      code_02f8
			pushi    #setScript
			pushi    1
			lofsa    death1InAbyRegn
			push    
			lag      global2
			send     6
			jmp      code_0589
code_02f8:
			dup     
			ldi      11
			eq?     
			bnt      code_030e
			pushi    #setScript
			pushi    1
			lofsa    death2InAbyRegn
			push    
			lag      global2
			send     6
			jmp      code_0589
code_030e:
			dup     
			ldi      12
			eq?     
			bnt      code_0324
			pushi    #setScript
			pushi    1
			lofsa    death3InAbyRegn
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0324:
			dup     
			ldi      13
			eq?     
			bnt      code_033a
			pushi    #setScript
			pushi    1
			lofsa    death1InRm440
			push    
			lag      global2
			send     6
			jmp      code_0589
code_033a:
			dup     
			ldi      14
			eq?     
			bnt      code_0350
			pushi    #setScript
			pushi    1
			lofsa    death2InRm440
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0350:
			dup     
			ldi      15
			eq?     
			bnt      code_0366
			pushi    #setScript
			pushi    1
			lofsa    death1InRm460
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0366:
			dup     
			ldi      16
			eq?     
			bnt      code_037c
			pushi    #setScript
			pushi    1
			lofsa    death2InRm460
			push    
			lag      global2
			send     6
			jmp      code_0589
code_037c:
			dup     
			ldi      17
			eq?     
			bnt      code_0392
			pushi    #setScript
			pushi    1
			lofsa    death3InRm460
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0392:
			dup     
			ldi      18
			eq?     
			bnt      code_03a8
			pushi    #setScript
			pushi    1
			lofsa    death4InRm460
			push    
			lag      global2
			send     6
			jmp      code_0589
code_03a8:
			dup     
			ldi      19
			eq?     
			bnt      code_03be
			pushi    #setScript
			pushi    1
			lofsa    death1InRm620
			push    
			lag      global2
			send     6
			jmp      code_0589
code_03be:
			dup     
			ldi      20
			eq?     
			bnt      code_03d4
			pushi    #setScript
			pushi    1
			lofsa    death2InRm620
			push    
			lag      global2
			send     6
			jmp      code_0589
code_03d4:
			dup     
			ldi      21
			eq?     
			bnt      code_03ea
			pushi    #setScript
			pushi    1
			lofsa    deathInRm620
			push    
			lag      global2
			send     6
			jmp      code_0589
code_03ea:
			dup     
			ldi      22
			eq?     
			bnt      code_0400
			pushi    #setScript
			pushi    1
			lofsa    deathInRm650
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0400:
			dup     
			ldi      23
			eq?     
			bnt      code_0416
			pushi    #setScript
			pushi    1
			lofsa    deathInWatrGate
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0416:
			dup     
			ldi      24
			eq?     
			bnt      code_042c
			pushi    #setScript
			pushi    1
			lofsa    deathInRm470
			push    
			lag      global2
			send     6
			jmp      code_0589
code_042c:
			dup     
			ldi      25
			eq?     
			bnt      code_0442
			pushi    #setScript
			pushi    1
			lofsa    death1InRm500
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0442:
			dup     
			ldi      26
			eq?     
			bnt      code_0458
			pushi    #setScript
			pushi    1
			lofsa    death2InRm500
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0458:
			dup     
			ldi      27
			eq?     
			bnt      code_046e
			pushi    #setScript
			pushi    1
			lofsa    death1InRm530
			push    
			lag      global2
			send     6
			jmp      code_0589
code_046e:
			dup     
			ldi      28
			eq?     
			bnt      code_0484
			pushi    #setScript
			pushi    1
			lofsa    death2InRm530
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0484:
			dup     
			ldi      29
			eq?     
			bnt      code_049a
			pushi    #setScript
			pushi    1
			lofsa    death3InRm530
			push    
			lag      global2
			send     6
			jmp      code_0589
code_049a:
			dup     
			ldi      30
			eq?     
			bnt      code_04b0
			pushi    #setScript
			pushi    1
			lofsa    deathInRm550
			push    
			lag      global2
			send     6
			jmp      code_0589
code_04b0:
			dup     
			ldi      31
			eq?     
			bnt      code_04c6
			pushi    #setScript
			pushi    1
			lofsa    death1InRm570
			push    
			lag      global2
			send     6
			jmp      code_0589
code_04c6:
			dup     
			ldi      32
			eq?     
			bnt      code_04dc
			pushi    #setScript
			pushi    1
			lofsa    death2InRm570
			push    
			lag      global2
			send     6
			jmp      code_0589
code_04dc:
			dup     
			ldi      33
			eq?     
			bnt      code_04f2
			pushi    #setScript
			pushi    1
			lofsa    deathInForest
			push    
			lag      global2
			send     6
			jmp      code_0589
code_04f2:
			dup     
			ldi      34
			eq?     
			bnt      code_0508
			pushi    #setScript
			pushi    1
			lofsa    deathInRm320
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0508:
			dup     
			ldi      35
			eq?     
			bnt      code_051e
			pushi    #setScript
			pushi    1
			lofsa    getInBoatRm620
			push    
			lag      global2
			send     6
			jmp      code_0589
code_051e:
			dup     
			ldi      36
			eq?     
			bnt      code_0534
			pushi    #setScript
			pushi    1
			lofsa    death2InFairRgn
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0534:
			dup     
			ldi      37
			eq?     
			bnt      code_054a
			pushi    #setScript
			pushi    1
			lofsa    deathInRm501
			push    
			lag      global2
			send     6
			jmp      code_0589
code_054a:
			dup     
			ldi      38
			eq?     
			bnt      code_0560
			pushi    #setScript
			pushi    1
			lofsa    deathInRm710
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0560:
			dup     
			ldi      39
			eq?     
			bnt      code_0576
			pushi    #setScript
			pushi    1
			lofsa    death5InRm390
			push    
			lag      global2
			send     6
			jmp      code_0589
code_0576:
			dup     
			ldi      40
			eq?     
			bnt      code_0589
			pushi    #setScript
			pushi    1
			lofsa    tooLateInTheHedge
			push    
			lag      global2
			send     6
code_0589:
			toss    
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #stop
			pushi    0
			lag      global100
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance tuckBody of PicView
	(properties
		x 131
		y 189
		view 175
		loop 5
		priority 14
		signal $4000
	)
)

(instance tuckHead of Prop
	(properties
		x 138
		y 135
		view 175
		loop 3
		cel 4
		priority 15
		signal $4010
		cycleSpeed 24
	)
)

(instance tuckHands of Prop
	(properties
		x 116
		y 175
		view 175
		loop 4
		priority 15
		signal $4010
		cycleSpeed 36
	)
)

(instance johnBody of PicView
	(properties
		x 83
		y 95
		view 175
		loop 2
		priority 14
		signal $4000
	)
)

(instance johnHead of Prop
	(properties
		x 80
		y 110
		view 175
		priority 15
		signal $4014
		cycleSpeed 15
	)
)

(instance johnArm of Prop
	(properties
		x 62
		y 120
		view 175
		loop 1
		priority 15
		signal $4010
		cycleSpeed 48
	)
)

(instance alanBody of PicView
	(properties
		x 204
		y 189
		view 175
		loop 8
		priority 14
		signal $4000
	)
)

(instance alanHead of Prop
	(properties
		x 192
		y 146
		view 175
		loop 6
		priority 15
		signal $4014
		cycleSpeed 12
	)
)

(instance alanArm of Prop
	(properties)
)

(instance willBody of PicView
	(properties
		x 24
		y 189
		view 175
		loop 10
		priority 14
		signal $4000
	)
)

(instance willHead of Prop
	(properties
		x 20
		y 156
		view 175
		loop 9
		priority 15
		signal $4014
		cycleSpeed 12
	)
)

(instance muchBody of PicView
	(properties
		x 289
		y 189
		view 175
		loop 12
		priority 14
		signal $4000
	)
)

(instance muchHead of Prop
	(properties
		x 293
		y 118
		view 175
		loop 11
		priority 15
		signal $4014
		cycleSpeed 12
	)
)

(instance death2InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0aac
			pushi    3
			pushi    1169
			pushi    0
			pushSelf
			call     localproc_0097,  6
			jmp      code_0b42
code_0aac:
			dup     
			ldi      1
			eq?     
			bnt      code_0ac6
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    1
			pushSelf
			call     localproc_0037,  6
			jmp      code_0b42
code_0ac6:
			dup     
			ldi      2
			eq?     
			bnt      code_0ae0
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    2
			pushSelf
			call     localproc_000e,  6
			jmp      code_0b42
code_0ae0:
			dup     
			ldi      3
			eq?     
			bnt      code_0afb
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    3
			pushSelf
			call     localproc_0037,  6
			jmp      code_0b42
code_0afb:
			dup     
			ldi      4
			eq?     
			bnt      code_0b16
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    4
			pushSelf
			call     localproc_0063,  6
			jmp      code_0b42
code_0b16:
			dup     
			ldi      5
			eq?     
			bnt      code_0b31
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    5
			pushSelf
			call     localproc_0097,  6
			jmp      code_0b42
code_0b31:
			dup     
			ldi      6
			eq?     
			bnt      code_0b42
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_0b42:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0a88
			lap      param1
			not     
			bnt      code_0a88
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0a91
code_0a88:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_0a91:
			ret     
		)
	)
)

(instance death3InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bc1
			pushi    3
			pushi    1169
			pushi    6
			pushSelf
			call     localproc_0063,  6
			jmp      code_0c23
code_0bc1:
			dup     
			ldi      1
			eq?     
			bnt      code_0bdc
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    7
			pushSelf
			call     localproc_0037,  6
			jmp      code_0c23
code_0bdc:
			dup     
			ldi      2
			eq?     
			bnt      code_0bf7
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    8
			pushSelf
			call     localproc_0097,  6
			jmp      code_0c23
code_0bf7:
			dup     
			ldi      3
			eq?     
			bnt      code_0c12
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    9
			pushSelf
			call     localproc_000e,  6
			jmp      code_0c23
code_0c12:
			dup     
			ldi      4
			eq?     
			bnt      code_0c23
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_0c23:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0b9c
			lap      param1
			not     
			bnt      code_0b9c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0ba5
code_0b9c:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_0ba5:
			ret     
		)
	)
)

(instance death4InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ca3
			pushi    3
			pushi    1169
			pushi    10
			pushSelf
			call     localproc_000e,  6
			jmp      code_0d20
code_0ca3:
			dup     
			ldi      1
			eq?     
			bnt      code_0cbe
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    11
			pushSelf
			call     localproc_0063,  6
			jmp      code_0d20
code_0cbe:
			dup     
			ldi      2
			eq?     
			bnt      code_0cd9
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    12
			pushSelf
			call     localproc_0037,  6
			jmp      code_0d20
code_0cd9:
			dup     
			ldi      3
			eq?     
			bnt      code_0cf4
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    13
			pushSelf
			call     localproc_00cb,  6
			jmp      code_0d20
code_0cf4:
			dup     
			ldi      4
			eq?     
			bnt      code_0d0f
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    14
			pushSelf
			call     localproc_0097,  6
			jmp      code_0d20
code_0d0f:
			dup     
			ldi      5
			eq?     
			bnt      code_0d20
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_0d20:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0c7e
			lap      param1
			not     
			bnt      code_0c7e
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0c87
code_0c7e:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_0c87:
			ret     
		)
	)
)

(instance death1InFairRgn of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d9f
			pushi    3
			pushi    1169
			pushi    15
			pushSelf
			call     localproc_0063,  6
			jmp      code_0e01
code_0d9f:
			dup     
			ldi      1
			eq?     
			bnt      code_0dba
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    16
			pushSelf
			call     localproc_0037,  6
			jmp      code_0e01
code_0dba:
			dup     
			ldi      2
			eq?     
			bnt      code_0dd5
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    17
			pushSelf
			call     localproc_000e,  6
			jmp      code_0e01
code_0dd5:
			dup     
			ldi      3
			eq?     
			bnt      code_0df0
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    18
			pushSelf
			call     localproc_0097,  6
			jmp      code_0e01
code_0df0:
			dup     
			ldi      4
			eq?     
			bnt      code_0e01
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_0e01:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0d7a
			lap      param1
			not     
			bnt      code_0d7a
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0d83
code_0d7a:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_0d83:
			ret     
		)
	)
)

(instance deathInRm360 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e81
			pushi    3
			pushi    1169
			pushi    19
			pushSelf
			call     localproc_0097,  6
			jmp      code_0ee3
code_0e81:
			dup     
			ldi      1
			eq?     
			bnt      code_0e9c
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    20
			pushSelf
			call     localproc_00cb,  6
			jmp      code_0ee3
code_0e9c:
			dup     
			ldi      2
			eq?     
			bnt      code_0eb7
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    21
			pushSelf
			call     localproc_0037,  6
			jmp      code_0ee3
code_0eb7:
			dup     
			ldi      3
			eq?     
			bnt      code_0ed2
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    22
			pushSelf
			call     localproc_000e,  6
			jmp      code_0ee3
code_0ed2:
			dup     
			ldi      4
			eq?     
			bnt      code_0ee3
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ee3:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0e5c
			lap      param1
			not     
			bnt      code_0e5c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0e65
code_0e5c:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_0e65:
			ret     
		)
	)
)

(instance death1InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f63
			pushi    3
			pushi    1169
			pushi    23
			pushSelf
			call     localproc_0037,  6
			jmp      code_0fe1
code_0f63:
			dup     
			ldi      1
			eq?     
			bnt      code_0f7f
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    24
			pushSelf
			call     localproc_000e,  6
			selfID  
			jmp      code_0fe1
code_0f7f:
			dup     
			ldi      2
			eq?     
			bnt      code_0f9a
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    25
			pushSelf
			call     localproc_0063,  6
			jmp      code_0fe1
code_0f9a:
			dup     
			ldi      3
			eq?     
			bnt      code_0fb5
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    26
			pushSelf
			call     localproc_0097,  6
			jmp      code_0fe1
code_0fb5:
			dup     
			ldi      4
			eq?     
			bnt      code_0fd0
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    27
			pushSelf
			call     localproc_0063,  6
			jmp      code_0fe1
code_0fd0:
			dup     
			ldi      5
			eq?     
			bnt      code_0fe1
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_0fe1:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0f3e
			lap      param1
			not     
			bnt      code_0f3e
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0f47
code_0f3e:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_0f47:
			ret     
		)
	)
)

(instance death2InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1061
			pushi    3
			pushi    1169
			pushi    28
			pushSelf
			call     localproc_0097,  6
			jmp      code_10c3
code_1061:
			dup     
			ldi      1
			eq?     
			bnt      code_107c
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    29
			pushSelf
			call     localproc_000e,  6
			jmp      code_10c3
code_107c:
			dup     
			ldi      2
			eq?     
			bnt      code_1097
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    30
			pushSelf
			call     localproc_0037,  6
			jmp      code_10c3
code_1097:
			dup     
			ldi      3
			eq?     
			bnt      code_10b2
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    31
			pushSelf
			call     localproc_0097,  6
			jmp      code_10c3
code_10b2:
			dup     
			ldi      4
			eq?     
			bnt      code_10c3
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_10c3:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_103c
			lap      param1
			not     
			bnt      code_103c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1045
code_103c:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1045:
			ret     
		)
	)
)

(instance death3InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1143
			pushi    3
			pushi    1169
			pushi    32
			pushSelf
			call     localproc_0037,  6
			jmp      code_11c0
code_1143:
			dup     
			ldi      1
			eq?     
			bnt      code_115e
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    33
			pushSelf
			call     localproc_0063,  6
			jmp      code_11c0
code_115e:
			dup     
			ldi      2
			eq?     
			bnt      code_1179
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    34
			pushSelf
			call     localproc_00cb,  6
			jmp      code_11c0
code_1179:
			dup     
			ldi      3
			eq?     
			bnt      code_1194
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    35
			pushSelf
			call     localproc_000e,  6
			jmp      code_11c0
code_1194:
			dup     
			ldi      4
			eq?     
			bnt      code_11af
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    36
			pushSelf
			call     localproc_0097,  6
			jmp      code_11c0
code_11af:
			dup     
			ldi      5
			eq?     
			bnt      code_11c0
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_11c0:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_111e
			lap      param1
			not     
			bnt      code_111e
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1127
code_111e:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1127:
			ret     
		)
	)
)

(instance death4InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_123f
			pushi    3
			pushi    1169
			pushi    37
			pushSelf
			call     localproc_0097,  6
			jmp      code_12bc
code_123f:
			dup     
			ldi      1
			eq?     
			bnt      code_125a
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    38
			pushSelf
			call     localproc_0063,  6
			jmp      code_12bc
code_125a:
			dup     
			ldi      2
			eq?     
			bnt      code_1275
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    39
			pushSelf
			call     localproc_0037,  6
			jmp      code_12bc
code_1275:
			dup     
			ldi      3
			eq?     
			bnt      code_1290
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    40
			pushSelf
			call     localproc_000e,  6
			jmp      code_12bc
code_1290:
			dup     
			ldi      4
			eq?     
			bnt      code_12ab
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    41
			pushSelf
			call     localproc_0097,  6
			jmp      code_12bc
code_12ab:
			dup     
			ldi      5
			eq?     
			bnt      code_12bc
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_12bc:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_121a
			lap      param1
			not     
			bnt      code_121a
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1223
code_121a:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1223:
			ret     
		)
	)
)

(instance death1InAbyRegn of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_133b
			pushi    3
			pushi    1169
			pushi    42
			pushSelf
			call     localproc_0037,  6
			jmp      code_13b8
code_133b:
			dup     
			ldi      1
			eq?     
			bnt      code_1356
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    43
			pushSelf
			call     localproc_0063,  6
			jmp      code_13b8
code_1356:
			dup     
			ldi      2
			eq?     
			bnt      code_1371
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    44
			pushSelf
			call     localproc_0097,  6
			jmp      code_13b8
code_1371:
			dup     
			ldi      3
			eq?     
			bnt      code_138c
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    45
			pushSelf
			call     localproc_00cb,  6
			jmp      code_13b8
code_138c:
			dup     
			ldi      4
			eq?     
			bnt      code_13a7
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    46
			pushSelf
			call     localproc_0097,  6
			jmp      code_13b8
code_13a7:
			dup     
			ldi      5
			eq?     
			bnt      code_13b8
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_13b8:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1316
			lap      param1
			not     
			bnt      code_1316
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_131f
code_1316:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_131f:
			ret     
		)
	)
)

(instance death2InAbyRegn of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1437
			pushi    3
			pushi    1169
			pushi    47
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1499
code_1437:
			dup     
			ldi      1
			eq?     
			bnt      code_1452
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    48
			pushSelf
			call     localproc_0063,  6
			jmp      code_1499
code_1452:
			dup     
			ldi      2
			eq?     
			bnt      code_146d
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    49
			pushSelf
			call     localproc_0037,  6
			jmp      code_1499
code_146d:
			dup     
			ldi      3
			eq?     
			bnt      code_1488
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    50
			pushSelf
			call     localproc_000e,  6
			jmp      code_1499
code_1488:
			dup     
			ldi      4
			eq?     
			bnt      code_1499
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1499:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1412
			lap      param1
			not     
			bnt      code_1412
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_141b
code_1412:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_141b:
			ret     
		)
	)
)

(instance death3InAbyRegn of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1519
			pushi    3
			pushi    1169
			pushi    51
			pushSelf
			call     localproc_000e,  6
			jmp      code_15e7
code_1519:
			dup     
			ldi      1
			eq?     
			bnt      code_1534
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    52
			pushSelf
			call     localproc_0037,  6
			jmp      code_15e7
code_1534:
			dup     
			ldi      2
			eq?     
			bnt      code_154f
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    53
			pushSelf
			call     localproc_0063,  6
			jmp      code_15e7
code_154f:
			dup     
			ldi      3
			eq?     
			bnt      code_156a
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    54
			pushSelf
			call     localproc_0097,  6
			jmp      code_15e7
code_156a:
			dup     
			ldi      4
			eq?     
			bnt      code_1585
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    55
			pushSelf
			call     localproc_0063,  6
			jmp      code_15e7
code_1585:
			dup     
			ldi      5
			eq?     
			bnt      code_15a0
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    56
			pushSelf
			call     localproc_0097,  6
			jmp      code_15e7
code_15a0:
			dup     
			ldi      6
			eq?     
			bnt      code_15bb
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    57
			pushSelf
			call     localproc_0037,  6
			jmp      code_15e7
code_15bb:
			dup     
			ldi      7
			eq?     
			bnt      code_15d6
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    58
			pushSelf
			call     localproc_0097,  6
			jmp      code_15e7
code_15d6:
			dup     
			ldi      8
			eq?     
			bnt      code_15e7
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_15e7:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_14f4
			lap      param1
			not     
			bnt      code_14f4
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_14fd
code_14f4:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_14fd:
			ret     
		)
	)
)

(instance death1InRm440 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1667
			pushi    3
			pushi    1169
			pushi    59
			pushSelf
			call     localproc_0063,  6
			jmp      code_16c9
code_1667:
			dup     
			ldi      1
			eq?     
			bnt      code_1682
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    60
			pushSelf
			call     localproc_0037,  6
			jmp      code_16c9
code_1682:
			dup     
			ldi      2
			eq?     
			bnt      code_169d
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    61
			pushSelf
			call     localproc_000e,  6
			jmp      code_16c9
code_169d:
			dup     
			ldi      3
			eq?     
			bnt      code_16b8
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    62
			pushSelf
			call     localproc_0063,  6
			jmp      code_16c9
code_16b8:
			dup     
			ldi      4
			eq?     
			bnt      code_16c9
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_16c9:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1642
			lap      param1
			not     
			bnt      code_1642
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_164b
code_1642:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_164b:
			ret     
		)
	)
)

(instance death2InRm440 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1749
			pushi    3
			pushi    1169
			pushi    63
			pushSelf
			call     localproc_000e,  6
			jmp      code_17ab
code_1749:
			dup     
			ldi      1
			eq?     
			bnt      code_1764
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    64
			pushSelf
			call     localproc_0097,  6
			jmp      code_17ab
code_1764:
			dup     
			ldi      2
			eq?     
			bnt      code_177f
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    65
			pushSelf
			call     localproc_0037,  6
			jmp      code_17ab
code_177f:
			dup     
			ldi      3
			eq?     
			bnt      code_179a
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    66
			pushSelf
			call     localproc_0063,  6
			jmp      code_17ab
code_179a:
			dup     
			ldi      4
			eq?     
			bnt      code_17ab
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_17ab:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1724
			lap      param1
			not     
			bnt      code_1724
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_172d
code_1724:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_172d:
			ret     
		)
	)
)

(instance death1InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_182b
			pushi    3
			pushi    1169
			pushi    67
			pushSelf
			call     localproc_0063,  6
			jmp      code_18a3
code_182b:
			dup     
			ldi      1
			eq?     
			bnt      code_1846
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    68
			pushSelf
			call     localproc_0037,  6
			jmp      code_18a3
code_1846:
			dup     
			ldi      2
			eq?     
			bnt      code_1861
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    69
			pushSelf
			call     localproc_000e,  6
			jmp      code_18a3
code_1861:
			dup     
			ldi      3
			eq?     
			bnt      code_1877
			pushi    3
			pushi    1169
			pushi    70
			pushSelf
			call     localproc_000e,  6
			jmp      code_18a3
code_1877:
			dup     
			ldi      4
			eq?     
			bnt      code_1892
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    71
			pushSelf
			call     localproc_0097,  6
			jmp      code_18a3
code_1892:
			dup     
			ldi      5
			eq?     
			bnt      code_18a3
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_18a3:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1806
			lap      param1
			not     
			bnt      code_1806
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_180f
code_1806:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_180f:
			ret     
		)
	)
)

(instance death2InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1923
			pushi    3
			pushi    1169
			pushi    72
			pushSelf
			call     localproc_0063,  6
			jmp      code_19a0
code_1923:
			dup     
			ldi      1
			eq?     
			bnt      code_193e
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    73
			pushSelf
			call     localproc_0097,  6
			jmp      code_19a0
code_193e:
			dup     
			ldi      2
			eq?     
			bnt      code_1959
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    74
			pushSelf
			call     localproc_0037,  6
			jmp      code_19a0
code_1959:
			dup     
			ldi      3
			eq?     
			bnt      code_1974
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    75
			pushSelf
			call     localproc_000e,  6
			jmp      code_19a0
code_1974:
			dup     
			ldi      4
			eq?     
			bnt      code_198f
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1169
			pushi    76
			pushSelf
			call     localproc_0063,  6
			jmp      code_19a0
code_198f:
			dup     
			ldi      5
			eq?     
			bnt      code_19a0
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_19a0:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_18fe
			lap      param1
			not     
			bnt      code_18fe
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1907
code_18fe:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1907:
			ret     
		)
	)
)

(instance death3InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a1f
			pushi    3
			pushi    1169
			pushi    77
			pushSelf
			call     localproc_0097,  6
			jmp      code_1a81
code_1a1f:
			dup     
			ldi      1
			eq?     
			bnt      code_1a3a
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    78
			pushSelf
			call     localproc_0037,  6
			jmp      code_1a81
code_1a3a:
			dup     
			ldi      2
			eq?     
			bnt      code_1a55
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    79
			pushSelf
			call     localproc_0063,  6
			jmp      code_1a81
code_1a55:
			dup     
			ldi      3
			eq?     
			bnt      code_1a70
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1169
			pushi    80
			pushSelf
			call     localproc_000e,  6
			jmp      code_1a81
code_1a70:
			dup     
			ldi      4
			eq?     
			bnt      code_1a81
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1a81:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_19fa
			lap      param1
			not     
			bnt      code_19fa
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1a03
code_19fa:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1a03:
			ret     
		)
	)
)

(instance death4InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b01
			pushi    3
			pushi    1169
			pushi    81
			pushSelf
			call     localproc_0037,  6
			jmp      code_1bb4
code_1b01:
			dup     
			ldi      1
			eq?     
			bnt      code_1b1c
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    82
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1bb4
code_1b1c:
			dup     
			ldi      2
			eq?     
			bnt      code_1b37
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    83
			pushSelf
			call     localproc_0097,  6
			jmp      code_1bb4
code_1b37:
			dup     
			ldi      3
			eq?     
			bnt      code_1b52
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1169
			pushi    84
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1bb4
code_1b52:
			dup     
			ldi      4
			eq?     
			bnt      code_1b6d
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    85
			pushSelf
			call     localproc_0037,  6
			jmp      code_1bb4
code_1b6d:
			dup     
			ldi      5
			eq?     
			bnt      code_1b88
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1169
			pushi    86
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1bb4
code_1b88:
			dup     
			ldi      6
			eq?     
			bnt      code_1ba3
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1169
			pushi    87
			pushSelf
			call     localproc_0037,  6
			jmp      code_1bb4
code_1ba3:
			dup     
			ldi      7
			eq?     
			bnt      code_1bb4
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1bb4:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1adc
			lap      param1
			not     
			bnt      code_1adc
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1ae5
code_1adc:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1ae5:
			ret     
		)
	)
)

(instance death1InRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c32
			pushi    3
			pushi    1170
			pushi    0
			pushSelf
			call     localproc_0037,  6
			jmp      code_1c77
code_1c32:
			dup     
			ldi      1
			eq?     
			bnt      code_1c4c
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    1
			pushSelf
			call     localproc_000e,  6
			jmp      code_1c77
code_1c4c:
			dup     
			ldi      2
			eq?     
			bnt      code_1c66
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    2
			pushSelf
			call     localproc_0063,  6
			jmp      code_1c77
code_1c66:
			dup     
			ldi      3
			eq?     
			bnt      code_1c77
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1c77:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1c0e
			lap      param1
			not     
			bnt      code_1c0e
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1c17
code_1c0e:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1c17:
			ret     
		)
	)
)

(instance death2InRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cf7
			pushi    3
			pushi    1170
			pushi    3
			pushSelf
			call     localproc_0063,  6
			jmp      code_1d74
code_1cf7:
			dup     
			ldi      1
			eq?     
			bnt      code_1d12
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    4
			pushSelf
			call     localproc_0037,  6
			jmp      code_1d74
code_1d12:
			dup     
			ldi      2
			eq?     
			bnt      code_1d2d
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    5
			pushSelf
			call     localproc_000e,  6
			jmp      code_1d74
code_1d2d:
			dup     
			ldi      3
			eq?     
			bnt      code_1d48
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    6
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1d74
code_1d48:
			dup     
			ldi      4
			eq?     
			bnt      code_1d63
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    7
			pushSelf
			call     localproc_0097,  6
			jmp      code_1d74
code_1d63:
			dup     
			ldi      5
			eq?     
			bnt      code_1d74
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1d74:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1cd2
			lap      param1
			not     
			bnt      code_1cd2
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1cdb
code_1cd2:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1cdb:
			ret     
		)
	)
)

(instance deathInRm650 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1df3
			pushi    3
			pushi    1170
			pushi    8
			pushSelf
			call     localproc_0097,  6
			jmp      code_1e70
code_1df3:
			dup     
			ldi      1
			eq?     
			bnt      code_1e0e
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    9
			pushSelf
			call     localproc_0063,  6
			jmp      code_1e70
code_1e0e:
			dup     
			ldi      2
			eq?     
			bnt      code_1e29
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    10
			pushSelf
			call     localproc_0037,  6
			jmp      code_1e70
code_1e29:
			dup     
			ldi      3
			eq?     
			bnt      code_1e44
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    11
			pushSelf
			call     localproc_000e,  6
			jmp      code_1e70
code_1e44:
			dup     
			ldi      4
			eq?     
			bnt      code_1e5f
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    12
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1e70
code_1e5f:
			dup     
			ldi      5
			eq?     
			bnt      code_1e70
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1e70:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1dce
			lap      param1
			not     
			bnt      code_1dce
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1dd7
code_1dce:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1dd7:
			ret     
		)
	)
)

(instance deathInWatrGate of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1eef
			pushi    3
			pushi    1170
			pushi    90
			pushSelf
			call     localproc_0097,  6
			jmp      code_1f6c
code_1eef:
			dup     
			ldi      1
			eq?     
			bnt      code_1f0a
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    91
			pushSelf
			call     localproc_0063,  6
			jmp      code_1f6c
code_1f0a:
			dup     
			ldi      2
			eq?     
			bnt      code_1f25
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    92
			pushSelf
			call     localproc_00cb,  6
			jmp      code_1f6c
code_1f25:
			dup     
			ldi      3
			eq?     
			bnt      code_1f40
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    93
			pushSelf
			call     localproc_0037,  6
			jmp      code_1f6c
code_1f40:
			dup     
			ldi      4
			eq?     
			bnt      code_1f5b
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    94
			pushSelf
			call     localproc_000e,  6
			jmp      code_1f6c
code_1f5b:
			dup     
			ldi      5
			eq?     
			bnt      code_1f6c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_1f6c:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1eca
			lap      param1
			not     
			bnt      code_1eca
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1ed3
code_1eca:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1ed3:
			ret     
		)
	)
)

(instance deathInRm470 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1feb
			pushi    3
			pushi    1170
			pushi    13
			pushSelf
			call     localproc_000e,  6
			jmp      code_2068
code_1feb:
			dup     
			ldi      1
			eq?     
			bnt      code_2006
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    14
			pushSelf
			call     localproc_0063,  6
			jmp      code_2068
code_2006:
			dup     
			ldi      2
			eq?     
			bnt      code_2021
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    15
			pushSelf
			call     localproc_0037,  6
			jmp      code_2068
code_2021:
			dup     
			ldi      3
			eq?     
			bnt      code_203c
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    16
			pushSelf
			call     localproc_0097,  6
			jmp      code_2068
code_203c:
			dup     
			ldi      4
			eq?     
			bnt      code_2057
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    17
			pushSelf
			call     localproc_0063,  6
			jmp      code_2068
code_2057:
			dup     
			ldi      5
			eq?     
			bnt      code_2068
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2068:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1fc6
			lap      param1
			not     
			bnt      code_1fc6
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1fcf
code_1fc6:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_1fcf:
			ret     
		)
	)
)

(instance death1InRm500 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20e7
			pushi    3
			pushi    1170
			pushi    18
			pushSelf
			call     localproc_0037,  6
			jmp      code_219a
code_20e7:
			dup     
			ldi      1
			eq?     
			bnt      code_2102
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    19
			pushSelf
			call     localproc_0063,  6
			jmp      code_219a
code_2102:
			dup     
			ldi      2
			eq?     
			bnt      code_211d
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    20
			pushSelf
			call     localproc_000e,  6
			jmp      code_219a
code_211d:
			dup     
			ldi      3
			eq?     
			bnt      code_2138
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    21
			pushSelf
			call     localproc_0097,  6
			jmp      code_219a
code_2138:
			dup     
			ldi      4
			eq?     
			bnt      code_2153
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    22
			pushSelf
			call     localproc_0037,  6
			jmp      code_219a
code_2153:
			dup     
			ldi      5
			eq?     
			bnt      code_216e
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    23
			pushSelf
			call     localproc_0097,  6
			jmp      code_219a
code_216e:
			dup     
			ldi      6
			eq?     
			bnt      code_2189
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    24
			pushSelf
			call     localproc_0037,  6
			jmp      code_219a
code_2189:
			dup     
			ldi      7
			eq?     
			bnt      code_219a
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_219a:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_20c2
			lap      param1
			not     
			bnt      code_20c2
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_20cb
code_20c2:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_20cb:
			ret     
		)
	)
)

(instance death2InRm500 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2219
			pushi    3
			pushi    1170
			pushi    25
			pushSelf
			call     localproc_0037,  6
			jmp      code_22b1
code_2219:
			dup     
			ldi      1
			eq?     
			bnt      code_2234
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    26
			pushSelf
			call     localproc_00cb,  6
			jmp      code_22b1
code_2234:
			dup     
			ldi      2
			eq?     
			bnt      code_224f
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    27
			pushSelf
			call     localproc_0037,  6
			jmp      code_22b1
code_224f:
			dup     
			ldi      3
			eq?     
			bnt      code_226a
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    28
			pushSelf
			call     localproc_0097,  6
			jmp      code_22b1
code_226a:
			dup     
			ldi      4
			eq?     
			bnt      code_2285
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    29
			pushSelf
			call     localproc_0063,  6
			jmp      code_22b1
code_2285:
			dup     
			ldi      5
			eq?     
			bnt      code_22a0
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    30
			pushSelf
			call     localproc_000e,  6
			jmp      code_22b1
code_22a0:
			dup     
			ldi      6
			eq?     
			bnt      code_22b1
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_22b1:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_21f4
			lap      param1
			not     
			bnt      code_21f4
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_21fd
code_21f4:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_21fd:
			ret     
		)
	)
)

(instance death1InRm530 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2331
			pushi    3
			pushi    1170
			pushi    31
			pushSelf
			call     localproc_00cb,  6
			jmp      code_23ae
code_2331:
			dup     
			ldi      1
			eq?     
			bnt      code_234c
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    32
			pushSelf
			call     localproc_0063,  6
			jmp      code_23ae
code_234c:
			dup     
			ldi      2
			eq?     
			bnt      code_2367
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    33
			pushSelf
			call     localproc_0037,  6
			jmp      code_23ae
code_2367:
			dup     
			ldi      3
			eq?     
			bnt      code_2382
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    34
			pushSelf
			call     localproc_000e,  6
			jmp      code_23ae
code_2382:
			dup     
			ldi      4
			eq?     
			bnt      code_239d
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    35
			pushSelf
			call     localproc_0097,  6
			jmp      code_23ae
code_239d:
			dup     
			ldi      5
			eq?     
			bnt      code_23ae
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_23ae:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_230c
			lap      param1
			not     
			bnt      code_230c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2315
code_230c:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2315:
			ret     
		)
	)
)

(instance death2InRm530 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_242d
			pushi    3
			pushi    1170
			pushi    36
			pushSelf
			call     localproc_0063,  6
			jmp      code_2474
code_242d:
			dup     
			ldi      1
			eq?     
			bnt      code_2448
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    37
			pushSelf
			call     localproc_0037,  6
			jmp      code_2474
code_2448:
			dup     
			ldi      2
			eq?     
			bnt      code_2463
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    38
			pushSelf
			call     localproc_00cb,  6
			jmp      code_2474
code_2463:
			dup     
			ldi      3
			eq?     
			bnt      code_2474
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2474:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2408
			lap      param1
			not     
			bnt      code_2408
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2411
code_2408:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2411:
			ret     
		)
	)
)

(instance death3InRm530 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_24f3
			pushi    3
			pushi    1170
			pushi    39
			pushSelf
			call     localproc_0063,  6
			jmp      code_2570
code_24f3:
			dup     
			ldi      1
			eq?     
			bnt      code_250e
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    40
			pushSelf
			call     localproc_00cb,  6
			jmp      code_2570
code_250e:
			dup     
			ldi      2
			eq?     
			bnt      code_2529
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    41
			pushSelf
			call     localproc_000e,  6
			jmp      code_2570
code_2529:
			dup     
			ldi      3
			eq?     
			bnt      code_2544
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    42
			pushSelf
			call     localproc_0037,  6
			jmp      code_2570
code_2544:
			dup     
			ldi      4
			eq?     
			bnt      code_255f
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    43
			pushSelf
			call     localproc_0063,  6
			jmp      code_2570
code_255f:
			dup     
			ldi      5
			eq?     
			bnt      code_2570
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2570:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_24ce
			lap      param1
			not     
			bnt      code_24ce
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_24d7
code_24ce:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_24d7:
			ret     
		)
	)
)

(instance deathInRm550 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_25ef
			pushi    3
			pushi    1170
			pushi    44
			pushSelf
			call     localproc_0097,  6
			jmp      code_266c
code_25ef:
			dup     
			ldi      1
			eq?     
			bnt      code_260a
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    45
			pushSelf
			call     localproc_0037,  6
			jmp      code_266c
code_260a:
			dup     
			ldi      2
			eq?     
			bnt      code_2625
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    46
			pushSelf
			call     localproc_00cb,  6
			jmp      code_266c
code_2625:
			dup     
			ldi      3
			eq?     
			bnt      code_2640
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    47
			pushSelf
			call     localproc_000e,  6
			jmp      code_266c
code_2640:
			dup     
			ldi      4
			eq?     
			bnt      code_265b
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    48
			pushSelf
			call     localproc_0063,  6
			jmp      code_266c
code_265b:
			dup     
			ldi      5
			eq?     
			bnt      code_266c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_266c:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_25ca
			lap      param1
			not     
			bnt      code_25ca
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_25d3
code_25ca:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_25d3:
			ret     
		)
	)
)

(instance death1InRm570 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_26eb
			pushi    3
			pushi    1170
			pushi    49
			pushSelf
			call     localproc_0097,  6
			jmp      code_2783
code_26eb:
			dup     
			ldi      1
			eq?     
			bnt      code_2706
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    50
			pushSelf
			call     localproc_0037,  6
			jmp      code_2783
code_2706:
			dup     
			ldi      2
			eq?     
			bnt      code_2721
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    51
			pushSelf
			call     localproc_0063,  6
			jmp      code_2783
code_2721:
			dup     
			ldi      3
			eq?     
			bnt      code_273c
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    52
			pushSelf
			call     localproc_00cb,  6
			jmp      code_2783
code_273c:
			dup     
			ldi      4
			eq?     
			bnt      code_2757
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    53
			pushSelf
			call     localproc_000e,  6
			jmp      code_2783
code_2757:
			dup     
			ldi      5
			eq?     
			bnt      code_2772
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    54
			pushSelf
			call     localproc_0037,  6
			jmp      code_2783
code_2772:
			dup     
			ldi      6
			eq?     
			bnt      code_2783
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2783:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_26c6
			lap      param1
			not     
			bnt      code_26c6
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_26cf
code_26c6:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_26cf:
			ret     
		)
	)
)

(instance death2InRm570 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2803
			pushi    3
			pushi    1170
			pushi    55
			pushSelf
			call     localproc_0097,  6
			jmp      code_28b1
code_2803:
			dup     
			ldi      1
			eq?     
			bnt      code_281e
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    56
			pushSelf
			call     localproc_0037,  6
			jmp      code_28b1
code_281e:
			dup     
			ldi      2
			eq?     
			bnt      code_2839
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    57
			pushSelf
			call     localproc_0063,  6
			jmp      code_28b1
code_2839:
			dup     
			ldi      3
			eq?     
			bnt      code_2854
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    58
			pushSelf
			call     localproc_000e,  6
			jmp      code_28b1
code_2854:
			dup     
			ldi      4
			eq?     
			bnt      code_286f
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    59
			pushSelf
			call     localproc_00cb,  6
			jmp      code_28b1
code_286f:
			dup     
			ldi      5
			eq?     
			bnt      code_288a
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    60
			pushSelf
			call     localproc_0037,  6
			jmp      code_28b1
code_288a:
			dup     
			ldi      6
			eq?     
			bnt      code_28a0
			pushi    3
			pushi    1170
			pushi    61
			pushSelf
			call     localproc_0037,  6
			jmp      code_28b1
code_28a0:
			dup     
			ldi      7
			eq?     
			bnt      code_28b1
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_28b1:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_27de
			lap      param1
			not     
			bnt      code_27de
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_27e7
code_27de:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_27e7:
			ret     
		)
	)
)

(instance deathInForest of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2931
			pushi    3
			pushi    1170
			pushi    62
			pushSelf
			call     localproc_000e,  6
			jmp      code_2993
code_2931:
			dup     
			ldi      1
			eq?     
			bnt      code_294c
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    63
			pushSelf
			call     localproc_0037,  6
			jmp      code_2993
code_294c:
			dup     
			ldi      2
			eq?     
			bnt      code_2967
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    64
			pushSelf
			call     localproc_0063,  6
			jmp      code_2993
code_2967:
			dup     
			ldi      3
			eq?     
			bnt      code_2982
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    65
			pushSelf
			call     localproc_0097,  6
			jmp      code_2993
code_2982:
			dup     
			ldi      4
			eq?     
			bnt      code_2993
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2993:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_290c
			lap      param1
			not     
			bnt      code_290c
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2915
code_290c:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2915:
			ret     
		)
	)
)

(instance death5InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2a13
			pushi    3
			pushi    1170
			pushi    66
			pushSelf
			call     localproc_0037,  6
			jmp      code_2a90
code_2a13:
			dup     
			ldi      1
			eq?     
			bnt      code_2a2e
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    67
			pushSelf
			call     localproc_0063,  6
			jmp      code_2a90
code_2a2e:
			dup     
			ldi      2
			eq?     
			bnt      code_2a49
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    68
			pushSelf
			call     localproc_000e,  6
			jmp      code_2a90
code_2a49:
			dup     
			ldi      3
			eq?     
			bnt      code_2a64
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    69
			pushSelf
			call     localproc_0097,  6
			jmp      code_2a90
code_2a64:
			dup     
			ldi      4
			eq?     
			bnt      code_2a7f
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    70
			pushSelf
			call     localproc_0037,  6
			jmp      code_2a90
code_2a7f:
			dup     
			ldi      5
			eq?     
			bnt      code_2a90
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2a90:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_29ee
			lap      param1
			not     
			bnt      code_29ee
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_29f7
code_29ee:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_29f7:
			ret     
		)
	)
)

(instance deathInRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2b0f
			pushi    3
			pushi    1170
			pushi    71
			pushSelf
			call     localproc_00cb,  6
			jmp      code_2ba7
code_2b0f:
			dup     
			ldi      1
			eq?     
			bnt      code_2b2a
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    72
			pushSelf
			call     localproc_0063,  6
			jmp      code_2ba7
code_2b2a:
			dup     
			ldi      2
			eq?     
			bnt      code_2b45
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    73
			pushSelf
			call     localproc_0037,  6
			jmp      code_2ba7
code_2b45:
			dup     
			ldi      3
			eq?     
			bnt      code_2b60
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    74
			pushSelf
			call     localproc_000e,  6
			jmp      code_2ba7
code_2b60:
			dup     
			ldi      4
			eq?     
			bnt      code_2b7b
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    75
			pushSelf
			call     localproc_0037,  6
			jmp      code_2ba7
code_2b7b:
			dup     
			ldi      5
			eq?     
			bnt      code_2b96
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    76
			pushSelf
			call     localproc_000e,  6
			jmp      code_2ba7
code_2b96:
			dup     
			ldi      6
			eq?     
			bnt      code_2ba7
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2ba7:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2aea
			lap      param1
			not     
			bnt      code_2aea
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2af3
code_2aea:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2af3:
			ret     
		)
	)
)

(instance deathInRm320 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2c27
			pushi    3
			pushi    1170
			pushi    77
			pushSelf
			call     localproc_0097,  6
			jmp      code_2c89
code_2c27:
			dup     
			ldi      1
			eq?     
			bnt      code_2c42
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    78
			pushSelf
			call     localproc_0063,  6
			jmp      code_2c89
code_2c42:
			dup     
			ldi      2
			eq?     
			bnt      code_2c5d
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    79
			pushSelf
			call     localproc_000e,  6
			jmp      code_2c89
code_2c5d:
			dup     
			ldi      3
			eq?     
			bnt      code_2c78
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    80
			pushSelf
			call     localproc_0037,  6
			jmp      code_2c89
code_2c78:
			dup     
			ldi      4
			eq?     
			bnt      code_2c89
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2c89:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2c02
			lap      param1
			not     
			bnt      code_2c02
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2c0b
code_2c02:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2c0b:
			ret     
		)
	)
)

(instance getInBoatRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2d09
			pushi    3
			pushi    1170
			pushi    81
			pushSelf
			call     localproc_0037,  6
			jmp      code_2d6b
code_2d09:
			dup     
			ldi      1
			eq?     
			bnt      code_2d24
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    82
			pushSelf
			call     localproc_0063,  6
			jmp      code_2d6b
code_2d24:
			dup     
			ldi      2
			eq?     
			bnt      code_2d3f
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    83
			pushSelf
			call     localproc_000e,  6
			jmp      code_2d6b
code_2d3f:
			dup     
			ldi      3
			eq?     
			bnt      code_2d5a
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    84
			pushSelf
			call     localproc_0097,  6
			jmp      code_2d6b
code_2d5a:
			dup     
			ldi      4
			eq?     
			bnt      code_2d6b
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2d6b:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2ce4
			lap      param1
			not     
			bnt      code_2ce4
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2ced
code_2ce4:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2ced:
			ret     
		)
	)
)

(instance death2InFairRgn of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2deb
			pushi    3
			pushi    1170
			pushi    85
			pushSelf
			call     localproc_0063,  6
			jmp      code_2e68
code_2deb:
			dup     
			ldi      1
			eq?     
			bnt      code_2e06
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    86
			pushSelf
			call     localproc_0037,  6
			jmp      code_2e68
code_2e06:
			dup     
			ldi      2
			eq?     
			bnt      code_2e21
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    87
			pushSelf
			call     localproc_00cb,  6
			jmp      code_2e68
code_2e21:
			dup     
			ldi      3
			eq?     
			bnt      code_2e3c
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    88
			pushSelf
			call     localproc_000e,  6
			jmp      code_2e68
code_2e3c:
			dup     
			ldi      4
			eq?     
			bnt      code_2e57
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    89
			pushSelf
			call     localproc_0097,  6
			jmp      code_2e68
code_2e57:
			dup     
			ldi      5
			eq?     
			bnt      code_2e68
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2e68:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2dc6
			lap      param1
			not     
			bnt      code_2dc6
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2dcf
code_2dc6:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2dcf:
			ret     
		)
	)
)

(instance deathInRm501 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2ee7
			pushi    3
			pushi    1170
			pushi    95
			pushSelf
			call     localproc_0063,  6
			jmp      code_2f64
code_2ee7:
			dup     
			ldi      1
			eq?     
			bnt      code_2f02
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    96
			pushSelf
			call     localproc_0037,  6
			jmp      code_2f64
code_2f02:
			dup     
			ldi      2
			eq?     
			bnt      code_2f1d
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    97
			pushSelf
			call     localproc_0097,  6
			jmp      code_2f64
code_2f1d:
			dup     
			ldi      3
			eq?     
			bnt      code_2f38
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    98
			pushSelf
			call     localproc_000e,  6
			jmp      code_2f64
code_2f38:
			dup     
			ldi      4
			eq?     
			bnt      code_2f53
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    99
			pushSelf
			call     localproc_0097,  6
			jmp      code_2f64
code_2f53:
			dup     
			ldi      5
			eq?     
			bnt      code_2f64
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2f64:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2ec2
			lap      param1
			not     
			bnt      code_2ec2
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2ecb
code_2ec2:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2ecb:
			ret     
		)
	)
)

(instance deathInRm710 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2fe3
			pushi    3
			pushi    1170
			pushi    100
			pushSelf
			call     localproc_0097,  6
			jmp      code_2ff4
code_2fe3:
			dup     
			ldi      1
			eq?     
			bnt      code_2ff4
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_2ff4:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_2fbe
			lap      param1
			not     
			bnt      code_2fbe
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2fc7
code_2fbe:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_2fc7:
			ret     
		)
	)
)

(instance death5InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3073
			pushi    3
			pushi    1170
			pushi    101
			pushSelf
			call     localproc_000e,  6
			jmp      code_3106
code_3073:
			dup     
			ldi      1
			eq?     
			bnt      code_308e
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    102
			pushSelf
			call     localproc_0037,  6
			jmp      code_3106
code_308e:
			dup     
			ldi      2
			eq?     
			bnt      code_30a9
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    103
			pushSelf
			call     localproc_0097,  6
			jmp      code_3106
code_30a9:
			dup     
			ldi      3
			eq?     
			bnt      code_30c4
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    104
			pushSelf
			call     localproc_0063,  6
			jmp      code_3106
code_30c4:
			dup     
			ldi      4
			eq?     
			bnt      code_30da
			pushi    3
			pushi    1170
			pushi    105
			pushSelf
			call     localproc_0063,  6
			jmp      code_3106
code_30da:
			dup     
			ldi      5
			eq?     
			bnt      code_30f5
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    106
			pushSelf
			call     localproc_000e,  6
			jmp      code_3106
code_30f5:
			dup     
			ldi      6
			eq?     
			bnt      code_3106
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_3106:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_304e
			lap      param1
			not     
			bnt      code_304e
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_3057
code_304e:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_3057:
			ret     
		)
	)
)

(instance tooLateInTheHedge of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3185
			pushi    3
			pushi    1170
			pushi    107
			pushSelf
			call     localproc_0063,  6
			jmp      code_321d
code_3185:
			dup     
			ldi      1
			eq?     
			bnt      code_31a0
			pushi    0
			call     localproc_010e,  0
			pushi    3
			pushi    1170
			pushi    108
			pushSelf
			call     localproc_000e,  6
			jmp      code_321d
code_31a0:
			dup     
			ldi      2
			eq?     
			bnt      code_31bb
			pushi    0
			call     localproc_00f4,  0
			pushi    3
			pushi    1170
			pushi    109
			pushSelf
			call     localproc_00cb,  6
			jmp      code_321d
code_31bb:
			dup     
			ldi      3
			eq?     
			bnt      code_31d6
			pushi    0
			call     localproc_0101,  0
			pushi    3
			pushi    1170
			pushi    110
			pushSelf
			call     localproc_0097,  6
			jmp      code_321d
code_31d6:
			dup     
			ldi      4
			eq?     
			bnt      code_31f1
			pushi    0
			call     localproc_0140,  0
			pushi    3
			pushi    1170
			pushi    111
			pushSelf
			call     localproc_0037,  6
			jmp      code_321d
code_31f1:
			dup     
			ldi      5
			eq?     
			bnt      code_320c
			pushi    0
			call     localproc_0127,  0
			pushi    3
			pushi    1170
			pushi    112
			pushSelf
			call     localproc_0063,  6
			jmp      code_321d
code_320c:
			dup     
			ldi      6
			eq?     
			bnt      code_321d
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
code_321d:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_3160
			lap      param1
			not     
			bnt      code_3160
			pushi    0
			call     localproc_0159,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_3169
code_3160:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_3169:
			ret     
		)
	)
)
