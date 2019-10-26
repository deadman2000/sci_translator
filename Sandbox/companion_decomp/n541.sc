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
			bnt      code_0087
			lst      temp0
			lat      temp1
			ge?     
			bt       code_0094
code_0087:
			lap      param2
			bnt      code_003e
			lst      temp0
			lat      temp1
			le?     
			bnt      code_003e
code_0094:
			lap      param2
			not     
			bnt      code_00a2
			lst      temp0
			lap      param5
			gt?     
			bt       code_00af
code_00a2:
			lap      param2
			bnt      code_00c8
			lst      temp0
			lap      param5
			lt?     
			bnt      code_00c8
code_00af:
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
		(if (< moves 16)
			(= temp0 (+ us usMills usThreat))
			(= temp1 (+ them themMills themThreat))
			(return (- (* 31 temp0) (* 32 temp1)))
		else
			(= temp0 (+ (* 31 us) usMills))
			(= temp1 (+ (* 32 them) themMills))
		)
		(return (- temp0 temp1))
	)
	
	(method (tally param1 param2 &tmp temp0 temp1 temp2)
		(= temp1 (& param1 $fffc))
		(= temp2 0)
		(= temp0 3)
		(while temp0
			(= temp2 (+ temp2 [local0 temp1]))
			(-- temp0)
			(++ temp1)
		)
		(switch temp2
			(2 (-- usThreat))
			(32 (-- themThreat))
			(3 (-- usMills))
			(48 (-- themMills))
		)
		(switch (+ temp2 param2)
			(32 (++ themThreat))
			(48 (++ themMills))
			(2 (++ usThreat))
			(3 (++ usMills))
		)
		(if (<= argc 2) (self tally: [local68 param1] param2 1))
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
			bt       code_04fa
			pushi    #inMill
			pushi    2
			lsp      param1
			lsp      param3
			self     8
			not     
			bnt      code_04c0
code_04fa:
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
	
	(method (tryAMove theDoFrom theDoTo theDoTake param4 param5 param6)
		(= doFrom theDoFrom)
		(= doTo theDoTo)
		(= doTake theDoTake)
		(if (!= doTake -20)
			(return
				(if
					(!=
						(= doTake (self tryATake: doTake param6 param5))
						-20
					)
					1
				else
					(self tryAMove: doFrom doTo doTake param4 param5 param6)
				)
			)
		)
		(return
			(if (<= moves 18)
				(if
				(!= (= doTo (self tryAPlace: doTo param4)) -20)
					(if (self inMill: doTo)
						(= doTake (self tryATake: -20 param6 param5))
					)
					(return 1)
				else
					(return 0)
				)
			else
				(if (!= doTo -20)
					(if
					(!= (= doTo (self tryATo: doFrom doTo param4)) -20)
						(if (self inMill: doTo)
							(= doTake (self tryATake: -20 param6 param5))
						)
						(return 1)
					else
						(return (self tryAMove: doFrom doTo doTake param4 param5 param6))
					)
				)
				(if
				(!= (= doFrom (self tryAFrom: doFrom param4)) -20)
					(if
					(!= (= doTo (self tryATo: doFrom doTo param4)) -20)
						(if (self inMill: doTo)
							(= doTake (self tryATake: -20 param6 param5))
						)
						(return 1)
					else
						(return (self tryAMove: doFrom doTo doTake param4 param5 param6))
					)
				else
					(return 0)
				)
			)
		)
	)
	
	(method (findLoners param1 &tmp temp0)
		(= temp0 0)
		(while (< temp0 32)
			(if
				(and
					(== [local0 temp0] param1)
					(not (self inMill: temp0))
				)
				(return 0)
			)
			(++ temp0)
		)
		(return 1)
	)
	
	(method (inMill param1 &tmp temp0 temp1 temp2 temp3)
		(= temp0 (* [local0 param1] 3))
		(= temp2 (& param1 $fffc))
		(= temp3 0)
		(= temp1 3)
		(while temp1
			(= temp3 (+ temp3 [local0 temp2]))
			(-- temp1)
			(++ temp2)
		)
		(if (== temp3 temp0) (return 1))
		(= temp2 (& [local68 param1] $fffc))
		(= temp3 0)
		(= temp1 3)
		(while temp1
			(= temp3 (+ temp3 [local0 temp2]))
			(-- temp1)
			(++ temp2)
		)
		(if (== temp3 temp0) (return 1))
		(return 0)
	)
	
	(method (doMove param1 param2)
		(if (!= doFrom -20)
			(self tally: doFrom (- param1))
			(= [local0 doFrom] 0)
			(= [local0 [local68 doFrom]] 0)
		)
		(self tally: doTo param1)
		(= [local0 doTo] param1)
		(= [local0 [local68 doTo]] param1)
		(if (!= doTake -20)
			(self tally: doTake (- param2))
			(if (== param1 1) (-- them) else (-- us))
			(= [local0 doTake] 0)
			(= [local0 [local68 doTake]] 0)
		)
		(++ moves)
	)
	
	(method (unDoMove param1 param2)
		(if (!= doTake -20)
			(self tally: doTake param2)
			(if (== param1 1) (++ them) else (++ us))
			(= [local0 doTake] param2)
			(= [local0 [local68 doTake]] param2)
		)
		(self tally: doTo (- param1))
		(= [local0 doTo] 0)
		(= [local0 [local68 doTo]] 0)
		(if (!= doFrom -20)
			(self tally: doFrom param1)
			(= [local0 doFrom] param1)
			(= [local0 [local68 doFrom]] param1)
		)
		(-- moves)
	)
	
	(method (isValid param1 param2 param3 &tmp temp0)
		(if (and (!= param1 -20) (!= [local0 param1] 16))
			(return 0)
		)
		(if (and (!= param2 -20) (!= [local0 param2] 0))
			(return 0)
		)
		(if
			(and
				(!= param1 -20)
				(!= (Abs (- param1 param2)) 1)
				(!= (Abs (- [local68 param1] [local68 param2])) 1)
			)
			(return 0)
		)
		(if (== param3 -20) (return 1))
		(if (!= [local0 param3] 1) (return 0))
		(if
			(and
				(self inMill: param3 16)
				(not (self findLoners: 1))
			)
			(return 0)
		)
		(return 1)
	)
	
	(method (lowerize param1)
		(return
			(if (> param1 32)
				(return [local68 param1])
			else
				(return param1)
			)
		)
	)
)
