;;; Sierra Script 1.0 - (do not remove this comment)
(script# 35)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge2 0
)

(local
	[newHedgeMaster 27]
	[local27 26] = [1 1 1 1 1 1 1 1 0 0 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1]
	[local53 26] = [1 1 1 1 1 1 1 1 4 4 4 5 4 5 4 5 4 5 6 15 6 2 3 3 3 3]
	[local79 26] = [94 115 135 156 177 198 219 239 108 85 129 60 149 79 168 100 184 116 4 58 16 72 77 59 7 20]
	[local105 87] = [15 47 77 109 141 173 205 235 121 121 155 155 186 183 216 215 240 239 158 252 174 69 70 70 69 70 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0 0 0 0 1 1 0 0 2 2 3 3 4 5 6 6 7 7 8 8 293 232 310 262 249 306 325 272 362 295 356 296 28 28 58 61 53 56 82 82 115 113 112 112]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 26)
		((= [newHedgeMaster temp0] (hedgeMaster new:))
			loop: 0
			cel: [local27 temp0]
			priority: [local53 temp0]
			signal: 16400
			x: [local79 temp0]
			y: [local105 temp0]
			init:
		)
		(global10 add: [newHedgeMaster temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(instance hedgeMaster of Hedge
	(properties)
)

(instance hedge2 of HedgeRow
	(properties
		teleX 20
		teleY 90
	)
	
	(method (init)
		(super init:)
		(if
		(not (if (<= 30 global12) (<= (super init:) 85)))
			(gRgnMusic number: 490 loop: -1 play:)
		else
			(gRgnMusic fade: 127 8 30 0)
		)
		(localproc_000e)
		(global2
			addObstacle:
				((Polygon new:)
					type: 2
					init: 185 189 62 1 59 0 93 0 218 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 59 189 4 108 104 108 156 189 127 189 84 123 46 123 88 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 75 0 1 2 1 2 31 24 65 50 65 31 40 62 40 86 75
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 176 0 110 28 168 28 176
					yourself:
				)
		)
	)
)
