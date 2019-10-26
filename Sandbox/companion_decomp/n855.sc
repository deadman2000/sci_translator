;;; Sierra Script 1.0 - (do not remove this comment)
(script# 855)
(include sci.sh)
(use n000)
(use n013)
(use n999)

(public
	versePrinter 0
)

(instance versePrinter of Script
	(properties)
	
	(method (init)
		(proc13_6 33)
		(super init: &rest)
	)
	
	(method (dispose)
		(proc13_6 0)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0 (proc13_4 855 0 self 33 3))
			(1
				(= temp0
					(switch global144
						(0 (proc13_4 855 1 self 33 3))
						(1 (proc13_4 855 2 self 33 3))
						(2 (proc13_4 855 3 self 33 3))
						(3 (proc13_4 855 4 self 33 3))
						(4 (proc13_4 855 5 self 33 3))
						(5 (proc13_4 855 6 self 33 3))
						(6 (proc13_4 855 7 self 33 3))
						(7 (proc13_4 855 8 self 33 3))
						(8 (proc13_4 855 9 self 33 3))
						(9 (proc13_4 855 10 self 33 3))
					)
				)
			)
			(2 (proc13_4 855 11 self 33 3))
			(3
				(self dispose:)
				(DisposeScript 855)
			)
		)
	)
)
