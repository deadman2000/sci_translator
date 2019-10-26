;;; Sierra Script 1.0 - (do not remove this comment)
(script# 223)
(include sci.sh)
(use n000)
(use n013)
(use n221)
(use n231)
(use n241)
(use n750)
(use n945)
(use n946)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	englishTreeName 0
	notSweeping 1
	notBlessed 2
	turnToTree 3
	unTreeEgo 4
)

(local
	local0
	local1
	local2
	gEgoY
	local4
	local5
	local6
	local7
	local8
	gEgoY_2
	local10
	local11
	local12
	local13
)
(instance englishTreeName of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 60))
			(1
				(if
					(proc999_5
						global112
						2
						3
						4
						5
						6
						7
						17
						24
						25
						26
						27
						32
						43
						48
						60
						64
						76
						81
						91
						97
						107
						113
						123
						129
						139
						146
						147
						148
						149
						156
						168
						169
						170
						171
						182
						183
					)
					(proc13_4 1223 0 self)
				else
					(proc13_4 1223 1 self)
				)
			)
			(2
				(if (proc0_5 129) (proc750_2) (gIconBar disable: 5))
				(proc0_4)
				(self dispose:)
				(DisposeScript 223)
			)
		)
	)
)

(instance notSweeping of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 60))
			(1
				(proc13_4
					1223
					8
					self
					80
					(switch global124
						(11 {Birch})
						(12 {Rowan})
						(13 {Ash})
						(14 {Alder})
						(15 {Holly})
						(16 {Hazel})
						(17 {Elder})
						(18 {Oak})
						(20 {Blackberry})
					)
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance notBlessed of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 60))
			(1 (proc13_4 1223 2 self))
			(2 (proc13_4 1223 3 self))
			(3
				(if (proc0_5 129) (proc750_2) (gIconBar disable: 5))
				(proc0_4)
				(self dispose:)
				(DisposeScript 223)
			)
		)
	)
)

(instance turnToTree of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (or (== global112 88) (== global112 49))
					(gEgo setMotion: PolyPath 175 106 self)
				else
					(self cue:)
				)
			)
			(1
				(if (or (== global112 88) (== global112 49))
					(gEgo setMotion: MoveTo (gEgo x?) (- (gEgo y?) 3) self)
				else
					(self cue:)
				)
			)
			(2
				(if
				(not (if (== global112 88) else (== global112 49)))
					(cond 
						((== global11 180) (= local1 3) (= local0 236))
						((or (== global112 132) (== global112 155)) (= local1 2) (= local0 234))
						((== global112 34) (= local1 2) (= local0 230))
						((or (== global112 53) (== global112 120)) (= local1 1) (= local0 233))
						((== global112 66) (= local1 0) (= local0 231))
						((== global112 20) (= local1 1) (= local0 237))
						((== global112 114) (= local1 2) (= local0 232))
						((or (== global112 22) (== global112 122)) (= local1 1) (= local0 235))
					)
					(switch local1
						(0
							(= local2 (+ (gEgo x?) -40))
							(= local8 (+ (gEgo x?) 40))
						)
						(1
							(= local2 (+ (gEgo x?) -50))
							(= local8 (+ (gEgo x?) 50))
						)
						(3
							(= local2 (+ (gEgo x?) -110))
							(= local8 (+ (gEgo x?) 110))
						)
						(else 
							(= local2 (+ (gEgo x?) -60))
							(= local8 (+ (gEgo x?) 60))
						)
					)
					(= gEgoY (gEgo y?))
					(= gEgoY_2 (gEgo y?))
					(= local4 (+ local2 10))
					(= local5 (- gEgoY 10))
					(= local12 (+ local2 10))
					(= local13 (+ gEgoY 7))
					(= local6 (- local8 10))
					(= local7 (- gEgoY_2 10))
					(= local10 (- local8 10))
					(= local11 (+ gEgoY_2 7))
					(gClient
						addObstacle:
							((Polygon new:)
								type: 2
								init:
									local2
									gEgoY
									local4
									local5
									local6
									local7
									local8
									gEgoY_2
									local10
									local11
									local12
									local13
								yourself:
							)
					)
				else
					(= local0 236)
				)
				(razzleDazzle init: play:)
				(sparkle
					x: (gEgo x?)
					y: (gEgo y?)
					init:
					setCycle: End self
				)
			)
			(3
				(if (or (== global112 88) (== global112 49))
					(gEgo hide:)
				else
					(gEgo view: local0 loop: 0 cel: 0)
				)
				(= ticks 12)
			)
			(4
				(sparkle dispose:)
				(if (< global154 3)
					(++ global154)
					(gSFX2 number: 916 loop: 1 play:)
					(= global15 (+ global15 75))
					((ScriptID 0 1) doit:)
				)
				((ScriptID 750 0) setScript: 0)
				(= ticks 60)
			)
			(5
				(razzleDazzle dispose:)
				(gSFX number: 401 loop: -1 play:)
				(proc750_1)
				(self dispose:)
				(DisposeScript 223)
			)
		)
	)
)

(instance razzleDazzle of Sound
	(properties
		number 216
	)
)

(instance unTreeEgo of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(if (not global143) (proc0_3))
				(= seconds 4)
			)
			(1
				(proc13_4
					1223
					4
					self
					80
					(switch global124
						(11 {Birch})
						(12 {Rowan})
						(13 {Ash})
						(14 {Alder})
						(15 {Holly})
						(16 {Hazel})
						(17 {Elder})
						(18 {Oak})
					)
				)
			)
			(2
				(if (or (== global112 88) (== global112 49))
					(self cue:)
				else
					(if (gClient obstacles?)
						((gClient obstacles?) dispose:)
					)
					(gClient obstacles: 0)
					(= ticks 120)
				)
			)
			(3
				(razzleDazzle init: play:)
				(sparkle
					x: (gEgo x?)
					y: (gEgo y?)
					cel: 0
					init:
					cycleSpeed: 12
					setCycle: End self
				)
			)
			(4
				(sparkle dispose:)
				(if (or (== global112 88) (== global112 49))
					(gEgo
						show:
						setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 6) self
					)
				else
					(self cue:)
				)
			)
			(5
				(razzleDazzle dispose:)
				(proc0_2)
				(cond 
					((or (== global112 88) (== global112 49)) (self cue:))
					((== global11 180)
						(gClient
							addObstacle:
								((Polygon new:)
									type: 2
									init:
										189
										156
										178
										160
										181
										170
										176
										173
										169
										171
										160
										166
										136
										166
										140
										161
										177
										153
										170
										145
										179
										136
										158
										131
										153
										126
										136
										126
										122
										136
										60
										157
										50
										165
										30
										165
										30
										160
										50
										155
										68
										144
										43
										152
										31
										152
										39
										142
										80
										141
										125
										121
										199
										125
										222
										121
										243
										136
										247
										156
										248
										165
										225
										151
									yourself:
								)
								((Polygon new:)
									type: 2
									init:
										300
										167
										277
										166
										266
										154
										251
										145
										255
										137
										277
										138
										319
										139
										319
										159
										300
										158
									yourself:
								)
						)
						(= ticks 30)
					)
					(else
						(switch (gClient picture?)
							(220 (proc221_0))
							(230 (proc231_0))
							(240 (proc241_0))
						)
						(= ticks 30)
					)
				)
				(cond 
					((and (== global130 9) (not (proc0_5 36)))
						(proc0_6 36)
						(proc0_7 129)
						(= global137 0)
						(gSFX fade: 0 30 8 1)
						((ScriptID 750 0) keep: 0)
					)
					((and (== global130 12) (not (proc0_5 38)))
						(proc0_6 38)
						(proc0_7 129)
						(= global137 0)
						(gSFX fade: 0 30 8 1)
						((ScriptID 750 0) keep: 0)
					)
				)
				(= seconds 2)
			)
			(6
				(if (== global130 9) (= temp0 5) else (= temp0 6))
				(proc13_4 1223 temp0 self)
			)
			(7
				(if (== global130 12) (= ticks 100) else (self cue:))
			)
			(8
				(if (== global130 12)
					(proc13_4
						1223
						7
						self
						80
						(switch global124
							(11 {Birch})
							(12 {Rowan})
							(13 {Ash})
							(14 {Alder})
							(15 {Holly})
							(16 {Hazel})
							(17 {Elder})
							(18 {Oak})
						)
					)
				)
			)
			(9
				(proc0_4)
				(proc0_2)
				(self dispose:)
				(DisposeScript 223)
			)
		)
	)
)

(instance sparkle of Prop
	(properties
		view 245
		loop 1
		signal $4000
	)
)
