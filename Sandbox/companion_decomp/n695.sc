;;; Sierra Script 1.0 - (do not remove this comment)
(script# 695)
(include sci.sh)
(use n000)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n961)
(use n989)
(use n992)
(use n994)
(use n999)

(public
	monDeath 0
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
	local9
	local10
	[local11 4] = [1695 0 1]
	[local15 4] = [1695 1 1]
)
(procedure (localproc_000e)
	(proc851_0 @local11 (Monastery tPRIOR?) 0 self)
)

(procedure (localproc_0026)
	(proc851_0 @local15 11 0 self)
)

(instance monDeath of Rm
	(properties)
	
	(method (init)
		(self picture: (Monastery roomToDie?))
		(super init:)
		((= local2 ((ScriptID 625 1) new:)) view: 16 loop: 1)
		(switch (gClient picture?)
			(670
				(gEgo posn: 142 205 init:)
				(proc0_2)
				(cond 
					((== (Monastery deathReason?) 1)
						((ScriptID 625 2)
							view: 641
							posn: 230 177
							loop: 1
							cel: 4
							init:
							setCycle: StopWalk 642
						)
						((= local1 ((ScriptID 625 1) new:))
							view: 16
							posn: 183 179
							loop: 1
							cel: 0
							init:
							setCycle: StopWalk 47
						)
						(local2 cel: 0 posn: 199 189 init: setCycle: StopWalk 47)
						(= local3 160)
						(= local4 185)
						(= local5 226)
						(= local6 177)
						(= local7 163)
						(= local8 179)
						(= local9 174)
						(= local10 189)
						(self setScript: gotchaWater)
					)
					((== (Monastery deathReason?) 2)
						(local2 view: 585 loop: 0 cel: 0 posn: 149 169 init:)
						(= local3 173)
						(= local4 176)
						(self setScript: gotchaRing)
					)
				)
			)
			(640
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init: 42 141 144 143 134 187 19 187
							yourself:
						)
						((Polygon new:)
							type: 2
							init: 79 92 149 89 137 138 43 138
							yourself:
						)
						((Polygon new:)
							type: 2
							init: 243 94 266 134 176 135 167 96
							yourself:
						)
						((Polygon new:)
							type: 2
							init: 278 138 299 185 168 185 165 143
							yourself:
						)
				)
				(switch (Monastery whichDoor?)
					(0
						(gEgo posn: 59 107 init:)
						(proc0_2)
					)
					(1
						(gEgo posn: 26 144 init:)
						(proc0_2)
					)
					(2
						(gEgo posn: 6 184 init:)
						(proc0_2)
					)
					(3
						(gEgo posn: 150 184 init:)
						(proc0_2)
					)
					(4 (gEgo posn: 309 184 init:))
					(5
						(gEgo posn: 295 144 init:)
						(proc0_2)
					)
					(6
						(gEgo posn: 262 107 init:)
						(proc0_2)
					)
				)
				(cond 
					((== (Monastery deathReason?) 1)
						((ScriptID 625 2)
							view: 641
							posn: 151 89
							loop: 2
							cel: 0
							init:
							setCycle: StopWalk 642
						)
						((= local1 ((ScriptID 625 1) new:))
							view: 16
							posn: 22 154
							loop: 0
							cel: 1
							init:
							setCycle: StopWalk 47
						)
						(local2 cel: 1 posn: 163 152 init: setCycle: StopWalk 47)
						(= local3 146)
						(= local4 142)
						(= local5 146)
						(= local6 125)
						(= local7 125)
						(= local8 142)
						(= local9 163)
						(= local10 152)
						(self setScript: gotchaWater)
					)
					((== (Monastery deathReason?) 2)
						(gClient
							addObstacle:
								((Polygon new:)
									type: 2
									init: 164 139 161 154 140 153 140 140
									yourself:
								)
						)
						(local2 view: 585 loop: 0 cel: 0 posn: 130 139 init:)
						(= local3 154)
						(= local4 151)
						(self setScript: gotchaRing)
					)
				)
			)
			(650
				(gEgo posn: 143 143 init:)
				(proc0_2)
				(cond 
					((== (Monastery deathReason?) 1)
						((ScriptID 625 2)
							view: 641
							posn: 54 130
							loop: 1
							cel: 4
							init:
							setCycle: StopWalk 642
						)
						((= local1 ((ScriptID 625 1) new:))
							view: 16
							posn: 41 158
							loop: 0
							cel: 1
							init:
							setCycle: StopWalk 47
						)
						(local2 cel: 0 posn: 61 139 init: setCycle: StopWalk 47)
						(= local3 143)
						(= local4 143)
						(= local5 146)
						(= local6 158)
						(= local7 139)
						(= local8 145)
						(= local9 123)
						(= local10 132)
						(self setScript: gotchaWater)
					)
					((== (Monastery deathReason?) 2)
						(local2 view: 585 loop: 0 cel: 0 posn: 127 144 init:)
						(= local3 153)
						(= local4 146)
						(self setScript: gotchaRing)
					)
				)
			)
			(620
				(gEgo posn: 113 114 init:)
				(proc0_2)
				((ScriptID 625 2)
					view: 641
					posn: 227 147
					loop: 1
					cel: 0
					init:
					setCycle: StopWalk 642
				)
				((= local1 ((ScriptID 625 1) new:))
					view: 16
					posn: 95 145
					loop: 0
					cel: 0
					init:
					setCycle: StopWalk 47
				)
				(local2
					loop: 1
					cel: 0
					posn: 195 134
					init:
					setCycle: StopWalk 47
				)
				(= local3 142)
				(= local4 125)
				(= local5 200)
				(= local6 147)
				(= local7 139)
				(= local8 145)
				(= local9 148)
				(= local10 132)
				(self setScript: gotchaWater)
			)
			(else  (self setScript: gotcha))
		)
	)
	
	(method (doit)
		(if
			(and
				(== (gClient picture?) 620)
				(== (mod (++ local0) 5) 0)
			)
			(Palette 6 226 255 -1)
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(self setScript: 0)
		(super dispose:)
	)
)

(instance gotcha of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= cycles 10))
			(1 (proc806_0))
		)
	)
)

(instance gotchaWater of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= global145 23)
				(gEgo setMotion: PolyPath local3 local4 self)
			)
			(1
				((ScriptID 625 2) setMotion: PolyPath local5 local6 self)
			)
			(2
				(proc0_9 gEgo (ScriptID 625 2) self)
			)
			(3
				(proc0_9 (ScriptID 625 2) gEgo self)
			)
			(4 (= cycles 10))
			(5 (localproc_000e))
			(6
				(local1 setMotion: PolyPath local7 local8 self)
			)
			(7
				(if (== local9 163)
					(self cue:)
				else
					(local2 setMotion: PolyPath local9 local10 self)
				)
			)
			(8 (gClient newRoom: 170))
		)
	)
)

(instance gotchaRing of Script
	(properties)
	
	(method (doit)
		(if (== global11 620) (Palette 6 226 255 -1))
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= global145 20)
				(gEgo setMotion: PolyPath local3 local4 self)
			)
			(1 (proc0_9 gEgo local2 self))
			(2 (= cycles 10))
			(3 (localproc_0026))
			(4
				(local2 setCycle: CT 3 1 self)
			)
			(5 (dieSound play:))
			(6 (gClient newRoom: 170))
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
