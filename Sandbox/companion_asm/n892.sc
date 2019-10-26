;;; Sierra Script 1.0 - (do not remove this comment)
(script# 892)
(include sci.sh)
(use n000)
(use n992)

(public
	SyncStop 0
)

(class SyncStop of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init param1 param2 param3)
		(asm
			lap      argc
			bnt      code_0036
			pushi    #view
			pushi    0
			lap      param1
			aTop     client
			send     4
			aTop     vWalking
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0036
			lap      param2
			aTop     vStopped
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0036
			lap      param3
			aTop     caller
code_0036:
			pushi    #init
			pushi    1
			pTos     client
			super    Fwd,  6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_00af
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vStopped
			eq?     
			bnt      code_0106
			pushi    #view
			pushi    1
			pTos     vWalking
			pToa     client
			send     6
			jmp      code_0106
code_00af:
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
			bnt      code_0106
			lag      global88
			aTop     cycleCnt
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pToa     vWalking
			eq?     
			bnt      code_0106
			pushi    #view
			pushi    1
			pTos     vStopped
			pToa     client
			send     6
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp0
			bnt      code_0100
			pushi    #completed
			pushi    0
			send     4
			not     
			bnt      code_0100
			pushi    #setMotion
			pushi    1
			pushi    0
			pToa     client
			send     6
code_0100:
			pushi    #motionCue
			pushi    0
			self     4
code_0106:
			pushi    #doit
			pushi    0
			super    Fwd,  4
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
			bnt      code_0080
			pushi    #view
			pushi    1
			pTos     vWalking
			pToa     client
			send     6
code_0080:
			pushi    #dispose
			pushi    0
			super    Fwd,  4
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
			bnt      code_0068
			lat      temp0
			not     
			bt       code_005d
			pushi    #completed
			pushi    0
			lat      temp0
			send     4
code_005d:
			bnt      code_0068
			pushi    #cue
			pushi    0
			pToa     caller
			send     4
code_0068:
			ret     
		)
	)
)
