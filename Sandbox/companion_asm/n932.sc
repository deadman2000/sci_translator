;;; Sierra Script 1.0 - (do not remove this comment)
(script# 932)
(include sci.sh)
(use n000)
(use n255)

(public
	proc932_0 0
	proc932_1 1
	proc932_2 2
	proc932_3 3
	proc932_4 4
	proc932_5 5
	proc932_6 6
	proc932_7 7
)

(local
	local0
	local1
)
(procedure (proc932_0 param1)
	(asm
		pushi    1
		pushi    0
		&rest    param1
		call     localproc_003c,  2
		ret     
	)
)

(procedure (proc932_1 param1)
	(asm
		pushi    1
		pushi    1
		&rest    param1
		call     localproc_003c,  2
		ret     
	)
)

(procedure (proc932_2 param1 param2 param3 param4)
	(asm
		pushi    #printLang
		pushi    0
		lag      global1
		send     4
		push    
		ldi      1
		eq?     
		bnt      code_00d3
		lsp      argc
		ldi      3
		lt?     
		bt       code_00c6
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		push    
		ldi      0
		eq?     
code_00c6:
		bnt      code_00ce
		lap      param1
		jmp      code_00f0
code_00ce:
		lap      param3
		jmp      code_00f0
code_00d3:
		lsp      argc
		ldi      4
		lt?     
		bt       code_00e6
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		push    
		ldi      0
		eq?     
code_00e6:
		bnt      code_00ee
		lap      param2
		jmp      code_00f0
code_00ee:
		lap      param4
code_00f0:
		ret     
	)
)

(procedure (proc932_3 &tmp temp0)
	(asm
		lal      local0
		not     
		bnt      code_0111
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		sat      temp0
		bnt      code_0111
		lat      temp0
		sal      local0
		pushi    #subtitleLang
		pushi    1
		pushi    0
		lag      global1
		send     6
code_0111:
		lat      temp0
		ret     
	)
)

(procedure (proc932_4 &tmp temp0)
	(asm
		lal      local0
		sat      temp0
		bnt      code_0135
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		not     
		bnt      code_0135
		pushi    #subtitleLang
		pushi    1
		lsl      local0
		lag      global1
		send     6
		ldi      0
		sal      local0
code_0135:
		lat      temp0
		ret     
	)
)

(procedure (proc932_5 &tmp temp0)
	(asm
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		sat      temp0
		bnt      code_0161
		pushi    #subtitleLang
		pushi    1
		pushi    #printLang
		pushi    0
		lag      global1
		send     4
		push    
		lag      global1
		send     6
		pushi    #printLang
		pushi    1
		lst      temp0
		lag      global1
		send     6
		ldi      1
		ret     
code_0161:
		ret     
	)
)

(procedure (proc932_6 param1 param2 param3 param4 &tmp temp0 temp1 temp2 [temp3 1000])
	(asm
		lsp      argc
		ldi      4
		eq?     
		bnt      code_017d
		pushi    3
		lea      @temp3
		push    
		lsp      param3
		lsp      param4
		callk    GetFarText,  6
		jmp      code_0187
code_017d:
		pushi    2
		lea      @temp3
		push    
		lsp      param3
		callk    StrCpy,  4
code_0187:
		pushi    #printLang
		pushi    0
		lag      global1
		send     4
		sat      temp0
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		sat      temp1
		pushi    #printLang
		pushi    1
		pushi    1
		pushi    88
		pushi    1
		pushi    0
		lag      global1
		send     12
		pushi    3
		lsp      param1
		lea      @temp3
		push    
		pushi    0
		callk    kernel_123,  6
		ldi      0
		sat      temp2
		bnt      code_01cf
		pushi    #printLang
		pushi    1
		push    
		lag      global1
		send     6
		pushi    3
		lsp      param2
		lea      @temp3
		push    
		pushi    0
		callk    kernel_123,  6
		jmp      code_01d9
code_01cf:
		pushi    2
		lsp      param2
		lofsa    {LOOKUP\_ERROR}
		push    
		callk    StrCpy,  4
code_01d9:
		pushi    #printLang
		pushi    1
		lst      temp0
		pushi    88
		pushi    1
		lst      temp1
		lag      global1
		send     12
		lap      param1
		ret     
	)
)

(procedure (proc932_7 param1 param2)
	(asm
		pushi    #parseLang
		pushi    0
		lag      global1
		send     4
		push    
		ldi      1
		eq?     
		bnt      code_01fd
		lap      param1
		jmp      code_01ff
code_01fd:
		lap      param2
code_01ff:
		ret     
	)
)

(procedure (localproc_003c param1 param2 &tmp temp0 temp1)
	(asm
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		sat      temp1
		pushi    #subtitleLang
		pushi    1
		pushi    0
		lag      global1
		send     6
		lap      param1
		bnt      code_005d
		pushi    0
		&rest    param2
		callk    Display,  0
		jmp      code_0066
code_005d:
		pushi    1
		&rest    param2
		pushi    121
		calle    proc255_0,  2
code_0066:
		lat      temp1
		bnt      code_009b
		pushi    #printLang
		pushi    0
		lag      global1
		send     4
		sat      temp0
		pushi    #printLang
		pushi    1
		lst      temp1
		lag      global1
		send     6
		lap      param1
		bnt      code_008b
		pushi    0
		&rest    param2
		callk    Display,  0
		jmp      code_0092
code_008b:
		pushi    0
		&rest    param2
		calle    proc255_0,  0
code_0092:
		pushi    #printLang
		pushi    1
		lst      temp0
		lag      global1
		send     6
code_009b:
		pushi    #subtitleLang
		pushi    1
		lst      temp1
		lag      global1
		send     6
		ret     
	)
)
