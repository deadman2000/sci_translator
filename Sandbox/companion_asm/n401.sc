;;; Sierra Script 1.0 - (do not remove this comment)
(script# 401)
(include sci.sh)
(use n000)
(use n851)
(use n992)

(public
	fensScript 0
)

(local
	[local0 6] = [1401 0 2 1 1]
	[local6 11] = [1401 3 2 1 1 2 2 2 2 2]
)
(procedure (localproc_000e param1 param2)
	(asm
		pushi    6
		pushi    2
		lsp      param1
		pushi    999
		pushi    3
		pushi    12
		pushi    1
		&rest    param2
		calle    proc851_0,  12
		ret     
	)
)

(instance fensScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0048
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    144
			callb    proc0_6,  2
			pushi    2
			lea      @local0
			push    
			pushSelf
			call     localproc_000e,  4
			jmp      code_00ab
code_0048:
			dup     
			ldi      1
			eq?     
			bnt      code_0076
			pToa     notKilled
			bnt      code_006d
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    400
			pushi    2
			callk    ScriptID,  4
			send     14
			jmp      code_00ab
code_006d:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_00ab
code_0076:
			dup     
			ldi      2
			eq?     
			bnt      code_008a
			pushi    2
			lea      @local6
			push    
			pushSelf
			call     localproc_000e,  4
			jmp      code_00ab
code_008a:
			dup     
			ldi      3
			eq?     
			bnt      code_00ab
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_00ab:
			toss    
			ret     
		)
	)
)
