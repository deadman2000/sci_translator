;;; Sierra Script 1.0 - (do not remove this comment)
(script# 926)
(include sci.sh)
(use n000)
(use n999)

(public
	proc926_0 0
	proc926_1 1
)

(procedure (proc926_0 param1 &tmp temp0)
	(asm
		lap      argc
		not     
		bnt      code_0027
		pushi    #obstacles
		pushi    0
		lag      global2
		send     4
		sat      temp0
		jmp      code_0047
code_0027:
		pushi    #isKindOf
		pushi    1
		class    Collect
		push    
		lap      param1
		send     6
		bnt      code_003b
		lap      param1
		sat      temp0
		jmp      code_0047
code_003b:
		pushi    #perform
		pushi    1
		lofsa    flipPoly
		push    
		lap      param1
		send     6
		ret     
code_0047:
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    flipPoly
		push    
		lat      temp0
		send     8
		pushi    1
		pushi    926
		callk    DisposeScript,  2
		ret     
	)
)

(procedure (proc926_1 param1 &tmp temp0)
	(asm
		lap      argc
		not     
		bnt      code_014a
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    flipFeature
		push    
		lag      global32
		send     8
		jmp      code_018b
code_014a:
		ldi      0
		sat      temp0
code_014e:
		lst      temp0
		lap      argc
		lt?     
		bnt      code_018b
		pushi    111
		pushi    1
		class    Collect
		push    
		lat      temp0
		lapi     param1
		send     0
		send     6
		bnt      code_0179
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    flipFeature
		push    
		lat      temp0
		lapi     param1
		send     8
		jmp      code_0186
code_0179:
		pushi    #perform
		pushi    1
		lofsa    flipFeature
		push    
		lat      temp0
		lapi     param1
		send     6
code_0186:
		+at      temp0
		jmp      code_014e
code_018b:
		pushi    1
		pushi    926
		callk    DisposeScript,  2
		ret     
	)
)

(instance flipPoly of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2)
		(asm
			pushi    2
			pushi    1
			pushi    4
			pushi    #size
			pushi    0
			lap      param1
			send     4
			sat      temp2
			mul     
			push    
			callk    Memory,  4
			sat      temp1
			ldi      0
			sat      temp0
code_0076:
			lst      temp0
			lat      temp2
			lt?     
			bnt      code_00e9
			pushi    3
			pushi    6
			lst      temp1
			pushi    4
			lat      temp0
			mul     
			add     
			push    
			pushi    319
			pushi    2
			pushi    5
			pushi    #points
			pushi    0
			lap      param1
			send     4
			push    
			pushi    4
			lat      temp2
			mul     
			add     
			push    
			pushi    4
			dup     
			lat      temp0
			mul     
			add     
			sub     
			push    
			callk    Memory,  4
			sub     
			push    
			callk    Memory,  6
			pushi    3
			pushi    6
			lst      temp1
			pushi    4
			lat      temp0
			mul     
			add     
			push    
			ldi      2
			add     
			push    
			pushi    2
			pushi    5
			pushi    #points
			pushi    0
			lap      param1
			send     4
			push    
			pushi    4
			lat      temp2
			mul     
			add     
			push    
			pushi    2
			pushi    4
			lat      temp0
			mul     
			add     
			sub     
			push    
			callk    Memory,  4
			push    
			callk    Memory,  6
			+at      temp0
			jmp      code_0076
code_00e9:
			pushi    #dynamic
			pushi    0
			lap      param1
			send     4
			bnt      code_0102
			pushi    2
			pushi    3
			pushi    #points
			pushi    0
			lap      param1
			send     4
			push    
			callk    Memory,  4
code_0102:
			pushi    #points
			pushi    1
			lst      temp1
			pushi    231
			pushi    1
			pushi    1
			lap      param1
			send     12
			ret     
		)
	)
)

(instance flipFeature of Code
	(properties)
	
	(method (doit param1 &tmp temp0)
		(asm
			pushi    1
			pushi    #onMeCheck
			pushi    0
			lap      param1
			send     4
			push    
			callk    IsObject,  2
			bnt      code_01b6
			pushi    1
			pushi    #onMeCheck
			pushi    0
			lap      param1
			send     4
			push    
			call     localproc_0012,  2
			jmp      code_01dc
code_01b6:
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			sat      temp0
			pushi    10
			pushi    1
			pushi    #mapKeyToDir
			pushi    #nsRight
			pushi    0
			lap      param1
			send     4
			sub     
			push    
			pushi    12
			pushi    1
			pushi    320
			lat      temp0
			sub     
			push    
			lap      param1
			send     12
code_01dc:
			ret     
		)
	)
)
