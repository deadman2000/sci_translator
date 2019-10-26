;;; Sierra Script 1.0 - (do not remove this comment)
(script# 330)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n950)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	fairArchery 0
)

(local
	local0
	local1 =  1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9 =  1
	local10
	local11
	[local12 6]
	[local18 6]
	[local24 3]
	[local27 3]
	[local30 3]
	[local33 3]
	[local36 3]
	[local39 3]
	local42
	local43
	local44
	local45
	local46
	[local47 3] = [105 107 109]
	[local50 3] = [159 158 158]
	[local53 3] = [51 60 76]
	[local56 3] = [276 266 248]
	[local59 3] = [126 120 108]
	[local62 3] = [5 4 3]
	[local65 3] = [36 39 42]
	[local68 3] = [60 58 70]
	[local71 3] = [3 4 5]
	[local74 3] = [0 6 9]
	local77
	local78
	local79
	local80
	local81 =  1
	local82 =  1
	local83
	local84
	local85
	[local86 4] = [1330 0 1]
	[local90 4] = [1330 1 1]
	[local94 4] = [1330 2 1]
	[local98 4] = [1330 3 1]
	[local102 4] = [1330 4 1]
	[local106 4] = [1330 5 1]
	[local110 4] = [1330 14 1]
	[local114 4] = [1330 6 1]
	[local118 4] = [1330 7 1]
	[local122 4] = [1330 8 1]
	[local126 4] = [1330 9 1]
	[local130 4] = [1330 10 1]
	[local134 4] = [1330 11 1]
	[local138 5] = [1330 12 1 1]
	[local143 9] = [327 0 3 4 15 31 12 21 21]
)
(procedure (localproc_000e)
	(asm
		lsl      local85
		dup     
		ldi      0
		eq?     
		bnt      code_005d
		ldi      0
		sal      local44
		ldi      151
		sal      local45
		ldi      129
		sal      local46
		pushi    #x
		pushi    1
		lsl      local45
		pushi    3
		pushi    1
		push    
		lofsa    middleTarget
		send     12
		pushi    4
		pushi    #superClass
		lsl      local45
		ldi      106
		sub     
		push    
		pushi    3
		pushi    1
		lsl      local46
		lofsa    targetLeft
		send     12
		pushi    4
		pushi    #superClass
		lsl      local45
		ldi      132
		add     
		push    
		pushi    3
		pushi    1
		lsl      local46
		lofsa    targetRight
		send     12
		jmp      code_0100
code_005d:
		dup     
		ldi      1
		eq?     
		bnt      code_00b0
		ldi      1
		sal      local44
		ldi      152
		sal      local45
		ldi      122
		sal      local46
		pushi    #x
		pushi    1
		lsl      local45
		pushi    3
		pushi    1
		push    
		lofsa    middleTarget
		send     12
		pushi    4
		pushi    1
		lsl      local45
		ldi      97
		sub     
		push    
		pushi    3
		pushi    1
		lsl      local46
		ldi      1
		add     
		push    
		lofsa    targetLeft
		send     12
		pushi    4
		pushi    1
		lsl      local45
		ldi      119
		add     
		push    
		pushi    3
		pushi    1
		lsl      local46
		ldi      1
		add     
		push    
		lofsa    targetRight
		send     12
		jmp      code_0100
code_00b0:
		dup     
		ldi      2
		eq?     
		bnt      code_0100
		ldi      2
		sal      local44
		ldi      153
		sal      local45
		ldi      110
		sal      local46
		pushi    #x
		pushi    1
		lsl      local45
		pushi    3
		pushi    1
		push    
		lofsa    middleTarget
		send     12
		pushi    4
		pushi    1
		lsl      local45
		ldi      81
		sub     
		push    
		pushi    3
		pushi    1
		lsl      local46
		ldi      1
		add     
		push    
		lofsa    targetLeft
		send     12
		pushi    4
		pushi    1
		lsl      local45
		ldi      100
		add     
		push    
		pushi    3
		pushi    1
		lsl      local46
		ldi      1
		add     
		push    
		lofsa    targetRight
		send     12
code_0100:
		toss    
		ret     
	)
)

(procedure (localproc_0102)
	(asm
		lsg      global125
		ldi      2
		eq?     
		bnt      code_0139
		pushi    2
		pushi    0
		pushi    2
		callk    Random,  4
		push    
		dup     
		ldi      0
		eq?     
		bnt      code_011e
		ldi      280
		jmp      code_0135
code_011e:
		dup     
		ldi      1
		eq?     
		bnt      code_012b
		ldi      320
		jmp      code_0135
code_012b:
		dup     
		ldi      2
		eq?     
		bnt      code_0135
		ldi      360
code_0135:
		toss    
		jmp      code_0172
code_0139:
		pushi    2
		pushi    0
		pushi    3
		callk    Random,  4
		push    
		dup     
		ldi      0
		eq?     
		bnt      code_014d
		ldi      120
		jmp      code_0171
code_014d:
		dup     
		ldi      1
		eq?     
		bnt      code_015a
		ldi      160
		jmp      code_0171
code_015a:
		dup     
		ldi      2
		eq?     
		bnt      code_0167
		ldi      200
		jmp      code_0171
code_0167:
		dup     
		ldi      3
		eq?     
		bnt      code_0171
		ldi      240
code_0171:
		toss    
code_0172:
		push    
		lag      global125
		div     
		sal      local8
		ret     
	)
)

(procedure (localproc_0179)
	(asm
		lsg      global125
		ldi      2
		eq?     
		bnt      code_018d
		pushi    2
		pushi    2
		pushi    4
		callk    Random,  4
		sal      local79
		jmp      code_0196
code_018d:
		pushi    2
		pushi    0
		pushi    3
		callk    Random,  4
		sal      local79
code_0196:
		lsl      local79
		ldi      1
		le?     
		bnt      code_01ab
		pushi    2
		pushi    10
		pushi    12
		callk    Random,  4
		sal      local80
		jmp      code_01d1
code_01ab:
		lsl      local79
		ldi      3
		le?     
		bnt      code_01c0
		pushi    2
		pushi    20
		pushi    24
		callk    Random,  4
		sal      local80
		jmp      code_01d1
code_01c0:
		ldi      4
		sal      local79
		bnt      code_01d1
		pushi    2
		pushi    65
		pushi    78
		callk    Random,  4
		sal      local80
code_01d1:
		pushi    #init
		pushi    0
		lofsa    windFlags
		send     4
		ret     
	)
)

(procedure (localproc_01da)
	(asm
		pushi    #hide
		pushi    0
		lofsa    windFlags
		send     4
		pushi    #hide
		pushi    0
		lofsa    middleTarget
		send     4
		pushi    #hide
		pushi    0
		lofsa    targetLeft
		send     4
		pushi    #hide
		pushi    0
		lofsa    targetRight
		send     4
		pushi    #hide
		pushi    0
		lofsa    bowHand
		send     4
		pushi    #hide
		pushi    0
		lofsa    bow
		send     4
		pushi    #hide
		pushi    0
		lofsa    arrow
		send     4
		pushi    #drawPic
		pushi    2
		pushi    803
		pushi    3
		lag      global2
		send     8
		ret     
	)
)

(procedure (localproc_0220)
	(asm
		pushi    #drawPic
		pushi    1
		pushi    330
		lag      global2
		send     6
		pushi    #show
		pushi    0
		lofsa    windFlags
		send     4
		pushi    #show
		pushi    0
		lofsa    middleTarget
		send     4
		pushi    #show
		pushi    0
		lofsa    targetLeft
		send     4
		pushi    #show
		pushi    0
		lofsa    targetRight
		send     4
		pushi    #show
		pushi    0
		lofsa    bowHand
		send     4
		pushi    7
		pushi    1
		pushi    #species
		pushi    284
		pushi    2
		pushi    #x
		pushi    0
		lofsa    bowHand
		send     4
		push    
		ldi      22
		add     
		push    
		pushi    #y
		pushi    0
		lofsa    bowHand
		send     4
		push    
		ldi      106
		sub     
		push    
		pushi    194
		pushi    0
		lofsa    arrow
		send     18
		ldi      1
		sal      local9
		pushi    #show
		pushi    0
		lofsa    bow
		send     4
		ldi      0
		sal      local4
		ret     
	)
)

(procedure (localproc_02f4)
	(asm
		lsl      local85
		dup     
		ldi      0
		eq?     
		bnt      code_038a
		pushi    2
		pushi    0
		pushi    3
		callk    Random,  4
		push    
		dup     
		ldi      0
		eq?     
		bnt      code_0325
		pushi    2
		pushi    272
		pushi    280
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    120
		pushi    124
		callk    Random,  4
		sal      local43
		jmp      code_0386
code_0325:
		dup     
		ldi      1
		eq?     
		bnt      code_0346
		pushi    2
		pushi    279
		pushi    281
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    124
		pushi    128
		callk    Random,  4
		sal      local43
		jmp      code_0386
code_0346:
		dup     
		ldi      2
		eq?     
		bnt      code_0368
		pushi    2
		pushi    271
		pushi    280
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    128
		pushi    130
		callk    Random,  4
		sal      local43
		jmp      code_0386
code_0368:
		dup     
		ldi      3
		eq?     
		bnt      code_0386
		pushi    2
		pushi    268
		pushi    272
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    123
		pushi    129
		callk    Random,  4
		sal      local43
code_0386:
		toss    
		jmp      code_04a7
code_038a:
		dup     
		ldi      1
		eq?     
		bnt      code_041a
		pushi    2
		pushi    0
		pushi    3
		callk    Random,  4
		push    
		dup     
		ldi      0
		eq?     
		bnt      code_03b9
		pushi    2
		pushi    261
		pushi    269
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    115
		pushi    119
		callk    Random,  4
		sal      local43
		jmp      code_0416
code_03b9:
		dup     
		ldi      1
		eq?     
		bnt      code_03d9
		pushi    2
		pushi    267
		pushi    270
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    119
		pushi    122
		callk    Random,  4
		sal      local43
		jmp      code_0416
code_03d9:
		dup     
		ldi      2
		eq?     
		bnt      code_03f9
		pushi    2
		pushi    261
		pushi    269
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    122
		pushi    124
		callk    Random,  4
		sal      local43
		jmp      code_0416
code_03f9:
		dup     
		ldi      3
		eq?     
		bnt      code_0416
		pushi    2
		pushi    260
		pushi    263
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    118
		pushi    122
		callk    Random,  4
		sal      local43
code_0416:
		toss    
		jmp      code_04a7
code_041a:
		dup     
		ldi      2
		eq?     
		bnt      code_04a7
		pushi    2
		pushi    0
		pushi    3
		callk    Random,  4
		push    
		dup     
		ldi      0
		eq?     
		bnt      code_0449
		pushi    2
		pushi    244
		pushi    251
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    105
		pushi    106
		callk    Random,  4
		sal      local43
		jmp      code_04a6
code_0449:
		dup     
		ldi      1
		eq?     
		bnt      code_0469
		pushi    2
		pushi    250
		pushi    251
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    105
		pushi    109
		callk    Random,  4
		sal      local43
		jmp      code_04a6
code_0469:
		dup     
		ldi      2
		eq?     
		bnt      code_0489
		pushi    2
		pushi    244
		pushi    251
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    109
		pushi    110
		callk    Random,  4
		sal      local43
		jmp      code_04a6
code_0489:
		dup     
		ldi      3
		eq?     
		bnt      code_04a6
		pushi    2
		pushi    244
		pushi    246
		callk    Random,  4
		sal      local42
		pushi    2
		pushi    106
		pushi    109
		callk    Random,  4
		sal      local43
code_04a6:
		toss    
code_04a7:
		toss    
		ret     
	)
)

(procedure (localproc_04a9 &tmp temp0)
	(asm
		pushi    #x
		pushi    1
		pushi    151
		pushi    194
		pushi    0
		lofsa    bigTarget
		send     10
		ldi      0
		sat      temp0
code_04be:
		lst      temp0
		ldi      2
		le?     
		bnt      code_04d5
		pushi    #show
		pushi    0
		lat      temp0
		lali     local18
		send     4
		+at      temp0
		jmp      code_04be
code_04d5:
		ret     
	)
)

(procedure (localproc_04d6 &tmp temp0)
	(asm
		pushi    #hide
		pushi    0
		lofsa    bigTarget
		send     4
		ldi      0
		sat      temp0
code_04e4:
		lst      temp0
		ldi      2
		le?     
		bnt      code_04fa
		pushi    #hide
		pushi    0
		lat      temp0
		lali     local18
		send     4
		+at      temp0
		jmp      code_04e4
code_04fa:
		ret     
	)
)

(procedure (localproc_04fb &tmp temp0)
	(asm
		pushi    #x
		pushi    1
		pushi    63
		pushi    194
		pushi    0
		lofsa    bigTarget
		send     10
		ldi      0
		sat      temp0
code_050f:
		lst      temp0
		ldi      2
		le?     
		bnt      code_0526
		pushi    #show
		pushi    0
		lat      temp0
		lali     local30
		send     4
		+at      temp0
		jmp      code_050f
code_0526:
		ret     
	)
)

(procedure (localproc_0527 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_052d:
		lst      temp0
		ldi      2
		le?     
		bnt      code_0543
		pushi    #hide
		pushi    0
		lat      temp0
		lali     local30
		send     4
		+at      temp0
		jmp      code_052d
code_0543:
		ret     
	)
)

(procedure (localproc_0544 &tmp temp0)
	(asm
		pushi    #x
		pushi    1
		pushi    256
		pushi    194
		pushi    0
		lofsa    bigTarget
		send     10
		ldi      0
		sat      temp0
code_0559:
		lst      temp0
		ldi      2
		le?     
		bnt      code_0570
		pushi    #show
		pushi    0
		lat      temp0
		lali     local33
		send     4
		+at      temp0
		jmp      code_0559
code_0570:
		ret     
	)
)

(procedure (localproc_0571 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0577:
		lst      temp0
		ldi      2
		le?     
		bnt      code_058d
		pushi    #hide
		pushi    0
		lat      temp0
		lali     local33
		send     4
		+at      temp0
		jmp      code_0577
code_058d:
		ret     
	)
)

(procedure (localproc_058e)
	(asm
		pushi    #loop
		pushi    1
		pushi    2
		pushi    7
		pushi    1
		pushi    0
		pushi    284
		pushi    2
		pushi    16
		pushi    166
		pushi    194
		pushi    0
		lal      local5
		send     24
		ret     
	)
)

(procedure (localproc_05a8)
	(asm
		pushi    #loop
		pushi    1
		pushi    1
		pushi    7
		pushi    1
		pushi    0
		pushi    284
		pushi    2
		pushi    309
		pushi    164
		pushi    194
		pushi    0
		lal      local5
		send     24
		ret     
	)
)

(instance cleanTarget of Code
	(properties)
	
	(method (doit &tmp [temp0 2])
		(asm
code_0297:
			-al      local10
			push    
			ldi      0
			ge?     
			bnt      code_02b5
			pushi    #dispose
			pushi    0
			lal      local10
			lali     local12
			send     4
			pushi    #hide
			pushi    0
			lal      local10
			lali     local12
			send     4
			jmp      code_0297
code_02b5:
			ldi      0
			sal      local10
code_02b9:
			-al      local11
			push    
			ldi      0
			ge?     
			bnt      code_02ce
			pushi    #dispose
			pushi    0
			lal      local11
			lali     local27
			send     4
			jmp      code_02b9
code_02ce:
			ldi      0
			sal      local11
			ret     
		)
	)
)

(instance fairArchery of Rm
	(properties
		picture 330
		style $8003
	)
	
	(method (init)
		(asm
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			sal      local0
			pushi    #disable
			pushi    5
			pushi    2
			pushi    3
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     14
			pushi    #joyInc
			pushi    1
			pushi    2
			lag      global77
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #init
			pushi    0
			lofsa    drumSound
			send     4
			lag      global34
			sal      local84
			ldi      0
			sag      global34
			lsg      global125
			ldi      1
			gt?     
			bnt      code_060d
			lsg      global125
			ldi      2
			sub     
			sal      local85
code_060d:
			lag      global125
			sal      local78
			pushi    #setPri
			pushi    1
			pushi    12
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    bowHand
			send     22
			pushi    #setPri
			pushi    1
			pushi    12
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    bow
			send     22
			pushi    #setPri
			pushi    1
			pushi    14
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    arrow
			send     22
			pushi    0
			call     localproc_000e,  0
			pushi    #init
			pushi    0
			lofsa    middleTarget
			send     4
			pushi    #init
			pushi    0
			lofsa    targetLeft
			send     4
			pushi    #init
			pushi    0
			lofsa    targetRight
			send     4
			pushi    #setPri
			pushi    1
			pushi    14
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     14
			pushi    0
			call     localproc_0102,  0
			pushi    0
			call     localproc_0179,  0
			pushi    #init
			pushi    0
			lofsa    targetArea
			send     4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Rm,  4
			pToa     script
			bnt      code_06c5
			jmp      code_0809
code_06c5:
			-al      local8
			not     
			bnt      code_06d8
			pushi    0
			call     localproc_0179,  0
			pushi    0
			call     localproc_0102,  0
			jmp      code_0809
code_06d8:
			lsg      global125
			ldi      1
			eq?     
			bnt      code_06f9
			pushi    1
			pushi    10
			callb    proc0_5,  2
			not     
			bnt      code_06f9
			pushi    #setScript
			pushi    1
			lofsa    goToGoldenArrow
			push    
			lag      global2
			send     6
			jmp      code_0809
code_06f9:
			lal      local81
			bnt      code_071a
			pushi    3
			lsg      global125
			lsl      local78
			pushi    1
			calle    proc999_5,  6
			not     
			bnt      code_071a
			pushi    0
			callb    proc0_4,  0
			ldi      0
			sag      global11
			jmp      code_0809
code_071a:
			lal      local81
			bnt      code_0736
			lsl      local10
			ldi      6
			eq?     
			bnt      code_0736
			pushi    #setScript
			pushi    1
			lofsa    beginAnnounce
			push    
			lag      global2
			send     6
			jmp      code_0809
code_0736:
			lal      local82
			bnt      code_075a
			lsl      local83
			ldi      1
			eq?     
			bnt      code_075a
			lsl      local10
			ldi      3
			eq?     
			bnt      code_075a
			pushi    #setScript
			pushi    1
			lofsa    roundOne
			push    
			lag      global2
			send     6
			jmp      code_0809
code_075a:
			lal      local82
			bnt      code_077e
			lsl      local83
			ldi      2
			eq?     
			bnt      code_077e
			lsl      local10
			ldi      3
			eq?     
			bnt      code_077e
			pushi    #setScript
			pushi    1
			lofsa    roundTwo
			push    
			lag      global2
			send     6
			jmp      code_0809
code_077e:
			lsl      local83
			ldi      3
			eq?     
			bnt      code_0809
			lsl      local10
			ldi      1
			eq?     
			bnt      code_0809
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_07b4
			pushi    160
			lal      local2
			ge?     
			bnt      code_07a5
			pprev   
			ldi      158
			ge?     
code_07a5:
			pushi    127
			lal      local3
			ge?     
			bnt      code_07ea
			pprev   
			ldi      125
			ge?     
			jmp      code_07ea
code_07b4:
			dup     
			ldi      1
			eq?     
			bnt      code_07d8
			pushi    158
			lal      local2
			ge?     
			bnt      code_07c9
			pprev   
			ldi      156
			ge?     
code_07c9:
			pushi    120
			lal      local3
			ge?     
			bnt      code_07ea
			pprev   
			ldi      118
			ge?     
			jmp      code_07ea
code_07d8:
			dup     
			ldi      2
			eq?     
			bnt      code_07ea
			lsl      local2
			ldi      158
			eq?     
			lsl      local3
			ldi      107
			eq?     
code_07ea:
			toss    
			bnt      code_07fd
			pushi    #setScript
			pushi    1
			lofsa    puckHasWon
			push    
			lag      global2
			send     6
			jmp      code_0809
code_07fd:
			pushi    #setScript
			pushi    1
			lofsa    puckHasLost
			push    
			lag      global2
			send     6
code_0809:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #setSpeed
			pushi    1
			lsl      local0
			lag      global1
			send     6
			pushi    #joyInc
			pushi    1
			pushi    5
			lag      global77
			send     6
			lal      local84
			sag      global34
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_081f
			pushi    #doit
			pushi    1
			pushi    10
			lag      global65
			send     6
			jmp      code_0846
code_081f:
			dup     
			ldi      1
			eq?     
			bnt      code_083b
			pushi    1
			pushi    131
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    320
			lag      global2
			send     6
			jmp      code_0846
code_083b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_0846:
			toss    
			ret     
		)
	)
)

(instance bowHand of View
	(properties
		x 137
		y 239
		lookStr 10734
		view 201
		loop 1
		cel 1
		signal $5000
	)
	
	(method (doit)
		(asm
			pushi    3
			lsg      global19
			pushi    4
			pushi    5
			calle    proc999_5,  6
			bnt      code_0989
			pushi    2
			pushi    135
			pushi    2
			pushi    189
			lsg      global70
			calle    proc999_2,  4
			push    
			calle    proc999_3,  4
			push    
			ldi      22
			sub     
			aTop     x
			pushi    2
			pushi    88
			pushi    2
			pushi    143
			lsg      global71
			calle    proc999_2,  4
			push    
			calle    proc999_3,  4
			push    
			lal      local85
			lali     local47
			add     
			aTop     y
			lal      local9
			bnt      code_0973
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_0915
			pushi    186
			lag      global70
			ge?     
			bnt      code_0961
			pprev   
			ldi      135
			ge?     
			bnt      code_0961
			pushi    143
			lag      global71
			ge?     
			bnt      code_0961
			pprev   
			ldi      114
			ge?     
			jmp      code_0961
code_0915:
			dup     
			ldi      1
			eq?     
			bnt      code_093d
			pushi    183
			lag      global70
			ge?     
			bnt      code_0961
			pprev   
			ldi      138
			ge?     
			bnt      code_0961
			pushi    137
			lag      global71
			ge?     
			bnt      code_0961
			pprev   
			ldi      105
			ge?     
			jmp      code_0961
code_093d:
			dup     
			ldi      2
			eq?     
			bnt      code_0961
			pushi    179
			lag      global70
			ge?     
			bnt      code_0961
			pprev   
			ldi      139
			ge?     
			bnt      code_0961
			pushi    120
			lag      global71
			ge?     
			bnt      code_0961
			pprev   
			ldi      80
			ge?     
code_0961:
			toss    
			bnt      code_0973
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			jmp      code_0989
code_0973:
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			lag      global1
			send     6
code_0989:
			pushi    #doit
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_09c1
			lal      local9
			not     
			bnt      code_09b3
			pushi    #cel
			pushi    1
			pushi    0
			pushi    194
			pushi    0
			lofsa    arrow
			send     10
			ldi      1
			sal      local9
			jmp      code_09cc
code_09b3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
			jmp      code_09cc
code_09c1:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_09cc:
			toss    
			ret     
		)
	)
)

(instance bow of View
	(properties
		x 195
		y 144
		view 201
		signal $5000
	)
	
	(method (doit)
		(asm
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      58
			add     
			aTop     x
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      95
			sub     
			aTop     y
			pushi    #doit
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
			bnt      code_0a71
			pushi    3
			pushi    1330
			pushi    17
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a7c
code_0a71:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0a7c:
			toss    
			ret     
		)
	)
)

(instance arrow of View
	(properties
		x 159
		y 133
		lookStr 10777
		view 332
		priority 10
		signal $4010
	)
	
	(method (doit)
		(asm
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      22
			add     
			aTop     x
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      106
			sub     
			aTop     y
			pushi    #doit
			pushi    0
			super    View,  4
			ret     
		)
	)
)

(instance smallArrow of View
	(properties
		view 332
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b84
			pushi    2
			pushi    1330
			pushi    18
			calle    proc13_4,  4
			jmp      code_0ba4
code_0b84:
			dup     
			ldi      10
			eq?     
			bnt      code_0b99
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    targetArea
			send     6
			jmp      code_0ba4
code_0b99:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0ba4:
			toss    
			ret     
		)
	)
)

(instance adamBigArrow of Actor
	(properties
		x 166
		y 147
		view 326
		loop 1
		cel 1
		priority 15
		signal $4010
	)
)

(instance windFlags of Prop
	(properties
		x 27
		y 100
		lookStr 10850
		view 330
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #loop
			pushi    1
			lsl      local79
			pushi    66
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			lsl      local80
			self     24
			ret     
		)
	)
)

(instance middleTarget of View
	(properties
		view 325
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    View,  4
			pushi    #cel
			pushi    1
			lsl      local44
			pushi    285
			pushi    0
			self     10
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d5f
			lsl      local83
			ldi      3
			eq?     
			bnt      code_0d3c
			jmp      code_0d7f
code_0d3c:
			lal      local10
			bnt      code_0d50
			pushi    #setScript
			pushi    1
			lofsa    puckCloseUpTarg
			push    
			lag      global2
			send     6
			jmp      code_0d7f
code_0d50:
			pushi    #setScript
			pushi    1
			lofsa    showEmptyTarget
			push    
			lag      global2
			send     6
			jmp      code_0d7f
code_0d5f:
			dup     
			ldi      10
			eq?     
			bnt      code_0d74
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			lofsa    targetArea
			send     6
			jmp      code_0d7f
code_0d74:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0d7f:
			toss    
			ret     
		)
	)
)

(instance targetLeft of View
	(properties
		lookStr 10958
		view 325
		loop 3
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    View,  4
			pushi    #cel
			pushi    1
			lsl      local44
			pushi    285
			pushi    0
			self     10
			ret     
		)
	)
)

(instance targetRight of View
	(properties
		lookStr 10958
		view 325
		loop 4
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    View,  4
			pushi    #cel
			pushi    1
			lsl      local44
			pushi    285
			pushi    0
			self     10
			ret     
		)
	)
)

(instance bigTarget of View
	(properties
		y 189
		view 326
		signal $4008
	)
)

(instance splitArrow of View
	(properties
		x 165
		y 146
		view 326
		loop 2
		cel 1
		priority 15
		signal $4010
	)
)

(instance adamStanding of View
	(properties
		x 223
		y 167
		view 325
		loop 2
	)
)

(instance walkPuck of Actor
	(properties
		x 259
		y 164
		view 33
		loop 7
	)
)

(instance guard1 of View
	(properties
		x 99
		y 181
		view 750
		loop 3
		signal $0001
	)
)

(instance guard2 of View
	(properties
		x 156
		y 183
		view 750
		loop 3
		cel 1
		signal $0001
	)
)

(instance guard3 of View
	(properties
		x 190
		y 178
		view 750
		loop 3
		cel 5
		signal $0001
	)
)

(instance fireArrow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11b6
			pushi    #signal
			pushi    0
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     4
			push    
			ldi      4
			and     
			not     
			bnt      code_11a6
			pushi    #disable
			pushi    1
			pushi    0
			lag      global69
			send     6
code_11a6:
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    arrow
			send     6
			ldi      12
			aTop     ticks
			jmp      code_152c
code_11b6:
			dup     
			ldi      1
			eq?     
			bnt      code_11dc
			pushi    #number
			pushi    1
			pushi    906
			pushi    42
			pushi    1
			pushSelf
			lofsa    shootSound
			send     12
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    arrow
			send     6
			ldi      12
			aTop     ticks
			jmp      code_152c
code_11dc:
			dup     
			ldi      2
			eq?     
			bnt      code_14fa
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #x
			pushi    0
			lofsa    arrow
			send     4
			sal      local2
			pushi    #y
			pushi    0
			lofsa    arrow
			send     4
			sal      local3
			lsl      local2
			lsl      local79
			dup     
			ldi      0
			eq?     
			bnt      code_1244
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_121e
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			jmp      code_123f
code_121e:
			dup     
			ldi      1
			eq?     
			bnt      code_1230
			pushi    2
			pushi    5
			pushi    8
			callk    Random,  4
			jmp      code_123f
code_1230:
			dup     
			ldi      2
			eq?     
			bnt      code_123f
			pushi    2
			pushi    7
			pushi    10
			callk    Random,  4
code_123f:
			toss    
			neg     
			jmp      code_1300
code_1244:
			dup     
			ldi      1
			eq?     
			bnt      code_1284
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_125f
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			jmp      code_1280
code_125f:
			dup     
			ldi      1
			eq?     
			bnt      code_1271
			pushi    2
			pushi    5
			pushi    8
			callk    Random,  4
			jmp      code_1280
code_1271:
			dup     
			ldi      2
			eq?     
			bnt      code_1280
			pushi    2
			pushi    7
			pushi    10
			callk    Random,  4
code_1280:
			toss    
			jmp      code_1300
code_1284:
			dup     
			ldi      2
			eq?     
			bnt      code_12c4
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_129e
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			jmp      code_12bf
code_129e:
			dup     
			ldi      1
			eq?     
			bnt      code_12b0
			pushi    2
			pushi    3
			pushi    7
			callk    Random,  4
			jmp      code_12bf
code_12b0:
			dup     
			ldi      2
			eq?     
			bnt      code_12bf
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
code_12bf:
			toss    
			neg     
			jmp      code_1300
code_12c4:
			dup     
			ldi      3
			eq?     
			bnt      code_1300
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_12de
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			jmp      code_12ff
code_12de:
			dup     
			ldi      1
			eq?     
			bnt      code_12f0
			pushi    2
			pushi    3
			pushi    7
			callk    Random,  4
			jmp      code_12ff
code_12f0:
			dup     
			ldi      2
			eq?     
			bnt      code_12ff
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
code_12ff:
			toss    
code_1300:
			toss    
			add     
			sal      local2
			lsl      local3
			lal      local85
			lali     local74
			add     
			sal      local3
			pushi    #cel
			pushi    1
			lal      local85
			lsli     local71
			lofsa    arrow
			send     6
			ldi      0
			sal      local9
			lal      local81
			not     
			bnt      code_133d
			pushi    4
			lal      local85
			lsli     local50
			lsli     local59
			lsl      local2
			lsl      local3
			callk    GetDistance,  8
			push    
			lal      local85
			lali     local62
			ge?     
			bnt      code_133d
			+al      local77
code_133d:
			lsl      local83
			ldi      3
			lt?     
			bnt      code_138a
			lsl      local10
			ldi      0
			eq?     
			bnt      code_1360
			lal      local85
			lsli     local53
			lal      local10
			sali     local36
			lal      local85
			lsli     local59
			lal      local10
			sali     local39
			jmp      code_138a
code_1360:
			lal      local85
			lsli     local53
			pushi    2
			pushi    2
			pushi    10
			callk    Random,  4
			push    
			ldi      6
			sub     
			add     
			push    
			lal      local10
			sali     local36
			lal      local85
			lsli     local59
			pushi    2
			pushi    2
			pushi    10
			callk    Random,  4
			push    
			ldi      6
			sub     
			add     
			push    
			lal      local10
			sali     local39
code_138a:
			pushi    5
			pushi    #superClass
			pushi    332
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			lal      local85
			lsli     local71
			pushi    284
			pushi    2
			lsl      local2
			lsl      local3
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    #new
			pushi    0
			lofsa    smallArrow
			send     4
			push    
			lal      local10
			sali     local12
			send     44
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_13ee
			lsl      local2
			ldi      169
			gt?     
			bt       code_143d
			lsl      local2
			ldi      148
			lt?     
			bt       code_143d
			lsl      local3
			ldi      132
			gt?     
			bt       code_143d
			lsl      local3
			ldi      119
			lt?     
			jmp      code_143d
code_13ee:
			dup     
			ldi      1
			eq?     
			bnt      code_1417
			lsl      local2
			ldi      167
			gt?     
			bt       code_143d
			lsl      local2
			ldi      149
			lt?     
			bt       code_143d
			lsl      local3
			ldi      126
			gt?     
			bt       code_143d
			lsl      local3
			ldi      111
			lt?     
			jmp      code_143d
code_1417:
			dup     
			ldi      2
			eq?     
			bnt      code_143d
			lsl      local2
			ldi      166
			gt?     
			bt       code_143d
			lsl      local2
			ldi      150
			lt?     
			bt       code_143d
			lsl      local3
			ldi      114
			gt?     
			bt       code_143d
			lsl      local3
			ldi      101
			lt?     
code_143d:
			toss    
			bnt      code_144e
			ldi      999
			sal      local6
			ldi      999
			sal      local7
			jmp      code_148d
code_144e:
			lsl      local2
			lal      local85
			lali     local50
			sub     
			push    
			lal      local85
			lali     local65
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      166
			add     
			sal      local6
			lsl      local3
			lal      local85
			lali     local59
			sub     
			push    
			lal      local85
			lali     local68
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      147
			add     
			sal      local7
			lsl      local3
			lal      local4
			eq?     
			bnt      code_148d
			lsl      local7
			ldi      1
			sub     
			sal      local7
code_148d:
			lal      local3
			sal      local4
			pushi    5
			pushi    #superClass
			pushi    326
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local6
			lsl      local7
			pushi    66
			pushi    1
			pushi    15
			pushi    17
			pushi    1
			pushi    16400
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			lofsa    smallArrow
			send     4
			push    
			lal      local10
			sali     local18
			send     46
			+al      local10
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			lsg      global70
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			add     
			push    
			ldi      65532
			add     
			push    
			lsg      global71
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			add     
			push    
			ldi      65532
			add     
			push    
			lag      global1
			send     12
			ldi      1
			aTop     cycles
			jmp      code_152c
code_14fa:
			dup     
			ldi      3
			eq?     
			bnt      code_1504
			jmp      code_152c
code_1504:
			dup     
			ldi      4
			eq?     
			bnt      code_1520
			pushi    #number
			pushi    1
			pushi    910
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			ldi      2
			aTop     cycles
			jmp      code_152c
code_1520:
			dup     
			ldi      5
			eq?     
			bnt      code_152c
			pushi    #dispose
			pushi    0
			self     4
code_152c:
			toss    
			ret     
		)
	)
)

(instance changeTargPos of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_15c6
			pushi    #doit
			pushi    0
			lofsa    cleanTarget
			send     4
			pushi    #hide
			pushi    0
			lofsa    windFlags
			send     4
			pushi    #dispose
			pushi    0
			lofsa    middleTarget
			send     4
			pushi    #dispose
			pushi    0
			lofsa    targetLeft
			send     4
			pushi    #dispose
			pushi    0
			lofsa    targetRight
			send     4
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #drawPic
			pushi    1
			pushi    803
			lag      global2
			send     6
			ldi      8
			aTop     cycles
			jmp      code_1676
code_15c6:
			dup     
			ldi      1
			eq?     
			bnt      code_164d
			lsg      global125
			ldi      2
			sub     
			sal      local85
			pushi    0
			call     localproc_000e,  0
			pushi    #drawPic
			pushi    1
			pushi    330
			lag      global2
			send     6
			pushi    #init
			pushi    0
			lofsa    middleTarget
			send     4
			pushi    #init
			pushi    0
			lofsa    targetLeft
			send     4
			pushi    #init
			pushi    0
			lofsa    targetRight
			send     4
			pushi    #show
			pushi    0
			lofsa    windFlags
			send     4
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    7
			pushi    1
			pushi    #species
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      22
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      106
			sub     
			push    
			pushi    194
			pushi    0
			lofsa    arrow
			send     18
			ldi      1
			sal      local9
			ldi      5
			aTop     cycles
			jmp      code_1676
code_164d:
			dup     
			ldi      2
			eq?     
			bnt      code_1676
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    5
			pushi    0
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     14
			ldi      1
			sal      local82
			ldi      3
			sal      local10
			pushi    #dispose
			pushi    0
			self     4
code_1676:
			toss    
			ret     
		)
	)
)

(instance beginAnnounce of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1711
			ldi      0
			sal      local81
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #x
			pushi    1
			pushi    151
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      0
			sat      temp0
code_16f3:
			lst      temp0
			lal      local10
			lt?     
			bnt      code_170a
			pushi    #show
			pushi    0
			lat      temp0
			lali     local18
			send     4
			+at      temp0
			jmp      code_16f3
code_170a:
			ldi      15
			aTop     cycles
			jmp      code_191d
code_1711:
			dup     
			ldi      1
			eq?     
			bnt      code_1736
			pushi    #play
			pushi    0
			lofsa    drumSound
			send     4
			pushi    5
			pushi    1
			lea      @local86
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_191d
code_1736:
			dup     
			ldi      2
			eq?     
			bnt      code_176c
			pushi    #x
			pushi    1
			pushi    151
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      0
			sat      temp0
code_174f:
			lst      temp0
			lal      local10
			lt?     
			bnt      code_1765
			pushi    #hide
			pushi    0
			lat      temp0
			lali     local18
			send     4
			+at      temp0
			jmp      code_174f
code_1765:
			ldi      7
			aTop     cycles
			jmp      code_191d
code_176c:
			dup     
			ldi      3
			eq?     
			bnt      code_1787
			pushi    #doit
			pushi    0
			lofsa    cleanTarget
			send     4
			pushi    0
			call     localproc_01da,  0
			ldi      3
			aTop     cycles
			jmp      code_191d
code_1787:
			dup     
			ldi      4
			eq?     
			bnt      code_17b2
			pushi    0
			call     localproc_0220,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			ldi      8
			aTop     cycles
			jmp      code_191d
code_17b2:
			dup     
			ldi      5
			eq?     
			bnt      code_17cf
			pushi    5
			pushi    1
			lea      @local90
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_191d
code_17cf:
			dup     
			ldi      6
			eq?     
			bnt      code_1814
			pushi    #view
			pushi    1
			pushi    332
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    309
			pushi    164
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			class    Actor
			send     4
			sal      local5
			send     40
			ldi      0
			sal      local11
			ldi      0
			sal      local4
			ldi      30
			aTop     ticks
			jmp      code_191d
code_1814:
			dup     
			ldi      7
			eq?     
			bnt      code_1829
			pushi    #setScript
			pushi    2
			lofsa    turnClymBill
			push    
			pushSelf
			self     8
			jmp      code_191d
code_1829:
			dup     
			ldi      8
			eq?     
			bnt      code_183c
			pushi    0
			call     localproc_05a8,  0
			ldi      30
			aTop     ticks
			jmp      code_191d
code_183c:
			dup     
			ldi      9
			eq?     
			bnt      code_1851
			pushi    #setScript
			pushi    2
			lofsa    turnClymBill
			push    
			pushSelf
			self     8
			jmp      code_191d
code_1851:
			dup     
			ldi      10
			eq?     
			bnt      code_1864
			pushi    0
			call     localproc_05a8,  0
			ldi      30
			aTop     ticks
			jmp      code_191d
code_1864:
			dup     
			ldi      11
			eq?     
			bnt      code_1879
			pushi    #setScript
			pushi    2
			lofsa    turnClymBill
			push    
			pushSelf
			self     8
			jmp      code_191d
code_1879:
			dup     
			ldi      12
			eq?     
			bnt      code_188d
			pushi    0
			call     localproc_0544,  0
			ldi      180
			aTop     ticks
			jmp      code_191d
code_188d:
			dup     
			ldi      13
			eq?     
			bnt      code_18ae
			pushi    0
			call     localproc_0571,  0
			pushi    #x
			pushi    1
			pushi    256
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      4
			aTop     cycles
			jmp      code_191d
code_18ae:
			dup     
			ldi      14
			eq?     
			bnt      code_18cb
			pushi    5
			pushi    1
			lea      @local98
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_191d
code_18cb:
			dup     
			ldi      15
			eq?     
			bnt      code_18f4
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    arrow
			send     4
			ldi      3
			aTop     cycles
			jmp      code_191d
code_18f4:
			dup     
			ldi      16
			eq?     
			bnt      code_191d
			ldi      1
			sal      local83
			ldi      0
			sal      local77
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    5
			pushi    0
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     14
			pushi    #dispose
			pushi    0
			self     4
code_191d:
			toss    
			ret     
		)
	)
)

(instance roundOne of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1994
			ldi      0
			sal      local82
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    0
			call     localproc_04a9,  0
			ldi      120
			aTop     ticks
			jmp      code_1c54
code_1994:
			dup     
			ldi      1
			eq?     
			bnt      code_19b9
			pushi    #play
			pushi    0
			lofsa    drumSound
			send     4
			pushi    5
			pushi    1
			lea      @local94
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c54
code_19b9:
			dup     
			ldi      2
			eq?     
			bnt      code_19e0
			pushi    0
			call     localproc_04d6,  0
			ldi      0
			sal      local4
			ldi      0
			sal      local11
			pushi    0
			call     localproc_058e,  0
			pushi    #setScript
			pushi    2
			lofsa    adamShoot
			push    
			pushSelf
			self     8
			jmp      code_1c54
code_19e0:
			dup     
			ldi      3
			eq?     
			bnt      code_19f3
			pushi    0
			call     localproc_058e,  0
			ldi      30
			aTop     ticks
			jmp      code_1c54
code_19f3:
			dup     
			ldi      4
			eq?     
			bnt      code_1a08
			pushi    #setScript
			pushi    2
			lofsa    adamShoot
			push    
			pushSelf
			self     8
			jmp      code_1c54
code_1a08:
			dup     
			ldi      5
			eq?     
			bnt      code_1a1b
			pushi    0
			call     localproc_058e,  0
			ldi      30
			aTop     ticks
			jmp      code_1c54
code_1a1b:
			dup     
			ldi      6
			eq?     
			bnt      code_1a30
			pushi    #setScript
			pushi    2
			lofsa    adamShoot
			push    
			pushSelf
			self     8
			jmp      code_1c54
code_1a30:
			dup     
			ldi      7
			eq?     
			bnt      code_1a43
			pushi    0
			call     localproc_04fb,  0
			ldi      20
			aTop     cycles
			jmp      code_1c54
code_1a43:
			dup     
			ldi      8
			eq?     
			bnt      code_1a85
			lsl      local77
			ldi      3
			eq?     
			bnt      code_1a6f
			pushi    1
			pushi    160
			callb    proc0_6,  2
			pushi    5
			pushi    1
			lea      @local134
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c54
code_1a6f:
			pushi    5
			pushi    1
			lea      @local102
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c54
code_1a85:
			dup     
			ldi      9
			eq?     
			bnt      code_1aec
			pushi    0
			call     localproc_0527,  0
			pushi    #x
			pushi    1
			pushi    63
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
code_1a9e:
			-al      local11
			sat      temp0
			push    
			ldi      0
			ge?     
			bnt      code_1abe
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local27
			send     4
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local24
			send     4
			jmp      code_1a9e
code_1abe:
			pushi    #doit
			pushi    0
			lofsa    cleanTarget
			send     4
			lsl      local77
			ldi      3
			eq?     
			bnt      code_1ae0
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    320
			lag      global2
			send     6
			jmp      code_1c54
code_1ae0:
			pushi    0
			call     localproc_01da,  0
			ldi      2
			aTop     cycles
			jmp      code_1c54
code_1aec:
			dup     
			ldi      10
			eq?     
			bnt      code_1b17
			pushi    0
			call     localproc_0220,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			ldi      3
			aTop     cycles
			jmp      code_1c54
code_1b17:
			dup     
			ldi      11
			eq?     
			bnt      code_1b34
			pushi    5
			pushi    1
			lea      @local106
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c54
code_1b34:
			dup     
			ldi      12
			eq?     
			bnt      code_1b4f
			ldi      0
			sal      local11
			ldi      0
			sal      local4
			pushi    0
			call     localproc_05a8,  0
			ldi      30
			aTop     ticks
			jmp      code_1c54
code_1b4f:
			dup     
			ldi      13
			eq?     
			bnt      code_1b64
			pushi    #setScript
			pushi    2
			lofsa    turnClymBill
			push    
			pushSelf
			self     8
			jmp      code_1c54
code_1b64:
			dup     
			ldi      14
			eq?     
			bnt      code_1b77
			pushi    0
			call     localproc_05a8,  0
			ldi      30
			aTop     ticks
			jmp      code_1c54
code_1b77:
			dup     
			ldi      15
			eq?     
			bnt      code_1b8c
			pushi    #setScript
			pushi    2
			lofsa    turnClymBill
			push    
			pushSelf
			self     8
			jmp      code_1c54
code_1b8c:
			dup     
			ldi      16
			eq?     
			bnt      code_1b9f
			pushi    0
			call     localproc_05a8,  0
			ldi      30
			aTop     ticks
			jmp      code_1c54
code_1b9f:
			dup     
			ldi      17
			eq?     
			bnt      code_1bb4
			pushi    #setScript
			pushi    2
			lofsa    turnClymBill
			push    
			pushSelf
			self     8
			jmp      code_1c54
code_1bb4:
			dup     
			ldi      18
			eq?     
			bnt      code_1bc8
			pushi    0
			call     localproc_0544,  0
			ldi      180
			aTop     ticks
			jmp      code_1c54
code_1bc8:
			dup     
			ldi      19
			eq?     
			bnt      code_1c04
			pushi    0
			call     localproc_0571,  0
			pushi    #x
			pushi    1
			pushi    256
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    arrow
			send     4
			ldi      5
			aTop     cycles
			jmp      code_1c54
code_1c04:
			dup     
			ldi      20
			eq?     
			bnt      code_1c27
			pushi    5
			pushi    1
			lea      @local98
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1c54
code_1c27:
			dup     
			ldi      21
			eq?     
			bnt      code_1c54
			ldi      2
			sal      local83
			ldi      0
			sal      local77
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    5
			pushi    0
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     14
			ldi      1
			sal      local82
			pushi    #dispose
			pushi    0
			self     4
code_1c54:
			toss    
			ret     
		)
	)
)

(instance roundTwo of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cc5
			ldi      0
			sal      local82
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			ldi      4
			aTop     cycles
			jmp      code_2067
code_1cc5:
			dup     
			ldi      1
			eq?     
			bnt      code_1cd8
			pushi    0
			call     localproc_04a9,  0
			ldi      120
			aTop     ticks
			jmp      code_2067
code_1cd8:
			dup     
			ldi      2
			eq?     
			bnt      code_1cfd
			pushi    #play
			pushi    0
			lofsa    drumSound
			send     4
			pushi    5
			pushi    1
			lea      @local114
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2067
code_1cfd:
			dup     
			ldi      3
			eq?     
			bnt      code_1d1d
			pushi    0
			call     localproc_04d6,  0
			ldi      0
			sal      local11
			ldi      0
			sal      local4
			pushi    0
			call     localproc_058e,  0
			ldi      30
			aTop     ticks
			jmp      code_2067
code_1d1d:
			dup     
			ldi      4
			eq?     
			bnt      code_1d32
			pushi    #setScript
			pushi    2
			lofsa    adamShoot
			push    
			pushSelf
			self     8
			jmp      code_2067
code_1d32:
			dup     
			ldi      5
			eq?     
			bnt      code_1d45
			pushi    0
			call     localproc_058e,  0
			ldi      30
			aTop     ticks
			jmp      code_2067
code_1d45:
			dup     
			ldi      6
			eq?     
			bnt      code_1d5a
			pushi    #setScript
			pushi    2
			lofsa    adamShoot
			push    
			pushSelf
			self     8
			jmp      code_2067
code_1d5a:
			dup     
			ldi      7
			eq?     
			bnt      code_1d6d
			pushi    0
			call     localproc_058e,  0
			ldi      30
			aTop     ticks
			jmp      code_2067
code_1d6d:
			dup     
			ldi      8
			eq?     
			bnt      code_1d82
			pushi    #setScript
			pushi    2
			lofsa    adamShoot
			push    
			pushSelf
			self     8
			jmp      code_2067
code_1d82:
			dup     
			ldi      9
			eq?     
			bnt      code_1d95
			pushi    0
			call     localproc_04fb,  0
			ldi      20
			aTop     cycles
			jmp      code_2067
code_1d95:
			dup     
			ldi      10
			eq?     
			bnt      code_1db5
			pushi    0
			call     localproc_0527,  0
			pushi    #x
			pushi    1
			pushi    63
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      7
			aTop     cycles
			jmp      code_2067
code_1db5:
			dup     
			ldi      11
			eq?     
			bnt      code_1df7
			lsl      local77
			ldi      3
			eq?     
			bnt      code_1de1
			pushi    1
			pushi    160
			callb    proc0_6,  2
			pushi    5
			pushi    1
			lea      @local134
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2067
code_1de1:
			pushi    5
			pushi    1
			lea      @local118
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2067
code_1df7:
			dup     
			ldi      12
			eq?     
			bnt      code_1e4f
			ldi      0
			sat      temp0
code_1e02:
			lst      temp0
			ldi      2
			le?     
			bnt      code_1e21
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local27
			send     4
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     local24
			send     4
			+at      temp0
			jmp      code_1e02
code_1e21:
			pushi    #doit
			pushi    0
			lofsa    cleanTarget
			send     4
			lsl      local77
			ldi      3
			eq?     
			bnt      code_1e43
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    320
			lag      global2
			send     6
			jmp      code_2067
code_1e43:
			pushi    0
			call     localproc_01da,  0
			ldi      2
			aTop     cycles
			jmp      code_2067
code_1e4f:
			dup     
			ldi      13
			eq?     
			bnt      code_1e7a
			pushi    0
			call     localproc_0220,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			ldi      7
			aTop     cycles
			jmp      code_2067
code_1e7a:
			dup     
			ldi      14
			eq?     
			bnt      code_1e97
			pushi    5
			pushi    1
			lea      @local122
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2067
code_1e97:
			dup     
			ldi      15
			eq?     
			bnt      code_1ec0
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    159
			pushi    137
			pushi    194
			pushi    0
			lal      local5
			send     24
			ldi      30
			aTop     ticks
			jmp      code_2067
code_1ec0:
			dup     
			ldi      16
			eq?     
			bnt      code_1eee
			pushi    #cel
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    159
			pushi    130
			lal      local5
			send     14
			pushi    #number
			pushi    1
			pushi    906
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			ldi      24
			aTop     ticks
			jmp      code_2067
code_1eee:
			dup     
			ldi      17
			eq?     
			bnt      code_1f13
			pushi    #posn
			pushi    2
			lal      local85
			lsli     local50
			lsli     local59
			pushi    289
			pushi    0
			pushi    7
			pushi    1
			lsli     local71
			lal      local5
			send     18
			ldi      24
			aTop     ticks
			jmp      code_2067
code_1f13:
			dup     
			ldi      18
			eq?     
			bnt      code_1f60
			pushi    #hide
			pushi    0
			lal      local5
			send     4
			pushi    5
			pushi    #superClass
			pushi    332
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			lal      local85
			lsli     local71
			pushi    284
			pushi    2
			lsli     local50
			lsli     local59
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			push    
			ldi      0
			sali     local24
			send     44
			ldi      24
			aTop     ticks
			jmp      code_2067
code_1f60:
			dup     
			ldi      19
			eq?     
			bnt      code_1f9f
			pushi    #number
			pushi    1
			pushi    910
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    #x
			pushi    1
			pushi    63
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			pushi    #x
			pushi    1
			pushi    78
			pushi    3
			pushi    1
			pushi    147
			pushi    194
			pushi    0
			ldi      0
			lali     local30
			send     16
			ldi      20
			aTop     cycles
			jmp      code_2067
code_1f9f:
			dup     
			ldi      20
			eq?     
			bnt      code_1fbc
			pushi    5
			pushi    1
			lea      @local126
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2067
code_1fbc:
			dup     
			ldi      21
			eq?     
			bnt      code_1feb
			pushi    #x
			pushi    1
			pushi    78
			pushi    3
			pushi    1
			pushi    147
			pushi    105
			pushi    0
			ldi      0
			lali     local30
			send     16
			pushi    #x
			pushi    1
			pushi    63
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      5
			aTop     cycles
			jmp      code_2067
code_1feb:
			dup     
			ldi      22
			eq?     
			bnt      code_203a
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    7
			pushi    1
			pushi    #species
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      22
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      106
			sub     
			push    
			pushi    194
			pushi    0
			lofsa    arrow
			send     18
			ldi      1
			sal      local9
			ldi      3
			aTop     cycles
			jmp      code_2067
code_203a:
			dup     
			ldi      23
			eq?     
			bnt      code_2067
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    5
			pushi    0
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     14
			ldi      3
			sal      local83
			ldi      1
			sal      local82
			ldi      0
			sal      local77
			pushi    #dispose
			pushi    0
			self     4
code_2067:
			toss    
			ret     
		)
	)
)

(instance puckHasLost of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20d9
			ldi      2
			sal      local10
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			ldi      5
			aTop     cycles
			jmp      code_2143
code_20d9:
			dup     
			ldi      1
			eq?     
			bnt      code_2110
			pushi    #x
			pushi    1
			pushi    159
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    adamBigArrow
			send     16
			pushi    #show
			pushi    0
			ldi      0
			lali     local18
			send     4
			ldi      20
			aTop     cycles
			jmp      code_2143
code_2110:
			dup     
			ldi      2
			eq?     
			bnt      code_2131
			pushi    5
			pushi    1
			lea      @local110
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			ldi      1
			aTop     cycles
			jmp      code_2143
code_2131:
			dup     
			ldi      3
			eq?     
			bnt      code_2143
			pushi    #newRoom
			pushi    1
			pushi    320
			lag      global2
			send     6
code_2143:
			toss    
			ret     
		)
	)
)

(instance puckHasWon of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_21b5
			ldi      2
			sal      local10
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			ldi      5
			aTop     cycles
			jmp      code_226b
code_21b5:
			dup     
			ldi      1
			eq?     
			bnt      code_21e2
			pushi    #x
			pushi    1
			pushi    159
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    splitArrow
			send     16
			ldi      8
			aTop     cycles
			jmp      code_226b
code_21e2:
			dup     
			ldi      2
			eq?     
			bnt      code_2207
			pushi    #play
			pushi    0
			lofsa    drumSound
			send     4
			pushi    5
			pushi    1
			lea      @local130
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_226b
code_2207:
			dup     
			ldi      3
			eq?     
			bnt      code_2258
			pushi    #dispose
			pushi    0
			ldi      0
			lali     local24
			send     4
			pushi    #dispose
			pushi    0
			ldi      0
			lali     local18
			send     4
			pushi    #dispose
			pushi    0
			ldi      0
			lali     local12
			send     4
			pushi    #hide
			pushi    0
			lofsa    splitArrow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bigTarget
			send     4
			pushi    0
			callb    proc0_4,  0
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			pushi    1
			pushi    200
			calle    proc806_1,  2
			ldi      15
			aTop     cycles
			jmp      code_226b
code_2258:
			dup     
			ldi      4
			eq?     
			bnt      code_226b
			pushi    #setScript
			pushi    1
			lofsa    goToGoldenArrow
			push    
			lag      global2
			send     6
code_226b:
			toss    
			ret     
		)
	)
)

(instance adamShoot of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_22cc
			pushi    #posn
			pushi    2
			pushi    45
			pushi    137
			pushi    7
			pushi    1
			pushi    1
			lal      local5
			send     14
			ldi      12
			aTop     ticks
			jmp      code_241b
code_22cc:
			dup     
			ldi      1
			eq?     
			bnt      code_22f0
			pushi    #number
			pushi    1
			pushi    906
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    #cel
			pushi    1
			pushi    2
			lal      local5
			send     6
			ldi      12
			aTop     ticks
			jmp      code_241b
code_22f0:
			dup     
			ldi      2
			eq?     
			bnt      code_231c
			pushi    #posn
			pushi    2
			lal      local11
			lsli     local36
			lsli     local39
			pushi    7
			pushi    1
			lal      local85
			lsli     local71
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			lal      local5
			send     24
			ldi      12
			aTop     ticks
			jmp      code_241b
code_231c:
			dup     
			ldi      3
			eq?     
			bnt      code_237a
			pushi    #hide
			pushi    0
			lal      local5
			send     4
			pushi    #x
			pushi    0
			lal      local5
			send     4
			sal      local2
			pushi    #y
			pushi    0
			lal      local5
			send     4
			sal      local3
			pushi    5
			pushi    #superClass
			pushi    332
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			lal      local85
			lsli     local71
			pushi    284
			pushi    2
			lsl      local2
			lsl      local3
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			push    
			lal      local11
			sali     local24
			send     44
			ldi      12
			aTop     ticks
			jmp      code_241b
code_237a:
			dup     
			ldi      4
			eq?     
			bnt      code_240d
			pushi    #number
			pushi    1
			pushi    910
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			lsl      local2
			lal      local85
			lali     local53
			sub     
			push    
			lal      local85
			lali     local65
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      78
			add     
			sal      local6
			lsl      local3
			lal      local85
			lali     local59
			sub     
			push    
			lal      local85
			lali     local68
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      147
			add     
			sal      local7
			lsl      local3
			lal      local4
			eq?     
			bnt      code_23cd
			lsl      local7
			ldi      1
			sub     
			sal      local7
code_23cd:
			lal      local3
			sal      local4
			pushi    5
			pushi    #superClass
			pushi    326
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			lsl      local6
			lsl      local7
			pushi    66
			pushi    1
			pushi    15
			pushi    17
			pushi    1
			pushi    16400
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			push    
			lal      local11
			sali     local30
			send     46
			ldi      12
			aTop     ticks
			jmp      code_241b
code_240d:
			dup     
			ldi      5
			eq?     
			bnt      code_241b
			+al      local11
			pushi    #dispose
			pushi    0
			self     4
code_241b:
			toss    
			ret     
		)
	)
)

(instance turnClymBill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_247d
			pushi    #posn
			pushi    2
			pushi    291
			pushi    143
			pushi    7
			pushi    1
			pushi    1
			lal      local5
			send     14
			ldi      12
			aTop     ticks
			jmp      code_25e4
code_247d:
			dup     
			ldi      1
			eq?     
			bnt      code_24b5
			pushi    #number
			pushi    1
			pushi    906
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			pushi    #cel
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lal      local5
			send     4
			push    
			pushi    #y
			pushi    0
			lal      local5
			send     4
			push    
			lal      local5
			send     14
			ldi      12
			aTop     ticks
			jmp      code_25e4
code_24b5:
			dup     
			ldi      2
			eq?     
			bnt      code_24e4
			pushi    0
			call     localproc_02f4,  0
			pushi    #posn
			pushi    2
			lsl      local42
			lsl      local43
			pushi    289
			pushi    0
			pushi    7
			pushi    1
			lal      local85
			lsli     local71
			pushi    66
			pushi    1
			pushi    10
			lal      local5
			send     24
			ldi      12
			aTop     ticks
			jmp      code_25e4
code_24e4:
			dup     
			ldi      3
			eq?     
			bnt      code_2542
			pushi    #hide
			pushi    0
			lal      local5
			send     4
			pushi    #x
			pushi    0
			lal      local5
			send     4
			sal      local2
			pushi    #y
			pushi    0
			lal      local5
			send     4
			sal      local3
			pushi    5
			pushi    #superClass
			pushi    332
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			lal      local85
			lsli     local71
			pushi    284
			pushi    2
			lsl      local2
			lsl      local3
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    10
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			push    
			lal      local11
			sali     local27
			send     44
			ldi      12
			aTop     ticks
			jmp      code_25e4
code_2542:
			dup     
			ldi      4
			eq?     
			bnt      code_25d6
			pushi    #number
			pushi    1
			pushi    910
			pushi    42
			pushi    0
			lofsa    shootSound
			send     10
			lsl      local2
			lal      local85
			lali     local56
			sub     
			push    
			lal      local85
			lali     local65
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      271
			add     
			sal      local6
			lsl      local3
			lal      local85
			lali     local59
			sub     
			push    
			lal      local85
			lali     local68
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      147
			add     
			sal      local7
			lsl      local3
			lal      local4
			eq?     
			bnt      code_2596
			lsl      local7
			ldi      1
			sub     
			sal      local7
code_2596:
			lal      local3
			sal      local4
			pushi    5
			pushi    #superClass
			pushi    326
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			lsl      local6
			lsl      local7
			pushi    66
			pushi    1
			pushi    15
			pushi    17
			pushi    1
			pushi    16400
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    View
			send     4
			push    
			lal      local11
			sali     local33
			send     46
			ldi      12
			aTop     ticks
			jmp      code_25e4
code_25d6:
			dup     
			ldi      5
			eq?     
			bnt      code_25e4
			+al      local11
			pushi    #dispose
			pushi    0
			self     4
code_25e4:
			toss    
			ret     
		)
	)
)

(instance puckCloseUpTarg of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_267b
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #x
			pushi    1
			pushi    151
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      0
			sat      temp0
code_265d:
			lst      temp0
			lal      local10
			lt?     
			bnt      code_2674
			pushi    #show
			pushi    0
			lat      temp0
			lali     local18
			send     4
			+at      temp0
			jmp      code_265d
code_2674:
			ldi      24
			aTop     cycles
			jmp      code_26f5
code_267b:
			dup     
			ldi      1
			eq?     
			bnt      code_26b1
			pushi    #x
			pushi    1
			pushi    151
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      0
			sat      temp0
code_2694:
			lst      temp0
			lal      local10
			lt?     
			bnt      code_26aa
			pushi    #hide
			pushi    0
			lat      temp0
			lali     local18
			send     4
			+at      temp0
			jmp      code_2694
code_26aa:
			ldi      5
			aTop     cycles
			jmp      code_26f5
code_26b1:
			dup     
			ldi      2
			eq?     
			bnt      code_26f5
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			lsl      local9
			ldi      1
			eq?     
			bnt      code_26db
			pushi    #show
			pushi    0
			lofsa    arrow
			send     4
code_26db:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    5
			pushi    0
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     14
			pushi    #dispose
			pushi    0
			self     4
code_26f5:
			toss    
			ret     
		)
	)
)

(instance goToGoldenArrow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_274f
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    10
			callb    proc0_6,  2
			ldi      24
			aTop     ticks
			jmp      code_2782
code_274f:
			dup     
			ldi      1
			eq?     
			bnt      code_276c
			pushi    5
			pushi    1
			lea      @local138
			push    
			lea      @local143
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_2782
code_276c:
			dup     
			ldi      2
			eq?     
			bnt      code_2782
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    320
			lag      global2
			send     6
code_2782:
			toss    
			ret     
		)
	)
)

(instance showEmptyTarget of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_27ed
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			ldi      1
			aTop     cycles
			jmp      code_2892
code_27ed:
			dup     
			ldi      1
			eq?     
			bnt      code_280a
			pushi    #x
			pushi    1
			pushi    151
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      3
			aTop     cycles
			jmp      code_2892
code_280a:
			dup     
			ldi      2
			eq?     
			bnt      code_2832
			lal      local1
			bnt      code_2829
			ldi      0
			sal      local1
			pushi    3
			pushi    1330
			pushi    16
			pushSelf
			calle    proc13_4,  6
			jmp      code_2892
code_2829:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_2892
code_2832:
			dup     
			ldi      3
			eq?     
			bnt      code_284e
			pushi    #x
			pushi    1
			pushi    151
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      3
			aTop     cycles
			jmp      code_2892
code_284e:
			dup     
			ldi      4
			eq?     
			bnt      code_2892
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			lsl      local9
			ldi      1
			eq?     
			bnt      code_2878
			pushi    #show
			pushi    0
			lofsa    arrow
			send     4
code_2878:
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    5
			pushi    0
			pushi    2
			pushi    3
			pushi    6
			pushi    7
			lag      global69
			send     14
			pushi    #dispose
			pushi    0
			self     4
code_2892:
			toss    
			ret     
		)
	)
)

(instance drumSound of Sound
	(properties
		flags $0001
		number 920
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
	)
)

(instance targetArea of Feature
	(properties
		x 171
		y 136
		nsTop 64
		nsLeft 83
		nsBottom 155
		nsRight 245
		description 11273
		sightAngle 90
	)
	
	(method (init)
		(asm
			pushi    84
			lsl      local85
			ldi      10
			mul     
			sub     
			aTop     nsTop
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_2981
			lal      local9
			bnt      code_298c
			lsl      local10
			pushi    3
			dup     
			lal      local81
			mul     
			add     
			lt?     
			bnt      code_298c
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_298c
			pushi    #setScript
			pushi    1
			lofsa    fireArrow
			push    
			lag      global2
			send     6
			jmp      code_298c
code_2981:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_298c:
			toss    
			ret     
		)
	)
)
