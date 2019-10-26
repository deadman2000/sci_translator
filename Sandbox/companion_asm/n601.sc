;;; Sierra Script 1.0 - (do not remove this comment)
(script# 601)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n813)
(use n851)
(use n945)
(use n949)
(use n958)
(use n968)
(use n970)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	Fens 0
	rgnBoat 1
	monk 2
	robin 3
	monkBoat 4
	proc601_5 5
	boatLooper 6
	egoActions 7
	stepInBoatAsOutlaw 8
	outlawAfterWisps 9
	pole 10
	proc601_11 11
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	[local11 2]
	local13
	[local14 10]
	local24
	local25
	local26
	local27
	local28
	local29
	local30
	[local31 208]
	[local239 12] = [0 0 0 0 0 0 0 0 1601 5 1]
	[local251 4] = [1601 98 1]
	[local255 4] = [1601 60 1]
	[local259 4] = [1601 65 1]
	[local263 4] = [1601 66 1]
	[local267 4] = [1601 67 1]
	[local271 4] = [1601 68 1]
	[local275 4] = [1601 69 1]
	[local279 4] = [1601 70 1]
	[local283 4] = [1601 71 1]
	[local287 4] = [1601 72 1]
	[local291 4] = [1601 73 1]
	[local295 4] = [1601 74 1]
	[local299 4] = [1601 7 1]
	[local303 4] = [1601 8 1]
	[local307 4] = [1601 77 1]
	[local311 6] = [1601 80 2 1 2]
	[local317 4] = [1601 83 1]
	[local321 5] = [1601 84 1 2]
	[local326 5] = [1601 95 1]
	[local331 5] = [1601 96 1]
	[local336 4] = [1601 79 1]
)
(procedure (proc601_5 param1)
	(asm
		lag      global132
		bnt      code_00fe
		lsl      local4
		lap      param1
		eq?     
		bnt      code_00fe
		lsg      global11
		dup     
		ldi      590
		eq?     
		bnt      code_00aa
		pushi    #view
		pushi    1
		pushi    21
		pushi    6
		pushi    1
		pushi    2
		pushi    7
		pushi    1
		pushi    2
		pushi    284
		pushi    2
		pushi    84
		pushi    112
		pushi    66
		pushi    1
		pushi    #priority
		pushi    0
		pushi    2
		pushi    601
		pushi    2
		callk    ScriptID,  4
		send     4
		push    
		pushi    17
		pushi    1
		pushi    16384
		pushi    107
		pushi    0
		lofsa    rgnBoat
		send     42
		pushi    #view
		pushi    1
		pushi    585
		pushi    162
		pushi    1
		pushi    1
		pushi    288
		pushi    1
		pushi    3
		pushi    284
		pushi    2
		pushi    100
		pushi    137
		pushi    107
		pushi    0
		lofsa    monk
		send     30
		jmp      code_00f3
code_00aa:
		dup     
		ldi      600
		eq?     
		bnt      code_00f3
		pushi    #view
		pushi    1
		pushi    21
		pushi    6
		pushi    1
		pushi    3
		pushi    7
		pushi    1
		pushi    2
		pushi    284
		pushi    2
		pushi    178
		pushi    132
		pushi    107
		pushi    0
		lofsa    rgnBoat
		send     30
		pushi    #view
		pushi    1
		pushi    585
		pushi    6
		pushi    1
		pushi    2
		pushi    7
		pushi    1
		pushi    3
		pushi    284
		pushi    2
		pushi    151
		pushi    159
		pushi    107
		pushi    0
		lofsa    monk
		send     30
code_00f3:
		toss    
		ldi      1
		sal      local24
		ldi      1
		ret     
		jmp      code_0101
code_00fe:
		ldi      0
		ret     
code_0101:
		ret     
	)
)

(procedure (proc601_11 param1)
	(asm
		lsg      global130
		ldi      13
		eq?     
		bnt      code_01c7
		lsl      local4
		lap      param1
		eq?     
		bnt      code_01c7
		lsg      global11
		dup     
		ldi      590
		eq?     
		bnt      code_0169
		pushi    #view
		pushi    1
		pushi    21
		pushi    6
		pushi    1
		pushi    2
		pushi    7
		pushi    1
		pushi    2
		pushi    284
		pushi    2
		pushi    96
		pushi    114
		pushi    66
		pushi    1
		pushi    #priority
		pushi    0
		pushi    2
		pushi    601
		pushi    2
		callk    ScriptID,  4
		send     4
		push    
		pushi    289
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		lofsa    rgnBoat
		send     42
		pushi    #cel
		pushi    1
		pushi    3
		pushi    284
		pushi    2
		pushi    128
		pushi    137
		pushi    107
		pushi    0
		lofsa    pole
		send     18
		jmp      code_01bc
code_0169:
		dup     
		ldi      600
		eq?     
		bnt      code_01bc
		pushi    #view
		pushi    1
		pushi    21
		pushi    6
		pushi    1
		pushi    2
		pushi    7
		pushi    1
		pushi    2
		pushi    284
		pushi    2
		pushi    98
		pushi    132
		pushi    66
		pushi    1
		pushi    #priority
		pushi    0
		pushi    2
		pushi    601
		pushi    2
		callk    ScriptID,  4
		send     4
		push    
		pushi    289
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		lofsa    rgnBoat
		send     42
		pushi    #cel
		pushi    1
		pushi    3
		pushi    284
		pushi    2
		pushi    133
		pushi    156
		pushi    107
		pushi    0
		lofsa    pole
		send     18
code_01bc:
		toss    
		ldi      1
		sal      local24
		ldi      1
		ret     
		jmp      code_01ca
code_01c7:
		ldi      0
		ret     
code_01ca:
		ret     
	)
)

(procedure (localproc_01cb &tmp temp0)
	(asm
		pushi    #contains
		pushi    1
		lsl      local31
		lag      global5
		send     6
		bnt      code_01da
		ret     
code_01da:
		lsg      global87
		dup     
		ldi      0
		eq?     
		bnt      code_01ea
		ldi      4
		sal      local13
		jmp      code_01fc
code_01ea:
		dup     
		ldi      1
		eq?     
		bnt      code_01f8
		ldi      6
		sal      local13
		jmp      code_01fc
code_01f8:
		ldi      8
		sal      local13
code_01fc:
		toss    
		lsg      global11
		ldi      610
		eq?     
		bnt      code_0293
		lsg      global130
		ldi      13
		eq?     
		bnt      code_0293
		pushi    2
		pushi    610
		pushi    1
		callk    ScriptID,  4
		sal      local30
		ldi      0
		sat      temp0
code_021c:
		lst      temp0
		lal      local13
		lt?     
		bnt      code_0304
		pushi    #new
		pushi    0
		lofsa    Wisp
		send     4
		push    
		lat      temp0
		sali     local31
		pushi    162
		pushi    1
		pushi    2
		pushi    0
		pushi    2
		callk    Random,  4
		push    
		pushi    #setStep
		pushi    2
		pushi    10
		dup     
		pushi    4
		pushi    1
		pushi    #x
		pushi    0
		lal      local30
		send     4
		push    
		pushi    2
		pushi    0
		pushi    60
		callk    Random,  4
		add     
		push    
		pushi    3
		pushi    1
		pushi    #y
		pushi    0
		lal      local30
		send     4
		push    
		pushi    2
		pushi    0
		pushi    60
		callk    Random,  4
		add     
		push    
		pushi    289
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		pushi    142
		pushi    1
		pushi    #new
		pushi    0
		lofsa    frenzy
		send     4
		push    
		lat      temp0
		sali     local239
		push    
		lat      temp0
		lali     local31
		send     42
		+at      temp0
		jmp      code_021c
		jmp      code_0304
code_0293:
		pushi    #init
		pushi    0
		lofsa    wispCage
		send     4
		ldi      0
		sat      temp0
code_029f:
		lst      temp0
		lal      local13
		lt?     
		bnt      code_0304
		pushi    #new
		pushi    0
		lofsa    Wisp
		send     4
		push    
		lat      temp0
		sali     local31
		pushi    #x
		pushi    1
		pushi    2
		pushi    35
		pushi    305
		callk    Random,  4
		push    
		pushi    3
		pushi    1
		pushi    2
		pushi    86
		pushi    134
		callk    Random,  4
		push    
		pushi    162
		pushi    1
		pushi    2
		pushi    0
		pushi    2
		callk    Random,  4
		push    
		pushi    308
		pushi    2
		pushi    2
		pushi    2
		pushi    107
		pushi    0
		pushi    289
		pushi    1
		pushi    1
		pushi    303
		pushi    1
		lofsa    wispCage
		push    
		pushi    283
		pushi    2
		class    Wander
		push    
		pushi    230
		lat      temp0
		lali     local31
		send     50
		+at      temp0
		jmp      code_029f
code_0304:
		pushi    #number
		pushi    1
		pushi    582
		pushi    6
		pushi    1
		pushi    65535
		pushi    42
		pushi    0
		lag      global168
		send     16
		ret     
	)
)

(procedure (localproc_0317)
	(asm
		lsg      global87
		dup     
		ldi      0
		eq?     
		bnt      code_032f
		pushi    #setStep
		pushi    2
		pushi    5
		pushi    3
		lag      global0
		send     8
		jmp      code_034e
code_032f:
		dup     
		ldi      1
		eq?     
		bnt      code_0344
		pushi    #setStep
		pushi    2
		pushi    3
		pushi    2
		lag      global0
		send     8
		jmp      code_034e
code_0344:
		pushi    #setStep
		pushi    2
		pushi    2
		pushi    1
		lag      global0
		send     8
code_034e:
		toss    
		ret     
	)
)

(instance Fens of Rgn
	(properties
		keep 1
	)
	
	(method (init)
		(asm
			lag      global34
			sal      local29
			ldi      0
			sag      global34
			pushi    #init
			pushi    0
			super    Rgn,  4
			pushi    0
			callb    proc0_4,  0
			lsg      global115
			ldi      1
			eq?     
			bnt      code_03d2
			pushi    0
			call     localproc_01cb,  0
code_03d2:
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      585
			ne?     
			bnt      code_03f3
			pushi    #number
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_03f3:
			pushi    #number
			pushi    0
			lag      global113
			send     4
			push    
			ldi      581
			ne?     
			bnt      code_0414
			pushi    #number
			pushi    1
			pushi    581
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
code_0414:
			lsg      global12
			ldi      700
			eq?     
			bnt      code_0421
			ldi      1
			sal      local24
code_0421:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			lsg      global115
			ldi      1
			eq?     
			bnt      code_047e
			lsg      global19
			ldi      5
			ne?     
			bnt      code_047e
			lsg      global11
			ldi      610
			eq?     
			bnt      code_0476
			lal      local3
			bnt      code_0476
			ldi      0
			sal      local3
			ldi      0
			sat      temp0
code_044a:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_0461
			pushi    #show
			pushi    0
			lat      temp0
			lali     local31
			send     4
			+at      temp0
			jmp      code_044a
code_0461:
			pushi    #number
			pushi    1
			pushi    582
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global168
			send     16
			jmp      code_057a
code_0476:
			pushi    0
			call     localproc_01cb,  0
			jmp      code_057a
code_047e:
			lsg      global115
			ldi      1
			ne?     
			bnt      code_04ef
			pushi    #contains
			pushi    1
			lsl      local31
			lag      global5
			send     6
			bnt      code_04ef
			lal      local3
			not     
			bnt      code_04ef
			lsg      global11
			ldi      610
			eq?     
			bnt      code_04c2
			ldi      1
			sal      local3
			ldi      0
			sat      temp0
code_04a9:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_04e4
			pushi    #hide
			pushi    0
			lat      temp0
			lali     local31
			send     4
			+at      temp0
			jmp      code_04a9
			jmp      code_04e4
code_04c2:
			pushi    #dispose
			pushi    0
			lofsa    wispCage
			send     4
			ldi      0
			sat      temp0
code_04ce:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_04e4
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local31
			send     4
			+at      temp0
			jmp      code_04ce
code_04e4:
			pushi    #stop
			pushi    0
			lag      global168
			send     4
			jmp      code_057a
code_04ef:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_04fd
			jmp      code_057a
code_04fd:
			lal      local4
			bnt      code_0546
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      global5
			send     6
			bnt      code_0546
			lsl      local27
			ldi      0
			eq?     
			bnt      code_0546
			pushi    15
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_052a
			pprev   
			ldi      305
			lt?     
code_052a:
			not     
			bnt      code_0546
			ldi      1
			sal      local27
			pushi    5
			pushi    1
			lea      @local255
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_057a
code_0546:
			lal      local4
			bnt      code_057a
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      global5
			send     6
			bnt      code_057a
			lsl      local27
			ldi      1
			eq?     
			bnt      code_057a
			pushi    20
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_057a
			pprev   
			ldi      300
			lt?     
			bnt      code_057a
			ldi      0
			sal      local27
code_057a:
			pushi    #contains
			pushi    1
			lsl      local31
			lag      global5
			send     6
			bnt      code_05a3
			pushi    161
			pushi    1
			pushi    #addAfter
			pushi    #distanceTo
			pushi    1
			lsl      local31
			lag      global0
			send     6
			push    
			ldi      3
			div     
			sub     
			push    
			lag      global168
			send     6
			jmp      code_05ab
code_05a3:
			pushi    #stop
			pushi    0
			lag      global168
			send     4
code_05ab:
			pushi    #doit
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #number
			pushi    0
			lag      global113
			send     4
			push    
			ldi      581
			ne?     
			bnt      code_05c9
			pushi    #stop
			pushi    0
			lag      global113
			send     4
code_05c9:
			lag      global25
			bnt      code_05d3
			pushi    #dispose
			pushi    0
			send     4
code_05d3:
			pushi    0
			callb    proc0_4,  0
			lal      local29
			sag      global34
			pushi    4
			pushi    0
			pushi    968
			pushi    970
			pushi    949
			calle    proc958_0,  8
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global168
			send     12
			pushi    #dispose
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    4
			lsp      newRoomNumber
			pushi    590
			pushi    600
			pushi    610
			calle    proc999_5,  8
			not     
			bnt      code_03ad
			pushi    #keep
			pushi    1
			pushi    0
			self     6
			lsp      newRoomNumber
			ldi      700
			ne?     
			bnt      code_03ad
			lsp      newRoomNumber
			ldi      620
			ne?     
			bnt      code_03ad
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global168
			send     12
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
code_03ad:
			ret     
		)
	)
	
	(method (notify param1)
		(asm
			lap      param1
			sal      local4
			ret     
		)
	)
)

(instance boatLooper of SmoothLooper
	(properties
		cycleSpeed 18
		vChangeDir 588
	)
)

(instance wispCage of Cage
	(properties)
	
	(method (init)
		(asm
			lsg      global11
			dup     
			ldi      590
			eq?     
			bnt      code_0695
			pushi    #top
			pushi    1
			pushi    85
			pushi    185
			pushi    1
			pushi    135
			pushi    184
			pushi    1
			pushi    10
			pushi    186
			pushi    1
			pushi    310
			self     24
			jmp      code_06e0
code_0695:
			dup     
			ldi      600
			eq?     
			bnt      code_06bc
			pushi    #top
			pushi    1
			pushi    80
			pushi    185
			pushi    1
			pushi    145
			pushi    184
			pushi    1
			pushi    10
			pushi    186
			pushi    1
			pushi    310
			self     24
			jmp      code_06e0
code_06bc:
			dup     
			ldi      610
			eq?     
			bnt      code_06e0
			pushi    #top
			pushi    1
			pushi    15
			pushi    185
			pushi    1
			pushi    204
			pushi    184
			pushi    1
			pushi    10
			pushi    186
			pushi    1
			pushi    310
			self     24
code_06e0:
			toss    
			pushi    #init
			pushi    0
			super    Cage,  4
			ret     
		)
	)
)

(class Wisp of Actor
	(properties
		x 160
		y 100
		z 15
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
		view 610
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $6000
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
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 6
		blocks 0
		baseSetter 0
		mover 0
		looper 0
		viewer 0
		avoider 0
		code 0
		cycCnt 0
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #nextCel
			pushi    0
			self     4
			sat      temp0
			push    
			pushi    #lastCel
			pushi    0
			self     4
			gt?     
			bnt      code_074a
			ldi      0
			jmp      code_074c
code_074a:
			lat      temp0
code_074c:
			aTop     cel
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_076c
			pushi    3
			pushi    1601
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_0851
code_076c:
			dup     
			ldi      10
			eq?     
			bnt      code_0781
			pushi    3
			pushi    1601
			pushi    2
			pushi    0
			calle    proc13_4,  6
			jmp      code_0851
code_0781:
			dup     
			ldi      3
			eq?     
			bnt      code_0796
			pushi    3
			pushi    1601
			pushi    1
			pushi    0
			calle    proc13_4,  6
			jmp      code_0851
code_0796:
			dup     
			ldi      5
			eq?     
			bnt      code_082c
			lsg      global11
			ldi      610
			eq?     
			bnt      code_07b9
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushi    0
			pushi    4
			lag      global2
			send     10
			jmp      code_0851
code_07b9:
			lal      local25
			bnt      code_07d5
			ldi      9
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushi    0
			pushi    8
			lag      global2
			send     10
			jmp      code_0851
code_07d5:
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      587
			ne?     
			bnt      code_0819
			pushi    #contains
			pushi    1
			lofsa    rgnBoat
			push    
			lag      global5
			send     6
			bt       code_07f4
			lal      local24
code_07f4:
			bnt      code_080a
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushi    0
			pushi    3
			lag      global2
			send     10
			jmp      code_0851
code_080a:
			pushi    #setScript
			pushi    1
			lofsa    wispsOfferBoat
			push    
			lag      global2
			send     6
			jmp      code_0851
code_0819:
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushi    0
			pushi    4
			lag      global2
			send     10
			jmp      code_0851
code_082c:
			dup     
			ldi      4
			eq?     
			bnt      code_0846
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushi    0
			pushi    6
			lag      global0
			send     10
			jmp      code_0851
code_0846:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_0851:
			toss    
			ret     
		)
	)
	
	(method (nextCel)
		(asm
			pushi    1
			lsg      global88
			pToa     cycCnt
			sub     
			push    
			callk    Abs,  2
			push    
			pToa     cycleSpeed
			lt?     
			bnt      code_0726
			pToa     cel
			jmp      code_072f
code_0726:
			lag      global88
			aTop     cycCnt
			pTos     cel
			ldi      1
			add     
code_072f:
			ret     
		)
	)
)

(instance robin of Actor
	(properties)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    1
			pushi    #actions
			pushi    0
			lag      global0
			send     4
			push    
			callk    IsObject,  2
			bnt      code_0978
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			pushi    #actions
			pushi    0
			lag      global0
			send     4
			send     8
code_0978:
			not     
			bnt      code_098a
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			lag      global0
			send     8
code_098a:
			ret     
		)
	)
)

(instance rgnBoat of Actor
	(properties
		view 21
		signal $7000
		xStep 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a2a
			pushi    3
			pushi    1601
			pushi    61
			pushi    0
			calle    proc13_4,  6
			jmp      code_0a90
code_0a2a:
			dup     
			ldi      3
			eq?     
			bnt      code_0a85
			lal      local24
			bnt      code_0a77
			lsg      global11
			ldi      610
			ne?     
			bnt      code_0a77
			lsg      global126
			ldi      6
			eq?     
			bt       code_0a50
			pushi    #contains
			pushi    1
			lsl      local31
			lag      global5
			send     6
code_0a50:
			bnt      code_0a68
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    603
			pushi    4
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0a90
code_0a68:
			pushi    3
			pushi    1601
			pushi    100
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a90
code_0a77:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
			jmp      code_0a90
code_0a85:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_0a90:
			toss    
			ret     
		)
	)
)

(instance pole of Actor
	(properties
		view 15
		loop 5
		cel 3
		signal $4800
		cycleSpeed 12
		xStep 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b2e
			pushi    2
			pushi    1601
			pushi    91
			calle    proc13_4,  4
			jmp      code_0b50
code_0b2e:
			dup     
			ldi      3
			eq?     
			bnt      code_0b45
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			lofsa    rgnBoat
			send     6
			jmp      code_0b50
code_0b45:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0b50:
			toss    
			ret     
		)
	)
)

(instance bow of Prop
	(properties
		view 15
		loop 6
		signal $4800
		cycleSpeed 12
	)
)

(instance monk of Actor
	(properties
		view 16
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c82
			lsg      global11
			ldi      610
			eq?     
			bnt      code_0c5f
			pushi    3
			pushi    1601
			pushi    62
			pushi    0
			calle    proc13_4,  6
			jmp      code_0e3e
code_0c5f:
			lal      local26
			bnt      code_0c73
			pushi    3
			pushi    1601
			pushi    63
			pushi    0
			calle    proc13_4,  6
			jmp      code_0e3e
code_0c73:
			pushi    3
			pushi    1601
			pushi    64
			pushi    0
			calle    proc13_4,  6
			jmp      code_0e3e
code_0c82:
			dup     
			ldi      3
			eq?     
			bnt      code_0cf5
			lsg      global11
			ldi      610
			eq?     
			bnt      code_0ca8
			pushi    5
			pushi    1
			lea      @local259
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e3e
code_0ca8:
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      19
			eq?     
			bnt      code_0ccc
			pushi    5
			pushi    1
			lea      @local259
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e3e
code_0ccc:
			lal      local24
			bnt      code_0ce7
			pushi    5
			pushi    1
			lea      @local263
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e3e
code_0ce7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0e3e
code_0cf5:
			dup     
			ldi      5
			eq?     
			bnt      code_0d88
			lsg      global11
			ldi      610
			eq?     
			bnt      code_0d5f
			lsl      local6
			dup     
			ldi      0
			eq?     
			bnt      code_0d24
			pushi    5
			pushi    1
			lea      @local267
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0d59
code_0d24:
			dup     
			ldi      1
			eq?     
			bnt      code_0d41
			pushi    5
			pushi    1
			lea      @local271
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0d59
code_0d41:
			dup     
			ldi      2
			eq?     
			bnt      code_0d59
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    603
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
code_0d59:
			toss    
			+al      local6
			jmp      code_0e3e
code_0d5f:
			lal      local24
			bnt      code_0d7a
			pushi    5
			pushi    1
			lea      @local275
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e3e
code_0d7a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0e3e
code_0d88:
			dup     
			ldi      4
			eq?     
			bnt      code_0e31
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0dae
			pushi    5
			pushi    1
			lea      @local279
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e2d
code_0dae:
			dup     
			ldi      2
			eq?     
			bnt      code_0dcb
			pushi    5
			pushi    1
			lea      @local283
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e2d
code_0dcb:
			dup     
			ldi      10
			eq?     
			bnt      code_0de8
			pushi    5
			pushi    1
			lea      @local287
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e2d
code_0de8:
			dup     
			ldi      5
			eq?     
			bnt      code_0e05
			pushi    5
			pushi    1
			lea      @local291
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e2d
code_0e05:
			dup     
			ldi      6
			eq?     
			bnt      code_0e22
			pushi    5
			pushi    1
			lea      @local295
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e2d
code_0e22:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0e2d:
			toss    
			jmp      code_0e3e
code_0e31:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Actor,  8
code_0e3e:
			toss    
			ret     
		)
	)
)

(instance wispsOfferBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ef4
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    1
			pushi    3
			lag      global69
			send     6
			ldi      11
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    1
			self     10
			jmp      code_0ff2
code_0ef4:
			dup     
			ldi      1
			eq?     
			bnt      code_0f23
			lsg      global130
			ldi      13
			eq?     
			bnt      code_0f1a
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0f1a
			pushi    #setScript
			pushi    1
			lofsa    toTheKnight
			push    
			pToa     client
			send     6
			jmp      code_0ff2
code_0f1a:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ff2
code_0f23:
			dup     
			ldi      2
			eq?     
			bnt      code_0f65
			lag      global25
			bnt      code_0f34
			pushi    #dispose
			pushi    0
			send     4
code_0f34:
			pushi    0
			calle    proc851_1,  0
			bnt      code_0f55
			pushi    5
			pushi    1
			lea      @local299
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ff2
code_0f55:
			pTos     state
			ldi      3
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ff2
code_0f65:
			dup     
			ldi      3
			eq?     
			bnt      code_0f73
			ldi      12
			aTop     ticks
			jmp      code_0ff2
code_0f73:
			dup     
			ldi      4
			eq?     
			bnt      code_0f8e
			ldi      19
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    2
			self     10
			jmp      code_0ff2
code_0f8e:
			dup     
			ldi      5
			eq?     
			bnt      code_0fa4
			pushi    #setScript
			pushi    1
			lofsa    wispsGoGetBoat
			push    
			pToa     client
			send     6
			jmp      code_0ff2
code_0fa4:
			dup     
			ldi      6
			eq?     
			bnt      code_0fc0
			pushi    5
			pushi    1
			lea      @local251
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ff2
code_0fc0:
			dup     
			ldi      7
			eq?     
			bnt      code_0fd8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    58
			self     10
			jmp      code_0ff2
code_0fd8:
			dup     
			ldi      8
			eq?     
			bnt      code_0ff2
			lag      global25
			bnt      code_0fe9
			pushi    #dispose
			pushi    0
			send     4
code_0fe9:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ff2:
			toss    
			ret     
		)
	)
)

(instance wispsGoGetBoat of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10c6
			pushi    0
			callb    proc0_3,  0
			pushi    #notify
			pushi    1
			pushi    1
			lag      global2
			send     6
			ldi      0
			sat      temp0
code_104d:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_10be
			pushi    #ignoreBlocks
			pushi    1
			lofsa    wispCage
			push    
			pushi    308
			pushi    2
			pushi    10
			dup     
			lat      temp0
			lali     local31
			send     14
			lsg      global11
			ldi      590
			eq?     
			bt       code_1078
			lsl      local4
			ldi      3
			eq?     
code_1078:
			bnt      code_109b
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    65526
			pushi    90
			lat      temp0
			lali     local31
			send     16
			jmp      code_10b9
code_109b:
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    330
			pushi    95
			lat      temp0
			lali     local31
			send     16
code_10b9:
			+at      temp0
			jmp      code_104d
code_10be:
			ldi      320
			aTop     ticks
			jmp      code_13ce
code_10c6:
			dup     
			ldi      1
			eq?     
			bnt      code_121d
			lsg      global126
			ldi      0
			eq?     
			bnt      code_1209
			lsg      global130
			ldi      13
			eq?     
			bnt      code_1209
			lsg      global11
			dup     
			ldi      590
			eq?     
			bnt      code_112e
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    0
			pushi    96
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    96
			pushi    114
			pushSelf
			lofsa    rgnBoat
			send     36
			pushi    #posn
			pushi    2
			pushi    32
			pushi    123
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    128
			pushi    137
			lofsa    pole
			send     22
			jmp      code_11d0
code_112e:
			dup     
			ldi      600
			eq?     
			bnt      code_11d0
			lsl      local4
			ldi      3
			eq?     
			bnt      code_1188
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    65476
			pushi    116
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    98
			pushi    132
			pushSelf
			lofsa    rgnBoat
			send     36
			pushi    #posn
			pushi    2
			pushi    65508
			pushi    143
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    133
			pushi    156
			lofsa    pole
			send     22
			jmp      code_11d0
code_1188:
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    349
			pushi    98
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    98
			pushi    132
			pushSelf
			lofsa    rgnBoat
			send     36
			pushi    #posn
			pushi    2
			pushi    371
			pushi    120
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    133
			pushi    156
			lofsa    pole
			send     22
code_11d0:
			toss    
			lofsa    rgnBoat
			sal      local30
			ldi      0
			sat      temp0
code_11da:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_13ce
			pushi    308
			pushi    #-info-
			pushi    10
			dup     
			pushi    142
			pushi    1
			pushi    #new
			pushi    0
			lofsa    frenzy
			send     4
			push    
			lat      temp0
			sali     local239
			push    
			lat      temp0
			lali     local31
			send     14
			+at      temp0
			jmp      code_11da
			jmp      code_13ce
code_1209:
			ldi      0
			sal      local4
			pTos     state
			ldi      3
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_13ce
code_121d:
			dup     
			ldi      2
			eq?     
			bnt      code_1296
			ldi      0
			sat      temp0
code_1228:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_128e
			lsg      global11
			ldi      600
			eq?     
			bnt      code_1263
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    2
			pushi    15
			pushi    305
			callk    Random,  4
			push    
			pushi    2
			pushi    95
			pushi    135
			callk    Random,  4
			push    
			lat      temp0
			lali     local31
			send     16
			jmp      code_1289
code_1263:
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    2
			pushi    35
			pushi    305
			callk    Random,  4
			push    
			pushi    2
			pushi    95
			pushi    120
			callk    Random,  4
			push    
			lat      temp0
			lali     local31
			send     16
code_1289:
			+at      temp0
			jmp      code_1228
code_128e:
			ldi      180
			aTop     ticks
			jmp      code_13ce
code_1296:
			dup     
			ldi      3
			eq?     
			bnt      code_12d3
			ldi      0
			sat      temp0
code_12a1:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_12cc
			pushi    #setStep
			pushi    2
			pushi    1
			pushi    1
			pushi    303
			pushi    1
			lofsa    wispCage
			push    
			pushi    283
			pushi    2
			class    Wander
			push    
			pushi    230
			lat      temp0
			lali     local31
			send     22
			+at      temp0
			jmp      code_12a1
code_12cc:
			ldi      30
			aTop     ticks
			jmp      code_13ce
code_12d3:
			dup     
			ldi      4
			eq?     
			bnt      code_12f3
			ldi      1
			sal      local24
			pTos     client
			lofsa    toTheKnight
			ne?     
			bnt      code_12eb
			pushi    0
			callb    proc0_4,  0
code_12eb:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_13ce
code_12f3:
			dup     
			ldi      5
			eq?     
			bnt      code_1373
			ldi      1
			sal      local25
			ldi      0
			sat      temp0
code_1302:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_136b
			pushi    4
			pushi    1
			lsg      global11
			ldi      590
			eq?     
			bnt      code_1324
			pushi    2
			pushi    0
			pushi    50
			callk    Random,  4
			push    
			ldi      60
			sub     
			jmp      code_132e
code_1324:
			pushi    2
			pushi    330
			pushi    370
			callk    Random,  4
code_132e:
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			lsg      global11
			ldi      590
			eq?     
			bnt      code_134c
			pushi    2
			pushi    50
			pushi    305
			callk    Random,  4
			jmp      code_1355
code_134c:
			pushi    2
			pushi    15
			pushi    305
			callk    Random,  4
code_1355:
			push    
			pushi    2
			pushi    86
			pushi    134
			callk    Random,  4
			push    
			lat      temp0
			lali     local31
			send     16
			+at      temp0
			jmp      code_1302
code_136b:
			ldi      180
			aTop     ticks
			jmp      code_13ce
code_1373:
			dup     
			ldi      6
			eq?     
			bnt      code_13be
			ldi      0
			sat      temp0
code_137e:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_13a9
			pushi    #setStep
			pushi    2
			pushi    1
			pushi    1
			pushi    303
			pushi    1
			lofsa    wispCage
			push    
			pushi    283
			pushi    2
			class    Wander
			push    
			pushi    230
			lat      temp0
			lali     local31
			send     22
			+at      temp0
			jmp      code_137e
code_13a9:
			ldi      44
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    5
			self     10
			jmp      code_13ce
code_13be:
			dup     
			ldi      7
			eq?     
			bnt      code_13ce
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_13ce:
			toss    
			ret     
		)
	)
)

(instance frenzy of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #x
			pushi    0
			lal      local30
			send     4
			push    
			ldi      390
			gt?     
			bnt      code_1435
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    330
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pushi    142
			pushi    1
			pushi    0
			pToa     client
			send     16
code_1435:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14a6
			lsg      global11
			ldi      610
			eq?     
			bnt      code_1458
			ldi      60
			jmp      code_145a
code_1458:
			ldi      100
code_145a:
			sat      temp0
			lsg      global11
			ldi      610
			eq?     
			bnt      code_146a
			ldi      60
			jmp      code_146c
code_146a:
			ldi      75
code_146c:
			sat      temp1
			pushi    #x
			pushi    0
			lal      local30
			send     4
			push    
			pushi    2
			pushi    0
			lst      temp0
			callk    Random,  4
			add     
			sat      temp2
			pushi    #y
			pushi    0
			lal      local30
			send     4
			push    
			pushi    2
			pushi    0
			lst      temp1
			callk    Random,  4
			add     
			sat      temp3
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lst      temp2
			lst      temp3
			pushSelf
			pToa     client
			send     12
			jmp      code_14ba
code_14a6:
			dup     
			ldi      1
			eq?     
			bnt      code_14ba
			pTos     state
			ldi      2
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_14ba:
			toss    
			ret     
		)
	)
)

(instance toTheKnight of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_152d
			pushi    0
			callb    proc0_3,  0
			lag      global25
			bnt      code_1516
			pushi    #dispose
			pushi    0
			send     4
code_1516:
			pushi    5
			pushi    1
			lea      @local303
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1624
code_152d:
			dup     
			ldi      1
			eq?     
			bnt      code_153b
			ldi      2
			aTop     seconds
			jmp      code_1624
code_153b:
			dup     
			ldi      2
			eq?     
			bnt      code_1557
			ldi      21
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    3
			self     10
			jmp      code_1624
code_1557:
			dup     
			ldi      3
			eq?     
			bnt      code_1565
			ldi      1
			aTop     cycles
			jmp      code_1624
code_1565:
			dup     
			ldi      4
			eq?     
			bnt      code_15a2
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bt       code_157b
			pushi    1
			pushi    51
			callb    proc0_5,  2
code_157b:
			bnt      code_1592
			ldi      19
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    2
			self     10
			jmp      code_1624
code_1592:
			pTos     state
			ldi      3
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1624
code_15a2:
			dup     
			ldi      5
			eq?     
			bnt      code_15b7
			pushi    #setScript
			pushi    2
			lofsa    wispsGoGetBoat
			push    
			pushSelf
			self     8
			jmp      code_1624
code_15b7:
			dup     
			ldi      6
			eq?     
			bnt      code_15d3
			ldi      50
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    6
			self     10
			jmp      code_1624
code_15d3:
			dup     
			ldi      7
			eq?     
			bnt      code_15f8
			pushi    #east
			pushi    1
			pushi    620
			pushi    391
			pushi    1
			pushi    620
			lag      global2
			send     12
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1624
code_15f8:
			dup     
			ldi      8
			eq?     
			bnt      code_1614
			ldi      31
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    4
			self     10
			jmp      code_1624
code_1614:
			dup     
			ldi      9
			eq?     
			bnt      code_1624
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1624:
			toss    
			ret     
		)
	)
)

(instance outlawAfterWisps of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16a4
			pushi    0
			callb    proc0_3,  0
			pushi    #contains
			pushi    1
			lsl      local31
			lag      global5
			send     6
			bnt      code_169b
			lsg      global130
			ldi      13
			eq?     
			bnt      code_169b
			ldi      54
			sal      local8
			pushi    #setScript
			pushi    3
			lofsa    naiadPrinter
			push    
			pushSelf
			pushi    7
			self     10
			jmp      code_1754
code_169b:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1754
code_16a4:
			dup     
			ldi      1
			eq?     
			bnt      code_1742
			pushi    0
			call     localproc_0317,  0
			pushi    5
			pushi    1
			pushi    #agonize
			pushi    162
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    24
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      125
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			sub     
			push    
			pushSelf
			lag      global0
			send     36
			pushi    #contains
			pushi    1
			lsl      local31
			lag      global5
			send     6
			bnt      code_1754
			lsg      global130
			ldi      13
			eq?     
			bnt      code_1754
			ldi      0
			sat      temp0
code_1705:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_1754
			pushi    #ignoreBlocks
			pushi    1
			lofsa    wispCage
			push    
			pushi    308
			pushi    2
			pushi    5
			dup     
			pushi    162
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    330
			pushi    95
			lat      temp0
			lali     local31
			send     30
			+at      temp0
			jmp      code_1705
			jmp      code_1754
code_1742:
			dup     
			ldi      2
			eq?     
			bnt      code_1754
			pushi    #newRoom
			pushi    1
			pushi    610
			lag      global2
			send     6
code_1754:
			toss    
			ret     
		)
	)
)

(instance stepInBoatAsOutlaw of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17f3
			pushi    0
			callb    proc0_3,  0
			lsg      global11
			ldi      600
			eq?     
			bnt      code_17ce
			pushi    66
			pushi    #superClass
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    133
			pushi    156
			pushSelf
			lag      global0
			send     18
			jmp      code_1942
code_17ce:
			pushi    66
			pushi    #superClass
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    128
			pushi    141
			pushSelf
			lag      global0
			send     18
			jmp      code_1942
code_17f3:
			dup     
			ldi      1
			eq?     
			bnt      code_1809
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_1942
code_1809:
			dup     
			ldi      2
			eq?     
			bnt      code_186f
			pushi    5
			pushi    #superClass
			pushi    15
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     38
			pushi    #posn
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
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    bow
			send     24
			jmp      code_1942
code_186f:
			dup     
			ldi      3
			eq?     
			bnt      code_187d
			ldi      30
			aTop     ticks
			jmp      code_1942
code_187d:
			dup     
			ldi      4
			eq?     
			bnt      code_18d5
			pushi    #dispose
			pushi    0
			lofsa    bow
			send     4
			pushi    3
			pushi    #superClass
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     14
			pushi    #posn
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
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    pole
			send     20
			jmp      code_1942
code_18d5:
			dup     
			ldi      5
			eq?     
			bnt      code_1936
			pushi    #dispose
			pushi    0
			lofsa    rgnBoat
			send     4
			pushi    #dispose
			pushi    0
			lofsa    pole
			send     4
			pushi    5
			pushi    1
			pushi    587
			pushi    66
			pushi    1
			pushi    65535
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lsg      global11
			ldi      590
			eq?     
			bnt      code_1911
			ldi      134
			jmp      code_1914
code_1911:
			ldi      137
code_1914:
			push    
			pushi    3
			pushi    1
			lsg      global11
			ldi      590
			eq?     
			bnt      code_1927
			ldi      136
			jmp      code_192a
code_1927:
			ldi      154
code_192a:
			push    
			lag      global0
			send     36
			ldi      6
			aTop     ticks
			jmp      code_1942
code_1936:
			dup     
			ldi      6
			eq?     
			bnt      code_1942
			pushi    #dispose
			pushi    0
			self     4
code_1942:
			toss    
			ret     
		)
	)
)

(instance monkBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19e7
			pushi    0
			callb    proc0_3,  0
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      global5
			send     6
			bnt      code_19b2
			pushi    5
			pushi    1
			lea      @local336
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1b9b
code_19b2:
			lal      local4
			bnt      code_19c6
			pushi    3
			pushi    1601
			pushi    78
			pushSelf
			calle    proc13_4,  6
			jmp      code_1b9b
code_19c6:
			pushi    3
			pushi    128
			pushi    57
			pushi    21
			calle    proc958_0,  6
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    3
			pushi    0
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1b9b
code_19e7:
			dup     
			ldi      1
			eq?     
			bnt      code_1a31
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      global5
			send     6
			bt       code_19fe
			lal      local4
code_19fe:
			bnt      code_1a0d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1b9b
code_1a0d:
			lal      local4
			bnt      code_1a28
			pushi    5
			pushi    1
			lea      @local307
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1b9b
code_1a28:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1b9b
code_1a31:
			dup     
			ldi      2
			eq?     
			bnt      code_1a50
			lal      local4
			bnt      code_1a49
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1b9b
code_1a49:
			ldi      3
			aTop     seconds
			jmp      code_1b9b
code_1a50:
			dup     
			ldi      3
			eq?     
			bnt      code_1a8c
			lsg      global136
			ldi      0
			eq?     
			bnt      code_1a6a
			pushi    2
			pushi    25
			pushi    85
			calle    proc806_1,  4
code_1a6a:
			lal      local2
			not     
			bnt      code_1a83
			ldi      1
			sal      local2
			pushi    3
			pushi    1601
			pushi    59
			pushSelf
			calle    proc13_4,  6
			jmp      code_1b9b
code_1a83:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1b9b
code_1a8c:
			dup     
			ldi      4
			eq?     
			bnt      code_1a9a
			ldi      3
			aTop     seconds
			jmp      code_1b9b
code_1a9a:
			dup     
			ldi      5
			eq?     
			bnt      code_1ade
			ldi      1
			sal      local26
			pushi    #notify
			pushi    1
			pushi    1
			lag      global2
			send     6
			lsg      global11
			ldi      600
			eq?     
			bnt      code_1aca
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    603
			pushi    2
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1b9b
code_1aca:
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    603
			pushi    3
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1b9b
code_1ade:
			dup     
			ldi      6
			eq?     
			bnt      code_1aec
			ldi      12
			aTop     ticks
			jmp      code_1b9b
code_1aec:
			dup     
			ldi      7
			eq?     
			bnt      code_1b5f
			ldi      0
			sal      local26
			ldi      1
			sal      local24
			lsg      global136
			dup     
			ldi      0
			eq?     
			bnt      code_1b1f
			pushi    7
			pushi    2
			lea      @local311
			push    
			pushi    999
			pushi    0
			pushi    11
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b5b
code_1b1f:
			dup     
			ldi      1
			eq?     
			bnt      code_1b3c
			pushi    5
			pushi    1
			lea      @local317
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1b5b
code_1b3c:
			dup     
			ldi      2
			eq?     
			bnt      code_1b5b
			pushi    7
			pushi    2
			lea      @local321
			push    
			pushi    999
			pushi    0
			pushi    11
			pushi    3
			pushSelf
			calle    proc851_0,  14
code_1b5b:
			toss    
			jmp      code_1b9b
code_1b5f:
			dup     
			ldi      8
			eq?     
			bnt      code_1b9b
			lsg      global136
			ldi      2
			eq?     
			bnt      code_1b83
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    603
			pushi    4
			callk    ScriptID,  4
			push    
			pToa     client
			send     6
			jmp      code_1b9b
code_1b83:
			pushi    0
			callb    proc0_4,  0
			+ag      global136
			pushi    #setScript
			pushi    1
			lofsa    monkWaitTimer
			push    
			lofsa    Fens
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1b9b:
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
			bnt      code_1c01
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      587
			eq?     
			bnt      code_1ccf
			pushi    3
			pushi    1601
			pushi    99
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_1ccf
code_1c01:
			dup     
			ldi      4
			eq?     
			bnt      code_1ccf
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_1c5b
			pushi    3
			lsg      global11
			pushi    590
			pushi    600
			calle    proc999_5,  6
			bnt      code_1c41
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    603
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			pushi    1
			pushi    1
			callk    GetTime,  2
			sag      global129
			ldi      1
			jmp      code_1cce
code_1c41:
			lsg      global11
			ldi      610
			eq?     
			bnt      code_1cce
			pushi    3
			pushi    1601
			pushi    89
			pushi    0
			calle    proc13_4,  6
			ldi      1
			jmp      code_1cce
code_1c5b:
			dup     
			ldi      12
			eq?     
			bnt      code_1c73
			pushi    3
			pushi    1601
			pushi    90
			pushi    0
			calle    proc13_4,  6
			ldi      1
			jmp      code_1cce
code_1c73:
			dup     
			ldi      5
			eq?     
			bnt      code_1cce
			lsg      global126
			ldi      6
			eq?     
			bnt      code_1cce
			pushi    3
			lsg      global11
			pushi    590
			pushi    600
			calle    proc999_5,  6
			bnt      code_1ca6
			pushi    #setScript
			pushi    1
			lofsa    monkBoat
			push    
			lag      global2
			send     6
			ldi      1
			jmp      code_1cce
code_1ca6:
			lsg      global11
			ldi      610
			eq?     
			bnt      code_1cce
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			ldi      250
			lt?     
			bnt      code_1cce
			pushi    #setScript
			pushi    1
			lofsa    flutePlayer
			push    
			lofsa    robin
			send     6
			ldi      1
code_1cce:
			toss    
code_1ccf:
			toss    
			ret     
		)
	)
)

(instance flutePlayer of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d39
			pushi    #xStep
			pushi    0
			lofsa    rgnBoat
			send     4
			sal      local9
			pushi    #yStep
			pushi    0
			lofsa    rgnBoat
			send     4
			sal      local10
			pushi    #setStep
			pushi    2
			pushi    0
			pushi    0
			lofsa    rgnBoat
			send     8
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    3
			pushi    0
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1db6
code_1d39:
			dup     
			ldi      1
			eq?     
			bnt      code_1d71
			lal      local5
			bnt      code_1d5b
			pushi    5
			pushi    1
			lea      @local326
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1db6
code_1d5b:
			pushi    5
			pushi    1
			lea      @local331
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1db6
code_1d71:
			dup     
			ldi      2
			eq?     
			bnt      code_1db6
			lal      local5
			bnt      code_1d94
			pushi    #setScript
			pushi    3
			pushi    2
			pushi    603
			pushi    1
			callk    ScriptID,  4
			push    
			pushi    0
			pushi    1
			lag      global2
			send     10
			jmp      code_1db6
code_1d94:
			pushi    #setStep
			pushi    2
			lsl      local9
			lsl      local10
			lofsa    rgnBoat
			send     8
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    monk
			send     6
			ldi      1
			sal      local5
			pushi    #dispose
			pushi    0
			self     4
code_1db6:
			toss    
			ret     
		)
	)
)

(instance monkWaitTimer of Script
	(properties)
	
	(method (dispose)
		(asm
			ldi      0
			sag      global132
			sal      local4
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
			bnt      code_1e39
			ldi      1
			sag      global132
			lsg      global87
			dup     
			ldi      0
			eq?     
			bnt      code_1e1e
			ldi      180
			jmp      code_1e33
code_1e1e:
			dup     
			ldi      1
			eq?     
			bnt      code_1e2a
			ldi      120
			jmp      code_1e33
code_1e2a:
			dup     
			ldi      2
			eq?     
			bnt      code_1e33
			ldi      90
code_1e33:
			toss    
			aTop     seconds
			jmp      code_1e45
code_1e39:
			dup     
			ldi      1
			eq?     
			bnt      code_1e45
			pushi    #dispose
			pushi    0
			self     4
code_1e45:
			toss    
			ret     
		)
	)
)

(instance naiadPrinter of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ede
			lag      global143
			sal      local1
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    1
			pushi    8
			lag      global69
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1fdd
code_1ede:
			dup     
			ldi      1
			eq?     
			bnt      code_1f26
			pushi    1
			pushi    30
			calle    proc13_6,  2
			pushi    8
			pushi    1601
			lal      local8
			bnt      code_1ef9
			jmp      code_1efb
code_1ef9:
			pToa     register
code_1efb:
			push    
			pushSelf
			pushi    67
			pushi    2
			pushi    15
			pushi    200
			callk    Random,  4
			push    
			pushi    2
			pushi    5
			pushi    100
			callk    Random,  4
			push    
			pushi    80
			lofsa    {Will-o-th'Wisps}
			push    
			calle    proc13_4,  16
			lal      local8
			bnt      code_1fdd
			+al      local8
			jmp      code_1fdd
code_1f26:
			dup     
			ldi      2
			eq?     
			bnt      code_1fb3
			lal      local8
			bnt      code_1faa
			push    
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1f41
			ldi      18
			jmp      code_1f9e
code_1f41:
			dup     
			ldi      2
			eq?     
			bnt      code_1f4d
			ldi      20
			jmp      code_1f9e
code_1f4d:
			dup     
			ldi      3
			eq?     
			bnt      code_1f59
			ldi      24
			jmp      code_1f9e
code_1f59:
			dup     
			ldi      4
			eq?     
			bnt      code_1f65
			ldi      43
			jmp      code_1f9e
code_1f65:
			dup     
			ldi      5
			eq?     
			bnt      code_1f71
			ldi      49
			jmp      code_1f9e
code_1f71:
			dup     
			ldi      6
			eq?     
			bnt      code_1f7d
			ldi      53
			jmp      code_1f9e
code_1f7d:
			dup     
			ldi      7
			eq?     
			bnt      code_1f89
			ldi      57
			jmp      code_1f9e
code_1f89:
			dup     
			ldi      8
			eq?     
			bnt      code_1f95
			ldi      10
			jmp      code_1f9e
code_1f95:
			pushi    2
			pushi    601
			pushi    0
			calle    proc255_0,  4
code_1f9e:
			toss    
			le?     
			bnt      code_1faa
			pTos     state
			ldi      2
			sub     
			aTop     state
code_1faa:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1fdd
code_1fb3:
			dup     
			ldi      3
			eq?     
			bnt      code_1fdd
			ldi      0
			sal      local8
			lal      local1
			not     
			bnt      code_1fc8
			pushi    0
			callb    proc0_4,  0
code_1fc8:
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1fdd:
			toss    
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			pToa     notKilled
			not     
			bnt      code_1eaf
			pushi    1
			pushi    0
			calle    proc13_6,  2
			lal      local1
			not     
			bnt      code_1e9c
			pushi    0
			callb    proc0_4,  0
code_1e9c:
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			ldi      0
			sal      local8
			pushi    #dispose
			pushi    0
			self     4
code_1eaf:
			pushi    #cue
			pushi    0
			&rest    param1
			super    TScript,  4
			ret     
		)
	)
)
