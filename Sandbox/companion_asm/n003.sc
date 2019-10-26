;;; Sierra Script 1.0 - (do not remove this comment)
(script# 3)
(include sci.sh)
(use n000)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	pipeIt 0
)

(local
	local0
)
(instance pipeIt of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    pipeSound
			send     4
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    1
			pushi    3
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
			bnt      code_004f
			lag      global143
			not     
			bnt      code_0028
			ldi      1
			sal      local0
			pushi    0
			callb    proc0_3,  0
code_0028:
			pushi    #init
			pushi    0
			lofsa    theFrame
			send     4
			pushi    #init
			pushi    0
			lofsa    blowFace
			send     4
			pushi    #init
			pushi    0
			lofsa    blowPeepers
			send     4
			pushi    #init
			pushi    0
			lofsa    blowMouth
			send     4
			ldi      30
			aTop     ticks
			jmp      code_0123
code_004f:
			dup     
			ldi      1
			eq?     
			bnt      code_0072
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    blowPeepers
			send     6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    blowMouth
			send     8
			jmp      code_0123
code_0072:
			dup     
			ldi      2
			eq?     
			bnt      code_0095
			pushi    #play
			pushi    0
			lofsa    pipeSound
			send     4
			pushi    #setCycle
			pushi    2
			class    Fwd
			push    
			pushSelf
			lofsa    blowMouth
			send     8
			ldi      90
			aTop     ticks
			jmp      code_0123
code_0095:
			dup     
			ldi      3
			eq?     
			bnt      code_00af
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    blowMouth
			send     6
			ldi      120
			aTop     ticks
			jmp      code_0123
code_00af:
			dup     
			ldi      4
			eq?     
			bnt      code_00c6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    blowPeepers
			send     8
			jmp      code_0123
code_00c6:
			dup     
			ldi      5
			eq?     
			bnt      code_00d4
			ldi      24
			aTop     ticks
			jmp      code_0123
code_00d4:
			dup     
			ldi      6
			eq?     
			bnt      code_0102
			pushi    #dispose
			pushi    0
			lofsa    blowFace
			send     4
			pushi    #dispose
			pushi    0
			lofsa    blowPeepers
			send     4
			pushi    #dispose
			pushi    0
			lofsa    blowMouth
			send     4
			pushi    #dispose
			pushi    0
			lofsa    theFrame
			send     4
			ldi      3
			aTop     cycles
			jmp      code_0123
code_0102:
			dup     
			ldi      7
			eq?     
			bnt      code_0123
			lal      local0
			bnt      code_0112
			pushi    0
			callb    proc0_4,  0
code_0112:
			pushi    #disable
			pushi    2
			pushi    4
			pushi    5
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_0123:
			toss    
			ret     
		)
	)
)

(instance theFrame of View
	(properties
		x 39
		y 75
		view 805
		priority 15
		signal $0010
	)
)

(instance blowFace of View
	(properties
		x 41
		y 74
		view 57
		loop 1
		priority 14
		signal $0010
	)
)

(instance blowPeepers of Prop
	(properties
		x 49
		y 37
		view 57
		loop 2
		priority 15
		signal $0010
		cycleSpeed 18
	)
)

(instance blowMouth of Prop
	(properties
		x 47
		y 54
		view 57
		cel 2
		priority 15
		signal $0010
		cycleSpeed 18
	)
)

(instance pipeSound of Sound
	(properties
		flags $0001
		number 584
	)
)
