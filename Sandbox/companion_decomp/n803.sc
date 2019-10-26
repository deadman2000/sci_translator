;;; Sierra Script 1.0 - (do not remove this comment)
(script# 803)
(include sci.sh)
(use n000)
(use n992)
(use n994)
(use n998)

(public
	speedTest 0
)

(local
	local0
	local1
	local2
	local3
	local4
)
(instance fred of Actor
	(properties)
)

(instance speedTest of Rm
	(properties
		picture 803
		style $0064
	)
	
	(method (init)
		(= local2 (FileIO 0 {version} 1))
		(FileIO 5 global27 6 local2)
		(FileIO 1 local2)
		(super init:)
		(global8 eachElementDo: #stop)
		(while (u> (GetTime) -1024)
		)
		(fred
			view: 803
			x: 0
			y: 99
			setStep: 1 1
			setMotion: MoveTo 319 99
			setCycle: Walk
			init:
		)
		(= global3 0)
		(= local1 0)
		(= local3 (if (proc0_5 0) 90 else 60))
		(= local4 (if (proc0_5 0) 59 else 30))
	)
	
	(method (doit)
		(super doit:)
		(if (== (++ local1) 1) (= local0 (+ 60 (GetTime))))
		(if (u< local0 (GetTime))
			(= global87
				(cond 
					((> local1 local3) 2)
					((> local1 local4) 1)
					(else 0)
				)
			)
			(global1 detailLevel: (+ global87 1))
			(= global141 (+ global87 4))
			(= global3 6)
			(global1 egoMoveSpeed: global141)
			(gEgo moveSpeed: global141 cycleSpeed: global141)
			(gIconBar enable:)
			(gClient newRoom: global147)
		)
	)
)
