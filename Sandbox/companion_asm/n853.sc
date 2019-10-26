;;; Sierra Script 1.0 - (do not remove this comment)
(script# 853)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n950)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	thePuzzleBox 0
	cursorPause 1
)

(local
	local0
	local1
	local2
	local3 =  1
	local4
	[local5 8]
	[local13 10] = [4950 4957 4964 4972 4979 4987 4995 5003 5013 5022]
	local23
	local24
	local25
	local26
	local27
	local28
	local29
	local30
	local31
)
(procedure (localproc_0012)
	(asm
		pushi    #eachElementDo
		pushi    2
		pushi    288
		ldi      0
		sal      local2
		push    
		lofsa    newCast
		send     8
		pushi    #setCel
		pushi    1
		pushi    11
		lofsa    theRing
		send     6
		ldi      1
		sal      local3
		ret     
	)
)

(procedure (localproc_0032 param1)
	(asm
		pushi    4
		lea      @local1
		push    
		pushi    853
		pushi    0
		pushi    2
		lsl      local4
		lsl      local2
		callk    StrAt,  4
		push    
		callk    Format,  8
		pushi    #play
		pushi    0
		lofsa    clickSound
		send     4
		pushi    #setCel
		pushi    1
		pushi    1
		lap      param1
		send     6
		pushi    2
		lea      @local0
		push    
		lea      @local1
		push    
		callk    StrCmp,  4
		push    
		ldi      0
		ne?     
		bnt      code_0070
		ldi      0
		sal      local3
code_0070:
		+al      local2
		push    
		ldi      10
		eq?     
		bnt      code_008b
		lal      local3
		not     
		bnt      code_008b
		pushi    #setScript
		pushi    1
		lofsa    endIt
		push    
		lag      global1
		send     6
code_008b:
		ret     
	)
)

(procedure (localproc_0194 param1 param2)
	(asm
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    hideMe
		push    
		lag      global5
		send     8
		lag      global5
		sal      local25
		lag      global32
		sal      local26
		lag      global10
		sal      local27
		lag      global8
		sal      local28
		lag      global73
		sal      local29
		lag      global72
		sal      local30
		lag      global74
		sal      local31
		ldi      0
		sag      global8
		sag      global10
		sag      global32
		sag      global5
		sag      global74
		sag      global72
		sag      global73
		pushi    2
		lsp      param1
		lsp      param2
		callk    DrawPic,  4
		pushi    #add
		pushi    0
		lofsa    newCast
		sag      global5
		send     4
		pushi    #add
		pushi    0
		lofsa    newFeatures
		sag      global32
		send     4
		pushi    #add
		pushi    0
		lofsa    newSounds
		sag      global8
		send     4
		pushi    #add
		pushi    2
		lsg      global5
		lsg      global32
		lofsa    newMH
		sag      global73
		send     8
		pushi    #add
		pushi    2
		lsg      global5
		lsg      global32
		lofsa    newKH
		sag      global72
		send     8
		pushi    #add
		pushi    2
		lsg      global5
		lsg      global32
		lofsa    newDH
		sag      global74
		send     8
		ret     
	)
)

(procedure (localproc_021e)
	(asm
		pushi    #eachElementDo
		pushi    1
		pushi    108
		pushi    116
		pushi    1
		pushi    84
		pushi    122
		pushi    0
		pushi    108
		pushi    0
		lag      global5
		send     20
		pushi    #eachElementDo
		pushi    1
		pushi    108
		pushi    122
		pushi    0
		pushi    108
		pushi    0
		lag      global32
		send     14
		pushi    #eachElementDo
		pushi    1
		pushi    108
		pushi    122
		pushi    0
		pushi    108
		pushi    0
		lag      global8
		send     14
		pushi    1
		pushi    806
		callk    DisposeScript,  2
		pushi    #dispose
		pushi    0
		lag      global73
		send     4
		pushi    #dispose
		pushi    0
		lag      global72
		send     4
		pushi    #dispose
		pushi    0
		lag      global74
		send     4
		pushi    #drawPic
		pushi    1
		pushi    #picture
		pushi    0
		lag      global2
		send     4
		push    
		lag      global2
		send     6
		lal      local25
		sag      global5
		lal      local26
		sag      global32
		lal      local28
		sag      global8
		pushi    #doit
		pushi    0
		lal      local27
		sag      global10
		send     4
		lal      local29
		sag      global73
		lal      local30
		sag      global72
		lal      local31
		sag      global74
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    showMe
		push    
		lag      global5
		send     8
		ret     
	)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMH of EventHandler
	(properties)
)

(instance newKH of EventHandler
	(properties)
)

(instance newDH of EventHandler
	(properties)
)

(instance newSounds of EventHandler
	(properties)
	
	(method (pause param1)
		(asm
			pushi    116
			pushi    3
			pushi    99
			lofsa    mightPause
			push    
			lap      argc
			bnt      code_0130
			lap      param1
			jmp      code_0132
code_0130:
			ldi      1
code_0132:
			push    
			self     10
			ret     
		)
	)
)

(instance mightPause of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    #flags
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1
			and     
			not     
			bnt      code_0173
			pushi    #pause
			pushi    1
			lsp      param2
			lap      param1
			send     6
code_0173:
			ret     
		)
	)
)

(instance hideMe of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    85
			pushi    #superClass
			pushi    #z
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1000
			add     
			push    
			lap      param1
			send     6
			ret     
		)
	)
)

(instance showMe of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    85
			pushi    #superClass
			pushi    #z
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1000
			sub     
			push    
			lap      param1
			send     6
			ret     
		)
	)
)

(instance thePuzzleBox of Code
	(properties)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #doit
			pushi    0
			pushi    1
			pushi    854
			callk    ScriptID,  2
			send     4
			bnt      code_033c
			pushi    1
			pushi    854
			callk    DisposeScript,  2
			pushi    1
			pushi    853
			callk    DisposeScript,  2
			pushi    0
			callb    proc0_4,  0
			ret     
code_033c:
			pushi    1
			pushi    854
			callk    DisposeScript,  2
			lag      global19
			sal      local24
			pushi    0
			callb    proc0_3,  0
			pushi    #disable
			pushi    1
			pushi    8
			lag      global69
			send     6
			pushi    #canInput
			pushi    1
			pushi    1
			class    User
			send     6
			lag      global34
			sal      local23
			ldi      0
			sag      global34
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			push    
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			eq?     
			bnt      code_038a
			pushi    #message
			pushi    1
			pushi    11
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     6
code_038a:
			pushi    2
			pushi    803
			pushi    10
			call     localproc_0194,  4
			pushi    1
			pushi    126
			callb    proc0_6,  2
			ldi      0
			sat      temp0
code_039e:
			lst      temp0
			ldi      10
			lt?     
			bnt      code_03bc
			lsg      global144
			lat      temp0
			eq?     
			bnt      code_03b7
			lat      temp0
			lali     local13
			sal      local4
			jmp      code_03bc
code_03b7:
			+at      temp0
			jmp      code_039e
code_03bc:
			pushi    #init
			pushi    0
			lofsa    theR
			send     4
			pushi    #init
			pushi    0
			lofsa    theN
			send     4
			pushi    #init
			pushi    0
			lofsa    theA
			send     4
			pushi    #init
			pushi    0
			lofsa    theM
			send     4
			pushi    #init
			pushi    0
			lofsa    theF
			send     4
			pushi    #init
			pushi    0
			lofsa    theI
			send     4
			pushi    #init
			pushi    0
			lofsa    theO
			send     4
			pushi    #init
			pushi    0
			lofsa    theB
			send     4
			pushi    #init
			pushi    0
			lofsa    theE
			send     4
			pushi    #init
			pushi    0
			lofsa    theS
			send     4
			pushi    #init
			pushi    0
			lofsa    theD
			send     4
			pushi    #init
			pushi    0
			lofsa    theL
			send     4
			pushi    #init
			pushi    0
			lofsa    theT
			send     4
			pushi    #init
			pushi    0
			lofsa    theG
			send     4
			pushi    #init
			pushi    0
			lofsa    theC
			send     4
			pushi    #init
			pushi    0
			lofsa    theRing
			send     4
			pushi    #init
			pushi    0
			lofsa    theBox
			send     4
			pushi    #init
			pushi    0
			lofsa    theHand
			send     4
			pushi    #init
			pushi    0
			lofsa    everything
			send     4
			pushi    #setCursor
			pushi    4
			pushi    5
			pushi    1
			pushi    180
			pushi    125
			lag      global1
			send     12
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    0
			call     localproc_021e,  0
			lal      local23
			sag      global34
			pushi    #setCursor
			pushi    4
			lsl      local24
			pushi    1
			pushi    180
			pushi    125
			lag      global1
			send     12
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			push    
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			eq?     
			bnt      code_04a3
			pushi    #message
			pushi    1
			pushi    1
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     6
code_04a3:
			pushi    0
			callb    proc0_4,  0
			pushi    #enable
			pushi    1
			pushi    8
			pushi    167
			pushi    0
			lag      global69
			send     10
			pushi    1
			pushi    126
			callb    proc0_7,  2
			pushi    1
			pushi    127
			callb    proc0_6,  2
			pushi    1
			pushi    853
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance everything of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0515
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0515
			pushi    #dispose
			pushi    0
			lofsa    thePuzzleBox
			send     4
code_0515:
			ret     
		)
	)
)

(instance theHand of Actor
	(properties
		x 180
		y 125
		view 182
		loop 1
		priority 14
		signal $6810
		illegalBits $0000
	)
	
	(method (doit)
		(asm
			pushi    284
			pushi    #-info-
			lsg      global70
			lsg      global71
			ldi      10
			sub     
			push    
			self     8
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
)

(instance theBox of View
	(properties
		x 159
		y 128
		view 520
		loop 15
		priority 1
		signal $4011
	)
	
	(method (handleEvent)
		(asm
			ldi      0
			ret     
		)
	)
)

(instance theR of View
	(properties
		x 124
		y 76
		view 520
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_06b3
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_06b3
			pTos     cel
			ldi      1
			ne?     
			bnt      code_06b3
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    1
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
			lsl      local2
			ldi      7
			eq?     
			bnt      code_06b3
			lal      local3
			bnt      code_06b3
			pushi    #setScript
			pushi    1
			lofsa    showFireRing
			push    
			lag      global1
			send     6
code_06b3:
			ret     
		)
	)
)

(instance theN of View
	(properties
		x 141
		y 76
		view 520
		loop 1
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0754
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0754
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0754
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    2
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0754:
			ret     
		)
	)
)

(instance theA of View
	(properties
		x 158
		y 76
		view 520
		loop 2
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0810
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0810
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0810
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    3
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
			lsl      local2
			ldi      8
			eq?     
			bnt      code_0810
			lal      local3
			bnt      code_0810
			pushi    #setScript
			pushi    1
			lofsa    showFireRing
			push    
			lag      global1
			send     6
code_0810:
			ret     
		)
	)
)

(instance theM of View
	(properties
		x 175
		y 76
		view 520
		loop 3
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_08b3
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_08b3
			pTos     cel
			ldi      1
			ne?     
			bnt      code_08b3
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    4
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_08b3:
			ret     
		)
	)
)

(instance theF of View
	(properties
		x 192
		y 76
		view 520
		loop 4
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0955
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0955
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0955
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    5
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0955:
			ret     
		)
	)
)

(instance theI of View
	(properties
		x 124
		y 91
		view 520
		loop 5
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_09f7
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_09f7
			pTos     cel
			ldi      1
			ne?     
			bnt      code_09f7
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    6
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_09f7:
			ret     
		)
	)
)

(instance theO of View
	(properties
		x 141
		y 91
		view 520
		loop 6
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0aca
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0aca
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0aca
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    7
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
			lal      local3
			bnt      code_0aca
			lsl      local2
			ldi      7
			eq?     
			bt       code_0abb
			lsl      local2
			ldi      9
			eq?     
			bt       code_0abb
			lsl      local2
			ldi      6
			eq?     
			bnt      code_0aca
			lsg      global144
			ldi      6
			ne?     
code_0abb:
			bnt      code_0aca
			pushi    #setScript
			pushi    1
			lofsa    showFireRing
			push    
			lag      global1
			send     6
code_0aca:
			ret     
		)
	)
)

(instance theB of View
	(properties
		x 158
		y 91
		view 520
		loop 7
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0b6d
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0b6d
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0b6d
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    8
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0b6d:
			ret     
		)
	)
)

(instance theE of View
	(properties
		x 175
		y 91
		view 520
		loop 8
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0c0f
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0c0f
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0c0f
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    9
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0c0f:
			ret     
		)
	)
)

(instance theS of View
	(properties
		x 192
		y 91
		view 520
		loop 9
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0cda
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0cda
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0cda
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    10
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
			lal      local3
			bnt      code_0cda
			lsl      local2
			ldi      6
			eq?     
			bt       code_0ccb
			lsl      local2
			ldi      7
			eq?     
			bt       code_0ccb
			lsl      local2
			ldi      9
			eq?     
code_0ccb:
			bnt      code_0cda
			pushi    #setScript
			pushi    1
			lofsa    showFireRing
			push    
			lag      global1
			send     6
code_0cda:
			ret     
		)
	)
)

(instance theD of View
	(properties
		x 124
		y 106
		view 520
		loop 10
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0d7d
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0d7d
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0d7d
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    11
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0d7d:
			ret     
		)
	)
)

(instance theL of View
	(properties
		x 141
		y 106
		view 520
		loop 11
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0e1f
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0e1f
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0e1f
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    12
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0e1f:
			ret     
		)
	)
)

(instance theT of View
	(properties
		x 158
		y 106
		view 520
		loop 12
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0ec1
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0ec1
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0ec1
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    13
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0ec1:
			ret     
		)
	)
)

(instance theG of View
	(properties
		x 175
		y 106
		view 520
		loop 13
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_0f63
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_0f63
			pTos     cel
			ldi      1
			ne?     
			bnt      code_0f63
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    14
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_0f63:
			ret     
		)
	)
)

(instance theC of View
	(properties
		x 192
		y 106
		view 520
		loop 14
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #onMe
			pushi    1
			lsp      pEvent
			self     6
			bnt      code_1005
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #script
			pushi    0
			lag      global1
			send     4
			not     
			bnt      code_1005
			pTos     cel
			ldi      1
			ne?     
			bnt      code_1005
			pushi    3
			lea      @local0
			push    
			pushi    853
			pushi    15
			callk    Format,  6
			pushi    2
			pushSelf
			lsp      pEvent
			call     localproc_0032,  4
code_1005:
			ret     
		)
	)
)

(instance theRing of Actor
	(properties
		x 159
		y 97
		view 771
		cel 11
		priority 1
		signal $6810
	)
)

(instance showFireRing of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10ff
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_11ea
code_10ff:
			dup     
			ldi      1
			eq?     
			bnt      code_1112
			pushi    0
			call     localproc_0012,  0
			ldi      30
			aTop     ticks
			jmp      code_11ea
code_1112:
			dup     
			ldi      2
			eq?     
			bnt      code_1140
			pushi    3
			pushi    1853
			pushi    0
			pushSelf
			calle    proc13_4,  6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #x
			pushi    0
			lofsa    theRing
			send     4
			push    
			pushi    60
			pushSelf
			lofsa    theRing
			send     12
			jmp      code_11ea
code_1140:
			dup     
			ldi      3
			eq?     
			bnt      code_114a
			jmp      code_11ea
code_114a:
			dup     
			ldi      4
			eq?     
			bnt      code_115f
			pushi    3
			pushi    1853
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_11ea
code_115f:
			dup     
			ldi      5
			eq?     
			bnt      code_1194
			pushi    3
			pushi    1853
			pushi    2
			pushSelf
			calle    proc13_4,  6
			pushi    1
			pushi    1
			pushi    5
			callb    proc0_5,  2
			bnt      code_1180
			ldi      10
			jmp      code_1182
code_1180:
			ldi      100
code_1182:
			push    
			calle    proc806_1,  2
			pushi    #hide
			pushi    0
			lofsa    theRing
			send     4
			jmp      code_11ea
code_1194:
			dup     
			ldi      6
			eq?     
			bnt      code_11ba
			pushi    #get
			pushi    1
			pushi    10
			pushi    328
			pushi    1
			pushi    12
			lag      global0
			send     12
			pushi    3
			pushi    1853
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_11ea
code_11ba:
			dup     
			ldi      7
			eq?     
			bnt      code_11d0
			pushi    3
			pushi    1853
			pushi    4
			pushSelf
			calle    proc13_4,  6
			jmp      code_11ea
code_11d0:
			dup     
			ldi      8
			eq?     
			bnt      code_11ea
			pushi    1
			pushi    101
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    thePuzzleBox
			send     4
code_11ea:
			toss    
			ret     
		)
	)
)

(instance endIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_123d
			pushi    0
			callb    proc0_3,  0
			ldi      30
			aTop     ticks
			jmp      code_1272
code_123d:
			dup     
			ldi      1
			eq?     
			bnt      code_1250
			pushi    0
			call     localproc_0012,  0
			ldi      30
			aTop     ticks
			jmp      code_1272
code_1250:
			dup     
			ldi      2
			eq?     
			bnt      code_1266
			pushi    3
			pushi    1853
			pushi    5
			pushSelf
			calle    proc13_4,  6
			jmp      code_1272
code_1266:
			dup     
			ldi      3
			eq?     
			bnt      code_1272
			pushi    #dispose
			pushi    0
			self     4
code_1272:
			toss    
			ret     
		)
	)
)

(instance clickSound of Sound
	(properties
		flags $0001
		number 521
	)
)

(instance cursorPause of Script
	(properties)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Script,  4
			pushi    #doit
			pushi    0
			lofsa    thePuzzleBox
			send     4
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
			bnt      code_130a
			pushi    0
			callb    proc0_3,  0
			ldi      3
			aTop     cycles
			jmp      code_1316
code_130a:
			dup     
			ldi      1
			eq?     
			bnt      code_1316
			pushi    #dispose
			pushi    0
			self     4
code_1316:
			toss    
			ret     
		)
	)
)
