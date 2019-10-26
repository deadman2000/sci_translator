;;; Sierra Script 1.0 - (do not remove this comment)
(script# 851)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n928)
(use n941)
(use n998)
(use n999)

(public
	proc851_0 0
	proc851_1 1
	talker1 2
	talker2 3
)

(local
	local0
	local1
	local2
	[local3 6]
	local9
	local10 =  1
	local11
	local12
	local13
	[local14 198] = [2 0 2 4 21 35 18 24 0 2 3 2 4 25 39 20 28 0 2 9 2 4 19 36 18 23 0 31 0 2 4 23 37 21 24 0 56 0 2 4 13 37 15 25 0 35 0 2 4 24 35 26 21 0 38 0 2 4 23 32 17 20 0 18 0 2 4 20 38 19 26 0 27 0 2 4 21 40 20 29 0 58 0 2 4 23 37 22 27 26 42 0 2 4 24 41 23 29 29 45 0 2 4 19 37 20 25 17 153 0 2 4 12 35 15 25 1 162 0 2 4 21 33 20 22 2 156 0 2 4 17 31 18 22 3 159 0 2 4 24 38 21 25 4 165 0 2 4 22 30 21 19 5 -1 4210 19 0 0 0 0 0 0 -1 4216 19 0 0 0 0 0 0 -1 4222 19 0 0 0 0 0 0 209 0 2 4 22 39 19 29 9 209 3 2 4 27 34 26 25 9]
	[local212 4] = [13 245 13 245]
	[local216 4] = [12 12 107 107]
	[local220 4] = [94 30 94 30]
	[local224 4] = [30 30 125 125]
	[local228 9]
)
(procedure (proc851_0 param1 param2 param3 param4 param5 param6 &tmp temp0)
	(asm
		lag      global25
		bnt      code_0510
		pushi    #dispose
		pushi    0
		send     4
code_0510:
		pushi    #nsTop
		pushi    1
		lsl      local216
		pushi    10
		pushi    1
		lsl      local212
		pushi    4
		pushi    1
		lsl      local220
		pushi    3
		pushi    1
		lsl      local224
		lofsa    talker1
		send     24
		lsp      param1
		ldi      1000
		ugt?    
		bnt      code_07ee
		lap      param1
		sal      local0
		lap      param2
		sal      local1
		lsp      argc
		ldi      2
		gt?     
		bnt      code_0547
		lap      param3
		jmp      code_0549
code_0547:
		ldi      0
code_0549:
		sal      local2
		lsp      argc
		ldi      3
		gt?     
		bnt      code_0558
		lap      param4
		jmp      code_055a
code_0558:
		ldi      0
code_055a:
		sal      local9
		pushi    2
		lsl      local0
		pushi    0
		calle    proc999_6,  4
		sal      local11
		pushi    2
		lsl      local0
		pushi    1
		calle    proc999_6,  4
		sal      local13
		lsp      argc
		ldi      5
		gt?     
		bnt      code_0581
		lap      param6
		jmp      code_059e
code_0581:
		lal      local9
		bnt      code_059c
		pushi    #respondsTo
		pushi    1
		pushi    674
		send     6
		bnt      code_059c
		pushi    #notKilled
		pushi    0
		lal      local9
		send     4
		jmp      code_059e
code_059c:
		ldi      1
code_059e:
		not     
		bnt      code_05af
		lal      local9
		bnt      code_05ae
		pushi    #cue
		pushi    1
		pushi    0
		send     6
code_05ae:
		ret     
code_05af:
		pushi    #register
		pushi    1
		pushi    1
		pushi    674
		pushi    1
		pushi    1
		class    Conversation
		send     12
		pushi    1
		lsl      local1
		call     localproc_0b0c,  2
		sal      local1
		pushi    2
		push    
		pushi    0
		calle    proc999_6,  4
		push    
		ldi      65535
		ne?     
		bnt      code_06ad
		pushi    5
		pushi    #superClass
		pushi    2
		lsl      local1
		pushi    0
		calle    proc999_6,  4
		push    
		pushi    6
		pushi    1
		pushi    2
		lsl      local1
		pushi    1
		calle    proc999_6,  4
		sat      temp0
		push    
		ldi      1
		add     
		push    
		pushi    10
		pushi    1
		pushi    2
		lsl      local1
		pushi    2
		calle    proc999_6,  4
		push    
		pushi    9
		pushi    1
		pushi    2
		lsl      local1
		pushi    3
		calle    proc999_6,  4
		push    
		lofsa    bust1
		send     24
		pushi    #view
		pushi    1
		pushi    2
		lsl      local1
		pushi    0
		calle    proc999_6,  4
		push    
		pushi    6
		pushi    1
		lst      temp0
		pushi    10
		pushi    1
		pushi    2
		lsl      local1
		pushi    4
		calle    proc999_6,  4
		push    
		pushi    9
		pushi    1
		pushi    2
		lsl      local1
		pushi    5
		calle    proc999_6,  4
		push    
		lofsa    mouth1
		send     24
		pushi    5
		pushi    #superClass
		pushi    2
		lsl      local1
		pushi    0
		calle    proc999_6,  4
		push    
		pushi    6
		pushi    1
		pushi    2
		lsl      local1
		pushi    1
		calle    proc999_6,  4
		sat      temp0
		push    
		ldi      2
		add     
		push    
		pushi    10
		pushi    1
		pushi    2
		lsl      local1
		pushi    6
		calle    proc999_6,  4
		push    
		pushi    9
		pushi    1
		pushi    2
		lsl      local1
		pushi    7
		calle    proc999_6,  4
		push    
		lofsa    eyes1
		send     24
		pushi    #init
		pushi    3
		lofsa    bust1
		push    
		lofsa    eyes1
		push    
		lofsa    mouth1
		push    
		lofsa    talker1
		send     10
		jmp      code_06bc
code_06ad:
		pushi    #loop
		pushi    5
		pushi    1
		pushi    107
		pushi    0
		pushi    0
		pushi    0
		lofsa    talker1
		send     14
code_06bc:
		lal      local2
		bnt      code_07ce
		pushi    1
		push    
		call     localproc_0b0c,  2
		sal      local2
		pushi    2
		push    
		pushi    0
		calle    proc999_6,  4
		push    
		ldi      65535
		ne?     
		bnt      code_07b7
		pushi    5
		pushi    #superClass
		pushi    2
		lsl      local2
		pushi    0
		calle    proc999_6,  4
		push    
		pushi    6
		pushi    1
		pushi    2
		lsl      local2
		pushi    1
		calle    proc999_6,  4
		sat      temp0
		push    
		ldi      1
		add     
		push    
		pushi    10
		pushi    1
		pushi    2
		lsl      local2
		pushi    2
		calle    proc999_6,  4
		push    
		pushi    9
		pushi    1
		pushi    2
		lsl      local2
		pushi    3
		calle    proc999_6,  4
		push    
		lofsa    bust2
		send     24
		pushi    #view
		pushi    1
		pushi    2
		lsl      local2
		pushi    0
		calle    proc999_6,  4
		push    
		pushi    6
		pushi    1
		lst      temp0
		pushi    10
		pushi    1
		pushi    2
		lsl      local2
		pushi    4
		calle    proc999_6,  4
		push    
		pushi    9
		pushi    1
		pushi    2
		lsl      local2
		pushi    5
		calle    proc999_6,  4
		push    
		lofsa    mouth2
		send     24
		pushi    5
		pushi    #superClass
		pushi    2
		lsl      local2
		pushi    0
		calle    proc999_6,  4
		push    
		pushi    6
		pushi    1
		pushi    2
		lsl      local2
		pushi    1
		calle    proc999_6,  4
		sat      temp0
		push    
		ldi      2
		add     
		push    
		pushi    10
		pushi    1
		pushi    2
		lsl      local2
		pushi    6
		calle    proc999_6,  4
		push    
		pushi    9
		pushi    1
		pushi    2
		lsl      local2
		pushi    7
		calle    proc999_6,  4
		push    
		lofsa    eyes2
		send     24
		pushi    #init
		pushi    3
		lofsa    bust2
		push    
		lofsa    eyes2
		push    
		lofsa    mouth2
		push    
		pushi    138
		pushi    1
		class    Conversation
		push    
		lofsa    talker2
		send     16
		jmp      code_07ce
code_07b7:
		pushi    #loop
		pushi    1
		pushi    1
		pushi    107
		pushi    3
		pushi    0
		pushi    0
		pushi    0
		pushi    138
		pushi    1
		class    Conversation
		push    
		lofsa    talker2
		send     22
code_07ce:
		lsp      argc
		ldi      4
		gt?     
		bnt      code_07db
		lap      param5
		jmp      code_07dd
code_07db:
		ldi      1
code_07dd:
		sal      local10
		pushi    #setScript
		pushi    1
		class    Conversation
		push    
		lofsa    talker1
		send     6
		jmp      code_08a9
code_07ee:
		lap      param1
		sal      local228
		lap      param2
		sal      local0
		ldi      1
		sat      temp0
code_07fa:
		lst      temp0
		lal      local228
		le?     
		bnt      code_0829
		pushi    2
		lat      temp0
		mul     
		lspi     param1
		lat      temp0
		sali     local0
		pushi    2
		lat      temp0
		mul     
		lspi     param2
		lat      temp0
		sali     local228
		pushi    1
		lat      temp0
		lsli     local0
		call     localproc_0b0c,  2
		push    
		lat      temp0
		sali     local0
		+at      temp0
		jmp      code_07fa
code_0829:
		lsp      argc
		pushi    2
		pushi    2
		lal      local228
		mul     
		add     
		gt?     
		bnt      code_083e
		pushi    2
		lal      local228
		mul     
		lapi     param3
		jmp      code_0840
code_083e:
		ldi      0
code_0840:
		sal      local9
		pushi    2
		lsl      local0
		pushi    0
		calle    proc999_6,  4
		sal      local11
		pushi    2
		lsl      local0
		pushi    1
		calle    proc999_6,  4
		sal      local13
		pushi    137
		pushi    1
		pushi    1
		pushi    674
		pushi    1
		lsp      argc
		pushi    4
		pushi    2
		lal      local228
		mul     
		add     
		gt?     
		bnt      code_0879
		pushi    2
		lal      local228
		mul     
		lapi     param5
		jmp      code_0896
code_0879:
		lal      local9
		bnt      code_0894
		pushi    #respondsTo
		pushi    1
		pushi    674
		send     6
		bnt      code_0894
		pushi    #notKilled
		pushi    0
		lal      local9
		send     4
		jmp      code_0896
code_0894:
		ldi      1
code_0896:
		push    
		lofsa    crowd
		send     12
		pushi    #setScript
		pushi    1
		lofsa    crowd
		push    
		lofsa    talker1
		send     6
code_08a9:
		ret     
	)
)

(procedure (proc851_1 param1)
	(asm
		pushi    #setCursor
		pushi    2
		pushi    999
		pushi    1
		lag      global1
		send     8
		pushi    10
		lofsa    {LOOKUP\_ERROR}
		push    
		pushi    67
		pushi    65535
		pushi    155
		pushi    81
		lofsa    {Aye}
		push    
		pushi    1
		pushi    81
		lofsa    {Nay}
		push    
		pushi    0
		&rest    param1
		calle    proc255_0,  20
		ret     
	)
)

(procedure (localproc_0b0c param1)
	(asm
		lsp      param1
		ldi      1000
		ult?    
		bnt      code_0b81
		lsp      param1
		ldi      999
		eq?     
		bnt      code_0b74
		lsg      global126
		dup     
		ldi      0
		eq?     
		bnt      code_0b2c
		ldi      1
		jmp      code_0b71
code_0b2c:
		dup     
		ldi      1
		eq?     
		bnt      code_0b38
		ldi      7
		jmp      code_0b71
code_0b38:
		dup     
		ldi      2
		eq?     
		bnt      code_0b44
		ldi      4
		jmp      code_0b71
code_0b44:
		dup     
		ldi      3
		eq?     
		bnt      code_0b50
		ldi      5
		jmp      code_0b71
code_0b50:
		dup     
		ldi      4
		eq?     
		bnt      code_0b5c
		ldi      6
		jmp      code_0b71
code_0b5c:
		dup     
		ldi      5
		eq?     
		bnt      code_0b68
		ldi      9
		jmp      code_0b71
code_0b68:
		dup     
		ldi      6
		eq?     
		bnt      code_0b71
		ldi      8
code_0b71:
		toss    
		sap      param1
code_0b74:
		lea      @local14
		push    
		-ap      param1
		push    
		ldi      18
		mul     
		add     
		sap      param1
code_0b81:
		lap      param1
		ret     
	)
)

(class RTEyeCycle of RandCycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		count -1
	)
	
	(method (init param1 param2 param3)
		(asm
			pushi    #init
			pushi    1
			lsp      param1
			super    RandCycle,  6
			pushi    0
			callk    GetTime,  0
			aTop     cycleCnt
			lsp      argc
			ldi      2
			ge?     
			bnt      code_009e
			pushi    0
			callk    GetTime,  0
			push    
			lap      param2
			add     
			aTop     count
			lsp      argc
			ldi      3
			ge?     
			bnt      code_00a2
			lap      param3
			aTop     caller
			jmp      code_00a2
code_009e:
			ldi      65535
			aTop     count
code_00a2:
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			bnt      code_0034
			ldi      30
			jmp      code_0036
code_0034:
			ldi      1
code_0036:
			div     
			sat      temp1
			pTos     count
			pushi    0
			callk    GetTime,  0
			sat      temp0
			gt?     
			bnt      code_0068
			lst      temp0
			pToa     cycleCnt
			sub     
			push    
			lat      temp1
			gt?     
			bnt      code_006e
			pushi    #cel
			pushi    1
			pushi    #nextCel
			pushi    0
			self     4
			push    
			pToa     client
			send     6
			pushi    0
			callk    GetTime,  0
			aTop     cycleCnt
			jmp      code_006e
code_0068:
			pushi    #cycleDone
			pushi    0
			self     4
code_006e:
			ret     
		)
	)
	
	(method (nextCel)
		(asm
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			lt?     
			bnt      code_00c0
			pushi    1
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			add     
code_00c0:
			ret     
		)
	)
)

(class RHTalker of Talker
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $0000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 6
		script 0
		cycler 0
		timer 0
		detailLevel 0
		bust 0
		eyes 0
		mouth 0
		ticks 0
		disposeWhenDone 1
		caller 0
	)
	
	(method (dispose param1)
		(asm
			pToa     mouth
			bnt      code_01c5
			pToa     underBits
			bnt      code_01c5
			pushi    #cel
			pushi    1
			pushi    0
			pToa     mouth
			send     6
			pushi    6
			pushi    #view
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    0
			pushi    #nsLeft
			pushi    0
			pToa     mouth
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    #nsTop
			pushi    0
			pToa     mouth
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    65535
			callk    DrawCel,  12
code_01c5:
			ldi      0
			aTop     loop
			pushi    0
			calle    proc13_7,  0
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Talker,  4
			ret     
		)
	)
	
	(method (startText param1)
		(asm
			lag      global25
			bnt      code_0114
			pushi    #dispose
			pushi    0
			send     4
code_0114:
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    0
			callk    HaveMouse,  0
			not     
			push    
			lag      global1
			send     8
			lsg      global162
			lsg      global163
			pushi    1
			lsp      param1
			callk    StrLen,  2
			mul     
			add     
			aTop     ticks
			pToa     mouth
			bnt      code_0144
			pushi    #setCycle
			pushi    2
			class    RTRandCycle
			push    
			pTos     ticks
			pToa     mouth
			send     8
code_0144:
			pToa     eyes
			bnt      code_0156
			pushi    #setCycle
			pushi    2
			class    RTEyeCycle
			push    
			pTos     ticks
			pToa     eyes
			send     8
code_0156:
			pToa     loop
			bnt      code_0172
			pushi    7
			lsp      param1
			pushi    67
			pTos     x
			pTos     y
			pushi    108
			pushi    80
			pTos     name
			calle    proc255_0,  14
			jmp      code_0182
code_0172:
			pushi    5
			lsp      param1
			pushi    67
			pTos     x
			pTos     y
			pushi    108
			calle    proc255_0,  10
code_0182:
			ret     
		)
	)
)

(class Conversation of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
		notKilled 1
	)
	
	(method (cue param1 &tmp temp0 [temp1 200])
		(asm
			lap      argc
			bnt      code_02c3
			lap      param1
			aTop     notKilled
code_02c3:
			pushi    2
			lsl      local0
			ipToa    register
			push    
			calle    proc999_6,  4
			sat      temp0
			bnt      code_03ff
			pToa     notKilled
			bnt      code_03ff
			pushi    2
			lat      temp0
			lsli     local0
			pushi    0
			calle    proc999_6,  4
			push    
			ldi      65535
			ne?     
			bnt      code_0347
			pushi    3
			lsl      local11
			lsl      local13
			lea      @temp1
			push    
			callk    GetFarText,  6
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    8
			calle    proc999_6,  4
			push    
			calle    proc13_6,  2
			lst      temp0
			dup     
			ldi      1
			eq?     
			bnt      code_032a
			pushi    #say
			pushi    5
			lea      @temp1
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			lofsa    talker1
			send     14
			jmp      code_0343
code_032a:
			dup     
			ldi      2
			eq?     
			bnt      code_0343
			pushi    #say
			pushi    5
			lea      @temp1
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			lofsa    talker2
			send     14
code_0343:
			toss    
			jmp      code_03fa
code_0347:
			lag      global25
			bnt      code_0351
			pushi    #dispose
			pushi    0
			send     4
code_0351:
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    2
			calle    proc999_6,  4
			push    
			calle    proc13_6,  2
			pushi    3
			lsl      local11
			lsl      local13
			lea      @temp1
			push    
			callk    GetFarText,  6
			lst      temp0
			dup     
			ldi      1
			eq?     
			bnt      code_03b7
			pushi    #name
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    1
			calle    proc999_6,  4
			push    
			pushi    5
			pushi    1
			pushi    805
			pushi    6
			pushi    1
			pushi    1
			pushi    505
			pushi    1
			pushi    0
			pushi    506
			pushi    1
			pushi    0
			pushi    507
			pushi    1
			pushi    0
			pushi    509
			pushi    5
			lea      @temp1
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			lofsa    talker1
			send     50
			jmp      code_03f9
code_03b7:
			dup     
			ldi      2
			eq?     
			bnt      code_03f9
			pushi    #name
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    1
			calle    proc999_6,  4
			push    
			pushi    5
			pushi    1
			pushi    805
			pushi    6
			pushi    1
			pushi    1
			pushi    505
			pushi    1
			pushi    0
			pushi    506
			pushi    1
			pushi    0
			pushi    507
			pushi    1
			pushi    0
			pushi    509
			pushi    5
			lea      @temp1
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			lofsa    talker2
			send     50
code_03f9:
			toss    
code_03fa:
			+al      local13
			jmp      code_0454
code_03ff:
			lal      local10
			bt       code_0407
			pToa     notKilled
			not     
code_0407:
			bnt      code_0441
			pushi    #underBits
			pushi    0
			lofsa    talker1
			send     4
			bnt      code_0423
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    108
			pushi    1
			pushi    1
			lofsa    talker1
			send     12
code_0423:
			lal      local2
			bnt      code_0441
			pushi    #underBits
			pushi    0
			lofsa    talker2
			send     4
			bnt      code_0441
			pushi    #script
			pushi    1
			pushi    0
			pushi    108
			pushi    1
			pushi    1
			lofsa    talker2
			send     12
code_0441:
			pushi    1
			pushi    0
			calle    proc13_6,  2
			lal      local9
			bnt      code_0454
			pushi    #cue
			pushi    1
			pTos     notKilled
			send     6
code_0454:
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0463
			ret     
			jmp      code_049f
code_0463:
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_047c
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
code_047c:
			bt       code_0498
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_049f
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
code_0498:
			bnt      code_049f
			ldi      0
			aTop     notKilled
code_049f:
			ret     
		)
	)
)

(instance crowd of Conversation
	(properties)
	
	(method (cue param1 &tmp temp0 temp1 [temp2 200])
		(asm
			lap      argc
			bnt      code_08b5
			lap      param1
			aTop     notKilled
code_08b5:
			pushi    2
			lsl      local0
			ipToa    register
			push    
			calle    proc999_6,  4
			sat      temp0
			bnt      code_0aa4
			pToa     notKilled
			bnt      code_0aa4
			pushi    2
			lat      temp0
			lsli     local0
			pushi    0
			calle    proc999_6,  4
			push    
			ldi      65535
			ne?     
			bnt      code_0a29
			pushi    3
			lsl      local11
			lsl      local13
			lea      @temp2
			push    
			callk    GetFarText,  6
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    8
			calle    proc999_6,  4
			push    
			calle    proc13_6,  2
			pushi    5
			pushi    #superClass
			pushi    2
			lat      temp0
			lsli     local0
			pushi    0
			calle    proc999_6,  4
			push    
			pushi    6
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    1
			calle    proc999_6,  4
			sat      temp1
			push    
			ldi      1
			add     
			push    
			pushi    10
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    2
			calle    proc999_6,  4
			push    
			pushi    9
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    3
			calle    proc999_6,  4
			push    
			lofsa    bust1
			send     24
			pushi    #view
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    0
			calle    proc999_6,  4
			push    
			pushi    6
			pushi    1
			lst      temp1
			pushi    10
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    4
			calle    proc999_6,  4
			push    
			pushi    9
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    5
			calle    proc999_6,  4
			push    
			lofsa    mouth1
			send     24
			pushi    5
			pushi    #superClass
			pushi    2
			lat      temp0
			lsli     local0
			pushi    0
			calle    proc999_6,  4
			push    
			pushi    6
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    1
			calle    proc999_6,  4
			sat      temp1
			push    
			ldi      2
			add     
			push    
			pushi    10
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    6
			calle    proc999_6,  4
			push    
			pushi    9
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    7
			calle    proc999_6,  4
			push    
			lofsa    eyes1
			send     24
			pushi    9
			pushi    1
			lat      temp0
			lali     local228
			lsli     local216
			pushi    10
			pushi    1
			lat      temp0
			lali     local228
			lsli     local212
			pushi    4
			pushi    1
			lat      temp0
			lali     local228
			lsli     local220
			pushi    3
			pushi    1
			lat      temp0
			lali     local228
			lsli     local224
			pushi    107
			pushi    8
			lofsa    bust1
			push    
			lofsa    eyes1
			push    
			lofsa    mouth1
			push    
			lea      @temp2
			push    
			pushi    0
			pushi    0
			lst      temp0
			pushi    2
			lsl      local0
			pTos     register
			ldi      1
			add     
			push    
			calle    proc999_6,  4
			ne?     
			push    
			pushSelf
			lofsa    talker1
			send     44
			jmp      code_0a9f
code_0a29:
			lag      global25
			bnt      code_0a33
			pushi    #dispose
			pushi    0
			send     4
code_0a33:
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    2
			calle    proc999_6,  4
			push    
			calle    proc13_6,  2
			pushi    3
			lsl      local11
			lsl      local13
			lea      @temp2
			push    
			callk    GetFarText,  6
			pushi    #name
			pushi    1
			pushi    2
			lat      temp0
			lsli     local0
			pushi    1
			calle    proc999_6,  4
			push    
			pushi    5
			pushi    1
			pushi    805
			pushi    6
			pushi    1
			pushi    1
			pushi    505
			pushi    1
			pushi    0
			pushi    506
			pushi    1
			pushi    0
			pushi    507
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lat      temp0
			lali     local228
			lsli     local220
			pushi    3
			pushi    1
			lat      temp0
			lali     local228
			lsli     local224
			pushi    509
			pushi    5
			lea      @temp2
			push    
			pushi    0
			pushi    0
			pushi    1
			pushSelf
			lofsa    talker1
			send     62
code_0a9f:
			+al      local13
			jmp      code_0acf
code_0aa4:
			pushi    #underBits
			pushi    0
			lofsa    talker1
			send     4
			bnt      code_0abc
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lofsa    talker1
			send     10
code_0abc:
			pushi    1
			pushi    0
			calle    proc13_6,  2
			lal      local9
			bnt      code_0acf
			pushi    #cue
			pushi    1
			pTos     notKilled
			send     6
code_0acf:
			ret     
		)
	)
)

(instance talker1 of RHTalker
	(properties
		x 94
		y 30
		nsTop 12
		nsLeft 13
		view 805
		signal $4000
	)
)

(instance bust1 of View
	(properties
		nsTop 4
		nsLeft 3
		signal $4000
	)
)

(instance mouth1 of Prop
	(properties
		nsTop 31
		nsLeft 19
		loop 1
		priority 14
		signal $4010
		cycleSpeed 8
	)
)

(instance eyes1 of Prop
	(properties
		loop 1
		priority 14
		signal $4010
		cycleSpeed 180
	)
)

(instance talker2 of RHTalker
	(properties
		x 30
		y 125
		nsTop 107
		nsLeft 245
		view 805
		signal $4000
	)
)

(instance bust2 of View
	(properties
		nsTop 4
		nsLeft 3
		signal $4000
	)
)

(instance mouth2 of Prop
	(properties
		nsTop 31
		nsLeft 19
		loop 1
		priority 10
		signal $4010
		cycleSpeed 8
	)
)

(instance eyes2 of Prop
	(properties
		loop 1
		priority 10
		signal $4010
		cycleSpeed 180
	)
)

(class TScript of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
		notKilled 1
	)
	
	(method (init param1 param2 param3 param4)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0f15
			pushi    #script
			pushi    1
			pushSelf
			lap      param1
			aTop     client
			send     6
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0f15
			lap      param2
			aTop     caller
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0f15
			lap      param3
			aTop     register
code_0f15:
			lsp      argc
			ldi      4
			ge?     
			bnt      code_0f22
			lap      param4
			jmp      code_0f3c
code_0f22:
			pushi    #respondsTo
			pushi    1
			pushi    674
			lap      param1
			send     6
			bnt      code_0f3a
			pushi    #notKilled
			pushi    0
			lap      param1
			send     4
			jmp      code_0f3c
code_0f3a:
			ldi      1
code_0f3c:
			aTop     notKilled
			pTos     start
			ldi      1
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (dispose &tmp temp0)
		(asm
			pushi    1
			pTos     script
			callk    IsObject,  2
			bnt      code_0f79
			pushi    #dispose
			pushi    0
			pToa     script
			send     4
code_0f79:
			pushi    1
			pTos     timer
			callk    IsObject,  2
			bnt      code_0f89
			pushi    #dispose
			pushi    0
			pToa     timer
			send     4
code_0f89:
			pushi    1
			pTos     client
			callk    IsObject,  2
			bnt      code_0fdb
			pushi    138
			pushi    1
			pushi    1
			pTos     next
			callk    IsObject,  2
			bnt      code_0fa4
			pToa     next
			jmp      code_0fae
code_0fa4:
			pToa     next
			bnt      code_0fae
			pushi    1
			push    
			callk    ScriptID,  2
code_0fae:
			sat      temp0
			push    
			pToa     client
			send     6
			lat      temp0
			not     
			bnt      code_0fc0
			ldi      0
			jmp      code_0fdb
code_0fc0:
			lsg      global13
			lag      global11
			eq?     
			bnt      code_0fd4
			pushi    #init
			pushi    1
			pTos     client
			lat      temp0
			send     6
			jmp      code_0fdb
code_0fd4:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
code_0fdb:
			pushi    1
			pTos     caller
			callk    IsObject,  2
			bnt      code_0ff6
			lsg      global13
			lag      global11
			eq?     
			bnt      code_0ff6
			pushi    #cue
			pushi    1
			pTos     notKilled
			pToa     caller
			send     6
code_0ff6:
			ldi      0
			aTop     caller
			aTop     next
			aTop     client
			aTop     timer
			aTop     script
			pushi    #dispose
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0f5b
			lap      param1
			not     
			bnt      code_0f5b
			ldi      0
			aTop     notKilled
code_0f5b:
			pushi    #cue
			pushi    1
			pTos     notKilled
			&rest    param2
			super    Script,  6
			ret     
		)
	)
)
