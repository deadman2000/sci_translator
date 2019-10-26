;;; Sierra Script 1.0 - (do not remove this comment)
(script# 15)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n945)
(use n992)
(use n998)
(use n999)

(public
	fulk 0
)

(local
	[local0 8] = [1015 0 2 1 2 1 2]
	[local8 8] = [1015 5 2 1 2 1 2]
	[local16 4] = [1015 13 1]
	[local20 4] = [1015 15 1]
	[local24 4] = [1015 16 1]
	[local28 4] = [1015 26 1]
	[local32 4] = [1015 17 1]
	[local36 4] = [1015 18 1]
	[local40 4] = [1015 19 1]
	[local44 4] = [1015 20 1]
	[local48 4] = [1015 21 1]
	[local52 4] = [1015 22 1]
	[local56 4] = [1015 24 1]
	[local60 4] = [1015 23 1]
)
(instance fulk of Actor
	(properties
		view 674
		xStep 2
	)
	
	(method (doVerb theVerb param2)
		(switch global11
			(670
				(doVerb670 doit: theVerb param2 &rest)
			)
			(680
				(doVerb680 doit: theVerb param2 &rest)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance chip of Actor
	(properties
		x 160
		y 210
		view 16
		loop 3
	)
)

(instance doVerb670 of Code
	(properties)
	
	(method (doit param1 param2 &tmp monasteryFulkStatus)
		(= monasteryFulkStatus (Monastery fulkStatus?))
		(switch param1
			(2
				(if (== monasteryFulkStatus 0)
					(proc13_4 1015 10)
				else
					(proc13_4 1015 11)
				)
			)
			(5
				(switch monasteryFulkStatus
					(0 (proc13_4 1015 14))
					(1
						(proc851_0 @local20 (Monastery tFULK?) 0)
					)
					(else 
						(if (gEgo has: 17)
							(proc851_0 @local24 (Monastery tFULK?) 0)
						else
							(proc851_0 @local28 (Monastery tFULK?) 0)
						)
					)
				)
			)
			(3
				(if (== monasteryFulkStatus 0)
					(proc13_4 1015 12)
				else
					(proc851_0 @local16 (Monastery tFULK?) 0)
				)
			)
			(4
				(switch param2
					(0
						(switch monasteryFulkStatus
							(0 (proc13_4 1015 27))
							(1
								(proc851_0 @local32 (Monastery tFULK?) 0)
							)
							(else 
								(proc851_0 @local36 (Monastery tFULK?) 0)
							)
						)
					)
					(2
						(switch monasteryFulkStatus
							(0 (proc13_4 1015 27))
							(1
								(proc851_0 @local40 (Monastery tFULK?) 0)
							)
							(else 
								(proc851_0 @local44 (Monastery tFULK?) 0)
							)
						)
					)
					(14
						(switch monasteryFulkStatus
							(0 (proc13_4 1015 27))
							(1
								(proc851_0 @local48 (Monastery tFULK?) 0)
							)
							(else 
								(proc851_0 @local52 (Monastery tFULK?) 0)
								(gEgo put: 14 -1)
							)
						)
					)
					(10
						(gEgo setScript: killEgoWithRing)
					)
					(17
						(if (== monasteryFulkStatus 0)
							(proc13_4 1015 27)
						else
							(proc851_0 @local56 (Monastery tFULK?) 0)
						)
					)
					(16
						(if (== monasteryFulkStatus 0)
							(proc13_4 1015 25)
						else
							(global2 setScript: giveItToHim)
						)
					)
					(else 
						(switch monasteryFulkStatus
							(0 (proc13_4 1015 27))
							(1
								(proc851_0 @local32 (Monastery tFULK?) 0)
							)
							(else 
								(proc851_0 @local36 (Monastery tFULK?) 0)
							)
						)
					)
				)
			)
		)
	)
)

(instance doVerb680 of Code
	(properties)
)

(instance leaveNow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== ((ScriptID 15) view?) 674)
					((ScriptID 15) setCycle: CT 6 -1 self)
				else
					(++ state)
					(self cue:)
				)
			)
			(1
				((ScriptID 15) view: 671 loop: 2 cel: 0)
				(= cycles 3)
			)
			(2
				(proc851_0 @local0 999 (Monastery tFULK?) self)
			)
			(3
				(Monastery fulkStatus: 3)
				((ScriptID 15)
					view: 671
					loop: 2
					setCycle: Walk
					setMotion: PolyPath 106 250
				)
				(gEgo setMotion: PolyPath 126 250 self)
			)
			(4 (self dispose:))
		)
	)
)

(instance killEgoWithRing of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(chip
					init:
					setCycle: Walk
					setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 15) self
				)
			)
			(1
				(proc851_0 @local60 11 0 self)
			)
			(2
				(== global145 20)
				(global2 newRoom: 170)
			)
		)
	)
)

(instance giveItToHim of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 165 169 self)
			)
			(1
				(proc0_9 gEgo (ScriptID 15))
				(= cycles 10)
			)
			(2
				(gEgo setMotion: PolyPath 202 172 self)
			)
			(3
				(proc0_9 gEgo (ScriptID 15) self)
				(proc806_1 300)
				(gEgo put: 16 -1)
			)
			(4
				(if (gEgo has: 17)
					(= next leaveNow)
				else
					(proc851_0 @local8 999 (Monastery tFULK?))
					(Monastery fulkStatus: 2)
				)
				(= cycles 1)
			)
			(5 (proc0_4) (self dispose:))
		)
	)
)
