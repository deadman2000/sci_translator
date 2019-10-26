;;; Sierra Script 1.0 - (do not remove this comment)
(script# 21)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Alan 0
)

(local
	local0
	[local1 4] = [1021 2 1]
	[local5 4] = [1021 3 1]
	[local9 4] = [1021 4 1]
	[local13 4] = [1021 5 1]
	[local17 4] = [1021 6 1]
	[local21 4] = [1021 7 1]
	[local25 4] = [1021 8 1]
	[local29 4] = [1021 9 1]
	[local33 4] = [1021 10 1]
	[local37 4] = [1021 11 1]
	[local41 4] = [1021 12 1]
	[local45 4] = [1021 13 1]
	[local49 4] = [1021 14 1]
	[local53 4] = [1021 15 1]
	[local57 4] = [1021 16 1]
	[local61 4] = [1021 17 1]
	[local65 4] = [1021 18 1]
	[local69 4] = [1021 19 1]
	[local73 4] = [1021 20 1]
	[local77 4] = [1021 21 1]
	[local81 4] = [1021 22 1]
	[local85 4] = [1021 23 1]
	[local89 4] = [1021 24 1]
	[local93 5] = [1021 25 1 1]
	[local98 4] = [1021 27 1]
)
(instance Alan of Actor
	(properties
		description 1091
		view 157
	)
	
	(method (init)
		(asm
			pushi    #setLoop
			pushi    1
			lofsa    alanGroop
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
			pushi    21
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
			pushi    1021
			pushi    0
			calle    proc13_4,  4
			jmp      code_038d
code_0062:
			ldi      1
			sal      local0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1021
			pushi    1
			calle    proc13_4,  4
			jmp      code_038d
code_0078:
			dup     
			ldi      3
			eq?     
			bnt      code_0092
			pushi    4
			pushi    1
			lea      @local1
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_038d
code_0092:
			dup     
			ldi      5
			eq?     
			bnt      code_0168
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_00b5
			pushi    4
			pushi    1
			lea      @local5
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_0164
code_00b5:
			dup     
			ldi      5
			eq?     
			bnt      code_00cf
			pushi    4
			pushi    1
			lea      @local9
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_0164
code_00cf:
			dup     
			ldi      6
			eq?     
			bnt      code_00e9
			pushi    4
			pushi    1
			lea      @local9
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_0164
code_00e9:
			dup     
			ldi      4
			eq?     
			bnt      code_0120
			lsg      global130
			dup     
			ldi      8
			eq?     
			bnt      code_010c
			pushi    4
			pushi    1
			lea      @local13
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_011c
code_010c:
			pushi    4
			pushi    1
			lea      @local17
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
code_011c:
			toss    
			jmp      code_0164
code_0120:
			dup     
			ldi      2
			eq?     
			bnt      code_013a
			pushi    4
			pushi    1
			lea      @local21
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_0164
code_013a:
			dup     
			ldi      3
			eq?     
			bnt      code_0154
			pushi    4
			pushi    1
			lea      @local21
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_0164
code_0154:
			pushi    4
			pushi    1
			lea      @local25
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
code_0164:
			toss    
			jmp      code_038d
code_0168:
			dup     
			ldi      4
			eq?     
			bnt      code_036e
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_018b
			pushi    4
			pushi    1
			lea      @local29
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_018b:
			dup     
			ldi      0
			eq?     
			bnt      code_01a5
			pushi    4
			pushi    1
			lea      @local33
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_01a5:
			dup     
			ldi      2
			eq?     
			bnt      code_01bf
			pushi    4
			pushi    1
			lea      @local37
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_01bf:
			dup     
			ldi      3
			eq?     
			bnt      code_01d9
			pushi    4
			pushi    1
			lea      @local41
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_01d9:
			dup     
			ldi      15
			eq?     
			bnt      code_01f3
			pushi    4
			pushi    1
			lea      @local45
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_01f3:
			dup     
			ldi      11
			eq?     
			bnt      code_020d
			pushi    4
			pushi    1
			lea      @local49
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_020d:
			dup     
			ldi      14
			eq?     
			bnt      code_0227
			pushi    4
			pushi    1
			lea      @local53
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_0227:
			dup     
			ldi      12
			eq?     
			bnt      code_0241
			pushi    4
			pushi    1
			lea      @local57
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_0241:
			dup     
			ldi      10
			eq?     
			bnt      code_025b
			pushi    4
			pushi    1
			lea      @local61
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_025b:
			dup     
			ldi      18
			eq?     
			bnt      code_0275
			pushi    4
			pushi    1
			lea      @local61
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_0275:
			dup     
			ldi      13
			eq?     
			bnt      code_028f
			pushi    4
			pushi    1
			lea      @local65
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_028f:
			dup     
			ldi      5
			eq?     
			bnt      code_02a9
			pushi    4
			pushi    1
			lea      @local69
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_02a9:
			dup     
			ldi      6
			eq?     
			bnt      code_02c3
			pushi    4
			pushi    1
			lea      @local73
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_02c3:
			dup     
			ldi      17
			eq?     
			bnt      code_02dd
			pushi    4
			pushi    1
			lea      @local77
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_02dd:
			dup     
			ldi      16
			eq?     
			bnt      code_02f7
			pushi    4
			pushi    1
			lea      @local81
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_02f7:
			dup     
			ldi      4
			eq?     
			bnt      code_0311
			pushi    4
			pushi    1
			lea      @local85
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_0311:
			dup     
			ldi      7
			eq?     
			bnt      code_032b
			pushi    4
			pushi    1
			lea      @local89
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_032b:
			dup     
			ldi      8
			eq?     
			bnt      code_0345
			pushi    4
			pushi    1
			lea      @local93
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_0345:
			dup     
			ldi      9
			eq?     
			bnt      code_035f
			pushi    4
			pushi    1
			lea      @local98
			push    
			pushi    16
			pushi    0
			calle    proc851_0,  8
			jmp      code_036a
code_035f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_036a:
			toss    
			jmp      code_038d
code_036e:
			dup     
			ldi      10
			eq?     
			bnt      code_0382
			pushi    2
			pushi    1021
			pushi    28
			calle    proc13_4,  4
			jmp      code_038d
code_0382:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_038d:
			toss    
			ret     
		)
	)
)

(instance alanGroop of Grooper
	(properties)
)
