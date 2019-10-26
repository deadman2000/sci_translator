;;; Sierra Script 1.0 - (do not remove this comment)
(script# 534)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	Harry 0
)

(local
	[local0 9] = [541 0 2 4 22 31 25 23 5]
	[local9 4] = [1534 1 1]
	[local13 4] = [1534 16 1]
	[local17 4] = [1534 17 1]
	[local21 6] = [1534 13 2 1 2]
	[local27 4] = [1534 12 1]
	[local31 9] = [1534 2 1 2 2 2 2 1]
	[local40 5] = [1534 10 2 1]
	[local45 5] = [1534 8 2 1]
	[local50 4] = [1534 30 1]
	[local54 6] = [1534 23 2 1 2]
	[local60 4] = [1534 18 1]
	[local64 6] = [1534 19 1 2 1]
	[local70 4] = [1534 22 1]
	[local74 4] = [1534 27 1]
	[local78 4] = [1534 29 1]
	[local82 4] = [1534 28 1]
	local86
)
(instance Harry of Prop
	(properties
		x 248
		y 183
		approachX 190
		approachY 175
		view 537
		priority 15
		signal $4810
		cycleSpeed 1
	)
	
	(method (init)
		(super init:)
		(self setScript: hDrink approachVerbs: 5 4 3)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1534 0))
			(5
				(cond 
					((gEgo has: 14) (proc851_0 @local13 @local0))
					((proc0_5 124) (proc851_0 @local17 @local0))
					((== gHeading 540)
						(if local86
							(proc851_0 @local21 999 @local0 self)
						else
							(= local86 1)
							(proc851_0 @local27 @local0)
						)
					)
					(local86 (proc851_0 @local40 999 @local0 self))
					((proc0_5 167) (proc851_0 @local45 999 @local0 self))
					(else
						(= local86 1)
						(proc0_6 167)
						(proc851_0 @local31 999 @local0)
					)
				)
			)
			(3
				(cond 
					((gEgo has: 14) (proc851_0 @local13 @local0))
					((proc0_5 124) (proc851_0 @local17 @local0))
					(else (proc851_0 @local9 @local0))
				)
			)
			(4
				(switch param2
					(0
						(cond 
							((gEgo has: 14) (proc851_0 @local13 @local0))
							((proc0_5 124) (proc851_0 @local60 @local0))
							(else (proc851_0 @local64 @local0 999))
						)
					)
					(11
						(if (proc0_5 124)
							(proc851_0 @local50 @local0)
						else
							(proc851_0 @local54 999 @local0)
						)
					)
					(2
						(if (proc0_5 124)
							(proc851_0 @local50 @local0)
						else
							(proc851_0 @local70 @local0)
						)
					)
					(14
						(proc851_0 @local74 @local0)
					)
					(13
						(proc851_0 @local78 @local0)
					)
					(12
						(proc851_0 @local82 @local0)
					)
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
	
	(method (cue)
		(gClient newRoom: 540)
	)
)

(instance hDrink of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 3 18)))
			(1 (Harry setCycle: End self))
			(2 (= ticks (Random 20 60)))
			(3 (Harry setCycle: Beg self))
			(4
				(mugSound play:)
				(= cycles 1)
				(= state -1)
			)
		)
	)
)

(instance mugSound of Sound
	(properties
		flags $0001
		number 457
	)
)
