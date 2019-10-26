;;; Sierra Script 1.0 - (do not remove this comment)
(script# 858)
(include sci.sh)
(use n000)
(use n893)
(use n950)
(use n998)
(use n999)


(local
	local0
)
(class MList of List
	(properties
		elements 0
		size 0
	)
	
	(method (maxElement param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5)
		(= temp0 (FirstNode elements))
		(= temp3 0)
		(= temp4 -32768)
		(while temp0
			(= temp1 (NextNode temp0))
			(if (not (IsObject (= temp2 (NodeValue temp0))))
				(return temp3)
			)
			(if
			(> (= temp5 (temp2 perform: param1 &rest)) temp4)
				(= temp3 temp2)
				(= temp4 temp5)
			)
			(= temp0 temp1)
		)
		(return temp3)
	)
)

(class Fighter of Actor
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
		fight 0
		opponent 0
		ticks 0
		lastTicks 0
		idleCycles 0
		parriedCycles 0
		_parts 0
		_techniques 0
		_plan 0
		_technique 0
		_strength 0
	)
	
	(method (doit)
		(super doit: &rest)
		(if ticks
			(if
				(<=
					(= ticks (- ticks (Abs (- gB_moveCnt lastTicks))))
					0
				)
				(= ticks 0)
				(= lastTicks gB_moveCnt)
			)
			(return)
		)
		(if parriedCycles (-- parriedCycles))
		(if _technique
			(_technique doit: &rest)
		else
			(++ idleCycles)
		)
		(if _plan (_plan doit: &rest))
	)
	
	(method (dispose)
		(if _parts (_parts dispose:) (= _parts 0))
		(if _techniques
			(_techniques dispose:)
			(= _techniques 0)
		)
		(if _plan (_plan dispose:) (= _plan 0))
		(super dispose: &rest)
	)
	
	(method (handleEvent pEvent)
		(if (<= _strength 0) (return 0))
		(if (super handleEvent: pEvent &rest) (return 1))
		(if parriedCycles (return 0))
		(if _techniques
			(_techniques firstTrue: #handleEvent pEvent self)
		)
		(return (if _plan (_plan handleEvent: pEvent self) else 0))
	)
	
	(method (doVerb theVerb)
		(return (if fight (return 1) else (super doVerb: theVerb &rest)))
	)
	
	(method (parts)
		(if argc
			(= _parts (if _parts else (MList new:)))
			(_parts
				add: &rest
				eachElementDo: #client self
				eachElementDo: #init
			)
		)
		(return _parts)
	)
	
	(method (techniques)
		(if argc
			(= _techniques (if _techniques else (MList new:)))
			(_techniques add: &rest eachElementDo: #client self)
		)
		(return _techniques)
	)
	
	(method (notice &tmp theScript)
		(if _plan
			(= theScript script)
			(_plan init: self)
			(= script theScript)
		)
	)
	
	(method (suffer param1 &tmp temp0 temp1 theTicks)
		(if (= temp0 (_parts firstTrue: #suffer param1))
			(= _strength (- _strength (param1 strength:)))
			(= temp1 (param1 strength:))
			(= theTicks ticks)
			(= ticks (proc999_3 parriedCycles ticks temp1))
			(self agonize: param1 temp0)
		)
	)
	
	(method (agonize)
	)
	
	(method (telegraph param1)
		(opponent notice: param1)
	)
	
	(method (inflict param1 &tmp temp0 opponentTechnique temp2 temp3)
		(if (== self ((param1 target?) client?)) (return 0))
		(if
			(or
				(not (= opponentTechnique (opponent technique:)))
				((= opponentTechnique (opponent technique:)) completed?)
			)
		else
			(= opponentTechnique 0)
		)
		(= temp2 (Random 0 100))
		(return
			(cond 
				(
					(= temp0
						(<=
							temp2
							(= temp3 (fight success: param1 opponentTechnique))
						)
					)
					(opponent suffer: param1)
					1
				)
				(
					(and
						opponentTechnique
						(== (opponentTechnique target?) (param1 target?))
					)
					(= parriedCycles (+ 96 (* 12 (param1 strength:))))
					0
				)
				(else 0)
			)
		)
	)
	
	(method (plan the_plan &tmp theScript)
		(if argc
			(= theScript script)
			(if (IsObject _plan) (_plan dispose:))
			(if (= _plan the_plan)
				((= _plan the_plan) init: self &rest)
			)
			(= script theScript)
		)
		(return _plan)
	)
	
	(method (technique the_technique &tmp theScript)
		(if argc
			(= theScript script)
			(if (IsObject _technique) (_technique dispose:))
			(if (= _technique the_technique)
				((= _technique the_technique) init: self &rest)
			)
			(= script theScript)
		)
		(return _technique)
	)
)

(class Technique of Script
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
		completed 0
		key 0
		dir 0
		view 0
		loop 0
		_strength 0
		_delay 0
		target 0
		claimed 0
		message 0
		type $0000
		_success 100
	)
	
	(method (init param1 &tmp temp0 temp1)
		(= lastTicks gB_moveCnt)
		(= completed 0)
		(if (= temp0 (if argc param1 else client))
			(= temp1
				((= temp0 (if argc param1 else client)) script?)
			)
		)
		(super init: temp0 &rest)
		(if temp0 (temp0 script: temp1))
	)
	
	(method (dispose &tmp theClient temp1)
		(= temp1 ((= theClient client) script?))
		(client _technique: 0 idleCycles: 0)
		(super dispose: &rest)
		((= client theClient) script: temp1)
	)
	
	(method (handleEvent pEvent)
		(return
			(cond 
				((pEvent claimed?) 0)
				(
					(or
						(client parriedCycles?)
						(and (client ticks?) (!= client (target client?)))
					)
				)
				(
					(or
						(and
							key
							(& (pEvent type?) evKEYBOARD)
							(== key (pEvent message?))
						)
						(and
							dir
							(& (pEvent type?) evJOYSTICK)
							(== dir (pEvent message?))
						)
						(and
							(& (pEvent type?) evMOUSEBUTTON)
							(target onMe: pEvent)
						)
					)
					(if
						(and
							(not (client script?))
							(!= (client _technique?) self)
						)
						(client technique: self)
					)
					(pEvent claimed: 1)
					1
				)
			)
		)
	)
	
	(method (suffer param1)
		(return
			(if
			(not (if (and completed target) (target onMe: param1)))
				0
			else
				1
			)
		)
	)
	
	(method (onMe)
		(target onMe: &rest)
	)
	
	(method (setTarget theTarget)
		(if argc (= target theTarget))
	)
	
	(method (success the_success)
		(if argc (= _success the_success))
		(return _success)
	)
	
	(method (strength the_strength)
		(if argc (= _strength the_strength))
		(return _strength)
	)
	
	(method (delay the_delay)
		(if argc (= _delay the_delay))
		(return _delay)
	)
)

(class Part of Feature
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
		client 0
		_strength 0
	)
	
	(method (onMe param1)
		(if
		(and (IsObject param1) (param1 respondsTo: #target))
			(== self (param1 target?))
		else
			(super onMe: param1 &rest)
		)
	)
	
	(method (suffer param1)
		(return
			(if (self onMe: param1)
				(= _strength (- _strength (param1 strength:)))
				1
			else
				0
			)
		)
	)
	
	(method (strength the_strength)
		(if argc (= _strength the_strength))
		(return _strength)
	)
)

(class Fight of Script
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
		goodGuy 0
		badGuy 0
		chanceTable 0
	)
	
	(method (init param1 theGoodGuy theBadGuy param4)
		(if (not goodGuy)
			((= goodGuy theGoodGuy) fight: self opponent: theBadGuy)
		)
		(if (not badGuy)
			((= badGuy theBadGuy) fight: self opponent: theGoodGuy)
		)
		(if argc (super init: param1 &rest))
		(goodGuy init:)
		(badGuy init:)
		(if (not chanceTable)
			((= chanceTable (Table new:))
				data: param4
				columns: ((goodGuy techniques:) size?)
				rows: ((badGuy techniques:) size?)
			)
		)
	)
	
	(method (dispose)
		(if chanceTable
			(chanceTable dispose:)
			(= chanceTable 0)
		)
		(= badGuy (= goodGuy 0))
		(super dispose: &rest)
	)
	
	(method (success param1 param2 &tmp temp0 goodGuyTechniques badGuyTechniques temp3 temp4 [temp5 3] temp8 temp9 temp10)
		(= temp0
			(if (or (< argc 2) (not param2))
				(param1 success:)
			else
				(= goodGuyTechniques (goodGuy techniques:))
				(= badGuyTechniques (badGuy techniques:))
				(if (== goodGuy (param1 client?))
					(= temp3 param1)
					(= temp4 param2)
				else
					(= temp3 param2)
					(= temp4 param1)
				)
				(= temp9 (badGuyTechniques indexOf: temp4))
				(= temp10 (goodGuyTechniques indexOf: temp3))
				(= temp8 (chanceTable at: temp9 temp10))
				(/ (* (param1 success:) (- 100 temp8)) 100)
			)
		)
	)
)
