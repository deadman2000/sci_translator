;;; Sierra Script 1.0 - (do not remove this comment)
(script# 620)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n813)
(use n851)
(use n939)
(use n945)
(use n946)
(use n950)
(use n958)
(use n969)
(use n989)
(use n991)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm620 0
	fenMonkVerb 1
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	[local16 4] = [1620 35 1]
	[local20 9] = [1620 7 2 1 2 1 2 2]
	[local29 4] = [1620 37 1]
	[local33 4] = [1620 22 1]
	[local37 4] = [1620 23 1]
	[local41 4] = [1620 24 1]
	[local45 4] = [1620 25 1]
	[local49 4] = [1620 26 1]
	[local53 4] = [1620 27 1]
	[local57 9] = [1620 28 1 1 1 1 1 1]
	[local66 4] = [1620 34 1]
	[local70 4] = [1620 38 1]
	[local74 4] = [1620 39 1]
	[local78 4] = [1620 42 1]
	[local82 4] = [1620 44 1]
	[local86 4] = [1620 45 1]
	[local90 4] = [1620 46 1]
	[local94 4] = [1620 47 1]
	[local98 4] = [1620 48 1]
	[local102 4] = [1620 49 1]
	[local106 4] = [1620 50 1]
	[local110 6] = [1620 14 1 2 2]
	[local116 4] = [1620 17 1]
	[local120 6] = [1620 18 1 2 2]
	[local126 4] = [1620 21 1]
	[local130 4] = [1620 51 1]
	[local134 4] = [1620 52 1]
	[local138 4] = [1620 53 1]
	[local142 7]
	[local149 7] = [141 270 49 233 244 122 33]
	[local156 7] = [178 156 179 183 167 170 169]
	[local163 18] = [42 0 2 4 24 41 23 29 29 57 0 2 4 33 28 31 35]
)
(procedure (localproc_0012 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_0018:
		lst      temp0
		ldi      7
		lt?     
		bnt      code_0043
		pushi    4
		pushi    #superClass
		lat      temp0
		lsli     local149
		pushi    3
		pushi    1
		lsli     local156
		pushi    107
		pushi    0
		pushi    #new
		pushi    0
		lofsa    wave
		send     4
		push    
		lat      temp0
		sali     local142
		send     16
		+at      temp0
		jmp      code_0018
code_0043:
		ret     
	)
)

(instance rm620 of Rm
	(properties
		picture 620
		style $000a
		south 610
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #init
			pushi    0
			lofsa    dieSound
			send     4
			pushi    #init
			pushi    0
			lofsa    splashSound
			send     4
			pushi    8
			pushi    128
			pushi    57
			pushi    805
			pushi    620
			pushi    19
			pushi    587
			pushi    22
			pushi    16
			calle    proc958_0,  16
			lag      global34
			sal      local15
			ldi      0
			sag      global34
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    38
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    145
			pushi    319
			pushi    189
			pushi    210
			pushi    134
			pushi    188
			pushi    132
			pushi    175
			pushi    132
			pushi    105
			pushi    112
			pushi    105
			pushi    126
			pushi    135
			pushi    126
			pushi    135
			pushi    132
			pushi    96
			pushi    135
			pushi    53
			pushi    132
			pushi    5
			pushi    133
			pushi    8
			pushi    150
			pushi    107
			pushi    156
			pushi    153
			pushi    143
			pushi    186
			pushi    154
			pushi    0
			pushi    172
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     90
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    92
			pushi    139
			pushi    129
			pushi    136
			pushi    134
			pushi    145
			pushi    94
			pushi    153
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			self     8
			pushi    1
			pushi    0
			callb    proc0_5,  2
			not     
			bnt      code_0132
			pushi    0
			call     localproc_0012,  0
code_0132:
			pushi    9
			lofsa    bench
			push    
			lofsa    reedsLeft
			push    
			lofsa    reedsRight
			push    
			lofsa    chainLeft
			push    
			lofsa    chainRight
			push    
			lofsa    gate
			push    
			lofsa    entrance
			push    
			lofsa    walls
			push    
			lofsa    waters
			push    
			calle    proc806_3,  18
			pushi    #view
			pushi    1
			pushi    620
			pushi    6
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    141
			pushi    124
			pushi    107
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     30
			lsg      global12
			ldi      630
			eq?     
			bnt      code_01dd
			pushi    #number
			pushi    1
			pushi    581
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    #number
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #view
			pushi    1
			pushi    47
			pushi    6
			pushi    1
			pushi    3
			pushi    284
			pushi    2
			pushi    159
			pushi    132
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     20
			pushi    #setScript
			pushi    1
			lofsa    backInside
			push    
			lag      global0
			send     6
			jmp      code_0238
code_01dd:
			pushi    3
			lsg      global12
			pushi    610
			pushi    700
			calle    proc999_5,  6
			bnt      code_0216
			lsg      global126
			ldi      6
			eq?     
			bnt      code_0207
			pushi    #setScript
			pushi    1
			lofsa    glideIn
			push    
			lag      global0
			send     6
			jmp      code_0238
code_0207:
			pushi    #setScript
			pushi    1
			lofsa    oops
			push    
			lag      global0
			send     6
			jmp      code_0238
code_0216:
			pushi    #loop
			pushi    1
			pushi    7
			pushi    284
			pushi    2
			pushi    180
			pushi    140
			pushi    267
			pushi    1
			lofsa    wierdDoVerb
			push    
			pushi    107
			pushi    0
			lag      global0
			send     24
			pushi    0
			callb    proc0_2,  0
code_0238:
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			+al      local1
			push    
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0255
			pushi    4
			pushi    6
			pushi    226
			pushi    255
			pushi    65535
			callk    Palette,  8
code_0255:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0265
			ldi      0
			jmp      code_034f
code_0265:
			pushi    #distanceTo
			pushi    1
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			push    
			ldi      20
			lt?     
			bnt      code_0294
			lsl      local0
			ldi      0
			eq?     
			bnt      code_0294
			pushi    #setScript
			pushi    1
			lofsa    closeToGuard
			push    
			lag      global0
			send     6
			jmp      code_034f
code_0294:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      120
			le?     
			bnt      code_02b1
			pushi    #setScript
			pushi    1
			lofsa    egoToMap
			push    
			lag      global0
			send     6
			jmp      code_034f
code_02b1:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      4
			and     
			bnt      code_02d0
			pushi    #setScript
			pushi    1
			lofsa    getInBoat
			push    
			lag      global0
			send     6
			jmp      code_034f
code_02d0:
			pushi    #onControl
			pushi    1
			pushi    1
			lag      global0
			send     6
			push    
			ldi      2
			and     
			bnt      code_02ef
			pushi    #setScript
			pushi    1
			lofsa    moveAway
			push    
			lag      global0
			send     6
			jmp      code_034f
code_02ef:
			lsg      global115
			ldi      2
			eq?     
			bnt      code_030a
			ldi      1
			sal      local9
			pushi    #setScript
			pushi    1
			lofsa    kinkyKill
			push    
			lag      global0
			send     6
			jmp      code_034f
code_030a:
			pushi    #backFromJewels
			pushi    0
			class    Monastery
			send     4
			bnt      code_032e
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			pushi    #setScript
			pushi    1
			lofsa    walkIntoMon
			push    
			lag      global0
			send     6
			jmp      code_034f
code_032e:
			pushi    1
			pushi    149
			callb    proc0_5,  2
			bnt      code_0347
			pushi    #setScript
			pushi    1
			lofsa    wrongGemDeath
			push    
			lag      global0
			send     6
			jmp      code_034f
code_0347:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
code_034f:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #actions
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #contains
			pushi    1
			lofsa    monk1
			push    
			lag      global5
			send     6
			bnt      code_036f
			pushi    #dispose
			pushi    0
			lofsa    monk1
			send     4
code_036f:
			lal      local15
			sag      global34
			pushi    1
			pushi    991
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance wierdDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_0409
			lsp      param2
			ldi      5
			eq?     
			bnt      code_0409
			lsl      local8
			ldi      1
			eq?     
			bnt      code_03f7
			pushi    3
			pushi    1620
			pushi    54
			pushi    1
			calle    proc13_4,  6
			jmp      code_0409
code_03f7:
			ldi      1
			sal      local8
			pushi    #setScript
			pushi    1
			lofsa    blowHard
			push    
			lag      global0
			send     6
			ldi      1
code_0409:
			ret     
		)
	)
)

(instance fenMonkVerb of Code
	(properties)
	
	(method (doit param1 param2 param3)
		(asm
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_0442
			pushi    3
			pushi    1620
			pushi    13
			pushi    1
			calle    proc13_4,  6
			jmp      code_0609
code_0442:
			dup     
			ldi      5
			eq?     
			bnt      code_04fa
			lsg      global12
			ldi      630
			eq?     
			bnt      code_0466
			pushi    3
			lea      @local29
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0609
code_0466:
			pushi    #has
			pushi    1
			pushi    5
			lag      global0
			send     6
			not     
			bnt      code_0498
			lsl      local7
			ldi      0
			eq?     
			bnt      code_0498
			pushi    6
			pushi    2
			lea      @local120
			push    
			pushi    8
			pushi    0
			lea      @local163
			push    
			pushi    1
			calle    proc851_0,  12
			ldi      1
			sal      local7
			jmp      code_0609
code_0498:
			pushi    #has
			pushi    1
			pushi    5
			lag      global0
			send     6
			not     
			bnt      code_04c2
			lsl      local7
			ldi      1
			eq?     
			bnt      code_04c2
			pushi    3
			lea      @local126
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0609
code_04c2:
			lsl      local5
			ldi      0
			eq?     
			bnt      code_04e6
			pushi    6
			pushi    2
			lea      @local110
			push    
			pushi    8
			pushi    0
			lea      @local163
			push    
			pushi    1
			calle    proc851_0,  12
			ldi      1
			sal      local5
			jmp      code_0609
code_04e6:
			pushi    3
			lea      @local116
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0609
code_04fa:
			dup     
			ldi      3
			eq?     
			bnt      code_052d
			lal      local2
			bnt      code_0515
			pushi    #setScript
			pushi    1
			lofsa    kinkyKill
			push    
			lag      global0
			send     6
			jmp      code_0609
code_0515:
			ldi      1
			sal      local2
			pushi    3
			lea      @local37
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0609
code_052d:
			dup     
			ldi      4
			eq?     
			bnt      code_05fe
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0551
			pushi    3
			lea      @local41
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_05fa
code_0551:
			dup     
			ldi      2
			eq?     
			bnt      code_056c
			pushi    3
			lea      @local45
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_05fa
code_056c:
			dup     
			ldi      14
			eq?     
			bnt      code_0587
			pushi    3
			lea      @local49
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_05fa
code_0587:
			dup     
			ldi      10
			eq?     
			bnt      code_05a1
			ldi      1
			sal      local9
			pushi    #setScript
			pushi    1
			lofsa    kinkyKill
			push    
			lag      global0
			send     6
			jmp      code_05fa
code_05a1:
			dup     
			ldi      5
			eq?     
			bnt      code_05c6
			pushi    #put
			pushi    1
			pushi    5
			lag      global0
			send     6
			pushi    3
			lea      @local53
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_05fa
code_05c6:
			dup     
			ldi      6
			eq?     
			bnt      code_05fa
			pushi    #has
			pushi    1
			pushi    5
			lag      global0
			send     6
			bnt      code_05ee
			pushi    3
			lea      @local66
			push    
			lea      @local163
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_05fa
code_05ee:
			pushi    #setScript
			pushi    1
			lofsa    riddleScript
			push    
			lag      global0
			send     6
code_05fa:
			toss    
			jmp      code_0609
code_05fe:
			pushi    #doit
			pushi    1
			lsp      param1
			&rest    param3
			lag      global65
			send     6
code_0609:
			toss    
			ret     
		)
	)
)

(instance entrance of Feature
	(properties
		x 150
		y 140
		nsTop 1
		nsLeft 117
		nsBottom 130
		nsRight 184
		sightAngle 90
	)
)

(instance walls of Feature
	(properties
		x 159
		nsBottom 139
		nsRight 319
		sightAngle 90
		lookStr 1
	)
)

(instance waters of Feature
	(properties
		x 159
		y 189
		sightAngle 90
		lookStr 2
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    40
			pushi    0
			pushi    166
			pushi    15
			pushi    166
			pushi    46
			pushi    158
			pushi    82
			pushi    158
			pushi    83
			pushi    162
			pushi    130
			pushi    163
			pushi    144
			pushi    155
			pushi    149
			pushi    156
			pushi    157
			pushi    152
			pushi    144
			pushi    147
			pushi    148
			pushi    145
			pushi    169
			pushi    151
			pushi    169
			pushi    157
			pushi    186
			pushi    179
			pushi    265
			pushi    163
			pushi    258
			pushi    147
			pushi    251
			pushi    142
			pushi    319
			pushi    139
			pushi    319
			pushi    189
			pushi    0
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     94
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
)

(instance bench of Feature
	(properties
		x 111
		y 129
		nsTop 129
		nsLeft 94
		nsBottom 147
		nsRight 128
		sightAngle 90
		lookStr 3
	)
)

(instance chainLeft of Feature
	(properties
		x 124
		y 150
		lookStr 4
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    124
			pushi    31
			pushi    128
			pushi    31
			pushi    188
			pushi    150
			pushi    183
			pushi    150
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
)

(instance chainRight of Feature
	(properties
		x 242
		y 143
		lookStr 4
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    172
			pushi    32
			pushi    175
			pushi    32
			pushi    245
			pushi    141
			pushi    242
			pushi    143
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
)

(instance reedsLeft of Feature
	(properties
		x 77
		y 166
		lookStr 5
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    30
			pushi    0
			pushi    142
			pushi    18
			pushi    136
			pushi    56
			pushi    136
			pushi    93
			pushi    141
			pushi    99
			pushi    147
			pushi    132
			pushi    142
			pushi    156
			pushi    150
			pushi    147
			pushi    157
			pushi    139
			pushi    157
			pushi    128
			pushi    163
			pushi    82
			pushi    161
			pushi    77
			pushi    157
			pushi    45
			pushi    158
			pushi    16
			pushi    166
			pushi    0
			pushi    165
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     74
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
)

(instance reedsRight of Feature
	(properties
		x 138
		y 143
		lookStr 5
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    207
			pushi    132
			pushi    242
			pushi    122
			pushi    319
			pushi    122
			pushi    319
			pushi    138
			pushi    254
			pushi    143
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
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
)

(instance gate of Feature
	(properties
		x 183
		y 145
		lookStr 6
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    124
			pushi    133
			pushi    182
			pushi    128
			pushi    256
			pushi    145
			pushi    258
			pushi    150
			pushi    183
			pushi    159
			pushi    123
			pushi    138
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
)

(instance aroundTheGuard of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    120
			pushi    116
			pushi    163
			pushi    111
			pushi    174
			pushi    126
			pushi    133
			pushi    126
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
)

(instance wave of Prop
	(properties
		view 620
		loop 1
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			bnt      code_0b40
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			self     12
			jmp      code_0b54
code_0b40:
			pushi    #setCel
			pushi    1
			pushi    2
			pushi    0
			pushi    2
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Rev
			push    
			self     12
code_0b54:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance monk1 of Actor
	(properties
		x 117
		y 187
		view 585
		loop 1
		signal $4000
		moveSpeed 0
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0be2
			pushi    3
			pushi    1620
			pushi    41
			pushi    1
			calle    proc13_4,  6
			jmp      code_0cc1
code_0be2:
			dup     
			ldi      3
			eq?     
			bnt      code_0bfc
			ldi      1
			sal      local3
			pushi    #setScript
			pushi    1
			lofsa    getInBoat
			push    
			lag      global0
			send     6
			jmp      code_0cc1
code_0bfc:
			dup     
			ldi      5
			eq?     
			bnt      code_0c15
			pushi    3
			lea      @local78
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			jmp      code_0cc1
code_0c15:
			dup     
			ldi      4
			eq?     
			bnt      code_0cb6
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0c37
			ldi      1
			sal      local10
			pushi    #setScript
			pushi    2
			lofsa    turnAndFace
			push    
			pushSelf
			self     8
			jmp      code_0cb2
code_0c37:
			dup     
			ldi      2
			eq?     
			bnt      code_0c50
			ldi      1
			sal      local11
			pushi    #setScript
			pushi    2
			lofsa    turnAndFace
			push    
			pushSelf
			self     8
			jmp      code_0cb2
code_0c50:
			dup     
			ldi      14
			eq?     
			bnt      code_0c69
			pushi    #setScript
			pushi    2
			lofsa    turnAndFace
			push    
			pushSelf
			self     8
			ldi      1
			sal      local12
			jmp      code_0cb2
code_0c69:
			dup     
			ldi      5
			eq?     
			bnt      code_0c82
			ldi      1
			sal      local13
			pushi    #setScript
			pushi    2
			lofsa    turnAndFace
			push    
			pushSelf
			self     8
			jmp      code_0cb2
code_0c82:
			dup     
			ldi      10
			eq?     
			bnt      code_0c9c
			ldi      1
			sal      local9
			pushi    #setScript
			pushi    1
			lofsa    getInBoat
			push    
			lag      global0
			send     6
			jmp      code_0cb2
code_0c9c:
			dup     
			ldi      6
			eq?     
			bnt      code_0cb2
			ldi      1
			sal      local14
			pushi    #setScript
			pushi    2
			lofsa    turnAndFace
			push    
			pushSelf
			self     8
code_0cb2:
			toss    
			jmp      code_0cc1
code_0cb6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0cc1:
			toss    
			ret     
		)
	)
)

(instance theBoat of Actor
	(properties
		x 88
		y 167
		lookStr 36
		view 21
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0d65
			ldi      1
			sal      local3
			pushi    #setScript
			pushi    1
			lofsa    getInBoat
			push    
			lag      global0
			send     6
			jmp      code_0d70
code_0d65:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_0d70:
			ret     
		)
	)
)

(instance whichOne of Actor
	(properties
		x 80
		y 7
		priority 12
		signal $4810
		moveSpeed 12
	)
)

(instance backInside of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0eb2
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    113
			pushi    114
			pushi    267
			pushi    1
			lofsa    wierdDoVerb
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    142
			pushi    125
			pushSelf
			lag      global0
			send     30
			pushi    0
			callb    proc0_2,  0
			jmp      code_0f0a
code_0eb2:
			dup     
			ldi      1
			eq?     
			bnt      code_0ec0
			ldi      24
			aTop     ticks
			jmp      code_0f0a
code_0ec0:
			dup     
			ldi      2
			eq?     
			bnt      code_0edd
			pushi    4
			lea      @local20
			push    
			pushi    8
			lea      @local163
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_0f0a
code_0edd:
			dup     
			ldi      3
			eq?     
			bnt      code_0ef8
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    113
			pushi    114
			pushSelf
			lag      global0
			send     12
			jmp      code_0f0a
code_0ef8:
			dup     
			ldi      4
			eq?     
			bnt      code_0f0a
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
code_0f0a:
			toss    
			ret     
		)
	)
)

(instance egoToMap of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f6a
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    113
			pushi    114
			pushSelf
			lag      global0
			send     12
			jmp      code_0f7c
code_0f6a:
			dup     
			ldi      1
			eq?     
			bnt      code_0f7c
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
code_0f7c:
			toss    
			ret     
		)
	)
)

(instance glideIn of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      52
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      22
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    289
			pushi    1
			pushi    1
			lag      global0
			send     24
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      29
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      20
			add     
			push    
			pushi    66
			pushi    1
			pushi    #priority
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    289
			pushi    1
			pushi    1
			lofsa    monk1
			send     24
			pushi    #doit
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
			bnt      code_10a2
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    19
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    135
			pushi    187
			pushi    267
			pushi    1
			lofsa    wierdDoVerb
			push    
			pushi    107
			pushi    0
			lag      global0
			send     36
			pushi    #setCycle
			pushi    1
			class    End
			push    
			pushi    107
			pushi    0
			lofsa    monk1
			send     10
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    0
			pushi    289
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    177
			pushi    142
			pushSelf
			lofsa    theBoat
			send     34
			jmp      code_10c2
code_10a2:
			dup     
			ldi      1
			eq?     
			bnt      code_10c2
			pushi    #play
			pushi    0
			lofsa    dockSound
			send     4
			pushi    #setScript
			pushi    1
			lofsa    getOutBoat
			push    
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_10c2:
			toss    
			ret     
		)
	)
)

(instance getOutBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_113a
			pushi    0
			callb    proc0_3,  0
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    229
			pushi    164
			pushi    289
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     34
			jmp      code_11ba
code_113a:
			dup     
			ldi      1
			eq?     
			bnt      code_1173
			pushi    3
			pushi    7
			pushi    16
			pushi    17
			callb    proc0_2,  6
			pushi    #posn
			pushi    2
			pushi    216
			pushi    143
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    200
			pushi    140
			pushSelf
			lag      global0
			send     26
			jmp      code_11ba
code_1173:
			dup     
			ldi      2
			eq?     
			bnt      code_119e
			lsg      global115
			ldi      2
			eq?     
			bnt      code_1195
			ldi      1
			sal      local9
			pushi    #setScript
			pushi    1
			lofsa    kinkyKill
			push    
			lag      global0
			send     6
			jmp      code_11ba
code_1195:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_11ba
code_119e:
			dup     
			ldi      3
			eq?     
			bnt      code_11ba
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    4
			pushi    5
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_11ba:
			toss    
			ret     
		)
	)
)

(instance getInBoat of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_121c
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    216
			pushi    143
			pushSelf
			lag      global0
			send     12
			jmp      code_12c1
code_121c:
			dup     
			ldi      1
			eq?     
			bnt      code_1239
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    3
			lag      global0
			send     12
			ldi      6
			aTop     ticks
			jmp      code_12c1
code_1239:
			dup     
			ldi      2
			eq?     
			bnt      code_125e
			pushi    #view
			pushi    1
			pushi    19
			pushi    284
			pushi    2
			pushi    229
			pushi    164
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     22
			jmp      code_12c1
code_125e:
			dup     
			ldi      3
			eq?     
			bnt      code_1293
			lsl      local6
			ldi      1
			eq?     
			bt       code_127a
			lsl      local4
			ldi      1
			eq?     
			bt       code_127a
			lsl      local9
			ldi      1
			eq?     
code_127a:
			bnt      code_128c
			pushi    #setScript
			pushi    1
			lofsa    murderHim
			push    
			lag      global0
			send     6
			jmp      code_12c1
code_128c:
			ldi      6
			aTop     ticks
			jmp      code_12c1
code_1293:
			dup     
			ldi      4
			eq?     
			bnt      code_12c1
			lsl      local3
			ldi      1
			eq?     
			bnt      code_12b5
			pushi    3
			lea      @local70
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			ldi      1
			sal      local4
code_12b5:
			pushi    #setScript
			pushi    1
			lofsa    getOutBoat
			push    
			lag      global0
			send     6
code_12c1:
			toss    
			ret     
		)
	)
)

(instance oops of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1371
			pushi    3
			pushi    132
			pushi    351
			pushi    20
			calle    proc958_0,  6
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    0
			pushi    9
			callk    Random,  4
			aTop     register
			pushi    5
			pushi    #superClass
			pushi    587
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    20
			pushi    3
			pushi    1
			pushi    166
			pushi    17
			pushi    1
			pushi    #signal
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4096
			or      
			push    
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    Osc
			push    
			pushi    2
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    204
			pushi    166
			pushSelf
			lag      global0
			send     60
			jmp      code_1459
code_1371:
			dup     
			ldi      1
			eq?     
			bnt      code_138d
			pushi    4
			lea      @local16
			push    
			lea      @local163
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1459
code_138d:
			dup     
			ldi      2
			eq?     
			bnt      code_13c6
			pushi    5
			pushi    1
			pushi    620
			pushi    6
			pushi    1
			pTos     register
			ldi      3
			eq?     
			bnt      code_13aa
			ldi      5
			jmp      code_13ac
code_13aa:
			ldi      3
code_13ac:
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    JumpTo
			push    
			pushi    189
			pushi    125
			pushSelf
			lofsa    whichOne
			send     28
			jmp      code_1459
code_13c6:
			dup     
			ldi      3
			eq?     
			bnt      code_1424
			pushi    #setMotion
			pushi    3
			class    JumpTo
			push    
			pushi    186
			pushi    168
			lofsa    whichOne
			send     10
			pushi    162
			pushi    #superClass
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			pushi    43
			pushi    1
			pTos     register
			ldi      3
			eq?     
			bnt      code_1416
			ldi      351
			jmp      code_1418
code_1416:
			ldi      20
code_1418:
			push    
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
			jmp      code_1459
code_1424:
			dup     
			ldi      4
			eq?     
			bnt      code_1446
			pTos     register
			ldi      3
			eq?     
			bnt      code_143f
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    whichOne
			send     6
code_143f:
			ldi      5
			aTop     seconds
			jmp      code_1459
code_1446:
			dup     
			ldi      5
			eq?     
			bnt      code_1459
			pushi    0
			calle    proc806_0,  0
			pushi    #dispose
			pushi    0
			self     4
code_1459:
			toss    
			ret     
		)
	)
)

(instance murderHim of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      52
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      22
			add     
			push    
			lag      global0
			send     12
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      29
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			lofsa    theBoat
			send     4
			push    
			ldi      20
			add     
			push    
			lofsa    monk1
			send     12
			pushi    #doit
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
			bnt      code_152d
			pushi    0
			callb    proc0_3,  0
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Beg
			push    
			lofsa    monk1
			send     12
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    162
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    162
			pushi    152
			pushSelf
			lofsa    theBoat
			send     30
			jmp      code_1540
code_152d:
			dup     
			ldi      1
			eq?     
			bnt      code_1540
			pushi    #setScript
			pushi    1
			lofsa    monkSwings
			push    
			lag      global0
			send     6
code_1540:
			toss    
			ret     
		)
	)
)

(instance monkSwings of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_15ba
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    1
			pushi    585
			pushi    284
			pushi    2
			pushi    188
			pushi    168
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
			lofsa    monk1
			send     34
			jmp      code_167b
code_15ba:
			dup     
			ldi      1
			eq?     
			bnt      code_15eb
			pushi    #play
			pushi    0
			lofsa    dieSound
			send     4
			pushi    #view
			pushi    1
			pushi    22
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
			jmp      code_167b
code_15eb:
			dup     
			ldi      2
			eq?     
			bnt      code_1609
			pushi    #play
			pushi    0
			lofsa    splashSound
			send     4
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_167b
code_1609:
			dup     
			ldi      3
			eq?     
			bnt      code_1669
			lsl      local4
			ldi      1
			eq?     
			bnt      code_162f
			ldi      19
			sag      global145
			pushi    4
			lea      @local33
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_167b
code_162f:
			lsl      local9
			ldi      1
			eq?     
			bnt      code_1650
			ldi      20
			sag      global145
			pushi    4
			lea      @local98
			push    
			lea      @local163
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_167b
code_1650:
			ldi      35
			sag      global145
			pushi    4
			lea      @local74
			push    
			lea      @local163
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_167b
code_1669:
			dup     
			ldi      4
			eq?     
			bnt      code_167b
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_167b:
			toss    
			ret     
		)
	)
)

(instance moveAway of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_16d8
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      6
			aTop     ticks
			jmp      code_17cf
code_16d8:
			dup     
			ldi      1
			eq?     
			bnt      code_17b3
			pushi    2
			pushi    1620
			pushi    40
			calle    proc13_4,  4
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      120
			lt?     
			bnt      code_1755
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      110
			lt?     
			bnt      code_172d
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_17cf
code_172d:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_17cf
code_1755:
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      110
			lt?     
			bnt      code_178b
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_17cf
code_178b:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_17cf
code_17b3:
			dup     
			ldi      2
			eq?     
			bnt      code_17cf
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    4
			pushi    5
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_17cf:
			toss    
			ret     
		)
	)
)

(instance kinkyKill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1850
			pushi    0
			callb    proc0_3,  0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_190d
code_1850:
			dup     
			ldi      1
			eq?     
			bnt      code_188e
			lal      local9
			bnt      code_1875
			pushi    4
			lea      @local102
			push    
			lea      @local163
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			ldi      20
			sag      global145
			jmp      code_190d
code_1875:
			ldi      19
			sag      global145
			pushi    4
			lea      @local33
			push    
			lea      @local163
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_190d
code_188e:
			dup     
			ldi      2
			eq?     
			bnt      code_18c4
			pushi    #view
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    151
			pushi    3
			pushi    1
			pushi    129
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     38
			jmp      code_190d
code_18c4:
			dup     
			ldi      3
			eq?     
			bnt      code_18fb
			pushi    #number
			pushi    1
			pushi    588
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
			pushi    #view
			pushi    1
			pushi    22
			pushi    162
			pushi    1
			pushi    1
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
			jmp      code_190d
code_18fb:
			dup     
			ldi      4
			eq?     
			bnt      code_190d
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_190d:
			toss    
			ret     
		)
	)
)

(instance blowHard of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_196c
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    3
			pushi    0
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_19a2
code_196c:
			dup     
			ldi      1
			eq?     
			bnt      code_1986
			pushi    4
			lea      @local106
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_19a2
code_1986:
			dup     
			ldi      2
			eq?     
			bnt      code_19a2
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    4
			pushi    5
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_19a2:
			toss    
			ret     
		)
	)
)

(instance riddleScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a0d
			pushi    0
			callb    proc0_3,  0
			pushi    #put
			pushi    1
			pushi    6
			lag      global0
			send     6
			pushi    4
			lea      @local57
			push    
			lea      @local163
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1a26
code_1a0d:
			dup     
			ldi      1
			eq?     
			bnt      code_1a26
			pushi    #doit
			pushi    0
			pushi    2
			pushi    621
			pushi    0
			callk    ScriptID,  4
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1a26:
			toss    
			ret     
		)
	)
)

(instance wrongGemDeath of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a88
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local130
			push    
			lea      @local163
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_1b5e
code_1a88:
			dup     
			ldi      1
			eq?     
			bnt      code_1aa5
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    152
			pushi    137
			pushSelf
			lag      global0
			send     12
			jmp      code_1b5e
code_1aa5:
			dup     
			ldi      2
			eq?     
			bnt      code_1ad2
			pushi    #view
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     30
			jmp      code_1b5e
code_1ad2:
			dup     
			ldi      3
			eq?     
			bnt      code_1af2
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     12
			jmp      code_1b5e
code_1af2:
			dup     
			ldi      4
			eq?     
			bnt      code_1b31
			pushi    #number
			pushi    1
			pushi    588
			pushi    42
			pushi    0
			lofsa    dieSound
			send     10
			pushi    #view
			pushi    1
			pushi    22
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    160
			pushi    135
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     38
			jmp      code_1b5e
code_1b31:
			dup     
			ldi      5
			eq?     
			bnt      code_1b48
			pushi    #style
			pushi    1
			pushi    10
			lag      global2
			send     6
			ldi      6
			aTop     ticks
			jmp      code_1b5e
code_1b48:
			dup     
			ldi      6
			eq?     
			bnt      code_1b5e
			ldi      21
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_1b5e:
			toss    
			ret     
		)
	)
)

(instance walkIntoMon of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1bc0
			pushi    0
			callb    proc0_3,  0
			pushi    5
			pushi    1
			lea      @local134
			push    
			lea      @local163
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_1c52
code_1bc0:
			dup     
			ldi      1
			eq?     
			bnt      code_1c09
			pushi    5
			pushi    #superClass
			pushi    16
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			push    
			pushSelf
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     24
			jmp      code_1c52
code_1c09:
			dup     
			ldi      2
			eq?     
			bnt      code_1c24
			pushi    3
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_1c52
code_1c24:
			dup     
			ldi      3
			eq?     
			bnt      code_1c40
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    151
			pushi    115
			pushSelf
			lag      global0
			send     12
			jmp      code_1c52
code_1c40:
			dup     
			ldi      4
			eq?     
			bnt      code_1c52
			pushi    #newRoom
			pushi    1
			pushi    630
			lag      global2
			send     6
code_1c52:
			toss    
			ret     
		)
	)
)

(instance closeToGuard of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cc6
			pushi    0
			callb    proc0_3,  0
			ldi      1
			sal      local0
			pushi    1
			pushi    29
			calle    proc13_6,  2
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    5
			pushi    1
			lea      @local138
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1d18
code_1cc6:
			dup     
			ldi      1
			eq?     
			bnt      code_1ce9
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    200
			pushi    140
			pushSelf
			lag      global0
			send     12
			jmp      code_1d18
code_1ce9:
			dup     
			ldi      2
			eq?     
			bnt      code_1d04
			pushi    3
			lsg      global0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1d18
code_1d04:
			dup     
			ldi      3
			eq?     
			bnt      code_1d18
			pushi    0
			callb    proc0_4,  0
			ldi      0
			sal      local0
			pushi    #dispose
			pushi    0
			self     4
code_1d18:
			toss    
			ret     
		)
	)
)

(instance turnAndFace of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1d71
			pushi    2
			lsg      global0
			lofsa    monk1
			push    
			callb    proc0_9,  4
			ldi      30
			aTop     ticks
			jmp      code_1e1e
code_1d71:
			dup     
			ldi      1
			eq?     
			bnt      code_1e0e
			lsl      local10
			ldi      1
			eq?     
			bnt      code_1d96
			pushi    3
			lea      @local82
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			ldi      0
			sal      local10
			jmp      code_1e1e
code_1d96:
			lsl      local11
			ldi      1
			eq?     
			bnt      code_1db4
			pushi    3
			lea      @local86
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			ldi      0
			sal      local11
			jmp      code_1e1e
code_1db4:
			lsl      local12
			ldi      1
			eq?     
			bnt      code_1dd2
			pushi    3
			lea      @local86
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			ldi      0
			sal      local12
			jmp      code_1e1e
code_1dd2:
			lsl      local13
			ldi      1
			eq?     
			bnt      code_1df0
			pushi    3
			lea      @local90
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			ldi      0
			sal      local13
			jmp      code_1e1e
code_1df0:
			lsl      local14
			ldi      1
			eq?     
			bnt      code_1e1e
			pushi    3
			lea      @local94
			push    
			pushi    11
			pushi    0
			calle    proc851_0,  6
			ldi      0
			sal      local14
			jmp      code_1e1e
code_1e0e:
			dup     
			ldi      2
			eq?     
			bnt      code_1e1e
			ldi      30
			aTop     ticks
			pushi    #dispose
			pushi    0
			self     4
code_1e1e:
			toss    
			ret     
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)

(instance splashSound of Sound
	(properties
		flags $0001
		number 930
	)
)

(instance dockSound of Sound
	(properties
		flags $0001
		number 23
	)
)
