;;; Sierra Script 1.0 - (do not remove this comment)
(script# 926)
(include sci.sh)
(use n000)
(use n999)

(public
	proc926_0 0
	proc926_1 1
)

(procedure (proc926_0 theGClientObstacles &tmp gClientObstacles)
	(cond 
		((not argc) (= gClientObstacles (gClient obstacles?)))
		((theGClientObstacles isKindOf: Collect) (= gClientObstacles theGClientObstacles))
		(else (theGClientObstacles perform: flipPoly) (return))
	)
	(gClientObstacles eachElementDo: #perform flipPoly)
	(DisposeScript 926)
)

(procedure (proc926_1 param1 &tmp temp0)
	(if (not argc)
		(gNewFeatures eachElementDo: #perform flipFeature)
	else
		(= temp0 0)
		(while (< temp0 argc)
			(if (([param1 temp0]) isKindOf: Collect)
				([param1 temp0] eachElementDo: #perform flipFeature)
			else
				([param1 temp0] perform: flipFeature)
			)
			(++ temp0)
		)
	)
	(DisposeScript 926)
)

(instance flipPoly of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2)
		(= temp1 (Memory 1 (* 4 (= temp2 (param1 size?)))))
		(= temp0 0)
		(while (< temp0 temp2)
			(Memory
				6
				(+ temp1 (* 4 temp0))
				(-
					319
					(Memory
						5
						(-
							(+ (param1 points?) (* 4 temp2))
							(+ 4 (* 4 temp0))
						)
					)
				)
			)
			(Memory
				6
				(+ temp1 (* 4 temp0) 2)
				(Memory
					5
					(-
						(+ (param1 points?) (* 4 temp2))
						(+ 2 (* 4 temp0))
					)
				)
			)
			(++ temp0)
		)
		(if (param1 dynamic?) (Memory 3 (param1 points?)))
		(param1 points: temp1 dynamic: 1)
	)
)

(instance flipFeature of Code
	(properties)
	
	(method (doit param1 &tmp temp0)
		(if (IsObject (param1 onMeCheck?))
			(proc926_0 (param1 onMeCheck?))
		else
			(= temp0 (param1 nsLeft?))
			(param1
				nsLeft: (- 320 (param1 nsRight?))
				nsRight: (- 320 temp0)
			)
		)
	)
)
