;;; Sierra Script 1.0 - (do not remove this comment)
(script# 500)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n945)
(use n946)
(use n950)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm500 0
)

(local
	gEgoX
	gEgoY
)
(instance rm500 of Rm
	(properties
		picture 500
	)
	
	(method (init)
		(proc0_4)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 95 121 139 121 182 138 149 165 86 165 56 135
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 0 319 0 319 108 14 104 0 114
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 189 242 189 262 167 319 167
					yourself:
				)
		)
		(gNewFeatures
			add: pyre hedge ring1 ring2 ring3 stand awning secretDoor walls floor
			eachElementDo: #init
		)
		(super init:)
		(ring1 approachVerbs: 3)
		(ring3 approachVerbs: 3)
		(gRgnMusic number: 500 loop: -1 play:)
		(gEgo setScript: enterRoom)
	)
	
	(method (doit)
		(if (and (not (gEgo script?)) (gEgo edgeHit?))
			(= gGEgoEdgeHit (gEgo edgeHit?))
			(gEgo setScript: outAndInAgain)
		)
	)
)

(instance secretDoor of Prop
	(properties
		x 148
		y 101
		view 501
		loop 10
		priority 6
		signal $4010
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 187 36 185 101 148 100 150 36
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 1))
			(3 (gEgo setScript: openDoor))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance pyre of Feature
	(properties
		y 157
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				113
				53
				118
				53
				119
				54
				119
				110
				149
				111
				173
				127
				174
				137
				147
				157
				92
				157
				64
				137
				65
				124
				94
				109
				112
				110
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (not (proc0_5 128))
					(proc13_4 1500 18)
					(proc0_6 128)
				else
					(proc13_4 1500 0)
				)
			)
			(3 (proc13_4 1500 8))
			(4 (proc13_4 1500 12))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance hedge of Feature
	(properties
		y 15
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				1
				16
				14
				7
				24
				8
				38
				4
				46
				7
				57
				5
				63
				8
				72
				7
				76
				6
				89
				7
				99
				5
				106
				5
				145
				5
				169
				6
				173
				4
				193
				5
				205
				7
				214
				5
				223
				6
				318
				7
				319
				14
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance awning of Feature
	(properties
		y 118
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 319 118 239 117 238 94 290 64 319 35
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 6))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance stand of Feature
	(properties
		y 189
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 292 118 315 152 319 152 319 189 216 189 255 149 306 152 283 119
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 5))
			(3 (proc13_4 1500 10))
			(4
				(if (== param2 13)
					(proc13_4 1500 14)
				else
					(proc13_4 1500 13)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance ring1 of Feature
	(properties
		y 64
		approachX 89
		approachY 102
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 84 53 94 53 94 65 84 65
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 7))
			(3 (proc13_4 1500 11))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance ring2 of Feature
	(properties
		y 64
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 164 52 176 52 176 65 164 65
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 7))
			(3 (gEgo setScript: openDoor))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance ring3 of Feature
	(properties
		y 64
		approachX 250
		approachY 107
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 245 53 257 53 257 67 245 67
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 7))
			(3 (proc13_4 1500 11))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance walls of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 19 7 16 319 14 319 33 319 105 10 97 0 101
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 2))
			(3 (proc13_4 1500 9))
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
			init: 0 102 10 97 319 105 319 189 0 189
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1500 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance enterRoom of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					view: 501
					x: 169
					y: 99
					init:
					setLoop: 0
					setCycle: End
				)
				(secretDoor setCycle: End self)
				(= gNewGuise 5)
			)
			(1
				(proc0_2)
				(gEgo
					setCycle: StopWalk 24
					setMotion: PolyPath 170 116 self
				)
			)
			(2
				(secretDoor setCycle: Beg self)
			)
			(3
				(if (not (proc0_5 139))
					(proc13_4 1500 15)
					(proc0_6 139)
					(proc806_1 100)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance outAndInAgain of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(switch (= state newState)
			(0
				(= temp0 (= gEgoX (gEgo x?)))
				(= temp1 (= gEgoY (gEgo y?)))
				(switch gGEgoEdgeHit
					(3 (= temp1 240) (= gEgoY 180))
					(2
						(= temp0 (+ temp0 20))
						(= gEgoX (- gEgoX 20))
					)
					(4
						(= temp0 (- temp0 20))
						(= gEgoX (+ gEgoX 20))
					)
				)
				(proc0_3)
				(gEgo ignoreActors: 1 setMotion: MoveTo temp0 temp1 self)
			)
			(1 (= seconds 4))
			(2
				(gEgo setMotion: MoveTo gEgoX gEgoY self)
			)
			(3
				(if (== gGEgoEdgeHit 2)
					(proc13_4 1500 17)
				else
					(proc13_4 1500 16)
				)
				(= cycles 2)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance openDoor of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 162 110 self)
			)
			(1
				(gEgo view: 28 loop: 6 cel: 2)
				(= cycles 10)
			)
			(2
				(proc0_2)
				(gEgo setMotion: PolyPath 197 108 self)
			)
			(3
				(secretDoor setCycle: End self)
			)
			(4
				(gEgo setMotion: MoveTo 165 108 self)
			)
			(5
				(gEgo setMotion: MoveTo 173 94 self)
			)
			(6
				(self dispose:)
				(gClient newRoom: 70)
			)
		)
	)
)
