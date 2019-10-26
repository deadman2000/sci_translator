;;; Sierra Script 1.0 - (do not remove this comment)
(script# 998)
(include sci.sh)
(use n000)
(use n255)
(use n950)
(use n992)
(use n999)


(class PicView of Feature
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
		view 0
		loop 0
		cel 0
		priority -1
		signal $0000
		palette 0
	)
	
	(method (init param1)
		(asm
			pushi    #add
			pushi    1
			pushSelf
			lag      global10
			send     6
			pushi    1
			pushSelf
			callk    SetNowSeen,  2
			pushi    #init
			pushi    0
			&rest    param1
			super    Feature,  4
			ret     
		)
	)
	
	(method (showSelf)
		(asm
			pushi    5
			pTos     name
			pushi    82
			pTos     view
			pTos     loop
			pTos     cel
			calle    proc255_0,  10
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_004b
			pushi    #x
			pushi    0
			lap      param1
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lap      param1
			send     4
			sat      temp1
			jmp      code_0053
code_004b:
			lap      param1
			sat      temp0
			lap      param2
			sat      temp1
code_0053:
			pTos     signal
			ldi      128
			and     
			bnt      code_0061
			ldi      0
			jmp      code_00cd
code_0061:
			pushi    1
			pTos     onMeCheck
			callk    IsObject,  2
			not     
			bnt      code_00c2
			pTos     signal
			ldi      4096
			and     
			bnt      code_00c2
			pToa     nsLeft
			bt       code_0085
			pToa     nsRight
			bt       code_0085
			pToa     nsTop
			bt       code_0085
			pToa     nsBottom
code_0085:
			not     
			bt       code_00a4
			pTos     nsLeft
			lat      temp0
			le?     
			bnt      code_00cd
			pprev   
			pToa     nsRight
			le?     
			bnt      code_00cd
			pTos     nsTop
			lat      temp1
			le?     
			bnt      code_00cd
			pprev   
			pToa     nsBottom
			le?     
code_00a4:
			bnt      code_00cd
			pushi    5
			pTos     view
			pTos     loop
			pTos     cel
			lst      temp1
			pToa     nsTop
			sub     
			push    
			lst      temp0
			pToa     nsLeft
			sub     
			push    
			callk    kernel_125,  10
			not     
			jmp      code_00cd
code_00c2:
			pushi    #onMe
			pushi    2
			lst      temp0
			lst      temp1
			super    Feature,  8
code_00cd:
			ret     
		)
	)
)

(class View of Feature
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
		signal $0101
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
	)
	
	(method (init param1 param2)
		(asm
			pTos     signal
			ldi      32767
			and     
			aTop     signal
			pushi    #contains
			pushi    1
			pushSelf
			lag      global5
			send     6
			not     
			bnt      code_0184
			ldi      0
			aTop     lsTop
			aTop     lsLeft
			aTop     lsBottom
			aTop     lsRight
			pTos     signal
			ldi      65399
			and     
			aTop     signal
code_0184:
			pushi    1
			pushSelf
			callk    BaseSetter,  2
			pushi    #init
			pushi    0
			&rest    param2
			super    Feature,  4
			pushi    #checkDetail
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #startUpd
			pushi    0
			pushi    105
			pushi    0
			self     8
			pTos     signal
			ldi      32768
			or      
			aTop     signal
			ret     
		)
	)
	
	(method (showSelf)
		(asm
			pushi    5
			pTos     name
			pushi    82
			pTos     view
			pTos     loop
			pTos     cel
			calle    proc255_0,  10
			ret     
		)
	)
	
	(method (isNotHidden)
		(asm
			pTos     signal
			ldi      136
			and     
			not     
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_03fa
			pushi    #x
			pushi    0
			lap      param1
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lap      param1
			send     4
			sat      temp1
			jmp      code_0402
code_03fa:
			lap      param1
			sat      temp0
			lap      param2
			sat      temp1
code_0402:
			pTos     signal
			ldi      128
			and     
			bnt      code_0410
			ldi      0
			jmp      code_047c
code_0410:
			pushi    1
			pTos     onMeCheck
			callk    IsObject,  2
			not     
			bnt      code_0471
			pTos     signal
			ldi      4096
			and     
			bnt      code_0471
			pToa     nsLeft
			bt       code_0434
			pToa     nsRight
			bt       code_0434
			pToa     nsTop
			bt       code_0434
			pToa     nsBottom
code_0434:
			not     
			bt       code_0453
			pTos     nsLeft
			lat      temp0
			le?     
			bnt      code_047c
			pprev   
			pToa     nsRight
			le?     
			bnt      code_047c
			pTos     nsTop
			lat      temp1
			le?     
			bnt      code_047c
			pprev   
			pToa     nsBottom
			le?     
code_0453:
			bnt      code_047c
			pushi    5
			pTos     view
			pTos     loop
			pTos     cel
			lst      temp1
			pToa     nsTop
			sub     
			push    
			lst      temp0
			pToa     nsLeft
			sub     
			push    
			callk    kernel_125,  10
			not     
			jmp      code_047c
code_0471:
			pushi    #onMe
			pushi    2
			lst      temp0
			lst      temp1
			super    Feature,  8
code_047c:
			ret     
		)
	)
	
	(method (posn param1 param2 param3)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_01bc
			lap      param1
			aTop     x
			lsp      argc
			ldi      2
			ge?     
			bnt      code_01bc
			lap      param2
			aTop     y
			lsp      argc
			ldi      3
			ge?     
			bnt      code_01bc
			lap      param3
			aTop     z
code_01bc:
			pushi    1
			pushSelf
			callk    BaseSetter,  2
			pushi    #forceUpd
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (stopUpd)
		(asm
			pTos     signal
			ldi      1
			or      
			aTop     signal
			pTos     signal
			ldi      65533
			and     
			aTop     signal
			ret     
		)
	)
	
	(method (forceUpd)
		(asm
			pTos     signal
			ldi      64
			or      
			aTop     signal
			ret     
		)
	)
	
	(method (startUpd)
		(asm
			pTos     signal
			ldi      2
			or      
			aTop     signal
			pTos     signal
			ldi      65534
			and     
			aTop     signal
			ret     
		)
	)
	
	(method (setPri param1)
		(asm
			lsp      argc
			ldi      0
			eq?     
			bnt      code_02b6
			pTos     signal
			ldi      16
			or      
			aTop     signal
			jmp      code_02d3
code_02b6:
			lsp      param1
			ldi      65535
			eq?     
			bnt      code_02c8
			pTos     signal
			ldi      65519
			and     
			aTop     signal
			jmp      code_02d3
code_02c8:
			lap      param1
			aTop     priority
			pTos     signal
			ldi      16
			or      
			aTop     signal
code_02d3:
			pushi    #forceUpd
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (setLoop param1)
		(asm
			lsp      argc
			ldi      0
			eq?     
			bnt      code_02ed
			pTos     signal
			ldi      2048
			or      
			aTop     signal
			jmp      code_030c
code_02ed:
			lsp      param1
			ldi      65535
			eq?     
			bnt      code_0300
			pTos     signal
			ldi      63487
			and     
			aTop     signal
			jmp      code_030c
code_0300:
			lap      param1
			aTop     loop
			pTos     signal
			ldi      2048
			or      
			aTop     signal
code_030c:
			pushi    #forceUpd
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (setCel param1)
		(asm
			lsp      argc
			ldi      0
			eq?     
			bnt      code_0320
			ldi      0
			jmp      code_0346
code_0320:
			lsp      param1
			ldi      65535
			eq?     
			bnt      code_032d
			ldi      0
			jmp      code_0346
code_032d:
			lsp      param1
			pushi    #lastCel
			pushi    0
			self     4
			ge?     
			bnt      code_0342
			pushi    #lastCel
			pushi    0
			self     4
			jmp      code_0344
code_0342:
			lap      param1
code_0344:
			aTop     cel
code_0346:
			pushi    #forceUpd
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (ignoreActors param1)
		(asm
			pushi    0
			lap      argc
			eq?     
			bt       code_0356
			lap      param1
code_0356:
			bnt      code_0364
			pTos     signal
			ldi      16384
			or      
			aTop     signal
			jmp      code_036c
code_0364:
			pTos     signal
			ldi      49151
			and     
			aTop     signal
code_036c:
			ret     
		)
	)
	
	(method (hide)
		(asm
			pTos     signal
			ldi      8
			or      
			aTop     signal
			ret     
		)
	)
	
	(method (show)
		(asm
			pTos     signal
			ldi      65527
			and     
			aTop     signal
			ret     
		)
	)
	
	(method (delete)
		(asm
			pTos     signal
			ldi      32768
			and     
			bnt      code_027d
			pTos     signal
			ldi      32767
			and     
			aTop     signal
			pushi    #delete
			pushi    1
			pushSelf
			lag      global5
			send     6
			pToa     underBits
			bnt      code_0214
			pushi    2
			pushi    133
			push    
			callk    UnLoad,  4
			ldi      0
			aTop     underBits
code_0214:
			pTos     signal
			ldi      32
			and     
			bnt      code_0263
			pushi    #add
			pushi    1
			pushi    #view
			pushi    1
			pTos     view
			pushi    6
			pushi    1
			pTos     loop
			pushi    7
			pushi    1
			pTos     cel
			pushi    4
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    85
			pushi    1
			pTos     z
			pushi    63
			pushi    1
			pTos     priority
			pushi    17
			pushi    1
			pTos     signal
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    PicView
			send     4
			send     52
			push    
			lag      global10
			send     6
			pushi    #add
			pushi    1
			pushSelf
			lag      global32
			send     6
			jmp      code_0269
code_0263:
			pushi    #dispose
			pushi    0
			super    Feature,  4
code_0269:
			pushi    1
			pTos     actions
			callk    IsObject,  2
			bnt      code_0279
			pushi    #dispose
			pushi    0
			pToa     actions
			send     4
code_0279:
			ldi      0
			aTop     actions
code_027d:
			ret     
		)
	)
	
	(method (addToPic)
		(asm
			pushi    #contains
			pushi    1
			pushSelf
			lag      global5
			send     6
			not     
			bnt      code_037e
			pushi    #init
			pushi    0
			self     4
code_037e:
			pushi    17
			pushi    #superClass
			pTos     signal
			ldi      32801
			or      
			push    
			self     6
			ret     
		)
	)
	
	(method (lastCel)
		(asm
			pushi    1
			pushSelf
			callk    NumCels,  2
			push    
			ldi      1
			sub     
			ret     
		)
	)
	
	(method (isExtra param1 &tmp temp0)
		(asm
			pTos     signal
			ldi      512
			and     
			sat      temp0
			lap      argc
			bnt      code_03cd
			lap      param1
			bnt      code_03c5
			pTos     signal
			ldi      512
			or      
			aTop     signal
			jmp      code_03cd
code_03c5:
			pTos     signal
			ldi      65023
			and     
			aTop     signal
code_03cd:
			lat      temp0
			ret     
		)
	)
	
	(method (motionCue)
		(asm
			ret     
		)
	)
	
	(method (checkDetail)
		(asm
			ret     
		)
	)
)

(class Prop of View
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
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    2
			pushSelf
			pTos     nsTop
			callk    SetNowSeen,  4
			pTos     signal
			ldi      32768
			and     
			bnt      code_0591
			ret     
code_0591:
			pToa     script
			bnt      code_059b
			pushi    #doit
			pushi    0
			send     4
code_059b:
			pTos     signal
			ldi      4
			and     
			bnt      code_05ad
			pTos     signal
			ldi      2
			and     
			not     
			bnt      code_05ad
			ret     
code_05ad:
			pToa     cycler
			bnt      code_05b7
			pushi    #doit
			pushi    0
			send     4
code_05b7:
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pToa     script
			bnt      code_05c5
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_05c5:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    View,  6
			ret     
		)
	)
	
	(method (delete)
		(asm
			pTos     signal
			ldi      32768
			and     
			bnt      code_0637
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			self     12
			pToa     timer
			bnt      code_0631
			pushi    #dispose
			pushi    0
			send     4
code_0631:
			pushi    #delete
			pushi    0
			super    View,  4
code_0637:
			ret     
		)
	)
	
	(method (motionCue)
		(asm
			pToa     cycler
			bnt      code_0678
			pushi    #completed
			pushi    0
			send     4
			bnt      code_0678
			pushi    #motionCue
			pushi    0
			pToa     cycler
			send     4
code_0678:
			ret     
		)
	)
	
	(method (checkDetail param1)
		(asm
			pToa     detailLevel
			not     
			bnt      code_0682
			jmp      code_06af
code_0682:
			lap      argc
			bnt      code_068c
			lap      param1
			jmp      code_0694
code_068c:
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
code_0694:
			push    
			pToa     detailLevel
			lt?     
			bnt      code_06a4
			pushi    #stopUpd
			pushi    0
			self     4
			jmp      code_06af
code_06a4:
			pToa     cycler
			bnt      code_06af
			pushi    #startUpd
			pushi    0
			self     4
code_06af:
			ret     
		)
	)
	
	(method (setCycle theCycler sendParams)
		(asm
			pToa     cycler
			bnt      code_05d9
			pushi    #dispose
			pushi    0
			send     4
code_05d9:
			lap      theCycler
			bnt      code_060d
			pushi    #startUpd
			pushi    0
			self     4
			pushi    #-info-
			pushi    0
			lap      theCycler
			send     4
			push    
			ldi      32768
			and     
			bnt      code_05fc
			pushi    #new
			pushi    0
			lap      theCycler
			send     4
			jmp      code_05fe
code_05fc:
			lap      theCycler
code_05fe:
			aTop     cycler
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			pToa     cycler
			send     6
			jmp      code_0611
code_060d:
			ldi      0
			aTop     cycler
code_0611:
			ret     
		)
	)
	
	(method (setScript theScript sendParams)
		(asm
			pushi    1
			pTos     script
			callk    IsObject,  2
			bnt      code_0654
			pushi    #dispose
			pushi    0
			pToa     script
			send     4
code_0654:
			lap      theScript
			bnt      code_0661
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			send     6
code_0661:
			ret     
		)
	)
	
	(method (cue)
		(asm
			pToa     script
			bnt      code_0643
			pushi    #cue
			pushi    0
			send     4
code_0643:
			ret     
		)
	)
)

(class Actor of Prop
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
	)
	
	(method (init param1)
		(asm
			pushi    #init
			pushi    0
			&rest    param1
			super    Prop,  4
			pToa     x
			aTop     xLast
			pToa     y
			aTop     yLast
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1 temp2)
		(asm
			pTos     signal
			ldi      32768
			and     
			bnt      code_07ad
			ret     
code_07ad:
			pToa     script
			bnt      code_07b7
			pushi    #doit
			pushi    0
			send     4
code_07b7:
			pToa     code
			bnt      code_07c2
			pushi    #doit
			pushi    1
			pushSelf
			send     6
code_07c2:
			pTos     signal
			ldi      4
			and     
			bnt      code_07d4
			pTos     signal
			ldi      2
			and     
			not     
			bnt      code_07d4
			ret     
code_07d4:
			pToa     viewer
			bnt      code_07df
			pushi    #doit
			pushi    1
			pushSelf
			send     6
code_07df:
			pToa     avoider
			bnt      code_07ec
			pushi    #doit
			pushi    0
			send     4
			jmp      code_07f6
code_07ec:
			pToa     mover
			bnt      code_07f6
			pushi    #doit
			pushi    0
			send     4
code_07f6:
			pToa     cycler
			bnt      code_083b
			pToa     brLeft
			sat      temp1
			pToa     brRight
			sat      temp2
			pushi    #doit
			pushi    0
			pToa     cycler
			send     4
			pToa     baseSetter
			bnt      code_0818
			pushi    #doit
			pushi    1
			pushSelf
			send     6
			jmp      code_081d
code_0818:
			pushi    1
			pushSelf
			callk    BaseSetter,  2
code_081d:
			lst      temp1
			pToa     brLeft
			ne?     
			bt       code_082a
			lst      temp2
			pToa     brRight
			ne?     
code_082a:
			bnt      code_083b
			pushi    #cantBeHere
			pushi    0
			self     4
			bnt      code_083b
			pushi    #findPosn
			pushi    0
			self     4
code_083b:
			pToa     x
			aTop     xLast
			pToa     y
			aTop     yLast
			ret     
		)
	)
	
	(method (posn param1 param2 param3)
		(asm
			pushi    #posn
			pushi    2
			lsp      param1
			lsp      param2
			&rest    param3
			super    Prop,  8
			lap      param1
			aTop     xLast
			lap      param2
			aTop     yLast
			pushi    #cantBeHere
			pushi    0
			self     4
			bnt      code_0867
			pushi    #findPosn
			pushi    0
			self     4
code_0867:
			ret     
		)
	)
	
	(method (setLoop param1 param2 &tmp temp0)
		(asm
			lsp      argc
			ldi      0
			eq?     
			bnt      code_0dcc
			pushi    #setLoop
			pushi    0
			super    Prop,  4
			ldi      0
			jmp      code_0e00
code_0dcc:
			pushi    1
			lsp      param1
			callk    IsObject,  2
			not     
			bnt      code_0de6
			pushi    #setLoop
			pushi    1
			lsp      param1
			&rest    param2
			super    Prop,  6
			ldi      0
			jmp      code_0e00
code_0de6:
			pushi    #-info-
			pushi    0
			lap      param1
			send     4
			push    
			ldi      32768
			and     
			bnt      code_0dfe
			pushi    #new
			pushi    0
			lap      param1
			send     4
			jmp      code_0e00
code_0dfe:
			lap      param1
code_0e00:
			sat      temp0
			bnt      code_0e1b
			pToa     looper
			bnt      code_0e0f
			pushi    #dispose
			pushi    0
			send     4
code_0e0f:
			pushi    #init
			pushi    1
			pushSelf
			&rest    param2
			lat      temp0
			aTop     looper
			send     6
code_0e1b:
			ret     
		)
	)
	
	(method (delete)
		(asm
			pTos     signal
			ldi      32768
			and     
			bnt      code_099b
			pTos     mover
			ldi      65535
			ne?     
			bnt      code_0934
			pushi    #setMotion
			pushi    1
			pushi    0
			self     6
code_0934:
			pushi    #setAvoider
			pushi    1
			pushi    0
			self     6
			pToa     baseSetter
			bnt      code_0949
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     baseSetter
code_0949:
			pToa     looper
			bnt      code_0957
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     looper
code_0957:
			pToa     viewer
			bnt      code_0965
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     viewer
code_0965:
			pToa     blocks
			bnt      code_0973
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     blocks
code_0973:
			pToa     code
			bnt      code_0981
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     code
code_0981:
			pushi    1
			pTos     actions
			callk    IsObject,  2
			bnt      code_0995
			pushi    #dispose
			pushi    0
			pToa     actions
			send     4
			ldi      0
			aTop     actions
code_0995:
			pushi    #delete
			pushi    0
			super    Prop,  4
code_099b:
			ret     
		)
	)
	
	(method (motionCue)
		(asm
			pToa     mover
			bnt      code_0dae
			pushi    #completed
			pushi    0
			send     4
			bnt      code_0dae
			pushi    #motionCue
			pushi    0
			pToa     mover
			send     4
code_0dae:
			pushi    #motionCue
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (checkDetail param1)
		(asm
			pToa     detailLevel
			not     
			bnt      code_0e25
			jmp      code_0e57
code_0e25:
			lap      argc
			bnt      code_0e2f
			lap      param1
			jmp      code_0e37
code_0e2f:
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
code_0e37:
			push    
			pToa     detailLevel
			lt?     
			bnt      code_0e47
			pushi    #stopUpd
			pushi    0
			self     4
			jmp      code_0e57
code_0e47:
			pToa     cycler
			bt       code_0e4e
			pToa     mover
code_0e4e:
			bnt      code_0e57
			pushi    #startUpd
			pushi    0
			self     4
code_0e57:
			ret     
		)
	)
	
	(method (setMotion theMover sendParams)
		(asm
			pToa     mover
			bnt      code_087b
			push    
			ldi      65535
			ne?     
			bnt      code_087b
			pushi    #dispose
			pushi    0
			pToa     mover
			send     4
code_087b:
			lap      theMover
			bnt      code_08af
			pushi    #startUpd
			pushi    0
			self     4
			pushi    #-info-
			pushi    0
			lap      theMover
			send     4
			push    
			ldi      32768
			and     
			bnt      code_089e
			pushi    #new
			pushi    0
			lap      theMover
			send     4
			jmp      code_08a0
code_089e:
			lap      theMover
code_08a0:
			aTop     mover
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			pToa     mover
			send     6
			jmp      code_08b3
code_08af:
			ldi      0
			aTop     mover
code_08b3:
			ret     
		)
	)
	
	(method (setAvoider theAvoider sendParams)
		(asm
			pToa     avoider
			bnt      code_08be
			pushi    #dispose
			pushi    0
			send     4
code_08be:
			pushi    1
			lsp      theAvoider
			callk    IsObject,  2
			bnt      code_08df
			pushi    #-info-
			pushi    0
			lap      theAvoider
			send     4
			push    
			ldi      32768
			and     
			bnt      code_08df
			pushi    #new
			pushi    0
			lap      theAvoider
			send     4
			jmp      code_08e1
code_08df:
			lap      theAvoider
code_08e1:
			aTop     avoider
			pToa     avoider
			bnt      code_08f0
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			send     6
code_08f0:
			ret     
		)
	)
	
	(method (ignoreHorizon param1)
		(asm
			lap      argc
			not     
			bt       code_09a4
			lap      param1
code_09a4:
			bnt      code_09b2
			pTos     signal
			ldi      8192
			or      
			aTop     signal
			jmp      code_09ba
code_09b2:
			pTos     signal
			ldi      57343
			and     
			aTop     signal
code_09ba:
			ret     
		)
	)
	
	(method (observeControl bits &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_09c1:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_09d7
			pTos     illegalBits
			lat      temp0
			lapi     bits
			or      
			aTop     illegalBits
			+at      temp0
			jmp      code_09c1
code_09d7:
			ret     
		)
	)
	
	(method (ignoreControl bits &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_09de:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_09f5
			pTos     illegalBits
			lat      temp0
			lapi     bits
			bnot    
			and     
			aTop     illegalBits
			+at      temp0
			jmp      code_09de
code_09f5:
			ret     
		)
	)
	
	(method (observeBlocks param1)
		(asm
			pToa     blocks
			not     
			bnt      code_0a05
			pushi    #new
			pushi    0
			class    Set
			send     4
			aTop     blocks
code_0a05:
			pushi    #add
			pushi    0
			&rest    param1
			pToa     blocks
			send     4
			ret     
		)
	)
	
	(method (ignoreBlocks param1)
		(asm
			pushi    #delete
			pushi    0
			&rest    param1
			pToa     blocks
			send     4
			pushi    #isEmpty
			pushi    0
			pToa     blocks
			send     4
			bnt      code_0a2d
			pushi    #dispose
			pushi    0
			pToa     blocks
			send     4
			ldi      0
			aTop     blocks
code_0a2d:
			ret     
		)
	)
	
	(method (isStopped)
		(asm
			pushi    1
			pTos     mover
			callk    IsObject,  2
			not     
			bt       code_0914
			pTos     x
			pushi    #xLast
			pushi    0
			pToa     mover
			send     4
			eq?     
			bnt      code_0914
			pTos     y
			pushi    #yLast
			pushi    0
			pToa     mover
			send     4
			eq?     
code_0914:
			ret     
		)
	)
	
	(method (isBlocked)
		(asm
			pTos     signal
			ldi      1024
			and     
			ret     
		)
	)
	
	(method (findPosn &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pToa     x
			sat      temp2
			pToa     y
			sat      temp3
			ldi      0
			sat      temp4
			ldi      1
			sat      temp1
code_0ac0:
			lat      temp4
			not     
			bnt      code_0b2b
			ldi      0
			sat      temp0
code_0aca:
			lat      temp4
			not     
			bnt      code_0b26
			lst      temp0
			ldi      8
			lt?     
			bnt      code_0b26
			lst      temp2
			lst      temp1
			pushi    1
			pushi    2
			lst      temp0
			ldi      45
			mul     
			push    
			pushi    100
			callk    CosMult,  4
			push    
			calle    proc999_0,  2
			mul     
			add     
			aTop     x
			lst      temp3
			lst      temp1
			pushi    1
			pushi    2
			lst      temp0
			ldi      45
			mul     
			push    
			pushi    100
			callk    SinMult,  4
			push    
			calle    proc999_0,  2
			mul     
			sub     
			aTop     y
			pushi    #cantBeHere
			pushi    0
			self     4
			not     
			bnt      code_0b1f
			pushi    #onControl
			pushi    0
			self     4
code_0b1f:
			sat      temp4
			+at      temp0
			jmp      code_0aca
code_0b26:
			+at      temp1
			jmp      code_0ac0
code_0b2b:
			pushi    #posn
			pushi    2
			pTos     x
			pTos     y
			self     8
			ret     
		)
	)
	
	(method (inRect param1 param2 param3 param4)
		(asm
			lsp      param1
			pToa     x
			le?     
			bnt      code_0b53
			pTos     x
			lap      param3
			lt?     
			bnt      code_0b53
			lsp      param2
			pToa     y
			le?     
			bnt      code_0b53
			pTos     y
			lap      param4
			lt?     
code_0b53:
			ret     
		)
	)
	
	(method (onControl fUsePoint)
		(asm
			lap      argc
			bnt      code_0b6c
			lap      fUsePoint
			bnt      code_0b6c
			pushi    3
			pushi    4
			pTos     x
			pTos     y
			callk    OnControl,  6
			jmp      code_0b7b
code_0b6c:
			pushi    5
			pushi    4
			pTos     brLeft
			pTos     brTop
			pTos     brRight
			pTos     brBottom
			callk    OnControl,  10
code_0b7b:
			ret     
		)
	)
	
	(method (distanceTo pObj)
		(asm
			pushi    5
			pTos     x
			pTos     y
			pushi    #x
			pushi    0
			lap      pObj
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pObj
			send     4
			push    
			lsg      global31
			callk    GetDistance,  10
			ret     
		)
	)
	
	(method (cantBeHere &tmp temp0)
		(asm
			pToa     baseSetter
			bnt      code_0a5a
			pushi    #doit
			pushi    1
			pushSelf
			send     6
			jmp      code_0a5f
code_0a5a:
			pushi    1
			pushSelf
			callk    BaseSetter,  2
code_0a5f:
			pushi    2
			pushSelf
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			callk    CanBeHere,  4
			bnt      code_0a72
			jmp      code_0aab
code_0a72:
			pTos     signal
			ldi      8192
			and     
			not     
			bnt      code_0a98
			pushi    1
			lsg      global2
			callk    IsObject,  2
			bnt      code_0a98
			pTos     y
			pushi    #horizon
			pushi    0
			lag      global2
			send     4
			lt?     
			bnt      code_0a98
			ldi      65535
			jmp      code_0aab
code_0a98:
			pToa     blocks
			bnt      code_0aab
			pushi    #allTrue
			pushi    2
			pushi    60
			pushSelf
			send     8
			not     
			bnt      code_0aab
			ldi      65534
code_0aab:
			sat      temp0
			ret     
		)
	)
	
	(method (setStep newX newY)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0b90
			lsp      newX
			ldi      65535
			ne?     
			bnt      code_0b90
			lap      newX
			aTop     xStep
code_0b90:
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0ba4
			lsp      newY
			ldi      65535
			ne?     
			bnt      code_0ba4
			lap      newY
			aTop     yStep
code_0ba4:
			pToa     mover
			bnt      code_0bc6
			pushi    65535
			ne?     
			bnt      code_0bc6
			pushi    #isMemberOf
			pushi    1
			class    MoveTo
			push    
			pToa     mover
			send     6
			bnt      code_0bc6
			pushi    #init
			pushi    0
			pushi    #mover
			pushi    0
			self     4
			send     4
code_0bc6:
			ret     
		)
	)
	
	(method (setDirection newDirection &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(asm
			pushi    #vanishingY
			pushi    0
			lag      global2
			send     4
			sat      temp1
			push    
			ldi      35536
			eq?     
			bnt      code_0be0
			pToa     x
			jmp      code_0be8
code_0be0:
			pushi    #vanishingX
			pushi    0
			lag      global2
			send     4
code_0be8:
			sat      temp0
			pTos     xStep
			ldi      0
			eq?     
			bnt      code_0bfb
			pTos     yStep
			ldi      0
			eq?     
			bnt      code_0bfb
			ret     
code_0bfb:
			pushi    32000
			pushi    2
			pTos     xStep
			pTos     yStep
			calle    proc999_3,  4
			div     
			sat      temp5
			lsp      newDirection
			dup     
			ldi      0
			eq?     
			bnt      code_0c20
			pushi    #setMotion
			pushi    1
			pushi    0
			self     6
			ret     
			jmp      code_0cbc
code_0c20:
			dup     
			ldi      1
			eq?     
			bnt      code_0c38
			lst      temp0
			pToa     x
			sub     
			sat      temp2
			lst      temp1
			pToa     y
			sub     
			sat      temp3
			jmp      code_0cbc
code_0c38:
			dup     
			ldi      5
			eq?     
			bnt      code_0c50
			pTos     x
			lat      temp0
			sub     
			sat      temp2
			pTos     y
			lat      temp1
			sub     
			sat      temp3
			jmp      code_0cbc
code_0c50:
			dup     
			ldi      3
			eq?     
			bnt      code_0c62
			lat      temp5
			sat      temp2
			ldi      0
			sat      temp3
			jmp      code_0cbc
code_0c62:
			dup     
			ldi      7
			eq?     
			bnt      code_0c75
			lat      temp5
			neg     
			sat      temp2
			ldi      0
			sat      temp3
			jmp      code_0cbc
code_0c75:
			pushi    180
			pushi    4
			pTos     x
			pTos     y
			lst      temp0
			lst      temp1
			callk    GetAngle,  8
			sat      temp4
			lt?     
			bnt      code_0c93
			lst      temp4
			ldi      360
			sub     
			sat      temp4
code_0c93:
			lst      temp4
			ldi      90
			add     
			push    
			ldi      2
			div     
			push    
			pushi    45
			lsp      newDirection
			ldi      2
			sub     
			mul     
			add     
			sat      temp4
			pushi    2
			push    
			pushi    100
			callk    SinMult,  4
			sat      temp2
			pushi    2
			lst      temp4
			pushi    100
			callk    CosMult,  4
			neg     
			sat      temp3
code_0cbc:
			toss    
			lst      temp5
			ldi      5
			div     
			sat      temp5
code_0cc4:
			pushi    1
			lst      temp3
			callk    Abs,  2
			push    
			lat      temp5
			lt?     
			bnt      code_0cef
			pushi    1
			lst      temp2
			callk    Abs,  2
			push    
			lat      temp5
			lt?     
			bnt      code_0cef
			lst      temp2
			ldi      5
			mul     
			sat      temp2
			lst      temp3
			ldi      5
			mul     
			sat      temp3
			jmp      code_0cc4
code_0cef:
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			sat      temp7
			bnt      code_0d51
			lag      global67
			bnt      code_0d51
			pushi    7
			pTos     x
			pTos     y
			pTos     x
			lat      temp2
			add     
			push    
			pTos     y
			lat      temp3
			add     
			push    
			pushi    #elements
			pushi    0
			lat      temp7
			send     4
			push    
			pushi    #size
			pushi    0
			lat      temp7
			send     4
			push    
			pushi    0
			callk    AvoidPath,  14
			sat      temp6
			pushi    2
			push    
			pushi    2
			calle    proc999_6,  4
			push    
			pToa     x
			sub     
			sat      temp2
			pushi    2
			lst      temp6
			pushi    3
			calle    proc999_6,  4
			push    
			pToa     y
			sub     
			sat      temp3
			pushi    2
			pushi    3
			lst      temp6
			callk    Memory,  4
code_0d51:
			lat      temp2
			bt       code_0d58
			lat      temp3
code_0d58:
			bnt      code_0d74
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pTos     x
			lat      temp2
			add     
			push    
			pTos     y
			lat      temp3
			add     
			push    
			self     10
			jmp      code_0d97
code_0d74:
			lap      newDirection
			bnt      code_0d90
			pushi    283
			pushi    1
			pushi    #species
			pushi    228
			pushi    1
			push    
			ldi      1
			sub     
			push    
			ldi      45
			mul     
			push    
			self     12
			jmp      code_0d97
code_0d90:
			pushi    #setMotion
			pushi    1
			pushi    0
			self     6
code_0d97:
			ret     
		)
	)
	
	(method (setHeading param1 param2 param3)
		(asm
			lap      argc
			bnt      code_0e61
			lap      param1
			aTop     heading
code_0e61:
			pToa     looper
			bnt      code_0e7f
			pushi    60
			pushi    3
			pushSelf
			pTos     heading
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0e77
			lap      param2
code_0e77:
			push    
			pToa     looper
			send     10
			jmp      code_0ea1
code_0e7f:
			pushi    2
			pushSelf
			pTos     heading
			callk    DirLoop,  4
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0ea1
			pushi    1
			lsp      param2
			callk    IsObject,  2
			bnt      code_0ea1
			pushi    #cue
			pushi    0
			&rest    param3
			lap      param2
			send     4
code_0ea1:
			pToa     heading
			ret     
		)
	)
)
