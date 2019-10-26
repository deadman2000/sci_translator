;;; Sierra Script 1.0 - (do not remove this comment)
(script# 857)
(include sci.sh)
(use n000)
(use n255)
(use n999)


(class GiveOrTakeIcon of DIcon
	(properties
		type $0004
		state $0001
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
		client 0
		dialog 0
		theLastX 0
		theLastY 0
		theLastVal 0
	)
	
	(method (doit)
		(asm
			pushi    #get
			pushi    1
			pushSelf
			pToa     client
			send     6
			ret     
		)
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      256
			eq?     
			bt       code_009a
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_00b5
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_009a:
			bnt      code_00b5
			pushi    #check
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_00b5
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      1
			jmp      code_00ce
code_00b5:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_00ce
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    DIcon,  6
code_00ce:
			ret     
		)
	)
	
	(method (track param1 &tmp temp0 temp1 temp2)
		(asm
			pushi    1
			pushi    #type
			pushi    0
			lap      param1
			send     4
			eq?     
			bnt      code_006f
			ldi      0
			sat      temp1
code_0019:
			pushi    #new
			pushi    0
			class    Event
			send     4
			sap      param1
			pushi    #type
			pushi    0
			send     4
			sat      temp2
			pushi    #localize
			pushi    0
			lap      param1
			send     4
			pushi    #check
			pushi    1
			lsp      param1
			self     6
			sat      temp0
			push    
			lat      temp1
			ne?     
			bnt      code_004c
			pushi    #highlight
			pushi    0
			self     4
			lat      temp0
			sat      temp1
code_004c:
			pushi    #dispose
			pushi    0
			lap      param1
			send     4
			lst      temp2
			ldi      2
			eq?     
			bt       code_005e
			jmp      code_0019
code_005e:
			lat      temp0
			bnt      code_0069
			pushi    #highlight
			pushi    0
			self     4
code_0069:
			lat      temp0
			ret     
			jmp      code_0071
code_006f:
			selfID  
			ret     
code_0071:
			ret     
		)
	)
	
	(method (draw param1 &tmp temp0 temp1 temp2 temp3 [temp4 10] [temp14 10] [temp24 4])
		(asm
			pushi    #draw
			pushi    0
			&rest    param1
			super    DIcon,  4
			pushSelf
			pushi    #giver
			pushi    0
			pToa     client
			send     4
			eq?     
			sat      temp0
			pushi    #font
			pushi    0
			pushi    #client
			pushi    0
			pToa     dialog
			send     4
			send     4
			sat      temp1
			lat      temp0
			bnt      code_0111
			pushi    #color
			pushi    0
			pushi    #client
			pushi    0
			pToa     dialog
			send     4
			send     4
			jmp      code_011d
code_0111:
			pushi    #color
			pushi    0
			pushi    #window
			pushi    0
			pToa     dialog
			send     4
			send     4
code_011d:
			sat      temp2
			lat      temp0
			bnt      code_0153
			pushi    3
			lea      @temp4
			push    
			lofsa    {%d}
			push    
			pushi    #taken
			pushi    0
			pToa     client
			send     4
			push    
			callk    Format,  6
			pushi    3
			lea      @temp24
			push    
			lea      @temp4
			push    
			lst      temp1
			callk    TextSize,  6
			pTos     nsRight
			ldi      5
			add     
			sat      temp3
			jmp      code_0184
code_0153:
			pushi    3
			lea      @temp4
			push    
			lofsa    {%d}
			push    
			pushi    #number
			pushi    0
			pToa     client
			send     4
			push    
			callk    Format,  6
			pushi    3
			lea      @temp24
			push    
			lea      @temp4
			push    
			lst      temp1
			callk    TextSize,  6
			pTos     nsLeft
			ldi      2
			lati     temp24
			sub     
			push    
			ldi      5
			sub     
			sat      temp3
code_0184:
			pushi    3
			lea      @temp14
			push    
			lofsa    {%d}
			push    
			pTos     theLastVal
			callk    Format,  6
			pushi    8
			lea      @temp14
			push    
			pushi    102
			pushi    #back
			pushi    0
			pushi    #window
			pushi    0
			pToa     dialog
			send     4
			send     4
			push    
			pushi    105
			lst      temp1
			pushi    100
			pTos     theLastX
			pTos     theLastY
			callk    Display,  16
			pushi    8
			lea      @temp4
			push    
			pushi    102
			lst      temp2
			pushi    105
			lst      temp1
			pushi    100
			lat      temp3
			aTop     theLastX
			push    
			pTos     nsBottom
			pToa     nsTop
			add     
			push    
			ldi      3
			lati     temp24
			sub     
			push    
			ldi      2
			div     
			aTop     theLastY
			push    
			callk    Display,  16
			lat      temp0
			bnt      code_01ef
			pushi    #taken
			pushi    0
			pToa     client
			send     4
			jmp      code_01f6
code_01ef:
			pushi    #number
			pushi    0
			pToa     client
			send     4
code_01f6:
			aTop     theLastVal
			ret     
		)
	)
	
	(method (highlight)
		(asm
			ldi      1
			ret     
		)
	)
)

(instance keepButton of DButton
	(properties)
)

(instance giveButton of DButton
	(properties
		value 1
	)
)

(class MoneyDialog of Dialog
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
		margin 30
		taker 0
		giver 0
		client 0
	)
	
	(method (init param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(asm
			lap      param1
			aTop     client
			pushi    #window
			pushi    0
			send     4
			bt       code_02e2
			lag      global38
code_02e2:
			aTop     window
			pToa     text
			bnt      code_02f4
			pushi    #title
			pushi    1
			push    
			pToa     window
			send     6
			jmp      code_02fd
code_02f4:
			pushi    #title
			pushi    0
			pToa     window
			send     4
			aTop     text
code_02fd:
			pushi    #font
			pushi    0
			lap      param1
			send     4
			sat      temp6
			pushi    #view
			pushi    0
			lap      param1
			send     4
			sat      temp2
			pushi    #loop
			pushi    0
			lap      param1
			send     4
			sat      temp3
			ldi      0
			sat      temp0
			ldi      10
			sat      temp7
code_0320:
			pushi    #at
			pushi    1
			lst      temp0
			lap      param1
			send     6
			sat      temp1
			bnt      code_03de
			pushi    #dialog
			pushi    1
			pushSelf
			pushi    45
			pushi    1
			push    
			pushi    5
			pushi    1
			lst      temp2
			pushi    6
			pushi    1
			lst      temp3
			pushi    7
			pushi    1
			pushi    0
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pTos     margin
			lst      temp7
			pushi    #new
			pushi    0
			class    GiveOrTakeIcon
			send     4
			sat      temp4
			send     42
			pushi    32
			pushi    1
			pushi    #species
			pushi    5
			pushi    1
			lst      temp2
			pushi    6
			pushi    1
			lst      temp3
			pushi    7
			pushi    1
			lst      temp0
			ldi      2
			add     
			push    
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pushi    5
			pushi    #nsRight
			pushi    0
			lat      temp4
			send     4
			add     
			push    
			lst      temp7
			pushi    668
			pushi    1
			lst      temp4
			pushi    665
			pushi    1
			pushi    1
			lst      temp4
			callk    Clone,  2
			sat      temp5
			push    
			pushi    666
			pushi    1
			pushi    0
			lat      temp1
			send     54
			pushi    7
			pushi    #superClass
			pushi    1
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pushi    5
			pushi    #nsRight
			pushi    0
			lat      temp1
			send     4
			add     
			push    
			lst      temp7
			lat      temp5
			send     18
			pushi    #add
			pushi    3
			lst      temp4
			lst      temp1
			lst      temp5
			self     10
			+at      temp0
			pushi    15
			pushi    #nsBottom
			pushi    0
			lat      temp1
			send     4
			add     
			sat      temp7
			jmp      code_0320
code_03de:
			pushi    #font
			pushi    1
			lst      temp6
			pushi    26
			pushi    1
			pushi    #keepStr
			pushi    0
			lap      param1
			send     4
			push    
			pushi    170
			pushi    0
			lofsa    keepButton
			send     16
			pushi    172
			pushi    2
			pushi    #nsLeft
			pushi    0
			lat      temp4
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lat      temp4
			send     4
			add     
			push    
			ldi      2
			div     
			push    
			pushi    #nsRight
			pushi    0
			lofsa    keepButton
			send     4
			push    
			ldi      2
			div     
			sub     
			push    
			lst      temp7
			lofsa    keepButton
			send     8
			pushi    #font
			pushi    1
			lst      temp6
			pushi    26
			pushi    1
			pushi    #giveStr
			pushi    0
			lap      param1
			send     4
			push    
			pushi    170
			pushi    0
			lofsa    giveButton
			send     16
			pushi    172
			pushi    2
			pushi    #nsLeft
			pushi    0
			lat      temp5
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lat      temp5
			send     4
			add     
			push    
			ldi      2
			div     
			push    
			pushi    #nsRight
			pushi    0
			lofsa    giveButton
			send     4
			push    
			ldi      2
			div     
			sub     
			push    
			lst      temp7
			lofsa    giveButton
			send     8
			pushi    #add
			pushi    2
			lofsa    keepButton
			push    
			lofsa    giveButton
			push    
			pushi    170
			pushi    0
			self     12
			pushi    12
			pushi    #superClass
			pTos     margin
			pToa     nsRight
			add     
			push    
			pushi    182
			pushi    0
			self     10
			ret     
		)
	)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3)
		(asm
			pushi    #cursor
			pushi    0
			pToa     client
			send     4
			bt       code_04b5
			pushi    #cursor
			pushi    0
			pushi    #at
			pushi    1
			pushi    #number
			pushi    0
			pToa     client
			send     4
			push    
			lag      global9
			send     6
			send     4
			bt       code_04b5
			ldi      999
code_04b5:
			sat      temp3
			pushi    #setCursor
			pushi    1
			push    
			lag      global1
			send     6
			sat      temp1
			pushi    #open
			pushi    2
			pushi    4
			pushi    65535
			self     8
			pushi    #eachElementDo
			pushi    1
			pushi    168
			self     6
			pushi    #doit
			pushi    0
			&rest    param1
			super    Dialog,  4
			sat      temp0
			pushi    1
			push    
			callk    IsObject,  2
			bnt      code_04ef
			pushi    #value
			pushi    0
			lat      temp0
			send     4
			sat      temp0
code_04ef:
			lat      temp0
			not     
			bnt      code_04fd
			pushi    #put
			pushi    0
			pToa     client
			send     4
code_04fd:
			pushi    #value
			pushi    0
			pToa     client
			send     4
			bnt      code_0514
			pushi    #setCursor
			pushi    1
			lst      temp1
			lag      global1
			send     6
			jmp      code_0537
code_0514:
			pushi    #curIcon
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			sat      temp2
			push    
			lag      global69
			send     6
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			lat      temp2
			send     4
			push    
			lag      global1
			send     6
code_0537:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Dialog,  4
			pushi    1
			pushi    857
			callk    DisposeScript,  2
			ret     
		)
	)
)
