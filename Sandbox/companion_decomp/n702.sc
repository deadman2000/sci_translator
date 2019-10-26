;;; Sierra Script 1.0 - (do not remove this comment)
(script# 702)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm702 0
)

(local
	[local0 2]
	local2
	local3
	[newClIvy 20]
	[local24 20] = [93 117 88 96 101 110 125 155 139 157 165 184 161 138 143 142 138 101 94 129]
	[local44 20] = [157 164 181 170 148 189 178 139 156 161 173 189 187 183 189 171 152 183 166 158]
	[local64 20] = [1 1 1 1 1 1 1 0 0 0 0 0 0 0 2 2 2 3 3 3]
	local84
	[local85 6] = [1702 6 1 1 2]
	[local91 5] = [1702 9 1 2]
)
(procedure (localproc_000e)
	(= local84 0)
	(while (< local84 20)
		([newClIvy local84]
			x: [local24 local84]
			y: [local44 (= [newClIvy local84] (clIvy new:))]
			setLoop: [local64 local84]
			setCel: 221
			setPri: 10
			signal: 16401
			init:
		)
		(++ local84)
	)
)

(instance rm702 of Rm
	(properties
		picture 702
		style $000e
	)
	
	(method (init)
		(gRgnMusic stop:)
		(gSFX stop:)
		(gEgo setCycle: Walk cel: 0 y: 164 signal: 16384 init:)
		(super init:)
		(gIconBar disable: 0 4)
		((gIconBar at: 2) message: 1)
		(= local3 global34)
		(= global34 0)
		(proc806_3 theWindow theIvy topTower)
		(localproc_000e)
		(= local2 1)
		(gClient setScript: monksTalk)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 0 189 0 0 319 0 319 189 163 189 134 107 102 107 100 172 124 189
					yourself:
				)
		)
	)
	
	(method (doit)
		(cond 
			((gEgo script?) 0)
			((> (gEgo y?) 185) (gEgo setScript: S))
			((<= (gEgo y?) 162) (proc806_1 25) (gClient newRoom: 705))
			((< (gEgo x?) 90) (gEgo setScript: climbGoThere))
			((> (gEgo x?) 170) (gEgo setScript: climbGoThere))
			(else (super doit: &rest))
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(= local3 global34)
		(gIconBar enable: 0)
		((gIconBar at: 2) message: 3)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(proc13_4 1702 13 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
	
	(method (reflectPosn)
		(return 0)
	)
)

(instance unusualDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(if (== theVerb 4) (proc13_4 1702 12 1))
	)
)

(instance topTower of Feature
	(properties
		x 89
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 12 41 47 18 89 8 136 10 177 23 197 34 208 189 0 189 0 91 15 76
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
			(proc13_4 1702 1 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance theWindow of Feature
	(properties
		x 154
		y 102
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 102 154 100 111 116 102 127 103 136 111 138 153
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1702 2 1))
			(3
				(gEgo setScript: climbInWindow)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theIvy of Feature
	(properties
		x 148
		y 153
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 134 153 148 165 142 188 131 188 129 179 113 170 105 155
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
			(proc13_4 1702 11 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance rightSide of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 140 135 156 117 169 124 160 137 199 189 186 189 153 141 156 131
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance leftSide of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 96 189 70 171 75 138 99 122 100 135 86 143 82 166 112 188
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance clIvy of Prop
	(properties
		view 700
		priority 2
		signal $4011
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1702 11 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
	
	(method (cue)
		(self stopUpd:)
	)
)

(instance monk1 of Actor
	(properties
		view 16
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1702 4 1))
			(3 (proc13_4 1702 5 1))
			(5
				(gEgo setScript: foooolishhhh)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance monk2 of Actor
	(properties
		view 16
		loop 5
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1702 4 1))
			(3 (proc13_4 1702 5 1))
			(5
				(gEgo setScript: foooolishhhh)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance climbGoThere of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1702 0)
				(cond 
					((<= (gEgo x?) 95)
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 10) (gEgo y?) self
						)
					)
					((>= (gEgo x?) 165)
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 10) (gEgo y?) self
						)
					)
					(else (self cue:))
				)
			)
			(1
				(if (not (proc0_5 40))
					(gClient setScript: monksTalk)
				else
					(= ticks 12)
				)
			)
			(2
				(proc0_4)
				(gIconBar disable: 0 4)
				(self dispose:)
			)
		)
	)
)

(instance monksTalk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(monk1 posn: 149 39 illegalBits: 0 init:)
				(monk2 posn: 160 30 init: illegalBits: 0)
				(gEgo
					signal: 16384
					actions: unusualDoVerb
					setMotion: MoveTo 137 183 self
				)
			)
			(1
				(gEgo setMotion: MoveTo 140 183)
				(if (not (proc0_5 40))
					(proc0_6 40)
					(proc851_0 @local91 11 11 self)
				else
					(= ticks 12)
				)
			)
			(2
				(proc0_4)
				(gIconBar disable: 0 4)
				(= ticks 66)
			)
			(3
				(monk1 setMotion: MoveTo 40 39 self)
			)
			(4
				(monk2 setMotion: MoveTo 60 30 self)
			)
			(5
				(monk1 setMotion: MoveTo 149 39 self)
			)
			(6
				(monk2 setMotion: MoveTo 169 30 self)
			)
			(7 (self changeState: 2))
		)
	)
)

(instance climbInWindow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((gIconBar at: 2) message: 3)
				(gEgo setMotion: MoveTo 155 162 self)
			)
			(1
				(gEgo setLoop: 2 setCel: 0 setPri: 12 signal: 16)
				(= ticks 12)
			)
			(2
				(proc806_1 25)
				(self dispose:)
			)
		)
	)
)

(instance S of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 25) self
				)
			)
			(1 (gClient newRoom: 701))
		)
	)
)

(instance foooolishhhh of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local85 3 11 self)
			)
			(1 (gClient newRoom: 710))
		)
	)
)
