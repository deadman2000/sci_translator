;;; Sierra Script 1.0 - (do not remove this comment)
(script# 570)
(include sci.sh)
(use n000)
(use n013)
(use n564)
(use n806)
(use n807)
(use n851)
(use n945)
(use n946)
(use n950)
(use n956)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm570 0
)

(local
	local0
	local1
	[local2 15]
	local17
	[local18 4] = [1570 0 1]
	[local22 5] = [1570 1 1 2]
	[local27 5] = [1570 3 2 1]
	[local32 5] = [1570 5 2 1]
	[local37 5] = [1570 7 1 2]
	[local42 4] = [1570 9 2]
	[local46 5] = [1570 10 2 1]
	[local51 5] = [1570 12 2 1]
	[local56 5] = [1570 14 1 1]
	[local61 4] = [1570 16 1]
	[local65 4] = [1570 17 1]
	[local69 4] = [1570 52 1]
	[local73 4] = [1410 0 1]
	[local77 4] = [1410 4 1]
	[local81 4] = [1410 6 1]
	[local85 4] = [1410 8 1]
	[local89 9] = [255 0 1 4 6 23 29 7 12]
	[local98 9] = [255 0 1 4 6 23 29 7 11]
	[local107 9] = [255 0 1 4 6 23 29 7 13]
)
(instance rm570 of Rm
	(properties
		picture 570
		east 561
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_4,  0
			ldi      1
			sal      local0
			pushi    2
			pushi    130
			pushi    956
			callk    Load,  4
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #coinsDoneBeenTook
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_0081
			ldi      1
			sal      local1
code_0036:
			lsl      local1
			pushi    #numberCoins
			pushi    0
			class    TheDungeon
			send     4
			le?     
			bnt      code_0081
			lsl      local1
			ldi      15
			lt?     
			bnt      code_0081
			pushi    66
			pushi    #superClass
			pushi    11
			pushi    107
			pushi    0
			pushi    284
			pushi    2
			pushi    2
			pushi    135
			pushi    150
			callk    Random,  4
			push    
			pushi    2
			pushi    121
			pushi    130
			callk    Random,  4
			push    
			pushi    #new
			pushi    0
			lofsa    coins
			send     4
			push    
			lal      local1
			sali     local2
			send     18
			+al      local1
			jmp      code_0036
code_0081:
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    44
			pushi    0
			pushi    0
			pushi    229
			pushi    0
			pushi    229
			pushi    154
			pushi    207
			pushi    132
			pushi    200
			pushi    133
			pushi    188
			pushi    130
			pushi    174
			pushi    129
			pushi    84
			pushi    129
			pushi    77
			pushi    130
			pushi    71
			pushi    133
			pushi    57
			pushi    137
			pushi    47
			pushi    153
			pushi    6
			pushi    148
			pushi    5
			pushi    152
			pushi    45
			pushi    157
			pushi    32
			pushi    187
			pushi    242
			pushi    187
			pushi    231
			pushi    158
			pushi    231
			pushi    0
			pushi    319
			pushi    0
			pushi    318
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     102
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    181
			pushi    137
			pushi    180
			pushi    146
			pushi    160
			pushi    155
			pushi    94
			pushi    155
			pushi    97
			pushi    137
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    154
			pushi    165
			pushi    159
			pushi    180
			pushi    101
			pushi    180
			pushi    108
			pushi    165
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     10
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			pushi    107
			pushi    0
			lofsa    theTorch
			send     10
			pushi    #init
			pushi    0
			lofsa    trapdoor
			send     4
			pushi    9
			lofsa    trapDoor
			push    
			lofsa    table
			push    
			lofsa    chair
			push    
			lofsa    stool
			push    
			lofsa    hiddenDoor
			push    
			lofsa    doorway
			push    
			lofsa    tunnel
			push    
			lofsa    floor
			push    
			lofsa    walls
			push    
			calle    proc806_3,  18
			pushi    #number
			pushi    1
			pushi    561
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			lsg      global12
			dup     
			ldi      561
			eq?     
			bnt      code_020e
			pushi    #add
			pushi    1
			lofsa    openDoor
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     16
			pushi    #guardsGone
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_01ff
			lsg      global130
			ldi      10
			ne?     
			bnt      code_01ff
			pushi    #setScript
			pushi    1
			lofsa    instantDeath1
			push    
			lag      global0
			send     6
			jmp      code_0260
code_01ff:
			pushi    #setScript
			pushi    1
			lofsa    enterRoom
			push    
			lag      global0
			send     6
			jmp      code_0260
code_020e:
			dup     
			ldi      390
			eq?     
			bnt      code_024c
			pushi    #add
			pushi    1
			lofsa    closedDoor
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     16
			pushi    #posn
			pushi    2
			pushi    22
			pushi    151
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			lofsa    blessing
			push    
			lag      global0
			send     6
			jmp      code_0260
code_024c:
			pushi    #posn
			pushi    2
			pushi    130
			pushi    127
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lag      global0
			send     18
code_0260:
			toss    
			pushi    0
			callb    proc0_2,  0
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_028d
			lal      local0
			bnt      code_02a7
			pushi    #setCycle
			pushi    1
			class    FootstepWalk
			push    
			lag      global0
			send     6
			ldi      0
			sal      local0
			jmp      code_02a7
code_028d:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_02a7
			lal      local0
			not     
			bnt      code_02a7
			pushi    0
			callb    proc0_2,  0
			ldi      1
			sal      local0
code_02a7:
			lsg      global164
			ldi      4
			eq?     
			bnt      code_02d6
			pushi    #trapDoorOpen
			pushi    0
			class    TheDungeon
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_02d6
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_02d6
			pushi    #setScript
			pushi    1
			lofsa    trembling
			push    
			lag      global2
			send     6
code_02d6:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0354
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      27
			lt?     
			bnt      code_0354
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0345
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    7
			pushi    1570
			pushi    18
			pushi    80
			lofsa    {Giles}
			push    
			pushi    67
			pushi    21
			pushi    165
			calle    proc13_4,  14
			pushi    7
			pushi    1570
			pushi    19
			pushi    80
			lofsa    {Roger}
			push    
			pushi    67
			pushi    21
			dup     
			calle    proc13_4,  14
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      31
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			jmp      code_0431
code_0345:
			pushi    #setScript
			pushi    1
			lofsa    comeBackHere
			push    
			lag      global0
			send     6
			jmp      code_0431
code_0354:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			bnt      code_0388
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_0388
			lal      local17
			not     
			bnt      code_0388
			ldi      1
			sal      local17
			pushi    #newRoom
			pushi    1
			pushi    561
			lag      global2
			send     6
			jmp      code_0431
code_0388:
			pushi    #timeToDie
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_03cc
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    instantDeath2
			ne?     
			bnt      code_03cc
			pushi    #script
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    instantDeath1
			ne?     
			bnt      code_03cc
			lal      local17
			not     
			bnt      code_03cc
			ldi      1
			sal      local17
			pushi    #setScript
			pushi    1
			lofsa    instantDeath2
			push    
			lag      global0
			send     6
			jmp      code_0431
code_03cc:
			pushi    #script
			pushi    0
			class    TheDungeon
			send     4
			push    
			pushi    2
			pushi    564
			pushi    3
			callk    ScriptID,  4
			eq?     
			bnt      code_0431
			pushi    #neverBefore
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0431
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    7
			pushi    1570
			pushi    20
			pushi    80
			lofsa    {Giles}
			push    
			pushi    67
			pushi    21
			pushi    165
			calle    proc13_4,  14
			pushi    7
			pushi    1570
			pushi    21
			pushi    80
			lofsa    {Roger}
			push    
			pushi    67
			pushi    21
			dup     
			calle    proc13_4,  14
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #neverBefore
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
code_0431:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    956
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance hob of Actor
	(properties
		x 84
		y 185
		view 254
		loop 1
		signal $0001
	)
)

(instance dicken of Actor
	(properties
		x 188
		y 180
		view 412
		loop 3
		signal $0001
	)
)

(instance hal of Actor
	(properties
		x 126
		y 177
		view 411
		loop 4
		signal $0001
	)
)

(instance roger of Actor
	(properties
		x 23
		y 153
		view 753
		signal $0001
	)
)

(instance giles of Actor
	(properties
		x 13
		y 153
		view 753
		signal $0001
	)
)

(instance jack of Actor
	(properties
		x 46
		y 154
		view 753
		signal $0001
	)
)

(instance trapDoor of Feature
	(properties
		lookStr 41
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    144
			pushi    166
			pushi    148
			pushi    177
			pushi    114
			pushi    177
			pushi    117
			pushi    166
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
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_07d1
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0850
code_07d1:
			dup     
			ldi      5
			eq?     
			bnt      code_080d
			lsg      global130
			ldi      10
			eq?     
			not     
			bnt      code_0850
			pushi    #trapDoorOpen
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0800
			pushi    3
			lea      @local18
			push    
			lea      @local89
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0850
code_0800:
			pushi    2
			pushi    1570
			pushi    23
			calle    proc13_4,  4
			jmp      code_0850
code_080d:
			dup     
			ldi      4
			eq?     
			bnt      code_0845
			pushi    #trapDoorOpen
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0850
			lsp      param2
			dup     
			ldi      13
			eq?     
			bnt      code_0837
			pushi    #setScript
			pushi    1
			lofsa    saveBoys
			push    
			lag      global0
			send     6
			jmp      code_0841
code_0837:
			pushi    2
			pushi    1570
			pushi    24
			calle    proc13_4,  4
code_0841:
			toss    
			jmp      code_0850
code_0845:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0850:
			toss    
			ret     
		)
	)
)

(instance table of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    154
			pushi    119
			pushi    154
			pushi    132
			pushi    153
			pushi    156
			pushi    148
			pushi    149
			pushi    145
			pushi    135
			pushi    115
			pushi    135
			pushi    115
			pushi    145
			pushi    106
			pushi    154
			pushi    102
			pushi    132
			pushi    110
			pushi    119
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     54
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_08b0
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0966
code_08b0:
			dup     
			ldi      2
			eq?     
			bnt      code_08c4
			pushi    2
			pushi    1570
			pushi    25
			calle    proc13_4,  4
			jmp      code_0966
code_08c4:
			dup     
			ldi      3
			eq?     
			bnt      code_08d8
			pushi    2
			pushi    1570
			pushi    26
			calle    proc13_4,  4
			jmp      code_0966
code_08d8:
			dup     
			ldi      4
			eq?     
			bnt      code_095b
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_08f7
			pushi    #setScript
			pushi    1
			lofsa    putCoins
			push    
			lag      global0
			send     6
			jmp      code_0957
code_08f7:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_094b
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    7
			pushi    1570
			pushi    18
			pushi    80
			lofsa    {Giles}
			push    
			pushi    67
			pushi    21
			pushi    65
			calle    proc13_4,  14
			pushi    7
			pushi    1570
			pushi    19
			pushi    80
			lofsa    {Roger}
			push    
			pushi    67
			pushi    21
			dup     
			calle    proc13_4,  14
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      31
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			jmp      code_0957
code_094b:
			pushi    #setScript
			pushi    1
			lofsa    instantDeath2
			push    
			lag      global0
			send     6
code_0957:
			toss    
			jmp      code_0966
code_095b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0966:
			toss    
			ret     
		)
	)
)

(instance chair of Feature
	(properties
		nsTop 115
		nsLeft 122
		nsBottom 144
		nsRight 139
		description 10691
		lookStr 27
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0a18
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0a70
code_0a18:
			dup     
			ldi      3
			eq?     
			bnt      code_0a2c
			pushi    2
			pushi    1570
			pushi    28
			calle    proc13_4,  4
			jmp      code_0a70
code_0a2c:
			dup     
			ldi      4
			eq?     
			bnt      code_0a65
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0a55
			pushi    #setScript
			pushi    1
			lofsa    putCoins
			push    
			lag      global0
			send     6
			pushi    2
			pushi    1570
			pushi    29
			calle    proc13_4,  4
			jmp      code_0a61
code_0a55:
			pushi    #setScript
			pushi    1
			lofsa    instantDeath2
			push    
			lag      global0
			send     6
code_0a61:
			toss    
			jmp      code_0a70
code_0a65:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0a70:
			toss    
			ret     
		)
	)
)

(instance stool of Feature
	(properties
		nsTop 132
		nsLeft 161
		nsBottom 144
		nsRight 171
		description 10707
		lookStr 30
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0acc
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0b24
code_0acc:
			dup     
			ldi      3
			eq?     
			bnt      code_0ae0
			pushi    2
			pushi    1570
			pushi    31
			calle    proc13_4,  4
			jmp      code_0b24
code_0ae0:
			dup     
			ldi      4
			eq?     
			bnt      code_0b19
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0b09
			pushi    #setScript
			pushi    1
			lofsa    putCoins
			push    
			lag      global0
			send     6
			pushi    2
			pushi    1570
			pushi    29
			calle    proc13_4,  4
			jmp      code_0b15
code_0b09:
			pushi    #setScript
			pushi    1
			lofsa    instantDeath2
			push    
			lag      global0
			send     6
code_0b15:
			toss    
			jmp      code_0b24
code_0b19:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_0b24:
			toss    
			ret     
		)
	)
)

(instance hiddenDoor of Feature
	(properties
		nsTop 100
		nsLeft 230
		nsBottom 155
		nsRight 241
		description 10723
		lookStr 32
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0b80
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0b9f
code_0b80:
			dup     
			ldi      3
			eq?     
			bnt      code_0b94
			pushi    2
			pushi    1570
			pushi    33
			calle    proc13_4,  4
			jmp      code_0b9f
code_0b94:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0b9f:
			toss    
			ret     
		)
	)
)

(instance doorway of Feature
	(properties
		nsTop 78
		nsLeft 28
		nsBottom 160
		nsRight 38
		description 10750
		lookStr 34
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0bfc
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0c1b
code_0bfc:
			dup     
			ldi      3
			eq?     
			bnt      code_0c10
			pushi    2
			pushi    1570
			pushi    35
			calle    proc13_4,  4
			jmp      code_0c1b
code_0c10:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0c1b:
			toss    
			ret     
		)
	)
)

(instance floor of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    190
			pushi    130
			pushi    214
			pushi    183
			pushi    47
			pushi    183
			pushi    76
			pushi    132
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0c78
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0c97
code_0c78:
			dup     
			ldi      2
			eq?     
			bnt      code_0c8c
			pushi    2
			pushi    1570
			pushi    36
			calle    proc13_4,  4
			jmp      code_0c97
code_0c8c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0c97:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties
		nsBottom 189
		nsRight 319
		description 10776
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0d2a
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0d49
code_0d2a:
			dup     
			ldi      2
			eq?     
			bnt      code_0d3e
			pushi    2
			pushi    1570
			pushi    37
			calle    proc13_4,  4
			jmp      code_0d49
code_0d3e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0d49:
			toss    
			ret     
		)
	)
)

(instance tunnel of Feature
	(properties
		nsTop 2
		nsLeft 284
		nsBottom 188
		nsRight 318
		description 10792
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0da6
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0dc5
code_0da6:
			dup     
			ldi      2
			eq?     
			bnt      code_0dba
			pushi    2
			pushi    1570
			pushi    38
			calle    proc13_4,  4
			jmp      code_0dc5
code_0dba:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0dc5:
			toss    
			ret     
		)
	)
)

(instance dickenWithRope of Prop
	(properties
		x 171
		y 146
		view 412
		loop 4
	)
)

(instance rope of Prop
	(properties
		x 171
		y 7
		view 412
	)
)

(instance theTorch of Prop
	(properties
		x 133
		y 103
		description 10830
		lookStr 39
		view 570
		loop 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0eee
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_0f0d
code_0eee:
			dup     
			ldi      3
			eq?     
			bnt      code_0f02
			pushi    2
			pushi    1570
			pushi    40
			calle    proc13_4,  4
			jmp      code_0f0d
code_0f02:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0f0d:
			toss    
			ret     
		)
	)
)

(instance trapdoor of Prop
	(properties
		x 147
		y 177
		description 10849
		lookStr 41
		view 570
		signal $4001
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_0f94
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_10b1
code_0f94:
			dup     
			ldi      3
			eq?     
			bnt      code_1031
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0fb0
			pushi    2
			pushi    1570
			pushi    42
			calle    proc13_4,  4
			jmp      code_10b1
code_0fb0:
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     4
			not     
			bnt      code_0fd1
			pushi    #setScript
			pushi    1
			lofsa    instantDeath3
			push    
			lag      global0
			send     6
			jmp      code_10b1
code_0fd1:
			pushi    1
			pushi    188
			callb    proc0_5,  2
			not     
			bnt      code_0feb
			pushi    #setScript
			pushi    1
			lofsa    firstTimeOpen
			push    
			lag      global0
			send     6
			jmp      code_10b1
code_0feb:
			pushi    #doneTalking
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_1006
			pushi    #setScript
			pushi    1
			lofsa    backAgain
			push    
			lag      global0
			send     6
			jmp      code_10b1
code_1006:
			pushi    #trapDoorOpen
			pushi    0
			class    TheDungeon
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_1024
			pushi    #setScript
			pushi    1
			lofsa    openIt
			push    
			lag      global0
			send     6
			jmp      code_10b1
code_1024:
			pushi    2
			pushi    1570
			pushi    43
			calle    proc13_4,  4
			jmp      code_10b1
code_1031:
			dup     
			ldi      5
			eq?     
			bnt      code_106e
			lsg      global130
			ldi      10
			eq?     
			not     
			bnt      code_10b1
			pushi    #trapDoorOpen
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_1061
			pushi    4
			lea      @local18
			push    
			lea      @local89
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_10b1
code_1061:
			pushi    2
			pushi    1570
			pushi    23
			calle    proc13_4,  4
			jmp      code_10b1
code_106e:
			dup     
			ldi      4
			eq?     
			bnt      code_10a6
			pushi    #trapDoorOpen
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_10b1
			lsp      param2
			dup     
			ldi      13
			eq?     
			bnt      code_1098
			pushi    #setScript
			pushi    1
			lofsa    saveBoys
			push    
			lag      global0
			send     6
			jmp      code_10a2
code_1098:
			pushi    2
			pushi    1570
			pushi    24
			calle    proc13_4,  4
code_10a2:
			toss    
			jmp      code_10b1
code_10a6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_10b1:
			toss    
			ret     
		)
	)
)

(instance robes of View
	(properties
		x 164
		y 177
		view 570
		loop 4
		cel 1
	)
)

(instance coins of View
	(properties
		x 143
		y 129
		description 10877
		lookStr 44
		view 570
		loop 3
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_1194
			pushi    2
			pushi    1570
			pushi    22
			calle    proc13_4,  4
			jmp      code_11b5
code_1194:
			dup     
			ldi      3
			eq?     
			bnt      code_11aa
			pushi    #setScript
			pushi    1
			lofsa    getCoins
			push    
			lag      global0
			send     6
			jmp      code_11b5
code_11aa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_11b5:
			toss    
			ret     
		)
	)
)

(instance closedDoor of PicView
	(properties
		x 240
		y 163
		description 10893
		view 570
		loop 1
	)
)

(instance openDoor of PicView
	(properties
		x 239
		y 166
		description 10893
		view 570
		loop 1
		cel 1
		priority 11
		signal $4000
	)
)

(instance instantDeath1 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_133a
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     6
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    3
			callk    ScriptID,  4
			send     6
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    155
			pushi    140
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    #posn
			pushi    2
			pushi    211
			pushi    179
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     18
			pushi    #posn
			pushi    2
			pushi    240
			pushi    155
			pushi    107
			pushi    0
			lag      global0
			send     12
			ldi      2
			aTop     cycles
			jmp      code_13f1
code_133a:
			dup     
			ldi      1
			eq?     
			bnt      code_135c
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    225
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_13f1
code_135c:
			dup     
			ldi      2
			eq?     
			bnt      code_137f
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pushi    1570
			pushi    45
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_13f1
code_137f:
			dup     
			ldi      3
			eq?     
			bnt      code_139b
			pushi    5
			pushi    1570
			pushi    46
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_13f1
code_139b:
			dup     
			ldi      4
			eq?     
			bnt      code_13cc
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    211
			pushi    155
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    170
			pushi    140
			pushSelf
			lofsa    giles
			send     12
			jmp      code_13f1
code_13cc:
			dup     
			ldi      5
			eq?     
			bnt      code_13f1
			pushi    1
			pushi    0
			calle    proc13_6,  2
			ldi      32
			sag      global145
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_13f1:
			toss    
			ret     
		)
	)
)

(instance instantDeath2 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14ae
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     6
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    3
			callk    ScriptID,  4
			send     6
			pushi    0
			callb    proc0_3,  0
			pushi    0
			callb    proc0_2,  0
			ldi      1
			sal      local0
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    215
			pushi    155
			lag      global0
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    70
			pushi    153
			pushSelf
			lofsa    giles
			send     22
			jmp      code_1555
code_14ae:
			dup     
			ldi      1
			eq?     
			bnt      code_14d5
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    153
			pushSelf
			lofsa    roger
			send     22
			jmp      code_1555
code_14d5:
			dup     
			ldi      2
			eq?     
			bnt      code_14f8
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pushi    1570
			pushi    47
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1555
code_14f8:
			dup     
			ldi      3
			eq?     
			bnt      code_1514
			pushi    5
			pushi    1570
			pushi    48
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1555
code_1514:
			dup     
			ldi      4
			eq?     
			bnt      code_1530
			pushi    5
			pushi    1570
			pushi    49
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1555
code_1530:
			dup     
			ldi      5
			eq?     
			bnt      code_1555
			ldi      32
			sag      global145
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1555:
			toss    
			ret     
		)
	)
)

(instance instantDeath3 of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_15e2
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     6
			pushi    #seconds
			pushi    1
			pushi    2000
			pushi    2
			pushi    564
			pushi    3
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    2
			lofsa    openIt
			push    
			pushSelf
			self     8
			jmp      code_16a4
code_15e2:
			dup     
			ldi      1
			eq?     
			bnt      code_160d
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    70
			pushi    153
			pushSelf
			lofsa    giles
			send     22
			jmp      code_16a4
code_160d:
			dup     
			ldi      2
			eq?     
			bnt      code_1634
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    40
			pushi    153
			pushSelf
			lofsa    roger
			send     22
			jmp      code_16a4
code_1634:
			dup     
			ldi      3
			eq?     
			bnt      code_165e
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    8
			pushi    1570
			pushi    18
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			pushi    67
			pushi    21
			pushi    165
			calle    proc13_4,  16
			jmp      code_16a4
code_165e:
			dup     
			ldi      4
			eq?     
			bnt      code_167f
			pushi    8
			pushi    1570
			pushi    19
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			pushi    67
			pushi    21
			dup     
			calle    proc13_4,  16
			jmp      code_16a4
code_167f:
			dup     
			ldi      5
			eq?     
			bnt      code_16a4
			pushi    0
			callb    proc0_4,  0
			ldi      32
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_16a4:
			toss    
			ret     
		)
	)
)

(instance blessing of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1764
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #posn
			pushi    2
			pushi    203
			pushi    140
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    #posn
			pushi    2
			pushi    239
			pushi    177
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     18
			pushi    2
			lofsa    roger
			push    
			lofsa    jack
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    giles
			push    
			lofsa    jack
			push    
			callb    proc0_9,  4
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65
			pushi    138
			pushSelf
			lofsa    jack
			send     22
			jmp      code_1956
code_1764:
			dup     
			ldi      1
			eq?     
			bnt      code_178c
			pushi    2
			lofsa    jack
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    64
			pushi    156
			pushSelf
			lag      global0
			send     12
			jmp      code_1956
code_178c:
			dup     
			ldi      2
			eq?     
			bnt      code_17af
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pushi    1570
			pushi    50
			pushSelf
			pushi    80
			lofsa    {Jack}
			push    
			calle    proc13_4,  10
			jmp      code_1956
code_17af:
			dup     
			ldi      3
			eq?     
			bnt      code_17cb
			pushi    5
			pushi    1570
			pushi    51
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1956
code_17cb:
			dup     
			ldi      4
			eq?     
			bnt      code_17ec
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    4
			lea      @local69
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1956
code_17ec:
			dup     
			ldi      5
			eq?     
			bnt      code_180f
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pushi    1570
			pushi    53
			pushSelf
			pushi    80
			lofsa    {Jack}
			push    
			calle    proc13_4,  10
			jmp      code_1956
code_180f:
			dup     
			ldi      6
			eq?     
			bnt      code_1831
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    84
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_1956
code_1831:
			dup     
			ldi      7
			eq?     
			bnt      code_1846
			pushi    #setScript
			pushi    2
			lofsa    blessBoys
			push    
			pushSelf
			self     8
			jmp      code_1956
code_1846:
			dup     
			ldi      8
			eq?     
			bnt      code_1854
			ldi      1
			aTop     cycles
			jmp      code_1956
code_1854:
			dup     
			ldi      9
			eq?     
			bnt      code_187b
			ldi      1
			aTop     notKilled
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pushi    1570
			pushi    54
			pushSelf
			pushi    80
			lofsa    {Jack}
			push    
			calle    proc13_4,  10
			jmp      code_1956
code_187b:
			dup     
			ldi      10
			eq?     
			bnt      code_18bd
			pushi    #view
			pushi    1
			pushi    411
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    5
			pushi    219
			pushi    1
			pushi    24
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    65535
			pushSelf
			lag      global0
			send     36
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    trapdoor
			send     14
			jmp      code_1956
code_18bd:
			dup     
			ldi      11
			eq?     
			bnt      code_18e7
			pushi    #number
			pushi    1
			pushi    563
			pushi    42
			pushi    0
			lofsa    trapDoorSound
			send     10
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_1956
code_18e7:
			dup     
			ldi      12
			eq?     
			bnt      code_1911
			pushi    1
			pushi    2
			callb    proc0_2,  2
			ldi      1
			sal      local0
			pushi    #trapDoorOpen
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			ldi      2
			aTop     cycles
			jmp      code_1956
code_1911:
			dup     
			ldi      13
			eq?     
			bnt      code_192d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    75
			pushi    160
			pushSelf
			lag      global0
			send     12
			jmp      code_1956
code_192d:
			dup     
			ldi      14
			eq?     
			bnt      code_1956
			pushi    #newRoom
			pushi    1
			pushi    390
			lag      global2
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1956:
			toss    
			ret     
		)
	)
)

(instance enterRoom of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19bc
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    230
			pushi    158
			pushi    107
			pushi    0
			lag      global0
			send     12
			ldi      12
			aTop     ticks
			jmp      code_19f1
code_19bc:
			dup     
			ldi      1
			eq?     
			bnt      code_19d9
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    205
			pushi    158
			pushSelf
			lag      global0
			send     12
			jmp      code_19f1
code_19d9:
			dup     
			ldi      2
			eq?     
			bnt      code_19f1
			pushi    0
			callb    proc0_2,  0
			ldi      1
			sal      local0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_19f1:
			toss    
			ret     
		)
	)
)

(instance firstTimeOpen of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a48
			pushi    #setScript
			pushi    2
			lofsa    openIt
			push    
			pushSelf
			self     8
			jmp      code_1ad9
code_1a48:
			dup     
			ldi      1
			eq?     
			bnt      code_1a69
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local22
			push    
			pushi    9
			lea      @local107
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1ad9
code_1a69:
			dup     
			ldi      2
			eq?     
			bnt      code_1a86
			pushi    4
			lea      @local27
			push    
			pushi    9
			lea      @local98
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1ad9
code_1a86:
			dup     
			ldi      3
			eq?     
			bnt      code_1aa3
			pushi    4
			lea      @local32
			push    
			pushi    9
			lea      @local89
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1ad9
code_1aa3:
			dup     
			ldi      4
			eq?     
			bnt      code_1ad9
			pushi    1
			pushi    2
			callb    proc0_2,  2
			ldi      1
			sal      local0
			ldi      0
			sag      global164
			pushi    #doneTalking
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #trapDoorOpen
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    1
			pushi    188
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1ad9:
			toss    
			ret     
		)
	)
)

(instance backAgain of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b32
			pushi    #setScript
			pushi    2
			lofsa    openIt
			push    
			pushSelf
			self     8
			jmp      code_1bdf
code_1b32:
			dup     
			ldi      1
			eq?     
			bnt      code_1b53
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local37
			push    
			pushi    9
			lea      @local98
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1bdf
code_1b53:
			dup     
			ldi      2
			eq?     
			bnt      code_1b70
			pushi    4
			lea      @local42
			push    
			pushi    9
			lea      @local107
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1bdf
code_1b70:
			dup     
			ldi      3
			eq?     
			bnt      code_1b8d
			pushi    4
			lea      @local46
			push    
			pushi    9
			lea      @local98
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1bdf
code_1b8d:
			dup     
			ldi      4
			eq?     
			bnt      code_1baa
			pushi    4
			lea      @local51
			push    
			pushi    9
			lea      @local89
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1bdf
code_1baa:
			dup     
			ldi      5
			eq?     
			bnt      code_1bdf
			pushi    0
			callb    proc0_2,  0
			ldi      1
			sal      local0
			ldi      0
			sag      global164
			pushi    #doneTalking
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #trapDoorOpen
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    1
			pushi    188
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_1bdf:
			toss    
			ret     
		)
	)
)

(instance putCoins of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c44
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    139
			pushi    156
			pushSelf
			lag      global0
			send     12
			jmp      code_1d29
code_1c44:
			dup     
			ldi      1
			eq?     
			bnt      code_1cb9
			pushi    2
			lsg      global0
			lofsa    table
			push    
			callb    proc0_9,  4
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_1c78
			pushi    2
			pushi    75
			pushi    165
			calle    proc806_1,  4
			pushi    #coinsLeft
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
code_1c78:
			pushi    640
			pushi    1
			pushi    #taken
			pushi    0
			lag      global133
			send     4
			push    
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			add     
			push    
			pushi    #taken
			pushi    0
			lag      global135
			send     4
			add     
			push    
			class    TheDungeon
			send     6
			pushi    #valueCoins
			pushi    1
			pushi    #get
			pushi    0
			pushi    666
			pushi    0
			lag      global152
			send     8
			push    
			class    TheDungeon
			send     6
			ldi      2
			aTop     cycles
			jmp      code_1d29
code_1cb9:
			dup     
			ldi      2
			eq?     
			bnt      code_1d29
			ldi      1
			sal      local1
code_1cc4:
			lsl      local1
			pushi    #numberCoins
			pushi    0
			class    TheDungeon
			send     4
			le?     
			bnt      code_1d0f
			lsl      local1
			ldi      15
			lt?     
			bnt      code_1d0f
			pushi    66
			pushi    #superClass
			pushi    11
			pushi    107
			pushi    0
			pushi    284
			pushi    2
			pushi    2
			pushi    135
			pushi    150
			callk    Random,  4
			push    
			pushi    2
			pushi    121
			pushi    130
			callk    Random,  4
			push    
			pushi    #new
			pushi    0
			lofsa    coins
			send     4
			push    
			lal      local1
			sali     local2
			send     18
			+al      local1
			jmp      code_1cc4
code_1d0f:
			pushi    0
			callb    proc0_2,  0
			pushi    #coinsDoneBeenTook
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			ldi      1
			sal      local0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1d29:
			toss    
			ret     
		)
	)
)

(instance getCoins of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d8c
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    139
			pushi    156
			pushSelf
			lag      global0
			send     12
			jmp      code_1e10
code_1d8c:
			dup     
			ldi      1
			eq?     
			bnt      code_1dad
			pushi    2
			lsg      global0
			lofsa    table
			push    
			callb    proc0_9,  4
			pushi    #get
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      2
			aTop     cycles
			jmp      code_1e10
code_1dad:
			dup     
			ldi      2
			eq?     
			bnt      code_1e10
			ldi      1
			sal      local1
code_1db8:
			lsl      local1
			pushi    #numberCoins
			pushi    0
			class    TheDungeon
			send     4
			le?     
			bnt      code_1ddc
			lsl      local1
			ldi      15
			lt?     
			bnt      code_1ddc
			pushi    #dispose
			pushi    0
			lal      local1
			lali     local2
			send     4
			+al      local1
			jmp      code_1db8
code_1ddc:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #numberCoins
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #valueCoins
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #coinsLeft
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_2,  0
			ldi      1
			sal      local0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1e10:
			toss    
			ret     
		)
	)
)

(instance saveBoys of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1ea7
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    1
			pushi    212
			callb    proc0_7,  2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      131
			ne?     
			bnt      code_1ea0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      165
			ne?     
			bnt      code_1ea0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    131
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_236f
code_1ea0:
			ldi      2
			aTop     ticks
			jmp      code_236f
code_1ea7:
			dup     
			ldi      1
			eq?     
			bnt      code_1ec7
			pushi    #view
			pushi    1
			pushi    23
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    4
			lag      global0
			send     18
			ldi      3
			aTop     cycles
			jmp      code_236f
code_1ec7:
			dup     
			ldi      2
			eq?     
			bnt      code_1ef3
			pushi    #setScript
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #longTimerGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    4
			lea      @local56
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_236f
code_1ef3:
			dup     
			ldi      3
			eq?     
			bnt      code_1f20
			pushi    #view
			pushi    1
			pushi    411
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    3
			pushi    150
			pushi    3
			class    ForwardCounter
			push    
			pushi    3
			pushSelf
			lag      global0
			send     34
			jmp      code_236f
code_1f20:
			dup     
			ldi      4
			eq?     
			bnt      code_1f2e
			ldi      60
			aTop     ticks
			jmp      code_236f
code_1f2e:
			dup     
			ldi      5
			eq?     
			bnt      code_1f48
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_236f
code_1f48:
			dup     
			ldi      6
			eq?     
			bnt      code_1f6a
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_1f6a:
			dup     
			ldi      7
			eq?     
			bnt      code_1f8c
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_1f8c:
			dup     
			ldi      8
			eq?     
			bnt      code_1fae
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_1fae:
			dup     
			ldi      9
			eq?     
			bnt      code_1fd0
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_1fd0:
			dup     
			ldi      10
			eq?     
			bnt      code_1ff2
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_1ff2:
			dup     
			ldi      11
			eq?     
			bnt      code_200c
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			ldi      2
			aTop     seconds
			jmp      code_236f
code_200c:
			dup     
			ldi      12
			eq?     
			bnt      code_2016
			jmp      code_236f
code_2016:
			dup     
			ldi      13
			eq?     
			bnt      code_205a
			pushi    #x
			pushi    1
			pushi    126
			pushi    3
			pushi    1
			pushi    177
			pushi    17
			pushi    1
			pushi    1
			pushi    5
			pushi    1
			pushi    411
			pushi    6
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			lofsa    hal
			send     34
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lag      global0
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    hal
			send     8
			jmp      code_236f
code_205a:
			dup     
			ldi      14
			eq?     
			bnt      code_2074
			pushi    4
			lea      @local61
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_236f
code_2074:
			dup     
			ldi      15
			eq?     
			bnt      code_208e
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_236f
code_208e:
			dup     
			ldi      16
			eq?     
			bnt      code_20b0
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_20b0:
			dup     
			ldi      17
			eq?     
			bnt      code_20d2
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_20d2:
			dup     
			ldi      18
			eq?     
			bnt      code_20f4
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_20f4:
			dup     
			ldi      19
			eq?     
			bnt      code_2116
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_2116:
			dup     
			ldi      20
			eq?     
			bnt      code_2138
			pushi    288
			pushi    #superClass
			pushi    #cel
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_236f
code_2138:
			dup     
			ldi      21
			eq?     
			bnt      code_2152
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			ldi      2
			aTop     seconds
			jmp      code_236f
code_2152:
			dup     
			ldi      22
			eq?     
			bnt      code_215c
			jmp      code_236f
code_215c:
			dup     
			ldi      23
			eq?     
			bnt      code_21de
			pushi    #init
			pushi    0
			lofsa    robes
			send     4
			pushi    #put
			pushi    1
			pushi    13
			lag      global0
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    410
			pushi    10
			lag      global2
			send     8
			pushi    #x
			pushi    1
			pushi    84
			pushi    3
			pushi    1
			pushi    185
			pushi    17
			pushi    1
			pushi    1
			pushi    5
			pushi    1
			pushi    254
			pushi    6
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    hob
			send     34
			pushi    #x
			pushi    1
			pushi    188
			pushi    3
			pushi    1
			pushi    180
			pushi    17
			pushi    1
			pushi    1
			pushi    5
			pushi    1
			pushi    412
			pushi    6
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			lofsa    dicken
			send     34
			pushi    #init
			pushi    0
			lofsa    rope
			send     4
			ldi      12
			aTop     ticks
			jmp      code_236f
code_21de:
			dup     
			ldi      24
			eq?     
			bnt      code_21f5
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    rope
			send     8
			jmp      code_236f
code_21f5:
			dup     
			ldi      25
			eq?     
			bnt      code_2218
			pushi    1
			pushi    13
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    9
			pushSelf
			pushi    80
			lofsa    {Dicken}
			push    
			calle    proc13_4,  10
			jmp      code_236f
code_2218:
			dup     
			ldi      26
			eq?     
			bnt      code_223b
			pushi    1
			pushi    12
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    10
			pushSelf
			pushi    80
			lofsa    {Hob}
			push    
			calle    proc13_4,  10
			jmp      code_236f
code_223b:
			dup     
			ldi      27
			eq?     
			bnt      code_2258
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    dicken
			send     8
			jmp      code_236f
code_2258:
			dup     
			ldi      28
			eq?     
			bnt      code_227e
			pushi    #dispose
			pushi    0
			lofsa    rope
			send     4
			pushi    #dispose
			pushi    0
			lofsa    dicken
			send     4
			pushi    #init
			pushi    0
			lofsa    dickenWithRope
			send     4
			ldi      12
			aTop     ticks
			jmp      code_236f
code_227e:
			dup     
			ldi      29
			eq?     
			bnt      code_229b
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    dickenWithRope
			send     14
			jmp      code_236f
code_229b:
			dup     
			ldi      30
			eq?     
			bnt      code_22bf
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    dickenWithRope
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    hob
			send     8
			ldi      12
			aTop     ticks
			jmp      code_236f
code_22bf:
			dup     
			ldi      31
			eq?     
			bnt      code_231f
			pushi    #drawPic
			pushi    2
			pushi    570
			pushi    10
			lag      global2
			send     8
			pushi    #view
			pushi    1
			pushi    412
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    6
			pushi    284
			pushi    2
			pushi    202
			pushi    170
			pushi    107
			pushi    0
			lofsa    dicken
			send     30
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #x
			pushi    1
			pushi    94
			pushi    3
			pushi    1
			pushi    179
			pushi    5
			pushi    1
			pushi    254
			pushi    6
			pushi    1
			pushi    2
			lofsa    hal
			send     24
			ldi      12
			aTop     ticks
			jmp      code_236f
code_231f:
			dup     
			ldi      32
			eq?     
			bnt      code_2339
			pushi    4
			lea      @local65
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_236f
code_2339:
			dup     
			ldi      33
			eq?     
			bnt      code_236f
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    125
			callb    proc0_6,  2
			pushi    #boysRescued
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    2
			pushi    150
			pushi    56
			calle    proc806_1,  4
			pushi    #newRoom
			pushi    1
			pushi    561
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_236f:
			toss    
			ret     
		)
	)
)

(instance comeBackHere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23c5
			pushi    0
			callb    proc0_3,  0
			ldi      2
			aTop     seconds
			jmp      code_2400
code_23c5:
			dup     
			ldi      1
			eq?     
			bnt      code_23e6
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    40
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2400
code_23e6:
			dup     
			ldi      2
			eq?     
			bnt      code_2400
			pushi    2
			pushi    1570
			pushi    55
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2400:
			toss    
			ret     
		)
	)
)

(instance blessBoys of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2456
			pushi    #setScript
			pushi    2
			lofsa    openIt
			push    
			pushSelf
			self     8
			jmp      code_2697
code_2456:
			dup     
			ldi      1
			eq?     
			bnt      code_24d0
			pushi    0
			callb    proc0_3,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    410
			pushi    10
			lag      global2
			send     8
			pushi    #view
			pushi    1
			pushi    254
			pushi    6
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    72
			pushi    183
			pushi    107
			pushi    0
			lofsa    hal
			send     24
			pushi    #view
			pushi    1
			pushi    254
			pushi    6
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    109
			pushi    179
			pushi    107
			pushi    0
			lofsa    hob
			send     24
			pushi    #view
			pushi    1
			pushi    412
			pushi    6
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    266
			pushi    184
			pushi    107
			pushi    0
			lofsa    dicken
			send     24
			ldi      3
			aTop     cycles
			jmp      code_2697
code_24d0:
			dup     
			ldi      2
			eq?     
			bnt      code_24ee
			ldi      1
			aTop     notKilled
			pushi    4
			lea      @local73
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2697
code_24ee:
			dup     
			ldi      3
			eq?     
			bnt      code_2511
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    hal
			send     6
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    dicken
			send     8
			jmp      code_2697
code_2511:
			dup     
			ldi      4
			eq?     
			bnt      code_2533
			pushi    1
			pushi    12
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    1
			pushSelf
			pushi    80
			lofsa    {Hob}
			push    
			calle    proc13_4,  10
			jmp      code_2697
code_2533:
			dup     
			ldi      5
			eq?     
			bnt      code_2555
			pushi    1
			pushi    13
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    2
			pushSelf
			pushi    80
			lofsa    {Dicken}
			push    
			calle    proc13_4,  10
			jmp      code_2697
code_2555:
			dup     
			ldi      6
			eq?     
			bnt      code_2578
			pushi    1
			pushi    11
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    3
			pushSelf
			pushi    80
			lofsa    {Hal}
			push    
			calle    proc13_4,  10
			jmp      code_2697
code_2578:
			dup     
			ldi      7
			eq?     
			bnt      code_2598
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    4
			lea      @local77
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2697
code_2598:
			dup     
			ldi      8
			eq?     
			bnt      code_25af
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    hal
			send     8
			jmp      code_2697
code_25af:
			dup     
			ldi      9
			eq?     
			bnt      code_25d2
			pushi    1
			pushi    11
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    5
			pushSelf
			pushi    80
			lofsa    {Hal}
			push    
			calle    proc13_4,  10
			jmp      code_2697
code_25d2:
			dup     
			ldi      10
			eq?     
			bnt      code_25f2
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    4
			lea      @local81
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2697
code_25f2:
			dup     
			ldi      11
			eq?     
			bnt      code_2615
			pushi    1
			pushi    19
			calle    proc13_6,  2
			pushi    5
			pushi    1410
			pushi    7
			pushSelf
			pushi    80
			lofsa    {Jack}
			push    
			calle    proc13_4,  10
			jmp      code_2697
code_2615:
			dup     
			ldi      12
			eq?     
			bnt      code_2635
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    4
			lea      @local85
			push    
			pushi    9
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2697
code_2635:
			dup     
			ldi      13
			eq?     
			bnt      code_2697
			pushi    1
			pushi    188
			callb    proc0_6,  2
			pushi    #hide
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    hal
			send     12
			pushi    #hide
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    hob
			send     12
			pushi    #hide
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    dicken
			send     12
			pushi    #drawPic
			pushi    2
			pushi    570
			pushi    10
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    #add
			pushi    1
			lofsa    closedDoor
			push    
			pushi    60
			pushi    0
			lag      global10
			send     10
			pushi    #dispose
			pushi    0
			self     4
code_2697:
			toss    
			ret     
		)
	)
)

(instance trembling of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_270b
			pushi    0
			callb    proc0_3,  0
			pushi    #trapDoorOpen
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    trapdoor
			send     4
			push    
			ldi      1
			sub     
			push    
			lofsa    trapdoor
			send     6
			ldi      2
			aTop     cycles
			jmp      code_27f5
code_270b:
			dup     
			ldi      1
			eq?     
			bnt      code_272e
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    trapdoor
			send     4
			push    
			ldi      1
			add     
			push    
			lofsa    trapdoor
			send     6
			ldi      2
			aTop     cycles
			jmp      code_27f5
code_272e:
			dup     
			ldi      2
			eq?     
			bnt      code_2751
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    trapdoor
			send     4
			push    
			ldi      1
			sub     
			push    
			lofsa    trapdoor
			send     6
			ldi      2
			aTop     cycles
			jmp      code_27f5
code_2751:
			dup     
			ldi      3
			eq?     
			bnt      code_2774
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    trapdoor
			send     4
			push    
			ldi      1
			add     
			push    
			lofsa    trapdoor
			send     6
			ldi      2
			aTop     cycles
			jmp      code_27f5
code_2774:
			dup     
			ldi      4
			eq?     
			bnt      code_2797
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    trapdoor
			send     4
			push    
			ldi      1
			sub     
			push    
			lofsa    trapdoor
			send     6
			ldi      2
			aTop     cycles
			jmp      code_27f5
code_2797:
			dup     
			ldi      5
			eq?     
			bnt      code_27ba
			pushi    4
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    trapdoor
			send     4
			push    
			ldi      1
			add     
			push    
			lofsa    trapdoor
			send     6
			ldi      2
			aTop     cycles
			jmp      code_27f5
code_27ba:
			dup     
			ldi      6
			eq?     
			bnt      code_27d7
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    trapdoor
			send     14
			jmp      code_27f5
code_27d7:
			dup     
			ldi      7
			eq?     
			bnt      code_27f5
			pushi    #number
			pushi    1
			pushi    562
			pushi    42
			pushi    0
			lofsa    trapDoorSound
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_27f5:
			toss    
			ret     
		)
	)
)

(instance openIt of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2858
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    131
			pushi    165
			pushSelf
			lag      global0
			send     12
			jmp      code_290d
code_2858:
			dup     
			ldi      1
			eq?     
			bnt      code_2878
			pushi    #view
			pushi    1
			pushi    23
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    4
			lag      global0
			send     18
			ldi      3
			aTop     cycles
			jmp      code_290d
code_2878:
			dup     
			ldi      2
			eq?     
			bnt      code_28a5
			pushi    #view
			pushi    1
			pushi    411
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    24
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     36
			jmp      code_290d
code_28a5:
			dup     
			ldi      3
			eq?     
			bnt      code_28d9
			pushi    #view
			pushi    1
			pushi    411
			pushi    219
			pushi    1
			pushi    24
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     18
			pushi    #cycleSpeed
			pushi    1
			pushi    24
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    trapdoor
			send     14
			jmp      code_290d
code_28d9:
			dup     
			ldi      4
			eq?     
			bnt      code_290d
			pushi    #number
			pushi    1
			pushi    563
			pushi    42
			pushi    0
			lofsa    trapDoorSound
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    2
			callb    proc0_2,  2
			ldi      1
			sal      local0
			ldi      0
			sag      global164
			pushi    #trapDoorOpen
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_290d:
			toss    
			ret     
		)
	)
)

(instance trapDoorSound of Sound
	(properties
		flags $0001
	)
)
