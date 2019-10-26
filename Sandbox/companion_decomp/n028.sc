;;; Sierra Script 1.0 - (do not remove this comment)
(script# 28)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n950)
(use n958)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	aMonk 0
	monkScript 1
)

(local
	local0
	local1
	[local2 17] = [-1 5810 26 0 0 0 0 0 0 0 4 6 2 7 5 1 3]
	local19
	local20
	local21
	[local22 10] = [1028 28 1 2 1 2 1 2 1]
	[local32 5] = [1028 35 1 2]
	[local37 4] = [1028 37 1]
	[local41 6] = [1028 1 2 1 2]
	[local47 5] = [1028 4 2 1]
	[local52 5] = [1028 6 2 1]
	[local57 7] = [1028 8 1 2 1 2]
	[local64 5] = [1028 12 1 2]
	[local69 5] = [1028 14 1 2]
	[local74 11] = [1028 16 2 1 1 2 1 2 1 2]
	[local85 4] = [1028 24 1]
	[local89 6] = [1028 25 2 1 2]
	[local95 4] = [1028 51 2]
	[local99 7] = [1028 43 2 2 1 2]
	[local106 5] = [1028 47 1 2]
	[local111 5] = [1028 49 1 2]
	[local116 4] = [1028 42 1]
	[local120 5] = [1028 38 1 2]
	[local125 5] = [1028 40 1 1]
	[local130 5] = [1028 52 2 1]
	[local135 8] = [1028 54 2 1 2 1 2]
	[local143 6] = [1028 61 1 1 2]
	[local149 4] = [1028 64 1]
	[local153 4] = [1028 65 1]
	[local157 6] = [1028 66 1 1 2]
)
(instance aMonk of Actor
	(properties
		description 5821
		view 129
		signal $2000
	)
	
	(method (init)
		(proc958_0 132 153 152)
		(gSFX number: 125 loop: -1 play:)
		(monkPoly init:)
		(if (== global130 5) (proc0_6 133) else (proc0_6 134))
		(super init:)
	)
	
	(method (doit)
		(if
			(and
				(monkPoly onMe: gEgo)
				(not local19)
				(not (gEgo script?))
			)
			(= local19 1)
			(self setScript: assumeThePosition)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX fade: 0 30 8 1)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(Wat weMeetAgain: 1)
		(if (global32 contains: monkPoly) (monkPoly dispose:))
		(proc0_6 169)
		(super dispose:)
		(self delete:)
		(DisposeScript 28)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1028 0))
			(5
				(if (not (Wat charFirstTalk?))
					(Wat charFirstTalk: 1)
					(gEgo setScript: talkTalkScript)
				else
					(proc851_0 @local89 2 10)
				)
			)
			(10 (gEgo setScript: drawBow))
			(4
				(if (proc999_5 param2 0 2 14 18 10 4 1 17 16)
					(if
						(&
							local1
							(switch param2
								(2 1)
								(14 2)
								(18 4)
								(10 8)
								(4 16)
								(1 32)
								(17 64)
								(16 128)
							)
						)
						(proc13_4 1028 59)
					else
						(= local1
							(|
								local1
								(switch param2
									(2 1)
									(14 2)
									(18 4)
									(10 8)
									(4 16)
									(1 32)
									(17 64)
									(16 128)
								)
							)
						)
						(gEgo setScript: approachMonk 0 param2)
					)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(3
				(= local19 1)
				(gEgo setScript: approachMonk 0 999)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance tuckie of Prop
	(properties
		x 187
		y 83
		view 168
		loop 1
		priority 4
		signal $0010
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(proc13_4 1028 60 1)
				1
			else
				0
			)
		)
	)
)

(instance monkScript of TScript
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3)
		(switch (= state newState)
			(0
				(if (== (Wat travelDir?) 3)
					(= temp0 235)
					(= temp1 50)
					(= temp2 205)
					(= temp3 70)
					(global2 horizon: 30)
				else
					(= temp0 85)
					(= temp1 160)
					(= temp2 135)
					(= temp3 125)
				)
				(proc0_3)
				(Wat setScript: 0)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(if (not (global5 contains: aMonk)) (aMonk init:))
					(aMonk
						posn: temp0 temp1
						setLoop: (if (== (Wat travelDir?) 3) 0 else 1)
						setCycle: Walk
						setMotion: MoveTo temp2 temp3 self
					)
				)
			)
			(1
				(aMonk
					ignoreActors: 1
					setLoop: (+ (aMonk loop?) 2)
					setCel: 0
				)
				(global2
					addObstacle:
						(if (== (Wat travelDir?) 3)
							((Polygon new:)
								type: 2
								init: 230 56 230 79 176 79 176 56
								yourself:
							)
						else
							((Polygon new:)
								type: 2
								init: 110 113 164 113 164 135 110 135
								yourself:
							)
						)
				)
				(proc0_2)
				(= ticks 18)
			)
			(2
				(proc851_0 @local22 3 10 self)
			)
			(3
				(proc0_4)
				(gEgo actions: egoActions)
				(self dispose:)
			)
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(global2
					addObstacle:
						(if (== (Wat travelDir?) 3)
							((Polygon new:)
								type: 2
								init: 230 56 230 79 176 79 176 56
								yourself:
							)
						else
							((Polygon new:)
								type: 2
								init: 110 113 164 113 164 135 110 135
								yourself:
							)
						)
				)
				(proc851_0 2 @local32 3 0 10 3 self)
			)
			(2
				(proc851_0 1 @local37 1 0 self)
			)
			(3
				(proc0_4)
				(gEgo actions: egoActions)
				(self dispose:)
			)
		)
	)
)

(instance approachMonk of Script
	(properties)
	
	(method (changeState newState &tmp gMoneyDoit)
		(switch (= state newState)
			(0
				(proc806_6 0)
				(proc0_3)
				(switch register
					(0
						(if (> (gEgo distanceTo: aMonk) 25)
							(if (== (Wat travelDir?) 1)
								(gEgo
									setMotion: PolyPath (+ (aMonk x?) 17) (- (aMonk y?) 5) self
								)
							else
								(gEgo
									setMotion: PolyPath (- (aMonk x?) 17) (+ (aMonk y?) 5) self
								)
							)
						else
							(self cue:)
						)
					)
					(999
						(gEgo setMotion: PChase aMonk 50 self)
					)
					(else 
						(gEgo setMotion: PChase aMonk 40 self)
					)
				)
			)
			(1
				(if (== register 999)
					(client setScript: bowAndScrape)
				else
					(proc0_9 gEgo aMonk self)
				)
			)
			(2 (= ticks 12))
			(3
				(if (proc999_5 register 2 14 10 18 4)
					(proc851_0 1 @local95 10 3 self)
				else
					(switch register
						(1
							(proc851_0 1 @local116 10 3 self)
						)
						(17
							(proc851_0 @local130 1 10 self)
						)
						(16
							(proc851_0 @local135 1 10 self)
						)
						(0
							(cond 
								(local20 (proc851_0 @local111 1 10 self))
								((= gMoneyDoit (gMoney doit:)) (= local20 1) (client setScript: talkBuckScript))
								(else (self cue:))
							)
						)
					)
				)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance drawBow of Script
	(properties)
	
	(method (dispose)
		(shootSound stop: dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc806_6 0)
				(proc0_3)
				(proc958_0 128 4 5)
				(switch (Wat travelDir?)
					(1
						(if (> (gEgo y?) (aMonk y?))
							(if (< (gEgo x?) (aMonk x?))
								(gEgo
									setMotion: PolyPath (- (aMonk x?) 50) (aMonk y?) self
								)
							else
								(gEgo
									setMotion: PolyPath (+ (aMonk x?) 50) (aMonk y?) self
								)
							)
						else
							(self cue:)
						)
					)
					(3
						(if (< (gEgo y?) (aMonk y?))
							(if (< (gEgo x?) (aMonk x?))
								(gEgo
									setMotion: PolyPath (- (aMonk x?) 50) (aMonk y?) self
								)
							else
								(gEgo
									setMotion: PolyPath (+ (aMonk x?) 50) (aMonk y?) self
								)
							)
						else
							(self cue:)
						)
					)
				)
			)
			(1 (proc0_9 gEgo aMonk self))
			(2
				(gEgo view: 4 setCel: 0 setCycle: End self)
			)
			(3
				(shootSound play:)
				(if (not local19)
					(aMonk setCycle: End self)
				else
					(self cue:)
				)
			)
			(4
				(proc851_0 @local120 1 10 self)
			)
			(5 (gEgo setCycle: Beg self))
			(6
				(proc851_0 1 @local125 1 0 self)
			)
			(7
				(shootSound stop:)
				(gSFX number: 127 loop: -1 play:)
				(= global126 5)
				(proc0_6 55)
				(if (== global130 5) (proc0_6 25))
				(= global160 0)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(proc0_2)
				((global2 obstacles?) eachElementDo: #dispose release:)
				(= temp0 (PicNotValid))
				(PicNotValid 1)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32762)
				(Animate (global5 elements?) 0)
				(PicNotValid temp0)
				(= ticks 60)
			)
			(8
				(global2 drawPic: 150 -32761)
				(self setScript: whippingBoy self)
			)
			(9
				(tuckie dispose:)
				(global5 eachElementDo: #hide)
				(proc0_2)
				(gEgo loop: 5 cel: 0 posn: 160 90)
				(gEgoHead z: 38 posn: 160 90)
				(global2 drawPic: 803 -32762)
				(= ticks 24)
			)
			(10
				(proc125_2)
				(global2 drawPic: 120 -32761)
				(proc121_0 1)
				(gEgo show:)
				(gEgoHead show:)
				(proc806_6 0)
				(= cycles 3)
			)
			(11
				(proc0_4)
				(proc806_1 -75)
				(self dispose:)
				(aMonk dispose:)
			)
		)
	)
)

(instance bowAndScrape of TScript
	(properties)
	
	(method (dispose)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (aMonk cel?)
					(self cue:)
				else
					(aMonk setCycle: End self)
				)
			)
			(1
				(proc851_0 @local41 1 10 self 0)
			)
			(2
				(proc851_0 @local57 3 10 self 0)
			)
			(3
				(proc851_0 @local64 2 10 self 0)
			)
			(4
				(proc851_0 @local69 3 10 self 1)
			)
			(5
				(gSFX number: 128 loop: -1 play:)
				(= global126 5)
				(proc0_6 55)
				(if (== global130 5) (proc0_6 25))
				(proc0_2)
				(global5 eachElementDo: #hide)
				((global2 obstacles?) eachElementDo: #dispose release:)
				(global2 drawPic: 150 -32761)
				(self setScript: whippingBoy self)
			)
			(6
				(tuckie dispose:)
				(gEgo loop: 5 cel: 0 posn: 160 90)
				(gEgoHead z: 38 posn: 160 90)
				(proc0_2)
				(= temp0 (PicNotValid))
				(PicNotValid 1)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32762)
				(Animate (global5 elements?) 0)
				(PicNotValid temp0)
				(= ticks 24)
			)
			(7
				(global2 drawPic: 120 -32761)
				(= global160 0)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(proc0_2)
				(gEgo show:)
				(proc121_0 1)
				(proc125_2)
				(proc806_6 0)
				(= cycles 3)
			)
			(8
				(proc806_1 75)
				(proc0_4)
				(self dispose:)
				(aMonk dispose:)
			)
		)
	)
)

(instance talkTalkScript of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local74 1 10 self 0)
			)
			(1
				(proc851_0 @local85 2 10)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance talkBuckScript of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local99 1 10 self 0)
			)
			(1
				(if (and (monkPoly onMe: gEgo) (not local19))
					(proc851_0 @local106 2 10 self 0)
				else
					(proc851_0 @local106 2 10 self)
				)
			)
			(2
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance monkPoly of Feature
	(properties)
	
	(method (init)
		(if (== (Wat travelDir?) 3)
			((= onMeCheck (Polygon new:))
				type: 0
				init: 188 87 117 60 180 37 261 66
				yourself:
			)
		else
			((= onMeCheck (Polygon new:))
				type: 0
				init: 169 92 209 123 195 147 70 147 36 103
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance assumeThePosition of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(client setCycle: End self)
			)
			(1
				(if (> (gEgo distanceTo: aMonk) 40)
					(proc851_0 @local47 2 10 self)
				else
					(proc851_0 @local52 2 10 self)
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance whippingBoy of Script
	(properties)
	
	(method (doit)
		(if (and local0 (== (tuckie cel?) 4))
			(spankSound play:)
			(aMonk loop: 6 cel: 0 setCycle: End)
			(= local0 0)
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(spankSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local0 1)
				(aMonk loop: 6 cel: (aMonk lastCel:) x: 155 y: 85 show:)
				(tuckie init: setCycle: End self)
			)
			(1
				(aMonk loop: 5 cel: 0 setScript: chopChop self)
			)
			(2
				(= local0 1)
				(tuckie cel: 1)
				(tuckie setCycle: End self)
			)
			(3
				(proc851_0 2 @local143 @local2 2 15 3 self)
			)
			(4 (= ticks 60))
			(5
				(aMonk loop: 5 cel: 0 setScript: chopChop self)
			)
			(6
				(gEgo
					loop: 1
					posn: 317 137
					show:
					setMotion: MoveTo 240 120 self
				)
			)
			(7 (gEgo setHeading: 315 self))
			(8 (= ticks 30))
			(9
				(= local0 1)
				(tuckie setCel: 1 setCycle: End self)
			)
			(10
				(proc851_0 1 @local149 15 3 self)
			)
			(11
				(= local0 1)
				(proc851_0 1 @local153 9 2 self)
			)
			(12 (tuckie setCycle: End self))
			(13
				(aMonk loop: 5 cel: 0 setScript: chopChop self)
			)
			(14 (= ticks 120))
			(15
				(= local0 1)
				(tuckie setCel: 1 setCycle: End self)
			)
			(16
				(= local0 1)
				(proc851_0 2 @local157 15 3 @local2 1 self)
			)
			(17 (tuckie setCycle: End self))
			(18
				(aMonk loop: 5 cel: 0 setScript: chopChop self)
			)
			(19
				(gEgo setMotion: MoveTo 123 146 self)
			)
			(20
				(aMonk setScript: 0)
				(self dispose:)
			)
		)
	)
)

(instance chopChop of Script
	(properties)
	
	(method (dispose)
		(chopSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 2))
			(1
				(if (== (spankSound prevSignal?) -1)
					(= cycles 1)
				else
					(-- state)
					(= cycles 1)
				)
			)
			(2 (client setCycle: End self))
			(3
				(chopSound play:)
				(= ticks (* 10 (Random 7 12)))
			)
			(4 (client cel: 0) (= ticks 6))
			(5
				(if (== (spankSound prevSignal?) -1)
					(= cycles 1)
				else
					(-- state)
					(= cycles 1)
				)
			)
			(6 (client setCycle: End self))
			(7
				(chopSound play:)
				(= ticks (* 10 (Random 12 19)))
			)
			(8 (self dispose:))
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)

(instance chopSound of Sound
	(properties
		flags $0001
		number 152
	)
)

(instance spankSound of Sound
	(properties
		flags $0001
		number 153
	)
)
