;;; Sierra Script 1.0 - (do not remove this comment)
(script# 891)
(include sci.sh)
(use n000)
(use n992)
(use n999)


(class FuzzyStop of Fwd
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		theStopCelArray 0
	)
	
	(method (init param1 theTheStopCelArray theCaller)
		(= theStopCelArray theTheStopCelArray)
		(if (>= argc 3) (= caller theCaller))
		(super init: param1 &rest)
	)
	
	(method (doit &tmp clientMover)
		(cond 
			((not (client isStopped:)) (super doit: &rest))
			((and (client isStopped:) (client mover?))
				(if
					(and
						(= clientMover (client mover?))
						(not ((= clientMover (client mover?)) completed?))
					)
					(client setMotion: 0)
				)
			)
			(
				(and
					(!=
						(client cel?)
						(proc999_6 theStopCelArray (client loop?))
					)
					(>= (Abs (- gB_moveCnt cycleCnt)) (client cycleSpeed?))
				)
				(= cycleCnt gB_moveCnt)
				(client
					setCel: (proc999_6 theStopCelArray (client loop?))
				)
				(self motionCue:)
			)
		)
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
