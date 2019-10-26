;;; Sierra Script 1.0 - (do not remove this comment)
(script# 200)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n939)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	povGladeArchery 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7 =  1
	local8 =  1
	local9 =  1
	local10 =  1
	local11
	local12
	local13
	local14
	[local15 6]
	[local21 6]
	[local27 6]
	[local33 6]
	local39
	local40
	local41
	local42
	local43
	local44
	local45
	local46
	local47
	[local48 3] = [160 187 218]
	[local51 3] = [117 100 107]
	[local54 3] = [65 151 258]
	[local57 3] = [40 60 47]
	[local60 3] = [0 6 4]
	[local63 3] = [3 5 4]
	[local66 3] = [63 150 256]
	local69
	local70
	[local71 4] = [1200 0 1]
	[local75 4] = [1200 1 1]
	[local79 4] = [1200 2 1]
	[local83 4] = [1200 3 1]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		lsl      local70
		dup     
		ldi      0
		eq?     
		bnt      code_0036
		ldi      0
		sat      temp0
code_001d:
		lst      temp0
		lal      local12
		lt?     
		bnt      code_007b
		pushi    #hide
		pushi    0
		lat      temp0
		lali     local21
		send     4
		+at      temp0
		jmp      code_001d
		jmp      code_007b
code_0036:
		dup     
		ldi      1
		eq?     
		bnt      code_005a
		ldi      0
		sat      temp0
code_0041:
		lst      temp0
		lal      local13
		lt?     
		bnt      code_007b
		pushi    #hide
		pushi    0
		lat      temp0
		lali     local27
		send     4
		+at      temp0
		jmp      code_0041
		jmp      code_007b
code_005a:
		dup     
		ldi      2
		eq?     
		bnt      code_007b
		ldi      0
		sat      temp0
code_0065:
		lst      temp0
		lal      local14
		lt?     
		bnt      code_007b
		pushi    #hide
		pushi    0
		lat      temp0
		lali     local33
		send     4
		+at      temp0
		jmp      code_0065
code_007b:
		toss    
		ret     
	)
)

(procedure (localproc_007d)
	(asm
code_007d:
		-al      local11
		push    
		ldi      0
		ge?     
		bnt      code_0092
		pushi    #dispose
		pushi    0
		lal      local11
		lali     local15
		send     4
		jmp      code_007d
code_0092:
		ldi      0
		sal      local11
code_0096:
		-al      local12
		push    
		ldi      0
		ge?     
		bnt      code_00ab
		pushi    #dispose
		pushi    0
		lal      local12
		lali     local21
		send     4
		jmp      code_0096
code_00ab:
		ldi      0
		sal      local12
code_00af:
		-al      local13
		push    
		ldi      0
		ge?     
		bnt      code_00c4
		pushi    #dispose
		pushi    0
		lal      local13
		lali     local27
		send     4
		jmp      code_00af
code_00c4:
		ldi      0
		sal      local13
code_00c8:
		-al      local14
		push    
		ldi      0
		ge?     
		bnt      code_00dd
		pushi    #dispose
		pushi    0
		lal      local14
		lali     local33
		send     4
		jmp      code_00c8
code_00dd:
		ldi      0
		sal      local14
		ret     
	)
)

(procedure (localproc_00e2)
	(asm
		lsg      global125
		ldi      2
		eq?     
		bnt      code_00f6
		pushi    2
		pushi    0
		pushi    20
		callk    Random,  4
		sal      local45
		jmp      code_0100
code_00f6:
		pushi    2
		pushi    21
		pushi    100
		callk    Random,  4
		sal      local45
code_0100:
		lsl      local45
		ldi      80
		gt?     
		bnt      code_0112
		pushi    120
		lag      global125
		div     
		sal      local44
		jmp      code_0153
code_0112:
		lsl      local45
		ldi      60
		gt?     
		bnt      code_0125
		pushi    160
		lag      global125
		div     
		sal      local44
		jmp      code_0153
code_0125:
		lsl      local45
		ldi      40
		gt?     
		bnt      code_0138
		pushi    200
		lag      global125
		div     
		sal      local44
		jmp      code_0153
code_0138:
		lsl      local45
		ldi      20
		gt?     
		bnt      code_014b
		pushi    320
		lag      global125
		div     
		sal      local44
		jmp      code_0153
code_014b:
		pushi    360
		lag      global125
		div     
		sal      local44
code_0153:
		ret     
	)
)

(procedure (localproc_0154)
	(asm
		lsg      global125
		ldi      2
		eq?     
		bnt      code_0169
		pushi    2
		pushi    6
		pushi    8
		callk    Random,  4
		sal      local46
		jmp      code_0173
code_0169:
		pushi    2
		pushi    4
		pushi    7
		callk    Random,  4
		sal      local46
code_0173:
		lsl      local46
		ldi      5
		le?     
		bnt      code_0188
		pushi    2
		pushi    8
		pushi    11
		callk    Random,  4
		sal      local47
		jmp      code_01ae
code_0188:
		lsl      local46
		ldi      7
		le?     
		bnt      code_019d
		pushi    2
		pushi    17
		pushi    21
		callk    Random,  4
		sal      local47
		jmp      code_01ae
code_019d:
		ldi      8
		sal      local46
		bnt      code_01ae
		pushi    2
		pushi    65
		pushi    74
		callk    Random,  4
		sal      local47
code_01ae:
		pushi    #init
		pushi    0
		lofsa    windFlags
		send     4
		ret     
	)
)

(procedure (localproc_01b7)
	(asm
		pushi    0
		callb    proc0_3,  0
		pushi    #hide
		pushi    0
		lofsa    bigTarget
		send     4
		pushi    0
		call     localproc_007d,  0
		pushi    #hide
		pushi    0
		lofsa    flagTree
		send     4
		pushi    #hide
		pushi    0
		lofsa    garland1
		send     4
		pushi    #hide
		pushi    0
		lofsa    garland2
		send     4
		pushi    #hide
		pushi    0
		lofsa    garland3
		send     4
		pushi    #hide
		pushi    0
		lofsa    windFlags
		send     4
		pushi    #hide
		pushi    0
		lofsa    bowHand
		send     4
		pushi    #hide
		pushi    0
		lofsa    bow
		send     4
		pushi    #hide
		pushi    0
		lofsa    arrow
		send     4
		pushi    #drawPic
		pushi    1
		pushi    803
		lag      global2
		send     6
		ret     
	)
)

(procedure (localproc_0214)
	(asm
		pushi    #drawPic
		pushi    1
		pushi    200
		pushi    142
		pushi    1
		lofsa    prepareArrow
		push    
		lag      global2
		send     12
		pushi    #show
		pushi    0
		lofsa    flagTree
		send     4
		pushi    #show
		pushi    0
		lofsa    garland1
		send     4
		pushi    #show
		pushi    0
		lofsa    garland2
		send     4
		pushi    #show
		pushi    0
		lofsa    garland3
		send     4
		pushi    #show
		pushi    0
		lofsa    windFlags
		send     4
		pushi    #show
		pushi    0
		lofsa    bowHand
		send     4
		pushi    #show
		pushi    0
		lofsa    bow
		send     4
		pushi    #show
		pushi    0
		lofsa    arrow
		send     4
		ldi      0
		sal      local43
		ret     
	)
)

(instance povGladeArchery of Rm
	(properties
		picture 200
		style $0003
	)
	
	(method (init)
		(asm
			pushi    #disable
			pushi    5
			pushi    2
			pushi    3
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     14
			pushi    #joyInc
			pushi    1
			pushi    2
			lag      global77
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			lag      global34
			sal      local69
			ldi      0
			sag      global34
			pushi    #cel
			pushi    1
			pushi    3
			pushi    66
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			lofsa    garland1
			send     16
			pushi    #cel
			pushi    1
			pushi    4
			pushi    66
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			lofsa    garland2
			send     16
			pushi    #cel
			pushi    1
			pushi    0
			pushi    66
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			lofsa    garland3
			send     16
			pushi    #setPri
			pushi    1
			pushi    10
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     14
			lsg      global130
			ldi      8
			eq?     
			bnt      code_02ef
			lsg      global126
			ldi      4
			eq?     
code_02ef:
			sal      local6
			pushi    #setPri
			pushi    1
			pushi    12
			pushi    107
			pushi    0
			lofsa    bowHand
			send     10
			pushi    #setPri
			pushi    1
			pushi    12
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    bow
			send     22
			pushi    #setPri
			pushi    1
			pushi    14
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    arrow
			send     22
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    flagTree
			send     8
			pushi    0
			call     localproc_00e2,  0
			pushi    0
			call     localproc_0154,  0
			pushi    #init
			pushi    0
			lofsa    rock1
			send     4
			pushi    #init
			pushi    0
			lofsa    rock2
			send     4
			pushi    #init
			pushi    0
			lofsa    rock3
			send     4
			pushi    #init
			pushi    0
			lofsa    leftTargetArea
			send     4
			pushi    #init
			pushi    0
			lofsa    midTargetArea
			send     4
			pushi    #init
			pushi    0
			lofsa    rightTargetArea
			send     4
			lsg      global12
			ldi      190
			eq?     
			bnt      code_038f
			lsg      global130
			ldi      1
			eq?     
			bnt      code_038f
			pushi    1
			pushi    76
			callb    proc0_5,  2
			not     
			bnt      code_038f
			pushi    1
			pushi    76
			callb    proc0_6,  2
code_038f:
			ret     
		)
	)
	
	(method (doit)
		(asm
			-al      local44
			push    
			ldi      0
			eq?     
			bnt      code_03c8
			pushi    0
			call     localproc_0154,  0
			pushi    0
			call     localproc_00e2,  0
code_03c8:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #dispose
			pushi    0
			lofsa    hitSound
			send     4
			pushi    #joyInc
			pushi    1
			pushi    5
			lag      global77
			send     6
			lal      local69
			sag      global34
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_03e7
			pushi    3
			pushi    1200
			pushi    7
			pushi    1
			calle    proc13_4,  6
			jmp      code_0408
code_03e7:
			dup     
			ldi      1
			eq?     
			bnt      code_03fd
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_0408
code_03fd:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_0408:
			toss    
			ret     
		)
	)
)

(instance windFlags of Prop
	(properties
		x 35
		y 85
		view 200
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Prop,  4
			pushi    #loop
			pushi    1
			lsl      local46
			pushi    66
			pushi    1
			pushi    3
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    219
			pushi    1
			lsl      local47
			self     24
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      1
			eq?     
			bnt      code_0494
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_04b5
code_0494:
			dup     
			ldi      2
			eq?     
			bnt      code_04aa
			pushi    3
			pushi    1200
			pushi    11
			pushi    1
			calle    proc13_4,  6
			jmp      code_04b5
code_04aa:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_04b5:
			toss    
			ret     
		)
	)
)

(instance garland1 of Prop
	(properties
		x 160
		y 129
		view 200
		loop 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			ldi      0
			sal      local70
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0556
			lal      local12
			bnt      code_0549
			pushi    #setScript
			pushi    1
			lofsa    closeUpGarland
			push    
			self     6
			jmp      code_058c
code_0549:
			pushi    #setScript
			pushi    1
			lofsa    showEmptyTarget
			push    
			self     6
			jmp      code_058c
code_0556:
			dup     
			ldi      10
			eq?     
			bnt      code_056b
			pushi    #doVerb
			pushi    1
			pushi    10
			lofsa    leftTargetArea
			send     6
			jmp      code_058c
code_056b:
			dup     
			ldi      1
			eq?     
			bnt      code_0581
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_058c
code_0581:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_058c:
			toss    
			ret     
		)
	)
)

(instance garland2 of Prop
	(properties
		x 186
		y 110
		view 200
		loop 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			ldi      1
			sal      local70
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0628
			lal      local13
			bnt      code_061b
			pushi    #setScript
			pushi    1
			lofsa    closeUpGarland
			push    
			self     6
			jmp      code_065e
code_061b:
			pushi    #setScript
			pushi    1
			lofsa    showEmptyTarget
			push    
			self     6
			jmp      code_065e
code_0628:
			dup     
			ldi      1
			eq?     
			bnt      code_063e
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_065e
code_063e:
			dup     
			ldi      10
			eq?     
			bnt      code_0653
			pushi    #doVerb
			pushi    1
			pushi    10
			lofsa    midTargetArea
			send     6
			jmp      code_065e
code_0653:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_065e:
			toss    
			ret     
		)
	)
)

(instance garland3 of Prop
	(properties
		x 217
		y 121
		view 200
		loop 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			ldi      2
			sal      local70
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_06fa
			lal      local14
			bnt      code_06ed
			pushi    #setScript
			pushi    1
			lofsa    closeUpGarland
			push    
			self     6
			jmp      code_0730
code_06ed:
			pushi    #setScript
			pushi    1
			lofsa    showEmptyTarget
			push    
			self     6
			jmp      code_0730
code_06fa:
			dup     
			ldi      1
			eq?     
			bnt      code_0710
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_0730
code_0710:
			dup     
			ldi      10
			eq?     
			bnt      code_0725
			pushi    #doVerb
			pushi    1
			pushi    10
			lofsa    rightTargetArea
			send     6
			jmp      code_0730
code_0725:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_0730:
			toss    
			ret     
		)
	)
)

(instance bowHand of View
	(properties
		x 137
		y 239
		lookStr 7379
		view 201
		loop 1
		signal $5000
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    View,  4
			pushi    #setCel
			pushi    1
			lsl      local6
			self     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    3
			lsg      global19
			pushi    4
			pushi    5
			calle    proc999_5,  6
			bnt      code_0843
			pushi    2
			pushi    135
			pushi    2
			pushi    240
			lsg      global70
			calle    proc999_2,  4
			push    
			calle    proc999_3,  4
			push    
			ldi      22
			sub     
			aTop     x
			pushi    2
			pushi    80
			pushi    2
			pushi    130
			lsg      global71
			calle    proc999_2,  4
			push    
			calle    proc999_3,  4
			push    
			ldi      109
			add     
			aTop     y
			lal      local10
			bnt      code_082d
			pushi    148
			lag      global70
			le?     
			bnt      code_082d
			pprev   
			ldi      226
			le?     
			bnt      code_082d
			pushi    82
			lag      global71
			le?     
			bnt      code_082d
			pprev   
			ldi      132
			le?     
			bnt      code_082d
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			jmp      code_0843
code_082d:
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			lag      global1
			send     6
code_0843:
			pushi    #doit
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_087f
			lal      local10
			not     
			bnt      code_08a0
			lsl      local11
			ldi      6
			lt?     
			bnt      code_0870
			pushi    #setScript
			pushi    1
			lofsa    prepareArrow
			push    
			lag      global2
			send     6
			jmp      code_08a0
code_0870:
			pushi    #setScript
			pushi    1
			lofsa    newRound
			push    
			lag      global2
			send     6
			jmp      code_08a0
code_087f:
			dup     
			ldi      1
			eq?     
			bnt      code_0895
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_08a0
code_0895:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_08a0:
			toss    
			ret     
		)
	)
)

(instance bow of View
	(properties
		x 195
		y 144
		lookStr 7418
		view 201
		signal $5000
	)
	
	(method (doit)
		(asm
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      58
			add     
			aTop     x
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      95
			sub     
			aTop     y
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      1
			eq?     
			bnt      code_0943
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_094e
code_0943:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_094e:
			toss    
			ret     
		)
	)
)

(instance arrow of View
	(properties
		x 159
		y 133
		lookStr 7495
		view 332
		priority 16
		signal $4010
	)
	
	(method (doit)
		(asm
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      22
			add     
			aTop     x
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      106
			sub     
			aTop     y
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      1
			eq?     
			bnt      code_09ed
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_09f8
code_09ed:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_09f8:
			toss    
			ret     
		)
	)
)

(instance smallArrow of View
	(properties
		view 332
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a78
			pushi    2
			pushi    1200
			pushi    12
			calle    proc13_4,  4
			jmp      code_0a83
code_0a78:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0a83:
			toss    
			ret     
		)
	)
)

(instance bigTarget of View
	(properties
		x 151
		y 167
		view 200
		signal $4008
	)
	
	(method (onMe param1)
		(asm
			pTos     nsLeft
			pushi    #x
			pushi    0
			lap      param1
			send     4
			le?     
			bnt      code_0b0f
			pprev   
			pToa     nsRight
			le?     
			bnt      code_0b0f
			pTos     nsTop
			pushi    #y
			pushi    0
			lap      param1
			send     4
			le?     
			bnt      code_0b0f
			pprev   
			pToa     nsBottom
			le?     
code_0b0f:
			ret     
		)
	)
)

(instance flagTree of View
	(properties
		x 32
		y 143
		view 200
		loop 1
		priority 9
		signal $0010
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      1
			eq?     
			bnt      code_0b8c
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_0bab
code_0b8c:
			dup     
			ldi      2
			eq?     
			bnt      code_0ba0
			pushi    2
			pushi    1200
			pushi    11
			calle    proc13_4,  4
			jmp      code_0bab
code_0ba0:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    View,  6
code_0bab:
			toss    
			ret     
		)
	)
)

(instance rock1 of Feature
	(properties
		x 32
		y 122
		nsTop 114
		nsLeft 17
		nsBottom 131
		nsRight 47
		sightAngle 90
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0c2a
			pushi    3
			pushi    1200
			pushi    8
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c4b
code_0c2a:
			dup     
			ldi      1
			eq?     
			bnt      code_0c40
			pushi    #setScript
			pushi    1
			lofsa    leaveGlade
			push    
			lag      global2
			send     6
			jmp      code_0c4b
code_0c40:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0c4b:
			toss    
			ret     
		)
	)
)

(instance rock2 of Feature
	(properties
		x 124
		y 137
		nsTop 129
		nsLeft 113
		nsBottom 145
		nsRight 136
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    rock1
			send     4
			ret     
		)
	)
)

(instance rock3 of Feature
	(properties
		x 282
		y 172
		nsTop 156
		nsLeft 246
		nsBottom 189
		nsRight 319
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    rock1
			send     4
			ret     
		)
	)
)

(instance prepareArrow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d7f
			pushi    7
			pushi    1
			pushi    #species
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      22
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    bowHand
			send     4
			push    
			ldi      106
			sub     
			push    
			pushi    194
			pushi    0
			lofsa    arrow
			send     18
			ldi      1
			sal      local10
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			ldi      5
			aTop     cycles
			jmp      code_0d8b
code_0d7f:
			dup     
			ldi      1
			eq?     
			bnt      code_0d8b
			pushi    #dispose
			pushi    0
			self     4
code_0d8b:
			toss    
			ret     
		)
	)
)

(instance fireArrow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ded
			pushi    #canInput
			pushi    1
			pushi    0
			class    User
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    arrow
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1484
code_0ded:
			dup     
			ldi      1
			eq?     
			bnt      code_0e0c
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    arrow
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1484
code_0e0c:
			dup     
			ldi      2
			eq?     
			bnt      code_0e5c
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #x
			pushi    0
			lofsa    arrow
			send     4
			sal      local39
			pushi    #y
			pushi    0
			lofsa    arrow
			send     4
			sal      local40
			ldi      0
			sal      local10
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0e41
			ldi      5
			jmp      code_0e56
code_0e41:
			dup     
			ldi      1
			eq?     
			bnt      code_0e4d
			ldi      20
			jmp      code_0e56
code_0e4d:
			dup     
			ldi      2
			eq?     
			bnt      code_0e56
			ldi      15
code_0e56:
			toss    
			aTop     ticks
			jmp      code_1484
code_0e5c:
			dup     
			ldi      3
			eq?     
			bnt      code_11fc
			lsl      local39
			lsl      local46
			dup     
			ldi      4
			eq?     
			bnt      code_0ea6
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0e82
			pushi    2
			pushi    3
			pushi    7
			callk    Random,  4
			jmp      code_0ea1
code_0e82:
			dup     
			ldi      1
			eq?     
			bnt      code_0e93
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			jmp      code_0ea1
code_0e93:
			dup     
			ldi      2
			eq?     
			bnt      code_0ea1
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
code_0ea1:
			toss    
			neg     
			jmp      code_0f5c
code_0ea6:
			dup     
			ldi      5
			eq?     
			bnt      code_0ee4
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0ec1
			pushi    2
			pushi    3
			pushi    7
			callk    Random,  4
			jmp      code_0ee0
code_0ec1:
			dup     
			ldi      1
			eq?     
			bnt      code_0ed2
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			jmp      code_0ee0
code_0ed2:
			dup     
			ldi      2
			eq?     
			bnt      code_0ee0
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
code_0ee0:
			toss    
			jmp      code_0f5c
code_0ee4:
			dup     
			ldi      6
			eq?     
			bnt      code_0f22
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0efe
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
			jmp      code_0f1d
code_0efe:
			dup     
			ldi      1
			eq?     
			bnt      code_0f0f
			pushi    2
			pushi    1
			pushi    4
			callk    Random,  4
			jmp      code_0f1d
code_0f0f:
			dup     
			ldi      2
			eq?     
			bnt      code_0f1d
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
code_0f1d:
			toss    
			neg     
			jmp      code_0f5c
code_0f22:
			dup     
			ldi      7
			eq?     
			bnt      code_0f5c
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0f3c
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
			jmp      code_0f5b
code_0f3c:
			dup     
			ldi      1
			eq?     
			bnt      code_0f4d
			pushi    2
			pushi    1
			pushi    4
			callk    Random,  4
			jmp      code_0f5b
code_0f4d:
			dup     
			ldi      2
			eq?     
			bnt      code_0f5b
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
code_0f5b:
			toss    
code_0f5c:
			toss    
			add     
			sal      local39
			lsl      local40
			lal      local70
			lali     local60
			add     
			sal      local40
			pushi    #cel
			pushi    1
			lal      local70
			lsli     local63
			lofsa    arrow
			send     6
			pushi    5
			pushi    #superClass
			pushi    332
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			lal      local70
			lsli     local63
			pushi    284
			pushi    2
			lsl      local39
			lsl      local40
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    #new
			pushi    0
			lofsa    smallArrow
			send     4
			push    
			lal      local11
			sali     local15
			send     44
			pushi    280
			lal      local39
			gt?     
			bnt      code_0fbb
			pprev   
			ldi      230
			gt?     
code_0fbb:
			bt       code_100b
			pushi    137
			lal      local39
			gt?     
			bnt      code_0fcb
			pprev   
			ldi      35
			gt?     
code_0fcb:
			bt       code_100b
			pushi    179
			lal      local39
			gt?     
			bnt      code_0feb
			pprev   
			ldi      172
			gt?     
			bnt      code_0feb
			pushi    103
			lal      local40
			gt?     
			bnt      code_0feb
			pprev   
			ldi      71
			gt?     
code_0feb:
			bt       code_100b
			pushi    205
			lal      local39
			gt?     
			bnt      code_101b
			pprev   
			ldi      194
			gt?     
			bnt      code_101b
			pushi    115
			lal      local40
			gt?     
			bnt      code_101b
			pprev   
			ldi      78
			gt?     
code_100b:
			bnt      code_101b
			ldi      999
			sal      local41
			ldi      999
			sal      local42
			jmp      code_105a
code_101b:
			lsl      local39
			lal      local70
			lali     local48
			sub     
			push    
			lal      local70
			lali     local57
			mul     
			push    
			ldi      10
			div     
			push    
			lal      local70
			lali     local54
			add     
			sal      local41
			lsl      local39
			lal      local43
			eq?     
			bnt      code_1043
			lsl      local41
			ldi      1
			sub     
			sal      local41
code_1043:
			lsl      local40
			lal      local70
			lali     local51
			sub     
			push    
			lal      local70
			lali     local57
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      122
			add     
			sal      local42
code_105a:
			lal      local39
			sal      local43
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_10a4
			pushi    5
			pushi    #superClass
			pushi    200
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local41
			lsl      local42
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			push    
			lal      local12
			sali     local21
			send     44
			+al      local12
			ldi      0
			sal      local0
			jmp      code_1129
code_10a4:
			dup     
			ldi      1
			eq?     
			bnt      code_10e8
			pushi    5
			pushi    #superClass
			pushi    200
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local41
			lsl      local42
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			push    
			lal      local13
			sali     local27
			send     44
			+al      local13
			ldi      0
			sal      local1
			jmp      code_1129
code_10e8:
			dup     
			ldi      2
			eq?     
			bnt      code_1129
			pushi    5
			pushi    #superClass
			pushi    200
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local41
			lsl      local42
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			push    
			lal      local14
			sali     local33
			send     44
			+al      local14
			ldi      0
			sal      local2
code_1129:
			toss    
			pushi    280
			lal      local39
			gt?     
			bnt      code_1138
			pprev   
			ldi      230
			gt?     
code_1138:
			bt       code_1188
			pushi    137
			lal      local39
			gt?     
			bnt      code_1148
			pprev   
			ldi      35
			gt?     
code_1148:
			bt       code_1188
			pushi    179
			lal      local39
			gt?     
			bnt      code_1168
			pprev   
			ldi      172
			gt?     
			bnt      code_1168
			pushi    103
			lal      local40
			gt?     
			bnt      code_1168
			pprev   
			ldi      71
			gt?     
code_1168:
			bt       code_1188
			pushi    205
			lal      local39
			gt?     
			bnt      code_11a2
			pprev   
			ldi      194
			gt?     
			bnt      code_11a2
			pushi    115
			lal      local40
			gt?     
			bnt      code_11a2
			pprev   
			ldi      78
			gt?     
code_1188:
			bnt      code_11a2
			pushi    #hide
			pushi    0
			lal      local11
			lali     local15
			send     4
			pushi    #number
			pushi    1
			pushi    357
			lofsa    hitSound
			send     6
			jmp      code_11ad
code_11a2:
			pushi    #number
			pushi    1
			pushi    908
			lofsa    hitSound
			send     6
code_11ad:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_11bb
			pushi    1
			pushi    41
			callb    proc0_6,  2
code_11bb:
			+al      local11
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			lsg      global70
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			add     
			push    
			ldi      65532
			add     
			push    
			lsg      global71
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			add     
			push    
			ldi      65532
			add     
			push    
			lag      global1
			send     12
			lsl      local41
			ldi      999
			eq?     
			bnt      code_11f5
			ldi      10
			jmp      code_11f7
code_11f5:
			ldi      1
code_11f7:
			aTop     cycles
			jmp      code_1484
code_11fc:
			dup     
			ldi      4
			eq?     
			bnt      code_1450
			pushi    #canInput
			pushi    1
			pushi    1
			class    User
			send     6
			pushi    #play
			pushi    0
			lofsa    hitSound
			send     4
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_1449
			pushi    280
			lal      local39
			gt?     
			bnt      code_122b
			pprev   
			ldi      230
			gt?     
code_122b:
			bt       code_127b
			pushi    137
			lal      local39
			gt?     
			bnt      code_123b
			pprev   
			ldi      35
			gt?     
code_123b:
			bt       code_127b
			pushi    179
			lal      local39
			gt?     
			bnt      code_125b
			pprev   
			ldi      172
			gt?     
			bnt      code_125b
			pushi    103
			lal      local40
			gt?     
			bnt      code_125b
			pprev   
			ldi      71
			gt?     
code_125b:
			bt       code_127b
			pushi    205
			lal      local39
			gt?     
			bnt      code_1295
			pprev   
			ldi      194
			gt?     
			bnt      code_1295
			pushi    115
			lal      local40
			gt?     
			bnt      code_1295
			pprev   
			ldi      78
			gt?     
code_127b:
			bnt      code_1295
			lal      local9
			bnt      code_1295
			pushi    #setScript
			pushi    3
			lofsa    saySomethingWill
			push    
			pushSelf
			pushi    2
			pToa     client
			send     10
			jmp      code_1484
code_1295:
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_12a7
			lsl      local39
			ldi      160
			eq?     
			jmp      code_12c4
code_12a7:
			dup     
			ldi      1
			eq?     
			bnt      code_12b7
			lsl      local39
			ldi      187
			eq?     
			jmp      code_12c4
code_12b7:
			dup     
			ldi      2
			eq?     
			bnt      code_12c4
			lsl      local39
			ldi      218
			eq?     
code_12c4:
			toss    
			bnt      code_131f
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_12e1
			lsl      local40
			ldi      117
			eq?     
			bt       code_1304
			lsl      local40
			ldi      118
			eq?     
			jmp      code_1304
code_12e1:
			dup     
			ldi      1
			eq?     
			bnt      code_12f8
			lsl      local40
			ldi      99
			eq?     
			bt       code_1304
			lsl      local40
			ldi      100
			eq?     
			jmp      code_1304
code_12f8:
			dup     
			ldi      2
			eq?     
			bnt      code_1304
			lsl      local40
			ldi      107
			eq?     
code_1304:
			toss    
			bnt      code_131f
			lal      local7
			bnt      code_131f
			pushi    #setScript
			pushi    3
			lofsa    saySomethingWill
			push    
			pushSelf
			pushi    0
			pToa     client
			send     10
			jmp      code_1484
code_131f:
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_137a
			pushi    179
			lal      local39
			ge?     
			bnt      code_1336
			pprev   
			ldi      168
			ge?     
code_1336:
			bt       code_1427
			pushi    154
			lal      local39
			ge?     
			bnt      code_1347
			pprev   
			ldi      138
			ge?     
code_1347:
			bt       code_1427
			pushi    179
			lal      local39
			ge?     
			bnt      code_1427
			pprev   
			ldi      138
			ge?     
			bnt      code_1427
			pushi    110
			lal      local40
			gt?     
			bnt      code_1367
			pprev   
			ldi      64
			gt?     
code_1367:
			bt       code_1427
			pushi    151
			lal      local40
			gt?     
			bnt      code_1427
			pprev   
			ldi      125
			gt?     
			jmp      code_1427
code_137a:
			dup     
			ldi      1
			eq?     
			bnt      code_13d2
			pushi    193
			lal      local39
			ge?     
			bnt      code_138f
			pprev   
			ldi      191
			ge?     
code_138f:
			bt       code_1427
			pushi    183
			lal      local39
			ge?     
			bnt      code_13a0
			pprev   
			ldi      180
			ge?     
code_13a0:
			bt       code_1427
			pushi    193
			lal      local39
			ge?     
			bnt      code_1427
			pprev   
			ldi      180
			ge?     
			bnt      code_1427
			pushi    92
			lal      local40
			ge?     
			bnt      code_13c0
			pprev   
			ldi      56
			ge?     
code_13c0:
			bt       code_1427
			pushi    114
			lal      local40
			ge?     
			bnt      code_1427
			pprev   
			ldi      102
			ge?     
			jmp      code_1427
code_13d2:
			dup     
			ldi      2
			eq?     
			bnt      code_1427
			pushi    228
			lal      local39
			ge?     
			bnt      code_13e7
			pprev   
			ldi      222
			ge?     
code_13e7:
			bt       code_1427
			pushi    213
			lal      local39
			ge?     
			bnt      code_13f8
			pprev   
			ldi      206
			ge?     
code_13f8:
			bt       code_1427
			pushi    228
			lal      local39
			ge?     
			bnt      code_1427
			pprev   
			ldi      206
			ge?     
			bnt      code_1427
			pushi    100
			lal      local40
			gt?     
			bnt      code_1418
			pprev   
			ldi      82
			gt?     
code_1418:
			bt       code_1427
			pushi    124
			lal      local40
			gt?     
			bnt      code_1427
			pprev   
			ldi      113
			gt?     
code_1427:
			toss    
			bnt      code_1442
			lal      local8
			bnt      code_1442
			pushi    #setScript
			pushi    3
			lofsa    saySomethingWill
			push    
			pushSelf
			pushi    1
			pToa     client
			send     10
			jmp      code_1484
code_1442:
			ldi      1
			aTop     cycles
			jmp      code_1484
code_1449:
			ldi      1
			aTop     cycles
			jmp      code_1484
code_1450:
			dup     
			ldi      5
			eq?     
			bnt      code_1478
			pushi    1
			pushi    166
			callb    proc0_6,  2
			not     
			bnt      code_1471
			pushi    #setScript
			pushi    1
			lofsa    showCloseUpGarland
			push    
			lag      global2
			send     6
			jmp      code_1484
code_1471:
			ldi      1
			aTop     cycles
			jmp      code_1484
code_1478:
			dup     
			ldi      6
			eq?     
			bnt      code_1484
			pushi    #dispose
			pushi    0
			self     4
code_1484:
			toss    
			ret     
		)
	)
)

(instance showCloseUpGarland of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14f2
			pushi    0
			callb    proc0_3,  0
			pushi    #select
			pushi    1
			pushi    #at
			pushi    1
			pushi    1
			lag      global69
			send     6
			push    
			lag      global69
			send     6
			pushi    #setCursor
			pushi    2
			pushi    1
			pushi    1
			lag      global1
			send     8
			ldi      60
			aTop     ticks
			jmp      code_150a
code_14f2:
			dup     
			ldi      1
			eq?     
			bnt      code_150a
			pushi    1
			pushi    1
			callb    proc0_4,  2
			pushi    #setScript
			pushi    1
			lofsa    closeUpGarland
			push    
			pToa     client
			send     6
code_150a:
			toss    
			ret     
		)
	)
)

(instance closeUpGarland of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1583
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			pushi    #x
			pushi    1
			lal      local70
			lsli     local66
			lofsa    bigTarget
			send     6
			ldi      1
			aTop     cycles
			jmp      code_16e4
code_1583:
			dup     
			ldi      1
			eq?     
			bnt      code_1687
			pushi    #show
			pushi    0
			lofsa    bigTarget
			send     4
			pushi    1
			lofsa    bigTarget
			push    
			callk    SetNowSeen,  2
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_15e9
			ldi      0
			sat      temp0
code_15a8:
			lst      temp0
			lal      local12
			lt?     
			bnt      code_15d0
			lat      temp0
			lali     local21
			sat      temp1
			pushi    #onMe
			pushi    1
			push    
			lofsa    bigTarget
			send     6
			bnt      code_15cb
			pushi    #show
			pushi    0
			lat      temp1
			send     4
code_15cb:
			+at      temp0
			jmp      code_15a8
code_15d0:
			lal      local0
			not     
			bnt      code_15e2
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    1
			lat      temp1
			send     8
code_15e2:
			ldi      1
			sal      local0
			jmp      code_167e
code_15e9:
			dup     
			ldi      1
			eq?     
			bnt      code_1635
			ldi      0
			sat      temp0
code_15f4:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_161c
			lat      temp0
			lali     local27
			sat      temp1
			pushi    #onMe
			pushi    1
			push    
			lofsa    bigTarget
			send     6
			bnt      code_1617
			pushi    #show
			pushi    0
			lat      temp1
			send     4
code_1617:
			+at      temp0
			jmp      code_15f4
code_161c:
			lal      local1
			not     
			bnt      code_162e
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    1
			lat      temp1
			send     8
code_162e:
			ldi      1
			sal      local1
			jmp      code_167e
code_1635:
			dup     
			ldi      2
			eq?     
			bnt      code_167e
			ldi      0
			sat      temp0
code_1640:
			lst      temp0
			lal      local14
			lt?     
			bnt      code_1668
			lat      temp0
			lali     local33
			sat      temp1
			pushi    #onMe
			pushi    1
			push    
			lofsa    bigTarget
			send     6
			bnt      code_1663
			pushi    #show
			pushi    0
			lat      temp1
			send     4
code_1663:
			+at      temp0
			jmp      code_1640
code_1668:
			lal      local2
			not     
			bnt      code_167a
			pushi    #setCycle
			pushi    2
			class    Osc
			push    
			pushi    1
			lat      temp1
			send     8
code_167a:
			ldi      1
			sal      local2
code_167e:
			toss    
			ldi      150
			aTop     ticks
			jmp      code_16e4
code_1687:
			dup     
			ldi      2
			eq?     
			bnt      code_16a2
			pushi    0
			call     localproc_000e,  0
			pushi    #hide
			pushi    0
			lofsa    bigTarget
			send     4
			ldi      5
			aTop     cycles
			jmp      code_16e4
code_16a2:
			dup     
			ldi      3
			eq?     
			bnt      code_16d3
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			lsl      local10
			ldi      1
			eq?     
			bnt      code_16cc
			pushi    #show
			pushi    0
			lofsa    arrow
			send     4
code_16cc:
			ldi      2
			aTop     cycles
			jmp      code_16e4
code_16d3:
			dup     
			ldi      4
			eq?     
			bnt      code_16e4
			pushi    1
			pushi    1
			callb    proc0_4,  2
			pushi    #dispose
			pushi    0
			self     4
code_16e4:
			toss    
			ret     
		)
	)
)

(instance saySomethingWill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1790
			pushi    0
			callb    proc0_3,  0
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_1751
			ldi      0
			sal      local7
			pushi    5
			pushi    1
			lea      @local71
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_178c
code_1751:
			dup     
			ldi      1
			eq?     
			bnt      code_1770
			ldi      0
			sal      local8
			pushi    5
			pushi    1
			lea      @local75
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_178c
code_1770:
			dup     
			ldi      2
			eq?     
			bnt      code_178c
			ldi      0
			sal      local9
			pushi    5
			pushi    1
			lea      @local83
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
code_178c:
			toss    
			jmp      code_17a1
code_1790:
			dup     
			ldi      1
			eq?     
			bnt      code_17a1
			pushi    1
			pushi    1
			callb    proc0_4,  2
			pushi    #dispose
			pushi    0
			self     4
code_17a1:
			toss    
			ret     
		)
	)
)

(instance leaveGlade of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1805
			lal      local11
			bnt      code_17fe
			pushi    3
			pushi    1200
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_181c
code_17fe:
			ldi      1
			aTop     cycles
			jmp      code_181c
code_1805:
			dup     
			ldi      1
			eq?     
			bnt      code_181c
			pushi    #newRoom
			pushi    1
			pushi    190
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_181c:
			toss    
			ret     
		)
	)
)

(instance newRound of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1871
			pushi    0
			callb    proc0_3,  0
			ldi      18
			aTop     ticks
			jmp      code_1947
code_1871:
			dup     
			ldi      1
			eq?     
			bnt      code_18a4
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_1895
			pushi    5
			pushi    1
			lea      @local79
			push    
			pushi    14
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1947
code_1895:
			pushi    3
			pushi    1200
			pushi    9
			pushSelf
			calle    proc13_4,  6
			jmp      code_1947
code_18a4:
			dup     
			ldi      2
			eq?     
			bnt      code_18d0
			pushi    1
			pushi    1
			callb    proc0_4,  2
			pushi    #disable
			pushi    2
			pushi    0
			pushi    4
			pushi    168
			pushi    1
			pushi    #at
			pushi    1
			pushi    1
			lag      global69
			send     6
			push    
			lag      global69
			send     14
			ldi      300
			aTop     ticks
			jmp      code_1947
code_18d0:
			dup     
			ldi      3
			eq?     
			bnt      code_18ec
			pushi    #isNotHidden
			pushi    0
			lofsa    bigTarget
			send     4
			bnt      code_18e5
			dpToa    state
code_18e5:
			ldi      10
			aTop     ticks
			jmp      code_1947
code_18ec:
			dup     
			ldi      4
			eq?     
			bnt      code_18ff
			pushi    0
			call     localproc_01b7,  0
			ldi      60
			aTop     ticks
			jmp      code_1947
code_18ff:
			dup     
			ldi      5
			eq?     
			bnt      code_193b
			pushi    0
			call     localproc_0214,  0
			pushi    1
			pushi    1
			callb    proc0_4,  2
			pushi    #enable
			pushi    2
			pushi    0
			pushi    4
			pushi    206
			pushi    1
			pushi    #at
			pushi    1
			pushi    4
			lag      global69
			send     6
			push    
			lag      global69
			send     14
			pushi    #setCursor
			pushi    2
			pushi    4
			pushi    1
			lag      global1
			send     8
			ldi      30
			aTop     ticks
			jmp      code_1947
code_193b:
			dup     
			ldi      6
			eq?     
			bnt      code_1947
			pushi    #dispose
			pushi    0
			self     4
code_1947:
			toss    
			ret     
		)
	)
)

(instance showEmptyTarget of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19b3
			pushi    0
			callb    proc0_3,  0
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bow
			send     4
			pushi    #hide
			pushi    0
			lofsa    bowHand
			send     4
			ldi      1
			aTop     cycles
			jmp      code_1a87
code_19b3:
			dup     
			ldi      1
			eq?     
			bnt      code_19d1
			pushi    #x
			pushi    1
			lal      local70
			lsli     local66
			pushi    194
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      2
			aTop     cycles
			jmp      code_1a87
code_19d1:
			dup     
			ldi      2
			eq?     
			bnt      code_1a36
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_19f7
			lal      local3
			bnt      code_1a2e
			ldi      0
			sal      local3
			pushi    2
			pushi    1200
			pushi    4
			calle    proc13_4,  4
			jmp      code_1a2e
code_19f7:
			dup     
			ldi      1
			eq?     
			bnt      code_1a14
			lal      local4
			bnt      code_1a2e
			ldi      0
			sal      local4
			pushi    2
			pushi    1200
			pushi    5
			calle    proc13_4,  4
			jmp      code_1a2e
code_1a14:
			dup     
			ldi      2
			eq?     
			bnt      code_1a2e
			lal      local5
			bnt      code_1a2e
			ldi      0
			sal      local5
			pushi    2
			pushi    1200
			pushi    6
			calle    proc13_4,  4
code_1a2e:
			toss    
			ldi      5
			aTop     cycles
			jmp      code_1a87
code_1a36:
			dup     
			ldi      3
			eq?     
			bnt      code_1a53
			pushi    #x
			pushi    1
			lal      local70
			lsli     local66
			pushi    105
			pushi    0
			lofsa    bigTarget
			send     10
			ldi      3
			aTop     cycles
			jmp      code_1a87
code_1a53:
			dup     
			ldi      4
			eq?     
			bnt      code_1a87
			pushi    #show
			pushi    0
			lofsa    bow
			send     4
			pushi    #show
			pushi    0
			lofsa    bowHand
			send     4
			lsl      local10
			ldi      1
			eq?     
			bnt      code_1a7d
			pushi    #show
			pushi    0
			lofsa    arrow
			send     4
code_1a7d:
			pushi    1
			pushi    1
			callb    proc0_4,  2
			pushi    #dispose
			pushi    0
			self     4
code_1a87:
			toss    
			ret     
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 906
	)
)

(instance hitSound of Sound
	(properties
		flags $0001
	)
)

(instance leftTargetArea of Feature
	(properties
		x 161
		y 130
		nsTop 80
		nsLeft 140
		nsBottom 134
		nsRight 174
		description 7722
		sightAngle 90
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_1b59
			lal      local10
			bnt      code_1b64
			lsl      local11
			ldi      6
			lt?     
			bnt      code_1b64
			ldi      0
			sal      local70
			pushi    #setScript
			pushi    1
			lofsa    fireArrow
			push    
			lag      global2
			send     6
			jmp      code_1b64
code_1b59:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_1b64:
			toss    
			ret     
		)
	)
)

(instance midTargetArea of Feature
	(properties
		x 188
		y 101
		nsTop 70
		nsLeft 175
		nsBottom 122
		nsRight 200
		description 7722
		sightAngle 90
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_1bd3
			lal      local10
			bnt      code_1bde
			lsl      local11
			ldi      6
			lt?     
			bnt      code_1bde
			ldi      1
			sal      local70
			pushi    #setScript
			pushi    1
			lofsa    fireArrow
			push    
			lag      global2
			send     6
			jmp      code_1bde
code_1bd3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_1bde:
			toss    
			ret     
		)
	)
)

(instance rightTargetArea of Feature
	(properties
		x 218
		y 105
		nsTop 75
		nsLeft 201
		nsBottom 125
		nsRight 234
		description 7722
		sightAngle 90
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_1c4d
			lal      local10
			bnt      code_1c58
			lsl      local11
			ldi      6
			lt?     
			bnt      code_1c58
			ldi      2
			sal      local70
			pushi    #setScript
			pushi    1
			lofsa    fireArrow
			push    
			lag      global2
			send     6
			jmp      code_1c58
code_1c4d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_1c58:
			toss    
			ret     
		)
	)
)
