;;; Sierra Script 1.0 - (do not remove this comment)
(script# 23)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Tuck 0
)

(local
	local0
	local1
	[local2 4] = [1023 2 1]
	[local6 4] = [1023 3 1]
	[local10 4] = [1023 4 1]
	[local14 4] = [1023 5 1]
	[local18 4] = [1023 6 1]
	[local22 4] = [1023 7 1]
	[local26 4] = [1023 8 1]
	[local30 4] = [1023 9 1]
	[local34 4] = [1023 10 1]
	[local38 4] = [1023 11 1]
	[local42 4] = [1023 12 1]
	[local46 4] = [1023 13 1]
	[local50 4] = [1023 14 1]
	[local54 4] = [1023 15 1]
	[local58 4] = [1023 16 1]
	[local62 4] = [1023 17 1]
	[local66 4] = [1023 18 1]
	[local70 4] = [1023 19 1]
	[local74 4] = [1023 20 1]
	[local78 5] = [1023 21 1 1]
	[local83 4] = [1023 23 1]
	[local87 4] = [1023 24 1]
	[local91 4] = [1023 25 1]
	[local95 4] = [1023 26 1]
	[local99 4] = [1023 27 1]
	[local103 4] = [1023 28 1]
	[local107 4] = [1023 29 1]
	[local111 4] = [1023 30 1]
	[local115 4] = [1023 31 1]
)
(instance Tuck of Actor
	(properties
		description 1325
		view 154
	)
	
	(method (init)
		(asm
			pushi    #setLoop
			pushi    1
			lofsa    tuckGroop
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
			pushi    23
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
			pushi    1023
			pushi    0
			calle    proc13_4,  4
			jmp      code_0478
code_0062:
			ldi      1
			sal      local0
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1023
			pushi    1
			calle    proc13_4,  4
			jmp      code_0478
code_0078:
			dup     
			ldi      3
			eq?     
			bnt      code_01b6
			lal      local1
			bnt      code_00a5
			ldi      0
			sal      local1
			pushi    4
			pushi    1
			lea      @local2
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			pushi    #get
			pushi    1
			pushi    12
			lag      global0
			send     6
			jmp      code_0478
code_00a5:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			lag      global9
			send     6
			send     4
			push    
			selfID  
			eq?     
			bnt      code_00cd
			pushi    4
			pushi    1
			lea      @local6
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0478
code_00cd:
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_00e9
			pushi    4
			pushi    1
			lea      @local10
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_01b2
code_00e9:
			dup     
			ldi      6
			eq?     
			bnt      code_0103
			pushi    4
			pushi    1
			lea      @local14
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_01b2
code_0103:
			dup     
			ldi      5
			eq?     
			bnt      code_011d
			pushi    4
			pushi    1
			lea      @local14
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_01b2
code_011d:
			dup     
			ldi      4
			eq?     
			bnt      code_016e
			lsg      global130
			dup     
			ldi      8
			eq?     
			bnt      code_0140
			pushi    4
			pushi    1
			lea      @local18
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_016a
code_0140:
			dup     
			ldi      9
			eq?     
			bnt      code_015a
			pushi    4
			pushi    1
			lea      @local22
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_016a
code_015a:
			pushi    4
			pushi    1
			lea      @local26
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
code_016a:
			toss    
			jmp      code_01b2
code_016e:
			dup     
			ldi      2
			eq?     
			bnt      code_0188
			pushi    4
			pushi    1
			lea      @local30
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_01b2
code_0188:
			dup     
			ldi      3
			eq?     
			bnt      code_01a2
			pushi    4
			pushi    1
			lea      @local34
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_01b2
code_01a2:
			pushi    4
			pushi    1
			lea      @local26
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
code_01b2:
			toss    
			jmp      code_0478
code_01b6:
			dup     
			ldi      5
			eq?     
			bnt      code_0214
			lal      local1
			bnt      code_01d9
			ldi      0
			sal      local1
			pushi    4
			pushi    1
			lea      @local2
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0478
code_01d9:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			lag      global9
			send     6
			send     4
			push    
			selfID  
			eq?     
			bnt      code_0201
			pushi    4
			pushi    1
			lea      @local6
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0478
code_0201:
			pushi    4
			pushi    1
			lea      @local38
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0478
code_0214:
			dup     
			ldi      4
			eq?     
			bnt      code_0459
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0237
			pushi    4
			pushi    1
			lea      @local42
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0237:
			dup     
			ldi      0
			eq?     
			bnt      code_0251
			pushi    4
			pushi    1
			lea      @local46
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0251:
			dup     
			ldi      2
			eq?     
			bnt      code_026b
			pushi    4
			pushi    1
			lea      @local50
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_026b:
			dup     
			ldi      3
			eq?     
			bnt      code_0285
			pushi    4
			pushi    1
			lea      @local54
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0285:
			dup     
			ldi      15
			eq?     
			bnt      code_029f
			pushi    4
			pushi    1
			lea      @local58
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_029f:
			dup     
			ldi      11
			eq?     
			bnt      code_02c4
			pushi    4
			pushi    1
			lea      @local62
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    11
			pushSelf
			lag      global0
			send     8
			jmp      code_0455
code_02c4:
			dup     
			ldi      14
			eq?     
			bnt      code_02de
			pushi    4
			pushi    1
			lea      @local66
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_02de:
			dup     
			ldi      12
			eq?     
			bnt      code_0307
			pushi    4
			pushi    1
			lea      @local70
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			pushi    #put
			pushi    2
			pushi    12
			pushSelf
			lag      global0
			send     8
			ldi      1
			sal      local1
			jmp      code_0455
code_0307:
			dup     
			ldi      10
			eq?     
			bnt      code_0321
			pushi    4
			pushi    1
			lea      @local74
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0321:
			dup     
			ldi      18
			eq?     
			bnt      code_033b
			pushi    4
			pushi    1
			lea      @local74
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_033b:
			dup     
			ldi      13
			eq?     
			bnt      code_037a
			lsg      global130
			ldi      7
			lt?     
			bnt      code_035d
			pushi    4
			pushi    1
			lea      @local78
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_035d:
			pushi    4
			pushi    1
			lea      @local83
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			pushi    #put
			pushi    1
			pushi    13
			lag      global0
			send     6
			jmp      code_0455
code_037a:
			dup     
			ldi      5
			eq?     
			bnt      code_0394
			pushi    4
			pushi    1
			lea      @local87
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0394:
			dup     
			ldi      6
			eq?     
			bnt      code_03ae
			pushi    4
			pushi    1
			lea      @local91
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_03ae:
			dup     
			ldi      17
			eq?     
			bnt      code_03c8
			pushi    4
			pushi    1
			lea      @local95
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_03c8:
			dup     
			ldi      16
			eq?     
			bnt      code_03e2
			pushi    4
			pushi    1
			lea      @local99
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_03e2:
			dup     
			ldi      4
			eq?     
			bnt      code_03fc
			pushi    4
			pushi    1
			lea      @local103
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_03fc:
			dup     
			ldi      7
			eq?     
			bnt      code_0416
			pushi    4
			pushi    1
			lea      @local107
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0416:
			dup     
			ldi      8
			eq?     
			bnt      code_0430
			pushi    4
			pushi    1
			lea      @local111
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_0430:
			dup     
			ldi      9
			eq?     
			bnt      code_044a
			pushi    4
			pushi    1
			lea      @local115
			push    
			pushi    15
			pushi    0
			calle    proc851_0,  8
			jmp      code_0455
code_044a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0455:
			toss    
			jmp      code_0478
code_0459:
			dup     
			ldi      10
			eq?     
			bnt      code_046d
			pushi    2
			pushi    1023
			pushi    32
			calle    proc13_4,  4
			jmp      code_0478
code_046d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0478:
			toss    
			ret     
		)
	)
)

(instance tuckGroop of Grooper
	(properties)
)
