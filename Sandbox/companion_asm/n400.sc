;;; Sierra Script 1.0 - (do not remove this comment)
(script# 400)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n851)
(use n946)
(use n950)
(use n951)
(use n955)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm400 0
	proc400_1 1
	sheriff 2
	table 3
	guards 4
	giles 5
	roger 6
	proc400_7 7
	proc400_8 8
)

(local
	[local0 4] = [1400 0 1]
	[local4 4] = [1400 1 1]
	[local8 4] = [1400 2 1]
	[local12 13] = [1400 3 1 0 -1 5534 19]
	[local25 4] = [1400 4 1]
)
(procedure (proc400_1 param1 param2 param3 &tmp temp0 temp1 temp2 temp3)
	(asm
		lsp      argc
		ldi      1
		ge?     
		bnt      code_03af
		lap      param1
		jmp      code_03b1
code_03af:
		lag      global0
code_03b1:
		sat      temp0
		lsp      argc
		ldi      2
		ge?     
		bnt      code_03c0
		lap      param2
		jmp      code_03c2
code_03c0:
		ldi      10
code_03c2:
		sat      temp1
		lsp      argc
		ldi      3
		ge?     
		bnt      code_03ce
		lap      param3
code_03ce:
		sat      temp2
		pushi    #respondsTo
		pushi    1
		pushi    674
		send     6
		bnt      code_03e3
		pushi    #notKilled
		pushi    0
		lat      temp2
		send     4
code_03e3:
		sat      temp3
		bnt      code_03fc
		pushi    #setScript
		pushi    3
		lofsa    MoveBack
		push    
		lst      temp2
		lst      temp1
		lat      temp0
		send     10
		jmp      code_0409
code_03fc:
		lat      temp2
		bnt      code_0409
		pushi    #cue
		pushi    1
		lst      temp3
		send     6
code_0409:
		ret     
	)
)

(procedure (proc400_7 param1 param2 param3 param4)
	(asm
		lsp      argc
		ldi      4
		lt?     
		bt       code_04ea
		lap      param4
code_04ea:
		bnt      code_04fd
		pushi    4
		lsp      param1
		lsp      param2
		pushi    80
		lofsa    {***STUB:}
		push    
		calle    proc255_0,  8
code_04fd:
		lsp      argc
		ldi      3
		ge?     
		bnt      code_0512
		lap      param3
		bnt      code_0512
		pushi    #cue
		pushi    0
		lap      param3
		send     4
code_0512:
		ret     
	)
)

(procedure (proc400_8 param1 param2 param3)
	(asm
		lsp      argc
		ldi      3
		lt?     
		bnt      code_04cd
		pushi    10
		lsp      param1
		lsp      param2
		pushi    80
		lofsa    {***STUB ASK:}
		push    
		pushi    81
		lofsa    {yes}
		push    
		pushi    1
		pushi    81
		lofsa    {no}
		push    
		pushi    0
		calle    proc255_0,  20
		jmp      code_04df
code_04cd:
		pushi    4
		lsp      param1
		lsp      param2
		pushi    80
		lofsa    {***STUB ASK:}
		push    
		&rest    param3
		calle    proc255_0,  8
code_04df:
		ret     
	)
)

(class GuardFollow of Motion
	(properties
		client 0
		caller 0
		x 0
		y 0
		dx 0
		dy 0
		b-moveCnt 0
		b-i1 0
		b-i2 0
		b-di 0
		b-xAxis 0
		b-incr 0
		completed 0
		xLast 0
		yLast 0
		who 0
		distance 20
	)
	
	(method (init param1 param2 param3)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0052
			lap      param1
			aTop     client
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0052
			lap      param2
			aTop     who
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0052
			lap      param3
			aTop     distance
code_0052:
			pushi    #onTarget
			pushi    0
			self     4
			not     
			bnt      code_007b
			pushi    #init
			pushi    3
			pTos     client
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			super    Motion,  10
			pushi    #doit
			pushi    0
			super    Motion,  4
code_007b:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #onTarget
			pushi    0
			self     4
			not     
			bnt      code_00ec
			pushi    #init
			pushi    3
			pTos     client
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			super    Motion,  10
			pushi    #doit
			pushi    0
			super    Motion,  4
			jmp      code_00fe
code_00ec:
			pushi    #x
			pushi    0
			pToa     client
			send     4
			aTop     xLast
			pushi    #y
			pushi    0
			pToa     client
			send     4
			aTop     yLast
code_00fe:
			pushi    228
			pushi    1
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #x
			pushi    0
			pToa     who
			send     4
			lt?     
			bnt      code_011a
			ldi      90
			jmp      code_0130
code_011a:
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #x
			pushi    0
			pToa     who
			send     4
			gt?     
			bnt      code_0130
			ldi      270
code_0130:
			push    
			pToa     client
			send     6
			ret     
		)
	)
	
	(method (moveDone)
		(asm
			ret     
		)
	)
	
	(method (setTarget param1)
		(asm
			lap      argc
			bnt      code_009c
			pushi    #setTarget
			pushi    0
			&rest    param1
			super    Motion,  4
			jmp      code_00bd
code_009c:
			pushi    #onTarget
			pushi    0
			self     4
			not     
			bnt      code_00bd
			pushi    #setTarget
			pushi    2
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			super    Motion,  8
code_00bd:
			ret     
		)
	)
	
	(method (onTarget)
		(asm
			pushi    #distanceTo
			pushi    1
			pTos     who
			pToa     client
			send     6
			push    
			pToa     distance
			le?     
			ret     
		)
	)
)

(instance GuardTrack of Track
	(properties)
	
	(method (doit &tmp [temp0 2])
		(asm
			pushi    1
			lsg      global88
			pToa     b-moveCnt
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			ge?     
			bnt      code_025b
			lag      global88
			aTop     b-moveCnt
			pushi    #x
			pushi    0
			pToa     client
			send     4
			aTop     xLast
			pushi    #y
			pushi    0
			pToa     client
			send     4
			aTop     yLast
			pushi    #x
			pushi    0
			pToa     who
			send     4
			push    
			pToa     xOffset
			add     
			aTop     x
			pushi    #y
			pushi    0
			pToa     who
			send     4
			push    
			pToa     yOffset
			add     
			aTop     y
			pushi    4
			pushi    #superClass
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			pToa     who
			send     4
			push    
			pToa     zOffset
			add     
			push    
			pToa     client
			send     18
			pTos     x
			pToa     xLast
			ne?     
			bt       code_0226
			pTos     y
			pToa     yLast
			ne?     
code_0226:
			bnt      code_025b
			pushi    228
			pushi    1
			pushi    #heading
			pushi    0
			pToa     who
			send     4
			bnt      code_023a
			jmp      code_0256
code_023a:
			pushi    0
			pushi    #heading
			pushi    0
			lag      global0
			send     4
			le?     
			bnt      code_0253
			pprev   
			ldi      180
			le?     
			bnt      code_0253
			ldi      90
			jmp      code_0256
code_0253:
			ldi      270
code_0256:
			push    
			pToa     client
			send     6
code_025b:
			ret     
		)
	)
)

(class GuardStopWalk of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init param1 param2)
		(asm
			lap      argc
			bnt      code_02be
			pushi    #view
			pushi    0
			lap      param1
			aTop     client
			send     4
			aTop     vWalking
			lsp      argc
			ldi      2
			ge?     
			bnt      code_02be
			lap      param2
			aTop     vStopped
code_02be:
			pushi    #init
			pushi    1
			pTos     client
			super    Fwd,  6
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			bnt      code_031b
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vWalking
			eq?     
			bnt      code_0338
			pushi    #view
			pushi    1
			pTos     vStopped
			pToa     client
			send     6
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp1
			pushi    #doit
			pushi    0
			super    Fwd,  4
			jmp      code_0338
code_031b:
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vStopped
			eq?     
			bnt      code_0332
			pushi    #view
			pushi    1
			pTos     vWalking
			pToa     client
			send     6
code_0332:
			pushi    #doit
			pushi    0
			super    Fwd,  4
code_0338:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vStopped
			eq?     
			bnt      code_02de
			pushi    #view
			pushi    1
			pTos     vWalking
			pToa     client
			send     6
code_02de:
			pushi    #dispose
			pushi    0
			super    Fwd,  4
			ret     
		)
	)
)

(instance MoveBack of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0439
			pushi    0
			callb    proc0_2,  0
			pushi    #setLoop
			pushi    0
			pushi    150
			pushi    1
			class    Rev
			push    
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
			jmp      code_0465
code_0439:
			dup     
			ldi      1
			eq?     
			bnt      code_0465
			pTos     client
			lag      global0
			eq?     
			bnt      code_044f
			pushi    0
			callb    proc0_2,  0
			jmp      code_0460
code_044f:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			pushi    65535
			pToa     client
			send     12
code_0460:
			pushi    #dispose
			pushi    0
			self     4
code_0465:
			toss    
			ret     
		)
	)
)

(instance rm400 of Rm
	(properties
		picture 400
		west 390
		picAngle 70
	)
	
	(method (init param1)
		(asm
			pushi    #init
			pushi    0
			&rest    param1
			super    Rm,  4
			pushi    17
			lofsa    table
			push    
			lofsa    leftChair
			push    
			lofsa    book
			push    
			lofsa    deer
			push    
			lofsa    halberd
			push    
			lofsa    alcove
			push    
			lofsa    alcoveWindow
			push    
			lofsa    desk
			push    
			lofsa    shelves
			push    
			lofsa    crowShield
			push    
			lofsa    stripeShield
			push    
			lofsa    rug
			push    
			lofsa    leftTorch
			push    
			lofsa    rightTorch
			push    
			lofsa    fireplace
			push    
			lofsa    firewood
			push    
			lofsa    bench
			push    
			calle    proc806_3,  34
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    8
			pushi    0
			pushi    157
			pushi    #approachX
			pushi    0
			lofsa    table
			send     4
			push    
			pushi    157
			pushi    #approachX
			pushi    0
			lofsa    table
			send     4
			push    
			pushi    155
			pushi    0
			pushi    155
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     6
			pushi    #posn
			pushi    2
			pushi    60
			pushi    156
			pushi    6
			pushi    1
			pushi    0
			pushi    58
			pushi    1
			pushi    90
			pushi    107
			pushi    0
			pushi    289
			pushi    0
			lag      global0
			send     28
			pushi    0
			callb    proc0_2,  0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    GuardFollow
			push    
			lsg      global0
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0622
			ldi      30
			jmp      code_0624
code_0622:
			ldi      2
code_0624:
			push    
			lofsa    guards
			send     26
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    guards
			send     4
			push    
			ldi      15
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    guards
			send     4
			push    
			ldi      9
			add     
			push    
			pushi    107
			pushi    0
			pushi    289
			pushi    0
			pushi    150
			pushi    2
			class    GuardStopWalk
			push    
			pushi    754
			pushi    283
			pushi    4
			pushi    1
			lofsa    GuardTrack
			push    
			callk    Clone,  2
			push    
			lofsa    guards
			push    
			pushi    15
			pushi    9
			lofsa    giles
			send     36
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    guards
			send     4
			push    
			ldi      65521
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    guards
			send     4
			push    
			ldi      65530
			add     
			push    
			pushi    107
			pushi    0
			pushi    289
			pushi    0
			pushi    150
			pushi    2
			class    GuardStopWalk
			push    
			pushi    754
			pushi    283
			pushi    4
			pushi    1
			lofsa    GuardTrack
			push    
			callk    Clone,  2
			push    
			lofsa    guards
			push    
			pushi    65521
			pushi    65530
			lofsa    roger
			send     36
			pushi    #posn
			pushi    3
			pushi    179
			pushi    145
			pushi    18
			pushi    273
			pushi    1
			pushi    #approachX
			pushi    0
			lofsa    table
			send     4
			push    
			pushi    274
			pushi    1
			pushi    #approachY
			pushi    0
			lofsa    table
			send     4
			push    
			pushi    107
			pushi    0
			lofsa    sheriff
			send     26
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_070c
			pushi    #init
			pushi    0
			pushi    2
			pushi    403
			pushi    1
			callk    ScriptID,  4
			send     4
code_070c:
			pushi    2
			lsg      global0
			lofsa    sheriff
			push    
			callb    proc0_9,  4
			pushi    #number
			pushi    1
			pushi    391
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
	
	(method (dispose param1)
		(asm
			pushi    1
			pushi    401
			callk    DisposeScript,  2
			pushi    1
			pushi    402
			callk    DisposeScript,  2
			pushi    1
			pushi    403
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_077e
			lsg      global126
			ldi      4
			eq?     
			bnt      code_078b
			pushi    2
			ldi      0
			lsli     local25
			ldi      1
			lsli     local25
			calle    proc13_4,  4
			jmp      code_078b
code_077e:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Rm,  8
code_078b:
			toss    
			ret     
		)
	)
	
	(method (newRoom newRoomNumber param2)
		(asm
			lsp      newRoomNumber
			dup     
			ldi      390
			eq?     
			bnt      code_0741
			pushi    0
			callb    proc0_4,  0
code_0741:
			toss    
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			&rest    param2
			super    Rm,  6
			ret     
		)
	)
)

(instance roomInit of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_07f3
			ldi      1
			aTop     cycles
			jmp      code_0866
code_07f3:
			dup     
			ldi      1
			eq?     
			bnt      code_0866
			lsg      global126
			dup     
			ldi      6
			eq?     
			bnt      code_0817
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    401
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0865
code_0817:
			dup     
			ldi      4
			eq?     
			bnt      code_0844
			pushi    #actions
			pushi    1
			pushi    2
			pushi    402
			pushi    1
			callk    ScriptID,  4
			push    
			lofsa    sheriff
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    402
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0865
code_0844:
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0865
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    403
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
code_0865:
			toss    
code_0866:
			toss    
			ret     
		)
	)
)

(instance guards of Actor
	(properties
		heading 90
		lookStr 5631
		view 753
		loop 6
	)
	
	(method (init param1)
		(asm
			pushi    #setLoop
			pushi    0
			self     4
			pushi    #init
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
			bnt      code_08ca
			pushi    2
			ldi      0
			lsli     local4
			ldi      1
			lsli     local4
			calle    proc13_4,  4
			jmp      code_0904
code_08ca:
			dup     
			ldi      5
			eq?     
			bnt      code_08e1
			pushi    2
			ldi      0
			lsli     local12
			ldi      1
			lsli     local12
			calle    proc13_4,  4
			jmp      code_0904
code_08e1:
			dup     
			ldi      10
			eq?     
			bnt      code_08f7
			pushi    3
			pushi    1400
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_0904
code_08f7:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Actor,  8
code_0904:
			toss    
			ret     
		)
	)
)

(instance giles of Actor
	(properties
		heading 90
		view 753
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    guards
			send     4
			ret     
		)
	)
)

(instance roger of Actor
	(properties
		heading 90
		view 753
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    guards
			send     4
			ret     
		)
	)
)

(instance sheriff of Prop
	(properties
		lookStr 5711
		view 401
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    173
			pushi    101
			pushi    182
			pushi    101
			pushi    190
			pushi    120
			pushi    180
			pushi    127
			pushi    160
			pushi    121
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			aTop     onMeCheck
			pushi    #approachVerbs
			pushi    1
			pushi    5
			self     6
			pushi    #init
			pushi    0
			&rest    param1
			super    Prop,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			ldi      0
			aTop     onMeCheck
			pushi    #dispose
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0b1f
			pushi    2
			ldi      0
			lsli     local0
			ldi      1
			lsli     local0
			calle    proc13_4,  4
			jmp      code_0b42
code_0b1f:
			dup     
			ldi      10
			eq?     
			bnt      code_0b35
			pushi    3
			pushi    1400
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b42
code_0b35:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Prop,  8
code_0b42:
			toss    
			ret     
		)
	)
)

(instance table of Feature
	(properties
		x 144
		y 156
		approachX 144
		approachY 156
		lookStr 5756
	)
	
	(method (init param1)
		(asm
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0bd0
			ldi      144
			jmp      code_0bd2
code_0bd0:
			ldi      110
code_0bd2:
			aTop     approachX
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    50
			pushi    136
			pushi    115
			pushi    189
			pushi    129
			pushi    189
			pushi    132
			pushi    183
			pushi    136
			pushi    184
			pushi    144
			pushi    189
			pushi    143
			pushi    190
			pushi    148
			pushi    183
			pushi    151
			pushi    175
			pushi    148
			pushi    173
			pushi    154
			pushi    160
			pushi    161
			pushi    157
			pushi    155
			pushi    165
			pushi    151
			pushi    168
			pushi    139
			pushi    160
			pushi    143
			pushi    156
			pushi    141
			pushi    154
			pushi    145
			pushi    134
			pushi    139
			pushi    119
			pushi    145
			pushi    114
			pushi    142
			pushi    123
			pushi    138
			pushi    118
			pushi    134
			pushi    117
			pushi    128
			pushi    110
			pushi    126
			pushi    111
			pushi    122
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     114
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0c98
			pushi    2
			ldi      0
			lsli     local8
			ldi      1
			lsli     local8
			calle    proc13_4,  4
			jmp      code_0ca5
code_0c98:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Feature,  8
code_0ca5:
			toss    
			ret     
		)
	)
)

(instance leftChair of Feature
	(properties
		x 152
		y 97
		lookStr 5797
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    143
			pushi    116
			pushi    143
			pushi    97
			pushi    161
			pushi    97
			pushi    161
			pushi    121
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

(instance book of Feature
	(properties
		x 30
		y 103
		lookStr 5877
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    34
			pushi    25
			pushi    103
			pushi    38
			pushi    105
			pushi    41
			pushi    118
			pushi    33
			pushi    118
			pushi    33
			pushi    132
			pushi    38
			pushi    140
			pushi    40
			pushi    143
			pushi    40
			pushi    145
			pushi    35
			pushi    145
			pushi    30
			pushi    137
			pushi    25
			pushi    144
			pushi    21
			pushi    147
			pushi    17
			pushi    146
			pushi    28
			pushi    133
			pushi    28
			pushi    118
			pushi    18
			pushi    118
			pushi    12
			pushi    109
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     82
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance deer of Feature
	(properties
		x 39
		y 36
		lookStr 5971
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    36
			pushi    67
			pushi    31
			pushi    63
			pushi    28
			pushi    52
			pushi    21
			pushi    46
			pushi    20
			pushi    36
			pushi    31
			pushi    36
			pushi    37
			pushi    42
			pushi    52
			pushi    32
			pushi    52
			pushi    44
			pushi    45
			pushi    50
			pushi    44
			pushi    63
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance halberd of Feature
	(properties
		x 94
		y 35
		lookStr 6071
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    54
			pushi    43
			pushi    129
			pushi    35
			pushi    140
			pushi    39
			pushi    138
			pushi    43
			pushi    116
			pushi    43
			pushi    50
			pushi    47
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance alcove of Feature
	(properties
		x 92
		y 54
		lookStr 6095
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    125
			pushi    54
			pushi    125
			pushi    117
			pushi    56
			pushi    130
			pushi    56
			pushi    61
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

(instance alcoveWindow of Feature
	(properties
		x 67
		y 60
		lookStr 6136
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    57
			pushi    70
			pushi    62
			pushi    66
			pushi    62
			pushi    61
			pushi    73
			pushi    60
			pushi    75
			pushi    62
			pushi    75
			pushi    67
			pushi    80
			pushi    71
			pushi    80
			pushi    96
			pushi    57
			pushi    98
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance desk of Feature
	(properties
		x 105
		y 78
		lookStr 6192
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    90
			pushi    98
			pushi    83
			pushi    97
			pushi    83
			pushi    91
			pushi    96
			pushi    78
			pushi    121
			pushi    84
			pushi    121
			pushi    116
			pushi    110
			pushi    118
			pushi    109
			pushi    114
			pushi    97
			pushi    111
			pushi    88
			pushi    113
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance shelves of Feature
	(properties
		x 105
		y 55
		lookStr 6210
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    89
			pushi    58
			pushi    123
			pushi    55
			pushi    123
			pushi    79
			pushi    114
			pushi    81
			pushi    97
			pushi    77
			pushi    89
			pushi    80
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance crowShield of Feature
	(properties
		x 214
		y 42
		lookStr 6258
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    48
			pushi    203
			pushi    73
			pushi    202
			pushi    53
			pushi    200
			pushi    59
			pushi    191
			pushi    57
			pushi    188
			pushi    42
			pushi    206
			pushi    42
			pushi    209
			pushi    47
			pushi    205
			pushi    49
			pushi    208
			pushi    54
			pushi    228
			pushi    56
			pushi    224
			pushi    51
			pushi    230
			pushi    45
			pushi    235
			pushi    50
			pushi    238
			pushi    48
			pushi    242
			pushi    52
			pushi    237
			pushi    61
			pushi    229
			pushi    62
			pushi    223
			pushi    77
			pushi    228
			pushi    85
			pushi    225
			pushi    87
			pushi    218
			pushi    80
			pushi    213
			pushi    83
			pushi    208
			pushi    79
			pushi    199
			pushi    83
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     110
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance stripeShield of Feature
	(properties
		x 145
		y 56
		lookStr 6464
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    136
			pushi    56
			pushi    148
			pushi    56
			pushi    154
			pushi    66
			pushi    149
			pushi    86
			pushi    143
			pushi    89
			pushi    136
			pushi    80
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance rug of Feature
	(properties
		x 160
		y 119
		lookStr 6595
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    67
			pushi    139
			pushi    146
			pushi    119
			pushi    232
			pushi    148
			pushi    172
			pushi    179
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

(instance leftTorch of Feature
	(properties
		x 170
		y 49
		lookStr 6640
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    163
			pushi    49
			pushi    172
			pushi    49
			pushi    180
			pushi    60
			pushi    167
			pushi    69
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

(instance rightTorch of Feature
	(properties
		x 270
		y 129
		z 64
		lookStr 6640
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    269
			pushi    88
			pushi    262
			pushi    65
			pushi    272
			pushi    65
			pushi    273
			pushi    65
			pushi    278
			pushi    75
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
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance fireplace of Feature
	(properties
		x 222
		y 85
		lookStr 6675
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    185
			pushi    85
			pushi    193
			pushi    80
			pushi    244
			pushi    91
			pushi    237
			pushi    129
			pushi    199
			pushi    121
			pushi    196
			pushi    93
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance firewood of Feature
	(properties
		x 257
		y 115
		lookStr 6730
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    239
			pushi    123
			pushi    255
			pushi    115
			pushi    298
			pushi    124
			pushi    298
			pushi    143
			pushi    291
			pushi    140
			pushi    272
			pushi    149
			pushi    235
			pushi    140
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)

(instance bench of Feature
	(properties
		x 310
		y 161
		lookStr 6760
	)
	
	(method (init param1)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    314
			pushi    161
			pushi    319
			pushi    175
			pushi    319
			pushi    189
			pushi    297
			pushi    189
			pushi    295
			pushi    177
			pushi    289
			pushi    177
			pushi    289
			pushi    173
			pushi    294
			pushi    169
			pushi    292
			pushi    161
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			aTop     onMeCheck
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
)
