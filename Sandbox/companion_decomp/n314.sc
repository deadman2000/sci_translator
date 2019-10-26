;;; Sierra Script 1.0 - (do not remove this comment)
(script# 314)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n851)
(use n852)
(use n950)
(use n992)
(use n998)
(use n999)

(public
	scholar3 0
)

(local
	local0 =  1
	local1
	[local2 7] = [1314 0 1 2 1 2]
	[local9 4] = [1314 5 2]
	[local13 4] = [1314 6 2]
	[local17 4] = [1314 8 2]
	[local21 4] = [1314 7 2]
	[local25 5] = [1314 9 1 2]
	[local30 5] = [1314 11 1 2]
	[local35 5] = [1314 13 2 2]
	[local40 4] = [1314 15 2]
	[local44 4] = [1314 16 2]
	[local48 5] = [1314 17 2 2]
	[local53 4] = [1314 19 2]
	[local57 6] = [1314 20 2 1 2]
	local63
	[theRegister 5]
	local69
	local70
	local71
	scholar3Mover
	scholar3Loop
	local74
	local75
	[local76 9] = [323 3 2 4 25 35 20 25 24]
)
(instance scholar3 of Actor
	(properties
		cycleSpeed 10
		moveSpeed 10
	)
	
	(method (init param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2)
		(= local75 param2)
		(= local74 param1)
		(if param5
			(if (> local74 0) (= param5 (- 801 param5)))
			(= temp0 (+ (/ (* param5 (- param4 1)) 801) 1))
		else
			(= temp0 (if (> local74 0) 0 else param4))
		)
		(if (> local74 0)
			(= temp1 (+ temp0 1))
			(= temp2 param4)
		else
			(= temp1 (- temp0 1))
			(= temp2 0)
		)
		(super init:)
		(self
			view: 320
			setCycle: SyncWalk
			posn:
				(proc999_6 param3 (= temp0 (* temp0 2)))
				(proc999_6 param3 (+ temp0 1))
			setMotion: PPath param3 temp1 temp2 leave
		)
	)
	
	(method (dispose)
		(if (== global197 2) (= global197 3))
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(cond 
					((gClient script?) (super doVerb: theVerb &rest))
					(
						(or
							(> (gEgo distanceTo: scholar3) 50)
							(> (scholar3 x?) 312)
							(< (scholar3 x?) 5)
						)
						(proc13_4 1311 0)
					)
					(global197
						(switch global197
							(1
								(proc851_0 @local25 999 @local76 0 1)
								(= global197 2)
							)
							(2
								(proc851_0 @local21 999 @local76 0 1)
							)
							(3
								(gClient setScript: converse)
							)
							(4
								(proc851_0 @local44 999 @local76 0 1)
							)
						)
					)
					(else (gClient setScript: converse))
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
						(> (gEgo distanceTo: scholar3) 50)
						(> (scholar3 x?) 312)
						(< (scholar3 x?) 5)
					)
					(proc13_4 1311 0)
				else
					(switch param2
						(17
							(proc851_0 @local48 999 @local76 0 1)
						)
						(0
							(if global197
								(proc851_0 @local53 999 @local76 0 1)
							else
								(proc851_0 @local57 999 @local76 0 1)
							)
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
		(DisposeScript 314)
	)
)

(instance leave of CueObj
	(properties)
	
	(method (cue &tmp temp0)
		(proc311_1 local75 local74 scholar3)
	)
)

(instance showIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(scholar3 setCycle: End self)
			)
			(1
				(= local69 (+ 12 (CelHigh 71 12 0)))
				(= local70 (+ 245 (CelWide 71 12 0)))
				(= local71 (Graph grSAVE_BOX 12 245 local69 local70 3))
				(DrawCel 71 12 0 245 12 15 1)
				(DrawCel 71 [theRegister local63] 0 256 14 15 1)
				(= cycles 1)
			)
			(2
				(= local1 (proc851_1))
				(= cycles 2)
			)
			(3
				(Graph grRESTORE_BOX local71)
				(Graph grUPDATE_BOX 12 245 local69 local70 1)
				(= cycles 2)
			)
			(4
				(scholar3 setCycle: Beg self)
			)
			(5 (self dispose:))
		)
	)
)

(instance converse of Script
	(properties)
	
	(method (dispose)
		(scholar3
			setCycle: Walk
			mover: scholar3Mover
			loop: scholar3Loop
		)
		(super dispose:)
	)
	
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
				(= scholar3Mover (scholar3 mover?))
				(= scholar3Loop (scholar3 loop?))
				(scholar3 loop: (> (scholar3 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar3 self)
			)
			(1
				(scholar3 loop: (+ (scholar3 loop?) 2) cel: 0)
				(= cycles 2)
			)
			(2
				(if (== global197 3)
					(= state (+ state 2))
					(proc851_0 @local30 999 @local76 self 1)
				else
					(proc851_0 @local2 999 @local76 self 0)
				)
			)
			(3
				(GetFarText 1314 4 @temp2)
				(GetFarText 1317 gRegister (+ @temp2 (StrLen @temp2)))
				((ScriptID 851 2) show: say: @temp2 0 0 0 self)
			)
			(4
				(proc851_0 @local9 999 @local76 self 1)
			)
			(5
				(self setScript: showIt self)
			)
			(6
				(cond 
					((== global197 3)
						(if local1
							(proc851_0 @local35 999 @local76 self 1)
						else
							(proc851_0 @local40 999 @local76 self 1)
						)
						(= global197 4)
					)
					(local1 (= global197 1) (proc851_0 @local17 999 @local76 self 1))
					(else (= global197 2) (proc851_0 @local13 999 @local76 self 1))
				)
			)
			(7 (proc0_4) (self dispose:))
		)
	)
)
