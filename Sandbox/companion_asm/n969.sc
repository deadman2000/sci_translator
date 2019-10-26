;;; Sierra Script 1.0 - (do not remove this comment)
(script# 969)
(include sci.sh)
(use n992)


(class Rev of Cycle
	(properties
		client 0
		caller 0
		cycleDir -1
		cycleCnt 0
		completed 0
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #nextCel
			pushi    0
			self     4
			sat      temp0
			push    
			ldi      0
			lt?     
			bnt      code_001e
			pushi    #cycleDone
			pushi    0
			self     4
			jmp      code_0027
code_001e:
			pushi    #cel
			pushi    1
			lst      temp0
			pToa     client
			send     6
code_0027:
			ret     
		)
	)
	
	(method (cycleDone)
		(asm
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			push    
			pToa     client
			send     6
			ret     
		)
	)
)
