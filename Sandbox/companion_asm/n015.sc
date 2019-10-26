;;; Sierra Script 1.0 - (do not remove this comment)
(script# 15)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n992)
(use n998)
(use n999)

(public
	fulk 0
)

(local
	[local0 8] = [1015 0 2 1 2 1 2]
	[local8 8] = [1015 5 2 1 2 1 2]
	[local16 4] = [1015 13 1]
	[local20 4] = [1015 15 1]
	[local24 4] = [1015 16 1]
	[local28 4] = [1015 26 1]
	[local32 4] = [1015 17 1]
	[local36 4] = [1015 18 1]
	[local40 4] = [1015 19 1]
	[local44 4] = [1015 20 1]
	[local48 4] = [1015 21 1]
	[local52 4] = [1015 22 1]
	[local56 4] = [1015 24 1]
	[local60 4] = [1015 23 1]
)
(instance fulk of Actor
	(properties
		view 674
		xStep 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsg      global11
			dup     
			ldi      670
			eq?     
			bnt      code_0029
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			lofsa    doVerb670
			send     8
			jmp      code_004f
code_0029:
			dup     
			ldi      680
			eq?     
			bnt      code_0042
			pushi    #doit
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			lofsa    doVerb680
			send     8
			jmp      code_004f
code_0042:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Actor,  8
code_004f:
			toss    
			ret     
		)
	)
)

(instance chip of Actor
	(properties
		x 160
		y 210
		view 16
		loop 3
	)
)

(instance doVerb670 of Code
	(properties)
	
	(method (doit param1 param2 &tmp temp0)
		(asm
			pushi    #fulkStatus
			pushi    0
			class    Monastery
			send     4
			sat      temp0
			lsp      param1
			dup     
			ldi      2
			eq?     
			bnt      code_018d
			lst      temp0
			ldi      0
			eq?     
			bnt      code_0180
			pushi    2
			pushi    1015
			pushi    10
			calle    proc13_4,  4
			jmp      code_041d
code_0180:
			pushi    2
			pushi    1015
			pushi    11
			calle    proc13_4,  4
			jmp      code_041d
code_018d:
			dup     
			ldi      5
			eq?     
			bnt      code_020a
			lst      temp0
			dup     
			ldi      0
			eq?     
			bnt      code_01aa
			pushi    2
			pushi    1015
			pushi    14
			calle    proc13_4,  4
			jmp      code_0206
code_01aa:
			dup     
			ldi      1
			eq?     
			bnt      code_01ca
			pushi    3
			lea      @local20
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0206
code_01ca:
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_01f0
			pushi    3
			lea      @local24
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0206
code_01f0:
			pushi    3
			lea      @local28
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
code_0206:
			toss    
			jmp      code_041d
code_020a:
			dup     
			ldi      3
			eq?     
			bnt      code_023f
			lst      temp0
			ldi      0
			eq?     
			bnt      code_0226
			pushi    2
			pushi    1015
			pushi    12
			calle    proc13_4,  4
			jmp      code_041d
code_0226:
			pushi    3
			lea      @local16
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_041d
code_023f:
			dup     
			ldi      4
			eq?     
			bnt      code_041d
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_029f
			lst      temp0
			dup     
			ldi      0
			eq?     
			bnt      code_0265
			pushi    2
			pushi    1015
			pushi    27
			calle    proc13_4,  4
			jmp      code_029b
code_0265:
			dup     
			ldi      1
			eq?     
			bnt      code_0285
			pushi    3
			lea      @local32
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_029b
code_0285:
			pushi    3
			lea      @local36
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
code_029b:
			toss    
			jmp      code_041c
code_029f:
			dup     
			ldi      2
			eq?     
			bnt      code_02f6
			lst      temp0
			dup     
			ldi      0
			eq?     
			bnt      code_02bc
			pushi    2
			pushi    1015
			pushi    27
			calle    proc13_4,  4
			jmp      code_02f2
code_02bc:
			dup     
			ldi      1
			eq?     
			bnt      code_02dc
			pushi    3
			lea      @local40
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_02f2
code_02dc:
			pushi    3
			lea      @local44
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
code_02f2:
			toss    
			jmp      code_041c
code_02f6:
			dup     
			ldi      14
			eq?     
			bnt      code_0359
			lst      temp0
			dup     
			ldi      0
			eq?     
			bnt      code_0313
			pushi    2
			pushi    1015
			pushi    27
			calle    proc13_4,  4
			jmp      code_0355
code_0313:
			dup     
			ldi      1
			eq?     
			bnt      code_0333
			pushi    3
			lea      @local48
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_0355
code_0333:
			pushi    3
			lea      @local52
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			pushi    #put
			pushi    2
			pushi    14
			pushi    65535
			lag      global0
			send     8
code_0355:
			toss    
			jmp      code_041c
code_0359:
			dup     
			ldi      10
			eq?     
			bnt      code_036f
			pushi    #setScript
			pushi    1
			lofsa    killEgoWithRing
			push    
			lag      global0
			send     6
			jmp      code_041c
code_036f:
			dup     
			ldi      17
			eq?     
			bnt      code_03a4
			lst      temp0
			ldi      0
			eq?     
			bnt      code_038b
			pushi    2
			pushi    1015
			pushi    27
			calle    proc13_4,  4
			jmp      code_041c
code_038b:
			pushi    3
			lea      @local56
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_041c
code_03a4:
			dup     
			ldi      16
			eq?     
			bnt      code_03cf
			lst      temp0
			ldi      0
			eq?     
			bnt      code_03c0
			pushi    2
			pushi    1015
			pushi    25
			calle    proc13_4,  4
			jmp      code_041c
code_03c0:
			pushi    #setScript
			pushi    1
			lofsa    giveItToHim
			push    
			lag      global2
			send     6
			jmp      code_041c
code_03cf:
			lst      temp0
			dup     
			ldi      0
			eq?     
			bnt      code_03e5
			pushi    2
			pushi    1015
			pushi    27
			calle    proc13_4,  4
			jmp      code_041b
code_03e5:
			dup     
			ldi      1
			eq?     
			bnt      code_0405
			pushi    3
			lea      @local32
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_041b
code_0405:
			pushi    3
			lea      @local36
			push    
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushi    0
			calle    proc851_0,  6
code_041b:
			toss    
code_041c:
			toss    
code_041d:
			toss    
			ret     
		)
	)
)

(instance doVerb680 of Code
	(properties)
)

(instance leaveNow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_049e
			pushi    0
			callb    proc0_3,  0
			pushi    #view
			pushi    0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     4
			push    
			ldi      674
			eq?     
			bnt      code_0493
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    65535
			pushSelf
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     12
			jmp      code_053d
code_0493:
			ipToa    state
			pushi    #cue
			pushi    0
			self     4
			jmp      code_053d
code_049e:
			dup     
			ldi      1
			eq?     
			bnt      code_04c2
			pushi    #view
			pushi    1
			pushi    671
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     18
			ldi      3
			aTop     cycles
			jmp      code_053d
code_04c2:
			dup     
			ldi      2
			eq?     
			bnt      code_04e5
			pushi    4
			lea      @local0
			push    
			pushi    999
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_053d
code_04e5:
			dup     
			ldi      3
			eq?     
			bnt      code_0531
			pushi    #fulkStatus
			pushi    1
			pushi    3
			class    Monastery
			send     6
			pushi    #view
			pushi    1
			pushi    671
			pushi    6
			pushi    1
			pushi    2
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    106
			pushi    250
			pushi    1
			pushi    15
			callk    ScriptID,  2
			send     28
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    126
			pushi    250
			pushSelf
			lag      global0
			send     12
			jmp      code_053d
code_0531:
			dup     
			ldi      4
			eq?     
			bnt      code_053d
			pushi    #dispose
			pushi    0
			self     4
code_053d:
			toss    
			ret     
		)
	)
)

(instance killEgoWithRing of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05b9
			pushi    0
			callb    proc0_3,  0
			pushi    107
			pushi    #species
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
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
			ldi      15
			add     
			push    
			pushSelf
			lofsa    chip
			send     22
			jmp      code_05ea
code_05b9:
			dup     
			ldi      1
			eq?     
			bnt      code_05d3
			pushi    4
			lea      @local60
			push    
			pushi    11
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_05ea
code_05d3:
			dup     
			ldi      2
			eq?     
			bnt      code_05ea
			lsg      global145
			ldi      20
			eq?     
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_05ea:
			toss    
			ret     
		)
	)
)

(instance giveItToHim of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_064c
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    165
			pushi    169
			pushSelf
			lag      global0
			send     12
			jmp      code_0707
code_064c:
			dup     
			ldi      1
			eq?     
			bnt      code_0667
			pushi    2
			lsg      global0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			ldi      10
			aTop     cycles
			jmp      code_0707
code_0667:
			dup     
			ldi      2
			eq?     
			bnt      code_0684
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    202
			pushi    172
			pushSelf
			lag      global0
			send     12
			jmp      code_0707
code_0684:
			dup     
			ldi      3
			eq?     
			bnt      code_06b3
			pushi    3
			lsg      global0
			pushi    1
			pushi    15
			callk    ScriptID,  2
			push    
			pushSelf
			callb    proc0_9,  6
			pushi    1
			pushi    300
			calle    proc806_1,  2
			pushi    #put
			pushi    2
			pushi    16
			pushi    65535
			lag      global0
			send     8
			jmp      code_0707
code_06b3:
			dup     
			ldi      4
			eq?     
			bnt      code_06f7
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			bnt      code_06cf
			lofsa    leaveNow
			aTop     next
			jmp      code_06f0
code_06cf:
			pushi    3
			lea      @local8
			push    
			pushi    999
			pushi    #tFULK
			pushi    0
			class    Monastery
			send     4
			push    
			calle    proc851_0,  6
			pushi    #fulkStatus
			pushi    1
			pushi    2
			class    Monastery
			send     6
code_06f0:
			ldi      1
			aTop     cycles
			jmp      code_0707
code_06f7:
			dup     
			ldi      5
			eq?     
			bnt      code_0707
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0707:
			toss    
			ret     
		)
	)
)
