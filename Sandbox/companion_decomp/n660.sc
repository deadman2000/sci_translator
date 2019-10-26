;;; Sierra Script 1.0 - (do not remove this comment)
(script# 660)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n946)
(use n950)
(use n998)
(use n999)

(public
	scrolls 0
)

(local
	theGNewCast
	theGNewFeatures
	local2
	theGMH
)
(procedure (localproc_0062 param1 param2)
	(gNewCast eachElementDo: #perform hideMe)
	(= theGNewCast gNewCast)
	(= theGNewFeatures gNewFeatures)
	(= local2 global10)
	(= theGMH gMH)
	(= gMH (= gNewCast (= gNewFeatures (= global10 0))))
	(gClient drawPic: param1 param2)
	((= gNewCast newCast) add:)
	((= gNewFeatures newFeatures) add:)
	((= gMH newMDH) add: gNewFeatures)
)

(procedure (localproc_00b6)
	(gNewCast
		eachElementDo: #dispose
		eachElementDo: #delete
		release:
		dispose:
	)
	(gNewFeatures dispose:)
	(gMH dispose:)
	(gClient drawPic: (gClient picture?) 10)
	(= gNewCast theGNewCast)
	(= gNewFeatures theGNewFeatures)
	((= global10 local2) doit:)
	(= gMH theGMH)
	(gNewCast eachElementDo: #perform showMe)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMDH of EventHandler
	(properties)
)

(instance hideMe of Code
	(properties)
	
	(method (doit param1)
		(param1 z: (+ (param1 z?) 1000))
	)
)

(instance showMe of Code
	(properties)
	
	(method (doit param1)
		(param1 z: (- (param1 z?) 1000))
	)
)

(instance scrolls of Code
	(properties)
	
	(method (doit)
		((gIconBar at: 0) message: 11)
		(gIconBar disable: 3 4 5 6 7)
		(localproc_0062 660 10)
		(if (gEgo has: 17) (emptyATP init:))
		(gNewFeatures
			add:
				wholeRoom
				one
				two
				three
				four
				five
				six
				seven
				eight
				scroll1
				scroll2
				scroll3
				scroll4
				scroll5
				scroll6
				scroll7
				scroll8
				scroll9
				scroll10
				scroll11
				scroll12
				scroll13
				scroll14
				scroll15
			eachElementDo: #init
		)
	)
	
	(method (dispose)
		(localproc_00b6)
		((gIconBar at: 0) message: 1)
		(gIconBar enable: 3 6 7)
		(DisposeScript 660)
	)
)

(class scrollSlots of Feature
	(properties
		x 10
		y 10
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1660 0))
			(3 (proc13_4 1660 1))
			(11 (scrolls dispose:))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance one of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 63 40 67 40 79 50 62 63
			yourself:
		)
		(super init:)
	)
)

(instance two of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 63 83 78 94 62 108
			yourself:
		)
		(super init:)
	)
)

(instance three of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 62 126 65 128 68 136 73 138 76 135 78 137 66 146 62 146
			yourself:
		)
		(super init:)
	)
)

(instance four of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 75 146 82 140 91 146
			yourself:
		)
		(super init:)
	)
)

(instance five of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 131 145 138 139 149 146 130 146
			yourself:
		)
		(super init:)
	)
)

(instance six of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				109
				118
				114
				121
				109
				121
				108
				124
				113
				130
				124
				130
				135
				137
				124
				146
				99
				146
				88
				136
			yourself:
		)
		(super init:)
	)
)

(instance seven of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 263 40 263 74 254 83 229 64 259 40
			yourself:
		)
		(super init:)
	)
)

(instance eight of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 138 89 115 71 133 57 135 60 151 58 164 68
			yourself:
		)
		(super init:)
	)
)

(instance scroll1 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 128 40 139 47 134 50 132 50 130 52 129 55 112 69 87 51 101 40
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 1)
			)
			(3
				(gClient setScript: showScroll 0 1)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll2 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				188
				40
				194
				43
				168
				65
				166
				63
				163
				63
				159
				62
				156
				56
				137
				60
				134
				57
				131
				56
				129
				54
				131
				51
				144
				51
				144
				49
				155
				40
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 2)
			)
			(3
				(gClient setScript: showScroll 0 2)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll3 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 253 40 225 62 201 44 206 40
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 3)
			)
			(3
				(gClient setScript: showScroll 0 3)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll4 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 107 72 82 92 62 78 62 67 82 53
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 4)
			)
			(3
				(gClient setScript: showScroll 0 4)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll5 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 222 65 213 72 206 72 204 74 201 78 186 78 172 67 197 46
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 5)
			)
			(3
				(gClient setScript: showScroll 0 5)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll6 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 133 92 129 92 128 93 128 98 108 112 85 94 110 74
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 6)
			)
			(3
				(gClient setScript: showScroll 0 6)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll7 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				180
				79
				184
				87
				189
				87
				192
				89
				167
				109
				154
				101
				139
				101
				133
				103
				128
				99
				128
				94
				129
				92
				142
				92
				168
				70
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 7)
			)
			(3
				(gClient setScript: showScroll 0 7)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll8 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				251
				86
				248
				87
				226
				87
				219
				91
				208
				91
				204
				87
				184
				87
				180
				78
				202
				78
				206
				72
				218
				72
				225
				67
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 8)
			)
			(3
				(gClient setScript: showScroll 0 8)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll9 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				225
				107
				213
				99
				202
				99
				198
				97
				199
				93
				205
				92
				200
				88
				203
				87
				208
				91
				218
				91
				226
				87
				250
				87
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 9)
			)
			(3
				(gClient setScript: showScroll 0 9)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll10 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 105 115 79 136 70 137 66 132 67 124 63 121 63 112 81 97
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 10)
			)
			(3
				(gClient setScript: showScroll 0 10)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll11 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				164
				112
				139
				134
				135
				131
				113
				130
				109
				123
				122
				122
				112
				114
				130
				101
				133
				103
				138
				101
				148
				101
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 11)
			)
			(3
				(gClient setScript: showScroll 0 11)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll12 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 223 111 198 133 171 112 196 91 199 93 198 97 201 99 207 99
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 12)
			)
			(3
				(gClient setScript: showScroll 0 12)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll13 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				263
				96
				263
				128
				256
				133
				244
				123
				234
				124
				229
				121
				237
				118
				229
				111
				254
				88
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 13)
			)
			(3
				(gClient setScript: showScroll 0 13)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll14 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 194 136 184 146 156 146 142 136 167 116
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (not (gEgo has: 17))
					(gClient setScript: showScroll 0 14)
				else
					(proc13_4 1660 0)
				)
			)
			(3
				(if (not (gEgo has: 17))
					(gClient setScript: showScroll 0 14)
				else
					(proc13_4 1660 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scroll15 of scrollSlots
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				231
				119
				229
				121
				233
				125
				238
				124
				253
				137
				242
				146
				203
				146
				199
				142
				200
				136
				225
				113
			yourself:
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: showScroll 0 15)
			)
			(3
				(gClient setScript: showScroll 0 15)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance wholeRoom of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(11 (scrolls dispose:))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scrollATP of View
	(properties
		x 35
		y 35
		view 771
		cel 3
		priority 15
	)
)

(instance emptyATP of View
	(properties
		x 152
		y 138
		view 660
		priority 15
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1660 0))
			(3 (proc13_4 1660 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance showScroll of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== register 14)
					(scrollATP cel: 5 z: 0 init:)
				else
					(scrollATP cel: 3 z: 0 init:)
				)
				(= cycles 1)
			)
			(1
				(switch register
					(1
						(proc13_5 1660 2)
						(proc13_5 1660 3)
						(proc13_5 1660 4)
						(proc13_5 1660 5)
						(proc13_5 1660 6)
					)
					(2
						(proc13_5 1660 7)
						(proc13_5 1660 8)
						(proc13_5 1660 9)
						(proc13_5 1660 10)
						(proc13_5 1660 11)
						(proc13_5 1660 12)
					)
					(3
						(proc13_5 1660 13)
						(proc13_5 1660 14)
						(proc13_5 1660 15)
						(proc13_5 1660 16)
					)
					(4
						(proc13_5 1660 17)
						(proc13_5 1660 18)
						(proc13_5 1660 19)
						(proc13_5 1660 20)
						(proc13_5 1660 21)
						(proc13_5 1660 22)
					)
					(5
						(proc13_5 1660 23)
						(proc13_5 1660 24)
						(proc13_5 1660 25)
						(proc13_5 1660 26)
						(proc13_5 1660 27)
						(proc13_5 1660 28)
					)
					(6
						(proc13_5 1660 29)
						(proc13_5 1660 30)
						(proc13_5 1660 31)
						(proc13_5 1660 32)
						(proc13_5 1660 33)
					)
					(7
						(proc13_5 1660 34)
						(proc13_5 1660 35)
						(proc13_5 1660 36)
						(proc13_5 1660 37)
						(proc13_5 1660 38)
						(proc13_5 1660 39)
						(proc13_5 1660 40)
						(proc13_5 1660 41)
						(proc13_5 1660 42)
					)
					(8
						(proc13_5 1660 43)
						(proc13_5 1660 44)
						(proc13_5 1660 45)
						(proc13_5 1660 46)
						(proc13_5 1660 47)
					)
					(9
						(proc13_5 1660 48)
						(proc13_5 1660 49)
						(proc13_5 1660 50)
						(proc13_5 1660 51)
					)
					(10
						(proc13_5 1660 52)
						(proc13_5 1660 53)
						(proc13_5 1660 54)
					)
					(11
						(proc13_5 1660 55)
						(proc13_5 1660 56)
						(proc13_5 1660 57)
					)
					(12
						(proc13_5 1660 58)
						(proc13_5 1660 59)
						(proc13_5 1660 60)
						(proc13_5 1660 61)
						(proc13_5 1660 62)
						(proc13_5 1660 63)
					)
					(13
						(proc13_5 1660 64)
						(proc13_5 1660 65)
						(proc13_5 1660 66)
						(proc13_5 1660 67)
						(proc13_5 1660 68)
					)
					(14
						(proc13_5 1660 69)
						(proc13_5 1660 70)
						(emptyATP init:)
						(gEgo get: 17)
						(proc806_1 100 142)
					)
					(15
						(proc13_5 1660 71)
						(proc13_5 1660 72)
						(proc13_5 1660 73)
						(proc13_5 1660 74)
						(proc13_5 1660 75)
					)
				)
				(= cycles 1)
			)
			(2
				(scrollATP dispose:)
				(self dispose:)
			)
		)
	)
)
