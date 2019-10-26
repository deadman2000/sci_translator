;;; Sierra Script 1.0 - (do not remove this comment)
(script# 560)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	tunnel1 0
)

(local
	[local0 2]
	[local2 5] = [1560 1 2 1]
	[local7 9] = [1560 3 2 4 1 1 3 1]
	[local16 7] = [1560 9 1 1 2 1]
	[local23 6] = [1560 13 1 1 2]
	[local29 4] = [1560 16 1]
	[local33 9] = [1560 42 1 2 1 1 2 1]
	[local42 6] = [1560 39 1 2 1]
	[local48 3] = [-1 5558 11]
	[local51 3] = [-1 5562 12]
	[local54 3] = [-1 5566 13]
)
(procedure (localproc_000e)
	(proc13_6 11)
	(proc13_4 &rest 80 {Hal})
)

(procedure (localproc_0023)
	(proc13_6 12)
	(proc13_4 &rest 80 {Hob})
)

(procedure (localproc_0038)
	(proc13_6 13)
	(proc13_4 &rest 80 {Dicken})
)

(instance tunnel1 of Rm
	(properties
		picture 560
		style $800a
		north 561
		east 562
	)
	
	(method (init)
		(super init:)
		(DoSound 19 20)
		(gIconBar disable: 5)
		(proc806_6 0)
		(if
			(and
				(proc999_5 global130 5 6)
				(or (proc0_5 125) (proc0_5 56))
			)
			(global1 setCursor: 0 1 10 25)
			(sonHal heading: 225 loop: 2 posn: 100 155 init:)
			(sonHob heading: 180 loop: 2 posn: 130 155 init:)
			(sonDicken heading: 270 loop: 2 posn: 190 155 init:)
		)
		(switch gHeading
			(562
				(if
					(and
						(proc999_5 global130 5 6)
						(or (proc0_5 125) (proc0_5 56))
						(proc0_5 114)
					)
					(proc0_2)
					(gEgo
						setHeading: 0
						posn: 160 171
						ignoreControl: 1
						ignoreHorizon: 0
						init:
					)
					(proc0_3)
					(proc0_7 114)
					(self setScript: comeFromEstWithSons)
				else
					(proc0_2)
					(gEgo
						setHeading: 270
						posn: 283 161
						ignoreControl: 1
						ignoreHorizon: 0
						init:
					)
					(global1 setCursor: 0 1 10 25)
				)
			)
			(561
				(proc0_2)
				(gEgo
					posn: 22 160
					ignoreControl: 1
					ignoreHorizon: 0
					init:
				)
				(global1 setCursor: 0 1 10 25)
			)
			(550
				(cond 
					((not (proc0_5 107))
						(proc0_2)
						(proc0_3)
						(gEgo
							posn: 11 170
							ignoreControl: 1
							ignoreHorizon: 0
							init:
						)
						(gEgo setScript: firstInFrom550)
					)
					((proc999_5 global130 5 6)
						(if (or (proc0_5 125) (proc0_5 56))
							(proc0_2)
							(gEgo
								posn: 22 160
								ignoreControl: 1
								ignoreHorizon: 0
								init:
							)
							(gClient setScript: withSon5B6A)
						else
							(proc0_2)
							(gEgo
								loop: 0
								posn: 11 160
								ignoreControl: 1
								ignoreHorizon: 0
								init:
							)
							(global1 setCursor: 0 1 10 25)
						)
					)
					(else
						(proc0_2)
						(gEgo
							loop: 0
							posn: 11 160
							ignoreControl: 1
							ignoreHorizon: 0
							init:
							setMotion: MoveTo 100 167 self
						)
					)
				)
			)
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 3
					init: 73 158 209 158 209 153 73 153
					yourself:
				)
				((Polygon new:)
					type: 3
					init:
						24
						148
						0
						154
						0
						186
						202
						186
						276
						186
						319
						146
						211
						151
						211
						160
						66
						160
						66
						151
						40
						151
						24
						121
						14
						121
					yourself:
				)
		)
		(proc806_3
			tunnelWall
			caskArea
			eastTunlWay
			westTunlWay
			tunnelFloor
		)
		(if (!= (gRgnMusic number?) 560)
			(gRgnMusic number: 560 loop: -1 play:)
		)
		(proc0_4)
	)
	
	(method (doit)
		(if
		(and (< (gEgo x?) 10) (not (gClient script?)))
			(if
			(and (== gNewGuise 5) (or (proc0_5 125) (proc0_5 56)))
				(cond 
					((not (proc0_5 108)) (gClient setScript: caskClikFirst))
					((proc0_5 108) (gClient setScript: caskClikSecond))
					(else (gClient newRoom: 550))
				)
			else
				(gClient newRoom: 550)
			)
		)
		(if (> (gEgo x?) 290)
			(proc0_3)
			(gClient newRoom: 562)
		)
		(if (< (gEgo y?) 140)
			(proc0_3)
			(gClient newRoom: 561)
		)
		(super doit:)
	)
	
	(method (dispose)
		(DoSound 19 0)
		(super dispose: &rest)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if (== global130 10) (proc13_4 1560 25 1))
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonHal of Actor
	(properties
		x 109
		y 160
		view 434
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1560 51 1))
			(5
				(localproc_000e 1560 26 self)
				(proc13_6 0)
			)
			(3
				(proc13_4 1560 50 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_000e 1560 27 self)
						(proc13_6 0)
					)
					(2
						(localproc_000e 1560 28 self)
						(proc13_6 0)
					)
					(14
						(localproc_000e 1560 28 self)
						(proc13_6 0)
					)
					(12
						(localproc_000e 1560 29 self)
						(proc13_6 0)
					)
					(18
						(localproc_000e 1560 30 self)
						(proc13_6 0)
					)
					(10
						(localproc_000e 1560 30 self)
						(proc13_6 0)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonHob of Actor
	(properties
		x 161
		y 169
		view 434
		loop 1
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1560 51 1))
			(5
				(localproc_0023 1560 31 self)
				(proc13_6 0)
			)
			(3
				(proc13_4 1560 50 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_0023 1560 32 self)
						(proc13_6 0)
					)
					(2
						(localproc_0023 1560 33 self)
						(proc13_6 0)
					)
					(14
						(localproc_0023 1560 33 self)
						(proc13_6 0)
					)
					(12
						(localproc_0023 1560 34 self)
						(proc13_6 0)
					)
					(18
						(localproc_0023 1560 35 self)
						(proc13_6 0)
					)
					(10
						(localproc_0023 1560 35 self)
						(proc13_6 0)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonDicken of Actor
	(properties
		y 173
		view 434
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1560 51 1))
			(5
				(localproc_0038 1560 36 self)
				(proc13_6 0)
			)
			(3
				(proc13_4 1560 50 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_0038 1560 37 self)
						(proc13_6 0)
					)
					(2
						(localproc_0038 1560 38 self)
						(proc13_6 0)
					)
					(14
						(localproc_0038 1560 38 self)
						(proc13_6 0)
					)
					(12
						(gClient setScript: dickenPuzBoxTalk)
					)
					(18
						(gClient setScript: waterOrFireRingTalk)
					)
					(10
						(gClient setScript: waterOrFireRingTalk)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance cannotUsePuzbox of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 4)
			(switch param2
				(1
					(proc13_4 1560 49 self)
					(proc13_6 0)
				)
			)
		)
	)
)

(instance firstInFrom550 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 2))
			(1
				(proc0_3)
				(proc0_6 107)
				(gEgo
					ignoreActors: 1
					show:
					setMotion: MoveTo 100 160 self
				)
			)
			(2
				(proc13_6 0)
				(proc13_5 1560 0 self)
			)
			(3
				(proc0_4)
				(global1 setCursor: 0 1 10 25)
				(self dispose:)
			)
		)
	)
)

(instance withSon5B6A of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 2 @local2 9 0 @local51 1 self)
			)
			(1
				(global1 setCursor: 0 1 10 25)
				(self dispose:)
			)
		)
	)
)

(instance comeFromEstWithSons of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0
					4
					@local7
					9
					0
					@local48
					1
					@local51
					2
					@local54
					4
					self
				)
			)
			(1
				(proc0_4)
				(global1 setCursor: 0 1 10 25)
				(self dispose:)
			)
		)
	)
)

(instance caskArea of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 124 16 125 30 147 26 163 0 167
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
			(2 (proc13_4 1560 17 1))
			(3
				(if (or (proc0_5 125) (proc0_5 56))
					(gClient setScript: caskConvToSon)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance tunnelFloor of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				16
				122
				31
				122
				46
				142
				48
				148
				62
				150
				93
				155
				139
				155
				165
				147
				208
				152
				253
				149
				276
				149
				289
				150
				280
				162
				249
				157
				211
				163
				200
				170
				176
				172
				159
				183
				150
				170
				132
				166
				113
				162
				81
				174
				76
				165
				45
				160
				22
				165
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
			(2 (proc13_4 1560 48 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance caskConvToSon of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 2 @local16 9 0 @local48 1 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance caskClikFirst of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 108)
				(gEgo setMotion: PolyPath 0 173 self)
			)
			(1 (gEgo hide:) (= cycles 95))
			(2
				(gEgo loop: 0 show:)
				(= cycles 6)
			)
			(3
				(gEgo setMotion: PolyPath 90 160 self)
			)
			(4
				(proc851_0 2 @local23 9 0 @local48 1 self)
			)
			(5
				(sonHob setHeading: 270)
				(sonDicken setHeading: 270)
				(gEgo setHeading: 270)
				(= ticks 6)
			)
			(6
				(sonHob setCycle: SyncWalk setMotion: PFollow sonHal 40)
				(sonDicken
					setCycle: SyncWalk
					setMotion: PFollow sonHal 80
				)
				(sonHal setCycle: Walk setMotion: MoveTo 5 155 self)
				(gEgo setCycle: SyncWalk setMotion: PFollow sonHal 15)
			)
			(7
				(proc0_4)
				(gClient newRoom: 550)
				(self dispose:)
			)
		)
	)
)

(instance caskClikSecond of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 109)
				(gEgo setMotion: PolyPath 0 173 self)
			)
			(1 (gEgo hide:) (= cycles 95))
			(2
				(gEgo loop: 0 show:)
				(= cycles 6)
			)
			(3
				(gEgo setMotion: PolyPath 90 165 self)
			)
			(4
				(proc851_0 1 @local29 9 0 self)
			)
			(5
				(sonHob setHeading: 270)
				(sonDicken setHeading: 270)
				(gEgo setHeading: 270)
				(= ticks 6)
			)
			(6
				(sonHob setCycle: SyncWalk setMotion: PFollow sonHal 40)
				(sonDicken
					setCycle: SyncWalk
					setMotion: PFollow sonHal 80
				)
				(sonHal setCycle: Walk setMotion: MoveTo 5 155 self)
				(gEgo setCycle: SyncWalk setMotion: PFollow sonHal 15)
			)
			(7
				(proc0_4)
				(gClient newRoom: 550)
				(self dispose:)
			)
		)
	)
)

(instance eastTunlWay of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				277
				147
				280
				123
				280
				108
				281
				98
				278
				89
				277
				80
				281
				72
				290
				72
				295
				68
				305
				69
				304
				76
				305
				80
				303
				88
				305
				94
				310
				104
				308
				117
				312
				121
				303
				125
				295
				141
				292
				149
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
				(if (not (proc0_5 105))
					(proc13_4 1560 20)
					(proc13_4 1560 21 1)
				else
					(proc13_4 1560 22 1)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance westTunlWay of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				14
				120
				15
				79
				11
				74
				12
				62
				20
				51
				30
				61
				34
				63
				33
				79
				35
				84
				35
				91
				38
				98
				34
				104
				33
				118
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
				(if (not (proc0_5 106))
					(proc13_4 1560 18 1)
				else
					(proc13_4 1560 19 1)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance tunnelWall of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				319
				189
				0
				189
				0
				168
				39
				161
				54
				162
				75
				166
				81
				176
				98
				168
				118
				164
				130
				170
				139
				170
				151
				175
				156
				187
				188
				172
				202
				173
				215
				165
				230
				161
				255
				158
				282
				164
				293
				151
				300
				132
				313
				122
				310
				114
				312
				108
				305
				90
				306
				81
				305
				67
				294
				68
				279
				71
				275
				86
				279
				95
				277
				146
				221
				147
				163
				140
				159
				147
				72
				146
				35
				120
				34
				108
				38
				96
				35
				83
				35
				63
				29
				59
				21
				51
				11
				60
				13
				79
				13
				124
				0
				123
				0
				0
				319
				0
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
			(3 (proc13_4 1560 23 1))
			(2 (proc13_4 1560 24 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance waterOrFireRingTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 2 @local33 @local54 0 @local48 1 self)
			)
			(1
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance dickenPuzBoxTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 2 @local42 @local54 0 @local48 1 self)
			)
			(1
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)
