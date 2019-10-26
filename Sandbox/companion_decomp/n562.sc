;;; Sierra Script 1.0 - (do not remove this comment)
(script# 562)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	tunnel3 0
)

(local
	local0
	local1
	[local2 9] = [1561 28 1 2 1 1 2 1]
	[local11 6] = [1561 25 1 2 1]
	[local17 6] = [-1 3492 11 -1 3496 12]
	[local23 3] = [-1 3500 13]
)
(procedure (localproc_000e)
	(proc13_6 11)
	(proc13_4 &rest 80 {Hal})
)

(procedure (localproc_0023)
	(proc13_6 12)
	(proc13_4 &rest 80 {Hob})
)

(procedure (localproc_0038)
	(proc13_6 13)
	(proc13_4 &rest 80 {Dicken})
)

(instance tunnel3 of Rm
	(properties
		picture 562
		style $800a
		north 561
	)
	
	(method (init)
		(= local0 0)
		(super init: &rest)
		(= local1 global34)
		(= global34 0)
		(gIconBar disable: 5 3)
		(Load rsVIEW 562)
		(Load rsSCRIPT 930)
		(DoSound 19 20)
		(proc0_4)
		(switch gHeading
			(560
				(gEgo posn: 143 175 init:)
				(proc0_2)
				(if
					(and
						(!= global130 10)
						(or (proc0_5 125) (proc0_5 56))
					)
					(proc0_3)
					(global1 setCursor: global21 1 10 25)
					(sonHal
						setCycle: SyncWalk
						init:
						setMotion: PFollow gEgo 30
					)
					(sonHob
						setCycle: SyncWalk
						init:
						setMotion: PFollow sonHal 15
					)
					(sonDicken
						setCycle: SyncWalk
						init:
						setMotion: PFollow sonHob 10
					)
					(gClient setScript: onwardsHo)
				)
			)
			(561
				(proc0_3)
				(= local0 1)
				(gEgo
					init:
					view: 562
					setLoop: (if (== gNewGuise 5) 2 else 0)
					posn: 169 125
					setCycle: Fwd
				)
				(proc0_2)
				(if
					(and
						(!= global130 10)
						(or (proc0_5 125) (proc0_5 56))
					)
					(proc0_3)
					(sonHal
						view: 562
						setLoop: 2
						setCycle: SyncWalk
						posn: 166 111
						init:
						setMotion: PFollow gEgo 30
					)
					(sonHob
						view: 562
						setLoop: 2
						setCycle: SyncWalk
						posn: 167 95
						init:
						setMotion: PFollow sonHal 12
					)
					(sonDicken
						view: 562
						setLoop: 2
						setCycle: SyncWalk
						posn: 169 88
						init:
						setMotion: PFollow sonHob 10
					)
					(gClient setScript: theLeader)
				else
					(gClient setScript: walkIn)
				)
			)
			(else 
				(global1 setCursor: 0 1 10 25)
				(proc0_2 (gEgo loop?) 0 1)
				(gEgo posn: 146 150 init:)
			)
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						0
						189
						0
						-2
						319
						-1
						319
						81
						319
						189
						262
						189
						255
						181
						248
						171
						231
						166
						196
						153
						173
						129
						176
						100
						169
						100
						156
						100
						147
						108
						116
						136
						74
						164
						59
						189
					yourself:
				)
		)
		(if (!= (gRgnMusic number?) 560)
			(gRgnMusic number: 560 loop: -1 play:)
		)
		(proc806_3 tunnelWall)
	)
	
	(method (doit)
		(if (and (< (gEgo y?) 150) (!= local0 1))
			(= local0 1)
			(proc0_3)
			(gEgo setScript: changeTunnels)
		)
		(if (and (> (gEgo y?) 186) (!= local0 1))
			(= local0 1)
			(proc0_3)
			(gEgo setScript: backAgain)
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(= global34 local1)
		(sonHal setMotion: 0)
		(sonHob setMotion: 0)
		(sonDicken setMotion: 0)
		(super dispose:)
		(DoSound 19 0)
		(DisposeScript 971)
		(proc0_4)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1561 48))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance tunnelWall of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 319 0 319 189 0 189 0 0
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1561 49))
			(3 (proc13_4 1561 50))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonHal of Actor
	(properties
		x 166
		y 189
		view 434
		loop 3
		cel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1561 34 self))
			(3
				(proc13_4 1561 47 self)
				(proc13_6 0)
			)
			(5
				(localproc_000e 1561 12 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_000e 1561 13 self)
						(proc13_6 0)
					)
					(2
						(localproc_000e 1561 14 self)
						(proc13_6 0)
					)
					(14
						(localproc_000e 1561 14 self)
						(proc13_6 0)
					)
					(12
						(localproc_000e 1561 15 self)
						(proc13_6 0)
					)
					(18
						(localproc_000e 1561 16 self)
						(proc13_6 0)
					)
					(10
						(localproc_000e 1561 16 self)
						(proc13_6 0)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonHob of Actor
	(properties
		x 111
		y 195
		view 434
		loop 3
		cel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1561 34 1))
			(3
				(proc13_4 1561 47 self)
				(proc13_6 0)
			)
			(5
				(localproc_0023 1561 17 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_0023 1561 18 self)
						(proc13_6 0)
					)
					(2
						(localproc_0023 1561 19 self)
						(proc13_6 0)
					)
					(14
						(localproc_0023 1561 19 self)
						(proc13_6 0)
					)
					(12
						(localproc_0023 1561 20 self)
						(proc13_6 0)
					)
					(18
						(localproc_0023 1561 21 self)
						(proc13_6 0)
					)
					(10
						(localproc_0023 1561 21 self)
						(proc13_6 0)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance sonDicken of Actor
	(properties
		x 135
		y 210
		view 434
		loop 3
		cel 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1561 34 1))
			(3
				(proc13_4 1561 47 self)
				(proc13_6 0)
			)
			(5
				(localproc_0038 1561 22 self)
				(proc13_6 0)
			)
			(4
				(switch param2
					(0
						(localproc_0038 1561 23 self)
						(proc13_6 0)
					)
					(2
						(localproc_0038 1561 24 self)
						(proc13_6 0)
					)
					(14
						(localproc_0038 1561 24 self)
						(proc13_6 0)
					)
					(12
						(gClient setScript: dickenPuzBoxTalk)
					)
					(18
						(gClient setScript: waterOrFireRingTalk)
					)
					(10
						(gClient setScript: waterOrFireRingTalk)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance cannotUsePuzbox of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 4)
			(switch param2
				(1 (proc13_4 1561 46))
			)
		)
	)
)

(instance dickenPuzBoxTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 2))
			(1
				(proc851_0 2 @local2 @local23 0 @local17 1 self)
			)
			(2
				(proc0_4)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance waterOrFireRingTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 2))
			(1
				(proc851_0 2 @local11 @local23 0 @local17 1 self)
			)
			(2
				(proc0_4)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance changeTunnels of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					view: 562
					setLoop: (if (== gNewGuise 5) 3 else 1)
					setCycle: Walk
					setMotion: MoveTo 167 113 self
				)
			)
			(1
				(gClient newRoom: 561)
				(self dispose:)
			)
		)
	)
)

(instance backAgain of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setCycle: Walk
					setMotion: MoveTo (gEgo x?) 240 self
				)
			)
			(1
				(gClient newRoom: 560)
				(self dispose:)
			)
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: PolyPath 160 159 self)
			)
			(1
				(proc0_4)
				(global1 setCursor: 0 1 10 25)
				(proc0_2
					2
					(if (== gNewGuise 5) 23 else 0)
					(if (== gNewGuise 5) 24 else 1)
				)
				(= local0 0)
				(self dispose:)
			)
		)
	)
)

(instance theLeader of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: PolyPath 160 240 self)
			)
			(1
				(gClient newRoom: 560)
				(self dispose:)
			)
		)
	)
)

(instance onwardsHo of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: PolyPath 160 111 self)
			)
			(1
				(gClient newRoom: 561)
				(self dispose:)
			)
		)
	)
)
