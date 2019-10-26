;;; Sierra Script 1.0 - (do not remove this comment)
(script# 422)
(include sci.sh)
(use n000)
(use n851)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	hanging 0
)

(local
	[local0 9] = [59 0 2 4 21 32 20 23 31]
	[local9 9] = [1420 142 1 1 2 1 1 1]
)
(instance hanging of Rm
	(properties
		picture 420
		style $800a
	)
	
	(method (init param1)
		(asm
			pushi    2
			pushi    129
			pushi    420
			calle    proc958_0,  4
			pushi    6
			pushi    128
			pushi    420
			pushi    423
			pushi    425
			pushi    422
			pushi    59
			calle    proc958_0,  12
			pushi    2
			pushi    132
			pushi    7
			calle    proc958_0,  4
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
			pushi    #number
			pushi    1
			pushi    7
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
			pushi    #init
			pushi    0
			lofsa    scribe
			send     4
			pushi    #init
			pushi    0
			lofsa    robinH
			send     4
			pushi    #init
			pushi    0
			lofsa    kingRichie
			send     4
			pushi    #setScript
			pushi    1
			lofsa    dieScum
			push    
			lag      global2
			send     6
			pushi    #add
			pushi    12
			lofsa    guardR
			push    
			lofsa    guardL
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
			send     38
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ret     
		)
	)
)

(instance robinH of Prop
	(properties
		x 163
		y 145
		view 420
		loop 10
		priority 9
		signal $0010
	)
)

(instance guardR of PicView
	(properties
		x 180
		y 164
		view 420
		loop 9
		priority 10
		signal $0010
	)
)

(instance guardL of PicView
	(properties
		x 131
		y 146
		view 420
		loop 9
		priority 9
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

(instance fulkie of PicView
	(properties
		x 228
		y 111
		view 423
		loop 10
		priority 0
		signal $0010
	)
)

(instance sheriff of PicView
	(properties
		x 128
		y 119
		view 425
		priority 7
		signal $0010
	)
)

(instance abbot of PicView
	(properties
		x 146
		y 117
		view 425
		cel 1
		priority 7
		signal $0010
	)
)

(instance prior of PicView
	(properties
		x 255
		y 137
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
		x 205
		y 116
		view 422
		loop 1
		priority 7
		signal $0010
	)
)

(instance dieScum of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05d8
			ldi      180
			aTop     ticks
			jmp      code_064b
code_05d8:
			dup     
			ldi      1
			eq?     
			bnt      code_05f5
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
			jmp      code_064b
code_05f5:
			dup     
			ldi      2
			eq?     
			bnt      code_0615
			pushi    7
			pushi    2
			lea      @local9
			push    
			lea      @local0
			push    
			pushi    3
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_064b
code_0615:
			dup     
			ldi      3
			eq?     
			bnt      code_0634
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      180
			aTop     ticks
			jmp      code_064b
code_0634:
			dup     
			ldi      4
			eq?     
			bnt      code_064b
			pushi    #newRoom
			pushi    1
			pushi    801
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_064b:
			toss    
			ret     
		)
	)
)
