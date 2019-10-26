;;; Sierra Script 1.0 - (do not remove this comment)
(script# 853)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n950)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	thePuzzleBox 0
	cursorPause 1
)

(local
	local0
	local1
	local2
	local3 =  1
	local4
	[local5 18] = [0 0 0 0 0 0 0 0 4950 4957 4964 4972 4979 4987 4995 5003 5013 5022]
	local23
	local24
	theGNewCast
	theGNewFeatures
	local27
	theGNewSounds
	theGMH
	theGKH
	theGDH
)
(procedure (localproc_0012)
	(newCast eachElementDo: #setCel (= local2 0))
	(theRing setCel: 11)
	(= local3 1)
)

(procedure (localproc_0032 param1)
	(Format @local1 853 0 (StrAt local4 local2))
	(clickSound play:)
	(param1 setCel: 1)
	(if (!= (StrCmp @local0 @local1) 0) (= local3 0))
	(if (and (== (++ local2) 10) (not local3))
		(global1 setScript: endIt)
	)
)

(procedure (localproc_0194 param1 param2)
	(gNewCast eachElementDo: #perform hideMe)
	(= theGNewCast gNewCast)
	(= theGNewFeatures gNewFeatures)
	(= local27 global10)
	(= theGNewSounds gNewSounds)
	(= theGMH gMH)
	(= theGKH gKH)
	(= theGDH gDH)
	(= gMH
		(= gKH
			(= gDH
				(= gNewCast
					(= gNewFeatures (= global10 (= gNewSounds 0)))
				)
			)
		)
	)
	(DrawPic param1 param2)
	((= gNewCast newCast) add:)
	((= gNewFeatures newFeatures) add:)
	((= gNewSounds newSounds) add:)
	((= gMH newMH) add: gNewCast gNewFeatures)
	((= gKH newKH) add: gNewCast gNewFeatures)
	((= gDH newDH) add: gNewCast gNewFeatures)
)

(procedure (localproc_021e)
	(gNewCast
		eachElementDo: #dispose
		eachElementDo: #delete
		release:
		dispose:
	)
	(gNewFeatures eachElementDo: #dispose release: dispose:)
	(gNewSounds eachElementDo: #dispose release: dispose:)
	(DisposeScript 806)
	(gMH dispose:)
	(gKH dispose:)
	(gDH dispose:)
	(gClient drawPic: (gClient picture?))
	(= gNewCast theGNewCast)
	(= gNewFeatures theGNewFeatures)
	(= gNewSounds theGNewSounds)
	((= global10 local27) doit:)
	(= gMH theGMH)
	(= gKH theGKH)
	(= gDH theGDH)
	(gNewCast eachElementDo: #perform showMe)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMH of EventHandler
	(properties)
)

(instance newKH of EventHandler
	(properties)
)

(instance newDH of EventHandler
	(properties)
)

(instance newSounds of EventHandler
	(properties)
	
	(method (pause param1)
		(self
			eachElementDo: #perform mightPause (if argc param1 else 1)
		)
	)
)

(instance mightPause of Code
	(properties)
	
	(method (doit param1 param2)
		(if (not (& (param1 flags?) $0001))
			(param1 pause: param2)
		)
	)
)

(instance hideMe of Code
	(properties)
	
	(method (doit param1)
		(param1 z: (+ (param1 z?) 1000))
	)
)

(instance showMe of Code
	(properties)
	
	(method (doit param1)
		(param1 z: (- (param1 z?) 1000))
	)
)

(instance thePuzzleBox of Code
	(properties)
	
	(method (doit &tmp temp0)
		(if ((ScriptID 854) doit:)
			(DisposeScript 854)
			(DisposeScript 853)
			(proc0_4)
			(return)
		)
		(DisposeScript 854)
		(= local24 global19)
		(proc0_3)
		(gIconBar disable: 8)
		(User canInput: 1)
		(= local23 global34)
		(= global34 0)
		(if (== (gIconBar curIcon?) (gIconBar at: 0))
			((gIconBar curIcon?) message: 11)
		)
		(localproc_0194 803 10)
		(proc0_6 126)
		(= temp0 0)
		(while (< temp0 10)
			(breakif (== global144 temp0))
			(++ temp0)
		)
		(theR init:)
		(theN init:)
		(theA init:)
		(theM init:)
		(theF init:)
		(theI init:)
		(theO init:)
		(theB init:)
		(theE init:)
		(theS init:)
		(theD init:)
		(theL init:)
		(theT init:)
		(theG init:)
		(theC init:)
		(theRing init:)
		(theBox init:)
		(theHand init:)
		(everything init:)
		(global1 setCursor: 5 1 180 125)
	)
	
	(method (dispose)
		(localproc_021e)
		(= global34 local23)
		(global1 setCursor: local24 1 180 125)
		(if (== (gIconBar curIcon?) (gIconBar at: 0))
			((gIconBar curIcon?) message: 1)
		)
		(proc0_4)
		(gIconBar enable: 8 enable:)
		(proc0_7 126)
		(proc0_6 127)
		(DisposeScript 853)
	)
)

(instance everything of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (handleEvent pEvent)
		(pEvent claimed: 1)
		(if
		(and (self onMe: pEvent) (not (global1 script?)))
			(thePuzzleBox dispose:)
		)
	)
)

(instance theHand of Actor
	(properties
		x 180
		y 125
		view 182
		loop 1
		priority 14
		signal $6810
		illegalBits $0000
	)
	
	(method (doit)
		(self posn: gX (- gY 10))
		(super doit:)
	)
)

(instance theBox of View
	(properties
		x 159
		y 128
		view 520
		loop 15
		priority 1
		signal $4011
	)
	
	(method (handleEvent)
		(return 0)
	)
)

(instance theR of View
	(properties
		x 124
		y 76
		view 520
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 1)
				(localproc_0032 self pEvent)
				(if (and (== local2 7) local3)
					(global1 setScript: showFireRing)
				)
			)
		)
	)
)

(instance theN of View
	(properties
		x 141
		y 76
		view 520
		loop 1
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 2)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theA of View
	(properties
		x 158
		y 76
		view 520
		loop 2
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 3)
				(localproc_0032 self pEvent)
				(if (and (== local2 8) local3)
					(global1 setScript: showFireRing)
				)
			)
		)
	)
)

(instance theM of View
	(properties
		x 175
		y 76
		view 520
		loop 3
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 4)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theF of View
	(properties
		x 192
		y 76
		view 520
		loop 4
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 5)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theI of View
	(properties
		x 124
		y 91
		view 520
		loop 5
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 6)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theO of View
	(properties
		x 141
		y 91
		view 520
		loop 6
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 7)
				(localproc_0032 self pEvent)
				(if
					(and
						local3
						(or
							(== local2 7)
							(== local2 9)
							(and (== local2 6) (!= global144 6))
						)
					)
					(global1 setScript: showFireRing)
				)
			)
		)
	)
)

(instance theB of View
	(properties
		x 158
		y 91
		view 520
		loop 7
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 8)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theE of View
	(properties
		x 175
		y 91
		view 520
		loop 8
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 9)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theS of View
	(properties
		x 192
		y 91
		view 520
		loop 9
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 10)
				(localproc_0032 self pEvent)
				(if
					(and
						local3
						(or (== local2 6) (== local2 7) (== local2 9))
					)
					(global1 setScript: showFireRing)
				)
			)
		)
	)
)

(instance theD of View
	(properties
		x 124
		y 106
		view 520
		loop 10
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 11)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theL of View
	(properties
		x 141
		y 106
		view 520
		loop 11
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 12)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theT of View
	(properties
		x 158
		y 106
		view 520
		loop 12
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 13)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theG of View
	(properties
		x 175
		y 106
		view 520
		loop 13
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 14)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theC of View
	(properties
		x 192
		y 106
		view 520
		loop 14
		signal $4001
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent)
			(pEvent claimed: 1)
			(if (and (not (global1 script?)) (!= cel 1))
				(Format @local0 853 15)
				(localproc_0032 self pEvent)
			)
		)
	)
)

(instance theRing of Actor
	(properties
		x 159
		y 97
		view 771
		cel 11
		priority 1
		signal $6810
	)
)

(instance showFireRing of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(localproc_0012)
				(= ticks 30)
			)
			(2
				(proc13_4 1853 0 self)
				(theRing setMotion: MoveTo (theRing x?) 60 self)
			)
			(3)
			(4 (proc13_4 1853 1 self))
			(5
				(proc13_4 1853 2 self)
				(proc806_1 (if (proc0_5 5) 10 else 100))
				(theRing hide:)
			)
			(6
				(gEgo get: 10 put: 12)
				(proc13_4 1853 3 self)
			)
			(7 (proc13_4 1853 4 self))
			(8
				(proc0_6 101)
				(self dispose:)
				(thePuzzleBox dispose:)
			)
		)
	)
)

(instance endIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(localproc_0012)
				(= ticks 30)
			)
			(2 (proc13_4 1853 5 self))
			(3 (self dispose:))
		)
	)
)

(instance clickSound of Sound
	(properties
		flags $0001
		number 521
	)
)

(instance cursorPause of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(thePuzzleBox doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= cycles 3))
			(1 (self dispose:))
		)
	)
)
