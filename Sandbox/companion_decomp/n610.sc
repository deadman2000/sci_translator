;;; Sierra Script 1.0 - (do not remove this comment)
(script# 610)
(include sci.sh)
(use n000)
(use n013)
(use n945)
(use n946)
(use n964)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm610 0
	hiddenWisp 1
)

(local
	local0
	local1
	local2
	[newPlant 24]
	[local27 24] = [3 3 3 3 2 2 3 3 3 2 2 2 2 2 2 3 2 3 2 2 3 3 3 3]
	[local51 24] = [7 7 7 7 6 7 6 6 6 6 6 4 1 4 3 7 7 6 5 6 5 6 7 5]
	[local75 24] = [269 0 20 252 50 0 22 0 281 243 286 23 -3 281 -4 228 233 258 268 286 302 -5 37 224]
	[local99 24] = [189 24 189 28 189 189 173 12 21 19 181 17 43 17 170 189 183 175 166 36 39 34 10 12]
	[newWave 10]
	[local133 13] = [266 265 196 299 124 210 240 127 91 125 34 185 278]
	[local146 13] = [47 66 50 76 17 115 85 62 121 85 103 129 142]
	[newCloud 20]
	[local179 14] = [65 295 0 194 319 147 83 226 -27 195 60 318 98 191]
	[local193 14] = [24 22 58 51 69 62 97 108 121 140 150 172 181 201]
)
(procedure (localproc_0012)
	(if (gNewCast contains: hiddenWisp) (return))
	(if (== (= local2 (Random 1 4)) 3) (= local2 2))
	(switch local2
		(1
			(hiddenWisp
				init:
				setMotion: DPath 215 160 240 110 165 105 115 85 165 50 180 10 170 -80
			)
		)
		(2
			(hiddenWisp
				init:
				setMotion: DPath 120 150 90 120 165 90 240 70 305 105 400 100
			)
		)
		(4
			(hiddenWisp
				init:
				setMotion: DPath 210 140 230 105 185 70 105 60 45 105 -80 100
			)
		)
	)
)

(procedure (localproc_00e0 &tmp temp0)
	(= temp0 0)
	(while (< temp0 14)
		([newCloud temp0]
			x: [local179 temp0]
			y: [local193 (= [newCloud temp0] (cloud new:))]
			loop: (Random 0 1)
			init:
		)
		(global10 add: [newCloud temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(procedure (localproc_0132 &tmp temp0)
	(= temp0 0)
	(while (< temp0 24)
		([newPlant temp0]
			view: 600
			loop: [local27 temp0]
			cel: [local51 (= [newPlant temp0] (plant new:))]
			signal: 16384
			x: [local75 temp0]
			y: [local99 temp0]
			init:
		)
		(global10 add: [newPlant temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(procedure (localproc_018e &tmp temp0)
	(= temp0 0)
	(while (< temp0 13)
		((= [newWave temp0] (wave new:))
			x: [local133 temp0]
			y: [local146 temp0]
			setPri: 1
			init:
		)
		(++ temp0)
	)
)

(instance rm610 of Rm
	(properties
		picture 610
		horizon 24
	)
	
	(method (init)
		(super init:)
		(= local0 global34)
		(= global34 0)
		(localproc_0132)
		(localproc_00e0)
		(if (not (proc0_5 0)) (localproc_018e))
		(gEgo actions: (ScriptID 601 7))
		(self
			addObstacle:
				((Polygon new:)
					type: 0
					init: 0 50 0 0 117 0 117 23
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 195 0 319 0 319 47 195 23
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 161 49 161 121 183 121 189 0 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 196 189 196 181 268 155 319 155 319 189
					yourself:
				)
		)
		(if (== gNewGuise 6)
			(gClient setScript: withMonk)
		else
			(gEgo setScript: onTheWater)
		)
	)
	
	(method (doit &tmp [temp0 2] temp2)
		(if (== (mod (++ local1) 5) 0) (Palette 6 225 255 -1))
		(= temp2 (gEgo onControl: 1))
		(cond 
			((gEgo script?))
			((gEgo edgeHit?) (gEgo setScript: outtaHere))
			(
				(and
					(== global115 1)
					(not (gNewCast contains: hiddenWisp))
				)
				(localproc_0012)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(= global34 local0)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1610 2 1))
			(3 (proc13_4 1610 3 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance cloud of PicView
	(properties
		z 15
		lookStr 4
		view 590
		signal $6000
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(proc13_4 1610 5 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance plant of PicView
	(properties
		lookStr 1
	)
)

(instance wave of Prop
	(properties
		view 610
		loop 4
		signal $4000
		cycleSpeed 18
	)
	
	(method (init)
		(if (Random 0 1)
			(self setCel: (Random 0 2) setCycle: Fwd)
		else
			(self setCel: (Random 0 2) setCycle: Rev)
		)
		(super init:)
	)
)

(instance hiddenWisp of Actor
	(properties
		x 130
		y 190
		yStep 6
		view 610
		loop 3
		signal $6800
		xStep 6
		moveSpeed 12
	)
)

(instance onTheWater of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2] temp2)
		(switch (= state newState)
			(0
				(= temp2 (if (> global87 0) 2 else 3))
				(proc0_3)
				(gEgo
					view: 587
					cel: 0
					posn: 170 240
					setStep: temp2 temp2
					moveSpeed: 6
					cycleSpeed: 24
					setCycle: Walk
					looper: (ScriptID 601 6)
					signal: (& (| (gEgo signal?) $3000) $f7ff)
					init:
					setMotion: PolyPath 176 170 self
				)
			)
			(1
				(if (== global115 1) (localproc_0012))
				(proc0_4)
				(gEgo cycleSpeed: 24)
				(self dispose:)
			)
		)
	)
)

(instance outtaHere of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(switch (gEgo edgeHit?)
					(1
						(gEgo setMotion: PolyPath (gEgo x?) -5 self)
					)
					(3
						(gEgo
							setMotion: PolyPath (gEgo x?) (+ (gEgo y?) 30) self
						)
					)
					(4
						(gEgo
							setMotion: PolyPath (- (gEgo x?) 40) (gEgo y?) self
						)
					)
					(2
						(gEgo
							setMotion: PolyPath (+ (gEgo x?) 40) (gEgo y?) self
						)
					)
				)
			)
			(1
				(if
					(and
						(== global115 1)
						(== global130 13)
						(== (gEgo edgeHit?) local2)
					)
					(gClient newRoom: 700)
				else
					(gClient newRoom: 620)
				)
			)
		)
	)
)

(instance withMonk of Script
	(properties)
	
	(method (doit)
		((ScriptID 601 3)
			posn: (- ((ScriptID 601 1) x?) 36) (+ ((ScriptID 601 1) y?) 19)
			setPri: ((ScriptID 601 2) priority?)
		)
		((ScriptID 601 2)
			posn: (- ((ScriptID 601 1) x?) 70) (+ ((ScriptID 601 1) y?) 25)
		)
		((ScriptID 601 1) setPri: ((ScriptID 601 2) priority?))
		(super doit:)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(= temp0 (if (> global87 0) 2 else 3))
				(proc0_4)
				(gIconBar disable: 0 4 5)
				((ScriptID 601 1)
					setLoop: 3
					setCel: 2
					posn: 0 138
					signal: 18432
					setStep: temp0 temp0
					init:
					setMotion: MoveTo 409 53 self
				)
				((ScriptID 601 2)
					view: 585
					setLoop: 1
					cycleSpeed: 24
					posn: (- ((ScriptID 601 1) x?) 70) (+ ((ScriptID 601 1) y?) 25)
					signal: 16384
					init:
					setCycle: Fwd
				)
				((ScriptID 601 3)
					view: 22
					setLoop: 0
					setCel: 0
					illegalBits: 0
					posn: (- ((ScriptID 601 1) x?) 36) (+ ((ScriptID 601 1) y?) 19)
					signal: 16384
					init:
				)
			)
			(1
				(proc0_4)
				(gClient newRoom: 620)
			)
		)
	)
)
