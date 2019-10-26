;;; Sierra Script 1.0 - (do not remove this comment)
(script# 804)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n995)
(use n996)
(use n999)

(public
	egoSez 0
)

(instance egoSez of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2
				(switch gNewGuise
					(5 (proc13_4 1804 1))
					(6 (proc13_4 1804 2))
					(4 (proc13_4 1804 3))
					(1 (proc13_4 1804 6))
					(2 (proc13_4 1804 4))
					(else  (proc13_4 1804 5))
				)
			)
			(5 (proc13_4 1804 7))
			(3
				(if (proc0_5 34)
					(if
						(or
							(proc999_5
								global11
								360
								390
								400
								530
								550
								280
								290
								300
								310
								320
							)
							(and (== global11 350) (proc999_5 global130 7 9))
						)
						(proc13_4 1804 31)
					else
						((ScriptID 213) doit:)
					)
				else
					(switch gNewGuise
						(1 (proc13_4 1804 8))
						(4 (proc13_4 1804 9))
						(2 (proc13_4 1804 10))
						(3 (proc13_4 1804 10))
						(5 (proc13_4 1804 11))
						(6 (proc13_4 1804 11))
						(else  (proc13_4 1804 12))
					)
				)
			)
			(10 (proc13_4 1804 13))
			(4
				(switch param2
					(0 (proc13_4 1804 14))
					(1
						(gEgo setScript: (ScriptID 5 0))
					)
					(5 (proc13_4 1804 15))
					(18
						(switch global115
							(0
								(= global115 1)
								(proc13_4 1804 16)
								((Inv at: 18) cel: 9 loop: 2)
							)
							(1
								(= global115 0)
								(proc13_4 1804 17)
								((Inv at: 18) cel: 2 loop: 2)
							)
							(2 (proc13_4 1804 18))
						)
					)
					(10
						(switch global115
							(0
								(= global115 2)
								((Inv at: 10) cel: 8 loop: 2)
								(proc0_6 168)
								(proc13_4 1804 19)
							)
							(2
								(= global115 0)
								(proc0_7 168)
								(proc13_4 1804 20)
								((Inv at: 10) cel: 11 loop: 0)
							)
							(1 (proc13_4 1804 18))
						)
					)
					(8
						(if (proc999_5 global11 530 390 400)
							(proc13_4 1804 32)
						else
							(if (== gNewGuise 3)
								(proc13_4 1804 21)
							else
								(= gNewGuise 3)
								(proc0_2)
								(proc13_4 1804 22)
							)
							(if (== (++ global153) 4)
								(proc13_4 1804 23)
								(gEgo put: 8)
							)
							(if (== global153 1) (proc806_1 25))
						)
					)
					(3 (proc13_4 1804 24))
					(15 (proc13_4 1804 25))
					(11
						(if (proc0_5 31)
							(proc13_4 1804 26)
						else
							(proc13_4 1804 27)
						)
					)
					(12
						(global1 setScript: (ScriptID 853 1))
					)
					(13 (proc13_4 1804 28))
					(4 (proc13_4 1804 29))
					(7 (proc13_4 1804 30))
					(2 (proc13_4 1804 0))
					(9 (proc13_4 1804 0))
					(6 (proc13_4 1804 0))
					(17 (proc13_4 1804 0))
					(16 (proc13_4 1804 0))
					(14 (proc13_4 1804 0))
					(else 
						(Ego doVerb: param1 &rest)
					)
				)
			)
			(else 
				(Ego doVerb: param1 &rest)
			)
		)
		(DisposeScript 804)
	)
)
