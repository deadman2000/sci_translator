;;; Sierra Script 1.0 - (do not remove this comment)
(script# 892)
(include sci.sh)
(use n000)
(use n992)

(public
	SyncStop 0
)

(class SyncStop of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init theClient theVStopped theCaller)
		(if argc
			(= vWalking ((= client theClient) view?))
			(if (>= argc 2)
				(= vStopped theVStopped)
				(if (>= argc 3) (= caller theCaller))
			)
		)
		(super init: client)
	)
	
	(method (doit &tmp clientMover)
		(cond 
			((not (client isStopped:))
				(if (== (client view?) vStopped)
					(client view: vWalking)
				)
			)
			(
			(>= (Abs (- gB_moveCnt cycleCnt)) (client cycleSpeed?))
				(= cycleCnt gB_moveCnt)
				(if (== (client view?) vWalking)
					(client view: vStopped)
					(if
						(and
							(= clientMover (client mover?))
							(not ((= clientMover (client mover?)) completed?))
						)
						(client setMotion: 0)
					)
					(self motionCue:)
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(if (== (client view?) vStopped)
			(client view: vWalking)
		)
		(super dispose:)
	)
	
	(method (motionCue &tmp clientMover)
		(= clientMover (client mover?))
		(if
			(and
				caller
				(or (not clientMover) (clientMover completed?))
			)
			(caller cue:)
		)
	)
)
