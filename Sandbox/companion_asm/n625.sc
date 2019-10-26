;;; Sierra Script 1.0 - (do not remove this comment)
(script# 625)
(include sci.sh)
(use n000)
(use n806)
(use n851)
(use n930)
(use n945)
(use n958)
(use n977)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	Monastery 0
	chip 1
	prior 2
	wGateTimer 7
)

(local
	local0
	local1
	[local2 4] = [1625 1 1]
	[local6 4] = [1625 2 1]
	[local10 20] = [1625 3 1 0 1625 4 1 0 1625 5 1 0 1625 7 1 0 1625 6 1]
	[local30 4] = [1625 9 1]
	[local34 4] = [1625 10 1]
	[local38 8] = [1625 11 2 1 2 1 2]
	[local46 6] = [1625 16 2 1 2]
	[local52 7] = [1625 19 2 1 2 2]
	[local59 6] = [1625 23 2 1 2]
	[local65 4] = [1625 26 1]
	[local69 4] = [1625 27 1]
	[local73 4] = [1625 28 1]
	[local77 9] = [673 0 2 4 19 33 21 20 21]
	[local86 9] = [43 0 2 4 25 37 21 26 28]
)
(class Monastery of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		givePriorMoney 0
		wherePrior 0
		fulkStatus 0
		whichDoor 0
		gobletTipped 0
		backFromJewels 0
		waterDie 0
		firstTimeTalk 1
		noPriorExperience 1
		moneyThree 0
		firstTimeEnter 0
		stairMessage 0
		stairsMessage 0
		deathReason 0
		roomToDie 0
		monkGroop 0
		tFULK 0
		tPRIOR 0
	)
	
	(method (init)
		(asm
			lofsa    chipGroop
			aTop     monkGroop
			pushi    #init
			pushi    0
			super    Rgn,  4
			pushi    3
			pushi    128
			pushi    16
			pushi    641
			calle    proc958_0,  6
			pushi    2
			pushi    130
			pushi    985
			callk    Load,  4
			lea      @local77
			aTop     tFULK
			lea      @local86
			aTop     tPRIOR
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #enable
			pushi    4
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			self     6
			pushi    #dispose
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    10
			lsp      newRoomNumber
			pushi    620
			pushi    630
			pushi    640
			pushi    650
			pushi    660
			pushi    670
			pushi    680
			pushi    690
			pushi    695
			calle    proc999_5,  20
			not     
			bnt      code_008d
			pushi    #keep
			pushi    1
			pushi    0
			self     6
			jmp      code_00ac
code_008d:
			lsp      newRoomNumber
			ldi      680
			eq?     
			bnt      code_00ac
			ldi      1
			aTop     deathReason
			pToa     script
			not     
			bnt      code_00ac
			pushi    #setScript
			pushi    1
			lofsa    wGateTimer
			push    
			class    Monastery
			send     6
code_00ac:
			ret     
		)
	)
)

(instance chipGroop of Grooper
	(properties)
)

(instance chip of Actor
	(properties
		view 16
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Actor,  4
			pushi    #approachVerbs
			pushi    2
			pushi    3
			pushi    4
			self     8
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_019f
			ldi      1
			ret     
			jmp      code_021b
code_019f:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			eq?     
			bnt      code_021b
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_021b
			pushi    #isNotHidden
			pushi    0
			self     4
			bnt      code_021b
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			sal      local0
			lag      global69
			bnt      code_01f4
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_01f4
			lag      global9
			bnt      code_01f4
			pushi    #indexOf
			pushi    1
			pushi    #curInvIcon
			pushi    0
			lag      global69
			send     4
			push    
			lag      global9
			send     6
code_01f4:
			sal      local1
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			lsl      local0
			ldi      2
			eq?     
			bnt      code_0211
			pushi    #doVerb
			pushi    1
			lsl      local0
			self     6
			jmp      code_021b
code_0211:
			pushi    #setScript
			pushi    1
			lofsa    walkToActor
			push    
			self     6
code_021b:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsg      global11
			ldi      620
			eq?     
			bnt      code_0242
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			pushi    2
			pushi    620
			pushi    1
			callk    ScriptID,  4
			send     8
			jmp      code_02b0
code_0242:
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_025d
			pushi    3
			lea      @local2
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			jmp      code_02af
code_025d:
			dup     
			ldi      3
			eq?     
			bnt      code_0276
			pushi    3
			lea      @local6
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			jmp      code_02af
code_0276:
			dup     
			ldi      4
			eq?     
			bnt      code_02a4
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_02a0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_02a0
			pushi    #setScript
			pushi    1
			lofsa    monkeyMoney
			push    
			lag      global2
			send     6
code_02a0:
			toss    
			jmp      code_02af
code_02a4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_02af:
			toss    
code_02b0:
			ret     
		)
	)
)

(instance prior of Actor
	(properties
		description 2711
		lookStr 8
		view 641
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Actor,  4
			pushi    #approachVerbs
			pushi    2
			pushi    3
			pushi    4
			self     8
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0363
			ldi      1
			ret     
			jmp      code_03df
code_0363:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			eq?     
			bnt      code_03df
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_03df
			pushi    #isNotHidden
			pushi    0
			self     4
			bnt      code_03df
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			sal      local0
			lag      global69
			bnt      code_03b8
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_03b8
			lag      global9
			bnt      code_03b8
			pushi    #indexOf
			pushi    1
			pushi    #curInvIcon
			pushi    0
			lag      global69
			send     4
			push    
			lag      global9
			send     6
code_03b8:
			sal      local1
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			lsl      local0
			ldi      2
			eq?     
			bnt      code_03d5
			pushi    #doVerb
			pushi    1
			lsl      local0
			self     6
			jmp      code_03df
code_03d5:
			pushi    #setScript
			pushi    1
			lofsa    walkToActor
			push    
			self     6
code_03df:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_0409
			pushi    3
			lea      @local30
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0572
code_0409:
			dup     
			ldi      3
			eq?     
			bnt      code_0429
			pushi    3
			lea      @local34
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0572
code_0429:
			dup     
			ldi      4
			eq?     
			bnt      code_0567
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_04af
			pushi    #givePriorMoney
			pushi    0
			class    Monastery
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0466
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_04ab
			pushi    #setScript
			pushi    1
			lofsa    notYetMoney
			push    
			lag      global2
			send     6
			jmp      code_04ab
code_0466:
			dup     
			ldi      1
			eq?     
			bnt      code_048a
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_04ab
			pushi    #setScript
			pushi    1
			lofsa    onceMoney
			push    
			lag      global2
			send     6
			jmp      code_04ab
code_048a:
			dup     
			ldi      2
			eq?     
			bnt      code_04ab
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_04ab
			pushi    #setScript
			pushi    1
			lofsa    twiceMoney
			push    
			lag      global2
			send     6
code_04ab:
			toss    
			jmp      code_0563
code_04af:
			dup     
			ldi      2
			eq?     
			bnt      code_04e5
			pushi    3
			lea      @local59
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    2
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65336
			calle    proc806_1,  2
			jmp      code_0563
code_04e5:
			dup     
			ldi      14
			eq?     
			bnt      code_051a
			pushi    3
			lea      @local65
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    14
			pushi    65535
			lag      global0
			send     8
			pushi    1
			pushi    65486
			calle    proc806_1,  2
			jmp      code_0563
code_051a:
			dup     
			ldi      17
			eq?     
			bnt      code_053a
			pushi    3
			lea      @local69
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0563
code_053a:
			dup     
			ldi      16
			eq?     
			bnt      code_0563
			pushi    #put
			pushi    2
			pushi    16
			pushi    65535
			lag      global0
			send     8
			pushi    3
			lea      @local73
			push    
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
code_0563:
			toss    
			jmp      code_0572
code_0567:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0572:
			toss    
			ret     
		)
	)
)

(instance walkToActor of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0650
			pushi    0
			callb    proc0_3,  0
			lsl      local0
			ldi      3
			lt?     
			bt       code_0632
			lsl      local0
			ldi      4
			gt?     
			bt       code_0632
			pushi    #distanceTo
			pushi    1
			pTos     client
			lag      global0
			send     6
			push    
			ldi      30
			le?     
code_0632:
			bnt      code_063c
			ldi      1
			aTop     cycles
			jmp      code_06e9
code_063c:
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			pTos     client
			pushi    25
			pushSelf
			lag      global0
			send     12
			jmp      code_06e9
code_0650:
			dup     
			ldi      1
			eq?     
			bnt      code_06ba
			pushi    4
			dup     
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			callk    GetAngle,  8
			sat      temp0
			push    
			ldi      15
			sub     
			push    
			pushi    #heading
			pushi    0
			lag      global0
			send     4
			le?     
			bnt      code_069e
			pprev   
			lst      temp0
			ldi      15
			add     
			le?     
			bnt      code_069e
			ldi      2
			aTop     cycles
			jmp      code_06e9
code_069e:
			pushi    2
			lsg      global0
			pTos     client
			callb    proc0_9,  4
			lst      temp0
			ldi      120
			gt?     
			bnt      code_06b3
			ldi      6
			jmp      code_06b5
code_06b3:
			ldi      4
code_06b5:
			aTop     cycles
			jmp      code_06e9
code_06ba:
			dup     
			ldi      2
			eq?     
			bnt      code_06e9
			pushi    #doVerb
			pushi    2
			lsl      local0
			lsl      local1
			pToa     client
			send     8
			pushi    0
			callb    proc0_4,  0
			lsg      global2
			ldi      640
			eq?     
			bnt      code_06e4
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
code_06e4:
			pushi    #dispose
			pushi    0
			self     4
code_06e9:
			toss    
			ret     
		)
	)
)

(instance ringed of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0793
			lsg      global11
			dup     
			ldi      650
			eq?     
			bnt      code_078b
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    143
			dup     
			lag      global0
			send     10
			pushi    #view
			pushi    1
			pushi    16
			pushi    284
			pushi    2
			pushi    27
			pushi    140
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    127
			pushi    144
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     46
			ldi      400
			aTop     ticks
			jmp      code_078f
code_078b:
			ldi      6
			aTop     ticks
code_078f:
			toss    
			jmp      code_07a5
code_0793:
			dup     
			ldi      1
			eq?     
			bnt      code_07a5
			pushi    #newRoom
			pushi    1
			pushi    695
			lag      global2
			send     6
code_07a5:
			toss    
			ret     
		)
	)
)

(instance notYetMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0800
			pushi    0
			callb    proc0_3,  0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			ldi      5
			aTop     seconds
			jmp      code_083b
code_0800:
			dup     
			ldi      1
			eq?     
			bnt      code_082b
			pushi    #givePriorMoney
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    4
			lea      @local38
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_083b
code_082b:
			dup     
			ldi      2
			eq?     
			bnt      code_083b
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_083b:
			toss    
			ret     
		)
	)
)

(instance onceMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0896
			pushi    0
			callb    proc0_3,  0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			ldi      5
			aTop     seconds
			jmp      code_08d1
code_0896:
			dup     
			ldi      1
			eq?     
			bnt      code_08c1
			pushi    #givePriorMoney
			pushi    1
			pushi    2
			class    Monastery
			send     6
			pushi    4
			lea      @local46
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_08d1
code_08c1:
			dup     
			ldi      2
			eq?     
			bnt      code_08d1
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_08d1:
			toss    
			ret     
		)
	)
)

(instance twiceMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_092c
			pushi    0
			callb    proc0_3,  0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			ldi      5
			aTop     seconds
			jmp      code_0966
code_092c:
			dup     
			ldi      1
			eq?     
			bnt      code_0956
			pushi    #moneyThree
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    3
			lea      @local52
			push    
			pushi    8
			pushi    #tPRIOR
			pushi    0
			class    Monastery
			send     4
			push    
			calle    proc851_0,  6
			jmp      code_0966
code_0956:
			dup     
			ldi      2
			eq?     
			bnt      code_0966
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0966:
			toss    
			ret     
		)
	)
)

(instance monkeyMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09c0
			pushi    0
			callb    proc0_3,  0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			ldi      5
			aTop     seconds
			jmp      code_09eb
code_09c0:
			dup     
			ldi      1
			eq?     
			bnt      code_09db
			pushi    5
			lea      @local10
			push    
			pushi    11
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_09eb
code_09db:
			dup     
			ldi      2
			eq?     
			bnt      code_09eb
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_09eb:
			toss    
			ret     
		)
	)
)

(instance wGateTimer of Script
	(properties
		seconds 180
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0a42
			pushi    #waterDie
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0a42:
			toss    
			ret     
		)
	)
)
