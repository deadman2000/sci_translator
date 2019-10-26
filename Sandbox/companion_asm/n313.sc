;;; Sierra Script 1.0 - (do not remove this comment)
(script# 313)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n851)
(use n852)
(use n927)
(use n930)
(use n945)
(use n950)
(use n992)
(use n998)
(use n999)

(public
	scholar2 0
)

(local
	local0 =  1
	local1
	local2
	[local3 9] = [323 0 2 4 26 35 21 24 23]
	[local12 3] = [-1 4414 19]
	[local15 3] = [-1 4420 19]
	[local18 11] = [1313 0 1 2 1 2 0 1313 4 1]
	[local29 4] = [1313 5 2]
	[local33 4] = [1313 6 1]
	[local37 4] = [1313 7 1]
	[local41 5] = [1313 8 1 2]
	[local46 6] = [1313 10 2 1 2]
	[local52 4] = [1313 13 1]
	[local56 4] = [1313 14 1]
	[local60 6] = [1313 15 1 2 1]
	[local66 4] = [1313 18 1]
	[local70 4] = [1313 19 1]
	local74
	local75
	local76
	local77
	local78
	local79
	local80
	[local81 5]
	local86
	local87
	local88
	local89
	local90
	local91
	local92
	local93
	[local94 16] = [53 252 61 264 102 252 73 246 75 219 68 223 50 212 94 268]
	[local110 16] = [75 79 176 173 66 63 179 167 61 72 167 174 77 65 169 150]
	[local126 16] = [53 250 61 264 108 250 73 244 79 220 68 223 50 212 94 268]
	[local142 16] = [57 51 162 157 46 42 158 143 44 52 146 156 64 51 151 137]
	[local158 16] = [245 67 294 35 240 34 287 38 255 53 293 38 257 29 293 38]
	[local174 16] = [49 42 157 158 40 75 142 152 48 40 149 147 52 75 75 159]
	[local190 16] = [286 34 280 68 272 38 284 60 279 42 281 24 293 39 283 45]
	[local206 16] = [58 61 178 129 47 58 154 171 45 49 166 170 75 47 113 178]
)
(instance roger of Actor
	(properties
		view 753
	)
)

(instance giles of Actor
	(properties
		view 753
	)
)

(instance scholar2 of Actor
	(properties
		cycleSpeed 10
		moveSpeed 10
	)
	
	(method (init param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2)
		(asm
			lap      param2
			sal      local2
			lap      param1
			sal      local1
			pushi    2
			pushi    130
			pushi    927
			callk    Load,  4
			pushi    2
			pushi    130
			pushi    930
			callk    Load,  4
			lap      param5
			bnt      code_0153
			lsl      local1
			ldi      0
			gt?     
			bnt      code_013d
			pushi    801
			lap      param5
			sub     
			sap      param5
code_013d:
			lsp      param5
			lsp      param4
			ldi      1
			sub     
			mul     
			push    
			ldi      801
			div     
			push    
			ldi      1
			add     
			sat      temp0
			jmp      code_0164
code_0153:
			lsl      local1
			ldi      0
			gt?     
			bnt      code_0160
			ldi      0
			jmp      code_0162
code_0160:
			lap      param4
code_0162:
			sat      temp0
code_0164:
			lsl      local1
			ldi      0
			gt?     
			bnt      code_017a
			lst      temp0
			ldi      1
			add     
			sat      temp1
			lap      param4
			sat      temp2
			jmp      code_0185
code_017a:
			lst      temp0
			ldi      1
			sub     
			sat      temp1
			ldi      0
			sat      temp2
code_0185:
			pushi    #init
			pushi    0
			super    Actor,  4
			pushi    5
			pushi    1
			pushi    #verbMessager
			pushi    150
			pushi    1
			class    SyncWalk
			push    
			pushi    284
			pushi    2
			pushi    2
			lsp      param3
			lst      temp0
			ldi      2
			mul     
			sat      temp0
			push    
			calle    proc999_6,  4
			push    
			pushi    2
			lsp      param3
			lst      temp0
			ldi      1
			add     
			push    
			calle    proc999_6,  4
			push    
			pushi    283
			pushi    5
			class    PPath
			push    
			lsp      param3
			lst      temp1
			lst      temp2
			lofsa    leave
			push    
			self     34
			pushi    #mover
			pushi    0
			lofsa    scholar2
			send     4
			sal      local75
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3 &tmp temp0 temp1 temp2)
		(asm
			pushi    #inRect
			pushi    4
			pushi    0
			pushi    0
			pushi    160
			pushi    96
			lofsa    scholar2
			send     12
			bnt      code_01f8
			ldi      0
			jmp      code_0248
code_01f8:
			pushi    #inRect
			pushi    4
			pushi    160
			pushi    0
			pushi    319
			pushi    96
			lofsa    scholar2
			send     12
			bnt      code_0213
			ldi      1
			jmp      code_0248
code_0213:
			pushi    #inRect
			pushi    4
			pushi    0
			pushi    96
			pushi    160
			pushi    189
			lofsa    scholar2
			send     12
			bnt      code_022e
			ldi      2
			jmp      code_0248
code_022e:
			pushi    #inRect
			pushi    4
			pushi    160
			pushi    96
			pushi    319
			pushi    189
			lofsa    scholar2
			send     12
			bnt      code_0248
			ldi      3
code_0248:
			sat      temp2
			ldi      0
			sat      temp1
			ldi      280
			sat      temp0
code_0253:
			lst      temp0
			lag      global11
			le?     
			bnt      code_02c7
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local158
			sal      local86
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local174
			sal      local87
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local190
			sal      local88
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local206
			sal      local89
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local94
			sal      local90
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local110
			sal      local91
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local126
			sal      local92
			lst      temp2
			lst      temp1
			ldi      4
			mul     
			add     
			lali     local142
			sal      local93
			+at      temp1
			lst      temp0
			ldi      10
			add     
			sat      temp0
			jmp      code_0253
code_02c7:
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_035a
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_02e9
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0410
code_02e9:
			pushi    #distanceTo
			pushi    1
			lofsa    scholar2
			push    
			lag      global0
			send     6
			push    
			ldi      50
			gt?     
			bt       code_0318
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      312
			gt?     
			bt       code_0318
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      5
			lt?     
code_0318:
			bnt      code_0327
			pushi    2
			pushi    1311
			pushi    0
			calle    proc13_4,  4
			jmp      code_0410
code_0327:
			pushi    142
			pushi    1
			lsg      global196
			dup     
			ldi      0
			eq?     
			bnt      code_033a
			lofsa    converse
			jmp      code_0351
code_033a:
			dup     
			ldi      1
			eq?     
			bnt      code_0347
			lofsa    converse
			jmp      code_0351
code_0347:
			dup     
			ldi      2
			eq?     
			bnt      code_0351
			lofsa    youBlewIt
code_0351:
			toss    
			push    
			lag      global2
			send     6
			jmp      code_0410
code_035a:
			dup     
			ldi      2
			eq?     
			bnt      code_0383
			lal      local0
			bnt      code_0376
			pushi    2
			pushi    1311
			pushi    2
			calle    proc13_4,  4
			ldi      0
			sal      local0
			jmp      code_0410
code_0376:
			pushi    2
			pushi    1311
			pushi    3
			calle    proc13_4,  4
			jmp      code_0410
code_0383:
			dup     
			ldi      4
			eq?     
			bnt      code_0405
			pushi    #distanceTo
			pushi    1
			lofsa    scholar2
			push    
			lag      global0
			send     6
			push    
			ldi      50
			gt?     
			bt       code_03b9
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      312
			gt?     
			bt       code_03b9
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      5
			lt?     
code_03b9:
			bnt      code_03c8
			pushi    2
			pushi    1311
			pushi    1
			calle    proc13_4,  4
			jmp      code_0410
code_03c8:
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_03e0
			pushi    #setScript
			pushi    1
			lofsa    rottingRichard
			push    
			lag      global2
			send     6
			jmp      code_0401
code_03e0:
			dup     
			ldi      0
			eq?     
			bnt      code_03f6
			pushi    #setScript
			pushi    1
			lofsa    offerBucks
			push    
			lag      global2
			send     6
			jmp      code_0401
code_03f6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0401:
			toss    
			jmp      code_0410
code_0405:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0410:
			toss    
			ret     
		)
	)
	
	(method (delete)
		(asm
			pushi    #delete
			pushi    0
			super    Actor,  4
			pushi    1
			pushi    313
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance showIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04ca
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    scholar2
			send     8
			jmp      code_05eb
code_04ca:
			dup     
			ldi      1
			eq?     
			bnt      code_04f5
			pushi    #contains
			pushi    1
			lofsa    roger
			push    
			lag      global5
			send     6
			not     
			bnt      code_04ee
			pushi    #setScript
			pushi    2
			lofsa    hereTheyCome
			push    
			pushSelf
			self     8
			jmp      code_05eb
code_04ee:
			ldi      2
			aTop     cycles
			jmp      code_05eb
code_04f5:
			dup     
			ldi      2
			eq?     
			bnt      code_055b
			pushi    12
			pushi    3
			pushi    71
			pushi    12
			pushi    0
			callk    CelHigh,  6
			add     
			sal      local77
			pushi    245
			pushi    3
			pushi    71
			pushi    12
			pushi    0
			callk    CelWide,  6
			add     
			sal      local78
			pushi    6
			pushi    7
			pushi    12
			pushi    245
			lsl      local77
			push    
			pushi    3
			callk    Graph,  12
			sal      local79
			pushi    7
			pushi    71
			pushi    12
			pushi    0
			pushi    245
			pushi    12
			pushi    15
			pushi    1
			callk    DrawCel,  14
			pushi    7
			pushi    71
			lal      local80
			lsli     local81
			pushi    0
			pushi    256
			pushi    14
			pushi    15
			pushi    1
			callk    DrawCel,  14
			ldi      2
			aTop     cycles
			jmp      code_05eb
code_055b:
			dup     
			ldi      3
			eq?     
			bnt      code_0589
			lsl      local80
			ldi      0
			ne?     
			bnt      code_0582
			pushi    6
			pushi    1
			lea      @local33
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_05eb
code_0582:
			ldi      2
			aTop     cycles
			jmp      code_05eb
code_0589:
			dup     
			ldi      4
			eq?     
			bnt      code_05a0
			pushi    0
			calle    proc851_1,  0
			sal      local74
			ldi      2
			aTop     cycles
			jmp      code_05eb
code_05a0:
			dup     
			ldi      5
			eq?     
			bnt      code_05c6
			pushi    2
			pushi    8
			lsl      local79
			callk    Graph,  4
			pushi    6
			pushi    12
			dup     
			pushi    245
			lsl      local77
			lsl      local78
			pushi    1
			callk    Graph,  12
			ldi      2
			aTop     cycles
			jmp      code_05eb
code_05c6:
			dup     
			ldi      6
			eq?     
			bnt      code_05dd
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    scholar2
			send     8
			jmp      code_05eb
code_05dd:
			dup     
			ldi      7
			eq?     
			bnt      code_05eb
			+al      local80
			pushi    #dispose
			pushi    0
			self     4
code_05eb:
			toss    
			ret     
		)
	)
)

(instance youBlewIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_066e
			pushi    0
			callb    proc0_3,  0
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			push    
			pushi    59
			pushi    1
			pushi    0
			lofsa    scholar2
			send     12
			pushi    6
			pushi    1
			lea      @local56
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0696
code_066e:
			dup     
			ldi      1
			eq?     
			bnt      code_0683
			pushi    #setScript
			pushi    2
			lofsa    hereTheyCome
			push    
			pushSelf
			self     8
			jmp      code_0696
code_0683:
			dup     
			ldi      2
			eq?     
			bnt      code_0696
			pushi    #setScript
			pushi    1
			lofsa    sDieNow
			push    
			lag      global2
			send     6
code_0696:
			toss    
			ret     
		)
	)
)

(instance menLeave of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0744
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_06f6
			ldi      340
			aTop     register
			jmp      code_06fa
code_06f6:
			ldi      65516
			aTop     register
code_06fa:
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    18
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pTos     register
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lofsa    roger
			send     24
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    18
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pTos     register
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lofsa    giles
			send     24
			ldi      1000
			aTop     ticks
			jmp      code_080c
code_0744:
			dup     
			ldi      1
			eq?     
			bnt      code_079e
			pushi    #contains
			pushi    1
			lofsa    giles
			push    
			lag      global5
			send     6
			bnt      code_0773
			pushi    #x
			pushi    0
			lofsa    giles
			send     4
			push    
			pToa     register
			eq?     
			bnt      code_0773
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    giles
			send     8
code_0773:
			pushi    #contains
			pushi    1
			lofsa    roger
			push    
			lag      global5
			send     6
			bnt      code_080c
			pushi    #x
			pushi    0
			lofsa    roger
			send     4
			push    
			pToa     register
			eq?     
			bnt      code_080c
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    roger
			send     8
			jmp      code_080c
code_079e:
			dup     
			ldi      2
			eq?     
			bnt      code_0800
			ldi      0
			aTop     ticks
			pushi    #contains
			pushi    1
			lofsa    giles
			push    
			lag      global5
			send     6
			bnt      code_07d1
			pushi    #x
			pushi    0
			lofsa    giles
			send     4
			push    
			pToa     register
			eq?     
			bnt      code_07d1
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    giles
			send     8
code_07d1:
			pushi    #contains
			pushi    1
			lofsa    roger
			push    
			lag      global5
			send     6
			bnt      code_07f9
			pushi    #x
			pushi    0
			lofsa    roger
			send     4
			push    
			pToa     register
			eq?     
			bnt      code_07f9
			pushi    #dispose
			pushi    0
			pushi    84
			pushi    0
			lofsa    roger
			send     8
code_07f9:
			ldi      2
			aTop     cycles
			jmp      code_080c
code_0800:
			dup     
			ldi      3
			eq?     
			bnt      code_080c
			pushi    #dispose
			pushi    0
			self     4
code_080c:
			toss    
			ret     
		)
	)
)

(instance offerBucks of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_08a8
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			gt?     
			bnt      code_0875
			ldi      1
			sat      temp0
			jmp      code_0879
code_0875:
			ldi      0
			sat      temp0
code_0879:
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			push    
			pushi    59
			pushi    1
			pushi    0
			lofsa    scholar2
			send     12
			pushi    2
			lsg      global0
			lofsa    scholar2
			push    
			callb    proc0_9,  4
			ldi      10
			aTop     ticks
			jmp      code_090b
code_08a8:
			dup     
			ldi      1
			eq?     
			bnt      code_08c7
			pushi    6
			pushi    1
			lea      @local70
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_090b
code_08c7:
			dup     
			ldi      2
			eq?     
			bnt      code_08fb
			pushi    150
			pushi    #superClass
			class    Walk
			push    
			pushi    59
			pushi    1
			lsl      local75
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local75
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			lt?     
			push    
			lofsa    scholar2
			send     18
			ldi      2
			aTop     cycles
			jmp      code_090b
code_08fb:
			dup     
			ldi      3
			eq?     
			bnt      code_090b
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_090b:
			toss    
			ret     
		)
	)
)

(instance leave of CueObj
	(properties)
	
	(method (cue &tmp temp0)
		(asm
			pushi    3
			lsl      local2
			lsl      local1
			lofsa    scholar2
			push    
			calle    proc311_1,  6
			ret     
		)
	)
)

(instance rottingRichard of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a04
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			gt?     
			bnt      code_09c7
			ldi      1
			sat      temp0
			jmp      code_09cb
code_09c7:
			ldi      0
			sat      temp0
code_09cb:
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			push    
			pushi    59
			pushi    1
			pushi    0
			lofsa    scholar2
			send     12
			pushi    3
			lsg      global0
			lofsa    scholar2
			push    
			pushSelf
			callb    proc0_9,  6
			pushi    3
			lofsa    scholar2
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_0b62
code_0a04:
			dup     
			ldi      1
			eq?     
			bnt      code_0a0e
			jmp      code_0b62
code_0a0e:
			dup     
			ldi      2
			eq?     
			bnt      code_0a1c
			ldi      2
			aTop     cycles
			jmp      code_0b62
code_0a1c:
			dup     
			ldi      3
			eq?     
			bnt      code_0a3b
			pushi    6
			pushi    1
			lea      @local66
			push    
			lea      @local3
			push    
			pushi    3
			pushSelf
			pushi    1
			calle    proc851_0,  12
			jmp      code_0b62
code_0a3b:
			dup     
			ldi      4
			eq?     
			bnt      code_0a8f
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_0a5b
			ldi      350
			jmp      code_0a5d
code_0a5b:
			ldi      65506
code_0a5d:
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local88
			lsl      local89
			pushSelf
			lofsa    giles
			send     40
			jmp      code_0b62
code_0a8f:
			dup     
			ldi      5
			eq?     
			bnt      code_0aed
			pushi    2
			lofsa    giles
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_0ab9
			ldi      330
			jmp      code_0abb
code_0ab9:
			ldi      65526
code_0abb:
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local86
			lsl      local87
			pushSelf
			lofsa    roger
			send     40
			jmp      code_0b62
code_0aed:
			dup     
			ldi      6
			eq?     
			bnt      code_0b05
			pushi    2
			lofsa    roger
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      2
			aTop     cycles
			jmp      code_0b62
code_0b05:
			dup     
			ldi      7
			eq?     
			bnt      code_0b62
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    giles
			send     20
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    roger
			send     20
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    59
			pushi    1
			lsl      local75
			lofsa    scholar2
			send     12
			ldi      36
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0b62:
			toss    
			ret     
		)
	)
)

(instance converse of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 [temp2 70])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c2a
			pushi    0
			callb    proc0_3,  0
			ldi      0
			sat      temp0
code_0bb4:
			lst      temp0
			ldi      5
			lt?     
			bnt      code_0bf9
			pushi    2
			pushi    1
			pushi    11
			callk    Random,  4
			aTop     register
			pTos     register
			lag      global123
			le?     
			bnt      code_0bcf
			dpToa    register
code_0bcf:
			pTos     register
			lat      temp0
			sali     local81
			ldi      0
			sat      temp1
code_0bd9:
			lst      temp1
			lat      temp0
			lt?     
			bnt      code_0bf4
			lat      temp1
			lsli     local81
			lat      temp0
			lali     local81
			eq?     
			bnt      code_0bef
			-at      temp0
code_0bef:
			+at      temp1
			jmp      code_0bd9
code_0bf4:
			+at      temp0
			jmp      code_0bb4
code_0bf9:
			ldi      0
			sal      local80
			pushi    6
			pushi    #superClass
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			gt?     
			push    
			pushi    59
			pushi    1
			pushi    0
			lofsa    scholar2
			send     12
			pushi    3
			lsg      global0
			lofsa    scholar2
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0e1d
code_0c2a:
			dup     
			ldi      1
			eq?     
			bnt      code_0c51
			pushi    6
			pushi    #superClass
			pushi    #loop
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    7
			pushi    1
			pushi    0
			lofsa    scholar2
			send     12
			ldi      2
			aTop     cycles
			jmp      code_0e1d
code_0c51:
			dup     
			ldi      2
			eq?     
			bnt      code_0c81
			lsg      global196
			ldi      1
			lt?     
			bnt      code_0c78
			pushi    5
			lea      @local18
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0e1d
code_0c78:
			ipToa    state
			ldi      1
			aTop     cycles
			jmp      code_0e1d
code_0c81:
			dup     
			ldi      3
			eq?     
			bnt      code_0ccc
			pushi    3
			pushi    1313
			pushi    4
			lea      @temp2
			push    
			callk    GetFarText,  6
			pushi    3
			pushi    1317
			lsg      global123
			lea      @temp2
			push    
			pushi    1
			lea      @temp2
			push    
			callk    StrLen,  2
			add     
			push    
			callk    GetFarText,  6
			pushi    #show
			pushi    0
			pushi    509
			pushi    5
			lea      @temp2
			push    
			pushi    0
			pushi    0
			pushi    0
			pushSelf
			pushi    2
			pushi    851
			pushi    2
			callk    ScriptID,  4
			send     18
			jmp      code_0e1d
code_0ccc:
			dup     
			ldi      4
			eq?     
			bnt      code_0d0f
			pushi    0
			callb    proc0_3,  0
			lsg      global196
			ldi      1
			lt?     
			bnt      code_0cf7
			pushi    5
			lea      @local29
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0e1d
code_0cf7:
			pushi    5
			lea      @local41
			push    
			pushi    999
			lea      @local3
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0e1d
code_0d0f:
			dup     
			ldi      5
			eq?     
			bnt      code_0d24
			pushi    #setScript
			pushi    2
			lofsa    showIt
			push    
			pushSelf
			self     8
			jmp      code_0e1d
code_0d24:
			dup     
			ldi      6
			eq?     
			bnt      code_0d32
			ldi      2
			aTop     cycles
			jmp      code_0e1d
code_0d32:
			dup     
			ldi      7
			eq?     
			bnt      code_0d7f
			lal      local74
			bnt      code_0d65
			pushi    6
			pushi    1
			lea      @local52
			push    
			lea      @local3
			push    
			pushi    3
			pushi    0
			pushi    1
			calle    proc851_0,  12
			+ag      global196
			ipToa    state
			pushi    #setScript
			pushi    2
			lofsa    menLeave
			push    
			pushSelf
			self     8
			jmp      code_0e1d
code_0d65:
			lsl      local80
			ldi      4
			le?     
			bnt      code_0d78
			ldi      4
			aTop     state
			ldi      2
			aTop     cycles
			jmp      code_0e1d
code_0d78:
			ldi      2
			aTop     cycles
			jmp      code_0e1d
code_0d7f:
			dup     
			ldi      8
			eq?     
			bnt      code_0dd9
			lsg      global196
			ldi      1
			lt?     
			bnt      code_0db5
			pushi    6
			pushi    1
			lea      @local37
			push    
			lea      @local3
			push    
			pushi    3
			pushi    0
			pushi    1
			calle    proc851_0,  12
			ldi      1
			sag      global196
			pushi    #setScript
			pushi    2
			lofsa    menLeave
			push    
			pushSelf
			self     8
			jmp      code_0e1d
code_0db5:
			pushi    5
			lea      @local46
			push    
			pushi    999
			lea      @local3
			push    
			pushi    0
			pushi    1
			calle    proc851_0,  10
			pushi    #setScript
			pushi    1
			lofsa    sDieNow
			push    
			lag      global2
			send     6
			jmp      code_0e1d
code_0dd9:
			dup     
			ldi      9
			eq?     
			bnt      code_0e0d
			pushi    150
			pushi    #superClass
			class    Walk
			push    
			pushi    59
			pushi    1
			lsl      local75
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lal      local75
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			lt?     
			push    
			lofsa    scholar2
			send     18
			ldi      2
			aTop     cycles
			jmp      code_0e1d
code_0e0d:
			dup     
			ldi      10
			eq?     
			bnt      code_0e1d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0e1d:
			toss    
			ret     
		)
	)
)

(instance sDieNow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0edc
			pushi    #setAvoider
			pushi    1
			class    PAvoider
			push    
			pushi    289
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local90
			lsl      local91
			pushSelf
			lag      global0
			send     24
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    289
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    80
			pushSelf
			lofsa    giles
			send     24
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    289
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local92
			lsl      local93
			pushSelf
			lofsa    scholar2
			send     24
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    289
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PChase
			push    
			lsg      global0
			pushi    40
			pushSelf
			lofsa    roger
			send     24
			jmp      code_0f99
code_0edc:
			dup     
			ldi      1
			eq?     
			bnt      code_0ee6
			jmp      code_0f99
code_0ee6:
			dup     
			ldi      2
			eq?     
			bnt      code_0ef0
			jmp      code_0f99
code_0ef0:
			dup     
			ldi      3
			eq?     
			bnt      code_0efa
			jmp      code_0f99
code_0efa:
			dup     
			ldi      4
			eq?     
			bnt      code_0f1c
			pushi    2
			lsg      global0
			lofsa    scholar2
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    scholar2
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      10
			aTop     ticks
			jmp      code_0f99
code_0f1c:
			dup     
			ldi      5
			eq?     
			bnt      code_0f3c
			pushi    5
			lea      @local60
			push    
			lea      @local15
			push    
			lea      @local12
			push    
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_0f99
code_0f3c:
			dup     
			ldi      6
			eq?     
			bnt      code_0f99
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    giles
			send     20
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lofsa    roger
			send     20
			pushi    #setAvoider
			pushi    1
			pushi    0
			pushi    59
			pushi    1
			lsl      local75
			lofsa    scholar2
			send     12
			ldi      36
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0f99:
			toss    
			ret     
		)
	)
)

(instance hereTheyCome of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1034
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_0ffb
			ldi      330
			jmp      code_0ffd
code_0ffb:
			ldi      65526
code_0ffd:
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    289
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local86
			lsl      local87
			pushSelf
			lofsa    roger
			send     46
			jmp      code_1102
code_1034:
			dup     
			ldi      1
			eq?     
			bnt      code_106b
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    roger
			send     4
			lt?     
			bnt      code_1057
			ldi      1
			jmp      code_1059
code_1057:
			ldi      0
code_1059:
			push    
			pushi    289
			pushi    1
			pushi    1
			lofsa    roger
			send     12
			ldi      5
			aTop     ticks
			jmp      code_1102
code_106b:
			dup     
			ldi      2
			eq?     
			bnt      code_10c4
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    scholar2
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_108b
			ldi      350
			jmp      code_108d
code_108b:
			ldi      65526
code_108d:
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushi    107
			pushi    0
			pushi    289
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsl      local88
			lsl      local89
			pushSelf
			lofsa    giles
			send     46
			jmp      code_1102
code_10c4:
			dup     
			ldi      3
			eq?     
			bnt      code_10f6
			pushi    6
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    roger
			send     4
			lt?     
			bnt      code_10e7
			ldi      1
			jmp      code_10e9
code_10e7:
			ldi      0
code_10e9:
			push    
			lofsa    giles
			send     6
			ldi      5
			aTop     ticks
			jmp      code_1102
code_10f6:
			dup     
			ldi      4
			eq?     
			bnt      code_1102
			pushi    #dispose
			pushi    0
			self     4
code_1102:
			toss    
			ret     
		)
	)
)
