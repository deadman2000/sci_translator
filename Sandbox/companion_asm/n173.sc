;;; Sierra Script 1.0 - (do not remove this comment)
(script# 173)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	wobat 0
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
)
(instance wobat of Rm
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
			pushi    #cycleSpeed
			pushi    1
			pushi    8
			pushi    107
			pushi    0
			lofsa    archer
			send     10
			pushi    #cel
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    8
			pushi    107
			pushi    0
			lofsa    archer2
			send     16
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
			ldi      1
			sal      local1
			ldi      1
			sal      local2
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
			pushi    101
			pushi    3
			pushi    1
			pushi    171
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
		description 5830
		sightAngle 90
		lookStr 5853
		view 80
		priority 15
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 5830
		sightAngle 90
		lookStr 5929
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
		cycleSpeed 3
	)
)

(instance victim of Prop
	(properties
		x 180
		y 106
		view 115
		loop 3
	)
)

(instance victim2 of Prop
	(properties
		view 115
		loop 3
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
			bnt      code_0be2
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
			jmp      code_0bf6
code_0be2:
			dup     
			ldi      1
			eq?     
			bnt      code_0bf6
			pushi    #dispose
			pushi    0
			lofsa    lancer
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0bf6:
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
			bnt      code_0c7c
			pushi    #init
			pushi    0
			pushi    4
			pushi    1
			pushi    101
			pushi    3
			pushi    1
			pushi    171
			pushi    6
			pushi    1
			pushi    2
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
			jmp      code_0c90
code_0c7c:
			dup     
			ldi      1
			eq?     
			bnt      code_0c90
			pushi    #dispose
			pushi    0
			lofsa    lancer2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0c90:
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
			bnt      code_0d07
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
			jmp      code_0d1b
code_0d07:
			dup     
			ldi      1
			eq?     
			bnt      code_0d1b
			pushi    #dispose
			pushi    0
			lofsa    outlaw2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d1b:
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
			bnt      code_0d82
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
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
			send     26
			jmp      code_0d97
code_0d82:
			dup     
			ldi      1
			eq?     
			bnt      code_0d97
			pushi    #stopUpd
			pushi    0
			lofsa    victim2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d97:
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
			bnt      code_0e1f
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
			jmp      code_0e33
code_0e1f:
			dup     
			ldi      1
			eq?     
			bnt      code_0e33
			pushi    #dispose
			pushi    0
			lofsa    lancer3
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e33:
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
			bnt      code_0eac
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
			jmp      code_0ec0
code_0eac:
			dup     
			ldi      1
			eq?     
			bnt      code_0ec0
			pushi    #dispose
			pushi    0
			lofsa    outlaw
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0ec0:
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
			bnt      code_0f60
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local3
			push    
			ldi      2
			eq?     
			bnt      code_0f35
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
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
			send     26
			jmp      code_0f89
code_0f35:
			lsl      local3
			ldi      1
			eq?     
			bnt      code_0f89
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    archer
			send     32
			jmp      code_0f89
code_0f60:
			dup     
			ldi      1
			eq?     
			bnt      code_0f89
			lsl      local3
			ldi      1
			eq?     
			bnt      code_0f7b
			pushi    #stopUpd
			pushi    0
			lofsa    archer
			send     4
			jmp      code_0f84
code_0f7b:
			pushi    #stopUpd
			pushi    0
			lofsa    archer2
			send     4
code_0f84:
			pushi    #dispose
			pushi    0
			self     4
code_0f89:
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
			bnt      code_0feb
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
			jmp      code_1000
code_0feb:
			dup     
			ldi      1
			eq?     
			bnt      code_1000
			pushi    #stopUpd
			pushi    0
			lofsa    knave
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1000:
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
			bnt      code_1061
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
			jmp      code_106d
code_1061:
			dup     
			ldi      1
			eq?     
			bnt      code_106d
			pushi    #dispose
			pushi    0
			self     4
code_106d:
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
			bnt      code_10c6
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    robin
			send     8
			jmp      code_1178
code_10c6:
			dup     
			ldi      1
			eq?     
			bnt      code_113a
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
			lofsa    archer
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    archer2
			send     6
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
			ldi      6
			aTop     ticks
			jmp      code_1178
code_113a:
			dup     
			ldi      2
			eq?     
			bnt      code_1151
			pushi    4
			pushi    173
			pushi    0
			pushSelf
			pushi    108
			calle    proc13_4,  8
			jmp      code_1178
code_1151:
			dup     
			ldi      3
			eq?     
			bnt      code_1178
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #dispose
			pushi    0
			lofsa    musicScript
			send     4
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1178:
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
			bnt      code_11dd
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
			jmp      code_1208
code_11dd:
			dup     
			ldi      1
			eq?     
			bnt      code_11fc
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local3
			ldi      65535
			aTop     state
			lsl      local3
			ldi      10
			mul     
			aTop     ticks
			jmp      code_1208
code_11fc:
			dup     
			ldi      2
			eq?     
			bnt      code_1208
			pushi    #dispose
			pushi    0
			self     4
code_1208:
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
			bnt      code_126d
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
			jmp      code_1298
code_126d:
			dup     
			ldi      1
			eq?     
			bnt      code_128c
			pushi    2
			pushi    7
			pushi    10
			callk    Random,  4
			sal      local4
			ldi      65535
			aTop     state
			lsl      local4
			ldi      10
			mul     
			aTop     ticks
			jmp      code_1298
code_128c:
			dup     
			ldi      2
			eq?     
			bnt      code_1298
			pushi    #dispose
			pushi    0
			self     4
code_1298:
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
			bnt      code_12fd
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
			jmp      code_1328
code_12fd:
			dup     
			ldi      1
			eq?     
			bnt      code_131c
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
			sal      local5
			ldi      65535
			aTop     state
			lsl      local5
			ldi      10
			mul     
			aTop     ticks
			jmp      code_1328
code_131c:
			dup     
			ldi      2
			eq?     
			bnt      code_1328
			pushi    #dispose
			pushi    0
			self     4
code_1328:
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
			bnt      code_138d
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
			jmp      code_13b8
code_138d:
			dup     
			ldi      1
			eq?     
			bnt      code_13ac
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
			jmp      code_13b8
code_13ac:
			dup     
			ldi      2
			eq?     
			bnt      code_13b8
			pushi    #dispose
			pushi    0
			self     4
code_13b8:
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
			bnt      code_141d
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
			jmp      code_1448
code_141d:
			dup     
			ldi      1
			eq?     
			bnt      code_143c
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
			jmp      code_1448
code_143c:
			dup     
			ldi      2
			eq?     
			bnt      code_1448
			pushi    #dispose
			pushi    0
			self     4
code_1448:
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
			bnt      code_14ad
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
			jmp      code_14d8
code_14ad:
			dup     
			ldi      1
			eq?     
			bnt      code_14cc
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local9
			ldi      65535
			aTop     state
			lsl      local9
			ldi      10
			mul     
			aTop     ticks
			jmp      code_14d8
code_14cc:
			dup     
			ldi      2
			eq?     
			bnt      code_14d8
			pushi    #dispose
			pushi    0
			self     4
code_14d8:
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
			bnt      code_153d
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
			jmp      code_1568
code_153d:
			dup     
			ldi      1
			eq?     
			bnt      code_155c
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
			jmp      code_1568
code_155c:
			dup     
			ldi      2
			eq?     
			bnt      code_1568
			pushi    #dispose
			pushi    0
			self     4
code_1568:
			toss    
			ret     
		)
	)
)

(instance musicScript of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			dup     
			ldi      65535
			eq?     
			bnt      code_15b7
			jmp      code_1683
code_15b7:
			dup     
			ldi      1
			eq?     
			bnt      code_15c1
			jmp      code_1683
code_15c1:
			dup     
			ldi      2
			eq?     
			bnt      code_15d8
			pushi    #setScript
			pushi    1
			lofsa    timer0A
			push    
			lofsa    lancer2
			send     6
			jmp      code_1683
code_15d8:
			dup     
			ldi      3
			eq?     
			bnt      code_15ef
			pushi    #setScript
			pushi    1
			lofsa    timer1
			push    
			lofsa    outlaw2
			send     6
			jmp      code_1683
code_15ef:
			dup     
			ldi      4
			eq?     
			bnt      code_1606
			pushi    #setScript
			pushi    1
			lofsa    timer2
			push    
			lofsa    victim2
			send     6
			jmp      code_1683
code_1606:
			dup     
			ldi      5
			eq?     
			bnt      code_161d
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    outlaw
			send     6
			jmp      code_1683
code_161d:
			dup     
			ldi      6
			eq?     
			bnt      code_1641
			pushi    #setScript
			pushi    1
			lofsa    timer3
			push    
			lofsa    lancer3
			send     6
			pushi    #setScript
			pushi    1
			lofsa    timer3A
			push    
			lofsa    victim2
			send     6
			jmp      code_1683
code_1641:
			dup     
			ldi      7
			eq?     
			bnt      code_1658
			pushi    #setScript
			pushi    1
			lofsa    timer4
			push    
			lofsa    knave
			send     6
			jmp      code_1683
code_1658:
			dup     
			ldi      8
			eq?     
			bnt      code_166f
			pushi    #setScript
			pushi    1
			lofsa    timer5
			push    
			lofsa    robin
			send     6
			jmp      code_1683
code_166f:
			dup     
			ldi      9
			eq?     
			bnt      code_1683
			pushi    #setScript
			pushi    1
			lofsa    timer6
			push    
			lofsa    robin
			send     6
code_1683:
			toss    
			ret     
		)
	)
)
