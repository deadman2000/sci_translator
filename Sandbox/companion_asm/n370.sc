;;; Sierra Script 1.0 - (do not remove this comment)
(script# 370)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n939)
(use n950)
(use n992)
(use n994)
(use n998)

(public
	rm370 0
)

(local
	local0
)
(procedure (localproc_000e param1)
	(asm
		pushi    5
		&rest    param1
		pushi    67
		pushi    3
		pushi    15
		pushi    70
		pushi    61
		calle    proc13_4,  10
		ret     
	)
)

(procedure (localproc_0021 param1)
	(asm
		pushi    1
		pushi    20
		calle    proc13_6,  2
		pushi    5
		&rest    param1
		pushi    67
		pushi    250
		pushi    15
		pushi    70
		pushi    67
		calle    proc13_4,  10
		pushi    1
		pushi    0
		calle    proc13_6,  2
		ret     
	)
)

(instance rm370 of Rm
	(properties
		picture 370
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    1
			pushi    190
			callb    proc0_6,  2
			pushi    #init
			pushi    0
			lofsa    lobbsHead
			send     4
			pushi    #init
			pushi    0
			lofsa    lobbsArm
			send     4
			pushi    #init
			pushi    0
			lofsa    egoHead
			send     4
			pushi    #init
			pushi    0
			lofsa    egoArm
			send     4
			pushi    #init
			pushi    0
			lofsa    exitRoom
			send     4
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    candle
			send     10
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			bnt      code_00a4
			pushi    2
			pushi    1370
			pushi    0
			calle    proc13_4,  4
code_00a4:
			pushi    #setScript
			pushi    2
			lofsa    dialogScript
			push    
			pushSelf
			lag      global2
			send     8
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #has
			pushi    1
			pushi    15
			lag      global0
			send     6
			not     
			bnt      code_00df
			pushi    #put
			pushi    1
			pushi    3
			lag      global0
			send     6
			pushi    #get
			pushi    1
			pushi    15
			lag      global0
			send     6
			pushi    2
			pushi    25
			pushi    82
			calle    proc806_1,  4
code_00df:
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    1
			pushi    939
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance exitRoom of Feature
	(properties
		nsBottom 189
		nsRight 319
		onMeCheck $0010
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0158
			pushi    #newRoom
			pushi    1
			pushi    360
			lag      global2
			send     6
code_0158:
			ret     
		)
	)
)

(instance lobbsHead of Prop
	(properties
		x 190
		y 107
		view 371
		loop 4
	)
)

(instance lobbsArm of Prop
	(properties
		x 198
		y 110
		view 371
		loop 5
	)
)

(instance egoArm of Prop
	(properties
		x 147
		y 118
		view 371
		loop 2
	)
)

(instance egoHead of Prop
	(properties
		x 145
		y 110
		view 371
		loop 1
	)
)

(instance candle of Actor
	(properties
		x 233
		y 115
		view 371
	)
)

(instance dialogScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0433
			ldi      3
			aTop     seconds
			jmp      code_0cf2
code_0433:
			dup     
			ldi      1
			eq?     
			bnt      code_0484
			pushi    0
			callb    proc0_3,  0
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    160
			pushi    180
			lag      global1
			send     12
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    1
			pushi    20
			calle    proc13_6,  2
			pushi    8
			pushi    1370
			pushi    1
			pushSelf
			pushi    67
			pushi    249
			pushi    15
			pushi    70
			pushi    68
			calle    proc13_4,  16
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0cf2
code_0484:
			dup     
			ldi      2
			eq?     
			bnt      code_04b5
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    3
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    2
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_04b5:
			dup     
			ldi      3
			eq?     
			bnt      code_04ef
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    lobbsArm
			send     6
			pushi    3
			pushi    1370
			pushi    3
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_04ef:
			dup     
			ldi      4
			eq?     
			bnt      code_052a
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    2
			lofsa    egoArm
			send     8
			pushi    3
			pushi    1370
			pushi    4
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_052a:
			dup     
			ldi      5
			eq?     
			bnt      code_0564
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    egoArm
			send     6
			pushi    3
			pushi    1370
			pushi    5
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0564:
			dup     
			ldi      6
			eq?     
			bnt      code_0592
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    6
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0592:
			dup     
			ldi      7
			eq?     
			bnt      code_05c3
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    1
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    7
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_05c3:
			dup     
			ldi      8
			eq?     
			bnt      code_05fd
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    lobbsArm
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    8
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_05fd:
			dup     
			ldi      9
			eq?     
			bnt      code_0621
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    9
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0621:
			dup     
			ldi      10
			eq?     
			bnt      code_0652
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    2
			lofsa    egoArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    10
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0652:
			dup     
			ldi      11
			eq?     
			bnt      code_0676
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    11
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0676:
			dup     
			ldi      12
			eq?     
			bnt      code_06b1
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    2
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    12
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_06b1:
			dup     
			ldi      13
			eq?     
			bnt      code_06e1
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    lobbsArm
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    13
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_06e1:
			dup     
			ldi      14
			eq?     
			bnt      code_0705
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    14
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0705:
			dup     
			ldi      15
			eq?     
			bnt      code_0737
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    3
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    15
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0737:
			dup     
			ldi      16
			eq?     
			bnt      code_0772
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    2
			lofsa    egoArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    16
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0772:
			dup     
			ldi      17
			eq?     
			bnt      code_07b8
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    1
			pushi    20
			calle    proc13_6,  2
			pushi    8
			pushi    1370
			pushi    17
			pushSelf
			pushi    67
			pushi    230
			pushi    15
			pushi    70
			pushi    75
			calle    proc13_4,  16
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0cf2
code_07b8:
			dup     
			ldi      18
			eq?     
			bnt      code_07dc
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    18
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_07dc:
			dup     
			ldi      19
			eq?     
			bnt      code_0800
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    19
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0800:
			dup     
			ldi      20
			eq?     
			bnt      code_0832
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    3
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    20
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0832:
			dup     
			ldi      21
			eq?     
			bnt      code_086d
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    2
			lofsa    egoArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    21
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_086d:
			dup     
			ldi      22
			eq?     
			bnt      code_089b
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    22
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_089b:
			dup     
			ldi      23
			eq?     
			bnt      code_08c9
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    23
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_08c9:
			dup     
			ldi      24
			eq?     
			bnt      code_0904
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    2
			lofsa    egoArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    24
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0904:
			dup     
			ldi      25
			eq?     
			bnt      code_0934
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    egoArm
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    25
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0934:
			dup     
			ldi      26
			eq?     
			bnt      code_0966
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    3
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    26
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0966:
			dup     
			ldi      27
			eq?     
			bnt      code_098a
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    27
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_098a:
			dup     
			ldi      28
			eq?     
			bnt      code_09b8
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    28
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_09b8:
			dup     
			ldi      29
			eq?     
			bnt      code_09e6
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    29
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_09e6:
			dup     
			ldi      30
			eq?     
			bnt      code_0a20
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    30
			pushSelf
			call     localproc_000e,  6
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    lobbsArm
			send     6
			jmp      code_0cf2
code_0a20:
			dup     
			ldi      31
			eq?     
			bnt      code_0a48
			pushi    #setLoop
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    194
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    lobbsArm
			send     26
			jmp      code_0cf2
code_0a48:
			dup     
			ldi      32
			eq?     
			bnt      code_0a6c
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    31
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0a6c:
			dup     
			ldi      33
			eq?     
			bnt      code_0a93
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setLoop
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    egoArm
			send     14
			jmp      code_0cf2
code_0a93:
			dup     
			ldi      34
			eq?     
			bnt      code_0b07
			pushi    #x
			pushi    1
			pushi    149
			pushi    3
			pushi    1
			pushi    119
			pushi    288
			pushi    1
			pushi    #lastCel
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    egoArm
			send     24
			pushi    #put
			pushi    1
			pushi    3
			lag      global0
			send     6
			pushi    #get
			pushi    1
			pushi    15
			lag      global0
			send     6
			pushi    2
			pushi    25
			pushi    82
			calle    proc806_1,  4
			pushi    #setLoop
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    198
			pushi    288
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    lobbsArm
			send     4
			push    
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    lobbsArm
			send     26
			jmp      code_0cf2
code_0b07:
			dup     
			ldi      35
			eq?     
			bnt      code_0b2b
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    32
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0b2b:
			dup     
			ldi      36
			eq?     
			bnt      code_0b59
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    33
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0b59:
			dup     
			ldi      37
			eq?     
			bnt      code_0b87
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    34
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0b87:
			dup     
			ldi      38
			eq?     
			bnt      code_0bb8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    1
			lofsa    lobbsArm
			send     8
			pushi    3
			pushi    1370
			pushi    35
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0bb8:
			dup     
			ldi      39
			eq?     
			bnt      code_0be6
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    36
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0be6:
			dup     
			ldi      40
			eq?     
			bnt      code_0c20
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    lobbsArm
			send     6
			pushi    3
			pushi    1370
			pushi    37
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0c20:
			dup     
			ldi      41
			eq?     
			bnt      code_0c4e
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    38
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0c4e:
			dup     
			ldi      42
			eq?     
			bnt      code_0c72
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    39
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0c72:
			dup     
			ldi      43
			eq?     
			bnt      code_0cae
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    egoHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    3
			lofsa    lobbsArm
			send     8
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    lobbsHead
			send     8
			pushi    3
			pushi    1370
			pushi    40
			pushSelf
			call     localproc_0021,  6
			jmp      code_0cf2
code_0cae:
			dup     
			ldi      44
			eq?     
			bnt      code_0cdc
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    lobbsHead
			send     6
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    20
			lofsa    egoHead
			send     8
			pushi    3
			pushi    1370
			pushi    41
			pushSelf
			call     localproc_000e,  6
			jmp      code_0cf2
code_0cdc:
			dup     
			ldi      45
			eq?     
			bnt      code_0cf2
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    360
			lag      global2
			send     6
code_0cf2:
			toss    
			ret     
		)
	)
	
	(method (cue param1 param2)
		(asm
			lap      argc
			bnt      code_0416
			lap      param1
			not     
			bnt      code_0416
			ldi      1
			sal      local0
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    egoHead
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    egoArm
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    lobbsArm
			send     14
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    84
			pushi    0
			pushi    108
			pushi    0
			lofsa    lobbsHead
			send     14
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    360
			lag      global2
			send     6
			jmp      code_041f
code_0416:
			pushi    #cue
			pushi    0
			&rest    param2
			super    TScript,  4
code_041f:
			ret     
		)
	)
)
