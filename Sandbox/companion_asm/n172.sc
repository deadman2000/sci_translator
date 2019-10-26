;;; Sierra Script 1.0 - (do not remove this comment)
(script# 172)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	tuckwobat 0
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
)
(instance tuckwobat of Rm
	(properties
		style $0008
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    129
			pushi    110
			callk    Load,  4
			pushi    7
			pushi    128
			pushi    5
			pushi    10
			pushi    80
			pushi    111
			pushi    114
			pushi    115
			calle    proc958_0,  14
			pushi    3
			pushi    132
			pushi    120
			pushi    123
			calle    proc958_0,  6
			pushi    #init
			pushi    0
			lofsa    robin
			send     4
			pushi    #init
			pushi    0
			lofsa    archer
			send     4
			pushi    #x
			pushi    1
			pushi    480
			pushi    3
			pushi    1
			pushi    480
			pushi    7
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			lofsa    archer2
			send     22
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			lofsa    knave
			send     10
			pushi    #x
			pushi    1
			pushi    460
			pushi    3
			pushi    1
			pushi    460
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    2
			pushi    219
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			lofsa    knave2
			send     34
			pushi    #x
			pushi    1
			pushi    450
			pushi    3
			pushi    1
			pushi    450
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			lofsa    knave3
			send     40
			pushi    #x
			pushi    1
			pushi    440
			pushi    3
			pushi    1
			pushi    440
			pushi    7
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    outlaw2
			send     26
			pushi    #view
			pushi    1
			pushi    114
			pushi    6
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    510
			pushi    3
			pushi    1
			pushi    510
			pushi    219
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			lofsa    victim2
			send     34
			pushi    #setScript
			pushi    1
			lofsa    kill
			push    
			lofsa    archer
			send     6
			pushi    #setScript
			pushi    1
			lofsa    kill2
			push    
			lofsa    archer2
			send     6
			pushi    #setScript
			pushi    1
			lofsa    kill3
			push    
			lofsa    robin
			send     6
			pushi    #setScript
			pushi    1
			lofsa    shoot1
			push    
			lofsa    knave
			send     6
			pushi    #setScript
			pushi    1
			lofsa    shoot2
			push    
			lofsa    knave2
			send     6
			pushi    #setScript
			pushi    1
			lofsa    shoot3
			push    
			lofsa    knave3
			send     6
			pushi    #setScript
			pushi    1
			lofsa    shoot4
			push    
			lofsa    victim2
			send     6
			ldi      32
			sal      local1
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    43
			pushi    #superClass
			pushi    120
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    1
			lofsa    musicScript
			push    
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
			send     28
			pushi    #drawPic
			pushi    2
			pushi    110
			pushi    6
			lag      global2
			send     8
			pushi    #x
			pushi    1
			pushi    210
			pushi    3
			pushi    1
			pushi    110
			lofsa    mule
			send     12
			pushi    #x
			pushi    1
			pushi    225
			pushi    3
			pushi    1
			pushi    100
			lofsa    mule2
			send     12
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    2
			pushi    220
			pushi    230
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    109
			pushi    119
			callk    Random,  4
			push    
			lofsa    corpse
			send     24
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    2
			pushi    159
			pushi    169
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    106
			pushi    116
			callk    Random,  4
			push    
			lofsa    corpse2
			send     24
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    2
			pushi    250
			pushi    260
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    106
			pushi    116
			callk    Random,  4
			push    
			lofsa    corpse3
			send     24
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    2
			pushi    136
			pushi    146
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    123
			pushi    133
			callk    Random,  4
			push    
			lofsa    corpse4
			send     24
			pushi    #add
			pushi    8
			lofsa    corpse
			push    
			lofsa    corpse2
			push    
			lofsa    corpse3
			push    
			lofsa    corpse4
			push    
			lofsa    mule
			push    
			lofsa    mule2
			push    
			lofsa    frieze1
			push    
			lofsa    frieze2
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     30
			pushi    #x
			pushi    1
			pushi    130
			pushi    3
			pushi    1
			pushi    189
			lofsa    robin
			send     12
			pushi    #x
			pushi    1
			pushi    78
			pushi    3
			pushi    1
			pushi    146
			lofsa    archer
			send     12
			pushi    #x
			pushi    1
			pushi    2
			pushi    85
			pushi    95
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    165
			pushi    175
			callk    Random,  4
			push    
			lofsa    archer2
			send     12
			pushi    #x
			pushi    1
			pushi    125
			pushi    3
			pushi    1
			pushi    128
			lofsa    knave
			send     12
			pushi    #x
			pushi    1
			pushi    200
			pushi    3
			pushi    1
			pushi    100
			lofsa    knave2
			send     12
			pushi    #x
			pushi    1
			pushi    2
			pushi    172
			pushi    182
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    115
			pushi    125
			callk    Random,  4
			push    
			lofsa    knave3
			send     12
			pushi    #x
			pushi    1
			pushi    7
			pushi    3
			pushi    1
			pushi    108
			lofsa    outlaw2
			send     12
			pushi    #x
			pushi    1
			pushi    210
			pushi    3
			pushi    1
			pushi    120
			lofsa    victim2
			send     12
			pushi    43
			pushi    #superClass
			pushi    123
			pushi    6
			pushi    1
			pushi    65535
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global113
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global113
			send     26
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lag      global2
			send     6
			pushi    1
			pushi    65
			callb    proc0_6,  2
			ret     
		)
	)
)

(instance frieze1 of PicView
	(properties
		x 31
		y 189
		description 5744
		sightAngle 90
		lookStr 5767
		view 80
		priority 15
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 5744
		sightAngle 90
		lookStr 5843
		view 80
		cel 1
		priority 15
	)
)

(instance robin of Prop
	(properties
		x 500
		y 500
		view 5
		loop 3
		cel 4
		cycleSpeed 8
	)
)

(instance victim of Prop
	(properties
		x 180
		y 106
		view 115
		loop 3
		detailLevel 2
	)
)

(instance victim2 of Prop
	(properties
		view 115
		loop 3
		detailLevel 2
	)
)

(instance mule of PicView
	(properties
		x 520
		y 520
		view 115
		loop 7
	)
)

(instance mule2 of PicView
	(properties
		view 115
		loop 7
	)
)

(instance archer of Prop
	(properties)
)

(instance archer2 of Prop
	(properties)
)

(instance outlaw of Actor
	(properties
		x 7
		y 108
		sightAngle 90
		view 111
		detailLevel 2
		illegalBits $0000
	)
)

(instance outlaw2 of Actor
	(properties
		sightAngle 90
		view 111
		detailLevel 2
		illegalBits $0000
	)
)

(instance knave of Prop
	(properties)
)

(instance knave2 of Prop
	(properties)
)

(instance knave3 of Prop
	(properties)
)

(instance lancer of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		signal $0800
		detailLevel 2
		illegalBits $0000
	)
)

(instance lancer2 of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		signal $0800
		detailLevel 2
		illegalBits $0000
	)
)

(instance lancer3 of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		signal $0800
		detailLevel 2
		illegalBits $0000
	)
)

(instance corpse of View
	(properties)
)

(instance corpse2 of View
	(properties)
)

(instance corpse3 of View
	(properties)
)

(instance corpse4 of View
	(properties)
)

(instance timer0 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c34
			pushi    #init
			pushi    0
			pushi    6
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    225
			pushi    3
			pushi    1
			pushi    105
			pushi    289
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    280
			pushi    90
			pushSelf
			lofsa    lancer
			send     46
			jmp      code_0c48
code_0c34:
			dup     
			ldi      1
			eq?     
			bnt      code_0c48
			pushi    #dispose
			pushi    0
			lofsa    lancer
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0c48:
			toss    
			ret     
		)
	)
)

(instance timer0A of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cca
			pushi    #loop
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    12
			pushi    3
			pushi    1
			pushi    113
			pushi    56
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    203
			pushi    79
			pushSelf
			pushi    292
			pushi    0
			lofsa    lancer2
			send     52
			jmp      code_0cde
code_0cca:
			dup     
			ldi      1
			eq?     
			bnt      code_0cde
			pushi    #dispose
			pushi    0
			lofsa    lancer2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0cde:
			toss    
			ret     
		)
	)
)

(instance timer1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d52
			pushi    #moveSpeed
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    203
			pushi    79
			pushSelf
			pushi    292
			pushi    0
			lofsa    outlaw2
			send     34
			jmp      code_0d66
code_0d52:
			dup     
			ldi      1
			eq?     
			bnt      code_0d66
			pushi    #dispose
			pushi    0
			lofsa    outlaw2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d66:
			toss    
			ret     
		)
	)
)

(instance timer2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0dc7
			pushi    #view
			pushi    1
			pushi    115
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    victim2
			send     20
			jmp      code_0ddc
code_0dc7:
			dup     
			ldi      1
			eq?     
			bnt      code_0ddc
			pushi    #stopUpd
			pushi    0
			lofsa    victim2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0ddc:
			toss    
			ret     
		)
	)
)

(instance timer2A of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e72
			pushi    6
			pushi    #superClass
			pushi    2
			pushi    63
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    lancer3
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    4
			pushi    1
			pushi    12
			pushi    3
			pushi    1
			pushi    113
			pushi    56
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    158
			pushi    95
			pushSelf
			pushi    292
			pushi    0
			lofsa    lancer3
			send     64
			jmp      code_0e86
code_0e72:
			dup     
			ldi      1
			eq?     
			bnt      code_0e86
			pushi    #dispose
			pushi    0
			lofsa    lancer3
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e86:
			toss    
			ret     
		)
	)
)

(instance timer3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f11
			pushi    107
			pushi    #species
			pushi    63
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    outlaw
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    56
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    156
			pushi    95
			pushSelf
			pushi    292
			pushi    0
			lofsa    outlaw
			send     50
			jmp      code_0f25
code_0f11:
			dup     
			ldi      1
			eq?     
			bnt      code_0f25
			pushi    #dispose
			pushi    0
			lofsa    outlaw
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0f25:
			toss    
			ret     
		)
	)
)

(instance timer4 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f87
			pushi    #view
			pushi    1
			pushi    115
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    knave
			send     20
			jmp      code_0f9c
code_0f87:
			dup     
			ldi      1
			eq?     
			bnt      code_0f9c
			pushi    #stopUpd
			pushi    0
			lofsa    knave
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0f9c:
			toss    
			ret     
		)
	)
)

(instance timer5 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1006
			ldi      1
			sal      local0
			pushi    #view
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robin
			send     26
			jmp      code_1012
code_1006:
			dup     
			ldi      1
			eq?     
			bnt      code_1012
			pushi    #dispose
			pushi    0
			self     4
code_1012:
			toss    
			ret     
		)
	)
)

(instance timer6 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_106a
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    robin
			send     8
			jmp      code_110c
code_106a:
			dup     
			ldi      1
			eq?     
			bnt      code_10d4
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
			pushi    156
			pushi    0
			lag      global113
			send     10
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lofsa    archer
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lofsa    archer2
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    knave2
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    knave3
			send     6
			ldi      12
			aTop     ticks
			jmp      code_110c
code_10d4:
			dup     
			ldi      2
			eq?     
			bnt      code_10eb
			pushi    4
			pushi    172
			pushi    0
			pushSelf
			pushi    108
			calle    proc13_4,  8
			jmp      code_110c
code_10eb:
			dup     
			ldi      3
			eq?     
			bnt      code_110c
			lag      global25
			bnt      code_10fc
			pushi    #dispose
			pushi    0
			send     4
code_10fc:
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_110c:
			toss    
			ret     
		)
	)
)

(instance kill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1171
			pushi    #cycleSpeed
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_119c
code_1171:
			dup     
			ldi      1
			eq?     
			bnt      code_1190
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local6
			ldi      65535
			aTop     state
			lsl      local6
			ldi      10
			mul     
			aTop     ticks
			jmp      code_119c
code_1190:
			dup     
			ldi      2
			eq?     
			bnt      code_119c
			pushi    #dispose
			pushi    0
			self     4
code_119c:
			toss    
			ret     
		)
	)
)

(instance kill2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1201
			pushi    #cycleSpeed
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_122c
code_1201:
			dup     
			ldi      1
			eq?     
			bnt      code_1220
			pushi    2
			pushi    7
			pushi    10
			callk    Random,  4
			sal      local7
			ldi      65535
			aTop     state
			lsl      local7
			ldi      10
			mul     
			aTop     ticks
			jmp      code_122c
code_1220:
			dup     
			ldi      2
			eq?     
			bnt      code_122c
			pushi    #dispose
			pushi    0
			self     4
code_122c:
			toss    
			ret     
		)
	)
)

(instance kill3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1291
			pushi    #cycleSpeed
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_12bc
code_1291:
			dup     
			ldi      1
			eq?     
			bnt      code_12b0
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
			sal      local8
			ldi      65535
			aTop     state
			lsl      local8
			ldi      10
			mul     
			aTop     ticks
			jmp      code_12bc
code_12b0:
			dup     
			ldi      2
			eq?     
			bnt      code_12bc
			pushi    #dispose
			pushi    0
			self     4
code_12bc:
			toss    
			ret     
		)
	)
)

(instance shoot1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_130b
			ldi      12
			aTop     ticks
			jmp      code_135a
code_130b:
			dup     
			ldi      1
			eq?     
			bnt      code_132f
			pushi    #cel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_135a
code_132f:
			dup     
			ldi      2
			eq?     
			bnt      code_134e
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local3
			ldi      65535
			aTop     state
			lsl      local3
			ldi      10
			mul     
			aTop     ticks
			jmp      code_135a
code_134e:
			dup     
			ldi      3
			eq?     
			bnt      code_135a
			pushi    #dispose
			pushi    0
			self     4
code_135a:
			toss    
			ret     
		)
	)
)

(instance shoot2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13bf
			pushi    #cel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_13ea
code_13bf:
			dup     
			ldi      1
			eq?     
			bnt      code_13de
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local4
			ldi      65535
			aTop     state
			lsl      local4
			ldi      20
			mul     
			aTop     ticks
			jmp      code_13ea
code_13de:
			dup     
			ldi      2
			eq?     
			bnt      code_13ea
			pushi    #dispose
			pushi    0
			self     4
code_13ea:
			toss    
			ret     
		)
	)
)

(instance shoot3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_144f
			pushi    #cel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_147a
code_144f:
			dup     
			ldi      1
			eq?     
			bnt      code_146e
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local5
			ldi      65535
			aTop     state
			lsl      local5
			ldi      10
			mul     
			aTop     ticks
			jmp      code_147a
code_146e:
			dup     
			ldi      2
			eq?     
			bnt      code_147a
			pushi    #dispose
			pushi    0
			self     4
code_147a:
			toss    
			ret     
		)
	)
)

(instance shoot4 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14df
			pushi    #cel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     24
			jmp      code_150a
code_14df:
			dup     
			ldi      1
			eq?     
			bnt      code_14fe
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local2
			ldi      65535
			aTop     state
			lsl      local2
			ldi      10
			mul     
			aTop     ticks
			jmp      code_150a
code_14fe:
			dup     
			ldi      2
			eq?     
			bnt      code_150a
			pushi    #dispose
			pushi    0
			self     4
code_150a:
			toss    
			ret     
		)
	)
)

(instance musicScript of Script
	(properties)
	
	(method (cue &tmp [temp0 18177])
		CorruptFunction_CantDetermineCodeBounds
	)
)
