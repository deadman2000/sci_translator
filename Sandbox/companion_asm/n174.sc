;;; Sierra Script 1.0 - (do not remove this comment)
(script# 174)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	johnswobat 0
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
)
(instance johnswobat of Rm
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
			pushi    540
			pushi    3
			pushi    1
			pushi    540
			pushi    5
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    archer3
			send     38
			pushi    #x
			pushi    1
			pushi    550
			pushi    3
			pushi    1
			pushi    550
			pushi    5
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    archer4
			send     38
			pushi    #x
			pushi    1
			pushi    480
			pushi    3
			pushi    1
			pushi    480
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			lofsa    archer2
			send     28
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
			pushi    219
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			lofsa    knave3
			send     34
			pushi    #init
			pushi    0
			lofsa    victim2
			send     4
			ldi      1
			sal      local1
			ldi      1
			sal      local2
			ldi      1
			sal      local3
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
			sal      local4
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
			pushi    248
			pushi    3
			pushi    1
			pushi    173
			lofsa    archer3
			send     12
			pushi    #x
			pushi    1
			pushi    126
			pushi    3
			pushi    1
			pushi    151
			lofsa    archer4
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
			pushi    101
			pushi    3
			pushi    1
			pushi    171
			lofsa    outlaw2
			send     12
			pushi    #x
			pushi    1
			pushi    2
			pushi    145
			pushi    155
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    104
			pushi    114
			callk    Random,  4
			push    
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
		description 6269
		sightAngle 90
		lookStr 6288
		view 80
		priority 16
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 6269
		sightAngle 90
		lookStr 6360
		view 80
		cel 1
		priority 16
	)
)

(instance robin of Prop
	(properties
		x 500
		y 500
		view 5
		loop 3
		cel 4
		cycleSpeed 3
	)
)

(instance victim2 of Prop
	(properties
		x 510
		y 510
		view 114
		loop 1
		cycleSpeed 8
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

(instance archer3 of Prop
	(properties)
)

(instance archer4 of Prop
	(properties)
)

(instance outlaw of Actor
	(properties
		x 101
		y 149
		sightAngle 90
		view 111
		priority 9
		signal $0010
		detailLevel 2
		illegalBits $0000
	)
)

(instance outlaw2 of Actor
	(properties
		sightAngle 90
		view 111
		priority 9
		signal $0010
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
		priority 9
		signal $0810
		detailLevel 2
		illegalBits $0000
	)
)

(instance lancer2 of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		priority 9
		signal $0810
		detailLevel 2
		illegalBits $0000
	)
)

(instance lancer3 of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		priority 9
		signal $0810
		detailLevel 2
		illegalBits $0000
	)
)

(instance corpse of PicView
	(properties)
)

(instance corpse2 of PicView
	(properties)
)

(instance corpse3 of PicView
	(properties)
)

(instance corpse4 of PicView
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
			bnt      code_0cb5
			pushi    107
			pushi    #species
			pushi    6
			pushi    1
			pushi    4
			pushi    63
			pushi    1
			pushi    6
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    lancer
			send     4
			push    
			ldi      2064
			or      
			push    
			pushi    4
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
			send     58
			jmp      code_0cc9
code_0cb5:
			dup     
			ldi      1
			eq?     
			bnt      code_0cc9
			pushi    #dispose
			pushi    0
			lofsa    lancer
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0cc9:
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
			bnt      code_0d50
			pushi    #init
			pushi    0
			pushi    6
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    101
			pushi    3
			pushi    1
			pushi    171
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
			pushi    263
			pushi    126
			pushSelf
			pushi    292
			pushi    0
			lofsa    lancer2
			send     56
			jmp      code_0d65
code_0d50:
			dup     
			ldi      1
			eq?     
			bnt      code_0d65
			pushi    #stopUpd
			pushi    0
			lofsa    lancer2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d65:
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
			bnt      code_0ddd
			pushi    #init
			pushi    0
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
			pushi    263
			pushi    126
			pushSelf
			pushi    292
			pushi    0
			lofsa    outlaw2
			send     38
			jmp      code_0df2
code_0ddd:
			dup     
			ldi      1
			eq?     
			bnt      code_0df2
			pushi    #stopUpd
			pushi    0
			lofsa    outlaw2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0df2:
			toss    
			ret     
		)
	)
)

(instance timer1A of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e54
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
			pushi    1
			pushi    115
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    knave2
			send     20
			jmp      code_0e69
code_0e54:
			dup     
			ldi      1
			eq?     
			bnt      code_0e69
			pushi    #stopUpd
			pushi    0
			lofsa    knave2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e69:
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
			bnt      code_0ecb
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
			jmp      code_0ee5
code_0ecb:
			dup     
			ldi      1
			eq?     
			bnt      code_0ee5
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    victim2
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_0ee5:
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
			bnt      code_0f6d
			pushi    #init
			pushi    0
			pushi    6
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    101
			pushi    3
			pushi    1
			pushi    149
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
			pushi    251
			pushi    162
			pushSelf
			pushi    292
			pushi    0
			lofsa    lancer3
			send     56
			jmp      code_0f82
code_0f6d:
			dup     
			ldi      1
			eq?     
			bnt      code_0f82
			pushi    #stopUpd
			pushi    0
			lofsa    lancer3
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0f82:
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
			bnt      code_0ffa
			pushi    #init
			pushi    0
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
			pushi    251
			pushi    162
			pushSelf
			pushi    292
			pushi    0
			lofsa    outlaw
			send     38
			jmp      code_1038
code_0ffa:
			dup     
			ldi      1
			eq?     
			bnt      code_1023
			pushi    #dispose
			pushi    0
			lofsa    outlaw
			send     4
			pushi    #view
			pushi    1
			pushi    115
			pushi    142
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    knave3
			send     20
			jmp      code_1038
code_1023:
			dup     
			ldi      2
			eq?     
			bnt      code_1038
			pushi    #stopUpd
			pushi    0
			lofsa    knave3
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1038:
			toss    
			ret     
		)
	)
)

(instance timer3A of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10d1
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local5
			push    
			ldi      2
			eq?     
			bnt      code_10ac
			ldi      0
			sal      local2
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
			lofsa    archer2
			send     20
			jmp      code_10fa
code_10ac:
			lsl      local5
			ldi      1
			eq?     
			bnt      code_10fa
			ldi      0
			sal      local1
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
			lofsa    archer
			send     20
			jmp      code_10fa
code_10d1:
			dup     
			ldi      1
			eq?     
			bnt      code_10fa
			lsl      local5
			ldi      1
			eq?     
			bnt      code_10ec
			pushi    #stopUpd
			pushi    0
			lofsa    archer
			send     4
			jmp      code_10f5
code_10ec:
			pushi    #stopUpd
			pushi    0
			lofsa    archer2
			send     4
code_10f5:
			pushi    #dispose
			pushi    0
			self     4
code_10fa:
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
			bnt      code_1160
			pushi    #view
			pushi    1
			pushi    115
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
			lofsa    knave
			send     26
			jmp      code_1175
code_1160:
			dup     
			ldi      1
			eq?     
			bnt      code_1175
			pushi    #stopUpd
			pushi    0
			lofsa    knave
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1175:
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
			bnt      code_11db
			ldi      0
			sal      local3
			pushi    #view
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robin
			send     20
			jmp      code_11e7
code_11db:
			dup     
			ldi      1
			eq?     
			bnt      code_11e7
			pushi    #dispose
			pushi    0
			self     4
code_11e7:
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
			bnt      code_1244
			ldi      1
			sal      local0
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    robin
			send     8
			jmp      code_12f0
code_1244:
			dup     
			ldi      1
			eq?     
			bnt      code_12c2
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
			lofsa    knave
			send     6
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
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    victim2
			send     6
			ldi      24
			aTop     ticks
			jmp      code_12f0
code_12c2:
			dup     
			ldi      2
			eq?     
			bnt      code_12d9
			pushi    4
			pushi    174
			pushi    0
			pushSelf
			pushi    108
			calle    proc13_4,  8
			jmp      code_12f0
code_12d9:
			dup     
			ldi      3
			eq?     
			bnt      code_12f0
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_12f0:
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
			bnt      code_1363
			lal      local1
			bnt      code_135b
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
			lofsa    archer
			send     24
			jmp      code_138e
code_135b:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_138e
code_1363:
			dup     
			ldi      1
			eq?     
			bnt      code_1382
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local9
			ldi      65535
			aTop     state
			lsl      local9
			ldi      10
			mul     
			aTop     ticks
			jmp      code_138e
code_1382:
			dup     
			ldi      2
			eq?     
			bnt      code_138e
			pushi    #dispose
			pushi    0
			self     4
code_138e:
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
			bnt      code_1401
			lal      local2
			bnt      code_13f9
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
			lofsa    archer2
			send     24
			jmp      code_142c
code_13f9:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_142c
code_1401:
			dup     
			ldi      1
			eq?     
			bnt      code_1420
			pushi    2
			pushi    7
			pushi    10
			callk    Random,  4
			sal      local10
			ldi      65535
			aTop     state
			lsl      local10
			ldi      10
			mul     
			aTop     ticks
			jmp      code_142c
code_1420:
			dup     
			ldi      2
			eq?     
			bnt      code_142c
			pushi    #dispose
			pushi    0
			self     4
code_142c:
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
			bnt      code_149a
			lal      local3
			bnt      code_1492
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
			pToa     client
			send     20
			jmp      code_14c5
code_1492:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_14c5
code_149a:
			dup     
			ldi      1
			eq?     
			bnt      code_14b9
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
			sal      local11
			ldi      65535
			aTop     state
			lsl      local11
			ldi      10
			mul     
			aTop     ticks
			jmp      code_14c5
code_14b9:
			dup     
			ldi      2
			eq?     
			bnt      code_14c5
			pushi    #dispose
			pushi    0
			self     4
code_14c5:
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
			bnt      code_152b
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
			jmp      code_1556
code_152b:
			dup     
			ldi      1
			eq?     
			bnt      code_154a
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local6
			ldi      65535
			aTop     state
			lsl      local6
			ldi      10
			mul     
			aTop     ticks
			jmp      code_1556
code_154a:
			dup     
			ldi      2
			eq?     
			bnt      code_1556
			pushi    #dispose
			pushi    0
			self     4
code_1556:
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
			bnt      code_15bb
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
			jmp      code_15e6
code_15bb:
			dup     
			ldi      1
			eq?     
			bnt      code_15da
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local7
			ldi      65535
			aTop     state
			lsl      local7
			ldi      10
			mul     
			aTop     ticks
			jmp      code_15e6
code_15da:
			dup     
			ldi      2
			eq?     
			bnt      code_15e6
			pushi    #dispose
			pushi    0
			self     4
code_15e6:
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
			bnt      code_164b
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
			jmp      code_1676
code_164b:
			dup     
			ldi      1
			eq?     
			bnt      code_166a
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local8
			ldi      65535
			aTop     state
			lsl      local8
			ldi      10
			mul     
			aTop     ticks
			jmp      code_1676
code_166a:
			dup     
			ldi      2
			eq?     
			bnt      code_1676
			pushi    #dispose
			pushi    0
			self     4
code_1676:
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
			bnt      code_16db
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
			jmp      code_1706
code_16db:
			dup     
			ldi      1
			eq?     
			bnt      code_16fa
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
			jmp      code_1706
code_16fa:
			dup     
			ldi      2
			eq?     
			bnt      code_1706
			pushi    #dispose
			pushi    0
			self     4
code_1706:
			toss    
			ret     
		)
	)
)

(instance musicScript of Script
	(properties)
	
	(method (cue)
		CorruptFunction_CantDetermineCodeBounds
	)
)
