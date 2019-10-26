;;; Sierra Script 1.0 - (do not remove this comment)
(script# 860)
(include sci.sh)
(use n000)
(use n950)
(use n998)
(use n999)


(class FairFeature of Feature
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
	)
	
	(method (onMe param1 &tmp [temp0 2])
		(return
			(if
				(or
					(proc999_5 (param1 message?) 2 5)
					(and (> (gEgo y?) 100) (> y 100))
					(and (< (gEgo y?) 95) (< y 95))
				)
				(super onMe: param1)
			else
				0
			)
		)
	)
)

(class FairActor of Actor
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $0000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 6
		script 0
		cycler 0
		timer 0
		detailLevel 0
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 6
		blocks 0
		baseSetter 0
		mover 0
		looper 0
		viewer 0
		avoider 0
		code 0
	)
	
	(method (onMe param1 &tmp [temp0 2])
		(return
			(if
				(or
					(proc999_5 (param1 message?) 2 5)
					(and (> (gEgo y?) 100) (> y 100))
					(and (< (gEgo y?) 95) (< y 95))
				)
				(super onMe: param1)
			else
				0
			)
		)
	)
)

(class FairProp of Prop
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $0000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 6
		script 0
		cycler 0
		timer 0
		detailLevel 0
	)
	
	(method (onMe param1 &tmp [temp0 2])
		(return
			(if
				(or
					(proc999_5 (param1 message?) 2 5)
					(and (> (gEgo y?) 100) (> y 100))
					(and (< (gEgo y?) 95) (< y 95))
				)
				(super onMe: param1)
			else
				0
			)
		)
	)
)

(class FairView of View
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $0101
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
	)
	
	(method (onMe param1 &tmp [temp0 2])
		(return
			(if
				(or
					(proc999_5 (param1 message?) 2 5)
					(and (> (gEgo y?) 100) (> y 100))
					(and (< (gEgo y?) 95) (< y 95))
				)
				(super onMe: param1)
			else
				0
			)
		)
	)
)
