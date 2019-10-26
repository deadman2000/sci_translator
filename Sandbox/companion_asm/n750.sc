;;; Sierra Script 1.0 - (do not remove this comment)
(script# 750)
(include sci.sh)
(use n000)
(use n013)
(use n225)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n958)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	sweepRgn 0
	proc750_1 1
	proc750_2 2
	proc750_3 3
)

(local
	[local0 4]
	local4
	[local5 12]
	[local17 9]
	local26
	local27
	local28
	local29
	local30
	local31
	local32
	local33
	[local34 4] = [1750 0 1]
	[local38 5] = [1750 1 1 1]
	[local43 5] = [1750 5 1 2]
	[local48 4] = [1750 5 1]
	[local52 4] = [1750 21 1]
	[local56 20] = [1750 22 1 0 1750 28 1 0 1750 42 1 0 1750 44 1 0 1750 46 1]
	[local76 10] = [1750 34 2 1 2 1 2 1 2]
	[local86 9] = [1750 48 3 1 2 2 3 3]
	[local95 8] = [1750 54 1 3 1 3 2]
	[local103 7] = [1750 23 2 1 3 3]
	[local110 15] = [1750 7 1 2 3 2 3 1 3 0 1750 29 1 1]
	[local125 6] = [1750 31 1 2 3]
	[local131 9] = [-1 16296 19]
	[local140 40] = [0 100 66 100 0 90 66 90 0 100 66 100 110 85 110 100 0 92 66 93 0 179 28 179 280 81 280 245 40 245 40 82 -20 100 330 100 330 100 -20 100]
	[local180 40] = [0 185 50 170 0 85 50 95 0 185 50 170 320 85 275 100 0 185 60 171 160 270 160 210 160 81 160 245 160 245 160 81 -20 135 330 135 330 135 -20 135]
	[local220 44] = [320 135 295 142 320 100 295 102 200 245 165 185 320 135 275 140 320 150 295 142 330 175 295 175 40 79 40 245 280 245 280 79 -30 180 330 180 330 180 -20 180 0 179 330 179]
	local264
	local265
	local266
	local267
	local268
)
(procedure (proc750_1 &tmp [temp0 2])
	(asm
		lsg      global11
		ldi      180
		eq?     
		bnt      code_004a
		lsg      global108
		ldi      3
		eq?     
		bnt      code_0034
		ldi      4
		sag      global108
		jmp      code_0524
code_0034:
		lsg      global108
		ldi      1
		eq?     
		bnt      code_0043
		ldi      2
		sag      global108
		jmp      code_0524
code_0043:
		ldi      2
		sag      global108
		jmp      code_0524
code_004a:
		lsg      global112
		ldi      41
		eq?     
		bt       code_0079
		lsg      global112
		ldi      73
		eq?     
		bt       code_0079
		lsg      global112
		ldi      104
		eq?     
		bt       code_0079
		lsg      global112
		ldi      151
		eq?     
		bt       code_0079
		lsg      global112
		ldi      24
		eq?     
		bt       code_0079
		lsg      global112
		ldi      149
		eq?     
code_0079:
		bnt      code_0083
		ldi      2
		sag      global108
		jmp      code_0524
code_0083:
		lsg      global112
		ldi      43
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      75
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      106
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      153
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      25
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      166
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      182
		eq?     
		bt       code_00c4
		lsg      global112
		ldi      150
		eq?     
code_00c4:
		bnt      code_00ce
		ldi      4
		sag      global108
		jmp      code_0524
code_00ce:
		lsg      global112
		ldi      90
		eq?     
		bt       code_00e4
		lsg      global112
		ldi      121
		eq?     
		bt       code_00e4
		lsg      global112
		ldi      168
		eq?     
code_00e4:
		bnt      code_00ee
		ldi      1
		sag      global108
		jmp      code_0524
code_00ee:
		lsg      global112
		ldi      89
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      136
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      36
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      38
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      69
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      82
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      100
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      104
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      130
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      138
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      37
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      99
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      135
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      167
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      3
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      4
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      5
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      6
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      24
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      25
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      26
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      2
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      17
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      32
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      7
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      27
		eq?     
		bt       code_01c8
		lsg      global112
		ldi      60
		eq?     
code_01c8:
		bnt      code_01d2
		ldi      3
		sag      global108
		jmp      code_0524
code_01d2:
		lsg      global112
		ldi      18
		eq?     
		bt       code_028b
		lsg      global112
		ldi      68
		eq?     
		bt       code_028b
		lsg      global112
		ldi      72
		eq?     
		bt       code_028b
		lsg      global112
		ldi      98
		eq?     
		bt       code_028b
		lsg      global112
		ldi      106
		eq?     
		bt       code_028b
		lsg      global112
		ldi      116
		eq?     
		bt       code_028b
		lsg      global112
		ldi      136
		eq?     
		bt       code_028b
		lsg      global112
		ldi      51
		eq?     
		bt       code_028b
		lsg      global112
		ldi      117
		eq?     
		bt       code_028b
		lsg      global112
		ldi      147
		eq?     
		bt       code_028b
		lsg      global112
		ldi      148
		eq?     
		bt       code_028b
		lsg      global112
		ldi      149
		eq?     
		bt       code_028b
		lsg      global112
		ldi      168
		eq?     
		bt       code_028b
		lsg      global112
		ldi      169
		eq?     
		bt       code_028b
		lsg      global112
		ldi      170
		eq?     
		bt       code_028b
		lsg      global112
		ldi      182
		eq?     
		bt       code_028b
		lsg      global112
		ldi      64
		eq?     
		bt       code_028b
		lsg      global112
		ldi      129
		eq?     
		bt       code_028b
		lsg      global112
		ldi      146
		eq?     
		bt       code_028b
		lsg      global112
		ldi      76
		eq?     
		bt       code_028b
		lsg      global112
		ldi      171
		eq?     
		bt       code_028b
		lsg      global112
		ldi      183
		eq?     
code_028b:
		bnt      code_0295
		ldi      1
		sag      global108
		jmp      code_0524
code_0295:
		lsg      global112
		ldi      24
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      39
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      54
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      70
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      86
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      101
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      117
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      133
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      149
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      21
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      23
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      35
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      50
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      54
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      85
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      86
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      89
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      115
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      121
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      133
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      153
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      101
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      121
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      137
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      48
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      81
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      97
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      113
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      2
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      17
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      32
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      64
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      129
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      146
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      166
		eq?     
		bt       code_03bb
		lsg      global112
		ldi      182
		eq?     
code_03bb:
		bnt      code_03c5
		ldi      2
		sag      global108
		jmp      code_0524
code_03c5:
		lsg      global112
		ldi      9
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      25
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      40
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      55
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      71
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      87
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      102
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      118
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      134
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      150
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      21
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      23
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      35
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      50
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      54
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      85
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      86
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      89
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      115
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      121
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      133
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      153
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      67
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      43
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      91
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      107
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      123
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      139
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      76
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      171
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      183
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      7
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      27
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      60
		eq?     
		bt       code_04e2
		lsg      global112
		ldi      156
		eq?     
code_04e2:
		bnt      code_04ec
		ldi      4
		sag      global108
		jmp      code_0524
code_04ec:
		lsg      global108
		dup     
		ldi      1
		eq?     
		bnt      code_04fc
		ldi      3
		sag      global108
		jmp      code_0523
code_04fc:
		dup     
		ldi      3
		eq?     
		bnt      code_050a
		ldi      1
		sag      global108
		jmp      code_0523
code_050a:
		dup     
		ldi      4
		eq?     
		bnt      code_0518
		ldi      2
		sag      global108
		jmp      code_0523
code_0518:
		dup     
		ldi      2
		eq?     
		bnt      code_0523
		ldi      4
		sag      global108
code_0523:
		toss    
code_0524:
		lsg      global11
		ldi      180
		eq?     
		bnt      code_0535
		ldi      40
		sal      local264
		jmp      code_0571
code_0535:
		lsg      global108
		dup     
		ldi      1
		eq?     
		bnt      code_0546
		ldi      24
		sal      local264
		jmp      code_0570
code_0546:
		dup     
		ldi      3
		eq?     
		bnt      code_0555
		ldi      28
		sal      local264
		jmp      code_0570
code_0555:
		dup     
		ldi      2
		eq?     
		bnt      code_0564
		ldi      36
		sal      local264
		jmp      code_0570
code_0564:
		dup     
		ldi      4
		eq?     
		bnt      code_0570
		ldi      32
		sal      local264
code_0570:
		toss    
code_0571:
		lal      local264
		sal      local265
		lsl      local264
		ldi      1
		add     
		sal      local266
		lsl      local264
		ldi      2
		add     
		sal      local267
		lsl      local264
		ldi      3
		add     
		sal      local268
		lsg      global11
		ldi      220
		eq?     
		bnt      code_0640
		pushi    284
		pushi    #-info-
		lal      local265
		lsli     local140
		lal      local266
		lsli     local140
		pushi    107
		pushi    0
		pushi    283
		pushi    4
		class    PolyPath
		push    
		lal      local267
		lsli     local140
		lal      local268
		lsli     local140
		lofsa    sherMan
		push    
		pushi    #new
		pushi    0
		lofsa    sherMan
		send     4
		push    
		ldi      0
		sali     local17
		send     24
		pushi    284
		pushi    #-info-
		lal      local265
		lsli     local180
		lal      local266
		lsli     local180
		pushi    107
		pushi    0
		pushi    283
		pushi    4
		class    PolyPath
		push    
		lal      local267
		lsli     local180
		lal      local268
		lsli     local180
		lofsa    sherMan
		push    
		pushi    #new
		pushi    0
		lofsa    sherMan
		send     4
		push    
		ldi      1
		sali     local17
		send     24
		pushi    284
		pushi    #-info-
		lal      local265
		lsli     local220
		lal      local266
		lsli     local220
		pushi    107
		pushi    0
		pushi    283
		pushi    4
		class    PolyPath
		push    
		lal      local267
		lsli     local220
		lal      local268
		lsli     local220
		lofsa    sherMan
		push    
		pushi    #new
		pushi    0
		lofsa    sherMan
		send     4
		push    
		ldi      2
		sali     local17
		send     24
		jmp      code_0676
code_0640:
		pushi    284
		pushi    #-info-
		lal      local265
		lsli     local220
		lal      local266
		lsli     local220
		pushi    107
		pushi    0
		pushi    283
		pushi    4
		class    PolyPath
		push    
		lal      local267
		lsli     local220
		lal      local268
		lsli     local220
		lofsa    sherMan
		push    
		pushi    #new
		pushi    0
		lofsa    sherMan
		send     4
		push    
		ldi      0
		sali     local17
		send     24
code_0676:
		ret     
	)
)

(procedure (proc750_2)
	(asm
		lsg      global137
		ldi      2
		gt?     
		bnt      code_06b3
		lsg      global126
		ldi      0
		eq?     
		bnt      code_06b3
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
		lag      global0
		send     24
		jmp      code_06b7
code_06b3:
		pushi    0
		callb    proc0_2,  0
code_06b7:
		lsg      global137
		dup     
		ldi      0
		eq?     
		bnt      code_06c5
		+ag      global137
		jmp      code_08b2
code_06c5:
		dup     
		ldi      1
		eq?     
		bnt      code_06d1
		+ag      global137
		jmp      code_08b2
code_06d1:
		dup     
		ldi      2
		eq?     
		bnt      code_06dd
		+ag      global137
		jmp      code_08b2
code_06dd:
		dup     
		ldi      3
		eq?     
		bnt      code_0859
		pushi    #disable
		pushi    1
		pushi    5
		lag      global69
		send     6
		pushi    1
		pushi    36
		callb    proc0_5,  2
		not     
		bnt      code_06fd
		lsg      global130
		ldi      9
		eq?     
code_06fd:
		bt       code_070f
		pushi    1
		pushi    38
		callb    proc0_5,  2
		not     
		bnt      code_08b2
		lsg      global130
		ldi      12
		eq?     
code_070f:
		bnt      code_08b2
		lsg      global11
		ldi      220
		eq?     
		bnt      code_0849
		lsg      global112
		ldi      24
		eq?     
		bt       code_0842
		lsg      global112
		ldi      39
		eq?     
		bt       code_0842
		lsg      global112
		ldi      54
		eq?     
		bt       code_0842
		lsg      global112
		ldi      70
		eq?     
		bt       code_0842
		lsg      global112
		ldi      86
		eq?     
		bt       code_0842
		lsg      global112
		ldi      101
		eq?     
		bt       code_0842
		lsg      global112
		ldi      117
		eq?     
		bt       code_0842
		lsg      global112
		ldi      133
		eq?     
		bt       code_0842
		lsg      global112
		ldi      149
		eq?     
		bt       code_0842
		lsg      global112
		ldi      9
		eq?     
		bt       code_0842
		lsg      global112
		ldi      25
		eq?     
		bt       code_0842
		lsg      global112
		ldi      40
		eq?     
		bt       code_0842
		lsg      global112
		ldi      55
		eq?     
		bt       code_0842
		lsg      global112
		ldi      71
		eq?     
		bt       code_0842
		lsg      global112
		ldi      87
		eq?     
		bt       code_0842
		lsg      global112
		ldi      102
		eq?     
		bt       code_0842
		lsg      global112
		ldi      118
		eq?     
		bt       code_0842
		lsg      global112
		ldi      134
		eq?     
		bt       code_0842
		lsg      global112
		ldi      150
		eq?     
		bt       code_0842
		lsg      global112
		ldi      26
		eq?     
		bt       code_0842
		lsg      global112
		ldi      168
		eq?     
		bt       code_0842
		lsg      global112
		ldi      58
		eq?     
		bt       code_0842
		lsg      global112
		ldi      90
		eq?     
		bt       code_0842
		lsg      global112
		ldi      121
		eq?     
		bt       code_0842
		lsg      global112
		ldi      89
		eq?     
		bt       code_0842
		lsg      global112
		ldi      136
		eq?     
		bt       code_0842
		lsg      global112
		ldi      41
		eq?     
		bt       code_0842
		lsg      global112
		ldi      73
		eq?     
		bt       code_0842
		lsg      global112
		ldi      104
		eq?     
		bt       code_0842
		lsg      global112
		ldi      151
		eq?     
		bt       code_0842
		lsg      global112
		ldi      43
		eq?     
		bt       code_0842
		lsg      global112
		ldi      75
		eq?     
		bt       code_0842
		lsg      global112
		ldi      106
		eq?     
		bt       code_0842
		lsg      global112
		ldi      153
		eq?     
		bt       code_0842
		lsg      global112
		ldi      166
		eq?     
		bt       code_0842
		lsg      global112
		ldi      182
		eq?     
code_0842:
		bnt      code_0849
		pushi    0
		callb    proc0_3,  0
code_0849:
		pushi    #setScript
		pushi    1
		lofsa    outlawSweep
		push    
		lofsa    sweepRgn
		send     6
		jmp      code_08b2
code_0859:
		dup     
		ldi      4
		eq?     
		bnt      code_0870
		pushi    #setScript
		pushi    1
		lofsa    cleanSweep
		push    
		lofsa    sweepRgn
		send     6
		jmp      code_08b2
code_0870:
		dup     
		ldi      5
		eq?     
		bnt      code_0887
		pushi    #setScript
		pushi    1
		lofsa    cleanSweep
		push    
		lofsa    sweepRgn
		send     6
		jmp      code_08b2
code_0887:
		dup     
		ldi      6
		eq?     
		bnt      code_089e
		pushi    #setScript
		pushi    1
		lofsa    cleanSweep
		push    
		lofsa    sweepRgn
		send     6
		jmp      code_08b2
code_089e:
		dup     
		ldi      7
		eq?     
		bnt      code_08b2
		pushi    #setScript
		pushi    1
		lofsa    surroundEgo
		push    
		lofsa    sweepRgn
		send     6
code_08b2:
		toss    
		ret     
	)
)

(procedure (proc750_3 &tmp temp0)
	(asm
		pushi    #setScript
		pushi    1
		pushi    0
		lofsa    sweepRgn
		send     6
		pushi    #contains
		pushi    1
		lsl      local29
		lag      global5
		send     6
		bnt      code_08e0
		pushi    #setMotion
		pushi    1
		pushi    0
		pushi    150
		pushi    1
		pushi    0
		pushi    84
		pushi    0
		pushi    108
		pushi    0
		lal      local29
		send     20
code_08e0:
		ldi      0
		sat      temp0
code_08e4:
		lst      temp0
		ldi      3
		lt?     
		bnt      code_091a
		pushi    #contains
		pushi    1
		lat      temp0
		lsli     local17
		lag      global5
		send     6
		bnt      code_0915
		pushi    #setAvoider
		pushi    1
		pushi    0
		pushi    283
		pushi    1
		pushi    0
		pushi    150
		pushi    1
		pushi    0
		pushi    84
		pushi    0
		pushi    108
		pushi    0
		lat      temp0
		lali     local17
		send     26
code_0915:
		+at      temp0
		jmp      code_08e4
code_091a:
		ldi      0
		sal      local28
		ldi      0
		sal      local29
		pushi    0
		ldi      0
		sali     local17
		pushi    0
		ldi      1
		sali     local17
		pushi    0
		ldi      2
		sali     local17
		ret     
	)
)

(instance sweepRgn of Rgn
	(properties
		keep 1
	)
	
	(method (init)
		(asm
			pushi    3
			pushi    130
			pushi    928
			pushi    930
			callk    Load,  6
			pushi    2
			pushi    129
			pushi    803
			callk    Load,  4
			pushi    3
			pushi    132
			pushi    400
			pushi    25
			calle    proc958_0,  6
			pushi    12
			pushi    128
			pushi    753
			pushi    3
			pushi    792
			pushi    132
			pushi    218
			pushi    2
			pushi    18
			pushi    27
			pushi    35
			pushi    38
			pushi    805
			calle    proc958_0,  24
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_09b1
			ldi      1
			sal      local4
			jmp      code_0a02
code_09b1:
			dup     
			ldi      4
			eq?     
			bnt      code_09bf
			ldi      6
			sal      local4
			jmp      code_0a02
code_09bf:
			dup     
			ldi      1
			eq?     
			bnt      code_09cd
			ldi      7
			sal      local4
			jmp      code_0a02
code_09cd:
			dup     
			ldi      2
			eq?     
			bnt      code_09db
			ldi      4
			sal      local4
			jmp      code_0a02
code_09db:
			dup     
			ldi      3
			eq?     
			bnt      code_09e9
			ldi      5
			sal      local4
			jmp      code_0a02
code_09e9:
			dup     
			ldi      5
			eq?     
			bnt      code_09f7
			ldi      9
			sal      local4
			jmp      code_0a02
code_09f7:
			dup     
			ldi      6
			eq?     
			bnt      code_0a02
			ldi      8
			sal      local4
code_0a02:
			toss    
			pushi    #init
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    1
			pushi    115
			callb    proc0_5,  2
			bnt      code_0a46
			lsl      local26
			ldi      0
			eq?     
			bnt      code_0a46
			ldi      1
			sal      local26
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    sweepRgn
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_0a76
code_0a46:
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_0a64
			pushi    1
			pushi    110
			callb    proc0_7,  2
			ldi      0
			sal      local26
			pushi    #doit
			pushi    0
			lofsa    handSignCode
			send     4
			jmp      code_0a76
code_0a64:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0a76
			pushi    #setScript
			pushi    1
			pushi    0
			self     6
code_0a76:
			pushi    #doit
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (dispose &tmp temp0)
		(asm
			pushi    #setScript
			pushi    1
			pushi    0
			self     6
			pushi    1
			pushi    129
			callb    proc0_7,  2
			pushi    #dispose
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    5
			lsp      newRoomNumber
			pushi    220
			pushi    180
			pushi    210
			pushi    250
			calle    proc999_5,  10
			not     
			bnt      code_0953
			pushi    #keep
			pushi    1
			pushi    0
			self     6
code_0953:
			ret     
		)
	)
)

(instance sherPic of PicView
	(properties)
)

(instance sherMan of Actor
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    753
			pushi    17
			pushi    1
			pushi    24576
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    754
			self     20
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit &tmp [temp0 2])
		(asm
			pushi    #distanceTo
			pushi    1
			lsg      global0
			self     6
			push    
			ldi      80
			lt?     
			bnt      code_0c40
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pToa     y
			sub     
			push    
			callk    Abs,  2
			push    
			ldi      20
			lt?     
			bnt      code_0c40
			lsg      global108
			ldi      1
			eq?     
			bt       code_0c76
			lsg      global108
			ldi      3
			eq?     
code_0c40:
			bt       code_0c76
			pushi    #distanceTo
			pushi    1
			lsg      global0
			self     6
			push    
			ldi      60
			lt?     
			bnt      code_0d4a
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pToa     x
			sub     
			push    
			callk    Abs,  2
			push    
			ldi      20
			lt?     
			bnt      code_0d4a
			lsg      global108
			ldi      2
			eq?     
			bt       code_0c76
			lsg      global108
			ldi      4
			eq?     
code_0c76:
			bnt      code_0d4a
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      238
			lt?     
			bnt      code_0c94
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      229
			gt?     
code_0c94:
			not     
			bnt      code_0d4a
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_0d4a
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      128
			and     
			not     
			bnt      code_0d4a
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      792
			ne?     
			bnt      code_0d4a
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      132
			ne?     
			bnt      code_0d4a
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      218
			ne?     
			bnt      code_0d4a
			lal      local27
			not     
			bnt      code_0d4a
			ldi      1
			sal      local27
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_0d07
			pushi    #setScript
			pushi    1
			lofsa    yourDead
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_0d49
code_0d07:
			dup     
			ldi      4
			eq?     
			bnt      code_0d1e
			pushi    #setScript
			pushi    1
			lofsa    bustedPuck
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_0d49
code_0d1e:
			dup     
			ldi      6
			eq?     
			bnt      code_0d35
			pushi    #setScript
			pushi    1
			lofsa    bustedFensMonk
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_0d49
code_0d35:
			dup     
			ldi      5
			eq?     
			bnt      code_0d49
			pushi    #setScript
			pushi    1
			lofsa    bustedAbbeyMonk
			push    
			lofsa    sweepRgn
			send     6
code_0d49:
			toss    
code_0d4a:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			ldi      0
			sal      local28
			pushi    #dispose
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_0d6a
			pushi    #setScript
			pushi    1
			lofsa    surrenderToSweep
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_0dda
code_0d6a:
			dup     
			ldi      2
			eq?     
			bnt      code_0d80
			pushi    3
			pushi    1750
			pushi    59
			pushi    0
			calle    proc13_4,  6
			jmp      code_0dda
code_0d80:
			dup     
			ldi      3
			eq?     
			bnt      code_0d96
			pushi    3
			pushi    1750
			pushi    60
			pushi    0
			calle    proc13_4,  6
			jmp      code_0dda
code_0d96:
			dup     
			ldi      10
			eq?     
			bnt      code_0dcf
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0dc0
			ldi      1
			sal      local31
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    sweepRgn
			send     6
			pushi    #setScript
			pushi    1
			lofsa    yourDead
			push    
			self     6
			jmp      code_0dda
code_0dc0:
			pushi    3
			pushi    1750
			pushi    64
			pushi    1
			calle    proc13_4,  6
			jmp      code_0dda
code_0dcf:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_0dda:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			+al      local30
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0b64
			pushi    #dispose
			pushi    0
			ldi      0
			lali     local17
			send     4
			pushi    0
			ldi      0
			sali     local17
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      238
			lt?     
			bnt      code_0b5d
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      229
			gt?     
			bnt      code_0b5d
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    4
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
code_0b5d:
			ldi      0
			sal      local30
			jmp      code_0bd9
code_0b64:
			lsl      local30
			ldi      3
			eq?     
			bnt      code_0bd9
			pushi    #dispose
			pushi    0
			ldi      0
			lali     local17
			send     4
			pushi    #dispose
			pushi    0
			ldi      1
			lali     local17
			send     4
			pushi    #dispose
			pushi    0
			ldi      2
			lali     local17
			send     4
			pushi    0
			ldi      0
			sali     local17
			pushi    0
			ldi      1
			sali     local17
			pushi    0
			ldi      2
			sali     local17
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      238
			lt?     
			bnt      code_0bb1
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      229
			gt?     
code_0bb1:
			bt       code_0bc0
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      128
			and     
code_0bc0:
			bnt      code_0bd5
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    4
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
code_0bd5:
			ldi      0
			sal      local30
code_0bd9:
			pushi    #cue
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance outlawSweep of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f51
			pushi    #actions
			pushi    1
			lofsa    handJive
			push    
			lag      global0
			send     6
			lsg      global11
			ldi      220
			eq?     
			bnt      code_0f4a
			lsg      global112
			ldi      7
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      27
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      60
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      2
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      17
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      32
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      76
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      171
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      183
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      64
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      129
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      146
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      24
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      39
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      86
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      40
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      55
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      102
			eq?     
			bt       code_0f2d
			lsg      global112
			ldi      168
			eq?     
code_0f2d:
			bnt      code_0f34
			pushi    0
			callb    proc0_3,  0
code_0f34:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_1944
code_0f4a:
			ldi      4
			aTop     ticks
			jmp      code_1944
code_0f51:
			dup     
			ldi      1
			eq?     
			bnt      code_0f93
			lsg      global11
			ldi      180
			eq?     
			bnt      code_0f7c
			lsg      global108
			ldi      2
			eq?     
			bt       code_0f6e
			lsg      global108
			ldi      1
			eq?     
code_0f6e:
			bnt      code_0f78
			ldi      1
			sal      local32
			jmp      code_0f7c
code_0f78:
			ldi      0
			sal      local32
code_0f7c:
			+ag      global137
			pushi    #number
			pushi    1
			pushi    402
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			lag      global114
			send     18
			jmp      code_1944
code_0f93:
			dup     
			ldi      2
			eq?     
			bnt      code_0fed
			lag      global25
			bnt      code_0fa4
			pushi    #dispose
			pushi    0
			send     4
code_0fa4:
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_0fe4
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0fc9
			pushi    4
			lea      @local34
			push    
			lsl      local4
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1944
code_0fc9:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_1944
			pushi    4
			lea      @local38
			push    
			lsl      local4
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1944
code_0fe4:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1944
code_0fed:
			dup     
			ldi      3
			eq?     
			bnt      code_1203
			pushi    0
			callk    HaveMouse,  0
			not     
			bnt      code_101c
			pushi    187
			pushi    #x
			lsg      global19
			pushi    1
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
			ldi      20
			sub     
			push    
			lag      global1
			send     12
code_101c:
			lsg      global11
			ldi      220
			eq?     
			bnt      code_11fc
			lsg      global112
			ldi      7
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      27
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      60
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      2
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      17
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      32
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      76
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      171
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      183
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      64
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      129
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      146
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      24
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      39
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      86
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      40
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      55
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      102
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      168
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      24
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      39
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      54
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      70
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      86
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      101
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      117
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      133
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      149
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      9
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      25
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      40
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      55
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      71
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      87
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      102
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      118
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      134
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      150
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      26
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      168
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      58
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      90
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      121
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      89
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      136
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      41
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      73
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      104
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      151
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      43
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      75
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      106
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      153
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      166
			eq?     
			bt       code_11e9
			lsg      global112
			ldi      182
			eq?     
code_11e9:
			bnt      code_11fc
			pushi    #setScript
			pushi    1
			lofsa    cleanSweep
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_1944
code_11fc:
			ldi      5
			aTop     seconds
			jmp      code_1944
code_1203:
			dup     
			ldi      4
			eq?     
			bnt      code_1231
			lsg      global11
			ldi      220
			eq?     
			bnt      code_1228
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_1228
			ldi      3
			aTop     seconds
			jmp      code_1944
code_1228:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1944
code_1231:
			dup     
			ldi      5
			eq?     
			bnt      code_1869
			pushi    #number
			pushi    1
			pushi    400
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			ldi      1
			sal      local28
			lsg      global126
			ldi      0
			eq?     
			bnt      code_1860
			pushi    5
			pushi    1
			pushi    753
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_142b
			lsg      global112
			ldi      48
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      81
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      97
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      113
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      2
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      17
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      32
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      64
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      129
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      146
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      166
			eq?     
			bt       code_12cd
			lsg      global112
			ldi      182
			eq?     
code_12cd:
			bnt      code_12d6
			ldi      330
			jmp      code_1438
code_12d6:
			lsg      global112
			ldi      43
			eq?     
			bt       code_1337
			lsg      global112
			ldi      91
			eq?     
			bt       code_1337
			lsg      global112
			ldi      107
			eq?     
			bt       code_1337
			lsg      global112
			ldi      123
			eq?     
			bt       code_1337
			lsg      global112
			ldi      139
			eq?     
			bt       code_1337
			lsg      global112
			ldi      76
			eq?     
			bt       code_1337
			lsg      global112
			ldi      171
			eq?     
			bt       code_1337
			lsg      global112
			ldi      183
			eq?     
			bt       code_1337
			lsg      global112
			ldi      7
			eq?     
			bt       code_1337
			lsg      global112
			ldi      27
			eq?     
			bt       code_1337
			lsg      global112
			ldi      60
			eq?     
			bt       code_1337
			lsg      global112
			ldi      156
			eq?     
code_1337:
			bnt      code_133f
			ldi      65526
			jmp      code_1438
code_133f:
			lsg      global112
			ldi      3
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      4
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      5
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      6
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      24
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      25
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      26
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      2
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      17
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      32
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      7
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      27
			eq?     
			bt       code_13a4
			lsg      global112
			ldi      60
			eq?     
code_13a4:
			bnt      code_13ad
			ldi      280
			jmp      code_1438
code_13ad:
			lsg      global112
			ldi      147
			eq?     
			bt       code_141d
			lsg      global112
			ldi      148
			eq?     
			bt       code_141d
			lsg      global112
			ldi      149
			eq?     
			bt       code_141d
			lsg      global112
			ldi      168
			eq?     
			bt       code_141d
			lsg      global112
			ldi      169
			eq?     
			bt       code_141d
			lsg      global112
			ldi      170
			eq?     
			bt       code_141d
			lsg      global112
			ldi      182
			eq?     
			bt       code_141d
			lsg      global112
			ldi      64
			eq?     
			bt       code_141d
			lsg      global112
			ldi      129
			eq?     
			bt       code_141d
			lsg      global112
			ldi      146
			eq?     
			bt       code_141d
			lsg      global112
			ldi      76
			eq?     
			bt       code_141d
			lsg      global112
			ldi      171
			eq?     
			bt       code_141d
			lsg      global112
			ldi      183
			eq?     
code_141d:
			bnt      code_1426
			ldi      320
			jmp      code_1438
code_1426:
			ldi      0
			jmp      code_1438
code_142b:
			lal      local32
			bnt      code_1436
			ldi      325
			jmp      code_1438
code_1436:
			ldi      0
code_1438:
			push    
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_1602
			lsg      global112
			ldi      48
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      81
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      97
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      113
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      2
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      17
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      32
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      64
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      129
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      146
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      166
			eq?     
			bt       code_14a6
			lsg      global112
			ldi      182
			eq?     
code_14a6:
			bnt      code_14ae
			ldi      85
			jmp      code_1605
code_14ae:
			lsg      global112
			ldi      43
			eq?     
			bt       code_150f
			lsg      global112
			ldi      91
			eq?     
			bt       code_150f
			lsg      global112
			ldi      107
			eq?     
			bt       code_150f
			lsg      global112
			ldi      123
			eq?     
			bt       code_150f
			lsg      global112
			ldi      139
			eq?     
			bt       code_150f
			lsg      global112
			ldi      76
			eq?     
			bt       code_150f
			lsg      global112
			ldi      171
			eq?     
			bt       code_150f
			lsg      global112
			ldi      183
			eq?     
			bt       code_150f
			lsg      global112
			ldi      7
			eq?     
			bt       code_150f
			lsg      global112
			ldi      27
			eq?     
			bt       code_150f
			lsg      global112
			ldi      60
			eq?     
			bt       code_150f
			lsg      global112
			ldi      156
			eq?     
code_150f:
			bnt      code_1517
			ldi      120
			jmp      code_1605
code_1517:
			lsg      global112
			ldi      3
			eq?     
			bt       code_157c
			lsg      global112
			ldi      4
			eq?     
			bt       code_157c
			lsg      global112
			ldi      5
			eq?     
			bt       code_157c
			lsg      global112
			ldi      6
			eq?     
			bt       code_157c
			lsg      global112
			ldi      24
			eq?     
			bt       code_157c
			lsg      global112
			ldi      25
			eq?     
			bt       code_157c
			lsg      global112
			ldi      26
			eq?     
			bt       code_157c
			lsg      global112
			ldi      2
			eq?     
			bt       code_157c
			lsg      global112
			ldi      17
			eq?     
			bt       code_157c
			lsg      global112
			ldi      32
			eq?     
			bt       code_157c
			lsg      global112
			ldi      7
			eq?     
			bt       code_157c
			lsg      global112
			ldi      27
			eq?     
			bt       code_157c
			lsg      global112
			ldi      60
			eq?     
code_157c:
			bnt      code_1585
			ldi      240
			jmp      code_1605
code_1585:
			lsg      global112
			ldi      147
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      148
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      149
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      168
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      169
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      170
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      182
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      64
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      129
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      146
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      76
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      171
			eq?     
			bt       code_15f5
			lsg      global112
			ldi      183
			eq?     
code_15f5:
			bnt      code_15fd
			ldi      85
			jmp      code_1605
code_15fd:
			ldi      92
			jmp      code_1605
code_1602:
			ldi      179
code_1605:
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			sal      local29
			send     34
			lsg      global11
			ldi      220
			eq?     
			bnt      code_1830
			lsg      global112
			ldi      48
			eq?     
			bt       code_1686
			lsg      global112
			ldi      81
			eq?     
			bt       code_1686
			lsg      global112
			ldi      97
			eq?     
			bt       code_1686
			lsg      global112
			ldi      113
			eq?     
			bt       code_1686
			lsg      global112
			ldi      2
			eq?     
			bt       code_1686
			lsg      global112
			ldi      17
			eq?     
			bt       code_1686
			lsg      global112
			ldi      32
			eq?     
			bt       code_1686
			lsg      global112
			ldi      64
			eq?     
			bt       code_1686
			lsg      global112
			ldi      129
			eq?     
			bt       code_1686
			lsg      global112
			ldi      146
			eq?     
			bt       code_1686
			lsg      global112
			ldi      166
			eq?     
			bt       code_1686
			lsg      global112
			ldi      182
			eq?     
code_1686:
			bnt      code_169e
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    275
			pushi    90
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_169e:
			lsg      global112
			ldi      43
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      91
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      107
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      123
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      139
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      76
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      171
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      183
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      7
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      27
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      60
			eq?     
			bt       code_16ff
			lsg      global112
			ldi      156
			eq?     
code_16ff:
			bnt      code_1716
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    30
			pushi    120
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_1716:
			lsg      global112
			ldi      3
			eq?     
			bt       code_177b
			lsg      global112
			ldi      4
			eq?     
			bt       code_177b
			lsg      global112
			ldi      5
			eq?     
			bt       code_177b
			lsg      global112
			ldi      6
			eq?     
			bt       code_177b
			lsg      global112
			ldi      24
			eq?     
			bt       code_177b
			lsg      global112
			ldi      25
			eq?     
			bt       code_177b
			lsg      global112
			ldi      26
			eq?     
			bt       code_177b
			lsg      global112
			ldi      2
			eq?     
			bt       code_177b
			lsg      global112
			ldi      17
			eq?     
			bt       code_177b
			lsg      global112
			ldi      32
			eq?     
			bt       code_177b
			lsg      global112
			ldi      7
			eq?     
			bt       code_177b
			lsg      global112
			ldi      27
			eq?     
			bt       code_177b
			lsg      global112
			ldi      60
			eq?     
code_177b:
			bnt      code_1794
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    280
			pushi    185
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_1794:
			lsg      global112
			ldi      147
			eq?     
			bt       code_1804
			lsg      global112
			ldi      148
			eq?     
			bt       code_1804
			lsg      global112
			ldi      149
			eq?     
			bt       code_1804
			lsg      global112
			ldi      168
			eq?     
			bt       code_1804
			lsg      global112
			ldi      169
			eq?     
			bt       code_1804
			lsg      global112
			ldi      170
			eq?     
			bt       code_1804
			lsg      global112
			ldi      182
			eq?     
			bt       code_1804
			lsg      global112
			ldi      64
			eq?     
			bt       code_1804
			lsg      global112
			ldi      129
			eq?     
			bt       code_1804
			lsg      global112
			ldi      146
			eq?     
			bt       code_1804
			lsg      global112
			ldi      76
			eq?     
			bt       code_1804
			lsg      global112
			ldi      171
			eq?     
			bt       code_1804
			lsg      global112
			ldi      183
			eq?     
code_1804:
			bnt      code_181c
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    275
			pushi    90
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_181c:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    30
			pushi    92
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_1830:
			lal      local32
			bnt      code_184b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    290
			pushi    179
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_184b:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    30
			pushi    179
			pushSelf
			lal      local29
			send     12
			jmp      code_1944
code_1860:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1944
code_1869:
			dup     
			ldi      6
			eq?     
			bnt      code_1890
			lsg      global126
			ldi      0
			eq?     
			bnt      code_1887
			pushi    2
			lsl      local29
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_1944
code_1887:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1944
code_1890:
			dup     
			ldi      7
			eq?     
			bnt      code_18c2
			lsg      global126
			ldi      0
			eq?     
			bnt      code_18bb
			lag      global25
			bnt      code_18a9
			pushi    #dispose
			pushi    0
			send     4
code_18a9:
			pushi    5
			pushi    1750
			pushi    3
			pushi    0
			pushi    80
			lofsa    {Sheriff's Man}
			push    
			calle    proc13_4,  10
code_18bb:
			ldi      4
			aTop     seconds
			jmp      code_1944
code_18c2:
			dup     
			ldi      8
			eq?     
			bnt      code_191c
			lsg      global126
			ldi      0
			eq?     
			bnt      code_18e1
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			lsg      global0
			pushi    30
			lal      local29
			send     10
code_18e1:
			lsg      global137
			dup     
			ldi      4
			eq?     
			bnt      code_18f1
			ldi      5
			aTop     seconds
			jmp      code_1918
code_18f1:
			dup     
			ldi      5
			eq?     
			bnt      code_18ff
			ldi      4
			aTop     seconds
			jmp      code_1918
code_18ff:
			dup     
			ldi      6
			eq?     
			bnt      code_190d
			ldi      3
			aTop     seconds
			jmp      code_1918
code_190d:
			dup     
			ldi      7
			eq?     
			bnt      code_1918
			ldi      1
			aTop     seconds
code_1918:
			toss    
			jmp      code_1944
code_191c:
			dup     
			ldi      9
			eq?     
			bnt      code_1944
			lsg      global11
			ldi      220
			eq?     
			bnt      code_1931
			pushi    0
			call     localproc_001a,  0
code_1931:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1944:
			toss    
			ret     
		)
	)
)

(instance cleanSweep of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ad6
			pushi    #actions
			pushi    1
			lofsa    handJive
			push    
			lag      global0
			send     6
			lsg      global11
			ldi      220
			eq?     
			bnt      code_1acf
			lsg      global112
			ldi      24
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      39
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      54
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      70
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      86
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      101
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      117
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      133
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      149
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      9
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      25
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      40
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      55
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      71
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      87
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      102
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      118
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      134
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      150
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      26
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      168
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      58
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      90
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      121
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      89
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      136
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      41
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      73
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      104
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      151
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      43
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      75
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      106
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      153
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      166
			eq?     
			bt       code_1ac8
			lsg      global112
			ldi      182
			eq?     
code_1ac8:
			bnt      code_1acf
			pushi    0
			callb    proc0_3,  0
code_1acf:
			ldi      12
			aTop     ticks
			jmp      code_2340
code_1ad6:
			dup     
			ldi      1
			eq?     
			bnt      code_1b0c
			+ag      global137
			push    
			ldi      4
			eq?     
			bnt      code_1b03
			lag      global25
			bnt      code_1af0
			pushi    #dispose
			pushi    0
			send     4
code_1af0:
			pushi    4
			lea      @local52
			push    
			lsl      local4
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2340
code_1b03:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2340
code_1b0c:
			dup     
			ldi      2
			eq?     
			bnt      code_1d34
			pushi    0
			callk    HaveMouse,  0
			not     
			bnt      code_1b3b
			pushi    187
			pushi    #x
			lsg      global19
			pushi    1
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
			ldi      20
			sub     
			push    
			lag      global1
			send     12
code_1b3b:
			lsg      global112
			ldi      7
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      27
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      60
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      2
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      17
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      32
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      76
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      171
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      183
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      64
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      129
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      146
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      24
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      39
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      86
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      40
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      55
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      102
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      168
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      24
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      39
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      54
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      70
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      86
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      101
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      117
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      133
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      149
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      9
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      25
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      40
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      55
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      71
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      87
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      102
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      118
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      134
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      150
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      26
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      168
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      58
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      90
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      121
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      89
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      136
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      41
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      73
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      104
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      151
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      43
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      75
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      106
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      153
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      166
			eq?     
			bt       code_1cff
			lsg      global112
			ldi      182
			eq?     
code_1cff:
			bnt      code_1d0b
			-ag      global137
			ldi      2
			aTop     ticks
			jmp      code_2340
code_1d0b:
			lsg      global137
			dup     
			ldi      4
			eq?     
			bnt      code_1d1c
			ldi      400
			aTop     ticks
			jmp      code_1d30
code_1d1c:
			dup     
			ldi      5
			eq?     
			bnt      code_1d2b
			ldi      300
			aTop     ticks
			jmp      code_1d30
code_1d2b:
			ldi      180
			aTop     ticks
code_1d30:
			toss    
			jmp      code_2340
code_1d34:
			dup     
			ldi      3
			eq?     
			bnt      code_1d58
			lag      global25
			bnt      code_1d45
			pushi    #dispose
			pushi    0
			send     4
code_1d45:
			pushi    4
			lea      @local56
			push    
			lsl      local4
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2340
code_1d58:
			dup     
			ldi      4
			eq?     
			bnt      code_1f80
			pushi    0
			callk    HaveMouse,  0
			not     
			bnt      code_1d87
			pushi    187
			pushi    #x
			lsg      global19
			pushi    1
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
			ldi      20
			sub     
			push    
			lag      global1
			send     12
code_1d87:
			lsg      global112
			ldi      7
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      27
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      60
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      2
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      17
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      32
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      76
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      171
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      183
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      64
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      129
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      146
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      24
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      39
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      86
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      40
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      55
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      102
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      168
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      24
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      39
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      54
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      70
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      86
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      101
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      117
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      133
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      149
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      9
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      25
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      40
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      55
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      71
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      87
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      102
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      118
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      134
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      150
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      26
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      168
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      58
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      90
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      121
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      89
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      136
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      41
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      73
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      104
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      151
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      43
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      75
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      106
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      153
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      166
			eq?     
			bt       code_1f4b
			lsg      global112
			ldi      182
			eq?     
code_1f4b:
			bnt      code_1f57
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2340
code_1f57:
			lsg      global137
			dup     
			ldi      4
			eq?     
			bnt      code_1f68
			ldi      500
			aTop     ticks
			jmp      code_1f7c
code_1f68:
			dup     
			ldi      5
			eq?     
			bnt      code_1f77
			ldi      450
			aTop     ticks
			jmp      code_1f7c
code_1f77:
			ldi      375
			aTop     ticks
code_1f7c:
			toss    
			jmp      code_2340
code_1f80:
			dup     
			ldi      5
			eq?     
			bnt      code_1fb7
			lsg      global126
			ldi      0
			eq?     
			bnt      code_1fae
			lag      global25
			bnt      code_1f99
			pushi    #dispose
			pushi    0
			send     4
code_1f99:
			pushi    5
			pushi    1750
			pushi    4
			pushSelf
			pushi    80
			lofsa    {Sheriff's Man}
			push    
			calle    proc13_4,  10
			jmp      code_2340
code_1fae:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2340
code_1fb7:
			dup     
			ldi      6
			eq?     
			bnt      code_21c4
			lsg      global112
			ldi      7
			eq?     
			bt       code_2182
			lsg      global112
			ldi      27
			eq?     
			bt       code_2182
			lsg      global112
			ldi      60
			eq?     
			bt       code_2182
			lsg      global112
			ldi      2
			eq?     
			bt       code_2182
			lsg      global112
			ldi      17
			eq?     
			bt       code_2182
			lsg      global112
			ldi      32
			eq?     
			bt       code_2182
			lsg      global112
			ldi      76
			eq?     
			bt       code_2182
			lsg      global112
			ldi      171
			eq?     
			bt       code_2182
			lsg      global112
			ldi      183
			eq?     
			bt       code_2182
			lsg      global112
			ldi      64
			eq?     
			bt       code_2182
			lsg      global112
			ldi      129
			eq?     
			bt       code_2182
			lsg      global112
			ldi      146
			eq?     
			bt       code_2182
			lsg      global112
			ldi      24
			eq?     
			bt       code_2182
			lsg      global112
			ldi      39
			eq?     
			bt       code_2182
			lsg      global112
			ldi      86
			eq?     
			bt       code_2182
			lsg      global112
			ldi      40
			eq?     
			bt       code_2182
			lsg      global112
			ldi      55
			eq?     
			bt       code_2182
			lsg      global112
			ldi      102
			eq?     
			bt       code_2182
			lsg      global112
			ldi      168
			eq?     
			bt       code_2182
			lsg      global112
			ldi      24
			eq?     
			bt       code_2182
			lsg      global112
			ldi      39
			eq?     
			bt       code_2182
			lsg      global112
			ldi      54
			eq?     
			bt       code_2182
			lsg      global112
			ldi      70
			eq?     
			bt       code_2182
			lsg      global112
			ldi      86
			eq?     
			bt       code_2182
			lsg      global112
			ldi      101
			eq?     
			bt       code_2182
			lsg      global112
			ldi      117
			eq?     
			bt       code_2182
			lsg      global112
			ldi      133
			eq?     
			bt       code_2182
			lsg      global112
			ldi      149
			eq?     
			bt       code_2182
			lsg      global112
			ldi      9
			eq?     
			bt       code_2182
			lsg      global112
			ldi      25
			eq?     
			bt       code_2182
			lsg      global112
			ldi      40
			eq?     
			bt       code_2182
			lsg      global112
			ldi      55
			eq?     
			bt       code_2182
			lsg      global112
			ldi      71
			eq?     
			bt       code_2182
			lsg      global112
			ldi      87
			eq?     
			bt       code_2182
			lsg      global112
			ldi      102
			eq?     
			bt       code_2182
			lsg      global112
			ldi      118
			eq?     
			bt       code_2182
			lsg      global112
			ldi      134
			eq?     
			bt       code_2182
			lsg      global112
			ldi      150
			eq?     
			bt       code_2182
			lsg      global112
			ldi      26
			eq?     
			bt       code_2182
			lsg      global112
			ldi      168
			eq?     
			bt       code_2182
			lsg      global112
			ldi      58
			eq?     
			bt       code_2182
			lsg      global112
			ldi      90
			eq?     
			bt       code_2182
			lsg      global112
			ldi      121
			eq?     
			bt       code_2182
			lsg      global112
			ldi      89
			eq?     
			bt       code_2182
			lsg      global112
			ldi      136
			eq?     
			bt       code_2182
			lsg      global112
			ldi      41
			eq?     
			bt       code_2182
			lsg      global112
			ldi      73
			eq?     
			bt       code_2182
			lsg      global112
			ldi      104
			eq?     
			bt       code_2182
			lsg      global112
			ldi      151
			eq?     
			bt       code_2182
			lsg      global112
			ldi      43
			eq?     
			bt       code_2182
			lsg      global112
			ldi      75
			eq?     
			bt       code_2182
			lsg      global112
			ldi      106
			eq?     
			bt       code_2182
			lsg      global112
			ldi      153
			eq?     
			bt       code_2182
			lsg      global112
			ldi      166
			eq?     
			bt       code_2182
			lsg      global112
			ldi      182
			eq?     
code_2182:
			bnt      code_218e
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2340
code_218e:
			lsg      global137
			dup     
			ldi      4
			eq?     
			bnt      code_219e
			ldi      5
			aTop     seconds
			jmp      code_21c0
code_219e:
			dup     
			ldi      5
			eq?     
			bnt      code_21ac
			ldi      3
			aTop     seconds
			jmp      code_21c0
code_21ac:
			dup     
			ldi      6
			eq?     
			bnt      code_21ba
			ldi      2
			aTop     seconds
			jmp      code_21c0
code_21ba:
			pushi    #cue
			pushi    0
			self     4
code_21c0:
			toss    
			jmp      code_2340
code_21c4:
			dup     
			ldi      7
			eq?     
			bnt      code_22d8
			pushi    #number
			pushi    1
			pushi    400
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			lsg      global112
			ldi      7
			eq?     
			bt       code_220a
			lsg      global112
			ldi      27
			eq?     
			bt       code_220a
			lsg      global112
			ldi      60
			eq?     
			bt       code_220a
			lsg      global112
			ldi      24
			eq?     
			bt       code_220a
			lsg      global112
			ldi      39
			eq?     
			bt       code_220a
			lsg      global112
			ldi      86
			eq?     
code_220a:
			bnt      code_2220
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    0
			pushi    97
			pushSelf
			lag      global0
			send     12
			jmp      code_2340
code_2220:
			lsg      global112
			ldi      2
			eq?     
			bt       code_2235
			lsg      global112
			ldi      17
			eq?     
			bt       code_2235
			lsg      global112
			ldi      32
			eq?     
code_2235:
			bnt      code_224d
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    319
			pushi    103
			pushSelf
			lag      global0
			send     12
			jmp      code_2340
code_224d:
			lsg      global112
			ldi      76
			eq?     
			bt       code_2264
			lsg      global112
			ldi      171
			eq?     
			bt       code_2264
			lsg      global112
			ldi      183
			eq?     
code_2264:
			bnt      code_227b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    0
			pushi    147
			pushSelf
			lag      global0
			send     12
			jmp      code_2340
code_227b:
			lsg      global112
			ldi      64
			eq?     
			bt       code_22b2
			lsg      global112
			ldi      129
			eq?     
			bt       code_22b2
			lsg      global112
			ldi      146
			eq?     
			bt       code_22b2
			lsg      global112
			ldi      40
			eq?     
			bt       code_22b2
			lsg      global112
			ldi      55
			eq?     
			bt       code_22b2
			lsg      global112
			ldi      102
			eq?     
			bt       code_22b2
			lsg      global112
			ldi      58
			eq?     
code_22b2:
			bnt      code_22cb
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    319
			pushi    145
			pushSelf
			lag      global0
			send     12
			jmp      code_2340
code_22cb:
			pushi    0
			callb    proc0_4,  0
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2340
code_22d8:
			dup     
			ldi      8
			eq?     
			bnt      code_22ea
			ldi      1
			sal      local28
			ldi      2
			aTop     ticks
			jmp      code_2340
code_22ea:
			dup     
			ldi      9
			eq?     
			bnt      code_230f
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			lt?     
			bnt      code_2306
			ldi      3
			aTop     seconds
			jmp      code_2340
code_2306:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2340
code_230f:
			dup     
			ldi      10
			eq?     
			bnt      code_2340
			pushi    #number
			pushi    1
			pushi    400
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    0
			call     localproc_001a,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_2340:
			toss    
			ret     
		)
	)
)

(instance nearGrove of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2393
			pushi    0
			callb    proc0_3,  0
			ldi      60
			aTop     ticks
			jmp      code_242e
code_2393:
			dup     
			ldi      1
			eq?     
			bnt      code_2414
			pushi    5
			pushi    1750
			pushi    62
			pushSelf
			pushi    80
			lsg      global124
			dup     
			ldi      11
			eq?     
			bnt      code_23b3
			lofsa    {Birch}
			jmp      code_240b
code_23b3:
			dup     
			ldi      12
			eq?     
			bnt      code_23c0
			lofsa    {Rowan}
			jmp      code_240b
code_23c0:
			dup     
			ldi      13
			eq?     
			bnt      code_23cd
			lofsa    {Ash}
			jmp      code_240b
code_23cd:
			dup     
			ldi      14
			eq?     
			bnt      code_23da
			lofsa    {Alder}
			jmp      code_240b
code_23da:
			dup     
			ldi      15
			eq?     
			bnt      code_23e7
			lofsa    {Holly}
			jmp      code_240b
code_23e7:
			dup     
			ldi      16
			eq?     
			bnt      code_23f4
			lofsa    {Hazel}
			jmp      code_240b
code_23f4:
			dup     
			ldi      17
			eq?     
			bnt      code_2401
			lofsa    {Elder}
			jmp      code_240b
code_2401:
			dup     
			ldi      18
			eq?     
			bnt      code_240b
			lofsa    {Oak}
code_240b:
			toss    
			push    
			calle    proc13_4,  10
			jmp      code_242e
code_2414:
			dup     
			ldi      2
			eq?     
			bnt      code_242e
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_242e:
			toss    
			ret     
		)
	)
)

(instance myArrow of PicView
	(properties
		view 792
		loop 4
		cel 2
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      37
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			self     12
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance yourDead of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_250c
			pushi    0
			callb    proc0_3,  0
			lal      local31
			bnt      code_2505
			pushi    2
			lsg      global0
			pushi    #client
			pushi    0
			self     4
			push    
			callb    proc0_9,  4
code_2505:
			ldi      18
			aTop     ticks
			jmp      code_2bf0
code_250c:
			dup     
			ldi      1
			eq?     
			bnt      code_253a
			lal      local31
			bnt      code_2531
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
			jmp      code_2bf0
code_2531:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2bf0
code_253a:
			dup     
			ldi      2
			eq?     
			bnt      code_2644
			lsg      global11
			ldi      180
			eq?     
			bnt      code_2557
			pushi    #hide
			pushi    0
			pushi    2
			pushi    180
			pushi    1
			callk    ScriptID,  4
			send     4
code_2557:
			lsg      global11
			ldi      220
			eq?     
			bnt      code_25cc
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_25cc
			pushi    #hide
			pushi    0
			pushi    2
			pushi    225
			pushi    4
			callk    ScriptID,  4
			send     4
code_25cc:
			ldi      0
			sal      local31
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			sal      local33
			pushi    #contains
			pushi    1
			lsl      local29
			lag      global5
			send     6
			bnt      code_25f7
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			pushi    105
			pushi    0
			lal      local29
			send     16
code_25f7:
			ldi      0
			sat      temp0
code_25fb:
			lst      temp0
			ldi      3
			lt?     
			bnt      code_2629
			pushi    #contains
			pushi    1
			lat      temp0
			lsli     local17
			lag      global5
			send     6
			bnt      code_2624
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			pushi    105
			pushi    0
			lat      temp0
			lali     local17
			send     16
code_2624:
			+at      temp0
			jmp      code_25fb
code_2629:
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    8
			lag      global2
			send     8
			ldi      20
			aTop     ticks
			jmp      code_2bf0
code_2644:
			dup     
			ldi      3
			eq?     
			bnt      code_2660
			pushi    #number
			pushi    1
			pushi    906
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			lag      global168
			send     18
			jmp      code_2bf0
code_2660:
			dup     
			ldi      4
			eq?     
			bnt      code_267c
			pushi    #number
			pushi    1
			pushi    907
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			lag      global168
			send     18
			jmp      code_2bf0
code_267c:
			dup     
			ldi      5
			eq?     
			bnt      code_2bb4
			pushi    #number
			pushi    1
			pushi    25
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #drawPic
			pushi    2
			lsl      local33
			pushi    8
			lag      global2
			send     8
			lsg      global11
			ldi      220
			eq?     
			bnt      code_28d5
			lsg      global112
			ldi      132
			eq?     
			bt       code_2708
			lsg      global112
			ldi      155
			eq?     
			bt       code_2708
			lsg      global112
			ldi      34
			eq?     
			bt       code_2708
			lsg      global112
			ldi      53
			eq?     
			bt       code_2708
			lsg      global112
			ldi      120
			eq?     
			bt       code_2708
			lsg      global112
			ldi      66
			eq?     
			bt       code_2708
			lsg      global112
			ldi      20
			eq?     
			bt       code_2708
			lsg      global112
			ldi      114
			eq?     
			bt       code_2708
			lsg      global112
			ldi      22
			eq?     
			bt       code_2708
			lsg      global112
			ldi      122
			eq?     
			bt       code_2708
			lsg      global112
			ldi      88
			eq?     
			bt       code_2708
			lsg      global112
			ldi      49
			eq?     
code_2708:
			bnt      code_2713
			pushi    0
			calle    proc225_0,  0
			jmp      code_28d5
code_2713:
			lsg      global112
			ldi      18
			eq?     
			bt       code_2858
			lsg      global112
			ldi      33
			eq?     
			bt       code_2858
			lsg      global112
			ldi      35
			eq?     
			bt       code_2858
			lsg      global112
			ldi      52
			eq?     
			bt       code_2858
			lsg      global112
			ldi      54
			eq?     
			bt       code_2858
			lsg      global112
			ldi      69
			eq?     
			bt       code_2858
			lsg      global112
			ldi      119
			eq?     
			bt       code_2858
			lsg      global112
			ldi      121
			eq?     
			bt       code_2858
			lsg      global112
			ldi      135
			eq?     
			bt       code_2858
			lsg      global112
			ldi      137
			eq?     
			bt       code_2858
			lsg      global112
			ldi      51
			eq?     
			bt       code_2858
			lsg      global112
			ldi      65
			eq?     
			bt       code_2858
			lsg      global112
			ldi      82
			eq?     
			bt       code_2858
			lsg      global112
			ldi      19
			eq?     
			bt       code_2858
			lsg      global112
			ldi      21
			eq?     
			bt       code_2858
			lsg      global112
			ldi      36
			eq?     
			bt       code_2858
			lsg      global112
			ldi      98
			eq?     
			bt       code_2858
			lsg      global112
			ldi      115
			eq?     
			bt       code_2858
			lsg      global112
			ldi      130
			eq?     
			bt       code_2858
			lsg      global112
			ldi      23
			eq?     
			bt       code_2858
			lsg      global112
			ldi      37
			eq?     
			bt       code_2858
			lsg      global112
			ldi      38
			eq?     
			bt       code_2858
			lsg      global112
			ldi      106
			eq?     
			bt       code_2858
			lsg      global112
			ldi      138
			eq?     
			bt       code_2858
			lsg      global112
			ldi      50
			eq?     
			bt       code_2858
			lsg      global112
			ldi      67
			eq?     
			bt       code_2858
			lsg      global112
			ldi      68
			eq?     
			bt       code_2858
			lsg      global112
			ldi      72
			eq?     
			bt       code_2858
			lsg      global112
			ldi      83
			eq?     
			bt       code_2858
			lsg      global112
			ldi      85
			eq?     
			bt       code_2858
			lsg      global112
			ldi      86
			eq?     
			bt       code_2858
			lsg      global112
			ldi      89
			eq?     
			bt       code_2858
			lsg      global112
			ldi      99
			eq?     
			bt       code_2858
			lsg      global112
			ldi      100
			eq?     
			bt       code_2858
			lsg      global112
			ldi      101
			eq?     
			bt       code_2858
			lsg      global112
			ldi      104
			eq?     
			bt       code_2858
			lsg      global112
			ldi      136
			eq?     
			bt       code_2858
			lsg      global112
			ldi      151
			eq?     
			bt       code_2858
			lsg      global112
			ldi      153
			eq?     
			bt       code_2858
			lsg      global112
			ldi      167
			eq?     
code_2858:
			bnt      code_2863
			pushi    0
			calle    proc225_1,  0
			jmp      code_28d5
code_2863:
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_28d5
			pushi    0
			calle    proc225_2,  0
			pushi    #show
			pushi    0
			pushi    2
			pushi    225
			pushi    4
			callk    ScriptID,  4
			send     4
code_28d5:
			lsg      global11
			ldi      180
			eq?     
			bnt      code_28ec
			pushi    #show
			pushi    0
			pushi    2
			pushi    180
			pushi    1
			callk    ScriptID,  4
			send     4
code_28ec:
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_2942
			lsg      global11
			ldi      220
			eq?     
			bnt      code_290e
			pushi    #posn
			pushi    2
			pushi    103
			pushi    137
			lag      global0
			send     8
			jmp      code_291b
code_290e:
			pushi    #posn
			pushi    2
			pushi    92
			pushi    157
			lag      global0
			send     8
code_291b:
			pushi    #view
			pushi    1
			pushi    792
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    6
			pushi    194
			pushi    0
			lag      global0
			send     22
			pushi    1
			lofsa    myArrow
			push    
			calle    proc806_2,  2
			jmp      code_29d3
code_2942:
			dup     
			ldi      4
			eq?     
			bnt      code_298c
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2962
			pushi    #posn
			pushi    2
			pushi    93
			pushi    144
			lag      global0
			send     8
			jmp      code_296f
code_2962:
			pushi    #posn
			pushi    2
			pushi    96
			pushi    167
			lag      global0
			send     8
code_296f:
			pushi    #view
			pushi    1
			pushi    132
			pushi    162
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    5
			pushi    194
			pushi    0
			lag      global0
			send     22
			jmp      code_29d3
code_298c:
			dup     
			ldi      6
			eq?     
			bnt      code_29d3
			lsg      global11
			ldi      220
			eq?     
			bnt      code_29ac
			pushi    #posn
			pushi    2
			pushi    115
			pushi    151
			lag      global0
			send     8
			jmp      code_29b9
code_29ac:
			pushi    #posn
			pushi    2
			pushi    110
			pushi    170
			lag      global0
			send     8
code_29b9:
			pushi    #view
			pushi    1
			pushi    218
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    6
			pushi    194
			pushi    0
			lag      global0
			send     22
code_29d3:
			toss    
			pushi    #contains
			pushi    1
			lsl      local29
			lag      global5
			send     6
			bnt      code_2a13
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    102
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2a05
			ldi      129
			jmp      code_2a08
code_2a05:
			ldi      156
code_2a08:
			push    
			pushi    107
			pushi    0
			lal      local29
			send     34
			jmp      code_2a91
code_2a13:
			pushi    #contains
			pushi    1
			ldi      0
			lsli     local17
			lag      global5
			send     6
			bnt      code_2a56
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    102
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2a46
			ldi      129
			jmp      code_2a49
code_2a46:
			ldi      156
code_2a49:
			push    
			pushi    107
			pushi    0
			ldi      0
			lali     local17
			send     34
			jmp      code_2a91
code_2a56:
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    102
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2a7b
			ldi      129
			jmp      code_2a7e
code_2a7b:
			ldi      156
code_2a7e:
			push    
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			push    
			ldi      0
			sali     local17
			send     34
code_2a91:
			pushi    #contains
			pushi    1
			ldi      1
			lsli     local17
			lag      global5
			send     6
			bnt      code_2ae3
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2abe
			ldi      90
			jmp      code_2ac0
code_2abe:
			ldi      79
code_2ac0:
			push    
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2ad3
			ldi      160
			jmp      code_2ad6
code_2ad3:
			ldi      172
code_2ad6:
			push    
			pushi    107
			pushi    0
			ldi      1
			lali     local17
			send     34
			jmp      code_2b2d
code_2ae3:
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2b02
			ldi      90
			jmp      code_2b04
code_2b02:
			ldi      79
code_2b04:
			push    
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2b17
			ldi      160
			jmp      code_2b1a
code_2b17:
			ldi      172
code_2b1a:
			push    
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			push    
			ldi      1
			sali     local17
			send     34
code_2b2d:
			pushi    #contains
			pushi    1
			ldi      2
			lsli     local17
			lag      global5
			send     6
			bnt      code_2b71
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    171
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2b61
			ldi      148
			jmp      code_2b64
code_2b61:
			ldi      174
code_2b64:
			push    
			pushi    107
			pushi    0
			ldi      2
			lali     local17
			send     34
			jmp      code_2bad
code_2b71:
			pushi    5
			pushi    1
			pushi    754
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    171
			pushi    3
			pushi    1
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2b97
			ldi      148
			jmp      code_2b9a
code_2b97:
			ldi      174
code_2b9a:
			push    
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			push    
			ldi      2
			sali     local17
			send     34
code_2bad:
			ldi      60
			aTop     ticks
			jmp      code_2bf0
code_2bb4:
			dup     
			ldi      6
			eq?     
			bnt      code_2bf0
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pTos     client
			lofsa    bustedPuck
			eq?     
			bt       code_2bd8
			pTos     client
			lofsa    bustedFensMonk
			eq?     
code_2bd8:
			bnt      code_2be3
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2bf0
code_2be3:
			pushi    #setScript
			pushi    1
			lofsa    sweptToDeath
			push    
			lofsa    sweepRgn
			send     6
code_2bf0:
			toss    
			ret     
		)
	)
)

(instance surroundEgo of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2dab
			pushi    0
			callb    proc0_3,  0
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
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_2d8e
			lsg      global112
			ldi      3
			eq?     
			bt       code_2ce3
			lsg      global112
			ldi      4
			eq?     
			bt       code_2ce3
			lsg      global112
			ldi      5
			eq?     
			bt       code_2ce3
			lsg      global112
			ldi      6
			eq?     
			bt       code_2ce3
			lsg      global112
			ldi      24
			eq?     
			bt       code_2ce3
			lsg      global112
			ldi      25
			eq?     
			bt       code_2ce3
			lsg      global112
			ldi      26
			eq?     
code_2ce3:
			bnt      code_2cee
			ldi      0
			sal      local264
			jmp      code_2da4
code_2cee:
			lsg      global112
			ldi      147
			eq?     
			bt       code_2d2a
			lsg      global112
			ldi      148
			eq?     
			bt       code_2d2a
			lsg      global112
			ldi      149
			eq?     
			bt       code_2d2a
			lsg      global112
			ldi      168
			eq?     
			bt       code_2d2a
			lsg      global112
			ldi      169
			eq?     
			bt       code_2d2a
			lsg      global112
			ldi      170
			eq?     
			bt       code_2d2a
			lsg      global112
			ldi      182
			eq?     
code_2d2a:
			bnt      code_2d35
			ldi      4
			sal      local264
			jmp      code_2da4
code_2d35:
			lsg      global112
			ldi      43
			eq?     
			bt       code_2d5b
			lsg      global112
			ldi      91
			eq?     
			bt       code_2d5b
			lsg      global112
			ldi      107
			eq?     
			bt       code_2d5b
			lsg      global112
			ldi      123
			eq?     
			bt       code_2d5b
			lsg      global112
			ldi      139
			eq?     
code_2d5b:
			bnt      code_2d66
			ldi      8
			sal      local264
			jmp      code_2da4
code_2d66:
			lsg      global112
			ldi      48
			eq?     
			bt       code_2d83
			lsg      global112
			ldi      81
			eq?     
			bt       code_2d83
			lsg      global112
			ldi      97
			eq?     
			bt       code_2d83
			lsg      global112
			ldi      113
			eq?     
code_2d83:
			bnt      code_2da4
			ldi      12
			sal      local264
			jmp      code_2da4
code_2d8e:
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2d9f
			ldi      16
			sal      local264
			jmp      code_2da4
code_2d9f:
			ldi      20
			sal      local264
code_2da4:
			ldi      20
			aTop     ticks
			jmp      code_3034
code_2dab:
			dup     
			ldi      1
			eq?     
			bnt      code_2de5
			lsg      global11
			ldi      220
			eq?     
			bnt      code_2dd0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    185
			pushi    114
			pushSelf
			lag      global0
			send     12
			jmp      code_3034
code_2dd0:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    110
			pushi    180
			pushSelf
			lag      global0
			send     12
			jmp      code_3034
code_2de5:
			dup     
			ldi      2
			eq?     
			bnt      code_2fa1
			lal      local264
			sal      local265
			lsl      local264
			ldi      1
			add     
			sal      local266
			lsl      local264
			ldi      2
			add     
			sal      local267
			lsl      local264
			ldi      3
			add     
			sal      local268
			pushi    283
			pushi    #y
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
			ldi      1
			add     
			push    
			lag      global0
			send     10
			pushi    #contains
			pushi    1
			lsl      local29
			lag      global5
			send     6
			bnt      code_2e52
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lal      local267
			lsli     local140
			lal      local268
			lsli     local140
			lal      local29
			send     10
			jmp      code_2ec0
code_2e52:
			pushi    #contains
			pushi    1
			ldi      0
			lsli     local17
			lag      global5
			send     6
			bnt      code_2e7b
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lal      local267
			lsli     local140
			lal      local268
			lsli     local140
			ldi      0
			lali     local17
			send     10
			jmp      code_2ec0
code_2e7b:
			pushi    5
			pushi    #superClass
			pushi    753
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lal      local265
			lsli     local140
			pushi    3
			pushi    1
			lal      local266
			lsli     local140
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			lal      local267
			lsli     local140
			lal      local268
			lsli     local140
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			push    
			ldi      0
			sali     local17
			send     44
code_2ec0:
			pushi    #contains
			pushi    1
			ldi      1
			lsli     local17
			lag      global5
			send     6
			bnt      code_2ee9
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lal      local267
			lsli     local180
			lal      local268
			lsli     local180
			ldi      1
			lali     local17
			send     10
			jmp      code_2f2e
code_2ee9:
			pushi    5
			pushi    #superClass
			pushi    753
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lal      local265
			lsli     local180
			pushi    3
			pushi    1
			lal      local266
			lsli     local180
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			lal      local267
			lsli     local180
			lal      local268
			lsli     local180
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			push    
			ldi      1
			sali     local17
			send     44
code_2f2e:
			pushi    #contains
			pushi    1
			ldi      2
			lsli     local17
			lag      global5
			send     6
			bnt      code_2f58
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lal      local267
			lsli     local220
			lal      local268
			lsli     local220
			pushSelf
			ldi      2
			lali     local17
			send     12
			jmp      code_3034
code_2f58:
			pushi    5
			pushi    #superClass
			pushi    753
			pushi    6
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			lal      local265
			lsli     local220
			pushi    3
			pushi    1
			lal      local266
			lsli     local220
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lal      local267
			lsli     local220
			lal      local268
			lsli     local220
			pushSelf
			pushi    #new
			pushi    0
			lofsa    sherMan
			send     4
			push    
			ldi      2
			sali     local17
			send     46
			jmp      code_3034
code_2fa1:
			dup     
			ldi      3
			eq?     
			bnt      code_3034
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			ldi      0
			sat      temp0
code_2fba:
			lst      temp0
			ldi      3
			lt?     
			bnt      code_2fdf
			pushi    #contains
			pushi    1
			lat      temp0
			lsli     local17
			lag      global5
			send     6
			bnt      code_2fda
			pushi    2
			lat      temp0
			lsli     local17
			lsg      global0
			callb    proc0_9,  4
code_2fda:
			+at      temp0
			jmp      code_2fba
code_2fdf:
			lsg      global126
			dup     
			ldi      5
			eq?     
			bnt      code_2ff8
			pushi    #setScript
			pushi    1
			lofsa    bustedAbbeyMonk
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_3033
code_2ff8:
			dup     
			ldi      6
			eq?     
			bnt      code_300f
			pushi    #setScript
			pushi    1
			lofsa    bustedFensMonk
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_3033
code_300f:
			dup     
			ldi      4
			eq?     
			bnt      code_3026
			pushi    #setScript
			pushi    1
			lofsa    bustedPuck
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_3033
code_3026:
			pushi    #setScript
			pushi    1
			lofsa    yourDead
			push    
			lofsa    sweepRgn
			send     6
code_3033:
			toss    
code_3034:
			toss    
			ret     
		)
	)
)

(instance surrenderToSweep of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_30b3
			pushi    0
			callb    proc0_3,  0
			lsg      global126
			ldi      0
			eq?     
			bnt      code_309f
			pushi    7
			pushi    2
			lea      @local43
			push    
			lsl      local4
			pushi    0
			pushi    19
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_30e3
code_309f:
			pushi    5
			pushi    1
			lea      @local48
			push    
			lsl      local4
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_30e3
code_30b3:
			dup     
			ldi      1
			eq?     
			bnt      code_30e3
			lsg      global126
			ldi      5
			eq?     
			bnt      code_30d2
			pushi    #setScript
			pushi    1
			lofsa    bustedAbbeyMonk
			push    
			lofsa    sweepRgn
			send     6
			jmp      code_30df
code_30d2:
			pushi    #setScript
			pushi    1
			lofsa    yourDead
			push    
			lofsa    sweepRgn
			send     6
code_30df:
			pushi    0
			callb    proc0_4,  0
code_30e3:
			toss    
			ret     
		)
	)
)

(instance sweptToDeath of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3137
			pushi    0
			callb    proc0_3,  0
			ldi      18
			aTop     ticks
			jmp      code_3172
code_3137:
			dup     
			ldi      1
			eq?     
			bnt      code_315b
			pushi    9
			pushi    3
			lea      @local110
			push    
			pushi    19
			pushi    0
			lea      @local131
			push    
			pushi    1
			pushi    20
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_3172
code_315b:
			dup     
			ldi      2
			eq?     
			bnt      code_3172
			pushi    0
			callb    proc0_4,  0
			pushi    0
			calle    proc806_0,  0
			pushi    #dispose
			pushi    0
			self     4
code_3172:
			toss    
			ret     
		)
	)
)

(instance bustedFensMonk of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3210
			pushi    0
			callb    proc0_3,  0
			pushi    #contains
			pushi    1
			lsl      local29
			lag      global5
			send     6
			bnt      code_31da
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lal      local29
			send     12
code_31da:
			ldi      0
			sat      temp0
code_31de:
			lst      temp0
			ldi      3
			lt?     
			bnt      code_3209
			pushi    #contains
			pushi    1
			lat      temp0
			lsli     local17
			lag      global5
			send     6
			bnt      code_3204
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lat      temp0
			lali     local17
			send     12
code_3204:
			+at      temp0
			jmp      code_31de
code_3209:
			ldi      30
			aTop     ticks
			jmp      code_3280
code_3210:
			dup     
			ldi      1
			eq?     
			bnt      code_3234
			pushi    9
			pushi    3
			lea      @local103
			push    
			pushi    8
			pushi    0
			pushi    19
			pushi    1
			lea      @local131
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_3280
code_3234:
			dup     
			ldi      2
			eq?     
			bnt      code_3249
			pushi    #setScript
			pushi    2
			lofsa    yourDead
			push    
			pushSelf
			self     8
			jmp      code_3280
code_3249:
			dup     
			ldi      3
			eq?     
			bnt      code_326d
			pushi    9
			pushi    3
			lea      @local125
			push    
			pushi    19
			pushi    0
			lea      @local131
			push    
			pushi    1
			pushi    20
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_3280
code_326d:
			dup     
			ldi      4
			eq?     
			bnt      code_3280
			pushi    0
			calle    proc806_0,  0
			pushi    #dispose
			pushi    0
			self     4
code_3280:
			toss    
			ret     
		)
	)
)

(instance bustedAbbeyMonk of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_331e
			pushi    0
			callb    proc0_3,  0
			pushi    #contains
			pushi    1
			lsl      local29
			lag      global5
			send     6
			bnt      code_32e8
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lal      local29
			send     12
code_32e8:
			ldi      0
			sat      temp0
code_32ec:
			lst      temp0
			ldi      3
			lt?     
			bnt      code_3317
			pushi    #contains
			pushi    1
			lat      temp0
			lsli     local17
			lag      global5
			send     6
			bnt      code_3312
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lat      temp0
			lali     local17
			send     12
code_3312:
			+at      temp0
			jmp      code_32ec
code_3317:
			ldi      30
			aTop     ticks
			jmp      code_336b
code_331e:
			dup     
			ldi      1
			eq?     
			bnt      code_334a
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			dup     
			pushi    1
			lag      global113
			send     12
			pushi    7
			pushi    2
			lea      @local76
			push    
			pushi    9
			pushi    0
			pushi    19
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_336b
code_334a:
			dup     
			ldi      2
			eq?     
			bnt      code_336b
			pushi    0
			callb    proc0_4,  0
			ldi      33
			sag      global145
			pushi    1
			pushi    194
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_336b:
			toss    
			ret     
		)
	)
)

(instance bustedPuck of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_340a
			pushi    0
			callb    proc0_3,  0
			pushi    #contains
			pushi    1
			lsl      local29
			lag      global5
			send     6
			bnt      code_33d4
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lal      local29
			send     12
code_33d4:
			ldi      0
			sat      temp0
code_33d8:
			lst      temp0
			ldi      3
			lt?     
			bnt      code_3403
			pushi    #contains
			pushi    1
			lat      temp0
			lsli     local17
			lag      global5
			send     6
			bnt      code_33fe
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lat      temp0
			lali     local17
			send     12
code_33fe:
			+at      temp0
			jmp      code_33d8
code_3403:
			ldi      30
			aTop     ticks
			jmp      code_347e
code_340a:
			dup     
			ldi      1
			eq?     
			bnt      code_3432
			pushi    11
			pushi    4
			lea      @local86
			push    
			pushi    6
			pushi    0
			pushi    19
			pushi    1
			lea      @local131
			push    
			pushi    2
			pushi    20
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_347e
code_3432:
			dup     
			ldi      2
			eq?     
			bnt      code_3447
			pushi    #setScript
			pushi    2
			lofsa    yourDead
			push    
			pushSelf
			self     8
			jmp      code_347e
code_3447:
			dup     
			ldi      3
			eq?     
			bnt      code_346b
			pushi    9
			pushi    3
			lea      @local95
			push    
			pushi    19
			pushi    0
			lea      @local131
			push    
			pushi    1
			pushi    20
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_347e
code_346b:
			dup     
			ldi      4
			eq?     
			bnt      code_347e
			pushi    0
			calle    proc806_0,  0
			pushi    #dispose
			pushi    0
			self     4
code_347e:
			toss    
			ret     
		)
	)
)

(instance blowSweep of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3539
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bt       code_3508
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_3508
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_3508
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_3508:
			bnt      code_3517
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_3520
code_3517:
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
code_3520:
			pushi    #view
			pushi    1
			pushi    10
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
			jmp      code_3590
code_3539:
			dup     
			ldi      1
			eq?     
			bnt      code_3558
			pushi    #number
			pushi    1
			pushi    904
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global114
			send     16
			ldi      4
			aTop     seconds
			jmp      code_3590
code_3558:
			dup     
			ldi      2
			eq?     
			bnt      code_356e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_3590
code_356e:
			dup     
			ldi      3
			eq?     
			bnt      code_3590
			pushi    3
			lsg      global111
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    #setScript
			pushi    1
			lofsa    surroundEgo
			push    
			lofsa    sweepRgn
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_3590:
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
			bnt      code_3655
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_3641
			pushi    3
			pushi    1750
			pushi    66
			pushi    1
			calle    proc13_4,  6
			jmp      code_364d
code_3641:
			pushi    3
			pushi    1750
			pushi    65
			pushi    1
			calle    proc13_4,  6
code_364d:
			pushi    0
			call     localproc_0677,  0
			jmp      code_3d7b
code_3655:
			pushi    1
			pushi    35
			callb    proc0_5,  2
			bnt      code_3af1
			lsg      global112
			ldi      132
			eq?     
			bt       code_366d
			lsg      global112
			ldi      155
			eq?     
code_366d:
			bnt      code_3675
			lsg      global124
			ldi      0
			eq?     
code_3675:
			bt       code_3774
			lsg      global112
			ldi      34
			eq?     
			bnt      code_3685
			lsg      global124
			ldi      1
			eq?     
code_3685:
			bt       code_3774
			lsg      global112
			ldi      53
			eq?     
			bt       code_3695
			lsg      global112
			ldi      120
			eq?     
code_3695:
			bnt      code_369d
			lsg      global124
			ldi      2
			eq?     
code_369d:
			bt       code_3774
			lsg      global112
			ldi      66
			eq?     
			bnt      code_36ad
			lsg      global124
			ldi      3
			eq?     
code_36ad:
			bt       code_3774
			lsg      global112
			ldi      20
			eq?     
			bnt      code_36bd
			lsg      global124
			ldi      4
			eq?     
code_36bd:
			bt       code_3774
			lsg      global112
			ldi      114
			eq?     
			bnt      code_36cd
			lsg      global124
			ldi      5
			eq?     
code_36cd:
			bt       code_3774
			lsg      global112
			ldi      22
			eq?     
			bt       code_36dd
			lsg      global112
			ldi      122
			eq?     
code_36dd:
			bnt      code_36e5
			lsg      global124
			ldi      6
			eq?     
code_36e5:
			bt       code_3774
			lsg      global112
			ldi      88
			eq?     
			bt       code_36f5
			lsg      global112
			ldi      49
			eq?     
code_36f5:
			bnt      code_36fd
			lsg      global124
			ldi      7
			eq?     
code_36fd:
			bt       code_3774
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_3763
			lsg      global124
			ldi      9
			eq?     
code_3763:
			bt       code_3774
			lsg      global11
			ldi      180
			eq?     
			bnt      code_379b
			lsg      global124
			ldi      7
			eq?     
code_3774:
			bnt      code_379b
			pushi    #fade
			pushi    4
			pushi    127
			pushi    30
			pushi    8
			pushi    0
			lag      global113
			send     12
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_3d7b
code_379b:
			lsg      global137
			ldi      3
			gt?     
			bnt      code_381e
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_381e
			lsg      global124
			ldi      20
			eq?     
			bnt      code_381e
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    225
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_3d7b
code_381e:
			lsg      global137
			ldi      3
			gt?     
			bnt      code_3954
			lsg      global112
			ldi      132
			eq?     
			bt       code_3835
			lsg      global112
			ldi      155
			eq?     
code_3835:
			bnt      code_383d
			lsg      global124
			ldi      11
			eq?     
code_383d:
			bt       code_393c
			lsg      global112
			ldi      34
			eq?     
			bnt      code_384d
			lsg      global124
			ldi      12
			eq?     
code_384d:
			bt       code_393c
			lsg      global112
			ldi      53
			eq?     
			bt       code_385d
			lsg      global112
			ldi      120
			eq?     
code_385d:
			bnt      code_3865
			lsg      global124
			ldi      13
			eq?     
code_3865:
			bt       code_393c
			lsg      global112
			ldi      66
			eq?     
			bnt      code_3875
			lsg      global124
			ldi      14
			eq?     
code_3875:
			bt       code_393c
			lsg      global112
			ldi      20
			eq?     
			bnt      code_3885
			lsg      global124
			ldi      15
			eq?     
code_3885:
			bt       code_393c
			lsg      global112
			ldi      114
			eq?     
			bnt      code_3895
			lsg      global124
			ldi      16
			eq?     
code_3895:
			bt       code_393c
			lsg      global112
			ldi      22
			eq?     
			bt       code_38a5
			lsg      global112
			ldi      122
			eq?     
code_38a5:
			bnt      code_38ad
			lsg      global124
			ldi      17
			eq?     
code_38ad:
			bt       code_393c
			lsg      global112
			ldi      88
			eq?     
			bt       code_38bd
			lsg      global112
			ldi      49
			eq?     
code_38bd:
			bnt      code_38c5
			lsg      global124
			ldi      18
			eq?     
code_38c5:
			bt       code_393c
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_392b
			lsg      global124
			ldi      20
			eq?     
code_392b:
			bt       code_393c
			lsg      global11
			ldi      180
			eq?     
			bnt      code_3954
			lsg      global124
			ldi      18
			eq?     
code_393c:
			bnt      code_3954
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_3d7b
code_3954:
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_39b7
			lsg      global124
			ldi      20
			eq?     
code_39b7:
			bt       code_3ad0
			lsg      global112
			ldi      132
			eq?     
			bt       code_39c9
			lsg      global112
			ldi      155
			eq?     
code_39c9:
			bnt      code_39d1
			lsg      global124
			ldi      11
			eq?     
code_39d1:
			bt       code_3ad0
			lsg      global112
			ldi      34
			eq?     
			bnt      code_39e1
			lsg      global124
			ldi      12
			eq?     
code_39e1:
			bt       code_3ad0
			lsg      global112
			ldi      53
			eq?     
			bt       code_39f1
			lsg      global112
			ldi      120
			eq?     
code_39f1:
			bnt      code_39f9
			lsg      global124
			ldi      13
			eq?     
code_39f9:
			bt       code_3ad0
			lsg      global112
			ldi      66
			eq?     
			bnt      code_3a09
			lsg      global124
			ldi      14
			eq?     
code_3a09:
			bt       code_3ad0
			lsg      global112
			ldi      20
			eq?     
			bnt      code_3a19
			lsg      global124
			ldi      15
			eq?     
code_3a19:
			bt       code_3ad0
			lsg      global112
			ldi      114
			eq?     
			bnt      code_3a29
			lsg      global124
			ldi      16
			eq?     
code_3a29:
			bt       code_3ad0
			lsg      global112
			ldi      22
			eq?     
			bt       code_3a39
			lsg      global112
			ldi      122
			eq?     
code_3a39:
			bnt      code_3a41
			lsg      global124
			ldi      17
			eq?     
code_3a41:
			bt       code_3ad0
			lsg      global112
			ldi      88
			eq?     
			bt       code_3a51
			lsg      global112
			ldi      49
			eq?     
code_3a51:
			bnt      code_3a59
			lsg      global124
			ldi      18
			eq?     
code_3a59:
			bt       code_3ad0
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_3abf
			lsg      global124
			ldi      20
			eq?     
code_3abf:
			bt       code_3ad0
			lsg      global11
			ldi      180
			eq?     
			bnt      code_3ae7
			lsg      global124
			ldi      18
			eq?     
code_3ad0:
			bnt      code_3ae7
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_3d7b
code_3ae7:
			-ag      global137
			pushi    0
			call     localproc_0677,  0
			jmp      code_3d7b
code_3af1:
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_3d7b
			lsg      global112
			ldi      132
			eq?     
			bt       code_3b09
			lsg      global112
			ldi      155
			eq?     
code_3b09:
			bnt      code_3b11
			lsg      global124
			ldi      0
			eq?     
code_3b11:
			bt       code_3c10
			lsg      global112
			ldi      34
			eq?     
			bnt      code_3b21
			lsg      global124
			ldi      1
			eq?     
code_3b21:
			bt       code_3c10
			lsg      global112
			ldi      53
			eq?     
			bt       code_3b31
			lsg      global112
			ldi      120
			eq?     
code_3b31:
			bnt      code_3b39
			lsg      global124
			ldi      2
			eq?     
code_3b39:
			bt       code_3c10
			lsg      global112
			ldi      66
			eq?     
			bnt      code_3b49
			lsg      global124
			ldi      3
			eq?     
code_3b49:
			bt       code_3c10
			lsg      global112
			ldi      20
			eq?     
			bnt      code_3b59
			lsg      global124
			ldi      4
			eq?     
code_3b59:
			bt       code_3c10
			lsg      global112
			ldi      114
			eq?     
			bnt      code_3b69
			lsg      global124
			ldi      5
			eq?     
code_3b69:
			bt       code_3c10
			lsg      global112
			ldi      22
			eq?     
			bt       code_3b79
			lsg      global112
			ldi      122
			eq?     
code_3b79:
			bnt      code_3b81
			lsg      global124
			ldi      6
			eq?     
code_3b81:
			bt       code_3c10
			lsg      global112
			ldi      88
			eq?     
			bt       code_3b91
			lsg      global112
			ldi      49
			eq?     
code_3b91:
			bnt      code_3b99
			lsg      global124
			ldi      7
			eq?     
code_3b99:
			bt       code_3c10
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_3bff
			lsg      global124
			ldi      9
			eq?     
code_3bff:
			bt       code_3c10
			lsg      global11
			ldi      180
			eq?     
			bnt      code_3c37
			lsg      global124
			ldi      7
			eq?     
code_3c10:
			bnt      code_3c37
			pushi    #fade
			pushi    4
			pushi    127
			pushi    30
			pushi    8
			pushi    0
			lag      global113
			send     12
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_3d7b
code_3c37:
			lsg      global112
			ldi      132
			eq?     
			bt       code_3c46
			lsg      global112
			ldi      155
			eq?     
code_3c46:
			bnt      code_3c4e
			lsg      global124
			ldi      11
			eq?     
code_3c4e:
			bt       code_3d4d
			lsg      global112
			ldi      34
			eq?     
			bnt      code_3c5e
			lsg      global124
			ldi      12
			eq?     
code_3c5e:
			bt       code_3d4d
			lsg      global112
			ldi      53
			eq?     
			bt       code_3c6e
			lsg      global112
			ldi      120
			eq?     
code_3c6e:
			bnt      code_3c76
			lsg      global124
			ldi      13
			eq?     
code_3c76:
			bt       code_3d4d
			lsg      global112
			ldi      66
			eq?     
			bnt      code_3c86
			lsg      global124
			ldi      14
			eq?     
code_3c86:
			bt       code_3d4d
			lsg      global112
			ldi      20
			eq?     
			bnt      code_3c96
			lsg      global124
			ldi      15
			eq?     
code_3c96:
			bt       code_3d4d
			lsg      global112
			ldi      114
			eq?     
			bnt      code_3ca6
			lsg      global124
			ldi      16
			eq?     
code_3ca6:
			bt       code_3d4d
			lsg      global112
			ldi      22
			eq?     
			bt       code_3cb6
			lsg      global112
			ldi      122
			eq?     
code_3cb6:
			bnt      code_3cbe
			lsg      global124
			ldi      17
			eq?     
code_3cbe:
			bt       code_3d4d
			lsg      global112
			ldi      88
			eq?     
			bt       code_3cce
			lsg      global112
			ldi      49
			eq?     
code_3cce:
			bnt      code_3cd6
			lsg      global124
			ldi      18
			eq?     
code_3cd6:
			bt       code_3d4d
			pushi    36
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
			pushi    183
			calle    proc999_5,  72
			bnt      code_3d3c
			lsg      global124
			ldi      20
			eq?     
code_3d3c:
			bt       code_3d4d
			lsg      global11
			ldi      180
			eq?     
			bnt      code_3d74
			lsg      global124
			ldi      18
			eq?     
code_3d4d:
			bnt      code_3d74
			pushi    #fade
			pushi    4
			pushi    127
			pushi    30
			pushi    8
			pushi    0
			lag      global113
			send     12
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    223
			pushi    2
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_3d7b
code_3d74:
			-ag      global137
			pushi    0
			call     localproc_0677,  0
code_3d7b:
			ret     
		)
	)
)

(instance handJive of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_3f46
			lsg      global11
			ldi      220
			eq?     
			bnt      code_3f07
			lsg      global112
			ldi      18
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      33
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      35
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      52
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      54
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      69
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      119
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      121
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      135
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      137
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      51
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      65
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      82
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      19
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      21
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      36
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      98
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      115
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      130
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      23
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      37
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      38
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      106
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      138
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      50
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      67
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      68
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      72
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      83
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      85
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      86
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      89
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      99
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      100
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      101
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      104
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      136
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      151
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      153
			eq?     
			bt       code_3ef3
			lsg      global112
			ldi      167
			eq?     
code_3ef3:
			bnt      code_3f07
			pushi    #setScript
			pushi    1
			lofsa    nearGrove
			push    
			lag      global0
			send     6
			ldi      1
			jmp      code_3f85
code_3f07:
			lsl      local28
			ldi      1
			eq?     
			bnt      code_3f28
			lsg      global126
			ldi      0
			eq?     
			bnt      code_3f28
			pushi    3
			pushi    1750
			pushi    60
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_3f85
code_3f28:
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    sweepRgn
			send     6
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    0
			lag      global113
			send     12
			ldi      0
			jmp      code_3f85
code_3f46:
			dup     
			ldi      4
			eq?     
			bnt      code_3f85
			lsp      param2
			dup     
			ldi      12
			eq?     
			bnt      code_3f67
			pushi    3
			pushi    1750
			pushi    61
			pushi    0
			calle    proc13_4,  6
			ldi      1
			jmp      code_3f84
code_3f67:
			dup     
			ldi      1
			eq?     
			bnt      code_3f84
			lsg      global137
			ldi      2
			gt?     
			bnt      code_3f84
			pushi    #setScript
			pushi    1
			lofsa    blowSweep
			push    
			lag      global0
			send     6
			ldi      1
code_3f84:
			toss    
code_3f85:
			toss    
			ret     
		)
	)
)
