;;; Sierra Script 1.0 - (do not remove this comment)
(script# 996)
(include sci.sh)
(use n000)
(use n945)
(use n992)
(use n998)
(use n999)


(local
	[local0 23]
	local23
)
(instance uEvt of Event
	(properties)
)

(class User of Obj
	(properties
		alterEgo 0
		input 0
		controls 0
		echo 32
		prevDir 0
		prompt 1817
		inputLineAddr 0
		x -1
		y -1
		mapKeyToDir 1
		curEvent 0
		verbMessager 0
	)
	
	(method (init param1 param2)
		(asm
			lap      argc
			bnt      code_0034
			lap      param1
			jmp      code_0037
code_0034:
			lea      @local0
code_0037:
			aTop     inputLineAddr
			lsp      argc
			ldi      2
			eq?     
			bnt      code_0046
			lap      param2
			jmp      code_0048
code_0046:
			ldi      45
code_0048:
			sal      local23
			lofsa    uEvt
			aTop     curEvent
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    40
			pushi    1
			pushi    0
			pushi    64
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    0
			pushi    76
			pushi    1
			pushi    0
			pushi    143
			pushi    1
			pushi    0
			pToa     curEvent
			send     42
			pushi    2
			pushi    32767
			pTos     curEvent
			callk    GetEvent,  4
			pushi    #handleEvent
			pushi    1
			pTos     curEvent
			self     6
			ret     
		)
	)
	
	(method (canControl param1)
		(asm
			lap      argc
			bnt      code_02a0
			lap      param1
			aTop     controls
			ldi      0
			aTop     prevDir
code_02a0:
			pToa     controls
			ret     
		)
	)
	
	(method (getInput &tmp temp0)
		(asm
			ret     
		)
	)
	
	(method (said &tmp temp0)
		(asm
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1)
		(asm
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			sag      global70
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			sag      global71
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0193
			lap      pEvent
			sag      global24
			pToa     mapKeyToDir
			bnt      code_00bc
			pushi    1
			lsp      pEvent
			callk    MapKeyToDir,  2
code_00bc:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      256
			eq?     
			bnt      code_00f1
			pushi    34
			pushi    1
			pushi    4
			pushi    40
			pushi    1
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_00e6
			ldi      27
			jmp      code_00e8
code_00e6:
			ldi      13
code_00e8:
			push    
			pushi    64
			pushi    1
			pushi    0
			lap      pEvent
			send     18
code_00f1:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			sat      temp0
			lag      global68
			bnt      code_0109
			pushi    #handleEvent
			pushi    2
			lsp      pEvent
			lst      temp0
			send     8
code_0109:
			pushi    #localize
			pushi    0
			lap      pEvent
			send     4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_0166
			lag      global77
			bnt      code_012c
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_012c:
			bt       code_0193
			lag      global74
			bnt      code_013c
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_013c:
			bt       code_0193
			pToa     alterEgo
			bnt      code_0153
			pToa     controls
			bnt      code_0153
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			pToa     alterEgo
			send     6
code_0153:
			bt       code_0193
			lag      global69
			bnt      code_0193
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
			jmp      code_0193
code_0166:
			lst      temp0
			ldi      4
			eq?     
			bnt      code_017e
			lag      global72
			bnt      code_0193
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
			jmp      code_0193
code_017e:
			lst      temp0
			ldi      1
			eq?     
			bnt      code_0193
			lag      global73
			bnt      code_0193
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_0193:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_028f
			lag      global69
			bnt      code_01ab
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_01ab:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			eq?     
			bnt      code_0270
			pToa     input
			bnt      code_0270
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_01e4
			pToa     controls
			bnt      code_01e4
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			pToa     alterEgo
			send     6
			bnt      code_01e4
			ldi      1
			jmp      code_0252
code_01e4:
			lag      global34
			bnt      code_0231
			pushi    #init
			pushi    0
			lofsa    OnMeAndLowY
			send     4
			pushi    #eachElementDo
			pushi    3
			pushi    99
			lofsa    OnMeAndLowY
			push    
			lsp      pEvent
			lag      global5
			send     10
			pushi    #eachElementDo
			pushi    3
			pushi    99
			lofsa    OnMeAndLowY
			push    
			lsp      pEvent
			lag      global32
			send     10
			pushi    #theObj
			pushi    0
			lofsa    OnMeAndLowY
			send     4
			bnt      code_0252
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			pushi    #theObj
			pushi    0
			lofsa    OnMeAndLowY
			send     4
			send     6
			jmp      code_0252
code_0231:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lag      global5
			send     6
			bnt      code_0243
			ldi      1
			jmp      code_0252
code_0243:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lag      global32
			send     6
			bnt      code_0252
			ldi      1
code_0252:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0261
			ldi      1
			jmp      code_0270
code_0261:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lag      global6
			send     6
			bnt      code_0270
			ldi      1
code_0270:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			bnt      code_028f
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_028f
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lag      global1
			send     6
code_028f:
			ret     
		)
	)
	
	(method (canInput param1)
		(asm
			lap      argc
			bnt      code_0059
			lap      param1
			aTop     input
code_0059:
			pToa     input
			ret     
		)
	)
)

(class Ego of Actor
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $2000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 6
		script 0
		cycler 0
		timer 0
		detailLevel 0
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 6
		blocks 0
		baseSetter 0
		mover 0
		looper 0
		viewer 0
		avoider 0
		code 0
		edgeHit 0
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Actor,  4
			pToa     cycler
			not     
			bnt      code_032b
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			self     6
code_032b:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Actor,  4
			pTos     x
			ldi      0
			le?     
			bnt      code_033f
			ldi      4
			jmp      code_0370
code_033f:
			pTos     x
			ldi      319
			ge?     
			bnt      code_034d
			ldi      2
			jmp      code_0370
code_034d:
			pTos     y
			ldi      189
			ge?     
			bnt      code_035b
			ldi      3
			jmp      code_0370
code_035b:
			pTos     y
			pushi    #horizon
			pushi    0
			lag      global2
			send     4
			le?     
			bnt      code_036e
			ldi      1
			jmp      code_0370
code_036e:
			ldi      0
code_0370:
			aTop     edgeHit
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pToa     script
			bnt      code_0422
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_0422:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bt       code_0435
			pushi    #contains
			pushi    1
			pushSelf
			lag      global5
			send     6
			not     
code_0435:
			bnt      code_043d
			ldi      1
			jmp      code_059b
code_043d:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_04b4
			pushi    #controls
			pushi    0
			lag      global80
			send     4
			bnt      code_04b4
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			sat      temp0
			push    
			ldi      0
			eq?     
			bnt      code_047c
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_047c
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
code_047c:
			lst      temp0
			pushi    #prevDir
			pushi    0
			lag      global80
			send     4
			eq?     
			bnt      code_0497
			pushi    1
			pTos     mover
			callk    IsObject,  2
			bnt      code_0497
			ldi      0
			sat      temp0
code_0497:
			pushi    #prevDir
			pushi    1
			lst      temp0
			lag      global80
			send     6
			pushi    #setDirection
			pushi    1
			lst      temp0
			self     6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_059b
code_04b4:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			eq?     
			bt       code_04ce
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
code_04ce:
			bnt      code_0592
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bt       code_04ea
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
code_04ea:
			bnt      code_0586
			pushi    #controls
			pushi    0
			lag      global80
			send     4
			bnt      code_0586
			lsg      global67
			dup     
			ldi      0
			eq?     
			bnt      code_0522
			pushi    283
			pushi    #y
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			pToa     z
			add     
			push    
			self     10
			jmp      code_0571
code_0522:
			dup     
			ldi      1
			eq?     
			bnt      code_054a
			pushi    283
			pushi    #y
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			pToa     z
			add     
			push    
			self     10
			jmp      code_0571
code_054a:
			dup     
			ldi      2
			eq?     
			bnt      code_0571
			pushi    283
			pushi    #view
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			pToa     z
			add     
			push    
			pushi    0
			pushi    0
			self     14
code_0571:
			toss    
			pushi    #prevDir
			pushi    1
			pushi    0
			lag      global80
			send     6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			jmp      code_059b
code_0586:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Actor,  6
			jmp      code_059b
code_0592:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Actor,  6
code_059b:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (get param1 &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_0379:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_0398
			pushi    #moveTo
			pushi    1
			pushSelf
			pushi    #at
			pushi    1
			lat      temp0
			lspi     param1
			lag      global9
			send     6
			send     6
			+at      temp0
			jmp      code_0379
code_0398:
			ret     
		)
	)
	
	(method (put param1 param2 &tmp temp0)
		(asm
			pushi    #has
			pushi    1
			lsp      param1
			self     6
			bnt      code_03fa
			pushi    172
			pushi    1
			lsp      argc
			ldi      1
			eq?     
			bnt      code_03b7
			ldi      65535
			jmp      code_03b9
code_03b7:
			lap      param2
code_03b9:
			push    
			pushi    #at
			pushi    1
			lsp      param1
			lag      global9
			send     6
			sat      temp0
			send     6
			lag      global69
			bnt      code_03fa
			pushi    #curInvIcon
			pushi    0
			send     4
			push    
			lat      temp0
			eq?     
			bnt      code_03fa
			pushi    #curInvIcon
			pushi    1
			pushi    0
			pushi    201
			pushi    1
			pushi    #cursor
			pushi    1
			pushi    999
			pushi    114
			pushi    0
			pushi    #useIconItem
			pushi    0
			lag      global69
			send     4
			send     10
			push    
			lag      global69
			send     12
code_03fa:
			ret     
		)
	)
	
	(method (has param1 &tmp temp0)
		(asm
			pushi    #at
			pushi    1
			lsp      param1
			lag      global9
			send     6
			sat      temp0
			bnt      code_0412
			pushi    #ownedBy
			pushi    1
			pushSelf
			send     6
code_0412:
			ret     
		)
	)
)

(class OnMeAndLowY of Code
	(properties
		theObj 0
		lastY -1
	)
	
	(method (init)
		(asm
			ldi      0
			aTop     theObj
			ldi      65535
			aTop     lastY
			ret     
		)
	)
	
	(method (doit param1 param2)
		(asm
			pushi    #onMe
			pushi    1
			lsp      param2
			lap      param1
			send     6
			bnt      code_06df
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pToa     lastY
			gt?     
			bnt      code_06df
			lap      param1
			aTop     theObj
			pushi    #y
			pushi    0
			send     4
			aTop     lastY
code_06df:
			ret     
		)
	)
)
