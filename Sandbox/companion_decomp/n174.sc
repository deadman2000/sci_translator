;;; Sierra Script 1.0 - (do not remove this comment)
(script# 174)
(include sci.sh)
(use n000)
(use n013)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	johnswobat 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	local11
	local12
)
(instance johnswobat of Rm
	(properties
		style $0008
	)
	
	(method (init)
		(Load rsPIC 110)
		(proc958_0 128 5 10 80 111 114 115)
		(proc958_0 132 120 123)
		(robin init:)
		(archer init:)
		(archer3
			x: 540
			y: 540
			view: 115
			loop: 5
			cel: 5
			init:
			stopUpd:
		)
		(archer4
			x: 550
			y: 550
			view: 115
			loop: 5
			cel: 5
			init:
			stopUpd:
		)
		(archer2 x: 480 y: 480 loop: 5 cel: 4 init:)
		(knave cycleSpeed: 6 init:)
		(knave2 x: 460 y: 460 loop: 3 cel: 2 cycleSpeed: 12 init:)
		(knave3 x: 450 y: 450 loop: 1 cel: 4 cycleSpeed: 6 init:)
		(victim2 init:)
		(= local1 1)
		(= local2 1)
		(= local3 1)
		(archer setScript: kill)
		(archer2 setScript: kill2)
		(robin setScript: kill3)
		(knave setScript: shoot1)
		(knave2 setScript: shoot2)
		(knave3 setScript: shoot3)
		(victim2 setScript: shoot4)
		(= local4 32)
		(super init:)
		(gIconBar enable:)
		(gRgnMusic
			number: 120
			loop: 1
			init:
			play: musicScript
			flags: (& (gRgnMusic flags?) $fffe)
		)
		(global2 drawPic: 110 6)
		(corpse
			loop: 1
			cel: 6
			x: (Random 220 230)
			y: (Random 109 119)
		)
		(corpse2
			loop: 1
			cel: 6
			x: (Random 159 169)
			y: (Random 106 116)
		)
		(corpse3
			loop: 1
			cel: 6
			x: (Random 250 260)
			y: (Random 106 116)
		)
		(corpse4
			loop: 1
			cel: 6
			x: (Random 136 146)
			y: (Random 123 133)
		)
		(mule x: 210 y: 110)
		(mule2 x: 225 y: 100)
		(global10
			add: corpse corpse2 corpse3 corpse4 mule mule2 frieze1 frieze2
			eachElementDo: #init
			doit:
		)
		(robin x: 130 y: 189)
		(archer x: 78 y: 146)
		(archer2 x: (Random 85 95) y: (Random 165 175))
		(archer3 x: 248 y: 173)
		(archer4 x: 126 y: 151)
		(knave x: 125 y: 128)
		(knave2 x: 200 y: 100)
		(knave3 x: (Random 172 182) y: (Random 115 125))
		(outlaw2 x: 101 y: 171)
		(victim2 x: (Random 145 155) y: (Random 104 114))
		(gSFX
			number: 123
			loop: -1
			init:
			play:
			flags: (& (gSFX flags?) $fffe)
		)
		(global2 setScript: timer0)
		(proc0_6 65)
	)
)

(instance frieze1 of PicView
	(properties
		x 31
		y 189
		description 6269
		sightAngle 90
		lookStr 6288
		view 80
		priority 16
	)
)

(instance frieze2 of PicView
	(properties
		x 288
		y 189
		description 6269
		sightAngle 90
		lookStr 6360
		view 80
		cel 1
		priority 16
	)
)

(instance robin of Prop
	(properties
		x 500
		y 500
		view 5
		loop 3
		cel 4
		cycleSpeed 3
	)
)

(instance victim2 of Prop
	(properties
		x 510
		y 510
		view 114
		loop 1
		cycleSpeed 8
	)
)

(instance mule of PicView
	(properties
		x 520
		y 520
		view 115
		loop 7
	)
)

(instance mule2 of PicView
	(properties
		view 115
		loop 7
	)
)

(instance archer of Prop
	(properties)
)

(instance archer2 of Prop
	(properties)
)

(instance archer3 of Prop
	(properties)
)

(instance archer4 of Prop
	(properties)
)

(instance outlaw of Actor
	(properties
		x 101
		y 149
		sightAngle 90
		view 111
		priority 9
		signal $0010
		detailLevel 2
		illegalBits $0000
	)
)

(instance outlaw2 of Actor
	(properties
		sightAngle 90
		view 111
		priority 9
		signal $0010
		detailLevel 2
		illegalBits $0000
	)
)

(instance knave of Prop
	(properties)
)

(instance knave2 of Prop
	(properties)
)

(instance knave3 of Prop
	(properties)
)

(instance lancer of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		priority 9
		signal $0810
		detailLevel 2
		illegalBits $0000
	)
)

(instance lancer2 of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		priority 9
		signal $0810
		detailLevel 2
		illegalBits $0000
	)
)

(instance lancer3 of Actor
	(properties
		sightAngle 90
		view 111
		loop 1
		priority 9
		signal $0810
		detailLevel 2
		illegalBits $0000
	)
)

(instance corpse of PicView
	(properties)
)

(instance corpse2 of PicView
	(properties)
)

(instance corpse3 of PicView
	(properties)
)

(instance corpse4 of PicView
	(properties)
)

(instance timer0 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(lancer
					init:
					loop: 4
					priority: 6
					signal: (| (lancer signal?) $0810)
					x: 225
					y: 105
					ignoreActors: 1
					setCycle: Walk
					setMotion: MoveTo 280 90 self
				)
			)
			(1
				(lancer dispose:)
				(self dispose:)
			)
		)
	)
)

(instance timer0A of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(lancer2
					init:
					loop: 2
					x: 101
					y: 171
					moveSpeed: 4
					cycleSpeed: 4
					setCycle: Walk
					setMotion: MoveTo 263 126 self
					checkDetail:
				)
			)
			(1
				(lancer2 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(outlaw2
					init:
					moveSpeed: 4
					cycleSpeed: 4
					setCycle: Walk
					setMotion: MoveTo 263 126 self
					checkDetail:
				)
			)
			(1
				(outlaw2 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer1A of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(knave2 setScript: 0 view: 115 setCycle: End self)
			)
			(1
				(knave2 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(victim2 view: 115 cel: 0 setCycle: End self)
			)
			(1
				(victim2 setScript: 0 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(lancer3
					init:
					loop: 2
					x: 101
					y: 149
					moveSpeed: 4
					cycleSpeed: 4
					setCycle: Walk
					setMotion: MoveTo 251 162 self
					checkDetail:
				)
			)
			(1
				(lancer3 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer2A of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(outlaw
					init:
					moveSpeed: 4
					cycleSpeed: 4
					setCycle: Walk
					setMotion: MoveTo 251 162 self
					checkDetail:
				)
			)
			(1
				(outlaw dispose:)
				(knave3 view: 115 setScript: 0 setCycle: End self)
			)
			(2
				(knave3 stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer3A of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(cond 
					((== (= local5 (Random 1 2)) 2)
						(= local2 0)
						(archer2 view: 115 cel: 0 setCycle: End self)
					)
					((== local5 1) (= local1 0) (archer view: 115 cel: 0 setCycle: End self))
				)
			)
			(1
				(if (== local5 1)
					(archer stopUpd:)
				else
					(archer2 stopUpd:)
				)
				(self dispose:)
			)
		)
	)
)

(instance timer4 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(knave view: 115 cel: 0 setScript: 0 setCycle: End self)
			)
			(1
				(knave stopUpd:)
				(self dispose:)
			)
		)
	)
)

(instance timer5 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local3 0)
				(robin view: 10 cel: 0 setCycle: End self)
			)
			(1 (self dispose:))
		)
	)
)

(instance timer6 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local0 1)
				(robin setCycle: Beg self)
			)
			(1
				(gRgnMusic flags: (| (gRgnMusic flags?) $0001))
				(gSFX flags: (| (gRgnMusic flags?) $0001) stop:)
				(archer setScript: 0 setCycle: 0)
				(archer2 setScript: 0 setCycle: 0)
				(knave setScript: 0)
				(knave2 setScript: 0)
				(knave3 setScript: 0)
				(victim2 setScript: 0)
				(= ticks 24)
			)
			(2 (proc13_4 174 0 self 108))
			(3
				(global2 newRoom: 179)
				(self dispose:)
			)
		)
	)
)

(instance kill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if local1
					(archer
						cycleSpeed: 8
						cel: 0
						setCycle: End self
						checkDetail:
					)
				else
					(self dispose:)
				)
			)
			(1
				(= local9 (Random 4 8))
				(= state -1)
				(= ticks (* local9 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance kill2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if local2
					(archer2
						cycleSpeed: 8
						cel: 0
						setCycle: End self
						checkDetail:
					)
				else
					(self dispose:)
				)
			)
			(1
				(= local10 (Random 7 10))
				(= state -1)
				(= ticks (* local10 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance kill3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if local3
					(client cycleSpeed: 8 cel: 0 setCycle: End self)
				else
					(self dispose:)
				)
			)
			(1
				(= local11 (Random 5 9))
				(= state -1)
				(= ticks (* local11 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance shoot1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client
					cel: 0
					cycleSpeed: 8
					setCycle: End self
					checkDetail:
				)
			)
			(1
				(= local6 (Random 4 9))
				(= state -1)
				(= ticks (* local6 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance shoot2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client
					cel: 0
					cycleSpeed: 8
					setCycle: End self
					checkDetail:
				)
			)
			(1
				(= local7 (Random 4 9))
				(= state -1)
				(= ticks (* local7 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance shoot3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client
					cel: 0
					cycleSpeed: 8
					setCycle: End self
					checkDetail:
				)
			)
			(1
				(= local8 (Random 4 9))
				(= state -1)
				(= ticks (* local8 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance shoot4 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(client
					cel: 0
					cycleSpeed: 8
					setCycle: End self
					checkDetail:
				)
			)
			(1
				(= local5 (Random 4 9))
				(= state -1)
				(= ticks (* local5 10))
			)
			(2 (self dispose:))
		)
	)
)

(instance musicScript of Script
	(properties)
	
	(method (cue)
		CorruptFunction_CantDetermineCodeBounds
	)
)
