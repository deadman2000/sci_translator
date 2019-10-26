;;; Sierra Script 1.0 - (do not remove this comment)
(script# 226)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n958)
(use n961)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	marian 0
	marianAttack 1
	randomHorse 2
	glassSlipper 3
	dummySlip 4
	monk 5
	dummyMonk 6
	stick 7
	dummyStick 8
	menGather 9
	johnPic 10
	tuckPic 11
	willPic 12
	muchPic 13
	dumpMarian 14
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
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	local16
	local17
	local18
	local19
	local20
	local21
	local22
	[local23 4] = [1226 0 1]
	[local27 4] = [1226 1 1]
	[local31 4] = [1226 2 1]
	[local35 11] = [1226 3 2 2 1 2 1 2 1 2]
	[local46 13] = [1226 11 2 2 1 2 2 0 1226 16 1 1]
	[local59 4] = [1226 18 1]
	[local63 5] = [1226 19 1 2]
	[local68 12] = [1226 32 2 1 3 1 4 1 1 2 3]
	[local80 4] = [1226 41 1]
	[local84 4] = [1226 44 1]
	[local88 4] = [1226 45 1]
	[local92 4] = [1226 46 1]
	[local96 13] = [1226 47 1 0 -1 12115]
)
(instance bowSound of Sound
	(properties)
)

(instance marian of Actor
	(properties
		yStep 9
		view 214
		illegalBits $0000
		xStep 12
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    128
			pushi    214
			pushi    222
			pushi    223
			pushi    221
			pushi    224
			pushi    218
			calle    proc958_0,  14
			pushi    6
			pushi    132
			pushi    218
			pushi    913
			pushi    906
			pushi    908
			pushi    916
			calle    proc958_0,  12
			lsg      global108
			ldi      2
			eq?     
			bnt      code_00d1
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    197
			pushi    101
			self     14
			jmp      code_00e0
code_00d1:
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    140
			pushi    120
			self     14
code_00e0:
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    142
			pushi    1
			lofsa    marianAttack
			push    
			self     12
			pushi    #setScript
			pushi    1
			lofsa    randomHorse
			push    
			lag      global0
			send     6
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_011c
			pushi    3
			pushi    1226
			pushi    24
			pushi    1
			calle    proc13_4,  6
			jmp      code_013d
code_011c:
			dup     
			ldi      3
			eq?     
			bnt      code_0132
			pushi    3
			pushi    1226
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_013d
code_0132:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_013d:
			toss    
			ret     
		)
	)
)

(instance monk of Actor
	(properties
		view 218
		loop 1
		signal $4000
		illegalBits $0000
	)
	
	(method (init)
		(asm
			lsg      global108
			ldi      2
			eq?     
			bnt      code_01ed
			ldi      233
			sal      local19
			ldi      99
			sal      local20
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    233
			pushi    119
			self     14
			jmp      code_0204
code_01ed:
			ldi      103
			sal      local19
			ldi      117
			sal      local20
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    103
			pushi    137
			self     14
code_0204:
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			self     6
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pToa     y
			le?     
			bnt      code_0251
			lal      local16
			not     
			bnt      code_0251
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    watchHerDie
			ne?     
			bnt      code_0251
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    #setScript
			pushi    1
			lofsa    watchHerDie
			push    
			lag      global0
			send     6
			jmp      code_02a4
code_0251:
			pushi    #distanceTo
			pushi    1
			lsg      global0
			self     6
			push    
			ldi      40
			lt?     
			bnt      code_02a4
			lal      local16
			not     
			bnt      code_02a4
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    suicide
			ne?     
			bnt      code_02a4
			pTos     view
			ldi      16
			ne?     
			bnt      code_02a4
			pTos     loop
			ldi      2
			ne?     
			bnt      code_02a4
			pTos     loop
			ldi      3
			ne?     
			bnt      code_02a4
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    #setScript
			pushi    1
			lofsa    suicide
			push    
			lag      global0
			send     6
code_02a4:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_02e1
			pTos     loop
			ldi      2
			lt?     
			bnt      code_02d2
			pushi    7
			pushi    2
			lea      @local63
			push    
			pushi    2
			pushi    0
			pushi    11
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_03b1
code_02d2:
			pushi    3
			pushi    1226
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b1
code_02e1:
			dup     
			ldi      2
			eq?     
			bnt      code_030e
			pTos     loop
			ldi      2
			lt?     
			bnt      code_02ff
			pushi    3
			pushi    1226
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b1
code_02ff:
			pushi    3
			pushi    1226
			pushi    23
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b1
code_030e:
			dup     
			ldi      3
			eq?     
			bnt      code_0361
			lal      local16
			not     
			bnt      code_032a
			pushi    3
			pushi    1226
			pushi    26
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b1
code_032a:
			lal      local18
			bnt      code_033e
			pushi    3
			pushi    1226
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_03b1
code_033e:
			ldi      1
			sal      local18
			pushi    #setScript
			pushi    1
			lofsa    beatItTimerScript
			push    
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    #setScript
			pushi    1
			lofsa    searchMonk
			push    
			lag      global0
			send     6
			jmp      code_03b1
code_0361:
			dup     
			ldi      10
			eq?     
			bnt      code_03a6
			pTos     loop
			ldi      2
			lt?     
			bnt      code_0398
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    1
			lofsa    skewerMonk
			push    
			lag      global0
			send     6
			jmp      code_03b1
code_0398:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_03b1
code_03a6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_03b1:
			toss    
			ret     
		)
	)
)

(instance glassSlipper of Actor
	(properties
		yStep 30
		view 222
		loop 2
		cycleSpeed 5
		xStep 30
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_045a
			pushi    3
			pushi    1226
			pushi    31
			pushi    1
			calle    proc13_4,  6
			jmp      code_048b
code_045a:
			dup     
			ldi      3
			eq?     
			bnt      code_0480
			pushi    #setScript
			pushi    1
			lofsa    beatItTimerScript
			push    
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    #setScript
			pushi    1
			lofsa    getSlipper
			push    
			lag      global0
			send     6
			jmp      code_048b
code_0480:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_048b:
			toss    
			ret     
		)
	)
)

(instance stick of View
	(properties
		view 218
	)
	
	(method (init)
		(asm
			lsg      global108
			ldi      2
			eq?     
			bnt      code_055c
			pushi    6
			pushi    1
			pushi    5
			pushi    #priority
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    17
			pushi    1
			pushi    16465
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      24
			sub     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      1
			add     
			push    
			self     30
			jmp      code_0599
code_055c:
			pushi    6
			pushi    1
			pushi    4
			pushi    #priority
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    17
			pushi    1
			pushi    16465
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      23
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      1
			sub     
			push    
			self     30
code_0599:
			pushi    #init
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_05b8
			pushi    3
			pushi    1226
			pushi    29
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d9
code_05b8:
			dup     
			ldi      3
			eq?     
			bnt      code_05ce
			pushi    3
			pushi    1226
			pushi    30
			pushi    1
			calle    proc13_4,  6
			jmp      code_05d9
code_05ce:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_05d9:
			toss    
			ret     
		)
	)
)

(instance marianAttack of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_065f
			lal      local22
			not     
			bnt      code_065f
			ldi      1
			sal      local22
			pushi    1
			pushi    5
			callb    proc0_6,  2
code_065f:
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
			bnt      code_06ec
			pushi    #actions
			pushi    1
			lofsa    marianHornBlow
			push    
			lag      global0
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    1
			pushi    182
			callb    proc0_6,  2
			pushi    #init
			pushi    0
			lofsa    monk
			send     4
			pushi    #play
			pushi    0
			lofsa    mariansSong
			send     4
			lsg      global108
			ldi      2
			eq?     
			bnt      code_06c5
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    1
			pushi    188
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    41
			pushi    182
			pushSelf
			lag      global0
			send     30
			jmp      code_0a30
code_06c5:
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    318
			pushi    188
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    277
			pushi    182
			pushSelf
			lag      global0
			send     30
			jmp      code_0a30
code_06ec:
			dup     
			ldi      1
			eq?     
			bnt      code_0707
			pushi    5
			pushi    1
			lea      @local23
			push    
			pushi    22
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0a30
code_0707:
			dup     
			ldi      2
			eq?     
			bnt      code_0721
			pushi    5
			pushi    1
			lea      @local27
			push    
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0a30
code_0721:
			dup     
			ldi      3
			eq?     
			bnt      code_078e
			pushi    0
			callb    proc0_4,  0
			pushi    0
			callk    HaveMouse,  0
			not     
			bnt      code_0744
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			lsl      local19
			lsl      local20
			lag      global1
			send     12
code_0744:
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			lofsa    randomHorse
			push    
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			lsg      global3
			ldi      7
			gt?     
			bnt      code_0778
			ldi      10
			aTop     seconds
			jmp      code_0a30
code_0778:
			lsg      global3
			ldi      4
			gt?     
			bnt      code_0787
			ldi      8
			aTop     seconds
			jmp      code_0a30
code_0787:
			ldi      6
			aTop     seconds
			jmp      code_0a30
code_078e:
			dup     
			ldi      4
			eq?     
			bnt      code_07a9
			pushi    1
			pushi    3
			calle    proc806_6,  2
			pushi    0
			callb    proc0_3,  0
			ldi      90
			aTop     ticks
			jmp      code_0a30
code_07a9:
			dup     
			ldi      5
			eq?     
			bnt      code_07c0
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     8
			jmp      code_0a30
code_07c0:
			dup     
			ldi      6
			eq?     
			bnt      code_083b
			ldi      1
			sal      local22
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			pushi    16
			pushi    1
			lofsa    mariansSong
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #number
			pushi    1
			pushi    25
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    1
			pushi    5
			callb    proc0_6,  2
			pushi    5
			pushi    1
			pushi    223
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_0818
			ldi      1
			jmp      code_081a
code_0818:
			ldi      0
code_081a:
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     20
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    monk
			send     6
			ldi      20
			aTop     ticks
			jmp      code_0a30
code_083b:
			dup     
			ldi      7
			eq?     
			bnt      code_0872
			ldi      1
			sal      local17
			pushi    #signal
			pushi    1
			pushi    26640
			pushi    7
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    107
			pushi    0
			lofsa    glassSlipper
			send     24
			jmp      code_0a30
code_0872:
			dup     
			ldi      8
			eq?     
			bnt      code_088e
			pushi    #view
			pushi    1
			pushi    16
			pushi    6
			pushi    1
			pushi    0
			lofsa    monk
			send     12
			ldi      12
			aTop     ticks
			jmp      code_0a30
code_088e:
			dup     
			ldi      9
			eq?     
			bnt      code_08ad
			pushi    #dispose
			pushi    0
			lofsa    mariansSong
			send     4
			pushi    #loop
			pushi    1
			pushi    2
			lofsa    monk
			send     6
			ldi      24
			aTop     ticks
			jmp      code_0a30
code_08ad:
			dup     
			ldi      10
			eq?     
			bnt      code_08d2
			lag      global25
			bnt      code_08be
			pushi    #dispose
			pushi    0
			send     4
code_08be:
			pushi    5
			pushi    1
			lea      @local31
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0a30
code_08d2:
			dup     
			ldi      11
			eq?     
			bnt      code_0968
			pushi    #actions
			pushi    1
			lofsa    marianHornBlow
			push    
			lag      global0
			send     6
			lsg      global108
			ldi      2
			eq?     
			bnt      code_090a
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    335
			pushi    112
			pushSelf
			lofsa    monk
			send     18
			jmp      code_0924
code_090a:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65523
			pushi    137
			pushSelf
			lofsa    monk
			send     18
code_0924:
			pushi    5
			pushi    1
			pushi    221
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_093b
			ldi      1
			jmp      code_093d
code_093b:
			ldi      0
code_093d:
			push    
			pushi    308
			pushi    2
			pushi    3
			pushi    2
			pushi    219
			pushi    1
			pushi    8
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    monk
			push    
			pushi    60
			lofsa    marian
			send     42
			jmp      code_0a30
code_0968:
			dup     
			ldi      12
			eq?     
			bnt      code_09c1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_099c
			pushi    #setStep
			pushi    2
			pushi    12
			pushi    9
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    350
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushSelf
			lofsa    marian
			send     20
			jmp      code_0a30
code_099c:
			pushi    #setStep
			pushi    2
			pushi    12
			pushi    9
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65386
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushSelf
			lofsa    marian
			send     20
			jmp      code_0a30
code_09c1:
			dup     
			ldi      13
			eq?     
			bnt      code_09d0
			ldi      270
			aTop     ticks
			jmp      code_0a30
code_09d0:
			dup     
			ldi      14
			eq?     
			bnt      code_0a30
			pushi    0
			callb    proc0_4,  0
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    16
			pushi    1
			lag      global114
			send     12
			pushi    4
			pushi    0
			pushi    930
			pushi    851
			pushi    928
			calle    proc958_0,  8
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    monk
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    marian
			send     20
code_0a30:
			toss    
			ret     
		)
	)
)

(instance skewerMonk of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #loop
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			eq?     
			bt       code_0a8b
			pushi    #loop
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      3
			eq?     
code_0a8b:
			bnt      code_0aa5
			pushi    #cel
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0aa5
			pushi    #init
			pushi    0
			lofsa    stick
			send     4
code_0aa5:
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
			bnt      code_0bab
			pushi    0
			callb    proc0_3,  0
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
			lofsa    monk
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			callk    GetAngle,  8
			sal      local21
			push    
			ldi      20
			le?     
			bt       code_0af1
			lsl      local21
			ldi      340
			gt?     
code_0af1:
			bnt      code_0b01
			pushi    #setLoop
			pushi    1
			pushi    3
			lag      global0
			send     6
			jmp      code_0b92
code_0b01:
			lsl      local21
			ldi      60
			le?     
			bnt      code_0b16
			pushi    #setLoop
			pushi    1
			pushi    6
			lag      global0
			send     6
			jmp      code_0b92
code_0b16:
			lsl      local21
			ldi      100
			le?     
			bnt      code_0b2a
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_0b92
code_0b2a:
			lsl      local21
			ldi      110
			le?     
			bnt      code_0b3f
			pushi    #setLoop
			pushi    1
			pushi    4
			lag      global0
			send     6
			jmp      code_0b92
code_0b3f:
			lsl      local21
			ldi      200
			le?     
			bnt      code_0b54
			pushi    #setLoop
			pushi    1
			pushi    2
			lag      global0
			send     6
			jmp      code_0b92
code_0b54:
			lsl      local21
			ldi      240
			le?     
			bnt      code_0b6a
			pushi    #setLoop
			pushi    1
			pushi    5
			lag      global0
			send     6
			jmp      code_0b92
code_0b6a:
			lsl      local21
			ldi      260
			le?     
			bnt      code_0b7f
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			jmp      code_0b92
code_0b7f:
			lsl      local21
			ldi      280
			le?     
			bnt      code_0b92
			pushi    #setLoop
			pushi    1
			pushi    7
			lag      global0
			send     6
code_0b92:
			pushi    #view
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_108a
code_0bab:
			dup     
			ldi      1
			eq?     
			bnt      code_0bcb
			pushi    #view
			pushi    1
			pushi    5
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
			jmp      code_108a
code_0bcb:
			dup     
			ldi      2
			eq?     
			bnt      code_0bee
			pushi    #number
			pushi    1
			pushi    906
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lofsa    bowSound
			send     20
			ldi      26
			aTop     ticks
			jmp      code_108a
code_0bee:
			dup     
			ldi      3
			eq?     
			bnt      code_0c2f
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_0c06
			ldi      3
			jmp      code_0c08
code_0c06:
			ldi      2
code_0c08:
			push    
			pushi    288
			pushi    1
			pushi    0
			lofsa    monk
			send     12
			pushi    #number
			pushi    1
			pushi    907
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lofsa    bowSound
			send     20
			ldi      12
			aTop     ticks
			jmp      code_108a
code_0c2f:
			dup     
			ldi      4
			eq?     
			bnt      code_0c57
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    monk
			send     8
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    marian
			send     12
			jmp      code_108a
code_0c57:
			dup     
			ldi      5
			eq?     
			bnt      code_0cc5
			pushi    #dispose
			pushi    0
			lofsa    bowSound
			send     4
			pushi    #number
			pushi    1
			pushi    25
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			pushi    16
			pushi    1
			lofsa    mariansSong
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    85
			pushi    #superClass
			pushi    65529
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      7
			sub     
			push    
			lofsa    monk
			send     12
			ldi      1
			sal      local16
			pushi    1
			pushi    23
			callb    proc0_6,  2
			ldi      2
			aTop     seconds
			jmp      code_108a
code_0cc5:
			dup     
			ldi      6
			eq?     
			bnt      code_0eca
			lsg      global108
			ldi      2
			eq?     
			bnt      code_0dc4
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    16
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      52
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      14
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      9
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      14
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      52
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			lag      global2
			send     6
			jmp      code_0e93
code_0dc4:
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    14
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      18
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      17
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      3
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      51
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      49
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      8
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      8
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      18
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     42
			push    
			lag      global2
			send     6
code_0e93:
			pushi    #number
			pushi    1
			pushi    916
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lofsa    bowSound
			send     20
			lsg      global15
			ldi      100
			add     
			sag      global15
			pushi    #stopUpd
			pushi    0
			lofsa    stick
			send     4
			pushi    #doit
			pushi    0
			pushi    2
			pushi    0
			pushi    1
			callk    ScriptID,  4
			send     4
			ldi      40
			aTop     ticks
			jmp      code_108a
code_0eca:
			dup     
			ldi      7
			eq?     
			bnt      code_0ee8
			pushi    7
			pushi    2
			lea      @local35
			push    
			pushi    3
			pushi    0
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_108a
code_0ee8:
			dup     
			ldi      8
			eq?     
			bnt      code_0f07
			pushi    #stopUpd
			pushi    0
			lofsa    monk
			send     4
			pushi    #dispose
			pushi    0
			lofsa    bowSound
			send     4
			ldi      60
			aTop     ticks
			jmp      code_108a
code_0f07:
			dup     
			ldi      9
			eq?     
			bnt      code_0f45
			pushi    #dispose
			pushi    0
			lofsa    mariansSong
			send     4
			pushi    5
			pushi    1
			pushi    222
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_0f2d
			ldi      1
			jmp      code_0f2f
code_0f2d:
			ldi      0
code_0f2f:
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     26
			jmp      code_108a
code_0f45:
			dup     
			ldi      10
			eq?     
			bnt      code_0f8c
			pushi    66
			pushi    #superClass
			pushi    13
			pushi    17
			pushi    1
			pushi    26640
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      74
			sub     
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    142
			pushi    2
			lofsa    spinner
			push    
			pushSelf
			lofsa    glassSlipper
			send     38
			jmp      code_108a
code_0f8c:
			dup     
			ldi      11
			eq?     
			bnt      code_0faa
			pushi    7
			pushi    2
			lea      @local46
			push    
			pushi    3
			pushi    0
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_108a
code_0faa:
			dup     
			ldi      12
			eq?     
			bnt      code_1000
			pushi    #view
			pushi    1
			pushi    224
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    marian
			send     12
			lsg      global108
			ldi      2
			eq?     
			bnt      code_0fe6
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    350
			pushi    100
			pushSelf
			lofsa    marian
			send     18
			jmp      code_108a
code_0fe6:
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65486
			pushi    123
			pushSelf
			lofsa    marian
			send     18
			jmp      code_108a
code_1000:
			dup     
			ldi      13
			eq?     
			bnt      code_102f
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    2
			pushi    1226
			pushi    16
			calle    proc13_4,  4
			pushi    3
			pushi    1226
			pushi    17
			pushSelf
			calle    proc13_4,  6
			jmp      code_108a
code_102f:
			dup     
			ldi      14
			eq?     
			bnt      code_103e
			ldi      170
			aTop     ticks
			jmp      code_108a
code_103e:
			dup     
			ldi      15
			eq?     
			bnt      code_107e
			pushi    0
			callb    proc0_4,  0
			pushi    #actions
			pushi    1
			lofsa    marianHornBlow
			push    
			lag      global0
			send     6
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    monk
			send     6
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    16
			pushi    1
			lag      global114
			send     12
			pushi    #dispose
			pushi    0
			lofsa    marian
			send     4
			ldi      18
			aTop     ticks
			jmp      code_108a
code_107e:
			dup     
			ldi      16
			eq?     
			bnt      code_108a
			pushi    #dispose
			pushi    0
			self     4
code_108a:
			toss    
			ret     
		)
	)
)

(instance noGoodShot of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10fa
			pushi    283
			pushi    #x
			class    MoveTo
			push    
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
			ldi      1
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1112
code_10fa:
			dup     
			ldi      1
			eq?     
			bnt      code_1112
			pushi    3
			pushi    1226
			pushi    51
			pushi    1
			calle    proc13_4,  6
			pushi    #dispose
			pushi    0
			self     4
code_1112:
			toss    
			ret     
		)
	)
)

(instance searchMonk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11ba
			pushi    0
			callb    proc0_3,  0
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1190
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      39
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      4
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1279
code_1190:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      39
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      4
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1279
code_11ba:
			dup     
			ldi      1
			eq?     
			bnt      code_11ed
			pushi    5
			pushi    1
			pushi    7
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_11d7
			ldi      0
			jmp      code_11d9
code_11d7:
			ldi      1
code_11d9:
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lag      global0
			send     24
			jmp      code_1279
code_11ed:
			dup     
			ldi      2
			eq?     
			bnt      code_1205
			pushi    #setCel
			pushi    1
			pushi    4
			lag      global0
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1279
code_1205:
			dup     
			ldi      3
			eq?     
			bnt      code_121d
			pushi    #setCel
			pushi    1
			pushi    5
			lag      global0
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1279
code_121d:
			dup     
			ldi      4
			eq?     
			bnt      code_1233
			pushi    3
			pushi    1226
			pushi    27
			pushSelf
			calle    proc13_4,  6
			jmp      code_1279
code_1233:
			dup     
			ldi      5
			eq?     
			bnt      code_1249
			pushi    3
			pushi    1226
			pushi    28
			pushSelf
			calle    proc13_4,  6
			jmp      code_1279
code_1249:
			dup     
			ldi      6
			eq?     
			bnt      code_1265
			pushi    #setCel
			pushi    1
			pushi    65535
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_1279
code_1265:
			dup     
			ldi      7
			eq?     
			bnt      code_1279
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1279:
			toss    
			ret     
		)
	)
)

(instance getSlipper of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_132e
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			lt?     
			bnt      code_1304
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      16
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1409
code_1304:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      8
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      16
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1409
code_132e:
			dup     
			ldi      1
			eq?     
			bnt      code_1372
			pushi    5
			pushi    1
			pushi    7
			pushi    288
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			lt?     
			bnt      code_135c
			ldi      1
			jmp      code_135e
code_135c:
			ldi      0
code_135e:
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_1409
code_1372:
			dup     
			ldi      2
			eq?     
			bnt      code_13cb
			pushi    #hide
			pushi    0
			lofsa    glassSlipper
			send     4
			ldi      0
			sal      local17
			pushi    1
			pushi    53
			callb    proc0_6,  2
			pushi    #get
			pushi    1
			pushi    3
			lag      global0
			send     6
			pushi    #number
			pushi    1
			pushi    916
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lofsa    bowSound
			send     20
			lsg      global15
			ldi      100
			add     
			sag      global15
			pushi    #doit
			pushi    0
			pushi    2
			pushi    0
			pushi    1
			callk    ScriptID,  4
			send     4
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1409
code_13cb:
			dup     
			ldi      3
			eq?     
			bnt      code_1409
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_13e5
			ldi      6
			jmp      code_13e7
code_13e5:
			ldi      7
code_13e7:
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			lofsa    bowSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    glassSlipper
			send     4
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1409:
			toss    
			ret     
		)
	)
)

(instance spinner of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14d2
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1496
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      8192
			or      
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      14
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      2
			sub     
			push    
			pushSelf
			lofsa    glassSlipper
			send     18
			jmp      code_168d
code_1496:
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      8192
			or      
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      14
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      2
			sub     
			push    
			pushSelf
			lofsa    glassSlipper
			send     18
			jmp      code_168d
code_14d2:
			dup     
			ldi      1
			eq?     
			bnt      code_1537
			lsg      global108
			ldi      2
			eq?     
			bnt      code_150c
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      14
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      2
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     12
			jmp      code_168d
code_150c:
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      14
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      2
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     12
			jmp      code_168d
code_1537:
			dup     
			ldi      2
			eq?     
			bnt      code_159c
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1571
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      35
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     12
			jmp      code_168d
code_1571:
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      35
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     12
			jmp      code_168d
code_159c:
			dup     
			ldi      3
			eq?     
			bnt      code_1601
			lsg      global108
			ldi      2
			eq?     
			bnt      code_15d6
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      52
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     12
			jmp      code_168d
code_15d6:
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      42
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     12
			jmp      code_168d
code_1601:
			dup     
			ldi      4
			eq?     
			bnt      code_164a
			pushi    66
			pushi    #superClass
			pushi    65535
			pushi    17
			pushi    1
			pushi    26624
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      3
			sub     
			push    
			pushSelf
			lofsa    glassSlipper
			send     40
			jmp      code_168d
code_164a:
			dup     
			ldi      5
			eq?     
			bnt      code_1681
			pushi    150
			pushi    #superClass
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			ldi      3
			add     
			push    
			pushSelf
			lofsa    glassSlipper
			send     18
			ldi      1
			sal      local17
			jmp      code_168d
code_1681:
			dup     
			ldi      6
			eq?     
			bnt      code_168d
			pushi    #dispose
			pushi    0
			self     4
code_168d:
			toss    
			ret     
		)
	)
)

(instance watchHerDie of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_170d
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    #y
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     10
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    marian
			send     6
			ldi      12
			aTop     ticks
			jmp      code_19c3
code_170d:
			dup     
			ldi      1
			eq?     
			bnt      code_1743
			pushi    5
			pushi    1
			pushi    218
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_172b
			ldi      1
			jmp      code_172d
code_172b:
			ldi      0
code_172d:
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    monk
			send     26
			jmp      code_19c3
code_1743:
			dup     
			ldi      2
			eq?     
			bnt      code_17ba
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    monk
			send     6
			pushi    #fade
			pushi    4
			pushi    0
			pushi    15
			pushi    16
			pushi    1
			lofsa    mariansSong
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #number
			pushi    1
			pushi    25
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global114
			send     16
			pushi    1
			pushi    5
			callb    proc0_6,  2
			pushi    5
			pushi    1
			pushi    223
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_17a3
			ldi      1
			jmp      code_17a5
code_17a3:
			ldi      0
code_17a5:
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     20
			ldi      20
			aTop     ticks
			jmp      code_19c3
code_17ba:
			dup     
			ldi      3
			eq?     
			bnt      code_17f1
			ldi      1
			sal      local17
			pushi    #signal
			pushi    1
			pushi    26640
			pushi    7
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    107
			pushi    0
			lofsa    glassSlipper
			send     24
			jmp      code_19c3
code_17f1:
			dup     
			ldi      4
			eq?     
			bnt      code_1822
			pushi    5
			pushi    1
			pushi    16
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_180e
			ldi      1
			jmp      code_1810
code_180e:
			ldi      0
code_1810:
			push    
			pushi    288
			pushi    1
			pushi    0
			lofsa    monk
			send     18
			ldi      48
			aTop     ticks
			jmp      code_19c3
code_1822:
			dup     
			ldi      5
			eq?     
			bnt      code_183d
			pushi    5
			pushi    1
			lea      @local31
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_19c3
code_183d:
			dup     
			ldi      6
			eq?     
			bnt      code_18df
			pushi    #actions
			pushi    1
			lofsa    marianHornBlow
			push    
			lag      global0
			send     6
			lsg      global108
			ldi      2
			eq?     
			bnt      code_187b
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			pushi    65535
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    335
			pushi    112
			pushSelf
			lofsa    monk
			send     24
			jmp      code_189b
code_187b:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    162
			pushi    1
			pushi    65535
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65523
			pushi    137
			pushSelf
			lofsa    monk
			send     24
code_189b:
			pushi    5
			pushi    1
			pushi    221
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_18b2
			ldi      1
			jmp      code_18b4
code_18b2:
			ldi      0
code_18b4:
			push    
			pushi    308
			pushi    2
			pushi    3
			pushi    2
			pushi    219
			pushi    1
			pushi    8
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PFollow
			push    
			lofsa    monk
			push    
			pushi    60
			lofsa    marian
			send     42
			jmp      code_19c3
code_18df:
			dup     
			ldi      7
			eq?     
			bnt      code_1938
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1913
			pushi    #setStep
			pushi    2
			pushi    12
			pushi    9
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    350
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushSelf
			lofsa    marian
			send     20
			jmp      code_19c3
code_1913:
			pushi    #setStep
			pushi    2
			pushi    12
			pushi    9
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65386
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushSelf
			lofsa    marian
			send     20
			jmp      code_19c3
code_1938:
			dup     
			ldi      8
			eq?     
			bnt      code_1957
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    15
			pushi    1
			lofsa    mariansSong
			send     12
			ldi      270
			aTop     ticks
			jmp      code_19c3
code_1957:
			dup     
			ldi      9
			eq?     
			bnt      code_19b7
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			lofsa    mariansSong
			send     4
			pushi    4
			pushi    0
			pushi    930
			pushi    851
			pushi    928
			calle    proc958_0,  8
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    monk
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    marian
			send     20
			ldi      12
			aTop     ticks
			jmp      code_19c3
code_19b7:
			dup     
			ldi      10
			eq?     
			bnt      code_19c3
			pushi    #dispose
			pushi    0
			self     4
code_19c3:
			toss    
			ret     
		)
	)
)

(instance suicide of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a6c
			pushi    0
			callb    proc0_3,  0
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1a42
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      7
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1c1b
code_1a42:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			ldi      7
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1c1b
code_1a6c:
			dup     
			ldi      1
			eq?     
			bnt      code_1aa0
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    marian
			send     6
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      16384
			or      
			push    
			pushi    162
			pushi    1
			pushi    3
			lag      global0
			send     12
			ldi      12
			aTop     ticks
			jmp      code_1c1b
code_1aa0:
			dup     
			ldi      2
			eq?     
			bnt      code_1aca
			pushi    #view
			pushi    1
			pushi    585
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    monk
			send     24
			ldi      30
			aTop     ticks
			jmp      code_1c1b
code_1aca:
			dup     
			ldi      3
			eq?     
			bnt      code_1aeb
			pushi    #view
			pushi    1
			pushi    792
			pushi    288
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_1c1b
code_1aeb:
			dup     
			ldi      4
			eq?     
			bnt      code_1b0d
			pushi    #play
			pushi    0
			lofsa    dieSound
			send     4
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lofsa    monk
			send     12
			jmp      code_1c1b
code_1b0d:
			dup     
			ldi      5
			eq?     
			bnt      code_1b43
			pushi    5
			pushi    1
			pushi    218
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1b2b
			ldi      1
			jmp      code_1b2d
code_1b2b:
			ldi      0
code_1b2d:
			push    
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    monk
			send     26
			jmp      code_1c1b
code_1b43:
			dup     
			ldi      6
			eq?     
			bnt      code_1b8a
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    monk
			send     6
			pushi    1
			pushi    5
			callb    proc0_6,  2
			pushi    5
			pushi    1
			pushi    223
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1b73
			ldi      1
			jmp      code_1b75
code_1b73:
			ldi      0
code_1b75:
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     20
			ldi      12
			aTop     ticks
			jmp      code_1c1b
code_1b8a:
			dup     
			ldi      7
			eq?     
			bnt      code_1bc1
			ldi      1
			sal      local17
			pushi    #signal
			pushi    1
			pushi    26640
			pushi    7
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    107
			pushi    0
			lofsa    glassSlipper
			send     24
			jmp      code_1c1b
code_1bc1:
			dup     
			ldi      8
			eq?     
			bnt      code_1bf2
			pushi    5
			pushi    1
			pushi    16
			pushi    162
			pushi    1
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1bde
			ldi      5
			jmp      code_1be0
code_1bde:
			ldi      4
code_1be0:
			push    
			pushi    288
			pushi    1
			pushi    0
			lofsa    monk
			send     18
			ldi      48
			aTop     ticks
			jmp      code_1c1b
code_1bf2:
			dup     
			ldi      9
			eq?     
			bnt      code_1c0d
			pushi    5
			pushi    1
			lea      @local59
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c1b
code_1c0d:
			dup     
			ldi      10
			eq?     
			bnt      code_1c1b
			pushi    0
			calle    proc806_0,  0
code_1c1b:
			toss    
			ret     
		)
	)
)

(instance hornToot of Sound
	(properties)
)

(instance menGather of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d66
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    130
			pushi    19
			pushi    23
			pushi    20
			pushi    22
			calle    proc958_0,  10
			pushi    2
			pushi    132
			pushi    904
			calle    proc958_0,  4
			ldi      320
			sal      local0
			ldi      65526
			sal      local4
			ldi      320
			sal      local8
			ldi      65526
			sal      local12
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1d13
			ldi      125
			sal      local1
			ldi      180
			sal      local5
			ldi      160
			sal      local9
			ldi      148
			sal      local13
			ldi      298
			sal      local2
			ldi      127
			sal      local3
			ldi      115
			sal      local6
			ldi      150
			sal      local7
			ldi      250
			sal      local10
			ldi      160
			sal      local11
			ldi      168
			sal      local14
			ldi      112
			sal      local15
			jmp      code_1d48
code_1d13:
			ldi      140
			sal      local1
			ldi      180
			sal      local5
			ldi      125
			sal      local9
			ldi      120
			sal      local13
			ldi      122
			sal      local2
			ldi      110
			sal      local3
			ldi      44
			sal      local6
			ldi      175
			sal      local7
			ldi      196
			sal      local10
			ldi      127
			sal      local11
			ldi      33
			sal      local14
			ldi      133
			sal      local15
code_1d48:
			pushi    #actions
			pushi    1
			lofsa    marianHornBlow
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    165
			pushSelf
			lag      global0
			send     18
			jmp      code_241e
code_1d66:
			dup     
			ldi      1
			eq?     
			bnt      code_1dd3
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			eq?     
			bt       code_1da2
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_1da2
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_1da2
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_1da2:
			bnt      code_1db1
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_1dba
code_1db1:
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
code_1dba:
			pushi    #view
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
			lag      global0
			send     20
			jmp      code_241e
code_1dd3:
			dup     
			ldi      2
			eq?     
			bnt      code_1df6
			pushi    #number
			pushi    1
			pushi    904
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lofsa    hornToot
			send     20
			ldi      5
			aTop     seconds
			jmp      code_241e
code_1df6:
			dup     
			ldi      3
			eq?     
			bnt      code_1e0c
			pushi    #dispose
			pushi    0
			lofsa    hornToot
			send     4
			ldi      30
			aTop     ticks
			jmp      code_241e
code_1e0c:
			dup     
			ldi      4
			eq?     
			bnt      code_1e22
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_241e
code_1e22:
			dup     
			ldi      5
			eq?     
			bnt      code_1ec7
			pushi    0
			callb    proc0_2,  0
			pushi    #posn
			pushi    2
			lsl      local0
			lsl      local1
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    164
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     20
			pushi    #posn
			pushi    2
			lsl      local4
			lsl      local5
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    155
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     20
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1e9b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local6
			lsl      local7
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     12
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lsl      local2
			lsl      local3
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     10
			jmp      code_241e
code_1e9b:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local2
			lsl      local3
			pushSelf
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     12
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lsl      local6
			lsl      local7
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     10
			jmp      code_241e
code_1ec7:
			dup     
			ldi      6
			eq?     
			bnt      code_1fa0
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    283
			pushi    #y
			class    PolyPath
			push    
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
			ldi      1
			sub     
			push    
			lag      global0
			send     10
			pushi    #posn
			pushi    2
			lsl      local8
			lsl      local9
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     20
			pushi    #posn
			pushi    2
			lsl      local12
			lsl      local13
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    152
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     20
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1f74
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local14
			lsl      local15
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lsl      local10
			lsl      local11
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     10
			jmp      code_241e
code_1f74:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local10
			lsl      local11
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			lsl      local14
			lsl      local15
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     10
			jmp      code_241e
code_1fa0:
			dup     
			ldi      7
			eq?     
			bnt      code_1ffa
			lsg      global108
			ldi      2
			eq?     
			bnt      code_1ff1
			pushi    283
			pushi    #y
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     10
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    200
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_241e
code_1ff1:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_241e
code_1ffa:
			dup     
			ldi      8
			eq?     
			bnt      code_203d
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #stopUpd
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    283
			pushi    #x
			class    PolyPath
			push    
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
			ldi      1
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_241e
code_203d:
			dup     
			ldi      9
			eq?     
			bnt      code_2397
			pushi    374
			pushi    4
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      30
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      32
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      23
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      32
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      23
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      26
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      32
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      23
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     12
			lsg      global108
			ldi      2
			eq?     
			bnt      code_2390
			ldi      4
			aTop     seconds
			jmp      code_241e
code_2390:
			ldi      12
			aTop     ticks
			jmp      code_241e
code_2397:
			dup     
			ldi      10
			eq?     
			bnt      code_23fc
			pushi    11
			pushi    4
			lea      @local68
			push    
			pushi    2
			pushi    0
			pushi    13
			pushi    1
			pushi    15
			pushi    2
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  22
			pushi    #actions
			pushi    1
			lofsa    johnAct
			push    
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     6
			pushi    #actions
			pushi    1
			lofsa    tuckAct
			push    
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     6
			pushi    #actions
			pushi    1
			lofsa    willAct
			push    
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     6
			pushi    #actions
			pushi    1
			lofsa    muchAct
			push    
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     6
			jmp      code_241e
code_23fc:
			dup     
			ldi      11
			eq?     
			bnt      code_241e
			pushi    0
			callb    proc0_4,  0
			pushi    #setScript
			pushi    1
			lofsa    beatItTimerScript
			push    
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_241e:
			toss    
			ret     
		)
	)
)

(instance getGoing of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_247e
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local80
			push    
			pushi    15
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_248e
code_247e:
			dup     
			ldi      1
			eq?     
			bnt      code_248e
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_248e:
			toss    
			ret     
		)
	)
)

(instance beatItTimerScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_24dd
			ldi      15
			aTop     seconds
			jmp      code_2517
code_24dd:
			dup     
			ldi      1
			eq?     
			bnt      code_2517
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_2505
			pushi    #setScript
			pushi    1
			lofsa    getGoing
			push    
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			jmp      code_2517
code_2505:
			pushi    #setScript
			pushi    1
			lofsa    beatItTimerScript
			push    
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
code_2517:
			toss    
			ret     
		)
	)
)

(instance heartSick of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2573
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1226
			pushi    42
			pushSelf
			calle    proc13_4,  6
			jmp      code_2599
code_2573:
			dup     
			ldi      1
			eq?     
			bnt      code_2589
			pushi    3
			pushi    1226
			pushi    43
			pushSelf
			calle    proc13_4,  6
			jmp      code_2599
code_2589:
			dup     
			ldi      2
			eq?     
			bnt      code_2599
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2599:
			toss    
			ret     
		)
	)
)

(instance dummyMonk of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			lofsa    monk
			send     4
			push    
			pushi    17
			pushi    1
			pushi    16449
			pushi    63
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    monk
			send     4
			push    
			self     48
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance dummyMarian of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    marian
			send     4
			push    
			pushi    63
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    marian
			send     4
			push    
			self     48
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance dummySlip of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			pushi    63
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    glassSlipper
			send     4
			push    
			self     42
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance dummyStick of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			lofsa    stick
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			lofsa    stick
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    stick
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    stick
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    stick
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    stick
			send     4
			push    
			pushi    63
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    stick
			send     4
			push    
			self     42
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance johnPic of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			push    
			self     36
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance tuckPic of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			push    
			self     36
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance willPic of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			push    
			self     36
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance muchPic of PicView
	(properties)
	
	(method (init)
		(asm
			pushi    #view
			pushi    1
			pushi    #view
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    7
			pushi    1
			pushi    #cel
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     4
			push    
			self     36
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)

(instance randomHorse of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2b91
			pushi    #number
			pushi    1
			pushi    913
			pushi    6
			pushi    1
			pushi    1
			lag      global113
			send     12
			ldi      6
			aTop     ticks
			jmp      code_2bbc
code_2b91:
			dup     
			ldi      1
			eq?     
			bnt      code_2bae
			pushi    #play
			pushi    0
			lag      global113
			send     4
			pushi    2
			pushi    300
			pushi    600
			callk    Random,  4
			aTop     ticks
			jmp      code_2bbc
code_2bae:
			dup     
			ldi      2
			eq?     
			bnt      code_2bbc
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
code_2bbc:
			toss    
			ret     
		)
	)
)

(instance marianHornBlow of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_2c7a
			lsp      param2
			ldi      1
			eq?     
			bnt      code_2c7a
			pushi    #contains
			pushi    1
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lag      global5
			send     6
			bnt      code_2c2a
			pushi    3
			pushi    1226
			pushi    49
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2c7a
code_2c2a:
			lsl      local16
			ldi      1
			eq?     
			bnt      code_2c43
			pushi    #setScript
			pushi    1
			lofsa    menGather
			push    
			lag      global0
			send     6
			ldi      1
			jmp      code_2c7a
code_2c43:
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      global5
			send     6
			bnt      code_2c6c
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_2c6c
			pushi    3
			pushi    1226
			pushi    48
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2c7a
code_2c6c:
			pushi    #setScript
			pushi    1
			lofsa    heartSick
			push    
			lag      global0
			send     6
			ldi      1
code_2c7a:
			ret     
		)
	)
)

(instance johnAct of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      5
			eq?     
			bnt      code_2cb7
			pushi    5
			pushi    1
			lea      @local84
			push    
			pushi    13
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_2cb7:
			ret     
		)
	)
)

(instance tuckAct of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      5
			eq?     
			bnt      code_2cf3
			pushi    5
			pushi    1
			lea      @local88
			push    
			pushi    15
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_2cf3:
			ret     
		)
	)
)

(instance willAct of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      5
			eq?     
			bnt      code_2d2f
			pushi    5
			pushi    1
			lea      @local92
			push    
			pushi    14
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_2d2f:
			ret     
		)
	)
)

(instance muchAct of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      5
			eq?     
			bnt      code_2d6b
			pushi    5
			pushi    1
			lea      @local96
			push    
			pushi    17
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_2d6b:
			ret     
		)
	)
)

(instance dumpMarian of Code
	(properties)
	
	(method (doit)
		(asm
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    mariansSong
			send     8
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    monk
			send     6
			lal      local16
			bnt      code_2dcc
			pushi    2
			lofsa    dummyMonk
			push    
			lofsa    dummyStick
			push    
			calle    proc806_2,  4
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    monk
			send     8
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    stick
			send     8
code_2dcc:
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      global5
			send     6
			bnt      code_2df0
			pushi    1
			lofsa    dummyMonk
			push    
			calle    proc806_2,  2
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    monk
			send     8
code_2df0:
			pushi    #contains
			pushi    1
			lofsa    marian
			push    
			lag      global5
			send     6
			bnt      code_2e09
			pushi    1
			lofsa    dummyMarian
			push    
			calle    proc806_2,  2
code_2e09:
			lal      local17
			bnt      code_2e24
			pushi    1
			lofsa    dummySlip
			push    
			calle    proc806_2,  2
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    glassSlipper
			send     8
code_2e24:
			pushi    #contains
			pushi    1
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			lag      global5
			send     6
			bnt      code_2e99
			pushi    4
			lofsa    johnPic
			push    
			lofsa    tuckPic
			push    
			lofsa    willPic
			push    
			lofsa    muchPic
			push    
			calle    proc806_2,  8
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			pushi    1
			pushi    22
			callk    ScriptID,  2
			send     14
code_2e99:
			pushi    8
			pushi    0
			pushi    19
			pushi    23
			pushi    20
			pushi    22
			pushi    851
			pushi    928
			pushi    227
			calle    proc958_0,  16
			pushi    #actions
			pushi    1
			pushi    0
			lag      global0
			send     6
			ret     
		)
	)
)

(instance mariansSong of Sound
	(properties
		flags $0001
		number 218
		loop -1
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
