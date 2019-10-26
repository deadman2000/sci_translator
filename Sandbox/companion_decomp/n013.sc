;;; Sierra Script 1.0 - (do not remove this comment)
(script# 13)
(include sci.sh)
(use n000)
(use n255)
(use n999)

(public
	proc13_0 0
	proc13_1 1
	proc13_2 2
	proc13_4 4
	proc13_5 5
	proc13_6 6
	proc13_7 7
)

(local
	local0
	local1
	[local2 4]
	local6
)
(procedure (proc13_0 param1 param2 &tmp temp0)
	(if global25 (global25 dispose:))
	(localproc_002a 0 param1 param2)
	(= temp0 (if (> [local2 2] 24) 200 else 0))
	(cond 
		((== argc 1) (proc255_0 param1 70 temp0 30 1))
		((u< param1 1000) (proc255_0 param1 param2 70 temp0 30 1 &rest))
		(else (proc255_0 param1 70 temp0 30 1 param2 &rest))
	)
)

(procedure (proc13_1 param1)
	(proc13_0 param1 &rest 67 -1 5)
)

(procedure (proc13_2 param1 &tmp temp0)
	(localproc_002a 0 param1 &rest)
	(= temp0 [local2 2])
	(proc13_0 param1 &rest 67 -1 (- 170 temp0))
)

(procedure (proc13_4 param1 param2 param3 &tmp [temp0 200])
	(if global25 (global25 dispose:))
	(= local6 (== global19 5))
	(GetFarText param1 param2 @temp0)
	(= local0 (+ global162 (* global163 (StrLen @temp0))))
	(cond 
		((< argc 3)
			(global1 setCursor: 5 (not (HaveMouse)))
			(proc13_0 @temp0 67 -1 5)
			(proc13_7)
		)
		(
		(and (IsObject param3) (param3 respondsTo: #notKilled))
			(if (not (param3 notKilled?))
				(param3 cue: 0)
			else
				(global1 setCursor: 5 (not (HaveMouse)))
				(stopMessage init: param3)
				(proc13_0
					@temp0
					67
					-1
					5
					108
					stopMessage
					25
					(proc999_3 (/ local0 60) 3)
					&rest
				)
			)
		)
		((IsObject param3)
			(global1 setCursor: 5 (not (HaveMouse)))
			(stopMessage init: param3)
			(proc13_0
				@temp0
				67
				-1
				5
				25
				(proc999_3 (/ local0 60) 3)
				108
				stopMessage
				&rest
			)
		)
		((== param3 1)
			(global1 setCursor: 5 (not (HaveMouse)))
			(stopMessage init: 0)
			(proc13_0
				@temp0
				67
				-1
				5
				25
				(proc999_3 (/ local0 60) 3)
				108
				stopMessage
				&rest
			)
		)
		(else
			(global1 setCursor: 5 (not (HaveMouse)))
			(proc13_0 @temp0 67 -1 5 param3 &rest)
			(proc13_7)
		)
	)
)

(procedure (proc13_5 param1 param2 param3 &tmp [temp0 200])
	(if global25 (global25 dispose:))
	(= local6 (== global19 5))
	(GetFarText param1 param2 @temp0)
	(= local0 (+ global162 (* global163 (StrLen @temp0))))
	(cond 
		((< argc 3)
			(global1 setCursor: 5 (not (HaveMouse)))
			(proc13_2 @temp0)
			(proc13_7)
		)
		(
		(and (IsObject param3) (param3 respondsTo: #notKilled))
			(if (not (param3 notKilled?))
				(param3 cue: 0)
			else
				(global1 setCursor: 5 (not (HaveMouse)))
				(stopMessage init: param3)
				(proc13_2 @temp0 108 stopMessage 25 (/ local0 60) &rest)
			)
		)
		((IsObject param3)
			(global1 setCursor: 5 (not (HaveMouse)))
			(stopMessage init: param3)
			(proc13_2 @temp0 25 (/ local0 60) 108 stopMessage &rest)
		)
		((== param3 1)
			(global1 setCursor: 5 (not (HaveMouse)))
			(stopMessage init: 0)
			(proc13_2 @temp0 25 (/ local0 60) 108 stopMessage &rest)
		)
		(else
			(global1 setCursor: 5 (not (HaveMouse)))
			(proc13_2 @temp0 param3 &rest)
			(proc13_7)
		)
	)
)

(procedure (proc13_6 param1)
	(if (u> param1 33) (= param1 33))
	(global38
		color:
			(switch param1
				(0 global187)
				(1 global180)
				(2 global176)
				(3 global184)
				(4 global181)
				(5 global172)
				(6 global176)
				(7 global172)
				(8 global180)
				(9 global172)
				(10 global185)
				(11 global177)
				(12 global177)
				(13 global177)
				(14 global182)
				(15 global171)
				(16 global171)
				(17 global184)
				(18 global171)
				(19 global171)
				(20 global185)
				(21 global175)
				(22 global185)
				(23 global180)
				(24 global185)
				(25 global183)
				(26 global183)
				(27 global170)
				(28 global183)
				(29 global185)
				(30 global175)
				(31 global184)
				(32 global170)
				(33 global184)
			)
		back:
			(switch param1
				(0 global186)
				(1 global176)
				(2 global180)
				(3 global176)
				(4 global176)
				(5 global184)
				(6 global185)
				(7 global180)
				(8 global172)
				(9 global185)
				(10 global171)
				(11 global180)
				(12 global181)
				(13 global185)
				(14 global176)
				(15 global181)
				(16 global178)
				(17 global171)
				(18 global183)
				(19 global184)
				(20 global176)
				(21 global184)
				(22 global177)
				(23 global174)
				(24 global171)
				(25 global175)
				(26 global176)
				(27 global180)
				(28 global170)
				(29 global170)
				(30 global181)
				(31 global174)
				(32 global185)
				(33 global175)
			)
	)
)

(procedure (proc13_7 &tmp temp0)
	(= temp0
		(if (& (global9 state?) $0020) global9 else gIconBar)
	)
	(global1
		setCursor:
			(cond 
				(local6 5)
				(global143 global21)
				(else ((temp0 curIcon?) cursor?))
			)
			1
	)
)

(procedure (localproc_002a param1 param2 &tmp temp0 [temp1 500])
	(if (u< (= temp0 param2) 1000)
		(= temp0 @temp1)
		(Format @temp1 param2 &rest)
	)
	(if param1
		(= local1 (StrLen temp0))
	else
		(TextSize @[local2 0] temp0 global22 0)
	)
)

(instance stopMessage of Script
	(properties)
	
	(method (init theCaller)
		(= register 1)
		(= caller theCaller)
		(gKH addToFront: self)
		(gMH addToFront: self)
	)
	
	(method (cue)
		(gKH delete: self)
		(gMH delete: self)
		(proc13_7)
		(if (IsObject caller) (caller cue: register))
	)
	
	(method (handleEvent pEvent)
		(pEvent claimed: 1)
		(if
			(or
				(and
					(& (pEvent modifiers?) emSHIFT)
					(& (pEvent type?) evMOUSEBUTTON)
				)
				(and
					(& (pEvent type?) evKEYBOARD)
					(== (pEvent message?) KEY_ESCAPE)
				)
			)
			(= register 0)
		)
		(if global25 (global25 dispose:))
	)
)
