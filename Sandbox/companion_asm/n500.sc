;;; Sierra Script 1.0 - (do not remove this comment)
(script# 500)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n945)
(use n946)
(use n950)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm500 0
)

(local
	local0
	local1
)
(instance rm500 of Rm
	(properties
		picture 500
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    95
			pushi    121
			pushi    139
			pushi    121
			pushi    182
			pushi    138
			pushi    149
			pushi    165
			pushi    86
			pushi    165
			pushi    56
			pushi    135
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    108
			pushi    14
			pushi    104
			pushi    0
			pushi    114
			dup     
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    319
			pushi    189
			pushi    242
			pushi    189
			pushi    262
			pushi    167
			pushi    319
			pushi    167
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     10
			pushi    #add
			pushi    10
			lofsa    pyre
			push    
			lofsa    hedge
			push    
			lofsa    ring1
			push    
			lofsa    ring2
			push    
			lofsa    ring3
			push    
			lofsa    stand
			push    
			lofsa    awning
			push    
			lofsa    secretDoor
			push    
			lofsa    walls
			push    
			lofsa    floor
			push    
			pushi    116
			pushi    1
			pushi    107
			lag      global32
			send     30
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #approachVerbs
			pushi    1
			pushi    3
			lofsa    ring1
			send     6
			pushi    #approachVerbs
			pushi    1
			pushi    3
			lofsa    ring3
			send     6
			pushi    #number
			pushi    1
			pushi    500
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #setScript
			pushi    1
			lofsa    enterRoom
			push    
			lag      global0
			send     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_013f
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_013f
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			pushi    #setScript
			pushi    1
			lofsa    outAndInAgain
			push    
			lag      global0
			send     6
code_013f:
			ret     
		)
	)
)

(instance secretDoor of Prop
	(properties
		x 148
		y 101
		view 501
		loop 10
		priority 6
		signal $4010
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    187
			pushi    36
			pushi    185
			pushi    101
			pushi    148
			pushi    100
			pushi    150
			pushi    36
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_01d0
			pushi    2
			pushi    1500
			pushi    1
			calle    proc13_4,  4
			jmp      code_01f1
code_01d0:
			dup     
			ldi      3
			eq?     
			bnt      code_01e6
			pushi    #setScript
			pushi    1
			lofsa    openDoor
			push    
			lag      global0
			send     6
			jmp      code_01f1
code_01e6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_01f1:
			toss    
			ret     
		)
	)
)

(instance pyre of Feature
	(properties
		y 157
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    26
			pushi    113
			pushi    53
			pushi    118
			pushi    53
			pushi    119
			pushi    54
			pushi    119
			pushi    110
			pushi    149
			pushi    111
			pushi    173
			pushi    127
			pushi    174
			pushi    137
			pushi    147
			pushi    157
			pushi    92
			pushi    157
			pushi    64
			pushi    137
			pushi    65
			pushi    124
			pushi    94
			pushi    109
			pushi    112
			pushi    110
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     66
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_02f3
			pushi    1
			pushi    128
			callb    proc0_5,  2
			not     
			bnt      code_02e7
			pushi    2
			pushi    1500
			pushi    18
			calle    proc13_4,  4
			pushi    1
			pushi    128
			callb    proc0_6,  2
			jmp      code_0326
code_02e7:
			pushi    2
			pushi    1500
			pushi    0
			calle    proc13_4,  4
			jmp      code_0326
code_02f3:
			dup     
			ldi      3
			eq?     
			bnt      code_0307
			pushi    2
			pushi    1500
			pushi    8
			calle    proc13_4,  4
			jmp      code_0326
code_0307:
			dup     
			ldi      4
			eq?     
			bnt      code_031b
			pushi    2
			pushi    1500
			pushi    12
			calle    proc13_4,  4
			jmp      code_0326
code_031b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0326:
			toss    
			ret     
		)
	)
)

(instance hedge of Feature
	(properties
		y 15
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    42
			pushi    1
			pushi    16
			pushi    14
			pushi    7
			pushi    24
			pushi    8
			pushi    38
			pushi    4
			pushi    46
			pushi    7
			pushi    57
			pushi    5
			pushi    63
			pushi    8
			pushi    72
			pushi    7
			pushi    76
			pushi    6
			pushi    89
			pushi    7
			pushi    99
			pushi    5
			pushi    106
			pushi    5
			pushi    145
			pushi    5
			pushi    169
			pushi    6
			pushi    173
			pushi    4
			pushi    193
			pushi    5
			pushi    205
			pushi    7
			pushi    214
			pushi    5
			pushi    223
			pushi    6
			pushi    318
			pushi    7
			pushi    319
			pushi    14
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     98
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_03ff
			pushi    2
			pushi    1500
			pushi    3
			calle    proc13_4,  4
			jmp      code_040a
code_03ff:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_040a:
			toss    
			ret     
		)
	)
)

(instance awning of Feature
	(properties
		y 118
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    319
			pushi    118
			pushi    239
			pushi    117
			pushi    238
			pushi    94
			pushi    290
			pushi    64
			pushi    319
			pushi    35
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04a0
			pushi    2
			pushi    1500
			pushi    6
			calle    proc13_4,  4
			jmp      code_04ab
code_04a0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_04ab:
			toss    
			ret     
		)
	)
)

(instance stand of Feature
	(properties
		y 189
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    292
			pushi    118
			pushi    315
			pushi    152
			pushi    319
			pushi    152
			pushi    319
			pushi    189
			pushi    216
			pushi    189
			pushi    255
			pushi    149
			pushi    306
			pushi    152
			pushi    283
			pushi    119
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0557
			pushi    2
			pushi    1500
			pushi    5
			calle    proc13_4,  4
			jmp      code_059f
code_0557:
			dup     
			ldi      3
			eq?     
			bnt      code_056b
			pushi    2
			pushi    1500
			pushi    10
			calle    proc13_4,  4
			jmp      code_059f
code_056b:
			dup     
			ldi      4
			eq?     
			bnt      code_0594
			lsp      param2
			ldi      13
			eq?     
			bnt      code_0587
			pushi    2
			pushi    1500
			pushi    14
			calle    proc13_4,  4
			jmp      code_059f
code_0587:
			pushi    2
			pushi    1500
			pushi    13
			calle    proc13_4,  4
			jmp      code_059f
code_0594:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_059f:
			toss    
			ret     
		)
	)
)

(instance ring1 of Feature
	(properties
		y 64
		approachX 89
		approachY 102
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    84
			pushi    53
			pushi    94
			pushi    53
			pushi    94
			pushi    65
			pushi    84
			pushi    65
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_062d
			pushi    2
			pushi    1500
			pushi    7
			calle    proc13_4,  4
			jmp      code_064c
code_062d:
			dup     
			ldi      3
			eq?     
			bnt      code_0641
			pushi    2
			pushi    1500
			pushi    11
			calle    proc13_4,  4
			jmp      code_064c
code_0641:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_064c:
			toss    
			ret     
		)
	)
)

(instance ring2 of Feature
	(properties
		y 64
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    164
			pushi    52
			pushi    176
			pushi    52
			pushi    176
			pushi    65
			pushi    164
			pushi    65
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06dd
			pushi    2
			pushi    1500
			pushi    7
			calle    proc13_4,  4
			jmp      code_06fe
code_06dd:
			dup     
			ldi      3
			eq?     
			bnt      code_06f3
			pushi    #setScript
			pushi    1
			lofsa    openDoor
			push    
			lag      global0
			send     6
			jmp      code_06fe
code_06f3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_06fe:
			toss    
			ret     
		)
	)
)

(instance ring3 of Feature
	(properties
		y 64
		approachX 250
		approachY 107
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    245
			pushi    53
			pushi    257
			pushi    53
			pushi    257
			pushi    67
			pushi    245
			pushi    67
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_078f
			pushi    2
			pushi    1500
			pushi    7
			calle    proc13_4,  4
			jmp      code_07ae
code_078f:
			dup     
			ldi      3
			eq?     
			bnt      code_07a3
			pushi    2
			pushi    1500
			pushi    11
			calle    proc13_4,  4
			jmp      code_07ae
code_07a3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_07ae:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    0
			pushi    19
			pushi    7
			pushi    16
			pushi    319
			pushi    14
			pushi    319
			pushi    33
			pushi    319
			pushi    105
			pushi    10
			pushi    97
			pushi    0
			pushi    101
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0847
			pushi    2
			pushi    1500
			pushi    2
			calle    proc13_4,  4
			jmp      code_0866
code_0847:
			dup     
			ldi      3
			eq?     
			bnt      code_085b
			pushi    2
			pushi    1500
			pushi    9
			calle    proc13_4,  4
			jmp      code_0866
code_085b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0866:
			toss    
			ret     
		)
	)
)

(instance floor of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    0
			pushi    102
			pushi    10
			pushi    97
			pushi    319
			pushi    105
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_08f9
			pushi    2
			pushi    1500
			pushi    4
			calle    proc13_4,  4
			jmp      code_0904
code_08f9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0904:
			toss    
			ret     
		)
	)
)

(instance enterRoom of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0996
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    501
			pushi    4
			pushi    1
			pushi    169
			pushi    3
			pushi    1
			pushi    99
			pushi    107
			pushi    0
			pushi    162
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     34
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    secretDoor
			send     8
			ldi      5
			sag      global126
			jmp      code_0a0b
code_0996:
			dup     
			ldi      1
			eq?     
			bnt      code_09bf
			pushi    0
			callb    proc0_2,  0
			pushi    #setCycle
			pushi    2
			class    StopWalk
			push    
			pushi    24
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    170
			pushi    116
			pushSelf
			lag      global0
			send     20
			jmp      code_0a0b
code_09bf:
			dup     
			ldi      2
			eq?     
			bnt      code_09d6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    secretDoor
			send     8
			jmp      code_0a0b
code_09d6:
			dup     
			ldi      3
			eq?     
			bnt      code_0a0b
			pushi    1
			pushi    139
			callb    proc0_5,  2
			not     
			bnt      code_0a02
			pushi    2
			pushi    1500
			pushi    15
			calle    proc13_4,  4
			pushi    1
			pushi    139
			callb    proc0_6,  2
			pushi    1
			pushi    100
			calle    proc806_1,  2
code_0a02:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0a0b:
			toss    
			ret     
		)
	)
)

(instance outAndInAgain of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0acd
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sal      local0
			sat      temp0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sal      local1
			sat      temp1
			lsg      global108
			dup     
			ldi      3
			eq?     
			bnt      code_0a82
			ldi      240
			sat      temp1
			ldi      180
			sal      local1
			jmp      code_0aaf
code_0a82:
			dup     
			ldi      2
			eq?     
			bnt      code_0a9a
			lst      temp0
			ldi      20
			add     
			sat      temp0
			lsl      local0
			ldi      20
			sub     
			sal      local0
			jmp      code_0aaf
code_0a9a:
			dup     
			ldi      4
			eq?     
			bnt      code_0aaf
			lst      temp0
			ldi      20
			sub     
			sat      temp0
			lsl      local0
			ldi      20
			add     
			sal      local0
code_0aaf:
			toss    
			pushi    0
			callb    proc0_3,  0
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     18
			jmp      code_0b33
code_0acd:
			dup     
			ldi      1
			eq?     
			bnt      code_0adb
			ldi      4
			aTop     seconds
			jmp      code_0b33
code_0adb:
			dup     
			ldi      2
			eq?     
			bnt      code_0af6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lsl      local0
			lsl      local1
			pushSelf
			lag      global0
			send     12
			jmp      code_0b33
code_0af6:
			dup     
			ldi      3
			eq?     
			bnt      code_0b23
			lsg      global108
			ldi      2
			eq?     
			bnt      code_0b12
			pushi    2
			pushi    1500
			pushi    17
			calle    proc13_4,  4
			jmp      code_0b1c
code_0b12:
			pushi    2
			pushi    1500
			pushi    16
			calle    proc13_4,  4
code_0b1c:
			ldi      2
			aTop     cycles
			jmp      code_0b33
code_0b23:
			dup     
			ldi      4
			eq?     
			bnt      code_0b33
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0b33:
			toss    
			ret     
		)
	)
)

(instance openDoor of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b95
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    162
			pushi    110
			pushSelf
			lag      global0
			send     12
			jmp      code_0c3a
code_0b95:
			dup     
			ldi      1
			eq?     
			bnt      code_0bb5
			pushi    #view
			pushi    1
			pushi    28
			pushi    6
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    2
			lag      global0
			send     18
			ldi      10
			aTop     cycles
			jmp      code_0c3a
code_0bb5:
			dup     
			ldi      2
			eq?     
			bnt      code_0bd5
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    197
			pushi    108
			pushSelf
			lag      global0
			send     12
			jmp      code_0c3a
code_0bd5:
			dup     
			ldi      3
			eq?     
			bnt      code_0bec
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    secretDoor
			send     8
			jmp      code_0c3a
code_0bec:
			dup     
			ldi      4
			eq?     
			bnt      code_0c08
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    165
			pushi    108
			pushSelf
			lag      global0
			send     12
			jmp      code_0c3a
code_0c08:
			dup     
			ldi      5
			eq?     
			bnt      code_0c24
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    173
			pushi    94
			pushSelf
			lag      global0
			send     12
			jmp      code_0c3a
code_0c24:
			dup     
			ldi      6
			eq?     
			bnt      code_0c3a
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    70
			lag      global2
			send     6
code_0c3a:
			toss    
			ret     
		)
	)
)
