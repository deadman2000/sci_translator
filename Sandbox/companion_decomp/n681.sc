;;; Sierra Script 1.0 - (do not remove this comment)
(script# 681)
(include sci.sh)
(use n000)
(use n013)
(use n625)
(use n851)
(use n945)
(use n989)
(use n999)

(public
	talky 0
	youGotIeiunus 1
	youGotIneptus 2
	youGotCogito 3
	youGotMalitia 4
	youGotVocalis 5
	youGotHilaris 6
	youGotDeformis 7
)

(local
	[local0 4] = [1680 0 1]
)
(instance talky of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 120))
			(1
				(proc851_0 @local0 (Monastery tFULK?) 0 self)
			)
			(2
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance youGotIeiunus of Script
	(properties)
	
	(method (dispose)
		(secretSound dispose:)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 87 126 self)
			)
			(1 (secretSound play: self))
			(2 (proc13_4 1680 2 self))
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance youGotIneptus of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 69 134 self)
			)
			(1 (proc13_4 1680 40 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance youGotCogito of Script
	(properties)
	
	(method (dispose)
		(secretSound dispose:)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 69 134 self)
			)
			(1 (secretSound play: self))
			(2 (proc13_4 1680 52 self))
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance youGotMalitia of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 69 134 self)
			)
			(1
				(proc13_4 1680 50 self 67 160 142)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance youGotVocalis of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 87 126 self)
			)
			(1 (proc13_4 1680 53 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance youGotHilaris of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 126 131 self)
			)
			(1 (proc13_4 1680 54 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance youGotDeformis of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 681)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 126 131 self)
			)
			(1 (proc13_4 1680 51 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance secretSound of Sound
	(properties
		flags $0001
		number 21
	)
)
