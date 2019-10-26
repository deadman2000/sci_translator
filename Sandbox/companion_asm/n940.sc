;;; Sierra Script 1.0 - (do not remove this comment)
(script# 940)
(include sci.sh)
(use n000)
(use n255)

(public
	proc940_0 0
)

(procedure (proc940_0 param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10 temp11 temp12 temp13 temp14)
	(asm
		ldi      65535
		sat      temp11
		sat      temp10
		ldi      0
		sat      temp6
		sat      temp5
		sat      temp4
		sat      temp3
		ldi      0
		sat      temp12
		ldi      0
		sat      temp14
		pushi    #window
		pushi    1
		lsg      global38
		pushi    #new
		pushi    0
		class    Dialog
		send     4
		sat      temp1
		send     6
		ldi      0
		sat      temp0
code_003c:
		lst      temp0
		lap      argc
		lt?     
		bnt      code_01b3
		lat      temp0
		lapi     param1
		sat      temp8
		push    
		dup     
		ldi      106
		eq?     
		bnt      code_0062
		pushi    #nsBottom
		pushi    0
		lat      temp2
		send     4
		sat      temp5
		ldi      0
		sat      temp3
		jmp      code_01ad
code_0062:
		dup     
		ldi      67
		eq?     
		bnt      code_0078
		+at      temp0
		lapi     param1
		sat      temp10
		+at      temp0
		lapi     param1
		sat      temp11
		jmp      code_01ad
code_0078:
		dup     
		ldi      80
		eq?     
		bnt      code_0088
		+at      temp0
		lapi     param1
		sat      temp12
		jmp      code_01ad
code_0088:
		dup     
		ldi      121
		eq?     
		bnt      code_0098
		+at      temp0
		lapi     param1
		sat      temp14
		jmp      code_01ad
code_0098:
		+at      temp0
		lst      temp8
		dup     
		ldi      26
		eq?     
		bnt      code_00b8
		pushi    #text
		pushi    1
		lat      temp0
		lspi     param1
		pushi    #new
		pushi    0
		class    DText
		send     4
		sat      temp2
		send     6
		jmp      code_013a
code_00b8:
		dup     
		ldi      81
		eq?     
		bnt      code_00db
		pushi    #text
		pushi    1
		lat      temp0
		lspi     param1
		pushi    77
		pushi    1
		+at      temp0
		lspi     param1
		pushi    #new
		pushi    0
		class    DButton
		send     4
		sat      temp2
		send     12
		jmp      code_013a
code_00db:
		dup     
		ldi      82
		eq?     
		bnt      code_0105
		pushi    #view
		pushi    1
		lat      temp0
		lspi     param1
		pushi    6
		pushi    1
		+at      temp0
		lspi     param1
		pushi    7
		pushi    1
		+at      temp0
		lspi     param1
		pushi    #new
		pushi    0
		class    DIcon
		send     4
		sat      temp2
		send     18
		jmp      code_013a
code_0105:
		dup     
		ldi      41
		eq?     
		bnt      code_0128
		pushi    #text
		pushi    1
		lat      temp0
		lspi     param1
		pushi    37
		pushi    1
		+at      temp0
		lspi     param1
		pushi    #new
		pushi    0
		class    DEdit
		send     4
		sat      temp2
		send     12
		jmp      code_013a
code_0128:
		pushi    #text
		pushi    1
		-at      temp0
		lspi     param1
		pushi    #new
		pushi    0
		class    DText
		send     4
		sat      temp2
		send     6
code_013a:
		toss    
		lst      temp0
		ldi      1
		add     
		push    
		lap      argc
		lt?     
		bnt      code_015f
		lst      temp0
		ldi      1
		add     
		lspi     param1
		ldi      4
		eq?     
		bnt      code_015f
		+at      temp0
		lst      temp3
		+at      temp0
		lapi     param1
		add     
		sat      temp3
code_015f:
		lst      temp0
		ldi      1
		add     
		push    
		lap      argc
		lt?     
		bnt      code_0183
		lst      temp0
		ldi      1
		add     
		lspi     param1
		ldi      3
		eq?     
		bnt      code_0183
		+at      temp0
		lst      temp5
		+at      temp0
		lapi     param1
		add     
		sat      temp5
code_0183:
		pushi    170
		pushi    0
		pushi    #moveTo
		pushi    2
		lst      temp3
		ldi      4
		add     
		push    
		lst      temp5
		ldi      4
		add     
		push    
		lat      temp2
		send     12
		pushi    #add
		pushi    1
		lst      temp2
		lat      temp1
		send     6
		pushi    #nsRight
		pushi    0
		lat      temp2
		send     4
		sat      temp3
code_01ad:
		toss    
		+at      temp0
		jmp      code_003c
code_01b3:
		pushi    #setSize
		pushi    0
		pushi    182
		pushi    0
		lat      temp1
		send     8
		pushi    172
		pushi    2
		pushi    65535
		lat      temp10
		eq?     
		bnt      code_01d5
		pushi    #nsLeft
		pushi    0
		lat      temp1
		send     4
		jmp      code_01d7
code_01d5:
		lat      temp10
code_01d7:
		push    
		pushi    65535
		lat      temp11
		eq?     
		bnt      code_01ea
		pushi    #nsTop
		pushi    0
		lat      temp1
		send     4
		jmp      code_01ec
code_01ea:
		lat      temp11
code_01ec:
		push    
		lat      temp1
		send     8
		lat      temp12
		bnt      code_01fe
		pushi    #text
		pushi    1
		push    
		lat      temp1
		send     6
code_01fe:
		pushi    #at
		pushi    1
		lst      temp14
		lat      temp1
		send     6
		sat      temp13
		pushi    1
		pushi    #state
		pushi    0
		send     4
		and     
		not     
		bnt      code_0218
		ldi      0
		sat      temp13
code_0218:
		pushi    181
		pushi    2
		lat      temp12
		bnt      code_0226
		ldi      4
		jmp      code_0228
code_0226:
		ldi      0
code_0228:
		push    
		pushi    65535
		pushi    60
		pushi    1
		lst      temp13
		lat      temp1
		send     14
		sat      temp7
		pushi    1
		push    
		callk    IsObject,  2
		bnt      code_025b
		pushi    #isKindOf
		pushi    1
		class    DButton
		push    
		lat      temp7
		send     6
		bnt      code_0257
		pushi    #value
		pushi    0
		lat      temp7
		send     4
		sat      temp7
		jmp      code_025b
code_0257:
		ldi      1
		sat      temp7
code_025b:
		pushi    #dispose
		pushi    0
		lat      temp1
		send     4
		lat      temp7
		ret     
	)
)
