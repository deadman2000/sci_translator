;;; Sierra Script 1.0 - (do not remove this comment)
(script# 25)
(include sci.sh)
(use n000)
(use n013)
(use n121)
(use n125)
(use n806)
(use n813)
(use n851)
(use n930)
(use n945)
(use n946)
(use n951)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	beg 0
	begScript 1
)

(local
	[local0 9] = [131 0 2 4 26 42 23 27 14]
	[local9 9] = [-1 5108 14]
	local18 =  10
	local19
	local20
	local21
	local22
	local23
	[local24 13] = [1025 0 1 2 2 1 2 1 2 1 2 2]
	[local37 4] = [1025 10 1]
	[local41 6] = [1025 11 1 2 2]
	[local47 4] = [1025 14 1]
	[local51 8] = [1025 16 1 2 2 1 2]
	[local59 6] = [1025 21 1 2 2]
	[local65 4] = [1025 24 1]
	[local69 4] = [1025 25 1]
	[local73 5] = [1025 26 1 1]
	[local78 4] = [1025 28 1]
	[local82 4] = [1025 29 1]
	[local86 5] = [1025 30 1 2]
	[local91 4] = [1025 32 1]
	[local95 4] = [1025 33 1]
	[local99 6] = [1025 34 2 2 1]
	[local105 11] = [1025 37 1 2 3 2 1 1 1 1]
	[local116 6] = [1025 45 2 1 2]
	[local122 5] = [1025 49 2 1]
	[local127 6] = [1025 51 2 1 2]
	[local133 7] = [1025 54 1 2 1 2]
	[local140 7] = [1025 58 2 1 1 1]
	[local147 9] = [1025 62 3 1 2 1 4 1]
)
(instance beg of Actor
	(properties
		view 130
		signal $2800
	)
	
	(method (init)
		(gSFX number: 125 loop: -1 play:)
		(super init:)
	)
	
	(method (doit &tmp temp0 temp1)
		(= temp1 (GetAngle x y (gEgo x?) (gEgo y?)))
		(= temp0 (Abs (- temp1 heading)))
		(cond 
			(
				(and
					(not local18)
					(not mover)
					(not local19)
					(> temp0 30)
				)
				(= cel
					(cond 
						((>= temp1 338) 3)
						((>= temp1 293) 7)
						((>= temp1 248) 1)
						((>= temp1 203) 5)
						((>= temp1 158) 2)
						((>= temp1 113) 4)
						((>= temp1 68) 0)
						((>= temp1 23) 6)
						(else 3)
					)
				)
			)
			(
			(and (== (gEgo edgeHit?) 1) (not (Wat script?))) (Wat setScript: (Wat theTimer?)))
			(local18 (-- local18))
		)
		(super doit:)
	)
	
	(method (dispose)
		(gSFX fade: 0 30 8 1)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(Wat weMeetAgain: 1)
		(super dispose:)
		(self delete:)
		(DisposeScript 25)
	)
	
	(method (doVerb theVerb param2 &tmp temp0)
		(switch theVerb
			(2 (proc13_5 1025 15))
			(5
				(cond 
					((Wat offRoad?)
						(if local21
							(proc851_0 1 @local47 @local0 3)
						else
							(= local21 1)
							(proc851_0 @local41 3 @local0)
						)
					)
					((Wat charFirstTalk?) (proc851_0 1 @local37 @local0 3))
					(else (Wat charFirstTalk: 1) (proc851_0 @local24 1 @local0))
				)
			)
			(10 (gEgo setScript: threat))
			(4
				(cond 
					((proc999_5 param2 1 2 3) (gEgo setScript: approachBeggar 0 param2))
					((== param2 0)
						(proc806_6 0)
						(if (gMoney doit:)
							(gEgo setScript: approachBeggar 0 param2)
						)
					)
					(else (super doVerb: theVerb &rest))
				)
			)
			(3 (gEgo setScript: beggarDo))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance begScript of Script
	(properties)
	
	(method (init)
		(super init: &rest)
	)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(Wat setScript: 0)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(if (not (global5 contains: beg)) (beg init:))
					(beg
						posn: 235 50
						setCycle: Walk
						setMotion: MoveTo 205 70 self
					)
				)
			)
			(1
				(beg setLoop: 2 cel: 5 ignoreActors: 1)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 225 58 226 77 204 82 182 77 182 58 205 52
							yourself:
						)
				)
				(proc0_2)
				(= ticks 18)
			)
			(2
				(proc851_0 @local51 3 @local0 self 0)
			)
			(3
				(proc851_0 @local59 1 @local0 self)
			)
			(4
				(proc0_4)
				(global2 horizon: 30)
				(gEgo actions: egoActions)
				(self dispose:)
			)
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 225 58 226 77 204 82 182 77 182 58 205 52
							yourself:
						)
				)
				(proc851_0 1 @local65 @local0 3 self)
			)
			(2
				(proc0_4)
				(gIconBar disable: 5)
				(global2 horizon: 30)
				(gEgo actions: egoActions)
				(self dispose:)
			)
		)
	)
)

(instance approachBeggar of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (> (gEgo distanceTo: beg) 15)
					(if (or (== register 0) (== register 2))
						(gEgo
							setMotion: PolyPath (- (beg x?) 23) (- (beg y?) 3) self
						)
					else
						(gEgo
							setMotion: PolyPath (- (beg x?) 15) (+ (beg y?) 5) self
						)
					)
				else
					(++ state)
					(self cue:)
				)
			)
			(1
				(proc0_9 gEgo beg self)
				(if (or (== register 0) (== register 2))
					(= local19 1)
					(beg setCel: 7)
				)
			)
			(2 (= ticks 12))
			(3
				(switch register
					(1
						(proc851_0 1 @local69 @local0 3)
						(self dispose:)
					)
					(0
						(= local20 1)
						(gEgo setScript: buyClothes)
					)
					(2
						(gEgo put: 2)
						(gEgo setScript: buyClothes)
					)
					(3
						(proc851_0 1 @local73 @local0 3)
						(self dispose:)
					)
				)
			)
		)
	)
)

(instance buyClothes of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(beg dispose:)
	)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(= register (gEgo cycleSpeed?))
				(global1 setSpeed: global141)
				(Load rsVIEW 7)
				(proc0_3)
				(gEgo view: 7 setLoop: 4 setCel: 0 setCycle: End self)
			)
			(1 (= ticks 30))
			(2 (gEgo setCycle: Beg self))
			(3 (proc0_2) (= ticks 60))
			(4
				(if local20
					(proc851_0 1 @local78 @local0 3 self)
				else
					(proc851_0 1 @local82 @local0 3 self)
				)
			)
			(5
				(proc851_0 2 @local86 3 0 @local0 3 self)
			)
			(6
				(if local20
					(proc851_0 1 @local91 3 0 self)
				else
					(proc851_0 1 @local95 3 0 self)
				)
			)
			(7
				(proc851_0 2 @local99 3 0 @local0 3 self)
			)
			(8
				(gEgo
					setMotion:
						PolyPath
						(if (== (Wat travelDir?) 3) 140 else 205)
						(if (== (Wat travelDir?) 3) 115 else 75)
						self
				)
				(beg setCel: 5)
			)
			(9
				(beg stopUpd:)
				(self setScript: (ScriptID 5 1) self)
			)
			(10 (proc0_9 gEgo beg self))
			(11 (= ticks 12))
			(12
				(gEgo stopUpd:)
				(self setScript: (ScriptID 125 1) self)
			)
			(13
				(proc851_0 3 @local105 3 0 @local0 3 2 0 self)
			)
			(14
				(gSFX number: 128 loop: -1 play:)
				(global2 drawPic: 803 -32762)
				(beg view: 130 setLoop: 1 posn: 190 77)
				(= global126 1)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(gEgo loop: 4 cel: 0 posn: 170 64)
				(proc0_2)
				(global5 eachElementDo: #hide)
				(= ticks 60)
			)
			(15
				((ScriptID 23) dispose:)
				((ScriptID 20) dispose:)
				((ScriptID 19) loop: 1 posn: 229 71)
				(global2 drawPic: 120 -32761)
				(global5 eachElementDo: #show)
				(proc121_0)
				(= ticks 12)
			)
			(16
				(proc851_0 @local116 7 13 self)
			)
			(17
				(gEgo setMotion: MoveTo 0 240)
				(beg setCycle: Walk setMotion: MoveTo 270 -2 self)
				((ScriptID 19)
					ignoreHorizon: 1
					setMotion: MoveTo 300 -2 self
				)
			)
			(18 0)
			(19
				(proc0_6 151)
				(proc0_6 54)
				(proc125_2)
				(global1 setSpeed: register)
				(proc806_6 0)
				(= ticks 12)
			)
			(20
				(if local20 (proc806_1 100) else (proc806_1 -200))
				(proc0_4)
				((ScriptID 19) dispose:)
				(self dispose:)
			)
		)
	)
)

(instance beggarDo of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if local22
					(proc13_4 1025 48)
					(self dispose:)
				else
					(= local22 1)
					(proc0_3)
					(gEgo setMotion: PChase beg 25 self)
				)
			)
			(1
				(proc851_0 @local122 3 @local0 self)
			)
			(2 (= ticks 30))
			(3
				(gEgo
					setCycle: Rev
					setLoop: (gEgo loop?)
					setHeading: (mod (+ (gEgo heading?) 180) 360)
					setMotion: MoveFwd 25 self
				)
			)
			(4
				(proc0_2)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance getWill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ceb
			pushi    0
			callb    proc0_3,  0
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0c78
			pushi    125
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      155
			lt?     
			bnt      code_0cab
			pushi    105
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      125
			lt?     
			jmp      code_0c9f
code_0c78:
			pushi    190
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      230
			lt?     
			bnt      code_0cab
			pushi    65
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_0cab
			pprev   
			ldi      85
			lt?     
code_0c9f:
			bnt      code_0cab
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0e12
code_0cab:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0cc8
			ldi      140
			jmp      code_0ccb
code_0cc8:
			ldi      205
code_0ccb:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0ce0
			ldi      115
			jmp      code_0ce2
code_0ce0:
			ldi      75
code_0ce2:
			push    
			pushSelf
			lag      gEgo
			send     12
			jmp      code_0e12
code_0ceb:
			dup     
			ldi      1
			eq?     
			bnt      code_0d01
			pushi    3
			lsg      gEgo
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0e12
code_0d01:
			dup     
			ldi      2
			eq?     
			bnt      code_0d23
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			pushi    #blewHorn
			pushi    1
			pushi    1
			class    Wat
			send     6
			jmp      code_0e12
code_0d23:
			dup     
			ldi      3
			eq?     
			bnt      code_0d4b
			pushi    1
			pushi    20
			callk    ScriptID,  2
			pushi    4
			pushi    128
			pushi    160
			pushi    161
			pushi    162
			calle    proc958_0,  8
			ldi      60
			aTop     ticks
			jmp      code_0e12
code_0d4b:
			dup     
			ldi      4
			eq?     
			bnt      code_0d8e
			pushi    #posn
			pushi    2
			pushi    335
			pushi    120
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    161
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    270
			pushi    120
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     32
			pushi    2
			lsg      gEgo
			pushi    1
			pushi    20
			callk    ScriptID,  2
			push    
			callb    proc0_9,  4
			jmp      code_0e12
code_0d8e:
			dup     
			ldi      5
			eq?     
			bnt      code_0d9c
			ldi      12
			aTop     ticks
			jmp      code_0e12
code_0d9c:
			dup     
			ldi      6
			eq?     
			bnt      code_0db7
			pushi    4
			lea      @local127
			push    
			pushi    3
			pushi    14
			pushSelf
			calle    proc851_0,  8
			jmp      code_0e12
code_0db7:
			dup     
			ldi      7
			eq?     
			bnt      code_0dd7
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    335
			pushi    120
			pushSelf
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     12
			jmp      code_0e12
code_0dd7:
			dup     
			ldi      8
			eq?     
			bnt      code_0ded
			pushi    3
			lsg      gEgo
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0e12
code_0ded:
			dup     
			ldi      9
			eq?     
			bnt      code_0e12
			pushi    0
			callb    proc0_4,  0
			pushi    #disable
			pushi    1
			pushi    5
			lag      gIconBar
			send     6
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0e12:
			toss    
			ret     
		)
	)
)

(instance threat of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(beg dispose:)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0efd
			pushi    #cycleSpeed
			pushi    0
			lag      gEgo
			send     4
			aTop     register
			pushi    #setSpeed
			pushi    1
			lsg      global141
			lag      global1
			send     6
			pushi    0
			callb    proc0_3,  0
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      50
			le?     
			bnt      code_0ea4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    175
			pushi    95
			pushSelf
			lag      gEgo
			send     12
			jmp      code_1325
code_0ea4:
			pushi    #distanceTo
			pushi    1
			lofsa    beg
			push    
			lag      gEgo
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_0ef4
			pushi    228
			pushi    2
			pushi    4
			dup     
			pushi    0
			lag      gEgo
			send     4
			push    
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			push    
			pushi    #x
			pushi    0
			lofsa    beg
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    beg
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      180
			add     
			push    
			ldi      360
			mod     
			push    
			pushSelf
			lag      gEgo
			send     8
			jmp      code_1325
code_0ef4:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1325
code_0efd:
			dup     
			ldi      1
			eq?     
			bnt      code_0f32
			pushi    #distanceTo
			pushi    1
			lofsa    beg
			push    
			lag      gEgo
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_0f29
			pushi    #setMotion
			pushi    3
			class    MoveFwd
			push    
			pushi    30
			pushSelf
			lag      gEgo
			send     10
			jmp      code_1325
code_0f29:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1325
code_0f32:
			dup     
			ldi      2
			eq?     
			bnt      code_0f48
			pushi    3
			lsg      gEgo
			lofsa    beg
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_1325
code_0f48:
			dup     
			ldi      3
			eq?     
			bnt      code_0f56
			ldi      12
			aTop     ticks
			jmp      code_1325
code_0f56:
			dup     
			ldi      4
			eq?     
			bnt      code_0f7c
			pushi    #view
			pushi    1
			pushi    4
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      gEgo
			send     14
			pushi    #init
			pushi    0
			pushi    42
			pushi    0
			lofsa    threatSound
			send     8
			jmp      code_1325
code_0f7c:
			dup     
			ldi      5
			eq?     
			bnt      code_0f8a
			ldi      48
			aTop     ticks
			jmp      code_1325
code_0f8a:
			dup     
			ldi      6
			eq?     
			bnt      code_0fa6
			pushi    4
			lea      @local133
			push    
			pushi    2
			lea      @local0
			push    
			pushSelf
			calle    proc851_0,  8
			jmp      code_1325
code_0fa6:
			dup     
			ldi      7
			eq?     
			bnt      code_0fb4
			ldi      60
			aTop     ticks
			jmp      code_1325
code_0fb4:
			dup     
			ldi      8
			eq?     
			bnt      code_0fd6
			pushi    #stop
			pushi    0
			pushi    108
			pushi    0
			lofsa    threatSound
			send     8
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      gEgo
			send     8
			jmp      code_1325
code_0fd6:
			dup     
			ldi      9
			eq?     
			bnt      code_0fe4
			ldi      12
			aTop     ticks
			jmp      code_1325
code_0fe4:
			dup     
			ldi      10
			eq?     
			bnt      code_1006
			pushi    #stopUpd
			pushi    0
			lofsa    beg
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    5
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1325
code_1006:
			dup     
			ldi      11
			eq?     
			bnt      code_10b8
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1045
			pushi    125
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      155
			lt?     
			bnt      code_1078
			pushi    105
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      125
			lt?     
			jmp      code_106c
code_1045:
			pushi    190
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      230
			lt?     
			bnt      code_1078
			pushi    65
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			lt?     
			bnt      code_1078
			pprev   
			ldi      85
			lt?     
code_106c:
			bnt      code_1078
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1325
code_1078:
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_1095
			ldi      140
			jmp      code_1098
code_1095:
			ldi      205
code_1098:
			push    
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_10ad
			ldi      115
			jmp      code_10af
code_10ad:
			ldi      75
code_10af:
			push    
			pushSelf
			lag      gEgo
			send     12
			jmp      code_1325
code_10b8:
			dup     
			ldi      12
			eq?     
			bnt      code_10c6
			ldi      12
			aTop     ticks
			jmp      code_1325
code_10c6:
			dup     
			ldi      13
			eq?     
			bnt      code_10e7
			pushi    #stopUpd
			pushi    0
			lag      gEgo
			send     4
			pushi    #setScript
			pushi    2
			pushi    2
			pushi    125
			pushi    1
			callk    ScriptID,  4
			push    
			pushSelf
			self     8
			jmp      code_1325
code_10e7:
			dup     
			ldi      14
			eq?     
			bnt      code_1106
			pushi    #setMotion
			pushi    4
			class    PChase
			push    
			lsg      gEgo
			pushi    30
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     12
			jmp      code_1325
code_1106:
			dup     
			ldi      15
			eq?     
			bnt      code_1121
			pushi    4
			lea      @local140
			push    
			pushi    3
			pushi    13
			pushSelf
			calle    proc851_0,  8
			jmp      code_1325
code_1121:
			dup     
			ldi      16
			eq?     
			bnt      code_119b
			pushi    #number
			pushi    1
			pushi    127
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      gSFX
			send     16
			pushi    #view
			pushi    1
			pushi    130
			pushi    284
			pushi    2
			pushi    158
			pushi    81
			pushi    162
			pushi    1
			pushi    1
			lofsa    beg
			send     20
			ldi      1
			sag      global126
			pushi    #eachElementDo
			pushi    2
			pushi    99
			pushi    2
			pushi    125
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global9
			send     8
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    191
			pushi    79
			lag      gEgo
			send     14
			pushi    0
			callb    proc0_2,  0
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    32774
			lag      global2
			send     8
			ldi      60
			aTop     ticks
			jmp      code_1325
code_119b:
			dup     
			ldi      17
			eq?     
			bnt      code_11fa
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    20
			callk    ScriptID,  2
			send     4
			pushi    #loop
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    214
			pushi    60
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     14
			pushi    #loop
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    138
			pushi    76
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     14
			pushi    #drawPic
			pushi    2
			pushi    120
			pushi    32775
			lag      global2
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    194
			lag      global5
			send     6
			pushi    0
			calle    proc121_0,  0
			ldi      12
			aTop     ticks
			jmp      code_1325
code_11fa:
			dup     
			ldi      18
			eq?     
			bnt      code_1222
			pushi    11
			pushi    4
			lea      @local147
			push    
			pushi    7
			pushi    0
			lea      @local9
			push    
			pushi    3
			pushi    13
			pushi    2
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  22
			jmp      code_1325
code_1222:
			dup     
			ldi      19
			eq?     
			bnt      code_128d
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    270
			pushi    65534
			pushSelf
			lofsa    beg
			send     18
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    0
			pushi    240
			pushSelf
			lag      gEgo
			send     12
			pushi    #ignoreHorizon
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    300
			pushi    65534
			pushSelf
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     18
			pushi    #ignoreHorizon
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    245
			pushi    65534
			pushSelf
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     18
			jmp      code_1325
code_128d:
			dup     
			ldi      20
			eq?     
			bnt      code_1297
			jmp      code_1325
code_1297:
			dup     
			ldi      21
			eq?     
			bnt      code_12a1
			jmp      code_1325
code_12a1:
			dup     
			ldi      22
			eq?     
			bnt      code_12ab
			jmp      code_1325
code_12ab:
			dup     
			ldi      23
			eq?     
			bnt      code_12f0
			pushi    1
			pushi    54
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    19
			callk    ScriptID,  2
			send     4
			pushi    #dispose
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     4
			pushi    0
			calle    proc125_2,  0
			pushi    0
			callb    proc0_2,  0
			pushi    #setSpeed
			pushi    1
			pTos     register
			lag      global1
			send     6
			pushi    1
			pushi    0
			calle    proc806_6,  2
			ldi      12
			aTop     ticks
			jmp      code_1325
code_12f0:
			dup     
			ldi      24
			eq?     
			bnt      code_1325
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    65436
			calle    proc806_1,  2
			pushi    #section
			pushi    0
			class    Wat
			send     4
			push    
			ldi      9
			eq?     
			bnt      code_1320
			pushi    #newRoom
			pushi    1
			pushi    100
			lag      global2
			send     6
			jmp      code_1325
code_1320:
			pushi    #dispose
			pushi    0
			self     4
code_1325:
			toss    
			ret     
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (and (== theVerb 4) (== param2 1))
			1
			(if (Wat blewHorn?)
				(proc13_4 1025 68)
			else
				(gEgo setScript: getWill)
			)
		)
	)
)

(instance threatSound of Sound
	(properties
		flags $0001
		number 900
		loop -1
	)
)
