;;; Sierra Script 1.0 - (do not remove this comment)
(script# 961)
(include sci.sh)
(use n992)

(public
	StopWalk 0
)

(class StopWalk of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init theClient theVStopped)
		(if argc
			(= vWalking ((= client theClient) view?))
			(if (>= argc 2) (= vStopped theVStopped))
		)
		(super init: client)
	)
	
	(method (doit &tmp temp0 clientMover)
		(if (client isStopped:)
			(if (== (client view?) vWalking)
				(client view: vStopped)
				(if
					(and
						(= clientMover (client mover?))
						(not ((= clientMover (client mover?)) completed?))
					)
					(client setMotion: 0)
				)
				(super doit:)
			)
		else
			(if (== (client view?) vStopped)
				(client view: vWalking)
			)
			(super doit:)
		)
	)
	
	(method (dispose)
		(if (== (client view?) vStopped)
			(client view: vWalking)
		)
		(super dispose:)
	)
)
