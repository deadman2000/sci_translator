;;; Sierra Script 1.0 - (do not remove this comment)
(script# 939)
(include sci.sh)
(use n992)


(class Osc of Cycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		howManyCycles -1
	)
	
	(method (init param1 param2 param3)
		(asm
			lsp      argc
			ldi      2
			ge?     
			bnt      code_001c
			lap      param2
			aTop     howManyCycles
			lsp      argc
			ldi      3
			ge?     
			bnt      code_001c
			lap      param3
			aTop     caller
code_001c:
			pushi    #init
			pushi    1
			lsp      param1
			super    Cycle,  6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #nextCel
			pushi    0
			self     4
			sat      temp0
			push    
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			gt?     
			bt       code_0041
			lst      temp0
			ldi      0
			lt?     
code_0041:
			bnt      code_0052
			pToa     cycleDir
			neg     
			aTop     cycleDir
			pushi    #cycleDone
			pushi    0
			self     4
			jmp      code_005b
code_0052:
			pushi    #cel
			pushi    1
			lst      temp0
			pToa     client
			send     6
code_005b:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			pToa     howManyCycles
			bnt      code_007c
			pushi    #cel
			pushi    1
			pushi    #nextCel
			pushi    0
			self     4
			push    
			pToa     client
			send     6
			pTos     howManyCycles
			ldi      0
			gt?     
			bnt      code_0086
			dpToa    howManyCycles
			jmp      code_0086
code_007c:
			ldi      1
			aTop     completed
			pushi    #motionCue
			pushi    0
			self     4
code_0086:
			ret     
		)
	)
)
