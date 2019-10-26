;;; Sierra Script 1.0 - (do not remove this comment)
(script# 630)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n964)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm630 0
)

(local
	[newWave 16]
	[local16 17] = [36 264 22 292 298 105 210 55 53 272 272 289 215 29 110 34 159]
	[local33 17] = [10 4 41 44 180 9 6 78 105 72 110 141 179 173 182 147 17]
	[local50 17] = [1 2 3 3 4 2 1 7 7 8 8 2 3 3 4 1 5]
	local67
	[local68 2]
	local70
	local71
	local72
	local73
	local74
	local75
	local76
	[local77 4] = [1630 19 1]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 16)
		((= [newWave temp0] (wave new:))
			x: [local16 temp0]
			y: [local33 temp0]
			loop: [local50 temp0]
			init:
		)
		(++ temp0)
	)
)

(instance rm630 of Rm
	(properties
		picture 630
	)
	
	(method (init)
		(Load rsSCRIPT 964)
		(super init:)
		(if (!= (gRgnMusic number?) 630)
			(gRgnMusic number: 630 loop: -1 play:)
		)
		(proc0_4)
		(if (not (proc0_5 0)) (localproc_000e))
		(Load rsVIEW 630)
		(proc806_3
			monastery
			tortureTower
			swTower
			nwTower
			neTower
			mainGate
			refectory
			yard
			extraRms
			emptyRms
			cel1
			cel2
			cel3
			cel4
			cel5
			cel6
			cel7
			cel8
			cel9
			cel10
			cel11
			cel12
			cel13
			cel14
			cel15
			cel16
		)
		(gEgo view: 48 init:)
		(switch gHeading
			(680
				(waterGate init:)
				(gNewFeatures addToFront: waterGate doit:)
				(= local74 161)
				(= local75 48)
				(gEgo posn: 161 37 setScript: movinOnIn)
			)
			(650
				(gEgo setScript: inFromScribes)
			)
			(670
				(proc0_3)
				(if
				(and (== (Monastery fulkStatus?) 3) (== local76 0))
					(gEgo posn: 98 51 setMotion: MoveTo 98 61)
					(fulk init:)
					(gEgo setScript: splitToTheGate)
				else
					(= local74 98)
					(= local75 61)
					(gEgo posn: 98 51 setScript: movinOnIn)
				)
			)
			(640
				(switch (Monastery whichDoor?)
					(0
						(= local74 130)
						(= local75 100)
						(gEgo posn: 132 100 setScript: movinOnIn)
					)
					(1
						(= local74 130)
						(= local75 115)
						(gEgo posn: 132 115 setScript: movinOnIn)
					)
					(2
						(= local74 130)
						(= local75 129)
						(gEgo posn: 132 129 setScript: movinOnIn)
					)
					(3
						(= local74 161)
						(= local75 145)
						(gEgo posn: 161 141 setScript: movinOnIn)
					)
					(4
						(= local74 190)
						(= local75 129)
						(gEgo posn: 190 129 setScript: movinOnIn)
					)
					(5
						(= local74 192)
						(= local75 115)
						(gEgo posn: 190 115 setScript: movinOnIn)
					)
					(6
						(= local74 192)
						(= local75 100)
						(gEgo posn: 190 100 setScript: movinOnIn)
					)
				)
			)
			(else 
				(gEgo setScript: enterTheMap)
			)
		)
		(self
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						106
						103
						106
						109
						106
						118
						106
						124
						121
						133
						121
						138
						108
						138
						98
						126
						98
						80
						108
						80
						108
						83
						152
						83
						153
						81
						170
						81
						170
						83
						215
						83
						215
						81
						225
						81
						225
						128
						214
						138
						203
						138
						203
						137
						203
						133
						216
						124
						217
						118
						217
						109
						217
						103
						217
						94
						188
						94
						188
						97
						180
						97
						180
						94
						143
						94
						143
						97
						135
						97
						135
						94
						106
						94
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 98 76 98 64 108 54 214 54 225 65 225 76 215 76 209 63 114 63 107 76
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 135 101 143 101 143 112 135 112
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 135 115 143 115 143 126 135 126
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 124 132 135 132 135 130 143 130 143 132 159 132 159 138 124 138
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 180 101 188 101 188 112 180 112
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 180 115 188 115 188 125 180 125
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 162 132 180 132 180 130 188 130 188 132 200 132 200 138 162 138
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						0
						0
						319
						0
						319
						189
						162
						189
						162
						160
						175
						143
						225
						143
						226
						167
						231
						178
						249
						185
						272
						176
						275
						153
						258
						142
						229
						139
						229
						52
						242
						47
						237
						40
						226
						49
						99
						49
						86
						30
						72
						39
						95
						52
						95
						140
						93
						145
						96
						148
						97
						143
						149
						143
						159
						160
						159
						189
						0
						189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 147 96 160 96 160 112 147 112
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 163 96 176 96 176 112 163 112
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 147 114 160 114 160 130 147 130
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 163 114 176 114 176 130 163 130
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 169 74 160 80 153 74 160 68
					yourself:
				)
		)
		(proc0_3)
	)
	
	(method (doit &tmp temp0)
		(if (gEgo script?)
			0
		else
			(cond 
				(
				(u>= (= temp0 (& $7ffe (gEgo onControl:))) 1024) (self setScript: takeOff 0 temp0))
				((and temp0 (not (& local71 temp0)))
					(cond 
						(
						(and (& temp0 $0002) (not (Monastery deathReason?)))
							(gEgo setMotion: 0)
							(= local71 2)
							(if (not (Monastery deathReason?))
								(cond 
									((>= (gEgo y?) 130) (proc13_4 1630 16 1))
									((== (Monastery wherePrior?) 0) (proc13_4 1630 7 1))
									((== (Monastery wherePrior?) 1) (proc13_4 1630 8 1))
									((== (Monastery fulkStatus?) 0) (proc13_4 1630 9 1))
									(
										(or
											(== (Monastery fulkStatus?) 1)
											(== (Monastery fulkStatus?) 2)
										)
										(proc13_4 1630 10 1)
									)
								)
							)
						)
						((& temp0 $0004)
							(gEgo setMotion: 0)
							(= local71 4)
							(cond 
								(local70 (gEgo setScript: inFromScribes))
								(
									(and
										(== (Monastery stairsMessage?) 0)
										(not (Monastery deathReason?))
									)
									(Monastery stairsMessage: 1)
									(proc13_4 1630 0 1)
								)
							)
						)
						((& temp0 $0008)
							(gEgo setMotion: 0)
							(= local71 8)
							(if
								(and
									(not (Monastery stairMessage?))
									(not (Monastery deathReason?))
								)
								(Monastery stairMessage: 1)
								(proc13_4 1630 0 1)
							)
						)
						((& temp0 $0020)
							(gEgo setMotion: 0)
							(= local71 32)
							(if (not (Monastery deathReason?)) (proc13_4 1630 3 1))
						)
						((& temp0 $0040)
							(gEgo setMotion: 0)
							(= local71 64)
							(if (not (Monastery deathReason?))
								(if (== (Monastery wherePrior?) 0)
									(proc13_4 1630 13 1)
								else
									(proc13_4 1630 12 1)
								)
							)
						)
						((& temp0 $0200) (gEgo setMotion: 0) (gEgo setScript: goOnIn))
					)
				)
			)
			(if (mod gB_moveCnt 2)
				(++ local67)
				(if
					(and
						(> (global1 detailLevel:) 2)
						(== (mod local67 5) 0)
					)
					(Palette 6 216 239 1)
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(DisposeScript 964)
		(super dispose:)
	)
	
	(method (cue)
		(proc0_4)
		(proc0_2 3 48 49)
		(super cue:)
	)
	
	(method (newRoom newRoomNumber)
		(if
		(and (Monastery deathReason?) (!= newRoomNumber 680))
			(Monastery roomToDie: newRoomNumber)
			(super newRoom: 695)
		else
			(super newRoom: newRoomNumber)
		)
	)
)

(instance yard of Feature
	(properties
		x 133
		y 59
		nsTop 59
		nsLeft 90
		nsBottom 90
		nsRight 218
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: toTheYard)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance extraRms of Feature
	(properties
		x 114
		y 92
		nsTop 92
		nsLeft 101
		nsBottom 134
		nsRight 136
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: extraRooms)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance emptyRms of Feature
	(properties
		x 201
		y 93
		nsTop 93
		nsLeft 184
		nsBottom 134
		nsRight 219
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: emptyRooms)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance tortureTower of Feature
	(properties
		x 87
		y 52
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 87 47 67 50 56 45 47 35 47 23 63 12 82 11 94 16 101 28 96 39 94 42
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: theTortureTower)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance swTower of Feature
	(properties
		x 223
		y 52
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init:
					223
					23
					233
					12
					249
					8
					267
					12
					277
					21
					280
					30
					277
					39
					271
					46
					265
					51
					250
					52
					237
					48
					230
					42
					223
					31
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: prisonTower)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance neTower of Feature
	(properties
		x 102
		y 184
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init:
					102
					163
					101
					171
					94
					178
					86
					183
					71
					184
					56
					180
					46
					169
					46
					156
					54
					146
					67
					140
					81
					141
					90
					144
					95
					149
					100
					155
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: ToTheNETower)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance nwTower of Feature
	(properties
		x 252
		y 184
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init:
					252
					139
					264
					142
					274
					148
					279
					157
					277
					167
					270
					176
					260
					181
					250
					184
					232
					179
					222
					169
					223
					151
					232
					140
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: scribesTower)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance monastery of Feature
	(properties
		x 162
		y 30
		nsTop 32
		nsLeft 72
		nsBottom 162
		nsRight 252
		lookStr 6
	)
)

(instance cel1 of Feature
	(properties
		x 95
		y 118
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 75 118 90 118 91 141 75 141
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 95)
			(= local73 (Random 120 139))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel2 of Feature
	(properties
		x 93
		y 95
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 73 95 89 96 90 116 75 117
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 95)
			(= local73 (Random 97 115))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel3 of Feature
	(properties
		x 93
		y 73
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 75 73 90 73 89 95 75 94
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 95)
			(= local73 (Random 75 92))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel4 of Feature
	(properties
		x 93
		y 51
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 74 51 88 51 91 73 75 73
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 95)
			(= local73 (Random 53 71))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel5 of Feature
	(properties
		x 101
		y 32
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 112 31 112 44 101 44 101 32
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 102 112))
			(= local73 49)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel6 of Feature
	(properties
		x 124
		y 32
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 134 32 134 45 114 45 114 33
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 116 132))
			(= local73 49)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel7 of Feature
	(properties
		x 200
		y 32
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 211 32 211 45 189 45 188 33
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 190 209))
			(= local73 49)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel8 of Feature
	(properties
		x 218
		y 32
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 222 32 223 45 211 45 211 32
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 213 221))
			(= local73 49)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel9 of Feature
	(properties
		x 240
		y 75
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 233 75 250 76 250 97 234 97
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 229)
			(= local73 (Random 77 95))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel10 of Feature
	(properties
		x 240
		y 51
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 248 51 249 74 234 75 233 51
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 229)
			(= local73 (Random 53 75))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel11 of Feature
	(properties
		x 229
		y 96
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 250 96 251 119 234 119 234 97
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 229)
			(= local73 (Random 98 117))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel12 of Feature
	(properties
		x 240
		y 120
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 249 120 250 140 234 141 235 120
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 229)
			(= local73 (Random 122 139))
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel13 of Feature
	(properties
		x 218
		y 146
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 223 147 224 161 212 161 212 146
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 214 222))
			(= local73 142)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel14 of Feature
	(properties
		x 200
		y 147
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 188 147 211 147 212 160 189 161
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 190 210))
			(= local73 142)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel15 of Feature
	(properties
		x 122
		y 147
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 114 147 138 147 137 159 113 159
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 115 136))
			(= local73 142)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance cel16 of Feature
	(properties
		x 110
		y 146
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 100 146 114 147 114 160 101 160
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(= local72 (Random 102 112))
			(= local73 142)
			(gEgo setScript: moveToCell)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance waterGate of Feature
	(properties
		x 162
		y 38
		nsTop 30
		nsLeft 137
		nsBottom 46
		nsRight 187
		lookStr 20
	)
)

(instance mainGate of Feature
	(properties
		x 162
		y 158
		nsTop 147
		nsLeft 137
		nsBottom 170
		nsRight 187
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: moveToFGate)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance refectory of Feature
	(properties
		x 162
		y 112
		nsTop 94
		nsLeft 143
		nsBottom 135
		nsRight 181
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(gEgo setScript: toTheRefec)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance wave of Prop
	(properties
		view 630
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(if (Random 0 1)
			(self setCel: (Random 0 2) setCycle: Fwd)
		else
			(self setCel: (Random 0 2) setCycle: Rev)
		)
		(super init:)
	)
)

(instance fulk of Actor
	(properties
		x 88
		y 51
		view 675
	)
)

(instance takeOff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= register
					(cond 
						((& register $0400)
							(if (== (Monastery fulkStatus?) 3)
								(gEgo setScript: makeIt)
							)
						)
						((& register $0800) (gEgo setScript: moveToScribes))
						((& register $1000)
							(if (>= (gEgo y?) 151)
								(proc0_4)
								(gClient newRoom: 620)
							else
								(proc0_4)
								(gClient newRoom: 670)
							)
						)
						((& register $2000) (gEgo setScript: moveToPTower))
						((& register $4000)
							(= gGEgoX (gEgo x?))
							(= gGEgoY (gEgo y?))
							(cond 
								((< gGEgoX 147)
									(cond 
										((and (< 95 gGEgoY) (< gGEgoY 104)) (Monastery whichDoor: 0))
										((and (< 110 gGEgoY) (< gGEgoY 116)) (Monastery whichDoor: 1))
										((and (< 124 gGEgoY) (< gGEgoY 132)) (Monastery whichDoor: 2))
									)
								)
								((and (< gGEgoX 170) (< gGEgoY 138)) (Monastery whichDoor: 3))
								((< gGEgoX 189)
									(cond 
										((and (< 126 gGEgoY) (< gGEgoY 138)) (Monastery whichDoor: 4))
										((and (< 110 gGEgoY) (< gGEgoY 116)) (Monastery whichDoor: 5))
										((and (< 95 gGEgoY) (< gGEgoY 104)) (Monastery whichDoor: 6))
									)
								)
							)
							(gEgo setScript: moveToRef)
						)
					)
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance moveToScribes of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion:
						DPath
						252
						148
						261
						149
						268
						153
						271
						161
						269
						169
						262
						176
						251
						179
						240
						177
						232
						172
						self
				)
			)
			(1
				(if (not (Monastery deathReason?)) (proc13_4 1630 11))
				(= local70 1)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance inFromScribes of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== gHeading 650) (gEgo posn: 227 168))
				(= cycles 1)
			)
			(1
				(gEgo
					setMotion:
						DPath
						229
						168
						240
						177
						251
						179
						262
						176
						269
						169
						271
						161
						268
						153
						261
						149
						252
						148
						234
						147
						221
						145
						221
						135
						self
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance moveToRef of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 1))
			(1
				(switch (Monastery whichDoor?)
					(0
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 2) (gEgo y?) self
						)
					)
					(1
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 2) (gEgo y?) self
						)
					)
					(2
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 2) (gEgo y?) self
						)
					)
					(3
						(gEgo setMotion: PolyPath 161 130 self)
					)
					(4
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 2) (gEgo y?) self
						)
					)
					(5
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 2) (gEgo y?) self
						)
					)
					(6
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 2) (gEgo y?) self
						)
					)
					(else  (= cycles 1))
				)
			)
			(2 (gClient newRoom: 640))
		)
	)
)

(instance moveToPTower of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion:
						DPath
						240
						46
						256
						46
						264
						42
						269
						34
						269
						24
						260
						18
						244
						15
						236
						20
						229
						27
						self
				)
			)
			(1 (proc13_4 1630 2 self))
			(2
				(gEgo
					setMotion:
						DPath
						229
						27
						236
						20
						244
						15
						260
						18
						269
						24
						264
						42
						256
						46
						240
						46
						223
						51
						self
				)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance moveToCell of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath local72 local73 self)
			)
			(1
				(if (not (Random 0 1))
					(proc13_4 1630 15 self 82 630 0 0)
				else
					(proc13_4 1630 14 self)
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance enterTheMap of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo posn: 160 160 setMotion: PolyPath 150 145 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance prisonTower of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 230 52 self)
			)
			(1
				(Monastery stairsMessage: 1)
				(proc13_4 1630 0 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance scribesTower of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 232 145 self)
			)
			(1
				(Monastery stairMessage: 1)
				(proc13_4 1630 0 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance extraRooms of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 122 136 self)
			)
			(1
				(proc13_4 1630 17)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance toTheYard of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (> (gEgo x?) 162)
					(gEgo setMotion: PolyPath 221 79 self)
				else
					(gEgo setMotion: PolyPath 104 79 self)
				)
			)
			(1
				(proc13_4 1630 5)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance emptyRooms of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 202 136 self)
			)
			(1
				(proc13_4 1630 18)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance moveToFGate of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 159 149 self)
			)
			(1
				(proc13_4 1630 16)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance toTheRefec of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 161 141 self)
			)
			(1
				(if (== (Monastery wherePrior?) 0)
					(proc13_4 1630 13)
				else
					(proc13_4 1630 12)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance makeIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 162 48 self)
			)
			(1
				(gEgo setMotion: MoveTo 162 38 self)
			)
			(2 (gClient newRoom: 680))
		)
	)
)

(instance splitToTheGate of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(fulk setCycle: Walk setMotion: PolyPath 112 53 self)
			)
			(1
				(gEgo setMotion: PolyPath 98 53 self)
			)
			(2
				(fulk setMotion: PolyPath 165 53 self)
			)
			(3
				(gEgo setMotion: PolyPath 153 53 self)
			)
			(4
				(proc851_0 @local77 (Monastery tFULK?) 0 self)
			)
			(5
				(proc806_1 10)
				(fulk setMotion: MoveTo 165 46 self)
			)
			(6 (gClient newRoom: 680))
		)
	)
)

(instance theTortureTower of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 95 47 self)
			)
			(1
				(= local71 2)
				(cond 
					((== (Monastery wherePrior?) 0) (proc13_4 1630 7 self))
					((== (Monastery wherePrior?) 1) (proc13_4 1630 8 self))
					((== (Monastery fulkStatus?) 0) (proc13_4 1630 9 self))
					(
						(or
							(== (Monastery fulkStatus?) 1)
							(== (Monastery fulkStatus?) 2)
						)
						(proc13_4 1630 10 self)
					)
					(else (= cycles 1))
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance movinOnIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo local74 local75 self)
			)
			(1
				(if (== gHeading 680)
					(gEgo setMotion: PolyPath 98 53 self)
				else
					(= cycles 1)
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance goOnIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion: MoveTo (+ (gEgo x?) 1) (- (gEgo y?) 1) self
				)
			)
			(1 (gClient newRoom: 650))
		)
	)
)

(instance ToTheNETower of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 96 141 self)
			)
			(1 (proc13_4 1630 3 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)
