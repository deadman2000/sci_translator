;;; Sierra Script 1.0 - (do not remove this comment)
(script# 806)
(include sci.sh)
(use n000)
(use n255)
(use n967)
(use n989)
(use n992)
(use n995)
(use n999)

(public
	proc806_0 0
	proc806_1 1
	proc806_2 2
	proc806_3 3
	proc806_4 4
	proc806_5 5
	proc806_6 6
	verseScript 7
)

(procedure (proc806_0 param1 &tmp [temp0 80])
	(asm
		pushi    #setCursor
		pushi    2
		pushi    999
		pushi    1
		lag      global1
		send     8
		pushi    #stop
		pushi    0
		lag      global100
		send     4
		pushi    #stop
		pushi    0
		lag      global113
		send     4
		pushi    #stop
		pushi    0
		lag      global114
		send     4
		pushi    #number
		pushi    1
		pushi    172
		pushi    107
		pushi    0
		pushi    42
		pushi    0
		lofsa    specialSound
		send     14
		lap      argc
		bnt      code_0073
		pushi    1
		lea      @temp0
		push    
		&rest    param1
		callk    Format,  2
		jmp      code_0080
code_0073:
		pushi    3
		lea      @temp0
		push    
		pushi    806
		pushi    0
		callk    Format,  6
code_0080:
		pushi    16
		lea      @temp0
		push    
		pushi    30
		pushi    1
		pushi    81
		lofsa    {__RESTORE__}
		push    
		pushi    1
		pushi    81
		lofsa    {__RESTART__}
		push    
		pushi    2
		pushi    81
		lofsa    {____QUIT____}
		push    
		pushi    3
		pushi    82
		lofsa    deadIcon
		push    
		pushi    1
		pushi    0
		calle    proc255_0,  32
		push    
		dup     
		ldi      1
		eq?     
		bnt      code_00bd
		pushi    #restore
		pushi    0
		lag      global1
		send     4
		jmp      code_00dc
code_00bd:
		dup     
		ldi      2
		eq?     
		bnt      code_00ce
		pushi    #restart
		pushi    0
		lag      global1
		send     4
		jmp      code_00dc
code_00ce:
		dup     
		ldi      3
		eq?     
		bnt      code_00dc
		ldi      1
		sag      global4
		jmp      code_00e0
code_00dc:
		toss    
		jmp      code_0080
code_00e0:
		ret     
	)
)

(procedure (proc806_1 param1 param2)
	(asm
		lsp      argc
		ldi      1
		gt?     
		bnt      code_012e
		pushi    1
		lsp      param2
		callb    proc0_5,  2
		not     
		bnt      code_0160
		pushi    43
		pushi    1
		lsp      param1
		ldi      0
		gt?     
		bnt      code_0104
		ldi      916
		jmp      code_0107
code_0104:
		ldi      917
code_0107:
		push    
		pushi    107
		pushi    0
		pushi    42
		pushi    0
		lofsa    specialSound
		send     14
		lsg      global15
		lap      param1
		add     
		sag      global15
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		pushi    1
		lsp      param2
		callb    proc0_6,  2
		jmp      code_0160
code_012e:
		pushi    43
		pushi    1
		lsp      param1
		ldi      0
		gt?     
		bnt      code_013f
		ldi      916
		jmp      code_0142
code_013f:
		ldi      917
code_0142:
		push    
		pushi    107
		pushi    0
		pushi    42
		pushi    0
		lofsa    specialSound
		send     14
		lsg      global15
		lap      param1
		add     
		sag      global15
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
code_0160:
		lag      global143
		bnt      code_0166
		ret     
code_0166:
		ret     
	)
)

(procedure (proc806_2 param1)
	(asm
		pushi    #add
		pushi    0
		&rest    param1
		pushi    116
		pushi    1
		pushi    107
		pushi    60
		pushi    0
		lag      global10
		send     14
		pushi    1
		pushi    806
		callk    DisposeScript,  2
		ret     
	)
)

(procedure (proc806_3 param1)
	(asm
		pushi    #add
		pushi    0
		&rest    param1
		pushi    116
		pushi    1
		pushi    107
		lag      global32
		send     10
		pushi    1
		pushi    806
		callk    DisposeScript,  2
		ret     
	)
)

(procedure (proc806_4 param1)
	(asm
		lsg      global139
		lap      param1
		add     
		sag      global139
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		pushi    1
		pushi    806
		callk    DisposeScript,  2
		ret     
	)
)

(procedure (proc806_5 param1)
	(asm
		lsg      global138
		lap      param1
		add     
		sag      global138
		pushi    #doit
		pushi    0
		pushi    2
		pushi    0
		pushi    1
		callk    ScriptID,  4
		send     4
		pushi    1
		pushi    806
		callk    DisposeScript,  2
		ret     
	)
)

(procedure (proc806_6 param1 &tmp temp0)
	(asm
		lsp      argc
		ldi      2
		ge?     
		bnt      code_01fa
		pushi    #at
		pushi    1
		lsp      param1
		class    Inv
		send     6
		sat      temp0
		pushi    #select
		pushi    1
		pushi    #at
		pushi    1
		pushi    6
		lag      global69
		send     6
		push    
		pushi    209
		pushi    1
		lst      temp0
		lag      global69
		send     12
		jmp      code_020e
code_01fa:
		pushi    #at
		pushi    1
		lsp      param1
		lag      global69
		send     6
		sat      temp0
		pushi    #select
		pushi    1
		push    
		lag      global69
		send     6
code_020e:
		pushi    #setCursor
		pushi    2
		pushi    #cursor
		pushi    0
		lat      temp0
		send     4
		push    
		pushi    1
		lag      global1
		send     8
		pushi    1
		pushi    806
		callk    DisposeScript,  2
		ret     
	)
)

(instance specialSound of Sound
	(properties
		flags $0001
	)
	
	(method (check param1)
		(asm
			pushi    #check
			pushi    0
			&rest    param1
			super    Sound,  4
			pTos     prevSignal
			ldi      65535
			eq?     
			bnt      code_0253
			pushi    #dispose
			pushi    0
			lofsa    specialSound
			send     4
			pushi    #client
			pushi    0
			lofsa    verseScript
			send     4
			not     
			bnt      code_0253
			pushi    1
			pushi    806
			callk    DisposeScript,  2
code_0253:
			ret     
		)
	)
)

(instance deadIcon of DCIcon
	(properties
		view 903
		loop 1
		cycleSpeed 24
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    1
			pushSelf
			pushi    #new
			pushi    0
			class    End
			send     4
			aTop     cycler
			send     6
			ret     
		)
	)
)

(instance verseScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0304
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			ldi      2
			aTop     cycles
			jmp      code_035b
code_0304:
			dup     
			ldi      1
			eq?     
			bnt      code_031d
			pushi    #setScript
			pushi    2
			pushi    1
			pushi    855
			callk    ScriptID,  2
			push    
			pushSelf
			self     8
			jmp      code_035b
code_031d:
			dup     
			ldi      2
			eq?     
			bnt      code_032b
			ldi      2
			aTop     cycles
			jmp      code_035b
code_032b:
			dup     
			ldi      3
			eq?     
			bnt      code_0340
			pushi    #showSelf
			pushi    0
			lag      global9
			send     4
			ldi      2
			aTop     cycles
			jmp      code_035b
code_0340:
			dup     
			ldi      4
			eq?     
			bnt      code_035b
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    806
			callk    DisposeScript,  2
code_035b:
			toss    
			ret     
		)
	)
)
