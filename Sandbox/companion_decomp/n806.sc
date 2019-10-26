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
		lag      gRgnMusic
		send     4
		pushi    #stop
		pushi    0
		lag      gSFX
		send     4
		pushi    #stop
		pushi    0
		lag      gSFX2
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
	(if (> argc 1)
		(if (not (proc0_5 param2))
			(specialSound
				number: (if (> param1 0) 916 else 917)
				init:
				play:
			)
			(= global15 (+ global15 param1))
			((ScriptID 0 1) doit:)
			(proc0_6 param2)
		)
	else
		(specialSound
			number: (if (> param1 0) 916 else 917)
			init:
			play:
		)
		(= global15 (+ global15 param1))
		((ScriptID 0 1) doit:)
	)
	(if global143 (return))
)

(procedure (proc806_2)
	(global10 add: &rest eachElementDo: #init doit:)
	(DisposeScript 806)
)

(procedure (proc806_3)
	(gNewFeatures add: &rest eachElementDo: #init)
	(DisposeScript 806)
)

(procedure (proc806_4 param1)
	(= global139 (+ global139 param1))
	((ScriptID 0 1) doit:)
	(DisposeScript 806)
)

(procedure (proc806_5 param1)
	(= global138 (+ global138 param1))
	((ScriptID 0 1) doit:)
	(DisposeScript 806)
)

(procedure (proc806_6 param1 &tmp temp0)
	(if (>= argc 2)
		(= temp0 (Inv at: param1))
		(gIconBar select: (gIconBar at: 6) curInvIcon: temp0)
	else
		(= temp0 (gIconBar at: param1))
		(gIconBar select: temp0)
	)
	(global1 setCursor: (temp0 cursor?) 1)
	(DisposeScript 806)
)

(instance specialSound of Sound
	(properties
		flags $0001
	)
	
	(method (check)
		(super check: &rest)
		(if (== prevSignal -1)
			(specialSound dispose:)
			(if (not (verseScript client?)) (DisposeScript 806))
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
		((= cycler (End new:)) init: self)
	)
)

(instance verseScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: 0)
				(gIconBar disable:)
				(= cycles 2)
			)
			(1
				(self setScript: (ScriptID 855) self)
			)
			(2 (= cycles 2))
			(3
				(global9 showSelf:)
				(= cycles 2)
			)
			(4
				(gIconBar enable:)
				(self dispose:)
				(DisposeScript 806)
			)
		)
	)
)
