;;; Sierra Script 1.0 - (do not remove this comment)
(script# 480)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n852)
(use n927)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	rm480 0
)

(local
	local0
	local1
	[local2 9] = [330 169 250 174 208 188 208 238 -32768]
	[local11 17] = [-10 175 12 169 79 165 122 152 202 152 257 168 312 168 330 175 -32768]
	[local28 11] = [134 238 134 188 109 188 12 169 -10 175 -32768]
	[local39 7] = [23 163 23 156 54 145 -32768]
	[local46 7] = [296 163 296 156 267 145 -32768]
	[local53 5] = [1480 17 1]
	[local58 5] = [1480 0 1]
	[local63 5] = [1480 1 1]
	[local68 5] = [1480 2 1]
)
(instance rm480 of StdRoom
	(properties
		picture 480
		east 450
		south 450
		west 450
	)
	
	(method (init)
		(asm
			pushi    #setRegions
			pushi    1
			pushi    452
			self     6
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			sal      local0
			pushi    1
			pushi    3
			callb    proc0_2,  2
			lsg      global12
			ldi      45
			eq?     
			bnt      code_003c
			pushi    #setScript
			pushi    1
			lofsa    arrived
			push    
			self     6
			jmp      code_0054
code_003c:
			pushi    #edgeHit
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    #x
			pushi    1
			pushi    105
			pushi    3
			pushi    1
			pushi    188
			lag      global0
			send     12
code_0054:
			pushi    #init
			pushi    0
			super    StdRoom,  4
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      455
			ne?     
			bnt      code_007b
			pushi    #number
			pushi    1
			pushi    455
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
code_007b:
			pushi    #addObstacle
			pushi    5
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    319
			pushi    1
			pushi    319
			pushi    161
			pushi    257
			pushi    165
			pushi    208
			pushi    146
			pushi    119
			pushi    146
			pushi    64
			pushi    162
			pushi    41
			pushi    164
			pushi    0
			pushi    158
			pushi    0
			pushi    1
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    79
			pushi    180
			pushi    86
			pushi    167
			pushi    230
			pushi    167
			pushi    236
			pushi    180
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    109
			pushi    188
			pushi    111
			pushi    181
			pushi    201
			pushi    181
			pushi    205
			pushi    188
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    6
			pushi    93
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    171
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     26
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    213
			pushi    189
			pushi    306
			pushi    166
			pushi    307
			pushi    179
			pushi    319
			pushi    179
			pushi    319
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			lag      global2
			send     14
			pushi    #illegalBits
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #init
			pushi    0
			lofsa    lDoor
			send     4
			pushi    #init
			pushi    0
			lofsa    rDoor
			send     4
			pushi    #init
			pushi    0
			lofsa    ceiling
			send     4
			pushi    #init
			pushi    0
			lofsa    altar
			send     4
			pushi    #init
			pushi    0
			lofsa    reliquary
			send     4
			pushi    #init
			pushi    0
			lofsa    windows
			send     4
			pushi    #init
			pushi    0
			lofsa    pews
			send     4
			pushi    #init
			pushi    0
			lofsa    book
			send     4
			pushi    #init
			pushi    0
			lofsa    chapel
			send     4
			pushi    1
			pushi    95
			callb    proc0_5,  2
			bnt      code_01de
			pushi    #lookStr
			pushi    1
			pushi    10
			lofsa    lDoor
			send     6
			pushi    #lookStr
			pushi    1
			pushi    10
			lofsa    rDoor
			send     6
code_01de:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_01ef
			pushi    1
			pushi    99
			callb    proc0_7,  2
			jmp      code_01fc
code_01ef:
			pushi    #setScript
			pushi    1
			lofsa    monks
			push    
			lofsa    lDoor
			send     6
code_01fc:
			pushi    #actions
			pushi    1
			pushi    2
			pushi    452
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    1
			pushi    852
			callk    DisposeScript,  2
			pushi    1
			pushi    927
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
)

(instance arrived of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0300
			pushi    #edgeHit
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      227
			gt?     
			bnt      code_02b6
			lea      @local46
			aTop     register
			pushi    #setCel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    rDoor
			send     4
			push    
			lofsa    rDoor
			send     6
			jmp      code_02ce
code_02b6:
			lea      @local39
			aTop     register
			pushi    #setCel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    lDoor
			send     4
			push    
			lofsa    lDoor
			send     6
code_02ce:
			pushi    #x
			pushi    1
			pushi    2
			pTos     register
			pushi    4
			calle    proc999_6,  4
			push    
			pushi    3
			pushi    1
			pushi    2
			pTos     register
			pushi    5
			calle    proc999_6,  4
			push    
			pushi    283
			pushi    5
			class    PPath
			push    
			pTos     register
			pushi    1
			pushi    0
			pushSelf
			lag      global0
			send     26
			jmp      code_039b
code_0300:
			dup     
			ldi      1
			eq?     
			bnt      code_034e
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pTos     register
			lea      @local46
			eq?     
			bnt      code_033a
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    rDoor
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    287
			pushi    0
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    rDoor
			send     18
			jmp      code_039b
code_033a:
			pushi    #startUpd
			pushi    0
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    lDoor
			send     12
			jmp      code_039b
code_034e:
			dup     
			ldi      2
			eq?     
			bnt      code_039b
			pushi    #number
			pushi    1
			pushi    938
			pushi    42
			pushi    0
			lofsa    doorSound
			send     10
			pTos     register
			lea      @local46
			eq?     
			bnt      code_0389
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    rDoor
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lofsa    rDoor
			send     10
			jmp      code_0392
code_0389:
			pushi    #stopUpd
			pushi    0
			lofsa    lDoor
			send     4
code_0392:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_039b:
			toss    
			ret     
		)
	)
)

(instance monks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_040c
			lsg      global130
			ldi      5
			eq?     
			bt       code_03f1
			lsg      global130
			ldi      6
			eq?     
code_03f1:
			bnt      code_03ff
			pushi    2
			pushi    15
			pushi    30
			callk    Random,  4
			jmp      code_0407
code_03ff:
			pushi    2
			pushi    4
			pushi    8
			callk    Random,  4
code_0407:
			aTop     seconds
			jmp      code_04bc
code_040c:
			dup     
			ldi      1
			eq?     
			bnt      code_04a1
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_0429
			ldi      65535
			aTop     state
			ldi      1
			aTop     cycles
			jmp      code_04bc
code_0429:
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_043e
			lea      @local2
			jmp      code_0455
code_043e:
			dup     
			ldi      2
			eq?     
			bnt      code_044b
			lea      @local11
			jmp      code_0455
code_044b:
			dup     
			ldi      3
			eq?     
			bnt      code_0455
			lea      @local28
code_0455:
			toss    
			aTop     register
			pushi    107
			pushi    #species
			pushi    284
			pushi    2
			pushi    2
			pTos     register
			pushi    0
			calle    proc999_6,  4
			push    
			pushi    2
			pTos     register
			pushi    1
			calle    proc999_6,  4
			push    
			pushi    150
			pushi    1
			class    SyncWalk
			push    
			pushi    299
			pushi    1
			class    PAvoider
			push    
			pushi    283
			pushi    3
			class    PPath
			push    
			pTos     register
			ldi      4
			add     
			push    
			pushSelf
			pushi    267
			pushi    1
			lofsa    wanderVerbs
			push    
			lal      local0
			send     40
			jmp      code_04bc
code_04a1:
			dup     
			ldi      2
			eq?     
			bnt      code_04bc
			pushi    #dispose
			pushi    0
			pushi    267
			pushi    1
			pushi    0
			lal      local0
			send     10
			ldi      65535
			aTop     state
			ldi      1
			aTop     cycles
code_04bc:
			toss    
			ret     
		)
	)
)

(instance wanderVerbs of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      5
			eq?     
			bnt      code_0510
			pushi    2
			lea      @local53
			push    
			pushi    10
			calle    proc851_0,  4
			ldi      1
			ret     
code_0510:
			ldi      0
			ret     
		)
	)
)

(instance openDoor of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_056f
			pushi    0
			callb    proc0_3,  0
			pushi    #setAvoider
			pushi    1
			class    PAvoider
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pToa     register
			send     4
			push    
			pushi    163
			pushSelf
			lag      global0
			send     18
			pushi    #setAvoider
			pushi    1
			pushi    0
			lal      local0
			send     6
			jmp      code_0790
code_056f:
			dup     
			ldi      1
			eq?     
			bnt      code_05ed
			pushi    #contains
			pushi    1
			lsl      local0
			lag      global5
			send     6
			bt       code_0588
			pushi    1
			pushi    99
			callb    proc0_5,  2
code_0588:
			bnt      code_05d8
			pushi    1
			pushi    99
			callb    proc0_5,  2
			bnt      code_059b
			ldi      9
			aTop     state
			jmp      code_05d1
code_059b:
			pushi    1
			pushi    98
			callb    proc0_5,  2
			bnt      code_05b1
			pushi    1
			pushi    99
			callb    proc0_6,  2
			ldi      7
			aTop     state
			jmp      code_05d1
code_05b1:
			pushi    1
			pushi    97
			callb    proc0_5,  2
			bnt      code_05c7
			pushi    1
			pushi    98
			callb    proc0_6,  2
			ldi      3
			aTop     state
			jmp      code_05d1
code_05c7:
			pushi    1
			pushi    97
			callb    proc0_6,  2
			ldi      3
			aTop     state
code_05d1:
			ldi      1
			aTop     cycles
			jmp      code_0790
code_05d8:
			pushi    #signal
			pushi    1
			pushi    24582
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     register
			send     14
			jmp      code_0790
code_05ed:
			dup     
			ldi      2
			eq?     
			bnt      code_0637
			pushi    #number
			pushi    1
			pushi    937
			pushi    42
			pushi    0
			lofsa    doorSound
			send     10
			pTos     register
			lofsa    lDoor
			eq?     
			bnt      code_0621
			pushi    #setMotion
			pushi    5
			class    PPath
			push    
			lea      @local39
			push    
			pushi    1
			pushi    2
			pushSelf
			lag      global0
			send     14
			jmp      code_0790
code_0621:
			pushi    #setMotion
			pushi    5
			class    PPath
			push    
			lea      @local46
			push    
			pushi    1
			pushi    2
			pushSelf
			lag      global0
			send     14
			jmp      code_0790
code_0637:
			dup     
			ldi      3
			eq?     
			bnt      code_0656
			pushi    2
			pushi    10
			pushi    95
			calle    proc806_1,  4
			pushi    #newRoom
			pushi    1
			pushi    45
			lag      global2
			send     6
			jmp      code_0790
code_0656:
			dup     
			ldi      4
			eq?     
			bnt      code_0682
			pushi    #mover
			pushi    0
			lal      local0
			send     4
			sal      local1
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    59
			pushi    1
			pushi    0
			lal      local0
			send     12
			pushi    2
			lsl      local0
			lsg      global0
			callb    proc0_9,  4
			ldi      1
			aTop     cycles
			jmp      code_0790
code_0682:
			dup     
			ldi      5
			eq?     
			bnt      code_069c
			pushi    4
			lea      @local58
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0790
code_069c:
			dup     
			ldi      6
			eq?     
			bnt      code_06b9
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    159
			pushi    189
			pushSelf
			lag      global0
			send     12
			jmp      code_0790
code_06b9:
			dup     
			ldi      7
			eq?     
			bnt      code_06de
			pushi    2
			lsl      local0
			lsg      global0
			callb    proc0_9,  4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    159
			pushi    188
			pushSelf
			lag      global0
			send     12
			jmp      code_0790
code_06de:
			dup     
			ldi      8
			eq?     
			bnt      code_06ec
			ldi      2
			aTop     seconds
			jmp      code_0790
code_06ec:
			dup     
			ldi      9
			eq?     
			bnt      code_0715
			pushi    #ignoreActors
			pushi    1
			pushi    0
			pushi    59
			pushi    1
			lsl      local1
			lal      local0
			send     12
			pushi    2
			lsl      local0
			lsl      local1
			callb    proc0_9,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0790
code_0715:
			dup     
			ldi      10
			eq?     
			bnt      code_0745
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    1
			pushi    0
			lal      local0
			send     12
			pushi    2
			lsl      local0
			lsg      global0
			callb    proc0_9,  4
			pushi    4
			lea      @local63
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0790
code_0745:
			dup     
			ldi      11
			eq?     
			bnt      code_0765
			pushi    #setMotion
			pushi    3
			class    PolyPath
			push    
			pushi    108
			pushi    190
			lag      global0
			send     10
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0790
code_0765:
			dup     
			ldi      12
			eq?     
			bnt      code_0780
			pushi    4
			lea      @local68
			push    
			pushi    999
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0790
code_0780:
			dup     
			ldi      13
			eq?     
			bnt      code_0790
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0790:
			toss    
			ret     
		)
	)
)

(instance lDoor of Prop
	(properties
		x 41
		y 159
		lookStr 9
		view 480
		priority 10
		signal $6811
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_07e6
			pushi    #setScript
			pushi    3
			lofsa    openDoor
			push    
			pushi    0
			pushSelf
			lag      global2
			send     10
			jmp      code_07f1
code_07e6:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_07f1:
			ret     
		)
	)
)

(instance rDoor of Prop
	(properties
		x 282
		y 160
		lookStr 9
		view 480
		loop 1
		priority 11
		signal $6911
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_087a
			pushi    #setScript
			pushi    3
			lofsa    openDoor
			push    
			pushi    0
			pushSelf
			lag      global2
			send     10
			jmp      code_0885
code_087a:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_0885:
			ret     
		)
	)
)

(instance ceiling of Feature
	(properties
		onMeCheck $0008
		lookStr 4
	)
)

(instance altar of Feature
	(properties
		x 156
		y 184
		onMeCheck $0010
		lookStr 5
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0945
			pushi    2
			pushi    1480
			pushi    14
			calle    proc13_4,  4
			jmp      code_0950
code_0945:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0950:
			ret     
		)
	)
)

(instance reliquary of Feature
	(properties
		x 156
		y 174
		onMeCheck $0080
		lookStr 6
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_09aa
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
			jmp      code_09b7
code_09aa:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    altar
			send     8
code_09b7:
			ret     
		)
	)
)

(instance windows of Feature
	(properties
		y 146
		onMeCheck $0002
		lookStr 7
	)
	
	(method (onMe param1 param2)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_0a1e
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_0a19
			ldi      94
			jmp      code_0a1c
code_0a19:
			ldi      288
code_0a1c:
			aTop     x
code_0a1e:
			pushi    #onMe
			pushi    2
			lsp      param1
			lsp      param2
			super    Feature,  8
			ret     
		)
	)
)

(instance pews of Feature
	(properties
		onMeCheck $0100
		lookStr 8
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0ab0
			pushi    2
			pushi    1480
			pushi    15
			calle    proc13_4,  4
			jmp      code_0abb
code_0ab0:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0abb:
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_0a8f
			pushi    #x
			pushi    0
			lap      param1
			send     4
			aTop     x
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			ldi      10
			add     
			aTop     y
code_0a8f:
			pushi    #onMe
			pushi    2
			lsp      param1
			lsp      param2
			super    Feature,  8
			ret     
		)
	)
)

(instance book of Feature
	(properties
		x 156
		y 184
		onMeCheck $0020
		lookStr 13
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0b19
			pushi    2
			pushi    1480
			pushi    14
			calle    proc13_4,  4
			jmp      code_0b24
code_0b19:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0b24:
			ret     
		)
	)
)

(instance chapel of Feature
	(properties
		onMeCheck $0001
		lookStr 11
	)
)

(instance doorSound of Sound
	(properties
		flags $0001
	)
)
