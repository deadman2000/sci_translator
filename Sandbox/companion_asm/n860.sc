;;; Sierra Script 1.0 - (do not remove this comment)
(script# 860)
(include sci.sh)
(use n000)
(use n950)
(use n998)
(use n999)


(class FairFeature of Feature
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
	
	(method (onMe param1 &tmp [temp0 2])
		(asm
			pushi    3
			pushi    #message
			pushi    0
			lap      param1
			send     4
			push    
			pushi    2
			pushi    5
			calle    proc999_5,  6
			bt       code_0045
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_002f
			pTos     y
			ldi      100
			gt?     
code_002f:
			bt       code_0045
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			lt?     
			bnt      code_0054
			pTos     y
			ldi      95
			lt?     
code_0045:
			bnt      code_0054
			pushi    #onMe
			pushi    1
			lsp      param1
			super    Feature,  6
			jmp      code_0056
code_0054:
			ldi      0
code_0056:
			ret     
		)
	)
)

(class FairActor of Actor
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
	
	(method (onMe param1 &tmp [temp0 2])
		(asm
			pushi    3
			pushi    #message
			pushi    0
			lap      param1
			send     4
			push    
			pushi    2
			pushi    5
			calle    proc999_5,  6
			bt       code_0109
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_00f3
			pTos     y
			ldi      100
			gt?     
code_00f3:
			bt       code_0109
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			lt?     
			bnt      code_0118
			pTos     y
			ldi      95
			lt?     
code_0109:
			bnt      code_0118
			pushi    #onMe
			pushi    1
			lsp      param1
			super    Actor,  6
			jmp      code_011a
code_0118:
			ldi      0
code_011a:
			ret     
		)
	)
)

(class FairProp of Prop
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
	
	(method (onMe param1 &tmp [temp0 2])
		(asm
			pushi    3
			pushi    #message
			pushi    0
			lap      param1
			send     4
			push    
			pushi    2
			pushi    5
			calle    proc999_5,  6
			bt       code_0251
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_023b
			pTos     y
			ldi      100
			gt?     
code_023b:
			bt       code_0251
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			lt?     
			bnt      code_0260
			pTos     y
			ldi      95
			lt?     
code_0251:
			bnt      code_0260
			pushi    #onMe
			pushi    1
			lsp      param1
			super    Prop,  6
			jmp      code_0262
code_0260:
			ldi      0
code_0262:
			ret     
		)
	)
)

(class FairView of View
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
	
	(method (onMe param1 &tmp [temp0 2])
		(asm
			pushi    3
			pushi    #message
			pushi    0
			lap      param1
			send     4
			push    
			pushi    2
			pushi    5
			calle    proc999_5,  6
			bt       code_0369
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      100
			gt?     
			bnt      code_0353
			pTos     y
			ldi      100
			gt?     
code_0353:
			bt       code_0369
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      95
			lt?     
			bnt      code_0378
			pTos     y
			ldi      95
			lt?     
code_0369:
			bnt      code_0378
			pushi    #onMe
			pushi    1
			lsp      param1
			super    View,  6
			jmp      code_037a
code_0378:
			ldi      0
code_037a:
			ret     
		)
	)
)
