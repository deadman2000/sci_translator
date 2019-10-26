;;; Sierra Script 1.0 - (do not remove this comment)
(script# 856)
(include sci.sh)
(use n000)
(use n255)
(use n857)
(use n999)


(class Denomination of DIcon
	(properties
		type $0004
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 1
		view 0
		loop 0
		cel 0
		number 0
		taken 0
		taker 0
		giver 0
		client 0
	)
	
	(method (dispose param1)
		(asm
			ldi      0
			aTop     giver
			aTop     taker
			pushi    #dispose
			pushi    0
			&rest    param1
			super    DIcon,  4
			ret     
		)
	)
	
	(method (get param1 &tmp temp0)
		(asm
			lap      argc
			not     
			bnt      code_0039
			ldi      0
			jmp      code_0057
code_0039:
			pushi    1
			lsp      param1
			callk    IsObject,  2
			not     
			bnt      code_0048
			lap      param1
			jmp      code_0057
code_0048:
			lsp      param1
			pToa     taker
			eq?     
			bnt      code_0055
			ldi      65535
			jmp      code_0057
code_0055:
			ldi      1
code_0057:
			sat      temp0
			pushi    0
			pTos     number
			sub     
			le?     
			bnt      code_0098
			pushi    0
			pTos     taken
			lat      temp0
			add     
			le?     
			bnt      code_0098
			pTos     number
			lat      temp0
			sub     
			aTop     number
			pTos     taken
			lat      temp0
			add     
			aTop     taken
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_0090
			pushi    #draw
			pushi    0
			pToa     taker
			send     4
			pushi    #draw
			pushi    0
			pToa     giver
			send     4
code_0090:
			pushi    #get
			pushi    0
			pToa     client
			send     4
code_0098:
			pTos     value
			pToa     taken
			mul     
			ret     
		)
	)
	
	(method (put param1)
		(asm
			lap      argc
			bnt      code_001c
			lap      param1
			aTop     taken
code_001c:
			pushi    #get
			pushi    1
			pToa     taken
			neg     
			push    
			self     6
			pTos     value
			pToa     number
			mul     
			ret     
		)
	)
)

(instance addValue of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    77
			pushi    1
			pushi    #value
			pushi    0
			lap      param2
			send     4
			push    
			pushi    #value
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #number
			pushi    0
			lap      param1
			send     4
			mul     
			add     
			push    
			pushi    666
			pushi    1
			pushi    #taken
			pushi    0
			lap      param2
			send     4
			push    
			pushi    #value
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #taken
			pushi    0
			lap      param1
			send     4
			mul     
			add     
			push    
			lap      param2
			send     12
			ret     
		)
	)
)

(class Money of List
	(properties
		elements 0
		size 0
		value 0
		taken 0
		view 0
		loop 0
		window 0
		color 4
		font 1
		cursor 0
		keepStr 684
		giveStr 689
		owner 0
		number -1
		title 0
	)
	
	(method (init param1)
		(asm
			pushi    #add
			pushi    0
			&rest    param1
			pushi    116
			pushi    2
			pushi    45
			pushSelf
			pushi    327
			pushi    0
			self     16
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			ldi      0
			aTop     taken
			pushi    #name
			pushi    1
			lofsa    {MoneyD}
			push    
			pushi    26
			pushi    1
			pTos     title
			pushi    107
			pushi    1
			pushSelf
			pushi    60
			pushi    0
			pushi    108
			pushi    0
			pushi    #new
			pushi    0
			class    MoneyDialog
			send     4
			sat      temp0
			send     26
			pToa     taken
			ret     
		)
	)
	
	(method (get)
		(asm
			ldi      0
			aTop     taken
			aTop     value
			pushi    #eachElementDo
			pushi    3
			pushi    99
			lofsa    addValue
			push    
			pushSelf
			self     10
			pushi    3
			pushi    65535
			pTos     owner
			pTos     number
			calle    proc999_5,  6
			not     
			bnt      code_0213
			pToa     value
			bnt      code_01ee
			pushi    #owner
			pushi    1
			pTos     owner
			pushi    #at
			pushi    1
			pTos     number
			lag      global9
			send     6
			send     6
			jmp      code_0213
code_01ee:
			pTos     owner
			lag      global0
			eq?     
			bnt      code_0203
			pushi    #put
			pushi    1
			pTos     number
			lag      global0
			send     6
			jmp      code_0213
code_0203:
			pushi    #owner
			pushi    1
			pushi    0
			pushi    #at
			pushi    1
			pTos     number
			lag      global9
			send     6
			send     6
code_0213:
			pToa     taken
			ret     
		)
	)
	
	(method (put)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    328
			pushi    327
			pushi    0
			self     10
			pToa     value
			ret     
		)
	)
)
