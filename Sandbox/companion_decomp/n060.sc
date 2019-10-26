;;; Sierra Script 1.0 - (do not remove this comment)
(script# 60)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge7 0
)

(local
	[newHedgeMaster 33]
	[local33 32] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]
	[local65 32] = [0 0 0 1 1 0 0 0 1 0 1 1 1 1 0 0 0 0 0 0 1 1 1 1 1 1]
	[local97 32] = [0 0 0 0 12 12 12 12 12 12 13 13 13 13 13 13 13 13 13 13 14 14 14 14 15 15 15 15 15 15 15 15]
	[local129 32] = [326 277 219 164 107 326 280 219 128 184 30 45 66 87 349 319 278 214 151 136 22 43 64 85 7 27 326 286 223 159 95 85]
	[local161 32] = [21 21 27 27 29 61 61 61 62 61 10 35 67 99 99 99 99 99 99 99 90 122 154 186 155 187 187 187 187 187 187 187]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 32)
		((= [newHedgeMaster temp0] (hedgeMaster new:))
			loop: [local33 temp0]
			cel: [local65 temp0]
			priority: [local97 temp0]
			signal: 16400
			x: [local129 temp0]
			y: [local161 temp0]
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

(instance hedge7 of HedgeRow
	(properties
		teleX 250
		teleY 150
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
					init: 319 188 0 188 0 135 30 178 56 178 0 93 0 33 96 178 319 178
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 102 66 102 0 0 28 0 88 89 319 89
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 63 105 63 65 1 60 0 93 0 131 52 319 52
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 29 143 29 122 0 319 0
					yourself:
				)
		)
	)
)
