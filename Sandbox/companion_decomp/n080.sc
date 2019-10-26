;;; Sierra Script 1.0 - (do not remove this comment)
(script# 80)
(include sci.sh)
(use n000)
(use n490)
(use n946)

(public
	hedge11 0
)

(local
	[newHedgeMaster 30]
	[local30 29] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1]
	[local59 29] = [1 1 1 1 1 1 1 1 1 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1]
	[local88 29] = [7 7 7 10 10 10 12 12 12 12 12 13 13 13 14 14 14 13 14 15 15 15 15 15 15 15 15 15 15]
	[local117 29] = [306 327 340 239 260 274 181 202 216 277 266 300 290 321 261 282 302 342 323 106 127 148 169 190 211 232 253 232 211]
	[local146 72] = [31 63 83 31 64 85 31 64 85 85 85 123 123 157 154 186 218 189 250 7 40 73 105 137 169 201 233 201 169 0 0 0 0 0 0 0 1 0 0 0 0 1 1 0 0 15 14 14 12 13 12 12 11 11 61 150 93 80 138 132 86 112 59 250 222 222 201 203 199 199 169 169]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 29)
		((= [newHedgeMaster temp0] (hedgeMaster new:))
			loop: [local30 temp0]
			cel: [local59 temp0]
			priority: [local88 temp0]
			signal: 16400
			x: [local117 temp0]
			y: [local146 temp0]
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

(instance hedge11 of HedgeRow
	(properties
		teleX 291
		teleY 66
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
					init: 105 0 229 189 200 189 78 0
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 192 87 137 1 131 0 165 0 218 75 243 75 197 1 192 0 223 0 288 87
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						260
						189
						209
						109
						294
						109
						319
						145
						319
						189
						318
						189
						277
						126
						248
						126
						289
						189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 87 261 0 297 0 319 30
					yourself:
				)
		)
	)
)
