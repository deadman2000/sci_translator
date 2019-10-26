;;; Sierra Script 1.0 - (do not remove this comment)
(script# 410)
(include sci.sh)
(use n000)
(use n937)
(use n950)
(use n994)
(use n999)

(public
	rm410 0
)

(local
	theGDoVerbCode
)
(instance rm410 of Rm
	(properties
		picture 410
	)
	
	(method (init)
		(super init:)
		(gEgo posn: 152 183 loop: 2 init:)
		(trapDoor init:)
		(= theGDoVerbCode gDoVerbCode)
		(= gDoVerbCode goThere)
		((IconBar at: 0) type: 16384)
		(proc0_4)
	)
	
	(method (dispose)
		((IconBar at: 0) type: 1)
		(= gDoVerbCode theGDoVerbCode)
		(super dispose:)
	)
)

(instance goThere of Code
	(properties)
	
	(method (doit param1 param2)
		(if (gClient script?) (return))
		(switch param1
			(1
				(if (== (param2 z?) 0)
					(return)
				else
					(gClient newRoom: (param2 z?))
				)
			)
			(else 
				(theGDoVerbCode doit: param1 param2)
			)
		)
	)
)

(instance trapDoor of Feature
	(properties
		z 410
		nsTop 8
		nsLeft 136
		nsBottom 20
		nsRight 192
	)
	
	(method (onMe param1)
		(return
			(if
				(and
					(<= nsLeft (param1 x?))
					(<= (param1 x?) nsRight)
					(<= nsTop (param1 y?))
				)
				(<= (param1 y?) nsBottom)
			else
				0
			)
		)
	)
)
