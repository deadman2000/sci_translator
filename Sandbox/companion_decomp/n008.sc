;;; Sierra Script 1.0 - (do not remove this comment)
(script# 8)
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
	poach 1
	shootist 2
	poachScript 3
)

(local
	[local0 9] = [-1 8172 19]
	[local9 9] = [-1 8178 6]
	[local18 9] = [-1 8186 19]
	local27
	local28
	local29
	local30
	local31
	local32
	local33
	[local34 6] = [1008 0 1 2 3]
	[local40 11] = [1008 3 2 2 1 2 1 2 1 2]
	[local51 5] = [1008 11 1 2]
	[local56 4] = [1008 13 1]
	[local60 12] = [1008 14 1 2 1 2 1 2 2 3 2]
	[local72 12] = [1008 32 1 2 1 1 2 1 2 2 1]
	[local84 7] = [1008 41 1 2 1 2]
	[local91 4] = [1008 45 1]
	[local95 4] = [1008 31 1]
	[local99 4] = [1008 46 1]
	[local103 4] = [1008 47 1]
	[local107 4] = [1008 60 1]
	[local111 4] = [1008 49 1]
	[local115 5] = [1008 50 1 2]
	[local120 5] = [1008 52 2 1]
	[local125 4] = [1008 54 1]
	[local129 6] = [1008 24 2 1 2]
	[local135 4] = [1008 23 1]
	[local139 6] = [1008 55 2 1 3]
	[local145 5] = [1008 58 2 1]
	[local150 4] = [1008 27 1]
	[local154 6] = [1008 61 1 1 2]
	[local160 7] = [1008 64 2 1 3 2]
	[local167 4] = [1008 68 1]
	[local171 5] = [1008 69 2 1]
	[local176 9] = [1008 71 1 3 2 2 1 2]
	[local185 5] = [1008 84 1 2]
	[local190 5] = [1008 86 1 2]
	[local195 7] = [1008 88 1 2 2 2]
	[local202 4] = [1008 77 1]
	[local206 5] = [1008 78 1 2]
	[local211 9] = [1008 80 1 2 0 1008 48 1]
	[local220 11] = [1008 95 1 2 1 2 1 1 2 2]
	[local231 5] = [1008 103 1 1]
	[local236 8] = [1008 105 1 2 2 1 2]
)
(instance theMan of Actor
	(properties
		x 215
		y 60
		view 113
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
					(not local31)
					(closePoly onMe: gEgo)
				)
				(= local31 1)
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
				(2 (proc13_4 1008 28 1))
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
							(if local33
								(proc851_0 1 @local91 @local0 2)
							else
								(= local33 1)
								(proc851_0 2 @local84 2 2 @local0 3)
							)
						)
						((Wat charFirstTalk?) (proc851_0 1 @local91 @local0 2))
						(else
							(Wat charFirstTalk: 1)
							(proc851_0 3 @local72 2 2 @local0 3 @local9 2)
						)
					)
				)
				(4
					(switch param2
						(0
							(if (Wat gaveManBucks?)
								(proc13_4 1008 92 1)
								8
								0
							else
								(Wat gaveManBucks: 1)
								(gEgo setScript: buckTalk)
							)
						)
						(2
							(if (Wat offeredEmerald?)
								(proc13_4 1008 110 1)
							else
								(Wat offeredEmerald: 1)
								(gEgo setScript: offerEmerald)
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

(instance poach of Actor
	(properties
		x 226
		y 68
		view 113
		cel 2
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
		(if (== (Wat poachStatus?) 3)
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
		(if (!= (Wat poachStatus?) 2) (DisposeScript 8))
	)
	
	(method (doVerb theVerb param2)
		(if (& (poach signal?) $0020)
			((ScriptID 120 2) doVerb: theVerb &rest)
		else
			(switch theVerb
				(2
					(if (== (Wat poachStatus?) 0)
						(proc13_4 1008 29 1)
					else
						(proc13_4 1008 30 1)
					)
				)
				(3
					(if (== (Wat poachStatus?) 0)
						(proc0_3)
						(gEgo setMotion: PChase theMan 30)
					else
						(proc851_0 1 @local95 @local9 3)
					)
				)
				(5
					(if (== (Wat poachStatus?) 0)
						(gEgo setScript: iTrustYou)
					else
						(proc851_0 1 @local107 @local9 3)
					)
				)
				(10
					(if (!= (Wat poachStatus?) 2) (proc13_4 1008 113 1))
				)
				(4
					(if (== (Wat poachStatus?) 3)
						(switch param2
							(0
								(cond 
									(local27 (proc13_4 1008 93))
									((gMoney doit:) (= local27 1) (gEgo setScript: givePoacherBucks 0 0))
									(else (super doVerb: theVerb &rest))
								)
							)
							(2
								(if local28
									(proc13_4 1008 93 1)
								else
									(= local28 1)
									(gEgo setScript: givePoacherBucks 0 2)
								)
							)
							(else 
								(super doVerb: theVerb &rest)
							)
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
	)
)

(instance shootist of Prop
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

(instance poachScript of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(Wat setScript: 0)
				(closePoly init:)
				(gEgo actions: egoActions)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(theMan init: setCycle: CT 6 1 self)
				)
			)
			(1
				(theMan cel: 7)
				(poach
					init:
					setCycle: Walk
					setStep: 6 4
					setMotion: MoveTo 224 75 self
				)
				(= ticks 6)
			)
			(2
				(theMan view: 752 loop: 1 cel: 5 x: 207 y: 66 setPri: 3)
			)
			(3
				(poach loop: 4 cel: 0 setStep: 3 2 posn: 205 74)
				(= ticks 6)
			)
			(4
				(proc851_0 3 @local34 2 2 @local0 3 @local9 2 self)
			)
			(5
				(theMan cel: 0)
				(= ticks 12)
			)
			(6
				(theMan cel: 1)
				(poach cel: 1)
				(= ticks 12)
			)
			(7
				(theMan setCycle: CT 5 -1 self)
				(poach cel: 0)
			)
			(8
				(proc851_0 2 @local40 2 2 @local0 3 self)
			)
			(9
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
					(proc851_0 1 @local56 2 2 self)
				else
					(proc851_0 2 @local51 2 2 @local0 3 self)
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
				(shootist setCycle: CT 2 1 self)
			)
			(1
				(shootSound number: 906 play:)
				(shootist setCycle: CT 4 1 self)
				(gEgo view: 792 loop: 0 cel: 0 setCycle: End self)
			)
			(2
				(shootSound number: 907 play:)
				(theMan view: 752 loop: 0 cel: 0)
				(= ticks 60)
			)
			(3)
			(4
				(proc851_0 3 @local60 @local18 2 @local0 3 @local9 2 self)
			)
			(5 (gSFX stop:) (proc806_0))
		)
	)
)

(instance getBack of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(proc0_9 gEgo theMan self)
			)
			(1
				(if (== (++ local32) 3)
					(client setScript: poacherKilled)
				else
					(proc851_0 2 @local129 2 2 @local0 3 self)
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
				(= local31 0)
				(proc0_2)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance getYerMen of Script
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
				(poach stopUpd:)
				(self setScript: (ScriptID 5 1) self)
			)
			(1
				(Wat blewHorn: 1)
				(proc851_0 1 @local167 @local0 3 self)
			)
			(2
				(DisposeScript 5)
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
				(proc851_0 2 @local171 3 2 13 3 self)
			)
			(10
				(proc851_0 3 @local176 1 2 13 3 @local0 2 self)
			)
			(11
				(if register
					((ScriptID 19) dispose:)
					((ScriptID 20) dispose:)
					((ScriptID 23) dispose:)
					(global2 drawPic: 803 -32759)
					(global5 eachElementDo: #hide)
					(= ticks 30)
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
			(12
				(if register
					(global5 eachElementDo: #show)
					(global2 drawPic: 120 -32759)
					(proc121_0)
					(= ticks 12)
				)
			)
			(13 (= ticks 6))
			(14 (proc0_9 gEgo theMan self))
			(15
				((ScriptID 19) dispose:)
				((ScriptID 20) dispose:)
				((ScriptID 23) dispose:)
				(theMan startUpd:)
				(poach startUpd:)
				(= local30 1)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance poacherKilled of Script
	(properties)
	
	(method (dispose)
		(screamSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(theMan cycleSpeed: 12 setCycle: CT 1 1 self)
			)
			(1
				(theMan setCycle: CT 3 1 self)
				(poach cycleSpeed: 12 setCycle: CT 2 1)
			)
			(2
				(screamSound play:)
				(proc851_0 1 @local135 @local9 1 self)
			)
			(3
				(theMan setCycle: End)
				(poach setCycle: End self)
				(Wat poachStatus: 2)
			)
			(4
				(poach addToPic:)
				(proc806_1 -100)
				(proc851_0 1 @local150 2 2 self)
			)
			(5
				(client setScript: flunkyKilled)
			)
		)
	)
)

(instance flunkyKilled of Script
	(properties)
	
	(method (dispose)
		(shootSound dispose:)
		(if (& (poach signal?) $0020) (gSFX fade: 0 30 8 1))
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= register (global1 egoMoveSpeed?))
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
				(shootSound play:)
				(if (not (& (poach signal?) $0020))
					(poach view: 745 loop: 0 cel: 0)
				)
				(= ticks (/ (gEgo distanceTo: theMan) 4))
			)
			(4
				(gSFX stop:)
				(shootSound number: 907 play:)
				(global1 setSpeed: register)
				(theMan
					loop: 2
					cel: 0
					x: (+ (theMan x?) 3)
					setCycle: End self
				)
				(if (not (& (poach signal?) $0020))
					(poach setCycle: End)
				)
			)
			(5
				(theMan addToPic:)
				(proc0_2)
				(= ticks 60)
			)
			(6
				(gSFX
					number: (if (== (Wat poachStatus?) 2) 127 else 128)
					loop: -1
					play:
				)
				(if (== (Wat poachStatus?) 2)
					(proc0_6 153)
					(self setScript: (ScriptID 5 1) self)
				else
					(poach setCycle: Beg)
					(proc0_7 153)
					(Wat poachStatus: 1)
					(client setScript: savedThePoacher)
				)
			)
			(7
				(gEgo setMotion: MoveTo 140 115 self)
			)
			(8
				(DisposeScript 5)
				(proc0_9 gEgo theMan self)
			)
			(9 (= ticks 12))
			(10
				(self setScript: (ScriptID 125 1) self)
			)
			(11
				(= local29 1)
				(proc0_9 gEgo (ScriptID 19) self)
			)
			(12 (= ticks 12))
			(13
				(proc851_0 3 @local139 2 0 13 2 14 3 self)
			)
			(14
				(proc851_0 2 @local145 1 0 13 2 self)
			)
			(15 (= ticks 60))
			(16
				(global2 drawPic: 803 -32761)
				(gEgo loop: 4 cel: 0 posn: 160 95)
				(gEgoHead cel: 7 posn: 120 125)
				(proc0_2)
				(global5 eachElementDo: #hide)
				(= ticks 120)
			)
			(17
				(if (proc0_5 48)
					(proc806_6 0)
					(self dispose:)
					(global2 newRoom: 160)
				else
					((ScriptID 19) dispose:)
					((ScriptID 23) dispose:)
					((ScriptID 20) dispose:)
					(= local30 1)
					(global5 eachElementDo: #show)
					(global2 drawPic: 120 -32761)
					(proc121_0)
					(= ticks 12)
				)
			)
			(18
				(proc125_2)
				(proc0_4)
				(proc806_6 0)
				(self dispose:)
				(poach dispose:)
			)
		)
	)
)

(instance savedThePoacher of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= register (global1 egoMoveSpeed?))
				(proc851_0 1 @local111 @local9 3 self)
			)
			(1
				(gEgo
					setMotion: MoveTo (poach x?) (+ (poach y?) 4) self
				)
			)
			(2 (gEgo setHeading: 90 self))
			(3
				(gEgo view: 7 loop: 6 cel: 0 cycleSpeed: 18 setCycle: Fwd)
				(= ticks 60)
			)
			(4
				(proc851_0 2 @local115 3 2 @local9 3 self)
				(proc806_1 100)
			)
			(5
				(global1 setSpeed: register)
				(proc0_2)
				(poach view: 113 loop: 1 x: (+ (poach x?) 19))
				(gEgo
					setMotion: MoveTo (+ (gEgo x?) 45) (gEgo y?) self
				)
			)
			(6 (proc0_9 gEgo poach self))
			(7
				(proc851_0 2 @local120 1 2 @local9 3 self)
			)
			(8
				(poach stopUpd:)
				(gEgo setMotion: MoveTo 140 115 self)
			)
			(9
				(self setScript: (ScriptID 5 1) self)
			)
			(10 (= ticks 12))
			(11
				(DisposeScript 5)
				(gEgo stopUpd:)
				(self setScript: (ScriptID 125 1) self)
			)
			(12
				(= local29 1)
				(gEgo setMotion: 0)
				(proc0_9 gEgo (ScriptID 20) self)
			)
			(13 (= cycles 5))
			(14
				(proc851_0 2 @local154 3 2 13 3 self)
			)
			(15
				(proc851_0 3 @local160 1 2 13 3 15 2 self)
			)
			(16 (= ticks 60))
			(17
				(global10 eachElementDo: #dispose release:)
				(global2 drawPic: 803 -32761)
				(poach view: 113 posn: 190 105)
				(gEgo loop: 4 cel: 0 posn: 160 95)
				(gEgoHead cel: 7 posn: 120 125)
				(proc0_2)
				(global5 eachElementDo: #hide)
				(= ticks 120)
			)
			(18
				(closePoly dispose:)
				((ScriptID 19) dispose:)
				((ScriptID 23) dispose:)
				((ScriptID 20) dispose:)
				(= local30 1)
				(global5 eachElementDo: #show)
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(= ticks 12)
			)
			(19
				(proc851_0 1 @local125 @local9 3 self)
			)
			(20
				(Wat poachStatus: 3)
				(proc0_6 174)
				(poach
					setLoop: 3
					setCycle: Walk
					setMotion: MoveTo 20 240 self
				)
				(proc0_4)
				(proc806_6 1)
				(User canControl: 0)
				(gIconBar disable: 0 5)
			)
			(21
				(User canControl: 1)
				(gIconBar enable:)
				(if (proc0_5 48)
					(proc806_6 0)
					(self dispose:)
					(global2 newRoom: 160)
				else
					(proc0_3)
					(if (global2 script?) (global2 setScript: 0))
					(proc13_4 1008 112 self)
				)
			)
			(22
				(proc0_4)
				(proc125_2)
				(self dispose:)
				(proc806_6 0)
				(poach dispose:)
			)
		)
	)
)

(instance offerEmerald of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 130 100 self)
			)
			(1 (gEgo setHeading: 90 self))
			(2
				(gEgo
					view: 7
					loop: 4
					cel: 0
					cycleSpeed: 12
					setCycle: CT 4 1 self
				)
			)
			(3
				(proc851_0 2 @local220 1 2 @local0 3 self 0)
			)
			(4
				(proc851_0 1 @local231 2 2 self 1)
			)
			(5 (gEgo setCycle: Beg self))
			(6
				(proc0_2 6)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance buckTalk of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 2 @local185 1 2 @local0 3 self)
			)
			(1
				(proc851_0 2 @local190 3 2 @local0 3 self)
			)
			(2
				(proc851_0 2 @local195 1 2 @local0 3 self)
			)
			(3 (self dispose:))
		)
	)
)

(instance givePoacherBucks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(Load rsVIEW 7)
				(poach setLoop: 1 setMotion: 0)
				(proc0_3)
				(proc851_0 1 @local202 3 0 self)
			)
			(1
				(if (!= register 2) (proc806_1 50))
				(gEgo
					setMotion: MoveTo (- (poach x?) 22) (+ (poach y?) 3) self
				)
			)
			(2 (gEgo setHeading: 135 self))
			(3
				(global1 setSpeed: global141)
				(gEgo view: 7 loop: 4 cel: 0 setCycle: CT 3 1 self)
			)
			(4
				(if (== register 2)
					(proc851_0 2 @local236 1 0 @local9 1 self)
				else
					(proc851_0 2 @local206 3 0 @local9 1 self)
				)
			)
			(5
				(proc851_0 2 @local211 1 0 @local9 1 self)
			)
			(6 (gEgo setCycle: Beg self))
			(7
				(proc0_2)
				(global1 setSpeed: global157)
				(gEgo
					setMotion: MoveTo (- (gEgo x?) 25) (gEgo y?) self
				)
			)
			(8
				(poach setLoop: 3 setMotion: MoveTo 20 240 self)
				(if (> (gEgo y?) 188)
					(gEgo setMotion: MoveTo (+ (gEgo x?) 20) 178 self)
				else
					(self cue:)
				)
				(proc0_4)
				(User canControl: 0)
				(gIconBar disable: 0 5)
				(proc806_6 1)
			)
			(9 (gEgo setHeading: 225))
			(10 (proc13_4 1008 112 self))
			(11
				(self dispose:)
				(if (proc0_5 48)
					(global2 newRoom: 160)
				else
					(proc0_4)
					(proc806_6 0)
					(poach dispose:)
				)
			)
		)
	)
)

(instance iTrustYou of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 1 @local99 @local9 3 self)
			)
			(1
				(theMan cel: 0)
				(= ticks 12)
			)
			(2
				(theMan cel: 1)
				(poach cel: 1)
				(= ticks 12)
			)
			(3
				(theMan setCycle: CT 5 -1 self)
				(poach cel: 0)
			)
			(4
				(proc851_0 1 @local103 @local0 3 self)
			)
			(5
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (and (== theVerb 4) (== param2 1))
			(cond 
				((or local30 (Wat blewHorn?))
					(switch (Wat poachStatus?)
						(0 (proc13_4 1008 82 1) 1)
						(else  (proc13_4 1008 83 1) 1)
					)
				)
				((== (Wat poachStatus?) 1) (proc13_4 1008 94 1))
				((and (not local29) (== (Wat poachStatus?) 0)) (gEgo setScript: getYerMen))
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

(instance screamSound of Sound
	(properties
		flags $0001
		number 932
	)
)
