;;; Sierra Script 1.0 - (do not remove this comment)
(script# 176)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	robscrewed 0
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
(instance robscrewed of Rm
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
			pushi    #init
			pushi    0
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
			pushi    2
			pushi    232
			pushi    242
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    107
			pushi    117
			callk    Random,  4
			push    
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
			pushi    109
			pushi    119
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
			ret     
		)
	)
)

(instance frieze1 of PicView
	(properties
		x 31
		y 189
		description 5997
		sightAngle 90
		lookStr 6016
		view 80
		priority 16
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 5997
		sightAngle 90
		lookStr 6088
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
			bnt      code_0cc9
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
			jmp      code_0cde
code_0cc9:
			dup     
			ldi      1
			eq?     
			bnt      code_0cde
			pushi    #stopUpd
			pushi    0
			lofsa    lancer
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
			bnt      code_0d64
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
			jmp      code_0d78
code_0d64:
			dup     
			ldi      1
			eq?     
			bnt      code_0d78
			pushi    #dispose
			pushi    0
			lofsa    lancer2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d78:
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
			bnt      code_0def
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
			jmp      code_0e03
code_0def:
			dup     
			ldi      1
			eq?     
			bnt      code_0e03
			pushi    #dispose
			pushi    0
			lofsa    outlaw2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e03:
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
			bnt      code_0e7c
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
			jmp      code_0e90
code_0e7c:
			dup     
			ldi      1
			eq?     
			bnt      code_0e90
			pushi    #dispose
			pushi    0
			lofsa    outlaw
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e90:
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
			bnt      code_0f17
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
			jmp      code_0f2b
code_0f17:
			dup     
			ldi      1
			eq?     
			bnt      code_0f2b
			pushi    #dispose
			pushi    0
			lofsa    lancer3
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0f2b:
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
			bnt      code_0f91
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
			jmp      code_0fa6
code_0f91:
			dup     
			ldi      1
			eq?     
			bnt      code_0fa6
			pushi    #stopUpd
			pushi    0
			lofsa    archer2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0fa6:
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
			bnt      code_100b
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
			jmp      code_1051
code_100b:
			dup     
			ldi      1
			eq?     
			bnt      code_1051
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    knave
			send     10
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    knave2
			send     10
			pushi    #stopUpd
			pushi    0
			lofsa    archer
			send     4
			lsg      global146
			ldi      65
			eq?     
			bnt      code_104c
			pushi    3
			pushi    1179
			pushi    21
			pushi    108
			calle    proc13_4,  6
code_104c:
			pushi    #dispose
			pushi    0
			self     4
code_1051:
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
			bnt      code_10bd
			lsg      global146
			ldi      65
			eq?     
			bnt      code_10b6
			pushi    3
			pushi    1179
			pushi    22
			pushi    108
			calle    proc13_4,  6
			ldi      60
			aTop     ticks
			jmp      code_10f7
code_10b6:
			ldi      6
			aTop     ticks
			jmp      code_10f7
code_10bd:
			dup     
			ldi      1
			eq?     
			bnt      code_10eb
			lag      global25
			bnt      code_10ce
			pushi    #dispose
			pushi    0
			send     4
code_10ce:
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
			jmp      code_10f7
code_10eb:
			dup     
			ldi      2
			eq?     
			bnt      code_10f7
			pushi    #dispose
			pushi    0
			self     4
code_10f7:
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
			bnt      code_1154
			ldi      1
			sal      local0
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    robin
			send     8
			jmp      code_11f6
code_1154:
			dup     
			ldi      1
			eq?     
			bnt      code_11b0
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
			lag      global113
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
			ldi      18
			aTop     ticks
			jmp      code_11f6
code_11b0:
			dup     
			ldi      2
			eq?     
			bnt      code_11df
			lsg      global146
			ldi      65
			eq?     
			bnt      code_11cf
			pushi    4
			pushi    176
			pushi    0
			pushSelf
			pushi    108
			calle    proc13_4,  8
			jmp      code_11f6
code_11cf:
			pushi    4
			pushi    176
			pushi    1
			pushSelf
			pushi    108
			calle    proc13_4,  8
			jmp      code_11f6
code_11df:
			dup     
			ldi      3
			eq?     
			bnt      code_11f6
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_11f6:
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
			bnt      code_1269
			lal      local1
			bnt      code_1261
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
			jmp      code_1294
code_1261:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1294
code_1269:
			dup     
			ldi      1
			eq?     
			bnt      code_1288
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
			jmp      code_1294
code_1288:
			dup     
			ldi      2
			eq?     
			bnt      code_1294
			pushi    #dispose
			pushi    0
			self     4
code_1294:
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
			bnt      code_1307
			lal      local2
			bnt      code_12ff
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
			jmp      code_1332
code_12ff:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1332
code_1307:
			dup     
			ldi      1
			eq?     
			bnt      code_1326
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
			jmp      code_1332
code_1326:
			dup     
			ldi      2
			eq?     
			bnt      code_1332
			pushi    #dispose
			pushi    0
			self     4
code_1332:
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
			bnt      code_13a4
			lal      local3
			bnt      code_139c
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
			jmp      code_13cf
code_139c:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_13cf
code_13a4:
			dup     
			ldi      1
			eq?     
			bnt      code_13c3
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
			jmp      code_13cf
code_13c3:
			dup     
			ldi      2
			eq?     
			bnt      code_13cf
			pushi    #dispose
			pushi    0
			self     4
code_13cf:
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
			bnt      code_1435
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
			jmp      code_1460
code_1435:
			dup     
			ldi      1
			eq?     
			bnt      code_1454
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
			jmp      code_1460
code_1454:
			dup     
			ldi      2
			eq?     
			bnt      code_1460
			pushi    #dispose
			pushi    0
			self     4
code_1460:
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
			bnt      code_14c5
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
			jmp      code_14f0
code_14c5:
			dup     
			ldi      1
			eq?     
			bnt      code_14e4
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
			jmp      code_14f0
code_14e4:
			dup     
			ldi      2
			eq?     
			bnt      code_14f0
			pushi    #dispose
			pushi    0
			self     4
code_14f0:
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
			bnt      code_1555
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
			jmp      code_1580
code_1555:
			dup     
			ldi      1
			eq?     
			bnt      code_1574
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			sal      local8
			ldi      65535
			aTop     state
			lsl      local8
			ldi      15
			mul     
			aTop     ticks
			jmp      code_1580
code_1574:
			dup     
			ldi      2
			eq?     
			bnt      code_1580
			pushi    #dispose
			pushi    0
			self     4
code_1580:
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
			bnt      code_15e5
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
			jmp      code_1610
code_15e5:
			dup     
			ldi      1
			eq?     
			bnt      code_1604
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local5
			ldi      65535
			aTop     state
			lsl      local5
			ldi      20
			mul     
			aTop     ticks
			jmp      code_1610
code_1604:
			dup     
			ldi      2
			eq?     
			bnt      code_1610
			pushi    #dispose
			pushi    0
			self     4
code_1610:
			toss    
			ret     
		)
	)
)

(instance musicScript of Script
	(properties)
	
	(method (cue &tmp [temp0 26370])
		CorruptFunction_CantDetermineCodeBounds
	)
)
