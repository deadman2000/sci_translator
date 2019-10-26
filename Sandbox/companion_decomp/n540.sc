;;; Sierra Script 1.0 - (do not remove this comment)
(script# 540)
(include sci.sh)
(use n000)
(use n013)
(use n541)
(use n806)
(use n851)
(use n941)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	rm540 0
)

(local
	local0 =  1
	[local1 32] = [107 156 203 0 120 153 185 0 133 150 165 0 100 115 131 0 163 179 195 0 129 145 160 0 109 142 174 0 92 140 188]
	[local33 32] = [132 124 116 0 118 113 107 0 104 101 99 0 99 96 93 0 87 84 81 0 82 79 76 0 74 69 63 0 64 57 50]
	[theRegister 31]
	[theDoTo 63] = [1 5 18 0 5 13 17 0 9 5 16 0 13 25 13 0 17 5 17 0 14 25 21 0 13 17 25 0 12 25 29 28 0 0 0 13 1 5 0 20 8 8 0 28 14 20 0 10 18 2 0 22 22 10 0 25 29 17 0 30 30 2 -1]
	[local159 165] = [1794 1793 1792 -1 -1 -1 -1 1794 1793 -1 -1 -1 -1 -1 1794 -1 -1 -1 -1 -1 -1 1794 1538 1537 1536 -1 -1 -1 1794 1538 1537 -1 -1 -1 -1 1794 1538 -1 -1 -1 -1 -1 1794 1538 1282 1281 1280 -1 -1 1794 1538 1282 1281 -1 -1 -1 1794 1538 1282 -1 -1 -1 -1 1794 1538 1281 1025 1024 -1 -1 1794 1538 1282 1026 1025 -1 -1 1794 1538 1281 1026 -1 -1 -1 1794 1538 1282 1027 -1 -1 -1 1794 1538 1028 -1 -1 -1 -1 1794 1029 -1 -1 -1 -1 -1 1794 1538 1027 769 768 -1 -1 1794 1538 1027 769 -1 -1 -1 1794 1538 1027 770 -1 -1 -1 1794 1538 1027 769 512 -1 -1 1794 1538 1027 770 513 -1 -1 1794 1538 1028 514 -1 -1 -1 1794 1538 1282 768 512 256 -1 1794 1538 1028 513 257 -1 -1 1794 1029 258 -1]
	[local324 16] = [167 92 154 92 141 87 131 87 87 80 83 60 195 41 205 95]
	[local340 18] = [32 65 17 56 11 47 0 43 0 47 12 57 9 76 26 91 38 84]
	[local358 12] = [258 133 270 133 284 150 277 163 259 164 250 154]
	[local370 14] = [237 46 263 47 278 41 281 46 263 51 242 63 228 59]
	[local384 8] = [71 61 208 36 228 122 91 143]
	[local392 20] = [98 54 100 17 160 0 193 0 210 17 213 46 193 46 194 33 184 19 165 46]
	[local412 19] = [189 163 100 185 77 159 81 132 101 138 96 147 107 157 126 143 189 124]
	[local431 9] = [541 0 2 4 22 31 25 23 5]
	[local440 6] = [1540 0 1 1 1]
	[local446 4] = [1540 3 1]
	[local450 5] = [1540 4 2 1]
	[local455 5] = [1540 6 2 1]
	[local460 4] = [1540 8 1]
	[local464 5] = [1540 9 2 1]
	[local469 8] = [1540 11 1 2 1 2 1]
	[local477 4] = [1540 16 1]
	[local481 6] = [1540 17 1 2 2]
	[local487 4] = [1540 21 1]
	[local491 5] = [1540 22 2 1]
	[local496 5] = [1540 24 2 1]
	[local501 4] = [1540 26 1]
	[local505 11] = [1540 27 2 1 1 2 1 1 2 1]
	[local516 5] = [1540 35 2 1]
	[local521 11] = [1540 37 1 1 0 1540 39 1 1 1]
	[local532 5] = [1540 42 1 2]
	[local537 5] = [1540 44 2 1]
	[local542 12] = [1540 46 2 1 2 1 2 1 2 2 1]
	[local554 9] = [1540 55 2 1 2 1 1 1]
	[local563 5] = [1540 61 1 1]
	[local568 4] = [1540 64 1]
	[local572 16] = [1540 65 1 0 1540 66 1 0 1540 67 1 0 1540 68 1]
	[local588 4] = [1540 78 1]
	[local592 4] = [1540 79 1]
	[local596 4] = [1540 80 1]
	[local600 4] = [1540 81 1]
	[local604 4] = [1540 82 1]
	[local608 4] = [1540 83 1]
	[local612 4] = [1540 20 1]
	[local616 4] = [1540 86 1]
	[local620 4] = [1540 88 1]
	[local624 4] = [1540 90 1]
	[local628 4] = [1540 70 1]
	[local632 7] = [1534 23 1 2 1 1]
	[local639 4] = [1534 27 1]
	[local643 4] = [1534 29 1]
	local647
	gFarthingsTaken
	gHapenniesTaken
	gPenniesTaken
	[local651 9] = [80 87 92 96 85 99 85 78 89]
	[local660 9] = [90 81 91 109 99 122 109 75 118]
	[local669 9] = [207 202 212 207 207 218 215 196 212]
	[local678 9] = [58 68 73 95 82 99 88 56 107]
	[newPiece 9]
	[newPiece_2 9]
)
(instance rm540 of Rm
	(properties
		picture 540
		style $0064
		west 310
	)
	
	(method (init &tmp temp0)
		(proc0_3)
		(if (== gHeading 550) (= style -32762))
		(super init:)
		(cat1Poly points: @local340)
		(cat2Poly points: @local358)
		(meatPoly points: @local370)
		(brdPoly points: @local384)
		(harryPoly points: @local392)
		(robPoly points: @local412)
		(halfBoard points: @local324)
		(board init: onMeCheck: brdPoly)
		(cat1 init: onMeCheck: cat1Poly)
		(tail init: setCycle: Fwd setScript: meow)
		(cat2 init: onMeCheck: cat2Poly)
		(mugFloor init:)
		(harry init: onMeCheck: harryPoly)
		(rob init: onMeCheck: robPoly)
		(fish init:)
		(bones init:)
		(meat init: onMeCheck: meatPoly)
		(rHead init: setCycle: RandCycle)
		(hHead init: setCycle: RandCycle)
		(floor init:)
		((gIconBar at: 0) message: 11)
		(= temp0 0)
		(while (<= temp0 8)
			((= [newPiece_2 temp0] (piece new:))
				posn:
					[local651 temp0]
					[local660 ((= [newPiece temp0] (piece new:))
						posn: [local669 temp0] [local678 temp0]
						init:
					)]
				cel: 1
				init:
			)
			(++ temp0)
		)
		(arm init:)
		(cArm init:)
		(self setScript: offer)
	)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 541)
	)
)

(instance board of Feature
	(properties
		y 30
		lookStr 69
	)
	
	(method (handleEvent pEvent)
		(= description 1)
		(if
			(not
				(if (and (gClient script?) (offer script?))
					(theMorris handleEvent: pEvent)
				)
			)
			(= description 0)
			(super handleEvent: pEvent)
		)
		(pEvent claimed?)
	)
	
	(method (doVerb theVerb)
		(cond 
			((and (== theVerb 3) (not (gClient script?))) (super doVerb: theVerb))
			((and (== theVerb 3) (not (offer script?))) (proc851_0 @local628 @local431))
			((or (!= theVerb 3) (not description)) (super doVerb: theVerb))
		)
	)
)

(instance tail of Prop
	(properties
		x 271
		y 182
		view 542
		loop 9
		signal $1000
		cycleSpeed 60
	)
	
	(method (doVerb)
		(cat2 doVerb: &rest)
	)
)

(instance cat1 of Feature
	(properties
		lookStr 73
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3 (proc13_4 1540 91 1))
			(5
				(proc13_6 32)
				(proc13_4 1540 94 1)
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance cat2 of Feature
	(properties
		lookStr 75
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3 (proc13_4 1540 91 1))
			(5
				(proc13_6 32)
				(proc13_4 1540 95 1)
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mugFloor of Feature
	(properties
		onMeCheck $1000
		lookStr 71
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1540 93 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance bones of Feature
	(properties
		onMeCheck $0010
		lookStr 76
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1540 92 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance fish of Feature
	(properties
		onMeCheck $0100
		lookStr 76
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(proc13_6 32)
				(proc13_4 540 0 1)
				(proc13_6 0)
			)
			(3 (proc13_4 1540 92 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance harry of Feature
	(properties
		lookStr 63
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(cond 
					((not (gClient script?)) (proc851_0 @local516 @local431 999))
					((offer script?) (proc851_0 @local572 @local431))
					(else (proc851_0 @local568 @local431))
				)
			)
			(4
				(switch param2
					(0
						(if
							(or
								(not (theMorris moves?))
								(and (not (proc0_5 186)) (<= (theMorris moves?) 2))
							)
							(if (gMoney doit:)
								(= gFarthingsTaken (gFarthings taken?))
								(= gHapenniesTaken (gHapennies taken?))
								(= gPenniesTaken (gPennies taken?))
								(gMoney put:)
							else
								(return)
							)
						)
						(cond 
							((not (gClient script?)) (proc851_0 @local516 @local431 999))
							((offer script?)
								(cond 
									((proc0_5 186) (proc851_0 @local455 @local431 999))
									((< (theMorris moves?) 2)
										(proc851_0 @local491 @local431 999)
										(proc0_6 186)
										(proc806_6 2)
									)
									(else (proc851_0 @local496 @local431 999))
								)
							)
							((!= gHeading 550)
								(proc0_6 186)
								(offer state: 0 seconds: 0)
								(proc851_0 @local450 @local431 999 offer)
							)
							((proc0_5 186)
								(offer state: (+ (offer state?) 1) seconds: 0)
								(proc851_0 @local464 @local431 999 offer)
							)
							(else
								(proc0_6 186)
								(offer state: (+ (offer state?) 1) seconds: 0)
								(proc851_0 @local481 @local431 999 offer)
							)
						)
					)
					(18
						(gClient setScript: pissOff)
					)
					(2
						(if local647
							(proc851_0 @local563 @local431)
						else
							(proc851_0 @local554 @local431 999)
							(= local647 1)
						)
					)
					(11
						(proc851_0 @local632 @local431 999)
					)
					(14
						(proc851_0 @local639 @local431)
					)
					(13
						(proc851_0 @local643 @local431)
					)
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(3 (proc13_4 1540 84 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance pissOff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local542 @local431 999 self)
			)
			(1
				(proc0_6 124)
				(gClient newRoom: 530)
			)
		)
	)
)

(instance meat of Feature
	(properties
		lookStr 77
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(proc13_6 32)
				(proc13_4 540 1 1)
				(proc13_6 0)
			)
			(3 (proc13_4 1540 92 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rob of Feature
	(properties)
	
	(method (doVerb)
		(gEgo doVerb: &rest)
	)
)

(instance rHead of Prop
	(properties
		x 168
		y 20
		z -150
		view 542
		priority 14
		signal $4010
		cycleSpeed 540
	)
	
	(method (onMe)
		(return 0)
	)
)

(instance hHead of Prop
	(properties
		x 139
		y 8
		view 543
		priority 13
		signal $4010
		cycleSpeed 200
	)
	
	(method (doVerb)
		(harry doVerb: &rest)
	)
)

(instance floor of Feature
	(properties
		onMeCheck $0001
		lookStr 76
	)
	
	(method (handleEvent pEvent)
		(if (not (pEvent claimed?))
			(if (== ((gIconBar curIcon?) message?) 11)
				(pEvent claimed: 1)
				((gIconBar at: 0) message: 1)
				(if (offer script?)
					(gFarthings get: gFarthingsTaken)
					(gHapennies get: gHapenniesTaken)
					(gPennies get: gPenniesTaken)
				)
				(gClient newRoom: 530)
			else
				(super handleEvent: pEvent)
			)
		)
	)
)

(instance meow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks (Random 520 720)))
			(1
				(catSound number: (Random 354 355) play:)
				(= state -1)
				(= cycles 1)
			)
		)
	)
)

(instance brdPoly of Polygon
	(properties
		size 4
	)
)

(instance cat1Poly of Polygon
	(properties
		size 9
	)
)

(instance cat2Poly of Polygon
	(properties
		size 6
	)
)

(instance meatPoly of Polygon
	(properties
		size 7
	)
)

(instance harryPoly of Polygon
	(properties
		size 10
	)
)

(instance robPoly of Polygon
	(properties
		size 9
	)
)

(instance halfBoard of Polygon
	(properties
		size 8
	)
)

(instance offer of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (!= gHeading 550) (= state (+ state 3)))
				(= cycles 1)
			)
			(1
				(proc851_0 @local612 @local431 0 self)
			)
			(2
				(self setScript: theMorris self)
			)
			(3
				(theMorris moves: 0)
				(cond 
					((proc0_5 186)
						(if local0
							(= state (+ state 4))
							(proc851_0 @local501 @local431 0 self)
						else
							(proc851_0 @local521 @local431 0 self)
							(gFarthings get: gFarthingsTaken)
							(gHapennies get: gHapenniesTaken)
							(gPennies get: gPenniesTaken)
						)
					)
					(local0 (proc851_0 @local532 @local431 999 self 0))
					(else (proc851_0 @local537 @local431 999 self 0))
				)
				(= gHeading 550)
			)
			(4
				(cond 
					((proc0_5 186) (= cycles 1))
					((== gHeading 550) (proc851_0 @local469 @local431 999 self))
					(else (proc851_0 @local440 @local431 0 self))
				)
			)
			(5
				(proc0_4)
				(proc806_6 1)
				(= seconds 15)
			)
			(6
				(proc0_3)
				(cond 
					((proc0_5 186)
						(= state (- state 2))
						(proc851_0 @local460 @local431 0 self)
					)
					((== gHeading 550) (proc851_0 @local477 @local431 0 self))
					(else (proc851_0 @local446 @local431 0 self 0) (= state 0))
				)
			)
			(7 (= global11 550))
			(8
				(cArm setCycle: ATo (+ @local159 154) self)
			)
			(9
				(gEgo get: 14)
				(proc806_1 50)
				(proc13_0 {} 82 771 0 9 108)
				(= seconds 4)
			)
			(10
				(cArm setCycle: ATo (+ @local159 154) -1 self)
			)
			(11
				(proc851_0 @local505 @local431 999 self)
			)
			(12 (self dispose:) (proc0_4))
		)
	)
)

(instance piece of Prop
	(properties
		lookStr 69
		view 542
		loop 10
		priority 3
		signal $5110
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(cond 
					((offer script?) (proc13_4 1540 87 1))
					((!= (theMorris state?) -1) (proc13_4 1540 89 1))
					(else (proc13_4 1540 85 1))
				)
			)
			(3
				(cond 
					((offer script?)
						(if noun
							(theMorris
								handleEvent: ((User curEvent?) x: x y: y claimed: 0)
							)
						else
							(proc851_0 @local620 @local431)
						)
					)
					((!= (theMorris state?) -1) (proc851_0 @local624 @local431))
					(else (proc851_0 @local616 @local431))
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance arm of Prop
	(properties
		x 196
		y 20
		z -121
		view 542
		loop 8
		priority 10
		signal $5010
		cycleSpeed 0
	)
	
	(method (doVerb)
		(gEgo doVerb: &rest)
	)
)

(instance cArm of Prop
	(properties
		x 102
		y 8
		z -32
		view 543
		loop 8
		priority 10
		signal $5010
		cycleSpeed 0
	)
	
	(method (doVerb)
		(harry doVerb: &rest)
	)
)

(instance theMorris of Morris
	(properties)
	
	(method (dispose)
		(= local0 (if (== local0 -32768) else (<= us 2)))
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp [temp0 100] theUsThreat theUsMills theThemThreat theThemMills)
		(switch (= state newState)
			(0
				(arm init: setCel: 0)
				(= us (= them 9))
				(global1 setCursor: global20 (HaveMouse))
				(= cycles 1)
			)
			(1
				(if (< moves 18)
					(= register [newPiece (/ moves 2)])
					(arm setCel: 0)
				)
				(= doFrom (= doTo (= doTake -20)))
				(= cycles 1)
			)
			(2
				(proc0_4)
				(proc806_6 2)
				(= seconds 50)
			)
			(3
				(if seconds
					(= seconds 0)
				else
					(proc0_3)
					(proc851_0 @local487 @local431 0 self)
					(= state (- state 2))
					(return)
				)
				(if (< moves 18)
					(register hide:)
					(arm
						setCycle: ATo (+ @local159 (* 14 (/ (* 3 (+ 1 doTo)) 4))) self
					)
				else
					(arm
						setCycle: ATo (+ @local159 (* 14 (/ (* 3 (+ 1 doFrom)) 4))) self
					)
				)
			)
			(4
				(arm
					setCycle: ATo (+ @local159 (* 14 (/ (* 3 (+ 1 doTo)) 4))) -1 self
				)
				(if (< moves 18) (clickSound play:))
				(= ticks (+ 1 (arm cycleSpeed?)))
				(if (>= moves 18) (register hide:))
			)
			(5
				(register
					show:
					posn: [local1 doTo] [local33 doTo]
					noun: 1
					setPri: -1
				)
				(if (>= moves 18) (clickSound play:))
				(= register 0)
			)
			(6
				(= theUsThreat usThreat)
				(= theUsMills usMills)
				(= theThemThreat themThreat)
				(= theThemMills themMills)
				(= doTake -20)
				(self doMove: 16 1)
				(if (not (self inMill: doTo)) (= state (+ state 3)))
				(self unDoMove: 16 1)
				(= usThreat theUsThreat)
				(= usMills theUsMills)
				(= themThreat theThemThreat)
				(= themMills theThemMills)
				(arm setCel: 0 setLoop: 8)
				(= cycles 1)
			)
			(7
				(proc0_4)
				(gIconBar curIcon: (gIconBar at: 2))
				(= seconds 30)
			)
			(8
				(if seconds
					(= seconds 0)
					(arm
						setCycle: ATo (+ @local159 (* 14 (/ (* 3 (+ 1 doTake)) 4))) self
					)
				else
					(proc0_3)
					(proc851_0 @local487 @local431 0 self)
					(= state (- state 2))
				)
			)
			(9
				([theRegister doTake] dispose:)
				(= [theRegister doTake] 0)
				(arm
					setCycle: ATo (+ @local159 (* 14 (/ (* 3 (+ 1 doTake)) 4))) -1 self
				)
			)
			(10
				(arm setCel: 0 setLoop: 8)
				(= cycles 2)
			)
			(11
				(self doMove: 16 1)
				(if (<= us 2) (self dispose:) (return))
				(if (>= moves 18) (= scan 3))
				(if (== moves 1)
					(= doTo [theDoTo (+ doTo (* 31 (Random 0 1)))])
				else
					(= local0 (self minimax: scan 0 1 16 32767))
				)
				(if (== doTo -20) (self dispose:) (return))
				(self doMove: 1 16)
				(= doFrom (self lowerize: doFrom))
				(= doTo (self lowerize: doTo))
				(= doTake (self lowerize: doTake))
				(if (<= moves 18)
					((= register [newPiece_2 (- (/ moves 2) 1)]) hide:)
					(cArm
						setCycle:
							ATo
							(+ @local159 (* 14 (- 23 (/ (* 3 (+ 1 doTo)) 4))))
							self
					)
				else
					(cArm
						setCycle:
							ATo
							(+ @local159 (* 14 (- 23 (/ (* 3 (+ 1 doFrom)) 4))))
							self
					)
				)
			)
			(12
				(cArm
					setCycle:
						ATo
						(+ @local159 (* 14 (- 23 (/ (* 3 (+ 1 doTo)) 4))))
						-1
						self
				)
				(if (<= moves 18) (clickSound play:))
				(= cycles (+ 1 (cArm cycleSpeed?)))
			)
			(13
				([theRegister doTo]
					posn:
						[local1 doTo]
						[local33 (if (<= moves 18)
							((= [theRegister doTo] register) noun: 1 show:)
						else
							(clickSound play:)
							(= [theRegister doTo] [theRegister doFrom])
							(= [theRegister doFrom] 0)
						)]
				)
			)
			(14
				(if (== doTake -20)
					(++ state)
					(= cycles 1)
				else
					(cArm
						setCycle:
							ATo
							(+ @local159 (* 14 (- 23 (/ (* 3 (+ 1 doTake)) 4))))
							self
					)
				)
			)
			(15
				([theRegister doTake] dispose:)
				(= [theRegister doTake] 0)
				(cArm
					setCycle:
						ATo
						(+ @local159 (* 14 (- 23 (/ (* 3 (+ 1 doTake)) 4))))
						-1
						self
				)
			)
			(16
				(cArm setCel: 0 setLoop: 8)
				(if (and (> them 2) (!= local0 32767))
					(= state 0)
					(= cycles 1)
				else
					(self dispose:)
				)
			)
		)
	)
	
	(method (handleEvent pEvent &tmp theDoTake theTheDoTake [temp2 3])
		(if (pEvent claimed?) (return))
		(if
			(and
				(or (== state 2) (== state 7))
				(&
					(= theDoTake (OnControl 4 (pEvent x?) (pEvent y?)))
					$eeee
				)
				(== (gIconBar curIcon?) (gIconBar at: 2))
			)
			(pEvent claimed: 1)
			(= theTheDoTake -1)
			(while
			(and (not (& theDoTake $0001)) (< theTheDoTake 16))
				(++ theTheDoTake)
				(= theDoTake (>> theDoTake $0001))
			)
			(= theDoTake theTheDoTake)
			(if (AvoidPath (pEvent x?) (pEvent y?) halfBoard)
				(= theDoTake (+ theDoTake 16))
			)
			(cond 
				((or (< moves 18) (!= doFrom -20))
					(cond 
						((!= doTo -20)
							(cond 
								((not (IsObject [theRegister theDoTake])) (proc851_0 @local588 @local431))
								((not ([theRegister theDoTake] cel?)) (proc851_0 @local592 @local431))
								((not (self isValid: doFrom doTo theDoTake)) (proc851_0 @local596 @local431))
								(else (= doTake theDoTake) (= cycles 1) (proc0_3))
							)
						)
						((IsObject [theRegister theDoTake]) (proc851_0 @local600 @local431))
						(
							(or
								(self isValid: doFrom theDoTake -20)
								(== theDoTake doFrom)
							)
							(= [theRegister theDoTake] register)
							(register
								signal: (| (register signal?) $0100)
								setCycle: 0
								setCel: 0
							)
							(if (== theDoTake doFrom)
								(= doFrom -20)
							else
								(= doTo theDoTake)
								(= cycles 1)
								(proc0_3)
							)
						)
						(1 (proc851_0 @local604 @local431))
					)
				)
				((not (IsObject [theRegister theDoTake])) (proc851_0 @local588 @local431))
				(([theRegister theDoTake] cel?) (proc851_0 @local608 @local431))
				(else
					(= doFrom theDoTake)
					(= register [theRegister doFrom])
					(= [theRegister doFrom] 0)
					(register
						signal: (& (register signal?) $feff)
						setCycle: Fwd
					)
				)
			)
		)
		(pEvent claimed?)
	)
)

(class ATo of CT
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		endCel -1
		pnts 0
	)
	
	(method (init theClient thePnts theCaller theCaller_2 &tmp temp0)
		(= client theClient)
		(= pnts thePnts)
		(if (>= argc 3)
			(if (IsObject theCaller)
				(= caller theCaller)
			else
				(if (< (= cycleDir theCaller) 0)
					(while (!= (proc999_6 pnts (++ endCel)) -1)
					)
				)
				(if (>= argc 4) (= caller theCaller_2))
			)
		)
	)
	
	(method (doit &tmp temp0)
		(if (== (client cel?) (self nextCel:)) (return))
		(if
			(==
				(= temp0
					(proc999_6 pnts (= endCel (+ endCel cycleDir)))
				)
				-1
			)
			(self cycleDone:)
		else
			(client cel: (& temp0 $00ff))
			(client loop: (& (>> temp0 $0008) $00ff))
		)
	)
)

(instance clickSound of Sound
	(properties
		flags $0001
		number 533
	)
)

(instance catSound of Sound
	(properties
		flags $0001
	)
)
