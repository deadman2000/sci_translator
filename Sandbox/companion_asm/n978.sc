;;; Sierra Script 1.0 - (do not remove this comment)
(script# 978)
(include sci.sh)
(use n950)
(use n998)


(class RFeature of Feature
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
)

(class RPicView of PicView
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
		view 0
		loop 0
		cel 0
		priority -1
		signal $0000
		palette 0
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelWide,  6
			push    
			ldi      2
			div     
			sat      temp0
			pTos     y
			pToa     z
			sub     
			aTop     nsBottom
			pTos     x
			lat      temp0
			sub     
			aTop     nsLeft
			pTos     x
			lat      temp0
			add     
			aTop     nsRight
			pTos     y
			pTos     z
			pushi    3
			pTos     view
			pTos     loop
			pTos     cel
			callk    CelHigh,  6
			add     
			sub     
			aTop     nsTop
			pushi    #init
			pushi    0
			super    PicView,  4
			ret     
		)
	)
)
