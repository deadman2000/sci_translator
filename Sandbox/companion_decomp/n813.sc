;;; Sierra Script 1.0 - (do not remove this comment)
(script# 813)
(include sci.sh)
(use n000)
(use n892)
(use n961)
(use n996)
(use n998)
(use n999)


(local
	[theCel 8] = [0 4 6 2 7 5 1 3]
)
(class rhEgo of Ego
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
		signal $2000
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
		edgeHit 0
		_head 0
		normal 1
		moveHead 1
		beard 0
		abnormal 1
	)
	
	(method (dispose)
		(if _head (_head dispose:))
		(if beard (beard dispose:))
		(super dispose:)
	)
	
	(method (setPri thePriority)
		(cond 
			((== argc 0) (= signal (| signal fixPriOn)) (_head setPri:))
			((== thePriority -1) (= signal (& signal $ffef)) (_head setPri: -1))
			(else
				(= priority thePriority)
				(= signal (| signal fixPriOn))
				(_head setPri: thePriority)
			)
		)
	)
	
	(method (setLoop theLoop &tmp theLooper)
		(if
			(= theLooper
				(cond 
					((== argc 0) (= signal (| signal noTurn)) 0)
					((== theLoop -1) (= signal (& signal $f7ff)) 0)
					((not (IsObject theLoop)) (= loop theLoop) (= signal (| signal noTurn)) 0)
					((& (theLoop -info-?) $8000) (theLoop new:))
					(else theLoop)
				)
			)
			(if looper (looper dispose:))
			((= looper theLooper) init: self &rest)
		)
	)
	
	(method (setCel param1)
		(= cel
			(if (>= param1 (self lastCel:))
				(self lastCel:)
			else
				param1
			)
		)
	)
	
	(method (hide)
		(if _head (_head hide:))
		(if beard (beard hide:))
		(super hide:)
	)
	
	(method (headView param1)
		(_head view: param1)
		(if (not (& (_head signal?) $0008)) (_head showSelf:))
	)
	
	(method (egoSpeed param1)
		(if argc
			(self cycleSpeed: param1 moveSpeed: param1)
		else
			(self cycleSpeed: global141 moveSpeed: global141)
		)
	)
	
	(method (userSpeed)
		(self
			cycleSpeed: (global1 egoMoveSpeed?)
			moveSpeed: (global1 egoMoveSpeed?)
		)
	)
)

(class Head of Prop
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
		cycleSpeed 180
		script 0
		cycler 0
		timer 0
		detailLevel 0
		client 0
		_cnt 0
	)
	
	(method (init param1)
		(self client: param1 ignoreActors: 1)
		(param1 _head: self)
		(super init:)
		(self hide:)
	)
	
	(method (doit)
		(cond 
			(
				(and
					(client normal?)
					(not (& (client signal?) $0008))
					(client isStopped:)
					(IsObject (client cycler?))
					(or
						((client cycler?) isKindOf: StopWalk)
						((client cycler?) isKindOf: SyncStop)
					)
					(== (client view?) ((client cycler?) vStopped?))
				)
				(if (and (& signal $0004) (not (& signal $0002)))
					(if (& (client signal?) $0004)
						(return)
					else
						(self startUpd:)
					)
				)
				(self showSelf:)
				(self lookAround:)
			)
			((not (& signal $0008)) (self hide:))
		)
		(super doit:)
	)
	
	(method (showSelf &tmp temp0)
		(if (& signal $0008)
			(= cel [theCel (client loop?)])
			(= _cnt cycleSpeed)
			(self show:)
		)
		(self x: (client x?) y: (client y?))
	)
	
	(method (doVerb theVerb param2)
		(if
			(not
				(if (and client (IsObject (client actions?)))
					((client actions?) doVerb: theVerb param2 &rest)
				)
			)
			(client doVerb: theVerb param2 &rest)
		)
	)
	
	(method (lookAround &tmp temp0)
		(if (and (client moveHead?) (< (-- _cnt) 1))
			(= _cnt cycleSpeed)
			(= cel (+ [theCel (client loop?)] (- (Random 0 2) 1)))
			(if (> cel 7) (= cel 0))
			(if (< cel 0) (= cel 7))
		)
	)
	
	(method (normalize)
		(self
			view:
				(if (proc999_5 (gEgo view?) 1 13 30 34 24 17 703)
					(gEgo view?)
				else
					(+ (gEgo view?) 1)
				)
			loop:
				(cond 
					((== gNewGuise 2) 9)
					((== (gEgo view?) 702) 4)
					(else 8)
				)
			cel: [theCel (client loop?)]
			z:
			(switch gNewGuise
				(5 38)
				(2 39)
				(3 39)
				(else  40)
			)
		)
		(if (gNewCast contains: gEgo) (self doit:))
	)
)

(class SpecialDoVerb of Code
	(properties)
	
	(method (doVerb theVerb param2 param3)
		(param3 doVerb: theVerb &rest)
	)
)

(class Beard of Prop
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
		client 0
	)
	
	(method (init param1)
		(self client: param1 ignoreActors: 1)
		(param1 beard: self)
		(super init:)
		(self hide:)
	)
	
	(method (doit)
		(cond 
			(
				(and
					(client abnormal?)
					(not (& (client signal?) $0008))
					(not (client isStopped:))
					(IsObject (client cycler?))
					(or
						((client cycler?) isKindOf: StopWalk)
						((client cycler?) isKindOf: SyncStop)
					)
					(not (== (client view?) ((client cycler?) vStopped?)))
				)
				(self showSelf:)
			)
			((not (& signal $0008)) (self hide:))
		)
		(super doit: &rest)
	)
	
	(method (showSelf)
		(self show:)
		(self
			loop: (client loop?)
			cel: (client cel?)
			x: (client x?)
			y: (client y?)
		)
	)
)
