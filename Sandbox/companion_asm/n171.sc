;;; Sierra Script 1.0 - (do not remove this comment)
(script# 171)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n940)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	strat 0
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
)
(procedure (localproc_000e)
	(asm
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    2
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_002d
		pushi    #get
		pushi    1
		pushi    2
		lag      global0
		send     6
code_002d:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    11
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_004e
		pushi    #get
		pushi    1
		pushi    11
		lag      global0
		send     6
code_004e:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    12
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_006f
		pushi    #get
		pushi    1
		pushi    12
		lag      global0
		send     6
code_006f:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    13
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_0090
		pushi    #get
		pushi    1
		pushi    13
		lag      global0
		send     6
code_0090:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    14
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_00b1
		pushi    #get
		pushi    1
		pushi    14
		lag      global0
		send     6
code_00b1:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    16
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_00d2
		pushi    #get
		pushi    1
		pushi    16
		lag      global0
		send     6
code_00d2:
		pushi    #owner
		pushi    0
		pushi    #at
		pushi    1
		pushi    17
		class    Inv
		send     6
		send     4
		push    
		ldi      140
		eq?     
		bnt      code_00f3
		pushi    #get
		pushi    1
		pushi    17
		lag      global0
		send     6
code_00f3:
		ret     
	)
)

(instance strat of Rm
	(properties
		picture 190
		style $0008
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_3,  0
			pushi    #number
			pushi    1
			pushi    171
			pushi    6
			pushi    1
			pushi    65535
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			pushi    159
			pushi    4
			pushi    127
			pushi    21
			pushi    12
			pushi    0
			lag      global100
			send     32
			pushi    2
			pushi    1
			pushi    8
			callk    Random,  4
			sal      local3
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0207
			pushi    #x
			pushi    1
			pushi    108
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    105
			pushi    3
			pushi    1
			pushi    104
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    84
			pushi    3
			pushi    1
			pushi    119
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    169
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    175
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    153
			pushi    3
			pushi    1
			pushi    180
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    238
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    228
			pushi    3
			pushi    1
			pushi    147
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    222
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    293
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    297
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    44
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    41
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_0207:
			dup     
			ldi      2
			eq?     
			bnt      code_02e5
			pushi    #x
			pushi    1
			pushi    108
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    105
			pushi    3
			pushi    1
			pushi    104
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    84
			pushi    3
			pushi    1
			pushi    119
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    169
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    175
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    153
			pushi    3
			pushi    1
			pushi    180
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    238
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    228
			pushi    3
			pushi    1
			pushi    147
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    222
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    293
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    297
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    44
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    41
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_02e5:
			dup     
			ldi      3
			eq?     
			bnt      code_03c2
			pushi    #x
			pushi    1
			pushi    33
			pushi    3
			pushi    1
			pushi    95
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    30
			pushi    3
			pushi    1
			pushi    111
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    7
			pushi    3
			pushi    1
			pushi    124
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    286
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    291
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    270
			pushi    3
			pushi    1
			pushi    176
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    93
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    84
			pushi    3
			pushi    1
			pushi    149
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    77
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    217
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    221
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    160
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    158
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_03c2:
			dup     
			ldi      4
			eq?     
			bnt      code_04a0
			pushi    #x
			pushi    1
			pushi    215
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    212
			pushi    3
			pushi    1
			pushi    109
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    193
			pushi    3
			pushi    1
			pushi    120
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    38
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    41
			pushi    3
			pushi    1
			pushi    139
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    21
			pushi    3
			pushi    1
			pushi    176
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    278
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    268
			pushi    3
			pushi    1
			pushi    149
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    260
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    105
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    109
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    160
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    158
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_04a0:
			dup     
			ldi      5
			eq?     
			bnt      code_057e
			pushi    #x
			pushi    1
			pushi    283
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    281
			pushi    3
			pushi    1
			pushi    107
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    260
			pushi    3
			pushi    1
			pushi    122
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    230
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    234
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    214
			pushi    3
			pushi    1
			pushi    173
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    32
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    21
			pushi    3
			pushi    1
			pushi    149
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    15
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    94
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    98
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    160
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    158
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_057e:
			dup     
			ldi      6
			eq?     
			bnt      code_065d
			pushi    #x
			pushi    1
			pushi    283
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    281
			pushi    3
			pushi    1
			pushi    107
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    260
			pushi    3
			pushi    1
			pushi    122
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    161
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    166
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    144
			pushi    3
			pushi    1
			pushi    175
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    221
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    212
			pushi    3
			pushi    1
			pushi    149
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    206
			pushi    3
			pushi    1
			pushi    187
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    94
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    98
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    37
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_065d:
			dup     
			ldi      7
			eq?     
			bnt      code_073b
			pushi    #x
			pushi    1
			pushi    283
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    281
			pushi    3
			pushi    1
			pushi    107
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    260
			pushi    3
			pushi    1
			pushi    122
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    37
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    42
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    20
			pushi    3
			pushi    1
			pushi    175
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    221
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    212
			pushi    3
			pushi    1
			pushi    149
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    206
			pushi    3
			pushi    1
			pushi    187
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    101
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    105
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    162
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    159
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
			jmp      code_0815
code_073b:
			dup     
			ldi      8
			eq?     
			bnt      code_0815
			pushi    #x
			pushi    1
			pushi    166
			pushi    3
			pushi    1
			pushi    92
			lofsa    lilJohn
			send     12
			pushi    #x
			pushi    1
			pushi    163
			pushi    3
			pushi    1
			pushi    108
			lofsa    johnHead
			send     12
			pushi    #x
			pushi    1
			pushi    142
			pushi    3
			pushi    1
			pushi    123
			lofsa    johnHand
			send     12
			pushi    #x
			pushi    1
			pushi    37
			pushi    3
			pushi    1
			pushi    189
			lofsa    friarTuck
			send     12
			pushi    #x
			pushi    1
			pushi    42
			pushi    3
			pushi    1
			pushi    138
			lofsa    tuckHead
			send     12
			pushi    #x
			pushi    1
			pushi    20
			pushi    3
			pushi    1
			pushi    175
			lofsa    tuckHand
			send     12
			pushi    #x
			pushi    1
			pushi    105
			pushi    3
			pushi    1
			pushi    189
			lofsa    alanDale
			send     12
			pushi    #x
			pushi    1
			pushi    96
			pushi    3
			pushi    1
			pushi    149
			lofsa    alanHead
			send     12
			pushi    #x
			pushi    1
			pushi    88
			pushi    3
			pushi    1
			pushi    188
			lofsa    alanHand
			send     12
			pushi    #x
			pushi    1
			pushi    293
			pushi    3
			pushi    1
			pushi    189
			lofsa    muchMiller
			send     12
			pushi    #x
			pushi    1
			pushi    297
			pushi    3
			pushi    1
			pushi    117
			lofsa    muchHead
			send     12
			pushi    #x
			pushi    1
			pushi    236
			pushi    3
			pushi    1
			pushi    189
			lofsa    willScarlet
			send     12
			pushi    #x
			pushi    1
			pushi    233
			pushi    3
			pushi    1
			pushi    158
			lofsa    willHead
			send     12
code_0815:
			toss    
			pushi    #init
			pushi    0
			lofsa    lilJohn
			send     4
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    johnHead
			send     8
			pushi    #init
			pushi    0
			lofsa    johnHand
			send     4
			pushi    #init
			pushi    0
			lofsa    friarTuck
			send     4
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    tuckHead
			send     8
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    tuckHand
			send     8
			pushi    #init
			pushi    0
			lofsa    alanDale
			send     4
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    alanHead
			send     8
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    alanHand
			send     8
			pushi    #init
			pushi    0
			lofsa    muchMiller
			send     4
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    muchHead
			send     8
			pushi    #init
			pushi    0
			lofsa    willScarlet
			send     4
			pushi    #init
			pushi    0
			pushi    287
			pushi    0
			lofsa    willHead
			send     8
			pushi    #setScript
			pushi    1
			lofsa    talkArbitrator
			push    
			self     6
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance lilJohn of View
	(properties
		view 175
		loop 2
		priority 14
		signal $0010
	)
)

(instance johnHead of Prop
	(properties
		view 175
		priority 15
		signal $0010
	)
)

(instance johnHand of Prop
	(properties
		view 175
		loop 1
		priority 15
		signal $0010
	)
)

(instance friarTuck of View
	(properties
		view 175
		loop 5
		priority 14
		signal $0010
	)
)

(instance tuckHead of Prop
	(properties
		view 175
		loop 3
		priority 15
		signal $0010
	)
)

(instance tuckHand of Prop
	(properties
		view 175
		loop 4
		priority 15
		signal $0010
	)
)

(instance alanDale of View
	(properties
		view 175
		loop 8
		priority 14
		signal $4010
	)
)

(instance alanHead of Prop
	(properties
		view 175
		loop 6
		priority 15
		signal $0010
	)
)

(instance alanHand of Prop
	(properties
		view 175
		loop 7
		priority 15
		signal $4010
	)
)

(instance muchMiller of View
	(properties
		view 175
		loop 12
	)
)

(instance muchHead of Prop
	(properties
		view 175
		loop 11
		priority 15
		signal $0010
	)
)

(instance willScarlet of View
	(properties
		view 175
		loop 10
		priority 14
		signal $4010
	)
)

(instance willHead of Prop
	(properties
		view 175
		loop 9
	)
)

(instance queensKnight of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e55
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    99
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_0fe1
code_0e55:
			dup     
			ldi      1
			eq?     
			bnt      code_0e63
			ldi      10
			aTop     ticks
			jmp      code_0fe1
code_0e63:
			dup     
			ldi      2
			eq?     
			bnt      code_0ea9
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    100
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_0fe1
code_0ea9:
			dup     
			ldi      3
			eq?     
			bnt      code_0eb7
			ldi      10
			aTop     ticks
			jmp      code_0fe1
code_0eb7:
			dup     
			ldi      4
			eq?     
			bnt      code_0ef4
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    101
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_0fe1
code_0ef4:
			dup     
			ldi      5
			eq?     
			bnt      code_0f02
			ldi      10
			aTop     ticks
			jmp      code_0fe1
code_0f02:
			dup     
			ldi      6
			eq?     
			bnt      code_0f3f
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    102
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_0fe1
code_0f3f:
			dup     
			ldi      7
			eq?     
			bnt      code_0f4d
			ldi      10
			aTop     ticks
			jmp      code_0fe1
code_0f4d:
			dup     
			ldi      8
			eq?     
			bnt      code_0fa5
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    103
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_0fe1
code_0fa5:
			dup     
			ldi      9
			eq?     
			bnt      code_0fb3
			ldi      10
			aTop     ticks
			jmp      code_0fe1
code_0fb3:
			dup     
			ldi      10
			eq?     
			bnt      code_0fe1
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #dispose
			pushi    0
			self     4
code_0fe1:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0e17
			lap      param1
			not     
			bnt      code_0e17
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0e20
code_0e17:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_0e20:
			ret     
		)
	)
)

(instance rescueMarian3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1066
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    62
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_1066:
			dup     
			ldi      1
			eq?     
			bnt      code_1074
			ldi      10
			aTop     ticks
			jmp      code_1408
code_1074:
			dup     
			ldi      2
			eq?     
			bnt      code_10a3
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    63
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_10a3:
			dup     
			ldi      3
			eq?     
			bnt      code_10b1
			ldi      10
			aTop     ticks
			jmp      code_1408
code_10b1:
			dup     
			ldi      4
			eq?     
			bnt      code_10f7
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    64
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_10f7:
			dup     
			ldi      5
			eq?     
			bnt      code_1105
			ldi      10
			aTop     ticks
			jmp      code_1408
code_1105:
			dup     
			ldi      6
			eq?     
			bnt      code_1121
			pushi    5
			pushi    1171
			pushi    65
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_1121:
			dup     
			ldi      7
			eq?     
			bnt      code_112f
			ldi      10
			aTop     ticks
			jmp      code_1408
code_112f:
			dup     
			ldi      8
			eq?     
			bnt      code_114b
			pushi    5
			pushi    1171
			pushi    66
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_114b:
			dup     
			ldi      9
			eq?     
			bnt      code_1159
			ldi      10
			aTop     ticks
			jmp      code_1408
code_1159:
			dup     
			ldi      10
			eq?     
			bnt      code_11b1
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    67
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_11b1:
			dup     
			ldi      11
			eq?     
			bnt      code_11bf
			ldi      10
			aTop     ticks
			jmp      code_1408
code_11bf:
			dup     
			ldi      12
			eq?     
			bnt      code_11db
			pushi    5
			pushi    1171
			pushi    68
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_11db:
			dup     
			ldi      13
			eq?     
			bnt      code_11e9
			ldi      10
			aTop     ticks
			jmp      code_1408
code_11e9:
			dup     
			ldi      14
			eq?     
			bnt      code_1205
			pushi    5
			pushi    1171
			pushi    69
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_1205:
			dup     
			ldi      15
			eq?     
			bnt      code_1213
			ldi      10
			aTop     ticks
			jmp      code_1408
code_1213:
			dup     
			ldi      16
			eq?     
			bnt      code_1272
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    70
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_1272:
			dup     
			ldi      17
			eq?     
			bnt      code_1280
			ldi      10
			aTop     ticks
			jmp      code_1408
code_1280:
			dup     
			ldi      18
			eq?     
			bnt      code_129c
			pushi    5
			pushi    1171
			pushi    71
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_129c:
			dup     
			ldi      19
			eq?     
			bnt      code_12aa
			ldi      10
			aTop     ticks
			jmp      code_1408
code_12aa:
			dup     
			ldi      20
			eq?     
			bnt      code_12c6
			pushi    5
			pushi    1171
			pushi    72
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_12c6:
			dup     
			ldi      21
			eq?     
			bnt      code_12d4
			ldi      10
			aTop     ticks
			jmp      code_1408
code_12d4:
			dup     
			ldi      22
			eq?     
			bnt      code_131e
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    73
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_131e:
			dup     
			ldi      23
			eq?     
			bnt      code_132c
			ldi      10
			aTop     ticks
			jmp      code_1408
code_132c:
			dup     
			ldi      24
			eq?     
			bnt      code_1348
			pushi    5
			pushi    1171
			pushi    74
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_1348:
			dup     
			ldi      25
			eq?     
			bnt      code_1356
			ldi      10
			aTop     ticks
			jmp      code_1408
code_1356:
			dup     
			ldi      26
			eq?     
			bnt      code_1390
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    75
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_1390:
			dup     
			ldi      27
			eq?     
			bnt      code_139e
			ldi      10
			aTop     ticks
			jmp      code_1408
code_139e:
			dup     
			ldi      28
			eq?     
			bnt      code_13ba
			pushi    5
			pushi    1171
			pushi    76
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_13ba:
			dup     
			ldi      29
			eq?     
			bnt      code_13c8
			ldi      10
			aTop     ticks
			jmp      code_1408
code_13c8:
			dup     
			ldi      30
			eq?     
			bnt      code_13e4
			pushi    5
			pushi    1171
			pushi    77
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1408
code_13e4:
			dup     
			ldi      31
			eq?     
			bnt      code_13f2
			ldi      10
			aTop     ticks
			jmp      code_1408
code_13f2:
			dup     
			ldi      32
			eq?     
			bnt      code_1408
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1408:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1035
			lap      param1
			not     
			bnt      code_1035
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_103e
code_1035:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_103e:
			ret     
		)
	)
)

(instance rescueMarian2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_148c
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    60
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_148c:
			dup     
			ldi      1
			eq?     
			bnt      code_149a
			ldi      10
			aTop     ticks
			jmp      code_1865
code_149a:
			dup     
			ldi      2
			eq?     
			bnt      code_14b6
			pushi    5
			pushi    1171
			pushi    61
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_14b6:
			dup     
			ldi      3
			eq?     
			bnt      code_14c4
			ldi      10
			aTop     ticks
			jmp      code_1865
code_14c4:
			dup     
			ldi      4
			eq?     
			bnt      code_1501
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    44
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_1501:
			dup     
			ldi      5
			eq?     
			bnt      code_150f
			ldi      10
			aTop     ticks
			jmp      code_1865
code_150f:
			dup     
			ldi      6
			eq?     
			bnt      code_152b
			pushi    5
			pushi    1171
			pushi    45
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_152b:
			dup     
			ldi      7
			eq?     
			bnt      code_1539
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1539:
			dup     
			ldi      8
			eq?     
			bnt      code_1555
			pushi    5
			pushi    1171
			pushi    46
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_1555:
			dup     
			ldi      9
			eq?     
			bnt      code_1563
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1563:
			dup     
			ldi      10
			eq?     
			bnt      code_15c2
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    47
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_15c2:
			dup     
			ldi      11
			eq?     
			bnt      code_15d0
			ldi      10
			aTop     ticks
			jmp      code_1865
code_15d0:
			dup     
			ldi      12
			eq?     
			bnt      code_15ec
			pushi    5
			pushi    1171
			pushi    48
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_15ec:
			dup     
			ldi      13
			eq?     
			bnt      code_15fa
			ldi      10
			aTop     ticks
			jmp      code_1865
code_15fa:
			dup     
			ldi      14
			eq?     
			bnt      code_1616
			pushi    5
			pushi    1171
			pushi    49
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_1616:
			dup     
			ldi      15
			eq?     
			bnt      code_1624
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1624:
			dup     
			ldi      16
			eq?     
			bnt      code_167b
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    50
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_167b:
			dup     
			ldi      17
			eq?     
			bnt      code_1689
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1689:
			dup     
			ldi      18
			eq?     
			bnt      code_16a5
			pushi    5
			pushi    1171
			pushi    51
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_16a5:
			dup     
			ldi      19
			eq?     
			bnt      code_16b3
			ldi      10
			aTop     ticks
			jmp      code_1865
code_16b3:
			dup     
			ldi      20
			eq?     
			bnt      code_16cf
			pushi    5
			pushi    1171
			pushi    52
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_16cf:
			dup     
			ldi      21
			eq?     
			bnt      code_16dd
			ldi      10
			aTop     ticks
			jmp      code_1865
code_16dd:
			dup     
			ldi      22
			eq?     
			bnt      code_16f9
			pushi    5
			pushi    1171
			pushi    53
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_16f9:
			dup     
			ldi      23
			eq?     
			bnt      code_1707
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1707:
			dup     
			ldi      24
			eq?     
			bnt      code_1723
			pushi    5
			pushi    1171
			pushi    54
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_1723:
			dup     
			ldi      25
			eq?     
			bnt      code_1731
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1731:
			dup     
			ldi      26
			eq?     
			bnt      code_177b
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    55
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_177b:
			dup     
			ldi      27
			eq?     
			bnt      code_1789
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1789:
			dup     
			ldi      28
			eq?     
			bnt      code_17a5
			pushi    5
			pushi    1171
			pushi    56
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_17a5:
			dup     
			ldi      29
			eq?     
			bnt      code_17b3
			ldi      10
			aTop     ticks
			jmp      code_1865
code_17b3:
			dup     
			ldi      30
			eq?     
			bnt      code_17ed
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    57
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_17ed:
			dup     
			ldi      31
			eq?     
			bnt      code_17fb
			ldi      10
			aTop     ticks
			jmp      code_1865
code_17fb:
			dup     
			ldi      32
			eq?     
			bnt      code_1817
			pushi    5
			pushi    1171
			pushi    58
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_1817:
			dup     
			ldi      33
			eq?     
			bnt      code_1825
			ldi      10
			aTop     ticks
			jmp      code_1865
code_1825:
			dup     
			ldi      34
			eq?     
			bnt      code_1841
			pushi    5
			pushi    1171
			pushi    59
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1865
code_1841:
			dup     
			ldi      35
			eq?     
			bnt      code_184f
			ldi      10
			aTop     ticks
			jmp      code_1865
code_184f:
			dup     
			ldi      36
			eq?     
			bnt      code_1865
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1865:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_145b
			lap      param1
			not     
			bnt      code_145b
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1464
code_145b:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_1464:
			ret     
		)
	)
)

(instance rescueSonsOfWidow2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18ea
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    21
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_18ea:
			dup     
			ldi      1
			eq?     
			bnt      code_18f8
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_18f8:
			dup     
			ldi      2
			eq?     
			bnt      code_1927
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    22
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1927:
			dup     
			ldi      3
			eq?     
			bnt      code_1935
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1935:
			dup     
			ldi      4
			eq?     
			bnt      code_1951
			pushi    5
			pushi    1171
			pushi    23
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1951:
			dup     
			ldi      5
			eq?     
			bnt      code_195f
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_195f:
			dup     
			ldi      6
			eq?     
			bnt      code_1999
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    24
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1999:
			dup     
			ldi      7
			eq?     
			bnt      code_19a7
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_19a7:
			dup     
			ldi      8
			eq?     
			bnt      code_19d3
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    25
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_19d3:
			dup     
			ldi      9
			eq?     
			bnt      code_19e1
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_19e1:
			dup     
			ldi      10
			eq?     
			bnt      code_1a1d
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    26
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1a1d:
			dup     
			ldi      11
			eq?     
			bnt      code_1a2b
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1a2b:
			dup     
			ldi      12
			eq?     
			bnt      code_1a75
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    27
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1a75:
			dup     
			ldi      13
			eq?     
			bnt      code_1a83
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1a83:
			dup     
			ldi      14
			eq?     
			bnt      code_1a9f
			pushi    5
			pushi    1171
			pushi    28
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1a9f:
			dup     
			ldi      15
			eq?     
			bnt      code_1aad
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1aad:
			dup     
			ldi      16
			eq?     
			bnt      code_1af4
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    29
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1af4:
			dup     
			ldi      17
			eq?     
			bnt      code_1b02
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1b02:
			dup     
			ldi      18
			eq?     
			bnt      code_1b61
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    30
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1b61:
			dup     
			ldi      19
			eq?     
			bnt      code_1b6f
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1b6f:
			dup     
			ldi      20
			eq?     
			bnt      code_1b8b
			pushi    5
			pushi    1171
			pushi    31
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1b8b:
			dup     
			ldi      21
			eq?     
			bnt      code_1b99
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1b99:
			dup     
			ldi      22
			eq?     
			bnt      code_1be4
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    32
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1be4:
			dup     
			ldi      23
			eq?     
			bnt      code_1bf2
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1bf2:
			dup     
			ldi      24
			eq?     
			bnt      code_1c0e
			pushi    5
			pushi    1171
			pushi    33
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1c0e:
			dup     
			ldi      25
			eq?     
			bnt      code_1c1c
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1c1c:
			dup     
			ldi      26
			eq?     
			bnt      code_1c38
			pushi    5
			pushi    1171
			pushi    34
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1c38:
			dup     
			ldi      27
			eq?     
			bnt      code_1c46
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1c46:
			dup     
			ldi      28
			eq?     
			bnt      code_1c8c
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    35
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1c8c:
			dup     
			ldi      29
			eq?     
			bnt      code_1c9a
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1c9a:
			dup     
			ldi      30
			eq?     
			bnt      code_1cb6
			pushi    5
			pushi    1171
			pushi    36
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1cb6:
			dup     
			ldi      31
			eq?     
			bnt      code_1cc4
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1cc4:
			dup     
			ldi      32
			eq?     
			bnt      code_1ce0
			pushi    5
			pushi    1171
			pushi    37
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1ce0:
			dup     
			ldi      33
			eq?     
			bnt      code_1cee
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1cee:
			dup     
			ldi      34
			eq?     
			bnt      code_1d0a
			pushi    5
			pushi    1171
			pushi    38
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_1d3f
code_1d0a:
			dup     
			ldi      35
			eq?     
			bnt      code_1d18
			ldi      10
			aTop     ticks
			jmp      code_1d3f
code_1d18:
			dup     
			ldi      36
			eq?     
			bnt      code_1d3f
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #dispose
			pushi    0
			self     4
code_1d3f:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_18b9
			lap      param1
			not     
			bnt      code_18b9
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_18c2
code_18b9:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_18c2:
			ret     
		)
	)
)

(instance rescueSonsOfWidow1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1dde
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    0
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1dde:
			dup     
			ldi      1
			eq?     
			bnt      code_1dec
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1dec:
			dup     
			ldi      2
			eq?     
			bnt      code_1e42
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    1
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1e42:
			dup     
			ldi      3
			eq?     
			bnt      code_1e50
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1e50:
			dup     
			ldi      4
			eq?     
			bnt      code_1e6b
			pushi    5
			pushi    1171
			pushi    2
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1e6b:
			dup     
			ldi      5
			eq?     
			bnt      code_1e79
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1e79:
			dup     
			ldi      6
			eq?     
			bnt      code_1eb6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    3
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1eb6:
			dup     
			ldi      7
			eq?     
			bnt      code_1ec4
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1ec4:
			dup     
			ldi      8
			eq?     
			bnt      code_1ef3
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    4
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1ef3:
			dup     
			ldi      9
			eq?     
			bnt      code_1f01
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1f01:
			dup     
			ldi      10
			eq?     
			bnt      code_1f1d
			pushi    5
			pushi    1171
			pushi    5
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1f1d:
			dup     
			ldi      11
			eq?     
			bnt      code_1f2b
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1f2b:
			dup     
			ldi      12
			eq?     
			bnt      code_1f47
			pushi    5
			pushi    1171
			pushi    6
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1f47:
			dup     
			ldi      13
			eq?     
			bnt      code_1f55
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1f55:
			dup     
			ldi      14
			eq?     
			bnt      code_1f81
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    7
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1f81:
			dup     
			ldi      15
			eq?     
			bnt      code_1f8f
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1f8f:
			dup     
			ldi      16
			eq?     
			bnt      code_1fcc
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    8
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_1fcc:
			dup     
			ldi      17
			eq?     
			bnt      code_1fda
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_1fda:
			dup     
			ldi      18
			eq?     
			bnt      code_2025
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    9
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_2025:
			dup     
			ldi      19
			eq?     
			bnt      code_2033
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_2033:
			dup     
			ldi      20
			eq?     
			bnt      code_204f
			pushi    5
			pushi    1171
			pushi    10
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_204f:
			dup     
			ldi      21
			eq?     
			bnt      code_205d
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_205d:
			dup     
			ldi      22
			eq?     
			bnt      code_2079
			pushi    5
			pushi    1171
			pushi    11
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_2079:
			dup     
			ldi      23
			eq?     
			bnt      code_2087
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_2087:
			dup     
			ldi      24
			eq?     
			bnt      code_20cd
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    12
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_20cd:
			dup     
			ldi      25
			eq?     
			bnt      code_20db
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_20db:
			dup     
			ldi      26
			eq?     
			bnt      code_20f7
			pushi    5
			pushi    1171
			pushi    13
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_20f7:
			dup     
			ldi      27
			eq?     
			bnt      code_2105
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_2105:
			dup     
			ldi      28
			eq?     
			bnt      code_2121
			pushi    5
			pushi    1171
			pushi    14
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_2121:
			dup     
			ldi      29
			eq?     
			bnt      code_212f
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_212f:
			dup     
			ldi      30
			eq?     
			bnt      code_214b
			pushi    5
			pushi    1171
			pushi    15
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_214b:
			dup     
			ldi      31
			eq?     
			bnt      code_2159
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_2159:
			dup     
			ldi      32
			eq?     
			bnt      code_21b1
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    16
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_21b1:
			dup     
			ldi      33
			eq?     
			bnt      code_21bf
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_21bf:
			dup     
			ldi      34
			eq?     
			bnt      code_21db
			pushi    5
			pushi    1171
			pushi    17
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_21db:
			dup     
			ldi      35
			eq?     
			bnt      code_21e9
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_21e9:
			dup     
			ldi      36
			eq?     
			bnt      code_223a
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    18
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_223a:
			dup     
			ldi      37
			eq?     
			bnt      code_2248
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_2248:
			dup     
			ldi      38
			eq?     
			bnt      code_2264
			pushi    5
			pushi    1171
			pushi    19
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_2264:
			dup     
			ldi      39
			eq?     
			bnt      code_2272
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_2272:
			dup     
			ldi      40
			eq?     
			bnt      code_228e
			pushi    5
			pushi    1171
			pushi    20
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_22b2
code_228e:
			dup     
			ldi      41
			eq?     
			bnt      code_229c
			ldi      10
			aTop     ticks
			jmp      code_22b2
code_229c:
			dup     
			ldi      42
			eq?     
			bnt      code_22b2
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_22b2:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_1d93
			lap      param1
			not     
			bnt      code_1d93
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1d9c
code_1d93:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_1d9c:
			ret     
		)
	)
)

(instance headShake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2322
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local4
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_2331
code_2322:
			dup     
			ldi      1
			eq?     
			bnt      code_2331
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_2331:
			toss    
			ret     
		)
	)
)

(instance tuckHeadShake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_239e
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local8
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_23b5
code_239e:
			dup     
			ldi      1
			eq?     
			bnt      code_23b5
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_23b5:
			toss    
			ret     
		)
	)
)

(instance handShake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2422
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local5
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_244c
code_2422:
			dup     
			ldi      1
			eq?     
			bnt      code_2440
			ldi      65535
			aTop     state
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local5
			push    
			ldi      12
			mul     
			aTop     ticks
			jmp      code_244c
code_2440:
			dup     
			ldi      2
			eq?     
			bnt      code_244c
			pushi    #dispose
			pushi    0
			self     4
code_244c:
			toss    
			ret     
		)
	)
)

(instance johnHandShake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_24b8
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local6
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_2523
code_24b8:
			dup     
			ldi      1
			eq?     
			bnt      code_24d2
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
			sal      local6
			push    
			ldi      50
			mul     
			aTop     ticks
			jmp      code_2523
code_24d2:
			dup     
			ldi      2
			eq?     
			bnt      code_24f9
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local6
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     14
			jmp      code_2523
code_24f9:
			dup     
			ldi      3
			eq?     
			bnt      code_2517
			ldi      65535
			aTop     state
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local6
			push    
			ldi      40
			mul     
			aTop     ticks
			jmp      code_2523
code_2517:
			dup     
			ldi      4
			eq?     
			bnt      code_2523
			pushi    #dispose
			pushi    0
			self     4
code_2523:
			toss    
			ret     
		)
	)
)

(instance alanHandShake of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2590
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local7
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_25fb
code_2590:
			dup     
			ldi      1
			eq?     
			bnt      code_25aa
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
			sal      local7
			push    
			ldi      50
			mul     
			aTop     ticks
			jmp      code_25fb
code_25aa:
			dup     
			ldi      2
			eq?     
			bnt      code_25d1
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local7
			pushi    219
			pushi    #superClass
			push    
			ldi      6
			mul     
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     14
			jmp      code_25fb
code_25d1:
			dup     
			ldi      3
			eq?     
			bnt      code_25ef
			ldi      65535
			aTop     state
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local7
			push    
			ldi      40
			mul     
			aTop     ticks
			jmp      code_25fb
code_25ef:
			dup     
			ldi      4
			eq?     
			bnt      code_25fb
			pushi    #dispose
			pushi    0
			self     4
code_25fb:
			toss    
			ret     
		)
	)
)

(instance walkThePlank of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2650
			pushi    0
			call     localproc_000e,  0
			ldi      6
			aTop     ticks
			jmp      code_270e
code_2650:
			dup     
			ldi      1
			eq?     
			bnt      code_2674
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    10
			lag      global2
			send     8
			ldi      12
			aTop     ticks
			jmp      code_270e
code_2674:
			dup     
			ldi      2
			eq?     
			bnt      code_26f7
			lsg      global142
			dup     
			ldi      1
			eq?     
			bnt      code_26c0
			pushi    7
			pushi    171
			pushi    0
			pushi    100
			pushi    55
			pushi    60
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    171
			pushi    1
			pushi    100
			pushi    55
			pushi    70
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    171
			pushi    2
			pushi    100
			pushi    55
			pushi    80
			pushi    102
			lsg      global185
			callk    Display,  14
			jmp      code_26ef
code_26c0:
			dup     
			ldi      2
			eq?     
			bnt      code_26ef
			pushi    7
			pushi    171
			pushi    3
			pushi    100
			pushi    55
			pushi    65
			pushi    102
			lsg      global185
			callk    Display,  14
			pushi    7
			pushi    171
			pushi    4
			pushi    100
			pushi    55
			pushi    75
			pushi    102
			lsg      global185
			callk    Display,  14
code_26ef:
			toss    
			ldi      10
			aTop     seconds
			jmp      code_270e
code_26f7:
			dup     
			ldi      3
			eq?     
			bnt      code_270e
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_270e:
			toss    
			ret     
		)
	)
)

(instance robTreasureTrain of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_278e
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    78
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_278e:
			dup     
			ldi      1
			eq?     
			bnt      code_279c
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_279c:
			dup     
			ldi      2
			eq?     
			bnt      code_27b8
			pushi    5
			pushi    1171
			pushi    79
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_27b8:
			dup     
			ldi      3
			eq?     
			bnt      code_27c6
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_27c6:
			dup     
			ldi      4
			eq?     
			bnt      code_27e2
			pushi    5
			pushi    1171
			pushi    80
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_27e2:
			dup     
			ldi      5
			eq?     
			bnt      code_27f0
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_27f0:
			dup     
			ldi      6
			eq?     
			bnt      code_281f
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    81
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_281f:
			dup     
			ldi      7
			eq?     
			bnt      code_282d
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_282d:
			dup     
			ldi      8
			eq?     
			bnt      code_2873
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    82
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2873:
			dup     
			ldi      9
			eq?     
			bnt      code_2881
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2881:
			dup     
			ldi      10
			eq?     
			bnt      code_28cb
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    83
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_28cb:
			dup     
			ldi      11
			eq?     
			bnt      code_28d9
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_28d9:
			dup     
			ldi      12
			eq?     
			bnt      code_28f5
			pushi    5
			pushi    1171
			pushi    84
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_28f5:
			dup     
			ldi      13
			eq?     
			bnt      code_2903
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2903:
			dup     
			ldi      14
			eq?     
			bnt      code_292f
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    85
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_292f:
			dup     
			ldi      15
			eq?     
			bnt      code_293d
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_293d:
			dup     
			ldi      16
			eq?     
			bnt      code_296c
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    86
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_296c:
			dup     
			ldi      17
			eq?     
			bnt      code_297a
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_297a:
			dup     
			ldi      18
			eq?     
			bnt      code_2996
			pushi    5
			pushi    1171
			pushi    87
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2996:
			dup     
			ldi      19
			eq?     
			bnt      code_29a4
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_29a4:
			dup     
			ldi      20
			eq?     
			bnt      code_29ea
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    88
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_29ea:
			dup     
			ldi      21
			eq?     
			bnt      code_29f8
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_29f8:
			dup     
			ldi      22
			eq?     
			bnt      code_2a14
			pushi    5
			pushi    1171
			pushi    89
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2a14:
			dup     
			ldi      23
			eq?     
			bnt      code_2a22
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2a22:
			dup     
			ldi      24
			eq?     
			bnt      code_2a3e
			pushi    5
			pushi    1171
			pushi    90
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2a3e:
			dup     
			ldi      25
			eq?     
			bnt      code_2a4c
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2a4c:
			dup     
			ldi      26
			eq?     
			bnt      code_2aa4
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    91
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2aa4:
			dup     
			ldi      27
			eq?     
			bnt      code_2ab2
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2ab2:
			dup     
			ldi      28
			eq?     
			bnt      code_2ace
			pushi    5
			pushi    1171
			pushi    92
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2ace:
			dup     
			ldi      29
			eq?     
			bnt      code_2adc
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2adc:
			dup     
			ldi      30
			eq?     
			bnt      code_2af8
			pushi    5
			pushi    1171
			pushi    93
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2af8:
			dup     
			ldi      31
			eq?     
			bnt      code_2b06
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2b06:
			dup     
			ldi      32
			eq?     
			bnt      code_2b22
			pushi    5
			pushi    1171
			pushi    94
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2b22:
			dup     
			ldi      33
			eq?     
			bnt      code_2b30
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2b30:
			dup     
			ldi      34
			eq?     
			bnt      code_2b8f
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    95
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2b8f:
			dup     
			ldi      35
			eq?     
			bnt      code_2b9d
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2b9d:
			dup     
			ldi      36
			eq?     
			bnt      code_2bb9
			pushi    5
			pushi    1171
			pushi    96
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2bb9:
			dup     
			ldi      37
			eq?     
			bnt      code_2bc7
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2bc7:
			dup     
			ldi      38
			eq?     
			bnt      code_2c12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    97
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2c12:
			dup     
			ldi      39
			eq?     
			bnt      code_2c20
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2c20:
			dup     
			ldi      40
			eq?     
			bnt      code_2c3c
			pushi    5
			pushi    1171
			pushi    98
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_2c60
code_2c3c:
			dup     
			ldi      41
			eq?     
			bnt      code_2c4a
			ldi      10
			aTop     ticks
			jmp      code_2c60
code_2c4a:
			dup     
			ldi      42
			eq?     
			bnt      code_2c60
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_2c60:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_275d
			lap      param1
			not     
			bnt      code_275d
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_2766
code_275d:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_2766:
			ret     
		)
	)
)

(instance talkArbitrator of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2ddf
			lsg      global130
			dup     
			ldi      5
			eq?     
			bnt      code_2cd6
			pushi    1
			pushi    55
			callb    proc0_5,  2
			bnt      code_2d44
			lsg      global142
			dup     
			ldi      1
			eq?     
			bnt      code_2cce
			ldi      10
			sag      global146
			jmp      code_2cd2
code_2cce:
			ldi      20
			sag      global146
code_2cd2:
			toss    
			jmp      code_2d44
code_2cd6:
			dup     
			ldi      6
			eq?     
			bnt      code_2cfe
			pushi    1
			pushi    55
			callb    proc0_5,  2
			bnt      code_2d44
			lsg      global142
			dup     
			ldi      1
			eq?     
			bnt      code_2cf6
			ldi      10
			sag      global146
			jmp      code_2cfa
code_2cf6:
			ldi      20
			sag      global146
code_2cfa:
			toss    
			jmp      code_2d44
code_2cfe:
			dup     
			ldi      10
			eq?     
			bnt      code_2d2b
			lsg      global159
			dup     
			ldi      0
			eq?     
			bnt      code_2d15
			ldi      30
			sag      global146
			jmp      code_2d27
code_2d15:
			dup     
			ldi      1
			eq?     
			bnt      code_2d23
			ldi      40
			sag      global146
			jmp      code_2d27
code_2d23:
			ldi      50
			sag      global146
code_2d27:
			toss    
			jmp      code_2d44
code_2d2b:
			dup     
			ldi      11
			eq?     
			bnt      code_2d39
			ldi      60
			sag      global146
			jmp      code_2d44
code_2d39:
			dup     
			ldi      13
			eq?     
			bnt      code_2d44
			ldi      70
			sag      global146
code_2d44:
			toss    
			lag      global146
			sal      local0
			lsg      global146
			dup     
			ldi      70
			eq?     
			bnt      code_2d60
			pushi    #setScript
			pushi    2
			lofsa    queensKnight
			push    
			pushSelf
			self     8
			jmp      code_2ddb
code_2d60:
			dup     
			ldi      60
			eq?     
			bnt      code_2d75
			pushi    #setScript
			pushi    2
			lofsa    robTreasureTrain
			push    
			pushSelf
			self     8
			jmp      code_2ddb
code_2d75:
			dup     
			ldi      50
			eq?     
			bnt      code_2d8a
			pushi    #setScript
			pushi    2
			lofsa    rescueMarian3
			push    
			pushSelf
			self     8
			jmp      code_2ddb
code_2d8a:
			dup     
			ldi      40
			eq?     
			bnt      code_2d9f
			pushi    #setScript
			pushi    2
			lofsa    rescueMarian2
			push    
			pushSelf
			self     8
			jmp      code_2ddb
code_2d9f:
			dup     
			ldi      30
			eq?     
			bnt      code_2db4
			pushi    #setScript
			pushi    2
			lofsa    rescueMarian1
			push    
			pushSelf
			self     8
			jmp      code_2ddb
code_2db4:
			dup     
			ldi      20
			eq?     
			bnt      code_2dc9
			pushi    #setScript
			pushi    2
			lofsa    rescueSonsOfWidow2
			push    
			pushSelf
			self     8
			jmp      code_2ddb
code_2dc9:
			dup     
			ldi      10
			eq?     
			bnt      code_2ddb
			pushi    #setScript
			pushi    2
			lofsa    rescueSonsOfWidow1
			push    
			pushSelf
			self     8
code_2ddb:
			toss    
			jmp      code_3428
code_2ddf:
			dup     
			ldi      1
			eq?     
			bnt      code_2ded
			ldi      6
			aTop     ticks
			jmp      code_3428
code_2ded:
			dup     
			ldi      2
			eq?     
			bnt      code_3428
			pushi    1
			pushi    0
			calle    proc13_6,  2
			lsg      global146
			dup     
			ldi      70
			eq?     
			bnt      code_2e10
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_3422
code_2e10:
			dup     
			ldi      60
			eq?     
			bnt      code_2f64
			pushi    32
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {John: Demand surrender, attack from all sides.}
			push    
			pushi    60
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Will: Ambush from Overlook only.}
			push    
			pushi    61
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Alan: Demand surrender with fanfare.}
			push    
			pushi    62
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Tuck: Surprise ambush from two sides.}
			push    
			pushi    64
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Much: Create panic with wild boars.}
			push    
			pushi    63
			pushi    67
			pushi    70
			pushi    25
			calle    proc940_0,  64
			sal      local2
			sag      global146
			lsl      local2
			dup     
			ldi      60
			eq?     
			bnt      code_2eae
			pushi    1
			pushi    200
			calle    proc806_1,  2
			lsg      global138
			ldi      16
			le?     
			bnt      code_2ea0
			pushi    #newRoom
			pushi    1
			pushi    176
			lag      global2
			send     6
			jmp      code_2f60
code_2ea0:
			pushi    #newRoom
			pushi    1
			pushi    174
			lag      global2
			send     6
			jmp      code_2f60
code_2eae:
			dup     
			ldi      61
			eq?     
			bnt      code_2ee3
			pushi    1
			pushi    400
			calle    proc806_1,  2
			lsg      global138
			ldi      15
			le?     
			bnt      code_2ed5
			pushi    #newRoom
			pushi    1
			pushi    176
			lag      global2
			send     6
			jmp      code_2f60
code_2ed5:
			pushi    #newRoom
			pushi    1
			pushi    173
			lag      global2
			send     6
			jmp      code_2f60
code_2ee3:
			dup     
			ldi      62
			eq?     
			bnt      code_2f17
			pushi    1
			pushi    100
			calle    proc806_1,  2
			lsg      global138
			ldi      18
			le?     
			bnt      code_2f09
			pushi    #newRoom
			pushi    1
			pushi    176
			lag      global2
			send     6
			jmp      code_2f60
code_2f09:
			pushi    #newRoom
			pushi    1
			pushi    174
			lag      global2
			send     6
			jmp      code_2f60
code_2f17:
			dup     
			ldi      64
			eq?     
			bnt      code_2f36
			pushi    1
			pushi    500
			calle    proc806_1,  2
			pushi    #newRoom
			pushi    1
			pushi    172
			lag      global2
			send     6
			jmp      code_2f60
code_2f36:
			dup     
			ldi      63
			eq?     
			bnt      code_2f4b
			pushi    #newRoom
			pushi    1
			pushi    175
			lag      global2
			send     6
			jmp      code_2f60
code_2f4b:
			dup     
			ldi      0
			eq?     
			bnt      code_2f60
			lal      local0
			sag      global146
			ldi      1
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_2f60:
			toss    
			jmp      code_3422
code_2f64:
			dup     
			ldi      50
			eq?     
			bnt      code_304f
			pushi    32
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {John: Two part flanking attack.}
			push    
			pushi    50
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Will: Robin to lead a wedge attack in force.}
			push    
			pushi    51
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Alan: Seek to take Sheriff and Abbot hostage.}
			push    
			pushi    52
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Tuck: Incite riot, attack in streets, Robin to slip in alone.}
			push    
			pushi    54
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Much: Try to lead soldiers away, Robin to enter Witch's Court with 5 men.}
			push    
			pushi    53
			pushi    67
			pushi    70
			pushi    25
			calle    proc940_0,  64
			sal      local2
			sag      global146
			lsl      local2
			dup     
			ldi      50
			eq?     
			bnt      code_2fe2
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_304b
code_2fe2:
			dup     
			ldi      51
			eq?     
			bnt      code_2ff7
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_304b
code_2ff7:
			dup     
			ldi      52
			eq?     
			bnt      code_300c
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_304b
code_300c:
			dup     
			ldi      54
			eq?     
			bnt      code_3021
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_304b
code_3021:
			dup     
			ldi      53
			eq?     
			bnt      code_3036
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_304b
code_3036:
			dup     
			ldi      0
			eq?     
			bnt      code_304b
			lal      local0
			sag      global146
			ldi      1
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_304b:
			toss    
			jmp      code_3422
code_304f:
			dup     
			ldi      40
			eq?     
			bnt      code_313a
			pushi    32
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {John: Subterfuge. John leads two part attack and winds horn for Robin to act.}
			push    
			pushi    40
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Will: Robin to lead a wedge attack in force.}
			push    
			pushi    41
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Alan: Seek to take Sheriff and Abbot hostage.}
			push    
			pushi    42
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Tuck: Incite riot, attack in streets, Robin to slip in alone.}
			push    
			pushi    44
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Much: Try to lead soldiers away, Robin to enter Witch's Court with 5 men.}
			push    
			pushi    43
			pushi    67
			pushi    70
			pushi    25
			calle    proc940_0,  64
			sal      local2
			sag      global146
			lsl      local2
			dup     
			ldi      40
			eq?     
			bnt      code_30cd
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
			jmp      code_3136
code_30cd:
			dup     
			ldi      41
			eq?     
			bnt      code_30e2
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3136
code_30e2:
			dup     
			ldi      42
			eq?     
			bnt      code_30f7
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3136
code_30f7:
			dup     
			ldi      44
			eq?     
			bnt      code_310c
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3136
code_310c:
			dup     
			ldi      43
			eq?     
			bnt      code_3121
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3136
code_3121:
			dup     
			ldi      0
			eq?     
			bnt      code_3136
			lal      local0
			sag      global146
			ldi      1
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_3136:
			toss    
			jmp      code_3422
code_313a:
			dup     
			ldi      30
			eq?     
			bnt      code_3225
			pushi    32
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {John: Subterfuge. John leads two part attack and winds horn for Robin to act.}
			push    
			pushi    30
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Will: Robin to lead a wedge attack in force.}
			push    
			pushi    31
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Alan: Seek to take Sheriff and Abbot hostage.}
			push    
			pushi    32
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Tuck: Incite riot, attack in streets, Robin to slip in alone.}
			push    
			pushi    34
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Much: Try to lead soldiers away, Robin to enter Witch's Court with 5 men.}
			push    
			pushi    33
			pushi    67
			pushi    70
			pushi    25
			calle    proc940_0,  64
			sal      local2
			sag      global146
			lsl      local2
			dup     
			ldi      30
			eq?     
			bnt      code_31b8
			pushi    #newRoom
			pushi    1
			pushi    260
			lag      global2
			send     6
			jmp      code_3221
code_31b8:
			dup     
			ldi      31
			eq?     
			bnt      code_31cd
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3221
code_31cd:
			dup     
			ldi      32
			eq?     
			bnt      code_31e2
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3221
code_31e2:
			dup     
			ldi      34
			eq?     
			bnt      code_31f7
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3221
code_31f7:
			dup     
			ldi      33
			eq?     
			bnt      code_320c
			pushi    #newRoom
			pushi    1
			pushi    501
			lag      global2
			send     6
			jmp      code_3221
code_320c:
			dup     
			ldi      0
			eq?     
			bnt      code_3221
			lal      local0
			sag      global146
			ldi      1
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_3221:
			toss    
			jmp      code_3422
code_3225:
			dup     
			ldi      20
			eq?     
			bnt      code_3325
			pushi    32
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {John: 6 men inside, surprise attack, 16 outside to cover retreat.}
			push    
			pushi    20
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Will: Return to Nottingham in disguise.}
			push    
			pushi    24
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Alan: Set a fire and rush in.}
			push    
			pushi    22
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Tuck: Create diversion with 10 men, send 12 men inside.}
			push    
			pushi    21
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Much: 22 outlaws, charge the gates.}
			push    
			pushi    23
			pushi    67
			pushi    70
			pushi    25
			calle    proc940_0,  64
			sal      local2
			sag      global146
			lsl      local2
			dup     
			ldi      20
			eq?     
			bnt      code_32a3
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3321
code_32a3:
			dup     
			ldi      21
			eq?     
			bnt      code_32b8
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3321
code_32b8:
			dup     
			ldi      22
			eq?     
			bnt      code_32cd
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3321
code_32cd:
			dup     
			ldi      23
			eq?     
			bnt      code_32e2
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3321
code_32e2:
			dup     
			ldi      24
			eq?     
			bnt      code_330c
			pushi    #put
			pushi    2
			pushi    1
			pushi    140
			lag      global0
			send     8
			pushi    0
			callb    proc0_4,  0
			ldi      5
			sag      global126
			pushi    #setScript
			pushi    1
			lofsa    walkThePlank
			push    
			lag      global2
			send     6
			jmp      code_3321
code_330c:
			dup     
			ldi      0
			eq?     
			bnt      code_3321
			lal      local0
			sag      global146
			ldi      1
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_3321:
			toss    
			jmp      code_3422
code_3325:
			dup     
			ldi      10
			eq?     
			bnt      code_3422
			pushi    32
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {John: 10 men feint outside, then__________full scale attack.}
			push    
			pushi    11
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Will: 5 men inside, surprise attack, 17 outside to cover retreat.}
			push    
			pushi    10
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Alan: Set a fire and rush in.}
			push    
			pushi    12
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Tuck: Return to Nottingham in disguise.}
			push    
			pushi    14
			pushi    106
			pushi    26
			lofsa    {_}
			push    
			pushi    81
			lofsa    {Much: 22 outlaws, charge the gates.}
			push    
			pushi    13
			pushi    67
			pushi    70
			pushi    25
			calle    proc940_0,  64
			sal      local2
			sag      global146
			lsl      local2
			dup     
			ldi      10
			eq?     
			bnt      code_33a3
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3421
code_33a3:
			dup     
			ldi      11
			eq?     
			bnt      code_33b8
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3421
code_33b8:
			dup     
			ldi      12
			eq?     
			bnt      code_33cd
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3421
code_33cd:
			dup     
			ldi      13
			eq?     
			bnt      code_33e2
			pushi    #newRoom
			pushi    1
			pushi    177
			lag      global2
			send     6
			jmp      code_3421
code_33e2:
			dup     
			ldi      14
			eq?     
			bnt      code_340c
			pushi    #put
			pushi    2
			pushi    1
			pushi    140
			lag      global0
			send     8
			pushi    0
			callb    proc0_4,  0
			ldi      5
			sag      global126
			pushi    #setScript
			pushi    1
			lofsa    walkThePlank
			push    
			lag      global2
			send     6
			jmp      code_3421
code_340c:
			dup     
			ldi      0
			eq?     
			bnt      code_3421
			lal      local0
			sag      global146
			ldi      1
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_3421:
			toss    
code_3422:
			toss    
			pushi    #dispose
			pushi    0
			self     4
code_3428:
			toss    
			ret     
		)
	)
)

(instance rescueMarian1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_34c3
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    39
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_34c3:
			dup     
			ldi      1
			eq?     
			bnt      code_34d1
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_34d1:
			dup     
			ldi      2
			eq?     
			bnt      code_350e
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    40
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_350e:
			dup     
			ldi      3
			eq?     
			bnt      code_351c
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_351c:
			dup     
			ldi      4
			eq?     
			bnt      code_3558
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    41
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3558:
			dup     
			ldi      5
			eq?     
			bnt      code_3566
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3566:
			dup     
			ldi      6
			eq?     
			bnt      code_35be
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    42
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_35be:
			dup     
			ldi      7
			eq?     
			bnt      code_35cc
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_35cc:
			dup     
			ldi      8
			eq?     
			bnt      code_3602
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    alanHand
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    43
			pushSelf
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3602:
			dup     
			ldi      9
			eq?     
			bnt      code_3610
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3610:
			dup     
			ldi      10
			eq?     
			bnt      code_364d
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    alanHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    alanHandShake
			push    
			lofsa    alanHand
			send     6
			pushi    1
			pushi    4
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    44
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_364d:
			dup     
			ldi      11
			eq?     
			bnt      code_365b
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_365b:
			dup     
			ldi      12
			eq?     
			bnt      code_3677
			pushi    5
			pushi    1171
			pushi    45
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3677:
			dup     
			ldi      13
			eq?     
			bnt      code_3685
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3685:
			dup     
			ldi      14
			eq?     
			bnt      code_36a1
			pushi    5
			pushi    1171
			pushi    46
			pushSelf
			pushi    80
			lofsa    {Alan}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_36a1:
			dup     
			ldi      15
			eq?     
			bnt      code_36af
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_36af:
			dup     
			ldi      16
			eq?     
			bnt      code_370e
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    alanHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    tuckHeadShake
			push    
			lofsa    tuckHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    handShake
			push    
			lofsa    tuckHand
			send     6
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    47
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_370e:
			dup     
			ldi      17
			eq?     
			bnt      code_371c
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_371c:
			dup     
			ldi      18
			eq?     
			bnt      code_3738
			pushi    5
			pushi    1171
			pushi    48
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3738:
			dup     
			ldi      19
			eq?     
			bnt      code_3746
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3746:
			dup     
			ldi      20
			eq?     
			bnt      code_3762
			pushi    5
			pushi    1171
			pushi    49
			pushSelf
			pushi    80
			lofsa    {Tuck}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3762:
			dup     
			ldi      21
			eq?     
			bnt      code_3770
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3770:
			dup     
			ldi      22
			eq?     
			bnt      code_37c7
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    tuckHead
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    tuckHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    johnHandShake
			push    
			lofsa    johnHand
			send     6
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    50
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_37c7:
			dup     
			ldi      23
			eq?     
			bnt      code_37d5
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_37d5:
			dup     
			ldi      24
			eq?     
			bnt      code_37f1
			pushi    5
			pushi    1171
			pushi    51
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_37f1:
			dup     
			ldi      25
			eq?     
			bnt      code_37ff
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_37ff:
			dup     
			ldi      26
			eq?     
			bnt      code_381b
			pushi    5
			pushi    1171
			pushi    52
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_381b:
			dup     
			ldi      27
			eq?     
			bnt      code_3829
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3829:
			dup     
			ldi      28
			eq?     
			bnt      code_3845
			pushi    5
			pushi    1171
			pushi    53
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3845:
			dup     
			ldi      29
			eq?     
			bnt      code_3853
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3853:
			dup     
			ldi      30
			eq?     
			bnt      code_386f
			pushi    5
			pushi    1171
			pushi    54
			pushSelf
			pushi    80
			lofsa    {John}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_386f:
			dup     
			ldi      31
			eq?     
			bnt      code_387d
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_387d:
			dup     
			ldi      32
			eq?     
			bnt      code_38c7
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    johnHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    johnHand
			send     12
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    willHead
			send     6
			pushi    1
			pushi    2
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    55
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_38c7:
			dup     
			ldi      33
			eq?     
			bnt      code_38d5
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_38d5:
			dup     
			ldi      34
			eq?     
			bnt      code_38f1
			pushi    5
			pushi    1171
			pushi    56
			pushSelf
			pushi    80
			lofsa    {Will}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_38f1:
			dup     
			ldi      35
			eq?     
			bnt      code_38ff
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_38ff:
			dup     
			ldi      36
			eq?     
			bnt      code_3939
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    willHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    headShake
			push    
			lofsa    muchHead
			send     6
			pushi    1
			pushi    5
			calle    proc13_6,  2
			pushi    5
			pushi    1171
			pushi    57
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3939:
			dup     
			ldi      37
			eq?     
			bnt      code_3947
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3947:
			dup     
			ldi      38
			eq?     
			bnt      code_3963
			pushi    5
			pushi    1171
			pushi    58
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_3963:
			dup     
			ldi      39
			eq?     
			bnt      code_3971
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_3971:
			dup     
			ldi      40
			eq?     
			bnt      code_398d
			pushi    5
			pushi    1171
			pushi    59
			pushSelf
			pushi    80
			lofsa    {Much}
			push    
			calle    proc13_4,  10
			jmp      code_39b1
code_398d:
			dup     
			ldi      41
			eq?     
			bnt      code_399b
			ldi      10
			aTop     ticks
			jmp      code_39b1
code_399b:
			dup     
			ldi      42
			eq?     
			bnt      code_39b1
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    muchHead
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_39b1:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_3477
			lap      param1
			not     
			bnt      code_3477
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_3480
code_3477:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_3480:
			ret     
		)
	)
)
