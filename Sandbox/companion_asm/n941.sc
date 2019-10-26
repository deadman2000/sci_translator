;;; Sierra Script 1.0 - (do not remove this comment)
(script# 941)
(include sci.sh)
(use n000)
(use n992)


(class RandCycle of Cycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		count -1
	)
	
	(method (init param1 param2 param3)
		(asm
			pushi    #init
			pushi    1
			lsp      param1
			super    Cycle,  6
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0027
			lap      param2
			aTop     count
			lsp      argc
			ldi      3
			ge?     
			bnt      code_002b
			lap      param3
			aTop     caller
			jmp      code_002b
code_0027:
			ldi      65535
			aTop     count
code_002b:
			ret     
		)
	)
	
	(method (doit)
		(asm
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
			bnt      code_006c
			pToa     count
			bnt      code_0066
			push    
			ldi      0
			gt?     
			bnt      code_0051
			dpToa    count
code_0051:
			pushi    #cel
			pushi    1
			pushi    #nextCel
			pushi    0
			self     4
			push    
			pToa     client
			send     6
			lag      global88
			aTop     cycleCnt
			jmp      code_006c
code_0066:
			pushi    #cycleDone
			pushi    0
			self     4
code_006c:
			ret     
		)
	)
	
	(method (nextCel &tmp temp0)
		(asm
			pushi    1
			pTos     client
			callk    NumCels,  2
			push    
			ldi      1
			ne?     
			bnt      code_009d
code_007c:
			pushi    2
			pushi    0
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			push    
			callk    Random,  4
			sat      temp0
			push    
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			eq?     
			bnt      code_009b
			jmp      code_007c
code_009b:
			lat      temp0
code_009d:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			ldi      1
			aTop     completed
			pToa     caller
			bnt      code_00ae
			ldi      1
			sag      global37
			jmp      code_00b4
code_00ae:
			pushi    #motionCue
			pushi    0
			self     4
code_00b4:
			ret     
		)
	)
)
