;;; Sierra Script 1.0 - (do not remove this comment)
(script# 450)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n937)
(use n946)
(use n950)
(use n992)
(use n994)
(use n995)
(use n999)

(public
	rm450 0
)

(local
	local0
	[local1 5] = [440 470 455 460 480]
	[local6 5] = [160 217 143 122 157]
	[local11 5] = [145 147 144 147 65]
	[local16 5] = [160 225 139 113 159]
	[local21 5] = [157 147 134 148 61]
	[local26 5] = [0 8 16 2 4]
	local31
	[local32 4] = [52 52 25 25]
	[local36 4] = [0 4 8 18]
	[local40 4] = [100 115 197 208]
	local44 =  2
	local45 =  9
	local46 =  20
)
(procedure (localproc_084c param1)
	(asm
		pushi    #message
		pushi    0
		pushi    #curIcon
		pushi    0
		class    IconBar
		send     4
		send     4
		push    
		ldi      2
		eq?     
		bnt      code_0870
		lsl      local0
		lap      param1
		and     
		bnt      code_0870
		lsl      local0
		lap      param1
		bnot    
		and     
		sal      local0
code_0870:
		ret     
	)
)

(instance rm450 of Rm
	(properties
		picture 450
	)
	
	(method (init &tmp temp0)
		(asm
			lsg      global126
			ldi      5
			eq?     
			bnt      code_0026
			pushi    3
			pushi    65535
			pushi    50
			pushi    51
			callb    proc0_2,  6
			jmp      code_0039
code_0026:
			pushi    2
			pushi    65535
			pushi    67
			callb    proc0_2,  4
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			lag      global0
			send     6
code_0039:
			pushi    #setStep
			pushi    2
			pushi    2
			pushi    1
			pushi    107
			pushi    0
			lag      global0
			send     12
			lofsa    arrived
			aTop     script
			pushi    #client
			pushi    1
			pushSelf
			lofsa    arrived
			send     6
			lsg      global12
			dup     
			ldi      440
			eq?     
			bnt      code_0063
			ldi      0
			jmp      code_0094
code_0063:
			dup     
			ldi      470
			eq?     
			bnt      code_0070
			ldi      1
			jmp      code_0094
code_0070:
			dup     
			ldi      455
			eq?     
			bnt      code_007d
			ldi      2
			jmp      code_0094
code_007d:
			dup     
			ldi      460
			eq?     
			bnt      code_008a
			ldi      3
			jmp      code_0094
code_008a:
			dup     
			ldi      480
			eq?     
			bnt      code_0094
			ldi      4
code_0094:
			toss    
			sat      temp0
			lali     local26
			sal      local0
			pushi    #edgeHit
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			lat      temp0
			lsli     local16
			pushi    3
			pushi    1
			lsli     local21
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lat      temp0
			lsli     local6
			lsli     local11
			lofsa    arrived
			push    
			lag      global0
			send     30
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #addObstacle
			pushi    9
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    50
			pushi    128
			pushi    99
			pushi    110
			pushi    99
			pushi    110
			pushi    59
			pushi    107
			pushi    59
			pushi    107
			pushi    99
			pushi    95
			pushi    99
			pushi    95
			pushi    102
			pushi    128
			pushi    102
			pushi    128
			pushi    120
			pushi    149
			pushi    120
			pushi    153
			pushi    140
			pushi    142
			dup     
			pushi    143
			pushi    126
			dup     
			dup     
			dup     
			pushi    136
			pushi    139
			pushi    135
			pushi    139
			pushi    146
			pushi    121
			pushi    146
			pushi    121
			pushi    126
			pushi    116
			pushi    126
			pushi    116
			pushi    121
			pushi    111
			pushi    126
			pushi    0
			pushi    126
			pushi    0
			pushi    0
			pushi    128
			pushi    65534
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     114
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    137
			pushi    148
			pushi    137
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    148
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
			pushi    118
			pushi    129
			pushi    118
			pushi    146
			pushi    104
			pushi    146
			pushi    103
			pushi    129
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
			pushi    20
			pushi    132
			pushi    83
			pushi    132
			pushi    76
			pushi    140
			pushi    70
			pushi    136
			pushi    64
			pushi    132
			pushi    62
			pushi    149
			pushi    64
			pushi    154
			pushi    69
			pushi    150
			pushi    75
			pushi    155
			pushi    80
			pushi    150
			pushi    84
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    20
			pushi    179
			pushi    64
			pushi    170
			pushi    68
			pushi    179
			pushi    75
			pushi    179
			pushi    83
			pushi    168
			pushi    83
			pushi    162
			pushi    85
			pushi    157
			pushi    80
			pushi    161
			pushi    74
			pushi    156
			pushi    69
			pushi    161
			pushi    63
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     54
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    141
			pushi    92
			pushi    141
			pushi    101
			pushi    132
			pushi    101
			pushi    132
			pushi    92
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
			pushi    170
			pushi    92
			pushi    180
			pushi    92
			pushi    180
			pushi    101
			pushi    170
			pushi    101
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
			pushi    141
			pushi    109
			pushi    141
			pushi    118
			pushi    132
			pushi    118
			pushi    132
			pushi    109
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
			pushi    170
			pushi    110
			pushi    180
			pushi    110
			pushi    180
			pushi    119
			pushi    170
			pushi    119
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     22
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			ldi      470
			eq?     
			bnt      code_03bd
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    46
			pushi    173
			pushi    146
			pushi    160
			pushi    139
			pushi    160
			pushi    133
			pushi    174
			pushi    133
			pushi    174
			pushi    121
			pushi    183
			pushi    121
			pushi    183
			pushi    65534
			pushi    319
			pushi    65535
			pushi    319
			pushi    128
			pushi    221
			pushi    128
			pushi    221
			pushi    146
			pushi    184
			pushi    146
			pushi    184
			pushi    139
			pushi    205
			pushi    139
			pushi    205
			pushi    33
			pushi    202
			pushi    33
			pushi    202
			pushi    128
			pushi    184
			pushi    125
			pushi    184
			pushi    132
			pushi    202
			pushi    130
			pushi    202
			pushi    137
			pushi    182
			pushi    137
			pushi    182
			pushi    146
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     106
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    174
			pushi    148
			pushi    319
			pushi    148
			pushi    319
			pushi    189
			pushi    174
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     8
			jmp      code_0476
code_03bd:
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    50
			pushi    173
			pushi    146
			pushi    160
			pushi    139
			pushi    160
			pushi    133
			pushi    174
			pushi    133
			pushi    174
			pushi    121
			pushi    183
			pushi    121
			pushi    183
			pushi    65534
			pushi    319
			pushi    65535
			pushi    319
			pushi    189
			pushi    174
			pushi    189
			pushi    174
			pushi    148
			pushi    219
			pushi    148
			pushi    219
			pushi    146
			pushi    184
			pushi    146
			pushi    184
			pushi    139
			pushi    205
			pushi    139
			pushi    205
			pushi    33
			pushi    202
			pushi    33
			pushi    202
			pushi    128
			pushi    184
			pushi    125
			pushi    184
			pushi    132
			pushi    202
			pushi    130
			pushi    202
			pushi    137
			pushi    182
			pushi    137
			pushi    182
			pushi    146
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     114
			push    
			lag      global2
			send     6
			lsg      global12
			ldi      470
			eq?     
			bnt      code_0476
			ldi      0
			sal      local0
code_0476:
			pushi    2
			pushi    2
			pushi    9
			callk    Random,  4
			push    
			ldi      7
			sub     
			sal      local44
			pushi    2
			pushi    9
			pushi    10
			callk    Random,  4
			sal      local45
			pushi    2
			pushi    20
			pushi    25
			callk    Random,  4
			sal      local46
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    wash
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    bedRm
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    ref
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    chap
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    front
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    kitchen
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    flag
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    2
			lofsa    cells
			send     10
			pushi    #init
			pushi    0
			lofsa    outside
			send     4
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
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			bnt      code_0529
			pushi    #doit
			pushi    0
			send     4
			jmp      code_06e8
code_0529:
			pushi    #number
			pushi    0
			lag      global100
			send     4
			push    
			ldi      455
			ne?     
			bnt      code_055f
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_055f
			pushi    #script
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_055f
			pushi    #setScript
			pushi    1
			lofsa    changeMusic
			push    
			lag      global0
			send     6
code_055f:
			pushi    32638
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			and     
			sat      temp0
			push    
			ldi      1024
			uge?    
			bnt      code_0587
			pushi    #setScript
			pushi    3
			lofsa    takeOff
			push    
			pushi    0
			lst      temp0
			self     10
			jmp      code_06e8
code_0587:
			lat      temp0
			bnt      code_06e8
			lsl      local0
			and     
			not     
			bnt      code_06e8
			lst      temp0
			ldi      2
			and     
			bnt      code_05c8
			lsg      global130
			ldi      10
			eq?     
			bnt      code_05af
			pushi    2
			pushi    1450
			pushi    1
			calle    proc13_4,  4
			jmp      code_05b8
code_05af:
			pushi    2
			pushi    1450
			pushi    0
			calle    proc13_4,  4
code_05b8:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      2
			sal      local0
			jmp      code_06e8
code_05c8:
			lst      temp0
			ldi      4
			and     
			bnt      code_05e1
			pushi    2
			pushi    1450
			pushi    6
			calle    proc13_4,  4
			ldi      4
			sal      local0
			jmp      code_06e8
code_05e1:
			lst      temp0
			ldi      8
			and     
			bnt      code_065e
			lsg      global126
			ldi      0
			eq?     
			bnt      code_05fe
			pushi    2
			pushi    1450
			pushi    4
			calle    proc13_4,  4
			jmp      code_064e
code_05fe:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			ldi      470
			eq?     
			bnt      code_0621
			pushi    2
			pushi    1450
			pushi    2
			calle    proc13_4,  4
			jmp      code_064e
code_0621:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			lag      global0
			eq?     
			bnt      code_0644
			pushi    2
			pushi    1450
			pushi    3
			calle    proc13_4,  4
			jmp      code_064e
code_0644:
			pushi    2
			pushi    1450
			pushi    5
			calle    proc13_4,  4
code_064e:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      8
			sal      local0
			jmp      code_06e8
code_065e:
			lst      temp0
			ldi      16
			and     
			bnt      code_0680
			pushi    2
			pushi    1450
			pushi    7
			calle    proc13_4,  4
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      16
			sal      local0
			jmp      code_06e8
code_0680:
			lst      temp0
			ldi      32
			and     
			bnt      code_06ae
			lsg      global130
			ldi      10
			eq?     
			bnt      code_069d
			pushi    2
			pushi    1450
			pushi    13
			calle    proc13_4,  4
			jmp      code_06a7
code_069d:
			pushi    2
			pushi    1450
			pushi    12
			calle    proc13_4,  4
code_06a7:
			ldi      34
			sal      local0
			jmp      code_06e8
code_06ae:
			lst      temp0
			ldi      64
			and     
			bnt      code_06d0
			pushi    2
			pushi    1450
			pushi    14
			calle    proc13_4,  4
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      64
			sal      local0
			jmp      code_06e8
code_06d0:
			lst      temp0
			ldi      256
			and     
			bnt      code_06e8
			pushi    2
			pushi    1450
			pushi    15
			calle    proc13_4,  4
			ldi      256
			sal      local0
code_06e8:
			ret     
		)
	)
)

(instance arrived of Script
	(properties)
	
	(method (cue)
		(asm
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
)

(instance takeOff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_07fc
			pushi    0
			callb    proc0_3,  0
			pTos     register
			ldi      2048
			and     
			bnt      code_07a0
			ldi      0
			jmp      code_07d5
code_07a0:
			pTos     register
			ldi      16384
			and     
			bnt      code_07ae
			ldi      1
			jmp      code_07d5
code_07ae:
			pTos     register
			ldi      8192
			and     
			bnt      code_07bc
			ldi      2
			jmp      code_07d5
code_07bc:
			pTos     register
			ldi      4096
			and     
			bnt      code_07ca
			ldi      3
			jmp      code_07d5
code_07ca:
			pTos     register
			ldi      1024
			and     
			bnt      code_07d5
			ldi      4
code_07d5:
			aTop     register
			pTos     register
			ldi      3
			lt?     
			bnt      code_07f5
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pToa     register
			lsli     local16
			lsli     local21
			pushSelf
			lag      global0
			send     12
			jmp      code_080f
code_07f5:
			ldi      1
			aTop     cycles
			jmp      code_080f
code_07fc:
			dup     
			ldi      1
			eq?     
			bnt      code_080f
			pushi    #newRoom
			pushi    1
			pToa     register
			lsli     local1
			lag      global2
			send     6
code_080f:
			toss    
			ret     
		)
	)
)

(instance bedRm of Feature
	(properties
		nsTop 125
		nsLeft 210
		nsBottom 150
		nsRight 244
		approachX 218
		approachY 146
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    1
			pushi    8
			call     localproc_084c,  2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			ne?     
			bnt      code_0897
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0897:
			ret     
		)
	)
)

(instance ref of Feature
	(properties
		nsTop 124
		nsLeft 71
		nsBottom 149
		nsRight 122
		approachX 125
		approachY 147
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    1
			pushi    2
			call     localproc_084c,  2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			ne?     
			bnt      code_0905
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0905:
			ret     
		)
	)
)

(instance chap of Feature
	(properties
		nsTop 32
		nsLeft 127
		nsBottom 121
		nsRight 185
		approachX 157
		approachY 93
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    1
			pushi    4
			call     localproc_084c,  2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			ne?     
			bnt      code_0974
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0974:
			ret     
		)
	)
)

(instance front of Feature
	(properties
		nsTop 141
		nsLeft 137
		nsBottom 155
		nsRight 175
		approachX 155
		approachY 147
		lookStr 3407
	)
)

(instance wash of Feature
	(properties
		nsTop 125
		nsLeft 126
		nsBottom 139
		nsRight 145
		approachX 140
		approachY 139
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    1
			pushi    16
			call     localproc_084c,  2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			ne?     
			bnt      code_0a20
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a20:
			ret     
		)
	)
)

(instance kitchen of Feature
	(properties
		nsTop 105
		nsLeft 92
		nsBottom 121
		nsRight 122
		approachX 115
		approachY 124
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    1
			pushi    32
			call     localproc_084c,  2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			ne?     
			bnt      code_0a90
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a90:
			ret     
		)
	)
)

(instance flag of Feature
	(properties
		nsTop 125
		nsLeft 184
		nsBottom 132
		nsRight 197
		approachX 199
		approachY 129
	)
	
	(method (handleEvent pEvent param2)
		(asm
			pushi    1
			pushi    64
			call     localproc_084c,  2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			ne?     
			bnt      code_0b00
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0b00:
			ret     
		)
	)
)

(instance cells of Feature
	(properties
		onMeCheck $0080
	)
	
	(method (handleEvent pEvent param2 &tmp temp0 temp1)
		(asm
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			sat      temp0
			push    
			ldi      108
			lt?     
			bnt      code_0b61
			ldi      0
			jmp      code_0b84
code_0b61:
			lst      temp0
			ldi      156
			lt?     
			bnt      code_0b6f
			ldi      1
			jmp      code_0b84
code_0b6f:
			lst      temp0
			ldi      203
			lt?     
			bnt      code_0b7d
			ldi      2
			jmp      code_0b84
code_0b7d:
			ldi      1
			bnt      code_0b84
			ldi      3
code_0b84:
			sat      temp1
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			lat      temp1
			lali     local32
			sub     
			push    
			ldi      9
			div     
			sal      local31
			lat      temp1
			lali     local40
			aTop     approachX
			lat      temp1
			lsli     local32
			lsl      local31
			ldi      9
			mul     
			add     
			push    
			ldi      4
			add     
			aTop     approachY
			lsl      local31
			lat      temp1
			lali     local36
			add     
			sal      local31
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			&rest    param2
			super    Feature,  6
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0c1d
			lsl      local31
			dup     
			lal      local44
			eq?     
			bnt      code_0be1
			pushi    2
			pushi    450
			pushi    0
			calle    proc255_0,  4
			jmp      code_0c19
code_0be1:
			dup     
			lal      local45
			eq?     
			bnt      code_0bf4
			pushi    2
			pushi    450
			pushi    1
			calle    proc255_0,  4
			jmp      code_0c19
code_0bf4:
			dup     
			lal      local46
			eq?     
			bnt      code_0c07
			pushi    2
			pushi    450
			pushi    2
			calle    proc255_0,  4
			jmp      code_0c19
code_0c07:
			pushi    6
			pushi    450
			pushi    3
			pushi    82
			pushi    450
			pushi    0
			pushi    0
			calle    proc255_0,  12
code_0c19:
			toss    
			jmp      code_0c28
code_0c1d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0c28:
			ret     
		)
	)
)

(instance outside of Feature
	(properties
		onMeCheck $0200
		lookStr 16
	)
)

(instance changeMusic of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cc1
			ldi      60
			aTop     ticks
			jmp      code_0ced
code_0cc1:
			dup     
			ldi      1
			eq?     
			bnt      code_0ce1
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
			ldi      1
			aTop     cycles
			jmp      code_0ced
code_0ce1:
			dup     
			ldi      2
			eq?     
			bnt      code_0ced
			pushi    #dispose
			pushi    0
			self     4
code_0ced:
			toss    
			ret     
		)
	)
)
