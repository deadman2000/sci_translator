;;; Sierra Script 1.0 - (do not remove this comment)
(script# 24)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n958)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	yeo 0
	yeoScript 1
)

(local
	[local0 9] = [133 0 2 4 24 37 20 24 16]
	[local9 9] = [133 3 2 4 24 37 20 24 16]
	newProp
	newView
	local20
	local21 =  10
	local22
	[local23 6] = [1024 0 2 1 2]
	[local29 5] = [1024 3 1 2]
	[local34 5] = [1024 20 1 2]
	[local39 6] = [1024 5 2 1 2]
	[local45 10] = [1024 12 1 2 1 2 1 2 2]
	[local55 5] = [1024 10 1 1]
	[local60 4] = [1024 19 1]
	[local64 4] = [1024 22 1]
	[local68 6] = [1024 23 2 1 2]
	[local74 17] = [1024 26 1 2 1 2 1 2 1 2 1 2 1 2 2 2]
	[local91 6] = [1024 40 1 2 2]
	[local97 15] = [1024 43 1 2 1 1 1 2 1 2 1 2 1 1]
	[local112 12] = [1024 55 1 2 1 2 1 2 1 1 2]
	[local124 10] = [1024 64 3 1 1 1 2 1 2]
	[local134 7] = [1024 71 1 2 1 2]
	[local141 6] = [1024 75 2 1 2]
	[local147 4] = [1024 78 1]
	[local151 4] = [1024 79 1]
	[local155 7] = [1024 80 2 2 1 2]
	[local162 5] = [1024 84 2 1]
	[local167 4] = [1024 86 1]
)
(instance yeo of Actor
	(properties
		x 285
		y -5
		view 132
		loop 1
		signal $2800
	)
	
	(method (init)
		(gSFX number: 125 loop: -1 play:)
		(gIconBar disable: 5)
		(super init:)
	)
	
	(method (doit)
		(cond 
			(
			(and (proc0_5 110) (not (-- local21)) (not local22))
				(= local22 1)
				(proc0_7 110)
				(proc851_0 @local39 3 @local0 0)
			)
			(
			(and (not local20) (gEgo mover?) (not (gEgo script?)))
				(= local20 1)
				(if (<= (Wat weMeetAgain?) 1)
					(gEgo setScript: dropIt)
				else
					(gEgo setScript: noMoreChances)
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX fade: 0 30 8 1)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(if (Wat whichChar?)
			(Wat weMeetAgain: (+ (Wat weMeetAgain?) 1))
		)
		(super dispose:)
		(self delete:)
		(gIconBar enable: 5)
		(DisposeScript 24)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1024 9 1))
			(5
				(if (Wat charFirstTalk?)
					(proc851_0 1 @local55 @local0 3)
				else
					(proc851_0 @local45 3 @local0)
					(Wat charFirstTalk: 1)
				)
			)
			(10
				(global2 setScript: twoBirds)
			)
			(4
				(switch param2
					(1
						(proc851_0 1 @local60 @local0 3)
					)
					(0 (gEgo setScript: buyClothes))
					(14
						(proc851_0 @local23 3 @local0)
					)
					(2
						(proc851_0 @local23 3 @local0)
					)
					(10
						(proc851_0 @local29 3 @local0)
					)
					(18
						(proc851_0 @local29 3 @local0)
					)
					(16
						(proc851_0 1 @local64 @local0 3)
					)
					(17
						(proc851_0 1 @local64 @local0 3)
					)
					(4
						(proc851_0 @local68 3 @local0)
					)
					(12
						(proc851_0 @local34 1 @local0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(3
				(gEgo setMotion: MoveTo (yeo x?) (yeo y?))
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance yeoScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo actions: egoActions)
				(Wat setScript: 0)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(if (not (global5 contains: yeo)) (yeo init:))
					(yeo
						posn: 235 50
						setCycle: Walk
						setMotion: MoveTo 205 70 self
					)
				)
			)
			(1
				(yeo
					ignoreActors: 1
					setLoop: 0
					setCel: 0
					setCycle: End self
				)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 202 52 243 52 243 65 202 65
							yourself:
						)
				)
			)
			(2
				(proc851_0 @local74 3 @local0 self)
				24
				0
				24
				1
			)
			(3
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance repeatEncounter of TScript
	(properties)
	
	(method (dispose)
		(proc0_4)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(gEgo actions: egoActions)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 202 52 243 52 243 65 202 65
							yourself:
						)
				)
				(= ticks 30)
			)
			(2
				(proc851_0 @local91 3 @local0)
			)
			(3 (self dispose:))
		)
	)
)

(instance buyClothes of Script
	(properties)
	
	(method (dispose)
		(proc0_4)
		(proc0_6 57)
		(proc125_2)
		(proc806_6 0)
		((ScriptID 20) dispose:)
		(super dispose:)
		(yeo dispose:)
	)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local97 3 @local0)
				(yeo stopUpd:)
				(self setScript: (ScriptID 5 1) self)
			)
			(1 (= ticks 12))
			(2
				(gEgo stopUpd:)
				(self setScript: (ScriptID 125 1) self)
			)
			(3
				((ScriptID 23) setMotion: PChase gEgo 30 self)
				(proc0_9 gEgo (ScriptID 23))
			)
			(4
				(proc851_0 @local112 3 15 self)
			)
			(5
				(gSFX number: 128 loop: -1 play:)
				(= cycles 2)
			)
			(6
				(global2 drawPic: 803 -32761)
				(yeo setLoop: 3 posn: 219 64)
				(= global126 4)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(proc0_2)
				(gEgo loop: 4 cel: 0 posn: 188 55)
				(gEgoHead posn: 188 55)
				(global5 eachElementDo: #hide)
				((ScriptID 23) dispose:)
				((ScriptID 19) dispose:)
				(= ticks 60)
			)
			(7
				(global5 eachElementDo: #show)
				((ScriptID 20) loop: 1 posn: 249 74)
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(= ticks 12)
			)
			(8
				(proc851_0 3 @local124 6 2 @local9 3 14 3 self)
			)
			(9
				(proc806_1 100)
				(yeo
					setLoop: 2
					ignoreHorizon: 1
					setCycle: Walk
					setMotion: MoveTo 285 -5 self
				)
				((ScriptID 20)
					setMotion: MoveTo (yeo x?) (yeo y?) self
				)
			)
			(10
				((ScriptID 20) setMotion: MoveTo 285 -5 self)
			)
			(11)
			(12 (self dispose:))
		)
	)
)

(instance twoBirds of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc958_0 128 4 5 792)
				(proc0_3)
				(proc851_0 @local134 2 @local0)
				(= ticks 30)
			)
			(1
				(gEgo
					view: 4
					setCel: 0
					cycleSpeed: 3
					setCycle: CT 2 1 self
				)
			)
			(2
				(gEgo setCycle: End self)
				(yeo
					setLoop: 4
					setCel: 0
					cycleSpeed: 3
					setCycle: End self
				)
			)
			(3
				(shootSound play:)
				(gEgo view: 5 setCel: 0 setCycle: End)
			)
			(4 (= ticks 30))
			(5
				(gEgo
					view: 792
					setLoop: 0
					setCel: 0
					cycleSpeed: 12
					setCycle: CT 6 1 self
				)
				(shootSound number: 907 loop: 1 play:)
				(yeo setLoop: 5 setCel: 0 cycleSpeed: 12 setCycle: End)
			)
			(6
				(gSFX number: 127 loop: -1 play:)
				(gEgo setCel: 7)
				((View new:)
					view: 792
					loop: 4
					cel: 2
					posn: (- (gEgo x?) 33) (+ (gEgo y?) 6)
					init:
				)
				(= ticks 60)
			)
			(7
				(= global145 2)
				(shootSound dispose:)
				(global2 newRoom: 170)
			)
		)
	)
)

(instance egoSkewered of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: (ScriptID 5 1) self)
			)
			(1 (= ticks 30))
			(2
				(proc851_0 @local141 3 @local0 self)
			)
			(3
				(yeo
					setLoop: 4
					setCel: 0
					cycleSpeed: 3
					setCycle: End self
				)
			)
			(4
				(shootSound number: 907 loop: 1 play:)
				(global1 setSpeed: global141)
				(gEgo
					view: 792
					setLoop: 0
					setCel: 0
					cycleSpeed: 12
					setCycle: CT 6 1 self
				)
				(= ticks 30)
			)
			(5
				(yeo cycleSpeed: 6 setCycle: Beg)
			)
			(6
				(gEgo setCel: 7)
				((View new:)
					view: 792
					loop: 4
					cel: 2
					posn: (- (gEgo x?) 33) (+ (gEgo y?) 6)
					init:
				)
				(= ticks 30)
			)
			(7
				(gSFX number: 127 loop: -1 play:)
				(proc851_0 1 @local147 @local0 3 self)
			)
			(8
				(= global145 1)
				(shootSound dispose:)
				(global2 newRoom: 170)
			)
		)
	)
)

(instance noMoreChances of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 20))
			(1
				(yeo
					setLoop: 4
					setCel: 0
					cycleSpeed: 3
					setCycle: End self
				)
				(gEgo setMotion: 0)
				(proc0_9 gEgo yeo)
			)
			(2
				(shootSound number: 907 loop: 1 play:)
				(yeo cel: 4)
				(gEgo
					view: 792
					setLoop: 0
					setCel: 0
					cycleSpeed: 12
					setCycle: End self
				)
				(= ticks 48)
			)
			(3
				(yeo cycleSpeed: 12 setCycle: Beg)
			)
			(4 (= ticks 30))
			(5
				(proc851_0 1 @local151 @local0 3 self)
			)
			(6
				(= global145 1)
				(shootSound dispose:)
				(global2 newRoom: 170)
			)
		)
	)
)

(instance dropIt of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(yeo dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(global1 setSpeed: global141)
				(= ticks 30)
			)
			(1
				(gEgo setCycle: 0 setMotion: 0)
				(yeo
					setLoop: 4
					setCel: 0
					cycleSpeed: 3
					setCycle: CT 5 1 self
				)
			)
			(2
				(shootSound number: 900 loop: -1 play:)
				(proc851_0 @local155 1 @local0)
				(= ticks 30)
			)
			(3 (gEgo setHeading: 45 self))
			(4 (= ticks 60))
			(5
				(gEgo
					view: 15
					posn: (+ (gEgo x?) 5) (+ (gEgo y?) 5)
					setLoop: 2
					setCel: 0
					cycleSpeed: 12
					setCycle: End self
				)
				((= newProp (Prop new:))
					view: 15
					ignoreActors: 1
					posn: (gEgo x?) (gEgo y?)
					loop: 6
					cel: 0
					cycleSpeed: 12
					init:
					setCycle: End
				)
			)
			(6 (gEgo setCycle: Beg self))
			(7
				(gEgo
					posn: (- (gEgo x?) 9) (- (gEgo y?) 3)
					setLoop: 3
					setCycle: CT 5 1 self
				)
			)
			(8
				(proc0_2 2 702 703)
				(proc0_9 gEgo yeo self)
				((= newView (View new:))
					view: 15
					ignoreActors: 1
					posn: (+ (gEgo x?) 6) (+ (gEgo y?) 2)
					loop: 4
					cel: 0
					init:
				)
			)
			(9 (= ticks 12))
			(10
				(proc851_0 @local162 1 @local0)
				(= ticks 30)
			)
			(11
				(global1 setSpeed: global157)
				(gEgo
					setMotion: PolyPath (if (< (gEgo x?) 160) 10 else 305) (gEgo y?) self
				)
			)
			(12 (proc0_9 gEgo yeo self))
			(13 (= ticks 12))
			(14
				(proc851_0 @local167 1)
				(newView setPri: 0)
				(newProp setPri: 0)
				(yeo cycleSpeed: 6 setCycle: Beg self)
			)
			(15
				(shootSound stop: dispose:)
				(yeo
					setLoop: 1
					cycleSpeed: global157
					moveSpeed: global157
					setCycle: Walk
					setMotion: MoveTo -10 235 self
				)
			)
			(16
				(gEgo
					setMotion: PolyPath (- (newView x?) 6) (- (newView y?) 2) self
				)
			)
			(17
				(gEgo
					view: 15
					setLoop: 3
					setCel: 5
					cycleSpeed: 12
					setCycle: Beg self
				)
				(newView dispose:)
			)
			(18
				(gEgo
					setLoop: 2
					setCel: 0
					posn: (+ (gEgo x?) 9) (+ (gEgo y?) 3)
					setCycle: End self
				)
			)
			(19
				(gEgo setCycle: Beg self)
				(newProp setCycle: Beg)
			)
			(20
				(newProp dispose:)
				(gEgo posn: (- (gEgo x?) 5) (- (gEgo y?) 5))
				(proc0_2)
				(= ticks 30)
			)
			(21
				(if (not (Wat weMeetAgain?))
					(proc13_4 1024 87 self)
				else
					(= state (+ state 1))
					(self cue:)
				)
			)
			(22 (proc13_4 1024 88 self))
			(23
				(Wat
					setScript: (Wat theTimer?)
					hurry: 1
					charObj: 0
					travelSect: (+ (Wat section?) 1)
				)
				(proc0_4)
				(proc806_6 0)
				(self dispose:)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (and (proc0_5 34) local22) (proc13_4 1024 8 1))
			)
			(4
				(if (== param2 1) (gEgo setScript: egoSkewered) 1)
			)
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 906
	)
)
