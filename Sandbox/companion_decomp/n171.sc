;;; Sierra Script 1.0 - (do not remove this comment)
(script# 171)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n940)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	strat 0
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
)
(procedure (localproc_000e)
	(if (== ((Inv at: 2) owner?) 140) (gEgo get: 2))
	(if (== ((Inv at: 11) owner?) 140) (gEgo get: 11))
	(if (== ((Inv at: 12) owner?) 140) (gEgo get: 12))
	(if (== ((Inv at: 13) owner?) 140) (gEgo get: 13))
	(if (== ((Inv at: 14) owner?) 140) (gEgo get: 14))
	(if (== ((Inv at: 16) owner?) 140) (gEgo get: 16))
	(if (== ((Inv at: 17) owner?) 140) (gEgo get: 17))
)

(instance strat of Rm
	(properties
		picture 190
		style $0008
	)
	
	(method (init)
		(super init:)
		(proc0_3)
		(gRgnMusic
			number: 171
			loop: -1
			init:
			play:
			fade: 127 21 12 0
		)
		(switch (= local3 (Random 1 8))
			(1
				(lilJohn x: 108 y: 92)
				(johnHead x: 105 y: 104)
				(johnHand x: 84 y: 119)
				(friarTuck x: 169 y: 189)
				(tuckHead x: 175 y: 138)
				(tuckHand x: 153 y: 180)
				(alanDale x: 238 y: 189)
				(alanHead x: 228 y: 147)
				(alanHand x: 222 y: 189)
				(muchMiller x: 293 y: 189)
				(muchHead x: 297 y: 117)
				(willScarlet x: 44 y: 189)
				(willHead x: 41 y: 158)
			)
			(2
				(lilJohn x: 108 y: 92)
				(johnHead x: 105 y: 104)
				(johnHand x: 84 y: 119)
				(friarTuck x: 169 y: 189)
				(tuckHead x: 175 y: 138)
				(tuckHand x: 153 y: 180)
				(alanDale x: 238 y: 189)
				(alanHead x: 228 y: 147)
				(alanHand x: 222 y: 189)
				(muchMiller x: 293 y: 189)
				(muchHead x: 297 y: 117)
				(willScarlet x: 44 y: 189)
				(willHead x: 41 y: 158)
			)
			(3
				(lilJohn x: 33 y: 95)
				(johnHead x: 30 y: 111)
				(johnHand x: 7 y: 124)
				(friarTuck x: 286 y: 189)
				(tuckHead x: 291 y: 138)
				(tuckHand x: 270 y: 176)
				(alanDale x: 93 y: 189)
				(alanHead x: 84 y: 149)
				(alanHand x: 77 y: 189)
				(muchMiller x: 217 y: 189)
				(muchHead x: 221 y: 117)
				(willScarlet x: 160 y: 189)
				(willHead x: 158 y: 158)
			)
			(4
				(lilJohn x: 215 y: 92)
				(johnHead x: 212 y: 109)
				(johnHand x: 193 y: 120)
				(friarTuck x: 38 y: 189)
				(tuckHead x: 41 y: 139)
				(tuckHand x: 21 y: 176)
				(alanDale x: 278 y: 189)
				(alanHead x: 268 y: 149)
				(alanHand x: 260 y: 189)
				(muchMiller x: 105 y: 189)
				(muchHead x: 109 y: 117)
				(willScarlet x: 160 y: 189)
				(willHead x: 158 y: 158)
			)
			(5
				(lilJohn x: 283 y: 92)
				(johnHead x: 281 y: 107)
				(johnHand x: 260 y: 122)
				(friarTuck x: 230 y: 189)
				(tuckHead x: 234 y: 138)
				(tuckHand x: 214 y: 173)
				(alanDale x: 32 y: 189)
				(alanHead x: 21 y: 149)
				(alanHand x: 15 y: 189)
				(muchMiller x: 94 y: 189)
				(muchHead x: 98 y: 117)
				(willScarlet x: 160 y: 189)
				(willHead x: 158 y: 158)
			)
			(6
				(lilJohn x: 283 y: 92)
				(johnHead x: 281 y: 107)
				(johnHand x: 260 y: 122)
				(friarTuck x: 161 y: 189)
				(tuckHead x: 166 y: 138)
				(tuckHand x: 144 y: 175)
				(alanDale x: 221 y: 189)
				(alanHead x: 212 y: 149)
				(alanHand x: 206 y: 187)
				(muchMiller x: 94 y: 189)
				(muchHead x: 98 y: 117)
				(willScarlet x: 40 y: 189)
				(willHead x: 37 y: 158)
			)
			(7
				(lilJohn x: 283 y: 92)
				(johnHead x: 281 y: 107)
				(johnHand x: 260 y: 122)
				(friarTuck x: 37 y: 189)
				(tuckHead x: 42 y: 138)
				(tuckHand x: 20 y: 175)
				(alanDale x: 221 y: 189)
				(alanHead x: 212 y: 149)
				(alanHand x: 206 y: 187)
				(muchMiller x: 101 y: 189)
				(muchHead x: 105 y: 117)
				(willScarlet x: 162 y: 189)
				(willHead x: 159 y: 158)
			)
			(8
				(lilJohn x: 166 y: 92)
				(johnHead x: 163 y: 108)
				(johnHand x: 142 y: 123)
				(friarTuck x: 37 y: 189)
				(tuckHead x: 42 y: 138)
				(tuckHand x: 20 y: 175)
				(alanDale x: 105 y: 189)
				(alanHead x: 96 y: 149)
				(alanHand x: 88 y: 188)
				(muchMiller x: 293 y: 189)
				(muchHead x: 297 y: 117)
				(willScarlet x: 236 y: 189)
				(willHead x: 233 y: 158)
			)
		)
		(lilJohn init:)
		(johnHead init: startUpd:)
		(johnHand init:)
		(friarTuck init:)
		(tuckHead init: startUpd:)
		(tuckHand init: startUpd:)
		(alanDale init:)
		(alanHead init: startUpd:)
		(alanHand init: startUpd:)
		(muchMiller init:)
		(muchHead init: startUpd:)
		(willScarlet init:)
		(willHead init: startUpd:)
		(self setScript: talkArbitrator)
	)
	
	(method (dispose)
		(gRgnMusic fade: 60 30 12 1)
		(super dispose: &rest)
	)
)

(instance lilJohn of View
	(properties
		view 175
		loop 2
		priority 14
		signal $0010
	)
)

(instance johnHead of Prop
	(properties
		view 175
		priority 15
		signal $0010
	)
)

(instance johnHand of Prop
	(properties
		view 175
		loop 1
		priority 15
		signal $0010
	)
)

(instance friarTuck of View
	(properties
		view 175
		loop 5
		priority 14
		signal $0010
	)
)

(instance tuckHead of Prop
	(properties
		view 175
		loop 3
		priority 15
		signal $0010
	)
)

(instance tuckHand of Prop
	(properties
		view 175
		loop 4
		priority 15
		signal $0010
	)
)

(instance alanDale of View
	(properties
		view 175
		loop 8
		priority 14
		signal $4010
	)
)

(instance alanHead of Prop
	(properties
		view 175
		loop 6
		priority 15
		signal $0010
	)
)

(instance alanHand of Prop
	(properties
		view 175
		loop 7
		priority 15
		signal $4010
	)
)

(instance muchMiller of View
	(properties
		view 175
		loop 12
	)
)

(instance muchHead of Prop
	(properties
		view 175
		loop 11
		priority 15
		signal $0010
	)
)

(instance willScarlet of View
	(properties
		view 175
		loop 10
		priority 14
		signal $4010
	)
)

(instance willHead of Prop
	(properties
		view 175
		loop 9
	)
)

(instance queensKnight of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 99 self 80 {Will})
			)
			(1 (= ticks 10))
			(2
				(willHead setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 100 self 80 {John})
			)
			(3 (= ticks 10))
			(4
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(proc13_6 0)
				(proc13_4 1171 101 self 80 {Robin})
			)
			(5 (= ticks 10))
			(6
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 102 self 80 {Tuck})
			)
			(7 (= ticks 10))
			(8
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 103 self 80 {Alan})
			)
			(9 (= ticks 10))
			(10
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance rescueMarian3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_6 0)
				(proc13_4 1171 62 self 80 {Robin})
			)
			(1 (= ticks 10))
			(2
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 63 self 80 {Will})
			)
			(3 (= ticks 10))
			(4
				(willHead setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 64 self 80 {John})
			)
			(5 (= ticks 10))
			(6
				(proc13_4 1171 65 self 80 {John})
			)
			(7 (= ticks 10))
			(8
				(proc13_4 1171 66 self 80 {John})
			)
			(9 (= ticks 10))
			(10
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 67 self 80 {Alan})
			)
			(11 (= ticks 10))
			(12
				(proc13_4 1171 68 self 80 {Alan})
			)
			(13 (= ticks 10))
			(14
				(proc13_4 1171 69 self 80 {Alan})
			)
			(15 (= ticks 10))
			(16
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 70 self 80 {Tuck})
			)
			(17 (= ticks 10))
			(18
				(proc13_4 1171 71 self 80 {Tuck})
			)
			(19 (= ticks 10))
			(20
				(proc13_4 1171 72 self 80 {Tuck})
			)
			(21 (= ticks 10))
			(22
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 73 self 80 {Will})
			)
			(23 (= ticks 10))
			(24
				(proc13_4 1171 74 self 80 {Will})
			)
			(25 (= ticks 10))
			(26
				(willHead setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 75 self 80 {Much})
			)
			(27 (= ticks 10))
			(28
				(proc13_4 1171 76 self 80 {Much})
			)
			(29 (= ticks 10))
			(30
				(proc13_4 1171 77 self 80 {Much})
			)
			(31 (= ticks 10))
			(32
				(muchHead setScript: 0)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance rescueMarian2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_6 0)
				(proc13_4 1171 60 self 80 {Robin})
			)
			(1 (= ticks 10))
			(2
				(proc13_4 1171 61 self 80 {Robin})
			)
			(3 (= ticks 10))
			(4
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 44 self 80 {Alan})
			)
			(5 (= ticks 10))
			(6
				(proc13_4 1171 45 self 80 {Alan})
			)
			(7 (= ticks 10))
			(8
				(proc13_4 1171 46 self 80 {Alan})
			)
			(9 (= ticks 10))
			(10
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 47 self 80 {Tuck})
			)
			(11 (= ticks 10))
			(12
				(proc13_4 1171 48 self 80 {Tuck})
			)
			(13 (= ticks 10))
			(14
				(proc13_4 1171 49 self 80 {Tuck})
			)
			(15 (= ticks 10))
			(16
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 50 self 80 {John})
			)
			(17 (= ticks 10))
			(18
				(proc13_4 1171 51 self 80 {John})
			)
			(19 (= ticks 10))
			(20
				(proc13_4 1171 52 self 80 {John})
			)
			(21 (= ticks 10))
			(22
				(proc13_4 1171 53 self 80 {John})
			)
			(23 (= ticks 10))
			(24
				(proc13_4 1171 54 self 80 {John})
			)
			(25 (= ticks 10))
			(26
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 55 self 80 {Will})
			)
			(27 (= ticks 10))
			(28
				(proc13_4 1171 56 self 80 {Will})
			)
			(29 (= ticks 10))
			(30
				(willHead setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 57 self 80 {Much})
			)
			(31 (= ticks 10))
			(32
				(proc13_4 1171 58 self 80 {Much})
			)
			(33 (= ticks 10))
			(34
				(proc13_4 1171 59 self 80 {Much})
			)
			(35 (= ticks 10))
			(36
				(muchHead setScript: 0)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance rescueSonsOfWidow2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_6 0)
				(proc13_4 1171 21 self 80 {Robin})
			)
			(1 (= ticks 10))
			(2
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 22 self 80 {Will})
			)
			(3 (= ticks 10))
			(4
				(proc13_4 1171 23 self 80 {Will})
			)
			(5 (= ticks 10))
			(6
				(willHead setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 24 self 80 {Much})
			)
			(7 (= ticks 10))
			(8
				(muchHead setScript: 0)
				(proc13_6 0)
				(proc13_4 1171 25 self 80 {Robin})
			)
			(9 (= ticks 10))
			(10
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 26 self 80 {John})
			)
			(11 (= ticks 10))
			(12
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 27 self 80 {Will})
			)
			(13 (= ticks 10))
			(14
				(proc13_4 1171 28 self 80 {Will})
			)
			(15 (= ticks 10))
			(16
				(willHead setScript: 0)
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 29 self 80 {Alan})
			)
			(17 (= ticks 10))
			(18
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 30 self 80 {Tuck})
			)
			(19 (= ticks 10))
			(20
				(proc13_4 1171 31 self 80 {Tuck})
			)
			(21 (= ticks 10))
			(22
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 32 self 80 {Much})
			)
			(23 (= ticks 10))
			(24
				(proc13_4 1171 33 self 80 {Much})
			)
			(25 (= ticks 10))
			(26
				(proc13_4 1171 34 self 80 {Much})
			)
			(27 (= ticks 10))
			(28
				(muchHead setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 35 self 80 {John})
			)
			(29 (= ticks 10))
			(30
				(proc13_4 1171 36 self 80 {John})
			)
			(31 (= ticks 10))
			(32
				(proc13_4 1171 37 self 80 {John})
			)
			(33 (= ticks 10))
			(34
				(proc13_4 1171 38 self 80 {John})
			)
			(35 (= ticks 10))
			(36
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance rescueSonsOfWidow1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 0 self 80 {Tuck})
			)
			(1 (= ticks 10))
			(2
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 1 self 80 {John})
			)
			(3 (= ticks 10))
			(4
				(proc13_4 1171 2 self 80 {John})
			)
			(5 (= ticks 10))
			(6
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(proc13_6 0)
				(proc13_4 1171 3 self 80 {Robin})
			)
			(7 (= ticks 10))
			(8
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 4 self 80 {Will})
			)
			(9 (= ticks 10))
			(10
				(proc13_4 1171 5 self 80 {Will})
			)
			(11 (= ticks 10))
			(12
				(proc13_4 1171 6 self 80 {Will})
			)
			(13 (= ticks 10))
			(14
				(willHead setScript: 0)
				(proc13_6 0)
				(proc13_4 1171 7 self 80 {Robin})
			)
			(15 (= ticks 10))
			(16
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 8 self 80 {Tuck})
			)
			(17 (= ticks 10))
			(18
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 9 self 80 {Much})
			)
			(19 (= ticks 10))
			(20
				(proc13_4 1171 10 self 80 {Much})
			)
			(21 (= ticks 10))
			(22
				(proc13_4 1171 11 self 80 {Much})
			)
			(23 (= ticks 10))
			(24
				(muchHead setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 12 self 80 {John})
			)
			(25 (= ticks 10))
			(26
				(proc13_4 1171 13 self 80 {John})
			)
			(27 (= ticks 10))
			(28
				(proc13_4 1171 14 self 80 {John})
			)
			(29 (= ticks 10))
			(30
				(proc13_4 1171 15 self 80 {John})
			)
			(31 (= ticks 10))
			(32
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 16 self 80 {Alan})
			)
			(33 (= ticks 10))
			(34
				(proc13_4 1171 17 self 80 {Alan})
			)
			(35 (= ticks 10))
			(36
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 18 self 80 {Will})
			)
			(37 (= ticks 10))
			(38
				(proc13_4 1171 19 self 80 {Will})
			)
			(39 (= ticks 10))
			(40
				(proc13_4 1171 20 self 80 {Will})
			)
			(41 (= ticks 10))
			(42
				(willHead setScript: 0)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance headShake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local4 (Random 1 2))
				(client
					cycleSpeed: (* local4 6)
					cel: 0
					setCycle: End self
				)
			)
			(1 (= state -1) (= ticks 6))
		)
	)
)

(instance tuckHeadShake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local8 (Random 1 2))
				(client
					cycleSpeed: (* local8 6)
					cel: 0
					setCycle: End self
				)
			)
			(1
				(client cel: 0)
				(= state -1)
				(= ticks 6)
			)
		)
	)
)

(instance handShake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local5 (Random 1 2))
				(client
					cycleSpeed: (* local5 6)
					cel: 0
					setCycle: End self
				)
			)
			(1
				(= state -1)
				(= ticks (* (= local5 (Random 4 9)) 12))
			)
			(2 (self dispose:))
		)
	)
)

(instance johnHandShake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local6 (Random 1 2))
				(client
					cycleSpeed: (* local6 6)
					cel: 0
					setCycle: End self
				)
			)
			(1
				(= ticks (* (= local6 (Random 5 9)) 50))
			)
			(2
				(= local6 (Random 1 2))
				(client cycleSpeed: (* local6 6) setCycle: Beg self)
			)
			(3
				(= state -1)
				(= ticks (* (= local6 (Random 4 8)) 40))
			)
			(4 (self dispose:))
		)
	)
)

(instance alanHandShake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local7 (Random 1 2))
				(client
					cycleSpeed: (* local7 6)
					cel: 0
					setCycle: End self
				)
			)
			(1
				(= ticks (* (= local7 (Random 5 9)) 50))
			)
			(2
				(= local7 (Random 1 2))
				(client cycleSpeed: (* local7 6) setCycle: Beg self)
			)
			(3
				(= state -1)
				(= ticks (* (= local7 (Random 4 8)) 40))
			)
			(4 (self dispose:))
		)
	)
)

(instance walkThePlank of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_000e)
				(= ticks 6)
			)
			(1
				(global5 eachElementDo: #dispose)
				(global2 drawPic: 803 10)
				(= ticks 12)
			)
			(2
				(switch global142
					(1
						(Display 171 0 100 55 60 102 global185)
						(Display 171 1 100 55 70 102 global185)
						(Display 171 2 100 55 80 102 global185)
					)
					(2
						(Display 171 3 100 55 65 102 global185)
						(Display 171 4 100 55 75 102 global185)
					)
				)
				(= seconds 10)
			)
			(3
				(global2 newRoom: 260)
				(self dispose:)
			)
		)
	)
)

(instance robTreasureTrain of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_6 0)
				(proc13_4 1171 78 self 80 {Robin})
			)
			(1 (= ticks 10))
			(2
				(proc13_4 1171 79 self 80 {Robin})
			)
			(3 (= ticks 10))
			(4
				(proc13_4 1171 80 self 80 {Robin})
			)
			(5 (= ticks 10))
			(6
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 81 self 80 {Will})
			)
			(7 (= ticks 10))
			(8
				(willHead setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 82 self 80 {John})
			)
			(9 (= ticks 10))
			(10
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 83 self 80 {Will})
			)
			(11 (= ticks 10))
			(12
				(proc13_4 1171 84 self 80 {Will})
			)
			(13 (= ticks 10))
			(14
				(willHead setScript: 0)
				(proc13_6 0)
				(proc13_4 1171 85 self 80 {Robin})
			)
			(15 (= ticks 10))
			(16
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 86 self 80 {Will})
			)
			(17 (= ticks 10))
			(18
				(proc13_4 1171 87 self 80 {Will})
			)
			(19 (= ticks 10))
			(20
				(willHead setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 88 self 80 {John})
			)
			(21 (= ticks 10))
			(22
				(proc13_4 1171 89 self 80 {John})
			)
			(23 (= ticks 10))
			(24
				(proc13_4 1171 90 self 80 {John})
			)
			(25 (= ticks 10))
			(26
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 91 self 80 {Alan})
			)
			(27 (= ticks 10))
			(28
				(proc13_4 1171 92 self 80 {Alan})
			)
			(29 (= ticks 10))
			(30
				(proc13_4 1171 93 self 80 {Alan})
			)
			(31 (= ticks 10))
			(32
				(proc13_4 1171 94 self 80 {Alan})
			)
			(33 (= ticks 10))
			(34
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 95 self 80 {Tuck})
			)
			(35 (= ticks 10))
			(36
				(proc13_4 1171 96 self 80 {Tuck})
			)
			(37 (= ticks 10))
			(38
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 97 self 80 {Much})
			)
			(39 (= ticks 10))
			(40
				(proc13_4 1171 98 self 80 {Much})
			)
			(41 (= ticks 10))
			(42
				(muchHead setScript: 0)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)

(instance talkArbitrator of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch global130
					(5
						(if (proc0_5 55)
							(switch global142
								(1 (= global146 10))
								(else  (= global146 20))
							)
						)
					)
					(6
						(if (proc0_5 55)
							(switch global142
								(1 (= global146 10))
								(else  (= global146 20))
							)
						)
					)
					(10
						(switch global159
							(0 (= global146 30))
							(1 (= global146 40))
							(else  (= global146 50))
						)
					)
					(11 (= global146 60))
					(13 (= global146 70))
				)
				(= local0 global146)
				(switch global146
					(70
						(self setScript: queensKnight self)
					)
					(60
						(self setScript: robTreasureTrain self)
					)
					(50
						(self setScript: rescueMarian3 self)
					)
					(40
						(self setScript: rescueMarian2 self)
					)
					(30
						(self setScript: rescueMarian1 self)
					)
					(20
						(self setScript: rescueSonsOfWidow2 self)
					)
					(10
						(self setScript: rescueSonsOfWidow1 self)
					)
				)
			)
			(1 (= ticks 6))
			(2
				(proc13_6 0)
				(switch global146
					(70 (global2 newRoom: 100))
					(60
						(= global146
							(= local2
								(proc940_0
									26
									{_}
									81
									{John: Demand surrender, attack from all sides.}
									60
									106
									26
									{_}
									81
									{Will: Ambush from Overlook only.}
									61
									106
									26
									{_}
									81
									{Alan: Demand surrender with fanfare.}
									62
									106
									26
									{_}
									81
									{Tuck: Surprise ambush from two sides.}
									64
									106
									26
									{_}
									81
									{Much: Create panic with wild boars.}
									63
									67
									70
									25
								)
							)
						)
						(switch local2
							(60
								(proc806_1 200)
								(if (<= global138 16)
									(global2 newRoom: 176)
								else
									(global2 newRoom: 174)
								)
							)
							(61
								(proc806_1 400)
								(if (<= global138 15)
									(global2 newRoom: 176)
								else
									(global2 newRoom: 173)
								)
							)
							(62
								(proc806_1 100)
								(if (<= global138 18)
									(global2 newRoom: 176)
								else
									(global2 newRoom: 174)
								)
							)
							(64
								(proc806_1 500)
								(global2 newRoom: 172)
							)
							(63 (global2 newRoom: 175))
							(0
								(= global146 local0)
								(= state 1)
								(self cue:)
							)
						)
					)
					(50
						(= global146
							(= local2
								(proc940_0
									26
									{_}
									81
									{John: Two part flanking attack.}
									50
									106
									26
									{_}
									81
									{Will: Robin to lead a wedge attack in force.}
									51
									106
									26
									{_}
									81
									{Alan: Seek to take Sheriff and Abbot hostage.}
									52
									106
									26
									{_}
									81
									{Tuck: Incite riot, attack in streets, Robin to slip in alone.}
									54
									106
									26
									{_}
									81
									{Much: Try to lead soldiers away, Robin to enter Witch's Court with 5 men.}
									53
									67
									70
									25
								)
							)
						)
						(switch local2
							(50 (global2 newRoom: 501))
							(51 (global2 newRoom: 501))
							(52 (global2 newRoom: 501))
							(54 (global2 newRoom: 501))
							(53 (global2 newRoom: 501))
							(0
								(= global146 local0)
								(= state 1)
								(self cue:)
							)
						)
					)
					(40
						(= global146
							(= local2
								(proc940_0
									26
									{_}
									81
									{John: Subterfuge. John leads two part attack and winds horn for Robin to act.}
									40
									106
									26
									{_}
									81
									{Will: Robin to lead a wedge attack in force.}
									41
									106
									26
									{_}
									81
									{Alan: Seek to take Sheriff and Abbot hostage.}
									42
									106
									26
									{_}
									81
									{Tuck: Incite riot, attack in streets, Robin to slip in alone.}
									44
									106
									26
									{_}
									81
									{Much: Try to lead soldiers away, Robin to enter Witch's Court with 5 men.}
									43
									67
									70
									25
								)
							)
						)
						(switch local2
							(40 (global2 newRoom: 260))
							(41 (global2 newRoom: 501))
							(42 (global2 newRoom: 501))
							(44 (global2 newRoom: 501))
							(43 (global2 newRoom: 501))
							(0
								(= global146 local0)
								(= state 1)
								(self cue:)
							)
						)
					)
					(30
						(= global146
							(= local2
								(proc940_0
									26
									{_}
									81
									{John: Subterfuge. John leads two part attack and winds horn for Robin to act.}
									30
									106
									26
									{_}
									81
									{Will: Robin to lead a wedge attack in force.}
									31
									106
									26
									{_}
									81
									{Alan: Seek to take Sheriff and Abbot hostage.}
									32
									106
									26
									{_}
									81
									{Tuck: Incite riot, attack in streets, Robin to slip in alone.}
									34
									106
									26
									{_}
									81
									{Much: Try to lead soldiers away, Robin to enter Witch's Court with 5 men.}
									33
									67
									70
									25
								)
							)
						)
						(switch local2
							(30 (global2 newRoom: 260))
							(31 (global2 newRoom: 501))
							(32 (global2 newRoom: 501))
							(34 (global2 newRoom: 501))
							(33 (global2 newRoom: 501))
							(0
								(= global146 local0)
								(= state 1)
								(self cue:)
							)
						)
					)
					(20
						(= global146
							(= local2
								(proc940_0
									26
									{_}
									81
									{John: 6 men inside, surprise attack, 16 outside to cover retreat.}
									20
									106
									26
									{_}
									81
									{Will: Return to Nottingham in disguise.}
									24
									106
									26
									{_}
									81
									{Alan: Set a fire and rush in.}
									22
									106
									26
									{_}
									81
									{Tuck: Create diversion with 10 men, send 12 men inside.}
									21
									106
									26
									{_}
									81
									{Much: 22 outlaws, charge the gates.}
									23
									67
									70
									25
								)
							)
						)
						(switch local2
							(20 (global2 newRoom: 177))
							(21 (global2 newRoom: 177))
							(22 (global2 newRoom: 177))
							(23 (global2 newRoom: 177))
							(24
								(gEgo put: 1 140)
								(proc0_4)
								(= gNewGuise 5)
								(global2 setScript: walkThePlank)
							)
							(0
								(= global146 local0)
								(= state 1)
								(self cue:)
							)
						)
					)
					(10
						(= global146
							(= local2
								(proc940_0
									26
									{_}
									81
									{John: 10 men feint outside, then__________full scale attack.}
									11
									106
									26
									{_}
									81
									{Will: 5 men inside, surprise attack, 17 outside to cover retreat.}
									10
									106
									26
									{_}
									81
									{Alan: Set a fire and rush in.}
									12
									106
									26
									{_}
									81
									{Tuck: Return to Nottingham in disguise.}
									14
									106
									26
									{_}
									81
									{Much: 22 outlaws, charge the gates.}
									13
									67
									70
									25
								)
							)
						)
						(switch local2
							(10 (global2 newRoom: 177))
							(11 (global2 newRoom: 177))
							(12 (global2 newRoom: 177))
							(13 (global2 newRoom: 177))
							(14
								(gEgo put: 1 140)
								(proc0_4)
								(= gNewGuise 5)
								(global2 setScript: walkThePlank)
							)
							(0
								(= global146 local0)
								(= state 1)
								(self cue:)
							)
						)
					)
				)
				(self dispose:)
			)
		)
	)
)

(instance rescueMarian1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 39 self 80 {Tuck})
			)
			(1 (= ticks 10))
			(2
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(proc13_6 0)
				(proc13_4 1171 40 self 80 {Robin})
			)
			(3 (= ticks 10))
			(4
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 41 self 80 {John})
			)
			(5 (= ticks 10))
			(6
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(alanHead setScript: headShake)
				(alanHand setScript: handShake)
				(proc13_6 4)
				(proc13_4 1171 42 self 80 {Alan})
			)
			(7 (= ticks 10))
			(8
				(alanHead setScript: 0)
				(alanHand setScript: 0)
				(proc13_6 0)
				(proc13_4 1171 43 self 80 {Robin})
			)
			(9 (= ticks 10))
			(10
				(alanHead setScript: headShake)
				(alanHand setScript: alanHandShake)
				(proc13_6 4)
				(proc13_4 1171 44 self 80 {Alan})
			)
			(11 (= ticks 10))
			(12
				(proc13_4 1171 45 self 80 {Alan})
			)
			(13 (= ticks 10))
			(14
				(proc13_4 1171 46 self 80 {Alan})
			)
			(15 (= ticks 10))
			(16
				(alanHead setScript: 0 setCycle: Beg)
				(alanHand setScript: 0 setCycle: Beg)
				(tuckHead setScript: tuckHeadShake)
				(tuckHand setScript: handShake)
				(proc13_6 3)
				(proc13_4 1171 47 self 80 {Tuck})
			)
			(17 (= ticks 10))
			(18
				(proc13_4 1171 48 self 80 {Tuck})
			)
			(19 (= ticks 10))
			(20
				(proc13_4 1171 49 self 80 {Tuck})
			)
			(21 (= ticks 10))
			(22
				(tuckHead setScript: 0 setCycle: Beg)
				(tuckHand setScript: 0)
				(johnHead setScript: headShake)
				(johnHand setScript: johnHandShake)
				(proc13_6 1)
				(proc13_4 1171 50 self 80 {John})
			)
			(23 (= ticks 10))
			(24
				(proc13_4 1171 51 self 80 {John})
			)
			(25 (= ticks 10))
			(26
				(proc13_4 1171 52 self 80 {John})
			)
			(27 (= ticks 10))
			(28
				(proc13_4 1171 53 self 80 {John})
			)
			(29 (= ticks 10))
			(30
				(proc13_4 1171 54 self 80 {John})
			)
			(31 (= ticks 10))
			(32
				(johnHead setScript: 0)
				(johnHand setScript: 0 setCycle: Beg)
				(willHead setScript: headShake)
				(proc13_6 2)
				(proc13_4 1171 55 self 80 {Will})
			)
			(33 (= ticks 10))
			(34
				(proc13_4 1171 56 self 80 {Will})
			)
			(35 (= ticks 10))
			(36
				(willHead setScript: 0)
				(muchHead setScript: headShake)
				(proc13_6 5)
				(proc13_4 1171 57 self 80 {Much})
			)
			(37 (= ticks 10))
			(38
				(proc13_4 1171 58 self 80 {Much})
			)
			(39 (= ticks 10))
			(40
				(proc13_4 1171 59 self 80 {Much})
			)
			(41 (= ticks 10))
			(42
				(muchHead setScript: 0)
				(self dispose:)
			)
		)
	)
	
	(method (cue param1)
		(if (and argc (not param1))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
)
