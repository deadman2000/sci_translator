;;; Sierra Script 1.0 - (do not remove this comment)
(script# 350)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n945)
(use n946)
(use n949)
(use n950)
(use n951)
(use n970)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm350 0
)

(local
	[local0 4] = [1350 1 1]
	[local4 4] = [1350 41 1]
	[local8 4] = [1350 29 1]
	local12
	local13
	local14
	local15
	[local16 9] = [-1 11286 6]
	[local25 7] = [1350 45 2 1 1 2]
)
(instance rm350 of Rm
	(properties
		picture 350
		style $0064
		horizon 110
		north 260
		south 260
	)
	
	(method (init)
		(super init:)
		(Load rsSCRIPT 939)
		(Load rsVIEW 182)
		(cond 
			((== global130 3)
				(global10
					add: tailorWoman day9Door
					eachElementDo: #init
					eachElementDo: #approachVerbs 3 4
					doit:
				)
				(global10
					add: lobbsCover tailorCover
					eachElementDo: #init
					doit:
				)
			)
			((and (<= 5 global130) (<= global130 7))
				(lobbsCover cel: 0)
				(global10
					add: tailorWoman lobbsDoor day9Door
					eachElementDo: #init
					eachElementDo: #approachVerbs 3 4
					doit:
				)
				(global10
					add: tailorCover lobbsCover
					eachElementDo: #init
					doit:
				)
			)
			((== global130 8)
				(tailorCover cel: 1 x: 94 y: 78)
				(lobbsCover cel: 0)
				(global10
					add: tailorDoor lobbsDoor day9Door
					eachElementDo: #init
					eachElementDo: #approachVerbs 3
					doit:
				)
				(global10
					add: tailorCover lobbsCover
					eachElementDo: #init
					doit:
				)
			)
			((and (== global130 9) (not (== gNewGuise 4)))
				(tailorCover loop: 3 x: 96 y: 78)
				(swineMan init: signal: 1)
				(pig1 init:)
				(pig2 init:)
				(pig2 setScript: pigScript)
				(global10
					add: tailorDoor
					eachElementDo: #init
					eachElementDo: #approachVerbs 3
					doit:
				)
				(global10
					add: tailorCover lobbsCover
					eachElementDo: #init
					doit:
				)
			)
			(else
				(tailorCover cel: 1 x: 96 y: 78)
				(lobbsCover cel: 0)
				(global10
					add: day9Door lobbsDoor tailorDoor
					eachElementDo: #init
					eachElementDo: #approachVerbs 3
					doit:
				)
				(global10
					add: tailorCover lobbsCover
					eachElementDo: #init
					doit:
				)
			)
		)
		(proc806_3
			bucket
			leftHut
			middleHut
			rightHut
			tailorHut
			lobbsHut
		)
		(chicken init:)
		(cat init: setScript: catChickenScript)
		(if (and (== global130 9) (not (== gNewGuise 4)))
			(flyCage init:)
			(fly
				x: 120
				y: 130
				setStep: 10 8
				init:
				observeBlocks: flyCage
				setMotion: Wander 10
			)
			(fly2
				x: 125
				y: 130
				setStep: 10 8
				init:
				observeBlocks: flyCage
				setMotion: Wander 10
			)
			(if
				(and
					(== (Random 1 9) 4)
					(not (proc0_5 209))
					(not (== gNewGuise 4))
				)
				(proc0_6 209)
				(bigOlFly init: setScript: getBuggy)
			)
		)
		(proc0_2)
		(if
			(and
				(== gHeading 360)
				(not (gClient script?))
				(not (gEgo script?))
			)
			(gEgo posn: 251 145 loop: 5 init:)
		else
			(gEgo posn: 160 180 init:)
		)
		(gEgo setScript: comeIn)
		(if
			(or
				(proc999_5 global130 5 6 7)
				(== global130 8)
				(== global130 4)
			)
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init:
							197
							89
							194
							114
							188
							116
							147
							129
							84
							154
							78
							162
							66
							173
							51
							189
							0
							189
							0
							58
							177
							21
						yourself:
					)
					((Polygon new:)
						type: 2
						init:
							319
							142
							319
							189
							285
							189
							285
							177
							286
							168
							274
							165
							254
							145
							231
							142
							215
							144
							197
							135
							187
							121
							197
							118
							202
							80
						yourself:
					)
			)
		else
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init: 284 189 287 187 288 177 274 166 274 140 319 142 319 189
						yourself:
					)
					((Polygon new:)
						type: 2
						init:
							262
							146
							235
							147
							220
							147
							197
							135
							187
							121
							196
							118
							200
							97
							202
							16
							319
							73
							319
							95
							262
							116
						yourself:
					)
			)
			(if (== global130 9)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init:
								197
								89
								194
								114
								188
								116
								147
								129
								151
								146
								84
								154
								77
								155
								64
								170
								51
								189
								0
								189
								0
								58
								177
								21
							yourself:
						)
				)
			else
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init:
								197
								89
								194
								114
								188
								116
								147
								129
								84
								154
								77
								155
								64
								170
								51
								189
								0
								189
								0
								58
								177
								21
							yourself:
						)
				)
			)
		)
		(if (global10 contains: lobbsDoor)
			(gEgo observeControl: 4)
		)
	)
	
	(method (doit)
		(if (not (pig1 script?)) (pig1 setScript: pigCycle))
		(cond 
			((gEgo script?) 0)
			(
				(and
					(== global130 3)
					(& (gEgo onControl: 1) $0004)
					(== gNewGuise 1)
				)
				(gEgo setScript: enterShop)
			)
			(
				(and
					(== global130 9)
					(& (gEgo onControl: 1) $0004)
					(or (== gNewGuise 2) (== gNewGuise 3))
				)
				(gEgo setScript: enterShop)
			)
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(if (pig1 script?) (pig1 setScript: 0))
		(fly setMotion: 0)
		(fly2 setMotion: 0)
		(flyCage dispose:)
		(DisposeScript 949)
		(DisposeScript 970)
		(DisposeScript 939)
		(super dispose:)
	)
)

(instance lobbsHut of Feature
	(properties
		x 316
		y 28
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				316
				28
				316
				41
				293
				44
				283
				104
				297
				108
				295
				153
				252
				139
				230
				118
				206
				121
				205
				61
				200
				56
				240
				22
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (or (== global130 3) (== global130 9))
					(if (== gNewGuise 4)
						(proc13_4 1350 56 1)
					else
						(proc13_4 1350 62 1)
					)
				else
					(proc13_4 1350 7 1)
				)
			)
			(3
				(if (== gNewGuise 4)
					(proc13_4 1350 57 1)
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

(instance tailorHut of Feature
	(properties
		x 83
		y 24
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 2 29 83 24 134 62 130 132 64 153 64 89 1 46
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(if (proc999_5 global130 3 5 6 7)
				(proc13_4 1350 63 1)
			else
				(proc13_4 1350 9 1)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance leftHut of Feature
	(properties
		x 61
		y 50
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 1 50 61 90 57 171 36 188 1 188
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1350 10 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance middleHut of Feature
	(properties
		x 84
		y 16
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 84 21 0 26 0 16 231 22 204 48 194 40 181 112 135 129 136 56
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1350 10 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance rightHut of Feature
	(properties
		x 314
		y 46
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 314 188 297 188 307 106 287 101 297 46 317 46
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1350 10 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance bucket of Feature
	(properties
		x 223
		y 129
		nsTop 124
		nsLeft 218
		nsBottom 134
		nsRight 229
		lookStr 11
	)
)

(instance day9Door of PicView
	(properties
		x 146
		y 122
		approachX 152
		approachY 130
		lookStr 33
		view 350
		loop 2
		priority 8
		signal $4000
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1350 60 1))
			(3
				(if (!= global130 9)
					(proc13_4 1350 61 1)
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

(instance tailorDoor of PicView
	(properties
		x 81
		y 84
		approachX 84
		approachY 175
		view 350
		loop 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (proc999_5 global130 3 5 6 7)
					(proc13_4 1350 8 1)
				else
					(proc13_4 1350 9 1)
				)
			)
			(3
				(if
					(and
						(or (== global130 9) (== global130 8))
						(or (== gNewGuise 3) (== gNewGuise 2) (== gNewGuise 4))
					)
					(gEgo setHeading: 270)
					(proc13_4 1350 36 1)
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

(instance lobbsDoor of PicView
	(properties
		x 281
		y 152
		approachX 250
		approachY 157
		view 350
		signal $4000
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (or (== global130 3) (== global130 9))
					(if (== gNewGuise 4)
						(proc13_4 1350 56 1)
					else
						(proc13_4 1350 62 1)
					)
				else
					(proc13_4 1350 7 1)
				)
			)
			(3
				(cond 
					((== global130 8) (proc13_4 1350 38 1))
					((== gNewGuise 4) (proc13_4 1350 57 1))
					(
						(and
							(proc999_5 global130 5 6 7)
							(or (== gNewGuise 5) (== gNewGuise 6))
						)
						(gEgo setScript: knockLobb)
					)
					(else (super doVerb: theVerb &rest))
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobbsCover of PicView
	(properties
		x 242
		y 70
		view 350
		loop 1
		cel 1
		priority 10
		signal $0010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (or (== global130 3) (== global130 9))
					(if (== gNewGuise 4)
						(proc13_4 1350 56 1)
					else
						(proc13_4 1350 62 1)
					)
				else
					(proc13_4 1350 7 1)
				)
			)
			(3
				(if (== gNewGuise 4)
					(proc13_4 1350 57 1)
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

(instance tailorCover of PicView
	(properties
		x 95
		y 76
		view 350
		loop 3
		priority 10
		signal $0010
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(if (proc999_5 global130 3 5 6 7)
				(proc13_4 1350 63 1)
			else
				(proc13_4 1350 9 1)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance handView of Actor
	(properties
		lookStr 65
		view 182
		loop 1
		priority 15
		signal $6810
	)
)

(instance tailorWoman of View
	(properties
		x 75
		y 154
		approachX 108
		approachY 164
		view 742
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (gEgo setScript: tailorLook))
			(3
				(proc0_9 gEgo tailorWoman)
				(cond 
					((or (== gNewGuise 5) (== gNewGuise 6)) (gEgo setScript: tailorDo))
					((== gNewGuise 1)
						(proc13_6 6)
						(proc13_4 1350 44 80 {Tailor Woman})
						1
						(proc13_6 0)
					)
					(else (super doVerb: theVerb &rest))
				)
			)
			(5 (gEgo setScript: tailorTalk))
			(4
				(switch param2
					(0
						(if (>= (gMoney doit:) 1)
							(cond 
								((and (== gNewGuise 1) (== local14 0)) (= local14 1) (proc851_0 2 @local25 7 0 @local16 3))
								(
								(and (== gNewGuise 1) (== local14 1) (== local15 0))
									(= local15 1)
									(proc13_6 6)
									(proc13_4 1350 49 80 {Tailor Woman})
									(proc13_6 0)
								)
								((and (== gNewGuise 5) (== local13 0)) (= local13 1) (gEgo setScript: giveWomanMoney))
								((and (== gNewGuise 6) (== local12 0)) (= local12 1) (gEgo setScript: giveWomanMon))
								(else
									(proc13_6 6)
									(proc13_4 1350 3 80 {Tailor Woman})
									(proc13_6 0)
								)
							)
						)
					)
					(2
						(proc13_6 6)
						(proc13_4 1350 19 80 {Tailor Woman})
						(proc13_6 0)
					)
					(6
						(proc13_6 6)
						(proc13_4 1350 19 80 {Tailor Woman})
						(proc13_6 0)
					)
					(7
						(proc13_6 6)
						(proc13_4 1350 19 80 {Tailor Woman})
						(proc13_6 0)
					)
					(10
						(proc13_6 6)
						(proc13_4 1350 19 80 {Tailor Woman})
						(proc13_6 0)
					)
					(14
						(proc13_6 6)
						(proc13_4 1350 19 80 {Tailor Woman})
						(proc13_6 0)
					)
					(18
						(proc13_6 6)
						(proc13_4 1350 19 80 {Tailor Woman})
						(proc13_6 0)
					)
					(3
						(proc13_6 6)
						(proc13_4 1350 20 80 {Tailor Woman})
						(proc13_6 0)
					)
					(5
						(proc13_6 6)
						(proc13_4 1350 21 80 {Tailor Woman})
						(proc13_6 0)
					)
					(11
						(proc13_6 6)
						(proc13_4 1350 22 80 {Tailor Woman})
						(proc13_6 0)
					)
					(13
						(proc13_6 6)
						(proc13_4 1350 23 80 {Tailor Woman})
						(proc13_6 0)
					)
					(15
						(proc13_6 6)
						(proc13_4 1350 25 80 {Tailor Woman})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance swineMan of View
	(properties
		x 157
		y 115
		approachX 167
		approachY 115
		view 740
		loop 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1350 58 1))
			(5
				(gEgo setScript: talkToSwine)
			)
			(3 (proc13_4 1350 59 1))
			(4
				(cond 
					((== param2 0)
						(if
							(and
								(or (== gNewGuise 2) (== gNewGuise 3))
								(>= (gMoney doit:) 1)
							)
							(if (proc0_5 132)
								(proc13_6 6)
								(proc13_4 1350 27 80 {Swineherd})
								(proc13_6 0)
							else
								(gEgo setScript: giveManMoney)
							)
						)
					)
					((== param2 8)
						(proc13_6 6)
						(proc13_4 1350 31 80 {Swineherd})
						(proc13_6 0)
					)
					(
						(or
							(== param2 2)
							(== param2 6)
							(== param2 7)
							(== param2 10)
							(== param2 14)
							(== param2 18)
						)
						(proc13_6 6)
						(proc13_4 1350 32 80 {Swineherd})
						(proc13_6 0)
					)
					(else (super doVerb: theVerb &rest))
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fly of Actor
	(properties
		z 15
		view 370
		cel 1
		signal $6810
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1350 65 1)
		else
			(proc13_4 1350 64 1)
		)
	)
)

(instance fly2 of Actor
	(properties
		z 15
		view 370
		cel 1
		signal $6810
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1350 65 1)
		else
			(proc13_4 1350 64 1)
		)
	)
)

(instance bigOlFly of Actor
	(properties
		x 15
		y 210
		lookStr 65
		yStep 12
		view 370
		loop 2
		cel 1
		priority 15
		signal $6810
		illegalBits $0000
		xStep 18
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1350 66 1))
			(3
				(bigOlFly setScript: smashed)
			)
			(5
				(proc13_6 32)
				(proc13_4 1350 68 1)
				(proc13_6 0)
			)
			(4 (proc13_4 1350 69 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance pig1 of Actor
	(properties
		x 115
		y 144
		view 762
		loop 5
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1350 50 1))
			(3 (proc13_4 1350 51 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance pig2 of Actor
	(properties
		x 113
		y 139
		view 762
		loop 6
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1350 50 1))
			(3 (proc13_4 1350 51 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance cat of Actor
	(properties
		x 65
		y 168
		view 767
		loop 2
		cel 8
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1350 5 1))
			(3 (proc13_4 1350 70 1))
			(5
				(proc13_6 32)
				(proc13_4 1350 71 80 {Noble Feline} 1)
				(proc13_6 0)
			)
			(4 (proc13_4 1350 72 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance chicken of Actor
	(properties
		x 89
		y 186
		view 761
		loop 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1350 6 1))
			(3 (proc13_4 1350 54 1))
			(5
				(proc13_6 32)
				(proc13_4 1350 55 1 80 {Duck})
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance flyCage of Cage
	(properties)
	
	(method (init)
		(self top: 123 bottom: 148 left: 97 right: 140)
		(super init:)
	)
)

(instance enterShop of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 273 147 self)
			)
			(1 (gClient newRoom: 360))
		)
	)
)

(instance tailorLook of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_9 gEgo tailorWoman)
				(= ticks 12)
			)
			(1
				(if (proc0_5 16)
					(proc13_4 1350 12 self)
				else
					(proc13_4 1350 13 self)
					(proc0_6 16)
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance tailorTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo tailorWoman self)
			)
			(1
				(if (== global130 3) (gEgo setScript: day3Talk))
				(if
					(and
						(<= 5 global130)
						(<= (if (== global130 3) (gEgo setScript: day3Talk)) 7)
					)
					(proc13_6 6)
					(proc13_4 1350 16 self 80 {Tailor Woman})
				else
					(self cue:)
				)
			)
			(2
				(proc13_6 0)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance catChickenScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(cat setCycle: Beg)
				(catSound number: (Random 354 355) play:)
				(chickenSound play:)
				(chicken
					setLoop: 0
					setCel: 0
					setCycle: Walk
					setMotion: MoveTo 290 166 self
				)
			)
			(1
				(chicken setMotion: MoveTo 310 160 self)
			)
			(2
				(chickenSound stop:)
				(chicken dispose:)
				(catSound number: (Random 354 355) play:)
				(cat
					setLoop: 0
					setCel: 0
					setCycle: Walk
					setMotion: MoveTo 330 170 self
				)
			)
			(3 (cat hide:) (= seconds 10))
			(4
				(catSound number: (Random 354 355) play:)
				(cat
					show:
					setLoop: 1
					setCel: 0
					setCycle: Walk
					setMotion: PolyPath 65 168 self
				)
			)
			(5
				(catSound number: (Random 354 355) play:)
				(cat setLoop: 2 setCel: 0 setCycle: End self)
			)
			(6 (= seconds 10))
			(7 (cat setCycle: Beg self))
			(8
				(catSound number: (Random 354 355) play:)
				(cat
					setLoop: 0
					setCel: 0
					setCycle: Walk
					setMotion: MoveTo 330 170 self
				)
			)
			(9
				(cat dispose:)
				(self dispose:)
			)
		)
	)
)

(instance giveWomanMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= seconds 5))
			(1
				(proc13_6 6)
				(proc13_4 1350 0 80 {Tailor Woman})
				(proc13_6 0)
				(= cycles 1)
			)
			(2
				(proc851_0 @local0 999 0 self)
			)
			(3
				(proc13_6 6)
				(proc13_4 1350 2 self 80 {Tailor Woman})
				(proc13_6 0)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance giveWomanMon of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= seconds 5))
			(1
				(proc13_6 6)
				(proc13_4 1350 40 80 {Tailor Woman})
				(proc13_6 0)
				(= cycles 1)
			)
			(2
				(proc851_0 @local4 999 0 self)
			)
			(3
				(proc13_6 6)
				(proc13_4 1350 42 80 {Tailor Woman})
				(proc13_6 0)
				(= cycles 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance giveManMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= seconds 5))
			(1
				(proc0_6 132)
				(proc13_6 6)
				(proc13_4 1350 28 80 {Swineherd})
				(proc13_6 0)
				(= cycles 1)
			)
			(2
				(proc851_0 @local8 999 0 self)
			)
			(3
				(proc13_6 6)
				(proc13_4 1350 30 80 {Swineherd})
				(proc13_6 0)
				(= cycles 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance day3Talk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_6 6)
				(proc13_4 1350 14 80 {Tailor Woman})
				(= cycles 1)
			)
			(1
				(proc13_4 1350 15 80 {Tailor Woman})
				(proc13_6 0)
				(= cycles 1)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance tailorDo of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_6 6)
				(proc13_4 1350 17 80 {Tailor Woman})
				(= cycles 1)
			)
			(1
				(proc13_4 1350 18 80 {Tailor Woman})
				(proc13_6 0)
				(= cycles 1)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance knockLobb of Script
	(properties)
	
	(method (dispose)
		(knockSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setHeading: 90)
				(= ticks 180)
			)
			(1
				(knockSound play:)
				(= cycles 2)
			)
			(2
				(proc13_6 6)
				(proc13_4 1350 39 self 80 {Tailor Woman})
				(proc13_6 0)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance talkToSwine of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo swineMan self)
			)
			(1
				(proc13_6 6)
				(proc13_4 1350 26 80 {Swineherd})
				(proc13_6 0)
				(= cycles 1)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance pigCycle of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 10))
			(1
				(pig2 setCycle: CT 3 1)
				(pig1 setCycle: CT 4 1 self)
			)
			(2 (= cycles 1))
			(3
				(pig2 setCycle: CT 5 1)
				(pig1 setCycle: CT 4 1 self)
			)
			(4 (= cycles 10))
			(5
				(pig2 setCycle: CT 0 -1)
				(pig1 setCycle: CT 5 1 self)
			)
			(6 (= cycles 5))
			(7
				(pig2 setCycle: CT 4 1)
				(pig1 setCycle: CT 4 1 self)
			)
			(8
				(if (Random 0 5) (= state (- state 3)))
				(= seconds 1)
			)
			(9 (self dispose:))
		)
	)
)

(instance comeIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 160 160 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance getBuggy of Script
	(properties)
	
	(method (dispose)
		(flySound stop: dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(flySound play:)
				(bigOlFly setMotion: MoveTo 165 110 self)
			)
			(1
				(bigOlFly
					setCycle: CT (mod (+ (bigOlFly cel?) (Random 0 7)) 7) 1 self
				)
			)
			(2
				(bigOlFly
					setCel: (bigOlFly cel?)
					setCycle: 0
					heading: (* (bigOlFly cel?) 45)
					setMotion: MoveFwd 20 self
				)
			)
			(3
				(if (Random 0 5) (= state (- state 3)))
				(bigOlFly
					setCycle: CT (mod (+ (bigOlFly cel?) (Random 0 7)) 7) 1 self
				)
			)
			(4
				(bigOlFly setCycle: CT 1 1 self)
			)
			(5
				(bigOlFly setLoop: 3 setCel: 0 setCycle: End)
				(= ticks 120)
			)
			(6
				(bigOlFly setCycle: Beg self)
			)
			(7
				(bigOlFly
					setCel: (bigOlFly cel?)
					heading: 0
					setMotion: MoveTo (bigOlFly x?) -15 self
				)
			)
			(8
				(bigOlFly dispose:)
				(self dispose:)
			)
		)
	)
)

(instance smashed of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(handView x: (bigOlFly x?) y: (bigOlFly y?) init:)
				(bigOlFly view: 370 setLoop: 4 cel: 0)
				(= seconds 4)
			)
			(1
				(handView
					setMotion: MoveTo (- (handView x?) 3) (handView y?) self
				)
			)
			(2
				(handView
					setMotion: MoveTo (+ (handView x?) 6) (handView y?) self
				)
			)
			(3
				(handView
					setMotion: MoveTo (- (handView x?) 3) (handView y?) self
				)
			)
			(4
				(handView
					setMotion: MoveTo (- (handView x?) 3) (handView y?) self
				)
			)
			(5
				(handView
					setMotion: MoveTo (+ (handView x?) 6) (handView y?) self
				)
			)
			(6
				(handView
					setMotion: MoveTo (- (handView x?) 3) (handView y?) self
				)
			)
			(7
				(handView
					setMotion: MoveTo (- (handView x?) 3) (handView y?) self
				)
			)
			(8
				(handView
					setMotion: MoveTo (+ (handView x?) 6) (handView y?) self
				)
			)
			(9
				(handView
					setMotion: MoveTo (- (handView x?) 3) (handView y?) self
				)
			)
			(10
				(handView dispose:)
				(proc13_4 1350 67 self)
			)
			(11 (= ticks 6))
			(12
				(bigOlFly
					moveSpeed: 18
					setMotion: MoveTo (bigOlFly x?) 200 self
				)
			)
			(13
				(if (< (bigOlFly y?) 180)
					(= newState (- newState 2))
				else
					(self cue:)
				)
			)
			(14 (proc0_4) (self dispose:))
		)
	)
)

(instance pigScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks (Random 450 700)))
			(1
				(pigSound play:)
				(= cycles 2)
			)
			(2 (= state -1) (self cue:))
		)
	)
)

(instance catSound of Sound
	(properties
		flags $0001
	)
)

(instance chickenSound of Sound
	(properties
		flags $0001
		number 353
		loop -1
	)
)

(instance pigSound of Sound
	(properties
		flags $0001
		number 352
	)
)

(instance knockSound of Sound
	(properties
		flags $0001
		number 933
	)
)

(instance flySound of Sound
	(properties
		flags $0001
		number 363
		loop -1
	)
)
