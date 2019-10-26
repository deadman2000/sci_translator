;;; Sierra Script 1.0 - (do not remove this comment)
(script# 967)
(include sci.sh)
(use n255)
(use n992)


(class DCIcon of DIcon
	(properties
		type $0004
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 0
		view 0
		loop 0
		cel 0
		cycler 0
		cycleSpeed 6
		signal $0000
	)
	
	(method (init)
		(asm
			pushi    #init
			pushi    1
			pushSelf
			pushi    #new
			pushi    0
			class    Fwd
			send     4
			aTop     cycler
			send     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     cycler
			bnt      code_003e
			pushi    #dispose
			pushi    0
			send     4
code_003e:
			pushi    #dispose
			pushi    0
			super    DIcon,  4
			ret     
		)
	)
	
	(method (cycle &tmp temp0)
		(asm
			pToa     cycler
			bnt      code_0033
			pToa     cel
			sat      temp0
			pushi    #doit
			pushi    0
			pToa     cycler
			send     4
			pTos     cel
			lat      temp0
			ne?     
			bnt      code_0033
			pushi    #draw
			pushi    0
			self     4
code_0033:
			ret     
		)
	)
	
	(method (lastCel)
		(asm
			pushi    1
			pushSelf
			callk    NumCels,  2
			push    
			ldi      1
			sub     
			ret     
		)
	)
)
