;;; Sierra Script 1.0 - (do not remove this comment)
(script# 621)
(include sci.sh)
(use n000)
(use n625)
(use n806)
(use n851)
(use n937)
(use n946)
(use n950)
(use n998)
(use n999)

(public
	gems_room 0
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
	local16
	local17
	local18
	local19
	local20
	local21
	local22
	local23
	local24
	[local25 4] = [1621 0 1]
	[local29 8] = [1621 1 1 0 1621 3 1]
	[local37 4] = [1621 4 1]
	[local41 4] = [1621 5 1]
)
(procedure (localproc_0062)
	(asm
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    hideMe
		push    
		lag      global5
		send     8
		lag      global5
		sal      local19
		lag      global32
		sal      local20
		lag      global10
		sal      local21
		lag      global73
		sal      local22
		ldi      0
		sag      global10
		sag      global32
		sag      global5
		sag      global73
		pushi    #drawPic
		pushi    2
		pushi    803
		pushi    10
		lag      global2
		send     8
		pushi    #add
		pushi    0
		lofsa    newCast
		sag      global5
		send     4
		pushi    #add
		pushi    0
		lofsa    newFeatures
		sag      global32
		send     4
		pushi    #add
		pushi    1
		lsg      global32
		lofsa    newMDH
		sag      global73
		send     6
		ret     
	)
)

(procedure (localproc_00b7)
	(asm
		pushi    0
		callk    GameIsRestarting,  0
		bnt      code_00dc
		pushi    11
		lsl      local17
		pushi    100
		pushi    50
		pushi    10
		pushi    106
		pushi    200
		pushi    102
		pushi    255
		pushi    103
		pushi    0
		pushi    107
		callk    Display,  22
		sal      local16
code_00dc:
		ret     
	)
)

(procedure (localproc_00dd)
	(asm
		pushi    #eachElementDo
		pushi    1
		pushi    108
		pushi    116
		pushi    1
		pushi    84
		pushi    122
		pushi    0
		pushi    108
		pushi    0
		lag      global5
		send     20
		pushi    #eachElementDo
		pushi    1
		pushi    108
		pushi    116
		pushi    1
		pushi    84
		pushi    122
		pushi    0
		pushi    108
		pushi    0
		lag      global32
		send     20
		pushi    #dispose
		pushi    0
		lofsa    bigGems
		send     4
		pushi    #dispose
		pushi    0
		lag      global73
		send     4
		pushi    #drawPic
		pushi    2
		pushi    #picture
		pushi    0
		lag      global2
		send     4
		push    
		pushi    10
		lag      global2
		send     8
		lal      local19
		sag      global5
		lal      local20
		sag      global32
		pushi    #doit
		pushi    0
		lal      local21
		sag      global10
		send     4
		lal      local22
		sag      global73
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    showMe
		push    
		lag      global5
		send     8
		ret     
	)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMDH of EventHandler
	(properties)
)

(instance hideMe of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    85
			pushi    #superClass
			pushi    #z
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1000
			add     
			push    
			lap      param1
			send     6
			ret     
		)
	)
)

(instance showMe of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    85
			pushi    #superClass
			pushi    #z
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1000
			sub     
			push    
			lap      param1
			send     6
			ret     
		)
	)
)

(instance gems_room of Code
	(properties)
	
	(method (doit &tmp temp0 temp1 temp2 temp3)
		(asm
			ldi      1
			sal      local18
			lag      global19
			sal      local23
			pushi    #disable
			pushi    7
			pushi    3
			pushi    1
			pushi    4
			pushi    5
			pushi    6
			pushi    0
			pushi    7
			lag      global69
			send     18
			pushi    #at
			pushi    1
			pushi    2
			class    IconBar
			send     6
			sat      temp1
			pushi    #cursor
			pushi    0
			send     4
			sal      local1
			pushi    #cursor
			pushi    1
			pushi    5
			lat      temp1
			send     6
			pushi    #at
			pushi    1
			pushi    8
			class    IconBar
			send     6
			sat      temp2
			pushi    #cursor
			pushi    0
			send     4
			sal      local2
			pushi    #cursor
			pushi    1
			pushi    5
			lat      temp2
			send     6
			lag      global34
			sal      local24
			ldi      1
			sag      global34
			pushi    0
			call     localproc_0062,  0
			pushi    10
			lofsa    agate
			push    
			lofsa    turquoise
			push    
			lofsa    sapphire
			push    
			lofsa    carnelian
			push    
			lofsa    lapisLazuli
			push    
			lofsa    amber
			push    
			lofsa    jet
			push    
			lofsa    opal
			push    
			lofsa    quartz
			push    
			lofsa    everything
			push    
			calle    proc806_3,  20
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    bigGems
			send     8
			pushi    #posn
			pushi    2
			pushi    180
			pushi    125
			pushi    107
			pushi    0
			lofsa    army
			send     12
			pushi    #setCursor
			pushi    4
			pushi    5
			pushi    1
			pushi    180
			pushi    125
			lag      global1
			send     12
			pushi    2
			pushi    0
			pushi    13
			callk    Random,  4
			sal      local13
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_028e
			ldi      0
			jmp      code_029a
code_028e:
			pushi    #setScript
			pushi    1
			lofsa    doTheRiddles
			push    
			lag      global2
			send     6
code_029a:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    0
			call     localproc_00dd,  0
			lal      local24
			sag      global34
			pushi    #setCursor
			pushi    2
			lsl      local23
			pushi    1
			lag      global1
			send     8
			pushi    #cursor
			pushi    1
			lsl      local1
			pushi    #at
			pushi    1
			pushi    2
			class    IconBar
			send     6
			send     6
			pushi    #cursor
			pushi    1
			lsl      local2
			pushi    #at
			pushi    1
			pushi    8
			class    IconBar
			send     6
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    #enable
			pushi    7
			pushi    3
			pushi    6
			pushi    5
			pushi    6
			pushi    0
			pushi    7
			pushi    8
			lag      global69
			send     18
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			super    Code,  4
			pushi    1
			pushi    621
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance everything of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    0
			pushi    0
			pushi    319
			pushi    0
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
			send     30
			ret     
		)
	)
)

(instance agate of Feature
	(properties
		y 90
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    158
			pushi    78
			pushi    158
			pushi    82
			pushi    152
			pushi    90
			pushi    146
			pushi    88
			pushi    144
			pushi    86
			pushi    144
			pushi    82
			pushi    146
			pushi    80
			pushi    150
			pushi    77
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0427
			+al      local14
			lal      local4
			not     
			bnt      code_0418
			pushi    9
			lsl      local13
			pushi    0
			pushi    3
			pushi    6
			pushi    7
			pushi    8
			pushi    10
			pushi    11
			pushi    14
			calle    proc999_5,  18
			bnt      code_0418
			ldi      1
			sal      local4
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_0432
code_0418:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_0432
code_0427:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0432:
			ret     
		)
	)
)

(instance turquoise of Feature
	(properties
		y 105
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    133
			pushi    99
			pushi    138
			pushi    94
			pushi    147
			pushi    93
			pushi    149
			pushi    95
			pushi    150
			pushi    101
			pushi    146
			pushi    104
			pushi    135
			pushi    105
			pushi    132
			pushi    102
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0508
			+al      local14
			lsl      local5
			ldi      0
			eq?     
			bnt      code_04f9
			pushi    4
			lsl      local13
			pushi    8
			pushi    12
			pushi    14
			calle    proc999_5,  8
			bnt      code_04f9
			ldi      1
			sal      local5
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_0513
code_04f9:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_0513
code_0508:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0513:
			ret     
		)
	)
)

(instance sapphire of Feature
	(properties
		y 103
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    156
			pushi    101
			pushi    154
			pushi    98
			pushi    154
			pushi    94
			pushi    160
			pushi    91
			pushi    165
			pushi    91
			pushi    167
			pushi    95
			pushi    167
			pushi    101
			pushi    161
			pushi    103
			pushi    157
			pushi    103
			pushi    155
			pushi    101
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_05f8
			+al      local14
			lsl      local6
			ldi      0
			eq?     
			bnt      code_05e9
			pushi    7
			lsl      local13
			pushi    5
			pushi    7
			pushi    8
			pushi    9
			pushi    12
			pushi    13
			calle    proc999_5,  14
			bnt      code_05e9
			ldi      1
			sal      local6
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_0603
code_05e9:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_0603
code_05f8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0603:
			ret     
		)
	)
)

(instance carnelian of Feature
	(properties
		y 103
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    180
			pushi    90
			pushi    188
			pushi    89
			pushi    194
			pushi    91
			pushi    195
			pushi    99
			pushi    192
			pushi    102
			pushi    186
			pushi    103
			pushi    181
			pushi    100
			pushi    177
			pushi    97
			pushi    177
			pushi    93
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_06e3
			+al      local14
			lsl      local7
			ldi      0
			eq?     
			bnt      code_06d4
			pushi    8
			lsl      local13
			pushi    1
			pushi    2
			pushi    3
			pushi    5
			pushi    6
			pushi    10
			pushi    15
			calle    proc999_5,  16
			bnt      code_06d4
			ldi      1
			sal      local7
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_06ee
code_06d4:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_06ee
code_06e3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_06ee:
			ret     
		)
	)
)

(instance lapisLazuli of Feature
	(properties
		y 118
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    121
			pushi    115
			pushi    121
			pushi    112
			pushi    125
			pushi    109
			pushi    133
			pushi    108
			pushi    135
			pushi    111
			pushi    135
			pushi    114
			pushi    129
			pushi    118
			pushi    123
			pushi    117
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_07c5
			+al      local14
			lsl      local8
			ldi      0
			eq?     
			bnt      code_07b6
			pushi    7
			lsl      local13
			pushi    0
			pushi    5
			pushi    7
			pushi    9
			pushi    11
			pushi    13
			calle    proc999_5,  14
			bnt      code_07b6
			ldi      1
			sal      local8
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_07d0
code_07b6:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_07d0
code_07c5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_07d0:
			ret     
		)
	)
)

(instance amber of Feature
	(properties
		y 119
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    145
			pushi    115
			pushi    145
			pushi    111
			pushi    150
			pushi    107
			pushi    156
			pushi    107
			pushi    158
			pushi    109
			pushi    159
			pushi    115
			pushi    155
			pushi    119
			pushi    148
			pushi    119
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_08aa
			+al      local14
			lsl      local9
			ldi      0
			eq?     
			bnt      code_089b
			pushi    6
			lsl      local13
			pushi    3
			pushi    4
			pushi    9
			pushi    14
			pushi    15
			calle    proc999_5,  12
			bnt      code_089b
			ldi      1
			sal      local9
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_08b5
code_089b:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_08b5
code_08aa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_08b5:
			ret     
		)
	)
)

(instance jet of Feature
	(properties
		y 113
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    166
			pushi    111
			pushi    166
			pushi    106
			pushi    169
			pushi    104
			pushi    174
			pushi    104
			pushi    177
			pushi    108
			pushi    177
			pushi    111
			pushi    171
			pushi    113
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_098c
			+al      local14
			lsl      local10
			ldi      0
			eq?     
			bnt      code_097d
			pushi    9
			lsl      local13
			pushi    0
			pushi    1
			pushi    2
			pushi    9
			pushi    11
			pushi    12
			pushi    13
			pushi    15
			calle    proc999_5,  18
			bnt      code_097d
			ldi      1
			sal      local10
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_0997
code_097d:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_0997
code_098c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0997:
			ret     
		)
	)
)

(instance opal of Feature
	(properties
		y 128
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    140
			pushi    117
			pushi    144
			pushi    118
			pushi    146
			pushi    123
			pushi    141
			pushi    128
			pushi    135
			pushi    127
			pushi    132
			pushi    125
			pushi    132
			pushi    120
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0a68
			+al      local14
			lsl      local11
			ldi      0
			eq?     
			bnt      code_0a59
			pushi    5
			lsl      local13
			pushi    1
			pushi    2
			pushi    4
			pushi    6
			calle    proc999_5,  10
			bnt      code_0a59
			ldi      1
			sal      local11
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_0a73
code_0a59:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_0a73
code_0a68:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a73:
			ret     
		)
	)
)

(instance quartz of Feature
	(properties
		y 128
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    187
			pushi    116
			pushi    187
			pushi    123
			pushi    183
			pushi    127
			pushi    177
			pushi    128
			pushi    174
			pushi    126
			pushi    171
			pushi    120
			pushi    179
			pushi    112
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_0b47
			+al      local14
			lsl      local12
			ldi      0
			eq?     
			bnt      code_0b38
			pushi    6
			lsl      local13
			pushi    0
			pushi    4
			pushi    5
			pushi    10
			pushi    13
			calle    proc999_5,  12
			bnt      code_0b38
			ldi      1
			sal      local12
			pushi    #setScript
			pushi    1
			lofsa    rightAns
			push    
			lag      global2
			send     6
			jmp      code_0b52
code_0b38:
			pushi    #setScript
			pushi    1
			lofsa    wrongAns
			push    
			lag      global2
			send     6
			jmp      code_0b52
code_0b47:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0b52:
			ret     
		)
	)
)

(instance bigGems of View
	(properties
		x 153
		y 72
		view 771
		loop 4
		cel 1
	)
)

(instance army of Actor
	(properties
		x 180
		y 125
		view 182
		loop 1
		priority 14
		signal $6810
		illegalBits $0000
	)
	
	(method (doit)
		(asm
			lag      global70
			aTop     x
			lsg      global71
			ldi      10
			sub     
			aTop     y
			lsg      global19
			ldi      5
			ne?     
			bnt      code_0c16
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
code_0c16:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance doTheRiddles of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			pushi    0
			call     localproc_00b7,  0
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
			bnt      code_0dcb
			ldi      0
			sal      local4
			ldi      0
			sal      local5
			ldi      0
			sal      local6
			ldi      0
			sal      local7
			ldi      0
			sal      local8
			ldi      0
			sal      local9
			ldi      0
			sal      local10
			ldi      0
			sal      local11
			ldi      0
			sal      local12
			lsl      local13
			dup     
			ldi      0
			eq?     
			bnt      code_0ce5
			lofsa    {I will seek out the devil where he lies and I will cross many seas to do so.__Then I shall blast him with fire from heaven.}
			sal      local17
			jmp      code_0dc3
code_0ce5:
			dup     
			ldi      1
			eq?     
			bnt      code_0cf4
			lofsa    {Demons dance to my call.__I am a thief none can catch.__No sharp blade worries me.__What do I have?}
			sal      local17
			jmp      code_0dc3
code_0cf4:
			dup     
			ldi      2
			eq?     
			bnt      code_0d03
			lofsa    {I would comfort a friend who is ill and fears that death will come upon him without warning.__But if death should come, let my gifts guide him beyond demon's reach and to new life. What should I give him?}
			sal      local17
			jmp      code_0dc3
code_0d03:
			dup     
			ldi      3
			eq?     
			bnt      code_0d12
			lofsa    {I have a fever which has driven me to madness.__My teeth loosen and I taste blood in my mouth.}
			sal      local17
			jmp      code_0dc3
code_0d12:
			dup     
			ldi      4
			eq?     
			bnt      code_0d21
			lofsa    {I am old and my hearing fails me, I am ill and wonder when death will come for me, my mouth is dry.__What would you give me?}
			sal      local17
			jmp      code_0dc3
code_0d21:
			dup     
			ldi      5
			eq?     
			bnt      code_0d30
			lofsa    {I must go into battle where I may well be wounded.__Then I will know great thirst and my eyes will burn.}
			sal      local17
			jmp      code_0dc3
code_0d30:
			dup     
			ldi      6
			eq?     
			bnt      code_0d3f
			lofsa    {Sadness weighs upon my soul.__My heart aches to be filled.__Would that I could steal into my love's chamber unseen.}
			sal      local17
			jmp      code_0dc3
code_0d3f:
			dup     
			ldi      7
			eq?     
			bnt      code_0d4e
			lofsa    {I have three fears:__I fear travelling by ship;__I fear my wife will be unfaithful:__I fear the lies of men.__What should I take with me?}
			sal      local17
			jmp      code_0dc3
code_0d4e:
			dup     
			ldi      8
			eq?     
			bnt      code_0d5d
			lofsa    {I'll build a ship to carry me skyward.__If it falls, I'll not be harmed.__But I will never tell how it is done.__What do I have?}
			sal      local17
			jmp      code_0dc3
code_0d5d:
			dup     
			ldi      9
			eq?     
			bnt      code_0d6c
			lofsa    {A piece of sky fell to my feet and I picked it up.__Where it touched me, it raised boils.__I fear it poisons me.__What would you give me?}
			sal      local17
			jmp      code_0dc3
code_0d6c:
			dup     
			ldi      10
			eq?     
			bnt      code_0d7b
			lofsa    {My trees are heavy with fruit, my heart is full of all desires, and my wife gives birth to a holy child.__What do I have?}
			sal      local17
			jmp      code_0dc3
code_0d7b:
			dup     
			ldi      11
			eq?     
			bnt      code_0d8a
			lofsa    {The drought lengthens, the corn withers in my field, and a witch curses me with a glance.__What would you give me?}
			sal      local17
			jmp      code_0dc3
code_0d8a:
			dup     
			ldi      12
			eq?     
			bnt      code_0d99
			lofsa    {I must ride upon a fiery horse, through valleys filled with adders and seek the fate that awaits me.__What should I take with me?}
			sal      local17
			jmp      code_0dc3
code_0d99:
			dup     
			ldi      13
			eq?     
			bnt      code_0da8
			lofsa    {In summer, my ice does not melt.__The red eye becomes clear.__Demons run when I raise my hand.__What do I have?}
			sal      local17
			jmp      code_0dc3
code_0da8:
			dup     
			ldi      14
			eq?     
			bnt      code_0db7
			lofsa    {Alas, sadness clothes me like a leaden cloak.__A wicked woman lies to me, but I fear danger will come upon me by surprise.__What would you give me?}
			sal      local17
			jmp      code_0dc3
code_0db7:
			dup     
			ldi      15
			eq?     
			bnt      code_0dc3
			lofsa    {I lie dying, cut deeply by the sword, my flesh burns, spirits of Hades hover to take my soul.__What would you give me?}
			sal      local17
code_0dc3:
			toss    
			ldi      2
			aTop     cycles
			jmp      code_0df0
code_0dcb:
			dup     
			ldi      1
			eq?     
			bnt      code_0df0
			pushi    11
			lsl      local17
			pushi    100
			pushi    50
			pushi    10
			pushi    106
			pushi    200
			pushi    102
			pushi    255
			pushi    103
			pushi    0
			pushi    107
			callk    Display,  22
			sal      local16
code_0df0:
			toss    
			ret     
		)
	)
)

(instance wrongAns of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e71
			ldi      21
			sag      global145
			lofsa    {_____________________________________________________________________________________________________}
			sal      local17
			pushi    4
			pushi    621
			pushi    0
			pushi    108
			lsl      local16
			callk    Display,  8
			pushi    1
			pushi    149
			callb    proc0_6,  2
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
			jmp      code_0e85
code_0e71:
			dup     
			ldi      1
			eq?     
			bnt      code_0e85
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    gems_room
			send     4
code_0e85:
			toss    
			ret     
		)
	)
)

(instance rightAns of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			pushi    0
			call     localproc_00b7,  0
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
			bnt      code_0f70
			lsl      local14
			dup     
			ldi      1
			eq?     
			bnt      code_0f02
			pushi    #disable
			pushi    1
			pushi    8
			lag      global69
			send     6
			pushi    4
			pushi    1
			lea      @local37
			push    
			pushi    11
			pushi    2
			calle    proc851_0,  8
			jmp      code_0f6f
code_0f02:
			dup     
			ldi      2
			eq?     
			bnt      code_0f1c
			pushi    4
			pushi    1
			lea      @local41
			push    
			pushi    11
			pushi    2
			calle    proc851_0,  8
			jmp      code_0f6f
code_0f1c:
			dup     
			ldi      3
			eq?     
			bnt      code_0f6f
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			lsl      local15
			dup     
			ldi      0
			eq?     
			bnt      code_0f45
			pushi    #setScript
			pushi    1
			lofsa    oneRiddle
			push    
			lag      global2
			send     6
			jmp      code_0f6e
code_0f45:
			dup     
			ldi      1
			eq?     
			bnt      code_0f5b
			pushi    #setScript
			pushi    1
			lofsa    twoRiddle
			push    
			lag      global2
			send     6
			jmp      code_0f6e
code_0f5b:
			dup     
			ldi      2
			eq?     
			bnt      code_0f6e
			pushi    #setScript
			pushi    1
			lofsa    threeRiddle
			push    
			lag      global2
			send     6
code_0f6e:
			toss    
code_0f6f:
			toss    
code_0f70:
			toss    
			ret     
		)
	)
)

(instance oneRiddle of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			pushi    0
			call     localproc_00b7,  0
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
			bnt      code_0ff0
			ldi      0
			sal      local14
			lofsa    {_____________________________________________________________________________________________________}
			sal      local17
			pushi    4
			pushi    621
			pushi    0
			pushi    108
			lsl      local16
			callk    Display,  8
			pushi    4
			pushi    1
			lea      @local25
			push    
			pushi    11
			pushi    2
			calle    proc851_0,  8
			+al      local13
			+al      local15
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
			jmp      code_1003
code_0ff0:
			dup     
			ldi      1
			eq?     
			bnt      code_1003
			pushi    #setScript
			pushi    1
			lofsa    doTheRiddles
			push    
			lag      global2
			send     6
code_1003:
			toss    
			ret     
		)
	)
)

(instance twoRiddle of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			pushi    0
			call     localproc_00b7,  0
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
			bnt      code_1092
			ldi      0
			sal      local14
			lofsa    {_____________________________________________________________________________________________________}
			sal      local17
			pushi    4
			pushi    621
			pushi    0
			pushi    108
			lsl      local16
			callk    Display,  8
			pushi    4
			pushi    1
			lea      @local29
			push    
			pushi    11
			pushi    2
			calle    proc851_0,  8
			+al      local13
			+al      local15
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
			jmp      code_10a5
code_1092:
			dup     
			ldi      1
			eq?     
			bnt      code_10a5
			pushi    #setScript
			pushi    1
			lofsa    doTheRiddles
			push    
			lag      global2
			send     6
code_10a5:
			toss    
			ret     
		)
	)
)

(instance threeRiddle of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    Script,  4
			pushi    0
			call     localproc_00b7,  0
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
			bnt      code_112e
			lofsa    {_____________________________________________________________________________________________________}
			sal      local17
			pushi    4
			pushi    621
			pushi    0
			pushi    108
			lsl      local16
			callk    Display,  8
			pushi    #backFromJewels
			pushi    1
			pushi    1
			class    Monastery
			send     6
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
			jmp      code_113d
code_112e:
			dup     
			ldi      1
			eq?     
			bnt      code_113d
			pushi    #dispose
			pushi    0
			lofsa    gems_room
			send     4
code_113d:
			toss    
			ret     
		)
	)
)
