;;; Sierra Script 1.0 - (do not remove this comment)
(script# 928)
(include sci.sh)
(use n000)
(use n255)
(use n941)
(use n998)
(use n999)


(class RTRandCycle of RandCycle
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		count -1
	)
	
	(method (init param1 param2 param3)
		(asm
			pushi    #init
			pushi    1
			lsp      param1
			super    RandCycle,  6
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			lag      global88
			aTop     cycleCnt
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0081
			lsg      global88
			lap      param2
			add     
			aTop     count
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0085
			lap      param3
			aTop     caller
			jmp      code_0085
code_0081:
			ldi      65535
			aTop     count
code_0085:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pTos     count
			lag      global88
			sat      temp0
			sub     
			push    
			ldi      0
			gt?     
			bnt      code_0040
			pushi    1
			lst      temp0
			pToa     cycleCnt
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    #cycleSpeed
			pushi    0
			pToa     client
			send     4
			gt?     
			bnt      code_004e
			pushi    #cel
			pushi    1
			pushi    #nextCel
			pushi    0
			self     4
			push    
			pToa     client
			send     6
			lag      global88
			aTop     cycleCnt
			jmp      code_004e
code_0040:
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			pushi    #cycleDone
			pushi    0
			self     4
code_004e:
			ret     
		)
	)
)

(class Talker of Prop
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
		bust 0
		eyes 0
		mouth 0
		ticks 0
		disposeWhenDone 1
		caller 0
	)
	
	(method (init param1 param2 param3 param4 param5 param6 param7 param8 &tmp temp0)
		(asm
			lap      argc
			bnt      code_0105
			lap      param1
			aTop     bust
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0105
			lap      param2
			aTop     eyes
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0105
			lap      param3
			aTop     mouth
			lsp      argc
			ldi      7
			ge?     
			bnt      code_0105
			lap      param7
			aTop     disposeWhenDone
			lsp      argc
			ldi      8
			ge?     
			bnt      code_0105
			lap      param8
			aTop     caller
code_0105:
			pushi    #show
			pushi    0
			self     4
			lsp      argc
			ldi      4
			ge?     
			bnt      code_0124
			pushi    #say
			pushi    5
			lsp      param4
			lsp      param5
			lsp      param6
			pTos     disposeWhenDone
			pTos     caller
			self     14
code_0124:
			ret     
		)
	)
	
	(method (doit)
		(asm
			lsg      global88
			pToa     ticks
			sub     
			push    
			ldi      0
			gt?     
			bnt      code_0589
			pushi    #dispose
			pushi    1
			pTos     disposeWhenDone
			self     6
			ret     
code_0589:
			pToa     underBits
			bnt      code_05a6
			pToa     eyes
			bnt      code_059a
			pushi    #cycle
			pushi    1
			push    
			self     6
code_059a:
			pToa     mouth
			bnt      code_05a6
			pushi    #cycle
			pushi    1
			push    
			self     6
code_05a6:
			ret     
		)
	)
	
	(method (dispose param1 &tmp temp0)
		(asm
			pushi    1
			lsg      global84
			callk    IsObject,  2
			bnt      code_064c
			pushi    #contains
			pushi    1
			pushSelf
			lag      global84
			send     6
			bnt      code_064c
			pushi    #delete
			pushi    1
			pushSelf
			lag      global84
			send     6
			pushi    #isEmpty
			pushi    0
			lag      global84
			send     4
			bnt      code_064c
			pushi    #dispose
			pushi    0
			lag      global84
			send     4
			ldi      0
			sag      global84
code_064c:
			lap      argc
			not     
			bt       code_0654
			lap      param1
code_0654:
			bnt      code_06b8
			pToa     mouth
			bnt      code_068f
			pushi    #cycler
			pushi    0
			send     4
			bnt      code_068f
			pushi    #respondsTo
			pushi    1
			pushi    141
			pushi    #cycler
			pushi    0
			pToa     mouth
			send     4
			send     6
			bnt      code_0686
			pushi    #cue
			pushi    0
			pushi    #cycler
			pushi    0
			pToa     mouth
			send     4
			send     4
code_0686:
			pushi    #setCycle
			pushi    1
			pushi    0
			pToa     mouth
			send     6
code_068f:
			lag      global83
			bnt      code_069d
			pushi    1
			pushi    3
			callk    DoAudio,  2
			jmp      code_06a7
code_069d:
			lag      global25
			bnt      code_06a7
			pushi    #dispose
			pushi    0
			send     4
code_06a7:
			pToa     eyes
			bnt      code_06b3
			pushi    #setCycle
			pushi    1
			pushi    0
			send     6
code_06b3:
			pushi    #hide
			pushi    0
			self     4
code_06b8:
			pToa     caller
			bnt      code_06cb
			sat      temp0
			ldi      0
			aTop     caller
			pushi    #cue
			pushi    0
			lat      temp0
			send     4
code_06cb:
			pushi    1
			pushSelf
			callk    DisposeClone,  2
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Prop,  6
			bnt      code_05b4
			ret     
code_05b4:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_05ea
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			and     
			bt       code_05ea
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_05fc
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_05ea:
			bnt      code_05fc
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #dispose
			pushi    1
			pTos     disposeWhenDone
			self     6
code_05fc:
			ret     
		)
	)
	
	(method (hide)
		(asm
			pushi    2
			pushi    8
			pTos     underBits
			callk    Graph,  4
			ldi      0
			aTop     underBits
			pushi    5
			pushi    13
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			callk    Graph,  10
			ret     
		)
	)
	
	(method (show &tmp temp0)
		(asm
			pTos     nsLeft
			pushi    4
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelWide,  6
			push    
			pushi    1
			pTos     bust
			callk    IsObject,  2
			bnt      code_0166
			pushi    #nsLeft
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     bust
			send     4
			push    
			callk    CelWide,  6
			add     
code_0166:
			push    
			pushi    1
			pTos     eyes
			callk    IsObject,  2
			bnt      code_0196
			pushi    #nsLeft
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     eyes
			send     4
			push    
			callk    CelWide,  6
			add     
code_0196:
			push    
			pushi    1
			pTos     mouth
			callk    IsObject,  2
			bnt      code_01c6
			pushi    #nsLeft
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     mouth
			send     4
			push    
			callk    CelWide,  6
			add     
code_01c6:
			push    
			calle    proc999_3,  8
			add     
			aTop     nsRight
			pTos     nsTop
			pushi    4
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelHigh,  6
			push    
			pushi    1
			pTos     bust
			callk    IsObject,  2
			bnt      code_020f
			pushi    #nsTop
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     bust
			send     4
			push    
			callk    CelHigh,  6
			add     
code_020f:
			push    
			pushi    1
			pTos     eyes
			callk    IsObject,  2
			bnt      code_023f
			pushi    #nsTop
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     eyes
			send     4
			push    
			callk    CelHigh,  6
			add     
code_023f:
			push    
			pushi    1
			pTos     mouth
			callk    IsObject,  2
			bnt      code_026f
			pushi    #nsTop
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     mouth
			send     4
			push    
			callk    CelHigh,  6
			add     
code_026f:
			push    
			calle    proc999_3,  8
			add     
			aTop     nsBottom
			pToa     underBits
			not     
			bnt      code_0291
			pushi    6
			pushi    7
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			pushi    1
			callk    Graph,  12
			aTop     underBits
code_0291:
			pushi    0
			callk    PicNotValid,  0
			sat      temp0
			pushi    1
			pushi    1
			callk    PicNotValid,  2
			pToa     bust
			bnt      code_02d6
			pushi    6
			pushi    #view
			pushi    0
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     bust
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     bust
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    #nsTop
			pushi    0
			pToa     bust
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    65535
			callk    DrawCel,  12
code_02d6:
			pToa     eyes
			bnt      code_0310
			pushi    6
			pushi    #view
			pushi    0
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     eyes
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     eyes
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    #nsTop
			pushi    0
			pToa     eyes
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    65535
			callk    DrawCel,  12
code_0310:
			pToa     mouth
			bnt      code_034a
			pushi    6
			pushi    #view
			pushi    0
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     mouth
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			pToa     mouth
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    #nsTop
			pushi    0
			pToa     mouth
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    65535
			callk    DrawCel,  12
code_034a:
			pushi    6
			pTos     view
			pTos     loop
			pTos     cel
			pTos     nsLeft
			pTos     nsTop
			pushi    65535
			callk    DrawCel,  12
			pushi    6
			pushi    12
			pTos     nsTop
			pTos     nsLeft
			pTos     nsBottom
			pTos     nsRight
			pushi    1
			callk    Graph,  12
			pushi    1
			lst      temp0
			callk    PicNotValid,  2
			ret     
		)
	)
	
	(method (say param1 param2 param3 param4 param5)
		(asm
			lsp      argc
			ldi      4
			ge?     
			bnt      code_038a
			lap      param4
			aTop     disposeWhenDone
			lsp      argc
			ldi      5
			ge?     
			bnt      code_038a
			lap      param5
			aTop     caller
code_038a:
			lag      global83
			bnt      code_039f
			pushi    #startAudio
			pushi    3
			lsp      param1
			lsp      param2
			lsp      param3
			self     10
			jmp      code_03ac
code_039f:
			pushi    #startText
			pushi    3
			lsp      param1
			lsp      param2
			lsp      param3
			self     10
code_03ac:
			lag      global84
			bnt      code_03ba
			pushi    #add
			pushi    1
			pushSelf
			send     6
			jmp      code_03d2
code_03ba:
			pushi    #new
			pushi    0
			class    EventHandler
			send     4
			sag      global84
			pushi    #name
			pushi    1
			lofsa    {fastCast}
			push    
			pushi    115
			pushi    1
			pushSelf
			lag      global84
			send     12
code_03d2:
			pTos     ticks
			ldi      60
			add     
			push    
			lag      global88
			add     
			aTop     ticks
			ret     
		)
	)
	
	(method (startAudio param1 &tmp temp0)
		(asm
			lap      param1
			sat      temp0
			pushi    2
			pushi    1
			push    
			callk    DoAudio,  4
			pToa     mouth
			bnt      code_045a
			pushi    #setCycle
			pushi    2
			class    40
			push    
			lst      temp0
			pToa     mouth
			send     8
code_045a:
			pushi    2
			pushi    2
			lst      temp0
			callk    DoAudio,  4
			aTop     ticks
			pToa     eyes
			bnt      code_0475
			pushi    #setCycle
			pushi    2
			class    RTRandCycle
			push    
			pTos     ticks
			pToa     eyes
			send     8
code_0475:
			ret     
		)
	)
	
	(method (startText param1 param2 &tmp [temp0 500])
		(asm
			lag      global25
			bnt      code_03eb
			pushi    #dispose
			pushi    0
			send     4
code_03eb:
			pushi    3
			lea      @temp0
			push    
			lsp      param1
			lsp      param2
			callk    Format,  6
			pushi    5
			pushi    1
			lea      @temp0
			push    
			callk    StrLen,  2
			mul     
			aTop     ticks
			pToa     mouth
			bnt      code_0417
			pushi    #setCycle
			pushi    2
			class    RTRandCycle
			push    
			pTos     ticks
			pToa     mouth
			send     8
code_0417:
			pToa     eyes
			bnt      code_0429
			pushi    #setCycle
			pushi    2
			class    RTRandCycle
			push    
			pTos     ticks
			pToa     eyes
			send     8
code_0429:
			pushi    5
			lea      @temp0
			push    
			pushi    67
			pTos     x
			pTos     y
			pushi    108
			calle    proc255_0,  10
			ret     
		)
	)
	
	(method (cycle param1 &tmp temp0)
		(asm
			lap      param1
			bnt      code_0574
			pushi    #cycler
			pushi    0
			send     4
			bnt      code_0574
			pushi    #cel
			pushi    0
			lap      param1
			send     4
			sat      temp0
			pushi    #doit
			pushi    0
			pushi    #cycler
			pushi    0
			lap      param1
			send     4
			send     4
			lst      temp0
			pushi    #cel
			pushi    0
			lap      param1
			send     4
			ne?     
			bnt      code_0574
			pushi    6
			pushi    #view
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #loop
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #cel
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    #nsTop
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    65535
			callk    DrawCel,  12
			pushi    12
			pushi    #superClass
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #loop
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #cel
			pushi    0
			lap      param1
			send     4
			push    
			callk    CelWide,  6
			add     
			push    
			lap      param1
			send     6
			pushi    11
			pushi    #superClass
			pushi    #nsTop
			pushi    0
			lap      param1
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #loop
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #cel
			pushi    0
			lap      param1
			send     4
			push    
			callk    CelHigh,  6
			add     
			push    
			lap      param1
			send     6
			pushi    6
			pushi    12
			pushi    #nsTop
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    #nsLeft
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    #nsBottom
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsTop
			add     
			push    
			pushi    #nsRight
			pushi    0
			lap      param1
			send     4
			push    
			pToa     nsLeft
			add     
			push    
			pushi    1
			callk    Graph,  12
code_0574:
			ret     
		)
	)
)
