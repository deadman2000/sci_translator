;;; Sierra Script 1.0 - (do not remove this comment)
(script# 402)
(include sci.sh)
(use n000)
(use n400)
(use n806)
(use n813)
(use n851)
(use n953)
(use n992)

(public
	puckScript 0
	SheriffPuckActions 1
)

(local
	local0
	local1
	local2
	local3
	local4
	[local5 8] = [1402 0 2 3 1 2 1]
	[local13 4] = [1402 5 2]
	[local17 17] = [1402 6 1 2 1 2 1 1 2 1 2 2 1 2 1 1]
	[local34 18] = [1402 20 2 2 0 1402 22 2 1 0 1402 24 2 0 1402 25 2]
	[local52 6] = [1402 26 1 2 2]
	[local58 8] = [1402 29 1 2 2 1 2]
	[local66 8] = [1402 34 1 2 1 2 2]
	[local74 8] = [1402 39 1 1 2 1 2]
	[local82 5] = [1402 44 1 2]
	[local87 6] = [1402 46 1 1 2]
	[local93 7] = [1402 49 1 2 1 2]
	[local100 5] = [1402 53 1 2]
	[local105 9] = [1402 55 1 2 1 2 1 2]
	[local114 6] = [1402 61 2 1 2]
	[local120 8] = [1402 64 1 2 1 2 1]
)
(procedure (localproc_0012 param1 param2)
	(asm
		pushi    8
		pushi    3
		lsp      param1
		pushi    999
		pushi    3
		pushi    12
		pushi    1
		pushi    19
		pushi    2
		&rest    param2
		calle    proc851_0,  16
		ret     
	)
)

(instance puckScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_008c
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    400
			pushi    2
			callk    ScriptID,  4
			sal      local0
			pushi    2
			pushi    400
			pushi    3
			callk    ScriptID,  4
			sal      local1
			pushi    2
			pushi    400
			pushi    4
			callk    ScriptID,  4
			sal      local2
			pushi    2
			pushi    400
			pushi    5
			callk    ScriptID,  4
			sal      local3
			pushi    2
			pushi    400
			pushi    6
			callk    ScriptID,  4
			sal      local4
			pushi    1
			pushi    146
			callb    proc0_6,  2
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lal      local0
			send     14
			jmp      code_0159
code_008c:
			dup     
			ldi      1
			eq?     
			bnt      code_00d0
			pushi    #xOffset
			pushi    1
			pushi    15
			pushi    363
			pushi    1
			pushi    9
			pushi    #mover
			pushi    0
			lal      local3
			send     4
			send     12
			pushi    #xOffset
			pushi    1
			pushi    65526
			pushi    363
			pushi    1
			pushi    65530
			pushi    #mover
			pushi    0
			lal      local4
			send     4
			send     12
			pushi    #setMotion
			pushi    4
			class    Approach
			push    
			lsg      global0
			pushi    2
			pushSelf
			lal      local2
			send     12
			jmp      code_0159
code_00d0:
			dup     
			ldi      2
			eq?     
			bnt      code_00e4
			pushi    2
			lea      @local5
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0159
code_00e4:
			dup     
			ldi      3
			eq?     
			bnt      code_010d
			pushi    #setMotion
			pushi    3
			class    GuardFollow
			push    
			lsg      global0
			pushi    2
			lal      local2
			send     10
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lal      local0
			send     14
			jmp      code_0159
code_010d:
			dup     
			ldi      4
			eq?     
			bnt      code_0135
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #approachX
			pushi    0
			lal      local1
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0159
code_0135:
			dup     
			ldi      5
			eq?     
			bnt      code_0149
			pushi    2
			lea      @local13
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0159
code_0149:
			dup     
			ldi      6
			eq?     
			bnt      code_0159
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0159:
			toss    
			ret     
		)
	)
)

(instance wolfsHeadScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_01b7
			ipToa    register
			ldi      1
			aTop     notKilled
			pushi    2
			lea      @local17
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_021b
code_01b7:
			dup     
			ldi      1
			eq?     
			bnt      code_01d2
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lal      local0
			send     14
			jmp      code_021b
code_01d2:
			dup     
			ldi      2
			eq?     
			bnt      code_01e6
			pushi    2
			lea      @local34
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_021b
code_01e6:
			dup     
			ldi      3
			eq?     
			bnt      code_020b
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    1
			pushi    180
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    240
			lag      global2
			send     6
			jmp      code_021b
code_020b:
			dup     
			ldi      4
			eq?     
			bnt      code_021b
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_021b:
			toss    
			ret     
		)
	)
)

(instance puckTalkToSheriffArrow of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_029f
			ipToa    register
			pushi    2
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_0278
			lea      @local52
			jmp      code_0295
code_0278:
			dup     
			ldi      2
			eq?     
			bnt      code_0285
			lea      @local58
			jmp      code_0295
code_0285:
			dup     
			ldi      3
			eq?     
			bnt      code_0292
			lea      @local66
			jmp      code_0295
code_0292:
			lea      @local74
code_0295:
			toss    
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_02d0
code_029f:
			dup     
			ldi      1
			eq?     
			bnt      code_02c4
			pTos     register
			ldi      4
			eq?     
			bnt      code_02bc
			pushi    #setScript
			pushi    2
			lofsa    wolfsHeadScript
			push    
			pushSelf
			self     8
			jmp      code_02d0
code_02bc:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_02d0
code_02c4:
			dup     
			ldi      2
			eq?     
			bnt      code_02d0
			pushi    #dispose
			pushi    0
			self     4
code_02d0:
			toss    
			ret     
		)
	)
)

(instance puckTalkToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0360
			ipToa    register
			pushi    2
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_032c
			lea      @local82
			jmp      code_0356
code_032c:
			dup     
			ldi      2
			eq?     
			bnt      code_0339
			lea      @local87
			jmp      code_0356
code_0339:
			dup     
			ldi      3
			eq?     
			bnt      code_0346
			lea      @local93
			jmp      code_0356
code_0346:
			dup     
			ldi      4
			eq?     
			bnt      code_0353
			lea      @local100
			jmp      code_0356
code_0353:
			lea      @local105
code_0356:
			toss    
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0391
code_0360:
			dup     
			ldi      1
			eq?     
			bnt      code_0385
			pTos     register
			ldi      5
			eq?     
			bnt      code_037d
			pushi    #setScript
			pushi    2
			lofsa    wolfsHeadScript
			push    
			pushSelf
			self     8
			jmp      code_0391
code_037d:
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0391
code_0385:
			dup     
			ldi      2
			eq?     
			bnt      code_0391
			pushi    #dispose
			pushi    0
			self     4
code_0391:
			toss    
			ret     
		)
	)
)

(instance puckWager of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03e9
			pushi    2
			lea      @local120
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_040a
code_03e9:
			dup     
			ldi      1
			eq?     
			bnt      code_03fe
			pushi    #setScript
			pushi    2
			lofsa    wolfsHeadScript
			push    
			pushSelf
			self     8
			jmp      code_040a
code_03fe:
			dup     
			ldi      2
			eq?     
			bnt      code_040a
			pushi    #dispose
			pushi    0
			self     4
code_040a:
			toss    
			ret     
		)
	)
)

(instance puckWagerSmall of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0461
			pushi    2
			lea      @local114
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_046d
code_0461:
			dup     
			ldi      1
			eq?     
			bnt      code_046d
			pushi    #dispose
			pushi    0
			self     4
code_046d:
			toss    
			ret     
		)
	)
)

(instance SheriffPuckActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 &tmp temp0)
		(asm
			lal      local0
			sat      temp0
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_04db
			pushi    142
			pushi    1
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_04ce
			lofsa    puckTalkToSheriffArrow
			jmp      code_04d1
code_04ce:
			lofsa    puckTalkToSheriff
code_04d1:
			push    
			lat      temp0
			send     6
			ldi      1
			jmp      code_052d
code_04db:
			dup     
			ldi      4
			eq?     
			bnt      code_052d
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_052c
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			not     
			bnt      code_04f9
			jmp      code_052a
code_04f9:
			pushi    12
			pushi    #taken
			pushi    0
			lag      global152
			send     4
			le?     
			bnt      code_0516
			pushi    #setScript
			pushi    1
			lofsa    puckWager
			push    
			lat      temp0
			send     6
			jmp      code_052a
code_0516:
			pushi    #put
			pushi    0
			lag      global152
			send     4
			pushi    #setScript
			pushi    1
			lofsa    puckWagerSmall
			push    
			lat      temp0
			send     6
code_052a:
			ldi      1
code_052c:
			toss    
code_052d:
			toss    
			ret     
		)
	)
)
