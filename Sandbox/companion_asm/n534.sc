;;; Sierra Script 1.0 - (do not remove this comment)
(script# 534)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	Harry 0
)

(local
	[local0 9] = [541 0 2 4 22 31 25 23 5]
	[local9 4] = [1534 1 1]
	[local13 4] = [1534 16 1]
	[local17 4] = [1534 17 1]
	[local21 6] = [1534 13 2 1 2]
	[local27 4] = [1534 12 1]
	[local31 9] = [1534 2 1 2 2 2 2 1]
	[local40 5] = [1534 10 2 1]
	[local45 5] = [1534 8 2 1]
	[local50 4] = [1534 30 1]
	[local54 6] = [1534 23 2 1 2]
	[local60 4] = [1534 18 1]
	[local64 6] = [1534 19 1 2 1]
	[local70 4] = [1534 22 1]
	[local74 4] = [1534 27 1]
	[local78 4] = [1534 29 1]
	[local82 4] = [1534 28 1]
	local86
)
(instance Harry of Prop
	(properties
		x 248
		y 183
		approachX 190
		approachY 175
		view 537
		priority 15
		signal $4810
		cycleSpeed 1
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #setScript
			pushi    1
			lofsa    hDrink
			push    
			pushi    281
			pushi    3
			pushi    5
			pushi    4
			pushi    3
			self     16
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_003f
			pushi    2
			pushi    1534
			pushi    0
			calle    proc13_4,  4
			jmp      code_029d
code_003f:
			dup     
			ldi      5
			eq?     
			bnt      code_0119
			pushi    #has
			pushi    1
			pushi    14
			lag      global0
			send     6
			bnt      code_0065
			pushi    2
			lea      @local13
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_029d
code_0065:
			pushi    1
			pushi    124
			callb    proc0_5,  2
			bnt      code_0080
			pushi    2
			lea      @local17
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_029d
code_0080:
			lsg      global12
			ldi      540
			eq?     
			bnt      code_00bb
			lal      local86
			bnt      code_00a5
			pushi    4
			lea      @local21
			push    
			pushi    999
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_029d
code_00a5:
			ldi      1
			sal      local86
			pushi    2
			lea      @local27
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_029d
code_00bb:
			lal      local86
			bnt      code_00d7
			pushi    4
			lea      @local40
			push    
			pushi    999
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_029d
code_00d7:
			pushi    1
			pushi    167
			callb    proc0_5,  2
			bnt      code_00f8
			pushi    4
			lea      @local45
			push    
			pushi    999
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_029d
code_00f8:
			ldi      1
			sal      local86
			pushi    1
			pushi    167
			callb    proc0_6,  2
			pushi    3
			lea      @local31
			push    
			pushi    999
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_029d
code_0119:
			dup     
			ldi      3
			eq?     
			bnt      code_016c
			pushi    #has
			pushi    1
			pushi    14
			lag      global0
			send     6
			bnt      code_013f
			pushi    2
			lea      @local13
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_029d
code_013f:
			pushi    1
			pushi    124
			callb    proc0_5,  2
			bnt      code_015a
			pushi    2
			lea      @local17
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_029d
code_015a:
			pushi    2
			lea      @local9
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_029d
code_016c:
			dup     
			ldi      4
			eq?     
			bnt      code_0292
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_01cc
			pushi    #has
			pushi    1
			pushi    14
			lag      global0
			send     6
			bnt      code_019b
			pushi    2
			lea      @local13
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_019b:
			pushi    1
			pushi    124
			callb    proc0_5,  2
			bnt      code_01b6
			pushi    2
			lea      @local60
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_01b6:
			pushi    3
			lea      @local64
			push    
			lea      @local0
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_028e
code_01cc:
			dup     
			ldi      11
			eq?     
			bnt      code_0204
			pushi    1
			pushi    124
			callb    proc0_5,  2
			bnt      code_01ee
			pushi    2
			lea      @local50
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_01ee:
			pushi    3
			lea      @local54
			push    
			pushi    999
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_028e
code_0204:
			dup     
			ldi      2
			eq?     
			bnt      code_0238
			pushi    1
			pushi    124
			callb    proc0_5,  2
			bnt      code_0226
			pushi    2
			lea      @local50
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_0226:
			pushi    2
			lea      @local70
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_0238:
			dup     
			ldi      14
			eq?     
			bnt      code_0251
			pushi    2
			lea      @local74
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_0251:
			dup     
			ldi      13
			eq?     
			bnt      code_026a
			pushi    2
			lea      @local78
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_026a:
			dup     
			ldi      12
			eq?     
			bnt      code_0283
			pushi    2
			lea      @local82
			push    
			lea      @local0
			push    
			calle    proc851_0,  4
			jmp      code_028e
code_0283:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_028e:
			toss    
			jmp      code_029d
code_0292:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_029d:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #newRoom
			pushi    1
			pushi    540
			lag      global2
			send     6
			ret     
		)
	)
)

(instance hDrink of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_033b
			pushi    2
			pushi    3
			pushi    18
			callk    Random,  4
			aTop     seconds
			jmp      code_0394
code_033b:
			dup     
			ldi      1
			eq?     
			bnt      code_0352
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    Harry
			send     8
			jmp      code_0394
code_0352:
			dup     
			ldi      2
			eq?     
			bnt      code_0366
			pushi    2
			pushi    20
			pushi    60
			callk    Random,  4
			aTop     ticks
			jmp      code_0394
code_0366:
			dup     
			ldi      3
			eq?     
			bnt      code_037d
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    Harry
			send     8
			jmp      code_0394
code_037d:
			dup     
			ldi      4
			eq?     
			bnt      code_0394
			pushi    #play
			pushi    0
			lofsa    mugSound
			send     4
			ldi      1
			aTop     cycles
			ldi      65535
			aTop     state
code_0394:
			toss    
			ret     
		)
	)
)

(instance mugSound of Sound
	(properties
		flags $0001
		number 457
	)
)
