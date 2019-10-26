;;; Sierra Script 1.0 - (do not remove this comment)
(script# 220)
(include sci.sh)
(use n000)
(use n013)
(use n221)
(use n225)
(use n228)
(use n231)
(use n233)
(use n241)
(use n750)
(use n806)
(use n813)
(use n851)
(use n926)
(use n945)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	forest 0
	forestBlown 1
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7 =  1
	local8 =  1
	local9
	local10
	[local11 10] = [-190 42 -150 74 -180 84 -250 105 -210 152]
	[local21 4] = [5 3 4 2]
	[local25 5] = [1220 10 1 1]
	[local30 8] = [-1]
)
(procedure (localproc_0022)
	(asm
		pushi    #number
		pushi    1
		pushi    916
		pushi    6
		pushi    1
		pushi    1
		pushi    42
		pushi    0
		lag      global114
		send     16
		lsg      global15
		ldi      75
		add     
		sag      global15
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		ret     
	)
)

(procedure (localproc_0046)
	(asm
		pushi    #obstacles
		pushi    0
		lag      global2
		send     4
		bnt      code_005e
		pushi    #dispose
		pushi    0
		pushi    #obstacles
		pushi    0
		lag      global2
		send     4
		send     4
code_005e:
		pushi    #obstacles
		pushi    1
		pushi    0
		lag      global2
		send     6
		ret     
	)
)

(procedure (localproc_0068 param1 param2 &tmp temp0 temp1)
	(asm
		lap      param1
		sat      temp1
		push    
		ldi      0
		lt?     
		bnt      code_00fb
		ldi      0
		sat      temp0
code_0079:
		lat      temp0
		lali     local11
		bnt      code_00dd
		lsp      param1
		lat      temp0
		lali     local11
		eq?     
		bnt      code_00d3
		lst      temp0
		ldi      1
		add     
		lali     local11
		sat      temp1
		lsp      param2
		dup     
		ldi      1
		eq?     
		bnt      code_00a6
		lst      temp1
		ldi      16
		sub     
		sat      temp1
		jmp      code_00cc
code_00a6:
		dup     
		ldi      3
		eq?     
		bnt      code_00b7
		lst      temp1
		ldi      16
		add     
		sat      temp1
		jmp      code_00cc
code_00b7:
		dup     
		ldi      2
		eq?     
		bnt      code_00c3
		+at      temp1
		jmp      code_00cc
code_00c3:
		dup     
		ldi      4
		eq?     
		bnt      code_00cc
		-at      temp1
code_00cc:
		toss    
		lat      temp1
		ret     
		jmp      code_00dd
code_00d3:
		lst      temp0
		ldi      2
		add     
		sat      temp0
		jmp      code_0079
code_00dd:
		lst      temp1
		ldi      0
		lt?     
		bnt      code_00fb
		ldi      1158
		sat      temp1
		ldi      3
		sap      param2
		pushi    #posn
		pushi    2
		pushi    160
		pushi    80
		lag      global0
		send     8
code_00fb:
		lsp      param2
		dup     
		ldi      1
		eq?     
		bnt      code_010e
		lst      temp1
		ldi      16
		sub     
		sat      temp1
		jmp      code_0134
code_010e:
		dup     
		ldi      3
		eq?     
		bnt      code_011f
		lst      temp1
		ldi      16
		add     
		sat      temp1
		jmp      code_0134
code_011f:
		dup     
		ldi      2
		eq?     
		bnt      code_012b
		+at      temp1
		jmp      code_0134
code_012b:
		dup     
		ldi      4
		eq?     
		bnt      code_0134
		-at      temp1
code_0134:
		toss    
		ldi      1
		sat      temp0
code_0139:
		lst      temp0
		ldi      10
		lt?     
		bnt      code_015d
		lst      temp1
		lat      temp0
		lali     local11
		eq?     
		bnt      code_0153
		lst      temp0
		ldi      1
		sub     
		lali     local11
		ret     
code_0153:
		lst      temp0
		ldi      2
		add     
		sat      temp0
		jmp      code_0139
code_015d:
		lat      temp1
		ret     
	)
)

(procedure (localproc_0160 param1 param2 &tmp temp0 temp1)
	(asm
		lap      param1
		sag      global112
		ldi      0
		sag      global40
		pushi    #x
		pushi    0
		lag      global0
		send     4
		sag      global104
		pushi    #y
		pushi    0
		lag      global0
		send     4
		sag      global105
		push    
		ldi      83
		lt?     
		bnt      code_0187
		ldi      85
		sag      global105
code_0187:
		lsg      global112
		ldi      3
		mod     
		push    
		ldi      0
		eq?     
		bnt      code_019f
		ldi      0
		sal      local8
		ldi      220
		sal      local0
		jmp      code_01d0
code_019f:
		lsg      global112
		ldi      3
		mod     
		push    
		ldi      1
		eq?     
		bnt      code_01b7
		ldi      0
		sal      local7
		ldi      230
		sal      local0
		jmp      code_01d0
code_01b7:
		lsg      global112
		ldi      3
		mod     
		push    
		ldi      2
		eq?     
		bnt      code_01d0
		ldi      0
		sal      local8
		ldi      0
		sal      local7
		ldi      240
		sal      local0
code_01d0:
		lal      local9
		bnt      code_01e0
		ldi      0
		sal      local9
		ldi      100
		sat      temp0
		jmp      code_01e9
code_01e0:
		lsp      param2
		ldi      1
		sub     
		lali     local21
		sat      temp0
code_01e9:
		pushi    20
		lsg      global112
		pushi    19
		pushi    21
		pushi    23
		pushi    35
		pushi    50
		pushi    52
		pushi    65
		pushi    68
		pushi    82
		pushi    83
		pushi    85
		pushi    86
		pushi    89
		pushi    115
		pushi    121
		pushi    131
		pushi    133
		pushi    151
		pushi    154
		calle    proc999_5,  40
		bnt      code_0239
		lsl      local0
		ldi      230
		eq?     
		bnt      code_0231
		pushi    0
		calle    proc233_0,  0
		jmp      code_0269
code_0231:
		pushi    0
		calle    proc228_0,  0
		jmp      code_0269
code_0239:
		lsl      local0
		dup     
		ldi      220
		eq?     
		bnt      code_024b
		pushi    0
		calle    proc221_0,  0
		jmp      code_0268
code_024b:
		dup     
		ldi      230
		eq?     
		bnt      code_025b
		pushi    0
		calle    proc231_0,  0
		jmp      code_0268
code_025b:
		dup     
		ldi      240
		eq?     
		bnt      code_0268
		pushi    0
		calle    proc241_0,  0
code_0268:
		toss    
code_0269:
		lsg      global130
		ldi      9
		eq?     
		bnt      code_0278
		pushi    1
		pushi    36
		callb    proc0_5,  2
		not     
code_0278:
		bt       code_028a
		lsg      global130
		ldi      12
		eq?     
		bnt      code_0294
		pushi    1
		pushi    38
		callb    proc0_5,  2
		not     
code_028a:
		bnt      code_0294
		pushi    0
		calle    proc750_3,  0
code_0294:
		pushi    16
		lsg      global112
		pushi    21
		pushi    36
		pushi    37
		pushi    38
		pushi    50
		pushi    56
		pushi    67
		pushi    75
		pushi    98
		pushi    99
		pushi    103
		pushi    115
		pushi    119
		pushi    135
		pushi    167
		calle    proc999_5,  32
		bnt      code_0333
		ldi      0
		sal      local8
		ldi      0
		sal      local7
		pushi    #curPic
		pushi    1
		lsl      local0
		lag      global2
		send     6
		pushi    #picture
		pushi    1
		lsl      local0
		lag      global2
		send     6
		pushi    396
		pushi    #x
		lsl      local0
		lst      temp0
		ldi      16384
		or      
		push    
		pushi    1
		pushi    0
		lag      global2
		send     12
		pushi    20
		lsg      global112
		pushi    19
		pushi    21
		pushi    23
		pushi    35
		pushi    50
		pushi    52
		pushi    65
		pushi    68
		pushi    82
		pushi    83
		pushi    85
		pushi    86
		pushi    89
		pushi    115
		pushi    121
		pushi    131
		pushi    133
		pushi    151
		pushi    154
		calle    proc999_5,  40
		not     
		bnt      code_034e
		pushi    0
		calle    proc926_0,  0
		jmp      code_034e
code_0333:
		pushi    #style
		pushi    1
		lst      temp0
		pushi    387
		pushi    1
		lsl      local0
		pushi    384
		pushi    1
		lsl      local0
		pushi    396
		pushi    1
		lsl      local0
		lag      global2
		send     24
code_034e:
		pushi    37
		lsg      global112
		pushi    2
		pushi    3
		pushi    4
		pushi    5
		pushi    6
		pushi    7
		pushi    17
		pushi    24
		pushi    25
		pushi    26
		pushi    27
		pushi    32
		pushi    43
		pushi    48
		pushi    60
		pushi    64
		pushi    76
		pushi    81
		pushi    91
		pushi    97
		pushi    107
		pushi    113
		pushi    123
		pushi    129
		pushi    139
		pushi    146
		pushi    147
		pushi    148
		pushi    149
		pushi    156
		pushi    168
		pushi    169
		pushi    170
		pushi    171
		pushi    182
		pushi    183
		calle    proc999_5,  74
		bnt      code_03bf
		ldi      0
		sal      local8
		ldi      0
		sal      local7
		pushi    0
		calle    proc225_2,  0
		jmp      code_0537
code_03bf:
		lsg      global112
		ldi      116
		eq?     
		bt       code_052f
		lsg      global112
		ldi      117
		eq?     
		bt       code_052f
		lsg      global112
		ldi      131
		eq?     
		bt       code_052f
		lsg      global112
		ldi      133
		eq?     
		bt       code_052f
		lsg      global112
		ldi      154
		eq?     
		bt       code_052f
		lsg      global112
		ldi      18
		eq?     
		bt       code_052f
		lsg      global112
		ldi      33
		eq?     
		bt       code_052f
		lsg      global112
		ldi      35
		eq?     
		bt       code_052f
		lsg      global112
		ldi      52
		eq?     
		bt       code_052f
		lsg      global112
		ldi      54
		eq?     
		bt       code_052f
		lsg      global112
		ldi      69
		eq?     
		bt       code_052f
		lsg      global112
		ldi      119
		eq?     
		bt       code_052f
		lsg      global112
		ldi      121
		eq?     
		bt       code_052f
		lsg      global112
		ldi      135
		eq?     
		bt       code_052f
		lsg      global112
		ldi      137
		eq?     
		bt       code_052f
		lsg      global112
		ldi      51
		eq?     
		bt       code_052f
		lsg      global112
		ldi      65
		eq?     
		bt       code_052f
		lsg      global112
		ldi      82
		eq?     
		bt       code_052f
		lsg      global112
		ldi      19
		eq?     
		bt       code_052f
		lsg      global112
		ldi      21
		eq?     
		bt       code_052f
		lsg      global112
		ldi      36
		eq?     
		bt       code_052f
		lsg      global112
		ldi      98
		eq?     
		bt       code_052f
		lsg      global112
		ldi      115
		eq?     
		bt       code_052f
		lsg      global112
		ldi      130
		eq?     
		bt       code_052f
		lsg      global112
		ldi      23
		eq?     
		bt       code_052f
		lsg      global112
		ldi      37
		eq?     
		bt       code_052f
		lsg      global112
		ldi      38
		eq?     
		bt       code_052f
		lsg      global112
		ldi      106
		eq?     
		bt       code_052f
		lsg      global112
		ldi      138
		eq?     
		bt       code_052f
		lsg      global112
		ldi      50
		eq?     
		bt       code_052f
		lsg      global112
		ldi      67
		eq?     
		bt       code_052f
		lsg      global112
		ldi      68
		eq?     
		bt       code_052f
		lsg      global112
		ldi      72
		eq?     
		bt       code_052f
		lsg      global112
		ldi      83
		eq?     
		bt       code_052f
		lsg      global112
		ldi      85
		eq?     
		bt       code_052f
		lsg      global112
		ldi      86
		eq?     
		bt       code_052f
		lsg      global112
		ldi      89
		eq?     
		bt       code_052f
		lsg      global112
		ldi      99
		eq?     
		bt       code_052f
		lsg      global112
		ldi      100
		eq?     
		bt       code_052f
		lsg      global112
		ldi      101
		eq?     
		bt       code_052f
		lsg      global112
		ldi      104
		eq?     
		bt       code_052f
		lsg      global112
		ldi      136
		eq?     
		bt       code_052f
		lsg      global112
		ldi      151
		eq?     
		bt       code_052f
		lsg      global112
		ldi      153
		eq?     
		bt       code_052f
		lsg      global112
		ldi      167
		eq?     
code_052f:
		bnt      code_0537
		pushi    0
		calle    proc225_1,  0
code_0537:
		lsg      global112
		ldi      132
		eq?     
		bt       code_0596
		lsg      global112
		ldi      155
		eq?     
		bt       code_0596
		lsg      global112
		ldi      34
		eq?     
		bt       code_0596
		lsg      global112
		ldi      53
		eq?     
		bt       code_0596
		lsg      global112
		ldi      120
		eq?     
		bt       code_0596
		lsg      global112
		ldi      66
		eq?     
		bt       code_0596
		lsg      global112
		ldi      20
		eq?     
		bt       code_0596
		lsg      global112
		ldi      114
		eq?     
		bt       code_0596
		lsg      global112
		ldi      22
		eq?     
		bt       code_0596
		lsg      global112
		ldi      122
		eq?     
		bt       code_0596
		lsg      global112
		ldi      88
		eq?     
		bt       code_0596
		lsg      global112
		ldi      49
		eq?     
code_0596:
		bnt      code_05a1
		pushi    0
		calle    proc225_0,  0
		jmp      code_05a9
code_05a1:
		ldi      0
		sal      local8
		ldi      0
		sal      local7
code_05a9:
		pushi    1
		pushi    21
		callb    proc0_5,  2
		bnt      code_060f
		pushi    1
		pushi    199
		callb    proc0_5,  2
		bnt      code_060f
		lsg      global130
		ldi      2
		eq?     
		bnt      code_060f
		pushi    13
		lsg      global112
		pushi    19
		pushi    40
		pushi    52
		pushi    70
		pushi    82
		pushi    100
		pushi    106
		pushi    118
		pushi    130
		pushi    136
		pushi    151
		pushi    166
		calle    proc999_5,  26
		bnt      code_060f
		lsg      global108
		ldi      3
		ne?     
		bnt      code_060f
		pushi    #setScript
		pushi    1
		pushi    0
		lofsa    forest
		send     6
		pushi    #init
		pushi    0
		pushi    2
		pushi    226
		pushi    0
		callk    ScriptID,  4
		send     4
		jmp      code_069b
code_060f:
		lal      local7
		bnt      code_063f
		pushi    2
		pushi    0
		pushi    8
		callk    Random,  4
		not     
		bnt      code_063f
		lsg      global3
		ldi      4
		gt?     
		bnt      code_063f
		lsg      global130
		ldi      9
		ne?     
		bnt      code_063f
		lsg      global130
		ldi      12
		ne?     
		bnt      code_063f
		pushi    #init
		pushi    0
		lofsa    bunny
		send     4
code_063f:
		lal      local8
		bnt      code_068b
		pushi    2
		pushi    0
		pushi    25
		callk    Random,  4
		not     
		bnt      code_068b
		lsg      global108
		ldi      2
		eq?     
		bt       code_065c
		lsg      global108
		ldi      4
		eq?     
code_065c:
		bnt      code_068b
		lsg      global3
		ldi      4
		gt?     
		bnt      code_068b
		lsg      global130
		ldi      9
		ne?     
		bnt      code_068b
		lsg      global130
		ldi      12
		ne?     
		bnt      code_068b
		pushi    #init
		pushi    0
		pushi    142
		pushi    3
		lofsa    stampede
		push    
		pushi    0
		lsp      param2
		lofsa    buck
		send     14
code_068b:
		pushi    #setScript
		pushi    3
		lofsa    egoEnters
		push    
		pushi    0
		lsp      param2
		lag      global0
		send     10
code_069b:
		ret     
	)
)

(instance forest of Rm
	(properties
		horizon 82
		north 220
		east 220
		south 220
		west 220
	)
	
	(method (init param1 &tmp temp0)
		(asm
			pushi    1
			pushi    225
			callk    ScriptID,  2
			pushi    16
			pushi    128
			pushi    805
			pushi    792
			pushi    764
			pushi    763
			pushi    230
			pushi    231
			pushi    232
			pushi    233
			pushi    234
			pushi    235
			pushi    236
			pushi    237
			pushi    238
			lsg      global130
			ldi      2
			eq?     
			bnt      code_07ff
			ldi      214
			ldi      218
			ldi      16
			ldi      4
			ldi      5
			ldi      7
			ldi      585
code_07ff:
			push    
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0812
			ldi      0
			ldi      1
			ldi      2
			jmp      code_086f
code_0812:
			dup     
			ldi      1
			eq?     
			bnt      code_0822
			ldi      36
			ldi      37
			ldi      38
			jmp      code_086f
code_0822:
			dup     
			ldi      2
			eq?     
			bnt      code_0832
			ldi      29
			ldi      30
			ldi      31
			jmp      code_086f
code_0832:
			dup     
			ldi      3
			eq?     
			bnt      code_0842
			ldi      29
			ldi      30
			ldi      31
			jmp      code_086f
code_0842:
			dup     
			ldi      4
			eq?     
			bnt      code_0852
			ldi      33
			ldi      34
			ldi      35
			jmp      code_086f
code_0852:
			dup     
			ldi      5
			eq?     
			bnt      code_0862
			ldi      23
			ldi      24
			ldi      27
			jmp      code_086f
code_0862:
			dup     
			ldi      6
			eq?     
			bnt      code_086f
			ldi      16
			ldi      17
			ldi      18
code_086f:
			toss    
			push    
			calle    proc958_0,  32
			lsg      global12
			dup     
			ldi      100
			eq?     
			bnt      code_0887
			lag      global112
			sat      temp0
			jmp      code_0972
code_0887:
			dup     
			ldi      110
			eq?     
			bnt      code_08a3
			pushi    #posn
			pushi    2
			pushi    1
			pushi    170
			lag      global0
			send     8
			ldi      71
			sag      global112
			sat      temp0
			jmp      code_0972
code_08a3:
			dup     
			ldi      120
			eq?     
			bnt      code_0961
			lsg      global112
			ldi      9
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      25
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      40
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      55
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      71
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      87
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      102
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      118
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      134
			eq?     
			bt       code_08f9
			lsg      global112
			ldi      150
			eq?     
code_08f9:
			bnt      code_0906
			lsg      global108
			ldi      4
			eq?     
			bnt      code_0906
			-ag      global112
code_0906:
			lsg      global112
			ldi      24
			eq?     
			bt       code_094d
			lsg      global112
			ldi      39
			eq?     
			bt       code_094d
			lsg      global112
			ldi      54
			eq?     
			bt       code_094d
			lsg      global112
			ldi      70
			eq?     
			bt       code_094d
			lsg      global112
			ldi      86
			eq?     
			bt       code_094d
			lsg      global112
			ldi      101
			eq?     
			bt       code_094d
			lsg      global112
			ldi      117
			eq?     
			bt       code_094d
			lsg      global112
			ldi      133
			eq?     
			bt       code_094d
			lsg      global112
			ldi      149
			eq?     
code_094d:
			bnt      code_095a
			lsg      global108
			ldi      2
			eq?     
			bnt      code_095a
			+ag      global112
code_095a:
			lag      global112
			sat      temp0
			jmp      code_0972
code_0961:
			lag      global12
			sat      temp0
			neg     
			sag      global112
			pushi    2
			push    
			lsg      global108
			call     localproc_0068,  4
			sat      temp0
code_0972:
			toss    
			ldi      1
			sal      local9
			pushi    0
			callb    proc0_4,  0
			pushi    #init
			pushi    0
			&rest    param1
			super    Rm,  4
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      905
			ne?     
			bt       code_099a
			pushi    #handle
			pushi    0
			lag      global100
			send     4
			not     
code_099a:
			bnt      code_09aa
			pushi    #number
			pushi    1
			pushi    905
			pushi    42
			pushi    0
			lag      global100
			send     10
code_09aa:
			pushi    2
			lst      temp0
			lsg      global108
			call     localproc_0160,  4
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_09c4
			jmp      code_0a59
code_09c4:
			pushi    1
			pushi    129
			callb    proc0_5,  2
			not     
			bnt      code_09e9
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_09e9
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    #doit
			pushi    0
			lofsa    handSignCode
			send     4
			jmp      code_0a59
code_09e9:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0a53
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			lag      global25
			bnt      code_0a08
			pushi    #dispose
			pushi    0
			send     4
code_0a08:
			lsg      global130
			ldi      8
			lt?     
			bnt      code_0a28
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_0a28
			pushi    #doit
			pushi    0
			pushi    2
			pushi    185
			pushi    4
			callk    ScriptID,  4
			send     4
code_0a28:
			lal      local6
			bnt      code_0a40
			pushi    1
			lofsa    funnyBunny
			push    
			calle    proc806_2,  2
			pushi    #dispose
			pushi    0
			lofsa    bunny
			send     4
code_0a40:
			pushi    #setScript
			pushi    3
			lofsa    walkOut
			push    
			pushi    0
			lsg      global108
			lag      global0
			send     10
			jmp      code_0a59
code_0a53:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_0a59:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lag      global25
			bnt      code_0a8d
			pushi    #dispose
			pushi    0
			send     4
code_0a8d:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sag      global104
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sag      global105
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			lag      global11
			sag      global12
			pushi    4
			pushi    0
			pushi    223
			pushi    225
			pushi    226
			calle    proc958_0,  8
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06bb
			pushi    3
			pushi    1220
			pushi    12
			lsg      global130
			ldi      1
			sub     
			add     
			push    
			pushi    1
			calle    proc13_4,  6
			jmp      code_07af
code_06bb:
			dup     
			ldi      3
			eq?     
			bnt      code_06d1
			pushi    3
			pushi    1220
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_07af
code_06d1:
			dup     
			ldi      5
			eq?     
			bnt      code_06e7
			pushi    3
			pushi    1220
			pushi    26
			pushi    1
			calle    proc13_4,  6
			jmp      code_07af
code_06e7:
			dup     
			ldi      4
			eq?     
			bnt      code_07a4
			lsp      param2
			ldi      4
			eq?     
			bnt      code_0796
			lsg      global71
			pTos     horizon
			ldi      10
			add     
			gt?     
			bnt      code_0796
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0796
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			bnt      code_077d
			pushi    3
			pushi    1220
			pushi    31
			pushi    1
			calle    proc13_4,  6
			jmp      code_07af
code_077d:
			pushi    #setScript
			pushi    3
			pushi    2
			pushi    181
			pushi    1
			callk    ScriptID,  4
			push    
			lsg      global70
			lsg      global71
			lag      global0
			send     10
			jmp      code_07af
code_0796:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
			jmp      code_07af
code_07a4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Rm,  6
code_07af:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #actions
			pushi    1
			lofsa    forestBlown
			push    
			lag      global0
			send     6
			lsg      global130
			ldi      8
			lt?     
			bnt      code_0a82
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_0a82
			pushi    #setScript
			pushi    1
			lofsa    PT
			push    
			self     6
code_0a82:
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0ad8
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_0ad8
			+ag      global155
code_0ad8:
			pushi    0
			call     localproc_0046,  0
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global32
			send     10
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0b05
			pushi    0
			callb    proc0_4,  0
code_0b05:
			lsg      global145
			ldi      33
			eq?     
			bnt      code_0b1d
			ldi      170
			sap      newRoomNumber
			pushi    #newRoom
			pushi    1
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0b1d:
			lal      local3
			bnt      code_0b32
			ldi      180
			sap      newRoomNumber
			pushi    #newRoom
			pushi    1
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0b32:
			lal      local1
			bnt      code_0b55
			pushi    #doit
			pushi    0
			pushi    2
			pushi    226
			pushi    14
			callk    ScriptID,  4
			send     4
			ldi      160
			sap      newRoomNumber
			pushi    #newRoom
			pushi    1
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0b55:
			lal      local4
			bnt      code_0b81
			lsg      global108
			ldi      4
			eq?     
			bnt      code_0b71
			lsg      global112
			ldi      71
			eq?     
			bnt      code_0b71
			ldi      110
			sap      newRoomNumber
			jmp      code_0b75
code_0b71:
			ldi      120
			sap      newRoomNumber
code_0b75:
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			super    Rm,  6
			jmp      code_0e1a
code_0b81:
			pushi    1
			pushi    194
			callb    proc0_5,  2
			bnt      code_0c0d
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			bnt      code_0bfd
			pushi    1
			pushi    2
			pushi    225
			pushi    9
			callk    ScriptID,  4
			push    
			calle    proc806_2,  2
code_0bfd:
			ldi      170
			sap      newRoomNumber
			pushi    #newRoom
			pushi    1
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0c0d:
			pushi    1
			pushi    176
			callb    proc0_5,  2
			bnt      code_0c45
			pushi    1
			pushi    37
			callb    proc0_5,  2
			bnt      code_0c2e
			pushi    #doit
			pushi    0
			pushi    2
			pushi    185
			pushi    4
			callk    ScriptID,  4
			send     4
code_0c2e:
			pushi    1
			pushi    176
			callb    proc0_7,  2
			ldi      171
			sap      newRoomNumber
			pushi    #newRoom
			pushi    1
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0c45:
			pushi    1
			pushi    170
			callb    proc0_5,  2
			bnt      code_0d4c
			pushi    1
			pushi    170
			callb    proc0_7,  2
			lsg      global137
			ldi      3
			lt?     
			bnt      code_0c62
			ldi      0
			sag      global137
code_0c62:
			lsg      global130
			ldi      2
			eq?     
			bnt      code_0cca
			pushi    1
			pushi    182
			callb    proc0_5,  2
			bnt      code_0cca
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0c9a
			lsg      global126
			ldi      1
			ne?     
			bnt      code_0c9a
			pushi    #init
			pushi    0
			lofsa    robinHead
			send     4
			pushi    #add
			pushi    1
			lofsa    robinHead
			push    
			lag      global10
			send     6
code_0c9a:
			pushi    #init
			pushi    0
			lofsa    robin
			send     4
			pushi    #add
			pushi    1
			lofsa    robin
			push    
			lag      global10
			send     6
			pushi    #doit
			pushi    0
			lag      global10
			send     4
			pushi    #doit
			pushi    0
			pushi    2
			pushi    226
			pushi    14
			callk    ScriptID,  4
			send     4
			ldi      160
			sap      newRoomNumber
			jmp      code_0d35
code_0cca:
			lsg      global130
			ldi      8
			lt?     
			bnt      code_0d31
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_0d31
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0d02
			lsg      global126
			ldi      1
			ne?     
			bnt      code_0d02
			pushi    #init
			pushi    0
			lofsa    robinHead
			send     4
			pushi    #add
			pushi    1
			lofsa    robinHead
			push    
			lag      global10
			send     6
code_0d02:
			pushi    #init
			pushi    0
			lofsa    robin
			send     4
			pushi    #add
			pushi    1
			lofsa    robin
			push    
			lag      global10
			send     6
			pushi    #doit
			pushi    0
			lag      global10
			send     4
			pushi    #doit
			pushi    0
			pushi    2
			pushi    185
			pushi    4
			callk    ScriptID,  4
			send     4
			ldi      100
			sap      newRoomNumber
			jmp      code_0d35
code_0d31:
			ldi      100
			sap      newRoomNumber
code_0d35:
			pushi    #doit
			pushi    0
			pushi    2
			pushi    0
			pushi    1
			callk    ScriptID,  4
			send     4
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			super    Rm,  6
			jmp      code_0e1a
code_0d4c:
			lal      local5
			bnt      code_0d60
			ldi      100
			sap      newRoomNumber
			pushi    #newRoom
			pushi    1
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0d60:
			pushi    2
			lsg      global112
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			push    
			call     localproc_0068,  4
			sap      newRoomNumber
			push    
			ldi      0
			lt?     
			bnt      code_0d89
			pushi    #newRoom
			pushi    1
			lap      newRoomNumber
			neg     
			push    
			super    Rm,  6
			jmp      code_0e1a
code_0d89:
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			bnt      code_0e11
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pushi    2
			pushi    225
			pushi    4
			callk    ScriptID,  4
			send     4
			push    
			ldi      65470
			and     
			push    
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    225
			pushi    4
			callk    ScriptID,  4
			send     14
code_0e11:
			pushi    2
			lsp      newRoomNumber
			lsg      global108
			call     localproc_0160,  4
code_0e1a:
			ret     
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
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
			pushi    1
			pushi    129
			callb    proc0_5,  2
			not     
			bnt      code_0e97
			pushi    0
			callb    proc0_2,  0
code_0e97:
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_0fb4
			lsl      local0
			ldi      220
			eq?     
			bnt      code_0f17
			ldi      21
			bnt      code_0ef1
			ldi      36
			ldi      37
			ldi      38
			ldi      50
			ldi      56
			ldi      67
			ldi      75
			ldi      98
			ldi      99
			ldi      103
			ldi      115
			ldi      119
			ldi      135
			ldi      167
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      35
			gt?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      150
			lt?     
			bnt      code_0f67
			ldi      155
			sag      global104
			jmp      code_0f67
code_0ef1:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      170
			gt?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      285
			lt?     
			bnt      code_0f67
			ldi      165
			sag      global104
			jmp      code_0f67
code_0f17:
			lsl      local0
			ldi      240
			eq?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_0f44
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      60
			gt?     
			bnt      code_0f44
			ldi      56
			sag      global104
			jmp      code_0f67
code_0f44:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      160
			ge?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      260
			lt?     
			bnt      code_0f67
			ldi      264
			sag      global104
code_0f67:
			pushi    #posn
			pushi    2
			lsg      global104
			pushi    240
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_0f9f
			lsg      global137
			ldi      3
			gt?     
			bnt      code_0f9f
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_0f9f:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsg      global104
			pushi    184
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_0fb4:
			dup     
			ldi      2
			eq?     
			bnt      code_1006
			pushi    #posn
			pushi    2
			pushi    65516
			lsg      global105
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_0ff2
			lsg      global137
			ldi      3
			gt?     
			bnt      code_0ff2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_0ff2:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    60
			lsg      global105
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_1006:
			dup     
			ldi      3
			eq?     
			bnt      code_1058
			pushi    #posn
			pushi    2
			lsg      global104
			pushi    89
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1044
			lsg      global137
			ldi      3
			gt?     
			bnt      code_1044
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_1044:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsg      global104
			pushi    110
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_1058:
			dup     
			ldi      4
			eq?     
			bnt      code_10ac
			pushi    #posn
			pushi    2
			pushi    345
			lsg      global105
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1097
			lsg      global137
			ldi      3
			gt?     
			bnt      code_1097
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_1097:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    260
			lsg      global105
			pushSelf
			lag      global0
			send     12
			jmp      code_10c9
code_10ac:
			pushi    #posn
			pushi    2
			pushi    185
			pushi    130
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lag      global0
			send     18
			pushi    0
			callb    proc0_2,  0
			ldi      12
			aTop     ticks
code_10c9:
			toss    
			jmp      code_1264
code_10cd:
			dup     
			ldi      1
			eq?     
			bnt      code_1104
			pushi    1
			pushi    179
			callb    proc0_5,  2
			bnt      code_10fb
			pushi    1
			pushi    179
			callb    proc0_7,  2
			pushi    5
			pushi    1
			lea      @local25
			push    
			lea      @local30
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1264
code_10fb:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1264
code_1104:
			dup     
			ldi      2
			eq?     
			bnt      code_1264
			pushi    0
			callb    proc0_4,  0
			lsg      global12
			ldi      120
			eq?     
			bnt      code_1132
			pushi    1
			pushi    70
			callb    proc0_5,  2
			bnt      code_1132
			pushi    1
			pushi    70
			callb    proc0_7,  2
			pushi    3
			pushi    1220
			pushi    9
			pushi    0
			calle    proc13_4,  6
code_1132:
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1158
			lsg      global126
			ldi      1
			ne?     
			bnt      code_1158
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    0
			calle    proc750_2,  0
			jmp      code_1164
code_1158:
			pushi    #actions
			pushi    1
			lofsa    forestBlown
			push    
			lag      global0
			send     6
code_1164:
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			not     
			bnt      code_1255
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_1255
			lsg      global130
			ldi      8
			lt?     
			bnt      code_1255
			lsg      global112
			ldi      132
			eq?     
			bt       code_1237
			lsg      global112
			ldi      155
			eq?     
			bt       code_1237
			lsg      global112
			ldi      34
			eq?     
			bt       code_1237
			lsg      global112
			ldi      53
			eq?     
			bt       code_1237
			lsg      global112
			ldi      120
			eq?     
			bt       code_1237
			lsg      global112
			ldi      66
			eq?     
			bt       code_1237
			lsg      global112
			ldi      20
			eq?     
			bt       code_1237
			lsg      global112
			ldi      114
			eq?     
			bt       code_1237
			lsg      global112
			ldi      22
			eq?     
			bt       code_1237
			lsg      global112
			ldi      122
			eq?     
			bt       code_1237
			lsg      global112
			ldi      88
			eq?     
			bt       code_1237
			lsg      global112
			ldi      49
			eq?     
code_1237:
			not     
			bnt      code_1255
			pushi    2
			pushi    130
			pushi    185
			callk    Load,  4
			pushi    #setScript
			pushi    1
			lofsa    PT
			push    
			lofsa    forest
			send     6
			jmp      code_125f
code_1255:
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    forest
			send     6
code_125f:
			pushi    #dispose
			pushi    0
			self     4
code_1264:
			toss    
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_131a
			pushi    0
			callb    proc0_3,  0
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
			pTos     register
			dup     
			ldi      3
			eq?     
			bnt      code_12d5
			ldi      240
			sat      temp1
			jmp      code_12f4
code_12d5:
			dup     
			ldi      2
			eq?     
			bnt      code_12e6
			lst      temp0
			ldi      20
			add     
			sat      temp0
			jmp      code_12f4
code_12e6:
			dup     
			ldi      4
			eq?     
			bnt      code_12f4
			lst      temp0
			ldi      20
			sub     
			sat      temp0
code_12f4:
			toss    
			pTos     register
			ldi      1
			ne?     
			bnt      code_1311
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     12
			jmp      code_18dc
code_1311:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_18dc
code_131a:
			dup     
			ldi      1
			eq?     
			bnt      code_1456
			lsg      global108
			dup     
			ldi      1
			eq?     
			bnt      code_139e
			lsg      global112
			ldi      59
			eq?     
			bt       code_1340
			lsg      global112
			ldi      23
			eq?     
			bt       code_1340
			lsg      global112
			ldi      155
			eq?     
code_1340:
			bnt      code_1365
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      210
			gt?     
			bnt      code_135c
			pushi    #x
			pushi    1
			pushi    210
			lag      global0
			send     6
code_135c:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1452
code_1365:
			lsg      global112
			ldi      18
			eq?     
			bt       code_1372
			lsg      global112
			ldi      33
			eq?     
code_1372:
			bnt      code_1395
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      110
			lt?     
			bnt      code_138c
			pushi    #x
			pushi    1
			pushi    110
			lag      global0
			send     6
code_138c:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1452
code_1395:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1452
code_139e:
			dup     
			ldi      3
			eq?     
			bnt      code_141b
			lsg      global112
			ldi      75
			eq?     
			bt       code_13bc
			lsg      global112
			ldi      155
			eq?     
			bt       code_13bc
			lsg      global112
			ldi      167
			eq?     
code_13bc:
			bnt      code_13e1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      210
			gt?     
			bnt      code_13d8
			pushi    #x
			pushi    1
			pushi    210
			lag      global0
			send     6
code_13d8:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1452
code_13e1:
			lsg      global112
			ldi      130
			eq?     
			bt       code_13ef
			lsg      global112
			ldi      65
			eq?     
code_13ef:
			bnt      code_1412
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      110
			lt?     
			bnt      code_1409
			pushi    #x
			pushi    1
			pushi    110
			lag      global0
			send     6
code_1409:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1452
code_1412:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1452
code_141b:
			lsg      global112
			ldi      75
			eq?     
			bt       code_1432
			lsg      global112
			ldi      155
			eq?     
			bt       code_1432
			lsg      global112
			ldi      167
			eq?     
code_1432:
			bnt      code_144c
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      120
			gt?     
			bnt      code_144c
			pushi    #y
			pushi    1
			pushi    120
			lag      global0
			send     6
code_144c:
			pushi    #cue
			pushi    0
			self     4
code_1452:
			toss    
			jmp      code_18dc
code_1456:
			dup     
			ldi      2
			eq?     
			bnt      code_18dc
			pushi    1
			pushi    199
			callb    proc0_5,  2
			not     
			bnt      code_14a0
			lsg      global130
			ldi      2
			eq?     
			bnt      code_14a0
			pushi    13
			lsg      global112
			pushi    19
			pushi    40
			pushi    52
			pushi    70
			pushi    82
			pushi    100
			pushi    106
			pushi    118
			pushi    130
			pushi    136
			pushi    151
			pushi    166
			calle    proc999_5,  26
			bnt      code_14a0
			pushi    1
			pushi    199
			callb    proc0_6,  2
code_14a0:
			lsg      global130
			ldi      8
			lt?     
			bnt      code_14c2
			pushi    #actions
			pushi    1
			lofsa    forestBlown
			push    
			lag      global0
			send     6
			pushi    #doit
			pushi    0
			pushi    2
			pushi    185
			pushi    4
			callk    ScriptID,  4
			send     4
code_14c2:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_14ec
			pushi    1
			pushi    36
			callb    proc0_5,  2
			bnt      code_14ec
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #actions
			pushi    1
			lofsa    forestBlown
			push    
			lag      global0
			send     6
			jmp      code_1513
code_14ec:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_1513
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_1513
			pushi    #enable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #actions
			pushi    1
			lofsa    forestBlown
			push    
			lag      global0
			send     6
code_1513:
			pushi    1
			pushi    42
			callb    proc0_5,  2
			bnt      code_1538
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_1538
			ldi      1
			sal      local3
			pushi    #newRoom
			pushi    1
			pushi    180
			lag      global2
			send     6
			jmp      code_18cd
code_1538:
			lsg      global130
			ldi      2
			eq?     
			bnt      code_155c
			pushi    1
			pushi    182
			callb    proc0_5,  2
			bnt      code_155c
			ldi      1
			sal      local1
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_18cd
code_155c:
			lsg      global112
			ldi      24
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      39
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      54
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      70
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      86
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      101
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      117
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      133
			eq?     
			bt       code_15a3
			lsg      global112
			ldi      149
			eq?     
code_15a3:
			bnt      code_15ab
			lsg      global108
			ldi      2
			eq?     
code_15ab:
			bt       code_1645
			lsg      global112
			ldi      9
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      25
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      40
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      55
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      71
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      87
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      102
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      118
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      134
			eq?     
			bt       code_15fd
			lsg      global112
			ldi      150
			eq?     
code_15fd:
			bnt      code_1605
			lsg      global108
			ldi      4
			eq?     
code_1605:
			bt       code_1645
			lsg      global112
			ldi      24
			eq?     
			bt       code_161d
			lsg      global112
			ldi      39
			eq?     
			bt       code_161d
			lsg      global112
			ldi      86
			eq?     
code_161d:
			bnt      code_1625
			lsg      global108
			ldi      3
			eq?     
code_1625:
			bt       code_1645
			lsg      global112
			ldi      40
			eq?     
			bt       code_163d
			lsg      global112
			ldi      55
			eq?     
			bt       code_163d
			lsg      global112
			ldi      102
			eq?     
code_163d:
			bnt      code_1674
			lsg      global108
			ldi      1
			eq?     
code_1645:
			bnt      code_1674
			ldi      1
			sal      local4
			lsg      global108
			ldi      4
			eq?     
			bnt      code_1663
			lsg      global112
			ldi      71
			eq?     
			bnt      code_1663
			ldi      110
			sat      temp2
			jmp      code_1667
code_1663:
			ldi      120
			sat      temp2
code_1667:
			pushi    #newRoom
			pushi    1
			lst      temp2
			lag      global2
			send     6
			jmp      code_18cd
code_1674:
			lsg      global112
			ldi      48
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      81
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      97
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      113
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      2
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      17
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      32
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      64
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      129
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      146
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      166
			eq?     
			bt       code_16d5
			lsg      global112
			ldi      182
			eq?     
code_16d5:
			bnt      code_16dd
			lsg      global108
			ldi      4
			eq?     
code_16dd:
			bt       code_1834
			lsg      global112
			ldi      43
			eq?     
			bt       code_1741
			lsg      global112
			ldi      91
			eq?     
			bt       code_1741
			lsg      global112
			ldi      107
			eq?     
			bt       code_1741
			lsg      global112
			ldi      123
			eq?     
			bt       code_1741
			lsg      global112
			ldi      139
			eq?     
			bt       code_1741
			lsg      global112
			ldi      76
			eq?     
			bt       code_1741
			lsg      global112
			ldi      171
			eq?     
			bt       code_1741
			lsg      global112
			ldi      183
			eq?     
			bt       code_1741
			lsg      global112
			ldi      7
			eq?     
			bt       code_1741
			lsg      global112
			ldi      27
			eq?     
			bt       code_1741
			lsg      global112
			ldi      60
			eq?     
			bt       code_1741
			lsg      global112
			ldi      156
			eq?     
code_1741:
			bnt      code_1749
			lsg      global108
			ldi      2
			eq?     
code_1749:
			bt       code_1834
			lsg      global112
			ldi      3
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      4
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      5
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      6
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      24
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      25
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      26
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      2
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      17
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      32
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      7
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      27
			eq?     
			bt       code_17b1
			lsg      global112
			ldi      60
			eq?     
code_17b1:
			bnt      code_17b9
			lsg      global108
			ldi      1
			eq?     
code_17b9:
			bt       code_1834
			lsg      global112
			ldi      147
			eq?     
			bt       code_182c
			lsg      global112
			ldi      148
			eq?     
			bt       code_182c
			lsg      global112
			ldi      149
			eq?     
			bt       code_182c
			lsg      global112
			ldi      168
			eq?     
			bt       code_182c
			lsg      global112
			ldi      169
			eq?     
			bt       code_182c
			lsg      global112
			ldi      170
			eq?     
			bt       code_182c
			lsg      global112
			ldi      182
			eq?     
			bt       code_182c
			lsg      global112
			ldi      64
			eq?     
			bt       code_182c
			lsg      global112
			ldi      129
			eq?     
			bt       code_182c
			lsg      global112
			ldi      146
			eq?     
			bt       code_182c
			lsg      global112
			ldi      76
			eq?     
			bt       code_182c
			lsg      global112
			ldi      171
			eq?     
			bt       code_182c
			lsg      global112
			ldi      183
			eq?     
code_182c:
			bnt      code_18c2
			lsg      global108
			ldi      3
			eq?     
code_1834:
			bnt      code_18c2
			ldi      1
			sal      local5
			lsg      global130
			ldi      9
			eq?     
			bnt      code_1878
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1878
			pushi    1
			pushi    36
			callb    proc0_5,  2
			not     
			bnt      code_1878
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			pushi    16
			pushi    1
			lag      global113
			send     12
			pushi    1
			pushi    36
			callb    proc0_6,  2
			pushi    0
			call     localproc_0022,  0
			ldi      0
			sag      global137
			jmp      code_18b2
code_1878:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_18b2
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_18b2
			pushi    1
			pushi    38
			callb    proc0_5,  2
			not     
			bnt      code_18b2
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			pushi    16
			pushi    1
			lag      global113
			send     12
			pushi    1
			pushi    38
			callb    proc0_6,  2
			pushi    0
			call     localproc_0022,  0
			ldi      0
			sag      global137
code_18b2:
			ldi      100
			sat      temp2
			pushi    #newRoom
			pushi    1
			push    
			lag      global2
			send     6
			jmp      code_18cd
code_18c2:
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
code_18cd:
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    forest
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_18dc:
			toss    
			ret     
		)
	)
)

(instance bunny of Actor
	(properties
		view 764
		signal $4000
		xStep 8
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    #init
			pushi    0
			super    Actor,  4
			ldi      1
			sal      local6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sat      temp0
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      16384
			or      
			push    
			lag      global0
			send     6
			pushi    #number
			pushi    1
			pushi    2
			pushi    921
			pushi    923
			callk    Random,  4
			push    
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      185
			gt?     
			bnt      code_19ea
			lst      temp0
			ldi      2
			eq?     
			bnt      code_19ab
			pushi    #x
			pushi    1
			pushi    65521
			pushi    3
			pushi    1
			pushi    2
			pushi    91
			pushi    101
			callk    Random,  4
			push    
			pushi    162
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    330
			pushi    2
			pushi    91
			pushi    101
			callk    Random,  4
			push    
			pushSelf
			lofsa    bunny
			send     36
			jmp      code_1a67
code_19ab:
			pushi    #x
			pushi    1
			pushi    65521
			pushi    3
			pushi    1
			pushi    2
			pushi    145
			pushi    175
			callk    Random,  4
			push    
			pushi    162
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    330
			pushi    2
			pushi    145
			pushi    175
			callk    Random,  4
			push    
			pushSelf
			lofsa    bunny
			send     36
			jmp      code_1a67
code_19ea:
			lst      temp0
			ldi      2
			eq?     
			bnt      code_1a2c
			pushi    #x
			pushi    1
			pushi    330
			pushi    3
			pushi    1
			pushi    2
			pushi    91
			pushi    101
			callk    Random,  4
			push    
			pushi    162
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65521
			pushi    2
			pushi    91
			pushi    101
			callk    Random,  4
			push    
			pushSelf
			lofsa    bunny
			send     36
			jmp      code_1a67
code_1a2c:
			pushi    #x
			pushi    1
			pushi    330
			pushi    3
			pushi    1
			pushi    2
			pushi    145
			pushi    175
			callk    Random,  4
			push    
			pushi    162
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65521
			pushi    2
			pushi    145
			pushi    175
			callk    Random,  4
			push    
			pushSelf
			lofsa    bunny
			send     36
code_1a67:
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a7f
			pushi    3
			pushi    1220
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_1af6
code_1a7f:
			dup     
			ldi      10
			eq?     
			bnt      code_1a94
			pushi    3
			pushi    1220
			pushi    1
			pushi    0
			calle    proc13_4,  6
			jmp      code_1af6
code_1a94:
			dup     
			ldi      3
			eq?     
			bnt      code_1aa9
			pushi    3
			pushi    1220
			pushi    2
			pushi    0
			calle    proc13_4,  6
			jmp      code_1af6
code_1aa9:
			dup     
			ldi      5
			eq?     
			bnt      code_1abf
			pushi    3
			pushi    1220
			pushi    3
			pushi    0
			calle    proc13_4,  6
			jmp      code_1af6
code_1abf:
			dup     
			ldi      4
			eq?     
			bnt      code_1aeb
			lsp      param2
			ldi      4
			eq?     
			bnt      code_1add
			pushi    3
			pushi    1220
			pushi    4
			pushi    0
			calle    proc13_4,  6
			jmp      code_1af6
code_1add:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_1af6
code_1aeb:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_1af6:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			ldi      0
			sal      local6
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      49151
			and     
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
			pushi    #cue
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance robin of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    PicView,  4
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			pushi    4
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
			self     36
			ret     
		)
	)
)

(instance robinHead of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    PicView,  4
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lag      global109
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lag      global109
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lag      global109
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global109
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global109
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global109
			send     4
			push    
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			lag      global109
			send     4
			push    
			self     42
			ret     
		)
	)
)

(instance funnyBunny of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    PicView,  4
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    bunny
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    bunny
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    bunny
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    bunny
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    bunny
			send     4
			push    
			self     30
			ret     
		)
	)
)

(instance buck of Actor
	(properties
		view 763
		signal $4000
		xStep 80
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1d9c
			pushi    3
			pushi    1220
			pushi    5
			pushi    0
			calle    proc13_4,  6
			jmp      code_1dff
code_1d9c:
			dup     
			ldi      10
			eq?     
			bnt      code_1db2
			pushi    3
			pushi    1220
			pushi    6
			pushi    0
			calle    proc13_4,  6
			jmp      code_1dff
code_1db2:
			dup     
			ldi      5
			eq?     
			bnt      code_1dc8
			pushi    3
			pushi    1220
			pushi    7
			pushi    0
			calle    proc13_4,  6
			jmp      code_1dff
code_1dc8:
			dup     
			ldi      4
			eq?     
			bnt      code_1df4
			lsp      param2
			ldi      4
			eq?     
			bnt      code_1de6
			pushi    3
			pushi    1220
			pushi    8
			pushi    0
			calle    proc13_4,  6
			jmp      code_1dff
code_1de6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_1dff
code_1df4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_1dff:
			toss    
			ret     
		)
	)
)

(instance doe1 of Actor
	(properties
		view 763
		signal $4000
		xStep 80
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    buck
			send     6
			ret     
		)
	)
)

(instance doe2 of Actor
	(properties
		view 763
		signal $4000
		xStep 80
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    buck
			send     6
			ret     
		)
	)
)

(instance stampede of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20fe
			pushi    #number
			pushi    1
			pushi    2
			pushi    897
			pushi    899
			callk    Random,  4
			push    
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global114
			send     16
			pTos     register
			ldi      2
			eq?     
			bnt      code_206b
			pushi    #x
			pushi    1
			pushi    65521
			pushi    3
			pushi    1
			pushi    140
			pushi    162
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    400
			pushi    115
			pushSelf
			lofsa    buck
			send     40
			pushi    #x
			pushi    1
			pushi    65506
			pushi    3
			pushi    1
			pushi    120
			pushi    162
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    395
			pushi    95
			lofsa    doe1
			send     44
			pushi    #x
			pushi    1
			pushi    65511
			pushi    3
			pushi    1
			pushi    182
			pushi    162
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    380
			pushi    157
			lofsa    doe2
			send     44
			jmp      code_2122
code_206b:
			pushi    #x
			pushi    1
			pushi    370
			pushi    3
			pushi    1
			pushi    120
			pushi    162
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65461
			pushi    160
			pushSelf
			lofsa    buck
			send     40
			pushi    #x
			pushi    1
			pushi    325
			pushi    3
			pushi    1
			pushi    90
			pushi    162
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    65466
			pushi    130
			lofsa    doe1
			send     44
			pushi    #x
			pushi    1
			pushi    360
			pushi    3
			pushi    1
			pushi    140
			pushi    162
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    65481
			pushi    182
			lofsa    doe2
			send     44
			jmp      code_2122
code_20fe:
			dup     
			ldi      1
			eq?     
			bnt      code_2122
			pushi    #dispose
			pushi    0
			lofsa    doe1
			send     4
			pushi    #dispose
			pushi    0
			lofsa    doe2
			send     4
			pushi    #dispose
			pushi    0
			lofsa    buck
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_2122:
			toss    
			ret     
		)
	)
)

(instance handSignCode of Code
	(properties)
	
	(method (doit)
		(asm
			lsg      global126
			ldi      0
			ne?     
			bnt      code_23ba
			lsg      global112
			ldi      132
			eq?     
			bt       code_2338
			lsg      global112
			ldi      155
			eq?     
			bt       code_2338
			lsg      global112
			ldi      34
			eq?     
			bt       code_2338
			lsg      global112
			ldi      53
			eq?     
			bt       code_2338
			lsg      global112
			ldi      120
			eq?     
			bt       code_2338
			lsg      global112
			ldi      66
			eq?     
			bt       code_2338
			lsg      global112
			ldi      20
			eq?     
			bt       code_2338
			lsg      global112
			ldi      114
			eq?     
			bt       code_2338
			lsg      global112
			ldi      22
			eq?     
			bt       code_2338
			lsg      global112
			ldi      122
			eq?     
			bt       code_2338
			lsg      global112
			ldi      88
			eq?     
			bt       code_2338
			lsg      global112
			ldi      49
			eq?     
			bt       code_2338
			lsg      global112
			ldi      116
			eq?     
			bt       code_2338
			lsg      global112
			ldi      117
			eq?     
			bt       code_2338
			lsg      global112
			ldi      131
			eq?     
			bt       code_2338
			lsg      global112
			ldi      133
			eq?     
			bt       code_2338
			lsg      global112
			ldi      154
			eq?     
			bt       code_2338
			lsg      global112
			ldi      18
			eq?     
			bt       code_2338
			lsg      global112
			ldi      33
			eq?     
			bt       code_2338
			lsg      global112
			ldi      35
			eq?     
			bt       code_2338
			lsg      global112
			ldi      52
			eq?     
			bt       code_2338
			lsg      global112
			ldi      54
			eq?     
			bt       code_2338
			lsg      global112
			ldi      69
			eq?     
			bt       code_2338
			lsg      global112
			ldi      119
			eq?     
			bt       code_2338
			lsg      global112
			ldi      121
			eq?     
			bt       code_2338
			lsg      global112
			ldi      135
			eq?     
			bt       code_2338
			lsg      global112
			ldi      137
			eq?     
			bt       code_2338
			lsg      global112
			ldi      51
			eq?     
			bt       code_2338
			lsg      global112
			ldi      65
			eq?     
			bt       code_2338
			lsg      global112
			ldi      82
			eq?     
			bt       code_2338
			lsg      global112
			ldi      19
			eq?     
			bt       code_2338
			lsg      global112
			ldi      21
			eq?     
			bt       code_2338
			lsg      global112
			ldi      36
			eq?     
			bt       code_2338
			lsg      global112
			ldi      98
			eq?     
			bt       code_2338
			lsg      global112
			ldi      115
			eq?     
			bt       code_2338
			lsg      global112
			ldi      130
			eq?     
			bt       code_2338
			lsg      global112
			ldi      23
			eq?     
			bt       code_2338
			lsg      global112
			ldi      37
			eq?     
			bt       code_2338
			lsg      global112
			ldi      38
			eq?     
			bt       code_2338
			lsg      global112
			ldi      106
			eq?     
			bt       code_2338
			lsg      global112
			ldi      138
			eq?     
			bt       code_2338
			lsg      global112
			ldi      50
			eq?     
			bt       code_2338
			lsg      global112
			ldi      67
			eq?     
			bt       code_2338
			lsg      global112
			ldi      68
			eq?     
			bt       code_2338
			lsg      global112
			ldi      72
			eq?     
			bt       code_2338
			lsg      global112
			ldi      83
			eq?     
			bt       code_2338
			lsg      global112
			ldi      85
			eq?     
			bt       code_2338
			lsg      global112
			ldi      86
			eq?     
			bt       code_2338
			lsg      global112
			ldi      89
			eq?     
			bt       code_2338
			lsg      global112
			ldi      99
			eq?     
			bt       code_2338
			lsg      global112
			ldi      100
			eq?     
			bt       code_2338
			lsg      global112
			ldi      101
			eq?     
			bt       code_2338
			lsg      global112
			ldi      104
			eq?     
			bt       code_2338
			lsg      global112
			ldi      136
			eq?     
			bt       code_2338
			lsg      global112
			ldi      151
			eq?     
			bt       code_2338
			lsg      global112
			ldi      153
			eq?     
			bt       code_2338
			lsg      global112
			ldi      167
			eq?     
code_2338:
			bnt      code_23ba
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			bnt      code_23ab
			pushi    3
			pushi    1220
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_2a59
code_23ab:
			pushi    3
			pushi    1220
			pushi    28
			pushi    1
			calle    proc13_4,  6
			jmp      code_2a59
code_23ba:
			lsg      global112
			ldi      132
			eq?     
			bt       code_23c9
			lsg      global112
			ldi      155
			eq?     
code_23c9:
			bnt      code_23d1
			lsg      global124
			ldi      0
			eq?     
code_23d1:
			bt       code_2466
			lsg      global112
			ldi      34
			eq?     
			bnt      code_23e1
			lsg      global124
			ldi      1
			eq?     
code_23e1:
			bt       code_2466
			lsg      global112
			ldi      53
			eq?     
			bt       code_23f1
			lsg      global112
			ldi      120
			eq?     
code_23f1:
			bnt      code_23f9
			lsg      global124
			ldi      2
			eq?     
code_23f9:
			bt       code_2466
			lsg      global112
			ldi      66
			eq?     
			bnt      code_2409
			lsg      global124
			ldi      3
			eq?     
code_2409:
			bt       code_2466
			lsg      global112
			ldi      20
			eq?     
			bnt      code_2419
			lsg      global124
			ldi      4
			eq?     
code_2419:
			bt       code_2466
			lsg      global112
			ldi      114
			eq?     
			bnt      code_2429
			lsg      global124
			ldi      5
			eq?     
code_2429:
			bt       code_2466
			lsg      global112
			ldi      22
			eq?     
			bt       code_2439
			lsg      global112
			ldi      122
			eq?     
code_2439:
			bnt      code_2441
			lsg      global124
			ldi      6
			eq?     
code_2441:
			bt       code_2466
			lsg      global112
			ldi      88
			eq?     
			bt       code_2451
			lsg      global112
			ldi      49
			eq?     
code_2451:
			bnt      code_2459
			lsg      global124
			ldi      7
			eq?     
code_2459:
			bt       code_2466
			ldi      1
			bnt      code_2652
			lsg      global124
			ldi      9
			eq?     
code_2466:
			bnt      code_2652
			lsg      global112
			ldi      132
			eq?     
			bt       code_263b
			lsg      global112
			ldi      155
			eq?     
			bt       code_263b
			lsg      global112
			ldi      34
			eq?     
			bt       code_263b
			lsg      global112
			ldi      53
			eq?     
			bt       code_263b
			lsg      global112
			ldi      120
			eq?     
			bt       code_263b
			lsg      global112
			ldi      66
			eq?     
			bt       code_263b
			lsg      global112
			ldi      20
			eq?     
			bt       code_263b
			lsg      global112
			ldi      114
			eq?     
			bt       code_263b
			lsg      global112
			ldi      22
			eq?     
			bt       code_263b
			lsg      global112
			ldi      122
			eq?     
			bt       code_263b
			lsg      global112
			ldi      88
			eq?     
			bt       code_263b
			lsg      global112
			ldi      49
			eq?     
			bt       code_263b
			lsg      global112
			ldi      116
			eq?     
			bt       code_263b
			lsg      global112
			ldi      117
			eq?     
			bt       code_263b
			lsg      global112
			ldi      131
			eq?     
			bt       code_263b
			lsg      global112
			ldi      133
			eq?     
			bt       code_263b
			lsg      global112
			ldi      154
			eq?     
			bt       code_263b
			lsg      global112
			ldi      18
			eq?     
			bt       code_263b
			lsg      global112
			ldi      33
			eq?     
			bt       code_263b
			lsg      global112
			ldi      35
			eq?     
			bt       code_263b
			lsg      global112
			ldi      52
			eq?     
			bt       code_263b
			lsg      global112
			ldi      54
			eq?     
			bt       code_263b
			lsg      global112
			ldi      69
			eq?     
			bt       code_263b
			lsg      global112
			ldi      119
			eq?     
			bt       code_263b
			lsg      global112
			ldi      121
			eq?     
			bt       code_263b
			lsg      global112
			ldi      135
			eq?     
			bt       code_263b
			lsg      global112
			ldi      137
			eq?     
			bt       code_263b
			lsg      global112
			ldi      51
			eq?     
			bt       code_263b
			lsg      global112
			ldi      65
			eq?     
			bt       code_263b
			lsg      global112
			ldi      82
			eq?     
			bt       code_263b
			lsg      global112
			ldi      19
			eq?     
			bt       code_263b
			lsg      global112
			ldi      21
			eq?     
			bt       code_263b
			lsg      global112
			ldi      36
			eq?     
			bt       code_263b
			lsg      global112
			ldi      98
			eq?     
			bt       code_263b
			lsg      global112
			ldi      115
			eq?     
			bt       code_263b
			lsg      global112
			ldi      130
			eq?     
			bt       code_263b
			lsg      global112
			ldi      23
			eq?     
			bt       code_263b
			lsg      global112
			ldi      37
			eq?     
			bt       code_263b
			lsg      global112
			ldi      38
			eq?     
			bt       code_263b
			lsg      global112
			ldi      106
			eq?     
			bt       code_263b
			lsg      global112
			ldi      138
			eq?     
			bt       code_263b
			lsg      global112
			ldi      50
			eq?     
			bt       code_263b
			lsg      global112
			ldi      67
			eq?     
			bt       code_263b
			lsg      global112
			ldi      68
			eq?     
			bt       code_263b
			lsg      global112
			ldi      72
			eq?     
			bt       code_263b
			lsg      global112
			ldi      83
			eq?     
			bt       code_263b
			lsg      global112
			ldi      85
			eq?     
			bt       code_263b
			lsg      global112
			ldi      86
			eq?     
			bt       code_263b
			lsg      global112
			ldi      89
			eq?     
			bt       code_263b
			lsg      global112
			ldi      99
			eq?     
			bt       code_263b
			lsg      global112
			ldi      100
			eq?     
			bt       code_263b
			lsg      global112
			ldi      101
			eq?     
			bt       code_263b
			lsg      global112
			ldi      104
			eq?     
			bt       code_263b
			lsg      global112
			ldi      136
			eq?     
			bt       code_263b
			lsg      global112
			ldi      151
			eq?     
			bt       code_263b
			lsg      global112
			ldi      153
			eq?     
			bt       code_263b
			lsg      global112
			ldi      167
			eq?     
code_263b:
			bnt      code_2652
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_2a59
code_2652:
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_284e
			pushi    1
			pushi    35
			callb    proc0_5,  2
			not     
			bnt      code_284e
			lsg      global112
			ldi      132
			eq?     
			bt       code_2837
			lsg      global112
			ldi      155
			eq?     
			bt       code_2837
			lsg      global112
			ldi      34
			eq?     
			bt       code_2837
			lsg      global112
			ldi      53
			eq?     
			bt       code_2837
			lsg      global112
			ldi      120
			eq?     
			bt       code_2837
			lsg      global112
			ldi      66
			eq?     
			bt       code_2837
			lsg      global112
			ldi      20
			eq?     
			bt       code_2837
			lsg      global112
			ldi      114
			eq?     
			bt       code_2837
			lsg      global112
			ldi      22
			eq?     
			bt       code_2837
			lsg      global112
			ldi      122
			eq?     
			bt       code_2837
			lsg      global112
			ldi      88
			eq?     
			bt       code_2837
			lsg      global112
			ldi      49
			eq?     
			bt       code_2837
			lsg      global112
			ldi      116
			eq?     
			bt       code_2837
			lsg      global112
			ldi      117
			eq?     
			bt       code_2837
			lsg      global112
			ldi      131
			eq?     
			bt       code_2837
			lsg      global112
			ldi      133
			eq?     
			bt       code_2837
			lsg      global112
			ldi      154
			eq?     
			bt       code_2837
			lsg      global112
			ldi      18
			eq?     
			bt       code_2837
			lsg      global112
			ldi      33
			eq?     
			bt       code_2837
			lsg      global112
			ldi      35
			eq?     
			bt       code_2837
			lsg      global112
			ldi      52
			eq?     
			bt       code_2837
			lsg      global112
			ldi      54
			eq?     
			bt       code_2837
			lsg      global112
			ldi      69
			eq?     
			bt       code_2837
			lsg      global112
			ldi      119
			eq?     
			bt       code_2837
			lsg      global112
			ldi      121
			eq?     
			bt       code_2837
			lsg      global112
			ldi      135
			eq?     
			bt       code_2837
			lsg      global112
			ldi      137
			eq?     
			bt       code_2837
			lsg      global112
			ldi      51
			eq?     
			bt       code_2837
			lsg      global112
			ldi      65
			eq?     
			bt       code_2837
			lsg      global112
			ldi      82
			eq?     
			bt       code_2837
			lsg      global112
			ldi      19
			eq?     
			bt       code_2837
			lsg      global112
			ldi      21
			eq?     
			bt       code_2837
			lsg      global112
			ldi      36
			eq?     
			bt       code_2837
			lsg      global112
			ldi      98
			eq?     
			bt       code_2837
			lsg      global112
			ldi      115
			eq?     
			bt       code_2837
			lsg      global112
			ldi      130
			eq?     
			bt       code_2837
			lsg      global112
			ldi      23
			eq?     
			bt       code_2837
			lsg      global112
			ldi      37
			eq?     
			bt       code_2837
			lsg      global112
			ldi      38
			eq?     
			bt       code_2837
			lsg      global112
			ldi      106
			eq?     
			bt       code_2837
			lsg      global112
			ldi      138
			eq?     
			bt       code_2837
			lsg      global112
			ldi      50
			eq?     
			bt       code_2837
			lsg      global112
			ldi      67
			eq?     
			bt       code_2837
			lsg      global112
			ldi      68
			eq?     
			bt       code_2837
			lsg      global112
			ldi      72
			eq?     
			bt       code_2837
			lsg      global112
			ldi      83
			eq?     
			bt       code_2837
			lsg      global112
			ldi      85
			eq?     
			bt       code_2837
			lsg      global112
			ldi      86
			eq?     
			bt       code_2837
			lsg      global112
			ldi      89
			eq?     
			bt       code_2837
			lsg      global112
			ldi      99
			eq?     
			bt       code_2837
			lsg      global112
			ldi      100
			eq?     
			bt       code_2837
			lsg      global112
			ldi      101
			eq?     
			bt       code_2837
			lsg      global112
			ldi      104
			eq?     
			bt       code_2837
			lsg      global112
			ldi      136
			eq?     
			bt       code_2837
			lsg      global112
			ldi      151
			eq?     
			bt       code_2837
			lsg      global112
			ldi      153
			eq?     
			bt       code_2837
			lsg      global112
			ldi      167
			eq?     
code_2837:
			bnt      code_284e
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_2a59
code_284e:
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_2a59
			pushi    1
			pushi    35
			callb    proc0_5,  2
			bnt      code_2a59
			lsg      global137
			ldi      3
			lt?     
			bnt      code_2a59
			pushi    1
			pushi    129
			callb    proc0_5,  2
			not     
			bnt      code_2a59
			lsg      global112
			ldi      132
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      155
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      34
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      53
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      120
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      66
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      20
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      114
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      22
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      122
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      88
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      49
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      116
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      117
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      131
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      133
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      154
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      18
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      33
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      35
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      52
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      54
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      69
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      119
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      121
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      135
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      137
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      51
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      65
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      82
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      19
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      21
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      36
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      98
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      115
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      130
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      23
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      37
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      38
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      106
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      138
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      50
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      67
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      68
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      72
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      83
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      85
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      86
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      89
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      99
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      100
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      101
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      104
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      136
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      151
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      153
			eq?     
			bt       code_2a45
			lsg      global112
			ldi      167
			eq?     
code_2a45:
			bnt      code_2a59
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
code_2a59:
			ret     
		)
	)
)

(instance forestBlown of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_2b41
			lsp      param2
			ldi      1
			eq?     
			bnt      code_2b41
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			bnt      code_2afc
			pushi    3
			pushi    1220
			pushi    30
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2b41
code_2afc:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_2b0a
			pushi    1
			pushi    36
			callb    proc0_5,  2
code_2b0a:
			bt       code_2b1b
			lsg      global130
			ldi      12
			eq?     
			bnt      code_2b2f
			pushi    1
			pushi    38
			callb    proc0_5,  2
code_2b1b:
			bnt      code_2b2f
			pushi    3
			pushi    1220
			pushi    27
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2b41
code_2b2f:
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
code_2b41:
			ret     
		)
	)
)

(instance PT of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2b75
			ldi      6
			aTop     seconds
			jmp      code_2bfa
code_2b75:
			dup     
			ldi      1
			eq?     
			bnt      code_2bc5
			pushi    1
			lag      global130
			le?     
			bnt      code_2b99
			pprev   
			ldi      3
			le?     
			bnt      code_2b99
			pushi    2
			pushi    600
			pushi    2100
			callk    Random,  4
			aTop     ticks
			jmp      code_2bfa
code_2b99:
			pushi    4
			lag      global130
			le?     
			bnt      code_2bb7
			pprev   
			ldi      6
			le?     
			bnt      code_2bb7
			pushi    2
			pushi    1800
			pushi    6000
			callk    Random,  4
			aTop     ticks
			jmp      code_2bfa
code_2bb7:
			pushi    2
			pushi    60
			pushi    900
			callk    Random,  4
			aTop     ticks
			jmp      code_2bfa
code_2bc5:
			dup     
			ldi      2
			eq?     
			bnt      code_2bfa
			pushi    1
			pushi    126
			callb    proc0_5,  2
			not     
			bnt      code_2bf5
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_2bf5
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    185
			pushi    1
			callk    ScriptID,  4
			push    
			lofsa    forest
			send     6
			jmp      code_2bfa
code_2bf5:
			pushi    #dispose
			pushi    0
			self     4
code_2bfa:
			toss    
			ret     
		)
	)
)
