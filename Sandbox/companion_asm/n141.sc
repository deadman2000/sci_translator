;;; Sierra Script 1.0 - (do not remove this comment)
(script# 141)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n961)
(use n964)
(use n989)
(use n992)
(use n998)

(public
	theStupor 0
	dancer 1
	spinDown 2
	day2Script 3
)

(local
	local0
	local1
	local2
	[local3 5] = [1140 0 1 1]
)
(instance thisCover of View
	(properties
		x 237
		y 67
		view 140
		loop 4
		priority 4
		signal $0010
	)
)

(instance theEmerald of View
	(properties
		x 210
		y 124
		view 216
		loop 2
		priority 4
		signal $0011
	)
)

(instance flashGreen of Prop
	(properties
		x 165
		y 153
		view 140
		loop 2
	)
)

(instance marian of Actor
	(properties
		x 87
		y 166
		view 220
	)
)

(instance theStupor of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0218
			pushi    2
			pushi    130
			pushi    964
			callk    Load,  4
			lag      global19
			sal      local0
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    thisCover
			send     8
			pushi    #north
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    164
			pushi    108
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    152
			pushi    107
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     26
			ldi      12
			aTop     ticks
			jmp      code_0460
code_0218:
			dup     
			ldi      1
			eq?     
			bnt      code_0233
			pushi    5
			pushi    1
			lea      @local3
			push    
			pushi    13
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0460
code_0233:
			dup     
			ldi      2
			eq?     
			bnt      code_0253
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    214
			pushi    104
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_0460
code_0253:
			dup     
			ldi      3
			eq?     
			bnt      code_0273
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    229
			pushi    83
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_0460
code_0273:
			dup     
			ldi      4
			eq?     
			bnt      code_02c9
			ldi      1
			aTop     notKilled
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #setCursor
			pushi    4
			pushi    5
			pushi    1
			pushi    180
			pushi    125
			lag      global1
			send     12
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    2
			pushi    19
			pushi    0
			callk    DoSound,  4
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global100
			send     12
			pushi    4
			pushi    803
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			ldi      120
			aTop     ticks
			jmp      code_0460
code_02c9:
			dup     
			ldi      5
			eq?     
			bnt      code_0338
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			lofsa    thisCover
			send     4
			pushi    7
			pushi    141
			pushi    0
			pushi    100
			pushi    35
			pushi    40
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    141
			pushi    1
			pushi    100
			pushi    50
			pushi    55
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    141
			pushi    2
			pushi    100
			pushi    35
			pushi    70
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    141
			pushi    3
			pushi    100
			pushi    130
			pushi    85
			pushi    102
			lsg      global185
			callk    Display,  14
			ldi      10
			aTop     seconds
			jmp      code_0460
code_0338:
			dup     
			ldi      6
			eq?     
			bnt      code_0370
			ldi      1
			aTop     notKilled
			pushi    4
			pushi    210
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			lofsa    marian
			send     10
			pushi    #setScript
			pushi    2
			lofsa    dancer
			push    
			pushSelf
			self     8
			ldi      160
			aTop     ticks
			jmp      code_0460
code_0370:
			dup     
			ldi      7
			eq?     
			bnt      code_03a2
			pushi    7
			pushi    141
			pushi    4
			pushi    100
			pushi    50
			pushi    10
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    141
			pushi    5
			pushi    100
			pushi    40
			pushi    25
			pushi    102
			lsg      global185
			callk    Display,  14
			jmp      code_0460
code_03a2:
			dup     
			ldi      8
			eq?     
			bnt      code_03c3
			pushi    4
			pushi    803
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			ldi      80
			aTop     ticks
			jmp      code_0460
code_03c3:
			dup     
			ldi      9
			eq?     
			bnt      code_0434
			pushi    2
			pushi    19
			pushi    20
			callk    DoSound,  4
			pushi    #number
			pushi    1
			pushi    141
			pushi    6
			pushi    1
			pushi    65535
			pushi    97
			pushi    1
			pushi    127
			pushi    42
			pushi    0
			lag      global100
			send     22
			pushi    4
			pushi    140
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			pushi    #view
			pushi    1
			pushi    142
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    89
			pushi    92
			lag      global0
			send     26
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #north
			pushi    1
			pushi    150
			lag      global2
			send     6
			pushi    #get
			pushi    1
			pushi    2
			lag      global0
			send     6
			ldi      80
			aTop     ticks
			jmp      code_0460
code_0434:
			dup     
			ldi      10
			eq?     
			bnt      code_044d
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     12
			jmp      code_0460
code_044d:
			dup     
			ldi      11
			eq?     
			bnt      code_0460
			pushi    #setScript
			pushi    1
			lofsa    day2Script
			push    
			lag      global0
			send     6
code_0460:
			toss    
			ret     
		)
	)
)

(instance dancer of TScript
	(properties)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    1
			pushi    964
			callk    DisposeScript,  2
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
			ldi      0
			eq?     
			bnt      code_04e7
			pushi    #number
			pushi    1
			pushi    211
			pushi    6
			pushi    1
			pushi    65535
			pushi    97
			pushi    1
			pushi    127
			pushi    42
			pushi    0
			lag      global100
			send     22
			+al      local1
			ldi      15
			aTop     cycles
			jmp      code_0911
code_04e7:
			dup     
			ldi      1
			eq?     
			bnt      code_050f
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    87
			pushi    166
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     28
			jmp      code_0911
code_050f:
			dup     
			ldi      2
			eq?     
			bnt      code_053b
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    100
			pushi    166
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    10
			pushi    1
			pushSelf
			lofsa    marian
			send     32
			jmp      code_0911
code_053b:
			dup     
			ldi      3
			eq?     
			bnt      code_057b
			pushi    #view
			pushi    1
			pushi    213
			pushi    162
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    105
			pushi    167
			pushi    308
			pushi    2
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    marian
			send     46
			ldi      30
			aTop     ticks
			jmp      code_0911
code_057b:
			dup     
			ldi      4
			eq?     
			bnt      code_05fc
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    34
			class    DPath
			push    
			pushi    87
			pushi    163
			pushi    96
			pushi    160
			pushi    107
			pushi    156
			pushi    120
			pushi    154
			pushi    138
			pushi    148
			pushi    146
			pushi    150
			pushi    161
			pushi    152
			pushi    172
			pushi    155
			pushi    182
			pushi    163
			pushi    177
			pushi    171
			pushi    164
			pushi    176
			pushi    152
			pushi    180
			pushi    140
			pushi    178
			pushi    135
			pushi    172
			pushi    144
			pushi    161
			pushi    148
			pushi    157
			pushSelf
			lofsa    marian
			send     84
			jmp      code_0911
code_05fc:
			dup     
			ldi      5
			eq?     
			bnt      code_0616
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lofsa    marian
			send     12
			jmp      code_0911
code_0616:
			dup     
			ldi      6
			eq?     
			bnt      code_065a
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    151
			pushi    156
			pushi    219
			pushi    1
			pushi    12
			pushi    308
			pushi    2
			pushi    3
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    150
			pushi    155
			pushSelf
			lofsa    marian
			send     52
			jmp      code_0911
code_065a:
			dup     
			ldi      7
			eq?     
			bnt      code_0689
			pushi    #view
			pushi    1
			pushi    220
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    153
			pushi    3
			pushi    1
			pushi    151
			lofsa    marian
			send     30
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0911
code_0689:
			dup     
			ldi      8
			eq?     
			bnt      code_06b4
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    153
			pushi    152
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     28
			jmp      code_0911
code_06b4:
			dup     
			ldi      9
			eq?     
			bnt      code_06db
			pushi    #view
			pushi    1
			pushi    220
			pushi    162
			pushi    1
			pushi    0
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
			jmp      code_0911
code_06db:
			dup     
			ldi      10
			eq?     
			bnt      code_0703
			pushi    #view
			pushi    1
			pushi    213
			pushi    162
			pushi    1
			pushi    3
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
			jmp      code_0911
code_0703:
			dup     
			ldi      11
			eq?     
			bnt      code_072a
			pushi    #view
			pushi    1
			pushi    213
			pushi    162
			pushi    1
			pushi    2
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
			jmp      code_0911
code_072a:
			dup     
			ldi      12
			eq?     
			bnt      code_074b
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     20
			jmp      code_0911
code_074b:
			dup     
			ldi      13
			eq?     
			bnt      code_0777
			ldi      1
			aTop     notKilled
			pushi    #view
			pushi    1
			pushi    220
			pushi    162
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
			lofsa    marian
			send     26
			jmp      code_0911
code_0777:
			dup     
			ldi      14
			eq?     
			bnt      code_07b5
			pushi    0
			callb    proc0_2,  0
			pushi    #view
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    56
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			pushi    172
			pushi    230
			pushi    194
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    172
			pushi    189
			pushSelf
			lag      global0
			send     42
			jmp      code_0911
code_07b5:
			dup     
			ldi      15
			eq?     
			bnt      code_07cc
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     8
			jmp      code_0911
code_07cc:
			dup     
			ldi      16
			eq?     
			bnt      code_0818
			pushi    4
			pushi    210
			pushi    100
			pushi    1
			pushi    0
			callk    DrawPic,  8
			pushi    #fade
			pushi    4
			pushi    80
			pushi    20
			pushi    12
			pushi    0
			lag      global100
			send     12
			pushi    #view
			pushi    1
			pushi    220
			pushi    162
			pushi    1
			pushi    7
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
			pushi    #play
			pushi    0
			lofsa    vanishSound
			send     4
			jmp      code_0911
code_0818:
			dup     
			ldi      17
			eq?     
			bnt      code_0860
			pushi    #hide
			pushi    0
			lofsa    marian
			send     4
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    flashGreen
			send     10
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0911
code_0860:
			dup     
			ldi      18
			eq?     
			bnt      code_0887
			pushi    #play
			pushi    0
			lofsa    magicSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    marian
			send     4
			pushi    #loop
			pushi    1
			pushi    7
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0911
code_0887:
			dup     
			ldi      19
			eq?     
			bnt      code_08a0
			ldi      1
			aTop     notKilled
			pushi    3
			pushi    1140
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_0911
code_08a0:
			dup     
			ldi      20
			eq?     
			bnt      code_08d5
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lofsa    flashGreen
			send     10
			pushi    #view
			pushi    1
			pushi    7
			pushi    6
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			pushi    #get
			pushi    1
			pushi    2
			lag      global0
			send     6
			jmp      code_0911
code_08d5:
			dup     
			ldi      21
			eq?     
			bnt      code_08ef
			ldi      1
			aTop     notKilled
			pushi    3
			pushi    1140
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_0911
code_08ef:
			dup     
			ldi      22
			eq?     
			bnt      code_0905
			pushi    3
			pushi    1140
			pushi    4
			pushSelf
			calle    proc13_4,  6
			jmp      code_0911
code_0905:
			dup     
			ldi      23
			eq?     
			bnt      code_0911
			pushi    #dispose
			pushi    0
			self     4
code_0911:
			toss    
			ret     
		)
	)
)

(instance spinDown of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0978
			pushi    #setLoop
			pushi    1
			pushi    9
			pushi    288
			pushi    1
			pushi    6
			lofsa    marian
			send     12
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_0978:
			dup     
			ldi      1
			eq?     
			bnt      code_0996
			pushi    #setLoop
			pushi    1
			pushi    9
			pushi    288
			pushi    1
			pushi    1
			lofsa    marian
			send     12
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_0996:
			dup     
			ldi      2
			eq?     
			bnt      code_09b4
			pushi    #setLoop
			pushi    1
			pushi    11
			pushi    288
			pushi    1
			pushi    0
			lofsa    marian
			send     12
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_09b4:
			dup     
			ldi      3
			eq?     
			bnt      code_09cc
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    marian
			send     6
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_09cc:
			dup     
			ldi      4
			eq?     
			bnt      code_09e4
			pushi    #setCel
			pushi    1
			pushi    2
			lofsa    marian
			send     6
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_09e4:
			dup     
			ldi      5
			eq?     
			bnt      code_09fd
			pushi    #setCel
			pushi    1
			pushi    3
			lofsa    marian
			send     6
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_09fd:
			dup     
			ldi      6
			eq?     
			bnt      code_0a16
			pushi    #setCel
			pushi    1
			pushi    4
			lofsa    marian
			send     6
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_0a16:
			dup     
			ldi      7
			eq?     
			bnt      code_0a2f
			pushi    #setCel
			pushi    1
			pushi    5
			lofsa    marian
			send     6
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_0a2f:
			dup     
			ldi      8
			eq?     
			bnt      code_0a48
			pushi    #setCel
			pushi    1
			pushi    6
			lofsa    marian
			send     6
			ldi      1
			aTop     cycles
			jmp      code_0a54
code_0a48:
			dup     
			ldi      9
			eq?     
			bnt      code_0a54
			pushi    #dispose
			pushi    0
			self     4
code_0a54:
			toss    
			ret     
		)
	)
)

(instance day2Script of TScript
	(properties)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    TScript,  4
			lal      local2
			bnt      code_0ad5
			pushi    4
			pushi    6
			pushi    224
			pushi    254
			push    
			callk    Palette,  8
code_0ad5:
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    magicSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    vanishSound
			send     4
			pushi    #setCursor
			pushi    2
			pushi    0
			pushi    1
			lag      global1
			send     8
			pushi    #dispose
			pushi    0
			&rest    param1
			super    TScript,  4
			pushi    1
			pushi    141
			callk    DisposeScript,  2
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
			bnt      code_0af1
			pushi    3
			pushi    1140
			pushi    5
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0af1:
			dup     
			ldi      1
			eq?     
			bnt      code_0b07
			pushi    3
			pushi    1140
			pushi    6
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0b07:
			dup     
			ldi      2
			eq?     
			bnt      code_0b1d
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0d00
code_0b1d:
			dup     
			ldi      3
			eq?     
			bnt      code_0b33
			pushi    3
			pushi    1140
			pushi    7
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0b33:
			dup     
			ldi      4
			eq?     
			bnt      code_0b4f
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    1
			lag      global0
			send     12
			ldi      20
			aTop     ticks
			jmp      code_0d00
code_0b4f:
			dup     
			ldi      5
			eq?     
			bnt      code_0b65
			pushi    3
			pushi    1140
			pushi    8
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0b65:
			dup     
			ldi      6
			eq?     
			bnt      code_0bcb
			ldi      65534
			sal      local2
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #hide
			pushi    0
			pushi    2
			pushi    140
			pushi    1
			callk    ScriptID,  4
			send     4
			pushi    #hide
			pushi    0
			pushi    2
			pushi    140
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    #hide
			pushi    0
			pushi    2
			pushi    140
			pushi    3
			callk    ScriptID,  4
			send     4
			ldi      1
			aTop     notKilled
			pushi    4
			pushi    215
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			pushi    #init
			pushi    0
			lofsa    theEmerald
			send     4
			pushi    #number
			pushi    1
			pushi    13
			pushi    42
			pushi    0
			lofsa    magicSound
			send     10
			ldi      5
			aTop     seconds
			jmp      code_0d00
code_0bcb:
			dup     
			ldi      7
			eq?     
			bnt      code_0be5
			ldi      0
			sal      local2
			pushi    3
			pushi    1140
			pushi    9
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0be5:
			dup     
			ldi      8
			eq?     
			bnt      code_0c46
			pushi    #show
			pushi    0
			pushi    2
			pushi    140
			pushi    1
			callk    ScriptID,  4
			send     4
			pushi    #show
			pushi    0
			lag      global0
			send     4
			pushi    #show
			pushi    0
			pushi    2
			pushi    140
			pushi    2
			callk    ScriptID,  4
			send     4
			pushi    #show
			pushi    0
			pushi    2
			pushi    140
			pushi    3
			callk    ScriptID,  4
			send     4
			pushi    #dispose
			pushi    0
			lofsa    theEmerald
			send     4
			pushi    4
			pushi    140
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    magicSound
			send     8
			ldi      1
			aTop     cycles
			jmp      code_0d00
code_0c46:
			dup     
			ldi      9
			eq?     
			bnt      code_0c62
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			lag      global0
			send     12
			ldi      20
			aTop     ticks
			jmp      code_0d00
code_0c62:
			dup     
			ldi      10
			eq?     
			bnt      code_0c78
			pushi    3
			pushi    1140
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0c78:
			dup     
			ldi      11
			eq?     
			bnt      code_0ca1
			pushi    #view
			pushi    1
			pushi    7
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    92
			pushi    101
			lag      global0
			send     26
			ldi      6
			aTop     ticks
			jmp      code_0d00
code_0ca1:
			dup     
			ldi      12
			eq?     
			bnt      code_0cb8
			pushi    #setCel
			pushi    1
			pushi    1
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0d00
code_0cb8:
			dup     
			ldi      13
			eq?     
			bnt      code_0cd2
			pushi    0
			callb    proc0_2,  0
			pushi    3
			pushi    1140
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0cd2:
			dup     
			ldi      14
			eq?     
			bnt      code_0ce8
			pushi    3
			pushi    1140
			pushi    12
			pushSelf
			calle    proc13_4,  6
			jmp      code_0d00
code_0ce8:
			dup     
			ldi      15
			eq?     
			bnt      code_0d00
			pushi    0
			callb    proc0_4,  0
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d00:
			toss    
			ret     
		)
	)
)

(instance vanishSound of Sound
	(properties
		flags $0001
		number 213
	)
)

(instance magicSound of Sound
	(properties
		flags $0001
		number 216
	)
)
