;;; Sierra Script 1.0 - (do not remove this comment)
(script# 993)
(include sci.sh)
(use n999)


(class Class_993_0 of Obj
	(properties
		handle 0
	)
	
	(method (dispose)
		(asm
			pushi    #close
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (showStr param1)
		(asm
			pushi    4
			lsp      param1
			pushi    993
			pushi    0
			pTos     name
			callk    Format,  8
			ret     
		)
	)
	
	(method (open param1)
		(asm
			lsp      argc
			dup     
			ldi      0
			eq?     
			bnt      code_0019
			pushi    3
			pushi    0
			pTos     name
			pushi    0
			callk    FileIO,  6
			jmp      code_002f
code_0019:
			dup     
			ldi      1
			eq?     
			bnt      code_002d
			pushi    3
			pushi    0
			pTos     name
			lsp      param1
			callk    FileIO,  6
			jmp      code_002f
code_002d:
			ldi      0
code_002f:
			toss    
			aTop     handle
			pTos     handle
			ldi      65535
			eq?     
			bnt      code_003e
			ldi      0
			aTop     handle
code_003e:
			pToa     handle
			bnt      code_0047
			selfID  
			jmp      code_0049
code_0047:
			ldi      0
code_0049:
			ret     
		)
	)
	
	(method (readString param1 param2)
		(asm
			lsp      argc
			ldi      2
			ne?     
			bnt      code_00da
			ldi      0
			ret     
code_00da:
			pToa     handle
			not     
			bnt      code_00e7
			pushi    #open
			pushi    1
			pushi    1
			self     6
code_00e7:
			pToa     handle
			bnt      code_00fb
			pushi    4
			pushi    5
			lsp      param1
			lsp      param2
			push    
			callk    FileIO,  8
			jmp      code_00fd
code_00fb:
			ldi      0
code_00fd:
			ret     
		)
	)
	
	(method (writeString param1 &tmp temp0)
		(asm
			pToa     handle
			not     
			bnt      code_007d
			pushi    #open
			pushi    0
			self     4
code_007d:
			pToa     handle
			bnt      code_00a0
			ldi      0
			sat      temp0
code_0086:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_00a0
			pushi    3
			pushi    6
			pTos     handle
			lat      temp0
			lspi     param1
			callk    FileIO,  6
			+at      temp0
			jmp      code_0086
code_00a0:
			ret     
		)
	)
	
	(method (write param1 param2 &tmp temp0)
		(asm
			pToa     handle
			not     
			bnt      code_0058
			pushi    #open
			pushi    0
			self     4
code_0058:
			pToa     handle
			bnt      code_006c
			pushi    4
			pushi    3
			push    
			lsp      param1
			lsp      param2
			callk    FileIO,  8
			jmp      code_006e
code_006c:
			ldi      0
code_006e:
			ret     
		)
	)
	
	(method (read param1 param2)
		(asm
			lsp      argc
			ldi      2
			ne?     
			bnt      code_00ac
			ldi      0
			ret     
code_00ac:
			pToa     handle
			not     
			bnt      code_00b9
			pushi    #open
			pushi    1
			pushi    1
			self     6
code_00b9:
			pToa     handle
			bnt      code_00cc
			pushi    4
			pushi    2
			push    
			lsp      param1
			lsp      param2
			callk    FileIO,  8
			jmp      code_00ce
code_00cc:
			ldi      0
code_00ce:
			ret     
		)
	)
	
	(method (seek param1 param2 &tmp temp0)
		(asm
			lsp      argc
			ldi      2
			ge?     
			bnt      code_010d
			lap      param2
			jmp      code_010f
code_010d:
			ldi      0
code_010f:
			sat      temp0
			pToa     handle
			not     
			bnt      code_011e
			pushi    #open
			pushi    1
			pushi    1
			self     6
code_011e:
			pToa     handle
			bnt      code_0132
			pushi    4
			pushi    7
			push    
			lsp      param1
			lst      temp0
			callk    FileIO,  8
			jmp      code_0134
code_0132:
			ldi      0
code_0134:
			ret     
		)
	)
	
	(method (close)
		(asm
			pToa     handle
			bnt      code_0144
			pushi    2
			pushi    1
			push    
			callk    FileIO,  4
			ldi      0
			aTop     handle
code_0144:
			ret     
		)
	)
	
	(method (delete)
		(asm
			pToa     handle
			bnt      code_0150
			pushi    #close
			pushi    0
			self     4
code_0150:
			pushi    2
			pushi    4
			pTos     name
			callk    FileIO,  4
			ret     
		)
	)
)
