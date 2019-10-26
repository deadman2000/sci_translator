;;; Sierra Script 1.0 - (do not remove this comment)
(script# 5)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n945)
(use n961)
(use n974)
(use n977)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	blowArbitrator 0
	blowinIt 1
)

(local
	local0
	local1
	[local2 4] = [-17 -20 -23 -27]
	[local6 4] = [-44 -43 -41 -39]
	[local10 4] = [19 20 24 28]
	[local14 4] = [-50 -50 -48 -47]
	local18
	[local19 15] = [1005 10 1 2 1 2 2 2 1 0 1005 17 1 1]
	[local34 6] = [1005 18 1 2 2]
	[local40 7] = [1005 21 1 2 2 2]
	[local47 6] = [1005 25 1 2 2]
	[local53 12] = [1005 28 2 1 2 0 1005 31 2 1 2]
	[local65 9] = [1005 34 1 2 2 1 2 2]
	[local74 6] = [1005 40 2 1 2]
	[local80 4] = [1005 43 1]
	[local84 5] = [1005 44 2 1]
	[local89 5] = [1005 0 1 1]
	[local94 6] = [1005 46 2 1 2]
	[local100 5] = [1005 49 1 1]
	[local105 5] = [1005 51 1 1]
	[local110 4] = [1005 53 1]
	local114
	local115
	local116
	local117
)
(instance hornSound of Sound
	(properties
		flags $0001
		number 904
	)
)

(instance blowinIt of Script
	(properties)
	
	(method (doit)
		(if
			(and
				(proc999_5 (gRgnMusic number?) 585 160 905)
				(== (gEgo view?) 10)
			)
			(gRgnMusic setVol: 0)
			(gRgnMusic fade: 127 30 8 0)
		)
		(super doit:)
	)
	
	(method (dispose &tmp temp0)
		(hornSound dispose:)
		(= temp0 0)
		(if
			(not
				(proc999_5
					client
					blowArbitrator
					summonWill
					willEnters
					campWillComes
				)
			)
			(= temp0 1)
		)
		(= register 1)
		(super dispose: &rest)
		(if temp0 (DisposeScript 5))
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if
					(not
						(if (== client blowArbitrator)
						else
							(== client summonWill)
						)
					)
					(= local0 global143)
					(proc0_3)
				)
				(= gGEgoLoop (gEgo loop?))
				(gEgo
					view: 10
					setCel: 0
					setLoop:
						(if
							(or
								(== (gEgo loop?) 2)
								(== (gEgo loop?) 4)
								(== (gEgo loop?) 0)
								(== (gEgo loop?) 6)
							)
							0
						else
							1
						)
					setCycle: End self
				)
			)
			(1
				(if (and (not (Random 0 50)) (!= global11 120))
					(bubble init: setScript: tinyBubbles)
				)
				(hornSound play:)
				(= seconds 5)
			)
			(2 (= ticks 30))
			(3 (gEgo setCycle: Beg self))
			(4
				(proc0_2 gGEgoLoop 0 1)
				(proc0_6 148)
				(if
					(and
						(not
							(if (== client blowArbitrator)
							else
								(== client summonWill)
							)
						)
						(not local0)
					)
					(proc0_4)
				)
				(self dispose:)
			)
		)
	)
)

(instance blowArbitrator of Script
	(properties)
	
	(method (init)
		(proc0_3)
		(super init: &rest)
	)
	
	(method (dispose)
		(proc0_4)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if
					(proc999_5
						global11
						450
						440
						350
						390
						270
						280
						290
						300
						310
						452
						455
						460
						470
						480
						530
						550
						560
						561
						562
						570
					)
					(proc13_4 1005 3)
					(self dispose:)
				else
					(= local0 global143)
					(proc0_3)
					(= ticks 6)
				)
			)
			(1
				(cond 
					(
						(and
							(== global11 220)
							(== global112 2)
							(== 2 3)
							(== 3 4)
							(== 4 5)
							(== 5 6)
							(== 6 7)
							(== 7 17)
							(== 17 24)
							(== 24 25)
							(== 25 26)
							(== 26 27)
							(== 27 32)
							(== 32 43)
							(== 43 48)
							(== 48 60)
							(== 60 64)
							(== 64 76)
							(== 76 81)
							(== 81 91)
							(== 91 97)
							(== 97 107)
							(== 107 113)
							(== 113 123)
							(== 123 129)
							(== 129 139)
							(== 139 146)
							(== 146 147)
							(== 147 148)
							(== 148 149)
							(== 149 156)
							(== 156 168)
							(== 168 169)
							(== 169 170)
							(== 170 171)
							(== 171 182)
							(== 182 183)
						)
						(proc13_4 1005 55 self)
					)
					((and (== global130 2) (proc0_5 182)) (gEgo setMotion: PolyPath 160 165 self))
					(
					(and (== global130 1) (proc974_0 {Tuck} global5))
						(if (== global160 0)
							(self setScript: blowinIt self)
						else
							(proc13_4 1005 2 self)
						)
					)
					((and (== global130 5) (not (proc0_5 25)))
						(cond 
							((not (proc0_5 111)) (self setScript: blowinIt self))
							((and (>= global150 1) (not (proc0_5 147))) (proc13_4 1005 17 self))
							((>= global160 1) (proc13_4 1005 17 self))
							(else (self setScript: summonWill self))
						)
					)
					((and (== global130 5) (proc0_5 25))
						(cond 
							((>= global142 3) (self dispose:))
							((and (>= global160 1) (== global142 0)) (proc13_4 1005 17 self))
							((and (>= global150 1) (not (proc0_5 55))) (proc13_4 1005 17 self))
							((not (proc0_5 111)) (proc13_4 1005 17 self))
							(else (self setScript: summonWill self))
						)
					)
					((and (== global130 6) (not (proc0_5 25)))
						(cond 
							((>= global142 3) (self dispose:))
							((and (>= global160 1) (== global142 0)) (proc13_4 1005 17 self))
							((and (>= global150 1) (not (proc0_5 55))) (proc13_4 1005 17 self))
							(else (self setScript: summonWill self))
						)
					)
					((and (== global130 6) (proc0_5 25)) (self setScript: summonWill self))
					((== global130 9)
						(if (proc0_5 36)
							(self setScript: summonWill self)
						else
							(proc13_4 1005 7 self)
						)
					)
					((== global130 10) (self setScript: summonWill self))
					((== global130 11)
						(if (== global150 0)
							(self setScript: summonWill self)
						else
							(self setScript: blowinIt self)
						)
					)
					((== global130 12)
						(if (proc0_5 38)
							(self setScript: summonWill self)
						else
							(proc13_4 1005 8 self)
						)
					)
					((== global130 13) (self setScript: blowinIt self))
					(else (self setScript: summonWill self))
				)
			)
			(2
				(cond 
					(
						(and
							(== global11 220)
							(== global112 2)
							(== 2 3)
							(== 3 4)
							(== 4 5)
							(== 5 6)
							(== 6 7)
							(== 7 17)
							(== 17 24)
							(== 24 25)
							(== 25 26)
							(== 26 27)
							(== 27 32)
							(== 32 43)
							(== 43 48)
							(== 48 60)
							(== 60 64)
							(== 64 76)
							(== 76 81)
							(== 81 91)
							(== 91 97)
							(== 97 107)
							(== 107 113)
							(== 113 123)
							(== 123 129)
							(== 129 139)
							(== 139 146)
							(== 146 147)
							(== 147 148)
							(== 148 149)
							(== 149 156)
							(== 156 168)
							(== 168 169)
							(== 169 170)
							(== 170 171)
							(== 171 182)
							(== 182 183)
						)
						(self dispose:)
					)
					(
					(and (== global130 1) (proc974_0 {Tuck} global5))
						(if (== global160 0)
							(++ global160)
							(proc851_0 1 @local89 15 1 self)
						else
							(++ global160)
							(self dispose:)
						)
					)
					(
						(and
							(== global130 5)
							(not (proc0_5 25))
							(not (proc0_5 111))
						)
						(proc13_4 1005 54 self)
					)
					((and (== global130 5) (proc0_5 25))
						(if (proc999_5 global142 1 2)
							(self setScript: blowinIt self)
						else
							(self dispose:)
						)
					)
					((and (== global130 6) (not (proc0_5 25)))
						(if (and (>= 2 global142) (>= global142 1))
							(self setScript: blowinIt self)
						else
							(self dispose:)
						)
					)
					((== global130 10)
						(if (== global159 2)
							(if (== global11 220) (proc0_6 176))
							(global2 newRoom: 171)
						else
							(self setScript: blowinIt self)
						)
					)
					((== global130 11)
						(if (== global11 220) (proc0_6 176))
						(global2 newRoom: 171)
					)
					((== global130 13)
						(if (== global11 220) (proc0_6 176))
						(global2 newRoom: 171)
					)
					(else (self dispose:))
				)
			)
			(3
				(cond 
					((and (== global130 5) (not (proc0_5 25))) (self dispose:))
					((and (== global130 6) (not (proc0_5 25)))
						(if (== global11 220) (proc0_6 176))
						(global2 newRoom: 171)
					)
					((and (== global130 5) (proc0_5 25))
						(if (== global11 220) (proc0_6 176))
						(global2 newRoom: 171)
					)
					((== global130 10)
						(if (== global11 220) (proc0_6 176))
						(global2 newRoom: 171)
					)
					(else (self dispose:))
				)
			)
			(4 (self dispose:))
		)
	)
)

(instance summonWill of Script
	(properties)
	
	(method (init)
		(= local1 0)
		(super init: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc999_5 global11 220 180 250)
					(self setScript: willEnters self)
				else
					(self setScript: campWillComes self)
				)
			)
			(1
				(cond 
					((and (== global130 5) (not (proc0_5 25)))
						(cond 
							((and (proc0_5 147) (== global160 0))
								(= global160 (+ global160 1))
								(proc851_0 2 @local19 1 1 14 0 self)
							)
							((and (proc0_5 111) (== global150 0))
								(= global150 (+ global150 1))
								(proc851_0 2 @local34 1 1 14 0 self)
							)
							(else (self dispose:))
						)
					)
					((and (== global130 5) (proc0_5 25))
						(cond 
							((proc999_5 global142 1 2)
								(= global160 (+ global160 1))
								(= local1 1)
								(proc851_0 2 @local53 1 1 14 0 self)
							)
							((and (== global142 0) (!= global160 0))
								(= global160 (+ global160 1))
								(proc851_0 2 @local47 1 1 14 0 self)
							)
							((and (proc0_5 55) (== global160 0))
								(= global160 (+ global160 1))
								(proc851_0 2 @local47 1 1 14 0 self)
							)
							((and (proc0_5 111) (== global150 0))
								(= global150 (+ global150 1))
								(proc851_0 2 @local34 1 1 14 0 self)
							)
							(else (self dispose:))
						)
					)
					((and (== global130 6) (not (proc0_5 25)))
						(cond 
							((not (proc0_5 55))
								(= global150 (+ global150 1))
								(proc851_0 2 @local40 1 1 14 0 self)
							)
							((and (>= 2 global142) (>= global142 1))
								(= global160 (+ global160 1))
								(= local1 1)
								(proc851_0 2 @local53 1 1 14 0 self)
							)
							((== global142 0)
								(= global160 (+ global160 1))
								(proc851_0 2 @local47 1 1 14 0 self)
							)
							(else (= global160 (+ global160 1)) (self dispose:))
						)
					)
					((and (== global130 6) (proc0_5 25))
						(switch global150
							(0
								(= global150 (+ global150 1))
								(proc851_0 2 @local94 1 1 14 0 self)
							)
							(1
								(= global150 (+ global150 1))
								(proc851_0 1 @local100 14 0 self)
							)
							(2
								(= global150 (+ global150 1))
								(proc851_0 1 @local105 14 0 self)
							)
							(else 
								(= global150 (+ global150 1))
								(proc851_0 1 @local110 14 0 self)
							)
						)
					)
					((== global130 10)
						(++ global160)
						(switch global159
							(0
								(= local1 1)
								(proc851_0 2 @local65 1 1 14 0 self)
							)
							(1
								(= local1 1)
								(proc851_0 2 @local74 1 1 14 0 self)
							)
							(else 
								(= local1 1)
								(proc851_0 1 @local80 14 0 self)
							)
						)
					)
					((== global130 11) (= local1 1) (proc851_0 2 @local84 1 1 14 0 self))
					(else
						(switch global150
							(0
								(++ global150)
								(proc851_0 2 @local94 1 1 14 0 self)
							)
							(1
								(++ global150)
								(proc851_0 1 @local100 14 0 self)
							)
							(2
								(++ global150)
								(proc851_0 1 @local105 14 0 self)
							)
							(else 
								(++ global150)
								(proc851_0 1 @local110 14 0 self)
							)
						)
					)
				)
			)
			(2
				(if (not local1)
					(if (proc999_5 global11 220 180 250)
						(self setScript: willLeaves self)
					else
						((ScriptID 20) setMotion: PolyPath -10 120 self)
					)
				else
					(= ticks 6)
				)
			)
			(3 (self dispose:))
		)
	)
)

(instance willEnters of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== global11 180)
					(gEgo setMotion: PolyPath 150 175 self)
				else
					(= ticks 6)
				)
			)
			(1
				(self setScript: blowinIt self)
			)
			(2
				(if (> (gEgo x?) 185)
					(= local114 -15)
					(if (== global11 180)
						(= local115 187)
					else
						(= local115 145)
					)
				else
					(= local114 335)
					(if (== global11 180)
						(= local115 187)
					else
						(= local115 145)
					)
				)
				(= ticks (Random 10 60))
			)
			(3
				(if (> (gEgo x?) 185)
					(Willbert
						posn: local114 local115
						init:
						setCycle: StopWalk 161
						setMotion: PolyPath (- (gEgo x?) 35) (gEgo y?) self
					)
				else
					(Willbert
						posn: local114 local115
						init:
						setCycle: StopWalk 161
						setMotion: PolyPath (+ (gEgo x?) 35) (gEgo y?) self
					)
				)
				(= cycles 15)
			)
			(4 (proc0_9 gEgo Willbert))
			(5 (= cycles 30))
			(6 (self dispose:))
		)
	)
)

(instance campWillComes of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo
					setCycle: StopWalk 1
					setMotion: PolyPath 140 78 self
				)
			)
			(1 (gEgo setHeading: 225 self))
			(2 (= ticks 6))
			(3
				(if (not (proc974_0 {Will} global5))
					((ScriptID 20) init: loop: 0 x: -25 y: 120)
				)
				(DisposeScript 974)
				(self setScript: blowinIt self)
			)
			(4
				((ScriptID 20)
					setCycle: StopWalk 161
					setMotion: PolyPath 100 84 self
				)
			)
			(5 (= ticks 6))
			(6 (self dispose:))
		)
	)
)

(instance willLeaves of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local116 local114)
				(= local117 local115)
				(Willbert setMotion: PolyPath local116 local117 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance thornyHorn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1005 55 self))
			(1 (self dispose:))
		)
	)
)

(instance tinyBubbles of Script
	(properties)
	
	(method (changeState newState &tmp gEgoLoop)
		(switch (= state newState)
			(0
				(= gEgoLoop (gEgo loop?))
				(bubble
					posn:
						(+
							(gEgo x?)
							(if gEgoLoop [local2 local18] else [local10 local18])
						)
						(+
							(gEgo y?)
							(if gEgoLoop [local6 local18] else [local14 local18])
						)
					setCel: local18
				)
				(++ local18)
				(= ticks 12)
			)
			(1
				(if (< local18 4) (= state (- state 2)))
				(self cue:)
			)
			(2
				(bubble
					setMotion:
						MoveTo
						(if (gEgo loop?)
							(- (gEgo x?) 75)
						else
							(+ (gEgo x?) 75)
						)
						-20
						self
				)
			)
			(3 (client dispose:))
		)
	)
)

(instance bubble of Actor
	(properties
		yStep 8
		view 10
		loop 2
		signal $6000
		xStep 6
	)
	
	(method (init)
		(self setPri: (gEgo priority?))
		(super init:)
	)
)

(instance Willbert of Actor
	(properties
		description 5398
		view 160
	)
	
	(method (init)
		(self setLoop: scarletGroop)
		(super init:)
	)
	
	(method (dispose)
		(self setCycle: 0 setMotion: 0 actions: 0)
		(super dispose:)
		(self delete:)
	)
)

(instance scarletGroop of Grooper
	(properties)
)
