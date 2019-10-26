;;; Sierra Script 1.0 - (do not remove this comment)
(script# 603)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n945)
(use n969)
(use n989)
(use n992)
(use n999)

(public
	blewIt 0
	knockItOff 1
	incoming600 2
	incoming590 3
	walkToBoat 4
)

(local
	local0
	local1
	[local2 4] = [1601 94 1]
	[local6 5] = [1601 75 1 1]
	[local11 5] = [1601 97 1]
	[local16 5] = [1601 86 1 2]
)
(instance blewIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: (ScriptID 5 1) self)
			)
			(1 (= ticks 90))
			(2 (proc13_4 1601 92 self))
			(3
				(global1 setScript: musicPlay)
				(= ticks 60)
			)
			(4 (proc13_4 1601 93 self))
			(5
				(gEgo setMotion: PolyPath (gEgo x?) 245 self)
			)
			(6
				(gRgnMusic2 fade: 0 20 12 1)
				(global1 setScript: 0)
				(gClient newRoom: 100)
			)
		)
	)
)

(instance knockItOff of Script
	(properties)
	
	(method (doit)
		(if
			(and
				(== ((ScriptID 601 3) cel?) 4)
				(!= (dieSound number?) 928)
			)
			(dieSound number: 928 play:)
		)
		(super doit: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((ScriptID 601 1) setMotion: 0)
				((ScriptID 601 2)
					setCel: 0
					setLoop: 0
					posn: (- ((ScriptID 601 2) x?) 2) (- ((ScriptID 601 2) y?) 3)
					setCycle: 0
				)
				(gSFX stop:)
				(= ticks 12)
			)
			(1
				((ScriptID 601 2) cycleSpeed: 6 setCycle: CT 2 1 self)
			)
			(2
				((ScriptID 601 2) setCycle: End self)
				(dieSound play:)
			)
			(3
				((ScriptID 601 3) cycleSpeed: 12 setCycle: End self)
			)
			(4 (= ticks 30))
			(5
				(if register
					(proc851_0 1 @local11 11 0 self)
				else
					(proc851_0 1 @local2 11 0 self)
				)
			)
			(6 (proc806_0))
		)
	)
)

(instance incoming600 of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 603)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				((ScriptID 601 2)
					view: 21
					setLoop: 6
					setCel: 0
					setPri: 5
					xStep: 1
					yStep: 1
					posn: 203 128
					cycleSpeed: 18
					init:
				)
				(proc0_9 gEgo (ScriptID 601 2))
				(= ticks 18)
			)
			(1
				((ScriptID 601 2)
					x: (- ((ScriptID 601 2) x?) 4)
					y: (+ ((ScriptID 601 2) y?) 3)
					setPri:
						(if (mod local0 2)
							(+ ((ScriptID 601 2) priority?) 1)
						else
							((ScriptID 601 2) priority?)
						)
				)
				(= ticks 18)
			)
			(2
				(if (< (++ local0) 6) (= state (- state 2)))
				(= ticks 18)
			)
			(3
				((ScriptID 601 2) setPri: -1 setCycle: End self)
			)
			(4
				((ScriptID 601 1)
					view: 21
					loop: 3
					cel: 2
					posn: 178 132
					init:
				)
				((ScriptID 601 2)
					view: 585
					loop: 2
					cel: 3
					posn: 151 159
					init:
				)
				(gEgo setMotion: PolyPath 113 164 self)
			)
			(5 (gEgo setHeading: 45 self))
			(6 (self dispose:))
		)
	)
)

(instance incoming590 of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 603)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				((ScriptID 601 2)
					view: 21
					setLoop: 5
					setCel: 0
					setPri: 5
					xStep: 1
					yStep: 1
					posn: 59 126
					cycleSpeed: 18
					init:
				)
				(proc0_9 gEgo (ScriptID 601 2))
				(= ticks 18)
			)
			(1
				((ScriptID 601 2)
					x: (+ ((ScriptID 601 2) x?) 4)
					setPri:
						(if (mod local0 2)
							(+ ((ScriptID 601 2) priority?) 1)
						else
							((ScriptID 601 2) priority?)
						)
				)
				(= ticks 18)
			)
			(2
				(if (< (++ local0) 6) (= state (- state 2)))
				(= ticks 18)
			)
			(3
				((ScriptID 601 2) setPri: -1 setCycle: End self)
			)
			(4
				((ScriptID 601 1)
					view: 21
					loop: 2
					cel: 2
					posn: 84 112
					setPri: ((ScriptID 601 2) priority?)
					signal: 16384
					init:
				)
				((ScriptID 601 2)
					view: 585
					setLoop: 1
					setCel: 3
					posn: 100 137
				)
				(gEgo setMotion: PolyPath 135 145 self)
			)
			(5 (gEgo setHeading: 315 self))
			(6 (self dispose:))
		)
	)
)

(instance walkToBoat of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== global11 590)
					(gEgo setMotion: PolyPath 131 144 self)
				else
					(gEgo setMotion: PolyPath 131 165 self)
				)
			)
			(1 (gEgo setHeading: 0 self))
			(2
				(gIconBar disable: 5 4)
				(if (== gNewGuise 0)
					(self setScript: (ScriptID 601 8) self)
				else
					(gEgo
						view: 19
						x: (if (== global11 590) 128 else 132)
						y: (if (== global11 590) 146 else 167)
						setLoop: (if (== global11 590) 0 else 1)
						setCel: 0
						setPri: (if (== global11 600) 10 else -1)
						cycleSpeed: 12
						setCycle: End self
					)
				)
			)
			(3
				(if (== gNewGuise 0)
					(client setScript: (ScriptID 601 9))
					(DisposeScript 603)
				else
					(client setScript: egoInMonkBoat)
				)
			)
		)
	)
)

(instance egoInMonkBoat of Script
	(properties)
	
	(method (doit)
		(if (gNewCast contains: (ScriptID 601 3))
			(if (== global11 590)
				((ScriptID 601 3)
					setPri: ((ScriptID 601 2) priority?)
					posn: (+ ((ScriptID 601 2) x?) 32) (+ ((ScriptID 601 2) y?) 9)
				)
				((ScriptID 601 1)
					setPri: ((ScriptID 601 2) priority?)
					posn: (- ((ScriptID 601 2) x?) 16) (- ((ScriptID 601 2) y?) 25)
				)
				((ScriptID 601 2) setLoop: 1)
			else
				((ScriptID 601 3)
					setPri: ((ScriptID 601 2) priority?)
					posn: (- ((ScriptID 601 2) x?) 25) (+ ((ScriptID 601 2) y?) 9)
				)
				((ScriptID 601 1)
					setPri: ((ScriptID 601 2) priority?)
					posn: (+ ((ScriptID 601 2) x?) 27) (- ((ScriptID 601 2) y?) 27)
				)
				((ScriptID 601 2) setLoop: 2)
			)
		)
		(super doit:)
	)
	
	(method (changeState newState &tmp temp0 temp1)
		(switch (= state newState)
			(0
				(proc0_3)
				(gIconBar disable: 5)
				(if (== global136 2)
					(proc851_0 2 @local16 8 0 11 3 self)
				else
					(self cue:)
				)
			)
			(1
				(= temp1 (if (> global87 0) 2 else 3))
				((ScriptID 601 2) setStep: temp1 temp1 setPri: -1)
				((ScriptID 601 3)
					view: (gEgo view?)
					signal: 16384
					loop: (gEgo loop?)
					cel: (gEgo cel?)
					x: (gEgo x?)
					y: (gEgo y?)
					init:
				)
				(gEgo hide:)
				(= ticks 18)
			)
			(2
				(if (== global115 2)
					(proc851_0 1 @local6 11 0 self)
				else
					(self cue:)
				)
			)
			(3
				(gSFX play:)
				(switch global87
					(0
						((ScriptID 601 2) setStep: 5 3)
					)
					(1
						((ScriptID 601 2) setStep: 3 2)
					)
					(else 
						((ScriptID 601 2) setStep: 2 1)
					)
				)
				(if (== global11 590)
					((ScriptID 601 2)
						setCycle: Fwd
						setMotion: MoveTo 140 125 self
					)
				else
					((ScriptID 601 2)
						setCycle: Rev
						setMotion: MoveTo 180 137 self
					)
				)
			)
			(4
				(if (== global11 590)
					((ScriptID 601 2) setMotion: MoveTo 319 115 self)
				else
					((ScriptID 601 2)
						setCycle: Fwd
						setMotion: MoveTo 100 120 self
					)
				)
			)
			(5
				(if (== global11 590)
					(self cue:)
				else
					((ScriptID 601 2) setMotion: MoveTo 0 115 self)
				)
			)
			(6
				(proc0_4)
				(client setScript: 0)
				(gClient newRoom: 610)
			)
		)
	)
)

(instance musicPlay of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic2 number: 583 loop: 1 play: 75 self)
			)
			(1
				(if (== (gRgnMusic2 prevSignal?) -1)
					(= state -1)
					(self cue:)
				else
					(-- state)
					(= cycles 1)
				)
			)
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
