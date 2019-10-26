;;; Sierra Script 1.0 - (do not remove this comment)
(script# 470)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n995)
(use n998)
(use n999)

(public
	rm470 0
)

(local
	[local0 4] = [1470 26 1]
	[local4 12] = [1470 33 1 2 1 2 1 2 1 2 1]
	[local16 6] = [1470 43 1 1 1]
	[local22 5] = [1470 56 1 1]
	[local27 8] = [113 117 213 137 94 168 8 139]
	[local35 12] = [5 164 7 146 17 143 47 153 47 172 28 176]
	[local47 18] = [138 126 136 114 129 113 126 103 153 93 158 107 173 109 173 126 154 129]
	[local65 14] = [295 117 294 155 277 161 277 151 253 150 248 133 265 114]
	[local79 8] = [261 123 284 125 278 135 252 133]
	[local87 22] = [102 122 83 120 105 113 145 120 139 125 151 130 148 141 143 132 128 127 104 130 91 129]
	local109
	local110
)
(instance rm470 of StdRoom
	(properties
		picture 470
		south 450
	)
	
	(method (init)
		(= local109 global34)
		(= global34 0)
		(if (== gHeading 450) (gEgo x: 70) (gEgo edgeHit: 1))
		(super init: 0 3)
		(if (and script (not (proc0_5 202)))
			(script next: firstMess)
		)
		(fireSound play:)
		(fire init: setCycle: Fwd)
		(pillow init:)
		(pillowL init:)
		(pillowM init:)
		(rugPol points: @local27)
		(lChstPol points: @local35)
		(rChstPol points: @local47)
		(DeskPol points: @local65)
		(BookPol points: @local79)
		(SkinPol points: @local87)
		(rope init:)
		(bCurtains init:)
		(bTape init:)
		(table init:)
		(chair init:)
		(windows init:)
		(fTape init:)
		(skin onMeCheck: SkinPol init:)
		(bed init: approachVerbs: 3)
		(rug onMeCheck: rugPol init:)
		(lChest onMeCheck: lChstPol init: approachVerbs: 3)
		(rChest onMeCheck: rChstPol init: approachVerbs: 3)
		(book onMeCheck: BookPol init:)
		(desk onMeCheck: DeskPol init:)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 308 152 307 157 254 173 222 162 222 157 260 141
					yourself:
				)
				((Polygon new:)
					type: 3
					init:
						313
						137
						156
						117
						151
						118
						187
						125
						158
						131
						111
						121
						108
						122
						191
						139
						115
						161
						34
						136
						0
						152
						0
						163
						24
						159
						60
						171
						29
						179
						6
						173
						6
						189
						84
						189
						87
						186
						229
						186
						237
						189
						289
						189
						313
						169
					yourself:
				)
		)
		(gEgo actions: (ScriptID 452 3))
	)
	
	(method (doit &tmp gEgoEdgeHit)
		(cond 
			(script (script doit:))
			((= gEgoEdgeHit (gEgo edgeHit?))
				(if (== (= gEgoEdgeHit (gEgo edgeHit?)) 4)
					(self setScript: chkPriv)
				else
					(super doit:)
				)
			)
		)
	)
	
	(method (dispose)
		(= global34 local109)
		(super dispose:)
	)
)

(instance firstMess of Script
	(properties)
	
	(method (changeState newState)
		(if (< (= state newState) 3)
			(proc0_3)
			(proc13_4 1470 (+ 0 state) self)
		else
			(proc0_6 202)
			(proc0_4)
			(self dispose:)
		)
	)
)

(instance pillow of Actor
	(properties
		x 92
		y 117
		description 6612
		view 470
		loop 2
		priority 7
		signal $6911
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(cond 
					(local110 (gClient setScript: putBack))
					((== ((Inv at: 12) owner?) global11) (gClient setScript: getBox))
					(else (proc13_4 1470 28))
				)
			)
			(2
				(if (AvoidPath (gEgo x?) (gEgo y?) rugPol)
					(proc13_4 1470 9)
				else
					(proc13_4 1470 8)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(if (IsObject param1)
			(= temp0 (param1 x?))
			(= temp1 (param1 y?))
		else
			(= temp0 param1)
			(= temp1 param2)
		)
		(return
			(if (super onMe: temp0 temp1)
				(& (OnControl 2 temp0 temp1) (<< $0001 priority))
			else
				0
			)
		)
	)
)

(instance pillowL of Actor
	(properties
		x 60
		y 122
		view 470
		loop 2
		priority 9
		signal $6911
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (gClient setScript: checkL))
			(2
				(pillow doVerb: theVerb param2)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(if (IsObject param1)
			(= temp0 (param1 x?))
			(= temp1 (param1 y?))
		else
			(= temp0 param1)
			(= temp1 param2)
		)
		(return
			(if (super onMe: temp0 temp1)
				(& (OnControl 2 temp0 temp1) (<< $0001 priority))
			else
				0
			)
		)
	)
)

(instance pillowM of Actor
	(properties
		x 76
		y 119
		yStep 3
		view 470
		loop 2
		priority 8
		signal $6911
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (gClient setScript: checkM))
			(2
				(pillow doVerb: theVerb param2)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance putBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1470 27 self)
			)
			(1
				(Load rsVIEW 28)
				(pillow startUpd:)
				(gEgo setMotion: PolyPath 123 125 self)
			)
			(2
				(gEgo
					setPri: (gEgo priority?)
					setCycle: 0
					setMotion: MoveTo 117 128 self
				)
			)
			(3
				(gEgo
					yStep: (+ (gEgo yStep?) 1)
					setMotion: MoveTo 111 138 self
				)
			)
			(4
				(gEgo
					view: 28
					setLoop: 4
					setCel: 0
					yStep: (- (gEgo yStep?) 1)
					cycleSpeed: 6
					setCycle: End
				)
				(pillow
					signal: (& $feff (pillow signal?))
					setMotion: MoveTo 92 117 self
				)
			)
			(5
				(gEgo view: 23 setLoop: 5 setMotion: MoveTo 117 128 self)
			)
			(6
				(gEgo setMotion: MoveTo 123 125 self)
			)
			(7
				(= local110 0)
				(proc0_2 5)
				(pillow signal: (| $0100 (pillow signal?)) stopUpd:)
				(proc806_1 10)
				(if (HaveMouse)
					(= cycles 1)
				else
					(gEgo setMotion: PolyPath 163 131 self)
				)
			)
			(8 (proc0_4) (self dispose:))
		)
	)
)

(instance getBox of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(Load rsVIEW 28)
				(pillow startUpd:)
				(gEgo setMotion: PolyPath 123 125 self)
			)
			(1
				(gEgo
					setPri: (gEgo priority?)
					setCycle: 0
					setMotion: MoveTo 117 128 self
				)
			)
			(2
				(gEgo
					yStep: (+ (gEgo yStep?) 1)
					setMotion: MoveTo 111 138 self
				)
			)
			(3
				(gEgo
					view: 28
					setLoop: 4
					setCel: 0
					yStep: (- (gEgo yStep?) 1)
					cycleSpeed: 6
					setCycle: End
				)
				(pillow
					signal: (& $feff (pillow signal?))
					setMotion: MoveTo 102 120 self
				)
			)
			(4
				(= local110 1)
				(proc13_4 1470 26 self)
			)
			(5 (gEgo setCycle: Beg self))
			(6
				(gEgo view: 23 setLoop: 5 setMotion: MoveTo 117 128 self)
			)
			(7
				(gEgo setMotion: MoveTo 123 125 self)
			)
			(8
				(proc0_2 5)
				(gEgo get: 12)
				(proc806_1 25)
				(pillow signal: (| $0100 (pillow signal?)) stopUpd:)
				(if (HaveMouse)
					(= cycles 1)
				else
					(gEgo setMotion: PolyPath 163 131 self)
				)
			)
			(9
				(proc0_4)
				(bed approachVerbs:)
				(self dispose:)
			)
		)
	)
)

(instance checkM of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(Load rsVIEW 28)
				(pillowM startUpd:)
				(gEgo setMotion: PolyPath 72 146 self)
			)
			(1
				(proc0_9 gEgo pillowM)
				(= cycles 2)
			)
			(2
				(gEgo
					view: 28
					setLoop: 6
					setCel: 6
					cycleSpeed: 16
					setCycle: CT 3 -1
				)
				(pillowM
					signal: (& $feff (pillowM signal?))
					setMotion: MoveTo 80 110 self
				)
			)
			(3 (proc13_4 1470 29 self))
			(4
				(gEgo cycleSpeed: 6 setCycle: CT 5 1)
				(pillowM setMotion: MoveTo 76 119 self)
			)
			(5
				(pillowM signal: (| (pillowM signal?) $0100) stopUpd:)
				(proc0_2 6)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance checkL of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(Load rsVIEW 28)
				(pillowL startUpd:)
				(gEgo setMotion: PolyPath 47 141 self)
			)
			(1
				(proc0_9 gEgo pillowL)
				(= cycles 2)
			)
			(2
				(gEgo
					view: 28
					setLoop: 11
					setCel: 0
					cycleSpeed: 10
					setCycle: End
				)
				(pillowL
					signal: (& $feff (pillowL signal?))
					setMotion: MoveTo 65 120 self
				)
			)
			(3 (proc13_4 1470 29 self))
			(4
				(gEgo setCycle: Beg)
				(pillowL setMotion: MoveTo 60 122 self)
			)
			(5
				(pillowL signal: (| (pillowL signal?) $0100) stopUpd:)
				(proc0_2 6)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance chkPriv of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo -20 (gEgo y?) self)
			)
			(1 (= seconds 4))
			(2
				(gEgo setMotion: PolyPath 9 157 self)
			)
			(3 (proc13_4 1470 3 self))
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance rope of Feature
	(properties
		x 33
		y 135
		onMeCheck $0002
		lookStr 11
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(gClient setScript: ropePull)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance ropePull of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 36 139 self)
			)
			(1
				(proc0_9 gEgo rope)
				(= cycles 8)
			)
			(2
				(cond 
					(((ScriptID 452 2) seconds?) (proc0_4) (self dispose:))
					((proc0_5 100) (proc13_4 1470 42 self))
					(else (proc13_4 1470 32 self))
				)
			)
			(3
				(if (not (proc0_5 100))
					((ScriptID 452 0) setScript: (ScriptID 452 2) 0 doMonk)
					(proc0_6 100)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance doMonk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((= register ((ScriptID 452 1) new:))
					posn: 70 230
					init:
					setCycle: Walk
					setMotion: MoveTo 74 188 self
				)
			)
			(1
				(proc0_9 gEgo register)
				(proc0_9 register gEgo)
				(= cycles 2)
			)
			(2
				(cond 
					(local110 (proc851_0 @local16 10 0 self))
					((proc0_5 88) (proc851_0 @local22 10 0 self))
					(else (++ state) (proc851_0 @local4 10 9 self))
				)
			)
			(3
				(= global145 24)
				(gClient newRoom: 170)
			)
			(4
				(register setMotion: MoveTo 70 230 self)
			)
			(5
				(register dispose:)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance bCurtains of Feature
	(properties
		x 156
		y 184
		onMeCheck $0010
		lookStr 5
	)
)

(instance bTape of Feature
	(properties
		x 74
		y 127
		onMeCheck $0040
		lookStr 6
	)
)

(instance bed of Feature
	(properties
		x 106
		y 129
		onMeCheck $0200
		approachX 151
		approachY 150
		lookStr 7
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== ((Inv at: 12) owner?) global11)
					(proc13_4 1470 24 1)
				else
					(proc13_4 1470 25 1)
				)
			)
			(4
				(cond 
					((proc999_5 param2 0 2 18) (proc13_4 1470 62 1))
					((== param2 13) (proc13_4 1470 63 1))
					((== param2 12) (proc13_4 1470 64 1))
					(else (super doVerb: theVerb param2))
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance skin of Feature
	(properties
		x 117
		y 133
		description 6730
		lookStr 10
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(proc13_4 1470 31 1)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance table of Feature
	(properties
		x 156
		y 200
		onMeCheck $0080
		lookStr 12
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1470 58 1))
			(4 (bed doVerb: theVerb param2))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance desk of Feature
	(properties
		x 272
		y 153
		lookStr 13
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 4)
			(bed doVerb: theVerb param2)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance book of Feature
	(properties
		x 267
		y 155
		lookStr 14
	)
	
	(method (doVerb theVerb param2)
		(cond 
			((== theVerb 3) (proc13_4 1470 59 1))
			(
			(and (== theVerb 2) (< (gEgo distanceTo: self) 30)) (gClient setScript: readBook))
			(else (super doVerb: theVerb param2))
		)
	)
)

(instance readBook of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1470 15 self))
			(1 (proc13_4 470 0 self))
			(2 (proc13_4 470 1 self))
			(3 (self dispose:))
		)
	)
)

(instance chair of Feature
	(properties
		x 253
		y 159
		onMeCheck $0100
		lookStr 16
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1470 60 1))
			(4 (bed doVerb: theVerb param2))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance rug of Feature
	(properties
		lookStr 17
	)
	
	(method (doVerb theVerb param2)
		(if
			(and
				(== theVerb 3)
				(== ((Inv at: 12) owner?) global11)
			)
			(proc13_4 1470 61 1)
		else
			(super doVerb: theVerb param2)
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(= x gX)
		(= y gY)
		(super onMe: param1 param2)
	)
)

(instance windows of Feature
	(properties
		onMeCheck $0020
		lookStr 18
	)
	
	(method (onMe param1 param2)
		(= x (if (< gX 228) 173 else 283))
		(= y (if (< gX 228) 116 else 127))
		(super onMe: param1 param2)
	)
)

(instance fTape of Feature
	(properties
		x 222
		y 121
		onMeCheck $0008
		lookStr 19
	)
)

(instance rChest of Feature
	(properties
		x 159
		y 124
		approachX 173
		approachY 129
		lookStr 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (proc13_4 1470 21 1))
			(4 (bed doVerb: theVerb param2))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance lChest of View
	(properties
		x 28
		y 174
		approachX 61
		approachY 174
		lookStr 4
		view 470
		loop 1
		signal $4101
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3 (gClient setScript: openIt))
			(4 (bed doVerb: theVerb param2))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance openIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setHeading: 225 self)
			)
			(1
				(gEgo view: 470 loop: 0 cel: 1)
				(= ticks 16)
			)
			(2
				(lChest setCel: 1)
				(gEgo cel: 0)
				(= ticks 10)
			)
			(3 (proc13_4 1470 22 self))
			(4
				(lChest setCel: 0)
				(gEgo cel: 1)
				(= ticks 15)
			)
			(5 (proc0_2 5) (= cycles 2))
			(6 (proc13_4 1470 23 self))
			(7 (proc0_4) (self dispose:))
		)
	)
)

(instance fire of Actor
	(properties
		x 222
		y 124
		lookStr 20
		view 470
		loop 3
		priority 2
		signal $6010
	)
)

(instance rugPol of Polygon
	(properties
		size 4
	)
)

(instance lChstPol of Polygon
	(properties
		size 6
	)
)

(instance rChstPol of Polygon
	(properties
		size 9
	)
)

(instance DeskPol of Polygon
	(properties
		size 7
	)
)

(instance BookPol of Polygon
	(properties
		size 4
	)
)

(instance SkinPol of Polygon
	(properties
		size 11
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)
