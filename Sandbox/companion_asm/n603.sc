;;; Sierra Script 1.0 - (do not remove this comment)
(script# 603)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n945)
(use n969)
(use n989)
(use n992)
(use n999)

(public
	blewIt 0
	knockItOff 1
	incoming600 2
	incoming590 3
	walkToBoat 4
)

(local
	local0
	local1
	[local2 4] = [1601 94 1]
	[local6 5] = [1601 75 1 1]
	[local11 5] = [1601 97 1]
	[local16 5] = [1601 86 1 2]
)
(instance blewIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0040
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_00df
code_0040:
			dup     
			ldi      1
			eq?     
			bnt      code_004e
			ldi      90
			aTop     ticks
			jmp      code_00df
code_004e:
			dup     
			ldi      2
			eq?     
			bnt      code_0064
			pushi    3
			pushi    1601
			pushi    92
			pushSelf
			calle    proc13_4,  6
			jmp      code_00df
code_0064:
			dup     
			ldi      3
			eq?     
			bnt      code_007e
			pushi    #setScript
			pushi    1
			lofsa    musicPlay
			push    
			lag      global1
			send     6
			ldi      60
			aTop     ticks
			jmp      code_00df
code_007e:
			dup     
			ldi      4
			eq?     
			bnt      code_0094
			pushi    3
			pushi    1601
			pushi    93
			pushSelf
			calle    proc13_4,  6
			jmp      code_00df
code_0094:
			dup     
			ldi      5
			eq?     
			bnt      code_00b6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    245
			pushSelf
			lag      global0
			send     12
			jmp      code_00df
code_00b6:
			dup     
			ldi      6
			eq?     
			bnt      code_00df
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global168
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global1
			send     6
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
code_00df:
			toss    
			ret     
		)
	)
)

(instance knockItOff of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #cel
			pushi    0
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_014f
			pushi    #number
			pushi    0
			lofsa    dieSound
			send     4
			push    
			ldi      928
			ne?     
			bnt      code_014f
			pushi    #number
			pushi    1
			pushi    928
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
code_014f:
			pushi    #doit
			pushi    0
			&rest    param1
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
			bnt      code_01c7
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    288
			pushi    1
			pushi    #species
			pushi    162
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    150
			pushi    1
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     26
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			ldi      12
			aTop     ticks
			jmp      code_0283
code_01c7:
			dup     
			ldi      1
			eq?     
			bnt      code_01ec
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_0283
code_01ec:
			dup     
			ldi      2
			eq?     
			bnt      code_0210
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     8
			pushi    #play
			pushi    0
			lofsa    dieSound
			send     4
			jmp      code_0283
code_0210:
			dup     
			ldi      3
			eq?     
			bnt      code_0233
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     14
			jmp      code_0283
code_0233:
			dup     
			ldi      4
			eq?     
			bnt      code_0241
			ldi      30
			aTop     ticks
			jmp      code_0283
code_0241:
			dup     
			ldi      5
			eq?     
			bnt      code_0275
			pToa     register
			bnt      code_0261
			pushi    5
			pushi    1
			lea      @local11
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0283
code_0261:
			pushi    5
			pushi    1
			lea      @local2
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0283
code_0275:
			dup     
			ldi      6
			eq?     
			bnt      code_0283
			pushi    0
			calle    proc806_0,  0
code_0283:
			toss    
			ret     
		)
	)
)

(instance incoming600 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    603
			callk    DisposeScript,  2
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
			bnt      code_032e
			pushi    #view
			pushi    1
			pushi    21
			pushi    162
			pushi    1
			pushi    6
			pushi    288
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    5
			pushi    54
			pushi    1
			pushi    1
			pushi    55
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    203
			pushi    128
			pushi    219
			pushi    1
			pushi    18
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     54
			pushi    2
			lsg      global0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			push    
			callb    proc0_9,  4
			ldi      18
			aTop     ticks
			jmp      code_0464
code_032e:
			dup     
			ldi      1
			eq?     
			bnt      code_039d
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      3
			add     
			push    
			pushi    66
			pushi    1
			lsl      local0
			ldi      2
			mod     
			bnt      code_037e
			pushi    #priority
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      1
			add     
			jmp      code_038b
code_037e:
			pushi    #priority
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
code_038b:
			push    
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     18
			ldi      18
			aTop     ticks
			jmp      code_0464
code_039d:
			dup     
			ldi      2
			eq?     
			bnt      code_03bb
			+al      local0
			push    
			ldi      6
			lt?     
			bnt      code_03b4
			pTos     state
			ldi      2
			sub     
			aTop     state
code_03b4:
			ldi      18
			aTop     ticks
			jmp      code_0464
code_03bb:
			dup     
			ldi      3
			eq?     
			bnt      code_03dc
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     14
			jmp      code_0464
code_03dc:
			dup     
			ldi      4
			eq?     
			bnt      code_0443
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
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
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
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     30
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    113
			pushi    164
			pushSelf
			lag      global0
			send     12
			jmp      code_0464
code_0443:
			dup     
			ldi      5
			eq?     
			bnt      code_0458
			pushi    #setHeading
			pushi    2
			pushi    45
			pushSelf
			lag      global0
			send     8
			jmp      code_0464
code_0458:
			dup     
			ldi      6
			eq?     
			bnt      code_0464
			pushi    #dispose
			pushi    0
			self     4
code_0464:
			toss    
			ret     
		)
	)
)

(instance incoming590 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    603
			callk    DisposeScript,  2
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
			bnt      code_050c
			pushi    #view
			pushi    1
			pushi    21
			pushi    162
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    5
			pushi    54
			pushi    1
			pushi    1
			pushi    55
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    59
			pushi    126
			pushi    219
			pushi    1
			pushi    18
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     54
			pushi    2
			lsg      global0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			push    
			callb    proc0_9,  4
			ldi      18
			aTop     ticks
			jmp      code_0641
code_050c:
			dup     
			ldi      1
			eq?     
			bnt      code_0566
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    66
			pushi    1
			lsl      local0
			ldi      2
			mod     
			bnt      code_0547
			pushi    #priority
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      1
			add     
			jmp      code_0554
code_0547:
			pushi    #priority
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
code_0554:
			push    
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     12
			ldi      18
			aTop     ticks
			jmp      code_0641
code_0566:
			dup     
			ldi      2
			eq?     
			bnt      code_0584
			+al      local0
			push    
			ldi      6
			lt?     
			bnt      code_057d
			pTos     state
			ldi      2
			sub     
			aTop     state
code_057d:
			ldi      18
			aTop     ticks
			jmp      code_0641
code_0584:
			dup     
			ldi      3
			eq?     
			bnt      code_05a5
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     14
			jmp      code_0641
code_05a5:
			dup     
			ldi      4
			eq?     
			bnt      code_061f
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
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
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
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     26
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    135
			pushi    145
			pushSelf
			lag      global0
			send     12
			jmp      code_0641
code_061f:
			dup     
			ldi      5
			eq?     
			bnt      code_0635
			pushi    #setHeading
			pushi    2
			pushi    315
			pushSelf
			lag      global0
			send     8
			jmp      code_0641
code_0635:
			dup     
			ldi      6
			eq?     
			bnt      code_0641
			pushi    #dispose
			pushi    0
			self     4
code_0641:
			toss    
			ret     
		)
	)
)

(instance walkToBoat of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06c9
			pushi    0
			callb    proc0_3,  0
			lsg      global11
			ldi      590
			eq?     
			bnt      code_06b3
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    131
			pushi    144
			pushSelf
			lag      global0
			send     12
			jmp      code_07b7
code_06b3:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    131
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_07b7
code_06c9:
			dup     
			ldi      1
			eq?     
			bnt      code_06dd
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			lag      global0
			send     8
			jmp      code_07b7
code_06dd:
			dup     
			ldi      2
			eq?     
			bnt      code_0780
			pushi    #disable
			pushi    2
			pushi    5
			pushi    4
			lag      global69
			send     8
			lsg      global126
			ldi      0
			eq?     
			bnt      code_070c
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    601
			pushi    8
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_07b7
code_070c:
			pushi    5
			pushi    1
			pushi    19
			pushi    4
			pushi    1
			lsg      global11
			ldi      590
			eq?     
			bnt      code_0723
			ldi      128
			jmp      code_0726
code_0723:
			ldi      132
code_0726:
			push    
			pushi    3
			pushi    1
			lsg      global11
			ldi      590
			eq?     
			bnt      code_0739
			ldi      146
			jmp      code_073c
code_0739:
			ldi      167
code_073c:
			push    
			pushi    162
			pushi    1
			lsg      global11
			ldi      590
			eq?     
			bnt      code_074f
			ldi      0
			jmp      code_0751
code_074f:
			ldi      1
code_0751:
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			lsg      global11
			ldi      600
			eq?     
			bnt      code_0768
			ldi      10
			jmp      code_076a
code_0768:
			ldi      65535
code_076a:
			push    
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     50
			jmp      code_07b7
code_0780:
			dup     
			ldi      3
			eq?     
			bnt      code_07b7
			lsg      global126
			ldi      0
			eq?     
			bnt      code_07ab
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    601
			pushi    9
			callk    ScriptID,  4
			push    
			pToa     client
			send     6
			pushi    1
			pushi    603
			callk    DisposeScript,  2
			jmp      code_07b7
code_07ab:
			pushi    #setScript
			pushi    1
			lofsa    egoInMonkBoat
			push    
			pToa     client
			send     6
code_07b7:
			toss    
			ret     
		)
	)
)

(instance egoInMonkBoat of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_0940
			lsg      global11
			ldi      590
			eq?     
			bnt      code_08aa
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
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      32
			add     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      9
			add     
			push    
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     14
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
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      16
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     14
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     6
			jmp      code_0940
code_08aa:
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
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      9
			add     
			push    
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     14
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
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      27
			add     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      27
			sub     
			push    
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     14
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     6
code_0940:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_098c
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			lsg      global136
			ldi      2
			eq?     
			bnt      code_0983
			pushi    7
			pushi    2
			lea      @local16
			push    
			pushi    8
			pushi    0
			pushi    11
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0b81
code_0983:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0b81
code_098c:
			dup     
			ldi      1
			eq?     
			bnt      code_0a12
			lsg      global87
			ldi      0
			gt?     
			bnt      code_09a0
			ldi      2
			jmp      code_09a2
code_09a0:
			ldi      3
code_09a2:
			sat      temp1
			pushi    #setStep
			pushi    2
			push    
			push    
			pushi    66
			pushi    1
			pushi    65535
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     14
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16384
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    3
			callk    ScriptID,  4
			send     40
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			ldi      18
			aTop     ticks
			jmp      code_0b81
code_0a12:
			dup     
			ldi      2
			eq?     
			bnt      code_0a3e
			lsg      global115
			ldi      2
			eq?     
			bnt      code_0a35
			pushi    5
			pushi    1
			lea      @local6
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0b81
code_0a35:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0b81
code_0a3e:
			dup     
			ldi      3
			eq?     
			bnt      code_0ae4
			pushi    #play
			pushi    0
			lag      global113
			send     4
			lsg      global87
			dup     
			ldi      0
			eq?     
			bnt      code_0a6a
			pushi    #setStep
			pushi    2
			pushi    5
			pushi    3
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     8
			jmp      code_0a95
code_0a6a:
			dup     
			ldi      1
			eq?     
			bnt      code_0a85
			pushi    #setStep
			pushi    2
			pushi    3
			pushi    2
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     8
			jmp      code_0a95
code_0a85:
			pushi    #setStep
			pushi    2
			pushi    2
			pushi    1
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     8
code_0a95:
			toss    
			lsg      global11
			ldi      590
			eq?     
			bnt      code_0ac1
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    125
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_0b81
code_0ac1:
			pushi    #setCycle
			pushi    1
			class    Rev
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    180
			pushi    137
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_0b81
code_0ae4:
			dup     
			ldi      4
			eq?     
			bnt      code_0b30
			lsg      global11
			ldi      590
			eq?     
			bnt      code_0b0f
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    319
			pushi    115
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     12
			jmp      code_0b81
code_0b0f:
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    100
			pushi    120
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_0b81
code_0b30:
			dup     
			ldi      5
			eq?     
			bnt      code_0b62
			lsg      global11
			ldi      590
			eq?     
			bnt      code_0b49
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0b81
code_0b49:
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    0
			pushi    115
			pushSelf
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     12
			jmp      code_0b81
code_0b62:
			dup     
			ldi      6
			eq?     
			bnt      code_0b81
			pushi    0
			callb    proc0_4,  0
			pushi    #setScript
			pushi    1
			pushi    0
			pToa     client
			send     6
			pushi    #newRoom
			pushi    1
			pushi    610
			lag      global2
			send     6
code_0b81:
			toss    
			ret     
		)
	)
)

(instance musicPlay of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0be5
			pushi    #number
			pushi    1
			pushi    583
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    2
			pushi    75
			pushSelf
			lag      global168
			send     20
			jmp      code_0c0e
code_0be5:
			dup     
			ldi      1
			eq?     
			bnt      code_0c0e
			pushi    #prevSignal
			pushi    0
			lag      global168
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_0c08
			ldi      65535
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0c0e
code_0c08:
			dpToa    state
			ldi      1
			aTop     cycles
code_0c0e:
			toss    
			ret     
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
