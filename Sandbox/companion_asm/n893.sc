;;; Sierra Script 1.0 - (do not remove this comment)
(script# 893)
(include sci.sh)
(use n255)
(use n999)


(procedure (localproc_0004 param1 param2 param3 &tmp temp0)
	(asm
		lap      param2
		sat      temp0
		lsp      argc
		ldi      3
		lt?     
		bnt      code_0021
		pushi    2
		pushi    5
		lsp      param1
		lat      temp0
		add     
		push    
		callk    Memory,  4
		jmp      code_0030
code_0021:
		pushi    3
		pushi    6
		lsp      param1
		lat      temp0
		add     
		push    
		lsp      param3
		callk    Memory,  6
code_0030:
		ret     
	)
)

(class Table of Obj
	(properties
		data 0
		columns 1
		rows 32767
	)
	
	(method (at param1 param2)
		(asm
			pushi    65535
			lap      param1
			lt?     
			bnt      code_0064
			pprev   
			pToa     rows
			lt?     
			bnt      code_0064
			pushi    65535
			lap      param2
			lt?     
			bnt      code_0064
			pprev   
			pToa     columns
			lt?     
			bnt      code_0064
			pushi    2
			pTos     data
			lsp      param2
			pTos     columns
			lap      param1
			mul     
			add     
			push    
			add     
			push    
			call     localproc_0004,  4
			jmp      code_0078
code_0064:
			pushi    5
			pushi    893
			pushi    0
			pTos     name
			lsp      param1
			lsp      param2
			calle    proc255_4,  10
			pushi    0
			callk    SetDebug,  0
code_0078:
			ret     
		)
	)
)
