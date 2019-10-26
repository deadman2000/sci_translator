;;; Sierra Script 1.0 - (do not remove this comment)
(script# 28)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n958)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	aMonk 0
	monkScript 1
)

(local
	local0
	local1
	[local2 17] = [-1 5810 26 0 0 0 0 0 0 0 4 6 2 7 5 1 3]
	local19
	local20
	local21
	[local22 10] = [1028 28 1 2 1 2 1 2 1]
	[local32 5] = [1028 35 1 2]
	[local37 4] = [1028 37 1]
	[local41 6] = [1028 1 2 1 2]
	[local47 5] = [1028 4 2 1]
	[local52 5] = [1028 6 2 1]
	[local57 7] = [1028 8 1 2 1 2]
	[local64 5] = [1028 12 1 2]
	[local69 5] = [1028 14 1 2]
	[local74 11] = [1028 16 2 1 1 2 1 2 1 2]
	[local85 4] = [1028 24 1]
	[local89 6] = [1028 25 2 1 2]
	[local95 4] = [1028 51 2]
	[local99 7] = [1028 43 2 2 1 2]
	[local106 5] = [1028 47 1 2]
	[local111 5] = [1028 49 1 2]
	[local116 4] = [1028 42 1]
	[local120 5] = [1028 38 1 2]
	[local125 5] = [1028 40 1 1]
	[local130 5] = [1028 52 2 1]
	[local135 8] = [1028 54 2 1 2 1 2]
	[local143 6] = [1028 61 1 1 2]
	[local149 4] = [1028 64 1]
	[local153 4] = [1028 65 1]
	[local157 6] = [1028 66 1 1 2]
)
(instance aMonk of Actor
	(properties
		description 5821
		view 129
		signal $2000
	)
	
	(method (init)
		(asm
			pushi    3
			pushi    132
			pushi    153
			pushi    152
			calle    proc958_0,  6
			pushi    #number
			pushi    1
			pushi    125
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #init
			pushi    0
			lofsa    monkPoly
			send     4
			lsg      global130
			ldi      5
			eq?     
			bnt      code_004e
			pushi    1
			pushi    133
			callb    proc0_6,  2
			jmp      code_0055
code_004e:
			pushi    1
			pushi    134
			callb    proc0_6,  2
code_0055:
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    monkPoly
			send     6
			bnt      code_008a
			lal      local19
			not     
			bnt      code_008a
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_008a
			ldi      1
			sal      local19
			pushi    #setScript
			pushi    1
			lofsa    assumeThePosition
			push    
			self     6
code_008a:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #notify
			pushi    0
			lag      global2
			send     4
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			self     12
			pushi    #weMeetAgain
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #contains
			pushi    1
			lofsa    monkPoly
			push    
			lag      global32
			send     6
			bnt      code_0285
			pushi    #dispose
			pushi    0
			lofsa    monkPoly
			send     4
code_0285:
			pushi    1
			pushi    169
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    1
			pushi    28
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_00a6
			pushi    2
			pushi    1028
			pushi    0
			calle    proc13_4,  4
			jmp      code_0241
code_00a6:
			dup     
			ldi      5
			eq?     
			bnt      code_00e3
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_00d1
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			lofsa    talkTalkScript
			push    
			lag      global0
			send     6
			jmp      code_0241
code_00d1:
			pushi    3
			lea      @local89
			push    
			pushi    2
			pushi    10
			calle    proc851_0,  6
			jmp      code_0241
code_00e3:
			dup     
			ldi      10
			eq?     
			bnt      code_00f9
			pushi    #setScript
			pushi    1
			lofsa    drawBow
			push    
			lag      global0
			send     6
			jmp      code_0241
code_00f9:
			dup     
			ldi      4
			eq?     
			bnt      code_0217
			pushi    10
			lsp      param2
			pushi    0
			pushi    2
			pushi    14
			pushi    18
			pushi    10
			pushi    4
			pushi    1
			pushi    17
			pushi    16
			calle    proc999_5,  20
			bnt      code_0209
			lsl      local1
			lsp      param2
			dup     
			ldi      2
			eq?     
			bnt      code_012c
			ldi      1
			jmp      code_017e
code_012c:
			dup     
			ldi      14
			eq?     
			bnt      code_0138
			ldi      2
			jmp      code_017e
code_0138:
			dup     
			ldi      18
			eq?     
			bnt      code_0144
			ldi      4
			jmp      code_017e
code_0144:
			dup     
			ldi      10
			eq?     
			bnt      code_0150
			ldi      8
			jmp      code_017e
code_0150:
			dup     
			ldi      4
			eq?     
			bnt      code_015c
			ldi      16
			jmp      code_017e
code_015c:
			dup     
			ldi      1
			eq?     
			bnt      code_0168
			ldi      32
			jmp      code_017e
code_0168:
			dup     
			ldi      17
			eq?     
			bnt      code_0174
			ldi      64
			jmp      code_017e
code_0174:
			dup     
			ldi      16
			eq?     
			bnt      code_017e
			ldi      128
code_017e:
			toss    
			and     
			bnt      code_0190
			pushi    2
			pushi    1028
			pushi    59
			calle    proc13_4,  4
			jmp      code_0241
code_0190:
			lsl      local1
			lsp      param2
			dup     
			ldi      2
			eq?     
			bnt      code_01a0
			ldi      1
			jmp      code_01f2
code_01a0:
			dup     
			ldi      14
			eq?     
			bnt      code_01ac
			ldi      2
			jmp      code_01f2
code_01ac:
			dup     
			ldi      18
			eq?     
			bnt      code_01b8
			ldi      4
			jmp      code_01f2
code_01b8:
			dup     
			ldi      10
			eq?     
			bnt      code_01c4
			ldi      8
			jmp      code_01f2
code_01c4:
			dup     
			ldi      4
			eq?     
			bnt      code_01d0
			ldi      16
			jmp      code_01f2
code_01d0:
			dup     
			ldi      1
			eq?     
			bnt      code_01dc
			ldi      32
			jmp      code_01f2
code_01dc:
			dup     
			ldi      17
			eq?     
			bnt      code_01e8
			ldi      64
			jmp      code_01f2
code_01e8:
			dup     
			ldi      16
			eq?     
			bnt      code_01f2
			ldi      128
code_01f2:
			toss    
			or      
			sal      local1
			pushi    #setScript
			pushi    3
			lofsa    approachMonk
			push    
			pushi    0
			lsp      param2
			lag      global0
			send     10
			jmp      code_0241
code_0209:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0241
code_0217:
			dup     
			ldi      3
			eq?     
			bnt      code_0236
			ldi      1
			sal      local19
			pushi    #setScript
			pushi    3
			lofsa    approachMonk
			push    
			pushi    0
			pushi    999
			lag      global0
			send     10
			jmp      code_0241
code_0236:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0241:
			toss    
			ret     
		)
	)
)

(instance tuckie of Prop
	(properties
		x 187
		y 83
		view 168
		loop 1
		priority 4
		signal $0010
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_03b4
			lsp      param2
			ldi      1
			eq?     
			bnt      code_03b4
			pushi    3
			pushi    1028
			pushi    60
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_03b4:
			ret     
		)
	)
)

(instance monkScript of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			super    TScript,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04b2
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0423
			ldi      235
			sat      temp0
			ldi      50
			sat      temp1
			ldi      205
			sat      temp2
			ldi      70
			sat      temp3
			pushi    #horizon
			pushi    1
			pushi    30
			lag      global2
			send     6
			jmp      code_0435
code_0423:
			ldi      85
			sat      temp0
			ldi      160
			sat      temp1
			ldi      135
			sat      temp2
			ldi      125
			sat      temp3
code_0435:
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_045c
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_0586
code_045c:
			pushi    #contains
			pushi    1
			lofsa    aMonk
			push    
			lag      global5
			send     6
			not     
			bnt      code_0473
			pushi    #init
			pushi    0
			lofsa    aMonk
			send     4
code_0473:
			pushi    284
			pushi    2
			lst      temp0
			lst      temp1
			pushi    162
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0493
			ldi      0
			jmp      code_0495
code_0493:
			ldi      1
code_0495:
			push    
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
			lofsa    aMonk
			send     32
			jmp      code_0586
code_04b2:
			dup     
			ldi      1
			eq?     
			bnt      code_054f
			pushi    289
			pushi    #superClass
			pushi    1
			pushi    162
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    288
			pushi    1
			pushi    0
			lofsa    aMonk
			send     18
			pushi    374
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0517
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    230
			pushi    56
			pushi    230
			pushi    79
			pushi    176
			pushi    79
			pushi    176
			pushi    56
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			jmp      code_053f
code_0517:
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    110
			pushi    113
			pushi    164
			pushi    113
			pushi    164
			pushi    135
			pushi    110
			pushi    135
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
code_053f:
			push    
			lag      global2
			send     6
			pushi    0
			callb    proc0_2,  0
			ldi      18
			aTop     ticks
			jmp      code_0586
code_054f:
			dup     
			ldi      2
			eq?     
			bnt      code_056a
			pushi    4
			lea      @local22
			push    
			pushi    3
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_0586
code_056a:
			dup     
			ldi      3
			eq?     
			bnt      code_0586
			pushi    0
			callb    proc0_4,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0586:
			toss    
			ret     
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0668
			pushi    374
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0623
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    230
			pushi    56
			pushi    230
			pushi    79
			pushi    176
			pushi    79
			pushi    176
			pushi    56
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			jmp      code_064b
code_0623:
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    110
			pushi    113
			pushi    164
			pushi    113
			pushi    164
			pushi    135
			pushi    110
			pushi    135
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
code_064b:
			push    
			lag      global2
			send     6
			pushi    7
			pushi    2
			lea      @local32
			push    
			pushi    3
			pushi    0
			pushi    10
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_069e
code_0668:
			dup     
			ldi      2
			eq?     
			bnt      code_0682
			pushi    5
			pushi    1
			lea      @local37
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_069e
code_0682:
			dup     
			ldi      3
			eq?     
			bnt      code_069e
			pushi    0
			callb    proc0_4,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_069e:
			toss    
			ret     
		)
	)
)

(instance approachMonk of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_07b5
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    0
			callb    proc0_3,  0
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_0780
			pushi    #distanceTo
			pushi    1
			lofsa    aMonk
			push    
			lag      global0
			send     6
			push    
			ldi      25
			gt?     
			bnt      code_0777
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_074d
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      17
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      5
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_07b1
code_074d:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      17
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      5
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_07b1
code_0777:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_07b1
code_0780:
			dup     
			ldi      999
			eq?     
			bnt      code_079e
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lofsa    aMonk
			push    
			pushi    50
			pushSelf
			lag      global0
			send     12
			jmp      code_07b1
code_079e:
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lofsa    aMonk
			push    
			pushi    40
			pushSelf
			lag      global0
			send     12
code_07b1:
			toss    
			jmp      code_08cd
code_07b5:
			dup     
			ldi      1
			eq?     
			bnt      code_07e3
			pTos     register
			ldi      999
			eq?     
			bnt      code_07d4
			pushi    #setScript
			pushi    1
			lofsa    bowAndScrape
			push    
			pToa     client
			send     6
			jmp      code_08cd
code_07d4:
			pushi    3
			lsg      global0
			lofsa    aMonk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_08cd
code_07e3:
			dup     
			ldi      2
			eq?     
			bnt      code_07f1
			ldi      12
			aTop     ticks
			jmp      code_08cd
code_07f1:
			dup     
			ldi      3
			eq?     
			bnt      code_08bd
			pushi    6
			pTos     register
			pushi    2
			pushi    14
			pushi    10
			pushi    18
			pushi    4
			calle    proc999_5,  12
			bnt      code_0823
			pushi    5
			pushi    1
			lea      @local95
			push    
			pushi    10
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_08cd
code_0823:
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_0841
			pushi    5
			pushi    1
			lea      @local116
			push    
			pushi    10
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_08b9
code_0841:
			dup     
			ldi      17
			eq?     
			bnt      code_085b
			pushi    4
			lea      @local130
			push    
			pushi    1
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_08b9
code_085b:
			dup     
			ldi      16
			eq?     
			bnt      code_0875
			pushi    4
			lea      @local135
			push    
			pushi    1
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_08b9
code_0875:
			dup     
			ldi      0
			eq?     
			bnt      code_08b9
			lal      local20
			bnt      code_0894
			pushi    4
			lea      @local111
			push    
			pushi    1
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_08b9
code_0894:
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			sat      temp0
			bnt      code_08b3
			ldi      1
			sal      local20
			pushi    #setScript
			pushi    1
			lofsa    talkBuckScript
			push    
			pToa     client
			send     6
			jmp      code_08b9
code_08b3:
			pushi    #cue
			pushi    0
			self     4
code_08b9:
			toss    
			jmp      code_08cd
code_08bd:
			dup     
			ldi      4
			eq?     
			bnt      code_08cd
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_08cd:
			toss    
			ret     
		)
	)
)

(instance drawBow of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    shootSound
			send     8
			pushi    #dispose
			pushi    0
			&rest    param1
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
			bnt      code_0a5a
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    128
			pushi    4
			pushi    5
			calle    proc958_0,  6
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_09d5
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			gt?     
			bnt      code_09cc
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			lt?     
			bnt      code_09a6
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      50
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0a56
code_09a6:
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      50
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0a56
code_09cc:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0a56
code_09d5:
			dup     
			ldi      3
			eq?     
			bnt      code_0a56
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			lt?     
			bnt      code_0a50
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			lt?     
			bnt      code_0a2a
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      50
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0a56
code_0a2a:
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    aMonk
			send     4
			push    
			ldi      50
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    aMonk
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0a56
code_0a50:
			pushi    #cue
			pushi    0
			self     4
code_0a56:
			toss    
			jmp      code_0c84
code_0a5a:
			dup     
			ldi      1
			eq?     
			bnt      code_0a70
			pushi    3
			lsg      global0
			lofsa    aMonk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0c84
code_0a70:
			dup     
			ldi      2
			eq?     
			bnt      code_0a90
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
			jmp      code_0c84
code_0a90:
			dup     
			ldi      3
			eq?     
			bnt      code_0abe
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			lal      local19
			not     
			bnt      code_0ab5
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    aMonk
			send     8
			jmp      code_0c84
code_0ab5:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0c84
code_0abe:
			dup     
			ldi      4
			eq?     
			bnt      code_0ad8
			pushi    4
			lea      @local120
			push    
			pushi    1
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_0c84
code_0ad8:
			dup     
			ldi      5
			eq?     
			bnt      code_0aee
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0c84
code_0aee:
			dup     
			ldi      6
			eq?     
			bnt      code_0b08
			pushi    5
			pushi    1
			lea      @local125
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0c84
code_0b08:
			dup     
			ldi      7
			eq?     
			bnt      code_0ba9
			pushi    #stop
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #number
			pushi    1
			pushi    127
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			ldi      5
			sag      global126
			pushi    1
			pushi    55
			callb    proc0_6,  2
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0b41
			pushi    1
			pushi    25
			callb    proc0_6,  2
code_0b41:
			ldi      0
			sag      global160
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     10
			pushi    0
			callk    PicNotValid,  0
			sat      temp0
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
			pushi    1
			lst      temp0
			callk    PicNotValid,  2
			ldi      60
			aTop     ticks
			jmp      code_0c84
code_0ba9:
			dup     
			ldi      8
			eq?     
			bnt      code_0bcc
			pushi    #drawPic
			pushi    2
			pushi    150
			pushi    32775
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    whippingBoy
			push    
			pushSelf
			self     8
			jmp      code_0c84
code_0bcc:
			dup     
			ldi      9
			eq?     
			bnt      code_0c25
			pushi    #dispose
			pushi    0
			lofsa    tuckie
			send     4
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    160
			pushi    90
			lag      global0
			send     20
			pushi    #z
			pushi    1
			pushi    38
			pushi    284
			pushi    2
			pushi    160
			pushi    90
			lag      global109
			send     14
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      24
			aTop     ticks
			jmp      code_0c84
code_0c25:
			dup     
			ldi      10
			eq?     
			bnt      code_0c63
			pushi    0
			calle    proc125_2,  0
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    1
			pushi    1
			calle    proc121_0,  2
			pushi    #show
			pushi    0
			lag      global0
			send     4
			pushi    #show
			pushi    0
			lag      global109
			send     4
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      3
			aTop     cycles
			jmp      code_0c84
code_0c63:
			dup     
			ldi      11
			eq?     
			bnt      code_0c84
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    65461
			calle    proc806_1,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    aMonk
			send     4
code_0c84:
			toss    
			ret     
		)
	)
)

(instance bowAndScrape of TScript
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			&rest    param1
			super    TScript,  4
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
			bnt      code_0d03
			pushi    0
			callb    proc0_3,  0
			pushi    #cel
			pushi    0
			lofsa    aMonk
			send     4
			bnt      code_0cf3
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ec5
code_0cf3:
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    aMonk
			send     8
			jmp      code_0ec5
code_0d03:
			dup     
			ldi      1
			eq?     
			bnt      code_0d1e
			pushi    5
			lea      @local41
			push    
			pushi    1
			pushi    10
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0ec5
code_0d1e:
			dup     
			ldi      2
			eq?     
			bnt      code_0d3a
			pushi    5
			lea      @local57
			push    
			pushi    3
			pushi    10
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0ec5
code_0d3a:
			dup     
			ldi      3
			eq?     
			bnt      code_0d55
			pushi    5
			lea      @local64
			push    
			pushi    2
			pushi    10
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0ec5
code_0d55:
			dup     
			ldi      4
			eq?     
			bnt      code_0d71
			pushi    5
			lea      @local69
			push    
			pushi    3
			pushi    10
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0ec5
code_0d71:
			dup     
			ldi      5
			eq?     
			bnt      code_0ddd
			pushi    #number
			pushi    1
			pushi    128
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			ldi      5
			sag      global126
			pushi    1
			pushi    55
			callb    proc0_6,  2
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0da2
			pushi    1
			pushi    25
			callb    proc0_6,  2
code_0da2:
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     10
			pushi    #drawPic
			pushi    2
			pushi    150
			pushi    32775
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    whippingBoy
			push    
			pushSelf
			self     8
			jmp      code_0ec5
code_0ddd:
			dup     
			ldi      6
			eq?     
			bnt      code_0e54
			pushi    #dispose
			pushi    0
			lofsa    tuckie
			send     4
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    160
			pushi    90
			lag      global0
			send     20
			pushi    #z
			pushi    1
			pushi    38
			pushi    284
			pushi    2
			pushi    160
			pushi    90
			lag      global109
			send     14
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callk    PicNotValid,  0
			sat      temp0
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
			pushi    1
			lst      temp0
			callk    PicNotValid,  2
			ldi      24
			aTop     ticks
			jmp      code_0ec5
code_0e54:
			dup     
			ldi      7
			eq?     
			bnt      code_0ea4
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			ldi      0
			sag      global160
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    0
			callb    proc0_2,  0
			pushi    #show
			pushi    0
			lag      global0
			send     4
			pushi    1
			pushi    1
			calle    proc121_0,  2
			pushi    0
			calle    proc125_2,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      3
			aTop     cycles
			jmp      code_0ec5
code_0ea4:
			dup     
			ldi      8
			eq?     
			bnt      code_0ec5
			pushi    1
			pushi    75
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    aMonk
			send     4
code_0ec5:
			toss    
			ret     
		)
	)
)

(instance talkTalkScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f2c
			pushi    0
			callb    proc0_3,  0
			pushi    5
			lea      @local74
			push    
			pushi    1
			pushi    10
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0f4b
code_0f2c:
			dup     
			ldi      1
			eq?     
			bnt      code_0f4b
			pushi    3
			lea      @local85
			push    
			pushi    2
			pushi    10
			calle    proc851_0,  6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0f4b:
			toss    
			ret     
		)
	)
)

(instance talkBuckScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0fae
			pushi    0
			callb    proc0_3,  0
			pushi    5
			lea      @local99
			push    
			pushi    1
			pushi    10
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1004
code_0fae:
			dup     
			ldi      1
			eq?     
			bnt      code_0ff0
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    monkPoly
			send     6
			bnt      code_0fdd
			lal      local19
			not     
			bnt      code_0fdd
			pushi    5
			lea      @local106
			push    
			pushi    2
			pushi    10
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1004
code_0fdd:
			pushi    4
			lea      @local106
			push    
			pushi    2
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_1004
code_0ff0:
			dup     
			ldi      2
			eq?     
			bnt      code_1004
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1004:
			toss    
			ret     
		)
	)
)

(instance monkPoly of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_107d
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    188
			pushi    87
			pushi    117
			pushi    60
			pushi    180
			pushi    37
			pushi    261
			pushi    66
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			jmp      code_10ac
code_107d:
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    169
			pushi    92
			pushi    209
			pushi    123
			pushi    195
			pushi    147
			pushi    70
			pushi    147
			pushi    36
			pushi    103
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
code_10ac:
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

(instance assumeThePosition of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1132
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1182
code_1132:
			dup     
			ldi      1
			eq?     
			bnt      code_1172
			pushi    #distanceTo
			pushi    1
			lofsa    aMonk
			push    
			lag      global0
			send     6
			push    
			ldi      40
			gt?     
			bnt      code_115f
			pushi    4
			lea      @local47
			push    
			pushi    2
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_1182
code_115f:
			pushi    4
			lea      @local52
			push    
			pushi    2
			pushi    10
			pushSelf
			calle    proc851_0,  8
			jmp      code_1182
code_1172:
			dup     
			ldi      2
			eq?     
			bnt      code_1182
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1182:
			toss    
			ret     
		)
	)
)

(instance whippingBoy of Script
	(properties)
	
	(method (doit param1)
		(asm
			lal      local0
			bnt      code_11f3
			pushi    #cel
			pushi    0
			lofsa    tuckie
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_11f3
			pushi    #play
			pushi    0
			lofsa    spankSound
			send     4
			pushi    #loop
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    aMonk
			send     18
			ldi      0
			sal      local0
code_11f3:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    spankSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
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
			bnt      code_1256
			ldi      1
			sal      local0
			pushi    #loop
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    aMonk
			send     4
			push    
			pushi    4
			pushi    1
			pushi    155
			pushi    3
			pushi    1
			pushi    85
			pushi    194
			pushi    0
			lofsa    aMonk
			send     28
			pushi    #init
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tuckie
			send     12
			jmp      code_148d
code_1256:
			dup     
			ldi      1
			eq?     
			bnt      code_1277
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    142
			pushi    2
			lofsa    chopChop
			push    
			pushSelf
			lofsa    aMonk
			send     20
			jmp      code_148d
code_1277:
			dup     
			ldi      2
			eq?     
			bnt      code_129b
			ldi      1
			sal      local0
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    tuckie
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tuckie
			send     8
			jmp      code_148d
code_129b:
			dup     
			ldi      3
			eq?     
			bnt      code_12bc
			pushi    7
			pushi    2
			lea      @local143
			push    
			lea      @local2
			push    
			pushi    2
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_148d
code_12bc:
			dup     
			ldi      4
			eq?     
			bnt      code_12ca
			ldi      60
			aTop     ticks
			jmp      code_148d
code_12ca:
			dup     
			ldi      5
			eq?     
			bnt      code_12eb
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    142
			pushi    2
			lofsa    chopChop
			push    
			pushSelf
			lofsa    aMonk
			send     20
			jmp      code_148d
code_12eb:
			dup     
			ldi      6
			eq?     
			bnt      code_1319
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    317
			pushi    137
			pushi    194
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    240
			pushi    120
			pushSelf
			lag      global0
			send     30
			jmp      code_148d
code_1319:
			dup     
			ldi      7
			eq?     
			bnt      code_132f
			pushi    #setHeading
			pushi    2
			pushi    315
			pushSelf
			lag      global0
			send     8
			jmp      code_148d
code_132f:
			dup     
			ldi      8
			eq?     
			bnt      code_133d
			ldi      30
			aTop     ticks
			jmp      code_148d
code_133d:
			dup     
			ldi      9
			eq?     
			bnt      code_135d
			ldi      1
			sal      local0
			pushi    #setCel
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tuckie
			send     14
			jmp      code_148d
code_135d:
			dup     
			ldi      10
			eq?     
			bnt      code_1379
			pushi    5
			pushi    1
			lea      @local149
			push    
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_148d
code_1379:
			dup     
			ldi      11
			eq?     
			bnt      code_1398
			ldi      1
			sal      local0
			pushi    5
			pushi    1
			lea      @local153
			push    
			pushi    9
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_148d
code_1398:
			dup     
			ldi      12
			eq?     
			bnt      code_13af
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tuckie
			send     8
			jmp      code_148d
code_13af:
			dup     
			ldi      13
			eq?     
			bnt      code_13d0
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    142
			pushi    2
			lofsa    chopChop
			push    
			pushSelf
			lofsa    aMonk
			send     20
			jmp      code_148d
code_13d0:
			dup     
			ldi      14
			eq?     
			bnt      code_13de
			ldi      120
			aTop     ticks
			jmp      code_148d
code_13de:
			dup     
			ldi      15
			eq?     
			bnt      code_13fe
			ldi      1
			sal      local0
			pushi    #setCel
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tuckie
			send     14
			jmp      code_148d
code_13fe:
			dup     
			ldi      16
			eq?     
			bnt      code_1423
			ldi      1
			sal      local0
			pushi    7
			pushi    2
			lea      @local157
			push    
			pushi    15
			pushi    3
			lea      @local2
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_148d
code_1423:
			dup     
			ldi      17
			eq?     
			bnt      code_143a
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    tuckie
			send     8
			jmp      code_148d
code_143a:
			dup     
			ldi      18
			eq?     
			bnt      code_145b
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    142
			pushi    2
			lofsa    chopChop
			push    
			pushSelf
			lofsa    aMonk
			send     20
			jmp      code_148d
code_145b:
			dup     
			ldi      19
			eq?     
			bnt      code_1477
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    123
			pushi    146
			pushSelf
			lag      global0
			send     12
			jmp      code_148d
code_1477:
			dup     
			ldi      20
			eq?     
			bnt      code_148d
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    aMonk
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_148d:
			toss    
			ret     
		)
	)
)

(instance chopChop of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    chopSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
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
			bnt      code_14f6
			ldi      2
			aTop     cycles
			jmp      code_15d0
code_14f6:
			dup     
			ldi      1
			eq?     
			bnt      code_151d
			pushi    #prevSignal
			pushi    0
			lofsa    spankSound
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_1514
			ldi      1
			aTop     cycles
			jmp      code_15d0
code_1514:
			dpToa    state
			ldi      1
			aTop     cycles
			jmp      code_15d0
code_151d:
			dup     
			ldi      2
			eq?     
			bnt      code_1533
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_15d0
code_1533:
			dup     
			ldi      3
			eq?     
			bnt      code_1552
			pushi    #play
			pushi    0
			lofsa    chopSound
			send     4
			pushi    10
			pushi    2
			pushi    7
			pushi    12
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_15d0
code_1552:
			dup     
			ldi      4
			eq?     
			bnt      code_1568
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_15d0
code_1568:
			dup     
			ldi      5
			eq?     
			bnt      code_158f
			pushi    #prevSignal
			pushi    0
			lofsa    spankSound
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_1586
			ldi      1
			aTop     cycles
			jmp      code_15d0
code_1586:
			dpToa    state
			ldi      1
			aTop     cycles
			jmp      code_15d0
code_158f:
			dup     
			ldi      6
			eq?     
			bnt      code_15a5
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_15d0
code_15a5:
			dup     
			ldi      7
			eq?     
			bnt      code_15c4
			pushi    #play
			pushi    0
			lofsa    chopSound
			send     4
			pushi    10
			pushi    2
			pushi    12
			pushi    19
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_15d0
code_15c4:
			dup     
			ldi      8
			eq?     
			bnt      code_15d0
			pushi    #dispose
			pushi    0
			self     4
code_15d0:
			toss    
			ret     
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)

(instance chopSound of Sound
	(properties
		flags $0001
		number 152
	)
)

(instance spankSound of Sound
	(properties
		flags $0001
		number 153
	)
)
