;;; Sierra Script 1.0 - (do not remove this comment)
(script# 18)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n806)
(use n851)
(use n930)
(use n945)
(use n958)
(use n961)
(use n992)
(use n998)
(use n999)

(public
	day1 0
	day3 1
	day4 2
	day5 3
	day6A 4
	day6B 5
	day8 6
	day9 7
	day12 8
	setup 9
)

(local
	[local0 2]
	local2
	local3
	[local4 4] = [1018 10 2]
	[local8 4] = [1018 11 2]
	[local12 4] = [1018 12 2]
	[local16 5] = [1018 13 1 2]
	[local21 5] = [1018 15 1 2]
	[local26 5] = [1018 17 1 1]
	[local31 5] = [1018 19 1 2]
)
(instance day1 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global114
			send     12
			pushi    1
			pushi    44
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_02d8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_02d8:
			pushi    #contains
			pushi    1
			lofsa    character2
			push    
			lag      global5
			send     6
			bnt      code_02f1
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character2
			send     8
code_02f1:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     12
			pushi    1
			pushi    18
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
			bnt      code_00a1
			ldi      1
			sal      local2
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {woman}
			push    
			pushi    277
			pushi    1
			pushi    16
			pushi    5
			pushi    1
			pushi    110
			pushi    162
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    325
			pushi    85
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    254
			pushi    98
			pushSelf
			lofsa    character1
			send     54
			ldi      270
			aTop     ticks
			jmp      code_02a2
code_00a1:
			dup     
			ldi      1
			eq?     
			bnt      code_00f0
			pushi    #name
			pushi    1
			lofsa    {flunky}
			push    
			pushi    277
			pushi    1
			pushi    18
			pushi    5
			pushi    1
			pushi    110
			pushi    162
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			pushi    325
			pushi    65
			pushi    308
			pushi    2
			pushi    3
			pushi    2
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    240
			pushi    100
			pushSelf
			lofsa    character2
			send     62
			jmp      code_02a2
code_00f0:
			dup     
			ldi      2
			eq?     
			bnt      code_010e
			ldi      0
			sal      local2
			pushi    #lookStr
			pushi    1
			pushi    17
			pushi    162
			pushi    1
			pushi    1
			lofsa    character1
			send     12
			jmp      code_02a2
code_010e:
			dup     
			ldi      3
			eq?     
			bnt      code_012b
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			lofsa    character2
			send     12
			ldi      6
			aTop     ticks
			jmp      code_02a2
code_012b:
			dup     
			ldi      4
			eq?     
			bnt      code_014b
			pushi    #hide
			pushi    0
			lofsa    character1
			send     4
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    character2
			send     6
			ldi      90
			aTop     ticks
			jmp      code_02a2
code_014b:
			dup     
			ldi      5
			eq?     
			bnt      code_016b
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    character2
			send     18
			jmp      code_02a2
code_016b:
			dup     
			ldi      6
			eq?     
			bnt      code_0186
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    character2
			send     12
			jmp      code_02a2
code_0186:
			dup     
			ldi      7
			eq?     
			bnt      code_01a1
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    character2
			send     12
			jmp      code_02a2
code_01a1:
			dup     
			ldi      8
			eq?     
			bnt      code_01bc
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    character2
			send     12
			jmp      code_02a2
code_01bc:
			dup     
			ldi      9
			eq?     
			bnt      code_01ca
			ldi      60
			aTop     ticks
			jmp      code_02a2
code_01ca:
			dup     
			ldi      10
			eq?     
			bnt      code_01f1
			pushi    150
			pushi    #x
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lofsa    character2
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushSelf
			lofsa    character2
			send     12
			jmp      code_02a2
code_01f1:
			dup     
			ldi      11
			eq?     
			bnt      code_0236
			pushi    #setCel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    character2
			send     4
			push    
			lofsa    character2
			send     6
			pushi    #posn
			pushi    2
			pushi    236
			pushi    105
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    194
			pushi    0
			lofsa    character1
			send     30
			ldi      6
			aTop     ticks
			jmp      code_02a2
code_0236:
			dup     
			ldi      12
			eq?     
			bnt      code_0296
			pushi    #posn
			pushi    2
			pushi    232
			pushi    107
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    40
			pushi    152
			lofsa    character1
			send     18
			pushi    #view
			pushi    1
			pushi    755
			pushi    284
			pushi    2
			pushi    225
			pushi    106
			pushi    162
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    6
			pushi    308
			pushi    2
			pushi    2
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    152
			pushSelf
			lofsa    character2
			send     52
			jmp      code_02a2
code_0296:
			dup     
			ldi      13
			eq?     
			bnt      code_02a2
			pushi    #dispose
			pushi    0
			self     4
code_02a2:
			toss    
			ret     
		)
	)
)

(instance day3 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    49
			callb    proc0_6,  2
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_03f9
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_03f9:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     12
			pushi    1
			pushi    18
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
			bnt      code_03b7
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    2
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {beggar}
			push    
			pushi    277
			pushi    1
			pushi    20
			pushi    5
			pushi    1
			pushi    55
			pushi    162
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    325
			pushi    75
			pushi    219
			pushi    1
			pushi    12
			pushi    56
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    152
			pushSelf
			lofsa    character1
			send     66
			jmp      code_03c3
code_03b7:
			dup     
			ldi      1
			eq?     
			bnt      code_03c3
			pushi    #dispose
			pushi    0
			self     4
code_03c3:
			toss    
			ret     
		)
	)
)

(instance day4 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    1
			pushi    47
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_06de
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_06de:
			pushi    #contains
			pushi    1
			lofsa    character2
			push    
			lag      global5
			send     6
			bnt      code_06f7
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character2
			send     8
code_06f7:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     12
			pushi    1
			pushi    18
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
			bnt      code_04f4
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    3
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {poacher}
			push    
			pushi    277
			pushi    1
			pushi    17
			pushi    5
			pushi    1
			pushi    110
			pushi    162
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    325
			pushi    75
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    256
			pushi    100
			lofsa    character1
			send     52
			pushi    #name
			pushi    1
			lofsa    {flunky}
			push    
			pushi    277
			pushi    1
			pushi    19
			pushi    5
			pushi    1
			pushi    755
			pushi    162
			pushi    1
			pushi    4
			pushi    284
			pushi    2
			pushi    315
			pushi    70
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    240
			pushi    100
			pushSelf
			lofsa    character2
			send     54
			jmp      code_06a8
code_04f4:
			dup     
			ldi      1
			eq?     
			bnt      code_0522
			pushi    #setLoop
			pushi    1
			pushi    4
			lofsa    character1
			send     6
			pushi    #view
			pushi    1
			pushi    110
			pushi    162
			pushi    1
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			lofsa    character2
			send     18
			ldi      6
			aTop     ticks
			jmp      code_06a8
code_0522:
			dup     
			ldi      2
			eq?     
			bnt      code_0542
			pushi    #hide
			pushi    0
			lofsa    character1
			send     4
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    character2
			send     6
			ldi      90
			aTop     ticks
			jmp      code_06a8
code_0542:
			dup     
			ldi      3
			eq?     
			bnt      code_0562
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    character2
			send     18
			jmp      code_06a8
code_0562:
			dup     
			ldi      4
			eq?     
			bnt      code_057d
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    character2
			send     12
			jmp      code_06a8
code_057d:
			dup     
			ldi      5
			eq?     
			bnt      code_0598
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    character2
			send     12
			jmp      code_06a8
code_0598:
			dup     
			ldi      6
			eq?     
			bnt      code_05b3
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    character2
			send     12
			jmp      code_06a8
code_05b3:
			dup     
			ldi      7
			eq?     
			bnt      code_05c1
			ldi      60
			aTop     ticks
			jmp      code_06a8
code_05c1:
			dup     
			ldi      8
			eq?     
			bnt      code_05e8
			pushi    150
			pushi    #x
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lofsa    character2
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushSelf
			lofsa    character2
			send     12
			jmp      code_06a8
code_05e8:
			dup     
			ldi      9
			eq?     
			bnt      code_05f6
			ldi      6
			aTop     ticks
			jmp      code_06a8
code_05f6:
			dup     
			ldi      10
			eq?     
			bnt      code_063c
			pushi    #setCel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    character2
			send     4
			push    
			lofsa    character2
			send     6
			pushi    #posn
			pushi    2
			pushi    236
			pushi    105
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    194
			pushi    0
			lofsa    character1
			send     30
			ldi      6
			aTop     ticks
			jmp      code_06a8
code_063c:
			dup     
			ldi      11
			eq?     
			bnt      code_069c
			pushi    #posn
			pushi    2
			pushi    232
			pushi    107
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    40
			pushi    152
			lofsa    character1
			send     18
			pushi    #view
			pushi    1
			pushi    755
			pushi    284
			pushi    2
			pushi    225
			pushi    106
			pushi    162
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    6
			pushi    308
			pushi    2
			pushi    2
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    142
			pushSelf
			lofsa    character2
			send     52
			jmp      code_06a8
code_069c:
			dup     
			ldi      12
			eq?     
			bnt      code_06a8
			pushi    #dispose
			pushi    0
			self     4
code_06a8:
			toss    
			ret     
		)
	)
)

(instance day5 of Script
	(properties)
	
	(method (doit)
		(asm
			lal      local3
			not     
			bnt      code_077f
			pushi    #distanceTo
			pushi    1
			lofsa    character2
			push    
			lofsa    character1
			send     6
			push    
			ldi      15
			le?     
			bnt      code_077f
			+al      local3
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    character1
			send     6
			pushi    #setMotion
			pushi    1
			pushi    0
			lofsa    character2
			send     6
			jmp      code_07c1
code_077f:
			pushi    0
			lal      local3
			lt?     
			bnt      code_0792
			pprev   
			ldi      25
			lt?     
			bnt      code_0792
			+al      local3
			jmp      code_07c1
code_0792:
			lsl      local3
			ldi      25
			eq?     
			bnt      code_07c1
			+al      local3
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    20
			pushi    152
			lofsa    character1
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    335
			pushi    75
			pushSelf
			lofsa    character2
			send     12
code_07c1:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			eq?     
			bnt      code_08c5
			pushi    #qFight
			pushi    0
			class    Wat
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_08b1
			pushi    #whichChar
			pushi    1
			pushi    4
			pushi    566
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     18
			jmp      code_08c5
code_08b1:
			pushi    #whichChar
			pushi    1
			pushi    5
			pushi    566
			pushi    1
			pushi    1
			pushi    569
			pushi    1
			pushi    1
			class    Wat
			send     18
code_08c5:
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_08f3
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_08f3:
			pushi    #contains
			pushi    1
			lofsa    character2
			push    
			lag      global5
			send     6
			bnt      code_090c
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character2
			send     8
code_090c:
			pushi    1
			pushi    18
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
			bnt      code_086b
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    9
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {fMonk}
			push    
			pushi    277
			pushi    1
			pushi    21
			pushi    5
			pushi    1
			pushi    106
			pushi    162
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    325
			pushi    70
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    20
			pushi    152
			lofsa    character1
			send     52
			pushi    #name
			pushi    1
			lofsa    {aMonk}
			push    
			pushi    277
			pushi    1
			pushi    22
			pushi    5
			pushi    1
			pushi    25
			pushi    162
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			pushi    60
			pushi    152
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    335
			pushi    75
			lofsa    character2
			send     52
			jmp      code_0877
code_086b:
			dup     
			ldi      1
			eq?     
			bnt      code_0877
			pushi    #dispose
			pushi    0
			self     4
code_0877:
			toss    
			ret     
		)
	)
)

(instance day6A of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    566
			pushi    1
			pushi    #heading
			pushi    0
			lofsa    character1
			send     4
			push    
			ldi      180
			lt?     
			bnt      code_0a22
			ldi      1
			jmp      code_0a24
code_0a22:
			ldi      3
code_0a24:
			push    
			pushi    569
			pushi    1
			pushi    #heading
			pushi    0
			lofsa    character1
			send     4
			push    
			ldi      180
			lt?     
			bnt      code_0a3e
			ldi      1
			jmp      code_0a40
code_0a3e:
			ldi      3
code_0a40:
			push    
			class    Wat
			send     12
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_0a73
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_0a73:
			pushi    1
			pushi    18
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09fb
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    5
			class    Wat
			send     6
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			sat      temp4
			bnt      code_099f
			ldi      40
			sat      temp0
			ldi      152
			sat      temp1
			ldi      325
			sat      temp2
			ldi      75
			sat      temp3
			jmp      code_09b1
code_099f:
			ldi      325
			sat      temp0
			ldi      75
			sat      temp1
			ldi      40
			sat      temp2
			ldi      152
			sat      temp3
code_09b1:
			pushi    23
			pushi    1
			lofsa    {aMonk}
			push    
			pushi    277
			pushi    1
			pushi    22
			pushi    5
			pushi    1
			pushi    25
			pushi    162
			pushi    1
			lat      temp4
			bnt      code_09d1
			ldi      6
			jmp      code_09d3
code_09d1:
			ldi      5
code_09d3:
			push    
			pushi    284
			pushi    2
			lst      temp0
			lst      temp1
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp2
			lst      temp3
			pushSelf
			lofsa    character1
			send     54
			jmp      code_0a07
code_09fb:
			dup     
			ldi      1
			eq?     
			bnt      code_0a07
			pushi    #dispose
			pushi    0
			self     4
code_0a07:
			toss    
			ret     
		)
	)
)

(instance day6B of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    566
			pushi    1
			pushi    #heading
			pushi    0
			lofsa    character1
			send     4
			push    
			ldi      180
			lt?     
			bnt      code_0b7d
			ldi      1
			jmp      code_0b7f
code_0b7d:
			ldi      3
code_0b7f:
			push    
			pushi    569
			pushi    1
			pushi    #heading
			pushi    0
			lofsa    character1
			send     4
			push    
			ldi      180
			lt?     
			bnt      code_0b99
			ldi      1
			jmp      code_0b9b
code_0b99:
			ldi      3
code_0b9b:
			push    
			class    Wat
			send     12
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_0bce
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_0bce:
			pushi    1
			pushi    18
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b56
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    4
			class    Wat
			send     6
			ldi      1
			sat      temp4
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			sat      temp4
			bnt      code_0b05
			ldi      40
			sat      temp0
			ldi      152
			sat      temp1
			ldi      325
			sat      temp2
			ldi      75
			sat      temp3
			jmp      code_0b17
code_0b05:
			ldi      325
			sat      temp0
			ldi      75
			sat      temp1
			ldi      40
			sat      temp2
			ldi      152
			sat      temp3
code_0b17:
			pushi    #name
			pushi    1
			lofsa    {fMonk}
			push    
			pushi    277
			pushi    1
			pushi    21
			pushi    5
			pushi    1
			pushi    106
			pushi    162
			pushi    1
			lst      temp4
			pushi    284
			pushi    2
			lst      temp0
			lst      temp1
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp2
			lst      temp3
			pushSelf
			lofsa    character1
			send     54
			jmp      code_0b62
code_0b56:
			dup     
			ldi      1
			eq?     
			bnt      code_0b62
			pushi    #dispose
			pushi    0
			self     4
code_0b62:
			toss    
			ret     
		)
	)
)

(instance day8 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    1
			pushi    135
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_0cbe
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_0cbe:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     12
			pushi    1
			pushi    18
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
			bnt      code_0c7b
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    6
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {puck}
			push    
			pushi    277
			pushi    1
			pushi    23
			pushi    5
			pushi    1
			pushi    53
			pushi    6
			pushi    1
			pushi    5
			pushi    284
			pushi    2
			pushi    325
			pushi    75
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    152
			pushSelf
			lofsa    character1
			send     54
			jmp      code_0c87
code_0c7b:
			dup     
			ldi      1
			eq?     
			bnt      code_0c87
			pushi    #dispose
			pushi    0
			self     4
code_0c87:
			toss    
			ret     
		)
	)
)

(instance day9 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    1
			pushi    28
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #contains
			pushi    1
			lofsa    character1
			push    
			lag      global5
			send     6
			bnt      code_0dbe
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
code_0dbe:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     12
			pushi    1
			pushi    18
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
			bnt      code_0d7c
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    7
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {jeweler}
			push    
			pushi    277
			pushi    1
			pushi    24
			pushi    5
			pushi    1
			pushi    72
			pushi    162
			pushi    1
			pushi    5
			pushi    284
			pushi    2
			pushi    325
			pushi    75
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    152
			pushSelf
			lofsa    character1
			send     54
			jmp      code_0d88
code_0d7c:
			dup     
			ldi      1
			eq?     
			bnt      code_0d88
			pushi    #dispose
			pushi    0
			self     4
code_0d88:
			toss    
			ret     
		)
	)
)

(instance day12 of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global114
			send     12
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    character1
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global10
			send     6
			pushi    #travelDir
			pushi    1
			pushi    3
			class    Wat
			send     6
			pushi    1
			pushi    18
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
			bnt      code_0e77
			pushi    #number
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #whichChar
			pushi    1
			pushi    8
			class    Wat
			send     6
			pushi    #name
			pushi    1
			lofsa    {knight}
			push    
			pushi    277
			pushi    1
			pushi    25
			pushi    5
			pushi    1
			pushi    105
			pushi    7
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    221
			pushi    107
			dup     
			pushi    0
			lofsa    character1
			send     36
			pushi    2
			lofsa    littleJohn
			push    
			lofsa    friarTuck
			push    
			calle    proc806_2,  4
			ldi      60
			aTop     ticks
			jmp      code_0ec6
code_0e77:
			dup     
			ldi      1
			eq?     
			bnt      code_0e94
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    character1
			send     6
			pushi    2
			pushi    30
			pushi    120
			callk    Random,  4
			aTop     ticks
			jmp      code_0ec6
code_0e94:
			dup     
			ldi      2
			eq?     
			bnt      code_0eb2
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    character1
			send     6
			pushi    2
			pushi    60
			pushi    300
			callk    Random,  4
			aTop     ticks
			jmp      code_0ec6
code_0eb2:
			dup     
			ldi      3
			eq?     
			bnt      code_0ec6
			pTos     state
			ldi      3
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_0ec6:
			toss    
			ret     
		)
	)
)

(instance character1 of Actor
	(properties
		yStep 1
		priority 10
		signal $6010
		xStep 2
	)
	
	(method (doit)
		(asm
			pushi    1
			pushi    148
			callb    proc0_5,  2
			bnt      code_0f5a
			pushi    1
			pushi    148
			callb    proc0_7,  2
			pushi    #setStep
			pushi    2
			pushi    4
			pushi    2
			self     8
code_0f5a:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lsg      global130
			ldi      12
			ne?     
			bnt      code_0f7a
			pushi    #setScript
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			class    Wat
			send     6
code_0f7a:
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
			ldi      3
			eq?     
			bnt      code_1079
			pTos     view
			dup     
			ldi      110
			eq?     
			bnt      code_0fb4
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0fa7
			pushi    #whichChar
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_1028
code_0fa7:
			pushi    #whichChar
			pushi    1
			pushi    3
			class    Wat
			send     6
			jmp      code_1028
code_0fb4:
			dup     
			ldi      55
			eq?     
			bnt      code_0fc7
			pushi    #whichChar
			pushi    1
			pushi    2
			class    Wat
			send     6
			jmp      code_1028
code_0fc7:
			dup     
			ldi      106
			eq?     
			bnt      code_0fdb
			pushi    #whichChar
			pushi    1
			pushi    4
			class    Wat
			send     6
			jmp      code_1028
code_0fdb:
			dup     
			ldi      25
			eq?     
			bnt      code_0fef
			pushi    #whichChar
			pushi    1
			pushi    5
			class    Wat
			send     6
			jmp      code_1028
code_0fef:
			dup     
			ldi      53
			eq?     
			bnt      code_1003
			pushi    #whichChar
			pushi    1
			pushi    6
			class    Wat
			send     6
			jmp      code_1028
code_1003:
			dup     
			ldi      72
			eq?     
			bnt      code_1017
			pushi    #whichChar
			pushi    1
			pushi    7
			class    Wat
			send     6
			jmp      code_1028
code_1017:
			dup     
			ldi      105
			eq?     
			bnt      code_1028
			pushi    #whichChar
			pushi    1
			pushi    8
			class    Wat
			send     6
code_1028:
			toss    
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			pushSelf
			pushi    10
			lag      global0
			send     10
			pTos     heading
			ldi      180
			lt?     
			bnt      code_105c
			pushi    #travelDir
			pushi    1
			pushi    1
			pushi    569
			pushi    1
			pushi    1
			pushi    563
			pushi    1
			pushi    3
			class    Wat
			send     18
			ldi      55
			sag      global112
			jmp      code_116c
code_105c:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			pushi    563
			pushi    1
			pushi    5
			class    Wat
			send     18
			ldi      87
			sag      global112
			jmp      code_116c
code_1079:
			dup     
			ldi      5
			eq?     
			bnt      code_10aa
			pushi    #script
			pushi    0
			lag      global2
			send     4
			push    
			lofsa    day5
			eq?     
			bnt      code_109d
			pushi    2
			pushi    1018
			pushi    5
			calle    proc13_4,  4
			jmp      code_116c
code_109d:
			pushi    2
			pushi    1018
			pushi    3
			calle    proc13_4,  4
			jmp      code_116c
code_10aa:
			dup     
			ldi      10
			eq?     
			bnt      code_114d
			pTos     view
			dup     
			ldi      110
			eq?     
			bnt      code_10d7
			lal      local2
			bnt      code_10cb
			pushi    2
			pushi    1018
			pushi    1
			calle    proc13_4,  4
			jmp      code_1149
code_10cb:
			pushi    2
			pushi    1018
			pushi    0
			calle    proc13_4,  4
			jmp      code_1149
code_10d7:
			dup     
			ldi      55
			eq?     
			bnt      code_10ea
			pushi    2
			pushi    1018
			pushi    2
			calle    proc13_4,  4
			jmp      code_1149
code_10ea:
			dup     
			ldi      106
			eq?     
			bnt      code_10fe
			pushi    2
			pushi    1018
			pushi    6
			calle    proc13_4,  4
			jmp      code_1149
code_10fe:
			dup     
			ldi      25
			eq?     
			bnt      code_1111
			pushi    2
			pushi    1018
			pushi    2
			calle    proc13_4,  4
			jmp      code_1149
code_1111:
			dup     
			ldi      53
			eq?     
			bnt      code_1125
			pushi    2
			pushi    1018
			pushi    7
			calle    proc13_4,  4
			jmp      code_1149
code_1125:
			dup     
			ldi      72
			eq?     
			bnt      code_1138
			pushi    2
			pushi    1018
			pushi    2
			calle    proc13_4,  4
			jmp      code_1149
code_1138:
			dup     
			ldi      105
			eq?     
			bnt      code_1149
			pushi    2
			pushi    1018
			pushi    8
			calle    proc13_4,  4
code_1149:
			toss    
			jmp      code_116c
code_114d:
			dup     
			ldi      4
			eq?     
			bnt      code_1161
			pushi    2
			pushi    1018
			pushi    9
			calle    proc13_4,  4
			jmp      code_116c
code_1161:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_116c:
			toss    
			ret     
		)
	)
)

(instance character2 of Actor
	(properties
		yStep 1
		priority 10
		signal $6010
		xStep 2
	)
	
	(method (doit)
		(asm
			pushi    1
			pushi    148
			callb    proc0_5,  2
			bnt      code_1216
			pushi    1
			pushi    148
			callb    proc0_7,  2
			pushi    #setStep
			pushi    2
			pushi    4
			pushi    2
			self     8
code_1216:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_12ba
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			pushSelf
			pushi    10
			lag      global0
			send     10
			pTos     heading
			ldi      180
			lt?     
			bnt      code_1259
			pushi    #travelDir
			pushi    1
			pushi    1
			pushi    569
			pushi    1
			pushi    1
			pushi    563
			pushi    1
			pushi    3
			class    Wat
			send     18
			ldi      55
			sag      global112
			jmp      code_1273
code_1259:
			pushi    #travelDir
			pushi    1
			pushi    3
			pushi    569
			pushi    1
			pushi    3
			pushi    563
			pushi    1
			pushi    5
			class    Wat
			send     18
			ldi      87
			sag      global112
code_1273:
			pTos     view
			ldi      25
			eq?     
			bnt      code_1288
			pushi    #whichChar
			pushi    1
			pushi    5
			class    Wat
			send     6
			jmp      code_1385
code_1288:
			pTos     view
			ldi      110
			eq?     
			bt       code_1296
			pTos     view
			ldi      755
			eq?     
code_1296:
			bnt      code_1385
			lsg      global130
			ldi      1
			eq?     
			bnt      code_12ad
			pushi    #whichChar
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_1385
code_12ad:
			pushi    #whichChar
			pushi    1
			pushi    3
			class    Wat
			send     6
			jmp      code_1385
code_12ba:
			dup     
			ldi      5
			eq?     
			bnt      code_130e
			pTos     view
			dup     
			ldi      110
			eq?     
			bnt      code_12d7
			pushi    2
			pushi    1018
			pushi    4
			calle    proc13_4,  4
			jmp      code_130a
code_12d7:
			dup     
			ldi      755
			eq?     
			bnt      code_12ec
			pushi    2
			pushi    1018
			pushi    4
			calle    proc13_4,  4
			jmp      code_130a
code_12ec:
			dup     
			ldi      25
			eq?     
			bnt      code_1300
			pushi    2
			pushi    1018
			pushi    5
			calle    proc13_4,  4
			jmp      code_130a
code_1300:
			pushi    2
			pushi    1018
			pushi    3
			calle    proc13_4,  4
code_130a:
			toss    
			jmp      code_1385
code_130e:
			dup     
			ldi      10
			eq?     
			bnt      code_1366
			pTos     view
			dup     
			ldi      110
			eq?     
			bnt      code_132a
			pushi    2
			pushi    1018
			pushi    0
			calle    proc13_4,  4
			jmp      code_1362
code_132a:
			dup     
			ldi      755
			eq?     
			bnt      code_133e
			pushi    2
			pushi    1018
			pushi    0
			calle    proc13_4,  4
			jmp      code_1362
code_133e:
			dup     
			ldi      106
			eq?     
			bnt      code_1352
			pushi    2
			pushi    1018
			pushi    6
			calle    proc13_4,  4
			jmp      code_1362
code_1352:
			dup     
			ldi      25
			eq?     
			bnt      code_1362
			pushi    2
			pushi    1018
			pushi    2
			calle    proc13_4,  4
code_1362:
			toss    
			jmp      code_1385
code_1366:
			dup     
			ldi      4
			eq?     
			bnt      code_137a
			pushi    2
			pushi    1018
			pushi    9
			calle    proc13_4,  4
			jmp      code_1385
code_137a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_1385:
			toss    
			ret     
		)
	)
)

(instance setup of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    1
			pushi    137
			callb    proc0_6,  2
			pushi    1
			pushi    18
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
			bnt      code_144b
			pushi    4
			pushi    128
			pushi    151
			pushi    152
			pushi    153
			calle    proc958_0,  8
			pushi    1
			pushi    19
			callk    ScriptID,  2
			pushi    0
			callb    proc0_3,  0
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_16ba
code_144b:
			dup     
			ldi      1
			eq?     
			bnt      code_1490
			pushi    #stopUpd
			pushi    0
			lag      global0
			send     4
			pushi    #posn
			pushi    2
			pushi    330
			pushi    200
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    152
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    229
			pushi    177
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     38
			jmp      code_16ba
code_1490:
			dup     
			ldi      2
			eq?     
			bnt      code_149e
			ldi      12
			aTop     ticks
			jmp      code_16ba
code_149e:
			dup     
			ldi      3
			eq?     
			bnt      code_14ba
			pushi    5
			lea      @local4
			push    
			pushi    3
			pushi    13
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_16ba
code_14ba:
			dup     
			ldi      4
			eq?     
			bnt      code_14e8
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_14d3
			pushi    #cue
			pushi    0
			self     4
			jmp      code_16ba
code_14d3:
			pushi    5
			lea      @local8
			push    
			pushi    3
			pushi    13
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_16ba
code_14e8:
			dup     
			ldi      5
			eq?     
			bnt      code_1504
			pushi    5
			lea      @local12
			push    
			pushi    3
			pushi    13
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_16ba
code_1504:
			dup     
			ldi      6
			eq?     
			bnt      code_153c
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_1528
			pushi    4
			lea      @local21
			push    
			pushi    3
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_16ba
code_1528:
			pushi    4
			lea      @local16
			push    
			pushi    3
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_16ba
code_153c:
			dup     
			ldi      7
			eq?     
			bnt      code_1586
			pushi    #has
			pushi    1
			pushi    1
			lag      global0
			send     6
			bnt      code_1569
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    330
			pushi    200
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_16ba
code_1569:
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    330
			pushi    200
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     10
			ldi      3
			aTop     seconds
			jmp      code_16ba
code_1586:
			dup     
			ldi      8
			eq?     
			bnt      code_15d3
			pushi    #has
			pushi    1
			pushi    1
			lag      global0
			send     6
			bnt      code_15b0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_16ba
code_15b0:
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     6
			pushi    3
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			ldi      1
			aTop     notKilled
			jmp      code_16ba
code_15d3:
			dup     
			ldi      9
			eq?     
			bnt      code_15e1
			ldi      30
			aTop     ticks
			jmp      code_16ba
code_15e1:
			dup     
			ldi      10
			eq?     
			bnt      code_15fd
			pushi    5
			pushi    1
			lea      @local26
			push    
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_16ba
code_15fd:
			dup     
			ldi      11
			eq?     
			bnt      code_1630
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_16ba
code_1630:
			dup     
			ldi      12
			eq?     
			bnt      code_1649
			pushi    3
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_16ba
code_1649:
			dup     
			ldi      13
			eq?     
			bnt      code_1670
			ldi      1
			aTop     notKilled
			pushi    #get
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    4
			lea      @local31
			push    
			pushi    1
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_16ba
code_1670:
			dup     
			ldi      14
			eq?     
			bnt      code_1691
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    330
			pushi    200
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_16ba
code_1691:
			dup     
			ldi      15
			eq?     
			bnt      code_16ba
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #startUpd
			pushi    0
			pushi    228
			pushi    1
			pushi    45
			lag      global0
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_16ba:
			toss    
			ret     
		)
	)
)

(instance littleJohn of PicView
	(properties
		x 191
		y 111
		lookStr 25
		view 105
		loop 1
	)
)

(instance friarTuck of PicView
	(properties
		x 243
		y 103
		lookStr 25
		view 105
		loop 1
		cel 1
	)
)
