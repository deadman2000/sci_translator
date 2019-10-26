;;; Sierra Script 1.0 - (do not remove this comment)
(script# 26)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n951)
(use n958)
(use n969)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	jew 0
	jewScript 1
)

(local
	[local0 9] = [-1 6170 15]
	[local9 9] = [135 0 2 4 14 36 14 27 15]
	local18 =  10
	local19
	local20
	local21
	local22
	local23
	local24
	local25
	[local26 10] = [1026 0 1 2 1 2 1 2 2]
	[local36 4] = [1026 7 1]
	[local40 5] = [1026 10 2 1]
	[local45 7] = [1026 12 1 2 1 2]
	[local52 7] = [1026 16 1 2 1 2]
	[local59 5] = [1026 20 1 2]
	[local64 5] = [1026 22 1 2]
	[local69 14] = [1026 24 1 2 1 2 2 1 2 2 1 2 2]
	[local83 6] = [1026 35 1 2 2]
	[local89 6] = [1026 38 1 2 2]
	[local95 7] = [1026 41 2 2 1 2]
	[local102 5] = [1026 45 1 2]
	[local107 5] = [1026 47 1 2]
	[local112 5] = [1026 49 1 2]
	[local117 4] = [1026 51 1]
	[local121 5] = [1026 52 1 2]
	[local126 4] = [1026 54 1]
	[local130 4] = [1026 71 1]
	[local134 7] = [1026 72 1 2 1 2]
	[local141 8] = [1026 55 1 2 1 2 1]
	[local149 9] = [1026 60 2 2 1 2 1 2]
	[local158 4] = [1026 66 1]
	[local162 4] = [1026 67 1]
	[local166 5] = [1026 68 2 1]
	[local171 4] = [1026 70 1]
	[local175 5] = [1026 77 1 2]
	[local180 6] = [1026 79 1 2 1]
	[local186 13] = [1026 82 1 1 1 2 2 1 2 1 2 1]
	[local199 9] = [1026 92 2 2 1 2 1 1]
	[local208 4] = [1026 98 1]
	[local212 6] = [1026 99 2 2 1]
	[local218 9] = [1026 102 1 2 2 2 1 2]
	[local227 6] = [1026 108 1 2 1]
	[local233 11] = [1026 111 1 2 2 2 1 1 2 1]
	[local244 6] = [1026 119 2 1 2]
	[local250 6] = [1026 122 1 2 1]
	[local256 5] = [1026 125 1 2]
	[local261 6] = [1026 127 1 1 2]
	[local267 7] = [1026 130 1 2 1 2]
	[local274 9] = [1026 134 1 2 1 1 2 1]
	[local283 12] = [1026 140 2 2 1 2 2 1 1 3 3]
)
(procedure (localproc_0012)
	(if local22
		(proc851_0 1 @local36 @local9 3)
	else
		(= local22 1)
		(proc851_0 @local26 1 @local9)
	)
)

(instance jew of Actor
	(properties
		description 6182
		view 134
		signal $2800
	)
	
	(method (init)
		(gSFX number: 125 loop: -1 play:)
		(super init:)
	)
	
	(method (doit &tmp temp0 temp1)
		(= temp1 (GetAngle x y (gEgo x?) (gEgo y?)))
		(= temp0 (Abs (- temp1 heading)))
		(cond 
			(
			(and (== (gEgo edgeHit?) 1) (not (Wat script?))) (Wat setScript: (Wat theTimer?)))
			((proc0_5 110)
				(if (>= (++ local20) 5)
					(= local20 1)
					(proc0_7 110)
					(proc851_0 @local40 3 @local9)
				)
			)
			(
				(and
					(not local18)
					(not mover)
					(== loop 4)
					(> temp0 30)
				)
				(= cel
					(cond 
						((>= temp1 338) 3)
						((>= temp1 293) 7)
						((>= temp1 248) 1)
						((>= temp1 203) 5)
						((>= temp1 158) 2)
						((>= temp1 113) 4)
						((>= temp1 68) 0)
						((>= temp1 23) 6)
						(else 3)
					)
				)
			)
			(local18 (-- local18))
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX fade: 0 30 8 1)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(Wat weMeetAgain: (+ (Wat weMeetAgain?) 1))
		(super dispose:)
		(self delete:)
		(DisposeScript 26)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1026 8))
			(5
				(if (Wat charFirstTalk?)
					(proc851_0 @local64 1 @local9)
				else
					(Wat charFirstTalk: 1)
					(gEgo setScript: talkScript)
				)
			)
			(10 (gEgo setScript: threat))
			(4
				(if (proc999_5 param2 0 2 14 18 10 4 1 16 12)
					(gEgo setScript: approachJeweler 0 param2)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(3 (gEgo setScript: jewSearch))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance jewScript of Script
	(properties)
	
	(method (dispose)
		(gEgo actions: egoActions)
		(proc0_4)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 7)
				(Wat setScript: 0)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(if (not (global5 contains: jew)) (jew init:))
					(jew
						posn: 235 50
						setCycle: Walk
						setMotion: MoveTo 205 70 self
					)
				)
			)
			(1
				(jew ignoreActors: 1 setLoop: 4 cel: 5)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 225 58 226 77 204 82 182 77 182 58 205 52
							yourself:
						)
				)
				(proc0_2)
				(= ticks 18)
			)
			(2
				(self setScript: firstMeet self)
			)
			(3 (self dispose:))
		)
	)
)

(instance repeatEncounter of TScript
	(properties)
	
	(method (dispose)
		(proc0_4)
		(gIconBar disable: 5)
		(gEgo actions: egoActions)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 225 58 226 77 204 82 182 77 182 58 205 52
							yourself:
						)
				)
				(if (== (Wat weMeetAgain?) 1)
					(proc851_0 @local95 3 @local9 self 0)
				else
					(proc851_0 @local112 3 @local9 self)
				)
			)
			(2
				(if (== (Wat weMeetAgain?) 1)
					(proc851_0 @local102 1 @local9 self 0)
				else
					(self dispose:)
				)
			)
			(3
				(proc851_0 @local107 3 @local9 self 1)
			)
			(4 (self dispose:))
		)
	)
)

(instance approachJeweler of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
				(and (!= (gEgo x?) local24) (!= (gEgo y?) local25))
					(= local24 (- (jew x?) 20))
					(= local25 (+ (jew y?) 10))
					(gEgo setMotion: PolyPath local24 local25 self)
				else
					(self cue:)
				)
			)
			(1
				(if (!= (gEgo loop?) 6)
					(proc0_9 gEgo jew self)
				else
					(self cue:)
				)
			)
			(2 (= ticks 12))
			(3
				(switch register
					(999 0)
					(1
						(proc851_0 1 @local117 @local9 3)
					)
					(0
						(if (gMoney doit:)
							(gMoney put:)
							(if local19
								(proc851_0 1 @local126 @local9 3)
							else
								(= local19 1)
								(proc851_0 @local121 1 @local9)
							)
						)
					)
					(2
						(proc851_0 @local141 1 @local9)
					)
					(14
						(if local21
							(proc851_0 1 @local158 @local9 3)
						else
							(= local21 1)
							(proc851_0 @local149 1 @local9)
						)
					)
					(12
						(proc851_0 1 @local162 @local9 3)
					)
					(10 (localproc_0012))
					(18 (localproc_0012))
					(16
						(if local23
							(proc851_0 1 @local171 @local9 3)
						else
							(proc851_0 @local166 1 @local9)
							(= local23 1)
						)
					)
					(4
						(proc851_0 @local175 1 @local9)
					)
				)
				(if (== register 2)
					(client setScript: spentEmerald)
				else
					(proc0_4)
					(self dispose:)
				)
			)
		)
	)
)

(instance spentEmerald of TScript
	(properties)
	
	(method (dispose)
		(proc806_6 0)
		(gSFX fade:)
		(super dispose:)
		(jew dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: (ScriptID 5 1) self)
			)
			(1
				(gSFX number: 127 loop: -1 play:)
				(= ticks 60)
			)
			(2
				(gEgo put: 2)
				(jew loop: 2 cel: 0 posn: 188 50 cycleSpeed: 12)
				(= global126 2)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(proc0_2)
				(gEgo get: 7 8 loop: 7 cel: 0 posn: 219 70)
				(gEgoHead posn: 219 70 cel: 1)
				(ScriptID 23)
				(ScriptID 20)
				((ScriptID 23) view: 155 loop: 1 posn: 265 75 init:)
				((ScriptID 20) view: 161 loop: 1 posn: 250 95 init:)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32762)
				(= ticks 120)
			)
			(3
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(global5 eachElementDo: #show)
				(= ticks 18)
			)
			(4
				(jew cycleSpeed: 24 setCycle: End)
				(= ticks 240)
			)
			(5
				(= notKilled 1)
				(proc851_0 2 @local212 4 2 @local0 2 self)
			)
			(6 (= ticks 30))
			(7
				(proc851_0 2 @local218 4 2 @local0 2 self)
			)
			(8
				(proc851_0 @local227 4 14 self)
			)
			(9
				(proc806_1 -200)
				(global2 drawPic: 803 -32762)
				(proc0_2 2)
				(gEgo posn: 175 90)
				(gEgoHead posn: 175 90 cel: 6)
				((ScriptID 20) dispose:)
				(jew z: 1000)
				((ScriptID 23) dispose:)
				(global5 eachElementDo: #hide)
				(= seconds 3)
			)
			(10
				(global2 drawPic: 120 -32761)
				(proc0_6 152)
				(proc0_6 113)
				(proc121_0)
				(proc125_2)
				(proc0_2)
				(global5 eachElementDo: #show)
				(= ticks 60)
			)
			(11 (proc0_4) (self dispose:))
		)
	)
)

(instance jewSearch of Script
	(properties)
	
	(method (dispose)
		(if (Wat secondSearch?) (gSFX fade:))
		(super dispose:)
		(if (Wat secondSearch?)
			(jew dispose:)
		else
			(Wat secondSearch: 1)
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: approachJeweler self 999)
			)
			(1
				(proc0_3)
				(= local24 (- (jew x?) 17))
				(= local25 (+ (jew y?) 3))
				(gEgo setMotion: MoveTo local24 local25 self)
			)
			(2
				(global1 setSpeed: global141)
				(gEgo view: 7 setLoop: 6 setCel: 0 setCycle: CT 2 1 self)
			)
			(3
				(jew setLoop: 1 setCel: 1 setCycle: End)
				(gEgo setCycle: CT 5 1 self)
			)
			(4
				(if (Wat secondSearch?)
					(proc851_0 @local244 1 @local9 self)
				else
					(self cue:)
				)
			)
			(5
				(gEgo setCycle: End)
				(= seconds 2)
			)
			(6
				(jew loop: 4 cel: 5)
				(= ticks 12)
			)
			(7
				(if (Wat secondSearch?)
					(proc851_0 @local250 1 @local9 self)
				else
					(proc851_0 @local233 1 @local9 self)
				)
			)
			(8
				(proc0_2 6)
				(global1 setSpeed: global157)
				(gEgo
					setCycle: Rev
					setLoop: (gEgo loop?)
					setMotion: MoveFwd (if (Wat secondSearch?) -12 else -24) self
				)
			)
			(9 (proc0_2 6) (= ticks 30))
			(10
				(if (Wat secondSearch?)
					(proc851_0 @local256 1 @local9 self 0)
				else
					(proc0_2)
					(proc0_4)
					(gIconBar disable: 5)
					(self dispose:)
				)
			)
			(11
				(proc851_0 @local261 3 @local9 self 0)
			)
			(12
				(proc851_0 @local267 1 @local9 self 0)
			)
			(13
				(proc851_0 @local274 3 @local9 self)
			)
			(14
				(self setScript: (ScriptID 5 1) self)
			)
			(15 (= seconds 2))
			(16
				(jew loop: 2 cel: 0 cycleSpeed: 18 posn: 188 50)
				(= global126 2)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(proc0_2)
				(gEgo get: 7 8 loop: 7 cel: 0 posn: 219 70)
				(gEgoHead posn: 219 70 cel: 1)
				(ScriptID 23)
				(ScriptID 19)
				((ScriptID 19) view: 152 loop: 1 posn: 265 75 init:)
				((ScriptID 23) view: 155 loop: 1 posn: 250 95 init:)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32762)
				(= seconds 3)
			)
			(17
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(global5 eachElementDo: #show)
				(= seconds 2)
			)
			(18
				(jew setCycle: CT (- (jew lastCel:) 1) 1)
				(= seconds 3)
			)
			(19
				(jew cel: (jew lastCel:))
				(= ticks 18)
			)
			(20
				(proc851_0 3 @local283 4 2 @local0 2 13 3 self)
				(gSFX number: 128 loop: -1 play:)
			)
			(21
				(global2 drawPic: 803 -32762)
				(proc0_2 2)
				(gEgo posn: 175 90)
				(gEgoHead posn: 175 90 cel: 6)
				((ScriptID 19) dispose:)
				((ScriptID 23) dispose:)
				(global5 eachElementDo: #hide)
				(= seconds 3)
			)
			(22
				(global2 drawPic: 120 -32761)
				(proc0_6 152)
				(proc0_6 113)
				(proc125_2)
				(proc0_2)
				(global5 eachElementDo: #show)
				(proc806_1 100)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance tryHorn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= gGEgoLoop (gEgo loop?))
				(gEgo
					view: 10
					setLoop: (if (proc999_5 (gEgo loop?) 2 4 0 6) 0 else 1)
					setCel: 0
					cycleSpeed: 12
					setCycle: CT 3 1 self
				)
			)
			(1
				(proc851_0 1 @local130 @local9 3 self)
			)
			(2 (gEgo setCycle: Beg self))
			(3
				(Wat blewHorn: 1)
				(gEgo cycleSpeed: 6)
				(proc0_2 gGEgoLoop)
				(= ticks 18)
			)
			(4
				(proc851_0 @local134 1 @local9 self)
			)
			(5
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance threat of Script
	(properties)
	
	(method (doit)
		(if
			(and
				(== ((ScriptID 23) cel?) 4)
				(not (spankSound handle?))
			)
			(spankSound play:)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX fade:)
		(spankSound dispose:)
		(proc0_6 113)
		(proc125_2)
		((ScriptID 19) dispose:)
		((ScriptID 23) dispose:)
		(global1 setSpeed: register)
		(super dispose:)
		(jew dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc806_6 0)
				(proc0_3)
				(= register (global1 egoMoveSpeed?))
				(global1 setSpeed: global141)
				(threatSound init:)
				(if (< (gEgo distanceTo: jew) 30)
					(gEgo
						setHeading:
							(mod
								(+
									(GetAngle (gEgo x?) (gEgo y?) (jew x?) (jew y?))
									180
								)
								360
							)
							self
					)
				else
					(self cue:)
				)
			)
			(1
				(if (< (gEgo distanceTo: jew) 30)
					(gEgo setMotion: MoveFwd 30 self)
				else
					(self cue:)
				)
			)
			(2 (proc0_9 gEgo jew self))
			(3
				(gEgo view: 4 setCel: 0 setCycle: End self)
			)
			(4
				(threatSound play:)
				(= ticks 48)
			)
			(5
				(proc851_0 @local180 2 @local9 self)
			)
			(6
				(gSFX number: 127 loop: -1 play:)
				(ScriptID 23)
				(ScriptID 19)
				(proc958_0 128 152 155 168)
				(jew view: 134 setLoop: 3 setCel: 0 posn: 90 150)
				(= global126 2)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(gEgo get: 7 8 loop: 6 cel: 0 posn: 64 167)
				(gEgoHead posn: 64 167 cel: 2)
				(proc0_2)
				((ScriptID 19)
					view: 152
					loop: 2
					ignoreActors: 1
					posn: 108 139
					init:
				)
				((ScriptID 23)
					view: 168
					loop: 1
					cel: 1
					ignoreActors: 1
					posn: 125 146
					init:
				)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32762)
				(= seconds 3)
			)
			(7
				(threatSound stop: dispose:)
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(global5 eachElementDo: #show)
				(= ticks 120)
			)
			(8
				(proc851_0 2 @local186 4 0 @local0 0 self)
			)
			(9 (= ticks 60))
			(10
				((ScriptID 23) cel: 2)
				(= ticks 6)
			)
			(11
				((ScriptID 23) setCycle: CT 1 1 self)
			)
			(12 (= ticks 18))
			(13
				(proc851_0 2 @local199 4 0 @local0 0 self)
			)
			(14 (= ticks 60))
			(15
				(gEgo setMotion: MoveTo 0 250)
				(= ticks 120)
			)
			(16
				(jew setCycle: End)
				(= ticks 90)
			)
			(17
				(proc851_0 1 @local208 @local0 0 self)
			)
			(18 (jew setCycle: Beg self))
			(19 (= ticks 12))
			(20
				(proc806_1 -100)
				(if (== (Wat section?) 9)
					(global2 newRoom: 100)
				else
					(self dispose:)
				)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (and (proc0_5 34) local20) (proc13_4 1026 9))
			)
			(4
				(if (== param2 1)
					(if (Wat blewHorn?)
						(proc13_4 1026 76)
					else
						(gEgo setScript: tryHorn)
						1
					)
				)
			)
		)
	)
)

(instance talkScript of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 @local45 1 @local9 self 0)
			)
			(1
				(proc851_0 @local52 1 @local9 self 0)
			)
			(2
				(proc851_0 @local59 1 @local9 self 1)
			)
			(3 (self dispose:))
		)
	)
)

(instance firstMeet of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 @local69 3 @local9 self 0)
			)
			(1
				(proc851_0 @local83 1 @local9 self 0)
			)
			(2
				(proc851_0 @local89 3 @local9 self 1)
			)
			(3 (self dispose:))
		)
	)
)

(instance threatSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)

(instance spankSound of Sound
	(properties
		flags $0001
		number 153
	)
)
