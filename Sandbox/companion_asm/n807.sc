;;; Sierra Script 1.0 - (do not remove this comment)
(script# 807)
(include sci.sh)
(use n000)
(use n961)
(use n989)


(local
	local0
	local1
	[local2 3] = [924 925 926]
	[local5 7] = [0 3 16 23 29 33 36]
	[local12 56] = [17 17 36 18 36 36 10 18 17 17 34 17 144 144 132 132 9 9 34 9 18 18 18 18 17 17 9 9 9 9 36 36 136 136 9 9 9 9 18 9 17 34 9 36 9 9 18 18 10 10 5 40 9 40 5 9]
	[local68 8] = [1 2 4 8 16 32 64 128]
)
(procedure (localproc_0004 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_000a:
		lst      temp0
		ldi      6
		le?     
		bnt      code_002d
		lat      temp0
		lsli     local5
		pushi    #view
		pushi    0
		lag      global0
		send     4
		eq?     
		bnt      code_0028
		pushi    8
		lat      temp0
		mul     
		sal      local1
code_0028:
		+at      temp0
		jmp      code_000a
code_002d:
		ret     
	)
)

(class FootstepWalk of StopWalk
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init param1)
		(asm
			pushi    #init
			pushi    0
			&rest    param1
			super    StopWalk,  4
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_0044
			ldi      37
			jmp      code_0082
code_0044:
			dup     
			ldi      2
			eq?     
			bnt      code_0050
			ldi      30
			jmp      code_0082
code_0050:
			dup     
			ldi      3
			eq?     
			bnt      code_005c
			ldi      30
			jmp      code_0082
code_005c:
			dup     
			ldi      4
			eq?     
			bnt      code_0068
			ldi      34
			jmp      code_0082
code_0068:
			dup     
			ldi      5
			eq?     
			bnt      code_0074
			ldi      24
			jmp      code_0082
code_0074:
			dup     
			ldi      6
			eq?     
			bnt      code_0080
			ldi      17
			jmp      code_0082
code_0080:
			ldi      1
code_0082:
			toss    
			aTop     vStopped
			pushi    0
			call     localproc_0004,  0
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			sat      temp0
			pushi    #doit
			pushi    0
			super    StopWalk,  4
			lst      temp0
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			ne?     
			bnt      code_00da
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			lsli     local68
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			lal      local1
			add     
			lali     local12
			and     
			bnt      code_00da
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			sal      local0
			pushi    #number
			pushi    1
			lsli     local2
			pushi    42
			pushi    0
			lofsa    stepSound
			send     10
			+ag      global164
code_00da:
			ret     
		)
	)
)

(instance stepSound of Sound
	(properties
		flags $0001
	)
)
