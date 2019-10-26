;;; Sierra Script 1.0 - (do not remove this comment)
(script# 70)
(include sci.sh)
(use n000)
(use n013)
(use n490)
(use n806)
(use n945)
(use n946)
(use n996)
(use n998)
(use n999)

(public
	hedge9 0
)

(local
	local0
	[newHedgeMaster 43]
	[local44 40] = [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1]
	[local84 40] = [1 1 1 1 1 1 2 2 2 2 2 2 4 4 4 4 4 5 5 5 7 7 7 6 7 6 6 8 8 9 9 9 9 9 9 9 10 10 10 10]
	[local124 40] = [327 264 202 138 77 16 327 264 202 140 77 16 327 264 202 140 109 348 308 245 130 66 36 216 149 326 267 152 117 322 258 226 198 194 87 106 15 35 56 170]
	[local164 54] = [45 45 45 45 45 45 83 83 83 83 83 83 115 115 115 115 115 142 142 142 142 142 142 173 173 173 173 173 173 213 213 213 213 243 203 232 179 211 243 244 0 1070 2 1 0 431 0 2 4 23 34 24 25 1]
)
(procedure (localproc_000e &tmp temp0)
	(= temp0 0)
	(while (< temp0 42)
		((= [newHedgeMaster temp0] (hedgeMaster new:))
			loop: 0
			cel: [local44 temp0]
			priority: [local84 temp0]
			signal: 16400
			x: [local124 temp0]
			y: [local164 temp0]
			init:
		)
		(global10 add: [newHedgeMaster temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(instance hedgeMaster of Hedge
	(properties)
)

(instance hedge9 of HedgeRow
	(properties
		teleX 150
		teleY 50
	)
	
	(method (init)
		(super init:)
		(if (== global130 10)
			(self north: 501)
		else
			(self north: 500)
		)
		(if
			(not
				(if (<= 30 global12)
					(<=
						(if (== global130 10)
							(self north: 501)
						else
							(self north: 500)
						)
						85
					)
				)
			)
			(gRgnMusic number: 490 loop: -1 play:)
		else
			(gRgnMusic fade: 127 8 30 0)
		)
		(localproc_000e)
		(proc806_2 theDoor)
		(global2
			addObstacle:
				((Polygon new:)
					type: 2
					init: 0 47 0 20 319 20 319 47
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 85 0 74 319 74 319 85
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 34 117 26 105 319 105 319 117
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 144 204 144 222 165 319 165 319 175 195 175 164 130 319 130
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						0
						189
						0
						130
						132
						130
						161
						175
						72
						175
						82
						189
						53
						189
						33
						160
						114
						160
						105
						146
						8
						146
						37
						189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 113 189 111 187 319 187 319 189
					yourself:
				)
		)
	)
)

(instance theDoor of PicView
	(properties
		x 168
		y 47
		view 500
		loop 2
		priority 1
		signal $4010
	)
	
	(method (init)
		(gMH add: self)
		(gKH add: self)
		(super init:)
	)
	
	(method (dispose)
		(gKH delete: self)
		(gMH delete: self)
		(super dispose:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(User canControl:)
				(User canInput:)
				(or
					(and
						(== (pEvent type?) evMOUSEBUTTON)
						(== (pEvent modifiers?) 0)
					)
					(and
						(== (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(or
					(== (gIconBar curIcon?) (gIconBar at: 0))
					(== (gIconBar curIcon?) (gIconBar at: 2))
				)
				(self onMe: pEvent)
			)
			(if (== global130 10) (proc0_6 172))
			(cond 
				((> (gEgo y?) 75) (pEvent claimed?) (proc13_4 1070 6 1))
				((== global130 10) (gEgo setScript: (ScriptID 490 2)))
				(else (pEvent claimed?) (gEgo setScript: goToDoor))
			)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(proc13_4 1070 0 0)
		else
			(super doVerb: &rest)
		)
	)
)

(instance goToDoor of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion: PolyPath (- (theDoor x?) 62) (+ (theDoor y?) 2) self
				)
			)
			(1
				(gEgo
					setMotion: PolyPath (gEgo x?) (- (gEgo y?) 1) self
				)
			)
			(2
				(= global158 0)
				(global2 newRoom: 500)
				(proc0_4)
			)
		)
	)
)
