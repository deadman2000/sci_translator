;;; Sierra Script 1.0 - (do not remove this comment)
(script# 750)
(include sci.sh)
(use n000)
(use n013)
(use n225)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n958)
(use n961)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	sweepRgn 0
	proc750_1 1
	proc750_2 2
	proc750_3 3
)

(local
	[local0 4]
	local4
	[local5 12]
	[newSherMan 9]
	local26
	local27
	local28
	newSherMan_2
	local30
	local31
	local32
	gClientPicture
	[local34 4] = [1750 0 1]
	[local38 5] = [1750 1 1 1]
	[local43 5] = [1750 5 1 2]
	[local48 4] = [1750 5 1]
	[local52 4] = [1750 21 1]
	[local56 20] = [1750 22 1 0 1750 28 1 0 1750 42 1 0 1750 44 1 0 1750 46 1]
	[local76 10] = [1750 34 2 1 2 1 2 1 2]
	[local86 9] = [1750 48 3 1 2 2 3 3]
	[local95 8] = [1750 54 1 3 1 3 2]
	[local103 7] = [1750 23 2 1 3 3]
	[local110 15] = [1750 7 1 2 3 2 3 1 3 0 1750 29 1 1]
	[local125 6] = [1750 31 1 2 3]
	[local131 9] = [-1 16296 19]
	[local140 40] = [0 100 66 100 0 90 66 90 0 100 66 100 110 85 110 100 0 92 66 93 0 179 28 179 280 81 280 245 40 245 40 82 -20 100 330 100 330 100 -20 100]
	[local180 40] = [0 185 50 170 0 85 50 95 0 185 50 170 320 85 275 100 0 185 60 171 160 270 160 210 160 81 160 245 160 245 160 81 -20 135 330 135 330 135 -20 135]
	[local220 44] = [320 135 295 142 320 100 295 102 200 245 165 185 320 135 275 140 320 150 295 142 330 175 295 175 40 79 40 245 280 245 280 79 -30 180 330 180 330 180 -20 180 0 179 330 179]
	local264
	local265
	local266
	local267
	local268
)
(procedure (proc750_1 &tmp [temp0 2])
	(cond 
		((== global11 180)
			(cond 
				((== gGEgoEdgeHit 3) (= gGEgoEdgeHit 4))
				((== gGEgoEdgeHit 1) (= gGEgoEdgeHit 2))
				(else (= gGEgoEdgeHit 2))
			)
		)
		(
			(or
				(== global112 41)
				(== global112 73)
				(== global112 104)
				(== global112 151)
				(== global112 24)
				(== global112 149)
			)
			(= gGEgoEdgeHit 2)
		)
		(
			(or
				(== global112 43)
				(== global112 75)
				(== global112 106)
				(== global112 153)
				(== global112 25)
				(== global112 166)
				(== global112 182)
				(== global112 150)
			)
			(= gGEgoEdgeHit 4)
		)
		(
			(or
				(== global112 90)
				(== global112 121)
				(== global112 168)
			)
			(= gGEgoEdgeHit 1)
		)
		(
			(or
				(== global112 89)
				(== global112 136)
				(== global112 36)
				(== global112 38)
				(== global112 69)
				(== global112 82)
				(== global112 100)
				(== global112 104)
				(== global112 130)
				(== global112 138)
				(== global112 37)
				(== global112 99)
				(== global112 135)
				(== global112 167)
				(== global112 3)
				(== global112 4)
				(== global112 5)
				(== global112 6)
				(== global112 24)
				(== global112 25)
				(== global112 26)
				(== global112 2)
				(== global112 17)
				(== global112 32)
				(== global112 7)
				(== global112 27)
				(== global112 60)
			)
			(= gGEgoEdgeHit 3)
		)
		(
			(or
				(== global112 18)
				(== global112 68)
				(== global112 72)
				(== global112 98)
				(== global112 106)
				(== global112 116)
				(== global112 136)
				(== global112 51)
				(== global112 117)
				(== global112 147)
				(== global112 148)
				(== global112 149)
				(== global112 168)
				(== global112 169)
				(== global112 170)
				(== global112 182)
				(== global112 64)
				(== global112 129)
				(== global112 146)
				(== global112 76)
				(== global112 171)
				(== global112 183)
			)
			(= gGEgoEdgeHit 1)
		)
		(
			(or
				(== global112 24)
				(== global112 39)
				(== global112 54)
				(== global112 70)
				(== global112 86)
				(== global112 101)
				(== global112 117)
				(== global112 133)
				(== global112 149)
				(== global112 21)
				(== global112 23)
				(== global112 35)
				(== global112 50)
				(== global112 54)
				(== global112 85)
				(== global112 86)
				(== global112 89)
				(== global112 115)
				(== global112 121)
				(== global112 133)
				(== global112 153)
				(== global112 101)
				(== global112 121)
				(== global112 137)
				(== global112 48)
				(== global112 81)
				(== global112 97)
				(== global112 113)
				(== global112 2)
				(== global112 17)
				(== global112 32)
				(== global112 64)
				(== global112 129)
				(== global112 146)
				(== global112 166)
				(== global112 182)
			)
			(= gGEgoEdgeHit 2)
		)
		(
			(or
				(== global112 9)
				(== global112 25)
				(== global112 40)
				(== global112 55)
				(== global112 71)
				(== global112 87)
				(== global112 102)
				(== global112 118)
				(== global112 134)
				(== global112 150)
				(== global112 21)
				(== global112 23)
				(== global112 35)
				(== global112 50)
				(== global112 54)
				(== global112 85)
				(== global112 86)
				(== global112 89)
				(== global112 115)
				(== global112 121)
				(== global112 133)
				(== global112 153)
				(== global112 67)
				(== global112 43)
				(== global112 91)
				(== global112 107)
				(== global112 123)
				(== global112 139)
				(== global112 76)
				(== global112 171)
				(== global112 183)
				(== global112 7)
				(== global112 27)
				(== global112 60)
				(== global112 156)
			)
			(= gGEgoEdgeHit 4)
		)
		(else
			(switch gGEgoEdgeHit
				(1 (= gGEgoEdgeHit 3))
				(3 (= gGEgoEdgeHit 1))
				(4 (= gGEgoEdgeHit 2))
				(2 (= gGEgoEdgeHit 4))
			)
		)
	)
	(if (== global11 180)
		(= local264 40)
	else
		(switch gGEgoEdgeHit
			(1 (= local264 24))
			(3 (= local264 28))
			(2 (= local264 36))
			(4 (= local264 32))
		)
	)
	(= local265 local264)
	(= local266 (+ local264 1))
	(= local267 (+ local264 2))
	(= local268 (+ local264 3))
	(if (== global11 220)
		((= [newSherMan 0] (sherMan new:))
			posn: [local140 local265] [local140 local266]
			init:
			setMotion: PolyPath [local140 local267] [local140 local268] sherMan
		)
		((= [newSherMan 1] (sherMan new:))
			posn: [local180 local265] [local180 local266]
			init:
			setMotion: PolyPath [local180 local267] [local180 local268] sherMan
		)
		((= [newSherMan 2] (sherMan new:))
			posn: [local220 local265] [local220 local266]
			init:
			setMotion: PolyPath [local220 local267] [local220 local268] sherMan
		)
	else
		((= [newSherMan 0] (sherMan new:))
			posn: [local220 local265] [local220 local266]
			init:
			setMotion: PolyPath [local220 local267] [local220 local268] sherMan
		)
	)
)

(procedure (proc750_2)
	(if (and (> gGEgoCel 2) (== gNewGuise 0))
		(proc0_2 0 3 1)
		(gEgoHead view: 1)
		(gEgo normal: 1 moveHead: 1 xStep: 8 yStep: 6)
	else
		(proc0_2)
	)
	(switch gGEgoCel
		(0 (++ gGEgoCel))
		(1 (++ gGEgoCel))
		(2 (++ gGEgoCel))
		(3
			(gIconBar disable: 5)
			(if
				(or
					(and (not (proc0_5 36)) (== global130 9))
					(and (not (proc0_5 38)) (== global130 12))
				)
				(if
					(and
						(== global11 220)
						(or
							(== global112 24)
							(== global112 39)
							(== global112 54)
							(== global112 70)
							(== global112 86)
							(== global112 101)
							(== global112 117)
							(== global112 133)
							(== global112 149)
							(== global112 9)
							(== global112 25)
							(== global112 40)
							(== global112 55)
							(== global112 71)
							(== global112 87)
							(== global112 102)
							(== global112 118)
							(== global112 134)
							(== global112 150)
							(== global112 26)
							(== global112 168)
							(== global112 58)
							(== global112 90)
							(== global112 121)
							(== global112 89)
							(== global112 136)
							(== global112 41)
							(== global112 73)
							(== global112 104)
							(== global112 151)
							(== global112 43)
							(== global112 75)
							(== global112 106)
							(== global112 153)
							(== global112 166)
							(== global112 182)
						)
					)
					(proc0_3)
				)
				(sweepRgn setScript: outlawSweep)
			)
		)
		(4
			(sweepRgn setScript: cleanSweep)
		)
		(5
			(sweepRgn setScript: cleanSweep)
		)
		(6
			(sweepRgn setScript: cleanSweep)
		)
		(7
			(sweepRgn setScript: surroundEgo)
		)
	)
)

(procedure (proc750_3 &tmp temp0)
	(sweepRgn setScript: 0)
	(if (gNewCast contains: newSherMan_2)
		(newSherMan_2 setMotion: 0 setCycle: 0 delete: dispose:)
	)
	(= temp0 0)
	(while (< temp0 3)
		(if (gNewCast contains: [newSherMan temp0])
			([newSherMan temp0]
				setAvoider: 0
				setMotion: 0
				setCycle: 0
				delete:
				dispose:
			)
		)
		(++ temp0)
	)
	(= local28 0)
	(= newSherMan_2 0)
	(= [newSherMan 0] 0)
	(= [newSherMan 1] 0)
	(= [newSherMan 2] 0)
)

(instance sweepRgn of Rgn
	(properties
		keep 1
	)
	
	(method (init)
		(Load rsSCRIPT 928 930)
		(Load rsPIC 803)
		(proc958_0 132 400 25)
		(proc958_0 128 753 3 792 132 218 2 18 27 35 38 805)
		(switch gNewGuise
			(0 (= local4 1))
			(4 (= local4 6))
			(1 (= local4 7))
			(2 (= local4 4))
			(3 (= local4 5))
			(5 (= local4 9))
			(6 (= local4 8))
		)
		(super init:)
	)
	
	(method (doit &tmp temp0)
		(cond 
			((and (proc0_5 115) (== local26 0))
				(= local26 1)
				(sweepRgn setScript: 0)
				((ScriptID 220 0) setScript: 0)
				(gEgo setScript: 0)
			)
			((proc0_5 110) (proc0_7 110) (= local26 0) (handSignCode doit:))
			((gEgo edgeHit?) (self setScript: 0))
		)
		(super doit:)
	)
	
	(method (dispose &tmp temp0)
		(self setScript: 0)
		(proc0_7 129)
		(super dispose:)
	)
	
	(method (newRoom newRoomNumber)
		(if (not (proc999_5 newRoomNumber 220 180 210 250))
			(self keep: 0)
		)
	)
)

(instance sherPic of PicView
	(properties)
)

(instance sherMan of Actor
	(properties)
	
	(method (init)
		(self view: 753 signal: 24576 setCycle: StopWalk 754)
		(super init:)
	)
	
	(method (doit &tmp [temp0 2])
		(if
			(or
				(and
					(< (self distanceTo: gEgo) 80)
					(< (Abs (- (gEgo y?) y)) 20)
					(or (== gGEgoEdgeHit 1) (== gGEgoEdgeHit 3))
				)
				(and
					(< (self distanceTo: gEgo) 60)
					(< (Abs (- (gEgo x?) x)) 20)
					(or (== gGEgoEdgeHit 2) (== gGEgoEdgeHit 4))
				)
			)
			(if
				(and
					(not (if (< (gEgo view?) 238) (> (gEgo view?) 229)))
					(== (gEgo script?) 0)
					(not (& (gEgo signal?) $0080))
					(!= (gEgo view?) 792)
					(!= (gEgo view?) 132)
					(!= (gEgo view?) 218)
					(not local27)
				)
				(= local27 1)
				(switch gNewGuise
					(0
						(sweepRgn setScript: yourDead)
					)
					(4
						(sweepRgn setScript: bustedPuck)
					)
					(6
						(sweepRgn setScript: bustedFensMonk)
					)
					(5
						(sweepRgn setScript: bustedAbbeyMonk)
					)
				)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(= local28 0)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(sweepRgn setScript: surrenderToSweep)
			)
			(2 (proc13_4 1750 59 0))
			(3 (proc13_4 1750 60 0))
			(10
				(if (== gNewGuise 0)
					(= local31 1)
					(sweepRgn setScript: 0)
					(self setScript: yourDead)
				else
					(proc13_4 1750 64 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (cue)
		(++ local30)
		(cond 
			((== global11 180)
				([newSherMan 0] dispose:)
				(= [newSherMan 0] 0)
				(if
				(and (< (gEgo view?) 238) (> (gEgo view?) 229))
					(gEgo setScript: (ScriptID 223 4))
				)
				(= local30 0)
			)
			((== local30 3)
				([newSherMan 0] dispose:)
				([newSherMan 1] dispose:)
				([newSherMan 2] dispose:)
				(= [newSherMan 0] 0)
				(= [newSherMan 1] 0)
				(= [newSherMan 2] 0)
				(if
					(or
						(and (< (gEgo view?) 238) (> (gEgo view?) 229))
						(& (gEgo signal?) $0080)
					)
					(gEgo setScript: (ScriptID 223 4))
				)
				(= local30 0)
			)
		)
		(super cue:)
	)
)

(instance outlawSweep of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo actions: handJive)
				(if (== global11 220)
					(if
						(or
							(== global112 7)
							(== global112 27)
							(== global112 60)
							(== global112 2)
							(== global112 17)
							(== global112 32)
							(== global112 76)
							(== global112 171)
							(== global112 183)
							(== global112 64)
							(== global112 129)
							(== global112 146)
							(== global112 24)
							(== global112 39)
							(== global112 86)
							(== global112 40)
							(== global112 55)
							(== global112 102)
							(== global112 168)
						)
						(proc0_3)
					)
					(gEgo setMotion: PolyPath 160 150 self)
				else
					(= ticks 4)
				)
			)
			(1
				(if (== global11 180)
					(if (or (== gGEgoEdgeHit 2) (== gGEgoEdgeHit 1))
						(= local32 1)
					else
						(= local32 0)
					)
				)
				(++ gGEgoCel)
				(gSFX2 number: 402 loop: 1 play: self)
			)
			(2
				(if gTheNewDialog (gTheNewDialog dispose:))
				(if (not (proc0_5 115))
					(cond 
						((== global130 9) (proc851_0 @local34 local4 0 self))
						((== global130 12) (proc851_0 @local38 local4 0 self))
					)
				else
					(self cue:)
				)
			)
			(3
				(if (not (HaveMouse))
					(global1
						setCursor: global19 1 (gEgo x?) (- (gEgo y?) 20)
					)
				)
				(if
					(and
						(== global11 220)
						(or
							(== global112 7)
							(== global112 27)
							(== global112 60)
							(== global112 2)
							(== global112 17)
							(== global112 32)
							(== global112 76)
							(== global112 171)
							(== global112 183)
							(== global112 64)
							(== global112 129)
							(== global112 146)
							(== global112 24)
							(== global112 39)
							(== global112 86)
							(== global112 40)
							(== global112 55)
							(== global112 102)
							(== global112 168)
							(== global112 24)
							(== global112 39)
							(== global112 54)
							(== global112 70)
							(== global112 86)
							(== global112 101)
							(== global112 117)
							(== global112 133)
							(== global112 149)
							(== global112 9)
							(== global112 25)
							(== global112 40)
							(== global112 55)
							(== global112 71)
							(== global112 87)
							(== global112 102)
							(== global112 118)
							(== global112 134)
							(== global112 150)
							(== global112 26)
							(== global112 168)
							(== global112 58)
							(== global112 90)
							(== global112 121)
							(== global112 89)
							(== global112 136)
							(== global112 41)
							(== global112 73)
							(== global112 104)
							(== global112 151)
							(== global112 43)
							(== global112 75)
							(== global112 106)
							(== global112 153)
							(== global112 166)
							(== global112 182)
						)
					)
					(sweepRgn setScript: cleanSweep)
				else
					(= seconds 5)
				)
			)
			(4
				(if (and (== global11 220) (< (gEgo y?) 100))
					(= seconds 3)
				else
					(self cue:)
				)
			)
			(5
				(gSFX number: 400 loop: -1 play:)
				(= local28 1)
				(if (== gNewGuise 0)
					((= newSherMan_2 (sherMan new:))
						view: 753
						loop: 0
						x:
							(cond 
								((== global11 220)
									(cond 
										(
											(or
												(== global112 48)
												(== global112 81)
												(== global112 97)
												(== global112 113)
												(== global112 2)
												(== global112 17)
												(== global112 32)
												(== global112 64)
												(== global112 129)
												(== global112 146)
												(== global112 166)
												(== global112 182)
											)
											330
										)
										(
											(or
												(== global112 43)
												(== global112 91)
												(== global112 107)
												(== global112 123)
												(== global112 139)
												(== global112 76)
												(== global112 171)
												(== global112 183)
												(== global112 7)
												(== global112 27)
												(== global112 60)
												(== global112 156)
											)
											-10
										)
										(
											(or
												(== global112 3)
												(== global112 4)
												(== global112 5)
												(== global112 6)
												(== global112 24)
												(== global112 25)
												(== global112 26)
												(== global112 2)
												(== global112 17)
												(== global112 32)
												(== global112 7)
												(== global112 27)
												(== global112 60)
											)
											280
										)
										(
											(or
												(== global112 147)
												(== global112 148)
												(== global112 149)
												(== global112 168)
												(== global112 169)
												(== global112 170)
												(== global112 182)
												(== global112 64)
												(== global112 129)
												(== global112 146)
												(== global112 76)
												(== global112 171)
												(== global112 183)
											)
											320
										)
										(else 0)
									)
								)
								(local32 325)
								(else 0)
							)
						y:
							(if (== global11 220)
								(cond 
									(
										(or
											(== global112 48)
											(== global112 81)
											(== global112 97)
											(== global112 113)
											(== global112 2)
											(== global112 17)
											(== global112 32)
											(== global112 64)
											(== global112 129)
											(== global112 146)
											(== global112 166)
											(== global112 182)
										)
										85
									)
									(
										(or
											(== global112 43)
											(== global112 91)
											(== global112 107)
											(== global112 123)
											(== global112 139)
											(== global112 76)
											(== global112 171)
											(== global112 183)
											(== global112 7)
											(== global112 27)
											(== global112 60)
											(== global112 156)
										)
										120
									)
									(
										(or
											(== global112 3)
											(== global112 4)
											(== global112 5)
											(== global112 6)
											(== global112 24)
											(== global112 25)
											(== global112 26)
											(== global112 2)
											(== global112 17)
											(== global112 32)
											(== global112 7)
											(== global112 27)
											(== global112 60)
										)
										240
									)
									(
										(or
											(== global112 147)
											(== global112 148)
											(== global112 149)
											(== global112 168)
											(== global112 169)
											(== global112 170)
											(== global112 182)
											(== global112 64)
											(== global112 129)
											(== global112 146)
											(== global112 76)
											(== global112 171)
											(== global112 183)
										)
										85
									)
									(else 92)
								)
							else
								179
							)
						init:
						setCycle: Walk
					)
					(cond 
						((== global11 220)
							(cond 
								(
									(or
										(== global112 48)
										(== global112 81)
										(== global112 97)
										(== global112 113)
										(== global112 2)
										(== global112 17)
										(== global112 32)
										(== global112 64)
										(== global112 129)
										(== global112 146)
										(== global112 166)
										(== global112 182)
									)
									(newSherMan_2 setMotion: PolyPath 275 90 self)
								)
								(
									(or
										(== global112 43)
										(== global112 91)
										(== global112 107)
										(== global112 123)
										(== global112 139)
										(== global112 76)
										(== global112 171)
										(== global112 183)
										(== global112 7)
										(== global112 27)
										(== global112 60)
										(== global112 156)
									)
									(newSherMan_2 setMotion: PolyPath 30 120 self)
								)
								(
									(or
										(== global112 3)
										(== global112 4)
										(== global112 5)
										(== global112 6)
										(== global112 24)
										(== global112 25)
										(== global112 26)
										(== global112 2)
										(== global112 17)
										(== global112 32)
										(== global112 7)
										(== global112 27)
										(== global112 60)
									)
									(newSherMan_2 setMotion: PolyPath 280 185 self)
								)
								(
									(or
										(== global112 147)
										(== global112 148)
										(== global112 149)
										(== global112 168)
										(== global112 169)
										(== global112 170)
										(== global112 182)
										(== global112 64)
										(== global112 129)
										(== global112 146)
										(== global112 76)
										(== global112 171)
										(== global112 183)
									)
									(newSherMan_2 setMotion: PolyPath 275 90 self)
								)
								(else (newSherMan_2 setMotion: PolyPath 30 92 self))
							)
						)
						(local32 (newSherMan_2 setMotion: PolyPath 290 179 self))
						(else (newSherMan_2 setMotion: PolyPath 30 179 self))
					)
				else
					(self cue:)
				)
			)
			(6
				(if (== gNewGuise 0)
					(proc0_9 newSherMan_2 gEgo)
					(= ticks 30)
				else
					(self cue:)
				)
			)
			(7
				(if (== gNewGuise 0)
					(if gTheNewDialog (gTheNewDialog dispose:))
					(proc13_4 1750 3 0 80 {Sheriff's Man})
				)
				(= seconds 4)
			)
			(8
				(if (== gNewGuise 0)
					(newSherMan_2 setMotion: PChase gEgo 30)
				)
				(switch gGEgoCel
					(4 (= seconds 5))
					(5 (= seconds 4))
					(6 (= seconds 3))
					(7 (= seconds 1))
				)
			)
			(9
				(if (== global11 220) (proc750_1))
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance cleanSweep of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo actions: handJive)
				(if
					(and
						(== global11 220)
						(or
							(== global112 24)
							(== global112 39)
							(== global112 54)
							(== global112 70)
							(== global112 86)
							(== global112 101)
							(== global112 117)
							(== global112 133)
							(== global112 149)
							(== global112 9)
							(== global112 25)
							(== global112 40)
							(== global112 55)
							(== global112 71)
							(== global112 87)
							(== global112 102)
							(== global112 118)
							(== global112 134)
							(== global112 150)
							(== global112 26)
							(== global112 168)
							(== global112 58)
							(== global112 90)
							(== global112 121)
							(== global112 89)
							(== global112 136)
							(== global112 41)
							(== global112 73)
							(== global112 104)
							(== global112 151)
							(== global112 43)
							(== global112 75)
							(== global112 106)
							(== global112 153)
							(== global112 166)
							(== global112 182)
						)
					)
					(proc0_3)
				)
				(= ticks 12)
			)
			(1
				(if (== (++ gGEgoCel) 4)
					(if gTheNewDialog (gTheNewDialog dispose:))
					(proc851_0 @local52 local4 0 self)
				else
					(self cue:)
				)
			)
			(2
				(if (not (HaveMouse))
					(global1
						setCursor: global19 1 (gEgo x?) (- (gEgo y?) 20)
					)
				)
				(if
					(or
						(== global112 7)
						(== global112 27)
						(== global112 60)
						(== global112 2)
						(== global112 17)
						(== global112 32)
						(== global112 76)
						(== global112 171)
						(== global112 183)
						(== global112 64)
						(== global112 129)
						(== global112 146)
						(== global112 24)
						(== global112 39)
						(== global112 86)
						(== global112 40)
						(== global112 55)
						(== global112 102)
						(== global112 168)
						(== global112 24)
						(== global112 39)
						(== global112 54)
						(== global112 70)
						(== global112 86)
						(== global112 101)
						(== global112 117)
						(== global112 133)
						(== global112 149)
						(== global112 9)
						(== global112 25)
						(== global112 40)
						(== global112 55)
						(== global112 71)
						(== global112 87)
						(== global112 102)
						(== global112 118)
						(== global112 134)
						(== global112 150)
						(== global112 26)
						(== global112 168)
						(== global112 58)
						(== global112 90)
						(== global112 121)
						(== global112 89)
						(== global112 136)
						(== global112 41)
						(== global112 73)
						(== global112 104)
						(== global112 151)
						(== global112 43)
						(== global112 75)
						(== global112 106)
						(== global112 153)
						(== global112 166)
						(== global112 182)
					)
					(-- gGEgoCel)
					(= ticks 2)
				else
					(switch gGEgoCel
						(4 (= ticks 400))
						(5 (= ticks 300))
						(else  (= ticks 180))
					)
				)
			)
			(3
				(if gTheNewDialog (gTheNewDialog dispose:))
				(proc851_0 @local56 local4 0 self)
			)
			(4
				(if (not (HaveMouse))
					(global1
						setCursor: global19 1 (gEgo x?) (- (gEgo y?) 20)
					)
				)
				(if
					(or
						(== global112 7)
						(== global112 27)
						(== global112 60)
						(== global112 2)
						(== global112 17)
						(== global112 32)
						(== global112 76)
						(== global112 171)
						(== global112 183)
						(== global112 64)
						(== global112 129)
						(== global112 146)
						(== global112 24)
						(== global112 39)
						(== global112 86)
						(== global112 40)
						(== global112 55)
						(== global112 102)
						(== global112 168)
						(== global112 24)
						(== global112 39)
						(== global112 54)
						(== global112 70)
						(== global112 86)
						(== global112 101)
						(== global112 117)
						(== global112 133)
						(== global112 149)
						(== global112 9)
						(== global112 25)
						(== global112 40)
						(== global112 55)
						(== global112 71)
						(== global112 87)
						(== global112 102)
						(== global112 118)
						(== global112 134)
						(== global112 150)
						(== global112 26)
						(== global112 168)
						(== global112 58)
						(== global112 90)
						(== global112 121)
						(== global112 89)
						(== global112 136)
						(== global112 41)
						(== global112 73)
						(== global112 104)
						(== global112 151)
						(== global112 43)
						(== global112 75)
						(== global112 106)
						(== global112 153)
						(== global112 166)
						(== global112 182)
					)
					(self cue:)
				else
					(switch gGEgoCel
						(4 (= ticks 500))
						(5 (= ticks 450))
						(else  (= ticks 375))
					)
				)
			)
			(5
				(if (== gNewGuise 0)
					(if gTheNewDialog (gTheNewDialog dispose:))
					(proc13_4 1750 4 self 80 {Sheriff's Man})
				else
					(self cue:)
				)
			)
			(6
				(if
					(or
						(== global112 7)
						(== global112 27)
						(== global112 60)
						(== global112 2)
						(== global112 17)
						(== global112 32)
						(== global112 76)
						(== global112 171)
						(== global112 183)
						(== global112 64)
						(== global112 129)
						(== global112 146)
						(== global112 24)
						(== global112 39)
						(== global112 86)
						(== global112 40)
						(== global112 55)
						(== global112 102)
						(== global112 168)
						(== global112 24)
						(== global112 39)
						(== global112 54)
						(== global112 70)
						(== global112 86)
						(== global112 101)
						(== global112 117)
						(== global112 133)
						(== global112 149)
						(== global112 9)
						(== global112 25)
						(== global112 40)
						(== global112 55)
						(== global112 71)
						(== global112 87)
						(== global112 102)
						(== global112 118)
						(== global112 134)
						(== global112 150)
						(== global112 26)
						(== global112 168)
						(== global112 58)
						(== global112 90)
						(== global112 121)
						(== global112 89)
						(== global112 136)
						(== global112 41)
						(== global112 73)
						(== global112 104)
						(== global112 151)
						(== global112 43)
						(== global112 75)
						(== global112 106)
						(== global112 153)
						(== global112 166)
						(== global112 182)
					)
					(self cue:)
				else
					(switch gGEgoCel
						(4 (= seconds 5))
						(5 (= seconds 3))
						(6 (= seconds 2))
						(else  (self cue:))
					)
				)
			)
			(7
				(gSFX number: 400 loop: -1 play:)
				(cond 
					(
						(or
							(== global112 7)
							(== global112 27)
							(== global112 60)
							(== global112 24)
							(== global112 39)
							(== global112 86)
						)
						(gEgo setMotion: PolyPath 0 97 self)
					)
					(
						(or
							(== global112 2)
							(== global112 17)
							(== global112 32)
						)
						(gEgo setMotion: PolyPath 319 103 self)
					)
					(
						(or
							(== global112 76)
							(== global112 171)
							(== global112 183)
						)
						(gEgo setMotion: PolyPath 0 147 self)
					)
					(
						(or
							(== global112 64)
							(== global112 129)
							(== global112 146)
							(== global112 40)
							(== global112 55)
							(== global112 102)
							(== global112 58)
						)
						(gEgo setMotion: PolyPath 319 145 self)
					)
					(else (proc0_4) (self cue:))
				)
			)
			(8 (= local28 1) (= ticks 2))
			(9
				(if (< (gEgo y?) 100) (= seconds 3) else (self cue:))
			)
			(10
				(gSFX number: 400 loop: -1 play:)
				(proc750_1)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance nearGrove of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 60))
			(1
				(proc13_4
					1750
					62
					self
					80
					(switch global124
						(11 {Birch})
						(12 {Rowan})
						(13 {Ash})
						(14 {Alder})
						(15 {Holly})
						(16 {Hazel})
						(17 {Elder})
						(18 {Oak})
					)
				)
			)
			(2
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance myArrow of PicView
	(properties
		view 792
		loop 4
		cel 2
		signal $4000
	)
	
	(method (init)
		(self x: (+ (gEgo x?) 37) y: (+ (gEgo y?) 6))
		(super init:)
	)
)

(instance yourDead of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(switch (= state newState)
			(0
				(proc0_3)
				(if local31 (proc0_9 gEgo (self client?)))
				(= ticks 18)
			)
			(1
				(if local31
					(gEgo view: 4 setCel: 0 setCycle: End self)
				else
					(self cue:)
				)
			)
			(2
				(if (== global11 180) ((ScriptID 180 1) hide:))
				(if
					(and
						(== global11 220)
						(proc999_5
							global112
							2
							3
							4
							5
							6
							7
							17
							24
							25
							26
							27
							32
							43
							48
							60
							64
							76
							81
							91
							97
							107
							113
							123
							129
							139
							146
							147
							148
							149
							156
							168
							169
							170
							171
							183
						)
					)
					((ScriptID 225 4) hide:)
				)
				(= local31 0)
				(= gClientPicture (gClient picture?))
				(if (gNewCast contains: newSherMan_2)
					(newSherMan_2 setMotion: 0 setCycle: 0 hide:)
				)
				(= temp0 0)
				(while (< temp0 3)
					(if (gNewCast contains: [newSherMan temp0])
						([newSherMan temp0] setMotion: 0 setCycle: 0 hide:)
					)
					(++ temp0)
				)
				(gEgo hide:)
				(gClient drawPic: 803 8)
				(= ticks 20)
			)
			(3
				(gRgnMusic2 number: 906 loop: 1 play: self)
			)
			(4
				(gRgnMusic2 number: 907 loop: 1 play: self)
			)
			(5
				(gSFX number: 25 loop: -1 play:)
				(gClient drawPic: gClientPicture 8)
				(if (== global11 220)
					(cond 
						(
							(or
								(== global112 132)
								(== global112 155)
								(== global112 34)
								(== global112 53)
								(== global112 120)
								(== global112 66)
								(== global112 20)
								(== global112 114)
								(== global112 22)
								(== global112 122)
								(== global112 88)
								(== global112 49)
							)
							(proc225_0)
						)
						(
							(or
								(== global112 18)
								(== global112 33)
								(== global112 35)
								(== global112 52)
								(== global112 54)
								(== global112 69)
								(== global112 119)
								(== global112 121)
								(== global112 135)
								(== global112 137)
								(== global112 51)
								(== global112 65)
								(== global112 82)
								(== global112 19)
								(== global112 21)
								(== global112 36)
								(== global112 98)
								(== global112 115)
								(== global112 130)
								(== global112 23)
								(== global112 37)
								(== global112 38)
								(== global112 106)
								(== global112 138)
								(== global112 50)
								(== global112 67)
								(== global112 68)
								(== global112 72)
								(== global112 83)
								(== global112 85)
								(== global112 86)
								(== global112 89)
								(== global112 99)
								(== global112 100)
								(== global112 101)
								(== global112 104)
								(== global112 136)
								(== global112 151)
								(== global112 153)
								(== global112 167)
							)
							(proc225_1)
						)
						(
							(proc999_5
								global112
								2
								3
								4
								5
								6
								7
								17
								24
								25
								26
								27
								32
								43
								48
								60
								64
								76
								81
								91
								97
								107
								113
								123
								129
								139
								146
								147
								148
								149
								156
								168
								169
								170
								171
								183
							)
							(proc225_2)
							((ScriptID 225 4) show:)
						)
					)
				)
				(if (== global11 180) ((ScriptID 180 1) show:))
				(switch gNewGuise
					(0
						(if (== global11 220)
							(gEgo posn: 103 137)
						else
							(gEgo posn: 92 157)
						)
						(gEgo view: 792 setLoop: 1 setCel: 6 show:)
						(proc806_2 myArrow)
					)
					(4
						(if (== global11 220)
							(gEgo posn: 93 144)
						else
							(gEgo posn: 96 167)
						)
						(gEgo view: 132 setLoop: 5 setCel: 5 show:)
					)
					(6
						(if (== global11 220)
							(gEgo posn: 115 151)
						else
							(gEgo posn: 110 170)
						)
						(gEgo view: 218 setLoop: 3 setCel: 6 show:)
					)
				)
				(cond 
					((gNewCast contains: newSherMan_2)
						(newSherMan_2
							view: 754
							loop: 2
							cel: 0
							x: 102
							y: (if (== global11 220) 129 else 156)
							init:
						)
					)
					((gNewCast contains: [newSherMan 0])
						([newSherMan 0]
							view: 754
							loop: 2
							cel: 0
							x: 102
							y: (if (== global11 220) 129 else 156)
							init:
						)
					)
					(else
						((= [newSherMan 0] (sherMan new:))
							view: 754
							loop: 2
							cel: 0
							x: 102
							y: (if (== global11 220) 129 else 156)
							init:
						)
					)
				)
				(if (gNewCast contains: [newSherMan 1])
					([newSherMan 1]
						view: 754
						loop: 0
						cel: 0
						x: (if (== global11 220) 90 else 79)
						y: (if (== global11 220) 160 else 172)
						init:
					)
				else
					((= [newSherMan 1] (sherMan new:))
						view: 754
						loop: 0
						cel: 0
						x: (if (== global11 220) 90 else 79)
						y: (if (== global11 220) 160 else 172)
						init:
					)
				)
				(if (gNewCast contains: [newSherMan 2])
					([newSherMan 2]
						view: 754
						loop: 1
						cel: 0
						x: 171
						y: (if (== global11 220) 148 else 174)
						init:
					)
				else
					((= [newSherMan 2] (sherMan new:))
						view: 754
						loop: 1
						cel: 0
						x: 171
						y: (if (== global11 220) 148 else 174)
						init:
					)
				)
				(= ticks 60)
			)
			(6
				(proc0_4)
				(gIconBar disable: 5)
				(if
				(or (== client bustedPuck) (== client bustedFensMonk))
					(self dispose:)
				else
					(sweepRgn setScript: sweptToDeath)
				)
			)
		)
	)
)

(instance surroundEgo of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(gSFX number: 401 loop: -1 play:)
				(cond 
					(
						(proc999_5
							global112
							2
							3
							4
							5
							6
							7
							17
							24
							25
							26
							27
							32
							43
							48
							60
							64
							76
							81
							91
							97
							107
							113
							123
							129
							139
							146
							147
							148
							149
							156
							168
							169
							170
							171
							183
						)
						(cond 
							(
								(or
									(== global112 3)
									(== global112 4)
									(== global112 5)
									(== global112 6)
									(== global112 24)
									(== global112 25)
									(== global112 26)
								)
								(= local264 0)
							)
							(
								(or
									(== global112 147)
									(== global112 148)
									(== global112 149)
									(== global112 168)
									(== global112 169)
									(== global112 170)
									(== global112 182)
								)
								(= local264 4)
							)
							(
								(or
									(== global112 43)
									(== global112 91)
									(== global112 107)
									(== global112 123)
									(== global112 139)
								)
								(= local264 8)
							)
							(
								(or
									(== global112 48)
									(== global112 81)
									(== global112 97)
									(== global112 113)
								)
								(= local264 12)
							)
						)
					)
					((== global11 220) (= local264 16))
					(else (= local264 20))
				)
				(= ticks 20)
			)
			(1
				(if (== global11 220)
					(gEgo setMotion: PolyPath 185 114 self)
				else
					(gEgo setMotion: PolyPath 110 180 self)
				)
			)
			(2
				(= local265 local264)
				(= local266 (+ local264 1))
				(= local267 (+ local264 2))
				(= local268 (+ local264 3))
				(gEgo setMotion: PolyPath (gEgo x?) (+ (gEgo y?) 1))
				(cond 
					((gNewCast contains: newSherMan_2)
						(newSherMan_2
							setMotion: PolyPath [local140 local267] [local140 local268]
						)
					)
					((gNewCast contains: [newSherMan 0])
						([newSherMan 0]
							setMotion: PolyPath [local140 local267] [local140 local268]
						)
					)
					(else
						((= [newSherMan 0] (sherMan new:))
							view: 753
							loop: 0
							x: [local140 local265]
							y: [local140 local266]
							init:
							setCycle: Walk
							setMotion: PolyPath [local140 local267] [local140 local268]
						)
					)
				)
				(if (gNewCast contains: [newSherMan 1])
					([newSherMan 1]
						setMotion: PolyPath [local180 local267] [local180 local268]
					)
				else
					((= [newSherMan 1] (sherMan new:))
						view: 753
						loop: 0
						x: [local180 local265]
						y: [local180 local266]
						init:
						setCycle: Walk
						setMotion: PolyPath [local180 local267] [local180 local268]
					)
				)
				(if (gNewCast contains: [newSherMan 2])
					([newSherMan 2]
						setMotion: PolyPath [local220 local267] [local220 local268] self
					)
				else
					((= [newSherMan 2] (sherMan new:))
						view: 753
						loop: 1
						x: [local220 local265]
						y: [local220 local266]
						init:
						setCycle: Walk
						setMotion: PolyPath [local220 local267] [local220 local268] self
					)
				)
			)
			(3
				(proc0_4)
				(gIconBar disable: 5)
				(= temp0 0)
				(while (< temp0 3)
					(if (gNewCast contains: [newSherMan temp0])
						(proc0_9 [newSherMan temp0] gEgo)
					)
					(++ temp0)
				)
				(switch gNewGuise
					(5
						(sweepRgn setScript: bustedAbbeyMonk)
					)
					(6
						(sweepRgn setScript: bustedFensMonk)
					)
					(4
						(sweepRgn setScript: bustedPuck)
					)
					(else 
						(sweepRgn setScript: yourDead)
					)
				)
			)
		)
	)
)

(instance surrenderToSweep of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (== gNewGuise 0)
					(proc851_0 2 @local43 local4 0 19 1 self)
				else
					(proc851_0 1 @local48 local4 0 self)
				)
			)
			(1
				(if (== gNewGuise 5)
					(sweepRgn setScript: bustedAbbeyMonk)
				else
					(sweepRgn setScript: yourDead)
				)
				(proc0_4)
			)
		)
	)
)

(instance sweptToDeath of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 18))
			(1
				(proc851_0 3 @local110 19 0 @local131 1 20 2 self)
			)
			(2
				(proc0_4)
				(proc806_0)
				(self dispose:)
			)
		)
	)
)

(instance bustedFensMonk of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (gNewCast contains: newSherMan_2)
					(newSherMan_2 setMotion: 0 setCycle: 0)
				)
				(= temp0 0)
				(while (< temp0 3)
					(if (gNewCast contains: [newSherMan temp0])
						([newSherMan temp0] setMotion: 0 setCycle: 0)
					)
					(++ temp0)
				)
				(= ticks 30)
			)
			(1
				(proc851_0 3 @local103 8 0 19 1 @local131 2 self)
			)
			(2
				(self setScript: yourDead self)
			)
			(3
				(proc851_0 3 @local125 19 0 @local131 1 20 2 self)
			)
			(4 (proc806_0) (self dispose:))
		)
	)
)

(instance bustedAbbeyMonk of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (gNewCast contains: newSherMan_2)
					(newSherMan_2 setMotion: 0 setCycle: 0)
				)
				(= temp0 0)
				(while (< temp0 3)
					(if (gNewCast contains: [newSherMan temp0])
						([newSherMan temp0] setMotion: 0 setCycle: 0)
					)
					(++ temp0)
				)
				(= ticks 30)
			)
			(1
				(gSFX fade: 0 15 15 1)
				(proc851_0 2 @local76 9 0 19 1 self)
			)
			(2
				(proc0_4)
				(= global145 33)
				(proc0_6 194)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance bustedPuck of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (gNewCast contains: newSherMan_2)
					(newSherMan_2 setMotion: 0 setCycle: 0)
				)
				(= temp0 0)
				(while (< temp0 3)
					(if (gNewCast contains: [newSherMan temp0])
						([newSherMan temp0] setMotion: 0 setCycle: 0)
					)
					(++ temp0)
				)
				(= ticks 30)
			)
			(1
				(proc851_0 4 @local86 6 0 19 1 @local131 2 20 3 self)
			)
			(2
				(self setScript: yourDead self)
			)
			(3
				(proc851_0 3 @local95 19 0 @local131 1 20 2 self)
			)
			(4 (proc806_0) (self dispose:))
		)
	)
)

(instance blowSweep of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= gGEgoLoop (gEgo loop?))
				(if
					(or
						(== (gEgo loop?) 2)
						(== (gEgo loop?) 4)
						(== (gEgo loop?) 0)
						(== (gEgo loop?) 6)
					)
					(gEgo setLoop: 0)
				else
					(gEgo setLoop: 1)
				)
				(gEgo view: 10 setCel: 0 setCycle: End self)
			)
			(1
				(gSFX2 number: 904 loop: 1 play:)
				(= seconds 4)
			)
			(2 (gEgo setCycle: Beg self))
			(3
				(proc0_2 gGEgoLoop 0 1)
				(sweepRgn setScript: surroundEgo)
				(self dispose:)
			)
		)
	)
)

(instance handSignCode of Code
	(properties)
	
	(method (doit)
		(cond 
			((!= gNewGuise 0)
				(if
					(proc999_5
						global112
						2
						3
						4
						5
						6
						7
						17
						24
						25
						26
						27
						32
						43
						48
						60
						64
						76
						81
						91
						97
						107
						113
						123
						129
						139
						146
						147
						148
						149
						156
						168
						169
						170
						171
						183
					)
					(proc13_4 1750 66 1)
				else
					(proc13_4 1750 65 1)
				)
				(proc750_2)
			)
			((proc0_5 35)
				(cond 
					(
						(or
							(and
								(or (== global112 132) (== global112 155))
								(== global124 0)
							)
							(and (== global112 34) (== global124 1))
							(and
								(or (== global112 53) (== global112 120))
								(== global124 2)
							)
							(and (== global112 66) (== global124 3))
							(and (== global112 20) (== global124 4))
							(and (== global112 114) (== global124 5))
							(and
								(or (== global112 22) (== global112 122))
								(== global124 6)
							)
							(and
								(or (== global112 88) (== global112 49))
								(== global124 7)
							)
							(and
								(proc999_5
									global112
									2
									3
									4
									5
									6
									7
									17
									24
									25
									26
									27
									32
									43
									48
									60
									64
									76
									81
									91
									97
									107
									113
									123
									129
									139
									146
									147
									148
									149
									156
									168
									169
									170
									171
									183
								)
								(== global124 9)
							)
							(and (== global11 180) (== global124 7))
						)
						(gSFX fade: 127 30 8 0)
						(gEgo setScript: (ScriptID 223 0))
					)
					(
						(and
							(> gGEgoCel 3)
							(proc999_5
								global112
								2
								3
								4
								5
								6
								7
								17
								24
								25
								26
								27
								32
								43
								48
								60
								64
								76
								81
								91
								97
								107
								113
								123
								129
								139
								146
								147
								148
								149
								156
								168
								169
								170
								171
								183
							)
							(== global124 20)
						)
						(gEgo setScript: (ScriptID 225 3))
					)
					(
						(and
							(> gGEgoCel 3)
							(or
								(and
									(or (== global112 132) (== global112 155))
									(== global124 11)
								)
								(and (== global112 34) (== global124 12))
								(and
									(or (== global112 53) (== global112 120))
									(== global124 13)
								)
								(and (== global112 66) (== global124 14))
								(and (== global112 20) (== global124 15))
								(and (== global112 114) (== global124 16))
								(and
									(or (== global112 22) (== global112 122))
									(== global124 17)
								)
								(and
									(or (== global112 88) (== global112 49))
									(== global124 18)
								)
								(and
									(proc999_5
										global112
										2
										3
										4
										5
										6
										7
										17
										24
										25
										26
										27
										32
										43
										48
										60
										64
										76
										81
										91
										97
										107
										113
										123
										129
										139
										146
										147
										148
										149
										156
										168
										169
										170
										171
										183
									)
									(== global124 20)
								)
								(and (== global11 180) (== global124 18))
							)
						)
						(gEgo setScript: (ScriptID 223 3))
					)
					(
						(or
							(and
								(proc999_5
									global112
									2
									3
									4
									5
									6
									7
									17
									24
									25
									26
									27
									32
									43
									48
									60
									64
									76
									81
									91
									97
									107
									113
									123
									129
									139
									146
									147
									148
									149
									156
									168
									169
									170
									171
									183
								)
								(== global124 20)
							)
							(and
								(or (== global112 132) (== global112 155))
								(== global124 11)
							)
							(and (== global112 34) (== global124 12))
							(and
								(or (== global112 53) (== global112 120))
								(== global124 13)
							)
							(and (== global112 66) (== global124 14))
							(and (== global112 20) (== global124 15))
							(and (== global112 114) (== global124 16))
							(and
								(or (== global112 22) (== global112 122))
								(== global124 17)
							)
							(and
								(or (== global112 88) (== global112 49))
								(== global124 18)
							)
							(and
								(proc999_5
									global112
									2
									3
									4
									5
									6
									7
									17
									24
									25
									26
									27
									32
									43
									48
									60
									64
									76
									81
									91
									97
									107
									113
									123
									129
									139
									146
									147
									148
									149
									156
									168
									169
									170
									171
									183
								)
								(== global124 20)
							)
							(and (== global11 180) (== global124 18))
						)
						(gEgo setScript: (ScriptID 223 1))
					)
					(else (-- gGEgoCel) (proc750_2))
				)
			)
			((proc0_5 34)
				(cond 
					(
						(or
							(and
								(or (== global112 132) (== global112 155))
								(== global124 0)
							)
							(and (== global112 34) (== global124 1))
							(and
								(or (== global112 53) (== global112 120))
								(== global124 2)
							)
							(and (== global112 66) (== global124 3))
							(and (== global112 20) (== global124 4))
							(and (== global112 114) (== global124 5))
							(and
								(or (== global112 22) (== global112 122))
								(== global124 6)
							)
							(and
								(or (== global112 88) (== global112 49))
								(== global124 7)
							)
							(and
								(proc999_5
									global112
									2
									3
									4
									5
									6
									7
									17
									24
									25
									26
									27
									32
									43
									48
									60
									64
									76
									81
									91
									97
									107
									113
									123
									129
									139
									146
									147
									148
									149
									156
									168
									169
									170
									171
									183
								)
								(== global124 9)
							)
							(and (== global11 180) (== global124 7))
						)
						(gSFX fade: 127 30 8 0)
						(gEgo setScript: (ScriptID 223 0))
					)
					(
						(or
							(and
								(or (== global112 132) (== global112 155))
								(== global124 11)
							)
							(and (== global112 34) (== global124 12))
							(and
								(or (== global112 53) (== global112 120))
								(== global124 13)
							)
							(and (== global112 66) (== global124 14))
							(and (== global112 20) (== global124 15))
							(and (== global112 114) (== global124 16))
							(and
								(or (== global112 22) (== global112 122))
								(== global124 17)
							)
							(and
								(or (== global112 88) (== global112 49))
								(== global124 18)
							)
							(and
								(proc999_5
									global112
									2
									3
									4
									5
									6
									7
									17
									24
									25
									26
									27
									32
									43
									48
									60
									64
									76
									81
									91
									97
									107
									113
									123
									129
									139
									146
									147
									148
									149
									156
									168
									169
									170
									171
									183
								)
								(== global124 20)
							)
							(and (== global11 180) (== global124 18))
						)
						(gSFX fade: 127 30 8 0)
						(gEgo setScript: (ScriptID 223 2))
					)
					(else (-- gGEgoCel) (proc750_2))
				)
			)
		)
	)
)

(instance handJive of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(cond 
					(
						(and
							(== global11 220)
							(or
								(== global112 18)
								(== global112 33)
								(== global112 35)
								(== global112 52)
								(== global112 54)
								(== global112 69)
								(== global112 119)
								(== global112 121)
								(== global112 135)
								(== global112 137)
								(== global112 51)
								(== global112 65)
								(== global112 82)
								(== global112 19)
								(== global112 21)
								(== global112 36)
								(== global112 98)
								(== global112 115)
								(== global112 130)
								(== global112 23)
								(== global112 37)
								(== global112 38)
								(== global112 106)
								(== global112 138)
								(== global112 50)
								(== global112 67)
								(== global112 68)
								(== global112 72)
								(== global112 83)
								(== global112 85)
								(== global112 86)
								(== global112 89)
								(== global112 99)
								(== global112 100)
								(== global112 101)
								(== global112 104)
								(== global112 136)
								(== global112 151)
								(== global112 153)
								(== global112 167)
							)
						)
						(gEgo setScript: nearGrove)
						1
					)
					((and (== local28 1) (== gNewGuise 0)) (proc13_4 1750 60 1) 1)
					(else (sweepRgn setScript: 0) (gSFX fade: 0 30 8 0) 0)
				)
			)
			(4
				(switch param2
					(12 (proc13_4 1750 61 0) 1)
					(1
						(if (> gGEgoCel 2) (gEgo setScript: blowSweep) 1)
					)
				)
			)
		)
	)
)
