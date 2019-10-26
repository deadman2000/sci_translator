;;; Sierra Script 1.0 - (do not remove this comment)
(script# 854)
(include sci.sh)
(use n000)
(use n013)
(use n999)

(public
	puzBoxMessage 0
)

(instance puzBoxMessage of Code
	(properties)
	
	(method (doit)
		(return
			(cond 
				((== global11 530) (proc13_4 1854 3) 1)
				((proc0_5 129) (proc13_4 1854 1) 1)
				((or (== global11 110) (== global11 120)) (proc13_4 1854 2) 1)
				((proc999_5 global11 580 590 600) (proc13_4 1854 0) 1)
				(
					(and
						(proc999_5 global11 570 270 350 390 440)
						(== gNewGuise 5)
					)
					(proc13_4 1854 3)
					1
				)
				((or (== global11 210) (== global11 250)) (proc13_4 1854 4) 1)
				((== global130 10)
					(cond 
						((== global11 490) (proc13_4 1854 1) 1)
						((proc999_5 global11 455 460 470 480) (proc13_4 1854 1) 1)
						((proc999_5 global11 500 540) (proc13_4 1854 5) 1)
						((proc999_5 global11 560 561 562) (proc13_4 1854 1) 1)
					)
				)
				(
					(and
						(<= 5 global130)
						(<= global130 6)
						(== gNewGuise 5)
					)
					(cond 
						((or (== global11 490) (== global11 500)) (proc13_4 1854 6) 1)
						((proc999_5 global11 540 550 560 561 562 570) (proc13_4 1854 0) 1)
					)
				)
				(else 0)
			)
		)
	)
)
