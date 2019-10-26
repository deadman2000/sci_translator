;;; Sierra Script 1.0 - (do not remove this comment)
(script# 681)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n851)
(use n945)
(use n989)
(use n999)

(public
	talky 0
	youGotIeiunus 1
	youGotIneptus 2
	youGotCogito 3
	youGotMalitia 4
	youGotVocalis 5
	youGotHilaris 6
	youGotDeformis 7
)

(local
	[local0 4] = [1680 0 1]
)
(instance talky of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_0041
			pushi    0
			callb    proc0_3,  0
			ldi      120
			aTop     ticks
			jmp      code_007c
code_0041:
			dup     
			ldi      1
			eq?     
			bnt      code_0062
			pushi    4
			lea      @local0
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_007c
code_0062:
			dup     
			ldi      2
			eq?     
			bnt      code_007c
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_007c:
			toss    
			ret     
		)
	)
)

(instance youGotIeiunus of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    secretSound
			send     4
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_00ee
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    87
			pushi    126
			pushSelf
			lag      global0
			send     12
			jmp      code_0126
code_00ee:
			dup     
			ldi      1
			eq?     
			bnt      code_0101
			pushi    #play
			pushi    1
			pushSelf
			lofsa    secretSound
			send     6
			jmp      code_0126
code_0101:
			dup     
			ldi      2
			eq?     
			bnt      code_0116
			pushi    3
			pushi    1680
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_0126
code_0116:
			dup     
			ldi      3
			eq?     
			bnt      code_0126
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0126:
			toss    
			ret     
		)
	)
)

(instance youGotIneptus of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_01a1
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    69
			pushi    134
			pushSelf
			lag      global0
			send     12
			jmp      code_01c7
code_01a1:
			dup     
			ldi      1
			eq?     
			bnt      code_01b7
			pushi    3
			pushi    1680
			pushi    40
			pushSelf
			calle    proc13_4,  6
			jmp      code_01c7
code_01b7:
			dup     
			ldi      2
			eq?     
			bnt      code_01c7
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_01c7:
			toss    
			ret     
		)
	)
)

(instance youGotCogito of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    secretSound
			send     4
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_023b
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    69
			pushi    134
			pushSelf
			lag      global0
			send     12
			jmp      code_0274
code_023b:
			dup     
			ldi      1
			eq?     
			bnt      code_024e
			pushi    #play
			pushi    1
			pushSelf
			lofsa    secretSound
			send     6
			jmp      code_0274
code_024e:
			dup     
			ldi      2
			eq?     
			bnt      code_0264
			pushi    3
			pushi    1680
			pushi    52
			pushSelf
			calle    proc13_4,  6
			jmp      code_0274
code_0264:
			dup     
			ldi      3
			eq?     
			bnt      code_0274
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0274:
			toss    
			ret     
		)
	)
)

(instance youGotMalitia of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_02ef
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    69
			pushi    134
			pushSelf
			lag      global0
			send     12
			jmp      code_031d
code_02ef:
			dup     
			ldi      1
			eq?     
			bnt      code_030d
			pushi    6
			pushi    1680
			pushi    50
			pushSelf
			pushi    67
			pushi    160
			pushi    142
			calle    proc13_4,  12
			jmp      code_031d
code_030d:
			dup     
			ldi      2
			eq?     
			bnt      code_031d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_031d:
			toss    
			ret     
		)
	)
)

(instance youGotVocalis of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_0390
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    87
			pushi    126
			pushSelf
			lag      global0
			send     12
			jmp      code_03b6
code_0390:
			dup     
			ldi      1
			eq?     
			bnt      code_03a6
			pushi    3
			pushi    1680
			pushi    53
			pushSelf
			calle    proc13_4,  6
			jmp      code_03b6
code_03a6:
			dup     
			ldi      2
			eq?     
			bnt      code_03b6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_03b6:
			toss    
			ret     
		)
	)
)

(instance youGotHilaris of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_0429
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    126
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_044f
code_0429:
			dup     
			ldi      1
			eq?     
			bnt      code_043f
			pushi    3
			pushi    1680
			pushi    54
			pushSelf
			calle    proc13_4,  6
			jmp      code_044f
code_043f:
			dup     
			ldi      2
			eq?     
			bnt      code_044f
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_044f:
			toss    
			ret     
		)
	)
)

(instance youGotDeformis of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    681
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
			bnt      code_04c3
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    126
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_04e9
code_04c3:
			dup     
			ldi      1
			eq?     
			bnt      code_04d9
			pushi    3
			pushi    1680
			pushi    51
			pushSelf
			calle    proc13_4,  6
			jmp      code_04e9
code_04d9:
			dup     
			ldi      2
			eq?     
			bnt      code_04e9
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_04e9:
			toss    
			ret     
		)
	)
)

(instance secretSound of Sound
	(properties
		flags $0001
		number 21
	)
)
