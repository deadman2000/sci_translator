;;; Sierra Script 1.0 - (do not remove this comment)
(script# 29)
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
(use n950)
(use n951)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	theMan 0
	theWoman 1
	shooter 2
	womanScript 3
)

(local
	[local0 9] = [-1 6876 19]
	[local9 9] = [-1 6881 6]
	[local18 9] = [-1 6895 19]
	local27
	local28
	local29
	local30
	local31
	local32
	[local33 8] = [1029 0 1 2 3 1 2]
	[local41 5] = [1029 5 1 2]
	[local46 4] = [1029 7 1]
	[local50 8] = [1029 8 1 2 1 2 1]
	[local58 14] = [1029 14 1 2 1 2 1 2 3 2 2 1 2]
	[local72 11] = [1029 25 1 2 1 3 2 1 2 2]
	[local83 4] = [1029 33 1]
	[local87 4] = [1029 36 1]
	[local91 4] = [1029 37 1]
	[local95 4] = [1029 38 1]
	[local99 6] = [1029 61 2 1 2]
	[local105 4] = [1029 64 1]
	[local109 6] = [1029 51 2 1 2]
	[local115 4] = [1029 54 1]
	[local119 4] = [1029 56 1]
	[local123 7] = [1029 57 2 1 2 3]
	[local130 4] = [1029 55 1]
	[local134 5] = [1029 65 2 1]
	[local139 5] = [1029 41 2 1]
	[local144 6] = [1029 43 2 1 3]
	[local150 5] = [1029 46 1 2]
	[local155 4] = [1029 48 1]
	[local159 9] = [1029 67 1 2 1 2 2 3]
	[local168 7] = [1029 73 1 2 1 2]
	[local175 4] = [1029 78 1]
	[local179 7] = [1029 79 1 2 2 1]
)
(instance theMan of Actor
	(properties
		x 215
		y 60
		view 112
		loop 2
		cel 1
		signal $7800
	)
	
	(method (doit)
		(cond 
			((or script (gEgo script?) (global2 script?)))
			(
				(and
					(not (& (theMan signal?) $0020))
					(not local30)
					(closePoly onMe: gEgo)
				)
				(= local30 1)
				(gEgo setScript: getBack)
			)
		)
		(super doit:)
	)
	
	(method (doVerb theVerb param2)
		(if (& (theMan signal?) $0020)
			((ScriptID 120 2) doVerb: theVerb &rest)
		else
			(switch theVerb
				(2 (proc13_4 1029 13))
				(3
					(proc0_3)
					(gEgo setMotion: PChase theMan 30)
				)
				(10
					(gEgo setScript: flunkyKilled)
				)
				(5
					(cond 
						((Wat offRoad?)
							(if local32
								(proc851_0 1 @local83 @local0 2)
							else
								(= local32 1)
								(proc851_0 3 @local72 2 2 @local0 3 @local9 2)
							)
						)
						((Wat charFirstTalk?) (proc851_0 1 @local83 @local0 2))
						(else
							(Wat charFirstTalk: 1)
							(proc851_0 3 @local58 2 2 @local0 3 @local9 2)
						)
					)
				)
				(4
					(switch param2
						(0
							(if (Wat gaveManBucks?)
								(proc13_4 1029 77)
							else
								(Wat gaveManBucks: 1)
								(gEgo setScript: buckTalk)
							)
						)
						(else 
							(proc0_3)
							(gEgo setMotion: PChase theMan 30)
						)
					)
				)
			)
		)
	)
)

(instance theWoman of Actor
	(properties
		x 220
		y 69
		view 112
		cel 5
		signal $7800
	)
	
	(method (init)
		(gSFX number: 126 loop: -1 play:)
		(super init:)
	)
	
	(method (dispose)
		(gSFX fade: 0 30 8 1)
		(gIconBar enable: 0)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(if (not (& (theMan signal?) $0020))
			(theMan setCycle: 0 setMotion: 0 dispose:)
		)
		(if (global32 contains: closePoly) (closePoly dispose:))
		(if (Wat whichChar?)
			(Wat weMeetAgain: (+ (Wat weMeetAgain?) 1))
		)
		(if (== (Wat womanStatus?) 3)
			(gEgo setScript: 0)
			(proc125_2)
			(User canControl: 1)
		)
		(super dispose:)
		(self delete:)
		(if (not (& (theMan signal?) $0020))
			(theMan delete:)
		else
			(global32 delete: theMan)
		)
		(gIconBar enable: 5)
	)
	
	(method (doVerb theVerb param2)
		(if (& (theWoman signal?) $0020)
			((ScriptID 120 2) doVerb: theVerb &rest)
		else
			(switch theVerb
				(2
					(if (== (Wat womanStatus?) 0)
						(proc13_4 1029 34)
					else
						(proc13_4 1029 35)
					)
				)
				(3
					(if (== (Wat womanStatus?) 0)
						(proc0_3)
						(gEgo setMotion: PChase theMan 30)
					else
						(proc851_0 1 @local87 @local9 1)
					)
				)
				(5
					(if (== (Wat womanStatus?) 0)
						(proc851_0 1 @local91 @local9 3)
					else
						(proc851_0 1 @local95 @local9 1)
					)
				)
				(10
					(if (!= (Wat womanStatus?) 2) (proc13_4 1029 84 1))
				)
				(4
					(switch param2
						(0
							(if (== (Wat womanStatus?) 3)
								(cond 
									(local27 (proc13_4 1029 39))
									((gMoney doit:) (= local27 1) (gEgo setScript: giveWomanBucks))
								)
							else
								(proc0_3)
								(gEgo setMotion: PChase theMan 30)
							)
						)
						(else 
							(super doVerb: theVerb &rest)
						)
					)
				)
				(else 
					(super doVerb: theVerb &rest)
				)
			)
		)
	)
)

(instance shooter of Prop
	(properties
		view 393
		cel 4
	)
)

(instance closePoly of Feature
	(properties)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 164 97 116 60 212 40 269 64 269 89
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(cond 
			(((ScriptID 120 3) onMe: self) ((ScriptID 120 3) doVerb: theVerb))
			(((ScriptID 120 4) onMe: self) ((ScriptID 120 4) doVerb: theVerb))
			(else ((ScriptID 120 2) doVerb: theVerb))
		)
	)
)

(instance womanScript of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo actions: egoActions)
				(Wat setScript: 0)
				(closePoly init:)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(theMan init: setCycle: CT 6 1 self)
				)
			)
			(1
				(theMan cel: 7)
				(theWoman
					init:
					setCycle: Walk
					setStep: 6 4
					setMotion: MoveTo 212 76 self
				)
				(= ticks 6)
			)
			(2
				(theMan view: 752 loop: 1 cel: 5 x: 205 y: 65 setPri: 3)
			)
			(3
				(theWoman loop: 3 cel: 0 setStep: 3 2 posn: 197 73)
				(= ticks 6)
			)
			(4
				(proc851_0 3 @local33 2 2 @local0 3 @local9 2 self)
			)
			(5
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(proc0_3)
				(gEgo actions: egoActions)
				(if (> (Wat weMeetAgain?) 1)
					(proc851_0 1 @local46 2 2 self)
				else
					(proc851_0 2 @local41 2 2 @local0 3 self)
				)
			)
			(2
				(if (> (Wat weMeetAgain?) 1)
					(client setScript: lastChance)
				else
					(proc0_2)
					(proc0_4)
					(self dispose:)
				)
			)
		)
	)
)

(instance lastChance of Script
	(properties)
	
	(method (dispose)
		(shootSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(shooter setCycle: CT 2 1 self)
			)
			(1
				(shootSound number: 906 play:)
				(shooter setCycle: CT 4 1 self)
				(gEgo view: 792 loop: 0 cel: 0 setCycle: End self)
			)
			(2
				(shootSound number: 907 play:)
				(theMan view: 752 loop: 0 cel: 0)
				(= ticks 60)
			)
			(3)
			(4
				(proc851_0 2 @local50 @local18 2 @local0 3 self)
			)
			(5 (gSFX stop:) (proc806_0))
		)
	)
)

(instance getBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(proc0_9 gEgo theMan self)
			)
			(1
				(if (== (++ local31) 3)
					(client setScript: womanKilled)
				else
					(proc851_0 2 @local109 2 2 @local0 3 self)
				)
			)
			(2
				(gEgo
					setLoop: (gEgo loop?)
					setCycle: Rev
					setMotion: MoveFwd -25 self
				)
			)
			(3
				(= local30 0)
				(proc0_2)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance womanKilled of Script
	(properties)
	
	(method (dispose)
		(screamSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(theMan cycleSpeed: 12 setCycle: CT 2 1 self)
				(theWoman cycleSpeed: 12 setCycle: CT 3 1)
			)
			(1
				(screamSound play:)
				(proc851_0 1 @local115 @local9 1 self)
			)
			(2
				(theMan setCycle: End)
				(theWoman setCycle: End self)
				(Wat womanStatus: 2)
			)
			(3
				(theWoman addToPic:)
				(proc806_1 -100)
				(proc851_0 1 @local130 2 2 self)
			)
			(4
				(client setScript: flunkyKilled)
			)
		)
	)
)

(instance flunkyKilled of Script
	(properties)
	
	(method (dispose)
		(shootSound dispose:)
		(if (& (theWoman signal?) $0020) (gSFX fade: 0 30 8 1))
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo theMan self)
			)
			(1
				(global1 setSpeed: (/ global141 2))
				(gEgo view: 4 cel: 0 setCycle: End self)
			)
			(2
				(gEgo view: 5 cel: 0 setCycle: End self)
				(theMan cel: 1)
			)
			(3
				(shootSound number: 906 play:)
				(= ticks (/ (gEgo distanceTo: theMan) 4))
			)
			(4
				(theMan
					loop: 2
					cel: 0
					x: (+ (theMan x?) 3)
					setCycle: End self
				)
				(gSFX stop:)
				(shootSound number: 907 play:)
			)
			(5
				(global1 setSpeed: global141)
				(theMan addToPic:)
				(proc0_2)
				(= ticks 60)
			)
			(6
				(gSFX
					number: (if (== (Wat womanStatus?) 2) 127 else 128)
					loop: -1
					play:
				)
				(if (== (Wat womanStatus?) 2)
					(proc0_6 75)
					(proc851_0 1 @local119 2 3 self)
				else
					(proc0_7 75)
					(Wat womanStatus: 1)
					(client setScript: savedTheWoman)
				)
			)
			(7
				(self setScript: (ScriptID 5 1) self)
			)
			(8
				(gEgo setMotion: MoveTo 140 115 self)
			)
			(9 (proc0_9 gEgo theMan self))
			(10
				(self setScript: (ScriptID 125 1) self)
			)
			(11
				(= local28 1)
				(global1 setSpeed: global141)
				(proc0_9 gEgo (ScriptID 19) self)
			)
			(12
				(proc851_0 3 @local123 2 0 13 2 15 3 self)
			)
			(13
				(proc851_0 2 @local134 2 2 14 3 self)
			)
			(14
				(global2 drawPic: 803 -32761)
				(proc0_2)
				(gEgo loop: 4 cel: 0 posn: 160 95)
				(gEgoHead cel: 7 posn: 120 125)
				(global5 eachElementDo: #hide)
				(= ticks 120)
			)
			(15
				(if (and (proc0_5 46) (proc0_5 45))
					(global2 newRoom: 160)
				else
					(proc806_6 0)
					((ScriptID 19) dispose:)
					((ScriptID 23) dispose:)
					((ScriptID 20) dispose:)
					(= local29 1)
					(proc125_2)
					(global5 eachElementDo: #show)
					(global2 drawPic: 120 -32761)
					(proc121_0)
					(= ticks 12)
				)
			)
			(16 (proc0_4) (self dispose:))
		)
	)
)

(instance savedTheWoman of Script
	(properties)
	
	(method (doit)
		(if
			(and
				(theWoman mover?)
				(not (& ((gIconBar at: 0) signal?) $0004))
			)
			(gIconBar disable: 0)
			(User canControl: 0)
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(theWoman
					view: 745
					loop: 1
					cel: 0
					posn: (+ (theWoman x?) 12) (+ (theWoman y?) 4)
					cycleSpeed: 12
					setCycle: End self
				)
			)
			(1
				(proc851_0 2 @local99 3 2 @local9 3 self)
				(proc806_1 100)
			)
			(2
				(theWoman stopUpd:)
				(self setScript: (ScriptID 5 1) self)
			)
			(3
				(gEgo setMotion: MoveTo 140 115 self)
			)
			(4 (proc0_9 gEgo theWoman self))
			(5 (= ticks 12))
			(6
				(gEgo stopUpd:)
				(self setScript: (ScriptID 125 1) self)
			)
			(7
				(= local28 1)
				(proc0_9 gEgo (ScriptID 20) self)
			)
			(8
				(proc851_0 2 @local134 2 2 14 3 self)
			)
			(9 (= ticks 18))
			(10
				(theWoman view: 112 setLoop: 0 posn: 190 105)
				(proc0_2)
				(gEgo loop: 4 cel: 0 posn: 160 95)
				(gEgoHead posn: 120 125)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32761)
				(= ticks 120)
			)
			(11
				((ScriptID 19) dispose:)
				((ScriptID 23) dispose:)
				((ScriptID 20) dispose:)
				(= local29 1)
				(global5 eachElementDo: #show)
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(= ticks 12)
			)
			(12
				(proc851_0 1 @local105 @local9 3 self)
			)
			(13
				(Wat womanStatus: 3)
				(theWoman
					cycleSpeed: 6
					setCycle: Walk
					setMotion: MoveTo 20 240 self
				)
				(gEgo setHeading: 225)
				(proc0_6 173)
				(proc0_4)
				(gIconBar disable: 0 5)
				(User canControl: 0)
			)
			(14
				(if (and (proc0_5 46) (proc0_5 45))
					(self dispose:)
					(global2 newRoom: 160)
				else
					(proc0_3)
					(if (global2 script?) (global2 setScript: 0))
					(proc13_4 1029 83 self)
				)
			)
			(15
				(proc0_4)
				(self dispose:)
				(proc125_2)
				(User canControl: 1)
				(gIconBar enable: 0)
				(proc806_6 0)
				(theWoman dispose:)
			)
		)
	)
)

(instance buckTalk of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 3 @local159 1 2 @local0 3 @local9 2 self)
			)
			(1
				(proc851_0 2 @local168 2 2 @local0 3 self)
			)
			(2 (self dispose:))
		)
	)
)

(instance giveWomanBucks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(Load rsVIEW 7)
				(theWoman setLoop: 1 setMotion: 0)
				(proc0_3)
				(proc851_0 1 @local175 3 0 self)
			)
			(1
				(proc806_1 50)
				(gEgo
					setMotion: MoveTo (- (theWoman x?) 23) (+ (theWoman y?) 4) self
				)
			)
			(2 (gEgo setHeading: 135 self))
			(3
				(global1 setSpeed: global141)
				(gEgo view: 7 loop: 4 cel: 0 setCycle: CT 3 1 self)
			)
			(4
				(proc851_0 2 @local179 3 0 @local9 1 self)
			)
			(5 (gEgo setCycle: Beg self))
			(6
				(proc0_2)
				(gEgo
					setMotion: MoveTo (- (gEgo x?) 25) (gEgo y?) self
				)
			)
			(7
				(theWoman setLoop: 0 setMotion: MoveTo 20 240 self)
				(if (> (gEgo y?) 188)
					(gEgo setMotion: MoveTo (+ (gEgo x?) 20) 178 self)
				else
					(self cue:)
				)
				(proc0_4)
				(gIconBar disable: 0 5)
				(User canControl: 0)
			)
			(8 (gEgo setHeading: 225))
			(9 (proc13_4 1029 83 self))
			(10
				(self dispose:)
				(if (and (proc0_5 46) (proc0_5 45))
					(global2 newRoom: 160)
				else
					(proc125_2)
					(proc0_4)
					(theWoman dispose:)
				)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(if (== (Wat womanStatus?) 0)
					(if (or local29 (Wat blewHorn?))
						(proc13_4 1029 49)
						1
					else
						(gEgo setScript: getYerMen)
					)
				else
					(proc13_4 1029 50)
					1
				)
			else
				0
			)
		)
	)
)

(instance getYerMen of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= register (< global87 1))
				(proc0_3)
				(proc958_0 128 151 152 160 161 154 155)
				(ScriptID 19)
				(ScriptID 23)
				(ScriptID 20)
				(theMan stopUpd:)
				(theWoman stopUpd:)
				(self setScript: (ScriptID 5 1) self)
			)
			(1
				(Wat blewHorn: 1)
				(proc851_0 2 @local139 2 2 @local0 3 self)
			)
			(2
				(gEgo setMotion: MoveTo 140 115 self)
			)
			(3 (proc0_9 gEgo theMan self))
			(4 (= ticks 12))
			(5
				(if register
					(global2 drawPic: 803 -32759)
					(global5 eachElementDo: #hide)
					(= ticks 30)
				else
					(gEgo stopUpd:)
					(self setScript: (ScriptID 125 1) self)
				)
			)
			(6
				(if register
					((ScriptID 20) loop: 2 posn: 185 50 init: stopUpd:)
					((ScriptID 19)
						loop: 0
						posn: 95 70
						setCycle: StopWalk 152
						init:
					)
					((ScriptID 23) loop: 1 posn: 240 125 init: stopUpd:)
					(global5 eachElementDo: #show)
					(global2 drawPic: 120 -32759)
					(proc121_0)
					(= ticks 12)
				else
					(= ticks 30)
				)
			)
			(7
				(proc0_9 gEgo (ScriptID 19))
				((ScriptID 19) setMotion: PChase gEgo 40 self)
			)
			(8 (= ticks 30))
			(9
				(= notKilled 1)
				(proc851_0 3 @local144 1 2 13 3 @local0 2 self)
			)
			(10
				(proc851_0 2 @local150 2 2 @local0 3 self)
			)
			(11
				(proc851_0 1 @local155 1 0 self)
			)
			(12
				(if register
					((ScriptID 19) dispose:)
					((ScriptID 20) dispose:)
					((ScriptID 23) dispose:)
					(global2 drawPic: 803 -32759)
					(global5 eachElementDo: #hide)
					(= ticks 60)
				else
					(gEgo stopUpd:)
					((ScriptID 19)
						setMotion: PolyPath -25 (- ((ScriptID 19) y?) 15) self
					)
					((ScriptID 20)
						setMotion: MoveTo 335 (- ((ScriptID 20) y?) 10) self
					)
					((ScriptID 23)
						setMotion: MoveTo 335 ((ScriptID 23) y?) self
					)
				)
			)
			(13
				(if register
					(global5 eachElementDo: #show)
					(global2 drawPic: 120 -32759)
					(proc121_0)
					(= ticks 12)
				)
			)
			(14 (= ticks 6))
			(15 (proc0_9 gEgo theMan self))
			(16
				((ScriptID 19) dispose:)
				((ScriptID 20) dispose:)
				((ScriptID 23) dispose:)
				(= local29 1)
				(theMan startUpd:)
				(theWoman startUpd:)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
	)
)

(instance screamSound of Sound
	(properties
		flags $0001
		number 129
	)
)
