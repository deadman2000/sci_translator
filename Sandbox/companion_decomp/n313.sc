;;; Sierra Script 1.0 - (do not remove this comment)
(script# 313)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n851)
(use n852)
(use n927)
(use n930)
(use n945)
(use n950)
(use n992)
(use n998)
(use n999)

(public
	scholar2 0
)

(local
	local0 =  1
	local1
	local2
	[local3 9] = [323 0 2 4 26 35 21 24 23]
	[local12 3] = [-1 4414 19]
	[local15 3] = [-1 4420 19]
	[local18 11] = [1313 0 1 2 1 2 0 1313 4 1]
	[local29 4] = [1313 5 2]
	[local33 4] = [1313 6 1]
	[local37 4] = [1313 7 1]
	[local41 5] = [1313 8 1 2]
	[local46 6] = [1313 10 2 1 2]
	[local52 4] = [1313 13 1]
	[local56 4] = [1313 14 1]
	[local60 6] = [1313 15 1 2 1]
	[local66 4] = [1313 18 1]
	[local70 4] = [1313 19 1]
	local74
	scholar2Mover
	local76
	local77
	local78
	local79
	local80
	[theRegister 5]
	local86
	local87
	local88
	local89
	local90
	local91
	local92
	local93
	[local94 16] = [53 252 61 264 102 252 73 246 75 219 68 223 50 212 94 268]
	[local110 16] = [75 79 176 173 66 63 179 167 61 72 167 174 77 65 169 150]
	[local126 16] = [53 250 61 264 108 250 73 244 79 220 68 223 50 212 94 268]
	[local142 16] = [57 51 162 157 46 42 158 143 44 52 146 156 64 51 151 137]
	[local158 16] = [245 67 294 35 240 34 287 38 255 53 293 38 257 29 293 38]
	[local174 16] = [49 42 157 158 40 75 142 152 48 40 149 147 52 75 75 159]
	[local190 16] = [286 34 280 68 272 38 284 60 279 42 281 24 293 39 283 45]
	[local206 16] = [58 61 178 129 47 58 154 171 45 49 166 170 75 47 113 178]
)
(instance roger of Actor
	(properties
		view 753
	)
)

(instance giles of Actor
	(properties
		view 753
	)
)

(instance scholar2 of Actor
	(properties
		cycleSpeed 10
		moveSpeed 10
	)
	
	(method (init param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2)
		(= local2 param2)
		(= local1 param1)
		(Load rsSCRIPT 927)
		(Load rsSCRIPT 930)
		(if param5
			(if (> local1 0) (= param5 (- 801 param5)))
			(= temp0 (+ (/ (* param5 (- param4 1)) 801) 1))
		else
			(= temp0 (if (> local1 0) 0 else param4))
		)
		(if (> local1 0)
			(= temp1 (+ temp0 1))
			(= temp2 param4)
		else
			(= temp1 (- temp0 1))
			(= temp2 0)
		)
		(super init:)
		(self
			view: 322
			setCycle: SyncWalk
			posn:
				(proc999_6 param3 (= temp0 (* temp0 2)))
				(proc999_6 param3 (+ temp0 1))
			setMotion: PPath param3 temp1 temp2 leave
		)
		(= scholar2Mover (scholar2 mover?))
	)
	
	(method (doVerb theVerb param2 &tmp temp0 temp1 temp2)
		(= temp2
			(cond 
				((scholar2 inRect: 0 0 160 96) 0)
				((scholar2 inRect: 160 0 319 96) 1)
				((scholar2 inRect: 0 96 160 189) 2)
				((scholar2 inRect: 160 96 319 189) 3)
			)
		)
		(= temp1 0)
		(= temp0 280)
		(while (<= temp0 global11)
			(= local86 [local158 (+ temp2 (* temp1 4))])
			(= local87 [local174 (+ temp2 (* temp1 4))])
			(= local88 [local190 (+ temp2 (* temp1 4))])
			(= local89 [local206 (+ temp2 (* temp1 4))])
			(= local90 [local94 (+ temp2 (* temp1 4))])
			(= local91 [local110 (+ temp2 (* temp1 4))])
			(= local92 [local126 (+ temp2 (* temp1 4))])
			(= local93 [local142 (+ temp2 (* temp1 4))])
			(++ temp1)
			(= temp0 (+ temp0 10))
		)
		(switch theVerb
			(5
				(cond 
					((gClient script?) (super doVerb: theVerb &rest))
					(
						(or
							(> (gEgo distanceTo: scholar2) 50)
							(> (scholar2 x?) 312)
							(< (scholar2 x?) 5)
						)
						(proc13_4 1311 0)
					)
					(else
						(gClient
							setScript:
							(switch global196
								(0 converse)
								(1 converse)
								(2 youBlewIt)
							)
						)
					)
				)
			)
			(2
				(if local0
					(proc13_4 1311 2)
					(= local0 0)
				else
					(proc13_4 1311 3)
				)
			)
			(4
				(if
					(or
						(> (gEgo distanceTo: scholar2) 50)
						(> (scholar2 x?) 312)
						(< (scholar2 x?) 5)
					)
					(proc13_4 1311 1)
				else
					(switch param2
						(17
							(gClient setScript: rottingRichard)
						)
						(0
							(gClient setScript: offerBucks)
						)
						(else 
							(super doVerb: theVerb &rest)
						)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (delete)
		(super delete:)
		(DisposeScript 313)
	)
)

(instance showIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(scholar2 setCycle: End self)
			)
			(1
				(if (not (gNewCast contains: roger))
					(self setScript: hereTheyCome self)
				else
					(= cycles 2)
				)
			)
			(2
				(= local77 (+ 12 (CelHigh 71 12 0)))
				(= local78 (+ 245 (CelWide 71 12 0)))
				(= local79 (Graph grSAVE_BOX 12 245 local77 local78 3))
				(DrawCel 71 12 0 245 12 15 1)
				(DrawCel 71 [theRegister local80] 0 256 14 15 1)
				(= cycles 2)
			)
			(3
				(if (!= local80 0)
					(proc851_0 1 @local33 @local3 3 self 1)
				else
					(= cycles 2)
				)
			)
			(4
				(= local74 (proc851_1))
				(= cycles 2)
			)
			(5
				(Graph grRESTORE_BOX local79)
				(Graph grUPDATE_BOX 12 245 local77 local78 1)
				(= cycles 2)
			)
			(6
				(scholar2 setCycle: Beg self)
			)
			(7
				(++ local80)
				(self dispose:)
			)
		)
	)
)

(instance youBlewIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(scholar2 loop: (> (scholar2 x?) (gEgo x?)) mover: 0)
				(proc851_0 1 @local56 @local3 3 self 1)
			)
			(1
				(self setScript: hereTheyCome self)
			)
			(2 (gClient setScript: sDieNow))
		)
	)
)

(instance menLeave of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (< (scholar2 x?) 160)
					(= register 340)
				else
					(= register -20)
				)
				(roger
					ignoreActors: 1
					illegalBits: 0
					setMotion: PolyPath register (gEgo y?) self
				)
				(giles
					ignoreActors: 1
					illegalBits: 0
					setMotion: PolyPath register (gEgo y?) self
				)
				(= ticks 1000)
			)
			(1
				(if
					(and
						(gNewCast contains: giles)
						(== (giles x?) register)
					)
					(giles dispose: delete:)
				)
				(if
					(and
						(gNewCast contains: roger)
						(== (roger x?) register)
					)
					(roger dispose: delete:)
				)
			)
			(2
				(= ticks 0)
				(if
					(and
						(gNewCast contains: giles)
						(== (giles x?) register)
					)
					(giles dispose: delete:)
				)
				(if
					(and
						(gNewCast contains: roger)
						(== (roger x?) register)
					)
					(roger dispose: delete:)
				)
				(= cycles 2)
			)
			(3 (self dispose:))
		)
	)
)

(instance offerBucks of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (> (gEgo x?) (scholar2 x?))
					(= temp0 1)
				else
					(= temp0 0)
				)
				(scholar2 loop: (> (scholar2 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar2)
				(= ticks 10)
			)
			(1
				(proc851_0 1 @local70 @local3 3 self 1)
			)
			(2
				(scholar2
					setCycle: Walk
					mover: scholar2Mover
					loop: (< (scholar2Mover x?) (scholar2 x?))
				)
				(= cycles 2)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance leave of CueObj
	(properties)
	
	(method (cue &tmp temp0)
		(proc311_1 local2 local1 scholar2)
	)
)

(instance rottingRichard of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (> (gEgo x?) (scholar2 x?))
					(= temp0 1)
				else
					(= temp0 0)
				)
				(scholar2 loop: (> (scholar2 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar2 self)
				(proc0_9 scholar2 gEgo self)
			)
			(1)
			(2 (= cycles 2))
			(3
				(proc851_0 1 @local66 @local3 3 self 1)
			)
			(4
				(giles
					x: (if (< (scholar2 x?) 160) 350 else -30)
					y: (gEgo y?)
					init:
					setCycle: Walk
					setAvoider: PAvoider
					setMotion: PolyPath local88 local89 self
				)
			)
			(5
				(proc0_9 giles gEgo)
				(roger
					x: (if (< (scholar2 x?) 160) 330 else -10)
					y: (gEgo y?)
					init:
					setCycle: Walk
					setAvoider: PAvoider
					setMotion: PolyPath local86 local87 self
				)
			)
			(6
				(proc0_9 roger gEgo)
				(= cycles 2)
			)
			(7
				(gEgo setAvoider: 0 setMotion: 0)
				(giles setAvoider: 0 setMotion: 0 dispose: delete:)
				(roger setAvoider: 0 setMotion: 0 dispose: delete:)
				(scholar2 setAvoider: 0 mover: scholar2Mover)
				(= global145 36)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance converse of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 [temp2 70])
		(switch (= state newState)
			(0
				(proc0_3)
				(= temp0 0)
				(while (< temp0 5)
					(= register (Random 1 11))
					(if (<= register gRegister) (-- register))
					(= [theRegister temp0] register)
					(= temp1 0)
					(while (< temp1 temp0)
						(if (== [theRegister temp1] [theRegister temp0])
							(-- temp0)
						)
						(++ temp1)
					)
					(++ temp0)
				)
				(= local80 0)
				(scholar2 loop: (> (scholar2 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar2 self)
			)
			(1
				(scholar2 loop: (+ (scholar2 loop?) 2) cel: 0)
				(= cycles 2)
			)
			(2
				(if (< global196 1)
					(proc851_0 @local18 999 @local3 self 0)
				else
					(++ state)
					(= cycles 1)
				)
			)
			(3
				(GetFarText 1313 4 @temp2)
				(GetFarText 1317 gRegister (+ @temp2 (StrLen @temp2)))
				((ScriptID 851 2) show: say: @temp2 0 0 0 self)
			)
			(4
				(proc0_3)
				(if (< global196 1)
					(proc851_0 @local29 999 @local3 self 1)
				else
					(proc851_0 @local41 999 @local3 self 1)
				)
			)
			(5
				(self setScript: showIt self)
			)
			(6 (= cycles 2))
			(7
				(cond 
					(local74
						(proc851_0 1 @local52 @local3 3 0 1)
						(++ global196)
						(++ state)
						(self setScript: menLeave self)
					)
					((<= local80 4) (= state 4) (= cycles 2))
					(else (= cycles 2))
				)
			)
			(8
				(if (< global196 1)
					(proc851_0 1 @local37 @local3 3 0 1)
					(= global196 1)
					(self setScript: menLeave self)
				else
					(proc851_0 @local46 999 @local3 0 1)
					(gClient setScript: sDieNow)
				)
			)
			(9
				(scholar2
					setCycle: Walk
					mover: scholar2Mover
					loop: (< (scholar2Mover x?) (scholar2 x?))
				)
				(= cycles 2)
			)
			(10 (proc0_4) (self dispose:))
		)
	)
)

(instance sDieNow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo
					setAvoider: PAvoider
					ignoreActors: 1
					setMotion: PolyPath local90 local91 self
				)
				(giles
					setAvoider: 0
					ignoreActors: 1
					setMotion: PChase gEgo 80 self
				)
				(scholar2
					setCycle: Walk
					ignoreActors: 1
					setMotion: PolyPath local92 local93 self
				)
				(roger
					setAvoider: 0
					ignoreActors: 1
					setMotion: PChase gEgo 40 self
				)
			)
			(1)
			(2)
			(3)
			(4
				(proc0_9 gEgo scholar2)
				(proc0_9 scholar2 gEgo)
				(= ticks 10)
			)
			(5
				(proc851_0 @local60 @local15 @local12 self 1)
			)
			(6
				(gEgo setAvoider: 0 setMotion: 0)
				(giles setAvoider: 0 setMotion: 0 dispose: delete:)
				(roger setAvoider: 0 setMotion: 0 dispose: delete:)
				(scholar2 setAvoider: 0 mover: scholar2Mover)
				(= global145 36)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance hereTheyCome of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger
					x: (if (< (scholar2 x?) 160) 330 else -10)
					y: (gEgo y?)
					init:
					ignoreActors: 0
					setCycle: Walk
					setAvoider: PAvoider
					setMotion: PolyPath local86 local87 self
				)
			)
			(1
				(roger
					loop: (if (< (gEgo x?) (roger x?)) 1 else 0)
					ignoreActors: 1
				)
				(= ticks 5)
			)
			(2
				(giles
					x: (if (< (scholar2 x?) 160) 350 else -10)
					y: (gEgo y?)
					init:
					ignoreActors: 0
					setCycle: Walk
					setAvoider: PAvoider
					setMotion: PolyPath local88 local89 self
				)
			)
			(3
				(giles loop: (if (< (gEgo x?) (roger x?)) 1 else 0))
				(= ticks 5)
			)
			(4 (self dispose:))
		)
	)
)
