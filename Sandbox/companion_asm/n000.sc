;;; Sierra Script 1.0 - (do not remove this comment)
(script# 0)
(include sci.sh)
(use n013)
(use n014)
(use n255)
(use n802)
(use n813)
(use n856)
(use n934)
(use n936)
(use n937)
(use n939)
(use n945)
(use n946)
(use n961)
(use n967)
(use n977)
(use n981)
(use n989)
(use n994)
(use n995)
(use n996)
(use n999)

(public
	Longbow 0
	statLine 1
	proc0_2 2
	proc0_3 3
	proc0_4 4
	proc0_5 5
	proc0_6 6
	proc0_7 7
	proc0_9 9
)

(local
	global0
	global1
	global2
	global3 =  6
	global4
	global5
	global6
	global7
	global8
	global9
	global10
	global11
	global12
	global13
	global14
	global15
	global16
	global17 =  7
	global18
	global19
	global20 =  999
	global21 =  20
	global22 =  1
	global23 =  4
	global24
	global25
	global26 =  1
	global27
	global28
	global29
	global30 =  10
	global31
	global32
	global33
	global34
	global35
	global36 =  -1
	global37
	global38
	global39 =  3
	global40
	global41
	global42
	global43
	global44
	global45
	global46
	global47
	global48
	global49
	global50
	global51
	global52
	global53
	global54
	global55
	global56
	global57
	global58
	global59
	global60
	global61
	global62
	global63
	global64
	global65
	global66
	global67 =  1
	global68
	global69
	global70
	global71
	global72
	global73
	global74
	global75
	global76
	global77
	global78
	global79 =  60
	global80
	global81
	global82
	global83
	global84
	global85
	global86
	global87
	global88
	global89
	global90
	global91
	global92
	global93
	global94
	global95
	global96
	global97
	global98
	global99
	global100
	global101 =  1234
	global102
	global103
	global104
	global105
	global106
	global107
	global108
	global109
	global110
	global111
	global112
	global113
	global114
	global115
	global116
	global117
	global118 =  1
	global119 =  2
	global120 =  1
	global121 =  5
	global122 =  4
	global123
	global124
	global125 =  2
	global126
	global127
	global128
	global129
	global130 =  1
	global131
	global132
	global133
	global134
	global135
	global136
	global137
	global138 =  50
	global139 =  2000
	global140
	global141 =  4
	global142
	global143
	global144
	global145
	global146
	global147 =  140
	global148
	global149
	global150
	global151
	global152
	global153
	global154
	global155
	global156
	global157
	global158
	global159
	global160
	global161
	global162 =  180
	global163 =  7
	global164
	global165
	global166
	global167
	global168
	global169
	global170
	global171
	global172
	global173
	global174
	global175
	global176
	global177
	global178
	global179
	global180
	global181
	global182
	global183
	global184
	global185
	global186
	global187
	global188
	global189
	global190
	global191
	global192
	global193
	global194
	global195
	global196
	global197
	global198
	global199
	global200
	global201
	global202
	global203
	global204
	global205
	global206
	global207
	global208
	global209
	global210
	global211
	global212
	global213
	global214
	global215
)
(procedure (proc0_2 param1 param2 param3 &tmp temp0 temp1 temp2)
	(asm
		lsg      global126
		dup     
		ldi      1
		eq?     
		bnt      code_2b2e
		ldi      36
		jmp      code_2b6c
code_2b2e:
		dup     
		ldi      2
		eq?     
		bnt      code_2b3a
		ldi      29
		jmp      code_2b6c
code_2b3a:
		dup     
		ldi      3
		eq?     
		bnt      code_2b46
		ldi      29
		jmp      code_2b6c
code_2b46:
		dup     
		ldi      4
		eq?     
		bnt      code_2b52
		ldi      33
		jmp      code_2b6c
code_2b52:
		dup     
		ldi      5
		eq?     
		bnt      code_2b5e
		ldi      23
		jmp      code_2b6c
code_2b5e:
		dup     
		ldi      6
		eq?     
		bnt      code_2b6a
		ldi      16
		jmp      code_2b6c
code_2b6a:
		ldi      0
code_2b6c:
		toss    
		sat      temp0
		lsg      global126
		dup     
		ldi      1
		eq?     
		bnt      code_2b7d
		ldi      37
		jmp      code_2bbb
code_2b7d:
		dup     
		ldi      2
		eq?     
		bnt      code_2b89
		ldi      30
		jmp      code_2bbb
code_2b89:
		dup     
		ldi      3
		eq?     
		bnt      code_2b95
		ldi      30
		jmp      code_2bbb
code_2b95:
		dup     
		ldi      4
		eq?     
		bnt      code_2ba1
		ldi      34
		jmp      code_2bbb
code_2ba1:
		dup     
		ldi      5
		eq?     
		bnt      code_2bad
		ldi      24
		jmp      code_2bbb
code_2bad:
		dup     
		ldi      6
		eq?     
		bnt      code_2bb9
		ldi      17
		jmp      code_2bbb
code_2bb9:
		ldi      1
code_2bbb:
		toss    
		sat      temp1
		lap      argc
		bnt      code_2be4
		pushi    #loop
		pushi    1
		lsp      param1
		lag      global0
		send     6
		lsp      argc
		ldi      1
		gt?     
		bnt      code_2be4
		lap      param2
		sat      temp0
		lsp      argc
		ldi      2
		gt?     
		bnt      code_2be4
		lap      param3
		sat      temp1
code_2be4:
		pushi    #loop
		pushi    0
		lag      global0
		send     4
		push    
		dup     
		ldi      6
		eq?     
		bnt      code_2bf8
		ldi      45
		jmp      code_2c42
code_2bf8:
		dup     
		ldi      0
		eq?     
		bnt      code_2c04
		ldi      90
		jmp      code_2c42
code_2c04:
		dup     
		ldi      4
		eq?     
		bnt      code_2c11
		ldi      135
		jmp      code_2c42
code_2c11:
		dup     
		ldi      2
		eq?     
		bnt      code_2c1e
		ldi      180
		jmp      code_2c42
code_2c1e:
		dup     
		ldi      5
		eq?     
		bnt      code_2c2b
		ldi      225
		jmp      code_2c42
code_2c2b:
		dup     
		ldi      1
		eq?     
		bnt      code_2c38
		ldi      270
		jmp      code_2c42
code_2c38:
		dup     
		ldi      7
		eq?     
		bnt      code_2c42
		ldi      315
code_2c42:
		toss    
		sat      temp2
		pushi    5
		pushi    1
		lst      temp0
		pushi    412
		pushi    1
		pushi    19
		lst      temp0
		pushi    0
		pushi    1
		pushi    3
		pushi    12
		pushi    13
		pushi    29
		pushi    30
		pushi    245
		pushi    33
		pushi    34
		pushi    23
		pushi    24
		pushi    16
		pushi    17
		pushi    702
		pushi    703
		pushi    25
		pushi    245
		calle    proc999_5,  38
		bnt      code_2c86
		ldi      1
		jmp      code_2c88
code_2c86:
		ldi      0
code_2c88:
		push    
		pushi    518
		pushi    1
		pushi    3
		lsg      global126
		pushi    3
		pushi    2
		calle    proc999_5,  6
		push    
		pushi    516
		pushi    1
		pushi    19
		lst      temp0
		pushi    0
		pushi    1
		pushi    3
		pushi    12
		pushi    13
		pushi    29
		pushi    30
		pushi    245
		pushi    33
		pushi    34
		pushi    23
		pushi    24
		pushi    16
		pushi    17
		pushi    702
		pushi    703
		pushi    25
		pushi    245
		calle    proc999_5,  38
		bnt      code_2cd7
		ldi      1
		jmp      code_2cd9
code_2cd7:
		ldi      0
code_2cd9:
		push    
		pushi    162
		pushi    1
		pushi    65535
		pushi    162
		pushi    1
		lofsa    stopGroop
		push    
		pushi    66
		pushi    1
		pushi    65535
		pushi    150
		pushi    2
		class    StopWalk
		push    
		lst      temp1
		pushi    308
		pushi    2
		pushi    3
		pushi    2
		pushi    18
		pushi    1
		pushi    32768
		pushi    289
		pushi    1
		pushi    0
		pushi    58
		pushi    1
		lst      temp2
		lag      global0
		send     76
		pushi    19
		pushi    #view
		pushi    0
		lag      global0
		send     4
		push    
		pushi    0
		pushi    1
		pushi    3
		pushi    12
		pushi    13
		pushi    29
		pushi    30
		pushi    245
		pushi    33
		pushi    34
		pushi    23
		pushi    24
		pushi    16
		pushi    17
		pushi    702
		pushi    703
		pushi    25
		pushi    245
		calle    proc999_5,  38
		not     
		bnt      code_2d56
		pushi    #dispose
		pushi    0
		lofsa    egoHead
		send     4
		jmp      code_2d81
code_2d56:
		pushi    #contains
		pushi    1
		lofsa    egoHead
		push    
		lag      global5
		send     6
		bnt      code_2d70
		pushi    #normalize
		pushi    0
		lofsa    egoHead
		send     4
		jmp      code_2d81
code_2d70:
		pushi    #contains
		pushi    1
		lsg      global0
		lag      global5
		send     6
		bnt      code_2d81
		pushi    0
		call     localproc_3126,  0
code_2d81:
		pushi    3
		lsg      global126
		pushi    3
		pushi    2
		calle    proc999_5,  6
		not     
		bnt      code_2d9d
		pushi    #dispose
		pushi    0
		lofsa    egoBeard
		send     4
		jmp      code_2dae
code_2d9d:
		pushi    #contains
		pushi    1
		lsg      global0
		lag      global5
		send     6
		bnt      code_2dae
		pushi    0
		call     localproc_3178,  0
code_2dae:
		pushi    3
		lsg      global126
		pushi    0
		pushi    4
		calle    proc999_5,  6
		bnt      code_2dd1
		lag      global143
		not     
		bnt      code_2dd1
		pushi    #enable
		pushi    1
		pushi    4
		lag      global69
		send     6
		jmp      code_2ddb
code_2dd1:
		pushi    #disable
		pushi    1
		pushi    4
		lag      global69
		send     6
code_2ddb:
		ret     
	)
)

(procedure (proc0_3 &tmp temp0)
	(asm
		lag      global143
		bnt      code_2de4
		ret     
code_2de4:
		ldi      1
		sag      global143
		pushi    #canControl
		pushi    1
		pushi    0
		pushi    324
		pushi    1
		pushi    0
		class    User
		send     12
		pushi    #curIcon
		pushi    0
		lag      global69
		send     4
		sat      temp0
		pushi    #egoMoveSpeed
		pushi    0
		lag      global1
		send     4
		sag      global157
		ldi      0
		sag      global165
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    checkIcon
		push    
		lag      global69
		send     8
		pushi    #disable
		pushi    8
		pushi    0
		pushi    1
		pushi    2
		pushi    3
		pushi    4
		pushi    5
		pushi    6
		pushi    7
		lag      global69
		send     20
		pushi    #curIcon
		pushi    1
		lst      temp0
		lag      global69
		send     6
		pushi    0
		callk    HaveMouse,  0
		bnt      code_2e50
		pushi    #setCursor
		pushi    2
		lsg      global21
		pushi    1
		lag      global1
		send     8
		jmp      code_2e80
code_2e50:
		pushi    #x
		pushi    0
		pushi    #curEvent
		pushi    0
		class    User
		send     4
		send     4
		sag      global127
		pushi    #y
		pushi    0
		pushi    #curEvent
		pushi    0
		class    User
		send     4
		send     4
		sag      global128
		pushi    #setCursor
		pushi    4
		lsg      global21
		pushi    1
		pushi    310
		pushi    185
		lag      global1
		send     12
code_2e80:
		ret     
	)
)

(procedure (proc0_4 param1 &tmp temp0 temp1)
	(asm
		lag      global143
		bnt      code_2ea8
		ldi      0
		sag      global143
		pushi    #setSpeed
		pushi    1
		lsg      global157
		lag      global1
		send     6
		lag      global141
		sag      global157
		pushi    #canControl
		pushi    1
		pushi    1
		pushi    324
		pushi    1
		pushi    1
		class    User
		send     12
code_2ea8:
		lap      argc
		bnt      code_2edd
		lap      param1
		bnt      code_2edd
		ldi      0
		sat      temp0
code_2eb6:
		lst      temp0
		ldi      7
		lt?     
		bnt      code_2fc0
		lsg      global165
		pushi    32768
		lat      temp0
		shr     
		and     
		not     
		bnt      code_2ed5
		pushi    #enable
		pushi    1
		lst      temp0
		lag      global69
		send     6
code_2ed5:
		+at      temp0
		jmp      code_2eb6
		jmp      code_2fc0
code_2edd:
		pushi    #curInvIcon
		pushi    0
		lag      global69
		send     4
		bnt      code_2ef9
		pushi    #enable
		pushi    1
		pushi    #useIconItem
		pushi    0
		lag      global69
		send     4
		push    
		lag      global69
		send     6
code_2ef9:
		pushi    #enable
		pushi    5
		pushi    0
		pushi    1
		pushi    2
		pushi    3
		pushi    7
		lag      global69
		send     14
		pushi    3
		lsg      global126
		pushi    0
		pushi    4
		calle    proc999_5,  6
		bnt      code_2f23
		pushi    #enable
		pushi    1
		pushi    4
		lag      global69
		send     6
code_2f23:
		pushi    5
		lsg      global11
		pushi    100
		pushi    260
		pushi    630
		pushi    450
		calle    proc999_5,  10
		bnt      code_2f4f
		pushi    #disable
		pushi    6
		pushi    2
		pushi    3
		pushi    4
		pushi    5
		pushi    6
		pushi    7
		lag      global69
		send     16
code_2f4f:
		pushi    32
		lsg      global11
		pushi    260
		pushi    220
		pushi    110
		pushi    120
		pushi    150
		pushi    180
		pushi    190
		pushi    210
		pushi    250
		pushi    590
		pushi    600
		pushi    580
		pushi    450
		pushi    440
		pushi    350
		pushi    390
		pushi    270
		pushi    280
		pushi    290
		pushi    300
		pushi    310
		pushi    455
		pushi    460
		pushi    470
		pushi    480
		pushi    45
		pushi    640
		pushi    280
		pushi    290
		pushi    300
		pushi    310
		calle    proc999_5,  64
		bnt      code_2fc0
		pushi    #enable
		pushi    1
		pushi    5
		lag      global69
		send     6
code_2fc0:
		pushi    #curInvIcon
		pushi    0
		lag      global69
		send     4
		not     
		bnt      code_2fea
		pushi    #curIcon
		pushi    0
		lag      global69
		send     4
		push    
		pushi    #at
		pushi    1
		pushi    6
		lag      global69
		send     6
		eq?     
		bnt      code_2fea
		pushi    #advanceCurIcon
		pushi    0
		lag      global69
		send     4
code_2fea:
		pushi    0
		callk    HaveMouse,  0
		bnt      code_300a
		pushi    #setCursor
		pushi    1
		pushi    #cursor
		pushi    0
		pushi    #curIcon
		pushi    0
		lag      global69
		send     4
		send     4
		push    
		lag      global1
		send     6
		jmp      code_3026
code_300a:
		pushi    #setCursor
		pushi    4
		pushi    #cursor
		pushi    0
		pushi    #curIcon
		pushi    0
		lag      global69
		send     4
		send     4
		push    
		pushi    1
		lsg      global127
		lsg      global128
		lag      global1
		send     12
code_3026:
		ret     
	)
)

(procedure (proc0_5 param1)
	(asm
		lsp      param1
		ldi      16
		div     
		lsgi     global200
		pushi    32768
		lsp      param1
		ldi      16
		mod     
		shr     
		and     
		ret     
	)
)

(procedure (proc0_6 param1 &tmp temp0)
	(asm
		pushi    1
		lsp      param1
		call     localproc_3027,  2
		sat      temp0
		lsp      param1
		ldi      16
		div     
		lsgi     global200
		pushi    32768
		lsp      param1
		ldi      16
		mod     
		shr     
		or      
		push    
		lsp      param1
		ldi      16
		div     
		sagi     global200
		lat      temp0
		ret     
	)
)

(procedure (proc0_7 param1 &tmp temp0)
	(asm
		pushi    1
		lsp      param1
		call     localproc_3027,  2
		sat      temp0
		lsp      param1
		ldi      16
		div     
		lsgi     global200
		pushi    32768
		lsp      param1
		ldi      16
		mod     
		shr     
		bnot    
		and     
		push    
		lsp      param1
		ldi      16
		div     
		sagi     global200
		lat      temp0
		ret     
	)
)

(procedure (proc0_9 param1 param2 param3 param4 &tmp temp0 temp1 temp2 temp3)
	(asm
		ldi      0
		sat      temp3
		pushi    1
		lsp      param2
		callk    IsObject,  2
		bnt      code_30b8
		pushi    #x
		pushi    0
		lap      param2
		send     4
		sat      temp1
		pushi    #y
		pushi    0
		lap      param2
		send     4
		sat      temp2
		lsp      argc
		ldi      3
		eq?     
		bnt      code_30cc
		lap      param3
		sat      temp3
		jmp      code_30cc
code_30b8:
		lap      param2
		sat      temp1
		lap      param3
		sat      temp2
		lsp      argc
		ldi      4
		eq?     
		bnt      code_30cc
		lap      param4
		sat      temp3
code_30cc:
		pushi    4
		dup     
		pushi    0
		lap      param1
		send     4
		push    
		pushi    #y
		pushi    0
		lap      param1
		send     4
		push    
		lst      temp1
		lst      temp2
		callk    GetAngle,  8
		sat      temp0
		pushi    1
		push    
		pushi    #heading
		pushi    0
		lag      global0
		send     4
		sub     
		push    
		callk    Abs,  2
		push    
		ldi      23
		gt?     
		bnt      code_3114
		pushi    228
		pushi    2
		lst      temp0
		pushi    1
		lst      temp3
		callk    IsObject,  2
		bnt      code_310c
		lat      temp3
code_310c:
		push    
		lap      param1
		send     8
		jmp      code_3125
code_3114:
		pushi    1
		lst      temp3
		callk    IsObject,  2
		bnt      code_3125
		pushi    #cue
		pushi    0
		lat      temp3
		send     4
code_3125:
		ret     
	)
)

(procedure (localproc_3126)
	(asm
		pushi    5
		pushi    1
		pushi    8
		pushi    #view
		pushi    0
		lag      global0
		send     4
		push    
		pushi    1
		pushi    13
		pushi    30
		pushi    34
		pushi    24
		pushi    17
		pushi    703
		calle    proc999_5,  16
		bnt      code_3154
		pushi    #view
		pushi    0
		lag      global0
		send     4
		jmp      code_315f
code_3154:
		pushi    #view
		pushi    0
		lag      global0
		send     4
		push    
		ldi      1
		add     
code_315f:
		push    
		pushi    107
		pushi    1
		lsg      global0
		pushi    219
		pushi    1
		pushi    180
		pushi    524
		pushi    0
		lofsa    egoHead
		sag      global109
		send     22
		ret     
	)
)

(procedure (localproc_3178)
	(asm
		pushi    107
		pushi    1
		lsg      global0
		pushi    5
		pushi    1
		lsg      global126
		ldi      3
		eq?     
		bnt      code_318d
		ldi      77
		jmp      code_318f
code_318d:
		ldi      76
code_318f:
		push    
		lofsa    egoBeard
		sag      global161
		send     12
		ret     
	)
)

(instance ego of rhEgo
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    rhEgo,  4
			pushi    19
			pTos     view
			pushi    0
			pushi    1
			pushi    3
			pushi    12
			pushi    13
			pushi    29
			pushi    30
			pushi    245
			pushi    33
			pushi    34
			pushi    23
			pushi    24
			pushi    16
			pushi    17
			pushi    702
			pushi    703
			pushi    25
			pushi    245
			calle    proc999_5,  38
			bnt      code_0084
			pushi    #contains
			pushi    1
			lofsa    egoHead
			push    
			lag      global5
			send     6
			not     
			bnt      code_0084
			pToa     normal
			bnt      code_0084
			pushi    0
			call     localproc_3126,  0
code_0084:
			pushi    3
			lsg      global126
			pushi    3
			pushi    2
			calle    proc999_5,  6
			bnt      code_00ad
			pushi    #contains
			pushi    1
			lofsa    egoBeard
			push    
			lag      global5
			send     6
			not     
			bnt      code_00ad
			pToa     abnormal
			bnt      code_00ad
			pushi    0
			call     localproc_3178,  0
code_00ad:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			pushi    1
			pushi    804
			callk    ScriptID,  2
			send     8
			ret     
		)
	)
)

(instance egoHead of Head
	(properties
		view 1
	)
)

(instance egoBeard of Beard
	(properties
		view 77
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lag      global0
			send     4
			ret     
		)
	)
)

(instance rgnMusic of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance rgnMusic2 of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance SFX of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance SFX2 of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance moneySound of Sound
	(properties
		flags $0001
		number 914
	)
)

(instance stopGroop of Grooper
	(properties)
	
	(method (doit param1)
		(asm
			pushi    1
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			push    
			callk    IsObject,  2
			bnt      code_0383
			pushi    #isKindOf
			pushi    1
			class    StopWalk
			push    
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			send     6
			bnt      code_0383
			pushi    #view
			pushi    1
			pushi    #vWalking
			pushi    0
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			send     4
			push    
			lag      global0
			send     6
code_0383:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Grooper,  4
			ret     
		)
	)
)

(instance money of Money
	(properties
		view 771
		loop 5
		keepStr 12861
		giveStr 12866
		number 0
		title 12846
	)
	
	(method (doit param1)
		(asm
			pushi    #play
			pushi    0
			lofsa    moneySound
			send     4
			pushi    #doit
			pushi    0
			&rest    param1
			super    Money,  4
			ret     
		)
	)
)

(instance pennies of Denomination
	(properties
		value 4
	)
)

(instance hapennies of Denomination
	(properties
		value 2
	)
)

(instance farthings of Denomination
	(properties)
)

(instance MH of EventHandler
	(properties)
)

(instance KH of EventHandler
	(properties)
)

(instance DH of EventHandler
	(properties)
)

(instance rhWindow of SysWindow
	(properties)
)

(instance statLine of Code
	(properties)
	
	(method (doit &tmp [temp0 70] [temp70 100] [temp170 8] [temp178 12] [temp190 10] [temp200 6] [temp206 4] [temp210 4] [temp214 4] [temp218 4] [temp222 4] temp226)
		(asm
			pushi    2
			lea      @temp170
			push    
			lofsa    {Ransom:_}
			push    
			callk    StrCpy,  4
			pushi    2
			lea      @temp178
			push    
			lofsa    {_____Outlaws:_}
			push    
			callk    StrCpy,  4
			pushi    2
			lea      @temp190
			push    
			lofsa    {_____Score:_}
			push    
			callk    StrCpy,  4
			pushi    4
			lea      @temp200
			push    
			pushi    0
			pushi    0
			lsg      global139
			callk    Format,  8
			pushi    4
			lea      @temp206
			push    
			pushi    0
			pushi    1
			lsg      global138
			callk    Format,  8
			pushi    4
			lea      @temp210
			push    
			pushi    0
			pushi    1
			lsg      global15
			callk    Format,  8
			pushi    2
			lea      @temp214
			push    
			lofsa    { of_}
			push    
			callk    StrCpy,  4
			pushi    4
			lea      @temp218
			push    
			pushi    0
			pushi    1
			lsg      global16
			callk    Format,  8
			pushi    11
			lea      @temp0
			push    
			pushi    0
			pushi    2
			lea      @temp170
			push    
			lea      @temp200
			push    
			lea      @temp178
			push    
			lea      @temp206
			push    
			lea      @temp190
			push    
			lea      @temp210
			push    
			lea      @temp214
			push    
			lea      @temp218
			push    
			callk    Format,  22
			pushi    4
			lea      @temp222
			push    
			lea      @temp0
			push    
			pushi    0
			pushi    65535
			callk    TextSize,  8
			pushi    2
			lea      @temp70
			push    
			lofsa    {}
			push    
			callk    StrCpy,  4
			pushi    326
			ldi      3
			lsti     temp222
			ldi      1
			lati     temp222
			sub     
			sub     
			push    
			ldi      2
			div     
			sat      temp226
code_05fc:
			lst      temp226
			ldi      0
			gt?     
			bnt      code_0615
			pushi    2
			lea      @temp70
			push    
			lofsa    {}
			push    
			callk    StrCat,  4
			-at      temp226
			jmp      code_05fc
code_0615:
			pushi    2
			lea      @temp70
			push    
			lea      @temp0
			push    
			callk    StrCat,  4
			pushi    3
			lea      @temp70
			push    
			lsg      global182
			pushi    0
			callk    DrawStatus,  6
			ret     
		)
	)
)

(instance quitIcon of DCIcon
	(properties
		view 903
		cycleSpeed 18
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    2
			pushSelf
			pushi    1
			pushi    #new
			pushi    0
			class    Osc
			send     4
			aTop     cycler
			send     8
			ret     
		)
	)
)

(instance Longbow of Game
	(properties)
	
	(method (init)
		(asm
			class    StopWalk
			class    PolyPath
			class    Polygon
			pushi    1
			pushi    982
			callk    ScriptID,  2
			pushi    0
			calle    proc802_0,  0
			pushi    #init
			pushi    0
			super    Game,  4
			lofsa    DoVerbCode
			sag      global65
			lofsa    FtrInit
			sag      global64
			pushi    #add
			pushi    0
			lofsa    MH
			sag      global73
			send     4
			pushi    #add
			pushi    0
			lofsa    KH
			sag      global72
			send     4
			pushi    #add
			pushi    0
			lofsa    DH
			sag      global74
			send     4
			pushi    #_head
			pushi    1
			lofsa    egoHead
			sag      global109
			push    
			pushi    517
			pushi    1
			lofsa    egoBeard
			sag      global161
			push    
			lofsa    ego
			sag      global0
			send     12
			pushi    #client
			pushi    1
			lsg      global0
			pushi    #_head
			pushi    0
			lag      global0
			send     4
			send     6
			pushi    #client
			pushi    1
			lsg      global0
			pushi    #beard
			pushi    0
			lag      global0
			send     4
			send     6
			pushi    #alterEgo
			pushi    1
			lsg      global0
			class    User
			send     6
			pushi    #owner
			pushi    1
			pushSelf
			pushi    107
			pushi    0
			lofsa    rgnMusic2
			send     10
			pushi    #owner
			pushi    1
			pushSelf
			pushi    107
			pushi    0
			lofsa    rgnMusic
			send     10
			pushi    #owner
			pushi    1
			pushSelf
			pushi    107
			pushi    0
			lofsa    SFX
			send     10
			pushi    #owner
			pushi    1
			pushSelf
			pushi    107
			pushi    0
			lofsa    SFX2
			send     10
			lofsa    rgnMusic2
			sag      global168
			lofsa    rgnMusic
			sag      global100
			lofsa    SFX
			sag      global113
			lofsa    SFX2
			sag      global114
			pushi    #add
			pushi    10
			lofsa    iconWalk
			push    
			lofsa    iconLook
			push    
			lofsa    iconDo
			push    
			lofsa    iconTalk
			push    
			lofsa    iconBow
			push    
			lofsa    iconMap
			push    
			lofsa    iconUse
			push    
			lofsa    iconInvSel
			push    
			lofsa    iconControl
			push    
			lofsa    iconWhat
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    116
			pushi    2
			pushi    192
			lsg      global184
			pushi    206
			pushi    1
			lofsa    iconWalk
			push    
			pushi    210
			pushi    1
			lofsa    iconUse
			push    
			pushi    211
			pushi    1
			lofsa    iconWhat
			push    
			pushi    201
			pushi    0
			class    IconBar
			sag      global69
			send     60
			pushi    40
			pushi    1
			pushi    0
			callk    HaveMouse,  0
			bnt      code_07d6
			ldi      3840
			jmp      code_07d8
code_07d6:
			ldi      9
code_07d8:
			push    
			lofsa    iconInvSel
			send     6
			pushi    35
			pushi    #superClass
			lofsa    gcWindow
			push    
			pushi    115
			pushi    11
			lofsa    iconOk
			push    
			pushi    #theObj
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    293
			pushi    55
			pushi    1
			pushi    5
			pushi    114
			pushi    0
			lofsa    detailSlider
			send     22
			push    
			pushi    325
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    383
			pushi    498
			pushi    1
			pushi    1
			pushi    3
			callk    DoSound,  2
			push    
			ldi      1
			gt?     
			bnt      code_0829
			ldi      15
			jmp      code_082b
code_0829:
			ldi      1
code_082b:
			push    
			pushi    114
			pushi    0
			lofsa    volumeSlider
			send     22
			push    
			pushi    #theObj
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    380
			pushi    55
			pushi    1
			pushi    5
			pushi    114
			pushi    0
			lofsa    moveSpeedSlider
			send     22
			push    
			pushi    #yStep
			pushi    1
			pushi    5
			pushi    114
			pushi    0
			lofsa    arcadeSlider
			send     10
			push    
			pushi    #theObj
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    78
			pushi    114
			pushi    0
			lofsa    iconSave
			send     16
			push    
			pushi    #theObj
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    79
			pushi    114
			pushi    0
			lofsa    iconRestore
			send     16
			push    
			pushi    #theObj
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    104
			pushi    114
			pushi    0
			lofsa    iconRestart
			send     16
			push    
			pushi    #theObj
			pushi    1
			pushSelf
			pushi    496
			pushi    1
			pushi    103
			pushi    114
			pushi    0
			lofsa    iconQuit
			send     16
			push    
			pushi    #theObj
			pushi    1
			pushi    2
			pushi    809
			pushi    0
			callk    ScriptID,  4
			push    
			pushi    496
			pushi    1
			pushi    60
			pushi    114
			pushi    0
			lofsa    iconAbout
			send     16
			push    
			lofsa    iconHelp
			push    
			pushi    116
			pushi    2
			pushi    192
			lsg      global184
			pushi    211
			pushi    1
			lofsa    iconHelp
			push    
			pushi    206
			pushi    1
			lofsa    iconRestore
			push    
			class    GameControls
			send     52
			pushi    #normalHeading
			pushi    1
			lofsa    {I am carrying}
			push    
			pushi    368
			pushi    1
			lofsa    {nothing.}
			push    
			pushi    107
			pushi    0
			pushi    115
			pushi    24
			lofsa    bucks
			push    
			lofsa    horn
			push    
			lofsa    halfHeart
			push    
			lofsa    slipper
			push    
			lofsa    net
			push    
			lofsa    pipe
			push    
			lofsa    gems
			push    
			lofsa    jewels
			push    
			lofsa    rouge
			push    
			lofsa    message
			push    
			lofsa    fireRing
			push    
			lofsa    cask
			push    
			lofsa    puzzleBox
			push    
			lofsa    robes
			push    
			lofsa    amethyst
			push    
			lofsa    comb
			push    
			lofsa    fulkScroll
			push    
			lofsa    handScroll
			push    
			lofsa    waterRing
			push    
			lofsa    invLook
			push    
			lofsa    invHand
			push    
			lofsa    invSelect
			push    
			lofsa    invHelp
			push    
			lofsa    ok
			push    
			pushi    116
			pushi    2
			pushi    192
			lsg      global184
			pushi    116
			pushi    2
			pushi    193
			lsg      global170
			pushi    35
			pushi    1
			lofsa    invWindow
			push    
			pushi    211
			pushi    1
			lofsa    invHelp
			push    
			pushi    373
			pushi    1
			lofsa    invSelect
			push    
			pushi    372
			pushi    1
			lofsa    ok
			push    
			lag      global9
			send     108
			pushi    #lowlightColor
			pushi    1
			lsg      global187
			pushi    192
			pushi    1
			lsg      global174
			lofsa    invLook
			send     12
			pushi    #lowlightColor
			pushi    1
			lsg      global187
			pushi    192
			pushi    1
			lsg      global174
			lofsa    invHand
			send     12
			pushi    #lowlightColor
			pushi    1
			lsg      global187
			pushi    192
			pushi    1
			lsg      global174
			lofsa    invSelect
			send     12
			pushi    #lowlightColor
			pushi    1
			lsg      global187
			pushi    192
			pushi    1
			lsg      global174
			lofsa    invHelp
			send     12
			pushi    #lowlightColor
			pushi    1
			lsg      global187
			pushi    192
			pushi    1
			lsg      global174
			lofsa    ok
			send     12
			lofsa    farthings
			sag      global135
			lofsa    hapennies
			sag      global134
			lofsa    pennies
			sag      global133
			pushi    #color
			pushi    1
			lsg      global184
			pushi    155
			pushi    1
			lsg      global0
			pushi    107
			pushi    3
			push    
			lsg      global134
			lsg      global135
			lofsa    money
			sag      global152
			send     22
			pushi    #doit
			pushi    3
			lofsa    rhWindow
			push    
			lofsa    gcWindow
			push    
			lofsa    invWindow
			push    
			pushi    2
			pushi    808
			pushi    0
			callk    ScriptID,  4
			send     10
			ret     
		)
	)
	
	(method (replay)
		(asm
			pushi    #doit
			pushi    0
			lofsa    statLine
			send     4
			pushi    #replay
			pushi    0
			super    Game,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			lag      global25
			bnt      code_0bd7
			pushi    #dispose
			pushi    0
			send     4
code_0bd7:
			pushi    #newRoom
			pushi    0
			&rest    newRoomNumber
			super    Game,  4
			ret     
		)
	)
	
	(method (startRoom param1)
		(asm
			pushi    #doit
			pushi    1
			lsp      param1
			pushi    2
			pushi    808
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #startRoom
			pushi    1
			lsp      param1
			super    Game,  6
			pushi    6
			lsp      param1
			pushi    97
			pushi    98
			pushi    96
			pushi    95
			pushi    803
			calle    proc999_5,  12
			not     
			bnt      code_0c1a
			pushi    #doit
			pushi    0
			lofsa    statLine
			send     4
code_0c1a:
			pushi    #controls
			pushi    0
			class    User
			send     4
			bnt      code_0c46
			pushi    #input
			pushi    0
			class    User
			send     4
			bnt      code_0c46
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			lag      global1
			send     6
code_0c46:
			ret     
		)
	)
	
	(method (restart &tmp temp0)
		(asm
			pushi    1
			lsg      global25
			callk    IsObject,  2
			bnt      code_0a82
			pushi    1
			pushi    #caller
			pushi    0
			lag      global25
			send     4
			sat      temp0
			push    
			callk    IsObject,  2
			bnt      code_0a7b
			pushi    #caller
			pushi    1
			pushi    0
			lag      global25
			send     6
code_0a7b:
			pushi    #dispose
			pushi    0
			lag      global25
			send     4
code_0a82:
			pushi    16
			pushi    0
			pushi    3
			pushi    80
			lofsa    {RESTART}
			push    
			pushi    30
			pushi    1
			pushi    81
			lofsa    {Aye, start from scratch.}
			push    
			pushi    1
			pushi    81
			lofsa    {Nay, go back to where I was.}
			push    
			pushi    2
			pushi    82
			lofsa    quitIcon
			push    
			pushi    1
			pushi    0
			calle    proc255_0,  32
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0abb
			pushi    #restart
			pushi    0
			super    Game,  4
			jmp      code_0ad4
code_0abb:
			dup     
			ldi      2
			eq?     
			bnt      code_0ad4
			pushi    1
			lst      temp0
			callk    IsObject,  2
			bnt      code_0ad3
			pushi    #cue
			pushi    0
			lat      temp0
			send     4
code_0ad3:
			ret     
code_0ad4:
			toss    
			jmp      code_0a82
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp [temp0 2] [temp2 10])
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0e84
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      9
			eq?     
			bnt      code_0c8b
			lag      global143
			bt       code_0c7d
			pushi    #signal
			pushi    0
			pushi    #at
			pushi    1
			pushi    7
			lag      global69
			send     6
			send     4
			push    
			ldi      4
			and     
code_0c7d:
			not     
			bnt      code_0e83
			pushi    #showSelf
			pushi    0
			lag      global9
			send     4
			jmp      code_0e83
code_0c8b:
			dup     
			ldi      3840
			eq?     
			bnt      code_0cb8
			lag      global143
			bt       code_0caa
			pushi    #signal
			pushi    0
			pushi    #at
			pushi    1
			pushi    7
			lag      global69
			send     6
			send     4
			push    
			ldi      4
			and     
code_0caa:
			not     
			bnt      code_0e83
			pushi    #showSelf
			pushi    0
			lag      global9
			send     4
			jmp      code_0e83
code_0cb8:
			dup     
			ldi      17
			eq?     
			bnt      code_0cd1
			pushi    #quitGame
			pushi    0
			lag      global1
			send     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0e83
code_0cd1:
			dup     
			ldi      15360
			eq?     
			bnt      code_0d19
			pushi    #masterVolume
			pushi    0
			lag      global1
			send     4
			bnt      code_0cf0
			pushi    #masterVolume
			pushi    1
			pushi    0
			lag      global1
			send     6
			jmp      code_0d0e
code_0cf0:
			lsg      global103
			ldi      1
			gt?     
			bnt      code_0d05
			pushi    #masterVolume
			pushi    1
			pushi    15
			lag      global1
			send     6
			jmp      code_0d0e
code_0d05:
			pushi    #masterVolume
			pushi    1
			pushi    1
			lag      global1
			send     6
code_0d0e:
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0e83
code_0d19:
			dup     
			ldi      16128
			eq?     
			bnt      code_0d6b
			pushi    #signal
			pushi    0
			pushi    #at
			pushi    1
			pushi    8
			lag      global69
			send     6
			send     4
			push    
			ldi      4
			and     
			bt       code_0d41
			pushi    #state
			pushi    0
			lag      global69
			send     4
			push    
			ldi      4
			and     
code_0d41:
			not     
			bnt      code_0e83
			pushi    1
			lsg      global84
			callk    IsObject,  2
			bnt      code_0d59
			pushi    #elements
			pushi    0
			lag      global84
			send     4
			bnt      code_0d59
			ret     
code_0d59:
			pushi    #save
			pushi    0
			lag      global1
			send     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0e83
code_0d6b:
			dup     
			ldi      16640
			eq?     
			bnt      code_0dbd
			pushi    #signal
			pushi    0
			pushi    #at
			pushi    1
			pushi    8
			lag      global69
			send     6
			send     4
			push    
			ldi      4
			and     
			bt       code_0d93
			pushi    #state
			pushi    0
			lag      global69
			send     4
			push    
			ldi      4
			and     
code_0d93:
			not     
			bnt      code_0e83
			pushi    1
			lsg      global84
			callk    IsObject,  2
			bnt      code_0dab
			pushi    #elements
			pushi    0
			lag      global84
			send     4
			bnt      code_0dab
			ret     
code_0dab:
			pushi    #restore
			pushi    0
			lag      global1
			send     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0e83
code_0dbd:
			dup     
			ldi      17152
			eq?     
			bnt      code_0dd7
			pushi    #restart
			pushi    0
			lag      global1
			send     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0e83
code_0dd7:
			dup     
			ldi      43
			eq?     
			bnt      code_0e0a
			pushi    #controls
			pushi    0
			class    User
			send     4
			bnt      code_0e83
			pushi    380
			pushi    #superClass
			pushi    2
			pushi    1
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			push    
			ldi      1
			sub     
			push    
			calle    proc999_3,  4
			push    
			lag      global1
			send     6
			jmp      code_0e83
code_0e0a:
			dup     
			ldi      45
			eq?     
			bnt      code_0e34
			pushi    #controls
			pushi    0
			class    User
			send     4
			bnt      code_0e83
			pushi    380
			pushi    #superClass
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global1
			send     6
			jmp      code_0e83
code_0e34:
			dup     
			ldi      61
			eq?     
			bnt      code_0e53
			pushi    #controls
			pushi    0
			class    User
			send     4
			bnt      code_0e83
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			jmp      code_0e83
code_0e53:
			pushi    4
			lea      @temp2
			push    
			pushi    0
			pushi    6
			pushi    800
			callk    Format,  8
			lag      global102
			bnt      code_0e83
			pushi    2
			pushi    10
			lea      @temp2
			push    
			callk    FileIO,  4
			bnt      code_0e83
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			pushi    1
			pushi    800
			callk    ScriptID,  2
			send     6
code_0e83:
			toss    
code_0e84:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_0e98
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Game,  6
code_0e98:
			ret     
		)
	)
	
	(method (setSpeed newSpeed)
		(asm
			lap      argc
			bnt      code_0a43
			pushi    #moveSpeed
			pushi    1
			lap      newSpeed
			aTop     egoMoveSpeed
			push    
			pushi    219
			pushi    1
			push    
			lag      global0
			send     12
code_0a43:
			pToa     egoMoveSpeed
			ret     
		)
	)
	
	(method (quitGame)
		(asm
			pushi    103
			pushi    1
			lsg      global11
			ldi      97
			eq?     
			bnt      code_0b0c
			pushi    14
			pushi    0
			pushi    4
			pushi    80
			lofsa    {QUIT}
			push    
			pushi    81
			lofsa    {Farewell, I must go.}
			push    
			pushi    1
			pushi    81
			lofsa    {Let me tarry here a while longer.}
			push    
			pushi    0
			pushi    82
			lofsa    quitIcon
			push    
			pushi    0
			pushi    0
			calle    proc255_0,  28
			jmp      code_0b31
code_0b0c:
			pushi    14
			pushi    0
			pushi    5
			pushi    80
			lofsa    {QUIT}
			push    
			pushi    81
			lofsa    {Farewell, I must go.}
			push    
			pushi    1
			pushi    81
			lofsa    {Let me tarry here a while longer.}
			push    
			pushi    0
			pushi    82
			lofsa    quitIcon
			push    
			pushi    0
			pushi    0
			calle    proc255_0,  28
code_0b31:
			push    
			super    Game,  6
			ret     
		)
	)
	
	(method (pragmaFail &tmp temp0 [temp1 31])
		(asm
			lag      global25
			bnt      code_0b45
			pushi    #dispose
			pushi    0
			send     4
			ldi      1
			ret     
code_0b45:
			pushi    #canInput
			pushi    0
			class    User
			send     4
			bnt      code_0bcc
			pushi    #message
			pushi    0
			pushi    #curEvent
			pushi    0
			class    User
			send     4
			send     4
			sat      temp0
			push    
			dup     
			ldi      2
			eq?     
			bnt      code_0b76
			pushi    3
			pushi    1000
			pushi    75
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bcb
code_0b76:
			dup     
			ldi      3
			eq?     
			bnt      code_0b8c
			pushi    3
			pushi    1000
			pushi    76
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bcb
code_0b8c:
			dup     
			ldi      5
			eq?     
			bnt      code_0ba2
			pushi    3
			pushi    1000
			pushi    77
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bcb
code_0ba2:
			dup     
			ldi      10
			eq?     
			bnt      code_0bb8
			pushi    3
			pushi    1000
			pushi    78
			pushi    1
			calle    proc13_4,  6
			jmp      code_0bcb
code_0bb8:
			dup     
			ldi      4
			eq?     
			bnt      code_0bcb
			pushi    3
			pushi    1000
			pushi    79
			pushi    1
			calle    proc13_4,  6
code_0bcb:
			toss    
code_0bcc:
			ret     
		)
	)
)

(instance iconWalk of RhIconItem
	(properties
		view 781
		loop 0
		cel 0
		cursor 0
		message 1
		signal $0041
		helpStr 13132
		maskView 781
		maskLoop 10
	)
)

(instance iconLook of RhIconItem
	(properties
		view 781
		loop 1
		cel 0
		cursor 1
		message 2
		signal $0041
		helpStr 13167
		maskView 781
		maskLoop 10
	)
)

(instance iconDo of RhIconItem
	(properties
		view 781
		loop 2
		cel 0
		cursor 2
		message 3
		signal $0041
		helpStr 13202
		maskView 781
		maskLoop 10
	)
)

(instance iconTalk of RhIconItem
	(properties
		view 781
		loop 3
		cel 0
		cursor 3
		message 5
		signal $0041
		helpStr 13233
		maskView 781
		maskLoop 10
	)
)

(instance iconBow of RhIconItem
	(properties
		view 781
		loop 4
		cel 0
		cursor 4
		message 10
		signal $0041
		helpStr 13268
		maskView 781
		maskLoop 10
	)
)

(instance iconMap of RhIconItem
	(properties
		view 781
		loop 5
		cel 0
		cursor 5
		message 11
		signal $0043
		helpStr 13313
		maskView 781
		maskLoop 10
	)
	
	(method (select param1)
		(asm
			pushi    #select
			pushi    0
			&rest    param1
			super    RhIconItem,  4
			bnt      code_1108
			lsg      global11
			ldi      220
			eq?     
			bnt      code_1046
			pushi    1
			pushi    170
			call     localproc_3039,  2
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_1108
code_1046:
			pushi    13
			lsg      global11
			pushi    260
			pushi    220
			pushi    110
			pushi    120
			pushi    150
			pushi    180
			pushi    190
			pushi    210
			pushi    250
			pushi    590
			pushi    600
			pushi    580
			calle    proc999_5,  26
			bnt      code_1082
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_1108
code_1082:
			pushi    10
			lsg      global11
			pushi    450
			pushi    440
			pushi    350
			pushi    390
			pushi    270
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  20
			bnt      code_10b8
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
			jmp      code_1108
code_10b8:
			pushi    6
			lsg      global11
			pushi    455
			pushi    460
			pushi    470
			pushi    480
			pushi    45
			calle    proc999_5,  12
			bnt      code_10e1
			pushi    #newRoom
			pushi    1
			pushi    450
			lag      global2
			send     6
			jmp      code_1108
code_10e1:
			pushi    2
			lsg      global11
			pushi    640
			calle    proc999_5,  4
			bnt      code_10fe
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
			jmp      code_1108
code_10fe:
			pushi    2
			pushi    1000
			pushi    6
			calle    proc13_4,  4
code_1108:
			ret     
		)
	)
)

(instance iconUse of RhIconItem
	(properties
		view 781
		loop 6
		cel 0
		cursor 999
		message 4
		signal $0041
		helpStr 13362
		maskView 781
		maskLoop 10
		maskCel 1
	)
)

(instance iconInvSel of RhIconItem
	(properties
		view 781
		loop 7
		cel 0
		cursor 2
		type $0000
		message 0
		signal $0043
		helpStr 13416
		maskView 781
		maskLoop 10
	)
	
	(method (select param1)
		(asm
			pushi    #select
			pushi    0
			&rest    param1
			super    RhIconItem,  4
			bnt      code_11a1
			pushi    #showSelf
			pushi    0
			lag      global9
			send     4
code_11a1:
			ret     
		)
	)
)

(instance iconControl of RhIconItem
	(properties
		view 781
		loop 8
		cel 0
		cursor 999
		signal $0043
		helpStr 13469
		maskView 781
		maskLoop 10
	)
	
	(method (select param1)
		(asm
			pushi    #select
			pushi    0
			&rest    param1
			super    RhIconItem,  4
			bnt      code_1209
			pushi    #hide
			pushi    0
			lag      global69
			send     4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #show
			pushi    0
			class    GameControls
			send     4
code_1209:
			ret     
		)
	)
)

(instance iconWhat of RhIconItem
	(properties
		view 781
		loop 9
		cel 0
		cursor 6
		message 6
		signal $0003
		helpStr 13520
		maskView 781
		maskLoop 10
	)
)

(instance ok of IconI
	(properties
		view 900
		loop 3
		cel 0
		nsLeft 40
		cursor 999
		signal $0043
		helpStr 13587
		lowlightColor 5
	)
	
	(method (select param1)
		(asm
			pushi    #select
			pushi    0
			&rest    param1
			super    IconI,  4
			bnt      code_1339
			pushi    #cel
			pushi    0
			lofsa    gems
			send     4
			not     
			bnt      code_12ba
			pushi    #owner
			pushi    1
			lsg      global0
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    7
			lofsa    gems
			send     18
code_12ba:
			pushi    #cel
			pushi    0
			lofsa    fulkScroll
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_12d2
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    fulkScroll
			send     6
code_12d2:
			pushi    #cel
			pushi    0
			lofsa    handScroll
			send     4
			push    
			ldi      5
			eq?     
			bnt      code_12eb
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    handScroll
			send     6
code_12eb:
			pushi    #cel
			pushi    0
			lofsa    message
			send     4
			push    
			ldi      7
			eq?     
			bnt      code_1304
			pushi    #cel
			pushi    1
			pushi    6
			lofsa    message
			send     6
code_1304:
			pushi    #cel
			pushi    0
			lofsa    rouge
			send     4
			push    
			ldi      14
			eq?     
			bnt      code_131d
			pushi    #cel
			pushi    1
			pushi    13
			lofsa    rouge
			send     6
code_131d:
			pushi    #loop
			pushi    0
			lofsa    jewels
			send     4
			bnt      code_1336
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    15
			lofsa    jewels
			send     12
code_1336:
			ldi      1
			ret     
code_1339:
			ret     
		)
	)
)

(instance invLook of IconI
	(properties
		view 900
		loop 2
		cel 0
		cursor 1
		message 2
		helpStr 13635
		lowlightColor 5
	)
)

(instance invHand of IconI
	(properties
		view 900
		loop 0
		cel 0
		cursor 2
		message 3
		helpStr 13721
		lowlightColor 5
	)
)

(instance invHelp of IconI
	(properties
		view 900
		loop 1
		cel 0
		cursor 6
		message 6
		lowlightColor 5
	)
)

(instance invSelect of IconI
	(properties
		view 900
		loop 4
		cel 0
		cursor 999
		helpStr 13830
		lowlightColor 5
	)
)

(instance bucks of InvI
	(properties
		view 771
		loop 2
		cel 3
		cursor 104
		signal $0002
	)
	
	(method (doVerb theVerb &tmp [temp0 12] [temp12 15] [temp27 15] [temp42 3] [temp45 6] [temp51 55])
		(asm
			pushi    #number
			pushi    0
			lag      global133
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1498
			pushi    3
			lea      @temp0
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			jmp      code_14c2
code_1498:
			dup     
			ldi      1
			eq?     
			bnt      code_14ae
			pushi    3
			lea      @temp0
			push    
			pushi    0
			pushi    8
			callk    Format,  6
			jmp      code_14c2
code_14ae:
			pushi    4
			lea      @temp0
			push    
			pushi    0
			pushi    9
			pushi    #number
			pushi    0
			lag      global133
			send     4
			push    
			callk    Format,  8
code_14c2:
			toss    
			pushi    #number
			pushi    0
			lag      global134
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14e1
			pushi    3
			lea      @temp12
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			jmp      code_150b
code_14e1:
			dup     
			ldi      1
			eq?     
			bnt      code_14f7
			pushi    3
			lea      @temp12
			push    
			pushi    0
			pushi    10
			callk    Format,  6
			jmp      code_150b
code_14f7:
			pushi    4
			lea      @temp12
			push    
			pushi    0
			pushi    11
			pushi    #number
			pushi    0
			lag      global134
			send     4
			push    
			callk    Format,  8
code_150b:
			toss    
			pushi    #number
			pushi    0
			lag      global135
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_152a
			pushi    3
			lea      @temp27
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			jmp      code_1554
code_152a:
			dup     
			ldi      1
			eq?     
			bnt      code_1540
			pushi    3
			lea      @temp27
			push    
			pushi    0
			pushi    12
			callk    Format,  6
			jmp      code_1554
code_1540:
			pushi    4
			lea      @temp27
			push    
			pushi    0
			pushi    13
			pushi    #number
			pushi    0
			lag      global135
			send     4
			push    
			callk    Format,  8
code_1554:
			toss    
			pushi    #number
			pushi    0
			lag      global133
			send     4
			bnt      code_158e
			pushi    #number
			pushi    0
			lag      global134
			send     4
			bnt      code_158e
			pushi    #number
			pushi    0
			lag      global135
			send     4
			bnt      code_158e
			pushi    3
			lea      @temp42
			push    
			pushi    0
			pushi    14
			callk    Format,  6
			pushi    3
			lea      @temp45
			push    
			pushi    0
			pushi    15
			callk    Format,  6
			jmp      code_1654
code_158e:
			pushi    #number
			pushi    0
			lag      global133
			send     4
			bnt      code_15c8
			pushi    #number
			pushi    0
			lag      global134
			send     4
			bnt      code_15c8
			pushi    #number
			pushi    0
			lag      global135
			send     4
			not     
			bnt      code_15c8
			pushi    3
			lea      @temp42
			push    
			pushi    0
			pushi    16
			callk    Format,  6
			pushi    3
			lea      @temp45
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			jmp      code_1654
code_15c8:
			pushi    #number
			pushi    0
			lag      global133
			send     4
			bnt      code_1602
			pushi    #number
			pushi    0
			lag      global134
			send     4
			not     
			bnt      code_1602
			pushi    #number
			pushi    0
			lag      global135
			send     4
			bnt      code_1602
			pushi    3
			lea      @temp42
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			pushi    3
			lea      @temp45
			push    
			pushi    0
			pushi    16
			callk    Format,  6
			jmp      code_1654
code_1602:
			pushi    #number
			pushi    0
			lag      global133
			send     4
			not     
			bnt      code_163c
			pushi    #number
			pushi    0
			lag      global134
			send     4
			bnt      code_163c
			pushi    #number
			pushi    0
			lag      global135
			send     4
			bnt      code_163c
			pushi    3
			lea      @temp42
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			pushi    3
			lea      @temp45
			push    
			pushi    0
			pushi    16
			callk    Format,  6
			jmp      code_1654
code_163c:
			pushi    3
			lea      @temp42
			push    
			pushi    0
			pushi    7
			callk    Format,  6
			pushi    3
			lea      @temp45
			push    
			pushi    0
			pushi    7
			callk    Format,  6
code_1654:
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1686
			pushi    1
			pushi    8
			lea      @temp51
			push    
			pushi    0
			pushi    17
			lea      @temp0
			push    
			lea      @temp42
			push    
			lea      @temp12
			push    
			lea      @temp45
			push    
			lea      @temp27
			push    
			callk    Format,  16
			push    
			calle    proc13_1,  2
			jmp      code_16a3
code_1686:
			dup     
			ldi      3
			eq?     
			bnt      code_169a
			pushi    2
			pushi    1000
			pushi    16
			calle    proc13_4,  4
			jmp      code_16a3
code_169a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    InvI,  6
code_16a3:
			toss    
			ret     
		)
	)
)

(instance horn of InvI
	(properties
		view 771
		loop 2
		cel 5
		cursor 100
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_170a
			pushi    2
			pushi    1000
			pushi    17
			calle    proc13_4,  4
			jmp      code_171b
code_170a:
			dup     
			ldi      3
			eq?     
			bnt      code_171b
			pushi    2
			pushi    1000
			pushi    18
			calle    proc13_4,  4
code_171b:
			toss    
			ret     
		)
	)
)

(instance halfHeart of InvI
	(properties
		view 771
		cel 10
		cursor 127
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1782
			pushi    2
			pushi    1000
			pushi    19
			calle    proc13_4,  4
			jmp      code_1793
code_1782:
			dup     
			ldi      3
			eq?     
			bnt      code_1793
			pushi    2
			pushi    1000
			pushi    20
			calle    proc13_4,  4
code_1793:
			toss    
			ret     
		)
	)
)

(instance slipper of InvI
	(properties
		view 771
		cel 12
		cursor 121
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_17fa
			pushi    2
			pushi    1000
			pushi    21
			calle    proc13_4,  4
			jmp      code_180b
code_17fa:
			dup     
			ldi      3
			eq?     
			bnt      code_180b
			pushi    2
			pushi    1000
			pushi    22
			calle    proc13_4,  4
code_180b:
			toss    
			ret     
		)
	)
)

(instance net of InvI
	(properties
		view 771
		cursor 102
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1872
			pushi    2
			pushi    1000
			pushi    23
			calle    proc13_4,  4
			jmp      code_1883
code_1872:
			dup     
			ldi      3
			eq?     
			bnt      code_1883
			pushi    2
			pushi    1000
			pushi    24
			calle    proc13_4,  4
code_1883:
			toss    
			ret     
		)
	)
)

(instance pipe of InvI
	(properties
		view 771
		cel 1
		cursor 130
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_18ea
			pushi    2
			pushi    1000
			pushi    25
			calle    proc13_4,  4
			jmp      code_18fb
code_18ea:
			dup     
			ldi      3
			eq?     
			bnt      code_18fb
			pushi    2
			pushi    1000
			pushi    26
			calle    proc13_4,  4
code_18fb:
			toss    
			ret     
		)
	)
)

(instance gems of InvI
	(properties
		view 771
		loop 2
		cel 7
		cursor 120
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1977
			pTos     loop
			ldi      2
			eq?     
			bnt      code_196a
			pushi    2
			pushi    1000
			pushi    27
			calle    proc13_4,  4
			jmp      code_19c3
code_196a:
			pushi    2
			pushi    1000
			pushi    28
			calle    proc13_4,  4
			jmp      code_19c3
code_1977:
			dup     
			ldi      3
			eq?     
			bnt      code_19c3
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pToa     cel
			bnt      code_19a8
			pushi    #owner
			pushi    1
			lsg      global1
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			self     18
			pushi    #show
			pushi    1
			lsg      global1
			lag      global9
			send     6
			jmp      code_19c3
code_19a8:
			pushi    #owner
			pushi    1
			lsg      global0
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    7
			self     18
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
code_19c3:
			toss    
			ret     
		)
	)
)

(instance jewels of InvI
	(properties
		view 771
		cel 15
		cursor 132
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a3c
			pToa     loop
			bnt      code_1a2f
			pushi    2
			pushi    1000
			pushi    29
			calle    proc13_4,  4
			jmp      code_1a80
code_1a2f:
			pushi    2
			pushi    1000
			pushi    30
			calle    proc13_4,  4
			jmp      code_1a80
code_1a3c:
			dup     
			ldi      3
			eq?     
			bnt      code_1a80
			pToa     loop
			bnt      code_1a5d
			pushi    2
			pushi    1000
			pushi    31
			calle    proc13_4,  4
			ldi      0
			aTop     loop
			ldi      15
			aTop     cel
			jmp      code_1a6f
code_1a5d:
			pushi    2
			pushi    1000
			pushi    32
			calle    proc13_4,  4
			ldi      2
			aTop     loop
			ldi      1
			aTop     cel
code_1a6f:
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
code_1a80:
			toss    
			ret     
		)
	)
)

(instance rouge of InvI
	(properties
		view 771
		cel 13
		cursor 131
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1afb
			pTos     cel
			ldi      13
			eq?     
			bnt      code_1aee
			pushi    2
			pushi    1000
			pushi    33
			calle    proc13_4,  4
			jmp      code_1b24
code_1aee:
			pushi    2
			pushi    1000
			pushi    34
			calle    proc13_4,  4
			jmp      code_1b24
code_1afb:
			dup     
			ldi      3
			eq?     
			bnt      code_1b24
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pTos     cel
			ldi      13
			eq?     
			bnt      code_1b16
			ldi      14
			jmp      code_1b18
code_1b16:
			ldi      13
code_1b18:
			aTop     cel
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
code_1b24:
			toss    
			ret     
		)
	)
)

(instance message of InvI
	(properties
		view 771
		cel 6
		cursor 123
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1b9f
			pTos     cel
			ldi      6
			eq?     
			bnt      code_1b92
			pushi    2
			pushi    1000
			pushi    35
			calle    proc13_4,  4
			jmp      code_1bde
code_1b92:
			pushi    2
			pushi    1000
			pushi    36
			calle    proc13_4,  4
			jmp      code_1bde
code_1b9f:
			dup     
			ldi      3
			eq?     
			bnt      code_1bde
			pTos     cel
			ldi      6
			eq?     
			bnt      code_1bbf
			pushi    2
			pushi    1000
			pushi    37
			calle    proc13_4,  4
			ldi      7
			aTop     cel
			jmp      code_1bcd
code_1bbf:
			pushi    2
			pushi    1000
			pushi    38
			calle    proc13_4,  4
			ldi      6
			aTop     cel
code_1bcd:
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
code_1bde:
			toss    
			ret     
		)
	)
)

(instance fireRing of InvI
	(properties
		view 771
		cel 11
		cursor 101
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1c44
			pushi    2
			pushi    1000
			pushi    39
			calle    proc13_4,  4
			jmp      code_1cd1
code_1c44:
			dup     
			ldi      3
			eq?     
			bnt      code_1cd1
			lsg      global115
			dup     
			ldi      0
			eq?     
			bnt      code_1c86
			pushi    2
			pushi    1000
			pushi    40
			calle    proc13_4,  4
			ldi      2
			sag      global115
			pushi    1
			pushi    168
			call     localproc_3039,  2
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			ldi      8
			aTop     cel
			ldi      2
			aTop     loop
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
			jmp      code_1cd0
code_1c86:
			dup     
			ldi      2
			eq?     
			bnt      code_1cbf
			pushi    2
			pushi    1000
			pushi    41
			calle    proc13_4,  4
			ldi      0
			sag      global115
			pushi    1
			pushi    168
			call     localproc_3060,  2
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			ldi      11
			aTop     cel
			ldi      0
			aTop     loop
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
			jmp      code_1cd0
code_1cbf:
			dup     
			ldi      1
			eq?     
			bnt      code_1cd0
			pushi    2
			pushi    1000
			pushi    42
			calle    proc13_4,  4
code_1cd0:
			toss    
code_1cd1:
			toss    
			ret     
		)
	)
)

(instance cask of InvI
	(properties
		view 771
		loop 2
		cel 4
		cursor 128
		signal $0002
		owner 460
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1d38
			pushi    2
			pushi    1000
			pushi    43
			calle    proc13_4,  4
			jmp      code_1d49
code_1d38:
			dup     
			ldi      3
			eq?     
			bnt      code_1d49
			pushi    2
			pushi    1000
			pushi    44
			calle    proc13_4,  4
code_1d49:
			toss    
			ret     
		)
	)
)

(instance puzzleBox of InvI
	(properties
		view 771
		loop 2
		cel 6
		cursor 126
		signal $0002
		owner 460
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1db0
			pushi    2
			pushi    1000
			pushi    45
			calle    proc13_4,  4
			jmp      code_1dcf
code_1db0:
			dup     
			ldi      3
			eq?     
			bnt      code_1dcf
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    853
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global1
			send     6
code_1dcf:
			toss    
			ret     
		)
	)
)

(instance robes of InvI
	(properties
		view 771
		loop 2
		cursor 125
		signal $0002
		owner 455
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1e36
			pushi    2
			pushi    1000
			pushi    46
			calle    proc13_4,  4
			jmp      code_1e47
code_1e36:
			dup     
			ldi      3
			eq?     
			bnt      code_1e47
			pushi    2
			pushi    1000
			pushi    47
			calle    proc13_4,  4
code_1e47:
			toss    
			ret     
		)
	)
)

(instance amethyst of InvI
	(properties
		view 771
		cel 9
		cursor 129
		signal $0002
		owner 540
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1eae
			pushi    2
			pushi    1000
			pushi    48
			calle    proc13_4,  4
			jmp      code_1ebf
code_1eae:
			dup     
			ldi      3
			eq?     
			bnt      code_1ebf
			pushi    2
			pushi    1000
			pushi    49
			calle    proc13_4,  4
code_1ebf:
			toss    
			ret     
		)
	)
)

(instance comb of InvI
	(properties
		view 771
		cel 8
		cursor 124
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1f26
			pushi    2
			pushi    1000
			pushi    50
			calle    proc13_4,  4
			jmp      code_1f37
code_1f26:
			dup     
			ldi      3
			eq?     
			bnt      code_1f37
			pushi    2
			pushi    1000
			pushi    51
			calle    proc13_4,  4
code_1f37:
			toss    
			ret     
		)
	)
)

(instance fulkScroll of InvI
	(properties
		view 771
		cel 2
		cursor 133
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1fc2
			pTos     cel
			ldi      2
			eq?     
			bnt      code_1fa6
			pushi    2
			pushi    1000
			pushi    52
			calle    proc13_4,  4
			jmp      code_201b
code_1fa6:
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    806
			pushi    7
			callk    ScriptID,  4
			push    
			lag      global1
			send     6
			jmp      code_201b
code_1fc2:
			dup     
			ldi      3
			eq?     
			bnt      code_201b
			pushi    #contains
			pushi    1
			pushi    625
			lag      global6
			send     6
			bnt      code_1fe3
			pushi    2
			pushi    1000
			pushi    53
			calle    proc13_4,  4
			jmp      code_201b
code_1fe3:
			pTos     cel
			ldi      2
			eq?     
			bnt      code_1ffc
			ldi      3
			aTop     cel
			pushi    2
			pushi    1000
			pushi    54
			calle    proc13_4,  4
			jmp      code_200a
code_1ffc:
			ldi      2
			aTop     cel
			pushi    2
			pushi    1000
			pushi    55
			calle    proc13_4,  4
code_200a:
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
code_201b:
			toss    
			ret     
		)
	)
)

(instance handScroll of InvI
	(properties
		view 771
		cel 4
		cursor 122
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2097
			pTos     cel
			ldi      4
			eq?     
			bnt      code_208a
			pushi    2
			pushi    1000
			pushi    56
			calle    proc13_4,  4
			jmp      code_20f0
code_208a:
			pushi    2
			pushi    1000
			pushi    57
			calle    proc13_4,  4
			jmp      code_20f0
code_2097:
			dup     
			ldi      3
			eq?     
			bnt      code_20f0
			pushi    #contains
			pushi    1
			pushi    625
			lag      global6
			send     6
			bnt      code_20b8
			pushi    2
			pushi    1000
			pushi    58
			calle    proc13_4,  4
			jmp      code_20f0
code_20b8:
			pTos     cel
			ldi      4
			eq?     
			bnt      code_20d1
			pushi    2
			pushi    1000
			pushi    59
			calle    proc13_4,  4
			ldi      5
			aTop     cel
			jmp      code_20df
code_20d1:
			pushi    2
			pushi    1000
			pushi    60
			calle    proc13_4,  4
			ldi      4
			aTop     cel
code_20df:
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
code_20f0:
			toss    
			ret     
		)
	)
)

(instance waterRing of InvI
	(properties
		view 771
		loop 2
		cel 2
		cursor 101
		signal $0002
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2156
			pushi    2
			pushi    1000
			pushi    61
			calle    proc13_4,  4
			jmp      code_21d1
code_2156:
			dup     
			ldi      3
			eq?     
			bnt      code_21d1
			lsg      global115
			dup     
			ldi      0
			eq?     
			bnt      code_2190
			pushi    2
			pushi    1000
			pushi    62
			calle    proc13_4,  4
			ldi      1
			sag      global115
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			ldi      9
			aTop     cel
			ldi      2
			aTop     loop
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
			jmp      code_21d0
code_2190:
			dup     
			ldi      1
			eq?     
			bnt      code_21bf
			pushi    2
			pushi    1000
			pushi    63
			calle    proc13_4,  4
			ldi      0
			sag      global115
			pushi    #hide
			pushi    0
			lag      global9
			send     4
			ldi      2
			aTop     cel
			aTop     loop
			pushi    #show
			pushi    1
			lsg      global0
			lag      global9
			send     6
			jmp      code_21d0
code_21bf:
			dup     
			ldi      2
			eq?     
			bnt      code_21d0
			pushi    2
			pushi    1000
			pushi    64
			calle    proc13_4,  4
code_21d0:
			toss    
code_21d1:
			toss    
			ret     
		)
	)
)

(instance detailSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 89
		nsTop 49
		signal $0080
		helpStr 14034
		sliderView 950
		topValue 3
	)
)

(instance volumeSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 135
		nsTop 49
		signal $0080
		helpStr 14204
		sliderView 950
		topValue 15
	)
)

(instance moveSpeedSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 181
		nsTop 49
		signal $0080
		helpStr 14315
		sliderView 950
		bottomValue 15
		topValue 1
	)
	
	(method (show param1)
		(asm
			pushi    #controls
			pushi    0
			class    User
			send     4
			not     
			bnt      code_22ee
			ldi      132
			aTop     signal
			ldi      9
			aTop     sliderLoop
			jmp      code_22f7
code_22ee:
			ldi      0
			aTop     sliderLoop
			ldi      128
			aTop     signal
code_22f7:
			pushi    #show
			pushi    0
			&rest    param1
			super    Slider,  4
			ret     
		)
	)
	
	(method (mask)
		(asm
			ret     
		)
	)
	
	(method (move param1)
		(asm
			pushi    #controls
			pushi    0
			class    User
			send     4
			bnt      code_2315
			pushi    #move
			pushi    0
			&rest    param1
			super    Slider,  4
code_2315:
			ret     
		)
	)
)

(instance arcadeSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 227
		nsTop 49
		signal $0080
		helpStr 14424
		sliderView 950
		bottomValue 1
		topValue 22
	)
	
	(method (doit param1)
		(asm
			lap      argc
			bnt      code_23be
			lsp      param1
			ldi      1
			le?     
			bnt      code_2396
			ldi      1
			sag      global125
			jmp      code_23b8
code_2396:
			lsp      param1
			ldi      8
			le?     
			bnt      code_23a5
			ldi      2
			sag      global125
			jmp      code_23b8
code_23a5:
			lsp      param1
			ldi      15
			le?     
			bnt      code_23b4
			ldi      3
			sag      global125
			jmp      code_23b8
code_23b4:
			ldi      4
			sag      global125
code_23b8:
			lap      param1
			ret     
			jmp      code_23c1
code_23be:
			lag      global125
			ret     
code_23c1:
			ret     
		)
	)
	
	(method (valueToPosn &tmp temp0)
		(asm
			lsg      global125
			dup     
			ldi      1
			eq?     
			bnt      code_23d2
			ldi      1
			jmp      code_23f3
code_23d2:
			dup     
			ldi      2
			eq?     
			bnt      code_23de
			ldi      7
			jmp      code_23f3
code_23de:
			dup     
			ldi      3
			eq?     
			bnt      code_23ea
			ldi      15
			jmp      code_23f3
code_23ea:
			dup     
			ldi      4
			eq?     
			bnt      code_23f3
			ldi      22
code_23f3:
			toss    
			sat      temp0
			pushi    #valueToPosn
			pushi    1
			push    
			super    Slider,  6
			ret     
		)
	)
)

(instance iconSave of ControlIcon
	(properties
		view 950
		loop 2
		cel 0
		nsLeft 25
		nsTop 26
		signal $01c3
		helpStr 14567
		lowlightColor 52
	)
)

(instance iconRestore of ControlIcon
	(properties
		view 950
		loop 3
		cel 0
		nsLeft 25
		nsTop 46
		signal $01c3
		helpStr 14601
		lowlightColor 60
	)
)

(instance iconRestart of ControlIcon
	(properties
		view 950
		loop 4
		cel 0
		nsLeft 25
		nsTop 66
		signal $01c3
		helpStr 14647
		lowlightColor 42
	)
)

(instance iconQuit of ControlIcon
	(properties
		view 950
		loop 5
		cel 0
		nsLeft 43
		nsTop 86
		signal $01c3
		helpStr 14697
		lowlightColor 12
	)
)

(instance iconHelp of IconI
	(properties
		view 950
		loop 6
		cel 0
		nsLeft 25
		nsTop 106
		cursor 6
		message 6
		signal $0183
		lowlightColor 4
	)
)

(instance iconAbout of ControlIcon
	(properties
		view 950
		loop 8
		cel 0
		nsLeft 25
		nsTop 86
		signal $0183
		helpStr 14731
		lowlightColor 6
	)
)

(instance iconOk of IconI
	(properties
		view 950
		loop 7
		cel 0
		nsLeft 43
		nsTop 106
		signal $00c3
		helpStr 14769
		lowlightColor 34
	)
)

(instance gcWindow of BorderWindow
	(properties)
	
	(method (open &tmp temp0 temp1)
		(asm
			ldi      65535
			sat      temp1
			pushi    #top
			pushi    1
			pushi    25
			pushi    184
			pushi    1
			pushi    26
			pushi    185
			pushi    1
			pushi    166
			pushi    186
			pushi    1
			pushi    296
			pushi    63
			pushi    1
			push    
			self     30
			pushi    #open
			pushi    0
			super    BorderWindow,  4
			pushi    0
			callk    PicNotValid,  0
			sat      temp0
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    0
			pushi    0
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    54
			pushi    0
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    108
			pushi    0
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    162
			pushi    0
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    216
			pushi    0
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    0
			pushi    47
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    54
			pushi    47
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    108
			pushi    47
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    162
			pushi    47
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    216
			pushi    47
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    0
			pushi    94
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    54
			pushi    94
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    108
			pushi    94
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    162
			pushi    94
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    2
			pushi    216
			pushi    94
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    0
			pushi    5
			pushi    146
			pushi    9
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    1
			pushi    14
			pushi    17
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    0
			pushi    119
			pushi    50
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    0
			pushi    165
			pushi    50
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    1
			pushi    0
			pushi    211
			pushi    50
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    0
			pushi    4
			pushi    85
			pushi    33
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    0
			pushi    3
			pushi    128
			pushi    33
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    0
			pushi    2
			pushi    180
			pushi    33
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    950
			pushi    0
			pushi    6
			pushi    219
			pushi    33
			lst      temp1
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    94
			pushi    3
			pushi    950
			pushi    1
			pushi    2
			callk    CelHigh,  6
			add     
			push    
			pushi    216
			pushi    3
			pushi    950
			pushi    1
			pushi    2
			callk    CelWide,  6
			add     
			push    
			pushi    1
			callk    Graph,  12
			pushi    1
			lst      temp0
			callk    PicNotValid,  2
			ret     
		)
	)
)

(instance invWindow of InsetWindow
	(properties
		priority -1
	)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			&rest    param1
			super    InsetWindow,  4
			pushi    0
			calle    proc13_7,  0
			ret     
		)
	)
)

(instance DoVerbCode of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_294d
			pushi    #lookStr
			pushi    0
			lap      param2
			send     4
			not     
			bnt      code_2912
			pushi    3
			pushi    1000
			pushi    75
			pushi    1
			calle    proc13_4,  6
			jmp      code_29a2
code_2912:
			pushi    #lookStr
			pushi    0
			lap      param2
			send     4
			push    
			ldi      1000
			uge?    
			bnt      code_2933
			pushi    1
			pushi    #lookStr
			pushi    0
			lap      param2
			send     4
			push    
			calle    proc13_1,  2
			jmp      code_29a2
code_2933:
			pushi    3
			lsg      global11
			ldi      1000
			add     
			push    
			pushi    #lookStr
			pushi    0
			lap      param2
			send     4
			push    
			pushi    1
			calle    proc13_4,  6
			jmp      code_29a2
code_294d:
			dup     
			ldi      3
			eq?     
			bnt      code_2963
			pushi    3
			pushi    1000
			pushi    76
			pushi    1
			calle    proc13_4,  6
			jmp      code_29a2
code_2963:
			dup     
			ldi      5
			eq?     
			bnt      code_2979
			pushi    3
			pushi    1000
			pushi    77
			pushi    1
			calle    proc13_4,  6
			jmp      code_29a2
code_2979:
			dup     
			ldi      10
			eq?     
			bnt      code_298f
			pushi    3
			pushi    1000
			pushi    78
			pushi    1
			calle    proc13_4,  6
			jmp      code_29a2
code_298f:
			dup     
			ldi      4
			eq?     
			bnt      code_29a2
			pushi    3
			pushi    1000
			pushi    79
			pushi    1
			calle    proc13_4,  6
code_29a2:
			toss    
			ret     
		)
	)
)

(instance FtrInit of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9)
		(asm
			pushi    #sightAngle
			pushi    0
			lap      param1
			send     4
			push    
			ldi      26505
			eq?     
			bnt      code_29e0
			pushi    #sightAngle
			pushi    1
			pushi    90
			lap      param1
			send     6
code_29e0:
			pushi    #actions
			pushi    0
			lap      param1
			send     4
			push    
			ldi      26505
			eq?     
			bnt      code_29f9
			pushi    #actions
			pushi    1
			pushi    0
			lap      param1
			send     6
code_29f9:
			pushi    #x
			pushi    0
			lap      param1
			send     4
			bt       code_2a14
			pushi    #y
			pushi    0
			lap      param1
			send     4
			bt       code_2a14
			pushi    #z
			pushi    0
			lap      param1
			send     4
code_2a14:
			bnt      code_2a1a
			jmp      code_2afd
code_2a1a:
			pushi    1
			pushi    #onMeCheck
			pushi    0
			lap      param1
			send     4
			sat      temp0
			push    
			callk    IsObject,  2
			not     
			bnt      code_2a5b
			pushi    4
			pushi    1
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lap      param1
			send     4
			add     
			push    
			ldi      2
			div     
			push    
			lap      param1
			send     6
			pushi    #y
			pushi    1
			pushi    #nsTop
			pushi    0
			lap      param1
			send     4
			push    
			lap      param1
			send     6
			jmp      code_2afd
code_2a5b:
			ldi      0
			sat      temp9
			sat      temp8
			ldi      32767
			sat      temp7
			sat      temp6
			pushi    #points
			pushi    0
			lat      temp0
			send     4
			sat      temp2
			ldi      0
			sat      temp1
			pushi    4
			pushi    #size
			pushi    0
			lat      temp0
			send     4
			mul     
			sat      temp3
code_2a81:
			lst      temp1
			lat      temp3
			lt?     
			bnt      code_2ae3
			pushi    2
			pushi    5
			lst      temp2
			lat      temp1
			add     
			push    
			callk    Memory,  4
			sat      temp4
			pushi    2
			pushi    5
			lst      temp2
			lat      temp1
			add     
			push    
			ldi      2
			add     
			push    
			callk    Memory,  4
			sat      temp5
			lst      temp4
			lat      temp6
			le?     
			bnt      code_2ab5
			lat      temp4
			sat      temp6
code_2ab5:
			lst      temp5
			lat      temp7
			le?     
			bnt      code_2ac1
			lat      temp5
			sat      temp7
code_2ac1:
			lst      temp4
			lat      temp8
			ge?     
			bnt      code_2acd
			lat      temp4
			sat      temp8
code_2acd:
			lst      temp5
			lat      temp9
			ge?     
			bnt      code_2ad9
			lat      temp5
			sat      temp9
code_2ad9:
			lst      temp1
			ldi      4
			add     
			sat      temp1
			jmp      code_2a81
code_2ae3:
			pushi    4
			pushi    1
			lst      temp6
			lat      temp8
			add     
			push    
			ldi      2
			div     
			push    
			lap      param1
			send     6
			pushi    #y
			pushi    1
			lst      temp7
			lap      param1
			send     6
code_2afd:
			ret     
		)
	)
)

(instance checkIcon of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #isKindOf
			pushi    1
			class    IconI
			push    
			lap      param1
			send     6
			bnt      code_31c6
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			push    
			ldi      4
			and     
			bnt      code_31c6
			lsg      global165
			pushi    32768
			pushi    #indexOf
			pushi    1
			lsp      param1
			lag      global69
			send     6
			shr     
			or      
			sag      global165
code_31c6:
			ret     
		)
	)
)
