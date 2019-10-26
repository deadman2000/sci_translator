;;; Sierra Script 1.0 - (do not remove this comment)
(script# 988)
(include sci.sh)
(use n992)
(use n998)


(class Extra of Prop
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $0000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 1
		script 0
		cycler 0
		timer 0
		detailLevel 0
		cycleType 0
		hesitation 0
		pauseCel 0
		minPause 10
		maxPause 30
		minCycles 8
		maxCycles 20
		counter 0
		state $ffff
		cycles 0
	)
	
	(procedure (localproc_0193)
		(asm
			pTos     pauseCel
			dup     
			ldi      65535
			eq?     
			bnt      code_01ab
			pushi    2
			pushi    0
			pushi    #lastCel
			pushi    0
			self     4
			push    
			callk    Random,  4
			jmp      code_01c7
code_01ab:
			dup     
			ldi      65534
			eq?     
			bnt      code_01bb
			pushi    #lastCel
			pushi    0
			self     4
			jmp      code_01c7
code_01bb:
			dup     
			pTos     cycleType
			ldi      0
			eq?     
			eq?     
			bnt      code_01c7
			pToa     pauseCel
code_01c7:
			toss    
			ret     
		)
	)
	
	
	(method (init)
		(asm
			pushi    0
			call     localproc_0193,  0
			aTop     cel
			pushi    #changeState
			pushi    1
			pushi    0
			self     6
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pTos     cycleType
			ldi      1
			eq?     
			bnt      code_0038
			pTos     cel
			pToa     pauseCel
			eq?     
			bnt      code_0038
			pTos     pauseCel
			ldi      0
			ne?     
			bnt      code_0038
			pTos     hesitation
			ldi      1
			add     
			aTop     cycles
code_0038:
			pToa     cycles
			bnt      code_0049
			dpToa    cycles
			not     
			bnt      code_0049
			pushi    #cue
			pushi    0
			self     4
code_0049:
			pushi    #doit
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (cue)
		(asm
			pTos     signal
			ldi      5
			and     
			bt       code_007d
			pushi    140
			pushi    #superClass
			pTos     state
			ldi      1
			add     
			push    
			self     6
code_007d:
			ret     
		)
	)
	
	(method (stopExtra)
		(asm
			pushi    #setCel
			pushi    1
			pushi    0
			call     localproc_0193,  0
			push    
			pushi    285
			pushi    0
			self     10
			ret     
		)
	)
	
	(method (startExtra)
		(asm
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
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
			bnt      code_00ca
			pTos     counter
			ldi      0
			le?     
			bnt      code_00bf
			pTos     cycleType
			ldi      0
			ne?     
			bnt      code_00a8
			pushi    2
			pTos     minCycles
			pTos     maxCycles
			callk    Random,  4
			push    
			ldi      1
			sub     
			aTop     counter
code_00a8:
			pushi    2
			pTos     minPause
			pTos     maxPause
			callk    Random,  4
			aTop     cycles
			not     
			bnt      code_0191
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0191
code_00bf:
			dpToa    counter
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0191
code_00ca:
			dup     
			ldi      1
			eq?     
			bnt      code_0119
			pTos     cycleType
			ldi      0
			eq?     
			bnt      code_00ef
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			self     6
			pushi    2
			pTos     minCycles
			pTos     maxCycles
			callk    Random,  4
			aTop     cycles
			jmp      code_0191
code_00ef:
			pTos     cycleType
			ldi      2
			eq?     
			bnt      code_010c
			pTos     pauseCel
			ldi      65534
			eq?     
			bnt      code_010c
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			self     8
			jmp      code_0191
code_010c:
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			jmp      code_0191
code_0119:
			dup     
			ldi      2
			eq?     
			bnt      code_013d
			pToa     hesitation
			bnt      code_0134
			pTos     cycleType
			ldi      2
			eq?     
			bnt      code_0134
			pToa     hesitation
			aTop     cycles
			jmp      code_0191
code_0134:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0191
code_013d:
			dup     
			ldi      3
			eq?     
			bnt      code_0177
			pTos     cycleType
			ldi      2
			eq?     
			bnt      code_016e
			pTos     pauseCel
			ldi      65534
			ne?     
			bnt      code_0161
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			self     8
			jmp      code_0191
code_0161:
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			jmp      code_0191
code_016e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0191
code_0177:
			dup     
			ldi      4
			eq?     
			bnt      code_0191
			pushi    #setCel
			pushi    1
			pushi    0
			call     localproc_0193,  0
			push    
			self     6
			pushi    #changeState
			pushi    1
			pushi    0
			self     6
code_0191:
			toss    
			ret     
		)
	)
)
