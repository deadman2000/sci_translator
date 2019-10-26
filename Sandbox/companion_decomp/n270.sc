;;; Sierra Script 1.0 - (do not remove this comment)
(script# 270)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
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
	rm270 0
)

(local
	[local0 4] = [1270 0 1]
	local4
)
(instance rm270 of Rm
	(properties
		picture 270
		style $0064
	)
	
	(method (init)
		(super init:)
		(proc0_3)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						140
						154
						134
						156
						119
						158
						114
						161
						106
						160
						95
						164
						101
						176
						112
						176
						118
						172
						122
						173
						126
						169
						136
						169
						145
						170
						153
						176
						153
						182
						149
						188
						147
						189
						0
						189
						0
						0
						319
						0
						319
						163
						312
						161
						308
						160
						239
						147
						243
						153
						253
						156
						237
						158
						230
						162
						214
						161
						206
						159
						188
						158
						171
						156
						160
						154
						154
						153
						153
						146
						146
						145
						146
						153
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						167
						171
						169
						162
						192
						164
						211
						169
						220
						179
						188
						185
						190
						189
						168
						189
						169
						185
						173
						184
						174
						179
						182
						177
						186
						178
						187
						175
						176
						175
						175
						173
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						235
						166
						240
						163
						245
						164
						249
						169
						260
						167
						272
						166
						276
						168
						279
						163
						285
						163
						319
						172
						319
						189
						306
						189
						303
						187
						293
						183
						287
						182
						277
						180
						272
						173
						260
						173
						258
						177
						249
						181
						239
						181
						234
						174
						227
						173
						214
						163
					yourself:
				)
		)
		(proc806_3 bluff egg pub castle town everything)
		(alice setPri: 14 posn: 96 21 init:)
		(if (== global130 8)
			(door init: addToPic:)
		else
			(smokeOne setPri: 15 setCycle: Fwd cycleSpeed: 12 init:)
		)
		(gSFX number: 905 loop: -1 play:)
		(if (and (proc0_5 125) (not (proc0_5 175)))
			(proc0_6 175)
			(hal init:)
			(hob init:)
			(dicken init:)
			(gEgo
				view: 50
				posn: 152 153
				init:
				normal: 0
				moveHead: 0
				setCycle: Walk
				setScript: saved
			)
		else
			(gEgo
				view:
					(switch gNewGuise
						(0 67)
						(1 69)
						(2 74)
						(3 74)
						(4 68)
						(5 50)
						(6 48)
					)
				x: (if (== gHeading 530) 162 else 245)
				y: (if (== gHeading 530) 155 else 160)
				setHeading: (if (== gHeading 530) 90 else 270)
				actions: egoActions
				init:
				normal: 0
				moveHead: 0
				setCycle: Walk
			)
			(proc0_4)
		)
		(gEgo setStep: 2 1)
	)
	
	(method (doit)
		(cond 
			(
				(and
					(& (gEgo onControl: 1) $0004)
					(not (gEgo script?))
				)
				(gClient newRoom: 260)
			)
			(
				(and
					(& (gEgo onControl: 1) $0002)
					(not (gEgo script?))
					(!= global130 8)
				)
				(gClient newRoom: 530)
			)
			(
				(or
					(== ((User alterEgo?) edgeHit?) 2)
					(== ((User alterEgo?) edgeHit?) 3)
				)
				(gClient newRoom: 260)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX stop:)
		(super dispose: &rest)
	)
)

(instance smokeOne of Prop
	(properties
		x 140
		y 126
		view 529
		loop 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1270 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance door of View
	(properties
		x 150
		y 152
		view 529
		loop 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1270 3))
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(3 (gEgo setScript: tryToEnter))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance egg of Feature
	(properties
		x 10
		y 10
		nsTop 16
		nsLeft 95
		nsBottom 19
		nsRight 97
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1270 5))
			(3 (alice setScript: launch))
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bluff of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				0
				71
				12
				71
				16
				68
				17
				66
				18
				60
				23
				62
				30
				66
				33
				69
				40
				66
				58
				69
				76
				71
				77
				69
				89
				69
				91
				71
				98
				69
				104
				68
				113
				71
				115
				71
				119
				69
				130
				69
				136
				66
				141
				66
				145
				61
				148
				64
				155
				67
				166
				68
				177
				66
				182
				63
				189
				68
				190
				73
				216
				115
				237
				142
				252
				151
				252
				154
				250
				155
				238
				156
				226
				160
				213
				160
				207
				156
				196
				157
				192
				155
				166
				154
				162
				152
				166
				131
				155
				122
				135
				130
				140
				152
				135
				155
				123
				154
				108
				158
				97
				160
				91
				163
				98
				173
				95
				175
				88
				176
				67
				179
				78
				184
				82
				189
				0
				189
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1270 1))
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance pub of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 135 130 154 122 166 131 161 153 140 153
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (!= global130 8)
					(proc13_4 1270 2)
				else
					(proc13_4 1270 3)
				)
			)
			(3
				(if (== global130 8)
					(gEgo setScript: tryToEnter)
				else
					(gEgo setMotion: PolyPath 152 153)
				)
			)
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance castle of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				0
				71
				0
				4
				19
				4
				19
				10
				30
				10
				31
				10
				31
				7
				66
				7
				66
				11
				137
				11
				137
				8
				134
				7
				134
				4
				184
				4
				183
				9
				182
				9
				182
				64
				168
				67
				160
				67
				154
				66
				144
				61
				141
				66
				134
				66
				131
				69
				118
				69
				114
				71
				112
				71
				104
				68
				100
				68
				91
				71
				89
				69
				75
				69
				75
				71
				71
				70
				38
				66
				32
				69
				27
				64
				18
				61
				17
				65
				12
				71
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1270 5))
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance town of Feature
	(properties
		x 10
		y 10
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 319 47 319 142 232 134 219 119 191 75 189 67 182 63 182 47
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1270 6))
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance everything of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10
				(if (== gNewGuise 0)
					(proc13_4 1270 7)
				else
					(proc13_4 1270 8)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance alice of Actor
	(properties
		x 96
		y 21
		view 529
		loop 3
		signal $2000
	)
)

(instance hal of Actor
	(properties
		x 199
		y 163
		view 50
	)
)

(instance hob of Actor
	(properties
		x 204
		y 160
		view 50
	)
)

(instance dicken of Actor
	(properties
		x 195
		y 159
		view 50
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(4
				(switch param2
					(8
						(if (== gNewGuise 2)
							(= gNewGuise 3)
							(proc13_4 1270 12)
						)
					)
					(1 (proc13_4 1270 9))
					(5 (proc13_4 1270 10))
				)
			)
		)
	)
)

(instance tryToEnter of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: PolyPath 152 153 self)
			)
			(1
				(proc13_4 1270 11)
				(self dispose:)
			)
		)
	)
)

(instance saved of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1 (proc851_0 @local0 9 0 self))
			(2
				(hal setMotion: PolyPath 226 179)
				(hob setMotion: PolyPath 216 169)
				(dicken setMotion: PolyPath 206 159)
				(gEgo setMotion: PolyPath 196 149 self)
			)
			(3
				(proc806_1 300)
				(proc0_4)
				(gClient newRoom: 250)
				(self dispose:)
			)
		)
	)
)

(instance launch of Script
	(properties)
	
	(method (doit)
		(if
		(and (== (launchSound prevSignal?) -1) (not local4))
			(aliceSound play:)
			(= local4 1)
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(alice setPri: 14 posn: 96 21 init:)
				(= cycles 2)
			)
			(1
				(= local4 0)
				(launchSound play:)
				(= cycles 2)
			)
			(2
				(alice
					setLoop: 3
					setCycle: Walk
					moveSpeed: 3
					cycleSpeed: 3
					setMotion: MoveTo 164 -27 self
				)
			)
			(3
				(alice setLoop: 4 setMotion: MoveTo 260 61 self)
			)
			(4
				(aliceSound stop:)
				(landSound play:)
				(ShakeScreen 10 1)
				(= cycles 1)
			)
			(5
				(proc0_4)
				(alice dispose:)
				(self dispose:)
			)
		)
	)
)

(instance aliceSound of Sound
	(properties
		flags $0001
		number 360
	)
)

(instance landSound of Sound
	(properties
		flags $0001
		number 361
	)
)

(instance launchSound of Sound
	(properties
		flags $0001
		number 906
	)
)
