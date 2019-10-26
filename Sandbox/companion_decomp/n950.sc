;;; Sierra Script 1.0 - (do not remove this comment)
(script# 950)
(include sci.sh)
(use n000)
(use n255)
(use n945)
(use n999)


(class CueObj of Script
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
		theVerb 0
		theInvItem 0
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(gEgo
					setHeading:
						(GetAngle (gEgo x?) (gEgo y?) (client x?) (client y?))
						self
				)
				(global78 add: self)
			)
			(2 (= cycles 3))
			(3
				(global78 delete: self)
				(if
					(not
						(if (and client (IsObject (client actions?)))
							((client actions?) doVerb: theVerb theInvItem)
						)
					)
					(client doVerb: theVerb theInvItem)
				)
				(= state 0)
			)
		)
	)
)

(class Feature of Obj
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
	
	(method (init param1)
		(cond 
			((and argc param1) (self perform: param1))
			(gFtrInit (self perform: gFtrInit))
		)
		(if (self respondsTo: #underBits)
			(gNewCast add: self)
		else
			(gNewFeatures add: self)
		)
	)
	
	(method (dispose)
		(if actions (actions dispose:) (= actions 0))
		(if (IsObject onMeCheck)
			(onMeCheck dispose:)
			(= onMeCheck 0)
		)
		(gNewFeatures delete: self)
		(super dispose:)
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(cond 
			((pEvent claimed?) (return 1))
			(
				(and
					(== (pEvent type?) 16384)
					(self onMe: pEvent)
					(self isNotHidden:)
				)
				(CueObj
					state: 0
					cycles: 0
					client: self
					theVerb: (pEvent message?)
					theInvItem:
						(if
							(and
								gIconBar
								(== (pEvent message?) JOY_DOWNRIGHT)
								global9
							)
							(global9 indexOf: (gIconBar curInvIcon?))
						else
							0
						)
				)
				(pEvent claimed: 1)
				(if
					(and
						(global80 canControl:)
						(!= _approachVerbs 26505)
						(&
							_approachVerbs
							(<< $0001 (- (pEvent message?) JOY_UP))
						)
					)
					(gEgo
						setMotion: PolyPath approachX (+ (gEgo z?) approachY) CueObj
					)
				else
					(gEgo setMotion: 0)
					(CueObj changeState: 3)
				)
			)
		)
		(return (pEvent claimed?))
	)
	
	(method (doVerb theVerb)
		((if gDoVerbCode else dftDoVerb)
			doit: theVerb self &rest
		)
	)
	
	(method (notFacing &tmp temp0)
		(gEgo setMotion: 0)
		(CueObj client: self state: 0 cycles: 0 cue:)
	)
	
	(method (facingMe param1 &tmp temp0 temp1)
		(= temp0 (if argc param1 else gEgo))
		(if
			(>
				(= temp1
					(Abs
						(-
							(GetAngle (temp0 x?) (temp0 y?) x y)
							(temp0 heading?)
						)
					)
				)
				180
			)
			(= temp1 (- 360 temp1))
		)
		(return
			(if (<= temp1 sightAngle)
				(return 1)
			else
				(self notFacing:)
				(return 0)
			)
		)
	)
	
	(method (isNotHidden)
		(return 1)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(if (IsObject param1)
			(= temp0 (param1 x?))
			(= temp1 (param1 y?))
		else
			(= temp0 param1)
			(= temp1 param2)
		)
		(return
			(cond 
				((IsObject onMeCheck) (AvoidPath temp0 temp1 onMeCheck))
				(
					(or
						(not (if (or nsLeft nsRight nsTop) else nsBottom))
						(and
							(<= nsLeft temp0)
							(<= temp0 nsRight)
							(<= nsTop temp1)
							(<= temp1 nsBottom)
						)
					)
					(if (!= onMeCheck 26505)
						(& onMeCheck (OnControl 4 temp0 temp1))
					else
						1
					)
				)
			)
		)
	)
	
	(method (approachVerbs param1 &tmp temp0)
		(= temp0 (= _approachVerbs 0))
		(while (< temp0 argc)
			(if param1
				(self
					_approachVerbs:
						(|
							(self _approachVerbs?)
							(<< $0001 (- [param1 temp0] 1))
						)
				)
			)
			(++ temp0)
		)
	)
)

(instance dftDoVerb of Code
	(properties)
	
	(method (doit param1 param2 param3 &tmp temp0 temp1)
		(= temp0 (param2 description?))
		(switch param1
			(2
				(if (param2 lookStr?)
					(proc255_0 (param2 lookStr?))
				else
					(proc255_4 950 0 temp0 temp0)
				)
			)
			(4
				(if (= temp1 (global9 at: param3))
					(proc255_4
						950
						1
						((= temp1 (global9 at: param3)) description?)
						temp0
					)
				)
			)
			(5 (proc255_4 950 2 temp0))
		)
	)
)
