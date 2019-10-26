;;; Sierra Script 1.0 - (do not remove this comment)
(script# 808)
(include sci.sh)
(use n000)
(use n255)
(use n933)
(use n958)
(use n996)
(use n999)

(public
	initGame 0
	startUpRoom 1
)

(instance initGame of Code
	(properties)
	
	(method (doit param1 param2 param3 &tmp temp0 temp1 temp2 [temp3 20])
		(asm
			ldi      1
			sag      global102
			pushi    #color
			pushi    1
			lsg      global187
			pushi    29
			pushi    1
			lsg      global186
			lap      param1
			send     12
			lap      param1
			sag      global38
			ldi      31
			sag      global138
			ldi      300
			sag      global139
			ldi      7325
			sag      global16
			ldi      1
			sag      global34
			lag      global102
			bnt      code_004d
			pushi    2
			lea      @global42
			push    
			lofsa    {LOOKUP\_ERROR}
			push    
			callk    StrCpy,  4
code_004d:
			class    PseudoMouse
			sag      global77
			ldi      30
			sag      global79
			pushi    #alterEgo
			pushi    1
			lsg      global0
			class    User
			send     6
			pushi    4
			pushi    128
			pushi    950
			pushi    900
			pushi    781
			calle    proc958_0,  8
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    304
			pushi    172
			lag      global1
			send     12
			ldi      300
			sag      global22
			lofsa    {x.yyy.zzz}
			sag      global27
			pushi    3
			pushi    0
			lofsa    {version}
			push    
			pushi    1
			callk    FileIO,  6
			sat      temp0
			pushi    4
			pushi    5
			lsg      global27
			pushi    11
			push    
			callk    FileIO,  8
			pushi    2
			pushi    1
			lst      temp0
			callk    FileIO,  4
			pushi    1
			pushi    3
			callk    DoSound,  2
			sag      global103
			pushi    1
			pushi    2
			callk    Graph,  2
			sat      temp1
			pushi    2
			le?     
			bnt      code_00d2
			pprev   
			ldi      16
			le?     
			bnt      code_00d2
			pushi    1
			pushi    0
			callb    proc0_7,  2
			jmp      code_00d7
code_00d2:
			pushi    1
			pushi    0
			callb    proc0_6,  2
code_00d7:
			pushi    #back
			pushi    1
			lsg      global187
			pushi    345
			pushi    1
			lsg      global184
			pushi    346
			pushi    1
			lsg      global187
			pushi    347
			pushi    1
			lsg      global188
			pushi    348
			pushi    1
			lsg      global189
			lap      param2
			send     30
			pushi    #back
			pushi    1
			lsg      global190
			pushi    345
			pushi    1
			lsg      global184
			pushi    346
			pushi    1
			lsg      global187
			pushi    347
			pushi    1
			lsg      global188
			pushi    348
			pushi    1
			lsg      global189
			pushi    352
			pushi    1
			lsg      global170
			pushi    353
			pushi    1
			lsg      global193
			pushi    354
			pushi    1
			lsg      global192
			pushi    355
			pushi    1
			lsg      global194
			pushi    356
			pushi    1
			lsg      global191
			lap      param3
			send     60
			pushi    2
			pushi    0
			pushi    11
			callk    Random,  4
			sag      global123
			pushi    2
			pushi    22
			pushi    31
			callk    Random,  4
			sag      global140
			pushi    2
			pushi    0
			pushi    9
			callk    Random,  4
			sag      global144
			pushi    0
			callk    GameIsRestarting,  0
			bnt      code_0162
			ldi      140
			sag      global147
			jmp      code_022b
code_0162:
			pushi    4
			lea      @temp3
			push    
			pushi    808
			pushi    0
			pushi    799
			callk    Format,  8
			lag      global102
			bnt      code_0227
			pushi    2
			pushi    10
			lea      @temp3
			push    
			callk    FileIO,  4
			bnt      code_0227
			ldi      0
			sat      temp3
			ldi      0
			sat      temp2
code_018c:
			ldi      1
			bnt      code_022b
			pushi    22
			pushi    808
			pushi    1
			pushi    81
			lofsa    {Main Map}
			push    
			pushi    100
			pushi    81
			lofsa    { Cave_}
			push    
			pushi    140
			pushi    81
			lofsa    { Intro_}
			push    
			pushi    98
			pushi    81
			lofsa    { Move Ahead_}
			push    
			pushi    999
			pushi    81
			lofsa    {Restore}
			push    
			pushi    65535
			pushi    41
			lea      @temp3
			push    
			pushi    5
			pushi    35
			lsg      global38
			calle    proc255_0,  44
			sat      temp2
			lat      temp3
			bnt      code_01e2
			pushi    1
			lea      @temp3
			push    
			callk    ReadNumber,  2
			sat      temp2
code_01e2:
			lst      temp2
			ldi      999
			eq?     
			bnt      code_01fd
			pushi    #doit
			pushi    0
			pushi    1
			pushi    799
			callk    ScriptID,  2
			send     4
			jmp      code_022b
			jmp      code_018c
code_01fd:
			lst      temp2
			ldi      0
			gt?     
			bnt      code_020f
			lat      temp2
			sag      global147
			jmp      code_022b
			jmp      code_018c
code_020f:
			lst      temp2
			ldi      0
			lt?     
			bnt      code_018c
			pushi    #restore
			pushi    0
			lag      global1
			send     4
			jmp      code_022b
			jmp      code_018c
			jmp      code_022b
code_0227:
			ldi      98
			sag      global147
code_022b:
			pushi    #canInput
			pushi    1
			pushi    1
			pushi    282
			pushi    1
			pushi    1
			class    User
			send     12
			pushi    1
			pushi    940
			callk    DisposeScript,  2
			pushi    #newRoom
			pushi    1
			pushi    803
			lag      global1
			send     6
			ret     
		)
	)
)

(instance startUpRoom of Code
	(properties)
	
	(method (doit param1 &tmp [temp0 20])
		(asm
			lag      global77
			bnt      code_0279
			pushi    #stop
			pushi    0
			send     4
code_0279:
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
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			sag      global108
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    1
			pushi    148
			callb    proc0_7,  2
			pushi    37
			pushi    0
			pushi    12
			pushi    5
			pushi    181
			pushi    940
			pushi    13
			pushi    490
			pushi    800
			pushi    812
			pushi    969
			pushi    951
			pushi    807
			pushi    973
			pushi    928
			pushi    941
			pushi    939
			pushi    930
			pushi    927
			pushi    955
			pushi    953
			pushi    971
			pushi    974
			pushi    11
			pushi    15
			pushi    16
			pushi    851
			pushi    970
			pushi    806
			pushi    964
			pushi    855
			pushi    892
			pushi    991
			pushi    860
			pushi    852
			pushi    603
			pushi    891
			pushi    890
			calle    proc958_0,  74
			pushi    4
			lea      @temp0
			push    
			pushi    808
			pushi    0
			pushi    799
			callk    Format,  8
			lag      global102
			bnt      code_0373
			pushi    2
			pushi    10
			lea      @temp0
			push    
			callk    FileIO,  4
			bnt      code_0373
			pushi    1
			pushi    1
			callk    MemoryInfo,  2
			push    
			pushi    10
			pushi    1
			pushi    0
			callk    MemoryInfo,  2
			add     
			ugt?    
			bnt      code_0373
			pushi    8
			pushi    808
			pushi    2
			pushi    81
			lofsa    {Who cares}
			push    
			pushi    0
			pushi    81
			lofsa    {Debug}
			push    
			pushi    1
			calle    proc255_0,  16
			bnt      code_0373
			pushi    0
			callk    SetDebug,  0
code_0373:
			lsg      global130
			ldi      11
			eq?     
			bnt      code_0386
			pushi    1
			pushi    64
			callb    proc0_5,  2
			bnt      code_0386
			+ag      global155
code_0386:
			pushi    3
			lsg      global126
			pushi    0
			pushi    4
			calle    proc999_5,  6
			not     
			bnt      code_03a1
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
code_03a1:
			pushi    16
			lsg      global11
			pushi    180
			pushi    210
			pushi    150
			pushi    250
			pushi    580
			pushi    120
			pushi    390
			pushi    270
			pushi    310
			pushi    440
			pushi    350
			pushi    110
			pushi    120
			pushi    160
			pushi    220
			calle    proc999_5,  32
			bnt      code_03ff
			pushi    5
			lsg      global12
			pushi    100
			pushi    260
			pushi    630
			pushi    450
			calle    proc999_5,  10
			bnt      code_03ff
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
code_03ff:
			pushi    10
			lsg      global11
			pushi    690
			pushi    590
			pushi    600
			pushi    610
			pushi    700
			pushi    580
			pushi    620
			pushi    701
			pushi    702
			calle    proc999_5,  20
			not     
			bnt      code_045f
			pushi    10
			lsg      global12
			pushi    690
			pushi    590
			pushi    600
			pushi    610
			pushi    700
			pushi    580
			pushi    620
			pushi    701
			pushi    702
			calle    proc999_5,  20
			bnt      code_045f
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			pushi    12
			pushi    1
			lag      global114
			send     12
code_045f:
			pushi    10
			lsg      global11
			pushi    690
			pushi    590
			pushi    600
			pushi    610
			pushi    700
			pushi    580
			pushi    620
			pushi    701
			pushi    702
			calle    proc999_5,  20
			bnt      code_04c7
			pushi    10
			lsg      global12
			pushi    690
			pushi    590
			pushi    600
			pushi    610
			pushi    700
			pushi    580
			pushi    620
			pushi    701
			pushi    702
			calle    proc999_5,  20
			not     
			bnt      code_04c7
			pushi    #number
			pushi    1
			pushi    580
			pushi    97
			pushi    1
			pushi    127
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     22
code_04c7:
			pushi    9
			lsg      global11
			pushi    250
			pushi    590
			pushi    600
			pushi    610
			pushi    620
			pushi    690
			pushi    700
			pushi    680
			calle    proc999_5,  18
			not     
			bnt      code_050b
			pushi    #number
			pushi    0
			lag      global113
			send     4
			push    
			ldi      581
			eq?     
			bnt      code_050b
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
code_050b:
			pushi    5
			lsg      global11
			pushi    100
			pushi    260
			pushi    630
			pushi    450
			calle    proc999_5,  10
			bnt      code_0535
			pushi    #disable
			pushi    5
			pushi    2
			pushi    3
			pushi    4
			pushi    6
			pushi    7
			lag      global69
			send     14
code_0535:
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
			not     
			bnt      code_05a7
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
code_05a7:
			pushi    5
			lsp      param1
			pushi    220
			pushi    180
			pushi    210
			pushi    250
			calle    proc999_5,  10
			bnt      code_0604
			lsg      global130
			ldi      9
			eq?     
			bnt      code_05cf
			pushi    1
			pushi    36
			callb    proc0_5,  2
			not     
code_05cf:
			bt       code_05e1
			lsg      global130
			ldi      12
			eq?     
			bnt      code_075e
			pushi    1
			pushi    38
			callb    proc0_5,  2
			not     
code_05e1:
			bnt      code_075e
			pushi    1
			pushi    750
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    750
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			pushi    1
			pushi    129
			callb    proc0_6,  2
			jmp      code_075e
code_0604:
			pushi    10
			lsp      param1
			pushi    620
			pushi    630
			pushi    640
			pushi    650
			pushi    660
			pushi    670
			pushi    680
			pushi    690
			pushi    695
			calle    proc999_5,  20
			bnt      code_0645
			pushi    1
			pushi    625
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    625
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			jmp      code_075e
code_0645:
			pushi    4
			lsp      param1
			pushi    110
			pushi    120
			pushi    100
			calle    proc999_5,  8
			bnt      code_066f
			pushi    1
			pushi    125
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    125
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			jmp      code_075e
code_066f:
			pushi    4
			lsp      param1
			pushi    701
			pushi    702
			pushi    705
			calle    proc999_5,  8
			bnt      code_069e
			pushi    1
			pushi    720
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    720
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			jmp      code_075e
code_069e:
			pushi    6
			lsp      param1
			pushi    470
			pushi    480
			pushi    450
			pushi    460
			pushi    455
			calle    proc999_5,  12
			bnt      code_06d3
			pushi    1
			pushi    452
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    452
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			jmp      code_075e
code_06d3:
			pushi    6
			lsp      param1
			pushi    550
			pushi    560
			pushi    561
			pushi    562
			pushi    570
			calle    proc999_5,  12
			bnt      code_0708
			pushi    1
			pushi    564
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    564
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			jmp      code_075e
code_0708:
			pushi    4
			lsp      param1
			pushi    590
			pushi    600
			pushi    610
			calle    proc999_5,  8
			bnt      code_073e
			pushi    1
			pushi    601
			callk    ScriptID,  2
			pushi    1
			pushi    851
			callk    ScriptID,  2
			pushi    #setRegions
			pushi    1
			pushi    601
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			send     6
			jmp      code_075e
code_073e:
			pushi    5
			lsp      param1
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			calle    proc999_5,  10
			bnt      code_075e
			pushi    1
			pushi    311
			callk    ScriptID,  2
code_075e:
			pushi    #setCursor
			pushi    2
			lsg      global21
			pushi    1
			lag      global1
			send     8
			ret     
		)
	)
)
