;;; Sierra Script 1.0 - (do not remove this comment)
(script# 690)
(include sci.sh)
(use n000)
(use n625)
(use n851)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm690 0
)

(local
	local0
	[local1 3]
	[local4 3] = [282 200 107]
	[local7 3] = [86 200 189]
	local10
	[local11 7]
	[local18 8] = [206 143 278 157 307 237 76 264]
	[local26 8] = [144 134 127 184 91 117 173 86]
	[local34 8] = [8 8 9 9 9 9 8 8]
	local42
	[local43 5] = [1690 0 1 2]
	[local48 4] = [1690 2 2]
)
(procedure (localproc_000e)
	(asm
		ldi      0
		sal      local10
code_0012:
		lsl      local10
		ldi      4
		lt?     
		bnt      code_0046
		pushi    #new
		pushi    0
		lofsa    clFog
		send     4
		push    
		lal      local10
		sali     local1
		pushi    #x
		pushi    1
		lal      local10
		lsli     local4
		pushi    3
		pushi    1
		lsli     local7
		pushi    288
		pushi    1
		pushi    221
		pushi    107
		pushi    0
		lali     local1
		send     22
		+al      local10
		jmp      code_0012
code_0046:
		ret     
	)
)

(procedure (localproc_0047 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_004d:
		lst      temp0
		ldi      7
		lt?     
		bnt      code_007d
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local18
		pushi    3
		pushi    1
		lsli     local26
		pushi    6
		pushi    1
		lsli     local34
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local11
		send     22
		+at      temp0
		jmp      code_004d
code_007d:
		ret     
	)
)

(instance rm690 of Rm
	(properties
		picture 690
		style $000a
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0092
			pushi    0
			call     localproc_0047,  0
code_0092:
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_00ad
			pushi    #view
			pushi    1
			pushi    590
			pushi    6
			pushi    1
			pushi    2
			lofsa    clFog
			send     12
			jmp      code_00bc
code_00ad:
			pushi    #view
			pushi    1
			pushi    690
			pushi    6
			pushi    1
			pushi    0
			lofsa    clFog
			send     12
code_00bc:
			pushi    #view
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    171
			pushi    130
			pushi    17
			pushi    1
			pushi    2048
			pushi    107
			pushi    0
			lag      global0
			send     36
			pushi    #number
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #init
			pushi    0
			lofsa    theBoat
			send     4
			pushi    #init
			pushi    0
			lofsa    fulk
			send     4
			pushi    #init
			pushi    0
			lofsa    gate
			send     4
			pushi    0
			call     localproc_000e,  0
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			+al      local42
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_013d
			lsl      local42
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_013d
			pushi    4
			pushi    6
			pushi    225
			pushi    255
			pushi    65535
			callk    Palette,  8
code_013d:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_014d
			ldi      0
			jmp      code_0159
code_014d:
			pushi    #setScript
			pushi    1
			lofsa    gateDown
			push    
			lag      global0
			send     6
code_0159:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			ldi      0
			sal      local10
code_0166:
			lsl      local10
			ldi      8
			lt?     
			bnt      code_018a
			pushi    #contains
			pushi    1
			lal      local10
			lsli     local1
			lag      global5
			send     6
			bnt      code_0185
			pushi    #dispose
			pushi    0
			lal      local10
			lali     local1
			send     4
code_0185:
			+al      local10
			jmp      code_0166
code_018a:
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance gate of Prop
	(properties
		x 123
		y 60
		view 681
		loop 5
		cel 8
	)
)

(instance clFog of Prop
	(properties
		signal $4001
	)
)

(instance wave of Prop
	(properties
		view 681
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_02cc
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			self     12
			jmp      code_02e0
code_02cc:
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Rev
			push    
			self     12
code_02e0:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance theBoat of Actor
	(properties
		x 195
		y 113
		view 21
		loop 1
	)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_0381
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      24
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      20
			sub     
			push    
			self     8
			jmp      code_0387
code_0381:
			pushi    #doit
			pushi    0
			super    Actor,  4
code_0387:
			ret     
		)
	)
)

(instance fulk of Actor
	(properties
		x 134
		y 127
		view 674
		loop 3
		cel 9
	)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_0439
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      37
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			sub     
			push    
			self     8
			jmp      code_043f
code_0439:
			pushi    #doit
			pushi    0
			super    Actor,  4
code_043f:
			ret     
		)
	)
)

(instance gateDown of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    steelGate
			send     4
			pushi    #dispose
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
			bnt      code_04ee
			pushi    0
			callb    proc0_3,  0
			ldi      36
			aTop     ticks
			jmp      code_05a3
code_04ee:
			dup     
			ldi      1
			eq?     
			bnt      code_050d
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    gate
			send     8
			pushi    #play
			pushi    0
			lofsa    steelGate
			send     4
			jmp      code_05a3
code_050d:
			dup     
			ldi      2
			eq?     
			bnt      code_0553
			pushi    #number
			pushi    1
			pushi    532
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lofsa    steelGate
			send     16
			pushi    4
			lea      @local43
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    8
			pushSelf
			calle    proc851_0,  8
			pushi    #number
			pushi    1
			pushi    583
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global168
			send     16
			jmp      code_05a3
code_0553:
			dup     
			ldi      3
			eq?     
			bnt      code_0575
			pushi    4
			lea      @local48
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    8
			pushSelf
			calle    proc851_0,  8
			jmp      code_05a3
code_0575:
			dup     
			ldi      4
			eq?     
			bnt      code_05a3
			pushi    #cel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     18
			pushi    1
			pushi    13
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    outOfHere
			push    
			lag      global0
			send     6
code_05a3:
			toss    
			ret     
		)
	)
)

(instance outOfHere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0616
			pushi    #fade
			pushi    4
			pushi    50
			pushi    30
			pushi    5
			pushi    0
			lag      global168
			send     12
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    395
			pushi    190
			pushSelf
			lag      global0
			send     12
			jmp      code_0628
code_0616:
			dup     
			ldi      1
			eq?     
			bnt      code_0628
			pushi    #newRoom
			pushi    1
			pushi    600
			lag      global2
			send     6
code_0628:
			toss    
			ret     
		)
	)
)

(instance steelGate of Sound
	(properties
		flags $0001
		number 673
		loop -1
	)
)
