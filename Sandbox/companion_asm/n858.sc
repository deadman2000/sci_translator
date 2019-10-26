;;; Sierra Script 1.0 - (do not remove this comment)
(script# 858)
(include sci.sh)
(use n000)
(use n893)
(use n950)
(use n998)
(use n999)


(local
	local0
)
(class MList of List
	(properties
		elements 0
		size 0
	)
	
	(method (maxElement param1 param2 &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(asm
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp0
			ldi      0
			sat      temp3
			ldi      32768
			sat      temp4
code_0032:
			lat      temp0
			bnt      code_0075
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
			bnt      code_0052
			lat      temp3
			ret     
code_0052:
			pushi    #perform
			pushi    1
			lsp      param1
			&rest    param2
			lat      temp2
			send     6
			sat      temp5
			push    
			lat      temp4
			gt?     
			bnt      code_006e
			lat      temp2
			sat      temp3
			lat      temp5
			sat      temp4
code_006e:
			lat      temp1
			sat      temp0
			jmp      code_0032
code_0075:
			lat      temp3
			ret     
		)
	)
)

(class Fighter of Actor
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
		fight 0
		opponent 0
		ticks 0
		lastTicks 0
		idleCycles 0
		parriedCycles 0
		_parts 0
		_techniques 0
		_plan 0
		_technique 0
		_strength 0
	)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Actor,  4
			pToa     ticks
			bnt      code_0135
			push    
			pushi    1
			lsg      global88
			pToa     lastTicks
			sub     
			push    
			callk    Abs,  2
			sub     
			aTop     ticks
			push    
			ldi      0
			le?     
			bnt      code_0134
			ldi      0
			aTop     ticks
			lag      global88
			aTop     lastTicks
code_0134:
			ret     
code_0135:
			pToa     parriedCycles
			bnt      code_013c
			dpToa    parriedCycles
code_013c:
			pToa     _technique
			bnt      code_014b
			pushi    #doit
			pushi    0
			&rest    param1
			send     4
			jmp      code_014d
code_014b:
			ipToa    idleCycles
code_014d:
			pToa     _plan
			bnt      code_0159
			pushi    #doit
			pushi    0
			&rest    param1
			send     4
code_0159:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pToa     _parts
			bnt      code_01c3
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     _parts
code_01c3:
			pToa     _techniques
			bnt      code_01d1
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     _techniques
code_01d1:
			pToa     _plan
			bnt      code_01df
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     _plan
code_01df:
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Actor,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pTos     _strength
			ldi      0
			le?     
			bnt      code_0165
			ldi      0
			ret     
code_0165:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Actor,  6
			bnt      code_0176
			ldi      1
			ret     
code_0176:
			pToa     parriedCycles
			bnt      code_017e
			ldi      0
			ret     
code_017e:
			pToa     _techniques
			bnt      code_018f
			pushi    #firstTrue
			pushi    3
			pushi    129
			lsp      pEvent
			pushSelf
			send     10
code_018f:
			pToa     _plan
			bnt      code_019d
			pushi    #handleEvent
			pushi    2
			lsp      pEvent
			pushSelf
			send     8
code_019d:
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			pToa     fight
			bnt      code_01a9
			ldi      1
			ret     
			jmp      code_01b4
code_01a9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_01b4:
			ret     
		)
	)
	
	(method (parts param1)
		(asm
			lap      argc
			bnt      code_02a9
			pToa     _parts
			bt       code_0293
			pushi    #new
			pushi    0
			class    MList
			send     4
code_0293:
			aTop     _parts
			pushi    #add
			pushi    0
			&rest    param1
			pushi    116
			pushi    2
			pushi    45
			pushSelf
			pushi    116
			pushi    1
			pushi    107
			pToa     _parts
			send     18
code_02a9:
			pToa     _parts
			ret     
		)
	)
	
	(method (techniques param1)
		(asm
			lap      argc
			bnt      code_02ce
			pToa     _techniques
			bt       code_02bd
			pushi    #new
			pushi    0
			class    MList
			send     4
code_02bd:
			aTop     _techniques
			pushi    #add
			pushi    0
			&rest    param1
			pushi    116
			pushi    2
			pushi    45
			pushSelf
			pToa     _techniques
			send     12
code_02ce:
			pToa     _techniques
			ret     
		)
	)
	
	(method (notice &tmp temp0)
		(asm
			pToa     _plan
			bnt      code_02e8
			pToa     script
			sat      temp0
			pushi    #init
			pushi    1
			pushSelf
			pToa     _plan
			send     6
			lat      temp0
			aTop     script
code_02e8:
			ret     
		)
	)
	
	(method (suffer param1 &tmp temp0 temp1 temp2)
		(asm
			pushi    #firstTrue
			pushi    2
			pushi    586
			lsp      param1
			pToa     _parts
			send     8
			sat      temp0
			bnt      code_0331
			pTos     _strength
			pushi    #strength
			pushi    0
			lap      param1
			send     4
			sub     
			aTop     _strength
			pushi    #strength
			pushi    0
			lap      param1
			send     4
			sat      temp1
			pToa     ticks
			sat      temp2
			pushi    3
			pTos     parriedCycles
			pTos     ticks
			lst      temp1
			calle    proc999_3,  6
			aTop     ticks
			pushi    #agonize
			pushi    2
			lsp      param1
			lst      temp0
			self     8
code_0331:
			ret     
		)
	)
	
	(method (agonize)
		(asm
			ret     
		)
	)
	
	(method (telegraph param1)
		(asm
			pushi    #notice
			pushi    1
			lsp      param1
			pToa     opponent
			send     6
			ret     
		)
	)
	
	(method (inflict param1 &tmp temp0 temp1 temp2 temp3)
		(asm
			pushSelf
			pushi    #client
			pushi    0
			pushi    #target
			pushi    0
			lap      param1
			send     4
			send     4
			eq?     
			bnt      code_020a
			ldi      0
			ret     
code_020a:
			pushi    #technique
			pushi    0
			pToa     opponent
			send     4
			sat      temp1
			bnt      code_0224
			pushi    #completed
			pushi    0
			send     4
			bt       code_0224
			ldi      0
			sat      temp1
code_0224:
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			sat      temp2
			pushi    #success
			pushi    2
			lsp      param1
			lst      temp1
			pToa     fight
			send     8
			sat      temp3
			lst      temp2
			le?     
			sat      temp0
			bnt      code_0252
			pushi    #suffer
			pushi    1
			lsp      param1
			pToa     opponent
			send     6
			ldi      1
			jmp      code_0281
code_0252:
			lat      temp1
			bnt      code_027f
			pushi    #target
			pushi    0
			send     4
			push    
			pushi    #target
			pushi    0
			lap      param1
			send     4
			eq?     
			bnt      code_027f
			pushi    96
			pushi    12
			pushi    #strength
			pushi    0
			lap      param1
			send     4
			mul     
			add     
			aTop     parriedCycles
			ldi      0
			jmp      code_0281
code_027f:
			ldi      0
code_0281:
			ret     
		)
	)
	
	(method (plan param1 param2 &tmp temp0)
		(asm
			lap      argc
			bnt      code_00d6
			pToa     script
			sat      temp0
			pushi    1
			pTos     _plan
			callk    IsObject,  2
			bnt      code_00c3
			pushi    #dispose
			pushi    0
			pToa     _plan
			send     4
code_00c3:
			lap      param1
			aTop     _plan
			bnt      code_00d2
			pushi    #init
			pushi    1
			pushSelf
			&rest    param2
			send     6
code_00d2:
			lat      temp0
			aTop     script
code_00d6:
			pToa     _plan
			ret     
		)
	)
	
	(method (technique param1 param2 &tmp temp0)
		(asm
			lap      argc
			bnt      code_0107
			pToa     script
			sat      temp0
			pushi    1
			pTos     _technique
			callk    IsObject,  2
			bnt      code_00f4
			pushi    #dispose
			pushi    0
			pToa     _technique
			send     4
code_00f4:
			lap      param1
			aTop     _technique
			bnt      code_0103
			pushi    #init
			pushi    1
			pushSelf
			&rest    param2
			send     6
code_0103:
			lat      temp0
			aTop     script
code_0107:
			pToa     _technique
			ret     
		)
	)
)

(class Technique of Script
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
		completed 0
		key 0
		dir 0
		view 0
		loop 0
		_strength 0
		_delay 0
		target 0
		claimed 0
		message 0
		type $0000
		_success 100
	)
	
	(method (init param1 param2 &tmp temp0 temp1)
		(asm
			lag      global88
			aTop     lastTicks
			ldi      0
			aTop     completed
			lap      argc
			bnt      code_0502
			lap      param1
			jmp      code_0504
code_0502:
			pToa     client
code_0504:
			sat      temp0
			bnt      code_0511
			pushi    #script
			pushi    0
			send     4
			sat      temp1
code_0511:
			pushi    #init
			pushi    1
			lst      temp0
			&rest    param2
			super    Script,  6
			lat      temp0
			bnt      code_0528
			pushi    #script
			pushi    1
			lst      temp1
			send     6
code_0528:
			ret     
		)
	)
	
	(method (dispose param1 &tmp temp0 temp1)
		(asm
			pToa     client
			sat      temp0
			pushi    #script
			pushi    0
			send     4
			sat      temp1
			pushi    #_technique
			pushi    1
			pushi    0
			pushi    576
			pushi    1
			pushi    0
			pToa     client
			send     12
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			lat      temp0
			aTop     client
			pushi    #script
			pushi    1
			lst      temp1
			send     6
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0556
			ldi      0
			jmp      code_0604
code_0556:
			pushi    #parriedCycles
			pushi    0
			pToa     client
			send     4
			bt       code_0576
			pushi    #ticks
			pushi    0
			pToa     client
			send     4
			bnt      code_057c
			pTos     client
			pushi    #client
			pushi    0
			pToa     target
			send     4
			ne?     
code_0576:
			bnt      code_057c
			jmp      code_0604
code_057c:
			pToa     key
			bnt      code_0599
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_0599
			pTos     key
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			eq?     
code_0599:
			bt       code_05d4
			pToa     dir
			bnt      code_05b9
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_05b9
			pTos     dir
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			eq?     
code_05b9:
			bt       code_05d4
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bnt      code_0604
			pushi    #onMe
			pushi    1
			lsp      pEvent
			pToa     target
			send     6
code_05d4:
			bnt      code_0604
			pushi    #script
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_05fa
			pushi    #_technique
			pushi    0
			pToa     client
			send     4
			push    
			selfID  
			ne?     
			bnt      code_05fa
			pushi    #technique
			pushi    1
			pushSelf
			pToa     client
			send     6
code_05fa:
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      1
code_0604:
			ret     
		)
	)
	
	(method (suffer param1)
		(asm
			pToa     completed
			bnt      code_053b
			pToa     target
			bnt      code_053b
			pushi    #onMe
			pushi    1
			lsp      param1
			send     6
code_053b:
			not     
			bnt      code_0544
			ldi      0
			jmp      code_0546
code_0544:
			ldi      1
code_0546:
			ret     
		)
	)
	
	(method (onMe param1)
		(asm
			pushi    #onMe
			pushi    0
			&rest    param1
			pToa     target
			send     4
			ret     
		)
	)
	
	(method (setTarget param1)
		(asm
			lap      argc
			bnt      code_048d
			lap      param1
			aTop     target
code_048d:
			ret     
		)
	)
	
	(method (success param1)
		(asm
			lap      argc
			bnt      code_04d3
			lap      param1
			aTop     _success
code_04d3:
			pToa     _success
			ret     
		)
	)
	
	(method (strength param1)
		(asm
			lap      argc
			bnt      code_04df
			lap      param1
			aTop     _strength
code_04df:
			pToa     _strength
			ret     
		)
	)
	
	(method (delay param1)
		(asm
			lap      argc
			bnt      code_04eb
			lap      param1
			aTop     _delay
code_04eb:
			pToa     _delay
			ret     
		)
	)
)

(class Part of Feature
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
		client 0
		_strength 0
	)
	
	(method (onMe param1 param2)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_06d5
			pushi    #respondsTo
			pushi    1
			pushi    592
			lap      param1
			send     6
			bnt      code_06d5
			pushSelf
			pushi    #target
			pushi    0
			lap      param1
			send     4
			eq?     
			jmp      code_06e0
code_06d5:
			pushi    #onMe
			pushi    1
			lsp      param1
			&rest    param2
			super    Feature,  6
code_06e0:
			ret     
		)
	)
	
	(method (suffer param1)
		(asm
			pushi    #onMe
			pushi    1
			lsp      param1
			self     6
			bnt      code_06fb
			pTos     _strength
			pushi    #strength
			pushi    0
			lap      param1
			send     4
			sub     
			aTop     _strength
			ldi      1
code_06fb:
			ret     
		)
	)
	
	(method (strength param1)
		(asm
			lap      argc
			bnt      code_0705
			lap      param1
			aTop     _strength
code_0705:
			pToa     _strength
			ret     
		)
	)
)

(class Fight of Script
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
		goodGuy 0
		badGuy 0
		chanceTable 0
	)
	
	(method (init param1 param2 param3 param4 param5)
		(asm
			pToa     goodGuy
			not     
			bnt      code_079f
			pushi    #fight
			pushi    1
			pushSelf
			pushi    575
			pushi    1
			lsp      param3
			lap      param2
			aTop     goodGuy
			send     12
code_079f:
			pToa     badGuy
			not     
			bnt      code_07b6
			pushi    #fight
			pushi    1
			pushSelf
			pushi    575
			pushi    1
			lsp      param2
			lap      param3
			aTop     badGuy
			send     12
code_07b6:
			lap      argc
			bnt      code_07c5
			pushi    #init
			pushi    1
			lsp      param1
			&rest    param5
			super    Script,  6
code_07c5:
			pushi    #init
			pushi    0
			pToa     goodGuy
			send     4
			pushi    #init
			pushi    0
			pToa     badGuy
			send     4
			pToa     chanceTable
			not     
			bnt      code_080e
			pushi    #data
			pushi    1
			lsp      param4
			pushi    571
			pushi    1
			pushi    #size
			pushi    0
			pushi    #techniques
			pushi    0
			pToa     goodGuy
			send     4
			send     4
			push    
			pushi    572
			pushi    1
			pushi    #size
			pushi    0
			pushi    #techniques
			pushi    0
			pToa     badGuy
			send     4
			send     4
			push    
			pushi    #new
			pushi    0
			class    Table
			send     4
			aTop     chanceTable
			send     18
code_080e:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pToa     chanceTable
			bnt      code_081d
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     chanceTable
code_081d:
			ldi      0
			aTop     goodGuy
			aTop     badGuy
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (success param1 param2 &tmp temp0 temp1 temp2 temp3 temp4 [temp5 3] temp8 temp9 temp10)
		(asm
			lsp      argc
			ldi      2
			lt?     
			bt       code_0839
			lap      param2
			not     
code_0839:
			bnt      code_0847
			pushi    #success
			pushi    0
			lap      param1
			send     4
			jmp      code_08b2
code_0847:
			pushi    #techniques
			pushi    0
			pToa     goodGuy
			send     4
			sat      temp1
			pushi    #techniques
			pushi    0
			pToa     badGuy
			send     4
			sat      temp2
			pTos     goodGuy
			pushi    #client
			pushi    0
			lap      param1
			send     4
			eq?     
			bnt      code_0873
			lap      param1
			sat      temp3
			lap      param2
			sat      temp4
			jmp      code_087b
code_0873:
			lap      param2
			sat      temp3
			lap      param1
			sat      temp4
code_087b:
			pushi    #indexOf
			pushi    1
			lst      temp4
			lat      temp2
			send     6
			sat      temp9
			pushi    #indexOf
			pushi    1
			lst      temp3
			lat      temp1
			send     6
			sat      temp10
			pushi    #at
			pushi    2
			lst      temp9
			push    
			pToa     chanceTable
			send     8
			sat      temp8
			pushi    #success
			pushi    0
			lap      param1
			send     4
			push    
			pushi    100
			lat      temp8
			sub     
			mul     
			push    
			ldi      100
			div     
code_08b2:
			sat      temp0
			ret     
		)
	)
)
