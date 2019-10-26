;;; Sierra Script 1.0 - (do not remove this comment)
(script# 320)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n927)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm320 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	[local7 4] = [1320 0 1]
	[local11 4] = [1320 1 1]
	[local15 4] = [1320 3 1]
	[local19 5] = [1320 4 1 1]
	[local24 7] = [1320 6 2 1 2 1]
	[local31 5] = [1320 10 2 1]
	[local36 4] = [1320 12 1]
	[local40 9] = [327 0 3 4 15 31 12 21 21]
)
(procedure (localproc_000e)
	(cond 
		((and (!= gHeading 330) (== global125 1))
			(if (proc0_5 164)
				(proc0_6 10)
				(gEgo setScript: beforeGoldenArrow)
			else
				(proc13_4 1320 55 1)
			)
		)
		((proc0_5 160) (proc13_4 1320 55 1))
		((proc0_5 164) (gClient newRoom: 330))
		(else (proc13_4 1320 55 1))
	)
)

(procedure (localproc_008b)
	(proc13_6 19)
	(proc13_4 &rest 80 {Roger})
	(proc13_6 0)
)

(procedure (localproc_00a6)
	(proc13_6 19)
	(proc13_4 &rest 80 {Giles})
	(proc13_6 0)
)

(procedure (localproc_00c1)
	(proc13_6 19)
	(proc13_4 &rest 80 {Jack})
	(proc13_6 0)
)

(procedure (localproc_00dc)
	(= local3 (Random 12 16))
	(= local4 (Random 10 16))
	(= local5 (Random 9 14))
	(leftFlag init:)
	(middleFlag init:)
	(rightFlag init:)
	(= local2 (Random 100 300))
)

(procedure (localproc_011e)
	(gNewCast eachElementDo: #hide)
	(gClient drawPic: 803)
)

(procedure (localproc_0133)
	(gClient drawPic: 320)
	(gEgo loop: 1 posn: 125 148)
	(guard1Roger loop: 3 setCel: 0 posn: 99 181)
	(guard2Jack loop: 3 setCel: 1 posn: 136 183)
	(guard3Giles loop: 3 setCel: 5 posn: 209 178)
	(adamBell posn: 165 166)
	(archer2 posn: 302 160)
	(gNewCast eachElementDo: #show)
)

(instance rm320 of Rm
	(properties
		picture 320
		style $8002
		south 280
	)
	
	(method (init)
		(if (== gHeading 280) (= style 100))
		(super init:)
		(if (== gHeading 280) (gRgnMusic fade: 60 30 8 0))
		(proc806_6 0)
		(localproc_00dc)
		(puckTarget init:)
		(proc806_3
			sheriffBox
			ladiesBox
			crowd1
			crowd2
			targetRight
			targetLeft
		)
		(if (== gHeading 330)
			(gClient
				addObstacle:
					((Polygon new:)
						type: 3
						init: 255 189 0 189 0 0 319 0 319 189 277 189 277 177 255 177
						yourself:
					)
			)
			(adamBell posn: 165 166 init:)
			(archer2 posn: 302 160 init:)
			(guard1Roger
				loop: 3
				setCel: 0
				setCycle: Walk
				posn: 99 181
				init:
			)
			(guard2Jack
				loop: 3
				setCel: 1
				setCycle: Walk
				posn: 136 183
				init:
			)
			(guard3Giles
				loop: 3
				setCel: 5
				setCycle: Walk
				posn: 209 178
				init:
			)
			(cond 
				((proc0_5 10) (gEgo loop: 1 posn: 125 148 init: setAvoider: PAvoider))
				((proc0_5 131)
					(gEgo
						loop: 3
						posn: 260 185
						init:
						observeControl: 2 4 16
						setAvoider: PAvoider
					)
				)
				(else
					(= global155 43)
					(gEgo
						loop: 7
						posn: 239 170
						init:
						observeControl: 2 4 16
						setAvoider: PAvoider
					)
				)
			)
		else
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init: 249 189 0 189 0 0 319 0 319 189 277 189 277 177 248 177 248 189
						yourself:
					)
			)
			(gEgo
				loop: 3
				posn: 265 187
				init:
				setCycle: Walk
				observeControl: 2 4 16
			)
			(if (< global155 42) (adamBell init:) (archer2 init:))
			(guard1Roger setCycle: Walk init:)
			(guard2Jack setCycle: Walk init:)
			(guard3Giles setCycle: Walk init:)
		)
		(cond 
			((> global155 42)
				(if (== gHeading 330)
					(gEgo setScript: leaveInHuff)
				else
					(gEgo setScript: tormentIsOver)
				)
			)
			((and (proc0_5 160) (== gHeading 330)) (gEgo setScript: kickOutPoorPlay))
			((proc0_5 131)
				(cond 
					((== (++ global148) 1) (gEgo setScript: forceOutComeIn))
					((== global148 2) (gEgo setScript: afterToldMoveOut))
					((== global148 3) (gEgo setScript: goToDeathMesg))
				)
			)
			((and (< 31 global155) (< global155 43)) (gEgo setScript: tormentHasStarted))
			((proc0_5 10) (gEgo setScript: goldenArrowAward))
			(
				(and
					(proc0_5 130)
					(< global155 31)
					(not (proc0_5 164))
				)
				(gEgo setScript: returnBeforeStarted)
			)
			((not (proc0_5 58)) (gEgo setScript: stillHasScroll))
			((not (proc0_5 130)) (proc0_6 130) (gEgo setScript: firstEntWithNoScrol))
		)
	)
	
	(method (doit)
		(if (== (-- local2) 0) (localproc_00dc))
		(cond 
			((gEgo script?) 0)
			(
				(and
					(proc0_5 164)
					(< global155 31)
					(or (> (gEgo x?) 290) (> (gEgo y?) 185))
					(not (proc0_5 131))
					(not local0)
				)
				(= local0 1)
				(gEgo setScript: leaveAfterPaid)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gClient setScript: 0)
		(gEgo setScript: 0)
		(DisposeScript 927)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 65 1))
			(3 (proc13_4 1320 66 1))
			(4 (proc13_4 1320 66 1))
			(10 (localproc_000e))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance sheriffBox of Feature
	(properties
		x 46
		y 76
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 40 68 72 66 79 40 79 69 105 66 155 0 156
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
			(2 (proc13_4 1320 34 1))
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance ladiesBox of Feature
	(properties
		x 300
		y 36
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 302 36 300 46 290 55 291 68 273 66 274 90 232 80 232 54 249 35
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
			(2 (proc13_4 1320 35 1))
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance crowd1 of Feature
	(properties
		x 205
		y 46
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 198 42 211 34 225 32 240 46 231 54 232 80 164 65 165 50 189 31
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
			(2 (proc13_4 1320 36 1))
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance crowd2 of Feature
	(properties
		x 295
		y 63
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 319 50 319 96 274 88 273 66 292 66 291 55 307 37
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
			(2 (proc13_4 1320 36 1))
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance targetLeft of Feature
	(properties
		x 65
		y 62
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 63 64 72 64 72 71 67 71 62 70 61 66 64 64
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 33 1))
			(10 (localproc_000e))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance targetRight of Feature
	(properties
		x 137
		y 61
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 137 61 139 63 139 68 135 69 128 68 128 64 132 61
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 33 1))
			(10 (localproc_000e))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance closeUpArrow of View
	(properties
		x 90
		y 83
		view 330
		loop 6
	)
)

(instance puckTarget of View
	(properties
		x 97
		y 68
		view 325
		loop 1
		signal $0001
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1320 33 1))
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance adamBell of View
	(properties
		x 153
		y 180
		view 325
		loop 2
		signal $0001
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 30 1))
			(5
				(if (proc0_5 164)
					(gEgo setScript: talkAdamConv)
				else
					(proc13_4 1320 61 1)
				)
			)
			(10 (localproc_000e))
			(4
				(switch param2
					(0
						(if (proc0_5 164)
							(gMoney put:)
							(gEgo setScript: moneyConv)
						else
							(super doVerb: theVerb &rest)
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

(instance archer2 of View
	(properties
		x 303
		y 158
		view 325
		loop 2
		cel 1
		signal $0001
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 31 1))
			(5
				(if (proc0_5 164)
					(proc13_6 21)
					(proc13_4 1320 38 80 {Archer})
					(proc13_6 0)
				else
					(proc13_4 1320 61 1)
				)
			)
			(10 (localproc_000e))
			(4
				(switch param2
					(0
						(if (proc0_5 164)
							(gMoney put:)
							(proc13_6 21)
							(proc13_4 1320 51 80 {Archer})
							(proc13_6 0)
						else
							(super doVerb: theVerb &rest)
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

(instance leftFlag of Prop
	(properties
		x 52
		y 56
		view 333
		priority 1
		signal $0010
	)
	
	(method (init)
		(super init:)
		(self setCycle: Fwd cycleSpeed: local3)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1320 56 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance middleFlag of Prop
	(properties
		x 203
		y 29
		lookStr 9360
		view 333
		loop 1
	)
	
	(method (init)
		(super init:)
		(self setCycle: Fwd cycleSpeed: local4)
	)
)

(instance rightFlag of Prop
	(properties
		x 272
		y 30
		lookStr 9360
		view 333
		loop 2
	)
	
	(method (init)
		(super init:)
		(self setCycle: Fwd cycleSpeed: local5)
	)
)

(instance guard1Roger of Actor
	(properties
		x 240
		y 185
		view 750
		signal $0001
	)
	
	(method (doVerb theVerb param2 &tmp gMoneyDoit)
		(switch theVerb
			(2 (proc13_4 1320 32 1))
			(3
				(if (not local6)
					(= local6 1)
					(localproc_008b 1320 39 1)
				else
					(localproc_008b 1320 62 1)
				)
			)
			(4
				(switch param2
					(0
						(if (proc0_5 58)
							(cond 
								((== (= gMoneyDoit (gMoney doit:)) 0))
								((proc0_5 164) (localproc_008b 1320 46 self))
								((== gMoneyDoit 4)
									(proc0_6 164)
									(gEgo ignoreControl: 4 setScript: letPuckGoIn)
								)
								((> gMoneyDoit 4)
									(localproc_008b 1320 46 self)
									(proc0_6 164)
									(gEgo ignoreControl: 4 setScript: letPuckGoIn)
								)
								(else (localproc_008b 1320 44 self))
							)
						else
							(localproc_008b 1320 43 self)
						)
					)
					(17
						(localproc_008b 1320 52 self)
					)
				)
			)
			(5
				(cond 
					((not (proc0_5 58)) (localproc_008b 1320 40 self))
					((and (not (proc0_5 164)) (proc0_5 58)) (localproc_008b 1320 41 self))
					(else (localproc_008b 1320 42 self))
				)
			)
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance guard2Jack of Actor
	(properties
		x 285
		y 185
		view 750
		loop 2
		cel 1
		signal $0001
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 32 1))
			(3
				(localproc_00c1 1320 64 self)
			)
			(5
				(cond 
					((not (proc0_5 58)) (localproc_00c1 1320 40 self))
					((and (not (proc0_5 164)) (proc0_5 58)) (localproc_00c1 1320 41 self))
					(else (localproc_00c1 1320 42 self))
				)
			)
			(10 (localproc_000e))
			(4
				(switch param2
					(0
						(cond 
							((not (proc0_5 164)) (localproc_00c1 1320 47 self))
							((> (gMoney doit:) 0) (localproc_00c1 1320 59 self))
							(else (super doVerb: theVerb &rest))
						)
					)
					(17
						(localproc_00c1 1320 54 self)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
)

(instance guard3Giles of Actor
	(properties
		x 256
		y 175
		view 750
		loop 2
		signal $0001
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1320 32 1))
			(3
				(localproc_00a6 1320 63 self)
			)
			(4
				(switch param2
					(0
						(cond 
							((not (proc0_5 164)) (localproc_00a6 1320 47 self))
							((> (gMoney doit:) 0) (localproc_00a6 1320 48 self))
							(else (super doVerb: theVerb &rest))
						)
					)
					(17
						(localproc_00a6 1320 53 self)
					)
				)
			)
			(5
				(cond 
					((not (proc0_5 58)) (localproc_00a6 1320 40 self))
					((and (not (proc0_5 164)) (proc0_5 58)) (localproc_00a6 1320 41 self))
					(else (localproc_00a6 1320 42 self))
				)
			)
			(10 (localproc_000e))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance leaveInHuff of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1320 60 self)
			)
			(1
				(proc0_2)
				(gEgo setMotion: MoveTo 325 180 self)
			)
			(2 (gClient newRoom: 280))
		)
	)
)

(instance stillHasScroll of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(proc851_0 1 @local7 6 2 self)
			)
			(2
				(localproc_008b 1320 13 self)
			)
			(3
				(localproc_008b 1320 14 self)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance firstEntWithNoScrol of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(localproc_008b 1320 15 self)
			)
			(2
				(proc851_0 1 @local11 6 2 self)
			)
			(3
				(localproc_008b 1320 16 self)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance returnBeforeStarted of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(localproc_008b 1320 17 self)
			)
			(2
				(localproc_008b 1320 18 self)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance takeHimOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(switch global148
					(2
						(localproc_008b 1320 24 self)
					)
					(3
						(gEgo setScript: goToDeathMesg)
					)
					(else 
						(localproc_008b 1320 20 self)
					)
				)
			)
			(1
				(proc0_6 131)
				(gEgo setMotion: PolyPath (gEgo x?) 200 self)
				(guard1Roger setMotion: MoveTo (- (gEgo x?) 10) 200)
				(guard2Jack setMotion: MoveTo (+ (gEgo x?) 30) 200)
			)
			(2 (gClient newRoom: 280))
		)
	)
)

(instance afterToldMoveOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(client setScript: takeHimOut)
			)
		)
	)
)

(instance goToDeathMesg of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_008b 1320 25 self)
			)
			(1
				(guard1Roger
					setMotion: MoveTo (- (gEgo x?) 15) (+ (gEgo y?) 10) self
				)
			)
			(2
				(proc0_9 guard1Roger gEgo self)
			)
			(3
				(localproc_00a6 1320 26 self)
			)
			(4
				(localproc_00c1 1320 27 self)
			)
			(5
				(localproc_008b 1320 28 self)
			)
			(6
				(= global145 34)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance goldenArrowAward of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= local1 1)
				(self cue:)
			)
			(1
				(localproc_0133)
				(= ticks 6)
			)
			(2
				(gEgo setMotion: PolyPath 90 128 self)
			)
			(3
				(proc851_0 2 @local24 6 0 12 1 self)
			)
			(4
				(closeUpArrow setPri: 15 init:)
				(= cycles 3)
			)
			(5
				(proc851_0 2 @local31 6 0 12 1 self)
			)
			(6
				(proc806_4 10000)
				(closeUpArrow hide:)
				(localproc_011e)
				(= ticks 6)
			)
			(7
				(gClient drawPic: 803 -32762)
				(proc0_4)
				(proc806_6 0)
				(gClient newRoom: 160)
			)
		)
	)
)

(instance moneyConv of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_6 21)
				(proc13_4 1320 49 self 80 {Adam Bell})
				(proc13_6 0)
			)
			(1
				(proc851_0 1 @local36 6 2 self)
			)
			(2
				(proc13_6 21)
				(proc13_4 1320 50 self 80 {Adam Bell})
				(proc13_6 0)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance letPuckGoIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(guard3Giles setMotion: MoveTo 275 166)
				(guard1Roger setMotion: MoveTo 170 173)
				(guard2Jack setMotion: MoveTo 200 168 self)
			)
			(1
				(gEgo ignoreControl: 4)
				(if (gClient obstacles?)
					((gClient obstacles?) dispose:)
				)
				(gClient obstacles: 0)
				(localproc_008b 1320 45 self)
			)
			(2
				(guard3Giles signal: (| (guard3Giles signal?) $4001))
				(guard1Roger signal: (| (guard1Roger signal?) $0001))
				(guard2Jack signal: (| (guard2Jack signal?) $4001))
				(gEgo setMotion: MoveTo 252 173 self)
			)
			(3
				(gClient
					addObstacle:
						((Polygon new:)
							type: 3
							init: 319 189 264 172 242 157 221 155 218 168 199 174 183 189
							yourself:
						)
				)
				(= ticks 6)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance kickOutPoorPlay of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 131)
				(localproc_008b 1320 57 self)
			)
			(1
				(gEgo setMotion: PolyPath 280 178 self)
			)
			(2
				(gEgo setMotion: PolyPath 319 179)
				(guard3Giles setMotion: MoveTo 295 178 self)
			)
			(3 (gClient newRoom: 280))
		)
	)
)

(instance forceOutComeIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(localproc_008b 1320 23 self)
			)
			(2 (= ticks 300))
			(3
				(client setScript: takeHimOut)
			)
		)
	)
)

(instance tormentHasStarted of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(localproc_008b 1320 19 self)
			)
			(2 (proc0_4) (= ticks 300))
			(3
				(client setScript: takeHimOut)
			)
		)
	)
)

(instance tormentIsOver of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(= ticks 24)
			)
			(1
				(localproc_008b 1320 29 self)
			)
			(2
				(gEgo setMotion: MoveTo (gEgo x?) 240 self)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance tooLateToComeIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 234 181 self)
			)
			(1
				(guard2Jack setMotion: MoveTo 210 175)
				(guard3Giles setMotion: MoveTo 243 171)
				(guard1Roger setMotion: MoveTo 199 182 self)
			)
			(2
				(localproc_011e)
				(= cycles 5)
			)
			(3
				(gClient drawPic: 803 -32762)
				(= cycles 10)
			)
			(4
				(proc13_4 1320 58 67 60 50)
				(self cue:)
			)
			(5
				(proc0_4)
				(gClient newRoom: 160)
			)
		)
	)
)

(instance leaveAfterPaid of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 131)
				(gEgo setMotion: PolyPath 265 (gEgo y?) self)
			)
			(1
				(proc0_9 gEgo guard1Roger)
				(proc0_9 guard1Roger gEgo)
				(= ticks 30)
			)
			(2
				(localproc_008b 1320 21 self)
			)
			(3
				(localproc_008b 1320 22 self)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance talkAdamConv of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_6 21)
				(proc13_4 1320 2 80 {Adam Bell})
				(proc13_6 0)
				(self cue:)
			)
			(1
				(proc851_0 @local15 6 0 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance beforeGoldenArrow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_011e)
				(= seconds 5)
			)
			(1
				(proc851_0 1 @local19 @local40 0 self)
			)
			(2
				(gEgo setScript: goldenArrowAward)
			)
		)
	)
)

(instance sExitEast of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setMotion: MoveTo 335 (gEgo y?) self)
			)
			(1 (gClient newRoom: 280))
		)
	)
)
