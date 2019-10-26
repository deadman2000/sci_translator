;;; Sierra Script 1.0 - (do not remove this comment)
(script# 330)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n950)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	fairArchery 0
)

(local
	local0
	local1 =  1
	arrowX
	arrowY
	theArrowY
	newActor
	local6
	local7
	local8
	local9 =  1
	local10
	local11
	[newSmallArrow 6]
	[newSmallArrow_2 6]
	[newView 3]
	[newView_3 3]
	[newView_2 3]
	[newView_4 3]
	[local36 3]
	[local39 3]
	local42
	local43
	local44
	local45
	local46
	[local47 3] = [105 107 109]
	[local50 3] = [159 158 158]
	[local53 3] = [51 60 76]
	[local56 3] = [276 266 248]
	[local59 3] = [126 120 108]
	[local62 3] = [5 4 3]
	[local65 3] = [36 39 42]
	[local68 3] = [60 58 70]
	[local71 3] = [3 4 5]
	[local74 3] = [0 6 9]
	local77
	local78
	local79
	local80
	local81 =  1
	local82 =  1
	local83
	local84
	local85
	[local86 4] = [1330 0 1]
	[local90 4] = [1330 1 1]
	[local94 4] = [1330 2 1]
	[local98 4] = [1330 3 1]
	[local102 4] = [1330 4 1]
	[local106 4] = [1330 5 1]
	[local110 4] = [1330 14 1]
	[local114 4] = [1330 6 1]
	[local118 4] = [1330 7 1]
	[local122 4] = [1330 8 1]
	[local126 4] = [1330 9 1]
	[local130 4] = [1330 10 1]
	[local134 4] = [1330 11 1]
	[local138 5] = [1330 12 1 1]
	[local143 9] = [327 0 3 4 15 31 12 21 21]
)
(procedure (localproc_000e)
	(switch local85
		(0
			(= local44 0)
			(= local45 151)
			(= local46 129)
			(middleTarget x: local45 y: local46)
			(targetLeft x: (- local45 106) y: local46)
			(targetRight x: (+ local45 132) y: local46)
		)
		(1
			(= local44 1)
			(= local45 152)
			(= local46 122)
			(middleTarget x: local45 y: local46)
			(targetLeft x: (- local45 97) y: (+ local46 1))
			(targetRight x: (+ local45 119) y: (+ local46 1))
		)
		(2
			(= local44 2)
			(= local45 153)
			(= local46 110)
			(middleTarget x: local45 y: local46)
			(targetLeft x: (- local45 81) y: (+ local46 1))
			(targetRight x: (+ local45 100) y: (+ local46 1))
		)
	)
)

(procedure (localproc_0102)
	(= local8
		(/
			(if (== global125 2)
				(switch (Random 0 2)
					(0 280)
					(1 320)
					(2 360)
				)
			else
				(switch (Random 0 3)
					(0 120)
					(1 160)
					(2 200)
					(3 240)
				)
			)
			global125
		)
	)
)

(procedure (localproc_0179)
	(if (== global125 2)
		(= local79 (Random 2 4))
	else
		(= local79 (Random 0 3))
	)
	(cond 
		((<= local79 1) (= local80 (Random 10 12)))
		((<= local79 3) (= local80 (Random 20 24)))
		((= local79 4) (= local80 (Random 65 78)))
	)
	(windFlags init:)
)

(procedure (localproc_01da)
	(windFlags hide:)
	(middleTarget hide:)
	(targetLeft hide:)
	(targetRight hide:)
	(bowHand hide:)
	(bow hide:)
	(arrow hide:)
	(gClient drawPic: 803 3)
)

(procedure (localproc_0220)
	(gClient drawPic: 330)
	(windFlags show:)
	(middleTarget show:)
	(targetLeft show:)
	(targetRight show:)
	(bowHand show:)
	(arrow
		cel: 0
		posn: (+ (bowHand x?) 22) (- (bowHand y?) 106)
		show:
	)
	(= local9 1)
	(bow show:)
	(= theArrowY 0)
)

(procedure (localproc_02f4)
	(switch local85
		(0
			(switch (Random 0 3)
				(0
					(= local42 (Random 272 280))
					(= local43 (Random 120 124))
				)
				(1
					(= local42 (Random 279 281))
					(= local43 (Random 124 128))
				)
				(2
					(= local42 (Random 271 280))
					(= local43 (Random 128 130))
				)
				(3
					(= local42 (Random 268 272))
					(= local43 (Random 123 129))
				)
			)
		)
		(1
			(switch (Random 0 3)
				(0
					(= local42 (Random 261 269))
					(= local43 (Random 115 119))
				)
				(1
					(= local42 (Random 267 270))
					(= local43 (Random 119 122))
				)
				(2
					(= local42 (Random 261 269))
					(= local43 (Random 122 124))
				)
				(3
					(= local42 (Random 260 263))
					(= local43 (Random 118 122))
				)
			)
		)
		(2
			(switch (Random 0 3)
				(0
					(= local42 (Random 244 251))
					(= local43 (Random 105 106))
				)
				(1
					(= local42 (Random 250 251))
					(= local43 (Random 105 109))
				)
				(2
					(= local42 (Random 244 251))
					(= local43 (Random 109 110))
				)
				(3
					(= local42 (Random 244 246))
					(= local43 (Random 106 109))
				)
			)
		)
	)
)

(procedure (localproc_04a9 &tmp temp0)
	(bigTarget x: 151 show:)
	(= temp0 0)
	(while (<= temp0 2)
		([newSmallArrow_2 temp0] show:)
		(++ temp0)
	)
)

(procedure (localproc_04d6 &tmp temp0)
	(bigTarget hide:)
	(= temp0 0)
	(while (<= temp0 2)
		([newSmallArrow_2 temp0] hide:)
		(++ temp0)
	)
)

(procedure (localproc_04fb &tmp temp0)
	(bigTarget x: 63 show:)
	(= temp0 0)
	(while (<= temp0 2)
		([newView_2 temp0] show:)
		(++ temp0)
	)
)

(procedure (localproc_0527 &tmp temp0)
	(= temp0 0)
	(while (<= temp0 2)
		([newView_2 temp0] hide:)
		(++ temp0)
	)
)

(procedure (localproc_0544 &tmp temp0)
	(bigTarget x: 256 show:)
	(= temp0 0)
	(while (<= temp0 2)
		([newView_4 temp0] show:)
		(++ temp0)
	)
)

(procedure (localproc_0571 &tmp temp0)
	(= temp0 0)
	(while (<= temp0 2)
		([newView_4 temp0] hide:)
		(++ temp0)
	)
)

(procedure (localproc_058e)
	(newActor loop: 2 cel: 0 posn: 16 166 show:)
)

(procedure (localproc_05a8)
	(newActor loop: 1 cel: 0 posn: 309 164 show:)
)

(instance cleanTarget of Code
	(properties)
	
	(method (doit &tmp [temp0 2])
		(while (>= (-- local10) 0)
			([newSmallArrow local10] dispose:)
			([newSmallArrow local10] hide:)
		)
		(= local10 0)
		(while (>= (-- local11) 0)
			([newView_3 local11] dispose:)
		)
		(= local11 0)
	)
)

(instance fairArchery of Rm
	(properties
		picture 330
		style $8003
	)
	
	(method (init)
		(= local0 (global1 egoMoveSpeed?))
		(gIconBar disable: 2 3 5 6 7)
		(global77 joyInc: 2)
		(super init:)
		(drumSound init:)
		(= local84 global34)
		(= global34 0)
		(if (> global125 1) (= local85 (- global125 2)))
		(= local78 global125)
		(bowHand setPri: 12 loop: 1 cel: 1 init:)
		(bow setPri: 12 loop: 0 cel: 0 init:)
		(arrow setPri: 14 loop: 0 cel: 0 init:)
		(localproc_000e)
		(middleTarget init:)
		(targetLeft init:)
		(targetRight init:)
		(bigTarget setPri: 14 init: hide:)
		(localproc_0102)
		(localproc_0179)
		(targetArea init:)
	)
	
	(method (doit)
		(super doit:)
		(cond 
			(script)
			((not (-- local8)) (localproc_0179) (localproc_0102))
			((and (== global125 1) (not (proc0_5 10))) (gClient setScript: goToGoldenArrow))
			(
			(and local81 (not (proc999_5 global125 local78 1))) (proc0_4) (= global11 0))
			((and local81 (== local10 6)) (gClient setScript: beginAnnounce))
			((and local82 (== local83 1) (== local10 3)) (gClient setScript: roundOne))
			((and local82 (== local83 2) (== local10 3)) (gClient setScript: roundTwo))
			((and (== local83 3) (== local10 1))
				(if
					(switch local85
						(0
							(if (>= 160 arrowX) (>= arrowX 158))
							(if (>= 127 arrowY)
								(>= (if (>= 160 arrowX) (>= arrowX 158)) 125)
							)
						)
						(1
							(if (>= 158 arrowX) (>= arrowX 156))
							(if (>= 120 arrowY)
								(>= (if (>= 158 arrowX) (>= arrowX 156)) 118)
							)
						)
						(2
							(== arrowX 158)
							(== arrowY 107)
						)
					)
					(gClient setScript: puckHasWon)
				else
					(gClient setScript: puckHasLost)
				)
			)
		)
	)
	
	(method (dispose)
		(shootSound dispose:)
		(global1 setSpeed: local0)
		(global77 joyInc: 5)
		(= global34 local84)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (gDoVerbCode doit: 10))
			(1
				(proc0_6 131)
				(gClient newRoom: 320)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bowHand of View
	(properties
		x 137
		y 239
		lookStr 10734
		view 201
		loop 1
		cel 1
		signal $5000
	)
	
	(method (doit)
		(asm
			pushi    3
			lsg      global19
			pushi    4
			pushi    5
			calle    proc999_5,  6
			bnt      code_0989
			pushi    2
			pushi    135
			pushi    2
			pushi    189
			lsg      global70
			calle    proc999_2,  4
			push    
			calle    proc999_3,  4
			push    
			ldi      22
			sub     
			aTop     x
			pushi    2
			pushi    88
			pushi    2
			pushi    143
			lsg      global71
			calle    proc999_2,  4
			push    
			calle    proc999_3,  4
			push    
			lal      local85
			lali     local47
			add     
			aTop     y
			lal      local9
			bnt      code_0973
			lsl      local85
			dup     
			ldi      0
			eq?     
			bnt      code_0915
			pushi    186
			lag      global70
			ge?     
			bnt      code_0961
			pprev   
			ldi      135
			ge?     
			bnt      code_0961
			pushi    143
			lag      global71
			ge?     
			bnt      code_0961
			pprev   
			ldi      114
			ge?     
			jmp      code_0961
code_0915:
			dup     
			ldi      1
			eq?     
			bnt      code_093d
			pushi    183
			lag      global70
			ge?     
			bnt      code_0961
			pprev   
			ldi      138
			ge?     
			bnt      code_0961
			pushi    137
			lag      global71
			ge?     
			bnt      code_0961
			pprev   
			ldi      105
			ge?     
			jmp      code_0961
code_093d:
			dup     
			ldi      2
			eq?     
			bnt      code_0961
			pushi    179
			lag      global70
			ge?     
			bnt      code_0961
			pprev   
			ldi      139
			ge?     
			bnt      code_0961
			pushi    120
			lag      global71
			ge?     
			bnt      code_0961
			pprev   
			ldi      80
			ge?     
code_0961:
			toss    
			bnt      code_0973
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			jmp      code_0989
code_0973:
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      gIconBar
			send     4
			send     4
			push    
			lag      global1
			send     6
code_0989:
			pushi    #doit
			pushi    0
			super    View,  4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if (not local9)
					(arrow cel: 0 show:)
					(= local9 1)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bow of View
	(properties
		x 195
		y 144
		view 201
		signal $5000
	)
	
	(method (doit)
		(= x (+ (bowHand x?) 58))
		(= y (- (bowHand y?) 95))
		(super doit:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1330 17 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance arrow of View
	(properties
		x 159
		y 133
		lookStr 10777
		view 332
		priority 10
		signal $4010
	)
	
	(method (doit)
		(= x (+ (bowHand x?) 22))
		(= y (- (bowHand y?) 106))
		(super doit:)
	)
)

(instance smallArrow of View
	(properties
		view 332
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1330 18))
			(10
				(targetArea doVerb: theVerb)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance adamBigArrow of Actor
	(properties
		x 166
		y 147
		view 326
		loop 1
		cel 1
		priority 15
		signal $4010
	)
)

(instance windFlags of Prop
	(properties
		x 27
		y 100
		lookStr 10850
		view 330
	)
	
	(method (init)
		(super init:)
		(self
			loop: local79
			setPri: 3
			setCycle: Fwd
			cycleSpeed: local80
		)
	)
)

(instance middleTarget of View
	(properties
		view 325
		signal $4000
	)
	
	(method (init)
		(super init:)
		(self cel: local44 stopUpd:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(cond 
					((== local83 3))
					(local10 (gClient setScript: puckCloseUpTarg))
					(else (gClient setScript: showEmptyTarget))
				)
			)
			(10
				(targetArea doVerb: theVerb)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance targetLeft of View
	(properties
		lookStr 10958
		view 325
		loop 3
		signal $4000
	)
	
	(method (init)
		(super init:)
		(self cel: local44 stopUpd:)
	)
)

(instance targetRight of View
	(properties
		lookStr 10958
		view 325
		loop 4
		signal $4000
	)
	
	(method (init)
		(super init:)
		(self cel: local44 stopUpd:)
	)
)

(instance bigTarget of View
	(properties
		y 189
		view 326
		signal $4008
	)
)

(instance splitArrow of View
	(properties
		x 165
		y 146
		view 326
		loop 2
		cel 1
		priority 15
		signal $4010
	)
)

(instance adamStanding of View
	(properties
		x 223
		y 167
		view 325
		loop 2
	)
)

(instance walkPuck of Actor
	(properties
		x 259
		y 164
		view 33
		loop 7
	)
)

(instance guard1 of View
	(properties
		x 99
		y 181
		view 750
		loop 3
		signal $0001
	)
)

(instance guard2 of View
	(properties
		x 156
		y 183
		view 750
		loop 3
		cel 1
		signal $0001
	)
)

(instance guard3 of View
	(properties
		x 190
		y 178
		view 750
		loop 3
		cel 5
		signal $0001
	)
)

(instance fireArrow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (not (& ((gIconBar at: 0) signal?) $0004))
					(gIconBar disable: 0)
				)
				(arrow cel: 1)
				(= ticks 12)
			)
			(1
				(shootSound number: 906 play: self)
				(arrow cel: 2)
				(= ticks 12)
			)
			(2
				(arrow hide:)
				(= arrowX (arrow x?))
				(= arrowY (arrow y?))
				(= arrowX
					(+
						arrowX
						(switch local79
							(0
								(-
									(switch local85
										(0 (Random 3 6))
										(1 (Random 5 8))
										(2 (Random 7 10))
									)
								)
							)
							(1
								(switch local85
									(0 (Random 3 6))
									(1 (Random 5 8))
									(2 (Random 7 10))
								)
							)
							(2
								(-
									(switch local85
										(0 (Random 1 5))
										(1 (Random 3 7))
										(2 (Random 5 9))
									)
								)
							)
							(3
								(switch local85
									(0 (Random 1 5))
									(1 (Random 3 7))
									(2 (Random 5 9))
								)
							)
						)
					)
				)
				(= arrowY (+ arrowY [local74 local85]))
				(arrow cel: [local71 local85])
				(= local9 0)
				(if
					(and
						(not local81)
						(>=
							(GetDistance
								[local50 local85]
								[local59 local85]
								arrowX
								arrowY
							)
							[local62 local85]
						)
					)
					(++ local77)
				)
				(if (< local83 3)
					(if (== local10 0)
						(= [local36 local10] [local53 local85])
						(= [local39 local10] [local59 local85])
					else
						(= [local36 local10]
							(+ [local53 local85] (- (Random 2 10) 6))
						)
						(= [local39 local10]
							(+ [local59 local85] (- (Random 2 10) 6))
						)
					)
				)
				((= [newSmallArrow local10] (smallArrow new:))
					view: 332
					loop: 0
					cel: [local71 local85]
					posn: arrowX arrowY
					ignoreActors:
					setPri: 10
					init:
					stopUpd:
				)
				(if
					(switch local85
						(0
							(if
							(or (> arrowX 169) (< arrowX 148) (> arrowY 132))
							else
								(< arrowY 119)
							)
						)
						(1
							(if
							(or (> arrowX 167) (< arrowX 149) (> arrowY 126))
							else
								(< arrowY 111)
							)
						)
						(2
							(if
							(or (> arrowX 166) (< arrowX 150) (> arrowY 114))
							else
								(< arrowY 101)
							)
						)
					)
					(= local6 999)
					(= local7 999)
				else
					(= local6
						(+
							(/
								(* (- arrowX [local50 local85]) [local65 local85])
								10
							)
							166
						)
					)
					(= local7
						(+
							(/
								(* (- arrowY [local59 local85]) [local68 local85])
								10
							)
							147
						)
					)
					(if (== arrowY theArrowY) (= local7 (- local7 1)))
				)
				(= theArrowY arrowY)
				((= [newSmallArrow_2 local10] (smallArrow new:))
					view: 326
					loop: 1
					cel: 0
					posn: local6 local7
					setPri: 15
					signal: 16400
					init:
					hide:
				)
				(++ local10)
				(global1
					setCursor:
						global19
						1
						(+ global70 (Random 0 8) -4)
						(+ global71 (Random 0 8) -4)
				)
				(= cycles 1)
			)
			(3)
			(4
				(shootSound number: 910 play:)
				(= cycles 2)
			)
			(5 (self dispose:))
		)
	)
)

(instance changeTargPos of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(cleanTarget doit:)
				(windFlags hide:)
				(middleTarget dispose:)
				(targetLeft dispose:)
				(targetRight dispose:)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(gClient drawPic: 803)
				(= cycles 8)
			)
			(1
				(= local85 (- global125 2))
				(localproc_000e)
				(gClient drawPic: 330)
				(middleTarget init:)
				(targetLeft init:)
				(targetRight init:)
				(windFlags show:)
				(bowHand show:)
				(bow show:)
				(arrow
					cel: 0
					posn: (+ (bowHand x?) 22) (- (bowHand y?) 106)
					show:
				)
				(= local9 1)
				(= cycles 5)
			)
			(2
				(proc0_4)
				(gIconBar disable: 0 2 3 6 7)
				(= local82 1)
				(= local10 3)
				(self dispose:)
			)
		)
	)
)

(instance beginAnnounce of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(= local81 0)
				(proc0_3)
				(arrow hide:)
				(bow hide:)
				(bowHand hide:)
				(bigTarget x: 151 show:)
				(= temp0 0)
				(while (< temp0 local10)
					([newSmallArrow_2 temp0] show:)
					(++ temp0)
				)
				(= cycles 15)
			)
			(1
				(drumSound play:)
				(proc851_0 1 @local86 @local143 0 self)
			)
			(2
				(bigTarget x: 151 hide:)
				(= temp0 0)
				(while (< temp0 local10)
					([newSmallArrow_2 temp0] hide:)
					(++ temp0)
				)
				(= cycles 7)
			)
			(3
				(cleanTarget doit:)
				(localproc_01da)
				(= cycles 3)
			)
			(4
				(localproc_0220)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(= cycles 8)
			)
			(5
				(proc851_0 1 @local90 @local143 0 self)
			)
			(6
				((= newActor (Actor new:))
					view: 332
					loop: 1
					cel: 0
					posn: 309 164
					ignoreActors:
					setPri: 10
					init:
				)
				(= local11 0)
				(= theArrowY 0)
				(= ticks 30)
			)
			(7
				(self setScript: turnClymBill self)
			)
			(8
				(localproc_05a8)
				(= ticks 30)
			)
			(9
				(self setScript: turnClymBill self)
			)
			(10
				(localproc_05a8)
				(= ticks 30)
			)
			(11
				(self setScript: turnClymBill self)
			)
			(12
				(localproc_0544)
				(= ticks 180)
			)
			(13
				(localproc_0571)
				(bigTarget x: 256 hide:)
				(= cycles 4)
			)
			(14
				(proc851_0 1 @local98 @local143 0 self)
			)
			(15
				(bowHand show:)
				(bow show:)
				(arrow show:)
				(= cycles 3)
			)
			(16
				(= local83 1)
				(= local77 0)
				(proc0_4)
				(gIconBar disable: 0 2 3 6 7)
				(self dispose:)
			)
		)
	)
)

(instance roundOne of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(= local82 0)
				(proc0_3)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(localproc_04a9)
				(= ticks 120)
			)
			(1
				(drumSound play:)
				(proc851_0 1 @local94 @local143 0 self)
			)
			(2
				(localproc_04d6)
				(= theArrowY 0)
				(= local11 0)
				(localproc_058e)
				(self setScript: adamShoot self)
			)
			(3
				(localproc_058e)
				(= ticks 30)
			)
			(4
				(self setScript: adamShoot self)
			)
			(5
				(localproc_058e)
				(= ticks 30)
			)
			(6
				(self setScript: adamShoot self)
			)
			(7
				(localproc_04fb)
				(= cycles 20)
			)
			(8
				(if (== local77 3)
					(proc0_6 160)
					(proc851_0 1 @local134 @local143 0 self)
				else
					(proc851_0 1 @local102 @local143 0 self)
				)
			)
			(9
				(localproc_0527)
				(bigTarget x: 63 hide:)
				(while (>= (= temp0 (-- local11)) 0)
					([newView_3 temp0] dispose:)
					([newView temp0] dispose:)
				)
				(cleanTarget doit:)
				(if (== local77 3)
					(proc0_4)
					(gClient newRoom: 320)
				else
					(localproc_01da)
					(= cycles 2)
				)
			)
			(10
				(localproc_0220)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(= cycles 3)
			)
			(11
				(proc851_0 1 @local106 @local143 0 self)
			)
			(12
				(= local11 0)
				(= theArrowY 0)
				(localproc_05a8)
				(= ticks 30)
			)
			(13
				(self setScript: turnClymBill self)
			)
			(14
				(localproc_05a8)
				(= ticks 30)
			)
			(15
				(self setScript: turnClymBill self)
			)
			(16
				(localproc_05a8)
				(= ticks 30)
			)
			(17
				(self setScript: turnClymBill self)
			)
			(18
				(localproc_0544)
				(= ticks 180)
			)
			(19
				(localproc_0571)
				(bigTarget x: 256 hide:)
				(bowHand show:)
				(bow show:)
				(arrow show:)
				(= cycles 5)
			)
			(20
				(proc851_0 1 @local98 @local143 0 self)
				(self cue:)
			)
			(21
				(= local83 2)
				(= local77 0)
				(proc0_4)
				(gIconBar disable: 0 2 3 6 7)
				(= local82 1)
				(self dispose:)
			)
		)
	)
)

(instance roundTwo of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(= local82 0)
				(proc0_3)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(= cycles 4)
			)
			(1
				(localproc_04a9)
				(= ticks 120)
			)
			(2
				(drumSound play:)
				(proc851_0 1 @local114 @local143 0 self)
			)
			(3
				(localproc_04d6)
				(= local11 0)
				(= theArrowY 0)
				(localproc_058e)
				(= ticks 30)
			)
			(4
				(self setScript: adamShoot self)
			)
			(5
				(localproc_058e)
				(= ticks 30)
			)
			(6
				(self setScript: adamShoot self)
			)
			(7
				(localproc_058e)
				(= ticks 30)
			)
			(8
				(self setScript: adamShoot self)
			)
			(9
				(localproc_04fb)
				(= cycles 20)
			)
			(10
				(localproc_0527)
				(bigTarget x: 63 hide:)
				(= cycles 7)
			)
			(11
				(if (== local77 3)
					(proc0_6 160)
					(proc851_0 1 @local134 @local143 0 self)
				else
					(proc851_0 1 @local118 @local143 0 self)
				)
			)
			(12
				(= temp0 0)
				(while (<= temp0 2)
					([newView_3 temp0] dispose:)
					([newView temp0] dispose:)
					(++ temp0)
				)
				(cleanTarget doit:)
				(if (== local77 3)
					(proc0_4)
					(gClient newRoom: 320)
				else
					(localproc_01da)
					(= cycles 2)
				)
			)
			(13
				(localproc_0220)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(= cycles 7)
			)
			(14
				(proc851_0 1 @local122 @local143 0 self)
			)
			(15
				(newActor loop: 3 cel: 0 posn: 159 137 show:)
				(= ticks 30)
			)
			(16
				(newActor cel: 2 posn: 159 130)
				(shootSound number: 906 play:)
				(= ticks 24)
			)
			(17
				(newActor
					posn: [local50 local85] [local59 local85]
					ignoreActors:
					cel: [local71 local85]
				)
				(= ticks 24)
			)
			(18
				((= [newView 0] (View new:))
					view: 332
					loop: 3
					cel: [local71 local85]
					posn: [local50 (newActor hide:)] [local59 local85]
					ignoreActors:
					setPri: 10
					init:
					stopUpd:
				)
				(= ticks 24)
			)
			(19
				(shootSound number: 910 play:)
				(bigTarget x: 63 show:)
				([newView_2 0] x: 78 y: 147 show:)
				(= cycles 20)
			)
			(20
				(proc851_0 1 @local126 @local143 0 self)
			)
			(21
				([newView_2 0] x: 78 y: 147 hide:)
				(bigTarget x: 63 hide:)
				(= cycles 5)
			)
			(22
				(bowHand show:)
				(bow show:)
				(arrow
					cel: 0
					posn: (+ (bowHand x?) 22) (- (bowHand y?) 106)
					show:
				)
				(= local9 1)
				(= cycles 3)
			)
			(23
				(proc0_4)
				(gIconBar disable: 0 2 3 6 7)
				(= local83 3)
				(= local82 1)
				(= local77 0)
				(self dispose:)
			)
		)
	)
)

(instance puckHasLost of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(= local10 2)
				(proc0_3)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(= cycles 5)
			)
			(1
				(bigTarget x: 159 show:)
				(adamBigArrow loop: 1 cel: 1 init:)
				([newSmallArrow_2 0] show:)
				(= cycles 20)
			)
			(2
				(proc851_0 1 @local110 @local143 0 self)
				(= cycles 1)
			)
			(3 (gClient newRoom: 320))
		)
	)
)

(instance puckHasWon of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(= local10 2)
				(proc0_3)
				(bowHand hide:)
				(bow hide:)
				(arrow hide:)
				(= cycles 5)
			)
			(1
				(bigTarget x: 159 show:)
				(splitArrow loop: 2 cel: 1 init:)
				(= cycles 8)
			)
			(2
				(drumSound play:)
				(proc851_0 1 @local130 @local143 0 self)
			)
			(3
				([newView 0] dispose:)
				([newSmallArrow_2 0] dispose:)
				([newSmallArrow 0] dispose:)
				(splitArrow hide:)
				(bigTarget hide:)
				(proc0_4)
				(gIconBar enable: 8)
				(proc806_1 200)
				(= cycles 15)
			)
			(4
				(gClient setScript: goToGoldenArrow)
			)
		)
	)
)

(instance adamShoot of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(newActor posn: 45 137 cel: 1)
				(= ticks 12)
			)
			(1
				(shootSound number: 906 play:)
				(newActor cel: 2)
				(= ticks 12)
			)
			(2
				(newActor
					posn: [local36 local11] [local39 local11]
					cel: [local71 local85]
					ignoreActors:
					setPri: 10
				)
				(= ticks 12)
			)
			(3
				(newActor hide:)
				(= arrowX (newActor x?))
				(= arrowY (newActor y?))
				((= [newView local11] (View new:))
					view: 332
					loop: 2
					cel: [local71 local85]
					posn: arrowX arrowY
					ignoreActors:
					setPri: 10
					init:
					stopUpd:
				)
				(= ticks 12)
			)
			(4
				(shootSound number: 910 play:)
				(= local6
					(+
						(/
							(* (- arrowX [local53 local85]) [local65 local85])
							10
						)
						78
					)
				)
				(= local7
					(+
						(/
							(* (- arrowY [local59 local85]) [local68 local85])
							10
						)
						147
					)
				)
				(if (== arrowY theArrowY) (= local7 (- local7 1)))
				(= theArrowY arrowY)
				((= [newView_2 local11] (View new:))
					view: 326
					loop: 1
					cel: 1
					posn: local6 local7
					setPri: 15
					signal: 16400
					init:
					hide:
				)
				(= ticks 12)
			)
			(5
				(++ local11)
				(self dispose:)
			)
		)
	)
)

(instance turnClymBill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(newActor posn: 291 143 cel: 1)
				(= ticks 12)
			)
			(1
				(shootSound number: 906 play:)
				(newActor cel: 2 posn: (newActor x?) (newActor y?))
				(= ticks 12)
			)
			(2
				(localproc_02f4)
				(newActor
					posn: local42 local43
					ignoreActors:
					cel: [local71 local85]
					setPri: 10
				)
				(= ticks 12)
			)
			(3
				(newActor hide:)
				(= arrowX (newActor x?))
				(= arrowY (newActor y?))
				((= [newView_3 local11] (View new:))
					view: 332
					loop: 1
					cel: [local71 local85]
					posn: arrowX arrowY
					ignoreActors:
					setPri: 10
					init:
					stopUpd:
				)
				(= ticks 12)
			)
			(4
				(shootSound number: 910 play:)
				(= local6
					(+
						(/
							(* (- arrowX [local56 local85]) [local65 local85])
							10
						)
						271
					)
				)
				(= local7
					(+
						(/
							(* (- arrowY [local59 local85]) [local68 local85])
							10
						)
						147
					)
				)
				(if (== arrowY theArrowY) (= local7 (- local7 1)))
				(= theArrowY arrowY)
				((= [newView_4 local11] (View new:))
					view: 326
					loop: 1
					cel: 2
					posn: local6 local7
					setPri: 15
					signal: 16400
					init:
					hide:
				)
				(= ticks 12)
			)
			(5
				(++ local11)
				(self dispose:)
			)
		)
	)
)

(instance puckCloseUpTarg of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(arrow hide:)
				(bow hide:)
				(bowHand hide:)
				(bigTarget x: 151 show:)
				(= temp0 0)
				(while (< temp0 local10)
					([newSmallArrow_2 temp0] show:)
					(++ temp0)
				)
				(= cycles 24)
			)
			(1
				(bigTarget x: 151 hide:)
				(= temp0 0)
				(while (< temp0 local10)
					([newSmallArrow_2 temp0] hide:)
					(++ temp0)
				)
				(= cycles 5)
			)
			(2
				(bow show:)
				(bowHand show:)
				(if (== local9 1) (arrow show:))
				(proc0_4)
				(gIconBar disable: 0 2 3 6 7)
				(self dispose:)
			)
		)
	)
)

(instance goToGoldenArrow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 10)
				(= ticks 24)
			)
			(1
				(proc851_0 1 @local138 @local143 0 self)
			)
			(2
				(proc0_4)
				(gClient newRoom: 320)
			)
		)
	)
)

(instance showEmptyTarget of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(arrow hide:)
				(bow hide:)
				(bowHand hide:)
				(= cycles 1)
			)
			(1
				(bigTarget x: 151 show:)
				(= cycles 3)
			)
			(2
				(if local1
					(= local1 0)
					(proc13_4 1330 16 self)
				else
					(self cue:)
				)
			)
			(3
				(bigTarget x: 151 hide:)
				(= cycles 3)
			)
			(4
				(bow show:)
				(bowHand show:)
				(if (== local9 1) (arrow show:))
				(proc0_4)
				(gIconBar disable: 0 2 3 6 7)
				(self dispose:)
			)
		)
	)
)

(instance drumSound of Sound
	(properties
		flags $0001
		number 920
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
	)
)

(instance targetArea of Feature
	(properties
		x 171
		y 136
		nsTop 64
		nsLeft 83
		nsBottom 155
		nsRight 245
		description 11273
		sightAngle 90
	)
	
	(method (init)
		(= nsTop (- 84 (* local85 10)))
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if
					(and
						local9
						(< local10 (+ 3 (* 3 local81)))
						(not (gClient script?))
					)
					(gClient setScript: fireArrow)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)
