;;; Sierra Script 1.0 - (do not remove this comment)
(script# 210)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n961)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	rm210 0
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
	[local19 4] = [1210 0 1]
	[local23 5] = [1210 16 1 2]
	[local28 4] = [1210 18 1]
	[local32 14] = [1210 19 1 2 1 1 2 1 2 1 2 1 2]
	[local46 4] = [1210 30 1]
	[local50 6] = [1210 31 1 2 2]
	[local56 4] = [1210 34 1]
	[local60 7] = [1210 35 1 2 1 2]
	[local67 8] = [1210 39 1 2 2 1 2]
	[local75 4] = [1210 44 1]
	[local79 4] = [1210 47 1]
	[local83 4] = [1210 48 2]
	[local87 4] = [1210 49 1]
	[local91 4] = [1210 50 1]
	[local95 12] = [1210 51 1 2 1 2 2 1 1 1 1]
	[local107 13] = [1210 60 2 1 1 1 2 2 1 1 2 1]
	[local120 4] = [1210 70 1]
	[local124 4] = [1210 71 1]
	[local128 15] = [1210 72 1 2 1 1 2 2 1 2 2 1 1 1]
	[local143 4] = [1210 84 1]
	[local147 7] = [1210 244 1 2 1 1]
	[local154 4] = [1210 101 1]
	[local158 5] = [1210 99 1 1]
	[local163 5] = [1210 90 2 1]
	[local168 7] = [1210 92 2 1 2 1]
	[local175 5] = [1210 97 1 1]
	[local180 26] = [1210 102 2 1 1 2 1 2 1 2 2 2 2 1 2 2 1 2 1 2 1 2 1 2 2]
	[local206 4] = [1210 125 2]
	[local210 4] = [1210 126 1]
	[local214 5] = [1210 127 2 2]
	[local219 5] = [1210 129 1 1]
	[local224 6] = [1210 131 2 1 1]
	[local230 12] = [1210 134 1 2 1 1 1 2 1 1 1]
	[local242 14] = [1210 143 2 1 1 2 2 1 1 2 1 2 1]
	[local256 5] = [1210 154 2 2]
	[local261 5] = [1210 157 1 1]
	[local266 9] = [1210 159 2 1 2 1 2 1]
	[local275 7] = [1210 165 2 1 1 2]
	[local282 5] = [1210 179 1 2]
	[local287 10] = [1210 181 2 1 2 2 1 1 2]
	[local297 4] = [1210 188 1]
	[local301 9] = [1210 172 2 1 2 2 1 2]
	[local310 9] = [1210 189 2 2 1 1 2 2]
	[local319 4] = [1210 195 1]
	[local323 7] = [1210 196 2 2 1 2]
	[local330 8] = [1210 200 2 1 2 1 2]
	[local338 4] = [1210 205 1]
	[local342 4] = [1210 206 1]
	[local346 5] = [1210 207 2 1]
	[local351 5] = [1210 209 1 2]
	[local356 5] = [1210 211 2 1]
	[local361 5] = [1210 213 2 1]
	[local366 6] = [1210 215 2 1 2]
	[local372 14] = [1210 219 2 1 2 1 2 1 2 1 2 1 2]
	[local386 6] = [1210 230 2 1 2]
	[local392 7] = [1210 233 2 1 1 2]
	[local399 4] = [1210 238 1]
	[local403 4] = [1210 239 1]
	[local407 4] = [1210 45 1]
	[local411 4] = [1210 46 1]
	[local415 4] = [1210 3 1]
	[local419 5] = [1210 242 1 1]
	local424
	[local425 4]
	local429
	local430
	local431
	local432
	[local433 4] = [1211 0 1]
	[local437 4] = [1211 1 1]
	[local441 4] = [1211 2 1]
	[local445 7] = [1211 3 1 2 1 2]
	[local452 5] = [1211 7 1 1]
	[local457 4] = [1211 9 1]
	[local461 6] = [1211 10 1 2 1]
	[local467 6] = [1211 13 1 2 1]
	[local473 7] = [1211 16 1 2 1 1]
	[local480 4] = [1211 20 1]
	[local484 4] = [1211 21 1]
	[local488 4] = [1211 22 1]
	[local492 6] = [1211 23 2 1 1]
	[local498 4] = [1317 12 1]
	[local502 4] = [1210 169 1]
	[local506 3] = [-1]
	[local509 3] = [-1 14636 5]
)
(procedure (localproc_01e6)
	(asm
		pushi    0
		callb    proc0_4,  0
		lal      local12
		bnt      code_01fe
		pushi    #disable
		pushi    1
		pushi    0
		pushi    201
		pushi    1
		pushi    5
		lag      global69
		send     12
code_01fe:
		pushi    #script
		pushi    0
		lofsa    marian
		send     4
		push    
		lofsa    waitToDie
		eq?     
		bnt      code_0222
		pushi    #disable
		pushi    1
		pushi    4
		pushi    201
		pushi    1
		pushi    5
		lag      global69
		send     12
		jmp      code_023a
code_0222:
		lsg      global126
		ldi      0
		eq?     
		bnt      code_023a
		lal      local430
		bnt      code_023a
		pushi    #disable
		pushi    1
		pushi    4
		lag      global69
		send     6
code_023a:
		ret     
	)
)

(procedure (localproc_30ea param1)
	(asm
		pushi    3
		lofsa    {LOOKUP\_ERROR}
		push    
		pushi    108
		lsl      local424
		callk    Display,  6
		pushi    2
		lea      @local425
		push    
		lsp      param1
		callk    StrCat,  4
		pushi    9
		lea      @local425
		push    
		pushi    100
		pushi    115
		pushi    35
		pushi    102
		lsg      global187
		pushi    103
		lsg      global186
		pushi    107
		callk    Display,  18
		sal      local424
		ret     
	)
)

(instance rm210 of Rm
	(properties
		picture 210
		style $0064
		east 220
		south 220
		west 220
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			lsg      global12
			ldi      220
			ne?     
			bnt      code_0021
			ldi      1
			sag      global108
code_0021:
			lsg      global130
			ldi      4
			eq?     
			bnt      code_003b
			lsg      global126
			ldi      0
			eq?     
			bnt      code_003b
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
code_003b:
			bt       code_0062
			lsg      global130
			ldi      7
			eq?     
			bnt      code_00b6
			lsg      global126
			ldi      0
			eq?     
			bnt      code_00b6
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_00b6
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
code_0062:
			bnt      code_00b6
			pushi    #init
			pushi    0
			lofsa    marian
			send     4
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    116
			pushi    146
			pushi    153
			pushi    145
			pushi    153
			pushi    152
			pushi    116
			pushi    152
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			sal      local432
			push    
			lag      global2
			send     6
			pushi    #setScript
			pushi    3
			lofsa    egoEnters
			push    
			pushi    0
			lsg      global108
			lag      global2
			send     10
			jmp      code_00de
code_00b6:
			lsg      global12
			ldi      179
			eq?     
			bnt      code_00ce
			pushi    #setScript
			pushi    1
			lofsa    carryIn
			push    
			lag      global2
			send     6
			jmp      code_00de
code_00ce:
			pushi    #setScript
			pushi    3
			lofsa    egoEnters
			push    
			pushi    0
			lsg      global108
			lag      global2
			send     10
code_00de:
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			pushi    #number
			pushi    1
			pushi    905
			pushi    42
			pushi    0
			lag      global100
			send     10
			pushi    43
			pushi    1
			lsg      global130
			ldi      10
			ne?     
			bnt      code_0108
			ldi      210
			jmp      code_010b
code_0108:
			ldi      217
code_010b:
			push    
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #init
			pushi    0
			lofsa    willows
			send     4
			pushi    #init
			pushi    0
			lofsa    ferns
			send     4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_0136
			pushi    #doit
			pushi    0
			send     4
			jmp      code_0170
code_0136:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			bnt      code_0165
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			pushi    #setScript
			pushi    3
			lofsa    walkOut
			push    
			pushi    0
			pushi    #edgeToRoom
			pushi    1
			lsg      global108
			self     6
			push    
			lag      global2
			send     10
			jmp      code_0170
code_0165:
			lal      local431
			bnt      code_0170
			pushi    #doit
			pushi    0
			send     4
code_0170:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global113
			send     12
			pushi    #actions
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			pushi    1
			pushi    220
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_043a
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #illegalBits
			pushi    1
			pushi    0
			lag      global0
			send     6
			lsg      global126
			ldi      0
			eq?     
			bnt      code_02bc
			lofsa    weaponsCheck
			sal      local431
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    22
			pushi    228
			pushi    161
			pushi    201
			pushi    147
			pushi    171
			pushi    143
			pushi    136
			pushi    143
			pushi    96
			pushi    147
			pushi    76
			pushi    152
			pushi    63
			pushi    160
			pushi    0
			pushi    160
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    161
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     58
			push    
			lag      global2
			send     6
			jmp      code_0310
code_02bc:
			lofsa    groveClosed
			sal      local431
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    228
			pushi    161
			pushi    223
			pushi    159
			pushi    193
			pushi    172
			pushi    108
			pushi    172
			pushi    70
			pushi    157
			pushi    63
			pushi    160
			pushi    0
			pushi    160
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    161
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			push    
			lag      global2
			send     6
code_0310:
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    319
			pushi    178
			pushi    303
			pushi    186
			pushi    248
			pushi    186
			pushi    224
			pushi    178
			pushi    251
			pushi    170
			pushi    300
			pushi    170
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    60
			pushi    177
			pushi    41
			pushi    184
			pushi    4
			pushi    184
			pushi    0
			pushi    176
			pushi    16
			pushi    170
			pushi    43
			pushi    170
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    224
			pushi    159
			pushi    223
			pushi    162
			pushi    194
			pushi    173
			pushi    107
			pushi    173
			pushi    74
			pushi    162
			pushi    67
			pushi    156
			pushi    2
			pushi    58
			pushi    313
			pushi    58
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			lag      global2
			send     10
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_03ee
			pushi    #posn
			pushi    2
			pushi    142
			pushi    240
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    142
			pushi    183
			pushSelf
			lag      global0
			send     24
			jmp      code_0436
code_03ee:
			dup     
			ldi      2
			eq?     
			bnt      code_0416
			pushi    #posn
			pushi    2
			pushi    65526
			pushi    170
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    40
			pushi    170
			pushSelf
			lag      global0
			send     24
			jmp      code_0436
code_0416:
			pushi    #posn
			pushi    2
			pushi    325
			pushi    170
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    250
			pushi    170
			pushSelf
			lag      global0
			send     24
code_0436:
			toss    
			jmp      code_062b
code_043a:
			dup     
			ldi      1
			eq?     
			bnt      code_0474
			pushi    1
			pushi    179
			callb    proc0_5,  2
			bnt      code_046b
			pushi    1
			pushi    179
			callb    proc0_7,  2
			pushi    4
			lea      @local419
			push    
			lea      @local506
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_062b
code_046b:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_062b
code_0474:
			dup     
			ldi      2
			eq?     
			bnt      code_04f7
			pushi    #contains
			pushi    1
			lofsa    marian
			push    
			lag      global5
			send     6
			bnt      code_04ea
			lsg      global130
			dup     
			ldi      4
			eq?     
			bnt      code_04db
			lsg      global149
			dup     
			ldi      0
			eq?     
			bnt      code_04b0
			pushi    4
			lea      @local346
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_04d7
code_04b0:
			dup     
			ldi      1
			eq?     
			bnt      code_04be
			ldi      1
			aTop     cycles
			jmp      code_04d7
code_04be:
			dup     
			ldi      2
			eq?     
			bnt      code_04d7
			pushi    4
			lea      @local361
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
code_04d7:
			toss    
			jmp      code_04e6
code_04db:
			dup     
			ldi      7
			eq?     
			bnt      code_04e6
			ldi      1
			aTop     cycles
code_04e6:
			toss    
			jmp      code_062b
code_04ea:
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_062b
code_04f7:
			dup     
			ldi      3
			eq?     
			bnt      code_0518
			pushi    1
			pushi    155
			callb    proc0_6,  2
			pushi    #setScript
			pushi    2
			lofsa    disarm
			push    
			pushSelf
			self     8
			ldi      1
			sal      local430
			jmp      code_062b
code_0518:
			dup     
			ldi      4
			eq?     
			bnt      code_0539
			lsg      global130
			ldi      7
			eq?     
			bnt      code_0529
			ipToa    state
code_0529:
			pushi    #loop
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			ldi      2
			aTop     cycles
			jmp      code_062b
code_0539:
			dup     
			ldi      5
			eq?     
			bnt      code_0566
			lsg      global149
			dup     
			ldi      1
			eq?     
			bnt      code_055e
			pushi    4
			lea      @local356
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_0562
code_055e:
			ldi      1
			aTop     cycles
code_0562:
			toss    
			jmp      code_062b
code_0566:
			dup     
			ldi      6
			eq?     
			bnt      code_0618
			lsg      global130
			dup     
			ldi      4
			eq?     
			bnt      code_05bc
			lsg      global149
			dup     
			ldi      0
			eq?     
			bnt      code_0594
			pushi    4
			lea      @local351
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_05b8
code_0594:
			dup     
			ldi      2
			eq?     
			bnt      code_05b4
			pushi    4
			lea      @local366
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local12
			jmp      code_05b8
code_05b4:
			ldi      1
			aTop     cycles
code_05b8:
			toss    
			jmp      code_0614
code_05bc:
			dup     
			ldi      7
			eq?     
			bnt      code_0614
			lsg      global149
			dup     
			ldi      0
			eq?     
			bnt      code_05e1
			pushi    4
			lea      @local372
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_0613
code_05e1:
			dup     
			ldi      1
			eq?     
			bnt      code_05fd
			pushi    4
			lea      @local386
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_0613
code_05fd:
			pushi    4
			lea      @local392
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local12
code_0613:
			toss    
code_0614:
			toss    
			jmp      code_062b
code_0618:
			dup     
			ldi      7
			eq?     
			bnt      code_062b
			pushi    0
			call     localproc_01e6,  0
			+ag      global149
			pushi    #dispose
			pushi    0
			self     4
code_062b:
			toss    
			ret     
		)
	)
)

(instance disarm of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06d5
			pushi    0
			callb    proc0_3,  0
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			aTop     register
			pToa     register
			bnt      code_06a0
			pushi    #isMemberOf
			pushi    1
			class    PolyPath
			push    
			pToa     register
			send     6
			bnt      code_06a0
			pushi    #mover
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_06ad
code_06a0:
			pushi    #setMotion
			pushi    1
			ldi      0
			aTop     register
			push    
			lag      global0
			send     6
code_06ad:
			pushi    1
			pushi    155
			callb    proc0_5,  2
			bnt      code_06be
			ldi      1
			aTop     cycles
			jmp      code_06cb
code_06be:
			pushi    3
			pushi    1210
			pushi    218
			pushSelf
			calle    proc13_4,  6
code_06cb:
			pushi    1
			pushi    155
			callb    proc0_6,  2
			jmp      code_0901
code_06d5:
			dup     
			ldi      1
			eq?     
			bnt      code_06f2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    149
			pushi    175
			pushSelf
			lag      global0
			send     12
			jmp      code_0901
code_06f2:
			dup     
			ldi      2
			eq?     
			bnt      code_0708
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_0901
code_0708:
			dup     
			ldi      3
			eq?     
			bnt      code_078b
			pushi    5
			pushi    1
			pushi    #lsBottom
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
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
			pushi    66
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     46
			pushi    #posn
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
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    bow
			send     18
			pushi    2
			pushi    128
			pushi    702
			callk    Load,  4
			pushi    2
			pushi    128
			pushi    703
			callk    Load,  4
			jmp      code_0901
code_078b:
			dup     
			ldi      4
			eq?     
			bnt      code_07a1
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0901
code_07a1:
			dup     
			ldi      5
			eq?     
			bnt      code_07e2
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
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lag      global0
			send     32
			jmp      code_0901
code_07e2:
			dup     
			ldi      6
			eq?     
			bnt      code_0826
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    17
			pushi    1
			pushi    16641
			pushi    107
			pushi    0
			lofsa    quiver
			send     18
			pushi    3
			pushi    2
			pushi    702
			pushi    703
			callb    proc0_2,  6
			ldi      12
			aTop     ticks
			jmp      code_0901
code_0826:
			dup     
			ldi      7
			eq?     
			bnt      code_0869
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    bow
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lofsa    bow
			send     10
			pushi    #cycleSpeed
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lag      global0
			send     4
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    149
			pushi    172
			pushSelf
			lag      global0
			send     18
			jmp      code_0901
code_0869:
			dup     
			ldi      8
			eq?     
			bnt      code_08cc
			pToa     register
			bnt      code_08a5
			pushi    0
			call     localproc_01e6,  0
			pushi    #mover
			pushi    1
			pTos     register
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    #finalX
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #finalY
			pushi    0
			pToa     register
			send     4
			push    
			lag      global0
			send     16
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0901
code_08a5:
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    165
			pushi    149
			pushSelf
			lag      global0
			send     12
			pushi    #contains
			pushi    1
			lofsa    marian
			push    
			lag      global5
			send     6
			not     
			bnt      code_0901
			ipToa    state
			jmp      code_0901
code_08cc:
			dup     
			ldi      9
			eq?     
			bnt      code_08e2
			pushi    3
			lsg      global0
			lofsa    marian
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0901
code_08e2:
			dup     
			ldi      10
			eq?     
			bnt      code_08f0
			ldi      2
			aTop     cycles
			jmp      code_0901
code_08f0:
			dup     
			ldi      11
			eq?     
			bnt      code_0901
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_0901:
			toss    
			ret     
		)
	)
)

(instance rearm of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_09b5
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    128
			pushi    0
			callk    Load,  4
			pushi    2
			pushi    128
			pushi    1
			callk    Load,  4
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			aTop     register
			pToa     register
			bnt      code_0986
			pushi    #isMemberOf
			pushi    1
			class    PolyPath
			push    
			pToa     register
			send     6
			bnt      code_0986
			pushi    #mover
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_0993
code_0986:
			pushi    #setMotion
			pushi    1
			ldi      0
			aTop     register
			push    
			lag      global0
			send     6
code_0993:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    bow
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    bow
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0b27
code_09b5:
			dup     
			ldi      1
			eq?     
			bnt      code_09cb
			pushi    #setHeading
			pushi    2
			pushi    135
			pushSelf
			lag      global0
			send     8
			jmp      code_0b27
code_09cb:
			dup     
			ldi      2
			eq?     
			bnt      code_0a20
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
			pushi    7
			pushi    1
			pushi    5
			pushi    219
			pushi    1
			pushi    12
			pushi    66
			pushi    1
			pushi    13
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     46
			pushi    #dispose
			pushi    0
			lofsa    quiver
			send     4
			jmp      code_0b27
code_0a20:
			dup     
			ldi      3
			eq?     
			bnt      code_0a2e
			ldi      12
			aTop     ticks
			jmp      code_0b27
code_0a2e:
			dup     
			ldi      4
			eq?     
			bnt      code_0a64
			pushi    #posn
			pushi    2
			pushi    #x
			pushi    0
			lofsa    bow
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    bow
			send     4
			push    
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
			lag      global0
			send     28
			jmp      code_0b27
code_0a64:
			dup     
			ldi      5
			eq?     
			bnt      code_0a8c
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    bow
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			lofsa    bow
			send     10
			ldi      12
			aTop     ticks
			jmp      code_0b27
code_0a8c:
			dup     
			ldi      6
			eq?     
			bnt      code_0aae
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lofsa    bow
			send     6
			jmp      code_0b27
code_0aae:
			dup     
			ldi      7
			eq?     
			bnt      code_0abc
			ldi      12
			aTop     ticks
			jmp      code_0b27
code_0abc:
			dup     
			ldi      8
			eq?     
			bnt      code_0b27
			pushi    #dispose
			pushi    0
			lofsa    bow
			send     4
			pushi    1
			pushi    4
			callb    proc0_2,  2
			pushi    0
			call     localproc_01e6,  0
			pushi    66
			pushi    1
			pushi    #sel_65535
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			sub     
			push    
			lag      global0
			send     14
			pToa     register
			bnt      code_0b22
			pushi    #mover
			pushi    1
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    #finalX
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #finalY
			pushi    0
			pToa     register
			send     4
			push    
			lag      global0
			send     16
code_0b22:
			pushi    #dispose
			pushi    0
			self     4
code_0b27:
			toss    
			ret     
		)
	)
)

(instance weaponsCheck of Code
	(properties)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			sat      temp0
			bnt      code_0b8e
			lal      local430
			not     
			bnt      code_0ba0
			pushi    #setScript
			pushi    1
			lofsa    disarm
			push    
			lag      global2
			send     6
			jmp      code_0ba0
code_0b8e:
			lal      local430
			bnt      code_0ba0
			pushi    #setScript
			pushi    1
			lofsa    rearm
			push    
			lag      global2
			send     6
code_0ba0:
			lat      temp0
			sal      local430
			ret     
		)
	)
)

(instance groveClosed of Code
	(properties)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_0c01
			ldi      0
			sal      local431
			pushi    3
			pushi    1210
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0bf8
			lsg      global130
			ldi      8
			eq?     
			bnt      code_0bf8
			ldi      248
			jmp      code_0bfb
code_0bf8:
			ldi      249
code_0bfb:
			push    
			pushi    1
			calle    proc13_4,  6
code_0c01:
			ret     
		)
	)
)

(instance bow of Prop
	(properties
		lookStr 7
		view 15
		loop 6
		priority 14
		signal $4010
		cycleSpeed 12
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			ne?     
			bt       code_0c2c
			lal      local12
code_0c2c:
			bnt      code_0c3d
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
			jmp      code_0c57
code_0c3d:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			lofsa    rearm
			push    
			lag      global2
			send     6
			ldi      0
			sal      local430
code_0c57:
			ret     
		)
	)
)

(instance quiver of View
	(properties
		lookStr 7
		view 15
		loop 4
		signal $4101
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    bow
			send     4
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0db5
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sat      temp1
			lsg      global108
			dup     
			ldi      3
			eq?     
			bnt      code_0d67
			ldi      240
			sat      temp1
			jmp      code_0d86
code_0d67:
			dup     
			ldi      2
			eq?     
			bnt      code_0d78
			lst      temp0
			ldi      20
			add     
			sat      temp0
			jmp      code_0d86
code_0d78:
			dup     
			ldi      4
			eq?     
			bnt      code_0d86
			lst      temp0
			ldi      20
			sub     
			sat      temp0
code_0d86:
			toss    
			pushi    0
			callb    proc0_3,  0
			lsg      global108
			ldi      1
			ne?     
			bnt      code_0dac
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     18
			jmp      code_0dcb
code_0dac:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0dcb
code_0db5:
			dup     
			ldi      1
			eq?     
			bnt      code_0dcb
			pushi    0
			call     localproc_01e6,  0
			pushi    #newRoom
			pushi    1
			pTos     register
			lag      global2
			send     6
code_0dcb:
			toss    
			ret     
		)
	)
)

(instance carryIn of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0eff
			pushi    0
			callb    proc0_3,  0
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    34
			pushi    228
			pushi    161
			pushi    201
			pushi    147
			pushi    171
			pushi    143
			pushi    136
			pushi    143
			pushi    96
			pushi    147
			pushi    76
			pushi    152
			pushi    63
			pushi    160
			pushi    14
			pushi    160
			pushi    14
			pushi    170
			pushi    43
			pushi    170
			pushi    60
			pushi    177
			pushi    36
			pushi    186
			pushi    248
			pushi    186
			pushi    224
			pushi    178
			pushi    251
			pushi    170
			pushi    302
			pushi    170
			pushi    302
			pushi    161
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     82
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    129
			pushi    149
			pushi    185
			pushi    147
			pushi    190
			pushi    151
			pushi    182
			pushi    156
			pushi    127
			pushi    159
			pushi    119
			pushi    154
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     8
			pushi    #actions
			pushi    1
			lofsa    dying
			push    
			pushi    5
			pushi    1
			pushi    510
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    154
			dup     
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    289
			pushi    1
			pushi    1
			lofsa    marian
			send     44
			jmp      code_0fb5
code_0eff:
			dup     
			ldi      1
			eq?     
			bnt      code_0f23
			ldi      1
			sal      local429
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     20
			jmp      code_0fb5
code_0f23:
			dup     
			ldi      2
			eq?     
			bnt      code_0f3e
			pushi    4
			lea      @local19
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0fb5
code_0f3e:
			dup     
			ldi      3
			eq?     
			bnt      code_0f53
			pushi    3
			pushi    1210
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_0fb5
code_0f53:
			dup     
			ldi      4
			eq?     
			bnt      code_0f68
			pushi    3
			pushi    1210
			pushi    2
			pushSelf
			calle    proc13_4,  6
			jmp      code_0fb5
code_0f68:
			dup     
			ldi      5
			eq?     
			bnt      code_0fb5
			pushi    #view
			pushi    1
			pushi    510
			pushi    162
			pushi    1
			pushi    4
			pushi    66
			pushi    1
			pushi    65535
			pushi    284
			pushi    2
			pushi    167
			pushi    152
			pushi    107
			pushi    0
			pushi    142
			pushi    1
			lofsa    waitToStand
			push    
			lag      global0
			send     36
			pushi    #loop
			pushi    1
			pushi    3
			pushi    142
			pushi    1
			lofsa    waitToDie
			push    
			lofsa    marian
			send     12
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_0fb5:
			toss    
			ret     
		)
	)
)

(instance waitToStand of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_10dc
			pushi    #cue
			pushi    0
			self     4
code_10dc:
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
			bnt      code_1023
			pushi    0
			callb    proc0_3,  0
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			aTop     register
			pushi    #mover
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    65535
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     20
			jmp      code_10ca
code_1023:
			dup     
			ldi      2
			eq?     
			bnt      code_1057
			pushi    3
			pushi    2
			pushi    702
			pushi    703
			callb    proc0_2,  6
			pushi    #y
			pushi    1
			pushi    150
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    147
			pushSelf
			lag      global0
			send     18
			jmp      code_10ca
code_1057:
			dup     
			ldi      3
			eq?     
			bnt      code_10ca
			pToa     register
			bnt      code_1090
			pushi    #isMemberOf
			pushi    1
			class    PolyPath
			push    
			pToa     register
			send     6
			bnt      code_1090
			pushi    #setMotion
			pushi    3
			pTos     register
			pushi    #finalX
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #finalY
			pushi    0
			pToa     register
			send     4
			push    
			lag      global0
			send     10
			jmp      code_10ab
code_1090:
			pushi    #setMotion
			pushi    3
			pTos     register
			pushi    #x
			pushi    0
			pToa     register
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     register
			send     4
			push    
			lag      global0
			send     10
code_10ab:
			pushi    #cycleSpeed
			pushi    1
			pushi    #moveSpeed
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     6
			ldi      0
			sal      local429
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_10ca:
			toss    
			ret     
		)
	)
)

(instance waitToDie of Script
	(properties)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #doit
			pushi    0
			super    Script,  4
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			sat      temp0
			bnt      code_1294
			lal      local430
			not     
			bnt      code_1294
			pushi    2
			pushi    1210
			pushi    4
			calle    proc13_4,  4
code_1294:
			lat      temp0
			sal      local430
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
			bnt      code_112f
			ldi      60
			aTop     seconds
			jmp      code_1267
code_112f:
			dup     
			ldi      1
			eq?     
			bnt      code_1152
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    65036
			calle    proc806_1,  2
			pushi    #setScript
			pushi    2
			lofsa    sit
			push    
			pushSelf
			self     8
			jmp      code_1267
code_1152:
			dup     
			ldi      2
			eq?     
			bnt      code_117f
			pushi    #number
			pushi    1
			pushi    215
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    4
			lea      @local415
			push    
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1267
code_117f:
			dup     
			ldi      3
			eq?     
			bnt      code_11a8
			pushi    2
			pushi    128
			pushi    501
			callk    Load,  4
			pushi    #cycleSpeed
			pushi    1
			pushi    9
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     18
			jmp      code_1267
code_11a8:
			dup     
			ldi      4
			eq?     
			bnt      code_11db
			pushi    5
			pushi    #superClass
			pushi    501
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_1267
code_11db:
			dup     
			ldi      5
			eq?     
			bnt      code_1243
			ldi      98
			aTop     register
code_11e6:
			pTos     register
			ldi      0
			ge?     
			bnt      code_120a
			pushi    4
			dup     
			pushi    1
			pushi    255
			pTos     register
			callk    Palette,  8
			pushi    1
			pushi    4
			callk    Wait,  2
			pTos     register
			ldi      2
			sub     
			aTop     register
			jmp      code_11e6
code_120a:
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    100
			lag      global2
			send     8
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    138
			pushi    1
			pushSelf
			lag      global2
			send     12
			pushi    #script
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			lag      global2
			aTop     client
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			ldi      3
			aTop     cycles
			jmp      code_1267
code_1243:
			dup     
			ldi      6
			eq?     
			bnt      code_1267
			pushi    4
			dup     
			pushi    1
			pushi    255
			pushi    100
			callk    Palette,  8
			pushi    1
			pushi    5
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_1267:
			toss    
			ret     
		)
	)
)

(instance marian of Actor
	(properties
		x 135
		y 150
		lookStr 5
		view 212
		loop 2
		signal $4000
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_12ee
			pushi    2
			pushi    1210
			pushi    14
			calle    proc13_4,  4
			jmp      code_163f
code_12ee:
			dup     
			ldi      5
			eq?     
			bnt      code_140e
			lsg      global130
			dup     
			ldi      4
			eq?     
			bnt      code_137a
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bnt      code_1324
			lal      local4
			bnt      code_1324
			pushi    4
			pushi    1
			lea      @local28
			push    
			pushi    22
			pushi    3
			calle    proc851_0,  8
			jmp      code_140a
code_1324:
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bnt      code_1349
			ldi      1
			sal      local4
			pushi    3
			lea      @local23
			push    
			pushi    999
			pushi    22
			calle    proc851_0,  6
			jmp      code_140a
code_1349:
			lal      local5
			bnt      code_1362
			pushi    4
			pushi    1
			lea      @local46
			push    
			pushi    22
			pushi    3
			calle    proc851_0,  8
			jmp      code_140a
code_1362:
			ldi      1
			sal      local5
			pushi    3
			lea      @local32
			push    
			pushi    999
			pushi    22
			calle    proc851_0,  6
			jmp      code_140a
code_137a:
			dup     
			ldi      7
			eq?     
			bnt      code_140a
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_13a2
			lal      local6
			bnt      code_13a2
			pushi    3
			lea      @local56
			push    
			pushi    22
			pushi    0
			calle    proc851_0,  6
			jmp      code_140a
code_13a2:
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_13c0
			+al      local6
			pushi    3
			lea      @local50
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
			jmp      code_140a
code_13c0:
			lsl      local7
			ldi      1
			gt?     
			bnt      code_13d8
			pushi    2
			lea      @local75
			push    
			pushi    22
			calle    proc851_0,  4
			jmp      code_140a
code_13d8:
			lsl      local7
			ldi      1
			eq?     
			bnt      code_13f4
			+al      local7
			pushi    3
			lea      @local67
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
			jmp      code_140a
code_13f4:
			ldi      1
			bnt      code_140a
			+al      local7
			pushi    3
			lea      @local60
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
code_140a:
			toss    
			jmp      code_163f
code_140e:
			dup     
			ldi      4
			eq?     
			bnt      code_1634
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_1430
			pushi    2
			lea      @local407
			push    
			pushi    22
			calle    proc851_0,  4
			jmp      code_1630
code_1430:
			dup     
			ldi      0
			eq?     
			bnt      code_1449
			pushi    2
			lea      @local411
			push    
			pushi    22
			calle    proc851_0,  4
			jmp      code_1630
code_1449:
			dup     
			ldi      2
			eq?     
			bnt      code_14c7
			lsg      global130
			dup     
			ldi      4
			eq?     
			bnt      code_147b
			lal      local16
			bnt      code_146c
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_14c3
code_146c:
			pushi    #setScript
			pushi    1
			lofsa    giveEmerald
			push    
			lag      global2
			send     6
			jmp      code_14c3
code_147b:
			dup     
			ldi      7
			eq?     
			bnt      code_14c3
			lal      local16
			bnt      code_1495
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_14c3
code_1495:
			pushi    1
			pushi    143
			callb    proc0_5,  2
			bnt      code_14b7
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_14b7
			pushi    #setScript
			pushi    1
			lofsa    sex
			push    
			lag      global2
			send     6
			jmp      code_14c3
code_14b7:
			pushi    #setScript
			pushi    1
			lofsa    giveEmerald
			push    
			lag      global2
			send     6
code_14c3:
			toss    
			jmp      code_1630
code_14c7:
			dup     
			ldi      15
			eq?     
			bnt      code_14dd
			pushi    #setScript
			pushi    1
			lofsa    giveComb
			push    
			lag      global2
			send     6
			jmp      code_1630
code_14dd:
			dup     
			ldi      14
			eq?     
			bnt      code_14f8
			pushi    3
			lea      @local282
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
			jmp      code_1630
code_14f8:
			dup     
			ldi      12
			eq?     
			bnt      code_1532
			lal      local8
			bnt      code_151a
			pushi    4
			pushi    1
			lea      @local297
			push    
			pushi    22
			pushi    3
			calle    proc851_0,  8
			jmp      code_1630
code_151a:
			ldi      1
			sal      local8
			pushi    3
			lea      @local287
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
			jmp      code_1630
code_1532:
			dup     
			ldi      10
			eq?     
			bnt      code_1568
			lsg      global130
			ldi      7
			eq?     
			bnt      code_1630
			lal      local9
			bnt      code_1554
			pushi    2
			pushi    1210
			pushi    170
			calle    proc13_4,  4
			jmp      code_1630
code_1554:
			pushi    3
			lea      @local301
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
			jmp      code_1630
code_1568:
			dup     
			ldi      17
			eq?     
			bnt      code_159d
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_158e
			pushi    4
			pushi    1
			lea      @local502
			push    
			pushi    22
			pushi    3
			calle    proc851_0,  8
			jmp      code_1630
code_158e:
			pushi    #setScript
			pushi    1
			lofsa    giveScroll
			push    
			lag      global2
			send     6
			jmp      code_1630
code_159d:
			dup     
			ldi      16
			eq?     
			bnt      code_15b3
			pushi    #setScript
			pushi    1
			lofsa    giveFScroll
			push    
			lag      global2
			send     6
			jmp      code_1630
code_15b3:
			dup     
			ldi      18
			eq?     
			bnt      code_1608
			lsg      global130
			dup     
			ldi      7
			eq?     
			bnt      code_15f2
			lal      local11
			bnt      code_15de
			pushi    4
			pushi    1
			lea      @local338
			push    
			pushi    22
			pushi    3
			calle    proc851_0,  8
			jmp      code_1604
code_15de:
			pushi    3
			lea      @local330
			push    
			pushi    1
			pushi    22
			calle    proc851_0,  6
			jmp      code_1604
code_15f2:
			dup     
			ldi      10
			eq?     
			bnt      code_1604
			pushi    2
			pushi    1210
			pushi    178
			calle    proc13_4,  4
code_1604:
			toss    
			jmp      code_1630
code_1608:
			dup     
			ldi      4
			eq?     
			bnt      code_1625
			pushi    4
			pushi    1
			lea      @local342
			push    
			pushi    22
			pushi    3
			calle    proc851_0,  8
			jmp      code_1630
code_1625:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_1630:
			toss    
			jmp      code_163f
code_1634:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_163f:
			toss    
			ret     
		)
	)
)

(instance giveEmerald of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1728
			pushi    0
			callb    proc0_3,  0
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			not     
			bnt      code_16fe
			pushi    #setScript
			pushi    2
			lofsa    disarm
			push    
			pushSelf
			self     8
			ldi      4
			sal      local430
			dpToa    state
			ret     
code_16fe:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      65535
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_19d9
code_1728:
			dup     
			ldi      1
			eq?     
			bnt      code_1756
			ldi      1
			aTop     notKilled
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    #loop
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    2
			pushi    128
			pushi    215
			callk    Load,  4
			ldi      20
			aTop     ticks
			jmp      code_19d9
code_1756:
			dup     
			ldi      2
			eq?     
			bnt      code_179e
			pushi    #hide
			pushi    0
			lofsa    marian
			send     4
			pushi    5
			pushi    #superClass
			pushi    215
			pushi    219
			pushi    1
			pushi    6
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     32
			ldi      40
			aTop     ticks
			jmp      code_19d9
code_179e:
			dup     
			ldi      3
			eq?     
			bnt      code_1801
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
			pushi    3
			pushi    1
			pushi    702
			pushi    703
			callb    proc0_2,  6
			pushi    5
			pushi    #superClass
			pushi    215
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    3
			pushi    194
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     36
			jmp      code_19d9
code_1801:
			dup     
			ldi      4
			eq?     
			bnt      code_18d2
			pushi    5
			pushi    #superClass
			pushi    211
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      65535
			add     
			push    
			pushi    6
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    212
			lofsa    marian
			send     26
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bt       code_184d
			lsg      global130
			ldi      7
			eq?     
			bnt      code_189c
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
code_184d:
			bnt      code_189c
			lsg      global130
			ldi      4
			eq?     
			bnt      code_1868
			pushi    2
			lea      @local79
			push    
			pushi    22
			calle    proc851_0,  4
			jmp      code_188f
code_1868:
			pushi    1
			pushi    143
			callb    proc0_5,  2
			bnt      code_1882
			pushi    2
			lea      @local158
			push    
			pushi    22
			calle    proc851_0,  4
			jmp      code_188f
code_1882:
			pushi    2
			lea      @local154
			push    
			pushi    22
			calle    proc851_0,  4
code_188f:
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_18cb
code_189c:
			pushi    2
			pushi    50
			pushi    143
			calle    proc806_1,  4
			ldi      1
			sal      local16
			lal      local18
			bnt      code_18c5
			pushi    5
			lea      @local83
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_18cb
code_18c5:
			ipToa    state
			ldi      1
			aTop     cycles
code_18cb:
			ldi      1
			sal      local18
			jmp      code_19d9
code_18d2:
			dup     
			ldi      5
			eq?     
			bnt      code_1912
			lsg      global130
			dup     
			ldi      4
			eq?     
			bnt      code_18f6
			pushi    5
			lea      @local87
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_190e
code_18f6:
			dup     
			ldi      7
			eq?     
			bnt      code_190e
			pushi    5
			lea      @local91
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
code_190e:
			toss    
			jmp      code_19d9
code_1912:
			dup     
			ldi      6
			eq?     
			bnt      code_192c
			pushi    4
			lea      @local95
			push    
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  8
			jmp      code_19d9
code_192c:
			dup     
			ldi      7
			eq?     
			bnt      code_1941
			pushi    #setScript
			pushi    2
			lofsa    unite
			push    
			pushSelf
			self     8
			jmp      code_19d9
code_1941:
			dup     
			ldi      8
			eq?     
			bnt      code_195c
			pushi    5
			lea      @local107
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_19d9
code_195c:
			dup     
			ldi      9
			eq?     
			bnt      code_199a
			lsg      global130
			dup     
			ldi      4
			eq?     
			bnt      code_197f
			pushi    4
			lea      @local120
			push    
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  8
			jmp      code_1996
code_197f:
			dup     
			ldi      7
			eq?     
			bnt      code_1996
			pushi    4
			lea      @local124
			push    
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  8
code_1996:
			toss    
			jmp      code_19d9
code_199a:
			dup     
			ldi      10
			eq?     
			bnt      code_19d9
			lsg      global130
			ldi      4
			eq?     
			bnt      code_19b4
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			not     
code_19b4:
			bt       code_19bd
			pushi    1
			pushi    34
			callb    proc0_6,  2
code_19bd:
			bnt      code_19cf
			pushi    #setScript
			pushi    1
			lofsa    thereSheGoes
			push    
			lag      global2
			send     6
			jmp      code_19d4
code_19cf:
			pushi    0
			call     localproc_01e6,  0
code_19d4:
			pushi    #dispose
			pushi    0
			self     4
code_19d9:
			toss    
			ret     
		)
	)
)

(instance thereSheGoes of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a47
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    114
			pushi    177
			pushSelf
			lofsa    marian
			send     18
			jmp      code_1a9b
code_1a47:
			dup     
			ldi      1
			eq?     
			bnt      code_1a64
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    110
			pushi    245
			pushSelf
			lofsa    marian
			send     12
			jmp      code_1a9b
code_1a64:
			dup     
			ldi      2
			eq?     
			bnt      code_1a9b
			ldi      0
			sal      local1
			sal      local2
			pushi    #dispose
			pushi    0
			lofsa    marian
			send     4
			pushi    #delete
			pushi    1
			lsl      local432
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     6
			pushi    #dispose
			pushi    0
			lal      local432
			send     4
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_1a9b:
			toss    
			ret     
		)
	)
)

(instance sex of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b38
			pushi    0
			callb    proc0_3,  0
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			not     
			bnt      code_1b0e
			pushi    #setScript
			pushi    2
			lofsa    disarm
			push    
			pushSelf
			self     8
			ldi      4
			sal      local430
			dpToa    state
			ret     
code_1b0e:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      21
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      65531
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1e7a
code_1b38:
			dup     
			ldi      1
			eq?     
			bnt      code_1b4e
			pushi    #setHeading
			pushi    2
			pushi    270
			pushSelf
			lag      global0
			send     8
			jmp      code_1e7a
code_1b4e:
			dup     
			ldi      2
			eq?     
			bnt      code_1b5c
			ldi      2
			aTop     cycles
			jmp      code_1e7a
code_1b5c:
			dup     
			ldi      3
			eq?     
			bnt      code_1b76
			pushi    4
			lea      @local128
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_1e7a
code_1b76:
			dup     
			ldi      4
			eq?     
			bnt      code_1bc4
			pushi    5
			pushi    1
			pushi    #cycleDone
			pushi    6
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      18
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			add     
			push    
			pushi    219
			pushi    1
			pushi    15
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     40
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			jmp      code_1e7a
code_1bc4:
			dup     
			ldi      5
			eq?     
			bnt      code_1bf3
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      15
			add     
			push    
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     26
			jmp      code_1e7a
code_1bf3:
			dup     
			ldi      6
			eq?     
			bnt      code_1c01
			ldi      100
			aTop     ticks
			jmp      code_1e7a
code_1c01:
			dup     
			ldi      7
			eq?     
			bnt      code_1c18
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     8
			jmp      code_1e7a
code_1c18:
			dup     
			ldi      8
			eq?     
			bnt      code_1c26
			ldi      45
			aTop     ticks
			jmp      code_1e7a
code_1c26:
			dup     
			ldi      9
			eq?     
			bnt      code_1c40
			pushi    4
			lea      @local143
			push    
			pushi    22
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1e7a
code_1c40:
			dup     
			ldi      10
			eq?     
			bnt      code_1c4e
			ldi      2
			aTop     seconds
			jmp      code_1e7a
code_1c4e:
			dup     
			ldi      11
			eq?     
			bnt      code_1c74
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
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
			lofsa    marian
			send     26
			jmp      code_1e7a
code_1c74:
			dup     
			ldi      12
			eq?     
			bnt      code_1c98
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    7
			pushi    1
			pushSelf
			lofsa    marian
			send     24
			jmp      code_1e7a
code_1c98:
			dup     
			ldi      13
			eq?     
			bnt      code_1cb5
			pushi    #cycleSpeed
			pushi    1
			pushi    35
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     14
			jmp      code_1e7a
code_1cb5:
			dup     
			ldi      14
			eq?     
			bnt      code_1cf8
			pushi    #dispose
			pushi    0
			lofsa    marian
			send     4
			pushi    #init
			pushi    0
			lofsa    mHead
			send     4
			pushi    #init
			pushi    0
			lofsa    rHead
			send     4
			pushi    #overlay
			pushi    1
			pushi    216
			lag      global2
			send     6
			pushi    8
			pushi    11
			pushi    0
			pushi    0
			pushi    192
			pushi    320
			pushi    2
			pushi    0
			pushi    0
			callk    Graph,  16
			ldi      4
			aTop     seconds
			jmp      code_1e7a
code_1cf8:
			dup     
			ldi      15
			eq?     
			bnt      code_1d1b
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    mHead
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    rHead
			send     8
			jmp      code_1e7a
code_1d1b:
			dup     
			ldi      16
			eq?     
			bnt      code_1d29
			ldi      60
			aTop     ticks
			jmp      code_1e7a
code_1d29:
			dup     
			ldi      17
			eq?     
			bnt      code_1da2
			ldi      98
			aTop     register
code_1d34:
			pTos     register
			ldi      0
			ge?     
			bnt      code_1d58
			pushi    4
			dup     
			pushi    1
			pushi    255
			pTos     register
			callk    Palette,  8
			pushi    1
			pushi    4
			callk    Wait,  2
			pTos     register
			ldi      2
			sub     
			aTop     register
			jmp      code_1d34
code_1d58:
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    7
			lag      global2
			send     8
			ldi      65535
			sag      global36
			pushi    #dispose
			pushi    0
			lofsa    marian
			send     4
			pushi    #dispose
			pushi    0
			lofsa    rHead
			send     4
			pushi    #dispose
			pushi    0
			lofsa    mHead
			send     4
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    bow
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			pushi    286
			pushi    0
			lofsa    quiver
			send     10
			ldi      3
			aTop     cycles
			jmp      code_1e7a
code_1da2:
			dup     
			ldi      18
			eq?     
			bnt      code_1dcf
			pushi    4
			dup     
			pushi    1
			pushi    255
			pushi    100
			callk    Palette,  8
			pushi    2
			pushi    50
			pushi    120
			calle    proc806_1,  4
			pushi    3
			pushi    1210
			pushi    85
			pushSelf
			calle    proc13_4,  6
			jmp      code_1e7a
code_1dcf:
			dup     
			ldi      19
			eq?     
			bnt      code_1e4c
			pushi    #drawPic
			pushi    2
			pushi    210
			pushi    10
			lag      global2
			send     8
			pushi    3
			pushi    1
			pushi    702
			pushi    703
			callb    proc0_2,  6
			pushi    #init
			pushi    0
			pushi    267
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     10
			pushi    #view
			pushi    1
			pushi    211
			pushi    6
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    135
			pushi    150
			pushi    107
			pushi    0
			pushi    289
			pushi    1
			pushi    1
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    212
			lofsa    marian
			send     44
			pushi    #z
			pushi    1
			pushi    0
			lofsa    bow
			send     6
			pushi    #z
			pushi    1
			pushi    0
			pushi    286
			pushi    0
			lofsa    quiver
			send     10
			ldi      2
			aTop     cycles
			jmp      code_1e7a
code_1e4c:
			dup     
			ldi      20
			eq?     
			bnt      code_1e66
			pushi    4
			lea      @local147
			push    
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  8
			jmp      code_1e7a
code_1e66:
			dup     
			ldi      21
			eq?     
			bnt      code_1e7a
			pushi    #setScript
			pushi    2
			lofsa    thereSheGoes
			push    
			pushSelf
			pToa     client
			send     8
code_1e7a:
			toss    
			ret     
		)
	)
)

(instance rHead of Prop
	(properties
		x 120
		y 73
		view 219
		priority 14
		signal $4010
		cycleSpeed 17
	)
)

(instance mHead of Prop
	(properties
		x 161
		y 87
		view 219
		loop 1
		priority 13
		signal $4010
		cycleSpeed 17
	)
)

(instance sit of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 152])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1fb5
			lal      local429
			bnt      code_1f9f
			ipToa    state
			ldi      1
			aTop     cycles
			jmp      code_1ff6
code_1f9f:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    167
			pushi    150
			pushSelf
			lag      global0
			send     12
			jmp      code_1ff6
code_1fb5:
			dup     
			ldi      1
			eq?     
			bnt      code_1fea
			ldi      0
			sal      local429
			pushi    #view
			pushi    1
			pushi    510
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    167
			pushi    152
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     34
			jmp      code_1ff6
code_1fea:
			dup     
			ldi      2
			eq?     
			bnt      code_1ff6
			pushi    #dispose
			pushi    0
			self     4
code_1ff6:
			toss    
			ret     
		)
	)
)

(instance heal of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp [temp0 2] [temp2 150])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2065
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    #setScript
			pushi    2
			lofsa    sit
			push    
			pushSelf
			self     8
			jmp      code_2217
code_2065:
			dup     
			ldi      1
			eq?     
			bnt      code_2094
			pushi    1
			pushi    143
			callb    proc0_5,  2
			bnt      code_2085
			pushi    3
			pushi    1210
			pushi    88
			pushSelf
			calle    proc13_4,  6
			jmp      code_2217
code_2085:
			pushi    3
			pushi    1210
			pushi    86
			pushSelf
			calle    proc13_4,  6
			jmp      code_2217
code_2094:
			dup     
			ldi      2
			eq?     
			bnt      code_20bc
			pushi    142
			pushi    3
			lofsa    unite
			push    
			pushSelf
			pushi    1
			pushi    143
			callb    proc0_5,  2
			bnt      code_20b4
			ldi      0
			jmp      code_20b6
code_20b4:
			ldi      87
code_20b6:
			push    
			self     10
			jmp      code_2217
code_20bc:
			dup     
			ldi      3
			eq?     
			bnt      code_20e4
			pushi    #number
			pushi    1
			pushi    210
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    3
			pushi    1210
			pushi    89
			pushSelf
			calle    proc13_4,  6
			jmp      code_2217
code_20e4:
			dup     
			ldi      4
			eq?     
			bnt      code_20f2
			ldi      60
			aTop     ticks
			jmp      code_2217
code_20f2:
			dup     
			ldi      5
			eq?     
			bnt      code_210c
			pushi    4
			lea      @local163
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_2217
code_210c:
			dup     
			ldi      6
			eq?     
			bnt      code_2126
			pushi    2
			pushi    300
			pushi    62
			calle    proc806_1,  4
			ldi      2
			aTop     seconds
			jmp      code_2217
code_2126:
			dup     
			ldi      7
			eq?     
			bnt      code_2141
			pushi    5
			lea      @local168
			push    
			pushi    1
			pushi    22
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2217
code_2141:
			dup     
			ldi      8
			eq?     
			bnt      code_21a0
			pushi    3
			pushi    1210
			pushi    96
			lea      @temp2
			push    
			callk    GetFarText,  6
			pushi    3
			pushi    1317
			pushi    65526
			lag      global140
			add     
			push    
			lea      @temp2
			push    
			pushi    1
			lea      @temp2
			push    
			callk    StrLen,  2
			add     
			push    
			callk    GetFarText,  6
			pushi    #underBits
			pushi    0
			pushi    2
			pushi    851
			pushi    3
			callk    ScriptID,  4
			aTop     register
			send     4
			bnt      code_2199
			pushi    #say
			pushi    5
			lea      @temp2
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			pToa     register
			send     14
			jmp      code_2217
code_2199:
			ldi      1
			aTop     cycles
			jmp      code_2217
code_21a0:
			dup     
			ldi      9
			eq?     
			bnt      code_21ba
			pushi    4
			lea      @local175
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_2217
code_21ba:
			dup     
			ldi      10
			eq?     
			bnt      code_21e1
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     20
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			jmp      code_2217
code_21e1:
			dup     
			ldi      11
			eq?     
			bnt      code_2205
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    6
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			ldi      60
			aTop     ticks
			jmp      code_2217
code_2205:
			dup     
			ldi      12
			eq?     
			bnt      code_2217
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_2217:
			toss    
			ret     
		)
	)
)

(instance dying of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2270
			pushi    3
			pushi    1210
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_2304
code_2270:
			dup     
			ldi      3
			eq?     
			bnt      code_2286
			pushi    3
			pushi    1210
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_2304
code_2286:
			dup     
			ldi      4
			eq?     
			bnt      code_22e2
			lsp      param2
			dup     
			ldi      2
			eq?     
			bnt      code_22a5
			pushi    #setScript
			pushi    1
			lofsa    heal
			push    
			lag      global2
			send     6
			jmp      code_22de
code_22a5:
			dup     
			ldi      10
			eq?     
			bnt      code_22bc
			pushi    3
			pushi    1210
			pushi    171
			pushi    1
			calle    proc13_4,  6
			jmp      code_22de
code_22bc:
			dup     
			ldi      18
			eq?     
			bnt      code_22d3
			pushi    3
			pushi    1210
			pushi    178
			pushi    1
			calle    proc13_4,  6
			jmp      code_22de
code_22d3:
			pushi    #doit
			pushi    1
			lsp      theVerb
			&rest    param3
			lag      global65
			send     6
code_22de:
			toss    
			jmp      code_2304
code_22e2:
			dup     
			ldi      5
			eq?     
			bnt      code_22f9
			pushi    3
			pushi    1210
			pushi    250
			pushi    1
			calle    proc13_4,  6
			jmp      code_2304
code_22f9:
			pushi    #doit
			pushi    1
			lsp      theVerb
			&rest    param3
			lag      global65
			send     6
code_2304:
			toss    
			ldi      1
			ret     
		)
	)
)

(instance unite of TScript
	(properties)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    TScript,  4
			lal      local17
			bnt      code_255f
			pushi    4
			pushi    6
			pushi    224
			pushi    254
			push    
			callk    Palette,  8
code_255f:
			ret     
		)
	)
	
	(method (changeState newState &tmp [temp0 3])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2402
			pushi    #setCursor
			pushi    4
			pushi    5
			pushi    1
			pushi    310
			pushi    185
			lag      global1
			send     12
			ldi      65535
			sal      local17
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #hide
			pushi    0
			lofsa    marian
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    quiver
			send     4
			pushi    #drawPic
			pushi    1
			pushi    215
			lag      global2
			send     6
			pushi    5
			pushi    #superClass
			pushi    216
			pushi    6
			pushi    1
			pTos     client
			lofsa    heal
			eq?     
			push    
			pushi    284
			pushi    2
			pushi    80
			pushi    140
			pushi    17
			pushi    1
			pushi    18432
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    121
			pushi    120
			pushSelf
			pushi    #new
			pushi    0
			class    Actor
			send     4
			sal      local13
			send     42
			pushi    #view
			pushi    1
			pushi    216
			pushi    6
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    250
			pushi    142
			pushi    17
			pushi    1
			pushi    18432
			pushi    107
			pushi    0
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    210
			pushi    122
			pushi    #new
			pushi    0
			class    Actor
			send     4
			sal      local14
			send     40
			pushi    #pause
			pushi    1
			pushi    1
			lag      global113
			send     6
			pushi    #pause
			pushi    1
			pushi    1
			lag      global100
			send     6
			pushi    #play
			pushi    0
			lofsa    joinSound
			send     4
			jmp      code_2544
code_2402:
			dup     
			ldi      1
			eq?     
			bnt      code_2455
			ldi      65534
			sal      local17
			pushi    #addToPic
			pushi    0
			lal      local13
			send     4
			pushi    #addToPic
			pushi    0
			lal      local14
			send     4
			pushi    #view
			pushi    1
			pushi    216
			pushi    6
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    156
			pushi    89
			pushi    63
			pushi    1
			pushi    9
			pushi    17
			pushi    1
			pushi    16400
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    #new
			pushi    0
			class    Prop
			send     4
			sal      local15
			send     44
			jmp      code_2544
code_2455:
			dup     
			ldi      2
			eq?     
			bnt      code_246b
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lal      local15
			send     8
			jmp      code_2544
code_246b:
			dup     
			ldi      3
			eq?     
			bnt      code_2498
			ldi      65532
			sal      local17
			pushi    #dispose
			pushi    0
			lal      local15
			send     4
			pToa     register
			bnt      code_2490
			pushi    3
			pushi    1210
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_2544
code_2490:
			ldi      180
			aTop     ticks
			jmp      code_2544
code_2498:
			dup     
			ldi      4
			eq?     
			bnt      code_24bf
			pushi    #prevSignal
			pushi    0
			lofsa    joinSound
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_24b6
			ldi      2
			aTop     cycles
			jmp      code_2544
code_24b6:
			dpToa    state
			ldi      2
			aTop     cycles
			jmp      code_2544
code_24bf:
			dup     
			ldi      5
			eq?     
			bnt      code_2521
			pushi    #show
			pushi    0
			lag      global0
			send     4
			pushi    #show
			pushi    0
			lofsa    marian
			send     4
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    quiver
			send     4
			pushi    #dispose
			pushi    0
			lal      local13
			send     4
			pushi    #dispose
			pushi    0
			lal      local14
			send     4
			pushi    #drawPic
			pushi    2
			pushi    210
			pushi    10
			lag      global2
			send     8
			pushi    #pause
			pushi    1
			pushi    0
			lag      global113
			send     6
			pushi    #pause
			pushi    1
			pushi    0
			lag      global100
			send     6
			ldi      1
			aTop     cycles
			ldi      0
			sal      local17
			jmp      code_2544
code_2521:
			dup     
			ldi      6
			eq?     
			bnt      code_2544
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			pushi    1
			lag      global1
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_2544:
			toss    
			ret     
		)
	)
)

(instance giveComb of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_260b
			pushi    0
			callb    proc0_3,  0
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			not     
			bnt      code_25d6
			pushi    #setScript
			pushi    2
			lofsa    disarm
			push    
			pushSelf
			self     8
			ldi      4
			sal      local430
			dpToa    state
			ret     
code_25d6:
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    marian
			send     6
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      2
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2771
code_260b:
			dup     
			ldi      1
			eq?     
			bnt      code_262b
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    #loop
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			ldi      30
			aTop     ticks
			jmp      code_2771
code_262b:
			dup     
			ldi      2
			eq?     
			bnt      code_2673
			pushi    #hide
			pushi    0
			lofsa    marian
			send     4
			pushi    5
			pushi    #superClass
			pushi    215
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     32
			ldi      20
			aTop     ticks
			jmp      code_2771
code_2673:
			dup     
			ldi      3
			eq?     
			bnt      code_268a
			pushi    #setCel
			pushi    1
			pushi    1
			lag      global0
			send     6
			ldi      20
			aTop     ticks
			jmp      code_2771
code_268a:
			dup     
			ldi      4
			eq?     
			bnt      code_26dd
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      7
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
			pushi    #view
			pushi    1
			pushi    215
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    3
			pushi    194
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     30
			pushi    3
			pushi    1
			pushi    702
			pushi    703
			callb    proc0_2,  6
			jmp      code_2771
code_26dd:
			dup     
			ldi      5
			eq?     
			bnt      code_26fa
			pushi    #view
			pushi    1
			pushi    212
			pushi    6
			pushi    1
			pushi    0
			lofsa    marian
			send     12
			ldi      30
			aTop     ticks
			jmp      code_2771
code_26fa:
			dup     
			ldi      6
			eq?     
			bnt      code_2714
			pushi    4
			lea      @local180
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_2771
code_2714:
			dup     
			ldi      7
			eq?     
			bnt      code_2771
			pushi    2
			pushi    50
			pushi    48
			calle    proc806_1,  4
			pushi    1
			pushi    47
			callb    proc0_5,  2
			bnt      code_2750
			pushi    #east
			pushi    1
			pushi    160
			lag      global2
			send     6
			pushi    #south
			pushi    1
			pushi    160
			lag      global2
			send     6
			pushi    #west
			pushi    1
			pushi    160
			lag      global2
			send     6
code_2750:
			pushi    #put
			pushi    1
			pushi    15
			lag      global0
			send     6
			pushi    #signal
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			ldi      0
			sal      local12
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_2771:
			toss    
			ret     
		)
	)
)

(instance giveScroll of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 2] [temp2 150])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2819
			pushi    0
			callb    proc0_3,  0
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			not     
			bnt      code_27e4
			pushi    #setScript
			pushi    2
			lofsa    disarm
			push    
			pushSelf
			self     8
			ldi      4
			sal      local430
			dpToa    state
			ret     
code_27e4:
			ldi      1
			aTop     notKilled
			pushi    #signal
			pushi    1
			pushi    16384
			lofsa    marian
			send     6
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2df9
code_2819:
			dup     
			ldi      1
			eq?     
			bnt      code_2839
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    #loop
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2839:
			dup     
			ldi      2
			eq?     
			bnt      code_2889
			pushi    #hide
			pushi    0
			lofsa    marian
			send     4
			pushi    5
			pushi    1
			pushi    #completed
			pushi    219
			pushi    1
			pushi    6
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     40
			jmp      code_2df9
code_2889:
			dup     
			ldi      3
			eq?     
			bnt      code_28fc
			pushi    1
			pushi    200
			calle    proc806_1,  2
			pushi    5
			pushi    #superClass
			pushi    215
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			lofsa    marian
			send     30
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			add     
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
			send     8
			pushi    3
			pushi    1
			pushi    702
			pushi    703
			callb    proc0_2,  6
			ldi      20
			aTop     cycles
			jmp      code_2df9
code_28fc:
			dup     
			ldi      4
			eq?     
			bnt      code_2917
			pushi    5
			lea      @local206
			push    
			pushi    1
			pushi    22
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2917:
			dup     
			ldi      5
			eq?     
			bnt      code_2933
			pushi    5
			lea      @local210
			push    
			pushi    3
			pushi    22
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2933:
			dup     
			ldi      6
			eq?     
			bnt      code_294d
			pushi    4
			lea      @local214
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_2df9
code_294d:
			dup     
			ldi      7
			eq?     
			bnt      code_2964
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     8
			jmp      code_2df9
code_2964:
			dup     
			ldi      8
			eq?     
			bnt      code_2981
			pushi    #play
			pushi    0
			lofsa    rustleSound
			send     4
			pushi    #setScript
			pushi    2
			lofsa    scrollCloseUp
			push    
			pushSelf
			self     8
			jmp      code_2df9
code_2981:
			dup     
			ldi      9
			eq?     
			bnt      code_299f
			ldi      1
			aTop     notKilled
			pushi    4
			lea      @local219
			push    
			pushi    22
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2df9
code_299f:
			dup     
			ldi      10
			eq?     
			bnt      code_29be
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     8
			pushi    #play
			pushi    0
			lofsa    rustleSound
			send     4
			jmp      code_2df9
code_29be:
			dup     
			ldi      11
			eq?     
			bnt      code_2a06
			pushi    #hide
			pushi    0
			lofsa    marian
			send     4
			pushi    5
			pushi    #superClass
			pushi    215
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    255
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     34
			jmp      code_2df9
code_2a06:
			dup     
			ldi      12
			eq?     
			bnt      code_2a71
			pushi    284
			pushi    #-info-
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      8
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     8
			pushi    5
			pushi    #superClass
			pushi    211
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    6
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    212
			lofsa    marian
			send     32
			pushi    3
			pushi    1
			pushi    702
			pushi    703
			callb    proc0_2,  6
			ldi      30
			aTop     ticks
			jmp      code_2df9
code_2a71:
			dup     
			ldi      13
			eq?     
			bnt      code_2a8b
			pushi    4
			lea      @local224
			push    
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  8
			jmp      code_2df9
code_2a8b:
			dup     
			ldi      14
			eq?     
			bnt      code_2ac2
			pToa     notKilled
			bnt      code_2ab4
			pushi    #init
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    161
			pushi    121
			pushSelf
			lofsa    cursMan
			send     16
			ldi      1
			aTop     register
			jmp      code_2df9
code_2ab4:
			pTos     state
			ldi      15
			add     
			aTop     state
			ldi      1
			aTop     cycles
			jmp      code_2df9
code_2ac2:
			dup     
			ldi      15
			eq?     
			bnt      code_2ad0
			ldi      15
			aTop     ticks
			jmp      code_2df9
code_2ad0:
			dup     
			ldi      16
			eq?     
			bnt      code_2b23
			pushi    #z
			pushi    1
			pushi    1000
			lag      global0
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lag      global109
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    marian
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    bow
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    quiver
			send     6
			pushi    #drawPic
			pushi    4
			pushi    213
			pushi    10
			pushi    1
			pushi    1
			lag      global2
			send     12
			ldi      2
			aTop     cycles
			jmp      code_2df9
code_2b23:
			dup     
			ldi      17
			eq?     
			bnt      code_2b5a
			ldi      0
			aTop     register
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    305
			pushi    190
			lag      global1
			send     12
			pushi    #show
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    202
			pushi    93
			pushSelf
			lofsa    cursMan
			send     16
			jmp      code_2df9
code_2b5a:
			dup     
			ldi      18
			eq?     
			bnt      code_2b68
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2b68:
			dup     
			ldi      19
			eq?     
			bnt      code_2b8e
			pushi    1
			lofsa    {R}
			push    
			call     localproc_30ea,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    160
			pushi    98
			pushSelf
			lofsa    cursMan
			send     12
			jmp      code_2df9
code_2b8e:
			dup     
			ldi      20
			eq?     
			bnt      code_2b9c
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2b9c:
			dup     
			ldi      21
			eq?     
			bnt      code_2bc1
			pushi    1
			lofsa    {O}
			push    
			call     localproc_30ea,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    127
			pushi    94
			pushSelf
			lofsa    cursMan
			send     12
			jmp      code_2df9
code_2bc1:
			dup     
			ldi      22
			eq?     
			bnt      code_2bcf
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2bcf:
			dup     
			ldi      23
			eq?     
			bnt      code_2bf5
			pushi    1
			lofsa    {B}
			push    
			call     localproc_30ea,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    199
			pushi    102
			pushSelf
			lofsa    cursMan
			send     12
			jmp      code_2df9
code_2bf5:
			dup     
			ldi      24
			eq?     
			bnt      code_2c03
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2c03:
			dup     
			ldi      25
			eq?     
			bnt      code_2c29
			pushi    1
			lofsa    {I}
			push    
			call     localproc_30ea,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    209
			pushi    74
			pushSelf
			lofsa    cursMan
			send     12
			jmp      code_2df9
code_2c29:
			dup     
			ldi      26
			eq?     
			bnt      code_2c37
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2c37:
			dup     
			ldi      27
			eq?     
			bnt      code_2c5d
			pushi    1
			lofsa    {N}
			push    
			call     localproc_30ea,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    174
			pushi    122
			pushSelf
			lofsa    cursMan
			send     12
			jmp      code_2df9
code_2c5d:
			dup     
			ldi      28
			eq?     
			bnt      code_2c6b
			ldi      20
			aTop     ticks
			jmp      code_2df9
code_2c6b:
			dup     
			ldi      29
			eq?     
			bnt      code_2cc8
			pushi    3
			lofsa    {LOOKUP\_ERROR}
			push    
			pushi    108
			lsl      local424
			callk    Display,  6
			pushi    #drawPic
			pushi    2
			pushi    210
			pushi    10
			lag      global2
			send     8
			pushi    #z
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #z
			pushi    1
			pushi    40
			lag      global109
			send     6
			pushi    #z
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    #z
			pushi    1
			pushi    0
			lofsa    bow
			send     6
			pushi    #z
			pushi    1
			pushi    0
			lofsa    quiver
			send     6
			pushi    #dispose
			pushi    0
			lofsa    cursMan
			send     4
			ldi      2
			aTop     cycles
			jmp      code_2df9
code_2cc8:
			dup     
			ldi      30
			eq?     
			bnt      code_2ce3
			pushi    5
			lea      @local230
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2ce3:
			dup     
			ldi      31
			eq?     
			bnt      code_2cff
			pushi    5
			lea      @local242
			push    
			pushi    22
			pushi    3
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2cff:
			dup     
			ldi      32
			eq?     
			bnt      code_2d1c
			pushi    5
			lea      @local256
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2d1c:
			dup     
			ldi      33
			eq?     
			bnt      code_2d77
			pushi    3
			pushi    1210
			pushi    156
			lea      @temp2
			push    
			callk    GetFarText,  6
			pushi    3
			pushi    1317
			lsg      global123
			lea      @temp2
			push    
			pushi    1
			lea      @temp2
			push    
			callk    StrLen,  2
			add     
			push    
			callk    GetFarText,  6
			pushi    1
			pushi    9
			calle    proc13_6,  2
			pushi    #show
			pushi    0
			pushi    509
			pushi    5
			lea      @temp2
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			pushi    2
			pushi    851
			pushi    2
			callk    ScriptID,  4
			aTop     register
			send     18
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_2df9
code_2d77:
			dup     
			ldi      34
			eq?     
			bnt      code_2da1
			pToa     notKilled
			not     
			bnt      code_2d8b
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
code_2d8b:
			pushi    5
			lea      @local261
			push    
			pushi    22
			pushi    1
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2da1:
			dup     
			ldi      35
			eq?     
			bnt      code_2dbf
			pushi    5
			lea      @local266
			push    
			pushi    22
			pushi    3
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_2df9
code_2dbf:
			dup     
			ldi      36
			eq?     
			bnt      code_2ddb
			pushi    4
			lea      @local275
			push    
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  8
			jmp      code_2df9
code_2ddb:
			dup     
			ldi      37
			eq?     
			bnt      code_2df9
			pushi    #signal
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			ldi      0
			sal      local12
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_2df9:
			toss    
			ret     
		)
	)
)

(instance scrollCloseUp of Script
	(properties)
	
	(method (doit param1)
		(asm
			lal      local0
			bnt      code_2e63
			pushi    #prevSignal
			pushi    0
			lofsa    letterSound
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_2e63
			pushi    #pause
			pushi    1
			pushi    0
			lag      global100
			send     6
			pushi    #pause
			pushi    1
			pushi    0
			lag      global113
			send     6
			ldi      0
			sal      local0
code_2e63:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    letterSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2ed4
			pushi    #z
			pushi    1
			pushi    1000
			lag      global0
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lag      global109
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    marian
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    bow
			send     6
			pushi    #z
			pushi    1
			pushi    1000
			lofsa    quiver
			send     6
			pushi    #drawPic
			pushi    2
			pushi    211
			pushi    6
			lag      global2
			send     8
			ldi      2
			aTop     cycles
			jmp      code_2fd1
code_2ed4:
			dup     
			ldi      1
			eq?     
			bnt      code_2ee2
			ldi      75
			aTop     ticks
			jmp      code_2fd1
code_2ee2:
			dup     
			ldi      2
			eq?     
			bnt      code_2f21
			pushi    #view
			pushi    1
			pushi    208
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    158
			pushi    3
			pushi    1
			pushi    118
			pushi    219
			pushi    1
			pushi    35
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			pushi    #new
			pushi    0
			class    Actor
			send     4
			aTop     register
			send     48
			jmp      code_2fd1
code_2f21:
			dup     
			ldi      3
			eq?     
			bnt      code_2f4d
			pushi    #pause
			pushi    1
			pushi    1
			lag      global113
			send     6
			pushi    #pause
			pushi    1
			pushi    1
			lag      global100
			send     6
			ldi      1
			sal      local0
			pushi    #play
			pushi    0
			lofsa    letterSound
			send     4
			ldi      5
			aTop     seconds
			jmp      code_2fd1
code_2f4d:
			dup     
			ldi      4
			eq?     
			bnt      code_2f63
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     register
			send     8
			jmp      code_2fd1
code_2f63:
			dup     
			ldi      5
			eq?     
			bnt      code_2f78
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
			ldi      30
			aTop     ticks
			jmp      code_2fd1
code_2f78:
			dup     
			ldi      6
			eq?     
			bnt      code_2fbf
			pushi    #drawPic
			pushi    2
			pushi    210
			pushi    6
			lag      global2
			send     8
			pushi    #z
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #z
			pushi    1
			pushi    40
			lag      global109
			send     6
			pushi    #z
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			pushi    #z
			pushi    1
			pushi    0
			lofsa    bow
			send     6
			pushi    #z
			pushi    1
			pushi    0
			lofsa    quiver
			send     6
			ldi      2
			aTop     cycles
			jmp      code_2fd1
code_2fbf:
			dup     
			ldi      7
			eq?     
			bnt      code_2fd1
			pushi    1
			pushi    34
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_2fd1:
			toss    
			ret     
		)
	)
)

(instance cursMan of Actor
	(properties
		yStep 4
		view 182
		loop 1
		priority 15
		signal $4898
		illegalBits $0000
		xStep 4
		moveSpeed 3
	)
	
	(method (init)
		(asm
			pushi    #x
			pushi    0
			pushi    #curEvent
			pushi    0
			class    User
			send     4
			send     4
			aTop     x
			pushi    #y
			pushi    0
			pushi    #curEvent
			pushi    0
			class    User
			send     4
			send     4
			aTop     y
			pushi    #init
			pushi    0
			super    Actor,  4
			ldi      18584
			aTop     signal
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Actor,  4
			pushi    #register
			pushi    0
			lofsa    giveScroll
			send     4
			bnt      code_305f
			pushi    4
			pushi    2
			pushi    1
			pTos     x
			pTos     y
			callk    SetCursor,  8
code_305f:
			ret     
		)
	)
)

(instance giveFScroll of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 152])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3183
			pushi    0
			callb    proc0_3,  0
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			not     
			bnt      code_3159
			pushi    #setScript
			pushi    2
			lofsa    disarm
			push    
			pushSelf
			self     8
			ldi      4
			sal      local430
			dpToa    state
			ret     
code_3159:
			ldi      1
			aTop     notKilled
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    marian
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    marian
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_32c4
code_3183:
			dup     
			ldi      1
			eq?     
			bnt      code_31a4
			pushi    2
			lsg      global0
			lofsa    marian
			push    
			callb    proc0_9,  4
			pushi    #loop
			pushi    1
			pushi    0
			lofsa    marian
			send     6
			ldi      20
			aTop     ticks
			jmp      code_32c4
code_31a4:
			dup     
			ldi      2
			eq?     
			bnt      code_31d3
			pushi    #view
			pushi    1
			pushi    215
			pushi    6
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    255
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     32
			jmp      code_32c4
code_31d3:
			dup     
			ldi      3
			eq?     
			bnt      code_323e
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bnt      code_3206
			pushi    4
			lea      @local323
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			pushi    #put
			pushi    1
			pushi    16
			lag      global0
			send     6
			jmp      code_32c4
code_3206:
			lal      local10
			bnt      code_3222
			pushi    5
			pushi    1
			lea      @local319
			push    
			pushi    22
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_32c4
code_3222:
			ldi      1
			bnt      code_32c4
			sal      local10
			pushi    4
			lea      @local310
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_32c4
code_323e:
			dup     
			ldi      4
			eq?     
			bnt      code_327f
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bnt      code_326f
			pushi    #put
			pushi    1
			pushi    16
			lag      global0
			send     6
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    marian
			send     12
			jmp      code_32c4
code_326f:
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     8
			jmp      code_32c4
code_327f:
			dup     
			ldi      5
			eq?     
			bnt      code_32c4
			pushi    5
			pushi    #superClass
			pushi    211
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    6
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    212
			lofsa    marian
			send     32
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
code_32c4:
			toss    
			ret     
		)
	)
)

(instance tryBlowinIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3337
			pushi    0
			callb    proc0_3,  0
			lsg      global130
			ldi      10
			eq?     
			bnt      code_332e
			pushi    3
			pushi    1210
			pushi    241
			pushSelf
			calle    proc13_4,  6
			ldi      0
			sal      local2
			jmp      code_33cb
code_332e:
			ipToa    state
			ldi      1
			aTop     cycles
			jmp      code_33cb
code_3337:
			dup     
			ldi      1
			eq?     
			bnt      code_334b
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_33cb
code_334b:
			dup     
			ldi      2
			eq?     
			bnt      code_3389
			pushi    #contains
			pushi    1
			lofsa    marian
			push    
			lag      global5
			send     6
			aTop     register
			bnt      code_3379
			pushi    5
			pushi    1
			lea      @local399
			push    
			pushi    22
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_33cb
code_3379:
			pushi    3
			pushi    1210
			pushi    240
			pushSelf
			calle    proc13_4,  6
			jmp      code_33cb
code_3389:
			dup     
			ldi      3
			eq?     
			bnt      code_339f
			ldi      1
			aTop     cycles
			pToa     register
			not     
			bnt      code_33cb
			ipToa    state
			jmp      code_33cb
code_339f:
			dup     
			ldi      4
			eq?     
			bnt      code_33ba
			pushi    4
			lea      @local403
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_33cb
code_33ba:
			dup     
			ldi      5
			eq?     
			bnt      code_33cb
			pushi    0
			call     localproc_01e6,  0
			pushi    #dispose
			pushi    0
			self     4
code_33cb:
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
			ldi      4
			eq?     
			bnt      code_342a
			lsp      param2
			ldi      1
			eq?     
			bnt      code_3446
			pushi    #setScript
			pushi    1
			lofsa    tryBlowinIt
			push    
			lag      global2
			send     6
			ldi      1
			jmp      code_3446
code_342a:
			dup     
			ldi      3
			eq?     
			bnt      code_3446
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_3446
			pushi    #setScript
			pushi    1
			lofsa    waitForIt
			push    
			lag      global2
			send     6
code_3446:
			toss    
			ret     
		)
	)
)

(instance waitForIt of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_3483
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    #setScript
			pushi    1
			lofsa    willowTalk
			push    
			pToa     client
			send     6
code_3483:
			ret     
		)
	)
)

(instance willowTalk of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3603
			pushi    0
			callb    proc0_3,  0
			pushi    #contains
			pushi    1
			lofsa    marian
			push    
			lag      global5
			send     6
			bnt      code_3531
			lsg      global130
			ldi      7
			eq?     
			bnt      code_3519
			+al      local1
			ldi      4
			aTop     state
			lsl      local1
			ldi      5
			ge?     
			bnt      code_34fa
			lea      @local441
			jmp      code_3514
code_34fa:
			lsg      global124
			ldi      55
			eq?     
			bnt      code_350a
			lea      @local433
			jmp      code_3514
code_350a:
			ldi      1
			bnt      code_3514
			lea      @local437
code_3514:
			aTop     register
			jmp      code_35fc
code_3519:
			ldi      2
			aTop     state
			lsg      global124
			ldi      19
			eq?     
			bnt      code_35fc
			ipToa    state
			lea      @local484
			aTop     register
			jmp      code_35fc
code_3531:
			lsg      global124
			ldi      19
			ne?     
			bt       code_3548
			pushi    1
			pushi    35
			callb    proc0_5,  2
			not     
			bt       code_3548
			lsg      global126
			ldi      0
			ne?     
code_3548:
			bnt      code_3559
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			call     localproc_01e6,  0
			ret     
			jmp      code_35fc
code_3559:
			lal      local1
			bnt      code_356c
			lea      @local457
			aTop     register
			ldi      3
			aTop     state
			jmp      code_35fc
code_356c:
			ldi      1
			bnt      code_35fc
			sal      local1
			lsg      global130
			dup     
			ldi      7
			eq?     
			bnt      code_35ae
			pushi    1
			pushi    120
			callb    proc0_5,  2
			bnt      code_358d
			lea      @local467
			jmp      code_35a9
code_358d:
			pushi    1
			pushi    143
			callb    proc0_5,  2
			bnt      code_359f
			lea      @local461
			jmp      code_35a9
code_359f:
			ldi      1
			bnt      code_35a9
			lea      @local452
code_35a9:
			aTop     register
			jmp      code_35fb
code_35ae:
			dup     
			ldi      8
			eq?     
			bnt      code_35c3
			lea      @local473
			aTop     register
			ldi      3
			aTop     state
			jmp      code_35fb
code_35c3:
			dup     
			ldi      10
			eq?     
			bnt      code_35d8
			lea      @local480
			aTop     register
			ldi      3
			aTop     state
			jmp      code_35fb
code_35d8:
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_35f0
			pushi    #setScript
			pushi    1
			lofsa    spillBeans
			push    
			pToa     client
			send     6
			jmp      code_35fb
code_35f0:
			lea      @local488
			aTop     register
			ldi      3
			aTop     state
code_35fb:
			toss    
code_35fc:
			ldi      1
			aTop     cycles
			jmp      code_3698
code_3603:
			dup     
			ldi      1
			eq?     
			bnt      code_3626
			pushi    5
			lea      @local445
			push    
			lea      @local509
			push    
			pushi    999
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_3698
code_3626:
			dup     
			ldi      2
			eq?     
			bnt      code_3644
			pushi    4
			pTos     register
			lea      @local509
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_3698
code_3644:
			dup     
			ldi      3
			eq?     
			bnt      code_3658
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			call     localproc_01e6,  0
			jmp      code_3698
code_3658:
			dup     
			ldi      4
			eq?     
			bnt      code_367c
			pTos     state
			ldi      2
			sub     
			aTop     state
			pushi    5
			pushi    1
			pTos     register
			lea      @local509
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_3698
code_367c:
			dup     
			ldi      5
			eq?     
			bnt      code_3698
			pTos     state
			ldi      3
			sub     
			aTop     state
			pushi    4
			pTos     register
			pushi    22
			pushi    0
			pushSelf
			calle    proc851_0,  8
code_3698:
			toss    
			ret     
		)
	)
)

(instance spillBeans of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 30])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_3700
			pushi    5
			lea      @local492
			push    
			lea      @local509
			push    
			pushi    999
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_3744
code_3700:
			dup     
			ldi      1
			eq?     
			bnt      code_3733
			pushi    65526
			lag      global140
			add     
			push    
			ldi      1
			sali     local498
			pushi    4
			lea      @local498
			push    
			lea      @local509
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			pushi    1
			pushi    51
			callb    proc0_6,  2
			jmp      code_3744
code_3733:
			dup     
			ldi      2
			eq?     
			bnt      code_3744
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			call     localproc_01e6,  0
code_3744:
			toss    
			ret     
		)
	)
)

(instance rustleSound of Sound
	(properties
		flags $0001
		number 633
	)
)

(instance joinSound of Sound
	(properties
		flags $0001
		number 212
	)
)

(instance letterSound of Sound
	(properties
		flags $0001
		number 214
	)
)

(instance willows of Feature
	(properties
		onMeCheck $0008
		lookStr 8
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_3857
			pushi    #script
			pushi    0
			lofsa    marian
			send     4
			push    
			lofsa    waitToDie
			eq?     
			bnt      code_384a
			pushi    2
			pushi    1210
			pushi    11
			calle    proc13_4,  4
			jmp      code_3862
code_384a:
			pushi    2
			pushi    1210
			pushi    10
			calle    proc13_4,  4
			jmp      code_3862
code_3857:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_3862:
			ret     
		)
	)
)

(instance ferns of Feature
	(properties
		onMeCheck $0010
		lookStr 9
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_38db
			pushi    #script
			pushi    0
			lofsa    marian
			send     4
			push    
			lofsa    waitToDie
			eq?     
			bnt      code_38ce
			pushi    2
			pushi    1210
			pushi    13
			calle    proc13_4,  4
			jmp      code_38e6
code_38ce:
			pushi    2
			pushi    1210
			pushi    12
			calle    proc13_4,  4
			jmp      code_38e6
code_38db:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_38e6:
			ret     
		)
	)
)
