;;; Sierra Script 1.0 - (do not remove this comment)
(script# 210)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n961)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	rm210 0
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
	newActor
	newActor_2
	newProp
	local16
	local17
	local18
	[local19 4] = [1210 0 1]
	[local23 5] = [1210 16 1 2]
	[local28 4] = [1210 18 1]
	[local32 14] = [1210 19 1 2 1 1 2 1 2 1 2 1 2]
	[local46 4] = [1210 30 1]
	[local50 6] = [1210 31 1 2 2]
	[local56 4] = [1210 34 1]
	[local60 7] = [1210 35 1 2 1 2]
	[local67 8] = [1210 39 1 2 2 1 2]
	[local75 4] = [1210 44 1]
	[local79 4] = [1210 47 1]
	[local83 4] = [1210 48 2]
	[local87 4] = [1210 49 1]
	[local91 4] = [1210 50 1]
	[local95 12] = [1210 51 1 2 1 2 2 1 1 1 1]
	[local107 13] = [1210 60 2 1 1 1 2 2 1 1 2 1]
	[local120 4] = [1210 70 1]
	[local124 4] = [1210 71 1]
	[local128 15] = [1210 72 1 2 1 1 2 2 1 2 2 1 1 1]
	[local143 4] = [1210 84 1]
	[local147 7] = [1210 244 1 2 1 1]
	[local154 4] = [1210 101 1]
	[local158 5] = [1210 99 1 1]
	[local163 5] = [1210 90 2 1]
	[local168 7] = [1210 92 2 1 2 1]
	[local175 5] = [1210 97 1 1]
	[local180 26] = [1210 102 2 1 1 2 1 2 1 2 2 2 2 1 2 2 1 2 1 2 1 2 1 2 2]
	[local206 4] = [1210 125 2]
	[local210 4] = [1210 126 1]
	[local214 5] = [1210 127 2 2]
	[local219 5] = [1210 129 1 1]
	[local224 6] = [1210 131 2 1 1]
	[local230 12] = [1210 134 1 2 1 1 1 2 1 1 1]
	[local242 14] = [1210 143 2 1 1 2 2 1 1 2 1 2 1]
	[local256 5] = [1210 154 2 2]
	[local261 5] = [1210 157 1 1]
	[local266 9] = [1210 159 2 1 2 1 2 1]
	[local275 7] = [1210 165 2 1 1 2]
	[local282 5] = [1210 179 1 2]
	[local287 10] = [1210 181 2 1 2 2 1 1 2]
	[local297 4] = [1210 188 1]
	[local301 9] = [1210 172 2 1 2 2 1 2]
	[local310 9] = [1210 189 2 2 1 1 2 2]
	[local319 4] = [1210 195 1]
	[local323 7] = [1210 196 2 2 1 2]
	[local330 8] = [1210 200 2 1 2 1 2]
	[local338 4] = [1210 205 1]
	[local342 4] = [1210 206 1]
	[local346 5] = [1210 207 2 1]
	[local351 5] = [1210 209 1 2]
	[local356 5] = [1210 211 2 1]
	[local361 5] = [1210 213 2 1]
	[local366 6] = [1210 215 2 1 2]
	[local372 14] = [1210 219 2 1 2 1 2 1 2 1 2 1 2]
	[local386 6] = [1210 230 2 1 2]
	[local392 7] = [1210 233 2 1 1 2]
	[local399 4] = [1210 238 1]
	[local403 4] = [1210 239 1]
	[local407 4] = [1210 45 1]
	[local411 4] = [1210 46 1]
	[local415 4] = [1210 3 1]
	[local419 5] = [1210 242 1 1]
	local424
	[local425 4]
	local429
	local430
	theWeaponsCheck
	local432
	[local433 4] = [1211 0 1]
	[local437 4] = [1211 1 1]
	[local441 4] = [1211 2 1]
	[local445 7] = [1211 3 1 2 1 2]
	[local452 5] = [1211 7 1 1]
	[theRegister_2 4] = [1211 9 1]
	[local461 6] = [1211 10 1 2 1]
	[local467 6] = [1211 13 1 2 1]
	[theRegister_3 7] = [1211 16 1 2 1 1]
	[theRegister_4 4] = [1211 20 1]
	[theRegister 4] = [1211 21 1]
	[theRegister_5 4] = [1211 22 1]
	[local492 6] = [1211 23 2 1 1]
	[local498 4] = [1317 12 1]
	[local502 4] = [1210 169 1]
	[local506 3] = [-1]
	[local509 3] = [-1 14636 5]
)
(procedure (localproc_01e6)
	(proc0_4)
	(if local12 (gIconBar disable: 0 disable: 5))
	(cond 
		((== (marian script?) waitToDie) (gIconBar disable: 4 disable: 5))
		((and (== gNewGuise 0) local430) (gIconBar disable: 4))
	)
)

(procedure (localproc_30ea param1)
	(Display {} 108 local424)
	(StrCat @local425 param1)
	(= local424
		(Display
			@local425
			100
			115
			35
			102
			gColor
			103
			global186
			107
		)
	)
)

(instance rm210 of Rm
	(properties
		picture 210
		style $0064
		east 220
		south 220
		west 220
	)
	
	(method (init)
		(super init:)
		(if (!= global12 220) (= gGEgoEdgeHit 1))
		(cond 
			(
				(or
					(and (== global130 4) (== gNewGuise 0) (gEgo has: 15))
					(and
						(== global130 7)
						(== gNewGuise 0)
						(gEgo has: 17)
						(not (proc0_5 34))
					)
				)
				(marian init:)
				(gClient
					addObstacle:
						(= local432
							((Polygon new:)
								type: 2
								init: 116 146 153 145 153 152 116 152
								yourself:
							)
						)
				)
				(gClient setScript: egoEnters 0 gGEgoEdgeHit)
			)
			((== global12 179) (gClient setScript: carryIn))
			(else (gClient setScript: egoEnters 0 gGEgoEdgeHit))
		)
		(gEgo actions: egoActions)
		(gRgnMusic number: 905 play:)
		(gSFX
			number: (if (!= global130 10) 210 else 217)
			loop: -1
			play:
		)
		(willows init:)
		(ferns init:)
	)
	
	(method (doit)
		(cond 
			(script (script doit:))
			((gEgo edgeHit?)
				(= gGEgoEdgeHit (gEgo edgeHit?))
				(gClient
					setScript: walkOut 0 (self edgeToRoom: gGEgoEdgeHit)
				)
			)
			(theWeaponsCheck (theWeaponsCheck doit:))
		)
	)
	
	(method (dispose)
		(gSFX fade: 0 20 12 1)
		(gEgo actions: 0)
		(super dispose:)
		(DisposeScript 220)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(gEgo illegalBits: 0)
				(if (== gNewGuise 0)
					(= theWeaponsCheck weaponsCheck)
					(gClient
						addObstacle:
							((Polygon new:)
								type: 2
								init:
									228
									161
									201
									147
									171
									143
									136
									143
									96
									147
									76
									152
									63
									160
									0
									160
									0
									0
									319
									0
									319
									161
								yourself:
							)
					)
				else
					(= theWeaponsCheck groveClosed)
					(gClient
						addObstacle:
							((Polygon new:)
								type: 2
								init:
									228
									161
									223
									159
									193
									172
									108
									172
									70
									157
									63
									160
									0
									160
									0
									0
									319
									0
									319
									161
								yourself:
							)
					)
				)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init: 319 178 303 186 248 186 224 178 251 170 300 170
							yourself:
						)
						((Polygon new:)
							type: 2
							init: 60 177 41 184 4 184 0 176 16 170 43 170
							yourself:
						)
						((Polygon new:)
							type: 0
							init: 224 159 223 162 194 173 107 173 74 162 67 156 2 58 313 58
							yourself:
						)
				)
				(switch register
					(1
						(gEgo
							posn: 142 240
							init:
							setMotion: PolyPath 142 183 self
						)
					)
					(2
						(gEgo posn: -10 170 init: setMotion: PolyPath 40 170 self)
					)
					(else 
						(gEgo
							posn: 325 170
							init:
							setMotion: PolyPath 250 170 self
						)
					)
				)
			)
			(1
				(if (proc0_5 179)
					(proc0_7 179)
					(proc851_0 @local419 @local506 0 self)
				else
					(self cue:)
				)
			)
			(2
				(if (global5 contains: marian)
					(switch global130
						(4
							(switch global149
								(0
									(proc851_0 @local346 1 22 self)
								)
								(1 (= cycles 1))
								(2
									(proc851_0 @local361 1 22 self)
								)
							)
						)
						(7 (= cycles 1))
					)
				else
					(localproc_01e6)
					(self dispose:)
				)
			)
			(3
				(proc0_6 155)
				(self setScript: disarm self)
				(= local430 1)
			)
			(4
				(if (== global130 7) (++ state))
				(marian loop: 0)
				(= cycles 2)
			)
			(5
				(switch global149
					(1
						(proc851_0 @local356 1 22 self)
					)
					(else  (= cycles 1))
				)
			)
			(6
				(switch global130
					(4
						(switch global149
							(0
								(proc851_0 @local351 1 22 self)
							)
							(2
								(proc851_0 @local366 1 22 self)
								(= local12 1)
							)
							(else  (= cycles 1))
						)
					)
					(7
						(switch global149
							(0
								(proc851_0 @local372 1 22 self)
							)
							(1
								(proc851_0 @local386 1 22 self)
							)
							(else 
								(proc851_0 @local392 1 22 self)
								(= local12 1)
							)
						)
					)
				)
			)
			(7
				(localproc_01e6)
				(++ global149)
				(self dispose:)
			)
		)
	)
)

(instance disarm of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(= register (gEgo mover?))
				(if (and register (register isMemberOf: PolyPath))
					(gEgo mover: 0)
				else
					(gEgo setMotion: (= register 0))
				)
				(if (proc0_5 155)
					(= cycles 1)
				else
					(proc13_4 1210 218 self)
				)
				(proc0_6 155)
			)
			(1
				(gEgo setMotion: PolyPath 149 175 self)
			)
			(2 (gEgo setHeading: 135 self))
			(3
				(gEgo
					view: 15
					setLoop: 2
					setCel: 0
					cycleSpeed: 12
					posn: (+ (gEgo x?) 5) (+ (gEgo y?) 5)
					setPri: 12
					setCycle: End self
				)
				(bow posn: (gEgo x?) (gEgo y?) init: setCycle: End)
				(Load rsVIEW 702)
				(Load rsVIEW 703)
			)
			(4 (gEgo setCycle: Beg self))
			(5
				(gEgo
					posn: (- (gEgo x?) 9) (- (gEgo y?) 3)
					setLoop: 3
					setCel: 0
					setCycle: CT 5 1 self
				)
			)
			(6
				(quiver
					posn: (+ (gEgo x?) 6) (+ (gEgo y?) 2)
					signal: 16641
					init:
				)
				(proc0_2 2 702 703)
				(= ticks 12)
			)
			(7
				(bow signal: (| (bow signal?) $0100) stopUpd:)
				(gEgo
					cycleSpeed: (gEgo moveSpeed?)
					setMotion: MoveTo 149 172 self
				)
			)
			(8
				(if register
					(localproc_01e6)
					(gEgo
						mover: register
						setMotion: PolyPath (register finalX?) (register finalY?)
					)
					(self dispose:)
				else
					(gEgo setMotion: MoveTo 165 149 self)
					(if (not (global5 contains: marian)) (++ state))
				)
			)
			(9 (proc0_9 gEgo marian self))
			(10 (= cycles 2))
			(11
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance rearm of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(Load rsVIEW 0)
				(Load rsVIEW 1)
				(= register (gEgo mover?))
				(if (and register (register isMemberOf: PolyPath))
					(gEgo mover: 0)
				else
					(gEgo setMotion: (= register 0))
				)
				(gEgo setMotion: PolyPath (bow x?) (bow y?) self)
			)
			(1 (gEgo setHeading: 135 self))
			(2
				(gEgo
					view: 15
					posn: (- (gEgo x?) 9) (- (gEgo y?) 3)
					setLoop: 3
					cel: 5
					cycleSpeed: 12
					setPri: 13
					setCycle: Beg self
				)
				(quiver dispose:)
			)
			(3 (= ticks 12))
			(4
				(gEgo
					posn: (bow x?) (bow y?)
					setLoop: 2
					setCel: 0
					setCycle: End self
				)
			)
			(5
				(bow signal: (& (bow signal?) $feff) startUpd:)
				(= ticks 12)
			)
			(6
				(gEgo setCycle: Beg self)
				(bow setCycle: Beg)
			)
			(7 (= ticks 12))
			(8
				(bow dispose:)
				(proc0_2 4)
				(localproc_01e6)
				(gEgo
					setPri: -1
					posn: (- (gEgo x?) 6) (- (gEgo y?) 6)
				)
				(if register
					(gEgo
						mover: register
						setMotion: PolyPath (register finalX?) (register finalY?)
					)
				)
				(self dispose:)
			)
		)
	)
)

(instance weaponsCheck of Code
	(properties)
	
	(method (doit &tmp temp0)
		(cond 
			((= temp0 (& (gEgo onControl: 1) $0004)) (if (not local430) (gClient setScript: disarm)))
			(local430 (gClient setScript: rearm))
		)
		(= local430 temp0)
	)
)

(instance groveClosed of Code
	(properties)
	
	(method (doit &tmp temp0)
		(if (& (gEgo onControl: 1) $0004)
			(= theWeaponsCheck 0)
			(proc13_4
				1210
				(if (and (== gNewGuise 4) (== global130 8))
					248
				else
					249
				)
				1
			)
		)
	)
)

(instance bow of Prop
	(properties
		lookStr 7
		view 15
		loop 6
		priority 14
		signal $4010
		cycleSpeed 12
	)
	
	(method (doVerb theVerb param2)
		(if (or (!= theVerb 3) local12)
			(super doVerb: theVerb param2)
		else
			(gEgo setMotion: 0)
			(gClient setScript: rearm)
			(= local430 0)
		)
	)
)

(instance quiver of View
	(properties
		lookStr 7
		view 15
		loop 4
		signal $4101
	)
	
	(method (doVerb)
		(bow doVerb: &rest)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY)
		(switch (= state newState)
			(0
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(switch gGEgoEdgeHit
					(3 (= gEgoY 240))
					(2 (= gEgoX (+ gEgoX 20)))
					(4 (= gEgoX (- gEgoX 20)))
				)
				(proc0_3)
				(if (!= gGEgoEdgeHit 1)
					(gEgo
						ignoreActors: 1
						setMotion: PolyPath gEgoX gEgoY self
					)
				else
					(self cue:)
				)
			)
			(1
				(localproc_01e6)
				(gClient newRoom: register)
			)
		)
	)
)

(instance carryIn of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 3
							init:
								228
								161
								201
								147
								171
								143
								136
								143
								96
								147
								76
								152
								63
								160
								14
								160
								14
								170
								43
								170
								60
								177
								36
								186
								248
								186
								224
								178
								251
								170
								302
								170
								302
								161
							yourself:
						)
						((Polygon new:)
							type: 2
							init: 129 149 185 147 190 151 182 156 127 159 119 154
							yourself:
						)
				)
				(marian
					actions: dying
					view: 510
					loop: 1
					posn: 154 154
					init:
					setCycle: End self
					ignoreActors: 1
				)
			)
			(1
				(= local429 1)
				(marian loop: 2 cel: 0 setCycle: End self)
			)
			(2
				(proc851_0 @local19 999 0 self)
			)
			(3 (proc13_4 1210 1 self))
			(4 (proc13_4 1210 2 self))
			(5
				(gEgo
					view: 510
					setLoop: 4
					setPri: -1
					posn: 167 152
					init:
					setScript: waitToStand
				)
				(marian loop: 3 setScript: waitToDie)
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance waitToStand of Script
	(properties)
	
	(method (doit)
		(if (gEgo mover?) (self cue:))
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(proc0_3)
				(= register (gEgo mover?))
				(gEgo mover: 0 setPri: -1 setCycle: End self)
			)
			(2
				(proc0_2 2 702 703)
				(gEgo y: 150 setMotion: MoveTo (gEgo x?) 147 self)
			)
			(3
				(if (and register (register isMemberOf: PolyPath))
					(gEgo
						setMotion: register (register finalX?) (register finalY?)
					)
				else
					(gEgo setMotion: register (register x?) (register y?))
				)
				(gEgo cycleSpeed: (gEgo moveSpeed?))
				(= local429 0)
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance waitToDie of Script
	(properties)
	
	(method (doit &tmp temp0)
		(super doit:)
		(if
			(and
				(= temp0 (& (gEgo onControl: 1) $0002))
				(not local430)
			)
			(proc13_4 1210 4)
		)
		(= local430 temp0)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds 60))
			(1
				(proc0_3)
				(proc806_1 -500)
				(self setScript: sit self)
			)
			(2
				(gSFX number: 215 loop: -1 play:)
				(proc851_0 @local415 2 0 self)
			)
			(3
				(Load rsVIEW 501)
				(gEgo cycleSpeed: 9 setCycle: CT 2 1 self)
			)
			(4
				(gEgo
					view: 501
					cel: 0
					x: (- (gEgo x?) 2)
					setCycle: CT 3 1 self
				)
			)
			(5
				(= register 98)
				(while (>= register 0)
					(Palette 4 1 255 register)
					(Wait 4)
					(= register (- register 2))
				)
				(gClient drawPic: 803 100)
				(gClient setScript: 0 script: self)
				(marian script: 0)
				(= client gClient)
				(global5 eachElementDo: #dispose)
				(= cycles 3)
			)
			(6
				(Palette 4 1 255 100)
				(proc0_6 5)
				(gClient newRoom: 160)
			)
		)
	)
)

(instance marian of Actor
	(properties
		x 135
		y 150
		lookStr 5
		view 212
		loop 2
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1210 14))
			(5
				(switch global130
					(4
						(cond 
							((and (gEgo has: 15) local4) (proc851_0 1 @local28 22 3))
							((gEgo has: 15) (= local4 1) (proc851_0 @local23 999 22))
							(local5 (proc851_0 1 @local46 22 3))
							(else (= local5 1) (proc851_0 @local32 999 22))
						)
					)
					(7
						(cond 
							((and (not (proc0_5 34)) local6) (proc851_0 @local56 22 0))
							((not (proc0_5 34)) (++ local6) (proc851_0 @local50 1 22))
							((> local7 1) (proc851_0 @local75 22))
							((== local7 1) (++ local7) (proc851_0 @local67 1 22))
							(1 (++ local7) (proc851_0 @local60 1 22))
						)
					)
				)
			)
			(4
				(switch param2
					(1 (proc851_0 @local407 22))
					(0 (proc851_0 @local411 22))
					(2
						(switch global130
							(4
								(if local16
									(super doVerb: theVerb &rest)
								else
									(gClient setScript: giveEmerald)
								)
							)
							(7
								(cond 
									(local16 (super doVerb: theVerb &rest))
									((and (proc0_5 143) (proc0_5 34)) (gClient setScript: sex))
									(else (gClient setScript: giveEmerald))
								)
							)
						)
					)
					(15
						(gClient setScript: giveComb)
					)
					(14 (proc851_0 @local282 1 22))
					(12
						(if local8
							(proc851_0 1 @local297 22 3)
						else
							(= local8 1)
							(proc851_0 @local287 1 22)
						)
					)
					(10
						(if (== global130 7)
							(if local9
								(proc13_4 1210 170)
							else
								(proc851_0 @local301 1 22)
							)
						)
					)
					(17
						(if (proc0_5 34)
							(proc851_0 1 @local502 22 3)
						else
							(gClient setScript: giveScroll)
						)
					)
					(16
						(gClient setScript: giveFScroll)
					)
					(18
						(switch global130
							(7
								(if local11
									(proc851_0 1 @local338 22 3)
								else
									(proc851_0 @local330 1 22)
								)
							)
							(10 (proc13_4 1210 178))
						)
					)
					(4 (proc851_0 1 @local342 22 3))
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance giveEmerald of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(if (not (& (gEgo onControl: 1) $0004))
					(self setScript: disarm self)
					(= local430 4)
					(-- state)
					(return)
				)
				(gEgo
					setMotion: PolyPath (+ (marian x?) 28) (+ (marian y?) -1) self
				)
			)
			(1
				(= notKilled 1)
				(gEgo setLoop: 1)
				(marian loop: 0)
				(Load rsVIEW 215)
				(= ticks 20)
			)
			(2
				(marian hide:)
				(gEgo
					view: 215
					cycleSpeed: 6
					setLoop: 0
					setCel: 0
					posn: (- (gEgo x?) 7) (gEgo y?)
				)
				(= ticks 40)
			)
			(3
				(gEgo posn: (+ (gEgo x?) 7) (gEgo y?))
				(proc0_2 1 702 703)
				(marian
					view: 215
					x: (+ (marian x?) 1)
					loop: 4
					cel: 3
					show:
					setCycle: End self
				)
			)
			(4
				(marian
					view: 211
					x: (+ (marian x?) -1)
					loop: 0
					setCycle: StopWalk 212
				)
				(if
					(or
						(gEgo has: 15)
						(and (== global130 7) (not (proc0_5 34)))
					)
					(cond 
						((== global130 4) (proc851_0 @local79 22))
						((proc0_5 143) (proc851_0 @local158 22))
						(else (proc851_0 @local154 22))
					)
					(localproc_01e6)
					(self dispose:)
				else
					(proc806_1 50 143)
					(= local16 1)
					(if local18
						(proc851_0 @local83 22 1 self 0)
					else
						(++ state)
						(= cycles 1)
					)
				)
				(= local18 1)
			)
			(5
				(switch global130
					(4
						(proc851_0 @local87 22 1 self 0)
					)
					(7
						(proc851_0 @local91 22 1 self 0)
					)
				)
			)
			(6
				(proc851_0 @local95 22 1 self)
			)
			(7 (self setScript: unite self))
			(8
				(proc851_0 @local107 22 1 self 0)
			)
			(9
				(switch global130
					(4
						(proc851_0 @local120 22 1 self)
					)
					(7
						(proc851_0 @local124 22 1 self)
					)
				)
			)
			(10
				(if
					(or
						(and (== global130 4) (not (gEgo has: 15)))
						(proc0_6 34)
					)
					(gClient setScript: thereSheGoes)
				else
					(localproc_01e6)
				)
				(self dispose:)
			)
		)
	)
)

(instance thereSheGoes of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(marian setCycle: Walk setMotion: PolyPath 114 177 self)
			)
			(1
				(marian setMotion: PolyPath 110 245 self)
			)
			(2
				(= local2 (= local1 0))
				(marian dispose:)
				((gClient obstacles?) delete: local432)
				(local432 dispose:)
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance sex of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(if (not (& (gEgo onControl: 1) $0004))
					(self setScript: disarm self)
					(= local430 4)
					(-- state)
					(return)
				)
				(gEgo
					setMotion: PolyPath (+ (marian x?) 21) (+ (marian y?) -5) self
				)
			)
			(1 (gEgo setHeading: 270 self))
			(2 (= cycles 2))
			(3
				(proc851_0 @local128 1 22 self)
			)
			(4
				(marian
					view: 217
					loop: 7
					cel: 0
					posn: (- (gEgo x?) 18) (+ (gEgo y?) 3)
					cycleSpeed: 15
					setCycle: End self
				)
				(gEgo dispose:)
			)
			(5
				(marian
					x: (+ (marian x?) 15)
					loop: 1
					cel: 0
					setCycle: End self
				)
			)
			(6 (= ticks 100))
			(7 (marian setCycle: Beg self))
			(8 (= ticks 45))
			(9
				(proc851_0 @local143 22 0 self)
			)
			(10 (= seconds 2))
			(11
				(marian loop: 3 cel: 0 cycleSpeed: 12 setCycle: End self)
			)
			(12
				(marian loop: 5 cel: 0 setCycle: CT 7 1 self)
			)
			(13
				(marian cycleSpeed: 35 setCycle: End self)
			)
			(14
				(marian dispose:)
				(mHead init:)
				(rHead init:)
				(gClient overlay: 216)
				(Graph grFILL_BOX 0 0 192 320 2 0 0)
				(= seconds 4)
			)
			(15
				(mHead setCycle: End)
				(rHead setCycle: End self)
			)
			(16 (= ticks 60))
			(17
				(= register 98)
				(while (>= register 0)
					(Palette 4 1 255 register)
					(Wait 4)
					(= register (- register 2))
				)
				(gClient drawPic: 803 7)
				(= global36 -1)
				(marian dispose:)
				(rHead dispose:)
				(mHead dispose:)
				(bow z: 1000)
				(quiver z: 1000 forceUpd:)
				(= cycles 3)
			)
			(18
				(Palette 4 1 255 100)
				(proc806_1 50 120)
				(proc13_4 1210 85 self)
			)
			(19
				(gClient drawPic: 210 10)
				(proc0_2 1 702 703)
				(gEgo init: actions: egoActions)
				(marian
					view: 211
					loop: 0
					posn: 135 150
					init:
					ignoreActors: 1
					cycleSpeed: 6
					setCycle: StopWalk 212
				)
				(bow z: 0)
				(quiver z: 0 forceUpd:)
				(= cycles 2)
			)
			(20
				(proc851_0 @local147 22 1 self)
			)
			(21
				(client setScript: thereSheGoes self)
			)
		)
	)
)

(instance rHead of Prop
	(properties
		x 120
		y 73
		view 219
		priority 14
		signal $4010
		cycleSpeed 17
	)
)

(instance mHead of Prop
	(properties
		x 161
		y 87
		view 219
		loop 1
		priority 13
		signal $4010
		cycleSpeed 17
	)
)

(instance sit of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 152])
		(switch (= state newState)
			(0
				(if local429
					(++ state)
					(= cycles 1)
				else
					(gEgo setMotion: PolyPath 167 150 self)
				)
			)
			(1
				(= local429 0)
				(gEgo
					view: 510
					loop: 4
					cel: 3
					posn: 167 152
					setCycle: Beg self
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance heal of Script
	(properties)
	
	(method (dispose)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp [temp0 2] [temp2 150])
		(switch (= state newState)
			(0
				(proc0_3)
				(marian setScript: 0)
				(self setScript: sit self)
			)
			(1
				(if (proc0_5 143)
					(proc13_4 1210 88 self)
				else
					(proc13_4 1210 86 self)
				)
			)
			(2
				(self
					setScript: unite self (if (proc0_5 143) 0 else 87)
				)
			)
			(3
				(gSFX number: 210 loop: -1 play:)
				(proc13_4 1210 89 self)
			)
			(4 (= ticks 60))
			(5
				(proc851_0 @local163 1 22 self)
			)
			(6
				(proc806_1 300 62)
				(= seconds 2)
			)
			(7
				(proc851_0 @local168 1 22 self 0)
			)
			(8
				(GetFarText 1210 96 @temp2)
				(GetFarText
					1317
					(+ -10 global140)
					(+ @temp2 (StrLen @temp2))
				)
				(if ((= register (ScriptID 851 3)) underBits?)
					(register say: @temp2 0 0 0 self)
				else
					(= cycles 1)
				)
			)
			(9
				(proc851_0 @local175 1 22 self)
			)
			(10
				(marian loop: 2 cel: 8 setCycle: Beg self)
				(gEgo dispose:)
			)
			(11
				(gClient drawPic: 803 6)
				(global5 eachElementDo: #dispose)
				(= ticks 60)
			)
			(12 (gClient newRoom: 160))
		)
	)
)

(instance dying of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1210 6 1))
			(3 (proc13_4 1210 15 1))
			(4
				(switch param2
					(2 (gClient setScript: heal))
					(10 (proc13_4 1210 171 1))
					(18 (proc13_4 1210 178 1))
					(else 
						(gDoVerbCode doit: theVerb &rest)
					)
				)
			)
			(5 (proc13_4 1210 250 1))
			(else 
				(gDoVerbCode doit: theVerb &rest)
			)
		)
		(return 1)
	)
)

(instance unite of TScript
	(properties)
	
	(method (doit)
		(super doit:)
		(if local17 (Palette 6 224 254 local17))
	)
	
	(method (changeState newState &tmp [temp0 3])
		(switch (= state newState)
			(0
				(global1 setCursor: 5 1 310 185)
				(= local17 -1)
				(gEgo hide:)
				(marian hide:)
				(bow hide:)
				(quiver hide:)
				(gClient drawPic: 215)
				((= newActor (Actor new:))
					view: 216
					loop: (== client heal)
					posn: 80 140
					signal: 18432
					init:
					setMotion: MoveTo 121 120 self
				)
				((= newActor_2 (Actor new:))
					view: 216
					loop: 2
					posn: 250 142
					signal: 18432
					init:
					setMotion: MoveTo 210 122
				)
				(gSFX pause: 1)
				(gRgnMusic pause: 1)
				(joinSound play:)
			)
			(1
				(= local17 -2)
				(newActor addToPic:)
				(newActor_2 addToPic:)
				((= newProp (Prop new:))
					view: 216
					loop: 3
					posn: 156 89
					priority: 9
					signal: 16400
					init:
					setCycle: End self
				)
			)
			(2 (newProp setCycle: Beg self))
			(3
				(= local17 -4)
				(newProp dispose:)
				(if register
					(proc13_4 1210 register self)
				else
					(= ticks 180)
				)
			)
			(4
				(if (== (joinSound prevSignal?) -1)
					(= cycles 2)
				else
					(-- state)
					(= cycles 2)
				)
			)
			(5
				(gEgo show:)
				(marian show:)
				(bow show:)
				(quiver show:)
				(newActor dispose:)
				(newActor_2 dispose:)
				(gClient drawPic: 210 10)
				(gSFX pause: 0)
				(gRgnMusic pause: 0)
				(= cycles 1)
				(= local17 0)
			)
			(6
				(global1 setCursor: ((gIconBar curIcon?) cursor?) 1)
				(self dispose:)
			)
		)
	)
)

(instance giveComb of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(if (not (& (gEgo onControl: 1) $0004))
					(self setScript: disarm self)
					(= local430 4)
					(-- state)
					(return)
				)
				(marian signal: 16384)
				(gEgo
					setMotion: PolyPath (+ (marian x?) 28) (- (marian y?) 2) self
				)
			)
			(1
				(gEgo setLoop: 1)
				(marian loop: 0)
				(= ticks 30)
			)
			(2
				(marian hide:)
				(gEgo
					view: 215
					setLoop: 0
					setCel: 0
					cycleSpeed: 6
					posn: (- (gEgo x?) 7) (gEgo y?)
				)
				(= ticks 20)
			)
			(3
				(gEgo setCel: 1)
				(= ticks 20)
			)
			(4
				(gEgo posn: (+ (gEgo x?) 7) (gEgo y?))
				(marian view: 215 loop: 4 cel: 3 show: setCycle: End self)
				(proc0_2 1 702 703)
			)
			(5
				(marian view: 212 loop: 0)
				(= ticks 30)
			)
			(6
				(proc851_0 @local180 1 22 self)
			)
			(7
				(proc806_1 50 48)
				(if (proc0_5 47)
					(gClient east: 160)
					(gClient south: 160)
					(gClient west: 160)
				)
				(gEgo put: 15)
				(marian signal: 0)
				(= local12 0)
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance giveScroll of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 2] [temp2 150])
		(switch (= state newState)
			(0
				(proc0_3)
				(if (not (& (gEgo onControl: 1) $0004))
					(self setScript: disarm self)
					(= local430 4)
					(-- state)
					(return)
				)
				(= notKilled 1)
				(marian signal: 16384)
				(gEgo
					setMotion: PolyPath (+ (marian x?) 28) (marian y?) self
				)
			)
			(1
				(gEgo setLoop: 1)
				(marian loop: 0)
				(= ticks 20)
			)
			(2
				(marian hide:)
				(gEgo
					view: 215
					cycleSpeed: 6
					setLoop: 0
					setCel: 0
					posn: (- (gEgo x?) 8) (+ (gEgo y?) 1)
					setCycle: End self
				)
			)
			(3
				(proc806_1 200)
				(marian
					view: 215
					posn: (- (gEgo x?) 15) (gEgo y?)
					loop: 2
					cel: 0
					show:
				)
				(gEgo posn: (+ (gEgo x?) 8) (- (gEgo y?) 1))
				(proc0_2 1 702 703)
				(= cycles 20)
			)
			(4
				(proc851_0 @local206 1 22 self 0)
			)
			(5
				(proc851_0 @local210 3 22 self 0)
			)
			(6
				(proc851_0 @local214 1 22 self)
			)
			(7 (marian setCycle: End self))
			(8
				(rustleSound play:)
				(self setScript: scrollCloseUp self)
			)
			(9
				(= notKilled 1)
				(proc851_0 @local219 22 0 self)
			)
			(10
				(marian setCycle: Beg self)
				(rustleSound play:)
			)
			(11
				(marian hide:)
				(gEgo
					view: 215
					setLoop: 0
					setCel: 255
					posn: (- (gEgo x?) 8) (gEgo y?)
					setCycle: Beg self
				)
			)
			(12
				(gEgo posn: (+ (gEgo x?) 8) (gEgo y?))
				(marian
					view: 211
					posn: (- (gEgo x?) 28) (gEgo y?)
					loop: 0
					show:
					setCycle: StopWalk 212
				)
				(proc0_2 1 702 703)
				(= ticks 30)
			)
			(13
				(proc851_0 @local224 22 1 self)
			)
			(14
				(if notKilled
					(cursMan init: setMotion: MoveTo 161 121 self)
					(= register 1)
				else
					(= state (+ state 15))
					(= cycles 1)
				)
			)
			(15 (= ticks 15))
			(16
				(gEgo z: 1000)
				(gEgoHead z: 1000)
				(marian z: 1000)
				(bow z: 1000)
				(quiver z: 1000)
				(gClient drawPic: 213 10 1 1)
				(= cycles 2)
			)
			(17
				(= register 0)
				(global1 setCursor: global19 1 305 190)
				(cursMan show: setMotion: MoveTo 202 93 self)
			)
			(18 (= ticks 20))
			(19
				(localproc_30ea {R})
				(cursMan setMotion: MoveTo 160 98 self)
			)
			(20 (= ticks 20))
			(21
				(localproc_30ea {O})
				(cursMan setMotion: MoveTo 127 94 self)
			)
			(22 (= ticks 20))
			(23
				(localproc_30ea {B})
				(cursMan setMotion: MoveTo 199 102 self)
			)
			(24 (= ticks 20))
			(25
				(localproc_30ea {I})
				(cursMan setMotion: MoveTo 209 74 self)
			)
			(26 (= ticks 20))
			(27
				(localproc_30ea {N})
				(cursMan setMotion: MoveTo 174 122 self)
			)
			(28 (= ticks 20))
			(29
				(Display {} 108 local424)
				(gClient drawPic: 210 10)
				(gEgo z: 0)
				(gEgoHead z: 40)
				(marian z: 0)
				(bow z: 0)
				(quiver z: 0)
				(cursMan dispose:)
				(= cycles 2)
			)
			(30
				(proc851_0 @local230 22 1 self 0)
			)
			(31
				(proc851_0 @local242 22 3 self 0)
			)
			(32
				(proc851_0 @local256 22 1 self 0)
			)
			(33
				(GetFarText 1210 156 @temp2)
				(GetFarText 1317 global123 (+ @temp2 (StrLen @temp2)))
				(proc13_6 9)
				((= register (ScriptID 851 2))
					show:
					say: @temp2 0 0 0 self
				)
				(proc13_6 0)
			)
			(34
				(if (not notKilled) (register dispose:))
				(proc851_0 @local261 22 1 self 0)
			)
			(35
				(proc851_0 @local266 22 3 self 0)
			)
			(36
				(proc851_0 @local275 22 1 self)
			)
			(37
				(marian signal: 0)
				(= local12 0)
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance scrollCloseUp of Script
	(properties)
	
	(method (doit)
		(if (and local0 (== (letterSound prevSignal?) -1))
			(gRgnMusic pause: 0)
			(gSFX pause: 0)
			(= local0 0)
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(letterSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(gEgo z: 1000)
				(gEgoHead z: 1000)
				(marian z: 1000)
				(bow z: 1000)
				(quiver z: 1000)
				(gClient drawPic: 211 6)
				(= cycles 2)
			)
			(1 (= ticks 75))
			(2
				((= register (Actor new:))
					view: 208
					loop: 0
					cel: 2
					x: 158
					y: 118
					cycleSpeed: 35
					init:
					setCycle: Beg self
				)
			)
			(3
				(gSFX pause: 1)
				(gRgnMusic pause: 1)
				(= local0 1)
				(letterSound play:)
				(= seconds 5)
			)
			(4
				(register setCycle: End self)
			)
			(5
				(register dispose:)
				(= ticks 30)
			)
			(6
				(gClient drawPic: 210 6)
				(gEgo z: 0)
				(gEgoHead z: 40)
				(marian z: 0)
				(bow z: 0)
				(quiver z: 0)
				(= cycles 2)
			)
			(7
				(proc0_6 34)
				(self dispose:)
			)
		)
	)
)

(instance cursMan of Actor
	(properties
		yStep 4
		view 182
		loop 1
		priority 15
		signal $4898
		illegalBits $0000
		xStep 4
		moveSpeed 3
	)
	
	(method (init)
		(= x ((User curEvent?) x?))
		(= y ((User curEvent?) y?))
		(super init:)
		(= signal 18584)
	)
	
	(method (doit)
		(super doit: &rest)
		(if (giveScroll register?) (SetCursor 2 1 x y))
	)
)

(instance giveFScroll of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 152])
		(switch (= state newState)
			(0
				(proc0_3)
				(if (not (& (gEgo onControl: 1) $0004))
					(self setScript: disarm self)
					(= local430 4)
					(-- state)
					(return)
				)
				(= notKilled 1)
				(gEgo
					setMotion: PolyPath (+ (marian x?) 28) (marian y?) self
				)
			)
			(1
				(proc0_9 gEgo marian)
				(marian loop: 0)
				(= ticks 20)
			)
			(2
				(marian
					view: 215
					loop: 4
					setCel: 255
					cycleSpeed: 6
					setCycle: Beg self
				)
			)
			(3
				(cond 
					((gEgo has: 10) (proc851_0 @local323 1 22 self) (gEgo put: 16))
					(local10 (proc851_0 1 @local319 22 3 self))
					(1 (= local10 1) (proc851_0 @local310 1 22 self))
				)
			)
			(4
				(if (gEgo has: 10)
					(gEgo put: 16)
					(marian setCycle: CT 2 1 self)
				else
					(marian setCycle: End self)
				)
			)
			(5
				(marian
					view: 211
					posn: (- (gEgo x?) 28) (gEgo y?)
					loop: 0
					show:
					setCycle: StopWalk 212
				)
				(self dispose:)
				(proc0_4)
			)
		)
	)
)

(instance tryBlowinIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== global130 10)
					(proc13_4 1210 241 self)
					(= local2 0)
				else
					(++ state)
					(= cycles 1)
				)
			)
			(1
				(localproc_01e6)
				(self dispose:)
			)
			(2
				(if (= register (global5 contains: marian))
					(proc851_0 1 @local399 22 3 self)
				else
					(proc13_4 1210 240 self)
				)
			)
			(3
				(= cycles 1)
				(if (not register) (++ state))
			)
			(4
				(proc851_0 @local403 1 0 self)
			)
			(5
				(localproc_01e6)
				(self dispose:)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(4
				(if (== param2 1) (gClient setScript: tryBlowinIt) 1)
			)
			(3
				(if (proc0_5 34) (gClient setScript: waitForIt))
			)
		)
	)
)

(instance waitForIt of Script
	(properties)
	
	(method (doit)
		(if (proc0_5 110)
			(proc0_7 110)
			(client setScript: willowTalk)
		)
	)
)

(instance willowTalk of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					((global5 contains: marian)
						(if (== global130 7)
							(++ local1)
							(= state 4)
							(= register
								(cond 
									((>= local1 5) @local441)
									((== global124 55) @local433)
									(1 @local437)
								)
							)
						else
							(= state 2)
							(if (== global124 19)
								(++ state)
								(= register @theRegister)
							)
						)
					)
					(
						(or
							(!= global124 19)
							(not (proc0_5 35))
							(!= gNewGuise 0)
						)
						(self dispose:)
						(localproc_01e6)
						(return)
					)
					(local1 (= register @theRegister_2) (= state 3))
					(1
						(= local1 1)
						(switch global130
							(7
								(= register
									(cond 
										((proc0_5 120) @local467)
										((proc0_5 143) @local461)
										(1 @local452)
									)
								)
							)
							(8
								(= register @theRegister_3)
								(= state 3)
							)
							(10
								(= register @theRegister_4)
								(= state 3)
							)
							(else 
								(if (proc0_5 5)
									(client setScript: spillBeans)
								else
									(= register @theRegister_5)
									(= state 3)
								)
							)
						)
					)
				)
				(= cycles 1)
			)
			(1
				(proc851_0 @local445 @local509 999 self 0)
			)
			(2
				(proc851_0 register @local509 999 self)
			)
			(3
				(self dispose:)
				(localproc_01e6)
			)
			(4
				(= state (- state 2))
				(proc851_0 1 register @local509 0 self)
			)
			(5
				(= state (- state 3))
				(proc851_0 register 22 0 self)
			)
		)
	)
)

(instance spillBeans of TScript
	(properties)
	
	(method (changeState newState &tmp [temp0 30])
		(switch (= state newState)
			(0
				(proc851_0 @local492 @local509 999 self 0)
			)
			(1
				(= [local498 1] (+ -10 global140))
				(proc851_0 @local498 @local509 999 self)
				(proc0_6 51)
			)
			(2
				(self dispose:)
				(localproc_01e6)
			)
		)
	)
)

(instance rustleSound of Sound
	(properties
		flags $0001
		number 633
	)
)

(instance joinSound of Sound
	(properties
		flags $0001
		number 212
	)
)

(instance letterSound of Sound
	(properties
		flags $0001
		number 214
	)
)

(instance willows of Feature
	(properties
		onMeCheck $0008
		lookStr 8
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(if (== (marian script?) waitToDie)
				(proc13_4 1210 11)
			else
				(proc13_4 1210 10)
			)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance ferns of Feature
	(properties
		onMeCheck $0010
		lookStr 9
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(if (== (marian script?) waitToDie)
				(proc13_4 1210 13)
			else
				(proc13_4 1210 12)
			)
		else
			(super doVerb: theVerb param2)
		)
	)
)
