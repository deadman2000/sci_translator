;;; Sierra Script 1.0 - (do not remove this comment)
(script# 531)
(include sci.sh)
(use n000)
(use n806)
(use n813)
(use n851)
(use n945)
(use n989)
(use n992)
(use n999)

(public
	monkCode 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 4] = [1531 66 1]
	[local13 5] = [1531 10 1 2]
	[local18 4] = [1531 12 1]
	[local22 8] = [1531 59 1 2 1 1 1]
	[local30 5] = [1531 64 1 2]
	[local35 5] = [1531 67 1 2]
	[local40 8] = [1531 13 1 2 1 2 1]
	[local48 5] = [1531 18 1 1]
	[local53 4] = [1531 18 1]
	[local57 5] = [1531 20 1 1]
	[local62 4] = [1531 20 1]
	[local66 5] = [1531 22 1 1]
	[local71 4] = [1531 22 1]
	[local75 4] = [1531 57 1]
	[local79 6] = [1531 36 1 2 2]
	[local85 10] = [1531 40 2 1 2 1 2 1 2]
	[local95 9] = [1531 47 1 2 1 2 2 2]
	[local104 6] = [1531 53 1 2 1]
	[local110 4] = [1531 56 1]
	[local114 5] = [1531 24 1 2]
	[local119 6] = [1531 26 1 2 1]
	[local125 7] = [1531 29 1 2 1 2]
	[local132 5] = [1531 0 1 1]
	[local137 5] = [1531 2 1 1]
	[local142 4] = [1531 4 1]
	[local146 4] = [1531 5 1]
	[local150 4] = [1531 6 1]
	[local154 5] = [1531 8 1 1]
	[local159 4] = [1531 7 1]
	local163
	local164
	local165
	local166
	local167
)
(instance monkCode of Code
	(properties)
	
	(method (init)
		((ScriptID 530 1) actions: vbKeeperMonk)
		((ScriptID 530 2) actions: vbGateMonk)
	)
)

(instance payBill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= register (gMoney doit:))
				(if (not register) (self dispose:) (return))
				(cond 
					((proc0_5 86)
						(if (and (>= register 48) (not (proc0_5 116)))
							(++ state)
							(proc851_0 @local125 @local0 999 self)
							(proc806_1 20 116)
						else
							(= cycles 1)
						)
					)
					((and (not local167) (proc0_5 31)) (= local167 1) (proc851_0 @local114 @local0 999 self 1))
					((not local166) (= local166 1) (proc851_0 @local119 @local0 999 self 1))
					(else (= cycles 1))
				)
			)
			(1
				((ScriptID 530 1)
					setScript: (ScriptID 530 3) 0 register
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance tryNOpen of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					(
						(or
							(and (proc0_5 25) (== global130 6))
							(> global130 6)
						)
						(proc851_0 @local154 @local0 0 self)
						(= state (+ state 4))
					)
					((and (proc0_5 31) (gEgo has: 11)) (proc851_0 @local132 @local0 0 self))
					((proc0_5 117)
						(cond 
							((proc0_5 116) (proc851_0 @local150 @local0 0 self))
							(local165 (proc851_0 @local146 @local0 0 self))
							((not (gEgo has: 11)) (proc851_0 @local159 @local0 0 self))
							(else
								(proc851_0 @local142 @local0 0 self)
								(= state (+ state 4))
							)
						)
					)
					(else
						(proc851_0 @local137 @local0 0 self)
						(= state (+ state 4))
					)
				)
			)
			(1
				((ScriptID 530 1) setMotion: PolyPath 210 113 self)
			)
			(2
				(gateSound play:)
				((ScriptID 530 2)
					signal: (& ((ScriptID 530 2) signal?) $feff)
					startUpd:
					setCycle: End self
				)
			)
			(3 (gClient newRoom: 550))
			(4
				((ScriptID 530 1) setMotion: PolyPath 265 133 self)
			)
			(5
				((ScriptID 530 1) setHeading: 270 self)
			)
			(6 (proc0_4) (self dispose:))
		)
	)
)

(instance fillCask of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc806_1 25)
				(proc851_0 @local79 9 @local0 self)
			)
			(1
				((ScriptID 530 1) setHeading: 0 self)
			)
			(2 (= seconds 2))
			(3
				((ScriptID 530 1) setHeading: 270 self)
			)
			(4
				(proc0_6 31)
				(proc851_0 @local85 9 @local0 self)
			)
			(5 (self dispose:))
		)
	)
)

(instance vbKeeperMonk of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(switch theVerb
				(5
					(cond 
						((proc0_5 117)
							(switch (+ (if (proc0_5 116) 2 else 0) local165)
								(0
									(proc851_0 @local40 @local0 9)
								)
								(1
									(if
										(or
											(and (proc0_5 25) (== global130 6))
											(> global130 6)
										)
										(proc851_0 @local53 @local0)
									else
										(proc851_0 @local48 @local0)
									)
								)
								(2
									(if
										(or
											(and (proc0_5 25) (== global130 6))
											(> global130 6)
										)
										(proc851_0 @local62 @local0)
									else
										(proc851_0 @local57 @local0)
									)
								)
								(3
									(if
										(or
											(and (proc0_5 25) (== global130 6))
											(> global130 6)
										)
										(proc851_0 @local71 @local0)
									else
										(proc851_0 @local66 @local0)
									)
								)
							)
						)
						((and (proc0_5 31) (gEgo has: 11))
							(if local164
								(proc851_0 @local18 @local0)
							else
								(proc851_0 @local13 @local0 9)
								(= local164 1)
							)
						)
						(else
							(switch local163
								(0
									(++ local163)
									(if (not (proc0_6 187))
										(proc851_0 @local22 @local0 9)
									else
										(proc851_0 @local35 9 @local0)
									)
								)
								(1
									(proc851_0 @local30 9 @local0)
									(++ local163)
								)
								(else 
									(proc851_0 @local9 @local0)
								)
							)
						)
					)
				)
				(4
					(switch param2
						(0
							((ScriptID 530 1) setScript: payBill)
							(return 1)
						)
						(11
							(cond 
								((proc0_5 31) (proc851_0 @local75 @local0))
								(
									(or
										(and (proc0_5 25) (== global130 6))
										(> global130 6)
									)
									(gEgo put: 11)
									(proc851_0 @local110 @local0)
								)
								((proc0_5 117)
									(gEgo put: 11)
									(proc806_1 10)
									(if (proc0_5 116)
										(proc851_0 @local104 9 @local0)
									else
										(proc851_0 @local95 9 @local0)
									)
								)
								(else (gClient setScript: fillCask))
							)
							(= local165 1)
						)
						(else  (return 0))
					)
				)
				(else  (return 0))
			)
		)
	)
)

(instance vbGateMonk of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(gClient setScript: tryNOpen)
				(return 1)
			)
		)
		(return 0)
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 532
	)
)
