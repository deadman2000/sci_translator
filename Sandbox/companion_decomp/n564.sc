;;; Sierra Script 1.0 - (do not remove this comment)
(script# 564)
(include sci.sh)
(use n994)
(use n999)

(public
	TheDungeon 0
	shortTimer 1
	longTimer 2
	warningTimer 3
)

(class TheDungeon of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		firstLook 1
		coinsLeft 0
		firstShortTimer 0
		boysRescued 0
		firstAfterRescue 1
		timerHasFired 0
		tooLate 0
		longTimerGone 0
		trapDoorOpen 0
		firstTimeOpened 1
		timeToDie 0
		guardsGone 0
		neverBefore 1
		numberCoins 0
		valueCoins 0
		doneTalking 0
		coinsDoneBeenTook 0
	)
	
	(method (newRoom newRoomNumber)
		(if
		(not (proc999_5 newRoomNumber 550 560 561 562 570))
			(self keep: 0)
		)
	)
)

(instance shortTimer of Script
	(properties
		seconds 15
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(warningTimer seconds: 15)
				(TheDungeon setScript: warningTimer)
				(TheDungeon timerHasFired: 1)
				(self dispose:)
			)
		)
	)
)

(instance longTimer of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(warningTimer seconds: 15)
				(TheDungeon setScript: warningTimer)
				(TheDungeon timerHasFired: 1)
				(TheDungeon longTimerGone: 1)
				(self dispose:)
			)
		)
	)
)

(instance warningTimer of Script
	(properties
		seconds 15
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(TheDungeon guardsGone: 0)
				(TheDungeon timeToDie: 1)
				(self dispose:)
			)
		)
	)
)
