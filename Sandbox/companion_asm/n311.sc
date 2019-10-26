;;; Sierra Script 1.0 - (do not remove this comment)
(script# 311)
(include sci.sh)
(use n000)
(use n992)
(use n994)
(use n999)

(public
	Fair 0
	proc311_1 1
	proc311_3 3
	proc311_4 4
)

(local
	local0
	local1
	local2
	local3
	[local4 7] = [0 1 6 5 4 3 2]
	[local11 23] = [315 55 262 65 236 90 154 90 38 60 -20 60 -20 165 14 165 205 165 281 165 315 165 -32768]
	[local34 19] = [4 163 22 163 59 163 97 163 155 163 221 163 248 154 278 146 315 146 -32768]
	[local53 17] = [4 148 26 143 100 142 158 152 214 165 258 164 302 159 315 158 -32768]
	[local70 23] = [4 160 34 160 91 143 159 134 204 134 267 111 317 81 251 62 166 50 96 52 4 52 -32768]
	[local93 23] = [315 41 295 42 253 52 230 55 190 67 151 64 122 54 95 48 68 49 22 59 4 60 -32768]
	[local116 19] = [315 60 309 60 287 55 231 57 164 57 107 57 74 57 23 57 4 57 -32768]
	[local135 7] = [0 10 8 7 10 10 8]
	[local142 3] = [1 1 1]
)
(procedure (proc311_1 param1 param2 param3 &tmp temp0 temp1)
	(asm
		pushi    #changeState
		pushi    1
		pushi    0
		lofsa    walkEm
		send     6
		lsp      param1
		lap      param2
		add     
		sat      temp0
		push    
		ldi      1
		lt?     
		bnt      code_02a6
		ldi      6
		sat      temp0
code_02a6:
		lst      temp0
		ldi      6
		gt?     
		bnt      code_02b2
		ldi      1
		sat      temp0
code_02b2:
		lap      param1
		lali     local4
		sat      temp1
		push    
		lap      param1
		eq?     
		bnt      code_02c3
		ldi      0
		sat      temp1
code_02c3:
		pushi    3
		lsp      param1
		lst      temp0
		lst      temp1
		call     localproc_0305,  6
		bnt      code_02e9
		ldi      0
		sal      local0
		pushi    #setScript
		pushi    3
		lofsa    sWalkOut
		push    
		pushi    0
		lsp      param3
		class    Fair
		send     10
		jmp      code_0304
code_02e9:
		pushi    #init
		pushi    5
		lap      param2
		neg     
		push    
		lsp      param1
		pushi    1
		lsp      param1
		call     localproc_03e1,  2
		push    
		lap      param1
		lsli     local135
		pushi    0
		lap      param3
		send     14
code_0304:
		ret     
	)
)

(procedure (proc311_3 &tmp temp0)
	(asm
		lsg      global11
		ldi      10
		div     
		push    
		ldi      27
		sub     
		sal      local2
		pushi    #y
		pushi    0
		lag      global0
		send     4
		push    
		ldi      99
		lt?     
		bnt      code_0451
		lal      local2
		lali     local4
		sal      local2
code_0451:
		lal      local2
		lali     local4
		sal      local3
		ldi      0
		sat      temp0
code_045b:
		lst      temp0
		ldi      3
		lt?     
		bnt      code_04ce
		lat      temp0
		lsgi     global120
		lal      local2
		eq?     
		bt       code_0474
		lat      temp0
		lsgi     global120
		lal      local3
		eq?     
code_0474:
		bnt      code_04c9
		lag      global198
		bnt      code_04c9
		lal      local0
		not     
		bnt      code_04c9
		pushi    1
		pushi    217
		callb    proc0_5,  2
		not     
		bnt      code_04c9
		lsg      global198
		ldi      280
		lt?     
		bnt      code_04c9
		ldi      1
		sal      local0
		pushi    107
		pushi    #view
		lat      temp0
		lsli     local142
		lsgi     global120
		pushi    1
		lsgi     global120
		call     localproc_03e1,  2
		push    
		lat      temp0
		lagi     global120
		lsli     local135
		pushi    #ticks
		pushi    0
		lofsa    walkEm
		send     4
		push    
		pushi    1
		pushi    312
		lat      temp0
		add     
		push    
		callk    ScriptID,  2
		send     14
code_04c9:
		+at      temp0
		jmp      code_045b
code_04ce:
		ret     
	)
)

(procedure (proc311_4 param1 &tmp temp0)
	(asm
		pushi    277
		pushi    #superClass
		lofsa    {Tis a cat}
		push    
		pushi    5
		pushi    1
		pushi    767
		pushi    6
		pushi    1
		pushi    2
		pushi    1
		pushi    2
		callk    Random,  4
		push    
		ldi      1
		sub     
		push    
		pushi    150
		pushi    1
		class    Walk
		push    
		lap      param1
		send     24
		pushi    2
		pushi    1
		pushi    5
		callk    Random,  4
		push    
		ldi      1
		sub     
		push    
		ldi      3
		eq?     
		bnt      code_0563
		lsg      global11
		ldi      300
		eq?     
		bt       code_0519
		lsg      global11
		ldi      290
		eq?     
code_0519:
		pushi    17
		pushi    1
		pushi    16400
		pushi    63
		pushi    1
		lsg      global11
		ldi      290
		eq?     
		bnt      code_0530
		ldi      4
		jmp      code_0532
code_0530:
		ldi      8
code_0532:
		push    
		pushi    4
		pushi    1
		pushi    #loop
		pushi    0
		lap      param1
		send     4
		push    
		ldi      0
		eq?     
		bnt      code_0549
		ldi      65526
		jmp      code_054c
code_0549:
		ldi      350
code_054c:
		push    
		pushi    3
		pushi    1
		pushi    84
		pushi    85
		pushi    1
		pushi    20
		pushi    142
		pushi    1
		lofsa    catWalk
		push    
		lap      param1
		send     36
code_0563:
		ret     
	)
)

(procedure (localproc_0305 param1 param2 param3 &tmp temp0 temp1)
	(asm
		ldi      0
		sat      temp0
code_030b:
		lst      temp0
		ldi      3
		lt?     
		bnt      code_03de
		lat      temp0
		lsgi     global120
		lap      param1
		eq?     
		bnt      code_03d9
		lsp      param1
		lap      param3
		eq?     
		bnt      code_0328
		ldi      0
		ret     
code_0328:
		lsp      param2
		lap      param1
		sub     
		sat      temp1
		push    
		ldi      65531
		eq?     
		bnt      code_033a
		ldi      1
		sat      temp1
code_033a:
		lst      temp1
		ldi      5
		eq?     
		bnt      code_0346
		ldi      65535
		sat      temp1
code_0346:
		lap      param2
		sap      param1
		lsp      param2
		lat      temp1
		add     
		sap      param2
		push    
		ldi      1
		lt?     
		bnt      code_035c
		ldi      6
		sap      param2
code_035c:
		lsp      param2
		ldi      6
		gt?     
		bnt      code_0368
		ldi      1
		sap      param2
code_0368:
		pushi    3
		lsp      param1
		lsp      param2
		lsp      param3
		call     localproc_0305,  6
		bnt      code_03d6
		lsp      param1
		lat      temp0
		sagi     global120
		lst      temp1
		lat      temp0
		sali     local142
		lag      global198
		bnt      code_03d0
		lal      local0
		not     
		bnt      code_03d0
		lsg      global198
		ldi      280
		lt?     
		bnt      code_03d0
		pushi    1
		pushi    217
		callb    proc0_5,  2
		not     
		bnt      code_03d0
		lsp      param1
		lap      param3
		eq?     
		bnt      code_03d0
		ldi      1
		sal      local0
		pushi    107
		pushi    #view
		lst      temp1
		lsp      param1
		pushi    1
		lsp      param1
		call     localproc_03e1,  2
		push    
		lap      param1
		lsli     local135
		pushi    0
		pushi    1
		pushi    312
		lat      temp0
		add     
		push    
		callk    ScriptID,  2
		send     14
code_03d0:
		ldi      1
		ret     
		jmp      code_03d9
code_03d6:
		ldi      0
		ret     
code_03d9:
		+at      temp0
		jmp      code_030b
code_03de:
		ldi      1
		ret     
	)
)

(procedure (localproc_03e1 param1)
	(asm
		lsp      param1
		dup     
		ldi      1
		eq?     
		bnt      code_03f0
		lea      @local11
		jmp      code_042e
code_03f0:
		dup     
		ldi      2
		eq?     
		bnt      code_03fd
		lea      @local34
		jmp      code_042e
code_03fd:
		dup     
		ldi      3
		eq?     
		bnt      code_040a
		lea      @local53
		jmp      code_042e
code_040a:
		dup     
		ldi      4
		eq?     
		bnt      code_0417
		lea      @local70
		jmp      code_042e
code_0417:
		dup     
		ldi      5
		eq?     
		bnt      code_0424
		lea      @local93
		jmp      code_042e
code_0424:
		dup     
		ldi      6
		eq?     
		bnt      code_042e
		lea      @local116
code_042e:
		toss    
		ret     
	)
)

(class Fair of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		firstPickpocket 1
		firstTalkMorgan 1
		firstClickF3Talk 1
		firstClickMan13 1
		firstClickMan20 1
		firstClikMan24 1
		firstClickF26 1
		man4FirstClickTk 1
		talkedWithMan4 0
		doneGambled 0
		firstAfterGambling 1
		firstCricket 1
		boughtRoseOil 0
		firstChristy 1
		walkingOut 0
		mX 0
		mY 0
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    #init
			pushi    0
			super    Rgn,  4
			pushi    #setScript
			pushi    1
			lofsa    walkEm
			push    
			self     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Rgn,  4
			pushi    1
			pushi    311
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (newRoom)
		(asm
			pushi    #has
			pushi    1
			pushi    17
			lag      global0
			send     6
			not     
			bnt      code_0041
			+ag      global155
code_0041:
			ldi      0
			sal      local0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      65526
			lt?     
			bnt      code_005c
			pushi    #x
			pushi    1
			pushi    65526
			lag      global0
			send     6
code_005c:
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      330
			gt?     
			bnt      code_0075
			pushi    #x
			pushi    1
			pushi    330
			lag      global0
			send     6
code_0075:
			ret     
		)
	)
)

(instance walkEm of Script
	(properties
		ticks 400
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0157
			pushi    1
			pushi    58
			callb    proc0_5,  2
			bnt      code_014f
			lsg      global155
			ldi      50
			gt?     
			bnt      code_014f
			pushi    #west
			pushi    1
			pushi    160
			pushi    389
			pushi    1
			pushi    160
			pushi    388
			pushi    1
			pushi    160
			pushi    390
			pushi    1
			pushi    160
			lag      global2
			send     24
code_014f:
			ldi      801
			aTop     ticks
			jmp      code_024c
code_0157:
			dup     
			ldi      1
			eq?     
			bnt      code_024c
			ldi      0
			sat      temp0
code_0162:
			lst      temp0
			ldi      3
			lt?     
			bnt      code_0245
			lat      temp0
			lsgi     global120
			lal      local2
			ne?     
			bnt      code_0240
			lat      temp0
			lsgi     global120
			lal      local3
			ne?     
			bnt      code_0240
			lat      temp0
			lsgi     global120
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			add     
			push    
			ldi      65534
			add     
			sat      temp2
			push    
			ldi      1
			lt?     
			bnt      code_019b
			ldi      6
			sat      temp2
code_019b:
			lst      temp2
			ldi      6
			gt?     
			bnt      code_01a7
			ldi      1
			sat      temp2
code_01a7:
			lst      temp2
			lag      global120
			ne?     
			bnt      code_0240
			lst      temp2
			lag      global121
			ne?     
			bnt      code_0240
			lst      temp2
			lag      global122
			ne?     
			bnt      code_0240
			lst      temp2
			lat      temp0
			lagi     global120
			sub     
			sat      temp3
			push    
			ldi      65531
			eq?     
			bnt      code_01d3
			ldi      1
			sat      temp3
code_01d3:
			lst      temp3
			ldi      5
			eq?     
			bnt      code_01df
			ldi      65535
			sat      temp3
code_01df:
			lst      temp2
			lal      local2
			eq?     
			bt       code_01ec
			lst      temp2
			lal      local3
			eq?     
code_01ec:
			bnt      code_0234
			lag      global198
			bnt      code_0234
			lal      local0
			not     
			bnt      code_0234
			pushi    1
			pushi    217
			callb    proc0_5,  2
			not     
			bnt      code_0234
			lsg      global198
			ldi      280
			lt?     
			bnt      code_0234
			ldi      1
			sal      local0
			pushi    107
			pushi    #view
			lst      temp3
			lst      temp2
			pushi    1
			lst      temp2
			call     localproc_03e1,  2
			push    
			lat      temp2
			lsli     local135
			pushi    0
			pushi    1
			pushi    312
			lat      temp0
			add     
			push    
			callk    ScriptID,  2
			send     14
code_0234:
			lst      temp2
			lat      temp0
			sagi     global120
			lst      temp3
			lat      temp0
			sali     local142
code_0240:
			+at      temp0
			jmp      code_0162
code_0245:
			pushi    #changeState
			pushi    1
			pushi    0
			self     6
code_024c:
			toss    
			ret     
		)
	)
)

(instance catWalk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0599
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_058c
			ldi      250
			jmp      code_058e
code_058c:
			ldi      25
code_058e:
			push    
			pushi    84
			pushSelf
			pToa     client
			send     12
			jmp      code_05da
code_0599:
			dup     
			ldi      1
			eq?     
			bnt      code_05ce
			pushi    6
			pushi    1
			pushi    #loop
			pushi    0
			pToa     client
			send     4
			push    
			ldi      0
			eq?     
			bnt      code_05b6
			ldi      2
			jmp      code_05b8
code_05b6:
			ldi      3
code_05b8:
			push    
			pushi    219
			pushi    1
			pushi    12
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			pToa     client
			send     20
			jmp      code_05da
code_05ce:
			dup     
			ldi      2
			eq?     
			bnt      code_05da
			pushi    #dispose
			pushi    0
			self     4
code_05da:
			toss    
			ret     
		)
	)
)

(instance sWalkOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0678
			pushi    #walkingOut
			pushi    1
			pushi    1
			class    Fair
			send     6
			pushi    #x
			pushi    0
			pToa     register
			send     4
			push    
			ldi      10
			lt?     
			bnt      code_0658
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65526
			pushi    #y
			pushi    0
			pToa     register
			send     4
			push    
			pushSelf
			pToa     register
			send     18
			jmp      code_0699
code_0658:
			pushi    #setLoop
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    333
			pushi    #y
			pushi    0
			pToa     register
			send     4
			push    
			pushSelf
			pToa     register
			send     18
			jmp      code_0699
code_0678:
			dup     
			ldi      1
			eq?     
			bnt      code_0699
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
			pushi    #walkingOut
			pushi    1
			pushi    0
			class    Fair
			send     6
			pushi    #setScript
			pushi    1
			lofsa    walkEm
			push    
			self     6
code_0699:
			toss    
			ret     
		)
	)
)
