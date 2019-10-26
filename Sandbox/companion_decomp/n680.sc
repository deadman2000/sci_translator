;;; Sierra Script 1.0 - (do not remove this comment)
(script# 680)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n806)
(use n851)
(use n946)
(use n950)
(use n958)
(use n969)
(use n989)
(use n991)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm680 0
)

(local
	[newWave 2]
	[local2 2] = [206 49]
	[local4 2] = [144 117]
	[local6 2] = [6 7]
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	local16
	[local17 4] = [1680 0 1]
	[local21 5] = [1680 24 1 2]
	[local26 4] = [1680 27 1]
	[local30 4] = [1680 28 1]
	[local34 4] = [1680 29 1]
	[local38 4] = [1680 31 1]
	[local42 4] = [1680 32 1]
	[local46 5] = [1680 34 1 2]
	[local51 4] = [1680 38 1]
	[local55 4] = [1680 39 1]
	[local59 4] = [1680 41 1]
	[local63 4] = [1680 42 1]
	[local67 4] = [1680 43 1]
	[local71 6] = [1680 44 2 1 2]
	[local77 4] = [1680 47 2]
	[local81 4] = [1680 49 2]
	[local85 4] = [1680 30 1]
	local89
)
(procedure (localproc_000e)
	(cogito setCycle: Fwd)
	(proc13_6 32)
	(proc13_4 &rest 80 {Cogito} 67 160 142)
)

(procedure (localproc_0038)
	(cogito setCycle: Beg)
	(proc13_6 0)
)

(procedure (localproc_004b)
	(vocalis setCycle: Fwd)
	(proc13_6 32)
	(proc13_4 &rest 80 {Vocalis} 67 160 142)
)

(procedure (localproc_0075)
	(vocalis setCycle: Beg)
	(proc13_6 0)
)

(procedure (localproc_0088)
	(hilaris setCycle: Fwd)
	(proc13_6 32)
	(proc13_4 &rest 80 {Hilaris} 67 160 142)
)

(procedure (localproc_00b2)
	(hilaris setCycle: Beg)
	(proc13_6 0)
)

(procedure (localproc_00c5 &tmp temp0)
	(= temp0 0)
	(while (< temp0 2)
		((= [newWave temp0] (wave new:))
			x: [local2 temp0]
			y: [local4 temp0]
			loop: [local6 temp0]
			init:
		)
		(++ temp0)
	)
)

(instance rm680 of Rm
	(properties
		picture 680
		north 690
		east 630
		south 630
	)
	
	(method (init)
		(proc958_0 130 939 991)
		(proc958_0 128 22 620 15 19 20 585 674)
		(if (not (proc0_5 0)) (localproc_00c5))
		(super init:)
		(gKH addToFront: self)
		(gMH addToFront: self)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						207
						189
						207
						186
						276
						171
						319
						179
						319
						183
						282
						176
						273
						180
						267
						177
						216
						189
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						12
						31
						319
						55
						318
						147
						276
						146
						228
						153
						166
						127
						121
						135
						84
						123
						73
						133
						68
						139
						47
						152
						14
						155
						106
						189
						0
						179
					yourself:
				)
		)
		(gSFX number: 581 loop: -1 play:)
		(gRgnMusic number: 24 loop: -1 play:)
		(cogito init:)
		(ineptus init:)
		(vocalis init:)
		(hilaris init:)
		(waterGate init:)
		(proc806_3
			malitia
			ieiunus
			deformis
			mooringPost
			water
			everything
		)
		(if (== (Monastery firstTimeEnter?) 0)
			(Monastery firstTimeEnter: 1)
			(fulk init:)
			(theBoat init:)
			(thePole init:)
			(proc0_2)
			(gEgo posn: 95 182 loop: 3 cel: 0 init:)
			(gEgo setScript: stepInBoat)
		else
			(fulk
				view: 674
				setLoop: 5
				setCel: 0
				setPri: 10
				signal: 16
				x: 154
				y: 173
				init:
			)
			(theBoat
				view: 21
				setLoop: 1
				setCel: 1
				setPri: 6
				signal: 16
				posn: 177 157
				init:
			)
			(proc0_2)
			(gEgo
				posn: 95 182
				setPri: 10
				signal: 16
				loop: 3
				cel: 0
				init:
			)
			(thePole posn: 120 161 setPri: 8 init:)
			(gEgo setScript: (ScriptID 681 0))
		)
		(gIconBar disable: 5)
	)
	
	(method (doit)
		(++ local9)
		(if
			(and
				(> (global1 detailLevel:) 2)
				(== (mod local9 5) 0)
			)
			(Palette 6 225 255 -1)
		)
		(cond 
			(
				(and
					(not local89)
					(or
						(and (Monastery waterDie?) (not local12))
						(and (== global115 2) (not local12))
					)
				)
				(= local89 1)
				local16
				(theBoat setMotion: 0)
				(gEgo setMotion: 0)
				(Monastery waterDie: 0)
				(gEgo setScript: monkKillBoat)
			)
			(
				(and
					(not local89)
					(or (Monastery waterDie?) (== global115 2))
				)
				(= local89 1)
				local16
				(theBoat setMotion: 0)
				(gEgo setMotion: 0)
				(Monastery waterDie: 0)
				(gEgo setScript: timesUp)
			)
			((gEgo script?) 0)
			(local12
				(cond 
					((& (gEgo onControl: 1) $0004) (gEgo setScript: moveAway))
					((& (gEgo onControl: 1) $0010) (gEgo setScript: egoDock))
				)
			)
			(
			(and (& (gEgo onControl: 1) $0002) (not local12)) (gEgo setScript: egoGetsInBoat))
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(gKH delete: self)
		(gDH delete: self)
		(gMH delete: self)
		(DisposeScript 991)
		(DisposeScript 939)
		(super dispose:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				local12
				(== global19 2)
				(or
					(and
						(== (pEvent type?) evMOUSEBUTTON)
						(not (& (pEvent modifiers?) emSHIFT))
						(not (& (pEvent modifiers?) emCTRL))
					)
					(and
						(== (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
			)
			(cond 
				((and (ineptus onMe: pEvent) (== local10 2))
					(pEvent claimed: 1)
					(= local10 3)
					(gEgo setScript: raiseTheGrate)
				)
				((and (ieiunus onMe: pEvent) (== local10 1))
					(pEvent claimed: 1)
					(= local10 2)
					(gClient setScript: (ScriptID 681 1))
				)
				((and (cogito onMe: pEvent) (== local10 0))
					(pEvent claimed: 1)
					(= local10 1)
					(gClient setScript: (ScriptID 681 3))
				)
				(else
					(= local10 0)
					(if local12
						(cond 
							((ineptus onMe: pEvent)
								(pEvent claimed: 1)
								(gClient setScript: (ScriptID 681 2))
							)
							((ieiunus onMe: pEvent)
								(pEvent claimed: 1)
								(gClient setScript: (ScriptID 681 1))
							)
						)
					else
						0
					)
				)
			)
			(super handleEvent: pEvent)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance water of Feature
	(properties
		x 52
		y 110
		lookStr 20
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				52
				115
				67
				110
				114
				126
				139
				126
				164
				118
				201
				124
				197
				131
				238
				140
				271
				135
				319
				144
				319
				179
				274
				171
				209
				189
				181
				189
				126
				172
				99
				170
				72
				162
				58
				161
				58
				156
				33
				149
				59
				134
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance everything of Feature
	(properties
		x 160
		nsBottom 189
		nsRight 319
		sightAngle 180
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1680 21 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance mooringPost of Feature
	(properties
		x 262
		y 184
		lookStr 22
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 262 178 274 173 270 168 276 164 280 167 277 171 290 176 273 184
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance malitia of Feature
	(properties
		x 20
		y 112
		approachX 87
		approachY 126
		lookStr 10
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 20 82 42 80 54 91 54 99 43 111 24 112 14 104 13 91
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(gClient setScript: (ScriptID 681 4))
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(switch local11
					(0
						(proc13_6 32)
						(proc13_4 1680 11 80 {Malitia} 67 160 142)
						1
						(proc13_6 0)
					)
					(1
						(proc13_6 32)
						(proc13_4 1680 13 80 {Malitia} 67 160 142)
						1
						(proc13_6 0)
					)
					(2
						(proc13_6 32)
						(proc13_4 1680 14 80 {Malitia} 67 160 142)
						1
						(proc13_6 0)
					)
				)
				(if (> (++ local11) 2) (= local11 0))
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance ieiunus of Feature
	(properties
		x 106
		y 79
		approachX 126
		approachY 131
		lookStr 16
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 106 33 109 45 118 44 137 68 115 71 110 77 106 79 95 71 90 59 93 46
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(gClient setScript: (ScriptID 681 1))
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(proc13_6 32)
				(proc13_4 1680 17 80 {Ieiunus} 67 160 142)
				1
				(proc13_6 0)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance deformis of Feature
	(properties
		x 111
		y 127
		approachX 126
		approachY 131
		lookStr 18
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 111 100 139 100 149 117 141 125 117 127 108 115
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(gClient setScript: (ScriptID 681 7))
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(proc13_6 32)
				(proc13_4 1680 19 80 {Deformis} 67 160 142)
				1
				(proc13_6 0)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance cogito of Prop
	(properties
		x 36
		y 145
		approachX 69
		approachY 134
		lookStr 1
		view 681
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(proc13_4 1680 52 1)
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(gEgo setScript: cogitoTalks)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance ineptus of Prop
	(properties
		x 46
		y 78
		approachX 69
		approachY 134
		lookStr 4
		view 681
		loop 1
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(gEgo setScript: viciouslyPullTongue)
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(proc13_6 32)
				(proc13_4 1680 5 80 {Ineptus} 67 160 142)
				1
				(proc13_6 0)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance vocalis of Prop
	(properties
		x 80
		y 65
		approachX 87
		approachY 126
		lookStr 6
		view 681
		loop 2
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(gClient setScript: (ScriptID 681 5))
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(gEgo setScript: vocalisTalks)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance hilaris of Prop
	(properties
		x 125
		y 95
		approachX 126
		approachY 131
		lookStr 8
		view 681
		loop 3
		priority 6
		signal $4011
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(if local12
					(gClient setScript: (ScriptID 681 6))
				else
					(proc13_4 1680 57 1)
				)
			)
			(5
				(gEgo setScript: hilarisTalks)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance waterGate of Prop
	(properties
		x 72
		y 65
		view 681
		loop 5
		signal $4001
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== local14 0)
					(= local14 1)
					(gEgo setScript: askTheDwarf)
				else
					(proc13_4 1680 36 1)
				)
			)
			(3 (proc13_4 1680 37 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance wave of Prop
	(properties
		view 681
		priority 1
		signal $4010
		cycleSpeed 18
		detailLevel 2
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

(instance theBoat of Actor
	(properties
		x 231
		y 177
		lookStr 23
		view 21
		loop 1
		cel 1
		priority 4
		signal $4011
	)
	
	(method (doit)
		(if (and local12 (not (gEgo script?)))
			(if (gEgo mover?)
				(self posn: (+ (gEgo x?) 68) (- (gEgo y?) 10))
			)
		else
			(super doit:)
		)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(if local12
				(super doVerb: theVerb &rest)
			else
				(gEgo setScript: egoGetsInBoat)
			)
		else
			(super doVerb: theVerb)
		)
	)
)

(instance fulk of Actor
	(properties
		x 277
		y 189
		view 671
		loop 1
		cel 1
		signal $4000
	)
	
	(method (doit)
		(if (and local12 (not (gEgo script?)))
			(if (gEgo mover?)
				(self posn: (+ (gEgo x?) 45) (+ (gEgo y?) 6))
			)
		else
			(super doit:)
		)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (gEgo setScript: lookAtFulk))
			(3
				(proc851_0 @local26 (Monastery tFULK?) 0 self)
			)
			(5
				(proc851_0 @local30 (Monastery tFULK?) 0 self)
			)
			(4
				(switch param2
					(0
						(if (> (gMoney doit:) 0)
							(gEgo setScript: giveFulkMoney)
						)
					)
					(2
						(proc851_0 @local85 (Monastery tFULK?) 0 self)
					)
					(14
						(proc851_0 @local38 (Monastery tFULK?) 0 self)
						(gEgo put: 14)
					)
					(17
						(proc851_0 @local42 (Monastery tFULK?) 0 self)
					)
				)
			)
		)
	)
)

(instance killMonk of Actor
	(properties
		x 124
		y 225
		view 128
		loop 3
		signal $4000
	)
)

(instance theRock of Actor
	(properties
		x 85
		y 9
		view 620
		loop 3
		priority 10
		signal $4810
		illegalBits $0000
	)
)

(instance thePole of Actor
	(properties
		x 175
		y 181
		view 19
		loop 5
		priority 5
		signal $4000
		illegalBits $0000
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3) (gEgo setScript: egoGetsInBoat))
	)
)

(instance thePrior of Actor
	(properties
		x 119
		y 225
		view 641
		loop 4
		signal $4000
	)
)

(instance viciouslyPullTongue of Script
	(properties)
	
	(method (init)
		(gEgo setPri: (+ (theBoat priority?) 4) signal: 2064)
		(fulk setPri: (+ (theBoat priority?) 4) signal: 16)
	)
	
	(method (doit)
		(gEgo
			x: (- (theBoat x?) 68)
			y: (+ (theBoat y?) 10)
			cel: 0
		)
		(fulk x: (- (theBoat x?) 23) y: (+ (theBoat y?) 16))
		(theBoat setLoop: 1 setCel: 1)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
				(and (== (theBoat x?) 126) (== (theBoat y?) 119))
					(self cue:)
				else
					(gEgo cel: 0 cycleSpeed: 18 setCycle: CT End self)
				)
			)
			(1
				(theBoat setMotion: MoveTo 126 119 self)
			)
			(2
				(gEgo
					view: 20
					setLoop: -1
					setLoop: 2
					setCel: 1
					cycleSpeed: 6
					setCycle: End self
				)
			)
			(3
				(gEgo
					view: 585
					setLoop: 2
					setCel: 0
					signal: (| (gEgo signal?) $0800)
				)
				(proc13_4 1680 40 self)
			)
			(4
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance stepInBoat of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(thePole setPri: 5 signal: 16)
				(fulk
					view: 674
					illegalBits: 0
					setLoop: 3
					setCel: 0
					posn: 204 193
					moveSpeed: 6
					setCycle: CT 5 1 self
				)
			)
			(1
				(fulk
					setLoop: 5
					posn: 213 193
					setPri: (+ (theBoat priority?) 4)
					setCel: 4
					setCycle: CT 0 -1 self
				)
			)
			(2
				(proc851_0 @local51 (Monastery tFULK?) 0 self)
			)
			(3
				(gEgo setScript: fulkBoat)
				(self dispose:)
			)
		)
	)
)

(instance egoGetsInBoat of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					illegalBits: 0
					setPri: 12
					signal: 16400
					setMotion: MoveTo 105 173 self
				)
			)
			(1
				(gEgo view: 19 setLoop: 1 setCel: 0 setCycle: CT 2 1 self)
			)
			(2
				(thePole dispose:)
				(gEgo
					posn: 101 167
					setLoop: 4
					setCel: 0
					setCycle: End self
				)
			)
			(3
				(gEgo
					view: -1
					view: 585
					setLoop: 2
					setCel: 0
					posn: 103 167
					illegalBits: 0
					setPri: (+ (theBoat priority?) 1)
				)
				(= ticks 6)
			)
			(4
				(fulk
					posn: (- (theBoat x?) 23) (+ (theBoat y?) 16)
					signal: 16384
				)
				(gEgo
					loop: 2
					illegalBits: 0
					posn: (- (theBoat x?) 68) (+ (theBoat y?) 10)
					setCel: 0
					setPri: 6
					setCycle: End self
				)
			)
			(5
				(theBoat
					setLoop: 1
					setCel: 1
					signal: (| (theBoat signal?) $0800)
				)
				(= ticks 6)
			)
			(6
				(= local12 1)
				(if (== local13 1)
					(= local13 0)
					(proc851_0 @local55 8 0 self)
				)
				(gEgo setScript: toTheGate)
				(self dispose:)
			)
		)
	)
)

(instance toTheGate of Script
	(properties)
	
	(method (doit)
		(gEgo
			x: (- (theBoat x?) 68)
			y: (+ (theBoat y?) 10)
			setPri: (+ (theBoat priority?) 4)
			signal: 2064
		)
		(fulk
			x: (- (theBoat x?) 23)
			y: (+ (theBoat y?) 16)
			setPri: (+ (theBoat priority?) 4)
			signal: 16
		)
		(theBoat setLoop: 1 setCel: 1)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(fulk posn: (- (theBoat x?) 23) (+ (theBoat y?) 16))
				(gEgo
					code: egoCode
					posn: (- (theBoat x?) 68) (+ (theBoat y?) 10)
				)
				(theBoat
					illegalBits: 0
					xStep: 2
					yStep: 2
					setMotion: MoveTo (+ (theBoat x?) 10) (- (theBoat y?) 15) self
				)
			)
			(1
				(theBoat
					setPri: 4
					signal: (| (theBoat signal?) $0010)
					setMotion: MoveTo 141 121 self
				)
				(gEgo
					view: 585
					setLoop: 2
					cel: 0
					setPri: -32768
					signal: (| (gEgo signal?) $0810)
					setCycle: End
				)
				(= local15 1)
			)
			(2
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance split of Script
	(properties)
	
	(method (doit)
		(gEgo
			x: (- (theBoat x?) 68)
			y: (+ (theBoat y?) 10)
			setPri: (theBoat priority?)
			signal: 18448
			illegalBits: 0
		)
		(fulk
			x: (- (theBoat x?) 23)
			y: (+ (theBoat y?) 16)
			setPri: (theBoat priority?)
			signal: 16400
			illegalBits: 0
		)
		(theBoat
			setPri: 1
			signal: (| (theBoat signal?) $4010)
			illegalBits: 0
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc806_1 100)
				(gEgo setCycle: End self)
			)
			(1
				(fulk posn: (- (theBoat x?) 23) (+ (theBoat y?) 16))
				(gEgo
					cel: 0
					posn: (- (theBoat x?) 68) (+ (theBoat y?) 10)
				)
				(theBoat setMotion: MoveTo 107 106 self)
			)
			(2 (gClient newRoom: 690))
		)
	)
)

(instance fulkBoat of Script
	(properties)
	
	(method (doit)
		(fulk
			x: (- (theBoat x?) 23)
			y: (+ (theBoat y?) 16)
			setPri: (+ (theBoat priority?) 4)
			signal: 16
		)
		(thePole x: (- (theBoat x?) 57) y: (+ (theBoat y?) 4))
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(thePole setPri: 5 signal: 16)
				(theBoat
					setLoop: 1
					setCel: 1
					moveSpeed: 6
					setMotion: MoveTo 177 157 self
				)
			)
			(1 (proc0_9 gEgo fulk self))
			(2
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance raiseTheGrate of Script
	(properties)
	
	(method (doit)
		(gEgo
			x: (- (theBoat x?) 68)
			y: (+ (theBoat y?) 10)
			cel: 0
			setPri: (+ (theBoat priority?) 4)
			signal: 2064
		)
		(fulk
			x: (- (theBoat x?) 23)
			y: (+ (theBoat y?) 16)
			setPri: (+ (theBoat priority?) 4)
			signal: 16
		)
		(theBoat setLoop: 1 setCel: 1)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
				(and (== (theBoat x?) 130) (== (theBoat y?) 119))
					(self cue:)
				else
					(theBoat setMotion: MoveTo 130 119 self)
				)
			)
			(1
				(gEgo setScript: blowTheJoint)
			)
		)
	)
)

(instance blowTheJoint of Script
	(properties)
	
	(method (dispose)
		(secretSound dispose:)
		(gateSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(ineptus setCycle: End)
				(gEgo
					view: 20
					setLoop: -1
					setLoop: 4
					setCel: 1
					setCycle: CT 3 1 self
				)
			)
			(1
				(secretSound play:)
				(= cycles 2)
			)
			(2 (proc13_4 1680 55 self))
			(3
				(proc13_4 1680 56)
				(waterGate setCycle: End self)
				(gateSound play:)
			)
			(4
				(gEgo
					view: 585
					setLoop: 2
					setCel: 0
					signal: (| (gEgo signal?) $0800)
					setScript: split
				)
				(gateSound stop:)
				(self dispose:)
			)
		)
	)
)

(instance moveAway of Script
	(properties)
	
	(method (doit)
		(theBoat
			x: (+ (gEgo x?) 68)
			y: (- (gEgo y?) 10)
			setPri: (theBoat priority?)
			signal: 18448
			illegalBits: 0
		)
		(fulk
			x: (+ (gEgo x?) 45)
			y: (+ (gEgo y?) 6)
			setPri: (theBoat priority?)
			signal: 16400
			illegalBits: 0
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local59 (Monastery tFULK?) 0)
				(gEgo
					cel: 0
					setMotion: MoveTo (- (gEgo x?) 10) (gEgo y?) self
				)
			)
			(1
				(proc0_4)
				(= local8 0)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance egoDock of Script
	(properties)
	
	(method (doit)
		(theBoat
			x: (+ (gEgo x?) 68)
			y: (- (gEgo y?) 10)
			setPri: (theBoat priority?)
			signal: 18448
			illegalBits: 0
		)
		(fulk
			x: (+ (gEgo x?) 45)
			y: (+ (gEgo y?) 6)
			setPri: (theBoat priority?)
			signal: 16400
			illegalBits: 0
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(proc851_0 @local63 (Monastery tFULK?) 0 self)
			)
			(1
				(gEgo
					cel: 0
					setCycle: End
					setMotion: MoveTo (+ (gEgo x?) 15) (gEgo y?) self
				)
			)
			(2
				(proc0_4)
				(= local8 0)
				(gIconBar disable: 4)
				(self dispose:)
			)
		)
	)
)

(instance timesUp of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if local12
					(gEgo setScript: priorKillBoat self)
				else
					(gEgo setScript: monkKillDock self)
				)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance monkKillDock of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(killMonk
					init:
					setCycle: Walk
					setMotion: MoveTo (- (gEgo x?) 15) (+ (gEgo y?) 10) self
				)
			)
			(1 (proc0_9 killMonk gEgo self))
			(2 (proc851_0 @local67 11 self))
			(3
				(killMonk
					view: 585
					setLoop: 3
					setCel: 0
					setCycle: End self
				)
			)
			(4
				(dieSound number: 588 play:)
				(gEgo view: 22 setLoop: 1 setCel: 0 setCycle: CT 4 1 self)
			)
			(5
				(if (= global115 2)
					(= global145 20)
					(gClient newRoom: 170)
				else
					(proc806_0 680 0)
					(self dispose:)
				)
			)
		)
	)
)

(instance monkKillBoat of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(killMonk
					init:
					setCycle: Walk
					setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 10) self
				)
			)
			(1
				(proc851_0 @local67 11 8 self)
			)
			(2
				(killMonk
					view: 585
					setLoop: 3
					setCel: 0
					setCycle: End self
				)
			)
			(3
				(dieSound number: 588 play:)
				(gEgo view: 22 setLoop: 1 setCel: 0 setCycle: CT 4 1 self)
			)
			(4
				(if (= global115 2)
					(= global145 20)
					(gClient newRoom: 170)
				else
					(proc806_0 680 0)
					(self dispose:)
				)
			)
		)
	)
)

(instance priorKillBoat of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(thePrior
					init:
					setCycle: Walk
					setMotion: MoveTo 116 180 self
				)
			)
			(1
				(proc851_0 @local71 8 (Monastery tPRIOR?) self)
			)
			(2
				(thePrior setHeading: 310 self)
			)
			(3
				(proc851_0 @local77 8 (Monastery tPRIOR?) self)
			)
			(4
				(proc13_6 32)
				(proc13_4 1680 48 self 80 {Vocalis} 67 160 142)
				(proc13_6 0)
			)
			(5
				(proc851_0 @local81 8 (Monastery tPRIOR?) self)
			)
			(6
				(gEgo setScript: moveAndShake)
			)
		)
	)
)

(instance moveAndShake of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(vocalis signal: 16384 setCycle: End self)
				(secretSound number: 19 play:)
			)
			(1
				(ShakeScreen 3)
				(= ticks 66)
			)
			(2
				(theBoat signal: 16384 illegalBits: 0)
				(gEgo signal: 16384 illegalBits: 0)
				(waterGate signal: 16384)
				(fulk signal: 16384 illegalBits: 0)
				(ineptus signal: 16384)
				(hilaris signal: 16384)
				(cogito signal: 16384)
				(vocalis signal: 16384)
				(theRock
					setLoop: 3
					setCel: 0
					x: (+ (gEgo x?) 6)
					y: (- (gEgo y?) 119)
					init:
					signal: 18432
					illegalBits: 0
					setMotion: JumpTo (+ (gEgo x?) 6) (- (gEgo y?) 47) self
				)
			)
			(3
				(dieSound number: 20 play:)
				(gEgo
					view: 22
					setLoop: -1
					setLoop: 1
					setCel: 0
					setCycle: CT 4 1
				)
				(= cycles 2)
			)
			(4
				(theRock setMotion: JumpTo (gEgo x?) (gEgo y?) self)
			)
			(5 (proc806_0) (self dispose:))
		)
	)
)

(instance askTheDwarf of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= local14 1)
				(proc13_4 1680 33 self)
			)
			(1
				(proc851_0 @local46 8 (Monastery tFULK?) self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance lookAtFulk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1680 26 self)
			)
			(1
				(proc851_0 @local21 8 (Monastery tFULK?) self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance giveFulkMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc806_1 25 96)
				(proc851_0 @local34 (Monastery tFULK?) 0 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance cogitoTalks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_000e 1680 3 self)
			)
			(1
				(localproc_0038)
				(= ticks 6)
			)
			(2
				(cogito signal: (| (cogito signal?) $0001))
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance vocalisTalks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_004b 1680 7 self)
			)
			(1
				(localproc_0075)
				(= ticks 6)
			)
			(2
				(vocalis signal: (| (vocalis signal?) $0001))
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance hilarisTalks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_0088 1680 9 self)
			)
			(1
				(localproc_00b2)
				(= ticks 6)
			)
			(2
				(hilaris signal: (| (hilaris signal?) $0001))
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance BackWalk of Rev
	(properties)
	
	(method (doit)
		(if (not (client isStopped:)) (super doit:))
	)
)

(instance egoCode of Code
	(properties)
	
	(method (doit)
		(if (gEgo mover?)
			(cond 
				((gEgo script?) 0)
				(
					(and
						(< 0 (gEgo heading?))
						(< (gEgo heading?) 180)
						(!= (gEgo cycler?) BackWalk)
					)
					(gEgo setCycle: BackWalk)
				)
				(
					(and
						(< 180 (gEgo heading?))
						(< (gEgo heading?) 360)
						(or (== (gEgo cycler?) BackWalk) (not (gEgo cycler?)))
					)
					(gEgo setCycle: Walk)
				)
			)
		)
	)
)

(instance gateSound of Sound
	(properties
		flags $0001
		number 673
		loop -1
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
	)
)

(instance secretSound of Sound
	(properties
		flags $0001
		number 21
	)
)
