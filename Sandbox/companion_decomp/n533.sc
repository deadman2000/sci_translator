;;; Sierra Script 1.0 - (do not remove this comment)
(script# 533)
(include sci.sh)
(use n000)
(use n806)
(use n813)
(use n851)
(use n852)
(use n930)
(use n946)
(use n951)
(use n961)
(use n989)
(use n992)
(use n999)

(public
	day10 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 9] = [1533 0 1 2 1 2 1 1]
	[local18 6] = [1533 6 2 1 1]
	[local24 4] = [1533 9 1]
	[local28 6] = [1533 10 1 2 1]
	[local34 4] = [1533 13 1]
	[local38 8] = [1533 14 2 1 2 2 1]
	[local46 9] = [1533 19 2 1 2 1 2 1]
	[local55 4] = [1533 25 2]
	[local59 4] = [1533 26 1]
	[local63 8] = [1533 27 1 2 1 1 2]
	[local71 4] = [1533 32 1]
	[local75 6] = [1533 33 1 2 1]
	[local81 4] = [1533 36 2]
	[local85 4] = [1533 37 1]
	[local89 5] = [1533 38 2 1]
	[local94 4] = [1533 40 1]
	[local98 5] = [1533 41 1 2]
	[local103 5] = [1533 43 2 1]
	[local108 6] = [1533 45 2 1 1]
	[local114 5] = [1533 48 2 1]
	[local119 5] = [1533 50 2 1]
	[local124 4] = [1533 53 1]
	local128
	[local129 9] = [257 124 233 121 212 123 183 129 -32768]
)
(instance day10 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo posn: 153 220 setHeading: 0 setMotion: MoveFwd 40)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 3
							init:
								150
								240
								171
								183
								198
								176
								226
								176
								226
								170
								254
								170
								247
								164
								290
								151
								235
								158
								227
								148
								202
								148
								202
								136
								209
								136
								209
								129
								50
								129
								85
								132
								43
								162
								0
								181
							yourself:
						)
						((Polygon new:)
							type: 2
							init:
								175
								141
								136
								188
								93
								188
								97
								180
								83
								180
								77
								187
								46
								187
								91
								148
								142
								148
								148
								141
							yourself:
						)
				)
				(= seconds 2)
			)
			(1
				((ScriptID 530 1)
					approachX: 183
					approachY: 160
					setMotion: PPath @local129 self
				)
			)
			(2
				(proc0_9 (ScriptID 530 1) gEgo self)
			)
			(3 (= cycles 2))
			(4
				(= register
					(+
						(if (proc0_5 140) 2 else 0)
						(if (proc0_5 210) 1 else 0)
					)
				)
				(proc0_6 210)
				(++ global155)
				(switch register
					(0
						(proc851_0 @local9 @local0 2 self 0)
					)
					(1
						(proc851_0 @local24 @local0 0 self)
					)
					(2
						(proc851_0 @local28 @local0 2 self)
					)
					(3
						(proc851_0 @local34 @local0 0 self)
					)
				)
				(if register (++ state))
			)
			(5
				(proc851_0 @local18 @local0 999 self)
			)
			(6
				((ScriptID 530 1) ignoreActors: 0 actions: guardTunnels)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance guardTunnels of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(switch theVerb
				(3
					(proc851_0 @local124 @local0 0)
				)
				(5
					(cond 
						((proc0_5 32) (= local128 2))
						((proc0_5 31) (= local128 1) (proc0_6 32))
						(else (= local128 0) (proc0_6 31))
					)
					(if (proc0_5 140)
						(switch local128
							(0
								(proc851_0 @local38 @local0 2)
							)
							(1
								(proc851_0 @local46 @local0 999)
							)
							(2
								((ScriptID 530 1) setScript: letIn 0 1)
							)
						)
					else
						(switch local128
							(0
								(proc851_0 @local38 @local0 2)
							)
							(1
								(proc851_0 @local75 @local0 999)
							)
							(2
								((ScriptID 530 1) setScript: letIn 0 0)
							)
						)
					)
				)
				(10
					((ScriptID 530 1) setScript: threaten)
				)
				(4
					(if (== param2 0)
						((ScriptID 530 1) setScript: bribe)
						(return 1)
					else
						(return 0)
					)
				)
			)
		)
	)
)

(instance letIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc806_1 50)
				(proc851_0
					(if register @local55 else @local81)
					@local0
					2
					self
					0
				)
			)
			(1
				(proc851_0 @local63 @local0 2 self 0)
			)
			(2
				(proc851_0
					(if register @local59 else @local85)
					@local0
					2
					self
				)
			)
			(3
				(gEgo
					moveSpeed: 3
					cycleSpeed: 3
					setMotion: PFollow (ScriptID 530 1) 25
				)
				((ScriptID 530 1)
					moveSpeed: 3
					cycleSpeed: 3
					setMotion: MoveTo 181 107 self
				)
			)
			(4
				(if register
					(proc851_0 @local71 @local0 0 self)
				else
					(= cycles 1)
				)
			)
			(5 (gClient newRoom: 550))
		)
	)
)

(instance threaten of Script
	(properties)
	
	(method (dispose)
		(shootSound stop: dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 530 1) self)
			)
			(1
				(gEgo view: 4 cel: 0 setCycle: End self)
			)
			(2
				(shootSound play:)
				(gEgo view: 5 cel: 0)
				(gEgo setCycle: CT (- (gEgo lastCel:) 1) 1 self)
			)
			(3
				(proc851_0 @local89 @local0 2 self)
			)
			(4 (gEgo setCycle: Beg self))
			(5
				(gEgo
					view: 0
					setCycle: StopWalk 1
					setMotion: PFollow (ScriptID 530 1) 60
				)
				((ScriptID 530 1) setMotion: MoveTo 196 113 self)
			)
			(6
				(proc0_9 (ScriptID 530 1) (ScriptID 530 2) self)
			)
			(7
				((ScriptID 530 2)
					signal: (& ((ScriptID 530 2) signal?) $feff)
					startUpd:
					setCycle: End self
				)
			)
			(8
				(gEgo view: 5 cel: 0 setMotion: 0)
				(gEgo setCycle: CT (- (gEgo lastCel:) 1) 1 self)
			)
			(9 (= ticks 20))
			(10
				(proc851_0 1 @local94 2 3 self)
			)
			(11
				((ScriptID 530 1) setMotion: MoveTo 251 123 self)
			)
			(12
				(proc0_9 (ScriptID 530 1) gEgo self)
			)
			(13
				(proc851_0 @local98 @local0 2 self)
			)
			(14 (gEgo setCycle: Beg self))
			(15
				(gEgo
					view: 0
					setCycle: StopWalk 1
					setMotion: MoveTo 191 107 self
				)
			)
			(16
				(proc806_1 -75)
				(proc0_6 141)
				(gClient newRoom: 550)
			)
		)
	)
)

(instance bribe of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= register (gMoney doit:))
				(if (not register) (self dispose:) (return))
				(proc851_0
					(cond 
						((proc0_5 140) (if (< register 40) @local103 else @local108))
						((< register 40) @local114)
						(else @local119)
					)
					@local0
					2
					self
				)
			)
			(1
				(if (< register 40)
					(gMoney put:)
					(self dispose:)
				else
					(proc806_1 10)
					(gEgo
						moveSpeed: 3
						cycleSpeed: 3
						setMotion: PFollow (ScriptID 530 1) 25
					)
					((ScriptID 530 1)
						moveSpeed: 3
						cycleSpeed: 3
						setMotion: MoveTo 181 107 self
					)
				)
			)
			(2 (gClient newRoom: 550))
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)
