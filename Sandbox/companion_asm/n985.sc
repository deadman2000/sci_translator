;;; Sierra Script 1.0 - (do not remove this comment)
(script# 985)
(include sci.sh)
(use n982)
(use n999)


(class Avoid of Obj
	(properties
		client 0
		heading -1000
		bumpTurn 0
		lastBumped 0
		thisTurn 1
		escaping 0
		escapes 0
		escapeTurn 1
		nearestDist 32000
		counter 0
		nonBumps 10
		targetX 0
		targetY 0
		motionInited 0
		outOfTouch 0
		offScreenOK 0
	)
	
	(method (init param1 param2)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0010
			lap      param1
			aTop     client
code_0010:
			lsp      argc
			ldi      2
			ge?     
			bnt      code_001c
			lap      param2
			aTop     offScreenOK
code_001c:
			pushi    #heading
			pushi    0
			pToa     client
			send     4
			aTop     heading
			ldi      0
			aTop     counter
			ldi      10
			aTop     nonBumps
			ldi      0
			aTop     escaping
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10 temp11 temp12 temp13 temp14 temp15)
		(asm
			pushi    2
			pushi    4
			pushi    1
			pTos     client
			callk    NumLoops,  2
			push    
			ldi      4
			div     
			push    
			ldi      4
			mul     
			push    
			calle    proc999_3,  4
			sat      temp15
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp6
			bnt      code_013c
			pushi    #setTarget
			pushi    0
			send     4
code_013c:
			lat      temp6
			not     
			bnt      code_014b
			ldi      64536
			aTop     heading
			ret     
			jmp      code_01b0
code_014b:
			pushi    #canBeHere
			pushi    2
			pushi    #x
			pushi    0
			lat      temp6
			send     4
			sat      temp4
			push    
			pushi    #y
			pushi    0
			lat      temp6
			send     4
			sat      temp5
			push    
			self     8
			bt       code_0172
			pushi    #respondsTo
			pushi    1
			pushi    229
			lat      temp6
			send     6
code_0172:
			not     
			bnt      code_0181
			pushi    #doit
			pushi    0
			lat      temp6
			send     4
			ret     
			jmp      code_01b0
code_0181:
			pushi    #onTarget
			pushi    0
			lat      temp6
			send     4
			bnt      code_01a2
			pToa     motionInited
			bt       code_0197
			pushi    1
			lst      temp6
			callk    InitBresen,  2
code_0197:
			pushi    #doit
			pushi    0
			lat      temp6
			send     4
			ret     
			jmp      code_01b0
code_01a2:
			pTos     heading
			ldi      64536
			eq?     
			bnt      code_01b0
			pushi    #init
			pushi    0
			self     4
code_01b0:
			ldi      0
			sat      temp13
			pushi    #x
			pushi    0
			pToa     client
			send     4
			sat      temp2
			pushi    #y
			pushi    0
			pToa     client
			send     4
			sat      temp3
			pushi    2
			pushi    4
			lst      temp2
			push    
			lst      temp4
			lst      temp5
			callk    GetAngle,  8
			push    
			pushi    360
			calle    proc999_1,  4
			sat      temp7
			pushi    4
			lst      temp2
			lst      temp3
			lst      temp4
			lst      temp5
			callk    GetDistance,  8
			sat      temp1
			pushi    180
			lat      temp15
			div     
			sat      temp14
			pushi    2
			push    
			pTos     heading
			div     
			mul     
			push    
			pushi    360
			calle    proc999_1,  4
			aTop     heading
			sat      temp0
			pToa     escaping
			bt       code_0216
			pTos     nonBumps
			ldi      2
			le?     
			sat      temp12
code_0216:
			not     
			bnt      code_0265
			pToa     motionInited
			not     
			bnt      code_022a
			ldi      1
			aTop     motionInited
			pushi    1
			lst      temp6
			callk    InitBresen,  2
code_022a:
			pushi    #doit
			pushi    0
			lat      temp6
			send     4
			lst      temp2
			pushi    #x
			pushi    0
			pToa     client
			send     4
			ne?     
			bt       code_0248
			lst      temp3
			pushi    #y
			pushi    0
			pToa     client
			send     4
			ne?     
code_0248:
			bnt      code_0256
			pushi    #pickLoop
			pushi    1
			lst      temp7
			self     6
			ipToa    nonBumps
			ret     
code_0256:
			ldi      0
			aTop     nonBumps
			ldi      1
			sat      temp13
			ldi      0
			aTop     motionInited
			jmp      code_0290
code_0265:
			pushi    #b-moveCnt
			pushi    0
			lat      temp6
			send     4
			sat      temp9
			push    
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			lt?     
			bnt      code_0288
			pushi    #b-moveCnt
			pushi    1
			+at      temp9
			push    
			lat      temp6
			send     6
			ret     
			jmp      code_0290
code_0288:
			pushi    #b-moveCnt
			pushi    1
			pushi    0
			lat      temp6
			send     6
code_0290:
			pTos     targetX
			lat      temp4
			aTop     targetX
			ne?     
			bt       code_02bf
			pTos     targetY
			lat      temp5
			aTop     targetY
			ne?     
			bt       code_02bf
			pToa     escaping
			bnt      code_02d4
			dpToa    counter
			push    
			ldi      0
			le?     
			bt       code_02bf
			lst      temp1
			pToa     nearestDist
			lt?     
			bnt      code_02d4
			pTos     counter
			ldi      40
			lt?     
code_02bf:
			bnt      code_02d4
			ldi      0
			aTop     escaping
			aTop     motionInited
			ldi      32000
			aTop     nearestDist
			ldi      0
			aTop     counter
			jmp      code_0309
code_02d4:
			pToa     escaping
			bnt      code_02dc
			jmp      code_0309
code_02dc:
			lst      temp1
			pToa     nearestDist
			lt?     
			bnt      code_02ef
			lat      temp1
			aTop     nearestDist
			ldi      0
			aTop     counter
			jmp      code_0309
code_02ef:
			ipToa    counter
			push    
			ldi      50
			ge?     
			aTop     escaping
			bnt      code_0309
			pushi    2
			pushi    40
			pushi    80
			callk    Random,  4
			aTop     counter
			pToa     escapeTurn
			neg     
			aTop     escapeTurn
code_0309:
			pushi    1
			pushi    2
			lst      temp7
			lst      temp0
			calle    proc982_2,  4
			sat      temp7
			push    
			callk    Abs,  2
			sat      temp8
			push    
			ldi      90
			le?     
			sat      temp11
			pushi    1
			lst      temp7
			calle    proc999_0,  2
			bt       code_0331
			pToa     escapeTurn
code_0331:
			aTop     thisTurn
			lst      temp8
			lst      temp14
			ldi      2
			div     
			gt?     
			bnt      code_034e
			pToa     escaping
			not     
			bnt      code_034e
			pTos     heading
			pTos     thisTurn
			lat      temp14
			mul     
			add     
			aTop     heading
code_034e:
			pToa     escaping
			bnt      code_0357
			pToa     escapeTurn
			aTop     thisTurn
code_0357:
			pushi    #incClientPos
			pushi    0
			self     4
			pushi    #canBeHere
			pushi    0
			self     4
			bnt      code_0376
			ipToa    nonBumps
			ldi      0
			aTop     bumpTurn
			pToa     escaping
			not     
			bnt      code_0382
			ret     
			jmp      code_0382
code_0376:
			pToa     bumpTurn
			aTop     lastBumped
			pToa     thisTurn
			aTop     bumpTurn
			ldi      0
			aTop     nonBumps
code_0382:
			lst      temp15
			ldi      2
			mul     
			sat      temp15
			pToa     escaping
			bnt      code_03f5
			lst      temp14
			pTos     heading
			lat      temp14
			div     
			mul     
			sat      temp0
			ldi      0
			sat      temp10
code_039c:
			lst      temp10
			lat      temp15
			lt?     
			bnt      code_03df
			pushi    #canBeHere
			pushi    0
			self     4
			bnt      code_03df
			pushi    2
			lst      temp0
			lst      temp14
			lat      temp10
			mul     
			push    
			pToa     escapeTurn
			mul     
			add     
			push    
			pushi    360
			calle    proc999_1,  4
			aTop     heading
			pushi    #x
			pushi    1
			lst      temp2
			pushi    3
			pushi    1
			lst      temp3
			pToa     client
			send     12
			pushi    #incClientPos
			pushi    0
			self     4
			+at      temp10
			jmp      code_039c
code_03df:
			lst      temp10
			lat      temp15
			eq?     
			bnt      code_03f1
			pTos     heading
			pTos     escapeTurn
			lat      temp14
			mul     
			add     
			aTop     heading
code_03f1:
			pToa     heading
			sat      temp0
code_03f5:
			ldi      1
			sat      temp9
			sat      temp10
code_03fb:
			pushi    #canBeHere
			pushi    0
			self     4
			not     
			bnt      code_044e
			lst      temp9
			lat      temp15
			lt?     
			bnt      code_044e
			pushi    #x
			pushi    1
			lst      temp2
			pushi    3
			pushi    1
			lst      temp3
			pToa     client
			send     12
			lst      temp0
			lst      temp14
			lat      temp10
			mul     
			push    
			pToa     thisTurn
			mul     
			sub     
			aTop     heading
			pushi    #incClientPos
			pushi    0
			self     4
			pToa     escaping
			bnt      code_0439
			+at      temp9
			jmp      code_0449
code_0439:
			lst      temp10
			ldi      0
			gt?     
			bnt      code_0447
			lat      temp10
			neg     
			jmp      code_0449
code_0447:
			+at      temp9
code_0449:
			sat      temp10
			jmp      code_03fb
code_044e:
			pushi    #pickLoop
			pushi    1
			pTos     heading
			self     6
			ret     
		)
	)
	
	(method (incClientPos)
		(asm
			pushi    4
			pushi    1
			pushi    #x
			pushi    0
			pToa     client
			send     4
			push    
			pushi    1
			pushi    2
			pTos     heading
			pushi    100
			callk    SinMult,  4
			push    
			calle    proc999_0,  2
			push    
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			mul     
			add     
			push    
			pushi    3
			pushi    1
			pushi    #y
			pushi    0
			pToa     client
			send     4
			push    
			pushi    1
			pushi    2
			pTos     heading
			pushi    100
			callk    CosMult,  4
			push    
			calle    proc999_0,  2
			push    
			pushi    #yStep
			pushi    0
			pToa     client
			send     4
			mul     
			sub     
			push    
			pushi    58
			pushi    1
			pTos     heading
			pToa     client
			send     18
			ret     
		)
	)
	
	(method (pickLoop param1)
		(asm
			pushi    #heading
			pushi    1
			lsp      param1
			pToa     client
			send     6
			pushi    #looper
			pushi    0
			pToa     client
			send     4
			bnt      code_00b1
			pushi    #doit
			pushi    4
			pTos     client
			lsp      param1
			pushi    0
			pushi    1
			pushi    #looper
			pushi    0
			pToa     client
			send     4
			send     12
			jmp      code_00b9
code_00b1:
			pushi    2
			pTos     client
			lsp      param1
			callk    DirLoop,  4
code_00b9:
			ret     
		)
	)
	
	(method (canBeHere param1 param2 &tmp temp0 temp1 temp2)
		(asm
			pushi    #x
			pushi    0
			pToa     client
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			pToa     client
			send     4
			sat      temp1
			lap      argc
			bnt      code_00e1
			pushi    #x
			pushi    1
			lsp      param1
			pushi    3
			pushi    1
			lsp      param2
			pToa     client
			send     12
code_00e1:
			pushi    #cantBeHere
			pushi    0
			pToa     client
			send     4
			not     
			bnt      code_00fb
			pToa     offScreenOK
			bt       code_00fb
			pushi    1
			pTos     client
			calle    proc982_0,  2
			not     
code_00fb:
			sat      temp2
			pushi    #x
			pushi    1
			lst      temp0
			pushi    3
			pushi    1
			lst      temp1
			pToa     client
			send     12
			lat      temp2
			ret     
		)
	)
)
