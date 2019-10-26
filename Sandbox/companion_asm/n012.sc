;;; Sierra Script 1.0 - (do not remove this comment)
(script# 12)
(include sci.sh)
(use n000)
(use n998)
(use n999)

(public
	MapButton 0
)

(class MapButton of View
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
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    View,  4
			pushi    #add
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #add
			pushi    1
			pushSelf
			lag      global72
			send     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			not     
			bt       code_00c8
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			not     
			bt       code_00c8
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bt       code_00c8
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
code_00c8:
			bnt      code_00d7
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    View,  6
			jmp      code_01db
code_00d7:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bnt      code_0184
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			pushi    83
			pushi    0
			self     10
code_00f6:
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			bnt      code_014b
			pushi    #type
			pushi    0
			send     4
			push    
			ldi      2
			ne?     
			bnt      code_014b
			pushi    #localize
			pushi    0
			lat      temp0
			send     4
			pushi    #onMe
			pushi    1
			lst      temp0
			self     6
			bnt      code_0133
			pToa     cel
			not     
			bnt      code_0141
			pushi    #cel
			pushi    1
			pushi    1
			pushi    83
			pushi    0
			self     10
			jmp      code_0141
code_0133:
			pToa     cel
			bnt      code_0141
			pushi    #cel
			pushi    1
			pushi    0
			pushi    83
			pushi    0
			self     10
code_0141:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_00f6
code_014b:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			pToa     cel
			bnt      code_017e
			pushi    #cel
			pushi    1
			pushi    0
			pushi    83
			pushi    0
			self     10
			pushi    #select
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			push    
			lag      global69
			send     6
			pushi    #newRoom
			pushi    1
			pTos     heading
			lag      global2
			send     6
			jmp      code_01db
code_017e:
			ldi      0
			ret     
			jmp      code_01db
code_0184:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_01d2
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
			bnt      code_01d2
			pushi    #cel
			pushi    1
			pushi    1
			pushi    83
			pushi    0
			self     10
			pushi    #select
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			push    
			lag      global69
			send     6
			pushi    #newRoom
			pushi    1
			pTos     heading
			lag      global2
			send     6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      1
			ret     
			jmp      code_01db
code_01d2:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    View,  6
code_01db:
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_006e
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
			jmp      code_0076
code_006e:
			lap      param1
			sat      temp0
			lap      param2
			sat      temp1
code_0076:
			lag      global25
			bnt      code_0080
			ldi      0
			jmp      code_008b
code_0080:
			pushi    #onMe
			pushi    2
			lst      temp0
			lst      temp1
			super    View,  8
code_008b:
			ret     
		)
	)
	
	(method (draw)
		(asm
			pushi    6
			pTos     view
			pTos     loop
			pTos     cel
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			ret     
		)
	)
)
