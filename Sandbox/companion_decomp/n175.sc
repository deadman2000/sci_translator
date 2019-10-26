;;; Sierra Script 1.0 - (do not remove this comment)
(script# 175)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n994)
(use n998)
(use n999)

(public
	muchswobat 0
)

(local
	local0
)
(instance muchswobat of Rm
	(properties
		style $0008
	)
	
	(method (init)
		(Load rsPIC 110)
		(proc958_0 128 1 80 152 155 158 161 164)
		(proc958_0 132)
		(global2 drawPic: 110 6)
		(global10 add: frieze1 frieze2 eachElementDo: #init doit:)
		(robinh init:)
		(lilj init:)
		(aland init:)
		(wills init:)
		(muchm init:)
		(friart init:)
		(robinHead init:)
		(robinHead setScript: lookSee)
		(self setScript: whatNoBattle)
		(super init:)
	)
)

(instance frieze1 of PicView
	(properties
		x 31
		y 189
		sightAngle 90
		view 80
		priority 15
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 1391
		sightAngle 90
		lookStr 1414
		view 80
		cel 1
		priority 15
	)
)

(instance robinh of View
	(properties
		x 154
		y 156
		view 1
		loop 6
		priority 15
		signal $0010
	)
)

(instance lilj of View
	(properties
		x 125
		y 205
		view 152
		loop 3
		priority 15
		signal $0010
	)
)

(instance friart of View
	(properties
		x 77
		y 149
		view 155
	)
)

(instance aland of View
	(properties
		x 251
		y 179
		view 158
		loop 1
	)
)

(instance wills of View
	(properties
		x 211
		y 189
		view 161
		loop 1
	)
)

(instance muchm of View
	(properties
		x 73
		y 215
		view 164
		loop 3
	)
)

(instance robinHead of Prop
	(properties
		x 154
		y 117
		view 1
		loop 8
		priority 15
		signal $0010
	)
)

(instance lookSee of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(robinHead cel: 1)
				(= ticks (* (= local0 (Random 2 6)) 48))
			)
			(1
				(robinHead cel: 2)
				(= ticks (* (= local0 (Random 1 3)) 48))
			)
			(2 (= state -1) (= ticks 128))
		)
	)
)

(instance whatNoBattle of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_6 3)
				(proc13_4 175 0 self 80 {Friar Tuck})
				(= seconds 8)
			)
			(1
				(proc13_6 1)
				(proc13_4 175 1 self 80 {Little John})
				(= seconds 10)
			)
			(2
				(proc13_6 0)
				(global2 newRoom: 160)
				(self dispose:)
			)
		)
	)
)
