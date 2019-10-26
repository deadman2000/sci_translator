;;; Sierra Script 1.0 - (do not remove this comment)
(script# 550)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n852)
(use n946)
(use n950)
(use n969)
(use n977)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm550 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 3] = [-1 7174 11]
	[local12 3] = [-1 7178 13]
	local15
	[local16 4] = [1550 59 1]
	[local20 5] = [1550 60 1 1]
	[local25 4] = [1550 0 1]
	[local29 9] = [1550 1 2 2 1 2 1 3]
	[local38 8] = [1550 7 1 1 1 1 1]
	[local46 5] = [1550 12 1 1]
	[local51 7] = [1550 19 2 2 2 1]
	[local58 5] = [1550 23 1 2]
	[local63 5] = [1550 25 1 1]
	[local68 4] = [1550 27 1]
	[local72 4] = [1550 42 1]
	[local76 4] = [1550 56 1]
	[local80 4] = [1550 68 1]
	[local84 4] = [1550 14 1]
	[local88 7] = [1550 15 1 1 1 1]
	[local95 5] = [93 129 40 84 -32768]
)
(instance rm550 of Rm
	(properties
		picture 550
		north 530
	)
	
	(method (init)
		(super init:)
		(proc0_2)
		(proc0_3)
		(self
			setScript:
				(cond 
					((proc0_5 125) resc)
					((== gHeading 530) gateIn)
					(else barrelIn)
				)
		)
		(gEgo init:)
		(sDoor init:)
		(if (== global130 10)
			(gate init: approachVerbs: 3)
		else
			(gate init: approachVerbs: 5 3)
		)
		(if (!= script resc) (tap4 init: approachVerbs: 3))
		(proc806_2 tap3 tap5 tap6)
		(tap3 approachVerbs: 3)
		(tap5 approachVerbs: 3)
		(tap6 approachVerbs: 3)
		(csk1 init: approachVerbs: 3)
		(csk2 init: approachVerbs: 3)
		(csk3 init: approachVerbs: 3)
		(csk4 init: approachVerbs: 3)
		(csk5 init: approachVerbs: 3)
		(csk6 init: approachVerbs: 3)
		(csk7 init: approachVerbs: 3)
		(csk8 init: approachVerbs: 3)
		(csk9 init: approachVerbs: 3)
		(base init:)
		(sacks init:)
		(walls init:)
		(floor init:)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 3
					init:
						58
						118
						26
						118
						25
						124
						76
						124
						89
						134
						91
						151
						55
						151
						105
						154
						108
						171
						185
						187
						273
						187
						185
						109
						227
						102
						224
						98
						147
						105
						140
						116
						101
						123
						80
						106
						58
						106
					yourself:
				)
		)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 10) (proc13_4 1550 66 1))
	)
)

(instance sDoor of Prop
	(properties
		x 215
		y 102
		view 550
		loop 1
		priority 9
		signal $6911
		cycleSpeed 18
	)
	
	(method (onMe)
		(return 0)
	)
)

(instance gate of Prop
	(properties
		x 84
		y 101
		approachX 65
		approachY 106
		view 550
		loop 2
		signal $6901
		cycleSpeed 7
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if cel (proc13_4 1550 38) else (proc13_4 1550 39))
			)
			(3
				(if cel (proc13_4 1550 40) else (proc13_4 1550 41))
			)
			(5
				(if (!= global130 10)
					(self setScript: screwUp)
				else
					(super doVerb: theVerb param2)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance tap3 of PicView
	(properties
		x 204
		y 121
		z 4
		approachX 187
		approachY 130
		lookStr 32
		view 550
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(gClient setScript: turnTap self)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance tap4 of Feature
	(properties
		x 218
		y 135
		z 4
		nsTop 115
		nsLeft 214
		nsBottom 127
		nsRight 222
		approachX 201
		approachY 144
		lookStr 32
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(gClient setScript: barrelOut)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance tap5 of PicView
	(properties
		x 237
		y 147
		z 4
		approachX 220
		approachY 156
		lookStr 32
		view 550
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(gClient setScript: turnTap self)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance tap6 of PicView
	(properties
		x 257
		y 166
		z 4
		approachX 240
		approachY 175
		lookStr 32
		view 550
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(gClient setScript: turnTap self)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance turnTap of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					view: (if (!= gNewGuise 0) 28 else 550)
					loop: (if (!= gNewGuise 0) 11 else 8)
					x: (+ -17 (caller x?))
					y: (+ 13 (caller y?))
					cel: 0
					cycleSpeed: 6
					setCycle: End self
				)
			)
			(1
				(spigotSound play:)
				((= register (Prop new:))
					view: 550
					loop: 3
					ignoreActors: 1
					x: (caller x?)
					y: (caller y?)
					z: 4
					init:
					setCycle: Fwd
				)
				(= ticks 30)
			)
			(2
				(gEgo setCycle: Beg self)
				(spigotSound play:)
				(= ticks 9)
			)
			(3 (register dispose:))
			(4 (proc13_4 1550 49 self))
			(5
				(proc0_2 4)
				(proc0_4)
				(= caller 0)
				(self dispose:)
			)
		)
	)
)

(instance guardX of Actor
	(properties
		x 58
		y 88
		view 753
	)
)

(instance keeper of Actor
	(properties
		view 533
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1550 29 1))
			(5
				(proc851_0 1 @local76 @local0 0)
			)
			(3
				(proc851_0 1 @local72 @local0 0)
			)
			(10 (proc13_4 1550 67 1))
			(4
				(proc851_0 1 @local80 @local0 0)
			)
		)
	)
)

(instance gateIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(keeper x: 58 y: 90 loop: 2 init: setCycle: Walk)
				(gate cel: (gate lastCel:))
				(if (proc0_5 140)
					(gEgo x: 197 y: 140 loop: 1)
					(= cycles 2)
					(proc0_4)
				else
					(gEgo x: 63 y: 104 loop: 2 setMotion: MoveTo 67 110 self)
				)
			)
			(1
				(cond 
					((or (!= global130 10) (proc0_5 141)) (keeper setScript: openGate self))
					((proc0_5 140)
						(proc851_0 @local58 999 @local0)
						(proc0_4)
						(self dispose:)
					)
					(else
						(proc851_0 @local51 999 @local0)
						(proc0_4)
						(self dispose:)
					)
				)
			)
			(2
				(gate signal: (| (gate signal?) $0100) stopUpd:)
				(if (== global130 10)
					(proc851_0 @local63 @local0 0 self)
				else
					(= cycles 1)
				)
			)
			(3
				(keeper setMotion: MoveTo 38 88 self)
			)
			(4
				(keeper dispose:)
				(if (== global130 10)
					(proc851_0 1 @local68 999 3 self)
				else
					(= cycles 1)
					(++ state)
				)
			)
			(5 (proc13_4 1550 28 self))
			(6 (proc0_4) (self dispose:))
		)
	)
)

(instance barrelIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo
					view: 550
					loop: (if (== gNewGuise 0) 6 else 4)
					cel: 0
					posn: 193 138
					setPri: 8
				)
				(sDoor signal: 26640)
				(if (== global130 10) (++ state) (= cycles 1) (return))
				((= register (Actor new:))
					view: 753
					loop: 1
					posn: 58 88
					init:
					setCycle: Fwd
					setMotion: MoveTo 37 78 self
				)
			)
			(1
				(register dispose:)
				(= ticks 45)
			)
			(2
				(caskSound play:)
				(sDoor setCycle: End self)
			)
			(3
				(sDoor priority: 8)
				(gEgo setCycle: End self)
			)
			(4
				(proc0_2)
				(gEgo posn: 199 137 setMotion: MoveTo 189 141 self)
			)
			(5 (gEgo setHeading: 80 self))
			(6
				(sDoor priority: 9 setCycle: Beg self)
			)
			(7
				(caskCloseSound play:)
				(sDoor signal: (| (sDoor signal?) $0100) stopUpd:)
				(gEgo setHeading: 260 self)
			)
			(8 (proc0_4) (self dispose:))
		)
	)
)

(instance barrelOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					view: (if (!= gNewGuise 0) 28 else 550)
					loop: (if (!= gNewGuise 0) 11 else 8)
					cel: 0
					setCycle: End self
				)
			)
			(1
				(= ticks (+ 1 (* 2 (gEgo cycleSpeed?))))
				(if (proc0_5 140) (++ state))
			)
			(2
				(proc13_4 1550 (= register 50) self)
			)
			(3
				(sDoor
					signal: (& (sDoor signal?) $feff)
					startUpd:
					priority: 8
					setCycle: End self
				)
				(caskSound play:)
				(proc0_2)
				(gEgo
					setLoop: 6
					setCycle: Rev
					setMotion: MoveTo 190 152 self
				)
			)
			(4
				(if (proc0_5 140) (++ state))
				(if (not (gEgo mover?)) (gEgo setCycle: 0))
			)
			(5
				(gEgo setCycle: 0)
				(proc13_4 1550 (++ register) self)
			)
			(6
				(proc0_2)
				(gEgo setMotion: MoveTo 213 133 self)
			)
			(7
				(gEgo
					view: 550
					loop: (if (== gNewGuise 0) 7 else 5)
					cel: 0
					setPri: 8
				)
				(= ticks (+ 1 (* 2 (gEgo cycleSpeed?))))
			)
			(8
				(gEgo setCycle: CT 1 1 self)
				(if (proc0_5 140) (++ state))
			)
			(9
				(proc13_4 1550 (++ register) self)
			)
			(10 (gEgo setCycle: End self))
			(11
				(= ticks (+ (gEgo cycleSpeed?) 1))
			)
			(12
				(gEgo dispose:)
				(= cycles 2)
			)
			(13
				(proc806_1 100 140)
				(gClient newRoom: 560)
			)
		)
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 theStart theStart_2)
		(= start theStart)
		(super init: param1 param2 param3)
		(= start theStart_2)
	)
	
	(method (changeState newState)
		(if (<= (= state newState) start)
			(if local15
				(proc13_6 19)
				(proc13_4 register state self 80 local15)
				(proc13_6 0)
			else
				(proc13_4 register state self)
			)
		else
			(self dispose:)
		)
	)
	
	(method (cue param1)
		(if (not param1) (= start state))
		(super cue:)
	)
)

(instance screwUp of Script
	(properties)
	
	(method (changeState newState)
		(= state newState)
		(switch register
			(0
				(gClient setScript: series 0 1550 57 58)
				(++ register)
			)
			(1
				(switch newState
					(0
						(proc0_3)
						(proc851_0 @local16 999 0 self)
					)
					(1
						(keeper
							view: 533
							loop: 0
							cel: 0
							posn: 50 76
							init:
							setCycle: Walk
							setMotion: MoveTo 69 76 self
						)
					)
					(2
						(proc851_0 @local20 @local0 0 self)
					)
					(3
						(keeper setMotion: MoveTo 50 76 self)
					)
					(4
						(keeper hide: stopUpd:)
						(proc0_4)
						(++ register)
					)
				)
			)
			(2
				(switch newState
					(0
						(proc0_3)
						(proc851_0 @local16 999 0 self)
					)
					(1
						(guardX
							loop: 0
							init:
							setCycle: Walk
							setMotion: MoveTo 65 88 self
						)
					)
					(2
						(= local15 {Roger})
						(gClient setScript: series self 1550 62 65)
					)
					(3
						(= global145 30)
						(gClient newRoom: 170)
					)
				)
			)
		)
	)
)

(instance openGate of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gate
					signal: (& (sDoor signal?) $feff)
					startUpd:
					setCycle: Beg self
				)
			)
			(1
				(gateSound play:)
				(self dispose:)
			)
		)
	)
)

(instance resc of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gRgnMusic number: 530 loop: -1 play:)
				(sDoor cel: (sDoor lastCel:) priority: 8 stopUpd:)
				(gate cel: (gate lastCel:))
				(gEgo
					view: 550
					loop: 4
					cel: 0
					posn: 193 138
					setPri: 8
					setCycle: End self
				)
				(hal init:)
				(hob init:)
				(dick init:)
				(= cycles 1)
			)
			(1 (gate addToPic:))
			(2 (proc0_2 1) (= cycles 2))
			(3
				(if (proc0_5 211)
					(proc851_0 1 @local84 @local9 1 self)
				else
					(proc851_0 1 @local25 999 3 self)
				)
			)
			(4 (hal setHeading: 110 self))
			(5
				(if (proc0_5 211)
					(proc851_0 1 @local88 999 3 self)
				else
					(proc851_0 3 @local29 999 3 @local9 1 @local12 0 self)
				)
			)
			(6
				(cond 
					((proc0_5 211) (= cycles 1))
					((proc851_1) (proc806_1 50) (proc851_0 1 @local38 999 3 self))
					(else (= state (+ state 3)) (proc851_0 1 @local46 999 3 self))
				)
				(hal setCycle: Walk setLoop: Grooper)
				(hob setCycle: Walk setLoop: Grooper)
				(dick setCycle: Walk setLoop: Grooper)
			)
			(7
				(hal setMotion: PPath @local95)
				(hob setMotion: PPath @local95)
				(dick setMotion: PPath @local95)
				(gEgo setHeading: 90 self)
			)
			(8
				(sDoor signal: (& (sDoor signal?) $feff) setCycle: Beg)
				(gEgo setMotion: MoveTo 110 130 self)
			)
			(9
				(gClient newRoom: 530)
				(hal setMotion: 0)
				(hob setMotion: 0)
				(dick setMotion: 0)
				(DisposeScript 852)
			)
			(10
				(proc0_6 211)
				(gEgo setMotion: MoveTo 213 133 self)
			)
			(11
				(gEgo
					view: 550
					loop: 5
					cel: 0
					setPri: 8
					setCycle: End self
				)
				(hal setMotion: MoveTo 193 138)
				(hob setMotion: MoveTo 193 138)
				(dick setMotion: MoveTo 193 138)
			)
			(12
				(= ticks (gEgo cycleSpeed?))
			)
			(13
				(gEgo dispose:)
				(= cycles 2)
			)
			(14
				(gRgnMusic fade: 0 30 8 1)
				(gClient newRoom: 560)
			)
		)
	)
)

(instance hal of Actor
	(properties
		x 110
		y 130
		view 23
		loop 7
		cel 5
		signal $6000
	)
)

(instance hob of Actor
	(properties
		x 128
		y 121
		view 23
		loop 5
		cel 1
		signal $6000
	)
)

(instance dick of Actor
	(properties
		x 144
		y 130
		view 23
		loop 1
		cel 5
		signal $6000
	)
)

(instance spigotSound of Sound
	(properties
		flags $0001
		number 552
	)
)

(instance caskSound of Sound
	(properties
		flags $0001
		number 551
	)
)

(instance caskCloseSound of Sound
	(properties
		flags $0001
		number 553
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 532
	)
)

(instance csk1 of Feature
	(properties
		x 157
		y 89
		onMeCheck $0002
		approachX 163
		approachY 105
		lookStr 30
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 43))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance csk2 of Feature
	(properties
		x 197
		y 85
		onMeCheck $1000
		approachX 201
		approachY 101
		lookStr 30
	)
	
	(method (doVerb)
		(csk1 doVerb: &rest)
	)
)

(instance csk3 of Feature
	(properties
		x 220
		y 117
		onMeCheck $0004
		approachX 187
		approachY 130
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 44))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance csk4 of Feature
	(properties
		x 231
		y 133
		onMeCheck $0008
		approachX 201
		approachY 144
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(proc13_4 1550 45)
				(proc13_4 1550 46)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance csk5 of Feature
	(properties
		x 252
		y 146
		onMeCheck $0010
		approachX 220
		approachY 156
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 47))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance csk6 of Feature
	(properties
		x 271
		y 165
		onMeCheck $0020
		approachX 240
		approachY 175
		lookStr 31
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 48))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance csk7 of Feature
	(properties
		x 100
		y 189
		onMeCheck $0400
		approachX 110
		approachY 170
		lookStr 34
	)
	
	(method (doVerb)
		(csk8 doVerb: &rest)
	)
)

(instance csk8 of Feature
	(properties
		x 30
		y 161
		onMeCheck $0080
		approachX 55
		approachY 151
		lookStr 34
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 54))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance csk9 of Feature
	(properties
		x 25
		y 134
		onMeCheck $0800
		approachX 38
		approachY 124
		lookStr 34
	)
	
	(method (doVerb)
		(csk8 doVerb: &rest)
	)
)

(instance base of Feature
	(properties
		onMeCheck $0040
		lookStr 33
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 53))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance sacks of Feature
	(properties
		onMeCheck $0100
		lookStr 35
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1550 55))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance walls of Feature
	(properties
		onMeCheck $0001
		lookStr 36
	)
)

(instance floor of Feature
	(properties
		onMeCheck $0200
		lookStr 37
	)
)
