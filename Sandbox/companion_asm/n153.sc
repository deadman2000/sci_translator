;;; Sierra Script 1.0 - (do not remove this comment)
(script# 153)
(include sci.sh)
(use n000)
(use n806)
(use n851)
(use n939)
(use n992)
(use n998)

(public
	day9 0
)

(local
	[local0 5] = [1151 100 1 1]
	[local5 4] = [1151 102 1]
	[local9 8] = [1151 103 1 1 2 3 1]
	[local17 12] = [1151 108 2 3 2 1 1 1 2 3 2]
	[local29 6] = [1151 117 1 2 3]
	[local35 6] = [1151 120 1 2 2]
)
(instance food1 of View
	(properties
		x 223
		y 77
		view 150
		loop 3
		priority 12
		signal $0011
	)
)

(instance food2 of View
	(properties
		x 156
		y 136
		view 150
		loop 3
		cel 1
		priority 15
		signal $0011
	)
)

(instance food3 of View
	(properties
		x -10
		y 153
		view 150
		loop 3
		cel 2
		priority 15
		signal $0011
	)
)

(instance food4 of View
	(properties
		x 80
		y 114
		view 150
		loop 3
		cel 2
		priority 10
		signal $0011
	)
)

(instance outLaw1 of Prop
	(properties
		x 233
		y 108
		view 150
		loop 1
		priority 13
		signal $0010
	)
)

(instance outLaw2 of Prop
	(properties
		x 171
		y 155
		view 150
		loop 2
		cel 2
		priority 15
		signal $0010
	)
)

(instance outLaw3 of Prop
	(properties
		x 184
		y 138
		view 150
		loop 6
	)
)

(instance outLaw4 of Prop
	(properties
		x 8
		y 158
		view 150
		loop 5
		priority 8
	)
)

(instance fire of Prop
	(properties
		x 163
		y 112
		view 150
	)
)

(instance day9 of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    1
			pushi    153
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
			bnt      code_0443
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    122
			callb    proc0_6,  2
			pushi    1
			pushi    181
			callb    proc0_5,  2
			bnt      code_03a6
			pushi    1
			pushi    5000
			calle    proc806_4,  2
code_03a6:
			pushi    1
			pushi    180
			callb    proc0_5,  2
			bnt      code_03ba
			pushi    1
			pushi    700
			calle    proc806_4,  2
code_03ba:
			pushi    3
			pushi    128
			pushi    143
			pushi    150
			callk    Load,  6
			pushi    #init
			pushi    0
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    0
			pushi    1
			lofsa    outLaw1
			send     14
			pushi    #init
			pushi    0
			pushi    150
			pushi    2
			class    Osc
			push    
			pushi    4
			lofsa    outLaw2
			send     12
			pushi    #init
			pushi    0
			pushi    150
			pushi    2
			class    Osc
			push    
			pushi    3
			lofsa    outLaw3
			send     12
			pushi    #init
			pushi    0
			pushi    150
			pushi    2
			class    Osc
			push    
			pushi    4
			lofsa    outLaw4
			send     12
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fire
			send     10
			pushi    #init
			pushi    0
			lofsa    food1
			send     4
			pushi    #init
			pushi    0
			lofsa    food2
			send     4
			pushi    #init
			pushi    0
			lofsa    food3
			send     4
			pushi    #init
			pushi    0
			lofsa    food4
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0685
code_0443:
			dup     
			ldi      1
			eq?     
			bnt      code_045d
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     8
			jmp      code_0685
code_045d:
			dup     
			ldi      2
			eq?     
			bnt      code_0490
			pushi    #view
			pushi    1
			pushi    143
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    262
			pushi    3
			pushi    1
			pushi    119
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    1
			pushSelf
			lag      global0
			send     42
			jmp      code_0685
code_0490:
			dup     
			ldi      3
			eq?     
			bnt      code_04b8
			pushi    2
			pushi    1
			pushi    22
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    5
			pushi    1
			lea      @local0
			push    
			pushi    12
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0685
code_04b8:
			dup     
			ldi      4
			eq?     
			bnt      code_04d2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     8
			jmp      code_0685
code_04d2:
			dup     
			ldi      5
			eq?     
			bnt      code_04ed
			pushi    5
			pushi    1
			lea      @local5
			push    
			pushi    15
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0685
code_04ed:
			dup     
			ldi      6
			eq?     
			bnt      code_0507
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     8
			jmp      code_0685
code_0507:
			dup     
			ldi      7
			eq?     
			bnt      code_0529
			pushi    9
			pushi    3
			lea      @local9
			push    
			pushi    3
			pushi    0
			pushi    13
			pushi    1
			pushi    14
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0685
code_0529:
			dup     
			ldi      8
			eq?     
			bnt      code_0543
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     8
			jmp      code_0685
code_0543:
			dup     
			ldi      9
			eq?     
			bnt      code_055d
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     8
			jmp      code_0685
code_055d:
			dup     
			ldi      10
			eq?     
			bnt      code_057e
			pushi    9
			pushi    3
			lea      @local17
			push    
			pushi    2
			pushi    0
			pushi    12
			pushi    1
			pushi    15
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0685
code_057e:
			dup     
			ldi      11
			eq?     
			bnt      code_05a0
			pushi    9
			pushi    3
			lea      @local29
			push    
			pushi    14
			pushi    0
			pushi    16
			pushi    1
			pushi    12
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0685
code_05a0:
			dup     
			ldi      12
			eq?     
			bnt      code_05ba
			pushi    4
			lea      @local35
			push    
			pushi    1
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_0685
code_05ba:
			dup     
			ldi      13
			eq?     
			bnt      code_0685
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    fire
			send     14
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    outLaw1
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    outLaw2
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    outLaw3
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    outLaw4
			send     8
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    food1
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    food2
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    food3
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    food4
			send     8
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #newRoom
			pushi    1
			pushi    240
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0685:
			toss    
			ret     
		)
	)
)
