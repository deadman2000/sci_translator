;;; Sierra Script 1.0 - (do not remove this comment)
(script# 937)
(include sci.sh)
(use n000)
(use n255)
(use n999)


(class IconI of Obj
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
	)
	
	(method (show param1 param2 &tmp [temp0 7])
		(asm
			pTos     signal
			ldi      32
			or      
			aTop     signal
			lap      argc
			bnt      code_003b
			lap      param1
			aTop     nsLeft
			push    
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelWide,  6
			add     
			aTop     nsRight
			lap      param2
			aTop     nsTop
			push    
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelHigh,  6
			add     
			aTop     nsBottom
			jmp      code_005b
code_003b:
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
code_005b:
			pushi    6
			pTos     view
			pTos     loop
			pTos     cel
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pTos     signal
			ldi      4
			and     
			bnt      code_007a
			pushi    #mask
			pushi    0
			self     4
code_007a:
			lag      global77
			bnt      code_0092
			pushi    #respondsTo
			pushi    1
			pushi    156
			send     6
			bnt      code_0092
			pushi    #stop
			pushi    0
			lag      global77
			send     4
code_0092:
			ret     
		)
	)
	
	(method (select param1 &tmp temp0 temp1)
		(asm
			pTos     signal
			ldi      4
			and     
			bnt      code_01d5
			ldi      0
			jmp      code_02c9
code_01d5:
			lap      argc
			bnt      code_02c7
			lap      param1
			bnt      code_02c7
			pTos     signal
			ldi      1
			and     
			bnt      code_02c7
			pushi    6
			pTos     view
			pTos     loop
			ldi      1
			sat      temp1
			push    
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			pushi    1
			callk    Graph,  12
code_020b:
			pushi    #type
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			send     4
			push    
			ldi      2
			ne?     
			bnt      code_0293
			pushi    #localize
			pushi    0
			lat      temp0
			send     4
			pushi    #onMe
			pushi    1
			lst      temp0
			self     6
			bnt      code_0260
			lat      temp1
			not     
			bnt      code_0289
			pushi    6
			pTos     view
			pTos     loop
			ldi      1
			sat      temp1
			push    
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			pushi    1
			callk    Graph,  12
			jmp      code_0289
code_0260:
			lat      temp1
			bnt      code_0289
			pushi    6
			pTos     view
			pTos     loop
			ldi      0
			sat      temp1
			push    
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			pushi    1
			callk    Graph,  12
code_0289:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_020b
code_0293:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			lst      temp1
			ldi      1
			eq?     
			bnt      code_02c2
			pushi    6
			pTos     view
			pTos     loop
			pushi    0
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			pushi    1
			callk    Graph,  12
code_02c2:
			lat      temp1
			jmp      code_02c9
code_02c7:
			ldi      1
code_02c9:
			ret     
		)
	)
	
	(method (highlight param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pTos     signal
			ldi      32
			and     
			not     
			bt       code_0127
			pTos     highlightColor
			ldi      65535
			eq?     
code_0127:
			bnt      code_012b
			ret     
code_012b:
			lap      argc
			bnt      code_013a
			lap      param1
			bnt      code_013a
			pToa     highlightColor
			jmp      code_013c
code_013a:
			pToa     lowlightColor
code_013c:
			sat      temp4
			pTos     nsTop
			ldi      2
			add     
			sat      temp0
			pTos     nsLeft
			ldi      2
			add     
			sat      temp1
			pTos     nsBottom
			ldi      3
			sub     
			sat      temp2
			pTos     nsRight
			ldi      4
			sub     
			sat      temp3
			pushi    8
			pushi    4
			lst      temp0
			lst      temp1
			lst      temp0
			push    
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp0
			lst      temp3
			lst      temp2
			lst      temp3
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp2
			lst      temp3
			lst      temp2
			lst      temp1
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp2
			lst      temp1
			lst      temp0
			lst      temp1
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    6
			pushi    12
			pTos     nsTop
			ldi      2
			sub     
			push    
			pTos     nsLeft
			ldi      2
			sub     
			push    
			pTos     nsBottom
			pTos     nsRight
			ldi      3
			add     
			push    
			pushi    1
			callk    Graph,  12
			ret     
		)
	)
	
	(method (onMe param1)
		(asm
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsLeft
			ge?     
			bnt      code_0116
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsTop
			ge?     
			bnt      code_0116
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsRight
			le?     
			bnt      code_0116
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsBottom
			le?     
code_0116:
			ret     
		)
	)
	
	(method (mask)
		(asm
			pushi    6
			pTos     maskView
			pTos     maskLoop
			pTos     maskCel
			pTos     nsLeft
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelWide,  6
			push    
			pushi    3
			pTos     maskView
			pTos     maskLoop
			pTos     maskCel
			callk    CelWide,  6
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pTos     nsTop
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelHigh,  6
			push    
			pushi    3
			pTos     maskView
			pTos     maskLoop
			pTos     maskCel
			callk    CelHigh,  6
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    65535
			callk    DrawCel,  12
			ret     
		)
	)
)

(class IconBar of Set
	(properties
		elements 0
		size 0
		height 0
		underBits 0
		oldMouseX 0
		oldMouseY 0
		curIcon 0
		highlightedIcon 0
		prevIcon 0
		curInvIcon 0
		useIconItem 0
		helpIconItem 0
		port 0
		window 0
		state $0400
		activateHeight 0
		y 0
	)
	
	(method (doit &tmp temp0)
		(asm
code_09da:
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			bnt      code_0a9d
			pTos     state
			ldi      32
			and     
			bnt      code_0a9d
			pushi    1
			pushi    1
			callk    Wait,  2
			pushi    #type
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      256
			eq?     
			bnt      code_0a28
			pushi    34
			pushi    1
			pushi    4
			pushi    40
			pushi    1
			pushi    #modifiers
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      3
			and     
			bnt      code_0a1d
			ldi      27
			jmp      code_0a1f
code_0a1d:
			ldi      13
code_0a1f:
			push    
			pushi    64
			pushi    1
			pushi    0
			lat      temp0
			send     18
code_0a28:
			pushi    #localize
			pushi    0
			lat      temp0
			send     4
			pushi    #type
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      1
			eq?     
			bt       code_0a57
			pushi    #type
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0a86
			pushi    #message
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      13
			eq?     
code_0a57:
			bnt      code_0a86
			pushi    1
			pTos     helpIconItem
			callk    IsObject,  2
			bnt      code_0a86
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      16
			and     
			bnt      code_0a86
			pushi    #type
			pushi    1
			pushi    16384
			pushi    40
			pushi    1
			pushi    #message
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			lat      temp0
			send     12
code_0a86:
			pushi    1
			lst      temp0
			callk    MapKeyToDir,  2
			pushi    #dispatchEvent
			pushi    1
			lst      temp0
			self     6
			bnt      code_09da
			jmp      code_0a9d
			jmp      code_09da
code_0a9d:
			pushi    1
			lst      temp0
			callk    IsObject,  2
			bnt      code_0aad
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
code_0aad:
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
		(asm
			pushi    #localize
			pushi    0
			lap      pEvent
			send     4
			pTos     state
			ldi      4
			and     
			bnt      code_0441
			jmp      code_067a
code_0441:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			sat      temp1
			not     
			bnt      code_0484
			pTos     state
			ldi      1024
			and     
			bnt      code_0484
			pushi    65526
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			le?     
			bnt      code_0484
			pprev   
			pToa     height
			le?     
			bnt      code_0484
			pushi    0
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			le?     
			bnt      code_0484
			pprev   
			ldi      320
			le?     
			bnt      code_0484
			ldi      0
			sat      temp0
			not     
code_0484:
			bt       code_04b0
			lst      temp1
			ldi      4
			eq?     
			bnt      code_0594
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
			bt       code_04a9
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      21248
			eq?     
code_04a9:
			bnt      code_0594
			ldi      1
			sat      temp0
code_04b0:
			bnt      code_0594
			pushi    #globalize
			pushi    0
			lap      pEvent
			send     4
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			aTop     oldMouseX
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			aTop     oldMouseY
			lag      global19
			sat      temp2
			pToa     curIcon
			sat      temp3
			pToa     curInvIcon
			sat      temp5
			pushi    #show
			pushi    0
			self     4
			lat      temp0
			bnt      code_051a
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #nsRight
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     curIcon
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			pToa     curIcon
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
code_051a:
			pushi    #doit
			pushi    0
			self     4
			lst      temp3
			pToa     curIcon
			eq?     
			bnt      code_0534
			lst      temp5
			pToa     curInvIcon
			eq?     
			bnt      code_0534
			lat      temp2
			jmp      code_053b
code_0534:
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
code_053b:
			sat      temp4
			lat      temp0
			bnt      code_0555
			pushi    #setCursor
			pushi    4
			lst      temp4
			pushi    1
			pTos     oldMouseX
			pTos     oldMouseY
			lag      global1
			send     12
			jmp      code_058c
code_0555:
			pushi    187
			pushi    #x
			lst      temp4
			pushi    1
			pushi    #x
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp6
			send     4
			push    
			pushi    2
			pushi    #y
			pushi    0
			lat      temp6
			send     4
			push    
			pushi    1
			pToa     height
			add     
			push    
			calle    proc999_3,  4
			push    
			lag      global1
			send     12
			pushi    #dispose
			pushi    0
			lat      temp6
			send     4
code_058c:
			pushi    #hide
			pushi    0
			self     4
			jmp      code_067a
code_0594:
			lst      temp1
			ldi      4
			and     
			bnt      code_0611
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      13
			eq?     
			bnt      code_05d1
			pushi    1
			pTos     curIcon
			callk    IsObject,  2
			bnt      code_060d
			pushi    #type
			pushi    1
			pushi    #type
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    40
			pushi    1
			pushi    #message
			pushi    0
			pToa     curIcon
			send     4
			push    
			lap      pEvent
			send     12
			jmp      code_060d
code_05d1:
			dup     
			ldi      20992
			eq?     
			bnt      code_05ea
			pushi    #swapCurIcon
			pushi    0
			self     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_060d
code_05ea:
			dup     
			ldi      0
			eq?     
			bnt      code_060d
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_060d
			pushi    #advanceCurIcon
			pushi    0
			self     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
code_060d:
			toss    
			jmp      code_067a
code_0611:
			lst      temp1
			ldi      1
			and     
			bnt      code_067a
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_0638
			pushi    #advanceCurIcon
			pushi    0
			self     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_067a
code_0638:
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_0657
			pushi    #swapCurIcon
			pushi    0
			self     4
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_067a
code_0657:
			pushi    1
			pTos     curIcon
			callk    IsObject,  2
			bnt      code_067a
			pushi    #type
			pushi    1
			pushi    #type
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    40
			pushi    1
			pushi    #message
			pushi    0
			pToa     curIcon
			send     4
			push    
			lap      pEvent
			send     12
code_067a:
			ret     
		)
	)
	
	(method (show &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(asm
			pushi    #pause
			pushi    0
			lag      global8
			send     4
			pTos     state
			ldi      32
			or      
			aTop     state
			pushi    #setCursor
			pushi    2
			pushi    999
			pushi    1
			lag      global1
			send     8
			pushi    3
			pushi    #view
			pushi    0
			pushi    #at
			pushi    1
			pushi    0
			self     6
			sat      temp0
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp0
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp0
			send     4
			push    
			callk    CelHigh,  6
			aTop     height
			pushi    0
			callk    GetPort,  0
			aTop     port
			pushi    1
			pushi    65535
			callk    SetPort,  2
			pushi    6
			pushi    7
			pTos     y
			pushi    0
			pTos     y
			pToa     height
			add     
			push    
			pushi    320
			pushi    1
			callk    Graph,  12
			aTop     underBits
			pushi    0
			callk    PicNotValid,  0
			sat      temp1
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			ldi      0
			sat      temp3
			pToa     y
			sat      temp4
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp5
code_07bb:
			lat      temp5
			bnt      code_080e
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp6
			pushi    1
			pushi    1
			lst      temp5
			callk    NodeValue,  2
			sat      temp7
			push    
			callk    IsObject,  2
			not     
			bnt      code_07d9
			ret     
code_07d9:
			pushi    #nsRight
			pushi    0
			lat      temp7
			send     4
			push    
			ldi      0
			le?     
			bnt      code_07ff
			pushi    #show
			pushi    2
			lst      temp3
			lst      temp4
			lat      temp7
			send     8
			pushi    #nsRight
			pushi    0
			lat      temp7
			send     4
			sat      temp3
			jmp      code_0807
code_07ff:
			pushi    #show
			pushi    0
			lat      temp7
			send     4
code_0807:
			lat      temp6
			sat      temp5
			jmp      code_07bb
code_080e:
			pToa     curInvIcon
			bnt      code_08f3
			pushi    #has
			pushi    1
			pushi    #indexOf
			pushi    1
			push    
			lag      global9
			send     6
			push    
			lag      global0
			send     6
			bnt      code_08ef
			pushi    #nsRight
			pushi    0
			pToa     useIconItem
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     useIconItem
			send     4
			sub     
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #cel
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			callk    CelWide,  6
			sub     
			push    
			ldi      2
			div     
			push    
			pushi    #nsLeft
			pushi    0
			pToa     useIconItem
			send     4
			add     
			sat      temp3
			pTos     y
			pushi    #nsBottom
			pushi    0
			pToa     useIconItem
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     useIconItem
			send     4
			sub     
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #cel
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			callk    CelHigh,  6
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsTop
			pushi    0
			pToa     useIconItem
			send     4
			add     
			sat      temp4
			pushi    6
			pushi    #view
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #cel
			pushi    0
			pToa     curInvIcon
			send     4
			push    
			lst      temp3
			lst      temp4
			pushi    65535
			callk    DrawCel,  12
			pushi    #signal
			pushi    0
			pToa     useIconItem
			send     4
			push    
			ldi      4
			and     
			bnt      code_08f3
			pushi    #mask
			pushi    0
			pToa     useIconItem
			send     4
			jmp      code_08f3
code_08ef:
			ldi      0
			aTop     curInvIcon
code_08f3:
			pushi    1
			lst      temp1
			callk    PicNotValid,  2
			pushi    6
			pushi    12
			pTos     y
			pushi    0
			pTos     y
			pToa     height
			add     
			push    
			pushi    320
			pushi    1
			callk    Graph,  12
			pushi    #highlight
			pushi    1
			pTos     curIcon
			self     6
			pushi    187
			pushi    2
			lsg      global19
			pushi    #nsLeft
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #nsRight
			pushi    0
			pToa     curIcon
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			lag      global1
			send     8
			ret     
		)
	)
	
	(method (hide &tmp temp0 temp1 temp2)
		(asm
			pTos     state
			ldi      32
			and     
			bnt      code_09d7
			pushi    #pause
			pushi    1
			pushi    0
			lag      global8
			send     6
			pTos     state
			ldi      65503
			and     
			aTop     state
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
code_0960:
			lat      temp0
			bnt      code_099e
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp1
			pushi    1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			push    
			callk    IsObject,  2
			not     
			bnt      code_097e
			ret     
code_097e:
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lat      temp2
			send     4
			push    
			ldi      65503
			and     
			push    
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			send     6
			lat      temp1
			sat      temp0
			jmp      code_0960
code_099e:
			pushi    2
			pushi    8
			pTos     underBits
			callk    Graph,  4
			pushi    6
			pushi    12
			pTos     y
			pushi    0
			pTos     y
			pToa     height
			add     
			push    
			pushi    320
			pushi    1
			callk    Graph,  12
			pushi    5
			pushi    13
			pTos     y
			pushi    0
			pTos     y
			pToa     height
			add     
			push    
			pushi    320
			callk    Graph,  10
			pushi    1
			pTos     port
			callk    SetPort,  2
			pToa     activateHeight
			aTop     height
code_09d7:
			ret     
		)
	)
	
	(method (advance &tmp temp0 temp1)
		(asm
			ldi      1
			sat      temp1
code_0d14:
			lst      temp1
			pToa     size
			le?     
			bnt      code_0d65
			pushi    67
			pushi    1
			lst      temp1
			pushi    #indexOf
			pushi    1
			pTos     highlightedIcon
			self     6
			add     
			push    
			pToa     size
			mod     
			push    
			self     6
			sat      temp0
			pushi    1
			push    
			callk    IsObject,  2
			not     
			bnt      code_0d48
			pushi    1
			pushi    #first
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			sat      temp0
code_0d48:
			pushi    #signal
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      4
			and     
			not     
			bt       code_0d65
			lst      temp1
			ldi      1
			add     
			push    
			pToa     size
			mod     
			sat      temp1
			jmp      code_0d14
code_0d65:
			pushi    195
			pushi    #-info-
			lst      temp0
			pTos     state
			ldi      32
			and     
			push    
			self     8
			ret     
		)
	)
	
	(method (retreat &tmp temp0 temp1)
		(asm
			ldi      1
			sat      temp1
code_0d7a:
			lst      temp1
			pToa     size
			le?     
			bnt      code_0dcc
			pushi    67
			pushi    1
			pushi    #indexOf
			pushi    1
			pTos     highlightedIcon
			self     6
			push    
			lat      temp1
			sub     
			push    
			pToa     size
			mod     
			push    
			self     6
			sat      temp0
			pushi    1
			push    
			callk    IsObject,  2
			not     
			bnt      code_0daf
			pushi    1
			pushi    #last
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			sat      temp0
code_0daf:
			pushi    #signal
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      4
			and     
			not     
			bt       code_0dcc
			lst      temp1
			ldi      1
			add     
			push    
			pToa     size
			mod     
			sat      temp1
			jmp      code_0d7a
code_0dcc:
			pushi    195
			pushi    #-info-
			lst      temp0
			pTos     state
			ldi      32
			and     
			push    
			self     8
			ret     
		)
	)
	
	(method (select param1 param2)
		(asm
			pushi    168
			pushi    1
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0de9
			lap      param2
code_0de9:
			push    
			lap      param1
			send     6
			bnt      code_0e06
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			push    
			ldi      2
			and     
			not     
			bnt      code_0e04
			lap      param1
			aTop     curIcon
code_0e04:
			ldi      1
code_0e06:
			ret     
		)
	)
	
	(method (highlight param1 param2 &tmp temp0)
		(asm
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_0e35
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			bnt      code_0e2a
			pushi    #highlight
			pushi    1
			pushi    0
			pToa     highlightedIcon
			send     6
code_0e2a:
			lap      param1
			aTop     highlightedIcon
			pushi    #highlight
			pushi    1
			pushi    1
			send     6
code_0e35:
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0e78
			lap      param2
			bnt      code_0e78
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			lap      param1
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
code_0e78:
			ret     
		)
	)
	
	(method (swapCurIcon &tmp temp0)
		(asm
			pTos     state
			ldi      4
			and     
			bnt      code_0ee7
			ret     
			jmp      code_0f31
code_0ee7:
			pTos     curIcon
			pushi    1
			pushi    #first
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			sat      temp0
			ne?     
			bnt      code_0f1b
			pushi    #signal
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_0f1b
			pToa     curIcon
			aTop     prevIcon
			pushi    1
			pushi    #first
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			aTop     curIcon
			jmp      code_0f31
code_0f1b:
			pToa     prevIcon
			bnt      code_0f31
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_0f31
			pToa     prevIcon
			aTop     curIcon
code_0f31:
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      global1
			send     8
			ret     
		)
	)
	
	(method (advanceCurIcon &tmp temp0 temp1)
		(asm
			pTos     state
			ldi      4
			and     
			bnt      code_0e84
			ret     
code_0e84:
			pToa     curIcon
			sat      temp0
			ldi      0
			sat      temp1
code_0e8c:
			pushi    17
			pushi    0
			pushi    #at
			pushi    1
			pushi    #indexOf
			pushi    1
			lst      temp0
			self     6
			push    
			ldi      1
			add     
			push    
			pToa     size
			mod     
			push    
			self     6
			sat      temp0
			send     4
			push    
			ldi      6
			and     
			bnt      code_0ec3
			lst      temp1
			pushi    1
			pToa     size
			add     
			gt?     
			bnt      code_0ebe
			ret     
			jmp      code_0e8c
code_0ebe:
			+at      temp1
			jmp      code_0e8c
code_0ec3:
			lat      temp0
			aTop     curIcon
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      global1
			send     8
			ret     
		)
	)
	
	(method (dispatchEvent pEvent &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
		(asm
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			sat      temp1
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			sat      temp0
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			sat      temp2
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			sat      temp3
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			sat      temp5
			pushi    #firstTrue
			pushi    2
			pushi    196
			lsp      pEvent
			self     8
			sat      temp4
			pushi    #dispose
			pushi    0
			lap      pEvent
			send     4
			lst      temp2
			ldi      64
			and     
			bnt      code_0b1b
			lst      temp3
			dup     
			ldi      3
			eq?     
			bnt      code_0b0a
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0b17
code_0b0a:
			dup     
			ldi      7
			eq?     
			bnt      code_0b17
			pushi    #retreat
			pushi    0
			self     4
code_0b17:
			toss    
			jmp      code_0d0b
code_0b1b:
			lst      temp2
			dup     
			ldi      0
			eq?     
			bnt      code_0b8d
			pushi    0
			lat      temp0
			le?     
			bnt      code_0b41
			pprev   
			pTos     y
			pToa     height
			add     
			le?     
			bnt      code_0b41
			pushi    0
			lat      temp1
			le?     
			bnt      code_0b41
			pprev   
			ldi      320
			le?     
code_0b41:
			not     
			bnt      code_0b72
			pTos     state
			ldi      1024
			and     
			bnt      code_0d0a
			pushi    1
			pTos     helpIconItem
			callk    IsObject,  2
			not     
			bt       code_0b64
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      16
			and     
			not     
code_0b64:
			bnt      code_0d0a
			ldi      0
			aTop     oldMouseY
			ldi      1
			sat      temp5
			jmp      code_0d0a
code_0b72:
			lat      temp4
			bnt      code_0d0a
			push    
			pToa     highlightedIcon
			ne?     
			bnt      code_0d0a
			ldi      0
			aTop     oldMouseY
			pushi    #highlight
			pushi    1
			lst      temp4
			self     6
			jmp      code_0d0a
code_0b8d:
			dup     
			ldi      1
			eq?     
			bnt      code_0bfe
			lat      temp4
			bnt      code_0d0a
			pushi    #select
			pushi    2
			push    
			pushi    1
			self     8
			bnt      code_0d0a
			lst      temp4
			pToa     helpIconItem
			eq?     
			bnt      code_0bee
			pushi    #cursor
			pushi    0
			lat      temp4
			send     4
			bnt      code_0bc6
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			lat      temp4
			send     4
			push    
			lag      global1
			send     6
code_0bc6:
			pTos     state
			ldi      2048
			and     
			bnt      code_0bd8
			pushi    #noClickHelp
			pushi    0
			self     4
			jmp      code_0d0a
code_0bd8:
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      16
			or      
			push    
			pToa     helpIconItem
			send     6
			jmp      code_0d0a
code_0bee:
			pushi    #signal
			pushi    0
			lat      temp4
			send     4
			push    
			ldi      64
			and     
			sat      temp5
			jmp      code_0d0a
code_0bfe:
			dup     
			ldi      4
			eq?     
			bnt      code_0cac
			lst      temp3
			dup     
			ldi      27
			eq?     
			bnt      code_0c15
			ldi      1
			sat      temp5
			jmp      code_0ca8
code_0c15:
			dup     
			ldi      13
			eq?     
			bnt      code_0c8a
			lat      temp4
			not     
			bnt      code_0c26
			pToa     highlightedIcon
			sat      temp4
code_0c26:
			lat      temp4
			bnt      code_0c69
			push    
			pToa     helpIconItem
			eq?     
			bnt      code_0c69
			pushi    #cursor
			pushi    0
			lat      temp4
			send     4
			push    
			ldi      65535
			ne?     
			bnt      code_0c50
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			lat      temp4
			send     4
			push    
			lag      global1
			send     6
code_0c50:
			pToa     helpIconItem
			bnt      code_0ca8
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      16
			or      
			push    
			pToa     helpIconItem
			send     6
			jmp      code_0ca8
code_0c69:
			pushi    1
			lst      temp4
			callk    IsObject,  2
			bnt      code_0ca8
			pushi    #select
			pushi    1
			lst      temp4
			self     6
			pushi    #signal
			pushi    0
			lat      temp4
			send     4
			push    
			ldi      64
			and     
			sat      temp5
			jmp      code_0ca8
code_0c8a:
			dup     
			ldi      3840
			eq?     
			bnt      code_0c9b
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0ca8
code_0c9b:
			dup     
			ldi      9
			eq?     
			bnt      code_0ca8
			pushi    #advance
			pushi    0
			self     4
code_0ca8:
			toss    
			jmp      code_0d0a
code_0cac:
			dup     
			ldi      16384
			eq?     
			bnt      code_0d0a
			lst      temp3
			ldi      6
			eq?     
			bnt      code_0d0a
			lat      temp4
			bnt      code_0ce9
			pushi    #helpStr
			pushi    0
			send     4
			bnt      code_0ce9
			pushi    0
			callk    GetPort,  0
			sat      temp6
			pushi    3
			pushi    937
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp4
			send     4
			push    
			calle    proc255_4,  6
			pushi    1
			lst      temp6
			callk    SetPort,  2
code_0ce9:
			pToa     helpIconItem
			bnt      code_0cff
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      65519
			and     
			push    
			pToa     helpIconItem
			send     6
code_0cff:
			pushi    #setCursor
			pushi    1
			pushi    999
			lag      global1
			send     6
code_0d0a:
			toss    
code_0d0b:
			lat      temp5
			ret     
		)
	)
	
	(method (disable param1 &tmp temp0 temp1)
		(asm
			lap      argc
			bnt      code_06e3
			ldi      0
			sat      temp0
code_0686:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_06ea
			pushi    1
			lat      temp0
			lspi     param1
			callk    IsObject,  2
			bnt      code_06a0
			lat      temp0
			lapi     param1
			jmp      code_06a9
code_06a0:
			pushi    #at
			pushi    1
			lat      temp0
			lspi     param1
			self     6
code_06a9:
			sat      temp1
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      4
			or      
			push    
			lat      temp1
			send     6
			lst      temp1
			pToa     curIcon
			eq?     
			bnt      code_06cd
			pushi    #advanceCurIcon
			pushi    0
			self     4
			jmp      code_06db
code_06cd:
			lst      temp1
			pToa     highlightedIcon
			eq?     
			bnt      code_06db
			pushi    #advance
			pushi    0
			self     4
code_06db:
			+at      temp0
			jmp      code_0686
			jmp      code_06ea
code_06e3:
			pTos     state
			ldi      4
			or      
			aTop     state
code_06ea:
			ret     
		)
	)
	
	(method (enable param1 &tmp temp0 temp1)
		(asm
			lap      argc
			bnt      code_0734
			ldi      0
			sat      temp0
code_06f6:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_073b
			pushi    1
			lat      temp0
			lspi     param1
			callk    IsObject,  2
			bnt      code_0710
			lat      temp0
			lapi     param1
			jmp      code_0719
code_0710:
			pushi    #at
			pushi    1
			lat      temp0
			lspi     param1
			self     6
code_0719:
			sat      temp1
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      65531
			and     
			push    
			lat      temp1
			send     6
			+at      temp0
			jmp      code_06f6
			jmp      code_073b
code_0734:
			pTos     state
			ldi      65531
			and     
			aTop     state
code_073b:
			ret     
		)
	)
	
	(method (noClickHelp &tmp temp0 temp1 temp2 [temp3 100] temp103)
		(asm
			ldi      0
			sat      temp2
			sat      temp1
			pushi    0
			callk    GetPort,  0
			sat      temp103
code_035c:
			pushi    #type
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			send     4
			not     
			bnt      code_03e7
			pushi    #isMemberOf
			pushi    1
			class    IconBar
			push    
			self     6
			not     
			bnt      code_0382
			pushi    #localize
			pushi    0
			lat      temp0
			send     4
code_0382:
			pushi    #firstTrue
			pushi    2
			pushi    196
			lst      temp0
			self     8
			sat      temp2
			bnt      code_03cc
			push    
			lat      temp1
			ne?     
			bnt      code_03dd
			pushi    #helpStr
			pushi    0
			lat      temp2
			send     4
			bnt      code_03dd
			lat      temp2
			sat      temp1
			pushi    2
			lea      @temp3
			push    
			pushi    #helpStr
			pushi    0
			lat      temp2
			send     4
			push    
			callk    Format,  4
			pushi    2
			lea      @temp3
			push    
			pushi    108
			calle    proc255_0,  4
			pushi    1
			lst      temp103
			callk    SetPort,  2
			jmp      code_03dd
code_03cc:
			lag      global25
			bnt      code_03d9
			pushi    #dispose
			pushi    0
			send     4
			jmp      code_03dd
code_03d9:
			ldi      0
			sat      temp1
code_03dd:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_035c
code_03e7:
			pushi    #setCursor
			pushi    2
			pushi    999
			pushi    1
			lag      global1
			send     8
			lag      global25
			bnt      code_03fd
			pushi    #dispose
			pushi    0
			send     4
code_03fd:
			pushi    1
			lst      temp103
			callk    SetPort,  2
			pushi    #onMe
			pushi    1
			lst      temp0
			pToa     helpIconItem
			send     6
			bnt      code_0423
			pushi    1
			lst      temp0
			callk    IsObject,  2
			bnt      code_042b
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_042b
code_0423:
			pushi    #dispatchEvent
			pushi    1
			lst      temp0
			self     6
code_042b:
			ret     
		)
	)
)
