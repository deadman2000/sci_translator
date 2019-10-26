;;; Sierra Script 1.0 - (do not remove this comment)
(script# 55)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge6 0
)

(local
	[newHedgeMaster 40]
	[local40 39] = [1 0 1 0 0 0 0 0 1 1 1 1 0 1 1 0 0 0 1 1 0 1 1 1 1 0 0 0 1 0 0 0 1 1 0 0 0 1 1]
	[local79 39] = [0 0 0 0 0 0 0 0 1 1 1 1 2 2 2 2 2 2 3 3 4 4 4 4 4 4 4 5 5 5 5 6 6 6 6 7 7 15 7]
	[local118 39] = [333 313 354 257 194 131 67 37 275 296 317 335 215 235 243 154 91 45 289 310 174 193 207 228 249 109 44 133 154 68 38 88 110 130 26 59 27 201 80]
	[local157 39] = [78 45 109 45 45 45 45 45 79 111 143 171 83 117 129 83 83 83 201 233 115 147 169 201 233 115 115 142 176 142 142 173 207 237 173 213 213 252 247]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 39)
		((= [newHedgeMaster temp0] (hedgeMaster new:))
			loop: 0
			cel: [local40 temp0]
			priority: [local79 temp0]
			signal: 16400
			x: [local118 temp0]
			y: [local157 temp0]
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

(instance hedge6 of HedgeRow
	(properties
		teleX 39
		teleY 177
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
					init: 319 174 311 174 228 47 0 47 0 2 319 2 319 91 290 47 270 47 319 109
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 149 117 0 117 0 99 175 99 234 189 196 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 107 144 0 144 0 130 138 130 166 175 128 175
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 66 175 0 175 0 165 92 165 112 189 75 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 189 85 0 85 0 74 215 74 257 131 218 131
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 257 189 239 164 279 164 297 188 319 188 319 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 187 53 187 56 189 0 189
					yourself:
				)
		)
	)
)
