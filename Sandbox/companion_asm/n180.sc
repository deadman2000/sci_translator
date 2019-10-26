;;; Sierra Script 1.0 - (do not remove this comment)
(script# 180)
(include sci.sh)
(use n000)
(use n013)
(use n750)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n981)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm180 0
	oakMan 1
)

(local
	[local0 7] = [1180 40 1 1 1 1]
	[local7 13] = [1180 44 1 2 1 1 2 1 1 1 1 1]
	[local20 5] = [1180 58 1 1]
	[local25 4] = [1180 60 1]
	[local29 4] = [1180 64 1]
	[local33 5] = [1180 65 1 1]
	[local38 5] = [1180 101 1 1]
	[local43 4] = [1180 56 1]
	[local47 7] = [1180 79 2 1 1 1]
	[local54 7] = [1180 83 1 1 1 1]
	[local61 5] = [1180 61 1 1]
	[local66 4] = [1180 30 1]
	[local70 4] = [1180 31 1]
	[local74 4] = [1180 32 1]
	[local78 4] = [1180 33 1]
	[local82 4] = [1180 34 1]
	[local86 4] = [1180 35 1]
	[local90 4] = [1180 36 1]
	[local94 4] = [1180 37 1]
	[local98 4] = [1180 38 1]
	[local102 6] = [1180 68 2 1 1]
	[local108 5] = [1180 71 2 1]
	[local113 4] = [1180 73 1]
	[local117 4] = [1180 67 1]
	[local121 4] = [1180 87 1]
	[local125 4] = [1180 88 1]
	[local129 4] = [1180 92 1]
	[local133 4] = [1180 93 1]
	[local137 4] = [1180 89 1]
	[local141 5] = [1180 90 1 1]
	[local146 10] = [1180 94 2 1 1 1 1 1 1]
	[local156 4] = [1180 105 1]
	[local160 5] = [1180 103 1 1]
	[local165 4] = [1180 108 1]
	[local169 5] = [1180 77 2 1]
	[local174 5] = [1180 109 1 1]
	[local179 4] = [1180 126 1]
	[local183 9] = [186 0 2 4 22 24 19 16 26]
	[local192 9] = [46 0 2 4 17 37 14 22 26]
	[local201 8] = [-1]
	[local209 520]
	local729
	local730
	local731
	local732
	local733
	local734
	local735
	local736
	local737
	local738
	local739
	local740
	local741
	local742
)
(procedure (localproc_0012)
	(asm
		lsl      local730
		dup     
		ldi      0
		eq?     
		bnt      code_0070
		pushi    4
		pushi    3
		pushi    1180
		pushi    2
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    1
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    0
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
		jmp      code_03b1
code_0070:
		dup     
		ldi      1
		eq?     
		bnt      code_00b2
		pushi    4
		pushi    3
		pushi    1180
		pushi    4
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    3
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		jmp      code_03b1
code_00b2:
		dup     
		ldi      2
		eq?     
		bnt      code_012c
		pushi    4
		pushi    3
		pushi    1180
		pushi    8
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    7
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    6
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    5
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    154
		call     localproc_03b8,  8
		jmp      code_03b1
code_012c:
		dup     
		ldi      3
		eq?     
		bnt      code_01a6
		pushi    4
		pushi    3
		pushi    1180
		pushi    12
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    11
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    10
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    9
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    154
		call     localproc_03b8,  8
		jmp      code_03b1
code_01a6:
		dup     
		ldi      4
		eq?     
		bnt      code_0220
		pushi    4
		pushi    3
		pushi    1180
		pushi    16
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    15
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    14
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    13
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    154
		call     localproc_03b8,  8
		jmp      code_03b1
code_0220:
		dup     
		ldi      5
		eq?     
		bnt      code_0262
		pushi    4
		pushi    3
		pushi    1180
		pushi    18
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    17
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		jmp      code_03b1
code_0262:
		dup     
		ldi      6
		eq?     
		bnt      code_02dc
		pushi    4
		pushi    3
		pushi    1180
		pushi    22
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    21
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    20
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    19
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    154
		call     localproc_03b8,  8
		jmp      code_03b1
code_02dc:
		dup     
		ldi      7
		eq?     
		bnt      code_0356
		pushi    4
		pushi    3
		pushi    1180
		pushi    26
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    25
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    24
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    23
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    154
		call     localproc_03b8,  8
		jmp      code_03b1
code_0356:
		dup     
		ldi      8
		eq?     
		bnt      code_03b1
		pushi    4
		pushi    3
		pushi    1180
		pushi    29
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    181
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    28
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    172
		call     localproc_03b8,  8
		pushi    4
		pushi    3
		pushi    1180
		pushi    27
		lea      @local209
		push    
		callk    GetFarText,  6
		push    
		pushi    100
		pushi    5
		pushi    163
		call     localproc_03b8,  8
code_03b1:
		toss    
		ldi      0
		sal      local735
		ret     
	)
)

(procedure (localproc_03b8 param1 param2 param3)
	(asm
		pushi    10
		lsp      param1
		lsp      param2
		&rest    param3
		pushi    105
		pushi    3
		pushi    102
		pushi    7
		pushi    103
		pushi    33
		pushi    106
		pushi    320
		callk    Display,  20
		ret     
	)
)

(procedure (localproc_03d5 param1 param2 param3)
	(asm
		pushi    9
		lsp      param1
		lsp      param2
		&rest    param3
		pushi    67
		pushi    65535
		lsl      local738
		pushi    70
		lsl      local739
		pushi    30
		pushi    0
		calle    proc13_4,  18
		ret     
	)
)

(instance rm180 of Rm
	(properties
		picture 180
		style $0064
		horizon 30
		north 220
		east 220
		south 220
		west 220
	)
	
	(method (init)
		(asm
			pushi    13
			pushi    128
			pushi    0
			pushi    3
			pushi    2
			pushi    1
			pushi    245
			pushi    4
			pushi    5
			pushi    183
			pushi    46
			pushi    185
			pushi    186
			pushi    188
			calle    proc958_0,  26
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #actions
			pushi    1
			lofsa    egoDoVerb
			push    
			lag      global0
			send     6
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      400
			eq?     
			bnt      code_0454
			pushi    #number
			pushi    1
			pushi    400
			lag      global100
			send     6
			pushi    #setScript
			pushi    3
			lofsa    egoEnters
			push    
			pushi    0
			lsg      global108
			lag      global0
			send     10
			jmp      code_049a
code_0454:
			pushi    1
			pushi    42
			callb    proc0_5,  2
			bnt      code_0480
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_0480
			pushi    #number
			pushi    1
			pushi    901
			lag      global100
			send     6
			pushi    #setScript
			pushi    1
			lofsa    firstEncounter
			push    
			lag      global0
			send     6
			jmp      code_049a
code_0480:
			pushi    #number
			pushi    1
			pushi    180
			lag      global100
			send     6
			pushi    #setScript
			pushi    3
			lofsa    egoEnters
			push    
			pushi    0
			lsg      global108
			lag      global0
			send     10
code_049a:
			pushi    #play
			pushi    0
			lag      global100
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #setPri
			pushi    1
			pushi    7
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    oakMan
			send     14
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    60
			pushi    189
			pushi    156
			pushi    178
			pushi    160
			pushi    181
			pushi    170
			pushi    176
			pushi    173
			pushi    169
			pushi    171
			pushi    160
			pushi    166
			pushi    136
			pushi    166
			pushi    140
			pushi    161
			pushi    177
			pushi    153
			pushi    169
			pushi    149
			pushi    84
			pushi    149
			pushi    60
			pushi    157
			pushi    50
			pushi    165
			pushi    30
			pushi    165
			pushi    30
			pushi    160
			pushi    50
			pushi    155
			pushi    68
			pushi    144
			pushi    43
			pushi    152
			pushi    31
			pushi    152
			pushi    39
			pushi    142
			pushi    80
			pushi    141
			pushi    107
			pushi    129
			pushi    0
			pushi    129
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    132
			pushi    242
			pushi    132
			pushi    247
			pushi    156
			pushi    248
			pushi    165
			pushi    225
			pushi    151
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     134
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    300
			pushi    167
			pushi    277
			pushi    166
			pushi    266
			pushi    154
			pushi    251
			pushi    145
			pushi    255
			pushi    137
			pushi    277
			pushi    138
			pushi    319
			pushi    139
			pushi    319
			pushi    159
			pushi    300
			pushi    158
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     8
			pushi    3
			lofsa    oakTree
			push    
			lofsa    grove1
			push    
			lofsa    grove2
			push    
			calle    proc806_3,  6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			lsg      global137
			ldi      3
			lt?     
			bnt      code_0610
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_0610
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    #doit
			pushi    0
			lofsa    oakHandSignCode
			send     4
			jmp      code_06c4
code_0610:
			lal      local735
			bnt      code_0626
			ldi      0
			sal      local735
			pushi    1
			lsl      local730
			call     localproc_0012,  2
			jmp      code_06c4
code_0626:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0634
			jmp      code_06c4
code_0634:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_068d
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0656
			pToa     north
			jmp      code_0677
code_0656:
			dup     
			ldi      2
			eq?     
			bnt      code_0662
			pToa     east
			jmp      code_0677
code_0662:
			dup     
			ldi      3
			eq?     
			bnt      code_066e
			pToa     south
			jmp      code_0677
code_066e:
			dup     
			ldi      4
			eq?     
			bnt      code_0677
			pToa     west
code_0677:
			toss    
			sat      temp0
			pushi    #setScript
			pushi    3
			lofsa    walkOut
			push    
			pushi    0
			lst      temp0
			lag      global0
			send     10
			jmp      code_06c4
code_068d:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			eq?     
			bnt      code_06be
			pushi    #horizon
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global2
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lag      global0
			send     12
			jmp      code_06c4
code_06be:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_06c4:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    4
			pushi    0
			pushi    223
			pushi    225
			pushi    220
			calle    proc958_0,  8
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0831
			pushi    0
			callb    proc0_3,  0
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_074e
			pushi    #posn
			pushi    2
			lsg      global104
			pushi    238
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsg      global104
			pushi    185
			pushSelf
			lag      global0
			send     24
			jmp      code_082d
code_074e:
			dup     
			ldi      2
			eq?     
			bnt      code_0782
			lsg      global105
			ldi      165
			lt?     
			bnt      code_0763
			ldi      165
			sag      global105
code_0763:
			pushi    #posn
			pushi    2
			pushi    65526
			lsg      global105
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    26
			lsg      global105
			pushSelf
			lag      global0
			send     24
			jmp      code_082d
code_0782:
			dup     
			ldi      3
			eq?     
			bnt      code_07de
			lsg      global104
			ldi      160
			lt?     
			bnt      code_07b7
			pushi    #posn
			pushi    2
			pushi    25
			pushi    152
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    27
			pushi    157
			pushSelf
			lag      global0
			send     30
			jmp      code_082d
code_07b7:
			pushi    #posn
			pushi    2
			pushi    274
			pushi    157
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    272
			pushi    161
			pushSelf
			lag      global0
			send     30
			jmp      code_082d
code_07de:
			dup     
			ldi      4
			eq?     
			bnt      code_0814
			lsg      global105
			ldi      165
			lt?     
			bnt      code_07f3
			ldi      165
			sag      global105
code_07f3:
			pushi    #posn
			pushi    2
			pushi    330
			lsg      global105
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    298
			lsg      global105
			pushSelf
			lag      global0
			send     24
			jmp      code_082d
code_0814:
			pushi    #posn
			pushi    2
			pushi    160
			pushi    175
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lag      global0
			send     18
			ldi      24
			aTop     ticks
code_082d:
			toss    
			jmp      code_08da
code_0831:
			dup     
			ldi      1
			eq?     
			bnt      code_0868
			pushi    1
			pushi    179
			callb    proc0_5,  2
			bnt      code_085f
			pushi    1
			pushi    179
			callb    proc0_7,  2
			pushi    5
			pushi    1
			lea      @local174
			push    
			lea      @local201
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_08da
code_085f:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_08da
code_0868:
			dup     
			ldi      2
			eq?     
			bnt      code_08da
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_08d5
			lsg      global137
			ldi      3
			gt?     
			bnt      code_08ce
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			lsg      global126
			ldi      0
			eq?     
			bnt      code_08ce
			pushi    3
			pushi    0
			pushi    3
			pushi    1
			callb    proc0_2,  6
			pushi    #view
			pushi    1
			pushi    1
			lag      global109
			send     6
			pushi    #normal
			pushi    1
			pushi    1
			pushi    516
			pushi    1
			pushi    1
			pushi    54
			pushi    1
			pushi    8
			pushi    55
			pushi    1
			pushi    6
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    160
			pushi    170
			lag      global0
			send     34
code_08ce:
			pushi    0
			calle    proc750_2,  0
code_08d5:
			pushi    #dispose
			pushi    0
			self     4
code_08da:
			toss    
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0995
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sat      temp1
			lsg      global108
			dup     
			ldi      3
			eq?     
			bnt      code_0947
			ldi      240
			sat      temp1
			jmp      code_0966
code_0947:
			dup     
			ldi      2
			eq?     
			bnt      code_0958
			lst      temp0
			ldi      20
			add     
			sat      temp0
			jmp      code_0966
code_0958:
			dup     
			ldi      4
			eq?     
			bnt      code_0966
			lst      temp0
			ldi      20
			sub     
			sat      temp0
code_0966:
			toss    
			pushi    0
			callb    proc0_3,  0
			lsg      global108
			ldi      1
			ne?     
			bnt      code_098c
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     18
			jmp      code_0a3f
code_098c:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0a3f
code_0995:
			dup     
			ldi      1
			eq?     
			bnt      code_0a3f
			pushi    0
			callb    proc0_4,  0
			lsg      global130
			ldi      7
			eq?     
			bnt      code_09c8
			pushi    1
			pushi    35
			callb    proc0_5,  2
			bnt      code_09c8
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_09c8
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0a3f
code_09c8:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0a03
			pushi    1
			pushi    36
			callb    proc0_5,  2
			bnt      code_0a03
			pushi    1
			pushi    7
			callb    proc0_5,  2
			bnt      code_0a03
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_0a03
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0a3f
code_0a03:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0a35
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_0a35
			pushi    1
			pushi    27
			callb    proc0_5,  2
			bnt      code_0a35
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0a3f
code_0a35:
			pushi    #newRoom
			pushi    1
			pTos     register
			lag      global2
			send     6
code_0a3f:
			toss    
			ret     
		)
	)
)

(instance overRidge of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0aa5
			pushi    0
			callb    proc0_3,  0
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			lag      global0
			send     18
			jmp      code_0ac5
code_0aa5:
			dup     
			ldi      1
			eq?     
			bnt      code_0ac5
			pushi    #horizon
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ac5:
			toss    
			ret     
		)
	)
)

(instance firstEncounter of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b4e
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local741
			pushi    1
			pushi    118
			callb    proc0_6,  2
			pushi    #posn
			pushi    2
			pushi    300
			pushi    220
			pushi    162
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    75
			pushi    164
			pushSelf
			lofsa    sprite
			send     36
			jmp      code_0c9e
code_0b4e:
			dup     
			ldi      1
			eq?     
			bnt      code_0b8d
			pushi    #view
			pushi    1
			pushi    188
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			lofsa    sprite
			send     18
			pushi    #posn
			pushi    2
			pushi    300
			pushi    230
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    194
			pushi    173
			pushSelf
			lag      global0
			send     24
			jmp      code_0c9e
code_0b8d:
			dup     
			ldi      2
			eq?     
			bnt      code_0bce
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     10
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sprite
			send     14
			jmp      code_0c9e
code_0bce:
			dup     
			ldi      3
			eq?     
			bnt      code_0beb
			pushi    5
			pushi    1
			lea      @local0
			push    
			lea      @local183
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0c9e
code_0beb:
			dup     
			ldi      4
			eq?     
			bnt      code_0c24
			pushi    #view
			pushi    1
			pushi    185
			pushi    162
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65516
			pushi    176
			pushSelf
			lofsa    sprite
			send     42
			jmp      code_0c9e
code_0c24:
			dup     
			ldi      5
			eq?     
			bnt      code_0c55
			pushi    #dispose
			pushi    0
			lofsa    sprite
			send     4
			pushi    #number
			pushi    1
			pushi    181
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_0c9e
code_0c55:
			dup     
			ldi      6
			eq?     
			bnt      code_0c82
			ldi      1
			sal      local742
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    7
			pushi    2
			lea      @local7
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0c9e
code_0c82:
			dup     
			ldi      7
			eq?     
			bnt      code_0c9e
			pushi    #setScript
			pushi    1
			lofsa    canWeTalkHere
			push    
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0c9e:
			toss    
			ret     
		)
	)
)

(instance canWeTalkHere of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cef
			ldi      5
			aTop     seconds
			jmp      code_0d24
code_0cef:
			dup     
			ldi      1
			eq?     
			bnt      code_0d06
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_0d24
code_0d06:
			dup     
			ldi      2
			eq?     
			bnt      code_0d24
			pushi    #number
			pushi    1
			pushi    180
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #dispose
			pushi    0
			self     4
code_0d24:
			toss    
			ret     
		)
	)
)

(instance callVainly of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0de1
			pushi    0
			callb    proc0_3,  0
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0d82
			ldi      1
			sat      temp0
			jmp      code_0dcc
code_0d82:
			dup     
			ldi      1
			eq?     
			bnt      code_0d90
			ldi      7
			sat      temp0
			jmp      code_0dcc
code_0d90:
			dup     
			ldi      4
			eq?     
			bnt      code_0d9e
			ldi      6
			sat      temp0
			jmp      code_0dcc
code_0d9e:
			dup     
			ldi      6
			eq?     
			bnt      code_0dac
			ldi      8
			sat      temp0
			jmp      code_0dcc
code_0dac:
			dup     
			ldi      5
			eq?     
			bnt      code_0dba
			ldi      9
			sat      temp0
			jmp      code_0dcc
code_0dba:
			dup     
			ldi      2
			eq?     
			bnt      code_0dc8
			ldi      4
			sat      temp0
			jmp      code_0dcc
code_0dc8:
			ldi      5
			sat      temp0
code_0dcc:
			toss    
			pushi    5
			pushi    1
			lea      @local43
			push    
			lst      temp0
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0e07
code_0de1:
			dup     
			ldi      1
			eq?     
			bnt      code_0df7
			pushi    3
			pushi    1180
			pushi    57
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e07
code_0df7:
			dup     
			ldi      2
			eq?     
			bnt      code_0e07
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0e07:
			toss    
			ret     
		)
	)
)

(instance blowIt of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e65
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1180
			pushi    63
			pushSelf
			calle    proc13_4,  6
			jmp      code_0e75
code_0e65:
			dup     
			ldi      1
			eq?     
			bnt      code_0e75
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0e75:
			toss    
			ret     
		)
	)
)

(instance theRiddles of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f26
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			sal      local730
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      181
			ne?     
			bt       code_0ee3
			pushi    #handle
			pushi    0
			lag      global100
			send     4
			not     
code_0ee3:
			bnt      code_0ef8
			pushi    #number
			pushi    1
			pushi    181
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_0ef8:
			pushi    #cel
			pushi    0
			lofsa    oakMan
			send     4
			push    
			ldi      10
			ne?     
			bnt      code_0f1d
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     14
			jmp      code_1583
code_0f1d:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1583
code_0f26:
			dup     
			ldi      1
			eq?     
			bnt      code_0f45
			pushi    7
			pushi    2
			lea      @local169
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1583
code_0f45:
			dup     
			ldi      2
			eq?     
			bnt      code_0f74
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1583
code_0f74:
			dup     
			ldi      3
			eq?     
			bnt      code_0f93
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     20
			jmp      code_1583
code_0f93:
			dup     
			ldi      4
			eq?     
			bnt      code_0fda
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    oakMan
			send     6
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    razzleDazzle
			send     8
			pushi    #x
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
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sparkle
			send     24
			jmp      code_1583
code_0fda:
			dup     
			ldi      5
			eq?     
			bnt      code_102f
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    10
			pushi    285
			pushi    0
			lofsa    oakMan
			send     16
			pushi    #dispose
			pushi    0
			lofsa    sparkle
			send     4
			pushi    #view
			pushi    1
			pushi    245
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    8
			pushi    412
			pushi    1
			pushi    1
			pushi    516
			pushi    1
			pushi    1
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     48
			jmp      code_1583
code_102f:
			dup     
			ldi      6
			eq?     
			bnt      code_1056
			pushi    #dispose
			pushi    0
			lofsa    razzleDazzle
			send     4
			pushi    7
			pushi    2
			lea      @local47
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1583
code_1056:
			dup     
			ldi      7
			eq?     
			bnt      code_1073
			pushi    5
			pushi    1
			lea      @local54
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1583
code_1073:
			dup     
			ldi      8
			eq?     
			bnt      code_1081
			ldi      36
			aTop     ticks
			jmp      code_1583
code_1081:
			dup     
			ldi      9
			eq?     
			bnt      code_1222
			lsl      local730
			ldi      8
			eq?     
			bnt      code_1099
			ldi      0
			sal      local730
			jmp      code_109c
code_1099:
			+al      local730
code_109c:
			lsl      local730
			dup     
			ldi      0
			eq?     
			bnt      code_10c5
			ldi      260
			sal      local739
			ldi      110
			sal      local738
			ldi      1180
			sal      local736
			ldi      30
			sal      local737
			lea      @local66
			sal      local731
			jmp      code_11f2
code_10c5:
			dup     
			ldi      1
			eq?     
			bnt      code_10eb
			ldi      260
			sal      local739
			ldi      120
			sal      local738
			ldi      1180
			sal      local736
			ldi      31
			sal      local737
			lea      @local70
			sal      local731
			jmp      code_11f2
code_10eb:
			dup     
			ldi      2
			eq?     
			bnt      code_1111
			ldi      260
			sal      local739
			ldi      110
			sal      local738
			ldi      1180
			sal      local736
			ldi      32
			sal      local737
			lea      @local74
			sal      local731
			jmp      code_11f2
code_1111:
			dup     
			ldi      3
			eq?     
			bnt      code_1137
			ldi      260
			sal      local739
			ldi      100
			sal      local738
			ldi      1180
			sal      local736
			ldi      33
			sal      local737
			lea      @local78
			sal      local731
			jmp      code_11f2
code_1137:
			dup     
			ldi      4
			eq?     
			bnt      code_115d
			ldi      260
			sal      local739
			ldi      90
			sal      local738
			ldi      1180
			sal      local736
			ldi      34
			sal      local737
			lea      @local82
			sal      local731
			jmp      code_11f2
code_115d:
			dup     
			ldi      5
			eq?     
			bnt      code_1183
			ldi      260
			sal      local739
			ldi      100
			sal      local738
			ldi      1180
			sal      local736
			ldi      35
			sal      local737
			lea      @local86
			sal      local731
			jmp      code_11f2
code_1183:
			dup     
			ldi      6
			eq?     
			bnt      code_11a9
			ldi      260
			sal      local739
			ldi      100
			sal      local738
			ldi      1180
			sal      local736
			ldi      36
			sal      local737
			lea      @local90
			sal      local731
			jmp      code_11f2
code_11a9:
			dup     
			ldi      7
			eq?     
			bnt      code_11cf
			ldi      260
			sal      local739
			ldi      100
			sal      local738
			ldi      1180
			sal      local736
			ldi      37
			sal      local737
			lea      @local94
			sal      local731
			jmp      code_11f2
code_11cf:
			dup     
			ldi      8
			eq?     
			bnt      code_11f2
			ldi      260
			sal      local739
			ldi      110
			sal      local738
			ldi      1180
			sal      local736
			ldi      38
			sal      local737
			lea      @local98
			sal      local731
code_11f2:
			toss    
			pushi    #init
			pushi    0
			lofsa    fakeFrame
			send     4
			pushi    #init
			pushi    0
			lofsa    fakeBust
			send     4
			pushi    #init
			pushi    0
			lofsa    fakeMouth
			send     4
			pushi    1
			pushi    26
			calle    proc13_6,  2
			pushi    3
			lsl      local736
			lsl      local737
			pushSelf
			call     localproc_03d5,  6
			jmp      code_1583
code_1222:
			dup     
			ldi      10
			eq?     
			bnt      code_1253
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			lofsa    fakeFrame
			send     4
			pushi    #dispose
			pushi    0
			lofsa    fakeBust
			send     4
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lofsa    fakeMouth
			send     10
			ldi      8
			aTop     ticks
			jmp      code_1583
code_1253:
			dup     
			ldi      11
			eq?     
			bnt      code_1261
			ldi      6
			aTop     ticks
			jmp      code_1583
code_1261:
			dup     
			ldi      12
			eq?     
			bnt      code_1298
			pushi    0
			callb    proc0_4,  0
			ldi      1
			sal      local735
			pushi    #dispose
			pushi    0
			lofsa    oakTree
			send     4
			pushi    #dispose
			pushi    0
			lofsa    grove1
			send     4
			pushi    #dispose
			pushi    0
			lofsa    grove2
			send     4
			pushi    #doit
			pushi    0
			pushi    1
			pushi    213
			callk    ScriptID,  2
			send     4
			jmp      code_1583
code_1298:
			dup     
			ldi      13
			eq?     
			bnt      code_149e
			pushi    0
			callb    proc0_3,  0
			pushi    3
			lofsa    oakTree
			push    
			lofsa    grove1
			push    
			lofsa    grove2
			push    
			calle    proc806_3,  6
			lsl      local730
			dup     
			ldi      0
			eq?     
			bnt      code_12e1
			lsg      global124
			ldi      22
			eq?     
			bt       code_12ce
			lsg      global124
			ldi      23
			eq?     
code_12ce:
			bnt      code_12d9
			ldi      1
			sal      local732
			jmp      code_147e
code_12d9:
			ldi      0
			sal      local732
			jmp      code_147e
code_12e1:
			dup     
			ldi      1
			eq?     
			bnt      code_1310
			lsg      global124
			ldi      24
			eq?     
			bt       code_12fd
			lsg      global124
			ldi      25
			eq?     
			bt       code_12fd
			lsg      global124
			ldi      26
			eq?     
code_12fd:
			bnt      code_1308
			ldi      1
			sal      local732
			jmp      code_147e
code_1308:
			ldi      0
			sal      local732
			jmp      code_147e
code_1310:
			dup     
			ldi      2
			eq?     
			bnt      code_1337
			lsg      global124
			ldi      27
			eq?     
			bt       code_1324
			lsg      global124
			ldi      28
			eq?     
code_1324:
			bnt      code_132f
			ldi      1
			sal      local732
			jmp      code_147e
code_132f:
			ldi      0
			sal      local732
			jmp      code_147e
code_1337:
			dup     
			ldi      3
			eq?     
			bnt      code_136e
			lsg      global124
			ldi      29
			eq?     
			bt       code_135b
			lsg      global124
			ldi      30
			eq?     
			bt       code_135b
			lsg      global124
			ldi      31
			eq?     
			bt       code_135b
			lsg      global124
			ldi      32
			eq?     
code_135b:
			bnt      code_1366
			ldi      1
			sal      local732
			jmp      code_147e
code_1366:
			ldi      0
			sal      local732
			jmp      code_147e
code_136e:
			dup     
			ldi      4
			eq?     
			bnt      code_13bd
			lsg      global124
			ldi      33
			eq?     
			bt       code_13aa
			lsg      global124
			ldi      34
			eq?     
			bt       code_13aa
			lsg      global124
			ldi      35
			eq?     
			bt       code_13aa
			lsg      global124
			ldi      36
			eq?     
			bt       code_13aa
			lsg      global124
			ldi      37
			eq?     
			bt       code_13aa
			lsg      global124
			ldi      38
			eq?     
			bt       code_13aa
			lsg      global124
			ldi      39
			eq?     
code_13aa:
			bnt      code_13b5
			ldi      1
			sal      local732
			jmp      code_147e
code_13b5:
			ldi      0
			sal      local732
			jmp      code_147e
code_13bd:
			dup     
			ldi      5
			eq?     
			bnt      code_13e4
			lsg      global124
			ldi      40
			eq?     
			bt       code_13d1
			lsg      global124
			ldi      41
			eq?     
code_13d1:
			bnt      code_13dc
			ldi      1
			sal      local732
			jmp      code_147e
code_13dc:
			ldi      0
			sal      local732
			jmp      code_147e
code_13e4:
			dup     
			ldi      6
			eq?     
			bnt      code_140b
			lsg      global124
			ldi      42
			eq?     
			bt       code_13f8
			lsg      global124
			ldi      43
			eq?     
code_13f8:
			bnt      code_1403
			ldi      1
			sal      local732
			jmp      code_147e
code_1403:
			ldi      0
			sal      local732
			jmp      code_147e
code_140b:
			dup     
			ldi      7
			eq?     
			bnt      code_144a
			lsg      global124
			ldi      44
			eq?     
			bt       code_1437
			lsg      global124
			ldi      45
			eq?     
			bt       code_1437
			lsg      global124
			ldi      46
			eq?     
			bt       code_1437
			lsg      global124
			ldi      47
			eq?     
			bt       code_1437
			lsg      global124
			ldi      48
			eq?     
code_1437:
			bnt      code_1442
			ldi      1
			sal      local732
			jmp      code_147e
code_1442:
			ldi      0
			sal      local732
			jmp      code_147e
code_144a:
			dup     
			ldi      8
			eq?     
			bnt      code_147e
			lsg      global124
			ldi      49
			eq?     
			bt       code_146e
			lsg      global124
			ldi      50
			eq?     
			bt       code_146e
			lsg      global124
			ldi      51
			eq?     
			bt       code_146e
			lsg      global124
			ldi      52
			eq?     
code_146e:
			bnt      code_1479
			ldi      1
			sal      local732
			jmp      code_147e
code_1479:
			ldi      0
			sal      local732
code_147e:
			toss    
			lsl      local732
			ldi      0
			eq?     
			bnt      code_1493
			pushi    #changeState
			pushi    1
			pushi    14
			self     6
			jmp      code_1583
code_1493:
			pushi    #changeState
			pushi    1
			pushi    16
			self     6
			jmp      code_1583
code_149e:
			dup     
			ldi      14
			eq?     
			bnt      code_1500
			lsl      local733
			dup     
			ldi      0
			eq?     
			bnt      code_14c5
			pushi    5
			pushi    1
			lea      @local121
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_14f9
code_14c5:
			dup     
			ldi      1
			eq?     
			bnt      code_14e2
			pushi    5
			pushi    1
			lea      @local125
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_14f9
code_14e2:
			dup     
			ldi      2
			eq?     
			bnt      code_14f9
			pushi    0
			callb    proc0_4,  0
			pushi    #setScript
			pushi    1
			lofsa    yourHistory
			push    
			lag      global0
			send     6
code_14f9:
			toss    
			+al      local733
			jmp      code_1583
code_1500:
			dup     
			ldi      15
			eq?     
			bnt      code_1512
			pushi    #changeState
			pushi    1
			pushi    9
			self     6
			jmp      code_1583
code_1512:
			dup     
			ldi      16
			eq?     
			bnt      code_1574
			lsl      local734
			dup     
			ldi      0
			eq?     
			bnt      code_1539
			pushi    5
			pushi    1
			lea      @local129
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_156d
code_1539:
			dup     
			ldi      1
			eq?     
			bnt      code_1556
			pushi    5
			pushi    1
			lea      @local133
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_156d
code_1556:
			dup     
			ldi      2
			eq?     
			bnt      code_156d
			pushi    0
			callb    proc0_4,  0
			pushi    #setScript
			pushi    1
			lofsa    yourAWinner
			push    
			lag      global0
			send     6
code_156d:
			toss    
			+al      local734
			jmp      code_1583
code_1574:
			dup     
			ldi      17
			eq?     
			bnt      code_1583
			pushi    #changeState
			pushi    1
			pushi    9
			self     6
code_1583:
			toss    
			ret     
		)
	)
)

(instance oakWindow of Window
	(properties)
	
	(method (init)
		(asm
			lag      global187
			aTop     color
			lag      global176
			aTop     back
			ret     
		)
	)
)

(instance fakeFrame of View
	(properties
		x 43
		y 81
		view 805
		priority 14
		signal $4010
	)
)

(instance fakeBust of View
	(properties
		view 46
		loop 1
		priority 13
		signal $4010
	)
	
	(method (init)
		(asm
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    fakeFrame
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    fakeFrame
			send     4
			push    
			ldi      1
			sub     
			push    
			self     8
			pushi    #init
			pushi    0
			super    View,  4
			ret     
		)
	)
)

(instance fakeMouth of Prop
	(properties
		view 46
		priority 14
		signal $4010
	)
	
	(method (init)
		(asm
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lofsa    fakeFrame
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    fakeFrame
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			self     16
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    3
			pushi    18
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			self     14
			pushi    #cue
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance yourHistory of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17d6
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local137
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_18ee
code_17d6:
			dup     
			ldi      1
			eq?     
			bnt      code_1832
			pushi    #cel
			pushi    0
			lofsa    oakMan
			send     4
			push    
			ldi      10
			ne?     
			bnt      code_1818
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      181
			ne?     
			bt       code_1803
			pushi    #handle
			pushi    0
			lag      global100
			send     4
			not     
code_1803:
			bnt      code_1818
			pushi    #number
			pushi    1
			pushi    181
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_1818:
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     20
			jmp      code_18ee
code_1832:
			dup     
			ldi      2
			eq?     
			bnt      code_1881
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    razzleDazzle
			send     8
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lag      global0
			send     6
			pushi    #x
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
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sparkle
			send     24
			jmp      code_18ee
code_1881:
			dup     
			ldi      3
			eq?     
			bnt      code_18a0
			pushi    #dispose
			pushi    0
			lofsa    sparkle
			send     4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_18ee
code_18a0:
			dup     
			ldi      4
			eq?     
			bnt      code_18e0
			pushi    #dispose
			pushi    0
			lofsa    razzleDazzle
			send     4
			pushi    #number
			pushi    1
			pushi    180
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    5
			pushi    1
			lea      @local141
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_18ee
code_18e0:
			dup     
			ldi      5
			eq?     
			bnt      code_18ee
			pushi    0
			calle    proc806_0,  0
code_18ee:
			toss    
			ret     
		)
	)
)

(instance yourAWinner of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1956
			pushi    0
			callb    proc0_3,  0
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     20
			jmp      code_1ac2
code_1956:
			dup     
			ldi      1
			eq?     
			bnt      code_199a
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    razzleDazzle
			send     8
			pushi    #x
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
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sparkle
			send     24
			jmp      code_1ac2
code_199a:
			dup     
			ldi      2
			eq?     
			bnt      code_19c2
			pushi    #dispose
			pushi    0
			lofsa    sparkle
			send     4
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_1ac2
code_19c2:
			dup     
			ldi      3
			eq?     
			bnt      code_19e7
			pushi    #dispose
			pushi    0
			lofsa    razzleDazzle
			send     4
			pushi    1
			pushi    4
			callb    proc0_2,  2
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_1ac2
code_19e7:
			dup     
			ldi      4
			eq?     
			bnt      code_1a08
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    1
			pushi    200
			calle    proc806_1,  2
			ldi      6
			aTop     ticks
			jmp      code_1ac2
code_1a08:
			dup     
			ldi      5
			eq?     
			bnt      code_1a37
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1ac2
code_1a37:
			dup     
			ldi      6
			eq?     
			bnt      code_1a56
			pushi    7
			pushi    2
			lea      @local146
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1ac2
code_1a56:
			dup     
			ldi      7
			eq?     
			bnt      code_1a8a
			pushi    #number
			pushi    1
			pushi    180
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    5
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    oakMan
			send     20
			jmp      code_1ac2
code_1a8a:
			dup     
			ldi      8
			eq?     
			bnt      code_1ac2
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    #cycleSpeed
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      0
			sag      global19
			pushi    1
			pushi    35
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1ac2:
			toss    
			ret     
		)
	)
)

(instance targetPractice of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c09
			pushi    0
			callb    proc0_3,  0
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
			lofsa    oakMan
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    oakMan
			send     4
			push    
			callk    GetAngle,  8
			sat      temp0
			push    
			ldi      20
			le?     
			bt       code_1b4e
			lst      temp0
			ldi      340
			gt?     
code_1b4e:
			bnt      code_1b5e
			pushi    #setLoop
			pushi    1
			pushi    3
			lag      global0
			send     6
			jmp      code_1bf0
code_1b5e:
			lst      temp0
			ldi      60
			le?     
			bnt      code_1b73
			pushi    #setLoop
			pushi    1
			pushi    6
			lag      global0
			send     6
			jmp      code_1bf0
code_1b73:
			lst      temp0
			ldi      100
			le?     
			bnt      code_1b87
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_1bf0
code_1b87:
			lst      temp0
			ldi      160
			le?     
			bnt      code_1b9d
			pushi    #setLoop
			pushi    1
			pushi    4
			lag      global0
			send     6
			jmp      code_1bf0
code_1b9d:
			lst      temp0
			ldi      200
			le?     
			bnt      code_1bb2
			pushi    #setLoop
			pushi    1
			pushi    2
			lag      global0
			send     6
			jmp      code_1bf0
code_1bb2:
			lst      temp0
			ldi      240
			le?     
			bnt      code_1bc8
			pushi    #setLoop
			pushi    1
			pushi    5
			lag      global0
			send     6
			jmp      code_1bf0
code_1bc8:
			lst      temp0
			ldi      290
			le?     
			bnt      code_1bdd
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			jmp      code_1bf0
code_1bdd:
			lst      temp0
			ldi      340
			le?     
			bnt      code_1bf0
			pushi    #setLoop
			pushi    1
			pushi    7
			lag      global0
			send     6
code_1bf0:
			pushi    #view
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_1dcf
code_1c09:
			dup     
			ldi      1
			eq?     
			bnt      code_1c29
			pushi    #view
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_1dcf
code_1c29:
			dup     
			ldi      2
			eq?     
			bnt      code_1c4c
			pushi    #number
			pushi    1
			pushi    906
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    0
			callb    proc0_2,  0
			ldi      12
			aTop     ticks
			jmp      code_1dcf
code_1c4c:
			dup     
			ldi      3
			eq?     
			bnt      code_1c64
			pushi    #number
			pushi    1
			pushi    908
			pushi    42
			pushi    1
			pushSelf
			lag      global113
			send     12
			jmp      code_1dcf
code_1c64:
			dup     
			ldi      4
			eq?     
			bnt      code_1ca5
			pushi    #number
			pushi    1
			pushi    181
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #cel
			pushi    0
			lofsa    oakMan
			send     4
			push    
			ldi      10
			ne?     
			bnt      code_1c9c
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_1dcf
code_1c9c:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1dcf
code_1ca5:
			dup     
			ldi      5
			eq?     
			bnt      code_1cc2
			pushi    5
			pushi    1
			lea      @local156
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1dcf
code_1cc2:
			dup     
			ldi      6
			eq?     
			bnt      code_1d07
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     20
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global0
			send     10
			jmp      code_1dcf
code_1d07:
			dup     
			ldi      7
			eq?     
			bnt      code_1d40
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    #x
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
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sparkle
			send     24
			jmp      code_1dcf
code_1d40:
			dup     
			ldi      8
			eq?     
			bnt      code_1d73
			pushi    #dispose
			pushi    0
			lofsa    sparkle
			send     4
			pushi    #view
			pushi    1
			pushi    245
			pushi    162
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     32
			jmp      code_1dcf
code_1d73:
			dup     
			ldi      9
			eq?     
			bnt      code_1d8a
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_1dcf
code_1d8a:
			dup     
			ldi      10
			eq?     
			bnt      code_1dc1
			pushi    #number
			pushi    1
			pushi    180
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #stopUpd
			pushi    0
			lofsa    oakMan
			send     4
			pushi    5
			pushi    1
			lea      @local160
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1dcf
code_1dc1:
			dup     
			ldi      11
			eq?     
			bnt      code_1dcf
			pushi    0
			calle    proc806_0,  0
code_1dcf:
			toss    
			ret     
		)
	)
)

(instance callOutOakMan of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1e86
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			lofsa    oakMan
			push    
			callb    proc0_9,  4
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      181
			ne?     
			bt       code_1e43
			pushi    #handle
			pushi    0
			lag      global100
			send     4
			not     
code_1e43:
			bnt      code_1e58
			pushi    #number
			pushi    1
			pushi    181
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_1e58:
			pushi    #cel
			pushi    0
			lofsa    oakMan
			send     4
			push    
			ldi      10
			ne?     
			bnt      code_1e7d
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    oakMan
			send     14
			jmp      code_1eea
code_1e7d:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1eea
code_1e86:
			dup     
			ldi      1
			eq?     
			bnt      code_1ea3
			pushi    5
			pushi    1
			lea      @local38
			push    
			lea      @local192
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1eea
code_1ea3:
			dup     
			ldi      2
			eq?     
			bnt      code_1eb5
			pushi    0
			callb    proc0_4,  0
			ldi      5
			aTop     seconds
			jmp      code_1eea
code_1eb5:
			dup     
			ldi      3
			eq?     
			bnt      code_1ecc
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    oakMan
			send     8
			jmp      code_1eea
code_1ecc:
			dup     
			ldi      4
			eq?     
			bnt      code_1eea
			pushi    #number
			pushi    1
			pushi    180
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #dispose
			pushi    0
			self     4
code_1eea:
			toss    
			ret     
		)
	)
)

(instance sprite of Actor
	(properties
		yStep 5
		view 185
		signal $4000
		xStep 9
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1f3e
			pushi    3
			pushi    1180
			pushi    39
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f47
code_1f3e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Actor,  6
code_1f47:
			toss    
			ret     
		)
	)
)

(instance oakMan of Prop
	(properties
		x 152
		y 131
		view 183
		priority 7
		signal $0010
		cycleSpeed 10
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2008
			pTos     cel
			ldi      0
			gt?     
			bnt      code_1ff9
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_1ff9
			pushi    3
			pushi    1180
			pushi    54
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_1ff9:
			pushi    3
			pushi    1180
			pushi    75
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_2008:
			dup     
			ldi      3
			eq?     
			bnt      code_2049
			pTos     cel
			ldi      0
			eq?     
			bt       code_2028
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_203a
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
code_2028:
			bnt      code_203a
			pushi    3
			pushi    1180
			pushi    76
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_203a:
			pushi    3
			pushi    1180
			pushi    55
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_2049:
			dup     
			ldi      5
			eq?     
			bnt      code_21dd
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_2075
			lsg      global137
			ldi      2
			gt?     
			bnt      code_2075
			pushi    5
			pushi    1
			lea      @local179
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2310
code_2075:
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_2098
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_2098
			pushi    3
			pushi    1180
			pushi    107
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_2098:
			lsg      global126
			ldi      0
			ne?     
			bnt      code_20af
			pushi    3
			pushi    1180
			pushi    106
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_20af:
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_20e5
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_20e5
			lsl      local729
			ldi      0
			eq?     
			bnt      code_20e5
			+al      local729
			pushi    6
			pushi    2
			lea      @local102
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			calle    proc851_0,  12
			jmp      code_2310
code_20e5:
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_211b
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_211b
			lsl      local729
			ldi      1
			eq?     
			bnt      code_211b
			+al      local729
			pushi    6
			pushi    2
			lea      @local108
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			calle    proc851_0,  12
			jmp      code_2310
code_211b:
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_2165
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_2165
			lsl      local729
			ldi      2
			eq?     
			bnt      code_2165
			+al      local729
			pushi    6
			pushi    2
			lea      @local113
			push    
			lea      @local192
			push    
			pushi    0
			pushi    1
			pushi    1
			calle    proc851_0,  12
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    firstEncounter
			eq?     
			bnt      code_2310
			pushi    0
			callb    proc0_3,  0
			jmp      code_2310
code_2165:
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_21a3
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_21a3
			lsg      global130
			ldi      8
			lt?     
			bnt      code_21a3
			lal      local740
			not     
			bnt      code_21a3
			lsl      local742
			ldi      0
			eq?     
			bnt      code_21a3
			ldi      1
			sal      local740
			pushi    #setScript
			pushi    1
			lofsa    callOutOakMan
			push    
			lag      global0
			send     6
			jmp      code_2310
code_21a3:
			pushi    1
			pushi    35
			callb    proc0_5,  2
			not     
			bnt      code_21ce
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_21ce
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_21ce
			pushi    #setScript
			pushi    1
			lofsa    theRiddles
			push    
			lag      global0
			send     6
			jmp      code_2310
code_21ce:
			pushi    #setScript
			pushi    1
			lofsa    callVainly
			push    
			lag      global0
			send     6
			jmp      code_2310
code_21dd:
			dup     
			ldi      10
			eq?     
			bnt      code_2222
			pushi    1
			pushi    35
			callb    proc0_5,  2
			bnt      code_21fc
			pushi    3
			pushi    1180
			pushi    127
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_21fc:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_2213
			pushi    #setScript
			pushi    1
			lofsa    targetPractice
			push    
			lag      global2
			send     6
			jmp      code_2310
code_2213:
			pushi    3
			pushi    1180
			pushi    127
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_2222:
			dup     
			ldi      4
			eq?     
			bnt      code_2305
			pTos     cel
			ldi      0
			gt?     
			bnt      code_22e0
			pushi    1
			pushi    118
			callb    proc0_5,  2
			bnt      code_22e0
			lsp      param2
			dup     
			ldi      2
			eq?     
			bnt      code_2258
			pushi    4
			pushi    1
			lea      @local20
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_22dc
code_2258:
			dup     
			ldi      10
			eq?     
			bnt      code_2274
			pushi    4
			pushi    1
			lea      @local25
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_22dc
code_2274:
			dup     
			ldi      18
			eq?     
			bnt      code_2290
			pushi    4
			pushi    1
			lea      @local61
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_22dc
code_2290:
			dup     
			ldi      17
			eq?     
			bnt      code_22ca
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_22b5
			pushi    4
			pushi    1
			lea      @local33
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_22dc
code_22b5:
			pushi    4
			pushi    1
			lea      @local29
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_22dc
code_22ca:
			pushi    4
			pushi    1
			lea      @local117
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
code_22dc:
			toss    
			jmp      code_2310
code_22e0:
			lsp      param2
			ldi      2
			eq?     
			bnt      code_22f7
			pushi    3
			pushi    1180
			pushi    111
			pushi    1
			calle    proc13_4,  6
			jmp      code_2310
code_22f7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
			jmp      code_2310
code_2305:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_2310:
			toss    
			ret     
		)
	)
)

(instance razzleDazzle of Sound
	(properties
		number 216
	)
)

(instance sparkle of Prop
	(properties
		view 245
		loop 1
		signal $4000
	)
)

(instance oakTree of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    38
			pushi    211
			pushi    144
			pushi    185
			pushi    148
			pushi    176
			pushi    143
			pushi    189
			pushi    138
			pushi    183
			pushi    127
			pushi    130
			pushi    127
			pushi    67
			pushi    149
			pushi    68
			pushi    135
			pushi    79
			pushi    139
			pushi    125
			pushi    110
			pushi    134
			pushi    65
			pushi    31
			pushi    39
			pushi    16
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    73
			pushi    221
			pushi    78
			pushi    194
			pushi    99
			pushi    196
			pushi    114
			pushi    208
			pushi    113
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     86
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
			bnt      code_24ac
			pushi    3
			pushi    1180
			pushi    75
			pushi    0
			calle    proc13_4,  6
			jmp      code_25b2
code_24ac:
			dup     
			ldi      3
			eq?     
			bnt      code_24c2
			pushi    3
			pushi    1180
			pushi    76
			pushi    0
			calle    proc13_4,  6
			jmp      code_25b2
code_24c2:
			dup     
			ldi      10
			eq?     
			bnt      code_2507
			pushi    1
			pushi    35
			callb    proc0_5,  2
			bnt      code_24e1
			pushi    3
			pushi    1180
			pushi    127
			pushi    1
			calle    proc13_4,  6
			jmp      code_25b2
code_24e1:
			lsg      global126
			ldi      0
			eq?     
			bnt      code_24f8
			pushi    #setScript
			pushi    1
			lofsa    targetPractice
			push    
			lag      global2
			send     6
			jmp      code_25b2
code_24f8:
			pushi    3
			pushi    1180
			pushi    127
			pushi    1
			calle    proc13_4,  6
			jmp      code_25b2
code_2507:
			dup     
			ldi      5
			eq?     
			bnt      code_257b
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_2531
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_2531
			pushi    3
			pushi    1180
			pushi    107
			pushi    1
			calle    proc13_4,  6
			jmp      code_25b2
code_2531:
			lsg      global126
			ldi      0
			ne?     
			bnt      code_2548
			pushi    3
			pushi    1180
			pushi    106
			pushi    1
			calle    proc13_4,  6
			jmp      code_25b2
code_2548:
			pushi    #cel
			pushi    0
			lofsa    oakMan
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_2566
			pushi    #setScript
			pushi    1
			lofsa    callVainly
			push    
			lag      global0
			send     6
			jmp      code_25b2
code_2566:
			pushi    4
			pushi    1
			lea      @local165
			push    
			lea      @local192
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_25b2
code_257b:
			dup     
			ldi      4
			eq?     
			bnt      code_25a7
			lsp      param2
			ldi      2
			eq?     
			bnt      code_2599
			pushi    3
			pushi    1180
			pushi    111
			pushi    1
			calle    proc13_4,  6
			jmp      code_25b2
code_2599:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
			jmp      code_25b2
code_25a7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_25b2:
			toss    
			ret     
		)
	)
)

(instance grove1 of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    124
			pushi    107
			pushi    0
			pushi    122
			pushi    0
			pushi    7
			pushi    17
			pushi    6
			pushi    30
			pushi    40
			pushi    132
			pushi    66
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2645
			pushi    3
			pushi    1180
			pushi    74
			pushi    0
			calle    proc13_4,  6
			jmp      code_2650
code_2645:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_2650:
			toss    
			ret     
		)
	)
)

(instance grove2 of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    319
			pushi    119
			pushi    267
			pushi    120
			pushi    212
			pushi    106
			pushi    197
			pushi    99
			pushi    222
			pushi    79
			pushi    319
			pushi    75
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_26ea
			pushi    3
			pushi    1180
			pushi    74
			pushi    0
			calle    proc13_4,  6
			jmp      code_26f5
code_26ea:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_26f5:
			toss    
			ret     
		)
	)
)

(instance oakHandSignCode of Code
	(properties)
	
	(method (doit)
		(asm
			lsg      global126
			ldi      0
			ne?     
			bnt      code_2757
			pushi    3
			pushi    1180
			pushi    106
			pushi    1
			calle    proc13_4,  6
			jmp      code_27f2
code_2757:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    theRiddles
			eq?     
			bnt      code_2773
			pushi    #cue
			pushi    0
			lofsa    theRiddles
			send     4
			jmp      code_27f2
code_2773:
			pushi    1
			pushi    35
			callb    proc0_5,  2
			bnt      code_27b4
			lsg      global124
			ldi      7
			eq?     
			bnt      code_2798
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_27f2
code_2798:
			lsg      global124
			ldi      18
			eq?     
			bnt      code_27f2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_27f2
code_27b4:
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_27f2
			lsg      global124
			ldi      7
			eq?     
			bnt      code_27d9
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_27f2
code_27d9:
			lsg      global124
			ldi      18
			eq?     
			bnt      code_27f2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
code_27f2:
			ret     
		)
	)
)

(instance egoDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_2858
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_283a
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    5
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			ldi      1
			jmp      code_2857
code_283a:
			dup     
			ldi      5
			eq?     
			bnt      code_2857
			lsg      global126
			ldi      6
			eq?     
			bnt      code_2857
			pushi    #setScript
			pushi    1
			lofsa    blowIt
			push    
			lag      global0
			send     6
			ldi      1
code_2857:
			toss    
code_2858:
			ret     
		)
	)
)
