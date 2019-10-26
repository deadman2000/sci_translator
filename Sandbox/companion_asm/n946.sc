;;; Sierra Script 1.0 - (do not remove this comment)
(script# 946)
(include sci.sh)
(use n999)


(class Polygon of Obj
	(properties
		size 0
		points 0
		type $0001
		dynamic 0
	)
	
	(method (init param1 &tmp [temp0 2])
		(asm
			lsp      argc
			ldi      2
			div     
			aTop     size
			pushi    2
			pushi    1
			pushi    2
			lap      argc
			mul     
			push    
			callk    Memory,  4
			aTop     points
			pushi    3
			pTos     points
			lea      @param1
			push    
			lsp      argc
			ldi      2
			mul     
			neg     
			push    
			callk    StrCpy,  6
			ldi      1
			aTop     dynamic
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     dynamic
			bnt      code_0042
			pToa     points
			bnt      code_0042
			pushi    2
			pushi    3
			pTos     points
			callk    Memory,  4
code_0042:
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
)
