;;; Sierra Script 1.0 - (do not remove this comment)
(script# 801)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	troub 0
)

(local
	[local0 2]
)
(instance troub of Rm
	(properties
		style $800a
	)
	
	(method (init)
		(proc0_3)
		(proc958_0 129 800 830 835 840 845 850 803)
		(proc958_0 128 800 835 850 840)
		(proc958_0 132 2 3 4)
		(super init:)
		(gIconBar disable: 0 1 2 3 4 5 6 7)
		(proc0_3)
		(= global156 0)
		(= global151 0)
		(if (!= gHeading 422)
			(gClient drawPic: 800 -32758)
			(bardsHead init: setScript: sing)
			(bardsHand init: setScript: strum)
			(bardsFingers init: setScript: riff)
			(if (proc0_5 62) (= global156 (+ global156 2000)))
			(if (proc0_5 49)
				(if (proc0_5 151)
					(= global156 (+ global156 500))
				else
					(= global156 (- global156 500))
				)
			)
			(if (proc0_5 113)
				(if (proc0_5 152)
					(= global156 (+ global156 500))
				else
					(= global156 (- global156 500))
				)
			)
			(if (proc0_5 174)
				(= global156 (+ global156 500))
			else
				(= global156 (- global156 500))
			)
			(if (proc0_5 173)
				(= global156 (+ global156 500))
			else
				(= global156 (- global156 500))
			)
			(= global156 (+ global156 (* 30 (- global138 9))))
			(cond 
				(
					(and
						(u< global146 5000)
						(or
							(< global156 2500)
							(u< global146 1000)
							(< (+ global156 global146) 5000)
						)
					)
					(= global151 40)
				)
				(
					(or
						(< global156 3680)
						(and (u< global146 -14536) (proc0_5 65))
						(and (u< global146 15300) (not (proc0_5 65)))
					)
					(= global151 30)
				)
				((or (< global156 4250) (u< global146 -4536))
					(if (proc0_5 62)
						(= global151 20)
					else
						(= global151 30)
					)
				)
				(else (= global151 10))
			)
			(self setScript: bardsTheme)
		else
			(gClient drawPic: 840 -32758)
			(robinH init:)
			(soldier init:)
			(hangman init:)
			(sheriffsPate init:)
			(sheriffsKnuckles init:)
			(global10
				add: johnnieHangs tuckieHangs
				eachElementDo: #init
				doit:
			)
			(self setScript: dieScum)
			(sheriffsPate setScript: fret)
			(sheriffsKnuckles setScript: drum)
		)
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

(instance baddie1 of Prop
	(properties
		x 16
		y 88
		view 835
		priority 12
		signal $0010
	)
)

(instance baddie2 of Prop
	(properties
		x 242
		y 92
		view 835
		loop 1
		priority 12
		signal $0010
	)
)

(instance baddie3 of Prop
	(properties
		x 158
		y 45
		view 835
		loop 3
		priority 12
		signal $0010
	)
)

(instance baddie4 of Prop
	(properties
		x 236
		y 67
		view 835
		loop 4
		priority 12
		signal $0010
	)
)

(instance tuckie of Prop
	(properties
		x 200
		y 18
		view 835
		loop 2
		priority 12
		signal $0010
	)
)

(instance sheriffsHead of Prop
	(properties
		x 91
		y 57
		view 850
	)
)

(instance sheriffsHand of Prop
	(properties
		x 94
		y 62
		view 850
		loop 1
	)
)

(instance robinsHead of Prop
	(properties
		x 187
		y 51
		view 850
		loop 2
	)
)

(instance robinsRightHand of Prop
	(properties
		x 153
		y 64
		view 850
		loop 3
	)
)

(instance robinsLeftHand of Prop
	(properties
		x 208
		y 51
		view 850
		loop 4
	)
)

(instance kingsHead of Prop
	(properties
		x 258
		y 63
		view 850
		loop 5
	)
)

(instance soldier of Prop
	(properties
		x 155
		y 140
		view 840
		loop 1
		priority 10
		signal $0010
	)
)

(instance hangman of Prop
	(properties
		x 177
		y 84
		view 840
		loop 3
		signal $0010
	)
)

(instance sheriffsPate of Prop
	(properties
		x 64
		y 113
		view 840
		loop 2
		priority 7
		signal $0010
	)
)

(instance sheriffsKnuckles of Prop
	(properties
		x 57
		y 170
		view 840
		priority 13
		signal $0010
	)
)

(instance robinH of Actor
	(properties
		x 196
		y 48
		view 840
		loop 4
		priority 1
		signal $0010
	)
)

(instance johnnieHangs of PicView
	(properties
		x 204
		y 164
		view 840
		loop 6
		priority 12
		signal $0010
	)
)

(instance tuckieHangs of PicView
	(properties
		x 228
		y 158
		view 840
		loop 5
		priority 11
		signal $0010
	)
)

(instance swinger of View
	(properties
		x 150
		y 65
		view 840
		loop 7
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

(instance bardsTheme of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic number: 4 loop: -1 play: fade: 127 6 12 0)
				(= ticks 180)
			)
			(1
				(proc13_6 10)
				(proc13_4 1800 0 self 67 55 150 80 {Troubadour})
			)
			(2
				(proc13_4 1800 1 self 67 55 150 80 {Troubadour})
			)
			(3
				(proc13_4 1800 2 self 67 55 150 80 {Troubadour})
			)
			(4
				(if (proc0_5 62)
					(gClient setScript: itsNotOver)
				else
					(= ticks 6)
				)
			)
			(5
				(proc13_4 1800 3 self 67 55 150 80 {Troubadour})
			)
			(6
				(proc13_4 1800 4 self 67 55 150 80 {Troubadour})
			)
			(7
				(gClient setScript: itsNotOver)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(gClient setScript: itsNotOver)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance theLoveNest of Script
	(properties)
	
	(method (doit)
		(Palette 6 240 245 -1)
		(Palette 6 246 251 -1)
		(Palette 6 252 255 -1)
		(super doit: &rest)
	)
	
	(method (dispose)
		(DoSound 19 0)
		(rainSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(DoSound 19 20)
				(rainSound play:)
				(= ticks 30)
			)
			(1
				(gClient drawPic: 830 -32758)
				(= ticks 300)
			)
			(2
				(proc13_4 1800 3 self 67 55 150 80 {Troubadour})
			)
			(3
				(proc13_4 1800 4 self 67 55 150 80 {Troubadour})
			)
			(4
				(gRgnMusic fade: 48 6 12 0)
				(= ticks 180)
			)
			(5 (self dispose:))
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(itsNotOver start: 1)
			(gClient setScript: itsNotOver)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance theCapture of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic number: 6 loop: -1 play: fade: 127 6 12 0)
				(= ticks 30)
			)
			(1
				(gClient drawPic: 835 -32758)
				(baddie1 init: cel: 1)
				(baddie2 init: cel: 1)
				(baddie3 init: cel: 1)
				(baddie4 init: cel: 1)
				(tuckie init: cel: 1)
				(= ticks 60)
			)
			(2
				(proc13_4 1800 7 self 67 55 150 80 {Troubadour})
			)
			(3
				(baddie1 cel: 0)
				(baddie2 cel: 0)
				(baddie3 cel: 0)
				(baddie4 cel: 0)
				(tuckie cel: 0)
				(= ticks 12)
			)
			(4
				(proc13_4 1800 8 self 67 55 150 80 {Troubadour})
			)
			(5 (= ticks 180))
			(6 (self dispose:))
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(itsNotOver start: 2)
			(gClient setScript: itsNotOver)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance theGallows of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 30))
			(1
				(gClient drawPic: 840 -32758)
				(sheriffsPate init: setScript: fret)
				(sheriffsKnuckles init: setScript: drum)
				(soldier init:)
				(hangman init:)
				(robinH init:)
				(johnnieHangs init:)
				(tuckieHangs init:)
				(= ticks 60)
			)
			(2
				(soldier cel: 0)
				(= ticks 6)
			)
			(3
				(soldier cel: 1)
				(= ticks 12)
			)
			(4
				(soldier cel: 0)
				(= ticks 6)
			)
			(5
				(soldier cel: 1)
				(= ticks 12)
			)
			(6
				(proc13_4 1800 9 self 67 55 150 80 {Troubadour})
			)
			(7
				(proc13_4 1800 10 self 67 55 150 80 {Troubadour})
			)
			(8
				(soldier cel: 0)
				(= ticks 6)
			)
			(9
				(soldier cel: 1)
				(= ticks 12)
			)
			(10
				(soldier cel: 0)
				(= ticks 6)
			)
			(11
				(soldier cel: 1)
				(= ticks 12)
			)
			(12
				(proc13_4 1800 11 self 67 55 150 80 {Troubadour})
			)
			(13
				(gRgnMusic fade: 60 30 6 1)
				(= ticks 180)
			)
			(14 (self dispose:))
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(itsNotOver start: 3)
			(gClient setScript: itsNotOver)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance theKingRidesIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic number: 2 loop: -1 play: fade: 127 6 12 0)
				(= ticks 30)
			)
			(1
				(proc13_4 1800 12 self 67 55 150 80 {Troubadour})
			)
			(2
				(proc13_4 1800 13 self 67 55 150 80 {Troubadour})
			)
			(3
				(gRgnMusic fade: 60 30 6 1)
				(= ticks 180)
			)
			(4 (self dispose:))
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(itsNotOver start: 4)
			(gClient setScript: itsNotOver)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance theAccused of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic number: 3 loop: -1 play: fade: 127 6 12 0)
				(= ticks 30)
			)
			(1
				(gClient drawPic: 850 -32758)
				(sheriffsHead init:)
				(sheriffsHand init: cel: 1)
				(robinsHead init:)
				(robinsRightHand init:)
				(robinsLeftHand init:)
				(kingsHead init:)
				(= ticks 180)
			)
			(2
				(kingsHead cel: 0)
				(proc13_6 31)
				(proc13_4 1800 14 self 67 55 150 80 {King Richard})
			)
			(3
				(proc13_4 1800 15 self 67 55 150 80 {King Richard})
			)
			(4
				(sheriffsHand cel: 0)
				(sheriffsHead setScript: sheriffTalks)
				(proc13_6 17)
				(proc13_4 1800 16 self 67 55 150 80 {Sheriff})
			)
			(5
				(sheriffsHead setScript: 0)
				(sheriffsHand cel: 1)
				(= ticks 6)
			)
			(6
				(robinsHead cel: 1)
				(= ticks 18)
			)
			(7
				(robinsRightHand cel: 1)
				(kingsHead cel: 1)
				(= ticks 6)
			)
			(8
				(robinsLeftHand cel: 1)
				(= ticks 12)
			)
			(9
				(robinsRightHand cel: 0)
				(= ticks 12)
			)
			(10
				(robinsHead cel: 0)
				(= ticks 6)
			)
			(11
				(robinsLeftHand cel: 0)
				(= ticks 6)
			)
			(12
				(robinsHead cel: 1)
				(proc13_6 0)
				(proc13_4 1800 17 self 67 55 150 80 {Robin})
			)
			(13
				(sheriffsHead setCycle: End)
				(kingsHead cel: 0)
				(robinsHead cel: 0)
				(sheriffsHand cel: 0)
				(proc13_6 17)
				(proc13_4 1800 18 self 67 55 150 80 {Sheriff})
			)
			(14
				(sheriffsHand cel: 1)
				(sheriffsHead cel: 0)
				(proc13_6 31)
				(proc13_4 1800 19 self 67 55 150 80 {King Richard})
			)
			(15
				(sheriffsHead cel: 4)
				(robinsHead cel: 1)
				(kingsHead cel: 1)
				(proc13_6 0)
				(proc13_4 1800 20 self 67 55 150 80 {Robin})
			)
			(16
				(sheriffsHead cel: 0)
				(proc13_6 31)
				(proc13_4 1800 21 self 67 55 150 80 {King Richard})
			)
			(17
				(sheriffsHead setScript: sheriffTalks)
				(sheriffsHand cel: 0)
				(kingsHead cel: 0)
				(robinsHead cel: 0)
				(proc13_6 17)
				(proc13_4 1800 22 self 67 55 150 80 {Sheriff})
			)
			(18
				(sheriffsHead setScript: 0 cel: 0)
				(sheriffsHand cel: 1)
				(robinsHead cel: 1)
				(proc13_6 31)
				(proc13_4 1800 23 self 67 55 150 80 {King Richard})
			)
			(19
				(gRgnMusic fade: 60 30 6 1)
				(= ticks 180)
			)
			(20 (self dispose:))
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(gRgnMusic fade: 60 6 30 0)
			(gClient newRoom: 420)
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance sheriffTalks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client setCycle: End)
				(= ticks (* 10 (Random 4 11)))
			)
			(1
				(client setCycle: Beg)
				(= ticks (* 10 (Random 4 11)))
			)
			(2 (= state -1) (= ticks 6))
		)
	)
)

(instance itsNotOver of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 62)
					(gNewCast eachElementDo: #dispose)
					(gClient drawPic: 803 -32762)
					(self setScript: theLoveNest self)
				else
					(= ticks 1)
				)
			)
			(1
				(gRgnMusic fade: 60 6 12 0)
				(if (not (proc0_5 62))
					(gNewCast eachElementDo: #dispose)
				)
				(gClient drawPic: 803 -32762)
				(self setScript: theCapture self)
			)
			(2
				(gNewCast eachElementDo: #dispose)
				(gClient drawPic: 803 -32762)
				(self setScript: theGallows self)
			)
			(3
				(gRgnMusic fade: 60 6 12 0)
				(gNewCast eachElementDo: #dispose)
				(gClient drawPic: 845 -32758)
				(self setScript: theKingRidesIn self)
			)
			(4
				(gRgnMusic fade: 48 6 18 0)
				(gClient drawPic: 803 -32762)
				(self setScript: theAccused self)
			)
			(5
				(gRgnMusic fade: 60 6 12 0)
				(= ticks 72)
			)
			(6
				(gClient newRoom: 420)
				(self dispose:)
			)
		)
	)
)

(instance rainSound of Sound
	(properties
		flags $0001
		number 142
		loop -1
	)
)

(instance dieScum of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 120))
			(1
				(soldier cel: 0)
				(= ticks 6)
			)
			(2
				(soldier cel: 1)
				(= ticks 12)
			)
			(3
				(soldier cel: 0)
				(= ticks 6)
			)
			(4
				(soldier cel: 1)
				(= ticks 12)
			)
			(5
				(robinH setScript: hang)
				(= ticks 120)
			)
			(6
				(global10 eachElementDo: #dispose)
				(gNewCast eachElementDo: #dispose)
				(gClient drawPic: 803 -32762)
				(swinger init:)
				(creakSound number: 16 play:)
				(= ticks 300)
			)
			(7
				(swinger dispose:)
				(gRgnMusic number: 14 loop: -1 play: fade: 127 6 12 0)
				(= ticks 30)
			)
			(8
				(gClient drawPic: 800 -32758)
				(bardsHead init: setScript: sing)
				(bardsHand init: setScript: strum)
				(bardsFingers init: setScript: riff)
				(gClient setScript: bardsTheme2)
				(= cycles 2)
			)
			(9 (self dispose:))
		)
	)
)

(instance hang of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(hangman setCycle: End)
				(robinH cycleSpeed: 12 setCycle: End self)
			)
			(1 (creakSound play: self))
			(2 (= ticks 6))
			(3
				(robinH cel: 3)
				(= ticks 36)
			)
			(4
				(robinH cel: 4)
				(= ticks 24)
			)
			(5
				(robinH cel: 5)
				(= ticks 36)
			)
			(6
				(robinH cel: 4)
				(= ticks 24)
			)
			(7 (= state 3) (= ticks 6))
			(8
				(creakSound number: 18 play: self)
			)
		)
	)
)

(instance bardsTheme2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 60))
			(1
				(proc13_4 1800 24 self 67 55 150)
			)
			(2
				(proc13_4 1800 25 self 67 55 150)
			)
			(3
				(gRgnMusic fade: 60 6 12 0)
				(= ticks 72)
			)
			(4
				(gClient newRoom: 97)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance drum of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (client cel: 0) (= ticks 6))
			(1
				(client cel: 1)
				(= ticks 60)
			)
			(2
				(client cel: 0)
				(= ticks 30)
			)
			(3
				(client cel: 1)
				(= ticks 180)
			)
			(4
				(client cel: 0)
				(= ticks 90)
			)
			(5
				(client cel: 0)
				(= ticks 30)
			)
			(6 (= state -1) (= ticks 6))
		)
	)
)

(instance fret of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 24))
			(1 (client cel: 0) (= ticks 6))
			(2
				(client cel: 1)
				(= ticks 60)
			)
			(3
				(client cel: 0)
				(= ticks 30)
			)
			(4 (= ticks 30))
			(5
				(client cel: 1)
				(= ticks 180)
			)
			(6
				(client cel: 0)
				(= ticks 90)
			)
			(7
				(client cel: 0)
				(= ticks 30)
			)
			(8 (= state -1) (= ticks 6))
		)
	)
)

(instance creakSound of Sound
	(properties
		flags $0001
		number 17
	)
)
