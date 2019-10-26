;;; Sierra Script 1.0 - (do not remove this comment)
(script# 933)
(include sci.sh)
(use n000)
(use n999)


(class PseudoMouse of Code
	(properties
		cursorInc 2
		minInc 2
		maxInc 20
		prevDir 0
		joyInc 5
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			pushi    #x
			pushi    0
			lag      global24
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lag      global24
			send     4
			sat      temp1
			pTos     prevDir
			dup     
			ldi      1
			eq?     
			bnt      code_00fb
			lst      temp1
			pToa     cursorInc
			sub     
			sat      temp1
			jmp      code_018b
code_00fb:
			dup     
			ldi      2
			eq?     
			bnt      code_0113
			lst      temp0
			pToa     cursorInc
			add     
			sat      temp0
			lst      temp1
			pToa     cursorInc
			sub     
			sat      temp1
			jmp      code_018b
code_0113:
			dup     
			ldi      3
			eq?     
			bnt      code_0124
			lst      temp0
			pToa     cursorInc
			add     
			sat      temp0
			jmp      code_018b
code_0124:
			dup     
			ldi      4
			eq?     
			bnt      code_013c
			lst      temp0
			pToa     cursorInc
			add     
			sat      temp0
			lst      temp1
			pToa     cursorInc
			add     
			sat      temp1
			jmp      code_018b
code_013c:
			dup     
			ldi      5
			eq?     
			bnt      code_014d
			lst      temp1
			pToa     cursorInc
			add     
			sat      temp1
			jmp      code_018b
code_014d:
			dup     
			ldi      6
			eq?     
			bnt      code_0165
			lst      temp0
			pToa     cursorInc
			sub     
			sat      temp0
			lst      temp1
			pToa     cursorInc
			add     
			sat      temp1
			jmp      code_018b
code_0165:
			dup     
			ldi      7
			eq?     
			bnt      code_0176
			lst      temp0
			pToa     cursorInc
			sub     
			sat      temp0
			jmp      code_018b
code_0176:
			dup     
			ldi      8
			eq?     
			bnt      code_018b
			lst      temp0
			pToa     cursorInc
			sub     
			sat      temp0
			lst      temp1
			pToa     cursorInc
			sub     
			sat      temp1
code_018b:
			toss    
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			lst      temp0
			lst      temp1
			lag      global1
			send     12
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #canInput
			pushi    0
			lag      global80
			send     4
			bnt      code_00b4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_00b4
			lag      global69
			not     
			bt       code_0034
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      1
			ne?     
code_0034:
			bnt      code_0043
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			aTop     prevDir
			jmp      code_0044
code_0043:
			ret     
code_0044:
			aTop     prevDir
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_006c
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_0067
			pToa     minInc
			jmp      code_006e
code_0067:
			pToa     maxInc
			jmp      code_006e
code_006c:
			pToa     joyInc
code_006e:
			aTop     cursorInc
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_0097
			pToa     prevDir
			bnt      code_008b
			pushi    #doit
			pushi    0
			self     4
			jmp      code_00ab
code_008b:
			pushi    #claimed
			pushi    1
			pushi    0
			lap      pEvent
			send     6
			ret     
			jmp      code_00ab
code_0097:
			pToa     prevDir
			bnt      code_00a5
			pushi    #start
			pushi    0
			self     4
			jmp      code_00ab
code_00a5:
			pushi    #stop
			pushi    0
			self     4
code_00ab:
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ret     
code_00b4:
			ret     
		)
	)
	
	(method (start param1)
		(asm
			lap      argc
			bnt      code_00be
			lap      param1
			aTop     prevDir
code_00be:
			pushi    #add
			pushi    1
			pushSelf
			lag      global78
			send     6
			ret     
		)
	)
	
	(method (stop)
		(asm
			ldi      0
			aTop     prevDir
			pushi    #delete
			pushi    1
			pushSelf
			lag      global78
			send     6
			ret     
		)
	)
)
