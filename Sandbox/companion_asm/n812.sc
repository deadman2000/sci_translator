;;; Sierra Script 1.0 - (do not remove this comment)
(script# 812)
(include sci.sh)
(use n000)
(use n255)
(use n992)
(use n994)
(use n996)
(use n999)


(instance controls of Controls
	(properties)
)

(class StdRoom of Rm
	(properties
		script 0
		number 0
		timer 0
		keep 0
		initialized 0
		lookStr 0
		picture 0
		style $ffff
		horizon 0
		controls 0
		north 0
		east 0
		south 0
		west 0
		curPic 0
		picAngle 0
		vanishingX 160
		vanishingY -30000
		obstacles 0
		tpX 160
		tpY 160
	)
	
	(method (init param1 param2)
		(asm
			pToa     script
			bnt      code_002c
			lap      argc
			bnt      code_002c
			lap      param1
code_002c:
			not     
			bnt      code_0050
			pushi    0
			&rest    param2
			callb    proc0_2,  0
			pushi    #doit
			pushi    0
			pushi    #cycler
			pushi    0
			lag      global0
			send     4
			send     4
			pushi    #showSelf
			pushi    0
			pushi    #_head
			pushi    0
			lag      global0
			send     4
			send     4
code_0050:
			pToa     script
			bt       code_005c
			lap      argc
			bnt      code_0074
			lap      param1
code_005c:
			bnt      code_0074
			pushi    #edgeHit
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lag      global0
			send     10
			pushi    #init
			pushi    0
			super    Rm,  4
			jmp      code_00c9
code_0074:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			not     
			bnt      code_00a7
			pushi    #x
			pushi    1
			pTos     tpX
			pushi    3
			pushi    1
			pTos     tpY
			pushi    107
			pushi    0
			lag      global0
			send     16
			pushi    #style
			pushi    1
			pushi    100
			self     6
			pushi    #init
			pushi    0
			super    Rm,  4
			jmp      code_00c9
code_00a7:
			pushi    #register
			pushi    1
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    walkIn
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #setScript
			pushi    1
			lofsa    walkIn
			push    
			self     6
code_00c9:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			bnt      code_00d9
			pushi    #doit
			pushi    0
			send     4
			jmp      code_00fa
code_00d9:
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			class    User
			send     4
			send     4
			sat      temp0
			bnt      code_00fa
			pushi    #setScript
			pushi    3
			lofsa    walkOut
			push    
			pushi    0
			lst      temp0
			self     10
code_00fa:
			ret     
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0235
			pushi    0
			callb    proc0_3,  0
			ldi      25
			sat      temp5
			pushi    3
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			callk    CelWide,  6
			sat      temp4
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sat      temp2
			sat      temp0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sat      temp3
			sat      temp1
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_01db
			pushi    189
			lat      temp5
			add     
			sat      temp1
			jmp      code_020b
code_01db:
			dup     
			ldi      3
			eq?     
			bnt      code_01ec
			lst      temp3
			ldi      2
			sub     
			sat      temp1
			jmp      code_020b
code_01ec:
			dup     
			ldi      2
			eq?     
			bnt      code_01fc
			pushi    0
			lat      temp4
			sub     
			sat      temp0
			jmp      code_020b
code_01fc:
			dup     
			ldi      4
			eq?     
			bnt      code_020b
			pushi    319
			lat      temp4
			add     
			sat      temp0
code_020b:
			toss    
			pushi    #edgeHit
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lst      temp0
			lst      temp1
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp2
			lst      temp3
			pushSelf
			lag      global0
			send     36
			jmp      code_0252
code_0235:
			dup     
			ldi      1
			eq?     
			bnt      code_0252
			pushi    0
			callb    proc0_4,  0
			pushi    #ignoreActors
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pToa     client
			send     6
code_0252:
			toss    
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_030f
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sat      temp1
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_02c1
			lst      temp1
			ldi      10
			sub     
			sat      temp1
			jmp      code_02f1
code_02c1:
			dup     
			ldi      3
			eq?     
			bnt      code_02d2
			lst      temp1
			ldi      20
			add     
			sat      temp1
			jmp      code_02f1
code_02d2:
			dup     
			ldi      2
			eq?     
			bnt      code_02e3
			lst      temp0
			ldi      17
			add     
			sat      temp0
			jmp      code_02f1
code_02e3:
			dup     
			ldi      4
			eq?     
			bnt      code_02f1
			lst      temp0
			ldi      17
			sub     
			sat      temp0
code_02f1:
			toss    
			pushi    0
			callb    proc0_3,  0
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     18
			jmp      code_0332
code_030f:
			dup     
			ldi      1
			eq?     
			bnt      code_0332
			pushi    #setScript
			pushi    1
			pushi    0
			pToa     client
			send     6
			pushi    #newRoom
			pushi    1
			pushi    #edgeToRoom
			pushi    1
			pTos     register
			lag      global2
			send     6
			push    
			lag      global2
			send     6
code_0332:
			toss    
			ret     
		)
	)
)
