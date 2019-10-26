;;; Sierra Script 1.0 - (do not remove this comment)
(script# 213)
(include sci.sh)
(use n000)
(use n806)
(use n946)
(use n950)
(use n996)
(use n998)
(use n999)

(public
	handCode 0
)

(local
	[local0 15]
	local15
	[local16 6]
	[local22 15]
	local37
	local38
	local39
	local40
	local41
	[local42 53] = [1956 1962 1968 1972 1978 1984 1990 1996 2000 2007 2018 2022 2027 2032 2037 2043 2049 2054 2059 2064 2071 2076 2081 2086 2091 2096 2106 2117 2125 2134 2142 2151 2156 2162 2166 2171 2176 2182 2187 2193 2201 2206 2212 2219 2227 2232 2238 2244 2252 2258 2262 2267 2275]
	[local95 10] = [2284 2290 2296 2302 2308 2314 2321 2327 2334 2340]
	[local105 28] = [133 112 151 112 152 92 166 92 166 87 180 87 181 89 182 90 195 90 197 88 211 88 200 151 156 151 141 133]
	local133 =  2346
	local134
	local135
	local136
	local137
	local138
	local139
)
(procedure (localproc_000e)
	(asm
		-al      local37
		pushi    4
		pushi    213
		pushi    0
		pushi    108
		lsl      local39
		callk    Display,  8
		lsl      local37
		ldi      0
		eq?     
		bnt      code_002e
		ldi      0
		sal      local0
		sal      local37
		jmp      code_0055
code_002e:
		pushi    3
		lea      @local0
		push    
		lsl      local37
		pushi    0
		callk    StrAt,  6
		pushi    9
		lea      @local0
		push    
		pushi    100
		pushi    115
		pushi    35
		pushi    102
		lsg      global187
		pushi    103
		lsg      global186
		pushi    107
		callk    Display,  18
		sal      local39
code_0055:
		ret     
	)
)

(procedure (localproc_0056 param1)
	(asm
		+al      local37
		pushi    4
		pushi    213
		pushi    0
		pushi    108
		lsl      local39
		callk    Display,  8
		lsl      local37
		ldi      13
		ge?     
		bnt      code_0082
		pushi    2
		lea      @local22
		push    
		lea      @local0
		push    
		callk    StrCpy,  4
		ldi      0
		sal      local0
		sal      local37
		jmp      code_00a7
code_0082:
		pushi    2
		lea      @local0
		push    
		lsp      param1
		callk    StrCat,  4
		pushi    9
		lea      @local0
		push    
		pushi    100
		pushi    115
		pushi    35
		pushi    102
		lsg      global187
		pushi    103
		lsg      global186
		pushi    107
		callk    Display,  18
		sal      local39
code_00a7:
		ret     
	)
)

(procedure (localproc_00a8 &tmp temp0 temp1)
	(asm
		ldi      0
		sat      temp0
code_00ae:
		lst      temp0
		ldi      53
		lt?     
		bnt      code_00d9
		pushi    2
		lea      @local22
		push    
		lat      temp0
		lsli     local42
		callk    StrCmp,  4
		push    
		ldi      0
		eq?     
		bnt      code_00d4
		lat      temp0
		sag      global124
		ldi      1
		sat      temp1
		jmp      code_00d9
code_00d4:
		+at      temp0
		jmp      code_00ae
code_00d9:
		pushi    2
		lea      @local22
		push    
		lsl      local15
		callk    StrCmp,  4
		push    
		ldi      0
		eq?     
		bnt      code_00f4
		pushi    1
		pushi    67
		callb    proc0_6,  2
		ldi      1
		sat      temp1
code_00f4:
		lst      temp1
		ldi      0
		eq?     
		bnt      code_0100
		ldi      55
		sag      global124
code_0100:
		ret     
	)
)

(procedure (localproc_0101 &tmp temp0 temp1)
	(asm
		ldi      22
		sat      temp1
		ldi      0
		sat      temp0
code_010b:
		lst      temp0
		ldi      10
		lt?     
		bnt      code_0128
		lsg      global140
		lat      temp1
		eq?     
		bnt      code_0121
		lat      temp0
		lali     local95
		sal      local15
code_0121:
		+at      temp1
		+at      temp0
		jmp      code_010b
code_0128:
		ret     
	)
)

(procedure (localproc_01ba param1 param2)
	(asm
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    hideMe
		push    
		lag      global5
		send     8
		lag      global5
		sal      local134
		lag      global32
		sal      local135
		lag      global10
		sal      local136
		lag      global73
		sal      local137
		lag      global72
		sal      local139
		lag      global74
		sal      local138
		ldi      0
		sag      global10
		sag      global32
		sag      global5
		sag      global74
		sag      global72
		sag      global73
		pushi    2
		lsp      param1
		lsp      param2
		callk    DrawPic,  4
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
		lofsa    newMH
		sag      global73
		send     6
		pushi    #add
		pushi    1
		lsg      global32
		lofsa    newKH
		sag      global72
		send     6
		pushi    #add
		pushi    1
		lsg      global32
		lofsa    newDH
		sag      global74
		send     6
		ret     
	)
)

(procedure (localproc_022e)
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
		pushi    #dispose
		pushi    0
		lag      global72
		send     4
		pushi    #dispose
		pushi    0
		lag      global74
		send     4
		pushi    2
		pushi    #picture
		pushi    0
		lag      global2
		send     4
		push    
		pushi    10
		callk    DrawPic,  4
		lal      local134
		sag      global5
		lal      local135
		sag      global32
		pushi    #doit
		pushi    0
		lal      local136
		sag      global10
		send     4
		lal      local137
		sag      global73
		lal      local139
		sag      global72
		lal      local138
		sag      global74
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

(instance newMH of EventHandler
	(properties)
)

(instance newKH of EventHandler
	(properties)
)

(instance newDH of EventHandler
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

(instance handCode of Code
	(properties)
	
	(method (doit)
		(asm
			lag      global19
			sal      local41
			pushi    1
			pushi    67
			callb    proc0_7,  2
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    1
			pushi    8
			lag      global69
			send     6
			lag      global34
			sal      local40
			pushi    2
			pushi    213
			pushi    10
			call     localproc_01ba,  4
			pushi    1
			pushi    115
			callb    proc0_6,  2
			pushi    #posn
			pushi    2
			pushi    180
			pushi    125
			pushi    107
			pushi    0
			lofsa    pointHand
			send     12
			pushi    #points
			pushi    1
			lea      @local105
			push    
			lofsa    polyLetter
			send     6
			pushi    4
			lofsa    letter
			push    
			lofsa    clear
			push    
			lofsa    letterbox
			push    
			lofsa    behindTheHand
			push    
			calle    proc806_3,  8
			pushi    0
			call     localproc_0101,  0
			ldi      0
			sal      local0
			pushi    #setCursor
			pushi    4
			pushi    5
			pushi    1
			pushi    180
			pushi    125
			lag      global1
			send     12
			pushi    #canInput
			pushi    1
			pushi    1
			class    User
			send     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    0
			call     localproc_022e,  0
			lal      local40
			sag      global34
			pushi    #setCursor
			pushi    4
			lsl      local41
			pushi    1
			pushi    180
			pushi    125
			lag      global1
			send     12
			pushi    #enable
			pushi    1
			pushi    8
			lag      global69
			send     6
			pushi    #dispose
			pushi    0
			super    Code,  4
			pushi    1
			pushi    115
			callb    proc0_7,  2
			pushi    1
			pushi    110
			callb    proc0_6,  2
			pushi    1
			pushi    213
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance pointHand of Actor
	(properties
		x 180
		y 125
		view 182
		loop 1
		priority 15
		signal $6810
		illegalBits $0000
	)
	
	(method (doit)
		(asm
			pushi    284
			pushi    #-info-
			lsg      global70
			lsg      global71
			ldi      10
			sub     
			push    
			self     8
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance polyLetter of Polygon
	(properties
		size 14
	)
)

(instance behindTheHand of Feature
	(properties
		nsTop 45
		nsLeft 67
		nsBottom 152
		nsRight 249
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_04bb
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
code_04bb:
			ret     
		)
	)
)

(instance letter of Feature
	(properties)
	
	(method (handleEvent pEvent &tmp temp0 [temp1 2])
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_0529
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_05eb
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0529:
			bnt      code_05eb
			pushi    3
			pushi    4
			dup     
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			callk    OnControl,  6
			sal      local38
			push    
			ldi      65518
			and     
			bnt      code_05eb
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      65535
			sat      temp0
code_0557:
			lsl      local38
			ldi      1
			and     
			not     
			bnt      code_0574
			lst      temp0
			ldi      16
			lt?     
			bnt      code_0574
			+at      temp0
			lsl      local38
			ldi      1
			shr     
			sal      local38
			jmp      code_0557
code_0574:
			lat      temp0
			sal      local38
			pushi    3
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			lofsa    polyLetter
			push    
			callk    AvoidPath,  6
			bnt      code_059b
			lsl      local38
			ldi      16
			add     
			sal      local38
code_059b:
			lsl      local38
			ldi      16
			eq?     
			bnt      code_05c1
			ldi      13
			sal      local37
			pushi    1
			pushi    0
			call     localproc_0056,  2
			pushi    0
			call     localproc_00a8,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			lofsa    handCode
			send     4
			jmp      code_05f4
code_05c1:
			pushi    3
			lea      @temp1
			push    
			pushi    0
			pushi    2
			lsl      local133
			lsl      local38
			callk    StrAt,  4
			push    
			callk    StrAt,  6
			pushi    3
			lea      @temp1
			push    
			pushi    1
			pushi    0
			callk    StrAt,  6
			pushi    1
			lea      @temp1
			push    
			call     localproc_0056,  2
			jmp      code_05f4
code_05eb:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
code_05f4:
			ret     
		)
	)
)

(instance clear of Feature
	(properties
		nsBottom 189
		nsRight 319
		onMeCheck $0010
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_0663
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_06bd
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0663:
			bnt      code_06bd
			pushi    5
			pushi    114
			pushi    35
			pushi    201
			pushi    45
			lsp      pEvent
			calle    proc999_4,  10
			not     
			bnt      code_06bd
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_06bd
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			lsl      local0
			ldi      0
			gt?     
			bnt      code_06aa
			ldi      13
			sal      local37
			pushi    1
			lst      temp0
			call     localproc_0056,  2
			pushi    0
			callb    proc0_4,  0
			jmp      code_06b2
code_06aa:
			ldi      0
			sal      local0
			pushi    0
			callb    proc0_4,  0
code_06b2:
			pushi    #dispose
			pushi    0
			lofsa    handCode
			send     4
			jmp      code_06c6
code_06bd:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
code_06c6:
			ret     
		)
	)
)

(instance letterbox of Feature
	(properties
		nsTop 15
		nsLeft 95
		nsBottom 42
		nsRight 225
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
			bt       code_0735
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_075e
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_0735:
			bnt      code_075e
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_075e
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			lal      local37
			bnt      code_0755
			pushi    0
			call     localproc_000e,  0
code_0755:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
code_075e:
			ret     
		)
	)
)
