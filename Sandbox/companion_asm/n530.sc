;;; Sierra Script 1.0 - (do not remove this comment)
(script# 530)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n951)
(use n958)
(use n961)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	rm530 0
	keeper 1
	gate 2
	payKeeper 3
)

(local
	[local0 9] = [541 0 2 4 22 31 25 23 5]
	[local9 9] = [535 0 2 4 26 38 22 26 27]
	[local18 4] = [1535 42 1]
	[local22 8] = [1535 43 1 0 1535 43 1]
	[local30 4] = [1535 44 1]
	[local34 4] = [1530 26 1]
	[local38 4] = [1535 45 1]
	[local42 4] = [1535 53 1]
	[local46 4] = [1535 55 1]
	[local50 4] = [1535 51 1]
	[local54 4] = [1535 50 1]
	[local58 4] = [1535 48 1]
	[local62 4] = [1535 46 1]
	[local66 4] = [1535 52 1]
	[local70 4] = [1535 54 1]
	[local74 9] = [1530 141 2 3 1 3 1 2]
	[local83 4] = [1535 47 1]
	[local87 8] = [1535 56 1 2 1 2 1]
	[local95 4] = [1535 41 1]
	[local99 5] = [1535 3 2 1]
	[local104 4] = [1535 5 1]
	[local108 7] = [1535 33 1 2 1 2]
	[local115 7] = [1535 37 1 2 1 2]
	[local122 7] = [1535 6 2 1 2 1]
	[local129 5] = [1535 10 2 1]
	[local134 7] = [1535 12 2 1 1 1]
	[local141 4] = [1535 16 1]
	[local145 5] = [1535 20 2 1]
	[local150 5] = [1535 20 2 1]
	[local155 6] = [1535 22 2 1 1]
	[local161 6] = [1535 25 2 1 2]
	[local167 5] = [1535 28 1 2]
	[local172 6] = [1535 30 2 1 1]
	[local178 4] = [1530 103 1]
	[local182 4] = [1530 104 1]
	[local186 6] = [1530 57 1 2 1]
	[local192 7] = [1530 60 1 2 1 2]
	[local199 5] = [1530 44 1 2]
	[local204 4] = [1530 86 1]
	[local208 4] = [1530 95 1]
	[local212 7] = [1530 49 2 1 2 1]
	[local219 4] = [1535 2 1]
	[local223 4] = [1530 85 1]
	[local227 11] = [1530 1 3 2 4 1 2 1 2 1]
	[local238 21] = [1530 24 1 2 0 1530 118 1 2 0 1530 120 1 1 2 0 1530 123 2 1]
	local259
	local260
	local261
	local262
	local263
	local264
	local265
	local266
	local267
	local268
	local269
)
(procedure (localproc_0566)
	(asm
		+al      local267
		push    
		dup     
		ldi      1
		eq?     
		bnt      code_0587
		pushi    3
		lea      @local122
		push    
		lea      @local9
		push    
		pushi    999
		calle    proc851_0,  6
		jmp      code_05d0
code_0587:
		dup     
		ldi      2
		eq?     
		bnt      code_05a4
		pushi    3
		lea      @local129
		push    
		lea      @local9
		push    
		pushi    999
		calle    proc851_0,  6
		jmp      code_05d0
code_05a4:
		dup     
		ldi      3
		eq?     
		bnt      code_05c1
		pushi    3
		lea      @local134
		push    
		lea      @local9
		push    
		pushi    999
		calle    proc851_0,  6
		jmp      code_05d0
code_05c1:
		pushi    2
		lea      @local141
		push    
		lea      @local9
		push    
		calle    proc851_0,  4
code_05d0:
		toss    
		ret     
	)
)

(instance rm530 of StdRoom
	(properties
		picture 530
		south 270
		tpX 180
		tpY 180
	)
	
	(method (init &tmp temp0)
		(asm
			lsg      global12
			dup     
			ldi      803
			eq?     
			bnt      code_003c
			pushi    #x
			pushi    1
			pushi    140
			pushi    6
			pushi    1
			pushi    1
			pushi    326
			pushi    1
			pushi    1
			lag      global0
			send     18
			jmp      code_0067
code_003c:
			dup     
			ldi      270
			eq?     
			bnt      code_005a
			pushi    #x
			pushi    1
			pushi    140
			pushi    6
			pushi    1
			pushi    1
			pushi    326
			pushi    1
			pushi    1
			lag      global0
			send     18
			jmp      code_0067
code_005a:
			pushi    0
			callb    proc0_4,  0
			pushi    #edgeHit
			pushi    1
			pushi    0
			lag      global0
			send     6
code_0067:
			toss    
			+ag      global159
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_0080
			pushi    #init
			pushi    0
			pushi    2
			pushi    532
			pushi    0
			callk    ScriptID,  4
			send     4
code_0080:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0099
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    533
			pushi    0
			callk    ScriptID,  4
			push    
			lag      global2
			send     6
code_0099:
			pushi    #init
			pushi    0
			super    StdRoom,  4
			pushi    #init
			pushi    0
			pushi    228
			pushi    1
			pushi    270
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    534
			pushi    281
			pushi    2
			pushi    5
			pushi    4
			lofsa    keeper
			send     26
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    gate
			send     10
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fire
			send     10
			pushi    #init
			pushi    0
			lofsa    morStool
			send     4
			pushi    #init
			pushi    0
			lofsa    morTable
			send     4
			pushi    #init
			pushi    0
			lofsa    walls
			send     4
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    bar
			send     10
			pushi    #init
			pushi    0
			lofsa    lamps
			send     4
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    bottles
			send     10
			pushi    #init
			pushi    0
			lofsa    cTable
			send     4
			pushi    #init
			pushi    0
			lofsa    cMug
			send     4
			pushi    #init
			pushi    0
			lofsa    stools
			send     4
			pushi    #init
			pushi    0
			lofsa    bTable
			send     4
			pushi    #init
			pushi    0
			lofsa    bBenches
			send     4
			pushi    #init
			pushi    0
			lofsa    tDrunk
			send     4
			pushi    #init
			pushi    0
			lofsa    floor
			send     4
			pushi    #init
			pushi    0
			lofsa    bMug
			send     4
			pushi    #init
			pushi    0
			lofsa    fDrunk
			send     4
			pushi    #init
			pushi    0
			lofsa    casks
			send     4
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
			lsg      global126
			ldi      5
			eq?     
			bnt      code_01e8
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_01e8
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_01e8
			pushi    #init
			pushi    0
			pushi    2
			pushi    531
			pushi    0
			callk    ScriptID,  4
			send     4
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_01cc
			lsg      global126
			ldi      5
			eq?     
			bnt      code_01cc
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_01cc
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
code_01cc:
			bt       code_01d5
			lsg      global12
			ldi      540
			eq?     
code_01d5:
			bnt      code_02ab
			pushi    #init
			pushi    0
			pushi    2
			pushi    534
			pushi    0
			callk    ScriptID,  4
			send     4
			jmp      code_02ab
code_01e8:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0223
			pushi    #actions
			pushi    1
			lofsa    vbParty
			push    
			lofsa    morTable
			send     6
			pushi    #actions
			pushi    1
			lofsa    vbParty
			push    
			lofsa    morStool
			send     6
			pushi    #approachVerbs
			pushi    1
			pushi    0
			lofsa    gate
			send     6
			pushi    #actions
			pushi    1
			lofsa    egoActions
			push    
			lag      global0
			send     6
			jmp      code_02ab
code_0223:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_0249
			pushi    #actions
			pushi    1
			lofsa    vbParty
			push    
			lofsa    morTable
			send     6
			pushi    #actions
			pushi    1
			lofsa    vbParty
			push    
			lofsa    morStool
			send     6
			jmp      code_02ab
code_0249:
			pushi    #actions
			pushi    1
			lofsa    vbGenPub
			push    
			lofsa    keeper
			send     6
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_0269
			pushi    #addToPic
			pushi    0
			lofsa    gate
			send     4
code_0269:
			pushi    3
			lsg      global126
			pushi    4
			pushi    0
			calle    proc999_5,  6
			bnt      code_028a
			pushi    #next
			pushi    1
			lofsa    inStuff
			push    
			pushi    #script
			pushi    0
			lag      global2
			send     4
			send     6
code_028a:
			pushi    3
			lsg      global126
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_02ab
			pushi    #next
			pushi    1
			lofsa    inJewelerStuff
			push    
			pushi    #script
			pushi    0
			lag      global2
			send     4
			send     6
code_02ab:
			lag      global34
			sal      local259
			ldi      1
			sag      global34
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_04b7
			lsg      global130
			ldi      10
			ne?     
			bnt      code_04b7
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    58
			pushi    150
			pushi    240
			pushi    168
			pushi    181
			pushi    198
			pushi    176
			pushi    226
			pushi    176
			pushi    226
			pushi    170
			pushi    243
			pushi    170
			pushi    263
			pushi    188
			pushi    314
			pushi    171
			pushi    266
			pushi    183
			pushi    245
			pushi    164
			pushi    284
			pushi    150
			pushi    236
			pushi    157
			pushi    228
			pushi    149
			pushi    198
			pushi    149
			pushi    198
			pushi    127
			pushi    232
			pushi    118
			pushi    232
			pushi    106
			pushi    98
			pushi    106
			pushi    92
			pushi    112
			pushi    168
			pushi    112
			pushi    152
			pushi    129
			pushi    49
			pushi    129
			pushi    85
			pushi    130
			pushi    80
			pushi    140
			pushi    72
			pushi    144
			pushi    45
			pushi    161
			pushi    48
			pushi    165
			pushi    48
			pushi    176
			pushi    41
			pushi    186
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     130
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    175
			pushi    141
			pushi    136
			pushi    188
			pushi    93
			pushi    188
			pushi    97
			pushi    180
			pushi    83
			pushi    180
			pushi    75
			pushi    187
			pushi    49
			pushi    187
			pushi    91
			pushi    148
			pushi    141
			pushi    149
			pushi    147
			pushi    142
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			push    
			lag      global2
			send     8
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    pour
			push    
			lofsa    bucket
			send     10
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			sat      temp0
			lsg      global126
			ldi      0
			eq?     
			bnt      code_03f2
			ldi      2
			sat      temp0
code_03f2:
			lsg      global126
			ldi      4
			eq?     
			bnt      code_03fe
			ldi      1
			sat      temp0
code_03fe:
			lst      temp0
			ldi      4
			lt?     
			bnt      code_044a
			pushi    #init
			pushi    0
			pushi    142
			pushi    1
			lofsa    drinking
			push    
			lofsa    man1
			send     10
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    132
			pushi    133
			pushi    154
			pushi    139
			pushi    131
			pushi    145
			pushi    110
			pushi    140
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
code_044a:
			lst      temp0
			ldi      3
			ne?     
			bnt      code_049b
			lst      temp0
			ldi      4
			ne?     
			bnt      code_049b
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man2
			send     8
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    203
			pushi    170
			pushi    203
			pushi    161
			pushi    235
			pushi    161
			pushi    236
			pushi    169
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
code_049b:
			lst      temp0
			ldi      1
			ne?     
			bnt      code_04b7
			lst      temp0
			ldi      4
			ne?     
			bnt      code_04b7
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man3
			send     8
code_04b7:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local259
			sag      global34
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      530
			eq?     
			bnt      code_04df
			pushi    #fade
			pushi    4
			pushi    50
			pushi    30
			pushi    8
			pushi    0
			lag      global100
			send     12
			jmp      code_04e7
code_04df:
			pushi    #stop
			pushi    0
			lag      global100
			send     4
code_04e7:
			pushi    #dispose
			pushi    0
			super    StdRoom,  4
			pushi    #has
			pushi    1
			pushi    14
			lag      global0
			send     6
			bnt      code_0501
			pushi    1
			pushi    205
			callb    proc0_6,  2
code_0501:
			pushi    5
			pushi    0
			pushi    534
			pushi    531
			pushi    532
			pushi    533
			calle    proc958_0,  10
			ret     
		)
	)
)

(instance inStuff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0630
			lsg      global126
			ldi      4
			eq?     
			bnt      code_0608
			pushi    11
			pushi    4
			lea      @local227
			push    
			lea      @local9
			push    
			pushi    0
			pushi    999
			pushi    3
			pushi    19
			pushi    1
			pushi    20
			pushi    2
			pushSelf
			calle    proc851_0,  22
			jmp      code_0671
code_0608:
			pushi    #number
			pushi    1
			pushi    542
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			ipToa    state
			pushi    4
			lea      @local238
			push    
			pushi    19
			pushi    20
			pushSelf
			calle    proc851_0,  8
			jmp      code_0671
code_0630:
			dup     
			ldi      1
			eq?     
			bnt      code_063f
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0671
code_063f:
			dup     
			ldi      2
			eq?     
			bnt      code_065b
			pushi    #number
			pushi    1
			pushi    543
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			lag      global100
			send     18
			jmp      code_0671
code_065b:
			dup     
			ldi      3
			eq?     
			bnt      code_0671
			ldi      27
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0671:
			toss    
			ret     
		)
	)
)

(instance inJewelerStuff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0759
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    219
			callb    proc0_5,  2
			bnt      code_06d9
			pushi    1
			pushi    220
			callb    proc0_5,  2
			bnt      code_06d9
			ldi      1
			aTop     cycles
			jmp      code_0769
code_06d9:
			pushi    1
			pushi    219
			callb    proc0_5,  2
			bnt      code_0709
			lsg      global126
			ldi      3
			eq?     
			bnt      code_0709
			pushi    1
			pushi    220
			callb    proc0_6,  2
			pushi    4
			lea      @local108
			push    
			lea      @local9
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_0769
code_0709:
			pushi    1
			pushi    220
			callb    proc0_5,  2
			bnt      code_0739
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0739
			pushi    1
			pushi    219
			callb    proc0_6,  2
			pushi    4
			lea      @local115
			push    
			lea      @local9
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_0769
code_0739:
			lsg      global126
			ldi      3
			eq?     
			bnt      code_074b
			pushi    1
			pushi    220
			callb    proc0_6,  2
			jmp      code_0752
code_074b:
			pushi    1
			pushi    219
			callb    proc0_6,  2
code_0752:
			ldi      1
			aTop     cycles
			jmp      code_0769
code_0759:
			dup     
			ldi      1
			eq?     
			bnt      code_0769
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0769:
			toss    
			ret     
		)
	)
)

(instance dieNow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0822
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     10
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    jack
			send     10
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    202
			pushi    141
			pushSelf
			lofsa    roger
			send     12
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    208
			pushi    163
			pushSelf
			lofsa    giles
			send     12
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    180
			pushi    169
			pushSelf
			lofsa    jack
			send     12
			jmp      code_0876
code_0822:
			dup     
			ldi      1
			eq?     
			bnt      code_082c
			jmp      code_0876
code_082c:
			dup     
			ldi      2
			eq?     
			bnt      code_0836
			jmp      code_0876
code_0836:
			dup     
			ldi      3
			eq?     
			bnt      code_085b
			pushi    10
			pushi    3
			lea      @local74
			push    
			pushi    999
			pushi    0
			pushi    19
			pushi    2
			pushi    20
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  20
			jmp      code_0876
code_085b:
			dup     
			ldi      4
			eq?     
			bnt      code_0876
			ldi      29
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0876:
			toss    
			ret     
		)
	)
)

(instance payKeeper of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_090e
			pushi    0
			callb    proc0_3,  0
			pToa     register
			not     
			bnt      code_08d5
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
			ret     
			jmp      code_0907
code_08d5:
			pTos     register
			ldi      1
			eq?     
			bnt      code_08e8
			lea      @local18
			sal      local263
			ipToa    state
			jmp      code_0907
code_08e8:
			pTos     register
			ldi      4
			eq?     
			bnt      code_08f9
			lea      @local22
			sal      local263
			jmp      code_0907
code_08f9:
			pTos     register
			ldi      4
			gt?     
			bnt      code_0907
			lea      @local30
			sal      local263
code_0907:
			ldi      1
			aTop     cycles
			jmp      code_0b98
code_090e:
			dup     
			ldi      1
			eq?     
			bnt      code_0923
			pushi    #setScript
			pushi    2
			lofsa    pullAPint
			push    
			pushSelf
			self     8
			jmp      code_0b98
code_0923:
			dup     
			ldi      2
			eq?     
			bnt      code_0966
			pTos     register
			ldi      2
			eq?     
			bnt      code_0939
			ldi      1
			aTop     cycles
			jmp      code_0b98
code_0939:
			pushi    4
			lsl      local263
			lea      @local9
			push    
			pushi    #underBits
			pushi    0
			pushi    2
			pushi    851
			pushi    3
			callk    ScriptID,  4
			send     4
			bnt      code_0959
			ldi      999
			jmp      code_095b
code_0959:
			ldi      0
code_095b:
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0b98
code_0966:
			dup     
			ldi      3
			eq?     
			bnt      code_0a64
			pTos     register
			ldi      4
			ge?     
			bnt      code_09f8
			pushi    #taken
			pushi    0
			lag      global133
			send     4
			bnt      code_0994
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #get
			pushi    1
			pushi    1
			lag      global133
			send     6
			jmp      code_09f1
code_0994:
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			push    
			ldi      2
			ge?     
			bnt      code_09b7
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #get
			pushi    1
			pushi    2
			lag      global134
			send     6
			jmp      code_09f1
code_09b7:
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			bnt      code_09df
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #get
			pushi    1
			pushi    1
			lag      global134
			send     6
			pushi    #get
			pushi    1
			pushi    2
			lag      global135
			send     6
			jmp      code_09f1
code_09df:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #get
			pushi    1
			pushi    4
			lag      global135
			send     6
code_09f1:
			ldi      2
			aTop     register
			jmp      code_0a49
code_09f8:
			pTos     register
			ldi      2
			ge?     
			bnt      code_0a37
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			bnt      code_0a1f
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #get
			pushi    1
			pushi    1
			lag      global134
			send     6
			jmp      code_0a30
code_0a1f:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #get
			pushi    1
			pushi    2
			lag      global135
			send     6
code_0a30:
			ldi      1
			aTop     register
			jmp      code_0a49
code_0a37:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
			ret     
code_0a49:
			pushi    #view
			pushi    0
			lag      global0
			send     4
			sal      local260
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			sal      local261
			ldi      1
			aTop     cycles
			jmp      code_0b98
code_0a64:
			dup     
			ldi      4
			eq?     
			bnt      code_0adc
			pushi    5
			pushi    1
			pushi    536
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			lsg      global126
			dup     
			ldi      5
			eq?     
			bnt      code_0a87
			ldi      0
			jmp      code_0ac0
code_0a87:
			dup     
			ldi      4
			eq?     
			bnt      code_0a93
			ldi      1
			jmp      code_0ac0
code_0a93:
			dup     
			ldi      6
			eq?     
			bnt      code_0a9f
			ldi      2
			jmp      code_0ac0
code_0a9f:
			dup     
			ldi      1
			eq?     
			bnt      code_0aab
			ldi      3
			jmp      code_0ac0
code_0aab:
			dup     
			ldi      2
			eq?     
			bnt      code_0ab7
			ldi      4
			jmp      code_0ac0
code_0ab7:
			dup     
			ldi      3
			eq?     
			bnt      code_0ac0
			ldi      4
code_0ac0:
			toss    
			push    
			lag      global0
			send     18
			ldi      3
			aTop     seconds
			+al      local266
			push    
			ldi      5
			ge?     
			bnt      code_0b98
			lofsa    dieNow
			aTop     next
			jmp      code_0b98
code_0adc:
			dup     
			ldi      5
			eq?     
			bnt      code_0afa
			pushi    #view
			pushi    1
			lsl      local260
			pushi    6
			pushi    1
			lsl      local261
			lag      global0
			send     12
			ldi      10
			aTop     ticks
			jmp      code_0b98
code_0afa:
			dup     
			ldi      6
			eq?     
			bnt      code_0b75
			lsl      local266
			ldi      1
			eq?     
			bnt      code_0b6e
			pushi    26
			lsg      global126
			dup     
			ldi      5
			eq?     
			bnt      code_0b1a
			ldi      1
			jmp      code_0b53
code_0b1a:
			dup     
			ldi      4
			eq?     
			bnt      code_0b26
			ldi      3
			jmp      code_0b53
code_0b26:
			dup     
			ldi      6
			eq?     
			bnt      code_0b32
			ldi      2
			jmp      code_0b53
code_0b32:
			dup     
			ldi      1
			eq?     
			bnt      code_0b3e
			ldi      0
			jmp      code_0b53
code_0b3e:
			dup     
			ldi      2
			eq?     
			bnt      code_0b4a
			ldi      4
			jmp      code_0b53
code_0b4a:
			dup     
			ldi      3
			eq?     
			bnt      code_0b53
			ldi      4
code_0b53:
			toss    
			add     
			push    
			ldi      1
			sali     local34
			pushi    4
			lea      @local34
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0b98
code_0b6e:
			ldi      1
			aTop     cycles
			jmp      code_0b98
code_0b75:
			dup     
			ldi      7
			eq?     
			bnt      code_0b98
			dpToa    register
			bnt      code_0b8f
			pTos     state
			ldi      4
			sub     
			aTop     state
			ldi      100
			aTop     ticks
			jmp      code_0b98
code_0b8f:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0b98:
			toss    
			ret     
		)
	)
)

(instance pullAPint of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0bf9
			pushi    #setHeading
			pushi    1
			pushi    90
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    10
			pushSelf
			lofsa    keeper
			send     16
			jmp      code_0c34
code_0bf9:
			dup     
			ldi      1
			eq?     
			bnt      code_0c07
			ldi      45
			aTop     ticks
			jmp      code_0c34
code_0c07:
			dup     
			ldi      2
			eq?     
			bnt      code_0c28
			pushi    #setHeading
			pushi    1
			pushi    270
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    10
			pushSelf
			lofsa    keeper
			send     16
			jmp      code_0c34
code_0c28:
			dup     
			ldi      3
			eq?     
			bnt      code_0c34
			pushi    #dispose
			pushi    0
			self     4
code_0c34:
			toss    
			ret     
		)
	)
)

(instance pour of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c89
			pushi    2
			pushi    5
			pushi    12
			callk    Random,  4
			aTop     seconds
			jmp      code_0e6e
code_0c89:
			dup     
			ldi      1
			eq?     
			bnt      code_0cae
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    251
			pushi    100
			pushSelf
			lofsa    bucket
			send     12
			pushi    #init
			pushi    0
			lofsa    rope
			send     4
			jmp      code_0e6e
code_0cae:
			dup     
			ldi      2
			eq?     
			bnt      code_0d1d
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bt       code_0cc9
			pushi    #script
			pushi    0
			lofsa    keeper
			send     4
code_0cc9:
			bnt      code_0cd5
			ldi      1
			aTop     cycles
			dpToa    state
			jmp      code_0e6e
code_0cd5:
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    253
			pushi    117
			pushSelf
			lofsa    keeper
			send     12
			pushi    #actions
			pushi    0
			lofsa    keeper
			send     4
			sal      local264
			pushi    #actions
			pushi    0
			lofsa    gate
			send     4
			sal      local265
			pushi    #actions
			pushi    1
			lofsa    vbNoCanDo
			push    
			lofsa    keeper
			send     6
			pushi    #actions
			pushi    1
			lofsa    vbNoCanDo
			push    
			lofsa    gate
			send     6
			jmp      code_0e6e
code_0d1d:
			dup     
			ldi      3
			eq?     
			bnt      code_0d2b
			ldi      50
			aTop     ticks
			jmp      code_0e6e
code_0d2b:
			dup     
			ldi      4
			eq?     
			bnt      code_0d48
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    229
			pushi    108
			pushSelf
			lofsa    keeper
			send     12
			jmp      code_0e6e
code_0d48:
			dup     
			ldi      5
			eq?     
			bnt      code_0d5e
			pushi    #setHeading
			pushi    2
			pushi    90
			pushSelf
			lofsa    keeper
			send     8
			jmp      code_0e6e
code_0d5e:
			dup     
			ldi      6
			eq?     
			bnt      code_0d89
			pushi    #view
			pushi    1
			pushi    536
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    2
			pushi    1
			lofsa    keeper
			send     28
			ldi      50
			aTop     ticks
			jmp      code_0e6e
code_0d89:
			dup     
			ldi      7
			eq?     
			bnt      code_0da4
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    65535
			pushSelf
			lofsa    keeper
			send     12
			jmp      code_0e6e
code_0da4:
			dup     
			ldi      8
			eq?     
			bnt      code_0dc0
			pushi    #loop
			pushi    1
			pushi    3
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    keeper
			send     14
			jmp      code_0e6e
code_0dc0:
			dup     
			ldi      9
			eq?     
			bnt      code_0e00
			pushi    #view
			pushi    1
			pushi    533
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    534
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    253
			pushi    120
			pushSelf
			lofsa    keeper
			send     26
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    251
			pushi    40
			pushSelf
			lofsa    bucket
			send     12
			jmp      code_0e6e
code_0e00:
			dup     
			ldi      10
			eq?     
			bnt      code_0e1e
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    265
			pushi    133
			pushSelf
			lofsa    keeper
			send     12
			jmp      code_0e6e
code_0e1e:
			dup     
			ldi      11
			eq?     
			bnt      code_0e35
			pushi    #setHeading
			pushi    2
			pushi    270
			pushSelf
			lofsa    keeper
			send     8
			jmp      code_0e6e
code_0e35:
			dup     
			ldi      12
			eq?     
			bnt      code_0e57
			pushi    #actions
			pushi    1
			lsl      local264
			lofsa    keeper
			send     6
			pushi    #actions
			pushi    1
			lsl      local265
			lofsa    gate
			send     6
			jmp      code_0e6e
code_0e57:
			dup     
			ldi      13
			eq?     
			bnt      code_0e6e
			pushi    #dispose
			pushi    0
			lofsa    rope
			send     4
			pushi    #dispose
			pushi    0
			lofsa    bucket
			send     4
code_0e6e:
			toss    
			ret     
		)
	)
)

(instance drinking of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ec3
			pushi    2
			pushi    3
			pushi    12
			callk    Random,  4
			aTop     seconds
			jmp      code_0ef3
code_0ec3:
			dup     
			ldi      1
			eq?     
			bnt      code_0edc
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			pToa     client
			send     12
			jmp      code_0ef3
code_0edc:
			dup     
			ldi      2
			eq?     
			bnt      code_0ef3
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			ldi      65535
			aTop     state
code_0ef3:
			toss    
			ret     
		)
	)
)

(instance notBehindBar of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f5b
			pushi    0
			callb    proc0_3,  0
			pushi    #heading
			pushi    0
			lofsa    keeper
			send     4
			sal      local262
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lofsa    keeper
			send     8
			jmp      code_0fb3
code_0f5b:
			dup     
			ldi      1
			eq?     
			bnt      code_0f77
			pushi    4
			lea      @local204
			push    
			lea      @local9
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0fb3
code_0f77:
			dup     
			ldi      2
			eq?     
			bnt      code_0fa3
			pushi    #setHeading
			pushi    1
			lsl      local262
			lofsa    keeper
			send     6
			pushi    #setHeading
			pushi    1
			pushi    270
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    60
			pushSelf
			lag      global0
			send     16
			jmp      code_0fb3
code_0fa3:
			dup     
			ldi      3
			eq?     
			bnt      code_0fb3
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0fb3:
			toss    
			ret     
		)
	)
)

(instance dontBow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_100f
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1530
			pushi    127
			pushSelf
			calle    proc13_4,  6
			jmp      code_1036
code_100f:
			dup     
			ldi      1
			eq?     
			bnt      code_1026
			pushi    3
			pushi    1530
			pushi    128
			pushSelf
			calle    proc13_4,  6
			jmp      code_1036
code_1026:
			dup     
			ldi      2
			eq?     
			bnt      code_1036
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1036:
			toss    
			ret     
		)
	)
)

(instance usePipe of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_108e
			pushi    3
			pushi    1530
			pushi    138
			pushSelf
			calle    proc13_4,  6
			jmp      code_10a7
code_108e:
			dup     
			ldi      1
			eq?     
			bnt      code_10a7
			pushi    3
			pushi    1530
			pushi    139
			pushi    1
			calle    proc13_4,  6
			pushi    #dispose
			pushi    0
			self     4
code_10a7:
			toss    
			ret     
		)
	)
)

(instance fire of Prop
	(properties
		x 22
		y 144
		lookStr 48
		view 530
		priority 11
		signal $4810
		detailLevel 3
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1113
			lsg      global115
			ldi      2
			eq?     
			bnt      code_1104
			pushi    3
			pushi    1530
			pushi    89
			pushi    1
			calle    proc13_4,  6
			jmp      code_111e
code_1104:
			pushi    3
			pushi    1530
			pushi    88
			pushi    1
			calle    proc13_4,  6
			jmp      code_111e
code_1113:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_111e:
			toss    
			ret     
		)
	)
)

(instance gate of Prop
	(properties
		x 164
		y 102
		approachX 190
		approachY 115
		view 530
		loop 2
		priority 6
		signal $6811
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11c5
			pushi    #distanceTo
			pushi    1
			pushSelf
			lag      global0
			send     6
			push    
			ldi      25
			lt?     
			bnt      code_11b6
			pushi    3
			pushi    1530
			pushi    74
			pushi    1
			calle    proc13_4,  6
			jmp      code_1209
code_11b6:
			pushi    3
			pushi    1530
			pushi    73
			pushi    1
			calle    proc13_4,  6
			jmp      code_1209
code_11c5:
			dup     
			ldi      3
			eq?     
			bnt      code_11fe
			lsg      global130
			ldi      10
			eq?     
			bnt      code_11e9
			pushi    4
			lea      @local182
			push    
			lea      @local9
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1209
code_11e9:
			pushi    4
			lea      @local178
			push    
			lea      @local9
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1209
code_11fe:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_1209:
			toss    
			ret     
		)
	)
)

(instance rope of View
	(properties
		x 251
		y -18
		view 536
		loop 5
		cel 1
		priority 6
		signal $6810
	)
	
	(method (doit)
		(asm
			pushi    #y
			pushi    0
			lofsa    bucket
			send     4
			push    
			ldi      55
			sub     
			aTop     y
			ret     
		)
	)
)

(instance bucket of Actor
	(properties
		x 251
		y 37
		yStep 1
		view 536
		loop 5
		priority 6
		signal $6810
		moveSpeed 4
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_132b
			pushi    1
			pushi    123
			callb    proc0_5,  2
			bnt      code_1310
			pushi    4
			pushi    1530
			pushi    46
			pushi    0
			pushi    1
			calle    proc13_4,  8
			jmp      code_134c
code_1310:
			pushi    2
			pushi    10
			pushi    123
			calle    proc806_1,  4
			pushi    4
			pushi    1530
			pushi    43
			pushSelf
			pushi    1
			calle    proc13_4,  8
			jmp      code_134c
code_132b:
			dup     
			ldi      3
			eq?     
			bnt      code_1341
			pushi    3
			pushi    1530
			pushi    87
			pushi    1
			calle    proc13_4,  6
			jmp      code_134c
code_1341:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_134c:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    3
			lea      @local199
			push    
			pushi    999
			lea      @local9
			push    
			calle    proc851_0,  6
			ret     
		)
	)
)

(instance roger of Actor
	(properties
		x 138
		y 200
		view 753
		loop 3
	)
)

(instance giles of Actor
	(properties
		x 138
		y 240
		view 753
		loop 3
	)
)

(instance jack of Actor
	(properties
		x 138
		y 280
		view 753
		loop 3
	)
)

(instance keeper of Actor
	(properties
		x 265
		y 133
		approachX 220
		approachY 148
		view 533
		loop 1
		signal $6000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_157d
			pushi    3
			pushi    1535
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_1787
code_157d:
			dup     
			ldi      3
			eq?     
			bnt      code_1592
			pushi    3
			pushi    1535
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_1787
code_1592:
			dup     
			ldi      4
			eq?     
			bnt      code_177c
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_15bc
			pushi    #setScript
			pushi    3
			lofsa    payKeeper
			push    
			pushi    0
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			lofsa    keeper
			send     10
			jmp      code_1778
code_15bc:
			dup     
			ldi      2
			eq?     
			bnt      code_15d5
			pushi    2
			lea      @local38
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_15d5:
			dup     
			ldi      3
			eq?     
			bnt      code_15ee
			pushi    2
			lea      @local62
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_15ee:
			dup     
			ldi      4
			eq?     
			bnt      code_1607
			pushi    2
			lea      @local62
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1607:
			dup     
			ldi      5
			eq?     
			bnt      code_1620
			pushi    2
			lea      @local66
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1620:
			dup     
			ldi      6
			eq?     
			bnt      code_1639
			pushi    2
			lea      @local42
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1639:
			dup     
			ldi      7
			eq?     
			bnt      code_1652
			pushi    2
			lea      @local46
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1652:
			dup     
			ldi      8
			eq?     
			bnt      code_168c
			pushi    1
			pushi    204
			callb    proc0_6,  2
			not     
			bnt      code_167a
			pushi    3
			lea      @local87
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_1778
code_167a:
			pushi    2
			lea      @local62
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_168c:
			dup     
			ldi      9
			eq?     
			bnt      code_16a5
			pushi    2
			lea      @local66
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_16a5:
			dup     
			ldi      10
			eq?     
			bnt      code_16be
			pushi    2
			lea      @local50
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_16be:
			dup     
			ldi      12
			eq?     
			bnt      code_16d7
			pushi    2
			lea      @local54
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_16d7:
			dup     
			ldi      13
			eq?     
			bnt      code_16f0
			pushi    2
			lea      @local95
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_16f0:
			dup     
			ldi      14
			eq?     
			bnt      code_1709
			pushi    2
			lea      @local58
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1709:
			dup     
			ldi      15
			eq?     
			bnt      code_1722
			pushi    2
			lea      @local83
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1722:
			dup     
			ldi      16
			eq?     
			bnt      code_173b
			pushi    2
			lea      @local62
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_173b:
			dup     
			ldi      17
			eq?     
			bnt      code_1754
			pushi    2
			lea      @local54
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_1754:
			dup     
			ldi      18
			eq?     
			bnt      code_176d
			pushi    2
			lea      @local70
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1778
code_176d:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_1778:
			toss    
			jmp      code_1787
code_177c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_1787:
			toss    
			ret     
		)
	)
)

(instance man1 of Prop
	(properties
		x 131
		y 139
		lookStr 79
		view 531
		signal $6000
		cycleSpeed 9
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_1828
			pushi    3
			pushi    1530
			pushi    116
			pushi    1
			calle    proc13_4,  6
			jmp      code_1849
code_1828:
			dup     
			ldi      3
			eq?     
			bnt      code_183e
			pushi    3
			pushi    1530
			pushi    110
			pushi    1
			calle    proc13_4,  6
			jmp      code_1849
code_183e:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_1849:
			toss    
			ret     
		)
	)
)

(instance man2 of Prop
	(properties
		x 219
		y 171
		lookStr 79
		view 753
		loop 1
		signal $4000
		detailLevel 3
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man1
			send     4
			ret     
		)
	)
)

(instance man3 of Prop
	(properties
		x 30
		y 181
		lookStr 79
		view 753
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man1
			send     4
			ret     
		)
	)
)

(instance morStool of Feature
	(properties
		x 200
		y 192
		onMeCheck $0002
		approachX 190
		approachY 175
	)
	
	(method (init)
		(asm
			pushi    281
			pushi    1
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_19e5
			lsg      global126
			ldi      5
			eq?     
			bnt      code_19e5
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_19e5
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
			bnt      code_19e5
			ldi      3
			jmp      code_19e7
code_19e5:
			ldi      0
code_19e7:
			push    
			self     6
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
			ldi      2
			eq?     
			bnt      code_1a42
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_1a35
			lsg      global126
			ldi      5
			eq?     
			bnt      code_1a35
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_1a35
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
			bnt      code_1a35
			pushi    2
			pushi    1530
			pushi    55
			calle    proc13_4,  4
			jmp      code_1b1a
code_1a35:
			pushi    2
			pushi    1530
			pushi    56
			calle    proc13_4,  4
			jmp      code_1b1a
code_1a42:
			dup     
			ldi      3
			eq?     
			bnt      code_1b0f
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_1b00
			lsg      global126
			ldi      5
			eq?     
			bnt      code_1b00
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_1b00
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
			bnt      code_1b00
			pushi    #has
			pushi    1
			pushi    14
			lag      global0
			send     6
			bt       code_1a8a
			pushi    1
			pushi    124
			callb    proc0_5,  2
code_1a8a:
			bnt      code_1aa0
			pushi    #doVerb
			pushi    1
			pushi    5
			pushi    2
			pushi    534
			pushi    0
			callk    ScriptID,  4
			send     6
			jmp      code_1b1a
code_1aa0:
			pushi    1
			pushi    215
			callb    proc0_5,  2
			bnt      code_1abb
			pushi    #cue
			pushi    0
			pushi    2
			pushi    534
			pushi    0
			callk    ScriptID,  4
			send     4
			jmp      code_1b1a
code_1abb:
			lal      local269
			bnt      code_1ae6
			pushi    1
			pushi    215
			callb    proc0_6,  2
			pushi    4
			lea      @local192
			push    
			pushi    9
			lea      @local0
			push    
			pushi    2
			pushi    534
			pushi    0
			callk    ScriptID,  4
			push    
			calle    proc851_0,  8
			jmp      code_1b1a
code_1ae6:
			ldi      1
			sal      local269
			pushi    3
			lea      @local186
			push    
			pushi    9
			lea      @local0
			push    
			calle    proc851_0,  6
			jmp      code_1b1a
code_1b00:
			pushi    3
			pushi    1530
			pushi    96
			pushi    1
			calle    proc13_4,  6
			jmp      code_1b1a
code_1b0f:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1b1a:
			toss    
			ret     
		)
	)
)

(instance morTable of Feature
	(properties
		x 217
		y 189
		onMeCheck $0004
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1bdc
			lsg      global130
			ldi      4
			gt?     
			bnt      code_1bcf
			pushi    1
			pushi    205
			callb    proc0_5,  2
			bnt      code_1bcf
			pushi    1
			pushi    198
			callb    proc0_6,  2
			not     
			bnt      code_1bcf
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_1bb5
			lsg      global126
			ldi      5
			eq?     
			bnt      code_1bb5
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_1bb5
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
code_1bb5:
			not     
			bnt      code_1bcf
			pushi    3
			lea      @local212
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_1c3f
code_1bcf:
			pushi    2
			pushi    1530
			pushi    53
			calle    proc13_4,  4
			jmp      code_1c3f
code_1bdc:
			dup     
			ldi      3
			eq?     
			bnt      code_1c34
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_1c25
			lsg      global126
			ldi      5
			eq?     
			bnt      code_1c25
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_1c25
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
			bnt      code_1c25
			pushi    3
			lea      @local208
			push    
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_1c3f
code_1c25:
			pushi    3
			pushi    1530
			pushi    94
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3f
code_1c34:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1c3f:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties
		onMeCheck $0001
		lookStr 75
	)
)

(instance bar of Feature
	(properties
		x 240
		y 135
		onMeCheck $0008
		approachX 226
		approachY 148
		lookStr 40
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1cdd
			pushi    2
			lea      @local223
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_1ce8
code_1cdd:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1ce8:
			toss    
			ret     
		)
	)
)

(instance lamps of Feature
	(properties
		onMeCheck $0010
		lookStr 47
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1d46
			pushi    3
			pushi    1530
			pushi    92
			pushi    1
			calle    proc13_4,  6
			jmp      code_1d51
code_1d46:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1d51:
			toss    
			ret     
		)
	)
)

(instance bottles of Feature
	(properties
		x 276
		y 135
		onMeCheck $0020
		approachX 284
		approachY 150
		lookStr 42
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1db1
			pushi    #setScript
			pushi    1
			lofsa    notBehindBar
			push    
			lofsa    keeper
			send     6
			jmp      code_1dbc
code_1db1:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1dbc:
			toss    
			ret     
		)
	)
)

(instance cTable of Feature
	(properties
		x 111
		y 163
		onMeCheck $0040
		lookStr 64
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1e1a
			pushi    3
			pushi    1530
			pushi    90
			pushi    1
			calle    proc13_4,  6
			jmp      code_1e25
code_1e1a:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1e25:
			toss    
			ret     
		)
	)
)

(instance cMug of Feature
	(properties
		x 133
		y 167
		onMeCheck $0080
		lookStr 65
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1e84
			pushi    3
			pushi    1530
			pushi    91
			pushi    1
			calle    proc13_4,  6
			jmp      code_1e8f
code_1e84:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1e8f:
			toss    
			ret     
		)
	)
)

(instance stools of Feature
	(properties
		onMeCheck $0100
		lookStr 56
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1eee
			pushi    3
			pushi    1530
			pushi    97
			pushi    1
			calle    proc13_4,  6
			jmp      code_1ef9
code_1eee:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1ef9:
			toss    
			ret     
		)
	)
)

(instance bTable of Feature
	(properties
		x 104
		y 113
		onMeCheck $0200
		lookStr 66
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1f58
			pushi    3
			pushi    1530
			pushi    98
			pushi    1
			calle    proc13_4,  6
			jmp      code_1f63
code_1f58:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1f63:
			toss    
			ret     
		)
	)
)

(instance bBenches of Feature
	(properties
		x 104
		y 113
		onMeCheck $0400
		lookStr 67
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1fc2
			pushi    3
			pushi    1530
			pushi    97
			pushi    1
			calle    proc13_4,  6
			jmp      code_1fcd
code_1fc2:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1fcd:
			toss    
			ret     
		)
	)
)

(instance tDrunk of Feature
	(properties
		x 92
		y 118
		onMeCheck $0800
		lookStr 68
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_202c
			pushi    3
			pushi    1530
			pushi    99
			pushi    1
			calle    proc13_4,  6
			jmp      code_20d7
code_202c:
			dup     
			ldi      4
			eq?     
			bnt      code_20b6
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_204c
			pushi    3
			pushi    1530
			pushi    129
			pushi    1
			calle    proc13_4,  6
			jmp      code_20b2
code_204c:
			dup     
			ldi      11
			eq?     
			bnt      code_2063
			pushi    3
			pushi    1530
			pushi    133
			pushi    1
			calle    proc13_4,  6
			jmp      code_20b2
code_2063:
			dup     
			ldi      14
			eq?     
			bnt      code_207a
			pushi    3
			pushi    1530
			pushi    135
			pushi    1
			calle    proc13_4,  6
			jmp      code_20b2
code_207a:
			dup     
			ldi      5
			eq?     
			bnt      code_2090
			pushi    #setScript
			pushi    1
			lofsa    usePipe
			push    
			lag      global0
			send     6
			jmp      code_20b2
code_2090:
			dup     
			ldi      6
			eq?     
			bnt      code_20a7
			pushi    3
			pushi    1530
			pushi    140
			pushi    1
			calle    proc13_4,  6
			jmp      code_20b2
code_20a7:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_20b2:
			toss    
			jmp      code_20d7
code_20b6:
			dup     
			ldi      5
			eq?     
			bnt      code_20cc
			pushi    3
			pushi    1530
			pushi    125
			pushi    1
			calle    proc13_4,  6
			jmp      code_20d7
code_20cc:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_20d7:
			toss    
			ret     
		)
	)
)

(instance floor of Feature
	(properties
		onMeCheck $1000
		lookStr 76
	)
)

(instance bMug of Feature
	(properties
		x 113
		y 114
		nsTop 92
		nsLeft 111
		nsBottom 97
		nsRight 117
		lookStr 69
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_2172
			pushi    3
			pushi    1530
			pushi    100
			pushi    1
			calle    proc13_4,  6
			jmp      code_217d
code_2172:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_217d:
			toss    
			ret     
		)
	)
)

(instance fDrunk of Feature
	(properties
		x 64
		y 137
		onMeCheck $2000
		lookStr 70
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_21dc
			pushi    3
			pushi    1530
			pushi    101
			pushi    1
			calle    proc13_4,  6
			jmp      code_2288
code_21dc:
			dup     
			ldi      4
			eq?     
			bnt      code_2267
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_21fc
			pushi    3
			pushi    1530
			pushi    129
			pushi    1
			calle    proc13_4,  6
			jmp      code_2263
code_21fc:
			dup     
			ldi      11
			eq?     
			bnt      code_2213
			pushi    3
			pushi    1530
			pushi    134
			pushi    1
			calle    proc13_4,  6
			jmp      code_2263
code_2213:
			dup     
			ldi      14
			eq?     
			bnt      code_222a
			pushi    3
			pushi    1530
			pushi    136
			pushi    1
			calle    proc13_4,  6
			jmp      code_2263
code_222a:
			dup     
			ldi      3
			eq?     
			bnt      code_2241
			pushi    3
			pushi    1530
			pushi    132
			pushi    1
			calle    proc13_4,  6
			jmp      code_2263
code_2241:
			dup     
			ldi      6
			eq?     
			bnt      code_2258
			pushi    3
			pushi    1530
			pushi    140
			pushi    1
			calle    proc13_4,  6
			jmp      code_2263
code_2258:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_2263:
			toss    
			jmp      code_2288
code_2267:
			dup     
			ldi      5
			eq?     
			bnt      code_227d
			pushi    3
			pushi    1530
			pushi    126
			pushi    1
			calle    proc13_4,  6
			jmp      code_2288
code_227d:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_2288:
			toss    
			ret     
		)
	)
)

(instance casks of Feature
	(properties
		onMeCheck $4000
		lookStr 72
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_22e6
			pushi    3
			pushi    1530
			pushi    93
			pushi    1
			calle    proc13_4,  6
			jmp      code_22f1
code_22e6:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_22f1:
			toss    
			ret     
		)
	)
)

(instance vbParty of SpecialDoVerb
	(properties)
	
	(method (doVerb)
		(asm
			pushi    3
			pushi    1530
			pushi    54
			pushi    1
			calle    proc13_4,  6
			ldi      1
			ret     
		)
	)
)

(instance vbNoCanDo of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2377
			ldi      0
			ret     
			jmp      code_2389
code_2377:
			pushi    2
			lea      @local219
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			ldi      1
			ret     
code_2389:
			toss    
			ret     
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      4
			eq?     
			bnt      code_23da
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_23ce
			pushi    3
			pushi    1530
			pushi    147
			pushi    1
			calle    proc13_4,  6
			jmp      code_23d9
code_23ce:
			pushi    #doit
			pushi    1
			lsp      theVerb
			&rest    param3
			lag      global65
			send     6
code_23d9:
			toss    
code_23da:
			toss    
			ret     
		)
	)
)

(instance vbGenPub of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_252e
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_2443
			lal      local267
			bnt      code_242a
			pushi    3
			lea      @local150
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_252a
code_242a:
			+al      local267
			pushi    3
			lea      @local145
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_252a
code_2443:
			dup     
			ldi      5
			eq?     
			bnt      code_247b
			lal      local267
			bnt      code_2462
			pushi    2
			lea      @local104
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_252a
code_2462:
			+al      local267
			pushi    3
			lea      @local172
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_252a
code_247b:
			dup     
			ldi      6
			eq?     
			bnt      code_24d7
			+al      local267
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_24a3
			pushi    3
			lea      @local155
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_24d3
code_24a3:
			dup     
			ldi      2
			eq?     
			bnt      code_24c0
			pushi    3
			lea      @local161
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_24d3
code_24c0:
			pushi    3
			lea      @local167
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
code_24d3:
			toss    
			jmp      code_252a
code_24d7:
			dup     
			ldi      4
			eq?     
			bnt      code_250f
			lal      local267
			bnt      code_24f6
			pushi    2
			lea      @local104
			push    
			lea      @local9
			push    
			calle    proc851_0,  4
			jmp      code_252a
code_24f6:
			pushi    3
			lea      @local99
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			+al      local267
			jmp      code_252a
code_250f:
			dup     
			ldi      2
			eq?     
			bnt      code_251e
			pushi    0
			call     localproc_0566,  0
			jmp      code_252a
code_251e:
			dup     
			ldi      3
			eq?     
			bnt      code_252a
			pushi    0
			call     localproc_0566,  0
code_252a:
			toss    
			jmp      code_2548
code_252e:
			dup     
			ldi      10
			eq?     
			bnt      code_2545
			pushi    #setScript
			pushi    1
			lofsa    dontBow
			push    
			lofsa    keeper
			send     6
			jmp      code_2548
code_2545:
			ldi      0
			ret     
code_2548:
			toss    
			ret     
		)
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 532
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)
