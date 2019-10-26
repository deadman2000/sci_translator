;;; Sierra Script 1.0 - (do not remove this comment)
(script# 421)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	sentence 0
)

(local
	[local0 9] = [59 0 2 4 21 32 20 23 31]
	[local9 15] = [1420 88 1 1 2 1 1 2 1 1 0 1420 96 1]
	[local24 4] = [1420 97 1]
	[local28 17] = [1420 98 1 1 2 1 1 1 1 1 2 1 2 1 3 1]
	[local45 15] = [1420 114 1 1 2 1 1 2 1 2 1 1 1 1]
	[local60 7] = [1420 126 1 2 1 2]
	[local67 11] = [1420 132 1 1 2 1 1 2 1 1]
)
(instance sentence of Rm
	(properties
		picture 420
		style $800a
	)
	
	(method (init param1)
		(asm
			pushi    3
			pushi    129
			pushi    420
			pushi    480
			calle    proc958_0,  6
			pushi    7
			pushi    128
			pushi    420
			pushi    423
			pushi    425
			pushi    422
			pushi    59
			pushi    424
			calle    proc958_0,  14
			pushi    4
			pushi    132
			pushi    10
			pushi    8
			pushi    11
			calle    proc958_0,  8
			pushi    #init
			pushi    0
			&rest    param1
			super    Rm,  4
			pushi    #disable
			pushi    8
			pushi    0
			pushi    1
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     20
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			lofsa    scribe
			send     4
			lsg      global151
			dup     
			ldi      10
			eq?     
			bnt      code_00d1
			pushi    #add
			pushi    1
			lofsa    marianM
			push    
			lag      global10
			send     6
			pushi    #add
			pushi    1
			lofsa    tuckie
			push    
			lag      global10
			send     6
			pushi    #init
			pushi    0
			lofsa    robinH
			send     4
			pushi    #init
			pushi    0
			lofsa    kingRichie
			send     4
			pushi    #number
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			pushi    159
			pushi    4
			pushi    127
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     28
			pushi    #setScript
			pushi    1
			lofsa    deliverJudgement1
			push    
			lag      global2
			send     6
			jmp      code_0293
code_00d1:
			dup     
			ldi      20
			eq?     
			bnt      code_01cf
			pushi    284
			pushi    #-info-
			pushi    130
			pushi    158
			pushi    63
			pushi    1
			pushi    10
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    107
			pushi    0
			lofsa    robinH
			send     24
			pushi    6
			pushi    #superClass
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    205
			pushi    3
			pushi    1
			pushi    116
			pushi    63
			pushi    1
			pushi    7
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    kingRichie
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    107
			pushi    0
			lofsa    kingRichie
			send     40
			pushi    #add
			pushi    1
			lofsa    marianM
			push    
			lag      global10
			send     6
			pushi    4
			pushi    #superClass
			pushi    151
			pushi    3
			pushi    1
			pushi    133
			pushi    63
			pushi    1
			pushi    9
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    marianM
			send     4
			push    
			ldi      16
			or      
			push    
			lofsa    marianM
			send     24
			pushi    #x
			pushi    1
			pushi    306
			pushi    3
			pushi    1
			pushi    132
			lofsa    prior
			send     12
			pushi    #x
			pushi    1
			pushi    295
			pushi    3
			pushi    1
			pushi    134
			lofsa    abbot
			send     12
			pushi    #x
			pushi    1
			pushi    286
			pushi    3
			pushi    1
			pushi    133
			lofsa    sheriff
			send     12
			pushi    #x
			pushi    1
			pushi    225
			pushi    3
			pushi    1
			pushi    112
			lofsa    fulkie
			send     12
			pushi    #number
			pushi    1
			pushi    8
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			pushi    159
			pushi    4
			pushi    127
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     28
			pushi    #setScript
			pushi    1
			lofsa    deliverJudgement2
			push    
			lag      global2
			send     6
			jmp      code_0293
code_01cf:
			dup     
			ldi      30
			eq?     
			bnt      code_0293
			pushi    284
			pushi    #-info-
			pushi    148
			dup     
			pushi    63
			pushi    1
			pushi    9
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    107
			pushi    0
			lofsa    robinH
			send     24
			pushi    6
			pushi    #superClass
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    205
			pushi    3
			pushi    1
			pushi    116
			pushi    63
			pushi    1
			pushi    7
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    kingRichie
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    107
			pushi    0
			lofsa    kingRichie
			send     40
			pushi    #x
			pushi    1
			pushi    145
			pushi    3
			pushi    1
			pushi    108
			lofsa    prior
			send     12
			pushi    #x
			pushi    1
			pushi    137
			pushi    3
			pushi    1
			pushi    116
			lofsa    abbot
			send     12
			pushi    #x
			pushi    1
			pushi    116
			pushi    3
			pushi    1
			pushi    109
			lofsa    sheriff
			send     12
			pushi    #x
			pushi    1
			pushi    246
			pushi    3
			pushi    1
			pushi    106
			lofsa    fulkie
			send     12
			pushi    #number
			pushi    1
			pushi    8
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			pushi    159
			pushi    4
			pushi    127
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     28
			pushi    #setScript
			pushi    1
			lofsa    deliverJudgement3
			push    
			lag      global2
			send     6
code_0293:
			toss    
			pushi    #add
			pushi    11
			lofsa    guardD
			push    
			lofsa    spect1
			push    
			lofsa    spect2
			push    
			lofsa    spect3
			push    
			lofsa    spect4
			push    
			lofsa    spect5
			push    
			lofsa    spect6
			push    
			lofsa    fulkie
			push    
			lofsa    sheriff
			push    
			lofsa    abbot
			push    
			lofsa    prior
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     36
			ret     
		)
	)
)

(instance robinH of Prop
	(properties
		x 162
		y 155
		view 422
		loop 2
		priority 10
		signal $0010
	)
)

(instance guardD of PicView
	(properties
		x 73
		y 122
		view 420
		loop 9
		priority 0
		signal $0010
	)
)

(instance spect1 of PicView
	(properties
		x 51
		y 32
		view 420
		loop 2
		priority 0
		signal $0010
	)
)

(instance spect2 of PicView
	(properties
		x 99
		y 19
		view 420
		loop 3
		priority 0
		signal $0010
	)
)

(instance spect3 of PicView
	(properties
		x 163
		y 9
		view 420
		loop 5
		priority 0
		signal $0010
	)
)

(instance spect4 of PicView
	(properties
		x 208
		y 11
		view 420
		loop 5
		cel 1
		priority 0
		signal $0010
	)
)

(instance spect5 of PicView
	(properties
		x 271
		y 18
		view 420
		loop 4
		priority 0
		signal $0010
	)
)

(instance spect6 of PicView
	(properties
		x 304
		y 14
		view 420
		loop 4
		cel 1
		priority 0
		signal $0010
	)
)

(instance marianM of PicView
	(properties
		x 135
		y 139
		view 423
		priority 9
		signal $0010
	)
)

(instance tuckie of PicView
	(properties
		x 149
		y 131
		view 423
		loop 1
		priority 9
		signal $0010
	)
)

(instance fulkie of PicView
	(properties
		x 196
		y 117
		view 423
		loop 10
		priority 0
		signal $0010
	)
)

(instance sheriff of PicView
	(properties
		x 273
		y 133
		view 425
		priority 9
		signal $0010
	)
)

(instance abbot of PicView
	(properties
		x 266
		y 134
		view 425
		cel 1
		priority 9
		signal $0010
	)
)

(instance prior of PicView
	(properties
		x 262
		y 130
		view 425
		loop 1
		cel 3
		priority 9
		signal $0010
	)
)

(instance scribe of Prop
	(properties
		x 268
		y 142
		view 420
		priority 9
		signal $0010
	)
)

(instance kingRichie of Prop
	(properties
		x 194
		y 148
		view 422
		loop 3
		priority 9
		signal $0010
	)
)

(instance abbotTuck of Prop
	(properties
		x 161
		y 176
		view 424
		loop 1
		priority 13
		signal $0010
	)
)

(instance robinNMarian of Prop
	(properties
		x 159
		y 200
		view 424
		priority 14
		signal $0010
	)
)

(instance guests of View
	(properties
		x 257
		y 189
		view 424
		loop 3
		priority 15
		signal $0010
	)
)

(instance guests2 of View
	(properties
		x 45
		y 181
		view 424
		loop 3
		cel 1
		priority 15
		signal $0010
	)
)

(instance bardsHead of Prop
	(properties
		x 132
		y 44
		view 800
		priority 12
		signal $0010
	)
)

(instance bardsHand of Prop
	(properties
		x 120
		y 57
		view 800
		loop 1
		priority 15
		signal $0010
	)
)

(instance bardsFingers of Prop
	(properties
		x 202
		y 51
		view 800
		loop 2
		priority 15
		signal $0010
	)
)

(instance deliverJudgement1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0abc
			ldi      180
			aTop     ticks
			jmp      code_0c35
code_0abc:
			dup     
			ldi      1
			eq?     
			bnt      code_0adc
			pushi    7
			pushi    2
			lea      @local9
			push    
			lea      @local0
			push    
			pushi    3
			dup     
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0c35
code_0adc:
			dup     
			ldi      2
			eq?     
			bnt      code_0aea
			ldi      90
			aTop     ticks
			jmp      code_0c35
code_0aea:
			dup     
			ldi      3
			eq?     
			bnt      code_0b07
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     14
			jmp      code_0c35
code_0b07:
			dup     
			ldi      4
			eq?     
			bnt      code_0b21
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    1
			pushSelf
			lofsa    kingRichie
			send     12
			jmp      code_0c35
code_0b21:
			dup     
			ldi      5
			eq?     
			bnt      code_0b2f
			ldi      60
			aTop     ticks
			jmp      code_0c35
code_0b2f:
			dup     
			ldi      6
			eq?     
			bnt      code_0b50
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			lofsa    kingRichie
			send     18
			jmp      code_0c35
code_0b50:
			dup     
			ldi      7
			eq?     
			bnt      code_0b5e
			ldi      60
			aTop     ticks
			jmp      code_0c35
code_0b5e:
			dup     
			ldi      8
			eq?     
			bnt      code_0b79
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    1
			pushi    65535
			pushSelf
			lofsa    kingRichie
			send     12
			jmp      code_0c35
code_0b79:
			dup     
			ldi      9
			eq?     
			bnt      code_0b87
			ldi      60
			aTop     ticks
			jmp      code_0c35
code_0b87:
			dup     
			ldi      10
			eq?     
			bnt      code_0b9e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    kingRichie
			send     8
			jmp      code_0c35
code_0b9e:
			dup     
			ldi      11
			eq?     
			bnt      code_0bbc
			pushi    5
			pushi    1
			lea      @local24
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0c35
code_0bbc:
			dup     
			ldi      12
			eq?     
			bnt      code_0bca
			ldi      30
			aTop     ticks
			jmp      code_0c35
code_0bca:
			dup     
			ldi      13
			eq?     
			bnt      code_0be1
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    robinH
			send     8
			jmp      code_0c35
code_0be1:
			dup     
			ldi      14
			eq?     
			bnt      code_0c06
			pushi    9
			pushi    3
			lea      @local28
			push    
			lea      @local0
			push    
			pushi    1
			pushi    3
			pushi    0
			pushi    21
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_0c35
code_0c06:
			dup     
			ldi      15
			eq?     
			bnt      code_0c14
			ldi      120
			aTop     ticks
			jmp      code_0c35
code_0c14:
			dup     
			ldi      16
			eq?     
			bnt      code_0c29
			pushi    #setScript
			pushi    2
			lofsa    theWedding
			push    
			pushSelf
			self     8
			jmp      code_0c35
code_0c29:
			dup     
			ldi      17
			eq?     
			bnt      code_0c35
			pushi    #dispose
			pushi    0
			self     4
code_0c35:
			toss    
			ret     
		)
	)
)

(instance theWedding of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cc1
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global10
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #number
			pushi    1
			pushi    11
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			pushi    159
			pushi    4
			pushi    127
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     28
			ldi      30
			aTop     ticks
			jmp      code_0dff
code_0cc1:
			dup     
			ldi      1
			eq?     
			bnt      code_0cfd
			pushi    #init
			pushi    0
			lofsa    abbotTuck
			send     4
			pushi    #init
			pushi    0
			lofsa    robinNMarian
			send     4
			pushi    #init
			pushi    0
			lofsa    guests
			send     4
			pushi    #init
			pushi    0
			lofsa    guests2
			send     4
			pushi    #drawPic
			pushi    2
			pushi    480
			pushi    32775
			lag      global2
			send     8
			ldi      30
			aTop     ticks
			jmp      code_0dff
code_0cfd:
			dup     
			ldi      2
			eq?     
			bnt      code_0d14
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    abbotTuck
			send     6
			ldi      24
			aTop     ticks
			jmp      code_0dff
code_0d14:
			dup     
			ldi      3
			eq?     
			bnt      code_0d2a
			pushi    3
			pushi    1420
			pushi    112
			pushSelf
			calle    proc13_4,  6
			jmp      code_0dff
code_0d2a:
			dup     
			ldi      4
			eq?     
			bnt      code_0d47
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinNMarian
			send     14
			jmp      code_0dff
code_0d47:
			dup     
			ldi      5
			eq?     
			bnt      code_0d5e
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    abbotTuck
			send     6
			ldi      24
			aTop     ticks
			jmp      code_0dff
code_0d5e:
			dup     
			ldi      6
			eq?     
			bnt      code_0d74
			pushi    3
			pushi    1420
			pushi    113
			pushSelf
			calle    proc13_4,  6
			jmp      code_0dff
code_0d74:
			dup     
			ldi      7
			eq?     
			bnt      code_0d9c
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    robinNMarian
			send     30
			jmp      code_0dff
code_0d9c:
			dup     
			ldi      8
			eq?     
			bnt      code_0dbd
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lofsa    robinNMarian
			send     18
			jmp      code_0dff
code_0dbd:
			dup     
			ldi      9
			eq?     
			bnt      code_0dda
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinNMarian
			send     14
			jmp      code_0dff
code_0dda:
			dup     
			ldi      10
			eq?     
			bnt      code_0de9
			ldi      180
			aTop     ticks
			jmp      code_0dff
code_0de9:
			dup     
			ldi      11
			eq?     
			bnt      code_0dff
			pushi    #newRoom
			pushi    1
			pushi    97
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0dff:
			toss    
			ret     
		)
	)
)

(instance deliverJudgement2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e50
			ldi      180
			aTop     ticks
			jmp      code_0f97
code_0e50:
			dup     
			ldi      1
			eq?     
			bnt      code_0e6d
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    kingRichie
			send     14
			jmp      code_0f97
code_0e6d:
			dup     
			ldi      2
			eq?     
			bnt      code_0e8d
			pushi    7
			pushi    2
			lea      @local45
			push    
			lea      @local0
			push    
			pushi    1
			pushi    3
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0f97
code_0e8d:
			dup     
			ldi      3
			eq?     
			bnt      code_0ead
			pushi    7
			pushi    2
			lea      @local60
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0f97
code_0ead:
			dup     
			ldi      4
			eq?     
			bnt      code_0edb
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global10
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      30
			aTop     ticks
			jmp      code_0f97
code_0edb:
			dup     
			ldi      5
			eq?     
			bnt      code_0f27
			pushi    #drawPic
			pushi    2
			pushi    800
			pushi    32775
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    sing
			push    
			lofsa    bardsHead
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    strum
			push    
			lofsa    bardsHand
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    riff
			push    
			lofsa    bardsFingers
			send     10
			ldi      30
			aTop     ticks
			jmp      code_0f97
code_0f27:
			dup     
			ldi      6
			eq?     
			bnt      code_0f45
			pushi    6
			pushi    1420
			pushi    130
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			calle    proc13_4,  12
			jmp      code_0f97
code_0f45:
			dup     
			ldi      7
			eq?     
			bnt      code_0f63
			pushi    6
			pushi    1420
			pushi    131
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			calle    proc13_4,  12
			jmp      code_0f97
code_0f63:
			dup     
			ldi      8
			eq?     
			bnt      code_0f81
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      72
			aTop     ticks
			jmp      code_0f97
code_0f81:
			dup     
			ldi      9
			eq?     
			bnt      code_0f97
			pushi    #newRoom
			pushi    1
			pushi    97
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0f97:
			toss    
			ret     
		)
	)
)

(instance deliverJudgement3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0fe8
			ldi      180
			aTop     ticks
			jmp      code_110f
code_0fe8:
			dup     
			ldi      1
			eq?     
			bnt      code_1005
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    kingRichie
			send     14
			jmp      code_110f
code_1005:
			dup     
			ldi      2
			eq?     
			bnt      code_1025
			pushi    7
			pushi    2
			lea      @local67
			push    
			lea      @local0
			push    
			pushi    3
			dup     
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_110f
code_1025:
			dup     
			ldi      3
			eq?     
			bnt      code_1053
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global10
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      30
			aTop     ticks
			jmp      code_110f
code_1053:
			dup     
			ldi      4
			eq?     
			bnt      code_109f
			pushi    #drawPic
			pushi    2
			pushi    800
			pushi    32775
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    sing
			push    
			lofsa    bardsHead
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    strum
			push    
			lofsa    bardsHand
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    riff
			push    
			lofsa    bardsFingers
			send     10
			ldi      2
			aTop     cycles
			jmp      code_110f
code_109f:
			dup     
			ldi      5
			eq?     
			bnt      code_10bd
			pushi    6
			pushi    1420
			pushi    140
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			calle    proc13_4,  12
			jmp      code_110f
code_10bd:
			dup     
			ldi      6
			eq?     
			bnt      code_10db
			pushi    6
			pushi    1420
			pushi    141
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			calle    proc13_4,  12
			jmp      code_110f
code_10db:
			dup     
			ldi      7
			eq?     
			bnt      code_10f9
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      72
			aTop     ticks
			jmp      code_110f
code_10f9:
			dup     
			ldi      8
			eq?     
			bnt      code_110f
			pushi    #newRoom
			pushi    1
			pushi    97
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_110f:
			toss    
			ret     
		)
	)
)

(instance sing of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1167
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1297
code_1167:
			dup     
			ldi      1
			eq?     
			bnt      code_117c
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_117c:
			dup     
			ldi      2
			eq?     
			bnt      code_1192
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1297
code_1192:
			dup     
			ldi      3
			eq?     
			bnt      code_11a7
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_11a7:
			dup     
			ldi      4
			eq?     
			bnt      code_11bd
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1297
code_11bd:
			dup     
			ldi      5
			eq?     
			bnt      code_11d2
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_11d2:
			dup     
			ldi      6
			eq?     
			bnt      code_11e8
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1297
code_11e8:
			dup     
			ldi      7
			eq?     
			bnt      code_11fd
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_11fd:
			dup     
			ldi      8
			eq?     
			bnt      code_1213
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1297
code_1213:
			dup     
			ldi      9
			eq?     
			bnt      code_1228
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_1228:
			dup     
			ldi      10
			eq?     
			bnt      code_123e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1297
code_123e:
			dup     
			ldi      11
			eq?     
			bnt      code_1253
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_1253:
			dup     
			ldi      12
			eq?     
			bnt      code_1269
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1297
code_1269:
			dup     
			ldi      13
			eq?     
			bnt      code_1288
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			pushi    10
			pushi    2
			pushi    4
			pushi    11
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1297
code_1288:
			dup     
			ldi      14
			eq?     
			bnt      code_1297
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_1297:
			toss    
			ret     
		)
	)
)

(instance strum of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12ef
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1448
code_12ef:
			dup     
			ldi      1
			eq?     
			bnt      code_1305
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1448
code_1305:
			dup     
			ldi      2
			eq?     
			bnt      code_131b
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_1448
code_131b:
			dup     
			ldi      3
			eq?     
			bnt      code_1331
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      36
			aTop     ticks
			jmp      code_1448
code_1331:
			dup     
			ldi      4
			eq?     
			bnt      code_1347
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_1448
code_1347:
			dup     
			ldi      5
			eq?     
			bnt      code_135d
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_1448
code_135d:
			dup     
			ldi      6
			eq?     
			bnt      code_1373
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_1448
code_1373:
			dup     
			ldi      7
			eq?     
			bnt      code_1389
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1448
code_1389:
			dup     
			ldi      8
			eq?     
			bnt      code_139f
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1448
code_139f:
			dup     
			ldi      9
			eq?     
			bnt      code_13b5
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1448
code_13b5:
			dup     
			ldi      10
			eq?     
			bnt      code_13cb
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_1448
code_13cb:
			dup     
			ldi      11
			eq?     
			bnt      code_13e1
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_1448
code_13e1:
			dup     
			ldi      12
			eq?     
			bnt      code_13f7
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_1448
code_13f7:
			dup     
			ldi      13
			eq?     
			bnt      code_140d
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      42
			aTop     ticks
			jmp      code_1448
code_140d:
			dup     
			ldi      14
			eq?     
			bnt      code_1423
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      36
			aTop     ticks
			jmp      code_1448
code_1423:
			dup     
			ldi      15
			eq?     
			bnt      code_1439
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1448
code_1439:
			dup     
			ldi      16
			eq?     
			bnt      code_1448
			ldi      6
			aTop     ticks
			ldi      65535
			aTop     state
code_1448:
			toss    
			ret     
		)
	)
)

(instance riff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_149f
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_155e
code_149f:
			dup     
			ldi      1
			eq?     
			bnt      code_14b5
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_155e
code_14b5:
			dup     
			ldi      2
			eq?     
			bnt      code_14cb
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_155e
code_14cb:
			dup     
			ldi      3
			eq?     
			bnt      code_14e1
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_155e
code_14e1:
			dup     
			ldi      4
			eq?     
			bnt      code_14f7
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_155e
code_14f7:
			dup     
			ldi      5
			eq?     
			bnt      code_150d
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_155e
code_150d:
			dup     
			ldi      6
			eq?     
			bnt      code_1523
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_155e
code_1523:
			dup     
			ldi      7
			eq?     
			bnt      code_1539
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_155e
code_1539:
			dup     
			ldi      8
			eq?     
			bnt      code_154f
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_155e
code_154f:
			dup     
			ldi      9
			eq?     
			bnt      code_155e
			ldi      24
			aTop     ticks
			ldi      65535
			aTop     state
code_155e:
			toss    
			ret     
		)
	)
)
