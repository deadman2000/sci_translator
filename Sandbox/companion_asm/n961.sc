;;; Sierra Script 1.0 - (do not remove this comment)
(script# 961)
(include sci.sh)
(use n992)

(public
	StopWalk 0
)

(class StopWalk of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init param1 param2)
		(asm
			lap      argc
			bnt      code_002a
			pushi    #view
			pushi    0
			lap      param1
			aTop     client
			send     4
			aTop     vWalking
			lsp      argc
			ldi      2
			ge?     
			bnt      code_002a
			lap      param2
			aTop     vStopped
code_002a:
			pushi    #init
			pushi    1
			pTos     client
			super    Fwd,  6
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			bnt      code_009d
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vWalking
			eq?     
			bnt      code_00ba
			pushi    #view
			pushi    1
			pTos     vStopped
			pToa     client
			send     6
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp1
			bnt      code_0094
			pushi    #completed
			pushi    0
			send     4
			not     
			bnt      code_0094
			pushi    #setMotion
			pushi    1
			pushi    0
			pToa     client
			send     6
code_0094:
			pushi    #doit
			pushi    0
			super    Fwd,  4
			jmp      code_00ba
code_009d:
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vStopped
			eq?     
			bnt      code_00b4
			pushi    #view
			pushi    1
			pTos     vWalking
			pToa     client
			send     6
code_00b4:
			pushi    #doit
			pushi    0
			super    Fwd,  4
code_00ba:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vStopped
			eq?     
			bnt      code_004a
			pushi    #view
			pushi    1
			pTos     vWalking
			pToa     client
			send     6
code_004a:
			pushi    #dispose
			pushi    0
			super    Fwd,  4
			ret     
		)
	)
)
