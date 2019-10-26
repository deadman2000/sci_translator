;;; Sierra Script 1.0 - (do not remove this comment)
(script# 11)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n255)
(use n858)
(use n958)
(use n989)
(use n992)
(use n999)

(public
	monkFight 0
	overlayDisposer 1
)

(local
	local0
	local1
	local2
	theThudAndGroanSound
	[local4 64] = [40 27 8 8 0 0 0 0 30 16 7 47 0 0 0 0 18 23 33 8 0 0 0 0 16 29 20 4 0 0 0 0 100 100 100 100 42 32 20 21 100 100 100 100 30 19 26 31 100 100 100 100 10 10 35 23 100 100 100 100 10 50 10 5]
)
(procedure (localproc_0012 &tmp [temp0 200])
	(if local0 (Format @temp0 &rest) (proc13_1 @temp0))
)

(procedure (localproc_002d param1 param2)
	(proc999_3
		24
		(proc999_2
			(+
				(* 36 global87)
				(switch global125
					(1 1)
					(2 0)
					(3 6)
					(4 12)
				)
			)
			(*
				param1
				6
				(if (== param2 rob)
					30
				else
					(- 32
						(switch global125
							(1 0)
							(2 25)
							(3 25)
							(4 32)
						))
				)
			)
		)
	)
)

(instance defenseOddsCode of Code
	(properties)
	
	(method (doit param1 param2)
		(return (- (((param1 client?) fight?) success: param2 param1)))
	)
)

(instance attackOddsCode of Code
	(properties)
	
	(method (doit param1 param2)
		(if
		(!= ((param1 target?) client?) (param1 client?))
			(((param1 client?) fight?) success: param1 param2)
		)
	)
)

(instance attackStrengthCode of Code
	(properties)
	
	(method (doit param1)
		(param1 _strength?)
	)
)

(instance RandForward of Fwd
	(properties)
	
	(method (nextCel &tmp clientCel theClientCel)
		(= clientCel (client cel?))
		(if
			(and
				(!= (= theClientCel (super nextCel: &rest)) clientCel)
				(<= (Random 1 100) 60)
			)
			(= theClientCel clientCel)
		)
		(return theClientCel)
	)
)

(instance qsp of Script
	(properties)
	
	(method (init)
		(if (or argc (not (client script?)))
			(super init: &rest)
		)
	)
	
	(method (doit)
		(if
			(and
				(== seconds cycles)
				(== cycles ticks)
				(== ticks (client technique:))
				(== (client technique:) 0)
			)
			(= ticks 1)
		)
		(super doit: &rest)
	)
	
	(method (changeState newState &tmp clientOpponent temp1 temp2 client_technique)
		(switch (= state newState)
			(0
				(= cycles (= ticks 0))
				(= client_technique (client _technique?))
				(= temp2
					(if
						(= temp1
							(if (= clientOpponent (client opponent?))
								((= clientOpponent (client opponent?)) _technique?)
							)
						)
						((= temp1
							(if (= clientOpponent (client opponent?))
								((= clientOpponent (client opponent?)) _technique?)
							)
						)
							target?
						)
					else
						0
					)
				)
				(cond 
					((client _technique?))
					((or (not temp2) (<= (temp1 state?) 0))
						(cond 
							(
								(and
									(== global125 4)
									(or
										(clientOpponent parriedCycles?)
										(clientOpponent ticks?)
									)
								)
								(= client_technique
									((client techniques:) maxElement: attackStrengthCode)
								)
								(client technique: client_technique self)
							)
							(
								(or
									(clientOpponent parriedCycles?)
									(<= (Random 0 100) (/ (* 100 global125) 4))
								)
								(repeat
									(= client_technique
										((client techniques:)
											at: (Random 0 (- ((client techniques:) size?) 1))
										)
									)
									(localproc_0012 11 0 (client_technique name?))
									(breakif
										(!= client ((client_technique target?) client?))
									)
								)
								(localproc_0012 11 1 (client_technique name?))
								(client technique: client_technique self)
							)
						)
					)
					(temp2
						(if (== client (temp2 client?))
							(= client_technique
								((client techniques:) maxElement: defenseOddsCode temp1)
							)
							(client technique: client_technique self)
						else
							(= client_technique
								((client techniques:) maxElement: attackOddsCode temp1)
							)
							(client technique: client_technique self)
						)
					)
				)
				(if (not client_technique) (= ticks 1))
			)
			(1
				(= ticks (* 6 (client moveSpeed?)))
			)
			(2 (self init:))
		)
	)
)

(class qsPart of Part
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
		client 0
		_strength 0
	)
	
	(method (onMe &tmp theNsRight clientX temp2)
		(= clientX (client x?))
		(= theNsRight
			(/ (+ clientX (= temp2 ((client opponent?) x?))) 2)
		)
		(if (<= clientX temp2)
			(= nsLeft (- (client nsLeft?) 10))
			(= nsRight theNsRight)
		else
			(= nsLeft theNsRight)
			(= nsRight (+ (client nsRight?) 10))
		)
		(super onMe: &rest)
	)
	
	(method (strength &tmp temp0)
		(return
			(/
				(*
					(= temp0
						(if (and (not argc) (== client monk))
							(switch global125
								(1 0)
								(2 25)
								(3 25)
								(4 32)
							)
						else
							32
						)
					)
					(super strength: &rest)
				)
				32
			)
		)
	)
)

(class QSFighter of Fighter
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
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $0000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 9
		script 0
		cycler 0
		timer 0
		detailLevel 0
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 9
		blocks 0
		baseSetter 0
		mover 0
		looper 0
		viewer 0
		avoider 0
		code 0
		fight 0
		opponent 0
		ticks 0
		lastTicks 0
		idleCycles 0
		parriedCycles 0
		_parts 0
		_techniques 0
		_plan 0
		_technique 0
		_strength 0
	)
	
	(method (init)
		(self setLoop: 0 ignoreActors: illegalBits: 0)
		(super init: &rest)
	)
	
	(method (setCycle theCycler &tmp temp0)
		(= temp0 (if argc theCycler else 0))
		(if (and cycler (cycler caller?))
			((cycler caller?) cue:)
		)
		(super setCycle: temp0 &rest)
	)
	
	(method (agonize param1 param2)
		(if _technique (self technique: 0))
		(cond 
			(
			(or (<= _strength 0) (<= (param2 strength:) 0)) (self setScript: (Clone getKilled)))
			((not script) (self setScript: (Clone getHit)))
		)
		(= ticks
			(proc999_3
				parriedCycles
				ticks
				(localproc_002d (param1 strength:) self)
			)
		)
		(= ticks (* ticks 3))
		(= parriedCycles 0)
	)
	
	(method (inflict param1 &tmp temp0 opponentLoop)
		(= temp0
			(if (opponent script?)
			else
				(super inflict: param1 &rest)
			)
		)
		(if parriedCycles
			(= parriedCycles (localproc_002d parriedCycles self))
		)
		(if theThudAndGroanSound (theThudAndGroanSound dispose:))
		(= opponentLoop (opponent loop?))
		(cond 
			((== self ((param1 target?) client?)) (= theThudAndGroanSound 0))
			(temp0 ((= theThudAndGroanSound thudAndGroanSound) play:))
			(
				(or
					(and (== loop 2) (== opponentLoop 6))
					(and (== loop 4) (== opponentLoop 8))
				)
				((= theThudAndGroanSound swishSound) play:)
			)
			((not (opponent technique:)) ((= theThudAndGroanSound thudSound) play:))
			(else ((= theThudAndGroanSound woodHitsWoodSound) play:))
		)
	)
)

(instance thudAndGroanSound of Sound
	(properties
		flags $0001
		number 935
	)
)

(instance thudSound of Sound
	(properties
		flags $0001
		number 588
	)
)

(instance swishSound of Sound
	(properties
		flags $0001
		number 934
	)
)

(instance woodHitsWoodSound of Sound
	(properties
		flags $0001
		number 122
	)
)

(instance overlayDisposer of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(thudAndGroanSound dispose:)
				(thudSound dispose:)
				(swishSound dispose:)
				(woodHitsWoodSound dispose:)
				(caller cue:)
				(rob dispose:)
				(monk dispose:)
				(= ticks 1)
			)
			(1
				(proc958_0 0 858 893)
				(self dispose:)
			)
		)
	)
)

(instance monkFight of Fight
	(properties)
	
	(method (init param1 &tmp temp0)
		(if argc
			(= local2 global77)
			(= global77 0)
			(gMH addToFront: rob)
			(gDH addToFront: rob)
			(gKH addToFront: rob)
		)
		(= local1 global125)
		(robMidHit success: 36 setTarget: monkBody)
		(robHighHit success: 23 setTarget: monkHead)
		(robLowHit success: 52 setTarget: monkLegs)
		(robOverHit success: 11 setTarget: monkOverHead)
		(robMidBlk setTarget: robBody)
		(robHighBlk setTarget: robOverHead)
		(robDuck setTarget: robHead)
		(robJump setTarget: robLegs)
		(rob x: 145 y: 100)
		(monkMidHit success: 36 setTarget: robBody)
		(monkHighHit success: 23 setTarget: robHead)
		(monkLowHit success: 52 setTarget: robLegs)
		(monkOverHit success: 11 setTarget: robOverHead)
		(monkMidBlk setTarget: monkBody)
		(monkHighBlk setTarget: monkOverHead)
		(monkDuck setTarget: monkHead)
		(monkJump setTarget: monkLegs)
		(monk x: 162 y: 97)
		(if argc
			(super init: param1 rob monk @local4 &rest)
		else
			(super init:)
		)
		((rob parts:) eachElementDo: #strength 30)
		((monk parts:)
			eachElementDo:
				#strength
				(switch global125
					(1 0)
					(2 25)
					(3 25)
					(4 32)
				)
		)
		(rob _strength: (/ (* 67 (robBody _strength?)) 100))
		(monk
			_strength:
				(/
					(*
						(switch global125
							(1 100)
							(2 45)
							(3 61)
							(4 88)
						)
						(monkBody _strength?)
					)
					100
				)
		)
		(if (== global125 1)
			(rob setScript: cheatWin)
		else
			(monk plan: qsp)
		)
		(global1 setCursor: 10 1 (monk x?) (- (monk y?) 53))
	)
	
	(method (doit)
		(if
			(and
				(!= global125 local1)
				(!= (rob loop?) 10)
				(!= (monk loop?) 10)
			)
			(self init:)
		)
		(= local1 global125)
		(super doit: &rest)
	)
	
	(method (dispose)
		(= global77 local2)
		(gMH delete: rob)
		(gDH delete: rob)
		(gKH delete: rob)
		(super dispose:)
	)
	
	(method (changeState newState &tmp theCaller)
		(switch (= state newState)
			(0)
			(1 (= ticks 1))
			(2
				(= theCaller caller)
				(= caller 0)
				(client setScript: overlayDisposer theCaller)
			)
		)
	)
)

(instance cheatWin of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(rob technique: robOverHit self)
			)
			(1)
			(2 (self dispose:))
		)
	)
)

(instance rob of QSFighter
	(properties
		view 122
	)
	
	(method (init &tmp temp0)
		(if (= temp0 (== _parts 0))
			(self
				ignoreActors:
				parts: robOverHead robHead robBody robLegs
				techniques:
					robMidBlk
					robHighBlk
					robDuck
					robJump
					robMidHit
					robLowHit
					robHighHit
					robOverHit
			)
		)
		(self loop: 0 setCycle: (Clone RandForward))
		(_techniques name: {robTechs})
		(_parts name: {robParts} eachElementDo: #strength 30)
		(super init: &rest)
	)
	
	(method (doit &tmp temp0 temp1)
		(if
		(not (if (or _technique cycler) else (<= _strength 0)))
			(self loop: 0 setCycle: (Clone RandForward))
		)
		(super doit: &rest)
		(cond 
			(
				(and
					(not
						(= temp0
							(if
							(and (not ticks) (not parriedCycles) _technique)
								(_technique ticks?)
							)
						)
					)
					(== global19 global21)
				)
				(global1 setCursor: 10)
			)
			((and parriedCycles (!= global19 global21)) (global1 setCursor: global21))
		)
	)
	
	(method (handleEvent pEvent &tmp opponentTechnique)
		(cond 
			(
				(and
					(== (pEvent type?) evKEYBOARD)
					(== (pEvent message?) JOY_UPRIGHT)
				)
				(= local0 (not local0))
			)
			(
				(and
					(not (if ticks else parriedCycles))
					(or
						(and
							(== (pEvent type?) evJOYSTICK)
							(== (pEvent message?) JOY_NULL)
						)
						(and
							(== (pEvent type?) evKEYBOARD)
							(== (pEvent message?) KEY_5)
						)
						(and
							(== global125 2)
							(== (pEvent type?) evMOUSEBUTTON)
							(self onMe: pEvent)
						)
					)
					(= opponentTechnique (opponent technique:))
					(==
						self
						(((= opponentTechnique (opponent technique:)) target?)
							client?
						)
					)
				)
				(= opponentTechnique
					(_techniques
						maxElement: defenseOddsCode opponentTechnique
					)
				)
				(pEvent claimed: 1)
				(self technique: opponentTechnique)
			)
			(else (super handleEvent: pEvent &rest))
		)
	)
	
	(method (inflict &tmp temp0)
		(= temp0 (super inflict: &rest))
		(if
		(and script (== global125 1) (not (opponent script?)))
			(opponent setScript: getKilled script)
		)
		(return temp0)
	)
)

(instance getKilled of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gMH delete: rob)
				(gDH delete: rob)
				(gKH delete: rob)
				(rob _strength: 0)
				(monk _strength: 0)
				(= ticks 1)
			)
			(1
				(monk plan: 0)
				(client
					technique: 0
					setLoop: 10
					setCel: 0
					setCycle: End self
				)
			)
			(2
				((client opponent?) technique: 0 setLoop: 0 setCel: 0)
				(= ticks 60)
			)
			(3
				(Wat qFight: (if (== client rob) 1 else 2))
				(monkFight cue:)
				(self dispose:)
			)
		)
	)
)

(instance getHit of Script
	(properties)
	
	(method (dispose)
		(client ticks: register)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(= register (client ticks?))
				(client setLoop: 0 setCel: 0)
				(= ticks (client moveSpeed?))
			)
			(1
				(client setLoop: 9 setCel: 0 setCycle: End self)
			)
			(2
				(= ticks (client moveSpeed?))
			)
			(3
				(client
					setLoop: 0
					setCel: 0
					setCycle: (Clone RandForward)
				)
				(global1 setCursor: 10)
				(self dispose:)
			)
			(4
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
				(proc255_4 11 2 name state)
			)
		)
	)
)

(instance attackElsewhere of Code
	(properties)
	
	(method (doit param1 param2)
		(if (not (param1 onMe: param2))
			(((param2 client?) parts:) firstTrue: #onMe param1)
		)
	)
)

(instance robOverHead of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop (- 30 (client nsTop?)))
		(= nsBottom (client nsTop?))
		(super onMe: &rest)
	)
)

(instance robHead of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop (client nsTop?))
		(= nsBottom
			(+
				(client nsTop?)
				(/ (- (client nsBottom?) (client nsTop?)) 3)
			)
		)
		(super onMe: &rest)
	)
)

(instance robBody of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop
			(+
				(client nsTop?)
				(/ (- (client nsBottom?) (client nsTop?)) 3)
			)
		)
		(= nsBottom
			(+
				(client nsTop?)
				(/ (* (- (client nsBottom?) (client nsTop?)) 2) 3)
			)
		)
		(super onMe: &rest)
	)
)

(instance robLegs of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop
			(+
				(client nsTop?)
				(/ (* (- (client nsBottom?) (client nsTop?)) 2) 3)
			)
		)
		(= nsBottom (+ 30 (client nsBottom?)))
		(super onMe: &rest)
	)
)

(class QSTechnique of Technique
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
		completed 0
		key 0
		dir 0
		view 0
		loop 0
		_strength 0
		_delay 0
		target 0
		claimed 0
		message 0
		type $0000
		_success 100
	)
	
	(method (dispose)
		(if (not (client cycler?))
			(client loop: 0 cel: 0 setCycle: (Clone RandForward))
		)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= ticks
					(*
						1
						(if (!= (target client?) client)
							(+
								(self delay:)
								(proc999_3 (client ticks?) (client parriedCycles?))
							)
						else
							(client parriedCycles?)
						)
					)
				)
				(if (not ticks) (self cue:))
			)
			(1
				(client
					cel: 0
					loop: loop
					telegraph: self
					setCycle: End self
				)
			)
			(2
				(= completed 1)
				(client inflict: self)
				(= register (client loop?))
				(= ticks
					(* (client moveSpeed?) (- 3 (client lastCel:)))
				)
			)
			(3
				(if (== (client loop?) register)
					(client setCycle: Beg self)
				else
					(self dispose:)
				)
			)
			(4
				(= ticks (client moveSpeed?))
			)
			(5 (self dispose:))
		)
		(localproc_0012
			11
			3
			name
			newState
			loop
			(client name?)
			(client loop?)
			(client cel?)
			(if (client cycler?)
				((client cycler?) name?)
			else
				{none}
			)
		)
	)
	
	(method (cue)
		(if
		(and (client ticks?) (!= (target client?) client))
			(self dispose:)
		else
			(super cue: &rest)
		)
	)
	
	(method (success)
		(proc999_2
			100
			(/
				(*
					(super success: &rest)
					(+
						100
						(if (not (if argc else (== client rob)))
							(switch global125
								(2 -2)
								(3 3)
								(4 10)
							)
						else
							0
						)
					)
				)
				100
			)
		)
	)
	
	(method (strength)
		(if
		(and (not argc) (== global125 1) (client plan:))
			0
		else
			(super strength: &rest)
		)
	)
	
	(method (delay)
		(return
			(cond 
				(argc (super delay: &rest))
				((== client (target client?)) 0)
				((< (client idleCycles?) _delay) _delay)
				(else (/ _delay 2))
			)
		)
	)
)

(instance robOverHit of QSTechnique
	(properties
		key 56
		dir 1
		loop 1
		_strength 6
		_delay 24
		_success 11
	)
)

(instance robHighHit of QSTechnique
	(properties
		key 57
		dir 2
		loop 2
		_strength 4
		_delay 18
		_success 23
	)
)

(instance robMidHit of QSTechnique
	(properties
		key 54
		dir 3
		loop 3
		_strength 3
		_delay 12
		_success 36
	)
)

(instance robLowHit of QSTechnique
	(properties
		key 51
		dir 4
		loop 4
		_strength 2
		_delay 6
		_success 52
	)
)

(instance robHighBlk of QSTechnique
	(properties
		key 50
		dir 5
		loop 5
	)
)

(instance robDuck of QSTechnique
	(properties
		key 55
		dir 8
		loop 6
	)
)

(instance robMidBlk of QSTechnique
	(properties
		key 52
		dir 7
		loop 7
	)
)

(instance robJump of QSTechnique
	(properties
		key 49
		dir 6
		loop 8
	)
)

(instance monk of QSFighter
	(properties
		view 124
	)
	
	(method (init &tmp temp0)
		(if (= temp0 (== _parts 0))
			(self
				ignoreActors:
				parts: monkOverHead monkHead monkBody monkLegs
				techniques:
					monkMidHit
					monkLowHit
					monkHighHit
					monkOverHit
					monkMidBlk
					monkHighBlk
					monkDuck
					monkJump
			)
		)
		(self loop: 0 setCycle: (Clone RandForward))
		(_parts name: {monkParts})
		(_techniques name: {monkTechs})
		(if temp0 (super init: &rest))
	)
	
	(method (suffer param1)
		(if (and (== loop 6) (== (opponent loop?) 2))
			(opponent loop: 3)
		)
		(super suffer: param1 &rest)
	)
	
	(method (inflict)
		(if (!= global125 1) (super inflict: &rest))
	)
)

(instance monkOverHead of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop (- 30 (client nsTop?)))
		(= nsBottom (client nsTop?))
		(super onMe: &rest)
	)
)

(instance monkHead of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop (client nsTop?))
		(= nsBottom
			(+
				(client nsTop?)
				(/ (- (client nsBottom?) (client nsTop?)) 3)
			)
		)
		(super onMe: &rest)
	)
)

(instance monkBody of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop
			(+
				(client nsTop?)
				(/ (- (client nsBottom?) (client nsTop?)) 3)
			)
		)
		(= nsBottom
			(+
				(client nsTop?)
				(/ (* (- (client nsBottom?) (client nsTop?)) 2) 3)
			)
		)
		(super onMe: &rest)
	)
)

(instance monkLegs of qsPart
	(properties)
	
	(method (onMe)
		(= nsTop
			(+
				(client nsTop?)
				(/ (* (- (client nsBottom?) (client nsTop?)) 2) 3)
			)
		)
		(= nsBottom (+ 30 (client nsBottom?)))
		(super onMe: &rest)
	)
)

(instance monkOverHit of QSTechnique
	(properties
		loop 1
		_strength 6
		_delay 24
		_success 11
	)
)

(instance monkHighHit of QSTechnique
	(properties
		loop 2
		_strength 4
		_delay 18
		_success 23
	)
)

(instance monkMidHit of QSTechnique
	(properties
		loop 3
		_strength 3
		_delay 12
		_success 36
	)
)

(instance monkLowHit of QSTechnique
	(properties
		loop 4
		_strength 2
		_delay 6
		_success 52
	)
)

(instance monkHighBlk of QSTechnique
	(properties
		loop 5
	)
)

(instance monkDuck of QSTechnique
	(properties
		loop 6
	)
)

(instance monkMidBlk of QSTechnique
	(properties
		loop 7
	)
)

(instance monkJump of QSTechnique
	(properties
		loop 8
	)
)
