;;; Sierra Script 1.0 - (do not remove this comment)
(script# 170)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n992)
(use n994)
(use n998)

(public
	robinDeath 0
)

(procedure (localproc_000e param1 param2)
	(willHead setCycle: Fwd)
	(proc13_6 2)
	(proc13_4 param1 param2 self 67 10 10 80 {Will})
)

(procedure (localproc_0037)
	(johnHead setCycle: Fwd)
	(johnArm setCycle: Fwd)
	(proc13_6 1)
	(proc13_4 &rest 80 {John})
)

(procedure (localproc_0063)
	(tuckHead setCycle: Fwd)
	(tuckHands setCycle: Fwd)
	(proc13_6 3)
	(proc13_4 &rest 67 80 20 80 {Tuck})
)

(procedure (localproc_0097)
	(alanHead setCycle: Fwd)
	(alanArm setCycle: Fwd)
	(proc13_6 4)
	(proc13_4 &rest 67 100 25 80 {Alan})
)

(procedure (localproc_00cb)
	(muchHead setCycle: Fwd)
	(proc13_6 5)
	(proc13_4 &rest 67 130 10 80 {Much})
)

(procedure (localproc_00f4)
	(willHead setCycle: Beg)
)

(procedure (localproc_0101)
	(muchHead setCycle: Beg)
)

(procedure (localproc_010e)
	(tuckHead setCycle: Beg)
	(tuckHands setCycle: Beg)
)

(procedure (localproc_0127)
	(johnHead setCycle: Beg)
	(johnArm setCycle: Beg)
)

(procedure (localproc_0140)
	(alanHead setCycle: Beg)
	(alanArm setCycle: Beg)
)

(procedure (localproc_0159)
	(proc0_4)
	(gIconBar enable:)
	(proc13_6 0)
	(proc806_0)
)

(instance robinDeath of Rm
	(properties
		picture 160
		style $000a
	)
	
	(method (init)
		(johnHead init:)
		(johnArm init:)
		(tuckHead init:)
		(tuckHands init:)
		(alanHead init:)
		(alanArm init:)
		(willHead init:)
		(muchHead init:)
		(super init:)
		(proc806_2 johnBody tuckBody alanBody willBody muchBody)
		(proc0_3)
		(gIconBar disable:)
		(gRgnMusic number: 173 loop: -1 play:)
		(switch global145
			(0
				(global2 setScript: death2InRm120)
			)
			(1
				(global2 setScript: death3InRm120)
			)
			(2
				(global2 setScript: death4InRm120)
			)
			(3
				(global2 setScript: death5InRm120)
			)
			(4
				(global2 setScript: death1InFairRgn)
			)
			(5
				(global2 setScript: deathInRm360)
			)
			(6
				(global2 setScript: death1InRm390)
			)
			(7
				(global2 setScript: death2InRm390)
			)
			(8
				(global2 setScript: death3InRm390)
			)
			(9
				(global2 setScript: death4InRm390)
			)
			(10
				(global2 setScript: death1InAbyRegn)
			)
			(11
				(global2 setScript: death2InAbyRegn)
			)
			(12
				(global2 setScript: death3InAbyRegn)
			)
			(13
				(global2 setScript: death1InRm440)
			)
			(14
				(global2 setScript: death2InRm440)
			)
			(15
				(global2 setScript: death1InRm460)
			)
			(16
				(global2 setScript: death2InRm460)
			)
			(17
				(global2 setScript: death3InRm460)
			)
			(18
				(global2 setScript: death4InRm460)
			)
			(19
				(global2 setScript: death1InRm620)
			)
			(20
				(global2 setScript: death2InRm620)
			)
			(21
				(global2 setScript: deathInRm620)
			)
			(22
				(global2 setScript: deathInRm650)
			)
			(23
				(global2 setScript: deathInWatrGate)
			)
			(24
				(global2 setScript: deathInRm470)
			)
			(25
				(global2 setScript: death1InRm500)
			)
			(26
				(global2 setScript: death2InRm500)
			)
			(27
				(global2 setScript: death1InRm530)
			)
			(28
				(global2 setScript: death2InRm530)
			)
			(29
				(global2 setScript: death3InRm530)
			)
			(30
				(global2 setScript: deathInRm550)
			)
			(31
				(global2 setScript: death1InRm570)
			)
			(32
				(global2 setScript: death2InRm570)
			)
			(33
				(global2 setScript: deathInForest)
			)
			(34
				(global2 setScript: deathInRm320)
			)
			(35
				(global2 setScript: getInBoatRm620)
			)
			(36
				(global2 setScript: death2InFairRgn)
			)
			(37
				(global2 setScript: deathInRm501)
			)
			(38
				(global2 setScript: deathInRm710)
			)
			(39
				(global2 setScript: death5InRm390)
			)
			(40
				(global2 setScript: tooLateInTheHedge)
			)
		)
	)
	
	(method (dispose)
		(gRgnMusic stop:)
		(super dispose: &rest)
	)
)

(instance tuckBody of PicView
	(properties
		x 131
		y 189
		view 175
		loop 5
		priority 14
		signal $4000
	)
)

(instance tuckHead of Prop
	(properties
		x 138
		y 135
		view 175
		loop 3
		cel 4
		priority 15
		signal $4010
		cycleSpeed 24
	)
)

(instance tuckHands of Prop
	(properties
		x 116
		y 175
		view 175
		loop 4
		priority 15
		signal $4010
		cycleSpeed 36
	)
)

(instance johnBody of PicView
	(properties
		x 83
		y 95
		view 175
		loop 2
		priority 14
		signal $4000
	)
)

(instance johnHead of Prop
	(properties
		x 80
		y 110
		view 175
		priority 15
		signal $4014
		cycleSpeed 15
	)
)

(instance johnArm of Prop
	(properties
		x 62
		y 120
		view 175
		loop 1
		priority 15
		signal $4010
		cycleSpeed 48
	)
)

(instance alanBody of PicView
	(properties
		x 204
		y 189
		view 175
		loop 8
		priority 14
		signal $4000
	)
)

(instance alanHead of Prop
	(properties
		x 192
		y 146
		view 175
		loop 6
		priority 15
		signal $4014
		cycleSpeed 12
	)
)

(instance alanArm of Prop
	(properties)
)

(instance willBody of PicView
	(properties
		x 24
		y 189
		view 175
		loop 10
		priority 14
		signal $4000
	)
)

(instance willHead of Prop
	(properties
		x 20
		y 156
		view 175
		loop 9
		priority 15
		signal $4014
		cycleSpeed 12
	)
)

(instance muchBody of PicView
	(properties
		x 289
		y 189
		view 175
		loop 12
		priority 14
		signal $4000
	)
)

(instance muchHead of Prop
	(properties
		x 293
		y 118
		view 175
		loop 11
		priority 15
		signal $4014
		cycleSpeed 12
	)
)

(instance death2InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (localproc_0097 1169 0 self))
			(1
				(localproc_0140)
				(localproc_0037 1169 1 self)
			)
			(2
				(localproc_0127)
				(localproc_000e 1169 2 self)
			)
			(3
				(localproc_00f4)
				(localproc_0037 1169 3 self)
			)
			(4
				(localproc_0127)
				(localproc_0063 1169 4 self)
			)
			(5
				(localproc_010e)
				(localproc_0097 1169 5 self)
			)
			(6
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death3InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (localproc_0063 1169 6 self))
			(1
				(localproc_010e)
				(localproc_0037 1169 7 self)
			)
			(2
				(localproc_0127)
				(localproc_0097 1169 8 self)
			)
			(3
				(localproc_0140)
				(localproc_000e 1169 9 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death4InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e 1169 10 self)
			)
			(1
				(localproc_00f4)
				(localproc_0063 1169 11 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1169 12 self)
			)
			(3
				(localproc_0127)
				(localproc_00cb 1169 13 self)
			)
			(4
				(localproc_0101)
				(localproc_0097 1169 14 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InFairRgn of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1169 15 self)
			)
			(1
				(localproc_010e)
				(localproc_0037 1169 16 self)
			)
			(2
				(localproc_0127)
				(localproc_000e 1169 17 self)
			)
			(3
				(localproc_00f4)
				(localproc_0097 1169 18 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm360 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1169 19 self)
			)
			(1
				(localproc_0140)
				(localproc_00cb 1169 20 self)
			)
			(2
				(localproc_0101)
				(localproc_0037 1169 21 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1169 22 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1169 23 self)
			)
			(1
				(localproc_0127)
				(localproc_000e 1169 24 self)
				self
			)
			(2
				(localproc_00f4)
				(localproc_0063 1169 25 self)
			)
			(3
				(localproc_010e)
				(localproc_0097 1169 26 self)
			)
			(4
				(localproc_0140)
				(localproc_0063 1169 27 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1169 28 self)
			)
			(1
				(localproc_0140)
				(localproc_000e 1169 29 self)
			)
			(2
				(localproc_00f4)
				(localproc_0037 1169 30 self)
			)
			(3
				(localproc_0127)
				(localproc_0097 1169 31 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death3InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1169 32 self)
			)
			(1
				(localproc_0127)
				(localproc_0063 1169 33 self)
			)
			(2
				(localproc_010e)
				(localproc_00cb 1169 34 self)
			)
			(3
				(localproc_0101)
				(localproc_000e 1169 35 self)
			)
			(4
				(localproc_00f4)
				(localproc_0097 1169 36 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death4InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1169 37 self)
			)
			(1
				(localproc_0140)
				(localproc_0063 1169 38 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1169 39 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1169 40 self)
			)
			(4
				(localproc_00f4)
				(localproc_0097 1169 41 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InAbyRegn of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1169 42 self)
			)
			(1
				(localproc_0127)
				(localproc_0063 1169 43 self)
			)
			(2
				(localproc_010e)
				(localproc_0097 1169 44 self)
			)
			(3
				(localproc_0140)
				(localproc_00cb 1169 45 self)
			)
			(4
				(localproc_0101)
				(localproc_0097 1169 46 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InAbyRegn of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_00cb 1169 47 self)
			)
			(1
				(localproc_0101)
				(localproc_0063 1169 48 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1169 49 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1169 50 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death3InAbyRegn of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e 1169 51 self)
			)
			(1
				(localproc_00f4)
				(localproc_0037 1169 52 self)
			)
			(2
				(localproc_0127)
				(localproc_0063 1169 53 self)
			)
			(3
				(localproc_010e)
				(localproc_0097 1169 54 self)
			)
			(4
				(localproc_0140)
				(localproc_0063 1169 55 self)
			)
			(5
				(localproc_010e)
				(localproc_0097 1169 56 self)
			)
			(6
				(localproc_0140)
				(localproc_0037 1169 57 self)
			)
			(7
				(localproc_0127)
				(localproc_0097 1169 58 self)
			)
			(8
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm440 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1169 59 self)
			)
			(1
				(localproc_010e)
				(localproc_0037 1169 60 self)
			)
			(2
				(localproc_0127)
				(localproc_000e 1169 61 self)
			)
			(3
				(localproc_00f4)
				(localproc_0063 1169 62 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm440 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e 1169 63 self)
			)
			(1
				(localproc_00f4)
				(localproc_0097 1169 64 self)
			)
			(2
				(localproc_0140)
				(localproc_0037 1169 65 self)
			)
			(3
				(localproc_0127)
				(localproc_0063 1169 66 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1169 67 self)
			)
			(1
				(localproc_010e)
				(localproc_0037 1169 68 self)
			)
			(2
				(localproc_0127)
				(localproc_000e 1169 69 self)
			)
			(3
				(localproc_000e 1169 70 self)
			)
			(4
				(localproc_00f4)
				(localproc_0097 1169 71 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1169 72 self)
			)
			(1
				(localproc_010e)
				(localproc_0097 1169 73 self)
			)
			(2
				(localproc_0140)
				(localproc_0037 1169 74 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1169 75 self)
			)
			(4
				(localproc_00f4)
				(localproc_0063 1169 76 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death3InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1169 77 self)
			)
			(1
				(localproc_0140)
				(localproc_0037 1169 78 self)
			)
			(2
				(localproc_0127)
				(localproc_0063 1169 79 self)
			)
			(3
				(localproc_010e)
				(localproc_000e 1169 80 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death4InRm460 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1169 81 self)
			)
			(1
				(localproc_0127)
				(localproc_00cb 1169 82 self)
			)
			(2
				(localproc_0101)
				(localproc_0097 1169 83 self)
			)
			(3
				(localproc_0140)
				(localproc_00cb 1169 84 self)
			)
			(4
				(localproc_0101)
				(localproc_0037 1169 85 self)
			)
			(5
				(localproc_0127)
				(localproc_00cb 1169 86 self)
			)
			(6
				(localproc_0101)
				(localproc_0037 1169 87 self)
			)
			(7
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (localproc_0037 1170 0 self))
			(1
				(localproc_0127)
				(localproc_000e 1170 1 self)
			)
			(2
				(localproc_00f4)
				(localproc_0063 1170 2 self)
			)
			(3
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (localproc_0063 1170 3 self))
			(1
				(localproc_010e)
				(localproc_0037 1170 4 self)
			)
			(2
				(localproc_0127)
				(localproc_000e 1170 5 self)
			)
			(3
				(localproc_00f4)
				(localproc_00cb 1170 6 self)
			)
			(4
				(localproc_0101)
				(localproc_0097 1170 7 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm650 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (localproc_0097 1170 8 self))
			(1
				(localproc_0140)
				(localproc_0063 1170 9 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1170 10 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1170 11 self)
			)
			(4
				(localproc_00f4)
				(localproc_00cb 1170 12 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInWatrGate of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1170 90 self)
			)
			(1
				(localproc_0140)
				(localproc_0063 1170 91 self)
			)
			(2
				(localproc_010e)
				(localproc_00cb 1170 92 self)
			)
			(3
				(localproc_0101)
				(localproc_0037 1170 93 self)
			)
			(4
				(localproc_0127)
				(localproc_000e 1170 94 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm470 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e 1170 13 self)
			)
			(1
				(localproc_00f4)
				(localproc_0063 1170 14 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1170 15 self)
			)
			(3
				(localproc_0127)
				(localproc_0097 1170 16 self)
			)
			(4
				(localproc_0140)
				(localproc_0063 1170 17 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm500 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1170 18 self)
			)
			(1
				(localproc_0127)
				(localproc_0063 1170 19 self)
			)
			(2
				(localproc_010e)
				(localproc_000e 1170 20 self)
			)
			(3
				(localproc_00f4)
				(localproc_0097 1170 21 self)
			)
			(4
				(localproc_0140)
				(localproc_0037 1170 22 self)
			)
			(5
				(localproc_0127)
				(localproc_0097 1170 23 self)
			)
			(6
				(localproc_0140)
				(localproc_0037 1170 24 self)
			)
			(7
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm500 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1170 25 self)
			)
			(1
				(localproc_0127)
				(localproc_00cb 1170 26 self)
			)
			(2
				(localproc_0101)
				(localproc_0037 1170 27 self)
			)
			(3
				(localproc_0127)
				(localproc_0097 1170 28 self)
			)
			(4
				(localproc_0140)
				(localproc_0063 1170 29 self)
			)
			(5
				(localproc_010e)
				(localproc_000e 1170 30 self)
			)
			(6
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm530 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_00cb 1170 31 self)
			)
			(1
				(localproc_0101)
				(localproc_0063 1170 32 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1170 33 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1170 34 self)
			)
			(4
				(localproc_00f4)
				(localproc_0097 1170 35 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm530 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1170 36 self)
			)
			(1
				(localproc_010e)
				(localproc_0037 1170 37 self)
			)
			(2
				(localproc_0127)
				(localproc_00cb 1170 38 self)
			)
			(3
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death3InRm530 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1170 39 self)
			)
			(1
				(localproc_010e)
				(localproc_00cb 1170 40 self)
			)
			(2
				(localproc_0101)
				(localproc_000e 1170 41 self)
			)
			(3
				(localproc_00f4)
				(localproc_0037 1170 42 self)
			)
			(4
				(localproc_0127)
				(localproc_0063 1170 43 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm550 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1170 44 self)
			)
			(1
				(localproc_0140)
				(localproc_0037 1170 45 self)
			)
			(2
				(localproc_0127)
				(localproc_00cb 1170 46 self)
			)
			(3
				(localproc_0101)
				(localproc_000e 1170 47 self)
			)
			(4
				(localproc_00f4)
				(localproc_0063 1170 48 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death1InRm570 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1170 49 self)
			)
			(1
				(localproc_0140)
				(localproc_0037 1170 50 self)
			)
			(2
				(localproc_0127)
				(localproc_0063 1170 51 self)
			)
			(3
				(localproc_010e)
				(localproc_00cb 1170 52 self)
			)
			(4
				(localproc_0101)
				(localproc_000e 1170 53 self)
			)
			(5
				(localproc_00f4)
				(localproc_0037 1170 54 self)
			)
			(6
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InRm570 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1170 55 self)
			)
			(1
				(localproc_0140)
				(localproc_0037 1170 56 self)
			)
			(2
				(localproc_0127)
				(localproc_0063 1170 57 self)
			)
			(3
				(localproc_010e)
				(localproc_000e 1170 58 self)
			)
			(4
				(localproc_00f4)
				(localproc_00cb 1170 59 self)
			)
			(5
				(localproc_0101)
				(localproc_0037 1170 60 self)
			)
			(6
				(localproc_0037 1170 61 self)
			)
			(7
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInForest of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e 1170 62 self)
			)
			(1
				(localproc_00f4)
				(localproc_0037 1170 63 self)
			)
			(2
				(localproc_0127)
				(localproc_0063 1170 64 self)
			)
			(3
				(localproc_010e)
				(localproc_0097 1170 65 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death5InRm120 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1170 66 self)
			)
			(1
				(localproc_0127)
				(localproc_0063 1170 67 self)
			)
			(2
				(localproc_010e)
				(localproc_000e 1170 68 self)
			)
			(3
				(localproc_00f4)
				(localproc_0097 1170 69 self)
			)
			(4
				(localproc_0140)
				(localproc_0037 1170 70 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_00cb 1170 71 self)
			)
			(1
				(localproc_0101)
				(localproc_0063 1170 72 self)
			)
			(2
				(localproc_010e)
				(localproc_0037 1170 73 self)
			)
			(3
				(localproc_0127)
				(localproc_000e 1170 74 self)
			)
			(4
				(localproc_00f4)
				(localproc_0037 1170 75 self)
			)
			(5
				(localproc_0127)
				(localproc_000e 1170 76 self)
			)
			(6
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm320 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1170 77 self)
			)
			(1
				(localproc_0140)
				(localproc_0063 1170 78 self)
			)
			(2
				(localproc_010e)
				(localproc_000e 1170 79 self)
			)
			(3
				(localproc_00f4)
				(localproc_0037 1170 80 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance getInBoatRm620 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0037 1170 81 self)
			)
			(1
				(localproc_0127)
				(localproc_0063 1170 82 self)
			)
			(2
				(localproc_010e)
				(localproc_000e 1170 83 self)
			)
			(3
				(localproc_00f4)
				(localproc_0097 1170 84 self)
			)
			(4
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death2InFairRgn of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1170 85 self)
			)
			(1
				(localproc_010e)
				(localproc_0037 1170 86 self)
			)
			(2
				(localproc_0127)
				(localproc_00cb 1170 87 self)
			)
			(3
				(localproc_0101)
				(localproc_000e 1170 88 self)
			)
			(4
				(localproc_00f4)
				(localproc_0097 1170 89 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm501 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1170 95 self)
			)
			(1
				(localproc_010e)
				(localproc_0037 1170 96 self)
			)
			(2
				(localproc_0127)
				(localproc_0097 1170 97 self)
			)
			(3
				(localproc_0140)
				(localproc_000e 1170 98 self)
			)
			(4
				(localproc_00f4)
				(localproc_0097 1170 99 self)
			)
			(5
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance deathInRm710 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0097 1170 100 self)
			)
			(1
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance death5InRm390 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e 1170 101 self)
			)
			(1
				(localproc_00f4)
				(localproc_0037 1170 102 self)
			)
			(2
				(localproc_0127)
				(localproc_0097 1170 103 self)
			)
			(3
				(localproc_0140)
				(localproc_0063 1170 104 self)
			)
			(4
				(localproc_0063 1170 105 self)
			)
			(5
				(localproc_010e)
				(localproc_000e 1170 106 self)
			)
			(6
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance tooLateInTheHedge of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0063 1170 107 self)
			)
			(1
				(localproc_010e)
				(localproc_000e 1170 108 self)
			)
			(2
				(localproc_00f4)
				(localproc_00cb 1170 109 self)
			)
			(3
				(localproc_0101)
				(localproc_0097 1170 110 self)
			)
			(4
				(localproc_0140)
				(localproc_0037 1170 111 self)
			)
			(5
				(localproc_0127)
				(localproc_0063 1170 112 self)
			)
			(6
				(localproc_0159)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(localproc_0159)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)
