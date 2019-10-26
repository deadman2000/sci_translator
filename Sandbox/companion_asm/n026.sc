;;; Sierra Script 1.0 - (do not remove this comment)
(script# 26)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n951)
(use n958)
(use n969)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	jew 0
	jewScript 1
)

(local
	[local0 9] = [-1 6170 15]
	[local9 9] = [135 0 2 4 14 36 14 27 15]
	local18 =  10
	local19
	local20
	local21
	local22
	local23
	local24
	local25
	[local26 10] = [1026 0 1 2 1 2 1 2 2]
	[local36 4] = [1026 7 1]
	[local40 5] = [1026 10 2 1]
	[local45 7] = [1026 12 1 2 1 2]
	[local52 7] = [1026 16 1 2 1 2]
	[local59 5] = [1026 20 1 2]
	[local64 5] = [1026 22 1 2]
	[local69 14] = [1026 24 1 2 1 2 2 1 2 2 1 2 2]
	[local83 6] = [1026 35 1 2 2]
	[local89 6] = [1026 38 1 2 2]
	[local95 7] = [1026 41 2 2 1 2]
	[local102 5] = [1026 45 1 2]
	[local107 5] = [1026 47 1 2]
	[local112 5] = [1026 49 1 2]
	[local117 4] = [1026 51 1]
	[local121 5] = [1026 52 1 2]
	[local126 4] = [1026 54 1]
	[local130 4] = [1026 71 1]
	[local134 7] = [1026 72 1 2 1 2]
	[local141 8] = [1026 55 1 2 1 2 1]
	[local149 9] = [1026 60 2 2 1 2 1 2]
	[local158 4] = [1026 66 1]
	[local162 4] = [1026 67 1]
	[local166 5] = [1026 68 2 1]
	[local171 4] = [1026 70 1]
	[local175 5] = [1026 77 1 2]
	[local180 6] = [1026 79 1 2 1]
	[local186 13] = [1026 82 1 1 1 2 2 1 2 1 2 1]
	[local199 9] = [1026 92 2 2 1 2 1 1]
	[local208 4] = [1026 98 1]
	[local212 6] = [1026 99 2 2 1]
	[local218 9] = [1026 102 1 2 2 2 1 2]
	[local227 6] = [1026 108 1 2 1]
	[local233 11] = [1026 111 1 2 2 2 1 1 2 1]
	[local244 6] = [1026 119 2 1 2]
	[local250 6] = [1026 122 1 2 1]
	[local256 5] = [1026 125 1 2]
	[local261 6] = [1026 127 1 1 2]
	[local267 7] = [1026 130 1 2 1 2]
	[local274 9] = [1026 134 1 2 1 1 2 1]
	[local283 12] = [1026 140 2 2 1 2 2 1 1 3 3]
)
(procedure (localproc_0012)
	(asm
		lal      local22
		bnt      code_002d
		pushi    4
		pushi    1
		lea      @local36
		push    
		lea      @local9
		push    
		pushi    3
		calle    proc851_0,  8
		jmp      code_0042
code_002d:
		ldi      1
		sal      local22
		pushi    3
		lea      @local26
		push    
		pushi    1
		lea      @local9
		push    
		calle    proc851_0,  6
code_0042:
		ret     
	)
)

(instance jew of Actor
	(properties
		description 6182
		view 134
		signal $2800
	)
	
	(method (init)
		(asm
			pushi    #number
			pushi    1
			pushi    125
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
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
			sat      temp1
			pushi    1
			push    
			pToa     heading
			sub     
			push    
			callk    Abs,  2
			sat      temp0
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_00b2
			pushi    #script
			pushi    0
			class    Wat
			send     4
			not     
			bnt      code_00b2
			pushi    #setScript
			pushi    1
			pushi    #theTimer
			pushi    0
			class    Wat
			send     4
			push    
			class    Wat
			send     6
			jmp      code_017a
code_00b2:
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_00e3
			+al      local20
			push    
			ldi      5
			ge?     
			bnt      code_017a
			ldi      1
			sal      local20
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    3
			lea      @local40
			push    
			pushi    3
			lea      @local9
			push    
			calle    proc851_0,  6
			jmp      code_017a
code_00e3:
			lal      local18
			not     
			bnt      code_0173
			pToa     mover
			not     
			bnt      code_0173
			pTos     loop
			ldi      4
			eq?     
			bnt      code_0173
			lst      temp0
			ldi      30
			gt?     
			bnt      code_0173
			lst      temp1
			ldi      338
			ge?     
			bnt      code_010d
			ldi      3
			jmp      code_016e
code_010d:
			lst      temp1
			ldi      293
			ge?     
			bnt      code_011b
			ldi      7
			jmp      code_016e
code_011b:
			lst      temp1
			ldi      248
			ge?     
			bnt      code_0129
			ldi      1
			jmp      code_016e
code_0129:
			lst      temp1
			ldi      203
			ge?     
			bnt      code_0137
			ldi      5
			jmp      code_016e
code_0137:
			lst      temp1
			ldi      158
			ge?     
			bnt      code_0145
			ldi      2
			jmp      code_016e
code_0145:
			lst      temp1
			ldi      113
			ge?     
			bnt      code_0152
			ldi      4
			jmp      code_016e
code_0152:
			lst      temp1
			ldi      68
			ge?     
			bnt      code_015f
			ldi      0
			jmp      code_016e
code_015f:
			lst      temp1
			ldi      23
			ge?     
			bnt      code_016c
			ldi      6
			jmp      code_016e
code_016c:
			ldi      3
code_016e:
			aTop     cel
			jmp      code_017a
code_0173:
			lal      local18
			bnt      code_017a
			-al      local18
code_017a:
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
			pushi    552
			pushi    #superClass
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			add     
			push    
			class    Wat
			send     6
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    1
			pushi    26
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
			bnt      code_0197
			pushi    2
			pushi    1026
			pushi    8
			calle    proc13_4,  4
			jmp      code_0250
code_0197:
			dup     
			ldi      5
			eq?     
			bnt      code_01d5
			pushi    #charFirstTalk
			pushi    0
			class    Wat
			send     4
			bnt      code_01bd
			pushi    3
			lea      @local64
			push    
			pushi    1
			lea      @local9
			push    
			calle    proc851_0,  6
			jmp      code_0250
code_01bd:
			pushi    #charFirstTalk
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #setScript
			pushi    1
			lofsa    talkScript
			push    
			lag      global0
			send     6
			jmp      code_0250
code_01d5:
			dup     
			ldi      10
			eq?     
			bnt      code_01eb
			pushi    #setScript
			pushi    1
			lofsa    threat
			push    
			lag      global0
			send     6
			jmp      code_0250
code_01eb:
			dup     
			ldi      4
			eq?     
			bnt      code_022f
			pushi    10
			lsp      param2
			pushi    0
			pushi    2
			pushi    14
			pushi    18
			pushi    10
			pushi    4
			pushi    1
			pushi    16
			pushi    12
			calle    proc999_5,  20
			bnt      code_0221
			pushi    #setScript
			pushi    3
			lofsa    approachJeweler
			push    
			pushi    0
			lsp      param2
			lag      global0
			send     10
			jmp      code_0250
code_0221:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0250
code_022f:
			dup     
			ldi      3
			eq?     
			bnt      code_0245
			pushi    #setScript
			pushi    1
			lofsa    jewSearch
			push    
			lag      global0
			send     6
			jmp      code_0250
code_0245:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0250:
			toss    
			ret     
		)
	)
)

(instance jewScript of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
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
			bnt      code_03c5
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    7
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			pushi    0
			class    Wat
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			bnt      code_0388
			pushi    #setScript
			pushi    1
			lofsa    repeatEncounter
			push    
			pToa     client
			send     6
			jmp      code_0448
code_0388:
			pushi    #contains
			pushi    1
			lofsa    jew
			push    
			lag      global5
			send     6
			not     
			bnt      code_039f
			pushi    #init
			pushi    0
			lofsa    jew
			send     4
code_039f:
			pushi    #posn
			pushi    2
			pushi    235
			pushi    50
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    205
			pushi    70
			pushSelf
			lofsa    jew
			send     26
			jmp      code_0448
code_03c5:
			dup     
			ldi      1
			eq?     
			bnt      code_0427
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    162
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    5
			lofsa    jew
			send     18
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    225
			pushi    58
			pushi    226
			pushi    77
			pushi    204
			pushi    82
			pushi    182
			pushi    77
			pushi    182
			pushi    58
			pushi    205
			pushi    52
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			pushi    0
			callb    proc0_2,  0
			ldi      18
			aTop     ticks
			jmp      code_0448
code_0427:
			dup     
			ldi      2
			eq?     
			bnt      code_043c
			pushi    #setScript
			pushi    2
			lofsa    firstMeet
			push    
			pushSelf
			self     8
			jmp      code_0448
code_043c:
			dup     
			ldi      3
			eq?     
			bnt      code_0448
			pushi    #dispose
			pushi    0
			self     4
code_0448:
			toss    
			ret     
		)
	)
)

(instance repeatEncounter of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			super    TScript,  4
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
			bnt      code_052c
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    225
			pushi    58
			pushi    226
			pushi    77
			pushi    204
			pushi    82
			pushi    182
			pushi    77
			pushi    182
			pushi    58
			pushi    205
			pushi    52
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_0516
			pushi    5
			lea      @local95
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_058a
code_0516:
			pushi    4
			lea      @local112
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_058a
code_052c:
			dup     
			ldi      2
			eq?     
			bnt      code_0560
			pushi    #weMeetAgain
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_0558
			pushi    5
			lea      @local102
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_058a
code_0558:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_058a
code_0560:
			dup     
			ldi      3
			eq?     
			bnt      code_057e
			pushi    5
			lea      @local107
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_058a
code_057e:
			dup     
			ldi      4
			eq?     
			bnt      code_058a
			pushi    #dispose
			pushi    0
			self     4
code_058a:
			toss    
			ret     
		)
	)
)

(instance approachJeweler of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0631
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			lal      local24
			ne?     
			bnt      code_0628
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lal      local25
			ne?     
			bnt      code_0628
			pushi    #x
			pushi    0
			lofsa    jew
			send     4
			push    
			ldi      20
			sub     
			sal      local24
			pushi    #y
			pushi    0
			lofsa    jew
			send     4
			push    
			ldi      10
			add     
			sal      local25
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local24
			lsl      local25
			pushSelf
			lag      global0
			send     12
			jmp      code_07ee
code_0628:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_07ee
code_0631:
			dup     
			ldi      1
			eq?     
			bnt      code_065e
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			ne?     
			bnt      code_0655
			pushi    3
			lsg      global0
			lofsa    jew
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_07ee
code_0655:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_07ee
code_065e:
			dup     
			ldi      2
			eq?     
			bnt      code_066c
			ldi      12
			aTop     ticks
			jmp      code_07ee
code_066c:
			dup     
			ldi      3
			eq?     
			bnt      code_07ee
			pTos     register
			dup     
			ldi      999
			eq?     
			bnt      code_0682
			ldi      0
			jmp      code_07cd
code_0682:
			dup     
			ldi      1
			eq?     
			bnt      code_069f
			pushi    4
			pushi    1
			lea      @local117
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_07cd
code_069f:
			dup     
			ldi      0
			eq?     
			bnt      code_06eb
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			bnt      code_07cd
			pushi    #put
			pushi    0
			lag      global152
			send     4
			lal      local19
			bnt      code_06d3
			pushi    4
			pushi    1
			lea      @local126
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_07cd
code_06d3:
			ldi      1
			sal      local19
			pushi    3
			lea      @local121
			push    
			pushi    1
			lea      @local9
			push    
			calle    proc851_0,  6
			jmp      code_07cd
code_06eb:
			dup     
			ldi      2
			eq?     
			bnt      code_0706
			pushi    3
			lea      @local141
			push    
			pushi    1
			lea      @local9
			push    
			calle    proc851_0,  6
			jmp      code_07cd
code_0706:
			dup     
			ldi      14
			eq?     
			bnt      code_0740
			lal      local21
			bnt      code_0728
			pushi    4
			pushi    1
			lea      @local158
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_07cd
code_0728:
			ldi      1
			sal      local21
			pushi    3
			lea      @local149
			push    
			pushi    1
			lea      @local9
			push    
			calle    proc851_0,  6
			jmp      code_07cd
code_0740:
			dup     
			ldi      12
			eq?     
			bnt      code_075d
			pushi    4
			pushi    1
			lea      @local162
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_07cd
code_075d:
			dup     
			ldi      10
			eq?     
			bnt      code_076c
			pushi    0
			call     localproc_0012,  0
			jmp      code_07cd
code_076c:
			dup     
			ldi      18
			eq?     
			bnt      code_077b
			pushi    0
			call     localproc_0012,  0
			jmp      code_07cd
code_077b:
			dup     
			ldi      16
			eq?     
			bnt      code_07b5
			lal      local23
			bnt      code_079d
			pushi    4
			pushi    1
			lea      @local171
			push    
			lea      @local9
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_07cd
code_079d:
			pushi    3
			lea      @local166
			push    
			pushi    1
			lea      @local9
			push    
			calle    proc851_0,  6
			ldi      1
			sal      local23
			jmp      code_07cd
code_07b5:
			dup     
			ldi      4
			eq?     
			bnt      code_07cd
			pushi    3
			lea      @local175
			push    
			pushi    1
			lea      @local9
			push    
			calle    proc851_0,  6
code_07cd:
			toss    
			pTos     register
			ldi      2
			eq?     
			bnt      code_07e5
			pushi    #setScript
			pushi    1
			lofsa    spentEmerald
			push    
			pToa     client
			send     6
			jmp      code_07ee
code_07e5:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_07ee:
			toss    
			ret     
		)
	)
)

(instance spentEmerald of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    #fade
			pushi    0
			lag      global113
			send     4
			pushi    #dispose
			pushi    0
			super    TScript,  4
			pushi    #dispose
			pushi    0
			lofsa    jew
			send     4
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
			bnt      code_0867
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_0adc
code_0867:
			dup     
			ldi      1
			eq?     
			bnt      code_0886
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
			ldi      60
			aTop     ticks
			jmp      code_0adc
code_0886:
			dup     
			ldi      2
			eq?     
			bnt      code_0960
			pushi    #put
			pushi    1
			pushi    2
			lag      global0
			send     6
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    188
			pushi    50
			pushi    219
			pushi    1
			pushi    12
			lofsa    jew
			send     26
			ldi      2
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
			pushi    0
			callb    proc0_2,  0
			pushi    #get
			pushi    2
			pushi    7
			pushi    8
			pushi    6
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    219
			pushi    70
			lag      global0
			send     28
			pushi    #posn
			pushi    2
			pushi    219
			pushi    70
			pushi    7
			pushi    1
			pushi    1
			lag      global109
			send     14
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    #view
			pushi    1
			pushi    155
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    265
			pushi    75
			pushi    107
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     24
			pushi    #view
			pushi    1
			pushi    161
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    250
			pushi    95
			pushi    107
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     24
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      120
			aTop     ticks
			jmp      code_0adc
code_0960:
			dup     
			ldi      3
			eq?     
			bnt      code_098a
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			ldi      18
			aTop     ticks
			jmp      code_0adc
code_098a:
			dup     
			ldi      4
			eq?     
			bnt      code_09ab
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    jew
			send     12
			ldi      240
			aTop     ticks
			jmp      code_0adc
code_09ab:
			dup     
			ldi      5
			eq?     
			bnt      code_09cf
			ldi      1
			aTop     notKilled
			pushi    7
			pushi    2
			lea      @local212
			push    
			pushi    4
			pushi    2
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0adc
code_09cf:
			dup     
			ldi      6
			eq?     
			bnt      code_09dd
			ldi      30
			aTop     ticks
			jmp      code_0adc
code_09dd:
			dup     
			ldi      7
			eq?     
			bnt      code_09fd
			pushi    7
			pushi    2
			lea      @local218
			push    
			pushi    4
			pushi    2
			lea      @local0
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0adc
code_09fd:
			dup     
			ldi      8
			eq?     
			bnt      code_0a18
			pushi    4
			lea      @local227
			push    
			pushi    4
			pushi    14
			pushSelf
			calle    proc851_0,  8
			jmp      code_0adc
code_0a18:
			dup     
			ldi      9
			eq?     
			bnt      code_0a8c
			pushi    1
			pushi    65336
			calle    proc806_1,  2
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #posn
			pushi    2
			pushi    175
			pushi    90
			lag      global0
			send     8
			pushi    #posn
			pushi    2
			pushi    175
			pushi    90
			pushi    7
			pushi    1
			pushi    6
			lag      global109
			send     14
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    jew
			send     6
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      3
			aTop     seconds
			jmp      code_0adc
code_0a8c:
			dup     
			ldi      10
			eq?     
			bnt      code_0acc
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    1
			pushi    152
			callb    proc0_6,  2
			pushi    1
			pushi    113
			callb    proc0_6,  2
			pushi    0
			calle    proc121_0,  0
			pushi    0
			calle    proc125_2,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			ldi      60
			aTop     ticks
			jmp      code_0adc
code_0acc:
			dup     
			ldi      11
			eq?     
			bnt      code_0adc
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0adc:
			toss    
			ret     
		)
	)
)

(instance jewSearch of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #secondSearch
			pushi    0
			class    Wat
			send     4
			bnt      code_0b31
			pushi    #fade
			pushi    0
			lag      global113
			send     4
code_0b31:
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #secondSearch
			pushi    0
			class    Wat
			send     4
			bnt      code_0b4d
			pushi    #dispose
			pushi    0
			lofsa    jew
			send     4
			jmp      code_0b56
code_0b4d:
			pushi    #secondSearch
			pushi    1
			pushi    1
			class    Wat
			send     6
code_0b56:
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
			bnt      code_0b79
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    3
			lofsa    approachJeweler
			push    
			pushSelf
			pushi    999
			self     10
			jmp      code_1006
code_0b79:
			dup     
			ldi      1
			eq?     
			bnt      code_0bb4
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lofsa    jew
			send     4
			push    
			ldi      17
			sub     
			sal      local24
			pushi    #y
			pushi    0
			lofsa    jew
			send     4
			push    
			ldi      3
			add     
			sal      local25
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lsl      local24
			lsl      local25
			pushSelf
			lag      global0
			send     12
			jmp      code_1006
code_0bb4:
			dup     
			ldi      2
			eq?     
			bnt      code_0be7
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #view
			pushi    1
			pushi    7
			pushi    162
			pushi    1
			pushi    6
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_1006
code_0be7:
			dup     
			ldi      3
			eq?     
			bnt      code_0c17
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    jew
			send     18
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lag      global0
			send     12
			jmp      code_1006
code_0c17:
			dup     
			ldi      4
			eq?     
			bnt      code_0c47
			pushi    #secondSearch
			pushi    0
			class    Wat
			send     4
			bnt      code_0c3e
			pushi    4
			lea      @local244
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1006
code_0c3e:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1006
code_0c47:
			dup     
			ldi      5
			eq?     
			bnt      code_0c60
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lag      global0
			send     6
			ldi      2
			aTop     seconds
			jmp      code_1006
code_0c60:
			dup     
			ldi      6
			eq?     
			bnt      code_0c7d
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    5
			lofsa    jew
			send     12
			ldi      12
			aTop     ticks
			jmp      code_1006
code_0c7d:
			dup     
			ldi      7
			eq?     
			bnt      code_0cb9
			pushi    #secondSearch
			pushi    0
			class    Wat
			send     4
			bnt      code_0ca4
			pushi    4
			lea      @local250
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1006
code_0ca4:
			pushi    4
			lea      @local233
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1006
code_0cb9:
			dup     
			ldi      8
			eq?     
			bnt      code_0d06
			pushi    1
			pushi    6
			callb    proc0_2,  2
			pushi    #setSpeed
			pushi    1
			lsg      global157
			lag      global1
			send     6
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
			pushi    #secondSearch
			pushi    0
			class    Wat
			send     4
			bnt      code_0cfb
			ldi      65524
			jmp      code_0cfd
code_0cfb:
			ldi      65512
code_0cfd:
			push    
			pushSelf
			lag      global0
			send     22
			jmp      code_1006
code_0d06:
			dup     
			ldi      9
			eq?     
			bnt      code_0d1a
			pushi    1
			pushi    6
			callb    proc0_2,  2
			ldi      30
			aTop     ticks
			jmp      code_1006
code_0d1a:
			dup     
			ldi      10
			eq?     
			bnt      code_0d5e
			pushi    #secondSearch
			pushi    0
			class    Wat
			send     4
			bnt      code_0d44
			pushi    5
			lea      @local256
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1006
code_0d44:
			pushi    0
			callb    proc0_2,  0
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
			jmp      code_1006
code_0d5e:
			dup     
			ldi      11
			eq?     
			bnt      code_0d7e
			pushi    5
			lea      @local261
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1006
code_0d7e:
			dup     
			ldi      12
			eq?     
			bnt      code_0d9d
			pushi    5
			lea      @local267
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1006
code_0d9d:
			dup     
			ldi      13
			eq?     
			bnt      code_0dbc
			pushi    4
			lea      @local274
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1006
code_0dbc:
			dup     
			ldi      14
			eq?     
			bnt      code_0dd5
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1006
code_0dd5:
			dup     
			ldi      15
			eq?     
			bnt      code_0de3
			ldi      2
			aTop     seconds
			jmp      code_1006
code_0de3:
			dup     
			ldi      16
			eq?     
			bnt      code_0eb4
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    284
			pushi    2
			pushi    188
			pushi    50
			lofsa    jew
			send     26
			ldi      2
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
			pushi    0
			callb    proc0_2,  0
			pushi    #get
			pushi    2
			pushi    7
			pushi    8
			pushi    6
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    219
			pushi    70
			lag      global0
			send     28
			pushi    #posn
			pushi    2
			pushi    219
			pushi    70
			pushi    7
			pushi    1
			pushi    1
			lag      global109
			send     14
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			pushi    #view
			pushi    1
			pushi    152
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    265
			pushi    75
			pushi    107
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     24
			pushi    #view
			pushi    1
			pushi    155
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    250
			pushi    95
			pushi    107
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     24
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      3
			aTop     seconds
			jmp      code_1006
code_0eb4:
			dup     
			ldi      17
			eq?     
			bnt      code_0ede
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			ldi      2
			aTop     seconds
			jmp      code_1006
code_0ede:
			dup     
			ldi      18
			eq?     
			bnt      code_0f08
			pushi    150
			pushi    #y
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lofsa    jew
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			lofsa    jew
			send     10
			ldi      3
			aTop     seconds
			jmp      code_1006
code_0f08:
			dup     
			ldi      19
			eq?     
			bnt      code_0f28
			pushi    #cel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    jew
			send     4
			push    
			lofsa    jew
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1006
code_0f28:
			dup     
			ldi      20
			eq?     
			bnt      code_0f61
			pushi    9
			pushi    3
			lea      @local283
			push    
			pushi    4
			pushi    2
			lea      @local0
			push    
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  18
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
			jmp      code_1006
code_0f61:
			dup     
			ldi      21
			eq?     
			bnt      code_0fc0
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #posn
			pushi    2
			pushi    175
			pushi    90
			lag      global0
			send     8
			pushi    #posn
			pushi    2
			pushi    175
			pushi    90
			pushi    7
			pushi    1
			pushi    6
			lag      global109
			send     14
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			ldi      3
			aTop     seconds
			jmp      code_1006
code_0fc0:
			dup     
			ldi      22
			eq?     
			bnt      code_1006
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    1
			pushi    152
			callb    proc0_6,  2
			pushi    1
			pushi    113
			callb    proc0_6,  2
			pushi    0
			calle    proc125_2,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1006:
			toss    
			ret     
		)
	)
)

(instance tryHorn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10a7
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sag      global111
			pushi    5
			pushi    1
			pushi    10
			pushi    162
			pushi    1
			pushi    5
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			pushi    2
			pushi    4
			pushi    0
			pushi    6
			calle    proc999_5,  10
			bnt      code_1086
			ldi      0
			jmp      code_1088
code_1086:
			ldi      1
code_1088:
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lag      global0
			send     36
			jmp      code_1138
code_10a7:
			dup     
			ldi      1
			eq?     
			bnt      code_10c5
			pushi    5
			pushi    1
			lea      @local130
			push    
			lea      @local9
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1138
code_10c5:
			dup     
			ldi      2
			eq?     
			bnt      code_10db
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1138
code_10db:
			dup     
			ldi      3
			eq?     
			bnt      code_1102
			pushi    #blewHorn
			pushi    1
			pushi    1
			class    Wat
			send     6
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			lag      global0
			send     6
			pushi    1
			lsg      global111
			callb    proc0_2,  2
			ldi      18
			aTop     ticks
			jmp      code_1138
code_1102:
			dup     
			ldi      4
			eq?     
			bnt      code_111e
			pushi    4
			lea      @local134
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1138
code_111e:
			dup     
			ldi      5
			eq?     
			bnt      code_1138
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
code_1138:
			toss    
			ret     
		)
	)
)

(instance threat of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #cel
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_119a
			pushi    #handle
			pushi    0
			lofsa    spankSound
			send     4
			not     
			bnt      code_119a
			pushi    #play
			pushi    0
			lofsa    spankSound
			send     4
code_119a:
			pushi    #doit
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    0
			lag      global113
			send     4
			pushi    #dispose
			pushi    0
			lofsa    spankSound
			send     4
			pushi    1
			pushi    113
			callb    proc0_6,  2
			pushi    0
			calle    proc125_2,  0
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    #setSpeed
			pushi    1
			pTos     register
			lag      global1
			send     6
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			lofsa    jew
			send     4
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
			bnt      code_1278
			pushi    1
			pushi    0
			calle    proc806_6,  2
			pushi    0
			callb    proc0_3,  0
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			aTop     register
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #init
			pushi    0
			lofsa    threatSound
			send     4
			pushi    #distanceTo
			pushi    1
			lofsa    jew
			push    
			lag      global0
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_126f
			pushi    228
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
			lofsa    jew
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    jew
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      180
			add     
			push    
			ldi      360
			mod     
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_159f
code_126f:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_159f
code_1278:
			dup     
			ldi      1
			eq?     
			bnt      code_12ad
			pushi    #distanceTo
			pushi    1
			lofsa    jew
			push    
			lag      global0
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_12a4
			pushi    #setMotion
			pushi    3
			class    MoveFwd
			push    
			pushi    30
			pushSelf
			lag      global0
			send     10
			jmp      code_159f
code_12a4:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_159f
code_12ad:
			dup     
			ldi      2
			eq?     
			bnt      code_12c3
			pushi    3
			lsg      global0
			lofsa    jew
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_159f
code_12c3:
			dup     
			ldi      3
			eq?     
			bnt      code_12e3
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
			jmp      code_159f
code_12e3:
			dup     
			ldi      4
			eq?     
			bnt      code_12f9
			pushi    #play
			pushi    0
			lofsa    threatSound
			send     4
			ldi      48
			aTop     ticks
			jmp      code_159f
code_12f9:
			dup     
			ldi      5
			eq?     
			bnt      code_1315
			pushi    4
			lea      @local180
			push    
			pushi    2
			lea      @local9
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_159f
code_1315:
			dup     
			ldi      6
			eq?     
			bnt      code_141d
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
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    1
			pushi    19
			callk    ScriptID,  2
			pushi    4
			pushi    128
			pushi    152
			pushi    155
			pushi    168
			calle    proc958_0,  8
			pushi    #view
			pushi    1
			pushi    134
			pushi    162
			pushi    1
			pushi    3
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    90
			pushi    150
			lofsa    jew
			send     26
			ldi      2
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
			pushi    7
			pushi    8
			pushi    6
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    64
			pushi    167
			lag      global0
			send     28
			pushi    #posn
			pushi    2
			pushi    64
			pushi    167
			pushi    7
			pushi    1
			pushi    2
			lag      global109
			send     14
			pushi    0
			callb    proc0_2,  0
			pushi    #view
			pushi    1
			pushi    152
			pushi    6
			pushi    1
			pushi    2
			pushi    289
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    108
			pushi    139
			pushi    107
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     30
			pushi    #view
			pushi    1
			pushi    168
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    1
			pushi    289
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    125
			pushi    146
			pushi    107
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     36
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      3
			aTop     seconds
			jmp      code_159f
code_141d:
			dup     
			ldi      7
			eq?     
			bnt      code_1453
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    threatSound
			send     8
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    0
			calle    proc121_0,  0
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			ldi      120
			aTop     ticks
			jmp      code_159f
code_1453:
			dup     
			ldi      8
			eq?     
			bnt      code_1473
			pushi    7
			pushi    2
			lea      @local186
			push    
			pushi    4
			pushi    0
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_159f
code_1473:
			dup     
			ldi      9
			eq?     
			bnt      code_1481
			ldi      60
			aTop     ticks
			jmp      code_159f
code_1481:
			dup     
			ldi      10
			eq?     
			bnt      code_149b
			pushi    #cel
			pushi    1
			pushi    2
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			ldi      6
			aTop     ticks
			jmp      code_159f
code_149b:
			dup     
			ldi      11
			eq?     
			bnt      code_14b8
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			jmp      code_159f
code_14b8:
			dup     
			ldi      12
			eq?     
			bnt      code_14c6
			ldi      18
			aTop     ticks
			jmp      code_159f
code_14c6:
			dup     
			ldi      13
			eq?     
			bnt      code_14e6
			pushi    7
			pushi    2
			lea      @local199
			push    
			pushi    4
			pushi    0
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  14
			jmp      code_159f
code_14e6:
			dup     
			ldi      14
			eq?     
			bnt      code_14f4
			ldi      60
			aTop     ticks
			jmp      code_159f
code_14f4:
			dup     
			ldi      15
			eq?     
			bnt      code_1512
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    0
			pushi    250
			lag      global0
			send     10
			ldi      120
			aTop     ticks
			jmp      code_159f
code_1512:
			dup     
			ldi      16
			eq?     
			bnt      code_152c
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    jew
			send     6
			ldi      90
			aTop     ticks
			jmp      code_159f
code_152c:
			dup     
			ldi      17
			eq?     
			bnt      code_1549
			pushi    5
			pushi    1
			lea      @local208
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_159f
code_1549:
			dup     
			ldi      18
			eq?     
			bnt      code_1560
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    jew
			send     8
			jmp      code_159f
code_1560:
			dup     
			ldi      19
			eq?     
			bnt      code_156e
			ldi      12
			aTop     ticks
			jmp      code_159f
code_156e:
			dup     
			ldi      20
			eq?     
			bnt      code_159f
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			eq?     
			bnt      code_159a
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_159f
code_159a:
			pushi    #dispose
			pushi    0
			self     4
code_159f:
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
			dup     
			ldi      3
			eq?     
			bnt      code_1608
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_163d
			lal      local20
			bnt      code_163d
			pushi    2
			pushi    1026
			pushi    9
			calle    proc13_4,  4
			jmp      code_163d
code_1608:
			dup     
			ldi      4
			eq?     
			bnt      code_163d
			lsp      param2
			ldi      1
			eq?     
			bnt      code_163d
			pushi    #blewHorn
			pushi    0
			class    Wat
			send     4
			bnt      code_162f
			pushi    2
			pushi    1026
			pushi    76
			calle    proc13_4,  4
			jmp      code_163d
code_162f:
			pushi    #setScript
			pushi    1
			lofsa    tryHorn
			push    
			lag      global0
			send     6
			ldi      1
code_163d:
			toss    
			ret     
		)
	)
)

(instance talkScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1682
			pushi    5
			lea      @local45
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_16c8
code_1682:
			dup     
			ldi      1
			eq?     
			bnt      code_169f
			pushi    5
			lea      @local52
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_16c8
code_169f:
			dup     
			ldi      2
			eq?     
			bnt      code_16bc
			pushi    5
			lea      @local59
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_16c8
code_16bc:
			dup     
			ldi      3
			eq?     
			bnt      code_16c8
			pushi    #dispose
			pushi    0
			self     4
code_16c8:
			toss    
			ret     
		)
	)
)

(instance firstMeet of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1729
			pushi    5
			lea      @local69
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1770
code_1729:
			dup     
			ldi      1
			eq?     
			bnt      code_1746
			pushi    5
			lea      @local83
			push    
			pushi    1
			lea      @local9
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_1770
code_1746:
			dup     
			ldi      2
			eq?     
			bnt      code_1764
			pushi    5
			lea      @local89
			push    
			pushi    3
			lea      @local9
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_1770
code_1764:
			dup     
			ldi      3
			eq?     
			bnt      code_1770
			pushi    #dispose
			pushi    0
			self     4
code_1770:
			toss    
			ret     
		)
	)
)

(instance threatSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)

(instance spankSound of Sound
	(properties
		flags $0001
		number 153
	)
)
