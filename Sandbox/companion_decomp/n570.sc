;;; Sierra Script 1.0 - (do not remove this comment)
(script# 570)
(include sci.sh)
(use n000)
(use n013)
(use n564)
(use n806)
(use n807)
(use n851)
(use n945)
(use n946)
(use n950)
(use n956)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm570 0
)

(local
	local0
	local1
	[newCoins 15]
	local17
	[local18 4] = [1570 0 1]
	[local22 5] = [1570 1 1 2]
	[local27 5] = [1570 3 2 1]
	[local32 5] = [1570 5 2 1]
	[local37 5] = [1570 7 1 2]
	[local42 4] = [1570 9 2]
	[local46 5] = [1570 10 2 1]
	[local51 5] = [1570 12 2 1]
	[local56 5] = [1570 14 1 1]
	[local61 4] = [1570 16 1]
	[local65 4] = [1570 17 1]
	[local69 4] = [1570 52 1]
	[local73 4] = [1410 0 1]
	[local77 4] = [1410 4 1]
	[local81 4] = [1410 6 1]
	[local85 4] = [1410 8 1]
	[local89 9] = [255 0 1 4 6 23 29 7 12]
	[local98 9] = [255 0 1 4 6 23 29 7 11]
	[local107 9] = [255 0 1 4 6 23 29 7 13]
)
(instance rm570 of Rm
	(properties
		picture 570
		east 561
	)
	
	(method (init)
		(proc0_4)
		(= local0 1)
		(Load rsSCRIPT 956)
		(super init:)
		(if (not (TheDungeon coinsDoneBeenTook?))
			(= local1 1)
			(while
				(and
					(<= local1 (TheDungeon numberCoins?))
					(< local1 15)
				)
				((= [newCoins local1] (coins new:))
					setPri: 11
					init:
					posn: (Random 135 150) (Random 121 130)
				)
				(++ local1)
			)
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						0
						0
						229
						0
						229
						154
						207
						132
						200
						133
						188
						130
						174
						129
						84
						129
						77
						130
						71
						133
						57
						137
						47
						153
						6
						148
						5
						152
						45
						157
						32
						187
						242
						187
						231
						158
						231
						0
						319
						0
						318
						189
						0
						189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 181 137 180 146 160 155 94 155 97 137
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 154 165 159 180 101 180 108 165
					yourself:
				)
		)
		(theTorch setCycle: Fwd init:)
		(trapdoor init:)
		(proc806_3
			trapDoor
			table
			chair
			stool
			hiddenDoor
			doorway
			tunnel
			floor
			walls
		)
		(gRgnMusic number: 561 loop: -1 play:)
		(switch gHeading
			(561
				(global10 add: openDoor eachElementDo: #init doit:)
				(if
				(and (not (TheDungeon guardsGone?)) (!= global130 10))
					(gEgo setScript: instantDeath1)
				else
					(gEgo setScript: enterRoom)
				)
			)
			(390
				(global10 add: closedDoor eachElementDo: #init doit:)
				(gEgo posn: 22 151 init:)
				(proc0_3)
				(gEgo setScript: blessing)
			)
			(else 
				(gEgo posn: 130 127 loop: 2 init:)
			)
		)
		(proc0_2)
	)
	
	(method (doit)
		(cond 
			((& (gEgo onControl: 1) $0004) (if local0 (gEgo setCycle: FootstepWalk) (= local0 0)))
			((and (not (gEgo script?)) (not local0)) (proc0_2) (= local0 1))
		)
		(if
			(and
				(== global164 4)
				(== (TheDungeon trapDoorOpen?) 1)
				(not (gClient script?))
			)
			(gClient setScript: trembling)
		)
		(cond 
			((and (not (gEgo script?)) (< (gEgo x?) 27))
				(if (== global130 10)
					(proc13_6 19)
					(proc13_4 1570 18 80 {Giles} 67 21 165)
					(proc13_4 1570 19 80 {Roger} 67 21 21)
					(proc13_6 0)
					(= global145 31)
					(gClient newRoom: 170)
				else
					(gEgo setScript: comeBackHere)
				)
			)
			(
				(and
					(& (gEgo onControl: 1) $0002)
					(not (gEgo script?))
					(not local17)
				)
				(= local17 1)
				(gClient newRoom: 561)
			)
			(
				(and
					(TheDungeon timeToDie?)
					(!= (gEgo script?) instantDeath2)
					(!= (gEgo script?) instantDeath1)
					(not local17)
				)
				(= local17 1)
				(gEgo setScript: instantDeath2)
			)
			(
				(and
					(== (TheDungeon script?) (ScriptID 564 3))
					(TheDungeon neverBefore?)
				)
				(proc13_6 19)
				(proc13_4 1570 20 80 {Giles} 67 21 165)
				(proc13_4 1570 21 80 {Roger} 67 21 21)
				(proc13_6 0)
				(TheDungeon neverBefore: 0)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(DisposeScript 956)
		(super dispose:)
	)
)

(instance hob of Actor
	(properties
		x 84
		y 185
		view 254
		loop 1
		signal $0001
	)
)

(instance dicken of Actor
	(properties
		x 188
		y 180
		view 412
		loop 3
		signal $0001
	)
)

(instance hal of Actor
	(properties
		x 126
		y 177
		view 411
		loop 4
		signal $0001
	)
)

(instance roger of Actor
	(properties
		x 23
		y 153
		view 753
		signal $0001
	)
)

(instance giles of Actor
	(properties
		x 13
		y 153
		view 753
		signal $0001
	)
)

(instance jack of Actor
	(properties
		x 46
		y 154
		view 753
		signal $0001
	)
)

(instance trapDoor of Feature
	(properties
		lookStr 41
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 2
			init: 144 166 148 177 114 177 117 166
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(5
				(if (not (== global130 10))
					(if (TheDungeon trapDoorOpen?)
						(proc851_0 @local18 @local89 0)
					else
						(proc13_4 1570 23)
					)
				)
			)
			(4
				(if (TheDungeon trapDoorOpen?)
					(switch param2
						(13 (gEgo setScript: saveBoys))
						(else  (proc13_4 1570 24))
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance table of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				154
				119
				154
				132
				153
				156
				148
				149
				145
				135
				115
				135
				115
				145
				106
				154
				102
				132
				110
				119
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(2 (proc13_4 1570 25))
			(3 (proc13_4 1570 26))
			(4
				(switch param2
					(0 (gEgo setScript: putCoins))
					(else 
						(if (== global130 10)
							(proc13_6 19)
							(proc13_4 1570 18 80 {Giles} 67 21 65)
							(proc13_4 1570 19 80 {Roger} 67 21 21)
							(proc13_6 0)
							(= global145 31)
							(gClient newRoom: 170)
						else
							(gEgo setScript: instantDeath2)
						)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance chair of Feature
	(properties
		nsTop 115
		nsLeft 122
		nsBottom 144
		nsRight 139
		description 10691
		lookStr 27
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3 (proc13_4 1570 28))
			(4
				(switch param2
					(0
						(gEgo setScript: putCoins)
						(proc13_4 1570 29)
					)
					(else 
						(gEgo setScript: instantDeath2)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance stool of Feature
	(properties
		nsTop 132
		nsLeft 161
		nsBottom 144
		nsRight 171
		description 10707
		lookStr 30
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3 (proc13_4 1570 31))
			(4
				(switch param2
					(0
						(gEgo setScript: putCoins)
						(proc13_4 1570 29)
					)
					(else 
						(gEgo setScript: instantDeath2)
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance hiddenDoor of Feature
	(properties
		nsTop 100
		nsLeft 230
		nsBottom 155
		nsRight 241
		description 10723
		lookStr 32
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3 (proc13_4 1570 33))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance doorway of Feature
	(properties
		nsTop 78
		nsLeft 28
		nsBottom 160
		nsRight 38
		description 10750
		lookStr 34
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3 (proc13_4 1570 35))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance floor of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 190 130 214 183 47 183 76 132
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(2 (proc13_4 1570 36))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance walls of Feature
	(properties
		nsBottom 189
		nsRight 319
		description 10776
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(2 (proc13_4 1570 37))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance tunnel of Feature
	(properties
		nsTop 2
		nsLeft 284
		nsBottom 188
		nsRight 318
		description 10792
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(2 (proc13_4 1570 38))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance dickenWithRope of Prop
	(properties
		x 171
		y 146
		view 412
		loop 4
	)
)

(instance rope of Prop
	(properties
		x 171
		y 7
		view 412
	)
)

(instance theTorch of Prop
	(properties
		x 133
		y 103
		description 10830
		lookStr 39
		view 570
		loop 2
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3 (proc13_4 1570 40))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance trapdoor of Prop
	(properties
		x 147
		y 177
		description 10849
		lookStr 41
		view 570
		signal $4001
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3
				(cond 
					((== global130 10) (proc13_4 1570 42))
					((not ((ScriptID 564 2) seconds?)) (gEgo setScript: instantDeath3))
					((not (proc0_5 188)) (gEgo setScript: firstTimeOpen))
					((not (TheDungeon doneTalking?)) (gEgo setScript: backAgain))
					((== (TheDungeon trapDoorOpen?) 0) (gEgo setScript: openIt))
					(else (proc13_4 1570 43))
				)
			)
			(5
				(if (not (== global130 10))
					(if (TheDungeon trapDoorOpen?)
						(proc851_0 @local18 @local89 0 self)
					else
						(proc13_4 1570 23)
					)
				)
			)
			(4
				(if (TheDungeon trapDoorOpen?)
					(switch param2
						(13 (gEgo setScript: saveBoys))
						(else  (proc13_4 1570 24))
					)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance robes of View
	(properties
		x 164
		y 177
		view 570
		loop 4
		cel 1
	)
)

(instance coins of View
	(properties
		x 143
		y 129
		description 10877
		lookStr 44
		view 570
		loop 3
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10 (proc13_4 1570 22))
			(3 (gEgo setScript: getCoins))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance closedDoor of PicView
	(properties
		x 240
		y 163
		description 10893
		view 570
		loop 1
	)
)

(instance openDoor of PicView
	(properties
		x 239
		y 166
		description 10893
		view 570
		loop 1
		cel 1
		priority 11
		signal $4000
	)
)

(instance instantDeath1 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				((ScriptID 564 1) seconds: 2000)
				((ScriptID 564 2) seconds: 2000)
				((ScriptID 564 3) seconds: 2000)
				(proc0_3)
				(giles posn: 155 140 setCycle: Walk init:)
				(roger posn: 211 179 setCycle: Walk init:)
				(gEgo posn: 240 155 init:)
				(= cycles 2)
			)
			(1
				(gEgo setMotion: MoveTo 225 (gEgo y?) self)
			)
			(2
				(proc13_6 19)
				(proc13_4 1570 45 self 80 {Roger})
			)
			(3
				(proc13_5 1570 46 self 80 {Giles})
			)
			(4
				(roger setMotion: MoveTo 211 155)
				(giles setMotion: MoveTo 170 140 self)
			)
			(5
				(proc13_6 0)
				(= global145 32)
				(proc0_4)
				(gClient newRoom: 170)
				(self dispose:)
			)
		)
	)
)

(instance instantDeath2 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				((ScriptID 564 1) seconds: 2000)
				((ScriptID 564 2) seconds: 2000)
				((ScriptID 564 3) seconds: 2000)
				(proc0_3)
				(proc0_2)
				(= local0 1)
				(gEgo setMotion: PolyPath 215 155)
				(giles setCycle: Walk init: setMotion: MoveTo 70 153 self)
			)
			(1
				(roger setCycle: Walk init: setMotion: MoveTo 40 153 self)
			)
			(2
				(proc13_6 19)
				(proc13_4 1570 47 self 80 {Roger})
			)
			(3
				(proc13_5 1570 48 self 80 {Giles})
			)
			(4
				(proc13_4 1570 49 self 80 {Roger})
			)
			(5
				(= global145 32)
				(proc0_4)
				(gClient newRoom: 170)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance instantDeath3 of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				((ScriptID 564 1) seconds: 2000)
				((ScriptID 564 2) seconds: 2000)
				((ScriptID 564 3) seconds: 2000)
				(self setScript: openIt self)
			)
			(1
				(proc0_3)
				(giles setCycle: Walk init: setMotion: MoveTo 70 153 self)
			)
			(2
				(roger setCycle: Walk init: setMotion: MoveTo 40 153 self)
			)
			(3
				(proc13_6 19)
				(proc13_4 1570 18 self 80 {Giles} 67 21 165)
			)
			(4
				(proc13_4 1570 19 self 80 {Roger} 67 21 21)
			)
			(5
				(proc0_4)
				(= global145 32)
				(gClient newRoom: 170)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance blessing of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gIconBar disable:)
				(giles posn: 203 140 setCycle: Walk init:)
				(roger posn: 239 177 setCycle: Walk init:)
				(proc0_9 roger jack)
				(proc0_9 giles jack)
				(jack setCycle: Walk init: setMotion: MoveTo 65 138 self)
			)
			(1
				(proc0_9 jack giles)
				(gEgo setMotion: PolyPath 64 156 self)
			)
			(2
				(proc13_6 19)
				(proc13_4 1570 50 self 80 {Jack})
			)
			(3
				(proc13_5 1570 51 self 80 {Giles})
			)
			(4
				(proc13_6 0)
				(proc851_0 @local69 999 0 self)
			)
			(5
				(proc13_6 19)
				(proc13_4 1570 53 self 80 {Jack})
			)
			(6
				(proc13_6 0)
				(gEgo setMotion: MoveTo 84 165 self)
			)
			(7
				(self setScript: blessBoys self)
			)
			(8 (= cycles 1))
			(9
				(= notKilled 1)
				(proc13_6 19)
				(proc13_4 1570 54 self 80 {Jack})
			)
			(10
				(gEgo
					view: 411
					loop: 0
					cel: 5
					cycleSpeed: 24
					setCycle: CT 2 -1 self
				)
				(trapdoor cycleSpeed: 24 setCycle: Beg self)
			)
			(11
				(trapDoorSound number: 563 play:)
				(gEgo cycleSpeed: 24 setCycle: Beg self)
			)
			(12
				(proc0_2 2)
				(= local0 1)
				(TheDungeon trapDoorOpen: 0)
				(global1 setSpeed: global141)
				(= cycles 2)
			)
			(13
				(gEgo setMotion: MoveTo 75 160 self)
			)
			(14
				(gClient newRoom: 390)
				(proc0_4)
				(gIconBar enable:)
				(proc13_6 0)
				(self dispose:)
			)
		)
	)
)

(instance enterRoom of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo posn: 230 158 init:)
				(= ticks 12)
			)
			(1
				(gEgo setMotion: MoveTo 205 158 self)
			)
			(2
				(proc0_2)
				(= local0 1)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance firstTimeOpen of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: openIt self)
			)
			(1
				(proc0_3)
				(proc851_0 @local22 9 @local107 self)
			)
			(2
				(proc851_0 @local27 9 @local98 self)
			)
			(3
				(proc851_0 @local32 9 @local89 self)
			)
			(4
				(proc0_2 2)
				(= local0 1)
				(= global164 0)
				(TheDungeon doneTalking: 1)
				(proc0_4)
				(TheDungeon trapDoorOpen: 1)
				(proc0_6 188)
				(self dispose:)
			)
		)
	)
)

(instance backAgain of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: openIt self)
			)
			(1
				(proc0_3)
				(proc851_0 @local37 9 @local98 self)
			)
			(2
				(proc851_0 @local42 9 @local107 self)
			)
			(3
				(proc851_0 @local46 9 @local98 self)
			)
			(4
				(proc851_0 @local51 9 @local89 self)
			)
			(5
				(proc0_2)
				(= local0 1)
				(= global164 0)
				(TheDungeon doneTalking: 1)
				(proc0_4)
				(TheDungeon trapDoorOpen: 1)
				(proc0_6 188)
				(self dispose:)
			)
		)
	)
)

(instance putCoins of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 139 156 self)
			)
			(1
				(proc0_9 gEgo table)
				(if (> (gMoney doit:) 0)
					(proc806_1 75 165)
					(TheDungeon coinsLeft: 1)
				)
				(TheDungeon
					numberCoins:
						(+
							(gPennies taken?)
							(gHapennies taken?)
							(gFarthings taken?)
						)
				)
				(TheDungeon valueCoins: (gMoney get: taken:))
				(= cycles 2)
			)
			(2
				(= local1 1)
				(while
					(and
						(<= local1 (TheDungeon numberCoins?))
						(< local1 15)
					)
					((= [newCoins local1] (coins new:))
						setPri: 11
						init:
						posn: (Random 135 150) (Random 121 130)
					)
					(++ local1)
				)
				(proc0_2)
				(TheDungeon coinsDoneBeenTook: 0)
				(= local0 1)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance getCoins of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 139 156 self)
			)
			(1
				(proc0_9 gEgo table)
				(gEgo get: 0)
				(= cycles 2)
			)
			(2
				(= local1 1)
				(while
					(and
						(<= local1 (TheDungeon numberCoins?))
						(< local1 15)
					)
					([newCoins local1] dispose:)
					(++ local1)
				)
				(gMoney put:)
				(TheDungeon numberCoins: 0)
				(TheDungeon valueCoins: 0)
				(TheDungeon coinsLeft: 0)
				(proc0_2)
				(= local0 1)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance saveBoys of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gClient setScript: 0)
				(proc0_7 212)
				(if (and (!= (gEgo x?) 131) (!= (gEgo y?) 165))
					(gEgo setMotion: PolyPath 131 165 self)
				else
					(= ticks 2)
				)
			)
			(1
				(gEgo view: 23 loop: 2 cel: 4)
				(= cycles 3)
			)
			(2
				(TheDungeon setScript: 0)
				(TheDungeon longTimerGone: 1)
				(proc851_0 @local56 9 0 self)
			)
			(3
				(gEgo
					view: 411
					loop: 1
					cel: 0
					cycleSpeed: 3
					setCycle: ForwardCounter 3 self
				)
			)
			(4 (= ticks 60))
			(5
				(gEgo loop: 2 setCycle: End self)
			)
			(6
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 12)
			)
			(7
				(gEgo setCel: (+ (gEgo cel?) 1))
				(= ticks 12)
			)
			(8
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 12)
			)
			(9
				(gEgo setCel: (+ (gEgo cel?) 1))
				(= ticks 12)
			)
			(10
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 12)
			)
			(11
				(gEgo setCycle: End self)
				(= seconds 2)
			)
			(12)
			(13
				(hal x: 126 y: 177 signal: 1 view: 411 loop: 4 init:)
				(gEgo setCycle: Beg)
				(hal setCycle: End self)
			)
			(14
				(proc851_0 @local61 9 0 self)
			)
			(15
				(gEgo loop: 2 setCycle: End self)
			)
			(16
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 12)
			)
			(17
				(gEgo setCel: (+ (gEgo cel?) 1))
				(= ticks 12)
			)
			(18
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 12)
			)
			(19
				(gEgo setCel: (+ (gEgo cel?) 1))
				(= ticks 12)
			)
			(20
				(gEgo setCel: (- (gEgo cel?) 1))
				(= ticks 12)
			)
			(21
				(gEgo setCycle: End self)
				(= seconds 2)
			)
			(22)
			(23
				(robes init:)
				(gEgo put: 13)
				(gNewCast eachElementDo: #hide)
				(gClient drawPic: 410 10)
				(hob x: 84 y: 185 signal: 1 view: 254 loop: 1 init:)
				(dicken x: 188 y: 180 signal: 1 view: 412 loop: 3 init:)
				(rope init:)
				(= ticks 12)
			)
			(24 (rope setCycle: End self))
			(25
				(proc13_6 13)
				(proc13_4 1410 9 self 80 {Dicken})
			)
			(26
				(proc13_6 12)
				(proc13_4 1410 10 self 80 {Hob})
			)
			(27
				(proc13_6 0)
				(dicken setCycle: End self)
			)
			(28
				(rope dispose:)
				(dicken dispose:)
				(dickenWithRope init:)
				(= ticks 12)
			)
			(29
				(dickenWithRope cycleSpeed: 6 setCycle: End self)
			)
			(30
				(dickenWithRope dispose: delete:)
				(hob dispose: delete:)
				(= ticks 12)
			)
			(31
				(gClient drawPic: 570 10)
				(dicken view: 412 loop: 2 cel: 6 posn: 202 170 init:)
				(gNewCast eachElementDo: #show)
				(hal x: 94 y: 179 view: 254 loop: 2)
				(= ticks 12)
			)
			(32
				(proc851_0 @local65 9 0 self)
			)
			(33
				(proc0_4)
				(proc0_6 125)
				(TheDungeon boysRescued: 1)
				(proc806_1 150 56)
				(gClient newRoom: 561)
				(self dispose:)
			)
		)
	)
)

(instance comeBackHere of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= seconds 2))
			(1
				(gEgo setMotion: PolyPath 40 (gEgo y?) self)
			)
			(2
				(proc13_4 1570 55)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance blessBoys of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(self setScript: openIt self)
			)
			(1
				(proc0_3)
				(gNewCast eachElementDo: #hide)
				(gClient drawPic: 410 10)
				(hal view: 254 loop: 2 posn: 72 183 init:)
				(hob view: 254 loop: 1 posn: 109 179 init:)
				(dicken view: 412 loop: 2 posn: 266 184 init:)
				(= cycles 3)
			)
			(2
				(= notKilled 1)
				(proc851_0 @local73 9 0 self)
			)
			(3
				(hal setCycle: End)
				(dicken setCycle: End self)
			)
			(4
				(proc13_6 12)
				(proc13_4 1410 1 self 80 {Hob})
			)
			(5
				(proc13_6 13)
				(proc13_4 1410 2 self 80 {Dicken})
			)
			(6
				(proc13_6 11)
				(proc13_4 1410 3 self 80 {Hal})
			)
			(7
				(proc13_6 0)
				(proc851_0 @local77 9 0 self)
			)
			(8 (hal setCycle: Beg self))
			(9
				(proc13_6 11)
				(proc13_4 1410 5 self 80 {Hal})
			)
			(10
				(proc13_6 0)
				(proc851_0 @local81 9 0 self)
			)
			(11
				(proc13_6 19)
				(proc13_4 1410 7 self 80 {Jack})
			)
			(12
				(proc13_6 0)
				(proc851_0 @local85 9 0 self)
			)
			(13
				(proc0_6 188)
				(hal hide: dispose: delete:)
				(hob hide: dispose: delete:)
				(dicken hide: dispose: delete:)
				(gClient drawPic: 570 10)
				(gNewCast eachElementDo: #show)
				(global10 add: closedDoor doit:)
				(self dispose:)
			)
		)
	)
)

(instance trembling of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(TheDungeon trapDoorOpen: 0)
				(trapdoor x: (- (trapdoor x?) 1))
				(= cycles 2)
			)
			(1
				(trapdoor x: (+ (trapdoor x?) 1))
				(= cycles 2)
			)
			(2
				(trapdoor x: (- (trapdoor x?) 1))
				(= cycles 2)
			)
			(3
				(trapdoor x: (+ (trapdoor x?) 1))
				(= cycles 2)
			)
			(4
				(trapdoor x: (- (trapdoor x?) 1))
				(= cycles 2)
			)
			(5
				(trapdoor x: (+ (trapdoor x?) 1))
				(= cycles 2)
			)
			(6
				(trapdoor cycleSpeed: 6 setCycle: Beg self)
			)
			(7
				(trapDoorSound number: 562 play:)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance openIt of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 131 165 self)
			)
			(1
				(gEgo view: 23 loop: 2 cel: 4)
				(= cycles 3)
			)
			(2
				(gEgo
					view: 411
					loop: 0
					cel: 0
					cycleSpeed: 24
					setCycle: CT 2 1 self
				)
			)
			(3
				(gEgo view: 411 cycleSpeed: 24 setCycle: End)
				(trapdoor cycleSpeed: 24 setCycle: End self)
			)
			(4
				(trapDoorSound number: 563 play:)
				(proc0_4)
				(proc0_2 2)
				(= local0 1)
				(= global164 0)
				(TheDungeon trapDoorOpen: 1)
				(self dispose:)
			)
		)
	)
)

(instance trapDoorSound of Sound
	(properties
		flags $0001
	)
)
