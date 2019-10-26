;;; Sierra Script 1.0 - (do not remove this comment)
(script# 175)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n994)
(use n998)
(use n999)

(public
	muchswobat 0
)

(local
	local0
)
(instance muchswobat of Rm
	(properties
		style $0008
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    129
			pushi    110
			callk    Load,  4
			pushi    8
			pushi    128
			pushi    1
			pushi    80
			pushi    152
			pushi    155
			pushi    158
			pushi    161
			pushi    164
			calle    proc958_0,  16
			pushi    1
			pushi    132
			calle    proc958_0,  2
			pushi    #drawPic
			pushi    2
			pushi    110
			pushi    6
			lag      global2
			send     8
			pushi    #add
			pushi    2
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
			send     18
			pushi    #init
			pushi    0
			lofsa    robinh
			send     4
			pushi    #init
			pushi    0
			lofsa    lilj
			send     4
			pushi    #init
			pushi    0
			lofsa    aland
			send     4
			pushi    #init
			pushi    0
			lofsa    wills
			send     4
			pushi    #init
			pushi    0
			lofsa    muchm
			send     4
			pushi    #init
			pushi    0
			lofsa    friart
			send     4
			pushi    #init
			pushi    0
			lofsa    robinHead
			send     4
			pushi    #setScript
			pushi    1
			lofsa    lookSee
			push    
			lofsa    robinHead
			send     6
			pushi    #setScript
			pushi    1
			lofsa    whatNoBattle
			push    
			self     6
			pushi    #init
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance frieze1 of PicView
	(properties
		x 31
		y 189
		sightAngle 90
		view 80
		priority 15
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 1391
		sightAngle 90
		lookStr 1414
		view 80
		cel 1
		priority 15
	)
)

(instance robinh of View
	(properties
		x 154
		y 156
		view 1
		loop 6
		priority 15
		signal $0010
	)
)

(instance lilj of View
	(properties
		x 125
		y 205
		view 152
		loop 3
		priority 15
		signal $0010
	)
)

(instance friart of View
	(properties
		x 77
		y 149
		view 155
	)
)

(instance aland of View
	(properties
		x 251
		y 179
		view 158
		loop 1
	)
)

(instance wills of View
	(properties
		x 211
		y 189
		view 161
		loop 1
	)
)

(instance muchm of View
	(properties
		x 73
		y 215
		view 164
		loop 3
	)
)

(instance robinHead of Prop
	(properties
		x 154
		y 117
		view 1
		loop 8
		priority 15
		signal $0010
	)
)

(instance lookSee of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0443
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinHead
			send     6
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
			sal      local0
			push    
			ldi      48
			mul     
			aTop     ticks
			jmp      code_0475
code_0443:
			dup     
			ldi      1
			eq?     
			bnt      code_0465
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    robinHead
			send     6
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local0
			push    
			ldi      48
			mul     
			aTop     ticks
			jmp      code_0475
code_0465:
			dup     
			ldi      2
			eq?     
			bnt      code_0475
			ldi      65535
			aTop     state
			ldi      128
			aTop     ticks
code_0475:
			toss    
			ret     
		)
	)
)

(instance whatNoBattle of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04dd
			pushi    1
			pushi    3
			calle    proc13_6,  2
			pushi    5
			pushi    175
			pushi    0
			pushSelf
			pushi    80
			lofsa    {Friar Tuck}
			push    
			calle    proc13_4,  10
			ldi      8
			aTop     seconds
			jmp      code_051f
code_04dd:
			dup     
			ldi      1
			eq?     
			bnt      code_0502
			pushi    1
			pushi    1
			calle    proc13_6,  2
			pushi    5
			pushi    175
			pushi    1
			pushSelf
			pushi    80
			lofsa    {Little John}
			push    
			calle    proc13_4,  10
			ldi      10
			aTop     seconds
			jmp      code_051f
code_0502:
			dup     
			ldi      2
			eq?     
			bnt      code_051f
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_051f:
			toss    
			ret     
		)
	)
)
