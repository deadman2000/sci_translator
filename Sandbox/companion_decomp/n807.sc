;;; Sierra Script 1.0 - (do not remove this comment)
(script# 807)
(include sci.sh)
(use n000)
(use n961)
(use n989)


(local
	local0
	local1
	[local2 3] = [924 925 926]
	[local5 7] = [0 3 16 23 29 33 36]
	[local12 56] = [17 17 36 18 36 36 10 18 17 17 34 17 144 144 132 132 9 9 34 9 18 18 18 18 17 17 9 9 9 9 36 36 136 136 9 9 9 9 18 9 17 34 9 36 9 9 18 18 10 10 5 40 9 40 5 9]
	[local68 8] = [1 2 4 8 16 32 64 128]
)
(procedure (localproc_0004 &tmp temp0)
	(= temp0 0)
	(while (<= temp0 6)
		(if (== [local5 temp0] (gEgo view?))
			(= local1 (* 8 temp0))
		)
		(++ temp0)
	)
)

(class FootstepWalk of StopWalk
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		vWalking 0
		vStopped 0
	)
	
	(method (init)
		(super init: &rest)
		(= vStopped
			(switch gNewGuise
				(1 37)
				(2 30)
				(3 30)
				(4 34)
				(5 24)
				(6 17)
				(else  1)
			)
		)
		(localproc_0004)
	)
	
	(method (doit &tmp clientCel)
		(= clientCel (client cel?))
		(super doit:)
		(return
			(if
				(and
					(!= clientCel (client cel?))
					(&
						[local68 (client cel?)]
						[local12 (+ (client loop?) local1)]
					)
				)
				(= local0 (Random 0 2))
				(stepSound number: [local2 local0] play:)
				(++ global164)
			else
				0
			)
		)
	)
)

(instance stepSound of Sound
	(properties
		flags $0001
	)
)
