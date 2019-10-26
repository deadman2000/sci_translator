;;; Sierra Script 1.0 - (do not remove this comment)
(script# 160)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n939)
(use n958)
(use n989)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	rm160 0
)

(local
	[local0 8]
	[local8 7] = [225 149 192 138 236 125 211]
	[local15 7] = [23 44 60 18 10 54 69]
	[local22 8] = [10 11 12 10 11 12 10]
	local30 =  10
	[local31 8] = [1160 1 1 2 3 4 1]
	[local39 6] = [1160 6 2 2 1]
	[local45 6] = [1160 9 2 1 3]
	[local51 8] = [1160 12 2 1 2 2 1]
	[local59 5] = [1160 17 2 1]
	[local64 4] = [1160 19 1]
	[local68 4] = [1160 20 1]
	[local72 4] = [1160 21 1]
	[local76 5] = [1160 22 2 1]
	[local81 6] = [1160 24 2 3 1]
	[local87 4] = [1160 27 1]
	[local91 4] = [1160 28 1]
	[local95 12] = [1161 2 2 5 3 5 5 4 1 2 1]
	[local107 7] = [1161 11 2 1 2 3]
	[local114 10] = [1161 15 3 6 2 6 4 4 1]
	[local124 6] = [1161 22 2 2 1]
	[local130 4] = [1161 25 1]
	[local134 13] = [1162 1 3 2 2 5 4 1 1 1 3 5]
	[local147 15] = [1162 13 3 4 3 2 3 2 3 2 5 1 4 4]
	[local162 8] = [1162 25 3 4 3 1 2]
	[local170 7] = [1162 30 1 1 2 2]
	[local177 9] = [1164 7 3 1 2 4 5 6]
	[local186 14] = [1164 13 3 2 1 4 5 3 5 2 1 1 5]
	[local200 10] = [1164 24 3 3 1 2 1 5 4]
	[local210 8] = [1164 31 4 1 3 1 2]
	[local218 15] = [1164 36 1 4 3 1 1 5 4 2 1 2 1 4]
	[local233 5] = [1164 29 2 1]
	[local238 11] = [1166 2 4 2 3 6 5 1 2 1]
	[local249 13] = [1166 12 4 1 2 1 4 1 3 1 1 4]
	[local262 11] = [1167 3 4 2 1 3 5 3 6 6]
	[local273 5] = [1167 17 2 1]
	[local278 8] = [1167 11 4 1 3 2 3]
	[local286 4] = [1167 16 1]
	[local290 7] = [1168 4 1 2 2 2]
	[local297 6] = [1168 8 1 2 2]
	[local303 28] = [1168 11 5 3 2 4 2 6 2 6 2 2 1 2 2 2 2 2 1 2 1 2 1 2 4 4 6]
	[local331 4] = [1168 36 2]
	[local335 10] = [1168 37 1 2 1 2 2 3 2]
	[local345 8] = [2160 3 3 1 2 2 1]
	[local353 11] = [2160 12 2 1 3 1 1 4 2 1]
	[local364 7] = [2161 2 1 4 3 2]
	[local371 6] = [2161 6 1 1 1]
	[local377 14] = [2161 9 1 4 1 3 4 2 5 1 3 1 1]
	[local391 10] = [2161 20 3 1 2 4 5 1 1]
	[local401 7] = [2161 27 3 1 2 1]
	[local408 7] = [2162 1 4 3 2 1]
	[local415 8] = [2162 5 4 4 2 5 1]
	[local423 4] = [2162 10 1]
)
(procedure (localproc_000e &tmp temp0)
	(asm
		pushi    #eachElementDo
		pushi    1
		pushi    108
		lag      global5
		send     6
		ldi      0
		sal      local30
		pushi    #drawPic
		pushi    2
		pushi    803
		pushi    9
		lag      global2
		send     8
		ret     
	)
)

(procedure (localproc_002b)
	(asm
		pushi    #init
		pushi    0
		pushi    290
		pushi    0
		lofsa    log
		send     8
		pushi    #view
		pushi    1
		pushi    147
		pushi    6
		pushi    1
		pushi    8
		pushi    4
		pushi    1
		pushi    250
		pushi    3
		pushi    1
		pushi    154
		pushi    107
		pushi    0
		lag      global0
		send     28
		pushi    #view
		pushi    1
		pushi    155
		pushi    6
		pushi    1
		pushi    3
		pushi    4
		pushi    1
		pushi    204
		pushi    3
		pushi    1
		pushi    185
		pushi    107
		pushi    0
		lofsa    tuckView
		send     28
		pushi    #view
		pushi    1
		pushi    161
		pushi    6
		pushi    1
		pushi    0
		pushi    4
		pushi    1
		pushi    162
		pushi    3
		pushi    1
		pushi    174
		pushi    107
		pushi    0
		lofsa    willView
		send     28
		pushi    #view
		pushi    1
		pushi    147
		pushi    6
		pushi    1
		pushi    4
		dup     
		pushi    1
		pushi    234
		pushi    3
		pushi    1
		pushi    152
		pushi    107
		pushi    0
		lofsa    alanView
		send     28
		pushi    #view
		pushi    1
		pushi    143
		pushi    6
		pushi    1
		pushi    4
		dup     
		pushi    1
		pushi    177
		pushi    3
		pushi    1
		pushi    147
		pushi    107
		pushi    0
		lofsa    johnView
		send     28
		pushi    #view
		pushi    1
		pushi    147
		pushi    6
		pushi    1
		pushi    5
		pushi    7
		pushi    1
		pushi    1
		pushi    4
		pushi    1
		pushi    144
		pushi    3
		pushi    1
		pushi    153
		pushi    107
		pushi    0
		lofsa    muchView
		send     34
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    alanView
		send     6
		pushi    #number
		pushi    1
		pushi    161
		pushi    6
		pushi    1
		pushi    65535
		pushi    42
		pushi    0
		lag      global113
		send     16
		ret     
	)
)

(procedure (localproc_0110)
	(asm
		pushi    #init
		pushi    0
		pushi    290
		pushi    0
		lofsa    log
		send     8
		pushi    #view
		pushi    1
		pushi    143
		pushi    6
		pushi    1
		pushi    5
		pushi    4
		pushi    1
		pushi    169
		pushi    3
		pushi    1
		pushi    151
		pushi    107
		pushi    0
		lag      global0
		send     28
		pushi    #view
		pushi    1
		pushi    155
		pushi    6
		pushi    1
		pushi    3
		pushi    4
		pushi    1
		pushi    202
		pushi    3
		pushi    1
		pushi    180
		pushi    107
		pushi    0
		lofsa    tuckView
		send     28
		pushi    #view
		pushi    1
		pushi    161
		pushi    6
		pushi    1
		pushi    1
		pushi    4
		pushi    1
		pushi    259
		pushi    3
		pushi    1
		pushi    172
		pushi    107
		pushi    0
		lofsa    willView
		send     28
		pushi    #view
		pushi    1
		pushi    147
		pushi    6
		pushi    1
		pushi    4
		dup     
		pushi    1
		pushi    234
		pushi    3
		pushi    1
		pushi    152
		pushi    107
		pushi    0
		lofsa    alanView
		send     28
		pushi    #view
		pushi    1
		pushi    143
		pushi    6
		pushi    1
		pushi    4
		pushi    7
		pushi    1
		pushi    5
		pushi    4
		pushi    1
		pushi    115
		pushi    3
		pushi    1
		pushi    155
		pushi    107
		pushi    0
		lofsa    johnView
		send     34
		pushi    #view
		pushi    1
		pushi    147
		pushi    6
		pushi    1
		pushi    5
		pushi    4
		pushi    1
		pushi    153
		pushi    3
		pushi    1
		pushi    185
		pushi    107
		pushi    0
		lofsa    muchView
		send     28
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    alanView
		send     6
		pushi    #number
		pushi    1
		pushi    162
		pushi    6
		pushi    1
		pushi    65535
		pushi    42
		pushi    0
		lag      global113
		send     16
		ret     
	)
)

(procedure (localproc_01f6)
	(asm
		pushi    #setCycle
		pushi    1
		class    Fwd
		push    
		lofsa    alanView
		send     6
		pushi    #number
		pushi    1
		pushi    161
		pushi    6
		pushi    1
		pushi    65535
		pushi    42
		pushi    0
		lag      global113
		send     16
		ret     
	)
)

(procedure (localproc_04b0 &tmp temp0)
	(asm
		ldi      0
		sat      temp0
code_04b6:
		lst      temp0
		ldi      7
		lt?     
		bnt      code_04ed
		pushi    #new
		pushi    0
		class    Prop
		send     4
		push    
		lat      temp0
		sali     local0
		pushi    #view
		pushi    1
		pushi    147
		pushi    6
		pushi    1
		lat      temp0
		lsli     local22
		pushi    4
		pushi    1
		lsli     local8
		pushi    3
		pushi    1
		lsli     local15
		pushi    107
		pushi    0
		lali     local0
		send     28
		+at      temp0
		jmp      code_04b6
code_04ed:
		pushi    #setScript
		pushi    1
		lofsa    stars
		push    
		lal      local0
		send     6
		ret     
	)
)

(instance rm160 of Rm
	(properties
		picture 803
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			ldi      0
			sag      global142
			ldi      0
			sag      global149
			ldi      0
			sag      global159
			ldi      0
			sag      global150
			ldi      0
			sag      global160
			ldi      0
			sag      global167
			pushi    1
			pushi    71
			callb    proc0_7,  2
			pushi    1
			pushi    129
			callb    proc0_7,  2
			pushi    1
			pushi    185
			callb    proc0_7,  2
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #number
			pushi    1
			pushi    160
			pushi    6
			pushi    1
			pushi    65535
			pushi    107
			pushi    0
			pushi    42
			pushi    0
			lag      global100
			send     20
			ldi      0
			sag      global126
			pushi    142
			pushi    1
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_0277
			lofsa    nightOne
			jmp      code_036d
code_0277:
			dup     
			ldi      2
			eq?     
			bnt      code_0284
			lofsa    night2
			jmp      code_036d
code_0284:
			dup     
			ldi      3
			eq?     
			bnt      code_0291
			lofsa    night3
			jmp      code_036d
code_0291:
			dup     
			ldi      4
			eq?     
			bnt      code_029e
			lofsa    night4
			jmp      code_036d
code_029e:
			dup     
			ldi      5
			eq?     
			bnt      code_02de
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_02b5
			lofsa    nightFive
			jmp      code_036d
code_02b5:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_02c4
			lofsa    boysStealthSaved
			jmp      code_036d
code_02c4:
			lsg      global12
			ldi      250
			eq?     
			bnt      code_02d3
			lofsa    boysBattleSaved
			jmp      code_036d
code_02d3:
			ldi      1
			bnt      code_036d
			lofsa    battleWO
			jmp      code_036d
code_02de:
			dup     
			ldi      6
			eq?     
			bnt      code_031d
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_02f4
			lofsa    nightSix
			jmp      code_036d
code_02f4:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_0303
			lofsa    boysStealthSaved
			jmp      code_036d
code_0303:
			lsg      global12
			ldi      250
			eq?     
			bnt      code_0312
			lofsa    boysBattleSaved
			jmp      code_036d
code_0312:
			ldi      1
			bnt      code_036d
			lofsa    battleWO
			jmp      code_036d
code_031d:
			dup     
			ldi      7
			eq?     
			bnt      code_032a
			lofsa    night7
			jmp      code_036d
code_032a:
			dup     
			ldi      8
			eq?     
			bnt      code_0337
			lofsa    night8
			jmp      code_036d
code_0337:
			dup     
			ldi      9
			eq?     
			bnt      code_0344
			lofsa    night9
			jmp      code_036d
code_0344:
			dup     
			ldi      10
			eq?     
			bnt      code_0351
			lofsa    night10
			jmp      code_036d
code_0351:
			dup     
			ldi      11
			eq?     
			bnt      code_035e
			lofsa    night11
			jmp      code_036d
code_035e:
			dup     
			ldi      12
			eq?     
			bnt      code_036b
			lofsa    night12
			jmp      code_036d
code_036b:
			ldi      0
code_036d:
			toss    
			push    
			self     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Rm,  4
			pushi    4
			pushi    6
			pushi    236
			pushi    254
			pushi    1
			callk    Palette,  8
			ret     
		)
	)
	
	(method (dispose &tmp temp0)
		(asm
			+ag      global130
			ldi      0
			sag      global150
			pushi    1
			pushi    66
			callb    proc0_7,  2
			pushi    #stop
			pushi    0
			lag      global100
			send     4
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #curIcon
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			sat      temp0
			push    
			lag      global69
			send     6
			pushi    #cursor
			pushi    0
			lat      temp0
			send     4
			sag      global19
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance stars of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0441
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
			pushi    #init
			pushi    0
			lofsa    firePit
			send     4
			ldi      1
			aTop     cycles
			jmp      code_0474
code_0441:
			dup     
			ldi      1
			eq?     
			bnt      code_0474
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    6
			pushi    18
			callk    Random,  4
			push    
			pushi    150
			pushi    2
			class    Osc
			push    
			pushi    1
			pushi    2
			pushi    0
			pushi    6
			callk    Random,  4
			lali     local0
			send     14
			pushi    2
			pushi    18
			pushi    58
			callk    Random,  4
			aTop     ticks
			dpToa    state
code_0474:
			toss    
			ret     
		)
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 param4 param5)
		(asm
			pushi    #setCursor
			pushi    4
			lsg      global21
			pushi    1
			pushi    310
			pushi    185
			lag      global1
			send     12
			ldi      1
			aTop     register
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
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #addToFront
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    2
			pushi    129
			pushi    160
			callk    Load,  4
			pushi    9
			pushi    128
			pushi    140
			pushi    143
			pushi    147
			pushi    158
			pushi    161
			pushi    164
			pushi    152
			pushi    155
			calle    proc958_0,  18
			ret     
		)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 [temp4 256])
		(asm
			lap      newState
			aTop     state
			push    
			pToa     start
			le?     
			bnt      code_06c8
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    9
			lag      global2
			send     8
			pushi    3
			pTos     register
			pTos     state
			lea      @temp4
			push    
			callk    GetFarText,  6
			lea      @temp4
			sat      temp2
			ldi      0
			sat      temp3
			ldi      1
			sat      temp1
			pushi    1
			lst      temp2
			callk    StrLen,  2
			push    
			ldi      32
			lt?     
			bnt      code_060d
			pushi    1
			lst      temp2
			callk    StrLen,  2
			sat      temp0
			jmp      code_0611
code_060d:
			ldi      32
			sat      temp0
code_0611:
			lst      temp1
			ldi      0
			ne?     
			bnt      code_06bb
			pushi    2
			lea      @temp4
			push    
			lst      temp0
			callk    StrAt,  4
			sat      temp1
			pushi    6
			push    
			pushi    32
			pushi    9
			pushi    10
			pushi    13
			pushi    0
			calle    proc999_5,  12
			bnt      code_06b6
			pushi    3
			lea      @temp4
			push    
			lst      temp0
			pushi    0
			callk    StrAt,  6
			pushi    6
			lst      temp2
			pushi    100
			pushi    45
			pushi    40
			pushi    13
			lat      temp3
			mul     
			add     
			push    
			pushi    102
			lsg      global185
			callk    Display,  12
			lat      temp1
			bnt      code_0611
code_0663:
			pushi    6
			pushi    2
			lea      @temp4
			push    
			+at      temp0
			push    
			callk    StrAt,  4
			push    
			pushi    32
			pushi    9
			pushi    10
			pushi    13
			pushi    0
			calle    proc999_5,  12
			bnt      code_0686
			jmp      code_0663
code_0686:
			lea      @temp4
			push    
			lat      temp0
			add     
			sat      temp2
			+at      temp3
			pushi    1
			lst      temp2
			callk    StrLen,  2
			push    
			ldi      32
			lt?     
			bnt      code_06ac
			lst      temp0
			pushi    1
			lst      temp2
			callk    StrLen,  2
			add     
			sat      temp0
			jmp      code_0611
code_06ac:
			lst      temp0
			ldi      32
			add     
			sat      temp0
			jmp      code_0611
code_06b6:
			+at      temp0
			jmp      code_0611
code_06bb:
			lsg      global162
			lsg      global163
			lat      temp0
			mul     
			add     
			aTop     ticks
			jmp      code_06ef
code_06c8:
			pushi    #delete
			pushi    1
			pushSelf
			lag      global72
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      global73
			send     6
			pushi    0
			call     localproc_04b0,  0
			pushi    #drawPic
			pushi    2
			pushi    160
			pushi    9
			lag      global2
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_06ef:
			ret     
		)
	)
	
	(method (cue)
		(asm
			pToa     register
			not     
			bnt      code_054f
			pToa     state
			aTop     start
code_054f:
			pushi    #cue
			pushi    0
			super    Script,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
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
			bnt      code_051b
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
code_051b:
			bt       code_0537
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_053e
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
code_0537:
			bnt      code_053e
			ldi      0
			aTop     register
code_053e:
			pushi    #cue
			pushi    0
			self     4
			ret     
		)
	)
)

(instance marian of Prop
	(properties
		x 233
		y 146
		view 147
		loop 6
		cycleSpeed 7
	)
)

(instance firePit of Prop
	(properties
		x 222
		y 159
		view 140
		signal $4000
	)
	
	(method (init)
		(asm
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (cue &tmp temp0)
		(asm
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			sat      temp0
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    6
			pushi    18
			callk    Random,  4
			push    
			self     6
			lat      temp0
			bnt      code_07d8
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			self     8
			jmp      code_07e2
code_07d8:
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			self     8
code_07e2:
			pushi    #cue
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance log of View
	(properties
		x 246
		y 148
		view 143
		loop 1
		priority 8
		signal $4010
	)
)

(instance tuckView of View
	(properties
		x 270
		y 173
		view 155
		loop 1
	)
)

(instance johnView of Actor
	(properties
		x 229
		y 183
		view 152
		loop 3
	)
)

(instance willView of View
	(properties
		x 208
		y 151
		view 161
		loop 1
	)
)

(instance alanView of Prop
	(properties
		x 164
		y 148
		view 158
		cycleSpeed 36
	)
)

(instance muchView of View
	(properties
		x 189
		y 166
		view 164
		loop 3
	)
)

(instance nightOne of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ad0
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1160
			pushi    0
			pushi    0
			self     14
			jmp      code_0ee2
code_0ad0:
			dup     
			ldi      1
			eq?     
			bnt      code_0bb1
			ldi      1
			aTop     notKilled
			pushi    #posn
			pushi    2
			pushi    246
			pushi    148
			pushi    107
			pushi    0
			pushi    290
			pushi    0
			lofsa    log
			send     16
			pushi    #view
			pushi    1
			pushi    143
			pushi    6
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    159
			pushi    3
			pushi    1
			pushi    162
			pushi    219
			pushi    1
			pushi    18
			pushi    107
			pushi    0
			lag      global0
			send     34
			pushi    #view
			pushi    1
			pushi    143
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    257
			pushi    3
			pushi    1
			pushi    153
			pushi    107
			pushi    0
			lofsa    tuckView
			send     28
			pushi    #view
			pushi    1
			pushi    143
			pushi    6
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    132
			pushi    3
			pushi    1
			pushi    169
			pushi    107
			pushi    0
			lofsa    johnView
			send     28
			pushi    #x
			pushi    1
			pushi    212
			pushi    3
			pushi    1
			pushi    180
			pushi    107
			pushi    0
			lofsa    willView
			send     16
			pushi    5
			pushi    1
			pushi    #ticksToDo
			pushi    6
			pushi    1
			pushi    4
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    log
			send     4
			push    
			ldi      65524
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    log
			send     4
			push    
			ldi      2
			add     
			push    
			pushi    107
			pushi    0
			lofsa    alanView
			send     24
			pushi    #x
			pushi    1
			pushi    159
			pushi    3
			pushi    1
			pushi    188
			pushi    107
			pushi    0
			lofsa    muchView
			send     16
			ldi      2
			aTop     cycles
			jmp      code_0ee2
code_0bb1:
			dup     
			ldi      2
			eq?     
			bnt      code_0bdb
			pushi    0
			call     localproc_01f6,  0
			pushi    11
			pushi    4
			lea      @local31
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_0ee2
code_0bdb:
			dup     
			ldi      3
			eq?     
			bnt      code_0bf3
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0bf3:
			dup     
			ldi      4
			eq?     
			bnt      code_0c11
			pushi    7
			pushi    2
			lea      @local39
			push    
			pushi    15
			pushi    0
			pushi    14
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ee2
code_0c11:
			dup     
			ldi      5
			eq?     
			bnt      code_0c29
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0c29:
			dup     
			ldi      6
			eq?     
			bnt      code_0c7b
			pushi    1
			pushi    75
			callb    proc0_5,  2
			bnt      code_0c53
			pushi    9
			pushi    3
			lea      @local45
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    1
			pushi    15
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ee2
code_0c53:
			pushi    1
			pushi    103
			callb    proc0_5,  2
			bnt      code_0c72
			pushi    7
			pushi    2
			lea      @local51
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ee2
code_0c72:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ee2
code_0c7b:
			dup     
			ldi      7
			eq?     
			bnt      code_0ca4
			pushi    1
			pushi    103
			callb    proc0_5,  2
			bnt      code_0c9b
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			ldi      3
			aTop     seconds
			jmp      code_0ee2
code_0c9b:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ee2
code_0ca4:
			dup     
			ldi      8
			eq?     
			bnt      code_0cd3
			pushi    1
			pushi    103
			callb    proc0_5,  2
			bnt      code_0cca
			pushi    7
			pushi    2
			lea      @local59
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ee2
code_0cca:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0ee2
code_0cd3:
			dup     
			ldi      9
			eq?     
			bnt      code_0cf7
			pToa     notKilled
			bnt      code_0cf0
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0cf0:
			ldi      1
			aTop     cycles
			jmp      code_0ee2
code_0cf7:
			dup     
			ldi      10
			eq?     
			bnt      code_0d10
			pushi    4
			lea      @local64
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ee2
code_0d10:
			dup     
			ldi      11
			eq?     
			bnt      code_0d34
			pToa     notKilled
			bnt      code_0d2d
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0d2d:
			ldi      1
			aTop     cycles
			jmp      code_0ee2
code_0d34:
			dup     
			ldi      12
			eq?     
			bnt      code_0d4d
			pushi    4
			lea      @local68
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ee2
code_0d4d:
			dup     
			ldi      13
			eq?     
			bnt      code_0d71
			pToa     notKilled
			bnt      code_0d6a
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0d6a:
			ldi      1
			aTop     cycles
			jmp      code_0ee2
code_0d71:
			dup     
			ldi      14
			eq?     
			bnt      code_0d8a
			pushi    4
			lea      @local72
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ee2
code_0d8a:
			dup     
			ldi      15
			eq?     
			bnt      code_0dae
			pToa     notKilled
			bnt      code_0da7
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0da7:
			ldi      1
			aTop     cycles
			jmp      code_0ee2
code_0dae:
			dup     
			ldi      16
			eq?     
			bnt      code_0dcc
			pushi    7
			pushi    2
			lea      @local76
			push    
			pushi    1
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ee2
code_0dcc:
			dup     
			ldi      17
			eq?     
			bnt      code_0df0
			pToa     notKilled
			bnt      code_0de9
			pushi    #setCycle
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     10
			jmp      code_0ee2
code_0de9:
			ldi      1
			aTop     cycles
			jmp      code_0ee2
code_0df0:
			dup     
			ldi      18
			eq?     
			bnt      code_0e11
			pushi    9
			pushi    3
			lea      @local81
			push    
			pushi    1
			pushi    0
			pushi    16
			pushi    1
			pushi    17
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ee2
code_0e11:
			dup     
			ldi      19
			eq?     
			bnt      code_0e37
			pushi    #view
			pushi    1
			pushi    145
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     28
			jmp      code_0ee2
code_0e37:
			dup     
			ldi      20
			eq?     
			bnt      code_0e50
			pushi    4
			lea      @local87
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ee2
code_0e50:
			dup     
			ldi      21
			eq?     
			bnt      code_0e78
			pushi    #dispose
			pushi    0
			lag      global0
			send     4
			pushi    #view
			pushi    1
			pushi    145
			pushi    6
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    johnView
			send     20
			jmp      code_0ee2
code_0e78:
			dup     
			ldi      22
			eq?     
			bnt      code_0e93
			pushi    5
			pushi    1
			lea      @local91
			push    
			pushi    13
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ee2
code_0e93:
			dup     
			ldi      23
			eq?     
			bnt      code_0ec1
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    128
			pushi    157
			pushSelf
			lofsa    johnView
			send     30
			jmp      code_0ee2
code_0ec1:
			dup     
			ldi      24
			eq?     
			bnt      code_0ee2
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_0ee2:
			toss    
			ret     
		)
	)
)

(instance night2 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f5d
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_0f49
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1161
			pushi    1
			pushi    1
			self     14
			jmp      code_105f
code_0f49:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1161
			pushi    0
			pushi    0
			self     14
			jmp      code_105f
code_0f5d:
			dup     
			ldi      1
			eq?     
			bnt      code_0f81
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_0f75
			pushi    0
			call     localproc_002b,  0
			jmp      code_0f7a
code_0f75:
			pushi    0
			call     localproc_0110,  0
code_0f7a:
			ldi      2
			aTop     seconds
			jmp      code_105f
code_0f81:
			dup     
			ldi      2
			eq?     
			bnt      code_0fc8
			pushi    15
			pushi    6
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_0f9b
			lea      @local114
			jmp      code_0f9e
code_0f9b:
			lea      @local95
code_0f9e:
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    13
			pushi    2
			pushi    14
			pushi    3
			dup     
			pushi    0
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  30
			pushi    #has
			pushi    1
			pushi    3
			lag      global0
			send     6
			bnt      code_105f
			ipToa    state
			jmp      code_105f
code_0fc8:
			dup     
			ldi      3
			eq?     
			bnt      code_1002
			pushi    9
			pushi    3
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_0fe2
			lea      @local124
			jmp      code_0fe5
code_0fe2:
			lea      @local107
code_0fe5:
			push    
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  18
			pushi    #get
			pushi    1
			pushi    3
			lag      global0
			send     6
			jmp      code_105f
code_1002:
			dup     
			ldi      4
			eq?     
			bnt      code_102b
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_1024
			pushi    4
			lea      @local130
			push    
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_105f
code_1024:
			ldi      1
			aTop     cycles
			jmp      code_105f
code_102b:
			dup     
			ldi      5
			eq?     
			bnt      code_103e
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_105f
code_103e:
			dup     
			ldi      6
			eq?     
			bnt      code_105f
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_105f:
			toss    
			ret     
		)
	)
)

(instance night3 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10bc
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1162
			pushi    0
			pushi    0
			self     14
			jmp      code_112a
code_10bc:
			dup     
			ldi      1
			eq?     
			bnt      code_10cf
			pushi    0
			call     localproc_0110,  0
			ldi      2
			aTop     seconds
			jmp      code_112a
code_10cf:
			dup     
			ldi      2
			eq?     
			bnt      code_10f6
			pushi    13
			pushi    5
			lea      @local134
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			dup     
			pushi    0
			pushSelf
			calle    proc851_0,  26
			jmp      code_112a
code_10f6:
			dup     
			ldi      3
			eq?     
			bnt      code_1109
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_112a
code_1109:
			dup     
			ldi      4
			eq?     
			bnt      code_112a
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_112a:
			toss    
			ret     
		)
	)
)

(instance night4 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11b0
			pushi    1
			pushi    153
			callb    proc0_5,  2
			bt       code_1183
			pushi    1
			pushi    174
			callb    proc0_5,  2
code_1183:
			bnt      code_119b
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1162
			pushi    11
			dup     
			self     14
			jmp      code_12b4
code_119b:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1162
			pushi    12
			dup     
			self     14
			jmp      code_12b4
code_11b0:
			dup     
			ldi      1
			eq?     
			bnt      code_11d5
			pushi    1
			pushi    184
			callb    proc0_5,  2
			bnt      code_11c9
			pushi    0
			call     localproc_002b,  0
			jmp      code_11ce
code_11c9:
			pushi    0
			call     localproc_0110,  0
code_11ce:
			ldi      2
			aTop     seconds
			jmp      code_12b4
code_11d5:
			dup     
			ldi      2
			eq?     
			bnt      code_1224
			pushi    1
			pushi    184
			callb    proc0_5,  2
			bnt      code_1204
			pushi    11
			pushi    4
			lea      @local162
			push    
			pushi    2
			pushi    0
			pushi    14
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_12b4
code_1204:
			pushi    13
			pushi    5
			lea      @local147
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			dup     
			pushi    0
			pushSelf
			calle    proc851_0,  26
			jmp      code_12b4
code_1224:
			dup     
			ldi      3
			eq?     
			bnt      code_124e
			pushi    1
			pushi    184
			callb    proc0_5,  2
			bnt      code_1245
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			ldi      3
			aTop     seconds
			jmp      code_12b4
code_1245:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_12b4
code_124e:
			dup     
			ldi      4
			eq?     
			bnt      code_1280
			pushi    1
			pushi    184
			callb    proc0_5,  2
			bnt      code_1277
			pushi    7
			pushi    2
			lea      @local170
			push    
			pushi    16
			pushi    2
			pushi    15
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_12b4
code_1277:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_12b4
code_1280:
			dup     
			ldi      5
			eq?     
			bnt      code_1293
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_12b4
code_1293:
			dup     
			ldi      6
			eq?     
			bnt      code_12b4
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_12b4:
			toss    
			ret     
		)
	)
)

(instance boysStealthSaved of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1310
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1164
			pushi    1
			pushi    1
			self     14
			jmp      code_1386
code_1310:
			dup     
			ldi      1
			eq?     
			bnt      code_1323
			pushi    0
			call     localproc_0110,  0
			ldi      2
			aTop     cycles
			jmp      code_1386
code_1323:
			dup     
			ldi      2
			eq?     
			bnt      code_134c
			pushi    13
			pushi    5
			lea      @local200
			push    
			pushi    3
			pushi    0
			pushi    15
			pushi    1
			pushi    16
			pushi    2
			pushi    14
			pushi    3
			pushi    13
			pushi    1
			pushSelf
			calle    proc851_0,  26
			jmp      code_1386
code_134c:
			dup     
			ldi      3
			eq?     
			bnt      code_135f
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_1386
code_135f:
			dup     
			ldi      4
			eq?     
			bnt      code_1386
			pushi    1
			pushi    125
			callb    proc0_7,  2
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1386:
			toss    
			ret     
		)
	)
)

(instance boysBattleSaved of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13e2
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1164
			pushi    2
			pushi    2
			self     14
			jmp      code_146c
code_13e2:
			dup     
			ldi      1
			eq?     
			bnt      code_13f5
			pushi    0
			call     localproc_002b,  0
			ldi      2
			aTop     cycles
			jmp      code_146c
code_13f5:
			dup     
			ldi      2
			eq?     
			bnt      code_141a
			pushi    11
			pushi    4
			lea      @local210
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    15
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_146c
code_141a:
			dup     
			ldi      3
			eq?     
			bnt      code_1438
			pushi    7
			pushi    2
			lea      @local233
			push    
			pushi    14
			pushi    0
			pushi    13
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_146c
code_1438:
			dup     
			ldi      4
			eq?     
			bnt      code_144b
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_146c
code_144b:
			dup     
			ldi      5
			eq?     
			bnt      code_146c
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_146c:
			toss    
			ret     
		)
	)
)

(instance battleWO of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_14ca
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1164
			pushi    3
			pushi    5
			self     14
			jmp      code_1542
code_14ca:
			dup     
			ldi      1
			eq?     
			bnt      code_14e6
			pushi    1
			pushi    65532
			calle    proc806_5,  2
			pushi    0
			call     localproc_002b,  0
			ldi      2
			aTop     cycles
			jmp      code_1542
code_14e6:
			dup     
			ldi      2
			eq?     
			bnt      code_150e
			pushi    13
			pushi    5
			lea      @local218
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    17
			pushi    2
			pushi    13
			pushi    3
			pushi    15
			pushi    2
			pushSelf
			calle    proc851_0,  26
			jmp      code_1542
code_150e:
			dup     
			ldi      3
			eq?     
			bnt      code_1521
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_1542
code_1521:
			dup     
			ldi      4
			eq?     
			bnt      code_1542
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1542:
			toss    
			ret     
		)
	)
)

(instance nightFive of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_159e
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1164
			pushi    0
			pushi    0
			self     14
			jmp      code_1600
code_159e:
			dup     
			ldi      1
			eq?     
			bnt      code_15b1
			pushi    0
			call     localproc_0110,  0
			ldi      2
			aTop     cycles
			jmp      code_1600
code_15b1:
			dup     
			ldi      2
			eq?     
			bnt      code_15db
			pushi    15
			pushi    6
			lea      @local177
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    14
			pushi    2
			pushi    16
			pushi    3
			pushi    13
			pushi    2
			pushi    2
			pushi    0
			pushSelf
			calle    proc851_0,  30
			jmp      code_1600
code_15db:
			dup     
			ldi      3
			eq?     
			bnt      code_15ee
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_1600
code_15ee:
			dup     
			ldi      4
			eq?     
			bnt      code_1600
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1600:
			toss    
			ret     
		)
	)
)

(instance nightSix of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_165d
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1164
			pushi    6
			dup     
			self     14
			jmp      code_16cc
code_165d:
			dup     
			ldi      1
			eq?     
			bnt      code_1670
			pushi    0
			call     localproc_0110,  0
			ldi      2
			aTop     cycles
			jmp      code_16cc
code_1670:
			dup     
			ldi      2
			eq?     
			bnt      code_1698
			pushi    13
			pushi    5
			lea      @local186
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  26
			jmp      code_16cc
code_1698:
			dup     
			ldi      3
			eq?     
			bnt      code_16ab
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_16cc
code_16ab:
			dup     
			ldi      4
			eq?     
			bnt      code_16cc
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_16cc:
			toss    
			ret     
		)
	)
)

(instance night7 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1745
			pushi    1
			pushi    120
			callb    proc0_5,  2
			bnt      code_1731
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1166
			pushi    0
			pushi    0
			self     14
			jmp      code_1803
code_1731:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1166
			pushi    1
			pushi    1
			self     14
			jmp      code_1803
code_1745:
			dup     
			ldi      1
			eq?     
			bnt      code_1769
			pushi    1
			pushi    120
			callb    proc0_5,  2
			bnt      code_175d
			pushi    0
			call     localproc_0110,  0
			jmp      code_1762
code_175d:
			pushi    0
			call     localproc_002b,  0
code_1762:
			ldi      2
			aTop     cycles
			jmp      code_1803
code_1769:
			dup     
			ldi      2
			eq?     
			bnt      code_17a3
			pushi    15
			pushi    6
			pushi    1
			pushi    120
			callb    proc0_5,  2
			bnt      code_1783
			lea      @local238
			jmp      code_1786
code_1783:
			lea      @local249
code_1786:
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			pushi    14
			pushi    2
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  30
			jmp      code_1803
code_17a3:
			dup     
			ldi      3
			eq?     
			bnt      code_17b6
			pushi    0
			call     localproc_000e,  0
			ldi      60
			aTop     ticks
			jmp      code_1803
code_17b6:
			dup     
			ldi      4
			eq?     
			bnt      code_17cc
			pushi    3
			pushi    1166
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_1803
code_17cc:
			dup     
			ldi      5
			eq?     
			bnt      code_17e2
			pushi    3
			pushi    1166
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_1803
code_17e2:
			dup     
			ldi      6
			eq?     
			bnt      code_1803
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1803:
			toss    
			ret     
		)
	)
)

(instance night8 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_187d
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_1869
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1167
			pushi    0
			pushi    1
			self     14
			jmp      code_1987
code_1869:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1167
			pushi    2
			pushi    2
			self     14
			jmp      code_1987
code_187d:
			dup     
			ldi      1
			eq?     
			bnt      code_18a1
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_1895
			pushi    0
			call     localproc_0110,  0
			jmp      code_189a
code_1895:
			pushi    0
			call     localproc_002b,  0
code_189a:
			ldi      2
			aTop     cycles
			jmp      code_1987
code_18a1:
			dup     
			ldi      2
			eq?     
			bnt      code_18fe
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_18de
			pushi    15
			pushi    6
			lea      @local262
			push    
			pushi    3
			pushi    0
			pushi    15
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			pushi    14
			pushi    1
			pushi    1
			pushi    0
			pushSelf
			calle    proc851_0,  30
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_1987
code_18de:
			pushi    11
			pushi    4
			lea      @local278
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    16
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_1987
code_18fe:
			dup     
			ldi      3
			eq?     
			bnt      code_1916
			pushi    #setLoop
			pushi    1
			pushi    0
			lofsa    willView
			send     6
			ldi      24
			aTop     ticks
			jmp      code_1987
code_1916:
			dup     
			ldi      4
			eq?     
			bnt      code_1932
			pushi    4
			lea      @local286
			push    
			pushi    15
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1987
code_1932:
			dup     
			ldi      5
			eq?     
			bnt      code_1953
			pushi    7
			pushi    2
			lea      @local273
			push    
			pushi    3
			pushi    0
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  14
			jmp      code_1987
code_1953:
			dup     
			ldi      6
			eq?     
			bnt      code_1966
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_1987
code_1966:
			dup     
			ldi      7
			eq?     
			bnt      code_1987
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1987:
			toss    
			ret     
		)
	)
)

(instance night9 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1a02
			pushi    1
			pushi    122
			callb    proc0_5,  2
			bnt      code_19ed
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1168
			pushi    0
			pushi    1
			self     14
			jmp      code_1b67
code_19ed:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    1168
			pushi    2
			pushi    3
			self     14
			jmp      code_1b67
code_1a02:
			dup     
			ldi      1
			eq?     
			bnt      code_1a92
			pushi    0
			call     localproc_0110,  0
			pushi    #view
			pushi    1
			pushi    147
			pushi    6
			pushi    1
			pushi    7
			pushi    4
			pushi    1
			pushi    251
			pushi    3
			pushi    1
			pushi    149
			lag      global0
			send     24
			pushi    #view
			pushi    1
			pushi    147
			pushi    6
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    233
			pushi    3
			pushi    1
			pushi    146
			pushi    107
			pushi    0
			lofsa    marian
			send     34
			pushi    #view
			pushi    1
			pushi    147
			pushi    6
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    81
			pushi    3
			pushi    1
			pushi    142
			pushi    63
			pushi    1
			pushi    15
			pushi    17
			pushi    1
			pushi    16
			lofsa    alanView
			send     36
			pushi    #view
			pushi    1
			pushi    161
			pushi    6
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    149
			lofsa    willView
			send     24
			ldi      2
			aTop     cycles
			jmp      code_1b67
code_1a92:
			dup     
			ldi      2
			eq?     
			bnt      code_1ac2
			pushi    7
			pushi    2
			pushi    1
			pushi    122
			callb    proc0_5,  2
			bnt      code_1aad
			lea      @local290
			jmp      code_1ab2
code_1aad:
			lea      @local297
code_1ab2:
			push    
			pushi    1
			pushi    0
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1b67
code_1ac2:
			dup     
			ldi      3
			eq?     
			bnt      code_1b1e
			pushi    15
			pushi    6
			lea      @local303
			push    
			pushi    1
			pushi    0
			pushi    22
			pushi    1
			pushi    14
			pushi    2
			pushi    15
			pushi    3
			pushi    13
			pushi    0
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  30
			pushi    #has
			pushi    1
			pushi    12
			lag      global0
			send     6
			bt       code_1b16
			pushi    1
			pushi    101
			callb    proc0_5,  2
			bt       code_1b16
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			ldi      140
			eq?     
code_1b16:
			bnt      code_1b67
			ipToa    state
			jmp      code_1b67
code_1b1e:
			dup     
			ldi      4
			eq?     
			bnt      code_1b33
			pushi    #setScript
			pushi    2
			lofsa    getPuzzBox
			push    
			pushSelf
			self     8
			jmp      code_1b67
code_1b33:
			dup     
			ldi      5
			eq?     
			bnt      code_1b46
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_1b67
code_1b46:
			dup     
			ldi      6
			eq?     
			bnt      code_1b67
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1b67:
			toss    
			ret     
		)
	)
)

(instance getPuzzBox of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1bc8
			pushi    7
			pushi    2
			lea      @local331
			push    
			pushi    1
			pushi    0
			pushi    22
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1c7a
code_1bc8:
			dup     
			ldi      1
			eq?     
			bnt      code_1bd6
			ldi      2
			aTop     seconds
			jmp      code_1c7a
code_1bd6:
			dup     
			ldi      2
			eq?     
			bnt      code_1bf1
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    marian
			send     8
			ldi      13
			aTop     ticks
			jmp      code_1c7a
code_1bf1:
			dup     
			ldi      3
			eq?     
			bnt      code_1c07
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_1c7a
code_1c07:
			dup     
			ldi      4
			eq?     
			bnt      code_1c11
			jmp      code_1c7a
code_1c11:
			dup     
			ldi      5
			eq?     
			bnt      code_1c1f
			ldi      27
			aTop     ticks
			jmp      code_1c7a
code_1c1f:
			dup     
			ldi      6
			eq?     
			bnt      code_1c41
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    marian
			send     8
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lag      global0
			send     6
			jmp      code_1c7a
code_1c41:
			dup     
			ldi      7
			eq?     
			bnt      code_1c6e
			pushi    #get
			pushi    1
			pushi    12
			lag      global0
			send     6
			pushi    9
			pushi    3
			lea      @local335
			push    
			pushi    1
			pushi    0
			pushi    22
			pushi    1
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  18
			jmp      code_1c7a
code_1c6e:
			dup     
			ldi      8
			eq?     
			bnt      code_1c7a
			pushi    #dispose
			pushi    0
			self     4
code_1c7a:
			toss    
			ret     
		)
	)
)

(instance night10 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1cf3
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_1cdf
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    2160
			pushi    0
			pushi    1
			self     14
			jmp      code_1dff
code_1cdf:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    2160
			pushi    2
			pushi    2
			self     14
			jmp      code_1dff
code_1cf3:
			dup     
			ldi      1
			eq?     
			bnt      code_1d17
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_1d0b
			pushi    0
			call     localproc_0110,  0
			jmp      code_1d10
code_1d0b:
			pushi    0
			call     localproc_002b,  0
code_1d10:
			ldi      2
			aTop     seconds
			jmp      code_1dff
code_1d17:
			dup     
			ldi      2
			eq?     
			bnt      code_1d63
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_1d47
			pushi    11
			pushi    4
			lea      @local353
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    14
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_1dff
code_1d47:
			pushi    9
			pushi    3
			lea      @local345
			push    
			pushi    2
			pushi    0
			pushi    14
			pushi    1
			pushi    13
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_1dff
code_1d63:
			dup     
			ldi      3
			eq?     
			bnt      code_1d86
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_1dff
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_1dff
code_1d86:
			dup     
			ldi      4
			eq?     
			bnt      code_1d9c
			pushi    3
			pushi    2160
			pushi    8
			pushSelf
			calle    proc13_4,  6
			jmp      code_1dff
code_1d9c:
			dup     
			ldi      5
			eq?     
			bnt      code_1db2
			pushi    3
			pushi    2160
			pushi    9
			pushSelf
			calle    proc13_4,  6
			jmp      code_1dff
code_1db2:
			dup     
			ldi      6
			eq?     
			bnt      code_1dc8
			pushi    3
			pushi    2160
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_1dff
code_1dc8:
			dup     
			ldi      7
			eq?     
			bnt      code_1dde
			pushi    3
			pushi    2160
			pushi    11
			pushSelf
			calle    proc13_4,  6
			jmp      code_1dff
code_1dde:
			dup     
			ldi      8
			eq?     
			bnt      code_1dff
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_1dff:
			toss    
			ret     
		)
	)
)

(instance noPass of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1e64
			pushi    9
			pushi    3
			lea      @local401
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    13
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_1e99
code_1e64:
			dup     
			ldi      1
			eq?     
			bnt      code_1e77
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_1e99
code_1e77:
			dup     
			ldi      2
			eq?     
			bnt      code_1e8d
			pushi    3
			pushi    2161
			pushi    32
			pushSelf
			calle    proc13_4,  6
			jmp      code_1e99
code_1e8d:
			dup     
			ldi      3
			eq?     
			bnt      code_1e99
			pushi    #dispose
			pushi    0
			self     4
code_1e99:
			toss    
			ret     
		)
	)
)

(instance night11 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1f13
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_1eff
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    2161
			pushi    0
			pushi    0
			self     14
			jmp      code_2092
code_1eff:
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    2161
			pushi    1
			pushi    1
			self     14
			jmp      code_2092
code_1f13:
			dup     
			ldi      1
			eq?     
			bnt      code_1f60
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_1f28
			ldi      2
			jmp      code_1f3a
code_1f28:
			lsg      global146
			ldi      63
			eq?     
			bnt      code_1f35
			ldi      0
			jmp      code_1f3a
code_1f35:
			ldi      1
			bnt      code_1f3a
code_1f3a:
			aTop     register
			pTos     register
			ldi      0
			eq?     
			bt       code_1f49
			pTos     register
			ldi      1
			eq?     
code_1f49:
			bnt      code_1f54
			pushi    0
			call     localproc_002b,  0
			jmp      code_1f59
code_1f54:
			pushi    0
			call     localproc_0110,  0
code_1f59:
			ldi      2
			aTop     cycles
			jmp      code_2092
code_1f60:
			dup     
			ldi      2
			eq?     
			bnt      code_2003
			pTos     register
			dup     
			ldi      0
			eq?     
			bnt      code_1fa3
			pushi    13
			pushi    5
			lea      @local391
			push    
			pushi    1
			pushi    0
			pushi    14
			pushi    1
			pushi    17
			pushi    2
			pushi    13
			pushi    3
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  26
			pushi    1
			pushi    65535
			calle    proc806_5,  2
			pTos     state
			ldi      2
			add     
			aTop     state
			jmp      code_1fff
code_1fa3:
			dup     
			ldi      2
			eq?     
			bnt      code_1fcb
			pushi    11
			pushi    4
			lea      @local364
			push    
			pushi    3
			pushi    0
			pushi    15
			pushi    1
			pushi    14
			pushi    2
			pushi    13
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_1fff
code_1fcb:
			dup     
			ldi      1
			eq?     
			bnt      code_1fff
			pushi    0
			call     localproc_01f6,  0
			pushi    13
			pushi    5
			lea      @local377
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    1
			pushi    14
			pushi    2
			pushi    13
			pushi    3
			pushi    16
			pushi    3
			pushSelf
			calle    proc851_0,  26
			pTos     state
			ldi      2
			add     
			aTop     state
code_1fff:
			toss    
			jmp      code_2092
code_2003:
			dup     
			ldi      3
			eq?     
			bnt      code_2021
			pushi    #cycleSpeed
			pushi    1
			pushi    18
			pushi    150
			pushi    3
			class    Osc
			push    
			pushi    1
			pushSelf
			lag      global0
			send     16
			jmp      code_2092
code_2021:
			dup     
			ldi      4
			eq?     
			bnt      code_203d
			pushi    4
			lea      @local371
			push    
			pushi    3
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_2092
code_203d:
			dup     
			ldi      5
			eq?     
			bnt      code_2071
			pushi    1
			pushi    51
			callb    proc0_5,  2
			bt       code_2053
			pushi    1
			pushi    62
			callb    proc0_5,  2
code_2053:
			not     
			bnt      code_2065
			pushi    #setScript
			pushi    2
			lofsa    noPass
			push    
			pushSelf
			self     8
			jmp      code_2092
code_2065:
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_2092
code_2071:
			dup     
			ldi      6
			eq?     
			bnt      code_2092
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_2092:
			toss    
			ret     
		)
	)
)

(instance night12 of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_20ee
			pushi    #setScript
			pushi    5
			lofsa    series
			push    
			pushSelf
			pushi    2162
			pushi    0
			pushi    0
			self     14
			jmp      code_21bc
code_20ee:
			dup     
			ldi      1
			eq?     
			bnt      code_2101
			pushi    0
			call     localproc_002b,  0
			ldi      2
			aTop     cycles
			jmp      code_21bc
code_2101:
			dup     
			ldi      2
			eq?     
			bnt      code_2137
			pushi    #has
			pushi    1
			pushi    9
			lag      global0
			send     6
			bnt      code_2117
			ipToa    state
code_2117:
			pushi    11
			pushi    4
			lea      @local408
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushi    17
			pushi    1
			pushi    13
			pushi    2
			pushSelf
			calle    proc851_0,  22
			jmp      code_21bc
code_2137:
			dup     
			ldi      3
			eq?     
			bnt      code_216b
			pushi    #get
			pushi    1
			pushi    9
			lag      global0
			send     6
			pushi    13
			pushi    5
			lea      @local415
			push    
			pushi    1
			pushi    0
			pushi    15
			pushi    3
			pushi    17
			pushi    1
			pushi    13
			pushi    2
			pushi    14
			pushi    2
			pushSelf
			calle    proc851_0,  26
			jmp      code_21bc
code_216b:
			dup     
			ldi      4
			eq?     
			bnt      code_2188
			pushi    5
			pushi    1
			lea      @local423
			push    
			pushi    14
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_21bc
code_2188:
			dup     
			ldi      5
			eq?     
			bnt      code_219b
			pushi    0
			call     localproc_000e,  0
			ldi      90
			aTop     ticks
			jmp      code_21bc
code_219b:
			dup     
			ldi      6
			eq?     
			bnt      code_21bc
			pushi    #fade
			pushi    4
			pushi    0
			pushi    30
			pushi    8
			pushi    1
			lag      global113
			send     12
			pushi    #newRoom
			pushi    1
			pushi    140
			lag      global2
			send     6
code_21bc:
			toss    
			ret     
		)
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)
