;;; Sierra Script 1.0 - (do not remove this comment)
(script# 801)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	troub 0
)

(local
	[local0 2]
)
(instance troub of Rm
	(properties
		style $800a
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    8
			pushi    129
			pushi    800
			pushi    830
			pushi    835
			pushi    840
			pushi    845
			pushi    850
			pushi    803
			calle    proc958_0,  16
			pushi    5
			pushi    128
			pushi    800
			pushi    835
			pushi    850
			pushi    840
			calle    proc958_0,  10
			pushi    4
			pushi    132
			pushi    2
			pushi    3
			pushi    4
			calle    proc958_0,  8
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
			pushi    0
			callb    proc0_3,  0
			ldi      0
			sag      global156
			ldi      0
			sag      global151
			lsg      global12
			ldi      422
			ne?     
			bnt      code_020a
			pushi    #drawPic
			pushi    2
			pushi    800
			pushi    32778
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
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_00d9
			lsg      global156
			ldi      2000
			add     
			sag      global156
code_00d9:
			pushi    1
			pushi    49
			callb    proc0_5,  2
			bnt      code_00ff
			pushi    1
			pushi    151
			callb    proc0_5,  2
			bnt      code_00f7
			lsg      global156
			ldi      500
			add     
			sag      global156
			jmp      code_00ff
code_00f7:
			lsg      global156
			ldi      500
			sub     
			sag      global156
code_00ff:
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_0125
			pushi    1
			pushi    152
			callb    proc0_5,  2
			bnt      code_011d
			lsg      global156
			ldi      500
			add     
			sag      global156
			jmp      code_0125
code_011d:
			lsg      global156
			ldi      500
			sub     
			sag      global156
code_0125:
			pushi    1
			pushi    174
			callb    proc0_5,  2
			bnt      code_013a
			lsg      global156
			ldi      500
			add     
			sag      global156
			jmp      code_0142
code_013a:
			lsg      global156
			ldi      500
			sub     
			sag      global156
code_0142:
			pushi    1
			pushi    173
			callb    proc0_5,  2
			bnt      code_0157
			lsg      global156
			ldi      500
			add     
			sag      global156
			jmp      code_015f
code_0157:
			lsg      global156
			ldi      500
			sub     
			sag      global156
code_015f:
			lsg      global156
			pushi    30
			lsg      global138
			ldi      9
			sub     
			mul     
			add     
			sag      global156
			lsg      global146
			ldi      5000
			ult?    
			bnt      code_019b
			lsg      global156
			ldi      2500
			lt?     
			bt       code_0191
			lsg      global146
			ldi      1000
			ult?    
			bt       code_0191
			lsg      global156
			lag      global146
			add     
			push    
			ldi      5000
			lt?     
code_0191:
			bnt      code_019b
			ldi      40
			sag      global151
			jmp      code_01fd
code_019b:
			lsg      global156
			ldi      3680
			lt?     
			bt       code_01c6
			lsg      global146
			ldi      51000
			ult?    
			bnt      code_01b3
			pushi    1
			pushi    65
			callb    proc0_5,  2
code_01b3:
			bt       code_01c6
			lsg      global146
			ldi      15300
			ult?    
			bnt      code_01d0
			pushi    1
			pushi    65
			callb    proc0_5,  2
			not     
code_01c6:
			bnt      code_01d0
			ldi      30
			sag      global151
			jmp      code_01fd
code_01d0:
			lsg      global156
			ldi      4250
			lt?     
			bt       code_01df
			lsg      global146
			ldi      61000
			ult?    
code_01df:
			bnt      code_01f9
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_01f2
			ldi      20
			sag      global151
			jmp      code_01fd
code_01f2:
			ldi      30
			sag      global151
			jmp      code_01fd
code_01f9:
			ldi      10
			sag      global151
code_01fd:
			pushi    #setScript
			pushi    1
			lofsa    bardsTheme
			push    
			self     6
			jmp      code_027b
code_020a:
			pushi    #drawPic
			pushi    2
			pushi    840
			pushi    32778
			lag      global2
			send     8
			pushi    #init
			pushi    0
			lofsa    robinH
			send     4
			pushi    #init
			pushi    0
			lofsa    soldier
			send     4
			pushi    #init
			pushi    0
			lofsa    hangman
			send     4
			pushi    #init
			pushi    0
			lofsa    sheriffsPate
			send     4
			pushi    #init
			pushi    0
			lofsa    sheriffsKnuckles
			send     4
			pushi    #add
			pushi    2
			lofsa    johnnieHangs
			push    
			lofsa    tuckieHangs
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     18
			pushi    #setScript
			pushi    1
			lofsa    dieScum
			push    
			self     6
			pushi    #setScript
			pushi    1
			lofsa    fret
			push    
			lofsa    sheriffsPate
			send     6
			pushi    #setScript
			pushi    1
			lofsa    drum
			push    
			lofsa    sheriffsKnuckles
			send     6
code_027b:
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

(instance baddie1 of Prop
	(properties
		x 16
		y 88
		view 835
		priority 12
		signal $0010
	)
)

(instance baddie2 of Prop
	(properties
		x 242
		y 92
		view 835
		loop 1
		priority 12
		signal $0010
	)
)

(instance baddie3 of Prop
	(properties
		x 158
		y 45
		view 835
		loop 3
		priority 12
		signal $0010
	)
)

(instance baddie4 of Prop
	(properties
		x 236
		y 67
		view 835
		loop 4
		priority 12
		signal $0010
	)
)

(instance tuckie of Prop
	(properties
		x 200
		y 18
		view 835
		loop 2
		priority 12
		signal $0010
	)
)

(instance sheriffsHead of Prop
	(properties
		x 91
		y 57
		view 850
	)
)

(instance sheriffsHand of Prop
	(properties
		x 94
		y 62
		view 850
		loop 1
	)
)

(instance robinsHead of Prop
	(properties
		x 187
		y 51
		view 850
		loop 2
	)
)

(instance robinsRightHand of Prop
	(properties
		x 153
		y 64
		view 850
		loop 3
	)
)

(instance robinsLeftHand of Prop
	(properties
		x 208
		y 51
		view 850
		loop 4
	)
)

(instance kingsHead of Prop
	(properties
		x 258
		y 63
		view 850
		loop 5
	)
)

(instance soldier of Prop
	(properties
		x 155
		y 140
		view 840
		loop 1
		priority 10
		signal $0010
	)
)

(instance hangman of Prop
	(properties
		x 177
		y 84
		view 840
		loop 3
		signal $0010
	)
)

(instance sheriffsPate of Prop
	(properties
		x 64
		y 113
		view 840
		loop 2
		priority 7
		signal $0010
	)
)

(instance sheriffsKnuckles of Prop
	(properties
		x 57
		y 170
		view 840
		priority 13
		signal $0010
	)
)

(instance robinH of Actor
	(properties
		x 196
		y 48
		view 840
		loop 4
		priority 1
		signal $0010
	)
)

(instance johnnieHangs of PicView
	(properties
		x 204
		y 164
		view 840
		loop 6
		priority 12
		signal $0010
	)
)

(instance tuckieHangs of PicView
	(properties
		x 228
		y 158
		view 840
		loop 5
		priority 11
		signal $0010
	)
)

(instance swinger of View
	(properties
		x 150
		y 65
		view 840
		loop 7
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
			bnt      code_0b73
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0ca3
code_0b73:
			dup     
			ldi      1
			eq?     
			bnt      code_0b88
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0ca3
code_0b88:
			dup     
			ldi      2
			eq?     
			bnt      code_0b9e
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0ca3
code_0b9e:
			dup     
			ldi      3
			eq?     
			bnt      code_0bb3
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0ca3
code_0bb3:
			dup     
			ldi      4
			eq?     
			bnt      code_0bc9
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0ca3
code_0bc9:
			dup     
			ldi      5
			eq?     
			bnt      code_0bde
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0ca3
code_0bde:
			dup     
			ldi      6
			eq?     
			bnt      code_0bf4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0ca3
code_0bf4:
			dup     
			ldi      7
			eq?     
			bnt      code_0c09
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0ca3
code_0c09:
			dup     
			ldi      8
			eq?     
			bnt      code_0c1f
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0ca3
code_0c1f:
			dup     
			ldi      9
			eq?     
			bnt      code_0c34
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0ca3
code_0c34:
			dup     
			ldi      10
			eq?     
			bnt      code_0c4a
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0ca3
code_0c4a:
			dup     
			ldi      11
			eq?     
			bnt      code_0c5f
			pushi    6
			pushi    2
			pushi    1
			pushi    2
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_0ca3
code_0c5f:
			dup     
			ldi      12
			eq?     
			bnt      code_0c75
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0ca3
code_0c75:
			dup     
			ldi      13
			eq?     
			bnt      code_0c94
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
			jmp      code_0ca3
code_0c94:
			dup     
			ldi      14
			eq?     
			bnt      code_0ca3
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_0ca3:
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
			bnt      code_0cfb
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0e54
code_0cfb:
			dup     
			ldi      1
			eq?     
			bnt      code_0d11
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0e54
code_0d11:
			dup     
			ldi      2
			eq?     
			bnt      code_0d27
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_0e54
code_0d27:
			dup     
			ldi      3
			eq?     
			bnt      code_0d3d
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      36
			aTop     ticks
			jmp      code_0e54
code_0d3d:
			dup     
			ldi      4
			eq?     
			bnt      code_0d53
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_0e54
code_0d53:
			dup     
			ldi      5
			eq?     
			bnt      code_0d69
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_0e54
code_0d69:
			dup     
			ldi      6
			eq?     
			bnt      code_0d7f
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_0e54
code_0d7f:
			dup     
			ldi      7
			eq?     
			bnt      code_0d95
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0e54
code_0d95:
			dup     
			ldi      8
			eq?     
			bnt      code_0dab
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0e54
code_0dab:
			dup     
			ldi      9
			eq?     
			bnt      code_0dc1
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0e54
code_0dc1:
			dup     
			ldi      10
			eq?     
			bnt      code_0dd7
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_0e54
code_0dd7:
			dup     
			ldi      11
			eq?     
			bnt      code_0ded
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      48
			aTop     ticks
			jmp      code_0e54
code_0ded:
			dup     
			ldi      12
			eq?     
			bnt      code_0e03
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_0e54
code_0e03:
			dup     
			ldi      13
			eq?     
			bnt      code_0e19
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      42
			aTop     ticks
			jmp      code_0e54
code_0e19:
			dup     
			ldi      14
			eq?     
			bnt      code_0e2f
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      36
			aTop     ticks
			jmp      code_0e54
code_0e2f:
			dup     
			ldi      15
			eq?     
			bnt      code_0e45
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_0e54
code_0e45:
			dup     
			ldi      16
			eq?     
			bnt      code_0e54
			ldi      6
			aTop     ticks
			ldi      65535
			aTop     state
code_0e54:
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
			bnt      code_0eab
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0f6a
code_0eab:
			dup     
			ldi      1
			eq?     
			bnt      code_0ec1
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0f6a
code_0ec1:
			dup     
			ldi      2
			eq?     
			bnt      code_0ed7
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_0f6a
code_0ed7:
			dup     
			ldi      3
			eq?     
			bnt      code_0eed
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0f6a
code_0eed:
			dup     
			ldi      4
			eq?     
			bnt      code_0f03
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0f6a
code_0f03:
			dup     
			ldi      5
			eq?     
			bnt      code_0f19
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_0f6a
code_0f19:
			dup     
			ldi      6
			eq?     
			bnt      code_0f2f
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      18
			aTop     ticks
			jmp      code_0f6a
code_0f2f:
			dup     
			ldi      7
			eq?     
			bnt      code_0f45
			pushi    #cel
			pushi    1
			pushi    2
			pToa     client
			send     6
			ldi      12
			aTop     ticks
			jmp      code_0f6a
code_0f45:
			dup     
			ldi      8
			eq?     
			bnt      code_0f5b
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			jmp      code_0f6a
code_0f5b:
			dup     
			ldi      9
			eq?     
			bnt      code_0f6a
			ldi      24
			aTop     ticks
			ldi      65535
			aTop     state
code_0f6a:
			toss    
			ret     
		)
	)
)

(instance bardsTheme of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1000
			pushi    #number
			pushi    1
			pushi    4
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
			ldi      180
			aTop     ticks
			jmp      code_10f1
code_1000:
			dup     
			ldi      1
			eq?     
			bnt      code_1029
			pushi    1
			pushi    10
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    0
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10f1
code_1029:
			dup     
			ldi      2
			eq?     
			bnt      code_104b
			pushi    8
			pushi    1800
			pushi    1
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10f1
code_104b:
			dup     
			ldi      3
			eq?     
			bnt      code_106d
			pushi    8
			pushi    1800
			pushi    2
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10f1
code_106d:
			dup     
			ldi      4
			eq?     
			bnt      code_1093
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_108c
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			jmp      code_10f1
code_108c:
			ldi      6
			aTop     ticks
			jmp      code_10f1
code_1093:
			dup     
			ldi      5
			eq?     
			bnt      code_10b6
			pushi    8
			pushi    1800
			pushi    3
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10f1
code_10b6:
			dup     
			ldi      6
			eq?     
			bnt      code_10d9
			pushi    8
			pushi    1800
			pushi    4
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_10f1
code_10d9:
			dup     
			ldi      7
			eq?     
			bnt      code_10f1
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_10f1:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0fc5
			lap      param1
			not     
			bnt      code_0fc5
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0fce
code_0fc5:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_0fce:
			ret     
		)
	)
)

(instance theLoveNest of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    4
			pushi    6
			pushi    240
			pushi    245
			pushi    65535
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    246
			pushi    251
			pushi    65535
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    252
			pushi    255
			pushi    65535
			callk    Palette,  8
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    2
			pushi    19
			pushi    0
			callk    DoSound,  4
			pushi    #dispose
			pushi    0
			lofsa    rainSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
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
			bnt      code_11d6
			pushi    2
			pushi    19
			pushi    20
			callk    DoSound,  4
			pushi    #play
			pushi    0
			lofsa    rainSound
			send     4
			ldi      30
			aTop     ticks
			jmp      code_1264
code_11d6:
			dup     
			ldi      1
			eq?     
			bnt      code_11f3
			pushi    #drawPic
			pushi    2
			pushi    830
			pushi    32778
			lag      global2
			send     8
			ldi      300
			aTop     ticks
			jmp      code_1264
code_11f3:
			dup     
			ldi      2
			eq?     
			bnt      code_1216
			pushi    8
			pushi    1800
			pushi    3
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1264
code_1216:
			dup     
			ldi      3
			eq?     
			bnt      code_1239
			pushi    8
			pushi    1800
			pushi    4
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1264
code_1239:
			dup     
			ldi      4
			eq?     
			bnt      code_1258
			pushi    #fade
			pushi    4
			pushi    48
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      180
			aTop     ticks
			jmp      code_1264
code_1258:
			dup     
			ldi      5
			eq?     
			bnt      code_1264
			pushi    #dispose
			pushi    0
			self     4
code_1264:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_11a9
			lap      param1
			not     
			bnt      code_11a9
			pushi    #start
			pushi    1
			pushi    1
			lofsa    itsNotOver
			send     6
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_11b2
code_11a9:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_11b2:
			ret     
		)
	)
)

(instance theCapture of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_130e
			pushi    #number
			pushi    1
			pushi    6
			dup     
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
			ldi      30
			aTop     ticks
			jmp      code_1402
code_130e:
			dup     
			ldi      1
			eq?     
			bnt      code_1366
			pushi    #drawPic
			pushi    2
			pushi    835
			pushi    32778
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lofsa    baddie1
			send     10
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lofsa    baddie2
			send     10
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lofsa    baddie3
			send     10
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lofsa    baddie4
			send     10
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lofsa    tuckie
			send     10
			ldi      60
			aTop     ticks
			jmp      code_1402
code_1366:
			dup     
			ldi      2
			eq?     
			bnt      code_1389
			pushi    8
			pushi    1800
			pushi    7
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1402
code_1389:
			dup     
			ldi      3
			eq?     
			bnt      code_13c4
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    baddie1
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    baddie2
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    baddie3
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    baddie4
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    tuckie
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1402
code_13c4:
			dup     
			ldi      4
			eq?     
			bnt      code_13e7
			pushi    8
			pushi    1800
			pushi    8
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1402
code_13e7:
			dup     
			ldi      5
			eq?     
			bnt      code_13f6
			ldi      180
			aTop     ticks
			jmp      code_1402
code_13f6:
			dup     
			ldi      6
			eq?     
			bnt      code_1402
			pushi    #dispose
			pushi    0
			self     4
code_1402:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_12d5
			lap      param1
			not     
			bnt      code_12d5
			pushi    #start
			pushi    1
			pushi    2
			lofsa    itsNotOver
			send     6
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_12de
code_12d5:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_12de:
			ret     
		)
	)
)

(instance theGallows of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1489
			ldi      30
			aTop     ticks
			jmp      code_1639
code_1489:
			dup     
			ldi      1
			eq?     
			bnt      code_14ed
			pushi    #drawPic
			pushi    2
			pushi    840
			pushi    32778
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    fret
			push    
			lofsa    sheriffsPate
			send     10
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    drum
			push    
			lofsa    sheriffsKnuckles
			send     10
			pushi    #init
			pushi    0
			lofsa    soldier
			send     4
			pushi    #init
			pushi    0
			lofsa    hangman
			send     4
			pushi    #init
			pushi    0
			lofsa    robinH
			send     4
			pushi    #init
			pushi    0
			lofsa    johnnieHangs
			send     4
			pushi    #init
			pushi    0
			lofsa    tuckieHangs
			send     4
			ldi      60
			aTop     ticks
			jmp      code_1639
code_14ed:
			dup     
			ldi      2
			eq?     
			bnt      code_1504
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    soldier
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1639
code_1504:
			dup     
			ldi      3
			eq?     
			bnt      code_151b
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    soldier
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1639
code_151b:
			dup     
			ldi      4
			eq?     
			bnt      code_1532
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    soldier
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1639
code_1532:
			dup     
			ldi      5
			eq?     
			bnt      code_1549
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    soldier
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1639
code_1549:
			dup     
			ldi      6
			eq?     
			bnt      code_156c
			pushi    8
			pushi    1800
			pushi    9
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1639
code_156c:
			dup     
			ldi      7
			eq?     
			bnt      code_158f
			pushi    8
			pushi    1800
			pushi    10
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1639
code_158f:
			dup     
			ldi      8
			eq?     
			bnt      code_15a6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    soldier
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1639
code_15a6:
			dup     
			ldi      9
			eq?     
			bnt      code_15bd
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    soldier
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1639
code_15bd:
			dup     
			ldi      10
			eq?     
			bnt      code_15d4
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    soldier
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1639
code_15d4:
			dup     
			ldi      11
			eq?     
			bnt      code_15eb
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    soldier
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1639
code_15eb:
			dup     
			ldi      12
			eq?     
			bnt      code_160e
			pushi    8
			pushi    1800
			pushi    11
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_1639
code_160e:
			dup     
			ldi      13
			eq?     
			bnt      code_162d
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    6
			pushi    1
			lag      global100
			send     12
			ldi      180
			aTop     ticks
			jmp      code_1639
code_162d:
			dup     
			ldi      14
			eq?     
			bnt      code_1639
			pushi    #dispose
			pushi    0
			self     4
code_1639:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_146c
			lap      param1
			not     
			bnt      code_146c
			pushi    #start
			pushi    1
			pushi    3
			lofsa    itsNotOver
			send     6
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1475
code_146c:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_1475:
			ret     
		)
	)
)

(instance theKingRidesIn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16dd
			pushi    #number
			pushi    1
			pushi    2
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
			ldi      30
			aTop     ticks
			jmp      code_174e
code_16dd:
			dup     
			ldi      1
			eq?     
			bnt      code_1700
			pushi    8
			pushi    1800
			pushi    12
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_174e
code_1700:
			dup     
			ldi      2
			eq?     
			bnt      code_1723
			pushi    8
			pushi    1800
			pushi    13
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Troubadour}
			push    
			calle    proc13_4,  16
			jmp      code_174e
code_1723:
			dup     
			ldi      3
			eq?     
			bnt      code_1742
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    6
			pushi    1
			lag      global100
			send     12
			ldi      180
			aTop     ticks
			jmp      code_174e
code_1742:
			dup     
			ldi      4
			eq?     
			bnt      code_174e
			pushi    #dispose
			pushi    0
			self     4
code_174e:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_16a4
			lap      param1
			not     
			bnt      code_16a4
			pushi    #start
			pushi    1
			pushi    4
			lofsa    itsNotOver
			send     6
			pushi    #setScript
			pushi    1
			lofsa    itsNotOver
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_16ad
code_16a4:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_16ad:
			ret     
		)
	)
)

(instance theAccused of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17f6
			pushi    #number
			pushi    1
			pushi    3
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
			ldi      30
			aTop     ticks
			jmp      code_1b8f
code_17f6:
			dup     
			ldi      1
			eq?     
			bnt      code_1847
			pushi    #drawPic
			pushi    2
			pushi    850
			pushi    32778
			lag      global2
			send     8
			pushi    #init
			pushi    0
			lofsa    sheriffsHead
			send     4
			pushi    #init
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lofsa    sheriffsHand
			send     10
			pushi    #init
			pushi    0
			lofsa    robinsHead
			send     4
			pushi    #init
			pushi    0
			lofsa    robinsRightHand
			send     4
			pushi    #init
			pushi    0
			lofsa    robinsLeftHand
			send     4
			pushi    #init
			pushi    0
			lofsa    kingsHead
			send     4
			ldi      180
			aTop     ticks
			jmp      code_1b8f
code_1847:
			dup     
			ldi      2
			eq?     
			bnt      code_187a
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    kingsHead
			send     6
			pushi    1
			pushi    31
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    14
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {King Richard}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_187a:
			dup     
			ldi      3
			eq?     
			bnt      code_189d
			pushi    8
			pushi    1800
			pushi    15
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {King Richard}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_189d:
			dup     
			ldi      4
			eq?     
			bnt      code_18dd
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    sheriffsHand
			send     6
			pushi    #setScript
			pushi    1
			lofsa    sheriffTalks
			push    
			lofsa    sheriffsHead
			send     6
			pushi    1
			pushi    17
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    16
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Sheriff}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_18dd:
			dup     
			ldi      5
			eq?     
			bnt      code_18fe
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    sheriffsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    sheriffsHand
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1b8f
code_18fe:
			dup     
			ldi      6
			eq?     
			bnt      code_1915
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsHead
			send     6
			ldi      18
			aTop     ticks
			jmp      code_1b8f
code_1915:
			dup     
			ldi      7
			eq?     
			bnt      code_1935
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsRightHand
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    kingsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1b8f
code_1935:
			dup     
			ldi      8
			eq?     
			bnt      code_194c
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsLeftHand
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1b8f
code_194c:
			dup     
			ldi      9
			eq?     
			bnt      code_1963
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    robinsRightHand
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1b8f
code_1963:
			dup     
			ldi      10
			eq?     
			bnt      code_197a
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    robinsHead
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1b8f
code_197a:
			dup     
			ldi      11
			eq?     
			bnt      code_1991
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    robinsLeftHand
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1b8f
code_1991:
			dup     
			ldi      12
			eq?     
			bnt      code_19c3
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsHead
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    17
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_19c3:
			dup     
			ldi      13
			eq?     
			bnt      code_1a14
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    sheriffsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    kingsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    robinsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    sheriffsHand
			send     6
			pushi    1
			pushi    17
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    18
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Sheriff}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_1a14:
			dup     
			ldi      14
			eq?     
			bnt      code_1a50
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    sheriffsHand
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    sheriffsHead
			send     6
			pushi    1
			pushi    31
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    19
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {King Richard}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_1a50:
			dup     
			ldi      15
			eq?     
			bnt      code_1a95
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    sheriffsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    kingsHead
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    20
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Robin}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_1a95:
			dup     
			ldi      16
			eq?     
			bnt      code_1ac8
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    sheriffsHead
			send     6
			pushi    1
			pushi    31
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    21
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {King Richard}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_1ac8:
			dup     
			ldi      17
			eq?     
			bnt      code_1b1a
			pushi    #setScript
			pushi    1
			lofsa    sheriffTalks
			push    
			lofsa    sheriffsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    sheriffsHand
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    kingsHead
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    robinsHead
			send     6
			pushi    1
			pushi    17
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    22
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {Sheriff}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_1b1a:
			dup     
			ldi      18
			eq?     
			bnt      code_1b64
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			lofsa    sheriffsHead
			send     12
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    sheriffsHand
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    robinsHead
			send     6
			pushi    1
			pushi    31
			calle    proc13_6,  2
			pushi    8
			pushi    1800
			pushi    23
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			pushi    80
			lofsa    {King Richard}
			push    
			calle    proc13_4,  16
			jmp      code_1b8f
code_1b64:
			dup     
			ldi      19
			eq?     
			bnt      code_1b83
			pushi    #fade
			pushi    4
			pushi    60
			pushi    30
			pushi    6
			pushi    1
			lag      global100
			send     12
			ldi      180
			aTop     ticks
			jmp      code_1b8f
code_1b83:
			dup     
			ldi      20
			eq?     
			bnt      code_1b8f
			pushi    #dispose
			pushi    0
			self     4
code_1b8f:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_17bc
			lap      param1
			not     
			bnt      code_17bc
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    30
			pushi    0
			lag      global100
			send     12
			pushi    #newRoom
			pushi    1
			pushi    420
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_17c5
code_17bc:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_17c5:
			ret     
		)
	)
)

(instance sheriffTalks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1bf7
			pushi    #setCycle
			pushi    1
			class    End
			push    
			pToa     client
			send     6
			pushi    10
			pushi    2
			pushi    4
			pushi    11
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1c28
code_1bf7:
			dup     
			ldi      1
			eq?     
			bnt      code_1c19
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			pToa     client
			send     6
			pushi    10
			pushi    2
			pushi    4
			pushi    11
			callk    Random,  4
			mul     
			aTop     ticks
			jmp      code_1c28
code_1c19:
			dup     
			ldi      2
			eq?     
			bnt      code_1c28
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_1c28:
			toss    
			ret     
		)
	)
)

(instance itsNotOver of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ca5
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_1c9e
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    theLoveNest
			push    
			pushSelf
			self     8
			jmp      code_1dbb
code_1c9e:
			ldi      1
			aTop     ticks
			jmp      code_1dbb
code_1ca5:
			dup     
			ldi      1
			eq?     
			bnt      code_1ceb
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			pushi    1
			pushi    62
			callb    proc0_5,  2
			not     
			bnt      code_1ccf
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
code_1ccf:
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    theCapture
			push    
			pushSelf
			self     8
			jmp      code_1dbb
code_1ceb:
			dup     
			ldi      2
			eq?     
			bnt      code_1d17
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    theGallows
			push    
			pushSelf
			self     8
			jmp      code_1dbb
code_1d17:
			dup     
			ldi      3
			eq?     
			bnt      code_1d53
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    845
			pushi    32778
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    theKingRidesIn
			push    
			pushSelf
			self     8
			jmp      code_1dbb
code_1d53:
			dup     
			ldi      4
			eq?     
			bnt      code_1d86
			pushi    #fade
			pushi    4
			pushi    48
			pushi    6
			pushi    18
			pushi    0
			lag      global100
			send     12
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #setScript
			pushi    2
			lofsa    theAccused
			push    
			pushSelf
			self     8
			jmp      code_1dbb
code_1d86:
			dup     
			ldi      5
			eq?     
			bnt      code_1da4
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      72
			aTop     ticks
			jmp      code_1dbb
code_1da4:
			dup     
			ldi      6
			eq?     
			bnt      code_1dbb
			pushi    #newRoom
			pushi    1
			pushi    420
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1dbb:
			toss    
			ret     
		)
	)
)

(instance rainSound of Sound
	(properties
		flags $0001
		number 142
		loop -1
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
			bnt      code_1e41
			ldi      120
			aTop     ticks
			jmp      code_1f93
code_1e41:
			dup     
			ldi      1
			eq?     
			bnt      code_1e58
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    soldier
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1f93
code_1e58:
			dup     
			ldi      2
			eq?     
			bnt      code_1e6f
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    soldier
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1f93
code_1e6f:
			dup     
			ldi      3
			eq?     
			bnt      code_1e86
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    soldier
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1f93
code_1e86:
			dup     
			ldi      4
			eq?     
			bnt      code_1e9d
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    soldier
			send     6
			ldi      12
			aTop     ticks
			jmp      code_1f93
code_1e9d:
			dup     
			ldi      5
			eq?     
			bnt      code_1eb8
			pushi    #setScript
			pushi    1
			lofsa    hang
			push    
			lofsa    robinH
			send     6
			ldi      120
			aTop     ticks
			jmp      code_1f93
code_1eb8:
			dup     
			ldi      6
			eq?     
			bnt      code_1efc
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global10
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			pushi    #init
			pushi    0
			lofsa    swinger
			send     4
			pushi    #number
			pushi    1
			pushi    16
			pushi    42
			pushi    0
			lofsa    creakSound
			send     10
			ldi      300
			aTop     ticks
			jmp      code_1f93
code_1efc:
			dup     
			ldi      7
			eq?     
			bnt      code_1f2f
			pushi    #dispose
			pushi    0
			lofsa    swinger
			send     4
			pushi    #number
			pushi    1
			pushi    14
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
			ldi      30
			aTop     ticks
			jmp      code_1f93
code_1f2f:
			dup     
			ldi      8
			eq?     
			bnt      code_1f87
			pushi    #drawPic
			pushi    2
			pushi    800
			pushi    32778
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
			pushi    #setScript
			pushi    1
			lofsa    bardsTheme2
			push    
			lag      global2
			send     6
			ldi      2
			aTop     cycles
			jmp      code_1f93
code_1f87:
			dup     
			ldi      9
			eq?     
			bnt      code_1f93
			pushi    #dispose
			pushi    0
			self     4
code_1f93:
			toss    
			ret     
		)
	)
)

(instance hang of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ffe
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    hangman
			send     6
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    robinH
			send     14
			jmp      code_20a6
code_1ffe:
			dup     
			ldi      1
			eq?     
			bnt      code_2011
			pushi    #play
			pushi    1
			pushSelf
			lofsa    creakSound
			send     6
			jmp      code_20a6
code_2011:
			dup     
			ldi      2
			eq?     
			bnt      code_201f
			ldi      6
			aTop     ticks
			jmp      code_20a6
code_201f:
			dup     
			ldi      3
			eq?     
			bnt      code_2037
			pushi    #cel
			pushi    1
			pushi    3
			lofsa    robinH
			send     6
			ldi      36
			aTop     ticks
			jmp      code_20a6
code_2037:
			dup     
			ldi      4
			eq?     
			bnt      code_204f
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    robinH
			send     6
			ldi      24
			aTop     ticks
			jmp      code_20a6
code_204f:
			dup     
			ldi      5
			eq?     
			bnt      code_2067
			pushi    #cel
			pushi    1
			pushi    5
			lofsa    robinH
			send     6
			ldi      36
			aTop     ticks
			jmp      code_20a6
code_2067:
			dup     
			ldi      6
			eq?     
			bnt      code_207f
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    robinH
			send     6
			ldi      24
			aTop     ticks
			jmp      code_20a6
code_207f:
			dup     
			ldi      7
			eq?     
			bnt      code_2091
			ldi      3
			aTop     state
			ldi      6
			aTop     ticks
			jmp      code_20a6
code_2091:
			dup     
			ldi      8
			eq?     
			bnt      code_20a6
			pushi    #number
			pushi    1
			pushi    18
			pushi    42
			pushi    1
			pushSelf
			lofsa    creakSound
			send     12
code_20a6:
			toss    
			ret     
		)
	)
)

(instance bardsTheme2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2112
			ldi      60
			aTop     ticks
			jmp      code_2180
code_2112:
			dup     
			ldi      1
			eq?     
			bnt      code_212f
			pushi    6
			pushi    1800
			pushi    24
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			calle    proc13_4,  12
			jmp      code_2180
code_212f:
			dup     
			ldi      2
			eq?     
			bnt      code_214c
			pushi    6
			pushi    1800
			pushi    25
			pushSelf
			pushi    67
			pushi    55
			pushi    150
			calle    proc13_4,  12
			jmp      code_2180
code_214c:
			dup     
			ldi      3
			eq?     
			bnt      code_216a
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      72
			aTop     ticks
			jmp      code_2180
code_216a:
			dup     
			ldi      4
			eq?     
			bnt      code_2180
			pushi    #newRoom
			pushi    1
			pushi    97
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_2180:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_20f5
			lap      param1
			not     
			bnt      code_20f5
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_20fe
code_20f5:
			pushi    #cue
			pushi    0
			&rest    param2
			super    Script,  4
code_20fe:
			ret     
		)
	)
)

(instance drum of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_21db
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_2259
code_21db:
			dup     
			ldi      1
			eq?     
			bnt      code_21f1
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_2259
code_21f1:
			dup     
			ldi      2
			eq?     
			bnt      code_2207
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_2259
code_2207:
			dup     
			ldi      3
			eq?     
			bnt      code_221e
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      180
			aTop     ticks
			jmp      code_2259
code_221e:
			dup     
			ldi      4
			eq?     
			bnt      code_2234
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      90
			aTop     ticks
			jmp      code_2259
code_2234:
			dup     
			ldi      5
			eq?     
			bnt      code_224a
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_2259
code_224a:
			dup     
			ldi      6
			eq?     
			bnt      code_2259
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_2259:
			toss    
			ret     
		)
	)
)

(instance fret of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_22a9
			ldi      24
			aTop     ticks
			jmp      code_234b
code_22a9:
			dup     
			ldi      1
			eq?     
			bnt      code_22bf
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      6
			aTop     ticks
			jmp      code_234b
code_22bf:
			dup     
			ldi      2
			eq?     
			bnt      code_22d5
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      60
			aTop     ticks
			jmp      code_234b
code_22d5:
			dup     
			ldi      3
			eq?     
			bnt      code_22eb
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_234b
code_22eb:
			dup     
			ldi      4
			eq?     
			bnt      code_22f9
			ldi      30
			aTop     ticks
			jmp      code_234b
code_22f9:
			dup     
			ldi      5
			eq?     
			bnt      code_2310
			pushi    #cel
			pushi    1
			pushi    1
			pToa     client
			send     6
			ldi      180
			aTop     ticks
			jmp      code_234b
code_2310:
			dup     
			ldi      6
			eq?     
			bnt      code_2326
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      90
			aTop     ticks
			jmp      code_234b
code_2326:
			dup     
			ldi      7
			eq?     
			bnt      code_233c
			pushi    #cel
			pushi    1
			pushi    0
			pToa     client
			send     6
			ldi      30
			aTop     ticks
			jmp      code_234b
code_233c:
			dup     
			ldi      8
			eq?     
			bnt      code_234b
			ldi      65535
			aTop     state
			ldi      6
			aTop     ticks
code_234b:
			toss    
			ret     
		)
	)
)

(instance creakSound of Sound
	(properties
		flags $0001
		number 17
	)
)
