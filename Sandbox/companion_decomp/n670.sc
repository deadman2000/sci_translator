;;; Sierra Script 1.0 - (do not remove this comment)
(script# 670)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	rm670 0
)

(local
	[local0 4]
	local4
	[newORat 5]
	[newRunAround 5]
	[local15 26] = [1670 0 2 1 2 1 2 1 2 1 2 1 2 1 2 2 1 2 1 2 1 2 1 2 2]
	[local41 6] = [1670 23 2 1 2]
	[local47 8] = [1670 26 2 1 2 1 2]
	[local55 6] = [1670 31 2 1 2]
	[local61 4] = [1670 34 1]
	[local65 4] = [1670 45 1]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 5)
		(= [newORat temp0] (oRat new:))
		([newORat temp0]
			loop:
			(switch temp0
				(0 0)
				(1 1)
				(2 3)
				(3 5)
				(4 10)
			)
			x:
			(switch temp0
				(0 101)
				(1 243)
				(2 93)
				(3 167)
				(4 70)
			)
			y:
			(switch temp0
				(0 150)
				(1 173)
				(2 159)
				(3 150)
				(4 160)
			)
			cycleSpeed: 3
			init:
			setScript: (= [newRunAround temp0] (runAround new:))
		)
		(++ temp0)
	)
)

(instance rm670 of Rm
	(properties
		picture 670
	)
	
	(method (init &tmp monasteryWherePrior monasteryFulkStatus)
		(super init:)
		(localproc_000e)
		(proc806_3
			bucket
			highWindow
			rack
			strappado
			wheel
			leftRope
			rightRope
			rightTopRope
			wallChain
			highChain
			walls
			floor
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						78
						189
						0
						189
						0
						-1
						319
						-1
						319
						189
						243
						189
						251
						183
						229
						178
						226
						167
						266
						166
						265
						164
						215
						166
						188
						159
						158
						151
						47
						151
						48
						176
						83
						176
						83
						184
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 56 154 162 154 187 160 179 169 147 169 124 163 61 163
					yourself:
				)
		)
		(proc0_2)
		(= monasteryWherePrior (Monastery wherePrior?))
		(if
		(== (= monasteryFulkStatus (Monastery fulkStatus?)) 0)
			(if (> monasteryWherePrior 1) (proc806_1 -50))
			((ScriptID 15)
				setLoop: 2
				setCel: 0
				posn: 171 126
				init:
				approachX: 178
				approachY: 155
				approachVerbs: 3
			)
		else
			((ScriptID 15)
				loop: 3
				cel: 9
				posn: 162 165
				init:
				approachX: 172
				approachY: 165
				approachVerbs: 3
			)
		)
		(switch monasteryWherePrior
			(0
				(gEgo posn: 95 230 init:)
				((ScriptID 625 1) loop: 5 cel: 4 posn: 161 170 init:)
				(self setScript: meetTheMonk)
			)
			(1
				(gEgo posn: 95 230 init:)
				((ScriptID 625 2) loop: 1 cel: 3 posn: 206 169 init:)
				(self setScript: meetThePrior)
			)
			(else 
				(gEgo posn: 160 240 init:)
				(self setScript: walkIn self)
			)
		)
		(sqeakSound init: play:)
	)
	
	(method (doit)
		(cond 
			((gEgo script?))
			((and (gEgo edgeHit?) (not (gClient script?))) (gClient newRoom: 630))
			((== global115 2) (gEgo setScript: burnedByFire))
		)
		(super doit:)
	)
	
	(method (dispose)
		(DisposeScript 927)
		(super dispose:)
	)
)

(instance oRat of Actor
	(properties
		yStep 4
		view 705
		signal $4000
		cycleSpeed 40
		illegalBits $0000
		xStep 6
		moveSpeed 0
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1670 50))
			(3 (proc13_4 1670 51))
			(5
				(proc13_6 32)
				(proc13_4 1670 52 80 {Rat})
				(proc13_6 0)
			)
			(4
				(proc13_6 32)
				(proc13_4 1670 53 80 {Rat})
				(proc13_6 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bucket of Feature
	(properties
		x 73
		y 175
		nsTop 164
		nsLeft 68
		nsBottom 186
		nsRight 79
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1670 43))
			(3 (proc13_4 1670 44))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance walls of Feature
	(properties
		y 10
		nsLeft 47
		nsBottom 150
		nsRight 268
		lookStr 40
	)
)

(instance floor of Feature
	(properties
		y 10
		nsTop 150
		nsLeft 47
		nsBottom 189
		nsRight 268
		lookStr 42
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3 (proc13_4 1670 46))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance highWindow of Feature
	(properties
		x 198
		y 24
		nsTop 4
		nsLeft 190
		nsBottom 44
		nsRight 207
		sightAngle 90
		lookStr 41
	)
)

(instance rack of Feature
	(properties
		y 20
		lookStr 37
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				67
				141
				77
				135
				79
				128
				81
				128
				81
				133
				110
				122
				110
				117
				114
				117
				116
				120
				130
				119
				132
				116
				136
				116
				137
				120
				137
				124
				120
				134
				123
				156
				120
				157
				118
				147
				107
				148
				104
				159
				99
				159
				100
				155
				91
				155
				88
				159
				82
				159
				67
				155
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance strappado of Feature
	(properties
		y 20
		lookStr 35
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				115
				27
				124
				24
				180
				42
				179
				48
				165
				47
				159
				52
				158
				136
				167
				158
				147
				165
				132
				161
				144
				137
				147
				54
				136
				38
				115
				32
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance wheel of Feature
	(properties
		y 20
		lookStr 38
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 248 108 248 162 241 162 233 154 230 140 232 128 237 116
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance leftRope of Feature
	(properties
		y 20
		lookStr 36
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				69
				44
				77
				48
				98
				48
				113
				43
				123
				35
				130
				35
				131
				40
				128
				42
				129
				66
				122
				83
				119
				83
				117
				78
				120
				72
				123
				42
				121
				42
				116
				45
				94
				53
				73
				53
				69
				50
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1670 47))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rightRope of Feature
	(properties
		y 44
		lookStr 36
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				224
				44
				228
				48
				229
				54
				221
				59
				220
				76
				219
				102
				219
				130
				219
				149
				215
				148
				214
				135
				210
				136
				207
				130
				213
				127
				213
				117
				215
				93
				213
				63
				217
				59
				211
				59
				209
				52
				211
				48
				217
				44
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== (Monastery fulkStatus?) 0)
					(gEgo setScript: freeFulk)
				else
					(proc13_4 1670 49)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rightTopRope of Feature
	(properties
		y 48
		lookStr 36
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				208
				57
				186
				55
				195
				60
				205
				63
				215
				60
				216
				63
				204
				67
				189
				64
				177
				56
				177
				75
				174
				77
				174
				127
				168
				124
				170
				56
				169
				55
				169
				51
				172
				48
				208
				53
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== (Monastery fulkStatus?) 0)
					(proc13_4 1670 48)
				else
					(proc13_4 1670 49)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance wallChain of Feature
	(properties
		y 20
		lookStr 39
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				182
				95
				186
				95
				190
				99
				187
				104
				184
				106
				186
				110
				186
				119
				182
				122
				182
				142
				180
				142
				179
				116
				180
				108
				181
				105
				177
				103
				177
				97
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance highChain of Feature
	(properties
		y 20
		lookStr 39
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				230
				22
				250
				16
				250
				25
				249
				36
				241
				32
				243
				37
				241
				55
				240
				70
				241
				76
				239
				77
				236
				68
				238
				37
				235
				34
				237
				31
				232
				30
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance meetThePrior of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 106 180 self)
			)
			(1
				(proc0_9 gEgo (ScriptID 625 2))
				(proc851_0 @local47 8 (Monastery tPRIOR?) self)
			)
			(2
				((ScriptID 625 2)
					setCycle: Walk
					setMotion: MoveTo 180 250 self
				)
			)
			(3
				(Monastery wherePrior: 2)
				(proc0_4)
				((ScriptID 625 2) dispose:)
				(self dispose:)
			)
		)
	)
)

(instance meetTheMonk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 106 180 self)
			)
			(1
				(proc0_9 (ScriptID 625 1) gEgo)
				(proc0_9 gEgo (ScriptID 625 1) self)
			)
			(2
				(proc851_0 @local61 11 0 self)
			)
			(3
				((ScriptID 625 1)
					setCycle: Walk
					setMotion: MoveTo 126 180
				)
				(gEgo setMotion: PolyPath 106 250 self)
			)
			(4
				(self dispose:)
				(gClient newRoom: 630)
			)
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (dispose)
		(proc0_4)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 202 172 self)
			)
			(1
				(proc0_9 gEgo (ScriptID 15) self)
			)
			(2
				(if (== (Monastery fulkStatus?) 2)
					(if (gEgo has: 17)
						(proc851_0 @local55 8 (Monastery tFULK?) self)
					else
						(proc851_0 @local41 8 (Monastery tFULK?) self)
					)
				else
					(self dispose:)
				)
			)
			(3
				(if (gEgo has: 17)
					(Monastery fulkStatus: 3)
					((ScriptID 15) setCycle: CT 6 -1 self)
				else
					(= cycles 2)
				)
			)
			(4
				(if (gEgo has: 17)
					((ScriptID 15)
						view: 671
						loop: 2
						cel: 0
						setCycle: Walk
						setMotion: PolyPath 110 250
					)
					(gEgo setMotion: PolyPath 170 250 self)
				else
					(self dispose:)
				)
			)
			(5
				(gClient newRoom: 630)
				(self dispose:)
			)
		)
	)
)

(instance freeFulk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 233 157 self)
			)
			(1 (gEgo setHeading: 270 self))
			(2
				((ScriptID 15) setPri: 10)
				(global1 setSpeed: global141)
				(gEgo view: 20 loop: 3 cel: 3 setCycle: Beg self)
				((ScriptID 15)
					moveSpeed: (* global141 3)
					yStep: 6
					setMotion: MoveTo ((ScriptID 15) x?) (+ ((ScriptID 15) y?) 30)
				)
			)
			(3
				(pulleySound play:)
				(ropeSound play:)
				(gEgo view: 20 loop: 3 cel: 3 setCycle: Beg self)
			)
			(4
				(gEgo view: 20 loop: 3 cel: 3 setCycle: Beg self)
			)
			(5
				(gEgo view: 20 loop: 3 cel: 3 setCycle: Beg self)
			)
			(6
				(gEgo view: 20 loop: 3 cel: 3 setCycle: Beg self)
			)
			(7
				((ScriptID 15) setPri: -1)
				(pulleySound stop:)
				(ropeSound stop:)
				(proc0_2)
				(gEgo setMotion: PolyPath 168 164 self)
			)
			(8
				(proc0_9 gEgo (ScriptID 15))
				(= cycles 1)
			)
			(9
				(if (== ((Inv at: 16) owner?) 670)
					(if (gEgo has: 17)
						(Monastery fulkStatus: 3)
					else
						(Monastery fulkStatus: 2)
					)
				else
					(Monastery fulkStatus: 1)
				)
				((ScriptID 15) yStep: 2 moveSpeed: 6 view: 671)
				(= cycles 10)
			)
			(10
				((ScriptID 15) loop: 2)
				((ScriptID 15) cel: 5)
				(= cycles 2)
			)
			(11
				((ScriptID 15)
					setCycle: Walk
					setMotion: MoveTo 162 165 self
				)
				(gEgo setMotion: PolyPath 195 168 self)
			)
			(12)
			(13
				(proc0_9 (ScriptID 15) gEgo)
				(proc0_9 gEgo (ScriptID 15))
				(= cycles 3)
			)
			(14
				((ScriptID 15)
					view: 674
					loop: 3
					cel: 5
					setCycle: End self
				)
			)
			(15
				(proc851_0 @local15 8 (Monastery tFULK?) self)
			)
			(16
				(proc806_1 100)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(class runAround of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks (Random 30 120)))
			(1
				(if (< (client cel?) (client lastCel:))
					(client setCycle: End self)
				else
					(client setCycle: Beg self)
				)
			)
			(2 (= state -1) (self cue:))
		)
	)
)

(instance burnedByFire of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= global145 20)
				(gEgo setMotion: PolyPath 168 163 self)
			)
			(1
				((= local4 ((ScriptID 625 1) new:))
					view: 16
					setLoop: 0
					cel: 0
					posn: 85 238
					init:
					setCycle: Walk
					setMotion: PolyPath 168 183 self
				)
			)
			(2 (proc0_9 gEgo local4 self))
			(3 (proc0_9 local4 gEgo self))
			(4
				(proc851_0 @local65 11 0 self)
			)
			(5
				(local4 view: 585 setLoop: 3 setCel: 0 setCycle: End)
				(= cycles 2)
			)
			(6
				(dieSound play:)
				(gEgo view: 22 setLoop: 2 setCel: 0 setCycle: End self)
			)
			(7 (gClient newRoom: 170))
		)
	)
)

(instance sqeakSound of Sound
	(properties
		flags $0001
		number 671
		loop -1
	)
)

(instance ropeSound of Sound
	(properties
		flags $0001
		number 670
		loop -1
	)
)

(instance pulleySound of Sound
	(properties
		flags $0001
		number 672
		loop -1
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
