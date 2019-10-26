;;; Sierra Script 1.0 - (do not remove this comment)
(script# 701)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n945)
(use n946)
(use n950)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm701 0
)

(local
	local0
	[newClIvy 45]
	[local46 45] = [172 178 186 178 168 164 186 178 183 175 172 153 160 168 174 172 170 166 161 156 134 139 138 131 150 130 129 160 153 143 140 143 151 144 158 151 132 142 159 168 125 155 123 146 130]
	[local91 45] = [188 139 99 66 44 20 115 152 83 168 180 186 166 148 126 113 96 79 62 34 188 175 149 119 100 74 46 24 134 22 40 65 185 162 147 112 88 78 91 180 15 37 30 18 10]
	[local136 45] = [0 0 0 0 0 0 0 0 0 0 2 2 2 2 2 2 2 2 2 2 -1 1 1 1 1 1 1 1 1 3 3 3 3 3 3 3 3 3 3 3 1 1 0 2 2]
	local181
)
(procedure (localproc_000e)
	(= local181 0)
	(while (< local181 45)
		([newClIvy local181]
			x: [local46 local181]
			y: [local91 (= [newClIvy local181] (clIvy new:))]
			setLoop: [local136 local181]
			setCel: 221
			signal: 16401
			init:
		)
		(++ local181)
	)
)

(instance rightSide of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 182 189 188 61 171 34 170 0 200 0 200 189
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
			init: 110 189 110 0 121 0 133 189
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance rm701 of Rm
	(properties
		picture 701
		horizon 20
	)
	
	(method (init)
		(if (== gHeading 702)
			(= style 13)
			(gEgo view: 709 y: 21 setCycle: Walk init:)
		else
			(= style 14)
			(gEgo view: 709 setCycle: Walk cel: 0 y: 164 init:)
		)
		(super init:)
		(= local0 global34)
		(= global34 0)
		(gRgnMusic2 fade: 0 20 12 1)
		((gIconBar at: 2) message: 1)
		(proc806_3 aTower sky rightSide leftSide)
		(localproc_000e)
		(gEgo
			xStep: 2
			yStep: 3
			setPri: 12
			signal: 16400
			ignoreHorizon:
			actions: unusualDoVerb
			setScript: enterThePicture
		)
	)
	
	(method (doit)
		(gRgnMusic setVol: (/ (gEgo y?) 2))
		(gSFX setVol: (/ (gEgo y?) 2))
		(cond 
			((gEgo script?) 0)
			((== (gEgo edgeHit?) 1) (gEgo setScript: N))
			((== (gEgo edgeHit?) 3) (gEgo setScript: S))
			((leftSide onMe: gEgo) (gEgo setScript: climbGoThere 0 0))
			((rightSide onMe: gEgo) (gEgo setScript: climbGoThere 0 1))
			(else (super doit: &rest))
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(gIconBar enable: 0)
		((gIconBar at: 2) message: 3)
		(super dispose:)
	)
	
	(method (reflectPosn)
		(return 0)
	)
)

(instance unusualDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(if (== theVerb 4) (proc13_4 1701 3 1))
	)
)

(instance aTower of Feature
	(properties
		x 212
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 212 0 229 189 0 189 0 2
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(= global34 local0)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1701 0 1))
			(3 (proc13_4 1701 0 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance sky of Feature
	(properties
		x 267
		y 94
		nsLeft 210
		nsBottom 189
		nsRight 319
		lookStr 4
	)
)

(instance clIvy of Prop
	(properties
		x 160
		y 170
		view 700
		priority 2
		signal $4011
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1701 1 1))
			(3 (proc13_4 1701 2 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (cue)
		(self stopUpd:)
	)
)

(instance climbGoThere of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1701 0)
				(gEgo
					setMotion:
						PolyPath
						(if register (- (gEgo x?) 10) else (+ (gEgo x?) 10))
						(gEgo y?)
						self
				)
			)
			(1
				(proc0_4)
				(gIconBar disable: 4 0)
				(self dispose:)
			)
		)
	)
)

(instance N of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion: MoveTo (gEgo x?) (- (gEgo y?) 55) self
				)
			)
			(1 (gClient newRoom: 702))
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
					setMotion: MoveTo (gEgo x?) (+ (gEgo y?) 30) self
				)
			)
			(1 (gClient newRoom: 700))
		)
	)
)

(instance enterThePicture of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 1))
			(1
				(proc0_4)
				(gIconBar disable: 4 0)
				(self dispose:)
			)
		)
	)
)
