;;; Sierra Script 1.0 - (do not remove this comment)
(script# 936)
(include sci.sh)
(use n981)


(procedure (localproc_0318 param1 param2 param3 param4 param5 param6 param7 param8 param9 param10 param11 param12 param13 &tmp temp0 temp1)
	(asm
		pushi    0
		callk    GetPort,  0
		sat      temp0
		pushi    1
		pushi    0
		callk    SetPort,  2
		pushi    8
		pushi    11
		lsp      param1
		lsp      param2
		lsp      param3
		ldi      1
		add     
		push    
		lsp      param4
		ldi      1
		add     
		push    
		lsp      param13
		lsp      param5
		lsp      param12
		callk    Graph,  16
		lsp      param1
		lap      param10
		sub     
		sap      param1
		lsp      param2
		lap      param10
		sub     
		sap      param2
		lsp      param4
		lap      param10
		add     
		sap      param4
		lsp      param3
		lap      param10
		add     
		sap      param3
		pushi    8
		pushi    11
		lsp      param1
		lsp      param2
		lsp      param1
		lap      param10
		add     
		push    
		lsp      param4
		lsp      param13
		lsp      param6
		lsp      param12
		callk    Graph,  16
		pushi    8
		pushi    11
		lsp      param3
		lap      param10
		sub     
		push    
		lsp      param2
		lsp      param3
		lsp      param4
		lsp      param13
		lsp      param8
		lsp      param12
		callk    Graph,  16
		ldi      0
		sat      temp1
code_0394:
		lst      temp1
		lap      param10
		lt?     
		bnt      code_03f7
		pushi    8
		pushi    4
		lsp      param1
		lat      temp1
		add     
		push    
		lsp      param2
		lat      temp1
		add     
		push    
		lsp      param3
		lst      temp1
		ldi      1
		add     
		sub     
		push    
		lsp      param2
		lat      temp1
		add     
		push    
		lsp      param7
		lsp      param12
		pushi    65535
		callk    Graph,  16
		pushi    8
		pushi    4
		lsp      param1
		lat      temp1
		add     
		push    
		lsp      param4
		lst      temp1
		ldi      1
		add     
		sub     
		push    
		lsp      param3
		lst      temp1
		ldi      1
		add     
		sub     
		push    
		lsp      param4
		lst      temp1
		ldi      1
		add     
		sub     
		push    
		lsp      param9
		lsp      param12
		pushi    65535
		callk    Graph,  16
		+at      temp1
		jmp      code_0394
code_03f7:
		lap      param11
		bnt      code_0436
		pushi    8
		pushi    11
		lsp      param1
		add     
		push    
		lsp      param4
		lsp      param3
		lap      param11
		add     
		push    
		lsp      param4
		lap      param11
		add     
		push    
		lsp      param13
		pushi    0
		lsp      param12
		callk    Graph,  16
		pushi    8
		pushi    11
		lsp      param3
		lsp      param2
		lap      param11
		add     
		push    
		lsp      param3
		lap      param11
		add     
		push    
		lsp      param4
		lsp      param13
		pushi    0
		lsp      param12
		callk    Graph,  16
code_0436:
		pushi    1
		lst      temp0
		callk    SetPort,  2
		ret     
	)
)

(procedure (localproc_043d param1 &tmp temp0 temp1)
	(asm
		pushi    #bottom
		pushi    0
		lap      param1
		send     4
		push    
		ldi      185
		gt?     
		bnt      code_045c
		pushi    185
		dup     
		pushi    0
		lap      param1
		send     4
		sub     
		jmp      code_047b
code_045c:
		pushi    #top
		pushi    0
		lap      param1
		send     4
		push    
		ldi      10
		lt?     
		bnt      code_0479
		pushi    10
		pushi    #top
		pushi    0
		lap      param1
		send     4
		sub     
		jmp      code_047b
code_0479:
		ldi      0
code_047b:
		sat      temp1
		pushi    #right
		pushi    0
		lap      param1
		send     4
		push    
		ldi      315
		gt?     
		bnt      code_049c
		pushi    315
		pushi    #right
		pushi    0
		lap      param1
		send     4
		sub     
		jmp      code_04bb
code_049c:
		pushi    #left
		pushi    0
		lap      param1
		send     4
		push    
		ldi      5
		lt?     
		bnt      code_04b9
		pushi    5
		pushi    #left
		pushi    0
		lap      param1
		send     4
		sub     
		jmp      code_04bb
code_04b9:
		ldi      0
code_04bb:
		sat      temp0
		pushi    183
		pushi    1
		pushi    #top
		pushi    0
		lap      param1
		send     4
		push    
		lat      temp1
		add     
		push    
		pushi    #bottom
		pushi    1
		pushi    #bottom
		pushi    0
		lap      param1
		send     4
		push    
		lat      temp1
		add     
		push    
		pushi    184
		pushi    1
		pushi    #left
		pushi    0
		lap      param1
		send     4
		push    
		lat      temp0
		add     
		push    
		pushi    186
		pushi    1
		pushi    #right
		pushi    0
		lap      param1
		send     4
		push    
		lat      temp0
		add     
		push    
		lap      param1
		send     24
		ret     
	)
)

(class BorderWindow of SysWindow
	(properties
		top 0
		left 0
		bottom 0
		right 0
		color 0
		back 5
		priority 15
		window 0
		type $0000
		title 0
		brTop 0
		brLeft 0
		brBottom 190
		brRight 320
		eraseOnly 0
		underBits 0
		pUnderBits 0
		topBordColor 7
		lftBordColor 6
		rgtBordColor 4
		botBordColor 3
		bevelWid 3
		shadowWid 2
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    0
			callk    SetPort,  2
			pushi    2
			pushi    8
			pTos     underBits
			callk    Graph,  4
			pushi    2
			pushi    8
			pTos     pUnderBits
			callk    Graph,  4
			pToa     eraseOnly
			bnt      code_00de
			pushi    6
			pushi    12
			pTos     lsTop
			pTos     lsLeft
			pTos     lsBottom
			pTos     lsRight
			pushi    1
			callk    Graph,  12
			jmp      code_00ed
code_00de:
			pushi    5
			pushi    13
			pTos     lsTop
			pTos     lsLeft
			pTos     lsBottom
			pTos     lsRight
			callk    Graph,  10
code_00ed:
			pToa     window
			bnt      code_00fd
			pushi    2
			push    
			pTos     eraseOnly
			callk    DisposeWindow,  4
			ldi      0
			aTop     window
code_00fd:
			pushi    1
			pushSelf
			callk    DisposeClone,  2
			ret     
		)
	)
	
	(method (open &tmp temp0 temp1)
		(asm
			pushi    1
			pushi    0
			callk    SetPort,  2
			ldi      1
			sat      temp1
			pTos     priority
			ldi      65535
			ne?     
			bnt      code_001e
			lst      temp1
			ldi      2
			or      
			sat      temp1
code_001e:
			pushi    1
			pushSelf
			call     localproc_043d,  2
			pTos     top
			pToa     bevelWid
			sub     
			aTop     lsTop
			pTos     left
			pToa     bevelWid
			sub     
			aTop     lsLeft
			pTos     right
			pToa     bevelWid
			add     
			push    
			pToa     shadowWid
			add     
			aTop     lsRight
			pTos     bottom
			pToa     bevelWid
			add     
			push    
			pToa     shadowWid
			add     
			aTop     lsBottom
			pushi    6
			pushi    7
			pTos     lsTop
			pTos     lsLeft
			pTos     lsBottom
			pTos     lsRight
			pushi    1
			callk    Graph,  12
			aTop     underBits
			pTos     priority
			ldi      65535
			ne?     
			bnt      code_0074
			pushi    6
			pushi    7
			pTos     lsTop
			pTos     lsLeft
			pTos     lsBottom
			pTos     lsRight
			pushi    2
			callk    Graph,  12
			aTop     pUnderBits
code_0074:
			pushi    13
			pTos     top
			pTos     left
			pTos     bottom
			pTos     right
			pTos     back
			pTos     topBordColor
			pTos     lftBordColor
			pTos     botBordColor
			pTos     rgtBordColor
			pTos     bevelWid
			pTos     shadowWid
			pTos     priority
			lst      temp1
			call     localproc_0318,  26
			pushi    6
			pushi    12
			pTos     lsTop
			pTos     lsLeft
			pTos     lsBottom
			pTos     lsRight
			pushi    1
			callk    Graph,  12
			ldi      129
			aTop     type
			pushi    #open
			pushi    0
			super    SysWindow,  4
			ret     
		)
	)
)

(class InsetWindow of BorderWindow
	(properties
		top 0
		left 0
		bottom 0
		right 0
		color 0
		back 5
		priority 15
		window 0
		type $0000
		title 0
		brTop 0
		brLeft 0
		brBottom 190
		brRight 320
		eraseOnly 0
		underBits 0
		pUnderBits 0
		topBordColor 5
		lftBordColor 4
		rgtBordColor 2
		botBordColor 1
		bevelWid 3
		shadowWid 2
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		ck 3
		insideColor 2
		topBordColor2 0
		lftBordColor2 1
		botBordColor2 5
		rgtBordColor2 4
		topBordHgt 10
		botBordHgt 24
		sideBordWid 2
		shadWid 0
		bevWid 2
		xOffset 0
		yOffset 0
	)
	
	(method (open &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(asm
			ldi      1
			sat      temp0
			pTos     priority
			ldi      65535
			ne?     
			bnt      code_01b1
			lst      temp0
			ldi      2
			or      
			sat      temp0
code_01b1:
			pToa     top
			sat      temp2
			pToa     left
			sat      temp3
			pToa     bottom
			sat      temp4
			pToa     right
			sat      temp5
			pTos     top
			pTos     bevelWid
			pToa     topBordHgt
			add     
			sub     
			aTop     top
			pTos     left
			pTos     bevelWid
			pToa     sideBordWid
			add     
			sub     
			aTop     left
			pTos     bottom
			pTos     bevelWid
			pToa     botBordHgt
			add     
			add     
			aTop     bottom
			pTos     right
			pTos     bevelWid
			pToa     sideBordWid
			add     
			add     
			aTop     right
			pTos     bevelWid
			pToa     sideBordWid
			add     
			aTop     xOffset
			pTos     bevelWid
			pToa     topBordHgt
			add     
			aTop     yOffset
			pushi    #open
			pushi    0
			super    BorderWindow,  4
			pushi    13
			lst      temp2
			lst      temp3
			lst      temp4
			lst      temp5
			pTos     insideColor
			pTos     topBordColor2
			pTos     lftBordColor2
			pTos     botBordColor2
			pTos     rgtBordColor2
			pTos     bevWid
			pTos     shadWid
			pTos     priority
			lst      temp0
			call     localproc_0318,  26
			pushi    0
			callk    GetPort,  0
			sat      temp1
			pushi    1
			pushi    0
			callk    SetPort,  2
			pushi    6
			pushi    12
			lst      temp2
			pToa     bevWid
			sub     
			push    
			lst      temp3
			pToa     bevWid
			sub     
			push    
			lst      temp4
			pToa     bevWid
			add     
			push    
			lst      temp5
			pToa     bevWid
			add     
			push    
			pushi    1
			callk    Graph,  12
			pushi    1
			lst      temp1
			callk    SetPort,  2
			ret     
		)
	)
)
