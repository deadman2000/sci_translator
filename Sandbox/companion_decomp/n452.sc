;;; Sierra Script 1.0 - (do not remove this comment)
(script# 452)
(include sci.sh)
(use n000)
(use n013)
(use n813)
(use n851)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	abbey 0
	aMonk 1
	regTimer 2
	noBlow 3
)

(local
	[local0 5] = [1452 1 1 2]
	[local5 4] = [1452 3 1]
	[local9 4] = [1452 4 1]
	[local13 4] = [1452 6 1]
	[local17 4] = [1452 7 1]
	[local21 4] = [1452 8 1]
	[local25 4] = [1452 11 1]
	[local29 8] = [1452 9 1 0 1452 30 1]
	[local37 6] = [1452 13 2 1 2]
	[local43 6] = [1452 13 2 1 2]
	[local49 6] = [1452 13 2 1 2]
	[local55 6] = [1452 13 2 1 2]
	[local61 4] = [1452 22 1]
	[local65 5] = [1452 26 1 1]
	theGNewCast
)
(instance abbey of Rgn
	(properties)
	
	(method (init)
		(gIconBar disable: 5)
		(= theGNewCast gNewCast)
	)
	
	(method (doit)
		(if script (script doit:))
		(if
			(and
				(!= theGNewCast gNewCast)
				(!= script dangerBox)
				(proc0_5 126)
			)
			(dangerBox next: script)
			(= script 0)
			(self setScript: dangerBox)
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc851_0 @local9 9))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance aMonk of Actor
	(properties
		view 434
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1452 0))
			(5 (proc851_0 @local0 9 10))
			(3 (proc851_0 @local5 10))
			(4
				(switch param2
					(0
						(proc851_0 @local13 10)
						(gEgo put: 0)
					)
					(11
						(if ((Inv at: 11) value?)
							(proc851_0 @local17 10)
						else
							(proc851_0 @local21 10)
						)
					)
					(12 (proc851_0 @local25 10))
					(14
						(proc851_0 @local29 10)
						(gEgo put: 14)
					)
					(13
						(switch (Random 1 4)
							(1 (proc851_0 @local37 9 10))
							(2 (proc851_0 @local43 9 10))
							(3 (proc851_0 @local49 9 10))
							(4 (proc851_0 @local55 9 10))
						)
					)
					(16 (proc851_0 @local61 10))
					(18 (proc851_0 @local65 10))
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
)

(instance regTimer of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds 30))
			(1
				(if (== global11 470)
					(if (or (gClient script?) (global1 script?))
						(= seconds 2)
						(-- state)
					else
						(gClient setScript: register)
						(self dispose:)
					)
				else
					(= seconds 60)
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance dangerBox of Script
	(properties)
	
	(method (doit)
		(if (and (proc0_5 127) (< state 4))
			(if next
				(client script: next)
				(= client 0)
			else
				(self dispose:)
			)
			(proc0_7 127)
		else
			(super doit:)
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 201) (= state (+ state 2)))
				(proc0_6 201)
				(= seconds 3)
			)
			(1 (proc13_4 1452 10 self))
			(2
				(global1 setScript: 0)
				(if gTheNewDialog (gTheNewDialog dispose:))
				((ScriptID 853) dispose:)
				(if next
					(client script: next)
					(= client 0)
				else
					(self dispose:)
				)
			)
			(3 (= seconds 9))
			(4
				(proc0_3)
				(global1 setScript: 0)
				(if gTheNewDialog (gTheNewDialog dispose:))
				((ScriptID 853) dispose:)
				(proc0_3)
				(switch global11
					(455
						(gEgo posn: 162 122)
						(aMonk posn: 141 109)
					)
					(460
						(if (> (gEgo y?) 153)
							(aMonk posn: 289 109)
						else
							(aMonk posn: 176 185)
						)
					)
					(470
						(if (> (gEgo x?) 46)
							(aMonk posn: 16 184)
						else
							(aMonk posn: 72 183)
						)
					)
					(480
						(if (> (gEgo x?) 160)
							(aMonk posn: 105 188)
						else
							(aMonk posn: 205 188)
						)
					)
				)
				(aMonk init:)
				(proc0_9 aMonk gEgo)
				(= cycles 2)
			)
			(5
				(proc851_0 @local25 10 0 self)
			)
			(6
				(= global145 10)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance noBlow of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(proc13_4 1005 3 1)
				1
			else
				0
			)
		)
	)
)
