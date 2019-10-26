;;; Sierra Script 1.0 - (do not remove this comment)
(script# 440)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	rm440 0
)

(local
	[local0 5] = [1440 0 1 2]
	[local5 5] = [1440 2 1 2]
	[local10 6] = [1440 4 1 2 1]
	[local16 4] = [1440 8 1]
	[local20 6] = [1440 12 1 2 1]
	[local26 4] = [1440 15 1]
	[local30 8] = [1440 38 2 1 2 1 2]
	[local38 9] = [1440 44 1 2 1 2 1 1]
	[local47 8] = [1440 50 1 2 1 2 1]
	[local55 5] = [1440 55 1 1]
)
(instance rm440 of StdRoom
	(properties
		picture 440
		style $0064
		east 260
		south 260
	)
	
	(method (init &tmp temp0 temp1)
		(proc0_3)
		(= script arrived)
		(arrived client: self)
		(= temp1 0)
		(switch gNewGuise
			(0 (= temp0 67))
			(1 (= temp0 69))
			(2 (= temp0 74))
			(3 (= temp0 74))
			(4 (= temp0 68))
			(5 (= temp0 50) (= temp1 51))
			(6 (= temp0 48) (= temp1 49))
		)
		(proc0_2 0 temp0 temp1)
		(if (not temp1) (gEgo setCycle: Walk))
		(gEgo actions: noBig setStep: 2 1)
		(super init: 1)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						102
						189
						0
						189
						0
						0
						319
						0
						319
						108
						295
						103
						277
						102
						269
						107
						272
						115
						253
						114
						243
						119
						258
						125
						258
						128
						231
						131
						218
						126
						212
						128
						195
						122
						173
						129
						181
						138
						204
						145
						184
						157
						172
						152
						143
						167
						134
						165
						117
						177
						91
						185
					yourself:
				)
		)
		(if (or (== gHeading 450) (== gHeading 460))
			(gEgo posn: 175 121 setMotion: MoveTo 218 138 arrived)
		else
			(gEgo
				setScript: changeMusic
				posn: 325 164
				setMotion: MoveTo 309 160 arrived
			)
		)
		(gSFX number: 905 loop: -1 play:)
		(facade init:)
		(fDoor init: approachVerbs: 3)
		(entrance init:)
		(maryTop init:)
		(maryB init:)
		(privies init:)
		(build init:)
		(maze init:)
		(trees init:)
		(town init:)
	)
	
	(method (doit &tmp temp0)
		(cond 
			(script (script doit:))
			((= temp0 ((User alterEgo?) edgeHit?)) (self setScript: walkOut))
		)
	)
	
	(method (dispose)
		(gSFX stop:)
		(super dispose: &rest)
		(gEgo script: 0)
	)
)

(instance arrived of Script
	(properties
		state $0000
	)
	
	(method (cue)
		(if (or (!= gHeading 460) (!= gNewGuise 6) state)
			(proc0_4)
			(if (== global130 10)
				(gIconBar disable: 5)
				(= global145 14)
				(gClient south: 170 east: 170)
			)
			(self dispose:)
		else
			(proc13_4 1440 7 self)
			(= state 1)
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					ignoreActors: 1
					setMotion: MoveTo (+ (gEgo x?) 18) (+ (gEgo y?) 16) self
				)
			)
			(1
				(gClient newRoom: (gClient south?))
			)
		)
	)
)

(instance monkLeaves of Script
	(properties)
	
	(method (doit)
		(if (& (gEgo onControl: 1) $0002)
			(self dispose:)
			(changeMusic next: 0)
			(gClient setScript: monkAtDoor)
		)
	)
)

(instance monkAtDoor of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_6 94)
				(proc806_1 10)
				(gEgo setMotion: MoveTo 190 129 self)
				(doorMonk
					init:
					setCycle: Walk
					setMotion: MoveTo 183 126 self
				)
			)
			(2
				(proc851_0 @local0 10 999 self)
			)
			(3
				(doorMonk setMotion: MoveTo 325 164)
				(gEgo setMotion: MoveTo 175 121 self)
			)
			(4 (gClient newRoom: 450))
		)
	)
)

(instance doKnock of Script
	(properties
		register 1
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 183 126 self)
			)
			(1 (knockSound play: self))
			(2
				(gEgo setMotion: MoveTo 190 129 self)
			)
			(3
				(proc0_9 gEgo fDoor)
				(= seconds 2)
			)
			(4 (self dispose:))
		)
	)
)

(instance atDoor of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: doKnock self)
				(if (or (== register 8) (== register 2)) (++ state))
			)
			(1
				(doorMonk
					init:
					setCycle: Walk
					setMotion: MoveTo 183 126 self
				)
			)
			(2
				(switch register
					(0
						(proc851_0 @local20 10 999 self)
					)
					(1
						(proc851_0 @local5 999 10 self)
						(doorMonk setMotion: MoveTo 175 121)
						(= state (+ state 2))
					)
					(2
						(proc13_4 1440 58 self)
						(= state (+ state 3))
					)
					(3
						(proc851_0 @local0 10 999 self)
					)
					(4
						(proc851_0 @local10 10 999 self)
					)
					(5
						(proc851_0 @local16 10 0 self)
						(doorMonk setMotion: MoveTo 175 121)
						(= state (+ state 2))
					)
					(6
						(proc851_0 @local26 10 0 self)
						(doorMonk setMotion: MoveTo 175 121)
						(= state (+ state 2))
					)
					(7
						(proc851_0 @local38 10 999 self)
						(doorMonk setMotion: MoveTo 175 121)
						(= state (+ state 2))
					)
					(8
						(proc851_0 @local30 999 10 self)
						(= state (+ state 3))
					)
				)
			)
			(3
				(doorMonk setMotion: MoveTo 175 121)
				(gEgo
					moveSpeed: (doorMonk moveSpeed?)
					cycleSpeed: (doorMonk moveSpeed?)
					setMotion: MoveTo 175 121 self
				)
			)
			(4
				(gClient
					newRoom:
						(if
						(or (== gNewGuise 2) (== gNewGuise 3) (== gNewGuise 6))
							460
						else
							450
						)
				)
			)
			(5
				(doorMonk setMotion: MoveTo 175 121 self)
			)
			(6
				(proc0_4)
				(if (and (!= register 8) (!= register 2))
					(doorMonk dispose:)
				)
				(self dispose:)
			)
		)
	)
)

(instance noAnswer of TScript
	(properties)
	
	(method (init param1 param2 param3 theStart)
		(= start 0)
		(super init: param1 param2 param3)
		(= start theStart)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: doKnock self)
			)
			(1
				(if (<= (++ register) start) (-- state))
				(proc13_4 1440 (- register 1) self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance getTheo of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: doKnock self)
			)
			(1
				(doorMonk
					init:
					setCycle: Walk
					setMotion: MoveTo 183 126 self
				)
			)
			(2
				(proc851_0 @local47 10 999 self)
			)
			(3
				(doorMonk setMotion: MoveTo 175 121 self)
			)
			(4
				(doorMonk script: self)
				(client script: 0)
				(= client doorMonk)
				(proc0_4)
				(= seconds 15)
			)
			(5
				(proc0_3)
				(gEgo setMotion: 0)
				(doorMonk setMotion: PolyPath (gEgo x?) (gEgo y?))
				(= ticks (- (* (gEgo distanceTo: doorMonk) 4) 60))
				(if (> ticks 200) (= ticks 200))
			)
			(6
				(doorMonk setMotion: 0)
				(proc851_0 @local55 10 0 self)
			)
			(7
				(= global145 13)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance doorMonk of Actor
	(properties
		x 176
		y 123
		yStep 1
		view 50
		signal $6000
		illegalBits $0000
		xStep 2
	)
)

(instance facade of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0010
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(gClient setScript: series 0 1440 17 19)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance fDoor of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0004
		approachX 191
		approachY 128
		lookStr 20
	)
	
	(method (doVerb theVerb param2)
		(if (!= theVerb 3)
			(super doVerb: theVerb param2)
		else
			(switch gNewGuise
				(0
					(monkAtDoor state: 3 client: gClient)
					(gClient script: monkAtDoor)
					(gEgo setMotion: MoveTo 175 121 monkAtDoor)
				)
				(1
					(gClient
						setScript: atDoor 0 (if (atDoor register?) 2 else 1)
					)
				)
				(4
					(cond 
						((== global130 8)
							(if (not (proc0_5 89))
								(proc0_6 89)
								(gClient setScript: noAnswer 0 9 9)
							)
						)
						((proc0_5 90) (gClient setScript: noAnswer 0 43 43))
						(1 (proc0_6 90) (gClient setScript: atDoor 0 8))
					)
				)
				(5
					(cond 
						((== global130 8) (gClient setScript: noAnswer 0 10 11))
						((== (doorMonk script?) getTheo) (proc13_4 1440 57 1))
						(
							(not
								(if (and (not (== global130 5)) (== global130 6))
									(not (proc0_5 25))
								)
							)
							(gClient setScript: getTheo)
						)
						((proc0_5 94)
							(monkAtDoor state: 3 client: gClient)
							(gClient script: monkAtDoor)
							(gEgo setMotion: MoveTo 175 121 monkAtDoor)
						)
						(1
							(monkLeaves dispose:)
							(changeMusic next: 0)
							(gClient setScript: monkAtDoor)
						)
					)
				)
				(6
					(if (proc0_5 93)
						(gClient setScript: atDoor 0 5)
					else
						(proc0_6 93)
						(gClient setScript: atDoor 0 4)
					)
				)
				(else 
					(cond 
						(
							(or
								(and (proc0_5 91) (== gNewGuise 3))
								(and (proc0_5 92) (== gNewGuise 2))
							)
							(if (== gNewGuise 3)
								(proc0_6 92)
								(proc0_7 91)
							else
								(proc0_6 91)
								(proc0_7 92)
							)
							(gClient setScript: atDoor 0 7)
						)
						((or (proc0_5 91) (proc0_5 92)) (gClient setScript: atDoor 0 6))
						(1
							(if (== gNewGuise 3) (proc0_6 92) else (proc0_6 91))
							(gClient setScript: atDoor 0 0)
						)
					)
				)
			)
		)
	)
)

(instance entrance of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0008
		lookStr 21
	)
)

(instance maryTop of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0020
		lookStr 22
	)
)

(instance maryB of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0040
		lookStr 23
	)
)

(instance privies of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0080
		lookStr 24
	)
)

(instance build of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0100
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(gClient setScript: series 0 1440 26 27)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance maze of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0200
		lookStr 29
	)
)

(instance trees of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0400
		lookStr 31
	)
)

(instance town of Feature
	(properties
		x 125
		y 110
		sightAngle 45
		onMeCheck $0800
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(gClient setScript: series 0 1440 32 33)
		else
			(super doVerb: theVerb param2)
		)
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

(instance noBig of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(cond 
				((and (== theVerb 4) (== param2 8))
					(if (== gNewGuise 2)
						(= gNewGuise 3)
						(proc13_4 1804 22)
					else
						(gDoVerbCode doit: theVerb param2)
					)
					1
				)
				((and (== theVerb 4) (== param2 1)) (proc13_4 1005 3 1) 1)
			)
		)
	)
)

(instance changeMusic of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if
					(and
						(== gNewGuise 5)
						(or
							(== global130 5)
							(and (== global130 6) (not (proc0_5 25)))
						)
						(not (proc0_5 94))
					)
					(self setScript: monkLeaves)
					(= next monkLeaves)
				)
				(gRgnMusic number: 461 loop: 1 play: self)
			)
			(1 (= ticks 60))
			(2
				(gRgnMusic number: 455 loop: -1 play:)
				(= cycles 1)
			)
			(3 (self dispose:))
		)
	)
)

(instance knockSound of Sound
	(properties
		flags $0001
		number 933
	)
)
