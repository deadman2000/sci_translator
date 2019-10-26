;;; Sierra Script 1.0 - (do not remove this comment)
(script# 190)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm190 0
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
	[local8 4] = [1190 39 1]
	[local12 4] = [1190 29 1]
	[local16 4] = [1190 30 1]
	[local20 4] = [1190 0 1]
	[local24 5] = [1190 1 1 1]
	[local29 6] = [1190 3 1 2 2]
	[local35 10] = [1190 6 2 1 2 1 3 2 1]
	[local45 14] = [1190 13 1 2 2 2 1 2 2 1 3 1 2]
	[local59 6] = [1190 24 2 1 2]
	[local65 10] = [1190 43 1 2 0 1190 32 1 1]
	[local75 4] = [1190 31 1]
	[local79 3] = [-1 4944 6]
)
(procedure (localproc_000e)
	(proc13_6 6)
	(proc13_4 &rest 80 {Simon})
)

(procedure (localproc_0023)
	(cond 
		((> (= local1 (Random 0 100)) 80) (= local0 (/ 120 global125)))
		((> local1 60) (= local0 (/ 160 global125)))
		((> local1 40) (= local0 (/ 200 global125)))
		((> local1 20) (= local0 (/ 240 global125)))
		(else (= local0 (/ 280 global125)))
	)
)

(procedure (localproc_007f)
	(if (== global125 2)
		(= local2 (Random 6 8))
	else
		(= local2 (Random 4 7))
	)
	(cond 
		((<= local2 5) (= local3 10))
		((<= local2 7) (= local3 20))
		((= local2 8) (= local3 70))
	)
	(windFlags init:)
)

(instance rm190 of Rm
	(properties
		picture 190
		style $0064
		horizon 145
	)
	
	(method (init &tmp temp0 temp1)
		(super init:)
		(proc0_3)
		(flagTree init: stopUpd:)
		(garland1 init: stopUpd:)
		(garland2 init: stopUpd:)
		(garland3 init: stopUpd:)
		(localproc_0023)
		(localproc_007f)
		(gSFX number: 12 loop: -1 play:)
		(cond 
			((and (== global12 200) (not (proc0_5 43))) (proc0_7 43) (= local5 1))
			((and (proc0_5 46) (== global12 220)) (proc0_6 46) (proc0_7 43) (= local5 1))
			((and (proc0_5 73) (== global12 220)) (proc0_7 43) (= local5 1))
			((== global130 1)
				(if
					(or
						(not (proc0_5 46))
						(and (proc0_5 46) (== global12 200))
					)
					(proc0_6 46)
					(proc0_6 43)
					((ScriptID 20)
						view: 160
						loop: 1
						posn: 235 183
						actions: willDoVerb
						setCycle: StopWalk 161
						init:
					)
					(anOutlaw setCel: 1 approachVerbs: 5 3 4 init:)
				)
			)
			(
			(and (not (== global130 1)) (not (== global130 7))) (= local5 1) (proc0_7 43))
		)
		(cond 
			((== gGEgoEdgeHit 4) (= local6 148) (= local7 165))
			((== gGEgoEdgeHit 2) (= local6 193) (= local7 175))
			((proc0_5 43) (= local6 193) (= local7 175))
			(else (= local6 148) (= local7 165))
		)
		(cond 
			((== global12 220)
				(= temp0
					(switch gGEgoEdgeHit
						(3 109)
						(1 175)
						(4 330)
						(2 -10)
					)
				)
				(= temp1
					(switch gGEgoEdgeHit
						(3 142)
						(1 235)
						(4 154)
						(2 150)
					)
				)
			)
			((== global12 200)
				(= temp0 128)
				(= temp1 163)
				(= local6 148)
				(= local7 165)
			)
			(else
				(= temp0 330)
				(= temp1 154)
				(= local6 148)
				(= local7 165)
			)
		)
		(proc0_2)
		(gEgo
			posn: temp0 temp1
			init:
			actions: egoShootingDoVerb
			setScript: imHere
		)
		(if (proc0_5 1) (proc0_7 1) (= global112 42))
		(global2
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						319
						-1
						319
						0
						319
						1
						319
						80
						185
						67
						86
						88
						88
						124
						92
						136
						102
						140
						106
						142
						110
						145
						112
						146
						95
						151
						100
						164
						87
						167
						72
						161
						57
						157
						50
						154
						27
						149
						48
						133
						52
						96
						0
						73
						0
						0
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 96 88 319 93 319 122 316 122 315 153 193 153 180 153 93 123
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 20 154 61 163 83 171 83 183 68 189 50 189 19 189 0 189 0 159
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						268
						186
						300
						175
						299
						171
						286
						168
						273
						169
						259
						174
						246
						170
						217
						173
						206
						169
						207
						160
						217
						160
						266
						155
						298
						157
						319
						164
						319
						189
						269
						189
					yourself:
				)
		)
		(proc806_3 rocks)
	)
	
	(method (doit)
		(cond 
			((gEgo script?))
			((gEgo edgeHit?)
				(if
				(and (== global130 1) (proc0_5 45) (proc0_5 44))
					(proc0_3)
					(global2 newRoom: 160)
				else
					(global2 newRoom: 220)
				)
			)
			((== (-- local0) 0) (localproc_007f) (localproc_0023))
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX fade: 0 20 12 1)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1190 41 1))
			(10
				(if (== global125 1)
					(proc13_4 1190 42 1)
				else
					(global2 newRoom: 200)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garland1 of View
	(properties
		x 78
		y 129
		view 200
		loop 2
		priority 9
		signal $0010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (proc0_5 43)
					(if (not (proc0_5 77))
						(global2 setScript: firstAboutGarland)
					else
						(global2 setScript: garlandRepeatMsg)
					)
				else
					(proc13_4 1190 37 1)
				)
			)
			(2 (proc13_4 1190 40 1))
			(10
				(if (== global125 1)
					(proc13_4 1190 42 1)
				else
					(global2 newRoom: 200)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garland2 of View
	(properties
		x 39
		y 130
		view 200
		loop 2
		cel 4
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1190 40 1))
			(3
				(if (proc0_5 43)
					(if (not (proc0_5 77))
						(global2 setScript: firstAboutGarland)
					else
						(global2 setScript: garlandRepeatMsg)
					)
				else
					(proc13_4 1190 37 1)
				)
			)
			(10
				(if (== global125 1)
					(proc13_4 1190 42 1)
				else
					(global2 newRoom: 200)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garland3 of View
	(properties
		x 96
		y 131
		view 200
		loop 2
		cel 2
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1190 40 1))
			(10
				(if (== global125 1)
					(proc13_4 1190 42 1)
				else
					(global2 newRoom: 200)
				)
			)
			(3
				(if (proc0_5 43)
					(if (not (proc0_5 77))
						(global2 setScript: firstAboutGarland)
					else
						(global2 setScript: garlandRepeatMsg)
					)
				else
					(proc13_4 1190 37 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance windFlags of Prop
	(properties
		x 23
		y 101
		view 200
	)
	
	(method (init)
		(super init:)
		(self
			setLoop: local2
			setPri: 12
			setCycle: Fwd
			cycleSpeed: local3
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1190 46 1))
			(3 (proc13_4 1190 50 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance flagTree of View
	(properties
		x 21
		y 159
		view 200
		loop 1
		priority 13
		signal $4010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1190 46 1))
			(3 (proc13_4 1190 50 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rocks of Feature
	(properties
		y 157
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				2
				182
				3
				157
				24
				163
				27
				160
				32
				159
				51
				168
				61
				166
				66
				170
				55
				174
				43
				176
				39
				177
				38
				181
				27
				181
				21
				183
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
			(2 (proc13_4 1190 47 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance anOutlaw of Prop
	(properties
		x 260
		y 168
		approachX 211
		approachY 174
		view 200
		cel 1
		signal $4101
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(gEgo setScript: lookAtSimon)
			)
			(3
				(localproc_000e 1190 34 self)
				(proc13_6 0)
			)
			(5
				(cond 
					((not (proc0_5 78)) (global2 setScript: outlawFirstTalk))
					((not (proc0_5 41)) (localproc_000e 1190 35 self) (proc13_6 0))
					(else (global2 setScript: repeateClickTalk))
				)
			)
			(10 (proc13_4 1190 51 1))
			(4
				(switch param2
					(1
						(localproc_000e 1190 36 self)
						(proc13_6 0)
					)
					(0
						(if (> (gMoney doit:) 0)
							(if (not (proc0_5 87))
								(global2 setScript: giveSimonMoney)
							else
								(localproc_000e 1190 45 self)
								(proc13_6 0)
							)
						)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance heDidNotFire of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 6))
			(1
				(proc851_0 1 @local20 14 0 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance firstConvDay1 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 72)
				(= cycles 1)
			)
			(1
				(proc851_0 1 @local24 14 0 self)
			)
			(2
				(if (and (proc0_5 75) (not (proc0_6 216)))
					(proc851_0 2 @local29 999 0 14 1 self)
				else
					(= cycles 1)
				)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance firstAboutGarland of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 6))
			(1
				(proc851_0 3 @local35 999 0 14 3 @local79 1 self)
			)
			(2
				(proc0_4)
				(proc0_6 77)
				(self dispose:)
			)
		)
	)
)

(instance outlawFirstTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 6))
			(1
				(proc851_0 3 @local45 999 0 @local79 1 14 3 self)
			)
			(2
				(proc0_4)
				(proc0_6 78)
				(self dispose:)
			)
		)
	)
)

(instance repeateClickTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 6))
			(1
				(proc851_0 2 @local65 999 0 @local79 1 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance giveSimonMoney of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 6))
			(1
				(proc851_0 2 @local59 999 0 @local79 2 self)
			)
			(2
				(proc806_1 10 87)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance lookAtSimon of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1190 32 self)
			)
			(1 (proc13_4 1190 33 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance garlandRepeatMsg of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 6))
			(1
				(proc851_0 1 @local12 14 0 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance imHere of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath local6 local7 self)
			)
			(1
				(if (proc0_5 43)
					(gEgo setHeading: 90 self)
				else
					(self cue:)
				)
			)
			(2 (proc0_2) (= ticks 30))
			(3
				(cond 
					(
						(and
							(== global12 200)
							(== global130 1)
							(== local5 0)
							(proc0_5 43)
							(not (proc0_5 41))
						)
						(gEgo setScript: heDidNotFire)
					)
					((== global130 1)
						(if (not (proc0_5 72))
							(proc0_6 72)
							(gEgo setScript: firstConvDay1)
						else
							(self cue:)
						)
					)
					(else (self cue:))
				)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance willDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1190 38 1))
			(3 (proc851_0 1 @local8 14 0))
			(5
				(if (== global12 200)
					(proc851_0 1 @local75 14 0)
				else
					(proc851_0 1 @local16 14 0)
					1
				)
			)
			(10 (proc13_4 1190 51 1))
		)
	)
)

(instance egoShootingDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(4
				(if (== param2 1)
					(if (proc0_5 43)
						(proc13_4 1190 48 1)
					else
						(proc13_4 1190 49 1)
					)
				)
			)
		)
	)
)
