;;; Sierra Script 1.0 - (do not remove this comment)
(script# 893)
(include sci.sh)
(use n255)
(use n999)


(procedure (localproc_0004 param1 param2 param3 &tmp temp0)
	(= temp0 param2)
	(if (< argc 3)
		(Memory 5 (+ param1 temp0))
	else
		(Memory 6 (+ param1 temp0) param3)
	)
)

(class Table of Obj
	(properties
		data 0
		columns 1
		rows 32767
	)
	
	(method (at param1 param2)
		(if
			(and
				(< -1 param1)
				(< param1 rows)
				(< -1 param2)
				(< param2 columns)
			)
			(localproc_0004
				data
				(+ param2 (* columns param1) param2 (* columns param1))
			)
		else
			(proc255_4 893 0 name param1 param2)
			(SetDebug)
		)
	)
)
