;;; Sierra Script 1.0 - (do not remove this comment)
(script# 705)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm705 0
)

(local
	local0
	local1
	local2
	[local3 9] = [1705 0 2 1 2 1 1 2]
	[local12 8] = [1705 6 2 1 2 1 2]
	[local20 5] = [1705 19 1 2]
	[local25 5] = [1705 21 1 1]
	[local30 4] = [1705 23 1]
	[local34 4] = [1705 24 1]
	[local38 8] = [1705 25 2 1 1 2 2]
	[local46 4] = [1705 30 1]
	[local50 6] = [1705 31 2 1 2]
	[local56 4] = [1705 34 1]
	[local60 9] = [1705 35 2 1 2 1 1 2]
	[local69 4] = [1705 43 1]
	[local73 4] = [1705 18 1]
	[local77 9] = [61 0 4 5 20 38 22 29 32]
)
(instance rm705 of Rm
	(properties
		picture 705
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    squeakSound
			send     8
			pushi    #number
			pushi    1
			pushi    26
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #init
			pushi    0
			lofsa    rat1
			send     4
			pushi    #init
			pushi    0
			lofsa    rat2
			send     4
			pushi    #init
			pushi    0
			lofsa    rat3
			send     4
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    enterWindow
			push    
			lofsa    theKnight
			send     10
			pushi    4
			lofsa    theWindow
			push    
			lofsa    theDoor
			push    
			lofsa    theFloor
			push    
			lofsa    theRoom
			push    
			calle    proc806_3,  8
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    1
			pushi    34
			callb    proc0_6,  2
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #setScript
			pushi    1
			lofsa    ratsDoit
			push    
			lag      global2
			send     6
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_009d
			ldi      0
			jmp      code_00eb
code_009d:
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_00e3
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    1
			pushi    67
			callb    proc0_5,  2
			bnt      code_00ce
			pushi    #setScript
			pushi    1
			lofsa    winKnightTrust
			push    
			lag      global0
			send     6
			jmp      code_00eb
code_00ce:
			pushi    4
			lea      @local69
			push    
			lea      @local77
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_00eb
code_00e3:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
code_00eb:
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
			pushi    1
			pushi    991
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0100
			pushi    3
			pushi    1705
			pushi    48
			pushi    1
			calle    proc13_4,  6
code_0100:
			ret     
		)
	)
)

(instance robDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_018c
			lsp      param2
			ldi      1
			eq?     
			bnt      code_018c
			pushi    3
			pushi    1705
			pushi    42
			pushi    1
			calle    proc13_4,  6
code_018c:
			ret     
		)
	)
)

(instance theRoom of Feature
	(properties
		x 69
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    69
			pushi    1
			pushi    243
			pushi    0
			pushi    242
			pushi    189
			pushi    68
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_01c6
			pushi    3
			pushi    1705
			pushi    12
			pushi    1
			calle    proc13_4,  6
			jmp      code_01e7
code_01c6:
			dup     
			ldi      3
			eq?     
			bnt      code_01dc
			pushi    3
			pushi    1705
			pushi    46
			pushi    1
			calle    proc13_4,  6
			jmp      code_01e7
code_01dc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_01e7:
			toss    
			ret     
		)
	)
)

(instance theFloor of Feature
	(properties
		x 82
		y 171
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    83
			pushi    189
			pushi    82
			pushi    171
			pushi    132
			pushi    176
			pushi    165
			pushi    171
			pushi    179
			pushi    175
			pushi    192
			pushi    175
			pushi    210
			pushi    180
			pushi    227
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_028a
			pushi    3
			pushi    1705
			pushi    44
			pushi    1
			calle    proc13_4,  6
			jmp      code_02ab
code_028a:
			dup     
			ldi      3
			eq?     
			bnt      code_02a0
			pushi    3
			pushi    1705
			pushi    45
			pushi    1
			calle    proc13_4,  6
			jmp      code_02ab
code_02a0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_02ab:
			toss    
			ret     
		)
	)
)

(instance theWindow of Feature
	(properties
		x 90
		y 67
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    90
			pushi    114
			pushi    92
			pushi    77
			pushi    99
			pushi    69
			pushi    111
			pushi    67
			pushi    118
			pushi    74
			pushi    118
			pushi    115
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_036a
			pushi    3
			pushi    1705
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_038b
code_036a:
			dup     
			ldi      3
			eq?     
			bnt      code_0380
			pushi    3
			pushi    1705
			pushi    14
			pushi    1
			calle    proc13_4,  6
			jmp      code_038b
code_0380:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_038b:
			toss    
			ret     
		)
	)
)

(instance theDoor of Feature
	(properties
		x 174
		y 87
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    174
			dup     
			pushi    176
			pushi    115
			pushi    179
			pushi    100
			pushi    185
			pushi    92
			pushi    194
			pushi    87
			pushi    205
			pushi    88
			pushi    213
			pushi    93
			pushi    219
			pushi    100
			pushi    218
			pushi    181
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			pToa     onMeCheck
			send     4
			pushi    #dispose
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0434
			pushi    3
			pushi    1705
			pushi    15
			pushi    1
			calle    proc13_4,  6
			jmp      code_0455
code_0434:
			dup     
			ldi      3
			eq?     
			bnt      code_044a
			pushi    3
			pushi    1705
			pushi    16
			pushi    1
			calle    proc13_4,  6
			jmp      code_0455
code_044a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0455:
			toss    
			ret     
		)
	)
)

(instance rat1 of Prop
	(properties
		x 100
		y 188
		lookStr 11
		view 705
		loop 5
		signal $4001
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0514
			pushi    3
			pushi    1705
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_0535
code_0514:
			dup     
			ldi      3
			eq?     
			bnt      code_052a
			pushi    3
			pushi    1705
			pushi    47
			pushi    1
			calle    proc13_4,  6
			jmp      code_0535
code_052a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0535:
			toss    
			ret     
		)
	)
)

(instance rat2 of Prop
	(properties
		x 95
		y 182
		lookStr 11
		view 705
		loop 2
		signal $4001
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_05be
			pushi    3
			pushi    1705
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_05df
code_05be:
			dup     
			ldi      3
			eq?     
			bnt      code_05d4
			pushi    3
			pushi    1705
			pushi    47
			pushi    1
			calle    proc13_4,  6
			jmp      code_05df
code_05d4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_05df:
			toss    
			ret     
		)
	)
)

(instance rat3 of Prop
	(properties
		x 107
		y 176
		lookStr 11
		view 705
		loop 5
		signal $4001
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0668
			pushi    3
			pushi    1705
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_0689
code_0668:
			dup     
			ldi      3
			eq?     
			bnt      code_067e
			pushi    3
			pushi    1705
			pushi    47
			pushi    1
			calle    proc13_4,  6
			jmp      code_0689
code_067e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0689:
			toss    
			ret     
		)
	)
)

(instance theKnight of Actor
	(properties
		x 195
		y 188
		view 706
		signal $4000
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0712
			pushi    3
			pushi    1705
			pushi    17
			pushi    1
			calle    proc13_4,  6
			jmp      code_0874
code_0712:
			dup     
			ldi      3
			eq?     
			bnt      code_072e
			pushi    4
			lea      @local73
			push    
			lea      @local77
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0874
code_072e:
			dup     
			ldi      5
			eq?     
			bnt      code_076b
			lsl      local2
			ldi      0
			eq?     
			bnt      code_0756
			pushi    4
			lea      @local20
			push    
			pushi    2
			lea      @local77
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local2
			jmp      code_0874
code_0756:
			pushi    4
			lea      @local25
			push    
			lea      @local77
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0874
code_076b:
			dup     
			ldi      4
			eq?     
			bnt      code_0869
			pushi    5
			lsp      param2
			pushi    16
			pushi    0
			pushi    2
			pushi    14
			calle    proc999_5,  10
			bnt      code_0799
			pushi    3
			lea      @local30
			push    
			lea      @local77
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0874
code_0799:
			lsp      param2
			ldi      1
			eq?     
			bnt      code_07b5
			pushi    3
			lea      @local34
			push    
			lea      @local77
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0874
code_07b5:
			lsp      param2
			ldi      18
			eq?     
			bnt      code_07ef
			lal      local1
			not     
			bnt      code_07db
			ldi      1
			sal      local1
			pushi    3
			lea      @local38
			push    
			pushi    2
			lea      @local77
			push    
			calle    proc851_0,  6
			jmp      code_0874
code_07db:
			pushi    3
			lea      @local46
			push    
			lea      @local77
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0874
code_07ef:
			lsp      param2
			ldi      10
			eq?     
			bnt      code_0825
			lal      local0
			not     
			bnt      code_0811
			pushi    3
			lea      @local50
			push    
			pushi    2
			lea      @local77
			push    
			calle    proc851_0,  6
			jmp      code_0874
code_0811:
			pushi    3
			lea      @local56
			push    
			lea      @local77
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0874
code_0825:
			lsp      param2
			ldi      9
			eq?     
			bnt      code_085b
			pushi    1
			pushi    154
			callb    proc0_6,  2
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    3
			lea      @local60
			push    
			pushi    2
			lea      @local77
			push    
			calle    proc851_0,  6
			pushi    #put
			pushi    1
			pushi    9
			lag      global0
			send     6
			jmp      code_0874
code_085b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0874
code_0869:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0874:
			toss    
			ret     
		)
	)
)

(instance enterWindow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0949
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    708
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    99
			pushi    3
			pushi    1
			pushi    109
			pushi    18
			pushi    1
			pushi    0
			pushi    267
			pushi    1
			lofsa    robDoVerb
			push    
			pushi    107
			pushi    0
			pushi    302
			pushi    1
			pushi    32768
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     60
			jmp      code_0a8c
code_0949:
			dup     
			ldi      1
			eq?     
			bnt      code_0976
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    98
			pushi    3
			pushi    1
			pushi    108
			pushi    219
			pushi    1
			pushi    36
			lag      global0
			send     30
			ldi      12
			aTop     ticks
			jmp      code_0a8c
code_0976:
			dup     
			ldi      2
			eq?     
			bnt      code_099e
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    137
			pushi    3
			pushi    1
			pushi    150
			lag      global0
			send     24
			ldi      12
			aTop     ticks
			jmp      code_0a8c
code_099e:
			dup     
			ldi      3
			eq?     
			bnt      code_09d5
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    146
			pushi    3
			pushi    1
			pushi    169
			lag      global0
			send     24
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    1
			lofsa    theKnight
			send     12
			ldi      12
			aTop     ticks
			jmp      code_0a8c
code_09d5:
			dup     
			ldi      4
			eq?     
			bnt      code_0a08
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    150
			pushi    3
			pushi    1
			pushi    184
			pushi    56
			pushi    1
			pushi    6
			pushi    219
			pushi    1
			pushi    6
			lag      global0
			send     36
			ldi      12
			aTop     ticks
			jmp      code_0a8c
code_0a08:
			dup     
			ldi      5
			eq?     
			bnt      code_0a22
			pushi    3
			pushi    0
			pushi    702
			pushi    703
			callb    proc0_2,  6
			ldi      12
			aTop     ticks
			jmp      code_0a8c
code_0a22:
			dup     
			ldi      6
			eq?     
			bnt      code_0a3e
			pushi    4
			lea      @local3
			push    
			pushi    2
			lea      @local77
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0a8c
code_0a3e:
			dup     
			ldi      7
			eq?     
			bnt      code_0a8c
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    8
			pushi    110
			pushi    188
			pushi    189
			pushi    188
			pushi    172
			pushi    176
			pushi    115
			pushi    176
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    4
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0a8c:
			toss    
			ret     
		)
	)
)

(instance winKnightTrust of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0af1
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    theKnight
			send     8
			jmp      code_0b25
code_0af1:
			dup     
			ldi      1
			eq?     
			bnt      code_0b0e
			pushi    4
			lea      @local12
			push    
			pushi    3
			lea      @local77
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0b25
code_0b0e:
			dup     
			ldi      2
			eq?     
			bnt      code_0b25
			pushi    #newRoom
			pushi    1
			pushi    710
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0b25:
			toss    
			ret     
		)
	)
)

(instance ratsDoit of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #distanceTo
			pushi    1
			lofsa    rat3
			push    
			lag      global0
			send     6
			push    
			ldi      50
			lt?     
			bnt      code_0b8c
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    rat3
			send     18
code_0b8c:
			pushi    #distanceTo
			pushi    1
			lofsa    rat2
			push    
			lag      global0
			send     6
			push    
			ldi      50
			lt?     
			bnt      code_0bb0
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    rat2
			send     12
code_0bb0:
			pushi    #distanceTo
			pushi    1
			lofsa    rat1
			push    
			lag      global0
			send     6
			push    
			ldi      50
			lt?     
			bnt      code_0bd4
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			lofsa    rat1
			send     12
code_0bd4:
			ret     
		)
	)
)

(instance squeakSound of Sound
	(properties
		flags $0001
		number 671
		loop -1
	)
)
