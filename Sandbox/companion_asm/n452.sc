;;; Sierra Script 1.0 - (do not remove this comment)
(script# 452)
(include sci.sh)
(use n000)
(use n013)
(use n813)
(use n851)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	abbey 0
	aMonk 1
	regTimer 2
	noBlow 3
)

(local
	[local0 5] = [1452 1 1 2]
	[local5 4] = [1452 3 1]
	[local9 4] = [1452 4 1]
	[local13 4] = [1452 6 1]
	[local17 4] = [1452 7 1]
	[local21 4] = [1452 8 1]
	[local25 4] = [1452 11 1]
	[local29 8] = [1452 9 1 0 1452 30 1]
	[local37 6] = [1452 13 2 1 2]
	[local43 6] = [1452 13 2 1 2]
	[local49 6] = [1452 13 2 1 2]
	[local55 6] = [1452 13 2 1 2]
	[local61 4] = [1452 22 1]
	[local65 5] = [1452 26 1 1]
	local70
)
(instance abbey of Rgn
	(properties)
	
	(method (init)
		(asm
			pushi    #disable
			pushi    1
			pushi    5
			lag      global69
			send     6
			lag      global5
			sal      local70
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_0033
			pushi    #doit
			pushi    0
			send     4
code_0033:
			lsl      local70
			lag      global5
			ne?     
			bnt      code_0065
			pTos     script
			lofsa    dangerBox
			ne?     
			bnt      code_0065
			pushi    1
			pushi    126
			callb    proc0_5,  2
			bnt      code_0065
			pushi    #next
			pushi    1
			pTos     script
			lofsa    dangerBox
			send     6
			ldi      0
			aTop     script
			pushi    #setScript
			pushi    1
			lofsa    dangerBox
			push    
			self     6
code_0065:
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      10
			eq?     
			bnt      code_007f
			pushi    2
			lea      @local9
			push    
			pushi    9
			calle    proc851_0,  4
			jmp      code_0088
code_007f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Rgn,  6
code_0088:
			toss    
			ret     
		)
	)
)

(instance aMonk of Actor
	(properties
		view 434
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_00d3
			pushi    2
			pushi    1452
			pushi    0
			calle    proc13_4,  4
			jmp      code_025d
code_00d3:
			dup     
			ldi      5
			eq?     
			bnt      code_00ed
			pushi    3
			lea      @local0
			push    
			pushi    9
			pushi    10
			calle    proc851_0,  6
			jmp      code_025d
code_00ed:
			dup     
			ldi      3
			eq?     
			bnt      code_0104
			pushi    2
			lea      @local5
			push    
			pushi    10
			calle    proc851_0,  4
			jmp      code_025d
code_0104:
			dup     
			ldi      4
			eq?     
			bnt      code_0252
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_012d
			pushi    2
			lea      @local13
			push    
			pushi    10
			calle    proc851_0,  4
			pushi    #put
			pushi    1
			pushi    0
			lag      global0
			send     6
			jmp      code_024e
code_012d:
			dup     
			ldi      11
			eq?     
			bnt      code_0165
			pushi    #value
			pushi    0
			pushi    #at
			pushi    1
			pushi    11
			class    Inv
			send     6
			send     4
			bnt      code_0155
			pushi    2
			lea      @local17
			push    
			pushi    10
			calle    proc851_0,  4
			jmp      code_024e
code_0155:
			pushi    2
			lea      @local21
			push    
			pushi    10
			calle    proc851_0,  4
			jmp      code_024e
code_0165:
			dup     
			ldi      12
			eq?     
			bnt      code_017c
			pushi    2
			lea      @local25
			push    
			pushi    10
			calle    proc851_0,  4
			jmp      code_024e
code_017c:
			dup     
			ldi      14
			eq?     
			bnt      code_019d
			pushi    2
			lea      @local29
			push    
			pushi    10
			calle    proc851_0,  4
			pushi    #put
			pushi    1
			pushi    14
			lag      global0
			send     6
			jmp      code_024e
code_019d:
			dup     
			ldi      13
			eq?     
			bnt      code_0215
			pushi    2
			pushi    1
			pushi    4
			callk    Random,  4
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_01c6
			pushi    3
			lea      @local37
			push    
			pushi    9
			pushi    10
			calle    proc851_0,  6
			jmp      code_0211
code_01c6:
			dup     
			ldi      2
			eq?     
			bnt      code_01e0
			pushi    3
			lea      @local43
			push    
			pushi    9
			pushi    10
			calle    proc851_0,  6
			jmp      code_0211
code_01e0:
			dup     
			ldi      3
			eq?     
			bnt      code_01fa
			pushi    3
			lea      @local49
			push    
			pushi    9
			pushi    10
			calle    proc851_0,  6
			jmp      code_0211
code_01fa:
			dup     
			ldi      4
			eq?     
			bnt      code_0211
			pushi    3
			lea      @local55
			push    
			pushi    9
			pushi    10
			calle    proc851_0,  6
code_0211:
			toss    
			jmp      code_024e
code_0215:
			dup     
			ldi      16
			eq?     
			bnt      code_022c
			pushi    2
			lea      @local61
			push    
			pushi    10
			calle    proc851_0,  4
			jmp      code_024e
code_022c:
			dup     
			ldi      18
			eq?     
			bnt      code_0243
			pushi    2
			lea      @local65
			push    
			pushi    10
			calle    proc851_0,  4
			jmp      code_024e
code_0243:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_024e:
			toss    
			jmp      code_025d
code_0252:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_025d:
			toss    
			ret     
		)
	)
)

(instance regTimer of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_02f9
			ldi      30
			aTop     seconds
			jmp      code_034d
code_02f9:
			dup     
			ldi      1
			eq?     
			bnt      code_0341
			lsg      global11
			ldi      470
			eq?     
			bnt      code_033a
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bt       code_031c
			pushi    #script
			pushi    0
			lag      global1
			send     4
code_031c:
			bnt      code_0328
			ldi      2
			aTop     seconds
			dpToa    state
			jmp      code_034d
code_0328:
			pushi    #setScript
			pushi    1
			pTos     register
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_034d
code_033a:
			ldi      60
			aTop     seconds
			jmp      code_034d
code_0341:
			dup     
			ldi      2
			eq?     
			bnt      code_034d
			pushi    #dispose
			pushi    0
			self     4
code_034d:
			toss    
			ret     
		)
	)
)

(instance dangerBox of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    1
			pushi    127
			callb    proc0_5,  2
			bnt      code_059b
			pTos     state
			ldi      4
			lt?     
			bnt      code_059b
			pToa     next
			bnt      code_058d
			pushi    #script
			pushi    1
			push    
			pToa     client
			send     6
			ldi      0
			aTop     client
			jmp      code_0592
code_058d:
			pushi    #dispose
			pushi    0
			self     4
code_0592:
			pushi    1
			pushi    127
			callb    proc0_7,  2
			jmp      code_05a1
code_059b:
			pushi    #doit
			pushi    0
			super    Script,  4
code_05a1:
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
			bnt      code_03b5
			pushi    1
			pushi    201
			callb    proc0_5,  2
			bnt      code_03a7
			pTos     state
			ldi      2
			add     
			aTop     state
code_03a7:
			pushi    1
			pushi    201
			callb    proc0_6,  2
			ldi      3
			aTop     seconds
			jmp      code_0565
code_03b5:
			dup     
			ldi      1
			eq?     
			bnt      code_03cb
			pushi    3
			pushi    1452
			pushi    10
			pushSelf
			calle    proc13_4,  6
			jmp      code_0565
code_03cb:
			dup     
			ldi      2
			eq?     
			bnt      code_040e
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global1
			send     6
			lag      global25
			bnt      code_03e5
			pushi    #dispose
			pushi    0
			send     4
code_03e5:
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    853
			callk    ScriptID,  2
			send     4
			pToa     next
			bnt      code_0406
			pushi    #script
			pushi    1
			push    
			pToa     client
			send     6
			ldi      0
			aTop     client
			jmp      code_0565
code_0406:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0565
code_040e:
			dup     
			ldi      3
			eq?     
			bnt      code_041c
			ldi      9
			aTop     seconds
			jmp      code_0565
code_041c:
			dup     
			ldi      4
			eq?     
			bnt      code_0535
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    1
			pushi    0
			lag      global1
			send     6
			lag      global25
			bnt      code_043a
			pushi    #dispose
			pushi    0
			send     4
code_043a:
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    853
			callk    ScriptID,  2
			send     4
			pushi    0
			callb    proc0_3,  0
			lsg      global11
			dup     
			ldi      455
			eq?     
			bnt      code_0472
			pushi    #posn
			pushi    2
			pushi    162
			pushi    122
			lag      global0
			send     8
			pushi    #posn
			pushi    2
			pushi    141
			pushi    109
			lofsa    aMonk
			send     8
			jmp      code_051b
code_0472:
			dup     
			ldi      460
			eq?     
			bnt      code_04ac
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      153
			gt?     
			bnt      code_049a
			pushi    #posn
			pushi    2
			pushi    289
			pushi    109
			lofsa    aMonk
			send     8
			jmp      code_051b
code_049a:
			pushi    #posn
			pushi    2
			pushi    176
			pushi    185
			lofsa    aMonk
			send     8
			jmp      code_051b
code_04ac:
			dup     
			ldi      470
			eq?     
			bnt      code_04e4
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      46
			gt?     
			bnt      code_04d3
			pushi    #posn
			pushi    2
			pushi    16
			pushi    184
			lofsa    aMonk
			send     8
			jmp      code_051b
code_04d3:
			pushi    #posn
			pushi    2
			pushi    72
			pushi    183
			lofsa    aMonk
			send     8
			jmp      code_051b
code_04e4:
			dup     
			ldi      480
			eq?     
			bnt      code_051b
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      160
			gt?     
			bnt      code_050c
			pushi    #posn
			pushi    2
			pushi    105
			pushi    188
			lofsa    aMonk
			send     8
			jmp      code_051b
code_050c:
			pushi    #posn
			pushi    2
			pushi    205
			pushi    188
			lofsa    aMonk
			send     8
code_051b:
			toss    
			pushi    #init
			pushi    0
			lofsa    aMonk
			send     4
			pushi    2
			lofsa    aMonk
			push    
			lsg      global0
			callb    proc0_9,  4
			ldi      2
			aTop     cycles
			jmp      code_0565
code_0535:
			dup     
			ldi      5
			eq?     
			bnt      code_054f
			pushi    4
			lea      @local25
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0565
code_054f:
			dup     
			ldi      6
			eq?     
			bnt      code_0565
			ldi      10
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0565:
			toss    
			ret     
		)
	)
)

(instance noBlow of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_05fe
			lsp      param2
			ldi      1
			eq?     
			bnt      code_05fe
			pushi    3
			pushi    1005
			pushi    3
			pushi    1
			calle    proc13_4,  6
			ldi      1
code_05fe:
			ret     
		)
	)
)
