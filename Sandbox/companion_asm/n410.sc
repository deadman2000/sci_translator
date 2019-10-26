;;; Sierra Script 1.0 - (do not remove this comment)
(script# 410)
(include sci.sh)
(use n000)
(use n937)
(use n950)
(use n994)
(use n999)

(public
	rm410 0
)

(local
	local0
)
(instance rm410 of Rm
	(properties
		picture 410
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #posn
			pushi    2
			pushi    152
			pushi    183
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lag      global0
			send     18
			pushi    #init
			pushi    0
			lofsa    trapDoor
			send     4
			lag      global65
			sal      local0
			lofsa    goThere
			sag      global65
			pushi    #type
			pushi    1
			pushi    16384
			pushi    #at
			pushi    1
			pushi    0
			class    IconBar
			send     6
			send     6
			pushi    0
			callb    proc0_4,  0
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #type
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			class    IconBar
			send     6
			send     6
			lal      local0
			sag      global65
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance goThere of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_00be
			ret     
code_00be:
			lsp      param1
			dup     
			ldi      1
			eq?     
			bnt      code_00ec
			pushi    #z
			pushi    0
			lap      param2
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_00d9
			ret     
			jmp      code_00f7
code_00d9:
			pushi    #newRoom
			pushi    1
			pushi    #z
			pushi    0
			lap      param2
			send     4
			push    
			lag      global2
			send     6
			jmp      code_00f7
code_00ec:
			pushi    #doit
			pushi    2
			lsp      param1
			lsp      param2
			lal      local0
			send     8
code_00f7:
			toss    
			ret     
		)
	)
)

(instance trapDoor of Feature
	(properties
		z 410
		nsTop 8
		nsLeft 136
		nsBottom 20
		nsRight 192
	)
	
	(method (onMe param1)
		(asm
			pTos     nsLeft
			pushi    #x
			pushi    0
			lap      param1
			send     4
			le?     
			bnt      code_013f
			pprev   
			pToa     nsRight
			le?     
			bnt      code_013f
			pTos     nsTop
			pushi    #y
			pushi    0
			lap      param1
			send     4
			le?     
			bnt      code_013f
			pprev   
			pToa     nsBottom
			le?     
code_013f:
			ret     
		)
	)
)
