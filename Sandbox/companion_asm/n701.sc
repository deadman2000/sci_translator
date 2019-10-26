;;; Sierra Script 1.0 - (do not remove this comment)
(script# 701)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm701 0
)

(local
	local0
	[local1 45]
	[local46 45] = [172 178 186 178 168 164 186 178 183 175 172 153 160 168 174 172 170 166 161 156 134 139 138 131 150 130 129 160 153 143 140 143 151 144 158 151 132 142 159 168 125 155 123 146 130]
	[local91 45] = [188 139 99 66 44 20 115 152 83 168 180 186 166 148 126 113 96 79 62 34 188 175 149 119 100 74 46 24 134 22 40 65 185 162 147 112 88 78 91 180 15 37 30 18 10]
	[local136 45] = [0 0 0 0 0 0 0 0 0 0 2 2 2 2 2 2 2 2 2 2 -1 1 1 1 1 1 1 1 1 3 3 3 3 3 3 3 3 3 3 3 1 1 0 2 2]
	local181
)
(procedure (localproc_000e)
	(asm
		ldi      0
		sal      local181
code_0012:
		lsl      local181
		ldi      45
		lt?     
		bnt      code_0052
		pushi    #new
		pushi    0
		lofsa    clIvy
		send     4
		push    
		lal      local181
		sali     local1
		pushi    #x
		pushi    1
		lal      local181
		lsli     local46
		pushi    3
		pushi    1
		lsli     local91
		pushi    162
		pushi    1
		lsli     local136
		pushi    288
		pushi    1
		pushi    221
		pushi    17
		pushi    1
		pushi    16401
		pushi    107
		pushi    0
		lali     local1
		send     34
		+al      local181
		jmp      code_0012
code_0052:
		ret     
	)
)

(instance rightSide of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    182
			pushi    189
			pushi    188
			pushi    61
			pushi    171
			pushi    34
			pushi    170
			pushi    0
			pushi    200
			pushi    0
			pushi    200
			pushi    189
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

(instance leftSide of Feature
	(properties)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    110
			pushi    189
			pushi    110
			pushi    0
			pushi    121
			pushi    0
			pushi    133
			pushi    189
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

(instance rm701 of Rm
	(properties
		picture 701
		horizon 20
	)
	
	(method (init)
		(asm
			lsg      global12
			ldi      702
			eq?     
			bnt      code_01b0
			ldi      13
			aTop     style
			pushi    #view
			pushi    1
			pushi    709
			pushi    3
			pushi    1
			pushi    21
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lag      global0
			send     22
			jmp      code_01d2
code_01b0:
			ldi      14
			aTop     style
			pushi    #view
			pushi    1
			pushi    709
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    7
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    164
			pushi    107
			pushi    0
			lag      global0
			send     28
code_01d2:
			pushi    #init
			pushi    0
			super    Rm,  4
			lag      global34
			sal      local0
			ldi      0
			sag      global34
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global168
			send     12
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    4
			lofsa    aTower
			push    
			lofsa    sky
			push    
			lofsa    rightSide
			push    
			lofsa    leftSide
			push    
			calle    proc806_3,  8
			pushi    0
			call     localproc_000e,  0
			pushi    #xStep
			pushi    1
			pushi    2
			pushi    55
			pushi    1
			pushi    3
			pushi    66
			pushi    1
			pushi    12
			pushi    17
			pushi    1
			pushi    16400
			pushi    300
			pushi    0
			pushi    267
			pushi    1
			lofsa    unusualDoVerb
			push    
			pushi    142
			pushi    1
			lofsa    enterThePicture
			push    
			lag      global0
			send     40
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    161
			pushi    #superClass
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			div     
			push    
			lag      global100
			send     6
			pushi    161
			pushi    #superClass
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			div     
			push    
			lag      global113
			send     6
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0282
			ldi      0
			jmp      code_0306
code_0282:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_02a0
			pushi    #setScript
			pushi    1
			lofsa    N
			push    
			lag      global0
			send     6
			jmp      code_0306
code_02a0:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_02be
			pushi    #setScript
			pushi    1
			lofsa    S
			push    
			lag      global0
			send     6
			jmp      code_0306
code_02be:
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    leftSide
			send     6
			bnt      code_02de
			pushi    #setScript
			pushi    3
			lofsa    climbGoThere
			push    
			pushi    0
			pushi    0
			lag      global0
			send     10
			jmp      code_0306
code_02de:
			pushi    #onMe
			pushi    1
			lsg      global0
			lofsa    rightSide
			send     6
			bnt      code_02fe
			pushi    #setScript
			pushi    3
			lofsa    climbGoThere
			push    
			pushi    0
			pushi    1
			lag      global0
			send     10
			jmp      code_0306
code_02fe:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
code_0306:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #enable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #message
			pushi    1
			pushi    3
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			send     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (reflectPosn)
		(asm
			ldi      0
			ret     
		)
	)
)

(instance unusualDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_0376
			pushi    3
			pushi    1701
			pushi    3
			pushi    1
			calle    proc13_4,  6
code_0376:
			ret     
		)
	)
)

(instance aTower of Feature
	(properties
		x 212
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    212
			pushi    0
			pushi    229
			pushi    189
			pushi    0
			pushi    189
			pushi    0
			pushi    2
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
			lal      local0
			sag      global34
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
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_03af
			pushi    3
			pushi    1701
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_03cf
code_03af:
			dup     
			ldi      3
			eq?     
			bnt      code_03c4
			pushi    3
			pushi    1701
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_03cf
code_03c4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_03cf:
			toss    
			ret     
		)
	)
)

(instance sky of Feature
	(properties
		x 267
		y 94
		nsLeft 210
		nsBottom 189
		nsRight 319
		lookStr 4
	)
)

(instance clIvy of Prop
	(properties
		x 160
		y 170
		view 700
		priority 2
		signal $4011
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_04af
			pushi    3
			pushi    1701
			pushi    1
			pushi    1
			calle    proc13_4,  6
			jmp      code_04cf
code_04af:
			dup     
			ldi      3
			eq?     
			bnt      code_04c4
			pushi    3
			pushi    1701
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_04cf
code_04c4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_04cf:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #stopUpd
			pushi    0
			self     4
			ret     
		)
	)
)

(instance climbGoThere of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_059a
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    1701
			pushi    0
			calle    proc13_4,  4
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pToa     register
			bnt      code_057e
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			sub     
			jmp      code_0589
code_057e:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      10
			add     
code_0589:
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_05b5
code_059a:
			dup     
			ldi      1
			eq?     
			bnt      code_05b5
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    4
			pushi    0
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_05b5:
			toss    
			ret     
		)
	)
)

(instance N of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0626
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
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      55
			sub     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0638
code_0626:
			dup     
			ldi      1
			eq?     
			bnt      code_0638
			pushi    #newRoom
			pushi    1
			pushi    702
			lag      global2
			send     6
code_0638:
			toss    
			ret     
		)
	)
)

(instance S of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06a8
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
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      30
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_06ba
code_06a8:
			dup     
			ldi      1
			eq?     
			bnt      code_06ba
			pushi    #newRoom
			pushi    1
			pushi    700
			lag      global2
			send     6
code_06ba:
			toss    
			ret     
		)
	)
)

(instance enterThePicture of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_070d
			pushi    0
			callb    proc0_3,  0
			ldi      1
			aTop     cycles
			jmp      code_0728
code_070d:
			dup     
			ldi      1
			eq?     
			bnt      code_0728
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    2
			pushi    4
			pushi    0
			lag      global69
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_0728:
			toss    
			ret     
		)
	)
)
