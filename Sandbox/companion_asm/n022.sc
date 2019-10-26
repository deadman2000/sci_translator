;;; Sierra Script 1.0 - (do not remove this comment)
(script# 22)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Much 0
)

(local
	local0
	local1
	[local2 4] = [1022 2 1]
	[local6 4] = [1022 3 1]
	[local10 4] = [1022 4 1]
	[local14 4] = [1022 5 1]
	[local18 4] = [1022 6 1]
	[local22 4] = [1022 7 1]
	[local26 4] = [1022 8 1]
	[local30 4] = [1022 9 1]
	[local34 4] = [1022 10 1]
	[local38 4] = [1022 11 1]
	[local42 4] = [1022 12 1]
	[local46 4] = [1022 13 1]
	[local50 4] = [1022 14 1]
	[local54 4] = [1022 15 1]
	[local58 4] = [1022 16 1]
	[local62 4] = [1022 17 1]
	[local66 4] = [1022 18 1]
	[local70 4] = [1022 19 1]
	[local74 4] = [1022 20 1]
	[local78 4] = [1022 21 1]
	[local82 4] = [1022 22 1]
	[local86 4] = [1022 23 1]
	[local90 4] = [1022 24 1]
	[local94 4] = [1022 25 1]
	[local98 4] = [1022 26 1]
)
(instance Much of Actor
	(properties
		description 1174
		view 163
	)
	
	(method (init)
		(asm
			pushi    #setLoop
			pushi    1
			lofsa    muchGroop
			push    
			self     6
			pushi    #init
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #setCycle
			pushi    1
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			pushi    267
			pushi    1
			pushi    0
			self     18
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			pushi    1
			pushi    22
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0078
			lal      local0
			bnt      code_0062
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1022
			pushi    0
			calle    proc13_4,  4
			jmp      code_03e6
code_0062:
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1022
			pushi    1
			calle    proc13_4,  4
			ldi      1
			sal      local0
			jmp      code_03e6
code_0078:
			dup     
			ldi      3
			eq?     
			bnt      code_0092
			pushi    4
			pushi    1
			lea      @local2
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03e6
code_0092:
			dup     
			ldi      5
			eq?     
			bnt      code_01a8
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_00b5
			pushi    4
			pushi    1
			lea      @local6
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_00b5:
			dup     
			ldi      5
			eq?     
			bnt      code_00eb
			lal      local1
			bnt      code_00d4
			pushi    4
			pushi    1
			lea      @local18
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_00d4:
			ldi      1
			sal      local1
			pushi    4
			pushi    1
			lea      @local10
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_00eb:
			dup     
			ldi      6
			eq?     
			bnt      code_0121
			lal      local1
			bnt      code_010a
			pushi    4
			pushi    1
			lea      @local18
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_010a:
			ldi      1
			sal      local1
			pushi    4
			pushi    1
			lea      @local10
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_0121:
			dup     
			ldi      4
			eq?     
			bnt      code_0160
			lsg      global130
			ldi      8
			eq?     
			bnt      code_014d
			lal      local1
			not     
			bnt      code_014d
			ldi      1
			sal      local1
			pushi    4
			pushi    1
			lea      @local14
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_014d:
			pushi    4
			pushi    1
			lea      @local18
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_0160:
			dup     
			ldi      2
			eq?     
			bnt      code_017a
			pushi    4
			pushi    1
			lea      @local22
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_017a:
			dup     
			ldi      3
			eq?     
			bnt      code_0194
			pushi    4
			pushi    1
			lea      @local22
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_01a4
code_0194:
			pushi    4
			pushi    1
			lea      @local26
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
code_01a4:
			toss    
			jmp      code_03e6
code_01a8:
			dup     
			ldi      4
			eq?     
			bnt      code_03c7
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_01cb
			pushi    4
			pushi    1
			lea      @local30
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_01cb:
			dup     
			ldi      0
			eq?     
			bnt      code_01f3
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			push    
			ldi      0
			gt?     
			bnt      code_03c3
			pushi    4
			pushi    1
			lea      @local34
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_01f3:
			dup     
			ldi      2
			eq?     
			bnt      code_020d
			pushi    4
			pushi    1
			lea      @local38
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_020d:
			dup     
			ldi      3
			eq?     
			bnt      code_0227
			pushi    4
			pushi    1
			lea      @local42
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0227:
			dup     
			ldi      15
			eq?     
			bnt      code_0241
			pushi    4
			pushi    1
			lea      @local46
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0241:
			dup     
			ldi      11
			eq?     
			bnt      code_0266
			pushi    4
			pushi    1
			lea      @local50
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    11
			pushSelf
			lag      global0
			send     8
			jmp      code_03c3
code_0266:
			dup     
			ldi      14
			eq?     
			bnt      code_0280
			pushi    4
			pushi    1
			lea      @local54
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0280:
			dup     
			ldi      12
			eq?     
			bnt      code_029a
			pushi    4
			pushi    1
			lea      @local58
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_029a:
			dup     
			ldi      10
			eq?     
			bnt      code_02b4
			pushi    4
			pushi    1
			lea      @local62
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_02b4:
			dup     
			ldi      18
			eq?     
			bnt      code_02ce
			pushi    4
			pushi    1
			lea      @local62
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_02ce:
			dup     
			ldi      13
			eq?     
			bnt      code_02e8
			pushi    4
			pushi    1
			lea      @local66
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_02e8:
			dup     
			ldi      5
			eq?     
			bnt      code_0302
			pushi    4
			pushi    1
			lea      @local70
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0302:
			dup     
			ldi      6
			eq?     
			bnt      code_031c
			pushi    4
			pushi    1
			lea      @local74
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_031c:
			dup     
			ldi      17
			eq?     
			bnt      code_0336
			pushi    4
			pushi    1
			lea      @local78
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0336:
			dup     
			ldi      16
			eq?     
			bnt      code_0350
			pushi    4
			pushi    1
			lea      @local82
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0350:
			dup     
			ldi      4
			eq?     
			bnt      code_036a
			pushi    4
			pushi    1
			lea      @local86
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_036a:
			dup     
			ldi      7
			eq?     
			bnt      code_0384
			pushi    4
			pushi    1
			lea      @local90
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_0384:
			dup     
			ldi      8
			eq?     
			bnt      code_039e
			pushi    4
			pushi    1
			lea      @local94
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_039e:
			dup     
			ldi      9
			eq?     
			bnt      code_03b8
			pushi    4
			pushi    1
			lea      @local98
			push    
			pushi    17
			pushi    0
			calle    proc851_0,  8
			jmp      code_03c3
code_03b8:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_03c3:
			toss    
			jmp      code_03e6
code_03c7:
			dup     
			ldi      10
			eq?     
			bnt      code_03db
			pushi    2
			pushi    1022
			pushi    27
			calle    proc13_4,  4
			jmp      code_03e6
code_03db:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_03e6:
			toss    
			ret     
		)
	)
)

(instance muchGroop of Grooper
	(properties)
)
