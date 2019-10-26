;;; Sierra Script 1.0 - (do not remove this comment)
(script# 120)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm120 0
	tree 1
	theStreet 2
	eastSide 3
	westSide 4
)

(local
	local0
	watTravelSect
	watWhichChar
	local3
	local4
	local5
	[local6 5] = [1120 41 1 1]
)
(procedure (localproc_001e)
	(Wat travelSect: (Wat section?))
	(global2 horizon: 30)
	(= local4 1)
	(switch (Wat whichChar?)
		(1
			(ScriptID 29)
			(proc958_0 128 112 393 792 752 4 5 7 745)
			(proc958_0 130 969 930 951)
		)
		(3
			(ScriptID 8)
			(proc958_0 128 113 393 792 752 4 5 7 745)
			(proc958_0 130 969 930 951)
		)
		(2
			(ScriptID 25)
			(proc958_0 130 969 930 951)
			(proc958_0 128 130 131 36 37 7 4)
		)
		(6
			(ScriptID 24)
			(proc958_0 128 132 133)
			(Load rsSCRIPT 930)
		)
		(7
			(ScriptID 26)
			(proc958_0 128 134 30 135 7)
			(proc958_0 130 951 969)
		)
		(4
			(ScriptID 27)
			(proc958_0 130 969 930 951)
			(proc958_0 128 4 5 15 122 124 128 167 42)
		)
		(5
			(ScriptID 28)
			(Load rsSCRIPT 930)
			(proc958_0 128 129 58 147 168 4)
		)
		(8
			(ScriptID 10)
			(proc958_0 128 125 123 60 792)
			(ScriptID 20)
			(ScriptID 19)
			(ScriptID 23)
			(proc958_0 128 151 152 160 161 154 155)
		)
	)
)

(procedure (localproc_022f &tmp temp0 temp1)
	(if (proc999_5 (Wat whichChar?) 1 2 3 5 4 7 6)
		(= watTravelSect 0)
	)
	(switch (Wat whichChar?)
		(1
			(Wat travelSect: (Wat section?))
			((ScriptID 29 0)
				view: 752
				posn: 205 65
				setLoop: 1
				setCel: 5
				init:
			)
			((ScriptID 29 1) posn: 197 73 setLoop: 3 setCel: 0 init:)
		)
		(2
			((ScriptID 25 0) posn: 205 70 loop: 2 cel: 5 init:)
		)
		(3
			((ScriptID 8 0)
				view: 752
				posn: 207 66
				setLoop: 1
				setCel: 5
				init:
			)
			((ScriptID 8 1) posn: 205 74 setLoop: 4 setCel: 0 init:)
		)
		(5
			(if (== (Wat travelDir?) 1)
				((ScriptID 28 0)
					posn: 135 125
					setLoop: 3
					setCel: 0
					init:
				)
			else
				((ScriptID 28 0) posn: 205 70 setLoop: 2 setCel: 0 init:)
			)
		)
		(4
			(if (== (Wat travelDir?) 1)
				((ScriptID 27 0)
					posn: 135 125
					setLoop: 6
					setCel: 0
					cycleSpeed: 60
					ignoreActors: 1
					init:
				)
			else
				((ScriptID 27 0)
					posn: 205 70
					setLoop: 4
					setCel: 0
					cycleSpeed: 60
					ignoreActors: 1
					init:
				)
			)
		)
		(7
			((ScriptID 26 0)
				view: 134
				ignoreActors: 1
				posn: 205 70
				loop: 4
				cel: 5
				init:
			)
		)
		(6
			((ScriptID 24 0)
				view: 132
				ignoreActors: 1
				posn: 205 70
				loop: 0
				cel: 0
				init:
				setCycle: End self
			)
		)
	)
	(if (> (Wat weMeetAgain?) 1)
		(proc958_0 128 792 393)
		(= temp0
			(cond 
				((proc999_5 (Wat section?) 1 2 5) 86)
				((proc999_5 (Wat section?) 3 4 6 7 8) 147)
				(else 297)
			)
		)
		(= temp1
			(cond 
				((proc999_5 (Wat section?) 1 2 5) 44)
				((proc999_5 (Wat section?) 3 4 6 7 8) 39)
				(else 38)
			)
		)
		(switch (Wat whichChar?)
			(1
				((ScriptID 29 2)
					posn: temp0 temp1
					setPri: (if (proc999_5 (Wat section?) 1 2 5) 1 else -1)
					init:
				)
			)
			(3
				((ScriptID 8 2)
					posn: temp0 temp1
					setPri: (if (proc999_5 (Wat section?) 1 2 5) 1 else -1)
					init:
				)
			)
		)
	)
)

(instance rm120 of Rm
	(properties
		picture 120
		style $000a
		horizon 20
		picAngle 60
		vanishingX 6720
		vanishingY -4000
	)
	
	(method (init &tmp theRm)
		(super init:)
		(proc121_0 1)
		(if (== global12 220)
			(switch global108
				(3
					(= local3 1)
					(Wat section: (+ (Wat section?) 1) enterDir: 1)
				)
				(1
					(= local3 1)
					(Wat section: (- (Wat section?) 1) enterDir: 3)
				)
				(2 (Wat enterDir: 4))
				(4 (Wat enterDir: 2))
			)
		)
		(proc806_3 eastSide westSide theStreet)
		(if (Wat script?)
			(switch (Wat travelDir?)
				(3
					(if (== global12 100) (Wat enterDir: 3))
					(if (>= (Wat section?) (Wat travelSect?))
						(localproc_001e)
					)
				)
				(1
					(if (== global12 100) (Wat enterDir: 1))
					(if (<= (Wat section?) (Wat travelSect?))
						(localproc_001e)
					)
				)
			)
		)
		(proc0_2)
		(Load rsVIEW (+ (gEgo view?) 1))
		(if
		(and (proc0_5 38) (not (proc0_5 27)) (proc0_5 136))
			(Wat charObj: (ScriptID 10 0))
			(global2 setScript: (ScriptID 10 1))
		else
			(= theRm 0)
			(if
				(and
					(Wat weMeetAgain?)
					(proc999_5 (Wat whichChar?) 1 3 2 5 4 7 6)
				)
				(= theRm self)
			)
			(if
				(and
					(Wat weMeetAgain?)
					(or
						(and
							(>= (Wat section?) (Wat travelSect?))
							(== (Wat travelDir?) 3)
							(!= (Wat enterDir?) 1)
						)
						(and
							(<= (Wat section?) (Wat travelSect?))
							(== (Wat travelDir?) 1)
							(!= (Wat enterDir?) 3)
						)
					)
				)
				(localproc_022f)
			)
			(gEgo setScript: walkIn theRm)
		)
		(if
			(or
				(!= (gRgnMusic number?) 490)
				(< (gRgnMusic vol?) 127)
			)
			(gRgnMusic number: 905 play:)
		)
	)
	
	(method (doit)
		(cond 
			((gEgo script?))
			((gEgo edgeHit?) (gEgo setScript: walkOut))
			(
				(and
					(not (Wat whichChar?))
					(>= (global2 horizon?) 30)
				)
				(global2 horizon: 20)
			)
			(
				(and
					(not (Wat offRoad?))
					(or (westSide onMe: gEgo) (eastSide onMe: gEgo))
				)
				(Wat offRoad: 1)
			)
			((Wat offRoad?)
				(if
					(not
						(if (westSide onMe: gEgo) else (eastSide onMe: gEgo))
					)
					(Wat offRoad: 0)
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gEgo actions: 0)
		(if global25 (global25 dispose:))
		(proc958_0 0 29 8)
		(super dispose:)
	)
	
	(method (newRoom newRoomNumber)
		(if (and (Wat whichChar?) (not (Wat script?)))
			(Wat setScript: (Wat theTimer?))
		)
		(super newRoom: newRoomNumber)
	)
	
	(method (notify)
		(gEgo actions: rm120Actions)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7)
		(switch (= state newState)
			(0
				(gEgo actions: rm120Actions)
				(if local4
					(= temp0 225)
					(= temp1 60)
					(= temp4 205)
					(= temp5 75)
					(= temp2 110)
					(= temp3 130)
					(= temp6 140)
					(= temp7 115)
				else
					(= temp0 286)
					(= temp1 -2)
					(= temp4 230)
					(= temp5 55)
					(= temp2 -14)
					(= temp3 237)
					(= temp6 40)
					(= temp7 183)
				)
				(if (and watWhichChar (IsObject (Wat charObj?)))
					(= temp6 140)
					(= temp7 120)
					(= temp4 190)
					(= temp5 85)
				)
				(proc0_3)
				(switch (Wat enterDir?)
					(0
						(gEgo posn: 330 200 init: setMotion: MoveTo 230 170 self)
					)
					(4
						(if
						(and (== (Wat section?) 9) (== (Wat enterDir?) 4))
							(gEgo
								posn: -15 145
								loop: 0
								init:
								setMotion: PolyPath 100 145 self
							)
						else
							(gEgo
								posn: -15 85
								loop: 0
								init:
								setMotion: PolyPath 39 85 self
							)
						)
					)
					(1
						(if local3
							(= local3 0)
							(gEgo posn: -15 28 init: setMotion: MoveTo 168 51 self)
						else
							(gEgo
								posn: temp0 temp1
								loop: 5
								init:
								setMotion: MoveTo temp4 temp5 self
							)
						)
					)
					(2
						(gEgo
							posn: 330 177
							loop: 1
							init:
							setMotion: PolyPath 295 177 self
						)
					)
					(3
						(if local3
							(= local3 0)
							(gEgo posn: 330 200 init: setMotion: MoveTo 230 170 self)
						else
							(gEgo
								loop: 6
								posn: temp2 temp3
								init:
								setMotion: MoveTo temp6 temp7 self
							)
						)
					)
				)
				(if local4
					(= local4 0)
					(switch (Wat whichChar?)
						(1
							(Wat charObj: (ScriptID 29 1))
							(global2 setScript: (ScriptID 29 3))
						)
						(3
							(Wat charObj: (ScriptID 8 1))
							(global2 setScript: (ScriptID 8 3))
						)
						(2
							(Wat charObj: (ScriptID 25 0))
							(global2 setScript: (ScriptID 25 1))
						)
						(6
							(Wat charObj: (ScriptID 24 0))
							(global2 setScript: (ScriptID 24 1))
						)
						(7
							(Wat charObj: (ScriptID 26 0))
							(global2 setScript: (ScriptID 26 1))
						)
						(4
							(Wat charObj: (ScriptID 27 0))
							(global2 setScript: (ScriptID 27 1))
						)
						(5
							(Wat charObj: (ScriptID 28 0))
							(global2 setScript: (ScriptID 28 1))
						)
					)
				)
				(if (and (proc0_5 38) (not (proc0_5 27)))
					((ScriptID 20)
						posn: 335 125
						init:
						setCycle: StopWalk 161
						setMotion: MoveTo 250 125
					)
				)
				(if (and (== global130 11) (>= global155 20))
					(client setScript: toTheBattle)
				)
			)
			(1
				(proc0_2)
				(if (and (proc0_5 38) (not (proc0_5 27)))
					(Wat charObj: (ScriptID 10 0))
					(global2 setScript: (ScriptID 10 1))
					(= ticks 12)
				else
					(if (not (IsObject (Wat charObj?))) (proc0_4))
					(self dispose:)
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(= register (gEgo edgeHit?))
				(Wat enterDir: 0)
				(switch register
					(2
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 15) (gEgo y?) self
						)
					)
					(3
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 40) (+ (gEgo y?) 50) self
						)
						(if (and (== global130 11) (proc0_5 64))
							(++ global155)
						)
					)
					(4
						(if (> (gEgo y?) 145)
							(gEgo
								setMotion: PolyPath (- (gEgo x?) 40) (+ (gEgo y?) 50) self
							)
							(= register 3)
						else
							(gEgo
								setMotion: PolyPath (- (gEgo x?) 15) (gEgo y?) self
							)
						)
					)
					(1
						(if (< (gEgo x?) 170)
							(gEgo setMotion:)
						else
							(gEgo
								ignoreHorizon: 1
								setMotion: PolyPath (+ (gEgo x?) 40) -2 self
							)
							(if (and (== global130 11) (proc0_5 64))
								(++ global155)
							)
						)
					)
				)
			)
			(1
				(if local5
					(= local5 0)
					((ScriptID 10 0) dispose: delete:)
					((ScriptID 10 4) dispose: delete:)
					((ScriptID 10 2) dispose: delete:)
					((ScriptID 10 3) dispose: delete:)
				)
				(switch register
					(2
						(if
							(or
								(and (== global130 12) (proc0_5 27))
								(and (== global130 4) (proc0_5 48) (proc0_5 47))
							)
							(global2 newRoom: 160)
						else
							(if
								(and
									(IsObject (Wat charObj?))
									(not (& ((Wat charObj?) signal?) $0020))
								)
								(proc0_6 70)
							)
							(if (== (Wat section?) 4)
								(if (Wat whichChar?)
									(Wat
										setScript: (Wat theTimer?)
										hurry: 1
										charObj: 0
										travelSect:
											(if (== (Wat travelDir?) 3)
												(+ (Wat travelSect?) 1)
											else
												(- (Wat travelSect?) 1)
											)
									)
								)
								(global2 newRoom: 110)
							else
								(= global116 1)
								(global2 newRoom: 220)
							)
						)
					)
					(4
						(if
							(or
								(and (== global130 12) (proc0_5 27))
								(and (== global130 4) (proc0_5 48) (proc0_5 47))
							)
							(global2 newRoom: 160)
						else
							(if
								(and
									(IsObject (Wat charObj?))
									(not (& ((Wat charObj?) signal?) $0020))
								)
								(proc0_6 70)
							)
							(global2 newRoom: 220)
						)
					)
					(1
						(cond 
							((<= (Wat section?) 1)
								(if
									(or
										(and (== global130 12) (proc0_5 27))
										(and (== global130 4) (proc0_5 48) (proc0_5 47))
									)
									(global2 newRoom: 160)
								else
									(global2 newRoom: 100)
								)
							)
							((and (== global130 12) (gEgo has: 9)) (global2 newRoom: 160))
							(else
								(if (IsObject (Wat charObj?))
									((Wat charObj?) dispose:)
									(Wat charObj: 0)
									(= watTravelSect (Wat travelSect?))
									(= watWhichChar (Wat whichChar?))
									(if (== (Wat travelDir?) 3)
										(Wat
											travelSect: (+ (Wat travelSect?) 1)
											setScript: (Wat theTimer?)
											hurry: 1
										)
									)
								)
								(if (proc999_5 global112 39 40 54 55 101 102)
									(= global112 (- global112 15))
								else
									(= global112 (- global112 16))
								)
								(global10 eachElementDo: #dispose release:)
								((global2 obstacles?) eachElementDo: #dispose release:)
								(= cycles 2)
							)
						)
						(Wat section: (- (Wat section?) 1))
					)
					(3
						(cond 
							((>= (Wat section?) 9)
								(if
									(or
										(and (== global130 12) (proc0_5 27))
										(and (== global130 4) (proc0_5 48) (proc0_5 47))
									)
									(global2 newRoom: 160)
								else
									(global2 newRoom: 100)
								)
							)
							((and (== global130 12) (gEgo has: 9)) (global2 newRoom: 160))
							(else
								(if (IsObject (Wat charObj?))
									((Wat charObj?) dispose:)
									(Wat charObj: 0)
									(= watTravelSect (Wat travelSect?))
									(= watWhichChar (Wat whichChar?))
									(if (== (Wat travelDir?) 1)
										(Wat
											travelSect: (- (Wat travelSect?) 1)
											setScript: (Wat theTimer?)
											hurry: 1
										)
									)
								)
								(if (proc999_5 global112 24 25 39 40 86 87)
									(= global112 (+ global112 15))
								else
									(= global112 (+ global112 16))
								)
								(global10 eachElementDo: #dispose release:)
								((global2 obstacles?) eachElementDo: #dispose release:)
								(= cycles 2)
							)
						)
						(Wat section: (+ (Wat section?) 1))
					)
				)
			)
			(2
				(if (== register 1)
					(Wat enterDir: 3)
				else
					(Wat enterDir: 1)
				)
				(if (proc999_5 register 1 3)
					(if
						(and
							(Wat weMeetAgain?)
							(or
								(and
									(>= (Wat section?) (Wat travelSect?))
									(== (Wat travelDir?) 3)
									(!= (Wat enterDir?) 1)
								)
								(and
									(<= (Wat section?) (Wat travelSect?))
									(== (Wat travelDir?) 1)
									(!= (Wat enterDir?) 3)
								)
							)
						)
						(localproc_022f)
					)
					(if
						(and
							(== (Wat section?) 4)
							(proc0_5 27)
							(== global130 12)
						)
						(= local5 1)
						((ScriptID 10 0)
							loop: 1
							cel: 5
							posn: 214 91
							z: 0
							init:
							stopUpd:
						)
						((ScriptID 10 4) posn: 125 55 cel: 2 init: stopUpd:)
						((ScriptID 10 2) init:)
						((ScriptID 10 3)
							y: (- ((ScriptID 10 3) y?) 10)
							z: (- ((ScriptID 10 3) z?) 10)
							init:
						)
					)
					(global2 drawPic: 120 (if (proc0_5 0) 10 else -32760))
					(proc121_0 1)
				)
				(= cycles 2)
			)
			(3
				(= temp0 0)
				(if
					(and
						(Wat weMeetAgain?)
						(or
							(and
								(>= (Wat section?) (Wat travelSect?))
								(== (Wat travelDir?) 3)
								(!= (Wat enterDir?) 1)
							)
							(and
								(<= (Wat section?) (Wat travelSect?))
								(== (Wat travelDir?) 1)
								(!= (Wat enterDir?) 3)
							)
						)
					)
					(switch watWhichChar
						(1
							(Wat charObj: (ScriptID 29 1))
							(global2 setScript: (ScriptID 29 3))
						)
						(3
							(Wat charObj: (ScriptID 8 1))
							(global2 setScript: (ScriptID 8 3))
						)
						(2
							(Wat charObj: (ScriptID 25 0))
							(global2 setScript: (ScriptID 25 1))
						)
						(5
							(Wat charObj: (ScriptID 28 0))
							(global2 setScript: (ScriptID 28 1))
						)
						(4
							(Wat charObj: (ScriptID 27 0))
							(global2 setScript: (ScriptID 27 1))
						)
						(7
							(Wat charObj: (ScriptID 26 0))
							(global2 setScript: (ScriptID 26 1))
						)
						(6
							(Wat charObj: (ScriptID 24 0))
							(global2 setScript: (ScriptID 24 1))
						)
					)
					(= temp0 global2)
				)
				(client setScript: walkIn temp0)
			)
		)
	)
)

(instance toTheBattle of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				((ScriptID 19)
					posn: 335 125
					init:
					setCycle: StopWalk 152
					setMotion: MoveTo 250 125 self
				)
			)
			(1
				(proc0_9 (ScriptID 19) gEgo)
				(proc0_9 gEgo (ScriptID 19))
				(= seconds 3)
			)
			(2
				(proc851_0 1 @local6 13 0 self)
			)
			(3 (= seconds 3))
			(4
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 9)
				(= ticks 100)
			)
			(5 (proc13_4 1120 43 self))
			(6
				(= global146 65)
				(global2 newRoom: 176)
			)
		)
	)
)

(instance theStreet of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb &tmp temp0)
		(= temp0
			(cond 
				((not (gEgo script?)) gEgo)
				((not (global2 script?)) global2)
				(else global1)
			)
		)
		(switch theVerb
			(2
				(switch (Wat section?)
					(1
						(temp0 setScript: doubleMessage 1 0)
					)
					(2
						(temp0 setScript: doubleMessage 1 2)
					)
					(3
						(temp0 setScript: doubleMessage 1 4)
					)
					(4
						(temp0 setScript: doubleMessage 1 6)
					)
					(5 (proc13_4 1120 8 1))
					(6
						(temp0 setScript: doubleMessage 1 9)
					)
					(7
						(temp0 setScript: doubleMessage 1 11)
					)
					(8
						(temp0 setScript: doubleMessage 1 13)
					)
					(9
						(temp0 setScript: doubleMessage 1 15)
					)
				)
			)
			(10
				(if (== (Wat qFight?) 4660)
					0
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

(instance eastSide of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 150 189 319 18 319 189
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb &tmp temp0)
		(= temp0
			(cond 
				((not (gEgo script?)) gEgo)
				((not (global2 script?)) global2)
				(else global1)
			)
		)
		(if (== theVerb 2)
			(switch (Wat section?)
				(1 (proc13_4 1120 17 1))
				(2 (proc13_4 1120 18 1))
				(3 (proc13_4 1120 19 1))
				(4
					(temp0 setScript: doubleMessage 1 20)
				)
				(5 (proc13_4 1120 22 1))
				(6 (proc13_4 1120 23 1))
				(7 (proc13_4 1120 24 1))
				(8 (proc13_4 1120 25 1))
				(9 (proc13_4 1120 26 1))
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance westSide of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 0 227 0 0 130
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(switch (Wat section?)
				(1 (proc13_4 1120 27 1))
				(2 (proc13_4 1120 28 1))
				(3 (proc13_4 1120 29 1))
				(4 (proc13_4 1120 30 1))
				(5 (proc13_4 1120 31 1))
				(6 (proc13_4 1120 32 1))
				(7 (proc13_4 1120 33 1))
				(8 (proc13_4 1120 34 1))
				(9 (proc13_4 1120 35 1))
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance doubleMessage of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_4 1120 register self)
			)
			(1
				(proc13_4 1120 (+ register 1) self)
			)
			(2 (self dispose:))
		)
	)
	
	(method (cue)
		(if (not notKilled)
			(self dispose:)
			(global1 setCursor: 1 1)
		else
			(super cue: &rest)
		)
	)
)

(instance tree of PicView
	(properties
		signal $1000
	)
	
	(method (handleEvent pEvent)
		(if (and (self onMe: pEvent) (gEgo onMe: pEvent))
			(pEvent claimed: 0)
			(gEgo handleEvent: pEvent)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb)
		(cond 
			(
			(or (eastSide onMe: self) (> x 319) (> y 189)) (eastSide doVerb: theVerb))
			((or (westSide onMe: self) (< x 0)) (westSide doVerb: theVerb))
			(else (theStreet doVerb: theVerb))
		)
	)
)

(instance rm120Actions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(if local0
					(= local0 0)
					(proc13_4 1120 39)
				else
					(= local0 1)
					(proc13_4 1120 40)
				)
				1
			else
				0
			)
		)
	)
)
