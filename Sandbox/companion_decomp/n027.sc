;;; Sierra Script 1.0 - (do not remove this comment)
(script# 27)
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
(use n950)
(use n951)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n996)
(use n998)
(use n999)

(public
	fMonk 0
	monkScript 1
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	newProp
	newPicView
	[local8 4] = [1027 27 1]
	[local12 6] = [1027 1 2 1 2]
	[local18 4] = [1027 4 1]
	[local22 6] = [1027 11 2 1 2]
	[local28 5] = [1027 14 1 2]
	[local33 13] = [1027 17 1 2 1 2 1 2 2 2 1 2]
	[local46 4] = [1027 5 1]
	[local50 5] = [1027 6 1 2]
	[local55 5] = [1027 28 2 1]
	[local60 9] = [1027 30 1 2 2 1 2 2]
	[local69 4] = [1027 36 1]
	[local73 4] = [1027 38 1]
	[local77 5] = [1027 39 2 1]
	[local82 4] = [1027 41 1]
	[local86 5] = [1027 42 1 2]
	[local91 4] = [1027 37 1]
	[local95 5] = [1027 44 2 1]
	[local100 8] = [1027 46 1 2 3 1 2]
	[local108 7] = [1027 51 2 1 2 1]
	[local115 9] = [1027 55 3 1 2 1 1 1]
	[local124 8] = [1027 61 2 3 1 1 1]
	[local132 10] = [1027 66 4 1 2 3 2 1 4]
	[local142 4] = [1027 73 1]
	[local146 4] = [1027 74 1]
)
(instance fMonk of Actor
	(properties
		description 8166
		view 128
		signal $2000
	)
	
	(method (init)
		(gSFX number: 126 loop: -1 play:)
		(if (== (Wat travelDir?) 1) (= local2 1))
		(if (== global130 5) (proc0_6 133) else (proc0_6 134))
		(closePoly init:)
		(super init:)
	)
	
	(method (doit)
		(asm
			pToa     script
			bt       code_0079
			pushi    #script
			pushi    0
			lag      gEgo
			send     4
			bt       code_0079
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_007c
code_0079:
			jmp      code_0190
code_007c:
			lal      local1
			not     
			bnt      code_00a3
			pushi    #onMe
			pushi    1
			lsg      gEgo
			lofsa    closePoly
			send     6
			bnt      code_00a3
			ldi      1
			sal      local1
			pushi    #setScript
			pushi    1
			lofsa    getBack
			push    
			lag      gEgo
			send     6
			jmp      code_0190
code_00a3:
			lal      local2
			bnt      code_0105
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_00d7
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
			pTos     x
			pTos     y
			callk    GetAngle,  8
			push    
			ldi      170
			lt?     
			jmp      code_00f5
code_00d7:
			pushi    4
			pTos     x
			pTos     y
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      190
			gt?     
code_00f5:
			bnt      code_0105
			pushi    #setScript
			pushi    1
			lofsa    LRScript
			push    
			self     6
			jmp      code_0190
code_0105:
			lal      local2
			not     
			bnt      code_0168
			pushi    #travelDir
			pushi    0
			class    Wat
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_013a
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
			pTos     x
			pTos     y
			callk    GetAngle,  8
			push    
			ldi      190
			gt?     
			jmp      code_0158
code_013a:
			pushi    4
			pTos     x
			pTos     y
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			pushi    #y
			pushi    0
			lag      gEgo
			send     4
			push    
			callk    GetAngle,  8
			push    
			ldi      170
			lt?     
code_0158:
			bnt      code_0168
			pushi    #setScript
			pushi    1
			lofsa    RLScript
			push    
			self     6
			jmp      code_0190
code_0168:
			lal      local3
			bnt      code_0190
			pushi    #inRect
			pushi    4
			pushi    20
			pushi    50
			pushi    300
			pushi    180
			lag      gEgo
			send     12
			not     
			bnt      code_0190
			pushi    #setScript
			pushi    1
			lofsa    comeBackLittleEgo
			push    
			lag      gEgo
			send     6
code_0190:
			pushi    #doit
			pushi    0
			super    Actor,  4
			ret     
		)
	)
	
	(method (dispose)
		(gSFX fade: 0 30 8 1)
		(global2 notify:)
		(self setCycle: 0 setMotion: 0)
		(Wat weMeetAgain: 1)
		(if (global32 contains: closePoly) (closePoly dispose:))
		(proc0_6 39)
		(super dispose:)
		(self delete:)
		(DisposeScript 27)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1027 0))
			(5
				(if (Wat offRoad?)
					(if (not (Wat charFirstTalk?))
						(Wat charFirstTalk: 1)
						(proc851_0 @local12 1 11)
					else
						(proc851_0 1 @local18 11 3)
					)
				else
					(proc851_0 1 @local46 11 3)
				)
			)
			(10 (gEgo setScript: drawBow))
			(4
				(if (== param2 0)
					(if local4
						(proc13_4 1027 8 1)
					else
						(= local4 1)
						(proc851_0 @local50 1 11)
					)
				else
					(gEgo setMotion: PChase fMonk 20)
				)
			)
			(3 (gEgo setScript: getBack))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance egoActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(if local3
					(proc13_4 1027 9 0)
				else
					(gEgo setScript: getYerMen)
				)
				1
			else
				0
			)
		)
	)
)

(instance menActions of SpecialDoVerb
	(properties)
	
	(method (doVerb)
		(proc13_4 1027 10 1)
		(return 1)
	)
)

(instance RLScript of Script
	(properties)
	
	(method (doit)
		(if (and (gEgo mover?) (closePoly onMe: gEgo))
			(gEgo setMotion: 0)
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== (Wat travelDir?) 3)
					(fMonk
						cel: 1
						loop: (+ (fMonk loop?) 1)
						x: (+ (fMonk x?) 5)
						y: (- (fMonk y?) 2)
					)
				else
					(fMonk
						cel: 1
						loop: (- (fMonk loop?) 1)
						y: (- (fMonk y?) 1)
					)
				)
				(= ticks 18)
			)
			(1
				(if (== (Wat travelDir?) 3)
					(fMonk cel: 0 x: (+ (fMonk x?) 7) y: (+ (fMonk y?) 4))
				else
					(fMonk cel: 0 x: (- (fMonk x?) 2) y: (- (fMonk y?) 2))
				)
				(= local2 1)
				(self dispose:)
			)
		)
	)
)

(instance LRScript of Script
	(properties)
	
	(method (doit)
		(if (and (gEgo mover?) (closePoly onMe: gEgo))
			(gEgo setMotion: 0)
		)
		(super doit:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (== (Wat travelDir?) 3)
					(fMonk cel: 1 x: (- (fMonk x?) 7) y: (- (fMonk y?) 4))
				else
					(fMonk cel: 1 x: (+ (fMonk x?) 2) y: (+ (fMonk y?) 2))
				)
				(= ticks 18)
			)
			(1
				(if (== (Wat travelDir?) 3)
					(fMonk
						loop: (- (fMonk loop?) 1)
						cel: 0
						x: (- (fMonk x?) 5)
						y: (+ (fMonk y?) 2)
					)
				else
					(fMonk
						loop: (+ (fMonk loop?) 1)
						cel: 0
						y: (+ (fMonk y?) 1)
					)
				)
				(= local2 0)
				(self dispose:)
			)
		)
	)
)

(instance monkScript of TScript
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3)
		(switch (= state newState)
			(0
				(if (== (Wat travelDir?) 3)
					(= temp0 235)
					(= temp1 50)
					(= temp2 205)
					(= temp3 70)
				else
					(= temp0 85)
					(= temp1 160)
					(= temp2 135)
					(= temp3 125)
				)
				(proc0_3)
				(Wat setScript: 0)
				(if (Wat weMeetAgain?)
					(client setScript: repeatEncounter)
				else
					(if (not (global5 contains: fMonk)) (fMonk init:))
					(fMonk
						posn: temp0 temp1
						setLoop: (if (== (Wat travelDir?) 3) 0 else 2)
						setCycle: Walk
						setMotion: MoveTo temp2 temp3 self
					)
				)
			)
			(1
				(fMonk
					setLoop: (if (== (Wat travelDir?) 3) 4 else 6)
					setCel: 0
					cycleSpeed: 60
					ignoreActors: 1
				)
				(proc0_2)
				(= ticks 18)
			)
			(2
				(proc851_0 @local22 3 11 self 0)
			)
			(3
				(proc851_0 @local28 1 11 self 0)
			)
			(4
				(proc851_0 @local33 2 11 self)
			)
			(5
				(proc0_4)
				(gEgo actions: egoActions)
				(self dispose:)
			)
		)
	)
)

(instance repeatEncounter of Script
	(properties)
	
	(method (dispose)
		(gIconBar disable: 5)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(1
				(proc851_0 1 @local8 11 3 self)
			)
			(2
				(proc0_4)
				(gEgo actions: egoActions)
				(self dispose:)
			)
		)
	)
)

(instance comeBackLittleEgo of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(proc851_0 1 @local142 11 1 self)
			)
			(1 (proc0_9 gEgo fMonk self))
			(2 (= ticks 12))
			(3
				(proc851_0 1 @local146 2 0 self)
			)
			(4
				(gEgo
					setMotion:
						PolyPath
						(if (== (Wat travelDir?) 3) 140 else 205)
						(if (== (Wat travelDir?) 3) 115 else 75)
						self
				)
			)
			(5
				(= local5 1)
				(client setScript: drawBow)
			)
		)
	)
)

(instance getBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if local1
					(gEgo setMotion: 0)
					(proc0_9 gEgo fMonk self)
				else
					(gEgo setMotion: PChase fMonk 40 self)
				)
			)
			(1
				(fMonk setCel: 1)
				(= ticks 30)
			)
			(2
				(proc851_0 @local55 1 11 self 1)
			)
			(3
				(gEgo
					setCycle: Rev
					setLoop: (gEgo loop?)
					setMotion: MoveFwd (if (closePoly onMe: gEgo) -25 else -12) self
				)
			)
			(4
				(= local1 0)
				(proc0_2)
				(fMonk setCel: 0)
				(= ticks 30)
			)
			(5
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance drawBow of Script
	(properties)
	
	(method (dispose)
		(shootSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc958_0 128 4 5)
				(proc806_6 0)
				(proc0_3)
				(global1 setSpeed: global141)
				(proc0_9 gEgo fMonk self)
			)
			(1
				(gEgo view: 4 setCel: 0 setCycle: End self)
			)
			(2
				(shootSound loop: -1 play:)
				(gEgo
					view: 5
					setCel: 0
					setCycle: CT (- (gEgo lastCel:) 1) 1 self
				)
			)
			(3 (= ticks 12))
			(4
				(proc851_0 @local60 2 11 self)
			)
			(5
				(gSFX stop:)
				(if (proc851_1)
					(client setScript: staffFight)
				else
					(client setScript: shootMonk)
				)
			)
		)
	)
)

(instance staffFight of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX number: 15 loop: -1 play: hold: 1)
				(proc851_0 1 @local69 2 0 self)
			)
			(1
				(proc958_0 128 702 703 15 122 124 167)
				(gEgo setCycle: Beg self)
			)
			(2
				(proc0_2)
				(gEgo
					setMotion:
						PolyPath
						(if (== (Wat travelDir?) 3) 140 else 205)
						(if (== (Wat travelDir?) 3) 115 else 75)
						self
				)
			)
			(3 (= ticks 12))
			(4
				(if local3
					(= state (+ state 8))
					(self cue:)
				else
					(self setScript: (ScriptID 5 1) self)
				)
			)
			(5
				(gRgnMusic fade: 0 30 8 1)
				(proc851_0 @local77 2 11 self)
			)
			(6
				(gEgo
					setMotion:
						PolyPath
						(if (== (Wat travelDir?) 3) 140 else 205)
						(if (== (Wat travelDir?) 3) 115 else 75)
						self
				)
			)
			(7 (= ticks 12))
			(8
				(fMonk stopUpd:)
				(gEgo stopUpd:)
				(self setScript: (ScriptID 125 1) self)
			)
			(9
				(proc0_9 gEgo (ScriptID 19))
				((ScriptID 23) actions: (menActions new:))
				((ScriptID 20) actions: (menActions new:))
				((ScriptID 19)
					ignoreActors: 1
					actions: (menActions new:)
					setMotion: PolyPath 90 101 self
				)
			)
			(10
				(proc0_9 (ScriptID 19) gEgo self)
			)
			(11 (= ticks 12))
			(12
				(proc851_0 1 @local82 13 3 self)
			)
			(13
				(if local3
					(proc0_9 gEgo (ScriptID 19) self)
				else
					(= state (+ state 1))
					(self cue:)
				)
			)
			(14 (= ticks 12))
			(15
				(proc851_0 2 @local86 1 2 13 3 self)
			)
			(16
				(gEgo setMotion: MoveTo 222 117 self)
			)
			(17 (gEgo setHeading: 135 self))
			(18
				(gEgo
					view: 15
					posn: (+ (gEgo x?) 5) (+ (gEgo y?) 5)
					setLoop: 2
					setCel: 0
					cycleSpeed: 12
					setCycle: End self
				)
				((= newProp (Prop new:))
					view: 15
					ignoreActors: 1
					posn: (gEgo x?) (gEgo y?)
					setLoop: 6
					setCel: 0
					cycleSpeed: 12
					init:
					setCycle: End
					yourself:
				)
			)
			(19
				(newProp addToPic:)
				(gEgo setCycle: Beg self)
			)
			(20
				(gEgo
					posn: (- (gEgo x?) 9) (- (gEgo y?) 3)
					setLoop: 3
					setCycle: CT 5 1 self
				)
			)
			(21
				(proc0_2 2 702 703)
				(gEgo setHeading: 0 self)
				((= newPicView (PicView new:))
					view: 15
					x: (+ (gEgo x?) 6)
					y: (+ (gEgo y?) 2)
					loop: 4
					cel: 0
					init:
					yourself:
				)
			)
			(22
				(global1 setSpeed: global141)
				(gEgo setMotion: MoveTo 131 99 self)
			)
			(23
				((ScriptID 20)
					setMotion: MoveTo (+ ((ScriptID 20) x?) 20) ((ScriptID 20) y?) self
				)
				(fMonk
					setLoop: (if (== (Wat travelDir?) 3) 0 else 2)
					cycleSpeed: 6
					setCycle: Walk
					setMotion: MoveTo 162 97 self
				)
			)
			(24
				((ScriptID 20) setHeading: 180)
			)
			(25
				(fMonk view: 124 loop: 0 cel: 0)
				(gEgo view: 167 loop: 3 cel: 0)
				((ScriptID 19)
					view: 167
					loop: 2
					cel: 0
					setCycle: CT 3 1 self
				)
			)
			(26
				((ScriptID 19) setCycle: End)
				(gEgo setCycle: End self)
			)
			(27
				(gEgo view: 122 posn: 145 100 loop: 0 cel: 0)
				(= ticks 30)
			)
			(28
				((gEgo looper?) dispose:)
				(gEgo hide: looper: 0)
				(gEgoHead hide:)
				(User canControl: 0)
				(fMonk hide: stopUpd:)
				((ScriptID 19) stopUpd:)
				((ScriptID 20) stopUpd:)
				((ScriptID 23) stopUpd:)
				(Wat qFight: 4660)
				(closePoly dispose:)
				((ScriptID 120 4) dispose:)
				((ScriptID 120 3) dispose:)
				((ScriptID 120 2) dispose:)
				(catchAll init:)
				(global10 eachElementDo: #dispose release:)
				((global2 obstacles?) eachElementDo: #dispose release:)
				(gSFX release:)
				(self setScript: (ScriptID 11) self)
			)
			(29
				(if (gEgo mover?) (gEgo setMotion: 0))
				((ScriptID 120 4) init:)
				((ScriptID 120 3) init:)
				((ScriptID 120 2) init:)
				(catchAll dispose:)
				(switch (Wat qFight?)
					(1
						(fMonk view: 124 loop: 0 cel: 0 show:)
						(gEgo view: 122 posn: 145 100 loop: 10 cel: 6 show:)
					)
					(2
						(fMonk view: 124 loop: 10 cel: 6 show:)
						(gEgo view: 167 posn: 131 99 loop: 3 cel: 7 show:)
					)
				)
			)
			(30 (= ticks 12))
			(31
				((ScriptID 19) startUpd:)
				((ScriptID 20) startUpd:)
				((ScriptID 23) startUpd:)
				(DisposeScript 11)
				(= ticks 30)
			)
			(32
				(switch (Wat qFight?)
					(1
						(client setScript: dieRobinDie)
					)
					(2
						(client setScript: dieMonkDie)
					)
				)
			)
		)
	)
)

(instance dieRobinDie of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 @local95 13 11 self)
			)
			(1
				(= global145 0)
				(((ScriptID 19) actions?) dispose:)
				(((ScriptID 23) actions?) dispose:)
				(((ScriptID 20) actions?) dispose:)
				(global2 newRoom: 170)
			)
		)
	)
)

(instance dieMonkDie of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo setCycle: CT 5 -1 self)
			)
			(1
				(gEgo cycleSpeed: 6 setCycle: Beg)
				((ScriptID 19) cycleSpeed: 6 setCycle: Beg self)
			)
			(2
				(proc0_2 1 702 703)
				(= ticks 30)
			)
			(3
				(gSFX number: 128 loop: -1 play:)
				(proc851_0 3 @local100 1 0 13 1 14 3 self)
			)
			(4
				(proc0_6 147)
				(global2 drawPic: 803 -32762)
				(= global126 6)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(gEgo get: 5 6)
				(proc0_2 5)
				(global5 eachElementDo: #hide)
				(= seconds 3)
			)
			(5
				(((ScriptID 19) actions?) dispose:)
				(((ScriptID 23) actions?) dispose:)
				((ScriptID 19) actions: 0 dispose:)
				((ScriptID 23) actions: 0 dispose:)
				(global2 drawPic: 120 -32761)
				(global1 setCursor: 0 1)
				(proc121_0 1)
				((ScriptID 20) posn: 200 110 loop: 1 show:)
				(gEgo show:)
				(gEgoHead show:)
				(= ticks 24)
			)
			(6
				(proc851_0 @local108 8 14 self)
			)
			(7
				((ScriptID 20)
					setMotion: PolyPath 340 ((ScriptID 20) y?) self
				)
			)
			(8
				(proc125_2)
				(((ScriptID 20) actions?) dispose:)
				((ScriptID 20) actions: 0 dispose:)
				(= cycles 2)
			)
			(9
				(proc0_4)
				(proc806_6 0)
				(proc806_1 (if local5 25 else 100))
				(self dispose:)
				(fMonk dispose:)
			)
		)
	)
)

(instance hereComesWill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(ScriptID 20)
				(ScriptID 23)
				(proc958_0 128 160 161 154 155)
				((ScriptID 20)
					posn: 330 125
					init:
					setCycle: StopWalk 161
					setMotion: MoveTo 240 125 self
				)
				((ScriptID 23)
					posn: 335 120
					init:
					setCycle: StopWalk 155
					setMotion: MoveTo 270 120
				)
			)
			(1 (= ticks 12))
			(2
				(proc0_9 gEgo (ScriptID 20) self)
			)
			(3 (= ticks 12))
			(4
				(proc851_0 3 @local115 1 0 14 1 15 3 self)
			)
			(5 (= ticks 45))
			(6
				(proc0_6 147)
				(global2 drawPic: 803 -32762)
				(= global126 6)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(gEgo get: 5 6 posn: 160 90)
				(global5 eachElementDo: #hide)
				(= seconds 3)
			)
			(7
				(global2 drawPic: 120 -32761)
				(proc121_0)
				((ScriptID 20) dispose:)
				((ScriptID 23) dispose:)
				(proc0_2 2)
				(gEgo show:)
				(proc125_2)
				(proc806_6 0)
				(= cycles 3)
			)
			(8
				(proc806_1 -100)
				(proc0_4)
				(self dispose:)
				(fMonk dispose:)
			)
		)
	)
)

(instance shootMonk of Script
	(properties)
	
	(method (dispose)
		(shootSound dispose:)
		(super dispose: &rest)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 1 @local91 2 0 self)
			)
			(1
				(gEgo cel: (gEgo lastCel:))
				(= ticks (/ (gEgo distanceTo: fMonk) 2))
			)
			(2
				(shootSound number: 906 loop: 1 play:)
				(fMonk
					setLoop: (+ (fMonk loop?) 4)
					setCel: 0
					cycleSpeed: 12
					setCycle: End self
				)
			)
			(3
				(gSFX stop:)
				(shootSound number: 907 play:)
				(proc0_2)
				(gEgo setMotion: PChase fMonk 30 self)
			)
			(4
				(if local3
					((ScriptID 20) setMotion: PChase fMonk 45 self)
				else
					(client setScript: hereComesWill)
				)
				(gSFX number: 127 loop: -1 play:)
			)
			(5
				(proc851_0 3 @local124 1 0 14 1 15 3 self)
			)
			(6
				(proc0_6 147)
				(= global126 6)
				(global9 eachElementDo: #perform (ScriptID 125 3))
				(gEgo get: 5 6)
				(proc125_2)
				(((ScriptID 20) actions?) dispose:)
				(((ScriptID 23) actions?) dispose:)
				(((ScriptID 19) actions?) dispose:)
				((ScriptID 20) actions: 0 dispose:)
				((ScriptID 23) actions: 0 dispose:)
				((ScriptID 19) actions: 0 dispose:)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 -32761)
				(= seconds 3)
			)
			(7
				(global2 drawPic: 120 -32761)
				(proc121_0)
				(gEgo posn: 160 90 show:)
				(proc0_2)
				(proc125_2)
				(= cycles 3)
				(proc806_6 0)
			)
			(8
				(proc806_1 -100)
				(proc0_4)
				(self dispose:)
				(fMonk dispose:)
			)
		)
	)
)

(instance getYerMen of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: (ScriptID 5 1) self)
			)
			(1
				(proc851_0 1 @local73 11 3 self)
			)
			(2
				(fMonk stopUpd:)
				(gEgo
					setMotion:
						PolyPath
						(if (== (Wat travelDir?) 3) 140 else 205)
						(if (== (Wat travelDir?) 3) 115 else 75)
						self
				)
			)
			(3 (proc0_9 gEgo fMonk self))
			(4 (= ticks 12))
			(5
				(gEgo stopUpd:)
				(self setScript: (ScriptID 125 1) self)
			)
			(6
				(proc0_9 gEgo (ScriptID 19))
				((ScriptID 19)
					ignoreActors: 1
					setMotion: PChase gEgo 35 self
				)
			)
			(7
				((ScriptID 19) actions: (menActions new:))
				((ScriptID 20) actions: (menActions new:))
				((ScriptID 23) actions: (menActions new:))
				(= ticks 12)
			)
			(8
				(proc851_0 4 @local132 1 0 11 3 14 1 13 2 self)
			)
			(9
				((ScriptID 19) setMotion: MoveTo 90 101 self)
			)
			(10
				(proc0_9 (ScriptID 19) gEgo self)
			)
			(11
				(= local3 1)
				(global2
					addObstacle:
						((Polygon new:)
							type: 2
							init: 73 107 65 96 103 96 96 107
							yourself:
						)
				)
				(proc0_4)
				(gIconBar disable: 5)
				(self dispose:)
			)
		)
	)
)

(instance closePoly of Feature
	(properties)
	
	(method (init)
		(if (== (Wat travelDir?) 3)
			((= onMeCheck (Polygon new:))
				type: 0
				init: 319 42 318 63 194 94 0 34
				yourself:
			)
		else
			((= onMeCheck (Polygon new:))
				type: 0
				init: 0 104 86 104 151 94 210 126 205 152 0 147
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(cond 
			(((ScriptID 120 3) onMe: self) ((ScriptID 120 3) doVerb: theVerb &rest))
			(((ScriptID 120 4) onMe: self) ((ScriptID 120 4) doVerb: theVerb &rest))
			(else ((ScriptID 120 2) doVerb: theVerb &rest))
		)
	)
)

(instance catchAll of Feature
	(properties
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb)
		(return 1)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 900
	)
)
