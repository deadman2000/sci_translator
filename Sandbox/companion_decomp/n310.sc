;;; Sierra Script 1.0 - (do not remove this comment)
(script# 310)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n812)
(use n851)
(use n946)
(use n950)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	rm310 0
)

(local
	local0
	local1
	[local2 18] = [58 0 2 4 26 40 17 31 26 42 0 2 4 25 43 18 31 29]
	[local20 4] = [1310 0 1]
	[local24 4] = [1310 1 1]
	[local28 4] = [1310 2 1]
	[local32 4] = [1310 3 1]
	[local36 8] = [1310 11 1 2 1 2 1]
	[local44 5] = [1310 16 1 2]
	[local49 5] = [1310 19 1 2]
	[local54 6] = [1310 22 2 1 2]
	[local60 12] = [1310 41 1 2 1 2 1 1 1 2 1]
	[local72 7] = [1310 59 1 1 2 1]
	[local79 12] = [1310 68 1 2 1 2 1 2 1 2 1]
	[local91 5] = [1310 85 1 2]
	[local96 5] = [1310 88 2 1]
	[local101 3] = [-1 11788 21]
	[local104 3] = [-1 11809 21]
	[local107 3] = [-1 11823 21]
	[local110 3] = [-1 11834 21]
	[local113 3] = [-1 11851 21]
	[local116 3] = [-1 11865 21]
	[local119 3] = [-1 11881 21]
	[local122 3] = [-1 11898 21]
	[local125 3] = [-1 11909 21]
)
(instance rm310 of StdRoom
	(properties
		picture 310
		style $0064
		north 260
		east 260
		south 260
		west 300
	)
	
	(method (init)
		(self setRegions: 311)
		(proc311_3)
		(if (proc999_5 gNewGuise 5 6)
			(self
				addObstacle:
					((Polygon new:)
						type: 2
						init:
							0
							189
							0
							0
							319
							0
							319
							189
							246
							189
							197
							172
							233
							166
							195
							138
							142
							154
							153
							177
							186
							189
						yourself:
					)
			)
		else
			(self
				addObstacle:
					((Polygon new:)
						type: 2
						init:
							319
							0
							319
							75
							288
							75
							288
							66
							262
							66
							262
							23
							248
							23
							209
							37
							124
							37
							109
							49
							43
							49
							0
							31
							0
							0
							259
							0
						yourself:
					)
					((Polygon new:)
						type: 2
						init:
							0
							80
							121
							80
							195
							61
							236
							61
							273
							75
							273
							96
							236
							106
							251
							120
							206
							132
							177
							136
							149
							119
							146
							123
							138
							135
							35
							135
							35
							119
							22
							104
							0
							104
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 277 168 271 181 206 181 201 168
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 319 189 273 157 278 130 319 119
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 0 189 0 184 36 184 36 189
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 65 189 65 184 187 184 187 189
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 0 133 48 147 48 157 25 157 20 152 0 152
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 254 44 230 44 230 34 254 34
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 138 139 164 139 164 149 138 149
						yourself:
					)
			)
		)
		(rugArm1 init: stopUpd:)
		(rugArm2 init: stopUpd:)
		(rugHead init: stopUpd:)
		(coryHead init: stopUpd:)
		(ear1 init: addToPic:)
		(ear2 init: addToPic:)
		(gameArm init: setScript: sRandom)
		(gNewFeatures
			add:
				person1
				person2
				person3
				person4
				person5
				person6
				person7
				person8
				person9
				person10
				person11
				person12
				person13
				person14
				person15
				person16
				person17
				person18
				person19
				person20
				person21
				person22
				gameTable
				stall
				table
				potA
				potB
				potC
				potC2
				potD
				potE
				potE2
				potF
				potF2
				potG
				potG2
				potH
				potH2
				mat
				rug1
				rug2
				rug3
				rug4
				wall
				satOnRug
				cart
				person55
				mule
			eachElementDo: #init
		)
		(if (proc999_5 gNewGuise 5 6)
			(badMonk
				init:
				view: (if (== gNewGuise 5) 129 else 128)
				setScript: sMonk
			)
			(sheriffMan1 init:)
			(sheriffMan2 init:)
			(= local1 1)
		)
		(if (or (not global198) (> global198 270))
			((ScriptID 316) init:)
		)
		(switch gHeading
			(west
				(= style 12)
				(gEgo x: (- (gEgo x?) 320))
				(super init: (gEgo edgeHit?))
				(proc0_4)
			)
			(260
				(proc0_3)
				(gEgo init: posn: 263 239 setHeading: 315)
				(self setScript: sEnter)
				(super init:)
			)
			(else 
				(proc0_3)
				(self setScript: sEnter)
				(= local0 20)
				(gPennies put: (/ local0 4))
				(gHapennies put: (/ (mod local0 4) 2))
				(gFarthings put: (mod local0 2))
				(= gNewGuise 4)
				(= global130 8)
				(proc0_6 34)
				(gEgo init: posn: 263 239 get: 17 get: 0 setHeading: 315)
				(super init:)
			)
		)
	)
	
	(method (doit)
		(cond 
			(script)
			((== (gEgo edgeHit?) 3) (proc0_3) (gClient setScript: sExitSouth))
			((== (gEgo edgeHit?) 4) (proc0_3) (gClient setScript: sExitWest))
		)
		(super doit:)
	)
)

(instance rugArm1 of Prop
	(properties
		x 177
		y 93
		view 310
		loop 1
		priority 9
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 58))
			(5
				(proc851_0 @local72 @local116 6 0 1)
			)
			(4
				(switch param2
					(0
						(proc13_6 21)
						(proc13_4 1310 63 80 {Oswald Oakhurst})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rugArm2 of Prop
	(properties
		x 188
		y 93
		view 310
		loop 2
		priority 9
		signal $4010
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 58))
			(5
				(proc851_0 @local72 @local116 6 0 1)
			)
			(4
				(switch param2
					(0
						(proc13_6 21)
						(proc13_4 1310 63 80 {Oswald Oakhurst})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rugHead of Prop
	(properties
		x 183
		y 92
		view 310
		loop 4
		priority 9
		signal $4010
		cycleSpeed 5
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 58))
			(5
				(proc851_0 @local72 @local116 6 0 1)
			)
			(4
				(switch param2
					(0
						(proc13_6 21)
						(proc13_4 1310 63 80 {Oswald Oakhurst})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance coryHead of Prop
	(properties
		x 298
		y 119
		view 310
		loop 3
		priority 14
		signal $4010
		cycleSpeed 5
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 84))
			(5
				(proc851_0 @local91 @local122 @local125 0 1)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance ear1 of View
	(properties
		x 176
		y 160
		view 310
		loop 5
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 110))
			(5
				(proc13_6 21)
				(proc13_4 1310 111 80 {Francis the Mule})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance ear2 of View
	(properties
		x 184
		y 160
		view 310
		loop 6
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 110))
			(5
				(proc13_6 21)
				(proc13_4 1310 111 80 {Francis the Mule})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance gameArm of Prop
	(properties
		x 2
		y 48
		view 310
		priority 9
		signal $4010
		cycleSpeed 5
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 25))
			(5
				(proc13_6 21)
				(proc13_4 1310 26 80 {Joshua Mandel})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person1 of Feature
	(properties
		x 26
		y 19
		nsTop 1
		nsLeft 16
		nsBottom 38
		nsRight 37
		sightAngle 90
		approachX 38
		approachY 43
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 9))
			(5 (proc13_4 1310 6 1))
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person2 of Feature
	(properties
		x 68
		y 20
		nsLeft 57
		nsBottom 41
		nsRight 79
		sightAngle 90
		approachX 85
		approachY 54
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 10))
			(5
				(if (Fair firstPickpocket?)
					(proc851_0 @local36 6 @local101 0 1)
					(Fair firstPickpocket: 0)
				else
					(proc851_0 @local44 6 @local101 0 1)
				)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person3 of Feature
	(properties
		x 101
		y 20
		nsLeft 86
		nsBottom 41
		nsRight 116
		sightAngle 90
		approachX 85
		approachY 54
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 18))
			(5
				(proc851_0 @local49 6 @local104 0 1)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person4 of Feature
	(properties
		x 173
		y 15
		nsLeft 163
		nsBottom 30
		nsRight 184
		sightAngle 90
		approachX 197
		approachY 43
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 21))
			(5
				(proc851_0 @local54 6 @local107 0 1)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person5 of Feature
	(properties
		x 8
		y 81
		z 30
		nsTop 35
		nsBottom 67
		nsRight 17
		sightAngle 90
		approachX 24
		approachY 58
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 25))
			(5
				(proc13_6 21)
				(proc13_4 1310 26 80 {Joshua Mandel})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person6 of Feature
	(properties
		x 75
		y 98
		z 20
		nsTop 52
		nsLeft 65
		nsBottom 105
		nsRight 85
		sightAngle 90
		approachX 74
		approachY 80
		_approachVerbs 20
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 27))
			(5
				(proc13_6 21)
				(proc13_4 1310 29 80 {George Bush})
				(proc13_6 0)
			)
			(3
				(proc13_6 21)
				(proc13_4 1310 28 80 {George Bush})
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person7 of Feature
	(properties
		x 88
		y 84
		z 30
		nsTop 44
		nsLeft 79
		nsBottom 65
		nsRight 97
		sightAngle 90
		approachX 74
		approachY 74
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 30))
			(5
				(proc13_6 21)
				(proc13_4 1310 31 80 {Daniel Quail})
				(proc13_4 1310 32 80 {Daniel Quail})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person8 of Feature
	(properties
		x 109
		y 93
		z 40
		nsTop 42
		nsLeft 102
		nsBottom 65
		nsRight 116
		sightAngle 90
		approachX 101
		approachY 78
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 33))
			(5
				(proc13_6 21)
				(proc13_4 1310 34 80 {Christopher Shankarmour})
				(proc13_4 1310 35 80 {Christopher Shankarmour})
				(proc13_4 1310 36 80 {Christopher Shankarmour})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person9 of Feature
	(properties
		x 243
		y 21
		nsTop -1
		nsLeft 234
		nsBottom 43
		nsRight 253
		sightAngle 90
		approachX 222
		approachY 43
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 37))
			(5
				(proc13_6 21)
				(proc13_4 1310 38 80 {Mistress Yhalkee})
				(proc13_4 1310 39 80 {Mistress Yhalkee})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person10 of Feature
	(properties
		x 281
		y 33
		nsTop 2
		nsLeft 269
		nsBottom 65
		nsRight 293
		sightAngle 90
		onMeCheck $0004
		approachX 276
		approachY 75
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 40))
			(5
				(proc13_6 21)
				(proc851_0 @local60 @local110 @local113 0 1)
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person11 of Feature
	(properties
		x 302
		y 40
		nsTop 15
		nsLeft 292
		nsBottom 66
		nsRight 312
		sightAngle 90
		approachX 276
		approachY 75
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 50))
			(5
				(proc13_6 21)
				(proc13_5 1310 51 80 {Biddy Bigears})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person12 of Feature
	(properties
		x 14
		y 120
		nsTop 93
		nsLeft 6
		nsBottom 148
		nsRight 23
		sightAngle 90
		approachX 32
		approachY 127
		_approachVerbs 16
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1310 52))
			(5
				(proc13_6 21)
				(proc13_4 1310 53 80 {Cedric Nimfadoro})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person13 of Feature
	(properties
		x 33
		y 128
		nsTop 104
		nsLeft 23
		nsBottom 152
		nsRight 43
		sightAngle 90
		approachX 32
		approachY 127
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 54))
			(5
				(proc13_6 21)
				(proc13_4 1310 55 80 {Old Gaffer})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person14 of Feature
	(properties
		x 150
		y 150
		z 30
		nsTop 94
		nsLeft 139
		nsBottom 146
		nsRight 161
		sightAngle 90
		approachX 119
		approachY 143
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 56))
			(5
				(proc13_6 21)
				(proc13_4 1310 57 80 {Patience Witzend})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person15 of Feature
	(properties
		x 181
		y 98
		nsTop 83
		nsLeft 167
		nsBottom 113
		nsRight 195
		sightAngle 90
		approachX 164
		approachY 123
		_approachVerbs 24
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 58))
			(5
				(proc851_0 @local72 @local116 6 0 1)
			)
			(4
				(switch param2
					(0
						(proc13_6 21)
						(proc13_4 1310 63 80 {Oswald Oakhurst})
						(proc13_6 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person16 of Feature
	(properties
		x 201
		y 104
		nsTop 78
		nsLeft 191
		nsBottom 130
		nsRight 212
		sightAngle 90
		approachX 174
		approachY 130
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 64))
			(5
				(proc13_6 21)
				(proc13_4 1310 65 80 {Mark Hood})
				(proc13_5 1310 66 80 {Oswald Oakhurst})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person17 of Feature
	(properties
		x 20
		y 269
		z 100
		nsTop 150
		nsLeft 6
		nsBottom 189
		nsRight 34
		sightAngle 90
		approachX 23
		approachY 179
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 67))
			(5
				(proc851_0 @local79 6 @local119 0 1)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person18 of Feature
	(properties
		x 132
		y 271
		z 100
		nsTop 154
		nsLeft 116
		nsBottom 189
		nsRight 149
		sightAngle 90
		approachX 132
		approachY 184
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 77))
			(5
				(proc13_6 21)
				(proc13_4 1310 78 80 {Wystan Wheelwright})
				(proc13_4 1310 79 80 {Wystan Wheelwright})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person19 of Feature
	(properties
		x 218
		y 259
		z 100
		nsTop 141
		nsLeft 210
		nsBottom 178
		nsRight 226
		sightAngle 90
		approachX 228
		approachY 162
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 80))
			(5
				(proc13_6 21)
				(proc13_4 1310 81 80 {Richard})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person20 of Feature
	(properties
		x 248
		y 253
		z 100
		nsTop 124
		nsLeft 226
		nsBottom 182
		nsRight 270
		sightAngle 90
		approachX 228
		approachY 162
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 82))
			(5
				(proc13_6 21)
				(proc13_4 1310 83 80 {Aaron})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person21 of Feature
	(properties
		x 299
		y 123
		nsTop 110
		nsLeft 289
		nsBottom 136
		nsRight 309
		sightAngle 90
		approachX 279
		approachY 128
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 84))
			(5
				(proc851_0 @local91 @local122 @local125 0 1)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance person22 of Feature
	(properties
		x 305
		y 105
		nsTop 81
		nsLeft 297
		nsBottom 130
		nsRight 314
		sightAngle 90
		approachX 279
		approachY 128
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 87))
			(5
				(proc851_0 @local96 @local122 @local125 0 1)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance gameTable of Feature
	(properties
		x 19
		y 62
		nsTop 53
		nsLeft 4
		nsBottom 71
		nsRight 35
		sightAngle 90
		onMeCheck $0004
		approachX 24
		approachY 58
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 90))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance stall of Feature
	(properties
		x 150
		y 86
		z 40
		nsTop 33
		nsLeft 112
		nsBottom 60
		nsRight 188
		sightAngle 90
		approachX 140
		approachY 68
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 91))
			(3 (proc13_4 1310 92))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance table of Feature
	(properties
		x 193
		y 15
		nsLeft 155
		nsBottom 31
		nsRight 231
		sightAngle 90
		approachX 197
		approachY 43
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 93))
			(3
				(proc13_6 21)
				(proc13_4 1310 94)
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mat of Feature
	(properties
		x 89
		y 117
		nsTop 101
		nsLeft 39
		nsBottom 134
		nsRight 139
		sightAngle 90
		onMeCheck $0004
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 95))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potA of Feature
	(properties
		x 107
		y 97
		nsTop 89
		nsLeft 98
		nsBottom 105
		nsRight 117
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 96))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potB of Feature
	(properties
		x 38
		y 101
		nsTop 93
		nsLeft 29
		nsBottom 110
		nsRight 48
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 97))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potC of Feature
	(properties
		x 49
		y 118
		nsTop 112
		nsLeft 43
		nsBottom 124
		nsRight 55
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 98))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potC2 of Feature
	(properties
		x 62
		y 124
		nsTop 119
		nsLeft 54
		nsBottom 130
		nsRight 70
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 98))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potD of Feature
	(properties
		x 80
		y 125
		nsTop 121
		nsLeft 72
		nsBottom 130
		nsRight 88
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 99))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potE of Feature
	(properties
		x 92
		y 102
		nsTop 99
		nsLeft 88
		nsBottom 105
		nsRight 96
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 100))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potE2 of Feature
	(properties
		x 97
		y 109
		nsTop 105
		nsLeft 91
		nsBottom 114
		nsRight 103
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 100))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potF of Feature
	(properties
		x 108
		y 116
		nsTop 111
		nsLeft 103
		nsBottom 122
		nsRight 113
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 101))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potF2 of Feature
	(properties
		x 117
		y 122
		nsTop 118
		nsLeft 110
		nsBottom 127
		nsRight 124
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 101))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potG of Feature
	(properties
		x 54
		y 107
		nsTop 104
		nsLeft 50
		nsBottom 111
		nsRight 59
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 102))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potG2 of Feature
	(properties
		x 62
		y 114
		nsTop 110
		nsLeft 58
		nsBottom 118
		nsRight 67
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 102))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potH of Feature
	(properties
		x 99
		y 123
		nsTop 120
		nsLeft 94
		nsBottom 127
		nsRight 105
		sightAngle 90
		approachX 92
		approachY 137
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 103))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance potH2 of Feature
	(properties
		x 70
		y 126
		sightAngle 45
		approachX 92
		approachY 137
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 92 105 91 111 88 112 84 109 85 103
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 103))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance wall of Feature
	(properties
		x 131
		y 74
		nsTop 48
		nsBottom 100
		nsRight 263
		sightAngle 90
		onMeCheck $0002
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(proc13_4 1310 104)
				(proc13_4 1310 105)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rug1 of Feature
	(properties
		x 165
		y 71
		nsTop 59
		nsLeft 141
		nsBottom 84
		nsRight 189
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 106))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rug2 of Feature
	(properties
		x 208
		y 60
		nsTop 52
		nsLeft 191
		nsBottom 69
		nsRight 225
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 106))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rug3 of Feature
	(properties
		x 245
		y 60
		nsTop 46
		nsLeft 231
		nsBottom 74
		nsRight 260
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 106))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rug4 of Feature
	(properties
		x 235
		y 94
		nsTop 87
		nsLeft 208
		nsBottom 102
		nsRight 262
		sightAngle 90
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 106))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance satOnRug of Feature
	(properties
		x 196
		y 114
		nsTop 102
		nsLeft 153
		nsBottom 127
		nsRight 240
		sightAngle 90
		onMeCheck $0004
		approachX 249
		approachY 111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 107))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance cart of Feature
	(properties
		x 93
		y 176
		nsTop 163
		nsLeft 57
		nsBottom 189
		nsRight 130
		sightAngle 90
		onMeCheck $0004
		approachX 111
		approachY 173
		_approachVerbs 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 108))
			(3 (proc13_4 1310 109))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mule of Feature
	(properties
		x 168
		y 273
		z 100
		nsTop 157
		nsLeft 146
		nsBottom 189
		nsRight 190
		sightAngle 90
		onMeCheck $0004
		approachX 172
		approachY 184
		_approachVerbs 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1310 110))
			(5
				(proc13_6 21)
				(proc13_4 1310 111 80 {Francis the Mule})
				(proc13_6 0)
			)
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance badMonk of Actor
	(properties
		x 325
		y 110
		signal $4800
	)
)

(instance sheriffMan1 of Actor
	(properties
		x -11
		y 175
		view 750
		signal $4800
	)
	
	(method (cue)
		(super cue:)
		(self setCel: 0 setCycle: 0)
	)
)

(instance sheriffMan2 of Actor
	(properties
		x -16
		y 162
		view 750
		signal $4800
	)
	
	(method (cue)
		(super cue:)
		(self setCel: 0 setCycle: 0)
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

(instance sMonk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds 5))
			(1
				(badMonk setCycle: Fwd setMotion: MoveTo 203 157 self)
				(sheriffMan1
					setCycle: Fwd
					setMotion: MoveTo 145 (sheriffMan1 y?) sheriffMan1
				)
				(sheriffMan2
					setCycle: Fwd
					setMotion: MoveTo 164 (sheriffMan2 y?) sheriffMan2
				)
			)
			(2
				(badMonk setCel: 0)
				(if (< (gEgo y?) 198)
					(proc0_3)
					(gEgo setHeading: 315)
					(if (== gNewGuise 5)
						(proc851_0 1 @local20 10 3 self 1)
					else
						(proc851_0 1 @local28 11 3 self 1)
					)
				else
					(self dispose:)
				)
			)
			(3
				(if (== gNewGuise 5)
					(proc851_0 1 @local24 10 3 self 1)
				else
					(proc851_0 1 @local32 11 3 self 1)
				)
			)
			(4
				(= global145 4)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance sRandom of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch (Random 0 8)
					(0 (self changeState: 5))
					(1 (self changeState: 10))
					(2 (self changeState: 15))
					(3 (self changeState: 20))
					(4 (self changeState: 40))
					(else 
						(= state -1)
						(= ticks (Random 5 20))
					)
				)
			)
			(5
				(rugHead startUpd: setCel: (Random 0 2))
				(= cycles 2)
			)
			(6
				(rugHead stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(10
				(rugArm1
					startUpd:
					cycleSpeed: (Random 10 30)
					setCycle: End self
				)
			)
			(11
				(rugArm1 cycleSpeed: (Random 10 30) setCycle: Beg self)
			)
			(12
				(rugArm1 stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(15
				(rugArm2
					startUpd:
					cycleSpeed: (Random 10 30)
					setCycle: End self
				)
			)
			(16
				(rugArm2 cycleSpeed: (Random 10 30) setCycle: Beg self)
			)
			(17
				(rugArm2 stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(20
				(coryHead startUpd: setCel: (Random 0 2))
				(= cycles 2)
			)
			(21
				(coryHead stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
			(25
				(ear1 setCel: (Random 0 2))
				(= state -1)
				(= ticks (Random 5 10))
			)
			(30
				(ear2 setCel: (Random 0 2))
				(= state -1)
				(= ticks (Random 5 10))
			)
			(40
				(gameArm
					startUpd:
					cycleSpeed: (Random 10 30)
					setCycle: End self
				)
			)
			(41
				(gameArm cycleSpeed: (Random 10 30) setCycle: Beg self)
			)
			(42
				(gameArm stopUpd:)
				(= state -1)
				(= ticks (Random 5 10))
			)
		)
	)
)

(instance sEnter of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 2))
			(1
				(gEgo setMotion: MoveTo 195 185 self)
				(gRgnMusic number: 280 loop: -1 play:)
			)
			(2
				(if (proc999_5 gNewGuise 5 6)
					(User canControl: 1 canInput: 1)
					(gIconBar enable: 0 curIcon: (gIconBar at: 0))
					(= cycles 2)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(3
				(global1 setCursor: 0 1)
				(self dispose:)
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
					(gClient newRoom: 300)
				else
					(-- state)
					(= cycles 1)
				)
			)
		)
	)
)

(instance person55 of Feature
	(properties
		x 52
		y 87
		z 30
		nsTop 47
		nsLeft 41
		nsBottom 67
		nsRight 63
		sightAngle 90
		onMeCheck $0008
		approachX 24
		approachY 58
		_approachVerbs 0
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1310 5 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)
