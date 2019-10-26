;;; Sierra Script 1.0 - (do not remove this comment)
(script# 455)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	rm455 0
)

(instance rm455 of Rm
	(properties
		picture 455
		north 450
	)
	
	(method (init)
		(asm
			pushi    1
			pushi    2
			callb    proc0_2,  2
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #posn
			pushi    2
			pushi    130
			pushi    109
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_4,  0
			lsg      global130
			ldi      10
			ne?     
			bnt      code_0085
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    13
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_0053
			pushi    #init
			pushi    0
			lofsa    robes
			send     4
code_0053:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    13
			class    Inv
			send     6
			send     4
			push    
			lsg      global11
			ldi      1
			add     
			eq?     
			bnt      code_007a
			pushi    #init
			pushi    0
			pushi    277
			pushi    1
			pushi    26
			lofsa    robes
			send     10
code_007a:
			pushi    #approachVerbs
			pushi    1
			pushi    3
			lofsa    robes
			send     6
code_0085:
			pushi    #init
			pushi    0
			lofsa    tub
			send     4
			pushi    #init
			pushi    0
			lofsa    shelves
			send     4
			pushi    #init
			pushi    0
			lofsa    table
			send     4
			pushi    #init
			pushi    0
			lofsa    buckets
			send     4
			pushi    #init
			pushi    0
			lofsa    jug
			send     4
			pushi    #init
			pushi    0
			lofsa    water
			send     4
			pushi    #init
			pushi    0
			lofsa    rShelves
			send     4
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    door
			send     10
			pushi    #init
			pushi    0
			lofsa    ldry
			send     4
			pushi    #addObstacle
			pushi    3
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    62
			pushi    148
			pushi    104
			pushi    119
			pushi    157
			pushi    119
			pushi    157
			pushi    128
			pushi    138
			pushi    151
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
			pushi    187
			pushi    125
			pushi    247
			pushi    125
			pushi    247
			pushi    161
			pushi    171
			pushi    161
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
			pushi    3
			pushi    107
			pushi    12
			pushi    125
			pushi    105
			pushi    59
			pushi    145
			pushi    63
			pushi    172
			pushi    253
			pushi    171
			pushi    250
			pushi    112
			pushi    158
			pushi    110
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     10
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
)

(instance robes of View
	(properties
		x 202
		y 111
		sightAngle 45
		approachX 202
		approachY 121
		lookStr 10
		view 455
		loop 1
		signal $4101
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0220
			pushi    #play
			pushi    0
			lofsa    rustleSound
			send     4
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    13
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_0202
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    3
			pushi    1455
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_020e
code_0202:
			pushi    3
			pushi    1455
			pushi    3
			pushi    1
			calle    proc13_4,  6
code_020e:
			pushi    #get
			pushi    1
			pushi    13
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_022b
code_0220:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    View,  8
code_022b:
			toss    
			ret     
		)
	)
)

(instance tub of Feature
	(properties
		x 110
		y 134
		sightAngle 45
		onMeCheck $0002
		lookStr 8
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_02a7
			pushi    2
			pushi    1455
			pushi    0
			calle    proc13_4,  4
			jmp      code_0300
code_02a7:
			dup     
			ldi      4
			eq?     
			bnt      code_02f5
			lsp      param2
			dup     
			ldi      13
			eq?     
			bnt      code_02c6
			pushi    3
			pushi    1455
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_02f1
code_02c6:
			dup     
			ldi      18
			eq?     
			bnt      code_02e5
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1455
			pushi    20
			pushi    21
			lag      global2
			send     14
			jmp      code_02f1
code_02e5:
			pushi    3
			pushi    1455
			pushi    19
			pushi    1
			calle    proc13_4,  6
code_02f1:
			toss    
			jmp      code_0300
code_02f5:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0300:
			toss    
			ret     
		)
	)
)

(instance shelves of Feature
	(properties
		x 85
		y 114
		sightAngle 45
		onMeCheck $0008
		lookStr 9
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_035d
			pushi    3
			pushi    1455
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_037f
code_035d:
			dup     
			ldi      4
			eq?     
			bnt      code_0374
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    table
			send     8
			jmp      code_037f
code_0374:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_037f:
			toss    
			ret     
		)
	)
)

(instance table of Feature
	(properties
		x 214
		y 139
		sightAngle 45
		onMeCheck $0004
		lookStr 11
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_03de
			pushi    3
			pushi    1455
			pushi    5
			pushi    1
			calle    proc13_4,  6
			jmp      code_045b
code_03de:
			dup     
			ldi      4
			eq?     
			bnt      code_0450
			lsp      param2
			dup     
			ldi      12
			eq?     
			bnt      code_03fd
			pushi    3
			pushi    1455
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_044c
code_03fd:
			dup     
			ldi      11
			eq?     
			bnt      code_0413
			pushi    3
			pushi    1455
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_044c
code_0413:
			pushi    #has
			pushi    1
			pushi    13
			lag      global0
			send     6
			bnt      code_0440
			lsp      param2
			ldi      13
			ne?     
			bnt      code_0440
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1455
			pushi    15
			pushi    16
			lag      global2
			send     14
			jmp      code_044c
code_0440:
			pushi    3
			pushi    1455
			pushi    17
			pushi    1
			calle    proc13_4,  6
code_044c:
			toss    
			jmp      code_045b
code_0450:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_045b:
			toss    
			ret     
		)
	)
)

(instance buckets of Feature
	(properties
		x 199
		y 107
		sightAngle 45
		onMeCheck $0010
		lookStr 12
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_04ba
			pushi    3
			pushi    1455
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_04dc
code_04ba:
			dup     
			ldi      4
			eq?     
			bnt      code_04d1
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    table
			send     8
			jmp      code_04dc
code_04d1:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_04dc:
			toss    
			ret     
		)
	)
)

(instance jug of Feature
	(properties
		x 94
		y 116
		sightAngle 45
		onMeCheck $0040
		lookStr 13
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_053a
			pushi    3
			pushi    1455
			pushi    6
			pushi    1
			calle    proc13_4,  6
			jmp      code_055c
code_053a:
			dup     
			ldi      4
			eq?     
			bnt      code_0551
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    table
			send     8
			jmp      code_055c
code_0551:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_055c:
			toss    
			ret     
		)
	)
)

(instance water of Feature
	(properties
		sightAngle 45
		onMeCheck $0020
		lookStr 14
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      4
			eq?     
			bnt      code_0606
			lsp      param2
			ldi      18
			eq?     
			bnt      code_05f8
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1455
			pushi    20
			pushi    21
			lag      global2
			send     14
			jmp      code_0611
code_05f8:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
			jmp      code_0611
code_0606:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0611:
			toss    
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_05c3
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
code_05c3:
			pushi    #onMe
			pushi    2
			lsp      param1
			lsp      param2
			super    Feature,  8
			ret     
		)
	)
)

(instance rShelves of Feature
	(properties
		x 198
		y 105
		sightAngle 45
		onMeCheck $0080
		lookStr 9
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0673
			pushi    3
			pushi    1455
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_06e2
code_0673:
			dup     
			ldi      4
			eq?     
			bnt      code_06d7
			lsp      param2
			dup     
			ldi      12
			eq?     
			bnt      code_069b
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushi    0
			pushi    1455
			pushi    23
			pushi    24
			lag      global2
			send     14
			jmp      code_06d3
code_069b:
			dup     
			ldi      11
			eq?     
			bnt      code_06b1
			pushi    3
			pushi    1455
			pushi    22
			pushi    1
			calle    proc13_4,  6
			jmp      code_06d3
code_06b1:
			dup     
			ldi      13
			eq?     
			bnt      code_06c7
			pushi    #setScript
			pushi    1
			lofsa    putBack
			push    
			lag      global2
			send     6
			jmp      code_06d3
code_06c7:
			pushi    3
			pushi    1455
			pushi    18
			pushi    1
			calle    proc13_4,  6
code_06d3:
			toss    
			jmp      code_06e2
code_06d7:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_06e2:
			toss    
			ret     
		)
	)
)

(instance putBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_074d
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    202
			pushi    121
			pushSelf
			lag      global0
			send     12
			jmp      code_077d
code_074d:
			dup     
			ldi      1
			eq?     
			bnt      code_077d
			pushi    #play
			pushi    0
			lofsa    rustleSound
			send     4
			pushi    #put
			pushi    2
			pushi    13
			lsg      global11
			lag      global0
			send     8
			pushi    1
			pushi    65486
			calle    proc806_1,  2
			pushi    #init
			pushi    0
			lofsa    robes
			send     4
			pushi    0
			callb    proc0_4,  0
code_077d:
			toss    
			ret     
		)
	)
)

(instance door of Feature
	(properties
		onMeCheck $0100
		approachX 134
		approachY 107
		lookStr 27
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_07d0
			pushi    #newRoom
			pushi    1
			pushi    450
			lag      global2
			send     6
			jmp      code_07db
code_07d0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_07db:
			ret     
		)
	)
)

(instance ldry of Feature
	(properties
		onMeCheck $0001
		lookStr 7
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 param4 param5)
		(asm
			pushi    0
			callb    proc0_3,  0
			lap      param4
			aTop     start
			pushi    #init
			pushi    3
			lsp      param1
			lsp      param2
			lsp      param3
			super    Script,  10
			lap      param5
			aTop     start
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			pToa     start
			le?     
			bnt      code_088f
			pushi    3
			pTos     register
			pTos     state
			pushSelf
			calle    proc13_4,  6
			jmp      code_0898
code_088f:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0898:
			ret     
		)
	)
	
	(method (cue param1)
		(asm
			lap      param1
			not     
			bnt      code_08a3
			pToa     state
			aTop     start
code_08a3:
			pushi    #cue
			pushi    0
			super    Script,  4
			ret     
		)
	)
)

(instance rustleSound of Sound
	(properties
		flags $0001
		number 462
	)
)
