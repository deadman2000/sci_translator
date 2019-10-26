;;; Sierra Script 1.0 - (do not remove this comment)
(script# 110)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n992)
(use n994)
(use n999)

(public
	rm110 0
)

(local
	local0
	local1
	[local2 6] = [1110 26 1 1 1]
	[local8 4] = [1110 29 1]
	[local12 4] = [1110 30 1]
	[local16 5] = [1110 31 2 1]
)
(instance rm110 of Rm
	(properties)
	
	(method (init)
		(= global112 71)
		(if
		(and (== global130 11) (proc0_5 64) (>= global155 20))
			(self picture: 803 style 7)
		else
			(self picture: 110 style 10)
		)
		(super init:)
		(if
		(and (== global130 11) (proc0_5 64) (>= global155 20))
			(proc13_4 1110 33)
			(= global146 65)
			(global2 newRoom: 176)
		else
			(Wat section: 4)
			(self
				addObstacle:
					((Polygon new:)
						type: 2
						init: 147 170 188 171 184 183 166 183
						yourself:
					)
			)
			(if (== global126 0)
				(switch global130
					(1
						(cond 
							((not (proc0_5 137)) 0)
							((not (proc0_5 44))
								(proc958_0 128 110 755)
								(self setScript: waitForEncounter 0 1)
							)
						)
					)
					(3
						(if (not (proc0_5 49))
							(Load rsVIEW 55)
							(self setScript: waitForEncounter 0 2)
						)
					)
					(4
						(if (not (proc0_5 47))
							(proc958_0 128 110 755)
							(self setScript: waitForEncounter 0 3)
						)
					)
					(5
						(cond 
							((not (proc0_5 111)))
							((not (proc0_5 50))
								(proc0_6 50)
								(proc958_0 128 106 25)
								(= local0 1)
								(self setScript: (ScriptID 18 3))
							)
							(
								(and
									(not (proc0_5 147))
									(not (proc0_5 55))
									(not (Wat script?))
								)
								(if (< (Random 0 100) 50)
									(if (< (Random 0 100) 50)
										(Load rsVIEW 25)
										(self setScript: (ScriptID 18 4))
									else
										(Load rsVIEW 106)
										(self setScript: (ScriptID 18 5))
									)
								else
									(self
										setScript: waitForMonk 0 (if (< (Random 0 100) 50) 5 else 4)
									)
								)
							)
						)
					)
					(6
						(cond 
							((Wat script?))
							((proc0_5 25)
								(if (not (proc0_5 147))
									(if (< (Random 0 100) 50)
										(Load rsVIEW 106)
										(self setScript: (ScriptID 18 5))
									else
										(self setScript: waitForMonk 0 4)
									)
								)
							)
							((not (proc0_5 55))
								(if (< (Random 0 100) 50)
									(Load rsVIEW 25)
									(self setScript: (ScriptID 18 4))
								else
									(self setScript: waitForMonk 0 5)
								)
							)
						)
					)
					(8
						(if (not (proc0_5 135))
							(Load rsVIEW 53)
							(self setScript: waitForEncounter 0 6)
						)
					)
					(9
						(if (and (proc0_5 36) (not (proc0_5 28)))
							(Load rsVIEW 72)
							(self setScript: waitForEncounter 0 7)
						)
					)
					(11
						(proc958_0 128 160 161 162)
						(ScriptID 20)
						(proc0_3)
						((ScriptID 20)
							view: 160
							loop: 0
							cel: 2
							posn: 75 150
							actions: willActions
							init:
						)
					)
					(12
						(if (and (proc0_5 38) (not (proc0_5 27)))
							(proc0_6 136)
							(self setScript: (ScriptID 18 8))
						)
					)
				)
			)
			(proc806_3 street ridge)
			(proc0_2)
			(gEgo actions: egoActions)
			(switch global12
				(220
					(if (== global108 4)
						(= global116 0)
					else
						(= global116 1)
					)
					(gEgo setScript: fromTheForest)
				)
				(120
					(gEgo setScript: fromTheStreet)
				)
				(100
					(if (> global130 1) (proc0_6 137))
					(gEgo setScript: fromTheForest)
				)
				(else 
					(gEgo posn: 120 155 loop: 6 init:)
					(proc0_6 137)
				)
			)
			(if
				(or
					(!= (gRgnMusic number?) 905)
					(< (gRgnMusic vol?) 127)
				)
				(gRgnMusic number: 905 play:)
			)
		)
	)
	
	(method (doit)
		(cond 
			((gEgo script?))
			((& (gEgo onControl: 1) $0002)
				(if (and (== global130 5) (gEgo mover?) local0)
					(Wat qFight: ((gEgo mover?) x?))
				)
				(gEgo setScript: takeTheLowRoad)
			)
			((gEgo edgeHit?) (gEgo setScript: offScreen))
		)
		(super doit:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1110 13)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance ridge of Feature
	(properties
		lookStr 12
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init:
					0
					145
					319
					64
					319
					91
					199
					123
					184
					119
					163
					127
					157
					137
					127
					146
					169
					160
					319
					177
					319
					189
					0
					189
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance street of Feature
	(properties)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 76 123 319 67 319 94 125 146 74 144
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
		(switch theVerb
			(2
				(if
					(or
						(and
							(global2 script?)
							(!= (global2 script?) waitForEncounter)
							(!= (global2 script?) waitForMonk)
						)
						(Wat script?)
					)
					(proc13_4 1110 15)
				else
					(proc13_4 1110 14)
				)
			)
			(3
				(proc0_3)
				(gEgo setMotion: PolyPath (gEgo x?) 50)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance takeTheLowRoad of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setHeading: 0 self)
			)
			(1
				(gEgo
					setPri: 11
					setLoop: 3
					setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 55) self
				)
			)
			(2
				(if (== (Wat travelSect?) 4)
					(Wat
						enterDir:
						(switch (Wat travelDir?)
							(1 1)
							(3 3)
							(else  2)
						)
					)
				else
					(Wat enterDir: 2)
				)
				(if
					(and
						(== global130 4)
						(proc0_5 48)
						(or (proc0_5 153) (proc0_5 174))
					)
					(global2 newRoom: 160)
				else
					(global2 newRoom: 120)
				)
			)
		)
	)
)

(instance offScreen of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(switch (gEgo edgeHit?)
					(2
						(= global116 1)
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 15) (gEgo y?) self
						)
					)
					(4
						(= global116 0)
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 15) (gEgo y?) self
						)
					)
					(else 
						(= global116 1)
						(gEgo
							setMotion: PolyPath (gEgo x?) (+ (gEgo y?) 55) self
						)
					)
				)
			)
			(1
				(cond 
					(
						(and
							(== global130 4)
							(proc0_5 48)
							(or (proc0_5 153) (proc0_5 174))
						)
						(global2 newRoom: 160)
					)
					((== (gEgo edgeHit?) 4)
						(switch (Wat travelDir?)
							(0 (Wat enterDir: 2))
							(1 (Wat enterDir: 1))
							(3 (Wat enterDir: 3))
						)
						(global2 newRoom: 120)
					)
					(
						(and
							(== global130 1)
							(proc0_5 46)
							(proc0_5 45)
							(proc0_5 44)
						)
						(global2 newRoom: 160)
					)
					(else (gEgo edgeHit: 2) (global2 newRoom: 220))
				)
			)
		)
	)
)

(instance fromTheForest of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo posn: 46 233 init: setMotion: PolyPath 107 150 self)
			)
			(1 (gEgo setHeading: 45 self))
			(2
				(cond 
					((and (== global130 1) (not (proc0_5 137))) (self setScript: (ScriptID 18 9) self))
					((== global130 11) (client setScript: day11Script))
					((and (proc0_5 38) (not (proc0_5 27))) (client setScript: seeKnight))
					(else (proc0_4) (self dispose:))
				)
			)
			(3
				(global2 setScript: waitForEncounter 0 1)
				(self dispose:)
			)
		)
	)
)

(instance fromTheStreet of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgoHead setPri: 11)
				(gEgo
					posn: 119 195
					init:
					setPri: 11
					setLoop: 2
					setMotion: MoveTo 119 143 self
				)
			)
			(1
				(gEgoHead setPri: -1)
				(gEgo setPri: -1 setMotion: MoveTo (gEgo x?) 160 self)
			)
			(2
				(gEgo setLoop: -1 setHeading: 45 self)
			)
			(3
				(cond 
					((and (== global130 1) (not (proc0_5 137))) (self setScript: (ScriptID 18 9) self))
					((== global130 11) (client setScript: day11Script))
					((and (proc0_5 38) (not (proc0_5 27))) (client setScript: seeKnight))
					(else
						(if (proc0_5 70) (proc0_7 70) (proc13_4 1110 3))
						(proc0_4)
						(self dispose:)
					)
				)
			)
			(4
				(global2 setScript: waitForEncounter 0 1)
				(self dispose:)
			)
		)
	)
)

(instance waitForEncounter of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 10 20)))
			(1
				(if (not (gEgo script?))
					(client
						setScript:
							(switch register
								(1
									(proc0_6 44)
									(ScriptID 18 0)
								)
								(2
									(proc0_6 49)
									(ScriptID 18 1)
								)
								(3
									(proc0_6 47)
									(ScriptID 18 2)
								)
								(6
									(proc0_6 135)
									(ScriptID 18 6)
								)
								(7
									(proc0_6 28)
									(ScriptID 18 7)
								)
							)
					)
				else
					(self dispose:)
				)
			)
		)
	)
)

(instance waitForMonk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 10 20)))
			(1
				(if (not (gEgo script?))
					(switch register
						(4
							(Load rsVIEW 106)
							(client setScript: (ScriptID 18 5))
						)
						(5
							(Load rsVIEW 25)
							(client setScript: (ScriptID 18 4))
						)
					)
				else
					(self dispose:)
				)
			)
		)
	)
)

(instance blewHornDay11 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: (ScriptID 5 1) self)
			)
			(1 (= ticks 12))
			(2
				(proc851_0 2 @local16 1 0 14 1 self)
			)
			(3 (global2 newRoom: 171))
		)
	)
)

(instance day11Script of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(if (proc0_5 64)
					(proc851_0 1 @local8 14 0 self)
				else
					(= global155 0)
					(proc0_6 64)
					(proc851_0 1 @local2 14 0 self)
				)
			)
			(2 (= ticks 60))
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance seeKnight of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 12))
			(1 (proc13_4 1110 4 self))
			(2 (proc13_4 1110 5 self))
			(3 (proc13_4 1110 6 self))
			(4
				(gEgo setScript: takeTheLowRoad)
				(self dispose:)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (and (== theVerb 4) (== param2 1))
			(cond 
				((== global130 11) (global2 setScript: blewHornDay11) 1)
				(
					(proc999_5
						(global2 script?)
						0
						waitForEncounter
						waitForMonk
					)
					1
					(if local1
						(= local1 0)
						(proc13_4 1110 8)
					else
						(= local1 1)
						(proc13_4 1110 7)
					)
				)
				(else
					1
					(switch (Wat whichChar?)
						(9 (proc13_4 1110 9))
						(1 (proc13_4 1110 10))
						(3 (proc13_4 1110 10))
						(else  (proc13_4 1110 11))
					)
				)
			)
		)
	)
)

(instance willActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(if (== theVerb 5) 1 (proc851_0 1 @local12 14 0))
	)
)
