;;; Sierra Script 1.0 - (do not remove this comment)
(script# 565)
(include sci.sh)
(use n000)
(use n013)
(use n564)
(use n806)
(use n851)
(use n992)
(use n998)
(use n999)

(public
	peephole 0
)

(local
	theGNewCast
	theGNewFeatures
	local2
	theGMH
	local4
	local5
	[newCoins 15]
)
(procedure (localproc_0062 param1 param2)
	(gNewCast eachElementDo: #perform hideMe)
	(= theGNewCast gNewCast)
	(= theGNewFeatures gNewFeatures)
	(= local2 global10)
	(= theGMH gMH)
	(= gMH (= gNewCast (= gNewFeatures (= global10 0))))
	(gClient drawPic: param1 param2)
	((= gNewCast newCast) add:)
	((= gNewFeatures newFeatures) add:)
	((= gMH newMDH) add: gNewFeatures)
	(proc13_6 19)
)

(procedure (localproc_00bd)
	(proc13_6 0)
	(gNewCast
		eachElementDo: #dispose
		eachElementDo: #delete
		release:
		dispose:
	)
	(gNewFeatures dispose:)
	(gMH dispose:)
	(gClient drawPic: (gClient picture?) 10)
	(= gNewCast theGNewCast)
	(= gNewFeatures theGNewFeatures)
	((= global10 local2) doit:)
	(= gMH theGMH)
	(gNewCast eachElementDo: #perform showMe)
	(Animate (gNewCast elements?) 0)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMDH of EventHandler
	(properties)
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

(instance peephole of Code
	(properties)
	
	(method (doit)
		(proc0_3)
		(localproc_0062 565 10)
		(cond 
			((== global130 10) (gClient setScript: dayTenScript))
			((proc0_5 213) (gClient setScript: allDone))
			((proc0_5 195) (gClient setScript: allDone))
			((and (== gHeading 570) (proc0_5 125))
				(if (not (proc0_5 214))
					(gClient setScript: guardsDoneDrinking)
				else
					(gClient setScript: randomScript)
				)
			)
			((and (proc0_5 125) (not (proc0_5 214))) (gClient setScript: guardsDoneDrinkingTwo))
			((proc0_5 125) (gClient setScript: randomScript))
			(
			(and (not (gEgo has: 13)) (not (proc0_5 125)))
				(if (TheDungeon firstLook?)
					(gClient setScript: rogerEnter)
				else
					(gClient setScript: randomScript)
				)
			)
			((proc0_5 31)
				(if (TheDungeon firstLook?)
					(gClient setScript: rogerEnter)
				else
					(gClient setScript: randomScript)
				)
			)
			((not (TheDungeon timerHasFired?)) (gClient setScript: rogerPace))
			(
				(or
					((ScriptID 564 1) seconds?)
					((ScriptID 564 3) seconds?)
				)
				(gClient setScript: shortTimerScript)
			)
			((not (TheDungeon coinsLeft?))
				(if (TheDungeon firstShortTimer?)
					(gClient setScript: tryAgain)
				else
					(gClient setScript: noMoreChances)
				)
			)
			((not (TheDungeon longTimerGone?))
				(cond 
					((< (TheDungeon valueCoins?) 14)
						(if ((ScriptID 564 2) seconds?)
							(gClient setScript: goneForAle)
						else
							(gClient setScript: longTimerOne)
						)
					)
					(((ScriptID 564 2) seconds?) (gClient setScript: goneForAle))
					(else (gClient setScript: longTimerTwo))
				)
			)
			((not (TheDungeon boysRescued?)) (gClient setScript: randomScript))
			(else (gClient setScript: randomScript))
		)
	)
	
	(method (dispose)
		(localproc_00bd)
		(DisposeScript 565)
	)
)

(instance roger of Actor
	(properties
		view 753
		signal $0001
	)
)

(instance giles of Actor
	(properties
		view 753
		signal $0001
	)
)

(instance coins of View
	(properties
		x 138
		y 112
		view 570
		loop 3
	)
)

(instance dayTenScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc13_4 1565 0)
				(= cycles 1)
			)
			(1
				(TheDungeon guardsGone: 1)
				(TheDungeon timeToDie: 0)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance randomScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local4 (Random 1 3))
				(giles view: 565 posn: 163 136 setPri: 9 init:)
				(switch local4
					(1
						(roger posn: (Random 111 191) (Random 123 130))
					)
					(2
						(roger posn: (Random 111 119) (Random 123 147))
					)
					(3
						(roger posn: (Random 106 148) (Random 145 147))
					)
				)
				(roger loop: (Random 0 4) init:)
				(= cycles 10)
			)
			(1
				(cond 
					((proc0_5 125) (proc13_4 1565 6 80 {Roger}) (proc13_5 1565 7 80 {Giles}))
					((or (not (gEgo has: 13)) (proc0_5 31)) (proc13_4 1565 1 80 {Roger}) (proc13_5 1565 2 80 {Giles}))
					(else
						(proc13_4 1565 3 80 {Roger})
						(proc13_5 1565 4 80 {Giles})
						(proc13_6 0)
						(proc13_4 1565 5)
					)
				)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance rogerEnter of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(giles view: 565 posn: 163 136 setPri: 9 init:)
				(roger
					posn: 102 105
					setCycle: Walk
					init:
					setMotion: MoveTo 143 128 self
				)
			)
			(1
				(proc13_4 1565 8 self 80 {Roger})
			)
			(2
				(proc13_5 1565 9 self 80 {Giles})
			)
			(3
				(proc13_4 1565 10 self 80 {Roger})
			)
			(4
				(proc13_5 1565 11 self 80 {Giles})
			)
			(5
				(proc13_4 1565 12 self 80 {Roger})
			)
			(6
				(proc13_5 1565 13 self 80 {Giles})
			)
			(7
				(proc13_4 1565 14 self 80 {Roger})
			)
			(8
				(proc13_5 1565 15 self 80 {Giles})
			)
			(9
				(roger setMotion: MoveTo 85 128 self)
			)
			(10 (= seconds 3))
			(11
				(roger setMotion: MoveTo 143 128 self)
			)
			(12
				(proc13_4 1565 16 self 80 {Roger})
			)
			(13
				(proc13_5 1565 17 self 80 {Giles})
			)
			(14
				(proc13_4 1565 18 self 80 {Roger})
			)
			(15
				(proc13_5 1565 19 self 80 {Giles})
			)
			(16
				(TheDungeon firstLook: 0)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance rogerPace of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(giles posn: 153 146 cycleSpeed: 6 init:)
				(roger posn: 93 128 setCycle: Walk init:)
				(proc0_9 giles roger self)
			)
			(1
				(roger setMotion: MoveTo 215 128 self)
			)
			(2
				(roger setMotion: MoveTo 93 128 self)
			)
			(3
				(roger setMotion: MoveTo 215 128 self)
			)
			(4
				(roger setMotion: MoveTo 143 128 self)
			)
			(5
				(proc13_5 1565 20 1 80 {Giles})
				(roger setMotion: MoveTo 93 128 self)
			)
			(6
				(roger setMotion: MoveTo 143 128 self)
			)
			(7
				(proc13_4 1565 21 1 80 {Roger})
				(roger setMotion: MoveTo 215 128 self)
			)
			(8
				(roger setMotion: MoveTo 143 128 self)
			)
			(9
				(proc13_5 1565 22 self 80 {Giles})
			)
			(10
				(proc13_4 1565 23 self 80 {Roger})
			)
			(11
				(proc13_5 1565 24 self 80 {Giles})
			)
			(12
				(proc13_4 1565 25 self 80 {Roger})
			)
			(13
				(proc13_5 1565 26 self 80 {Giles})
			)
			(14
				(proc13_4 1565 27 self 80 {Roger})
			)
			(15
				(proc13_5 1565 28 self 80 {Giles})
			)
			(16 (= cycles 1))
			(17
				(proc13_4 1565 29 self 80 {Roger})
			)
			(18
				(proc13_5 1565 30 self 80 {Giles})
			)
			(19
				(proc13_4 1565 31 self 80 {Roger})
			)
			(20
				(proc13_5 1565 32 self 80 {Giles})
			)
			(21
				(proc13_4 1565 33 self 80 {Roger})
			)
			(22
				(proc13_5 1565 34 self 80 {Giles})
			)
			(23
				(proc13_4 1565 35 self 80 {Roger})
			)
			(24
				(roger setMotion: MoveTo 102 105)
				(= seconds 4)
			)
			(25
				(proc13_5 1565 36 80 {Giles})
				(giles setCycle: Walk setMotion: MoveTo 116 146 self)
			)
			(26
				(giles setMotion: MoveTo 117 128 self)
			)
			(27
				(giles setMotion: MoveTo 135 120 self)
			)
			(28
				(giles setMotion: MoveTo 92 107 self)
			)
			(29
				((ScriptID 564 1) seconds: 15)
				(TheDungeon setScript: (ScriptID 564 1))
				(TheDungeon neverBefore: 1)
				(TheDungeon timeToDie: 0)
				(TheDungeon guardsGone: 1)
				(TheDungeon timerHasFired: 1)
				(TheDungeon firstShortTimer: 1)
				(proc0_6 212)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance shortTimerScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (TheDungeon coinsLeft?)
					(= local5 1)
					(while
						(and
							(<= local5 (TheDungeon numberCoins?))
							(< local5 15)
						)
						((= [newCoins local5] (coins new:))
							setPri: 11
							init:
							posn: (Random 133 163) (Random 109 113)
						)
						(++ local5)
					)
				)
				(= cycles 1)
			)
			(1
				(proc13_4 1565 37)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance tryAgain of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(giles posn: 187 144 setCycle: Walk init:)
				(roger posn: 114 145 setCycle: Walk init:)
				(proc0_9 roger giles)
				(proc0_9 giles roger)
				(proc13_4 1565 38 self 80 {Roger})
			)
			(1
				(proc13_5 1565 39 self 80 {Giles})
			)
			(2
				(proc13_4 1565 40 self 80 {Roger})
			)
			(3
				(proc13_5 1565 41 self 80 {Giles})
			)
			(4
				(proc13_4 1565 42 self 80 {Roger})
			)
			(5
				(proc13_5 1565 43 self 80 {Giles})
			)
			(6
				(giles setMotion: MoveTo 152 146 self)
			)
			(7
				(roger setMotion: MoveTo 117 128)
				(giles setMotion: MoveTo 116 146 self)
			)
			(8
				(giles setMotion: MoveTo 117 128)
				(roger setMotion: MoveTo 135 120 self)
			)
			(9
				(roger setMotion: MoveTo 102 105)
				(giles setMotion: MoveTo 135 120 self)
			)
			(10
				(giles setMotion: MoveTo 92 107 self)
			)
			(11
				((ScriptID 564 1) seconds: 15)
				(TheDungeon setScript: (ScriptID 564 1))
				(TheDungeon neverBefore: 1)
				(TheDungeon timeToDie: 0)
				(TheDungeon guardsGone: 1)
				(TheDungeon timerHasFired: 1)
				(TheDungeon firstShortTimer: 0)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance noMoreChances of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger posn: 130 124 init:)
				(giles posn: 142 147 init:)
				(proc0_9 giles roger)
				(proc0_9 roger giles)
				(proc13_4 1565 44 self 80 {Roger})
			)
			(1
				(proc13_5 1565 45 self 80 {Giles})
			)
			(2
				(proc13_4 1565 46 self 80 {Roger})
			)
			(3
				(proc0_6 195)
				(TheDungeon tooLate: 1)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance allDone of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger posn: 135 120 init:)
				(giles view: 565 posn: 163 136 setPri: 9 init:)
				(proc13_6 0)
				(proc13_4 1565 47)
				(= cycles 1)
			)
			(1
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance goneForAle of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (not (TheDungeon coinsDoneBeenTook?))
					(= local5 1)
					(while
						(and
							(<= local5 (TheDungeon numberCoins?))
							(< local5 15)
						)
						((= [newCoins local5] (coins new:))
							setPri: 11
							init:
							posn: (Random 133 163) (Random 109 113)
						)
						(++ local5)
					)
				)
				(= cycles 2)
			)
			(1
				(proc13_4 1565 48)
				(= cycles 1)
			)
			(2
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance longTimerOne of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger posn: 130 124 setCycle: Walk init:)
				(giles posn: 151 147 setCycle: Walk init:)
				(proc0_9 roger giles)
				(proc0_9 giles roger)
				(coins setPri: 9 init:)
				(proc13_5 1565 49 self 80 {Giles})
			)
			(1
				(proc13_4 1565 50 self 80 {Roger})
			)
			(2
				(proc13_5 1565 51 self 80 {Giles})
			)
			(3
				(proc13_4 1565 52 self 80 {Roger})
			)
			(4
				(proc13_5 1565 53 self 80 {Giles})
			)
			(5
				(proc13_4 1565 54 self 80 {Roger})
			)
			(6
				(proc13_5 1565 55 self 80 {Giles})
			)
			(7
				(proc13_4 1565 56 self 80 {Roger})
			)
			(8
				(giles setMotion: MoveTo 138 146 self)
			)
			(9
				(coins dispose:)
				(TheDungeon coinsDoneBeenTook: 1)
				(roger setMotion: MoveTo 117 128)
				(giles setMotion: MoveTo 116 146 self)
			)
			(10
				(giles setMotion: MoveTo 117 128)
				(roger setMotion: MoveTo 135 120 self)
			)
			(11
				(roger setMotion: MoveTo 102 105)
				(giles setMotion: MoveTo 135 120 self)
			)
			(12
				(giles setMotion: MoveTo 92 107 self)
			)
			(13
				((ScriptID 564 2) seconds: 60)
				(TheDungeon setScript: (ScriptID 564 2))
				(TheDungeon neverBefore: 1)
				(TheDungeon timeToDie: 0)
				(TheDungeon guardsGone: 1)
				(TheDungeon timerHasFired: 1)
				(proc806_1 50)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance longTimerTwo of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger posn: 130 124 setCycle: Walk init:)
				(giles posn: 151 147 setCycle: Walk init:)
				(proc0_9 roger giles)
				(proc0_9 giles roger)
				(coins setPri: 9 init:)
				(proc13_4 1565 57 self 80 {Roger})
			)
			(1
				(proc13_5 1565 58 self 80 {Giles})
			)
			(2
				(proc13_4 1565 59 self 80 {Roger})
			)
			(3
				(proc13_5 1565 60 self 80 {Giles})
			)
			(4
				(proc13_4 1565 61 self 80 {Roger})
			)
			(5
				(proc13_5 1565 62 self 80 {Giles})
			)
			(6
				(proc13_4 1565 63 self 80 {Roger})
			)
			(7
				(proc13_5 1565 64 self 80 {Giles})
			)
			(8
				(proc13_4 1565 65 self 80 {Roger})
			)
			(9
				(giles setMotion: MoveTo 138 146 self)
			)
			(10
				(coins dispose:)
				(TheDungeon coinsDoneBeenTook: 1)
				(roger setMotion: MoveTo 117 128)
				(giles setMotion: MoveTo 116 146 self)
			)
			(11
				(giles setMotion: MoveTo 117 128)
				(roger setMotion: MoveTo 135 120 self)
			)
			(12
				(roger setMotion: MoveTo 102 105)
				(giles setMotion: MoveTo 135 120 self)
			)
			(13
				(giles setMotion: MoveTo 92 107 self)
			)
			(14
				(proc806_1 100)
				((ScriptID 564 2) seconds: 60)
				(TheDungeon setScript: (ScriptID 564 2))
				(TheDungeon neverBefore: 1)
				(TheDungeon timeToDie: 0)
				(TheDungeon guardsGone: 1)
				(TheDungeon timerHasFired: 1)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance guardsDoneDrinking of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger
					posn: 102 105
					setCycle: Walk
					init:
					setMotion: MoveTo 135 120 self
				)
			)
			(1
				(giles posn: 92 107 setCycle: Walk init:)
				(roger setMotion: MoveTo 117 128)
				(giles setMotion: MoveTo 135 120 self)
			)
			(2
				(roger setMotion: MoveTo 116 146)
				(giles setMotion: MoveTo 117 128 self)
			)
			(3
				(roger setMotion: MoveTo 152 146 self)
			)
			(4
				(proc0_9 roger giles)
				(proc0_9 giles roger)
				(= cycles 1)
			)
			(5
				(proc13_4 1565 66 self 80 {Roger})
			)
			(6
				(proc13_5 1565 67 self 80 {Giles})
			)
			(7
				(proc13_4 1565 68 self 80 {Roger})
			)
			(8
				(proc13_5 1565 69 self 80 {Giles})
			)
			(9
				(proc13_4 1565 70 self 80 {Roger})
			)
			(10
				(proc13_5 1565 71 self 80 {Giles})
			)
			(11
				(proc0_6 214)
				(TheDungeon firstAfterRescue: 0)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)

(instance guardsDoneDrinkingTwo of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(roger posn: 121 141 init:)
				(giles posn: 173 130 init:)
				(proc0_9 giles roger)
				(proc0_9 roger giles)
				(= cycles 1)
			)
			(1
				(proc13_4 1565 72 self 80 {Roger})
			)
			(2
				(proc13_5 1565 73 self 80 {Giles})
			)
			(3
				(proc13_4 1565 74 self 80 {Roger})
			)
			(4
				(proc13_5 1565 75 self 80 {Giles})
			)
			(5
				(proc13_4 1565 76 self 80 {Roger})
			)
			(6
				(proc13_5 1565 77 self 80 {Giles})
			)
			(7
				(proc0_6 214)
				(TheDungeon firstAfterRescue: 0)
				(proc0_4)
				(self dispose:)
				(peephole dispose:)
			)
		)
	)
)
