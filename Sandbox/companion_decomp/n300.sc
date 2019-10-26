;;; Sierra Script 1.0 - (do not remove this comment)
(script# 300)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n812)
(use n851)
(use n860)
(use n946)
(use n950)
(use n992)
(use n999)

(public
	rm300 0
)

(local
	[local0 10] = [1300 14 1 1 2 2 1 2 1]
	[local10 5] = [1300 26 1 2]
	[local15 5] = [1300 123 1 2]
	[local20 14] = [1300 30 1 1 2 1 1 1 2 1 1 2 1]
	[local34 7] = [1300 49 1 1 2 1]
	[local41 11] = [1300 71 1 1 1 2 1 2 1 2]
	[local52 6] = [1300 81 1 2 2]
	[local58 9] = [1300 88 1 1 2 1 2 1]
	[local67 7] = [1300 99 1 2 1 2]
	[local74 7] = [1300 104 1 2 2 1]
	[local81 3] = [-1 11570 21]
	[local84 3] = [-1 11583 21]
	[local87 3] = [-1 11602 21]
	[local90 3] = [-1 11615 21]
	[local93 3] = [-1 11631 21]
	[local96 3] = [-1 11643 21]
	[local99 3] = [-1 11650 21]
	[local102 3] = [-1 11657 21]
	[local105 3] = [-1 11668 21]
)
(instance rm300 of StdRoom
	(properties
		picture 300
		style $000b
		north 260
		east 310
		south 260
		west 290
	)
	
	(method (init)
		(self setRegions: 311)
		(proc311_3)
		(if (< (gEgo y?) 100)
			(self
				addObstacle:
					((Polygon new:)
						type: 2
						init: 0 0 319 0 319 39 305 39 202 58 140 34 45 34 45 24 0 24
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 0 77 241 77 217 60 262 51 311 51 319 61 319 189 0 189
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 154 49 178 59 170 64 138 64 132 56
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 0 39 40 39 40 54 0 54
						yourself:
					)
			)
		else
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init: 237 182 242 175 298 175 289 189 26 189 26 182
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 0 0 319 0 319 118 121 118 83 137 0 137
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 319 124 319 138 122 138 141 124
						yourself:
					)
			)
		)
		(swordsArm init:)
		(merchantArm init: addToPic:)
		(markArm init: addToPic:)
		(furs init: approachVerbs: 3)
		(person9 init: approachVerbs: 0)
		(person11 init: approachVerbs: 0)
		(person12 init: approachVerbs: 0)
		(person14 init: approachVerbs: 0)
		(person22 init: approachVerbs: 0)
		(person23 init: approachVerbs: 0)
		(person26 init: approachVerbs: 0)
		(if (< (gEgo y?) 100)
			(sheepsArm init: approachVerbs: 0)
			(beggarArm init: approachVerbs: 0 setScript: sRandom)
			(knivesArm init: approachVerbs: 0)
			(person21 init: approachVerbs: 0)
			(person16 init: approachVerbs: 0)
			(person1 init: approachVerbs: 5)
			(person2 init: approachVerbs: 5)
			(person3 init: approachVerbs: 5)
			(person4 init: approachVerbs: 5)
			(person5 init: approachVerbs: 5)
			(person6 init: approachVerbs: 5)
			(person7 init: approachVerbs: 5)
			(person8 init: approachVerbs: 5)
			(person10 init: approachVerbs: 5 4)
			(person13 init: approachVerbs: 4 5)
			(person15 init: approachVerbs: 0)
			(person17 init: approachVerbs: 0)
			(person18 init: approachVerbs: 0)
			(person19 init: approachVerbs: 0)
			(person20 init: approachVerbs: 0)
			(person24 init: approachVerbs: 0)
			(person25 init: approachVerbs: 0)
			(person27 init: approachVerbs: 0)
			(person28 init: approachVerbs: 0)
			(table1 init: approachVerbs: 3)
		else
			(person1 init: approachVerbs: 0)
			(person2 init: approachVerbs: 0)
			(person3 init: approachVerbs: 0)
			(person4 init: approachVerbs: 0)
			(person5 init: approachVerbs: 0)
			(person6 init: approachVerbs: 0)
			(person7 init: approachVerbs: 0)
			(person8 init: approachVerbs: 0)
			(person10 init: approachVerbs: 0)
			(person13 init: approachVerbs: 0)
			(person16 init: approachVerbs: 3 5)
			(knivesArm init: approachVerbs: 5)
			(person15 init: approachVerbs: 5)
			(person17 init: approachVerbs: 5)
			(person18 init: approachVerbs: 5)
			(person19 init: approachVerbs: 5)
			(person20 init: approachVerbs: 5 4)
			(person24 init: approachVerbs: 5)
			(person25 init: approachVerbs: 5)
			(person27 init: approachVerbs: 5)
			(person28 init: approachVerbs: 5)
			(table1 init: approachVerbs: 0)
			(sheepsArm init: approachVerbs: 3 5)
			(beggarArm init: approachVerbs: 4 3 5 setScript: sRandom)
			(person21 init: approachVerbs: 4 3 5)
		)
		(gNewFeatures
			add:
				baskets
				wheel
				table2
				wall
				knives
				tools
				leather
				box
				swords
				mysteries
				mysteries2
			eachElementDo: #init
		)
		(cond 
			((== gHeading west)
				(= style 12)
				(cond 
					((and (> (gEgo y?) 38) (< (gEgo y?) 55)) (gEgo y: 55))
					((and (< (gEgo y?) 137) (> (gEgo y?) 100)) (gEgo y: 137))
				)
				(gEgo x: (- (gEgo x?) 320))
				(super init: (gEgo edgeHit?))
			)
			((== gHeading east)
				(= style 11)
				(cond 
					((and (< (gEgo y?) 138) (> (gEgo y?) 124)) (gEgo y: 138))
					((and (> (gEgo y?) 100) (< (gEgo y?) 118)) (gEgo y: 118))
					((and (< (gEgo y?) 100) (> (gEgo y?) 51)) (gEgo y: 51))
					((< (gEgo y?) 48) (gEgo y: 48))
				)
				(if (and (< (gEgo y?) 138) (> (gEgo y?) 124))
					(gEgo y: 138)
				)
				(gEgo x: (+ (gEgo x?) 320))
				(super init: (gEgo edgeHit?))
			)
			(else (= style 100) (super init:))
		)
		(proc0_4)
		(if (or (not global198) (> global198 270))
			((ScriptID 316) init:)
		)
	)
	
	(method (doit)
		(cond 
			(script)
			((== (gEgo edgeHit?) 3) (proc0_3) (gClient setScript: sExitSouth))
			((== (gEgo edgeHit?) 2) (proc0_3) (gClient setScript: sExitEast))
			((== (gEgo edgeHit?) 4) (proc0_3) (gClient setScript: sExitWest))
		)
		(super doit:)
	)
)

(instance beggarArm of FairProp
	(properties
		x 34
		y 169
		approachX 46
		approachY 182
		view 300
		loop 3
		priority 14
		signal $4010
	)
	
	(method (doVerb)
		(person21 doVerb: &rest)
	)
)

(instance sheepsArm of FairProp
	(properties
		x 143
		y 107
		approachX 156
		approachY 140
		view 300
		loop 2
		priority 11
		signal $4010
	)
	
	(method (doVerb)
		(person16 doVerb: &rest)
	)
)

(instance swordsArm of FairProp
	(properties
		x 307
		y 100
		view 300
		loop 1
		priority 11
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 70))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local41 @local93 6)
				)
			)
			(4
				(switch param2
					(0
						(proc13_6 21)
						(proc13_4 1300 79 80 {Edgar Sharp})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance merchantArm of FairProp
	(properties
		x 257
		y 41
		view 300
		loop 5
		priority 7
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 48))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local34 @local90 6)
				)
			)
			(4
				(switch param2
					(0
						(proc13_6 21)
						(proc13_4 1300 53 80 {Garrett of York})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance markArm of FairProp
	(properties
		x 248
		y 161
		view 300
		loop 4
		priority 14
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 98))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local67 @local105 @local102)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person1 of FairFeature
	(properties
		x 9
		y 25
		nsBottom 50
		nsRight 19
		sightAngle 90
		approachX 14
		approachY 55
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 6))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 7 80 {Gammer Hedda})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person2 of FairFeature
	(properties
		x 32
		y 88
		z 40
		nsTop 32
		nsLeft 25
		nsBottom 65
		nsRight 39
		sightAngle 90
		approachX 40
		approachY 56
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 8))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 9 80 {Clyde Kadiddlehopper})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person3 of FairFeature
	(properties
		x 46
		y 80
		z 30
		nsTop 34
		nsLeft 38
		nsBottom 67
		nsRight 55
		sightAngle 90
		approachX 40
		approachY 56
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 10))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 11 80 {Ichabod Idlebody})
					(proc13_4 1300 12 80 {Ichabod Idlebody})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person4 of FairFeature
	(properties
		x 65
		y 89
		z 40
		nsTop 32
		nsLeft 54
		nsBottom 67
		nsRight 76
		sightAngle 90
		approachX 40
		approachY 56
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 13))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local0 @local81 6)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person5 of FairFeature
	(properties
		x 100
		y 16
		nsTop 1
		nsLeft 91
		nsBottom 31
		nsRight 110
		sightAngle 90
		approachX 122
		approachY 34
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 21))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 22 80 {Winifred Weaver})
					(proc13_4 1300 23 80 {Winifred Weaver})
					(proc13_6 0)
					(proc13_4 1300 24)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person6 of FairFeature
	(properties
		x 154
		y 64
		z 30
		nsTop 6
		nsLeft 142
		nsBottom 63
		nsRight 166
		sightAngle 90
		onMeCheck $0010
		approachX 134
		approachY 57
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 25))
			(5
				(cond 
					((> (gEgo y?) 100) (proc13_4 1300 5))
					((> global155 42) (proc851_0 @local15 6 @local84))
					(else (proc851_0 @local10 6 @local84))
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person7 of FairFeature
	(properties
		x 176
		y 18
		nsTop -1
		nsLeft 168
		nsBottom 38
		nsRight 185
		sightAngle 90
		approachX 182
		approachY 46
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 28))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 122 80 {Mistress Hayasher})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person8 of FairFeature
	(properties
		x 185
		y 81
		z 30
		nsTop 39
		nsLeft 170
		nsBottom 63
		nsRight 201
		sightAngle 90
		onMeCheck $0008
		approachX 197
		approachY 74
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 29))
			(5
				(cond 
					((> (gEgo y?) 100) (proc13_4 1300 5))
					((Fair firstTalkMorgan?) (proc851_0 @local20 @local87 6) (Fair firstTalkMorgan: 0))
					(else
						(proc13_6 21)
						(proc13_4 1300 41 80 {Morgan Creek})
						(proc13_6 0)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person9 of FairFeature
	(properties
		x 206
		y 18
		z -10
		nsTop 3
		nsLeft 196
		nsBottom 53
		nsRight 216
		sightAngle 90
		approachX 182
		approachY 46
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 42))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person10 of FairFeature
	(properties
		x 228
		y 7
		nsLeft 218
		nsBottom 15
		nsRight 239
		sightAngle 90
		approachX 220
		approachY 45
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 43))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 44 80 {Bruce the Baker})
					(proc13_6 0)
				)
			)
			(4
				(switch param2
					(0 (proc13_4 1300 45))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person11 of FairFeature
	(properties
		x 267
		y 8
		nsLeft 254
		nsBottom 16
		nsRight 281
		sightAngle 90
		approachX 251
		approachY 45
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 46))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person12 of FairFeature
	(properties
		x 290
		y 20
		nsLeft 283
		nsBottom 40
		nsRight 297
		sightAngle 90
		approachX 251
		approachY 45
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 47))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person13 of FairFeature
	(properties
		x 262
		y 86
		z 40
		nsTop 28
		nsLeft 251
		nsBottom 65
		nsRight 273
		sightAngle 90
		onMeCheck $0008
		approachX 253
		approachY 48
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 48))
			(5
				(if (> (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local34 @local90 6)
				)
			)
			(4
				(switch param2
					(0
						(if (>= (gMoney doit:) 1)
							(proc13_6 21)
							(proc13_4 1300 53 80 {Garrett of York})
							(proc13_6 0)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person14 of FairFeature
	(properties
		x 305
		y 86
		z 40
		nsTop 32
		nsLeft 296
		nsBottom 61
		nsRight 314
		sightAngle 90
		approachX 271
		approachY 47
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 54))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance knivesArm of FairProp
	(properties
		x 27
		y 113
		approachX 52
		approachY 134
		view 300
		priority 12
		signal $4010
	)
	
	(method (doVerb)
		(person15 doVerb: &rest)
	)
)

(instance person15 of FairFeature
	(properties
		x 25
		y 110
		nsTop 92
		nsLeft 9
		nsBottom 129
		nsRight 41
		sightAngle 90
		approachX 52
		approachY 134
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 55))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 56 80 {Cuthbert Codswallop})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person16 of FairFeature
	(properties
		x 151
		y 103
		nsTop 75
		nsLeft 139
		nsBottom 131
		nsRight 164
		sightAngle 90
		approachX 156
		approachY 140
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 57))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 58 80 {Ned Courage})
					(proc13_4 1300 59 80 {Ned Courage})
					(proc13_4 1300 60 80 {Ned Courage})
					(proc13_6 0)
				)
			)
			(4
				(switch param2
					(0 (proc13_4 1300 61))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person17 of FairFeature
	(properties
		x 212
		y 119
		nsTop 104
		nsLeft 197
		nsBottom 134
		nsRight 228
		sightAngle 90
		approachX 213
		approachY 118
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 62))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 63 80 {Ned Courage})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person18 of FairFeature
	(properties
		x 249
		y 205
		z 100
		nsTop 77
		nsLeft 240
		nsBottom 133
		nsRight 258
		sightAngle 90
		approachX 267
		approachY 120
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 64))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 65 80 {Erik the Tall})
					(proc13_4 1300 66 80 {Erik the Tall})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person19 of FairFeature
	(properties
		x 273
		y 223
		z 100
		nsTop 111
		nsLeft 259
		nsBottom 136
		nsRight 288
		sightAngle 90
		approachX 267
		approachY 120
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 67))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 68 80 {Lester Luskin})
					(proc13_4 1300 69 80 {Lester Luskin})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person20 of FairFeature
	(properties
		x 302
		y 154
		z 50
		nsTop 76
		nsLeft 289
		nsBottom 132
		nsRight 316
		sightAngle 90
		approachX 267
		approachY 120
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 70))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local41 @local93 6)
				)
			)
			(4
				(switch param2
					(0
						(if (>= (gMoney doit:) 1)
							(proc13_6 21)
							(proc13_4 1300 79 80 {Edgar Sharp})
							(proc13_6 0)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person21 of FairFeature
	(properties
		x 44
		y 266
		z 100
		nsTop 143
		nsLeft 27
		nsBottom 189
		nsRight 61
		sightAngle 90
		approachX 46
		approachY 182
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 80))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local52 6 @local96)
				)
			)
			(4
				(switch param2
					(0
						(if (>= (gMoney doit:) 1)
							(proc13_6 21)
							(proc13_4 1300 84 80 {Beggar})
							(proc13_6 0)
							(proc806_1 10 150)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person22 of FairFeature
	(properties
		x 86
		y 268
		z 100
		nsTop 147
		nsLeft 76
		nsBottom 189
		nsRight 97
		sightAngle 90
		approachX 94
		approachY 166
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 85))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person23 of FairFeature
	(properties
		x 108
		y 266
		z 100
		nsTop 144
		nsLeft 95
		nsBottom 189
		nsRight 122
		sightAngle 90
		approachX 94
		approachY 166
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 86))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person24 of FairFeature
	(properties
		x 164
		y 280
		z 100
		nsTop 171
		nsLeft 151
		nsBottom 189
		nsRight 178
		sightAngle 90
		approachX 163
		approachY 183
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 87))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc0_3)
					(gClient setScript: talkScript)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person25 of FairFeature
	(properties
		x 209
		y 271
		z 100
		nsTop 154
		nsLeft 196
		nsBottom 189
		nsRight 222
		sightAngle 90
		approachX 221
		approachY 177
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 95))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc13_6 21)
					(proc13_4 1300 96 80 {Rowena Sly})
					(proc13_6 0)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person26 of FairFeature
	(properties
		x 237
		y 272
		z 100
		nsTop 156
		nsLeft 223
		nsBottom 189
		nsRight 252
		sightAngle 90
		approachX 221
		approachY 177
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 97))
			(5 (proc13_4 1300 2 1))
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person27 of FairFeature
	(properties
		x 257
		y 267
		z 100
		nsTop 146
		nsLeft 245
		nsBottom 189
		nsRight 269
		sightAngle 90
		approachX 267
		approachY 171
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 98))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local67 @local105 @local102)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person28 of FairFeature
	(properties
		x 276
		y 270
		z 100
		nsTop 152
		nsLeft 264
		nsBottom 189
		nsRight 289
		sightAngle 90
		approachX 267
		approachY 171
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 103))
			(5
				(if (< (gEgo y?) 100)
					(proc13_4 1300 5)
				else
					(proc851_0 @local74 @local102 @local105)
				)
			)
			(3 (proc13_4 1300 1 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance baskets of FairFeature
	(properties
		x 94
		y 15
		nsTop -1
		nsLeft 48
		nsBottom 32
		nsRight 141
		sightAngle 90
		approachX 121
		approachY 35
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 108))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance wheel of FairFeature
	(properties
		x 105
		y 82
		z 30
		nsTop 38
		nsLeft 78
		nsBottom 66
		nsRight 133
		sightAngle 90
		onMeCheck $0004
		approachX 76
		approachY 64
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 109))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance table1 of FairFeature
	(properties
		x 222
		y 23
		nsLeft 155
		nsBottom 47
		nsRight 290
		sightAngle 90
		onMeCheck $0004
		approachX 180
		approachY 45
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 110))
			(3
				(proc13_6 21)
				(proc13_4 1300 111 80 {Bruce the Baker})
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance table2 of FairFeature
	(properties
		x 274
		y 35
		z -20
		nsTop 42
		nsLeft 230
		nsBottom 68
		nsRight 319
		sightAngle 90
		approachX 271
		approachY 47
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 112))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance wall of Feature
	(properties
		x 159
		y 82
		nsTop 63
		nsBottom 102
		nsRight 319
		sightAngle 45
		onMeCheck $0002
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 113))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance knives of FairFeature
	(properties
		x 23
		y 89
		nsTop 73
		nsLeft 2
		nsBottom 106
		nsRight 45
		sightAngle 90
		approachX 52
		approachY 134
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 114))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance tools of FairFeature
	(properties
		x 72
		y 102
		nsTop 73
		nsLeft 47
		nsBottom 131
		nsRight 98
		sightAngle 90
		onMeCheck $0004
		approachX 52
		approachY 134
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 115))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance furs of Feature
	(properties
		x 148
		y 84
		nsTop 58
		nsLeft 98
		nsBottom 110
		nsRight 199
		sightAngle 90
		onMeCheck $0020
		approachX 120
		approachY 116
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 116))
			(3
				(proc13_6 21)
				(proc13_4 1300 117 80 {Ned Courage})
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance leather of FairFeature
	(properties
		x 215
		y 74
		nsTop 61
		nsLeft 187
		nsBottom 87
		nsRight 243
		sightAngle 90
		approachX 214
		approachY 78
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 118))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance box of FairFeature
	(properties
		x 215
		y 101
		sightAngle 45
		approachX 201
		approachY 111
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 234 94 239 100 197 101 193 96
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 119))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance swords of FairFeature
	(properties
		x 270
		y 93
		nsTop 71
		nsLeft 238
		nsBottom 116
		nsRight 303
		sightAngle 90
		approachX 234
		approachY 116
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 120))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mysteries of FairFeature
	(properties
		x 131
		y 179
		nsTop 169
		nsLeft 100
		nsBottom 189
		nsRight 162
		sightAngle 90
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 121))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mysteries2 of FairFeature
	(properties
		x 183
		y 177
		nsTop 166
		nsLeft 157
		nsBottom 188
		nsRight 210
		sightAngle 90
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1300 121))
			(else 
				(super doVerb: theVerb &rest)
			)
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

(instance sRandom of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch (Random 0 3)
					(0 (self changeState: 10))
					(1 (self changeState: 20))
					(2 (self changeState: 30))
					(3 (self changeState: 40))
					(4 (self changeState: 60))
					(5 (self changeState: 50))
				)
			)
			(10
				(beggarArm
					startUpd:
					cycleSpeed: (Random 5 15)
					setCycle: End self
				)
			)
			(11 (= cycles (Random 5 20)))
			(12
				(beggarArm cycleSpeed: (Random 5 15) setCycle: Beg self)
			)
			(13
				(beggarArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(20
				(knivesArm
					startUpd:
					cycleSpeed: (Random 5 20)
					setCycle: End self
				)
			)
			(21 (= cycles (Random 5 20)))
			(22
				(knivesArm cycleSpeed: (Random 5 20) setCycle: Beg self)
			)
			(23
				(knivesArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(30
				(sheepsArm startUpd: setCycle: End self)
			)
			(31 (= cycles (Random 5 20)))
			(32
				(sheepsArm setCycle: Beg self)
			)
			(33
				(sheepsArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(40
				(swordsArm
					startUpd:
					cycleSpeed: (Random 5 10)
					setCycle: End self
				)
			)
			(41 (= cycles (Random 5 20)))
			(42
				(swordsArm cycleSpeed: (Random 5 10) setCycle: Beg self)
			)
			(43
				(swordsArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(50
				(merchantArm
					startUpd:
					cycleSpeed: (Random 5 10)
					setCycle: End self
				)
			)
			(51 (= cycles (Random 5 20)))
			(52
				(merchantArm
					cycleSpeed: (Random 5 10)
					setCycle: Beg self
				)
			)
			(53
				(merchantArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(60
				(markArm
					startUpd:
					cycleSpeed: (Random 5 10)
					setCycle: End self
				)
			)
			(61 (= cycles (Random 5 20)))
			(62
				(markArm cycleSpeed: (Random 5 10) setCycle: Beg self)
			)
			(63
				(markArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
		)
	)
)

(instance talkScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 @local58 @local99 6 self)
			)
			(1 (proc13_4 1300 94 self))
			(2 (proc0_4) (self dispose:))
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
					(gClient newRoom: 310)
				else
					(-- state)
					(= cycles 1)
				)
			)
		)
	)
)

(instance sExitWest of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo -15 (gEgo y?) self)
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
