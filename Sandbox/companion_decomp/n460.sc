;;; Sierra Script 1.0 - (do not remove this comment)
(script# 460)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n852)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n995)
(use n998)
(use n999)

(public
	rm460 0
)

(local
	local0
	[local1 9] = [431 0 2 4 23 34 24 25 25]
	[local10 9] = [431 3 2 4 5 39 25 33 25]
	[local19 3] = [-1 13128 32]
	[local22 3] = [-1 13135 32]
	[local25 3] = [-1 13143 32]
	[local28 14] = [1460 0 1 1 2 1 1 1 2 1 1 2 1]
	[local42 6] = [1460 11 1 2 1]
	[local48 6] = [1460 14 1 2 1]
	[local54 6] = [1460 17 1 2 1]
	[local60 7] = [1460 20 1 2 1 1]
	[local67 7] = [1460 24 1 2 1 2]
	[local74 4] = [1460 28 1]
	[local78 4] = [1460 29 1]
	[local82 6] = [1460 30 2 1 1]
	[local88 4] = [1460 33 1]
	[local92 5] = [1460 34 1 1]
	[local97 4] = [1460 36 1]
	[local101 7] = [1460 37 1 2 1 1]
	[local108 4] = [1460 42 1]
	[local112 4] = [1460 43 1]
	[local116 4] = [1460 44 1]
	[local120 4] = [1460 45 1]
	[local124 5] = [1460 47 1 2]
	[local129 4] = [1460 49 1]
	[local133 4] = [1460 50 1]
	[local137 5] = [1460 51 1 1]
	[local142 8] = [1460 53 1 2 1 1 2]
	[local150 8] = [1460 58 1 2 1 2 1]
	[local158 7] = [1460 63 1 2 1 3]
	[local165 12] = [1460 67 1 2 1 2 1 2 1 2 1]
	[local177 13] = [1460 76 1 2 1 1 1 2 1 2 1 1]
	[local190 5] = [1460 113 1 1]
	[local195 4] = [1460 115 1]
	[local199 4] = [1460 116 1]
	[local203 5] = [1460 123 1 1]
	[local208 5] = [1460 125 2 1]
	[local213 4] = [1460 127 1]
	[local217 4] = [1460 129 1]
	[local221 4] = [1460 130 1]
	[local225 5] = [1460 144 2 1]
	[local230 6] = [1460 146 2 1 1]
	[local236 5] = [1460 149 2 1]
	[local241 6] = [1460 151 2 1 1]
	[local247 8] = [1460 154 2 1 1 2 1]
	[local255 6] = [1460 159 2 2 1]
	[local261 8] = [1460 162 2 2 1 1 1]
	[local269 4] = [1460 184 1]
	[local273 4] = [1460 185 1]
	[local277 5] = [1460 186 1 2]
	[local282 7] = [1460 173 1 2 3 1]
	[local289 5] = [1460 136 1 1]
	[local294 4] = [1460 138 1]
	[local298 7] = [1460 169 1 1 2 1]
	[local305 5] = [1460 182 1 1]
	[local310 5] = [1460 177 1 1]
	[local315 4] = [1460 197 1]
	[local319 6] = [1460 199 1 1 1]
	[local325 6] = [1460 202 1 1 1]
	[local331 4] = [1460 122 1]
	[local335 6] = [1460 192 1 2 1]
	[local341 5] = [1460 195 1 2]
	[local346 5] = [1460 190 1 1]
	local351
	local352
	local353
	local354
	[local355 5] = [282 100 279 105 -32768]
	local360 =  12
	local361
	local362
	[local363 8] = [237 112 227 112 224 101 233 100]
)
(procedure (localproc_3146 param1)
	((View new:) view: 435 loop: 5 x: 292 y: 121 init:)
	(param1 register: (ScriptID 452 1))
	((param1 register?)
		view: 435
		loop: 4
		x: 248
		y: 115
		init:
	)
	((View new:) view: 435 loop: 0 x: 222 y: 129 init:)
	((gClient script?) next: param1)
)

(instance rm460 of StdRoom
	(properties
		picture 460
		east 450
		south 450
		west 450
	)
	
	(method (init)
		(proc0_3)
		(if (proc0_5 212) (proc0_6 213))
		(cond 
			((== gHeading 450)
				(self setScript: comeIn)
				(super init: 0 1)
				(if (proc0_5 29) (gNewFeatures add: tunnel))
			)
			((or (== gNewGuise 3) (== gNewGuise 2)) (self setScript: sell) (super init: 1))
			((== gNewGuise 6) (self setScript: deliver) (super init: 1))
			(else (self setScript: tunnelExit) (super init: 1))
		)
		(if (!= gHeading 450)
			(gRgnMusic number: 455 loop: -1 play:)
		)
		(cond 
			((!= gNewGuise 5) 0)
			((proc0_5 125) (localproc_3146 betterLeave))
			((proc0_5 117) (abbot loop: 2 cel: 4) (= local352 2))
			((proc0_5 33) (localproc_3146 mad))
			(
			(and (== ((Inv at: 11) owner?) gEgo) (proc0_5 31)) ((gClient script?) next: drinkingMatch))
			((proc0_5 32) (localproc_3146 frock))
			((proc0_5 30) ((gClient script?) next: warn))
		)
		(fire init: setCycle: Fwd)
		(fireSound play:)
		(tapestry init:)
		(tables init:)
		(walls init:)
		(lChairs init:)
		(rChairs init:)
		(windows init:)
		(abbotsChair init:)
		(arthur init:)
		(if (!= gNewGuise 0)
			(abbot init:)
			(if (not (proc0_5 117)) (abbot setCycle: Fwd))
			(global10 add: chair doit:)
			(chrPoly points: @local363)
			(chair onMeCheck: chrPoly)
			(gNewFeatures add: chair)
			(rMug init:)
			(if (!= gNewGuise 5) (rMug addToPic:))
			(if (== ((Inv at: 11) owner?) global11)
				(caskV init:)
				(if (!= gNewGuise 5) (caskV addToPic:))
			)
			(abbotsChair lookStr: 106)
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 122 122 209 122 150 176 122 180 56 175 40 166
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						225
						118
						251
						118
						251
						126
						256
						118
						271
						119
						314
						129
						278
						186
						180
						182
						160
						175
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 0 319 0 319 99 138 99 111 109 113 121 74 139 39 138 0 156
					yourself:
				)
		)
		(gEgo actions: (ScriptID 452 3))
	)
	
	(method (doit &tmp temp0)
		(if
		(and (not script) (& (gEgo onControl: 1) $4000))
			(gEgo edgeHit: 2)
		)
		(super doit:)
	)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 852)
	)
)

(instance comeIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo x: 320 y: 170 setMotion: MoveTo 299 170 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance tunnelExit of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_6 29)
				(gEgo
					view: (if (!= gNewGuise 0) 28 else 9)
					posn: 183 99
					loop: (if (!= gNewGuise 0) 5 else 0)
					cel: 0
					cycleSpeed: 6
					setCycle: End
				)
				(tunnel init: setCycle: End self)
			)
			(1
				(tapestrySound play:)
				(= cycles 2)
			)
			(2
				(tunnel dispose:)
				(proc0_2 4)
				(= cycles 2)
			)
			(3
				(gNewFeatures addToFront: tunnel)
				(tunnel signal: 16384)
				(if (or (!= gNewGuise 0) (proc0_5 192))
					(= cycles 1)
				else
					(proc13_4 1460 86 self)
					(proc0_6 192)
				)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance leave of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 183 99 self)
			)
			(1
				(gEgo
					view: (if (!= gNewGuise 0) 28 else 9)
					loop: (if (!= gNewGuise 0) 6 else 1)
					cel: 0
					cycleSpeed: 6
					setCycle: End
				)
				(tunnel init: cel: 0 setCycle: End self)
			)
			(2
				(tapestrySound play:)
				(= cycles 2)
			)
			(3
				(gEgo dispose:)
				(tunnel dispose:)
				(= cycles 2)
			)
			(4 (gClient newRoom: 561))
		)
	)
)

(instance abbot of Actor
	(properties
		x 269
		y 132
		z 18
		view 432
		loop 1
		priority 10
		signal $4810
		cycleSpeed 70
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(switch local352
					(0
						(if (proc0_5 30)
							(proc13_4 1460 88)
						else
							(proc13_4 1460 87)
						)
					)
					(1 (proc13_4 1460 89))
					(2 (proc13_4 1460 90))
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(3
				(switch local352
					(0 (self setScript: tapBefore))
					(1
						(proc851_0 @local199 @local1)
					)
					(2
						(if (proc0_5 86)
							(proc13_4 1460 120)
						else
							(gClient setScript: robAbbot)
						)
					)
				)
			)
			(5
				(switch local352
					(0
						(if (proc0_5 30)
							(proc851_0 @local230 @local1 9)
						else
							(self setScript: talkBefore)
						)
					)
					(1
						(cond 
							((> local351 4) (super doVerb: theVerb param2))
							(
								(and
									(or (drinkingMatch seconds?) (drinkingMatch cycles?))
									(not (drinkingMatch script?))
								)
								(drinkingMatch setScript: prodAbbot drinkingMatch)
							)
							(else (proc13_4 1460 205 1))
						)
					)
					(2 (proc13_4 1460 167))
				)
			)
			(4
				(if (== param2 0)
					(switch local352
						(1
							(gMoney doit:)
							(= local360 (+ local360 (gPennies taken?)))
							(= local361 (+ local361 (gHapennies taken?)))
							(= local362 (+ local362 (gFarthings taken?)))
							(return)
						)
						(2
							(proc13_4 1460 168 1)
							(return)
						)
					)
				)
				(if (== local352 2)
					(super doVerb: theVerb param2)
					(return)
				)
				(giveIt register: param2)
				(switch param2
					(0)
					(2)
					(14)
					(11)
					(18)
					(13
						(if (gClient script?)
							(super doVerb: theVerb param2)
							(return)
						)
					)
					(else 
						(super doVerb: theVerb param2)
						(return)
					)
				)
				(if (== local352 1) (giveIt cue:) (return))
				(gEgo setMotion: PolyPath 251 126 giveIt)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance giveIt of Script
	(properties)
	
	(method (cue)
		(switch register
			(0
				(gMoney doit:)
				(= local360 (+ local360 (gPennies taken?)))
				(= local361 (+ local361 (gHapennies taken?)))
				(= local362 (+ local362 (gFarthings taken?)))
				(proc851_0 @local346 @local1)
				(return)
			)
			(2
				(proc806_1 -200)
				(proc851_0 @local298 @local1 999)
				(gEgo put: 2 global11)
			)
			(14
				(proc806_1 -25)
				(proc851_0 @local305 @local1)
				(gEgo put: 14 global11)
			)
			(11
				(proc851_0 @local310 @local1)
			)
			(13
				(gClient setScript: giveRobes)
			)
			(18
				(gClient setScript: waterDeath 0 @local315)
			)
		)
	)
)

(instance waterDeath of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 register @local1 0 self)
			)
			(1
				(= global145 (if (== register @local315) 18 else 17))
				(gClient newRoom: 170)
			)
		)
	)
)

(instance giveRobes of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== global115 1)
					(gClient setScript: waterDeath 0 @local325)
					(return)
				)
				(proc851_0 @local335 @local1 9 self)
			)
			(1
				(gEgo setMotion: PolyPath 243 114 self)
				((= register ((ScriptID 452 1) new:))
					init:
					setCycle: Walk
					posn: 316 106
					setMotion: MoveTo 289 105 self
				)
			)
			(2)
			(3 (proc0_9 gEgo abbot self))
			(4
				(proc851_0 @local341 @local1 10)
				(register setMotion: MoveTo 256 122 self)
			)
			(5
				(register loop: 2)
				(abbot loop: 3 cel: 0 cycleSpeed: 12 setCycle: End self)
			)
			(6
				(gEgo put: 13 456)
				(register setMotion: MoveTo 316 120 goAway)
				(goAway register: register)
				(abbot setCycle: Beg self)
			)
			(7
				(abbot loop: 1 cycleSpeed: 70 setCycle: Fwd)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance caskV of View
	(properties
		x 252
		y 131
		z 7
		view 28
		loop 10
		cel 1
		priority 11
		signal $4111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(cond 
					((not (proc0_5 30)) (proc13_4 1460 100))
					((== local352 0) (proc13_4 1460 101))
					(else (proc13_4 1460 102))
				)
			)
			(3
				(switch local352
					(0
						(if (proc0_5 30)
							(gClient setScript: grabCask)
						else
							(gClient setScript: tryToGrabCask)
						)
					)
					(1
						(if local354
							(drinkingMatch seconds: 0 cue:)
						else
							(super doVerb: theVerb param2 &rest)
						)
					)
					(2
						(gClient setScript: grabCask)
					)
				)
			)
			(4
				(if (== param2 14)
					(proc13_4 1460 189 1)
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

(instance chair of PicView
	(properties
		x 235
		y 131
		lookStr 105
		view 460
		loop 2
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (not local353)
					(gClient setScript: tryToSit)
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

(instance chrPoly of Polygon
	(properties
		size 4
	)
)

(instance aMug of View
	(properties
		view 28
	)
)

(instance rMug of View
	(properties
		x 244
		y 132
		z 16
		view 28
		loop 10
		priority 10
		signal $4111
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(switch local352
					(0 (proc13_4 1460 95))
					(1 (proc13_4 1460 96))
					(2
						(if local353
							(gClient setScript: lInRMug)
						else
							(proc13_4 1460 99)
						)
					)
				)
			)
			(3
				(switch local352
					(0
						(if (proc0_5 30)
							(proc851_0 @local294 @local1)
						else
							(gClient setScript: mugBefore)
						)
					)
					(1
						(if local354
							(drinkingMatch seconds: 0 cue:)
						else
							(super doVerb: theVerb param2 &rest)
						)
					)
					(2 (proc13_4 1460 139))
				)
			)
			(4
				(if (== param2 14)
					(if (== local352 1)
						(gEgo put: 14 rMug)
						(drinkingMatch setScript: dropInDrink drinkingMatch)
						(proc806_1 50)
					else
						(proc13_4 1460 188 1)
					)
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

(instance tunnel of Prop
	(properties
		x 182
		y 98
		nsTop 44
		nsLeft 167
		nsBottom 99
		nsRight 198
		view 460
		loop 1
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(if (and (== theVerb 3) (!= local352 1))
			(gClient setScript: leave)
		else
			(tapestry doVerb: theVerb param2)
		)
	)
)

(instance fire of Prop
	(properties
		x 75
		y 120
		lookStr 109
		view 460
		signal $4000
	)
)

(instance tapestry of Feature
	(properties
		nsTop 10
		nsLeft 173
		nsBottom 98
		nsRight 302
		lookStr 107
	)
	
	(method (doVerb theVerb param2)
		(if (or (!= theVerb 3) (gClient script?))
			(super doVerb: theVerb param2)
		else
			(gClient setScript: feelTap)
		)
	)
)

(instance feelTap of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 224 101 self)
			)
			(1
				(proc0_2 7)
				(proc13_4 1460 121 self)
				(if
					(or
						(not (proc0_5 30))
						(== local352 2)
						(not (gNewCast contains: abbot))
					)
					(++ state)
				)
			)
			(2
				(proc851_0 @local331 @local1 0 self)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance tables of Feature
	(properties
		onMeCheck $0002
		lookStr 104
	)
)

(instance walls of Feature
	(properties
		onMeCheck $0001
		lookStr 103
	)
)

(instance lChairs of Feature
	(properties
		y 126
		onMeCheck $0004
		lookStr 105
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(cond 
					((!= local352 0) (proc13_4 1460 141 1))
					((== gNewGuise 0) (proc13_4 1460 142 1))
					(else (proc13_4 1460 140 1))
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance rChairs of Feature
	(properties
		y 172
		onMeCheck $0040
	)
	
	(method (doVerb theVerb param2)
		(lChairs doVerb: theVerb param2)
	)
)

(instance windows of Feature
	(properties
		onMeCheck $0008
		lookStr 108
	)
)

(instance abbotsChair of Feature
	(properties
		onMeCheck $0010
		lookStr 143
	)
)

(instance arthur of Feature
	(properties
		y 99
		onMeCheck $0020
	)
	
	(method (doVerb theVerb param2)
		(if
			(and
				(== theVerb 4)
				(== param2 2)
				(not (gClient script?))
			)
			(proc851_0 3 @local282 @local19 0 @local22 3 @local25 2)
		else
			(tapestry doVerb: theVerb param2)
		)
	)
)

(instance tryToSit of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 251 126 self)
			)
			(1
				(gEgo
					view: 28
					cycleSpeed: 10
					loop: 9
					cel: 0
					setPri: 9
					setCycle: End self
				)
			)
			(2
				(if (== local352 2)
					(= local353 1)
					(gEgo
						setLoop: 0
						cel: 1
						setPri: 10
						posn: 243 113
						setScript: waitToStand
					)
					(rMug dispose:)
					(= cycles 2)
					(return)
				)
				(if (== global115 1)
					(self setScript: waterDeath 0 @local319)
					(return)
				)
				(proc851_0
					(if (proc0_5 30) @local213 else @local203)
					@local1
					0
					self
				)
			)
			(3
				(if (== local352 2)
					(rMug signal: 16657)
					(gNewFeatures add: rMug)
					(self dispose:)
					(proc0_4)
					(return)
				)
				(gEgo setCycle: Beg self)
				(if (proc0_5 30) (= state (+ state 2)))
			)
			(4
				(proc851_0 @local208 @local1 9 self 0)
			)
			(5
				(proc851_0 @local28 @local1 9 self)
				(proc0_6 30)
			)
			(6
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance tapBefore of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 245 131 self)
			)
			(1
				(if (== global115 1)
					(self setScript: waterDeath 0 @local319)
					(return)
				)
				(if (proc0_5 30)
					(proc851_0 @local195 @local1 0 self)
					(++ state)
				else
					(proc851_0 @local190 @local1 9 self 0)
				)
			)
			(2
				(proc851_0 @local28 @local1 9 self)
				(proc0_6 30)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance mugBefore of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 245 131 self)
			)
			(1
				(if (== global115 1)
					(self setScript: waterDeath 0 @local319)
					(return)
				)
				(proc851_0 @local289 @local1 9 self 0)
			)
			(2
				(proc851_0 @local28 @local1 9 self)
			)
			(3
				(proc0_4)
				(proc0_6 30)
				(self dispose:)
			)
		)
	)
)

(instance talkBefore of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 @local225 @local1 9 self 0)
			)
			(1
				(proc851_0 @local28 @local1 9)
				(proc0_6 30)
				(self dispose:)
			)
		)
	)
)

(instance tryToGrabCask of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 245 131 self)
			)
			(1
				(if (== global115 1)
					(self setScript: waterDeath 0 @local319)
					(return)
				)
				(proc851_0 @local217 @local1 0 self)
			)
			(2
				(abbot setCycle: 0 loop: 0 cel: 4)
				(= seconds 3)
			)
			(3
				(abbot setCel: 3)
				(= cycles 1)
			)
			(4
				(proc851_0 @local221 @local1 9 self 0)
			)
			(5
				(proc851_0 @local28 @local1 9 self)
			)
			(6
				(abbot loop: 1 setCycle: Fwd)
				(proc0_6 30)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance grabCask of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 245 131 self)
			)
			(1
				(if (== global115 1)
					(self setScript: waterDeath 0 @local319)
					(return)
				)
				(gEgo view: 28 setLoop: 8)
				(gEgo
					cel: (gEgo lastCel:)
					cycleSpeed: 10
					setCycle: Beg self
				)
				(caskV dispose:)
			)
			(2
				(gEgo cycleSpeed: (gEgo moveSpeed?) get: 11)
				(if (== local352 2)
					(proc13_4 1460 131 self)
				else
					(proc806_1 25)
					(= cycles 1)
				)
				(proc0_2)
				((gEgo looper?) doit:)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance drinkingMatch of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 3))
			(1
				(proc851_0 @local67 @local1 9 self)
			)
			(2
				(gEgo setMotion: PolyPath 251 126 self)
			)
			(3
				(gEgo
					view: 28
					setLoop: 8
					cel: 0
					cycleSpeed: 10
					setCycle: End self
				)
			)
			(4
				(caskV init:)
				(gEgo put: 11 global11 cel: 0)
				(= cycles 1)
			)
			(5
				(if (== global115 1)
					(gClient setScript: waterDeath 0 @local325)
					(return)
				)
				(proc851_0 @local74 @local1 9 self 0)
			)
			(6
				(= notKilled 1)
				(proc851_0 @local78 @local1 9 self 0)
			)
			(7
				(if (proc851_1)
					(proc851_0 @local97 @local1 9 self)
				else
					(proc851_0 @local82 @local1 9)
					(proc0_2)
					(gEgo
						cycleSpeed: (gEgo moveSpeed?)
						setMotion: PolyPath 150 200 self
					)
					(proc0_6 33)
					(self dispose:)
				)
			)
			(8
				(= local353 1)
				(gEgo loop: 9 cel: 0 setPri: 9 setCycle: End)
				(= ticks 20)
			)
			(9
				(gEgoHead view: 28)
				((= register ((ScriptID 452 1) new:))
					init:
					setCycle: Walk
					posn: 316 106
					setMotion: MoveTo 289 105 self
				)
			)
			(10
				(proc851_0 @local101 @local1 10)
				(register setMotion: MoveTo 256 122 self)
			)
			(11
				(abbot cycleSpeed: 12 loop: 3 cel: 0 setCycle: End self)
			)
			(12
				((global9 at: 12) moveTo: 470)
				(register setMotion: MoveTo 316 120 goAway)
				(goAway register: register)
				(abbot setCycle: Beg self)
			)
			(13
				(= notKilled 1)
				(proc851_0 @local108 @local1)
				(= register 0)
				(gEgo posn: 243 113 setLoop: 0 setCel: 1 setPri: 10)
				(rMug dispose:)
				(= cycles 2)
			)
			(14
				(gNewFeatures add: rMug)
				(= local352 1)
				(proc0_4)
				(gIconBar disable: 0)
				(gIconBar disable: 5)
				(= cycles 1)
			)
			(15
				(proc0_4)
				(gIconBar disable: 0)
				(gIconBar disable: 5)
				(abbot loop: 0 cel: 4)
				(= seconds 2)
			)
			(16
				(abbot cel: 3)
				(= ticks 12)
			)
			(17
				(if script (-- state) (return))
				(rMug signal: 8)
				(gEgo setCel: 0)
				(= ticks 60)
			)
			(18
				(if
				(and (== register 4) (!= ((Inv at: 14) owner?) rMug))
					(gClient setScript: rPassOut)
				else
					(gEgo cycleSpeed: 10 setCycle: End self)
					(abbot setCycle: Beg)
					(++ register)
				)
			)
			(19
				(gEgo setCycle: CT 1 -1 self)
				(abbot setCycle: CT 3 1)
			)
			(20
				(mugSound play:)
				(rMug signal: 26897)
				(= local354 1)
				(= seconds 5)
			)
			(21
				(if script (-- state) (return))
				(= local354 0)
				(proc0_3)
				(if gTheNewDialog (gTheNewDialog dispose:))
				(if (== register 6)
					(gClient setScript: aPassOut)
				else
					(proc851_0 @local112 @local1)
					(= state (- state 7))
					(= cycles 1)
				)
			)
		)
	)
)

(instance goAway of Script
	(properties)
	
	(method (cue)
		(register dispose:)
	)
)

(instance dropInDrink of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 1 @local269 9 3 self)
			)
			(1 (= cycles 1))
			(2 (= ticks 30))
			(3
				(abbot cycleSpeed: 6 loop: 6 cel: 0 setCycle: End self)
			)
			(4
				(gEgo
					cycleSpeed: 15
					setLoop: 7
					setCel: 0
					setCycle: CT 0 1 self
				)
			)
			(5
				(plopSound play:)
				(= ticks 45)
			)
			(6
				(proc851_0 @local273 @local1 0 self)
			)
			(7 (abbot setCycle: Beg self))
			(8 (= ticks 30))
			(9
				(proc851_0 @local277 @local1 9 self)
				(gEgo setLoop: 0 setCel: 1)
				(abbot loop: 0 cel: 3 cycleSpeed: 11)
			)
			(10 (= seconds 2))
			(11
				(if (or (client seconds?) (client cycles?))
					(= caller 0)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance aPassOut of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_7 31)
				(proc0_6 117)
				(= local352 2)
				(proc0_3)
				(proc851_0 @local129 9 0 self)
			)
			(1
				(= lastTicks (+ global86 (GetTime)))
				(= ticks 20)
			)
			(2
				(abbot setLoop: 2 setCel: 0 setCycle: End self)
			)
			(3
				(mugSound play:)
				(abbot setScript: snoreScript)
				(= ticks 20)
				(= notKilled 1)
			)
			(4
				(proc851_0 1 @local133 @local10 3 self)
			)
			(5
				(proc851_0 @local137 9)
				(proc0_4)
				(gEgo setScript: waitToStand)
				(self dispose:)
			)
		)
	)
)

(instance waitToStand of Script
	(properties)
	
	(method (doit)
		(if (gEgo mover?) (self cue:))
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(= local353 0)
				(proc0_3)
				(= register (gEgo mover?))
				(gEgo mover: 0 setPri: -1 posn: 248 128 setLoop: 9)
				(gEgo
					cel: (gEgo lastCel:)
					cycleSpeed: 10
					setCycle: Beg self
				)
				(gNewFeatures delete: rMug)
				(rMug init:)
			)
			(2
				(gEgo
					cycleSpeed: (gEgo moveSpeed?)
					setMotion: MoveTo 251 126 self
				)
			)
			(3
				(proc0_2 2)
				(if (and register (register isMemberOf: PolyPath))
					(gEgo
						mover: register
						setMotion:
							PolyPath
							(register finalX?)
							(register finalY?)
							(register caller?)
					)
				else
					(gEgo
						mover: register
						setMotion: PolyPath (register x?) (register y?) (register caller?)
					)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance rPassOut of Script
	(properties)
	
	(method (doit)
		(if (and (not local0) (== (gEgo cel?) 3))
			(mugSound play:)
			(= local0 1)
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local116 9 0 self)
			)
			(1
				(gEgo cycleSpeed: 10 loop: 2 cel: 0 setCycle: End)
				((= register ((ScriptID 452 1) new:))
					init:
					setCycle: Walk
					posn: 316 106
					setMotion: MoveTo 289 105 self
				)
			)
			(2
				(proc851_0 @local120 @local1)
				(register setMotion: MoveTo 255 130 self)
				(abbot setCycle: Beg self)
			)
			(3 (abbot setCycle: CT 3 1))
			(4
				(register
					view: 28
					setLoop: 4
					cycleSpeed: 1
					setCycle: End self
				)
				(gEgo loop: 3 cel: 0 setCycle: End self)
			)
			(5)
			(6
				(proc851_0 @local124 10 @local1 self)
			)
			(7
				(= global145 16)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance prodAbbot of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch local351
					(0
						(proc851_0 @local236 @local1 9 self)
					)
					(1
						(proc851_0 @local241 @local1 9 self)
					)
					(2
						(proc851_0 @local247 @local1 9 self)
					)
					(3
						(proc851_0 @local255 @local1 9 self)
					)
					(4
						(proc851_0 @local261 @local1 9 self)
						(proc806_1 25)
					)
				)
				(++ local351)
			)
			(1 (= seconds 2))
			(2
				(if (or (client seconds?) (client cycles?))
					(= caller 0)
				)
				(self dispose:)
			)
		)
	)
)

(instance robAbbot of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1460 117 self)
			)
			(1
				(if local353 (= state (+ state 2)))
				(if
				(and (== local360 12) (not local361) (not local362))
					(= cycles 1)
				)
				(if (== ((Inv at: 2) owner?) global11)
					(gEgo get: 2)
					(= cycles 0)
				)
				(if (not cycles) (proc13_4 1460 118 self))
			)
			(2
				(gEgo setMotion: PolyPath 251 126 self)
			)
			(3
				(gEgo
					view: 28
					cycleSpeed: 10
					loop: 9
					cel: 0
					setPri: 9
					setCycle: End self
				)
			)
			(4
				(gEgo posn: 243 113 setPri: 10 setLoop: 1 setCel: 0)
				(rMug dispose:)
				(= cycles 2)
			)
			(5
				(gEgo setCycle: CT 0 1 self)
				(rMug signal: 16657)
				(gNewFeatures add: rMug)
			)
			(6
				(proc806_1 10 86)
				(gPennies put: local360)
				(gHapennies put: local361)
				(gFarthings put: local362)
				(proc13_4 1460 119 self)
			)
			(7
				(if (not local353)
					(= local353 1)
					(gEgo setScript: waitToStand)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance lInRMug of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo loop: 0 cel: 2)
				(= ticks 30)
			)
			(1 (proc13_4 1460 97 self))
			(2 (proc13_4 1460 98 self))
			(3
				(gEgo cel: 1)
				(self dispose:)
			)
		)
	)
)

(instance sell of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_2 0)
				((= register (ScriptID 452 1))
					ignoreActors: 1
					init:
					setCycle: Walk
					posn: 316 106
					setMotion: PPath @local355 self
				)
				(gEgo posn: 326 106 setMotion: MoveTo 289 131 self)
			)
			(1)
			(2
				(if (== global115 1)
					(gClient setScript: waterDeath 0 @local319)
					(return)
				)
				(if (== gNewGuise 3)
					(proc851_0 @local177 @local1 5 self)
				else
					(proc851_0 @local177 @local1 4 self)
				)
			)
			(3
				(register setMotion: MoveTo 326 106 self)
				(gEgo setMotion: MoveTo 316 106)
			)
			(4 (gClient newRoom: 440))
		)
	)
)

(instance deliver of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_2 0)
				((= register (ScriptID 452 1))
					ignoreActors: 1
					init:
					setCycle: Walk
					posn: 316 106
					setMotion: PPath @local355 self
				)
				(gEgo x: 326 y: 106 setMotion: MoveTo 289 131 self)
			)
			(1)
			(2
				(if (== global115 1)
					(gClient setScript: waterDeath 0 @local319)
					(return)
				)
				(proc851_0 @local165 @local1 8 self)
			)
			(3
				(register setMotion: MoveTo 326 106 self)
				(gEgo setMotion: MoveTo 316 106)
			)
			(4 (gClient newRoom: 440))
		)
	)
)

(instance frock of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== ((Inv at: 11) owner?) gEgo)
					(proc851_0 @local54 @local1 10 self)
				else
					(proc851_0 @local60 @local1 999 self)
				)
			)
			(1
				(register setMotion: PolyPath (gEgo x?) (gEgo y?))
				(= seconds 2)
			)
			(2
				(= global145 15)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance warn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 32)
				(if (== ((Inv at: 11) owner?) gEgo)
					(proc851_0 @local48 @local1 999 self)
				else
					(proc851_0 @local42 @local1 999 self)
					(++ state)
				)
			)
			(1
				(gEgo setMotion: PolyPath 321 190 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance betterLeave of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 169 102 self)
			)
			(1
				(proc0_9 gEgo abbot self)
				(if (proc0_5 114) (= state (+ state 2)))
			)
			(2
				(if
					(or
						(== ((Inv at: 12) owner?) gEgo)
						(== ((Inv at: 10) owner?) gEgo)
					)
					(proc851_0 @local142 @local1 10 self)
				else
					(proc851_0 @local150 @local1 10 self)
				)
			)
			(3
				(proc0_4)
				(gIconBar disable: 5)
				(tunnel actions: escape)
				(= seconds 4)
			)
			(4
				(proc0_3)
				(proc0_9 register gEgo)
				(= cycles 1)
			)
			(5
				(proc851_0 3 @local158 10 1 999 0 @local1 3 self)
			)
			(6
				(register setMotion: PolyPath (gEgo x?) (gEgo y?))
				(= seconds 2)
			)
			(7
				(= global145 17)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance escape of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc0_6 114)
			(betterLeave dispose:)
		)
		(return 0)
	)
)

(instance mad of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0
					(if (proc0_5 112)
						@local92
					else
						(= state (+ state 2))
						@local88
					)
					@local1
					0
					self
				)
			)
			(1
				(register setMotion: PolyPath (gEgo x?) (gEgo y?))
				(= seconds 2)
			)
			(2
				(= global145 15)
				(gClient newRoom: 170)
			)
			(3
				(gEgo setMotion: MoveTo 321 190 self)
			)
			(4
				(proc0_6 112)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance snoreScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds (Random 3 10)))
			(1
				(snoreSound play:)
				(= state -1)
				(= cycles 1)
			)
		)
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)

(instance mugSound of Sound
	(properties
		flags $0001
		number 457
	)
)

(instance tapestrySound of Sound
	(properties
		flags $0001
		number 458
	)
)

(instance snoreSound of Sound
	(properties
		flags $0001
		number 535
	)
)

(instance plopSound of Sound
	(properties
		flags $0001
		number 22
	)
)
