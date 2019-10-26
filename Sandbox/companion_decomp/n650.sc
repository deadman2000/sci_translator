;;; Sierra Script 1.0 - (do not remove this comment)
(script# 650)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n927)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm650 0
)

(local
	local0
	theMonk
	local2
	local3
	local4
	local5
	[local6 11] = [1650 34 1 2 1 2 1 2 1 2]
	[local17 4] = [1650 50 1]
	[local21 4] = [1650 23 1]
	[local25 8] = [1650 42 1 2 1 2 1]
	[local33 6] = [1650 47 2 1 2]
	[local39 4] = [1650 29 1]
	[local43 8] = [1650 30 1 0 1650 31 1]
	[local51 4] = [1650 55 1]
	[local55 4] = [1650 56 1]
	[local59 4] = [1650 57 1]
	[local63 39] = [1650 58 1 0 1650 59 1 0 1650 60 2 1 2 1 2 0 1650 65 2 1 2 0 1650 68 2 1 2 2 0 1650 72 2 1 2 0 1650 75 1]
	[local102 8] = [1650 76 1 0 1650 77 1]
	[local110 4] = [1650 52 1]
	[local114 4] = [1650 53 1]
	[local118 4] = [1650 54 1]
	[local122 4] = [1650 78 1]
)
(instance rm650 of Rm
	(properties
		picture 650
	)
	
	(method (init)
		(super init:)
		(self
			addObstacle:
				((Polygon new:)
					type: 3
					init:
						158
						103
						120
						100
						62
						124
						47
						119
						6
						135
						6
						149
						166
						168
						173
						170
						243
						171
						233
						159
						247
						159
						247
						156
						226
						157
						223
						162
						215
						162
						202
						149
						203
						136
						223
						127
						221
						100
						170
						96
					yourself:
				)
		)
		(gEgo setScript: enterTheRoom)
		(= local4 0)
		(monk
			setCycle: Walk
			setAvoider: PAvoider
			posn: 0 145
			init:
		)
		(if (Monastery gobletTipped?)
			(goblet setPri: 15 setCel: 5 init:)
		)
		(if (== (Monastery wherePrior?) 2)
			(thePrior init: setCycle: End)
			(Monastery noPriorExperience: 0)
			(goblet setPri: 15 init:)
		)
		(if
		(and (> (Monastery wherePrior?) 2) (not (proc0_5 83)))
			(scroll cel: 2 setPri: 15 posn: 99 148 init:)
		)
		(proc806_3
			rack
			steps
			pDesk
			desk
			chest
			desk2
			candle
			fWindow
			sWindow
			floor
			walls
		)
	)
	
	(method (doit)
		(if (& (monk onControl:) $0002)
			(gEgo observeControl: 2)
		else
			(gEgo ignoreControl: 2)
		)
		(cond 
			(
				(and
					local2
					(& (gEgo onControl:) $0004)
					(!= (gEgo mover?) 0)
				)
				(gEgo setMotion: 0)
				(proc13_4 1650 51)
			)
			((and local5 (& (gEgo onControl:) $0004)) (gClient newRoom: 630))
			((and (== global115 2) (not (gEgo script?))) (gEgo setScript: burnedByFire))
		)
		(super doit:)
	)
	
	(method (dispose)
		(DisposeScript 927)
		(super dispose:)
	)
)

(instance rack of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 228 1 228 96 173 92 173 1
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (gEgo setScript: goDoIt 0 1))
			(3 (proc13_4 1650 1))
			(4
				(switch param2
					(17 (proc13_4 1650 2))
					(16 (proc13_4 1650 2))
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance steps of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 167 62 167 92 154 100 137 98 137 90 150 62
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 3))
			(3 (proc13_4 1650 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance pDesk of Feature
	(properties
		y 167
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 35 140 39 137 155 150 155 158 35 145
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(cond 
					((Monastery noPriorExperience?) (proc13_4 1650 5))
					((== (Monastery wherePrior?) 2) (proc13_4 1650 6))
					((not (proc0_5 83)) (proc13_4 1650 7))
					(else (proc13_4 1650 8))
				)
			)
			(3
				(cond 
					((Monastery noPriorExperience?) (proc13_4 1650 9))
					((== (Monastery wherePrior?) 2) (proc13_4 1650 10))
					((proc0_5 83) (proc13_4 1650 11))
				)
			)
			(4
				(switch param2
					(17 (proc13_4 1650 12))
					(16 (proc13_4 1650 12))
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance desk of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 49 93 100 79 112 90 112 100 64 119 47 115 48 93
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 13))
			(3 (proc13_4 1650 14))
			(4
				(switch param2
					(17 (proc13_4 1650 12))
					(16 (proc13_4 1650 12))
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance desk2 of Feature
	(properties
		y 132
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 254 127 251 154 226 154 214 141 211 128 228 116 237 116
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 13))
			(3 (proc13_4 1650 14))
			(4
				(switch param2
					(17 (proc13_4 1650 12))
					(16 (proc13_4 1650 12))
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance candle of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				123
				53
				124
				62
				118
				71
				117
				95
				112
				98
				111
				76
				105
				68
				110
				67
				111
				42
				114
				42
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 15))
			(3 (proc13_4 1650 16))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance chest of Feature
	(properties
		y 160
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 270 152 275 157 274 167 236 164 237 147 242 142 248 141 255 141
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 17))
			(3 (gEgo setScript: openChest))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance floor of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 115 88 227 96 227 135 274 168 35 144 34 120
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 18))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fWindow of Feature
	(properties
		y 172
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				57
				0
				42
				22
				33
				57
				35
				145
				92
				153
				181
				160
				263
				167
				289
				167
				293
				77
				290
				32
				280
				9
				271
				0
				293
				0
				300
				11
				308
				47
				303
				181
				160
				174
				16
				152
				13
				43
				15
				29
				34
				0
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 19))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance sWindow of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				235
				113
				236
				56
				239
				39
				247
				31
				255
				29
				264
				31
				271
				38
				274
				45
				277
				57
				275
				131
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (& (gEgo onControl:) $0008)
					(proc13_4 1650 20)
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

(instance walls of Feature
	(properties
		nsBottom 189
		nsRight 319
		description 8511
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1650 21))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance thePrior of Actor
	(properties
		x 93
		y 162
		view 643
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1650 22))
			(5
				(gEgo setScript: talkToPrior)
			)
			(3 (proc13_4 1650 79))
			(4 (proc13_4 1650 80))
		)
	)
)

(instance monk of Actor
	(properties
		x 200
		y 101
		view 16
		loop 3
	)
	
	(method (doVerb theVerb param2)
		(if (< (monk x?) 34)
			(walls doVerb: theVerb &rest)
		else
			(= theMonk monk)
			(switch theVerb
				(2 (proc13_4 1650 33))
				(5 (proc851_0 @local110 11))
				(3 (proc851_0 @local114 11))
				(4
					(switch param2
						(0 (proc851_0 @local118 11))
						(2
							(proc851_0 @local51 11)
							(gEgo put: 2 -1)
							(proc806_1 -200)
							(gEgo setScript: ripsOff 0 1)
						)
						(14
							(proc851_0 @local55 11)
							(gEgo put: 14 -1)
							(proc806_1 -50)
							(gEgo setScript: ripsOff 0 2)
						)
						(17
							(gEgo setScript: giveItBack 0 1)
						)
						(16
							(proc851_0 @local63 11)
							(gEgo put: 16 -1)
							(gEgo setScript: ripsOff 0 4)
						)
						(else 
							(super doVerb: theVerb param2 &rest)
						)
					)
				)
			)
		)
	)
)

(instance monk2 of Actor
	(properties
		y 145
		view 128
	)
	
	(method (doVerb theVerb param2)
		(if (< (monk2 x?) 34)
			(walls doVerb: theVerb &rest)
		else
			(= theMonk monk2)
			(switch theVerb
				(2 (proc13_4 1650 33))
				(5 (proc851_0 @local110 11))
				(3 (proc851_0 @local114 11))
				(4
					(switch param2
						(0 (proc851_0 @local118 11))
						(2
							(proc851_0 @local51 11)
							(gEgo put: 2 -1)
							(proc806_1 -200)
							(gEgo setScript: ripsOff 0 1)
						)
						(14
							(proc851_0 @local55 11)
							(gEgo put: 14 -1)
							(proc806_1 -50)
							(gEgo setScript: ripsOff 0 2)
						)
						(17
							(gEgo setScript: giveItBack 0 1)
						)
						(16
							(proc851_0 @local63 11)
							(gEgo put: 16 -1)
							(gEgo setScript: ripsOff 0 4)
						)
						(else 
							(super doVerb: theVerb param2 &rest)
						)
					)
				)
			)
		)
	)
)

(instance scroll of Prop
	(properties
		x 113
		y 152
		view 643
		loop 2
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1650 32))
			(3 (gEgo setScript: getScroll))
		)
	)
)

(instance goblet of Prop
	(properties
		x 123
		y 189
		z 36
		view 643
		loop 4
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (== (Monastery wherePrior?) 2)
					(proc13_4 1650 24)
				else
					(proc13_4 1650 25)
				)
			)
			(3
				(if (== (Monastery wherePrior?) 2)
					(gEgo setScript: goDoIt 0 0)
				else
					(proc13_4 1650 26)
				)
			)
			(4
				(switch param2
					(14
						(if (not (Monastery gobletTipped?))
							(gEgo setScript: dropStone)
						)
					)
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance openChest of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setAvoider: PAvoider)
				(gEgo setMotion: PolyPath 244 171 self)
			)
			(1
				(proc0_9 gEgo chest)
				(= cycles 3)
			)
			(2
				(proc13_4 1650 27)
				(proc0_4)
				(gEgo setAvoider: 0)
				(self dispose:)
			)
		)
	)
)

(instance enterTheRoom of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(gEgo posn: 6 145 init: setMotion: PolyPath 72 147 self)
			)
			(1
				(= local5 1)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance knockOverGoblet of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(monk setScript: 0)
				(proc0_9 gEgo thePrior)
				(thePrior setCycle: Beg self)
			)
			(1
				(scrollSound play:)
				(if (Monastery firstTimeTalk?)
					(proc851_0 @local25 8 (Monastery tPRIOR?) self)
				else
					(proc851_0 @local39 8 0 self)
				)
			)
			(2
				(thePrior setCycle: End self)
			)
			(3
				(scrollSound play:)
				(goblet setScript: tipGoblet self)
			)
			(4
				(if (Monastery firstTimeTalk?)
					(proc851_0 @local33 8 (Monastery tPRIOR?) self)
				else
					(proc851_0 @local43 (Monastery tPRIOR?) 0 self)
				)
			)
			(5
				(thePrior setScript: priorLeave self)
			)
			(6
				(if (not (Monastery firstTimeTalk?))
					(proc13_4 1650 31)
				)
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance tipGoblet of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(thePrior ignoreActors: 1)
				(gEgo setMotion: PolyPath 132 165 self)
			)
			(1 (gEgo setHeading: 180 self))
			(2
				(gEgo posn: 126 151 view: 20 loop: 0 cel: 0)
				(= ticks 6)
			)
			(3
				(gEgo setCycle: End)
				(goblet setCycle: End self)
			)
			(4
				(spillSound play:)
				(thePrior loop: 1 cel: 0)
				(scroll init:)
				(= ticks 6)
			)
			(5
				(scroll posn: 106 145)
				(thePrior setCycle: CT 1 1 self)
			)
			(6
				(scroll posn: 99 148)
				(thePrior setCycle: CT 2 1 self)
			)
			(7
				(thePrior setCycle: End)
				(scroll setCycle: End self)
			)
			(8
				(scroll y: 168 z: 20)
				(proc0_2)
				(gEgo setMotion: PolyPath 128 150 self)
			)
			(9
				(scrollSound play:)
				(gEgo setHeading: 180 self)
			)
			(10
				(Monastery gobletTipped: 1)
				(proc0_2)
				(self dispose:)
			)
		)
	)
)

(instance priorLeave of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(thePrior
					setAvoider: PAvoider
					view: 641
					setCycle: Walk
					setMotion: PolyPath -10 145 self
				)
			)
			(1
				(Monastery wherePrior: 3)
				(thePrior dispose:)
				(self dispose:)
			)
		)
	)
)

(instance talkToPrior of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_9 gEgo thePrior)
				(thePrior setCycle: Beg self)
			)
			(1
				(scrollSound play:)
				(if (Monastery firstTimeTalk?)
					(proc851_0 @local6 8 (Monastery tPRIOR?) self)
					(Monastery firstTimeTalk: 0)
				else
					(proc851_0 @local21 (Monastery tPRIOR?) 0 self)
				)
			)
			(2
				(thePrior setCycle: End self)
			)
			(3
				(scrollSound play:)
				(proc0_2)
				(self dispose:)
			)
		)
	)
)

(instance getScroll of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 109 163 self)
			)
			(1
				(gEgo view: 20 loop: 1 cel: 0)
				(= ticks 6)
			)
			(2
				(gEgo get: 16 setCycle: End self)
				(scroll hide:)
			)
			(3
				(proc0_2)
				(gEgo setMotion: MoveTo 110 160 self)
			)
			(4
				(proc806_1 150 83)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance dropStone of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(thePrior signal: 16384)
				(gEgo setMotion: PolyPath 132 165 self)
			)
			(1 (gEgo setHeading: 180 self))
			(2
				(gEgo posn: 122 149 view: 20 loop: 0 cel: 0)
				(= cycles 3)
			)
			(3 (gEgo setCycle: CT 1 1 self))
			(4
				(gEgo setCycle: CT 0 -1 self)
			)
			(5
				(thePrior loop: 1)
				(scroll setPri: 15 init:)
				(thePrior setCycle: End)
				(scroll setCycle: End)
				(gEgo
					view: 16
					setCycle: Walk
					setMotion: PolyPath 128 150 self
				)
			)
			(6
				(scrollSound play:)
				(gEgo setHeading: 180 self)
			)
			(7
				(proc851_0 @local17 (Monastery tPRIOR?) 0 self)
			)
			(8
				(monk2
					setLoop: 2
					setCycle: Walk
					init:
					setMotion: PolyPath 41 147 self
				)
				(if (< (monk y?) 145)
					(monk setScript: 0)
					(monk setMotion: PolyPath 108 140 self)
				)
			)
			(9 (= cycles 2))
			(10
				(= global145 22)
				(gClient newRoom: 170)
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance burnedByFire of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(monk setScript: 0)
				(monk2 setScript: 0)
				(thePrior setScript: 0)
				(= global145 20)
				(= cycles 1)
			)
			(1
				(gEgo setMotion: PolyPath 65 114 self)
			)
			(2
				((= local3 ((ScriptID 625 1) new:))
					view: 16
					setLoop: 0
					cel: 0
					posn: 19 138
					init:
					setAvoider: PAvoider
					setCycle: Walk
					setMotion: PolyPath 61 134 self
				)
			)
			(3
				(proc851_0 @local122 11 0 self)
			)
			(4
				(local3 view: 585 setLoop: 3 setCel: 0 setCycle: End)
				(= cycles 2)
			)
			(5
				(dieSound play:)
				(gEgo view: 22 setLoop: 2 setCel: 0 setCycle: End self)
			)
			(6 (gClient newRoom: 170))
		)
	)
)

(instance ripsOff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(monk setScript: 0)
				(monk2 setScript: 0)
				(thePrior setScript: 0)
				(theMonk
					setAvoider: PAvoider
					setMotion: PolyPath (+ (gEgo x?) 20) (+ (gEgo y?) 15) self
				)
			)
			(1
				(switch register
					(1
						(theMonk setMotion: PolyPath 6 145 self)
					)
					(2
						(theMonk setMotion: PolyPath 6 145 self)
					)
					(3
						(theMonk setMotion: PolyPath 200 101 self)
					)
					(4
						(theMonk setScript: putItBack self)
					)
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance putItBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(theMonk setMotion: MoveTo 109 163 self)
			)
			(1
				(theMonk view: 20 loop: 1 cel: 0)
				(= cycles 3)
			)
			(2
				(theMonk setCycle: End self)
				(scroll show:)
			)
			(3
				(theMonk view: 16 loop: 3 setCycle: Walk)
				(theMonk setMotion: PolyPath 6 145 self)
			)
			(4 (self dispose:))
		)
	)
)

(instance giveItBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 133 154 self)
			)
			(1
				(if register
					(proc851_0 @local59 11 0 self)
				else
					(proc851_0 @local102 (Monastery tPRIOR?) 0 self)
				)
			)
			(2
				(gEgo setMotion: MoveTo 218 110 self)
			)
			(3
				(if register
					(gEgo setScript: ripsOff 0 3)
				else
					(= cycles 1)
				)
			)
			(4
				(proc0_4)
				(gEgo put: 17 -1)
				(self dispose:)
			)
		)
	)
)

(instance goDoIt of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(switch (= state newState)
			(0 (= cycles 2) (proc0_3))
			(1
				(= temp0 (if register 190 else 140))
				(= temp1 (if register 97 else 140))
				(gEgo setMotion: PolyPath temp0 temp1 self)
			)
			(2
				(if register
					((ScriptID 660) doit:)
					(proc0_4)
				else
					(gEgo setScript: knockOverGoblet)
				)
				(= cycles 1)
			)
			(3 (self dispose:))
		)
	)
)

(instance scrollSound of Sound
	(properties
		flags $0001
		number 633
	)
)

(instance spillSound of Sound
	(properties
		flags $0001
		number 634
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
