;;; Sierra Script 1.0 - (do not remove this comment)
(script# 27)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n951)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	fMonk 0
	monkScript 1
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	[local8 4] = [1027 27 1]
	[local12 6] = [1027 1 2 1 2]
	[local18 4] = [1027 4 1]
	[local22 6] = [1027 11 2 1 2]
	[local28 5] = [1027 14 1 2]
	[local33 13] = [1027 17 1 2 1 2 1 2 2 2 1 2]
	[local46 4] = [1027 5 1]
	[local50 5] = [1027 6 1 2]
	[local55 5] = [1027 28 2 1]
	[local60 9] = [1027 30 1 2 2 1 2 2]
	[local69 4] = [1027 36 1]
	[local73 4] = [1027 38 1]
	[local77 5] = [1027 39 2 1]
	[local82 4] = [1027 41 1]
	[local86 5] = [1027 42 1 2]
	[local91 4] = [1027 37 1]
	[local95 5] = [1027 44 2 1]
	[local100 8] = [1027 46 1 2 3 1 2]
	[local108 7] = [1027 51 2 1 2 1]
	[local115 9] = [1027 55 3 1 2 1 1 1]
	[local124 8] = [1027 61 2 3 1 1 1]
	[local132 10] = [1027 66 4 1 2 3 2 1 4]
	[local142 4] = [1027 73 1]
	[local146 4] = [1027 74 1]
)
(instance fMonk of Actor
	(properties
		description 8166
		view 128
		signal $2000
	)
	
	(method (init)
		(asm
			pushi    #number
			pushi    1
			pushi    126
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_0036
			ldi      1
			sal      local2
code_0036:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_0048
			pushi    1
			pushi    133
			callb    proc0_6,  2
			jmp      code_004f
code_0048:
			pushi    1
			pushi    134
			callb    proc0_6,  2
code_004f:
			pushi    #init
			pushi    0
			lofsa    closePoly
			send     4
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bt       code_0076
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bt       code_0076
			pushi    #script
			pushi    0
			lag      global2
			send     4
code_0076:
			bnt      code_007c
			jmp      code_0190
code_007c:
			lal      local1
			not     
			bnt      code_00a3
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    closePoly
			send     6
			bnt      code_00a3
			ldi      1
			sal      local1
			pushi    #setScript
			pushi    1
			lofsa    getBack
			push    
			lag      global0
			send     6
			jmp      code_0190
code_00a3:
			lal      local2
			bnt      code_0105
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_00d7
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
			pTos     x
			pTos     y
			callk    GetAngle,  8
			push    
			ldi      170
			lt?     
			jmp      code_00f5
code_00d7:
			pushi    4
			pTos     x
			pTos     y
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      190
			gt?     
code_00f5:
			bnt      code_0105
			pushi    #setScript
			pushi    1
			lofsa    LRScript
			push    
			self     6
			jmp      code_0190
code_0105:
			lal      local2
			not     
			bnt      code_0168
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_013a
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
			pTos     x
			pTos     y
			callk    GetAngle,  8
			push    
			ldi      190
			gt?     
			jmp      code_0158
code_013a:
			pushi    4
			pTos     x
			pTos     y
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      170
			lt?     
code_0158:
			bnt      code_0168
			pushi    #setScript
			pushi    1
			lofsa    RLScript
			push    
			self     6
			jmp      code_0190
code_0168:
			lal      local3
			bnt      code_0190
			pushi    #inRect
			pushi    4
			pushi    20
			pushi    50
			pushi    300
			pushi    180
			lag      global0
			send     12
			not     
			bnt      code_0190
			pushi    #setScript
			pushi    1
			lofsa    comeBackLittleEgo
			push    
			lag      global0
			send     6
code_0190:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #notify
			pushi    0
			lag      global2
			send     4
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			self     12
			pushi    #weMeetAgain
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #contains
			pushi    1
			lofsa    closePoly
			push    
			lag      global32
			send     6
			bnt      code_02d6
			pushi    #dispose
			pushi    0
			lofsa    closePoly
			send     4
code_02d6:
			pushi    1
			pushi    39
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    1
			pushi    27
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_01ac
			pushi    2
			pushi    1027
			pushi    0
			calle    proc13_4,  4
			jmp      code_0292
code_01ac:
			dup     
			ldi      5
			eq?     
			bnt      code_020d
			pushi    #offRoad
			pushi    0
			class    Wat
			send     4
			bnt      code_01f9
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_01e5
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    3
			lea      @local12
			push    
			pushi    1
			pushi    11
			calle    proc851_0,  6
			jmp      code_0292
code_01e5:
			pushi    4
			pushi    1
			lea      @local18
			push    
			pushi    11
			pushi    3
			calle    proc851_0,  8
			jmp      code_0292
code_01f9:
			pushi    4
			pushi    1
			lea      @local46
			push    
			pushi    11
			pushi    3
			calle    proc851_0,  8
			jmp      code_0292
code_020d:
			dup     
			ldi      10
			eq?     
			bnt      code_0223
			pushi    #setScript
			pushi    1
			lofsa    drawBow
			push    
			lag      global0
			send     6
			jmp      code_0292
code_0223:
			dup     
			ldi      4
			eq?     
			bnt      code_0271
			lsp      param2
			ldi      0
			eq?     
			bnt      code_025c
			lal      local4
			bnt      code_0246
			pushi    3
			pushi    1027
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_0292
code_0246:
			ldi      1
			sal      local4
			pushi    3
			lea      @local50
			push    
			pushi    1
			pushi    11
			calle    proc851_0,  6
			jmp      code_0292
code_025c:
			pushi    #setMotion
			pushi    3
			class    PChase
			push    
			lofsa    fMonk
			push    
			pushi    20
			lag      global0
			send     10
			jmp      code_0292
code_0271:
			dup     
			ldi      3
			eq?     
			bnt      code_0287
			pushi    #setScript
			pushi    1
			lofsa    getBack
			push    
			lag      global0
			send     6
			jmp      code_0292
code_0287:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0292:
			toss    
			ret     
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_03b2
			lsp      param2
			ldi      1
			eq?     
			bnt      code_03b2
			lal      local3
			bnt      code_03a4
			pushi    3
			pushi    1027
			pushi    9
			pushi    0
			calle    proc13_4,  6
			jmp      code_03b0
code_03a4:
			pushi    #setScript
			pushi    1
			lofsa    getYerMen
			push    
			lag      global0
			send     6
code_03b0:
			ldi      1
code_03b2:
			ret     
		)
	)
)

(instance menActions of SpecialDoVerb
	(properties)
	
	(method (doVerb)
		(asm
			pushi    3
			pushi    1027
			pushi    10
			pushi    1
			calle    proc13_4,  6
			ldi      1
			ret     
		)
	)
)

(instance RLScript of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_0425
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    closePoly
			send     6
			bnt      code_0425
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
code_0425:
			pushi    #doit
			pushi    0
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
			bnt      code_04b3
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0483
			pushi    7
			pushi    1
			pushi    1
			pushi    #loop
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      2
			sub     
			push    
			lofsa    fMonk
			send     24
			jmp      code_04ac
code_0483:
			pushi    7
			pushi    1
			pushi    #superClass
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      1
			sub     
			push    
			lofsa    fMonk
			send     18
code_04ac:
			ldi      18
			aTop     ticks
			jmp      code_0527
code_04b3:
			dup     
			ldi      1
			eq?     
			bnt      code_0527
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_04f5
			pushi    7
			pushi    1
			pushi    #species
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      4
			add     
			push    
			lofsa    fMonk
			send     18
			jmp      code_051e
code_04f5:
			pushi    7
			pushi    1
			pushi    #species
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      2
			sub     
			push    
			lofsa    fMonk
			send     18
code_051e:
			ldi      1
			sal      local2
			pushi    #dispose
			pushi    0
			self     4
code_0527:
			toss    
			ret     
		)
	)
)

(instance LRScript of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_0589
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    closePoly
			send     6
			bnt      code_0589
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
code_0589:
			pushi    #doit
			pushi    0
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
			bnt      code_0607
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_05d7
			pushi    7
			pushi    1
			pushi    #superClass
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      7
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      4
			sub     
			push    
			lofsa    fMonk
			send     18
			jmp      code_0600
code_05d7:
			pushi    7
			pushi    1
			pushi    #superClass
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      2
			add     
			push    
			lofsa    fMonk
			send     18
code_0600:
			ldi      18
			aTop     ticks
			jmp      code_068b
code_0607:
			dup     
			ldi      1
			eq?     
			bnt      code_068b
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0659
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      5
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      2
			add     
			push    
			lofsa    fMonk
			send     24
			jmp      code_0682
code_0659:
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      1
			add     
			push    
			lofsa    fMonk
			send     18
code_0682:
			ldi      0
			sal      local2
			pushi    #dispose
			pushi    0
			self     4
code_068b:
			toss    
			ret     
		)
	)
)

(instance monkScript of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			super    TScript,  4
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
			bnt      code_079e
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_070f
			ldi      235
			sat      temp0
			ldi      50
			sat      temp1
			ldi      205
			sat      temp2
			ldi      70
			sat      temp3
			jmp      code_0721
code_070f:
			ldi      85
			sat      temp0
			ldi      160
			sat      temp1
			ldi      135
			sat      temp2
			ldi      125
			sat      temp3
code_0721:
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_0748
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_084d
code_0748:
			pushi    #contains
			pushi    1
			lofsa    fMonk
			push    
			lag      global5
			send     6
			not     
			bnt      code_075f
			pushi    #init
			pushi    0
			lofsa    fMonk
			send     4
code_075f:
			pushi    284
			pushi    2
			lst      temp0
			lst      temp1
			pushi    162
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_077f
			ldi      0
			jmp      code_0781
code_077f:
			ldi      2
code_0781:
			push    
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lst      temp2
			lst      temp3
			pushSelf
			lofsa    fMonk
			send     32
			jmp      code_084d
code_079e:
			dup     
			ldi      1
			eq?     
			bnt      code_07e0
			pushi    162
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_07bd
			ldi      4
			jmp      code_07bf
code_07bd:
			ldi      6
code_07bf:
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    60
			pushi    289
			pushi    1
			pushi    1
			lofsa    fMonk
			send     24
			pushi    0
			callb    proc0_2,  0
			ldi      18
			aTop     ticks
			jmp      code_084d
code_07e0:
			dup     
			ldi      2
			eq?     
			bnt      code_07fc
			pushi    5
			lea      @local22
			push    
			pushi    3
			pushi    11
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_084d
code_07fc:
			dup     
			ldi      3
			eq?     
			bnt      code_0817
			pushi    5
			lea      @local28
			push    
			pushi    1
			pushi    11
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_084d
code_0817:
			dup     
			ldi      4
			eq?     
			bnt      code_0831
			pushi    4
			lea      @local33
			push    
			pushi    2
			pushi    11
			pushSelf
			calle    proc851_0,  8
			jmp      code_084d
code_0831:
			dup     
			ldi      5
			eq?     
			bnt      code_084d
			pushi    0
			callb    proc0_4,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_084d:
			toss    
			ret     
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
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
			ldi      1
			eq?     
			bnt      code_08c2
			pushi    5
			pushi    1
			lea      @local8
			push    
			pushi    11
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_08de
code_08c2:
			dup     
			ldi      2
			eq?     
			bnt      code_08de
			pushi    0
			callb    proc0_4,  0
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_08de:
			toss    
			ret     
		)
	)
)

(instance comeBackLittleEgo of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_094b
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    5
			pushi    1
			lea      @local142
			push    
			pushi    11
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_09e7
code_094b:
			dup     
			ldi      1
			eq?     
			bnt      code_0961
			pushi    3
			lsg      global0
			lofsa    fMonk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_09e7
code_0961:
			dup     
			ldi      2
			eq?     
			bnt      code_096f
			ldi      12
			aTop     ticks
			jmp      code_09e7
code_096f:
			dup     
			ldi      3
			eq?     
			bnt      code_0989
			pushi    5
			pushi    1
			lea      @local146
			push    
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_09e7
code_0989:
			dup     
			ldi      4
			eq?     
			bnt      code_09d0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_09ad
			ldi      140
			jmp      code_09b0
code_09ad:
			ldi      205
code_09b0:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_09c5
			ldi      115
			jmp      code_09c7
code_09c5:
			ldi      75
code_09c7:
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_09e7
code_09d0:
			dup     
			ldi      5
			eq?     
			bnt      code_09e7
			ldi      1
			sal      local5
			pushi    #setScript
			pushi    1
			lofsa    drawBow
			push    
			pToa     client
			send     6
code_09e7:
			toss    
			ret     
		)
	)
)

(instance getBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a67
			pushi    0
			callb    proc0_3,  0
			lal      local1
			bnt      code_0a51
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    3
			lsg      global0
			lofsa    fMonk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0b14
code_0a51:
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lofsa    fMonk
			push    
			pushi    40
			pushSelf
			lag      global0
			send     12
			jmp      code_0b14
code_0a67:
			dup     
			ldi      1
			eq?     
			bnt      code_0a7f
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    fMonk
			send     6
			ldi      30
			aTop     ticks
			jmp      code_0b14
code_0a7f:
			dup     
			ldi      2
			eq?     
			bnt      code_0a9a
			pushi    5
			lea      @local55
			push    
			pushi    1
			pushi    11
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0b14
code_0a9a:
			dup     
			ldi      3
			eq?     
			bnt      code_0ada
			pushi    150
			pushi    1
			class    Rev
			push    
			pushi    162
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    closePoly
			send     6
			bnt      code_0acf
			ldi      65511
			jmp      code_0ad1
code_0acf:
			ldi      65524
code_0ad1:
			push    
			pushSelf
			lag      global0
			send     22
			jmp      code_0b14
code_0ada:
			dup     
			ldi      4
			eq?     
			bnt      code_0afa
			ldi      0
			sal      local1
			pushi    0
			callb    proc0_2,  0
			pushi    #setCel
			pushi    1
			pushi    0
			lofsa    fMonk
			send     6
			ldi      30
			aTop     ticks
			jmp      code_0b14
code_0afa:
			dup     
			ldi      5
			eq?     
			bnt      code_0b14
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0b14:
			toss    
			ret     
		)
	)
)

(instance drawBow of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #dispose
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
			bnt      code_0ba1
			pushi    3
			pushi    128
			pushi    4
			pushi    5
			calle    proc958_0,  6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    0
			callb    proc0_3,  0
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    3
			lsg      global0
			lofsa    fMonk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0c59
code_0ba1:
			dup     
			ldi      1
			eq?     
			bnt      code_0bc1
			pushi    #view
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_0c59
code_0bc1:
			dup     
			ldi      2
			eq?     
			bnt      code_0bfd
			pushi    #loop
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    5
			pushi    #superClass
			pushi    5
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushSelf
			lag      global0
			send     24
			jmp      code_0c59
code_0bfd:
			dup     
			ldi      3
			eq?     
			bnt      code_0c0b
			ldi      12
			aTop     ticks
			jmp      code_0c59
code_0c0b:
			dup     
			ldi      4
			eq?     
			bnt      code_0c25
			pushi    4
			lea      @local60
			push    
			pushi    2
			pushi    11
			pushSelf
			calle    proc851_0,  8
			jmp      code_0c59
code_0c25:
			dup     
			ldi      5
			eq?     
			bnt      code_0c59
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    0
			calle    proc851_1,  0
			bnt      code_0c4d
			pushi    #setScript
			pushi    1
			lofsa    staffFight
			push    
			pToa     client
			send     6
			jmp      code_0c59
code_0c4d:
			pushi    #setScript
			pushi    1
			lofsa    shootMonk
			push    
			pToa     client
			send     6
code_0c59:
			toss    
			ret     
		)
	)
)

(instance staffFight of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ccf
			pushi    #number
			pushi    1
			pushi    15
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			pushi    158
			pushi    1
			pushi    1
			lag      global113
			send     22
			pushi    5
			pushi    1
			lea      @local69
			push    
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1423
code_0ccf:
			dup     
			ldi      1
			eq?     
			bnt      code_0cff
			pushi    7
			pushi    128
			pushi    702
			pushi    703
			pushi    15
			pushi    122
			pushi    124
			pushi    167
			calle    proc958_0,  14
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1423
code_0cff:
			dup     
			ldi      2
			eq?     
			bnt      code_0d4a
			pushi    0
			callb    proc0_2,  0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0d27
			ldi      140
			jmp      code_0d2a
code_0d27:
			ldi      205
code_0d2a:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0d3f
			ldi      115
			jmp      code_0d41
code_0d3f:
			ldi      75
code_0d41:
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1423
code_0d4a:
			dup     
			ldi      3
			eq?     
			bnt      code_0d58
			ldi      12
			aTop     ticks
			jmp      code_1423
code_0d58:
			dup     
			ldi      4
			eq?     
			bnt      code_0d86
			lal      local3
			bnt      code_0d74
			pTos     state
			ldi      8
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1423
code_0d74:
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1423
code_0d86:
			dup     
			ldi      5
			eq?     
			bnt      code_0daf
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    4
			lea      @local77
			push    
			pushi    2
			pushi    11
			pushSelf
			calle    proc851_0,  8
			jmp      code_1423
code_0daf:
			dup     
			ldi      6
			eq?     
			bnt      code_0df6
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0dd3
			ldi      140
			jmp      code_0dd6
code_0dd3:
			ldi      205
code_0dd6:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0deb
			ldi      115
			jmp      code_0ded
code_0deb:
			ldi      75
code_0ded:
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1423
code_0df6:
			dup     
			ldi      7
			eq?     
			bnt      code_0e04
			ldi      12
			aTop     ticks
			jmp      code_1423
code_0e04:
			dup     
			ldi      8
			eq?     
			bnt      code_0e2e
			pushi    #stopUpd
			pushi    0
			lofsa    fMonk
			send     4
			pushi    #stopUpd
			pushi    0
			lag      global0
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1423
code_0e2e:
			dup     
			ldi      9
			eq?     
			bnt      code_0e96
			pushi    2
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    #actions
			pushi    1
			pushi    #new
			pushi    0
			lofsa    menActions
			send     4
			push    
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    #actions
			pushi    1
			pushi    #new
			pushi    0
			lofsa    menActions
			send     4
			push    
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     6
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    267
			pushi    1
			pushi    #new
			pushi    0
			lofsa    menActions
			send     4
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    90
			pushi    101
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     24
			jmp      code_1423
code_0e96:
			dup     
			ldi      10
			eq?     
			bnt      code_0eaf
			pushi    3
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1423
code_0eaf:
			dup     
			ldi      11
			eq?     
			bnt      code_0ebd
			ldi      12
			aTop     ticks
			jmp      code_1423
code_0ebd:
			dup     
			ldi      12
			eq?     
			bnt      code_0ed9
			pushi    5
			pushi    1
			lea      @local82
			push    
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1423
code_0ed9:
			dup     
			ldi      13
			eq?     
			bnt      code_0f07
			lal      local3
			bnt      code_0ef7
			pushi    3
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1423
code_0ef7:
			pTos     state
			ldi      1
			add     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1423
code_0f07:
			dup     
			ldi      14
			eq?     
			bnt      code_0f15
			ldi      12
			aTop     ticks
			jmp      code_1423
code_0f15:
			dup     
			ldi      15
			eq?     
			bnt      code_0f33
			pushi    7
			pushi    2
			lea      @local86
			push    
			pushi    1
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1423
code_0f33:
			dup     
			ldi      16
			eq?     
			bnt      code_0f4f
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    222
			pushi    117
			pushSelf
			lag      global0
			send     12
			jmp      code_1423
code_0f4f:
			dup     
			ldi      17
			eq?     
			bnt      code_0f65
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_1423
code_0f65:
			dup     
			ldi      18
			eq?     
			bnt      code_0ff3
			pushi    5
			pushi    1
			pushi    #lsBottom
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     40
			pushi    #view
			pushi    1
			pushi    15
			pushi    289
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    162
			pushi    1
			pushi    6
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			sal      local6
			send     52
			jmp      code_1423
code_0ff3:
			dup     
			ldi      19
			eq?     
			bnt      code_1011
			pushi    #addToPic
			pushi    0
			lal      local6
			send     4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1423
code_1011:
			dup     
			ldi      20
			eq?     
			bnt      code_104d
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    162
			pushi    1
			pushi    3
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lag      global0
			send     26
			jmp      code_1423
code_104d:
			dup     
			ldi      21
			eq?     
			bnt      code_10aa
			pushi    3
			pushi    2
			pushi    702
			pushi    703
			callb    proc0_2,  6
			pushi    #setHeading
			pushi    2
			pushi    0
			pushSelf
			lag      global0
			send     8
			pushi    5
			pushi    1
			pushi    #lsBottom
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    PicView
			send     4
			sal      local7
			send     38
			jmp      code_1423
code_10aa:
			dup     
			ldi      22
			eq?     
			bnt      code_10d0
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    131
			pushi    99
			pushSelf
			lag      global0
			send     12
			jmp      code_1423
code_10d0:
			dup     
			ldi      23
			eq?     
			bnt      code_1142
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			pushi    162
			pushi    1
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_111c
			ldi      0
			jmp      code_111e
code_111c:
			ldi      2
code_111e:
			push    
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    162
			pushi    97
			pushSelf
			lofsa    fMonk
			send     30
			jmp      code_1423
code_1142:
			dup     
			ldi      24
			eq?     
			bnt      code_115b
			pushi    #setHeading
			pushi    1
			pushi    180
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     6
			jmp      code_1423
code_115b:
			dup     
			ldi      25
			eq?     
			bnt      code_11ac
			pushi    #view
			pushi    1
			pushi    124
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lofsa    fMonk
			send     18
			pushi    #view
			pushi    1
			pushi    167
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     18
			pushi    #view
			pushi    1
			pushi    167
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     30
			jmp      code_1423
code_11ac:
			dup     
			ldi      26
			eq?     
			bnt      code_11d1
			pushi    #setCycle
			pushi    1
			class    End
			push    
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1423
code_11d1:
			dup     
			ldi      27
			eq?     
			bnt      code_11f9
			pushi    #view
			pushi    1
			pushi    122
			pushi    284
			pushi    2
			pushi    145
			pushi    100
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lag      global0
			send     26
			ldi      30
			aTop     ticks
			jmp      code_1423
code_11f9:
			dup     
			ldi      28
			eq?     
			bnt      code_12ce
			pushi    #dispose
			pushi    0
			pushi    #looper
			pushi    0
			lag      global0
			send     4
			send     4
			pushi    #hide
			pushi    0
			pushi    62
			pushi    1
			pushi    0
			lag      global0
			send     10
			pushi    #hide
			pushi    0
			lag      global109
			send     4
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
			pushi    #hide
			pushi    0
			pushi    285
			pushi    0
			lofsa    fMonk
			send     8
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #qFight
			pushi    1
			pushi    4660
			class    Wat
			send     6
			pushi    #dispose
			pushi    0
			lofsa    closePoly
			send     4
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     4
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     4
			pushi    #dispose
			pushi    0
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    #init
			pushi    0
			lofsa    catchAll
			send     4
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     10
			pushi    #release
			pushi    0
			lag      global113
			send     4
			pushi    #setScript
			pushi    2
			pushi    1
			pushi    11
			callk    ScriptID,  2
			push    
			pushSelf
			self     8
			jmp      code_1423
code_12ce:
			dup     
			ldi      29
			eq?     
			bnt      code_13a3
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_12e8
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
code_12e8:
			pushi    #init
			pushi    0
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     4
			pushi    #init
			pushi    0
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     4
			pushi    #init
			pushi    0
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    #dispose
			pushi    0
			lofsa    catchAll
			send     4
			pushi    #qFight
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_135f
			pushi    #view
			pushi    1
			pushi    124
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			lofsa    fMonk
			send     22
			pushi    #view
			pushi    1
			pushi    122
			pushi    284
			pushi    2
			pushi    145
			pushi    100
			pushi    6
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    6
			pushi    194
			pushi    0
			lag      global0
			send     30
			jmp      code_139f
code_135f:
			dup     
			ldi      2
			eq?     
			bnt      code_139f
			pushi    #view
			pushi    1
			pushi    124
			pushi    6
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    6
			pushi    194
			pushi    0
			lofsa    fMonk
			send     22
			pushi    #view
			pushi    1
			pushi    167
			pushi    284
			pushi    2
			pushi    131
			pushi    99
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    7
			pushi    194
			pushi    0
			lag      global0
			send     30
code_139f:
			toss    
			jmp      code_1423
code_13a3:
			dup     
			ldi      30
			eq?     
			bnt      code_13b1
			ldi      12
			aTop     ticks
			jmp      code_1423
code_13b1:
			dup     
			ldi      31
			eq?     
			bnt      code_13e9
			pushi    #startUpd
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #startUpd
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #startUpd
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    1
			pushi    11
			callk    DisposeScript,  2
			ldi      30
			aTop     ticks
			jmp      code_1423
code_13e9:
			dup     
			ldi      32
			eq?     
			bnt      code_1423
			pushi    #qFight
			pushi    0
			class    Wat
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_140f
			pushi    #setScript
			pushi    1
			lofsa    dieRobinDie
			push    
			pToa     client
			send     6
			jmp      code_1422
code_140f:
			dup     
			ldi      2
			eq?     
			bnt      code_1422
			pushi    #setScript
			pushi    1
			lofsa    dieMonkDie
			push    
			pToa     client
			send     6
code_1422:
			toss    
code_1423:
			toss    
			ret     
		)
	)
)

(instance dieRobinDie of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1480
			pushi    4
			lea      @local95
			push    
			pushi    13
			pushi    11
			pushSelf
			calle    proc851_0,  8
			jmp      code_14c9
code_1480:
			dup     
			ldi      1
			eq?     
			bnt      code_14c9
			ldi      0
			sag      global145
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_14c9:
			toss    
			ret     
		)
	)
)

(instance dieMonkDie of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1526
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    65535
			pushSelf
			lag      global0
			send     12
			jmp      code_173c
code_1526:
			dup     
			ldi      1
			eq?     
			bnt      code_1557
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Beg
			push    
			lag      global0
			send     12
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     14
			jmp      code_173c
code_1557:
			dup     
			ldi      2
			eq?     
			bnt      code_1571
			pushi    3
			pushi    1
			pushi    702
			pushi    703
			callb    proc0_2,  6
			ldi      30
			aTop     ticks
			jmp      code_173c
code_1571:
			dup     
			ldi      3
			eq?     
			bnt      code_15a5
			pushi    #number
			pushi    1
			pushi    128
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    9
			pushi    3
			lea      @local100
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    1
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_173c
code_15a5:
			dup     
			ldi      4
			eq?     
			bnt      code_15f9
			pushi    1
			pushi    147
			callb    proc0_6,  2
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      6
			sag      global126
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    #get
			pushi    2
			pushi    5
			pushi    6
			lag      global0
			send     8
			pushi    1
			pushi    5
			callb    proc0_2,  2
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      3
			aTop     seconds
			jmp      code_173c
code_15f9:
			dup     
			ldi      5
			eq?     
			bnt      code_168f
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #actions
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     10
			pushi    #actions
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     10
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    #setCursor
			pushi    2
			pushi    0
			pushi    1
			lag      global1
			send     8
			pushi    1
			pushi    1
			calle    proc121_0,  2
			pushi    #posn
			pushi    2
			pushi    200
			pushi    110
			pushi    6
			pushi    1
			pushi    1
			pushi    194
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     18
			pushi    #show
			pushi    0
			lag      global0
			send     4
			pushi    #show
			pushi    0
			lag      global109
			send     4
			ldi      24
			aTop     ticks
			jmp      code_173c
code_168f:
			dup     
			ldi      6
			eq?     
			bnt      code_16aa
			pushi    4
			lea      @local108
			push    
			pushi    8
			pushi    14
			pushSelf
			calle    proc851_0,  8
			jmp      code_173c
code_16aa:
			dup     
			ldi      7
			eq?     
			bnt      code_16d4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    340
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_173c
code_16d4:
			dup     
			ldi      8
			eq?     
			bnt      code_1708
			pushi    0
			calle    proc125_2,  0
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #actions
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     10
			ldi      2
			aTop     cycles
			jmp      code_173c
code_1708:
			dup     
			ldi      9
			eq?     
			bnt      code_173c
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    1
			lal      local5
			bnt      code_1726
			ldi      25
			jmp      code_1728
code_1726:
			ldi      100
code_1728:
			push    
			calle    proc806_1,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    fMonk
			send     4
code_173c:
			toss    
			ret     
		)
	)
)

(instance hereComesWill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1805
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    5
			pushi    128
			pushi    160
			pushi    161
			pushi    154
			pushi    155
			calle    proc958_0,  10
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
			pushi    161
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    240
			pushi    125
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     32
			pushi    #posn
			pushi    2
			pushi    335
			pushi    120
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
			pushi    270
			pushi    120
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     30
			jmp      code_1932
code_1805:
			dup     
			ldi      1
			eq?     
			bnt      code_1813
			ldi      12
			aTop     ticks
			jmp      code_1932
code_1813:
			dup     
			ldi      2
			eq?     
			bnt      code_182c
			pushi    3
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1932
code_182c:
			dup     
			ldi      3
			eq?     
			bnt      code_183a
			ldi      12
			aTop     ticks
			jmp      code_1932
code_183a:
			dup     
			ldi      4
			eq?     
			bnt      code_185c
			pushi    9
			pushi    3
			lea      @local115
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_1932
code_185c:
			dup     
			ldi      5
			eq?     
			bnt      code_186a
			ldi      45
			aTop     ticks
			jmp      code_1932
code_186a:
			dup     
			ldi      6
			eq?     
			bnt      code_18c1
			pushi    1
			pushi    147
			callb    proc0_6,  2
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      6
			sag      global126
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    #get
			pushi    2
			pushi    5
			pushi    6
			pushi    284
			pushi    2
			pushi    160
			pushi    90
			lag      global0
			send     16
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      3
			aTop     seconds
			jmp      code_1932
code_18c1:
			dup     
			ldi      7
			eq?     
			bnt      code_1911
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #show
			pushi    0
			lag      global0
			send     4
			pushi    0
			calle    proc125_2,  0
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      3
			aTop     cycles
			jmp      code_1932
code_1911:
			dup     
			ldi      8
			eq?     
			bnt      code_1932
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    fMonk
			send     4
code_1932:
			toss    
			ret     
		)
	)
)

(instance shootMonk of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #dispose
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
			bnt      code_199e
			pushi    5
			pushi    1
			lea      @local91
			push    
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1bc7
code_199e:
			dup     
			ldi      1
			eq?     
			bnt      code_19ca
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     6
			pushi    #distanceTo
			pushi    1
			lofsa    fMonk
			push    
			lag      global0
			send     6
			push    
			ldi      2
			div     
			aTop     ticks
			jmp      code_1bc7
code_19ca:
			dup     
			ldi      2
			eq?     
			bnt      code_1a0f
			pushi    #number
			pushi    1
			pushi    906
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lofsa    shootSound
			send     16
			pushi    162
			pushi    #superClass
			pushi    #loop
			pushi    0
			lofsa    fMonk
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    fMonk
			send     26
			jmp      code_1bc7
code_1a0f:
			dup     
			ldi      3
			eq?     
			bnt      code_1a46
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #number
			pushi    1
			pushi    907
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lofsa    fMonk
			push    
			pushi    30
			pushSelf
			lag      global0
			send     12
			jmp      code_1bc7
code_1a46:
			dup     
			ldi      4
			eq?     
			bnt      code_1a8c
			lal      local3
			bnt      code_1a6c
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lofsa    fMonk
			push    
			pushi    45
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_1a78
code_1a6c:
			pushi    #setScript
			pushi    1
			lofsa    hereComesWill
			push    
			pToa     client
			send     6
code_1a78:
			pushi    #number
			pushi    1
			pushi    127
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			jmp      code_1bc7
code_1a8c:
			dup     
			ldi      5
			eq?     
			bnt      code_1aae
			pushi    9
			pushi    3
			lea      @local124
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_1bc7
code_1aae:
			dup     
			ldi      6
			eq?     
			bnt      code_1b64
			pushi    1
			pushi    147
			callb    proc0_6,  2
			ldi      6
			sag      global126
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    #get
			pushi    2
			pushi    5
			pushi    6
			lag      global0
			send     8
			pushi    0
			calle    proc125_2,  0
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #dispose
			pushi    0
			pushi    #actions
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			send     4
			pushi    #actions
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     10
			pushi    #actions
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     10
			pushi    #actions
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     10
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			ldi      3
			aTop     seconds
			jmp      code_1bc7
code_1b64:
			dup     
			ldi      7
			eq?     
			bnt      code_1ba6
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			pushi    #posn
			pushi    2
			pushi    160
			pushi    90
			pushi    194
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			pushi    0
			calle    proc125_2,  0
			ldi      3
			aTop     cycles
			pushi    1
			pushi    0
			calle    proc806_6,  2
			jmp      code_1bc7
code_1ba6:
			dup     
			ldi      8
			eq?     
			bnt      code_1bc7
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    fMonk
			send     4
code_1bc7:
			toss    
			ret     
		)
	)
)

(instance getYerMen of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c2a
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1e00
code_1c2a:
			dup     
			ldi      1
			eq?     
			bnt      code_1c46
			pushi    5
			pushi    1
			lea      @local73
			push    
			pushi    11
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1e00
code_1c46:
			dup     
			ldi      2
			eq?     
			bnt      code_1c96
			pushi    #stopUpd
			pushi    0
			lofsa    fMonk
			send     4
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1c73
			ldi      140
			jmp      code_1c76
code_1c73:
			ldi      205
code_1c76:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1c8b
			ldi      115
			jmp      code_1c8d
code_1c8b:
			ldi      75
code_1c8d:
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1e00
code_1c96:
			dup     
			ldi      3
			eq?     
			bnt      code_1cac
			pushi    3
			lsg      global0
			lofsa    fMonk
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1e00
code_1cac:
			dup     
			ldi      4
			eq?     
			bnt      code_1cba
			ldi      12
			aTop     ticks
			jmp      code_1e00
code_1cba:
			dup     
			ldi      5
			eq?     
			bnt      code_1cdb
			pushi    #stopUpd
			pushi    0
			lag      global0
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1e00
code_1cdb:
			dup     
			ldi      6
			eq?     
			bnt      code_1d0c
			pushi    2
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    35
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     18
			jmp      code_1e00
code_1d0c:
			dup     
			ldi      7
			eq?     
			bnt      code_1d59
			pushi    #actions
			pushi    1
			pushi    #new
			pushi    0
			lofsa    menActions
			send     4
			push    
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     6
			pushi    #actions
			pushi    1
			pushi    #new
			pushi    0
			lofsa    menActions
			send     4
			push    
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     6
			pushi    #actions
			pushi    1
			pushi    #new
			pushi    0
			lofsa    menActions
			send     4
			push    
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1e00
code_1d59:
			dup     
			ldi      8
			eq?     
			bnt      code_1d7e
			pushi    11
			pushi    4
			lea      @local132
			push    
			pushi    1
			pushi    0
			pushi    11
			pushi    3
			pushi    14
			pushi    1
			pushi    13
			pushi    2
			pushSelf
			calle    proc851_0,  22
			jmp      code_1e00
code_1d7e:
			dup     
			ldi      9
			eq?     
			bnt      code_1d9d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    90
			pushi    101
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_1e00
code_1d9d:
			dup     
			ldi      10
			eq?     
			bnt      code_1db6
			pushi    3
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1e00
code_1db6:
			dup     
			ldi      11
			eq?     
			bnt      code_1e00
			ldi      1
			sal      local3
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    73
			pushi    107
			pushi    65
			pushi    96
			pushi    103
			pushi    96
			dup     
			pushi    107
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1e00:
			toss    
			ret     
		)
	)
)

(instance closePoly of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1e76
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    319
			pushi    42
			pushi    318
			pushi    63
			pushi    194
			pushi    94
			pushi    0
			pushi    34
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			jmp      code_1ea7
code_1e76:
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    0
			pushi    104
			pushi    86
			pushi    104
			pushi    151
			pushi    94
			pushi    210
			pushi    126
			pushi    205
			pushi    152
			pushi    0
			pushi    147
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
code_1ea7:
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			pushi    #onMe
			pushi    1
			pushSelf
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     6
			bnt      code_1ed5
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			pushi    2
			pushi    120
			pushi    3
			callk    ScriptID,  4
			send     6
			jmp      code_1f0d
code_1ed5:
			pushi    #onMe
			pushi    1
			pushSelf
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     6
			bnt      code_1efc
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			pushi    2
			pushi    120
			pushi    4
			callk    ScriptID,  4
			send     6
			jmp      code_1f0d
code_1efc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			pushi    2
			pushi    120
			pushi    2
			callk    ScriptID,  4
			send     6
code_1f0d:
			ret     
		)
	)
)

(instance catchAll of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb)
		(asm
			ldi      1
			ret     
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 900
	)
)
