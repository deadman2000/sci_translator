;;; Sierra Script 1.0 - (do not remove this comment)
(script# 240)
(include sci.sh)
(use n000)
(use n851)
(use n852)
(use n890)
(use n891)
(use n892)
(use n958)
(use n961)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	robbedOne 0
)

(local
	[local0 8] = [2 3 1]
	[local8 4] = [6 6 1 1]
	[local12 4] = [5 2 4 4]
	[local16 8] = [74 151 72 151 72 153 74 153]
	[local24 13] = [-1 4480 17 0 0 0 0 0 0 111 112 113 114]
	[local37 7] = [1240 18 1 2 1 1]
	[local44 5] = [1240 22 2 2]
	[local49 5] = [1240 24 1 1]
	[local54 6] = [1240 26 1 2 3]
	[local60 4] = [1240 29 1]
	[local64 8] = [1240 30 2 1 1 2 1]
	[local72 5] = [1240 35 1 2]
	[local77 4] = [1240 37 1]
	[local81 7] = [1240 38 1 2 1 2]
	[local88 4] = [1240 0 1]
	[local92 7] = [1240 1 2 2 1 1]
	[local99 8] = [1240 5 2 1 2 1 1]
	[local107 5] = [1240 10 1 2]
	[local112 8] = [1240 13 1 2 2 1 3]
)
(instance robbedOne of Rm
	(properties
		picture 240
		style $0008
	)
	
	(method (init)
		(asm
			pushi    9
			pushi    128
			pushi    173
			pushi    33
			pushi    29
			pushi    30
			pushi    32
			pushi    151
			pushi    154
			pushi    155
			calle    proc958_0,  18
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_3,  0
			pushi    102
			pushi    #superClass
			pushi    #flags
			pushi    0
			lofsa    laughSound
			send     4
			push    
			ldi      65534
			and     
			push    
			lofsa    laughSound
			send     6
			lsg      global126
			ldi      3
			eq?     
			push    
			lsg      global126
			ldi      2
			eq?     
			or      
			bnt      code_00e8
			pushi    1
			pushi    102
			callb    proc0_5,  2
			not     
			bnt      code_00e8
			pushi    #init
			pushi    0
			pushi    4
			pushi    1
			pushi    319
			pushi    3
			pushi    1
			pushi    103
			pushi    219
			pushi    1
			pushi    6
			pushi    56
			pushi    1
			pushi    6
			pushi    289
			pushi    1
			pushi    1
			lag      global0
			send     34
			pushi    3
			pushi    5
			pushi    29
			pushi    30
			callb    proc0_2,  6
			pushi    #number
			pushi    1
			pushi    392
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global168
			send     16
			pushi    #x
			pushi    1
			pushi    65526
			pushi    3
			pushi    1
			pushi    111
			pushi    6
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    lilj
			send     22
			pushi    #x
			pushi    1
			pushi    179
			pushi    3
			pushi    1
			pushi    220
			pushi    6
			pushi    1
			pushi    3
			pushi    285
			pushi    0
			lofsa    tuckie
			send     22
			pushi    1
			pushi    102
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    theTrap
			push    
			self     6
			jmp      code_017f
code_00e8:
			pushi    1
			pushi    102
			callb    proc0_5,  2
			not     
			bnt      code_0175
			pushi    #init
			pushi    0
			pushi    4
			pushi    1
			pushi    319
			pushi    3
			pushi    1
			pushi    103
			pushi    219
			pushi    1
			pushi    6
			pushi    56
			pushi    1
			pushi    6
			pushi    289
			pushi    1
			pushi    1
			lag      global0
			send     34
			pushi    3
			pushi    5
			pushi    33
			pushi    34
			callb    proc0_2,  6
			pushi    #x
			pushi    1
			pushi    65526
			pushi    3
			pushi    1
			pushi    111
			pushi    6
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    lilj
			send     22
			pushi    #x
			pushi    1
			pushi    179
			pushi    3
			pushi    1
			pushi    220
			pushi    6
			pushi    1
			pushi    3
			pushi    285
			pushi    0
			lofsa    tuckie
			send     22
			pushi    #number
			pushi    1
			pushi    392
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global168
			send     16
			pushi    1
			pushi    102
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    theTrap
			push    
			self     6
			jmp      code_017f
code_0175:
			pushi    #setScript
			pushi    1
			lofsa    xRated
			push    
			self     6
code_017f:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global168
			send     12
			pushi    1
			pushi    890
			callk    DisposeScript,  2
			pushi    1
			pushi    891
			callk    DisposeScript,  2
			pushi    1
			pushi    892
			callk    DisposeScript,  2
			pushi    1
			pushi    852
			callk    DisposeScript,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance sheriffRides of Actor
	(properties
		x 319
		y 103
		view 173
		loop 1
		signal $4000
		illegalBits $0000
	)
)

(instance sheriffsHead of Prop
	(properties
		x 144
		y 70
		view 173
		loop 3
		priority 15
		signal $0010
	)
)

(instance lilj of Actor
	(properties
		x 303
		y 214
		view 151
		loop 1
		signal $4000
	)
)

(instance tuckie of Actor
	(properties
		x 294
		y 137
		view 154
		loop 1
		signal $4000
	)
)

(instance theTrap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0403
			pushi    #setScript
			pushi    2
			lofsa    trapHim
			push    
			pushSelf
			lag      global0
			send     8
			ldi      840
			aTop     ticks
			jmp      code_0480
code_0403:
			dup     
			ldi      1
			eq?     
			bnt      code_043b
			lsg      global126
			ldi      3
			eq?     
			push    
			lsg      global126
			ldi      2
			eq?     
			or      
			bnt      code_042a
			pushi    #setScript
			pushi    2
			lofsa    youFool1
			push    
			pushSelf
			lofsa    sheriffRides
			send     8
			jmp      code_0480
code_042a:
			pushi    #setScript
			pushi    2
			lofsa    youFool2
			push    
			pushSelf
			lofsa    sheriffRides
			send     8
			jmp      code_0480
code_043b:
			dup     
			ldi      2
			eq?     
			bnt      code_0445
			jmp      code_0480
code_0445:
			dup     
			ldi      3
			eq?     
			bnt      code_0480
			lsg      global126
			ldi      3
			eq?     
			push    
			lsg      global126
			ldi      2
			eq?     
			or      
			bnt      code_046f
			pushi    #setScript
			pushi    1
			lofsa    theDeception
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0480
code_046f:
			pushi    #setScript
			pushi    1
			lofsa    theCharade
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0480:
			toss    
			ret     
		)
	)
)

(instance trapHim of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04ed
			pushi    #setCycle
			pushi    3
			class    SyncStop
			push    
			pushi    30
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    74
			pushi    151
			pushi    0
			pushi    9
			dup     
			pushi    14
			lag      global0
			send     28
			jmp      code_0549
code_04ed:
			dup     
			ldi      1
			eq?     
			bnt      code_0514
			pushi    #setCycle
			pushi    2
			class    StopWalk
			push    
			pushi    30
			pushi    283
			pushi    5
			class    PPath
			push    
			lea      @local16
			push    
			pushi    0
			pushi    3
			pushSelf
			lag      global0
			send     22
			jmp      code_0549
code_0514:
			dup     
			ldi      2
			eq?     
			bnt      code_0530
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lag      global0
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0549
code_0530:
			dup     
			ldi      3
			eq?     
			bnt      code_0549
			pushi    #loop
			pushi    1
			pushi    6
			pushi    285
			pushi    0
			lag      global0
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_0549:
			toss    
			ret     
		)
	)
)

(instance youFool1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05be
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local0
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    141
			pushi    131
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    sheriffRides
			send     32
			jmp      code_05f1
code_05be:
			dup     
			ldi      1
			eq?     
			bnt      code_05e5
			pushi    #init
			pushi    0
			lofsa    sheriffsHead
			send     4
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    sheriffRides
			send     16
			ldi      6
			aTop     ticks
			jmp      code_05f1
code_05e5:
			dup     
			ldi      2
			eq?     
			bnt      code_05f1
			pushi    #dispose
			pushi    0
			self     4
code_05f1:
			toss    
			ret     
		)
	)
)

(instance theDeception of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_066a
			lsg      global126
			ldi      3
			eq?     
			bnt      code_0656
			pushi    5
			pushi    1
			lea      @local88
			push    
			pushi    5
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_08f1
code_0656:
			pushi    5
			pushi    1
			lea      @local88
			push    
			pushi    4
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_08f1
code_066a:
			dup     
			ldi      1
			eq?     
			bnt      code_0687
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheriffsHead
			send     14
			jmp      code_08f1
code_0687:
			dup     
			ldi      2
			eq?     
			bnt      code_069e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_08f1
code_069e:
			dup     
			ldi      3
			eq?     
			bnt      code_06b9
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    sheriffsHead
			send     12
			jmp      code_08f1
code_06b9:
			dup     
			ldi      4
			eq?     
			bnt      code_06d4
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    sheriffsHead
			send     12
			jmp      code_08f1
code_06d4:
			dup     
			ldi      5
			eq?     
			bnt      code_0711
			lsg      global126
			ldi      3
			eq?     
			bnt      code_06fa
			pushi    7
			pushi    2
			lea      @local92
			push    
			pushi    5
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_08f1
code_06fa:
			pushi    7
			pushi    2
			lea      @local92
			push    
			pushi    4
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_08f1
code_0711:
			dup     
			ldi      6
			eq?     
			bnt      code_0737
			pushi    #view
			pushi    1
			pushi    32
			pushi    6
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    79
			pushi    3
			pushi    1
			pushi    154
			lag      global0
			send     24
			ldi      6
			aTop     ticks
			jmp      code_08f1
code_0737:
			dup     
			ldi      7
			eq?     
			bnt      code_0753
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_08f1
code_0753:
			dup     
			ldi      8
			eq?     
			bnt      code_0761
			ldi      60
			aTop     ticks
			jmp      code_08f1
code_0761:
			dup     
			ldi      9
			eq?     
			bnt      code_0777
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_08f1
code_0777:
			dup     
			ldi      10
			eq?     
			bnt      code_0798
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    285
			pushi    0
			lag      global0
			send     16
			ldi      6
			aTop     ticks
			jmp      code_08f1
code_0798:
			dup     
			ldi      11
			eq?     
			bnt      code_07d5
			lsg      global126
			ldi      3
			eq?     
			bnt      code_07be
			pushi    7
			pushi    2
			lea      @local99
			push    
			pushi    5
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_08f1
code_07be:
			pushi    7
			pushi    2
			lea      @local99
			push    
			pushi    4
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_08f1
code_07d5:
			dup     
			ldi      12
			eq?     
			bnt      code_0807
			pushi    #setScript
			pushi    1
			lofsa    egad
			push    
			lofsa    sheriffsHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    tWalk2
			push    
			lofsa    tuckie
			send     6
			pushi    #setScript
			pushi    2
			lofsa    jWalk2
			push    
			pushSelf
			lofsa    lilj
			send     8
			jmp      code_08f1
code_0807:
			dup     
			ldi      13
			eq?     
			bnt      code_083b
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    sheriffsHead
			send     18
			pushi    7
			pushi    2
			lea      @local107
			push    
			pushi    15
			pushi    1
			pushi    12
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_08f1
code_083b:
			dup     
			ldi      14
			eq?     
			bnt      code_0845
			jmp      code_08f1
code_0845:
			dup     
			ldi      15
			eq?     
			bnt      code_086d
			pushi    #setCycle
			pushi    3
			class    FuzzyStop
			push    
			lea      @local8
			push    
			pushSelf
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    82
			pushi    111
			lofsa    lilj
			send     20
			jmp      code_08f1
code_086d:
			dup     
			ldi      16
			eq?     
			bnt      code_0891
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    5
			pushi    1
			lea      @local60
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_08f1
code_0891:
			dup     
			ldi      17
			eq?     
			bnt      code_08ad
			pushi    #cel
			pushi    1
			pushi    6
			pushi    285
			pushi    0
			lofsa    lilj
			send     10
			ldi      6
			aTop     ticks
			jmp      code_08f1
code_08ad:
			dup     
			ldi      18
			eq?     
			bnt      code_08da
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    9
			pushi    3
			lea      @local112
			push    
			pushi    12
			pushi    2
			pushi    999
			pushi    3
			pushi    15
			pushi    0
			pushSelf
			calle    proc851_0,  18
			jmp      code_08f1
code_08da:
			dup     
			ldi      19
			eq?     
			bnt      code_08f1
			pushi    #newRoom
			pushi    1
			pushi    150
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_08f1:
			toss    
			ret     
		)
	)
)

(instance youFool2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0966
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local0
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    141
			pushi    131
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    sheriffRides
			send     32
			jmp      code_0999
code_0966:
			dup     
			ldi      1
			eq?     
			bnt      code_098d
			pushi    #init
			pushi    0
			lofsa    sheriffsHead
			send     4
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    sheriffRides
			send     16
			ldi      6
			aTop     ticks
			jmp      code_0999
code_098d:
			dup     
			ldi      2
			eq?     
			bnt      code_0999
			pushi    #dispose
			pushi    0
			self     4
code_0999:
			toss    
			ret     
		)
	)
)

(instance theCharade of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09f9
			pushi    7
			pushi    2
			lea      @local37
			push    
			pushi    6
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0b65
code_09f9:
			dup     
			ldi      1
			eq?     
			bnt      code_0a14
			pushi    5
			pushi    1
			lea      @local44
			push    
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0b65
code_0a14:
			dup     
			ldi      2
			eq?     
			bnt      code_0a2f
			pushi    #setScript
			pushi    1
			lofsa    egad
			push    
			lofsa    sheriffsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0b65
code_0a2f:
			dup     
			ldi      3
			eq?     
			bnt      code_0a4a
			pushi    5
			pushi    1
			lea      @local49
			push    
			pushi    6
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0b65
code_0a4a:
			dup     
			ldi      4
			eq?     
			bnt      code_0a70
			pushi    #setScript
			pushi    2
			lofsa    tWalk2
			push    
			pushSelf
			lofsa    tuckie
			send     8
			pushi    #setScript
			pushi    2
			lofsa    jWalk2
			push    
			pushSelf
			lofsa    lilj
			send     8
			jmp      code_0b65
code_0a70:
			dup     
			ldi      5
			eq?     
			bnt      code_0a7a
			jmp      code_0b65
code_0a7a:
			dup     
			ldi      6
			eq?     
			bnt      code_0a88
			ldi      12
			aTop     ticks
			jmp      code_0b65
code_0a88:
			dup     
			ldi      7
			eq?     
			bnt      code_0ac7
			pushi    #stopUpd
			pushi    0
			lofsa    tuckie
			send     4
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    sheriffsHead
			send     6
			pushi    9
			pushi    3
			lea      @local54
			push    
			pushi    6
			pushi    1
			pushi    15
			pushi    3
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0b65
code_0ac7:
			dup     
			ldi      8
			eq?     
			bnt      code_0aef
			pushi    #setCycle
			pushi    3
			class    FuzzyStop
			push    
			lea      @local8
			push    
			pushSelf
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    82
			pushi    111
			lofsa    lilj
			send     20
			jmp      code_0b65
code_0aef:
			dup     
			ldi      9
			eq?     
			bnt      code_0b13
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    5
			pushi    1
			lea      @local60
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0b65
code_0b13:
			dup     
			ldi      10
			eq?     
			bnt      code_0b2f
			pushi    #cel
			pushi    1
			pushi    6
			pushi    285
			pushi    0
			lofsa    lilj
			send     10
			ldi      6
			aTop     ticks
			jmp      code_0b65
code_0b2f:
			dup     
			ldi      11
			eq?     
			bnt      code_0b4e
			pushi    7
			pushi    2
			lea      @local64
			push    
			pushi    6
			pushi    3
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0b65
code_0b4e:
			dup     
			ldi      12
			eq?     
			bnt      code_0b65
			pushi    #newRoom
			pushi    1
			pushi    150
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0b65:
			toss    
			ret     
		)
	)
)

(instance egad of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bbe
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_0c8d
code_0bbe:
			dup     
			ldi      1
			eq?     
			bnt      code_0bd9
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    sheriffsHead
			send     12
			jmp      code_0c8d
code_0bd9:
			dup     
			ldi      2
			eq?     
			bnt      code_0bf0
			pushi    10
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0c8d
code_0bf0:
			dup     
			ldi      3
			eq?     
			bnt      code_0c07
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_0c8d
code_0c07:
			dup     
			ldi      4
			eq?     
			bnt      code_0c1e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_0c8d
code_0c1e:
			dup     
			ldi      5
			eq?     
			bnt      code_0c35
			pushi    10
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0c8d
code_0c35:
			dup     
			ldi      6
			eq?     
			bnt      code_0c4c
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_0c8d
code_0c4c:
			dup     
			ldi      7
			eq?     
			bnt      code_0c63
			pushi    10
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0c8d
code_0c63:
			dup     
			ldi      8
			eq?     
			bnt      code_0c7e
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    sheriffsHead
			send     12
			jmp      code_0c8d
code_0c7e:
			dup     
			ldi      9
			eq?     
			bnt      code_0c8d
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_0c8d:
			toss    
			ret     
		)
	)
)

(instance jWalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d02
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local8
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    177
			pushi    189
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    lilj
			send     32
			jmp      code_0d17
code_0d02:
			dup     
			ldi      1
			eq?     
			bnt      code_0d17
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d17:
			toss    
			ret     
		)
	)
)

(instance tWalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d8c
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local12
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    192
			pushi    144
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    tuckie
			send     32
			jmp      code_0da1
code_0d8c:
			dup     
			ldi      1
			eq?     
			bnt      code_0da1
			pushi    #stopUpd
			pushi    0
			lofsa    tuckie
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0da1:
			toss    
			ret     
		)
	)
)

(instance jWalk2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e14
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local8
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    77
			pushi    111
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    lilj
			send     32
			jmp      code_0e29
code_0e14:
			dup     
			ldi      1
			eq?     
			bnt      code_0e29
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e29:
			toss    
			ret     
		)
	)
)

(instance tWalk2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e9e
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local12
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    159
			pushi    158
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    tuckie
			send     32
			jmp      code_0eb3
code_0e9e:
			dup     
			ldi      1
			eq?     
			bnt      code_0eb3
			pushi    #stopUpd
			pushi    0
			lofsa    tuckie
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0eb3:
			toss    
			ret     
		)
	)
)

(instance xRated of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f4e
			pushi    #view
			pushi    1
			pushi    6
			dup     
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    50
			pushi    3
			pushi    1
			pushi    145
			pushi    219
			pushi    1
			pushi    6
			pushi    56
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			lag      global0
			send     40
			pushi    #view
			pushi    1
			pushi    173
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    110
			pushi    3
			pushi    1
			pushi    130
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    sheriffRides
			send     38
			ldi      12
			aTop     ticks
			jmp      code_102b
code_0f4e:
			dup     
			ldi      1
			eq?     
			bnt      code_0f6e
			pushi    7
			pushi    2
			lea      @local72
			push    
			lea      @local24
			push    
			pushi    2
			pushi    1
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_102b
code_0f6e:
			dup     
			ldi      2
			eq?     
			bnt      code_0f85
			pushi    #setScript
			pushi    2
			lofsa    veryFunny
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_102b
code_0f85:
			dup     
			ldi      3
			eq?     
			bnt      code_0fa2
			pushi    5
			pushi    1
			lea      @local77
			push    
			lea      @local24
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_102b
code_0fa2:
			dup     
			ldi      4
			eq?     
			bnt      code_0fc2
			pushi    7
			pushi    2
			lea      @local81
			push    
			lea      @local24
			push    
			pushi    2
			pushi    1
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_102b
code_0fc2:
			dup     
			ldi      5
			eq?     
			bnt      code_0fdc
			pushi    #setScript
			pushi    1
			lofsa    veryFunny
			push    
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_102b
code_0fdc:
			dup     
			ldi      6
			eq?     
			bnt      code_1006
			pushi    #setCycle
			pushi    3
			class    FuzzyStop
			push    
			lea      @local0
			push    
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    325
			pushi    75
			pushSelf
			lofsa    sheriffRides
			send     22
			jmp      code_102b
code_1006:
			dup     
			ldi      7
			eq?     
			bnt      code_102b
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_102b:
			toss    
			ret     
		)
	)
)

(instance veryFunny of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_108e
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lag      global0
			send     6
			pushi    #play
			pushi    0
			lofsa    laughSound
			send     4
			ldi      120
			aTop     ticks
			jmp      code_110e
code_108e:
			dup     
			ldi      1
			eq?     
			bnt      code_10b7
			pushi    #setCycle
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #stop
			pushi    0
			lofsa    laughSound
			send     4
			pushi    10
			pushi    2
			pushi    3
			pushi    8
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_110e
code_10b7:
			dup     
			ldi      2
			eq?     
			bnt      code_10dd
			pushi    #loop
			pushi    1
			pushi    7
			pushi    150
			pushi    1
			class    Fwd
			push    
			lag      global0
			send     12
			pushi    #play
			pushi    0
			lofsa    laughSound
			send     4
			ldi      120
			aTop     ticks
			jmp      code_110e
code_10dd:
			dup     
			ldi      3
			eq?     
			bnt      code_1102
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    6
			lag      global0
			send     12
			pushi    #stop
			pushi    0
			lofsa    laughSound
			send     4
			ldi      30
			aTop     ticks
			jmp      code_110e
code_1102:
			dup     
			ldi      4
			eq?     
			bnt      code_110e
			pushi    #dispose
			pushi    0
			self     4
code_110e:
			toss    
			ret     
		)
	)
)

(instance laughSound of Sound
	(properties
		number 394
	)
)
