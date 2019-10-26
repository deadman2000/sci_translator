;;; Sierra Script 1.0 - (do not remove this comment)
(script# 125)
(include sci.sh)
(use n000)
(use n958)
(use n961)
(use n992)
(use n994)
(use n995)
(use n999)

(public
	Wat 0
	merryMenEntrance 1
	proc125_2 2
	putStuff 3
)

(procedure (proc125_2)
	(asm
		pushi    #weMeetAgain
		pushi    1
		pushi    0
		pushi    555
		pushi    1
		pushi    0
		pushi    564
		pushi    1
		pushi    0
		pushi    565
		pushi    1
		pushi    0
		pushi    566
		pushi    1
		pushi    0
		pushi    567
		pushi    1
		pushi    0
		pushi    142
		pushi    1
		pushi    0
		class    Wat
		send     42
		ret     
	)
)

(class Wat of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		weMeetAgain 0
		offRoad 0
		secondSearch 0
		charFirstTalk 0
		qFight 0
		gaveManBucks 0
		offeredEmerald 0
		hurry 0
		blewHorn 0
		womanStatus 0
		poachStatus 0
		section 4
		whichChar 0
		charObj 0
		travelDir 0
		travelSect 4
		theTimer 0
		enterDir 0
	)
	
	(method (init)
		(asm
			lofsa    travelTimer
			aTop     theTimer
			lsg      global12
			ldi      220
			eq?     
			bnt      code_0034
			lsg      global112
			ldi      240
			and     
			push    
			ldi      16
			div     
			aTop     section
code_0034:
			pushi    #init
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0083
			pushi    1
			pushi    44
			callb    proc0_5,  2
			bnt      code_0083
			pushi    1
			pushi    75
			callb    proc0_5,  2
			not     
			bnt      code_0083
			pushi    1
			pushi    173
			callb    proc0_5,  2
			not     
			bnt      code_0083
			pushi    1
			pushi    103
			callb    proc0_6,  2
code_0083:
			lsg      global130
			ldi      4
			eq?     
			bnt      code_00b1
			pushi    1
			pushi    47
			callb    proc0_5,  2
			bnt      code_00b1
			pushi    1
			pushi    153
			callb    proc0_5,  2
			not     
			bnt      code_00b1
			pushi    1
			pushi    174
			callb    proc0_5,  2
			not     
			bnt      code_00b1
			pushi    1
			pushi    184
			callb    proc0_6,  2
code_00b1:
			lsg      global130
			ldi      8
			eq?     
			bnt      code_00d4
			pushi    1
			pushi    135
			callb    proc0_5,  2
			bnt      code_00d4
			pushi    1
			pushi    57
			callb    proc0_5,  2
			not     
			bnt      code_00d4
			pushi    1
			pushi    191
			callb    proc0_6,  2
code_00d4:
			pushi    #dispose
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    4
			lsp      newRoomNumber
			pushi    110
			pushi    120
			pushi    100
			calle    proc999_5,  8
			not     
			bnt      code_0056
			pushi    #keep
			pushi    1
			pushi    0
			self     6
code_0056:
			ret     
		)
	)
)

(instance putStuff of Code
	(properties)
	
	(method (doit param1 &tmp temp0)
		(asm
			pushi    #indexOf
			pushi    1
			lsp      param1
			lag      global9
			send     6
			sat      temp0
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			lap      param1
			send     6
			bnt      code_026b
			pushi    #owner
			pushi    0
			lap      param1
			send     4
			push    
			lag      global0
			eq?     
			bnt      code_026b
			lsg      global126
			ldi      1
			eq?     
			bnt      code_01d6
			pushi    4
			lst      temp0
			pushi    0
			pushi    3
			pushi    15
			calle    proc999_5,  8
			not     
code_01d6:
			bt       code_025b
			lsg      global126
			ldi      2
			eq?     
			bnt      code_01f8
			pushi    8
			lst      temp0
			pushi    0
			pushi    2
			pushi    14
			pushi    10
			pushi    18
			pushi    8
			pushi    7
			calle    proc999_5,  16
			not     
code_01f8:
			bt       code_025b
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0211
			pushi    3
			lst      temp0
			pushi    0
			pushi    17
			calle    proc999_5,  6
			not     
code_0211:
			bt       code_025b
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0235
			pushi    9
			lst      temp0
			pushi    0
			pushi    2
			pushi    11
			pushi    14
			pushi    12
			pushi    10
			pushi    13
			pushi    18
			calle    proc999_5,  18
			not     
code_0235:
			bt       code_025b
			lsg      global126
			ldi      6
			eq?     
			bnt      code_026b
			pushi    10
			lst      temp0
			pushi    0
			pushi    2
			pushi    14
			pushi    10
			pushi    5
			pushi    6
			pushi    17
			pushi    16
			pushi    18
			calle    proc999_5,  20
			not     
code_025b:
			bnt      code_026b
			pushi    #put
			pushi    2
			lst      temp0
			pushi    140
			lag      global0
			send     8
code_026b:
			ret     
		)
	)
)

(instance travelTimer of Script
	(properties)
	
	(method (init param1)
		(asm
			pushi    #hurry
			pushi    0
			class    Wat
			send     4
			bnt      code_029c
			ldi      5
			jmp      code_029e
code_029c:
			ldi      10
code_029e:
			aTop     seconds
			pushi    #init
			pushi    0
			&rest    param1
			super    Script,  4
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
			bnt      code_02ba
			ldi      0
			jmp      code_038f
code_02ba:
			dup     
			ldi      1
			eq?     
			bnt      code_030b
			pushi    567
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_02e3
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			sub     
			jmp      code_02ef
code_02e3:
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
code_02ef:
			push    
			class    Wat
			send     6
			pushi    #hurry
			pushi    0
			class    Wat
			send     4
			bnt      code_0304
			ldi      5
			jmp      code_0306
code_0304:
			ldi      10
code_0306:
			aTop     seconds
			jmp      code_038f
code_030b:
			dup     
			ldi      2
			eq?     
			bnt      code_038f
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			le?     
			bt       code_032d
			pushi    #travelSect
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			ge?     
code_032d:
			bnt      code_0382
			pushi    0
			call     localproc_016c,  0
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_035e
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_0379
			pushi    1
			pushi    45
			callb    proc0_5,  2
			bnt      code_0379
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			jmp      code_0379
code_035e:
			dup     
			ldi      4
			eq?     
			bnt      code_0379
			pushi    1
			pushi    48
			callb    proc0_5,  2
			bnt      code_0379
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_0379:
			toss    
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_038f
code_0382:
			pTos     state
			ldi      2
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_038f:
			toss    
			ret     
		)
	)
)

(instance merryMenEntrance of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_049c
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    10
			pushi    128
			pushi    160
			pushi    161
			pushi    162
			pushi    151
			pushi    152
			pushi    153
			pushi    154
			pushi    155
			pushi    156
			calle    proc958_0,  20
			pushi    #ignoreHorizon
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    265
			pushi    65534
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    185
			pushi    30
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     38
			pushi    #posn
			pushi    2
			pushi    65526
			pushi    75
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    152
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    95
			pushi    70
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     30
			pushi    #posn
			pushi    2
			pushi    330
			pushi    125
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    155
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    240
			pushi    125
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     30
			jmp      code_04ec
code_049c:
			dup     
			ldi      1
			eq?     
			bnt      code_04bc
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    185
			pushi    50
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_04ec
code_04bc:
			dup     
			ldi      2
			eq?     
			bnt      code_04ec
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_04ec:
			toss    
			ret     
		)
	)
)
