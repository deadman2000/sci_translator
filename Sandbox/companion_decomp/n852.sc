;;; Sierra Script 1.0 - (do not remove this comment)
(script# 852)
(include sci.sh)
(use n992)
(use n999)


(class PPath of MoveTo
	(properties
		client 0
		caller 0
		x 0
		y 0
		dx 0
		dy 0
		b-moveCnt 0
		b-i1 0
		b-i2 0
		b-di 0
		b-xAxis 0
		b-incr 0
		completed 0
		xLast 0
		yLast 0
		pathPts 0
		intermediate 0
		value 1
		endPt 0
		dir 2
	)
	
	(method (init theClient thePathPts theCaller theIntermediate theCaller_2 theIntermediate_2)
		(= client theClient)
		(= pathPts thePathPts)
		(if (> argc 2)
			(if (IsObject theCaller)
				(= caller theCaller)
				(if (>= argc 4) (= intermediate theIntermediate))
			else
				(= value (+ (* 2 theCaller) 1))
				(= endPt (+ (* 2 theIntermediate) 1))
				(if (>= argc 5) (= caller theCaller_2))
				(if (>= argc 6) (= intermediate theIntermediate_2))
				(if (> value endPt) (= dir -2))
				(= endPt (+ endPt dir))
			)
		)
		(= x (client x?))
		(= y (client y?))
		(if (self atEnd:)
			(self moveDone:)
		else
			(self next:)
			(super init: client x y)
		)
	)
	
	(method (moveDone)
		(if (self atEnd:)
			(super moveDone:)
		else
			(if intermediate (intermediate cue: (/ value 2)))
			(self next:)
			(super init: client x y)
		)
	)
	
	(method (next)
		(= x (proc999_6 pathPts (- value 1)))
		(= y (proc999_6 pathPts value))
		(= value (+ value dir))
	)
	
	(method (atEnd)
		(return
			(cond 
				(endPt (== endPt value))
				((== (proc999_6 pathPts (- value 1)) -32768))
				(else (== (proc999_6 pathPts value) -32768))
			)
		)
	)
)
