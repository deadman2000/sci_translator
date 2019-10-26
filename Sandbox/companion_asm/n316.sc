;;; Sierra Script 1.0 - (do not remove this comment)
(script# 316)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n851)
(use n992)
(use n998)
(use n999)

(public
	marian 0
)

(local
	local0
	[local1 13] = [1316 4 1 2 1 2 1 2 1 2 1 2]
	[local14 4] = [1316 15 2]
	[local18 4] = [1316 16 2]
	[local22 4] = [1316 17 2]
	local26
)
(instance marian of Actor
	(properties
		view 270
		cycleSpeed 10
		moveSpeed 10
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			super    Actor,  4
			pushi    #mY
			pushi    0
			class    Fair
			send     4
			not     
			bnt      code_0025
			ldi      320
			sag      global198
code_0025:
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    141
			pushi    0
			self     10
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_0098
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_0055
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
			jmp      code_0174
code_0055:
			pushi    #distanceTo
			pushi    1
			lofsa    marian
			push    
			lag      global0
			send     6
			push    
			ldi      40
			gt?     
			bnt      code_0074
			pushi    2
			pushi    1311
			pushi    0
			calle    proc13_4,  4
			jmp      code_0174
code_0074:
			pushi    0
			callb    proc0_3,  0
			pushi    #setLoop
			pushi    3
			pushi    65535
			pTos     species
			pushi    0
			pushi    283
			pushi    1
			pushi    0
			self     16
			pushi    #setScript
			pushi    1
			lofsa    sTalkMarian
			push    
			lag      global2
			send     6
			jmp      code_0174
code_0098:
			dup     
			ldi      3
			eq?     
			bnt      code_00cb
			pushi    #distanceTo
			pushi    1
			lofsa    marian
			push    
			lag      global0
			send     6
			push    
			ldi      40
			gt?     
			bnt      code_00be
			pushi    2
			pushi    1311
			pushi    1
			calle    proc13_4,  4
			jmp      code_0174
code_00be:
			pushi    2
			pushi    1316
			pushi    3
			calle    proc13_4,  4
			jmp      code_0174
code_00cb:
			dup     
			ldi      4
			eq?     
			bnt      code_013c
			pushi    #distanceTo
			pushi    1
			lofsa    marian
			push    
			lag      global0
			send     6
			push    
			ldi      40
			gt?     
			bnt      code_00f1
			pushi    2
			pushi    1311
			pushi    1
			calle    proc13_4,  4
			jmp      code_0174
code_00f1:
			lsp      param2
			dup     
			ldi      17
			eq?     
			bnt      code_0110
			pushi    5
			lea      @local22
			push    
			pushi    999
			pushi    21
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0138
code_0110:
			dup     
			ldi      0
			eq?     
			bnt      code_012d
			pushi    5
			lea      @local18
			push    
			pushi    999
			pushi    21
			pushi    0
			pushi    1
			calle    proc851_0,  10
			jmp      code_0138
code_012d:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0138:
			toss    
			jmp      code_0174
code_013c:
			dup     
			ldi      2
			eq?     
			bnt      code_0169
			lal      local0
			not     
			bnt      code_015b
			ldi      1
			sal      local0
			pushi    3
			pushi    1316
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_0174
code_015b:
			pushi    3
			pushi    1316
			pushi    2
			pushi    1
			calle    proc13_4,  6
			jmp      code_0174
code_0169:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_0174:
			toss    
			ret     
		)
	)
	
	(method (delete)
		(asm
			pushi    #mX
			pushi    1
			pTos     x
			class    Fair
			send     6
			pushi    #mY
			pushi    1
			pTos     y
			class    Fair
			send     6
			pushi    #delete
			pushi    0
			super    Actor,  4
			pushi    1
			pushi    316
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (cue &tmp temp0 temp1 temp2)
		(asm
			pushi    #mX
			pushi    0
			class    Fair
			send     4
			sat      temp1
			pushi    #mY
			pushi    0
			class    Fair
			send     4
			sat      temp2
			lat      temp1
			bt       code_01b5
			lat      temp2
code_01b5:
			bnt      code_01cd
			lag      global198
			sat      temp0
			pushi    #mX
			pushi    1
			pushi    0
			pushi    660
			pushi    1
			pushi    0
			class    Fair
			send     12
			jmp      code_01d6
code_01cd:
			lsg      global198
			ldi      10
			sub     
			sag      global198
			sat      temp0
code_01d6:
			lst      temp0
			dup     
			ldi      310
			eq?     
			bnt      code_01e7
			ldi      46
			sal      local26
			jmp      code_021a
code_01e7:
			dup     
			ldi      300
			eq?     
			bnt      code_01f6
			ldi      51
			sal      local26
			jmp      code_021a
code_01f6:
			dup     
			ldi      290
			eq?     
			bnt      code_0205
			ldi      60
			sal      local26
			jmp      code_021a
code_0205:
			dup     
			ldi      280
			eq?     
			bnt      code_0214
			ldi      60
			sal      local26
			jmp      code_021a
code_0214:
			pushi    #dispose
			pushi    0
			self     4
			ret     
code_021a:
			toss    
			pushi    162
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    4
			pushi    1
			lat      temp1
			bnt      code_0232
			jmp      code_0235
code_0232:
			ldi      318
code_0235:
			push    
			pushi    3
			pushi    1
			lsl      local26
			pushi    85
			pushi    1
			lsg      global198
			lag      global11
			eq?     
			bnt      code_024b
			ldi      0
			jmp      code_024e
code_024b:
			ldi      1000
code_024e:
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    3
			lsl      local26
			pushSelf
			self     42
			ret     
		)
	)
)

(instance sTalkMarian of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0305
			ldi      2
			aTop     ticks
			jmp      code_039c
code_0305:
			dup     
			ldi      1
			eq?     
			bnt      code_0327
			pushi    2
			lofsa    marian
			push    
			lsg      global0
			callb    proc0_9,  4
			pushi    2
			lsg      global0
			lofsa    marian
			push    
			callb    proc0_9,  4
			ldi      20
			aTop     ticks
			jmp      code_039c
code_0327:
			dup     
			ldi      2
			eq?     
			bnt      code_036b
			pushi    1
			pushi    197
			callb    proc0_5,  2
			bnt      code_034e
			pushi    5
			lea      @local14
			push    
			pushi    999
			pushi    21
			pushSelf
			pushi    1
			calle    proc851_0,  10
			jmp      code_039c
code_034e:
			pushi    5
			lea      @local1
			push    
			pushi    999
			pushi    21
			pushSelf
			pushi    1
			calle    proc851_0,  10
			pushi    1
			pushi    197
			callb    proc0_6,  2
			jmp      code_039c
code_036b:
			dup     
			ldi      3
			eq?     
			bnt      code_039c
			pushi    0
			callb    proc0_4,  0
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    3
			lsl      local26
			lofsa    marian
			push    
			lofsa    marian
			send     24
			pushi    #dispose
			pushi    0
			self     4
code_039c:
			toss    
			ret     
		)
	)
)
