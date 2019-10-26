;;; Sierra Script 1.0 - (do not remove this comment)
(script# 401)
(include sci.sh)
(use n000)
(use n851)
(use n992)

(public
	fensScript 0
)

(local
	[local0 6] = [1401 0 2 1 1]
	[local6 11] = [1401 3 2 1 1 2 2 2 2 2]
)
(procedure (localproc_000e param1)
	(proc851_0 2 param1 999 3 12 1 &rest)
)

(instance fensScript of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_6 144)
				(localproc_000e @local0 self)
			)
			(1
				(if notKilled
					((ScriptID 400 2) loop: 2 setCycle: End self)
				else
					(self cue:)
				)
			)
			(2
				(localproc_000e @local6 self)
			)
			(3
				(gEgo setMotion: MoveTo 0 (gEgo y?))
				(self dispose:)
			)
		)
	)
)
