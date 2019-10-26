;;; Sierra Script 1.0 - (do not remove this comment)
(script# 20)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Will 0
)

(local
	local0
	[local1 4] = [1020 2 1]
	[local5 4] = [1020 3 1]
	[local9 4] = [1020 4 1]
	[local13 4] = [1020 5 1]
	[local17 4] = [1020 6 1]
	[local21 4] = [1020 7 1]
	[local25 4] = [1020 8 1]
	[local29 4] = [1020 9 1]
	[local33 4] = [1020 10 1]
	[local37 4] = [1020 11 1]
	[local41 4] = [1020 12 1]
	[local45 4] = [1020 13 1]
	[local49 4] = [1020 14 1]
	[local53 4] = [1020 15 1]
	[local57 4] = [1020 16 1]
	[local61 4] = [1020 17 1]
	[local65 4] = [1020 18 1]
	[local69 4] = [1020 19 1]
	[local73 4] = [1020 20 1]
	[local77 4] = [1020 21 1]
	[local81 4] = [1020 22 1]
	[local85 4] = [1020 23 1]
	[local89 4] = [1020 24 1]
	[local93 4] = [1020 25 1]
	[local97 4] = [1020 26 1]
)
(instance Will of Actor
	(properties
		description 1071
		view 160
	)
	
	(method (init)
		(self setLoop: willGroop)
		(super init:)
	)
	
	(method (dispose)
		(self setCycle: 0 setMotion: 0 actions: 0)
		(super dispose:)
		(self delete:)
		(DisposeScript 20)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if local0
					(proc13_6 0)
					(proc13_4 1020 0)
				else
					(proc13_6 0)
					(proc13_4 1020 1)
					(= local0 1)
				)
			)
			(3 (proc851_0 1 @local1 14 0))
			(5
				(switch global126
					(1 (proc851_0 1 @local5 14 0))
					(5 (proc851_0 1 @local9 14 0))
					(6 (proc851_0 1 @local9 14 0))
					(4
						(switch global130
							(8 (proc851_0 1 @local13 14 0))
							(9 (proc851_0 1 @local17 14 0))
						)
					)
					(2 (proc851_0 1 @local21 14 0))
					(else 
						(proc851_0 1 @local25 14 0)
					)
				)
			)
			(4
				(switch param2
					(1 (proc851_0 1 @local29 14 0))
					(0 (proc851_0 1 @local33 14 0))
					(2 (proc851_0 1 @local37 14 0))
					(3 (proc851_0 1 @local41 14 0))
					(15 (proc851_0 1 @local45 14 0))
					(11 (proc851_0 1 @local49 14 0))
					(14 (proc851_0 1 @local53 14 0))
					(12 (proc851_0 1 @local57 14 0))
					(10 (proc851_0 1 @local61 14 0))
					(18 (proc851_0 1 @local61 14 0))
					(13 (proc851_0 1 @local65 14 0))
					(5 (proc851_0 1 @local69 14 0))
					(6 (proc851_0 1 @local73 14 0))
					(17 (proc851_0 1 @local77 14 0))
					(16 (proc851_0 1 @local81 14 0))
					(4 (proc851_0 1 @local85 14 0))
					(7 (proc851_0 1 @local89 14 0))
					(8 (proc851_0 1 @local93 14 0))
					(9 (proc851_0 1 @local97 14 0))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(10 (proc13_4 1020 27))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance willGroop of Grooper
	(properties)
)
