;;; Sierra Script 1.0 - (do not remove this comment)
(script# 490)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n813)
(use n851)
(use n945)
(use n950)
(use n958)
(use n989)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	HedgeRow 0
	itsToLate 1
	runFerDoor 2
)

(local
	local0
	[local1 4] = [1490 7 1]
	[local5 4] = [1490 8 1]
	[local9 4] = [1490 14 1]
	[local13 9] = [431 0 2 4 23 34 24 25 1]
)
(procedure (localproc_0016 param1 param2)
	(return
		(if (< param2 param1)
			0
		else
			(+ 1 (localproc_0016 param1 (/ param2 param1)))
		)
	)
)

(class HedgeRow of Rm
	(properties
		script 0
		number 0
		timer 0
		keep 0
		initialized 0
		lookStr 0
		picture 490
		style $ffff
		horizon 0
		controls 0
		north 0
		east 0
		south 0
		west 0
		curPic 0
		picAngle 0
		vanishingX -4000
		vanishingY -6000
		obstacles 0
		teleX 0
		teleY 0
	)
	
	(method (init)
		(proc0_4)
		(if gTheNewDialog (gTheNewDialog dispose:))
		(if (> gHeading 85)
			(proc958_0 130 30 35 40 45 50 55 60 65 70 75 80 85)
			(proc958_0 128 500 12 13)
		)
		(gIconBar disable: 5)
		(proc806_3 DMZ)
		(++ global158)
		(cond 
			((or (== global130 5) (== global130 6)) (gEgo actions: egoMonkActions))
			((== global130 10) (gEgo actions: egoOutlawActions))
			(else (gEgo actions: egoHornActions))
		)
		(if (== gNewGuise 0)
			(proc0_2 gGEgoLoop 12 13)
		else
			(proc0_2 gGEgoLoop 25 26)
		)
		(if (== gNewGuise 0)
			(gEgoHead z: 22)
		else
			(gEgoHead z: 20)
		)
		(switch ((User alterEgo?) edgeHit?)
			(1 (self style: 14))
			(3 (self style: 13))
			(2 (self style: 12))
			(4 (self style: 11))
			(else  (self style: 100))
		)
		(gEgo setScript: egoEnters)
		(super init:)
		(self overlay: global11)
	)
	
	(method (doit)
		(gEgo
			priority: (localproc_0016 2 (gEgo onControl: 1))
			signal: (| (gEgo signal?) $0010)
		)
		(gEgoHead
			priority: (gEgo priority?)
			signal: (| (gEgoHead signal?) $0010)
		)
		(if
			(and
				(or
					(<= (gEgo x?) 2)
					(>= (gEgo x?) 317)
					(<= (gEgo y?) 2)
					(>= (gEgo y?) 187)
				)
				(> (gEgo priority?) 0)
			)
			(= gGEgoPriority (gEgo priority?))
			(= gGEgoLoop (gEgo loop?))
			(= gGEgoCel (gEgo cel?))
		)
		(if
		(and ((User alterEgo?) edgeHit?) (not (gEgo script?)))
			(proc0_3)
			(switch ((User alterEgo?) edgeHit?)
				(1
					(gClient newRoom: (+ global11 5))
				)
				(3
					(if (== global11 45)
						(if (== global130 10)
							(gEgo setScript: itsToLate)
						else
							(= global158 0)
							(gClient newRoom: 480)
						)
					else
						(gClient newRoom: (- global11 5))
					)
				)
				(2
					(gClient newRoom: (- global11 15))
				)
				(4
					(gClient newRoom: (+ global11 15))
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		((gClient obstacles?) eachElementDo: #dispose)
		(gRgnMusic fade: 0 30 8 1)
		(gIconBar enable: 5)
		(if (> global13 85)
			(DisposeScript 490 30 35 40 45 50 55 60 65 70 75 80 85)
		)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10
				(if (== global130 10)
					(proc13_4 1490 1 1)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(4
				(if
					(or
						(== param2 0)
						(== param2 2)
						(== param2 11)
						(== param2 14)
						(== param2 12)
						(== param2 10)
						(== param2 18)
						(== param2 13)
					)
					(proc13_4 1490 2 1)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(class Hedge of PicView
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		view 500
		loop 0
		cel 0
		priority -1
		signal $0000
		palette 0
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== loop 1)
					(proc13_4 1490 10 1)
				else
					(proc13_4 1490 0 1)
				)
			)
			(3
				(if (== loop 1)
					(proc13_4 1490 11 1)
				else
					(proc13_4 1490 12 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance hornSound of Sound
	(properties
		flags $0001
		number 904
	)
)

(instance DMZ of Feature
	(properties
		y 6
		nsBottom 12
		nsRight 319
	)
	
	(method (init)
		(gMH add: self)
		(gKH add: self)
		(super init:)
	)
	
	(method (dispose)
		(gMH delete: self)
		(gKH delete: self)
		(super dispose:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(== global19 0)
				(> gX 0)
				(< gX 319)
				(self onMe: pEvent)
			)
			(pEvent claimed: 1)
			(gEgo setScript: northToAlaska)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (not global143) (proc0_3))
				(cond 
					((== gHeading 500)
						(gEgo posn: 108 50 loop: 2 init:)
						(if (== gNewGuise 0)
							(gEgoHead z: 22)
						else
							(gEgoHead z: 20)
						)
						(= ticks 18)
					)
					((== gHeading 480)
						(if (< gGEgoX 160)
							(gEgo
								posn: 204 188
								normal: 1
								moveHead: 1
								init:
								setMotion: PolyPath 191 171 self
							)
						else
							(gEgo
								posn: 264 188
								normal: 1
								moveHead: 1
								init:
								setMotion: PolyPath 267 154 self
							)
						)
						(if (== gNewGuise 0)
							(gEgoHead z: 22)
						else
							(gEgoHead z: 20)
						)
					)
					(else
						(gEgo
							x:
								(switch ((User alterEgo?) edgeHit?)
									(1 gGEgoX)
									(3 gGEgoX)
									(2 0)
									(4 319)
									(else  (gClient teleX?))
								)
							y:
								(switch ((User alterEgo?) edgeHit?)
									(2 gGEgoY)
									(4 gGEgoY)
									(1 189)
									(3 0)
									(else  (gClient teleY?))
								)
							xStep: 3
							yStep: 2
							setPri: gGEgoPriority
							setCel: gGEgoCel
							normal: 1
							moveHead: 1
							init:
						)
						(if (== gNewGuise 0)
							(gEgoHead z: 22)
						else
							(gEgoHead z: 20)
						)
						(cond 
							((== ((User alterEgo?) edgeHit?) 3)
								(cond 
									((and (> (gEgo x?) 290) (== gHeading 50)) (gEgo setMotion: PolyPath 317 24 self))
									((and (== gHeading 50) (> (gEgo x?) 290)) (gEgo setMotion: PolyPath 314 27 self))
									(else
										(gEgo
											setMotion: PolyPath (+ (gEgo x?) 21) (+ (gEgo y?) 33) self
										)
									)
								)
							)
							((== ((User alterEgo?) edgeHit?) 1)
								(gEgo
									setMotion: PolyPath (- (gEgo x?) 7) (- (gEgo y?) 11) self
								)
							)
							((== ((User alterEgo?) edgeHit?) 2)
								(cond 
									((and (== gHeading 75) (< (gEgo y?) 78)) (gEgo setMotion: PolyPath 13 32 self))
									(
										(or
											(and
												(== gHeading 50)
												(< (gEgo y?) 150)
												(> (gEgo y?) 95)
											)
											(== gHeading 75)
											(and
												(== gHeading 55)
												(< (gEgo y?) 118)
												(> (gEgo y?) 88)
											)
											(and (== gHeading 65) (>= (gEgo y?) 60))
										)
										(= ticks 12)
									)
									(else
										(gEgo
											setMotion: PolyPath (+ (gEgo x?) 20) (gEgo y?) self
										)
									)
								)
							)
							((== ((User alterEgo?) edgeHit?) 4)
								(cond 
									((and (== gHeading 60) (< (gEgo y?) 70)) (gEgo setMotion: PolyPath 317 24 self))
									(
										(or
											(and
												(== gHeading 35)
												(< (gEgo y?) 150)
												(> (gEgo y?) 95)
											)
											(and (== gHeading 65) (> (gEgo y?) 120))
											(== gHeading 40)
											(== gHeading 60)
										)
										(= ticks 12)
									)
									((and (== gHeading 65) (< (gEgo y?) 78)) (gEgo setMotion: PolyPath 317 24 self))
									((and (== gHeading 30) (< (gEgo y?) 22)) (gEgo setMotion: PolyPath 314 27 self))
									(else
										(gEgo
											setMotion: PolyPath (- (gEgo x?) 20) (gEgo y?) self
										)
									)
								)
							)
							(else (= ticks 12))
						)
					)
				)
			)
			(1
				(proc0_4)
				(gIconBar disable: 5)
				(proc806_6 0)
				(cond 
					((and (== global130 10) (>= global158 11)) (gEgo setScript: itsToLate))
					(
						(and
							(== global130 10)
							(== global11 70)
							(< (gEgo y?) 75)
						)
						(gEgo setScript: thisIsIt)
					)
					((== gHeading 480)
						(gClient style: 100)
						(if (== global130 10)
							(gEgo setScript: hurryDay10)
						else
							(self dispose:)
						)
						(if (== gNewGuise 0)
							(gEgoHead z: 22)
						else
							(gEgoHead z: 20)
						)
					)
					(else (self dispose:))
				)
			)
		)
	)
)

(instance thisIsIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 116 52 self)
			)
			(1 (proc13_4 1490 13 self))
			(2
				(proc851_0 1 @local9 @local13 0 self)
			)
			(3 (proc13_4 1490 15 self))
			(4
				(proc0_4)
				(gIconBar disable: 0 5)
				(= seconds 5)
			)
			(5
				(if (global1 script?)
					(-- state)
					(= cycles 1)
				else
					(gEgo setScript: runFerDoor)
				)
			)
		)
	)
)

(instance runFerDoor of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 116 52 self)
			)
			(1
				(if (or (== global146 30) (== global146 40))
					(= local0 1)
					(proc13_4 1490 16 self)
				else
					(self cue:)
				)
			)
			(2
				(if local0
					(hornSound init: play: self)
				else
					(self cue:)
				)
			)
			(3
				(if local0
					(proc13_4 1490 17 self)
					(hornSound dispose:)
				else
					(self cue:)
				)
			)
			(4
				(gEgo setMotion: PolyPath 106 52 self)
			)
			(5
				(gEgo setMotion: PolyPath 106 49 self)
			)
			(6
				(= global158 0)
				(gClient newRoom: 501)
				(proc0_4)
			)
		)
	)
)

(instance hurryDay10 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 16))
			(1 (proc13_4 1490 3 self))
			(2 (proc13_4 1490 4 self))
			(3
				(proc851_0 1 @local1 @local13 0 self)
			)
			(4 (proc13_4 1490 6 self))
			(5 (proc0_4) (self dispose:))
		)
	)
)

(instance itsToLate of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(proc851_0 1 @local5 @local13 0 self)
			)
			(1 (proc13_4 1490 9 self))
			(2
				(proc806_1 -500 5)
				(= global145 40)
				(gClient newRoom: 170)
				(proc0_4)
			)
		)
	)
)

(instance northToAlaska of Script
	(properties)
	
	(method (doit)
		(if (gEgo edgeHit?)
			(proc0_4)
			(gEgo setMotion: 0 setScript: 0)
			(if (< (gEgo y?) 12) (gEgo posn: (gEgo x?) 0))
			(self dispose:)
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					signal: (| (gEgo signal?) $2000)
					setMotion: PolyPath gX -2 self
				)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance egoMonkActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 12))
				(proc13_1 490 0)
				1
			else
				0
			)
		)
	)
)

(instance egoOutlawActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 4)
			(switch param2
				(12 (proc13_1 490 1) 1)
				(1 (proc255_0 490 2 1))
			)
		)
	)
)

(instance egoHornActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(proc255_0 490 2)
				1
			else
				0
			)
		)
	)
)
