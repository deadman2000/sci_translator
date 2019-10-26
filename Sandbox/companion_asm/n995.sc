;;; Sierra Script 1.0 - (do not remove this comment)
(script# 995)
(include sci.sh)
(use n000)
(use n255)
(use n937)
(use n981)
(use n999)


(local
	local0
)
(procedure (localproc_0851 param1 param2 param3 &tmp temp0 temp1 temp2 temp3)
	(asm
		pushi    #nsRight
		pushi    0
		lap      param1
		send     4
		push    
		pushi    #nsLeft
		pushi    0
		lap      param1
		send     4
		sub     
		push    
		ldi      2
		div     
		push    
		pushi    #nsLeft
		pushi    0
		lap      param1
		send     4
		add     
		sat      temp3
		lap      param2
		sat      temp2
code_0876:
		pushi    1
		lst      temp2
		lap      param3
		sub     
		push    
		callk    Abs,  2
		push    
		ldi      4
		ge?     
		bnt      code_08da
		pushi    #firstTrue
		pushi    2
		pushi    196
		pushi    #x
		pushi    1
		lst      temp3
		pushi    3
		pushi    1
		lst      temp2
		pushi    114
		pushi    0
		pushi    #new
		pushi    0
		class    Event
		send     4
		sat      temp1
		send     16
		push    
		self     8
		sat      temp0
		bnt      code_08b7
		pushi    #dispose
		pushi    0
		lat      temp1
		send     4
		lat      temp0
		ret     
code_08b7:
		pushi    #dispose
		pushi    0
		lat      temp1
		send     4
		lsp      param2
		lap      param3
		lt?     
		bnt      code_08d0
		lst      temp2
		ldi      4
		add     
		sat      temp2
		jmp      code_0876
code_08d0:
		lst      temp2
		ldi      4
		sub     
		sat      temp2
		jmp      code_0876
code_08da:
		ret     
	)
)

(class InvI of IconI
	(properties
		view 0
		loop 0
		cel 0
		nsLeft 0
		nsTop 0
		nsRight 0
		nsBottom 0
		state $0000
		cursor 999
		type $4000
		message 4
		modifiers $0000
		signal $0000
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		description 0
		owner 0
		script 0
		value 0
	)
	
	(method (show &tmp [temp0 4])
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
	
	(method (highlight param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pTos     highlightColor
			ldi      65535
			eq?     
			bnt      code_0039
			ret     
code_0039:
			lap      argc
			bnt      code_0048
			lap      param1
			bnt      code_0048
			pToa     highlightColor
			jmp      code_004a
code_0048:
			pToa     lowlightColor
code_004a:
			sat      temp4
			pTos     nsTop
			ldi      2
			sub     
			sat      temp0
			pTos     nsLeft
			ldi      2
			sub     
			sat      temp1
			pTos     nsBottom
			ldi      1
			add     
			sat      temp2
			pTos     nsRight
			ldi      1
			add     
			sat      temp3
			pushi    8
			pushi    4
			lst      temp0
			lst      temp1
			lst      temp0
			push    
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp0
			lst      temp3
			lst      temp2
			lst      temp3
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp2
			lst      temp3
			lst      temp2
			lst      temp1
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp2
			lst      temp1
			lst      temp0
			lst      temp1
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    6
			pushi    12
			pTos     nsTop
			ldi      2
			sub     
			push    
			pTos     nsLeft
			ldi      2
			sub     
			push    
			pTos     nsBottom
			ldi      2
			add     
			push    
			pTos     nsRight
			ldi      2
			add     
			push    
			pushi    1
			callk    Graph,  12
			ret     
		)
	)
	
	(method (onMe param1)
		(asm
			pushi    #onMe
			pushi    1
			lsp      param1
			super    IconI,  6
			bnt      code_0016
			pTos     signal
			ldi      4
			and     
			not     
code_0016:
			ret     
		)
	)
	
	(method (ownedBy param1)
		(asm
			pTos     owner
			lap      param1
			eq?     
			ret     
		)
	)
	
	(method (moveTo param1)
		(asm
			lap      param1
			aTop     owner
			pToa     value
			bnt      code_0111
			lsp      param1
			lag      global0
			eq?     
			bnt      code_0111
			pushi    #changeScore
			pushi    1
			pTos     value
			lag      global1
			send     6
			ldi      0
			aTop     value
code_0111:
			selfID  
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_002c
			pushi    3
			pushi    995
			pushi    0
			pTos     description
			calle    proc255_4,  6
code_002c:
			toss    
			ret     
		)
	)
)

(class Inv of IconBar
	(properties
		elements 0
		size 0
		height 0
		underBits 0
		oldMouseX 0
		oldMouseY 0
		curIcon 0
		highlightedIcon 0
		prevIcon 0
		curInvIcon 0
		useIconItem 0
		helpIconItem 0
		port 0
		window 0
		state $0400
		activateHeight 0
		y 0
		normalHeading 3753
		heading 0
		empty 3772
		curScore 3781
		showScore 1
		iconBarInvItem 0
		okButton 0
		selectIcon 0
	)
	
	(procedure (localproc_01ac param1 param2 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10 temp11 temp12 temp13 temp14 temp15 temp16 temp17 temp18 temp19 temp20)
		(asm
			ldi      0
			sat      temp5
			sat      temp4
			sat      temp3
			sat      temp2
			sat      temp1
			sat      temp0
			pushi    #first
			pushi    0
			lag      global9
			send     4
			sat      temp8
code_01c5:
			lat      temp8
			bnt      code_02c8
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			pushi    1
			lst      temp8
			callk    NodeValue,  2
			sat      temp9
			send     6
			bnt      code_026c
			pushi    #ownedBy
			pushi    1
			lsp      param1
			lat      temp9
			send     6
			bnt      code_0256
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lat      temp9
			send     4
			push    
			ldi      65531
			and     
			push    
			lat      temp9
			send     6
			+at      temp0
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelWide,  6
			sat      temp6
			push    
			lat      temp2
			gt?     
			bnt      code_0229
			lat      temp6
			sat      temp2
code_0229:
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelHigh,  6
			sat      temp7
			push    
			lat      temp1
			gt?     
			bnt      code_02ba
			lat      temp7
			sat      temp1
			jmp      code_02ba
code_0256:
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lat      temp9
			send     4
			push    
			ldi      4
			or      
			push    
			lat      temp9
			send     6
			jmp      code_02ba
code_026c:
			+at      temp3
			lst      temp5
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelWide,  6
			add     
			sat      temp5
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelHigh,  6
			sat      temp7
			push    
			lat      temp4
			gt?     
			bnt      code_02ba
			lat      temp7
			sat      temp4
code_02ba:
			pushi    #next
			pushi    1
			lst      temp8
			lag      global9
			send     6
			sat      temp8
			jmp      code_01c5
code_02c8:
			lat      temp0
			not     
			bnt      code_02df
			pushi    4
			pushi    995
			pushi    1
			pTos     normalHeading
			pTos     empty
			calle    proc255_4,  8
			ldi      0
			ret     
code_02df:
			pushi    1
			lst      temp0
			callk    Sqrt,  2
			sat      temp16
			push    
			mul     
			push    
			lat      temp0
			gt?     
			bnt      code_02f2
			-at      temp16
code_02f2:
			lst      temp16
			ldi      3
			gt?     
			bnt      code_02fe
			ldi      3
			sat      temp16
code_02fe:
			lst      temp0
			lat      temp16
			div     
			sal      local0
			lst      temp16
			mul     
			push    
			lat      temp0
			lt?     
			bnt      code_0311
			+al      local0
code_0311:
			pushi    2
			pushi    4
			lat      temp5
			add     
			push    
			lsl      local0
			pushi    4
			lat      temp2
			add     
			mul     
			push    
			calle    proc999_3,  4
			sat      temp10
			lst      temp16
			pushi    4
			lat      temp1
			add     
			mul     
			sat      temp11
			pushi    190
			sub     
			push    
			ldi      2
			div     
			sat      temp12
			pushi    320
			lat      temp10
			sub     
			push    
			ldi      2
			div     
			sat      temp13
			lst      temp12
			lat      temp11
			add     
			sat      temp14
			lst      temp13
			lat      temp10
			add     
			sat      temp15
			pushi    #window
			pushi    0
			lag      global9
			send     4
			bnt      code_0386
			pushi    #top
			pushi    1
			lst      temp12
			pushi    184
			pushi    1
			lst      temp13
			pushi    186
			pushi    1
			lst      temp15
			pushi    185
			pushi    1
			lst      temp14
			pushi    181
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     28
code_0386:
			lal      local0
			sat      temp20
			lat      temp0
			bnt      code_04f0
			pushi    2
			pushi    #respondsTo
			pushi    1
			pushi    363
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     6
			bnt      code_03af
			pushi    #yOffset
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     4
code_03af:
			add     
			sat      temp18
			pushi    4
			pushi    #respondsTo
			pushi    1
			pushi    362
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     6
			bnt      code_03d3
			pushi    #xOffset
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     4
code_03d3:
			add     
			sat      temp17
			sat      temp19
			pushi    #first
			pushi    0
			lag      global9
			send     4
			sat      temp8
code_03e1:
			lat      temp8
			bnt      code_04f0
			pushi    #signal
			pushi    0
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp9
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_04e2
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			lat      temp9
			send     6
			bnt      code_04e2
			pushi    #signal
			pushi    0
			lat      temp9
			send     4
			push    
			ldi      128
			and     
			not     
			bnt      code_04b8
			pushi    10
			pushi    1
			lst      temp17
			lst      temp2
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelWide,  6
			sat      temp6
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsTop
			pushi    1
			lst      temp18
			lst      temp1
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelHigh,  6
			sat      temp7
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			lat      temp9
			send     12
			pushi    12
			pushi    1
			pushi    #nsLeft
			pushi    0
			lat      temp9
			send     4
			push    
			lat      temp6
			add     
			push    
			pushi    11
			pushi    1
			pushi    #nsTop
			pushi    0
			lat      temp9
			send     4
			push    
			lat      temp7
			add     
			push    
			lat      temp9
			send     12
			-at      temp20
			bnt      code_04a6
			lst      temp17
			lat      temp2
			add     
			sat      temp17
			jmp      code_04ca
code_04a6:
			lal      local0
			sat      temp20
			lst      temp18
			lat      temp1
			add     
			sat      temp18
			lat      temp19
			sat      temp17
			jmp      code_04ca
code_04b8:
			pushi    #nsLeft
			pushi    0
			lat      temp9
			send     4
			sat      temp17
			pushi    #nsTop
			pushi    0
			lat      temp9
			send     4
			sat      temp18
code_04ca:
			pushi    #show
			pushi    0
			lat      temp9
			send     4
			lst      temp9
			lap      param2
			eq?     
			bnt      code_04e2
			pushi    #highlight
			pushi    0
			lat      temp9
			send     4
code_04e2:
			pushi    #next
			pushi    1
			lst      temp8
			lag      global9
			send     6
			sat      temp8
			jmp      code_03e1
code_04f0:
			pushi    #right
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     4
			push    
			pushi    #left
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     4
			sub     
			push    
			lat      temp5
			sub     
			push    
			ldi      2
			div     
			sat      temp17
			pushi    #bottom
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     4
			push    
			pushi    #top
			pushi    0
			pushi    #window
			pushi    0
			lag      global9
			send     4
			send     4
			sub     
			sat      temp11
			ldi      32767
			sat      temp18
			pushi    #first
			pushi    0
			lag      global9
			send     4
			sat      temp8
code_0542:
			lat      temp8
			bnt      code_0610
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			pushi    1
			lst      temp8
			callk    NodeValue,  2
			sat      temp9
			send     6
			not     
			bnt      code_0602
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelWide,  6
			sat      temp6
			pushi    3
			pushi    #view
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #loop
			pushi    0
			lat      temp9
			send     4
			push    
			pushi    #cel
			pushi    0
			lat      temp9
			send     4
			push    
			callk    CelHigh,  6
			sat      temp7
			pushi    #signal
			pushi    0
			lat      temp9
			send     4
			push    
			ldi      128
			and     
			not     
			bnt      code_05d5
			lst      temp18
			ldi      32767
			eq?     
			bnt      code_05b9
			lst      temp11
			lat      temp7
			sub     
			sat      temp18
code_05b9:
			pushi    10
			pushi    #superClass
			lst      temp17
			pushi    9
			pushi    1
			lst      temp18
			pushi    11
			pushi    1
			lst      temp11
			pushi    12
			pushi    1
			lst      temp17
			lat      temp6
			add     
			push    
			lat      temp9
			send     24
code_05d5:
			pushi    #nsLeft
			pushi    0
			lat      temp9
			send     4
			push    
			lat      temp6
			add     
			sat      temp17
			pushi    #nsTop
			pushi    0
			lat      temp9
			send     4
			sat      temp18
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lat      temp9
			send     4
			push    
			ldi      65531
			and     
			push    
			pushi    194
			pushi    0
			lat      temp9
			send     10
code_0602:
			pushi    #next
			pushi    1
			lst      temp8
			lag      global9
			send     6
			sat      temp8
			jmp      code_0542
code_0610:
			ldi      1
			ret     
		)
	)
	
	
	(method (init)
		(asm
			selfID  
			sag      global9
			pToa     normalHeading
			aTop     heading
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1 temp2 temp3 [temp4 3] temp7 temp8 temp9)
		(asm
code_08dd:
			pushi    #type
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp1
			send     4
			bnt      code_08f8
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			jmp      code_08dd
code_08f8:
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			ldi      0
			sat      temp1
code_0903:
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp1
			bnt      code_0d0d
			pTos     state
			ldi      32
			and     
			bnt      code_0d0d
			ldi      0
			sat      temp9
			pushi    #localize
			pushi    0
			lat      temp1
			send     4
			pToa     curIcon
			bnt      code_09ad
			pushi    #modifiers
			pushi    0
			lat      temp1
			send     4
			not     
			bnt      code_09ad
			pTos     curIcon
			pToa     selectIcon
			ne?     
			bnt      code_09ad
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      1
			eq?     
			bt       code_097f
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0969
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      13
			eq?     
			bnt      code_0969
			ldi      1
			sat      temp9
code_0969:
			bt       code_097f
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      256
			eq?     
			bnt      code_09ad
			ldi      1
			sat      temp9
code_097f:
			bnt      code_09ad
			pTos     curIcon
			pToa     helpIconItem
			ne?     
			bt       code_0995
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      16
			and     
code_0995:
			bnt      code_09ad
			pushi    #type
			pushi    1
			pushi    16384
			pushi    40
			pushi    1
			pushi    #message
			pushi    0
			pToa     curIcon
			send     4
			push    
			lat      temp1
			send     12
code_09ad:
			pushi    1
			lst      temp1
			callk    MapKeyToDir,  2
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			sat      temp3
			push    
			ldi      1
			eq?     
			bnt      code_09de
			pushi    #modifiers
			pushi    0
			lat      temp1
			send     4
			bnt      code_09de
			pushi    #advanceCurIcon
			pushi    0
			self     4
			pushi    #claimed
			pushi    1
			pushi    1
			lat      temp1
			send     6
			jmp      code_0d03
code_09de:
			lst      temp3
			ldi      0
			eq?     
			bnt      code_0a07
			pushi    #firstTrue
			pushi    2
			pushi    196
			lst      temp1
			self     8
			sat      temp0
			bnt      code_0a07
			push    
			pToa     highlightedIcon
			ne?     
			bnt      code_0a07
			pushi    #highlight
			pushi    1
			lst      temp0
			self     6
			jmp      code_0d03
code_0a07:
			lst      temp3
			ldi      1
			eq?     
			bt       code_0a2b
			lst      temp3
			ldi      4
			eq?     
			bnt      code_0a22
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      13
			eq?     
code_0a22:
			bt       code_0a2b
			lst      temp3
			ldi      256
			eq?     
code_0a2b:
			bnt      code_0abf
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			bnt      code_0d03
			pushi    168
			pushi    #-info-
			pTos     highlightedIcon
			lst      temp3
			ldi      1
			eq?     
			push    
			self     8
			bnt      code_0d03
			pTos     highlightedIcon
			pToa     okButton
			eq?     
			bnt      code_0a56
			jmp      code_0d0d
			jmp      code_0d03
code_0a56:
			pTos     highlightedIcon
			pToa     helpIconItem
			eq?     
			bnt      code_0aa7
			pTos     state
			ldi      2048
			and     
			bnt      code_0a70
			pushi    #noClickHelp
			pushi    0
			self     4
			jmp      code_0d03
code_0a70:
			pushi    #cursor
			pushi    0
			pToa     highlightedIcon
			send     4
			push    
			ldi      65535
			ne?     
			bnt      code_0a8e
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			lag      global1
			send     6
code_0a8e:
			pToa     helpIconItem
			bnt      code_0d03
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      16
			or      
			push    
			pToa     helpIconItem
			send     6
			jmp      code_0d03
code_0aa7:
			pToa     highlightedIcon
			aTop     curIcon
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      global1
			send     8
			jmp      code_0d03
code_0abf:
			lst      temp3
			ldi      64
			and     
			bnt      code_0b68
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			dup     
			ldi      3
			eq?     
			bnt      code_0adf
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0b64
code_0adf:
			dup     
			ldi      7
			eq?     
			bnt      code_0aef
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0b64
code_0aef:
			dup     
			ldi      1
			eq?     
			bnt      code_0b27
			pToa     highlightedIcon
			bnt      code_0b1e
			pushi    3
			push    
			pushi    #nsTop
			pushi    0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    0
			call     localproc_0851,  6
			sat      temp0
			bnt      code_0b1e
			pushi    #highlight
			pushi    2
			lst      temp0
			pushi    1
			self     8
			jmp      code_0b64
code_0b1e:
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0b64
code_0b27:
			dup     
			ldi      5
			eq?     
			bnt      code_0b64
			pToa     highlightedIcon
			bnt      code_0b5e
			pushi    3
			push    
			pushi    #nsBottom
			pushi    0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #bottom
			pushi    0
			pToa     window
			send     4
			push    
			call     localproc_0851,  6
			sat      temp0
			bnt      code_0b5e
			pushi    #highlight
			pushi    2
			lst      temp0
			pushi    1
			self     8
			jmp      code_0b64
code_0b5e:
			pushi    #advance
			pushi    0
			self     4
code_0b64:
			toss    
			jmp      code_0d03
code_0b68:
			lst      temp3
			ldi      4
			eq?     
			bnt      code_0b9a
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			dup     
			ldi      9
			eq?     
			bnt      code_0b88
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0b96
code_0b88:
			dup     
			ldi      3840
			eq?     
			bnt      code_0b96
			pushi    #retreat
			pushi    0
			self     4
code_0b96:
			toss    
			jmp      code_0d03
code_0b9a:
			lst      temp3
			ldi      16384
			eq?     
			bnt      code_0d03
			pushi    #firstTrue
			pushi    2
			pushi    196
			lst      temp1
			self     8
			sat      temp0
			bnt      code_0d03
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      6
			eq?     
			bnt      code_0c42
			lat      temp0
			bnt      code_0c21
			pushi    #helpStr
			pushi    0
			send     4
			bnt      code_0c21
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      global38
			send     6
			bnt      code_0c0e
			pushi    #eraseOnly
			pushi    0
			lag      global38
			send     4
			sat      temp7
			pushi    #eraseOnly
			pushi    1
			pushi    1
			lag      global38
			send     6
			pushi    3
			pushi    995
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp0
			send     4
			push    
			calle    proc255_4,  6
			pushi    #eraseOnly
			pushi    1
			lst      temp7
			lag      global38
			send     6
			jmp      code_0c21
code_0c0e:
			pushi    3
			pushi    995
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp0
			send     4
			push    
			calle    proc255_4,  6
code_0c21:
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      65519
			and     
			push    
			pToa     helpIconItem
			send     6
			pushi    #setCursor
			pushi    1
			pushi    999
			lag      global1
			send     6
			jmp      code_0d03
code_0c42:
			lst      temp0
			pToa     okButton
			eq?     
			bnt      code_0c59
			pushi    #select
			pushi    1
			lst      temp0
			super    IconBar,  6
			bt       code_0d0d
			jmp      code_0d03
code_0c59:
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			lat      temp0
			send     6
			not     
			bnt      code_0c8e
			pushi    #select
			pushi    2
			lst      temp0
			lat      temp9
			not     
			push    
			self     8
			bnt      code_0d03
			lat      temp0
			aTop     curIcon
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      global1
			send     8
			jmp      code_0d03
code_0c8e:
			pToa     curIcon
			bnt      code_0d03
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      global38
			send     6
			bnt      code_0cb3
			pushi    #eraseOnly
			pushi    0
			lag      global38
			send     4
			sat      temp7
			pushi    #eraseOnly
			pushi    1
			pushi    1
			lag      global38
			send     6
code_0cb3:
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			pToa     curIcon
			send     6
			bnt      code_0cdc
			pushi    #doVerb
			pushi    2
			pushi    #message
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #indexOf
			pushi    1
			pTos     curIcon
			self     6
			push    
			lat      temp0
			send     8
			jmp      code_0cec
code_0cdc:
			pushi    #doVerb
			pushi    1
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			lat      temp0
			send     6
code_0cec:
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      global38
			send     6
			bnt      code_0d03
			pushi    #eraseOnly
			pushi    1
			lst      temp7
			lag      global38
			send     6
code_0d03:
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			jmp      code_0903
code_0d0d:
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			pushi    #hide
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (showSelf param1)
		(asm
			pushi    #pause
			pushi    0
			lag      global8
			send     4
			lag      global77
			bnt      code_0646
			pushi    #respondsTo
			pushi    1
			pushi    156
			send     6
			bnt      code_0646
			pushi    #stop
			pushi    0
			lag      global77
			send     4
code_0646:
			pushi    #height
			pushi    0
			lag      global69
			send     4
			bnt      code_0658
			pushi    #hide
			pushi    0
			lag      global69
			send     4
code_0658:
			pToa     window
			not     
			bnt      code_0667
			pushi    #new
			pushi    0
			class    SysWindow
			send     4
			aTop     window
code_0667:
			pushi    #window
			pushi    0
			pToa     window
			send     4
			bnt      code_067c
			pushi    #dispose
			pushi    0
			pToa     window
			send     4
			ldi      0
			aTop     window
code_067c:
			pToa     okButton
			not     
			bnt      code_068e
			pushi    1
			pushi    #first
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			aTop     okButton
code_068e:
			ldi      0
			aTop     curIcon
			pushi    194
			pushi    1
			lap      argc
			bnt      code_06a0
			lap      param1
			jmp      code_06a2
code_06a0:
			lag      global0
code_06a2:
			push    
			self     6
			bnt      code_06ad
			pushi    #doit
			pushi    0
			self     4
code_06ad:
			ret     
		)
	)
	
	(method (show param1 &tmp temp0 temp1)
		(asm
			pushi    187
			pushi    1
			pToa     curIcon
			bnt      code_06c1
			pushi    #cursor
			pushi    0
			send     4
			jmp      code_06c8
code_06c1:
			pushi    #cursor
			pushi    0
			pToa     selectIcon
			send     4
code_06c8:
			push    
			lag      global1
			send     6
			pushi    0
			callk    PicNotValid,  0
			sat      temp0
			pushi    1
			pushi    0
			callk    PicNotValid,  2
			pTos     state
			ldi      32
			or      
			aTop     state
			pushi    2
			lap      argc
			bnt      code_06ea
			lap      param1
			jmp      code_06ec
code_06ea:
			lag      global0
code_06ec:
			push    
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			push    
			call     localproc_01ac,  4
			sat      temp1
			not     
			bnt      code_0707
			pTos     state
			ldi      65503
			and     
			aTop     state
code_0707:
			pushi    1
			lst      temp0
			callk    PicNotValid,  2
			lat      temp1
			ret     
		)
	)
	
	(method (hide)
		(asm
			pTos     state
			ldi      32
			and     
			bnt      code_0d32
			pushi    #pause
			pushi    1
			pushi    0
			lag      global8
			send     6
			pTos     state
			ldi      65503
			and     
			aTop     state
code_0d32:
			pToa     window
			bnt      code_0d3c
			pushi    #dispose
			pushi    0
			send     4
code_0d3c:
			pushi    1
			pTos     curIcon
			callk    IsObject,  2
			bnt      code_0db1
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			pToa     curIcon
			send     6
			bnt      code_0db1
			pushi    #curInvIcon
			pushi    0
			lag      global69
			send     4
			not     
			bnt      code_0d6f
			pushi    #enable
			pushi    1
			pushi    #useIconItem
			pushi    0
			lag      global69
			send     4
			push    
			lag      global69
			send     6
code_0d6f:
			pushi    #curIcon
			pushi    1
			pushi    #cursor
			pushi    1
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    114
			pushi    0
			pushi    #useIconItem
			pushi    0
			lag      global69
			send     4
			send     10
			push    
			pushi    209
			pushi    1
			pTos     curIcon
			lag      global69
			send     12
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			bnt      code_0db1
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      global1
			send     8
code_0db1:
			ret     
		)
	)
	
	(method (advance param1 &tmp temp0 temp1 temp2 temp3)
		(asm
			lap      argc
			bnt      code_071c
			lap      param1
			jmp      code_071e
code_071c:
			ldi      1
code_071e:
			sat      temp1
			pushi    #indexOf
			pushi    1
			pTos     highlightedIcon
			self     6
			sat      temp2
			lst      temp1
			add     
			sat      temp3
code_072f:
			pushi    67
			pushi    1
			lst      temp3
			pToa     size
			le?     
			bnt      code_073f
			lat      temp3
			jmp      code_0747
code_073f:
			lst      temp3
			pTos     size
			ldi      1
			sub     
			mod     
code_0747:
			push    
			self     6
			sat      temp0
			pushi    1
			push    
			callk    IsObject,  2
			not     
			bnt      code_0761
			pushi    1
			pushi    #first
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			sat      temp0
code_0761:
			pushi    #signal
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_0776
			jmp      code_077b
			jmp      code_072f
code_0776:
			+at      temp3
			jmp      code_072f
code_077b:
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			lat      temp0
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lat      temp0
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			lat      temp0
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
			pushi    #highlight
			pushi    1
			lst      temp0
			self     6
			ret     
		)
	)
	
	(method (retreat param1 &tmp temp0 temp1 temp2 temp3)
		(asm
			lap      argc
			bnt      code_07c6
			lap      param1
			jmp      code_07c8
code_07c6:
			ldi      1
code_07c8:
			sat      temp1
			pushi    #indexOf
			pushi    1
			pTos     highlightedIcon
			self     6
			sat      temp2
			push    
			lat      temp1
			sub     
			sat      temp3
code_07da:
			pushi    #at
			pushi    1
			lst      temp3
			self     6
			sat      temp0
			pushi    1
			push    
			callk    IsObject,  2
			not     
			bnt      code_07f8
			pushi    1
			pushi    #last
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			sat      temp0
code_07f8:
			pushi    #signal
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_080d
			jmp      code_0812
			jmp      code_07da
code_080d:
			-at      temp3
			jmp      code_07da
code_0812:
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			lat      temp0
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lat      temp0
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			lat      temp0
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			lat      temp0
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
			pushi    #highlight
			pushi    1
			lst      temp0
			self     6
			ret     
		)
	)
	
	(method (advanceCurIcon &tmp temp0)
		(asm
			pToa     curIcon
			sat      temp0
code_0db8:
			pushi    111
			pushi    1
			class    InvI
			push    
			pushi    67
			pushi    1
			pushi    #indexOf
			pushi    1
			lst      temp0
			self     6
			push    
			ldi      1
			add     
			push    
			pToa     size
			mod     
			push    
			self     6
			sat      temp0
			send     6
			bnt      code_0dde
			jmp      code_0db8
code_0dde:
			lat      temp0
			aTop     curIcon
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      global1
			send     8
			ret     
		)
	)
	
	(method (ownedBy param1)
		(asm
			pushi    #firstTrue
			pushi    2
			pushi    329
			lsp      param1
			self     8
			ret     
		)
	)
)
