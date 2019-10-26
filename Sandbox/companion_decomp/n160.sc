;;; Sierra Script 1.0 - (do not remove this comment)
(script# 160)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n939)
(use n958)
(use n989)
(use n992)
(use n994)
(use n995)
(use n998)
(use n999)

(public
	rm160 0
)

(local
	[newProp 8]
	[local8 7] = [225 149 192 138 236 125 211]
	[local15 7] = [23 44 60 18 10 54 69]
	[local22 8] = [10 11 12 10 11 12 10]
	local30 =  10
	[local31 8] = [1160 1 1 2 3 4 1]
	[local39 6] = [1160 6 2 2 1]
	[local45 6] = [1160 9 2 1 3]
	[local51 8] = [1160 12 2 1 2 2 1]
	[local59 5] = [1160 17 2 1]
	[local64 4] = [1160 19 1]
	[local68 4] = [1160 20 1]
	[local72 4] = [1160 21 1]
	[local76 5] = [1160 22 2 1]
	[local81 6] = [1160 24 2 3 1]
	[local87 4] = [1160 27 1]
	[local91 4] = [1160 28 1]
	[local95 12] = [1161 2 2 5 3 5 5 4 1 2 1]
	[local107 7] = [1161 11 2 1 2 3]
	[local114 10] = [1161 15 3 6 2 6 4 4 1]
	[local124 6] = [1161 22 2 2 1]
	[local130 4] = [1161 25 1]
	[local134 13] = [1162 1 3 2 2 5 4 1 1 1 3 5]
	[local147 15] = [1162 13 3 4 3 2 3 2 3 2 5 1 4 4]
	[local162 8] = [1162 25 3 4 3 1 2]
	[local170 7] = [1162 30 1 1 2 2]
	[local177 9] = [1164 7 3 1 2 4 5 6]
	[local186 14] = [1164 13 3 2 1 4 5 3 5 2 1 1 5]
	[local200 10] = [1164 24 3 3 1 2 1 5 4]
	[local210 8] = [1164 31 4 1 3 1 2]
	[local218 15] = [1164 36 1 4 3 1 1 5 4 2 1 2 1 4]
	[local233 5] = [1164 29 2 1]
	[local238 11] = [1166 2 4 2 3 6 5 1 2 1]
	[local249 13] = [1166 12 4 1 2 1 4 1 3 1 1 4]
	[local262 11] = [1167 3 4 2 1 3 5 3 6 6]
	[local273 5] = [1167 17 2 1]
	[local278 8] = [1167 11 4 1 3 2 3]
	[local286 4] = [1167 16 1]
	[local290 7] = [1168 4 1 2 2 2]
	[local297 6] = [1168 8 1 2 2]
	[local303 28] = [1168 11 5 3 2 4 2 6 2 6 2 2 1 2 2 2 2 2 1 2 1 2 1 2 4 4 6]
	[local331 4] = [1168 36 2]
	[local335 10] = [1168 37 1 2 1 2 2 3 2]
	[local345 8] = [2160 3 3 1 2 2 1]
	[local353 11] = [2160 12 2 1 3 1 1 4 2 1]
	[local364 7] = [2161 2 1 4 3 2]
	[local371 6] = [2161 6 1 1 1]
	[local377 14] = [2161 9 1 4 1 3 4 2 5 1 3 1 1]
	[local391 10] = [2161 20 3 1 2 4 5 1 1]
	[local401 7] = [2161 27 3 1 2 1]
	[local408 7] = [2162 1 4 3 2 1]
	[local415 8] = [2162 5 4 4 2 5 1]
	[local423 4] = [2162 10 1]
)
(procedure (localproc_000e &tmp temp0)
	(global5 eachElementDo: #dispose)
	(= local30 0)
	(global2 drawPic: 803 9)
)

(procedure (localproc_002b)
	(log init: addToPic:)
	(gEgo view: 147 loop: 8 x: 250 y: 154 init:)
	(tuckView view: 155 loop: 3 x: 204 y: 185 init:)
	(willView view: 161 loop: 0 x: 162 y: 174 init:)
	(alanView view: 147 loop: 4 x: 234 y: 152 init:)
	(johnView view: 143 loop: 4 x: 177 y: 147 init:)
	(muchView view: 147 loop: 5 cel: 1 x: 144 y: 153 init:)
	(alanView setCycle: Fwd)
	(gSFX number: 161 loop: -1 play:)
)

(procedure (localproc_0110)
	(log init: addToPic:)
	(gEgo view: 143 loop: 5 x: 169 y: 151 init:)
	(tuckView view: 155 loop: 3 x: 202 y: 180 init:)
	(willView view: 161 loop: 1 x: 259 y: 172 init:)
	(alanView view: 147 loop: 4 x: 234 y: 152 init:)
	(johnView view: 143 loop: 4 cel: 5 x: 115 y: 155 init:)
	(muchView view: 147 loop: 5 x: 153 y: 185 init:)
	(alanView setCycle: Fwd)
	(gSFX number: 162 loop: -1 play:)
)

(procedure (localproc_01f6)
	(alanView setCycle: Fwd)
	(gSFX number: 161 loop: -1 play:)
)

(procedure (localproc_04b0 &tmp temp0)
	(= temp0 0)
	(while (< temp0 7)
		([newProp temp0]
			view: 147
			loop: [local22 temp0]
			x: [local8 (= [newProp temp0] (Prop new:))]
			y: [local15 temp0]
			init:
		)
		(++ temp0)
	)
	(newProp setScript: stars)
)

(instance rm160 of Rm
	(properties
		picture 803
	)
	
	(method (init)
		(proc0_3)
		(= global142 0)
		(= global149 0)
		(= global159 0)
		(= global150 0)
		(= global160 0)
		(= global167 0)
		(proc0_7 71)
		(proc0_7 129)
		(proc0_7 185)
		(super init:)
		(gRgnMusic number: 160 loop: -1 init: play:)
		(= gNewGuise 0)
		(self
			setScript:
				(switch global130
					(1 nightOne)
					(2 night2)
					(3 night3)
					(4 night4)
					(5
						(cond 
							((not (proc0_5 25)) nightFive)
							((proc0_5 125) boysStealthSaved)
							((== global12 250) boysBattleSaved)
							(1 battleWO)
						)
					)
					(6
						(cond 
							((proc0_5 25) nightSix)
							((proc0_5 125) boysStealthSaved)
							((== global12 250) boysBattleSaved)
							(1 battleWO)
						)
					)
					(7 night7)
					(8 night8)
					(9 night9)
					(10 night10)
					(11 night11)
					(12 night12)
					(else  0)
				)
		)
	)
	
	(method (doit)
		(super doit:)
		(Palette 6 236 254 1)
	)
	
	(method (dispose &tmp temp0)
		(++ global130)
		(= global150 0)
		(proc0_7 66)
		(gRgnMusic stop:)
		(gSFX fade: 0 30 8 1)
		(gIconBar curIcon: (= temp0 (gIconBar at: 0)))
		(= global19 (temp0 cursor?))
		(super dispose:)
	)
)

(instance stars of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(fireSound play:)
				(firePit init:)
				(= cycles 1)
			)
			(1
				([newProp (Random 0 6)]
					cycleSpeed: (Random 6 18)
					setCycle: Osc 1
				)
				(= ticks (Random 18 58))
				(-- state)
			)
		)
	)
)

(instance series of Script
	(properties)
	
	(method (init param1 param2 param3 theStart theStart_2)
		(global1 setCursor: global21 1 310 185)
		(= register 1)
		(= start theStart)
		(super init: param1 param2 param3)
		(= start theStart_2)
		(gKH addToFront: self)
		(gMH addToFront: self)
		(Load rsPIC 160)
		(proc958_0 128 140 143 147 158 161 164 152 155)
	)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 [temp4 256])
		(asm
			lap      newState
			aTop     state
			push    
			pToa     start
			le?     
			bnt      code_06c8
			pushi    #drawPic
			pushi    2
			pushi    803
			pushi    9
			lag      global2
			send     8
			pushi    3
			pTos     register
			pTos     state
			lea      @temp4
			push    
			callk    GetFarText,  6
			lea      @temp4
			sat      temp2
			ldi      0
			sat      temp3
			ldi      1
			sat      temp1
			pushi    1
			lst      temp2
			callk    StrLen,  2
			push    
			ldi      32
			lt?     
			bnt      code_060d
			pushi    1
			lst      temp2
			callk    StrLen,  2
			sat      temp0
			jmp      code_0611
code_060d:
			ldi      32
			sat      temp0
code_0611:
			lst      temp1
			ldi      0
			ne?     
			bnt      code_06bb
			pushi    2
			lea      @temp4
			push    
			lst      temp0
			callk    StrAt,  4
			sat      temp1
			pushi    6
			push    
			pushi    32
			pushi    9
			pushi    10
			pushi    13
			pushi    0
			calle    proc999_5,  12
			bnt      code_06b6
			pushi    3
			lea      @temp4
			push    
			lst      temp0
			pushi    0
			callk    StrAt,  6
			pushi    6
			lst      temp2
			pushi    100
			pushi    45
			pushi    40
			pushi    13
			lat      temp3
			mul     
			add     
			push    
			pushi    102
			lsg      global185
			callk    Display,  12
			lat      temp1
			bnt      code_0611
code_0663:
			pushi    6
			pushi    2
			lea      @temp4
			push    
			+at      temp0
			push    
			callk    StrAt,  4
			push    
			pushi    32
			pushi    9
			pushi    10
			pushi    13
			pushi    0
			calle    proc999_5,  12
			bnt      code_0686
			jmp      code_0663
code_0686:
			lea      @temp4
			push    
			lat      temp0
			add     
			sat      temp2
			+at      temp3
			pushi    1
			lst      temp2
			callk    StrLen,  2
			push    
			ldi      32
			lt?     
			bnt      code_06ac
			lst      temp0
			pushi    1
			lst      temp2
			callk    StrLen,  2
			add     
			sat      temp0
			jmp      code_0611
code_06ac:
			lst      temp0
			ldi      32
			add     
			sat      temp0
			jmp      code_0611
code_06b6:
			+at      temp0
			jmp      code_0611
code_06bb:
			lsg      global162
			lsg      global163
			lat      temp0
			mul     
			add     
			aTop     ticks
			jmp      code_06ef
code_06c8:
			pushi    #delete
			pushi    1
			pushSelf
			lag      gKH
			send     6
			pushi    #delete
			pushi    1
			pushSelf
			lag      gMH
			send     6
			pushi    0
			call     localproc_04b0,  0
			pushi    #drawPic
			pushi    2
			pushi    160
			pushi    9
			lag      global2
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_06ef:
			ret     
		)
	)
	
	(method (cue)
		(if (not register) (= start state))
		(super cue:)
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
		(self cue:)
	)
)

(instance marian of Prop
	(properties
		x 233
		y 146
		view 147
		loop 6
		cycleSpeed 7
	)
)

(instance firePit of Prop
	(properties
		x 222
		y 159
		view 140
		signal $4000
	)
	
	(method (init)
		(self setCycle: End self)
		(super init:)
	)
	
	(method (cue &tmp temp0)
		(= temp0 (Random 0 1))
		(self cycleSpeed: (Random 6 18))
		(if temp0
			(self setCycle: End self)
		else
			(self setCycle: Beg self)
		)
		(super cue:)
	)
)

(instance log of View
	(properties
		x 246
		y 148
		view 143
		loop 1
		priority 8
		signal $4010
	)
)

(instance tuckView of View
	(properties
		x 270
		y 173
		view 155
		loop 1
	)
)

(instance johnView of Actor
	(properties
		x 229
		y 183
		view 152
		loop 3
	)
)

(instance willView of View
	(properties
		x 208
		y 151
		view 161
		loop 1
	)
)

(instance alanView of Prop
	(properties
		x 164
		y 148
		view 158
		cycleSpeed 36
	)
)

(instance muchView of View
	(properties
		x 189
		y 166
		view 164
		loop 3
	)
)

(instance nightOne of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1160 0 0)
			)
			(1
				(= notKilled 1)
				(log posn: 246 148 init: addToPic:)
				(gEgo
					view: 143
					loop: 5
					x: 159
					y: 162
					cycleSpeed: 18
					init:
				)
				(tuckView view: 143 loop: 0 x: 257 y: 153 init:)
				(johnView view: 143 loop: 4 x: 132 y: 169 init:)
				(willView x: 212 y: 180 init:)
				(alanView
					view: 147
					loop: 4
					posn: (+ (log x?) -12) (+ (log y?) 2)
					init:
				)
				(muchView x: 159 y: 188 init:)
				(= cycles 2)
			)
			(2
				(localproc_01f6)
				(proc851_0 4 @local31 1 0 15 1 16 2 13 3 self)
			)
			(3 (gEgo setCycle: Osc 1 self))
			(4
				(proc851_0 2 @local39 15 0 14 1 self)
			)
			(5 (gEgo setCycle: Osc 1 self))
			(6
				(cond 
					((proc0_5 75) (proc851_0 3 @local45 1 0 13 1 15 2 self))
					((proc0_5 103) (proc851_0 2 @local51 1 0 13 1 self))
					(else (self cue:))
				)
			)
			(7
				(if (proc0_5 103)
					(proc806_1 -100)
					(= seconds 3)
				else
					(self cue:)
				)
			)
			(8
				(if (proc0_5 103)
					(proc851_0 2 @local59 1 0 15 1 self)
				else
					(self cue:)
				)
			)
			(9
				(if notKilled
					(gEgo setCycle: Osc 1 self)
				else
					(= cycles 1)
				)
			)
			(10
				(proc851_0 @local64 1 0 self)
			)
			(11
				(if notKilled
					(gEgo setCycle: Osc 1 self)
				else
					(= cycles 1)
				)
			)
			(12
				(proc851_0 @local68 1 0 self)
			)
			(13
				(if notKilled
					(gEgo setCycle: Osc 1 self)
				else
					(= cycles 1)
				)
			)
			(14
				(proc851_0 @local72 1 0 self)
			)
			(15
				(if notKilled
					(gEgo setCycle: Osc 1 self)
				else
					(= cycles 1)
				)
			)
			(16
				(proc851_0 2 @local76 1 0 13 3 self)
			)
			(17
				(if notKilled
					(gEgo setCycle: Osc 1 self)
				else
					(= cycles 1)
				)
			)
			(18
				(proc851_0 3 @local81 1 0 16 1 17 2 self)
			)
			(19
				(gEgo view: 145 loop: 1 cel: 0 setCycle: Osc 1 self)
			)
			(20
				(proc851_0 @local87 1 0 self)
			)
			(21
				(gEgo dispose:)
				(johnView view: 145 loop: 0 setCycle: End self)
			)
			(22
				(proc851_0 1 @local91 13 1 self)
			)
			(23
				(johnView
					setLoop: 2
					cel: 0
					setCycle: Walk
					setMotion: MoveTo 128 157 self
				)
			)
			(24
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night2 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 5)
					(self setScript: series self 1161 1 1)
				else
					(self setScript: series self 1161 0 0)
				)
			)
			(1
				(if (proc0_5 5) (localproc_002b) else (localproc_0110))
				(= seconds 2)
			)
			(2
				(proc851_0
					6
					(if (proc0_5 5) @local114 else @local95)
					1
					0
					15
					1
					13
					2
					14
					3
					3
					0
					2
					0
					self
				)
				(if (gEgo has: 3) (++ state))
			)
			(3
				(proc851_0
					3
					(if (proc0_5 5) @local124 else @local107)
					1
					0
					17
					1
					3
					0
					self
				)
				(gEgo get: 3)
			)
			(4
				(if (proc0_5 5)
					(proc851_0 @local130 1 0 self)
				else
					(= cycles 1)
				)
			)
			(5
				(localproc_000e)
				(= ticks 90)
			)
			(6
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night3 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1162 0 0)
			)
			(1
				(localproc_0110)
				(= seconds 2)
			)
			(2
				(proc851_0 5 @local134 1 0 15 1 16 2 13 3 3 0 self)
			)
			(3
				(localproc_000e)
				(= ticks 90)
			)
			(4
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night4 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (or (proc0_5 153) (proc0_5 174))
					(self setScript: series self 1162 11 11)
				else
					(self setScript: series self 1162 12 12)
				)
			)
			(1
				(if (proc0_5 184)
					(localproc_002b)
				else
					(localproc_0110)
				)
				(= seconds 2)
			)
			(2
				(if (proc0_5 184)
					(proc851_0 4 @local162 2 0 14 1 16 2 13 3 self)
				else
					(proc851_0 5 @local147 1 0 14 1 16 2 13 3 3 0 self)
				)
			)
			(3
				(if (proc0_5 184)
					(proc806_1 -100)
					(= seconds 3)
				else
					(self cue:)
				)
			)
			(4
				(if (proc0_5 184)
					(proc851_0 2 @local170 16 2 15 3 self)
				else
					(self cue:)
				)
			)
			(5
				(localproc_000e)
				(= ticks 90)
			)
			(6
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance boysStealthSaved of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1164 1 1)
			)
			(1
				(localproc_0110)
				(= cycles 2)
			)
			(2
				(proc851_0 5 @local200 3 0 15 1 16 2 14 3 13 1 self)
			)
			(3
				(localproc_000e)
				(= ticks 90)
			)
			(4
				(proc0_7 125)
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance boysBattleSaved of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1164 2 2)
			)
			(1
				(localproc_002b)
				(= cycles 2)
			)
			(2
				(proc851_0 4 @local210 1 0 14 1 15 2 13 3 self)
			)
			(3
				(proc851_0 2 @local233 14 0 13 1 self)
			)
			(4
				(localproc_000e)
				(= ticks 90)
			)
			(5
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance battleWO of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1164 3 5)
			)
			(1
				(proc806_5 -4)
				(localproc_002b)
				(= cycles 2)
			)
			(2
				(proc851_0 5 @local218 1 0 14 1 17 2 13 3 15 2 self)
			)
			(3
				(localproc_000e)
				(= ticks 90)
			)
			(4
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance nightFive of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1164 0 0)
			)
			(1
				(localproc_0110)
				(= cycles 2)
			)
			(2
				(proc851_0 6 @local177 1 0 15 1 14 2 16 3 13 2 2 0 self)
			)
			(3
				(localproc_000e)
				(= ticks 90)
			)
			(4 (global2 newRoom: 140))
		)
	)
)

(instance nightSix of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 1164 6 6)
			)
			(1
				(localproc_0110)
				(= cycles 2)
			)
			(2
				(proc851_0 5 @local186 1 0 14 1 16 2 13 3 15 1 self)
			)
			(3
				(localproc_000e)
				(= ticks 90)
			)
			(4
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night7 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 120)
					(self setScript: series self 1166 0 0)
				else
					(self setScript: series self 1166 1 1)
				)
			)
			(1
				(if (proc0_5 120)
					(localproc_0110)
				else
					(localproc_002b)
				)
				(= cycles 2)
			)
			(2
				(proc851_0
					6
					(if (proc0_5 120) @local238 else @local249)
					1
					0
					15
					1
					16
					2
					13
					3
					14
					2
					3
					0
					self
				)
			)
			(3
				(localproc_000e)
				(= ticks 60)
			)
			(4 (proc13_4 1166 10 self))
			(5 (proc13_4 1166 11 self))
			(6
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night8 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 10)
					(self setScript: series self 1167 0 1)
				else
					(self setScript: series self 1167 2 2)
				)
			)
			(1
				(if (proc0_5 10)
					(localproc_0110)
				else
					(localproc_002b)
				)
				(= cycles 2)
			)
			(2
				(if (proc0_5 10)
					(proc851_0 6 @local262 3 0 15 1 16 2 13 3 14 1 1 0 self)
					(= state (+ state 2))
				else
					(proc851_0 4 @local278 1 0 14 1 16 2 13 3 self)
				)
			)
			(3
				(willView setLoop: 0)
				(= ticks 24)
			)
			(4
				(proc851_0 @local286 15 0 self)
			)
			(5
				(proc851_0 2 @local273 3 0 13 3 self)
			)
			(6
				(localproc_000e)
				(= ticks 90)
			)
			(7
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night9 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 122)
					(self setScript: series self 1168 0 1)
				else
					(self setScript: series self 1168 2 3)
				)
			)
			(1
				(localproc_0110)
				(gEgo view: 147 loop: 7 x: 251 y: 149)
				(marian view: 147 loop: 6 cel: 0 x: 233 y: 146 init:)
				(alanView
					view: 147
					loop: 4
					x: 81
					y: 142
					priority: 15
					signal: 16
				)
				(willView view: 161 loop: 0 x: 140 y: 149)
				(= cycles 2)
			)
			(2
				(proc851_0
					2
					(if (proc0_5 122) @local290 else @local297)
					1
					0
					22
					1
					self
				)
			)
			(3
				(proc851_0 6 @local303 1 0 22 1 14 2 15 3 13 0 3 0 self)
				(if
					(or
						(gEgo has: 12)
						(proc0_5 101)
						(== ((Inv at: 12) owner?) 140)
					)
					(++ state)
				)
			)
			(4
				(self setScript: getPuzzBox self)
			)
			(5
				(localproc_000e)
				(= ticks 90)
			)
			(6
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance getPuzzBox of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 2 @local331 1 0 22 1 self)
			)
			(1 (= seconds 2))
			(2
				(marian setCycle: End self)
				(= ticks 13)
			)
			(3 (gEgo setCycle: End self))
			(4)
			(5 (= ticks 27))
			(6
				(marian setCycle: Beg self)
				(gEgo setCycle: Beg)
			)
			(7
				(gEgo get: 12)
				(proc851_0 3 @local335 1 0 22 1 3 0 self)
			)
			(8 (self dispose:))
		)
	)
)

(instance night10 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 62)
					(self setScript: series self 2160 0 1)
				else
					(self setScript: series self 2160 2 2)
				)
			)
			(1
				(if (proc0_5 62)
					(localproc_0110)
				else
					(localproc_002b)
				)
				(= seconds 2)
			)
			(2
				(if (proc0_5 62)
					(proc851_0 4 @local353 1 0 15 1 14 2 13 3 self)
				else
					(proc851_0 3 @local345 2 0 14 1 13 2 self)
				)
			)
			(3
				(localproc_000e)
				(= ticks 90)
				(if (proc0_5 62) (= state (+ state 2)))
			)
			(4 (proc13_4 2160 8 self))
			(5 (proc13_4 2160 9 self))
			(6 (proc13_4 2160 10 self))
			(7 (proc13_4 2160 11 self))
			(8
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance noPass of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc851_0 3 @local401 1 0 14 1 13 2 self)
			)
			(1
				(localproc_000e)
				(= ticks 90)
			)
			(2 (proc13_4 2161 32 self))
			(3 (self dispose:))
		)
	)
)

(instance night11 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if (proc0_5 65)
					(self setScript: series self 2161 0 0)
				else
					(self setScript: series self 2161 1 1)
				)
			)
			(1
				(= register
					(cond 
						((proc0_5 65) 2)
						((== global146 63) 0)
						(else 1)
					)
				)
				(if (or (== register 0) (== register 1))
					(localproc_002b)
				else
					(localproc_0110)
				)
				(= cycles 2)
			)
			(2
				(switch register
					(0
						(proc851_0 5 @local391 1 0 14 1 17 2 13 3 15 1 self)
						(proc806_5 -1)
						(= state (+ state 2))
					)
					(2
						(proc851_0 4 @local364 3 0 15 1 14 2 13 3 self)
					)
					(1
						(localproc_01f6)
						(proc851_0 5 @local377 1 0 15 1 14 2 13 3 16 3 self)
						(= state (+ state 2))
					)
				)
			)
			(3
				(gEgo cycleSpeed: 18 setCycle: Osc 1 self)
			)
			(4
				(proc851_0 @local371 3 0 self)
			)
			(5
				(if (not (if (proc0_5 51) else (proc0_5 62)))
					(self setScript: noPass self)
				else
					(localproc_000e)
					(= ticks 90)
				)
			)
			(6
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance night12 of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: series self 2162 0 0)
			)
			(1
				(localproc_002b)
				(= cycles 2)
			)
			(2
				(if (gEgo has: 9) (++ state))
				(proc851_0 4 @local408 1 0 15 3 17 1 13 2 self)
			)
			(3
				(gEgo get: 9)
				(proc851_0 5 @local415 1 0 15 3 17 1 13 2 14 2 self)
			)
			(4
				(proc851_0 1 @local423 14 2 self)
			)
			(5
				(localproc_000e)
				(= ticks 90)
			)
			(6
				(gSFX fade: 0 30 8 1)
				(global2 newRoom: 140)
			)
		)
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)
