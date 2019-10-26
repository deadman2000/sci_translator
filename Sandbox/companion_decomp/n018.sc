;;; Sierra Script 1.0 - (do not remove this comment)
(script# 18)
(include sci.sh)
(use n000)
(use n013)
(use n125)
(use n806)
(use n851)
(use n930)
(use n945)
(use n958)
(use n961)
(use n992)
(use n998)
(use n999)

(public
	day1 0
	day3 1
	day4 2
	day5 3
	day6A 4
	day6B 5
	day8 6
	day9 7
	day12 8
	setup 9
)

(local
	[local0 2]
	local2
	local3
	[local4 4] = [1018 10 2]
	[local8 4] = [1018 11 2]
	[local12 4] = [1018 12 2]
	[local16 5] = [1018 13 1 2]
	[local21 5] = [1018 15 1 2]
	[local26 5] = [1018 17 1 1]
	[local31 5] = [1018 19 1 2]
)
(instance day1 of Script
	(properties)
	
	(method (dispose)
		(gSFX2 fade: 0 20 12 1)
		(proc0_6 44)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(if (global5 contains: character2)
			(character2 dispose: delete:)
		)
		(Wat travelDir: 3 enterDir: 3)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local2 1)
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 1)
				(character1
					name: {woman}
					lookStr: 16
					view: 110
					setLoop: 0
					posn: 325 85
					init:
					setCycle: Walk
					setMotion: MoveTo 254 98 self
				)
				(= ticks 270)
			)
			(1
				(character2
					name: {flunky}
					lookStr: 18
					view: 110
					setLoop: 6
					posn: 325 65
					setStep: 3 2
					init:
					setCycle: Walk
					setMotion: MoveTo 240 100 self
				)
			)
			(2
				(= local2 0)
				(character1 lookStr: 17 setLoop: 1)
			)
			(3
				(character2 setLoop: 2 setCel: 0)
				(= ticks 6)
			)
			(4
				(character1 hide:)
				(character2 setCel: 1)
				(= ticks 90)
			)
			(5
				(character2 cycleSpeed: 12 setCycle: CT 2 1 self)
			)
			(6
				(character2 setCycle: CT 1 -1 self)
			)
			(7
				(character2 setCycle: CT 3 1 self)
			)
			(8
				(character2 setCycle: CT 1 -1 self)
			)
			(9 (= ticks 60))
			(10
				(character2
					setCycle: CT (- (character2 lastCel:) 1) 1 self
				)
			)
			(11
				(character2 setCel: (character2 lastCel:))
				(character1
					posn: 236 105
					setLoop: 0
					setCel: 4
					setCycle: Walk
					show:
				)
				(= ticks 6)
			)
			(12
				(character1 posn: 232 107 setMotion: MoveTo 40 152)
				(character2
					view: 755
					posn: 225 106
					setLoop: 4
					cycleSpeed: 6
					setStep: 2 1
					setCycle: Walk
					setMotion: MoveTo 40 152 self
				)
			)
			(13 (self dispose:))
		)
	)
)

(instance day3 of Script
	(properties)
	
	(method (dispose)
		(proc0_6 49)
		(gSFX2 fade: 0 30 8 1)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(Wat travelDir: 3 enterDir: 3)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 2)
				(character1
					name: {beggar}
					lookStr: 20
					view: 55
					setLoop: 0
					posn: 325 75
					cycleSpeed: 12
					moveSpeed: 12
					init:
					setCycle: Walk
					setMotion: MoveTo 40 152 self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance day4 of Script
	(properties)
	
	(method (dispose)
		(gSFX2 fade: 0 30 8 1)
		(proc0_6 47)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(if (global5 contains: character2)
			(character2 dispose: delete:)
		)
		(Wat travelDir: 3 enterDir: 3)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 3)
				(character1
					name: {poacher}
					lookStr: 17
					view: 110
					setLoop: 3
					posn: 325 75
					init:
					setCycle: Walk
					setMotion: MoveTo 256 100
				)
				(character2
					name: {flunky}
					lookStr: 19
					view: 755
					setLoop: 4
					posn: 315 70
					init:
					setCycle: Walk
					setMotion: MoveTo 240 100 self
				)
			)
			(1
				(character1 setLoop: 4)
				(character2 view: 110 setLoop: 5 setCel: 0)
				(= ticks 6)
			)
			(2
				(character1 hide:)
				(character2 setCel: 1)
				(= ticks 90)
			)
			(3
				(character2 cycleSpeed: 12 setCycle: CT 2 1 self)
			)
			(4
				(character2 setCycle: CT 1 -1 self)
			)
			(5
				(character2 setCycle: CT 3 1 self)
			)
			(6
				(character2 setCycle: CT 1 -1 self)
			)
			(7 (= ticks 60))
			(8
				(character2
					setCycle: CT (- (character2 lastCel:) 1) 1 self
				)
			)
			(9 (= ticks 6))
			(10
				(character2 setCel: (character2 lastCel:))
				(character1
					posn: 236 105
					setLoop: 3
					setCel: 4
					setCycle: Walk
					show:
				)
				(= ticks 6)
			)
			(11
				(character1 posn: 232 107 setMotion: MoveTo 40 152)
				(character2
					view: 755
					posn: 225 106
					setLoop: 4
					cycleSpeed: 6
					setStep: 2 1
					setCycle: Walk
					setMotion: MoveTo 40 142 self
				)
			)
			(12 (self dispose:))
		)
	)
)

(instance day5 of Script
	(properties)
	
	(method (doit)
		(cond 
			(
				(and
					(not local3)
					(<= (character1 distanceTo: character2) 15)
				)
				(++ local3)
				(character1 setMotion: 0)
				(character2 setMotion: 0)
			)
			((and (< 0 local3) (< local3 25)) (++ local3))
			((== local3 25)
				(++ local3)
				(character1 setMotion: MoveTo 20 152)
				(character2 setMotion: MoveTo 335 75 self)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(if (== (Wat whichChar?) 9)
			(if (< (Wat qFight?) 160)
				(Wat whichChar: 4 travelDir: 3 enterDir: 3)
			else
				(Wat whichChar: 5 travelDir: 1 enterDir: 1)
			)
		)
		(gSFX2 fade: 0 30 8 1)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(if (global5 contains: character2)
			(character2 dispose: delete:)
		)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 9)
				(character1
					name: {fMonk}
					lookStr: 21
					view: 106
					setLoop: 0
					posn: 325 70
					init:
					setCycle: Walk
					setMotion: MoveTo 20 152
				)
				(character2
					name: {aMonk}
					lookStr: 22
					view: 25
					setLoop: 6
					posn: 60 152
					init:
					setCycle: Walk
					setMotion: MoveTo 335 75
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance day6A of Script
	(properties)
	
	(method (dispose)
		(Wat
			travelDir: (if (< (character1 heading?) 180) 1 else 3)
			enterDir: (if (< (character1 heading?) 180) 1 else 3)
		)
		(gSFX2 fade: 0 30 8 1)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(DisposeScript 18)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 5)
				(if (= temp4 (Random 0 1))
					(= temp0 40)
					(= temp1 152)
					(= temp2 325)
					(= temp3 75)
				else
					(= temp0 325)
					(= temp1 75)
					(= temp2 40)
					(= temp3 152)
				)
				(character1
					name: {aMonk}
					lookStr: 22
					view: 25
					setLoop: (if temp4 6 else 5)
					posn: temp0 temp1
					init:
					setCycle: Walk
					setMotion: MoveTo temp2 temp3 self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance day6B of Script
	(properties)
	
	(method (dispose)
		(Wat
			travelDir: (if (< (character1 heading?) 180) 1 else 3)
			enterDir: (if (< (character1 heading?) 180) 1 else 3)
		)
		(gSFX2 fade: 0 30 8 1)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(DisposeScript 18)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 4)
				(= temp4 1)
				(if (= temp4 (Random 0 1))
					(= temp0 40)
					(= temp1 152)
					(= temp2 325)
					(= temp3 75)
				else
					(= temp0 325)
					(= temp1 75)
					(= temp2 40)
					(= temp3 152)
				)
				(character1
					name: {fMonk}
					lookStr: 21
					view: 106
					setLoop: temp4
					posn: temp0 temp1
					init:
					setCycle: Walk
					setMotion: MoveTo temp2 temp3 self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance day8 of Script
	(properties)
	
	(method (dispose)
		(gSFX2 fade: 0 30 8 1)
		(proc0_6 135)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(Wat travelDir: 3 enterDir: 3)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 6)
				(character1
					name: {puck}
					lookStr: 23
					view: 53
					loop: 5
					posn: 325 75
					init:
					setCycle: Walk
					setMotion: MoveTo 40 152 self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance day9 of Script
	(properties)
	
	(method (dispose)
		(gSFX2 fade: 0 30 8 1)
		(proc0_6 28)
		(super dispose:)
		(if (global5 contains: character1)
			(character1 dispose: delete:)
		)
		(Wat travelDir: 3 enterDir: 3)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 7)
				(character1
					name: {jeweler}
					lookStr: 24
					view: 72
					setLoop: 5
					posn: 325 75
					init:
					setCycle: Walk
					setMotion: MoveTo 40 152 self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance day12 of Script
	(properties)
	
	(method (dispose)
		(gSFX2 fade: 0 30 8 1)
		(super dispose:)
		(character1 dispose: delete:)
		(global10 eachElementDo: #dispose)
		(Wat travelDir: 3)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: 115 loop: -1 play:)
				(Wat whichChar: 8)
				(character1
					name: {knight}
					lookStr: 25
					view: 105
					cel: 1
					posn: 221 107
					init:
				)
				(proc806_2 littleJohn friarTuck)
				(= ticks 60)
			)
			(1
				(character1 cel: 0)
				(= ticks (Random 30 120))
			)
			(2
				(character1 cel: 1)
				(= ticks (Random 60 300))
			)
			(3
				(= state (- state 3))
				(self cue:)
			)
		)
	)
)

(instance character1 of Actor
	(properties
		yStep 1
		priority 10
		signal $6010
		xStep 2
	)
	
	(method (doit)
		(if (proc0_5 148) (proc0_7 148) (self setStep: 4 2))
		(super doit:)
	)
	
	(method (dispose)
		(if (!= global130 12) (Wat setScript: (Wat theTimer?)))
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(switch view
					(110
						(if (== global130 1)
							(Wat whichChar: 1)
						else
							(Wat whichChar: 3)
						)
					)
					(55 (Wat whichChar: 2))
					(106 (Wat whichChar: 4))
					(25 (Wat whichChar: 5))
					(53 (Wat whichChar: 6))
					(72 (Wat whichChar: 7))
					(105 (Wat whichChar: 8))
				)
				(gEgo setMotion: PChase self 10)
				(if (< heading 180)
					(Wat travelDir: 1 enterDir: 1 section: 3)
					(= global112 55)
				else
					(Wat travelDir: 3 enterDir: 3 section: 5)
					(= global112 87)
				)
			)
			(5
				(if (== (global2 script?) day5)
					(proc13_4 1018 5)
				else
					(proc13_4 1018 3)
				)
			)
			(10
				(switch view
					(110
						(if local2 (proc13_4 1018 1) else (proc13_4 1018 0))
					)
					(55 (proc13_4 1018 2))
					(106 (proc13_4 1018 6))
					(25 (proc13_4 1018 2))
					(53 (proc13_4 1018 7))
					(72 (proc13_4 1018 2))
					(105 (proc13_4 1018 8))
				)
			)
			(4 (proc13_4 1018 9))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance character2 of Actor
	(properties
		yStep 1
		priority 10
		signal $6010
		xStep 2
	)
	
	(method (doit)
		(if (proc0_5 148) (proc0_7 148) (self setStep: 4 2))
		(super doit:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3
				(gEgo setMotion: PChase self 10)
				(if (< heading 180)
					(Wat travelDir: 1 enterDir: 1 section: 3)
					(= global112 55)
				else
					(Wat travelDir: 3 enterDir: 3 section: 5)
					(= global112 87)
				)
				(cond 
					((== view 25) (Wat whichChar: 5))
					((or (== view 110) (== view 755))
						(if (== global130 1)
							(Wat whichChar: 1)
						else
							(Wat whichChar: 3)
						)
					)
				)
			)
			(5
				(switch view
					(110 (proc13_4 1018 4))
					(755 (proc13_4 1018 4))
					(25 (proc13_4 1018 5))
					(else  (proc13_4 1018 3))
				)
			)
			(10
				(switch view
					(110 (proc13_4 1018 0))
					(755 (proc13_4 1018 0))
					(106 (proc13_4 1018 6))
					(25 (proc13_4 1018 2))
				)
			)
			(4 (proc13_4 1018 9))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance setup of TScript
	(properties)
	
	(method (dispose)
		(super dispose:)
		(proc0_6 137)
		(DisposeScript 18)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc958_0 128 151 152 153)
				(ScriptID 19)
				(proc0_3)
				(gEgo setHeading: 135 self)
			)
			(1
				(gEgo stopUpd:)
				((ScriptID 19)
					posn: 330 200
					ignoreActors: 1
					init:
					setCycle: StopWalk 152
					setMotion: MoveTo 229 177 self
				)
			)
			(2 (= ticks 12))
			(3
				(proc851_0 @local4 3 13 self 0)
			)
			(4
				(if (proc0_5 45)
					(self cue:)
				else
					(proc851_0 @local8 3 13 self 0)
				)
			)
			(5
				(proc851_0 @local12 3 13 self 0)
			)
			(6
				(if (proc0_5 45)
					(proc851_0 @local21 3 13 self)
				else
					(proc851_0 @local16 3 13 self)
				)
			)
			(7
				(if (gEgo has: 1)
					((ScriptID 19) setMotion: MoveTo 330 200 self)
				else
					((ScriptID 19) setMotion: MoveTo 330 200)
					(= seconds 3)
				)
			)
			(8
				(if (gEgo has: 1)
					(proc0_4)
					((ScriptID 19) dispose:)
					(self dispose:)
				else
					((ScriptID 19) setMotion: 0)
					(proc0_9 (ScriptID 19) gEgo self)
					(= notKilled 1)
				)
			)
			(9 (= ticks 30))
			(10
				(proc851_0 1 @local26 13 3 self)
			)
			(11
				((ScriptID 19)
					setMotion: PolyPath (+ (gEgo x?) 5) (+ (gEgo y?) 10) self
				)
			)
			(12
				(proc0_9 (ScriptID 19) gEgo self)
			)
			(13
				(= notKilled 1)
				(gEgo get: 1)
				(proc851_0 @local31 1 13 self)
			)
			(14
				((ScriptID 19) setMotion: PolyPath 330 200 self)
			)
			(15
				(proc0_4)
				((ScriptID 19) dispose:)
				(gEgo startUpd: setHeading: 45)
				(self dispose:)
			)
		)
	)
)

(instance littleJohn of PicView
	(properties
		x 191
		y 111
		lookStr 25
		view 105
		loop 1
	)
)

(instance friarTuck of PicView
	(properties
		x 243
		y 103
		lookStr 25
		view 105
		loop 1
		cel 1
	)
)
