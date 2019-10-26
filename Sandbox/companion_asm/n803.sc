;;; Sierra Script 1.0 - (do not remove this comment)
(script# 803)
(include sci.sh)
(use n000)
(use n992)
(use n994)
(use n998)

(public
	speedTest 0
)

(local
	local0
	local1
	local2
	local3
	local4
)
(instance fred of Actor
	(properties)
)

(instance speedTest of Rm
	(properties
		picture 803
		style $0064
	)
	
	(method (init)
		(asm
			pushi    3
			pushi    0
			lofsa    {version}
			push    
			pushi    1
			callk    FileIO,  6
			sal      local2
			pushi    4
			pushi    5
			lsg      global27
			pushi    6
			push    
			callk    FileIO,  8
			pushi    2
			pushi    1
			lsl      local2
			callk    FileIO,  4
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #eachElementDo
			pushi    1
			pushi    156
			lag      global8
			send     6
code_00bc:
			pushi    0
			callk    GetTime,  0
			push    
			ldi      64512
			ugt?    
			bnt      code_00cb
			jmp      code_00bc
code_00cb:
			pushi    #view
			pushi    1
			pushi    803
			pushi    4
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    99
			pushi    308
			pushi    2
			pushi    1
			pushi    1
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    319
			pushi    99
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    fred
			send     46
			ldi      0
			sag      global3
			ldi      0
			sal      local1
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_0111
			ldi      90
			jmp      code_0113
code_0111:
			ldi      60
code_0113:
			sal      local3
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_0122
			ldi      59
			jmp      code_0124
code_0122:
			ldi      30
code_0124:
			sal      local4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Rm,  4
			+al      local1
			push    
			ldi      1
			eq?     
			bnt      code_013f
			pushi    60
			pushi    0
			callk    GetTime,  0
			add     
			sal      local0
code_013f:
			lsl      local0
			pushi    0
			callk    GetTime,  0
			ult?    
			bnt      code_01aa
			lsl      local1
			lal      local3
			gt?     
			bnt      code_0156
			ldi      2
			jmp      code_0165
code_0156:
			lsl      local1
			lal      local4
			gt?     
			bnt      code_0163
			ldi      1
			jmp      code_0165
code_0163:
			ldi      0
code_0165:
			sag      global87
			pushi    293
			pushi    #superClass
			push    
			ldi      1
			add     
			push    
			lag      global1
			send     6
			lsg      global87
			ldi      4
			add     
			sag      global141
			ldi      6
			sag      global3
			pushi    #egoMoveSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #moveSpeed
			pushi    1
			lsg      global141
			pushi    219
			pushi    1
			lsg      global141
			lag      global0
			send     12
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    #newRoom
			pushi    1
			lsg      global147
			lag      global2
			send     6
code_01aa:
			ret     
		)
	)
)
