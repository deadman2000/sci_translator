;;; Sierra Script 1.0 - (do not remove this comment)
(script# 530)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n951)
(use n958)
(use n961)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	rm530 0
	keeper 1
	gate 2
	payKeeper 3
)

(local
	[local0 9] = [541 0 2 4 22 31 25 23 5]
	[local9 9] = [535 0 2 4 26 38 22 26 27]
	[local18 4] = [1535 42 1]
	[local22 8] = [1535 43 1 0 1535 43 1]
	[local30 4] = [1535 44 1]
	[local34 4] = [1530 26 1]
	[local38 4] = [1535 45 1]
	[local42 4] = [1535 53 1]
	[local46 4] = [1535 55 1]
	[local50 4] = [1535 51 1]
	[local54 4] = [1535 50 1]
	[local58 4] = [1535 48 1]
	[local62 4] = [1535 46 1]
	[local66 4] = [1535 52 1]
	[local70 4] = [1535 54 1]
	[local74 9] = [1530 141 2 3 1 3 1 2]
	[local83 4] = [1535 47 1]
	[local87 8] = [1535 56 1 2 1 2 1]
	[local95 4] = [1535 41 1]
	[local99 5] = [1535 3 2 1]
	[local104 4] = [1535 5 1]
	[local108 7] = [1535 33 1 2 1 2]
	[local115 7] = [1535 37 1 2 1 2]
	[local122 7] = [1535 6 2 1 2 1]
	[local129 5] = [1535 10 2 1]
	[local134 7] = [1535 12 2 1 1 1]
	[local141 4] = [1535 16 1]
	[local145 5] = [1535 20 2 1]
	[local150 5] = [1535 20 2 1]
	[local155 6] = [1535 22 2 1 1]
	[local161 6] = [1535 25 2 1 2]
	[local167 5] = [1535 28 1 2]
	[local172 6] = [1535 30 2 1 1]
	[local178 4] = [1530 103 1]
	[local182 4] = [1530 104 1]
	[local186 6] = [1530 57 1 2 1]
	[local192 7] = [1530 60 1 2 1 2]
	[local199 5] = [1530 44 1 2]
	[local204 4] = [1530 86 1]
	[local208 4] = [1530 95 1]
	[local212 7] = [1530 49 2 1 2 1]
	[local219 4] = [1535 2 1]
	[local223 4] = [1530 85 1]
	[local227 11] = [1530 1 3 2 4 1 2 1 2 1]
	[local238 21] = [1530 24 1 2 0 1530 118 1 2 0 1530 120 1 1 2 0 1530 123 2 1]
	local259
	gEgoView
	gEgoLoop
	keeperHeading
	local263
	keeperActions
	gateActions
	local266
	local267
	local268
	local269
)
(procedure (localproc_0566)
	(switch (++ local267)
		(1
			(proc851_0 @local122 @local9 999)
		)
		(2
			(proc851_0 @local129 @local9 999)
		)
		(3
			(proc851_0 @local134 @local9 999)
		)
		(else 
			(proc851_0 @local141 @local9)
		)
	)
)

(instance rm530 of StdRoom
	(properties
		picture 530
		south 270
		tpX 180
		tpY 180
	)
	
	(method (init &tmp temp0)
		(switch gHeading
			(803
				(gEgo x: 140 loop: 1 edgeHit: 1)
			)
			(270
				(gEgo x: 140 loop: 1 edgeHit: 1)
			)
			(else 
				(proc0_4)
				(gEgo edgeHit: 0)
			)
		)
		(++ global159)
		(if (proc0_5 125) ((ScriptID 532 0) init:))
		(if (== global130 10)
			(gClient setScript: (ScriptID 533 0))
		)
		(super init:)
		(keeper
			init:
			setHeading: 270
			setCycle: StopWalk 534
			approachVerbs: 5 4
		)
		(gate init: approachVerbs: 3)
		(fire init: setCycle: Fwd)
		(morStool init:)
		(morTable init:)
		(walls init:)
		(bar init: approachVerbs: 3)
		(lamps init:)
		(bottles init: approachVerbs: 3)
		(cTable init:)
		(cMug init:)
		(stools init:)
		(bTable init:)
		(bBenches init:)
		(tDrunk init:)
		(floor init:)
		(bMug init:)
		(fDrunk init:)
		(casks init:)
		(fireSound play:)
		(cond 
			(
				(and
					(== gNewGuise 5)
					(not (proc0_5 125))
					(proc999_5 global130 5 6)
				)
				((ScriptID 531 0) init:)
				(if
					(or
						(and
							(not (proc0_5 125))
							(== gNewGuise 5)
							(proc999_5 global130 5 6)
							(not (proc0_5 205))
						)
						(== gHeading 540)
					)
					((ScriptID 534 0) init:)
				)
			)
			((== global130 10)
				(morTable actions: vbParty)
				(morStool actions: vbParty)
				(gate approachVerbs: 0)
				(gEgo actions: egoActions)
			)
			((proc0_5 125) (morTable actions: vbParty) (morStool actions: vbParty))
			(else
				(keeper actions: vbGenPub)
				(if (not (proc0_5 125)) (gate addToPic:))
				(if (proc999_5 gNewGuise 4 0)
					((gClient script?) next: inStuff)
				)
				(if (proc999_5 gNewGuise 2 3)
					((gClient script?) next: inJewelerStuff)
				)
			)
		)
		(= local259 global34)
		(= global34 1)
		(if (and (not (proc0_5 125)) (!= global130 10))
			(gClient
				addObstacle:
					((Polygon new:)
						type: 3
						init:
							150
							240
							168
							181
							198
							176
							226
							176
							226
							170
							243
							170
							263
							188
							314
							171
							266
							183
							245
							164
							284
							150
							236
							157
							228
							149
							198
							149
							198
							127
							232
							118
							232
							106
							98
							106
							92
							112
							168
							112
							152
							129
							49
							129
							85
							130
							80
							140
							72
							144
							45
							161
							48
							165
							48
							176
							41
							186
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
							75
							187
							49
							187
							91
							148
							141
							149
							147
							142
						yourself:
					)
			)
			(bucket init: setScript: pour)
			(= temp0 (Random 1 5))
			(if (== gNewGuise 0) (= temp0 2))
			(if (== gNewGuise 4) (= temp0 1))
			(if (< temp0 4)
				(man1 init: setScript: drinking)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init: 132 133 154 139 131 145 110 140
							yourself:
						)
				)
			)
			(if (and (!= temp0 3) (!= temp0 4))
				(man2 init: addToPic:)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init: 203 170 203 161 235 161 236 169
							yourself:
						)
				)
			)
			(if (and (!= temp0 1) (!= temp0 4))
				(man3 init: addToPic:)
			)
		)
	)
	
	(method (dispose)
		(= global34 local259)
		(if (== (gRgnMusic number?) 530)
			(gRgnMusic fade: 50 30 8 0)
		else
			(gRgnMusic stop:)
		)
		(super dispose:)
		(if (gEgo has: 14) (proc0_6 205))
		(proc958_0 0 534 531 532 533)
	)
)

(instance inStuff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== gNewGuise 4)
					(proc851_0 4 @local227 @local9 0 999 3 19 1 20 2 self)
				else
					(gRgnMusic number: 542 loop: -1 play:)
					(++ state)
					(proc851_0 @local238 19 20 self)
				)
			)
			(1 (self dispose:))
			(2
				(gRgnMusic number: 543 loop: 1 play: self)
			)
			(3
				(= global145 27)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance inJewelerStuff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					((and (proc0_5 219) (proc0_5 220)) (= cycles 1))
					((and (proc0_5 219) (== gNewGuise 3)) (proc0_6 220) (proc851_0 @local108 @local9 999 self))
					((and (proc0_5 220) (== gNewGuise 2)) (proc0_6 219) (proc851_0 @local115 @local9 999 self))
					(else
						(if (== gNewGuise 3) (proc0_6 220) else (proc0_6 219))
						(= cycles 1)
					)
				)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance dieNow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(roger setCycle: Walk init:)
				(giles setCycle: Walk init:)
				(jack setCycle: Walk init:)
				(roger setMotion: PolyPath 202 141 self)
				(giles setMotion: PolyPath 208 163 self)
				(jack setMotion: PolyPath 180 169 self)
			)
			(1)
			(2)
			(3
				(proc851_0 3 @local74 999 0 19 2 20 3 self 1)
			)
			(4
				(= global145 29)
				(gClient newRoom: 170)
				(self dispose:)
			)
		)
	)
)

(instance payKeeper of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					((not register) (self dispose:) (proc0_4) (return))
					((== register 1) (= local263 @local18) (++ state))
					((== register 4) (= local263 @local22))
					((> register 4) (= local263 @local30))
				)
				(= cycles 1)
			)
			(1
				(self setScript: pullAPint self)
			)
			(2
				(if (== register 2)
					(= cycles 1)
				else
					(proc851_0
						local263
						@local9
						(if ((ScriptID 851 3) underBits?) 999 else 0)
						self
					)
				)
			)
			(3
				(cond 
					((>= register 4)
						(cond 
							((gPennies taken?) (gMoney put:) (gPennies get: 1))
							((>= (gHapennies taken?) 2) (gMoney put:) (gHapennies get: 2))
							((gHapennies taken?) (gMoney put:) (gHapennies get: 1) (gFarthings get: 2))
							(else (gMoney put:) (gFarthings get: 4))
						)
						(= register 2)
					)
					((>= register 2)
						(if (gHapennies taken?)
							(gMoney put:)
							(gHapennies get: 1)
						else
							(gMoney put:)
							(gFarthings get: 2)
						)
						(= register 1)
					)
					(else (gMoney put:) (self dispose:) (proc0_4) (return))
				)
				(= gEgoView (gEgo view?))
				(= gEgoLoop (gEgo loop?))
				(= cycles 1)
			)
			(4
				(gEgo
					view: 536
					loop: 4
					cel:
					(switch gNewGuise
						(5 0)
						(4 1)
						(6 2)
						(1 3)
						(2 4)
						(3 4)
					)
				)
				(= seconds 3)
				(if (>= (++ local266) 5) (= next dieNow))
			)
			(5
				(gEgo view: gEgoView loop: gEgoLoop)
				(= ticks 10)
			)
			(6
				(if (== local266 1)
					(= [local34 1]
						(+
							26
							(switch gNewGuise
								(5 1)
								(4 3)
								(6 2)
								(1 0)
								(2 4)
								(3 4)
							)
						)
					)
					(proc851_0 @local34 999 0 self)
				else
					(= cycles 1)
				)
			)
			(7
				(if (-- register)
					(= state (- state 4))
					(= ticks 100)
				else
					(proc0_4)
					(self dispose:)
				)
			)
		)
	)
)

(instance pullAPint of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(keeper setHeading: 90 setMotion: MoveFwd 10 self)
			)
			(1 (= ticks 45))
			(2
				(keeper setHeading: 270 setMotion: MoveFwd 10 self)
			)
			(3 (self dispose:))
		)
	)
)

(instance pour of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 5 12)))
			(1
				(bucket setMotion: MoveTo 251 100 self)
				(rope init:)
			)
			(2
				(if (or (gClient script?) (keeper script?))
					(= cycles 1)
					(-- state)
				else
					(keeper setMotion: MoveTo 253 117 self)
					(= keeperActions (keeper actions?))
					(= gateActions (gate actions?))
					(keeper actions: vbNoCanDo)
					(gate actions: vbNoCanDo)
				)
			)
			(3 (= ticks 50))
			(4
				(keeper setMotion: MoveTo 229 108 self)
			)
			(5 (keeper setHeading: 90 self))
			(6
				(keeper view: 536 loop: 1 cel: 0 setCycle: CT 2 1)
				(= ticks 50)
			)
			(7
				(keeper setCycle: CT 0 -1 self)
			)
			(8
				(keeper loop: 3 setCycle: End self)
			)
			(9
				(keeper
					view: 533
					setCycle: StopWalk 534
					setMotion: MoveTo 253 120 self
				)
				(bucket setMotion: MoveTo 251 40 self)
			)
			(10
				(keeper setMotion: MoveTo 265 133 self)
			)
			(11
				(keeper setHeading: 270 self)
			)
			(12
				(keeper actions: keeperActions)
				(gate actions: gateActions)
			)
			(13
				(rope dispose:)
				(bucket dispose:)
			)
		)
	)
)

(instance drinking of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 3 12)))
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

(instance notBehindBar of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= keeperHeading (keeper heading?))
				(keeper setHeading: 180 self)
			)
			(1
				(proc851_0 @local204 @local9 0 self)
			)
			(2
				(keeper setHeading: keeperHeading)
				(gEgo setHeading: 270 setMotion: MoveFwd 60 self)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance dontBow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1530 127 self)
			)
			(1 (proc13_4 1530 128 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance usePipe of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1530 138 self))
			(1
				(proc13_4 1530 139 1)
				(self dispose:)
			)
		)
	)
)

(instance fire of Prop
	(properties
		x 22
		y 144
		lookStr 48
		view 530
		priority 11
		signal $4810
		detailLevel 3
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== global115 2)
					(proc13_4 1530 89 1)
				else
					(proc13_4 1530 88 1)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance gate of Prop
	(properties
		x 164
		y 102
		approachX 190
		approachY 115
		view 530
		loop 2
		priority 6
		signal $6811
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (< (gEgo distanceTo: self) 25)
					(proc13_4 1530 74 1)
				else
					(proc13_4 1530 73 1)
				)
			)
			(3
				(if (== global130 10)
					(proc851_0 @local182 @local9 0 self)
				else
					(proc851_0 @local178 @local9 0 self)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance rope of View
	(properties
		x 251
		y -18
		view 536
		loop 5
		cel 1
		priority 6
		signal $6810
	)
	
	(method (doit)
		(= y (- (bucket y?) 55))
	)
)

(instance bucket of Actor
	(properties
		x 251
		y 37
		yStep 1
		view 536
		loop 5
		priority 6
		signal $6810
		moveSpeed 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (proc0_5 123)
					(proc13_4 1530 46 0 1)
				else
					(proc806_1 10 123)
					(proc13_4 1530 43 self 1)
				)
			)
			(3 (proc13_4 1530 87 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
	
	(method (cue)
		(proc851_0 @local199 999 @local9)
	)
)

(instance roger of Actor
	(properties
		x 138
		y 200
		view 753
		loop 3
	)
)

(instance giles of Actor
	(properties
		x 138
		y 240
		view 753
		loop 3
	)
)

(instance jack of Actor
	(properties
		x 138
		y 280
		view 753
		loop 3
	)
)

(instance keeper of Actor
	(properties
		x 265
		y 133
		approachX 220
		approachY 148
		view 533
		loop 1
		signal $6000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1535 0 1))
			(3 (proc13_4 1535 1 1))
			(4
				(switch param2
					(0
						(keeper setScript: payKeeper 0 (gMoney doit:))
					)
					(2 (proc851_0 @local38 @local9))
					(3 (proc851_0 @local62 @local9))
					(4 (proc851_0 @local62 @local9))
					(5 (proc851_0 @local66 @local9))
					(6 (proc851_0 @local42 @local9))
					(7 (proc851_0 @local46 @local9))
					(8
						(if (not (proc0_6 204))
							(proc851_0 @local87 @local9 999)
						else
							(proc851_0 @local62 @local9)
						)
					)
					(9 (proc851_0 @local66 @local9))
					(10
						(proc851_0 @local50 @local9)
					)
					(12
						(proc851_0 @local54 @local9)
					)
					(13
						(proc851_0 @local95 @local9)
					)
					(14
						(proc851_0 @local58 @local9)
					)
					(15
						(proc851_0 @local83 @local9)
					)
					(16
						(proc851_0 @local62 @local9)
					)
					(17
						(proc851_0 @local54 @local9)
					)
					(18
						(proc851_0 @local70 @local9)
					)
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance man1 of Prop
	(properties
		x 131
		y 139
		lookStr 79
		view 531
		signal $6000
		cycleSpeed 9
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(5 (proc13_4 1530 116 1))
			(3 (proc13_4 1530 110 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance man2 of Prop
	(properties
		x 219
		y 171
		lookStr 79
		view 753
		loop 1
		signal $4000
		detailLevel 3
	)
	
	(method (doVerb)
		(man1 doVerb: &rest)
	)
)

(instance man3 of Prop
	(properties
		x 30
		y 181
		lookStr 79
		view 753
	)
	
	(method (doVerb)
		(man1 doVerb: &rest)
	)
)

(instance morStool of Feature
	(properties
		x 200
		y 192
		onMeCheck $0002
		approachX 190
		approachY 175
	)
	
	(method (init)
		(self
			approachVerbs:
				(if
					(and
						(not (proc0_5 125))
						(== gNewGuise 5)
						(proc999_5 global130 5 6)
						(not (proc0_5 205))
					)
					3
				else
					0
				)
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if
					(and
						(not (proc0_5 125))
						(== gNewGuise 5)
						(proc999_5 global130 5 6)
						(not (proc0_5 205))
					)
					(proc13_4 1530 55)
				else
					(proc13_4 1530 56)
				)
			)
			(3
				(if
					(and
						(not (proc0_5 125))
						(== gNewGuise 5)
						(proc999_5 global130 5 6)
						(not (proc0_5 205))
					)
					(cond 
						((or (gEgo has: 14) (proc0_5 124)) ((ScriptID 534 0) doVerb: 5))
						((proc0_5 215) ((ScriptID 534 0) cue:))
						(local269
							(proc0_6 215)
							(proc851_0 @local192 9 @local0 (ScriptID 534 0))
						)
						(else (= local269 1) (proc851_0 @local186 9 @local0))
					)
				else
					(proc13_4 1530 96 1)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance morTable of Feature
	(properties
		x 217
		y 189
		onMeCheck $0004
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1bdc
			lsg      global130
			ldi      4
			gt?     
			bnt      code_1bcf
			pushi    1
			pushi    205
			callb    proc0_5,  2
			bnt      code_1bcf
			pushi    1
			pushi    198
			callb    proc0_6,  2
			not     
			bnt      code_1bcf
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_1bb5
			lsg      gNewGuise
			ldi      5
			eq?     
			bnt      code_1bb5
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_1bb5
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
code_1bb5:
			not     
			bnt      code_1bcf
			pushi    3
			lea      @local212
			push    
			lea      @local9
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_1c3f
code_1bcf:
			pushi    2
			pushi    1530
			pushi    53
			calle    proc13_4,  4
			jmp      code_1c3f
code_1bdc:
			dup     
			ldi      3
			eq?     
			bnt      code_1c34
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_1c25
			lsg      gNewGuise
			ldi      5
			eq?     
			bnt      code_1c25
			pushi    3
			lsg      global130
			pushi    5
			pushi    6
			calle    proc999_5,  6
			bnt      code_1c25
			pushi    1
			pushi    205
			callb    proc0_5,  2
			not     
			bnt      code_1c25
			pushi    3
			lea      @local208
			push    
			lea      @local0
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_1c3f
code_1c25:
			pushi    3
			pushi    1530
			pushi    94
			pushi    1
			calle    proc13_4,  6
			jmp      code_1c3f
code_1c34:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1c3f:
			toss    
			ret     
		)
	)
)

(instance walls of Feature
	(properties
		onMeCheck $0001
		lookStr 75
	)
)

(instance bar of Feature
	(properties
		x 240
		y 135
		onMeCheck $0008
		approachX 226
		approachY 148
		lookStr 40
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(proc851_0 @local223 @local9)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance lamps of Feature
	(properties
		onMeCheck $0010
		lookStr 47
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 92 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance bottles of Feature
	(properties
		x 276
		y 135
		onMeCheck $0020
		approachX 284
		approachY 150
		lookStr 42
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(keeper setScript: notBehindBar)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance cTable of Feature
	(properties
		x 111
		y 163
		onMeCheck $0040
		lookStr 64
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 90 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance cMug of Feature
	(properties
		x 133
		y 167
		onMeCheck $0080
		lookStr 65
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 91 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance stools of Feature
	(properties
		onMeCheck $0100
		lookStr 56
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 97 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance bTable of Feature
	(properties
		x 104
		y 113
		onMeCheck $0200
		lookStr 66
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 98 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance bBenches of Feature
	(properties
		x 104
		y 113
		onMeCheck $0400
		lookStr 67
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 97 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance tDrunk of Feature
	(properties
		x 92
		y 118
		onMeCheck $0800
		lookStr 68
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 99 1))
			(4
				(switch param2
					(0 (proc13_4 1530 129 1))
					(11 (proc13_4 1530 133 1))
					(14 (proc13_4 1530 135 1))
					(5 (gEgo setScript: usePipe))
					(6 (proc13_4 1530 140 1))
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(5 (proc13_4 1530 125 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance floor of Feature
	(properties
		onMeCheck $1000
		lookStr 76
	)
)

(instance bMug of Feature
	(properties
		x 113
		y 114
		nsTop 92
		nsLeft 111
		nsBottom 97
		nsRight 117
		lookStr 69
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 100 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance fDrunk of Feature
	(properties
		x 64
		y 137
		onMeCheck $2000
		lookStr 70
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 101 1))
			(4
				(switch param2
					(0 (proc13_4 1530 129 1))
					(11 (proc13_4 1530 134 1))
					(14 (proc13_4 1530 136 1))
					(3 (proc13_4 1530 132 1))
					(6 (proc13_4 1530 140 1))
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(5 (proc13_4 1530 126 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance casks of Feature
	(properties
		onMeCheck $4000
		lookStr 72
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1530 93 1))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance vbParty of SpecialDoVerb
	(properties)
	
	(method (doVerb)
		(proc13_4 1530 54 1)
		(return 1)
	)
)

(instance vbNoCanDo of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(return
			(switch theVerb
				(2 (return 0))
				(else 
					(proc851_0 @local219 @local9)
					(return 1)
				)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(4
				(switch param2
					(1 (proc13_4 1530 147 1))
					(else 
						(gDoVerbCode doit: theVerb &rest)
					)
				)
			)
		)
	)
)

(instance vbGenPub of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(return
			(switch theVerb
				(5
					(switch gNewGuise
						(1
							(if local267
								(proc851_0 @local150 @local9 999)
							else
								(++ local267)
								(proc851_0 @local145 @local9 999)
							)
						)
						(5
							(if local267
								(proc851_0 @local104 @local9)
							else
								(++ local267)
								(proc851_0 @local172 @local9 999)
							)
						)
						(6
							(switch (++ local267)
								(1
									(proc851_0 @local155 @local9 999)
								)
								(2
									(proc851_0 @local161 @local9 999)
								)
								(else 
									(proc851_0 @local167 @local9 999)
								)
							)
						)
						(4
							(if local267
								(proc851_0 @local104 @local9)
							else
								(proc851_0 @local99 @local9 999)
								(++ local267)
							)
						)
						(2 (localproc_0566))
						(3 (localproc_0566))
					)
				)
				(10 (keeper setScript: dontBow))
				(else  (return 0))
			)
		)
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 532
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)
