;;; Sierra Script 1.0 - (do not remove this comment)
(script# 855)
(include sci.sh)
(use n000)
(use n013)
(use n999)

(public
	versePrinter 0
)

(instance versePrinter of Script
	(properties)
	
	(method (init param1)
		(asm
			pushi    1
			pushi    33
			calle    proc13_6,  2
			pushi    #init
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    1
			pushi    0
			calle    proc13_6,  2
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
			bnt      code_004d
			pushi    5
			pushi    855
			pushi    0
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0188
code_004d:
			dup     
			ldi      1
			eq?     
			bnt      code_015b
			lsg      global144
			dup     
			ldi      0
			eq?     
			bnt      code_006f
			pushi    5
			pushi    855
			pushi    1
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_006f:
			dup     
			ldi      1
			eq?     
			bnt      code_0088
			pushi    5
			pushi    855
			pushi    2
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_0088:
			dup     
			ldi      2
			eq?     
			bnt      code_00a2
			pushi    5
			pushi    855
			pushi    3
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_00a2:
			dup     
			ldi      3
			eq?     
			bnt      code_00bc
			pushi    5
			pushi    855
			pushi    4
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_00bc:
			dup     
			ldi      4
			eq?     
			bnt      code_00d6
			pushi    5
			pushi    855
			pushi    5
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_00d6:
			dup     
			ldi      5
			eq?     
			bnt      code_00f0
			pushi    5
			pushi    855
			pushi    6
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_00f0:
			dup     
			ldi      6
			eq?     
			bnt      code_010a
			pushi    5
			pushi    855
			pushi    7
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_010a:
			dup     
			ldi      7
			eq?     
			bnt      code_0124
			pushi    5
			pushi    855
			pushi    8
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_0124:
			dup     
			ldi      8
			eq?     
			bnt      code_013e
			pushi    5
			pushi    855
			pushi    9
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0155
code_013e:
			dup     
			ldi      9
			eq?     
			bnt      code_0155
			pushi    5
			pushi    855
			pushi    10
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
code_0155:
			toss    
			sat      temp0
			jmp      code_0188
code_015b:
			dup     
			ldi      2
			eq?     
			bnt      code_0175
			pushi    5
			pushi    855
			pushi    11
			pushSelf
			pushi    33
			pushi    3
			calle    proc13_4,  10
			jmp      code_0188
code_0175:
			dup     
			ldi      3
			eq?     
			bnt      code_0188
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    855
			callk    DisposeScript,  2
code_0188:
			toss    
			ret     
		)
	)
)
