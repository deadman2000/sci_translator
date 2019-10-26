;;; Sierra Script 1.0 - (do not remove this comment)
(script# 590)
(include sci.sh)
(use n000)
(use n013)
(use n601)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm590 0
)

(local
	local0
	local1
	[local2 2]
	[local4 5]
	[local9 14]
	[local23 10]
	[local33 4] = [188 164 124 189]
	[local37 4] = [146 137 133 130]
	[local41 12] = [0 319 90 225 159 136 244 0 160 319 57 15]
	[local53 12] = [109 109 116 122 105 131 139 128 145 129 139 119]
	[local65 12] = [1 1 0 2 2 2 0 2 1 2 0 1]
	[local77 9] = [2 3 3 3 2 3 3 3 2]
	[local86 9] = [1 2 5 5 6 5 7 7 4]
	[local95 9] = [21 7 66 -15 -27 -12 22 157 234]
	[local104 9] = [145 145 142 190 182 169 144 170 168]
	[local113 5] = [1590 0 1 2]
	[local118 5] = [1590 2 1 2]
	[local123 4] = [1590 4 1]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0014:
		lst      temp0
		ldi      12
		lt?     
		bnt      code_008e
		pushi    4
		pushi    1
		lat      temp0
		lsli     local41
		pushi    3
		pushi    1
		lsli     local53
		pushi    63
		pushi    1
		push    
		ldi      2
		eq?     
		bnt      code_0037
		ldi      7
		jmp      code_0046
code_0037:
		lst      temp0
		ldi      11
		eq?     
		bnt      code_0044
		ldi      1
		jmp      code_0046
code_0044:
		ldi      65535
code_0046:
		push    
		pushi    6
		pushi    1
		lat      temp0
		lsli     local65
		pushi    17
		pushi    1
		pushi    16384
		push    
		ldi      11
		eq?     
		bt       code_0060
		lst      temp0
		ldi      2
		eq?     
code_0060:
		bnt      code_0068
		ldi      16
		jmp      code_006a
code_0068:
		ldi      0
code_006a:
		or      
		push    
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    cloud
		send     4
		push    
		lat      temp0
		sali     local9
		send     34
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local9
		lag      global10
		send     6
		+at      temp0
		jmp      code_0014
code_008e:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(procedure (localproc_0096 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_009c:
		lst      temp0
		ldi      8
		lt?     
		bnt      code_00ea
		pushi    #new
		pushi    0
		lofsa    aPlant
		send     4
		push    
		lat      temp0
		sali     local23
		pushi    #view
		pushi    1
		pushi    600
		pushi    6
		pushi    1
		lat      temp0
		lsli     local77
		pushi    7
		pushi    1
		lsli     local86
		pushi    17
		pushi    1
		pushi    16384
		pushi    4
		pushi    1
		lsli     local95
		pushi    3
		pushi    1
		lsli     local104
		pushi    107
		pushi    0
		lali     local23
		send     40
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local23
		lag      global10
		send     6
		+at      temp0
		jmp      code_009c
code_00ea:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(procedure (localproc_00f2 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_00f8:
		lst      temp0
		ldi      4
		lt?     
		bnt      code_0127
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local33
		pushi    3
		pushi    1
		lsli     local37
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
		jmp      code_00f8
code_0127:
		ret     
	)
)

(instance rm590 of Rm
	(properties
		picture 590
		style $0005
		north 610
	)
	
	(method (init)
		(asm
			pushi    5
			pushi    128
			pushi    0
			pushi    792
			pushi    16
			pushi    585
			calle    proc958_0,  10
			lsg      global12
			ldi      600
			eq?     
			bnt      code_0154
			lsg      global108
			ldi      4
			eq?     
			bnt      code_0154
			pushi    #style
			pushi    1
			pushi    11
			self     6
code_0154:
			pushi    1
			pushi    15
			callb    proc0_6,  2
			pushi    1
			pushi    1
			calle    proc601_11,  2
			pushi    1
			pushi    1
			calle    proc601_5,  2
			sal      local0
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_2,  0
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
			call     localproc_000e,  0
			pushi    0
			call     localproc_0096,  0
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_01a0
			pushi    0
			call     localproc_00f2,  0
code_01a0:
			pushi    7
			lofsa    gate
			push    
			lofsa    monastery
			push    
			lofsa    lilTree
			push    
			lofsa    fog
			push    
			lofsa    waters
			push    
			lofsa    roundGround
			push    
			lofsa    sky
			push    
			calle    proc806_3,  14
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    34
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    165
			pushi    294
			pushi    165
			pushi    271
			pushi    173
			pushi    177
			pushi    173
			pushi    150
			pushi    177
			pushi    143
			pushi    171
			pushi    131
			pushi    166
			pushi    98
			pushi    154
			pushi    98
			pushi    150
			pushi    134
			pushi    149
			pushi    156
			pushi    145
			pushi    137
			pushi    142
			pushi    111
			pushi    142
			pushi    106
			pushi    146
			pushi    0
			pushi    148
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     82
			push    
			self     6
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
			ldi      440
			lt?     
			bnt      code_0280
			pushi    1
			pushi    1
			callk    GetTime,  2
			push    
			lag      global129
			sub     
			push    
			ldi      0
			ne?     
			bnt      code_0280
			lsg      global129
			ldi      0
			ne?     
			bnt      code_0280
			pushi    2
			pushi    128
			pushi    792
			callk    Load,  4
			pushi    #setScript
			pushi    1
			lofsa    beKilled
			push    
			lag      global2
			send     6
			jmp      code_02fb
code_0280:
			lag      global129
			bnt      code_028c
			ldi      0
			sag      global129
			jmp      code_02fb
code_028c:
			lsg      global12
			ldi      580
			eq?     
			bt       code_02a3
			lsg      global12
			ldi      600
			eq?     
			bnt      code_02b5
			lsg      global108
			ldi      3
			eq?     
code_02a3:
			bnt      code_02b5
			pushi    #setScript
			pushi    1
			lofsa    walkUp
			push    
			lag      global0
			send     6
			jmp      code_02fb
code_02b5:
			lsg      global12
			ldi      600
			eq?     
			bnt      code_02ea
			pushi    #posn
			pushi    2
			pushi    305
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
			pushi    256
			pushi    182
			pushSelf
			lag      global0
			send     24
			pushi    0
			callb    proc0_3,  0
			jmp      code_02fb
code_02ea:
			pushi    #posn
			pushi    2
			pushi    160
			pushi    185
			pushi    107
			pushi    0
			lag      global0
			send     12
code_02fb:
			ret     
		)
	)
	
	(method (doit)
		(asm
			+al      local1
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_0375
			lsl      local1
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0375
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    65535
			callk    Palette,  8
code_0375:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0383
			jmp      code_03d1
code_0383:
			pushi    3
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			pushi    3
			pushi    2
			calle    proc999_5,  6
			bnt      code_03a9
			pushi    #setScript
			pushi    1
			lofsa    walkOut
			push    
			lag      global0
			send     6
			jmp      code_03d1
code_03a9:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			le?     
			bnt      code_03cb
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			lofsa    bumpBog
			push    
			lag      global0
			send     12
			jmp      code_03d1
code_03cb:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_03d1:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    15
			callb    proc0_7,  2
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
			lal      local0
			bnt      code_0325
			ldi      0
			sal      local0
			pushi    5
			pushi    1
			lea      @local123
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
code_0325:
			pushi    2
			pushi    0
			pushi    10
			callk    Random,  4
			not     
			bnt      code_0342
			lsg      global126
			ldi      6
			ne?     
			bnt      code_0342
			pushi    #setScript
			pushi    1
			lofsa    nessie
			push    
			self     6
code_0342:
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
			pushi    #notify
			pushi    1
			pushi    1
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
		view 590
		signal $6000
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_04f7
			pushi    #claimed
			pushi    1
			pushi    0
			lap      pEvent
			send     6
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    lilTree
			send     6
			bnt      code_046b
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    lilTree
			send     6
			jmp      code_0500
code_046b:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    gate
			send     6
			bnt      code_0487
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    gate
			send     6
			jmp      code_0500
code_0487:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    sky
			send     6
			bnt      code_04a3
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    sky
			send     6
			jmp      code_0500
code_04a3:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    fog
			send     6
			bnt      code_04bf
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    fog
			send     6
			jmp      code_0500
code_04bf:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    waters
			send     6
			bnt      code_04db
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    waters
			send     6
			jmp      code_0500
code_04db:
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    roundGround
			send     6
			bnt      code_0500
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    roundGround
			send     6
			jmp      code_0500
code_04f7:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    PicView,  6
code_0500:
			ret     
		)
	)
)

(instance aPlant of PicView
	(properties
		lookStr 5
	)
)

(instance wave of Prop
	(properties
		view 590
		loop 3
		signal $4000
		cycleSpeed 18
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_05ba
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
			jmp      code_05ce
code_05ba:
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
code_05ce:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance elliot of Actor
	(properties
		y 115
		view 590
		loop 5
		priority 8
		signal $0810
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0664
			pushi    2
			pushi    1590
			pushi    15
			calle    proc13_4,  4
			pushi    2
			pushi    1590
			pushi    16
			calle    proc13_4,  4
			jmp      code_06b1
code_0664:
			dup     
			ldi      3
			eq?     
			bnt      code_0678
			pushi    2
			pushi    1590
			pushi    17
			calle    proc13_4,  4
			jmp      code_06b1
code_0678:
			dup     
			ldi      5
			eq?     
			bnt      code_068c
			pushi    2
			pushi    1590
			pushi    18
			calle    proc13_4,  4
			jmp      code_06b1
code_068c:
			dup     
			ldi      10
			eq?     
			bnt      code_06a0
			pushi    2
			pushi    1590
			pushi    19
			calle    proc13_4,  4
			jmp      code_06b1
code_06a0:
			dup     
			ldi      4
			eq?     
			bnt      code_06b1
			pushi    2
			pushi    1590
			pushi    20
			calle    proc13_4,  4
code_06b1:
			toss    
			ret     
		)
	)
)

(instance lilTree of Feature
	(properties
		lookStr 5
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    0
			pushi    91
			pushi    28
			pushi    80
			pushi    54
			pushi    87
			pushi    56
			pushi    109
			pushi    91
			pushi    118
			pushi    117
			pushi    141
			pushi    107
			pushi    146
			pushi    0
			pushi    148
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

(instance monastery of Feature
	(properties
		lookStr 7
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    114
			pushi    30
			pushi    121
			pushi    25
			pushi    140
			pushi    28
			pushi    202
			pushi    20
			pushi    222
			pushi    25
			pushi    258
			pushi    27
			pushi    278
			pushi    23
			pushi    278
			pushi    75
			pushi    112
			pushi    75
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_082c
			pushi    3
			pushi    1590
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_0837
code_082c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0837:
			ret     
		)
	)
)

(instance waters of Feature
	(properties
		lookStr 9
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    56
			pushi    76
			pushi    116
			pushi    319
			pushi    116
			pushi    319
			pushi    122
			pushi    309
			pushi    122
			pushi    280
			pushi    118
			pushi    258
			pushi    122
			pushi    240
			pushi    132
			pushi    223
			pushi    130
			pushi    211
			pushi    135
			pushi    222
			pushi    140
			pushi    261
			pushi    142
			pushi    280
			pushi    147
			pushi    282
			pushi    142
			pushi    319
			pushi    145
			pushi    319
			pushi    161
			pushi    265
			pushi    163
			pushi    247
			pushi    155
			pushi    223
			pushi    154
			pushi    203
			pushi    170
			pushi    168
			pushi    170
			pushi    151
			pushi    175
			pushi    137
			pushi    164
			pushi    120
			pushi    157
			pushi    136
			pushi    156
			pushi    154
			pushi    152
			pushi    156
			pushi    145
			pushi    109
			pushi    138
			pushi    93
			pushi    123
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     126
			pushi    #init
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
			bnt      code_0897
			pushi    3
			pushi    1590
			pushi    10
			pushi    1
			calle    proc13_4,  6
			jmp      code_08a2
code_0897:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_08a2:
			ret     
		)
	)
)

(instance roundGround of Feature
	(properties
		nsTop 119
		nsBottom 189
		nsRight 319
		lookStr 14
	)
)

(instance fog of Feature
	(properties
		nsTop 70
		nsBottom 125
		nsRight 319
		lookStr 11
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_09f9
			pushi    3
			pushi    1590
			pushi    12
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a04
code_09f9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a04:
			ret     
		)
	)
)

(instance sky of Feature
	(properties
		nsBottom 69
		nsRight 319
		lookStr 21
	)
)

(instance gate of Feature
	(properties
		nsTop 57
		nsLeft 236
		nsBottom 73
		nsRight 251
		lookStr 13
	)
)

(instance walkUp of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0af5
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    250
			pushi    240
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    245
			pushi    184
			pushSelf
			lag      global0
			send     24
			jmp      code_0b05
code_0af5:
			dup     
			ldi      1
			eq?     
			bnt      code_0b05
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0b05:
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
			bnt      code_0ba0
			pushi    0
			callb    proc0_3,  0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0b7c
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
			jmp      code_0bd3
code_0b7c:
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
			ldi      50
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0bd3
code_0ba0:
			dup     
			ldi      1
			eq?     
			bnt      code_0bd3
			pushi    0
			callb    proc0_4,  0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0bc8
			pushi    #newRoom
			pushi    1
			pushi    600
			lag      global2
			send     6
			jmp      code_0bd3
code_0bc8:
			pushi    #newRoom
			pushi    1
			pushi    580
			lag      global2
			send     6
code_0bd3:
			toss    
			ret     
		)
	)
)

(instance nessie of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c38
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    100
			pushSelf
			lofsa    elliot
			send     16
			jmp      code_0ca5
code_0c38:
			dup     
			ldi      1
			eq?     
			bnt      code_0c46
			ldi      40
			aTop     ticks
			jmp      code_0ca5
code_0c46:
			dup     
			ldi      2
			eq?     
			bnt      code_0c62
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    88
			pushi    100
			pushSelf
			lofsa    elliot
			send     12
			jmp      code_0ca5
code_0c62:
			dup     
			ldi      3
			eq?     
			bnt      code_0c70
			ldi      120
			aTop     ticks
			jmp      code_0ca5
code_0c70:
			dup     
			ldi      4
			eq?     
			bnt      code_0c8d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    85
			pushi    138
			pushSelf
			lofsa    elliot
			send     12
			jmp      code_0ca5
code_0c8d:
			dup     
			ldi      5
			eq?     
			bnt      code_0ca5
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			lofsa    elliot
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0ca5:
			toss    
			ret     
		)
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
			bnt      code_0d01
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1590
			pushi    6
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d3c
code_0d01:
			dup     
			ldi      1
			eq?     
			bnt      code_0d2c
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
			jmp      code_0d3c
code_0d2c:
			dup     
			ldi      2
			eq?     
			bnt      code_0d3c
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0d3c:
			toss    
			ret     
		)
	)
)

(instance beKilled of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e0e
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    #superClass
			pushi    16
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    267
			pushi    3
			pushi    1
			pushi    178
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      0
			sali     local2
			send     34
			pushi    5
			pushi    #superClass
			pushi    585
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    211
			pushi    3
			pushi    1
			pushi    183
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			pushi    2
			pushi    601
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      1
			sali     local2
			send     28
			pushi    #view
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    236
			pushi    3
			pushi    1
			pushi    188
			pushi    107
			pushi    0
			lag      global0
			send     34
			ldi      48
			aTop     ticks
			jmp      code_0ebd
code_0e0e:
			dup     
			ldi      1
			eq?     
			bnt      code_0e2c
			pushi    7
			pushi    2
			lea      @local113
			push    
			pushi    11
			pushi    0
			pushi    11
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ebd
code_0e2c:
			dup     
			ldi      2
			eq?     
			bnt      code_0e48
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			ldi      1
			lali     local2
			send     12
			jmp      code_0ebd
code_0e48:
			dup     
			ldi      3
			eq?     
			bnt      code_0e81
			pushi    #play
			pushi    0
			lofsa    dieSound
			send     4
			pushi    #setCycle
			pushi    1
			class    End
			push    
			ldi      1
			lali     local2
			send     6
			pushi    #view
			pushi    1
			pushi    792
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_0ebd
code_0e81:
			dup     
			ldi      4
			eq?     
			bnt      code_0e9f
			pushi    7
			pushi    2
			lea      @local118
			push    
			pushi    11
			pushi    0
			pushi    11
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ebd
code_0e9f:
			dup     
			ldi      5
			eq?     
			bnt      code_0ebd
			pushi    #stop
			pushi    0
			lag      global168
			send     4
			pushi    #dispose
			pushi    0
			lofsa    dieSound
			send     4
			pushi    0
			calle    proc806_0,  0
code_0ebd:
			toss    
			ret     
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
