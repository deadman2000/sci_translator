;;; Sierra Script 1.0 - (do not remove this comment)
(script# 100)
(include sci.sh)
(use n000)
(use n012)
(use n013)
(use n125)
(use n806)
(use n946)
(use n950)
(use n994)

(public
	rm100 0
)

(local
	local0
	local1
	local2
	local3
)
(instance rm100 of Rm
	(properties
		picture 100
	)
	
	(method (init)
		(asm
			lsg      global130
			ldi      1
			eq?     
			bnt      code_003a
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_003a
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_003a
			pushi    1
			pushi    44
			callb    proc0_5,  2
			bnt      code_003a
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			not     
code_003a:
			bt       code_010c
			lsg      global130
			ldi      3
			eq?     
			bnt      code_0054
			pushi    1
			pushi    54
			callb    proc0_5,  2
			bnt      code_0054
			pushi    1
			pushi    82
			callb    proc0_5,  2
code_0054:
			bt       code_010c
			lsg      global130
			ldi      4
			eq?     
			bnt      code_007a
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_007a
			pushi    1
			pushi    47
			callb    proc0_5,  2
			bnt      code_007a
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			not     
code_007a:
			bt       code_010c
			lsg      global130
			ldi      7
			eq?     
			bnt      code_0094
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_0094
			pushi    1
			pushi    35
			callb    proc0_5,  2
code_0094:
			bt       code_010c
			lsg      global130
			ldi      8
			eq?     
			bnt      code_00df
			pushi    1
			pushi    58
			callb    proc0_5,  2
			bnt      code_00df
			pushi    1
			pushi    191
			callb    proc0_5,  2
			bt       code_010c
			pushi    1
			pushi    191
			callb    proc0_5,  2
			not     
			bnt      code_00df
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bt       code_010c
			pushi    1
			pushi    160
			callb    proc0_5,  2
			bt       code_010c
			pushi    1
			pushi    131
			callb    proc0_5,  2
			bt       code_010c
			lsg      global155
			ldi      42
			gt?     
code_00df:
			bt       code_010c
			lsg      global130
			ldi      9
			eq?     
			bnt      code_00fb
			pushi    1
			pushi    145
			callb    proc0_5,  2
			bt       code_010c
			pushi    1
			pushi    146
			callb    proc0_5,  2
code_00fb:
			bt       code_010c
			lsg      global130
			ldi      12
			eq?     
			bnt      code_011a
			pushi    1
			pushi    27
			callb    proc0_5,  2
code_010c:
			bnt      code_011a
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_011a:
			pushi    #init
			pushi    0
			super    Rm,  4
			lag      global34
			sal      local3
			ldi      0
			sag      global34
			lsg      global87
			dup     
			ldi      0
			eq?     
			bnt      code_0136
			ldi      40
			jmp      code_014b
code_0136:
			dup     
			ldi      1
			eq?     
			bnt      code_0142
			ldi      60
			jmp      code_014b
code_0142:
			dup     
			ldi      2
			eq?     
			bnt      code_014b
			ldi      80
code_014b:
			toss    
			sal      local2
			pushi    1
			pushi    4
			callb    proc0_6,  2
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      902
			ne?     
			bt       code_0176
			pushi    #handle
			pushi    0
			lag      global100
			send     4
			not     
			bt       code_0176
			pushi    #vol
			pushi    0
			lag      global100
			send     4
			not     
code_0176:
			bnt      code_018b
			pushi    #number
			pushi    1
			pushi    902
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_018b:
			pushi    #init
			pushi    0
			lofsa    town
			send     4
			pushi    #init
			pushi    0
			lofsa    cottage
			send     4
			pushi    #init
			pushi    0
			lofsa    monks
			send     4
			pushi    #init
			pushi    0
			lofsa    willowGrove
			send     4
			pushi    #init
			pushi    0
			lofsa    camp
			send     4
			pushi    #init
			pushi    0
			lofsa    oakGrove
			send     4
			pushi    1
			pushi    137
			callb    proc0_5,  2
			bnt      code_01cd
			pushi    #init
			pushi    0
			lofsa    overlook
			send     4
code_01cd:
			pushi    12
			lofsa    watlingStGood
			push    
			lofsa    watlingStBad
			push    
			lofsa    banner
			push    
			lofsa    riverTrent
			push    
			lofsa    riverLeene
			push    
			lofsa    forestBad1
			push    
			lofsa    forestBad2
			push    
			lofsa    lion1
			push    
			lofsa    lion2
			push    
			lofsa    emblem1
			push    
			lofsa    emblem2
			push    
			lofsa    forestGood
			push    
			calle    proc806_3,  24
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #message
			pushi    1
			pushi    11
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			+al      local1
			pushi    1
			pushi    70
			callb    proc0_5,  2
			bnt      code_023f
			pushi    1
			pushi    70
			callb    proc0_7,  2
			pushi    2
			pushi    1100
			pushi    18
			calle    proc13_4,  4
			jmp      code_025a
code_023f:
			lsl      local1
			lal      local2
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_025a
			pushi    4
			pushi    6
			pushi    240
			pushi    247
			pushi    65535
			callk    Palette,  8
code_025a:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    4
			callb    proc0_7,  2
			pushi    #enable
			pushi    6
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     16
			lal      local3
			sag      global34
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance town of MapButton
	(properties
		x 146
		y 130
		heading 260
		lookStr 1
		view 100
		loop 5
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_0303
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_0360
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0303:
			bnt      code_0360
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_0360
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0360
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0334
			pushi    1
			pushi    36
			callb    proc0_5,  2
			not     
code_0334:
			bt       code_0346
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0360
			pushi    1
			pushi    38
			callb    proc0_5,  2
			not     
code_0346:
			bnt      code_0360
			pushi    3
			pushi    1100
			pushi    19
			pushi    1
			calle    proc13_4,  6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0369
code_0360:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    MapButton,  6
code_0369:
			ret     
		)
	)
)

(instance cottage of MapButton
	(properties
		x 209
		y 87
		heading 250
		lookStr 2
		view 100
		loop 2
	)
)

(instance monks of MapButton
	(properties
		x 117
		y 182
		heading 580
		lookStr 3
		view 100
		loop 4
	)
)

(instance willowGrove of MapButton
	(properties
		x 192
		y 111
		heading 210
		lookStr 4
		view 100
		loop 3
	)
)

(instance overlook of MapButton
	(properties
		x 196
		y 65
		heading 110
		lookStr 6
		view 100
		loop 6
	)
)

(instance camp of MapButton
	(properties
		x 214
		y 65
		heading 150
		lookStr 5
		view 100
		loop 1
	)
	
	(method (init)
		(asm
			pushi    1
			pushi    137
			callb    proc0_5,  2
			bnt      code_054d
			ldi      218
			aTop     x
code_054d:
			pushi    #init
			pushi    0
			super    MapButton,  4
			ret     
		)
	)
)

(instance oakGrove of MapButton
	(properties
		x 144
		y 74
		heading 180
		lookStr 7
		view 100
	)
)

(instance watlingStGood of Feature
	(properties
		onMeCheck $8000
		lookStr 8
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    60
			pushi    209
			pushi    25
			pushi    209
			pushi    28
			pushi    202
			pushi    31
			pushi    202
			pushi    36
			pushi    194
			pushi    45
			pushi    194
			pushi    58
			pushi    191
			pushi    63
			pushi    186
			pushi    70
			pushi    189
			pushi    73
			pushi    189
			pushi    77
			pushi    186
			pushi    76
			pushi    182
			pushi    91
			pushi    180
			pushi    93
			pushi    176
			pushi    112
			pushi    163
			pushi    110
			pushi    164
			pushi    108
			pushi    167
			pushi    103
			pushi    161
			pushi    95
			pushi    167
			pushi    89
			pushi    161
			pushi    82
			pushi    169
			pushi    78
			pushi    166
			pushi    70
			pushi    173
			pushi    64
			pushi    168
			pushi    58
			pushi    178
			pushi    55
			pushi    179
			pushi    42
			pushi    189
			pushi    36
			pushi    186
			pushi    33
			pushi    193
			pushi    28
			pushi    193
			pushi    22
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     134
			aTop     onMeCheck
			sal      local0
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
			lal      local0
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_08d9
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			ne?     
			bt       code_0711
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bt       code_0711
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
code_0711:
			bnt      code_0720
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
			jmp      code_08d9
code_0720:
			pushi    #section
			pushi    0
			class    Wat
			send     4
			sat      temp0
			ldi      0
			aTop     onMeCheck
			ldi      2
			aTop     onMeCheck
			bnt      code_0750
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0750
			pushi    #section
			pushi    1
			pushi    1
			class    Wat
			send     6
			bnt      code_0750
			ldi      24
			sag      global112
code_0750:
			bt       code_0884
			ldi      4
			aTop     onMeCheck
			bnt      code_0775
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0775
			pushi    #section
			pushi    1
			pushi    2
			class    Wat
			send     6
			bnt      code_0775
			ldi      39
			sag      global112
code_0775:
			bt       code_0884
			ldi      8
			aTop     onMeCheck
			bnt      code_079b
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_079b
			pushi    #section
			pushi    1
			pushi    3
			class    Wat
			send     6
			bnt      code_079b
			ldi      54
			sag      global112
code_079b:
			bt       code_0884
			ldi      16
			aTop     onMeCheck
			bnt      code_07c1
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_07c1
			pushi    #section
			pushi    1
			pushi    4
			class    Wat
			send     6
			bnt      code_07c1
			ldi      70
			sag      global112
code_07c1:
			bt       code_0884
			ldi      32
			aTop     onMeCheck
			bnt      code_07e7
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_07e7
			pushi    #section
			pushi    1
			pushi    5
			class    Wat
			send     6
			bnt      code_07e7
			ldi      86
			sag      global112
code_07e7:
			bt       code_0884
			ldi      64
			aTop     onMeCheck
			bnt      code_080d
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_080d
			pushi    #section
			pushi    1
			pushi    6
			class    Wat
			send     6
			bnt      code_080d
			ldi      101
			sag      global112
code_080d:
			bt       code_0884
			ldi      128
			aTop     onMeCheck
			bnt      code_0834
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0834
			pushi    #section
			pushi    1
			pushi    7
			class    Wat
			send     6
			bnt      code_0834
			ldi      117
			sag      global112
code_0834:
			bt       code_0884
			ldi      256
			aTop     onMeCheck
			bnt      code_085c
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_085c
			pushi    #section
			pushi    1
			pushi    8
			class    Wat
			send     6
			bnt      code_085c
			ldi      133
			sag      global112
code_085c:
			bt       code_0884
			ldi      512
			aTop     onMeCheck
			bnt      code_08d5
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_08d5
			pushi    #section
			pushi    1
			pushi    9
			class    Wat
			send     6
			bnt      code_08d5
			ldi      149
			sag      global112
code_0884:
			bnt      code_08d5
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			lat      temp0
			ge?     
			bnt      code_08a2
			pushi    #enterDir
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_08ac
code_08a2:
			pushi    #enterDir
			pushi    1
			pushi    3
			class    Wat
			send     6
code_08ac:
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_08d9
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #newRoom
			pushi    1
			pushi    120
			lag      global2
			send     6
			jmp      code_08d9
code_08d5:
			lal      local0
			aTop     onMeCheck
code_08d9:
			ret     
		)
	)
)

(instance watlingStBad of Feature
	(properties
		lookStr 9
	)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    160
			pushi    110
			pushi    178
			pushi    113
			pushi    173
			pushi    133
			pushi    184
			pushi    143
			pushi    187
			pushi    158
			pushi    182
			pushi    189
			pushi    165
			pushi    189
			pushi    175
			pushi    151
			pushi    167
			pushi    147
			pushi    167
			pushi    121
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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

(instance riverTrent of Feature
	(properties
		lookStr 13
	)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    38
			pushi    89
			pushi    189
			pushi    91
			pushi    172
			pushi    131
			pushi    135
			pushi    148
			pushi    136
			pushi    183
			pushi    116
			pushi    222
			pushi    109
			pushi    240
			pushi    114
			pushi    240
			pushi    125
			pushi    218
			pushi    117
			pushi    183
			pushi    127
			pushi    165
			pushi    142
			pushi    135
			pushi    148
			pushi    124
			pushi    155
			pushi    133
			pushi    159
			pushi    154
			pushi    189
			pushi    138
			pushi    189
			pushi    119
			pushi    160
			pushi    100
			pushi    178
			pushi    100
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     90
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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

(instance riverLeene of Feature
	(properties
		lookStr 14
	)
	
	(method (init)
		(asm
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    40
			pushi    106
			pushi    26
			pushi    103
			pushi    46
			pushi    113
			pushi    60
			pushi    112
			pushi    75
			pushi    118
			pushi    83
			pushi    112
			pushi    92
			pushi    127
			pushi    112
			pushi    126
			pushi    123
			pushi    158
			pushi    131
			pushi    147
			pushi    136
			pushi    121
			pushi    131
			pushi    114
			pushi    122
			pushi    113
			pushi    110
			pushi    101
			pushi    99
			pushi    101
			pushi    87
			pushi    105
			pushi    82
			pushi    98
			pushi    73
			pushi    99
			pushi    59
			pushi    93
			pushi    45
			pushi    96
			pushi    28
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     94
			aTop     onMeCheck
			push    
			lag      global2
			send     6
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

(instance banner of Feature
	(properties
		nsLeft 80
		nsBottom 29
		nsRight 239
		lookStr 10
	)
)

(instance forestGood of Feature
	(properties
		nsTop 30
		nsLeft 80
		nsBottom 111
		nsRight 239
		lookStr 11
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0c44
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_0c44
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			ne?     
			bt       code_0c0f
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bt       code_0c0f
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
code_0c0f:
			bnt      code_0c1e
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
			jmp      code_0c44
code_0c1e:
			lsg      global12
			ldi      220
			eq?     
			bnt      code_0c35
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
			jmp      code_0c44
code_0c35:
			ldi      73
			sag      global112
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
code_0c44:
			ret     
		)
	)
)

(instance forestBad1 of Feature
	(properties
		nsTop 110
		nsLeft 80
		nsBottom 190
		nsRight 239
		lookStr 12
	)
)

(instance forestBad2 of Feature
	(properties
		nsTop 110
		nsLeft 80
		nsBottom 190
		nsRight 239
		lookStr 12
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    32
			pushi    92
			pushi    39
			pushi    99
			pushi    60
			pushi    97
			pushi    74
			pushi    105
			pushi    83
			pushi    99
			pushi    88
			pushi    101
			dup     
			pushi    112
			pushi    110
			pushi    115
			pushi    133
			pushi    79
			pushi    133
			pushi    80
			pushi    121
			pushi    88
			pushi    110
			pushi    78
			pushi    107
			pushi    79
			pushi    84
			pushi    90
			pushi    84
			pushi    95
			pushi    76
			pushi    89
			pushi    54
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     78
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

(instance emblem1 of Feature
	(properties
		nsTop 124
		nsBottom 189
		nsRight 80
		lookStr 15
	)
)

(instance emblem2 of Feature
	(properties
		nsTop 124
		nsLeft 239
		nsBottom 189
		nsRight 320
		lookStr 16
	)
)

(instance lion1 of Feature
	(properties
		nsTop 19
		nsBottom 124
		nsRight 81
		lookStr 17
	)
)

(instance lion2 of Feature
	(properties
		nsTop 19
		nsLeft 240
		nsBottom 124
		nsRight 319
		lookStr 17
	)
)
