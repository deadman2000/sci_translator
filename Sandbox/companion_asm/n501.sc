;;; Sierra Script 1.0 - (do not remove this comment)
(script# 501)
(include sci.sh)
(use n000)
(use n890)
(use n891)
(use n958)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	jwitchct 0
)

(local
	local0
	[local1 8]
	[local9 8] = [106 118 57 67 188 227 199 35]
	[local17 8] = [55 64 172 146 150 116 125 104]
	[local25 8] = [12 10 10 12 12 12 10 12]
	[local33 8] = [1 0 0 2 1 1 0 2]
	[local41 11] = [0 0 0 0 0 0 1]
	local52
	local53
	local54
	local55
	local56
	local57
	local58
	local59
	local60
)
(instance jwitchct of Rm
	(properties
		style $0008
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    129
			pushi    500
			callk    Load,  4
			pushi    4
			pushi    128
			pushi    393
			pushi    501
			pushi    756
			calle    proc958_0,  8
			pushi    2
			pushi    132
			pushi    120
			calle    proc958_0,  4
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    door
			send     8
			pushi    #init
			pushi    0
			lofsa    robinH
			send     4
			pushi    #init
			pushi    0
			lofsa    marianM
			send     4
			pushi    #init
			pushi    0
			lofsa    fire
			send     4
			pushi    #x
			pushi    1
			pushi    430
			pushi    3
			pushi    1
			pushi    430
			pushi    63
			pushi    1
			pushi    11
			pushi    107
			pushi    0
			lofsa    fire2
			send     22
			ldi      0
			sal      local0
code_007d:
			lsl      local0
			ldi      8
			lt?     
			bnt      code_00af
			pushi    4
			pushi    #superClass
			lal      local0
			lsli     local9
			pushi    3
			pushi    1
			lsli     local17
			pushi    6
			pushi    1
			lsli     local25
			pushi    7
			pushi    1
			lsli     local33
			pushi    #new
			pushi    0
			lofsa    arrow
			send     4
			push    
			lal      local0
			sali     local1
			send     24
			+al      local0
			jmp      code_007d
code_00af:
			pushi    #priority
			pushi    1
			pushi    0
			ldi      4
			lali     local1
			send     6
			pushi    #priority
			pushi    1
			pushi    0
			ldi      5
			lali     local1
			send     6
			pushi    #priority
			pushi    1
			pushi    0
			ldi      6
			lali     local1
			send     6
			lsg      global146
			dup     
			ldi      30
			eq?     
			bnt      code_00dd
			ldi      20
			sal      local60
			jmp      code_00ef
code_00dd:
			dup     
			ldi      40
			eq?     
			bnt      code_00eb
			ldi      20
			sal      local60
			jmp      code_00ef
code_00eb:
			ldi      15
			sal      local60
code_00ef:
			toss    
			lsg      global151
			ldi      0
			eq?     
			bnt      code_0104
			lsg      global160
			ldi      0
			eq?     
			bnt      code_0104
			ldi      20
			sal      local60
code_0104:
			lsg      global151
			ldi      0
			ne?     
			bt       code_0111
			lsg      global160
			ldi      0
			ne?     
code_0111:
			bnt      code_01c3
			pushi    #init
			pushi    0
			lofsa    knave
			send     4
			pushi    #x
			pushi    1
			pushi    460
			pushi    3
			pushi    1
			pushi    460
			pushi    107
			pushi    0
			lofsa    knave2
			send     16
			pushi    #x
			pushi    1
			pushi    450
			pushi    3
			pushi    1
			pushi    450
			pushi    107
			pushi    0
			lofsa    knave3
			send     16
			pushi    #setScript
			pushi    1
			lofsa    kill
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
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local56
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_018e
			lofsa    knave
			sal      local57
			lofsa    knave2
			sal      local58
			lofsa    knave3
			sal      local59
			jmp      code_01b6
code_018e:
			dup     
			ldi      2
			eq?     
			bnt      code_01a7
			lofsa    knave2
			sal      local57
			lofsa    knave3
			sal      local58
			lofsa    knave
			sal      local59
			jmp      code_01b6
code_01a7:
			lofsa    knave3
			sal      local57
			lofsa    knave
			sal      local58
			lofsa    knave2
			sal      local59
code_01b6:
			toss    
			pushi    #setScript
			pushi    1
			lofsa    knavesDie
			push    
			lal      local57
			send     6
code_01c3:
			pushi    #setScript
			pushi    1
			lofsa    marianBurns
			push    
			lofsa    marianM
			send     6
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    fire
			send     6
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    fire2
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    500
			pushi    6
			lag      global2
			send     8
			pushi    #x
			pushi    1
			pushi    147
			pushi    3
			pushi    1
			pushi    102
			lofsa    door
			send     12
			pushi    #x
			pushi    1
			pushi    177
			pushi    3
			pushi    1
			pushi    100
			lofsa    robinH
			send     12
			pushi    #x
			pushi    1
			pushi    117
			pushi    3
			pushi    1
			pushi    118
			lofsa    marianM
			send     12
			pushi    #x
			pushi    1
			pushi    113
			pushi    3
			pushi    1
			pushi    125
			lofsa    fire
			send     12
			pushi    #x
			pushi    1
			pushi    127
			pushi    3
			pushi    1
			pushi    123
			lofsa    fire2
			send     12
			lsg      global151
			ldi      0
			ne?     
			bt       code_0265
			lsg      global160
			ldi      0
			ne?     
code_0265:
			bnt      code_02c8
			pushi    #x
			pushi    1
			pushi    2
			pushi    73
			pushi    83
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    120
			pushi    130
			callk    Random,  4
			push    
			lofsa    knave
			send     12
			pushi    #x
			pushi    1
			pushi    2
			pushi    44
			pushi    54
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    146
			pushi    156
			callk    Random,  4
			push    
			lofsa    knave2
			send     12
			pushi    #x
			pushi    1
			pushi    2
			pushi    176
			pushi    186
			callk    Random,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pushi    120
			pushi    130
			callk    Random,  4
			push    
			lofsa    knave3
			send     12
			jmp      code_02ff
code_02c8:
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    133
			pushi    3
			pushi    1
			pushi    106
			pushi    285
			pushi    0
			lofsa    killer
			send     26
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    210
			pushi    3
			pushi    1
			pushi    108
			pushi    285
			pushi    0
			lofsa    killer2
			send     26
code_02ff:
			pushi    #setScript
			pushi    1
			lofsa    musicScript
			push    
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			ldi      0
			sal      local0
code_0310:
			lsl      local0
			ldi      8
			lt?     
			bnt      code_0334
			pushi    1
			lal      local0
			lsli     local1
			callk    IsObject,  2
			bnt      code_032f
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lal      local0
			lali     local1
			send     8
code_032f:
			+al      local0
			jmp      code_0310
code_0334:
			pushi    #dispose
			pushi    0
			lofsa    fireSound
			send     4
			pushi    1
			pushi    168
			callb    proc0_5,  2
			bnt      code_034c
			pushi    1
			pushi    61
			callb    proc0_6,  2
code_034c:
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance robinH of Actor
	(properties
		x 500
		y 500
		view 501
		loop 1
	)
)

(instance robinsHead of Prop
	(properties
		x 225
		y 82
		view 756
		loop 8
		priority 12
		signal $0010
	)
)

(instance killer of Actor
	(properties
		x 600
		y 600
		view 756
		loop 1
	)
)

(instance killer2 of Actor
	(properties
		view 756
		loop 1
	)
)

(instance arrow of View
	(properties
		view 756
		loop 9
		priority 11
		signal $4011
	)
)

(instance door of Prop
	(properties
		x 575
		y 575
		view 501
		loop 10
		priority 6
		signal $4011
	)
)

(instance marianM of Prop
	(properties
		x 510
		y 510
		view 501
		loop 3
		priority 11
		signal $0010
	)
)

(instance fire of Prop
	(properties
		x 550
		y 550
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance fire2 of Prop
	(properties
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance fireA of Prop
	(properties
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance fireB of Prop
	(properties
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance fireD of Prop
	(properties
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance fireE of Prop
	(properties
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance fireF of Prop
	(properties
		view 501
		loop 2
		priority 12
		signal $0010
	)
)

(instance knave of Prop
	(properties
		x 470
		y 470
		sightAngle 90
		view 393
		loop 1
		signal $4000
	)
)

(instance knave2 of Prop
	(properties
		sightAngle 90
		view 393
		loop 1
		signal $4000
	)
)

(instance knave3 of Prop
	(properties
		sightAngle 90
		view 393
		loop 1
		signal $4000
	)
)

(instance marianBurns of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ac7
			pushi    #cel
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    marianM
			send     18
			jmp      code_0bbb
code_0ac7:
			dup     
			ldi      1
			eq?     
			bnt      code_0ae0
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local56
			push    
			ldi      12
			mul     
			aTop     ticks
			jmp      code_0bbb
code_0ae0:
			dup     
			ldi      2
			eq?     
			bnt      code_0af7
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marianM
			send     8
			jmp      code_0bbb
code_0af7:
			dup     
			ldi      3
			eq?     
			bnt      code_0b10
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local56
			push    
			ldi      12
			mul     
			aTop     ticks
			jmp      code_0bbb
code_0b10:
			dup     
			ldi      4
			eq?     
			bnt      code_0b2b
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    5
			pushi    1
			pushSelf
			lofsa    marianM
			send     12
			jmp      code_0bbb
code_0b2b:
			dup     
			ldi      5
			eq?     
			bnt      code_0b45
			pushi    2
			pushi    4
			pushi    9
			callk    Random,  4
			sal      local56
			push    
			ldi      12
			mul     
			aTop     ticks
			jmp      code_0bbb
code_0b45:
			dup     
			ldi      6
			eq?     
			bnt      code_0b60
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    65535
			pushSelf
			lofsa    marianM
			send     12
			jmp      code_0bbb
code_0b60:
			dup     
			ldi      7
			eq?     
			bnt      code_0b79
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local56
			push    
			ldi      12
			mul     
			aTop     ticks
			jmp      code_0bbb
code_0b79:
			dup     
			ldi      8
			eq?     
			bnt      code_0b90
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marianM
			send     8
			jmp      code_0bbb
code_0b90:
			dup     
			ldi      9
			eq?     
			bnt      code_0baf
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local56
			ldi      65535
			aTop     state
			lsl      local56
			ldi      12
			mul     
			aTop     ticks
			jmp      code_0bbb
code_0baf:
			dup     
			ldi      10
			eq?     
			bnt      code_0bbb
			pushi    #dispose
			pushi    0
			self     4
code_0bbb:
			toss    
			ret     
		)
	)
)

(instance knavesDie of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c2f
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      7
			lali     local1
			send     8
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
			lal      local57
			send     26
			jmp      code_0d34
code_0c2f:
			dup     
			ldi      1
			eq?     
			bnt      code_0c5e
			pushi    #stopUpd
			pushi    0
			lal      local57
			send     4
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      1
			lali     local1
			send     8
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			sal      local52
			push    
			ldi      20
			mul     
			aTop     ticks
			jmp      code_0d34
code_0c5e:
			dup     
			ldi      2
			eq?     
			bnt      code_0ca1
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      6
			lali     local1
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      0
			lali     local1
			send     8
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    6
			pushi    1
			pushi    2
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
			lal      local58
			send     32
			jmp      code_0d34
code_0ca1:
			dup     
			ldi      3
			eq?     
			bnt      code_0ccf
			pushi    #stopUpd
			pushi    0
			lal      local58
			send     4
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      4
			lali     local1
			send     8
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local52
			push    
			ldi      10
			mul     
			aTop     ticks
			jmp      code_0d34
code_0ccf:
			dup     
			ldi      4
			eq?     
			bnt      code_0d13
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      3
			lali     local1
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      5
			lali     local1
			send     8
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    6
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
			lal      local59
			send     32
			jmp      code_0d34
code_0d13:
			dup     
			ldi      5
			eq?     
			bnt      code_0d34
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			ldi      2
			lali     local1
			send     8
			pushi    #stopUpd
			pushi    0
			lal      local59
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0d34:
			toss    
			ret     
		)
	)
)

(instance openSesame of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0da4
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    robinH
			send     12
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    door
			send     14
			jmp      code_1146
code_0da4:
			dup     
			ldi      1
			eq?     
			bnt      code_0e02
			pushi    #stopUpd
			pushi    0
			lofsa    door
			send     4
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    5
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    183
			pushi    3
			pushi    1
			pushi    98
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    145
			pushi    116
			pushSelf
			lofsa    robinH
			send     60
			jmp      code_1146
code_0e02:
			dup     
			ldi      2
			eq?     
			bnt      code_0e78
			pushi    1
			pushi    168
			callb    proc0_5,  2
			not     
			bnt      code_0e48
			pushi    #x
			pushi    1
			pushi    115
			pushi    3
			pushi    1
			pushi    112
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireD
			send     22
			pushi    #start
			pushi    1
			pushi    3
			lofsa    ignisMortis
			send     6
			pushi    #setScript
			pushi    1
			lofsa    ignisMortis
			push    
			lofsa    robinH
			send     6
			jmp      code_1146
code_0e48:
			pushi    #view
			pushi    1
			pushi    501
			pushi    6
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    4
			pushi    1
			pushi    142
			pushi    3
			pushi    1
			pushi    117
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     44
			jmp      code_1146
code_0e78:
			dup     
			ldi      3
			eq?     
			bnt      code_0ee7
			pushi    #number
			pushi    1
			pushi    506
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			pushi    158
			pushi    1
			pushi    1
			lag      global168
			send     22
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    2
			pushi    219
			pushi    1
			pushi    6
			pushi    63
			pushi    1
			pushi    11
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
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    114
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    146
			pushi    121
			pushSelf
			lofsa    robinH
			send     66
			jmp      code_1146
code_0ee7:
			dup     
			ldi      4
			eq?     
			bnt      code_0f03
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			lofsa    robinH
			send     12
			ldi      6
			aTop     ticks
			jmp      code_1146
code_0f03:
			dup     
			ldi      5
			eq?     
			bnt      code_0f3a
			pushi    #view
			pushi    1
			pushi    501
			pushi    6
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    132
			pushi    3
			pushi    1
			pushi    126
			pushi    219
			pushi    1
			pushi    18
			lofsa    robinH
			send     30
			pushi    #dispose
			pushi    0
			lofsa    marianM
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1146
code_0f3a:
			dup     
			ldi      6
			eq?     
			bnt      code_0f51
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     8
			jmp      code_1146
code_0f51:
			dup     
			ldi      7
			eq?     
			bnt      code_0f68
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinH
			send     6
			ldi      24
			aTop     ticks
			jmp      code_1146
code_0f68:
			dup     
			ldi      8
			eq?     
			bnt      code_0f7f
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    robinH
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1146
code_0f7f:
			dup     
			ldi      9
			eq?     
			bnt      code_0f96
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinH
			send     6
			ldi      24
			aTop     ticks
			jmp      code_1146
code_0f96:
			dup     
			ldi      10
			eq?     
			bnt      code_0fad
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    robinH
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1146
code_0fad:
			dup     
			ldi      11
			eq?     
			bnt      code_0fc4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    robinH
			send     8
			jmp      code_1146
code_0fc4:
			dup     
			ldi      12
			eq?     
			bnt      code_1005
			pushi    219
			pushi    #superClass
			pushi    6
			dup     
			pushi    1
			pushi    7
			pushi    63
			pushi    1
			pushi    15
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
			pushi    4
			pushi    1
			pushi    132
			pushi    3
			pushi    1
			pushi    124
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     44
			jmp      code_1146
code_1005:
			dup     
			ldi      13
			eq?     
			bnt      code_1047
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    3
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    126
			pushi    3
			pushi    1
			pushi    131
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     44
			jmp      code_1146
code_1047:
			dup     
			ldi      14
			eq?     
			bnt      code_1086
			pushi    6
			pushi    #superClass
			pushi    2
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    3
			pushi    1
			pushi    136
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    125
			pushi    151
			pushSelf
			lofsa    robinH
			send     36
			jmp      code_1146
code_1086:
			dup     
			ldi      15
			eq?     
			bnt      code_10c9
			pushi    5
			pushi    #superClass
			pushi    501
			pushi    6
			pushi    1
			pushi    9
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    128
			pushi    3
			pushi    1
			pushi    159
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     44
			jmp      code_1146
code_10c9:
			dup     
			ldi      16
			eq?     
			bnt      code_112f
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    2
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    130
			pushi    3
			pushi    1
			pushi    161
			pushi    54
			pushi    1
			pushi    6
			pushi    55
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    249
			pushSelf
			lofsa    robinH
			send     72
			pushi    #release
			pushi    0
			lag      global168
			send     4
			jmp      code_1146
code_112f:
			dup     
			ldi      17
			eq?     
			bnt      code_1146
			pushi    #newRoom
			pushi    1
			pushi    179
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1146:
			toss    
			ret     
		)
	)
)

(instance ignisMortis of Script
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
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    robinH
			send     12
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    door
			send     14
			jmp      code_1498
code_11b6:
			dup     
			ldi      1
			eq?     
			bnt      code_11dd
			pushi    #x
			pushi    1
			pushi    115
			pushi    3
			pushi    1
			pushi    112
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireD
			send     22
			ldi      6
			aTop     ticks
			jmp      code_1498
code_11dd:
			dup     
			ldi      2
			eq?     
			bnt      code_1232
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    7
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    183
			pushi    3
			pushi    1
			pushi    98
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    145
			pushi    116
			pushSelf
			lofsa    robinH
			send     60
			jmp      code_1498
code_1232:
			dup     
			ldi      3
			eq?     
			bnt      code_1269
			pushi    #view
			pushi    1
			pushi    501
			pushi    6
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    12
			pushi    4
			pushi    1
			pushi    142
			pushi    3
			pushi    1
			pushi    117
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     44
			jmp      code_1498
code_1269:
			dup     
			ldi      4
			eq?     
			bnt      code_129a
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    marianM
			send     6
			pushi    #x
			pushi    1
			pushi    121
			pushi    3
			pushi    1
			pushi    105
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireE
			send     22
			ldi      18
			aTop     ticks
			jmp      code_1498
code_129a:
			dup     
			ldi      5
			eq?     
			bnt      code_12e3
			pushi    #number
			pushi    1
			pushi    507
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global168
			send     16
			pushi    #number
			pushi    1
			pushi    931
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #x
			pushi    1
			pushi    125
			pushi    3
			pushi    1
			pushi    110
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireF
			send     22
			ldi      6
			aTop     ticks
			jmp      code_1498
code_12e3:
			dup     
			ldi      6
			eq?     
			bnt      code_133c
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    2
			pushi    219
			pushi    1
			pushi    6
			pushi    63
			pushi    1
			pushi    11
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
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    114
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    140
			pushi    121
			pushSelf
			lofsa    robinH
			send     66
			jmp      code_1498
code_133c:
			dup     
			ldi      7
			eq?     
			bnt      code_1358
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			lofsa    robinH
			send     12
			ldi      6
			aTop     ticks
			jmp      code_1498
code_1358:
			dup     
			ldi      8
			eq?     
			bnt      code_1393
			pushi    #view
			pushi    1
			pushi    501
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    2
			lofsa    robinH
			send     18
			pushi    #x
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    107
			dup     
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireA
			send     22
			ldi      12
			aTop     ticks
			jmp      code_1498
code_1393:
			dup     
			ldi      9
			eq?     
			bnt      code_13ab
			pushi    #cel
			pushi    1
			pushi    3
			lofsa    robinH
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1498
code_13ab:
			dup     
			ldi      10
			eq?     
			bnt      code_13dd
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    robinH
			send     6
			pushi    #x
			pushi    1
			pushi    146
			pushi    3
			pushi    1
			pushi    97
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireB
			send     22
			ldi      18
			aTop     ticks
			jmp      code_1498
code_13dd:
			dup     
			ldi      11
			eq?     
			bnt      code_13f5
			pushi    #cel
			pushi    1
			pushi    3
			lofsa    robinH
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1498
code_13f5:
			dup     
			ldi      12
			eq?     
			bnt      code_140d
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    robinH
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1498
code_140d:
			dup     
			ldi      13
			eq?     
			bnt      code_1445
			pushi    #cel
			pushi    1
			pushi    5
			lofsa    robinH
			send     6
			pushi    #x
			pushi    1
			pushi    142
			pushi    3
			pushi    1
			pushi    114
			lofsa    fireA
			send     12
			pushi    #x
			pushi    1
			pushi    146
			pushi    3
			pushi    1
			pushi    106
			lofsa    fireB
			send     12
			ldi      12
			aTop     ticks
			jmp      code_1498
code_1445:
			dup     
			ldi      14
			eq?     
			bnt      code_147d
			pushi    #cel
			pushi    1
			pushi    6
			lofsa    robinH
			send     6
			pushi    #x
			pushi    1
			pushi    139
			pushi    3
			pushi    1
			pushi    115
			lofsa    fireA
			send     12
			pushi    #x
			pushi    1
			pushi    146
			pushi    3
			pushi    1
			pushi    118
			lofsa    fireB
			send     12
			ldi      60
			aTop     ticks
			jmp      code_1498
code_147d:
			dup     
			ldi      15
			eq?     
			bnt      code_1498
			ldi      37
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1498:
			toss    
			ret     
		)
	)
)

(instance fromTheGate of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1530
			pushi    5
			pushi    #superClass
			pushi    756
			pushi    6
			pushi    1
			pushi    6
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lofsa    robinH
			send     4
			push    
			ldi      2048
			or      
			push    
			pushi    4
			pushi    1
			pushi    206
			pushi    3
			pushi    1
			pushi    204
			pushi    150
			pushi    3
			class    FuzzyStop
			push    
			lea      @local41
			push    
			pushSelf
			pushi    283
			pushi    7
			class    SlowDown
			push    
			pushi    224
			pushi    124
			pushi    0
			pushi    12
			dup     
			pushi    4
			lofsa    robinH
			send     58
			jmp      code_169d
code_1530:
			dup     
			ldi      1
			eq?     
			bnt      code_153e
			ldi      60
			aTop     ticks
			jmp      code_169d
code_153e:
			dup     
			ldi      2
			eq?     
			bnt      code_1558
			pushi    #cel
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    robinsHead
			send     10
			ldi      18
			aTop     ticks
			jmp      code_169d
code_1558:
			dup     
			ldi      3
			eq?     
			bnt      code_156f
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    robinsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_169d
code_156f:
			dup     
			ldi      4
			eq?     
			bnt      code_1587
			pushi    #cel
			pushi    1
			pushi    3
			lofsa    robinsHead
			send     6
			ldi      18
			aTop     ticks
			jmp      code_169d
code_1587:
			dup     
			ldi      5
			eq?     
			bnt      code_159e
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    robinsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_169d
code_159e:
			dup     
			ldi      6
			eq?     
			bnt      code_15b5
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsHead
			send     6
			ldi      18
			aTop     ticks
			jmp      code_169d
code_15b5:
			dup     
			ldi      7
			eq?     
			bnt      code_15cc
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    robinsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_169d
code_15cc:
			dup     
			ldi      8
			eq?     
			bnt      code_15e4
			pushi    #cel
			pushi    1
			pushi    3
			lofsa    robinsHead
			send     6
			ldi      18
			aTop     ticks
			jmp      code_169d
code_15e4:
			dup     
			ldi      9
			eq?     
			bnt      code_162d
			pushi    #dispose
			pushi    0
			lofsa    robinsHead
			send     4
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    225
			pushi    3
			pushi    1
			pushi    120
			pushi    54
			pushi    1
			pushi    6
			pushi    55
			pushi    1
			pushi    4
			pushi    219
			pushi    1
			pushi    6
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    145
			pushi    116
			pushSelf
			lofsa    robinH
			send     54
			jmp      code_169d
code_162d:
			dup     
			ldi      10
			eq?     
			bnt      code_1691
			pushi    1
			pushi    168
			callb    proc0_5,  2
			not     
			bnt      code_1673
			pushi    #x
			pushi    1
			pushi    115
			pushi    3
			pushi    1
			pushi    112
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fireD
			send     22
			pushi    #start
			pushi    1
			pushi    3
			lofsa    ignisMortis
			send     6
			pushi    #setScript
			pushi    1
			lofsa    ignisMortis
			push    
			lofsa    robinH
			send     6
			jmp      code_168a
code_1673:
			pushi    #start
			pushi    1
			pushi    2
			lofsa    openSesame
			send     6
			pushi    #setScript
			pushi    1
			lofsa    openSesame
			push    
			lofsa    robinH
			send     6
code_168a:
			ldi      6
			aTop     ticks
			jmp      code_169d
code_1691:
			dup     
			ldi      11
			eq?     
			bnt      code_169d
			pushi    #dispose
			pushi    0
			self     4
code_169d:
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
			bnt      code_16ff
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
			jmp      code_172a
code_16ff:
			dup     
			ldi      1
			eq?     
			bnt      code_171e
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
			sal      local53
			ldi      65535
			aTop     state
			lsl      local53
			ldi      10
			mul     
			aTop     ticks
			jmp      code_172a
code_171e:
			dup     
			ldi      2
			eq?     
			bnt      code_172a
			pushi    #dispose
			pushi    0
			self     4
code_172a:
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
			bnt      code_178b
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
			jmp      code_17b6
code_178b:
			dup     
			ldi      1
			eq?     
			bnt      code_17aa
			pushi    2
			pushi    7
			pushi    10
			callk    Random,  4
			sal      local54
			ldi      65535
			aTop     state
			lsl      local54
			ldi      10
			mul     
			aTop     ticks
			jmp      code_17b6
code_17aa:
			dup     
			ldi      2
			eq?     
			bnt      code_17b6
			pushi    #dispose
			pushi    0
			self     4
code_17b6:
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
			bnt      code_1811
			pushi    2
			pushi    5
			pushi    9
			callk    Random,  4
			sal      local55
			push    
			ldi      10
			mul     
			aTop     ticks
			jmp      code_184f
code_1811:
			dup     
			ldi      1
			eq?     
			bnt      code_1831
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
			jmp      code_184f
code_1831:
			dup     
			ldi      2
			eq?     
			bnt      code_1843
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
			jmp      code_184f
code_1843:
			dup     
			ldi      3
			eq?     
			bnt      code_184f
			pushi    #dispose
			pushi    0
			self     4
code_184f:
			toss    
			ret     
		)
	)
)

(instance suddenDeath of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18ca
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    289
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    robinH
			send     18
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    66
			pushi    1
			pushi    8
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    door
			send     20
			jmp      code_19b6
code_18ca:
			dup     
			ldi      1
			eq?     
			bnt      code_18f2
			pushi    #view
			pushi    1
			pushi    756
			pushi    162
			pushi    1
			pushi    5
			pushi    66
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    0
			lofsa    robinH
			send     24
			ldi      6
			aTop     ticks
			jmp      code_19b6
code_18f2:
			dup     
			ldi      2
			eq?     
			bnt      code_193f
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    142
			pushi    119
			pushSelf
			lofsa    robinH
			send     24
			pushi    #setLoop
			pushi    1
			pushi    0
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
			pushi    123
			pushi    116
			pushSelf
			lofsa    killer
			send     30
			jmp      code_19b6
code_193f:
			dup     
			ldi      3
			eq?     
			bnt      code_1953
			pushi    #setLoop
			pushi    1
			pushi    0
			lofsa    killer2
			send     6
			jmp      code_19b6
code_1953:
			dup     
			ldi      4
			eq?     
			bnt      code_1978
			pushi    #x
			pushi    1
			pushi    125
			pushi    3
			pushi    1
			pushi    117
			pushi    6
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    killer
			send     26
			jmp      code_19b6
code_1978:
			dup     
			ldi      5
			eq?     
			bnt      code_199b
			pushi    #view
			pushi    1
			pushi    501
			pushi    162
			pushi    1
			pushi    4
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     20
			jmp      code_19b6
code_199b:
			dup     
			ldi      6
			eq?     
			bnt      code_19b6
			ldi      26
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_19b6:
			toss    
			ret     
		)
	)
)

(instance musicScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a18
			pushi    #number
			pushi    1
			pushi    505
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global168
			send     16
			ldi      360
			aTop     ticks
			jmp      code_1a66
code_1a18:
			dup     
			ldi      1
			eq?     
			bnt      code_1a66
			lsl      local60
			dup     
			ldi      15
			eq?     
			bnt      code_1a38
			pushi    #setScript
			pushi    1
			lofsa    fromTheGate
			push    
			lofsa    robinH
			send     6
			jmp      code_1a65
code_1a38:
			lsg      global151
			ldi      0
			eq?     
			bnt      code_1a58
			lsg      global160
			ldi      0
			eq?     
			bnt      code_1a58
			pushi    #setScript
			pushi    1
			lofsa    suddenDeath
			push    
			lofsa    robinH
			send     6
			jmp      code_1a65
code_1a58:
			pushi    #setScript
			pushi    1
			lofsa    openSesame
			push    
			lofsa    robinH
			send     6
code_1a65:
			toss    
code_1a66:
			toss    
			ret     
		)
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 501
		loop -1
	)
)
