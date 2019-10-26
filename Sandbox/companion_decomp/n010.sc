;;; Sierra Script 1.0 - (do not remove this comment)
(script# 10)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n951)
(use n961)
(use n969)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	fKnight 0
	fKnightEncounter 1
	horseBody 2
	horseHead 3
	theSword 4
)

(local
	[local0 9] = [60 0 2 4 19 30 23 20 29]
	[local9 9] = [-1 7816 32]
	[local18 5] = [0 10 12 5 6]
	[local23 5] = [0 5 4 8 2]
	local28
	local29 =  1
	local30
	gMoneyDoit
	local32
	local33
	local34
	local35
	local36
	local37
	local38
	local39
	local40
	[local41 6] = [1010 0 1 1 1]
	[local47 14] = [1010 7 2 1 1 2 1 2 1 3 4 1 3]
	[local61 6] = [1010 18 2 1 2]
	[local67 6] = [1010 21 2 1 2]
	[local73 6] = [1010 24 2 1 1]
	[local79 4] = [1010 27 1]
	[local83 5] = [1010 28 1 2]
	[local88 4] = [1010 30 1]
	[local92 5] = [1010 31 1 1]
	[local97 6] = [1010 44 1 2 1]
	[local103 5] = [1010 47 2 1]
	[local108 6] = [1010 49 2 1 2]
	[local114 9] = [1010 52 1 2 1 2 1 2]
	[local123 8] = [1010 58 1 0 1010 59 1]
	[local131 4] = [1010 60 1]
	[local135 4] = [1010 61 1]
	[local139 4] = [1010 62 1]
	[local143 4] = [1010 64 1]
	[local147 5] = [1010 65 1 1]
	[local152 9] = [1010 67 1 2 1 2 2 1]
	[local161 6] = [1010 73 1 2 1]
	[local167 5] = [1010 76 1 1]
	[local172 4] = [1010 41 1]
	[local176 4] = [1010 42 1]
	[local180 4] = [1010 79 1]
	[local184 4] = [1010 80 1]
	[local188 13] = [1010 82 2 1 1 2 1 2 1 2 1 1]
	[local201 4] = [1010 92 1]
	[local205 4] = [1010 93 1]
	[local209 4] = [1010 94 1]
	[local213 6] = [1010 95 2 1 2]
	[local219 6] = [1010 98 2 1 2]
	[local225 6] = [1010 101 2 1 2]
	[local231 6] = [1010 104 2 1 2]
	[local237 4] = [1010 107 1]
)
(instance fKnight of Actor
	(properties
		x 181
		y 105
		z 33
		view 121
		signal $4000
	)
	
	(method (init)
		(if (proc0_5 27)
			(= local30 1)
			(global2
				addObstacle:
					((Polygon new:)
						type: 2
						init: 167 77 203 77 206 74 244 74 245 84 228 94 214 99 203 103 150 103
						yourself:
					)
			)
		else
			(gSFX number: 126 loop: -1 play:)
			(= local28 (global1 egoMoveSpeed?))
			(horseHead init:)
			(horseBody init:)
			(if (and (proc0_5 38) (not (proc0_5 27)))
				(bigWill init: stopUpd:)
				(bigJohn init: stopUpd:)
				(bigTuck init: stopUpd:)
			)
		)
		(super init:)
	)
	
	(method (doit)
		(if (proc0_5 110)
			(proc0_7 110)
			(if (not local30) (global2 setScript: handCodeDelay))
		)
		(super doit:)
	)
	
	(method (dispose)
		(if (or gMoneyDoit local32)
			(gPennies put:)
			(gHapennies put:)
			(gFarthings put:)
			(if (& local32 $0001) ((global9 at: 2) owner: 140))
			(if (& local32 $0002) ((global9 at: 14) owner: 140))
			(if (& local32 $0004) ((global9 at: 10) owner: 140))
			(if (& local32 $0008) ((global9 at: 18) owner: 140))
		)
		(gSFX fade: 0 30 8 1)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(horseSound stop: dispose:)
		(if local40 ((ScriptID 19) dispose:))
		(horseHead dispose: delete:)
		(horseBody dispose: delete:)
		(theSword dispose: delete:)
		(super dispose:)
		(self delete:)
		(DisposeScript 10)
	)
	
	(method (doVerb theVerb param2)
		(cond 
			((and local30 (!= theVerb 3)) (proc13_4 1010 4))
			((and local39 (not (proc999_5 theVerb 10 2))) 0)
			(else
				(switch theVerb
					(2 (proc13_4 1010 3))
					(5
						(if local36
							(global2 setScript: yakItUp2)
						else
							(= local36 1)
							(global2 setScript: yakItUp1)
						)
					)
					(10
						(global2 setScript: killHim)
					)
					(4
						(switch param2
							(1
								(proc851_0 1 @local205 @local0 3)
							)
							(0
								(if (= gMoneyDoit (gMoney doit:))
									(proc851_0 1 @local209 @local0 3)
								)
							)
							(2
								(proc851_0 @local213 1 @local0)
								(gEgo put: 2 fKnight)
								(= local32 (| local32 $0001))
							)
							(14
								(proc851_0 @local219 1 @local0)
								(gEgo put: 14 fKnight)
								(= local32 (| local32 $0002))
							)
							(10
								(proc851_0 @local225 1 @local0)
								(gEgo put: 10 fKnight)
								(if (== global115 2) (= global115 0))
								(= local32 (| local32 $0004))
							)
							(18
								(proc851_0 @local231 1 @local0)
								(gEgo put: 18 fKnight)
								(if (== global115 1) (= global115 0))
								(= local32 (| local32 $0008))
							)
							(else 
								(proc851_0 1 @local237 @local0 3)
							)
						)
					)
					(3
						(cond 
							(local30
								(if local37
									(proc13_4 1010 38)
								else
									(= local37 1)
									(global2 setScript: searchHim)
								)
							)
							(local34 (= local35 1) (global2 setScript: robinDeath))
							(else (= local34 1) (global2 setScript: doWarning))
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
		)
	)
)

(instance horseBody of Prop
	(properties
		x 184
		y 100
		view 121
		cel 2
		signal $4001
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1010 5))
			(3
				(if local30
					(if local40
						(proc851_0 1 @local172 13 3)
					else
						(proc13_4 1010 40)
					)
				else
					(proc851_0 1 @local176 @local0 3)
				)
			)
			(5
				(if local39 0 else (self setScript: nayTalk))
			)
			(4 (proc13_4 1010 43))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance horseHead of Prop
	(properties
		x 174
		y 110
		z 42
		view 121
		cel 1
		signal $4001
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (doit)
		(if
			(and
				(== cel 3)
				(not (Random 0 3))
				(not (horseSound handle?))
				(& signal $0002)
			)
			(horseSound play:)
		)
		(super doit: &rest)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1010 5))
			(3
				(if local30
					(if local40
						(proc851_0 1 @local172 13 3)
					else
						(proc13_4 1010 40)
					)
				else
					(proc851_0 1 @local176 @local0 3)
				)
			)
			(5
				(if local39 0 else (self setScript: nayTalk))
			)
			(10
				(if local30
					(super doVerb: theVerb &rest)
				else
					(fKnight doVerb: theVerb param2 &rest)
				)
			)
			(4 (proc13_4 1010 43))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theSword of View
	(properties
		x 183
		y 28
		view 123
		signal $6000
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1010 6))
			(3 (proc13_4 1010 39))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance nayTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 1 @local131 1 2 self)
			)
			(1
				(horseSound play:)
				(proc851_0 1 @local135 @local9 0 self)
			)
			(2
				(proc851_0 1 @local139 1 2 self)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance fKnightEncounter of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if
					(and
						(proc0_5 38)
						(not (proc0_5 27))
						(not (proc0_5 136))
					)
					(self setScript: willSez self)
				else
					(self cue:)
				)
			)
			(1
				(proc0_3)
				(Wat setScript: 0 section: 4)
				(if (not (global5 contains: fKnight)) (fKnight init:))
				(gEgo
					setLoop: 0
					heading: 90
					cel: 0
					posn: 149 93
					ignoreActors: 1
					init:
					actions: egoActions
					setCycle: Walk
					stopUpd:
				)
				(gEgoHead stopUpd:)
				(= ticks 12)
			)
			(2
				(proc851_0 4 @local47 1 2 @local0 3 13 2 14 3 self)
			)
			(3 (= ticks 60))
			(4
				(bigJohn cel: 1)
				(bigWill cel: 1)
				(bigTuck cel: 1)
				(= ticks 18)
			)
			(5
				(bigJohn
					setLoop: 4
					setCycle: Walk
					setMotion: MoveTo -20 (bigJohn y?) self
				)
				(bigTuck
					setLoop: 5
					setCycle: Walk
					ignoreHorizon: 1
					setMotion: MoveTo (bigTuck x?) -2 self
				)
				(bigWill
					setLoop: 6
					setCycle: Walk
					setMotion: MoveTo 340 (bigWill y?) self
				)
			)
			(6)
			(7)
			(8
				(bigWill dispose:)
				(bigJohn dispose:)
				(bigTuck dispose:)
				(proc851_0 2 @local61 1 2 @local0 3 self)
			)
			(9
				(horseHead view: 125 loop: 2 setScript: (horseMove new:))
				(horseBody view: 125 loop: 3 setScript: (horseMove new:))
				(fKnight view: 125 startUpd:)
				(proc0_4)
				(gIconBar disable: 5 0)
				(User canControl: 0)
				(proc0_6 27)
				(self dispose:)
			)
		)
	)
)

(instance willSez of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 20))
				(proc0_9 (ScriptID 20) gEgo)
				(= ticks 48)
			)
			(1
				(proc851_0 1 @local41 14 0 self)
			)
			(2 (= ticks 60))
			(3
				(gEgo dispose:)
				((ScriptID 20) dispose:)
				(global2 drawPic: 803 -32761)
				(= ticks 60)
			)
			(4
				(global2 drawPic: 120 -32762)
				(self dispose:)
			)
		)
	)
)

(instance horseMove of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= ticks (if local39 12 else (Random 30 240)))
			)
			(1
				(client
					setCel: (Random 0 (client lastCel:))
					setCycle: CT 0 (if (Random 0 1) 1 else -1) self
					checkDetail:
				)
			)
			(2 (= state -1) (self cue:))
		)
	)
)

(instance handCodeDelay of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 3))
			(1
				(if (not local33)
					(= local33 1)
					(proc851_0 2 @local67 1 2 @local0 3 self)
				else
					(= register 1)
					(proc851_0 2 @local73 2 2 @local0 3 self)
				)
			)
			(2
				(if register
					(= local39 1)
					(if (not (HaveMouse))
						(global1 setCursor: global19 1 183 41)
					)
					(client setScript: liftSword)
				else
					(if (proc0_5 67) (proc806_1 50))
					(self dispose:)
				)
			)
		)
	)
)

(instance liftSword of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_4)
				(gIconBar disable: 5 0 6 7)
				(proc806_6 4)
				(global1 setSpeed: global141)
				(fKnight setCycle: CT 3 1 self)
			)
			(1 (= ticks 120))
			(2
				(proc851_0 1 @local79 @local0 3 self)
			)
			(3 (= ticks 120))
			(4
				(proc0_3)
				(robinDeath start: 3)
				(client setScript: robinDeath)
			)
		)
	)
)

(instance doWarning of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(global1 setSpeed: global141)
				(gEgo setMotion: MoveTo (+ (gEgo x?) 6) (gEgo y?) self)
			)
			(1 (= ticks 18))
			(2
				(proc851_0 2 @local83 1 2 @local0 3 self)
			)
			(3
				(gEgo setCycle: Rev setMotion: MoveFwd -6 self)
			)
			(4
				(gEgo setCycle: Walk)
				(proc0_4)
				(gIconBar disable: 5 0)
				(self dispose:)
			)
		)
	)
)

(instance robinDeath of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo (+ (gEgo x?) 6) (gEgo y?) self)
			)
			(1 (= ticks 18))
			(2
				(proc851_0 1 @local88 1 2 self)
			)
			(3
				(fKnight
					cycleSpeed: 3
					setCycle: CT (- (fKnight lastCel:) 1) 1 self
				)
				(swordSound play:)
			)
			(4
				(global1 setSpeed: global141)
				(fKnight setCycle: End)
				(gEgo
					view: 792
					setLoop: 0
					setCel: 3
					cycleSpeed: 12
					setCycle: End self
				)
				(swordSound number: 907 play:)
			)
			(5
				(fKnight cycleSpeed: 6 setCycle: Beg self)
			)
			(6
				(swordSound dispose:)
				(if local35
					(proc851_0 1 @local92 @local0 3 self)
				else
					(proc851_0 1 @local143 @local0 3 self)
				)
			)
			(7
				(= global145 3)
				(horseHead setScript: 0)
				(horseBody setScript: 0)
				(global2 newRoom: 170)
			)
		)
	)
)

(instance killHim of Script
	(properties)
	
	(method (dispose)
		(shootSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp fKnightCel)
		(switch (= state newState)
			(0
				(proc0_3)
				(global1 setSpeed: global141)
				(gEgo view: 123 setLoop: 1 setCel: 0 setCycle: End self)
				(fKnight cycleSpeed: 12 setCycle: CT 3 1)
			)
			(1
				(shootSound play:)
				(fKnight
					setLoop: 1
					setCel: 0
					posn: 181 72 0
					setPri: 13
					cycleSpeed: global141
				)
				(= ticks (* global141 2))
			)
			(2
				(if local29
					(gSFX stop:)
					(shootSound number: 907 loop: 1 play:)
					(= local29 0)
				)
				(= fKnightCel (fKnight cel?))
				(fKnight
					setCel: (+ (fKnight cel?) 1)
					x: (+ (fKnight x?) [local18 fKnightCel])
					y: (+ (fKnight y?) [local23 fKnightCel])
				)
				(switch fKnightCel
					(1 (theSword init:))
					(2
						(theSword setCel: 1 posn: 164 22)
					)
					(3
						(theSword setCel: 2 posn: 145 24)
					)
					(4
						(theSword posn: 125 55 stopUpd:)
					)
				)
				(= ticks (* global141 2))
			)
			(3
				(if (== (fKnight cel?) (fKnight lastCel:))
					(gEgo
						setLoop: 2
						setCel: 0
						cycleSpeed: 18
						setCycle: End self
					)
					(fKnight setPri: -1 stopUpd:)
					(horseHead
						y: (- (horseHead y?) 10)
						z: (- (horseHead z?) 10)
					)
					(global2
						addObstacle:
							((Polygon new:)
								type: 2
								init: 167 77 203 77 206 74 244 74 245 84 228 94 214 99 203 103 150 103
								yourself:
							)
					)
					(= local30 1)
					(= local39 0)
				else
					(= state (- state 2))
					(self cue:)
				)
			)
			(4 (= ticks 24))
			(5
				(gSFX number: 128 loop: -1 play:)
				(gEgo setLoop: 1 setCel: 0 x: (+ (gEgo x?) 3))
				(= ticks 12)
			)
			(6 (proc0_2 0) (= ticks 12))
			(7 (proc13_4 1010 63 self))
			(8
				(proc0_4)
				(proc806_1 50)
				(global1 setSpeed: local28)
				(self dispose:)
			)
		)
	)
)

(instance searchHim of TScript
	(properties)
	
	(method (dispose)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 243 94 self)
			)
			(1 (gEgo setHeading: 315 self))
			(2
				(gEgo view: 7 setLoop: 0 setCel: 0 setCycle: CT 4 1 self)
			)
			(3 (= ticks 24))
			(4
				(gEgo setCel: (+ (gEgo cel?) 1))
				(= ticks 24)
			)
			(5
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 24)
			)
			(6
				(proc806_1 50)
				(gEgo get: 9 setCycle: End self)
			)
			(7 (proc13_4 1010 33 self))
			(8 (proc13_4 1010 34 self))
			(9
				(proc0_2 7)
				(proc13_4 1010 35 self)
			)
			(10
				(proc13_4 1010 36 self)
				(gEgo get: 9)
			)
			(11
				(if (or gMoneyDoit local32)
					(proc13_4 1010 37 self)
					(gPennies put:)
					(gHapennies put:)
					(gFarthings put:)
					(if (& local32 $0001) (gEgo get: 2))
					(if (& local32 $0002) (gEgo get: 14))
					(if (& local32 $0004) (gEgo get: 10))
					(if (& local32 $0008) (gEgo get: 18))
					(= local32 (= gMoneyDoit 0))
				else
					(self cue:)
				)
			)
			(12 (proc0_4) (self dispose:))
		)
	)
)

(instance yakItUp1 of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local97 1 2 @local0 3 self)
			)
			(1
				(fKnight setCycle: CT 2 1 self)
			)
			(2 (= ticks 30))
			(3
				(proc851_0 2 @local103 1 2 @local0 3 self)
			)
			(4 (fKnight setCycle: Beg self))
			(5 (= ticks 30))
			(6
				(proc851_0 2 @local108 1 2 @local0 3 self)
			)
			(7
				(proc0_4)
				(gIconBar disable: 5 0)
				(self dispose:)
			)
		)
	)
)

(instance yakItUp2 of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local114 1 2 @local0 3 self)
			)
			(1
				(proc851_0 1 @local123 2 2 self)
			)
			(2
				(= local39 1)
				(if (not (HaveMouse))
					(global1 setCursor: global19 1 183 41)
				)
				(client setScript: liftSword)
			)
		)
	)
)

(instance hereComesJohn of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
					(and
						(< 95 (gEgo y?))
						(< (proc0_3) 145)
						(> (gEgo x?) 250)
					)
					(gEgo setMotion: PolyPath 245 (gEgo y?))
				)
				((ScriptID 19)
					actions: johnActions
					posn: 330 120
					init:
					setCycle: StopWalk 152
					setMotion: MoveTo 270 120 self
				)
			)
			(1
				(proc0_9 gEgo (ScriptID 19) self)
			)
			(2
				(proc851_0 1 @local147 13 3 self)
			)
			(3
				(if (gEgo has: 9)
					(proc851_0 @local161 1 13 self)
				else
					(proc851_0 @local152 1 13 self)
				)
			)
			(4
				(proc0_4)
				(= local40 1)
				(self dispose:)
			)
		)
	)
)

(instance showLetter of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				((ScriptID 19) setMotion: PChase gEgo 35 self)
				(proc0_9 gEgo (ScriptID 19))
			)
			(1
				(proc851_0 @local188 1 13 self)
			)
			(2
				(proc806_1 50)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance johnActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 1 (proc13_4 1010 78))
			(3
				1
				(proc851_0 1 @local180 13 3)
			)
			(5
				1
				(proc851_0 1 @local184 13 3)
			)
			(10 1 (proc13_4 1010 81))
			(4
				(if (== param2 9)
					1
					(if local38
						(proc851_0 1 @local201 13 3)
					else
						(= local38 1)
						(global2 setScript: showLetter)
					)
				)
			)
		)
	)
)

(instance localHorn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					(local40 (self setScript: (ScriptID 5 1) self))
					(local30 (gEgo setMotion: PolyPath 160 140 self))
					(else (gEgo view: 10 setCel: 0 setLoop: 0 setCycle: End self))
				)
			)
			(1
				(cond 
					(local40 (proc851_0 1 @local167 13 3 self))
					(local30 (self setScript: (ScriptID 5 1) self))
					(else
						(robinDeath start: 3)
						(global2 setScript: robinDeath)
						(self dispose:)
					)
				)
			)
			(2
				(if (and local30 (not local40))
					(global2 setScript: hereComesJohn)
					(gEgo setHeading: 90)
					(self dispose:)
				else
					(proc0_4)
					(self dispose:)
				)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(cond 
				(local39 (super doVerb: theVerb &rest))
				((and (== theVerb 4) (== param2 1)) (gEgo setScript: localHorn) 1)
			)
		)
	)
)

(instance horseSound of Sound
	(properties
		flags $0001
		number 913
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 906
	)
)

(instance swordSound of Sound
	(properties
		flags $0001
		number 934
	)
)

(instance bigJohn of Actor
	(properties
		x 115
		y 103
		view 121
		loop 1
	)
)

(instance bigTuck of Actor
	(properties
		x 230
		y 73
		view 121
		loop 2
	)
)

(instance bigWill of Actor
	(properties
		x 281
		y 116
		view 121
		loop 3
	)
)
