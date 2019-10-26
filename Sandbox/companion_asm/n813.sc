;;; Sierra Script 1.0 - (do not remove this comment)
(script# 813)
(include sci.sh)
(use n000)
(use n892)
(use n961)
(use n996)
(use n998)
(use n999)


(local
	[local0 8] = [0 4 6 2 7 5 1 3]
)
(class rhEgo of Ego
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
		_head 0
		normal 1
		moveHead 1
		beard 0
		abnormal 1
	)
	
	(method (dispose)
		(asm
			pToa     _head
			bnt      code_0129
			pushi    #dispose
			pushi    0
			send     4
code_0129:
			pToa     beard
			bnt      code_0133
			pushi    #dispose
			pushi    0
			send     4
code_0133:
			pushi    #dispose
			pushi    0
			super    Ego,  4
			ret     
		)
	)
	
	(method (setPri param1)
		(asm
			lsp      argc
			ldi      0
			eq?     
			bnt      code_00b4
			pTos     signal
			ldi      16
			or      
			aTop     signal
			pushi    #setPri
			pushi    0
			pToa     _head
			send     4
			jmp      code_00e3
code_00b4:
			lsp      param1
			ldi      65535
			eq?     
			bnt      code_00cf
			pTos     signal
			ldi      65519
			and     
			aTop     signal
			pushi    #setPri
			pushi    1
			pushi    65535
			pToa     _head
			send     6
			jmp      code_00e3
code_00cf:
			lap      param1
			aTop     priority
			pTos     signal
			ldi      16
			or      
			aTop     signal
			pushi    #setPri
			pushi    1
			lsp      param1
			pToa     _head
			send     6
code_00e3:
			ret     
		)
	)
	
	(method (setLoop param1 param2 &tmp temp0)
		(asm
			lsp      argc
			ldi      0
			eq?     
			bnt      code_0035
			pTos     signal
			ldi      2048
			or      
			aTop     signal
			ldi      0
			jmp      code_007f
code_0035:
			lsp      param1
			ldi      65535
			eq?     
			bnt      code_004a
			pTos     signal
			ldi      63487
			and     
			aTop     signal
			ldi      0
			jmp      code_007f
code_004a:
			pushi    1
			lsp      param1
			callk    IsObject,  2
			not     
			bnt      code_0065
			lap      param1
			aTop     loop
			pTos     signal
			ldi      2048
			or      
			aTop     signal
			ldi      0
			jmp      code_007f
code_0065:
			pushi    #-info-
			pushi    0
			lap      param1
			send     4
			push    
			ldi      32768
			and     
			bnt      code_007d
			pushi    #new
			pushi    0
			lap      param1
			send     4
			jmp      code_007f
code_007d:
			lap      param1
code_007f:
			sat      temp0
			bnt      code_009a
			pToa     looper
			bnt      code_008e
			pushi    #dispose
			pushi    0
			send     4
code_008e:
			pushi    #init
			pushi    1
			pushSelf
			&rest    param2
			lat      temp0
			aTop     looper
			send     6
code_009a:
			ret     
		)
	)
	
	(method (setCel param1)
		(asm
			lsp      param1
			pushi    #lastCel
			pushi    0
			self     4
			ge?     
			bnt      code_0019
			pushi    #lastCel
			pushi    0
			self     4
			jmp      code_001b
code_0019:
			lap      param1
code_001b:
			aTop     cel
			ret     
		)
	)
	
	(method (hide)
		(asm
			pToa     _head
			bnt      code_010e
			pushi    #hide
			pushi    0
			send     4
code_010e:
			pToa     beard
			bnt      code_0118
			pushi    #hide
			pushi    0
			send     4
code_0118:
			pushi    #hide
			pushi    0
			super    Ego,  4
			ret     
		)
	)
	
	(method (headView param1)
		(asm
			pushi    #view
			pushi    1
			lsp      param1
			pToa     _head
			send     6
			pushi    #signal
			pushi    0
			pToa     _head
			send     4
			push    
			ldi      8
			and     
			not     
			bnt      code_0103
			pushi    #showSelf
			pushi    0
			pToa     _head
			send     4
code_0103:
			ret     
		)
	)
	
	(method (egoSpeed param1)
		(asm
			lap      argc
			bnt      code_014f
			pushi    #cycleSpeed
			pushi    1
			lsp      param1
			pushi    56
			pushi    1
			lsp      param1
			self     12
			jmp      code_015c
code_014f:
			pushi    #cycleSpeed
			pushi    1
			lsg      global141
			pushi    56
			pushi    1
			lsg      global141
			self     12
code_015c:
			ret     
		)
	)
	
	(method (userSpeed)
		(asm
			pushi    #cycleSpeed
			pushi    1
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			push    
			pushi    56
			pushi    1
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			push    
			self     12
			ret     
		)
	)
)

(class Head of Prop
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
		signal $0000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 180
		script 0
		cycler 0
		timer 0
		detailLevel 0
		client 0
		_cnt 0
	)
	
	(method (init param1)
		(asm
			pushi    #client
			pushi    1
			lsp      param1
			pushi    289
			pushi    1
			pushi    1
			self     12
			pushi    #_head
			pushi    1
			pushSelf
			lap      param1
			send     6
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #hide
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #normal
			pushi    0
			pToa     client
			send     4
			bnt      code_03a9
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			push    
			ldi      8
			and     
			not     
			bnt      code_03a9
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			bnt      code_03a9
			pushi    1
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			push    
			callk    IsObject,  2
			bnt      code_03a9
			pushi    #isKindOf
			pushi    1
			class    StopWalk
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     6
			bt       code_0355
			pushi    #isKindOf
			pushi    1
			class    SyncStop
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     6
code_0355:
			bnt      code_03a9
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #vStopped
			pushi    0
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     4
			eq?     
			bnt      code_03a9
			pTos     signal
			ldi      4
			and     
			bnt      code_039b
			pTos     signal
			ldi      2
			and     
			not     
			bnt      code_039b
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			push    
			ldi      4
			and     
			bnt      code_0395
			ret     
			jmp      code_039b
code_0395:
			pushi    #startUpd
			pushi    0
			self     4
code_039b:
			pushi    #showSelf
			pushi    0
			self     4
			pushi    #lookAround
			pushi    0
			self     4
			jmp      code_03b7
code_03a9:
			pTos     signal
			ldi      8
			and     
			not     
			bnt      code_03b7
			pushi    #hide
			pushi    0
			self     4
code_03b7:
			pushi    #doit
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (showSelf &tmp temp0)
		(asm
			pTos     signal
			ldi      8
			and     
			bnt      code_03dd
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			lali     local0
			aTop     cel
			pToa     cycleSpeed
			aTop     _cnt
			pushi    #show
			pushi    0
			self     4
code_03dd:
			pushi    #x
			pushi    1
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			self     12
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pToa     client
			bnt      code_02ea
			pushi    1
			pushi    #actions
			pushi    0
			send     4
			push    
			callk    IsObject,  2
			bnt      code_02ea
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			pushi    #actions
			pushi    0
			pToa     client
			send     4
			send     8
code_02ea:
			not     
			bnt      code_02fc
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			pToa     client
			send     8
code_02fc:
			ret     
		)
	)
	
	(method (lookAround &tmp temp0)
		(asm
			pushi    #moveHead
			pushi    0
			pToa     client
			send     4
			bnt      code_04ec
			dpToa    _cnt
			push    
			ldi      1
			lt?     
			bnt      code_04ec
			pToa     cycleSpeed
			aTop     _cnt
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			lsli     local0
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			ldi      1
			sub     
			add     
			aTop     cel
			pTos     cel
			ldi      7
			gt?     
			bnt      code_04e0
			ldi      0
			aTop     cel
code_04e0:
			pTos     cel
			ldi      0
			lt?     
			bnt      code_04ec
			ldi      7
			aTop     cel
code_04ec:
			ret     
		)
	)
	
	(method (normalize)
		(asm
			pushi    5
			pushi    1
			pushi    8
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			pushi    1
			pushi    13
			pushi    30
			pushi    34
			pushi    24
			pushi    17
			pushi    703
			calle    proc999_5,  16
			bnt      code_0424
			pushi    #view
			pushi    0
			lag      global0
			send     4
			jmp      code_042f
code_0424:
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
code_042f:
			push    
			pushi    6
			pushi    1
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0440
			ldi      9
			jmp      code_0456
code_0440:
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			ldi      702
			eq?     
			bnt      code_0454
			ldi      4
			jmp      code_0456
code_0454:
			ldi      8
code_0456:
			push    
			pushi    7
			pushi    1
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			lsli     local0
			pushi    85
			pushi    1
			lsg      global126
			dup     
			ldi      5
			eq?     
			bnt      code_0474
			ldi      38
			jmp      code_048e
code_0474:
			dup     
			ldi      2
			eq?     
			bnt      code_0480
			ldi      39
			jmp      code_048e
code_0480:
			dup     
			ldi      3
			eq?     
			bnt      code_048c
			ldi      39
			jmp      code_048e
code_048c:
			ldi      40
code_048e:
			toss    
			push    
			self     24
			pushi    #contains
			pushi    1
			lsg      global0
			lag      global5
			send     6
			bnt      code_04a3
			pushi    #doit
			pushi    0
			self     4
code_04a3:
			ret     
		)
	)
)

(class SpecialDoVerb of Code
	(properties)
	
	(method (doVerb theVerb param2 param3 param4)
		(asm
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param4
			lap      param3
			send     6
			ret     
		)
	)
)

(class Beard of Prop
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
		signal $0000
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
		client 0
	)
	
	(method (init param1)
		(asm
			pushi    #client
			pushi    1
			lsp      param1
			pushi    289
			pushi    1
			pushi    1
			self     12
			pushi    #beard
			pushi    1
			pushSelf
			lap      param1
			send     6
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #hide
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #abnormal
			pushi    0
			pToa     client
			send     4
			bnt      code_06a4
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			push    
			ldi      8
			and     
			not     
			bnt      code_06a4
			pushi    #isStopped
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_06a4
			pushi    1
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			push    
			callk    IsObject,  2
			bnt      code_06a4
			pushi    #isKindOf
			pushi    1
			class    StopWalk
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     6
			bt       code_067e
			pushi    #isKindOf
			pushi    1
			class    SyncStop
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     6
code_067e:
			bnt      code_06a4
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #vStopped
			pushi    0
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     4
			eq?     
			not     
			bnt      code_06a4
			pushi    #showSelf
			pushi    0
			self     4
			jmp      code_06b2
code_06a4:
			pTos     signal
			ldi      8
			and     
			not     
			bnt      code_06b2
			pushi    #hide
			pushi    0
			self     4
code_06b2:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Prop,  4
			ret     
		)
	)
	
	(method (showSelf)
		(asm
			pushi    #show
			pushi    0
			self     4
			pushi    #loop
			pushi    1
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			self     24
			ret     
		)
	)
)
