;;; Sierra Script 1.0 - (do not remove this comment)
(script# 11)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n255)
(use n858)
(use n958)
(use n989)
(use n992)
(use n999)

(public
	monkFight 0
	overlayDisposer 1
)

(local
	local0
	local1
	local2
	local3
	[local4 64] = [40 27 8 8 0 0 0 0 30 16 7 47 0 0 0 0 18 23 33 8 0 0 0 0 16 29 20 4 0 0 0 0 100 100 100 100 42 32 20 21 100 100 100 100 30 19 26 31 100 100 100 100 10 10 35 23 100 100 100 100 10 50 10 5]
)
(procedure (localproc_0012 param1 &tmp [temp0 200])
	(asm
		lal      local0
		bnt      code_002c
		pushi    1
		lea      @temp0
		push    
		&rest    param1
		callk    Format,  2
		pushi    1
		lea      @temp0
		push    
		calle    proc13_1,  2
code_002c:
		ret     
	)
)

(procedure (localproc_002d param1 param2)
	(asm
		pushi    2
		pushi    24
		pushi    2
		pushi    36
		lag      global87
		mul     
		push    
		lsg      global125
		dup     
		ldi      1
		eq?     
		bnt      code_0045
		ldi      1
		jmp      code_0066
code_0045:
		dup     
		ldi      2
		eq?     
		bnt      code_0051
		ldi      0
		jmp      code_0066
code_0051:
		dup     
		ldi      3
		eq?     
		bnt      code_005d
		ldi      6
		jmp      code_0066
code_005d:
		dup     
		ldi      4
		eq?     
		bnt      code_0066
		ldi      12
code_0066:
		toss    
		add     
		push    
		lsp      param1
		ldi      6
		mul     
		push    
		lsp      param2
		lofsa    rob
		eq?     
		bnt      code_007d
		ldi      30
		jmp      code_00b0
code_007d:
		pushi    32
		lsg      global125
		dup     
		ldi      1
		eq?     
		bnt      code_008d
		ldi      0
		jmp      code_00ae
code_008d:
		dup     
		ldi      2
		eq?     
		bnt      code_0099
		ldi      25
		jmp      code_00ae
code_0099:
		dup     
		ldi      3
		eq?     
		bnt      code_00a5
		ldi      25
		jmp      code_00ae
code_00a5:
		dup     
		ldi      4
		eq?     
		bnt      code_00ae
		ldi      32
code_00ae:
		toss    
		sub     
code_00b0:
		mul     
		push    
		calle    proc999_2,  4
		push    
		calle    proc999_3,  4
		ret     
	)
)

(instance defenseOddsCode of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    #success
			pushi    2
			lsp      param2
			lsp      param1
			pushi    #fight
			pushi    0
			pushi    #client
			pushi    0
			lap      param1
			send     4
			send     4
			send     8
			neg     
			ret     
		)
	)
)

(instance attackOddsCode of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    #client
			pushi    0
			pushi    #target
			pushi    0
			lap      param1
			send     4
			send     4
			push    
			pushi    #client
			pushi    0
			lap      param1
			send     4
			ne?     
			bnt      code_012a
			pushi    #success
			pushi    2
			lsp      param1
			lsp      param2
			pushi    #fight
			pushi    0
			pushi    #client
			pushi    0
			lap      param1
			send     4
			send     4
			send     8
code_012a:
			ret     
		)
	)
)

(instance attackStrengthCode of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #_strength
			pushi    0
			lap      param1
			send     4
			ret     
		)
	)
)

(instance RandForward of Fwd
	(properties)
	
	(method (nextCel param1 &tmp temp0 temp1)
		(asm
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			sat      temp0
			pushi    #nextCel
			pushi    0
			&rest    param1
			super    Fwd,  4
			sat      temp1
			push    
			lat      temp0
			ne?     
			bnt      code_01a5
			pushi    2
			pushi    1
			pushi    100
			callk    Random,  4
			push    
			ldi      60
			le?     
			bnt      code_01a5
			lat      temp0
			sat      temp1
code_01a5:
			lat      temp1
			ret     
		)
	)
)

(instance qsp of Script
	(properties)
	
	(method (init param1)
		(asm
			lap      argc
			bt       code_01e0
			pushi    #script
			pushi    0
			pToa     client
			send     4
			not     
code_01e0:
			bnt      code_01eb
			pushi    #init
			pushi    0
			&rest    param1
			super    Script,  4
code_01eb:
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pTos     seconds
			pToa     cycles
			eq?     
			bnt      code_0213
			pprev   
			pToa     ticks
			eq?     
			bnt      code_0213
			pprev   
			pushi    #technique
			pushi    0
			pToa     client
			send     4
			eq?     
			bnt      code_0213
			pprev   
			ldi      0
			eq?     
			bnt      code_0213
			ldi      1
			aTop     ticks
code_0213:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03ab
			ldi      0
			aTop     ticks
			aTop     cycles
			pushi    #_technique
			pushi    0
			pToa     client
			send     4
			sat      temp3
			pushi    #opponent
			pushi    0
			pToa     client
			send     4
			sat      temp0
			bnt      code_024d
			pushi    #_technique
			pushi    0
			send     4
code_024d:
			sat      temp1
			bnt      code_0258
			pushi    #target
			pushi    0
			send     4
code_0258:
			sat      temp2
			pushi    #_technique
			pushi    0
			pToa     client
			send     4
			bnt      code_0268
			jmp      code_039e
code_0268:
			lat      temp2
			not     
			bt       code_0279
			pushi    #state
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      0
			le?     
code_0279:
			bnt      code_034b
			lsg      global125
			ldi      4
			eq?     
			bnt      code_02bb
			pushi    #parriedCycles
			pushi    0
			lat      temp0
			send     4
			bt       code_0297
			pushi    #ticks
			pushi    0
			lat      temp0
			send     4
code_0297:
			bnt      code_02bb
			pushi    #maxElement
			pushi    1
			lofsa    attackStrengthCode
			push    
			pushi    #techniques
			pushi    0
			pToa     client
			send     4
			send     6
			sat      temp3
			pushi    #technique
			pushi    2
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_039e
code_02bb:
			pushi    #parriedCycles
			pushi    0
			lat      temp0
			send     4
			bt       code_02d8
			pushi    2
			pushi    0
			pushi    100
			callk    Random,  4
			push    
			pushi    100
			lag      global125
			mul     
			push    
			ldi      4
			div     
			le?     
code_02d8:
			bnt      code_039e
code_02db:
			ldi      1
			bnt      code_032c
			pushi    67
			pushi    #superClass
			pushi    2
			pushi    0
			pushi    #size
			pushi    0
			pushi    #techniques
			pushi    0
			pToa     client
			send     4
			send     4
			push    
			ldi      1
			sub     
			push    
			callk    Random,  4
			push    
			pushi    #techniques
			pushi    0
			pToa     client
			send     4
			send     6
			sat      temp3
			pushi    3
			pushi    11
			pushi    0
			pushi    #name
			pushi    0
			send     4
			push    
			call     localproc_0012,  6
			pTos     client
			pushi    #client
			pushi    0
			pushi    #target
			pushi    0
			lat      temp3
			send     4
			send     4
			ne?     
			bt       code_032c
			jmp      code_02db
code_032c:
			pushi    3
			pushi    11
			pushi    1
			pushi    #name
			pushi    0
			lat      temp3
			send     4
			push    
			call     localproc_0012,  6
			pushi    #technique
			pushi    2
			lst      temp3
			pushSelf
			pToa     client
			send     8
			jmp      code_039e
code_034b:
			lat      temp2
			bnt      code_039e
			pTos     client
			pushi    #client
			pushi    0
			send     4
			eq?     
			bnt      code_037e
			pushi    #maxElement
			pushi    2
			lofsa    defenseOddsCode
			push    
			lst      temp1
			pushi    #techniques
			pushi    0
			pToa     client
			send     4
			send     8
			sat      temp3
			pushi    #technique
			pushi    2
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_039e
code_037e:
			pushi    #maxElement
			pushi    2
			lofsa    attackOddsCode
			push    
			lst      temp1
			pushi    #techniques
			pushi    0
			pToa     client
			send     4
			send     8
			sat      temp3
			pushi    #technique
			pushi    2
			push    
			pushSelf
			pToa     client
			send     8
code_039e:
			lat      temp3
			not     
			bnt      code_03cd
			ldi      1
			aTop     ticks
			jmp      code_03cd
code_03ab:
			dup     
			ldi      1
			eq?     
			bnt      code_03c1
			pushi    6
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			mul     
			aTop     ticks
			jmp      code_03cd
code_03c1:
			dup     
			ldi      2
			eq?     
			bnt      code_03cd
			pushi    #init
			pushi    0
			self     4
code_03cd:
			toss    
			ret     
		)
	)
)

(class qsPart of Part
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
	
	(method (onMe param1 &tmp temp0 temp1 temp2)
		(asm
			pushi    #x
			pushi    0
			pToa     client
			send     4
			sat      temp1
			pushi    #x
			pushi    0
			pushi    #opponent
			pushi    0
			pToa     client
			send     4
			send     4
			sat      temp2
			lst      temp1
			add     
			push    
			ldi      2
			div     
			sat      temp0
			lst      temp1
			lat      temp2
			le?     
			bnt      code_0451
			pushi    #nsLeft
			pushi    0
			pToa     client
			send     4
			push    
			ldi      10
			sub     
			aTop     nsLeft
			lat      temp0
			aTop     nsRight
			jmp      code_0462
code_0451:
			lat      temp0
			aTop     nsLeft
			pushi    #nsRight
			pushi    0
			pToa     client
			send     4
			push    
			ldi      10
			add     
			aTop     nsRight
code_0462:
			pushi    #onMe
			pushi    0
			&rest    param1
			super    Part,  4
			ret     
		)
	)
	
	(method (strength param1 &tmp temp0)
		(asm
			lap      argc
			not     
			bnt      code_04b0
			pTos     client
			lofsa    monk
			eq?     
			bnt      code_04b0
			lsg      global125
			dup     
			ldi      1
			eq?     
			bnt      code_048b
			ldi      0
			jmp      code_04ac
code_048b:
			dup     
			ldi      2
			eq?     
			bnt      code_0497
			ldi      25
			jmp      code_04ac
code_0497:
			dup     
			ldi      3
			eq?     
			bnt      code_04a3
			ldi      25
			jmp      code_04ac
code_04a3:
			dup     
			ldi      4
			eq?     
			bnt      code_04ac
			ldi      32
code_04ac:
			toss    
			jmp      code_04b2
code_04b0:
			ldi      32
code_04b2:
			sat      temp0
			push    
			pushi    #strength
			pushi    0
			&rest    param1
			super    Part,  4
			mul     
			push    
			ldi      32
			div     
			ret     
		)
	)
)

(class QSFighter of Fighter
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
		cycleSpeed 9
		script 0
		cycler 0
		timer 0
		detailLevel 0
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 9
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
	
	(method (init param1)
		(asm
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    289
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			self     16
			pushi    #init
			pushi    0
			&rest    param1
			super    Fighter,  4
			ret     
		)
	)
	
	(method (setCycle theCycler sendParams &tmp temp0)
		(asm
			lap      argc
			bnt      code_0561
			lap      theCycler
code_0561:
			sat      temp0
			pToa     cycler
			bnt      code_057f
			pushi    #caller
			pushi    0
			send     4
			bnt      code_057f
			pushi    #cue
			pushi    0
			pushi    #caller
			pushi    0
			pToa     cycler
			send     4
			send     4
code_057f:
			pushi    #setCycle
			pushi    1
			lst      temp0
			&rest    sendParams
			super    Fighter,  6
			ret     
		)
	)
	
	(method (agonize param1 param2)
		(asm
			pToa     _technique
			bnt      code_0597
			pushi    #technique
			pushi    1
			pushi    0
			self     6
code_0597:
			pTos     _strength
			ldi      0
			le?     
			bt       code_05ab
			pushi    #strength
			pushi    0
			lap      param2
			send     4
			push    
			ldi      0
			le?     
code_05ab:
			bnt      code_05c0
			pushi    #setScript
			pushi    1
			pushi    1
			lofsa    getKilled
			push    
			callk    Clone,  2
			push    
			self     6
			jmp      code_05d5
code_05c0:
			pToa     script
			not     
			bnt      code_05d5
			pushi    #setScript
			pushi    1
			pushi    1
			lofsa    getHit
			push    
			callk    Clone,  2
			push    
			self     6
code_05d5:
			pushi    3
			pTos     parriedCycles
			pTos     ticks
			pushi    2
			pushi    #strength
			pushi    0
			lap      param1
			send     4
			push    
			pushSelf
			call     localproc_002d,  4
			push    
			calle    proc999_3,  6
			aTop     ticks
			pTos     ticks
			ldi      3
			mul     
			aTop     ticks
			ldi      0
			aTop     parriedCycles
			ret     
		)
	)
	
	(method (inflict param1 param2 &tmp temp0 temp1)
		(asm
			pushi    #script
			pushi    0
			pToa     opponent
			send     4
			bt       code_0617
			pushi    #inflict
			pushi    1
			lsp      param1
			&rest    param2
			super    Fighter,  6
code_0617:
			sat      temp0
			pToa     parriedCycles
			bnt      code_0627
			pushi    2
			push    
			pushSelf
			call     localproc_002d,  4
			aTop     parriedCycles
code_0627:
			lal      local3
			bnt      code_0631
			pushi    #dispose
			pushi    0
			send     4
code_0631:
			pushi    #loop
			pushi    0
			pToa     opponent
			send     4
			sat      temp1
			pushSelf
			pushi    #client
			pushi    0
			pushi    #target
			pushi    0
			lap      param1
			send     4
			send     4
			eq?     
			bnt      code_0653
			ldi      0
			sal      local3
			jmp      code_06b5
code_0653:
			lat      temp0
			bnt      code_0665
			pushi    #play
			pushi    0
			lofsa    thudAndGroanSound
			sal      local3
			send     4
			jmp      code_06b5
code_0665:
			pTos     loop
			ldi      2
			eq?     
			bnt      code_0672
			lst      temp1
			ldi      6
			eq?     
code_0672:
			bt       code_0682
			pTos     loop
			ldi      4
			eq?     
			bnt      code_0692
			lst      temp1
			ldi      8
			eq?     
code_0682:
			bnt      code_0692
			pushi    #play
			pushi    0
			lofsa    swishSound
			sal      local3
			send     4
			jmp      code_06b5
code_0692:
			pushi    #technique
			pushi    0
			pToa     opponent
			send     4
			not     
			bnt      code_06ab
			pushi    #play
			pushi    0
			lofsa    thudSound
			sal      local3
			send     4
			jmp      code_06b5
code_06ab:
			pushi    #play
			pushi    0
			lofsa    woodHitsWoodSound
			sal      local3
			send     4
code_06b5:
			ret     
		)
	)
)

(instance thudAndGroanSound of Sound
	(properties
		flags $0001
		number 935
	)
)

(instance thudSound of Sound
	(properties
		flags $0001
		number 588
	)
)

(instance swishSound of Sound
	(properties
		flags $0001
		number 934
	)
)

(instance woodHitsWoodSound of Sound
	(properties
		flags $0001
		number 122
	)
)

(instance overlayDisposer of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0905
			pushi    #dispose
			pushi    0
			lofsa    thudAndGroanSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    thudSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    swishSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    woodHitsWoodSound
			send     4
			pushi    #cue
			pushi    0
			pToa     caller
			send     4
			pushi    #dispose
			pushi    0
			lofsa    rob
			send     4
			pushi    #dispose
			pushi    0
			lofsa    monk
			send     4
			ldi      1
			aTop     ticks
			jmp      code_0920
code_0905:
			dup     
			ldi      1
			eq?     
			bnt      code_0920
			pushi    3
			pushi    0
			pushi    858
			pushi    893
			calle    proc958_0,  6
			pushi    #dispose
			pushi    0
			self     4
code_0920:
			toss    
			ret     
		)
	)
)

(instance monkFight of Fight
	(properties)
	
	(method (init param1 param2 &tmp temp0)
		(asm
			lap      argc
			bnt      code_0a2e
			lag      global77
			sal      local2
			ldi      0
			sag      global77
			pushi    #addToFront
			pushi    1
			lofsa    rob
			push    
			lag      global73
			send     6
			pushi    #addToFront
			pushi    1
			lofsa    rob
			push    
			lag      global74
			send     6
			pushi    #addToFront
			pushi    1
			lofsa    rob
			push    
			lag      global72
			send     6
code_0a2e:
			lag      global125
			sal      local1
			pushi    #success
			pushi    1
			pushi    36
			pushi    226
			pushi    1
			lofsa    monkBody
			push    
			lofsa    robMidHit
			send     12
			pushi    #success
			pushi    1
			pushi    23
			pushi    226
			pushi    1
			lofsa    monkHead
			push    
			lofsa    robHighHit
			send     12
			pushi    #success
			pushi    1
			pushi    52
			pushi    226
			pushi    1
			lofsa    monkLegs
			push    
			lofsa    robLowHit
			send     12
			pushi    #success
			pushi    1
			pushi    11
			pushi    226
			pushi    1
			lofsa    monkOverHead
			push    
			lofsa    robOverHit
			send     12
			pushi    #setTarget
			pushi    1
			lofsa    robBody
			push    
			lofsa    robMidBlk
			send     6
			pushi    #setTarget
			pushi    1
			lofsa    robOverHead
			push    
			lofsa    robHighBlk
			send     6
			pushi    #setTarget
			pushi    1
			lofsa    robHead
			push    
			lofsa    robDuck
			send     6
			pushi    #setTarget
			pushi    1
			lofsa    robLegs
			push    
			lofsa    robJump
			send     6
			pushi    #x
			pushi    1
			pushi    145
			pushi    3
			pushi    1
			pushi    100
			lofsa    rob
			send     12
			pushi    #success
			pushi    1
			pushi    36
			pushi    226
			pushi    1
			lofsa    robBody
			push    
			lofsa    monkMidHit
			send     12
			pushi    #success
			pushi    1
			pushi    23
			pushi    226
			pushi    1
			lofsa    robHead
			push    
			lofsa    monkHighHit
			send     12
			pushi    #success
			pushi    1
			pushi    52
			pushi    226
			pushi    1
			lofsa    robLegs
			push    
			lofsa    monkLowHit
			send     12
			pushi    #success
			pushi    1
			pushi    11
			pushi    226
			pushi    1
			lofsa    robOverHead
			push    
			lofsa    monkOverHit
			send     12
			pushi    #setTarget
			pushi    1
			lofsa    monkBody
			push    
			lofsa    monkMidBlk
			send     6
			pushi    #setTarget
			pushi    1
			lofsa    monkOverHead
			push    
			lofsa    monkHighBlk
			send     6
			pushi    #setTarget
			pushi    1
			lofsa    monkHead
			push    
			lofsa    monkDuck
			send     6
			pushi    #setTarget
			pushi    1
			lofsa    monkLegs
			push    
			lofsa    monkJump
			send     6
			pushi    #x
			pushi    1
			pushi    162
			pushi    3
			pushi    1
			pushi    97
			lofsa    monk
			send     12
			lap      argc
			bnt      code_0b71
			pushi    #init
			pushi    4
			lsp      param1
			lofsa    rob
			push    
			lofsa    monk
			push    
			lea      @local4
			push    
			&rest    param2
			super    Fight,  12
			jmp      code_0b77
code_0b71:
			pushi    #init
			pushi    0
			super    Fight,  4
code_0b77:
			pushi    #eachElementDo
			pushi    2
			pushi    594
			pushi    30
			pushi    #parts
			pushi    0
			lofsa    rob
			send     4
			send     8
			pushi    116
			pushi    2
			pushi    594
			lsg      global125
			dup     
			ldi      1
			eq?     
			bnt      code_0b9e
			ldi      0
			jmp      code_0bbf
code_0b9e:
			dup     
			ldi      2
			eq?     
			bnt      code_0baa
			ldi      25
			jmp      code_0bbf
code_0baa:
			dup     
			ldi      3
			eq?     
			bnt      code_0bb6
			ldi      25
			jmp      code_0bbf
code_0bb6:
			dup     
			ldi      4
			eq?     
			bnt      code_0bbf
			ldi      32
code_0bbf:
			toss    
			push    
			pushi    #parts
			pushi    0
			lofsa    monk
			send     4
			send     8
			pushi    582
			pushi    1
			pushi    #at
			pushi    #_strength
			pushi    0
			lofsa    robBody
			send     4
			mul     
			push    
			ldi      100
			div     
			push    
			lofsa    rob
			send     6
			pushi    582
			pushi    1
			lsg      global125
			dup     
			ldi      1
			eq?     
			bnt      code_0bf8
			ldi      100
			jmp      code_0c19
code_0bf8:
			dup     
			ldi      2
			eq?     
			bnt      code_0c04
			ldi      45
			jmp      code_0c19
code_0c04:
			dup     
			ldi      3
			eq?     
			bnt      code_0c10
			ldi      61
			jmp      code_0c19
code_0c10:
			dup     
			ldi      4
			eq?     
			bnt      code_0c19
			ldi      88
code_0c19:
			toss    
			push    
			pushi    #_strength
			pushi    0
			lofsa    monkBody
			send     4
			mul     
			push    
			ldi      100
			div     
			push    
			lofsa    monk
			send     6
			lsg      global125
			ldi      1
			eq?     
			bnt      code_0c47
			pushi    #setScript
			pushi    1
			lofsa    cheatWin
			push    
			lofsa    rob
			send     6
			jmp      code_0c54
code_0c47:
			pushi    #plan
			pushi    1
			lofsa    qsp
			push    
			lofsa    monk
			send     6
code_0c54:
			pushi    187
			pushi    #x
			pushi    10
			pushi    1
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      53
			sub     
			push    
			lag      global1
			send     12
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			lsg      global125
			lal      local1
			ne?     
			bnt      code_0987
			pushi    #loop
			pushi    0
			lofsa    rob
			send     4
			push    
			ldi      10
			ne?     
			bnt      code_0987
			pushi    #loop
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      10
			ne?     
			bnt      code_0987
			pushi    #init
			pushi    0
			self     4
code_0987:
			lag      global125
			sal      local1
			pushi    #doit
			pushi    0
			&rest    param1
			super    Fight,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local2
			sag      global77
			pushi    #delete
			pushi    1
			lofsa    rob
			push    
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			lofsa    rob
			push    
			lag      global74
			send     6
			pushi    #delete
			pushi    1
			lofsa    rob
			push    
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			super    Fight,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09d1
			jmp      code_09fc
code_09d1:
			dup     
			ldi      1
			eq?     
			bnt      code_09df
			ldi      1
			aTop     ticks
			jmp      code_09fc
code_09df:
			dup     
			ldi      2
			eq?     
			bnt      code_09fc
			pToa     caller
			sat      temp0
			ldi      0
			aTop     caller
			pushi    #setScript
			pushi    2
			lofsa    overlayDisposer
			push    
			lst      temp0
			pToa     client
			send     8
code_09fc:
			toss    
			ret     
		)
	)
)

(instance cheatWin of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ce1
			pushi    #technique
			pushi    2
			lofsa    robOverHit
			push    
			pushSelf
			lofsa    rob
			send     8
			jmp      code_0cf7
code_0ce1:
			dup     
			ldi      1
			eq?     
			bnt      code_0ceb
			jmp      code_0cf7
code_0ceb:
			dup     
			ldi      2
			eq?     
			bnt      code_0cf7
			pushi    #dispose
			pushi    0
			self     4
code_0cf7:
			toss    
			ret     
		)
	)
)

(instance rob of QSFighter
	(properties
		view 122
	)
	
	(method (init param1 &tmp temp0)
		(asm
			pTos     _parts
			ldi      0
			eq?     
			sat      temp0
			bnt      code_0f05
			pushi    #ignoreActors
			pushi    0
			pushi    583
			pushi    4
			lofsa    robOverHead
			push    
			lofsa    robHead
			push    
			lofsa    robBody
			push    
			lofsa    robLegs
			push    
			pushi    584
			pushi    8
			lofsa    robMidBlk
			push    
			lofsa    robHighBlk
			push    
			lofsa    robDuck
			push    
			lofsa    robJump
			push    
			lofsa    robMidHit
			push    
			lofsa    robLowHit
			push    
			lofsa    robHighHit
			push    
			lofsa    robOverHit
			push    
			self     36
code_0f05:
			pushi    #loop
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    1
			lofsa    RandForward
			push    
			callk    Clone,  2
			push    
			self     12
			pushi    #name
			pushi    1
			lofsa    {robTechs}
			push    
			pToa     _techniques
			send     6
			pushi    #name
			pushi    1
			lofsa    {robParts}
			push    
			pushi    116
			pushi    2
			pushi    594
			pushi    30
			pToa     _parts
			send     14
			pushi    #init
			pushi    0
			&rest    param1
			super    QSFighter,  4
			ret     
		)
	)
	
	(method (doit param1 &tmp temp0 temp1)
		(asm
			pToa     _technique
			bt       code_0e52
			pToa     cycler
			bt       code_0e52
			pTos     _strength
			ldi      0
			le?     
code_0e52:
			not     
			bnt      code_0e69
			pushi    #loop
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    1
			lofsa    RandForward
			push    
			callk    Clone,  2
			push    
			self     12
code_0e69:
			pushi    #doit
			pushi    0
			&rest    param1
			super    QSFighter,  4
			pToa     ticks
			bt       code_0e86
			pToa     parriedCycles
			bt       code_0e86
			pToa     _technique
			bnt      code_0e86
			pushi    #ticks
			pushi    0
			send     4
code_0e86:
			sat      temp0
			not     
			bnt      code_0ea1
			lsg      global19
			lag      global21
			eq?     
			bnt      code_0ea1
			pushi    #setCursor
			pushi    1
			pushi    10
			lag      global1
			send     6
			jmp      code_0eb8
code_0ea1:
			pToa     parriedCycles
			bnt      code_0eb8
			lsg      global19
			lag      global21
			ne?     
			bnt      code_0eb8
			pushi    #setCursor
			pushi    1
			lsg      global21
			lag      global1
			send     6
code_0eb8:
			ret     
		)
	)
	
	(method (handleEvent pEvent param2 &tmp temp0)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0d91
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0d91
			lal      local0
			not     
			sal      local0
			jmp      code_0e40
code_0d91:
			pToa     ticks
			bt       code_0d98
			pToa     parriedCycles
code_0d98:
			not     
			bnt      code_0e35
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      64
			eq?     
			bnt      code_0db5
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      0
			eq?     
code_0db5:
			bt       code_0df2
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0dd1
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      53
			eq?     
code_0dd1:
			bt       code_0df2
			lsg      global125
			ldi      2
			eq?     
			bnt      code_0e35
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_0e35
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
code_0df2:
			bnt      code_0e35
			pushi    #technique
			pushi    0
			pToa     opponent
			send     4
			sat      temp0
			bnt      code_0e35
			pushSelf
			pushi    #client
			pushi    0
			pushi    #target
			pushi    0
			send     4
			send     4
			eq?     
			bnt      code_0e35
			pushi    #maxElement
			pushi    2
			lofsa    defenseOddsCode
			push    
			lst      temp0
			pToa     _techniques
			send     8
			sat      temp0
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #technique
			pushi    1
			lst      temp0
			self     6
			jmp      code_0e40
code_0e35:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    QSFighter,  6
code_0e40:
			ret     
		)
	)
	
	(method (inflict param1 &tmp temp0)
		(asm
			pushi    #inflict
			pushi    0
			&rest    param1
			super    QSFighter,  4
			sat      temp0
			pToa     script
			bnt      code_0d68
			lsg      global125
			ldi      1
			eq?     
			bnt      code_0d68
			pushi    #script
			pushi    0
			pToa     opponent
			send     4
			not     
			bnt      code_0d68
			pushi    #setScript
			pushi    2
			lofsa    getKilled
			push    
			pTos     script
			pToa     opponent
			send     8
code_0d68:
			lat      temp0
			ret     
		)
	)
)

(instance getKilled of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1034
			pushi    0
			callb    proc0_3,  0
			pushi    #delete
			pushi    1
			lofsa    rob
			push    
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			lofsa    rob
			push    
			lag      global74
			send     6
			pushi    #delete
			pushi    1
			lofsa    rob
			push    
			lag      global72
			send     6
			pushi    #_strength
			pushi    1
			pushi    0
			lofsa    rob
			send     6
			pushi    #_strength
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			ldi      1
			aTop     ticks
			jmp      code_10b9
code_1034:
			dup     
			ldi      1
			eq?     
			bnt      code_1064
			pushi    #plan
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			pushi    #technique
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    10
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     26
			jmp      code_10b9
code_1064:
			dup     
			ldi      2
			eq?     
			bnt      code_108b
			pushi    #technique
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    #opponent
			pushi    0
			pToa     client
			send     4
			send     18
			ldi      60
			aTop     ticks
			jmp      code_10b9
code_108b:
			dup     
			ldi      3
			eq?     
			bnt      code_10b9
			pushi    556
			pushi    1
			pTos     client
			lofsa    rob
			eq?     
			bnt      code_10a4
			ldi      1
			jmp      code_10a6
code_10a4:
			ldi      2
code_10a6:
			push    
			class    Wat
			send     6
			pushi    #cue
			pushi    0
			lofsa    monkFight
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_10b9:
			toss    
			ret     
		)
	)
)

(instance getHit of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #ticks
			pushi    1
			pTos     register
			pToa     client
			send     6
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_113f
			pushi    0
			callb    proc0_3,  0
			pushi    #ticks
			pushi    0
			pToa     client
			send     4
			aTop     register
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pToa     client
			send     12
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			aTop     ticks
			jmp      code_1230
code_113f:
			dup     
			ldi      1
			eq?     
			bnt      code_1160
			pushi    #setLoop
			pushi    1
			pushi    9
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_1230
code_1160:
			dup     
			ldi      2
			eq?     
			bnt      code_1173
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			aTop     ticks
			jmp      code_1230
code_1173:
			dup     
			ldi      3
			eq?     
			bnt      code_11a7
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    1
			lofsa    RandForward
			push    
			callk    Clone,  2
			push    
			pToa     client
			send     18
			pushi    #setCursor
			pushi    1
			pushi    10
			lag      global1
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1230
code_11a7:
			dup     
			ldi      4
			eq?     
			bnt      code_1230
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
			pushi    4
			pushi    11
			pushi    2
			pTos     name
			pTos     state
			calle    proc255_4,  8
code_1230:
			toss    
			ret     
		)
	)
)

(instance attackElsewhere of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    #onMe
			pushi    1
			lsp      param2
			lap      param1
			send     6
			not     
			bnt      code_1295
			pushi    #firstTrue
			pushi    2
			pushi    196
			lsp      param1
			pushi    #parts
			pushi    0
			pushi    #client
			pushi    0
			lap      param2
			send     4
			send     4
			send     8
code_1295:
			ret     
		)
	)
)

(instance robOverHead of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    30
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			aTop     nsTop
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance robHead of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			aTop     nsTop
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      3
			div     
			add     
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance robBody of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      3
			div     
			add     
			aTop     nsTop
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      2
			mul     
			push    
			ldi      3
			div     
			add     
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance robLegs of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      2
			mul     
			push    
			ldi      3
			div     
			add     
			aTop     nsTop
			pushi    30
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			add     
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(class QSTechnique of Technique
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
	
	(method (dispose param1)
		(asm
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_1523
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    1
			lofsa    RandForward
			push    
			callk    Clone,  2
			push    
			pToa     client
			send     18
code_1523:
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Technique,  4
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1615
			pushi    1
			pushi    #client
			pushi    0
			pToa     target
			send     4
			push    
			pToa     client
			ne?     
			bnt      code_15fb
			pushi    #delay
			pushi    0
			self     4
			push    
			pushi    2
			pushi    #ticks
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #parriedCycles
			pushi    0
			pToa     client
			send     4
			push    
			calle    proc999_3,  4
			add     
			jmp      code_1603
code_15fb:
			pushi    #parriedCycles
			pushi    0
			pToa     client
			send     4
code_1603:
			mul     
			aTop     ticks
			pToa     ticks
			not     
			bnt      code_16ba
			pushi    #cue
			pushi    0
			self     4
			jmp      code_16ba
code_1615:
			dup     
			ldi      1
			eq?     
			bnt      code_1639
			pushi    #cel
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pTos     loop
			pushi    588
			pushi    1
			pushSelf
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     26
			jmp      code_16ba
code_1639:
			dup     
			ldi      2
			eq?     
			bnt      code_166f
			ldi      1
			aTop     completed
			pushi    #inflict
			pushi    1
			pushSelf
			pToa     client
			send     6
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			aTop     register
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			push    
			pushi    3
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			sub     
			mul     
			aTop     ticks
			jmp      code_16ba
code_166f:
			dup     
			ldi      3
			eq?     
			bnt      code_169b
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			pToa     register
			eq?     
			bnt      code_1693
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_16ba
code_1693:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_16ba
code_169b:
			dup     
			ldi      4
			eq?     
			bnt      code_16ae
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			aTop     ticks
			jmp      code_16ba
code_16ae:
			dup     
			ldi      5
			eq?     
			bnt      code_16ba
			pushi    #dispose
			pushi    0
			self     4
code_16ba:
			toss    
			pushi    9
			pushi    11
			pushi    3
			pTos     name
			lsp      newState
			pTos     loop
			pushi    #name
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			bnt      code_16fa
			pushi    #name
			pushi    0
			pushi    #cycler
			pushi    0
			pToa     client
			send     4
			send     4
			jmp      code_16fd
code_16fa:
			lofsa    {none}
code_16fd:
			push    
			call     localproc_0012,  18
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			pushi    #ticks
			pushi    0
			pToa     client
			send     4
			bnt      code_15b2
			pushi    #client
			pushi    0
			pToa     target
			send     4
			push    
			pToa     client
			ne?     
			bnt      code_15b2
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_15bb
code_15b2:
			pushi    #cue
			pushi    0
			&rest    param1
			super    Technique,  4
code_15bb:
			ret     
		)
	)
	
	(method (success param1)
		(asm
			pushi    2
			pushi    100
			pushi    #success
			pushi    0
			&rest    param1
			super    Technique,  4
			push    
			pushi    100
			lap      argc
			bt       code_14c8
			pTos     client
			lofsa    rob
			eq?     
code_14c8:
			not     
			bnt      code_14f0
			lsg      global125
			dup     
			ldi      2
			eq?     
			bnt      code_14da
			ldi      65534
			jmp      code_14ef
code_14da:
			dup     
			ldi      3
			eq?     
			bnt      code_14e6
			ldi      3
			jmp      code_14ef
code_14e6:
			dup     
			ldi      4
			eq?     
			bnt      code_14ef
			ldi      10
code_14ef:
			toss    
code_14f0:
			add     
			mul     
			push    
			ldi      100
			div     
			push    
			calle    proc999_2,  4
			ret     
		)
	)
	
	(method (strength param1)
		(asm
			lap      argc
			not     
			bnt      code_1587
			lsg      global125
			ldi      1
			eq?     
			bnt      code_1587
			pushi    #plan
			pushi    0
			pToa     client
			send     4
			bnt      code_1587
			ldi      0
			jmp      code_1590
code_1587:
			pushi    #strength
			pushi    0
			&rest    param1
			super    Technique,  4
code_1590:
			ret     
		)
	)
	
	(method (delay param1)
		(asm
			lap      argc
			bnt      code_153d
			pushi    #delay
			pushi    0
			&rest    param1
			super    Technique,  4
			jmp      code_1568
code_153d:
			pTos     client
			pushi    #client
			pushi    0
			pToa     target
			send     4
			eq?     
			bnt      code_154f
			ldi      0
			jmp      code_1568
code_154f:
			pushi    #idleCycles
			pushi    0
			pToa     client
			send     4
			push    
			pToa     _delay
			lt?     
			bnt      code_1563
			pToa     _delay
			jmp      code_1568
code_1563:
			pTos     _delay
			ldi      2
			div     
code_1568:
			ret     
		)
	)
)

(instance robOverHit of QSTechnique
	(properties
		key 56
		dir 1
		loop 1
		_strength 6
		_delay 24
		_success 11
	)
)

(instance robHighHit of QSTechnique
	(properties
		key 57
		dir 2
		loop 2
		_strength 4
		_delay 18
		_success 23
	)
)

(instance robMidHit of QSTechnique
	(properties
		key 54
		dir 3
		loop 3
		_strength 3
		_delay 12
		_success 36
	)
)

(instance robLowHit of QSTechnique
	(properties
		key 51
		dir 4
		loop 4
		_strength 2
		_delay 6
		_success 52
	)
)

(instance robHighBlk of QSTechnique
	(properties
		key 50
		dir 5
		loop 5
	)
)

(instance robDuck of QSTechnique
	(properties
		key 55
		dir 8
		loop 6
	)
)

(instance robMidBlk of QSTechnique
	(properties
		key 52
		dir 7
		loop 7
	)
)

(instance robJump of QSTechnique
	(properties
		key 49
		dir 6
		loop 8
	)
)

(instance monk of QSFighter
	(properties
		view 124
	)
	
	(method (init param1 &tmp temp0)
		(asm
			pTos     _parts
			ldi      0
			eq?     
			sat      temp0
			bnt      code_1a52
			pushi    #ignoreActors
			pushi    0
			pushi    583
			pushi    4
			lofsa    monkOverHead
			push    
			lofsa    monkHead
			push    
			lofsa    monkBody
			push    
			lofsa    monkLegs
			push    
			pushi    584
			pushi    8
			lofsa    monkMidHit
			push    
			lofsa    monkLowHit
			push    
			lofsa    monkHighHit
			push    
			lofsa    monkOverHit
			push    
			lofsa    monkMidBlk
			push    
			lofsa    monkHighBlk
			push    
			lofsa    monkDuck
			push    
			lofsa    monkJump
			push    
			self     36
code_1a52:
			pushi    #loop
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    1
			lofsa    RandForward
			push    
			callk    Clone,  2
			push    
			self     12
			pushi    #name
			pushi    1
			lofsa    {monkParts}
			push    
			pToa     _parts
			send     6
			pushi    #name
			pushi    1
			lofsa    {monkTechs}
			push    
			pToa     _techniques
			send     6
			lat      temp0
			bnt      code_1a88
			pushi    #init
			pushi    0
			&rest    param1
			super    QSFighter,  4
code_1a88:
			ret     
		)
	)
	
	(method (suffer param1 param2)
		(asm
			pTos     loop
			ldi      6
			eq?     
			bnt      code_1aa8
			pushi    #loop
			pushi    0
			pToa     opponent
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_1aa8
			pushi    #loop
			pushi    1
			pushi    3
			pToa     opponent
			send     6
code_1aa8:
			pushi    #suffer
			pushi    1
			lsp      param1
			&rest    param2
			super    QSFighter,  6
			ret     
		)
	)
	
	(method (inflict param1)
		(asm
			lsg      global125
			ldi      1
			ne?     
			bnt      code_1a05
			pushi    #inflict
			pushi    0
			&rest    param1
			super    QSFighter,  4
code_1a05:
			ret     
		)
	)
)

(instance monkOverHead of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    30
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			aTop     nsTop
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance monkHead of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			aTop     nsTop
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      3
			div     
			add     
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance monkBody of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      3
			div     
			add     
			aTop     nsTop
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      2
			mul     
			push    
			ldi      3
			div     
			add     
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance monkLegs of qsPart
	(properties)
	
	(method (onMe param1)
		(asm
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nsTop
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			ldi      2
			mul     
			push    
			ldi      3
			div     
			add     
			aTop     nsTop
			pushi    30
			pushi    #nsBottom
			pushi    0
			pToa     client
			send     4
			add     
			aTop     nsBottom
			pushi    #onMe
			pushi    0
			&rest    param1
			super    qsPart,  4
			ret     
		)
	)
)

(instance monkOverHit of QSTechnique
	(properties
		loop 1
		_strength 6
		_delay 24
		_success 11
	)
)

(instance monkHighHit of QSTechnique
	(properties
		loop 2
		_strength 4
		_delay 18
		_success 23
	)
)

(instance monkMidHit of QSTechnique
	(properties
		loop 3
		_strength 3
		_delay 12
		_success 36
	)
)

(instance monkLowHit of QSTechnique
	(properties
		loop 4
		_strength 2
		_delay 6
		_success 52
	)
)

(instance monkHighBlk of QSTechnique
	(properties
		loop 5
	)
)

(instance monkDuck of QSTechnique
	(properties
		loop 6
	)
)

(instance monkMidBlk of QSTechnique
	(properties
		loop 7
	)
)

(instance monkJump of QSTechnique
	(properties
		loop 8
	)
)
