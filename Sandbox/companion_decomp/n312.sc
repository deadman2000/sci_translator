;;; Sierra Script 1.0 - (do not remove this comment)
(script# 312)
(include sci.sh)
(use n000)
(use n013)
(use n311)
(use n806)
(use n851)
(use n852)
(use n950)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	scholar1 0
)

(local
	local0
	local1
	local2 =  1
	[local3 9] = [323 6 2 4 25 35 20 25 22]
	local12
	[local13 11] = [1312 0 1 2 1 2 0 1312 4 1]
	[local24 4] = [1312 5 2]
	[local28 4] = [1312 6 1]
	[local32 4] = [1312 7 1]
	[local36 6] = [1312 8 2 1 2]
	[local42 4] = [1312 11 1]
	[local46 4] = [1312 14 1]
	[local50 4] = [1312 12 2]
	[local54 4] = [1312 13 1]
	[local58 5] = [1312 21 1 2]
	[local63 4] = [1312 19 1]
	[local67 4] = [1312 23 1]
	[local71 4] = [1312 17 1]
	[local75 4] = [1312 20 1]
	[local79 5] = [1312 15 1 1]
	[local84 4] = [1312 18 1]
	[local88 5] = [1312 24 1 2]
	[local93 4] = [1312 26 1]
	[local97 4] = [1312 27 1]
	[local101 7] = [1312 28 2 1 2 2]
	[local108 5] = [1312 32 1 1]
	local113
	scholar1Mover
	local115
	local116
	local117
	local118
)
(instance scholar1 of Actor
	(properties
		cycleSpeed 10
		xStep 4
		moveSpeed 10
	)
	
	(method (init param1 param2 param3 param4 param5 &tmp temp0 temp1 temp2)
		(= local1 param2)
		(= local0 param1)
		(if param5
			(if (> local0 0) (= param5 (- 801 param5)))
			(= temp0 (+ (/ (* param5 (- param4 1)) 801) 1))
		else
			(= temp0 (if (> local0 0) 0 else param4))
		)
		(if (> local0 0)
			(= temp1 (+ temp0 1))
			(= temp2 param4)
		else
			(= temp1 (- temp0 1))
			(= temp2 0)
		)
		(super init:)
		(self
			setLoop: -1
			view: 321
			setCycle: SyncWalk
			posn:
				(proc999_6 param3 (= temp0 (* temp0 2)))
				(proc999_6 param3 (+ temp0 1))
			setMotion: PPath param3 temp1 temp2 lv
		)
		(= scholar1Mover (scholar1 mover?))
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(cond 
					((gClient script?) (super doVerb: theVerb &rest))
					(
						(or
							(> (gEgo distanceTo: scholar1) 50)
							(> (scholar1 x?) 312)
							(< (scholar1 x?) 5)
						)
						(proc13_4 1311 0)
					)
					((== global195 7) (super doVerb: theVerb &rest))
					(else
						(switch global195
							(0
								(gClient setScript: converse)
							)
							(1
								(gClient setScript: converse)
							)
							(4
								(gClient setScript: waitForGive)
							)
							(3
								(if (gEgo has: 17) (gClient setScript: waitForGive))
							)
							(5 (gClient setScript: getMon))
						)
					)
				)
			)
			(2
				(if local2
					(proc13_4 1311 2)
					(= local2 0)
				else
					(proc13_4 1311 3)
				)
			)
			(3 (proc13_4 1311 4))
			(4
				(if
					(or
						(> (gEgo distanceTo: scholar1) 50)
						(> (scholar1 x?) 312)
						(< (scholar1 x?) 5)
					)
					(proc13_4 1311 1)
				else
					(switch param2
						(17
							(if
							(or (proc0_5 203) (== (gClient script?) waitForGive))
								(gClient setScript: give)
							else
								(gClient setScript: noTake)
							)
						)
						(0 (gClient setScript: giveMon))
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
		(DisposeScript 312)
	)
)

(instance showIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if register
					(= register gRegister)
				else
					(= register (Random 1 11))
					(if (<= register gRegister) (-- register))
				)
				(= local116 (+ 12 (CelHigh 71 12 0)))
				(= local117 (+ 245 (CelWide 71 12 0)))
				(= local118
					(Graph grSAVE_BOX 12 245 local116 local117 3)
				)
				(DrawCel 71 12 0 245 12 15 1)
				(DrawCel 71 register 0 256 14 15 1)
				(= cycles 1)
			)
			(1
				(proc851_0 1 local12 @local3 3 self 1)
			)
			(2
				(= local113 (proc851_1))
				(= cycles 2)
			)
			(3
				(Graph grRESTORE_BOX local118)
				(Graph grUPDATE_BOX 12 245 local116 local117 1)
				(= cycles 2)
			)
			(4 (self dispose:))
		)
	)
)

(instance converse of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 70])
		(switch (= state newState)
			(0
				(proc0_3)
				(scholar1 loop: (> (scholar1 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar1)
				(= ticks 10)
			)
			(1
				(if (!= global195 1)
					(proc851_0 @local13 999 @local3 self 0)
				else
					(++ state)
					(= cycles 2)
				)
			)
			(2
				(GetFarText 1312 4 @temp0)
				(GetFarText 1317 gRegister (+ @temp0 (StrLen @temp0)))
				((ScriptID 851 2) show: say: @temp0 0 0 0 self)
			)
			(3
				(if (< global195 1)
					(proc851_0 @local24 999 @local3 self 1)
				else
					(proc851_0 @local50 999 @local3 self 1)
				)
			)
			(4
				(scholar1
					loop: (+ (scholar1 loop?) 2)
					cel: 0
					setCycle: End self
				)
			)
			(5
				(if (!= global195 1)
					(= local12 @local28)
				else
					(= local12 @local32)
				)
				(self setScript: showIt self 0)
			)
			(6 (= cycles 2))
			(7
				(scholar1 setCycle: Beg self)
			)
			(8
				(if local113
					(proc851_0 1 @local42 @local3 3 0 1)
					(= global195 1)
					(self changeState: 12)
				else
					(scholar1 setCycle: End self)
				)
			)
			(9
				(= local12 @local32)
				(self setScript: showIt self 1)
			)
			(10
				(scholar1 setCycle: Beg self)
			)
			(11
				(if local113
					(proc0_6 203)
					(proc851_0 @local36 999 @local3 0 1)
					(if (< global195 1)
						(proc806_1 100)
					else
						(proc806_1 50)
					)
					(= global195 2)
					(gClient setScript: waitForGive)
				else
					(proc851_0 1 @local42 @local3 3 self 1)
					(= global195 1)
				)
			)
			(12
				(scholar1
					setCycle: SyncWalk
					mover: scholar1Mover
					loop: (< (scholar1Mover x?) (scholar1 x?))
				)
				(= cycles 2)
			)
			(13 (proc0_4) (self dispose:))
		)
	)
)

(instance waitForGive of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(User canInput: 1)
				(gIconBar enable: 7 6 curIcon: (gIconBar at: 7))
				(= cycles 4)
			)
			(1
				(global1 setCursor: 999 1)
				(= cycles 4)
			)
			(2
				(scholar1 loop: (> (scholar1 x?) (gEgo x?)) mover: 0)
				(if (proc999_5 global195 4 3)
					(proc851_0 1 @local46 @local3 3 self 1)
				else
					(if (== global195 2) (= global195 3))
					(= cycles 2)
				)
			)
			(3 (= seconds 7))
			(4
				(proc851_0 1 @local54 @local3 3 self 1)
			)
			(5
				(proc0_3)
				(scholar1
					setCycle: SyncWalk
					mover: scholar1Mover
					loop: (< (scholar1Mover x?) (scholar1 x?))
				)
				(= ticks 5)
			)
			(6
				(proc0_4)
				(= global195 4)
				(self dispose:)
			)
		)
	)
)

(instance lv of CueObj
	(properties)
	
	(method (cue &tmp temp0)
		(proc311_1 local1 local0 scholar1)
	)
)

(instance getMon of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (!= global195 5)
					(proc851_0 1 @local84 @local3 3 self 1)
				else
					(++ state)
					(proc851_0 @local58 999 @local3 self 1)
				)
			)
			(1
				(proc851_0 1 @local63 999 0 self 1)
			)
			(2
				(gPennies put: 7)
				(gHapennies put: 6)
				(gFarthings put: 5)
				(if (not (proc0_5 58))
					(= global195 6)
				else
					(= global195 7)
					(proc0_6 217)
				)
				(self dispose:)
			)
		)
	)
)

(instance noTake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(scholar1 loop: (> (scholar1 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar1 self)
			)
			(1
				(proc0_9 scholar1 gEgo)
				(= ticks 10)
			)
			(2
				(proc851_0 @local88 999 @local3 self 1)
			)
			(3
				(scholar1
					setCycle: SyncWalk
					mover: scholar1Mover
					loop: (< (scholar1Mover x?) (scholar1 x?))
				)
				(= cycles 2)
			)
			(4
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance giveMon of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(scholar1 loop: (> (scholar1 x?) (gEgo x?)) mover: 0)
				(proc0_9 gEgo scholar1 self)
			)
			(1
				(if (>= (gMoney doit:) 1)
					(gMoney put:)
					(proc0_9 scholar1 gEgo)
					(= cycles 2)
				else
					(self changeState: 4)
				)
			)
			(2
				(cond 
					((== global195 5) (proc851_0 @local101 999 @local3 self 1))
					((proc999_5 global195 6 7) (proc851_0 1 @local97 @local3 3 self 1))
					(else (proc851_0 1 @local93 @local3 3 self 1))
				)
			)
			(3
				(if (== global195 5)
					(if (proc851_1)
						(self setScript: getMon self)
					else
						(proc851_0 1 @local108 @local3 3 self 1)
					)
				else
					(= cycles 2)
				)
			)
			(4
				(scholar1
					setCycle: SyncWalk
					mover: scholar1Mover
					loop: (< (scholar1Mover x?) (scholar1 x?))
				)
				(= cycles 2)
			)
			(5
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance give of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo put: 17)
				(proc0_4)
				(= cycles 5)
			)
			(1
				(proc0_3)
				(proc0_6 58)
				(proc0_9 gEgo scholar1)
				(= ticks 10)
			)
			(2
				(if (== global195 4)
					(proc851_0 1 @local79 @local3 3 self 0)
				else
					(proc851_0 1 @local67 @local3 3 self 0)
				)
			)
			(3
				(if (== global195 4)
					(proc806_1 25)
				else
					(proc806_1 50)
				)
				(proc851_0 1 @local71 @local3 3 self 1)
			)
			(4
				(if (proc851_1)
					(self setScript: getMon self)
				else
					(= global195 5)
					(proc851_0 1 @local75 @local3 3 self 1)
				)
			)
			(5
				(scholar1
					setCycle: SyncWalk
					mover: scholar1Mover
					loop: (< (scholar1Mover x?) (scholar1 x?))
				)
				(= cycles 2)
			)
			(6 (proc0_4) (self dispose:))
		)
	)
)
