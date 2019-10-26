;;; Sierra Script 1.0 - (do not remove this comment)
(script# 190)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm190 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	[local8 4] = [1190 39 1]
	[local12 4] = [1190 29 1]
	[local16 4] = [1190 30 1]
	[local20 4] = [1190 0 1]
	[local24 5] = [1190 1 1 1]
	[local29 6] = [1190 3 1 2 2]
	[local35 10] = [1190 6 2 1 2 1 3 2 1]
	[local45 14] = [1190 13 1 2 2 2 1 2 2 1 3 1 2]
	[local59 6] = [1190 24 2 1 2]
	[local65 10] = [1190 43 1 2 0 1190 32 1 1]
	[local75 4] = [1190 31 1]
	[local79 3] = [-1 4944 6]
)
(procedure (localproc_000e param1)
	(asm
		pushi    1
		pushi    6
		calle    proc13_6,  2
		pushi    2
		&rest    param1
		pushi    80
		lofsa    {Simon}
		push    
		calle    proc13_4,  4
		ret     
	)
)

(procedure (localproc_0023)
	(asm
		pushi    2
		pushi    0
		pushi    100
		callk    Random,  4
		sal      local1
		push    
		ldi      80
		gt?     
		bnt      code_003d
		pushi    120
		lag      global125
		div     
		sal      local0
		jmp      code_007e
code_003d:
		lsl      local1
		ldi      60
		gt?     
		bnt      code_0050
		pushi    160
		lag      global125
		div     
		sal      local0
		jmp      code_007e
code_0050:
		lsl      local1
		ldi      40
		gt?     
		bnt      code_0063
		pushi    200
		lag      global125
		div     
		sal      local0
		jmp      code_007e
code_0063:
		lsl      local1
		ldi      20
		gt?     
		bnt      code_0076
		pushi    240
		lag      global125
		div     
		sal      local0
		jmp      code_007e
code_0076:
		pushi    280
		lag      global125
		div     
		sal      local0
code_007e:
		ret     
	)
)

(procedure (localproc_007f)
	(asm
		lsg      global125
		ldi      2
		eq?     
		bnt      code_0094
		pushi    2
		pushi    6
		pushi    8
		callk    Random,  4
		sal      local2
		jmp      code_009e
code_0094:
		pushi    2
		pushi    4
		pushi    7
		callk    Random,  4
		sal      local2
code_009e:
		lsl      local2
		ldi      5
		le?     
		bnt      code_00ad
		ldi      10
		sal      local3
		jmp      code_00c7
code_00ad:
		lsl      local2
		ldi      7
		le?     
		bnt      code_00bc
		ldi      20
		sal      local3
		jmp      code_00c7
code_00bc:
		ldi      8
		sal      local2
		bnt      code_00c7
		ldi      70
		sal      local3
code_00c7:
		pushi    #init
		pushi    0
		lofsa    windFlags
		send     4
		ret     
	)
)

(instance rm190 of Rm
	(properties
		picture 190
		style $0064
		horizon 145
	)
	
	(method (init &tmp temp0 temp1)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    flagTree
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    garland1
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    garland2
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    garland3
			send     8
			pushi    0
			call     localproc_0023,  0
			pushi    0
			call     localproc_007f,  0
			pushi    #number
			pushi    1
			pushi    12
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			lsg      global12
			ldi      200
			eq?     
			bnt      code_0147
			pushi    1
			pushi    43
			callb    proc0_5,  2
			not     
			bnt      code_0147
			pushi    1
			pushi    43
			callb    proc0_7,  2
			ldi      1
			sal      local5
			jmp      code_0223
code_0147:
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_016c
			lsg      global12
			ldi      220
			eq?     
			bnt      code_016c
			pushi    1
			pushi    46
			callb    proc0_6,  2
			pushi    1
			pushi    43
			callb    proc0_7,  2
			ldi      1
			sal      local5
			jmp      code_0223
code_016c:
			pushi    1
			pushi    73
			callb    proc0_5,  2
			bnt      code_018b
			lsg      global12
			ldi      220
			eq?     
			bnt      code_018b
			pushi    1
			pushi    43
			callb    proc0_7,  2
			ldi      1
			sal      local5
			jmp      code_0223
code_018b:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0207
			pushi    1
			pushi    46
			callb    proc0_5,  2
			not     
			bt       code_01ac
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_0223
			lsg      global12
			ldi      200
			eq?     
code_01ac:
			bnt      code_0223
			pushi    1
			pushi    46
			callb    proc0_6,  2
			pushi    1
			pushi    43
			callb    proc0_6,  2
			pushi    #view
			pushi    1
			pushi    160
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    235
			pushi    183
			pushi    267
			pushi    1
			lofsa    willDoVerb
			push    
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    107
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     38
			pushi    #setCel
			pushi    1
			pushi    1
			pushi    281
			pushi    3
			pushi    5
			pushi    3
			pushi    4
			pushi    107
			pushi    0
			lofsa    anOutlaw
			send     20
			jmp      code_0223
code_0207:
			lsg      global130
			ldi      1
			eq?     
			not     
			bnt      code_0223
			lsg      global130
			ldi      7
			eq?     
			not     
			bnt      code_0223
			ldi      1
			sal      local5
			pushi    1
			pushi    43
			callb    proc0_7,  2
code_0223:
			lsg      global108
			ldi      4
			eq?     
			bnt      code_0238
			ldi      148
			sal      local6
			ldi      165
			sal      local7
			jmp      code_026d
code_0238:
			lsg      global108
			ldi      2
			eq?     
			bnt      code_024d
			ldi      193
			sal      local6
			ldi      175
			sal      local7
			jmp      code_026d
code_024d:
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_0263
			ldi      193
			sal      local6
			ldi      175
			sal      local7
			jmp      code_026d
code_0263:
			ldi      148
			sal      local6
			ldi      165
			sal      local7
code_026d:
			lsg      global12
			ldi      220
			eq?     
			bnt      code_02e3
			lsg      global108
			dup     
			ldi      3
			eq?     
			bnt      code_0284
			ldi      109
			jmp      code_02a7
code_0284:
			dup     
			ldi      1
			eq?     
			bnt      code_0291
			ldi      175
			jmp      code_02a7
code_0291:
			dup     
			ldi      4
			eq?     
			bnt      code_029e
			ldi      330
			jmp      code_02a7
code_029e:
			dup     
			ldi      2
			eq?     
			bnt      code_02a7
			ldi      65526
code_02a7:
			toss    
			sat      temp0
			lsg      global108
			dup     
			ldi      3
			eq?     
			bnt      code_02b9
			ldi      142
			jmp      code_02dd
code_02b9:
			dup     
			ldi      1
			eq?     
			bnt      code_02c6
			ldi      235
			jmp      code_02dd
code_02c6:
			dup     
			ldi      4
			eq?     
			bnt      code_02d3
			ldi      154
			jmp      code_02dd
code_02d3:
			dup     
			ldi      2
			eq?     
			bnt      code_02dd
			ldi      150
code_02dd:
			toss    
			sat      temp1
			jmp      code_0317
code_02e3:
			lsg      global12
			ldi      200
			eq?     
			bnt      code_0303
			ldi      128
			sat      temp0
			ldi      163
			sat      temp1
			ldi      148
			sal      local6
			ldi      165
			sal      local7
			jmp      code_0317
code_0303:
			ldi      330
			sat      temp0
			ldi      154
			sat      temp1
			ldi      148
			sal      local6
			ldi      165
			sal      local7
code_0317:
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			lst      temp0
			lst      temp1
			pushi    107
			pushi    0
			pushi    267
			pushi    1
			lofsa    egoShootingDoVerb
			push    
			pushi    142
			pushi    1
			lofsa    imHere
			push    
			lag      global0
			send     24
			pushi    1
			pushi    1
			callb    proc0_5,  2
			bnt      code_034b
			pushi    1
			pushi    1
			callb    proc0_7,  2
			ldi      42
			sag      global112
code_034b:
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    46
			pushi    319
			pushi    65535
			pushi    319
			pushi    0
			pushi    319
			pushi    1
			pushi    319
			pushi    80
			pushi    185
			pushi    67
			pushi    86
			pushi    88
			dup     
			pushi    124
			pushi    92
			pushi    136
			pushi    102
			pushi    140
			pushi    106
			pushi    142
			pushi    110
			pushi    145
			pushi    112
			pushi    146
			pushi    95
			pushi    151
			pushi    100
			pushi    164
			pushi    87
			pushi    167
			pushi    72
			pushi    161
			pushi    57
			pushi    157
			pushi    50
			pushi    154
			pushi    27
			pushi    149
			pushi    48
			pushi    133
			pushi    52
			pushi    96
			pushi    0
			pushi    73
			pushi    0
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     106
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    16
			pushi    96
			pushi    88
			pushi    319
			pushi    93
			pushi    319
			pushi    122
			pushi    316
			pushi    122
			pushi    315
			pushi    153
			pushi    193
			pushi    153
			pushi    180
			pushi    153
			pushi    93
			pushi    123
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    20
			pushi    154
			pushi    61
			pushi    163
			pushi    83
			pushi    171
			pushi    83
			pushi    183
			pushi    68
			pushi    189
			pushi    50
			pushi    189
			pushi    19
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    159
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    32
			pushi    268
			pushi    186
			pushi    300
			pushi    175
			pushi    299
			pushi    171
			pushi    286
			pushi    168
			pushi    273
			pushi    169
			pushi    259
			pushi    174
			pushi    246
			pushi    170
			pushi    217
			pushi    173
			pushi    206
			pushi    169
			pushi    207
			pushi    160
			pushi    217
			pushi    160
			pushi    266
			pushi    155
			pushi    298
			pushi    157
			pushi    319
			pushi    164
			pushi    319
			pushi    189
			pushi    269
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     78
			push    
			lag      global2
			send     12
			pushi    1
			lofsa    rocks
			push    
			calle    proc806_3,  2
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_04de
			jmp      code_0536
code_04de:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0523
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0515
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_0515
			pushi    1
			pushi    44
			callb    proc0_5,  2
			bnt      code_0515
			pushi    0
			callb    proc0_3,  0
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0536
code_0515:
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
			jmp      code_0536
code_0523:
			-al      local0
			push    
			ldi      0
			eq?     
			bnt      code_0536
			pushi    0
			call     localproc_007f,  0
			pushi    0
			call     localproc_0023,  0
code_0536:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global113
			send     12
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0555
			pushi    3
			pushi    1190
			pushi    41
			pushi    1
			calle    proc13_4,  6
			jmp      code_058c
code_0555:
			dup     
			ldi      10
			eq?     
			bnt      code_0581
			lsg      global125
			ldi      1
			eq?     
			bnt      code_0573
			pushi    3
			pushi    1190
			pushi    42
			pushi    1
			calle    proc13_4,  6
			jmp      code_058c
code_0573:
			pushi    #newRoom
			pushi    1
			pushi    200
			lag      global2
			send     6
			jmp      code_058c
code_0581:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_058c:
			toss    
			ret     
		)
	)
)

(instance garland1 of View
	(properties
		x 78
		y 129
		view 200
		loop 2
		priority 9
		signal $0010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_063f
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_0630
			pushi    1
			pushi    77
			callb    proc0_5,  2
			not     
			bnt      code_0621
			pushi    #setScript
			pushi    1
			lofsa    firstAboutGarland
			push    
			lag      global2
			send     6
			jmp      code_068c
code_0621:
			pushi    #setScript
			pushi    1
			lofsa    garlandRepeatMsg
			push    
			lag      global2
			send     6
			jmp      code_068c
code_0630:
			pushi    3
			pushi    1190
			pushi    37
			pushi    1
			calle    proc13_4,  6
			jmp      code_068c
code_063f:
			dup     
			ldi      2
			eq?     
			bnt      code_0655
			pushi    3
			pushi    1190
			pushi    40
			pushi    1
			calle    proc13_4,  6
			jmp      code_068c
code_0655:
			dup     
			ldi      10
			eq?     
			bnt      code_0681
			lsg      global125
			ldi      1
			eq?     
			bnt      code_0673
			pushi    3
			pushi    1190
			pushi    42
			pushi    1
			calle    proc13_4,  6
			jmp      code_068c
code_0673:
			pushi    #newRoom
			pushi    1
			pushi    200
			lag      global2
			send     6
			jmp      code_068c
code_0681:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_068c:
			toss    
			ret     
		)
	)
)

(instance garland2 of View
	(properties
		x 39
		y 130
		view 200
		loop 2
		cel 4
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_070a
			pushi    3
			pushi    1190
			pushi    40
			pushi    1
			calle    proc13_4,  6
			jmp      code_0788
code_070a:
			dup     
			ldi      3
			eq?     
			bnt      code_0751
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_0742
			pushi    1
			pushi    77
			callb    proc0_5,  2
			not     
			bnt      code_0733
			pushi    #setScript
			pushi    1
			lofsa    firstAboutGarland
			push    
			lag      global2
			send     6
			jmp      code_0788
code_0733:
			pushi    #setScript
			pushi    1
			lofsa    garlandRepeatMsg
			push    
			lag      global2
			send     6
			jmp      code_0788
code_0742:
			pushi    3
			pushi    1190
			pushi    37
			pushi    1
			calle    proc13_4,  6
			jmp      code_0788
code_0751:
			dup     
			ldi      10
			eq?     
			bnt      code_077d
			lsg      global125
			ldi      1
			eq?     
			bnt      code_076f
			pushi    3
			pushi    1190
			pushi    42
			pushi    1
			calle    proc13_4,  6
			jmp      code_0788
code_076f:
			pushi    #newRoom
			pushi    1
			pushi    200
			lag      global2
			send     6
			jmp      code_0788
code_077d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0788:
			toss    
			ret     
		)
	)
)

(instance garland3 of View
	(properties
		x 96
		y 131
		view 200
		loop 2
		cel 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0806
			pushi    3
			pushi    1190
			pushi    40
			pushi    1
			calle    proc13_4,  6
			jmp      code_0884
code_0806:
			dup     
			ldi      10
			eq?     
			bnt      code_0832
			lsg      global125
			ldi      1
			eq?     
			bnt      code_0824
			pushi    3
			pushi    1190
			pushi    42
			pushi    1
			calle    proc13_4,  6
			jmp      code_0884
code_0824:
			pushi    #newRoom
			pushi    1
			pushi    200
			lag      global2
			send     6
			jmp      code_0884
code_0832:
			dup     
			ldi      3
			eq?     
			bnt      code_0879
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_086a
			pushi    1
			pushi    77
			callb    proc0_5,  2
			not     
			bnt      code_085b
			pushi    #setScript
			pushi    1
			lofsa    firstAboutGarland
			push    
			lag      global2
			send     6
			jmp      code_0884
code_085b:
			pushi    #setScript
			pushi    1
			lofsa    garlandRepeatMsg
			push    
			lag      global2
			send     6
			jmp      code_0884
code_086a:
			pushi    3
			pushi    1190
			pushi    37
			pushi    1
			calle    proc13_4,  6
			jmp      code_0884
code_0879:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0884:
			toss    
			ret     
		)
	)
)

(instance windFlags of Prop
	(properties
		x 23
		y 101
		view 200
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #setLoop
			pushi    1
			lsl      local2
			pushi    66
			pushi    1
			pushi    12
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			lsl      local3
			self     24
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0923
			pushi    3
			pushi    1190
			pushi    46
			pushi    1
			calle    proc13_4,  6
			jmp      code_0944
code_0923:
			dup     
			ldi      3
			eq?     
			bnt      code_0939
			pushi    3
			pushi    1190
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_0944
code_0939:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0944:
			toss    
			ret     
		)
	)
)

(instance flagTree of View
	(properties
		x 21
		y 159
		view 200
		loop 1
		priority 13
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_09d0
			pushi    3
			pushi    1190
			pushi    46
			pushi    1
			calle    proc13_4,  6
			jmp      code_09f1
code_09d0:
			dup     
			ldi      3
			eq?     
			bnt      code_09e6
			pushi    3
			pushi    1190
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_09f1
code_09e6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_09f1:
			toss    
			ret     
		)
	)
)

(instance rocks of Feature
	(properties
		y 157
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    28
			pushi    2
			pushi    182
			pushi    3
			pushi    157
			pushi    24
			pushi    163
			pushi    27
			pushi    160
			pushi    32
			pushi    159
			pushi    51
			pushi    168
			pushi    61
			pushi    166
			pushi    66
			pushi    170
			pushi    55
			pushi    174
			pushi    43
			pushi    176
			pushi    39
			pushi    177
			pushi    38
			pushi    181
			pushi    27
			pushi    181
			pushi    21
			pushi    183
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     70
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
			bnt      code_0ad2
			pushi    3
			pushi    1190
			pushi    47
			pushi    1
			calle    proc13_4,  6
			jmp      code_0add
code_0ad2:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0add:
			toss    
			ret     
		)
	)
)

(instance anOutlaw of Prop
	(properties
		x 260
		y 168
		approachX 211
		approachY 174
		view 200
		cel 1
		signal $4101
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b52
			pushi    #setScript
			pushi    1
			lofsa    lookAtSimon
			push    
			lag      global0
			send     6
			jmp      code_0c54
code_0b52:
			dup     
			ldi      3
			eq?     
			bnt      code_0b6e
			pushi    3
			pushi    1190
			pushi    34
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0c54
code_0b6e:
			dup     
			ldi      5
			eq?     
			bnt      code_0bbc
			pushi    1
			pushi    78
			callb    proc0_5,  2
			not     
			bnt      code_0b8e
			pushi    #setScript
			pushi    1
			lofsa    outlawFirstTalk
			push    
			lag      global2
			send     6
			jmp      code_0c54
code_0b8e:
			pushi    1
			pushi    41
			callb    proc0_5,  2
			not     
			bnt      code_0bad
			pushi    3
			pushi    1190
			pushi    35
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0c54
code_0bad:
			pushi    #setScript
			pushi    1
			lofsa    repeateClickTalk
			push    
			lag      global2
			send     6
			jmp      code_0c54
code_0bbc:
			dup     
			ldi      10
			eq?     
			bnt      code_0bd2
			pushi    3
			pushi    1190
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c54
code_0bd2:
			dup     
			ldi      4
			eq?     
			bnt      code_0c49
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0bf7
			pushi    3
			pushi    1190
			pushi    36
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0c45
code_0bf7:
			dup     
			ldi      0
			eq?     
			bnt      code_0c3a
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_0c45
			pushi    1
			pushi    87
			callb    proc0_5,  2
			not     
			bnt      code_0c25
			pushi    #setScript
			pushi    1
			lofsa    giveSimonMoney
			push    
			lag      global2
			send     6
			jmp      code_0c45
code_0c25:
			pushi    3
			pushi    1190
			pushi    45
			pushSelf
			call     localproc_000e,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0c45
code_0c3a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0c45:
			toss    
			jmp      code_0c54
code_0c49:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0c54:
			toss    
			ret     
		)
	)
)

(instance heDidNotFire of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cdb
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_0d06
code_0cdb:
			dup     
			ldi      1
			eq?     
			bnt      code_0cf6
			pushi    5
			pushi    1
			lea      @local20
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0d06
code_0cf6:
			dup     
			ldi      2
			eq?     
			bnt      code_0d06
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0d06:
			toss    
			ret     
		)
	)
)

(instance firstConvDay1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d5f
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    72
			callb    proc0_6,  2
			ldi      1
			aTop     cycles
			jmp      code_0dc4
code_0d5f:
			dup     
			ldi      1
			eq?     
			bnt      code_0d7a
			pushi    5
			pushi    1
			lea      @local24
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0dc4
code_0d7a:
			dup     
			ldi      2
			eq?     
			bnt      code_0db4
			pushi    1
			pushi    75
			callb    proc0_5,  2
			bnt      code_0dad
			pushi    1
			pushi    216
			callb    proc0_6,  2
			not     
			bnt      code_0dad
			pushi    7
			pushi    2
			lea      @local29
			push    
			pushi    999
			pushi    0
			pushi    14
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0dc4
code_0dad:
			ldi      1
			aTop     cycles
			jmp      code_0dc4
code_0db4:
			dup     
			ldi      3
			eq?     
			bnt      code_0dc4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0dc4:
			toss    
			ret     
		)
	)
)

(instance firstAboutGarland of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e17
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_0e53
code_0e17:
			dup     
			ldi      1
			eq?     
			bnt      code_0e3d
			pushi    9
			pushi    3
			lea      @local35
			push    
			pushi    999
			pushi    0
			pushi    14
			pushi    3
			lea      @local79
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  18
			jmp      code_0e53
code_0e3d:
			dup     
			ldi      2
			eq?     
			bnt      code_0e53
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    77
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_0e53:
			toss    
			ret     
		)
	)
)

(instance outlawFirstTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ea7
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_0ee3
code_0ea7:
			dup     
			ldi      1
			eq?     
			bnt      code_0ecd
			pushi    9
			pushi    3
			lea      @local45
			push    
			pushi    999
			pushi    0
			lea      @local79
			push    
			pushi    1
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ee3
code_0ecd:
			dup     
			ldi      2
			eq?     
			bnt      code_0ee3
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    78
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_0ee3:
			toss    
			ret     
		)
	)
)

(instance repeateClickTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f37
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_0f68
code_0f37:
			dup     
			ldi      1
			eq?     
			bnt      code_0f58
			pushi    7
			pushi    2
			lea      @local65
			push    
			pushi    999
			pushi    0
			lea      @local79
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0f68
code_0f58:
			dup     
			ldi      2
			eq?     
			bnt      code_0f68
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0f68:
			toss    
			ret     
		)
	)
)

(instance giveSimonMoney of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0fbb
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_0ff7
code_0fbb:
			dup     
			ldi      1
			eq?     
			bnt      code_0fdc
			pushi    7
			pushi    2
			lea      @local59
			push    
			pushi    999
			pushi    0
			lea      @local79
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ff7
code_0fdc:
			dup     
			ldi      2
			eq?     
			bnt      code_0ff7
			pushi    2
			pushi    10
			pushi    87
			calle    proc806_1,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ff7:
			toss    
			ret     
		)
	)
)

(instance lookAtSimon of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1053
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1190
			pushi    32
			pushSelf
			calle    proc13_4,  6
			jmp      code_1079
code_1053:
			dup     
			ldi      1
			eq?     
			bnt      code_1069
			pushi    3
			pushi    1190
			pushi    33
			pushSelf
			calle    proc13_4,  6
			jmp      code_1079
code_1069:
			dup     
			ldi      2
			eq?     
			bnt      code_1079
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1079:
			toss    
			ret     
		)
	)
)

(instance garlandRepeatMsg of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10cd
			pushi    0
			callb    proc0_3,  0
			ldi      6
			aTop     ticks
			jmp      code_10f8
code_10cd:
			dup     
			ldi      1
			eq?     
			bnt      code_10e8
			pushi    5
			pushi    1
			lea      @local12
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_10f8
code_10e8:
			dup     
			ldi      2
			eq?     
			bnt      code_10f8
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_10f8:
			toss    
			ret     
		)
	)
)

(instance imHere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1158
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local6
			lsl      local7
			pushSelf
			lag      global0
			send     12
			jmp      code_121c
code_1158:
			dup     
			ldi      1
			eq?     
			bnt      code_117f
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_1176
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lag      global0
			send     8
			jmp      code_121c
code_1176:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_121c
code_117f:
			dup     
			ldi      2
			eq?     
			bnt      code_1191
			pushi    0
			callb    proc0_2,  0
			ldi      30
			aTop     ticks
			jmp      code_121c
code_1191:
			dup     
			ldi      3
			eq?     
			bnt      code_120c
			lsg      global12
			ldi      200
			eq?     
			bnt      code_11d3
			lsg      global130
			ldi      1
			eq?     
			bnt      code_11d3
			lsl      local5
			ldi      0
			eq?     
			bnt      code_11d3
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_11d3
			pushi    1
			pushi    41
			callb    proc0_5,  2
			not     
			bnt      code_11d3
			pushi    #setScript
			pushi    1
			lofsa    heDidNotFire
			push    
			lag      global0
			send     6
			jmp      code_121c
code_11d3:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_1203
			pushi    1
			pushi    72
			callb    proc0_5,  2
			not     
			bnt      code_11fa
			pushi    1
			pushi    72
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    firstConvDay1
			push    
			lag      global0
			send     6
			jmp      code_121c
code_11fa:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_121c
code_1203:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_121c
code_120c:
			dup     
			ldi      4
			eq?     
			bnt      code_121c
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_121c:
			toss    
			ret     
		)
	)
)

(instance willDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1270
			pushi    3
			pushi    1190
			pushi    38
			pushi    1
			calle    proc13_4,  6
			jmp      code_12d5
code_1270:
			dup     
			ldi      3
			eq?     
			bnt      code_128a
			pushi    4
			pushi    1
			lea      @local8
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_12d5
code_128a:
			dup     
			ldi      5
			eq?     
			bnt      code_12c2
			lsg      global12
			ldi      200
			eq?     
			bnt      code_12ad
			pushi    4
			pushi    1
			lea      @local75
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_12d5
code_12ad:
			pushi    4
			pushi    1
			lea      @local16
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			ldi      1
			jmp      code_12d5
code_12c2:
			dup     
			ldi      10
			eq?     
			bnt      code_12d5
			pushi    3
			pushi    1190
			pushi    51
			pushi    1
			calle    proc13_4,  6
code_12d5:
			toss    
			ret     
		)
	)
)

(instance egoShootingDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      4
			eq?     
			bnt      code_132d
			lsp      param2
			ldi      1
			eq?     
			bnt      code_132d
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_1321
			pushi    3
			pushi    1190
			pushi    48
			pushi    1
			calle    proc13_4,  6
			jmp      code_132d
code_1321:
			pushi    3
			pushi    1190
			pushi    49
			pushi    1
			calle    proc13_4,  6
code_132d:
			toss    
			ret     
		)
	)
)
