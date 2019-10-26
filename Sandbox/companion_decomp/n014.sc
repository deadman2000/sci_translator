;;; Sierra Script 1.0 - (do not remove this comment)
(script# 14)
(include sci.sh)
(use n937)


(class RhIconItem of IconI
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
	)
	
	(method (highlight param1 &tmp theNsTop theNsLeft temp2 temp3 temp4)
		(if (not (& signal $0020)) (return))
		(= temp4
			(if (and argc param1) highlightColor else lowlightColor)
		)
		(= theNsTop nsTop)
		(= theNsLeft nsLeft)
		(= temp2 (- nsBottom 2))
		(= temp3 (- nsRight 1))
		(Graph
			grDRAW_LINE
			theNsTop
			theNsLeft
			theNsTop
			temp3
			temp4
			-1
			-1
		)
		(Graph grDRAW_LINE theNsTop temp3 temp2 temp3 temp4 -1 -1)
		(Graph
			grDRAW_LINE
			temp2
			temp3
			temp2
			theNsLeft
			temp4
			-1
			-1
		)
		(Graph
			grDRAW_LINE
			temp2
			theNsLeft
			theNsTop
			theNsLeft
			temp4
			-1
			-1
		)
		(Graph
			grUPDATE_BOX
			(- nsTop 2)
			(- nsLeft 2)
			nsBottom
			(+ nsRight 3)
			1
		)
	)
	
	(method (onMe param1 &tmp temp0)
		(if (& signal $0004) 0 else (super onMe: param1 &rest))
	)
)
