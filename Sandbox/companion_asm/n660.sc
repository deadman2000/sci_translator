;;; Sierra Script 1.0 - (do not remove this comment)
(script# 660)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n946)
(use n950)
(use n998)
(use n999)

(public
	scrolls 0
)

(local
	local0
	local1
	local2
	local3
)
(procedure (localproc_0062 param1 param2)
	(asm
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    hideMe
		push    
		lag      global5
		send     8
		lag      global5
		sal      local0
		lag      global32
		sal      local1
		lag      global10
		sal      local2
		lag      global73
		sal      local3
		ldi      0
		sag      global10
		sag      global32
		sag      global5
		sag      global73
		pushi    #drawPic
		pushi    2
		lsp      param1
		lsp      param2
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

(procedure (localproc_00b6)
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
		pushi    #dispose
		pushi    0
		lag      global32
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
		lal      local0
		sag      global5
		lal      local1
		sag      global32
		pushi    #doit
		pushi    0
		lal      local2
		sag      global10
		send     4
		lal      local3
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

(instance scrolls of Code
	(properties)
	
	(method (doit)
		(asm
			pushi    #message
			pushi    1
			pushi    11
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			pushi    #disable
			pushi    5
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     14
			pushi    2
			pushi    660
			pushi    10
			call     localproc_0062,  4
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_01bb
			pushi    #init
			pushi    0
			lofsa    emptyATP
			send     4
code_01bb:
			pushi    #add
			pushi    24
			lofsa    wholeRoom
			push    
			lofsa    one
			push    
			lofsa    two
			push    
			lofsa    three
			push    
			lofsa    four
			push    
			lofsa    five
			push    
			lofsa    six
			push    
			lofsa    seven
			push    
			lofsa    eight
			push    
			lofsa    scroll1
			push    
			lofsa    scroll2
			push    
			lofsa    scroll3
			push    
			lofsa    scroll4
			push    
			lofsa    scroll5
			push    
			lofsa    scroll6
			push    
			lofsa    scroll7
			push    
			lofsa    scroll8
			push    
			lofsa    scroll9
			push    
			lofsa    scroll10
			push    
			lofsa    scroll11
			push    
			lofsa    scroll12
			push    
			lofsa    scroll13
			push    
			lofsa    scroll14
			push    
			lofsa    scroll15
			push    
			pushi    116
			pushi    1
			pushi    107
			lag      global32
			send     58
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    0
			call     localproc_00b6,  0
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			pushi    #enable
			pushi    3
			dup     
			pushi    6
			pushi    7
			lag      global69
			send     10
			pushi    1
			pushi    660
			callk    DisposeScript,  2
			ret     
		)
	)
)

(class scrollSlots of Feature
	(properties
		x 10
		y 10
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_028b
			pushi    2
			pushi    1660
			pushi    0
			calle    proc13_4,  4
			jmp      code_02bb
code_028b:
			dup     
			ldi      3
			eq?     
			bnt      code_029e
			pushi    2
			pushi    1660
			pushi    1
			calle    proc13_4,  4
			jmp      code_02bb
code_029e:
			dup     
			ldi      11
			eq?     
			bnt      code_02b0
			pushi    #dispose
			pushi    0
			lofsa    scrolls
			send     4
			jmp      code_02bb
code_02b0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_02bb:
			toss    
			ret     
		)
	)
)

(instance one of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    63
			pushi    40
			pushi    67
			pushi    40
			pushi    79
			pushi    50
			pushi    62
			pushi    63
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
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance two of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    6
			pushi    63
			pushi    83
			pushi    78
			pushi    94
			pushi    62
			pushi    108
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     26
			pushi    #init
			pushi    0
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance three of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    62
			pushi    126
			pushi    65
			pushi    128
			pushi    68
			pushi    136
			pushi    73
			pushi    138
			pushi    76
			pushi    135
			pushi    78
			pushi    137
			pushi    66
			pushi    146
			pushi    62
			pushi    146
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
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance four of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    6
			pushi    75
			pushi    146
			pushi    82
			pushi    140
			pushi    91
			pushi    146
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     26
			pushi    #init
			pushi    0
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance five of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    131
			pushi    145
			pushi    138
			pushi    139
			pushi    149
			pushi    146
			pushi    130
			pushi    146
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
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance six of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    109
			pushi    118
			pushi    114
			pushi    121
			pushi    109
			pushi    121
			pushi    108
			pushi    124
			pushi    113
			pushi    130
			pushi    124
			pushi    130
			pushi    135
			pushi    137
			pushi    124
			pushi    146
			pushi    99
			pushi    146
			pushi    88
			pushi    136
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
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance seven of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    263
			pushi    40
			pushi    263
			pushi    74
			pushi    254
			pushi    83
			pushi    229
			pushi    64
			pushi    259
			pushi    40
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
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance eight of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    138
			pushi    89
			pushi    115
			pushi    71
			pushi    133
			pushi    57
			pushi    135
			pushi    60
			pushi    151
			pushi    58
			pushi    164
			pushi    68
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
			super    scrollSlots,  4
			ret     
		)
	)
)

(instance scroll1 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    128
			pushi    40
			pushi    139
			pushi    47
			pushi    134
			pushi    50
			pushi    132
			pushi    50
			pushi    130
			pushi    52
			pushi    129
			pushi    55
			pushi    112
			pushi    69
			pushi    87
			pushi    51
			pushi    101
			pushi    40
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0764
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    1
			lag      global2
			send     10
			jmp      code_0788
code_0764:
			dup     
			ldi      3
			eq?     
			bnt      code_077d
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    1
			lag      global2
			send     10
			jmp      code_0788
code_077d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0788:
			toss    
			ret     
		)
	)
)

(instance scroll2 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    30
			pushi    188
			pushi    40
			pushi    194
			pushi    43
			pushi    168
			pushi    65
			pushi    166
			pushi    63
			pushi    163
			pushi    63
			pushi    159
			pushi    62
			pushi    156
			pushi    56
			pushi    137
			pushi    60
			pushi    134
			pushi    57
			pushi    131
			pushi    56
			pushi    129
			pushi    54
			pushi    131
			pushi    51
			pushi    144
			pushi    51
			pushi    144
			pushi    49
			pushi    155
			pushi    40
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     74
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_084f
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    2
			lag      global2
			send     10
			jmp      code_0873
code_084f:
			dup     
			ldi      3
			eq?     
			bnt      code_0868
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    2
			lag      global2
			send     10
			jmp      code_0873
code_0868:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0873:
			toss    
			ret     
		)
	)
)

(instance scroll3 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    253
			pushi    40
			pushi    225
			pushi    62
			pushi    201
			pushi    44
			pushi    206
			pushi    40
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0905
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    3
			lag      global2
			send     10
			jmp      code_092a
code_0905:
			dup     
			ldi      3
			eq?     
			bnt      code_091f
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    3
			lag      global2
			send     10
			jmp      code_092a
code_091f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_092a:
			toss    
			ret     
		)
	)
)

(instance scroll4 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    107
			pushi    72
			pushi    82
			pushi    92
			pushi    62
			pushi    78
			pushi    62
			pushi    67
			pushi    82
			pushi    53
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_09bb
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    4
			lag      global2
			send     10
			jmp      code_09e0
code_09bb:
			dup     
			ldi      3
			eq?     
			bnt      code_09d5
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    4
			lag      global2
			send     10
			jmp      code_09e0
code_09d5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_09e0:
			toss    
			ret     
		)
	)
)

(instance scroll5 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    222
			pushi    65
			pushi    213
			pushi    72
			pushi    206
			pushi    72
			pushi    204
			pushi    74
			pushi    201
			pushi    78
			pushi    186
			pushi    78
			pushi    172
			pushi    67
			pushi    197
			pushi    46
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a85
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    5
			lag      global2
			send     10
			jmp      code_0aaa
code_0a85:
			dup     
			ldi      3
			eq?     
			bnt      code_0a9f
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    5
			lag      global2
			send     10
			jmp      code_0aaa
code_0a9f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0aaa:
			toss    
			ret     
		)
	)
)

(instance scroll6 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    133
			pushi    92
			pushi    129
			pushi    92
			pushi    128
			pushi    93
			pushi    128
			pushi    98
			pushi    108
			pushi    112
			pushi    85
			pushi    94
			pushi    110
			pushi    74
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b47
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    6
			lag      global2
			send     10
			jmp      code_0b6c
code_0b47:
			dup     
			ldi      3
			eq?     
			bnt      code_0b61
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    6
			lag      global2
			send     10
			jmp      code_0b6c
code_0b61:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0b6c:
			toss    
			ret     
		)
	)
)

(instance scroll7 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    26
			pushi    180
			pushi    79
			pushi    184
			pushi    87
			pushi    189
			pushi    87
			pushi    192
			pushi    89
			pushi    167
			pushi    109
			pushi    154
			pushi    101
			pushi    139
			pushi    101
			pushi    133
			pushi    103
			pushi    128
			pushi    99
			pushi    128
			pushi    94
			pushi    129
			pushi    92
			pushi    142
			pushi    92
			pushi    168
			pushi    70
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     66
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c2a
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    7
			lag      global2
			send     10
			jmp      code_0c4f
code_0c2a:
			dup     
			ldi      3
			eq?     
			bnt      code_0c44
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    7
			lag      global2
			send     10
			jmp      code_0c4f
code_0c44:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0c4f:
			toss    
			ret     
		)
	)
)

(instance scroll8 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    251
			pushi    86
			pushi    248
			pushi    87
			pushi    226
			pushi    87
			pushi    219
			pushi    91
			pushi    208
			pushi    91
			pushi    204
			pushi    87
			pushi    184
			pushi    87
			pushi    180
			pushi    78
			pushi    202
			pushi    78
			pushi    206
			pushi    72
			pushi    218
			pushi    72
			pushi    225
			pushi    67
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     62
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d09
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    8
			lag      global2
			send     10
			jmp      code_0d2e
code_0d09:
			dup     
			ldi      3
			eq?     
			bnt      code_0d23
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    8
			lag      global2
			send     10
			jmp      code_0d2e
code_0d23:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0d2e:
			toss    
			ret     
		)
	)
)

(instance scroll9 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    24
			pushi    225
			pushi    107
			pushi    213
			pushi    99
			pushi    202
			pushi    99
			pushi    198
			pushi    97
			pushi    199
			pushi    93
			pushi    205
			pushi    92
			pushi    200
			pushi    88
			pushi    203
			pushi    87
			pushi    208
			pushi    91
			pushi    218
			pushi    91
			pushi    226
			pushi    87
			pushi    250
			pushi    87
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     62
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0de7
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    9
			lag      global2
			send     10
			jmp      code_0e0c
code_0de7:
			dup     
			ldi      3
			eq?     
			bnt      code_0e01
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    9
			lag      global2
			send     10
			jmp      code_0e0c
code_0e01:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0e0c:
			toss    
			ret     
		)
	)
)

(instance scroll10 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    105
			pushi    115
			pushi    79
			pushi    136
			pushi    70
			pushi    137
			pushi    66
			pushi    132
			pushi    67
			pushi    124
			pushi    63
			pushi    121
			pushi    63
			pushi    112
			pushi    81
			pushi    97
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0eac
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    10
			lag      global2
			send     10
			jmp      code_0ed1
code_0eac:
			dup     
			ldi      3
			eq?     
			bnt      code_0ec6
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    10
			lag      global2
			send     10
			jmp      code_0ed1
code_0ec6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0ed1:
			toss    
			ret     
		)
	)
)

(instance scroll11 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    22
			pushi    164
			pushi    112
			pushi    139
			pushi    134
			pushi    135
			pushi    131
			pushi    113
			pushi    130
			pushi    109
			pushi    123
			pushi    122
			dup     
			pushi    112
			pushi    114
			pushi    130
			pushi    101
			pushi    133
			pushi    103
			pushi    138
			pushi    101
			pushi    148
			pushi    101
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     58
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0f84
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    11
			lag      global2
			send     10
			jmp      code_0fa9
code_0f84:
			dup     
			ldi      3
			eq?     
			bnt      code_0f9e
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    11
			lag      global2
			send     10
			jmp      code_0fa9
code_0f9e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_0fa9:
			toss    
			ret     
		)
	)
)

(instance scroll12 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    223
			pushi    111
			pushi    198
			pushi    133
			pushi    171
			pushi    112
			pushi    196
			pushi    91
			pushi    199
			pushi    93
			pushi    198
			pushi    97
			pushi    201
			pushi    99
			pushi    207
			pushi    99
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1050
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    12
			lag      global2
			send     10
			jmp      code_1075
code_1050:
			dup     
			ldi      3
			eq?     
			bnt      code_106a
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    12
			lag      global2
			send     10
			jmp      code_1075
code_106a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_1075:
			toss    
			ret     
		)
	)
)

(instance scroll13 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    263
			pushi    96
			pushi    263
			pushi    128
			pushi    256
			pushi    133
			pushi    244
			pushi    123
			pushi    234
			pushi    124
			pushi    229
			pushi    121
			pushi    237
			pushi    118
			pushi    229
			pushi    111
			pushi    254
			pushi    88
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1122
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    13
			lag      global2
			send     10
			jmp      code_1147
code_1122:
			dup     
			ldi      3
			eq?     
			bnt      code_113c
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    13
			lag      global2
			send     10
			jmp      code_1147
code_113c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_1147:
			toss    
			ret     
		)
	)
)

(instance scroll14 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    10
			pushi    194
			pushi    136
			pushi    184
			pushi    146
			pushi    156
			pushi    146
			pushi    142
			pushi    136
			pushi    167
			pushi    116
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     34
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11fc
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			not     
			bnt      code_11f0
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    14
			lag      global2
			send     10
			jmp      code_123b
code_11f0:
			pushi    2
			pushi    1660
			pushi    0
			calle    proc13_4,  4
			jmp      code_123b
code_11fc:
			dup     
			ldi      3
			eq?     
			bnt      code_1230
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			not     
			bnt      code_1224
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    14
			lag      global2
			send     10
			jmp      code_123b
code_1224:
			pushi    2
			pushi    1660
			pushi    1
			calle    proc13_4,  4
			jmp      code_123b
code_1230:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_123b:
			toss    
			ret     
		)
	)
)

(instance scroll15 of scrollSlots
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    231
			pushi    119
			pushi    229
			pushi    121
			pushi    233
			pushi    125
			pushi    238
			pushi    124
			pushi    253
			pushi    137
			pushi    242
			pushi    146
			pushi    203
			pushi    146
			pushi    199
			pushi    142
			pushi    200
			pushi    136
			pushi    225
			pushi    113
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     54
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_12f0
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    15
			lag      global2
			send     10
			jmp      code_1315
code_12f0:
			dup     
			ldi      3
			eq?     
			bnt      code_130a
			pushi    #setScript
			pushi    3
			lofsa    showScroll
			push    
			pushi    0
			pushi    15
			lag      global2
			send     10
			jmp      code_1315
code_130a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    scrollSlots,  6
code_1315:
			toss    
			ret     
		)
	)
)

(instance wholeRoom of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      11
			eq?     
			bnt      code_1374
			pushi    #dispose
			pushi    0
			lofsa    scrolls
			send     4
			jmp      code_137f
code_1374:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_137f:
			toss    
			ret     
		)
	)
)

(instance scrollATP of View
	(properties
		x 35
		y 35
		view 771
		cel 3
		priority 15
	)
)

(instance emptyATP of View
	(properties
		x 152
		y 138
		view 660
		priority 15
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1437
			pushi    2
			pushi    1660
			pushi    0
			calle    proc13_4,  4
			jmp      code_1455
code_1437:
			dup     
			ldi      3
			eq?     
			bnt      code_144a
			pushi    2
			pushi    1660
			pushi    1
			calle    proc13_4,  4
			jmp      code_1455
code_144a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_1455:
			toss    
			ret     
		)
	)
)

(instance showScroll of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14fc
			pTos     register
			ldi      14
			eq?     
			bnt      code_14e4
			pushi    #cel
			pushi    1
			pushi    5
			pushi    85
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    scrollATP
			send     16
			jmp      code_14f5
code_14e4:
			pushi    #cel
			pushi    1
			pushi    3
			pushi    85
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    scrollATP
			send     16
code_14f5:
			ldi      1
			aTop     cycles
			jmp      code_18b5
code_14fc:
			dup     
			ldi      1
			eq?     
			bnt      code_18a1
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_1540
			pushi    2
			pushi    1660
			pushi    2
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    3
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    4
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    5
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    6
			calle    proc13_5,  4
			jmp      code_1899
code_1540:
			dup     
			ldi      2
			eq?     
			bnt      code_1586
			pushi    2
			pushi    1660
			pushi    7
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    8
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    9
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    10
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    11
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    12
			calle    proc13_5,  4
			jmp      code_1899
code_1586:
			dup     
			ldi      3
			eq?     
			bnt      code_15b8
			pushi    2
			pushi    1660
			pushi    13
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    14
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    15
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    16
			calle    proc13_5,  4
			jmp      code_1899
code_15b8:
			dup     
			ldi      4
			eq?     
			bnt      code_15fe
			pushi    2
			pushi    1660
			pushi    17
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    18
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    19
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    20
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    21
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    22
			calle    proc13_5,  4
			jmp      code_1899
code_15fe:
			dup     
			ldi      5
			eq?     
			bnt      code_1644
			pushi    2
			pushi    1660
			pushi    23
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    24
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    25
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    26
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    27
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    28
			calle    proc13_5,  4
			jmp      code_1899
code_1644:
			dup     
			ldi      6
			eq?     
			bnt      code_1680
			pushi    2
			pushi    1660
			pushi    29
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    30
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    31
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    32
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    33
			calle    proc13_5,  4
			jmp      code_1899
code_1680:
			dup     
			ldi      7
			eq?     
			bnt      code_16e4
			pushi    2
			pushi    1660
			pushi    34
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    35
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    36
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    37
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    38
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    39
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    40
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    41
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    42
			calle    proc13_5,  4
			jmp      code_1899
code_16e4:
			dup     
			ldi      8
			eq?     
			bnt      code_1720
			pushi    2
			pushi    1660
			pushi    43
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    44
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    45
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    46
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    47
			calle    proc13_5,  4
			jmp      code_1899
code_1720:
			dup     
			ldi      9
			eq?     
			bnt      code_1752
			pushi    2
			pushi    1660
			pushi    48
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    49
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    50
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    51
			calle    proc13_5,  4
			jmp      code_1899
code_1752:
			dup     
			ldi      10
			eq?     
			bnt      code_177a
			pushi    2
			pushi    1660
			pushi    52
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    53
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    54
			calle    proc13_5,  4
			jmp      code_1899
code_177a:
			dup     
			ldi      11
			eq?     
			bnt      code_17a2
			pushi    2
			pushi    1660
			pushi    55
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    56
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    57
			calle    proc13_5,  4
			jmp      code_1899
code_17a2:
			dup     
			ldi      12
			eq?     
			bnt      code_17e8
			pushi    2
			pushi    1660
			pushi    58
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    59
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    60
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    61
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    62
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    63
			calle    proc13_5,  4
			jmp      code_1899
code_17e8:
			dup     
			ldi      13
			eq?     
			bnt      code_1824
			pushi    2
			pushi    1660
			pushi    64
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    65
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    66
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    67
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    68
			calle    proc13_5,  4
			jmp      code_1899
code_1824:
			dup     
			ldi      14
			eq?     
			bnt      code_1860
			pushi    2
			pushi    1660
			pushi    69
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    70
			calle    proc13_5,  4
			pushi    #init
			pushi    0
			lofsa    emptyATP
			send     4
			pushi    #get
			pushi    1
			pushi    17
			lag      global0
			send     6
			pushi    2
			pushi    100
			pushi    142
			calle    proc806_1,  4
			jmp      code_1899
code_1860:
			dup     
			ldi      15
			eq?     
			bnt      code_1899
			pushi    2
			pushi    1660
			pushi    71
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    72
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    73
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    74
			calle    proc13_5,  4
			pushi    2
			pushi    1660
			pushi    75
			calle    proc13_5,  4
code_1899:
			toss    
			ldi      1
			aTop     cycles
			jmp      code_18b5
code_18a1:
			dup     
			ldi      2
			eq?     
			bnt      code_18b5
			pushi    #dispose
			pushi    0
			lofsa    scrollATP
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_18b5:
			toss    
			ret     
		)
	)
)
