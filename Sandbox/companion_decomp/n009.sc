;;; Sierra Script 1.0 - (do not remove this comment)
(script# 9)
(include sci.sh)
(use n000)
(use n806)
(use n851)
(use n945)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm9 0
)

(local
	[local0 9] = [-1 2706 32]
	[local9 4] = [1009 0 1]
	[local13 4] = [1009 1 1]
	[local17 4] = [1009 2 1]
	[local21 5] = [1009 3 1 2]
)
(instance rm9 of Rm
	(properties
		picture 120
		style $000a
	)
	
	(method (init)
		(= global146 global139)
		(proc806_4 (- global139))
		(super init:)
		(proc958_0 128 127 212 8)
		(= global139 0)
		(theKnight init: setCycle: Walk)
		(myWill init:)
		(myJohn init:)
		(myTuck init:)
		(myAlan init:)
		(myMuch init:)
		(proc0_2 5)
		(gEgo cel: 1 posn: 300 -10 signal: 24576 init:)
		(if (not (proc0_5 5))
			(maidMarian setCycle: Walk init: stopUpd:)
		)
		(gRgnMusic number: 9 loop: -1 play:)
		(gEgo setScript: doTheSlideShow)
	)
	
	(method (dispose)
		(gRgnMusic fade: 0 20 12 1)
		(super dispose:)
	)
)

(instance myWill of View
	(properties
		x 227
		y 120
		view 161
		loop 3
		signal $0001
	)
)

(instance myJohn of View
	(properties
		x 104
		y 62
		view 152
		signal $0001
	)
)

(instance myTuck of View
	(properties
		x 61
		y 57
		view 155
		signal $0001
	)
)

(instance myAlan of View
	(properties
		x 38
		y 103
		view 158
		signal $0001
	)
)

(instance myMuch of View
	(properties
		x 7
		y 97
		view 164
		signal $0001
	)
)

(instance horseAndKnight of Prop
	(properties
		x 165
		y 90
		view 127
		loop 3
		signal $4001
	)
)

(instance knightArm of Prop
	(properties
		x 174
		y 25
		view 127
		priority 12
		signal $0010
	)
)

(instance knightHead of Prop
	(properties
		x 166
		y 23
		view 127
		loop 2
		priority 12
		signal $4010
	)
)

(instance theKnight of Actor
	(properties
		x 270
		view 127
		loop 1
	)
)

(instance maidMarian of Actor
	(properties
		x 340
		y 82
		view 211
		loop 1
	)
)

(instance mule1 of Actor
	(properties
		x 256
		y -10
		view 127
		loop 4
	)
)

(instance mule2 of Actor
	(properties
		x 311
		y -60
		view 127
		loop 4
	)
)

(instance doTheSlideShow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(theKnight setLoop: 1 setMotion: PolyPath 165 89 self)
				(gEgo setMotion: PolyPath 230 75)
			)
			(1
				(proc0_9 theKnight gEgo)
				(= cycles 1)
			)
			(2
				(theKnight hide:)
				(gEgo view: 8 setLoop: 0 setCel: 0 setCycle: End self)
				(horseAndKnight init:)
				(knightHead init:)
				(knightArm init:)
			)
			(3
				(proc0_2 1 0 1)
				(if (proc0_5 65)
					(mule1
						setLoop: 4
						setCycle: Walk
						signal: 26624
						init:
						illegalBits: 0
						setMotion: PolyPath 212 60
					)
					(mule2
						setLoop: 4
						illegalBits: 0
						init:
						setCycle: Walk
						signal: 26624
						setMotion: PolyPath 185 50 self
					)
				else
					(= cycles 1)
				)
			)
			(4
				(if (and (not (proc0_5 5)) (proc0_5 62))
					(maidMarian setMotion: PolyPath 252 77 self)
				else
					(= ticks 6)
				)
			)
			(5
				(if (and (not (proc0_5 5)) (proc0_5 62))
					(maidMarian
						view: 212
						setLoop: 1
						setCel: 0
						y: (+ (maidMarian y?) 1)
						signal: 16384
					)
				)
				(= ticks 6)
			)
			(6
				(if (proc0_5 65) (mule1 setCel: 2) (mule2 setCel: 2))
				(= ticks 6)
			)
			(7
				(if (proc0_5 65) (mule1 loop: 5) (mule2 loop: 5))
				(proc851_0 @local9 @local0 0 self)
			)
			(8
				(proc851_0 @local13 1 0 self)
			)
			(9
				(proc851_0 1 @local17 @local0 0 self)
			)
			(10
				(knightArm setCycle: End self)
			)
			(11
				(horseAndKnight delete: dispose:)
				(knightArm delete: dispose:)
				(knightHead delete: dispose:)
				(theKnight
					show:
					setCycle: Walk
					setMotion: PolyPath -50 285
				)
				(if (proc0_5 65)
					(mule1
						setLoop: 4
						setCel: 2
						setCycle: Walk
						signal: 26624
						setMotion: PolyPath -40 275
					)
				)
				(= ticks 100)
			)
			(12
				(if (proc0_5 65)
					(mule2
						setLoop: 4
						setCel: 2
						setCycle: Walk
						signal: 26624
						setMotion: PolyPath -40 260 self
					)
				else
					(self cue:)
				)
			)
			(13
				(if (and (not (proc0_5 5)) (proc0_5 62))
					(proc0_9 gEgo maidMarian self)
					(proc0_9 maidMarian gEgo)
				else
					(self cue:)
				)
			)
			(14
				(if (and (not (proc0_5 5)) (proc0_5 62))
					(proc851_0 @local21 1 22 self)
				else
					(self cue:)
				)
			)
			(15
				(if (proc0_5 65)
					(mule1 dispose: delete:)
					(mule2 dispose: delete:)
				)
				(if (and (not (proc0_5 5)) (proc0_5 62))
					(maidMarian dispose: delete:)
				)
				(theKnight dispose: delete:)
				(myJohn dispose: delete:)
				(myWill dispose: delete:)
				(myTuck dispose: delete:)
				(myAlan dispose: delete:)
				(myMuch dispose: delete:)
				(gEgo hide:)
				(global2 drawPic: 803 -32762)
				(= ticks 48)
			)
			(16 (global2 newRoom: 801))
		)
	)
)
