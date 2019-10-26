;;; Sierra Script 1.0 - (do not remove this comment)
(script# 804)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n995)
(use n996)
(use n999)

(public
	egoSez 0
)

(instance egoSez of Code
	(properties)
	
	(method (doit param1 param2 param3)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_0089
			lsg      global126
			dup     
			ldi      5
			eq?     
			bnt      code_002c
			pushi    2
			pushi    1804
			pushi    1
			calle    proc13_4,  4
			jmp      code_0085
code_002c:
			dup     
			ldi      6
			eq?     
			bnt      code_003f
			pushi    2
			pushi    1804
			pushi    2
			calle    proc13_4,  4
			jmp      code_0085
code_003f:
			dup     
			ldi      4
			eq?     
			bnt      code_0053
			pushi    2
			pushi    1804
			pushi    3
			calle    proc13_4,  4
			jmp      code_0085
code_0053:
			dup     
			ldi      1
			eq?     
			bnt      code_0067
			pushi    2
			pushi    1804
			pushi    6
			calle    proc13_4,  4
			jmp      code_0085
code_0067:
			dup     
			ldi      2
			eq?     
			bnt      code_007b
			pushi    2
			pushi    1804
			pushi    4
			calle    proc13_4,  4
			jmp      code_0085
code_007b:
			pushi    2
			pushi    1804
			pushi    5
			calle    proc13_4,  4
code_0085:
			toss    
			jmp      code_04a7
code_0089:
			dup     
			ldi      5
			eq?     
			bnt      code_009d
			pushi    2
			pushi    1804
			pushi    7
			calle    proc13_4,  4
			jmp      code_04a7
code_009d:
			dup     
			ldi      3
			eq?     
			bnt      code_0196
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_010e
			pushi    11
			lsg      global11
			pushi    360
			pushi    390
			pushi    400
			pushi    530
			pushi    550
			pushi    280
			pushi    290
			pushi    300
			pushi    310
			pushi    320
			calle    proc999_5,  22
			bt       code_00ef
			lsg      global11
			ldi      350
			eq?     
			bnt      code_00ff
			pushi    3
			lsg      global130
			pushi    7
			pushi    9
			calle    proc999_5,  6
code_00ef:
			bnt      code_00ff
			pushi    2
			pushi    1804
			pushi    31
			calle    proc13_4,  4
			jmp      code_04a7
code_00ff:
			pushi    #doit
			pushi    0
			pushi    1
			pushi    213
			callk    ScriptID,  2
			send     4
			jmp      code_04a7
code_010e:
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_0124
			pushi    2
			pushi    1804
			pushi    8
			calle    proc13_4,  4
			jmp      code_0192
code_0124:
			dup     
			ldi      4
			eq?     
			bnt      code_0138
			pushi    2
			pushi    1804
			pushi    9
			calle    proc13_4,  4
			jmp      code_0192
code_0138:
			dup     
			ldi      2
			eq?     
			bnt      code_014c
			pushi    2
			pushi    1804
			pushi    10
			calle    proc13_4,  4
			jmp      code_0192
code_014c:
			dup     
			ldi      3
			eq?     
			bnt      code_0160
			pushi    2
			pushi    1804
			pushi    10
			calle    proc13_4,  4
			jmp      code_0192
code_0160:
			dup     
			ldi      5
			eq?     
			bnt      code_0174
			pushi    2
			pushi    1804
			pushi    11
			calle    proc13_4,  4
			jmp      code_0192
code_0174:
			dup     
			ldi      6
			eq?     
			bnt      code_0188
			pushi    2
			pushi    1804
			pushi    11
			calle    proc13_4,  4
			jmp      code_0192
code_0188:
			pushi    2
			pushi    1804
			pushi    12
			calle    proc13_4,  4
code_0192:
			toss    
			jmp      code_04a7
code_0196:
			dup     
			ldi      10
			eq?     
			bnt      code_01aa
			pushi    2
			pushi    1804
			pushi    13
			calle    proc13_4,  4
			jmp      code_04a7
code_01aa:
			dup     
			ldi      4
			eq?     
			bnt      code_049b
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_01c7
			pushi    2
			pushi    1804
			pushi    14
			calle    proc13_4,  4
			jmp      code_0497
code_01c7:
			dup     
			ldi      1
			eq?     
			bnt      code_01e1
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    5
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			jmp      code_0497
code_01e1:
			dup     
			ldi      5
			eq?     
			bnt      code_01f5
			pushi    2
			pushi    1804
			pushi    15
			calle    proc13_4,  4
			jmp      code_0497
code_01f5:
			dup     
			ldi      18
			eq?     
			bnt      code_026a
			lsg      global115
			dup     
			ldi      0
			eq?     
			bnt      code_022a
			ldi      1
			sag      global115
			pushi    2
			pushi    1804
			pushi    16
			calle    proc13_4,  4
			pushi    #cel
			pushi    1
			pushi    9
			pushi    6
			pushi    1
			pushi    2
			pushi    #at
			pushi    1
			pushi    18
			class    Inv
			send     6
			send     12
			jmp      code_0266
code_022a:
			dup     
			ldi      1
			eq?     
			bnt      code_0255
			ldi      0
			sag      global115
			pushi    2
			pushi    1804
			pushi    17
			calle    proc13_4,  4
			pushi    #cel
			pushi    1
			pushi    2
			pushi    6
			pushi    1
			pushi    2
			pushi    #at
			pushi    1
			pushi    18
			class    Inv
			send     6
			send     12
			jmp      code_0266
code_0255:
			dup     
			ldi      2
			eq?     
			bnt      code_0266
			pushi    2
			pushi    1804
			pushi    18
			calle    proc13_4,  4
code_0266:
			toss    
			jmp      code_0497
code_026a:
			dup     
			ldi      10
			eq?     
			bnt      code_02ee
			lsg      global115
			dup     
			ldi      0
			eq?     
			bnt      code_02a6
			ldi      2
			sag      global115
			pushi    #cel
			pushi    1
			pushi    8
			pushi    6
			pushi    1
			pushi    2
			pushi    #at
			pushi    1
			pushi    10
			class    Inv
			send     6
			send     12
			pushi    1
			pushi    168
			callb    proc0_6,  2
			pushi    2
			pushi    1804
			pushi    19
			calle    proc13_4,  4
			jmp      code_02ea
code_02a6:
			dup     
			ldi      2
			eq?     
			bnt      code_02d9
			ldi      0
			sag      global115
			pushi    1
			pushi    168
			callb    proc0_7,  2
			pushi    2
			pushi    1804
			pushi    20
			calle    proc13_4,  4
			pushi    #cel
			pushi    1
			pushi    11
			pushi    6
			pushi    1
			pushi    0
			pushi    #at
			pushi    1
			pushi    10
			class    Inv
			send     6
			send     12
			jmp      code_02ea
code_02d9:
			dup     
			ldi      1
			eq?     
			bnt      code_02ea
			pushi    2
			pushi    1804
			pushi    18
			calle    proc13_4,  4
code_02ea:
			toss    
			jmp      code_0497
code_02ee:
			dup     
			ldi      8
			eq?     
			bnt      code_0370
			pushi    4
			lsg      global11
			pushi    530
			pushi    390
			pushi    400
			calle    proc999_5,  8
			bnt      code_0318
			pushi    2
			pushi    1804
			pushi    32
			calle    proc13_4,  4
			jmp      code_0497
code_0318:
			lsg      global126
			ldi      3
			eq?     
			bnt      code_032d
			pushi    2
			pushi    1804
			pushi    21
			calle    proc13_4,  4
			jmp      code_033f
code_032d:
			ldi      3
			sag      global126
			pushi    0
			callb    proc0_2,  0
			pushi    2
			pushi    1804
			pushi    22
			calle    proc13_4,  4
code_033f:
			+ag      global153
			push    
			ldi      4
			eq?     
			bnt      code_035c
			pushi    2
			pushi    1804
			pushi    23
			calle    proc13_4,  4
			pushi    #put
			pushi    1
			pushi    8
			lag      global0
			send     6
code_035c:
			lsg      global153
			ldi      1
			eq?     
			bnt      code_0497
			pushi    1
			pushi    25
			calle    proc806_1,  2
			jmp      code_0497
code_0370:
			dup     
			ldi      3
			eq?     
			bnt      code_0384
			pushi    2
			pushi    1804
			pushi    24
			calle    proc13_4,  4
			jmp      code_0497
code_0384:
			dup     
			ldi      15
			eq?     
			bnt      code_0398
			pushi    2
			pushi    1804
			pushi    25
			calle    proc13_4,  4
			jmp      code_0497
code_0398:
			dup     
			ldi      11
			eq?     
			bnt      code_03c2
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_03b5
			pushi    2
			pushi    1804
			pushi    26
			calle    proc13_4,  4
			jmp      code_0497
code_03b5:
			pushi    2
			pushi    1804
			pushi    27
			calle    proc13_4,  4
			jmp      code_0497
code_03c2:
			dup     
			ldi      12
			eq?     
			bnt      code_03dd
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    853
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global1
			send     6
			jmp      code_0497
code_03dd:
			dup     
			ldi      13
			eq?     
			bnt      code_03f1
			pushi    2
			pushi    1804
			pushi    28
			calle    proc13_4,  4
			jmp      code_0497
code_03f1:
			dup     
			ldi      4
			eq?     
			bnt      code_0405
			pushi    2
			pushi    1804
			pushi    29
			calle    proc13_4,  4
			jmp      code_0497
code_0405:
			dup     
			ldi      7
			eq?     
			bnt      code_0419
			pushi    2
			pushi    1804
			pushi    30
			calle    proc13_4,  4
			jmp      code_0497
code_0419:
			dup     
			ldi      2
			eq?     
			bnt      code_042c
			pushi    2
			pushi    1804
			pushi    0
			calle    proc13_4,  4
			jmp      code_0497
code_042c:
			dup     
			ldi      9
			eq?     
			bnt      code_043f
			pushi    2
			pushi    1804
			pushi    0
			calle    proc13_4,  4
			jmp      code_0497
code_043f:
			dup     
			ldi      6
			eq?     
			bnt      code_0452
			pushi    2
			pushi    1804
			pushi    0
			calle    proc13_4,  4
			jmp      code_0497
code_0452:
			dup     
			ldi      17
			eq?     
			bnt      code_0465
			pushi    2
			pushi    1804
			pushi    0
			calle    proc13_4,  4
			jmp      code_0497
code_0465:
			dup     
			ldi      16
			eq?     
			bnt      code_0478
			pushi    2
			pushi    1804
			pushi    0
			calle    proc13_4,  4
			jmp      code_0497
code_0478:
			dup     
			ldi      14
			eq?     
			bnt      code_048b
			pushi    2
			pushi    1804
			pushi    0
			calle    proc13_4,  4
			jmp      code_0497
code_048b:
			pushi    #doVerb
			pushi    1
			lsp      param1
			&rest    param3
			class    Ego
			send     6
code_0497:
			toss    
			jmp      code_04a7
code_049b:
			pushi    #doVerb
			pushi    1
			lsp      param1
			&rest    param3
			class    Ego
			send     6
code_04a7:
			toss    
			pushi    1
			pushi    804
			callk    DisposeScript,  2
			ret     
		)
	)
)
