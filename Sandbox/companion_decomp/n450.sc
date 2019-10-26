;;; Sierra Script 1.0 - (do not remove this comment)
(script# 450)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n937)
(use n946)
(use n950)
(use n992)
(use n994)
(use n995)
(use n999)

(public
	rm450 0
)

(local
	local0
	[local1 5] = [440 470 455 460 480]
	[local6 5] = [160 217 143 122 157]
	[local11 5] = [145 147 144 147 65]
	[local16 5] = [160 225 139 113 159]
	[local21 5] = [157 147 134 148 61]
	[local26 5] = [0 8 16 2 4]
	local31
	[local32 4] = [52 52 25 25]
	[local36 4] = [0 4 8 18]
	[theApproachX 4] = [100 115 197 208]
	local44 =  2
	local45 =  9
	local46 =  20
)
(procedure (localproc_084c param1)
	(if
		(and
			(== ((IconBar curIcon?) message?) 2)
			(& local0 param1)
		)
		(= local0 (& local0 (~ param1)))
	)
)

(instance rm450 of Rm
	(properties
		picture 450
	)
	
	(method (init &tmp temp0)
		(if (== gNewGuise 5)
			(proc0_2 -1 50 51)
		else
			(proc0_2 -1 67)
			(gEgo setCycle: Walk)
		)
		(gEgo setStep: 2 1 init:)
		(= script arrived)
		(arrived client: self)
		(= local0
			[local26 (= temp0
				(switch gHeading
					(440 0)
					(470 1)
					(455 2)
					(460 3)
					(480 4)
				)
			)]
		)
		(gEgo
			edgeHit: 0
			x: [local16 temp0]
			y: [local21 local0]
			setMotion: MoveTo [local6 temp0] [local11 local0] arrived
		)
		(super init:)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						128
						99
						110
						99
						110
						59
						107
						59
						107
						99
						95
						99
						95
						102
						128
						102
						128
						120
						149
						120
						153
						140
						142
						142
						143
						126
						126
						126
						126
						136
						139
						135
						139
						146
						121
						146
						121
						126
						116
						126
						116
						121
						111
						126
						0
						126
						0
						0
						128
						-2
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 137 148 137 189 0 189 0 148
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 118 129 118 146 104 146 103 129
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						132
						83
						132
						76
						140
						70
						136
						64
						132
						62
						149
						64
						154
						69
						150
						75
						155
						80
						150
						84
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						179
						64
						170
						68
						179
						75
						179
						83
						168
						83
						162
						85
						157
						80
						161
						74
						156
						69
						161
						63
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 141 92 141 101 132 101 132 92
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 170 92 180 92 180 101 170 101
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 141 109 141 118 132 118 132 109
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 170 110 180 110 180 119 170 119
					yourself:
				)
		)
		(if (== ((Inv at: 12) owner?) 470)
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init:
							173
							146
							160
							139
							160
							133
							174
							133
							174
							121
							183
							121
							183
							-2
							319
							-1
							319
							128
							221
							128
							221
							146
							184
							146
							184
							139
							205
							139
							205
							33
							202
							33
							202
							128
							184
							125
							184
							132
							202
							130
							202
							137
							182
							137
							182
							146
						yourself:
					)
					((Polygon new:)
						type: 2
						init: 174 148 319 148 319 189 174 189
						yourself:
					)
			)
		else
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init:
							173
							146
							160
							139
							160
							133
							174
							133
							174
							121
							183
							121
							183
							-2
							319
							-1
							319
							189
							174
							189
							174
							148
							219
							148
							219
							146
							184
							146
							184
							139
							205
							139
							205
							33
							202
							33
							202
							128
							184
							125
							184
							132
							202
							130
							202
							137
							182
							137
							182
							146
						yourself:
					)
			)
			(if (== gHeading 470) (= local0 0))
		)
		(= local44 (- (Random 2 9) 7))
		(= local45 (Random 9 10))
		(= local46 (Random 20 25))
		(wash init: approachVerbs: 2)
		(bedRm init: approachVerbs: 2)
		(ref init: approachVerbs: 2)
		(chap init: approachVerbs: 2)
		(front init: approachVerbs: 2)
		(kitchen init: approachVerbs: 2)
		(flag init: approachVerbs: 2)
		(cells init: approachVerbs: 2)
		(outside init:)
		(gEgo actions: (ScriptID 452 3))
	)
	
	(method (doit &tmp temp0)
		(if script
			(script doit:)
		else
			(if
				(and
					(!= (gRgnMusic number?) 455)
					(== (gRgnMusic prevSignal?) -1)
					(not (gEgo script?))
				)
				(gEgo setScript: changeMusic)
			)
			(cond 
				(
				(u>= (= temp0 (& $7f7e (gEgo onControl: 1))) 1024) (self setScript: takeOff 0 temp0))
				((and temp0 (not (& local0 temp0)))
					(cond 
						((& temp0 $0002)
							(if (== global130 10)
								(proc13_4 1450 1)
							else
								(proc13_4 1450 0)
							)
							(gEgo setMotion: 0)
							(= local0 2)
						)
						((& temp0 $0004) (proc13_4 1450 6) (= local0 4))
						((& temp0 $0008)
							(cond 
								((== gNewGuise 0) (proc13_4 1450 4))
								((== ((Inv at: 12) owner?) 470) (proc13_4 1450 2))
								((== ((Inv at: 12) owner?) gEgo) (proc13_4 1450 3))
								(else (proc13_4 1450 5))
							)
							(gEgo setMotion: 0)
							(= local0 8)
						)
						((& temp0 $0010) (proc13_4 1450 7) (gEgo setMotion: 0) (= local0 16))
						((& temp0 $0020)
							(if (== global130 10)
								(proc13_4 1450 13)
							else
								(proc13_4 1450 12)
							)
							(= local0 34)
						)
						((& temp0 $0040) (proc13_4 1450 14) (gEgo setMotion: 0) (= local0 64))
						((& temp0 $0100) (proc13_4 1450 15) (= local0 256))
					)
				)
			)
		)
	)
)

(instance arrived of Script
	(properties)
	
	(method (cue)
		(proc0_4)
		(gIconBar disable: 5)
		(self dispose:)
	)
)

(instance takeOff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= register
					(cond 
						((& register $0800) 0)
						((& register $4000) 1)
						((& register $2000) 2)
						((& register $1000) 3)
						((& register $0400) 4)
					)
				)
				(if (< register 3)
					(gEgo
						setMotion: MoveTo [local16 register] [local21 register] self
					)
				else
					(= cycles 1)
				)
			)
			(1
				(gClient newRoom: [local1 register])
			)
		)
	)
)

(instance bedRm of Feature
	(properties
		nsTop 125
		nsLeft 210
		nsBottom 150
		nsRight 244
		approachX 218
		approachY 146
	)
	
	(method (handleEvent pEvent)
		(localproc_084c 8)
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (!= theVerb 2) (super doVerb: theVerb &rest))
	)
)

(instance ref of Feature
	(properties
		nsTop 124
		nsLeft 71
		nsBottom 149
		nsRight 122
		approachX 125
		approachY 147
	)
	
	(method (handleEvent pEvent)
		(localproc_084c 2)
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (!= theVerb 2) (super doVerb: theVerb &rest))
	)
)

(instance chap of Feature
	(properties
		nsTop 32
		nsLeft 127
		nsBottom 121
		nsRight 185
		approachX 157
		approachY 93
	)
	
	(method (handleEvent pEvent)
		(localproc_084c 4)
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (!= theVerb 2) (super doVerb: theVerb &rest))
	)
)

(instance front of Feature
	(properties
		nsTop 141
		nsLeft 137
		nsBottom 155
		nsRight 175
		approachX 155
		approachY 147
		lookStr 3407
	)
)

(instance wash of Feature
	(properties
		nsTop 125
		nsLeft 126
		nsBottom 139
		nsRight 145
		approachX 140
		approachY 139
	)
	
	(method (handleEvent pEvent)
		(localproc_084c 16)
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (!= theVerb 2) (super doVerb: theVerb &rest))
	)
)

(instance kitchen of Feature
	(properties
		nsTop 105
		nsLeft 92
		nsBottom 121
		nsRight 122
		approachX 115
		approachY 124
	)
	
	(method (handleEvent pEvent)
		(localproc_084c 32)
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (!= theVerb 2) (super doVerb: theVerb &rest))
	)
)

(instance flag of Feature
	(properties
		nsTop 125
		nsLeft 184
		nsBottom 132
		nsRight 197
		approachX 199
		approachY 129
	)
	
	(method (handleEvent pEvent)
		(localproc_084c 64)
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (!= theVerb 2) (super doVerb: theVerb &rest))
	)
)

(instance cells of Feature
	(properties
		onMeCheck $0080
	)
	
	(method (handleEvent pEvent &tmp pEventX temp1)
		(= temp1
			(cond 
				((< (= pEventX (pEvent x?)) 108) 0)
				((< pEventX 156) 1)
				((< pEventX 203) 2)
				(1 3)
			)
		)
		(= local31 (/ (- (pEvent y?) [local32 temp1]) 9))
		(= approachX [theApproachX temp1])
		(= approachY (+ [local32 temp1] (* local31 9) 4))
		(= local31 (+ local31 [local36 temp1]))
		(super handleEvent: pEvent &rest)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(switch local31
				(local44 (proc255_0 450 0))
				(local45 (proc255_0 450 1))
				(local46 (proc255_0 450 2))
				(else 
					(proc255_0 450 3 82 450 0 0)
				)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance outside of Feature
	(properties
		onMeCheck $0200
		lookStr 16
	)
)

(instance changeMusic of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 60))
			(1
				(gRgnMusic number: 455 loop: -1 play:)
				(= cycles 1)
			)
			(2 (self dispose:))
		)
	)
)
