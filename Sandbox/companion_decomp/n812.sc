;;; Sierra Script 1.0 - (do not remove this comment)
(script# 812)
(include sci.sh)
(use n000)
(use n255)
(use n992)
(use n994)
(use n996)
(use n999)


(instance controls of Controls
	(properties)
)

(class StdRoom of Rm
	(properties
		script 0
		number 0
		timer 0
		keep 0
		initialized 0
		lookStr 0
		picture 0
		style $ffff
		horizon 0
		controls 0
		north 0
		east 0
		south 0
		west 0
		curPic 0
		picAngle 0
		vanishingX 160
		vanishingY -30000
		obstacles 0
		tpX 160
		tpY 160
	)
	
	(method (init param1)
		(if (not (if (and script argc) param1))
			(proc0_2 &rest)
			((gEgo cycler?) doit:)
			((gEgo _head?) showSelf:)
		)
		(cond 
			((or script (and argc param1)) (gEgo edgeHit: 0 init:) (super init:))
			((not ((User alterEgo?) edgeHit?))
				(gEgo x: tpX y: tpY init:)
				(self style: 100)
				(super init:)
			)
			(else
				(walkIn register: (gEgo edgeHit?))
				(super init:)
				(self setScript: walkIn)
			)
		)
	)
	
	(method (doit &tmp temp0)
		(cond 
			(script (script doit:))
			((= temp0 ((User alterEgo?) edgeHit?)) (self setScript: walkOut 0 temp0))
		)
	)
)

(instance walkIn of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 gEgoX gEgoY temp4 temp5)
		(switch (= state newState)
			(0
				(proc0_3)
				(= temp5 25)
				(= temp4
					(CelWide (gEgo view?) (gEgo loop?) (gEgo cel?))
				)
				(= temp0 (= gEgoX (gEgo x?)))
				(= temp1 (= gEgoY (gEgo y?)))
				(switch register
					(1 (= temp1 (+ 189 temp5)))
					(3 (= temp1 (- gEgoY 2)))
					(2 (= temp0 (- 0 temp4)))
					(4 (= temp0 (+ 319 temp4)))
				)
				(gEgo
					edgeHit: 0
					posn: temp0 temp1
					ignoreActors: 1
					init:
					setMotion: MoveTo gEgoX gEgoY self
				)
			)
			(1
				(proc0_4)
				(gEgo ignoreActors: 0)
				(client setScript: 0)
			)
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY)
		(switch (= state newState)
			(0
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(switch register
					(1 (= gEgoY (- gEgoY 10)))
					(3 (= gEgoY (+ gEgoY 20)))
					(2 (= gEgoX (+ gEgoX 17)))
					(4 (= gEgoX (- gEgoX 17)))
				)
				(proc0_3)
				(gEgo ignoreActors: 1 setMotion: MoveTo gEgoX gEgoY self)
			)
			(1
				(client setScript: 0)
				(gClient newRoom: (gClient edgeToRoom: register))
			)
		)
	)
)
