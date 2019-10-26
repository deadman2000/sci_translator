;;; Sierra Script 1.0 - (do not remove this comment)
(script# 974)
(include sci.sh)
(use n999)

(public
	proc974_0 0
)

(procedure (proc974_0 param1 param2)
	(asm
		pushi    #firstTrue
		pushi    3
		pushi    99
		lofsa    NC
		push    
		lsp      param1
		lap      param2
		send     10
		ret     
	)
)

(instance NC of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    0
			pushi    2
			pushi    #name
			pushi    0
			lap      param1
			send     4
			push    
			lsp      param2
			callk    StrCmp,  4
			eq?     
			ret     
		)
	)
)
