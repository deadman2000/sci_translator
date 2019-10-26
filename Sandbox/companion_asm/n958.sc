;;; Sierra Script 1.0 - (do not remove this comment)
(script# 958)
(include sci.sh)

(public
	proc958_0 0
)

(procedure (proc958_0 param1 param2 &tmp temp0 temp1)
	(asm
		lsp      argc
		ldi      2
		sub     
		sap      argc
		ldi      0
		sat      temp0
code_001b:
		lst      temp0
		lap      argc
		le?     
		bnt      code_0043
		lat      temp0
		lapi     param2
		sat      temp1
		lap      param1
		bnt      code_0038
		pushi    2
		push    
		lst      temp1
		callk    Load,  4
		jmp      code_003e
code_0038:
		pushi    1
		lst      temp1
		callk    DisposeScript,  2
code_003e:
		+at      temp0
		jmp      code_001b
code_0043:
		pushi    1
		pushi    958
		callk    DisposeScript,  2
		ret     
	)
)
