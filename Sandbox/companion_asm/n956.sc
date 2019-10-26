;;; Sierra Script 1.0 - (do not remove this comment)
(script# 956)
(include sci.sh)
(use n992)


(class ForwardCounter of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		count 0
	)
	
	(method (init param1 param2 param3)
		(asm
			pushi    #init
			pushi    1
			lsp      param1
			super    Fwd,  6
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0024
			lap      param2
			aTop     count
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0024
			lap      param3
			aTop     caller
code_0024:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			dpToa    count
			bnt      code_0034
			pushi    #cycleDone
			pushi    0
			super    Fwd,  4
			jmp      code_003e
code_0034:
			ldi      1
			aTop     completed
			pushi    #motionCue
			pushi    0
			self     4
code_003e:
			ret     
		)
	)
)
