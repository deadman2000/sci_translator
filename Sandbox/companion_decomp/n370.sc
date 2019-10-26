;;; Sierra Script 1.0 - (do not remove this comment)
(script# 370)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n939)
(use n950)
(use n992)
(use n994)
(use n998)

(public
	rm370 0
)

(local
	local0
)
(procedure (localproc_000e)
	(proc13_4 &rest 67 3 15 70 61)
)

(procedure (localproc_0021)
	(proc13_6 20)
	(proc13_4 &rest 67 250 15 70 67)
	(proc13_6 0)
)

(instance rm370 of Rm
	(properties
		picture 370
	)
	
	(method (init)
		(super init:)
		(gIconBar disable:)
		(proc0_6 190)
		(lobbsHead init:)
		(lobbsArm init:)
		(egoHead init:)
		(egoArm init:)
		(exitRoom init:)
		(candle init: setCycle: Fwd)
		(if (gEgo has: 15) (proc13_4 1370 0))
		(gClient setScript: dialogScript self)
	)
	
	(method (dispose)
		(if (not (gEgo has: 15))
			(gEgo put: 3)
			(gEgo get: 15)
			(proc806_1 25 82)
		)
		(gIconBar enable:)
		(DisposeScript 939)
		(super dispose:)
	)
)

(instance exitRoom of Feature
	(properties
		nsBottom 189
		nsRight 319
		onMeCheck $0010
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(if (self onMe: pEvent) (gClient newRoom: 360))
	)
)

(instance lobbsHead of Prop
	(properties
		x 190
		y 107
		view 371
		loop 4
	)
)

(instance lobbsArm of Prop
	(properties
		x 198
		y 110
		view 371
		loop 5
	)
)

(instance egoArm of Prop
	(properties
		x 147
		y 118
		view 371
		loop 2
	)
)

(instance egoHead of Prop
	(properties
		x 145
		y 110
		view 371
		loop 1
	)
)

(instance candle of Actor
	(properties
		x 233
		y 115
		view 371
	)
)

(instance dialogScript of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds 3))
			(1
				(proc0_3)
				(global1 setCursor: global19 1 160 180)
				(lobbsHead setCycle: Osc 20)
				(proc13_6 20)
				(proc13_4 1370 1 self 67 249 15 70 68)
				(proc13_6 0)
			)
			(2
				(lobbsArm setCycle: Osc 3)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 2 self)
			)
			(3
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(lobbsArm setCycle: End)
				(localproc_000e 1370 3 self)
			)
			(4
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(egoArm setCycle: Osc 2)
				(localproc_0021 1370 4 self)
			)
			(5
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(egoArm setCycle: End)
				(localproc_000e 1370 5 self)
			)
			(6
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 6 self)
			)
			(7
				(lobbsArm setCycle: Osc 1)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 7 self)
			)
			(8
				(lobbsHead setCycle: 0)
				(lobbsArm setCycle: End)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 8 self)
			)
			(9
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 9 self)
			)
			(10
				(egoArm setCycle: Osc 2)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 10 self)
			)
			(11
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 11 self)
			)
			(12
				(egoHead setCycle: 0)
				(lobbsArm setCycle: Osc 2)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 12 self)
			)
			(13
				(lobbsArm setCycle: End)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 13 self)
			)
			(14
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 14 self)
			)
			(15
				(lobbsArm setCycle: Osc 3)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 15 self)
			)
			(16
				(lobbsHead setCycle: 0)
				(egoArm setCycle: Osc 2)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 16 self)
			)
			(17
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(proc13_6 20)
				(proc13_4 1370 17 self 67 230 15 70 75)
				(proc13_6 0)
			)
			(18
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 18 self)
			)
			(19
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 19 self)
			)
			(20
				(lobbsArm setCycle: Osc 3)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 20 self)
			)
			(21
				(lobbsHead setCycle: 0)
				(egoArm setCycle: Osc 2)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 21 self)
			)
			(22
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 22 self)
			)
			(23
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 23 self)
			)
			(24
				(egoHead setCycle: 0)
				(egoArm setCycle: Osc 2)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 24 self)
			)
			(25
				(egoArm setCycle: End)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 25 self)
			)
			(26
				(lobbsArm setCycle: Osc 3)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 26 self)
			)
			(27
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 27 self)
			)
			(28
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 28 self)
			)
			(29
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 29 self)
			)
			(30
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 30 self)
				(lobbsArm setCycle: End)
			)
			(31
				(lobbsArm setLoop: 6 x: 194 setCel: 0 setCycle: End self)
			)
			(32
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 31 self)
			)
			(33
				(lobbsHead setCycle: 0)
				(egoArm setLoop: 3 setCycle: End self)
			)
			(34
				(egoArm
					x: 149
					y: 119
					setCel: (gEgo lastCel:)
					setCycle: Beg
				)
				(gEgo put: 3)
				(gEgo get: 15)
				(proc806_1 25 82)
				(lobbsArm
					setLoop: 5
					x: 198
					setCel: (lobbsArm lastCel:)
					setCycle: Beg self
				)
			)
			(35
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 32 self)
			)
			(36
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 33 self)
			)
			(37
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 34 self)
			)
			(38
				(lobbsHead setCycle: Osc 20)
				(lobbsArm setCycle: Osc 1)
				(localproc_0021 1370 35 self)
			)
			(39
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 36 self)
			)
			(40
				(egoHead setCycle: 0)
				(lobbsHead setCycle: Osc 20)
				(lobbsArm setCycle: End)
				(localproc_0021 1370 37 self)
			)
			(41
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 38 self)
			)
			(42
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 39 self)
			)
			(43
				(egoHead setCycle: 0)
				(lobbsArm setCycle: Osc 3)
				(lobbsHead setCycle: Osc 20)
				(localproc_0021 1370 40 self)
			)
			(44
				(lobbsHead setCycle: 0)
				(egoHead setCycle: Osc 20)
				(localproc_000e 1370 41 self)
			)
			(45
				(proc0_4)
				(gClient newRoom: 360)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(= local0 1)
			(egoHead setCycle: 0 delete: dispose:)
			(egoArm setCycle: 0 delete: dispose:)
			(lobbsArm setCycle: 0 delete: dispose:)
			(lobbsHead setCycle: 0 delete: dispose:)
			(self dispose:)
			(gClient newRoom: 360)
		else
			(super cue: &rest)
		)
	)
)
