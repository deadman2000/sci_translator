;;; Sierra Script 1.0 - (do not remove this comment)
(script# 125)
(include sci.sh)
(use n000)
(use n958)
(use n961)
(use n992)
(use n994)
(use n995)
(use n999)

(public
	Wat 0
	merryMenEntrance 1
	proc125_2 2
	putStuff 3
)

(procedure (proc125_2)
	(Wat
		weMeetAgain: 0
		charFirstTalk: 0
		whichChar: 0
		charObj: 0
		travelDir: 0
		travelSect: 0
		setScript: 0
	)
)

(class Wat of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 1
		initialized 0
		lookStr 0
		weMeetAgain 0
		offRoad 0
		secondSearch 0
		charFirstTalk 0
		qFight 0
		gaveManBucks 0
		offeredEmerald 0
		hurry 0
		blewHorn 0
		womanStatus 0
		poachStatus 0
		section 4
		whichChar 0
		charObj 0
		travelDir 0
		travelSect 4
		theTimer 0
		enterDir 0
	)
	
	(method (init)
		(= theTimer travelTimer)
		(if (== global12 220)
			(= section (/ (& global112 $00f0) 16))
		)
		(super init:)
	)
	
	(method (dispose)
		(if
			(and
				(== global130 1)
				(proc0_5 44)
				(not (proc0_5 75))
				(not (proc0_5 173))
			)
			(proc0_6 103)
		)
		(if
			(and
				(== global130 4)
				(proc0_5 47)
				(not (proc0_5 153))
				(not (proc0_5 174))
			)
			(proc0_6 184)
		)
		(if
			(and
				(== global130 8)
				(proc0_5 135)
				(not (proc0_5 57))
			)
			(proc0_6 191)
		)
		(super dispose:)
	)
	
	(method (newRoom newRoomNumber)
		(if (not (proc999_5 newRoomNumber 110 120 100))
			(self keep: 0)
		)
	)
)

(instance putStuff of Code
	(properties)
	
	(method (doit param1 &tmp temp0)
		(= temp0 (global9 indexOf: param1))
		(if
			(and
				(param1 isKindOf: InvI)
				(== (param1 owner?) gEgo)
				(or
					(and (== global126 1) (not (proc999_5 temp0 0 3 15)))
					(and
						(== global126 2)
						(not (proc999_5 temp0 0 2 14 10 18 8 7))
					)
					(and (== global126 4) (not (proc999_5 temp0 0 17)))
					(and
						(== global126 5)
						(not (proc999_5 temp0 0 2 11 14 12 10 13 18))
					)
					(and
						(== global126 6)
						(not (proc999_5 temp0 0 2 14 10 5 6 17 16 18))
					)
				)
			)
			(gEgo put: temp0 140)
		)
	)
)

(instance travelTimer of Script
	(properties)
	
	(method (init)
		(= seconds (if (Wat hurry?) 5 else 10))
		(super init: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 0)
			(1
				(Wat
					travelSect:
						(if (== (Wat travelDir?) 1)
							(- (Wat travelSect?) 1)
						else
							(+ (Wat travelSect?) 1)
						)
				)
				(= seconds (if (Wat hurry?) 5 else 10))
			)
			(2
				(if
				(or (<= (Wat travelSect?) 1) (>= (Wat travelSect?) 9))
					(proc125_2)
					(switch global130
						(1
							(if (and (proc0_5 46) (proc0_5 45))
								(global2 newRoom: 160)
							)
						)
						(4
							(if (proc0_5 48) (global2 newRoom: 160))
						)
					)
					(self dispose:)
				else
					(= state (- state 2))
					(self cue:)
				)
			)
		)
	)
)

(instance merryMenEntrance of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(ScriptID 20)
				(ScriptID 19)
				(ScriptID 23)
				(proc958_0 128 160 161 162 151 152 153 154 155 156)
				((ScriptID 20)
					ignoreHorizon: 1
					posn: 265 -2
					init:
					setCycle: StopWalk 161
					setMotion: MoveTo 185 30 self
				)
				((ScriptID 19)
					posn: -10 75
					init:
					setCycle: StopWalk 152
					setMotion: MoveTo 95 70
				)
				((ScriptID 23)
					posn: 330 125
					init:
					setCycle: StopWalk 155
					setMotion: MoveTo 240 125
				)
			)
			(1
				((ScriptID 20) setMotion: MoveTo 185 50 self)
			)
			(2
				((ScriptID 19) stopUpd:)
				((ScriptID 23) stopUpd:)
				((ScriptID 20) stopUpd:)
				(self dispose:)
			)
		)
	)
)
