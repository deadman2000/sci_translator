;;; Sierra Script 1.0 - (do not remove this comment)
(script# 245)
(include sci.sh)
(use n000)
(use n851)
(use n852)
(use n890)
(use n891)
(use n892)
(use n958)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	robbedTwo 0
)

(local
	[local0 8] = [2 3 1]
	[local8 4] = [6 6 1 1]
	[local12 4] = [5 2 4 4]
	[local16 8] = [74 151 72 151 72 153 74 153]
	[local24 9] = [-1 2588 17]
	[local33 7] = [1240 18 1 2 1 1]
	[local40 5] = [1240 22 2 2]
	[local45 5] = [1240 24 1 1]
	[local50 6] = [1240 26 1 2 3]
	[local56 4] = [1240 29 1]
	[local60 8] = [1240 30 2 1 1 2 1]
	[local68 5] = [1240 35 1 2]
	[local73 8] = [1240 37 1 1 2 1 2]
)
(instance robbedTwo of Rm
	(properties
		picture 240
		style $0008
	)
	
	(method (init)
		(proc958_0 128 173 33 34 151 154)
		(proc958_0 130 890 892 891)
		(super init:)
		(gIconBar enable:)
		(if (not (proc0_5 102))
			(gEgo
				init:
				x: 319
				y: 103
				signal: (| (gEgo signal?) $4000)
			)
			(proc0_2 5 33 34)
			(self setScript: theTrap)
		else
			(self setScript: xRated)
		)
	)
	
	(method (dispose)
		(proc0_6 102)
		(DisposeScript 890)
		(DisposeScript 891)
		(DisposeScript 892)
		(DisposeScript 852)
		(super dispose: &rest)
	)
)

(instance sheriffRides of Actor
	(properties
		x 319
		y 103
		view 173
		loop 1
		signal $4000
		illegalBits $0000
	)
)

(instance sheriffsHead of Prop
	(properties
		x 138
		y 64
		view 173
		loop 3
		priority 15
		signal $0010
	)
)

(instance lilj of Actor
	(properties
		x -10
		y 111
		view 151
		signal $4000
	)
)

(instance tuckie of Actor
	(properties
		x 179
		y 220
		view 154
		loop 3
		signal $4000
	)
)

(instance theTrap of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setScript: trapHim)
				(= ticks 840)
			)
			(1
				(sheriffRides setScript: youFool)
				(= ticks 6)
			)
			(2 (self dispose:))
		)
	)
)

(instance trapHim of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo
					init:
					setCycle: SyncStop 34 self
					setMotion: SlowDown 74 151 0 9 9 14
				)
			)
			(1
				(gEgo
					setCycle: StopWalk 30
					setMotion: PPath @local16 0 3 self
				)
			)
			(2 (gEgo loop: 6) (= ticks 6))
			(3
				(gEgo setCycle: 0 setMotion: 0 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance youFool of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(sheriffRides
					init:
					setCycle: FuzzyStop @local0 self
					setMotion: SlowDown 135 125 0 9 9 8
				)
			)
			(1
				(sheriffsHead init:)
				(sheriffRides loop: 2 cel: 0 stopUpd:)
				(= ticks 6)
			)
			(2
				(proc851_0 2 @local33 6 1 12 2 self)
			)
			(3
				(proc851_0 1 @local40 12 2 self)
			)
			(4
				(sheriffsHead setScript: egad)
				(= ticks 6)
			)
			(5
				(proc851_0 1 @local45 6 1 self)
			)
			(6
				(tuckie setScript: tWalk self)
				(lilj setScript: jWalk self)
			)
			(7)
			(8 (= ticks 12))
			(9
				(sheriffsHead setScript: 0)
				(proc851_0 3 @local50 6 1 15 3 12 2 self)
			)
			(10
				(lilj
					setCycle: FuzzyStop @local8 self
					setMotion: MoveTo 82 111
				)
			)
			(11
				(proc851_0 1 @local56 13 2 self)
			)
			(12 (lilj cel: 6) (= ticks 6))
			(13
				(proc851_0 2 @local60 6 3 12 2 self)
			)
			(14
				(gClient newRoom: 150)
				(self dispose:)
			)
		)
	)
)

(instance egad of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(sheriffsHead setCycle: Beg self)
			)
			(1
				(sheriffsHead setCycle: CT 2 1 self)
			)
			(2
				(= ticks (* 10 (Random 3 9)))
			)
			(3
				(sheriffsHead setCycle: End self)
			)
			(4
				(sheriffsHead setCycle: Beg self)
			)
			(5
				(= ticks (* 10 (Random 3 9)))
			)
			(6
				(sheriffsHead setCycle: End self)
			)
			(7
				(= ticks (* 10 (Random 3 9)))
			)
			(8
				(sheriffsHead setCycle: CT 3 1 self)
			)
			(9 (= state -1) (= ticks 6))
		)
	)
)

(instance jWalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(lilj
					init:
					setCycle: FuzzyStop @local8 self
					setMotion: SlowDown 77 111 0 9 9 8
				)
			)
			(1
				(lilj stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance tWalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(tuckie
					init:
					setCycle: FuzzyStop @local12 self
					setMotion: SlowDown 159 158 0 9 9 8
				)
			)
			(1
				(tuckie stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance xRated of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo view: 6 loop: 6 x: 50 y: 145 init:)
				(sheriffRides
					view: 173
					loop: 0
					cel: 0
					x: 110
					y: 130
					init:
				)
				(= ticks 12)
			)
			(1
				(proc851_0 2 @local68 @local24 2 1 3 self)
			)
			(2
				(gEgo setCycle: Fwd)
				(= ticks 300)
			)
			(3
				(gEgo loop: 7)
				(= ticks 300)
			)
			(4
				(gEgo setCycle: 0 loop: 6)
				(= ticks 6)
			)
			(5
				(proc851_0 2 @local73 @local24 2 1 3 self)
			)
			(6
				(gEgo setCycle: Fwd)
				(= ticks 300)
			)
			(7
				(gEgo loop: 7)
				(= ticks 300)
			)
			(8
				(gEgo setCycle: 0 loop: 6)
				(= ticks 6)
			)
			(9
				(sheriffRides
					setCycle: Walk
					setMotion: MoveTo 325 75 self
				)
			)
			(10
				(gClient newRoom: 160)
				(self dispose:)
			)
		)
	)
)
