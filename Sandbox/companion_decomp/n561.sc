;;; Sierra Script 1.0 - (do not remove this comment)
(script# 561)
(include sci.sh)
(use n000)
(use n013)
(use n564)
(use n806)
(use n813)
(use n851)
(use n926)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	tunnel2 0
)

(local
	[local0 7] = [1561 0 1 2 1 1]
	[local7 4] = [1561 4 1]
	[local11 5] = [1561 5 1 2]
	[local16 4] = [1561 7 1]
	[local20 4] = [1561 8 1]
	[local24 6] = [1561 25 1 2 1]
	[local30 9] = [1561 28 1 2 1 1 2 1]
	local39
	local40
	local41
	local42
	[local43 3] = [-1 6848 11]
	[local46 3] = [-1 6852 12]
	[local49 3] = [-1 6856 13]
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

(instance tunnel2 of Rm
	(properties
		picture 561
		style $800a
	)
	
	(method (init)
		(gIconBar disable: 5)
		(= local42 global34)
		(= global34 0)
		(= local39 1)
		(DoSound 19 20)
		(if (== gNewGuise 5) (proc0_2 2 23 24) else (proc0_2))
		(proc0_4)
		(if (or (== gHeading 562) (== gHeading 460))
			(= style -16374)
			(= local41 1)
			(proc0_6 105)
			(if
				(and
					(!= global130 10)
					(or (proc0_5 125) (proc0_5 56))
				)
				(sonHal setLoop: 4 posn: 18 175 init:)
				(sonHob setLoop: 2 posn: 77 167 init:)
				(sonDicken setLoop: 0 posn: 130 155 init:)
			)
			(switch gHeading
				(562
					(if (or (proc0_5 125) (proc0_5 56))
						(gEgo posn: 130 166 init: setHeading: 180 self)
					else
						(gEgo loop: 3 posn: 90 170 init:)
					)
				)
				(460
					(gEgo loop: 2 posn: 237 134 init:)
				)
				(else 
					(gEgo posn: 235 130 init:)
				)
			)
			(theTapestry approachVerbs: 3 init: stopUpd:)
		else
			(= local40 1)
			(proc0_6 106)
			(if
				(and
					(!= global130 10)
					(or (proc0_5 125) (proc0_5 56))
				)
				(sonHal loop: 3 posn: 159 178 init: setCycle: Walk)
				(sonHob loop: 1 posn: 190 179 init: setCycle: Walk)
				(sonDicken loop: 1 posn: 223 185 init: setCycle: Walk)
			)
			(switch gHeading
				(570
					(gEgo posn: 175 155 init:)
					(if (or (proc0_5 125) (proc0_5 56))
						(TheDungeon timerHasFired: 1)
						(TheDungeon longTimerGone: 1)
						(TheDungeon guardsGone: 0)
					else
						((ScriptID 564 1) seconds: 0 state: 1)
						((ScriptID 564 3) seconds: 0 state: 1)
						(if (not ((ScriptID 564 2) seconds?))
							(TheDungeon guardsGone: 0)
						)
					)
					(gClient setScript: call565Scpt)
				)
				(560
					(global1 setCursor: 0 1 10 25)
					(if (or (proc0_5 125) (proc0_5 56))
						(gEgo
							posn: 200 170
							init:
							setMotion: PolyPath 150 160 self
						)
					else
						(gEgo posn: 247 180 init:)
					)
				)
				(else 
					(global1 setCursor: 0 1 10 25)
					(gEgo posn: 166 165 init:)
				)
			)
			(theDoor approachVerbs: 3 init: stopUpd:)
		)
		(super init:)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						0
						0
						319
						0
						319
						180
						258
						169
						224
						162
						217
						157
						202
						156
						167
						151
						159
						144
						157
						145
						135
						143
						102
						133
						67
						133
						78
						146
						102
						164
						122
						164
						154
						178
						179
						181
						212
						189
						0
						189
					yourself:
				)
		)
		(proc806_3
			westWallArea
			eastWallArea
			endWallArea
			floorArea
		)
		(if (or (== gHeading 562) (== gHeading 460))
			(proc926_1)
			(proc926_0)
		)
		(if (or (== gHeading 560) (== gHeading 570))
			(cond 
				((or (== global130 5) (== global130 6))
					(if (or (proc0_5 125) (proc0_5 56))
						(gClient setScript: westTunnelDay5_6)
					)
				)
				(
					(and
						(or (== global130 5) (== global130 6))
						(or (proc0_5 125) (proc0_5 56))
						(== gHeading 570)
					)
					(cond 
						((TheDungeon coinsLeft?) (gClient setScript: afterCoinLeft))
						((or (proc0_5 125) (proc0_5 56)) (gClient setScript: comeWithSons570))
					)
				)
			)
		)
		(if (or (== gHeading 562) (== gHeading 460))
			(cond 
				((and (== gHeading 460) (proc0_5 114))
					(cond 
						((or (proc0_5 125) (proc0_5 56)) (gClient setScript: hurryFrom460))
						((or (== global130 5) (== global130 6)) (proc13_4 1561 10 1))
					)
				)
				(
					(and
						(or (== global130 5) (== global130 6))
						(or (proc0_5 125) (proc0_5 56))
					)
					(gClient setScript: mirrorTunnelDay5_6)
				)
			)
		)
		(if (!= (gRgnMusic number?) 560)
			(gRgnMusic number: 560 loop: -1 play:)
		)
	)
	
	(method (doit)
		(if
			(and
				(or
					(>= (gEgo y?) 189)
					(<= (gEgo x?) 0)
					(>= (gEgo x?) 319)
				)
				(not (gEgo script?))
			)
			(gEgo setScript: goToTunnels)
		)
		(super doit:)
	)
	
	(method (dispose)
		(= global34 local42)
		(super dispose:)
		(DoSound 19 0)
		(DisposeScript 971)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1561 11 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonHal of Actor
	(properties
		view 434
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1561 34 1))
			(3
				(proc13_4 1561 47 self)
				(proc13_6 0)
			)
			(5
				(localproc_000e 1561 12 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_000e 1561 13 self)
						(proc13_6 0)
					)
					(2
						(localproc_000e 1561 14 self)
						(proc13_6 0)
					)
					(14
						(localproc_000e 1561 14 self)
						(proc13_6 0)
					)
					(12
						(localproc_000e 1561 15 self)
						(proc13_6 0)
					)
					(18
						(localproc_000e 1561 16 self)
						(proc13_6 0)
					)
					(10
						(localproc_000e 1561 16 self)
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
		view 434
		loop 1
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1561 34 1))
			(3
				(proc13_4 1561 47 self)
				(proc13_6 0)
			)
			(5
				(localproc_0023 1561 17 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_0023 1561 18 self)
						(proc13_6 0)
					)
					(2
						(localproc_0023 1561 19 self)
						(proc13_6 0)
					)
					(14
						(localproc_0023 1561 19 self)
						(proc13_6 0)
					)
					(12
						(localproc_0023 1561 20 self)
						(proc13_6 0)
					)
					(18
						(localproc_0023 1561 21 self)
						(proc13_6 0)
					)
					(10
						(localproc_0023 1561 21 self)
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
		view 434
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1561 34 1))
			(3
				(proc13_4 1561 47 self)
				(proc13_6 0)
			)
			(5
				(localproc_0038 1561 22 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_0038 1561 23 self)
						(proc13_6 0)
					)
					(2
						(localproc_0038 1561 24 self)
						(proc13_6 0)
					)
					(14
						(localproc_0038 1561 24 self)
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
				(1 (proc13_4 1561 46 1))
			)
		)
	)
)

(instance theDoor of Prop
	(properties
		x 97
		y 124
		approachX 80
		approachY 134
		view 561
		signal $4004
	)
	
	(method (doVerb theVerb &tmp userCurEvent)
		(switch theVerb
			(2
				(= userCurEvent (User curEvent?))
				(if
					(and
						(> 76 (userCurEvent x?))
						(> (= userCurEvent (User curEvent?)) 60)
						(> 92 (userCurEvent y?))
						(> (userCurEvent y?) 76)
					)
					(gClient setScript: call565Scpt)
				else
					(gEgo setHeading: 0)
					(if (== local40 1)
						(proc13_4 1561 35 1)
						(= local40 0)
					else
						(proc13_4 1561 36 1)
					)
				)
			)
			(3
				(gEgo setMotion: PolyPath 80 134 self)
				(gClient setScript: openDoorGoto570)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance theTapestry of Prop
	(properties
		x 261
		y 122
		approachX 239
		approachY 134
		view 561
		loop 1
		priority 9
		signal $4014
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (and (== local41 1) (not (proc0_5 29)))
					(proc13_4 1561 37 1)
					(= local41 0)
				else
					(proc13_4 1561 38 1)
				)
			)
			(3
				(if
				(and (== gNewGuise 5) (or (proc0_5 125) (proc0_5 56)))
					(self setScript: moveTapestryTo460)
				else
					(gRgnMusic fade: 0 20 12 1)
					(gClient newRoom: 460)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance westWallArea of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				0
				0
				86
				0
				86
				36
				56
				38
				45
				45
				33
				61
				31
				80
				33
				94
				37
				101
				37
				115
				37
				123
				62
				133
				73
				147
				75
				152
				88
				158
				96
				167
				102
				169
				119
				167
				136
				172
				165
				184
				189
				181
				214
				189
				0
				189
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(DoSound 19 0)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1561 39 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance eastWallArea of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				87
				0
				319
				0
				319
				173
				212
				153
				102
				128
				113
				120
				121
				91
				127
				75
				109
				47
				98
				38
				87
				36
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
			(2 (proc13_4 1561 39 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance endWallArea of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				40
				100
				35
				94
				34
				81
				35
				65
				39
				58
				46
				48
				55
				43
				66
				41
				90
				40
				107
				48
				112
				58
				123
				73
				122
				86
				117
				94
				112
				117
				107
				121
				98
				121
				98
				63
				57
				62
				58
				121
				40
				120
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
				(if (== local39 1)
					(if (or (== gHeading 560) (== gHeading 570))
						(proc13_4 1561 40)
						(proc13_4 1561 41 1)
					)
					(if (or (== gHeading 562) (== gHeading 460))
						(proc13_4 1561 42 1)
					)
					(= local39 0)
				else
					(if (or (== gHeading 560) (== gHeading 570))
						(proc13_4 1561 43 1)
					)
					(if (or (== gHeading 562) (== gHeading 460))
						(proc13_4 1561 44 1)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance floorArea of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				66
				133
				101
				131
				132
				139
				159
				144
				193
				152
				231
				160
				266
				169
				319
				178
				319
				189
				221
				189
				190
				180
				166
				182
				133
				169
				120
				165
				101
				167
				86
				153
				75
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
			(2 (proc13_4 1561 45 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance call565Scpt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 2))
			(1
				(proc0_3)
				(gEgo setMotion: PolyPath 70 133 self)
			)
			(2
				(gEgo setHeading: 0)
				(= ticks 12)
			)
			(3
				((ScriptID 565) doit:)
				(self cue:)
			)
			(4
				(proc0_4)
				(global1 setCursor: 0 1 10 25)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance goToTunnels of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion:
						PolyPath
						(if (< (gEgo x?) 160)
							(- (gEgo x?) 10)
						else
							(+ (gEgo x?) 10)
						)
						240
						self
				)
			)
			(1
				(if (< (gEgo x?) 160)
					(gClient newRoom: 562)
				else
					(gClient newRoom: 560)
				)
			)
		)
	)
)

(instance openDoorGoto570 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 5))
			(1 (theDoor setCycle: End self))
			(2
				(theDoor stopUpd:)
				(doorSound play:)
				(proc0_4)
				(gClient newRoom: 570)
			)
			(3 (self dispose:))
		)
	)
)

(instance moveTapestryTo460 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 7))
			(1 (gEgo setHeading: 180 self))
			(2
				(proc851_0 1 @local20 9 0 self)
			)
			(3 (gEgo setHeading: 0 self))
			(4
				(proc0_4)
				(gRgnMusic fade: 0 20 12 1)
				(gClient newRoom: 460)
				(self dispose:)
			)
		)
	)
)

(instance westTunnelDay5_6 of Script
	(properties
		name "westTunnelDay5&6"
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 2))
			(1
				(gEgo setMotion: PolyPath 127 154 self)
			)
			(2 (= cycles 2))
			(3 (gEgo setHeading: 180 self))
			(4
				(if (!= gHeading 570)
					(proc851_0 2 @local11 @local46 1 9 0 self)
				else
					(= ticks 6)
				)
			)
			(5
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance mirrorTunnelDay5_6 of Script
	(properties
		name "mirrorTunnelDay5&6"
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 2))
			(1
				(gEgo setMotion: PolyPath 169 161 self)
			)
			(2 (gEgo setHeading: 180 self))
			(3
				(proc851_0 1 @local16 9 0 self)
			)
			(4
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance comeWithSonsFrom560 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(sonHal loop: 3 posn: 293 189 init: setCycle: Walk)
				(sonHob loop: 3 posn: 267 189 init: setCycle: Walk)
				(sonDicken loop: 3 posn: 241 188 init: setCycle: Walk)
			)
			(1
				(gEgo setMotion: PolyPath 142 157 self)
				(sonDicken setMotion: PolyPath 156 176)
				(sonHob setMotion: PolyPath 179 179)
				(sonHal setMotion: PolyPath 211 188)
			)
			(2
				(gEgo setHeading: 180 self)
				(sonDicken setHeading: 0)
				(sonHob setHeading: 0)
				(sonHal setHeading: 0)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance comeWithSons570 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 185 168 self)
			)
			(1
				(proc851_0 2 @local0 9 0 @local43 2 self)
			)
			(2
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance hurryFrom460 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(global1 setCursor: global21 1)
				(= cycles 1)
			)
			(1
				(gEgo setMotion: PolyPath 120 170 self)
			)
			(2
				(localproc_000e 1561 9 self)
				(proc13_6 0)
			)
			(3
				(proc851_0 1 @local7 9 0 self)
			)
			(4
				(gEgo setMotion: PolyPath 50 195 self)
			)
			(5
				(proc0_4)
				(gIconBar disable: 5)
				(gClient newRoom: 562)
			)
		)
	)
)

(instance afterCoinLeft of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 80 134)
				(= cycles 10)
			)
			(1
				(proc0_4)
				(gIconBar disable: 5)
				((ScriptID 565) doit:)
				(self cue:)
			)
			(2 (self dispose:))
		)
	)
)

(instance dickenPuzBoxTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 2))
			(1
				(proc851_0 2 @local24 @local49 0 @local43 1 self)
			)
			(2
				(proc0_4)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance waterOrFireRingTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 2))
			(1
				(proc851_0 2 @local30 @local49 0 @local43 1 self)
			)
			(2
				(proc0_4)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance doorSound of Sound
	(properties
		flags $0001
		number 503
	)
)
