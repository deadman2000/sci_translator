;;; Sierra Script 1.0 - (do not remove this comment)
(script# 245)
(include sci.sh)
(use n000)
(use n851)
(use n852)
(use n890)
(use n891)
(use n892)
(use n958)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	robbedTwo 0
)

(local
	[local0 8] = [2 3 1]
	[local8 4] = [6 6 1 1]
	[local12 4] = [5 2 4 4]
	[local16 8] = [74 151 72 151 72 153 74 153]
	[local24 9] = [-1 2588 17]
	[local33 7] = [1240 18 1 2 1 1]
	[local40 5] = [1240 22 2 2]
	[local45 5] = [1240 24 1 1]
	[local50 6] = [1240 26 1 2 3]
	[local56 4] = [1240 29 1]
	[local60 8] = [1240 30 2 1 1 2 1]
	[local68 5] = [1240 35 1 2]
	[local73 8] = [1240 37 1 1 2 1 2]
)
(instance robbedTwo of Rm
	(properties
		picture 240
		style $0008
	)
	
	(method (init)
		(asm
			pushi    6
			pushi    128
			pushi    173
			pushi    33
			pushi    34
			pushi    151
			pushi    154
			calle    proc958_0,  12
			pushi    4
			pushi    130
			pushi    890
			pushi    892
			pushi    891
			calle    proc958_0,  8
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    1
			pushi    102
			callb    proc0_5,  2
			not     
			bnt      code_008c
			pushi    107
			pushi    #species
			pushi    4
			pushi    1
			pushi    319
			pushi    3
			pushi    1
			pushi    103
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      16384
			or      
			push    
			lag      global0
			send     22
			pushi    3
			pushi    5
			pushi    33
			pushi    34
			callb    proc0_2,  6
			pushi    #setScript
			pushi    1
			lofsa    theTrap
			push    
			self     6
			jmp      code_0096
code_008c:
			pushi    #setScript
			pushi    1
			lofsa    xRated
			push    
			self     6
code_0096:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    1
			pushi    102
			callb    proc0_6,  2
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
		x 138
		y 64
		view 173
		loop 3
		priority 15
		signal $0010
	)
)

(instance lilj of Actor
	(properties
		x -10
		y 111
		view 151
		signal $4000
	)
)

(instance tuckie of Actor
	(properties
		x 179
		y 220
		view 154
		loop 3
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
			bnt      code_030c
			pushi    #setScript
			pushi    1
			lofsa    trapHim
			push    
			lag      global0
			send     6
			ldi      840
			aTop     ticks
			jmp      code_0333
code_030c:
			dup     
			ldi      1
			eq?     
			bnt      code_0327
			pushi    #setScript
			pushi    1
			lofsa    youFool
			push    
			lofsa    sheriffRides
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0333
code_0327:
			dup     
			ldi      2
			eq?     
			bnt      code_0333
			pushi    #dispose
			pushi    0
			self     4
code_0333:
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
			bnt      code_03a4
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    SyncStop
			push    
			pushi    34
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
			send     32
			jmp      code_0400
code_03a4:
			dup     
			ldi      1
			eq?     
			bnt      code_03cb
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
			jmp      code_0400
code_03cb:
			dup     
			ldi      2
			eq?     
			bnt      code_03e2
			pushi    #loop
			pushi    1
			pushi    6
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0400
code_03e2:
			dup     
			ldi      3
			eq?     
			bnt      code_0400
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lag      global0
			send     16
			pushi    #dispose
			pushi    0
			self     4
code_0400:
			toss    
			ret     
		)
	)
)

(instance youFool of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0473
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
			pushi    135
			pushi    125
			pushi    0
			pushi    9
			dup     
			pushi    8
			lofsa    sheriffRides
			send     32
			jmp      code_0605
code_0473:
			dup     
			ldi      1
			eq?     
			bnt      code_049a
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
			jmp      code_0605
code_049a:
			dup     
			ldi      2
			eq?     
			bnt      code_04b8
			pushi    7
			pushi    2
			lea      @local33
			push    
			pushi    6
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0605
code_04b8:
			dup     
			ldi      3
			eq?     
			bnt      code_04d3
			pushi    5
			pushi    1
			lea      @local40
			push    
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0605
code_04d3:
			dup     
			ldi      4
			eq?     
			bnt      code_04ee
			pushi    #setScript
			pushi    1
			lofsa    egad
			push    
			lofsa    sheriffsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0605
code_04ee:
			dup     
			ldi      5
			eq?     
			bnt      code_0509
			pushi    5
			pushi    1
			lea      @local45
			push    
			pushi    6
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0605
code_0509:
			dup     
			ldi      6
			eq?     
			bnt      code_052f
			pushi    #setScript
			pushi    2
			lofsa    tWalk
			push    
			pushSelf
			lofsa    tuckie
			send     8
			pushi    #setScript
			pushi    2
			lofsa    jWalk
			push    
			pushSelf
			lofsa    lilj
			send     8
			jmp      code_0605
code_052f:
			dup     
			ldi      7
			eq?     
			bnt      code_0539
			jmp      code_0605
code_0539:
			dup     
			ldi      8
			eq?     
			bnt      code_0547
			ldi      12
			aTop     ticks
			jmp      code_0605
code_0547:
			dup     
			ldi      9
			eq?     
			bnt      code_0574
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    sheriffsHead
			send     6
			pushi    9
			pushi    3
			lea      @local50
			push    
			pushi    6
			pushi    1
			pushi    15
			pushi    3
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0605
code_0574:
			dup     
			ldi      10
			eq?     
			bnt      code_059c
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
			jmp      code_0605
code_059c:
			dup     
			ldi      11
			eq?     
			bnt      code_05b7
			pushi    5
			pushi    1
			lea      @local56
			push    
			pushi    13
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0605
code_05b7:
			dup     
			ldi      12
			eq?     
			bnt      code_05cf
			pushi    #cel
			pushi    1
			pushi    6
			lofsa    lilj
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0605
code_05cf:
			dup     
			ldi      13
			eq?     
			bnt      code_05ee
			pushi    7
			pushi    2
			lea      @local60
			push    
			pushi    6
			pushi    3
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0605
code_05ee:
			dup     
			ldi      14
			eq?     
			bnt      code_0605
			pushi    #newRoom
			pushi    1
			pushi    150
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0605:
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
			bnt      code_065e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_072c
code_065e:
			dup     
			ldi      1
			eq?     
			bnt      code_0678
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    sheriffsHead
			send     12
			jmp      code_072c
code_0678:
			dup     
			ldi      2
			eq?     
			bnt      code_068f
			pushi    10
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_072c
code_068f:
			dup     
			ldi      3
			eq?     
			bnt      code_06a6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_072c
code_06a6:
			dup     
			ldi      4
			eq?     
			bnt      code_06bd
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_072c
code_06bd:
			dup     
			ldi      5
			eq?     
			bnt      code_06d4
			pushi    10
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_072c
code_06d4:
			dup     
			ldi      6
			eq?     
			bnt      code_06eb
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheriffsHead
			send     8
			jmp      code_072c
code_06eb:
			dup     
			ldi      7
			eq?     
			bnt      code_0702
			pushi    10
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_072c
code_0702:
			dup     
			ldi      8
			eq?     
			bnt      code_071d
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    sheriffsHead
			send     12
			jmp      code_072c
code_071d:
			dup     
			ldi      9
			eq?     
			bnt      code_072c
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_072c:
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
			bnt      code_079e
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
			jmp      code_07b3
code_079e:
			dup     
			ldi      1
			eq?     
			bnt      code_07b3
			pushi    #stopUpd
			pushi    0
			lofsa    lilj
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_07b3:
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
			bnt      code_0828
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
			jmp      code_083d
code_0828:
			dup     
			ldi      1
			eq?     
			bnt      code_083d
			pushi    #stopUpd
			pushi    0
			lofsa    tuckie
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_083d:
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
			bnt      code_08c9
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
			pushi    107
			pushi    0
			lag      global0
			send     28
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
			lofsa    sheriffRides
			send     34
			ldi      12
			aTop     ticks
			jmp      code_09e0
code_08c9:
			dup     
			ldi      1
			eq?     
			bnt      code_08e9
			pushi    7
			pushi    2
			lea      @local68
			push    
			lea      @local24
			push    
			pushi    2
			pushi    1
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_09e0
code_08e9:
			dup     
			ldi      2
			eq?     
			bnt      code_0903
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lag      global0
			send     6
			ldi      300
			aTop     ticks
			jmp      code_09e0
code_0903:
			dup     
			ldi      3
			eq?     
			bnt      code_091b
			pushi    #loop
			pushi    1
			pushi    7
			lag      global0
			send     6
			ldi      300
			aTop     ticks
			jmp      code_09e0
code_091b:
			dup     
			ldi      4
			eq?     
			bnt      code_0937
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    6
			lag      global0
			send     12
			ldi      6
			aTop     ticks
			jmp      code_09e0
code_0937:
			dup     
			ldi      5
			eq?     
			bnt      code_0957
			pushi    7
			pushi    2
			lea      @local73
			push    
			lea      @local24
			push    
			pushi    2
			pushi    1
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_09e0
code_0957:
			dup     
			ldi      6
			eq?     
			bnt      code_0971
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lag      global0
			send     6
			ldi      300
			aTop     ticks
			jmp      code_09e0
code_0971:
			dup     
			ldi      7
			eq?     
			bnt      code_0989
			pushi    #loop
			pushi    1
			pushi    7
			lag      global0
			send     6
			ldi      300
			aTop     ticks
			jmp      code_09e0
code_0989:
			dup     
			ldi      8
			eq?     
			bnt      code_09a5
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    6
			lag      global0
			send     12
			ldi      6
			aTop     ticks
			jmp      code_09e0
code_09a5:
			dup     
			ldi      9
			eq?     
			bnt      code_09c9
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    325
			pushi    75
			pushSelf
			lofsa    sheriffRides
			send     18
			jmp      code_09e0
code_09c9:
			dup     
			ldi      10
			eq?     
			bnt      code_09e0
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_09e0:
			toss    
			ret     
		)
	)
)
