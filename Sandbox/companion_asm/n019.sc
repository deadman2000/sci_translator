;;; Sierra Script 1.0 - (do not remove this comment)
(script# 19)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	John 0
)

(local
	local0
	[local1 4] = [1019 2 1]
	[local5 4] = [1019 3 1]
	[local9 4] = [1019 4 1]
	[local13 4] = [1019 5 1]
	[local17 4] = [1019 6 1]
	[local21 4] = [1019 7 1]
	[local25 4] = [1019 8 1]
	[local29 4] = [1019 9 1]
	[local33 4] = [1019 10 1]
	[local37 4] = [1019 11 1]
	[local41 4] = [1019 12 1]
	[local45 4] = [1019 13 1]
	[local49 4] = [1019 14 1]
	[local53 4] = [1019 15 1]
	[local57 4] = [1019 16 1]
	[local61 4] = [1019 17 1]
	[local65 4] = [1019 18 1]
	[local69 4] = [1019 19 1]
	[local73 4] = [1019 20 1]
	[local77 4] = [1019 21 1]
	[local81 4] = [1019 22 1]
	[local85 4] = [1019 23 1]
	[local89 4] = [1019 24 1]
	[local93 4] = [1019 25 1]
	[local97 4] = [1019 26 1]
	[local101 4] = [1019 27 1]
)
(instance John of Actor
	(properties
		description 1109
		view 151
	)
	
	(method (init)
		(asm
			pushi    #setLoop
			pushi    1
			lofsa    johnGroop
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
			pushi    19
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
			pushi    1019
			pushi    0
			calle    proc13_4,  4
			jmp      code_039f
code_0062:
			ldi      1
			sal      local0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1019
			pushi    1
			calle    proc13_4,  4
			jmp      code_039f
code_0078:
			dup     
			ldi      3
			eq?     
			bnt      code_0092
			pushi    4
			pushi    1
			lea      @local1
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_039f
code_0092:
			dup     
			ldi      5
			eq?     
			bnt      code_016f
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_00b5
			pushi    4
			pushi    1
			lea      @local5
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_016b
code_00b5:
			dup     
			ldi      1
			eq?     
			bnt      code_00cf
			pushi    4
			pushi    1
			lea      @local9
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_016b
code_00cf:
			dup     
			ldi      6
			eq?     
			bnt      code_00e9
			pushi    4
			pushi    1
			lea      @local13
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_016b
code_00e9:
			dup     
			ldi      5
			eq?     
			bnt      code_0103
			pushi    4
			pushi    1
			lea      @local13
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_016b
code_0103:
			dup     
			ldi      4
			eq?     
			bnt      code_0154
			lsg      global130
			dup     
			ldi      8
			eq?     
			bnt      code_0126
			pushi    4
			pushi    1
			lea      @local17
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_0150
code_0126:
			dup     
			ldi      9
			eq?     
			bnt      code_0140
			pushi    4
			pushi    1
			lea      @local21
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_0150
code_0140:
			pushi    4
			pushi    1
			lea      @local25
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
code_0150:
			toss    
			jmp      code_016b
code_0154:
			dup     
			ldi      2
			eq?     
			bnt      code_016b
			pushi    4
			pushi    1
			lea      @local29
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
code_016b:
			toss    
			jmp      code_039f
code_016f:
			dup     
			ldi      4
			eq?     
			bnt      code_0380
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0192
			pushi    4
			pushi    1
			lea      @local33
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0192:
			dup     
			ldi      0
			eq?     
			bnt      code_01ac
			pushi    4
			pushi    1
			lea      @local37
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_01ac:
			dup     
			ldi      2
			eq?     
			bnt      code_01c6
			pushi    4
			pushi    1
			lea      @local41
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_01c6:
			dup     
			ldi      3
			eq?     
			bnt      code_01e0
			pushi    4
			pushi    1
			lea      @local45
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_01e0:
			dup     
			ldi      15
			eq?     
			bnt      code_01fa
			pushi    4
			pushi    1
			lea      @local49
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_01fa:
			dup     
			ldi      11
			eq?     
			bnt      code_021f
			pushi    4
			pushi    1
			lea      @local53
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    11
			pushSelf
			lag      global0
			send     8
			jmp      code_037c
code_021f:
			dup     
			ldi      14
			eq?     
			bnt      code_0239
			pushi    4
			pushi    1
			lea      @local57
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0239:
			dup     
			ldi      12
			eq?     
			bnt      code_0253
			pushi    4
			pushi    1
			lea      @local61
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0253:
			dup     
			ldi      10
			eq?     
			bnt      code_026d
			pushi    4
			pushi    1
			lea      @local65
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_026d:
			dup     
			ldi      18
			eq?     
			bnt      code_0287
			pushi    4
			pushi    1
			lea      @local65
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0287:
			dup     
			ldi      13
			eq?     
			bnt      code_02a1
			pushi    4
			pushi    1
			lea      @local69
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_02a1:
			dup     
			ldi      5
			eq?     
			bnt      code_02bb
			pushi    4
			pushi    1
			lea      @local73
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_02bb:
			dup     
			ldi      6
			eq?     
			bnt      code_02d5
			pushi    4
			pushi    1
			lea      @local77
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_02d5:
			dup     
			ldi      17
			eq?     
			bnt      code_02ef
			pushi    4
			pushi    1
			lea      @local81
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_02ef:
			dup     
			ldi      16
			eq?     
			bnt      code_0309
			pushi    4
			pushi    1
			lea      @local85
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0309:
			dup     
			ldi      4
			eq?     
			bnt      code_0323
			pushi    4
			pushi    1
			lea      @local89
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0323:
			dup     
			ldi      7
			eq?     
			bnt      code_033d
			pushi    4
			pushi    1
			lea      @local93
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_033d:
			dup     
			ldi      8
			eq?     
			bnt      code_0357
			pushi    4
			pushi    1
			lea      @local97
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0357:
			dup     
			ldi      9
			eq?     
			bnt      code_0371
			pushi    4
			pushi    1
			lea      @local101
			push    
			pushi    13
			pushi    0
			calle    proc851_0,  8
			jmp      code_037c
code_0371:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_037c:
			toss    
			jmp      code_039f
code_0380:
			dup     
			ldi      10
			eq?     
			bnt      code_0394
			pushi    2
			pushi    1019
			pushi    28
			calle    proc13_4,  4
			jmp      code_039f
code_0394:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_039f:
			toss    
			ret     
		)
	)
)

(instance johnGroop of Grooper
	(properties)
)
