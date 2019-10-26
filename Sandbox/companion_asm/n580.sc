;;; Sierra Script 1.0 - (do not remove this comment)
(script# 580)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n946)
(use n950)
(use n964)
(use n992)
(use n994)
(use n999)

(public
	rm580 0
)

(local
	local0
)
(instance rm580 of Rm
	(properties
		picture 580
		style $0064
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    6
			lofsa    theMon
			push    
			lofsa    theRoad1
			push    
			lofsa    theRoad2
			push    
			lofsa    theRock
			push    
			lofsa    theFen
			push    
			lofsa    theArea
			push    
			calle    proc806_3,  12
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0042
			ldi      67
			jmp      code_0087
code_0042:
			dup     
			ldi      1
			eq?     
			bnt      code_004e
			ldi      69
			jmp      code_0087
code_004e:
			dup     
			ldi      2
			eq?     
			bnt      code_005a
			ldi      74
			jmp      code_0087
code_005a:
			dup     
			ldi      3
			eq?     
			bnt      code_0066
			ldi      74
			jmp      code_0087
code_0066:
			dup     
			ldi      4
			eq?     
			bnt      code_0072
			ldi      68
			jmp      code_0087
code_0072:
			dup     
			ldi      5
			eq?     
			bnt      code_007e
			ldi      50
			jmp      code_0087
code_007e:
			dup     
			ldi      6
			eq?     
			bnt      code_0087
			ldi      48
code_0087:
			toss    
			sal      local0
			pushi    0
			callb    proc0_3,  0
			lsg      global126
			ldi      0
			eq?     
			bnt      code_00d2
			pushi    1
			pushi    1
			pushi    1
			callk    GetTime,  2
			push    
			lag      global129
			sub     
			push    
			callk    Abs,  2
			push    
			ldi      100
			lt?     
			bnt      code_00d2
			pushi    1
			pushi    1
			callk    GetTime,  2
			push    
			lag      global129
			sub     
			push    
			ldi      0
			ne?     
			bnt      code_00d2
			lsg      global129
			ldi      0
			ne?     
			bnt      code_00d2
			pushi    #setScript
			pushi    1
			lofsa    egads
			push    
			lag      global2
			send     6
			jmp      code_00d6
code_00d2:
			ldi      0
			sag      global129
code_00d6:
			lsg      global12
			ldi      590
			eq?     
			bnt      code_011d
			pushi    3
			pushi    2
			lsl      local0
			dup     
			callb    proc0_2,  6
			pushi    #posn
			pushi    2
			pushi    183
			pushi    176
			pushi    54
			pushi    1
			pushi    1
			pushi    55
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    11
			pushi    17
			pushi    1
			pushi    16
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    142
			pushi    1
			lofsa    fromMonastery
			push    
			lag      global0
			send     48
			jmp      code_013a
code_011d:
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #posn
			pushi    2
			pushi    100
			pushi    240
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lofsa    toOverLook
			push    
			lag      global0
			send     18
code_013a:
			pushi    #actions
			pushi    1
			lofsa    egoActions
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
			bnt      code_0155
			jmp      code_0198
code_0155:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0173
			pushi    #setScript
			pushi    1
			lofsa    backToMap
			push    
			lag      global0
			send     6
			jmp      code_0198
code_0173:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			eq?     
			bnt      code_0192
			pushi    #setScript
			pushi    1
			lofsa    goDown
			push    
			lag      global0
			send     6
			jmp      code_0198
code_0192:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_0198:
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
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance theMon of Feature
	(properties
		lookStr 2
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    139
			pushi    85
			pushi    139
			pushi    68
			pushi    160
			pushi    58
			pushi    212
			pushi    60
			pushi    212
			pushi    73
			pushi    193
			pushi    88
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
			ldi      3
			eq?     
			bnt      code_0253
			pushi    #setScript
			pushi    1
			lofsa    goDown
			push    
			lag      global0
			send     6
			jmp      code_025e
code_0253:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_025e:
			toss    
			ret     
		)
	)
)

(instance theFen of Feature
	(properties
		lookStr 3
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    44
			pushi    3
			pushi    69
			pushi    23
			pushi    54
			pushi    44
			pushi    46
			pushi    20
			pushi    39
			pushi    104
			pushi    34
			pushi    61
			pushi    24
			pushi    120
			pushi    21
			pushi    126
			pushi    16
			pushi    259
			pushi    19
			pushi    291
			pushi    29
			pushi    291
			pushi    35
			pushi    258
			pushi    47
			pushi    292
			pushi    81
			pushi    303
			pushi    111
			pushi    259
			pushi    122
			pushi    216
			pushi    123
			pushi    168
			pushi    114
			pushi    142
			pushi    114
			pushi    66
			pushi    110
			pushi    84
			pushi    105
			pushi    52
			pushi    100
			pushi    2
			pushi    82
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     102
			aTop     onMeCheck
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
			ldi      3
			eq?     
			bnt      code_0350
			pushi    #setScript
			pushi    1
			lofsa    goDown
			push    
			lag      global0
			send     6
			jmp      code_035b
code_0350:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_035b:
			toss    
			ret     
		)
	)
)

(instance theArea of Feature
	(properties
		nsBottom 189
		nsRight 319
		lookStr 4
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_03d0
			pushi    #setScript
			pushi    1
			lofsa    goDown
			push    
			lag      global0
			send     6
			jmp      code_03db
code_03d0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_03db:
			toss    
			ret     
		)
	)
)

(instance theRoad1 of Feature
	(properties
		lookStr 5
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    143
			pushi    115
			pushi    149
			pushi    115
			pushi    147
			pushi    119
			pushi    139
			pushi    123
			pushi    140
			pushi    129
			pushi    180
			pushi    152
			pushi    185
			pushi    157
			pushi    174
			pushi    159
			pushi    173
			pushi    154
			pushi    141
			pushi    136
			dup     
			pushi    129
			pushi    136
			pushi    124
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			aTop     onMeCheck
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
			ldi      3
			eq?     
			bnt      code_0498
			pushi    #setScript
			pushi    1
			lofsa    goDown
			push    
			lag      global0
			send     6
			jmp      code_04a3
code_0498:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_04a3:
			toss    
			ret     
		)
	)
)

(instance theRoad2 of Feature
	(properties
		lookStr 5
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    159
			pushi    167
			pushi    164
			pushi    172
			pushi    244
			pushi    182
			pushi    232
			pushi    187
			pushi    234
			pushi    189
			pushi    199
			pushi    189
			pushi    180
			pushi    181
			pushi    159
			pushi    178
			pushi    149
			pushi    178
			pushi    140
			pushi    172
			pushi    152
			pushi    168
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
			ldi      3
			eq?     
			bnt      code_0577
			pushi    #setScript
			pushi    1
			lofsa    goDown
			push    
			lag      global0
			send     6
			jmp      code_0582
code_0577:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0582:
			toss    
			ret     
		)
	)
)

(instance theRock of Feature
	(properties
		lookStr 6
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    28
			pushi    13
			pushi    189
			pushi    13
			pushi    176
			pushi    21
			pushi    165
			pushi    27
			pushi    161
			pushi    91
			pushi    164
			pushi    134
			pushi    179
			pushi    141
			pushi    171
			pushi    164
			pushi    163
			pushi    192
			pushi    155
			pushi    222
			pushi    156
			pushi    253
			pushi    161
			pushi    270
			pushi    162
			pushi    319
			pushi    155
			pushi    319
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			aTop     onMeCheck
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

(instance goDown of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06c6
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    166
			pushi    260
			pushSelf
			lag      global0
			send     12
			jmp      code_0744
code_06c6:
			dup     
			ldi      1
			eq?     
			bnt      code_070a
			pushi    3
			pushi    2
			lsl      local0
			dup     
			callb    proc0_2,  6
			pushi    #setStep
			pushi    2
			pushi    1
			pushi    1
			pushi    283
			pushi    12
			class    DPath
			push    
			pushi    217
			pushi    219
			pushi    212
			pushi    188
			pushi    185
			pushi    177
			pushi    151
			pushi    173
			pushi    149
			pushi    171
			pushSelf
			lag      global0
			send     36
			jmp      code_0744
code_070a:
			dup     
			ldi      2
			eq?     
			bnt      code_0732
			pushi    #setPri
			pushi    1
			pushi    11
			pushi    283
			pushi    6
			class    DPath
			push    
			pushi    152
			pushi    170
			pushi    183
			pushi    176
			pushSelf
			lag      global0
			send     22
			jmp      code_0744
code_0732:
			dup     
			ldi      3
			eq?     
			bnt      code_0744
			pushi    #newRoom
			pushi    1
			pushi    590
			lag      global2
			send     6
code_0744:
			toss    
			ret     
		)
	)
)

(instance toOverLook of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_07a5
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    75
			pushi    188
			pushSelf
			lag      global0
			send     12
			jmp      code_07d1
code_07a5:
			dup     
			ldi      1
			eq?     
			bnt      code_07c1
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    83
			pushi    172
			pushSelf
			lag      global0
			send     12
			jmp      code_07d1
code_07c1:
			dup     
			ldi      2
			eq?     
			bnt      code_07d1
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_07d1:
			toss    
			ret     
		)
	)
)

(instance backToMap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0839
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    240
			pushSelf
			lag      global0
			send     12
			jmp      code_084a
code_0839:
			dup     
			ldi      1
			eq?     
			bnt      code_084a
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
code_084a:
			toss    
			ret     
		)
	)
)

(instance fromMonastery of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_08c1
			pushi    0
			callb    proc0_3,  0
			pushi    #south
			pushi    1
			pushi    0
			lofsa    rm580
			send     6
			pushi    #setPri
			pushi    1
			pushi    11
			pushi    283
			pushi    6
			class    DPath
			push    
			pushi    152
			pushi    170
			pushi    149
			pushi    171
			pushSelf
			lag      global0
			send     22
			jmp      code_0945
code_08c1:
			dup     
			ldi      1
			eq?     
			bnt      code_08f5
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    283
			pushi    10
			class    DPath
			push    
			pushi    151
			pushi    173
			pushi    185
			pushi    177
			pushi    212
			pushi    188
			pushi    230
			pushi    220
			pushSelf
			lag      global0
			send     30
			jmp      code_0945
code_08f5:
			dup     
			ldi      2
			eq?     
			bnt      code_0920
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #posn
			pushi    2
			pushi    166
			pushi    240
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    83
			pushi    172
			pushSelf
			lag      global0
			send     20
			jmp      code_0945
code_0920:
			dup     
			ldi      3
			eq?     
			bnt      code_0935
			pushi    #setHeading
			pushi    2
			pushi    45
			pushSelf
			lag      global0
			send     8
			jmp      code_0945
code_0935:
			dup     
			ldi      4
			eq?     
			bnt      code_0945
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0945:
			toss    
			ret     
		)
	)
)

(instance egads of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09a9
			pushi    #number
			pushi    1
			pushi    583
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    1
			pushi    75
			lag      global168
			send     18
			ldi      60
			aTop     ticks
			jmp      code_09ca
code_09a9:
			dup     
			ldi      1
			eq?     
			bnt      code_09be
			pushi    3
			pushi    1580
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_09ca
code_09be:
			dup     
			ldi      2
			eq?     
			bnt      code_09ca
			pushi    #dispose
			pushi    0
			self     4
code_09ca:
			toss    
			ret     
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_0a6d
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0a6c
			pushi    1
			pushi    1
			pushi    1
			callk    GetTime,  2
			push    
			lag      global129
			sub     
			push    
			callk    Abs,  2
			push    
			ldi      100
			lt?     
			bnt      code_0a52
			pushi    1
			pushi    1
			callk    GetTime,  2
			push    
			lag      global129
			sub     
			push    
			ldi      0
			ne?     
			bnt      code_0a52
			lsg      global129
			ldi      0
			ne?     
			bnt      code_0a52
			pushi    #doit
			pushi    1
			lsp      theVerb
			&rest    param3
			lag      global65
			send     6
			jmp      code_0a6c
code_0a52:
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
code_0a6c:
			toss    
code_0a6d:
			ret     
		)
	)
)
