;;; Sierra Script 1.0 - (do not remove this comment)
(script# 421)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	sentence 0
)

(local
	[local0 9] = [59 0 2 4 21 32 20 23 31]
	[local9 15] = [1420 88 1 1 2 1 1 2 1 1 0 1420 96 1]
	[local24 4] = [1420 97 1]
	[local28 17] = [1420 98 1 1 2 1 1 1 1 1 2 1 2 1 3 1]
	[local45 15] = [1420 114 1 1 2 1 1 2 1 2 1 1 1 1]
	[local60 7] = [1420 126 1 2 1 2]
	[local67 11] = [1420 132 1 1 2 1 1 2 1 1]
)
(instance sentence of Rm
	(properties
		picture 420
		style $800a
	)
	
	(method (init)
		(proc958_0 129 420 480)
		(proc958_0 128 420 423 425 422 59 424)
		(proc958_0 132 10 8 11)
		(super init: &rest)
		(gIconBar disable: 0 1 2 3 4 5 6 7)
		(proc0_3)
		(scribe init:)
		(switch global151
			(10
				(global10 add: marianM)
				(global10 add: tuckie)
				(robinH init:)
				(kingRichie init:)
				(gRgnMusic number: 10 loop: -1 play: fade: 127 6 12 0)
				(gClient setScript: deliverJudgement1)
			)
			(20
				(robinH
					posn: 130 158
					priority: 10
					signal: (| (robinH signal?) $0010)
					init:
				)
				(kingRichie
					loop: 1
					cel: 0
					x: 205
					y: 116
					priority: 7
					signal: (| (kingRichie signal?) $0010)
					init:
				)
				(global10 add: marianM)
				(marianM
					x: 151
					y: 133
					priority: 9
					signal: (| (marianM signal?) $0010)
				)
				(prior x: 306 y: 132)
				(abbot x: 295 y: 134)
				(sheriff x: 286 y: 133)
				(fulkie x: 225 y: 112)
				(gRgnMusic number: 8 loop: -1 play: fade: 127 6 12 0)
				(gClient setScript: deliverJudgement2)
			)
			(30
				(robinH
					posn: 148 148
					priority: 9
					signal: (| (robinH signal?) $0010)
					init:
				)
				(kingRichie
					loop: 1
					cel: 0
					x: 205
					y: 116
					priority: 7
					signal: (| (kingRichie signal?) $0010)
					init:
				)
				(prior x: 145 y: 108)
				(abbot x: 137 y: 116)
				(sheriff x: 116 y: 109)
				(fulkie x: 246 y: 106)
				(gRgnMusic number: 8 loop: -1 play: fade: 127 6 12 0)
				(gClient setScript: deliverJudgement3)
			)
		)
		(global10
			add:
				guardD
				spect1
				spect2
				spect3
				spect4
				spect5
				spect6
				fulkie
				sheriff
				abbot
				prior
			eachElementDo: #init
			doit:
		)
	)
)

(instance robinH of Prop
	(properties
		x 162
		y 155
		view 422
		loop 2
		priority 10
		signal $0010
	)
)

(instance guardD of PicView
	(properties
		x 73
		y 122
		view 420
		loop 9
		priority 0
		signal $0010
	)
)

(instance spect1 of PicView
	(properties
		x 51
		y 32
		view 420
		loop 2
		priority 0
		signal $0010
	)
)

(instance spect2 of PicView
	(properties
		x 99
		y 19
		view 420
		loop 3
		priority 0
		signal $0010
	)
)

(instance spect3 of PicView
	(properties
		x 163
		y 9
		view 420
		loop 5
		priority 0
		signal $0010
	)
)

(instance spect4 of PicView
	(properties
		x 208
		y 11
		view 420
		loop 5
		cel 1
		priority 0
		signal $0010
	)
)

(instance spect5 of PicView
	(properties
		x 271
		y 18
		view 420
		loop 4
		priority 0
		signal $0010
	)
)

(instance spect6 of PicView
	(properties
		x 304
		y 14
		view 420
		loop 4
		cel 1
		priority 0
		signal $0010
	)
)

(instance marianM of PicView
	(properties
		x 135
		y 139
		view 423
		priority 9
		signal $0010
	)
)

(instance tuckie of PicView
	(properties
		x 149
		y 131
		view 423
		loop 1
		priority 9
		signal $0010
	)
)

(instance fulkie of PicView
	(properties
		x 196
		y 117
		view 423
		loop 10
		priority 0
		signal $0010
	)
)

(instance sheriff of PicView
	(properties
		x 273
		y 133
		view 425
		priority 9
		signal $0010
	)
)

(instance abbot of PicView
	(properties
		x 266
		y 134
		view 425
		cel 1
		priority 9
		signal $0010
	)
)

(instance prior of PicView
	(properties
		x 262
		y 130
		view 425
		loop 1
		cel 3
		priority 9
		signal $0010
	)
)

(instance scribe of Prop
	(properties
		x 268
		y 142
		view 420
		priority 9
		signal $0010
	)
)

(instance kingRichie of Prop
	(properties
		x 194
		y 148
		view 422
		loop 3
		priority 9
		signal $0010
	)
)

(instance abbotTuck of Prop
	(properties
		x 161
		y 176
		view 424
		loop 1
		priority 13
		signal $0010
	)
)

(instance robinNMarian of Prop
	(properties
		x 159
		y 200
		view 424
		priority 14
		signal $0010
	)
)

(instance guests of View
	(properties
		x 257
		y 189
		view 424
		loop 3
		priority 15
		signal $0010
	)
)

(instance guests2 of View
	(properties
		x 45
		y 181
		view 424
		loop 3
		cel 1
		priority 15
		signal $0010
	)
)

(instance bardsHead of Prop
	(properties
		x 132
		y 44
		view 800
		priority 12
		signal $0010
	)
)

(instance bardsHand of Prop
	(properties
		x 120
		y 57
		view 800
		loop 1
		priority 15
		signal $0010
	)
)

(instance bardsFingers of Prop
	(properties
		x 202
		y 51
		view 800
		loop 2
		priority 15
		signal $0010
	)
)

(instance deliverJudgement1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 180))
			(1
				(proc851_0 2 @local9 @local0 3 3 2 self)
			)
			(2 (= ticks 90))
			(3
				(robinH cycleSpeed: 18 setCycle: End self)
			)
			(4
				(kingRichie setCycle: CT 1 1 self)
			)
			(5 (= ticks 60))
			(6
				(kingRichie cycleSpeed: 18 setCycle: CT 6 1 self)
			)
			(7 (= ticks 60))
			(8
				(kingRichie setCycle: CT 1 -1 self)
			)
			(9 (= ticks 60))
			(10
				(kingRichie setCycle: Beg self)
			)
			(11
				(proc851_0 1 @local24 @local0 3 self)
			)
			(12 (= ticks 30))
			(13 (robinH setCycle: Beg self))
			(14
				(proc851_0 3 @local28 @local0 1 3 0 21 3 self)
			)
			(15 (= ticks 120))
			(16
				(self setScript: theWedding self)
			)
			(17 (self dispose:))
		)
	)
)

(instance theWedding of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(global10 eachElementDo: #dispose)
				(gNewCast eachElementDo: #dispose)
				(gClient drawPic: 803 -32762)
				(gRgnMusic number: 11 loop: 1 play: fade: 127 6 12 0)
				(= ticks 30)
			)
			(1
				(abbotTuck init:)
				(robinNMarian init:)
				(guests init:)
				(guests2 init:)
				(gClient drawPic: 480 -32761)
				(= ticks 30)
			)
			(2
				(abbotTuck cel: 0)
				(= ticks 24)
			)
			(3 (proc13_4 1420 112 self))
			(4
				(robinNMarian cycleSpeed: 18 setCycle: End self)
			)
			(5
				(abbotTuck cel: 2)
				(= ticks 24)
			)
			(6 (proc13_4 1420 113 self))
			(7
				(robinNMarian
					loop: 2
					cel: 0
					cycleSpeed: 6
					setCycle: CT 2 1 self
				)
			)
			(8
				(robinNMarian cycleSpeed: 12 setCycle: CT 5 1 self)
			)
			(9
				(robinNMarian cycleSpeed: 18 setCycle: End self)
			)
			(10 (= ticks 180))
			(11
				(gClient newRoom: 97)
				(self dispose:)
			)
		)
	)
)

(instance deliverJudgement2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 180))
			(1
				(kingRichie cycleSpeed: 12 setCycle: End self)
			)
			(2
				(proc851_0 2 @local45 @local0 1 3 2 self)
			)
			(3
				(proc851_0 2 @local60 2 2 @local0 3 self)
			)
			(4
				(global10 eachElementDo: #dispose)
				(gNewCast eachElementDo: #dispose)
				(gClient drawPic: 803 -32762)
				(= ticks 30)
			)
			(5
				(gClient drawPic: 800 -32761)
				(bardsHead init: setScript: sing)
				(bardsHand init: setScript: strum)
				(bardsFingers init: setScript: riff)
				(= ticks 30)
			)
			(6
				(proc13_4 1420 130 self 67 55 150)
			)
			(7
				(proc13_4 1420 131 self 67 55 150)
			)
			(8
				(gRgnMusic fade: 60 6 12 0)
				(= ticks 72)
			)
			(9
				(gClient newRoom: 97)
				(self dispose:)
			)
		)
	)
)

(instance deliverJudgement3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 180))
			(1
				(kingRichie cycleSpeed: 12 setCycle: End self)
			)
			(2
				(proc851_0 2 @local67 @local0 3 3 2 self)
			)
			(3
				(global10 eachElementDo: #dispose)
				(gNewCast eachElementDo: #dispose)
				(gClient drawPic: 803 -32762)
				(= ticks 30)
			)
			(4
				(gClient drawPic: 800 -32761)
				(bardsHead init: setScript: sing)
				(bardsHand init: setScript: strum)
				(bardsFingers init: setScript: riff)
				(= cycles 2)
			)
			(5
				(proc13_4 1420 140 self 67 55 150)
			)
			(6
				(proc13_4 1420 141 self 67 55 150)
			)
			(7
				(gRgnMusic fade: 60 6 12 0)
				(= ticks 72)
			)
			(8
				(gClient newRoom: 97)
				(self dispose:)
			)
		)
	)
)

(instance sing of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (client setCycle: End self))
			(1
				(= ticks (* 6 (Random 1 2)))
			)
			(2 (client setCycle: Beg self))
			(3
				(= ticks (* 6 (Random 1 2)))
			)
			(4 (client setCycle: End self))
			(5
				(= ticks (* 6 (Random 1 2)))
			)
			(6 (client setCycle: Beg self))
			(7
				(= ticks (* 6 (Random 1 2)))
			)
			(8 (client setCycle: End self))
			(9
				(= ticks (* 6 (Random 1 2)))
			)
			(10 (client setCycle: Beg self))
			(11
				(= ticks (* 6 (Random 1 2)))
			)
			(12
				(client cel: 1)
				(= ticks 6)
			)
			(13
				(client cel: 0)
				(= ticks (* 10 (Random 4 11)))
			)
			(14 (= state -1) (= ticks 6))
		)
	)
)

(instance strum of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client cel: 1)
				(= ticks 12)
			)
			(1
				(client cel: 0)
				(= ticks 12)
			)
			(2
				(client cel: 1)
				(= ticks 60)
			)
			(3
				(client cel: 0)
				(= ticks 36)
			)
			(4
				(client cel: 1)
				(= ticks 48)
			)
			(5
				(client cel: 0)
				(= ticks 30)
			)
			(6
				(client cel: 1)
				(= ticks 48)
			)
			(7
				(client cel: 0)
				(= ticks 12)
			)
			(8
				(client cel: 1)
				(= ticks 12)
			)
			(9
				(client cel: 0)
				(= ticks 12)
			)
			(10
				(client cel: 1)
				(= ticks 60)
			)
			(11
				(client cel: 0)
				(= ticks 48)
			)
			(12
				(client cel: 1)
				(= ticks 30)
			)
			(13
				(client cel: 0)
				(= ticks 42)
			)
			(14
				(client cel: 1)
				(= ticks 36)
			)
			(15
				(client cel: 0)
				(= ticks 6)
			)
			(16 (= ticks 6) (= state -1))
		)
	)
)

(instance riff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (client setCycle: End self))
			(1
				(client cel: 1)
				(= ticks 12)
			)
			(2
				(client cel: 2)
				(= ticks 18)
			)
			(3
				(client cel: 0)
				(= ticks 12)
			)
			(4 (client setCycle: End self))
			(5
				(client cel: 1)
				(= ticks 18)
			)
			(6
				(client cel: 0)
				(= ticks 18)
			)
			(7
				(client cel: 2)
				(= ticks 12)
			)
			(8 (client setCycle: Beg self))
			(9 (= ticks 24) (= state -1))
		)
	)
)
