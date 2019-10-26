;;; Sierra Script 1.0 - (do not remove this comment)
(script# 455)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	rm455 0
)

(instance rm455 of Rm
	(properties
		picture 455
		north 450
	)
	
	(method (init)
		(proc0_2 2)
		(super init:)
		(gEgo posn: 130 109 init:)
		(proc0_4)
		(if (!= global130 10)
			(if (== ((Inv at: 13) owner?) global11) (robes init:))
			(if (== ((Inv at: 13) owner?) (+ global11 1))
				(robes init: lookStr: 26)
			)
			(robes approachVerbs: 3)
		)
		(tub init:)
		(shelves init:)
		(table init:)
		(buckets init:)
		(jug init:)
		(water init:)
		(rShelves init:)
		(door init: approachVerbs: 3)
		(ldry init:)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 62 148 104 119 157 119 157 128 138 151
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 187 125 247 125 247 161 171 161
					yourself:
				)
				((Polygon new:)
					type: 3
					init: 125 105 59 145 63 172 253 171 250 112 158 110
					yourself:
				)
		)
		(gEgo actions: (ScriptID 452 3))
	)
)

(instance robes of View
	(properties
		x 202
		y 111
		sightAngle 45
		approachX 202
		approachY 121
		lookStr 10
		view 455
		loop 1
		signal $4101
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(rustleSound play:)
				(if (== ((Inv at: 13) owner?) global11)
					(proc806_1 50)
					(proc13_4 1455 2 1)
				else
					(proc13_4 1455 3 1)
				)
				(gEgo get: 13)
				(self dispose:)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance tub of Feature
	(properties
		x 110
		y 134
		sightAngle 45
		onMeCheck $0002
		lookStr 8
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1455 0))
			(4
				(switch param2
					(13 (proc13_4 1455 4 1))
					(18
						(gClient setScript: series 0 1455 20 21)
					)
					(else  (proc13_4 1455 19 1))
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance shelves of Feature
	(properties
		x 85
		y 114
		sightAngle 45
		onMeCheck $0008
		lookStr 9
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1455 1 1))
			(4
				(table doVerb: theVerb param2)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance table of Feature
	(properties
		x 214
		y 139
		sightAngle 45
		onMeCheck $0004
		lookStr 11
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1455 5 1))
			(4
				(switch param2
					(12 (proc13_4 1455 25 1))
					(11 (proc13_4 1455 22 1))
					(else 
						(if (and (gEgo has: 13) (!= param2 13))
							(gClient setScript: series 0 1455 15 16)
						else
							(proc13_4 1455 17 1)
						)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance buckets of Feature
	(properties
		x 199
		y 107
		sightAngle 45
		onMeCheck $0010
		lookStr 12
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1455 6 1))
			(4
				(table doVerb: theVerb param2)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance jug of Feature
	(properties
		x 94
		y 116
		sightAngle 45
		onMeCheck $0040
		lookStr 13
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1455 6 1))
			(4
				(table doVerb: theVerb param2)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance water of Feature
	(properties
		sightAngle 45
		onMeCheck $0020
		lookStr 14
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(4
				(if (== param2 18)
					(gClient setScript: series 0 1455 20 21)
				else
					(super doVerb: theVerb param2)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(if (IsObject param1)
			(= x (param1 x?))
			(= y (+ (param1 y?) 10))
		)
		(super onMe: param1 param2)
	)
)

(instance rShelves of Feature
	(properties
		x 198
		y 105
		sightAngle 45
		onMeCheck $0080
		lookStr 9
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1455 1 1))
			(4
				(switch param2
					(12
						(gClient setScript: series 0 1455 23 24)
					)
					(11 (proc13_4 1455 22 1))
					(13
						(gClient setScript: putBack)
					)
					(else  (proc13_4 1455 18 1))
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance putBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 202 121 self)
			)
			(1
				(rustleSound play:)
				(gEgo put: 13 global11)
				(proc806_1 -50)
				(robes init:)
				(proc0_4)
			)
		)
	)
)

(instance door of Feature
	(properties
		onMeCheck $0100
		approachX 134
		approachY 107
		lookStr 27
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(gClient newRoom: 450)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance ldry of Feature
	(properties
		onMeCheck $0001
		lookStr 7
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 theStart theStart_2)
		(proc0_3)
		(= start theStart)
		(super init: param1 param2 param3)
		(= start theStart_2)
	)
	
	(method (changeState newState)
		(if (<= (= state newState) start)
			(proc13_4 register state self)
		else
			(proc0_4)
			(self dispose:)
		)
	)
	
	(method (cue param1)
		(if (not param1) (= start state))
		(super cue:)
	)
)

(instance rustleSound of Sound
	(properties
		flags $0001
		number 462
	)
)
