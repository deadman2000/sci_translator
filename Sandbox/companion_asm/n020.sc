;;; Sierra Script 1.0 - (do not remove this comment)
(script# 20)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Will 0
)

(local
	local0
	[local1 4] = [1020 2 1]
	[local5 4] = [1020 3 1]
	[local9 4] = [1020 4 1]
	[local13 4] = [1020 5 1]
	[local17 4] = [1020 6 1]
	[local21 4] = [1020 7 1]
	[local25 4] = [1020 8 1]
	[local29 4] = [1020 9 1]
	[local33 4] = [1020 10 1]
	[local37 4] = [1020 11 1]
	[local41 4] = [1020 12 1]
	[local45 4] = [1020 13 1]
	[local49 4] = [1020 14 1]
	[local53 4] = [1020 15 1]
	[local57 4] = [1020 16 1]
	[local61 4] = [1020 17 1]
	[local65 4] = [1020 18 1]
	[local69 4] = [1020 19 1]
	[local73 4] = [1020 20 1]
	[local77 4] = [1020 21 1]
	[local81 4] = [1020 22 1]
	[local85 4] = [1020 23 1]
	[local89 4] = [1020 24 1]
	[local93 4] = [1020 25 1]
	[local97 4] = [1020 26 1]
)
(instance Will of Actor
	(properties
		description 1071
		view 160
	)
	
	(method (init)
		(asm
			pushi    #setLoop
			pushi    1
			lofsa    willGroop
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
			pushi    20
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
			pushi    1020
			pushi    0
			calle    proc13_4,  4
			jmp      code_037a
code_0062:
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1020
			pushi    1
			calle    proc13_4,  4
			ldi      1
			sal      local0
			jmp      code_037a
code_0078:
			dup     
			ldi      3
			eq?     
			bnt      code_0092
			pushi    4
			pushi    1
			lea      @local1
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_037a
code_0092:
			dup     
			ldi      5
			eq?     
			bnt      code_0155
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_00b5
			pushi    4
			pushi    1
			lea      @local5
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0151
code_00b5:
			dup     
			ldi      5
			eq?     
			bnt      code_00cf
			pushi    4
			pushi    1
			lea      @local9
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0151
code_00cf:
			dup     
			ldi      6
			eq?     
			bnt      code_00e9
			pushi    4
			pushi    1
			lea      @local9
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0151
code_00e9:
			dup     
			ldi      4
			eq?     
			bnt      code_0127
			lsg      global130
			dup     
			ldi      8
			eq?     
			bnt      code_010c
			pushi    4
			pushi    1
			lea      @local13
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0123
code_010c:
			dup     
			ldi      9
			eq?     
			bnt      code_0123
			pushi    4
			pushi    1
			lea      @local17
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
code_0123:
			toss    
			jmp      code_0151
code_0127:
			dup     
			ldi      2
			eq?     
			bnt      code_0141
			pushi    4
			pushi    1
			lea      @local21
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0151
code_0141:
			pushi    4
			pushi    1
			lea      @local25
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
code_0151:
			toss    
			jmp      code_037a
code_0155:
			dup     
			ldi      4
			eq?     
			bnt      code_035b
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0178
			pushi    4
			pushi    1
			lea      @local29
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0178:
			dup     
			ldi      0
			eq?     
			bnt      code_0192
			pushi    4
			pushi    1
			lea      @local33
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0192:
			dup     
			ldi      2
			eq?     
			bnt      code_01ac
			pushi    4
			pushi    1
			lea      @local37
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_01ac:
			dup     
			ldi      3
			eq?     
			bnt      code_01c6
			pushi    4
			pushi    1
			lea      @local41
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_01c6:
			dup     
			ldi      15
			eq?     
			bnt      code_01e0
			pushi    4
			pushi    1
			lea      @local45
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_01e0:
			dup     
			ldi      11
			eq?     
			bnt      code_01fa
			pushi    4
			pushi    1
			lea      @local49
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_01fa:
			dup     
			ldi      14
			eq?     
			bnt      code_0214
			pushi    4
			pushi    1
			lea      @local53
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0214:
			dup     
			ldi      12
			eq?     
			bnt      code_022e
			pushi    4
			pushi    1
			lea      @local57
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_022e:
			dup     
			ldi      10
			eq?     
			bnt      code_0248
			pushi    4
			pushi    1
			lea      @local61
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0248:
			dup     
			ldi      18
			eq?     
			bnt      code_0262
			pushi    4
			pushi    1
			lea      @local61
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0262:
			dup     
			ldi      13
			eq?     
			bnt      code_027c
			pushi    4
			pushi    1
			lea      @local65
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_027c:
			dup     
			ldi      5
			eq?     
			bnt      code_0296
			pushi    4
			pushi    1
			lea      @local69
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0296:
			dup     
			ldi      6
			eq?     
			bnt      code_02b0
			pushi    4
			pushi    1
			lea      @local73
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_02b0:
			dup     
			ldi      17
			eq?     
			bnt      code_02ca
			pushi    4
			pushi    1
			lea      @local77
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_02ca:
			dup     
			ldi      16
			eq?     
			bnt      code_02e4
			pushi    4
			pushi    1
			lea      @local81
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_02e4:
			dup     
			ldi      4
			eq?     
			bnt      code_02fe
			pushi    4
			pushi    1
			lea      @local85
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_02fe:
			dup     
			ldi      7
			eq?     
			bnt      code_0318
			pushi    4
			pushi    1
			lea      @local89
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0318:
			dup     
			ldi      8
			eq?     
			bnt      code_0332
			pushi    4
			pushi    1
			lea      @local93
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_0332:
			dup     
			ldi      9
			eq?     
			bnt      code_034c
			pushi    4
			pushi    1
			lea      @local97
			push    
			pushi    14
			pushi    0
			calle    proc851_0,  8
			jmp      code_0357
code_034c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0357:
			toss    
			jmp      code_037a
code_035b:
			dup     
			ldi      10
			eq?     
			bnt      code_036f
			pushi    2
			pushi    1020
			pushi    27
			calle    proc13_4,  4
			jmp      code_037a
code_036f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_037a:
			toss    
			ret     
		)
	)
)

(instance willGroop of Grooper
	(properties)
)
