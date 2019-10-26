;;; Sierra Script 1.0 - (do not remove this comment)
(script# 12)
(include sci.sh)
(use n000)
(use n998)
(use n999)

(public
	MapButton 0
)

(class MapButton of View
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
	
	(method (init)
		(super init:)
		(gMH add: self)
		(gKH add: self)
	)
	
	(method (dispose)
		(gMH delete: self)
		(gKH delete: self)
		(super dispose:)
	)
	
	(method (handleEvent pEvent &tmp newEvent)
		(return
			(cond 
				(
					(or
						(not (== ((gIconBar curIcon?) message?) 11))
						(not (self onMe: pEvent))
						(& (pEvent modifiers?) emSHIFT)
						(& (pEvent modifiers?) emCTRL)
					)
					(super handleEvent: pEvent)
				)
				((& (pEvent type?) evMOUSEBUTTON)
					(pEvent claimed: 1)
					(self cel: 1 draw:)
					(while
						(and
							(= newEvent (Event new:))
							(!= ((= newEvent (Event new:)) type?) 2)
						)
						(newEvent localize:)
						(cond 
							((self onMe: newEvent) (if (not cel) (self cel: 1 draw:)))
							(cel (self cel: 0 draw:))
						)
						(newEvent dispose:)
					)
					(newEvent dispose:)
					(if cel
						(self cel: 0 draw:)
						(gIconBar select: (gIconBar at: 0))
						(global2 newRoom: heading)
					else
						(return 0)
					)
				)
				(
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
					(self cel: 1 draw:)
					(gIconBar select: (gIconBar at: 0))
					(global2 newRoom: heading)
					(pEvent claimed: 1)
					(return 1)
				)
				(else (super handleEvent: pEvent))
			)
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(if (IsObject param1)
			(= temp0 (param1 x?))
			(= temp1 (param1 y?))
		else
			(= temp0 param1)
			(= temp1 param2)
		)
		(if global25 0 else (super onMe: temp0 temp1))
	)
	
	(method (draw)
		(DrawCel view loop cel nsLeft nsTop -1)
	)
)
