;;; Sierra Script 1.0 - (do not remove this comment)
(script# 95)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	open 0
)

(local
	newKnave
)
(instance open of Rm
	(properties
		picture 800
		style $0008
	)
	
	(method (init)
		(proc0_3)
		(proc958_0 129 800 810 820 825)
		(proc958_0 128 800 810 820 825 14 153 156 159 162 165)
		(proc958_0 132 101 102 103 104)
		(bardsHead init: setScript: sing)
		(bardsHand init: setScript: strum)
		(bardsFingers init: setScript: riff)
		(bardsToes init: setScript: tap)
		(super init:)
		(global1 setCursor: 5 1)
		(self setScript: bardsTheme)
	)
	
	(method (dispose)
		(gRgnMusic flags: (| (gRgnMusic flags?) $0001))
		(proc13_6 0)
		(super dispose: &rest)
	)
)

(class ZScript of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
	)
	
	(method (init param1 param2 param3)
		(gMH add: self)
		(gKH add: self)
		(super init: param1 param2 param3 &rest)
	)
	
	(method (dispose &tmp temp0)
		(gMH delete: self)
		(gKH delete: self)
		(super dispose: &rest)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(global2 setScript: lastScript)
		else
			(super cue: &rest)
		)
	)
	
	(method (handleEvent pEvent)
		(if (pEvent claimed?) (return))
		(if
			(or
				(and
					(& (pEvent modifiers?) emSHIFT)
					(& (pEvent type?) evMOUSEBUTTON)
				)
				(and
					(& (pEvent type?) evKEYBOARD)
					(== (pEvent message?) KEY_ESCAPE)
				)
			)
			(global2 setScript: lastScript)
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

(instance bardsToes of Prop
	(properties
		x 230
		y 176
		view 800
		loop 3
	)
)

(instance richie of Actor
	(properties
		x 44
		y 154
		view 810
		signal $4010
	)
)

(instance mule of Actor
	(properties
		x 2
		y 154
		view 810
		loop 1
		signal $4810
	)
)

(instance knave of Actor
	(properties
		x 290
		y 158
		view 810
		loop 5
		signal $4800
	)
)

(instance kingsHead of Prop
	(properties
		x 196
		y 104
		view 820
	)
)

(instance leftHand of Prop
	(properties
		x 155
		y 42
		view 820
		loop 1
	)
)

(instance rightHand of Prop
	(properties
		x 238
		y 100
		view 820
		loop 2
	)
)

(instance leoHead of Prop
	(properties
		x 71
		y 32
		view 825
	)
)

(instance leoHand of Prop
	(properties
		x 53
		y 23
		view 825
		loop 1
		priority 15
	)
)

(instance richieHand of Prop
	(properties
		x 271
		y 139
		view 825
		loop 2
	)
)

(instance guardHead of Prop
	(properties
		x 216
		y 64
		view 825
		loop 3
	)
)

(instance johnnie of View
	(properties
		x 240
		y 67
		view 153
		loop 1
	)
)

(instance tuckie of View
	(properties
		x 32
		y 116
		view 156
		loop 1
	)
)

(instance alanD of View
	(properties
		x 84
		y 148
		view 159
		loop 1
	)
)

(instance willie of View
	(properties
		x 287
		y 107
		view 162
		loop 1
	)
)

(instance muchie of View
	(properties
		x 244
		y 148
		view 165
		loop 1
	)
)

(instance robbie of View
	(properties
		x 84
		y 67
		view 14
	)
)

(instance frameRobin of View
	(properties
		x 82
		y 68
		view 14
		cel 1
	)
)

(instance frameTuck of View
	(properties
		x 30
		y 117
		view 14
		cel 1
	)
)

(instance frameAlan of View
	(properties
		x 82
		y 149
		view 14
		cel 1
	)
)

(instance frameJohn of View
	(properties
		x 238
		y 68
		view 14
		cel 1
	)
)

(instance frameWill of View
	(properties
		x 285
		y 108
		view 14
		cel 1
	)
)

(instance frameMuch of View
	(properties
		x 242
		y 149
		view 14
		cel 1
	)
)

(instance bardsTheme of ZScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic fade: 60 30 16 1)
				(= ticks 120)
			)
			(1
				(gRgnMusic
					number: 101
					loop: 1
					init:
					play: self
					fade: 127 60 8 0
					flags: (& (gRgnMusic flags?) $fffe)
				)
				(proc13_6 10)
				(= ticks 6)
			)
			(2
				(proc13_4 95 0 108 67 50 150 80 {Troubadour})
			)
			(3
				(proc13_4 95 1 108 67 50 150)
			)
			(4
				(proc13_4 95 2 108 67 50 150)
			)
			(5
				(proc13_4 95 3 108 67 50 150)
			)
			(6
				(if global25 (global25 dispose:))
				(gRgnMusic fade: 60 12 8 0)
				(= ticks 6)
			)
			(7
				(global2 setScript: nightRider)
				(self dispose:)
			)
		)
	)
)

(instance nightRider of ZScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(global5 eachElementDo: #dispose)
				(global2 drawPic: 810 10)
				(= newKnave (knave new:))
				(newKnave
					x: 18
					y: 151
					loop: 6
					signal: (| (newKnave signal?) $0800)
					init:
				)
				(knave init:)
				(richie init:)
				(mule init:)
				(= ticks 12)
			)
			(1
				(gRgnMusic
					number: 102
					loop: 1
					init:
					play: self
					hold: 10
					fade: 127 60 8 0
					flags: (& (gRgnMusic flags?) $fffe)
				)
				(= ticks 6)
			)
			(2
				(proc13_4 95 4 108 67 50 150 80 {Troubadour})
			)
			(3
				(proc13_4 95 5 108 67 50 150)
			)
			(4
				(proc13_4 95 6 108 67 50 150)
			)
			(5
				(proc13_4 95 7 108 67 50 150)
			)
			(6
				(if global25 (global25 dispose:))
				(knave setCycle: Fwd setMotion: MoveTo 165 156)
				(mule setScript: trot)
				(newKnave setCycle: Fwd setMotion: MoveTo 138 154)
				(self setScript: gallop self)
			)
			(7
				(knave setCycle: 0 dispose:)
				(newKnave setCycle: 0 dispose:)
				(richie
					loop: 2
					cel: 0
					posn: 148 160
					cycleSpeed: 12
					setCycle: CT 5 1 self
				)
			)
			(8
				(richie setCycle: CT 3 -1 self)
			)
			(9 (richie setCycle: End self))
			(10 (= ticks 120))
			(11
				(global5 eachElementDo: #dispose)
				(global2 drawPic: 820 10)
				(kingsHead init: setScript: sing)
				(leftHand init: setScript: wriggle1)
				(rightHand init: setScript: wriggle2)
				(= ticks 120)
			)
			(12
				(gRgnMusic release:)
				(proc13_4 95 8 108 67 50 150 80 {Troubadour})
			)
			(13)
			(14
				(proc13_4 95 9 108 67 50 150)
			)
			(15
				(if global25 (global25 dispose:))
				(gRgnMusic fade: 60 12 8 0)
				(global2 setScript: grovelYouWorm)
				(self dispose:)
			)
		)
	)
)

(instance trot of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(mule setCycle: Fwd setMotion: MoveTo 75 132 self)
			)
			(1
				(mule
					priority: 9
					signal: (| (mule signal?) $0010)
					setMotion: MoveTo 134 220 self
				)
			)
			(2
				(mule dispose:)
				(self dispose:)
			)
		)
	)
)

(instance gallop of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(richie setCycle: Fwd setMotion: MoveTo 120 127 self)
			)
			(1
				(richie
					priority: 9
					signal: (| (richie signal?) $0010)
					setMotion: MoveTo 149 154 self
				)
			)
			(2
				(richie setCycle: 0)
				(= ticks 6)
			)
			(3
				(= register 1)
				(self dispose:)
			)
		)
	)
)

(instance grovelYouWorm of ZScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(global5 eachElementDo: #dispose)
				(global2 drawPic: 825 10)
				(leoHead init: setScript: yodel)
				(leoHand init: setScript: point)
				(richieHand init: setScript: wriggle3)
				(guardHead init:)
				(= ticks 30)
			)
			(1
				(guardHead cel: 1)
				(gRgnMusic
					number: 103
					loop: 1
					init:
					play: self
					fade: 127 60 8 0
					flags: (& (gRgnMusic flags?) $fffe)
				)
				(= ticks 6)
			)
			(2
				(proc13_4 95 10 108 67 50 150 80 {Troubadour})
			)
			(3
				(proc13_4 95 11 108 67 50 150)
			)
			(4
				(proc13_4 95 12 108 67 50 150)
			)
			(5
				(proc13_4 95 13 108 67 50 150)
			)
			(6
				(guardHead cel: 0)
				(leoHead setScript: 0)
				(proc13_4 95 14 108 67 50 150)
			)
			(7
				(proc13_4 95 15 108 67 50 150)
			)
			(8
				(if global25 (global25 dispose:))
				(global2 setScript: merrieMen)
				(self dispose:)
			)
		)
	)
)

(instance merrieMen of ZScript
	(properties)
	
	(method (init)
		(proc958_0 0 810 820 825)
		(super init: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(global5 eachElementDo: #dispose)
				(global2 drawPic: 800 10)
				(bardsHead init: setScript: sing)
				(bardsHand init: setScript: strum)
				(bardsFingers init: setScript: riff)
				(bardsToes init: setScript: tap)
				(= ticks 60)
			)
			(1
				(gRgnMusic
					number: 104
					loop: 1
					init:
					play: self
					fade: 127 60 8 0
					flags: (& (gRgnMusic flags?) $fffe)
				)
				(= ticks 6)
			)
			(2
				(proc13_4 95 16 108 67 50 150)
			)
			(3
				(proc13_4 95 17 108 67 50 150)
			)
			(4
				(proc13_4 95 18 108 67 50 150)
			)
			(5
				(proc13_4 95 19 108 67 50 150)
			)
			(6
				(proc13_4 95 20 108 67 50 150)
			)
			(7
				(proc13_4 95 21 108 67 50 150)
			)
			(8
				(if global25 (global25 dispose:))
				(proc13_4 95 22 108 67 50 155)
				(johnnie init:)
				(frameJohn init:)
			)
			(9
				(alanD init: addToPic:)
				(frameAlan init: addToPic:)
				(proc13_4 95 23 108 67 50 155)
			)
			(10
				(muchie init: addToPic:)
				(frameMuch init: addToPic:)
				(proc13_4 95 24 108 67 50 155)
			)
			(11
				(willie init: addToPic:)
				(frameWill init: addToPic:)
				(proc13_4 95 25 108 67 50 155)
			)
			(12
				(tuckie init: addToPic:)
				(frameTuck init: addToPic:)
				(proc13_4 95 26 108 67 50 155)
			)
			(13
				(robbie init: addToPic:)
				(frameRobin init: addToPic:)
				(proc13_4 95 27 108 67 50 155)
			)
			(14
				(gRgnMusic fade: 60 30 3 1)
				(= ticks 60)
			)
			(15
				(if global25 (global25 dispose:))
				(global2 newRoom: 140)
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
			(1 (= ticks (Random 120 240)))
			(2 (client setCycle: Beg self))
			(3 (= ticks (Random 120 240)))
			(4 (client cel: 1) (= ticks 6))
			(5
				(client cel: 0)
				(= ticks (* 10 (Random 4 11)))
			)
			(6 (= state -1) (= ticks 6))
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

(instance tap of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client cel: 2)
				(= ticks 48)
			)
			(1 (client cel: 1) (= ticks 6))
			(2
				(client cel: 2)
				(= ticks 48)
			)
			(3 (client cel: 1) (= ticks 6))
			(4
				(client cel: 2)
				(= ticks 18)
			)
			(5
				(client cel: 1)
				(= ticks 12)
			)
			(6
				(client cel: 2)
				(= ticks 18)
			)
			(7
				(client cel: 1)
				(= ticks 12)
			)
			(8
				(client cel: 2)
				(= ticks 48)
			)
			(9 (client cel: 1) (= ticks 6))
			(10 (= state -1) (= ticks 6))
		)
	)
)

(instance wriggle1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 216))
			(1
				(client cel: 0)
				(= ticks 12)
			)
			(2
				(client cel: 1)
				(= ticks 30)
			)
			(3 (= ticks 6) (= state -1))
		)
	)
)

(instance wriggle2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 216))
			(1
				(client cel: 0)
				(= ticks 12)
			)
			(2
				(client cel: 1)
				(= ticks 30)
			)
			(3 (= ticks 6) (= state -1))
		)
	)
)

(instance wriggle3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 282))
			(1
				(client cel: 0)
				(= ticks 12)
			)
			(2
				(client cel: 1)
				(= ticks 30)
			)
			(3 (= ticks 6) (= state -1))
		)
	)
)

(instance yodel of Script
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

(instance point of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client setCycle: End)
				(= ticks 270)
			)
			(1
				(client setCycle: Beg)
				(= ticks 390)
			)
			(2 (= ticks 24) (= state -1))
		)
	)
)

(instance lastScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 6))
			(1
				(global2 newRoom: 140)
				(self dispose:)
			)
		)
	)
)
