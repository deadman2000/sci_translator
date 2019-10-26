;;; Sierra Script 1.0 - (do not remove this comment)
(script# 13)
(include sci.sh)
(use n000)
(use n255)
(use n999)

(public
	proc13_0 0
	proc13_1 1
	proc13_2 2
	proc13_4 4
	proc13_5 5
	proc13_6 6
	proc13_7 7
)

(local
	local0
	local1
	[local2 4]
	local6
)
(procedure (proc13_0 param1 param2 param3 &tmp temp0)
	(asm
		lag      global25
		bnt      code_0077
		pushi    #dispose
		pushi    0
		send     4
code_0077:
		pushi    3
		pushi    0
		lsp      param1
		lsp      param2
		call     localproc_002a,  6
		ldi      2
		lsli     local2
		ldi      24
		gt?     
		bnt      code_0092
		ldi      200
		jmp      code_0094
code_0092:
		ldi      0
code_0094:
		sat      temp0
		lsp      argc
		ldi      1
		eq?     
		bnt      code_00b0
		pushi    5
		lsp      param1
		pushi    70
		lst      temp0
		pushi    30
		pushi    1
		calle    proc255_0,  10
		jmp      code_00e2
code_00b0:
		lsp      param1
		ldi      1000
		ult?    
		bnt      code_00cf
		pushi    6
		lsp      param1
		lsp      param2
		pushi    70
		lst      temp0
		pushi    30
		pushi    1
		&rest    param3
		calle    proc255_0,  12
		jmp      code_00e2
code_00cf:
		pushi    6
		lsp      param1
		pushi    70
		lst      temp0
		pushi    30
		pushi    1
		lsp      param2
		&rest    param3
		calle    proc255_0,  12
code_00e2:
		ret     
	)
)

(procedure (proc13_1 param1 param2)
	(asm
		pushi    4
		lsp      param1
		&rest    param2
		pushi    67
		pushi    65535
		pushi    5
		call     localproc_006b,  8
		ret     
	)
)

(procedure (proc13_2 param1 param2 &tmp temp0)
	(asm
		pushi    2
		pushi    0
		lsp      param1
		&rest    param2
		call     localproc_002a,  4
		ldi      2
		lali     local2
		sat      temp0
		pushi    4
		lsp      param1
		&rest    param2
		pushi    67
		pushi    65535
		pushi    170
		sub     
		push    
		call     localproc_006b,  8
		ret     
	)
)

(procedure (proc13_4 param1 param2 param3 param4 &tmp [temp0 200])
	(asm
		lag      global25
		bnt      code_0126
		pushi    #dispose
		pushi    0
		send     4
code_0126:
		lsg      global19
		ldi      5
		eq?     
		sal      local6
		pushi    3
		lsp      param1
		lsp      param2
		lea      @temp0
		push    
		callk    GetFarText,  6
		lsg      global162
		lsg      global163
		pushi    1
		lea      @temp0
		push    
		callk    StrLen,  2
		mul     
		add     
		sal      local0
		lsp      argc
		ldi      3
		lt?     
		bnt      code_017a
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    4
		lea      @temp0
		push    
		pushi    67
		pushi    65535
		pushi    5
		call     localproc_006b,  8
		pushi    0
		call     localproc_0833,  0
		jmp      code_02b6
code_017a:
		pushi    1
		lsp      param3
		callk    IsObject,  2
		bnt      code_01ef
		pushi    #respondsTo
		pushi    1
		pushi    674
		lap      param3
		send     6
		bnt      code_01ef
		pushi    #notKilled
		pushi    0
		lap      param3
		send     4
		not     
		bnt      code_01a8
		pushi    #cue
		pushi    1
		pushi    0
		lap      param3
		send     6
		jmp      code_02b6
code_01a8:
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    #init
		pushi    1
		lsp      param3
		lofsa    stopMessage
		send     6
		pushi    8
		lea      @temp0
		push    
		pushi    67
		pushi    65535
		pushi    5
		pushi    108
		lofsa    stopMessage
		push    
		pushi    25
		pushi    2
		lsl      local0
		ldi      60
		div     
		push    
		pushi    3
		calle    proc999_3,  4
		push    
		&rest    param4
		call     localproc_006b,  16
		jmp      code_02b6
code_01ef:
		pushi    1
		lsp      param3
		callk    IsObject,  2
		bnt      code_023f
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    #init
		pushi    1
		lsp      param3
		lofsa    stopMessage
		send     6
		pushi    8
		lea      @temp0
		push    
		pushi    67
		pushi    65535
		pushi    5
		pushi    25
		pushi    2
		lsl      local0
		ldi      60
		div     
		push    
		pushi    3
		calle    proc999_3,  4
		push    
		pushi    108
		lofsa    stopMessage
		push    
		&rest    param4
		call     localproc_006b,  16
		jmp      code_02b6
code_023f:
		lsp      param3
		ldi      1
		eq?     
		bnt      code_028d
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    #init
		pushi    1
		pushi    0
		lofsa    stopMessage
		send     6
		pushi    8
		lea      @temp0
		push    
		pushi    67
		pushi    65535
		pushi    5
		pushi    25
		pushi    2
		lsl      local0
		ldi      60
		div     
		push    
		pushi    3
		calle    proc999_3,  4
		push    
		pushi    108
		lofsa    stopMessage
		push    
		&rest    param4
		call     localproc_006b,  16
		jmp      code_02b6
code_028d:
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    5
		lea      @temp0
		push    
		pushi    67
		pushi    65535
		pushi    5
		lsp      param3
		&rest    param4
		call     localproc_006b,  10
		pushi    0
		call     localproc_0833,  0
code_02b6:
		ret     
	)
)

(procedure (proc13_5 param1 param2 param3 param4 &tmp [temp0 200])
	(asm
		lag      global25
		bnt      code_02c3
		pushi    #dispose
		pushi    0
		send     4
code_02c3:
		lsg      global19
		ldi      5
		eq?     
		sal      local6
		pushi    3
		lsp      param1
		lsp      param2
		lea      @temp0
		push    
		callk    GetFarText,  6
		lsg      global162
		lsg      global163
		pushi    1
		lea      @temp0
		push    
		callk    StrLen,  2
		mul     
		add     
		sal      local0
		lsp      argc
		ldi      3
		lt?     
		bnt      code_0310
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    1
		lea      @temp0
		push    
		call     localproc_00f4,  2
		pushi    0
		call     localproc_0833,  0
		jmp      code_0415
code_0310:
		pushi    1
		lsp      param3
		callk    IsObject,  2
		bnt      code_0375
		pushi    #respondsTo
		pushi    1
		pushi    674
		lap      param3
		send     6
		bnt      code_0375
		pushi    #notKilled
		pushi    0
		lap      param3
		send     4
		not     
		bnt      code_033e
		pushi    #cue
		pushi    1
		pushi    0
		lap      param3
		send     6
		jmp      code_0415
code_033e:
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    #init
		pushi    1
		lsp      param3
		lofsa    stopMessage
		send     6
		pushi    5
		lea      @temp0
		push    
		pushi    108
		lofsa    stopMessage
		push    
		pushi    25
		lsl      local0
		ldi      60
		div     
		push    
		&rest    param4
		call     localproc_00f4,  10
		jmp      code_0415
code_0375:
		pushi    1
		lsp      param3
		callk    IsObject,  2
		bnt      code_03b5
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    #init
		pushi    1
		lsp      param3
		lofsa    stopMessage
		send     6
		pushi    5
		lea      @temp0
		push    
		pushi    25
		lsl      local0
		ldi      60
		div     
		push    
		pushi    108
		lofsa    stopMessage
		push    
		&rest    param4
		call     localproc_00f4,  10
		jmp      code_0415
code_03b5:
		lsp      param3
		ldi      1
		eq?     
		bnt      code_03f3
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    #init
		pushi    1
		pushi    0
		lofsa    stopMessage
		send     6
		pushi    5
		lea      @temp0
		push    
		pushi    25
		lsl      local0
		ldi      60
		div     
		push    
		pushi    108
		lofsa    stopMessage
		push    
		&rest    param4
		call     localproc_00f4,  10
		jmp      code_0415
code_03f3:
		pushi    #setCursor
		pushi    2
		pushi    5
		pushi    0
		callk    HaveMouse,  0
		not     
		push    
		lag      global1
		send     8
		pushi    2
		lea      @temp0
		push    
		lsp      param3
		&rest    param4
		call     localproc_00f4,  4
		pushi    0
		call     localproc_0833,  0
code_0415:
		ret     
	)
)

(procedure (proc13_6 param1)
	(asm
		lsp      param1
		ldi      33
		ugt?    
		bnt      code_04f6
		ldi      33
		sap      param1
code_04f6:
		pushi    28
		pushi    1
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_0507
		lag      global187
		jmp      code_0690
code_0507:
		dup     
		ldi      1
		eq?     
		bnt      code_0513
		lag      global180
		jmp      code_0690
code_0513:
		dup     
		ldi      2
		eq?     
		bnt      code_051f
		lag      global176
		jmp      code_0690
code_051f:
		dup     
		ldi      3
		eq?     
		bnt      code_052b
		lag      global184
		jmp      code_0690
code_052b:
		dup     
		ldi      4
		eq?     
		bnt      code_0537
		lag      global181
		jmp      code_0690
code_0537:
		dup     
		ldi      5
		eq?     
		bnt      code_0543
		lag      global172
		jmp      code_0690
code_0543:
		dup     
		ldi      6
		eq?     
		bnt      code_054f
		lag      global176
		jmp      code_0690
code_054f:
		dup     
		ldi      7
		eq?     
		bnt      code_055b
		lag      global172
		jmp      code_0690
code_055b:
		dup     
		ldi      8
		eq?     
		bnt      code_0567
		lag      global180
		jmp      code_0690
code_0567:
		dup     
		ldi      9
		eq?     
		bnt      code_0573
		lag      global172
		jmp      code_0690
code_0573:
		dup     
		ldi      10
		eq?     
		bnt      code_057f
		lag      global185
		jmp      code_0690
code_057f:
		dup     
		ldi      11
		eq?     
		bnt      code_058b
		lag      global177
		jmp      code_0690
code_058b:
		dup     
		ldi      12
		eq?     
		bnt      code_0597
		lag      global177
		jmp      code_0690
code_0597:
		dup     
		ldi      13
		eq?     
		bnt      code_05a3
		lag      global177
		jmp      code_0690
code_05a3:
		dup     
		ldi      14
		eq?     
		bnt      code_05af
		lag      global182
		jmp      code_0690
code_05af:
		dup     
		ldi      15
		eq?     
		bnt      code_05bb
		lag      global171
		jmp      code_0690
code_05bb:
		dup     
		ldi      16
		eq?     
		bnt      code_05c7
		lag      global171
		jmp      code_0690
code_05c7:
		dup     
		ldi      17
		eq?     
		bnt      code_05d3
		lag      global184
		jmp      code_0690
code_05d3:
		dup     
		ldi      18
		eq?     
		bnt      code_05df
		lag      global171
		jmp      code_0690
code_05df:
		dup     
		ldi      19
		eq?     
		bnt      code_05eb
		lag      global171
		jmp      code_0690
code_05eb:
		dup     
		ldi      20
		eq?     
		bnt      code_05f7
		lag      global185
		jmp      code_0690
code_05f7:
		dup     
		ldi      21
		eq?     
		bnt      code_0603
		lag      global175
		jmp      code_0690
code_0603:
		dup     
		ldi      22
		eq?     
		bnt      code_060f
		lag      global185
		jmp      code_0690
code_060f:
		dup     
		ldi      23
		eq?     
		bnt      code_061b
		lag      global180
		jmp      code_0690
code_061b:
		dup     
		ldi      24
		eq?     
		bnt      code_0627
		lag      global185
		jmp      code_0690
code_0627:
		dup     
		ldi      25
		eq?     
		bnt      code_0633
		lag      global183
		jmp      code_0690
code_0633:
		dup     
		ldi      26
		eq?     
		bnt      code_063f
		lag      global183
		jmp      code_0690
code_063f:
		dup     
		ldi      27
		eq?     
		bnt      code_064b
		lag      global170
		jmp      code_0690
code_064b:
		dup     
		ldi      28
		eq?     
		bnt      code_0657
		lag      global183
		jmp      code_0690
code_0657:
		dup     
		ldi      29
		eq?     
		bnt      code_0663
		lag      global185
		jmp      code_0690
code_0663:
		dup     
		ldi      30
		eq?     
		bnt      code_066f
		lag      global175
		jmp      code_0690
code_066f:
		dup     
		ldi      31
		eq?     
		bnt      code_067b
		lag      global184
		jmp      code_0690
code_067b:
		dup     
		ldi      32
		eq?     
		bnt      code_0687
		lag      global170
		jmp      code_0690
code_0687:
		dup     
		ldi      33
		eq?     
		bnt      code_0690
		lag      global184
code_0690:
		toss    
		push    
		pushi    29
		pushi    1
		lsp      param1
		dup     
		ldi      0
		eq?     
		bnt      code_06a3
		lag      global186
		jmp      code_082c
code_06a3:
		dup     
		ldi      1
		eq?     
		bnt      code_06af
		lag      global176
		jmp      code_082c
code_06af:
		dup     
		ldi      2
		eq?     
		bnt      code_06bb
		lag      global180
		jmp      code_082c
code_06bb:
		dup     
		ldi      3
		eq?     
		bnt      code_06c7
		lag      global176
		jmp      code_082c
code_06c7:
		dup     
		ldi      4
		eq?     
		bnt      code_06d3
		lag      global176
		jmp      code_082c
code_06d3:
		dup     
		ldi      5
		eq?     
		bnt      code_06df
		lag      global184
		jmp      code_082c
code_06df:
		dup     
		ldi      6
		eq?     
		bnt      code_06eb
		lag      global185
		jmp      code_082c
code_06eb:
		dup     
		ldi      7
		eq?     
		bnt      code_06f7
		lag      global180
		jmp      code_082c
code_06f7:
		dup     
		ldi      8
		eq?     
		bnt      code_0703
		lag      global172
		jmp      code_082c
code_0703:
		dup     
		ldi      9
		eq?     
		bnt      code_070f
		lag      global185
		jmp      code_082c
code_070f:
		dup     
		ldi      10
		eq?     
		bnt      code_071b
		lag      global171
		jmp      code_082c
code_071b:
		dup     
		ldi      11
		eq?     
		bnt      code_0727
		lag      global180
		jmp      code_082c
code_0727:
		dup     
		ldi      12
		eq?     
		bnt      code_0733
		lag      global181
		jmp      code_082c
code_0733:
		dup     
		ldi      13
		eq?     
		bnt      code_073f
		lag      global185
		jmp      code_082c
code_073f:
		dup     
		ldi      14
		eq?     
		bnt      code_074b
		lag      global176
		jmp      code_082c
code_074b:
		dup     
		ldi      15
		eq?     
		bnt      code_0757
		lag      global181
		jmp      code_082c
code_0757:
		dup     
		ldi      16
		eq?     
		bnt      code_0763
		lag      global178
		jmp      code_082c
code_0763:
		dup     
		ldi      17
		eq?     
		bnt      code_076f
		lag      global171
		jmp      code_082c
code_076f:
		dup     
		ldi      18
		eq?     
		bnt      code_077b
		lag      global183
		jmp      code_082c
code_077b:
		dup     
		ldi      19
		eq?     
		bnt      code_0787
		lag      global184
		jmp      code_082c
code_0787:
		dup     
		ldi      20
		eq?     
		bnt      code_0793
		lag      global176
		jmp      code_082c
code_0793:
		dup     
		ldi      21
		eq?     
		bnt      code_079f
		lag      global184
		jmp      code_082c
code_079f:
		dup     
		ldi      22
		eq?     
		bnt      code_07ab
		lag      global177
		jmp      code_082c
code_07ab:
		dup     
		ldi      23
		eq?     
		bnt      code_07b7
		lag      global174
		jmp      code_082c
code_07b7:
		dup     
		ldi      24
		eq?     
		bnt      code_07c3
		lag      global171
		jmp      code_082c
code_07c3:
		dup     
		ldi      25
		eq?     
		bnt      code_07cf
		lag      global175
		jmp      code_082c
code_07cf:
		dup     
		ldi      26
		eq?     
		bnt      code_07db
		lag      global176
		jmp      code_082c
code_07db:
		dup     
		ldi      27
		eq?     
		bnt      code_07e7
		lag      global180
		jmp      code_082c
code_07e7:
		dup     
		ldi      28
		eq?     
		bnt      code_07f3
		lag      global170
		jmp      code_082c
code_07f3:
		dup     
		ldi      29
		eq?     
		bnt      code_07ff
		lag      global170
		jmp      code_082c
code_07ff:
		dup     
		ldi      30
		eq?     
		bnt      code_080b
		lag      global181
		jmp      code_082c
code_080b:
		dup     
		ldi      31
		eq?     
		bnt      code_0817
		lag      global174
		jmp      code_082c
code_0817:
		dup     
		ldi      32
		eq?     
		bnt      code_0823
		lag      global185
		jmp      code_082c
code_0823:
		dup     
		ldi      33
		eq?     
		bnt      code_082c
		lag      global175
code_082c:
		toss    
		push    
		lag      global38
		send     12
		ret     
	)
)

(procedure (proc13_7 &tmp temp0)
	(asm
		pushi    #state
		pushi    0
		lag      global9
		send     4
		push    
		ldi      32
		and     
		bnt      code_0848
		lag      global9
		jmp      code_084a
code_0848:
		lag      global69
code_084a:
		sat      temp0
		pushi    187
		pushi    2
		lal      local6
		bnt      code_085a
		ldi      5
		jmp      code_0871
code_085a:
		lag      global143
		bnt      code_0864
		lag      global21
		jmp      code_0871
code_0864:
		pushi    #cursor
		pushi    0
		pushi    #curIcon
		pushi    0
		lat      temp0
		send     4
		send     4
code_0871:
		push    
		pushi    1
		lag      global1
		send     8
		ret     
	)
)

(procedure (localproc_002a param1 param2 param3 &tmp temp0 [temp1 500])
	(asm
		lap      param2
		sat      temp0
		push    
		ldi      1000
		ult?    
		bnt      code_004a
		lea      @temp1
		sat      temp0
		pushi    2
		lea      @temp1
		push    
		lsp      param2
		&rest    param3
		callk    Format,  4
code_004a:
		lap      param1
		bnt      code_005a
		pushi    1
		lst      temp0
		callk    StrLen,  2
		sal      local1
		jmp      code_006a
code_005a:
		pushi    4
		ldi      0
		leai     @local2
		push    
		lst      temp0
		lsg      global22
		pushi    0
		callk    TextSize,  8
code_006a:
		ret     
	)
)

(instance stopMessage of Script
	(properties)
	
	(method (init param1)
		(asm
			ldi      1
			aTop     register
			lap      param1
			aTop     caller
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global73
			send     6
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    0
			call     localproc_0833,  0
			pushi    1
			pTos     caller
			callk    IsObject,  2
			bnt      code_0457
			pushi    #cue
			pushi    1
			pTos     register
			pToa     caller
			send     6
code_0457:
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_0479
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
code_0479:
			bt       code_0495
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_049c
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
code_0495:
			bnt      code_049c
			ldi      0
			aTop     register
code_049c:
			lag      global25
			bnt      code_04a6
			pushi    #dispose
			pushi    0
			send     4
code_04a6:
			ret     
		)
	)
)
