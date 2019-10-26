;;; Sierra Script 1.0 - (do not remove this comment)
(script# 280)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n812)
(use n851)
(use n939)
(use n945)
(use n946)
(use n950)
(use n992)
(use n998)
(use n999)

(public
	rm280 0
)

(local
	local0
	[local1 5] = [1280 54 1 2]
	[local6 7] = [1280 6 1 2 2 2]
	[local13 7] = [1280 13 1 1 1 1]
	[local20 8] = [1280 19 1 2 2 1 2]
	[local28 4] = [1280 24 2]
	[local32 7] = [1280 25 2 1 1 2]
	[local39 4] = [1280 29 2]
	[local43 4] = [1280 30 2]
	[local47 10] = [1280 31 2 1 2 2 1 2 2]
	[local57 9] = [1280 40 1 2 1 2 1 2]
	[local66 5] = [1280 48 1 2]
	[local71 6] = [1280 83 2 1 2]
	[local77 6] = [1280 86 2 1 2]
	[local83 7] = [1280 91 1 2 1 2]
	[local90 6] = [1280 96 1 2 2]
	[local96 7] = [1280 105 1 2 1 2]
	[local103 8] = [1280 115 1 2 1 2 1]
	[local111 5] = [1280 120 1 2]
	[local116 10] = [1280 127 2 1 2 2 2 2 2]
	[local126 13] = [1280 138 1 2 2 2 1 0 1280 149 1 2]
	[local139 10] = [1280 51 1 2 0 1280 52 1 2]
	[local149 16] = [1280 58 2 1 2 1 2 2 2 2 2 1 2 2 2]
	[local165 8] = [1280 76 1 2 1 2 1]
	[local173 4] = [1280 81 1]
	[local177 6] = [1280 111 1 1 1]
	[local183 3] = [-1 9396 21]
	[local186 3] = [-1 9417 21]
	[local189 3] = [-1 9430 21]
	[local192 3] = [-1 9444 21]
	[local195 3] = [-1 9459 21]
	[local198 3] = [-1 9469 21]
	[local201 3] = [-1 9479 21]
	[local204 3] = [-1 9492 21]
	[local207 3] = [-1 9497 21]
	[local210 3] = [-1 9506 21]
	[local213 3] = [-1 9513 21]
	[local216 3] = [-1 9520 21]
	[local219 3] = [-1 9528 21]
	[local222 3] = [-1 9536 21]
	[local225 3] = [-1 9547 21]
)
(procedure (localproc_000e)
	(proc13_6 21)
	(proc13_4 &rest 80 {Myrddin})
)

(procedure (localproc_0023)
	(proc13_6 21)
	(proc13_4 &rest 80 {Cook})
)

(procedure (localproc_0038)
	(proc13_6 21)
	(proc13_4 &rest 80 {John Chapman})
)

(procedure (localproc_004d)
	(proc13_6 21)
	(proc13_4 &rest 67 90 100 80 {Beggar})
)

(procedure (localproc_0069)
	(proc13_6 21)
	(proc13_4 &rest 80 {Confustis Obscuratus})
)

(instance rm280 of StdRoom
	(properties
		picture 280
		style $0064
		horizon 1
		north 260
		east 290
		south 260
		west 320
	)
	
	(method (init)
		(self setRegions: 311)
		(proc311_3)
		(self
			addObstacle:
				((Polygon new:)
					type: 2
					init: 320 49 242 49 242 40 0 40 0 0 320 0
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 143 54 10 54 10 50 143 50
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						281
						117
						292
						117
						292
						127
						920
						127
						920
						147
						287
						147
						274
						152
						133
						152
						137
						141
						95
						141
						69
						126
						69
						117
						224
						117
						241
						134
						257
						117
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						920
						103
						244
						103
						234
						111
						65
						111
						57
						123
						3
						123
						3
						90
						251
						90
						251
						75
						920
						75
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 91 154 18 154 18 142 91 142 97 148
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 185 133 185 147 175 196 175 204 186 220 175 285 175 285 189 0 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 142 58 246 58 246 80 142 80
					yourself:
				)
		)
		(beggarHead setCycle: Fwd init:)
		(drinkerHand setCycle: Fwd init:)
		(fire setCycle: Fwd init:)
		(smoke setCycle: Fwd init:)
		(fortuneTeller init: approachVerbs: 3 5 4)
		(fortuneTellerBooth init: approachVerbs: 3 5 4)
		(person24 init: approachVerbs: 5 4)
		(person20 init: approachVerbs: 5)
		(person26 init: approachVerbs: 5)
		(person19 init: approachVerbs: 5)
		(proc806_3
			person1
			person2
			person3
			person4
			person5
			person7
			person8
			person9
			person10
			person11
			person12
			person13
			person16
			person17
			person18
			person22
			person23
			person25
			dogUnderTable
			rectanglObject
			garlic
			cauldron
			lowerRightTable
			silkScarves
			theFence
			bigKeg
			barrels
			smallCask
			largeDog
			rugs
		)
		(if (or (not global198) (> global198 270))
			((ScriptID 316) init:)
		)
		(if (== gHeading east)
			(= style 11)
			(if (< (gEgo y?) 49) (gEgo y: 49))
			(gEgo x: (+ (gEgo x?) 320))
			(super init: (gEgo edgeHit?))
			(proc0_4)
		else
			(proc0_3)
			(gEgo posn: -10 160)
			(gClient setScript: sEnterWest)
			(gRgnMusic fade: 127 30 8 0)
			(super init:)
		)
	)
	
	(method (doit)
		(cond 
			(script)
			((== (gEgo edgeHit?) 3) (proc0_3) (gClient setScript: sExitSouth))
			((== (gEgo edgeHit?) 2) (proc0_3) (gClient setScript: sExitEast))
		)
		(super doit:)
	)
)

(instance smoke of Prop
	(properties
		x 274
		y 116
		view 280
		loop 4
		priority 10
		signal $4010
		cycleSpeed 24
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 160))
			(3
				(localproc_0023 1280 161 self)
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance beggarHead of Prop
	(properties
		x 169
		y 192
		approachX 143
		approachY 179
		view 280
		loop 1
		cel 5
		cycleSpeed 26
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 126))
			(5
				(if (Fair firstClikMan24?)
					(proc851_0 2 @local116 6 0 @local213 1 0 1)
					(Fair firstClikMan24: 0)
				else
					(proc13_4 1280 134)
				)
			)
			(4
				(switch param2
					(0
						(if (>= (gMoney doit:) 1)
							(gClient setScript: giveMoneyToBeg)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance drinkerHand of Prop
	(properties
		x 77
		y 110
		approachX 106
		approachY 150
		view 280
		loop 2
		priority 12
		signal $4010
		cycleSpeed 28
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 90))
			(5
				(if (Fair firstClickMan13?)
					(proc851_0 2 @local83 6 0 @local201 2 0 1)
					(Fair firstClickMan13: 0)
				else
					(localproc_0038 1280 95 self)
					(proc13_6 0)
				)
			)
			(4
				(switch param2
					(0
						(proc851_0 2 @local90 6 0 @local201 2 0 1)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fire of Prop
	(properties
		x 274
		y 142
		view 280
		loop 3
		cel 2
		signal $4000
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 160))
			(3
				(localproc_0023 1280 161 self)
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person1 of Feature
	(properties
		x 42
		y 28
		nsTop 6
		nsLeft 33
		nsBottom 51
		nsRight 52
		sightAngle 90
		approachX 36
		approachY 57
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 5))
			(5
				(proc851_0 2 @local6 6 0 @local183 2 0 1)
			)
			(4
				(switch param2
					(0
						(localproc_0069 1280 10)
						(proc13_6 0)
						(proc13_4 1280 11)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person2 of Feature
	(properties
		x 85
		y 29
		nsTop 6
		nsLeft 76
		nsBottom 52
		nsRight 95
		sightAngle 90
		approachX 84
		approachY 60
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 12))
			(5
				(proc851_0 1 @local13 @local186 0 0 1)
			)
			(4
				(switch param2
					(0 (proc13_4 1280 17))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person3 of Feature
	(properties
		x 46
		y 89
		z 40
		nsTop 36
		nsLeft 36
		nsBottom 62
		nsRight 56
		sightAngle 90
		approachX 47
		approachY 74
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 18))
			(5
				(cond 
					((not (proc0_5 156))
						(if (Fair firstClickF3Talk?)
							(proc851_0 2 @local20 6 0 @local189 2 0 1)
							(Fair firstClickF3Talk: 0)
						else
							(proc851_0 2 @local28 6 0 @local189 2 0 1)
						)
					)
					((proc0_5 156)
						(if (Fair firstClickF3Talk?)
							(proc851_0 2 @local32 6 0 @local189 2 0 1)
							(Fair firstClickF3Talk: 0)
						else
							(proc851_0 2 @local39 6 0 @local189 2 0 1)
						)
					)
				)
			)
			(4
				(switch param2
					(0
						(if (not (proc0_5 156))
							(if (< (gMoney doit:) 6)
								(gMoney put:)
								(proc851_0 2 @local43 6 0 @local189 2 0 1)
							else
								(proc0_6 156)
								(proc806_1 25)
								(proc851_0 2 @local47 6 0 @local189 2 0 1)
							)
						else
							(proc13_4 1280 38)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person4 of Feature
	(properties
		x 96
		y 155
		z 100
		nsTop 49
		nsLeft 84
		nsBottom 61
		nsRight 109
		sightAngle 90
		approachX 104
		approachY 68
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 39))
			(5
				(if (Fair man4FirstClickTk?)
					(proc851_0 2 @local57 6 0 @local192 2 0 1)
					(Fair talkedWithMan4: 1)
				else
					(proc13_4 1280 46)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person5 of Feature
	(properties
		x 116
		y 151
		z 100
		nsTop 40
		nsLeft 105
		nsBottom 62
		nsRight 128
		sightAngle 90
		approachX 104
		approachY 68
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 47))
			(5
				(if (Fair talkedWithMan4?)
					(proc851_0 2 @local66 6 0 @local195 2 0 1)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person7 of Feature
	(properties
		x 271
		y 26
		nsTop 3
		nsLeft 261
		nsBottom 50
		nsRight 281
		sightAngle 90
		approachX 258
		approachY 53
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 73))
			(5 (proc13_4 1280 2 1))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person8 of Feature
	(properties
		x 300
		y 25
		nsTop 1
		nsLeft 285
		nsBottom 49
		nsRight 315
		sightAngle 90
		approachX 314
		approachY 57
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 74))
			(5 (proc13_4 1280 2 1))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person9 of Feature
	(properties
		x 275
		y 149
		z 100
		nsTop 33
		nsLeft 265
		nsBottom 65
		nsRight 285
		sightAngle 90
		approachX 286
		approachY 76
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 75))
			(5
				(gClient setScript: talkPerson9)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person10 of Feature
	(properties
		x 299
		y 149
		z 100
		nsTop 34
		nsLeft 285
		nsBottom 64
		nsRight 314
		sightAngle 90
		approachX 286
		approachY 76
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 75))
			(5
				(gClient setScript: talkWithPerson10)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person11 of Feature
	(properties
		x 37
		y 123
		nsTop 97
		nsLeft 24
		nsBottom 149
		nsRight 51
		sightAngle 90
		approachX 20
		approachY 156
		_approachVerbs 20
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 82))
			(3
				(proc851_0 2 @local71 6 0 @local198 2 0 1)
			)
			(5
				(proc851_0 2 @local77 6 0 @local198 2 0 1)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person12 of Feature
	(properties
		x 54
		y 126
		nsTop 101
		nsLeft 45
		nsBottom 151
		nsRight 63
		sightAngle 90
		approachX 41
		approachY 158
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 89))
			(5 (proc13_4 1280 2 1))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person13 of Feature
	(properties
		x 80
		y 124
		nsTop 96
		nsLeft 70
		nsBottom 152
		nsRight 91
		sightAngle 90
		approachX 106
		approachY 150
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 90))
			(5
				(if (Fair firstClickMan13?)
					(proc851_0 2 @local83 6 0 @local201 2 0 1)
					(Fair firstClickMan13: 0)
				else
					(localproc_0038 1280 95)
					(proc13_6 0)
				)
			)
			(4
				(switch param2
					(0
						(proc851_0 2 @local90 6 0 @local201 2 0 1)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person16 of Feature
	(properties
		x 215
		y 128
		nsTop 111
		nsLeft 197
		nsBottom 146
		nsRight 233
		sightAngle 90
		approachX 204
		approachY 159
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 100))
			(5 (proc13_4 1280 101))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person17 of Feature
	(properties
		x 216
		y 96
		nsTop 83
		nsLeft 198
		nsBottom 109
		nsRight 235
		sightAngle 90
		approachX 242
		approachY 113
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 102))
			(5 (proc13_4 1280 103))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person18 of Feature
	(properties
		x 258
		y 124
		nsTop 98
		nsLeft 248
		nsBottom 150
		nsRight 268
		sightAngle 90
		approachX 286
		approachY 148
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 104))
			(5
				(proc851_0 2 @local96 6 0 @local204 2 0 1)
			)
			(4
				(switch param2
					(0
						(localproc_0023 1280 109)
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person19 of Feature
	(properties
		x 298
		y 120
		nsTop 99
		nsLeft 285
		nsBottom 141
		nsRight 311
		sightAngle 90
		approachX 301
		approachY 147
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 110))
			(5
				(proc851_0 1 @local177 @local207 0 0 1)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person20 of Feature
	(properties
		x 43
		y 274
		z 100
		nsTop 160
		nsLeft 27
		nsBottom 189
		nsRight 60
		sightAngle 90
		approachX 40
		approachY 183
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 114))
			(5
				(if (Fair firstClickMan20?)
					(proc851_0 2 @local103 6 0 @local210 2 0 1)
					(Fair firstClickMan20: 0)
				else
					(proc851_0 2 @local111 6 0 @local210 2 0 1)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person22 of Feature
	(properties
		x 115
		y 173
		nsTop 158
		nsLeft 105
		nsBottom 189
		nsRight 125
		sightAngle 90
		approachX 126
		approachY 188
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 124))
			(5 (proc13_4 1280 2 1))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person23 of Feature
	(properties
		x 136
		y 176
		nsTop 163
		nsLeft 126
		nsBottom 189
		nsRight 147
		sightAngle 90
		approachX 126
		approachY 188
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 125))
			(5 (proc13_4 1280 2 1))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person24 of Feature
	(properties
		x 169
		y 278
		z 100
		nsTop 167
		nsLeft 144
		nsBottom 189
		nsRight 194
		sightAngle 90
		approachX 174
		approachY 175
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 126))
			(5
				(if (Fair firstClikMan24?)
					(proc851_0 2 @local116 6 0 @local213 1 0 1)
					(Fair firstClikMan24: 0)
				else
					(proc13_4 1280 134)
				)
			)
			(4
				(switch param2
					(0
						(if (>= (gMoney doit:) 1)
							(gClient setScript: giveMoneyToBeg)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person25 of Feature
	(properties
		x 236
		y 170
		nsTop 164
		nsLeft 221
		nsBottom 177
		nsRight 251
		sightAngle 90
		approachX 254
		approachY 178
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 136))
			(5 (proc13_4 1280 2 1))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person26 of Feature
	(properties
		x 268
		y 275
		z 100
		nsTop 162
		nsLeft 255
		nsBottom 189
		nsRight 282
		sightAngle 90
		approachX 269
		approachY 175
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 137))
			(5
				(if (Fair firstClickF26?)
					(proc851_0 2 @local126 6 0 @local216 1 0 1)
					(Fair firstClickF26: 0)
				else
					(proc13_4 1280 143)
				)
			)
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance dogUnderTable of Feature
	(properties
		x 188
		y 143
		nsTop 136
		nsLeft 177
		nsBottom 150
		nsRight 200
		sightAngle 90
		approachX 176
		approachY 158
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 99))
			(3 (proc13_4 1280 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rectanglObject of Feature
	(properties
		x 23
		y 30
		nsTop 7
		nsLeft 13
		nsBottom 53
		nsRight 34
		sightAngle 90
		approachX 14
		approachY 61
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 144))
			(3 (proc13_4 1280 145))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garlic of Feature
	(properties
		x 124
		y 14
		nsLeft 111
		nsBottom 29
		nsRight 137
		sightAngle 90
		approachX 113
		approachY 57
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 146))
			(3 (proc13_4 1280 147))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance cauldron of Feature
	(properties
		x 277
		y 127
		nsTop 114
		nsLeft 264
		nsBottom 141
		nsRight 291
		sightAngle 90
		approachX 291
		approachY 146
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 160))
			(3
				(localproc_0023 1280 161)
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lowerRightTable of Feature
	(properties
		x 235
		y 181
		nsTop 174
		nsLeft 211
		nsBottom 189
		nsRight 259
		sightAngle 90
		approachX 254
		approachY 178
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 162))
			(3 (proc13_4 1280 163))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance silkScarves of Feature
	(properties
		x 48
		y 172
		z 100
		nsTop 59
		nsLeft 18
		nsBottom 85
		nsRight 78
		sightAngle 90
		approachX 2
		approachY 89
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 153))
			(3 (proc13_4 1280 154))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theFence of Feature
	(properties
		x 166
		y 80
		nsTop 59
		nsLeft 14
		nsBottom 102
		nsRight 319
		sightAngle 90
		onMeCheck $0002
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(proc13_4 1280 151)
				(proc13_4 1280 152)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bigKeg of Feature
	(properties
		x 106
		y 123
		z 20
		nsTop 75
		nsLeft 78
		nsBottom 131
		nsRight 135
		sightAngle 90
		approachX 131
		approachY 141
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 155))
			(3 (proc13_4 1280 156))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance barrels of Feature
	(properties
		x 160
		y 95
		nsTop 84
		nsLeft 140
		nsBottom 107
		nsRight 180
		sightAngle 90
		approachX 131
		approachY 141
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 157))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance smallCask of Feature
	(properties
		x 191
		y 106
		z 4
		nsTop 97
		nsLeft 185
		nsBottom 107
		nsRight 198
		sightAngle 90
		approachX 242
		approachY 113
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 158))
			(3 (proc13_4 1280 159))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance largeDog of Feature
	(properties
		x 79
		y 175
		nsTop 161
		nsLeft 68
		nsBottom 189
		nsRight 91
		sightAngle 90
		approachX 96
		approachY 179
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 122))
			(3 (proc13_4 1280 123))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fortuneConv of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 157)
				(= ticks 12)
			)
			(1
				(localproc_000e 1280 57 self)
				(proc13_6 0)
			)
			(2
				(fortuneTeller setCycle: Osc 3 self)
			)
			(3
				(proc851_0 2 @local149 6 0 @local219 2 self 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance giveMoneyToBeg of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (not (proc0_5 158)) (proc806_1 10) (proc0_6 158))
				(= ticks 12)
			)
			(1
				(gEgo setMotion: PolyPath 154 177 self)
			)
			(2
				(gEgo
					view: 52
					posn: (gEgo x?) (gEgo y?)
					setCycle: Beg self
				)
			)
			(3
				(localproc_004d 1280 135 self)
				(proc13_6 0)
			)
			(4
				(proc0_4)
				(proc0_2)
				(self dispose:)
			)
		)
	)
)

(instance talkPerson9 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 12))
			(1
				(proc851_0 2 @local165 @local222 1 @local225 2 self 1)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance talkWithPerson10 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 12))
			(1
				(proc851_0 1 @local173 @local225 0 self 1)
			)
			(2
				(proc851_0 2 @local165 @local222 1 @local225 2 self 1)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance sExitSouth of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (> (gEgo x?) 187)
					(gEgo
						setMotion: MoveTo (+ (gEgo x?) 40) (+ (gEgo y?) 60) self
					)
				else
					(gEgo
						setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 60) self
					)
				)
			)
			(1 (gClient newRoom: 260))
		)
	)
)

(instance fortuneTeller of Actor
	(properties
		x 189
		y 42
		nsTop 23
		nsLeft 173
		nsBottom 43
		nsRight 196
		approachX 185
		approachY 83
		view 280
		priority 4
		signal $4010
		cycleSpeed 24
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 50))
			(3
				(proc851_0 2 @local139 6 0 @local219 2 0 1)
			)
			(5
				(if (not local0)
					(localproc_000e 1280 53 self)
					(proc13_6 0)
				else
					(proc851_0 2 @local1 6 0 @local219 2 0 1)
				)
			)
			(4
				(switch param2
					(0
						(if (not (proc0_5 157))
							(if (< (gMoney doit:) 2)
								(gMoney put:)
								(localproc_000e 1280 56 self)
								(proc13_6 0)
							else
								(proc806_1 25)
								(= local0 1)
								(gClient setScript: fortuneConv)
							)
						else
							(localproc_000e 1280 71 self)
							(proc13_6 0)
						)
					)
					(17
						(localproc_000e 1280 72 self)
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

(instance fortuneTellerBooth of Feature
	(properties
		x 194
		y 32
		nsLeft 155
		nsBottom 65
		nsRight 233
		sightAngle 90
		approachX 185
		approachY 83
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1280 148))
			(else 
				(fortuneTeller doVerb: theVerb &rest)
			)
		)
	)
)

(instance rugs of Feature
	(properties
		x 31
		y 108
		nsTop 90
		nsLeft 1
		nsBottom 127
		nsRight 62
		sightAngle 90
		onMeCheck $0004
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1280 164))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance sEnterWest of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: MoveTo 15 (gEgo y?) self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance sExitEast of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 335 (gEgo y?) self)
			)
			(1
				(if (not (Fair walkingOut?))
					(gClient newRoom: 290)
				else
					(-- state)
					(= cycles 1)
				)
			)
		)
	)
)
