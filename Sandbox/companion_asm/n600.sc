;;; Sierra Script 1.0 - (do not remove this comment)
(script# 600)
(include sci.sh)
(use n000)
(use n013)
(use n601)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n961)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm600 0
)

(local
	local0
	local1
	local2
	local3
	[local4 10]
	[local14 9] = [104 161 128 169 51 279 40 3 266]
	[local23 9] = [149 144 141 136 156 143 127 149 140]
	[local32 12]
	[local44 11] = [0 319 90 225 159 136 244 0 160 319 57]
	[local55 11] = [109 109 116 122 105 131 139 128 145 129 139]
	[local66 11] = [1 1 0 2 2 2 0 2 1 2]
	[local77 16]
	[local93 4] = [3 3 2 3]
	[local97 9] = [2 3 3 3 2 3 3 3 2]
	[local106 15] = [2 3 3 3 2 3 3 3 2 3 2 2 3 3 2]
	[local121 4] = [3 6 3 1]
	[local125 9] = [1 2 5 5 6 5 7 7 4]
	[local134 15] = [1 2 5 5 6 5 7 7 4 7 6 6 6 4 1]
	[local149 4] = [57 260 0 3]
	[local153 9] = [21 7 66 191 229 297 239 289 261]
	[local162 15] = [23 50 66 191 152 297 239 289 261 247 214 283 198 312 311]
	[local177 4] = [135 167 160 127]
	[local181 9] = [129 145 142 193 150 195 152 152 142]
	[local190 15] = [156 139 142 193 156 195 153 152 142 189 189 133 141 182 170]
	[local205 7] = [1600 0 1 1 1 1]
	[local212 4] = [1600 4 1]
	[local216 4] = [1600 5 1]
	[local220 10] = [1600 6 1 1 1 1 1 1 1]
	[local230 7] = [1600 13 1 2 2 1]
	[local237 5] = [1600 18 1 2]
	[local242 5] = [1600 20 2 1]
	[local247 4] = [1600 28 1]
	[local251 9] = [673 0 2 4 19 33 22 20 21]
)
(procedure (localproc_000e)
	(asm
		pushi    #dispose
		pushi    0
		pushi    #onMeCheck
		pushi    0
		lofsa    theWater
		send     4
		send     4
		pushi    #dispose
		pushi    0
		pushi    #onMeCheck
		pushi    0
		lofsa    thePlants
		send     4
		send     4
		pushi    #dispose
		pushi    0
		pushi    #obstacles
		pushi    0
		lag      global2
		send     4
		send     4
		pushi    #obstacles
		pushi    1
		pushi    0
		lag      global2
		send     6
		pushi    #add
		pushi    4
		lofsa    thePlants
		push    
		lofsa    theWater
		push    
		lofsa    theSky
		push    
		lofsa    theGround
		push    
		lag      global32
		send     12
		lsl      local1
		ldi      1
		eq?     
		bnt      code_01e4
		pushi    #addObstacle
		pushi    1
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    22
		pushi    319
		pushi    165
		pushi    264
		pushi    171
		pushi    198
		pushi    162
		pushi    179
		pushi    165
		pushi    149
		pushi    164
		pushi    107
		pushi    164
		pushi    52
		pushi    174
		pushi    19
		pushi    165
		pushi    0
		pushi    165
		pushi    0
		pushi    0
		pushi    319
		pushi    0
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     58
		push    
		lag      global2
		send     6
		pushi    #onMeCheck
		pushi    1
		pushi    #type
		pushi    1
		pushi    0
		pushi    107
		pushi    60
		pushi    319
		pushi    161
		pushi    299
		pushi    146
		pushi    273
		pushi    152
		pushi    271
		pushi    165
		pushi    261
		pushi    165
		pushi    252
		pushi    151
		pushi    214
		pushi    143
		pushi    201
		pushi    153
		pushi    178
		pushi    134
		pushi    160
		pushi    129
		pushi    145
		pushi    151
		pushi    138
		pushi    141
		dup     
		pushi    128
		pushi    127
		pushi    121
		pushi    111
		pushi    122
		pushi    104
		pushi    131
		pushi    96
		pushi    146
		pushi    96
		pushi    124
		pushi    88
		pushi    122
		pushi    71
		pushi    142
		pushi    65
		pushi    130
		pushi    55
		pushi    132
		pushi    41
		pushi    150
		pushi    0
		pushi    146
		pushi    0
		pushi    164
		pushi    52
		pushi    171
		pushi    108
		pushi    160
		pushi    218
		pushi    160
		pushi    260
		pushi    166
		pushi    279
		pushi    166
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     134
		push    
		lofsa    thePlants
		send     6
		pushi    #onMeCheck
		pushi    1
		pushi    #type
		pushi    1
		pushi    0
		pushi    107
		pushi    32
		pushi    319
		pushi    120
		pushi    292
		pushi    115
		pushi    257
		pushi    123
		pushi    144
		pushi    131
		pushi    40
		pushi    120
		pushi    0
		pushi    122
		pushi    0
		pushi    162
		pushi    53
		pushi    171
		pushi    121
		pushi    157
		pushi    251
		pushi    161
		pushi    266
		pushi    166
		pushi    319
		pushi    160
		pushi    319
		pushi    145
		pushi    228
		pushi    148
		pushi    245
		pushi    136
		pushi    319
		pushi    124
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     78
		push    
		lofsa    theWater
		send     6
		jmp      code_036a
code_01e4:
		pushi    #addObstacle
		pushi    1
		pushi    #type
		pushi    1
		pushi    2
		pushi    107
		pushi    24
		pushi    0
		pushi    0
		pushi    319
		pushi    0
		pushi    319
		pushi    165
		pushi    300
		pushi    165
		pushi    267
		pushi    174
		pushi    212
		pushi    164
		pushi    170
		pushi    164
		pushi    140
		pushi    165
		pushi    121
		pushi    162
		pushi    44
		pushi    170
		pushi    32
		pushi    165
		pushi    0
		pushi    165
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     62
		push    
		lag      global2
		send     6
		pushi    #onMeCheck
		pushi    1
		pushi    #type
		pushi    1
		pushi    0
		pushi    107
		pushi    60
		pushi    0
		pushi    161
		pushi    20
		pushi    146
		pushi    46
		pushi    152
		pushi    48
		pushi    165
		pushi    58
		pushi    165
		pushi    67
		pushi    151
		pushi    105
		pushi    143
		pushi    118
		pushi    153
		pushi    141
		pushi    134
		pushi    159
		pushi    129
		pushi    174
		pushi    151
		pushi    181
		pushi    141
		pushi    178
		pushi    128
		pushi    192
		pushi    121
		pushi    208
		pushi    122
		pushi    215
		pushi    131
		pushi    223
		pushi    146
		pushi    223
		pushi    124
		pushi    231
		pushi    122
		pushi    248
		pushi    142
		pushi    254
		pushi    130
		pushi    264
		pushi    132
		pushi    278
		pushi    150
		pushi    319
		pushi    146
		pushi    319
		pushi    164
		pushi    267
		pushi    171
		pushi    211
		pushi    160
		pushi    101
		pushi    160
		pushi    59
		pushi    166
		pushi    40
		pushi    166
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     134
		push    
		lofsa    thePlants
		send     6
		pushi    #onMeCheck
		pushi    1
		pushi    #type
		pushi    1
		pushi    0
		pushi    107
		pushi    32
		pushi    0
		pushi    120
		pushi    27
		pushi    115
		pushi    62
		pushi    123
		pushi    175
		pushi    131
		pushi    279
		pushi    120
		pushi    318
		pushi    122
		pushi    319
		pushi    162
		pushi    266
		pushi    171
		pushi    198
		pushi    157
		pushi    68
		pushi    161
		pushi    53
		pushi    166
		pushi    0
		pushi    160
		pushi    0
		pushi    145
		pushi    91
		pushi    148
		pushi    74
		pushi    136
		pushi    0
		pushi    124
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Polygon
		send     4
		send     78
		push    
		lofsa    theWater
		send     6
code_036a:
		ret     
	)
)

(procedure (localproc_0460 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0466:
		lst      temp0
		ldi      11
		lt?     
		bnt      code_04a3
		pushi    #new
		pushi    0
		lofsa    cloud
		send     4
		push    
		lat      temp0
		sali     local32
		pushi    #x
		pushi    1
		lat      temp0
		lsli     local44
		pushi    3
		pushi    1
		lsli     local55
		pushi    6
		pushi    1
		lsli     local66
		pushi    107
		pushi    0
		lali     local32
		send     22
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local32
		lag      global10
		send     6
		+at      temp0
		jmp      code_0466
code_04a3:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(procedure (localproc_04ab param1 &tmp temp0 temp1)
	(asm
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_04bb
		ldi      4
		jmp      code_04d0
code_04bb:
		dup     
		ldi      1
		eq?     
		bnt      code_04c7
		ldi      9
		jmp      code_04d0
code_04c7:
		dup     
		ldi      2
		eq?     
		bnt      code_04d0
		ldi      15
code_04d0:
		toss    
		sat      temp1
		ldi      0
		sat      temp0
code_04d7:
		lst      temp0
		lat      temp1
		lt?     
		bnt      code_05c3
		pushi    #new
		pushi    0
		lofsa    aPlant
		send     4
		push    
		lat      temp0
		sali     local77
		pushi    5
		pushi    1
		pushi    600
		pushi    6
		pushi    1
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_0505
		lat      temp0
		lali     local93
		jmp      code_051e
code_0505:
		dup     
		ldi      1
		eq?     
		bnt      code_0513
		lat      temp0
		lali     local97
		jmp      code_051e
code_0513:
		dup     
		ldi      2
		eq?     
		bnt      code_051e
		lat      temp0
		lali     local106
code_051e:
		toss    
		push    
		pushi    7
		pushi    1
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_0533
		lat      temp0
		lali     local121
		jmp      code_054c
code_0533:
		dup     
		ldi      1
		eq?     
		bnt      code_0541
		lat      temp0
		lali     local125
		jmp      code_054c
code_0541:
		dup     
		ldi      2
		eq?     
		bnt      code_054c
		lat      temp0
		lali     local134
code_054c:
		toss    
		push    
		pushi    4
		pushi    1
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_0561
		lat      temp0
		lali     local149
		jmp      code_057a
code_0561:
		dup     
		ldi      1
		eq?     
		bnt      code_056f
		lat      temp0
		lali     local153
		jmp      code_057a
code_056f:
		dup     
		ldi      2
		eq?     
		bnt      code_057a
		lat      temp0
		lali     local162
code_057a:
		toss    
		push    
		pushi    3
		pushi    1
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_058f
		lat      temp0
		lali     local177
		jmp      code_05a8
code_058f:
		dup     
		ldi      1
		eq?     
		bnt      code_059d
		lat      temp0
		lali     local181
		jmp      code_05a8
code_059d:
		dup     
		ldi      2
		eq?     
		bnt      code_05a8
		lat      temp0
		lali     local190
code_05a8:
		toss    
		push    
		pushi    107
		pushi    0
		lat      temp0
		lali     local77
		send     34
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local77
		lag      global10
		send     6
		+at      temp0
		jmp      code_04d7
code_05c3:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(procedure (localproc_05cb &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_05d1:
		lst      temp0
		ldi      9
		lt?     
		bnt      code_0600
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local14
		pushi    3
		pushi    1
		lsli     local23
		pushi    66
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local4
		send     22
		+at      temp0
		jmp      code_05d1
code_0600:
		ret     
	)
)

(instance rm600 of Rm
	(properties
		picture 600
		style $0005
		north 610
	)
	
	(method (init &tmp temp0)
		(asm
			lsg      global87
			ldi      0
			gt?     
			bnt      code_0610
			ldi      2
			jmp      code_0612
code_0610:
			ldi      3
code_0612:
			sat      temp0
			lsg      global12
			ldi      590
			eq?     
			bnt      code_0624
			pushi    #style
			pushi    1
			pushi    12
			self     6
code_0624:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #actions
			pushi    1
			pushi    2
			pushi    601
			pushi    7
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			pushi    0
			call     localproc_0460,  0
			pushi    1
			pushi    0
			call     localproc_04ab,  2
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_065f
			pushi    0
			call     localproc_05cb,  0
code_065f:
			pushi    4
			lofsa    thePlants
			push    
			lofsa    theWater
			push    
			lofsa    theSky
			push    
			lofsa    theGround
			push    
			calle    proc806_3,  8
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    24
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    165
			pushi    300
			pushi    165
			pushi    267
			pushi    174
			pushi    212
			pushi    164
			pushi    170
			pushi    164
			pushi    140
			pushi    165
			pushi    121
			pushi    162
			pushi    44
			pushi    170
			pushi    32
			pushi    165
			pushi    0
			pushi    165
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			push    
			self     6
			pushi    0
			callb    proc0_2,  0
			lsg      global12
			dup     
			ldi      690
			eq?     
			bnt      code_072a
			pushi    #view
			pushi    1
			pushi    585
			pushi    412
			pushi    1
			pushi    0
			pushi    516
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    2
			pushi    308
			pushi    2
			lst      temp0
			dup     
			pushi    219
			pushi    1
			pushi    18
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    319
			pushi    140
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lofsa    rescueOfFulk
			push    
			lag      global0
			send     68
			ldi      1
			sal      local2
			jmp      code_0819
code_072a:
			dup     
			ldi      700
			eq?     
			bnt      code_07c4
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
			pushi    98
			pushi    132
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
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     42
			pushi    #cel
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    133
			pushi    156
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    10
			callk    ScriptID,  4
			send     18
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    4
			callb    proc0_2,  2
			pushi    #posn
			pushi    2
			pushi    125
			pushi    165
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    180
			pushSelf
			lag      global0
			send     24
			pushi    #notify
			pushi    1
			pushi    700
			pushi    1
			pushi    601
			callk    ScriptID,  2
			send     6
			jmp      code_0819
code_07c4:
			dup     
			ldi      590
			eq?     
			bnt      code_0808
			pushi    #posn
			pushi    2
			pushi    15
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    26
			pushi    182
			pushSelf
			lag      global0
			send     24
			pushi    1
			pushi    2
			calle    proc601_11,  2
			pushi    1
			pushi    2
			calle    proc601_5,  2
			sal      local3
			pushi    0
			callb    proc0_3,  0
			jmp      code_0819
code_0808:
			pushi    #posn
			pushi    2
			pushi    160
			pushi    185
			pushi    107
			pushi    0
			lag      global0
			send     12
code_0819:
			toss    
			ret     
		)
	)
	
	(method (doit)
		(asm
			+al      local0
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_08c0
			lsl      local1
			ldi      1
			eq?     
			bnt      code_08a5
			lsl      local0
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_08c0
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    1
			callk    Palette,  8
			jmp      code_08c0
code_08a5:
			lsl      local0
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_08c0
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    65535
			callk    Palette,  8
code_08c0:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_08ce
			jmp      code_0961
code_08ce:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_08ec
			pushi    #setScript
			pushi    1
			lofsa    walkDown
			push    
			lag      global0
			send     6
			jmp      code_0961
code_08ec:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      310
			ge?     
			bnt      code_0917
			lsl      local1
			ldi      2
			eq?     
			bnt      code_0917
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			lofsa    bumpBog
			push    
			lag      global0
			send     12
			jmp      code_0961
code_0917:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      319
			ge?     
			bnt      code_093d
			lsl      local1
			ldi      2
			lt?     
			bnt      code_093d
			pushi    #setScript
			pushi    1
			lofsa    headEast
			push    
			lag      global0
			send     6
			jmp      code_0961
code_093d:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_095b
			pushi    #setScript
			pushi    1
			lofsa    headWest
			push    
			lag      global0
			send     6
			jmp      code_0961
code_095b:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_0961:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #stop
			pushi    0
			lag      global168
			send     4
			pushi    #setScript
			pushi    1
			pushi    0
			self     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (cue)
		(asm
			lal      local3
			bnt      code_0868
			ldi      0
			sal      local3
			pushi    5
			pushi    1
			lea      @local247
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
code_0868:
			pushi    0
			callb    proc0_4,  0
			pushi    #cue
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (notify)
		(asm
			pushi    382
			pushi    1
			lsl      local1
			dup     
			ldi      0
			eq?     
			bnt      code_082d
			ldi      2
			jmp      code_0842
code_082d:
			dup     
			ldi      1
			eq?     
			bnt      code_0839
			ldi      3
			jmp      code_0842
code_0839:
			dup     
			ldi      2
			eq?     
			bnt      code_0842
			ldi      4
code_0842:
			toss    
			push    
			pushi    1
			pushi    601
			callk    ScriptID,  2
			send     6
			ret     
		)
	)
)

(instance cloud of PicView
	(properties
		z 15
		lookStr 22
		view 590
		signal $6000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_09e5
			pushi    3
			pushi    1600
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_09f0
code_09e5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    PicView,  6
code_09f0:
			ret     
		)
	)
)

(instance aPlant of PicView
	(properties
		lookStr 24
		signal $4000
	)
)

(instance wave of Prop
	(properties
		view 600
		loop 5
		signal $4000
		cycleSpeed 18
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_0aaa
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			self     12
			jmp      code_0abe
code_0aaa:
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Rev
			push    
			self     12
code_0abe:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance theWater of Feature
	(properties
		lookStr 26
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    32
			pushi    0
			pushi    120
			pushi    27
			pushi    115
			pushi    62
			pushi    123
			pushi    175
			pushi    131
			pushi    279
			pushi    120
			pushi    318
			pushi    122
			pushi    319
			pushi    162
			pushi    266
			pushi    171
			pushi    198
			pushi    157
			pushi    68
			pushi    161
			pushi    53
			pushi    166
			pushi    0
			pushi    160
			pushi    0
			pushi    145
			pushi    91
			pushi    148
			pushi    74
			pushi    136
			pushi    0
			pushi    124
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     78
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
			ldi      3
			eq?     
			bnt      code_0b4b
			pushi    3
			pushi    1600
			pushi    27
			pushi    1
			calle    proc13_4,  6
			jmp      code_0b56
code_0b4b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0b56:
			ret     
		)
	)
)

(instance thePlants of Feature
	(properties
		lookStr 24
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    60
			pushi    0
			pushi    161
			pushi    20
			pushi    146
			pushi    46
			pushi    152
			pushi    48
			pushi    165
			pushi    58
			pushi    165
			pushi    67
			pushi    151
			pushi    105
			pushi    143
			pushi    118
			pushi    153
			pushi    141
			pushi    134
			pushi    159
			pushi    129
			pushi    174
			pushi    151
			pushi    181
			pushi    141
			pushi    178
			pushi    128
			pushi    192
			pushi    121
			pushi    208
			pushi    122
			pushi    215
			pushi    131
			pushi    223
			pushi    146
			pushi    223
			pushi    124
			pushi    231
			pushi    122
			pushi    248
			pushi    142
			pushi    254
			pushi    130
			pushi    264
			pushi    132
			pushi    278
			pushi    150
			pushi    319
			pushi    146
			pushi    319
			pushi    164
			pushi    267
			pushi    171
			pushi    211
			pushi    160
			pushi    101
			pushi    160
			pushi    59
			pushi    166
			pushi    40
			pushi    166
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     134
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

(instance theSky of Feature
	(properties
		nsBottom 80
		nsRight 319
		lookStr 30
	)
)

(instance theGround of Feature
	(properties
		nsTop 80
		nsBottom 189
		nsRight 319
		lookStr 29
	)
)

(instance fulkScroll of View
	(properties
		x 240
		y 155
		view 771
		loop 3
		priority 15
		signal $4010
	)
)

(instance waterRing of View
	(properties
		x 240
		y 150
		view 771
		loop 5
		priority 15
		signal $4010
	)
)

(instance fulk of Actor
	(properties
		view 674
		loop 5
		signal $4000
	)
)

(instance bumpBog of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0eff
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1600
			pushi    25
			pushSelf
			calle    proc13_4,  6
			jmp      code_0f3a
code_0eff:
			dup     
			ldi      1
			eq?     
			bnt      code_0f2a
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
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
			jmp      code_0f3a
code_0f2a:
			dup     
			ldi      2
			eq?     
			bnt      code_0f3a
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0f3a:
			toss    
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f9a
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65526
			lsg      global105
			pushSelf
			lag      global0
			send     12
			jmp      code_0faa
code_0f9a:
			dup     
			ldi      1
			eq?     
			bnt      code_0faa
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0faa:
			toss    
			ret     
		)
	)
)

(instance walkDown of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_101a
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    #x
			class    PolyPath
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
			ldi      45
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_102c
code_101a:
			dup     
			ldi      1
			eq?     
			bnt      code_102c
			pushi    #newRoom
			pushi    1
			pushi    590
			lag      global2
			send     6
code_102c:
			toss    
			ret     
		)
	)
)

(instance headEast of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_108f
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    335
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1206
code_108f:
			dup     
			ldi      1
			eq?     
			bnt      code_11a8
			pushi    0
			callb    proc0_3,  0
			+al      local1
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_10bc
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
code_10bc:
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_10dc
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
code_10dc:
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    10
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_10fe
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    601
			pushi    10
			callk    ScriptID,  4
			send     4
code_10fe:
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #release
			pushi    0
			lag      global32
			send     4
			lag      global25
			bnt      code_111b
			pushi    #dispose
			pushi    0
			send     4
code_111b:
			pushi    1
			pushi    14
			callb    proc0_7,  2
			lsl      local1
			ldi      1
			eq?     
			bnt      code_1140
			pushi    #drawPic
			pushi    2
			pushi    600
			pushi    16396
			lag      global2
			send     8
			pushi    1
			pushi    1
			call     localproc_04ab,  2
			jmp      code_1156
code_1140:
			pushi    #style
			pushi    1
			pushi    12
			pushi    396
			pushi    1
			pushi    600
			lag      global2
			send     12
			pushi    1
			pushi    2
			call     localproc_04ab,  2
code_1156:
			pushi    0
			call     localproc_000e,  0
			pushi    0
			call     localproc_0460,  0
			lsg      global130
			ldi      13
			eq?     
			bnt      code_1175
			pushi    1
			lsl      local1
			ldi      2
			add     
			push    
			calle    proc601_11,  2
code_1175:
			pushi    1
			lsl      local1
			ldi      2
			add     
			push    
			calle    proc601_5,  2
			sal      local3
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      320
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
			ldi      30
			aTop     ticks
			jmp      code_1206
code_11a8:
			dup     
			ldi      2
			eq?     
			bnt      code_11c9
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    30
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1206
code_11c9:
			dup     
			ldi      3
			eq?     
			bnt      code_11f2
			lal      local3
			bnt      code_11e9
			pushi    5
			pushi    1
			lea      @local247
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1206
code_11e9:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1206
code_11f2:
			dup     
			ldi      4
			eq?     
			bnt      code_1206
			ldi      0
			sal      local3
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1206:
			toss    
			ret     
		)
	)
)

(instance headWest of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_126c
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65521
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_13f4
code_126c:
			dup     
			ldi      1
			eq?     
			bnt      code_1395
			lal      local1
			not     
			bnt      code_1287
			pushi    #newRoom
			pushi    1
			pushi    590
			lag      global2
			send     6
			jmp      code_13f4
code_1287:
			-al      local1
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_12a9
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
code_12a9:
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_12c9
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
code_12c9:
			pushi    #contains
			pushi    1
			pushi    2
			pushi    601
			pushi    10
			callk    ScriptID,  4
			push    
			lag      global5
			send     6
			bnt      code_12eb
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    601
			pushi    10
			callk    ScriptID,  4
			send     4
code_12eb:
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #release
			pushi    0
			lag      global32
			send     4
			pushi    1
			pushi    14
			callb    proc0_7,  2
			lag      global25
			bnt      code_130e
			pushi    #dispose
			pushi    0
			send     4
code_130e:
			lsl      local1
			ldi      1
			eq?     
			bnt      code_132d
			pushi    #drawPic
			pushi    2
			pushi    600
			pushi    16395
			lag      global2
			send     8
			pushi    1
			pushi    1
			call     localproc_04ab,  2
			jmp      code_1343
code_132d:
			pushi    #style
			pushi    1
			pushi    11
			pushi    396
			pushi    1
			pushi    600
			lag      global2
			send     12
			pushi    1
			pushi    0
			call     localproc_04ab,  2
code_1343:
			pushi    0
			call     localproc_000e,  0
			pushi    0
			call     localproc_0460,  0
			lsg      global130
			ldi      13
			eq?     
			bnt      code_1362
			pushi    1
			lsl      local1
			ldi      2
			add     
			push    
			calle    proc601_11,  2
code_1362:
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      320
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
			pushi    1
			lsl      local1
			ldi      2
			add     
			push    
			calle    proc601_5,  2
			sal      local3
			ldi      30
			aTop     ticks
			jmp      code_13f4
code_1395:
			dup     
			ldi      2
			eq?     
			bnt      code_13b7
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    290
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_13f4
code_13b7:
			dup     
			ldi      3
			eq?     
			bnt      code_13e0
			lal      local3
			bnt      code_13d7
			pushi    5
			pushi    1
			lea      @local247
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_13f4
code_13d7:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_13f4
code_13e0:
			dup     
			ldi      4
			eq?     
			bnt      code_13f4
			ldi      0
			sal      local3
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_13f4:
			toss    
			ret     
		)
	)
)

(instance rescueOfFulk of Script
	(properties)
	
	(method (doit)
		(asm
			lsl      local2
			ldi      1
			eq?     
			bnt      code_148e
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     18
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      26
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    fulk
			send     12
code_148e:
			pushi    #doit
			pushi    0
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
			bnt      code_151a
			pushi    0
			callb    proc0_3,  0
			pushi    162
			pushi    1
			pushi    #-info-
			pushi    288
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      68
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     30
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      26
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    fulk
			send     18
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    138
			pushi    155
			pushSelf
			lag      global0
			send     12
			jmp      code_18b5
code_151a:
			dup     
			ldi      1
			eq?     
			bnt      code_1558
			ldi      0
			sal      local2
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			lofsa    fulk
			send     18
			pushi    #setCel
			pushi    1
			pushi    5
			lag      global0
			send     6
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     6
			jmp      code_18b5
code_1558:
			dup     
			ldi      2
			eq?     
			bnt      code_1599
			pushi    162
			pushi    #superClass
			pushi    5
			pushi    219
			pushi    1
			pushi    6
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    fulk
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    fulk
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    fulk
			send     30
			jmp      code_18b5
code_1599:
			dup     
			ldi      3
			eq?     
			bnt      code_15d7
			pushi    #view
			pushi    1
			pushi    671
			pushi    162
			pushi    1
			pushi    65535
			pushi    66
			pushi    1
			pushi    65535
			pushi    308
			pushi    2
			pushi    2
			pushi    2
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    672
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    80
			pushi    184
			pushSelf
			lofsa    fulk
			send     46
			jmp      code_18b5
code_15d7:
			dup     
			ldi      4
			eq?     
			bnt      code_15ed
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lofsa    fulk
			send     8
			jmp      code_18b5
code_15ed:
			dup     
			ldi      5
			eq?     
			bnt      code_15fb
			ldi      12
			aTop     ticks
			jmp      code_18b5
code_15fb:
			dup     
			ldi      6
			eq?     
			bnt      code_162b
			pushi    0
			callb    proc0_2,  0
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    170
			pushSelf
			lag      global0
			send     12
			jmp      code_18b5
code_162b:
			dup     
			ldi      7
			eq?     
			bnt      code_168f
			lsg      global87
			ldi      0
			gt?     
			bnt      code_163f
			ldi      2
			jmp      code_1641
code_163f:
			ldi      3
code_1641:
			sat      temp0
			pushi    308
			pushi    2
			push    
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      220
			add     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      50
			sub     
			push    
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     18
			pushi    3
			lsg      global0
			lofsa    fulk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_18b5
code_168f:
			dup     
			ldi      8
			eq?     
			bnt      code_169d
			ldi      12
			aTop     ticks
			jmp      code_18b5
code_169d:
			dup     
			ldi      9
			eq?     
			bnt      code_16ba
			pushi    5
			pushi    1
			lea      @local205
			push    
			lea      @local251
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_18b5
code_16ba:
			dup     
			ldi      10
			eq?     
			bnt      code_16e7
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    fulk
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    fulk
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_18b5
code_16e7:
			dup     
			ldi      11
			eq?     
			bnt      code_16ff
			pushi    2
			lsg      global0
			lofsa    fulk
			push    
			callb    proc0_9,  4
			ldi      18
			aTop     ticks
			jmp      code_18b5
code_16ff:
			dup     
			ldi      12
			eq?     
			bnt      code_172a
			pushi    #view
			pushi    1
			pushi    674
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    fulk
			send     32
			jmp      code_18b5
code_172a:
			dup     
			ldi      13
			eq?     
			bnt      code_1743
			pushi    #view
			pushi    1
			pushi    671
			lofsa    fulk
			send     6
			ldi      24
			aTop     ticks
			jmp      code_18b5
code_1743:
			dup     
			ldi      14
			eq?     
			bnt      code_1760
			pushi    5
			pushi    1
			lea      @local212
			push    
			lea      @local251
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_18b5
code_1760:
			dup     
			ldi      15
			eq?     
			bnt      code_177b
			pushi    5
			pushi    1
			lea      @local216
			push    
			pushi    8
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_18b5
code_177b:
			dup     
			ldi      16
			eq?     
			bnt      code_1798
			pushi    5
			pushi    1
			lea      @local220
			push    
			lea      @local251
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_18b5
code_1798:
			dup     
			ldi      17
			eq?     
			bnt      code_1812
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bnt      code_17e5
			pushi    7
			pushi    2
			lea      @local230
			push    
			pushi    8
			pushi    0
			lea      @local251
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  14
			pushi    #has
			pushi    1
			pushi    16
			lag      global0
			send     6
			bnt      code_1805
			pushi    #put
			pushi    1
			pushi    16
			lag      global0
			send     6
			jmp      code_1805
code_17e5:
			pushi    7
			pushi    2
			lea      @local237
			push    
			pushi    8
			pushi    0
			lea      @local251
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  14
			pushi    #get
			pushi    1
			pushi    16
			lag      global0
			send     6
code_1805:
			pushi    #get
			pushi    1
			pushi    18
			lag      global0
			send     6
			jmp      code_18b5
code_1812:
			dup     
			ldi      18
			eq?     
			bnt      code_1832
			pushi    7
			pushi    2
			lea      @local242
			push    
			pushi    8
			pushi    0
			lea      @local251
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_18b5
code_1832:
			dup     
			ldi      19
			eq?     
			bnt      code_186e
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    54
			pushi    1
			pushi    3
			pushi    55
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    672
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65506
			pushi    #y
			pushi    0
			lofsa    fulk
			send     4
			push    
			pushSelf
			lofsa    fulk
			send     38
			jmp      code_18b5
code_186e:
			dup     
			ldi      20
			eq?     
			bnt      code_188b
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    150
			pushi    240
			pushSelf
			lag      global0
			send     12
			jmp      code_18b5
code_188b:
			dup     
			ldi      21
			eq?     
			bnt      code_18b5
			pushi    0
			callb    proc0_4,  0
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    2
			pushi    601
			pushi    1
			callk    ScriptID,  4
			send     12
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_18b5:
			toss    
			ret     
		)
	)
)
