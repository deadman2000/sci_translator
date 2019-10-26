;;; Sierra Script 1.0 - (do not remove this comment)
(script# 541)
(include sci.sh)
(use n999)


(local
	[local0 68]
	[local68 68] = [36 48 64 0 40 49 60 0 44 50 56 0 37 41 45 0 57 61 65 0 46 52 58 0 42 53 62 0 38 54 66 0 0 0 0 0 0 12 28 0 4 13 24 0 8 14 20 0 1 5 9 0 21 25 29 0 10 16 22 0 6 17 26 0 2 18 30]
)
(class Morris of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
		moves 0
		scan 2
		doFrom -20
		doTo -20
		doTake -20
		us 9
		usThreat 0
		usMills 0
		them 9
		themThreat 0
		themMills 0
	)
	
	(method (minimax param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8)
		(asm
			lap      param1
			bnt      code_00ec
			ldi      32768
			sat      temp1
			lap      param2
			bnt      code_0024
			lat      temp1
			bnot    
			sat      temp1
code_0024:
			ldi      65516
			sat      temp7
			sat      temp6
			sat      temp5
			sat      temp4
			sat      temp3
			sat      temp2
			pushi    #findLoners
			pushi    1
			lsp      param4
			self     6
			sat      temp8
			ipToa    moves
code_003e:
			pushi    #tryAMove
			pushi    6
			lst      temp5
			lst      temp6
			lst      temp7
			lsp      param3
			lsp      param4
			lst      temp8
			self     16
			bnt      code_00db
			pToa     doFrom
			sat      temp5
			pToa     doTo
			sat      temp6
			pToa     doTake
			sat      temp7
			pushi    538
			pushi    #view
			lsp      param1
			ldi      1
			sub     
			push    
			lap      param2
			bnot    
			push    
			lsp      param4
			lsp      param3
			lst      temp1
			self     14
			sat      temp0
			lap      param2
			not     
			bnt      code_0084
			lst      temp0
			lat      temp1
			ge?     
code_0084:
			bt       code_0091
			lap      param2
			bnt      code_003e
			lst      temp0
			lat      temp1
			le?     
code_0091:
			bnt      code_003e
			lap      param2
			not     
			bnt      code_009f
			lst      temp0
			lap      param5
			gt?     
code_009f:
			bt       code_00ac
			lap      param2
			bnt      code_00c8
			lst      temp0
			lap      param5
			lt?     
code_00ac:
			bnt      code_00c8
			lat      temp5
			aTop     doFrom
			lat      temp6
			aTop     doTo
			lat      temp7
			aTop     doTake
			pushi    #unDoMove
			pushi    2
			lsp      param3
			lsp      param4
			self     8
			lat      temp0
			ret     
code_00c8:
			lat      temp0
			sat      temp1
			lat      temp5
			sat      temp2
			lat      temp6
			sat      temp3
			lat      temp7
			sat      temp4
			jmp      code_003e
code_00db:
			lat      temp2
			aTop     doFrom
			lat      temp3
			aTop     doTo
			lat      temp4
			aTop     doTake
			dpToa    moves
			jmp      code_00f4
code_00ec:
			pushi    #eval
			pushi    0
			self     4
			sat      temp1
code_00f4:
			lat      temp1
			ret     
		)
	)
	
	(method (eval &tmp temp0 temp1)
		(asm
			pTos     moves
			ldi      16
			lt?     
			bnt      code_0558
			pTos     us
			pToa     usMills
			add     
			push    
			pToa     usThreat
			add     
			sat      temp0
			pTos     them
			pToa     themMills
			add     
			push    
			pToa     themThreat
			add     
			sat      temp1
			pushi    31
			lat      temp0
			mul     
			push    
			pushi    32
			lat      temp1
			mul     
			sub     
			ret     
			jmp      code_056e
code_0558:
			pushi    31
			pToa     us
			mul     
			push    
			pToa     usMills
			add     
			sat      temp0
			pushi    32
			pToa     them
			mul     
			push    
			pToa     themMills
			add     
			sat      temp1
code_056e:
			lst      temp0
			lat      temp1
			sub     
			ret     
		)
	)
	
	(method (tally param1 param2 &tmp temp0 temp1 temp2)
		(asm
			lsp      param1
			ldi      65532
			and     
			sat      temp1
			ldi      0
			sat      temp2
			ldi      3
			sat      temp0
code_0585:
			lat      temp0
			bnt      code_059a
			lst      temp2
			lat      temp1
			lali     local0
			add     
			sat      temp2
			-at      temp0
			+at      temp1
			jmp      code_0585
code_059a:
			lst      temp2
			dup     
			ldi      2
			eq?     
			bnt      code_05a8
			dpToa    usThreat
			jmp      code_05c9
code_05a8:
			dup     
			ldi      32
			eq?     
			bnt      code_05b4
			dpToa    themThreat
			jmp      code_05c9
code_05b4:
			dup     
			ldi      3
			eq?     
			bnt      code_05c0
			dpToa    usMills
			jmp      code_05c9
code_05c0:
			dup     
			ldi      48
			eq?     
			bnt      code_05c9
			dpToa    themMills
code_05c9:
			toss    
			lst      temp2
			lap      param2
			add     
			push    
			dup     
			ldi      32
			eq?     
			bnt      code_05dc
			ipToa    themThreat
			jmp      code_05fd
code_05dc:
			dup     
			ldi      48
			eq?     
			bnt      code_05e8
			ipToa    themMills
			jmp      code_05fd
code_05e8:
			dup     
			ldi      2
			eq?     
			bnt      code_05f4
			ipToa    usThreat
			jmp      code_05fd
code_05f4:
			dup     
			ldi      3
			eq?     
			bnt      code_05fd
			ipToa    usMills
code_05fd:
			toss    
			lsp      argc
			ldi      2
			le?     
			bnt      code_0614
			pushi    #tally
			pushi    3
			lap      param1
			lsli     local68
			lsp      param2
			pushi    1
			self     10
code_0614:
			ret     
		)
	)
	
	(method (tryAPlace param1 param2)
		(asm
			lsp      param1
			ldi      65516
			ne?     
			bnt      code_0328
			pushi    #tally
			pushi    2
			lsp      param1
			lap      param2
			neg     
			push    
			self     8
			pushi    0
			lap      param1
			sali     local0
			pushi    0
			lap      param1
			lali     local68
			sali     local0
			jmp      code_032c
code_0328:
			ldi      65535
			sap      param1
code_032c:
			ldi      1
			bnt      code_0371
			+ap      param1
			push    
			ldi      32
			ge?     
			bnt      code_033d
			ldi      65516
			ret     
code_033d:
			lsp      param1
			ldi      3
			and     
			push    
			ldi      3
			ne?     
			bnt      code_032c
			lap      param1
			lsli     local0
			ldi      0
			eq?     
			bnt      code_032c
			pushi    #tally
			pushi    2
			lsp      param1
			lsp      param2
			self     8
			lsp      param2
			lap      param1
			sali     local0
			lsp      param2
			lap      param1
			lali     local68
			sali     local0
			lap      param1
			ret     
			jmp      code_032c
code_0371:
			ret     
		)
	)
	
	(method (tryAFrom param1 param2)
		(asm
			lsp      param1
			ldi      65516
			ne?     
			bnt      code_0395
			pushi    #tally
			pushi    2
			lsp      param1
			lsp      param2
			self     8
			lsp      param2
			lap      param1
			sali     local0
			lsp      param2
			lap      param1
			lali     local68
			sali     local0
			jmp      code_0399
code_0395:
			ldi      65535
			sap      param1
code_0399:
			ldi      1
			bnt      code_03de
			+ap      param1
			push    
			ldi      32
			ge?     
			bnt      code_03aa
			ldi      65516
			ret     
code_03aa:
			lsp      param1
			ldi      3
			and     
			push    
			ldi      3
			ne?     
			bnt      code_0399
			lap      param1
			lsli     local0
			lap      param2
			eq?     
			bnt      code_0399
			pushi    #tally
			pushi    2
			lsp      param1
			lap      param2
			neg     
			push    
			self     8
			pushi    0
			lap      param1
			sali     local0
			pushi    0
			lap      param1
			lali     local68
			sali     local0
			lap      param1
			ret     
			jmp      code_0399
code_03de:
			ret     
		)
	)
	
	(method (tryATo param1 param2 param3)
		(asm
			lsp      param2
			ldi      65516
			ne?     
			bnt      code_03ff
			pushi    #tally
			pushi    2
			lsp      param2
			lap      param3
			neg     
			push    
			self     8
			pushi    0
			lap      param2
			sali     local0
			pushi    0
			lap      param2
			lali     local68
			sali     local0
code_03ff:
			ldi      1
			bnt      code_0489
			lsp      param2
			ldi      65516
			eq?     
			bnt      code_0416
			lsp      param1
			ldi      1
			sub     
			sap      param2
			jmp      code_0455
code_0416:
			lsp      param2
			lap      param1
			lt?     
			bnt      code_0428
			lsp      param1
			ldi      1
			add     
			sap      param2
			jmp      code_0455
code_0428:
			lsp      param2
			ldi      32
			lt?     
			bnt      code_043c
			lap      param1
			lsli     local68
			ldi      1
			sub     
			sap      param2
			jmp      code_0455
code_043c:
			lsp      param2
			lap      param1
			lali     local68
			lt?     
			bnt      code_0452
			lap      param1
			lsli     local68
			ldi      1
			add     
			sap      param2
			jmp      code_0455
code_0452:
			ldi      65516
			ret     
code_0455:
			lsp      param2
			ldi      3
			and     
			push    
			ldi      3
			ne?     
			bnt      code_03ff
			lap      param2
			lsli     local0
			ldi      0
			eq?     
			bnt      code_03ff
			pushi    #tally
			pushi    2
			lsp      param2
			lsp      param3
			self     8
			lsp      param3
			lap      param2
			sali     local0
			lsp      param3
			lap      param2
			lali     local68
			sali     local0
			lap      param2
			ret     
			jmp      code_03ff
code_0489:
			ret     
		)
	)
	
	(method (tryATake param1 param2 param3)
		(asm
			lsp      param1
			ldi      65516
			ne?     
			bnt      code_04bc
			pushi    #tally
			pushi    2
			lsp      param1
			lsp      param3
			self     8
			lsp      param3
			ldi      16
			eq?     
			bnt      code_04a9
			ipToa    them
			jmp      code_04ab
code_04a9:
			ipToa    us
code_04ab:
			lsp      param3
			lap      param1
			sali     local0
			lsp      param3
			lap      param1
			lali     local68
			sali     local0
			jmp      code_04c0
code_04bc:
			ldi      65535
			sap      param1
code_04c0:
			ldi      1
			bnt      code_0527
			+ap      param1
			push    
			ldi      32
			ge?     
			bnt      code_04d1
			ldi      65516
			ret     
code_04d1:
			lsp      param1
			ldi      3
			and     
			push    
			ldi      3
			ne?     
			bnt      code_04c0
			lap      param1
			lsli     local0
			lap      param3
			eq?     
			bnt      code_04c0
			lap      param2
			bt       code_04f7
			pushi    #inMill
			pushi    2
			lsp      param1
			lsp      param3
			self     8
			not     
code_04f7:
			bnt      code_04c0
			pushi    #tally
			pushi    2
			lsp      param1
			lap      param3
			neg     
			push    
			self     8
			pushi    0
			lap      param1
			sali     local0
			pushi    0
			lap      param1
			lali     local68
			sali     local0
			lsp      param3
			ldi      16
			eq?     
			bnt      code_051f
			dpToa    them
			jmp      code_0521
code_051f:
			dpToa    us
code_0521:
			lap      param1
			ret     
			jmp      code_04c0
code_0527:
			ret     
		)
	)
	
	(method (tryAMove param1 param2 param3 param4 param5 param6)
		(asm
			lap      param1
			aTop     doFrom
			lap      param2
			aTop     doTo
			lap      param3
			aTop     doTake
			pTos     doTake
			ldi      65516
			ne?     
			bnt      code_013a
			pushi    #tryATake
			pushi    3
			pTos     doTake
			lsp      param6
			lsp      param5
			self     10
			aTop     doTake
			push    
			ldi      65516
			ne?     
			bnt      code_0126
			ldi      1
			jmp      code_0139
code_0126:
			pushi    #tryAMove
			pushi    6
			pTos     doFrom
			pTos     doTo
			pTos     doTake
			lsp      param4
			lsp      param5
			lsp      param6
			self     16
code_0139:
			ret     
code_013a:
			pTos     moves
			ldi      18
			le?     
			bnt      code_017b
			pushi    #tryAPlace
			pushi    2
			pTos     doTo
			lsp      param4
			self     8
			aTop     doTo
			push    
			ldi      65516
			ne?     
			bnt      code_0175
			pushi    #inMill
			pushi    1
			pTos     doTo
			self     6
			bnt      code_016f
			pushi    #tryATake
			pushi    3
			pushi    65516
			lsp      param6
			lsp      param5
			self     10
			aTop     doTake
code_016f:
			ldi      1
			ret     
			jmp      code_0230
code_0175:
			ldi      0
			ret     
			jmp      code_0230
code_017b:
			pTos     doTo
			ldi      65516
			ne?     
			bnt      code_01cd
			pushi    #tryATo
			pushi    3
			pTos     doFrom
			pTos     doTo
			lsp      param4
			self     10
			aTop     doTo
			push    
			ldi      65516
			ne?     
			bnt      code_01b9
			pushi    #inMill
			pushi    1
			pTos     doTo
			self     6
			bnt      code_01b3
			pushi    #tryATake
			pushi    3
			pushi    65516
			lsp      param6
			lsp      param5
			self     10
			aTop     doTake
code_01b3:
			ldi      1
			ret     
			jmp      code_01cd
code_01b9:
			pushi    #tryAMove
			pushi    6
			pTos     doFrom
			pTos     doTo
			pTos     doTake
			lsp      param4
			lsp      param5
			lsp      param6
			self     16
			ret     
code_01cd:
			pushi    #tryAFrom
			pushi    2
			pTos     doFrom
			lsp      param4
			self     8
			aTop     doFrom
			push    
			ldi      65516
			ne?     
			bnt      code_022d
			pushi    #tryATo
			pushi    3
			pTos     doFrom
			pTos     doTo
			lsp      param4
			self     10
			aTop     doTo
			push    
			ldi      65516
			ne?     
			bnt      code_0216
			pushi    #inMill
			pushi    1
			pTos     doTo
			self     6
			bnt      code_0210
			pushi    #tryATake
			pushi    3
			pushi    65516
			lsp      param6
			lsp      param5
			self     10
			aTop     doTake
code_0210:
			ldi      1
			ret     
			jmp      code_0230
code_0216:
			pushi    #tryAMove
			pushi    6
			pTos     doFrom
			pTos     doTo
			pTos     doTake
			lsp      param4
			lsp      param5
			lsp      param6
			self     16
			ret     
			jmp      code_0230
code_022d:
			ldi      0
			ret     
code_0230:
			ret     
		)
	)
	
	(method (findLoners param1 &tmp temp0)
		(asm
			ldi      0
			sat      temp0
code_071c:
			lst      temp0
			ldi      32
			lt?     
			bnt      code_0742
			lat      temp0
			lsli     local0
			lap      param1
			eq?     
			bnt      code_073d
			pushi    #inMill
			pushi    1
			lst      temp0
			self     6
			not     
			bnt      code_073d
			ldi      0
			ret     
code_073d:
			+at      temp0
			jmp      code_071c
code_0742:
			ldi      1
			ret     
		)
	)
	
	(method (inMill param1 &tmp temp0 temp1 temp2 temp3)
		(asm
			lap      param1
			lsli     local0
			ldi      3
			mul     
			sat      temp0
			lsp      param1
			ldi      65532
			and     
			sat      temp2
			ldi      0
			sat      temp3
			ldi      3
			sat      temp1
code_06c2:
			lat      temp1
			bnt      code_06d7
			lst      temp3
			lat      temp2
			lali     local0
			add     
			sat      temp3
			-at      temp1
			+at      temp2
			jmp      code_06c2
code_06d7:
			lst      temp3
			lat      temp0
			eq?     
			bnt      code_06e2
			ldi      1
			ret     
code_06e2:
			lap      param1
			lsli     local68
			ldi      65532
			and     
			sat      temp2
			ldi      0
			sat      temp3
			ldi      3
			sat      temp1
code_06f3:
			lat      temp1
			bnt      code_0708
			lst      temp3
			lat      temp2
			lali     local0
			add     
			sat      temp3
			-at      temp1
			+at      temp2
			jmp      code_06f3
code_0708:
			lst      temp3
			lat      temp0
			eq?     
			bnt      code_0713
			ldi      1
			ret     
code_0713:
			ldi      0
			ret     
		)
	)
	
	(method (doMove param1 param2)
		(asm
			pTos     doFrom
			ldi      65516
			ne?     
			bnt      code_0251
			pushi    #tally
			pushi    2
			pTos     doFrom
			lap      param1
			neg     
			push    
			self     8
			pushi    0
			pToa     doFrom
			sali     local0
			pushi    0
			pToa     doFrom
			lali     local68
			sali     local0
code_0251:
			pushi    #tally
			pushi    2
			pTos     doTo
			lsp      param1
			self     8
			lsp      param1
			pToa     doTo
			sali     local0
			lsp      param1
			pToa     doTo
			lali     local68
			sali     local0
			pTos     doTake
			ldi      65516
			ne?     
			bnt      code_0298
			pushi    #tally
			pushi    2
			pTos     doTake
			lap      param2
			neg     
			push    
			self     8
			lsp      param1
			ldi      1
			eq?     
			bnt      code_028a
			dpToa    them
			jmp      code_028c
code_028a:
			dpToa    us
code_028c:
			pushi    0
			pToa     doTake
			sali     local0
			pushi    0
			pToa     doTake
			lali     local68
			sali     local0
code_0298:
			ipToa    moves
			ret     
		)
	)
	
	(method (unDoMove param1 param2)
		(asm
			pTos     doTake
			ldi      65516
			ne?     
			bnt      code_02ca
			pushi    #tally
			pushi    2
			pTos     doTake
			lsp      param2
			self     8
			lsp      param1
			ldi      1
			eq?     
			bnt      code_02ba
			ipToa    them
			jmp      code_02bc
code_02ba:
			ipToa    us
code_02bc:
			lsp      param2
			pToa     doTake
			sali     local0
			lsp      param2
			pToa     doTake
			lali     local68
			sali     local0
code_02ca:
			pushi    #tally
			pushi    2
			pTos     doTo
			lap      param1
			neg     
			push    
			self     8
			pushi    0
			pToa     doTo
			sali     local0
			pushi    0
			pToa     doTo
			lali     local68
			sali     local0
			pTos     doFrom
			ldi      65516
			ne?     
			bnt      code_0302
			pushi    #tally
			pushi    2
			pTos     doFrom
			lsp      param1
			self     8
			lsp      param1
			pToa     doFrom
			sali     local0
			lsp      param1
			pToa     doFrom
			lali     local68
			sali     local0
code_0302:
			dpToa    moves
			ret     
		)
	)
	
	(method (isValid param1 param2 param3 &tmp temp0)
		(asm
			lsp      param1
			ldi      65516
			ne?     
			bnt      code_062c
			lap      param1
			lsli     local0
			ldi      16
			ne?     
			bnt      code_062c
			ldi      0
			ret     
code_062c:
			lsp      param2
			ldi      65516
			ne?     
			bnt      code_0641
			lap      param2
			lsli     local0
			ldi      0
			ne?     
			bnt      code_0641
			ldi      0
			ret     
code_0641:
			lsp      param1
			ldi      65516
			ne?     
			bnt      code_0672
			pushi    1
			lsp      param1
			lap      param2
			sub     
			push    
			callk    Abs,  2
			push    
			ldi      1
			ne?     
			bnt      code_0672
			pushi    1
			lap      param1
			lsli     local68
			lap      param2
			lali     local68
			sub     
			push    
			callk    Abs,  2
			push    
			ldi      1
			ne?     
			bnt      code_0672
			ldi      0
			ret     
code_0672:
			lsp      param3
			ldi      65516
			eq?     
			bnt      code_067d
			ldi      1
			ret     
code_067d:
			lap      param3
			lsli     local0
			ldi      1
			ne?     
			bnt      code_068a
			ldi      0
			ret     
code_068a:
			pushi    #inMill
			pushi    2
			lsp      param3
			pushi    16
			self     8
			bnt      code_06a5
			pushi    #findLoners
			pushi    1
			pushi    1
			self     6
			not     
			bnt      code_06a5
			ldi      0
			ret     
code_06a5:
			ldi      1
			ret     
		)
	)
	
	(method (lowerize param1)
		(asm
			lsp      param1
			ldi      32
			gt?     
			bnt      code_0755
			lap      param1
			lali     local68
			ret     
			jmp      code_0758
code_0755:
			lap      param1
			ret     
code_0758:
			ret     
		)
	)
)
