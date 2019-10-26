;;; Sierra Script 1.0 - (do not remove this comment)
(script# 934)
(include sci.sh)
(use n000)
(use n255)
(use n937)
(use n999)

(public
	GameControls 0
)

(class Slider of IconI
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		sliderView 0
		sliderLoop 0
		sliderCel 0
		sTop 0
		sLeft 0
		sRight 0
		maxY 0
		minY 0
		underBits 0
		yStep 1
		theObj 0
		selector 0
		bottomValue 0
		topValue 0
	)
	
	(method (doit param1)
		(asm
			pToa     theObj
			bnt      code_01e1
			pushi    2
			push    
			pTos     selector
			&rest    param1
			calle    proc999_7,  4
code_01e1:
			ret     
		)
	)
	
	(method (show param1)
		(asm
			pushi    #show
			pushi    0
			&rest    param1
			super    IconI,  4
			pToa     sRight
			not     
			bnt      code_0039
			pToa     nsLeft
			aTop     sLeft
			pToa     nsRight
			aTop     sRight
			pTos     nsBottom
			pushi    3
			pTos     sliderView
			pTos     sliderLoop
			pTos     sliderCel
			callk    CelHigh,  6
			sub     
			aTop     maxY
			pToa     nsTop
			aTop     minY
code_0039:
			pushi    #valueToPosn
			pushi    0
			self     4
			aTop     sTop
			pushi    6
			pTos     sliderView
			pTos     sliderLoop
			pTos     sliderCel
			pTos     sLeft
			pTos     sTop
			pushi    65535
			callk    DrawCel,  12
			ret     
		)
	)
	
	(method (select param1 &tmp temp0)
		(asm
			lap      argc
			bnt      code_00ee
			lap      param1
			bnt      code_00ee
code_005f:
			pushi    #type
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			send     4
			push    
			ldi      2
			ne?     
			bnt      code_00cd
			pushi    #localize
			pushi    0
			lat      temp0
			send     4
			pushi    #y
			pushi    0
			lat      temp0
			send     4
			push    
			pTos     sTop
			pToa     yStep
			sub     
			lt?     
			bnt      code_00a0
			pushi    171
			pushi    #-info-
			pTos     yStep
			pTos     signal
			ldi      512
			and     
			not     
			push    
			self     8
			jmp      code_00c3
code_00a0:
			pushi    #y
			pushi    0
			lat      temp0
			send     4
			push    
			pTos     sTop
			pToa     yStep
			add     
			gt?     
			bnt      code_00c3
			pushi    171
			pushi    #-info-
			pToa     yStep
			neg     
			push    
			pTos     signal
			ldi      512
			and     
			not     
			push    
			self     8
code_00c3:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_005f
code_00cd:
			pTos     signal
			ldi      512
			and     
			bnt      code_00e4
			pushi    #doit
			pushi    1
			pushi    #posnToValue
			pushi    1
			pTos     sTop
			self     6
			push    
			self     6
code_00e4:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_00f1
code_00ee:
			ldi      1
			ret     
code_00f1:
			ret     
		)
	)
	
	(method (highlight)
		(asm
			ret     
		)
	)
	
	(method (advance)
		(asm
			pushi    171
			pushi    2
			pushi    2
			pTos     yStep
			pTos     sTop
			pushi    499
			pushi    1
			pushi    #doit
			pushi    0
			self     4
			push    
			pushi    1
			pTos     topValue
			pToa     bottomValue
			sub     
			push    
			calle    proc999_0,  2
			add     
			push    
			self     6
			sub     
			push    
			calle    proc999_3,  4
			push    
			pTos     signal
			ldi      512
			and     
			not     
			push    
			self     8
			pTos     signal
			ldi      512
			and     
			bnt      code_02be
			pushi    #doit
			pushi    1
			pushi    #posnToValue
			pushi    1
			pTos     sTop
			self     6
			push    
			self     6
code_02be:
			ret     
		)
	)
	
	(method (retreat)
		(asm
			pushi    171
			pushi    2
			pushi    2
			pToa     yStep
			neg     
			push    
			pTos     sTop
			pushi    499
			pushi    1
			pushi    #doit
			pushi    0
			self     4
			push    
			pushi    1
			pTos     topValue
			pToa     bottomValue
			sub     
			push    
			calle    proc999_0,  2
			sub     
			push    
			self     6
			sub     
			push    
			calle    proc999_2,  4
			push    
			pTos     signal
			ldi      512
			and     
			not     
			push    
			self     8
			pTos     signal
			ldi      512
			and     
			bnt      code_030f
			pushi    #doit
			pushi    1
			pushi    #posnToValue
			pushi    1
			pTos     sTop
			self     6
			push    
			self     6
code_030f:
			ret     
		)
	)
	
	(method (move param1 param2 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(asm
			lap      argc
			not     
			bt       code_00fd
			lap      param2
code_00fd:
			sat      temp7
			pushi    1
			lsp      param1
			calle    proc999_0,  2
			sat      temp5
			lap      param1
			sat      temp4
code_010e:
			pTos     yStep
			pushi    1
			lst      temp4
			callk    Abs,  2
			le?     
			bnt      code_01cd
			pTos     sTop
			lst      temp5
			pToa     yStep
			mul     
			sub     
			sat      temp0
			pushi    3
			pTos     sliderView
			pTos     sliderLoop
			pTos     sliderCel
			callk    CelHigh,  6
			sat      temp1
			lst      temp0
			pToa     minY
			lt?     
			bnt      code_013e
			pToa     minY
			jmp      code_014d
code_013e:
			lst      temp0
			pToa     maxY
			gt?     
			bnt      code_014b
			pToa     maxY
			jmp      code_014d
code_014b:
			lat      temp0
code_014d:
			aTop     sTop
			pushi    0
			callk    PicNotValid,  0
			sat      temp2
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			pushi    6
			pTos     view
			pTos     loop
			pTos     cel
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pTos     sliderView
			pTos     sliderLoop
			pTos     sliderCel
			pTos     sLeft
			pTos     sTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pTos     nsTop
			ldi      1
			sub     
			push    
			pTos     nsLeft
			ldi      1
			sub     
			push    
			pushi    2
			pToa     nsBottom
			add     
			push    
			pushi    2
			pToa     nsRight
			add     
			push    
			pushi    1
			callk    Graph,  12
			pushi    1
			lst      temp2
			callk    PicNotValid,  2
			pushi    #posnToValue
			pushi    1
			pTos     sTop
			self     6
			sat      temp3
			lat      temp7
			bnt      code_01b9
			pushi    #doit
			pushi    1
			lst      temp3
			self     6
			jmp      code_01be
code_01b9:
			pushi    #doit
			pushi    0
			self     4
code_01be:
			sat      temp6
			lst      temp4
			pTos     yStep
			lat      temp5
			mul     
			sub     
			sat      temp4
			jmp      code_010e
code_01cd:
			lat      temp6
			ret     
		)
	)
	
	(method (valueToPosn param1 &tmp temp0)
		(asm
			lap      argc
			bnt      code_0205
			lap      param1
			jmp      code_020a
code_0205:
			pushi    #doit
			pushi    0
			self     4
code_020a:
			sat      temp0
			push    
			pToa     topValue
			lt?     
			bnt      code_022d
			lst      temp0
			pToa     bottomValue
			lt?     
			bnt      code_022d
			pTos     bottomValue
			pToa     topValue
			lt?     
			bnt      code_0228
			pToa     maxY
			jmp      code_026f
code_0228:
			pToa     minY
			jmp      code_026f
code_022d:
			lst      temp0
			pToa     topValue
			gt?     
			bnt      code_024f
			lst      temp0
			pToa     bottomValue
			gt?     
			bnt      code_024f
			pTos     bottomValue
			pToa     topValue
			lt?     
			bnt      code_024a
			pToa     minY
			jmp      code_026f
code_024a:
			pToa     maxY
			jmp      code_026f
code_024f:
			pTos     minY
			pushi    1
			pTos     topValue
			lat      temp0
			sub     
			push    
			callk    Abs,  2
			push    
			pTos     maxY
			pToa     minY
			sub     
			mul     
			push    
			pushi    1
			pTos     topValue
			pToa     bottomValue
			sub     
			push    
			callk    Abs,  2
			div     
			add     
code_026f:
			ret     
		)
	)
	
	(method (posnToValue param1)
		(asm
			pTos     bottomValue
			pTos     maxY
			lap      param1
			sub     
			push    
			pTos     topValue
			pToa     bottomValue
			sub     
			mul     
			push    
			pTos     maxY
			pToa     minY
			sub     
			div     
			add     
			ret     
		)
	)
)

(class GameControls of IconBar
	(properties
		elements 0
		size 0
		height 200
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
		state $0000
		activateHeight 0
		y 0
		okButton 0
	)
	
	(method (show &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(asm
			pushi    #pause
			pushi    0
			lag      global8
			send     4
			lag      global77
			bnt      code_03fe
			pushi    #respondsTo
			pushi    1
			pushi    156
			send     6
			bnt      code_03fe
			pushi    #stop
			pushi    0
			lag      global77
			send     4
code_03fe:
			pushi    0
			callk    PicNotValid,  0
			sat      temp5
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			pTos     state
			ldi      32
			or      
			aTop     state
			pushi    1
			pTos     window
			callk    IsObject,  2
			bnt      code_0424
			pushi    #open
			pushi    0
			pToa     window
			send     4
			jmp      code_0455
code_0424:
			pushi    #top
			pushi    1
			pushi    46
			pushi    184
			pushi    1
			pushi    24
			pushi    185
			pushi    1
			pushi    155
			pushi    186
			pushi    1
			pushi    296
			pushi    63
			pushi    1
			pushi    15
			pushi    181
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			lag      global38
			send     4
			send     38
			aTop     window
code_0455:
			ldi      30
			sat      temp0
			ldi      30
			sat      temp1
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp2
code_0465:
			lat      temp2
			bnt      code_04cb
			pushi    1
			push    
			callk    NextNode,  2
			sat      temp3
			pushi    1
			pushi    1
			lst      temp2
			callk    NodeValue,  2
			sat      temp4
			push    
			callk    IsObject,  2
			not     
			bnt      code_0483
			ret     
code_0483:
			pushi    #signal
			pushi    0
			lat      temp4
			send     4
			push    
			ldi      128
			and     
			not     
			bnt      code_04bc
			pushi    #nsRight
			pushi    0
			lat      temp4
			send     4
			push    
			ldi      0
			le?     
			bnt      code_04bc
			pushi    #show
			pushi    2
			lst      temp0
			lst      temp1
			lat      temp4
			send     8
			pushi    20
			pushi    #nsRight
			pushi    0
			lat      temp4
			send     4
			add     
			sat      temp0
			jmp      code_04c4
code_04bc:
			pushi    #show
			pushi    0
			lat      temp4
			send     4
code_04c4:
			lat      temp3
			sat      temp2
			jmp      code_0465
code_04cb:
			pushi    1
			lst      temp5
			callk    PicNotValid,  2
			pToa     okButton
			not     
			bnt      code_04e3
			pushi    1
			pushi    #first
			pushi    0
			self     4
			push    
			callk    NodeValue,  2
			aTop     okButton
code_04e3:
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    #bottom
			pushi    0
			pToa     window
			send     4
			push    
			pushi    #top
			pushi    0
			pToa     window
			send     4
			sub     
			push    
			pushi    #right
			pushi    0
			pToa     window
			send     4
			push    
			pushi    #left
			pushi    0
			pToa     window
			send     4
			sub     
			push    
			pushi    1
			callk    Graph,  12
			pToa     curIcon
			bnt      code_054c
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			pushi    #nsLeft
			pushi    0
			send     4
			push    
			pushi    #nsRight
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     curIcon
			send     4
			sub     
			push    
			ldi      2
			div     
			add     
			push    
			pushi    #nsBottom
			pushi    0
			pToa     curIcon
			send     4
			push    
			ldi      3
			sub     
			push    
			lag      global1
			send     12
code_054c:
			pushi    #doit
			pushi    0
			pushi    105
			pushi    0
			self     8
			ret     
		)
	)
	
	(method (hide)
		(asm
			pToa     window
			bnt      code_0718
			pushi    #dispose
			pushi    0
			send     4
code_0718:
			pTos     state
			ldi      32
			and     
			bnt      code_0730
			pushi    #pause
			pushi    1
			pushi    0
			lag      global8
			send     6
			pTos     state
			ldi      65503
			and     
			aTop     state
code_0730:
			ret     
		)
	)
	
	(method (select param1 param2)
		(asm
			pushi    168
			pushi    1
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0704
			lap      param2
code_0704:
			push    
			lap      param1
			send     6
			ret     
		)
	)
	
	(method (swapCurIcon)
		(asm
			ret     
		)
	)
	
	(method (advanceCurIcon &tmp temp0)
		(asm
			ret     
		)
	)
	
	(method (dispatchEvent pEvent &tmp temp0 temp1 temp2)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			and     
			bnt      code_061b
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      6
			eq?     
			bnt      code_061b
			pushi    #firstTrue
			pushi    2
			pushi    196
			lsp      pEvent
			self     8
			sat      temp1
			pushi    #dispose
			pushi    0
			lap      pEvent
			send     4
			lat      temp1
			bnt      code_05f4
			pushi    #helpStr
			pushi    0
			send     4
			bnt      code_05f4
			pushi    0
			callk    GetPort,  0
			sat      temp2
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      global38
			send     6
			bnt      code_05db
			pushi    #eraseOnly
			pushi    0
			lag      global38
			send     4
			sat      temp0
			pushi    #eraseOnly
			pushi    1
			pushi    1
			lag      global38
			send     6
			pushi    3
			pushi    934
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp1
			send     4
			push    
			calle    proc255_4,  6
			pushi    #eraseOnly
			pushi    1
			lst      temp0
			lag      global38
			send     6
			jmp      code_05ee
code_05db:
			pushi    3
			pushi    934
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp1
			send     4
			push    
			calle    proc255_4,  6
code_05ee:
			pushi    1
			lst      temp2
			callk    SetPort,  2
code_05f4:
			pToa     helpIconItem
			bnt      code_060a
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      65519
			and     
			push    
			pToa     helpIconItem
			send     6
code_060a:
			pushi    #setCursor
			pushi    1
			pushi    999
			lag      global1
			send     6
			ldi      0
			ret     
			jmp      code_06f5
code_061b:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			and     
			bnt      code_06ec
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      5
			eq?     
			bnt      code_0688
			pushi    #dispose
			pushi    0
			lap      pEvent
			send     4
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			bnt      code_0663
			pushi    #respondsTo
			pushi    1
			pushi    178
			pToa     highlightedIcon
			send     6
			bnt      code_0663
			pushi    #retreat
			pushi    0
			pToa     highlightedIcon
			send     4
			ldi      0
			ret     
			jmp      code_06e8
code_0663:
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			not     
			bt       code_0679
			pushi    #signal
			pushi    0
			pToa     highlightedIcon
			send     4
			push    
			ldi      256
			and     
code_0679:
			bnt      code_06e8
			pushi    #advance
			pushi    0
			self     4
			ldi      0
			ret     
			jmp      code_06e8
code_0688:
			dup     
			ldi      1
			eq?     
			bnt      code_06df
			pushi    #dispose
			pushi    0
			lap      pEvent
			send     4
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			bnt      code_06ba
			pushi    #respondsTo
			pushi    1
			pushi    177
			pToa     highlightedIcon
			send     6
			bnt      code_06ba
			pushi    #advance
			pushi    0
			pToa     highlightedIcon
			send     4
			ldi      0
			ret     
			jmp      code_06e8
code_06ba:
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			not     
			bt       code_06d0
			pushi    #signal
			pushi    0
			pToa     highlightedIcon
			send     4
			push    
			ldi      256
			and     
code_06d0:
			bnt      code_06e8
			pushi    #retreat
			pushi    0
			self     4
			ldi      0
			ret     
			jmp      code_06e8
code_06df:
			pushi    #dispatchEvent
			pushi    1
			lsp      pEvent
			super    IconBar,  6
code_06e8:
			toss    
			jmp      code_06f5
code_06ec:
			pushi    #dispatchEvent
			pushi    1
			lsp      pEvent
			super    IconBar,  6
code_06f5:
			ret     
		)
	)
)

(class ControlIcon of IconI
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		theObj 0
		selector 0
	)
	
	(method (select param1)
		(asm
			pToa     theObj
			bnt      code_07ec
			pushi    #select
			pushi    0
			&rest    param1
			super    IconI,  4
			bnt      code_07f5
			pTos     signal
			ldi      64
			and     
			bnt      code_07de
			pushi    105
			pushi    0
			lag      global63
			bnt      code_07da
			jmp      code_07dc
code_07da:
			class    GameControls
code_07dc:
			send     4
code_07de:
			pushi    2
			pTos     theObj
			pTos     selector
			calle    proc999_7,  4
			jmp      code_07f5
code_07ec:
			pushi    #select
			pushi    0
			&rest    param1
			super    IconI,  4
code_07f5:
			ret     
		)
	)
)
