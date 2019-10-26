;;; Sierra Script 1.0 - (do not remove this comment)
(script# 225)
(include sci.sh)
(use n000)
(use n013)
(use n222)
(use n232)
(use n242)
(use n255)
(use n750)
(use n806)
(use n992)
(use n998)
(use n999)

(public
	proc225_0 0
	proc225_1 1
	proc225_2 2
	moveBushes 3
	liveBush 4
	treeClue 5
	dummyHint 6
	makeClue 7
	dumpClue 8
	dummyBush 9
)

(local
	[local0 8] = [7102 7108 7114 7119 7124 7134 7144 7154]
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	[local16 4]
	[local20 96] = [34 121 260 227 45 164 163 285 49 34 199 267 34 124 201 214 48 88 185 198 41 84 163 288 35 120 254 219 49 174 147 284 58 42 164 295 76 180 259 221 38 177 142 280 40 87 164 272 23 114 221 297 47 170 256 289 52 143 102 189 53 183 215 280 42 167 167 293 27 86 136 238 53 178 291 -1 10 176 275 -1 32 264 161 -1 84 189 288 217 54 164 249 295 31 58 143 211]
	[local116 96] = [116 118 138 185 117 102 183 164 106 160 151 102 121 121 90 182 156 89 103 185 161 108 184 140 119 119 141 188 115 102 181 165 107 160 189 140 123 92 141 188 119 104 189 182 163 107 189 100 123 121 188 143 118 105 92 181 106 84 102 189 119 89 185 138 155 102 178 180 159 107 184 150 120 89 144 -1 116 102 134 -1 107 103 189 -1 127 95 147 187 121 108 93 186 164 113 89 159]
	[local212 4] = [0 1 0 1]
	[local216 24] = [174 314 27 0 0 161 305 307 173 287 65 -15 0 156 305 316 151 300 10 0 0 178 305 321]
	[local240 24] = [85 60 73 118 223 235 221 130 77 63 83 145 223 221 221 158 81 76 99 152 223 229 221 142]
	[local264 8]
	[local272 2] = [272 43]
	[local274 4] = [159 272 170 300]
	[local278 6] = [294 294 272 166 43 294]
	[local284 6] = [23 23 272 166 43 23]
	[local290 9] = [294 294 272 159 55 30 100 200 300]
	[local299 9] = [23 23 55 159 272 30 100 200 300]
	[local308 10] = [272 55 159 272 166 43 30 100 200 300]
	[local318 3] = [189 99 235]
	[local321 3] = [189 91 235]
	[local324 6] = [189 99 86 86 86 230]
	[local330 6] = [189 91 86 86 86 230]
	[local336 9] = [99 189 189 189 189 230 235 230 220]
	[local345 9] = [189 91 181 189 189 235 230 220 230]
	[local354 10] = [189 189 189 86 86 86 230 235 230 220]
	[local364 4] = [189 189 230 230]
	local368
	[local369 2]
)
(procedure (proc225_0 &tmp temp0)
	(asm
		pushi    #picture
		pushi    0
		lag      global2
		send     4
		push    
		dup     
		ldi      220
		eq?     
		bnt      code_0054
		ldi      0
		sal      local14
		jmp      code_006f
code_0054:
		dup     
		ldi      230
		eq?     
		bnt      code_0063
		ldi      4
		sal      local14
		jmp      code_006f
code_0063:
		dup     
		ldi      240
		eq?     
		bnt      code_006f
		ldi      8
		sal      local14
code_006f:
		toss    
		lsg      global112
		ldi      34
		eq?     
		bnt      code_007f
		ldi      0
		sal      local15
		jmp      code_0107
code_007f:
		lsg      global112
		ldi      66
		eq?     
		bnt      code_008e
		ldi      12
		sal      local15
		jmp      code_0107
code_008e:
		lsg      global112
		ldi      114
		eq?     
		bnt      code_009d
		ldi      24
		sal      local15
		jmp      code_0107
code_009d:
		lsg      global112
		ldi      53
		eq?     
		bt       code_00aa
		lsg      global112
		ldi      120
		eq?     
code_00aa:
		bnt      code_00b4
		ldi      36
		sal      local15
		jmp      code_0107
code_00b4:
		lsg      global112
		ldi      132
		eq?     
		bt       code_00c3
		lsg      global112
		ldi      155
		eq?     
code_00c3:
		bnt      code_00cd
		ldi      48
		sal      local15
		jmp      code_0107
code_00cd:
		lsg      global112
		ldi      22
		eq?     
		bt       code_00da
		lsg      global112
		ldi      122
		eq?     
code_00da:
		bnt      code_00e4
		ldi      60
		sal      local15
		jmp      code_0107
code_00e4:
		lsg      global112
		ldi      88
		eq?     
		bt       code_00f1
		lsg      global112
		ldi      49
		eq?     
code_00f1:
		bnt      code_00fb
		ldi      72
		sal      local15
		jmp      code_0107
code_00fb:
		lsg      global112
		ldi      20
		eq?     
		bnt      code_0107
		ldi      84
		sal      local15
code_0107:
		ldi      0
		sat      temp0
code_010b:
		lst      temp0
		ldi      4
		lt?     
		bnt      code_01dc
		pushi    5
		pushi    1
		lsg      global112
		ldi      132
		eq?     
		bt       code_0125
		lsg      global112
		ldi      155
		eq?     
code_0125:
		bnt      code_012e
		ldi      234
		jmp      code_01a5
code_012e:
		lsg      global112
		ldi      34
		eq?     
		bnt      code_013c
		ldi      230
		jmp      code_01a5
code_013c:
		lsg      global112
		ldi      53
		eq?     
		bt       code_0149
		lsg      global112
		ldi      120
		eq?     
code_0149:
		bnt      code_0152
		ldi      233
		jmp      code_01a5
code_0152:
		lsg      global112
		ldi      66
		eq?     
		bnt      code_0160
		ldi      231
		jmp      code_01a5
code_0160:
		lsg      global112
		ldi      20
		eq?     
		bnt      code_016e
		ldi      237
		jmp      code_01a5
code_016e:
		lsg      global112
		ldi      114
		eq?     
		bnt      code_017c
		ldi      232
		jmp      code_01a5
code_017c:
		lsg      global112
		ldi      22
		eq?     
		bt       code_0189
		lsg      global112
		ldi      122
		eq?     
code_0189:
		bnt      code_0192
		ldi      235
		jmp      code_01a5
code_0192:
		lsg      global112
		ldi      88
		eq?     
		bt       code_019f
		lsg      global112
		ldi      49
		eq?     
code_019f:
		bnt      code_01a5
		ldi      236
code_01a5:
		push    
		pushi    6
		pushi    1
		lat      temp0
		lsli     local212
		pushi    4
		pushi    1
		push    
		lal      local15
		add     
		push    
		lal      local14
		add     
		lsli     local20
		pushi    3
		pushi    1
		lst      temp0
		lal      local15
		add     
		push    
		lal      local14
		add     
		lsli     local116
		pushi    #new
		pushi    0
		lofsa    aTree
		send     4
		push    
		lat      temp0
		sali     local16
		send     24
		+at      temp0
		jmp      code_010b
code_01dc:
		pushi    4
		ldi      0
		lsli     local16
		ldi      1
		lsli     local16
		ldi      2
		lsli     local16
		ldi      3
		lsli     local16
		calle    proc806_2,  8
		ret     
	)
)

(procedure (proc225_1)
	(asm
		lsg      global112
		ldi      18
		eq?     
		bt       code_020a
		lsg      global112
		ldi      33
		eq?     
		bt       code_020a
		lsg      global112
		ldi      35
		eq?     
code_020a:
		bnt      code_0215
		ldi      230
		sal      local9
		jmp      code_03ad
code_0215:
		lsg      global112
		ldi      51
		eq?     
		bt       code_022a
		lsg      global112
		ldi      65
		eq?     
		bt       code_022a
		lsg      global112
		ldi      82
		eq?     
code_022a:
		bnt      code_0235
		ldi      231
		sal      local9
		jmp      code_03ad
code_0235:
		lsg      global112
		ldi      98
		eq?     
		bt       code_024b
		lsg      global112
		ldi      115
		eq?     
		bt       code_024b
		lsg      global112
		ldi      130
		eq?     
code_024b:
		bnt      code_0256
		ldi      232
		sal      local9
		jmp      code_03ad
code_0256:
		lsg      global112
		ldi      52
		eq?     
		bt       code_028d
		lsg      global112
		ldi      54
		eq?     
		bt       code_028d
		lsg      global112
		ldi      69
		eq?     
		bt       code_028d
		lsg      global112
		ldi      119
		eq?     
		bt       code_028d
		lsg      global112
		ldi      121
		eq?     
		bt       code_028d
		lsg      global112
		ldi      135
		eq?     
		bt       code_028d
		lsg      global112
		ldi      137
		eq?     
code_028d:
		bnt      code_0298
		ldi      233
		sal      local9
		jmp      code_03ad
code_0298:
		lsg      global112
		ldi      116
		eq?     
		bt       code_02c0
		lsg      global112
		ldi      117
		eq?     
		bt       code_02c0
		lsg      global112
		ldi      131
		eq?     
		bt       code_02c0
		lsg      global112
		ldi      133
		eq?     
		bt       code_02c0
		lsg      global112
		ldi      154
		eq?     
code_02c0:
		bnt      code_02cb
		ldi      234
		sal      local9
		jmp      code_03ad
code_02cb:
		lsg      global112
		ldi      23
		eq?     
		bt       code_02f1
		lsg      global112
		ldi      37
		eq?     
		bt       code_02f1
		lsg      global112
		ldi      38
		eq?     
		bt       code_02f1
		lsg      global112
		ldi      106
		eq?     
		bt       code_02f1
		lsg      global112
		ldi      138
		eq?     
code_02f1:
		bnt      code_02fc
		ldi      235
		sal      local9
		jmp      code_03ad
code_02fc:
		lsg      global112
		ldi      50
		eq?     
		bt       code_0359
		lsg      global112
		ldi      67
		eq?     
		bt       code_0359
		lsg      global112
		ldi      68
		eq?     
		bt       code_0359
		lsg      global112
		ldi      72
		eq?     
		bt       code_0359
		lsg      global112
		ldi      83
		eq?     
		bt       code_0359
		lsg      global112
		ldi      85
		eq?     
		bt       code_0359
		lsg      global112
		ldi      86
		eq?     
		bt       code_0359
		lsg      global112
		ldi      89
		eq?     
		bt       code_0359
		lsg      global112
		ldi      99
		eq?     
		bt       code_0359
		lsg      global112
		ldi      100
		eq?     
		bt       code_0359
		lsg      global112
		ldi      101
		eq?     
		bt       code_0359
		lsg      global112
		ldi      104
		eq?     
code_0359:
		bnt      code_0364
		ldi      236
		sal      local9
		jmp      code_03ad
code_0364:
		lsg      global112
		ldi      19
		eq?     
		bt       code_0379
		lsg      global112
		ldi      21
		eq?     
		bt       code_0379
		lsg      global112
		ldi      36
		eq?     
code_0379:
		bnt      code_0384
		ldi      237
		sal      local9
		jmp      code_03ad
code_0384:
		lsg      global112
		ldi      136
		eq?     
		bt       code_03a5
		lsg      global112
		ldi      151
		eq?     
		bt       code_03a5
		lsg      global112
		ldi      153
		eq?     
		bt       code_03a5
		lsg      global112
		ldi      167
		eq?     
code_03a5:
		bnt      code_03ad
		ldi      239
		sal      local9
code_03ad:
		pushi    #curPic
		pushi    0
		lag      global2
		send     4
		push    
		dup     
		ldi      220
		eq?     
		bnt      code_0589
		lsg      global112
		ldi      36
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      38
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      69
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      82
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      100
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      104
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      130
		eq?     
		bt       code_03fd
		lsg      global112
		ldi      138
		eq?     
code_03fd:
		bnt      code_040b
		ldi      0
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_040b:
		lsg      global112
		ldi      37
		eq?     
		bt       code_042a
		lsg      global112
		ldi      99
		eq?     
		bt       code_042a
		lsg      global112
		ldi      135
		eq?     
		bt       code_042a
		lsg      global112
		ldi      167
		eq?     
code_042a:
		bnt      code_0438
		ldi      1
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_0438:
		lsg      global112
		ldi      101
		eq?     
		bt       code_0446
		lsg      global112
		ldi      137
		eq?     
code_0446:
		bnt      code_0454
		ldi      2
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_0454:
		lsg      global112
		ldi      21
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      23
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      35
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      50
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      54
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      85
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      86
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      89
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      115
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      121
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      133
		eq?     
		bt       code_04b3
		lsg      global112
		ldi      153
		eq?     
code_04b3:
		bnt      code_04c1
		ldi      3
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_04c1:
		lsg      global112
		ldi      51
		eq?     
		bt       code_04ce
		lsg      global112
		ldi      117
		eq?     
code_04ce:
		bnt      code_04dc
		ldi      4
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_04dc:
		lsg      global112
		ldi      18
		eq?     
		bt       code_0512
		lsg      global112
		ldi      68
		eq?     
		bt       code_0512
		lsg      global112
		ldi      72
		eq?     
		bt       code_0512
		lsg      global112
		ldi      98
		eq?     
		bt       code_0512
		lsg      global112
		ldi      106
		eq?     
		bt       code_0512
		lsg      global112
		ldi      116
		eq?     
		bt       code_0512
		lsg      global112
		ldi      136
		eq?     
code_0512:
		bnt      code_0520
		ldi      5
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_0520:
		lsg      global112
		ldi      67
		eq?     
		bnt      code_0533
		ldi      6
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_0533:
		lsg      global112
		ldi      19
		eq?     
		bt       code_057b
		lsg      global112
		ldi      33
		eq?     
		bt       code_057b
		lsg      global112
		ldi      52
		eq?     
		bt       code_057b
		lsg      global112
		ldi      65
		eq?     
		bt       code_057b
		lsg      global112
		ldi      83
		eq?     
		bt       code_057b
		lsg      global112
		ldi      119
		eq?     
		bt       code_057b
		lsg      global112
		ldi      131
		eq?     
		bt       code_057b
		lsg      global112
		ldi      151
		eq?     
		bt       code_057b
		lsg      global112
		ldi      154
		eq?     
code_057b:
		bnt      code_092c
		ldi      7
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_0589:
		dup     
		ldi      230
		eq?     
		bnt      code_075c
		lsg      global112
		ldi      36
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      38
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      69
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      82
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      100
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      104
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      130
		eq?     
		bt       code_05d0
		lsg      global112
		ldi      138
		eq?     
code_05d0:
		bnt      code_05de
		ldi      8
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_05de:
		lsg      global112
		ldi      37
		eq?     
		bt       code_05fd
		lsg      global112
		ldi      99
		eq?     
		bt       code_05fd
		lsg      global112
		ldi      135
		eq?     
		bt       code_05fd
		lsg      global112
		ldi      167
		eq?     
code_05fd:
		bnt      code_060b
		ldi      9
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_060b:
		lsg      global112
		ldi      101
		eq?     
		bt       code_0619
		lsg      global112
		ldi      137
		eq?     
code_0619:
		bnt      code_0627
		ldi      10
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_0627:
		lsg      global112
		ldi      21
		eq?     
		bt       code_0686
		lsg      global112
		ldi      23
		eq?     
		bt       code_0686
		lsg      global112
		ldi      35
		eq?     
		bt       code_0686
		lsg      global112
		ldi      50
		eq?     
		bt       code_0686
		lsg      global112
		ldi      54
		eq?     
		bt       code_0686
		lsg      global112
		ldi      85
		eq?     
		bt       code_0686
		lsg      global112
		ldi      86
		eq?     
		bt       code_0686
		lsg      global112
		ldi      89
		eq?     
		bt       code_0686
		lsg      global112
		ldi      115
		eq?     
		bt       code_0686
		lsg      global112
		ldi      121
		eq?     
		bt       code_0686
		lsg      global112
		ldi      133
		eq?     
		bt       code_0686
		lsg      global112
		ldi      153
		eq?     
code_0686:
		bnt      code_0694
		ldi      11
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_0694:
		lsg      global112
		ldi      51
		eq?     
		bt       code_06a1
		lsg      global112
		ldi      117
		eq?     
code_06a1:
		bnt      code_06af
		ldi      12
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_06af:
		lsg      global112
		ldi      18
		eq?     
		bt       code_06e5
		lsg      global112
		ldi      68
		eq?     
		bt       code_06e5
		lsg      global112
		ldi      72
		eq?     
		bt       code_06e5
		lsg      global112
		ldi      98
		eq?     
		bt       code_06e5
		lsg      global112
		ldi      106
		eq?     
		bt       code_06e5
		lsg      global112
		ldi      116
		eq?     
		bt       code_06e5
		lsg      global112
		ldi      136
		eq?     
code_06e5:
		bnt      code_06f3
		ldi      13
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_06f3:
		lsg      global112
		ldi      67
		eq?     
		bnt      code_0706
		ldi      14
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_0706:
		lsg      global112
		ldi      19
		eq?     
		bt       code_074e
		lsg      global112
		ldi      33
		eq?     
		bt       code_074e
		lsg      global112
		ldi      52
		eq?     
		bt       code_074e
		lsg      global112
		ldi      65
		eq?     
		bt       code_074e
		lsg      global112
		ldi      83
		eq?     
		bt       code_074e
		lsg      global112
		ldi      119
		eq?     
		bt       code_074e
		lsg      global112
		ldi      131
		eq?     
		bt       code_074e
		lsg      global112
		ldi      151
		eq?     
		bt       code_074e
		lsg      global112
		ldi      154
		eq?     
code_074e:
		bnt      code_092c
		ldi      15
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_075c:
		dup     
		ldi      240
		eq?     
		bnt      code_092c
		lsg      global112
		ldi      36
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      38
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      69
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      82
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      100
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      104
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      130
		eq?     
		bt       code_07a3
		lsg      global112
		ldi      138
		eq?     
code_07a3:
		bnt      code_07b1
		ldi      16
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_07b1:
		lsg      global112
		ldi      37
		eq?     
		bt       code_07d0
		lsg      global112
		ldi      99
		eq?     
		bt       code_07d0
		lsg      global112
		ldi      135
		eq?     
		bt       code_07d0
		lsg      global112
		ldi      167
		eq?     
code_07d0:
		bnt      code_07de
		ldi      17
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_07de:
		lsg      global112
		ldi      101
		eq?     
		bt       code_07ec
		lsg      global112
		ldi      137
		eq?     
code_07ec:
		bnt      code_07fa
		ldi      18
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_07fa:
		lsg      global112
		ldi      21
		eq?     
		bt       code_0859
		lsg      global112
		ldi      23
		eq?     
		bt       code_0859
		lsg      global112
		ldi      35
		eq?     
		bt       code_0859
		lsg      global112
		ldi      50
		eq?     
		bt       code_0859
		lsg      global112
		ldi      54
		eq?     
		bt       code_0859
		lsg      global112
		ldi      85
		eq?     
		bt       code_0859
		lsg      global112
		ldi      86
		eq?     
		bt       code_0859
		lsg      global112
		ldi      89
		eq?     
		bt       code_0859
		lsg      global112
		ldi      115
		eq?     
		bt       code_0859
		lsg      global112
		ldi      121
		eq?     
		bt       code_0859
		lsg      global112
		ldi      133
		eq?     
		bt       code_0859
		lsg      global112
		ldi      153
		eq?     
code_0859:
		bnt      code_0867
		ldi      19
		sal      local11
		ldi      65535
		sal      local10
		jmp      code_092c
code_0867:
		lsg      global112
		ldi      51
		eq?     
		bt       code_0874
		lsg      global112
		ldi      117
		eq?     
code_0874:
		bnt      code_0882
		ldi      20
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_0882:
		lsg      global112
		ldi      18
		eq?     
		bt       code_08b8
		lsg      global112
		ldi      68
		eq?     
		bt       code_08b8
		lsg      global112
		ldi      72
		eq?     
		bt       code_08b8
		lsg      global112
		ldi      98
		eq?     
		bt       code_08b8
		lsg      global112
		ldi      106
		eq?     
		bt       code_08b8
		lsg      global112
		ldi      116
		eq?     
		bt       code_08b8
		lsg      global112
		ldi      136
		eq?     
code_08b8:
		bnt      code_08c6
		ldi      21
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_08c6:
		lsg      global112
		ldi      67
		eq?     
		bnt      code_08d9
		ldi      22
		sal      local11
		ldi      15
		sal      local10
		jmp      code_092c
code_08d9:
		lsg      global112
		ldi      19
		eq?     
		bt       code_0921
		lsg      global112
		ldi      33
		eq?     
		bt       code_0921
		lsg      global112
		ldi      52
		eq?     
		bt       code_0921
		lsg      global112
		ldi      65
		eq?     
		bt       code_0921
		lsg      global112
		ldi      83
		eq?     
		bt       code_0921
		lsg      global112
		ldi      119
		eq?     
		bt       code_0921
		lsg      global112
		ldi      131
		eq?     
		bt       code_0921
		lsg      global112
		ldi      151
		eq?     
		bt       code_0921
		lsg      global112
		ldi      154
		eq?     
code_0921:
		bnt      code_092c
		ldi      23
		sal      local11
		ldi      65535
		sal      local10
code_092c:
		toss    
		pushi    5
		pushi    1
		lsl      local9
		pushi    63
		pushi    1
		lsl      local10
		pushi    4
		pushi    1
		lal      local11
		lsli     local216
		pushi    3
		pushi    1
		lsg      global112
		ldi      18
		eq?     
		bt       code_0977
		lsg      global112
		ldi      68
		eq?     
		bt       code_0977
		lsg      global112
		ldi      72
		eq?     
		bt       code_0977
		lsg      global112
		ldi      98
		eq?     
		bt       code_0977
		lsg      global112
		ldi      106
		eq?     
		bt       code_0977
		lsg      global112
		ldi      116
		eq?     
		bt       code_0977
		lsg      global112
		ldi      136
		eq?     
code_0977:
		bnt      code_09d7
		lsl      local9
		dup     
		ldi      232
		eq?     
		bnt      code_098a
		ldi      205
		jmp      code_09d3
code_098a:
		dup     
		ldi      233
		eq?     
		bnt      code_0998
		ldi      229
		jmp      code_09d3
code_0998:
		dup     
		ldi      234
		eq?     
		bnt      code_09a6
		ldi      249
		jmp      code_09d3
code_09a6:
		dup     
		ldi      236
		eq?     
		bnt      code_09b4
		ldi      253
		jmp      code_09d3
code_09b4:
		dup     
		ldi      237
		eq?     
		bnt      code_09c2
		ldi      209
		jmp      code_09d3
code_09c2:
		dup     
		ldi      239
		eq?     
		bnt      code_09d0
		ldi      249
		jmp      code_09d3
code_09d0:
		ldi      221
code_09d3:
		toss    
		jmp      code_09db
code_09d7:
		lal      local11
		lali     local240
code_09db:
		push    
		pushi    17
		pushi    1
		pushi    16400
		pushi    #new
		pushi    0
		lofsa    aTree
		send     4
		push    
		ldi      0
		sali     local16
		send     30
		pushi    1
		ldi      0
		lsli     local16
		calle    proc806_2,  2
		ret     
	)
)

(procedure (proc225_2 &tmp temp0)
	(asm
		lsg      global112
		ldi      3
		eq?     
		bt       code_0a34
		lsg      global112
		ldi      4
		eq?     
		bt       code_0a34
		lsg      global112
		ldi      5
		eq?     
		bt       code_0a34
		lsg      global112
		ldi      6
		eq?     
		bt       code_0a34
		lsg      global112
		ldi      24
		eq?     
		bt       code_0a34
		lsg      global112
		ldi      25
		eq?     
		bt       code_0a34
		lsg      global112
		ldi      26
		eq?     
code_0a34:
		bnt      code_0a48
		ldi      2
		sal      local368
		ldi      166
		sal      local12
		ldi      86
		sal      local13
		jmp      code_0bc6
code_0a48:
		lsg      global112
		ldi      147
		eq?     
		bt       code_0a84
		lsg      global112
		ldi      148
		eq?     
		bt       code_0a84
		lsg      global112
		ldi      149
		eq?     
		bt       code_0a84
		lsg      global112
		ldi      168
		eq?     
		bt       code_0a84
		lsg      global112
		ldi      169
		eq?     
		bt       code_0a84
		lsg      global112
		ldi      170
		eq?     
		bt       code_0a84
		lsg      global112
		ldi      182
		eq?     
code_0a84:
		bnt      code_0a98
		ldi      4
		sal      local368
		ldi      55
		sal      local12
		ldi      189
		sal      local13
		jmp      code_0bc6
code_0a98:
		lsg      global112
		ldi      43
		eq?     
		bt       code_0abe
		lsg      global112
		ldi      91
		eq?     
		bt       code_0abe
		lsg      global112
		ldi      107
		eq?     
		bt       code_0abe
		lsg      global112
		ldi      123
		eq?     
		bt       code_0abe
		lsg      global112
		ldi      139
		eq?     
code_0abe:
		bnt      code_0ad3
		ldi      3
		sal      local368
		ldi      294
		sal      local12
		ldi      145
		sal      local13
		jmp      code_0bc6
code_0ad3:
		lsg      global112
		ldi      48
		eq?     
		bt       code_0af0
		lsg      global112
		ldi      81
		eq?     
		bt       code_0af0
		lsg      global112
		ldi      97
		eq?     
		bt       code_0af0
		lsg      global112
		ldi      113
		eq?     
code_0af0:
		bnt      code_0b04
		ldi      3
		sal      local368
		ldi      23
		sal      local12
		ldi      132
		sal      local13
		jmp      code_0bc6
code_0b04:
		lsg      global112
		ldi      7
		eq?     
		bt       code_0b19
		lsg      global112
		ldi      27
		eq?     
		bt       code_0b19
		lsg      global112
		ldi      60
		eq?     
code_0b19:
		bnt      code_0b2e
		ldi      6
		sal      local368
		ldi      294
		sal      local12
		ldi      145
		sal      local13
		jmp      code_0bc6
code_0b2e:
		lsg      global112
		ldi      2
		eq?     
		bt       code_0b43
		lsg      global112
		ldi      17
		eq?     
		bt       code_0b43
		lsg      global112
		ldi      32
		eq?     
code_0b43:
		bnt      code_0b57
		ldi      6
		sal      local368
		ldi      23
		sal      local12
		ldi      132
		sal      local13
		jmp      code_0bc6
code_0b57:
		lsg      global112
		ldi      76
		eq?     
		bt       code_0b6e
		lsg      global112
		ldi      171
		eq?     
		bt       code_0b6e
		lsg      global112
		ldi      183
		eq?     
code_0b6e:
		bnt      code_0b83
		ldi      9
		sal      local368
		ldi      294
		sal      local12
		ldi      145
		sal      local13
		jmp      code_0bc6
code_0b83:
		lsg      global112
		ldi      64
		eq?     
		bt       code_0b9a
		lsg      global112
		ldi      129
		eq?     
		bt       code_0b9a
		lsg      global112
		ldi      146
		eq?     
code_0b9a:
		bnt      code_0bae
		ldi      9
		sal      local368
		ldi      23
		sal      local12
		ldi      132
		sal      local13
		jmp      code_0bc6
code_0bae:
		lsg      global112
		ldi      156
		eq?     
		bnt      code_0bc6
		ldi      10
		sal      local368
		ldi      294
		sal      local12
		ldi      132
		sal      local13
code_0bc6:
		pushi    #posn
		pushi    2
		lsl      local12
		lsl      local13
		pushi    17
		pushi    1
		pushi    16449
		pushi    107
		pushi    0
		lofsa    liveBush
		send     18
		ldi      0
		sat      temp0
code_0be0:
		lst      temp0
		lal      local368
		lt?     
		bnt      code_0f20
		pushi    4
		pushi    1
		lsg      global112
		ldi      3
		eq?     
		bt       code_0c21
		lsg      global112
		ldi      4
		eq?     
		bt       code_0c21
		lsg      global112
		ldi      5
		eq?     
		bt       code_0c21
		lsg      global112
		ldi      6
		eq?     
		bt       code_0c21
		lsg      global112
		ldi      24
		eq?     
		bt       code_0c21
		lsg      global112
		ldi      25
		eq?     
		bt       code_0c21
		lsg      global112
		ldi      26
		eq?     
code_0c21:
		bnt      code_0c35
		lat      temp0
		lsli     local272
		pushi    2
		pushi    65533
		pushi    3
		callk    Random,  4
		add     
		jmp      code_0d78
code_0c35:
		lsg      global112
		ldi      147
		eq?     
		bt       code_0c71
		lsg      global112
		ldi      148
		eq?     
		bt       code_0c71
		lsg      global112
		ldi      149
		eq?     
		bt       code_0c71
		lsg      global112
		ldi      168
		eq?     
		bt       code_0c71
		lsg      global112
		ldi      169
		eq?     
		bt       code_0c71
		lsg      global112
		ldi      170
		eq?     
		bt       code_0c71
		lsg      global112
		ldi      182
		eq?     
code_0c71:
		bnt      code_0c85
		lat      temp0
		lsli     local274
		pushi    2
		pushi    65533
		pushi    3
		callk    Random,  4
		add     
		jmp      code_0d78
code_0c85:
		lsg      global112
		ldi      43
		eq?     
		bt       code_0cab
		lsg      global112
		ldi      91
		eq?     
		bt       code_0cab
		lsg      global112
		ldi      107
		eq?     
		bt       code_0cab
		lsg      global112
		ldi      123
		eq?     
		bt       code_0cab
		lsg      global112
		ldi      139
		eq?     
code_0cab:
		bnt      code_0cbb
		pushi    2
		pushi    292
		pushi    295
		callk    Random,  4
		jmp      code_0d78
code_0cbb:
		lsg      global112
		ldi      48
		eq?     
		bt       code_0cd8
		lsg      global112
		ldi      81
		eq?     
		bt       code_0cd8
		lsg      global112
		ldi      97
		eq?     
		bt       code_0cd8
		lsg      global112
		ldi      113
		eq?     
code_0cd8:
		bnt      code_0ce6
		pushi    2
		pushi    20
		pushi    24
		callk    Random,  4
		jmp      code_0d78
code_0ce6:
		lsg      global112
		ldi      7
		eq?     
		bt       code_0cfb
		lsg      global112
		ldi      27
		eq?     
		bt       code_0cfb
		lsg      global112
		ldi      60
		eq?     
code_0cfb:
		bnt      code_0d06
		lat      temp0
		lali     local278
		jmp      code_0d78
code_0d06:
		lsg      global112
		ldi      2
		eq?     
		bt       code_0d1b
		lsg      global112
		ldi      17
		eq?     
		bt       code_0d1b
		lsg      global112
		ldi      32
		eq?     
code_0d1b:
		bnt      code_0d26
		lat      temp0
		lali     local284
		jmp      code_0d78
code_0d26:
		lsg      global112
		ldi      76
		eq?     
		bt       code_0d3d
		lsg      global112
		ldi      171
		eq?     
		bt       code_0d3d
		lsg      global112
		ldi      183
		eq?     
code_0d3d:
		bnt      code_0d48
		lat      temp0
		lali     local290
		jmp      code_0d78
code_0d48:
		lsg      global112
		ldi      64
		eq?     
		bt       code_0d5f
		lsg      global112
		ldi      129
		eq?     
		bt       code_0d5f
		lsg      global112
		ldi      146
		eq?     
code_0d5f:
		bnt      code_0d6a
		lat      temp0
		lali     local299
		jmp      code_0d78
code_0d6a:
		lsg      global112
		ldi      156
		eq?     
		bnt      code_0d78
		lat      temp0
		lali     local308
code_0d78:
		push    
		pushi    3
		pushi    1
		lsg      global112
		ldi      3
		eq?     
		bt       code_0db1
		lsg      global112
		ldi      4
		eq?     
		bt       code_0db1
		lsg      global112
		ldi      5
		eq?     
		bt       code_0db1
		lsg      global112
		ldi      6
		eq?     
		bt       code_0db1
		lsg      global112
		ldi      24
		eq?     
		bt       code_0db1
		lsg      global112
		ldi      25
		eq?     
		bt       code_0db1
		lsg      global112
		ldi      26
		eq?     
code_0db1:
		bnt      code_0db9
		ldi      86
		jmp      code_0efb
code_0db9:
		lsg      global112
		ldi      147
		eq?     
		bt       code_0df5
		lsg      global112
		ldi      148
		eq?     
		bt       code_0df5
		lsg      global112
		ldi      149
		eq?     
		bt       code_0df5
		lsg      global112
		ldi      168
		eq?     
		bt       code_0df5
		lsg      global112
		ldi      169
		eq?     
		bt       code_0df5
		lsg      global112
		ldi      170
		eq?     
		bt       code_0df5
		lsg      global112
		ldi      182
		eq?     
code_0df5:
		bnt      code_0e00
		lat      temp0
		lali     local364
		jmp      code_0efb
code_0e00:
		lsg      global112
		ldi      43
		eq?     
		bt       code_0e26
		lsg      global112
		ldi      91
		eq?     
		bt       code_0e26
		lsg      global112
		ldi      107
		eq?     
		bt       code_0e26
		lsg      global112
		ldi      123
		eq?     
		bt       code_0e26
		lsg      global112
		ldi      139
		eq?     
code_0e26:
		bnt      code_0e39
		lat      temp0
		lsli     local318
		pushi    2
		pushi    65534
		pushi    2
		callk    Random,  4
		add     
		jmp      code_0efb
code_0e39:
		lsg      global112
		ldi      48
		eq?     
		bt       code_0e56
		lsg      global112
		ldi      81
		eq?     
		bt       code_0e56
		lsg      global112
		ldi      97
		eq?     
		bt       code_0e56
		lsg      global112
		ldi      113
		eq?     
code_0e56:
		bnt      code_0e69
		lat      temp0
		lsli     local321
		pushi    2
		pushi    65534
		pushi    2
		callk    Random,  4
		add     
		jmp      code_0efb
code_0e69:
		lsg      global112
		ldi      7
		eq?     
		bt       code_0e7e
		lsg      global112
		ldi      27
		eq?     
		bt       code_0e7e
		lsg      global112
		ldi      60
		eq?     
code_0e7e:
		bnt      code_0e89
		lat      temp0
		lali     local324
		jmp      code_0efb
code_0e89:
		lsg      global112
		ldi      2
		eq?     
		bt       code_0e9e
		lsg      global112
		ldi      17
		eq?     
		bt       code_0e9e
		lsg      global112
		ldi      32
		eq?     
code_0e9e:
		bnt      code_0ea9
		lat      temp0
		lali     local330
		jmp      code_0efb
code_0ea9:
		lsg      global112
		ldi      76
		eq?     
		bt       code_0ec0
		lsg      global112
		ldi      171
		eq?     
		bt       code_0ec0
		lsg      global112
		ldi      183
		eq?     
code_0ec0:
		bnt      code_0ecb
		lat      temp0
		lali     local336
		jmp      code_0efb
code_0ecb:
		lsg      global112
		ldi      64
		eq?     
		bt       code_0ee2
		lsg      global112
		ldi      129
		eq?     
		bt       code_0ee2
		lsg      global112
		ldi      146
		eq?     
code_0ee2:
		bnt      code_0eed
		lat      temp0
		lali     local345
		jmp      code_0efb
code_0eed:
		lsg      global112
		ldi      156
		eq?     
		bnt      code_0efb
		lat      temp0
		lali     local354
code_0efb:
		push    
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    berryBush
		send     4
		push    
		lat      temp0
		sali     local264
		send     16
		pushi    #add
		pushi    1
		lat      temp0
		lsli     local264
		lag      global10
		send     6
		+at      temp0
		jmp      code_0be0
code_0f20:
		pushi    #doit
		pushi    0
		lag      global10
		send     4
		ret     
	)
)

(instance berryBush of PicView
	(properties
		view 238
		signal $4000
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f61
			pushi    #contains
			pushi    1
			lofsa    treeClue
			push    
			lag      global5
			send     6
			bnt      code_0f4a
			pushi    #dispose
			pushi    0
			lofsa    treeClue
			send     4
			jmp      code_0f99
code_0f4a:
			pushi    #setScript
			pushi    3
			lofsa    makeClue
			push    
			pushi    0
			pushi    #view
			pushi    0
			self     4
			push    
			lag      global0
			send     10
			jmp      code_0f99
code_0f61:
			dup     
			ldi      3
			eq?     
			bnt      code_0f8e
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_0f80
			pushi    3
			pushi    1225
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_0f99
code_0f80:
			pushi    3
			pushi    1225
			pushi    1
			pushi    0
			calle    proc13_4,  6
			jmp      code_0f99
code_0f8e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    PicView,  6
code_0f99:
			toss    
			ret     
		)
	)
)

(instance liveBush of Actor
	(properties
		yStep 8
		view 238
		illegalBits $0000
		xStep 8
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1023
			pushi    #contains
			pushi    1
			lofsa    treeClue
			push    
			lag      global5
			send     6
			bnt      code_100e
			pushi    #dispose
			pushi    0
			lofsa    treeClue
			send     4
			jmp      code_105b
code_100e:
			pushi    #setScript
			pushi    3
			lofsa    makeClue
			push    
			pushi    0
			pushi    #view
			pushi    0
			self     4
			push    
			self     10
			jmp      code_105b
code_1023:
			dup     
			ldi      3
			eq?     
			bnt      code_1050
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1042
			pushi    3
			pushi    1225
			pushi    0
			pushi    0
			calle    proc13_4,  6
			jmp      code_105b
code_1042:
			pushi    3
			pushi    1225
			pushi    1
			pushi    0
			calle    proc13_4,  6
			jmp      code_105b
code_1050:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_105b:
			toss    
			ret     
		)
	)
)

(instance dummyBush of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    238
			pushi    63
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    liveBush
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    liveBush
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    liveBush
			send     4
			push    
			self     30
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance aHint of PicView
	(properties
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    PicView,  6
			ret     
		)
	)
)

(instance dummyHint of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    treeClue
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    treeClue
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    treeClue
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    treeClue
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    treeClue
			send     4
			push    
			pushi    63
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    treeClue
			send     4
			push    
			self     36
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance treeClue of View
	(properties
		cel 1
		priority 15
	)
	
	(method (init)
		(asm
			pushi    #add
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #add
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #init
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_12dd
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bt       code_12cb
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
code_12cb:
			bnt      code_12dd
			pushi    #dispose
			pushi    0
			self     4
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			jmp      code_12e6
code_12dd:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    View,  6
code_12e6:
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1298
			pushi    #setScript
			pushi    1
			lofsa    dumpClue
			push    
			lag      global0
			send     6
			jmp      code_12a3
code_1298:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    View,  6
code_12a3:
			ret     
		)
	)
)

(instance makeClue of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 32])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_164a
			lsg      global112
			ldi      36
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      38
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      69
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      82
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      100
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      104
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      130
			eq?     
			bt       code_13bb
			lsg      global112
			ldi      138
			eq?     
code_13bb:
			bnt      code_13c5
			ldi      0
			sal      local8
			jmp      code_1524
code_13c5:
			lsg      global112
			ldi      18
			eq?     
			bt       code_13fb
			lsg      global112
			ldi      68
			eq?     
			bt       code_13fb
			lsg      global112
			ldi      72
			eq?     
			bt       code_13fb
			lsg      global112
			ldi      98
			eq?     
			bt       code_13fb
			lsg      global112
			ldi      106
			eq?     
			bt       code_13fb
			lsg      global112
			ldi      116
			eq?     
			bt       code_13fb
			lsg      global112
			ldi      136
			eq?     
code_13fb:
			bnt      code_1405
			ldi      1
			sal      local8
			jmp      code_1524
code_1405:
			lsg      global112
			ldi      19
			eq?     
			bt       code_144d
			lsg      global112
			ldi      33
			eq?     
			bt       code_144d
			lsg      global112
			ldi      52
			eq?     
			bt       code_144d
			lsg      global112
			ldi      65
			eq?     
			bt       code_144d
			lsg      global112
			ldi      83
			eq?     
			bt       code_144d
			lsg      global112
			ldi      119
			eq?     
			bt       code_144d
			lsg      global112
			ldi      131
			eq?     
			bt       code_144d
			lsg      global112
			ldi      151
			eq?     
			bt       code_144d
			lsg      global112
			ldi      154
			eq?     
code_144d:
			bnt      code_1457
			ldi      2
			sal      local8
			jmp      code_1524
code_1457:
			lsg      global112
			ldi      21
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      23
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      35
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      50
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      54
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      85
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      86
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      89
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      115
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      121
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      133
			eq?     
			bt       code_14b6
			lsg      global112
			ldi      153
			eq?     
code_14b6:
			bnt      code_14c0
			ldi      3
			sal      local8
			jmp      code_1524
code_14c0:
			lsg      global112
			ldi      37
			eq?     
			bt       code_14df
			lsg      global112
			ldi      99
			eq?     
			bt       code_14df
			lsg      global112
			ldi      135
			eq?     
			bt       code_14df
			lsg      global112
			ldi      167
			eq?     
code_14df:
			bnt      code_14e9
			ldi      4
			sal      local8
			jmp      code_1524
code_14e9:
			lsg      global112
			ldi      101
			eq?     
			bt       code_14f7
			lsg      global112
			ldi      137
			eq?     
code_14f7:
			bnt      code_1501
			ldi      5
			sal      local8
			jmp      code_1524
code_1501:
			lsg      global112
			ldi      67
			eq?     
			bnt      code_1510
			ldi      6
			sal      local8
			jmp      code_1524
code_1510:
			lsg      global112
			ldi      51
			eq?     
			bt       code_151d
			lsg      global112
			ldi      117
			eq?     
code_151d:
			bnt      code_1524
			ldi      7
			sal      local8
code_1524:
			pushi    5
			pushi    1
			pTos     register
			pushi    4
			pushi    1
			pTos     register
			dup     
			ldi      230
			eq?     
			bnt      code_153b
			ldi      57
			jmp      code_15ad
code_153b:
			dup     
			ldi      231
			eq?     
			bnt      code_1548
			ldi      27
			jmp      code_15ad
code_1548:
			dup     
			ldi      232
			eq?     
			bnt      code_1555
			ldi      31
			jmp      code_15ad
code_1555:
			dup     
			ldi      233
			eq?     
			bnt      code_1562
			ldi      45
			jmp      code_15ad
code_1562:
			dup     
			ldi      234
			eq?     
			bnt      code_156f
			ldi      35
			jmp      code_15ad
code_156f:
			dup     
			ldi      235
			eq?     
			bnt      code_157c
			ldi      39
			jmp      code_15ad
code_157c:
			dup     
			ldi      236
			eq?     
			bnt      code_1589
			ldi      28
			jmp      code_15ad
code_1589:
			dup     
			ldi      237
			eq?     
			bnt      code_1596
			ldi      38
			jmp      code_15ad
code_1596:
			dup     
			ldi      238
			eq?     
			bnt      code_15a3
			ldi      41
			jmp      code_15ad
code_15a3:
			dup     
			ldi      239
			eq?     
			bnt      code_15ad
			ldi      35
code_15ad:
			toss    
			push    
			pushi    3
			pushi    1
			pTos     register
			dup     
			ldi      230
			eq?     
			bnt      code_15c1
			ldi      57
			jmp      code_1633
code_15c1:
			dup     
			ldi      231
			eq?     
			bnt      code_15ce
			ldi      58
			jmp      code_1633
code_15ce:
			dup     
			ldi      232
			eq?     
			bnt      code_15db
			ldi      39
			jmp      code_1633
code_15db:
			dup     
			ldi      233
			eq?     
			bnt      code_15e8
			ldi      57
			jmp      code_1633
code_15e8:
			dup     
			ldi      234
			eq?     
			bnt      code_15f5
			ldi      70
			jmp      code_1633
code_15f5:
			dup     
			ldi      235
			eq?     
			bnt      code_1602
			ldi      54
			jmp      code_1633
code_1602:
			dup     
			ldi      236
			eq?     
			bnt      code_160f
			ldi      56
			jmp      code_1633
code_160f:
			dup     
			ldi      237
			eq?     
			bnt      code_161c
			ldi      65
			jmp      code_1633
code_161c:
			dup     
			ldi      238
			eq?     
			bnt      code_1629
			ldi      76
			jmp      code_1633
code_1629:
			dup     
			ldi      239
			eq?     
			bnt      code_1633
			ldi      71
code_1633:
			toss    
			push    
			pushi    17
			pushi    1
			pushi    16400
			pushi    107
			pushi    0
			lofsa    treeClue
			send     28
			ldi      6
			aTop     ticks
			jmp      code_1805
code_164a:
			dup     
			ldi      1
			eq?     
			bnt      code_1805
			lsg      global112
			ldi      116
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      117
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      131
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      133
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      154
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      18
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      33
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      35
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      52
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      54
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      69
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      119
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      121
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      135
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      137
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      51
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      65
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      82
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      19
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      21
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      36
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      98
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      115
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      130
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      23
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      37
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      38
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      106
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      138
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      50
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      67
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      68
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      72
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      83
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      85
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      86
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      89
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      99
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      100
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      101
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      104
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      136
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      151
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      153
			eq?     
			bt       code_17c1
			lsg      global112
			ldi      167
			eq?     
code_17c1:
			bnt      code_17eb
			pushi    8
			pushi    4
			lea      @temp0
			push    
			pushi    225
			pushi    0
			lal      local8
			lsli     local0
			callk    Format,  8
			push    
			pushi    67
			pushi    100
			pushi    15
			pushi    70
			pushi    180
			pushi    25
			pushi    4
			calle    proc255_0,  16
code_17eb:
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    treeClue
			send     4
			push    
			ldi      65
			or      
			push    
			lofsa    treeClue
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1805:
			toss    
			ret     
		)
	)
)

(instance dumpClue of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_186a
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    treeClue
			send     4
			push    
			ldi      65470
			and     
			push    
			lofsa    treeClue
			send     6
			ldi      6
			aTop     ticks
			jmp      code_187e
code_186a:
			dup     
			ldi      1
			eq?     
			bnt      code_187e
			pushi    #dispose
			pushi    0
			lofsa    treeClue
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_187e:
			toss    
			ret     
		)
	)
)

(instance aTree of PicView
	(properties
		signal $4000
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_18f7
			pushi    #contains
			pushi    1
			lofsa    treeClue
			push    
			lag      global5
			send     6
			bnt      code_18e0
			pushi    #setScript
			pushi    1
			lofsa    dumpClue
			push    
			lag      global0
			send     6
			jmp      code_1943
code_18e0:
			pushi    #setScript
			pushi    3
			lofsa    makeClue
			push    
			pushi    0
			pushi    #view
			pushi    0
			self     4
			push    
			lag      global0
			send     10
			jmp      code_1943
code_18f7:
			dup     
			ldi      3
			eq?     
			bnt      code_190c
			pushi    3
			pushi    1225
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_1943
code_190c:
			dup     
			ldi      5
			eq?     
			bnt      code_1922
			pushi    3
			pushi    1225
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_1943
code_1922:
			dup     
			ldi      10
			eq?     
			bnt      code_1938
			pushi    3
			pushi    1225
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_1943
code_1938:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    PicView,  6
code_1943:
			toss    
			ret     
		)
	)
)

(instance dummyLiveBush of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    liveBush
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    liveBush
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    liveBush
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16384
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    liveBush
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    liveBush
			send     4
			push    
			self     36
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance moveBushes of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    225
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a7f
			pushi    0
			callb    proc0_3,  0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_1a5a
			pushi    #dispose
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     4
code_1a5a:
			pushi    #obstacles
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    liveBush
			send     4
			push    
			ldi      65470
			and     
			push    
			lofsa    liveBush
			send     6
			ldi      12
			aTop     cycles
			jmp      code_1b70
code_1a7f:
			dup     
			ldi      1
			eq?     
			bnt      code_1aad
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			ldi      0
			lali     local264
			send     4
			push    
			pushi    #y
			pushi    0
			ldi      0
			lali     local264
			send     4
			push    
			pushSelf
			lofsa    liveBush
			send     12
			jmp      code_1b70
code_1aad:
			dup     
			ldi      2
			eq?     
			bnt      code_1b2a
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    liveBush
			send     4
			push    
			ldi      65
			or      
			push    
			lofsa    liveBush
			send     6
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			dup     
			ldi      220
			eq?     
			bnt      code_1ae2
			pushi    0
			calle    proc222_0,  0
			jmp      code_1aff
code_1ae2:
			dup     
			ldi      230
			eq?     
			bnt      code_1af2
			pushi    0
			calle    proc232_0,  0
			jmp      code_1aff
code_1af2:
			dup     
			ldi      240
			eq?     
			bnt      code_1aff
			pushi    0
			calle    proc242_0,  0
code_1aff:
			toss    
			ldi      53
			sag      global124
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #init
			pushi    0
			lofsa    dummyLiveBush
			send     4
			pushi    #add
			pushi    1
			lofsa    dummyLiveBush
			push    
			lag      global10
			send     6
			ldi      5
			aTop     seconds
			jmp      code_1b70
code_1b2a:
			dup     
			ldi      3
			eq?     
			bnt      code_1b70
			pushi    #number
			pushi    1
			pushi    401
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    liveBush
			send     8
			pushi    0
			calle    proc750_1,  0
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_1b70:
			toss    
			ret     
		)
	)
)
