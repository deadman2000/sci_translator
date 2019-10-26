;;; Sierra Script 1.0 - (do not remove this comment)
(script# 316)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n851)
(use n992)
(use n998)
(use n999)

(public
	marian 0
)

(local
	local0
	[local1 13] = [1316 4 1 2 1 2 1 2 1 2 1 2]
	[local14 4] = [1316 15 2]
	[local18 4] = [1316 16 2]
	[local22 4] = [1316 17 2]
	local26
)
(instance marian of Actor
	(properties
		view 270
		cycleSpeed 10
		moveSpeed 10
	)
	
	(method (init)
		(super init:)
		(if (not (Fair mY?)) (= global198 320))
		(self setCycle: Walk cue:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(cond 
					((gClient script?) (super doVerb: theVerb &rest))
					((> (gEgo distanceTo: marian) 40) (proc13_4 1311 0))
					(else
						(proc0_3)
						(self setLoop: -1 species 0 setMotion: 0)
						(gClient setScript: sTalkMarian)
					)
				)
			)
			(3
				(if (> (gEgo distanceTo: marian) 40)
					(proc13_4 1311 1)
				else
					(proc13_4 1316 3)
				)
			)
			(4
				(if (> (gEgo distanceTo: marian) 40)
					(proc13_4 1311 1)
				else
					(switch param2
						(17
							(proc851_0 @local22 999 21 0 1)
						)
						(0
							(proc851_0 @local18 999 21 0 1)
						)
						(else 
							(super doVerb: theVerb &rest)
						)
					)
				)
			)
			(2
				(if (not local0)
					(= local0 1)
					(proc13_4 1316 0 1)
				else
					(proc13_4 1316 2 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (delete)
		(Fair mX: x)
		(Fair mY: y)
		(super delete:)
		(DisposeScript 316)
	)
	
	(method (cue &tmp temp0 fairMX fairMY)
		(= fairMX (Fair mX?))
		(= fairMY (Fair mY?))
		(if (or fairMX fairMY)
			(= temp0 global198)
			(Fair mX: 0 mY: 0)
		else
			(= temp0 (= global198 (- global198 10)))
		)
		(switch temp0
			(310 (= local26 46))
			(300 (= local26 51))
			(290 (= local26 60))
			(280 (= local26 60))
			(else  (self dispose:) (return))
		)
		(self
			setLoop: 1
			setCycle: Walk
			x: (if fairMX else 318)
			y: local26
			z: (if (== global198 global11) 0 else 1000)
			setMotion: MoveTo 3 local26 self
		)
	)
)

(instance sTalkMarian of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 2))
			(1
				(proc0_9 marian gEgo)
				(proc0_9 gEgo marian)
				(= ticks 20)
			)
			(2
				(if (proc0_5 197)
					(proc851_0 @local14 999 21 self 1)
				else
					(proc851_0 @local1 999 21 self 1)
					(proc0_6 197)
				)
			)
			(3
				(proc0_4)
				(marian
					setLoop: 1
					setCycle: Walk
					setMotion: MoveTo 3 local26 marian
				)
				(self dispose:)
			)
		)
	)
)
