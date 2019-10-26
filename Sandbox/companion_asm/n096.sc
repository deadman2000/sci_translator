;;; Sierra Script 1.0 - (do not remove this comment)
(script# 96)
(include sci.sh)
(use n000)
(use n255)
(use n806)
(use n939)
(use n958)
(use n967)
(use n994)
(use n998)
(use n999)

(public
	cred 0
)

(local
	local0
	local1
	local2
	local3 =  114
	local4 =  26
	local5
	local6
	[local7 2]
	local9
)
(instance cred of Rm
	(properties
		picture 95
		style $000f
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    #prevSignal
			pushi    1
			pushi    0
			lag      global100
			send     6
			pushi    #add
			pushi    1
			lofsa    theMumble
			push    
			lag      global73
			send     6
			pushi    #add
			pushi    1
			lofsa    theMumble
			push    
			lag      global72
			send     6
			pushi    5
			pushi    129
			pushi    95
			pushi    905
			pushi    803
			pushi    96
			calle    proc958_0,  10
			pushi    4
			pushi    128
			pushi    95
			pushi    905
			pushi    906
			calle    proc958_0,  8
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_0068
			ldi      10
			sal      local9
			jmp      code_006d
code_0068:
			ldi      32774
			sal      local9
code_006d:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #number
			pushi    1
			pushi    905
			pushi    42
			pushi    0
			lag      global168
			send     10
			pushi    1
			lofsa    bowPiece
			push    
			calle    proc806_2,  2
			pushi    #setPri
			pushi    1
			pushi    13
			pushi    107
			pushi    0
			lofsa    hand
			send     10
			pushi    #setPri
			pushi    1
			pushi    13
			pushi    107
			pushi    0
			lofsa    grin
			send     10
			pushi    #setPri
			pushi    1
			pushi    13
			pushi    107
			pushi    0
			lofsa    arrow
			send     10
			pushi    8
			pushi    4
			pushi    63
			pushi    67
			pushi    0
			pushi    130
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    63
			pushi    66
			pushi    0
			pushi    129
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    71
			pushi    68
			pushi    189
			pushi    127
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    71
			pushi    67
			pushi    189
			pushi    126
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    #setScript
			pushi    1
			lofsa    theMumble
			push    
			self     6
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			+al      local6
			ldi      3
			sat      temp0
			lal      local5
			bnt      code_0137
			lsl      local6
			ldi      8
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0137
			pushi    4
			pushi    6
			pushi    241
			pushi    255
			pushi    65535
			callk    Palette,  8
code_0137:
			lsl      local6
			ldi      80
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0173
			pushi    4
			pushi    6
			pushi    216
			pushi    218
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    233
			pushi    235
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    225
			pushi    227
			lst      temp0
			callk    Palette,  8
			jmp      code_0260
code_0173:
			lsl      local6
			ldi      80
			mod     
			push    
			ldi      16
			eq?     
			bnt      code_01af
			pushi    4
			pushi    6
			pushi    217
			pushi    219
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    234
			pushi    236
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    227
			pushi    229
			lst      temp0
			callk    Palette,  8
			jmp      code_0260
code_01af:
			lsl      local6
			ldi      80
			mod     
			push    
			ldi      32
			eq?     
			bnt      code_01eb
			pushi    4
			pushi    6
			pushi    218
			pushi    220
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    235
			pushi    237
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    228
			pushi    230
			lst      temp0
			callk    Palette,  8
			jmp      code_0260
code_01eb:
			lsl      local6
			ldi      80
			mod     
			push    
			ldi      48
			eq?     
			bnt      code_0227
			pushi    4
			pushi    6
			pushi    219
			pushi    221
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    236
			pushi    238
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    229
			pushi    231
			lst      temp0
			callk    Palette,  8
			jmp      code_0260
code_0227:
			lsl      local6
			ldi      80
			mod     
			push    
			ldi      64
			eq?     
			bnt      code_0260
			pushi    4
			pushi    6
			pushi    220
			pushi    222
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    237
			pushi    239
			lst      temp0
			callk    Palette,  8
			pushi    4
			pushi    6
			pushi    230
			pushi    232
			lst      temp0
			callk    Palette,  8
code_0260:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    102
			pushi    #superClass
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      1
			or      
			push    
			lag      global100
			send     6
			pushi    #delete
			pushi    1
			lofsa    theMumble
			push    
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			lofsa    theMumble
			push    
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance bowPiece of PicView
	(properties
		x 216
		y 100
		view 95
		loop 3
		priority 15
		signal $4000
	)
)

(instance quitIcon of DCIcon
	(properties
		view 903
		cycleSpeed 18
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    2
			pushSelf
			pushi    1
			pushi    #new
			pushi    0
			class    Osc
			send     4
			aTop     cycler
			send     8
			ret     
		)
	)
)

(instance hand of Prop
	(properties
		x 44
		y 63
		view 95
		signal $4000
	)
)

(instance grin of Prop
	(properties
		x 99
		y 77
		view 95
		loop 1
		signal $4000
	)
)

(instance arrow of Actor
	(properties
		x 69
		y 67
		view 95
		loop 2
		signal $4000
	)
)

(instance titleName of PicView
	(properties
		x 45
		y 93
		view 905
	)
)

(instance NWview of PicView
	(properties
		view 905
	)
)

(instance NEview of PicView
	(properties
		x 258
		y 41
		view 906
	)
)

(instance SWview of PicView
	(properties
		x 63
		y 154
		view 906
		cel 4
	)
)

(instance theMumble of Script
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #prevSignal
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_0607
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    95
			lag      global2
			send     6
code_0607:
			pushi    #doit
			pushi    0
			&rest    param1
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
			bnt      code_06bd
			pushi    0
			callb    proc0_3,  0
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			ldi      3
			aTop     seconds
			jmp      code_0c47
code_06bd:
			dup     
			ldi      1
			eq?     
			bnt      code_06d2
			pushi    #setScript
			pushi    2
			lofsa    bowString
			push    
			pushSelf
			self     8
			jmp      code_0c47
code_06d2:
			dup     
			ldi      2
			eq?     
			bnt      code_06e0
			ldi      30
			aTop     ticks
			jmp      code_0c47
code_06e0:
			dup     
			ldi      3
			eq?     
			bnt      code_06ff
			pushi    #number
			pushi    1
			pushi    908
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			ldi      30
			aTop     ticks
			jmp      code_0c47
code_06ff:
			dup     
			ldi      4
			eq?     
			bnt      code_0717
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    grin
			send     6
			ldi      24
			aTop     ticks
			jmp      code_0c47
code_0717:
			dup     
			ldi      5
			eq?     
			bnt      code_0854
			pushi    #drawPic
			pushi    1
			pushi    95
			lag      global2
			send     6
			pushi    #init
			pushi    0
			lofsa    grin
			send     4
			pushi    8
			pushi    4
			pushi    0
			pushi    142
			pushi    38
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    0
			pushi    141
			pushi    38
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    47
			pushi    142
			pushi    65
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    46
			pushi    141
			pushi    66
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    72
			pushi    142
			pushi    78
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    73
			pushi    141
			pushi    86
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    82
			pushi    142
			pushi    85
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    107
			pushi    142
			pushi    131
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    107
			pushi    141
			pushi    160
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    148
			pushi    142
			pushi    160
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    168
			pushi    142
			pushi    189
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    168
			pushi    141
			pushi    189
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    #overlay
			pushi    1
			pushi    96
			lag      global2
			send     6
			pushi    1
			pushi    0
			callk    Animate,  2
			ldi      60
			aTop     ticks
			jmp      code_0c47
code_0854:
			dup     
			ldi      6
			eq?     
			bnt      code_08d0
code_085b:
			pushi    #setCursor
			pushi    4
			pushi    999
			pushi    1
			pushi    293
			pushi    168
			lag      global1
			send     12
			pushi    17
			pushi    96
			pushi    0
			pushi    30
			pushi    1
			pushi    81
			lofsa    {___Start____}
			push    
			pushi    1
			pushi    81
			lofsa    {__Restore___}
			push    
			pushi    2
			pushi    81
			lofsa    {Introduction}
			push    
			pushi    3
			pushi    82
			lofsa    quitIcon
			push    
			pushi    1
			pushi    0
			calle    proc255_0,  34
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_08aa
			pushi    #restart
			pushi    0
			lag      global1
			send     4
			jmp      code_08c9
code_08aa:
			dup     
			ldi      2
			eq?     
			bnt      code_08bb
			pushi    #restore
			pushi    0
			lag      global1
			send     4
			jmp      code_08c9
code_08bb:
			dup     
			ldi      3
			eq?     
			bnt      code_08c9
			pushi    #cue
			pushi    0
			self     4
			ret     
code_08c9:
			toss    
			jmp      code_085b
			jmp      code_0c47
code_08d0:
			dup     
			ldi      7
			eq?     
			bnt      code_0908
			pushi    #setCursor
			pushi    1
			pushi    5
			lag      global1
			send     6
			pushi    43
			pushi    #superClass
			pushi    100
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      global100
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      global100
			send     24
			ldi      1
			sal      local5
			jmp      code_0c47
code_0908:
			dup     
			ldi      8
			eq?     
			bnt      code_0940
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			ldi      0
			sal      local5
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0940:
			dup     
			ldi      9
			eq?     
			bnt      code_0987
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    titleName
			send     6
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    SWview
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    NEview
			send     6
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0987:
			dup     
			ldi      10
			eq?     
			bnt      code_09ea
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    titleName
			send     6
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    93
			pushi    7
			pushi    1
			pushi    4
			lofsa    NWview
			send     18
			pushi    #cel
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    66
			lofsa    SWview
			send     12
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    NEview
			send     6
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    4
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  8
			jmp      code_0c47
code_09ea:
			dup     
			ldi      11
			eq?     
			bnt      code_0a52
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    93
			pushi    7
			pushi    1
			pushi    5
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    90
			pushi    3
			pushi    1
			pushi    131
			pushi    7
			pushi    1
			pushi    6
			lofsa    NWview
			send     18
			pushi    #x
			pushi    1
			pushi    268
			pushi    3
			pushi    1
			pushi    100
			pushi    7
			pushi    1
			pushi    2
			lofsa    SWview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0a52:
			dup     
			ldi      12
			eq?     
			bnt      code_0ad2
			pushi    #x
			pushi    1
			pushi    52
			pushi    3
			pushi    1
			pushi    89
			pushi    7
			pushi    1
			pushi    3
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    57
			pushi    3
			pushi    1
			pushi    91
			pushi    7
			pushi    1
			pushi    4
			lofsa    NWview
			send     18
			pushi    #x
			pushi    1
			pushi    280
			pushi    3
			pushi    1
			pushi    65
			pushi    7
			pushi    1
			pushi    2
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    49
			pushi    3
			pushi    1
			pushi    149
			pushi    7
			pushi    1
			pushi    5
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    4
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  8
			jmp      code_0c47
code_0ad2:
			dup     
			ldi      13
			eq?     
			bnt      code_0b3a
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    93
			pushi    7
			pushi    1
			pushi    7
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    256
			pushi    3
			pushi    1
			pushi    42
			pushi    7
			pushi    1
			pushi    0
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    150
			pushi    7
			pushi    1
			pushi    5
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0b3a:
			dup     
			ldi      14
			eq?     
			bnt      code_0bbb
			pushi    #x
			pushi    1
			pushi    41
			pushi    3
			pushi    1
			pushi    102
			pushi    7
			pushi    1
			pushi    8
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    161
			pushi    3
			pushi    1
			pushi    102
			pushi    7
			pushi    1
			pushi    9
			lofsa    NWview
			send     18
			pushi    #x
			pushi    1
			pushi    91
			pushi    3
			pushi    1
			pushi    43
			pushi    7
			pushi    1
			pushi    0
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    209
			pushi    3
			pushi    1
			pushi    155
			pushi    7
			pushi    1
			pushi    4
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    4
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  8
			jmp      code_0c47
code_0bbb:
			dup     
			ldi      15
			eq?     
			bnt      code_0c23
			pushi    #x
			pushi    1
			pushi    77
			pushi    3
			pushi    1
			pushi    90
			pushi    7
			pushi    1
			pushi    10
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    245
			pushi    3
			pushi    1
			pushi    43
			pushi    7
			pushi    1
			pushi    0
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    67
			pushi    3
			pushi    1
			pushi    150
			pushi    7
			pushi    1
			pushi    5
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0c23:
			dup     
			ldi      16
			eq?     
			bnt      code_0c2d
			jmp      code_0c47
code_0c2d:
			dup     
			ldi      17
			eq?     
			bnt      code_0c47
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    95
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0c47:
			toss    
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_061b
			ret     
code_061b:
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_063c
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
code_063c:
			bt       code_0658
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_066a
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
code_0658:
			bnt      code_066a
			pushi    #dispose
			pushi    0
			self     4
			pushi    #newRoom
			pushi    1
			pushi    95
			lag      global2
			send     6
code_066a:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bt       code_0691
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_069a
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0691:
			bnt      code_069a
			pushi    #cue
			pushi    0
			self     4
code_069a:
			ret     
		)
	)
)

(instance bowString of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cda
			pushi    #drawPic
			pushi    1
			pushi    95
			lag      global2
			send     6
			pushi    1
			lofsa    bowPiece
			push    
			calle    proc806_2,  2
			pushi    #posn
			pushi    2
			pushi    183
			pushi    84
			pushi    107
			pushi    0
			lofsa    arrow
			send     12
			pushi    #init
			pushi    0
			pushi    288
			pushi    1
			pushi    1
			lofsa    hand
			send     10
			pushi    #init
			pushi    0
			lofsa    grin
			send     4
			ldi      4
			aTop     ticks
			jmp      code_0ef3
code_0cda:
			dup     
			ldi      1
			eq?     
			bnt      code_0de2
			pushi    #dispose
			pushi    0
			lofsa    hand
			send     4
			pushi    #dispose
			pushi    0
			lofsa    arrow
			send     4
			pushi    6
			pushi    7
			pushi    0
			pushi    132
			pushi    189
			pushi    141
			pushi    1
			callk    Graph,  12
			sal      local0
			pushi    6
			pushi    7
			pushi    0
			pushi    143
			pushi    189
			pushi    151
			pushi    1
			callk    Graph,  12
			sal      local1
			pushi    8
			pushi    4
			pushi    30
			pushi    139
			pushi    159
			pushi    139
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    70
			pushi    136
			pushi    119
			pushi    136
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    90
			pushi    133
			pushi    99
			pushi    133
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    30
			pushi    144
			pushi    159
			pushi    144
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    70
			pushi    147
			pushi    119
			pushi    147
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    90
			pushi    150
			pushi    99
			pushi    150
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    0
			pushi    142
			pushi    189
			pushi    142
			lsl      local3
			pushi    1
			pushi    65535
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    0
			pushi    141
			pushi    189
			pushi    141
			lsl      local4
			pushi    1
			pushi    65535
			callk    Graph,  16
			pushi    5
			pushi    13
			pushi    0
			pushi    64
			pushi    189
			pushi    148
			callk    Graph,  10
			ldi      4
			aTop     ticks
			jmp      code_0ef3
code_0de2:
			dup     
			ldi      2
			eq?     
			bnt      code_0e33
			pushi    #number
			pushi    1
			pushi    906
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			pushi    2
			pushi    8
			lsl      local0
			callk    Graph,  4
			pushi    2
			pushi    8
			lsl      local1
			callk    Graph,  4
			pushi    5
			pushi    13
			pushi    0
			pushi    132
			pushi    189
			pushi    141
			callk    Graph,  10
			pushi    5
			pushi    13
			pushi    0
			pushi    143
			pushi    189
			pushi    151
			callk    Graph,  10
			ldi      4
			aTop     ticks
			jmp      code_0ef3
code_0e33:
			dup     
			ldi      3
			eq?     
			bnt      code_0ea7
			pushi    6
			pushi    7
			pushi    0
			pushi    132
			pushi    189
			pushi    141
			pushi    1
			callk    Graph,  12
			sal      local0
			pushi    6
			pushi    7
			pushi    0
			pushi    143
			pushi    189
			pushi    151
			pushi    1
			callk    Graph,  12
			sal      local1
			pushi    8
			pushi    4
			pushi    30
			pushi    139
			pushi    159
			pushi    139
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    30
			pushi    144
			pushi    159
			pushi    144
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    5
			pushi    13
			pushi    0
			pushi    64
			pushi    189
			pushi    148
			callk    Graph,  10
			ldi      4
			aTop     ticks
			jmp      code_0ef3
code_0ea7:
			dup     
			ldi      4
			eq?     
			bnt      code_0ee7
			pushi    2
			pushi    8
			lsl      local0
			callk    Graph,  4
			pushi    2
			pushi    8
			lsl      local1
			callk    Graph,  4
			pushi    5
			pushi    13
			pushi    0
			pushi    132
			pushi    189
			pushi    141
			callk    Graph,  10
			pushi    5
			pushi    13
			pushi    0
			pushi    143
			pushi    189
			pushi    151
			callk    Graph,  10
			ldi      4
			aTop     ticks
			jmp      code_0ef3
code_0ee7:
			dup     
			ldi      5
			eq?     
			bnt      code_0ef3
			pushi    #dispose
			pushi    0
			self     4
code_0ef3:
			toss    
			ret     
		)
	)
)
