;;; Sierra Script 1.0 - (do not remove this comment)
(script# 601)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n813)
(use n851)
(use n945)
(use n949)
(use n958)
(use n968)
(use n970)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	Fens 0
	rgnBoat 1
	monk 2
	robin 3
	monkBoat 4
	proc601_5 5
	boatLooper 6
	egoActions 7
	stepInBoatAsOutlaw 8
	outlawAfterWisps 9
	pole 10
	proc601_11 11
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
	local8
	rgnBoatXStep
	rgnBoatYStep
	[local11 2]
	local13
	[local14 10]
	local24
	local25
	local26
	local27
	local28
	local29
	theRgnBoat
	[newWisp 208]
	[newFrenzy 12] = [0 0 0 0 0 0 0 0 1601 5 1]
	[local251 4] = [1601 98 1]
	[local255 4] = [1601 60 1]
	[local259 4] = [1601 65 1]
	[local263 4] = [1601 66 1]
	[local267 4] = [1601 67 1]
	[local271 4] = [1601 68 1]
	[local275 4] = [1601 69 1]
	[local279 4] = [1601 70 1]
	[local283 4] = [1601 71 1]
	[local287 4] = [1601 72 1]
	[local291 4] = [1601 73 1]
	[local295 4] = [1601 74 1]
	[local299 4] = [1601 7 1]
	[local303 4] = [1601 8 1]
	[local307 4] = [1601 77 1]
	[local311 6] = [1601 80 2 1 2]
	[local317 4] = [1601 83 1]
	[local321 5] = [1601 84 1 2]
	[local326 5] = [1601 95 1]
	[local331 5] = [1601 96 1]
	[local336 4] = [1601 79 1]
)
(procedure (proc601_5 param1)
	(return
		(if (and global132 (== local4 param1))
			(switch global11
				(590
					(rgnBoat
						view: 21
						loop: 2
						cel: 2
						posn: 84 112
						setPri: ((ScriptID 601 2) priority?)
						signal: 16384
						init:
					)
					(monk view: 585 setLoop: 1 setCel: 3 posn: 100 137 init:)
				)
				(600
					(rgnBoat view: 21 loop: 3 cel: 2 posn: 178 132 init:)
					(monk view: 585 loop: 2 cel: 3 posn: 151 159 init:)
				)
			)
			(= local24 1)
			(return 1)
		else
			(return 0)
		)
	)
)

(procedure (proc601_11 param1)
	(return
		(if (and (== global130 13) (== local4 param1))
			(switch global11
				(590
					(rgnBoat
						view: 21
						loop: 2
						cel: 2
						posn: 96 114
						setPri: ((ScriptID 601 2) priority?)
						ignoreActors: 1
						init:
					)
					(pole cel: 3 posn: 128 137 init:)
				)
				(600
					(rgnBoat
						view: 21
						loop: 2
						cel: 2
						posn: 98 132
						setPri: ((ScriptID 601 2) priority?)
						ignoreActors: 1
						init:
					)
					(pole cel: 3 posn: 133 156 init:)
				)
			)
			(= local24 1)
			(return 1)
		else
			(return 0)
		)
	)
)

(procedure (localproc_01cb &tmp temp0)
	(if (gNewCast contains: newWisp) (return))
	(switch global87
		(0 (= local13 4))
		(1 (= local13 6))
		(else  (= local13 8))
	)
	(if (and (== global11 610) (== global130 13))
		(= theRgnBoat (ScriptID 610 1))
		(= temp0 0)
		(while (< temp0 local13)
			(= [newWisp temp0] (Wisp new:))
			([newWisp temp0]
				setLoop: (Random 0 2)
				setStep: 10 10
				x: (+ (theRgnBoat x?) (Random 0 60))
				y: (+ (theRgnBoat y?) (Random 0 60))
				ignoreActors: 1
				init:
				setScript: (= [newFrenzy temp0] (frenzy new:))
			)
			(++ temp0)
		)
	else
		(wispCage init:)
		(= temp0 0)
		(while (< temp0 local13)
			(= [newWisp temp0] (Wisp new:))
			([newWisp temp0]
				x: (Random 35 305)
				y: (Random 86 134)
				setLoop: (Random 0 2)
				setStep: 2 2
				init:
				ignoreActors: 1
				observeBlocks: wispCage
				setMotion: Wander 230
			)
			(++ temp0)
		)
	)
	(gRgnMusic2 number: 582 loop: -1 play:)
)

(procedure (localproc_0317)
	(switch global87
		(0 (gEgo setStep: 5 3))
		(1 (gEgo setStep: 3 2))
		(else  (gEgo setStep: 2 1))
	)
)

(instance Fens of Rgn
	(properties
		keep 1
	)
	
	(method (init)
		(= local29 global34)
		(= global34 0)
		(super init:)
		(proc0_4)
		(if (== global115 1) (localproc_01cb))
		(if (!= (gRgnMusic number?) 585)
			(gRgnMusic number: 585 loop: -1 play:)
		)
		(if (!= (gSFX number?) 581)
			(gSFX number: 581 loop: -1 play:)
		)
		(if (== gHeading 700) (= local24 1))
	)
	
	(method (doit &tmp temp0)
		(asm
			lsg      global115
			ldi      1
			eq?     
			bnt      code_047e
			lsg      global19
			ldi      5
			ne?     
			bnt      code_047e
			lsg      global11
			ldi      610
			eq?     
			bnt      code_0476
			lal      local3
			bnt      code_0476
			ldi      0
			sal      local3
			ldi      0
			sat      temp0
code_044a:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_0461
			pushi    #show
			pushi    0
			lat      temp0
			lali     newWisp
			send     4
			+at      temp0
			jmp      code_044a
code_0461:
			pushi    #number
			pushi    1
			pushi    582
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      gRgnMusic2
			send     16
			jmp      code_057a
code_0476:
			pushi    0
			call     localproc_01cb,  0
			jmp      code_057a
code_047e:
			lsg      global115
			ldi      1
			ne?     
			bnt      code_04ef
			pushi    #contains
			pushi    1
			lsl      newWisp
			lag      gNewCast
			send     6
			bnt      code_04ef
			lal      local3
			not     
			bnt      code_04ef
			lsg      global11
			ldi      610
			eq?     
			bnt      code_04c2
			ldi      1
			sal      local3
			ldi      0
			sat      temp0
code_04a9:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_04e4
			pushi    #hide
			pushi    0
			lat      temp0
			lali     newWisp
			send     4
			+at      temp0
			jmp      code_04a9
			jmp      code_04e4
code_04c2:
			pushi    #dispose
			pushi    0
			lofsa    wispCage
			send     4
			ldi      0
			sat      temp0
code_04ce:
			lst      temp0
			lal      local13
			lt?     
			bnt      code_04e4
			pushi    #dispose
			pushi    0
			lat      temp0
			lali     newWisp
			send     4
			+at      temp0
			jmp      code_04ce
code_04e4:
			pushi    #stop
			pushi    0
			lag      gRgnMusic2
			send     4
			jmp      code_057a
code_04ef:
			pushi    #script
			pushi    0
			lag      gEgo
			send     4
			bnt      code_04fd
			jmp      code_057a
code_04fd:
			lal      local4
			bnt      code_0546
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      gNewCast
			send     6
			bnt      code_0546
			lsl      local27
			ldi      0
			eq?     
			bnt      code_0546
			pushi    15
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_052a
			pprev   
			ldi      305
			lt?     
code_052a:
			not     
			bnt      code_0546
			ldi      1
			sal      local27
			pushi    5
			pushi    1
			lea      @local255
			push    
			pushi    11
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_057a
code_0546:
			lal      local4
			bnt      code_057a
			pushi    #contains
			pushi    1
			lofsa    monk
			push    
			lag      gNewCast
			send     6
			bnt      code_057a
			lsl      local27
			ldi      1
			eq?     
			bnt      code_057a
			pushi    20
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_057a
			pprev   
			ldi      300
			lt?     
			bnt      code_057a
			ldi      0
			sal      local27
code_057a:
			pushi    #contains
			pushi    1
			lsl      newWisp
			lag      gNewCast
			send     6
			bnt      code_05a3
			pushi    161
			pushi    1
			pushi    #addAfter
			pushi    #distanceTo
			pushi    1
			lsl      newWisp
			lag      gEgo
			send     6
			push    
			ldi      3
			div     
			sub     
			push    
			lag      gRgnMusic2
			send     6
			jmp      code_05ab
code_05a3:
			pushi    #stop
			pushi    0
			lag      gRgnMusic2
			send     4
code_05ab:
			pushi    #doit
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (dispose)
		(if (!= (gSFX number?) 581) (gSFX stop:))
		(if gTheNewDialog (gTheNewDialog dispose:))
		(proc0_4)
		(= global34 local29)
		(proc958_0 0 968 970 949)
		(gRgnMusic2 fade: 0 20 12 1)
		(super dispose:)
	)
	
	(method (newRoom newRoomNumber)
		(if (not (proc999_5 newRoomNumber 590 600 610))
			(self keep: 0)
			(if
			(and (!= newRoomNumber 700) (!= newRoomNumber 620))
				(gRgnMusic2 fade: 0 30 8 1)
				(gRgnMusic fade: 0 30 8 1)
				(gSFX fade: 0 30 8 1)
			)
		)
	)
	
	(method (notify param1)
		(= local4 param1)
	)
)

(instance boatLooper of SmoothLooper
	(properties
		cycleSpeed 18
		vChangeDir 588
	)
)

(instance wispCage of Cage
	(properties)
	
	(method (init)
		(switch global11
			(590
				(self top: 85 bottom: 135 left: 10 right: 310)
			)
			(600
				(self top: 80 bottom: 145 left: 10 right: 310)
			)
			(610
				(self top: 15 bottom: 204 left: 10 right: 310)
			)
		)
		(super init:)
	)
)

(class Wisp of Actor
	(properties
		x 160
		y 100
		z 15
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
		yStep 2
		view 610
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $6000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 6
		script 0
		cycler 0
		timer 0
		detailLevel 0
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 6
		blocks 0
		baseSetter 0
		mover 0
		looper 0
		viewer 0
		avoider 0
		code 0
		cycCnt 0
	)
	
	(method (doit &tmp wispNextCel)
		(= cel
			(if
			(> (= wispNextCel (self nextCel:)) (self lastCel:))
				0
			else
				wispNextCel
			)
		)
		(super doit:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1601 0 0))
			(10 (proc13_4 1601 2 0))
			(3 (proc13_4 1601 1 0))
			(5
				(cond 
					((== global11 610) (gClient setScript: naiadPrinter 0 4))
					(local25 (= local8 9) (gClient setScript: naiadPrinter 0 8))
					((!= (gEgo view?) 587)
						(if (or (gNewCast contains: rgnBoat) local24)
							(gClient setScript: naiadPrinter 0 3)
						else
							(gClient setScript: wispsOfferBoat)
						)
					)
					(else (gClient setScript: naiadPrinter 0 4))
				)
			)
			(4
				(gEgo setScript: naiadPrinter 0 6)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (nextCel)
		(return
			(if (< (Abs (- gB_moveCnt cycCnt)) cycleSpeed)
				cel
			else
				(= cycCnt gB_moveCnt)
				(+ cel 1)
			)
		)
	)
)

(instance robin of Actor
	(properties)
	
	(method (doVerb theVerb param2)
		(if
			(not
				(if (IsObject (gEgo actions?))
					((gEgo actions?) doVerb: theVerb param2 &rest)
				)
			)
			(gEgo doVerb: theVerb param2 &rest)
		)
	)
)

(instance rgnBoat of Actor
	(properties
		view 21
		signal $7000
		xStep 2
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1601 61 0))
			(3
				(if (and local24 (!= global11 610))
					(if
					(or (== gNewGuise 6) (gNewCast contains: newWisp))
						(gClient setScript: (ScriptID 603 4))
					else
						(proc13_4 1601 100 1)
					)
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

(instance pole of Actor
	(properties
		view 15
		loop 5
		cel 3
		signal $4800
		cycleSpeed 12
		xStep 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1601 91))
			(3
				(rgnBoat doVerb: theVerb &rest)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bow of Prop
	(properties
		view 15
		loop 6
		signal $4800
		cycleSpeed 12
	)
)

(instance monk of Actor
	(properties
		view 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(cond 
					((== global11 610) (proc13_4 1601 62 0))
					(local26 (proc13_4 1601 63 0))
					(else (proc13_4 1601 64 0))
				)
			)
			(3
				(cond 
					((== global11 610) (proc851_0 1 @local259 11 0 0))
					((== (gEgo view?) 19) (proc851_0 1 @local259 11 0 0))
					(local24 (proc851_0 1 @local263 11 0 0))
					(else (super doVerb: theVerb &rest))
				)
			)
			(5
				(cond 
					((== global11 610)
						(switch local6
							(0
								(proc851_0 1 @local267 11 0 0)
							)
							(1
								(proc851_0 1 @local271 11 0 0)
							)
							(2
								(gClient setScript: (ScriptID 603 1))
							)
						)
						(++ local6)
					)
					(local24 (proc851_0 1 @local275 11 0 0))
					(else (super doVerb: theVerb &rest))
				)
			)
			(4
				(switch param2
					(0
						(proc851_0 1 @local279 11 0 0)
					)
					(2
						(proc851_0 1 @local283 11 0 0)
					)
					(10
						(proc851_0 1 @local287 11 0 0)
					)
					(5
						(proc851_0 1 @local291 11 0 0)
					)
					(6
						(proc851_0 1 @local295 11 0 0)
					)
					(else 
						(super doVerb: theVerb &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance wispsOfferBoat of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gIconBar disable: 3)
				(= local8 11)
				(self setScript: naiadPrinter self 1)
			)
			(1
				(if (and (== global130 13) (== gNewGuise 0))
					(client setScript: toTheKnight)
				else
					(self cue:)
				)
			)
			(2
				(if gTheNewDialog (gTheNewDialog dispose:))
				(if (proc851_1)
					(proc851_0 1 @local299 999 0 self)
				else
					(= state (+ state 3))
					(self cue:)
				)
			)
			(3 (= ticks 12))
			(4
				(= local8 19)
				(self setScript: naiadPrinter self 2)
			)
			(5
				(client setScript: wispsGoGetBoat)
			)
			(6
				(proc851_0 1 @local251 999 0 self)
			)
			(7
				(self setScript: naiadPrinter self 58)
			)
			(8
				(if gTheNewDialog (gTheNewDialog dispose:))
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance wispsGoGetBoat of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(gClient notify: 1)
				(= temp0 0)
				(while (< temp0 local13)
					([newWisp temp0] ignoreBlocks: wispCage setStep: 10 10)
					(if (or (== global11 590) (== local4 3))
						([newWisp temp0]
							setLoop: (Random 0 2)
							setMotion: MoveTo -10 90
						)
					else
						([newWisp temp0]
							setLoop: (Random 0 2)
							setMotion: MoveTo 330 95
						)
					)
					(++ temp0)
				)
				(= ticks 320)
			)
			(1
				(if (and (== gNewGuise 0) (== global130 13))
					(switch global11
						(590
							(rgnBoat
								setLoop: 2
								setCel: 2
								posn: 0 96
								init:
								setMotion: MoveTo 96 114 self
							)
							(pole posn: 32 123 init: setMotion: MoveTo 128 137)
						)
						(600
							(if (== local4 3)
								(rgnBoat
									setLoop: 2
									setCel: 2
									posn: -60 116
									init:
									setMotion: MoveTo 98 132 self
								)
								(pole posn: -28 143 init: setMotion: MoveTo 133 156)
							else
								(rgnBoat
									setLoop: 2
									setCel: 2
									posn: 349 98
									init:
									setMotion: MoveTo 98 132 self
								)
								(pole posn: 371 120 init: setMotion: MoveTo 133 156)
							)
						)
					)
					(= theRgnBoat rgnBoat)
					(= temp0 0)
					(while (< temp0 local13)
						([newWisp temp0]
							setStep: 10 10
							setScript: (= [newFrenzy temp0] (frenzy new:))
						)
						(++ temp0)
					)
				else
					(= local4 0)
					(= state (+ state 3))
					(self cue:)
				)
			)
			(2
				(= temp0 0)
				(while (< temp0 local13)
					(if (== global11 600)
						([newWisp temp0]
							setScript: 0
							setMotion: MoveTo (Random 15 305) (Random 95 135)
						)
					else
						([newWisp temp0]
							setScript: 0
							setMotion: MoveTo (Random 35 305) (Random 95 120)
						)
					)
					(++ temp0)
				)
				(= ticks 180)
			)
			(3
				(= temp0 0)
				(while (< temp0 local13)
					([newWisp temp0]
						setStep: 1 1
						observeBlocks: wispCage
						setMotion: Wander 230
					)
					(++ temp0)
				)
				(= ticks 30)
			)
			(4
				(= local24 1)
				(if (!= client toTheKnight) (proc0_4))
				(self dispose:)
			)
			(5
				(= local25 1)
				(= temp0 0)
				(while (< temp0 local13)
					([newWisp temp0]
						x: (if (== global11 590)
							(- (Random 0 50) 60)
						else
							(Random 330 370)
						)
						setMotion:
							MoveTo
							(if (== global11 590)
								(Random 50 305)
							else
								(Random 15 305)
							)
							(Random 86 134)
					)
					(++ temp0)
				)
				(= ticks 180)
			)
			(6
				(= temp0 0)
				(while (< temp0 local13)
					([newWisp temp0]
						setStep: 1 1
						observeBlocks: wispCage
						setMotion: Wander 230
					)
					(++ temp0)
				)
				(= local8 44)
				(self setScript: naiadPrinter self 5)
			)
			(7 (proc0_4) (self dispose:))
		)
	)
)

(instance frenzy of Script
	(properties)
	
	(method (doit)
		(if (> (theRgnBoat x?) 390)
			(client setMotion: MoveTo 330 (client y?) setScript: 0)
		)
		(super doit:)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(switch (= state newState)
			(0
				(= temp0 (if (== global11 610) 60 else 100))
				(= temp1 (if (== global11 610) 60 else 75))
				(= temp2 (+ (theRgnBoat x?) (Random 0 temp0)))
				(= temp3 (+ (theRgnBoat y?) (Random 0 temp1)))
				(client setMotion: MoveTo temp2 temp3 self)
			)
			(1
				(= state (- state 2))
				(self cue:)
			)
		)
	)
)

(instance toTheKnight of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if gTheNewDialog (gTheNewDialog dispose:))
				(proc851_0 1 @local303 999 0 self)
			)
			(1 (= seconds 2))
			(2
				(= local8 21)
				(self setScript: naiadPrinter self 3)
			)
			(3 (= cycles 1))
			(4
				(if (or (proc0_5 62) (proc0_5 51))
					(= local8 19)
					(self setScript: naiadPrinter self 2)
				else
					(= state (+ state 3))
					(self cue:)
				)
			)
			(5
				(self setScript: wispsGoGetBoat self)
			)
			(6
				(= local8 50)
				(self setScript: naiadPrinter self 6)
			)
			(7
				(gClient east: 620 west: 620)
				(proc0_4)
				(self dispose:)
			)
			(8
				(= local8 31)
				(self setScript: naiadPrinter self 4)
			)
			(9 (proc0_4) (self dispose:))
		)
	)
)

(instance outlawAfterWisps of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
				(and (gNewCast contains: newWisp) (== global130 13))
					(= local8 54)
					(self setScript: naiadPrinter self 7)
				else
					(self cue:)
				)
			)
			(1
				(localproc_0317)
				(gEgo
					view: 587
					setLoop: 0
					cycleSpeed: 24
					setCycle: Walk
					setMotion: MoveTo (+ (gEgo x?) 125) (- (gEgo y?) 40) self
				)
				(if
				(and (gNewCast contains: newWisp) (== global130 13))
					(= temp0 0)
					(while (< temp0 local13)
						([newWisp temp0]
							ignoreBlocks: wispCage
							setStep: 5 5
							setLoop: (Random 0 2)
							setMotion: MoveTo 330 95
						)
						(++ temp0)
					)
				)
			)
			(2 (gClient newRoom: 610))
		)
	)
)

(instance stepInBoatAsOutlaw of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== global11 600)
					(gEgo
						setPri: (- (gEgo priority?) 1)
						setMotion: MoveTo 133 156 self
					)
				else
					(gEgo
						setPri: (- (gEgo priority?) 1)
						setMotion: PolyPath 128 141 self
					)
				)
			)
			(1 (gEgo setHeading: 135 self))
			(2
				(gEgo
					view: 15
					loop: 2
					cel: 0
					cycleSpeed: 12
					y: (+ (gEgo y?) 2)
					setCycle: End self
				)
				(bow
					posn: (gEgo x?) (gEgo y?)
					setPri: (gEgo priority?)
					init:
					setCycle: End
				)
			)
			(3 (= ticks 30))
			(4
				(bow dispose:)
				(gEgo y: (+ (gEgo y?) 2) setCycle: Beg self)
				(pole
					posn: (gEgo x?) (gEgo y?)
					setPri: (gEgo priority?)
					setCycle: Beg
				)
			)
			(5
				(rgnBoat dispose:)
				(pole dispose:)
				(gEgo
					view: 587
					setPri: -1
					loop: 0
					cel: 0
					x: (if (== global11 590) 134 else 137)
					y: (if (== global11 590) 136 else 154)
				)
				(= ticks 6)
			)
			(6 (self dispose:))
		)
	)
)

(instance monkBoat of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					((gNewCast contains: monk) (proc851_0 1 @local336 11 0 self))
					(local4 (proc13_4 1601 78 self))
					(else
						(proc958_0 128 57 21)
						(self setScript: (ScriptID 3 0) self)
					)
				)
			)
			(1
				(cond 
					((or (gNewCast contains: monk) local4) (proc0_4) (self dispose:))
					(local4 (proc851_0 1 @local307 11 0 self))
					(else (self cue:))
				)
			)
			(2
				(if local4
					(proc0_4)
					(self dispose:)
				else
					(= seconds 3)
				)
			)
			(3
				(if (== global136 0) (proc806_1 25 85))
				(if (not local2)
					(= local2 1)
					(proc13_4 1601 59 self)
				else
					(self cue:)
				)
			)
			(4 (= seconds 3))
			(5
				(= local26 1)
				(gClient notify: 1)
				(if (== global11 600)
					(self setScript: (ScriptID 603 2) self)
				else
					(self setScript: (ScriptID 603 3) self)
				)
			)
			(6 (= ticks 12))
			(7
				(= local26 0)
				(= local24 1)
				(switch global136
					(0
						(proc851_0 2 @local311 999 0 11 3 self)
					)
					(1
						(proc851_0 1 @local317 11 0 self)
					)
					(2
						(proc851_0 2 @local321 999 0 11 3 self)
					)
				)
			)
			(8
				(if (== global136 2)
					(client setScript: (ScriptID 603 4))
				else
					(proc0_4)
					(++ global136)
					(Fens setScript: monkWaitTimer)
					(self dispose:)
				)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== (gEgo view?) 587) (proc13_4 1601 99 1) 1)
			)
			(4
				(switch param2
					(1
						(cond 
							((proc999_5 global11 590 600)
								(gEgo setScript: (ScriptID 603 0))
								(= global129 (GetTime 1))
								1
							)
							((== global11 610) (proc13_4 1601 89 0) 1)
						)
					)
					(12 (proc13_4 1601 90 0) 1)
					(5
						(if (== gNewGuise 6)
							(cond 
								((proc999_5 global11 590 600) (gClient setScript: monkBoat) 1)
								((and (== global11 610) (< (robin x?) 250)) (robin setScript: flutePlayer) 1)
							)
						)
					)
				)
			)
		)
	)
)

(instance flutePlayer of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= rgnBoatXStep (rgnBoat xStep?))
				(= rgnBoatYStep (rgnBoat yStep?))
				(rgnBoat setStep: 0 0)
				(monk setCycle: 0)
				(self setScript: (ScriptID 3 0) self)
			)
			(1
				(if local5
					(proc851_0 1 @local326 11 0 self)
				else
					(proc851_0 1 @local331 11 0 self)
				)
			)
			(2
				(if local5
					(gClient setScript: (ScriptID 603 1) 0 1)
				else
					(rgnBoat setStep: rgnBoatXStep rgnBoatYStep)
					(monk setCycle: Fwd)
					(= local5 1)
					(self dispose:)
				)
			)
		)
	)
)

(instance monkWaitTimer of Script
	(properties)
	
	(method (dispose)
		(= local4 (= global132 0))
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= global132 1)
				(= seconds
					(switch global87
						(0 180)
						(1 120)
						(2 90)
					))
			)
			(1 (self dispose:))
		)
	)
)

(instance naiadPrinter of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local1 global143)
				(proc0_3)
				(gIconBar disable: 8)
				(= cycles 1)
			)
			(1
				(proc13_6 30)
				(proc13_4
					1601
					(if local8 else register)
					self
					67
					(Random 15 200)
					(Random 5 100)
					80
					{Will-o-th'Wisps}
				)
				(if local8 (++ local8))
			)
			(2
				(if local8
					(if
						(<=
							local8
							(switch register
								(1 18)
								(2 20)
								(3 24)
								(4 43)
								(5 49)
								(6 53)
								(7 57)
								(8 10)
								(else  (proc255_0 601 0))
							)
						)
						(= state (- state 2))
					)
				)
				(self cue:)
			)
			(3
				(= local8 0)
				(if (not local1) (proc0_4))
				(gIconBar enable: 8)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
	
	(method (cue)
		(if (not notKilled)
			(proc13_6 0)
			(if (not local1) (proc0_4))
			(gIconBar enable: 8)
			(= local8 0)
			(self dispose:)
		)
		(super cue: &rest)
	)
)
