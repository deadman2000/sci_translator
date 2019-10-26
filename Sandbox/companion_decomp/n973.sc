;;; Sierra Script 1.0 - (do not remove this comment)
(script# 973)
(include sci.sh)
(use n000)
(use n999)


(class Timer of Obj
	(properties
		cycleCnt -1
		seconds -1
		ticksToDo -1
		lastTime -1
		client 0
	)
	
	(procedure (localproc_0004 &tmp theClient)
		(= theClient client)
		(= client 0)
		(if (IsObject theClient)
			(if (theClient respondsTo: #timer) (theClient timer: 0))
			(if (theClient respondsTo: #cue) (theClient cue:))
		)
	)
	
	
	(method (new)
		(return (if (== self Timer) (super new:) else self))
	)
	
	(method (init theClient)
		(= client theClient)
		(global7 add: self)
		(if (theClient respondsTo: #timer)
			(if (IsObject (theClient timer?))
				((theClient timer?) dispose:)
			)
			(theClient timer: self)
		)
	)
	
	(method (doit &tmp theLastTime)
		(cond 
			((!= cycleCnt -1) (if (not (-- cycleCnt)) (localproc_0004)))
			((!= seconds -1)
				(if (!= lastTime (= theLastTime (GetTime 1)))
					(= lastTime theLastTime)
					(if (not (-- seconds)) (localproc_0004))
				)
			)
			(
				(or
					(u< (+ ticksToDo lastTime) (GetTime))
					(and
						(u> lastTime (GetTime))
						(u> (+ ticksToDo lastTime) lastTime)
					)
				)
				(localproc_0004)
			)
		)
	)
	
	(method (dispose)
		(if
		(and (IsObject client) (client respondsTo: #timer))
			(client timer: 0)
		)
		(= client 0)
	)
	
	(method (set param1 param2 param3 param4 &tmp temp0 temp1 temp2 [temp3 50])
		(if (== (= temp2 global3) 0) (= temp2 1))
		(= temp1 (/ (* param2 60) temp2))
		(if (> argc 2)
			(= temp1 (+ temp1 (/ (* param3 3600) temp2)))
		)
		(if (> argc 3)
			(= temp1 (+ temp1 (* (/ (* param4 3600) temp2) 60)))
		)
		((= temp0 (if (& -info- $8000) (self new:) else self))
			init: param1
			cycleCnt: temp1
		)
		(return temp0)
	)
	
	(method (setCycle theCycler sendParams &tmp temp0)
		((= temp0 (if (& -info- $8000) (self new:) else self))
			init: theCycler
			cycleCnt: sendParams
		)
		(return temp0)
	)
	
	(method (setReal param1 param2 param3 param4 &tmp temp0 temp1)
		(= temp1 param2)
		(if (> argc 2) (= temp1 (+ temp1 (* param3 60))))
		(if (> argc 3) (= temp1 (+ temp1 (* param4 3600))))
		((= temp0 (if (& -info- $8000) (self new:) else self))
			init: param1
			seconds: temp1
		)
		(return temp0)
	)
	
	(method (delete)
		(if (== client 0)
			(global7 delete: self)
			(super dispose:)
		)
	)
	
	(method (set60ths param1 param2 &tmp temp0)
		(= lastTime (GetTime))
		(= temp0 (if (& -info- $8000) (self new:) else self))
		(temp0
			init: param1
			ticksToDo: param2
			lastTime: (GetTime)
		)
		(return temp0)
	)
)

(class TO of Obj
	(properties
		timeLeft 0
	)
	
	(method (doit)
		(if timeLeft (-- timeLeft))
	)
	
	(method (set theTimeLeft)
		(= timeLeft theTimeLeft)
	)
)
