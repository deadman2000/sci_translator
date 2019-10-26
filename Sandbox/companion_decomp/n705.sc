;;; Sierra Script 1.0 - (do not remove this comment)
(script# 705)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm705 0
)

(local
	local0
	local1
	local2
	[local3 9] = [1705 0 2 1 2 1 1 2]
	[local12 8] = [1705 6 2 1 2 1 2]
	[local20 5] = [1705 19 1 2]
	[local25 5] = [1705 21 1 1]
	[local30 4] = [1705 23 1]
	[local34 4] = [1705 24 1]
	[local38 8] = [1705 25 2 1 1 2 2]
	[local46 4] = [1705 30 1]
	[local50 6] = [1705 31 2 1 2]
	[local56 4] = [1705 34 1]
	[local60 9] = [1705 35 2 1 2 1 1 2]
	[local69 4] = [1705 43 1]
	[local73 4] = [1705 18 1]
	[local77 9] = [61 0 4 5 20 38 22 29 32]
)
(instance rm705 of Rm
	(properties
		picture 705
	)
	
	(method (init)
		(super init:)
		(squeakSound init: play:)
		(gRgnMusic number: 26 loop: -1 play:)
		(rat1 init:)
		(rat2 init:)
		(rat3 init:)
		(theKnight init: setScript: enterWindow)
		(proc806_3 theWindow theDoor theFloor theRoom)
		(gIconBar disable: 4)
		(proc0_6 34)
	)
	
	(method (doit)
		(gClient setScript: ratsDoit)
		(cond 
			((gEgo script?) 0)
			((proc0_5 110)
				(proc0_7 110)
				(gIconBar disable: 4)
				(if (proc0_5 67)
					(gEgo setScript: winKnightTrust)
				else
					(proc851_0 @local69 @local77 0 self)
				)
			)
			(else (super doit: &rest))
		)
	)
	
	(method (dispose)
		(gRgnMusic fade: 0 20 12 1)
		(DisposeScript 991)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2) (proc13_4 1705 48 1))
	)
)

(instance robDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (and (== theVerb 4) (== param2 1))
			(proc13_4 1705 42 1)
		)
	)
)

(instance theRoom of Feature
	(properties
		x 69
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 69 1 243 0 242 189 68 189
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
			(2 (proc13_4 1705 12 1))
			(3 (proc13_4 1705 46 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theFloor of Feature
	(properties
		x 82
		y 171
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 83 189 82 171 132 176 165 171 179 175 192 175 210 180 227 189
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
			(2 (proc13_4 1705 44 1))
			(3 (proc13_4 1705 45 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theWindow of Feature
	(properties
		x 90
		y 67
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 90 114 92 77 99 69 111 67 118 74 118 115
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
			(2 (proc13_4 1705 13 1))
			(3 (proc13_4 1705 14 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theDoor of Feature
	(properties
		x 174
		y 87
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 174 174 176 115 179 100 185 92 194 87 205 88 213 93 219 100 218 181
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
			(2 (proc13_4 1705 15 1))
			(3 (proc13_4 1705 16 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rat1 of Prop
	(properties
		x 100
		y 188
		lookStr 11
		view 705
		loop 5
		signal $4001
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1705 11 1))
			(3 (proc13_4 1705 47 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rat2 of Prop
	(properties
		x 95
		y 182
		lookStr 11
		view 705
		loop 2
		signal $4001
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1705 11 1))
			(3 (proc13_4 1705 47 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rat3 of Prop
	(properties
		x 107
		y 176
		lookStr 11
		view 705
		loop 5
		signal $4001
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1705 11 1))
			(3 (proc13_4 1705 47 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theKnight of Actor
	(properties
		x 195
		y 188
		view 706
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1705 17 1))
			(3
				(proc851_0 @local73 @local77 0 self)
			)
			(5
				(if (== local2 0)
					(proc851_0 @local20 2 @local77 self)
					(= local2 1)
				else
					(proc851_0 @local25 @local77 0 self)
				)
			)
			(4
				(cond 
					((proc999_5 param2 16 0 2 14) (proc851_0 @local30 @local77 0))
					((== param2 1) (proc851_0 @local34 @local77 0))
					((== param2 18)
						(if (not local1)
							(= local1 1)
							(proc851_0 @local38 2 @local77)
						else
							(proc851_0 @local46 @local77 0)
						)
					)
					((== param2 10)
						(if (not local0)
							(proc851_0 @local50 2 @local77)
						else
							(proc851_0 @local56 @local77 0)
						)
					)
					((== param2 9)
						(proc0_6 154)
						(proc806_1 100)
						(proc851_0 @local60 2 @local77)
						(gEgo put: 9)
					)
					(else (super doVerb: theVerb &rest))
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance enterWindow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					view: 708
					loop: 0
					cel: 0
					x: 99
					y: 109
					illegalBits: 0
					actions: robDoVerb
					init:
					ignoreControl: -32768
					setCycle: End self
				)
			)
			(1
				(gEgo setLoop: 0 setCel: 6 x: 98 y: 108 cycleSpeed: 36)
				(= ticks 12)
			)
			(2
				(gEgo setLoop: 1 setCel: 0 x: 137 y: 150)
				(= ticks 12)
			)
			(3
				(gEgo setLoop: 1 setCel: 2 x: 146 y: 169)
				(theKnight setLoop: 0 setCel: 1)
				(= ticks 12)
			)
			(4
				(gEgo
					setLoop: 1
					setCel: 2
					x: 150
					y: 184
					moveSpeed: 6
					cycleSpeed: 6
				)
				(= ticks 12)
			)
			(5
				(proc0_2 0 702 703)
				(= ticks 12)
			)
			(6
				(proc851_0 @local3 2 @local77 self)
			)
			(7
				(gClient
					addObstacle:
						((Polygon new:)
							type: 3
							init: 110 188 189 188 172 176 115 176
							yourself:
						)
				)
				(proc0_4)
				(gIconBar disable: 4)
				(self dispose:)
			)
		)
	)
)

(instance winKnightTrust of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc806_1 50)
				(theKnight setCycle: End self)
			)
			(1
				(proc851_0 @local12 3 @local77 self)
			)
			(2
				(gClient newRoom: 710)
				(self dispose:)
			)
		)
	)
)

(instance ratsDoit of Script
	(properties)
	
	(method (doit)
		(if (< (gEgo distanceTo: rat3) 50)
			(rat3 setCel: 0 cycleSpeed: 18 setCycle: End)
		)
		(if (< (gEgo distanceTo: rat2) 50)
			(rat2 setCel: 0 setCycle: End)
		)
		(if (< (gEgo distanceTo: rat1) 50)
			(rat1 setCel: 0 setCycle: End)
		)
	)
)

(instance squeakSound of Sound
	(properties
		flags $0001
		number 671
		loop -1
	)
)
