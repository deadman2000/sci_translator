;;; Sierra Script 1.0 - (do not remove this comment)
(script# 150)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm150 0
)

(local
	[local0 3]
	[local3 3] = [27 54 78]
	[local6 3] = [82 79 72]
	[local9 3] = [0 0 2]
	local12
	local13
	local14
	local15
	local16
	local17
	local18
	local19
	local20
	local21
	local22
	local23
	local24
	local25
	local26
	local27
	local28
	local29
	local30
	local31
	local32
	local33
	local34
	local35
	local36
	local37
	local38
	local39
	local40
	local41
	local42
	local43
	local44
	local45
	local46
	local47
	local48
	local49
	local50
	local51
	local52
	local53
	local54
	local55
	local56
	[local57 4] = [1150 13 1]
	[local61 4] = [1150 24 1]
	[local65 4] = [1150 25 1]
	[local69 4] = [1150 26 1]
	[local73 4] = [1150 27 1]
	[local77 4] = [1150 30 1]
	[local81 6] = [1150 31 2 1 2]
	[local87 4] = [1150 34 1]
	[local91 5] = [1150 16 1 2]
	[local96 5] = [1150 18 1 2]
	[local101 4] = [1150 20 1]
	[local105 4] = [1150 21 1]
	[local109 5] = [1150 22 1 2]
	[local114 5] = [1150 39 2 1]
	[local119 5] = [1150 41 2 1]
	[local124 5] = [1150 28 1 1]
	[local129 5] = [1150 49 1 1]
)
(procedure (localproc_001e &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0024:
		lst      temp0
		ldi      3
		lt?     
		bnt      code_0054
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local3
		pushi    3
		pushi    1
		lsli     local6
		pushi    7
		pushi    1
		lsli     local9
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local0
		send     22
		+at      temp0
		jmp      code_0024
code_0054:
		ret     
	)
)

(procedure (localproc_0055)
	(asm
		lsg      global130
		dup     
		ldi      1
		eq?     
		bnt      code_0190
		ldi      1
		sal      local44
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_013a
		pushi    1
		pushi    71
		callb    proc0_6,  2
		ldi      1
		sal      local49
		pushi    2
		pushi    151
		pushi    0
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      168
		sal      local16
		ldi      3
		sal      local17
		class    Fwd
		sal      local18
		ldi      147
		sal      local14
		ldi      103
		sal      local15
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local19
		ldi      71
		sal      local20
		ldi      136
		sal      local21
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local25
		ldi      265
		sal      local26
		ldi      96
		sal      local27
		pushi    1
		pushi    21
		callk    ScriptID,  2
		sal      local31
		ldi      170
		sal      local34
		pushi    #number
		pushi    1
		pushi    154
		pushi    6
		pushi    1
		pushi    65535
		lag      global168
		send     12
		ldi      1
		sal      local35
		class    Fwd
		sal      local36
		ldi      226
		sal      local32
		ldi      103
		sal      local33
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    293
		pushi    1
		pushi    2
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     12
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    alansActions
		push    
		pushi    293
		pushi    1
		pushi    2
		pushi    1
		pushi    21
		callk    ScriptID,  2
		send     12
		jmp      code_0a9c
code_013a:
		pushi    1
		pushi    163
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    44
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    163
		callb    proc0_6,  2
		ldi      1
		sal      local43
		lofsa    tuckAlone
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      207
		sal      local14
		ldi      88
		sal      local15
		ldi      168
		sal      local16
		ldi      0
		sal      local17
		class    End
		sal      local18
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0190:
		dup     
		ldi      2
		eq?     
		bnt      code_0247
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		ldi      150
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    1
		pushi    21
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    1
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      210
		sal      local14
		ldi      129
		sal      local15
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local19
		ldi      232
		sal      local20
		ldi      111
		sal      local21
		pushi    1
		pushi    21
		callk    ScriptID,  2
		sal      local25
		ldi      3
		sal      local29
		ldi      148
		sal      local26
		ldi      167
		sal      local27
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local31
		ldi      65521
		sal      local32
		ldi      131
		sal      local33
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    alansActions
		push    
		pushi    1
		pushi    21
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0247:
		dup     
		ldi      3
		eq?     
		bnt      code_02a0
		pushi    1
		pushi    49
		callb    proc0_5,  2
		bnt      code_0a9c
		pushi    1
		pushi    54
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    54
		callb    proc0_6,  2
		pushi    1
		pushi    151
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    2
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      2
		sal      local17
		ldi      218
		sal      local14
		ldi      77
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_02a0:
		dup     
		ldi      4
		eq?     
		bnt      code_02ea
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    3
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local13
		ldi      78
		sal      local14
		ldi      185
		sal      local15
		ldi      3
		sal      local17
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_02ea:
		dup     
		ldi      5
		eq?     
		bnt      code_049e
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0334
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    4
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    21
		callk    ScriptID,  2
		sal      local13
		ldi      230
		sal      local14
		ldi      111
		sal      local15
		ldi      2
		sal      local17
		pushi    #actions
		pushi    1
		lofsa    alansActions
		push    
		pushi    1
		pushi    21
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0334:
		pushi    1
		pushi    169
		callb    proc0_5,  2
		bnt      code_0387
		pushi    1
		pushi    55
		callb    proc0_5,  2
		not     
		bnt      code_0387
		pushi    1
		pushi    55
		callb    proc0_6,  2
		pushi    1
		pushi    25
		callb    proc0_6,  2
		ldi      0
		sag      global160
		pushi    2
		pushi    151
		pushi    5
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      88
		sal      local14
		ldi      177
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0387:
		pushi    1
		pushi    39
		callb    proc0_5,  2
		bnt      code_03df
		pushi    1
		pushi    147
		callb    proc0_5,  2
		not     
		bnt      code_03df
		pushi    1
		pushi    25
		callb    proc0_5,  2
		not     
		bnt      code_03df
		pushi    1
		pushi    147
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    6
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      2
		sal      local17
		ldi      266
		sal      local14
		ldi      97
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_03df:
		lsg      global126
		ldi      5
		eq?     
		bnt      code_043e
		pushi    1
		pushi    56
		callb    proc0_5,  2
		not     
		bnt      code_043e
		pushi    1
		pushi    161
		callb    proc0_5,  2
		not     
		bnt      code_043e
		lsg      global142
		ldi      2
		eq?     
		bnt      code_043e
		pushi    1
		pushi    161
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    7
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local13
		ldi      141
		sal      local14
		ldi      98
		sal      local15
		class    Walk
		sal      local18
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_043e:
		lsg      global126
		ldi      5
		eq?     
		bnt      code_0a9c
		pushi    1
		pushi    56
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		lsg      global142
		ldi      3
		eq?     
		bnt      code_0a9c
		pushi    1
		pushi    56
		callb    proc0_6,  2
		ldi      1
		sal      local43
		pushi    2
		pushi    151
		pushi    8
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      204
		sal      local14
		ldi      88
		sal      local15
		ldi      168
		sal      local16
		ldi      0
		sal      local17
		class    End
		sal      local18
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_049e:
		dup     
		ldi      6
		eq?     
		bnt      code_06ea
		pushi    1
		pushi    19
		callb    proc0_7,  2
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_054b
		pushi    1
		pushi    25
		callb    proc0_5,  2
		bnt      code_054b
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    9
		callk    ScriptID,  4
		sal      local12
		ldi      1
		sal      local53
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      167
		sal      local16
		ldi      1
		sal      local17
		class    End
		sal      local18
		ldi      201
		sal      local14
		ldi      71
		sal      local15
		pushi    1
		pushi    21
		callk    ScriptID,  2
		sal      local19
		ldi      147
		sal      local22
		ldi      4
		sal      local23
		class    Fwd
		sal      local24
		ldi      242
		sal      local20
		ldi      108
		sal      local21
		pushi    #number
		pushi    1
		pushi    154
		pushi    6
		pushi    1
		pushi    65535
		lag      global168
		send     12
		pushi    #detailLevel
		pushi    1
		pushi    2
		pushi    267
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     12
		pushi    #detailLevel
		pushi    1
		pushi    1
		pushi    267
		pushi    1
		lofsa    alansActions
		push    
		pushi    1
		pushi    21
		callk    ScriptID,  2
		send     12
		jmp      code_0a9c
code_054b:
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_058a
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    10
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    22
		callk    ScriptID,  2
		sal      local13
		ldi      71
		sal      local14
		ldi      136
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    muchsActions
		push    
		pushi    1
		pushi    22
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_058a:
		pushi    1
		pushi    169
		callb    proc0_5,  2
		bnt      code_05dd
		pushi    1
		pushi    25
		callb    proc0_5,  2
		not     
		bnt      code_05dd
		pushi    1
		pushi    55
		callb    proc0_5,  2
		not     
		bnt      code_05dd
		pushi    1
		pushi    55
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    5
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      88
		sal      local14
		ldi      177
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_05dd:
		pushi    1
		pushi    39
		callb    proc0_5,  2
		bnt      code_062b
		pushi    1
		pushi    147
		callb    proc0_5,  2
		not     
		bnt      code_062b
		pushi    1
		pushi    147
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    6
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      2
		sal      local17
		ldi      266
		sal      local14
		ldi      97
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_062b:
		lsg      global126
		ldi      5
		eq?     
		bnt      code_068a
		lsg      global142
		ldi      2
		eq?     
		bnt      code_068a
		pushi    1
		pushi    56
		callb    proc0_5,  2
		not     
		bnt      code_068a
		pushi    1
		pushi    161
		callb    proc0_5,  2
		not     
		bnt      code_068a
		pushi    1
		pushi    161
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    7
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local13
		class    Walk
		sal      local18
		ldi      141
		sal      local14
		ldi      98
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_068a:
		lsg      global126
		ldi      5
		eq?     
		bnt      code_0a9c
		lsg      global142
		ldi      3
		eq?     
		bnt      code_0a9c
		pushi    1
		pushi    56
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    56
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    8
		callk    ScriptID,  4
		sal      local12
		ldi      1
		sal      local43
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      204
		sal      local14
		ldi      88
		sal      local15
		ldi      168
		sal      local16
		ldi      0
		sal      local17
		class    End
		sal      local18
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_06ea:
		dup     
		ldi      7
		eq?     
		bnt      code_0751
		pushi    1
		pushi    34
		callb    proc0_5,  2
		bnt      code_0a9c
		pushi    #has
		pushi    1
		pushi    4
		lag      global0
		send     6
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    11
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      1
		sal      local17
		ldi      71
		sal      local14
		ldi      136
		sal      local15
		pushi    1
		pushi    19
		callb    proc0_6,  2
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0751:
		dup     
		ldi      8
		eq?     
		bnt      code_0852
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_080e
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    12
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      104
		sal      local14
		ldi      147
		sal      local15
		ldi      2
		sal      local17
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local19
		ldi      1
		sal      local53
		ldi      55
		sal      local20
		ldi      186
		sal      local21
		ldi      0
		sal      local23
		pushi    1
		pushi    21
		callk    ScriptID,  2
		sal      local31
		ldi      100
		sal      local32
		ldi      189
		sal      local33
		ldi      1
		sal      local35
		pushi    1
		pushi    22
		callk    ScriptID,  2
		sal      local25
		ldi      76
		sal      local26
		ldi      172
		sal      local27
		ldi      2
		sal      local29
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    alansActions
		push    
		pushi    1
		pushi    21
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    muchsActions
		push    
		pushi    1
		pushi    22
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_080e:
		pushi    1
		pushi    135
		callb    proc0_5,  2
		bnt      code_0a9c
		pushi    1
		pushi    191
		callb    proc0_5,  2
		bnt      code_0a9c
		pushi    1
		pushi    57
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    57
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    13
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      192
		sal      local14
		ldi      151
		sal      local15
		jmp      code_0a9c
code_0852:
		dup     
		ldi      9
		eq?     
		bnt      code_0985
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0895
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    14
		callk    ScriptID,  4
		sal      local12
		ldi      1
		sal      local43
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local13
		ldi      0
		sal      local17
		class    Walk
		sal      local18
		ldi      192
		sal      local14
		ldi      151
		sal      local15
		jmp      code_0a9c
code_0895:
		pushi    1
		pushi    102
		callb    proc0_5,  2
		bnt      code_0a9c
		ldi      0
		sag      global126
		pushi    2
		pushi    153
		pushi    0
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      205
		sal      local14
		ldi      82
		sal      local15
		ldi      2
		sal      local17
		ldi      168
		sal      local16
		class    End
		sal      local18
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local19
		ldi      1
		sal      local53
		ldi      0
		sal      local23
		ldi      77
		sal      local20
		ldi      92
		sal      local21
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local25
		ldi      160
		sal      local26
		ldi      84
		sal      local27
		pushi    1
		pushi    21
		callk    ScriptID,  2
		sal      local31
		ldi      170
		sal      local34
		pushi    #number
		pushi    1
		pushi    393
		pushi    6
		pushi    1
		pushi    65535
		lag      global168
		send     12
		ldi      0
		sal      local34
		ldi      1
		sal      local54
		ldi      38
		sal      local32
		ldi      170
		sal      local33
		pushi    1
		pushi    22
		callk    ScriptID,  2
		sal      local37
		ldi      148
		sal      local38
		ldi      167
		sal      local39
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    alansActions
		push    
		pushi    1
		pushi    21
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		pushi    #actions
		pushi    1
		lofsa    muchsActions
		push    
		pushi    1
		pushi    22
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0985:
		dup     
		ldi      10
		eq?     
		bnt      code_09cb
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    15
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      191
		sal      local14
		ldi      85
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    johnsActions
		push    
		pushi    1
		pushi    19
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_09cb:
		dup     
		ldi      11
		eq?     
		bnt      code_0a19
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    16
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    23
		callk    ScriptID,  2
		sal      local13
		ldi      310
		sal      local14
		ldi      90
		sal      local15
		ldi      1
		sal      local17
		class    Walk
		sal      local18
		pushi    #actions
		pushi    1
		lofsa    tucksActions
		push    
		pushi    1
		pushi    23
		callk    ScriptID,  2
		send     6
		jmp      code_0a9c
code_0a19:
		dup     
		ldi      12
		eq?     
		bnt      code_0a58
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    17
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    19
		callk    ScriptID,  2
		sal      local13
		ldi      1
		sal      local43
		ldi      0
		sal      local17
		ldi      192
		sal      local14
		ldi      151
		sal      local15
		jmp      code_0a9c
code_0a58:
		dup     
		ldi      13
		eq?     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_5,  2
		not     
		bnt      code_0a9c
		pushi    1
		pushi    71
		callb    proc0_6,  2
		pushi    2
		pushi    151
		pushi    18
		callk    ScriptID,  4
		sal      local12
		pushi    1
		pushi    20
		callk    ScriptID,  2
		sal      local13
		ldi      150
		sal      local14
		ldi      176
		sal      local15
		pushi    #actions
		pushi    1
		lofsa    willsActions
		push    
		pushi    1
		pushi    20
		callk    ScriptID,  2
		send     6
code_0a9c:
		toss    
		ret     
	)
)

(instance rm150 of Rm
	(properties
		picture 150
		style $0064
		north 220
		east 140
		south 220
		west 220
	)
	
	(method (init)
		(asm
			pushi    #number
			pushi    1
			pushi    0
			lag      global168
			send     6
			pushi    0
			call     localproc_0055,  0
			pushi    5
			pushi    128
			pushi    150
			pushi    7
			pushi    157
			pushi    143
			calle    proc958_0,  10
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0ad9
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_0ad9
			pushi    0
			call     localproc_001e,  0
code_0ad9:
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #addObstacle
			pushi    10
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    319
			pushi    155
			pushi    319
			pushi    189
			pushi    213
			pushi    189
			pushi    192
			pushi    189
			pushi    123
			pushi    189
			pushi    130
			pushi    176
			pushi    270
			pushi    179
			pushi    292
			pushi    178
			pushi    249
			pushi    131
			pushi    289
			pushi    124
			pushi    319
			pushi    123
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    28
			pushi    204
			pushi    113
			pushi    176
			pushi    117
			pushi    166
			pushi    113
			pushi    144
			pushi    113
			pushi    116
			pushi    105
			pushi    116
			pushi    93
			pushi    120
			pushi    91
			pushi    126
			pushi    85
			pushi    137
			pushi    85
			pushi    162
			pushi    94
			pushi    169
			pushi    96
			pushi    177
			pushi    101
			pushi    179
			pushi    104
			pushi    203
			pushi    109
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    28
			pushi    240
			pushi    111
			pushi    229
			pushi    112
			pushi    206
			pushi    108
			pushi    170
			pushi    93
			pushi    164
			pushi    93
			pushi    163
			pushi    89
			pushi    229
			pushi    76
			pushi    265
			pushi    63
			pushi    292
			pushi    77
			pushi    280
			pushi    87
			pushi    252
			pushi    91
			pushi    275
			pushi    98
			pushi    277
			pushi    101
			pushi    247
			pushi    107
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    24
			pushi    140
			pushi    128
			pushi    125
			pushi    131
			pushi    103
			pushi    135
			pushi    77
			pushi    143
			pushi    62
			pushi    142
			pushi    54
			pushi    136
			pushi    32
			pushi    138
			pushi    18
			pushi    133
			pushi    17
			pushi    128
			pushi    104
			pushi    103
			pushi    129
			pushi    117
			pushi    144
			pushi    120
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     62
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    28
			pushi    233
			pushi    140
			pushi    216
			pushi    148
			pushi    207
			pushi    151
			pushi    209
			pushi    165
			pushi    187
			pushi    171
			pushi    175
			pushi    171
			dup     
			pushi    169
			pushi    162
			pushi    170
			pushi    132
			pushi    171
			pushi    119
			pushi    174
			pushi    87
			pushi    158
			pushi    96
			pushi    152
			pushi    165
			pushi    119
			pushi    220
			pushi    127
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     70
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    74
			pushi    163
			pushi    45
			pushi    165
			pushi    33
			pushi    172
			pushi    21
			pushi    177
			pushi    9
			pushi    178
			pushi    0
			pushi    184
			pushi    0
			pushi    137
			pushi    23
			pushi    145
			pushi    41
			pushi    145
			pushi    53
			pushi    152
			pushi    70
			pushi    158
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    71
			pushi    81
			pushi    77
			pushi    90
			pushi    68
			pushi    95
			pushi    33
			pushi    96
			pushi    14
			pushi    92
			pushi    24
			pushi    86
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    14
			pushi    56
			pushi    110
			pushi    53
			pushi    115
			pushi    32
			pushi    118
			pushi    12
			pushi    115
			pushi    14
			pushi    110
			pushi    33
			pushi    106
			pushi    48
			pushi    105
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    88
			pushi    101
			pushi    74
			pushi    107
			pushi    60
			pushi    107
			pushi    52
			pushi    103
			pushi    56
			pushi    101
			pushi    80
			pushi    98
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    14
			pushi    319
			pushi    97
			pushi    319
			pushi    118
			pushi    279
			pushi    121
			pushi    254
			pushi    123
			pushi    231
			pushi    121
			pushi    251
			pushi    110
			pushi    253
			pushi    108
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			push    
			lag      global2
			send     24
			pushi    #play
			pushi    0
			lofsa    streamSound
			send     4
			lal      local13
			bnt      code_0e6f
			lsl      local18
			ldi      0
			ne?     
			bnt      code_0dda
			pushi    #setCycle
			pushi    1
			lsl      local18
			lal      local13
			send     6
			jmp      code_0df1
code_0dda:
			pushi    150
			pushi    #-info-
			class    StopWalk
			push    
			pushi    #view
			pushi    0
			lal      local13
			send     4
			push    
			ldi      1
			add     
			push    
			lal      local13
			send     8
code_0df1:
			pushi    #x
			pushi    1
			lsl      local14
			pushi    3
			pushi    1
			lsl      local15
			pushi    7
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			pushi    16384
			pushi    107
			pushi    0
			lal      local13
			send     28
			lsl      local53
			ldi      1
			eq?     
			bnt      code_0e32
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0e32
			lsg      global130
			ldi      6
			eq?     
			bnt      code_0e32
			pushi    #setPri
			pushi    1
			pushi    3
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     6
code_0e32:
			lsl      local17
			ldi      0
			gt?     
			bnt      code_0e46
			pushi    #loop
			pushi    1
			lsl      local17
			lal      local13
			send     6
			jmp      code_0e5e
code_0e46:
			lal      local43
			bnt      code_0e56
			pushi    #loop
			pushi    1
			pushi    0
			lal      local13
			send     6
			jmp      code_0e5e
code_0e56:
			pushi    #loop
			pushi    1
			pushi    2
			lal      local13
			send     6
code_0e5e:
			lsl      local16
			ldi      0
			ne?     
			bnt      code_0e6f
			pushi    #view
			pushi    1
			lsl      local16
			lal      local13
			send     6
code_0e6f:
			lal      local19
			bnt      code_0f08
			pushi    #x
			pushi    1
			lsl      local20
			pushi    3
			pushi    1
			lsl      local21
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			send     22
			lsl      local23
			ldi      0
			ne?     
			bnt      code_0e9c
			pushi    #loop
			pushi    1
			lsl      local23
			lal      local19
			send     6
			jmp      code_0eb7
code_0e9c:
			lsl      local53
			ldi      1
			eq?     
			bnt      code_0eaf
			pushi    #loop
			pushi    1
			pushi    0
			lal      local19
			send     6
			jmp      code_0eb7
code_0eaf:
			pushi    #loop
			pushi    1
			pushi    2
			lal      local19
			send     6
code_0eb7:
			lsl      local22
			ldi      0
			ne?     
			bnt      code_0ec8
			pushi    #view
			pushi    1
			lsl      local22
			lal      local19
			send     6
code_0ec8:
			lsl      local24
			ldi      0
			ne?     
			bnt      code_0edd
			pushi    #setCycle
			pushi    1
			lsl      local24
			lal      local19
			send     6
			jmp      code_0f08
code_0edd:
			lsl      local53
			ldi      1
			eq?     
			bnt      code_0ef1
			pushi    #setCycle
			pushi    1
			pushi    0
			lal      local19
			send     6
			jmp      code_0f08
code_0ef1:
			pushi    150
			pushi    #-info-
			class    StopWalk
			push    
			pushi    #view
			pushi    0
			lal      local19
			send     4
			push    
			ldi      1
			add     
			push    
			lal      local19
			send     8
code_0f08:
			lal      local25
			bnt      code_0f8d
			pushi    #x
			pushi    1
			lsl      local26
			pushi    3
			pushi    1
			lsl      local27
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			send     22
			lsl      local29
			ldi      0
			ne?     
			bnt      code_0f35
			pushi    #loop
			pushi    1
			lsl      local29
			lal      local25
			send     6
			jmp      code_0f50
code_0f35:
			lsl      local55
			ldi      1
			eq?     
			bnt      code_0f48
			pushi    #loop
			pushi    1
			pushi    0
			lal      local25
			send     6
			jmp      code_0f50
code_0f48:
			pushi    #loop
			pushi    1
			pushi    2
			lal      local25
			send     6
code_0f50:
			lsl      local28
			ldi      0
			ne?     
			bnt      code_0f61
			pushi    #view
			pushi    1
			lsl      local28
			lal      local25
			send     6
code_0f61:
			lsl      local30
			ldi      0
			ne?     
			bnt      code_0f76
			pushi    #setCycle
			pushi    1
			lsl      local30
			lal      local25
			send     6
			jmp      code_0f8d
code_0f76:
			pushi    150
			pushi    #-info-
			class    StopWalk
			push    
			pushi    #view
			pushi    0
			lal      local25
			send     4
			push    
			ldi      1
			add     
			push    
			lal      local25
			send     8
code_0f8d:
			lal      local31
			bnt      code_1014
			lsl      local36
			ldi      0
			ne?     
			bnt      code_0fa7
			pushi    #setCycle
			pushi    1
			lsl      local36
			lal      local31
			send     6
			jmp      code_0fbe
code_0fa7:
			pushi    150
			pushi    #-info-
			class    StopWalk
			push    
			pushi    #view
			pushi    0
			lal      local31
			send     4
			push    
			ldi      1
			add     
			push    
			lal      local31
			send     8
code_0fbe:
			pushi    #x
			pushi    1
			lsl      local32
			pushi    3
			pushi    1
			lsl      local33
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lal      local31
			send     22
			lsl      local35
			ldi      0
			ne?     
			bnt      code_0fe8
			pushi    #loop
			pushi    1
			lsl      local35
			lal      local31
			send     6
			jmp      code_1003
code_0fe8:
			lsl      local54
			ldi      1
			eq?     
			bnt      code_0ffb
			pushi    #loop
			pushi    1
			pushi    0
			lal      local31
			send     6
			jmp      code_1003
code_0ffb:
			pushi    #loop
			pushi    1
			pushi    2
			lal      local31
			send     6
code_1003:
			lsl      local34
			ldi      0
			ne?     
			bnt      code_1014
			pushi    #view
			pushi    1
			lsl      local34
			lal      local31
			send     6
code_1014:
			lal      local37
			bnt      code_1086
			pushi    #x
			pushi    1
			lsl      local38
			pushi    3
			pushi    1
			lsl      local39
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			send     22
			lsl      local41
			ldi      0
			ne?     
			bnt      code_1041
			pushi    #loop
			pushi    1
			lsl      local41
			lal      local37
			send     6
			jmp      code_1049
code_1041:
			pushi    #loop
			pushi    1
			pushi    2
			lal      local37
			send     6
code_1049:
			lsl      local40
			ldi      0
			ne?     
			bnt      code_105a
			pushi    #view
			pushi    1
			lsl      local40
			lal      local37
			send     6
code_105a:
			lsl      local42
			ldi      0
			ne?     
			bnt      code_106f
			pushi    #setCycle
			pushi    1
			lsl      local42
			lal      local37
			send     6
			jmp      code_1086
code_106f:
			pushi    150
			pushi    #-info-
			class    StopWalk
			push    
			pushi    #view
			pushi    0
			lal      local37
			send     4
			push    
			ldi      1
			add     
			push    
			lal      local37
			send     8
code_1086:
			pushi    1
			pushi    102
			callb    proc0_5,  2
			bnt      code_10b6
			lsg      global130
			ldi      9
			eq?     
			bnt      code_10b6
			pushi    #setPri
			pushi    1
			pushi    15
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     6
			pushi    #setPri
			pushi    1
			pushi    10
			pushi    17
			pushi    1
			pushi    16
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
code_10b6:
			lsl      local44
			ldi      1
			eq?     
			bnt      code_10ce
			pushi    #init
			pushi    0
			lofsa    theFire
			send     4
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
code_10ce:
			lsl      local49
			ldi      1
			eq?     
			bnt      code_10e1
			pushi    1
			lofsa    food
			push    
			calle    proc806_3,  2
code_10e1:
			pushi    19
			lofsa    table1
			push    
			lofsa    table2
			push    
			lofsa    table3
			push    
			lofsa    table4
			push    
			lofsa    rock1
			push    
			lofsa    rock2
			push    
			lofsa    rock3
			push    
			lofsa    rock4
			push    
			lofsa    rock5
			push    
			lofsa    stump1
			push    
			lofsa    stump2
			push    
			lofsa    stump3
			push    
			lofsa    stump4
			push    
			lofsa    stump5
			push    
			lofsa    cave
			push    
			lofsa    stream
			push    
			lofsa    cliffs
			push    
			lofsa    woods
			push    
			lofsa    everyThing
			push    
			calle    proc806_3,  38
			lsg      global12
			ldi      140
			eq?     
			bnt      code_1142
			ldi      4
			sag      global108
code_1142:
			pushi    1
			pushi    102
			callb    proc0_5,  2
			bnt      code_1157
			lsg      global130
			ldi      9
			eq?     
			bnt      code_1157
			ldi      0
			sag      global126
code_1157:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #actions
			pushi    1
			lofsa    bowActions
			push    
			lag      global0
			send     6
			pushi    #number
			pushi    1
			pushi    905
			pushi    42
			pushi    0
			lag      global100
			send     10
			pushi    #number
			pushi    0
			lag      global168
			send     4
			push    
			ldi      154
			eq?     
			bt       code_1191
			pushi    #number
			pushi    0
			lag      global168
			send     4
			push    
			ldi      393
			eq?     
code_1191:
			bnt      code_119b
			pushi    #play
			pushi    0
			lag      global168
			send     4
code_119b:
			pushi    1
			pushi    102
			callb    proc0_5,  2
			bnt      code_11d1
			lsg      global130
			ldi      9
			eq?     
			bnt      code_11d1
			pushi    3
			pushi    1
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    #posn
			pushi    2
			pushi    262
			pushi    119
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lsl      local12
			lag      global0
			send     24
			jmp      code_11e1
code_11d1:
			pushi    #setScript
			pushi    3
			lofsa    egoEnters
			push    
			pushi    0
			lsg      global108
			lag      global0
			send     10
code_11e1:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_120c
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_120c
			pushi    4
			pushi    6
			pushi    236
			pushi    253
			pushi    65535
			callk    Palette,  8
code_120c:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_121c
			ldi      0
			jmp      code_12c7
code_121c:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_1290
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			push    
			dup     
			ldi      2
			eq?     
			bnt      code_123e
			pToa     east
			jmp      code_125f
code_123e:
			dup     
			ldi      3
			eq?     
			bnt      code_124a
			pToa     south
			jmp      code_125f
code_124a:
			dup     
			ldi      4
			eq?     
			bnt      code_1256
			pToa     west
			jmp      code_125f
code_1256:
			dup     
			ldi      1
			eq?     
			bnt      code_125f
			pToa     north
code_125f:
			toss    
			sat      temp0
			lsg      global108
			ldi      2
			ne?     
			bnt      code_127d
			pushi    #setScript
			pushi    3
			lofsa    walkOutOfHere
			push    
			pushi    0
			lst      temp0
			lag      global0
			send     10
			jmp      code_12c7
code_127d:
			pushi    #setScript
			pushi    3
			lofsa    walkOutOfHere
			push    
			pushi    0
			lst      temp0
			lag      global0
			send     10
			jmp      code_12c7
code_1290:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			eq?     
			bnt      code_12c1
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
			jmp      code_12c7
code_12c1:
			pushi    #doit
			pushi    0
			super    Rm,  4
code_12c7:
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
			super    Rm,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lofsa    cave
			send     6
			bnt      code_131f
			lsg      global19
			ldi      0
			eq?     
			bnt      code_131f
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_131f
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bt       code_1305
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
code_1305:
			bnt      code_131f
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #setScript
			pushi    1
			lofsa    walkInToCave
			push    
			lag      global0
			send     6
			jmp      code_1328
code_131f:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Rm,  6
code_1328:
			ret     
		)
	)
)

(instance bowActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_13b9
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_13d8
code_13b9:
			dup     
			ldi      4
			eq?     
			bnt      code_13d8
			lsp      param2
			ldi      1
			eq?     
			bnt      code_13d8
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    5
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
code_13d8:
			toss    
			ret     
		)
	)
)

(instance tucksActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_1489
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_142f
			lal      local52
			not     
			bnt      code_1488
			ldi      1
			sal      local52
			pushi    7
			pushi    2
			lea      @local96
			push    
			pushi    2
			pushi    0
			pushi    15
			pushi    3
			pushi    0
			calle    proc851_0,  14
			ldi      1
			jmp      code_1488
code_142f:
			dup     
			ldi      5
			eq?     
			bnt      code_146b
			pushi    1
			pushi    111
			callb    proc0_5,  2
			bnt      code_1455
			pushi    5
			pushi    1
			lea      @local101
			push    
			pushi    15
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
			jmp      code_1488
code_1455:
			pushi    5
			pushi    1
			lea      @local105
			push    
			pushi    15
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
			jmp      code_1488
code_146b:
			dup     
			ldi      11
			eq?     
			bnt      code_1488
			pushi    7
			pushi    2
			lea      @local109
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushi    0
			calle    proc851_0,  14
			ldi      1
code_1488:
			toss    
code_1489:
			toss    
			ret     
		)
	)
)

(instance alansActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_14ef
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_14d4
			pushi    5
			pushi    1
			lea      @local61
			push    
			pushi    16
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
			jmp      code_14ee
code_14d4:
			dup     
			ldi      6
			eq?     
			bnt      code_14ee
			pushi    5
			pushi    1
			lea      @local65
			push    
			pushi    16
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_14ee:
			toss    
code_14ef:
			toss    
			ret     
		)
	)
)

(instance willsActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_1575
			lsg      global130
			dup     
			ldi      5
			eq?     
			bnt      code_154a
			lsg      global126
			ldi      6
			eq?     
			bt       code_1531
			lsg      global126
			ldi      5
			eq?     
code_1531:
			bnt      code_1574
			pushi    5
			pushi    1
			lea      @local69
			push    
			pushi    14
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
			jmp      code_1574
code_154a:
			dup     
			ldi      6
			eq?     
			bnt      code_1574
			lsg      global126
			ldi      6
			eq?     
			bt       code_155e
			lsg      global126
			ldi      5
			eq?     
code_155e:
			bnt      code_1574
			pushi    5
			pushi    1
			lea      @local69
			push    
			pushi    14
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_1574:
			toss    
code_1575:
			toss    
			ret     
		)
	)
)

(instance johnsActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_1619
			lsg      global130
			dup     
			ldi      6
			eq?     
			bnt      code_15dc
			lsl      local51
			ldi      0
			eq?     
			bnt      code_15c8
			ldi      1
			sal      local51
			pushi    3
			lea      @local124
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  6
			jmp      code_15d7
code_15c8:
			pushi    3
			lea      @local73
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  6
code_15d7:
			ldi      1
			jmp      code_1618
code_15dc:
			dup     
			ldi      10
			eq?     
			bnt      code_1618
			lal      local50
			bnt      code_15fe
			pushi    5
			pushi    1
			lea      @local77
			push    
			pushi    13
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
			jmp      code_1618
code_15fe:
			pushi    7
			pushi    2
			lea      @local81
			push    
			pushi    2
			pushi    0
			pushi    13
			pushi    3
			pushi    0
			calle    proc851_0,  14
			ldi      1
			sal      local50
			ldi      1
code_1618:
			toss    
code_1619:
			toss    
			ret     
		)
	)
)

(instance muchsActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_165e
			lsg      global130
			ldi      6
			eq?     
			bnt      code_165e
			pushi    3
			lea      @local87
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  6
			ldi      1
code_165e:
			toss    
			ret     
		)
	)
)

(instance tableDoVerb of Code
	(properties)
	
	(method (doit param1 param2 param3)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_1698
			pushi    3
			pushi    1150
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_1713
code_1698:
			dup     
			ldi      3
			eq?     
			bnt      code_16ae
			pushi    3
			pushi    1150
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_1713
code_16ae:
			dup     
			ldi      10
			eq?     
			bnt      code_16c3
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_1713
code_16c3:
			dup     
			ldi      4
			eq?     
			bnt      code_1708
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_16e2
			pushi    3
			pushi    1150
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_1704
code_16e2:
			dup     
			ldi      0
			eq?     
			bnt      code_16f8
			pushi    3
			pushi    1150
			pushi    9
			pushi    1
			calle    proc13_4,  6
			jmp      code_1704
code_16f8:
			pushi    3
			pushi    1150
			pushi    10
			pushi    1
			calle    proc13_4,  6
code_1704:
			toss    
			jmp      code_1713
code_1708:
			pushi    #doit
			pushi    1
			lsp      param1
			&rest    param3
			lag      global65
			send     6
code_1713:
			toss    
			ret     
		)
	)
)

(instance stumpDoVerb of Code
	(properties)
	
	(method (doit param1 param2 param3)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_174e
			pushi    3
			pushi    1150
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_1783
code_174e:
			dup     
			ldi      3
			eq?     
			bnt      code_1763
			pushi    3
			pushi    1150
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1783
code_1763:
			dup     
			ldi      10
			eq?     
			bnt      code_1778
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_1783
code_1778:
			pushi    #doit
			pushi    1
			lsp      param1
			&rest    param3
			lag      global65
			send     6
code_1783:
			toss    
			ret     
		)
	)
)

(instance rockDoVerb of Code
	(properties)
	
	(method (doit param1 param2 param3)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_17be
			pushi    3
			pushi    1150
			pushi    12
			pushi    1
			calle    proc13_4,  6
			jmp      code_17f3
code_17be:
			dup     
			ldi      3
			eq?     
			bnt      code_17d3
			pushi    3
			pushi    1150
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_17f3
code_17d3:
			dup     
			ldi      10
			eq?     
			bnt      code_17e8
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_17f3
code_17e8:
			pushi    #doit
			pushi    1
			lsp      param1
			&rest    param3
			lag      global65
			send     6
code_17f3:
			toss    
			ret     
		)
	)
)

(instance table1 of Feature
	(properties
		x 35
		y 131
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    35
			pushi    143
			pushi    0
			pushi    155
			pushi    0
			pushi    131
			pushi    33
			pushi    137
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     26
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    tableDoVerb
			send     8
			ret     
		)
	)
)

(instance table2 of Feature
	(properties
		x 129
		y 93
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    129
			pushi    101
			pushi    67
			pushi    117
			pushi    30
			pushi    110
			pushi    30
			pushi    107
			pushi    91
			pushi    93
			pushi    128
			pushi    98
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    tableDoVerb
			send     8
			ret     
		)
	)
)

(instance table3 of Feature
	(properties
		x 207
		y 113
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    207
			pushi    121
			pushi    158
			pushi    150
			pushi    110
			pushi    141
			pushi    108
			pushi    137
			pushi    165
			pushi    113
			pushi    204
			pushi    117
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    tableDoVerb
			send     8
			ret     
		)
	)
)

(instance table4 of Feature
	(properties
		x 273
		y 63
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    273
			pushi    71
			pushi    209
			pushi    85
			pushi    174
			pushi    78
			pushi    174
			pushi    74
			pushi    230
			pushi    63
			pushi    271
			pushi    68
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    tableDoVerb
			send     8
			ret     
		)
	)
)

(instance rock1 of Feature
	(properties
		x 220
		y 131
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    220
			pushi    138
			pushi    212
			pushi    143
			pushi    188
			pushi    143
			pushi    187
			pushi    138
			pushi    215
			pushi    131
			pushi    220
			pushi    134
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    rockDoVerb
			send     8
			ret     
		)
	)
)

(instance rock2 of Feature
	(properties
		x 105
		y 117
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    105
			pushi    127
			pushi    91
			pushi    129
			pushi    82
			pushi    126
			pushi    86
			pushi    120
			pushi    95
			pushi    117
			pushi    102
			pushi    120
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    rockDoVerb
			send     8
			ret     
		)
	)
)

(instance rock3 of Feature
	(properties
		x 57
		y 120
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    57
			pushi    130
			pushi    52
			pushi    132
			pushi    31
			pushi    132
			pushi    18
			pushi    127
			pushi    25
			pushi    121
			pushi    45
			pushi    120
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
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    rockDoVerb
			send     8
			ret     
		)
	)
)

(instance rock4 of Feature
	(properties
		x 72
		y 162
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    72
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    177
			pushi    6
			pushi    173
			pushi    1
			pushi    167
			pushi    7
			pushi    162
			pushi    26
			pushi    163
			pushi    31
			pushi    171
			pushi    51
			pushi    180
			pushi    63
			pushi    179
			pushi    71
			pushi    184
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     54
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    rockDoVerb
			send     8
			ret     
		)
	)
)

(instance rock5 of Feature
	(properties
		x 208
		y 172
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    208
			pushi    178
			pushi    177
			pushi    181
			pushi    154
			pushi    189
			pushi    145
			pushi    189
			pushi    142
			pushi    184
			pushi    146
			pushi    180
			pushi    155
			pushi    177
			pushi    170
			pushi    172
			pushi    195
			pushi    174
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
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    rockDoVerb
			send     8
			ret     
		)
	)
)

(instance stump1 of Feature
	(properties
		x 255
		y 86
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    255
			pushi    99
			pushi    244
			pushi    105
			pushi    230
			pushi    104
			pushi    222
			pushi    100
			pushi    223
			pushi    90
			pushi    229
			pushi    86
			pushi    247
			pushi    86
			pushi    251
			pushi    89
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    stumpDoVerb
			send     8
			ret     
		)
	)
)

(instance stump2 of Feature
	(properties
		x 195
		y 150
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    195
			pushi    162
			pushi    179
			pushi    165
			pushi    162
			pushi    160
			pushi    167
			pushi    153
			pushi    171
			pushi    150
			pushi    187
			pushi    150
			pushi    193
			pushi    153
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    stumpDoVerb
			send     8
			ret     
		)
	)
)

(instance stump3 of Feature
	(properties
		x 137
		y 112
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    137
			pushi    123
			pushi    124
			pushi    127
			pushi    113
			pushi    126
			pushi    107
			pushi    123
			pushi    109
			pushi    114
			pushi    115
			pushi    112
			pushi    129
			pushi    112
			pushi    136
			pushi    114
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    stumpDoVerb
			send     8
			ret     
		)
	)
)

(instance stump4 of Feature
	(properties
		x 46
		y 142
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    46
			pushi    155
			pushi    32
			pushi    164
			pushi    25
			pushi    161
			pushi    11
			pushi    160
			pushi    11
			pushi    152
			pushi    39
			pushi    142
			pushi    43
			pushi    143
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    stumpDoVerb
			send     8
			ret     
		)
	)
)

(instance stump5 of Feature
	(properties
		x 142
		y 149
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    142
			pushi    163
			pushi    134
			pushi    167
			pushi    123
			pushi    168
			pushi    101
			pushi    160
			pushi    102
			pushi    153
			pushi    109
			pushi    149
			pushi    118
			pushi    150
			pushi    139
			pushi    157
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    stumpDoVerb
			send     8
			ret     
		)
	)
)

(instance cave of Feature
	(properties
		x 319
		y 28
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    319
			pushi    111
			pushi    301
			pushi    94
			pushi    308
			pushi    63
			pushi    319
			pushi    64
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     26
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
			bnt      code_2063
			pushi    3
			pushi    1150
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_2083
code_2063:
			dup     
			ldi      10
			eq?     
			bnt      code_2078
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_2083
code_2078:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_2083:
			toss    
			ret     
		)
	)
)

(instance stream of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    40
			pushi    0
			pushi    83
			pushi    19
			pushi    82
			pushi    23
			pushi    76
			pushi    34
			pushi    78
			pushi    41
			pushi    75
			pushi    72
			pushi    75
			pushi    77
			pushi    69
			pushi    183
			pushi    61
			pushi    181
			pushi    56
			pushi    211
			pushi    56
			pushi    210
			pushi    53
			pushi    236
			pushi    50
			pushi    290
			pushi    47
			pushi    289
			pushi    51
			pushi    129
			pushi    74
			pushi    100
			pushi    74
			pushi    85
			pushi    81
			pushi    41
			pushi    82
			pushi    25
			pushi    91
			pushi    0
			pushi    91
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     90
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
			bnt      code_2156
			pushi    3
			pushi    1150
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_21b8
code_2156:
			dup     
			ldi      10
			eq?     
			bnt      code_216b
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_21b8
code_216b:
			dup     
			ldi      3
			eq?     
			bnt      code_2181
			pushi    3
			pushi    1150
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_21b8
code_2181:
			dup     
			ldi      4
			eq?     
			bnt      code_21ad
			lsp      param2
			ldi      18
			eq?     
			bnt      code_219f
			pushi    3
			pushi    1150
			pushi    52
			pushi    1
			calle    proc13_4,  6
			jmp      code_21b8
code_219f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
			jmp      code_21b8
code_21ad:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_21b8:
			toss    
			ret     
		)
	)
)

(instance cliffs of Feature
	(properties
		x 60
		y 1
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    120
			pushi    41
			pushi    0
			pushi    42
			pushi    0
			pushi    0
			pushi    82
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     26
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
			bnt      code_2242
			pushi    3
			pushi    1150
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_2262
code_2242:
			dup     
			ldi      10
			eq?     
			bnt      code_2257
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_2262
code_2257:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_2262:
			toss    
			ret     
		)
	)
)

(instance woods of Feature
	(properties
		x 190
		y 1
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    125
			pushi    45
			pushi    85
			pushi    0
			pushi    295
			pushi    0
			pushi    293
			pushi    39
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     26
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
			bnt      code_22ee
			pushi    3
			pushi    1150
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_230e
code_22ee:
			dup     
			ldi      10
			eq?     
			bnt      code_2303
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_230e
code_2303:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_230e:
			toss    
			ret     
		)
	)
)

(instance food of Feature
	(properties
		x 164
		y 94
		nsTop 77
		nsLeft 143
		nsBottom 94
		nsRight 186
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2370
			pushi    3
			pushi    1150
			pushi    37
			pushi    1
			calle    proc13_4,  6
			jmp      code_2404
code_2370:
			dup     
			ldi      3
			eq?     
			bnt      code_23e4
			lsl      local46
			ldi      0
			eq?     
			bt       code_2384
			lsl      local47
			ldi      0
			eq?     
code_2384:
			bnt      code_23a6
			lsl      local46
			ldi      1
			eq?     
			bnt      code_2393
			ldi      1
			sal      local47
code_2393:
			ldi      1
			sal      local46
			pushi    #setScript
			pushi    1
			lofsa    takeFood
			push    
			lag      global0
			send     6
			jmp      code_2404
code_23a6:
			lsl      local46
			ldi      1
			eq?     
			bnt      code_23d5
			lsl      local47
			ldi      1
			eq?     
			bnt      code_23d5
			lsl      local48
			ldi      0
			eq?     
			bnt      code_23d5
			ldi      1
			sal      local48
			pushi    3
			lea      @local114
			push    
			pushi    3
			pushi    15
			calle    proc851_0,  6
			jmp      code_2404
code_23d5:
			pushi    3
			pushi    1150
			pushi    38
			pushi    1
			calle    proc13_4,  6
			jmp      code_2404
code_23e4:
			dup     
			ldi      10
			eq?     
			bnt      code_23f9
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_2404
code_23f9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_2404:
			toss    
			ret     
		)
	)
)

(instance everyThing of Feature
	(properties
		nsBottom 190
		nsRight 322
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      10
			eq?     
			bnt      code_2460
			pushi    3
			pushi    1150
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_246b
code_2460:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_246b:
			ret     
		)
	)
)

(instance wave of Prop
	(properties
		view 150
		loop 7
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_24c5
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			self     6
			jmp      code_24ce
code_24c5:
			pushi    #setCycle
			pushi    1
			class    Rev
			push    
			self     6
code_24ce:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance theFire of Prop
	(properties
		x 155
		y 105
		view 140
		priority 7
		signal $4010
		cycleSpeed 12
		detailLevel 2
	)
	
	(method (init)
		(asm
			pushi    #setCycle
			pushi    2
			class    Fwd
			push    
			pushSelf
			self     8
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_25aa
			pushi    3
			pushi    1150
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_25e2
code_25aa:
			dup     
			ldi      3
			eq?     
			bnt      code_25d7
			lsg      global115
			ldi      2
			eq?     
			bnt      code_25c8
			pushi    #setScript
			pushi    1
			lofsa    burnHand
			push    
			lag      global0
			send     6
			jmp      code_25e2
code_25c8:
			pushi    3
			pushi    1150
			pushi    14
			pushi    1
			calle    proc13_4,  6
			jmp      code_25e2
code_25d7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_25e2:
			toss    
			ret     
		)
	)
	
	(method (cue &tmp temp0)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			sat      temp0
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    6
			pushi    18
			callk    Random,  4
			push    
			self     6
			lat      temp0
			bnt      code_2580
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			jmp      code_258a
code_2580:
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			self     8
code_258a:
			pushi    #cue
			pushi    0
			super    Prop,  4
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
			bnt      code_2744
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #illegalBits
			pushi    1
			pushi    0
			lag      global0
			send     6
			pTos     register
			dup     
			ldi      2
			eq?     
			bnt      code_269e
			pushi    #posn
			pushi    2
			pushi    65521
			pushi    124
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    26
			pushi    124
			pushSelf
			lag      global0
			send     24
			jmp      code_2740
code_269e:
			dup     
			ldi      3
			eq?     
			bnt      code_26cb
			pushi    #posn
			pushi    2
			pushi    181
			pushi    70
			pushi    107
			pushi    0
			pushi    6
			pushi    1
			pushi    5
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    252
			pushi    125
			pushSelf
			lag      global0
			send     30
			jmp      code_2740
code_26cb:
			dup     
			ldi      4
			eq?     
			bnt      code_271d
			lsg      global12
			ldi      140
			eq?     
			bnt      code_26fc
			pushi    #posn
			pushi    2
			pushi    339
			pushi    119
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    262
			pushi    125
			pushSelf
			lag      global0
			send     24
			jmp      code_2740
code_26fc:
			pushi    #posn
			pushi    2
			pushi    302
			pushi    88
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    262
			pushi    125
			pushSelf
			lag      global0
			send     24
			jmp      code_2740
code_271d:
			pushi    #loop
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    107
			pushi    241
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    107
			pushi    184
			pushSelf
			lag      global0
			send     30
code_2740:
			toss    
			jmp      code_279c
code_2744:
			dup     
			ldi      1
			eq?     
			bnt      code_2777
			pushi    1
			pushi    179
			callb    proc0_5,  2
			bnt      code_276e
			pushi    1
			pushi    179
			callb    proc0_7,  2
			pushi    4
			lea      @local129
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_279c
code_276e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_279c
code_2777:
			dup     
			ldi      2
			eq?     
			bnt      code_279c
			lal      local12
			bnt      code_278f
			pushi    #setScript
			pushi    1
			push    
			lag      global0
			send     6
			jmp      code_2793
code_278f:
			pushi    0
			callb    proc0_4,  0
code_2793:
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
code_279c:
			toss    
			ret     
		)
	)
)

(instance walkOutOfHere of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2857
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
			bnt      code_2809
			ldi      240
			sat      temp1
			jmp      code_2828
code_2809:
			dup     
			ldi      2
			eq?     
			bnt      code_281a
			lst      temp0
			ldi      20
			add     
			sat      temp0
			jmp      code_2828
code_281a:
			dup     
			ldi      4
			eq?     
			bnt      code_2828
			lst      temp0
			ldi      20
			sub     
			sat      temp0
code_2828:
			toss    
			pushi    0
			callb    proc0_3,  0
			lsg      global108
			ldi      1
			ne?     
			bnt      code_284e
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
			jmp      code_286c
code_284e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_286c
code_2857:
			dup     
			ldi      1
			eq?     
			bnt      code_286c
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pTos     register
			lag      global2
			send     6
code_286c:
			toss    
			ret     
		)
	)
)

(instance burnHand of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_28d6
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    128
			pushi    7
			callk    Load,  4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    154
			pushi    117
			pushSelf
			lag      global0
			send     12
			jmp      code_2949
code_28d6:
			dup     
			ldi      1
			eq?     
			bnt      code_28ed
			pushi    #loop
			pushi    1
			pushi    3
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_2949
code_28ed:
			dup     
			ldi      2
			eq?     
			bnt      code_2915
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     32
			jmp      code_2949
code_2915:
			dup     
			ldi      3
			eq?     
			bnt      code_2929
			pushi    1
			pushi    6
			callb    proc0_2,  2
			ldi      6
			aTop     ticks
			jmp      code_2949
code_2929:
			dup     
			ldi      4
			eq?     
			bnt      code_2949
			pushi    5
			pushi    1
			lea      @local57
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  10
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2949:
			toss    
			ret     
		)
	)
)

(instance tuckAlone of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_299d
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_29ec
code_299d:
			dup     
			ldi      1
			eq?     
			bnt      code_29be
			pushi    7
			pushi    2
			lea      @local91
			push    
			pushi    3
			pushi    0
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			ldi      1
			jmp      code_29ec
code_29be:
			dup     
			ldi      2
			eq?     
			bnt      code_29dc
			pushi    #actions
			pushi    1
			lofsa    tucksActions
			push    
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			ldi      6
			aTop     ticks
			jmp      code_29ec
code_29dc:
			dup     
			ldi      3
			eq?     
			bnt      code_29ec
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_29ec:
			toss    
			ret     
		)
	)
)

(instance takeFood of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2a4d
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    154
			pushi    117
			pushSelf
			lag      global0
			send     12
			jmp      code_2a99
code_2a4d:
			dup     
			ldi      1
			eq?     
			bnt      code_2a64
			pushi    #loop
			pushi    1
			pushi    3
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_2a99
code_2a64:
			dup     
			ldi      2
			eq?     
			bnt      code_2a78
			pushi    1
			pushi    6
			callb    proc0_2,  2
			ldi      6
			aTop     ticks
			jmp      code_2a99
code_2a78:
			dup     
			ldi      3
			eq?     
			bnt      code_2a99
			pushi    4
			lea      @local119
			push    
			pushi    3
			pushi    15
			pushSelf
			calle    proc851_0,  8
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2a99:
			toss    
			ret     
		)
	)
)

(instance walkInToCave of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2afb
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    300
			pushi    113
			pushSelf
			lag      global0
			send     12
			jmp      code_2b29
code_2afb:
			dup     
			ldi      1
			eq?     
			bnt      code_2b17
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    330
			pushi    119
			pushSelf
			lag      global0
			send     12
			jmp      code_2b29
code_2b17:
			dup     
			ldi      2
			eq?     
			bnt      code_2b29
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_2b29:
			toss    
			ret     
		)
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)

(instance streamSound of Sound
	(properties
		flags $0001
		number 581
		loop -1
	)
)
