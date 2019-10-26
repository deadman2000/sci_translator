;;; Sierra Script 1.0 - (do not remove this comment)
(script# 950)
(include sci.sh)
(use n000)
(use n255)
(use n945)
(use n999)


(class CueObj of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
		theVerb 0
		theInvItem 0
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0049
			pushi    #setHeading
			pushi    2
			pushi    4
			dup     
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			callk    GetAngle,  8
			push    
			pushSelf
			lag      global0
			send     8
			pushi    #add
			pushi    1
			pushSelf
			lag      global78
			send     6
			jmp      code_009f
code_0049:
			dup     
			ldi      2
			eq?     
			bnt      code_0057
			ldi      3
			aTop     cycles
			jmp      code_009f
code_0057:
			dup     
			ldi      3
			eq?     
			bnt      code_009f
			pushi    #delete
			pushi    1
			pushSelf
			lag      global78
			send     6
			pToa     client
			bnt      code_008b
			pushi    1
			pushi    #actions
			pushi    0
			send     4
			push    
			callk    IsObject,  2
			bnt      code_008b
			pushi    #doVerb
			pushi    2
			pTos     theVerb
			pTos     theInvItem
			pushi    #actions
			pushi    0
			pToa     client
			send     4
			send     8
code_008b:
			not     
			bnt      code_009b
			pushi    #doVerb
			pushi    2
			pTos     theVerb
			pTos     theInvItem
			pToa     client
			send     8
code_009b:
			ldi      0
			aTop     state
code_009f:
			toss    
			ret     
		)
	)
)

(class Feature of Obj
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
	)
	
	(method (init param1)
		(asm
			lap      argc
			bnt      code_011a
			lap      param1
			bnt      code_011a
			pushi    #perform
			pushi    1
			lsp      param1
			self     6
			jmp      code_0125
code_011a:
			lag      global64
			bnt      code_0125
			pushi    #perform
			pushi    1
			push    
			self     6
code_0125:
			pushi    #respondsTo
			pushi    1
			pushi    8
			self     6
			bnt      code_013a
			pushi    #add
			pushi    1
			pushSelf
			lag      global5
			send     6
			jmp      code_0142
code_013a:
			pushi    #add
			pushi    1
			pushSelf
			lag      global32
			send     6
code_0142:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     actions
			bnt      code_0395
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     actions
code_0395:
			pushi    1
			pTos     onMeCheck
			callk    IsObject,  2
			bnt      code_03a9
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			ldi      0
			aTop     onMeCheck
code_03a9:
			pushi    #delete
			pushi    1
			pushSelf
			lag      global32
			send     6
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0188
			ldi      1
			ret     
			jmp      code_0258
code_0188:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			eq?     
			bnt      code_0258
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0258
			pushi    #isNotHidden
			pushi    0
			self     4
			bnt      code_0258
			pushi    32
			pushi    1
			pushi    0
			pushi    132
			pushi    1
			pushi    0
			pushi    45
			pushi    1
			pushSelf
			pushi    265
			pushi    1
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    266
			pushi    1
			lag      global69
			bnt      code_01f1
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_01f1
			lag      global9
			bnt      code_01f1
			pushi    #indexOf
			pushi    1
			pushi    #curInvIcon
			pushi    0
			lag      global69
			send     4
			push    
			lag      global9
			send     6
code_01f1:
			push    
			class    CueObj
			send     30
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #canControl
			pushi    0
			lag      global80
			send     4
			bnt      code_0245
			pTos     _approachVerbs
			ldi      26505
			ne?     
			bnt      code_0245
			pTos     _approachVerbs
			pushi    1
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			sub     
			shl     
			and     
			bnt      code_0245
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pTos     approachX
			pushi    #z
			pushi    0
			lag      global0
			send     4
			push    
			pToa     approachY
			add     
			push    
			class    CueObj
			push    
			lag      global0
			send     12
			jmp      code_0258
code_0245:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #changeState
			pushi    1
			pushi    3
			class    CueObj
			send     6
code_0258:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pushi    60
			pushi    2
			lsp      theVerb
			pushSelf
			&rest    param2
			lag      global65
			bnt      code_0291
			jmp      code_0294
code_0291:
			lofsa    dftDoVerb
code_0294:
			send     8
			ret     
		)
	)
	
	(method (notFacing &tmp temp0)
		(asm
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #client
			pushi    1
			pushSelf
			pushi    32
			pushi    1
			pushi    0
			pushi    132
			pushi    1
			pushi    0
			pushi    141
			pushi    0
			class    CueObj
			send     22
			ret     
		)
	)
	
	(method (facingMe param1 &tmp temp0 temp1)
		(asm
			lap      argc
			bnt      code_02a3
			lap      param1
			jmp      code_02a5
code_02a3:
			lag      global0
code_02a5:
			sat      temp0
			pushi    1
			pushi    4
			dup     
			pushi    0
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp0
			send     4
			push    
			pTos     x
			pTos     y
			callk    GetAngle,  8
			push    
			pushi    #heading
			pushi    0
			lat      temp0
			send     4
			sub     
			push    
			callk    Abs,  2
			sat      temp1
			push    
			ldi      180
			gt?     
			bnt      code_02dd
			pushi    360
			lat      temp1
			sub     
			sat      temp1
code_02dd:
			lst      temp1
			pToa     sightAngle
			le?     
			bnt      code_02eb
			ldi      1
			ret     
			jmp      code_02f4
code_02eb:
			pushi    #notFacing
			pushi    0
			self     4
			ldi      0
			ret     
code_02f4:
			ret     
		)
	)
	
	(method (isNotHidden)
		(asm
			ldi      1
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_0318
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
			jmp      code_0320
code_0318:
			lap      param1
			sat      temp0
			lap      param2
			sat      temp1
code_0320:
			pushi    1
			pTos     onMeCheck
			callk    IsObject,  2
			bnt      code_0337
			pushi    3
			lst      temp0
			lst      temp1
			pTos     onMeCheck
			callk    AvoidPath,  6
			jmp      code_0386
code_0337:
			pToa     nsLeft
			bt       code_0348
			pToa     nsRight
			bt       code_0348
			pToa     nsTop
			bt       code_0348
			pToa     nsBottom
code_0348:
			not     
			bt       code_0367
			pTos     nsLeft
			lat      temp0
			le?     
			bnt      code_0386
			pprev   
			pToa     nsRight
			le?     
			bnt      code_0386
			pTos     nsTop
			lat      temp1
			le?     
			bnt      code_0386
			pprev   
			pToa     nsBottom
			le?     
code_0367:
			bnt      code_0386
			pTos     onMeCheck
			ldi      26505
			ne?     
			bnt      code_0384
			pTos     onMeCheck
			pushi    3
			pushi    4
			lst      temp0
			lst      temp1
			callk    OnControl,  6
			and     
			jmp      code_0386
code_0384:
			ldi      1
code_0386:
			ret     
		)
	)
	
	(method (approachVerbs param1 &tmp temp0)
		(asm
			ldi      0
			aTop     _approachVerbs
			sat      temp0
code_014b:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_0175
			lap      param1
			bnt      code_0170
			pushi    276
			pushi    1
			pushi    #_approachVerbs
			pushi    0
			self     4
			push    
			pushi    #superClass
			lat      temp0
			lspi     param1
			ldi      1
			sub     
			shl     
			or      
			push    
			self     6
code_0170:
			+at      temp0
			jmp      code_014b
code_0175:
			ret     
		)
	)
)

(instance dftDoVerb of Code
	(properties)
	
	(method (doit param1 param2 param3 &tmp temp0 temp1)
		(asm
			pushi    #description
			pushi    0
			lap      param2
			send     4
			sat      temp0
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_0489
			pushi    #lookStr
			pushi    0
			lap      param2
			send     4
			bnt      code_0479
			pushi    1
			pushi    #lookStr
			pushi    0
			lap      param2
			send     4
			push    
			calle    proc255_0,  2
			jmp      code_04c7
code_0479:
			pushi    4
			pushi    950
			pushi    0
			lst      temp0
			dup     
			calle    proc255_4,  8
			jmp      code_04c7
code_0489:
			dup     
			ldi      4
			eq?     
			bnt      code_04b4
			pushi    #at
			pushi    1
			lsp      param3
			lag      global9
			send     6
			sat      temp1
			bnt      code_04c7
			pushi    4
			pushi    950
			pushi    1
			pushi    #description
			pushi    0
			send     4
			push    
			lst      temp0
			calle    proc255_4,  8
			jmp      code_04c7
code_04b4:
			dup     
			ldi      5
			eq?     
			bnt      code_04c7
			pushi    3
			pushi    950
			pushi    2
			lst      temp0
			calle    proc255_4,  6
code_04c7:
			toss    
			ret     
		)
	)
)
