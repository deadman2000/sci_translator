;;; Sierra Script 1.0 - (do not remove this comment)
(script# 600)
(include sci.sh)
(use n000)
(use n013)
(use n601)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n961)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm600 0
)

(local
	local0
	local1
	local2
	local3
	[newWave 10]
	[local14 9] = [104 161 128 169 51 279 40 3 266]
	[local23 9] = [149 144 141 136 156 143 127 149 140]
	[newCloud 12]
	[local44 11] = [0 319 90 225 159 136 244 0 160 319 57]
	[local55 11] = [109 109 116 122 105 131 139 128 145 129 139]
	[local66 11] = [1 1 0 2 2 2 0 2 1 2]
	[newAPlant 16]
	[local93 4] = [3 3 2 3]
	[local97 9] = [2 3 3 3 2 3 3 3 2]
	[local106 15] = [2 3 3 3 2 3 3 3 2 3 2 2 3 3 2]
	[local121 4] = [3 6 3 1]
	[local125 9] = [1 2 5 5 6 5 7 7 4]
	[local134 15] = [1 2 5 5 6 5 7 7 4 7 6 6 6 4 1]
	[local149 4] = [57 260 0 3]
	[local153 9] = [21 7 66 191 229 297 239 289 261]
	[local162 15] = [23 50 66 191 152 297 239 289 261 247 214 283 198 312 311]
	[local177 4] = [135 167 160 127]
	[local181 9] = [129 145 142 193 150 195 152 152 142]
	[local190 15] = [156 139 142 193 156 195 153 152 142 189 189 133 141 182 170]
	[local205 7] = [1600 0 1 1 1 1]
	[local212 4] = [1600 4 1]
	[local216 4] = [1600 5 1]
	[local220 10] = [1600 6 1 1 1 1 1 1 1]
	[local230 7] = [1600 13 1 2 2 1]
	[local237 5] = [1600 18 1 2]
	[local242 5] = [1600 20 2 1]
	[local247 4] = [1600 28 1]
	[local251 9] = [673 0 2 4 19 33 22 20 21]
)
(procedure (localproc_000e)
	((theWater onMeCheck?) dispose:)
	((thePlants onMeCheck?) dispose:)
	((gClient obstacles?) dispose:)
	(gClient obstacles: 0)
	(gNewFeatures add: thePlants theWater theSky theGround)
	(if (== local1 1)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						319
						165
						264
						171
						198
						162
						179
						165
						149
						164
						107
						164
						52
						174
						19
						165
						0
						165
						0
						0
						319
						0
					yourself:
				)
		)
		(thePlants
			onMeCheck:
				((Polygon new:)
					type: 0
					init:
						319
						161
						299
						146
						273
						152
						271
						165
						261
						165
						252
						151
						214
						143
						201
						153
						178
						134
						160
						129
						145
						151
						138
						141
						141
						128
						127
						121
						111
						122
						104
						131
						96
						146
						96
						124
						88
						122
						71
						142
						65
						130
						55
						132
						41
						150
						0
						146
						0
						164
						52
						171
						108
						160
						218
						160
						260
						166
						279
						166
					yourself:
				)
		)
		(theWater
			onMeCheck:
				((Polygon new:)
					type: 0
					init:
						319
						120
						292
						115
						257
						123
						144
						131
						40
						120
						0
						122
						0
						162
						53
						171
						121
						157
						251
						161
						266
						166
						319
						160
						319
						145
						228
						148
						245
						136
						319
						124
					yourself:
				)
		)
	else
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
						165
						300
						165
						267
						174
						212
						164
						170
						164
						140
						165
						121
						162
						44
						170
						32
						165
						0
						165
					yourself:
				)
		)
		(thePlants
			onMeCheck:
				((Polygon new:)
					type: 0
					init:
						0
						161
						20
						146
						46
						152
						48
						165
						58
						165
						67
						151
						105
						143
						118
						153
						141
						134
						159
						129
						174
						151
						181
						141
						178
						128
						192
						121
						208
						122
						215
						131
						223
						146
						223
						124
						231
						122
						248
						142
						254
						130
						264
						132
						278
						150
						319
						146
						319
						164
						267
						171
						211
						160
						101
						160
						59
						166
						40
						166
					yourself:
				)
		)
		(theWater
			onMeCheck:
				((Polygon new:)
					type: 0
					init:
						0
						120
						27
						115
						62
						123
						175
						131
						279
						120
						318
						122
						319
						162
						266
						171
						198
						157
						68
						161
						53
						166
						0
						160
						0
						145
						91
						148
						74
						136
						0
						124
					yourself:
				)
		)
	)
)

(procedure (localproc_0460 &tmp temp0)
	(= temp0 0)
	(while (< temp0 11)
		([newCloud temp0]
			x: [local44 temp0]
			y: [local55 (= [newCloud temp0] (cloud new:))]
			loop: [local66 temp0]
			init:
		)
		(global10 add: [newCloud temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(procedure (localproc_04ab param1 &tmp temp0 temp1)
	(= temp1
		(switch param1
			(0 4)
			(1 9)
			(2 15)
		))
	(= temp0 0)
	(while (< temp0 temp1)
		(= [newAPlant temp0] (aPlant new:))
		([newAPlant temp0]
			view: 600
			loop:
				(switch param1
					(0 [local93 temp0])
					(1 [local97 temp0])
					(2 [local106 temp0])
				)
			cel:
				(switch param1
					(0 [local121 temp0])
					(1 [local125 temp0])
					(2 [local134 temp0])
				)
			x:
				(switch param1
					(0 [local149 temp0])
					(1 [local153 temp0])
					(2 [local162 temp0])
				)
			y:
				(switch param1
					(0 [local177 temp0])
					(1 [local181 temp0])
					(2 [local190 temp0])
				)
			init:
		)
		(global10 add: [newAPlant temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(procedure (localproc_05cb &tmp temp0)
	(= temp0 0)
	(while (< temp0 9)
		((= [newWave temp0] (wave new:))
			x: [local14 temp0]
			y: [local23 temp0]
			setPri: 1
			init:
		)
		(++ temp0)
	)
)

(instance rm600 of Rm
	(properties
		picture 600
		style $0005
		north 610
	)
	
	(method (init &tmp temp0)
		(= temp0 (if (> global87 0) 2 else 3))
		(if (== gHeading 590) (self style: 12))
		(super init:)
		(gIconBar disable: 5)
		(gEgo actions: (ScriptID 601 7))
		(localproc_0460)
		(localproc_04ab 0)
		(if (not (proc0_5 0)) (localproc_05cb))
		(proc806_3 thePlants theWater theSky theGround)
		(self
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						0
						0
						319
						0
						319
						165
						300
						165
						267
						174
						212
						164
						170
						164
						140
						165
						121
						162
						44
						170
						32
						165
						0
						165
					yourself:
				)
		)
		(proc0_2)
		(switch gHeading
			(690
				(gEgo
					view: 585
					normal: 0
					moveHead: 0
					setLoop: 2
					setStep: temp0 temp0
					cycleSpeed: 18
					cel: 0
					posn: 319 140
					setCycle: Walk
					init:
					setScript: rescueOfFulk
				)
				(= local2 1)
			)
			(700
				((ScriptID 601 1)
					view: 21
					loop: 2
					cel: 2
					posn: 98 132
					setPri: ((ScriptID 601 2) priority?)
					ignoreActors: 1
					init:
				)
				((ScriptID 601 10) cel: 3 posn: 133 156 init:)
				(proc0_3)
				(proc0_2 4)
				(gEgo posn: 125 165 init: setMotion: MoveTo 140 180 self)
				((ScriptID 601) notify: 700)
			)
			(590
				(gEgo
					posn: 15 (gEgo y?)
					init:
					setMotion: PolyPath 26 182 self
				)
				(proc601_11 2)
				(= local3 (proc601_5 2))
				(proc0_3)
			)
			(else 
				(gEgo posn: 160 185 init:)
			)
		)
	)
	
	(method (doit)
		(++ local0)
		(if (not (proc0_5 115))
			(cond 
				((== local1 1) (if (== (mod local0 5) 0) (Palette 6 225 255 1)))
				((== (mod local0 5) 0) (Palette 6 225 255 -1))
			)
		)
		(cond 
			((gEgo script?))
			((== (gEgo edgeHit?) 3) (gEgo setScript: walkDown))
			((and (>= (gEgo x?) 310) (== local1 2)) (gEgo setMotion: 0 setScript: bumpBog))
			((and (>= (gEgo x?) 319) (< local1 2)) (gEgo setScript: headEast))
			((== (gEgo edgeHit?) 4) (gEgo setScript: headWest))
			(else (super doit:))
		)
	)
	
	(method (dispose)
		(gRgnMusic2 stop:)
		(self setScript: 0)
		(super dispose:)
	)
	
	(method (cue)
		(if local3
			(= local3 0)
			(proc851_0 1 @local247 11 0 self)
		)
		(proc0_4)
		(super cue:)
	)
	
	(method (notify)
		((ScriptID 601)
			notify:
			(switch local1
				(0 2)
				(1 3)
				(2 4)
			)
		)
	)
)

(instance cloud of PicView
	(properties
		z 15
		lookStr 22
		view 590
		signal $6000
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1600 23 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance aPlant of PicView
	(properties
		lookStr 24
		signal $4000
	)
)

(instance wave of Prop
	(properties
		view 600
		loop 5
		signal $4000
		cycleSpeed 18
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

(instance theWater of Feature
	(properties
		lookStr 26
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				0
				120
				27
				115
				62
				123
				175
				131
				279
				120
				318
				122
				319
				162
				266
				171
				198
				157
				68
				161
				53
				166
				0
				160
				0
				145
				91
				148
				74
				136
				0
				124
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1600 27 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance thePlants of Feature
	(properties
		lookStr 24
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				0
				161
				20
				146
				46
				152
				48
				165
				58
				165
				67
				151
				105
				143
				118
				153
				141
				134
				159
				129
				174
				151
				181
				141
				178
				128
				192
				121
				208
				122
				215
				131
				223
				146
				223
				124
				231
				122
				248
				142
				254
				130
				264
				132
				278
				150
				319
				146
				319
				164
				267
				171
				211
				160
				101
				160
				59
				166
				40
				166
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance theSky of Feature
	(properties
		nsBottom 80
		nsRight 319
		lookStr 30
	)
)

(instance theGround of Feature
	(properties
		nsTop 80
		nsBottom 189
		nsRight 319
		lookStr 29
	)
)

(instance fulkScroll of View
	(properties
		x 240
		y 155
		view 771
		loop 3
		priority 15
		signal $4010
	)
)

(instance waterRing of View
	(properties
		x 240
		y 150
		view 771
		loop 5
		priority 15
		signal $4010
	)
)

(instance fulk of Actor
	(properties
		view 674
		loop 5
		signal $4000
	)
)

(instance bumpBog of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1600 25 self)
			)
			(1
				(gEgo
					setMotion: MoveTo (- (gEgo x?) 15) (gEgo y?) self
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath -10 gGEgoY self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance walkDown of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion: PolyPath (gEgo x?) (+ (gEgo y?) 45) self
				)
			)
			(1 (gClient newRoom: 590))
		)
	)
)

(instance headEast of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: PolyPath 335 (gEgo y?) self)
			)
			(1
				(proc0_3)
				(++ local1)
				(if (gNewCast contains: (ScriptID 601 1))
					((ScriptID 601 1) dispose:)
				)
				(if (gNewCast contains: (ScriptID 601 2))
					((ScriptID 601 2) dispose:)
				)
				(if (gNewCast contains: (ScriptID 601 10))
					((ScriptID 601 10) dispose:)
				)
				(global10 eachElementDo: #dispose release:)
				(gNewFeatures release:)
				(if gTheNewDialog (gTheNewDialog dispose:))
				(proc0_7 14)
				(if (== local1 1)
					(gClient drawPic: 600 16396)
					(localproc_04ab 1)
				else
					(gClient style: 12 drawPic: 600)
					(localproc_04ab 2)
				)
				(localproc_000e)
				(localproc_0460)
				(if (== global130 13) (proc601_11 (+ local1 2)))
				(= local3 (proc601_5 (+ local1 2)))
				(gEgo posn: (- (gEgo x?) 320) (gEgo y?))
				(= ticks 30)
			)
			(2
				(gEgo setMotion: PolyPath 30 (gEgo y?) self)
			)
			(3
				(if local3
					(proc851_0 1 @local247 11 0 self)
				else
					(self cue:)
				)
			)
			(4
				(= local3 0)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance headWest of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath -15 (gEgo y?) self)
			)
			(1
				(if (not local1)
					(gClient newRoom: 590)
				else
					(-- local1)
					(if (gNewCast contains: (ScriptID 601 1))
						((ScriptID 601 1) dispose:)
					)
					(if (gNewCast contains: (ScriptID 601 2))
						((ScriptID 601 2) dispose:)
					)
					(if (gNewCast contains: (ScriptID 601 10))
						((ScriptID 601 10) dispose:)
					)
					(global10 eachElementDo: #dispose release:)
					(gNewFeatures release:)
					(proc0_7 14)
					(if gTheNewDialog (gTheNewDialog dispose:))
					(if (== local1 1)
						(gClient drawPic: 600 16395)
						(localproc_04ab 1)
					else
						(gClient style: 11 drawPic: 600)
						(localproc_04ab 0)
					)
					(localproc_000e)
					(localproc_0460)
					(if (== global130 13) (proc601_11 (+ local1 2)))
					(gEgo posn: (+ (gEgo x?) 320) (gEgo y?))
					(= local3 (proc601_5 (+ local1 2)))
					(= ticks 30)
				)
			)
			(2
				(gEgo setMotion: PolyPath 290 (gEgo y?) self)
			)
			(3
				(if local3
					(proc851_0 1 @local247 11 0 self)
				else
					(self cue:)
				)
			)
			(4
				(= local3 0)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance rescueOfFulk of Script
	(properties)
	
	(method (doit)
		(if (== local2 1)
			((ScriptID 601 1)
				x: (- (gEgo x?) 68)
				y: (- (gEgo y?) 25)
				setPri: (- (gEgo priority?) 1)
			)
			(fulk x: (- (gEgo x?) 26) y: (gEgo y?))
		)
		(super doit:)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				((ScriptID 601 1)
					setLoop: 2
					setCel: 2
					posn: (- (gEgo x?) 68) (- (gEgo y?) 25)
					ignoreActors: 1
					init:
				)
				(fulk
					posn: (- (gEgo x?) 26) (gEgo y?)
					ignoreActors: 1
					init:
				)
				(gEgo setMotion: MoveTo 138 155 self)
			)
			(1
				(= local2 0)
				(fulk cycleSpeed: 12 setCycle: CT 6 1 self)
				(gEgo setCel: 5)
				((ScriptID 601 1) setPri: -1)
			)
			(2
				(fulk
					setLoop: 5
					cycleSpeed: 6
					setMotion: MoveTo (fulk x?) (+ (fulk y?) 16)
					setCycle: End self
				)
			)
			(3
				(fulk
					view: 671
					setLoop: -1
					setPri: -1
					setStep: 2 2
					setCycle: StopWalk 672
					setMotion: MoveTo 80 184 self
				)
			)
			(4 (fulk setHeading: 90 self))
			(5 (= ticks 12))
			(6
				(proc0_2)
				(global1 setSpeed: global141)
				(gEgo setMotion: MoveTo (gEgo x?) 170 self)
			)
			(7
				(= temp0 (if (> global87 0) 2 else 3))
				((ScriptID 601 1)
					setStep: temp0 temp0
					setMotion:
						MoveTo
						(+ ((ScriptID 601 1) x?) 220)
						(- ((ScriptID 601 1) y?) 50)
				)
				(proc0_9 gEgo fulk self)
			)
			(8 (= ticks 12))
			(9
				(proc851_0 1 @local205 @local251 0 self)
			)
			(10
				(gEgo
					setMotion: MoveTo (+ (fulk x?) 20) (fulk y?) self
				)
			)
			(11
				(proc0_9 gEgo fulk)
				(= ticks 18)
			)
			(12
				(fulk
					view: 674
					loop: 0
					cel: 0
					cycleSpeed: 12
					setCycle: End self
				)
			)
			(13
				(fulk view: 671)
				(= ticks 24)
			)
			(14
				(proc851_0 1 @local212 @local251 0 self)
			)
			(15
				(proc851_0 1 @local216 8 0 self)
			)
			(16
				(proc851_0 1 @local220 @local251 0 self)
			)
			(17
				(proc806_1 25)
				(if (gEgo has: 10)
					(proc851_0 2 @local230 8 0 @local251 0 self)
					(if (gEgo has: 16) (gEgo put: 16))
				else
					(proc851_0 2 @local237 8 0 @local251 0 self)
					(gEgo get: 16)
				)
				(gEgo get: 18)
			)
			(18
				(proc851_0 2 @local242 8 0 @local251 0 self)
			)
			(19
				(fulk
					cycleSpeed: 6
					xStep: 3
					yStep: 2
					setCycle: StopWalk 672
					setMotion: MoveTo -30 (fulk y?) self
				)
			)
			(20
				(gEgo setMotion: MoveTo 150 240 self)
			)
			(21
				(proc0_4)
				((ScriptID 601 1) setCycle: 0 setMotion: 0)
				(gClient newRoom: 160)
			)
		)
	)
)
