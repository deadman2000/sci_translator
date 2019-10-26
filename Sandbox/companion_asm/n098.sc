;;; Sierra Script 1.0 - (do not remove this comment)
(script# 98)
(include sci.sh)
(use n000)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	logo 0
)

(local
	local0
	local1
)
(instance logo of Rm
	(properties
		picture 106
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    1
			pushi    803
			lag      global2
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #init
			pushi    0
			lofsa    glint
			send     4
			pushi    #init
			pushi    0
			lofsa    glint2
			send     4
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			pushi    43
			pushi    #superClass
			pushi    1
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global100
			send     22
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_0086
			ldi      10
			sal      local0
			ldi      1
			sal      local1
			pushi    6
			pushi    0
			pushi    0
			pushi    200
			pushi    320
			pushi    0
			pushi    0
			callk    SetPort,  12
			jmp      code_008f
code_0086:
			ldi      32774
			sal      local0
			ldi      0
			sal      local1
code_008f:
			pushi    #setScript
			pushi    1
			lofsa    animScript
			push    
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    102
			pushi    #superClass
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      1
			or      
			push    
			lag      global100
			send     6
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance animScript of Script
	(properties)
	
	(method (doit param1)
		(asm
			lal      local1
			bnt      code_011c
			pushi    4
			pushi    6
			pushi    95
			pushi    218
			pushi    1
			callk    Palette,  8
code_011c:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_014f
			pushi    4
			dup     
			pushi    0
			pushi    254
			pushi    0
			callk    Palette,  8
			pushi    #drawPic
			pushi    2
			pushi    106
			lsl      local0
			lag      global2
			send     8
			ldi      1
			aTop     cycles
			jmp      code_022f
code_014f:
			dup     
			ldi      1
			eq?     
			bnt      code_017e
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			ldi      20
			eq?     
			bnt      code_0175
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    glint
			send     8
			jmp      code_022f
code_0175:
			dpToa    state
			ldi      1
			aTop     cycles
			jmp      code_022f
code_017e:
			dup     
			ldi      2
			eq?     
			bnt      code_01b5
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			ldi      30
			eq?     
			bnt      code_01ac
			pushi    #dispose
			pushi    0
			lofsa    glint
			send     4
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    glint2
			send     8
			jmp      code_022f
code_01ac:
			dpToa    state
			ldi      1
			aTop     cycles
			jmp      code_022f
code_01b5:
			dup     
			ldi      3
			eq?     
			bnt      code_01f9
			pushi    #cel
			pushi    0
			lofsa    glint2
			send     4
			push    
			pushi    #lastCel
			pushi    0
			lofsa    glint2
			send     4
			eq?     
			bnt      code_01f0
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_01f0
			pushi    #dispose
			pushi    0
			lofsa    glint2
			send     4
			ldi      1
			aTop     cycles
			jmp      code_022f
code_01f0:
			dpToa    state
			ldi      1
			aTop     cycles
			jmp      code_022f
code_01f9:
			dup     
			ldi      4
			eq?     
			bnt      code_0207
			ldi      60
			aTop     ticks
			jmp      code_022f
code_0207:
			dup     
			ldi      5
			eq?     
			bnt      code_022f
			pushi    #newRoom
			pushi    2
			pushi    96
			lsl      local0
			lag      global2
			send     8
			pushi    6
			pushi    0
			pushi    0
			pushi    190
			pushi    320
			pushi    10
			pushi    0
			callk    SetPort,  12
			pushi    #dispose
			pushi    0
			self     4
code_022f:
			toss    
			ret     
		)
	)
)

(instance glint of Prop
	(properties
		x 146
		y 37
		view 999
		cycleSpeed 2
	)
)

(instance glint2 of Prop
	(properties
		x 60
		y 155
		view 999
		loop 1
		cycleSpeed 2
	)
)
