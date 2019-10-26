;;; Sierra Script 1.0 - (do not remove this comment)
(script# 177)
(include sci.sh)
(use n000)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	willCas 0
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
(instance willCas of Rm
	(properties
		style $0008
	)
	
	(method (init)
		(asm
			pushi    7
			pushi    128
			pushi    80
			pushi    111
			pushi    114
			pushi    115
			pushi    394
			pushi    393
			calle    proc958_0,  14
			pushi    2
			pushi    132
			pushi    124
			calle    proc958_0,  4
			pushi    2
			pushi    129
			pushi    390
			callk    Load,  4
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    robin
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    lilj
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    wills
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    muchm
			send     8
			pushi    #init
			pushi    0
			lofsa    knave
			send     4
			pushi    #view
			pushi    1
			pushi    393
			pushi    4
			pushi    1
			pushi    460
			pushi    3
			pushi    1
			pushi    460
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    knave2
			send     34
			pushi    #view
			pushi    1
			pushi    393
			pushi    4
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
			pushi    0
			pushi    107
			pushi    0
			lofsa    knave3
			send     34
			pushi    #view
			pushi    1
			pushi    114
			pushi    4
			pushi    1
			pushi    440
			pushi    3
			pushi    1
			pushi    440
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			lofsa    knave4
			send     34
			pushi    #init
			pushi    0
			lofsa    victim
			send     4
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			pushi    285
			pushi    0
			lofsa    fire
			send     12
			pushi    #x
			pushi    1
			pushi    173
			pushi    3
			pushi    1
			pushi    103
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    285
			pushi    0
			lofsa    fire2
			send     24
			pushi    #x
			pushi    1
			pushi    138
			pushi    3
			pushi    1
			pushi    113
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    285
			pushi    0
			lofsa    fire3
			send     24
			pushi    #x
			pushi    1
			pushi    166
			pushi    3
			pushi    1
			pushi    122
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    285
			pushi    0
			lofsa    fire4
			send     24
			pushi    #setScript
			pushi    1
			lofsa    kill1
			push    
			lofsa    knave
			send     6
			pushi    #setScript
			pushi    1
			lofsa    kill2
			push    
			lofsa    knave2
			send     6
			pushi    #setScript
			pushi    1
			lofsa    kill3
			push    
			lofsa    knave3
			send     6
			pushi    #setScript
			pushi    1
			lofsa    fight1
			push    
			lofsa    knave4
			send     6
			pushi    #setScript
			pushi    1
			lofsa    fight2
			push    
			lofsa    victim
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local7
			pushi    43
			pushi    1
			pushi    124
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    42
			pushi    2
			pushi    30
			lsg      global146
			dup     
			ldi      12
			eq?     
			bnt      code_01b9
			lofsa    musicScriptOne
			jmp      code_01fd
code_01b9:
			dup     
			ldi      22
			eq?     
			bnt      code_01c6
			lofsa    musicScriptOne
			jmp      code_01fd
code_01c6:
			dup     
			ldi      11
			eq?     
			bnt      code_01d3
			lofsa    musicScriptTwo
			jmp      code_01fd
code_01d3:
			dup     
			ldi      21
			eq?     
			bnt      code_01e0
			lofsa    musicScriptTwo
			jmp      code_01fd
code_01e0:
			dup     
			ldi      10
			eq?     
			bnt      code_01ed
			lofsa    musicScriptGood
			jmp      code_01fd
code_01ed:
			dup     
			ldi      20
			eq?     
			bnt      code_01fa
			lofsa    musicScriptGood
			jmp      code_01fd
code_01fa:
			lofsa    musicScriptBad
code_01fd:
			toss    
			push    
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
			send     42
			pushi    #drawPic
			pushi    2
			pushi    390
			pushi    6
			lag      global2
			send     8
			pushi    #x
			pushi    1
			pushi    167
			pushi    3
			pushi    1
			pushi    185
			lofsa    corpse
			send     12
			pushi    #x
			pushi    1
			pushi    148
			pushi    3
			pushi    1
			pushi    176
			lofsa    corpse2
			send     12
			pushi    #add
			pushi    4
			lofsa    corpse
			push    
			lofsa    corpse2
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
			send     22
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    210
			lofsa    robin
			send     12
			pushi    #x
			pushi    1
			pushi    299
			pushi    3
			pushi    1
			pushi    205
			lofsa    lilj
			send     12
			pushi    #x
			pushi    1
			pushi    156
			pushi    3
			pushi    1
			pushi    235
			lofsa    wills
			send     12
			pushi    #x
			pushi    1
			pushi    36
			pushi    3
			pushi    1
			pushi    187
			lofsa    muchm
			send     12
			pushi    #x
			pushi    1
			pushi    166
			pushi    3
			pushi    1
			pushi    134
			lofsa    knave
			send     12
			pushi    #x
			pushi    1
			pushi    195
			pushi    3
			pushi    1
			pushi    180
			lofsa    knave2
			send     12
			pushi    #x
			pushi    1
			pushi    127
			pushi    3
			pushi    1
			pushi    180
			lofsa    knave3
			send     12
			pushi    #x
			pushi    1
			pushi    147
			pushi    3
			pushi    1
			pushi    171
			lofsa    knave4
			send     12
			pushi    #x
			pushi    1
			pushi    246
			pushi    3
			pushi    1
			pushi    187
			lofsa    victim
			send     12
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
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance frieze1 of PicView
	(properties
		x 31
		y 189
		description 6820
		sightAngle 90
		lookStr 6839
		view 80
		priority 15
		signal $4010
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 6820
		sightAngle 90
		lookStr 6915
		view 80
		cel 1
		priority 15
		signal $4010
	)
)

(instance robin of Actor
	(properties
		x 500
		y 500
		view 394
		loop 1
		priority 12
		signal $4010
		illegalBits $0000
	)
)

(instance lilj of Actor
	(properties
		x 600
		y 600
		view 394
		signal $4000
		illegalBits $0000
	)
)

(instance wills of Actor
	(properties
		x 610
		y 610
		view 394
		loop 2
		signal $4000
		illegalBits $0000
	)
)

(instance muchm of Prop
	(properties)
)

(instance victim of Prop
	(properties
		x 560
		y 560
		view 393
		detailLevel 2
	)
)

(instance knave of Actor
	(properties
		x 470
		y 470
		sightAngle 90
		view 114
		loop 1
		detailLevel 2
		illegalBits $0000
	)
)

(instance knave2 of Actor
	(properties
		sightAngle 90
		loop 1
		detailLevel 2
		illegalBits $0000
	)
)

(instance knave3 of Actor
	(properties
		sightAngle 90
		loop 1
		detailLevel 2
		illegalBits $0000
	)
)

(instance knave4 of Actor
	(properties
		sightAngle 90
		loop 1
		detailLevel 2
		illegalBits $0000
	)
)

(instance corpse of PicView
	(properties
		sightAngle 90
		view 393
		loop 2
		cel 5
		priority 4
	)
)

(instance corpse2 of PicView
	(properties
		view 115
		loop 3
		cel 5
		priority 4
	)
)

(instance fire of Prop
	(properties
		x 179
		y 125
		view 111
		loop 5
		signal $4010
		detailLevel 2
	)
)

(instance fire2 of Prop
	(properties
		view 111
		loop 5
		signal $4010
		detailLevel 2
	)
)

(instance fire3 of Prop
	(properties
		view 111
		loop 5
		signal $4010
		detailLevel 2
	)
)

(instance fire4 of Prop
	(properties
		view 111
		loop 5
		signal $4010
		detailLevel 2
	)
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
			bnt      code_0a89
			pTos     client
			lofsa    knave2
			eq?     
			bnt      code_0a7e
			ldi      4
			sal      local1
			jmp      code_0a82
code_0a7e:
			ldi      5
			sal      local1
code_0a82:
			ldi      6
			aTop     ticks
			jmp      code_0ae9
code_0a89:
			dup     
			ldi      1
			eq?     
			bnt      code_0aac
			pushi    #loop
			pushi    1
			lsl      local1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			pToa     client
			send     24
			jmp      code_0ae9
code_0aac:
			dup     
			ldi      2
			eq?     
			bnt      code_0ad6
			pushi    63
			pushi    #superClass
			pushi    6
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			push    
			ldi      16
			or      
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_0ae9
code_0ad6:
			dup     
			ldi      3
			eq?     
			bnt      code_0ae9
			pushi    #dispose
			pushi    0
			pToa     client
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0ae9:
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
			bnt      code_0b4e
			pushi    #view
			pushi    1
			pushi    115
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			pToa     client
			send     24
			jmp      code_0bb9
code_0b4e:
			dup     
			ldi      1
			eq?     
			bnt      code_0b6b
			pushi    #cel
			pushi    1
			pushi    4
			pushi    3
			pushi    1
			pushi    148
			pToa     client
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0bb9
code_0b6b:
			dup     
			ldi      2
			eq?     
			bnt      code_0b88
			pushi    #cel
			pushi    1
			pushi    5
			pushi    3
			pushi    1
			pushi    160
			pToa     client
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0bb9
code_0b88:
			dup     
			ldi      3
			eq?     
			bnt      code_0ba5
			pushi    #cel
			pushi    1
			pushi    6
			pushi    3
			pushi    1
			pushi    174
			pToa     client
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0bb9
code_0ba5:
			dup     
			ldi      4
			eq?     
			bnt      code_0bb9
			pushi    #stopUpd
			pushi    0
			pToa     client
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0bb9:
			toss    
			ret     
		)
	)
)

(instance timer1fire of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c32
			pushi    #show
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    292
			pushi    0
			lofsa    fire4
			send     14
			pushi    #view
			pushi    1
			pushi    115
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			pToa     client
			send     24
			jmp      code_0cc2
code_0c32:
			dup     
			ldi      1
			eq?     
			bnt      code_0c5a
			pushi    #y
			pushi    1
			pushi    144
			lofsa    fire4
			send     6
			pushi    #cel
			pushi    1
			pushi    4
			pushi    3
			pushi    1
			pushi    148
			pToa     client
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0cc2
code_0c5a:
			dup     
			ldi      2
			eq?     
			bnt      code_0c82
			pushi    #y
			pushi    1
			pushi    156
			lofsa    fire4
			send     6
			pushi    #cel
			pushi    1
			pushi    5
			pushi    3
			pushi    1
			pushi    160
			pToa     client
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0cc2
code_0c82:
			dup     
			ldi      3
			eq?     
			bnt      code_0cae
			pushi    #y
			pushi    1
			pushi    170
			pushi    292
			pushi    0
			lofsa    fire4
			send     10
			pushi    #cel
			pushi    1
			pushi    6
			pushi    3
			pushi    1
			pushi    174
			pToa     client
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0cc2
code_0cae:
			dup     
			ldi      4
			eq?     
			bnt      code_0cc2
			pushi    #stopUpd
			pushi    0
			pToa     client
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0cc2:
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
			bnt      code_0d1d
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     14
			jmp      code_0d30
code_0d1d:
			dup     
			ldi      1
			eq?     
			bnt      code_0d30
			pushi    #dispose
			pushi    0
			pToa     client
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d30:
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
			bnt      code_0dbd
			pushi    5
			pushi    #superClass
			pushi    111
			pushi    63
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    4
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			pToa     client
			send     4
			push    
			ldi      2064
			or      
			push    
			pushi    54
			pushi    1
			pushi    6
			pushi    55
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    187
			pushi    173
			pushSelf
			pToa     client
			send     54
			jmp      code_0dd0
code_0dbd:
			dup     
			ldi      1
			eq?     
			bnt      code_0dd0
			pushi    #dispose
			pushi    0
			pToa     client
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0dd0:
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
			bnt      code_0e38
			pushi    63
			pushi    #superClass
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    knave
			send     4
			push    
			ldi      16
			or      
			push    
			lofsa    knave
			send     12
			ldi      6
			aTop     ticks
			jmp      code_0e9a
code_0e38:
			dup     
			ldi      1
			eq?     
			bnt      code_0e7c
			pushi    6
			pushi    #superClass
			pushi    1
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robin
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    54
			pushi    1
			pushi    6
			pushi    55
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    200
			pushi    170
			pushSelf
			lofsa    robin
			send     42
			jmp      code_0e9a
code_0e7c:
			dup     
			ldi      2
			eq?     
			bnt      code_0e9a
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			lofsa    robin
			send     16
			pushi    #dispose
			pushi    0
			self     4
code_0e9a:
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
			bnt      code_0ef3
			pushi    #x
			pushi    1
			pushi    58
			lofsa    muchm
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0f33
code_0ef3:
			dup     
			ldi      1
			eq?     
			bnt      code_0f0b
			pushi    #x
			pushi    1
			pushi    62
			lofsa    muchm
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0f33
code_0f0b:
			dup     
			ldi      2
			eq?     
			bnt      code_0f27
			pushi    #x
			pushi    1
			pushi    66
			pushi    285
			pushi    0
			lofsa    muchm
			send     10
			ldi      6
			aTop     ticks
			jmp      code_0f33
code_0f27:
			dup     
			ldi      3
			eq?     
			bnt      code_0f33
			pushi    #dispose
			pushi    0
			self     4
code_0f33:
			toss    
			ret     
		)
	)
)

(instance liljWalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0faf
			pushi    6
			pushi    #superClass
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    lilj
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    240
			pushi    205
			pushSelf
			lofsa    lilj
			send     30
			jmp      code_0fce
code_0faf:
			dup     
			ldi      1
			eq?     
			bnt      code_0fce
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    lilj
			send     16
			pushi    #dispose
			pushi    0
			self     4
code_0fce:
			toss    
			ret     
		)
	)
)

(instance willsWalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_103d
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    54
			pushi    1
			pushi    3
			pushi    55
			pushi    1
			pushi    2
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    156
			pushi    178
			pushSelf
			lofsa    wills
			send     30
			jmp      code_105c
code_103d:
			dup     
			ldi      1
			eq?     
			bnt      code_105c
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    285
			pushi    0
			lofsa    wills
			send     16
			pushi    #dispose
			pushi    0
			self     4
code_105c:
			toss    
			ret     
		)
	)
)

(instance kill1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10c1
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
			jmp      code_10eb
code_10c1:
			dup     
			ldi      1
			eq?     
			bnt      code_10df
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			sal      local2
			push    
			ldi      10
			mul     
			aTop     ticks
			ldi      65535
			aTop     state
			jmp      code_10eb
code_10df:
			dup     
			ldi      2
			eq?     
			bnt      code_10eb
			pushi    #dispose
			pushi    0
			self     4
code_10eb:
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
			bnt      code_1151
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
			jmp      code_117b
code_1151:
			dup     
			ldi      1
			eq?     
			bnt      code_116f
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			sal      local3
			push    
			ldi      10
			mul     
			aTop     ticks
			ldi      65535
			aTop     state
			jmp      code_117b
code_116f:
			dup     
			ldi      2
			eq?     
			bnt      code_117b
			pushi    #dispose
			pushi    0
			self     4
code_117b:
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
			bnt      code_11cb
			ldi      42
			aTop     ticks
			jmp      code_1219
code_11cb:
			dup     
			ldi      1
			eq?     
			bnt      code_11ef
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
			jmp      code_1219
code_11ef:
			dup     
			ldi      2
			eq?     
			bnt      code_120d
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			sal      local4
			push    
			ldi      10
			mul     
			aTop     ticks
			ldi      65535
			aTop     state
			jmp      code_1219
code_120d:
			dup     
			ldi      3
			eq?     
			bnt      code_1219
			pushi    #dispose
			pushi    0
			self     4
code_1219:
			toss    
			ret     
		)
	)
)

(instance fight1 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_127f
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
			jmp      code_12a9
code_127f:
			dup     
			ldi      1
			eq?     
			bnt      code_129d
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			sal      local5
			push    
			ldi      10
			mul     
			aTop     ticks
			ldi      65535
			aTop     state
			jmp      code_12a9
code_129d:
			dup     
			ldi      2
			eq?     
			bnt      code_12a9
			pushi    #dispose
			pushi    0
			self     4
code_12a9:
			toss    
			ret     
		)
	)
)

(instance fight2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_130f
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
			jmp      code_1339
code_130f:
			dup     
			ldi      1
			eq?     
			bnt      code_132d
			pushi    2
			pushi    3
			pushi    9
			callk    Random,  4
			sal      local6
			push    
			ldi      10
			mul     
			aTop     ticks
			ldi      65535
			aTop     state
			jmp      code_1339
code_132d:
			dup     
			ldi      2
			eq?     
			bnt      code_1339
			pushi    #dispose
			pushi    0
			self     4
code_1339:
			toss    
			ret     
		)
	)
)

(instance musicScriptGood of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			dup     
			ldi      2
			eq?     
			bnt      code_13a2
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    knave2
			send     24
			jmp      code_1499
code_13a2:
			dup     
			ldi      3
			eq?     
			bnt      code_13c2
			pushi    #stopUpd
			pushi    0
			lofsa    knave2
			send     4
			pushi    #setScript
			pushi    1
			lofsa    timer1
			push    
			lofsa    knave
			send     6
			jmp      code_1499
code_13c2:
			dup     
			ldi      4
			eq?     
			bnt      code_13d9
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    victim
			send     6
			jmp      code_1499
code_13d9:
			dup     
			ldi      5
			eq?     
			bnt      code_1406
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    66
			pushi    1
			pushi    0
			lofsa    knave4
			send     36
			jmp      code_1499
code_1406:
			dup     
			ldi      6
			eq?     
			bnt      code_143f
			lsl      local7
			ldi      2
			eq?     
			not     
			bnt      code_142f
			pushi    63
			pushi    #superClass
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    knave4
			send     4
			push    
			ldi      16
			or      
			push    
			lofsa    knave4
			send     12
code_142f:
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
			jmp      code_1499
code_143f:
			dup     
			ldi      7
			eq?     
			bnt      code_1456
			pushi    #setScript
			pushi    1
			lofsa    timer4
			push    
			lofsa    robin
			send     6
			jmp      code_1499
code_1456:
			dup     
			ldi      8
			eq?     
			bnt      code_1487
			pushi    #setScript
			pushi    1
			lofsa    timer5
			push    
			lofsa    muchm
			send     6
			pushi    #setScript
			pushi    1
			lofsa    liljWalk
			push    
			lofsa    lilj
			send     6
			pushi    #setScript
			pushi    1
			lofsa    willsWalk
			push    
			lofsa    wills
			send     6
			jmp      code_1499
code_1487:
			dup     
			ldi      9
			eq?     
			bnt      code_1499
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
code_1499:
			toss    
			ret     
		)
	)
)

(instance musicScriptBad of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			dup     
			ldi      2
			eq?     
			bnt      code_152e
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local7
			push    
			ldi      1
			eq?     
			bnt      code_1505
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave2
			send     6
			jmp      code_15fc
code_1505:
			pushi    63
			pushi    #superClass
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    knave4
			send     4
			push    
			ldi      16
			or      
			push    
			lofsa    knave4
			send     12
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
			jmp      code_15fc
code_152e:
			dup     
			ldi      3
			eq?     
			bnt      code_1545
			pushi    #setScript
			pushi    1
			lofsa    timer1
			push    
			lofsa    knave
			send     6
			jmp      code_15fc
code_1545:
			dup     
			ldi      4
			eq?     
			bnt      code_155c
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    victim
			send     6
			jmp      code_15fc
code_155c:
			dup     
			ldi      5
			eq?     
			bnt      code_1573
			pushi    #setScript
			pushi    1
			lofsa    timer3
			push    
			lofsa    knave4
			send     6
			jmp      code_15fc
code_1573:
			dup     
			ldi      6
			eq?     
			bnt      code_15a2
			lsl      local7
			ldi      2
			eq?     
			bnt      code_1592
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave2
			send     6
			jmp      code_15fc
code_1592:
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
			jmp      code_15fc
code_15a2:
			dup     
			ldi      7
			eq?     
			bnt      code_15b9
			pushi    #setScript
			pushi    1
			lofsa    timer4
			push    
			lofsa    robin
			send     6
			jmp      code_15fc
code_15b9:
			dup     
			ldi      8
			eq?     
			bnt      code_15ea
			pushi    #setScript
			pushi    1
			lofsa    timer5
			push    
			lofsa    muchm
			send     6
			pushi    #setScript
			pushi    1
			lofsa    liljWalk
			push    
			lofsa    lilj
			send     6
			pushi    #setScript
			pushi    1
			lofsa    willsWalk
			push    
			lofsa    wills
			send     6
			jmp      code_15fc
code_15ea:
			dup     
			ldi      9
			eq?     
			bnt      code_15fc
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
code_15fc:
			toss    
			ret     
		)
	)
)

(instance musicScriptTwo of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_1664
			pushi    63
			pushi    #superClass
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    knave4
			send     4
			push    
			ldi      16
			or      
			push    
			lofsa    knave4
			send     12
			jmp      code_1810
code_1664:
			dup     
			ldi      2
			eq?     
			bnt      code_169a
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local8
			push    
			ldi      1
			eq?     
			bnt      code_168a
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    victim
			send     6
			jmp      code_1810
code_168a:
			pushi    #setScript
			pushi    1
			lofsa    timer1
			push    
			lofsa    knave
			send     6
			jmp      code_1810
code_169a:
			dup     
			ldi      3
			eq?     
			bnt      code_16e2
			lsl      local7
			dup     
			ldi      1
			eq?     
			bnt      code_16ba
			pushi    #setScript
			pushi    1
			lofsa    timer3
			push    
			lofsa    knave4
			send     6
			jmp      code_16de
code_16ba:
			dup     
			ldi      2
			eq?     
			bnt      code_16d1
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave2
			send     6
			jmp      code_16de
code_16d1:
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
code_16de:
			toss    
			jmp      code_1810
code_16e2:
			dup     
			ldi      4
			eq?     
			bnt      code_172e
			lsl      local7
			ldi      1
			eq?     
			bnt      code_16fd
			pushi    #stopUpd
			pushi    0
			lofsa    knave2
			send     4
			jmp      code_1706
code_16fd:
			pushi    #stopUpd
			pushi    0
			lofsa    knave4
			send     4
code_1706:
			lsl      local8
			ldi      1
			eq?     
			bnt      code_171e
			pushi    #setScript
			pushi    1
			lofsa    timer1
			push    
			lofsa    knave
			send     6
			jmp      code_1810
code_171e:
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    victim
			send     6
			jmp      code_1810
code_172e:
			dup     
			ldi      5
			eq?     
			bnt      code_1785
			lsl      local7
			dup     
			ldi      1
			eq?     
			bnt      code_175e
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    66
			pushi    1
			pushi    0
			lofsa    knave2
			send     30
			jmp      code_1781
code_175e:
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    66
			pushi    1
			pushi    0
			lofsa    knave4
			send     36
code_1781:
			toss    
			jmp      code_1810
code_1785:
			dup     
			ldi      6
			eq?     
			bnt      code_17b6
			lsl      local7
			dup     
			ldi      3
			eq?     
			bnt      code_17a5
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave2
			send     6
			jmp      code_17b2
code_17a5:
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
code_17b2:
			toss    
			jmp      code_1810
code_17b6:
			dup     
			ldi      7
			eq?     
			bnt      code_17cd
			pushi    #setScript
			pushi    1
			lofsa    timer4
			push    
			lofsa    robin
			send     6
			jmp      code_1810
code_17cd:
			dup     
			ldi      8
			eq?     
			bnt      code_17fe
			pushi    #setScript
			pushi    1
			lofsa    timer5
			push    
			lofsa    muchm
			send     6
			pushi    #setScript
			pushi    1
			lofsa    liljWalk
			push    
			lofsa    lilj
			send     6
			pushi    #setScript
			pushi    1
			lofsa    willsWalk
			push    
			lofsa    wills
			send     6
			jmp      code_1810
code_17fe:
			dup     
			ldi      9
			eq?     
			bnt      code_1810
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
code_1810:
			toss    
			ret     
		)
	)
)

(instance musicScriptOne of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_188c
			pushi    63
			pushi    #superClass
			pushi    0
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    knave4
			send     4
			push    
			ldi      16
			or      
			push    
			lofsa    knave4
			send     12
			pushi    #show
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    292
			pushi    0
			lofsa    fire
			send     14
			jmp      code_1a60
code_188c:
			dup     
			ldi      2
			eq?     
			bnt      code_18c2
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			sal      local8
			push    
			ldi      1
			eq?     
			bnt      code_18b2
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    victim
			send     6
			jmp      code_1a60
code_18b2:
			pushi    #setScript
			pushi    1
			lofsa    timer1fire
			push    
			lofsa    knave
			send     6
			jmp      code_1a60
code_18c2:
			dup     
			ldi      3
			eq?     
			bnt      code_190a
			lsl      local7
			dup     
			ldi      1
			eq?     
			bnt      code_18e2
			pushi    #setScript
			pushi    1
			lofsa    timer3
			push    
			lofsa    knave4
			send     6
			jmp      code_1906
code_18e2:
			dup     
			ldi      2
			eq?     
			bnt      code_18f9
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave2
			send     6
			jmp      code_1906
code_18f9:
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
code_1906:
			toss    
			jmp      code_1a60
code_190a:
			dup     
			ldi      4
			eq?     
			bnt      code_196a
			pushi    #show
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    292
			pushi    0
			lofsa    fire2
			send     14
			lsl      local7
			ldi      1
			eq?     
			bnt      code_1939
			pushi    #stopUpd
			pushi    0
			lofsa    knave2
			send     4
			jmp      code_1942
code_1939:
			pushi    #stopUpd
			pushi    0
			lofsa    knave4
			send     4
code_1942:
			lsl      local8
			ldi      1
			eq?     
			bnt      code_195a
			pushi    #setScript
			pushi    1
			lofsa    timer1fire
			push    
			lofsa    knave
			send     6
			jmp      code_1a60
code_195a:
			pushi    #setScript
			pushi    1
			lofsa    timer2A
			push    
			lofsa    victim
			send     6
			jmp      code_1a60
code_196a:
			dup     
			ldi      5
			eq?     
			bnt      code_19c1
			lsl      local7
			dup     
			ldi      1
			eq?     
			bnt      code_199a
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    66
			pushi    1
			pushi    0
			lofsa    knave2
			send     30
			jmp      code_19bd
code_199a:
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    5
			pushi    1
			pushi    115
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    66
			pushi    1
			pushi    0
			lofsa    knave4
			send     36
code_19bd:
			toss    
			jmp      code_1a60
code_19c1:
			dup     
			ldi      6
			eq?     
			bnt      code_1a06
			pushi    #show
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    292
			pushi    0
			lofsa    fire3
			send     14
			lsl      local7
			dup     
			ldi      3
			eq?     
			bnt      code_19f5
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave2
			send     6
			jmp      code_1a02
code_19f5:
			pushi    #setScript
			pushi    1
			lofsa    timer0
			push    
			lofsa    knave3
			send     6
code_1a02:
			toss    
			jmp      code_1a60
code_1a06:
			dup     
			ldi      7
			eq?     
			bnt      code_1a1d
			pushi    #setScript
			pushi    1
			lofsa    timer4
			push    
			lofsa    robin
			send     6
			jmp      code_1a60
code_1a1d:
			dup     
			ldi      8
			eq?     
			bnt      code_1a4e
			pushi    #setScript
			pushi    1
			lofsa    timer5
			push    
			lofsa    muchm
			send     6
			pushi    #setScript
			pushi    1
			lofsa    liljWalk
			push    
			lofsa    lilj
			send     6
			pushi    #setScript
			pushi    1
			lofsa    willsWalk
			push    
			lofsa    wills
			send     6
			jmp      code_1a60
code_1a4e:
			dup     
			ldi      9
			eq?     
			bnt      code_1a60
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
code_1a60:
			toss    
			ret     
		)
	)
)
