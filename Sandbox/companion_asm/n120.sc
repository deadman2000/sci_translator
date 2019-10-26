;;; Sierra Script 1.0 - (do not remove this comment)
(script# 120)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm120 0
	tree 1
	theStreet 2
	eastSide 3
	westSide 4
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	[local6 5] = [1120 41 1 1]
)
(procedure (localproc_001e)
	(asm
		pushi    #travelSect
		pushi    1
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		class    Wat
		send     6
		pushi    #horizon
		pushi    1
		pushi    30
		lag      global2
		send     6
		ldi      1
		sal      local4
		pushi    #whichChar
		pushi    0
		class    Wat
		send     4
		push    
		dup     
		ldi      1
		eq?     
		bnt      code_0089
		pushi    1
		pushi    29
		callk    ScriptID,  2
		pushi    9
		pushi    128
		pushi    112
		pushi    393
		pushi    792
		pushi    752
		pushi    4
		pushi    5
		pushi    7
		pushi    745
		calle    proc958_0,  18
		pushi    4
		pushi    130
		pushi    969
		pushi    930
		pushi    951
		calle    proc958_0,  8
		jmp      code_022d
code_0089:
		dup     
		ldi      3
		eq?     
		bnt      code_00cc
		pushi    1
		pushi    8
		callk    ScriptID,  2
		pushi    9
		pushi    128
		pushi    113
		pushi    393
		pushi    792
		pushi    752
		pushi    4
		pushi    5
		pushi    7
		pushi    745
		calle    proc958_0,  18
		pushi    4
		pushi    130
		pushi    969
		pushi    930
		pushi    951
		calle    proc958_0,  8
		jmp      code_022d
code_00cc:
		dup     
		ldi      2
		eq?     
		bnt      code_0109
		pushi    1
		pushi    25
		callk    ScriptID,  2
		pushi    4
		pushi    130
		pushi    969
		pushi    930
		pushi    951
		calle    proc958_0,  8
		pushi    7
		pushi    128
		pushi    130
		pushi    131
		pushi    36
		pushi    37
		pushi    7
		pushi    4
		calle    proc958_0,  14
		jmp      code_022d
code_0109:
		dup     
		ldi      6
		eq?     
		bnt      code_0134
		pushi    1
		pushi    24
		callk    ScriptID,  2
		pushi    3
		pushi    128
		pushi    132
		pushi    133
		calle    proc958_0,  6
		pushi    2
		pushi    130
		pushi    930
		callk    Load,  4
		jmp      code_022d
code_0134:
		dup     
		ldi      7
		eq?     
		bnt      code_016a
		pushi    1
		pushi    26
		callk    ScriptID,  2
		pushi    5
		pushi    128
		pushi    134
		pushi    30
		pushi    135
		pushi    7
		calle    proc958_0,  10
		pushi    3
		pushi    130
		pushi    951
		pushi    969
		calle    proc958_0,  6
		jmp      code_022d
code_016a:
		dup     
		ldi      4
		eq?     
		bnt      code_01ab
		pushi    1
		pushi    27
		callk    ScriptID,  2
		pushi    4
		pushi    130
		pushi    969
		pushi    930
		pushi    951
		calle    proc958_0,  8
		pushi    9
		pushi    128
		pushi    4
		pushi    5
		pushi    15
		pushi    122
		pushi    124
		pushi    128
		pushi    167
		pushi    42
		calle    proc958_0,  18
		jmp      code_022d
code_01ab:
		dup     
		ldi      5
		eq?     
		bnt      code_01dd
		pushi    1
		pushi    28
		callk    ScriptID,  2
		pushi    2
		pushi    130
		pushi    930
		callk    Load,  4
		pushi    6
		pushi    128
		pushi    129
		pushi    58
		pushi    147
		pushi    168
		pushi    4
		calle    proc958_0,  12
		jmp      code_022d
code_01dd:
		dup     
		ldi      8
		eq?     
		bnt      code_022d
		pushi    1
		pushi    10
		callk    ScriptID,  2
		pushi    5
		pushi    128
		pushi    125
		pushi    123
		pushi    60
		pushi    792
		calle    proc958_0,  10
		pushi    1
		pushi    20
		callk    ScriptID,  2
		pushi    1
		pushi    19
		callk    ScriptID,  2
		pushi    1
		pushi    23
		callk    ScriptID,  2
		pushi    7
		pushi    128
		pushi    151
		pushi    152
		pushi    160
		pushi    161
		pushi    154
		pushi    155
		calle    proc958_0,  14
code_022d:
		toss    
		ret     
	)
)

(procedure (localproc_022f &tmp temp0 temp1)
	(asm
		pushi    8
		pushi    #whichChar
		pushi    0
		class    Wat
		send     4
		push    
		pushi    1
		pushi    2
		pushi    3
		pushi    5
		pushi    4
		pushi    7
		pushi    6
		calle    proc999_5,  16
		bnt      code_0255
		ldi      0
		sal      local1
code_0255:
		pushi    #whichChar
		pushi    0
		class    Wat
		send     4
		push    
		dup     
		ldi      1
		eq?     
		bnt      code_02bf
		pushi    #travelSect
		pushi    1
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		class    Wat
		send     6
		pushi    #view
		pushi    1
		pushi    752
		pushi    284
		pushi    2
		pushi    205
		pushi    65
		pushi    162
		pushi    1
		pushi    1
		pushi    288
		pushi    1
		pushi    5
		pushi    107
		pushi    0
		pushi    2
		pushi    29
		pushi    0
		callk    ScriptID,  4
		send     30
		pushi    #posn
		pushi    2
		pushi    197
		pushi    73
		pushi    162
		pushi    1
		pushi    3
		pushi    288
		pushi    1
		pushi    0
		pushi    107
		pushi    0
		pushi    2
		pushi    29
		pushi    1
		callk    ScriptID,  4
		send     24
		jmp      code_046f
code_02bf:
		dup     
		ldi      2
		eq?     
		bnt      code_02e7
		pushi    #posn
		pushi    2
		pushi    205
		pushi    70
		pushi    6
		pushi    1
		pushi    2
		pushi    7
		pushi    1
		pushi    5
		pushi    107
		pushi    0
		pushi    2
		pushi    25
		pushi    0
		callk    ScriptID,  4
		send     24
		jmp      code_046f
code_02e7:
		dup     
		ldi      3
		eq?     
		bnt      code_0337
		pushi    #view
		pushi    1
		pushi    752
		pushi    284
		pushi    2
		pushi    207
		pushi    66
		pushi    162
		pushi    1
		pushi    1
		pushi    288
		pushi    1
		pushi    5
		pushi    107
		pushi    0
		pushi    2
		pushi    8
		pushi    0
		callk    ScriptID,  4
		send     30
		pushi    #posn
		pushi    2
		pushi    205
		pushi    74
		pushi    162
		pushi    1
		pushi    4
		pushi    288
		pushi    1
		pushi    0
		pushi    107
		pushi    0
		pushi    2
		pushi    8
		pushi    1
		callk    ScriptID,  4
		send     24
		jmp      code_046f
code_0337:
		dup     
		ldi      5
		eq?     
		bnt      code_0392
		pushi    #travelDir
		pushi    0
		class    Wat
		send     4
		push    
		ldi      1
		eq?     
		bnt      code_0370
		pushi    #posn
		pushi    2
		pushi    135
		pushi    125
		pushi    162
		pushi    1
		pushi    3
		pushi    288
		pushi    1
		pushi    0
		pushi    107
		pushi    0
		pushi    2
		pushi    28
		pushi    0
		callk    ScriptID,  4
		send     24
		jmp      code_046f
code_0370:
		pushi    #posn
		pushi    2
		pushi    205
		pushi    70
		pushi    162
		pushi    1
		pushi    2
		pushi    288
		pushi    1
		pushi    0
		pushi    107
		pushi    0
		pushi    2
		pushi    28
		pushi    0
		callk    ScriptID,  4
		send     24
		jmp      code_046f
code_0392:
		dup     
		ldi      4
		eq?     
		bnt      code_0404
		pushi    #travelDir
		pushi    0
		class    Wat
		send     4
		push    
		ldi      1
		eq?     
		bnt      code_03d6
		pushi    #posn
		pushi    2
		pushi    135
		pushi    125
		pushi    162
		pushi    1
		pushi    6
		pushi    288
		pushi    1
		pushi    0
		pushi    219
		pushi    1
		pushi    60
		pushi    289
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		pushi    2
		pushi    27
		pushi    0
		callk    ScriptID,  4
		send     36
		jmp      code_046f
code_03d6:
		pushi    #posn
		pushi    2
		pushi    205
		pushi    70
		pushi    162
		pushi    1
		pushi    4
		pushi    288
		pushi    1
		pushi    0
		pushi    219
		pushi    1
		pushi    60
		pushi    289
		pushi    1
		pushi    1
		pushi    107
		pushi    0
		pushi    2
		pushi    27
		pushi    0
		callk    ScriptID,  4
		send     36
		jmp      code_046f
code_0404:
		dup     
		ldi      7
		eq?     
		bnt      code_0438
		pushi    #view
		pushi    1
		pushi    134
		pushi    289
		pushi    1
		pushi    1
		pushi    284
		pushi    2
		pushi    205
		pushi    70
		pushi    6
		pushi    1
		pushi    4
		pushi    7
		pushi    1
		pushi    5
		pushi    107
		pushi    0
		pushi    2
		pushi    26
		pushi    0
		callk    ScriptID,  4
		send     36
		jmp      code_046f
code_0438:
		dup     
		ldi      6
		eq?     
		bnt      code_046f
		pushi    #view
		pushi    1
		pushi    132
		pushi    289
		pushi    1
		pushi    1
		pushi    284
		pushi    2
		pushi    205
		pushi    70
		pushi    6
		pushi    1
		pushi    0
		pushi    7
		pushi    1
		pushi    0
		pushi    107
		pushi    0
		pushi    150
		pushi    2
		class    End
		push    
		pushSelf
		pushi    2
		pushi    24
		pushi    0
		callk    ScriptID,  4
		send     44
code_046f:
		toss    
		pushi    #weMeetAgain
		pushi    0
		class    Wat
		send     4
		push    
		ldi      1
		gt?     
		bnt      code_05a3
		pushi    3
		pushi    128
		pushi    792
		pushi    393
		calle    proc958_0,  6
		pushi    4
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		pushi    1
		pushi    2
		pushi    5
		calle    proc999_5,  8
		bnt      code_04ad
		ldi      86
		jmp      code_04d4
code_04ad:
		pushi    6
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		pushi    3
		pushi    4
		pushi    6
		pushi    7
		pushi    8
		calle    proc999_5,  12
		bnt      code_04d1
		ldi      147
		jmp      code_04d4
code_04d1:
		ldi      297
code_04d4:
		sat      temp0
		pushi    4
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		pushi    1
		pushi    2
		pushi    5
		calle    proc999_5,  8
		bnt      code_04f3
		ldi      44
		jmp      code_0518
code_04f3:
		pushi    6
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		pushi    3
		pushi    4
		pushi    6
		pushi    7
		pushi    8
		calle    proc999_5,  12
		bnt      code_0516
		ldi      39
		jmp      code_0518
code_0516:
		ldi      38
code_0518:
		sat      temp1
		pushi    #whichChar
		pushi    0
		class    Wat
		send     4
		push    
		dup     
		ldi      1
		eq?     
		bnt      code_0564
		pushi    284
		pushi    2
		lst      temp0
		lst      temp1
		pushi    66
		pushi    1
		pushi    4
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		pushi    1
		pushi    2
		pushi    5
		calle    proc999_5,  8
		bnt      code_0552
		ldi      1
		jmp      code_0554
code_0552:
		ldi      65535
code_0554:
		push    
		pushi    107
		pushi    0
		pushi    2
		pushi    29
		pushi    2
		callk    ScriptID,  4
		send     18
		jmp      code_05a2
code_0564:
		dup     
		ldi      3
		eq?     
		bnt      code_05a2
		pushi    284
		pushi    2
		lst      temp0
		lst      temp1
		pushi    66
		pushi    1
		pushi    4
		pushi    #section
		pushi    0
		class    Wat
		send     4
		push    
		pushi    1
		pushi    2
		pushi    5
		calle    proc999_5,  8
		bnt      code_0593
		ldi      1
		jmp      code_0595
code_0593:
		ldi      65535
code_0595:
		push    
		pushi    107
		pushi    0
		pushi    2
		pushi    8
		pushi    2
		callk    ScriptID,  4
		send     18
code_05a2:
		toss    
code_05a3:
		ret     
	)
)

(instance rm120 of Rm
	(properties
		picture 120
		style $000a
		horizon 20
		picAngle 60
		vanishingX 6720
		vanishingY -4000
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    1
			pushi    1
			calle    proc121_0,  2
			lsg      global12
			ldi      220
			eq?     
			bnt      code_0633
			lsg      global108
			dup     
			ldi      3
			eq?     
			bnt      code_05e5
			ldi      1
			sal      local3
			pushi    563
			pushi    #superClass
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    569
			pushi    1
			pushi    1
			class    Wat
			send     12
			jmp      code_0632
code_05e5:
			dup     
			ldi      1
			eq?     
			bnt      code_060e
			ldi      1
			sal      local3
			pushi    563
			pushi    #superClass
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    569
			pushi    1
			pushi    3
			class    Wat
			send     12
			jmp      code_0632
code_060e:
			dup     
			ldi      2
			eq?     
			bnt      code_0622
			pushi    #enterDir
			pushi    1
			pushi    4
			class    Wat
			send     6
			jmp      code_0632
code_0622:
			dup     
			ldi      4
			eq?     
			bnt      code_0632
			pushi    #enterDir
			pushi    1
			pushi    2
			class    Wat
			send     6
code_0632:
			toss    
code_0633:
			pushi    3
			lofsa    eastSide
			push    
			lofsa    westSide
			push    
			lofsa    theStreet
			push    
			calle    proc806_3,  6
			pushi    #script
			pushi    0
			class    Wat
			send     4
			bnt      code_06c4
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      3
			eq?     
			bnt      code_0691
			lsg      global12
			ldi      100
			eq?     
			bnt      code_0674
			pushi    #enterDir
			pushi    1
			pushi    3
			class    Wat
			send     6
code_0674:
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			ge?     
			bnt      code_06c3
			pushi    0
			call     localproc_001e,  0
			jmp      code_06c3
code_0691:
			dup     
			ldi      1
			eq?     
			bnt      code_06c3
			lsg      global12
			ldi      100
			eq?     
			bnt      code_06a9
			pushi    #enterDir
			pushi    1
			pushi    1
			class    Wat
			send     6
code_06a9:
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			le?     
			bnt      code_06c3
			pushi    0
			call     localproc_001e,  0
code_06c3:
			toss    
code_06c4:
			pushi    0
			callb    proc0_2,  0
			pushi    2
			pushi    128
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			callk    Load,  4
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_071b
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_071b
			pushi    1
			pushi    136
			callb    proc0_5,  2
			bnt      code_071b
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    10
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    10
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_07d1
code_071b:
			ldi      0
			sat      temp0
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_074d
			pushi    8
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			push    
			pushi    1
			pushi    3
			pushi    2
			pushi    5
			pushi    4
			pushi    7
			pushi    6
			calle    proc999_5,  16
			bnt      code_074d
			selfID  
			sat      temp0
code_074d:
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_07c3
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			ge?     
			bnt      code_0788
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0788
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			ne?     
code_0788:
			bt       code_07bb
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			le?     
			bnt      code_07c3
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_07c3
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			ne?     
code_07bb:
			bnt      code_07c3
			pushi    0
			call     localproc_022f,  0
code_07c3:
			pushi    #setScript
			pushi    2
			lofsa    walkIn
			push    
			lst      temp0
			lag      global0
			send     8
code_07d1:
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      490
			ne?     
			bt       code_07eb
			pushi    #vol
			pushi    0
			lag      global100
			send     4
			push    
			ldi      127
			lt?     
code_07eb:
			bnt      code_07fb
			pushi    #number
			pushi    1
			pushi    905
			pushi    42
			pushi    0
			lag      global100
			send     10
code_07fb:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_080a
			jmp      code_08b1
code_080a:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0824
			pushi    #setScript
			pushi    1
			lofsa    walkOut
			push    
			lag      global0
			send     6
			jmp      code_08b1
code_0824:
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_084c
			pushi    #horizon
			pushi    0
			lag      global2
			send     4
			push    
			ldi      30
			ge?     
			bnt      code_084c
			pushi    #horizon
			pushi    1
			pushi    20
			lag      global2
			send     6
			jmp      code_08b1
code_084c:
			pushi    #offRoad
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_0880
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    westSide
			send     6
			bt       code_0871
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    eastSide
			send     6
code_0871:
			bnt      code_0880
			pushi    #offRoad
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_08b1
code_0880:
			pushi    #offRoad
			pushi    0
			class    Wat
			send     4
			bnt      code_08b1
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    westSide
			send     6
			bt       code_08a4
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    eastSide
			send     6
code_08a4:
			not     
			bnt      code_08b1
			pushi    #offRoad
			pushi    1
			pushi    0
			class    Wat
			send     6
code_08b1:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #actions
			pushi    1
			pushi    0
			lag      global0
			send     6
			lag      global25
			bnt      code_090a
			pushi    #dispose
			pushi    0
			send     4
code_090a:
			pushi    3
			pushi    0
			pushi    29
			pushi    8
			calle    proc958_0,  6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			bnt      code_08e0
			pushi    #script
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_08e0
			pushi    #setScript
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			class    Wat
			send     6
code_08e0:
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			super    Rm,  6
			ret     
		)
	)
	
	(method (notify)
		(asm
			pushi    #actions
			pushi    1
			lofsa    rm120Actions
			push    
			lag      global0
			send     6
			ret     
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d15
			pushi    #actions
			pushi    1
			lofsa    rm120Actions
			push    
			lag      global0
			send     6
			lal      local4
			bnt      code_09ba
			ldi      225
			sat      temp0
			ldi      60
			sat      temp1
			ldi      205
			sat      temp4
			ldi      75
			sat      temp5
			ldi      110
			sat      temp2
			ldi      130
			sat      temp3
			ldi      140
			sat      temp6
			ldi      115
			sat      temp7
			jmp      code_09de
code_09ba:
			ldi      286
			sat      temp0
			ldi      65534
			sat      temp1
			ldi      230
			sat      temp4
			ldi      55
			sat      temp5
			ldi      65522
			sat      temp2
			ldi      237
			sat      temp3
			ldi      40
			sat      temp6
			ldi      183
			sat      temp7
code_09de:
			lal      local2
			bnt      code_0a05
			pushi    1
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			push    
			callk    IsObject,  2
			bnt      code_0a05
			ldi      140
			sat      temp6
			ldi      120
			sat      temp7
			ldi      190
			sat      temp4
			ldi      85
			sat      temp5
code_0a05:
			pushi    0
			callb    proc0_3,  0
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a3c
			pushi    #posn
			pushi    2
			pushi    330
			pushi    200
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    230
			pushi    170
			pushSelf
			lag      global0
			send     24
			jmp      code_0b7f
code_0a3c:
			dup     
			ldi      4
			eq?     
			bnt      code_0aa9
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			eq?     
			bnt      code_0a86
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0a86
			pushi    #posn
			pushi    2
			pushi    65521
			pushi    145
			pushi    6
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    100
			pushi    145
			pushSelf
			lag      global0
			send     30
			jmp      code_0b7f
code_0a86:
			pushi    #posn
			pushi    2
			pushi    65521
			pushi    85
			pushi    6
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    39
			pushi    85
			pushSelf
			lag      global0
			send     30
			jmp      code_0b7f
code_0aa9:
			dup     
			ldi      1
			eq?     
			bnt      code_0afd
			lal      local3
			bnt      code_0ad9
			ldi      0
			sal      local3
			pushi    #posn
			pushi    2
			pushi    65521
			pushi    28
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    168
			pushi    51
			pushSelf
			lag      global0
			send     24
			jmp      code_0b7f
code_0ad9:
			pushi    #posn
			pushi    2
			lst      temp0
			lst      temp1
			pushi    6
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp4
			lst      temp5
			pushSelf
			lag      global0
			send     30
			jmp      code_0b7f
code_0afd:
			dup     
			ldi      2
			eq?     
			bnt      code_0b2b
			pushi    #posn
			pushi    2
			pushi    330
			pushi    177
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    295
			pushi    177
			pushSelf
			lag      global0
			send     30
			jmp      code_0b7f
code_0b2b:
			dup     
			ldi      3
			eq?     
			bnt      code_0b7f
			lal      local3
			bnt      code_0b5e
			ldi      0
			sal      local3
			pushi    #posn
			pushi    2
			pushi    330
			pushi    200
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    230
			pushi    170
			pushSelf
			lag      global0
			send     24
			jmp      code_0b7f
code_0b5e:
			pushi    #loop
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			lst      temp2
			lst      temp3
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp6
			lst      temp7
			pushSelf
			lag      global0
			send     30
code_0b7f:
			toss    
			lal      local4
			bnt      code_0cb8
			ldi      0
			sal      local4
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0bbd
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    29
			pushi    1
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    29
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0cb7
code_0bbd:
			dup     
			ldi      3
			eq?     
			bnt      code_0be8
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    8
			pushi    1
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    8
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0cb7
code_0be8:
			dup     
			ldi      2
			eq?     
			bnt      code_0c12
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    25
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    25
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0cb7
code_0c12:
			dup     
			ldi      6
			eq?     
			bnt      code_0c3c
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    24
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    24
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0cb7
code_0c3c:
			dup     
			ldi      7
			eq?     
			bnt      code_0c66
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    26
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    26
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0cb7
code_0c66:
			dup     
			ldi      4
			eq?     
			bnt      code_0c90
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    27
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    27
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_0cb7
code_0c90:
			dup     
			ldi      5
			eq?     
			bnt      code_0cb7
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    28
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    28
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
code_0cb7:
			toss    
code_0cb8:
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_0cf6
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_0cf6
			pushi    #posn
			pushi    2
			pushi    335
			pushi    125
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    250
			pushi    125
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     30
code_0cf6:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0d83
			lsg      global155
			ldi      20
			ge?     
			bnt      code_0d83
			pushi    #setScript
			pushi    1
			lofsa    toTheBattle
			push    
			pToa     client
			send     6
			jmp      code_0d83
code_0d15:
			dup     
			ldi      1
			eq?     
			bnt      code_0d77
			pushi    0
			callb    proc0_2,  0
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_0d5a
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_0d5a
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    10
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    10
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0d83
code_0d5a:
			pushi    1
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			push    
			callk    IsObject,  2
			not     
			bnt      code_0d6f
			pushi    0
			callb    proc0_4,  0
code_0d6f:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0d83
code_0d77:
			dup     
			ldi      2
			eq?     
			bnt      code_0d83
			pushi    #dispose
			pushi    0
			self     4
code_0d83:
			toss    
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f28
			pushi    0
			callb    proc0_3,  0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			aTop     register
			pushi    #enterDir
			pushi    1
			pushi    0
			class    Wat
			send     6
			pTos     register
			dup     
			ldi      2
			eq?     
			bnt      code_0e12
			pushi    283
			pushi    #x
			class    PolyPath
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
			jmp      code_0f24
code_0e12:
			dup     
			ldi      3
			eq?     
			bnt      code_0e54
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			sub     
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
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0f24
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_0f24
			+ag      global155
			jmp      code_0f24
code_0e54:
			dup     
			ldi      4
			eq?     
			bnt      code_0eba
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      145
			gt?     
			bnt      code_0e96
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			sub     
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
			ldi      3
			aTop     register
			jmp      code_0f24
code_0e96:
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
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
			jmp      code_0f24
code_0eba:
			dup     
			ldi      1
			eq?     
			bnt      code_0f24
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      170
			lt?     
			bnt      code_0ef1
			ldi      4
			aTop     register
			pushi    283
			push    
			class    PolyPath
			push    
			pushi    65521
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0f24
code_0ef1:
			pushi    300
			pushi    #superClass
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      40
			add     
			push    
			pushi    65534
			pushSelf
			lag      global0
			send     18
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0f24
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_0f24
			+ag      global155
code_0f24:
			toss    
			jmp      code_16b9
code_0f28:
			dup     
			ldi      1
			eq?     
			bnt      code_1386
			lal      local5
			bnt      code_0f76
			ldi      0
			sal      local5
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    10
			pushi    0
			callk    ScriptID,  4
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    10
			pushi    4
			callk    ScriptID,  4
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    10
			pushi    2
			callk    ScriptID,  4
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			pushi    2
			pushi    10
			pushi    3
			callk    ScriptID,  4
			send     8
code_0f76:
			pTos     register
			dup     
			ldi      2
			eq?     
			bnt      code_1066
			lsg      global130
			ldi      12
			eq?     
			bnt      code_0f8d
			pushi    1
			pushi    27
			callb    proc0_5,  2
code_0f8d:
			bt       code_0fa7
			lsg      global130
			ldi      4
			eq?     
			bnt      code_0fb8
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_0fb8
			pushi    1
			pushi    47
			callb    proc0_5,  2
code_0fa7:
			bnt      code_0fb8
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_1382
code_0fb8:
			pushi    1
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			push    
			callk    IsObject,  2
			bnt      code_0fe3
			pushi    #signal
			pushi    0
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_0fe3
			pushi    1
			pushi    70
			callb    proc0_6,  2
code_0fe3:
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_1054
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			bnt      code_1047
			pushi    142
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			pushi    559
			pushi    1
			pushi    1
			pushi    565
			pushi    1
			pushi    0
			pushi    567
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1036
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			jmp      code_1042
code_1036:
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			sub     
code_1042:
			push    
			class    Wat
			send     24
code_1047:
			pushi    #newRoom
			pushi    1
			pushi    110
			lag      global2
			send     6
			jmp      code_1382
code_1054:
			ldi      1
			sag      global116
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
			jmp      code_1382
code_1066:
			dup     
			ldi      4
			eq?     
			bnt      code_10df
			lsg      global130
			ldi      12
			eq?     
			bnt      code_107b
			pushi    1
			pushi    27
			callb    proc0_5,  2
code_107b:
			bt       code_1095
			lsg      global130
			ldi      4
			eq?     
			bnt      code_10a6
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_10a6
			pushi    1
			pushi    47
			callb    proc0_5,  2
code_1095:
			bnt      code_10a6
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_1382
code_10a6:
			pushi    1
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			push    
			callk    IsObject,  2
			bnt      code_10d1
			pushi    #signal
			pushi    0
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			send     4
			push    
			ldi      32
			and     
			not     
			bnt      code_10d1
			pushi    1
			pushi    70
			callb    proc0_6,  2
code_10d1:
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
			jmp      code_1382
code_10df:
			dup     
			ldi      1
			eq?     
			bnt      code_1232
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			le?     
			bnt      code_113b
			lsg      global130
			ldi      12
			eq?     
			bnt      code_1103
			pushi    1
			pushi    27
			callb    proc0_5,  2
code_1103:
			bt       code_111d
			lsg      global130
			ldi      4
			eq?     
			bnt      code_112e
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_112e
			pushi    1
			pushi    47
			callb    proc0_5,  2
code_111d:
			bnt      code_112e
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_121a
code_112e:
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_121a
code_113b:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_115e
			pushi    #has
			pushi    1
			pushi    9
			lag      global0
			send     6
			bnt      code_115e
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_121a
code_115e:
			pushi    1
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			push    
			callk    IsObject,  2
			bnt      code_11ce
			pushi    #dispose
			pushi    0
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			send     4
			pushi    #charObj
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			sal      local1
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			sal      local2
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_11ce
			pushi    567
			pushi    #superClass
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    142
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			pushi    559
			pushi    1
			pushi    1
			class    Wat
			send     18
code_11ce:
			pushi    7
			lsg      global112
			pushi    39
			pushi    40
			pushi    54
			pushi    55
			pushi    101
			pushi    102
			calle    proc999_5,  14
			bnt      code_11f1
			lsg      global112
			ldi      15
			sub     
			sag      global112
			jmp      code_11f8
code_11f1:
			lsg      global112
			ldi      16
			sub     
			sag      global112
code_11f8:
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
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
			ldi      2
			aTop     cycles
code_121a:
			pushi    563
			pushi    #superClass
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			sub     
			push    
			class    Wat
			send     6
			jmp      code_1382
code_1232:
			dup     
			ldi      3
			eq?     
			bnt      code_1382
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			ge?     
			bnt      code_128e
			lsg      global130
			ldi      12
			eq?     
			bnt      code_1256
			pushi    1
			pushi    27
			callb    proc0_5,  2
code_1256:
			bt       code_1270
			lsg      global130
			ldi      4
			eq?     
			bnt      code_1281
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_1281
			pushi    1
			pushi    47
			callb    proc0_5,  2
code_1270:
			bnt      code_1281
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_136d
code_1281:
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_136d
code_128e:
			lsg      global130
			ldi      12
			eq?     
			bnt      code_12b1
			pushi    #has
			pushi    1
			pushi    9
			lag      global0
			send     6
			bnt      code_12b1
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_136d
code_12b1:
			pushi    1
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			push    
			callk    IsObject,  2
			bnt      code_1321
			pushi    #dispose
			pushi    0
			pushi    #charObj
			pushi    0
			class    Wat
			send     4
			send     4
			pushi    #charObj
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			sal      local1
			pushi    #whichChar
			pushi    0
			class    Wat
			send     4
			sal      local2
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_1321
			pushi    567
			pushi    #superClass
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    142
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			pushi    559
			pushi    1
			pushi    1
			class    Wat
			send     18
code_1321:
			pushi    7
			lsg      global112
			pushi    24
			pushi    25
			pushi    39
			pushi    40
			pushi    86
			pushi    87
			calle    proc999_5,  14
			bnt      code_1344
			lsg      global112
			ldi      15
			add     
			sag      global112
			jmp      code_134b
code_1344:
			lsg      global112
			ldi      16
			add     
			sag      global112
code_134b:
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
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
			ldi      2
			aTop     cycles
code_136d:
			pushi    563
			pushi    #superClass
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			push    
			class    Wat
			send     6
code_1382:
			toss    
			jmp      code_16b9
code_1386:
			dup     
			ldi      2
			eq?     
			bnt      code_1503
			pTos     register
			ldi      1
			eq?     
			bnt      code_13a2
			pushi    #enterDir
			pushi    1
			pushi    3
			class    Wat
			send     6
			jmp      code_13ab
code_13a2:
			pushi    #enterDir
			pushi    1
			pushi    1
			class    Wat
			send     6
code_13ab:
			pushi    3
			pTos     register
			pushi    1
			pushi    3
			calle    proc999_5,  6
			bnt      code_14fc
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_1431
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			ge?     
			bnt      code_13f6
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_13f6
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			ne?     
code_13f6:
			bt       code_1429
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			le?     
			bnt      code_1431
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_1431
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			ne?     
code_1429:
			bnt      code_1431
			pushi    0
			call     localproc_022f,  0
code_1431:
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_14db
			pushi    1
			pushi    27
			callb    proc0_5,  2
			bnt      code_14db
			lsg      global130
			ldi      12
			eq?     
			bnt      code_14db
			ldi      1
			sal      local5
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    5
			pushi    284
			pushi    2
			pushi    214
			pushi    91
			pushi    85
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    2
			pushi    10
			pushi    0
			callk    ScriptID,  4
			send     34
			pushi    #posn
			pushi    2
			pushi    125
			pushi    55
			pushi    7
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    2
			pushi    10
			pushi    4
			callk    ScriptID,  4
			send     22
			pushi    #init
			pushi    0
			pushi    2
			pushi    10
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pushi    2
			pushi    10
			pushi    3
			callk    ScriptID,  4
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			pushi    2
			pushi    10
			pushi    3
			callk    ScriptID,  4
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    107
			pushi    0
			pushi    2
			pushi    10
			pushi    3
			callk    ScriptID,  4
			send     16
code_14db:
			pushi    396
			pushi    2
			pushi    120
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_14ee
			ldi      10
			jmp      code_14f1
code_14ee:
			ldi      32776
code_14f1:
			push    
			lag      global2
			send     8
			pushi    1
			pushi    1
			calle    proc121_0,  2
code_14fc:
			ldi      2
			aTop     cycles
			jmp      code_16b9
code_1503:
			dup     
			ldi      3
			eq?     
			bnt      code_16b9
			ldi      0
			sat      temp0
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_16ab
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			ge?     
			bnt      code_1549
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1549
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			ne?     
code_1549:
			bt       code_157c
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			le?     
			bnt      code_16ab
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_16ab
			pushi    #enterDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			ne?     
code_157c:
			bnt      code_16ab
			lsl      local2
			dup     
			ldi      1
			eq?     
			bnt      code_15ac
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    29
			pushi    1
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    29
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_16a6
code_15ac:
			dup     
			ldi      3
			eq?     
			bnt      code_15d7
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    8
			pushi    1
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    8
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_16a6
code_15d7:
			dup     
			ldi      2
			eq?     
			bnt      code_1601
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    25
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    25
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_16a6
code_1601:
			dup     
			ldi      5
			eq?     
			bnt      code_162b
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    28
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    28
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_16a6
code_162b:
			dup     
			ldi      4
			eq?     
			bnt      code_1655
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    27
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    27
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_16a6
code_1655:
			dup     
			ldi      7
			eq?     
			bnt      code_167f
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    26
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    26
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
			jmp      code_16a6
code_167f:
			dup     
			ldi      6
			eq?     
			bnt      code_16a6
			pushi    #charObj
			pushi    1
			pushi    2
			pushi    24
			pushi    0
			callk    ScriptID,  4
			push    
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    24
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
code_16a6:
			toss    
			lag      global2
			sat      temp0
code_16ab:
			pushi    #setScript
			pushi    2
			lofsa    walkIn
			push    
			lst      temp0
			pToa     client
			send     8
code_16b9:
			toss    
			ret     
		)
	)
)

(instance toTheBattle of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1731
			pushi    #posn
			pushi    2
			pushi    335
			pushi    125
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
			pushi    250
			pushi    125
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     32
			jmp      code_17d2
code_1731:
			dup     
			ldi      1
			eq?     
			bnt      code_1759
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
			ldi      3
			aTop     seconds
			jmp      code_17d2
code_1759:
			dup     
			ldi      2
			eq?     
			bnt      code_1774
			pushi    5
			pushi    1
			lea      @local6
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_17d2
code_1774:
			dup     
			ldi      3
			eq?     
			bnt      code_1782
			ldi      3
			aTop     seconds
			jmp      code_17d2
code_1782:
			dup     
			ldi      4
			eq?     
			bnt      code_17a6
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    9
			lag      global2
			send     8
			ldi      100
			aTop     ticks
			jmp      code_17d2
code_17a6:
			dup     
			ldi      5
			eq?     
			bnt      code_17bc
			pushi    3
			pushi    1120
			pushi    43
			pushSelf
			calle    proc13_4,  6
			jmp      code_17d2
code_17bc:
			dup     
			ldi      6
			eq?     
			bnt      code_17d2
			ldi      65
			sag      global146
			pushi    #newRoom
			pushi    1
			pushi    176
			lag      global2
			send     6
code_17d2:
			toss    
			ret     
		)
	)
)

(instance theStreet of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb param2 &tmp temp0)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_1821
			lag      global0
			jmp      code_1834
code_1821:
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_1832
			lag      global2
			jmp      code_1834
code_1832:
			lag      global1
code_1834:
			sat      temp0
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_192d
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_1861
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    0
			lat      temp0
			send     10
			jmp      code_1929
code_1861:
			dup     
			ldi      2
			eq?     
			bnt      code_187a
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    2
			lat      temp0
			send     10
			jmp      code_1929
code_187a:
			dup     
			ldi      3
			eq?     
			bnt      code_1894
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    4
			lat      temp0
			send     10
			jmp      code_1929
code_1894:
			dup     
			ldi      4
			eq?     
			bnt      code_18ae
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    6
			lat      temp0
			send     10
			jmp      code_1929
code_18ae:
			dup     
			ldi      5
			eq?     
			bnt      code_18c4
			pushi    3
			pushi    1120
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_1929
code_18c4:
			dup     
			ldi      6
			eq?     
			bnt      code_18de
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    9
			lat      temp0
			send     10
			jmp      code_1929
code_18de:
			dup     
			ldi      7
			eq?     
			bnt      code_18f8
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    11
			lat      temp0
			send     10
			jmp      code_1929
code_18f8:
			dup     
			ldi      8
			eq?     
			bnt      code_1912
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    13
			lat      temp0
			send     10
			jmp      code_1929
code_1912:
			dup     
			ldi      9
			eq?     
			bnt      code_1929
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    15
			lat      temp0
			send     10
code_1929:
			toss    
			jmp      code_1962
code_192d:
			dup     
			ldi      10
			eq?     
			bnt      code_1957
			pushi    #qFight
			pushi    0
			class    Wat
			send     4
			push    
			ldi      4660
			eq?     
			bnt      code_1949
			ldi      0
			jmp      code_1962
code_1949:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
			jmp      code_1962
code_1957:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_1962:
			toss    
			ret     
		)
	)
)

(instance eastSide of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    6
			pushi    150
			pushi    189
			pushi    319
			pushi    18
			pushi    319
			pushi    189
			pushi    114
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
	
	(method (doVerb theVerb param2 &tmp temp0)
		(asm
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_19e9
			lag      global0
			jmp      code_19fc
code_19e9:
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_19fa
			lag      global2
			jmp      code_19fc
code_19fa:
			lag      global1
code_19fc:
			sat      temp0
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1ada
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_1a25
			pushi    3
			pushi    1120
			pushi    17
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1a25:
			dup     
			ldi      2
			eq?     
			bnt      code_1a3b
			pushi    3
			pushi    1120
			pushi    18
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1a3b:
			dup     
			ldi      3
			eq?     
			bnt      code_1a51
			pushi    3
			pushi    1120
			pushi    19
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1a51:
			dup     
			ldi      4
			eq?     
			bnt      code_1a6b
			pushi    #setScript
			pushi    3
			lofsa    doubleMessage
			push    
			pushi    1
			pushi    20
			lat      temp0
			send     10
			jmp      code_1ad6
code_1a6b:
			dup     
			ldi      5
			eq?     
			bnt      code_1a81
			pushi    3
			pushi    1120
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1a81:
			dup     
			ldi      6
			eq?     
			bnt      code_1a97
			pushi    3
			pushi    1120
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1a97:
			dup     
			ldi      7
			eq?     
			bnt      code_1aad
			pushi    3
			pushi    1120
			pushi    24
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1aad:
			dup     
			ldi      8
			eq?     
			bnt      code_1ac3
			pushi    3
			pushi    1120
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ad6
code_1ac3:
			dup     
			ldi      9
			eq?     
			bnt      code_1ad6
			pushi    3
			pushi    1120
			pushi    26
			pushi    1
			calle    proc13_4,  6
code_1ad6:
			toss    
			jmp      code_1ae5
code_1ada:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_1ae5:
			ret     
		)
	)
)

(instance westSide of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    6
			pushi    0
			pushi    0
			pushi    227
			pushi    0
			pushi    0
			pushi    130
			pushi    114
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_1c3f
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_1b8e
			pushi    3
			pushi    1120
			pushi    27
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1b8e:
			dup     
			ldi      2
			eq?     
			bnt      code_1ba4
			pushi    3
			pushi    1120
			pushi    28
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1ba4:
			dup     
			ldi      3
			eq?     
			bnt      code_1bba
			pushi    3
			pushi    1120
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1bba:
			dup     
			ldi      4
			eq?     
			bnt      code_1bd0
			pushi    3
			pushi    1120
			pushi    30
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1bd0:
			dup     
			ldi      5
			eq?     
			bnt      code_1be6
			pushi    3
			pushi    1120
			pushi    31
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1be6:
			dup     
			ldi      6
			eq?     
			bnt      code_1bfc
			pushi    3
			pushi    1120
			pushi    32
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1bfc:
			dup     
			ldi      7
			eq?     
			bnt      code_1c12
			pushi    3
			pushi    1120
			pushi    33
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1c12:
			dup     
			ldi      8
			eq?     
			bnt      code_1c28
			pushi    3
			pushi    1120
			pushi    34
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3b
code_1c28:
			dup     
			ldi      9
			eq?     
			bnt      code_1c3b
			pushi    3
			pushi    1120
			pushi    35
			pushi    1
			calle    proc13_4,  6
code_1c3b:
			toss    
			jmp      code_1c4a
code_1c3f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_1c4a:
			ret     
		)
	)
)

(instance doubleMessage of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ce3
			pushi    3
			pushi    1120
			pTos     register
			pushSelf
			calle    proc13_4,  6
			jmp      code_1d09
code_1ce3:
			dup     
			ldi      1
			eq?     
			bnt      code_1cfd
			pushi    3
			pushi    1120
			pTos     register
			ldi      1
			add     
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_1d09
code_1cfd:
			dup     
			ldi      2
			eq?     
			bnt      code_1d09
			pushi    #dispose
			pushi    0
			self     4
code_1d09:
			toss    
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			pToa     notKilled
			not     
			bnt      code_1cbe
			pushi    #dispose
			pushi    0
			self     4
			pushi    #setCursor
			pushi    2
			pushi    1
			pushi    1
			lag      global1
			send     8
			jmp      code_1cc7
code_1cbe:
			pushi    #cue
			pushi    0
			&rest    param1
			super    TScript,  4
code_1cc7:
			ret     
		)
	)
)

(instance tree of PicView
	(properties
		signal $1000
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_1dd5
			pushi    #onMe
			pushi    1
			lsp      pEvent
			lag      global0
			send     6
			bnt      code_1dd5
			pushi    #claimed
			pushi    1
			pushi    0
			lap      pEvent
			send     6
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lag      global0
			send     6
			jmp      code_1dde
code_1dd5:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    PicView,  6
code_1dde:
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #onMe
			pushi    1
			pushSelf
			lofsa    eastSide
			send     6
			bt       code_1d68
			pTos     x
			ldi      319
			gt?     
			bt       code_1d68
			pTos     y
			ldi      189
			gt?     
code_1d68:
			bnt      code_1d79
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    eastSide
			send     6
			jmp      code_1da7
code_1d79:
			pushi    #onMe
			pushi    1
			pushSelf
			lofsa    westSide
			send     6
			bt       code_1d8b
			pTos     x
			ldi      0
			lt?     
code_1d8b:
			bnt      code_1d9c
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    westSide
			send     6
			jmp      code_1da7
code_1d9c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    theStreet
			send     6
code_1da7:
			ret     
		)
	)
)

(instance rm120Actions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_1e6a
			lsp      param2
			ldi      1
			eq?     
			bnt      code_1e6a
			lal      local0
			bnt      code_1e5a
			ldi      0
			sal      local0
			pushi    2
			pushi    1120
			pushi    39
			calle    proc13_4,  4
			jmp      code_1e68
code_1e5a:
			ldi      1
			sal      local0
			pushi    2
			pushi    1120
			pushi    40
			calle    proc13_4,  4
code_1e68:
			ldi      1
code_1e6a:
			ret     
		)
	)
)
