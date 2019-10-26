;;; Sierra Script 1.0 - (do not remove this comment)
(script# 949)
(include sci.sh)
(use n999)


(class Blk of Obj
	(properties
		top 0
		left 0
		bottom 0
		right 0
	)
	
	(method (doit param1)
		(asm
			pushi    #brBottom
			pushi    0
			lap      param1
			send     4
			push    
			pToa     top
			le?     
			bt       code_0039
			pushi    #brTop
			pushi    0
			lap      param1
			send     4
			push    
			pToa     bottom
			gt?     
			bt       code_0039
			pushi    #brRight
			pushi    0
			lap      param1
			send     4
			push    
			pToa     left
			lt?     
			bt       code_0039
			pushi    #brLeft
			pushi    0
			lap      param1
			send     4
			push    
			pToa     right
			ge?     
code_0039:
			ret     
		)
	)
)

(class Cage of Blk
	(properties
		top 0
		left 0
		bottom 0
		right 0
	)
	
	(method (doit param1)
		(asm
			pushi    #brTop
			pushi    0
			lap      param1
			send     4
			push    
			pToa     top
			ge?     
			bnt      code_00a7
			pushi    #brLeft
			pushi    0
			lap      param1
			send     4
			push    
			pToa     left
			ge?     
			bnt      code_00a7
			pushi    #brBottom
			pushi    0
			lap      param1
			send     4
			push    
			pToa     bottom
			le?     
			bnt      code_00a7
			pushi    #brRight
			pushi    0
			lap      param1
			send     4
			push    
			pToa     right
			le?     
code_00a7:
			ret     
		)
	)
)
