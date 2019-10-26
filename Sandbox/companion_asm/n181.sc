;;; Sierra Script 1.0 - (do not remove this comment)
(script# 181)
(include sci.sh)
(use n000)
(use n945)
(use n992)
(use n998)
(use n999)

(public
	tossIt 1
	theNet 2
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
)
(instance tossIt of Script
	(properties)
	
	(method (init param1 param2 param3)
		(asm
			lsg      global125
			dup     
			ldi      1
			eq?     
			bnt      code_0027
			ldi      140
			sal      local4
			jmp      code_004e
code_0027:
			dup     
			ldi      2
			eq?     
			bnt      code_0035
			ldi      65
			sal      local4
			jmp      code_004e
code_0035:
			dup     
			ldi      3
			eq?     
			bnt      code_0043
			ldi      30
			sal      local4
			jmp      code_004e
code_0043:
			dup     
			ldi      4
			eq?     
			bnt      code_004e
			ldi      20
			sal      local4
code_004e:
			toss    
			lap      param2
			sal      local0
			sag      global104
			lap      param3
			sal      local1
			sag      global105
			pushi    #init
			pushi    3
			lsp      param1
			pushi    0
			pushi    0
			super    Script,  10
			ret     
		)
	)
	
	(method (doit)
		(asm
			pushi    1
			pushi    104
			callb    proc0_5,  2
			bnt      code_0120
			pushi    #distanceTo
			pushi    1
			lofsa    theNet
			push    
			pushi    2
			pushi    185
			pushi    0
			callk    ScriptID,  4
			send     6
			push    
			lal      local4
			lt?     
			bnt      code_0120
			pushi    1
			pushi    37
			callb    proc0_5,  2
			bnt      code_0120
			pushi    #loop
			pushi    0
			pushi    2
			pushi    185
			pushi    0
			callk    ScriptID,  4
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_00bd
			pushi    #x
			pushi    0
			pushi    2
			pushi    185
			pushi    0
			callk    ScriptID,  4
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    theNet
			send     4
			lt?     
code_00bd:
			bt       code_00eb
			pushi    #loop
			pushi    0
			pushi    2
			pushi    185
			pushi    0
			callk    ScriptID,  4
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_0120
			pushi    #x
			pushi    0
			pushi    2
			pushi    185
			pushi    0
			callk    ScriptID,  4
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    theNet
			send     4
			gt?     
code_00eb:
			bnt      code_0120
			pushi    1
			pushi    104
			callb    proc0_7,  2
			pushi    1
			pushi    42
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    185
			pushi    2
			callk    ScriptID,  4
			push    
			pushi    2
			pushi    220
			pushi    0
			callk    ScriptID,  4
			send     6
			pushi    #put
			pushi    1
			pushi    4
			lag      global0
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0120:
			pushi    #doit
			pushi    0
			super    Script,  4
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
			bnt      code_0261
			lag      global143
			not     
			bnt      code_013d
			pushi    0
			callb    proc0_3,  0
code_013d:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    4
			dup     
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lsl      local0
			lsl      local1
			callk    GetAngle,  8
			sal      local5
			push    
			ldi      20
			le?     
			bt       code_0175
			lsl      local5
			ldi      340
			gt?     
			bt       code_0175
			lsl      local5
			ldi      60
			le?     
code_0175:
			bnt      code_019f
			pushi    #setLoop
			pushi    1
			pushi    3
			lag      global0
			send     6
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      11
			add     
			sal      local2
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      55
			sub     
			sal      local3
			jmp      code_0243
code_019f:
			lsl      local5
			ldi      100
			le?     
			bt       code_01ad
			lsl      local5
			ldi      160
			le?     
code_01ad:
			bnt      code_01d6
			pushi    #setLoop
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      54
			add     
			sal      local2
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      51
			sub     
			sal      local3
			jmp      code_0243
code_01d6:
			lsl      local5
			ldi      200
			le?     
			bt       code_01e5
			lsl      local5
			ldi      240
			le?     
code_01e5:
			bnt      code_020e
			pushi    #setLoop
			pushi    1
			pushi    2
			lag      global0
			send     6
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      24
			sub     
			sal      local2
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      47
			sub     
			sal      local3
			jmp      code_0243
code_020e:
			lsl      local5
			ldi      290
			le?     
			bt       code_021d
			lsl      local5
			ldi      340
			le?     
code_021d:
			bnt      code_0243
			pushi    #setLoop
			pushi    1
			pushi    1
			lag      global0
			send     6
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      48
			sub     
			sal      local2
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      51
			sub     
			sal      local3
code_0243:
			pushi    #view
			pushi    1
			pushi    181
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    6
			pushi    1
			pushSelf
			lag      global0
			send     24
			jmp      code_0346
code_0261:
			dup     
			ldi      1
			eq?     
			bnt      code_029d
			pushi    #setCel
			pushi    1
			pushi    7
			lag      global0
			send     6
			pushi    284
			pushi    #-info-
			lsl      local2
			lsl      local3
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    End
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			lsl      local0
			lsl      local1
			ldi      20
			sub     
			push    
			pushSelf
			lofsa    theNet
			send     30
			jmp      code_0346
code_029d:
			dup     
			ldi      2
			eq?     
			bnt      code_02fa
			pushi    0
			callb    proc0_2,  0
			pushi    1
			pushi    104
			callb    proc0_6,  2
			pushi    1
			pushi    218
			callb    proc0_6,  2
			pushi    #setCel
			pushi    1
			pushi    0
			lofsa    theNet
			send     6
			lsg      global125
			dup     
			ldi      1
			eq?     
			bnt      code_02cf
			ldi      3
			aTop     seconds
			jmp      code_02f6
code_02cf:
			dup     
			ldi      2
			eq?     
			bnt      code_02dd
			ldi      2
			aTop     seconds
			jmp      code_02f6
code_02dd:
			dup     
			ldi      3
			eq?     
			bnt      code_02eb
			ldi      1
			aTop     seconds
			jmp      code_02f6
code_02eb:
			dup     
			ldi      4
			eq?     
			bnt      code_02f6
			ldi      30
			aTop     ticks
code_02f6:
			toss    
			jmp      code_0346
code_02fa:
			dup     
			ldi      3
			eq?     
			bnt      code_030e
			pushi    1
			pushi    104
			callb    proc0_7,  2
			ldi      12
			aTop     ticks
			jmp      code_0346
code_030e:
			dup     
			ldi      4
			eq?     
			bnt      code_0333
			pushi    #disable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    1
			pushi    37
			callb    proc0_5,  2
			bnt      code_032c
			ldi      0
			jmp      code_0346
code_032c:
			ldi      12
			aTop     ticks
			jmp      code_0346
code_0333:
			dup     
			ldi      5
			eq?     
			bnt      code_0346
			pushi    #setScript
			pushi    1
			lofsa    getNet
			push    
			lag      global0
			send     6
code_0346:
			toss    
			ret     
		)
	)
)

(instance getNet of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #dispose
			pushi    0
			lofsa    theNet
			send     4
			ret     
		)
	)
	
	(method (changeState newState &tmp [temp0 2])
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0418
			pushi    #enable
			pushi    1
			pushi    0
			lag      global69
			send     6
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    theNet
			send     4
			lt?     
			bnt      code_03ee
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    theNet
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    theNet
			send     4
			push    
			ldi      16
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_04fd
code_03ee:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    theNet
			send     4
			push    
			ldi      8
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    theNet
			send     4
			push    
			ldi      16
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_04fd
code_0418:
			dup     
			ldi      1
			eq?     
			bnt      code_045c
			pushi    5
			pushi    1
			pushi    7
			pushi    288
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    theNet
			send     4
			lt?     
			bnt      code_0446
			ldi      1
			jmp      code_0448
code_0446:
			ldi      0
code_0448:
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    4
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_04fd
code_045c:
			dup     
			ldi      2
			eq?     
			bnt      code_0481
			pushi    #hide
			pushi    0
			lofsa    theNet
			send     4
			pushi    1
			pushi    218
			callb    proc0_7,  2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_04fd
code_0481:
			dup     
			ldi      3
			eq?     
			bnt      code_04bf
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      188
			gt?     
			bnt      code_04b6
			pushi    0
			callb    proc0_2,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    180
			pushSelf
			lag      global0
			send     12
			jmp      code_04fd
code_04b6:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_04fd
code_04bf:
			dup     
			ldi      4
			eq?     
			bnt      code_04fd
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			not     
			bnt      code_04dd
			pushi    #loop
			pushi    1
			pushi    6
			lag      global0
			send     6
			jmp      code_04e6
code_04dd:
			pushi    #loop
			pushi    1
			pushi    7
			lag      global0
			send     6
code_04e6:
			pushi    #get
			pushi    1
			pushi    4
			lag      global0
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_04fd:
			toss    
			ret     
		)
	)
)

(instance theNet of Actor
	(properties
		z -10
		yStep 21
		view 181
		loop 4
		signal $6800
		xStep 30
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Actor,  4
			pushi    #delete
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0562
			pushi    #setScript
			pushi    1
			lofsa    getNet
			push    
			lag      global0
			send     6
			jmp      code_056d
code_0562:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_056d:
			toss    
			ret     
		)
	)
)
