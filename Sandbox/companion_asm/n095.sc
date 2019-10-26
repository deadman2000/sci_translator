;;; Sierra Script 1.0 - (do not remove this comment)
(script# 95)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	open 0
)

(local
	local0
)
(instance open of Rm
	(properties
		picture 800
		style $0008
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    129
			pushi    800
			pushi    810
			pushi    820
			pushi    825
			calle    proc958_0,  10
			pushi    11
			pushi    128
			pushi    800
			pushi    810
			pushi    820
			pushi    825
			pushi    14
			pushi    153
			pushi    156
			pushi    159
			pushi    162
			pushi    165
			calle    proc958_0,  22
			pushi    5
			pushi    132
			pushi    101
			pushi    102
			pushi    103
			pushi    104
			calle    proc958_0,  10
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
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    tap
			push    
			lofsa    bardsToes
			send     10
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			pushi    #setScript
			pushi    1
			lofsa    bardsTheme
			push    
			self     6
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    102
			pushi    #superClass
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      1
			or      
			push    
			lag      global100
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(class ZScript of Script
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
	)
	
	(method (init param1 param2 param3 param4)
		(asm
			pushi    #add
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #add
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #init
			pushi    3
			lsp      param1
			lsp      param2
			lsp      param3
			&rest    param4
			super    Script,  10
			ret     
		)
	)
	
	(method (dispose param1 &tmp temp0)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_01d1
			lap      param1
			not     
			bnt      code_01d1
			pushi    #setScript
			pushi    1
			lofsa    lastScript
			push    
			lag      global2
			send     6
			jmp      code_01da
code_01d1:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_01da:
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0172
			ret     
code_0172:
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_018b
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
code_018b:
			bt       code_01a7
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_01b6
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
code_01a7:
			bnt      code_01b6
			pushi    #setScript
			pushi    1
			lofsa    lastScript
			push    
			lag      global2
			send     6
code_01b6:
			ret     
		)
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

(instance bardsToes of Prop
	(properties
		x 230
		y 176
		view 800
		loop 3
	)
)

(instance richie of Actor
	(properties
		x 44
		y 154
		view 810
		signal $4010
	)
)

(instance mule of Actor
	(properties
		x 2
		y 154
		view 810
		loop 1
		signal $4810
	)
)

(instance knave of Actor
	(properties
		x 290
		y 158
		view 810
		loop 5
		signal $4800
	)
)

(instance kingsHead of Prop
	(properties
		x 196
		y 104
		view 820
	)
)

(instance leftHand of Prop
	(properties
		x 155
		y 42
		view 820
		loop 1
	)
)

(instance rightHand of Prop
	(properties
		x 238
		y 100
		view 820
		loop 2
	)
)

(instance leoHead of Prop
	(properties
		x 71
		y 32
		view 825
	)
)

(instance leoHand of Prop
	(properties
		x 53
		y 23
		view 825
		loop 1
		priority 15
	)
)

(instance richieHand of Prop
	(properties
		x 271
		y 139
		view 825
		loop 2
	)
)

(instance guardHead of Prop
	(properties
		x 216
		y 64
		view 825
		loop 3
	)
)

(instance johnnie of View
	(properties
		x 240
		y 67
		view 153
		loop 1
	)
)

(instance tuckie of View
	(properties
		x 32
		y 116
		view 156
		loop 1
	)
)

(instance alanD of View
	(properties
		x 84
		y 148
		view 159
		loop 1
	)
)

(instance willie of View
	(properties
		x 287
		y 107
		view 162
		loop 1
	)
)

(instance muchie of View
	(properties
		x 244
		y 148
		view 165
		loop 1
	)
)

(instance robbie of View
	(properties
		x 84
		y 67
		view 14
	)
)

(instance frameRobin of View
	(properties
		x 82
		y 68
		view 14
		cel 1
	)
)

(instance frameTuck of View
	(properties
		x 30
		y 117
		view 14
		cel 1
	)
)

(instance frameAlan of View
	(properties
		x 82
		y 149
		view 14
		cel 1
	)
)

(instance frameJohn of View
	(properties
		x 238
		y 68
		view 14
		cel 1
	)
)

(instance frameWill of View
	(properties
		x 285
		y 108
		view 14
		cel 1
	)
)

(instance frameMuch of View
	(properties
		x 242
		y 149
		view 14
		cel 1
	)
)

(instance bardsTheme of ZScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c93
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    16
			pushi    1
			lag      global100
			send     12
			ldi      120
			aTop     ticks
			jmp      code_0d8e
code_0c93:
			dup     
			ldi      1
			eq?     
			bnt      code_0cd7
			pushi    43
			pushi    #superClass
			pushi    101
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			pushi    159
			pushi    4
			pushi    127
			pushi    60
			pushi    8
			pushi    0
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global100
			send     40
			pushi    1
			pushi    10
			calle    proc13_6,  2
			ldi      6
			aTop     ticks
			jmp      code_0d8e
code_0cd7:
			dup     
			ldi      2
			eq?     
			bnt      code_0cf9
			pushi    8
			pushi    95
			pushi    0
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_0d8e
code_0cf9:
			dup     
			ldi      3
			eq?     
			bnt      code_0d15
			pushi    6
			pushi    95
			pushi    1
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_0d8e
code_0d15:
			dup     
			ldi      4
			eq?     
			bnt      code_0d31
			pushi    6
			pushi    95
			pushi    2
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_0d8e
code_0d31:
			dup     
			ldi      5
			eq?     
			bnt      code_0d4e
			pushi    6
			pushi    95
			pushi    3
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_0d8e
code_0d4e:
			dup     
			ldi      6
			eq?     
			bnt      code_0d76
			lag      global25
			bnt      code_0d5f
			pushi    #dispose
			pushi    0
			send     4
code_0d5f:
			pushi    #fade
			pushi    4
			pushi    60
			pushi    12
			pushi    8
			pushi    0
			lag      global100
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0d8e
code_0d76:
			dup     
			ldi      7
			eq?     
			bnt      code_0d8e
			pushi    #setScript
			pushi    1
			lofsa    nightRider
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0d8e:
			toss    
			ret     
		)
	)
)

(instance nightRider of ZScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e3a
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    810
			pushi    10
			lag      global2
			send     8
			pushi    #new
			pushi    0
			lofsa    knave
			send     4
			sal      local0
			pushi    4
			pushi    #superClass
			pushi    18
			pushi    3
			pushi    1
			pushi    151
			pushi    6
			pushi    1
			pushi    6
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    107
			pushi    0
			lal      local0
			send     28
			pushi    #init
			pushi    0
			lofsa    knave
			send     4
			pushi    #init
			pushi    0
			lofsa    richie
			send     4
			pushi    #init
			pushi    0
			lofsa    mule
			send     4
			ldi      12
			aTop     ticks
			jmp      code_10ba
code_0e3a:
			dup     
			ldi      1
			eq?     
			bnt      code_0e7d
			pushi    43
			pushi    #superClass
			pushi    102
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			pushi    158
			pushi    1
			pushi    10
			pushi    159
			pushi    4
			pushi    127
			pushi    60
			pushi    8
			pushi    0
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global100
			send     46
			ldi      6
			aTop     ticks
			jmp      code_10ba
code_0e7d:
			dup     
			ldi      2
			eq?     
			bnt      code_0ea0
			pushi    8
			pushi    95
			pushi    4
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10ba
code_0ea0:
			dup     
			ldi      3
			eq?     
			bnt      code_0ebd
			pushi    6
			pushi    95
			pushi    5
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_10ba
code_0ebd:
			dup     
			ldi      4
			eq?     
			bnt      code_0eda
			pushi    6
			pushi    95
			pushi    6
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_10ba
code_0eda:
			dup     
			ldi      5
			eq?     
			bnt      code_0ef7
			pushi    6
			pushi    95
			pushi    7
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_10ba
code_0ef7:
			dup     
			ldi      6
			eq?     
			bnt      code_0f56
			lag      global25
			bnt      code_0f08
			pushi    #dispose
			pushi    0
			send     4
code_0f08:
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    165
			pushi    156
			lofsa    knave
			send     16
			pushi    #setScript
			pushi    1
			lofsa    trot
			push    
			lofsa    mule
			send     6
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    3
			class    MoveTo
			push    
			pushi    138
			pushi    154
			lal      local0
			send     16
			pushi    #setScript
			pushi    2
			lofsa    gallop
			push    
			pushSelf
			self     8
			jmp      code_10ba
code_0f56:
			dup     
			ldi      7
			eq?     
			bnt      code_0fa2
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lofsa    knave
			send     10
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lal      local0
			send     10
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    148
			pushi    160
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lofsa    richie
			send     38
			jmp      code_10ba
code_0fa2:
			dup     
			ldi      8
			eq?     
			bnt      code_0fbe
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    65535
			pushSelf
			lofsa    richie
			send     12
			jmp      code_10ba
code_0fbe:
			dup     
			ldi      9
			eq?     
			bnt      code_0fd5
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    richie
			send     8
			jmp      code_10ba
code_0fd5:
			dup     
			ldi      10
			eq?     
			bnt      code_0fe3
			ldi      120
			aTop     ticks
			jmp      code_10ba
code_0fe3:
			dup     
			ldi      11
			eq?     
			bnt      code_1037
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    820
			pushi    10
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    sing
			push    
			lofsa    kingsHead
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    wriggle1
			push    
			lofsa    leftHand
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    wriggle2
			push    
			lofsa    rightHand
			send     10
			ldi      120
			aTop     ticks
			jmp      code_10ba
code_1037:
			dup     
			ldi      12
			eq?     
			bnt      code_1061
			pushi    #release
			pushi    0
			lag      global100
			send     4
			pushi    8
			pushi    95
			pushi    8
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10ba
code_1061:
			dup     
			ldi      13
			eq?     
			bnt      code_106b
			jmp      code_10ba
code_106b:
			dup     
			ldi      14
			eq?     
			bnt      code_1088
			pushi    6
			pushi    95
			pushi    9
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_10ba
code_1088:
			dup     
			ldi      15
			eq?     
			bnt      code_10ba
			lag      global25
			bnt      code_1099
			pushi    #dispose
			pushi    0
			send     4
code_1099:
			pushi    #fade
			pushi    4
			pushi    60
			pushi    12
			pushi    8
			pushi    0
			lag      global100
			send     12
			pushi    #setScript
			pushi    1
			lofsa    grovelYouWorm
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_10ba:
			toss    
			ret     
		)
	)
)

(instance trot of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_111f
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    75
			pushi    132
			pushSelf
			lofsa    mule
			send     18
			jmp      code_1166
code_111f:
			dup     
			ldi      1
			eq?     
			bnt      code_1152
			pushi    63
			pushi    #superClass
			pushi    9
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    mule
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    134
			pushi    220
			pushSelf
			lofsa    mule
			send     24
			jmp      code_1166
code_1152:
			dup     
			ldi      2
			eq?     
			bnt      code_1166
			pushi    #dispose
			pushi    0
			lofsa    mule
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1166:
			toss    
			ret     
		)
	)
)

(instance gallop of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11ca
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    120
			pushi    127
			pushSelf
			lofsa    richie
			send     18
			jmp      code_1225
code_11ca:
			dup     
			ldi      1
			eq?     
			bnt      code_11fd
			pushi    63
			pushi    #superClass
			pushi    9
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    richie
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    149
			pushi    154
			pushSelf
			lofsa    richie
			send     24
			jmp      code_1225
code_11fd:
			dup     
			ldi      2
			eq?     
			bnt      code_1215
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    richie
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1225
code_1215:
			dup     
			ldi      3
			eq?     
			bnt      code_1225
			ldi      1
			aTop     register
			pushi    #dispose
			pushi    0
			self     4
code_1225:
			toss    
			ret     
		)
	)
)

(instance grovelYouWorm of ZScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12c3
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    825
			pushi    10
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    yodel
			push    
			lofsa    leoHead
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    point
			push    
			lofsa    leoHand
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    wriggle3
			push    
			lofsa    richieHand
			send     10
			pushi    #init
			pushi    0
			lofsa    guardHead
			send     4
			ldi      30
			aTop     ticks
			jmp      code_13f2
code_12c3:
			dup     
			ldi      1
			eq?     
			bnt      code_1309
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    guardHead
			send     6
			pushi    43
			pushi    #superClass
			pushi    103
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			pushi    159
			pushi    4
			pushi    127
			pushi    60
			pushi    8
			pushi    0
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global100
			send     40
			ldi      6
			aTop     ticks
			jmp      code_13f2
code_1309:
			dup     
			ldi      2
			eq?     
			bnt      code_132c
			pushi    8
			pushi    95
			pushi    10
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_13f2
code_132c:
			dup     
			ldi      3
			eq?     
			bnt      code_1349
			pushi    6
			pushi    95
			pushi    11
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_13f2
code_1349:
			dup     
			ldi      4
			eq?     
			bnt      code_1366
			pushi    6
			pushi    95
			pushi    12
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_13f2
code_1366:
			dup     
			ldi      5
			eq?     
			bnt      code_1383
			pushi    6
			pushi    95
			pushi    13
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_13f2
code_1383:
			dup     
			ldi      6
			eq?     
			bnt      code_13b3
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    guardHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    leoHead
			send     6
			pushi    6
			pushi    95
			pushi    14
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_13f2
code_13b3:
			dup     
			ldi      7
			eq?     
			bnt      code_13d0
			pushi    6
			pushi    95
			pushi    15
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_13f2
code_13d0:
			dup     
			ldi      8
			eq?     
			bnt      code_13f2
			lag      global25
			bnt      code_13e1
			pushi    #dispose
			pushi    0
			send     4
code_13e1:
			pushi    #setScript
			pushi    1
			lofsa    merrieMen
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_13f2:
			toss    
			ret     
		)
	)
)

(instance merrieMen of ZScript
	(properties)
	
	(method (init param1)
		(asm
			pushi    4
			pushi    0
			pushi    810
			pushi    820
			pushi    825
			calle    proc958_0,  8
			pushi    #init
			pushi    0
			&rest    param1
			super    ZScript,  4
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
			bnt      code_14b2
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    800
			pushi    10
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
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    tap
			push    
			lofsa    bardsToes
			send     10
			ldi      60
			aTop     ticks
			jmp      code_171c
code_14b2:
			dup     
			ldi      1
			eq?     
			bnt      code_14ef
			pushi    43
			pushi    #superClass
			pushi    104
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			pushi    159
			pushi    4
			pushi    127
			pushi    60
			pushi    8
			pushi    0
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global100
			send     40
			ldi      6
			aTop     ticks
			jmp      code_171c
code_14ef:
			dup     
			ldi      2
			eq?     
			bnt      code_150c
			pushi    6
			pushi    95
			pushi    16
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_171c
code_150c:
			dup     
			ldi      3
			eq?     
			bnt      code_1529
			pushi    6
			pushi    95
			pushi    17
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_171c
code_1529:
			dup     
			ldi      4
			eq?     
			bnt      code_1546
			pushi    6
			pushi    95
			pushi    18
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_171c
code_1546:
			dup     
			ldi      5
			eq?     
			bnt      code_1563
			pushi    6
			pushi    95
			pushi    19
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_171c
code_1563:
			dup     
			ldi      6
			eq?     
			bnt      code_1580
			pushi    6
			pushi    95
			pushi    20
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_171c
code_1580:
			dup     
			ldi      7
			eq?     
			bnt      code_159d
			pushi    6
			pushi    95
			pushi    21
			pushi    108
			pushi    67
			pushi    50
			pushi    150
			calle    proc13_4,  12
			jmp      code_171c
code_159d:
			dup     
			ldi      8
			eq?     
			bnt      code_15d4
			lag      global25
			bnt      code_15ae
			pushi    #dispose
			pushi    0
			send     4
code_15ae:
			pushi    6
			pushi    95
			pushi    22
			pushi    108
			pushi    67
			pushi    50
			pushi    155
			calle    proc13_4,  12
			pushi    #init
			pushi    0
			lofsa    johnnie
			send     4
			pushi    #init
			pushi    0
			lofsa    frameJohn
			send     4
			jmp      code_171c
code_15d4:
			dup     
			ldi      9
			eq?     
			bnt      code_1609
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    alanD
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    frameAlan
			send     8
			pushi    6
			pushi    95
			pushi    23
			pushi    108
			pushi    67
			pushi    50
			pushi    155
			calle    proc13_4,  12
			jmp      code_171c
code_1609:
			dup     
			ldi      10
			eq?     
			bnt      code_163e
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    muchie
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    frameMuch
			send     8
			pushi    6
			pushi    95
			pushi    24
			pushi    108
			pushi    67
			pushi    50
			pushi    155
			calle    proc13_4,  12
			jmp      code_171c
code_163e:
			dup     
			ldi      11
			eq?     
			bnt      code_1673
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    willie
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    frameWill
			send     8
			pushi    6
			pushi    95
			pushi    25
			pushi    108
			pushi    67
			pushi    50
			pushi    155
			calle    proc13_4,  12
			jmp      code_171c
code_1673:
			dup     
			ldi      12
			eq?     
			bnt      code_16a8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    tuckie
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    frameTuck
			send     8
			pushi    6
			pushi    95
			pushi    26
			pushi    108
			pushi    67
			pushi    50
			pushi    155
			calle    proc13_4,  12
			jmp      code_171c
code_16a8:
			dup     
			ldi      13
			eq?     
			bnt      code_16dd
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    robbie
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    frameRobin
			send     8
			pushi    6
			pushi    95
			pushi    27
			pushi    108
			pushi    67
			pushi    50
			pushi    155
			calle    proc13_4,  12
			jmp      code_171c
code_16dd:
			dup     
			ldi      14
			eq?     
			bnt      code_16fb
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    3
			pushi    1
			lag      global100
			send     12
			ldi      60
			aTop     ticks
			jmp      code_171c
code_16fb:
			dup     
			ldi      15
			eq?     
			bnt      code_171c
			lag      global25
			bnt      code_170c
			pushi    #dispose
			pushi    0
			send     4
code_170c:
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_171c:
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
			bnt      code_1777
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_17fb
code_1777:
			dup     
			ldi      1
			eq?     
			bnt      code_178c
			pushi    2
			pushi    120
			pushi    240
			callk    Random,  4
			aTop     ticks
			jmp      code_17fb
code_178c:
			dup     
			ldi      2
			eq?     
			bnt      code_17a2
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_17fb
code_17a2:
			dup     
			ldi      3
			eq?     
			bnt      code_17b7
			pushi    2
			pushi    120
			pushi    240
			callk    Random,  4
			aTop     ticks
			jmp      code_17fb
code_17b7:
			dup     
			ldi      4
			eq?     
			bnt      code_17cd
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_17fb
code_17cd:
			dup     
			ldi      5
			eq?     
			bnt      code_17ec
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
			jmp      code_17fb
code_17ec:
			dup     
			ldi      6
			eq?     
			bnt      code_17fb
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_17fb:
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
			bnt      code_1853
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_19ac
code_1853:
			dup     
			ldi      1
			eq?     
			bnt      code_1869
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_19ac
code_1869:
			dup     
			ldi      2
			eq?     
			bnt      code_187f
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_19ac
code_187f:
			dup     
			ldi      3
			eq?     
			bnt      code_1895
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      36
			aTop     ticks
			jmp      code_19ac
code_1895:
			dup     
			ldi      4
			eq?     
			bnt      code_18ab
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_19ac
code_18ab:
			dup     
			ldi      5
			eq?     
			bnt      code_18c1
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_19ac
code_18c1:
			dup     
			ldi      6
			eq?     
			bnt      code_18d7
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_19ac
code_18d7:
			dup     
			ldi      7
			eq?     
			bnt      code_18ed
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_19ac
code_18ed:
			dup     
			ldi      8
			eq?     
			bnt      code_1903
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_19ac
code_1903:
			dup     
			ldi      9
			eq?     
			bnt      code_1919
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_19ac
code_1919:
			dup     
			ldi      10
			eq?     
			bnt      code_192f
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_19ac
code_192f:
			dup     
			ldi      11
			eq?     
			bnt      code_1945
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_19ac
code_1945:
			dup     
			ldi      12
			eq?     
			bnt      code_195b
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_19ac
code_195b:
			dup     
			ldi      13
			eq?     
			bnt      code_1971
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      42
			aTop     ticks
			jmp      code_19ac
code_1971:
			dup     
			ldi      14
			eq?     
			bnt      code_1987
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      36
			aTop     ticks
			jmp      code_19ac
code_1987:
			dup     
			ldi      15
			eq?     
			bnt      code_199d
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_19ac
code_199d:
			dup     
			ldi      16
			eq?     
			bnt      code_19ac
			ldi      6
			aTop     ticks
			ldi      65535
			aTop     state
code_19ac:
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
			bnt      code_1a03
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1ac2
code_1a03:
			dup     
			ldi      1
			eq?     
			bnt      code_1a19
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1ac2
code_1a19:
			dup     
			ldi      2
			eq?     
			bnt      code_1a2f
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1ac2
code_1a2f:
			dup     
			ldi      3
			eq?     
			bnt      code_1a45
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1ac2
code_1a45:
			dup     
			ldi      4
			eq?     
			bnt      code_1a5b
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1ac2
code_1a5b:
			dup     
			ldi      5
			eq?     
			bnt      code_1a71
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1ac2
code_1a71:
			dup     
			ldi      6
			eq?     
			bnt      code_1a87
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1ac2
code_1a87:
			dup     
			ldi      7
			eq?     
			bnt      code_1a9d
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1ac2
code_1a9d:
			dup     
			ldi      8
			eq?     
			bnt      code_1ab3
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1ac2
code_1ab3:
			dup     
			ldi      9
			eq?     
			bnt      code_1ac2
			ldi      24
			aTop     ticks
			ldi      65535
			aTop     state
code_1ac2:
			toss    
			ret     
		)
	)
)

(instance tap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b19
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_1bee
code_1b19:
			dup     
			ldi      1
			eq?     
			bnt      code_1b2f
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1bee
code_1b2f:
			dup     
			ldi      2
			eq?     
			bnt      code_1b45
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_1bee
code_1b45:
			dup     
			ldi      3
			eq?     
			bnt      code_1b5b
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1bee
code_1b5b:
			dup     
			ldi      4
			eq?     
			bnt      code_1b71
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1bee
code_1b71:
			dup     
			ldi      5
			eq?     
			bnt      code_1b87
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1bee
code_1b87:
			dup     
			ldi      6
			eq?     
			bnt      code_1b9d
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1bee
code_1b9d:
			dup     
			ldi      7
			eq?     
			bnt      code_1bb3
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1bee
code_1bb3:
			dup     
			ldi      8
			eq?     
			bnt      code_1bc9
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_1bee
code_1bc9:
			dup     
			ldi      9
			eq?     
			bnt      code_1bdf
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1bee
code_1bdf:
			dup     
			ldi      10
			eq?     
			bnt      code_1bee
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_1bee:
			toss    
			ret     
		)
	)
)

(instance wriggle1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c3e
			ldi      216
			aTop     ticks
			jmp      code_1c79
code_1c3e:
			dup     
			ldi      1
			eq?     
			bnt      code_1c54
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1c79
code_1c54:
			dup     
			ldi      2
			eq?     
			bnt      code_1c6a
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_1c79
code_1c6a:
			dup     
			ldi      3
			eq?     
			bnt      code_1c79
			ldi      6
			aTop     ticks
			ldi      65535
			aTop     state
code_1c79:
			toss    
			ret     
		)
	)
)

(instance wriggle2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cca
			ldi      216
			aTop     ticks
			jmp      code_1d05
code_1cca:
			dup     
			ldi      1
			eq?     
			bnt      code_1ce0
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1d05
code_1ce0:
			dup     
			ldi      2
			eq?     
			bnt      code_1cf6
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_1d05
code_1cf6:
			dup     
			ldi      3
			eq?     
			bnt      code_1d05
			ldi      6
			aTop     ticks
			ldi      65535
			aTop     state
code_1d05:
			toss    
			ret     
		)
	)
)

(instance wriggle3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d56
			ldi      282
			aTop     ticks
			jmp      code_1d91
code_1d56:
			dup     
			ldi      1
			eq?     
			bnt      code_1d6c
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1d91
code_1d6c:
			dup     
			ldi      2
			eq?     
			bnt      code_1d82
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_1d91
code_1d82:
			dup     
			ldi      3
			eq?     
			bnt      code_1d91
			ldi      6
			aTop     ticks
			ldi      65535
			aTop     state
code_1d91:
			toss    
			ret     
		)
	)
)

(instance yodel of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1de9
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1f19
code_1de9:
			dup     
			ldi      1
			eq?     
			bnt      code_1dfe
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1f19
code_1dfe:
			dup     
			ldi      2
			eq?     
			bnt      code_1e14
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1f19
code_1e14:
			dup     
			ldi      3
			eq?     
			bnt      code_1e29
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1f19
code_1e29:
			dup     
			ldi      4
			eq?     
			bnt      code_1e3f
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1f19
code_1e3f:
			dup     
			ldi      5
			eq?     
			bnt      code_1e54
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1f19
code_1e54:
			dup     
			ldi      6
			eq?     
			bnt      code_1e6a
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1f19
code_1e6a:
			dup     
			ldi      7
			eq?     
			bnt      code_1e7f
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1f19
code_1e7f:
			dup     
			ldi      8
			eq?     
			bnt      code_1e95
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1f19
code_1e95:
			dup     
			ldi      9
			eq?     
			bnt      code_1eaa
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1f19
code_1eaa:
			dup     
			ldi      10
			eq?     
			bnt      code_1ec0
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_1f19
code_1ec0:
			dup     
			ldi      11
			eq?     
			bnt      code_1ed5
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1f19
code_1ed5:
			dup     
			ldi      12
			eq?     
			bnt      code_1eeb
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1f19
code_1eeb:
			dup     
			ldi      13
			eq?     
			bnt      code_1f0a
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
			jmp      code_1f19
code_1f0a:
			dup     
			ldi      14
			eq?     
			bnt      code_1f19
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_1f19:
			toss    
			ret     
		)
	)
)

(instance point of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f75
			pushi    #setCycle
			pushi    1
			class    End
			push    
			pToa     client
			send     6
			ldi      270
			aTop     ticks
			jmp      code_1f9e
code_1f75:
			dup     
			ldi      1
			eq?     
			bnt      code_1f8f
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			pToa     client
			send     6
			ldi      390
			aTop     ticks
			jmp      code_1f9e
code_1f8f:
			dup     
			ldi      2
			eq?     
			bnt      code_1f9e
			ldi      24
			aTop     ticks
			ldi      65535
			aTop     state
code_1f9e:
			toss    
			ret     
		)
	)
)

(instance lastScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1fed
			ldi      6
			aTop     cycles
			jmp      code_2004
code_1fed:
			dup     
			ldi      1
			eq?     
			bnt      code_2004
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_2004:
			toss    
			ret     
		)
	)
)
