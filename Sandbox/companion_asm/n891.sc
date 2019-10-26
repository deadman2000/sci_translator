;;; Sierra Script 1.0 - (do not remove this comment)
(script# 891)
(include sci.sh)
(use n000)
(use n992)
(use n999)


(class FuzzyStop of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		theStopCelArray 0
	)
	
	(method (init param1 param2 param3 param4)
		(asm
			lap      param2
			aTop     theStopCelArray
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0014
			lap      param3
			aTop     caller
code_0014:
			pushi    #init
			pushi    1
			lsp      param1
			&rest    param4
			super    Fwd,  6
			ret     
		)
	)
	
	(method (doit param1 &tmp temp0)
		(asm
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_0062
			pushi    #doit
			pushi    0
			&rest    param1
			super    Fwd,  4
			jmp      code_00f1
code_0062:
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			bnt      code_0099
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			bnt      code_0099
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp0
			bnt      code_00f1
			pushi    #completed
			pushi    0
			send     4
			not     
			bnt      code_00f1
			pushi    #setMotion
			pushi    1
			pushi    0
			pToa     client
			send     6
			jmp      code_00f1
code_0099:
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pushi    2
			pTos     theStopCelArray
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			calle    proc999_6,  4
			ne?     
			bnt      code_00f1
			pushi    1
			lsg      global88
			pToa     cycleCnt
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			ge?     
			bnt      code_00f1
			lag      global88
			aTop     cycleCnt
			pushi    #setCel
			pushi    1
			pushi    2
			pTos     theStopCelArray
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			calle    proc999_6,  4
			push    
			pToa     client
			send     6
			pushi    #motionCue
			pushi    0
			self     4
code_00f1:
			ret     
		)
	)
	
	(method (motionCue &tmp temp0)
		(asm
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp0
			pToa     caller
			bnt      code_0048
			lat      temp0
			not     
			bt       code_003d
			pushi    #completed
			pushi    0
			lat      temp0
			send     4
code_003d:
			bnt      code_0048
			pushi    #cue
			pushi    0
			pToa     caller
			send     4
code_0048:
			ret     
		)
	)
)
