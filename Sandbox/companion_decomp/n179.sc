;;; Sierra Script 1.0 - (do not remove this comment)
(script# 179)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n994)
(use n999)

(public
	synop 0
)

(local
	local0
	local1
)
(procedure (localproc_000e param1)
	(gSFX2 number: 916 loop: 1 play:)
	(= global15 (+ global15 param1))
	((ScriptID 0 1) doit:)
)

(procedure (localproc_0032)
	(cond 
		((<= global138 22) (proc806_5 -7))
		((<= global138 24) (proc806_5 -5))
		((<= global138 27) (proc806_5 -3))
		((<= global138 30) (proc806_5 -2))
		((<= global138 33) (proc806_5 -1))
		(else (proc806_5 0))
	)
	((ScriptID 0 1) doit:)
)

(procedure (localproc_00aa)
	(cond 
		((<= global138 27) (proc806_5 -7))
		((<= global138 30) (proc806_5 -5))
		((<= global138 33) (proc806_5 -4))
		(else (proc806_5 -2))
	)
	((ScriptID 0 1) doit:)
)

(procedure (localproc_00fb)
	(cond 
		((<= global138 25) (proc806_5 -7))
		((<= global138 27) (proc806_5 -8))
		((<= global138 30) (proc806_5 -6))
		((<= global138 33) (proc806_5 -5))
		(else (proc806_5 -3))
	)
	((ScriptID 0 1) doit:)
)

(procedure (localproc_0160)
	(cond 
		((<= global138 27) (proc806_5 -7))
		((<= global138 30) (proc806_5 -9))
		((<= global138 33) (proc806_5 -7))
		(else (proc806_5 -4))
	)
	((ScriptID 0 1) doit:)
)

(instance synop of Rm
	(properties
		picture 803
		style $0008
	)
	
	(method (init)
		(super init:)
		(= local1 0)
		(if (== global12 176) (= local1 1))
		(self setScript: whatHappened)
	)
	
	(method (dispose)
		(DisposeScript 806)
		(super dispose: &rest)
	)
)

(instance whatHappened of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch global146
					(10
						(proc806_5 -2)
						(proc806_1 200)
						(proc13_4 1179 0 self)
					)
					(11
						(proc806_5 -3)
						(proc806_1 150)
						(proc13_4 1179 1 self)
					)
					(12
						(proc806_5 -5)
						(proc806_1 50)
						(proc13_4 1179 2 self)
					)
					(13
						(proc806_5 -7)
						(proc806_1 25)
						(proc13_4 1179 3 self)
					)
					(20
						(proc806_5 -2)
						(proc806_1 200)
						(proc13_4 1179 4 self)
					)
					(21
						(proc806_5 -3)
						(proc806_1 150)
						(proc13_4 1179 5 self)
					)
					(22
						(proc806_5 -5)
						(proc806_1 50)
						(proc13_4 1179 2 self)
					)
					(23
						(proc806_5 -7)
						(proc806_1 25)
						(proc13_4 1179 3 self)
					)
					(30
						(proc806_5 0)
						(proc806_1 500)
						(proc13_4 1179 24)
						(proc13_4 1179 11 self)
					)
					(31
						(proc806_5 -2)
						(proc806_1 400)
						(proc13_4 1179 13)
						(proc13_4 1179 11 self)
					)
					(32
						(proc806_5 -3)
						(proc806_1 300)
						(proc13_4 1179 14)
						(proc13_4 1179 11 self)
					)
					(34
						(proc806_5 -4)
						(proc806_1 100)
						(proc13_4 1179 15)
						(proc13_4 1179 11 self)
					)
					(33
						(proc806_5 -5)
						(proc806_1 50)
						(proc13_4 1179 16)
						(proc13_4 1179 11 self)
					)
					(40
						(proc806_5 -2)
						(proc806_1 500)
						(proc13_4 1179 12)
						(proc13_4 1179 11 self)
					)
					(41
						(proc806_5 -3)
						(proc806_1 400)
						(proc13_4 1179 13)
						(proc13_4 1179 11 self)
					)
					(42
						(proc806_5 -5)
						(proc806_1 300)
						(proc13_4 1179 14)
						(proc13_4 1179 11 self)
					)
					(44
						(proc806_5 -6)
						(proc806_1 100)
						(proc13_4 1179 15)
						(proc13_4 1179 11 self)
					)
					(43
						(proc806_5 -7)
						(proc806_1 50)
						(proc13_4 1179 16)
						(proc13_4 1179 11 self)
					)
					(50
						(proc806_5 -2)
						(proc806_1 200)
						(proc13_4 1179 12)
						(proc13_4 1179 11 self)
					)
					(51
						(proc806_5 -3)
						(proc806_1 150)
						(proc13_4 1179 13)
						(proc13_4 1179 11 self)
					)
					(52
						(proc806_5 -5)
						(proc806_1 75)
						(proc13_4 1179 14)
						(proc13_4 1179 11 self)
					)
					(54
						(proc806_5 -6)
						(proc806_1 50)
						(proc13_4 1179 15)
						(proc13_4 1179 11 self)
					)
					(53
						(proc806_5 -7)
						(proc806_1 25)
						(proc13_4 1179 16)
						(proc13_4 1179 11 self)
					)
					(60
						(localproc_00fb)
						(if local1
							(proc13_4 1179 23 self)
						else
							(localproc_000e 500)
							(proc806_4 -15536)
							(proc13_4 1179 19 self)
						)
					)
					(61
						(localproc_00aa)
						(if local1
							(proc13_4 1179 23 self)
						else
							(localproc_000e 500)
							(proc806_4 -15536)
							(proc13_4 1179 18 self)
						)
					)
					(62
						(localproc_0160)
						(if local1
							(proc13_4 1179 23 self)
						else
							(localproc_000e 500)
							(proc806_4 -15536)
							(proc13_4 1179 20 self)
						)
					)
					(64
						(localproc_0032)
						(localproc_000e 500)
						(proc806_4 -15536)
						(proc13_4 1179 17 self)
					)
					(65 (proc806_5 -7) (= ticks 6))
				)
			)
			(1
				(cond 
					((and (<= 30 global146) (<= global146 54)) (global2 newRoom: 210))
					((<= global146 23) (global2 newRoom: 250))
					(else (global2 newRoom: 160))
				)
				(self dispose:)
			)
		)
	)
)
