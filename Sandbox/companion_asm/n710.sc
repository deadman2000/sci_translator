;;; Sierra Script 1.0 - (do not remove this comment)
(script# 710)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n958)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm710 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15 =  1
	local16
	local17
	[local18 5] = [118 133 152 171 183]
	[local23 5] = [29 27 25 23 26]
	[local28 10] = [125 125 125 125 125 127 129 131 133 134]
	[local38 10] = [175 175 175 172 170 168 165 162 158 156]
)
(procedure (localproc_035a)
	(asm
		lsl      local15
		dup     
		ldi      0
		eq?     
		bnt      code_0368
		ldi      88
		jmp      code_03d1
code_0368:
		dup     
		ldi      1
		eq?     
		bnt      code_0374
		ldi      88
		jmp      code_03d1
code_0374:
		dup     
		ldi      2
		eq?     
		bnt      code_0380
		ldi      86
		jmp      code_03d1
code_0380:
		dup     
		ldi      3
		eq?     
		bnt      code_038c
		ldi      80
		jmp      code_03d1
code_038c:
		dup     
		ldi      4
		eq?     
		bnt      code_0398
		ldi      78
		jmp      code_03d1
code_0398:
		dup     
		ldi      5
		eq?     
		bnt      code_03a4
		ldi      76
		jmp      code_03d1
code_03a4:
		dup     
		ldi      6
		eq?     
		bnt      code_03b0
		ldi      71
		jmp      code_03d1
code_03b0:
		dup     
		ldi      7
		eq?     
		bnt      code_03bc
		ldi      69
		jmp      code_03d1
code_03bc:
		dup     
		ldi      8
		eq?     
		bnt      code_03c8
		ldi      65
		jmp      code_03d1
code_03c8:
		dup     
		ldi      9
		eq?     
		bnt      code_03d1
		ldi      60
code_03d1:
		toss    
		sal      local13
		lsl      local15
		dup     
		ldi      0
		eq?     
		bnt      code_03e2
		ldi      68
		jmp      code_044b
code_03e2:
		dup     
		ldi      1
		eq?     
		bnt      code_03ee
		ldi      68
		jmp      code_044b
code_03ee:
		dup     
		ldi      2
		eq?     
		bnt      code_03fa
		ldi      64
		jmp      code_044b
code_03fa:
		dup     
		ldi      3
		eq?     
		bnt      code_0406
		ldi      62
		jmp      code_044b
code_0406:
		dup     
		ldi      4
		eq?     
		bnt      code_0412
		ldi      58
		jmp      code_044b
code_0412:
		dup     
		ldi      5
		eq?     
		bnt      code_041e
		ldi      58
		jmp      code_044b
code_041e:
		dup     
		ldi      6
		eq?     
		bnt      code_042a
		ldi      54
		jmp      code_044b
code_042a:
		dup     
		ldi      7
		eq?     
		bnt      code_0436
		ldi      51
		jmp      code_044b
code_0436:
		dup     
		ldi      8
		eq?     
		bnt      code_0442
		ldi      47
		jmp      code_044b
code_0442:
		dup     
		ldi      9
		eq?     
		bnt      code_044b
		ldi      45
code_044b:
		toss    
		sal      local14
		ret     
	)
)

(procedure (localproc_044f)
	(asm
		pushi    80
		lag      global125
		div     
		sal      local2
		pushi    2
		pushi    3
		pushi    66
		lag      global125
		div     
		push    
		lsl      local15
		ldi      2
		mul     
		sub     
		push    
		calle    proc999_3,  4
		sal      local3
		pushi    36
		lag      global125
		div     
		sal      local0
		pushi    4
		lag      global125
		add     
		sal      local1
		lsg      global125
		dup     
		ldi      2
		eq?     
		bnt      code_048a
		ldi      5
		jmp      code_049f
code_048a:
		dup     
		ldi      3
		eq?     
		bnt      code_0496
		ldi      4
		jmp      code_049f
code_0496:
		dup     
		ldi      4
		eq?     
		bnt      code_049f
		ldi      2
code_049f:
		toss    
		sal      local4
		lsl      local15
		ldi      3
		le?     
		bnt      code_04b5
		pushi    30
		lsg      global125
		ldi      2
		mul     
		sub     
		jmp      code_04d8
code_04b5:
		lsl      local15
		ldi      6
		le?     
		bnt      code_04c8
		pushi    25
		lsg      global125
		ldi      2
		mul     
		sub     
		jmp      code_04d8
code_04c8:
		lsl      local15
		ldi      9
		le?     
		bnt      code_04d8
		pushi    20
		lsg      global125
		ldi      2
		mul     
		sub     
code_04d8:
		sal      local6
		lsg      global125
		ldi      1
		sub     
		sal      local5
		ret     
	)
)

(procedure (localproc_04e2)
	(asm
		ldi      1
		sal      local16
		pushi    #cycleSpeed
		pushi    1
		lsl      local5
		pushi    56
		pushi    1
		lsl      local5
		pushi    288
		pushi    1
		pushi    0
		pushi    150
		pushi    1
		class    Fwd
		push    
		pushi    283
		pushi    3
		class    MoveTo
		push    
		pushi    2
		lsl      local17
		pushi    #loop
		pushi    0
		lofsa    robin
		send     4
		lsli     local38
		calle    proc999_2,  4
		push    
		pushi    88
		lofsa    robin
		send     34
		ret     
	)
)

(procedure (localproc_0521)
	(asm
		ldi      65535
		sal      local16
		pushi    #cycleSpeed
		pushi    1
		lsl      local5
		pushi    56
		pushi    1
		lsl      local5
		pushi    288
		pushi    1
		pushi    0
		pushi    150
		pushi    1
		class    Rev
		push    
		pushi    283
		pushi    3
		class    MoveTo
		push    
		pushi    2
		lsl      local17
		pushi    #loop
		pushi    0
		lofsa    robin
		send     4
		lsli     local28
		calle    proc999_3,  4
		push    
		pushi    88
		lofsa    robin
		send     34
		ret     
	)
)

(instance rm710 of Rm
	(properties
		picture 710
	)
	
	(method (init)
		(asm
			lsg      global12
			ldi      702
			eq?     
			sal      local7
			lag      global125
			sal      local12
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_002b
			ldi      10
			jmp      code_002d
code_002b:
			ldi      8
code_002d:
			aTop     style
			pushi    3
			pushi    128
			pushi    711
			pushi    710
			calle    proc958_0,  6
			pushi    7
			pushi    132
			pushi    631
			pushi    931
			pushi    928
			pushi    929
			pushi    915
			pushi    930
			calle    proc958_0,  14
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #disable
			pushi    7
			pushi    0
			pushi    1
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     18
			pushi    0
			call     localproc_044f,  0
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    150
			pushi    175
			lag      global1
			send     12
			pushi    #init
			pushi    0
			lofsa    splashSound
			send     4
			pushi    #init
			pushi    0
			pushi    142
			pushi    3
			pushi    #new
			pushi    0
			lofsa    throwRock
			send     4
			push    
			pushi    0
			lofsa    rockL
			push    
			lofsa    fenL
			send     14
			pushi    #init
			pushi    0
			lofsa    fenR
			send     4
			pushi    #init
			pushi    0
			lofsa    rockL
			send     4
			pushi    #init
			pushi    0
			lofsa    rockR
			send     4
			pushi    #init
			pushi    0
			lofsa    robin
			send     4
			pushi    #number
			pushi    1
			pushi    631
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			ldi      88
			sal      local13
			ldi      68
			sal      local14
			pushi    162
			pushi    1
			lal      local7
			bnt      code_0108
			ldi      10
			jmp      code_010a
code_0108:
			ldi      8
code_010a:
			push    
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lal      local7
			bnt      code_011d
			lofsa    cmonRobin
			jmp      code_011f
code_011d:
			ldi      0
code_011f:
			push    
			lofsa    boat
			send     16
			lal      local7
			not     
			bnt      code_0196
			lsg      global125
			ldi      1
			eq?     
			bnt      code_0147
			ldi      1
			sal      local11
			pushi    #setScript
			pushi    1
			lofsa    toTheBoat
			push    
			lofsa    robin
			send     6
			jmp      code_0196
code_0147:
			pushi    1
			pushi    29
			calle    proc13_6,  2
			pushi    4
			pushi    1710
			pushi    0
			pushi    80
			lofsa    {Monk}
			push    
			calle    proc13_4,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #add
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #add
			pushi    1
			pushSelf
			lag      global74
			send     6
			pushi    8
			pushi    710
			pushi    0
			pushi    81
			lofsa    {YES}
			push    
			pushi    1
			pushi    81
			lofsa    {NO}
			push    
			pushi    0
			calle    proc13_1,  16
			bnt      code_0196
			pushi    #save
			pushi    0
			lag      global1
			send     4
code_0196:
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ret     
		)
	)
	
	(method (doit)
		(asm
			+al      local9
			push    
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_01b9
			pushi    4
			pushi    6
			pushi    240
			pushi    255
			pushi    65535
			callk    Palette,  8
code_01b9:
			lal      local10
			not     
			bnt      code_01f0
			lsg      global125
			lal      local12
			ne?     
			bnt      code_01f0
			lag      global125
			sal      local12
			lsg      global125
			ldi      1
			eq?     
			bnt      code_01eb
			ldi      1
			sal      local10
			ldi      1
			sal      local11
			pushi    #setScript
			pushi    1
			lofsa    toTheBoat
			push    
			lofsa    robin
			send     6
			jmp      code_01f0
code_01eb:
			pushi    0
			call     localproc_044f,  0
code_01f0:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #message
			pushi    1
			pushi    3
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #dispose
			pushi    0
			lofsa    splashSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    thudSound
			send     4
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global74
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 temp2)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_0284
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      3
			eq?     
			bnt      code_0270
			ldi      319
			sal      local17
			pushi    0
			call     localproc_04e2,  0
			jmp      code_0280
code_0270:
			dup     
			ldi      7
			eq?     
			bnt      code_0280
			ldi      0
			sal      local17
			pushi    0
			call     localproc_0521,  0
code_0280:
			toss    
			jmp      code_0307
code_0284:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bnt      code_0307
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			lsl      local13
			lal      local14
			add     
			push    
			ldi      2
			div     
			sat      temp2
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			sal      local17
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			ldi      20
			sub     
			sat      temp0
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			ldi      20
			add     
			sat      temp1
			lsl      local14
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			lt?     
			bnt      code_0307
			pprev   
			lal      local13
			lt?     
			bnt      code_0307
			lsl      local17
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			le?     
			bnt      code_02f4
			pushi    0
			call     localproc_0521,  0
			jmp      code_0307
code_02f4:
			lsl      local17
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			gt?     
			bnt      code_0307
			pushi    0
			call     localproc_04e2,  0
code_0307:
			ret     
		)
	)
)

(instance robin of Actor
	(properties
		x 149
		y 88
		yStep 1
		view 711
		loop 1
		cel 91
		priority 11
		signal $6810
	)
	
	(method (doit)
		(asm
			lal      local10
			not     
			bnt      code_0584
			pToa     script
			bnt      code_056e
			jmp      code_0584
code_056e:
			pToa     cycler
			bnt      code_0584
			pToa     mover
			not     
			bnt      code_0584
			pushi    #setCycle
			pushi    1
			pushi    0
			self     6
			ldi      0
			sal      local16
code_0584:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance fenL of Actor
	(properties
		x 115
		y 193
		yStep 4
		view 710
		priority 14
		signal $6810
		cycleSpeed 18
		illegalBits $0000
		moveSpeed 0
	)
)

(instance fenR of Actor
	(properties
		x 180
		y 193
		yStep 4
		view 710
		loop 1
		priority 14
		signal $6810
		cycleSpeed 18
		illegalBits $0000
		moveSpeed 0
	)
)

(instance boat of Actor
	(properties
		x 173
		y 50
		view 710
		loop 8
		priority 10
		signal $0810
		cycleSpeed 18
		illegalBits $0000
		moveSpeed 18
	)
)

(instance rockL of Actor
	(properties
		yStep 6
		view 710
		loop 2
		priority 13
		signal $4890
		illegalBits $0000
		xStep 4
	)
)

(instance rockR of Actor
	(properties
		yStep 6
		view 710
		loop 2
		priority 13
		signal $4890
		illegalBits $0000
		xStep 4
	)
)

(instance throwRock of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_089d
			lal      local0
			aTop     ticks
			jmp      code_0cee
code_089d:
			dup     
			ldi      1
			eq?     
			bnt      code_08d3
			pushi    288
			pushi    1
			pushi    0
			pushi    55
			pushi    1
			lsl      local1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pTos     client
			lofsa    fenR
			eq?     
			bnt      code_08c5
			ldi      180
			jmp      code_08c7
code_08c5:
			ldi      115
code_08c7:
			push    
			pushi    157
			pushSelf
			pToa     client
			send     24
			jmp      code_0cee
code_08d3:
			dup     
			ldi      2
			eq?     
			bnt      code_08ee
			lal      local10
			bnt      code_08e7
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0cee
code_08e7:
			ldi      12
			aTop     ticks
			jmp      code_0cee
code_08ee:
			dup     
			ldi      3
			eq?     
			bnt      code_0912
			pushi    #setCel
			pushi    1
			pushi    1
			pToa     client
			send     6
			lal      local10
			bnt      code_090b
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0cee
code_090b:
			lal      local2
			aTop     ticks
			jmp      code_0cee
code_0912:
			dup     
			ldi      4
			eq?     
			bnt      code_0ab2
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    End
			push    
			pToa     client
			send     12
			lsl      local16
			ldi      1
			eq?     
			bnt      code_094c
			pushi    2
			lal      local15
			lsli     local38
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local3
			add     
			push    
			calle    proc999_2,  4
			jmp      code_0996
code_094c:
			lsl      local16
			ldi      65535
			eq?     
			bnt      code_096f
			pushi    2
			lal      local15
			lsli     local28
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local3
			sub     
			push    
			calle    proc999_3,  4
			jmp      code_0996
code_096f:
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local15
			lsli     local28
			ldi      15
			add     
			le?     
			bnt      code_098a
			lal      local15
			lali     local28
			jmp      code_0996
code_098a:
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local3
			sub     
code_0996:
			sat      temp1
			lsl      local16
			ldi      1
			eq?     
			bnt      code_09be
			pushi    2
			lal      local15
			lsli     local38
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lsl      local3
			ldi      2
			mul     
			add     
			push    
			calle    proc999_2,  4
			jmp      code_0a0b
code_09be:
			lsl      local16
			ldi      65535
			eq?     
			bnt      code_09e4
			pushi    2
			lal      local15
			lsli     local28
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lsl      local3
			ldi      2
			mul     
			sub     
			push    
			calle    proc999_3,  4
			jmp      code_0a0b
code_09e4:
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local15
			lsli     local38
			ldi      15
			sub     
			ge?     
			bnt      code_09ff
			lal      local15
			lali     local38
			jmp      code_0a0b
code_09ff:
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local3
			add     
code_0a0b:
			sat      temp2
			lal      local7
			bnt      code_0a1d
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			jmp      code_0a38
code_0a1d:
			lst      temp1
			lat      temp2
			lt?     
			bnt      code_0a30
			pushi    2
			lst      temp1
			lst      temp2
			callk    Random,  4
			jmp      code_0a38
code_0a30:
			pushi    2
			lst      temp2
			lst      temp1
			callk    Random,  4
code_0a38:
			sat      temp3
			lal      local7
			bnt      code_0a47
			lsl      local13
			ldi      5
			sub     
			jmp      code_0a5a
code_0a47:
			pushi    2
			lsl      local13
			lal      local3
			add     
			push    
			lsl      local14
			lsl      local3
			ldi      2
			div     
			add     
			push    
			callk    Random,  4
code_0a5a:
			sat      temp4
			pushi    284
			pushi    2
			pTos     client
			lofsa    fenR
			eq?     
			bnt      code_0a6f
			ldi      158
			jmp      code_0a72
code_0a6f:
			ldi      137
code_0a72:
			push    
			pushi    121
			pushi    7
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    2
			pushi    55
			pushi    1
			pushi    6
			pushi    66
			pushi    1
			pushi    13
			pushi    194
			pushi    0
			pushi    219
			pushi    1
			lsl      local4
			pushi    56
			pushi    1
			lsl      local4
			pushi    150
			pushi    1
			class    End
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp3
			lst      temp4
			pushSelf
			pToa     register
			send     66
			jmp      code_0cee
code_0ab2:
			dup     
			ldi      5
			eq?     
			bnt      code_0c6f
			pushi    2
			pushi    4
			pushi    16
			lsg      global125
			ldi      2
			mul     
			sub     
			push    
			lal      local15
			sub     
			push    
			calle    proc999_3,  4
			sat      temp5
			pushi    #play
			pushi    0
			lofsa    thudSound
			send     4
			lal      local8
			not     
			bnt      code_0b4d
			lal      local10
			not     
			bnt      code_0b4d
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lat      temp5
			sub     
			push    
			pushi    #x
			pushi    0
			pToa     register
			send     4
			le?     
			bnt      code_0b4d
			pprev   
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lat      temp5
			add     
			le?     
			bnt      code_0b4d
			pushi    #y
			pushi    0
			pToa     register
			send     4
			push    
			lal      local13
			le?     
			bnt      code_0b4d
			ldi      1
			sal      local10
			lal      local7
			not     
			bnt      code_0b38
			pushi    #delete
			pushi    1
			lsg      global2
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			lsg      global2
			lag      global74
			send     6
code_0b38:
			pushi    #play
			pushi    0
			lofsa    fallSound
			send     4
			pushi    #setScript
			pushi    1
			lofsa    fallOut
			push    
			lofsa    robin
			send     6
code_0b4d:
			lal      local10
			not     
			bnt      code_0c2d
			pTos     client
			lofsa    fenR
			eq?     
			bnt      code_0b77
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    throwRock
			send     4
			push    
			pushi    0
			lofsa    rockL
			push    
			lofsa    fenL
			send     10
			jmp      code_0b8f
code_0b77:
			pushi    #setScript
			pushi    3
			pushi    #new
			pushi    0
			lofsa    throwRock
			send     4
			push    
			pushi    0
			lofsa    rockR
			push    
			lofsa    fenR
			send     10
code_0b8f:
			pushi    1
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			pushi    #x
			pushi    0
			pToa     register
			send     4
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    1
			pushi    #y
			pushi    0
			lofsa    robin
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     register
			send     4
			sub     
			push    
			callk    Abs,  2
			add     
			push    
			lal      local6
			gt?     
			bnt      code_0bc6
			+al      local15
code_0bc6:
			lsl      local15
			ldi      9
			gt?     
			bnt      code_0bde
			pushi    #setScript
			pushi    1
			lofsa    toTheBoat
			push    
			lofsa    robin
			send     6
			jmp      code_0c2d
code_0bde:
			pushi    #setLoop
			pushi    1
			lsl      local15
			lofsa    robin
			send     6
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local15
			lali     local28
			le?     
			bnt      code_0c06
			pushi    #x
			pushi    1
			lal      local15
			lsli     local28
			lofsa    robin
			send     6
code_0c06:
			pushi    #x
			pushi    0
			lofsa    robin
			send     4
			push    
			lal      local15
			lali     local38
			ge?     
			bnt      code_0c23
			pushi    #x
			pushi    1
			lal      local15
			lsli     local38
			lofsa    robin
			send     6
code_0c23:
			pushi    0
			call     localproc_035a,  0
			pushi    0
			call     localproc_044f,  0
code_0c2d:
			pushi    2
			pushi    0
			lal      local10
			bnt      code_0c39
			ldi      1
			jmp      code_0c3b
code_0c39:
			ldi      4
code_0c3b:
			push    
			callk    Random,  4
			sat      temp0
			pushi    #yStep
			pushi    1
			pushi    8
			pushi    219
			pushi    1
			pushi    6
			pushi    142
			pushi    1
			pushi    #new
			pushi    0
			lofsa    rockSpin
			send     4
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lat      temp0
			lsli     local18
			lsli     local23
			pushSelf
			pToa     register
			send     30
			jmp      code_0cee
code_0c6f:
			dup     
			ldi      6
			eq?     
			bnt      code_0cb5
			lal      local10
			not     
			bnt      code_0c9d
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pTos     client
			lofsa    fenR
			eq?     
			bnt      code_0c93
			ldi      180
			jmp      code_0c95
code_0c93:
			ldi      115
code_0c95:
			push    
			pushi    193
			pToa     client
			send     10
code_0c9d:
			pushi    #play
			pushi    0
			lofsa    splashSound
			send     4
			pushi    #setScript
			pushi    1
			pushi    0
			pToa     register
			send     6
			ldi      4
			aTop     ticks
			jmp      code_0cee
code_0cb5:
			dup     
			ldi      7
			eq?     
			bnt      code_0cdb
			pushi    #setLoop
			pushi    1
			pushi    6
			pushi    66
			pushi    1
			pushi    9
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     register
			send     26
			jmp      code_0cee
code_0cdb:
			dup     
			ldi      8
			eq?     
			bnt      code_0cee
			pushi    #hide
			pushi    0
			pToa     register
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0cee:
			toss    
			ret     
		)
	)
)

(instance rockSpin of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d3f
			ldi      6
			aTop     ticks
			jmp      code_0d75
code_0d3f:
			dup     
			ldi      1
			eq?     
			bnt      code_0d75
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			sat      temp0
			push    
			ldi      5
			eq?     
			bnt      code_0d5a
			ldi      1
			sat      temp0
code_0d5a:
			pushi    162
			pushi    #superClass
			lst      temp0
			ldi      1
			add     
			push    
			pToa     client
			send     6
			pTos     state
			ldi      2
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_0d75:
			toss    
			ret     
		)
	)
)

(instance fallOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e3b
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    #number
			pushi    1
			pushi    931
			pushi    42
			pushi    0
			lofsa    fallSound
			send     10
			pushi    219
			pushi    1
			pushi    #y
			pushi    56
			pushi    1
			pushi    3
			pushi    162
			pushi    1
			pushi    10
			pushi    55
			pushi    1
			pushi    5
			pushi    3
			pushi    1
			pushi    88
			lsl      local15
			ldi      5
			mul     
			sub     
			push    
			pushi    288
			pushi    1
			lsl      local15
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    10
			pushi    1
			pushSelf
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    144
			pushi    38
			lofsa    robin
			send     58
			lal      local7
			not     
			bnt      code_0e7f
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    boat
			send     12
			jmp      code_0e7f
code_0e3b:
			dup     
			ldi      1
			eq?     
			bnt      code_0e5e
			pushi    #play
			pushi    0
			lofsa    drownSound
			send     4
			ldi      38
			sag      global145
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robin
			send     8
			jmp      code_0e7f
code_0e5e:
			dup     
			ldi      2
			eq?     
			bnt      code_0e6d
			ldi      180
			aTop     ticks
			jmp      code_0e7f
code_0e6d:
			dup     
			ldi      3
			eq?     
			bnt      code_0e7f
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0e7f:
			toss    
			ret     
		)
	)
)

(instance toTheBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f2f
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local10
			ldi      1
			sal      local8
			pushi    #delete
			pushi    1
			lsg      global2
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			lsg      global2
			lag      global74
			send     6
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    56
			pushi    1
			pushi    12
			lofsa    robin
			send     12
			lsl      local15
			ldi      9
			le?     
			bnt      code_0f26
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			lsl      local15
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    149
			pushi    88
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robin
			send     30
			jmp      code_108b
code_0f26:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_108b
code_0f2f:
			dup     
			ldi      1
			eq?     
			bnt      code_0f6a
			pushi    #setLoop
			pushi    1
			pushi    9
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    155
			pushi    88
			pushSelf
			lofsa    robin
			send     24
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    boat
			send     12
			jmp      code_108b
code_0f6a:
			dup     
			ldi      2
			eq?     
			bnt      code_0f94
			pushi    #hide
			pushi    0
			lofsa    robin
			send     4
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    7
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    boat
			send     20
			jmp      code_108b
code_0f94:
			dup     
			ldi      3
			eq?     
			bnt      code_0fca
			pushi    #setLoop
			pushi    1
			pushi    9
			pushi    284
			pushi    2
			pushi    184
			pushi    50
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    115
			pushi    12
			pushSelf
			lofsa    boat
			send     32
			ldi      60
			aTop     ticks
			jmp      code_108b
code_0fca:
			dup     
			ldi      4
			eq?     
			bnt      code_0ff2
			pushi    1
			pushi    29
			calle    proc13_6,  2
			pushi    8
			pushi    1710
			pushi    1
			pushSelf
			pushi    80
			lofsa    {Monk}
			push    
			pushi    67
			pushi    65535
			pushi    75
			calle    proc13_4,  16
			jmp      code_108b
code_0ff2:
			dup     
			ldi      5
			eq?     
			bnt      code_0ffc
			jmp      code_108b
code_0ffc:
			dup     
			ldi      6
			eq?     
			bnt      code_1055
			pushi    #dispose
			pushi    0
			lofsa    boat
			send     4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			lofsa    fenL
			send     4
			pushi    #dispose
			pushi    0
			lofsa    fenR
			send     4
			pushi    #dispose
			pushi    0
			lofsa    rockL
			send     4
			pushi    #dispose
			pushi    0
			lofsa    rockR
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			lal      local11
			not     
			bnt      code_104e
			pushi    1
			pushi    100
			calle    proc806_1,  2
code_104e:
			ldi      60
			aTop     ticks
			jmp      code_108b
code_1055:
			dup     
			ldi      7
			eq?     
			bnt      code_107a
			pushi    #fade
			pushi    4
			pushi    70
			pushi    30
			pushi    8
			pushi    0
			lag      global100
			send     12
			pushi    3
			pushi    1710
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_108b
code_107a:
			dup     
			ldi      8
			eq?     
			bnt      code_108b
			pushi    #newRoom
			pushi    1
			pushi    9
			lag      global2
			send     6
code_108b:
			toss    
			ret     
		)
	)
)

(instance cmonRobin of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10e3
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1125
code_10e3:
			dup     
			ldi      1
			eq?     
			bnt      code_10f7
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			aTop     ticks
			jmp      code_1125
code_10f7:
			dup     
			ldi      2
			eq?     
			bnt      code_1114
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			pushi    2
			pushi    90
			pushi    240
			callk    Random,  4
			aTop     ticks
			jmp      code_1125
code_1114:
			dup     
			ldi      3
			eq?     
			bnt      code_1125
			ldi      65535
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_1125:
			toss    
			ret     
		)
	)
)

(instance splashSound of Sound
	(properties
		flags $0001
		number 928
	)
)

(instance thudSound of Sound
	(properties
		flags $0001
		number 929
	)
)

(instance fallSound of Sound
	(properties
		flags $0001
		number 915
	)
)

(instance drownSound of Sound
	(properties
		flags $0001
		number 930
	)
)
