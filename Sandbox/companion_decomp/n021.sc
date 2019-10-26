;;; Sierra Script 1.0 - (do not remove this comment)
(script# 21)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n977)
(use n998)

(public
	Alan 0
)

(local
	local0
	[local1 4] = [1021 2 1]
	[local5 4] = [1021 3 1]
	[local9 4] = [1021 4 1]
	[local13 4] = [1021 5 1]
	[local17 4] = [1021 6 1]
	[local21 4] = [1021 7 1]
	[local25 4] = [1021 8 1]
	[local29 4] = [1021 9 1]
	[local33 4] = [1021 10 1]
	[local37 4] = [1021 11 1]
	[local41 4] = [1021 12 1]
	[local45 4] = [1021 13 1]
	[local49 4] = [1021 14 1]
	[local53 4] = [1021 15 1]
	[local57 4] = [1021 16 1]
	[local61 4] = [1021 17 1]
	[local65 4] = [1021 18 1]
	[local69 4] = [1021 19 1]
	[local73 4] = [1021 20 1]
	[local77 4] = [1021 21 1]
	[local81 4] = [1021 22 1]
	[local85 4] = [1021 23 1]
	[local89 4] = [1021 24 1]
	[local93 5] = [1021 25 1 1]
	[local98 4] = [1021 27 1]
)
(instance Alan of Actor
	(properties
		description 1091
		view 157
	)
	
	(method (init)
		(self setLoop: alanGroop)
		(super init:)
	)
	
	(method (dispose)
		(self setCycle: 0 setMotion: 0 actions: 0)
		(super dispose:)
		(self delete:)
		(DisposeScript 21)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if local0
					(proc13_6 0)
					(proc13_4 1021 0)
				else
					(= local0 1)
					(proc13_6 0)
					(proc13_4 1021 1)
				)
			)
			(3 (proc851_0 1 @local1 16 0))
			(5
				(switch global126
					(1 (proc851_0 1 @local5 16 0))
					(5 (proc851_0 1 @local9 16 0))
					(6 (proc851_0 1 @local9 16 0))
					(4
						(switch global130
							(8 (proc851_0 1 @local13 16 0))
							(else 
								(proc851_0 1 @local17 16 0)
							)
						)
					)
					(2 (proc851_0 1 @local21 16 0))
					(3 (proc851_0 1 @local21 16 0))
					(else 
						(proc851_0 1 @local25 16 0)
					)
				)
			)
			(4
				(switch param2
					(1 (proc851_0 1 @local29 16 0))
					(0 (proc851_0 1 @local33 16 0))
					(2 (proc851_0 1 @local37 16 0))
					(3 (proc851_0 1 @local41 16 0))
					(15 (proc851_0 1 @local45 16 0))
					(11 (proc851_0 1 @local49 16 0))
					(14 (proc851_0 1 @local53 16 0))
					(12 (proc851_0 1 @local57 16 0))
					(10 (proc851_0 1 @local61 16 0))
					(18 (proc851_0 1 @local61 16 0))
					(13 (proc851_0 1 @local65 16 0))
					(5 (proc851_0 1 @local69 16 0))
					(6 (proc851_0 1 @local73 16 0))
					(17 (proc851_0 1 @local77 16 0))
					(16 (proc851_0 1 @local81 16 0))
					(4 (proc851_0 1 @local85 16 0))
					(7 (proc851_0 1 @local89 16 0))
					(8 (proc851_0 1 @local93 16 0))
					(9 (proc851_0 1 @local98 16 0))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(10 (proc13_4 1021 28))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance alanGroop of Grooper
	(properties)
)
