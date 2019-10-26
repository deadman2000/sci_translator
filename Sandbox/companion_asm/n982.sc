;;; Sierra Script 1.0 - (do not remove this comment)
(script# 982)
(include sci.sh)
(use n000)

(public
	proc982_0 0
	proc982_1 1
	proc982_2 2
)

(procedure (proc982_0 param1)
	(asm
		pushi    0
		pushi    #x
		pushi    0
		lap      param1
		send     4
		le?     
		bnt      code_0044
		pprev   
		ldi      319
		le?     
		bnt      code_0044
		pushi    0
		pushi    #y
		pushi    0
		lap      param1
		send     4
		push    
		pushi    #z
		pushi    0
		lap      param1
		send     4
		sub     
		le?     
		bnt      code_0044
		pprev   
		ldi      189
		le?     
code_0044:
		not     
		ret     
	)
)

(procedure (proc982_1 param1 param2 param3 param4 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
	(asm
		lap      param2
		sat      temp0
		lap      param3
		sat      temp1
		lap      param4
		sat      temp2
		lsp      argc
		ldi      4
		lt?     
		bnt      code_0087
		ldi      32767
		sat      temp2
		lsp      argc
		ldi      3
		lt?     
		bnt      code_0087
		lsp      argc
		ldi      2
		lt?     
		bnt      code_0075
		lag      global0
		sat      temp0
code_0075:
		pushi    360
		lst      temp0
		lag      global0
		eq?     
		bnt      code_0084
		pushi    2
		lag      global35
		mul     
code_0084:
		sub     
		sat      temp1
code_0087:
		pushi    #x
		pushi    0
		lap      param1
		send     4
		sat      temp3
		pushi    #y
		pushi    0
		lap      param1
		send     4
		sat      temp4
		pushi    #x
		pushi    0
		lat      temp0
		send     4
		sat      temp5
		pushi    #y
		pushi    0
		lat      temp0
		send     4
		sat      temp6
		lsp      param1
		lat      temp0
		ne?     
		bnt      code_00ef
		lst      temp1
		ldi      2
		div     
		push    
		pushi    1
		pushi    2
		pushi    4
		lst      temp5
		lst      temp6
		lst      temp3
		lst      temp4
		callk    GetAngle,  8
		push    
		pushi    #heading
		pushi    0
		lat      temp0
		send     4
		push    
		call     localproc_00f0,  4
		push    
		callk    Abs,  2
		lt?     
		bt       code_00ef
		lst      temp2
		pushi    5
		lst      temp5
		lst      temp6
		lst      temp3
		lst      temp4
		lsg      global31
		callk    GetDistance,  10
		lt?     
code_00ef:
		ret     
	)
)

(procedure (proc982_2 param1 param2)
	(asm
		lsp      argc
		ldi      2
		ge?     
		bnt      code_00ff
		lsp      param1
		lap      param2
		sub     
		sap      param1
code_00ff:
		lsp      param1
		ldi      65356
		le?     
		bnt      code_0111
		lsp      param1
		ldi      360
		add     
		jmp      code_0125
code_0111:
		lsp      param1
		ldi      180
		gt?     
		bnt      code_0123
		lsp      param1
		ldi      360
		sub     
		jmp      code_0125
code_0123:
		lap      param1
code_0125:
		ret     
	)
)
