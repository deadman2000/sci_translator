;;; Sierra Script 1.0 - (do not remove this comment)
(script# 704)
(include sci.sh)
(use n000)
(use n013)
(use n945)
(use n992)
(use n999)

(public
	egoDock 0
	cantGoThere 1
	climbGoThere 2
	getOffVines 3
)

(local
	[local0 6] = [0 7 7 7 7 2]
	[local6 6] = [2 4 3 2 4]
	[local12 6] = [146 143 143 143 138 142]
	[local18 6] = [154 144 145 153 148 150]
	local24
)
(instance egoDock of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    704
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
			bnt      code_0057
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      160
			ge?     
			bnt      code_004e
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    110
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_0321
code_004e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0321
code_0057:
			dup     
			ldi      1
			eq?     
			bnt      code_008d
			pushi    45
			pushi    #heading
			pushi    0
			lag      global0
			send     4
			le?     
			bnt      code_007c
			pprev   
			ldi      135
			le?     
			bnt      code_007c
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0321
code_007c:
			pushi    #setHeading
			pushi    1
			pushi    90
			lag      global0
			send     6
			ldi      36
			aTop     ticks
			jmp      code_0321
code_008d:
			dup     
			ldi      2
			eq?     
			bnt      code_00bf
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    62
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    148
			pushi    146
			pushSelf
			lag      global0
			send     36
			jmp      code_0321
code_00bf:
			dup     
			ldi      3
			eq?     
			bnt      code_00cd
			ldi      12
			aTop     ticks
			jmp      code_0321
code_00cd:
			dup     
			ldi      4
			eq?     
			bnt      code_0160
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
			pushi    110
			pushi    124
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    1
			pushi    1
			pushi    285
			pushi    0
			pushi    107
			pushi    0
			pushi    2
			pushi    700
			pushi    3
			callk    ScriptID,  4
			send     46
			pushi    #view
			pushi    1
			pushi    15
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    146
			pushi    154
			pushi    219
			pushi    1
			pushi    12
			lag      global0
			send     32
			pushi    #cel
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    142
			pushi    148
			pushi    219
			pushi    1
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    2
			pushi    700
			pushi    2
			callk    ScriptID,  4
			send     24
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			aTop     ticks
			jmp      code_0321
code_0160:
			dup     
			ldi      5
			eq?     
			bnt      code_0192
			pushi    #loop
			pushi    1
			lal      local24
			lsli     local0
			pushi    7
			pushi    1
			lsli     local6
			pushi    284
			pushi    2
			lsli     local12
			lsli     local18
			lag      global0
			send     20
			+al      local24
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			aTop     ticks
			jmp      code_0321
code_0192:
			dup     
			ldi      6
			eq?     
			bnt      code_01c2
			lsl      local24
			ldi      5
			le?     
			bnt      code_01a8
			pTos     state
			ldi      2
			sub     
			aTop     state
code_01a8:
			lsl      local24
			ldi      3
			eq?     
			bnt      code_01b9
			pushi    #setPri
			pushi    1
			pushi    10
			lag      global0
			send     6
code_01b9:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0321
code_01c2:
			dup     
			ldi      7
			eq?     
			bnt      code_021c
			pushi    #cel
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    142
			pushi    150
			dup     
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     34
			pushi    #cel
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    142
			pushi    150
			pushi    107
			pushi    0
			pushi    219
			pushi    1
			pushi    #cycleSpeed
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    1
			class    End
			push    
			pushi    2
			pushi    700
			pushi    1
			callk    ScriptID,  4
			send     30
			jmp      code_0321
code_021c:
			dup     
			ldi      8
			eq?     
			bnt      code_024d
			pushi    3
			pushi    #superClass
			pushi    #y
			pushi    0
			pushi    2
			pushi    700
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    285
			pushi    0
			pushi    2
			pushi    700
			pushi    1
			callk    ScriptID,  4
			send     10
			ldi      24
			aTop     ticks
			jmp      code_0321
code_024d:
			dup     
			ldi      9
			eq?     
			bnt      code_0289
			pushi    3
			pushi    #superClass
			pushi    #y
			pushi    0
			pushi    2
			pushi    700
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    150
			pushi    1
			class    Beg
			push    
			pushi    2
			pushi    700
			pushi    2
			callk    ScriptID,  4
			send     12
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0321
code_0289:
			dup     
			ldi      10
			eq?     
			bnt      code_02bf
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    700
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    #view
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    132
			pushi    142
			lag      global0
			send     26
			ldi      12
			aTop     ticks
			jmp      code_0321
code_02bf:
			dup     
			ldi      11
			eq?     
			bnt      code_02d9
			pushi    1
			pushi    4
			callb    proc0_2,  2
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			lag      global0
			send     8
			jmp      code_0321
code_02d9:
			dup     
			ldi      12
			eq?     
			bnt      code_02ff
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    122
			pushSelf
			lag      global0
			send     12
			jmp      code_0321
code_02ff:
			dup     
			ldi      13
			eq?     
			bnt      code_0321
			pushi    #setPri
			pushi    1
			pushi    65535
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #notify
			pushi    1
			pushi    2
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0321:
			toss    
			ret     
		)
	)
)

(instance cantGoThere of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    704
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
			bnt      code_038f
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1700
			pushi    13
			pushSelf
			calle    proc13_4,  6
			jmp      code_03ba
code_038f:
			dup     
			ldi      1
			eq?     
			bnt      code_03aa
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    15
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_03ba
code_03aa:
			dup     
			ldi      2
			eq?     
			bnt      code_03ba
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_03ba:
			toss    
			ret     
		)
	)
)

(instance climbGoThere of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    704
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
			bnt      code_0427
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1700
			pushi    23
			pushSelf
			calle    proc13_4,  6
			jmp      code_04c1
code_0427:
			dup     
			ldi      1
			eq?     
			bnt      code_049d
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      130
			le?     
			bnt      code_0461
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
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
			jmp      code_04c1
code_0461:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      170
			ge?     
			bnt      code_0494
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
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
			jmp      code_04c1
code_0494:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_04c1
code_049d:
			dup     
			ldi      2
			eq?     
			bnt      code_04c1
			pushi    #notify
			pushi    1
			pushi    1
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_04c1:
			toss    
			ret     
		)
	)
)

(instance getOffVines of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    704
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
			bnt      code_0542
			pushi    0
			callb    proc0_3,  0
			pushi    #ignoreControl
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    150
			pushi    75
			pushSelf
			lag      global0
			send     24
			jmp      code_0664
code_0542:
			dup     
			ldi      1
			eq?     
			bnt      code_0578
			pushi    #view
			pushi    1
			pushi    708
			pushi    284
			pushi    2
			pushi    140
			pushi    124
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    4
			pushi    302
			pushi    1
			pushi    4
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     40
			jmp      code_0664
code_0578:
			dup     
			ldi      2
			eq?     
			bnt      code_0590
			pushi    #setHeading
			pushi    1
			pushi    90
			lag      global0
			send     6
			ldi      66
			aTop     ticks
			jmp      code_0664
code_0590:
			dup     
			ldi      3
			eq?     
			bnt      code_05ce
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    700
			pushi    4
			callk    ScriptID,  4
			send     4
			pushi    #view
			pushi    1
			pushi    15
			pushi    284
			pushi    2
			pushi    149
			pushi    121
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    5
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     34
			jmp      code_0664
code_05ce:
			dup     
			ldi      4
			eq?     
			bnt      code_05f3
			pushi    #view
			pushi    1
			pushi    15
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_0664
code_05f3:
			dup     
			ldi      5
			eq?     
			bnt      code_063a
			pushi    #setCel
			pushi    1
			pushi    3
			pushi    66
			pushi    1
			pushi    12
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Beg
			push    
			pushi    2
			pushi    700
			pushi    2
			callk    ScriptID,  4
			send     24
			pushi    #message
			pushi    1
			pushi    3
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0664
code_063a:
			dup     
			ldi      6
			eq?     
			bnt      code_0664
			pushi    1
			pushi    34
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    700
			pushi    2
			callk    ScriptID,  4
			send     8
			pushi    0
			callb    proc0_2,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
code_0664:
			toss    
			ret     
		)
	)
)
