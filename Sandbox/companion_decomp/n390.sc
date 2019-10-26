;;; Sierra Script 1.0 - (do not remove this comment)
(script# 390)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n851)
(use n946)
(use n950)
(use n951)
(use n969)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm390 0
)

(local
	[local0 4] = [1390 217 2]
	[local4 8] = [1390 0 2 1 2 1 2]
	[local12 4] = [1390 5 2]
	[local16 9] = [1390 6 2 1 2 1 2 2]
	[local25 4] = [1390 12 2]
	[local29 4] = [1390 13 2]
	[local33 4] = [1390 14 2]
	[local37 4] = [1390 15 2]
	[local41 4] = [1390 16 2]
	[local45 4] = [1390 17 2]
	[local49 4] = [1390 18 2]
	[local53 5] = [1390 19 1 2]
	[local58 5] = [1390 21 1 2]
	[local63 4] = [1390 23 1]
	[local67 4] = [1390 24 1]
	[local71 4] = [1390 25 2]
	[local75 8] = [1390 26 1 2 1 2 2]
	[local83 6] = [1390 31 1 2 2]
	[local89 5] = [1390 34 1 2]
	[local94 5] = [1390 36 1 2]
	[local99 7] = [1390 38 1 2 2 2]
	[local106 4] = [1390 42 2]
	[local110 5] = [1390 43 1 2]
	[local115 5] = [1390 45 1 2]
	[local120 6] = [1390 47 1 2 2]
	[local126 4] = [1390 50 2]
	[local130 5] = [1390 51 1 2]
	[local135 5] = [1390 53 1 2]
	[local140 7] = [1390 55 2 1 2 2]
	[local147 9] = [1390 59 1 2 1 2 1 2]
	[local156 5] = [1390 65 2 1]
	[local161 5] = [1390 67 1 2]
	[local166 11] = [1390 69 1 2 1 2 1 2 2 2]
	[local177 9] = [1390 77 1 1 2 1 2 2]
	[local186 4] = [1390 83 2]
	[local190 7] = [1390 84 1 2 1 2]
	[local197 7] = [1390 88 1 2 1 2]
	[local204 4] = [1390 92 2]
	[local208 11] = [1390 93 1 1 1 2 1 2 2 2]
	[local219 5] = [1390 101 2 2]
	[local224 5] = [1390 103 1 2]
	[local229 5] = [1390 105 1 2]
	[local234 3] = [1390 107]
	[local237 5] = [1390 108 2 1]
	[local242 4] = [1390 110 1]
	[local246 12] = [1390 111 1 2 1 2 2 0 1390 116 1]
	[local258 5] = [1390 117 1 2]
	[local263 7] = [1390 119 1 1 2 2]
	[local270 4] = [1390 123 2]
	[local274 5] = [1390 124 2 2]
	[local279 5] = [1390 126 2 2]
	[local284 4] = [1390 128 2]
	[local288 10] = [1390 129 2 1 2 1 2 1 2]
	[local298 4] = [1390 136 2]
	[local302 5] = [1390 137 2 2]
	[local307 6] = [1390 139 2 2 1]
	[local313 4] = [1390 142 2]
	[local317 8] = [1390 143 2 1 2 1 2]
	[local325 4] = [1390 148 1]
	[local329 4] = [1390 149 2]
	[local333 6] = [1390 150 1 2 2]
	[local339 4] = [1390 153 2]
	[local343 4] = [1390 154 2]
	[local347 7] = [1390 155 2 1 2 2]
	[local354 4] = [1390 159 2]
	[local358 5] = [1390 160 2 2]
	[local363 9] = [1390 162 1 2 1 2 2 2]
	[local372 5] = [1390 168 2 2]
	[local377 4] = [1390 170 2]
	[local381 5] = [1390 171 1 2]
	[local386 7] = [1390 173 2 1 2 2]
	[local393 5] = [1390 177 2 2]
	[local398 7] = [1390 179 2 1 2 2]
	[local405 4] = [1390 183 2]
	[local409 4] = [1390 184 2]
	[local413 4] = [1390 185 2]
	[local417 6] = [1390 186 1 2 2]
	[local423 4] = [1390 189 2]
	[local427 4] = [1390 190 2]
	[local431 5] = [1390 191 1 2]
	[local436 4] = [1390 193 2]
	[local440 6] = [1390 194 2 2 2]
	[local446 4] = [1390 197 2]
	[local450 4] = [1390 198 2]
	[local454 5] = [1390 199 1 2]
	[local459 4] = [1390 201 2]
	[local463 4] = [1390 202 2]
	[local467 4] = [1390 203 2]
	[local471 7] = [1390 204 1 2 2 2]
	[local478 5] = [1390 208 2 2]
	[local483 4] = [1390 210 2]
	[local487 5] = [1390 211 1 2]
	[local492 6] = [1390 213 2 1 2]
	[local498 9] = [-1 8728 19]
)
(procedure (localproc_000e param1 param2 param3 param4)
	(if (or (< argc 4) param4)
		(proc255_0 param1 param2 80 {***STUB:})
	)
	(if (and (>= argc 3) param3) (param3 cue:))
)

(procedure (localproc_0041 param1)
	(proc851_0 2 param1 999 1 @local498 0 &rest)
)

(instance MoveBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== client gEgo) (proc0_2))
				(client setHeading: 0 self)
			)
			(1
				(client
					setCycle: Rev
					setLoop:
					setMotion: MoveFwd (- register) self
				)
			)
			(2
				(if (== client gEgo)
					(proc0_2)
				else
					(client setCycle: Walk setLoop: -1)
				)
				(self dispose:)
			)
		)
	)
)

(instance rm390 of Rm
	(properties
		lookStr 8753
		picture 390
		style $0064
		horizon 175
		south 260
	)
	
	(method (init)
		(Load rsTEXT 1390)
		(switch gNewGuise
			(2 (proc0_6 80))
			(3 (proc0_6 63))
		)
		(super init: &rest)
		(proc0_3)
		(proc806_3 castle arch)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 113 189 0 189 0 0 319 0 319 189 206 189 179 179 148 179 115 189
					yourself:
				)
		)
		(Hubert init:)
		(Hubert approachVerbs: 3 4 5)
		(gEgo posn: (+ (Hubert x?) 30) 185 init:)
		(proc0_2 (if (proc999_5 gHeading 400 570) 2 else 3))
		(gRgnMusic number: 390 loop: -1 play:)
		(self setScript: roomInit)
	)
	
	(method (newRoom newRoomNumber)
		(switch newRoomNumber
			(570
				(proc0_6 81)
				(if (!= gNewGuise 5) (proc255_0 390 0) (return))
			)
		)
		(gRgnMusic fade: 0 20 12 1)
		(proc0_4)
		(super newRoom: newRoomNumber &rest)
	)
)

(instance roomInit of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if
					(or
						(and (== gNewGuise 3) (proc0_5 80))
						(and (== gNewGuise 2) (proc0_5 63))
					)
					(client setScript: BeardChanged)
				else
					(proc0_4)
					(self dispose:)
				)
			)
		)
	)
)

(instance GilesAndRogerAppear of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(Giles
					init:
					setPri: 9
					illegalBits: 0
					ignoreHorizon:
					setCycle: Walk
					setMotion: MoveTo 158 (Giles y?) self
				)
			)
			(1
				(Roger
					init:
					illegalBits: 0
					ignoreHorizon:
					setCycle: Walk
					setMotion: MoveTo 168 (Roger y?) self
				)
			)
			(2 (self dispose:))
		)
	)
)

(instance BeardChanged of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo Hubert self)
			)
			(1
				(localproc_0041
					(if (== gNewGuise 2) @local16 else @local4)
					self
				)
			)
			(2
				(self
					setScript: GilesAndRogerAppear self register notKilled
				)
			)
			(3
				(localproc_0041
					(if (== gNewGuise 2) @local25 else @local12)
					self
				)
			)
			(4
				(= global145 (if (== gNewGuise 2) 39 else 7))
				(gClient newRoom: 170)
				(self dispose:)
			)
		)
	)
)

(instance Giles of Actor
	(properties
		x 120
		y 170
		view 755
	)
)

(instance Roger of Actor
	(properties
		x 200
		y 170
		view 755
	)
)

(instance castle of Feature
	(properties
		y 4
		description 8925
		lookStr 8872
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init:
					0
					68
					12
					66
					15
					20
					51
					5
					88
					5
					129
					22
					185
					22
					222
					5
					273
					4
					304
					20
					304
					70
					318
					71
					319
					189
					0
					189
				yourself:
			)
		)
		(super init: &rest)
	)
)

(instance arch of Feature
	(properties
		y 49
		description 9027
		lookStr 8947
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init: 115 50 206 49 207 176 114 177
				yourself:
			)
		)
		(super init: &rest)
	)
)

(instance stopTresspasser of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_070e
			pushi    0
			callb    proc0_3,  0
			ipToa    register
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      gEgo
			send     6
			lsg      gNewGuise
			ldi      1
			eq?     
			bnt      code_0705
			pushi    #setScript
			pushi    2
			lofsa    KickBeggar
			push    
			pushSelf
			self     8
			jmp      code_0752
code_0705:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0752
code_070e:
			dup     
			ldi      1
			eq?     
			bnt      code_0732
			ldi      1
			aTop     notKilled
			pushi    2
			lsg      gNewGuise
			eq?     
			bnt      code_0726
			lea      @local0
			jmp      code_0729
code_0726:
			lea      @local37
code_0729:
			push    
			pushSelf
			call     localproc_0041,  4
			jmp      code_0752
code_0732:
			dup     
			ldi      2
			eq?     
			bnt      code_0752
			pushi    #setScript
			pushi    3
			lofsa    MoveBack
			push    
			pushSelf
			pushi    4
			lag      gEgo
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0752:
			toss    
			ret     
		)
	)
)

(instance Hubert of Actor
	(properties
		x 147
		y 175
		heading 180
		description 9141
		approachX 184
		approachY 185
		lookStr 9061
		view 392
	)
	
	(method (doit &tmp gEgoMover temp1)
		(if
			(and
				(not script)
				(= gEgoMover (gEgo mover?))
				(>= (+ y 6) (gEgo y?))
				(>= (gEgo y?) (gEgoMover y?))
			)
			(self setScript: stopTresspasser)
		)
		(super doit: &rest)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(self
					setScript:
						(switch gNewGuise
							(1 BeggarTouchesHubert)
							(else  TryToTouchHubert)
						)
				)
			)
			(5
				(switch gNewGuise
					(1
						(self setScript: BeggarTalkToHubert)
					)
					(4
						(self setScript: PuckTalkToHubert)
					)
					(6
						(self setScript: FensTalkToHubert)
					)
					(5
						(self setScript: AbbeyTalkToHubert)
					)
					(2
						(self setScript: JewelerTalkToHubert)
					)
					(3
						(self setScript: JewelerTalkToHubert)
					)
					(else  (proc13_4 390 1))
				)
			)
			(10
				(if (== gNewGuise 4)
					(proc13_4 [local234 0] [local234 1])
				)
			)
			(11 (gClient newRoom: 260))
			(4
				(switch param2
					(0
						(switch gNewGuise
							(1
								(self setScript: BeggarBribesHubert)
							)
							(5
								(self setScript: AbbeyBribesHubert)
							)
							(6
								(self setScript: FensBribesHubert)
							)
							(4
								(self setScript: PuckBribesHubert)
							)
							(2
								(self setScript: JewelerBribesHubert)
							)
							(3
								(self setScript: JewelerBribesHubert)
							)
						)
					)
					(2
						(cond 
							((proc999_5 gNewGuise 5 6) (localproc_0041 @local358))
							((proc999_5 gNewGuise 2 3) (self setScript: JewelerGivesEmeraldToHubert))
						)
					)
					(3
						(self setScript: GiveSlipperToHubert)
					)
					(15
						(if (and (== gNewGuise 1) (== global130 3))
							(self setScript: GiveCombToHubert)
						)
					)
					(11
						(if (proc0_5 31)
							(localproc_0041 @local405)
						else
							(localproc_0041 @local409)
						)
					)
					(14
						(self setScript: GiveAmethystToHubert)
					)
					(12 (localproc_0041 @local436))
					(13 (localproc_0041 @local459))
					(5 (localproc_0041 @local463))
					(6
						(self setScript: GiveAmethystToHubert)
					)
					(7
						(self setScript: GiveJewelsToHubert)
					)
					(8 (localproc_0041 @local492))
					(else 
						(cond 
							((proc999_5 param2 10 18) (self setScript: GiveRingToHubert))
							((proc999_5 param2 16 17) (localproc_0041 @local467))
							(else (super doVerb: theVerb &rest))
						)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance GiveAmethystToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(++ register)
				(cond 
					((proc999_5 gNewGuise 5 6) (localproc_0041 @local413 self))
					((proc999_5 gNewGuise 2 3)
						(cond 
							((not (proc0_5 145))
								(if (== register 1)
									(localproc_0041 @local417 self)
								else
									(localproc_0041 @local423 self)
								)
							)
							((== register 1) (localproc_0041 @local427 self))
							(else (localproc_0041 @local431 self))
						)
					)
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance GiveJewelsToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					((not (proc999_5 gNewGuise 2 3)) (self dispose:))
					((not (proc0_5 145)) (= register -1) (localproc_0041 @local471 self))
					((== register 1) (localproc_0041 @local483 self))
					(else (localproc_0041 @local487 self))
				)
			)
			(1
				(if (== register -1)
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local478 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5
				(proc0_4)
				(proc806_1 10)
				(gClient newRoom: 400)
				(self dispose:)
			)
		)
	)
)

(instance GiveRingToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					(
						(or
							(proc999_5 gNewGuise 6 5)
							(and (proc999_5 gNewGuise 2 3) (not (proc0_5 145)))
						)
						(= register -1)
						(localproc_0041 @local440 self)
					)
					((and (proc999_5 gNewGuise 2 3) (proc0_5 145))
						(if (== register 1)
							(localproc_0041 @local450 self)
						else
							(localproc_0041 @local454 self)
						)
					)
				)
			)
			(1
				(if (== register -1)
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(localproc_0041 @local446 self)
			)
			(3
				(= global145 8)
				(gClient newRoom: 170)
				(self dispose:)
			)
		)
	)
)

(instance JewelerGivesEmeraldToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					((not (proc0_5 145)) (localproc_0041 @local363 self))
					((== register 1) (localproc_0041 @local377 self))
					(else (localproc_0041 @local381 self))
				)
			)
			(1
				(if (not (proc0_5 145))
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local372 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5
				(proc806_1 10)
				(gClient newRoom: 400)
				(self dispose:)
			)
		)
	)
)

(instance GiveCombToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0041 @local398 self)
			)
			(1
				(= global145 6)
				(gClient newRoom: 170)
			)
		)
	)
)

(instance GiveSlipperToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(++ register)
				(if (and (== gNewGuise 1) (== global130 3))
					(if (== register 1)
						(localproc_0041 @local386 self)
					else
						(localproc_0041 @local393 self)
					)
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance AbbeyBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					(
						(or
							(and (== global130 5) (proc0_5 25))
							(and (== global130 6) (not (proc0_5 25)))
						)
						(cond 
							((proc0_5 81) (localproc_0041 @local274 self))
							((not (gMoney doit:)) (-- register) (self cue:))
							((< (gMoney taken?) 3) (gMoney put:) (localproc_0041 @local258 self))
							(else (= register -1) (localproc_0041 @local263 self))
						)
					)
					(
						(or
							(and (== global130 6) (proc0_5 25))
							(proc999_5 global130 7 8)
						)
						(localproc_0041 @local279 self)
					)
					((== global130 9) (localproc_0041 @local284 self))
					(else (localproc_000e 390 2 self))
				)
			)
			(1
				(if (== register -1)
					(proc806_1 50)
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local270 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5 (gClient newRoom: 570))
		)
	)
)

(instance FensBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					((and (== global130 5) (not (proc0_5 25)))
						(cond 
							((proc0_5 144) (localproc_0041 @local302 self))
							((not (gMoney doit:)) (-- register) (self cue:))
							(else (= register -1) (localproc_0041 @local288 self))
						)
					)
					(
						(or
							(and (== global130 6) (not (proc0_5 25)))
							(and (== global130 6) (proc0_5 25))
							(proc999_5 global130 7 8 9)
						)
						(if (== register 1)
							(localproc_0041 @local307 self)
						else
							(localproc_0041 @local313 self)
						)
					)
					(else (localproc_000e 390 3 self))
				)
			)
			(1
				(if (== register -1)
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local298 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5 (gClient newRoom: 400))
		)
	)
)

(instance PuckBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(switch global130
					(8
						(cond 
							((> register 1) (proc13_4 [local325 0] [local325 1] self))
							((not (gMoney doit:)) (-- register) (self cue:))
							(else (localproc_0041 @local317 self))
						)
					)
					(9
						(cond 
							((proc0_5 146) (localproc_0041 @local343 self))
							((not (gMoney doit:)) (-- register) (self cue:))
							((< (gMoney taken?) 3) (gMoney put:) (localproc_0041 @local329 self))
							(else (= register -1) (localproc_0041 @local333 self))
						)
					)
					(else 
						(localproc_000e 390 4 self)
					)
				)
			)
			(1
				(if (== register -1)
					(proc806_1 50)
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local339 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5 (gClient newRoom: 400))
		)
	)
)

(instance JewelerBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					((not (gMoney doit:)) (self cue:))
					((== global130 9)
						(if (not (proc0_5 145))
							(localproc_0041 @local347 self)
						else
							(gMoney put:)
							(localproc_0041 @local354 self)
						)
					)
					(else (gMoney put:) (localproc_000e 390 5 self))
				)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance BeggarBribesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(++ register)
				(cond 
					((> register 1) (proc13_4 1390 116 self))
					((not (gMoney doit:)) (self dispose:))
					(else
						(proc0_3)
						(if (== register 1) (localproc_0041 @local237 self))
					)
				)
			)
			(1
				(if (> register 1)
					(proc0_4)
					(gMoney put:)
					(self dispose:)
				else
					(self setScript: KickBeggar self)
				)
			)
			(2
				(localproc_0041 @local242 self)
			)
			(3
				(localproc_0041 @local246 self)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance BeggarTouchesHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: KickBeggar self)
			)
			(1
				(localproc_0041 @local29 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance KickBeggar of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(Hubert loop: 1 cel: 0 setCycle: CT 2 1 self)
			)
			(1
				(gEgo view: 392 loop: 2 cel: 0 setCycle: End self)
				(if (>= -4 (- (Hubert x?) (gEgo x?)))
					(Hubert setCycle: End self)
				else
					(= cycles 1)
				)
			)
			(2
				(if (>= -4 (- (Hubert x?) (gEgo x?)))
					(Hubert setCycle: Beg self)
				else
					(= cycles 1)
				)
				(Hubert loop: 0)
			)
			(3
				(localproc_0041 @local67 self)
			)
			(4 (= ticks 60))
			(5
				(gEgo view: 392 loop: 2 setCycle: Beg self)
			)
			(6
				(proc0_2 3)
				(gEgo setScript: MoveBack self 2)
			)
			(7 (self dispose:))
		)
	)
)

(instance BeggarTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(proc0_9 gEgo Hubert self)
			)
			(1
				(if (== register 1)
					(localproc_0041 @local53 self)
				else
					(localproc_0041 @local63 self)
				)
			)
			(2
				(self setScript: KickBeggar self)
			)
			(3
				(if (== register 1)
					(localproc_0041 @local58 self)
				else
					(localproc_0041 @local71 self)
				)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance TryToTouchHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(switch gNewGuise
					(4
						(if (== register 1)
							(localproc_0041 @local41 self)
						else
							(localproc_0041 @local45 self)
						)
					)
					(5
						(localproc_0041 @local33 self)
					)
					(6
						(localproc_0041 @local37 self)
					)
					(else 
						(if (proc999_5 gNewGuise 2 3)
							(localproc_0041 @local49 self)
						)
					)
				)
			)
			(1
				(proc0_2 3)
				(gEgo setScript: MoveBack self 2)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance PuckTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(switch global130
					(8
						(if (and (>= global155 42) (not (proc0_5 10)))
							(switch register
								(1
									(localproc_0041 @local190 self)
								)
								(2
									(localproc_0041 @local197 self)
								)
								(else 
									(localproc_0041 @local204 self)
								)
							)
						else
							(switch register
								(1
									(localproc_0041 @local140 self)
								)
								(2
									(localproc_0041 @local147 self)
								)
								(else 
									(localproc_0041 @local156 self)
								)
							)
						)
					)
					(9
						(if (proc0_5 10)
							(if (proc0_5 146)
								(localproc_0041 @local204 self)
							else
								(switch register
									(1
										(localproc_0041 @local161 self)
									)
									(2
										(localproc_0041 @local166 self)
									)
									(else 
										(localproc_0041 @local177 self)
									)
								)
							)
						else
							(switch register
								(1
									(localproc_0041 @local190 self)
								)
								(2
									(localproc_0041 @local197 self)
								)
								(else 
									(localproc_0041 @local204 self)
								)
							)
						)
					)
					(else 
						(localproc_000e 390 6 self)
					)
				)
			)
			(1
				(if
				(and (proc0_5 10) (>= register 3) (not (proc0_5 146)))
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(proc806_1 75)
				(localproc_0041 @local186 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5 (gClient newRoom: 400))
		)
	)
)

(instance FensTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					((and (== global130 6) (proc0_5 25))
						(if (== register 1)
							(localproc_0041 @local99 self)
						else
							(localproc_0041 @local106 self)
						)
					)
					((== global130 8) (localproc_0041 @local115 self))
					((and (== global130 5) (not (proc0_5 25)))
						(if (and (== register 1) (not (proc0_5 144)))
							(localproc_0041 @local120 self)
							(= register -1)
						else
							(localproc_0041 @local130 self)
						)
					)
					(
						(or
							(proc999_5 global130 7 9)
							(and (== global130 6) (not (proc0_5 25)))
						)
						(localproc_0041 @local135 self)
					)
					(else (localproc_000e 390 7 self))
				)
			)
			(1
				(if (== register -1)
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local126 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
			)
			(5 (gClient newRoom: 400))
		)
	)
)

(instance AbbeyTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					(
						(or
							(and (== global130 5) (proc0_5 25))
							(and (== global130 6) (not (proc0_5 25)))
						)
						(cond 
							((not (proc0_5 81))
								(if (and (== register 1) (not (proc0_5 17)))
									(proc0_6 17)
									(localproc_0041 @local75 self)
								else
									(proc0_6 17)
									(localproc_0041 @local83 self)
								)
							)
							((== register 1) (localproc_0041 @local89 self))
							(else (localproc_0041 @local94 self))
						)
					)
					((and (== global130 6) (proc0_5 25))
						(if (== register 1)
							(localproc_0041 @local99 self)
						else
							(localproc_0041 @local106 self)
						)
					)
					((proc999_5 global130 7 9) (localproc_0041 @local110 self))
					((== global130 8) (localproc_0041 @local115 self))
					(else (localproc_000e 390 8 self))
				)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance JewelerTalkToHubert of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(++ register)
				(cond 
					((not (proc0_5 145)) (localproc_0041 @local208 self))
					((== register 1) (localproc_0041 @local224 self))
					(else (localproc_0041 @local229 self))
				)
			)
			(1
				(if (not (proc0_5 145))
					(self
						setScript: GilesAndRogerAppear self register notKilled
					)
				else
					(proc0_4)
					(self dispose:)
				)
			)
			(2
				(Hubert setLoop: 3 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0041 @local219 self)
			)
			(4
				(gEgo
					heading: 0
					setMotion: MoveFwd (* 2 (gEgo yStep?)) self
				)
				(proc806_1 10)
				(gClient newRoom: 400)
			)
		)
	)
)
