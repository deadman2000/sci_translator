;;; Sierra Script 1.0 - (do not remove this comment)
(script# 927)
(include sci.sh)
(use n945)
(use n946)
(use n999)


(class PAvoider of Code
	(properties
		client 0
	)
	
	(method (init theClient)
		(if (>= argc 1) (= client theClient))
	)
	
	(method (doit &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 clientMover temp9 temp10 temp11 temp12)
		(if
			(and
				(= clientMover (client mover?))
				(IsObject
					(= temp2 ((= clientMover (client mover?)) doit:))
				)
				(not (clientMover completed?))
				(clientMover isKindOf: PolyPath)
				(IsObject ((clientMover) obstacles?))
			)
			(= temp4
				(-
					(temp2 brLeft?)
					(= temp0
						(+
							(* 2 (client xStep?))
							(/
								(proc999_3
									(CelWide (client view?) 2 0)
									(CelWide (client view?) 0 0)
								)
								2
							)
						)
					)
				)
			)
			(= temp5
				(-
					(CoordPri 1 (CoordPri (temp2 y?)))
					(= temp1 (* (client yStep?) 2))
				)
			)
			(= temp6 (+ (temp2 brRight?) temp0))
			(= temp7 (+ (temp2 y?) temp1))
			(if (temp2 mover?)
				(= temp9 (temp2 heading?))
				(= temp10
					(*
						(= temp12
							(proc999_2
								(/
									(* 60 (+ (temp2 moveSpeed?) 1))
									(* 10 (+ (client moveSpeed?) 1))
								)
								20
							)
						)
						(client xStep?)
					)
				)
				(= temp11 (* temp12 (client yStep?)))
				(= temp0 (SinMult temp9 temp10))
				(= temp1 (- (CosMult temp9 temp11)))
				(cond 
					((< temp0 0) (= temp4 (+ temp4 temp0)))
					((> temp0 0) (= temp6 (+ temp6 temp0)))
				)
				(cond 
					((< temp1 0) (= temp5 (+ temp5 temp0)))
					((> temp1 0) (= temp7 (+ temp7 temp0)))
				)
			)
			((clientMover obstacles?)
				add:
					(= temp3
						((Polygon new:)
							init:
								temp4
								temp5
								temp6
								temp5
								(+ temp6 (client xStep?))
								(temp2 y?)
								temp6
								temp7
								temp4
								temp7
								(- temp4 (client xStep?))
								(temp2 y?)
							type: 2
							name: {isBlockedPoly}
							yourself:
						)
					)
			)
			(clientMover
				value: 2
				init: client (clientMover finalX?) (clientMover finalY?)
			)
			((clientMover obstacles?) delete: temp3)
			(temp3 dispose:)
		)
	)
)
