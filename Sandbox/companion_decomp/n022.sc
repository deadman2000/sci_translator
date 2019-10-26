;;; Sierra Script 1.0 - (do not remove this comment)
(script# 22)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Much 0
)

(local
	local0
	local1
	[local2 4] = [1022 2 1]
	[local6 4] = [1022 3 1]
	[local10 4] = [1022 4 1]
	[local14 4] = [1022 5 1]
	[local18 4] = [1022 6 1]
	[local22 4] = [1022 7 1]
	[local26 4] = [1022 8 1]
	[local30 4] = [1022 9 1]
	[local34 4] = [1022 10 1]
	[local38 4] = [1022 11 1]
	[local42 4] = [1022 12 1]
	[local46 4] = [1022 13 1]
	[local50 4] = [1022 14 1]
	[local54 4] = [1022 15 1]
	[local58 4] = [1022 16 1]
	[local62 4] = [1022 17 1]
	[local66 4] = [1022 18 1]
	[local70 4] = [1022 19 1]
	[local74 4] = [1022 20 1]
	[local78 4] = [1022 21 1]
	[local82 4] = [1022 22 1]
	[local86 4] = [1022 23 1]
	[local90 4] = [1022 24 1]
	[local94 4] = [1022 25 1]
	[local98 4] = [1022 26 1]
)
(instance Much of Actor
	(properties
		description 1174
		view 163
	)
	
	(method (init)
		(self setLoop: muchGroop)
		(super init:)
	)
	
	(method (dispose)
		(self setCycle: 0 setMotion: 0 actions: 0)
		(super dispose:)
		(self delete:)
		(DisposeScript 22)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if local0
					(proc13_6 0)
					(proc13_4 1022 0)
				else
					(proc13_6 0)
					(proc13_4 1022 1)
					(= local0 1)
				)
			)
			(3 (proc851_0 1 @local2 17 0))
			(5
				(switch global126
					(1 (proc851_0 1 @local6 17 0))
					(5
						(if local1
							(proc851_0 1 @local18 17 0)
						else
							(= local1 1)
							(proc851_0 1 @local10 17 0)
						)
					)
					(6
						(if local1
							(proc851_0 1 @local18 17 0)
						else
							(= local1 1)
							(proc851_0 1 @local10 17 0)
						)
					)
					(4
						(if (and (== global130 8) (not local1))
							(= local1 1)
							(proc851_0 1 @local14 17 0)
						else
							(proc851_0 1 @local18 17 0)
						)
					)
					(2 (proc851_0 1 @local22 17 0))
					(3 (proc851_0 1 @local22 17 0))
					(else 
						(proc851_0 1 @local26 17 0)
					)
				)
			)
			(4
				(switch param2
					(1 (proc851_0 1 @local30 17 0))
					(0
						(if (> (gMoney doit:) 0) (proc851_0 1 @local34 17 0))
					)
					(2 (proc851_0 1 @local38 17 0))
					(3 (proc851_0 1 @local42 17 0))
					(15 (proc851_0 1 @local46 17 0))
					(11
						(proc851_0 1 @local50 17 0)
						(gEgo put: 11 self)
					)
					(14 (proc851_0 1 @local54 17 0))
					(12 (proc851_0 1 @local58 17 0))
					(10 (proc851_0 1 @local62 17 0))
					(18 (proc851_0 1 @local62 17 0))
					(13 (proc851_0 1 @local66 17 0))
					(5 (proc851_0 1 @local70 17 0))
					(6 (proc851_0 1 @local74 17 0))
					(17 (proc851_0 1 @local78 17 0))
					(16 (proc851_0 1 @local82 17 0))
					(4 (proc851_0 1 @local86 17 0))
					(7 (proc851_0 1 @local90 17 0))
					(8 (proc851_0 1 @local94 17 0))
					(9 (proc851_0 1 @local98 17 0))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(10 (proc13_4 1022 27))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance muchGroop of Grooper
	(properties)
)
