;;; Sierra Script 1.0 - (do not remove this comment)
(script# 255)
(include sci.sh)
(use n000)
(use n999)

(public
	proc255_0 0
	proc255_1 1
	proc255_2 2
	proc255_3 3
	proc255_4 4
	proc255_5 5
)

(procedure (proc255_0 param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10 temp11 [temp12 6] temp18 temp19 temp20 [temp21 1001] temp1022 temp1023 temp1024 temp1025 temp1026 temp1027 temp1028 temp1029 temp1030 temp1031 temp1032)
	(asm
		ldi      0
		sat      temp1028
		ldi      0
		sat      temp1029
		ldi      65535
		sat      temp7
		sat      temp6
		pushi    #printLang
		pushi    0
		lag      global1
		send     4
		sat      temp1026
		pushi    #subtitleLang
		pushi    0
		lag      global1
		send     4
		sat      temp1027
		ldi      0
		sat      temp19
		sat      temp1030
		sat      temp1023
		sat      temp3
		sat      temp2
		sat      temp18
		sat      temp8
		sat      temp9
		sat      temp1032
		pushi    #window
		pushi    1
		lsg      global38
		pushi    23
		pushi    1
		lofsa    {PrintD}
		push    
		pushi    #new
		pushi    0
		class    Dialog
		send     4
		sat      temp0
		send     12
		ldi      0
		lspi     param1
		ldi      1000
		ult?    
		bnt      code_119a
		pushi    3
		ldi      0
		lspi     param1
		ldi      1
		lspi     param1
		lea      @temp21
		push    
		callk    GetFarText,  6
		ldi      2
		sat      temp5
		jmp      code_11bc
code_119a:
		ldi      0
		lapi     param1
		bnt      code_11b4
		pushi    2
		lea      @temp21
		push    
		ldi      0
		lspi     param1
		callk    StrCpy,  4
		ldi      1
		sat      temp5
		jmp      code_11bc
code_11b4:
		ldi      0
		sat      temp21
		ldi      0
		sat      temp5
code_11bc:
		ldi      0
		sat      temp1022
code_11c1:
		pushi    2
		lea      @temp21
		push    
		lst      temp1022
		callk    StrAt,  4
		bnt      code_1274
		pushi    2
		lea      @temp21
		push    
		lst      temp1022
		callk    StrAt,  4
		push    
		ldi      14848
		eq?     
		bnt      code_126e
		pushi    2
		lea      @temp21
		push    
		pushi    1
		lat      temp1022
		add     
		push    
		callk    StrAt,  4
		push    
		ldi      74
		eq?     
		bnt      code_126e
		pushi    #printLang
		pushi    1
		pushi    1
		pushi    88
		pushi    1
		pushi    81
		lag      global1
		send     12
		pushi    3
		lea      @temp21
		push    
		lea      @temp21
		push    
		lofsa    {#J}
		push    
		callk    kernel_123,  6
		pushi    #printLang
		pushi    1
		lst      temp1026
		pushi    88
		pushi    1
		lst      temp1027
		lag      global1
		send     12
		pushi    3
		lea      @temp21
		push    
		lst      temp1022
		pushi    0
		callk    StrAt,  6
		pushi    3
		pushi    81
		lst      temp1026
		lst      temp1027
		calle    proc999_5,  6
		bnt      code_126e
		pushi    26
		pushi    1
		lea      @temp21
		push    
		ldi      2
		add     
		push    
		lat      temp1022
		add     
		push    
		pushi    33
		pushi    1
		pushi    900
		pushi    23
		pushi    1
		lofsa    {jDText}
		push    
		pushi    #new
		pushi    0
		class    DText
		send     4
		sat      temp1023
		send     18
code_126e:
		+at      temp1022
		jmp      code_11c1
code_1274:
		pushi    #text
		pushi    1
		lea      @temp21
		push    
		pushi    33
		pushi    1
		lsg      global22
		pushi    #new
		pushi    0
		class    DText
		send     4
		sat      temp1
		send     12
		lat      temp1023
		bnt      code_12a0
		lst      temp1026
		ldi      81
		eq?     
		bnt      code_12a0
		lat      temp1023
		jmp      code_12a2
code_12a0:
		lat      temp1
code_12a2:
		sat      temp1024
		lst      temp1027
		ldi      81
		eq?     
		bnt      code_12b4
		lat      temp1023
		jmp      code_12d0
code_12b4:
		lat      temp1023
		bnt      code_12d0
		lat      temp1027
		bnt      code_12c5
		lat      temp1
		jmp      code_12d0
code_12c5:
		pushi    #dispose
		pushi    0
		lat      temp1
		send     4
		ldi      0
		sat      temp1
code_12d0:
		sat      temp1025
		pushi    #moveTo
		pushi    2
		pushi    4
		dup     
		pushi    170
		pushi    0
		lat      temp1024
		send     12
		pushi    #add
		pushi    1
		lst      temp1024
		pushi    170
		pushi    0
		lat      temp0
		send     10
		lat      temp1025
		bnt      code_1327
		pushi    170
		pushi    #species
		pushi    172
		pushi    2
		pushi    #nsLeft
		pushi    0
		lat      temp1024
		send     4
		push    
		pushi    4
		pushi    #nsBottom
		pushi    0
		lat      temp1024
		send     4
		add     
		push    
		lat      temp1025
		send     12
		pushi    #add
		pushi    1
		lst      temp1025
		pushi    170
		pushi    0
		lat      temp0
		send     10
code_1327:
		lat      temp5
		sat      temp5
code_132b:
		lst      temp5
		lap      argc
		lt?     
		bnt      code_1567
		lat      temp5
		lspi     param1
		dup     
		ldi      30
		eq?     
		bnt      code_135a
		+at      temp5
		lat      temp1
		bnt      code_1561
		lat      temp1025
		not     
		bnt      code_1561
		pushi    #mode
		pushi    1
		lat      temp5
		lspi     param1
		lat      temp1
		send     6
		jmp      code_1561
code_135a:
		dup     
		ldi      33
		eq?     
		bnt      code_137c
		+at      temp5
		lat      temp1
		bnt      code_1561
		pushi    #font
		pushi    1
		lat      temp5
		lspi     param1
		pushi    170
		pushi    1
		lst      temp8
		lat      temp1
		send     12
		jmp      code_1561
code_137c:
		dup     
		ldi      70
		eq?     
		bnt      code_13c5
		ldi      1
		sat      temp1028
		+at      temp5
		lapi     param1
		sat      temp8
		pushi    #setSize
		pushi    1
		push    
		lat      temp1024
		send     6
		lat      temp1025
		bnt      code_1561
		pushi    170
		pushi    #superClass
		lst      temp8
		pushi    172
		pushi    2
		pushi    #nsLeft
		pushi    0
		lat      temp1024
		send     4
		push    
		pushi    4
		pushi    #nsBottom
		pushi    0
		lat      temp1024
		send     4
		add     
		push    
		lat      temp1025
		send     14
		jmp      code_1561
code_13c5:
		dup     
		ldi      25
		eq?     
		bnt      code_13da
		+at      temp5
		pushi    #time
		pushi    1
		lspi     param1
		lat      temp0
		send     6
		jmp      code_1561
code_13da:
		dup     
		ldi      80
		eq?     
		bnt      code_13ef
		+at      temp5
		pushi    #text
		pushi    1
		lspi     param1
		lat      temp0
		send     6
		jmp      code_1561
code_13ef:
		dup     
		ldi      67
		eq?     
		bnt      code_1405
		+at      temp5
		lapi     param1
		sat      temp6
		+at      temp5
		lapi     param1
		sat      temp7
		jmp      code_1561
code_1405:
		dup     
		ldi      83
		eq?     
		bnt      code_141c
		pushi    2
		pushi    #elements
		pushi    0
		lag      global5
		send     4
		push    
		pushi    0
		callk    Animate,  4
		jmp      code_1561
code_141c:
		dup     
		ldi      41
		eq?     
		bnt      code_1447
		+at      temp5
		pushi    #text
		pushi    1
		lspi     param1
		pushi    #new
		pushi    0
		class    DEdit
		send     4
		sat      temp3
		send     6
		+at      temp5
		pushi    #max
		pushi    1
		lspi     param1
		pushi    170
		pushi    0
		lat      temp3
		send     10
		jmp      code_1561
code_1447:
		dup     
		ldi      81
		eq?     
		bnt      code_1485
		pushi    26
		pushi    #superClass
		+at      temp5
		lspi     param1
		pushi    77
		pushi    1
		+at      temp5
		lspi     param1
		pushi    170
		pushi    0
		pushi    #new
		pushi    0
		class    DButton
		send     4
		push    
		lat      temp19
		sati     temp12
		send     16
		lst      temp18
		pushi    #nsRight
		pushi    0
		lat      temp19
		lati     temp12
		send     4
		push    
		ldi      4
		add     
		add     
		sat      temp18
		+at      temp19
		jmp      code_1561
code_1485:
		dup     
		ldi      82
		eq?     
		bnt      code_14f6
		ldi      1
		sat      temp1029
		pushi    1
		lst      temp5
		ldi      1
		add     
		lspi     param1
		callk    IsObject,  2
		bnt      code_14bd
		pushi    106
		pushi    #species
		lst      temp5
		ldi      1
		add     
		lapi     param1
		send     4
		sat      temp2
		pushi    #setSize
		pushi    0
		send     4
		lst      temp5
		ldi      1
		add     
		sat      temp5
		jmp      code_1561
code_14bd:
		pushi    #new
		pushi    0
		class    DIcon
		send     4
		sat      temp2
		pushi    5
		pushi    1
		lst      temp5
		ldi      1
		add     
		lspi     param1
		pushi    6
		pushi    1
		lst      temp5
		ldi      2
		add     
		lspi     param1
		pushi    7
		pushi    1
		lst      temp5
		ldi      3
		add     
		lspi     param1
		pushi    170
		pushi    0
		lat      temp2
		send     22
		lst      temp5
		ldi      3
		add     
		sat      temp5
		jmp      code_1561
code_14f6:
		dup     
		ldi      108
		eq?     
		bnt      code_1540
		lst      temp5
		ldi      1
		add     
		push    
		lap      argc
		lt?     
		bnt      code_1528
		pushi    1
		lst      temp5
		ldi      1
		add     
		lspi     param1
		callk    IsObject,  2
		bnt      code_1528
		pushi    139
		pushi    #superClass
		lst      temp5
		ldi      1
		add     
		lspi     param1
		lat      temp0
		send     6
		+at      temp5
code_1528:
		pushi    0
		ldi      81
		ne?     
		bnt      code_1561
		lag      global25
		bnt      code_1539
		pushi    #dispose
		pushi    0
		send     4
code_1539:
		lat      temp0
		sat      temp9
		jmp      code_1561
code_1540:
		dup     
		ldi      35
		eq?     
		bnt      code_1555
		+at      temp5
		pushi    #window
		pushi    1
		lspi     param1
		lat      temp0
		send     6
		jmp      code_1561
code_1555:
		dup     
		ldi      121
		eq?     
		bnt      code_1561
		ldi      1
		sat      temp1032
code_1561:
		toss    
		+at      temp5
		jmp      code_132b
code_1567:
		lat      temp1032
		bnt      code_1571
		ldi      0
		sat      temp9
code_1571:
		lat      temp1028
		bt       code_157a
		lat      temp1029
code_157a:
		not     
		bnt      code_15cc
		pushi    #nsBottom
		pushi    0
		lat      temp0
		send     4
		push    
		pushi    #nsTop
		pushi    0
		lat      temp0
		send     4
		sub     
		push    
		ldi      100
		gt?     
		bnt      code_15cc
		pushi    #setSize
		pushi    1
		pushi    300
		lat      temp1024
		send     6
		lat      temp1025
		bnt      code_15cc
		pushi    170
		pushi    #superClass
		pushi    300
		pushi    172
		pushi    2
		pushi    #nsLeft
		pushi    0
		lat      temp1024
		send     4
		push    
		pushi    4
		pushi    #nsBottom
		pushi    0
		lat      temp1024
		send     4
		add     
		push    
		lat      temp1025
		send     14
code_15cc:
		lat      temp2
		bnt      code_167d
		pushi    #moveTo
		pushi    2
		pushi    4
		dup     
		send     8
		lst      temp1024
		lat      temp1023
		eq?     
		bt       code_15eb
		lst      temp1025
		lat      temp1023
		eq?     
code_15eb:
		bnt      code_15f3
		ldi      8
		sat      temp1030
code_15f3:
		pushi    #state
		pushi    0
		lat      temp2
		send     4
		push    
		ldi      16
		and     
		bnt      code_162a
		pushi    172
		pushi    2
		pushi    #x
		lat      temp1030
		add     
		push    
		pushi    #nsBottom
		pushi    0
		lat      temp2
		send     4
		push    
		pushi    #nsTop
		pushi    0
		lat      temp1024
		send     4
		add     
		push    
		pushi    170
		pushi    0
		lat      temp1024
		send     12
		jmp      code_1650
code_162a:
		pushi    172
		pushi    2
		pushi    #x
		pushi    #nsRight
		pushi    0
		lat      temp2
		send     4
		add     
		push    
		lat      temp1030
		add     
		push    
		pushi    #nsTop
		pushi    0
		lat      temp1024
		send     4
		push    
		pushi    170
		pushi    0
		lat      temp1024
		send     12
code_1650:
		lat      temp1025
		bnt      code_1674
		pushi    172
		pushi    #-info-
		pushi    #nsLeft
		pushi    0
		lat      temp1024
		send     4
		push    
		pushi    4
		pushi    #nsBottom
		pushi    0
		lat      temp1024
		send     4
		add     
		push    
		lat      temp1025
		send     8
code_1674:
		pushi    #add
		pushi    1
		lst      temp2
		lat      temp0
		send     6
code_167d:
		pushi    #setSize
		pushi    0
		lat      temp0
		send     4
		lat      temp3
		bnt      code_16c0
		pushi    172
		pushi    #-info-
		pushi    10
		pushi    0
		lat      temp1025
		bt       code_169a
		lat      temp1024
code_169a:
		send     4
		push    
		pushi    4
		pushi    11
		pushi    0
		lat      temp1025
		bt       code_16ab
		lat      temp1024
code_16ab:
		send     4
		add     
		push    
		lat      temp3
		send     8
		pushi    #add
		pushi    1
		lst      temp3
		pushi    170
		pushi    0
		lat      temp0
		send     10
code_16c0:
		lst      temp18
		pushi    #nsRight
		pushi    0
		lat      temp0
		send     4
		gt?     
		bnt      code_16d2
		ldi      4
		jmp      code_16dd
code_16d2:
		pushi    #nsRight
		pushi    0
		lat      temp0
		send     4
		push    
		lat      temp18
		sub     
code_16dd:
		sat      temp20
		ldi      0
		sat      temp5
code_16e3:
		lst      temp5
		lat      temp19
		lt?     
		bnt      code_171d
		pushi    #moveTo
		pushi    2
		lst      temp20
		pushi    #nsBottom
		pushi    0
		lat      temp0
		send     4
		push    
		lat      temp5
		lati     temp12
		send     8
		pushi    #add
		pushi    1
		lat      temp5
		lsti     temp12
		lat      temp0
		send     6
		pushi    4
		pushi    #nsRight
		pushi    0
		lat      temp5
		lati     temp12
		send     4
		add     
		sat      temp20
		+at      temp5
		jmp      code_16e3
code_171d:
		pushi    #setSize
		pushi    0
		pushi    182
		pushi    0
		lat      temp0
		send     8
		lat      temp2
		bnt      code_1737
		pushi    #state
		pushi    0
		send     4
		push    
		ldi      16
		and     
code_1737:
		bt       code_1748
		lat      temp2
		bnt      code_177c
		pushi    1
		lea      @temp21
		push    
		callk    StrLen,  2
		not     
code_1748:
		bnt      code_177c
		pushi    172
		pushi    2
		pushi    #nsRight
		pushi    0
		lat      temp0
		send     4
		push    
		pushi    #nsLeft
		pushi    0
		lat      temp0
		send     4
		sub     
		push    
		pushi    #nsRight
		pushi    0
		lat      temp2
		send     4
		push    
		pushi    #nsLeft
		pushi    0
		lat      temp2
		send     4
		sub     
		sub     
		push    
		ldi      2
		div     
		push    
		pushi    4
		lat      temp2
		send     8
code_177c:
		pushi    172
		pushi    2
		pushi    65535
		lat      temp6
		eq?     
		bnt      code_1792
		pushi    #nsLeft
		pushi    0
		lat      temp0
		send     4
		jmp      code_1794
code_1792:
		lat      temp6
code_1794:
		push    
		pushi    65535
		lat      temp7
		eq?     
		bnt      code_17a7
		pushi    #nsTop
		pushi    0
		lat      temp0
		send     4
		jmp      code_17a9
code_17a7:
		lat      temp7
code_17a9:
		push    
		lat      temp0
		send     8
		pushi    0
		callk    GetPort,  0
		sat      temp11
		pushi    181
		pushi    2
		pushi    #text
		pushi    0
		lat      temp0
		send     4
		bnt      code_17c7
		ldi      4
		jmp      code_17c9
code_17c7:
		ldi      0
code_17c9:
		push    
		lat      temp9
		bnt      code_17d4
		ldi      15
		jmp      code_17d6
code_17d4:
		ldi      65535
code_17d6:
		push    
		lat      temp0
		send     8
		lat      temp9
		bnt      code_17f4
		pushi    0
		callk    GetPort,  0
		sag      global41
		pushi    1
		lst      temp11
		callk    SetPort,  2
		lat      temp9
		sag      global25
		ret     
		jmp      code_17fd
code_17f4:
		pushi    #pause
		pushi    1
		pushi    1
		lag      global8
		send     6
code_17fd:
		pushi    #firstTrue
		pushi    2
		pushi    175
		pushi    1
		lat      temp0
		send     8
		sat      temp10
		bnt      code_182f
		pushi    #firstTrue
		pushi    2
		pushi    175
		pushi    2
		lat      temp0
		send     8
		not     
		bnt      code_182f
		pushi    32
		pushi    #superClass
		pushi    #state
		pushi    0
		lat      temp10
		send     4
		push    
		ldi      2
		or      
		push    
		lat      temp10
		send     6
code_182f:
		pushi    #doit
		pushi    1
		lst      temp10
		lat      temp0
		send     6
		sat      temp4
		push    
		ldi      65535
		eq?     
		bnt      code_1845
		ldi      0
		sat      temp4
code_1845:
		ldi      0
		sat      temp5
code_1849:
		lst      temp5
		lat      temp19
		lt?     
		bnt      code_186c
		lst      temp4
		lat      temp5
		lati     temp12
		eq?     
		bnt      code_1867
		pushi    #value
		pushi    0
		lat      temp4
		send     4
		sat      temp4
		jmp      code_186c
code_1867:
		+at      temp5
		jmp      code_1849
code_186c:
		pushi    #theItem
		pushi    0
		lat      temp0
		send     4
		not     
		bnt      code_187c
		ldi      1
		sat      temp4
code_187c:
		pushi    #dispose
		pushi    0
		lat      temp0
		send     4
		pushi    #pause
		pushi    1
		pushi    0
		lag      global8
		send     6
		lat      temp4
		ret     
	)
)

(procedure (proc255_1 param1 param2 param3 param4 param5)
	(asm
		pushi    5
		lsp      param1
		pushi    82
		lsp      param2
		lsp      param3
		lsp      param4
		&rest    param5
		call     localproc_1122,  10
		ret     
	)
)

(procedure (proc255_2 param1 param2 param3 param4 &tmp [temp0 4])
	(asm
		pushi    4
		lsp      argc
		ldi      3
		ge?     
		bnt      code_10f5
		lap      param3
		jmp      code_10f8
code_10f5:
		lofsa    {LOOKUP\_ERROR}
code_10f8:
		push    
		pushi    41
		lsp      param1
		lsp      param2
		&rest    param4
		call     localproc_1122,  8
		bnt      code_110e
		pushi    1
		lsp      param1
		callk    StrLen,  2
code_110e:
		ret     
	)
)

(procedure (proc255_3 param1 param2 &tmp [temp0 40])
	(asm
		ldi      0
		sat      temp0
		lsp      argc
		ldi      1
		gt?     
		bnt      code_18ac
		pushi    4
		lea      @temp0
		push    
		pushi    255
		pushi    0
		lsp      param2
		callk    Format,  8
code_18ac:
		pushi    3
		lea      @temp0
		push    
		pushi    5
		lsp      param1
		call     localproc_10e4,  6
		bnt      code_18c8
		pushi    1
		lea      @temp0
		push    
		callk    ReadNumber,  2
		jmp      code_18ca
code_18c8:
		ldi      65535
code_18ca:
		ret     
	)
)

(procedure (proc255_4 param1 &tmp [temp0 500])
	(asm
		pushi    1
		lea      @temp0
		push    
		&rest    param1
		callk    Format,  2
		pushi    1
		lea      @temp0
		push    
		call     localproc_1122,  2
		ret     
	)
)

(procedure (proc255_5 param1 param2)
	(asm
		pushi    #nsLeft
		pushi    0
		lap      param1
		send     4
		push    
		pushi    #x
		pushi    0
		lap      param2
		send     4
		lt?     
		bnt      code_007d
		pprev   
		pushi    #nsRight
		pushi    0
		lap      param1
		send     4
		lt?     
		bnt      code_007d
		pushi    #nsTop
		pushi    0
		lap      param1
		send     4
		push    
		pushi    #y
		pushi    0
		lap      param2
		send     4
		lt?     
		bnt      code_007d
		pprev   
		pushi    #nsBottom
		pushi    0
		lap      param1
		send     4
		lt?     
code_007d:
		ret     
	)
)

(procedure (localproc_0022 &tmp temp0 temp1)
	(asm
		pushi    #new
		pushi    0
		class    Event
		send     4
		sat      temp0
		pushi    #type
		pushi    0
		send     4
		push    
		ldi      2
		ne?     
		sat      temp1
		pushi    #dispose
		pushi    0
		lat      temp0
		send     4
		lat      temp1
		ret     
	)
)

(class Class_255_0 of Obj
	(properties
		state $0000
	)
	
	(method (draw)
		(asm
			ldi      1
			aTop     state
			pushi    1
			pushi    1
			callk    DrawMenuBar,  2
			ret     
		)
	)
	
	(method (hide)
		(asm
			pushi    1
			pushi    0
			callk    DrawMenuBar,  2
			ret     
		)
	)
	
	(method (handleEvent pEvent param2 &tmp temp0 temp1)
		(asm
			ldi      0
			sat      temp0
			pToa     state
			bnt      code_00bc
			pushi    2
			pushi    12
			pushi    30
			callk    Joystick,  4
			sat      temp1
			pushi    1
			lsp      pEvent
			&rest    param2
			callk    MenuSelect,  2
			sat      temp0
			pushi    2
			pushi    12
			lst      temp1
			callk    Joystick,  4
code_00bc:
			lat      temp0
			ret     
		)
	)
	
	(method (add param1)
		(asm
			pushi    0
			&rest    param1
			callk    AddMenu,  0
			ret     
		)
	)
)

(class Class_255_1 of Obj
	(properties
		type $0000
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
	)
	
	(method (doit)
		(asm
			pToa     value
			ret     
		)
	)
	
	(method (enable param1)
		(asm
			lap      param1
			bnt      code_0107
			pTos     state
			ldi      1
			or      
			aTop     state
			jmp      code_010e
code_0107:
			pTos     state
			ldi      65534
			and     
			aTop     state
code_010e:
			ret     
		)
	)
	
	(method (select param1)
		(asm
			lap      param1
			bnt      code_011e
			pTos     state
			ldi      8
			or      
			aTop     state
			jmp      code_0125
code_011e:
			pTos     state
			ldi      65527
			and     
			aTop     state
code_0125:
			pushi    #draw
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 temp2)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_013a
			ldi      0
			ret     
code_013a:
			ldi      0
			sat      temp0
			pTos     state
			ldi      1
			and     
			bnt      code_019b
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			sat      temp1
			push    
			ldi      128
			eq?     
			bnt      code_015d
			pushi    1
			pTos     said
			callk    Said,  2
code_015d:
			bt       code_0186
			lst      temp1
			ldi      4
			eq?     
			bnt      code_0173
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			pToa     key
			eq?     
code_0173:
			bt       code_0186
			lst      temp1
			ldi      1
			eq?     
			bnt      code_019b
			pushi    #check
			pushi    1
			lsp      pEvent
			self     6
code_0186:
			bnt      code_019b
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #track
			pushi    1
			lsp      pEvent
			self     6
			sat      temp0
code_019b:
			lat      temp0
			ret     
		)
	)
	
	(method (check param1)
		(asm
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsLeft
			ge?     
			bnt      code_01d3
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsTop
			ge?     
			bnt      code_01d3
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsRight
			lt?     
			bnt      code_01d3
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsBottom
			lt?     
code_01d3:
			ret     
		)
	)
	
	(method (track param1 &tmp temp0 temp1)
		(asm
			pushi    1
			pushi    #type
			pushi    0
			lap      param1
			send     4
			eq?     
			bnt      code_0235
			ldi      0
			sat      temp1
code_01e6:
			pushi    #new
			pushi    1
			pushi    32768
			class    Event
			send     6
			sap      param1
			pushi    #localize
			pushi    0
			send     4
			pushi    #check
			pushi    1
			lsp      param1
			self     6
			sat      temp0
			push    
			lat      temp1
			ne?     
			bnt      code_0212
			pushi    1
			pushSelf
			callk    HiliteControl,  2
			lat      temp0
			sat      temp1
code_0212:
			pushi    #dispose
			pushi    0
			lap      param1
			send     4
			pushi    0
			call     localproc_0022,  0
			not     
			bt       code_0225
			jmp      code_01e6
code_0225:
			lat      temp0
			bnt      code_022f
			pushi    1
			pushSelf
			callk    HiliteControl,  2
code_022f:
			lat      temp0
			ret     
			jmp      code_0237
code_0235:
			selfID  
			ret     
code_0237:
			ret     
		)
	)
	
	(method (setSize)
		(asm
			ret     
		)
	)
	
	(method (move param1 param2)
		(asm
			pTos     nsRight
			lap      param1
			add     
			aTop     nsRight
			pTos     nsLeft
			lap      param1
			add     
			aTop     nsLeft
			pTos     nsTop
			lap      param2
			add     
			aTop     nsTop
			pTos     nsBottom
			lap      param2
			add     
			aTop     nsBottom
			ret     
		)
	)
	
	(method (moveTo param1 param2)
		(asm
			pushi    171
			pushi    2
			lsp      param1
			pToa     nsLeft
			sub     
			push    
			lsp      param2
			pToa     nsTop
			sub     
			push    
			self     8
			ret     
		)
	)
	
	(method (draw)
		(asm
			pushi    1
			pushSelf
			callk    DrawControl,  2
			ret     
		)
	)
	
	(method (isType param1)
		(asm
			pTos     type
			lap      param1
			eq?     
			ret     
		)
	)
	
	(method (checkState param1)
		(asm
			pTos     state
			lap      param1
			and     
			ret     
		)
	)
	
	(method (cycle)
		(asm
			ret     
		)
	)
)

(class DText of Class_255_1
	(properties
		type $0002
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		text 0
		font 1
		mode 0
	)
	
	(method (new &tmp temp0)
		(asm
			pushi    #font
			pushi    1
			lsg      global22
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			super    Class_255_1,  4
			send     10
			ret     
		)
	)
	
	(method (setSize param1 &tmp [temp0 4])
		(asm
			pushi    5
			ldi      0
			leai     @temp0
			push    
			pTos     text
			pTos     font
			lap      argc
			bnt      code_0327
			lap      param1
			jmp      code_0329
code_0327:
			ldi      0
code_0329:
			push    
			lofsa    {\n----------\n}
			push    
			callk    TextSize,  10
			pTos     nsTop
			ldi      2
			lati     temp0
			add     
			aTop     nsBottom
			pTos     nsLeft
			ldi      3
			lati     temp0
			add     
			aTop     nsRight
			ret     
		)
	)
)

(class DIcon of Class_255_1
	(properties
		type $0004
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		view 0
		loop 0
		cel 0
	)
	
	(method (setSize &tmp [temp0 4])
		(asm
			pTos     nsLeft
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelWide,  6
			add     
			aTop     nsRight
			pTos     nsTop
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelHigh,  6
			add     
			aTop     nsBottom
			ret     
		)
	)
)

(class DButton of Class_255_1
	(properties
		type $0001
		state $0003
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		text 0
		font 0
	)
	
	(method (setSize &tmp [temp0 4])
		(asm
			pushi    5
			ldi      0
			leai     @temp0
			push    
			pTos     text
			pTos     font
			pushi    0
			pushi    0
			callk    TextSize,  10
			ldi      2
			lsti     temp0
			add     
			push    
			ldi      2
			sati     temp0
			ldi      3
			lsti     temp0
			ldi      2
			add     
			push    
			ldi      3
			sati     temp0
			pTos     nsTop
			ldi      2
			lati     temp0
			add     
			aTop     nsBottom
			ldi      3
			lsti     temp0
			ldi      15
			add     
			push    
			ldi      16
			div     
			push    
			ldi      16
			mul     
			push    
			ldi      3
			sati     temp0
			ldi      3
			lsti     temp0
			pToa     nsLeft
			add     
			aTop     nsRight
			ret     
		)
	)
)

(class DEdit of Class_255_1
	(properties
		type $0003
		state $0001
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		text 0
		font 0
		max 0
		cursor 0
	)
	
	(method (track param1)
		(asm
			pushi    2
			pushSelf
			lsp      param1
			callk    EditControl,  4
			selfID  
			ret     
		)
	)
	
	(method (setSize &tmp [temp0 4])
		(asm
			lag      global85
			aTop     font
			pushi    5
			ldi      0
			leai     @temp0
			push    
			lofsa    {M}
			push    
			pTos     font
			pushi    0
			pushi    0
			callk    TextSize,  10
			pTos     nsTop
			ldi      2
			lati     temp0
			add     
			aTop     nsBottom
			pTos     nsLeft
			ldi      3
			lsti     temp0
			pToa     max
			mul     
			push    
			ldi      3
			mul     
			push    
			ldi      4
			div     
			add     
			aTop     nsRight
			pushi    1
			pTos     text
			callk    StrLen,  2
			aTop     cursor
			ret     
		)
	)
)

(class DSelector of Class_255_1
	(properties
		type $0006
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		font 0
		x 20
		y 6
		text 0
		cursor 0
		topString 0
		mark 0
	)
	
	(method (handleEvent pEvent &tmp temp0 [temp1 3] temp4 [temp5 4])
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_06a5
			ldi      0
			ret     
code_06a5:
			ldi      0
			sat      temp0
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      4
			eq?     
			bnt      code_0746
			pushi    76
			pushi    1
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      18176
			eq?     
			bnt      code_06d6
			pushi    #retreat
			pushi    1
			pushi    50
			self     6
			jmp      code_073d
code_06d6:
			dup     
			ldi      20224
			eq?     
			bnt      code_06e9
			pushi    #advance
			pushi    1
			pushi    50
			self     6
			jmp      code_073d
code_06e9:
			dup     
			ldi      20736
			eq?     
			bnt      code_0700
			pushi    177
			pushi    #superClass
			pTos     y
			ldi      1
			sub     
			push    
			self     6
			jmp      code_073d
code_0700:
			dup     
			ldi      18688
			eq?     
			bnt      code_0717
			pushi    178
			pushi    #superClass
			pTos     y
			ldi      1
			sub     
			push    
			self     6
			jmp      code_073d
code_0717:
			dup     
			ldi      20480
			eq?     
			bnt      code_0729
			pushi    #advance
			pushi    1
			pushi    1
			self     6
			jmp      code_073d
code_0729:
			dup     
			ldi      18432
			eq?     
			bnt      code_073b
			pushi    #retreat
			pushi    1
			pushi    1
			self     6
			jmp      code_073d
code_073b:
			ldi      0
code_073d:
			toss    
			push    
			lap      pEvent
			send     6
			jmp      code_07f9
code_0746:
			dup     
			ldi      1
			eq?     
			bnt      code_07f9
			pushi    #check
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_07f9
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			pTos     nsTop
			ldi      10
			add     
			lt?     
			bnt      code_0787
code_0771:
			pushi    #retreat
			pushi    1
			pushi    1
			self     6
			pushi    0
			call     localproc_0022,  0
			not     
			bt       code_07f9
			jmp      code_0771
			jmp      code_07f9
code_0787:
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			pTos     nsBottom
			ldi      10
			sub     
			gt?     
			bnt      code_07ae
code_0798:
			pushi    #advance
			pushi    1
			pushi    1
			self     6
			pushi    0
			call     localproc_0022,  0
			not     
			bt       code_07f9
			jmp      code_0798
			jmp      code_07f9
code_07ae:
			pushi    5
			ldi      0
			leai     @temp5
			push    
			lofsa    {M}
			push    
			pTos     font
			pushi    0
			pushi    0
			callk    TextSize,  10
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			pTos     nsTop
			ldi      10
			add     
			sub     
			push    
			ldi      2
			lati     temp5
			div     
			sat      temp4
			push    
			pToa     mark
			gt?     
			bnt      code_07ed
			pushi    177
			pushi    #superClass
			lst      temp4
			pToa     mark
			sub     
			push    
			self     6
			jmp      code_07f9
code_07ed:
			pushi    178
			pushi    #superClass
			pTos     mark
			lat      temp4
			sub     
			push    
			self     6
code_07f9:
			toss    
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0810
			pTos     state
			ldi      2
			and     
			bnt      code_0810
			selfID  
			jmp      code_0812
code_0810:
			ldi      0
code_0812:
			ret     
		)
	)
	
	(method (setSize &tmp [temp0 4])
		(asm
			pushi    5
			ldi      0
			leai     @temp0
			push    
			lofsa    {M}
			push    
			pTos     font
			pushi    0
			pushi    0
			callk    TextSize,  10
			pTos     nsTop
			ldi      20
			add     
			push    
			ldi      2
			lsti     temp0
			pToa     y
			mul     
			add     
			aTop     nsBottom
			pTos     nsLeft
			ldi      3
			lsti     temp0
			pToa     x
			mul     
			push    
			ldi      3
			mul     
			push    
			ldi      4
			div     
			add     
			aTop     nsRight
			pToa     text
			aTop     cursor
			aTop     topString
			ldi      0
			aTop     mark
			ret     
		)
	)
	
	(method (indexOf param1 &tmp temp0 temp1)
		(asm
			pToa     text
			sat      temp0
			ldi      0
			sat      temp1
code_0572:
			lst      temp1
			ldi      300
			lt?     
			bnt      code_05a4
			pushi    0
			pushi    1
			lst      temp0
			callk    StrLen,  2
			eq?     
			bnt      code_0589
			ldi      65535
			ret     
code_0589:
			pushi    2
			lsp      param1
			lst      temp0
			callk    StrCmp,  4
			not     
			bnt      code_0598
			lat      temp1
			ret     
code_0598:
			lst      temp0
			pToa     x
			add     
			sat      temp0
			+at      temp1
			jmp      code_0572
code_05a4:
			ret     
		)
	)
	
	(method (at param1)
		(asm
			pTos     text
			pTos     x
			lap      param1
			mul     
			add     
			ret     
		)
	)
	
	(method (advance param1 &tmp temp0)
		(asm
			pushi    2
			pTos     cursor
			pushi    0
			callk    StrAt,  4
			not     
			bnt      code_0647
			ret     
code_0647:
			ldi      0
			sat      temp0
code_064b:
			lap      param1
			bnt      code_0689
			pushi    2
			pTos     cursor
			pTos     x
			callk    StrAt,  4
			bnt      code_0689
			ldi      1
			sat      temp0
			pTos     cursor
			pToa     x
			add     
			aTop     cursor
			pTos     mark
			ldi      1
			add     
			push    
			pToa     y
			lt?     
			bnt      code_0677
			ipToa    mark
			jmp      code_067e
code_0677:
			pTos     topString
			pToa     x
			add     
			aTop     topString
code_067e:
			-ap      param1
			jmp      code_064b
			jmp      code_0689
			jmp      code_064b
code_0689:
			lat      temp0
			bnt      code_0695
			pushi    #draw
			pushi    0
			self     4
			ldi      1
code_0695:
			ret     
		)
	)
	
	(method (retreat param1 &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_05f8:
			lap      param1
			bnt      code_062c
			pTos     cursor
			pToa     text
			ne?     
			bnt      code_062c
			ldi      1
			sat      temp0
			pTos     cursor
			pToa     x
			sub     
			aTop     cursor
			pToa     mark
			bnt      code_061a
			dpToa    mark
			jmp      code_0621
code_061a:
			pTos     topString
			pToa     x
			sub     
			aTop     topString
code_0621:
			-ap      param1
			jmp      code_05f8
			jmp      code_062c
			jmp      code_05f8
code_062c:
			lat      temp0
			bnt      code_0638
			pushi    #draw
			pushi    0
			self     4
			ldi      1
code_0638:
			ret     
		)
	)
)

(class Dialog of List
	(properties
		elements 0
		size 0
		text 0
		window 0
		theItem 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		time 0
		busy 0
		caller 0
		seconds 0
		lastSeconds 0
	)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lsg      global86
			pushi    0
			callk    GetTime,  0
			add     
			sag      global88
			ldi      0
			sat      temp0
			ldi      1
			aTop     busy
			pushi    #eachElementDo
			pushi    1
			pushi    107
			self     6
			pToa     theItem
			bnt      code_0919
			pushi    #select
			pushi    1
			pushi    0
			send     6
code_0919:
			lap      argc
			bnt      code_0928
			lap      param1
			bnt      code_0928
			lap      param1
			jmp      code_0931
code_0928:
			pushi    #firstTrue
			pushi    2
			pushi    175
			pushi    1
			self     8
code_0931:
			aTop     theItem
			pToa     theItem
			bnt      code_093f
			pushi    #select
			pushi    1
			pushi    1
			send     6
code_093f:
			pToa     theItem
			not     
			bnt      code_0952
			lag      global79
			sat      temp3
			pushi    0
			callk    GetTime,  0
			sat      temp4
			jmp      code_0956
code_0952:
			ldi      0
			sat      temp3
code_0956:
			ldi      0
			sat      temp2
code_095a:
			lat      temp2
			not     
			bnt      code_09ee
			lsg      global86
			pushi    0
			callk    GetTime,  0
			add     
			sag      global88
			pushi    #eachElementDo
			pushi    1
			pushi    176
			self     6
			pushi    #localize
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			send     4
			sat      temp1
			lat      temp3
			bnt      code_09b3
			-at      temp3
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_099d
			pushi    #type
			pushi    1
			pushi    0
			lat      temp1
			send     6
code_099d:
			lst      temp4
			pushi    0
			callk    GetTime,  0
			eq?     
			bnt      code_09ad
			jmp      code_099d
			jmp      code_099d
code_09ad:
			pushi    0
			callk    GetTime,  0
			sat      temp4
code_09b3:
			pushi    #handleEvent
			pushi    1
			lst      temp1
			self     6
			sat      temp2
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			pushi    #check
			pushi    0
			self     4
			lst      temp2
			ldi      65535
			eq?     
			bt       code_09d5
			pToa     busy
			not     
code_09d5:
			bnt      code_09e6
			ldi      0
			sat      temp2
			pushi    2
			pTos     theItem
			pushi    0
			callk    EditControl,  4
			jmp      code_09ee
code_09e6:
			pushi    1
			pushi    1
			callk    Wait,  2
			jmp      code_095a
code_09ee:
			ldi      0
			aTop     busy
			lat      temp2
			ret     
		)
	)
	
	(method (dispose &tmp temp0)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			self     10
			pushSelf
			lag      global25
			eq?     
			bnt      code_0a4e
			pushi    1
			lsg      global41
			callk    SetPort,  2
			ldi      0
			sag      global25
			ldi      0
			sag      global41
code_0a4e:
			pToa     window
			bnt      code_0a58
			pushi    #dispose
			pushi    0
			send     4
code_0a58:
			ldi      0
			aTop     window
			aTop     theItem
			pToa     caller
			sat      temp0
			pushi    #dispose
			pushi    0
			super    List,  4
			lat      temp0
			bnt      code_0a73
			pushi    #cue
			pushi    0
			send     4
code_0a73:
			ret     
		)
	)
	
	(method (open param1 param2)
		(asm
			pushi    0
			callk    PicNotValid,  0
			bnt      code_08a9
			lag      global5
			bnt      code_08a9
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
code_08a9:
			pushi    #new
			pushi    0
			pToa     window
			send     4
			aTop     window
			pushi    #top
			pushi    1
			pTos     nsTop
			pushi    184
			pushi    1
			pTos     nsLeft
			pushi    185
			pushi    1
			pTos     nsBottom
			pushi    186
			pushi    1
			pTos     nsRight
			pushi    80
			pushi    1
			pTos     text
			pushi    34
			pushi    1
			lsp      param1
			pushi    63
			pushi    1
			lsp      param2
			pushi    181
			pushi    0
			pToa     window
			send     46
			pToa     time
			aTop     seconds
			pushi    #draw
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (draw)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			ret     
		)
	)
	
	(method (cue)
		(asm
			pToa     busy
			not     
			bnt      code_0a28
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0a2c
code_0a28:
			ldi      0
			aTop     busy
code_0a2c:
			ret     
		)
	)
	
	(method (advance &tmp temp0 temp1)
		(asm
			pToa     theItem
			bnt      code_0afa
			pushi    #select
			pushi    1
			pushi    0
			send     6
			pushi    #contains
			pushi    1
			pTos     theItem
			self     6
			sat      temp1
code_0a8b:
			pushi    #next
			pushi    1
			lst      temp1
			self     6
			sat      temp1
			not     
			bnt      code_0a9f
			pushi    #first
			pushi    0
			self     4
			sat      temp1
code_0a9f:
			pushi    1
			lst      temp1
			callk    NodeValue,  2
			aTop     theItem
			pushi    #state
			pushi    0
			pToa     theItem
			send     4
			push    
			ldi      1
			and     
			bnt      code_0a8b
			jmp      code_0abb
			jmp      code_0a8b
code_0abb:
			pushi    #select
			pushi    1
			pushi    1
			pToa     theItem
			send     6
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			pToa     theItem
			send     4
			push    
			pushi    #nsRight
			pushi    0
			pToa     theItem
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     theItem
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			pToa     theItem
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
code_0afa:
			ret     
		)
	)
	
	(method (retreat &tmp temp0 temp1)
		(asm
			pToa     theItem
			bnt      code_0b81
			pushi    #select
			pushi    1
			pushi    0
			send     6
			pushi    #contains
			pushi    1
			pTos     theItem
			self     6
			sat      temp1
code_0b12:
			pushi    #prev
			pushi    1
			lst      temp1
			self     6
			sat      temp1
			not     
			bnt      code_0b26
			pushi    #last
			pushi    0
			self     4
			sat      temp1
code_0b26:
			pushi    1
			lst      temp1
			callk    NodeValue,  2
			aTop     theItem
			pushi    #state
			pushi    0
			pToa     theItem
			send     4
			push    
			ldi      1
			and     
			bnt      code_0b12
			jmp      code_0b42
			jmp      code_0b12
code_0b42:
			pushi    #select
			pushi    1
			pushi    1
			pToa     theItem
			send     6
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			pToa     theItem
			send     4
			push    
			pushi    #nsRight
			pushi    0
			pToa     theItem
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     theItem
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			pToa     theItem
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
code_0b81:
			ret     
		)
	)
	
	(method (move param1 param2)
		(asm
			pTos     nsRight
			lap      param1
			add     
			aTop     nsRight
			pTos     nsLeft
			lap      param1
			add     
			aTop     nsLeft
			pTos     nsTop
			lap      param2
			add     
			aTop     nsTop
			pTos     nsBottom
			lap      param2
			add     
			aTop     nsBottom
			ret     
		)
	)
	
	(method (moveTo param1 param2)
		(asm
			pushi    171
			pushi    2
			lsp      param1
			pToa     nsLeft
			sub     
			push    
			lsp      param2
			pToa     nsTop
			sub     
			push    
			self     8
			ret     
		)
	)
	
	(method (center)
		(asm
			pushi    172
			pushi    2
			pushi    #brLeft
			pushi    0
			pToa     window
			send     4
			push    
			pushi    #brRight
			pushi    0
			pToa     window
			send     4
			push    
			pushi    #brLeft
			pushi    0
			pToa     window
			send     4
			sub     
			push    
			pTos     nsRight
			pToa     nsLeft
			sub     
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #brTop
			pushi    0
			pToa     window
			send     4
			push    
			pushi    #brBottom
			pushi    0
			pToa     window
			send     4
			push    
			pushi    #brTop
			pushi    0
			pToa     window
			send     4
			sub     
			push    
			pTos     nsBottom
			pToa     nsTop
			sub     
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			self     8
			ret     
		)
	)
	
	(method (setSize &tmp temp0 temp1 [temp2 4])
		(asm
			pToa     text
			bnt      code_0f3e
			pushi    5
			ldi      0
			leai     @temp2
			push    
			pTos     text
			pushi    0
			pushi    65535
			pushi    0
			callk    TextSize,  10
			ldi      0
			lati     temp2
			aTop     nsTop
			ldi      1
			lati     temp2
			aTop     nsLeft
			ldi      2
			lati     temp2
			aTop     nsBottom
			ldi      3
			lati     temp2
			aTop     nsRight
			jmp      code_0f48
code_0f3e:
			ldi      0
			aTop     nsTop
			aTop     nsLeft
			aTop     nsBottom
			aTop     nsRight
code_0f48:
			pushi    #first
			pushi    0
			self     4
			sat      temp0
code_0f4f:
			lat      temp0
			bnt      code_0fc1
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp1
			pushi    #nsLeft
			pushi    0
			send     4
			push    
			pToa     nsLeft
			lt?     
			bnt      code_0f70
			pushi    #nsLeft
			pushi    0
			lat      temp1
			send     4
			aTop     nsLeft
code_0f70:
			pushi    #nsTop
			pushi    0
			lat      temp1
			send     4
			push    
			pToa     nsTop
			lt?     
			bnt      code_0f87
			pushi    #nsTop
			pushi    0
			lat      temp1
			send     4
			aTop     nsTop
code_0f87:
			pushi    #nsRight
			pushi    0
			lat      temp1
			send     4
			push    
			pToa     nsRight
			gt?     
			bnt      code_0f9e
			pushi    #nsRight
			pushi    0
			lat      temp1
			send     4
			aTop     nsRight
code_0f9e:
			pushi    #nsBottom
			pushi    0
			lat      temp1
			send     4
			push    
			pToa     nsBottom
			gt?     
			bnt      code_0fb5
			pushi    #nsBottom
			pushi    0
			lat      temp1
			send     4
			aTop     nsBottom
code_0fb5:
			pushi    #next
			pushi    1
			lst      temp0
			self     6
			sat      temp0
			jmp      code_0f4f
code_0fc1:
			pTos     nsRight
			ldi      4
			add     
			aTop     nsRight
			pTos     nsBottom
			ldi      4
			add     
			aTop     nsBottom
			pushi    #moveTo
			pushi    2
			pushi    0
			pushi    0
			self     8
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_0bfd
			pushi    #type
			pushi    1
			pushi    4
			lap      pEvent
			send     6
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      5
			eq?     
			bnt      code_0bb7
			pushi    #message
			pushi    1
			pushi    20480
			lap      pEvent
			send     6
			jmp      code_0bfc
code_0bb7:
			dup     
			ldi      1
			eq?     
			bnt      code_0bcb
			pushi    #message
			pushi    1
			pushi    18432
			lap      pEvent
			send     6
			jmp      code_0bfc
code_0bcb:
			dup     
			ldi      7
			eq?     
			bnt      code_0bdf
			pushi    #message
			pushi    1
			pushi    19200
			lap      pEvent
			send     6
			jmp      code_0bfc
code_0bdf:
			dup     
			ldi      3
			eq?     
			bnt      code_0bf3
			pushi    #message
			pushi    1
			pushi    19712
			lap      pEvent
			send     6
			jmp      code_0bfc
code_0bf3:
			pushi    #type
			pushi    1
			pushi    64
			lap      pEvent
			send     6
code_0bfc:
			toss    
code_0bfd:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bt       code_0c46
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      0
			eq?     
			bt       code_0c46
			pushi    1
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			ne?     
			bnt      code_0c54
			pushi    4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			ne?     
			bnt      code_0c54
			pushi    64
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			ne?     
			bnt      code_0c54
			pushi    256
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			ne?     
code_0c46:
			bnt      code_0c54
			pushi    2
			pTos     theItem
			lsp      pEvent
			callk    EditControl,  4
			ldi      0
			ret     
code_0c54:
			pushi    #firstTrue
			pushi    2
			pushi    129
			lsp      pEvent
			self     8
			sat      temp0
			bnt      code_0c9c
			pushi    2
			pTos     theItem
			pushi    0
			callk    EditControl,  4
			pushi    #checkState
			pushi    1
			pushi    2
			lat      temp0
			send     6
			not     
			bnt      code_0e87
			pToa     theItem
			bnt      code_0c83
			pushi    #select
			pushi    1
			pushi    0
			send     6
code_0c83:
			pushi    #select
			pushi    1
			pushi    1
			lat      temp0
			aTop     theItem
			send     6
			pushi    #doit
			pushi    0
			lat      temp0
			send     4
			ldi      0
			sat      temp0
			jmp      code_0e87
code_0c9c:
			ldi      0
			sat      temp0
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      256
			eq?     
			bt       code_0cc6
			pushi    4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
			bnt      code_0cee
			pushi    13
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			eq?     
code_0cc6:
			bnt      code_0cee
			pToa     theItem
			bnt      code_0cee
			pushi    #checkState
			pushi    1
			pushi    1
			send     6
			bnt      code_0cee
			pToa     theItem
			sat      temp0
			pushi    2
			pTos     theItem
			pushi    0
			callk    EditControl,  4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_0e87
code_0cee:
			pushi    #firstTrue
			pushi    2
			pushi    175
			pushi    1
			self     8
			not     
			bnt      code_0d2c
			pushi    4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
			bnt      code_0d12
			pushi    13
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			eq?     
code_0d12:
			bt       code_0d46
			pushi    1
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
			bt       code_0d46
			pushi    256
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
code_0d2c:
			bt       code_0d46
			pushi    4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
			bnt      code_0d58
			pushi    27
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			eq?     
code_0d46:
			bnt      code_0d58
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      65535
			sat      temp0
			jmp      code_0e87
code_0d58:
			pushi    1
			pTos     theItem
			callk    IsObject,  2
			bnt      code_0db7
			pushi    #isType
			pushi    1
			pushi    3
			pToa     theItem
			send     6
			bnt      code_0db7
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0db7
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      19712
			eq?     
			bnt      code_0db7
			pushi    #cursor
			pushi    0
			pToa     theItem
			send     4
			push    
			pushi    1
			pushi    #text
			pushi    0
			pToa     theItem
			send     4
			push    
			callk    StrLen,  2
			ge?     
			bnt      code_0dac
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0e87
code_0dac:
			pushi    2
			pTos     theItem
			lsp      pEvent
			callk    EditControl,  4
			jmp      code_0e87
code_0db7:
			pushi    1
			pTos     theItem
			callk    IsObject,  2
			bnt      code_0e0c
			pushi    #isType
			pushi    1
			pushi    3
			pToa     theItem
			send     6
			bnt      code_0e0c
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0e0c
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      19200
			eq?     
			bnt      code_0e0c
			pushi    #cursor
			pushi    0
			pToa     theItem
			send     4
			push    
			ldi      0
			le?     
			bnt      code_0e01
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0e87
code_0e01:
			pushi    2
			pTos     theItem
			lsp      pEvent
			callk    EditControl,  4
			jmp      code_0e87
code_0e0c:
			pushi    4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
			bnt      code_0e45
			pushi    4
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    9
			pushi    19712
			pushi    20480
			calle    proc999_5,  8
			bnt      code_0e45
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0e87
code_0e45:
			pushi    4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			eq?     
			bnt      code_0e7f
			pushi    4
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    3840
			pushi    19200
			pushi    18432
			calle    proc999_5,  8
			bnt      code_0e7f
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0e87
code_0e7f:
			pushi    2
			pTos     theItem
			lsp      pEvent
			callk    EditControl,  4
code_0e87:
			lat      temp0
			ret     
		)
	)
	
	(method (check &tmp temp0)
		(asm
			pToa     seconds
			bnt      code_0a19
			pushi    1
			pushi    1
			callk    GetTime,  2
			sat      temp0
			pTos     lastSeconds
			ne?     
			bnt      code_0a19
			lat      temp0
			aTop     lastSeconds
			dpToa    seconds
			not     
			bnt      code_0a19
			pushi    #cue
			pushi    0
			self     4
code_0a19:
			ret     
		)
	)
)

(class Controls of List
	(properties
		elements 0
		size 0
	)
	
	(method (draw)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    170
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_1087
			ldi      0
			ret     
code_1087:
			pushi    #firstTrue
			pushi    2
			pushi    129
			lsp      pEvent
			self     8
			sat      temp0
			bnt      code_10ac
			pushi    #checkState
			pushi    1
			pushi    2
			send     6
			not     
			bnt      code_10ac
			pushi    #doit
			pushi    0
			lat      temp0
			send     4
			ldi      0
			sat      temp0
code_10ac:
			lat      temp0
			ret     
		)
	)
)
