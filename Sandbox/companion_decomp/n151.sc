;;; Sierra Script 1.0 - (do not remove this comment)
(script# 151)
(include sci.sh)
(use n000)
(use n851)
(use n945)
(use n961)
(use n992)
(use n998)
(use n999)

(public
	dayOne 0
	dayTwo 1
	dayThree 2
	dayFour 3
	dayFive 4
	noRobeAbbeyMonkMet 5
	noRobeFensMonkMet 6
	secondNoRescue 7
	thirdNoRescue 8
	day6B 9
	day6A 10
	day7 11
	day8 12
	day8Puck 13
	day9Will 14
	day10 15
	day11 16
	day12 17
	day13 18
)

(local
	local0
	[local1 5] = [1151 0 1 2]
	[local6 5] = [1151 2 1 2]
	[local11 6] = [1151 4 1 2 2]
	[local17 6] = [1151 7 1 2 2]
	[local23 5] = [1151 10 1 2]
	[local28 58] = [1151 12 1 0 1151 13 1 2 0 1151 15 1 2 0 1151 17 1 0 1151 18 1 0 1151 19 1 2 0 1151 21 1 0 1151 22 1 0 1151 23 1 0 1151 24 1 1 0 1151 25 1 0 1151 26 2 1 2 0 1151 29 1]
	[local86 5] = [1151 30 2 1]
	[local91 5] = [1151 32 2 1]
	[local96 5] = [1151 34 1 2]
	[local101 5] = [1151 36 1 2]
	[local106 8] = [1151 38 1 1 1 2 1]
	[local114 5] = [1151 43 2 1]
	[local119 5] = [1151 45 2 1]
	[local124 12] = [1151 47 1 1 1 2 1 1 2 1 2]
	[local136 5] = [1151 56 2 1]
	[local141 5] = [1151 58 2 1]
	[local146 5] = [1151 60 1 2]
	[local151 5] = [1151 62 2 1]
	[local156 4] = [1151 64 1]
	[local160 9] = [1151 65 2 1 2 2 1 2]
	[local169 6] = [1151 71 1 2 2]
	[local175 8] = [1151 74 2 1 2 2 2]
	[local183 7] = [1151 79 2 1 2 2]
	[local190 10] = [1151 83 2 1 2 2 2 1 2]
	[local200 6] = [1151 90 2 1 2]
	[local206 10] = [1151 93 1 2 2 2 1 2 2]
	[local216 7] = [1151 123 1 2 2 1]
	[local223 5] = [1151 127 1 2]
	[local228 6] = [1151 131 2 1 2]
	[local234 5] = [1151 134 1 2]
	[local239 6] = [1151 136 1 2 2]
	[local245 5] = [1151 139 1 2]
	[local250 6] = [1151 141 1 1 2]
	[local256 6] = [1151 144 1 2 1]
	[local262 12] = [1151 147 2 2 2 1 1 2 1 2 1]
	[local274 6] = [1151 156 1 2 1]
	[local280 7] = [1151 159 2 2 2 1]
	[local287 4] = [1151 163 1]
	[local291 10] = [1151 164 3 1 3 3 3 2 3]
	[local301 14] = [1151 171 2 2 1 2 2 2 2 2 2 1 1]
	[local315 6] = [1151 182 1 1 1]
	[local321 10] = [1151 185 2 2 2 1 2 2 1]
	[local331 12] = [1151 192 2 2 2 1 2 2 2 1 2]
)
(instance pucksClothes of View
	(properties
		x 175
		y 129
		view 140
		loop 5
		cel 1
		priority 12
		signal $4011
	)
)

(instance dayOne of TScript
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((ScriptID 23) cycleSpeed: 24)
				((ScriptID 21) cycleSpeed: 18)
				(proc0_9 (ScriptID 19) gEgo)
				(proc0_9 (ScriptID 20) gEgo)
				(= ticks 30)
			)
			(1
				(proc851_0 2 @local1 13 0 16 3 self)
			)
			(2
				(proc851_0 2 @local6 15 0 16 3 self)
			)
			(3
				(proc851_0 2 @local11 3 0 14 3 self)
			)
			(4
				((ScriptID 20)
					ignoreActors: 0
					setMotion: PolyPath 320 70 self
				)
			)
			(5
				(proc0_9 gEgo (ScriptID 19) self)
			)
			(6
				(proc851_0 2 @local17 3 0 13 3 self)
			)
			(7
				(proc0_9 gEgo (ScriptID 23) self)
			)
			(8
				(proc851_0 2 @local23 1 0 15 3 self)
			)
			(9
				(proc851_0 1 @local28 13 0 self)
			)
			(10
				((ScriptID 19)
					ignoreActors: 0
					setMotion: PolyPath -25 131 self
				)
			)
			(11
				((ScriptID 20) dispose:)
				((ScriptID 19) dispose:)
				(= cycles 1)
			)
			(12 (proc0_4) (self dispose:))
		)
	)
)

(instance dayTwo of TScript
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(Load rsVIEW 7 157)
				(proc0_9 (ScriptID 23) gEgo)
				(proc0_9 (ScriptID 19) gEgo)
				(proc0_9 (ScriptID 21) gEgo)
				(= ticks 30)
			)
			(1 (proc0_2) (= ticks 30))
			(2
				(proc851_0 2 @local86 3 0 13 3 self)
			)
			(3
				(proc851_0 2 @local91 1 0 15 3 self)
			)
			(4
				(proc851_0 2 @local96 16 0 13 3 self)
			)
			(5
				(proc851_0 2 @local101 1 0 16 3 self)
			)
			(6
				(proc851_0 2 @local106 1 0 13 3 self)
			)
			(7
				(gEgo view: 7 loop: 5 cel: 0 setCycle: CT 4 1 self)
			)
			(8
				(gEgo signal: (| (gEgo signal?) $0100) stopUpd:)
				((ScriptID 19)
					setCycle: Walk
					setMotion: PolyPath 232 115
				)
				((ScriptID 23) signal: 1)
				((ScriptID 21)
					setCycle: Walk
					setMotion: PolyPath 224 146 self
				)
			)
			(9
				(gEgo signal: (& (gEgo signal?) $feff) startUpd:)
				(proc851_0 2 @local114 1 0 15 3 self)
			)
			(10
				(proc851_0 2 @local119 1 0 13 3 self)
			)
			(11 (gEgo setCycle: Beg self))
			(12
				(proc0_2 1)
				((ScriptID 20) setMotion: PolyPath 30 131 self)
			)
			(13
				(= notKilled 1)
				(proc851_0 2 @local124 14 0 1 3 self)
			)
			(14
				(proc851_0 2 @local136 3 0 16 3 self)
			)
			(15
				(proc0_9 (ScriptID 19) (ScriptID 21))
				((ScriptID 21)
					view: 157
					loop: 3
					cel: 5
					setCycle: Beg
					setMotion: PolyPath ((ScriptID 21) x?) (- ((ScriptID 21) y?) 3) self
				)
			)
			(16
				(proc851_0 2 @local141 16 0 13 3 self)
			)
			(17
				(proc851_0 2 @local146 1 0 14 3 self)
			)
			(18
				(proc851_0 2 @local151 1 0 15 3 self)
			)
			(19
				(proc851_0 1 @local156 13 0 self)
			)
			(20
				((ScriptID 19) setMotion: PolyPath 320 70)
				((ScriptID 20) setMotion: PolyPath -15 131)
				(= cycles 50)
			)
			(21
				((ScriptID 21)
					setCycle: StopWalk 158
					setMotion: PolyPath -15 188
				)
				(= cycles 65)
			)
			(22
				((ScriptID 23) setMotion: PolyPath 80 245 self)
			)
			(23
				((ScriptID 19) dispose:)
				((ScriptID 20) dispose:)
				((ScriptID 21) dispose:)
				((ScriptID 23) dispose:)
				(gEgo signal: (& (gEgo signal?) $feff) startUpd:)
				(= cycles 1)
			)
			(24 (proc0_4) (self dispose:))
		)
	)
)

(instance dayThree of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(proc851_0 @local160 1 13 self)
			)
			(2
				((ScriptID 19) setMotion: PolyPath 325 73 self)
			)
			(3
				((ScriptID 19) dispose:)
				(= cycles 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance dayFour of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 (ScriptID 20) gEgo)
				(= ticks 30)
			)
			(1
				(proc851_0 @local169 3 14 self)
			)
			(2
				((ScriptID 20)
					setMotion: PolyPath (+ ((ScriptID 20) x?) 10) 240 self
				)
			)
			(3
				((ScriptID 20) dispose:)
				(= cycles 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance dayFive of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 1))
			(1
				(proc0_9 (ScriptID 21) gEgo)
				(proc0_9 gEgo (ScriptID 21))
				(= ticks 30)
			)
			(2
				(proc851_0 @local175 3 16 self)
			)
			(3
				((ScriptID 21)
					setMotion: PolyPath (+ ((ScriptID 21) x?) 77) 83 self
				)
			)
			(4
				((ScriptID 21) dispose:)
				(= cycles 1)
			)
			(5 (proc0_4) (self dispose:))
		)
	)
)

(instance noRobeFensMonkMet of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 (ScriptID 19) gEgo)
				(proc0_9 gEgo (ScriptID 19))
				(= ticks 30)
				(gEgo get: 5)
				(gEgo get: 6)
				(gEgo put: 5 140)
				(gEgo put: 6 140)
			)
			(1
				(proc851_0 @local183 999 13 self)
			)
			(2
				((ScriptID 19) setMotion: PolyPath 317 88 self)
			)
			(3
				((ScriptID 19) dispose:)
				(= cycles 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance noRobeAbbeyMonkMet of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 (ScriptID 23) gEgo)
				(proc0_9 gEgo (ScriptID 23))
				(= ticks 30)
			)
			(1
				(proc851_0 @local190 999 15 self)
			)
			(2
				((ScriptID 23) setMotion: PolyPath -15 131 self)
			)
			(3
				((ScriptID 23) dispose:)
				(= cycles 1)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance secondNoRescue of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 20))
				(proc0_9 (ScriptID 20) gEgo)
				(= ticks 30)
			)
			(1
				((ScriptID 20) view: 161 loop: 0 cel: 0 setCycle: Walk)
				(= cycles 10)
			)
			(2
				(proc851_0 @local200 9 14 self)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance thirdNoRescue of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(proc851_0 @local206 9 15 self)
			)
			(2
				(gEgo setMotion: PolyPath 145 110 self)
			)
			(3 (= ticks 18))
			(4
				((ScriptID 23) dispose:)
				(= ticks 6)
			)
			(5
				(gEgo hide:)
				(global2 drawPic: 803 -32762)
				(= ticks 48)
			)
			(6
				(global2 newRoom: 160)
				(self dispose:)
			)
		)
	)
)

(instance day6B of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(proc851_0 @local223 13 16 self)
			)
			(2
				((ScriptID 21)
					signal: (| ((ScriptID 21) signal?) $4001)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance day6A of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 22))
				(proc0_9 (ScriptID 22) gEgo)
				(= ticks 30)
			)
			(1
				(proc851_0 @local216 999 17 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance day7 of TScript
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 23))
				(= ticks 30)
			)
			(1
				(proc0_9 (ScriptID 23) gEgo)
				(= ticks 30)
			)
			(2
				(proc851_0 @local228 999 15 self)
			)
			(3
				(proc851_0 @local234 999 15 self)
			)
			(4
				((ScriptID 23) setMotion: PolyPath -15 131 self)
			)
			(5
				((ScriptID 23) dispose:)
				(= cycles 1)
			)
			(6 (proc0_4) (self dispose:))
		)
	)
)

(instance day8 of TScript
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2 1 0 1)
				(= ticks 30)
			)
			(1 (= ticks 30))
			(2
				(gEgo signal: (| (gEgo signal?) $0100) stopUpd:)
				(proc0_9 (ScriptID 23) gEgo)
				(proc0_9 (ScriptID 21) gEgo)
				(proc0_9 (ScriptID 19) gEgo)
				(proc0_9 (ScriptID 22) gEgo self)
			)
			(3
				(proc851_0 @local239 999 16 self)
			)
			(4
				(proc851_0 @local245 17 15 self)
			)
			(5
				(proc851_0 @local250 999 13 self)
			)
			(6
				(proc851_0 @local256 999 13 self)
			)
			(7
				((ScriptID 21)
					setCycle: StopWalk 158
					setMotion: PolyPath 148 250 self
				)
			)
			(8
				((ScriptID 22) setMotion: PolyPath -20 172 self)
			)
			(9
				((ScriptID 19)
					setCycle: Walk
					setMotion: PolyPath 140 250 self
				)
			)
			(10
				((ScriptID 23) setMotion: PolyPath 104 260 self)
			)
			(11
				((ScriptID 23) dispose:)
				((ScriptID 22) dispose:)
				((ScriptID 21) dispose:)
				((ScriptID 19) setCycle: 0 dispose:)
				(gEgo signal: (& (gEgo signal?) $feff) startUpd:)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance day8Puck of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(pucksClothes init:)
				(proc0_9 (ScriptID 19) gEgo)
				(= ticks 30)
			)
			(1
				(proc851_0 @local301 999 13 self)
			)
			(2
				((ScriptID 19) hide:)
				(gEgo hide:)
				(pucksClothes dispose:)
				(global2 drawPic: 803 8 1 0)
				(= cycles 10)
			)
			(3
				(global2 drawPic: 150 8 1 0)
				(= gNewGuise 4)
				(= global155 43)
				(proc0_2)
				((ScriptID 19) show:)
				(gEgo
					posn: 275 125
					show:
					setMotion: PolyPath 262 125 self
				)
			)
			(4
				(proc851_0 1 @local315 13 0 self)
			)
			(5
				(if (gEgo has: 1) (gEgo put: 1 140))
				(if (gEgo has: 2) (gEgo put: 2 140))
				(if (gEgo has: 3) (gEgo put: 3 140))
				(if (gEgo has: 15) (gEgo put: 15 140))
				(if (gEgo has: 11) (gEgo put: 11 140))
				(if (gEgo has: 14) (gEgo put: 14 140))
				(if (gEgo has: 12) (gEgo put: 12 140))
				(if (gEgo has: 10) (gEgo put: 10 140))
				(if (gEgo has: 13) (gEgo put: 13 140))
				(if (gEgo has: 4) (gEgo put: 4 140))
				(if (gEgo has: 5) (gEgo put: 5 140))
				(if (gEgo has: 6) (gEgo put: 6 140))
				(if (gEgo has: 16) (gEgo put: 16 140))
				(if (gEgo has: 18) (gEgo put: 18 140))
				(if (gEgo has: 7) (gEgo put: 7 140))
				(if (gEgo has: 8) (gEgo put: 8 140))
				(if (gEgo has: 9) (gEgo put: 9 140))
				(= ticks 6)
			)
			(6
				((ScriptID 19) setMotion: PolyPath 135 250 self)
			)
			(7
				((ScriptID 19) dispose:)
				(= cycles 1)
			)
			(8 (proc0_4) (self dispose:))
		)
	)
)

(instance day9Will of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 20))
				(proc0_9 (ScriptID 20) gEgo)
				(= ticks 30)
			)
			(1
				(proc851_0 2 @local321 999 0 14 3 self)
			)
			(2
				((ScriptID 20) setMotion: PolyPath 110 245 self)
			)
			(3
				((ScriptID 20) dispose:)
				(= ticks 6)
			)
			(4 (self dispose:) (proc0_4))
		)
	)
)

(instance day10 of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local262 2 13 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance day11 of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((ScriptID 23)
					cycleSpeed: 0
					moveSpeed: 0
					setMotion: PolyPath 216 105 self
				)
			)
			(1
				(proc0_9 (ScriptID 23) gEgo)
				(= ticks 30)
			)
			(2
				(proc851_0 @local274 3 15 self)
			)
			(3
				((ScriptID 23)
					cycleSpeed: 6
					moveSpeed: 6
					setMotion: PolyPath 196 90 self
				)
			)
			(4
				((ScriptID 23)
					view: 143
					setLoop: 0
					setCel: 5
					posn: 194 87
					setCycle: Beg self
				)
			)
			(5
				(proc851_0 @local280 3 15 self)
			)
			(6
				((ScriptID 23) signal: 1)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance day12 of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo (ScriptID 19))
				(proc0_9 (ScriptID 19) gEgo)
				(= ticks 30)
			)
			(1
				(proc851_0 2 @local331 999 0 13 3 self)
			)
			(2
				((ScriptID 19) setMotion: PolyPath 110 250 self)
			)
			(3
				((ScriptID 19) dispose:)
				(= ticks 6)
			)
			(4 (self dispose:) (proc0_4))
		)
	)
)

(instance day13 of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 151)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 (ScriptID 20) gEgo)
				(proc0_9 gEgo (ScriptID 20))
				(= ticks 30)
			)
			(1
				(proc851_0 @local287 3 0 self)
			)
			(2
				(proc851_0 3 @local291 1 0 2 0 14 3 self)
			)
			(3
				((ScriptID 20)
					setMotion: PolyPath (- ((ScriptID 20) x?) 30) 240 self
				)
			)
			(4
				((ScriptID 20) dispose:)
				(= cycles 1)
			)
			(5 (proc0_4) (self dispose:))
		)
	)
)
