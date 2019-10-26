;;; Sierra Script 1.0 - (do not remove this comment)
(script# 23)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Tuck 0
)

(local
	local0
	local1
	[local2 4] = [1023 2 1]
	[local6 4] = [1023 3 1]
	[local10 4] = [1023 4 1]
	[local14 4] = [1023 5 1]
	[local18 4] = [1023 6 1]
	[local22 4] = [1023 7 1]
	[local26 4] = [1023 8 1]
	[local30 4] = [1023 9 1]
	[local34 4] = [1023 10 1]
	[local38 4] = [1023 11 1]
	[local42 4] = [1023 12 1]
	[local46 4] = [1023 13 1]
	[local50 4] = [1023 14 1]
	[local54 4] = [1023 15 1]
	[local58 4] = [1023 16 1]
	[local62 4] = [1023 17 1]
	[local66 4] = [1023 18 1]
	[local70 4] = [1023 19 1]
	[local74 4] = [1023 20 1]
	[local78 5] = [1023 21 1 1]
	[local83 4] = [1023 23 1]
	[local87 4] = [1023 24 1]
	[local91 4] = [1023 25 1]
	[local95 4] = [1023 26 1]
	[local99 4] = [1023 27 1]
	[local103 4] = [1023 28 1]
	[local107 4] = [1023 29 1]
	[local111 4] = [1023 30 1]
	[local115 4] = [1023 31 1]
)
(instance Tuck of Actor
	(properties
		description 1325
		view 154
	)
	
	(method (init)
		(self setLoop: tuckGroop)
		(super init:)
	)
	
	(method (dispose)
		(self setCycle: 0 setMotion: 0 actions: 0)
		(super dispose:)
		(self delete:)
		(DisposeScript 23)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if local0
					(proc13_6 0)
					(proc13_4 1023 0)
				else
					(= local0 1)
					(proc13_6 0)
					(proc13_4 1023 1)
				)
			)
			(3
				(cond 
					(local1 (= local1 0) (proc851_0 1 @local2 15 0) (gEgo get: 12))
					((== ((global9 at: 12) owner?) self) (proc851_0 1 @local6 15 0))
					(else
						(switch global126
							(1 (proc851_0 1 @local10 15 0))
							(6 (proc851_0 1 @local14 15 0))
							(5 (proc851_0 1 @local14 15 0))
							(4
								(switch global130
									(8 (proc851_0 1 @local18 15 0))
									(9 (proc851_0 1 @local22 15 0))
									(else 
										(proc851_0 1 @local26 15 0)
									)
								)
							)
							(2 (proc851_0 1 @local30 15 0))
							(3 (proc851_0 1 @local34 15 0))
							(else 
								(proc851_0 1 @local26 15 0)
							)
						)
					)
				)
			)
			(5
				(cond 
					(local1 (= local1 0) (proc851_0 1 @local2 15 0))
					((== ((global9 at: 12) owner?) self) (proc851_0 1 @local6 15 0))
					(else (proc851_0 1 @local38 15 0))
				)
			)
			(4
				(switch param2
					(1 (proc851_0 1 @local42 15 0))
					(0 (proc851_0 1 @local46 15 0))
					(2 (proc851_0 1 @local50 15 0))
					(3 (proc851_0 1 @local54 15 0))
					(15 (proc851_0 1 @local58 15 0))
					(11
						(proc851_0 1 @local62 15 0)
						(gEgo put: 11 self)
					)
					(14 (proc851_0 1 @local66 15 0))
					(12
						(proc851_0 1 @local70 15 0)
						(gEgo put: 12 self)
						(= local1 1)
					)
					(10 (proc851_0 1 @local74 15 0))
					(18 (proc851_0 1 @local74 15 0))
					(13
						(if (< global130 7)
							(proc851_0 1 @local78 15 0)
						else
							(proc851_0 1 @local83 15 0)
							(gEgo put: 13)
						)
					)
					(5 (proc851_0 1 @local87 15 0))
					(6 (proc851_0 1 @local91 15 0))
					(17 (proc851_0 1 @local95 15 0))
					(16 (proc851_0 1 @local99 15 0))
					(4 (proc851_0 1 @local103 15 0))
					(7 (proc851_0 1 @local107 15 0))
					(8 (proc851_0 1 @local111 15 0))
					(9 (proc851_0 1 @local115 15 0))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(10 (proc13_4 1023 32))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance tuckGroop of Grooper
	(properties)
)
