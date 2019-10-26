;;; Sierra Script 1.0 - (do not remove this comment)
(script# 809)
(include sci.sh)
(use n000)
(use n255)
(use n999)

(public
	aboutCode 0
)

(instance aboutCode of Code
	(properties)
	
	(method (doit &tmp [temp0 100] temp100)
		(asm
			pushi    #eraseOnly
			pushi    0
			lag      global38
			send     4
			sat      temp100
			pushi    #eraseOnly
			pushi    1
			pushi    1
			lag      global38
			send     6
			pushi    3
			pushi    809
			pushi    0
			lsg      global27
			calle    proc255_4,  6
			pushi    2
			pushi    809
			pushi    1
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    2
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    3
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    4
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    5
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    6
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    7
			calle    proc255_0,  4
			pushi    2
			pushi    809
			pushi    8
			calle    proc255_0,  4
			pushi    #eraseOnly
			pushi    1
			lst      temp100
			lag      global38
			send     6
			ret     
		)
	)
)
