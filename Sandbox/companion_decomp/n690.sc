;;; Sierra Script 1.0 - (do not remove this comment)
(script# 690)
(include sci.sh)
(use n000)
(use n625)
(use n851)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm690 0
)

(local
	local0
	[newClFog 3]
	[local4 3] = [282 200 107]
	[local7 3] = [86 200 189]
	local10
	[newWave 7]
	[local18 8] = [206 143 278 157 307 237 76 264]
	[local26 8] = [144 134 127 184 91 117 173 86]
	[local34 8] = [8 8 9 9 9 9 8 8]
	local42
	[local43 5] = [1690 0 1 2]
	[local48 4] = [1690 2 2]
)
(procedure (localproc_000e)
	(= local10 0)
	(while (< local10 4)
		([newClFog local10]
			x: [local4 local10]
			y: [local7 (= [newClFog local10] (clFog new:))]
			setCel: 221
			init:
		)
		(++ local10)
	)
)

(procedure (localproc_0047 &tmp temp0)
	(= temp0 0)
	(while (< temp0 7)
		((= [newWave temp0] (wave new:))
			x: [local18 temp0]
			y: [local26 temp0]
			loop: [local34 temp0]
			init:
		)
		(++ temp0)
	)
)

(instance rm690 of Rm
	(properties
		picture 690
		style $000a
	)
	
	(method (init)
		(super init:)
		(if (not (proc0_5 0)) (localproc_0047))
		(if (not (proc0_5 0))
			(clFog view: 590 loop: 2)
		else
			(clFog view: 690 loop: 0)
		)
		(gEgo
			view: 585
			loop: 1
			cel: 0
			posn: 171 130
			signal: 2048
			init:
		)
		(gRgnMusic number: 585 loop: -1 play:)
		(theBoat init:)
		(fulk init:)
		(gate init:)
		(localproc_000e)
	)
	
	(method (doit)
		(++ local42)
		(if
			(and
				(> (global1 detailLevel:) 2)
				(== (mod local42 5) 0)
			)
			(Palette 6 225 255 -1)
		)
		(if (gEgo script?) 0 else (gEgo setScript: gateDown))
		(super doit: &rest)
	)
	
	(method (dispose)
		(= local10 0)
		(while (< local10 8)
			(if (gNewCast contains: [newClFog local10])
				([newClFog local10] dispose:)
			)
			(++ local10)
		)
		(super dispose:)
	)
)

(instance gate of Prop
	(properties
		x 123
		y 60
		view 681
		loop 5
		cel 8
	)
)

(instance clFog of Prop
	(properties
		signal $4001
	)
)

(instance wave of Prop
	(properties
		view 681
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(if (Random 0 1)
			(self setCel: (Random 0 2) setCycle: Fwd)
		else
			(self setCel: (Random 0 2) setCycle: Rev)
		)
		(super init:)
	)
)

(instance theBoat of Actor
	(properties
		x 195
		y 113
		view 21
		loop 1
	)
	
	(method (doit)
		(if (gEgo mover?)
			(self posn: (+ (gEgo x?) 24) (- (gEgo y?) 20))
		else
			(super doit:)
		)
	)
)

(instance fulk of Actor
	(properties
		x 134
		y 127
		view 674
		loop 3
		cel 9
	)
	
	(method (doit)
		(if (gEgo mover?)
			(self posn: (- (gEgo x?) 37) (- (gEgo y?) 5))
		else
			(super doit:)
		)
	)
)

(instance gateDown of Script
	(properties)
	
	(method (dispose)
		(steelGate dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 36))
			(1
				(gate setCycle: Beg self)
				(steelGate play:)
			)
			(2
				(steelGate number: 532 loop: 1 play:)
				(proc851_0 @local43 (Monastery tFULK?) 8 self)
				(gRgnMusic2 number: 583 loop: -1 play:)
			)
			(3
				(proc851_0 @local48 (Monastery tFULK?) 8 self)
			)
			(4
				(gEgo cel: 0 cycleSpeed: 18 setCycle: End)
				(proc0_6 13)
				(gEgo setScript: outOfHere)
			)
		)
	)
)

(instance outOfHere of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic2 fade: 50 30 5 0)
				(gEgo setMotion: MoveTo 395 190 self)
			)
			(1 (gClient newRoom: 600))
		)
	)
)

(instance steelGate of Sound
	(properties
		flags $0001
		number 673
		loop -1
	)
)
