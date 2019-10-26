;;; Sierra Script 1.0 - (do not remove this comment)
(script# 963)
(include sci.sh)
(use n964)


(class RelDPath of DPath
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
		points 0
		value 0
	)
	
	(method (setTarget)
		(asm
			pushi    #at
			pushi    1
			pTos     value
			pToa     points
			send     6
			push    
			ldi      32768
			ne?     
			bnt      code_0034
			pTos     x
			pushi    #at
			pushi    1
			pTos     value
			pToa     points
			send     6
			add     
			aTop     x
			pTos     y
			pushi    #at
			pushi    1
			ipToa    value
			push    
			pToa     points
			send     6
			add     
			aTop     y
			ipToa    value
code_0034:
			ret     
		)
	)
)
