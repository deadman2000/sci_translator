;;; Sierra Script 1.0 - (do not remove this comment)
(script# 19)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	John 0
)

(local
	local0
	[local1 4] = [1019 2 1]
	[local5 4] = [1019 3 1]
	[local9 4] = [1019 4 1]
	[local13 4] = [1019 5 1]
	[local17 4] = [1019 6 1]
	[local21 4] = [1019 7 1]
	[local25 4] = [1019 8 1]
	[local29 4] = [1019 9 1]
	[local33 4] = [1019 10 1]
	[local37 4] = [1019 11 1]
	[local41 4] = [1019 12 1]
	[local45 4] = [1019 13 1]
	[local49 4] = [1019 14 1]
	[local53 4] = [1019 15 1]
	[local57 4] = [1019 16 1]
	[local61 4] = [1019 17 1]
	[local65 4] = [1019 18 1]
	[local69 4] = [1019 19 1]
	[local73 4] = [1019 20 1]
	[local77 4] = [1019 21 1]
	[local81 4] = [1019 22 1]
	[local85 4] = [1019 23 1]
	[local89 4] = [1019 24 1]
	[local93 4] = [1019 25 1]
	[local97 4] = [1019 26 1]
	[local101 4] = [1019 27 1]
)
(instance John of Actor
	(properties
		description 1109
		view 151
	)
	
	(method (init)
		(self setLoop: johnGroop)
		(super init:)
	)
	
	(method (dispose)
		(self setCycle: 0 setMotion: 0 actions: 0)
		(super dispose:)
		(self delete:)
		(DisposeScript 19)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if local0
					(proc13_6 0)
					(proc13_4 1019 0)
				else
					(= local0 1)
					(proc13_6 0)
					(proc13_4 1019 1)
				)
			)
			(3 (proc851_0 1 @local1 13 0))
			(5
				(switch global126
					(0 (proc851_0 1 @local5 13 0))
					(1 (proc851_0 1 @local9 13 0))
					(6 (proc851_0 1 @local13 13 0))
					(5 (proc851_0 1 @local13 13 0))
					(4
						(switch global130
							(8 (proc851_0 1 @local17 13 0))
							(9 (proc851_0 1 @local21 13 0))
							(else 
								(proc851_0 1 @local25 13 0)
							)
						)
					)
					(2 (proc851_0 1 @local29 13 0))
				)
			)
			(4
				(switch param2
					(1 (proc851_0 1 @local33 13 0))
					(0 (proc851_0 1 @local37 13 0))
					(2 (proc851_0 1 @local41 13 0))
					(3 (proc851_0 1 @local45 13 0))
					(15 (proc851_0 1 @local49 13 0))
					(11
						(proc851_0 1 @local53 13 0)
						(gEgo put: 11 self)
					)
					(14 (proc851_0 1 @local57 13 0))
					(12 (proc851_0 1 @local61 13 0))
					(10 (proc851_0 1 @local65 13 0))
					(18 (proc851_0 1 @local65 13 0))
					(13 (proc851_0 1 @local69 13 0))
					(5 (proc851_0 1 @local73 13 0))
					(6 (proc851_0 1 @local77 13 0))
					(17 (proc851_0 1 @local81 13 0))
					(16 (proc851_0 1 @local85 13 0))
					(4 (proc851_0 1 @local89 13 0))
					(7 (proc851_0 1 @local93 13 0))
					(8 (proc851_0 1 @local97 13 0))
					(9 (proc851_0 1 @local101 13 0))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(10 (proc13_4 1019 28))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance johnGroop of Grooper
	(properties)
)
