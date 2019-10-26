;;; Sierra Script 1.0 - (do not remove this comment)
(script# 10)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n951)
(use n961)
(use n969)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	fKnight 0
	fKnightEncounter 1
	horseBody 2
	horseHead 3
	theSword 4
)

(local
	[local0 9] = [60 0 2 4 19 30 23 20 29]
	[local9 9] = [-1 7816 32]
	[local18 5] = [0 10 12 5 6]
	[local23 5] = [0 5 4 8 2]
	local28
	local29 =  1
	local30
	local31
	local32
	local33
	local34
	local35
	local36
	local37
	local38
	local39
	local40
	[local41 6] = [1010 0 1 1 1]
	[local47 14] = [1010 7 2 1 1 2 1 2 1 3 4 1 3]
	[local61 6] = [1010 18 2 1 2]
	[local67 6] = [1010 21 2 1 2]
	[local73 6] = [1010 24 2 1 1]
	[local79 4] = [1010 27 1]
	[local83 5] = [1010 28 1 2]
	[local88 4] = [1010 30 1]
	[local92 5] = [1010 31 1 1]
	[local97 6] = [1010 44 1 2 1]
	[local103 5] = [1010 47 2 1]
	[local108 6] = [1010 49 2 1 2]
	[local114 9] = [1010 52 1 2 1 2 1 2]
	[local123 8] = [1010 58 1 0 1010 59 1]
	[local131 4] = [1010 60 1]
	[local135 4] = [1010 61 1]
	[local139 4] = [1010 62 1]
	[local143 4] = [1010 64 1]
	[local147 5] = [1010 65 1 1]
	[local152 9] = [1010 67 1 2 1 2 2 1]
	[local161 6] = [1010 73 1 2 1]
	[local167 5] = [1010 76 1 1]
	[local172 4] = [1010 41 1]
	[local176 4] = [1010 42 1]
	[local180 4] = [1010 79 1]
	[local184 4] = [1010 80 1]
	[local188 13] = [1010 82 2 1 1 2 1 2 1 2 1 1]
	[local201 4] = [1010 92 1]
	[local205 4] = [1010 93 1]
	[local209 4] = [1010 94 1]
	[local213 6] = [1010 95 2 1 2]
	[local219 6] = [1010 98 2 1 2]
	[local225 6] = [1010 101 2 1 2]
	[local231 6] = [1010 104 2 1 2]
	[local237 4] = [1010 107 1]
)
(instance fKnight of Actor
	(properties
		x 181
		y 105
		z 33
		view 121
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    1
			pushi    27
			callb    proc0_5,  2
			bnt      code_0078
			ldi      1
			sal      local30
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    167
			pushi    77
			pushi    203
			pushi    77
			pushi    206
			pushi    74
			pushi    244
			pushi    74
			pushi    245
			pushi    84
			pushi    228
			pushi    94
			pushi    214
			pushi    99
			pushi    203
			pushi    103
			pushi    150
			pushi    103
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     6
			jmp      code_00da
code_0078:
			pushi    #number
			pushi    1
			pushi    126
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #egoMoveSpeed
			pushi    0
			lag      global1
			send     4
			sal      local28
			pushi    #init
			pushi    0
			lofsa    horseHead
			send     4
			pushi    #init
			pushi    0
			lofsa    horseBody
			send     4
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_00da
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_00da
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    bigWill
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    bigJohn
			send     8
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    bigTuck
			send     8
code_00da:
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_0102
			pushi    1
			pushi    110
			callb    proc0_7,  2
			lal      local30
			not     
			bnt      code_0102
			pushi    #setScript
			pushi    1
			lofsa    handCodeDelay
			push    
			lag      global2
			send     6
code_0102:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local31
			bt       code_0345
			lal      local32
code_0345:
			bnt      code_03c7
			pushi    #put
			pushi    0
			lag      global133
			send     4
			pushi    #put
			pushi    0
			lag      global134
			send     4
			pushi    #put
			pushi    0
			lag      global135
			send     4
			lsl      local32
			ldi      1
			and     
			bnt      code_0379
			pushi    #owner
			pushi    1
			pushi    140
			pushi    #at
			pushi    1
			pushi    2
			lag      global9
			send     6
			send     6
code_0379:
			lsl      local32
			ldi      2
			and     
			bnt      code_0393
			pushi    #owner
			pushi    1
			pushi    140
			pushi    #at
			pushi    1
			pushi    14
			lag      global9
			send     6
			send     6
code_0393:
			lsl      local32
			ldi      4
			and     
			bnt      code_03ad
			pushi    #owner
			pushi    1
			pushi    140
			pushi    #at
			pushi    1
			pushi    10
			lag      global9
			send     6
			send     6
code_03ad:
			lsl      local32
			ldi      8
			and     
			bnt      code_03c7
			pushi    #owner
			pushi    1
			pushi    140
			pushi    #at
			pushi    1
			pushi    18
			lag      global9
			send     6
			send     6
code_03c7:
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #notify
			pushi    0
			lag      global2
			send     4
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			self     12
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    horseSound
			send     8
			lal      local40
			bnt      code_0406
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
code_0406:
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    horseHead
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    horseBody
			send     8
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    theSword
			send     8
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    1
			pushi    10
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lal      local30
			bnt      code_0123
			lsp      theVerb
			ldi      3
			ne?     
			bnt      code_0123
			pushi    2
			pushi    1010
			pushi    4
			calle    proc13_4,  4
			jmp      code_033d
code_0123:
			lal      local39
			bnt      code_013e
			pushi    3
			lsp      theVerb
			pushi    10
			pushi    2
			calle    proc999_5,  6
			not     
			bnt      code_013e
			ldi      0
			jmp      code_033d
code_013e:
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0154
			pushi    2
			pushi    1010
			pushi    3
			calle    proc13_4,  4
			jmp      code_033c
code_0154:
			dup     
			ldi      5
			eq?     
			bnt      code_0182
			lal      local36
			bnt      code_016f
			pushi    #setScript
			pushi    1
			lofsa    yakItUp2
			push    
			lag      global2
			send     6
			jmp      code_033c
code_016f:
			ldi      1
			sal      local36
			pushi    #setScript
			pushi    1
			lofsa    yakItUp1
			push    
			lag      global2
			send     6
			jmp      code_033c
code_0182:
			dup     
			ldi      10
			eq?     
			bnt      code_0198
			pushi    #setScript
			pushi    1
			lofsa    killHim
			push    
			lag      global2
			send     6
			jmp      code_033c
code_0198:
			dup     
			ldi      4
			eq?     
			bnt      code_02d5
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_01be
			pushi    4
			pushi    1
			lea      @local205
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_02d1
code_01be:
			dup     
			ldi      0
			eq?     
			bnt      code_01e7
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			sal      local31
			bnt      code_02d1
			pushi    4
			pushi    1
			lea      @local209
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_02d1
code_01e7:
			dup     
			ldi      2
			eq?     
			bnt      code_0216
			pushi    3
			lea      @local213
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    2
			lofsa    fKnight
			push    
			lag      global0
			send     8
			lsl      local32
			ldi      1
			or      
			sal      local32
			jmp      code_02d1
code_0216:
			dup     
			ldi      14
			eq?     
			bnt      code_0246
			pushi    3
			lea      @local219
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    14
			lofsa    fKnight
			push    
			lag      global0
			send     8
			lsl      local32
			ldi      2
			or      
			sal      local32
			jmp      code_02d1
code_0246:
			dup     
			ldi      10
			eq?     
			bnt      code_0282
			pushi    3
			lea      @local225
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    10
			lofsa    fKnight
			push    
			lag      global0
			send     8
			lsg      global115
			ldi      2
			eq?     
			bnt      code_0278
			ldi      0
			sag      global115
code_0278:
			lsl      local32
			ldi      4
			or      
			sal      local32
			jmp      code_02d1
code_0282:
			dup     
			ldi      18
			eq?     
			bnt      code_02be
			pushi    3
			lea      @local231
			push    
			pushi    1
			lea      @local0
			push    
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    18
			lofsa    fKnight
			push    
			lag      global0
			send     8
			lsg      global115
			ldi      1
			eq?     
			bnt      code_02b4
			ldi      0
			sag      global115
code_02b4:
			lsl      local32
			ldi      8
			or      
			sal      local32
			jmp      code_02d1
code_02be:
			pushi    4
			pushi    1
			lea      @local237
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
code_02d1:
			toss    
			jmp      code_033c
code_02d5:
			dup     
			ldi      3
			eq?     
			bnt      code_0331
			lal      local30
			bnt      code_0306
			lal      local37
			bnt      code_02f3
			pushi    2
			pushi    1010
			pushi    38
			calle    proc13_4,  4
			jmp      code_033c
code_02f3:
			ldi      1
			sal      local37
			pushi    #setScript
			pushi    1
			lofsa    searchHim
			push    
			lag      global2
			send     6
			jmp      code_033c
code_0306:
			lal      local34
			bnt      code_031e
			ldi      1
			sal      local35
			pushi    #setScript
			pushi    1
			lofsa    robinDeath
			push    
			lag      global2
			send     6
			jmp      code_033c
code_031e:
			ldi      1
			sal      local34
			pushi    #setScript
			pushi    1
			lofsa    doWarning
			push    
			lag      global2
			send     6
			jmp      code_033c
code_0331:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_033c:
			toss    
code_033d:
			ret     
		)
	)
)

(instance horseBody of Prop
	(properties
		x 184
		y 100
		view 121
		cel 2
		signal $4001
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04e2
			pushi    2
			pushi    1010
			pushi    5
			calle    proc13_4,  4
			jmp      code_0567
code_04e2:
			dup     
			ldi      3
			eq?     
			bnt      code_052a
			lal      local30
			bnt      code_0514
			lal      local40
			bnt      code_0507
			pushi    4
			pushi    1
			lea      @local172
			push    
			pushi    13
			pushi    3
			calle    proc851_0,  8
			jmp      code_0567
code_0507:
			pushi    2
			pushi    1010
			pushi    40
			calle    proc13_4,  4
			jmp      code_0567
code_0514:
			pushi    4
			pushi    1
			lea      @local176
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_0567
code_052a:
			dup     
			ldi      5
			eq?     
			bnt      code_0548
			lal      local39
			bnt      code_053b
			ldi      0
			jmp      code_0567
code_053b:
			pushi    #setScript
			pushi    1
			lofsa    nayTalk
			push    
			self     6
			jmp      code_0567
code_0548:
			dup     
			ldi      4
			eq?     
			bnt      code_055c
			pushi    2
			pushi    1010
			pushi    43
			calle    proc13_4,  4
			jmp      code_0567
code_055c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_0567:
			toss    
			ret     
		)
	)
)

(instance horseHead of Prop
	(properties
		x 174
		y 110
		z 42
		view 121
		cel 1
		signal $4001
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (doit param1)
		(asm
			pTos     cel
			ldi      3
			eq?     
			bnt      code_0607
			pushi    2
			pushi    0
			pushi    3
			callk    Random,  4
			not     
			bnt      code_0607
			pushi    #handle
			pushi    0
			lofsa    horseSound
			send     4
			not     
			bnt      code_0607
			pTos     signal
			ldi      2
			and     
			bnt      code_0607
			pushi    #play
			pushi    0
			lofsa    horseSound
			send     4
code_0607:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0626
			pushi    2
			pushi    1010
			pushi    5
			calle    proc13_4,  4
			jmp      code_06d7
code_0626:
			dup     
			ldi      3
			eq?     
			bnt      code_066e
			lal      local30
			bnt      code_0658
			lal      local40
			bnt      code_064b
			pushi    4
			pushi    1
			lea      @local172
			push    
			pushi    13
			pushi    3
			calle    proc851_0,  8
			jmp      code_06d7
code_064b:
			pushi    2
			pushi    1010
			pushi    40
			calle    proc13_4,  4
			jmp      code_06d7
code_0658:
			pushi    4
			pushi    1
			lea      @local176
			push    
			lea      @local0
			push    
			pushi    3
			calle    proc851_0,  8
			jmp      code_06d7
code_066e:
			dup     
			ldi      5
			eq?     
			bnt      code_068c
			lal      local39
			bnt      code_067f
			ldi      0
			jmp      code_06d7
code_067f:
			pushi    #setScript
			pushi    1
			lofsa    nayTalk
			push    
			self     6
			jmp      code_06d7
code_068c:
			dup     
			ldi      10
			eq?     
			bnt      code_06b8
			lal      local30
			bnt      code_06a6
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
			jmp      code_06d7
code_06a6:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			lofsa    fKnight
			send     8
			jmp      code_06d7
code_06b8:
			dup     
			ldi      4
			eq?     
			bnt      code_06cc
			pushi    2
			pushi    1010
			pushi    43
			calle    proc13_4,  4
			jmp      code_06d7
code_06cc:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Prop,  6
code_06d7:
			toss    
			ret     
		)
	)
)

(instance theSword of View
	(properties
		x 183
		y 28
		view 123
		signal $6000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0762
			pushi    2
			pushi    1010
			pushi    6
			calle    proc13_4,  4
			jmp      code_0781
code_0762:
			dup     
			ldi      3
			eq?     
			bnt      code_0776
			pushi    2
			pushi    1010
			pushi    39
			calle    proc13_4,  4
			jmp      code_0781
code_0776:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0781:
			toss    
			ret     
		)
	)
)

(instance nayTalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_080b
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local131
			push    
			pushi    1
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_085a
code_080b:
			dup     
			ldi      1
			eq?     
			bnt      code_0830
			pushi    #play
			pushi    0
			lofsa    horseSound
			send     4
			pushi    5
			pushi    1
			lea      @local135
			push    
			lea      @local9
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_085a
code_0830:
			dup     
			ldi      2
			eq?     
			bnt      code_084a
			pushi    5
			pushi    1
			lea      @local139
			push    
			pushi    1
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_085a
code_084a:
			dup     
			ldi      3
			eq?     
			bnt      code_085a
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_085a:
			toss    
			ret     
		)
	)
)

(instance fKnightEncounter of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
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
			bnt      code_08e8
			pushi    1
			pushi    38
			callb    proc0_5,  2
			bnt      code_08df
			pushi    1
			pushi    27
			callb    proc0_5,  2
			not     
			bnt      code_08df
			pushi    1
			pushi    136
			callb    proc0_5,  2
			not     
			bnt      code_08df
			pushi    #setScript
			pushi    2
			lofsa    willSez
			push    
			pushSelf
			self     8
			jmp      code_0afa
code_08df:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0afa
code_08e8:
			dup     
			ldi      1
			eq?     
			bnt      code_095e
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    563
			pushi    1
			pushi    4
			class    Wat
			send     12
			pushi    #contains
			pushi    1
			lofsa    fKnight
			push    
			lag      global5
			send     6
			not     
			bnt      code_0919
			pushi    #init
			pushi    0
			lofsa    fKnight
			send     4
code_0919:
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    58
			pushi    1
			pushi    90
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    149
			pushi    93
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    267
			pushi    1
			lofsa    egoActions
			push    
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    285
			pushi    0
			lag      global0
			send     52
			pushi    #stopUpd
			pushi    0
			lag      global109
			send     4
			ldi      12
			aTop     ticks
			jmp      code_0afa
code_095e:
			dup     
			ldi      2
			eq?     
			bnt      code_0986
			pushi    11
			pushi    4
			lea      @local47
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushi    13
			pushi    2
			pushi    14
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_0afa
code_0986:
			dup     
			ldi      3
			eq?     
			bnt      code_0994
			ldi      60
			aTop     ticks
			jmp      code_0afa
code_0994:
			dup     
			ldi      4
			eq?     
			bnt      code_09bd
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    bigJohn
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    bigWill
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    bigTuck
			send     6
			ldi      18
			aTop     ticks
			jmp      code_0afa
code_09bd:
			dup     
			ldi      5
			eq?     
			bnt      code_0a3f
			pushi    #setLoop
			pushi    1
			pushi    4
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65516
			pushi    #y
			pushi    0
			lofsa    bigJohn
			send     4
			push    
			pushSelf
			lofsa    bigJohn
			send     24
			pushi    #setLoop
			pushi    1
			pushi    5
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    300
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    bigTuck
			send     4
			push    
			pushi    65534
			pushSelf
			lofsa    bigTuck
			send     30
			pushi    #setLoop
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
			pushi    340
			pushi    #y
			pushi    0
			lofsa    bigWill
			send     4
			push    
			pushSelf
			lofsa    bigWill
			send     24
			jmp      code_0afa
code_0a3f:
			dup     
			ldi      6
			eq?     
			bnt      code_0a49
			jmp      code_0afa
code_0a49:
			dup     
			ldi      7
			eq?     
			bnt      code_0a53
			jmp      code_0afa
code_0a53:
			dup     
			ldi      8
			eq?     
			bnt      code_0a8b
			pushi    #dispose
			pushi    0
			lofsa    bigWill
			send     4
			pushi    #dispose
			pushi    0
			lofsa    bigJohn
			send     4
			pushi    #dispose
			pushi    0
			lofsa    bigTuck
			send     4
			pushi    7
			pushi    2
			lea      @local61
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0afa
code_0a8b:
			dup     
			ldi      9
			eq?     
			bnt      code_0afa
			pushi    #view
			pushi    1
			pushi    125
			pushi    6
			pushi    1
			pushi    2
			pushi    142
			pushi    1
			pushi    #new
			pushi    0
			lofsa    horseMove
			send     4
			push    
			lofsa    horseHead
			send     18
			pushi    #view
			pushi    1
			pushi    125
			pushi    6
			pushi    1
			pushi    3
			pushi    142
			pushi    1
			pushi    #new
			pushi    0
			lofsa    horseMove
			send     4
			push    
			lofsa    horseBody
			send     18
			pushi    #view
			pushi    1
			pushi    125
			pushi    287
			pushi    0
			lofsa    fKnight
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    5
			pushi    0
			lag      global69
			send     8
			pushi    #canControl
			pushi    1
			pushi    0
			class    User
			send     6
			pushi    1
			pushi    27
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
code_0afa:
			toss    
			ret     
		)
	)
)

(instance willSez of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b6b
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lsg      global0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			pushi    2
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      48
			aTop     ticks
			jmp      code_0bdb
code_0b6b:
			dup     
			ldi      1
			eq?     
			bnt      code_0b86
			pushi    5
			pushi    1
			lea      @local41
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0bdb
code_0b86:
			dup     
			ldi      2
			eq?     
			bnt      code_0b94
			ldi      60
			aTop     ticks
			jmp      code_0bdb
code_0b94:
			dup     
			ldi      3
			eq?     
			bnt      code_0bc2
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32775
			lag      global2
			send     8
			ldi      60
			aTop     ticks
			jmp      code_0bdb
code_0bc2:
			dup     
			ldi      4
			eq?     
			bnt      code_0bdb
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32774
			lag      global2
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_0bdb:
			toss    
			ret     
		)
	)
)

(instance horseMove of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c3c
			lal      local39
			bnt      code_0c2e
			ldi      12
			jmp      code_0c37
code_0c2e:
			pushi    2
			pushi    30
			pushi    240
			callk    Random,  4
code_0c37:
			aTop     ticks
			jmp      code_0c8d
code_0c3c:
			dup     
			ldi      1
			eq?     
			bnt      code_0c7c
			pushi    288
			pushi    1
			pushi    2
			pushi    0
			pushi    #lastCel
			pushi    0
			pToa     client
			send     4
			push    
			callk    Random,  4
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    0
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_0c6d
			ldi      1
			jmp      code_0c6f
code_0c6d:
			ldi      65535
code_0c6f:
			push    
			pushSelf
			pushi    292
			pushi    0
			pToa     client
			send     22
			jmp      code_0c8d
code_0c7c:
			dup     
			ldi      2
			eq?     
			bnt      code_0c8d
			ldi      65535
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_0c8d:
			toss    
			ret     
		)
	)
)

(instance handCodeDelay of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cdd
			ldi      3
			aTop     cycles
			jmp      code_0d73
code_0cdd:
			dup     
			ldi      1
			eq?     
			bnt      code_0d24
			lal      local33
			not     
			bnt      code_0d07
			ldi      1
			sal      local33
			pushi    7
			pushi    2
			lea      @local67
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0d73
code_0d07:
			ldi      1
			aTop     register
			pushi    7
			pushi    2
			lea      @local73
			push    
			pushi    2
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0d73
code_0d24:
			dup     
			ldi      2
			eq?     
			bnt      code_0d73
			pToa     register
			bnt      code_0d5c
			ldi      1
			sal      local39
			pushi    0
			callk    HaveMouse,  0
			not     
			bnt      code_0d4d
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    183
			pushi    41
			lag      global1
			send     12
code_0d4d:
			pushi    #setScript
			pushi    1
			lofsa    liftSword
			push    
			pToa     client
			send     6
			jmp      code_0d73
code_0d5c:
			pushi    1
			pushi    67
			callb    proc0_5,  2
			bnt      code_0d6e
			pushi    1
			pushi    50
			calle    proc806_1,  2
code_0d6e:
			pushi    #dispose
			pushi    0
			self     4
code_0d73:
			toss    
			ret     
		)
	)
)

(instance liftSword of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0df7
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    4
			pushi    5
			pushi    0
			pushi    6
			pushi    7
			lag      global69
			send     12
			pushi    1
			pushi    4
			calle    proc806_6,  2
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lofsa    fKnight
			send     12
			jmp      code_0e53
code_0df7:
			dup     
			ldi      1
			eq?     
			bnt      code_0e05
			ldi      120
			aTop     ticks
			jmp      code_0e53
code_0e05:
			dup     
			ldi      2
			eq?     
			bnt      code_0e23
			pushi    5
			pushi    1
			lea      @local79
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_0e53
code_0e23:
			dup     
			ldi      3
			eq?     
			bnt      code_0e31
			ldi      120
			aTop     ticks
			jmp      code_0e53
code_0e31:
			dup     
			ldi      4
			eq?     
			bnt      code_0e53
			pushi    0
			callb    proc0_3,  0
			pushi    #start
			pushi    1
			pushi    3
			lofsa    robinDeath
			send     6
			pushi    #setScript
			pushi    1
			lofsa    robinDeath
			push    
			pToa     client
			send     6
code_0e53:
			toss    
			ret     
		)
	)
)

(instance doWarning of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ed0
			pushi    0
			callb    proc0_3,  0
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0f44
code_0ed0:
			dup     
			ldi      1
			eq?     
			bnt      code_0ede
			ldi      18
			aTop     ticks
			jmp      code_0f44
code_0ede:
			dup     
			ldi      2
			eq?     
			bnt      code_0efe
			pushi    7
			pushi    2
			lea      @local83
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0f44
code_0efe:
			dup     
			ldi      3
			eq?     
			bnt      code_0f1e
			pushi    #setCycle
			pushi    1
			class    Rev
			push    
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    65530
			pushSelf
			lag      global0
			send     16
			jmp      code_0f44
code_0f1e:
			dup     
			ldi      4
			eq?     
			bnt      code_0f44
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    5
			pushi    0
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_0f44:
			toss    
			ret     
		)
	)
)

(instance robinDeath of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0fb6
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    #x
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_10ed
code_0fb6:
			dup     
			ldi      1
			eq?     
			bnt      code_0fc4
			ldi      18
			aTop     ticks
			jmp      code_10ed
code_0fc4:
			dup     
			ldi      2
			eq?     
			bnt      code_0fde
			pushi    5
			pushi    1
			lea      @local88
			push    
			pushi    1
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_10ed
code_0fde:
			dup     
			ldi      3
			eq?     
			bnt      code_1013
			pushi    219
			pushi    #superClass
			pushi    3
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    #lastCel
			pushi    0
			lofsa    fKnight
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    1
			pushSelf
			lofsa    fKnight
			send     18
			pushi    #play
			pushi    0
			lofsa    swordSound
			send     4
			jmp      code_10ed
code_1013:
			dup     
			ldi      4
			eq?     
			bnt      code_1064
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    fKnight
			send     6
			pushi    #view
			pushi    1
			pushi    792
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    3
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     32
			pushi    #number
			pushi    1
			pushi    907
			pushi    42
			pushi    0
			lofsa    swordSound
			send     10
			jmp      code_10ed
code_1064:
			dup     
			ldi      5
			eq?     
			bnt      code_1081
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    fKnight
			send     14
			jmp      code_10ed
code_1081:
			dup     
			ldi      6
			eq?     
			bnt      code_10c3
			pushi    #dispose
			pushi    0
			lofsa    swordSound
			send     4
			lal      local35
			bnt      code_10ac
			pushi    5
			pushi    1
			lea      @local92
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_10ed
code_10ac:
			pushi    5
			pushi    1
			lea      @local143
			push    
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_10ed
code_10c3:
			dup     
			ldi      7
			eq?     
			bnt      code_10ed
			ldi      3
			sag      global145
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    horseHead
			send     6
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    horseBody
			send     6
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_10ed:
			toss    
			ret     
		)
	)
)

(instance killHim of Script
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Script,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_118b
			pushi    0
			callb    proc0_3,  0
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    #view
			pushi    1
			pushi    123
			pushi    162
			pushi    1
			pushi    1
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
			pushi    #cycleSpeed
			pushi    1
			pushi    12
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    1
			lofsa    fKnight
			send     16
			jmp      code_1410
code_118b:
			dup     
			ldi      1
			eq?     
			bnt      code_11c9
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    3
			pushi    181
			pushi    72
			pushi    0
			pushi    66
			pushi    1
			pushi    13
			pushi    219
			pushi    1
			lsg      global141
			lofsa    fKnight
			send     34
			lsg      global141
			ldi      2
			mul     
			aTop     ticks
			jmp      code_1410
code_11c9:
			dup     
			ldi      2
			eq?     
			bnt      code_12a8
			lal      local29
			bnt      code_11f3
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #number
			pushi    1
			pushi    907
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lofsa    shootSound
			send     16
			ldi      0
			sal      local29
code_11f3:
			pushi    #cel
			pushi    0
			lofsa    fKnight
			send     4
			sat      temp0
			pushi    288
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    fKnight
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    fKnight
			send     4
			push    
			lat      temp0
			lali     local18
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    fKnight
			send     4
			push    
			lat      temp0
			lali     local23
			add     
			push    
			lofsa    fKnight
			send     18
			lst      temp0
			dup     
			ldi      1
			eq?     
			bnt      code_124b
			pushi    #init
			pushi    0
			lofsa    theSword
			send     4
			jmp      code_129d
code_124b:
			dup     
			ldi      2
			eq?     
			bnt      code_1268
			pushi    #setCel
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    164
			pushi    22
			lofsa    theSword
			send     14
			jmp      code_129d
code_1268:
			dup     
			ldi      3
			eq?     
			bnt      code_1285
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    284
			pushi    2
			pushi    145
			pushi    24
			lofsa    theSword
			send     14
			jmp      code_129d
code_1285:
			dup     
			ldi      4
			eq?     
			bnt      code_129d
			pushi    #posn
			pushi    2
			pushi    125
			pushi    55
			pushi    285
			pushi    0
			lofsa    theSword
			send     12
code_129d:
			toss    
			lsg      global141
			ldi      2
			mul     
			aTop     ticks
			jmp      code_1410
code_12a8:
			dup     
			ldi      3
			eq?     
			bnt      code_1379
			pushi    #cel
			pushi    0
			lofsa    fKnight
			send     4
			push    
			pushi    #lastCel
			pushi    0
			lofsa    fKnight
			send     4
			eq?     
			bnt      code_1369
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    18
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			pushi    #setPri
			pushi    1
			pushi    65535
			pushi    285
			pushi    0
			lofsa    fKnight
			send     10
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    horseHead
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    85
			pushi    1
			pushi    #z
			pushi    0
			lofsa    horseHead
			send     4
			push    
			ldi      10
			sub     
			push    
			lofsa    horseHead
			send     12
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    167
			pushi    77
			pushi    203
			pushi    77
			pushi    206
			pushi    74
			pushi    244
			pushi    74
			pushi    245
			pushi    84
			pushi    228
			pushi    94
			pushi    214
			pushi    99
			pushi    203
			pushi    103
			pushi    150
			pushi    103
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     6
			ldi      1
			sal      local30
			ldi      0
			sal      local39
			jmp      code_1410
code_1369:
			pTos     state
			ldi      2
			sub     
			aTop     state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1410
code_1379:
			dup     
			ldi      4
			eq?     
			bnt      code_1387
			ldi      24
			aTop     ticks
			jmp      code_1410
code_1387:
			dup     
			ldi      5
			eq?     
			bnt      code_13c4
			pushi    #number
			pushi    1
			pushi    128
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    162
			pushi    #superClass
			pushi    1
			pushi    288
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			add     
			push    
			lag      global0
			send     18
			ldi      12
			aTop     ticks
			jmp      code_1410
code_13c4:
			dup     
			ldi      6
			eq?     
			bnt      code_13d7
			pushi    1
			pushi    0
			callb    proc0_2,  2
			ldi      12
			aTop     ticks
			jmp      code_1410
code_13d7:
			dup     
			ldi      7
			eq?     
			bnt      code_13ed
			pushi    3
			pushi    1010
			pushi    63
			pushSelf
			calle    proc13_4,  6
			jmp      code_1410
code_13ed:
			dup     
			ldi      8
			eq?     
			bnt      code_1410
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    #setSpeed
			pushi    1
			lsl      local28
			lag      global1
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_1410:
			toss    
			ret     
		)
	)
)

(instance searchHim of TScript
	(properties)
	
	(method (dispose param1)
		(asm
			pushi    #dispose
			pushi    0
			&rest    param1
			super    TScript,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1480
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    243
			pushi    94
			pushSelf
			lag      global0
			send     12
			jmp      code_163c
code_1480:
			dup     
			ldi      1
			eq?     
			bnt      code_1496
			pushi    #setHeading
			pushi    2
			pushi    315
			pushSelf
			lag      global0
			send     8
			jmp      code_163c
code_1496:
			dup     
			ldi      2
			eq?     
			bnt      code_14bf
			pushi    #view
			pushi    1
			pushi    7
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_163c
code_14bf:
			dup     
			ldi      3
			eq?     
			bnt      code_14cd
			ldi      24
			aTop     ticks
			jmp      code_163c
code_14cd:
			dup     
			ldi      4
			eq?     
			bnt      code_14ef
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
			ldi      24
			aTop     ticks
			jmp      code_163c
code_14ef:
			dup     
			ldi      5
			eq?     
			bnt      code_1511
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
			ldi      24
			aTop     ticks
			jmp      code_163c
code_1511:
			dup     
			ldi      6
			eq?     
			bnt      code_1536
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    #get
			pushi    1
			pushi    9
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     14
			jmp      code_163c
code_1536:
			dup     
			ldi      7
			eq?     
			bnt      code_154c
			pushi    3
			pushi    1010
			pushi    33
			pushSelf
			calle    proc13_4,  6
			jmp      code_163c
code_154c:
			dup     
			ldi      8
			eq?     
			bnt      code_1562
			pushi    3
			pushi    1010
			pushi    34
			pushSelf
			calle    proc13_4,  6
			jmp      code_163c
code_1562:
			dup     
			ldi      9
			eq?     
			bnt      code_157e
			pushi    1
			pushi    7
			callb    proc0_2,  2
			pushi    3
			pushi    1010
			pushi    35
			pushSelf
			calle    proc13_4,  6
			jmp      code_163c
code_157e:
			dup     
			ldi      10
			eq?     
			bnt      code_159e
			pushi    3
			pushi    1010
			pushi    36
			pushSelf
			calle    proc13_4,  6
			pushi    #get
			pushi    1
			pushi    9
			lag      global0
			send     6
			jmp      code_163c
code_159e:
			dup     
			ldi      11
			eq?     
			bnt      code_162c
			lal      local31
			bt       code_15ac
			lal      local32
code_15ac:
			bnt      code_1623
			pushi    3
			pushi    1010
			pushi    37
			pushSelf
			calle    proc13_4,  6
			pushi    #put
			pushi    0
			lag      global133
			send     4
			pushi    #put
			pushi    0
			lag      global134
			send     4
			pushi    #put
			pushi    0
			lag      global135
			send     4
			lsl      local32
			ldi      1
			and     
			bnt      code_15e4
			pushi    #get
			pushi    1
			pushi    2
			lag      global0
			send     6
code_15e4:
			lsl      local32
			ldi      2
			and     
			bnt      code_15f6
			pushi    #get
			pushi    1
			pushi    14
			lag      global0
			send     6
code_15f6:
			lsl      local32
			ldi      4
			and     
			bnt      code_1608
			pushi    #get
			pushi    1
			pushi    10
			lag      global0
			send     6
code_1608:
			lsl      local32
			ldi      8
			and     
			bnt      code_161a
			pushi    #get
			pushi    1
			pushi    18
			lag      global0
			send     6
code_161a:
			ldi      0
			sal      local31
			sal      local32
			jmp      code_163c
code_1623:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_163c
code_162c:
			dup     
			ldi      12
			eq?     
			bnt      code_163c
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_163c:
			toss    
			ret     
		)
	)
)

(instance yakItUp1 of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16a9
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local97
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1751
code_16a9:
			dup     
			ldi      1
			eq?     
			bnt      code_16c3
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lofsa    fKnight
			send     12
			jmp      code_1751
code_16c3:
			dup     
			ldi      2
			eq?     
			bnt      code_16d1
			ldi      30
			aTop     ticks
			jmp      code_1751
code_16d1:
			dup     
			ldi      3
			eq?     
			bnt      code_16f1
			pushi    7
			pushi    2
			lea      @local103
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1751
code_16f1:
			dup     
			ldi      4
			eq?     
			bnt      code_1708
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    fKnight
			send     8
			jmp      code_1751
code_1708:
			dup     
			ldi      5
			eq?     
			bnt      code_1716
			ldi      30
			aTop     ticks
			jmp      code_1751
code_1716:
			dup     
			ldi      6
			eq?     
			bnt      code_1736
			pushi    7
			pushi    2
			lea      @local108
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1751
code_1736:
			dup     
			ldi      7
			eq?     
			bnt      code_1751
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    5
			pushi    0
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_1751:
			toss    
			ret     
		)
	)
)

(instance yakItUp2 of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_17b9
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local114
			push    
			pushi    1
			pushi    2
			lea      @local0
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1803
code_17b9:
			dup     
			ldi      1
			eq?     
			bnt      code_17d3
			pushi    5
			pushi    1
			lea      @local123
			push    
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_1803
code_17d3:
			dup     
			ldi      2
			eq?     
			bnt      code_1803
			ldi      1
			sal      local39
			pushi    0
			callk    HaveMouse,  0
			not     
			bnt      code_17f7
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    183
			pushi    41
			lag      global1
			send     12
code_17f7:
			pushi    #setScript
			pushi    1
			lofsa    liftSword
			push    
			pToa     client
			send     6
code_1803:
			toss    
			ret     
		)
	)
)

(instance hereComesJohn of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18c4
			pushi    0
			callb    proc0_3,  0
			pushi    95
			pushi    #y
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_188d
			pprev   
			ldi      145
			lt?     
			bnt      code_188d
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      250
			gt?     
			bnt      code_188d
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    245
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     10
code_188d:
			pushi    #actions
			pushi    1
			lofsa    johnActions
			push    
			pushi    284
			pushi    2
			pushi    330
			pushi    120
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    152
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    270
			pushi    120
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     38
			jmp      code_1947
code_18c4:
			dup     
			ldi      1
			eq?     
			bnt      code_18dd
			pushi    3
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1947
code_18dd:
			dup     
			ldi      2
			eq?     
			bnt      code_18f9
			pushi    5
			pushi    1
			lea      @local147
			push    
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1947
code_18f9:
			dup     
			ldi      3
			eq?     
			bnt      code_1933
			pushi    #has
			pushi    1
			pushi    9
			lag      global0
			send     6
			bnt      code_1920
			pushi    4
			lea      @local161
			push    
			pushi    1
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_1947
code_1920:
			pushi    4
			lea      @local152
			push    
			pushi    1
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_1947
code_1933:
			dup     
			ldi      4
			eq?     
			bnt      code_1947
			pushi    0
			callb    proc0_4,  0
			ldi      1
			sal      local40
			pushi    #dispose
			pushi    0
			self     4
code_1947:
			toss    
			ret     
		)
	)
)

(instance showLetter of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19bb
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    35
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			pushi    2
			lsg      global0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			jmp      code_19ee
code_19bb:
			dup     
			ldi      1
			eq?     
			bnt      code_19d5
			pushi    4
			lea      @local188
			push    
			pushi    1
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_19ee
code_19d5:
			dup     
			ldi      2
			eq?     
			bnt      code_19ee
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_19ee:
			toss    
			ret     
		)
	)
)

(instance johnActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1a42
			ldi      1
			pushi    2
			pushi    1010
			pushi    78
			calle    proc13_4,  4
			jmp      code_1acc
code_1a42:
			dup     
			ldi      3
			eq?     
			bnt      code_1a5f
			ldi      1
			pushi    4
			pushi    1
			lea      @local180
			push    
			pushi    13
			pushi    3
			calle    proc851_0,  8
			jmp      code_1acc
code_1a5f:
			dup     
			ldi      5
			eq?     
			bnt      code_1a7c
			ldi      1
			pushi    4
			pushi    1
			lea      @local184
			push    
			pushi    13
			pushi    3
			calle    proc851_0,  8
			jmp      code_1acc
code_1a7c:
			dup     
			ldi      10
			eq?     
			bnt      code_1a92
			ldi      1
			pushi    2
			pushi    1010
			pushi    81
			calle    proc13_4,  4
			jmp      code_1acc
code_1a92:
			dup     
			ldi      4
			eq?     
			bnt      code_1acc
			lsp      param2
			ldi      9
			eq?     
			bnt      code_1acc
			ldi      1
			lal      local38
			bnt      code_1abc
			pushi    4
			pushi    1
			lea      @local201
			push    
			pushi    13
			pushi    3
			calle    proc851_0,  8
			jmp      code_1acc
code_1abc:
			ldi      1
			sal      local38
			pushi    #setScript
			pushi    1
			lofsa    showLetter
			push    
			lag      global2
			send     6
code_1acc:
			toss    
			ret     
		)
	)
)

(instance localHorn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1b4e
			pushi    0
			callb    proc0_3,  0
			lal      local40
			bnt      code_1b15
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1bde
code_1b15:
			lal      local30
			bnt      code_1b30
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    140
			pushSelf
			lag      global0
			send     12
			jmp      code_1bde
code_1b30:
			pushi    #view
			pushi    1
			pushi    10
			pushi    288
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_1bde
code_1b4e:
			dup     
			ldi      1
			eq?     
			bnt      code_1ba5
			lal      local40
			bnt      code_1b6f
			pushi    5
			pushi    1
			lea      @local167
			push    
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  10
			jmp      code_1bde
code_1b6f:
			lal      local30
			bnt      code_1b86
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1bde
code_1b86:
			pushi    #start
			pushi    1
			pushi    3
			lofsa    robinDeath
			send     6
			pushi    #setScript
			pushi    1
			lofsa    robinDeath
			push    
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1bde
code_1ba5:
			dup     
			ldi      2
			eq?     
			bnt      code_1bde
			lal      local30
			bnt      code_1bd5
			lal      local40
			not     
			bnt      code_1bd5
			pushi    #setScript
			pushi    1
			lofsa    hereComesJohn
			push    
			lag      global2
			send     6
			pushi    #setHeading
			pushi    1
			pushi    90
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1bde
code_1bd5:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1bde:
			toss    
			ret     
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lal      local39
			bnt      code_1c2d
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    SpecialDoVerb,  6
			jmp      code_1c4b
code_1c2d:
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_1c4b
			lsp      param2
			ldi      1
			eq?     
			bnt      code_1c4b
			pushi    #setScript
			pushi    1
			lofsa    localHorn
			push    
			lag      global0
			send     6
			ldi      1
code_1c4b:
			ret     
		)
	)
)

(instance horseSound of Sound
	(properties
		flags $0001
		number 913
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 906
	)
)

(instance swordSound of Sound
	(properties
		flags $0001
		number 934
	)
)

(instance bigJohn of Actor
	(properties
		x 115
		y 103
		view 121
		loop 1
	)
)

(instance bigTuck of Actor
	(properties
		x 230
		y 73
		view 121
		loop 2
	)
)

(instance bigWill of Actor
	(properties
		x 281
		y 116
		view 121
		loop 3
	)
)
