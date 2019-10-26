;;; Sierra Script 1.0 - (do not remove this comment)
(script# 9)
(include sci.sh)
(use n000)
(use n806)
(use n851)
(use n945)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm9 0
)

(local
	[local0 9] = [-1 2706 32]
	[local9 4] = [1009 0 1]
	[local13 4] = [1009 1 1]
	[local17 4] = [1009 2 1]
	[local21 5] = [1009 3 1 2]
)
(instance rm9 of Rm
	(properties
		picture 120
		style $000a
	)
	
	(method (init)
		(asm
			lag      global139
			sag      global146
			pushi    1
			lag      global139
			neg     
			push    
			calle    proc806_4,  2
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    4
			pushi    128
			pushi    127
			pushi    212
			pushi    8
			calle    proc958_0,  8
			ldi      0
			sag      global139
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			lofsa    theKnight
			send     10
			pushi    #init
			pushi    0
			lofsa    myWill
			send     4
			pushi    #init
			pushi    0
			lofsa    myJohn
			send     4
			pushi    #init
			pushi    0
			lofsa    myTuck
			send     4
			pushi    #init
			pushi    0
			lofsa    myAlan
			send     4
			pushi    #init
			pushi    0
			lofsa    myMuch
			send     4
			pushi    1
			pushi    5
			callb    proc0_2,  2
			pushi    #cel
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    300
			pushi    65526
			pushi    17
			pushi    1
			pushi    24576
			pushi    107
			pushi    0
			lag      global0
			send     24
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_00ad
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			lofsa    maidMarian
			send     14
code_00ad:
			pushi    #number
			pushi    1
			pushi    9
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #setScript
			pushi    1
			lofsa    doTheSlideShow
			push    
			lag      global0
			send     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance myWill of View
	(properties
		x 227
		y 120
		view 161
		loop 3
		signal $0001
	)
)

(instance myJohn of View
	(properties
		x 104
		y 62
		view 152
		signal $0001
	)
)

(instance myTuck of View
	(properties
		x 61
		y 57
		view 155
		signal $0001
	)
)

(instance myAlan of View
	(properties
		x 38
		y 103
		view 158
		signal $0001
	)
)

(instance myMuch of View
	(properties
		x 7
		y 97
		view 164
		signal $0001
	)
)

(instance horseAndKnight of Prop
	(properties
		x 165
		y 90
		view 127
		loop 3
		signal $4001
	)
)

(instance knightArm of Prop
	(properties
		x 174
		y 25
		view 127
		priority 12
		signal $0010
	)
)

(instance knightHead of Prop
	(properties
		x 166
		y 23
		view 127
		loop 2
		priority 12
		signal $4010
	)
)

(instance theKnight of Actor
	(properties
		x 270
		view 127
		loop 1
	)
)

(instance maidMarian of Actor
	(properties
		x 340
		y 82
		view 211
		loop 1
	)
)

(instance mule1 of Actor
	(properties
		x 256
		y -10
		view 127
		loop 4
	)
)

(instance mule2 of Actor
	(properties
		x 311
		y -60
		view 127
		loop 4
	)
)

(instance doTheSlideShow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_065e
			pushi    0
			callb    proc0_3,  0
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    165
			pushi    89
			pushSelf
			lofsa    theKnight
			send     18
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    230
			pushi    75
			lag      global0
			send     10
			jmp      code_0a56
code_065e:
			dup     
			ldi      1
			eq?     
			bnt      code_0676
			pushi    2
			lofsa    theKnight
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      1
			aTop     cycles
			jmp      code_0a56
code_0676:
			dup     
			ldi      2
			eq?     
			bnt      code_06bb
			pushi    #hide
			pushi    0
			lofsa    theKnight
			send     4
			pushi    #view
			pushi    1
			pushi    8
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			pushi    #init
			pushi    0
			lofsa    horseAndKnight
			send     4
			pushi    #init
			pushi    0
			lofsa    knightHead
			send     4
			pushi    #init
			pushi    0
			lofsa    knightArm
			send     4
			jmp      code_0a56
code_06bb:
			dup     
			ldi      3
			eq?     
			bnt      code_0736
			pushi    3
			pushi    1
			pushi    0
			pushi    1
			callb    proc0_2,  6
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_072f
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    17
			pushi    1
			pushi    26624
			pushi    107
			pushi    0
			pushi    18
			pushi    1
			pushi    0
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    212
			pushi    60
			lofsa    mule1
			send     38
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    18
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    17
			pushi    1
			pushi    26624
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    185
			pushi    50
			pushSelf
			lofsa    mule2
			send     40
			jmp      code_0a56
code_072f:
			ldi      1
			aTop     cycles
			jmp      code_0a56
code_0736:
			dup     
			ldi      4
			eq?     
			bnt      code_076d
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_0766
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_0766
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    252
			pushi    77
			pushSelf
			lofsa    maidMarian
			send     12
			jmp      code_0a56
code_0766:
			ldi      6
			aTop     ticks
			jmp      code_0a56
code_076d:
			dup     
			ldi      5
			eq?     
			bnt      code_07b9
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_07b2
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_07b2
			pushi    5
			pushi    #superClass
			pushi    212
			pushi    162
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    maidMarian
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    17
			pushi    1
			pushi    16384
			lofsa    maidMarian
			send     30
code_07b2:
			ldi      6
			aTop     ticks
			jmp      code_0a56
code_07b9:
			dup     
			ldi      6
			eq?     
			bnt      code_07e4
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_07dd
			pushi    #setCel
			pushi    1
			pushi    2
			lofsa    mule1
			send     6
			pushi    #setCel
			pushi    1
			pushi    2
			lofsa    mule2
			send     6
code_07dd:
			ldi      6
			aTop     ticks
			jmp      code_0a56
code_07e4:
			dup     
			ldi      7
			eq?     
			bnt      code_081d
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_0808
			pushi    #loop
			pushi    1
			pushi    5
			lofsa    mule1
			send     6
			pushi    #loop
			pushi    1
			pushi    5
			lofsa    mule2
			send     6
code_0808:
			pushi    4
			lea      @local9
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a56
code_081d:
			dup     
			ldi      8
			eq?     
			bnt      code_0836
			pushi    4
			lea      @local13
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a56
code_0836:
			dup     
			ldi      9
			eq?     
			bnt      code_0853
			pushi    5
			pushi    1
			lea      @local17
			push    
			lea      @local0
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0a56
code_0853:
			dup     
			ldi      10
			eq?     
			bnt      code_086a
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    knightArm
			send     8
			jmp      code_0a56
code_086a:
			dup     
			ldi      11
			eq?     
			bnt      code_08e9
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    horseAndKnight
			send     8
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    knightArm
			send     8
			pushi    #delete
			pushi    0
			pushi    108
			pushi    0
			lofsa    knightHead
			send     8
			pushi    #show
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    65486
			pushi    285
			lofsa    theKnight
			send     20
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_08e2
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    17
			pushi    1
			pushi    26624
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    65496
			pushi    275
			lofsa    mule1
			send     34
code_08e2:
			ldi      100
			aTop     ticks
			jmp      code_0a56
code_08e9:
			dup     
			ldi      12
			eq?     
			bnt      code_0930
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_0927
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    17
			pushi    1
			pushi    26624
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65496
			pushi    260
			pushSelf
			lofsa    mule2
			send     36
			jmp      code_0a56
code_0927:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0a56
code_0930:
			dup     
			ldi      13
			eq?     
			bnt      code_096c
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_0963
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_0963
			pushi    3
			lsg      global0
			lofsa    maidMarian
			push    
			pushSelf
			callb    proc0_9,  6
			pushi    2
			lofsa    maidMarian
			push    
			lsg      global0
			callb    proc0_9,  4
			jmp      code_0a56
code_0963:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0a56
code_096c:
			dup     
			ldi      14
			eq?     
			bnt      code_09a2
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_0999
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_0999
			pushi    4
			lea      @local21
			push    
			pushi    1
			pushi    22
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a56
code_0999:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0a56
code_09a2:
			dup     
			ldi      15
			eq?     
			bnt      code_0a44
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_09c8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    mule1
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    mule2
			send     8
code_09c8:
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_09e6
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_09e6
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    maidMarian
			send     8
code_09e6:
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    theKnight
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    myJohn
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    myWill
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    myTuck
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    myAlan
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    myMuch
			send     8
			pushi    #hide
			pushi    0
			lag      global0
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      48
			aTop     ticks
			jmp      code_0a56
code_0a44:
			dup     
			ldi      16
			eq?     
			bnt      code_0a56
			pushi    #newRoom
			pushi    1
			pushi    801
			lag      global2
			send     6
code_0a56:
			toss    
			ret     
		)
	)
)
