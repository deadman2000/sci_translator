;;; Sierra Script 1.0 - (do not remove this comment)
(script# 854)
(include sci.sh)
(use n000)
(use n013)
(use n999)

(public
	puzBoxMessage 0
)

(instance puzBoxMessage of Code
	(properties)
	
	(method (doit)
		(asm
			lsg      global11
			ldi      530
			eq?     
			bnt      code_0026
			pushi    2
			pushi    1854
			pushi    3
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_0026:
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_003e
			pushi    2
			pushi    1854
			pushi    1
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_003e:
			lsg      global11
			ldi      110
			eq?     
			bt       code_004b
			lsg      global11
			ldi      120
			eq?     
code_004b:
			bnt      code_005c
			pushi    2
			pushi    1854
			pushi    2
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_005c:
			pushi    4
			lsg      global11
			pushi    580
			pushi    590
			pushi    600
			calle    proc999_5,  8
			bnt      code_0080
			pushi    2
			pushi    1854
			pushi    0
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_0080:
			pushi    6
			lsg      global11
			pushi    570
			pushi    270
			pushi    350
			pushi    390
			pushi    440
			calle    proc999_5,  12
			bnt      code_00b3
			lsg      global126
			ldi      5
			eq?     
			bnt      code_00b3
			pushi    2
			pushi    1854
			pushi    3
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_00b3:
			lsg      global11
			ldi      210
			eq?     
			bt       code_00c2
			lsg      global11
			ldi      250
			eq?     
code_00c2:
			bnt      code_00d4
			pushi    2
			pushi    1854
			pushi    4
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_00d4:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0160
			lsg      global11
			ldi      490
			eq?     
			bnt      code_00f3
			pushi    2
			pushi    1854
			pushi    1
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_00f3:
			pushi    5
			lsg      global11
			pushi    455
			pushi    460
			pushi    470
			pushi    480
			calle    proc999_5,  10
			bnt      code_011a
			pushi    2
			pushi    1854
			pushi    1
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_011a:
			pushi    3
			lsg      global11
			pushi    500
			pushi    540
			calle    proc999_5,  6
			bnt      code_013c
			pushi    2
			pushi    1854
			pushi    5
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_013c:
			pushi    4
			lsg      global11
			pushi    560
			pushi    561
			pushi    562
			calle    proc999_5,  8
			bnt      code_01c7
			pushi    2
			pushi    1854
			pushi    1
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_0160:
			pushi    5
			lag      global130
			le?     
			bnt      code_01c5
			pprev   
			ldi      6
			le?     
			bnt      code_01c5
			lsg      global126
			ldi      5
			eq?     
			bnt      code_01c5
			lsg      global11
			ldi      490
			eq?     
			bt       code_0186
			lsg      global11
			ldi      500
			eq?     
code_0186:
			bnt      code_0198
			pushi    2
			pushi    1854
			pushi    6
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_0198:
			pushi    7
			lsg      global11
			pushi    540
			pushi    550
			pushi    560
			pushi    561
			pushi    562
			pushi    570
			calle    proc999_5,  14
			bnt      code_01c7
			pushi    2
			pushi    1854
			pushi    0
			calle    proc13_4,  4
			ldi      1
			jmp      code_01c7
code_01c5:
			ldi      0
code_01c7:
			ret     
		)
	)
)
