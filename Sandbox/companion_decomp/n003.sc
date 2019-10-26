;;; Sierra Script 1.0 - (do not remove this comment)
(script# 3)
(include sci.sh)
(use n000)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	pipeIt 0
)

(local
	local0
)
(instance pipeIt of Script
	(properties)
	
	(method (dispose)
		(pipeSound dispose:)
		(super dispose:)
		(DisposeScript 3)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (not global143) (= local0 1) (proc0_3))
				(theFrame init:)
				(blowFace init:)
				(blowPeepers init:)
				(blowMouth init:)
				(= ticks 30)
			)
			(1
				(blowPeepers setCycle: End)
				(blowMouth setCycle: Beg self)
			)
			(2
				(pipeSound play:)
				(blowMouth setCycle: Fwd self)
				(= ticks 90)
			)
			(3
				(blowMouth setCycle: End)
				(= ticks 120)
			)
			(4
				(blowPeepers setCycle: Beg self)
			)
			(5 (= ticks 24))
			(6
				(blowFace dispose:)
				(blowPeepers dispose:)
				(blowMouth dispose:)
				(theFrame dispose:)
				(= cycles 3)
			)
			(7
				(if local0 (proc0_4))
				(gIconBar disable: 4 5)
				(self dispose:)
			)
		)
	)
)

(instance theFrame of View
	(properties
		x 39
		y 75
		view 805
		priority 15
		signal $0010
	)
)

(instance blowFace of View
	(properties
		x 41
		y 74
		view 57
		loop 1
		priority 14
		signal $0010
	)
)

(instance blowPeepers of Prop
	(properties
		x 49
		y 37
		view 57
		loop 2
		priority 15
		signal $0010
		cycleSpeed 18
	)
)

(instance blowMouth of Prop
	(properties
		x 47
		y 54
		view 57
		cel 2
		priority 15
		signal $0010
		cycleSpeed 18
	)
)

(instance pipeSound of Sound
	(properties
		flags $0001
		number 584
	)
)
