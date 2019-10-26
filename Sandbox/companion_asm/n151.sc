;;; Sierra Script 1.0 - (do not remove this comment)
(script# 151)
(include sci.sh)
(use n000)
(use n851)
(use n945)
(use n961)
(use n992)
(use n998)
(use n999)

(public
	dayOne 0
	dayTwo 1
	dayThree 2
	dayFour 3
	dayFive 4
	noRobeAbbeyMonkMet 5
	noRobeFensMonkMet 6
	secondNoRescue 7
	thirdNoRescue 8
	day6B 9
	day6A 10
	day7 11
	day8 12
	day8Puck 13
	day9Will 14
	day10 15
	day11 16
	day12 17
	day13 18
)

(local
	local0
	[local1 5] = [1151 0 1 2]
	[local6 5] = [1151 2 1 2]
	[local11 6] = [1151 4 1 2 2]
	[local17 6] = [1151 7 1 2 2]
	[local23 5] = [1151 10 1 2]
	[local28 58] = [1151 12 1 0 1151 13 1 2 0 1151 15 1 2 0 1151 17 1 0 1151 18 1 0 1151 19 1 2 0 1151 21 1 0 1151 22 1 0 1151 23 1 0 1151 24 1 1 0 1151 25 1 0 1151 26 2 1 2 0 1151 29 1]
	[local86 5] = [1151 30 2 1]
	[local91 5] = [1151 32 2 1]
	[local96 5] = [1151 34 1 2]
	[local101 5] = [1151 36 1 2]
	[local106 8] = [1151 38 1 1 1 2 1]
	[local114 5] = [1151 43 2 1]
	[local119 5] = [1151 45 2 1]
	[local124 12] = [1151 47 1 1 1 2 1 1 2 1 2]
	[local136 5] = [1151 56 2 1]
	[local141 5] = [1151 58 2 1]
	[local146 5] = [1151 60 1 2]
	[local151 5] = [1151 62 2 1]
	[local156 4] = [1151 64 1]
	[local160 9] = [1151 65 2 1 2 2 1 2]
	[local169 6] = [1151 71 1 2 2]
	[local175 8] = [1151 74 2 1 2 2 2]
	[local183 7] = [1151 79 2 1 2 2]
	[local190 10] = [1151 83 2 1 2 2 2 1 2]
	[local200 6] = [1151 90 2 1 2]
	[local206 10] = [1151 93 1 2 2 2 1 2 2]
	[local216 7] = [1151 123 1 2 2 1]
	[local223 5] = [1151 127 1 2]
	[local228 6] = [1151 131 2 1 2]
	[local234 5] = [1151 134 1 2]
	[local239 6] = [1151 136 1 2 2]
	[local245 5] = [1151 139 1 2]
	[local250 6] = [1151 141 1 1 2]
	[local256 6] = [1151 144 1 2 1]
	[local262 12] = [1151 147 2 2 2 1 1 2 1 2 1]
	[local274 6] = [1151 156 1 2 1]
	[local280 7] = [1151 159 2 2 2 1]
	[local287 4] = [1151 163 1]
	[local291 10] = [1151 164 3 1 3 3 3 2 3]
	[local301 14] = [1151 171 2 2 1 2 2 2 2 2 2 1 1]
	[local315 6] = [1151 182 1 1 1]
	[local321 10] = [1151 185 2 2 2 1 2 2 1]
	[local331 12] = [1151 192 2 2 2 1 2 2 2 1 2]
)
(instance pucksClothes of View
	(properties
		x 175
		y 129
		view 140
		loop 5
		cel 1
		priority 12
		signal $4011
	)
)

(instance dayOne of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    1
			pushi    151
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
			bnt      code_00ff
			pushi    0
			callb    proc0_3,  0
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     6
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0264
code_00ff:
			dup     
			ldi      1
			eq?     
			bnt      code_011e
			pushi    7
			pushi    2
			lea      @local1
			push    
			pushi    13
			pushi    0
			pushi    16
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0264
code_011e:
			dup     
			ldi      2
			eq?     
			bnt      code_013d
			pushi    7
			pushi    2
			lea      @local6
			push    
			pushi    15
			pushi    0
			pushi    16
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0264
code_013d:
			dup     
			ldi      3
			eq?     
			bnt      code_015c
			pushi    7
			pushi    2
			lea      @local11
			push    
			pushi    3
			pushi    0
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0264
code_015c:
			dup     
			ldi      4
			eq?     
			bnt      code_0181
			pushi    #ignoreActors
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    320
			pushi    70
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     18
			jmp      code_0264
code_0181:
			dup     
			ldi      5
			eq?     
			bnt      code_019a
			pushi    3
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0264
code_019a:
			dup     
			ldi      6
			eq?     
			bnt      code_01b9
			pushi    7
			pushi    2
			lea      @local17
			push    
			pushi    3
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0264
code_01b9:
			dup     
			ldi      7
			eq?     
			bnt      code_01d2
			pushi    3
			lsg      global0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0264
code_01d2:
			dup     
			ldi      8
			eq?     
			bnt      code_01f0
			pushi    7
			pushi    2
			lea      @local23
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0264
code_01f0:
			dup     
			ldi      9
			eq?     
			bnt      code_020b
			pushi    5
			pushi    1
			lea      @local28
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0264
code_020b:
			dup     
			ldi      10
			eq?     
			bnt      code_0230
			pushi    #ignoreActors
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65511
			pushi    131
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     18
			jmp      code_0264
code_0230:
			dup     
			ldi      11
			eq?     
			bnt      code_0254
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0264
code_0254:
			dup     
			ldi      12
			eq?     
			bnt      code_0264
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0264:
			toss    
			ret     
		)
	)
)

(instance dayTwo of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    1
			pushi    151
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
			bnt      code_02ff
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    128
			pushi    7
			pushi    157
			callk    Load,  6
			pushi    2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    21
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_06c6
code_02ff:
			dup     
			ldi      1
			eq?     
			bnt      code_0311
			pushi    0
			callb    proc0_2,  0
			ldi      30
			aTop     ticks
			jmp      code_06c6
code_0311:
			dup     
			ldi      2
			eq?     
			bnt      code_0330
			pushi    7
			pushi    2
			lea      @local86
			push    
			pushi    3
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_0330:
			dup     
			ldi      3
			eq?     
			bnt      code_034e
			pushi    7
			pushi    2
			lea      @local91
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_034e:
			dup     
			ldi      4
			eq?     
			bnt      code_036d
			pushi    7
			pushi    2
			lea      @local96
			push    
			pushi    16
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_036d:
			dup     
			ldi      5
			eq?     
			bnt      code_038b
			pushi    7
			pushi    2
			lea      @local101
			push    
			pushi    1
			pushi    0
			pushi    16
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_038b:
			dup     
			ldi      6
			eq?     
			bnt      code_03a9
			pushi    7
			pushi    2
			lea      @local106
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_03a9:
			dup     
			ldi      7
			eq?     
			bnt      code_03d1
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_06c6
code_03d1:
			dup     
			ldi      8
			eq?     
			bnt      code_0439
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lag      global0
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    232
			pushi    115
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     16
			pushi    #signal
			pushi    1
			pushi    1
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    224
			pushi    146
			pushSelf
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     18
			jmp      code_06c6
code_0439:
			dup     
			ldi      9
			eq?     
			bnt      code_046f
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			lag      global0
			send     10
			pushi    7
			pushi    2
			lea      @local114
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_046f:
			dup     
			ldi      10
			eq?     
			bnt      code_048d
			pushi    7
			pushi    2
			lea      @local119
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_048d:
			dup     
			ldi      11
			eq?     
			bnt      code_04a3
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_06c6
code_04a3:
			dup     
			ldi      12
			eq?     
			bnt      code_04c8
			pushi    1
			pushi    1
			callb    proc0_2,  2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    30
			pushi    131
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_06c6
code_04c8:
			dup     
			ldi      13
			eq?     
			bnt      code_04ea
			ldi      1
			aTop     notKilled
			pushi    7
			pushi    2
			lea      @local124
			push    
			pushi    14
			pushi    0
			pushi    1
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_04ea:
			dup     
			ldi      14
			eq?     
			bnt      code_0509
			pushi    7
			pushi    2
			lea      @local136
			push    
			pushi    3
			pushi    0
			pushi    16
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_0509:
			dup     
			ldi      15
			eq?     
			bnt      code_0569
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			pushi    1
			pushi    21
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    5
			pushi    #superClass
			pushi    157
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    5
			pushi    150
			pushi    1
			class    Beg
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			push    
			ldi      3
			sub     
			push    
			pushSelf
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     36
			jmp      code_06c6
code_0569:
			dup     
			ldi      16
			eq?     
			bnt      code_0588
			pushi    7
			pushi    2
			lea      @local141
			push    
			pushi    16
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_0588:
			dup     
			ldi      17
			eq?     
			bnt      code_05a6
			pushi    7
			pushi    2
			lea      @local146
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_05a6:
			dup     
			ldi      18
			eq?     
			bnt      code_05c4
			pushi    7
			pushi    2
			lea      @local151
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_06c6
code_05c4:
			dup     
			ldi      19
			eq?     
			bnt      code_05df
			pushi    5
			pushi    1
			lea      @local156
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_06c6
code_05df:
			dup     
			ldi      20
			eq?     
			bnt      code_0617
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    320
			pushi    70
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     10
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    65521
			pushi    131
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     10
			ldi      50
			aTop     cycles
			jmp      code_06c6
code_0617:
			dup     
			ldi      21
			eq?     
			bnt      code_0644
			pushi    #setCycle
			pushi    2
			class    StopWalk
			push    
			pushi    158
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    65521
			pushi    188
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     18
			ldi      65
			aTop     cycles
			jmp      code_06c6
code_0644:
			dup     
			ldi      22
			eq?     
			bnt      code_0664
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    80
			pushi    245
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			jmp      code_06c6
code_0664:
			dup     
			ldi      23
			eq?     
			bnt      code_06b6
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			lag      global0
			send     10
			ldi      1
			aTop     cycles
			jmp      code_06c6
code_06b6:
			dup     
			ldi      24
			eq?     
			bnt      code_06c6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_06c6:
			toss    
			ret     
		)
	)
)

(instance dayThree of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_072d
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_0790
code_072d:
			dup     
			ldi      1
			eq?     
			bnt      code_0747
			pushi    4
			lea      @local160
			push    
			pushi    1
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_0790
code_0747:
			dup     
			ldi      2
			eq?     
			bnt      code_0767
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    325
			pushi    73
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_0790
code_0767:
			dup     
			ldi      3
			eq?     
			bnt      code_0780
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0790
code_0780:
			dup     
			ldi      4
			eq?     
			bnt      code_0790
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0790:
			toss    
			ret     
		)
	)
)

(instance dayFour of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0802
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0874
code_0802:
			dup     
			ldi      1
			eq?     
			bnt      code_081d
			pushi    4
			lea      @local169
			push    
			pushi    3
			pushi    14
			pushSelf
			calle    proc851_0,  8
			jmp      code_0874
code_081d:
			dup     
			ldi      2
			eq?     
			bnt      code_084b
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    240
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_0874
code_084b:
			dup     
			ldi      3
			eq?     
			bnt      code_0864
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0874
code_0864:
			dup     
			ldi      4
			eq?     
			bnt      code_0874
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0874:
			toss    
			ret     
		)
	)
)

(instance dayFive of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_08d9
			pushi    0
			callb    proc0_3,  0
			ldi      1
			aTop     cycles
			jmp      code_0972
code_08d9:
			dup     
			ldi      1
			eq?     
			bnt      code_0901
			pushi    2
			pushi    1
			pushi    21
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0972
code_0901:
			dup     
			ldi      2
			eq?     
			bnt      code_091c
			pushi    4
			lea      @local175
			push    
			pushi    3
			pushi    16
			pushSelf
			calle    proc851_0,  8
			jmp      code_0972
code_091c:
			dup     
			ldi      3
			eq?     
			bnt      code_0949
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			push    
			ldi      77
			add     
			push    
			pushi    83
			pushSelf
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     12
			jmp      code_0972
code_0949:
			dup     
			ldi      4
			eq?     
			bnt      code_0962
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0972
code_0962:
			dup     
			ldi      5
			eq?     
			bnt      code_0972
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0972:
			toss    
			ret     
		)
	)
)

(instance noRobeFensMonkMet of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0a1f
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			pushi    #get
			pushi    1
			pushi    5
			lag      global0
			send     6
			pushi    #get
			pushi    1
			pushi    6
			lag      global0
			send     6
			pushi    #put
			pushi    2
			pushi    5
			pushi    140
			lag      global0
			send     8
			pushi    #put
			pushi    2
			pushi    6
			pushi    140
			lag      global0
			send     8
			jmp      code_0a84
code_0a1f:
			dup     
			ldi      1
			eq?     
			bnt      code_0a3b
			pushi    4
			lea      @local183
			push    
			pushi    999
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a84
code_0a3b:
			dup     
			ldi      2
			eq?     
			bnt      code_0a5b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    317
			pushi    88
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_0a84
code_0a5b:
			dup     
			ldi      3
			eq?     
			bnt      code_0a74
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0a84
code_0a74:
			dup     
			ldi      4
			eq?     
			bnt      code_0a84
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0a84:
			toss    
			ret     
		)
	)
)

(instance noRobeAbbeyMonkMet of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0b03
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0b68
code_0b03:
			dup     
			ldi      1
			eq?     
			bnt      code_0b1f
			pushi    4
			lea      @local190
			push    
			pushi    999
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_0b68
code_0b1f:
			dup     
			ldi      2
			eq?     
			bnt      code_0b3f
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65521
			pushi    131
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			jmp      code_0b68
code_0b3f:
			dup     
			ldi      3
			eq?     
			bnt      code_0b58
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0b68
code_0b58:
			dup     
			ldi      4
			eq?     
			bnt      code_0b68
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0b68:
			toss    
			ret     
		)
	)
)

(instance secondNoRescue of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0be7
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0c3d
code_0be7:
			dup     
			ldi      1
			eq?     
			bnt      code_0c12
			pushi    #view
			pushi    1
			pushi    161
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     24
			ldi      10
			aTop     cycles
			jmp      code_0c3d
code_0c12:
			dup     
			ldi      2
			eq?     
			bnt      code_0c2d
			pushi    4
			lea      @local200
			push    
			pushi    9
			pushi    14
			pushSelf
			calle    proc851_0,  8
			jmp      code_0c3d
code_0c2d:
			dup     
			ldi      3
			eq?     
			bnt      code_0c3d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0c3d:
			toss    
			ret     
		)
	)
)

(instance thirdNoRescue of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0ca3
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_0d3b
code_0ca3:
			dup     
			ldi      1
			eq?     
			bnt      code_0cbe
			pushi    4
			lea      @local206
			push    
			pushi    9
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_0d3b
code_0cbe:
			dup     
			ldi      2
			eq?     
			bnt      code_0cda
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    145
			pushi    110
			pushSelf
			lag      global0
			send     12
			jmp      code_0d3b
code_0cda:
			dup     
			ldi      3
			eq?     
			bnt      code_0ce8
			ldi      18
			aTop     ticks
			jmp      code_0d3b
code_0ce8:
			dup     
			ldi      4
			eq?     
			bnt      code_0d01
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			ldi      6
			aTop     ticks
			jmp      code_0d3b
code_0d01:
			dup     
			ldi      5
			eq?     
			bnt      code_0d24
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      48
			aTop     ticks
			jmp      code_0d3b
code_0d24:
			dup     
			ldi      6
			eq?     
			bnt      code_0d3b
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0d3b:
			toss    
			ret     
		)
	)
)

(instance day6B of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0da1
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_0de8
code_0da1:
			dup     
			ldi      1
			eq?     
			bnt      code_0dbc
			pushi    4
			lea      @local223
			push    
			pushi    13
			pushi    16
			pushSelf
			calle    proc851_0,  8
			jmp      code_0de8
code_0dbc:
			dup     
			ldi      2
			eq?     
			bnt      code_0de8
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			push    
			ldi      16385
			or      
			push    
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0de8:
			toss    
			ret     
		)
	)
)

(instance day6A of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_0e67
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    22
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0e93
code_0e67:
			dup     
			ldi      1
			eq?     
			bnt      code_0e83
			pushi    4
			lea      @local216
			push    
			pushi    999
			pushi    17
			pushSelf
			calle    proc851_0,  8
			jmp      code_0e93
code_0e83:
			dup     
			ldi      2
			eq?     
			bnt      code_0e93
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0e93:
			toss    
			ret     
		)
	)
)

(instance day7 of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    1
			pushi    151
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
			bnt      code_0f06
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0fa2
code_0f06:
			dup     
			ldi      1
			eq?     
			bnt      code_0f21
			pushi    2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_0fa2
code_0f21:
			dup     
			ldi      2
			eq?     
			bnt      code_0f3d
			pushi    4
			lea      @local228
			push    
			pushi    999
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_0fa2
code_0f3d:
			dup     
			ldi      3
			eq?     
			bnt      code_0f59
			pushi    4
			lea      @local234
			push    
			pushi    999
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_0fa2
code_0f59:
			dup     
			ldi      4
			eq?     
			bnt      code_0f79
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65521
			pushi    131
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			jmp      code_0fa2
code_0f79:
			dup     
			ldi      5
			eq?     
			bnt      code_0f92
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0fa2
code_0f92:
			dup     
			ldi      6
			eq?     
			bnt      code_0fa2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0fa2:
			toss    
			ret     
		)
	)
)

(instance day8 of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    1
			pushi    151
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
			bnt      code_1011
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1
			pushi    0
			pushi    1
			callb    proc0_2,  6
			ldi      30
			aTop     ticks
			jmp      code_11d4
code_1011:
			dup     
			ldi      1
			eq?     
			bnt      code_101f
			ldi      30
			aTop     ticks
			jmp      code_11d4
code_101f:
			dup     
			ldi      2
			eq?     
			bnt      code_1077
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lag      global0
			send     10
			pushi    2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    21
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    3
			pushi    1
			pushi    22
			callk    ScriptID,  2
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_11d4
code_1077:
			dup     
			ldi      3
			eq?     
			bnt      code_1093
			pushi    4
			lea      @local239
			push    
			pushi    999
			pushi    16
			pushSelf
			calle    proc851_0,  8
			jmp      code_11d4
code_1093:
			dup     
			ldi      4
			eq?     
			bnt      code_10ae
			pushi    4
			lea      @local245
			push    
			pushi    17
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_11d4
code_10ae:
			dup     
			ldi      5
			eq?     
			bnt      code_10ca
			pushi    4
			lea      @local250
			push    
			pushi    999
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_11d4
code_10ca:
			dup     
			ldi      6
			eq?     
			bnt      code_10e8
			pushi    4
			lea      @local256
			push    
			pushi    999
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_11d4
code_10e8:
			dup     
			ldi      7
			eq?     
			bnt      code_1113
			pushi    #setCycle
			pushi    2
			class    StopWalk
			push    
			pushi    158
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    148
			pushi    250
			pushSelf
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     20
			jmp      code_11d4
code_1113:
			dup     
			ldi      8
			eq?     
			bnt      code_1133
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    65516
			pushi    172
			pushSelf
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     12
			jmp      code_11d4
code_1133:
			dup     
			ldi      9
			eq?     
			bnt      code_115b
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    140
			pushi    250
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     18
			jmp      code_11d4
code_115b:
			dup     
			ldi      10
			eq?     
			bnt      code_117b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    104
			pushi    260
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			jmp      code_11d4
code_117b:
			dup     
			ldi      11
			eq?     
			bnt      code_11d4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    21
			callk    ScriptID,  2
			send     4
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     10
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			lag      global0
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_11d4:
			toss    
			ret     
		)
	)
)

(instance day8Puck of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_1250
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			lofsa    pucksClothes
			send     4
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_1522
code_1250:
			dup     
			ldi      1
			eq?     
			bnt      code_126e
			pushi    4
			lea      @local301
			push    
			pushi    999
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_1522
code_126e:
			dup     
			ldi      2
			eq?     
			bnt      code_12a6
			pushi    #hide
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #dispose
			pushi    0
			lofsa    pucksClothes
			send     4
			pushi    #drawPic
			pushi    4
			pushi    803
			pushi    8
			pushi    1
			pushi    0
			lag      global2
			send     12
			ldi      10
			aTop     cycles
			jmp      code_1522
code_12a6:
			dup     
			ldi      3
			eq?     
			bnt      code_12f7
			pushi    #drawPic
			pushi    4
			pushi    150
			pushi    8
			pushi    1
			pushi    0
			lag      global2
			send     12
			ldi      4
			sag      global126
			ldi      43
			sag      global155
			pushi    0
			callb    proc0_2,  0
			pushi    #show
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #posn
			pushi    2
			pushi    275
			pushi    125
			pushi    194
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
			jmp      code_1522
code_12f7:
			dup     
			ldi      4
			eq?     
			bnt      code_1314
			pushi    5
			pushi    1
			lea      @local315
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1522
code_1314:
			dup     
			ldi      5
			eq?     
			bnt      code_14d8
			pushi    #has
			pushi    1
			pushi    1
			lag      global0
			send     6
			bnt      code_1333
			pushi    #put
			pushi    2
			pushi    1
			pushi    140
			lag      global0
			send     8
code_1333:
			pushi    #has
			pushi    1
			pushi    2
			lag      global0
			send     6
			bnt      code_134b
			pushi    #put
			pushi    2
			pushi    2
			pushi    140
			lag      global0
			send     8
code_134b:
			pushi    #has
			pushi    1
			pushi    3
			lag      global0
			send     6
			bnt      code_1365
			pushi    #put
			pushi    2
			pushi    3
			pushi    140
			lag      global0
			send     8
code_1365:
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bnt      code_137f
			pushi    #put
			pushi    2
			pushi    15
			pushi    140
			lag      global0
			send     8
code_137f:
			pushi    #has
			pushi    1
			pushi    11
			lag      global0
			send     6
			bnt      code_1399
			pushi    #put
			pushi    2
			pushi    11
			pushi    140
			lag      global0
			send     8
code_1399:
			pushi    #has
			pushi    1
			pushi    14
			lag      global0
			send     6
			bnt      code_13b3
			pushi    #put
			pushi    2
			pushi    14
			pushi    140
			lag      global0
			send     8
code_13b3:
			pushi    #has
			pushi    1
			pushi    12
			lag      global0
			send     6
			bnt      code_13cd
			pushi    #put
			pushi    2
			pushi    12
			pushi    140
			lag      global0
			send     8
code_13cd:
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bnt      code_13e7
			pushi    #put
			pushi    2
			pushi    10
			pushi    140
			lag      global0
			send     8
code_13e7:
			pushi    #has
			pushi    1
			pushi    13
			lag      global0
			send     6
			bnt      code_1401
			pushi    #put
			pushi    2
			pushi    13
			pushi    140
			lag      global0
			send     8
code_1401:
			pushi    #has
			pushi    1
			pushi    4
			lag      global0
			send     6
			bnt      code_141b
			pushi    #put
			pushi    2
			pushi    4
			pushi    140
			lag      global0
			send     8
code_141b:
			pushi    #has
			pushi    1
			pushi    5
			lag      global0
			send     6
			bnt      code_1435
			pushi    #put
			pushi    2
			pushi    5
			pushi    140
			lag      global0
			send     8
code_1435:
			pushi    #has
			pushi    1
			pushi    6
			lag      global0
			send     6
			bnt      code_144f
			pushi    #put
			pushi    2
			pushi    6
			pushi    140
			lag      global0
			send     8
code_144f:
			pushi    #has
			pushi    1
			pushi    16
			lag      global0
			send     6
			bnt      code_1469
			pushi    #put
			pushi    2
			pushi    16
			pushi    140
			lag      global0
			send     8
code_1469:
			pushi    #has
			pushi    1
			pushi    18
			lag      global0
			send     6
			bnt      code_1483
			pushi    #put
			pushi    2
			pushi    18
			pushi    140
			lag      global0
			send     8
code_1483:
			pushi    #has
			pushi    1
			pushi    7
			lag      global0
			send     6
			bnt      code_149d
			pushi    #put
			pushi    2
			pushi    7
			pushi    140
			lag      global0
			send     8
code_149d:
			pushi    #has
			pushi    1
			pushi    8
			lag      global0
			send     6
			bnt      code_14b7
			pushi    #put
			pushi    2
			pushi    8
			pushi    140
			lag      global0
			send     8
code_14b7:
			pushi    #has
			pushi    1
			pushi    9
			lag      global0
			send     6
			bnt      code_14d1
			pushi    #put
			pushi    2
			pushi    9
			pushi    140
			lag      global0
			send     8
code_14d1:
			ldi      6
			aTop     ticks
			jmp      code_1522
code_14d8:
			dup     
			ldi      6
			eq?     
			bnt      code_14f9
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    135
			pushi    250
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_1522
code_14f9:
			dup     
			ldi      7
			eq?     
			bnt      code_1512
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_1522
code_1512:
			dup     
			ldi      8
			eq?     
			bnt      code_1522
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1522:
			toss    
			ret     
		)
	)
)

(instance day9Will of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_15a1
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_160c
code_15a1:
			dup     
			ldi      1
			eq?     
			bnt      code_15c3
			pushi    7
			pushi    2
			lea      @local321
			push    
			pushi    999
			pushi    0
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_160c
code_15c3:
			dup     
			ldi      2
			eq?     
			bnt      code_15e3
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    110
			pushi    245
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_160c
code_15e3:
			dup     
			ldi      3
			eq?     
			bnt      code_15fc
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			ldi      6
			aTop     ticks
			jmp      code_160c
code_15fc:
			dup     
			ldi      4
			eq?     
			bnt      code_160c
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
code_160c:
			toss    
			ret     
		)
	)
)

(instance day10 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_167f
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local262
			push    
			pushi    2
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_168f
code_167f:
			dup     
			ldi      1
			eq?     
			bnt      code_168f
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_168f:
			toss    
			ret     
		)
	)
)

(instance day11 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_1710
			pushi    0
			callb    proc0_3,  0
			pushi    #cycleSpeed
			pushi    1
			pushi    0
			pushi    56
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    216
			pushi    105
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     24
			jmp      code_17e0
code_1710:
			dup     
			ldi      1
			eq?     
			bnt      code_172b
			pushi    2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_17e0
code_172b:
			dup     
			ldi      2
			eq?     
			bnt      code_1748
			pushi    4
			lea      @local274
			push    
			pushi    3
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_17e0
code_1748:
			dup     
			ldi      3
			eq?     
			bnt      code_1773
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    56
			pushi    1
			pushi    6
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    196
			pushi    90
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     24
			jmp      code_17e0
code_1773:
			dup     
			ldi      4
			eq?     
			bnt      code_17a7
			pushi    #view
			pushi    1
			pushi    143
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    5
			pushi    284
			pushi    2
			pushi    194
			pushi    87
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     34
			jmp      code_17e0
code_17a7:
			dup     
			ldi      5
			eq?     
			bnt      code_17c4
			pushi    4
			lea      @local280
			push    
			pushi    3
			pushi    15
			pushSelf
			calle    proc851_0,  8
			jmp      code_17e0
code_17c4:
			dup     
			ldi      6
			eq?     
			bnt      code_17e0
			pushi    #signal
			pushi    1
			pushi    1
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_17e0:
			toss    
			ret     
		)
	)
)

(instance day12 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_185f
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_18ca
code_185f:
			dup     
			ldi      1
			eq?     
			bnt      code_1881
			pushi    7
			pushi    2
			lea      @local331
			push    
			pushi    999
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_18ca
code_1881:
			dup     
			ldi      2
			eq?     
			bnt      code_18a1
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    110
			pushi    250
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_18ca
code_18a1:
			dup     
			ldi      3
			eq?     
			bnt      code_18ba
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			ldi      6
			aTop     ticks
			jmp      code_18ca
code_18ba:
			dup     
			ldi      4
			eq?     
			bnt      code_18ca
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
code_18ca:
			toss    
			ret     
		)
	)
)

(instance day13 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    151
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
			bnt      code_1949
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_19df
code_1949:
			dup     
			ldi      1
			eq?     
			bnt      code_1965
			pushi    4
			lea      @local287
			push    
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_19df
code_1965:
			dup     
			ldi      2
			eq?     
			bnt      code_1988
			pushi    9
			pushi    3
			lea      @local291
			push    
			pushi    1
			pushi    0
			pushi    2
			pushi    0
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_19df
code_1988:
			dup     
			ldi      3
			eq?     
			bnt      code_19b6
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    240
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_19df
code_19b6:
			dup     
			ldi      4
			eq?     
			bnt      code_19cf
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_19df
code_19cf:
			dup     
			ldi      5
			eq?     
			bnt      code_19df
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_19df:
			toss    
			ret     
		)
	)
)
