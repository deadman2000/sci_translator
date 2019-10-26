;;; Sierra Script 1.0 - (do not remove this comment)
(script# 185)
(include sci.sh)
(use n000)
(use n013)
(use n221)
(use n228)
(use n231)
(use n233)
(use n241)
(use n806)
(use n813)
(use n851)
(use n926)
(use n945)
(use n946)
(use n958)
(use n992)
(use n998)
(use n999)

(public
	sprite 0
	runFerIt 1
	spriteCaught 2
	bag 3
	dumpSprite 4
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	spriteX
	spriteY
	local8
	local9
	[local10 5] = [1185 4 1 2]
	[local15 6] = [1185 6 1 2 2]
	[local21 5] = [1185 9 1 2]
	[local26 5] = [1185 15 1 1]
	[local31 9] = [186 0 2 4 22 24 19 16 26]
	[local40 8] = [-1]
)
(instance sprite of Actor
	(properties
		yStep 5
		view 185
		signal $4000
		xStep 9
	)
	
	(method (dispose)
		(self setScript: 0)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if local1
					(proc13_4 1185 0 0)
				else
					(= local1 1)
					(gEgo setScript: lookSprite)
				)
			)
			(10
				((ScriptID 220 0) setScript: skewerSprite)
			)
			(4
				(if
					(and
						(== param2 4)
						(> global71 (global2 horizon?))
						(not (gEgo script?))
					)
					(gEgo setScript: (ScriptID 181 1) global70 global71)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (cue)
		((ScriptID 220 0) setScript: 0)
		(self dispose:)
	)
)

(instance funnySprite of PicView
	(properties)
	
	(method (init)
		(self
			view: (sprite view?)
			loop: (sprite loop?)
			cel: (sprite cel?)
			x: (sprite x?)
			y: (sprite y?)
		)
		(super init:)
	)
)

(instance bag of View
	(properties
		view 771
		loop 3
		cel 7
		signal $4000
	)
	
	(method (init)
		(super init:)
		(global2
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						(+ (bag x?) 11)
						(+ (bag y?) 5)
						(- (bag x?) 13)
						(+ (bag y?) 5)
						(- (bag x?) 21)
						(- (bag y?) 1)
						(- (bag x?) 11)
						(- (bag y?) 13)
						(+ (bag x?) 13)
						(- (bag y?) 13)
						(+ (bag x?) 21)
						(- (bag y?) 1)
					yourself:
				)
		)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (proc0_5 178)
					(proc13_4 1185 11 0)
				else
					(gEgo setScript: bagLook)
				)
			)
			(3 (gEgo setScript: easterEgg))
			(10 (proc13_4 1185 12 0))
			(4 (gEgo setScript: easterEgg))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance extraNet of Prop
	(properties
		view 188
		loop 4
		signal $4000
	)
	
	(method (init)
		(self posn: (sprite x?) (+ (sprite y?) 4))
		(super init:)
	)
)

(instance flash of View
	(properties
		view 245
		loop 1
		cel 5
		signal $4000
	)
	
	(method (init)
		(if (not (gEgo loop?))
			(self posn: (- (gEgo x?) 13) (gEgo y?))
		else
			(self posn: (+ (gEgo x?) 5) (gEgo y?))
		)
		(super init:)
	)
)

(instance runFerIt of Script
	(properties)
	
	(method (doit &tmp [temp0 4])
		(cond 
			(local3
				(= local3 0)
				(if (== (gEgo script?) 0) (proc0_4))
				(if
					(proc999_5
						global112
						19
						21
						23
						35
						50
						52
						65
						68
						82
						83
						85
						86
						89
						115
						121
						131
						133
						151
						154
					)
					(if (== (global2 picture?) 230)
						(proc233_0)
					else
						(proc228_0)
					)
				else
					(switch (global2 picture?)
						(220 (proc221_0))
						(230 (proc231_0))
						(240 (proc241_0))
					)
				)
				(if
					(and
						(not
							(proc999_5
								global112
								19
								21
								23
								35
								50
								52
								65
								68
								82
								83
								85
								86
								89
								115
								121
								131
								133
								151
								154
							)
						)
						(proc999_5
							global112
							21
							36
							37
							38
							50
							56
							67
							75
							98
							99
							103
							115
							119
							135
							167
						)
					)
					(proc926_0)
				)
			)
			(
				(and
					(< (sprite distanceTo: gEgo) 35)
					(not (> (sprite x?) 319))
					(not (< (sprite x?) 1))
					(not local2)
				)
				(= local2 1)
				(proc0_3)
				(gEgo setMotion: 0 ignoreActors: 1)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init:
								(+ (gEgo x?) 20)
								(gEgo y?)
								(+ (gEgo x?) 12)
								(+ (gEgo y?) 8)
								(- (gEgo x?) 12)
								(+ (gEgo y?) 8)
								(- (gEgo x?) 20)
								(gEgo y?)
								(- (gEgo x?) 12)
								(- (gEgo y?) 6)
								(+ (gEgo x?) 12)
								(- (gEgo y?) 6)
							yourself:
						)
				)
			)
			(
				(and
					(or
						(> (sprite distanceTo: gEgo) 30)
						(> (sprite x?) 319)
						(< (sprite x?) 1)
					)
					local2
				)
				(= local2 0)
				(if (global2 obstacles?)
					((global2 obstacles?) dispose:)
				)
				(global2 obstacles: 0)
				(gEgo ignoreActors: 0)
				(= local3 1)
			)
			(
				(and
					(or (== (sprite loop?) 4) (== (sprite loop?) 5))
					(== (sprite cel?) 3)
				)
				(if (== (sprite loop?) 4)
					(sprite setLoop: 0)
				else
					(sprite setLoop: 1)
				)
				(sprite setCycle: Walk)
				(= local0 (Random 10 25))
			)
			((not local0))
			((-- local0))
			((== (sprite loop?) 0) (sprite setLoop: 4 cel: 0))
			((== (sprite loop?) 2) (sprite setLoop: 5 cel: 0))
			(else (= local0 (Random 10 25)))
		)
		(super doit:)
	)
	
	(method (changeState newState &tmp temp0 temp1)
		(switch (= state newState)
			(0
				(proc958_0 128 185 188)
				(gEgo actions: noPuzzleBox)
				(proc0_6 37)
				(gSFX number: 901 loop: -1 play:)
				(= local0 (Random 10 25))
				(if (= local9 (Random 0 1))
					(sprite setLoop: 0)
					(= temp0 330)
					(= temp1 -10)
				else
					(sprite setLoop: 1)
					(= temp0 -10)
					(= temp1 330)
				)
				(sprite
					view: 185
					posn: temp1 (Random 80 180)
					setCycle: Walk
					init:
					setMotion: PolyPath temp0 (Random 100 200) self
				)
			)
			(1
				(if (proc0_5 104) (proc0_7 104))
				(gSFX stop:)
				(proc0_7 37)
				(if (proc0_5 218) ((ScriptID 181 1) cue:))
				(sprite dispose:)
				(= ticks 6)
			)
			(2 (dumpSprite doit:))
		)
	)
)

(instance spriteCaught of Script
	(properties)
	
	(method (doit)
		(cond 
			((and ((ScriptID 220 0) script?) (not local4)) 0)
			(local4
				(switch local8
					(1
						(if (<= (sprite y?) 83) (self cue:))
					)
					(4
						(if
							(or
								(>= (sprite x?) 319)
								(and
									(> (- (sprite x?) 100) (gEgo x?))
									(> (sprite x?) (gEgo x?))
								)
							)
							(self cue:)
						)
					)
					(3
						(if
							(or
								(>= (sprite y?) 189)
								(and
									(> (- (sprite y?) 50) (gEgo x?))
									(> (sprite y?) (gEgo y?))
								)
							)
							(self cue:)
						)
					)
					(else 
						(if
							(or
								(<= (sprite x?) 0)
								(and
									(< (- (sprite x?) 100) (gEgo x?))
									(< (sprite x?) (gEgo x?))
								)
							)
							(self cue:)
						)
					)
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(proc0_4)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(sprite
					setCycle: Walk
					setMotion: MoveTo global104 (- global105 10) self
				)
			)
			(1
				(proc0_9 gEgo sprite)
				(sprite
					setCycle: 0
					setMotion: 0
					setPri: (- ((ScriptID 181 2) priority?) 1)
					view: 188
					loop: 0
					cel: 2
				)
				(= ticks 24)
			)
			(2
				(sprite loop: 3 cel: 8)
				((ScriptID 181 2)
					view: 188
					loop: 5
					cel: 0
					posn: (sprite x?) (sprite y?)
				)
				(proc806_1 10)
				(extraNet init:)
				(= ticks 18)
			)
			(3
				(proc851_0 @local10 3 @local31 self)
			)
			(4
				(proc851_0 @local15 2 @local31 self)
			)
			(5
				(proc851_0 @local21 3 @local31 self)
			)
			(6
				((ScriptID 181 2) setCel: 2)
				(= ticks 12)
			)
			(7
				((ScriptID 181 2) setCycle: End self)
				(extraNet setCycle: End self)
			)
			(8
				(if (> (gEgo y?) 180)
					(gEgo setMotion: PolyPath (gEgo x?) 165)
				else
					(self cue:)
				)
			)
			(9
				((ScriptID 181 2) dispose: delete:)
				(extraNet dispose:)
				(gEgo ignoreActors: 1)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init:
								(+ (gEgo x?) 32)
								(gEgo y?)
								(+ (gEgo x?) 23)
								(+ (gEgo y?) 7)
								(- (gEgo x?) 28)
								(+ (gEgo y?) 7)
								(- (gEgo x?) 32)
								(gEgo y?)
								(- (gEgo x?) 28)
								(- (gEgo y?) 9)
								(+ (gEgo x?) 23)
								(- (gEgo y?) 9)
							yourself:
						)
				)
				(cond 
					(
						(or
							(== global112 18)
							(== global112 19)
							(== global112 20)
							(== global112 21)
							(== global112 22)
							(== global112 23)
							(== global112 33)
							(== global112 34)
							(== global112 35)
							(== global112 36)
							(== global112 37)
							(== global112 38)
							(== global112 39)
							(== global112 50)
							(== global112 51)
							(== global112 52)
							(== global112 53)
							(== global112 54)
							(== global112 67)
							(== global112 68)
							(== global112 69)
						)
						(sprite setLoop: 2)
						(= local8 3)
						(= spriteX (sprite x?))
						(= spriteY 240)
						(= local5 2)
					)
					(
						(or
							(== global112 49)
							(== global112 65)
							(== global112 66)
							(== global112 82)
							(== global112 83)
							(== global112 97)
							(== global112 98)
						)
						(sprite setLoop: 0)
						(= local8 4)
						(= spriteX 340)
						(= spriteY (sprite y?))
						(= local5 0)
					)
					(
						(or
							(== global112 99)
							(== global112 100)
							(== global112 101)
							(== global112 102)
							(== global112 114)
							(== global112 115)
							(== global112 116)
							(== global112 117)
							(== global112 118)
							(== global112 130)
							(== global112 131)
							(== global112 132)
							(== global112 133)
							(== global112 134)
							(== global112 135)
							(== global112 150)
							(== global112 166)
						)
						(sprite setLoop: 3)
						(= local8 1)
						(cond 
							((== (global2 picture?) 230)
								(if 21
									36
									37
									38
									50
									56
									67
									75
									98
									99
									103
									115
									119
									135
									167
									(= spriteX 139)
								else
									(= spriteX 180)
								)
							)
							(21
								36
								37
								38
								50
								56
								67
								75
								98
								99
								103
								115
								119
								135
								167
								(= spriteX 100)
							)
							(else (= spriteX 219))
						)
						(= spriteY 75)
					)
					(else
						(sprite setLoop: 1)
						(= local8 2)
						(= spriteX -20)
						(= spriteY (sprite y?))
						(= local5 1)
					)
				)
				(sprite
					view: 185
					signal: (| (sprite signal?) $2000)
					setPri: -1
					setCycle: Walk
					setMotion: PolyPath spriteX spriteY sprite
				)
				(= local4 1)
			)
			(10
				(gEgo setMotion: PolyPath spriteX (sprite y?) self)
				(= local4 0)
				(gSFX fade: 0 30 8 0)
			)
		)
	)
)

(instance skewerSprite of Script
	(properties)
	
	(method (changeState newState param2)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 159)
				(sprite
					setMotion: 0
					setCycle: 0
					view: 188
					setLoop: 2
					setCel: 3
				)
				(= ticks 6)
			)
			(1
				(gEgo setMotion: 0)
				(cond 
					(
						(or
							(<=
								(= param2
									(GetAngle (gEgo x?) (gEgo y?) (sprite x?) (sprite y?))
								)
								20
							)
							(> param2 340)
						)
						(gEgo setLoop: 3)
					)
					((<= param2 80) (gEgo setLoop: 6))
					((<= param2 100) (gEgo setLoop: 0))
					((<= param2 160) (gEgo setLoop: 4))
					((<= param2 200) (gEgo setLoop: 2))
					((<= param2 260) (gEgo setLoop: 5))
					((<= param2 280) (gEgo setLoop: 1))
					((<= param2 340) (gEgo setLoop: 7))
				)
				(gEgo view: 4 setCel: 0 setCycle: End self)
			)
			(2
				(gEgo view: 5 setCel: 0 setCycle: End self)
			)
			(3
				(gSFX number: 906 loop: 1 play:)
				(= ticks 6)
			)
			(4
				(bag posn: (sprite x?) (sprite y?) init:)
				(sprite dispose:)
				(= ticks 20)
			)
			(5
				(gSFX number: 213 loop: 1 play:)
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance easterEgg of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (< (gEgo x?) (bag x?))
					(gEgo
						setMotion: PolyPath (- (bag x?) 12) (+ (bag y?) 10) self
					)
				else
					(gEgo
						setMotion: PolyPath (+ (bag x?) 8) (+ (bag y?) 10) self
					)
				)
			)
			(1
				(gEgo
					view: 7
					setCel: 0
					setLoop: (if (< (gEgo x?) (bag x?)) 1 else 0)
					setCycle: CT 4 1 self
				)
			)
			(2
				(gEgo hide:)
				(proc0_6 178)
				(proc0_7 159)
				(bag hide:)
				(flash init:)
				(gSFX number: 216 loop: 1 play:)
				(if (global2 obstacles?)
					((global2 obstacles?) dispose:)
				)
				(global2 obstacles: 0)
				(= ticks 6)
			)
			(3
				(if
					(proc999_5
						global112
						19
						21
						23
						35
						50
						52
						65
						68
						82
						83
						85
						86
						89
						115
						121
						131
						133
						151
						154
					)
					(if (== (global2 curPic?) 230)
						(proc233_0)
					else
						(proc228_0)
					)
				else
					(switch (global2 curPic?)
						(220 (proc221_0))
						(230 (proc231_0))
						(240 (proc241_0))
					)
				)
				(if
					(and
						(not
							(proc999_5
								global112
								19
								21
								23
								35
								50
								52
								65
								68
								82
								83
								85
								86
								89
								115
								121
								131
								133
								151
								154
							)
						)
						(proc999_5
							global112
							21
							36
							37
							38
							50
							56
							67
							75
							98
							99
							103
							115
							119
							135
							167
						)
					)
					(proc926_0)
				)
				(proc0_6 179)
				(gEgo actions: egoShrimp)
				(gIconBar disable: 5 4 6 7)
				(flash dispose:)
				(proc0_2 2 67 67)
				(cond 
					((> (gEgo y?) 188)
						(if (< (gEgo x?) (bag x?))
							(gEgo posn: (+ (gEgo x?) 3) 188)
						else
							(gEgo posn: (- (gEgo x?) 10) 188)
						)
					)
					((< (gEgo x?) (bag x?)) (gEgo posn: (+ (gEgo x?) 3) (gEgo y?)))
					(else (gEgo posn: (- (gEgo x?) 10) (gEgo y?)))
				)
				(gEgo setCycle: Walk setStep: 6 4 show:)
				(bag dispose:)
				(= ticks 24)
			)
			(4
				(proc851_0 1 @local26 @local40 0 self)
			)
			(5
				(proc0_4)
				(gIconBar disable: 5 4 6 7)
				(self dispose:)
			)
		)
	)
)

(instance bagLook of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1185 13 self)
			)
			(1 (proc13_4 1185 14 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance lookSprite of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1185 1 self))
			(1 (proc13_4 1185 2 self))
			(2 (proc13_4 1185 3 self))
			(3 (self dispose:))
		)
	)
)

(instance egoShrimp of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1185 17 1) 1)
			(3 (proc13_4 1185 18 1) 1)
		)
	)
)

(instance noPuzzleBox of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 12))
				(proc13_4 1185 19 1)
				1
			else
				0
			)
		)
	)
)

(instance dumpSprite of Code
	(properties)
	
	(method (doit)
		(if (global5 contains: sprite)
			(global10 add: funnySprite)
			(funnySprite init:)
			(global10 doit:)
		)
		(gSFX stop:)
		((ScriptID 220 0) setScript: 0 cue:)
		(gEgo setScript: 0)
		(if (global5 contains: sprite)
			(sprite setScript: 0 dispose: delete:)
		)
		(if (global5 contains: bag) (bag dispose: delete:))
		(proc958_0 0 181 185)
	)
)
