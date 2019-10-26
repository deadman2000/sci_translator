;;; Sierra Script 1.0 - (do not remove this comment)
(script# 532)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n852)
(use n945)
(use n946)
(use n951)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	party 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 3] = [-1 5004 19]
	[local12 3] = [-1 5018 19]
	[local15 6] = [1530 9 1 2 1]
	[local21 7] = [1530 12 2 1 1 2]
	[local28 4] = [1530 23 1]
	[local32 4] = [1530 16 1]
	[local36 9] = [1530 17 3 2 3 3 3 1]
	[local45 4] = [1530 112 1]
	[local49 4] = [1530 104 1]
	[local53 4] = [1530 129 1]
	[local57 39] = [186 101 187 109 191 114 192 118 -32768 182 162 178 168 174 172 165 176 159 182 153 196 153 239 -32768 186 165 181 170 174 172 165 176 159 182 153 196 153 239 -32768]
	local96
)
(instance party of Code
	(properties)
	
	(method (init)
		(sheriff init: stopUpd:)
		((ScriptID 530 1) approachVerbs: 0)
		((ScriptID 530 2)
			setCel: ((ScriptID 530 2) lastCel:)
			approachVerbs: 0
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 3
					init:
						168
						129
						142
						129
						167
						140
						160
						150
						188
						150
						188
						165
						153
						165
						137
						189
						164
						189
						165
						184
						186
						184
						189
						177
						201
						177
						201
						159
						225
						159
						244
						170
						265
						178
						246
						163
						287
						152
						234
						156
						226
						149
						204
						150
						206
						129
						216
						109
						241
						109
						241
						105
						212
						105
						204
						114
						174
						114
						174
						125
					yourself:
				)
		)
		(man1 init: approachVerbs: 5 3)
		(man2 init: stopUpd:)
		(man3 init: addToPic:)
		(man4 init: addToPic:)
		(man5 init: addToPic:)
		(man6 init: addToPic:)
		(man7 init: addToPic:)
		(man8 init: addToPic:)
		(wench1 init: setCycle: Fwd)
		(wench2 init: stopUpd:)
		(gClient setScript: enter)
		(pubSound play:)
	)
)

(instance enter of Script
	(properties)
	
	(method (doit)
		(super doit:)
		(if (>= (gEgo y?) 142)
			(gEgo setMotion: 0 setScript: prayOrDie)
			(self dispose:)
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(dick setScript: escape self)
				(gEgo posn: 192 99 setLoop: 2 setMotion: PPath @local57)
			)
			(1
				(man1
					view: 753
					setCycle: Walk
					setMotion: MoveTo 192 111 self
				)
				((ScriptID 530 1) addToPic:)
				((ScriptID 530 2) addToPic:)
			)
			(2
				(global10 doit:)
				((ScriptID 530 1) actions: vbKeeper)
				((ScriptID 530 2) actions: vbGate)
				(man1 setHeading: 180 self)
			)
			(3 (man1 addToPic:) (proc0_4))
		)
	)
)

(instance escape of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(hal
					init:
					posn: 168 195
					setCycle: Walk
					setMotion: PolyPath 153 239 hal
				)
				(hob
					init:
					posn: 188 180
					setCycle: Walk
					setMotion: PolyPath 153 239 hob
				)
				(dick
					init:
					posn: 190 160
					setCycle: Walk
					setMotion: PolyPath 152 187 self
				)
			)
			(1
				(dick setMotion: MoveTo 152 239 self)
			)
			(2
				(wench2 setScript: makeOut)
				(man2 setScript: drinking)
				(dick dispose:)
			)
		)
	)
)

(instance prayOrDie of Script
	(properties)
	
	(method (doit)
		(super doit:)
		(if (and local96 (gEgo mover?))
			(= next die)
			(self dispose:)
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(sheriff setCycle: End self)
			)
			(1 (proc0_9 gEgo sheriff self))
			(2 (= cycles 1))
			(3
				(proc851_0 @local15 12 999 self)
			)
			(4
				(self setScript: changeLaughter self 0)
			)
			(5
				(= local96 1)
				(man2 setCycle: Beg setScript: 0)
				(wench2 setScript: 0 setLoop: 0)
				(wench1
					setCel: (wench2 lastCel:)
					setCycle: CT 3 1 wench1
				)
				(proc0_4)
			)
			(6
				(sheriff setCycle: Beg sheriff)
				(self dispose:)
			)
		)
	)
)

(instance bless of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= local96 0)
				(proc806_1 10)
				(gEgo view: 531 setLoop: 2 setCel: 0 setCycle: End self)
			)
			(1
				(proc851_0 @local21 12 999 self)
			)
			(2
				(gPennies put: 1)
				(proc0_2)
				(wench1 setScript: changeLaughter 0 1)
				(= ticks 30)
			)
			(3
				(if
				(>= (global1 detailLevel:) (man2 detailLevel:))
					(man2 setScript: drinking)
				)
				(if
				(>= (global1 detailLevel:) (wench2 detailLevel:))
					(wench2 setScript: makeOut)
				)
				(wench1 setLoop: 1 setCycle: Fwd)
				(= cycles 1)
			)
			(4
				(gEgo setMotion: PolyPath 196 156 self)
			)
			(5
				(gEgo setMotion: PolyPath 155 189 self)
			)
			(6
				(gEgo setHeading: 180 setMotion: MoveFwd 40 self)
			)
			(7 (self dispose:))
		)
	)
)

(instance die of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds 1))
			(1
				(proc0_3)
				(gEgo setMotion: 0)
				(proc851_0 @local32 12 0 self)
			)
			(2
				(proc851_0 3 @local36 12 0 999 1 @local9 2 self)
			)
			(3
				(= global145 28)
				(gRgnMusic stop:)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance drinking of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 3 6)))
			(1
				(client setCycle: CT 2 1 self)
			)
			(2
				(client setCycle: Beg self)
				(= state -1)
			)
		)
	)
)

(instance makeOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (wench2 setCycle: End self))
			(1
				(wench2 setLoop: 2 setCycle: End self)
			)
			(2
				(wench2 setCycle: Beg self)
				(= state (- state 2))
			)
		)
	)
)

(instance changeLaughter of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== register 0)
					(pubSound number: 541 setLoop: 0 play: self)
					(gRgnMusic number: 538 setLoop: 0 play:)
					(= cycles 1)
				else
					(pubSound number: 540 setLoop: 0 play: self)
					(gRgnMusic number: 530 setLoop: -1 play:)
					(= cycles 1)
				)
			)
			(1 (= ticks 1000))
			(2
				(= ticks 0)
				(if (== register 1)
					(pubSound number: 539 setLoop: -1 play:)
				)
				(self dispose:)
			)
		)
	)
)

(instance sheriff of Prop
	(properties
		x 169
		y 160
		approachX 190
		approachY 175
		lookStr 77
		view 531
		loop 1
		priority 12
		signal $4810
		cycleSpeed 9
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(if local96
					(prayOrDie setScript: bless prayOrDie)
				else
					(proc13_4 1530 0 1)
				)
			)
			(3
				(if local96
					(proc851_0 @local28 12)
				else
					(proc13_4 1530 111 1)
				)
			)
			(4
				(cond 
					((== param2 0) (proc851_0 @local53 12))
					(local96 (gEgo setScript: die))
					(else (super doVerb: theVerb param2))
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
	
	(method (cue)
		(self addToPic:)
	)
)

(instance hal of Actor
	(properties
		view 23
		signal $6000
	)
	
	(method (cue)
		(self dispose:)
	)
)

(instance hob of Actor
	(properties
		view 23
		signal $6000
	)
	
	(method (cue)
		(self dispose:)
	)
)

(instance dick of Actor
	(properties
		view 23
		signal $6000
		illegalBits $0000
	)
)

(instance man1 of Actor
	(properties
		x 211
		y 112
		approachX 192
		approachY 116
		lookStr 81
		view 754
		loop 2
		signal $6000
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5
				(proc851_0 1 @local45 @local12 1)
			)
			(3
				(proc851_0 1 @local49 @local12 1)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance man2 of Prop
	(properties
		x 95
		y 131
		view 531
		signal $4000
		detailLevel 2
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d4a
			pushi    3
			pushi    1530
			pushi    78
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d82
code_0d4a:
			dup     
			ldi      5
			eq?     
			bnt      code_0d60
			pushi    3
			pushi    1530
			pushi    114
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d82
code_0d60:
			dup     
			ldi      3
			eq?     
			bnt      code_0d76
			pushi    3
			pushi    1530
			pushi    110
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d82
code_0d76:
			dup     
			class    6629
			eq?     
			bnt      code_0d82
			pToa     species
			lap      theVerb
code_0d82:
			toss    
			ret     
		)
	)
)

(instance man3 of Actor
	(properties
		x 133
		y 139
		lookStr 78
		view 754
		signal $6800
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1530 78 1))
			(5 (proc13_4 1530 116 1))
			(3 (proc13_4 1530 110 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance man4 of View
	(properties
		x 219
		y 173
		view 754
		loop 1
		signal $4000
	)
	
	(method (doVerb)
		(man3 doVerb: &rest)
	)
)

(instance man5 of View
	(properties
		x 128
		y 187
		view 754
		signal $4000
	)
	
	(method (doVerb)
		(man3 doVerb: &rest)
	)
)

(instance man6 of View
	(properties
		x 75
		y 156
		view 531
		cel 6
	)
	
	(method (doVerb)
		(man3 doVerb: &rest)
	)
)

(instance man7 of View
	(properties
		x 44
		y 185
		view 754
		cel 3
	)
	
	(method (doVerb)
		(man3 doVerb: &rest)
	)
)

(instance man8 of View
	(properties
		x 227
		y 122
		view 531
		signal $4000
	)
	
	(method (doVerb)
		(man3 doVerb: &rest)
	)
)

(instance wench1 of Prop
	(properties
		x 108
		y 140
		view 532
		loop 1
		priority 13
		signal $4010
		cycleSpeed 9
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1530 83 1))
			(5 (proc13_4 1530 108 1))
			(3 (proc13_4 1530 107 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (cue)
		(self setLoop: 3)
	)
)

(instance wench2 of Prop
	(properties
		x 157
		y 127
		view 532
		signal $4000
		cycleSpeed 10
		detailLevel 2
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1530 82 1))
			(5 (proc13_4 1530 113 1))
			(3 (proc13_4 1530 105 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance vbKeeper of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(switch theVerb
				(5 (proc13_4 1530 38 1))
				(3 (return 0))
				(2 (return 0))
				(4
					(if (== param2 0) (proc13_4 1530 130 1) else (return 1))
				)
				(else  (return 1))
			)
		)
	)
)

(instance vbGate of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(return
			(switch theVerb
				(2 (proc13_4 1530 39 1))
				(3 (proc13_4 1530 84 1))
				(else  (return 0))
			)
		)
	)
)

(instance pubSound of Sound
	(properties
		flags $0001
		number 539
		loop -1
	)
)
