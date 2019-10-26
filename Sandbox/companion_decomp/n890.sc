;;; Sierra Script 1.0 - (do not remove this comment)
(script# 890)
(include sci.sh)
(use n992)


(class SlowDown of MoveTo
	(properties
		client 0
		caller 0
		x 0
		y 0
		dx 0
		dy 0
		b-moveCnt 0
		b-i1 0
		b-i2 0
		b-di 0
		b-xAxis 0
		b-incr 0
		completed 0
		xLast 0
		yLast 0
		cycleSpeed 12
		moveSpeed 12
		cycleCnt 4
		oldCycSpd 0
		oldMvSpd 0
	)
	
	(method (init param1 param2 param3 param4 theCycleSpeed theMoveSpeed theCycleCnt)
		(if (>= argc 5)
			(= cycleSpeed theCycleSpeed)
			(if (>= argc 6)
				(= moveSpeed theMoveSpeed)
				(if (>= argc 7) (= cycleCnt theCycleCnt))
			)
		)
		(super init: param1 param2 param3 param4 &rest)
		(= oldCycSpd (client cycleSpeed?))
		(= oldMvSpd (client moveSpeed?))
	)
	
	(method (doit)
		(if
			(and
				(<=
					(Abs (- (client x?) x))
					(* cycleCnt (client xStep?))
				)
				(<=
					(Abs (- (client y?) y))
					(* cycleCnt (client yStep?))
				)
			)
			(client cycleSpeed: cycleSpeed moveSpeed: moveSpeed)
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(client cycleSpeed: oldCycSpd moveSpeed: oldMvSpd)
		(super dispose: &rest)
	)
)
