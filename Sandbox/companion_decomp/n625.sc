;;; Sierra Script 1.0 - (do not remove this comment)
(script# 625)
(include sci.sh)
(use n000)
(use n806)
(use n851)
(use n930)
(use n945)
(use n958)
(use n977)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	Monastery 0
	chip 1
	prior 2
	wGateTimer 7
)

(local
	pEventMessage
	local1
	[local2 4] = [1625 1 1]
	[local6 4] = [1625 2 1]
	[local10 20] = [1625 3 1 0 1625 4 1 0 1625 5 1 0 1625 7 1 0 1625 6 1]
	[local30 4] = [1625 9 1]
	[local34 4] = [1625 10 1]
	[local38 8] = [1625 11 2 1 2 1 2]
	[local46 6] = [1625 16 2 1 2]
	[local52 7] = [1625 19 2 1 2 2]
	[local59 6] = [1625 23 2 1 2]
	[local65 4] = [1625 26 1]
	[local69 4] = [1625 27 1]
	[local73 4] = [1625 28 1]
	[theTFULK 9] = [673 0 2 4 19 33 21 20 21]
	[theTPRIOR 9] = [43 0 2 4 25 37 21 26 28]
)
(class Monastery of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		givePriorMoney 0
		wherePrior 0
		fulkStatus 0
		whichDoor 0
		gobletTipped 0
		backFromJewels 0
		waterDie 0
		firstTimeTalk 1
		noPriorExperience 1
		moneyThree 0
		firstTimeEnter 0
		stairMessage 0
		stairsMessage 0
		deathReason 0
		roomToDie 0
		monkGroop 0
		tFULK 0
		tPRIOR 0
	)
	
	(method (init)
		(= monkGroop chipGroop)
		(super init:)
		(proc958_0 128 16 641)
		(Load rsSCRIPT 985)
		(= tFULK @theTFULK)
		(= tPRIOR @theTPRIOR)
	)
	
	(method (dispose)
		(gIconBar enable: 2 3 6 7)
		(self setScript: 0)
		(super dispose:)
	)
	
	(method (newRoom newRoomNumber)
		(cond 
			(
				(not
					(proc999_5
						newRoomNumber
						620
						630
						640
						650
						660
						670
						680
						690
						695
					)
				)
				(self keep: 0)
			)
			((== newRoomNumber 680)
				(= deathReason 1)
				(if (not script) (Monastery setScript: wGateTimer))
			)
		)
	)
)

(instance chipGroop of Grooper
	(properties)
)

(instance chip of Actor
	(properties
		view 16
	)
	
	(method (init)
		(super init:)
		(self approachVerbs: 3 4)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(cond 
			((pEvent claimed?) (return 1))
			(
				(and
					(== (pEvent type?) 16384)
					(self onMe: pEvent)
					(self isNotHidden:)
				)
				(= pEventMessage (pEvent message?))
				(= local1
					(if
						(and
							gIconBar
							(== (pEvent message?) JOY_DOWNRIGHT)
							global9
						)
						(global9 indexOf: (gIconBar curInvIcon?))
					else
						0
					)
				)
				(pEvent claimed: 1)
				(if (== pEventMessage JOY_UPRIGHT)
					(self doVerb: pEventMessage)
				else
					(self setScript: walkToActor)
				)
			)
		)
		(return (pEvent claimed?))
	)
	
	(method (doVerb theVerb param2)
		(if (== global11 620)
			((ScriptID 620 1) doit: theVerb param2 &rest)
		else
			(switch theVerb
				(5 (proc851_0 @local2 11 0))
				(3 (proc851_0 @local6 11 0))
				(4
					(switch param2
						(0
							(if (> (gMoney doit:) 0)
								(gClient setScript: monkeyMoney)
							)
						)
					)
				)
				(else 
					(super doVerb: theVerb &rest)
				)
			)
		)
	)
)

(instance prior of Actor
	(properties
		description 2711
		lookStr 8
		view 641
	)
	
	(method (init)
		(super init:)
		(self approachVerbs: 3 4)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(cond 
			((pEvent claimed?) (return 1))
			(
				(and
					(== (pEvent type?) 16384)
					(self onMe: pEvent)
					(self isNotHidden:)
				)
				(= pEventMessage (pEvent message?))
				(= local1
					(if
						(and
							gIconBar
							(== (pEvent message?) JOY_DOWNRIGHT)
							global9
						)
						(global9 indexOf: (gIconBar curInvIcon?))
					else
						0
					)
				)
				(pEvent claimed: 1)
				(if (== pEventMessage JOY_UPRIGHT)
					(self doVerb: pEventMessage)
				else
					(self setScript: walkToActor)
				)
			)
		)
		(return (pEvent claimed?))
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(proc851_0 @local30 (Monastery tPRIOR?) 0)
			)
			(3
				(proc851_0 @local34 (Monastery tPRIOR?) 0)
			)
			(4
				(switch param2
					(0
						(switch (Monastery givePriorMoney?)
							(0
								(if (> (gMoney doit:) 0)
									(gClient setScript: notYetMoney)
								)
							)
							(1
								(if (> (gMoney doit:) 0)
									(gClient setScript: onceMoney)
								)
							)
							(2
								(if (> (gMoney doit:) 0)
									(gClient setScript: twiceMoney)
								)
							)
						)
					)
					(2
						(proc851_0 @local59 8 (Monastery tPRIOR?))
						(gEgo put: 2 -1)
						(proc806_1 -200)
					)
					(14
						(proc851_0 @local65 (Monastery tPRIOR?) 0)
						(gEgo put: 14 -1)
						(proc806_1 -50)
					)
					(17
						(proc851_0 @local69 (Monastery tPRIOR?) 0)
					)
					(16
						(gEgo put: 16 -1)
						(proc851_0 @local73 (Monastery tPRIOR?) 0)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance walkToActor of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
					(or
						(< pEventMessage JOY_RIGHT)
						(> pEventMessage JOY_DOWNRIGHT)
						(<= (gEgo distanceTo: client) 30)
					)
					(= cycles 1)
				else
					(gEgo setMotion: PChase client 25 self)
				)
			)
			(1
				(if
					(and
						(<=
							(-
								(= temp0
									(GetAngle (gEgo x?) (gEgo y?) (client x?) (client y?))
								)
								15
							)
							(gEgo heading?)
						)
						(<= (gEgo heading?) (+ temp0 15))
					)
					(= cycles 2)
				else
					(proc0_9 gEgo client)
					(= cycles (if (> temp0 120) 6 else 4))
				)
			)
			(2
				(client doVerb: pEventMessage local1)
				(proc0_4)
				(if (== gClient 640) (gIconBar disable: 5))
				(self dispose:)
			)
		)
	)
)

(instance ringed of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch global11
					(650
						(gEgo setMotion: PolyPath 143 143)
						((ScriptID 625 1)
							view: 16
							posn: 27 140
							loop: 0
							cel: 0
							init:
							setCycle: Walk
							setMotion: PolyPath 127 144
						)
						(= ticks 400)
					)
					(else  (= ticks 6))
				)
			)
			(1 (gClient newRoom: 695))
		)
	)
)

(instance notYetMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gMoney doit:)
				(= seconds 5)
			)
			(1
				(Monastery givePriorMoney: 1)
				(proc851_0 @local38 8 (Monastery tPRIOR?) self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance onceMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gMoney doit:)
				(= seconds 5)
			)
			(1
				(Monastery givePriorMoney: 2)
				(proc851_0 @local46 8 (Monastery tPRIOR?) self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance twiceMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gMoney doit:)
				(= seconds 5)
			)
			(1
				(Monastery moneyThree: 1)
				(proc851_0 @local52 8 (Monastery tPRIOR?))
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance monkeyMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gMoney doit:)
				(= seconds 5)
			)
			(1
				(proc851_0 @local10 11 2 0 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance wGateTimer of Script
	(properties
		seconds 180
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(Monastery waterDie: 1)
				(self dispose:)
			)
		)
	)
)
