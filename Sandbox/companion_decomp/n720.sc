;;; Sierra Script 1.0 - (do not remove this comment)
(script# 720)
(include sci.sh)
(use n994)
(use n999)

(public
	theTower 0
)

(class theTower of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		climbing 0
		outBoat 0
		ivyDone 0
	)
	
	(method (newRoom newRoomNumber)
		(if (not (proc999_5 newRoomNumber 701 702 705))
			(self keep: 0)
		)
	)
)
