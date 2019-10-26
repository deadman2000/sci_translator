;;; Sierra Script 1.0 - (do not remove this comment)
(script# 590)
(include sci.sh)
(use n000)
(use n013)
(use n601)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm590 0
)

(local
	local0
	local1
	[local2 2]
	[newWave 5]
	[newCloud 14]
	[newAPlant 10]
	[local33 4] = [188 164 124 189]
	[local37 4] = [146 137 133 130]
	[local41 12] = [0 319 90 225 159 136 244 0 160 319 57 15]
	[local53 12] = [109 109 116 122 105 131 139 128 145 129 139 119]
	[local65 12] = [1 1 0 2 2 2 0 2 1 2 0 1]
	[local77 9] = [2 3 3 3 2 3 3 3 2]
	[local86 9] = [1 2 5 5 6 5 7 7 4]
	[local95 9] = [21 7 66 -15 -27 -12 22 157 234]
	[local104 9] = [145 145 142 190 182 169 144 170 168]
	[local113 5] = [1590 0 1 2]
	[local118 5] = [1590 2 1 2]
	[local123 4] = [1590 4 1]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 12)
		((= [newCloud temp0] (cloud new:))
			x: [local41 temp0]
			y: [local53 temp0]
			priority: (cond 
				((== temp0 2) 7)
				((== temp0 11) 1)
				(else -1)
			)
			loop: [local65 temp0]
			signal: (|
				$4000
				(if (or (== temp0 11) (== temp0 2)) 16 else 0)
			)
			init:
		)
		(global10 add: [newCloud temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(procedure (localproc_0096 &tmp temp0)
	(= temp0 0)
	(while (< temp0 8)
		([newAPlant temp0]
			view: 600
			loop: [local77 temp0]
			cel: [local86 (= [newAPlant temp0] (aPlant new:))]
			signal: 16384
			x: [local95 temp0]
			y: [local104 temp0]
			init:
		)
		(global10 add: [newAPlant temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(procedure (localproc_00f2 &tmp temp0)
	(= temp0 0)
	(while (< temp0 4)
		((= [newWave temp0] (wave new:))
			x: [local33 temp0]
			y: [local37 temp0]
			setPri: 1
			init:
		)
		(++ temp0)
	)
)

(instance rm590 of Rm
	(properties
		picture 590
		style $0005
		north 610
	)
	
	(method (init)
		(proc958_0 128 0 792 16 585)
		(if (and (== gHeading 600) (== gGEgoEdgeHit 4))
			(self style: 11)
		)
		(proc0_6 15)
		(proc601_11 1)
		(= local0 (proc601_5 1))
		(super init:)
		(proc0_2)
		(gEgo actions: (ScriptID 601 7))
		(localproc_000e)
		(localproc_0096)
		(if (not (proc0_5 0)) (localproc_00f2))
		(proc806_3
			gate
			monastery
			lilTree
			fog
			waters
			roundGround
			sky
		)
		(self
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						0
						0
						319
						0
						319
						165
						294
						165
						271
						173
						177
						173
						150
						177
						143
						171
						131
						166
						98
						154
						98
						150
						134
						149
						156
						145
						137
						142
						111
						142
						106
						146
						0
						148
					yourself:
				)
		)
		(cond 
			(
				(and
					(< (Abs (- (GetTime 1) global129)) 440)
					(!= (- (GetTime 1) global129) 0)
					(!= global129 0)
				)
				(Load rsVIEW 792)
				(gClient setScript: beKilled)
			)
			(global129 (= global129 0))
			(
				(or
					(== gHeading 580)
					(and (== gHeading 600) (== gGEgoEdgeHit 3))
				)
				(gEgo setScript: walkUp)
			)
			((== gHeading 600)
				(gEgo
					posn: 305 (gEgo y?)
					init:
					setMotion: PolyPath 256 182 self
				)
				(proc0_3)
			)
			(else (gEgo posn: 160 185 init:))
		)
	)
	
	(method (doit)
		(++ local1)
		(if
		(and (not (proc0_5 115)) (== (mod local1 5) 0))
			(Palette 6 225 255 -1)
		)
		(cond 
			((gEgo script?))
			((proc999_5 (gEgo edgeHit?) 3 2) (gEgo setScript: walkOut))
			((<= (gEgo x?) 5) (gEgo setMotion: 0 setScript: bumpBog))
			(else (super doit:))
		)
	)
	
	(method (dispose)
		(proc0_7 15)
		(self setScript: 0)
		(super dispose:)
	)
	
	(method (cue)
		(if local0
			(= local0 0)
			(proc851_0 1 @local123 11 0 self)
		)
		(if (and (not (Random 0 10)) (!= gNewGuise 6))
			(self setScript: nessie)
		)
		(proc0_4)
		(super cue:)
	)
	
	(method (notify)
		((ScriptID 601) notify: 1)
	)
)

(instance cloud of PicView
	(properties
		z 15
		view 590
		signal $6000
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 0)
			(cond 
				((lilTree onMe: pEvent) (lilTree handleEvent: pEvent))
				((gate onMe: pEvent) (gate handleEvent: pEvent))
				((sky onMe: pEvent) (sky handleEvent: pEvent))
				((fog onMe: pEvent) (fog handleEvent: pEvent))
				((waters onMe: pEvent) (waters handleEvent: pEvent))
				((roundGround onMe: pEvent) (roundGround handleEvent: pEvent))
			)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance aPlant of PicView
	(properties
		lookStr 5
	)
)

(instance wave of Prop
	(properties
		view 590
		loop 3
		signal $4000
		cycleSpeed 18
	)
	
	(method (init)
		(if (Random 0 1)
			(self setCel: (Random 0 2) setCycle: Fwd)
		else
			(self setCel: (Random 0 2) setCycle: Rev)
		)
		(super init:)
	)
)

(instance elliot of Actor
	(properties
		y 115
		view 590
		loop 5
		priority 8
		signal $0810
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(proc13_4 1590 15)
				(proc13_4 1590 16)
			)
			(3 (proc13_4 1590 17))
			(5 (proc13_4 1590 18))
			(10 (proc13_4 1590 19))
			(4 (proc13_4 1590 20))
		)
	)
)

(instance lilTree of Feature
	(properties
		lookStr 5
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 91 28 80 54 87 56 109 91 118 117 141 107 146 0 148
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance monastery of Feature
	(properties
		lookStr 7
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 114 30 121 25 140 28 202 20 222 25 258 27 278 23 278 75 112 75
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(proc13_4 1590 8 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance waters of Feature
	(properties
		lookStr 9
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				76
				116
				319
				116
				319
				122
				309
				122
				280
				118
				258
				122
				240
				132
				223
				130
				211
				135
				222
				140
				261
				142
				280
				147
				282
				142
				319
				145
				319
				161
				265
				163
				247
				155
				223
				154
				203
				170
				168
				170
				151
				175
				137
				164
				120
				157
				136
				156
				154
				152
				156
				145
				109
				138
				93
				123
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1590 10 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance roundGround of Feature
	(properties
		nsTop 119
		nsBottom 189
		nsRight 319
		lookStr 14
	)
)

(instance fog of Feature
	(properties
		nsTop 70
		nsBottom 125
		nsRight 319
		lookStr 11
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1590 12 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance sky of Feature
	(properties
		nsBottom 69
		nsRight 319
		lookStr 21
	)
)

(instance gate of Feature
	(properties
		nsTop 57
		nsLeft 236
		nsBottom 73
		nsRight 251
		lookStr 13
	)
)

(instance walkUp of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					posn: 250 240
					init:
					setMotion: PolyPath 245 184 self
				)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== (gEgo edgeHit?) 2)
					(gEgo setMotion: PolyPath 335 (gEgo y?) self)
				else
					(gEgo
						setMotion: PolyPath (gEgo x?) (+ (gEgo y?) 50) self
					)
				)
			)
			(1
				(proc0_4)
				(if (== (gEgo edgeHit?) 2)
					(gClient newRoom: 600)
				else
					(gClient newRoom: 580)
				)
			)
		)
	)
)

(instance nessie of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(elliot init: setMotion: MoveTo 40 100 self)
			)
			(1 (= ticks 40))
			(2
				(elliot setMotion: MoveTo 88 100 self)
			)
			(3 (= ticks 120))
			(4
				(elliot setMotion: MoveTo 85 138 self)
			)
			(5
				(proc0_4)
				(elliot dispose:)
				(self dispose:)
			)
		)
	)
)

(instance bumpBog of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1590 6 self)
			)
			(1
				(gEgo
					setMotion: MoveTo (+ (gEgo x?) 15) (gEgo y?) self
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance beKilled of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((= [local2 0] ((ScriptID 601 2) new:))
					view: 16
					loop: 5
					cel: 5
					x: 267
					y: 178
					init:
				)
				((= [local2 1] ((ScriptID 601 2) new:))
					view: 585
					loop: 0
					x: 211
					y: 183
					init:
				)
				(gEgo view: 0 loop: 3 cel: 1 x: 236 y: 188 init:)
				(= ticks 48)
			)
			(1
				(proc851_0 2 @local113 11 0 11 1 self)
			)
			(2
				([local2 1] setCycle: CT 3 1 self)
			)
			(3
				(dieSound play:)
				([local2 1] setCycle: End)
				(gEgo view: 792 loop: 0 cel: 0 setCycle: End self)
			)
			(4
				(proc851_0 2 @local118 11 0 11 1 self)
			)
			(5
				(gRgnMusic2 stop:)
				(dieSound dispose:)
				(proc806_0)
			)
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
