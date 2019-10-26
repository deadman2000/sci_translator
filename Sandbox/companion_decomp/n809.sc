;;; Sierra Script 1.0 - (do not remove this comment)
(script# 809)
(include sci.sh)
(use n000)
(use n255)
(use n999)

(public
	aboutCode 0
)

(instance aboutCode of Code
	(properties)
	
	(method (doit &tmp [temp0 100] temp100)
		(= temp100 (global38 eraseOnly?))
		(global38 eraseOnly: 1)
		(proc255_4 809 0 global27)
		(proc255_0 809 1)
		(proc255_0 809 2)
		(proc255_0 809 3)
		(proc255_0 809 4)
		(proc255_0 809 5)
		(proc255_0 809 6)
		(proc255_0 809 7)
		(proc255_0 809 8)
		(global38 eraseOnly: temp100)
	)
)
