;;; Sierra Script 1.0 - (do not remove this comment)
(script# 702)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm702 0
)

(local
	[local0 2]
	local2
	local3
	[local4 20]
	[local24 20] = [93 117 88 96 101 110 125 155 139 157 165 184 161 138 143 142 138 101 94 129]
	[local44 20] = [157 164 181 170 148 189 178 139 156 161 173 189 187 183 189 171 152 183 166 158]
	[local64 20] = [1 1 1 1 1 1 1 0 0 0 0 0 0 0 2 2 2 3 3 3]
	local84
	[local85 6] = [1702 6 1 1 2]
	[local91 5] = [1702 9 1 2]
)
(procedure (localproc_000e)
	(asm
		ldi      0
		sal      local84
code_0012:
		lsl      local84
		ldi      20
		lt?     
		bnt      code_0057
		pushi    #new
		pushi    0
		lofsa    clIvy
		send     4
		push    
		lal      local84
		sali     local4
		pushi    #x
		pushi    1
		lal      local84
		lsli     local24
		pushi    3
		pushi    1
		lsli     local44
		pushi    162
		pushi    1
		lsli     local64
		pushi    288
		pushi    1
		pushi    221
		pushi    66
		pushi    1
		pushi    10
		pushi    17
		pushi    1
		pushi    16401
		pushi    107
		pushi    0
		lali     local4
		send     40
		+al      local84
		jmp      code_0012
code_0057:
		ret     
	)
)

(instance rm702 of Rm
	(properties
		picture 702
		style $000e
	)
	
	(method (init)
		(asm
			pushi    #stop
			pushi    0
			lag      global100
			send     4
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    164
			pushi    17
			pushi    1
			pushi    16384
			pushi    107
			pushi    0
			lag      global0
			send     28
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			lag      global69
			send     8
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			lag      global34
			sal      local3
			ldi      0
			sag      global34
			pushi    3
			lofsa    theWindow
			push    
			lofsa    theIvy
			push    
			lofsa    topTower
			push    
			calle    proc806_3,  6
			pushi    0
			call     localproc_000e,  0
			ldi      1
			sal      local2
			pushi    #setScript
			pushi    1
			lofsa    monksTalk
			push    
			lag      global2
			send     6
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    0
			pushi    189
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    189
			pushi    163
			pushi    189
			pushi    134
			pushi    107
			pushi    102
			pushi    107
			pushi    100
			pushi    172
			pushi    124
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0153
			ldi      0
			jmp      code_01da
code_0153:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      185
			gt?     
			bnt      code_0171
			pushi    #setScript
			pushi    1
			lofsa    S
			push    
			lag      global0
			send     6
			jmp      code_01da
code_0171:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      162
			le?     
			bnt      code_0197
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    #newRoom
			pushi    1
			pushi    705
			lag      global2
			send     6
			jmp      code_01da
code_0197:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      90
			lt?     
			bnt      code_01b4
			pushi    #setScript
			pushi    1
			lofsa    climbGoThere
			push    
			lag      global0
			send     6
			jmp      code_01da
code_01b4:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      170
			gt?     
			bnt      code_01d2
			pushi    #setScript
			pushi    1
			lofsa    climbGoThere
			push    
			lag      global0
			send     6
			jmp      code_01da
code_01d2:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
code_01da:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lag      global34
			sal      local3
			pushi    #enable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #message
			pushi    1
			pushi    3
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0134
			pushi    3
			pushi    1702
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_013f
code_0134:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
code_013f:
			ret     
		)
	)
	
	(method (reflectPosn)
		(asm
			ldi      0
			ret     
		)
	)
)

(instance unusualDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_0270
			pushi    3
			pushi    1702
			pushi    12
			pushi    1
			calle    proc13_4,  6
code_0270:
			ret     
		)
	)
)

(instance topTower of Feature
	(properties
		x 89
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    12
			pushi    41
			pushi    47
			pushi    18
			pushi    89
			pushi    8
			pushi    136
			pushi    10
			pushi    177
			pushi    23
			pushi    197
			pushi    34
			pushi    208
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    91
			pushi    15
			pushi    76
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     54
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_02a8
			pushi    3
			pushi    1702
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_02b3
code_02a8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_02b3:
			ret     
		)
	)
)

(instance theWindow of Feature
	(properties
		x 154
		y 102
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    102
			pushi    154
			pushi    100
			pushi    111
			pushi    116
			pushi    102
			pushi    127
			pushi    103
			pushi    136
			pushi    111
			pushi    138
			pushi    153
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_036f
			pushi    3
			pushi    1702
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_0390
code_036f:
			dup     
			ldi      3
			eq?     
			bnt      code_0385
			pushi    #setScript
			pushi    1
			lofsa    climbInWindow
			push    
			lag      global0
			send     6
			jmp      code_0390
code_0385:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0390:
			toss    
			ret     
		)
	)
)

(instance theIvy of Feature
	(properties
		x 148
		y 153
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    134
			pushi    153
			pushi    148
			pushi    165
			pushi    142
			pushi    188
			pushi    131
			pushi    188
			pushi    129
			pushi    179
			pushi    113
			pushi    170
			pushi    105
			pushi    155
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
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_043d
			pushi    3
			pushi    1702
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_0448
code_043d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0448:
			ret     
		)
	)
)

(instance rightSide of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    140
			pushi    135
			pushi    156
			pushi    117
			pushi    169
			pushi    124
			pushi    160
			pushi    137
			pushi    199
			pushi    189
			pushi    186
			pushi    189
			pushi    153
			pushi    141
			pushi    156
			pushi    131
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
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
)

(instance leftSide of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    96
			pushi    189
			pushi    70
			pushi    171
			pushi    75
			pushi    138
			pushi    99
			pushi    122
			pushi    100
			pushi    135
			pushi    86
			pushi    143
			pushi    82
			pushi    166
			pushi    112
			pushi    188
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
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
)

(instance clIvy of Prop
	(properties
		view 700
		priority 2
		signal $4011
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_063b
			pushi    3
			pushi    1702
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_0646
code_063b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0646:
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #stopUpd
			pushi    0
			self     4
			ret     
		)
	)
)

(instance monk1 of Actor
	(properties
		view 16
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06d8
			pushi    3
			pushi    1702
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_070f
code_06d8:
			dup     
			ldi      3
			eq?     
			bnt      code_06ee
			pushi    3
			pushi    1702
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_070f
code_06ee:
			dup     
			ldi      5
			eq?     
			bnt      code_0704
			pushi    #setScript
			pushi    1
			lofsa    foooolishhhh
			push    
			lag      global0
			send     6
			jmp      code_070f
code_0704:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_070f:
			toss    
			ret     
		)
	)
)

(instance monk2 of Actor
	(properties
		view 16
		loop 5
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_07b0
			pushi    3
			pushi    1702
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_07e7
code_07b0:
			dup     
			ldi      3
			eq?     
			bnt      code_07c6
			pushi    3
			pushi    1702
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_07e7
code_07c6:
			dup     
			ldi      5
			eq?     
			bnt      code_07dc
			pushi    #setScript
			pushi    1
			lofsa    foooolishhhh
			push    
			lag      global0
			send     6
			jmp      code_07e7
code_07dc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_07e7:
			toss    
			ret     
		)
	)
)

(instance climbGoThere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_08f7
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    1702
			pushi    0
			calle    proc13_4,  4
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			le?     
			bnt      code_08bb
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0939
code_08bb:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      165
			ge?     
			bnt      code_08ee
			pushi    283
			pushi    #x
			class    PolyPath
			push    
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
			pushSelf
			lag      global0
			send     12
			jmp      code_0939
code_08ee:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0939
code_08f7:
			dup     
			ldi      1
			eq?     
			bnt      code_091e
			pushi    1
			pushi    40
			callb    proc0_5,  2
			not     
			bnt      code_0917
			pushi    #setScript
			pushi    1
			lofsa    monksTalk
			push    
			lag      global2
			send     6
			jmp      code_0939
code_0917:
			ldi      12
			aTop     ticks
			jmp      code_0939
code_091e:
			dup     
			ldi      2
			eq?     
			bnt      code_0939
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_0939:
			toss    
			ret     
		)
	)
)

(instance monksTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09d4
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    149
			pushi    39
			pushi    18
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    monk1
			send     18
			pushi    #posn
			pushi    2
			pushi    160
			pushi    30
			pushi    107
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			lofsa    monk2
			send     18
			pushi    #signal
			pushi    1
			pushi    16384
			pushi    267
			pushi    1
			lofsa    unusualDoVerb
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    137
			pushi    183
			pushSelf
			lag      global0
			send     24
			jmp      code_0ab4
code_09d4:
			dup     
			ldi      1
			eq?     
			bnt      code_0a17
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    140
			pushi    183
			lag      global0
			send     10
			pushi    1
			pushi    40
			callb    proc0_5,  2
			not     
			bnt      code_0a10
			pushi    1
			pushi    40
			callb    proc0_6,  2
			pushi    4
			lea      @local91
			push    
			pushi    11
			dup     
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ab4
code_0a10:
			ldi      12
			aTop     ticks
			jmp      code_0ab4
code_0a17:
			dup     
			ldi      2
			eq?     
			bnt      code_0a34
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			lag      global69
			send     8
			ldi      66
			aTop     ticks
			jmp      code_0ab4
code_0a34:
			dup     
			ldi      3
			eq?     
			bnt      code_0a50
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    39
			pushSelf
			lofsa    monk1
			send     12
			jmp      code_0ab4
code_0a50:
			dup     
			ldi      4
			eq?     
			bnt      code_0a6c
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    60
			pushi    30
			pushSelf
			lofsa    monk2
			send     12
			jmp      code_0ab4
code_0a6c:
			dup     
			ldi      5
			eq?     
			bnt      code_0a89
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    149
			pushi    39
			pushSelf
			lofsa    monk1
			send     12
			jmp      code_0ab4
code_0a89:
			dup     
			ldi      6
			eq?     
			bnt      code_0aa6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    169
			pushi    30
			pushSelf
			lofsa    monk2
			send     12
			jmp      code_0ab4
code_0aa6:
			dup     
			ldi      7
			eq?     
			bnt      code_0ab4
			pushi    #changeState
			pushi    1
			pushi    2
			self     6
code_0ab4:
			toss    
			ret     
		)
	)
)

(instance climbInWindow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b25
			pushi    0
			callb    proc0_3,  0
			pushi    #message
			pushi    1
			pushi    3
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    155
			pushi    162
			pushSelf
			lag      global0
			send     12
			jmp      code_0b60
code_0b25:
			dup     
			ldi      1
			eq?     
			bnt      code_0b4b
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    12
			pushi    17
			pushi    1
			pushi    16
			lag      global0
			send     24
			ldi      12
			aTop     ticks
			jmp      code_0b60
code_0b4b:
			dup     
			ldi      2
			eq?     
			bnt      code_0b60
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    #dispose
			pushi    0
			self     4
code_0b60:
			toss    
			ret     
		)
	)
)

(instance S of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bd0
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    #x
			class    MoveTo
			push    
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
			ldi      25
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0be2
code_0bd0:
			dup     
			ldi      1
			eq?     
			bnt      code_0be2
			pushi    #newRoom
			pushi    1
			pushi    701
			lag      global2
			send     6
code_0be2:
			toss    
			ret     
		)
	)
)

(instance foooolishhhh of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c42
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local85
			push    
			pushi    3
			pushi    11
			pushSelf
			calle    proc851_0,  8
			jmp      code_0c54
code_0c42:
			dup     
			ldi      1
			eq?     
			bnt      code_0c54
			pushi    #newRoom
			pushi    1
			pushi    710
			lag      global2
			send     6
code_0c54:
			toss    
			ret     
		)
	)
)
