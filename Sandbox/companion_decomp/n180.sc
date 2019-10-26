;;; Sierra Script 1.0 - (do not remove this comment)
(script# 180)
(include sci.sh)
(use n000)
(use n013)
(use n750)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n981)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm180 0
	oakMan 1
)

(local
	[local0 7] = [1180 40 1 1 1 1]
	[local7 13] = [1180 44 1 2 1 1 2 1 1 1 1 1]
	[local20 5] = [1180 58 1 1]
	[local25 4] = [1180 60 1]
	[local29 4] = [1180 64 1]
	[local33 5] = [1180 65 1 1]
	[local38 5] = [1180 101 1 1]
	[local43 4] = [1180 56 1]
	[local47 7] = [1180 79 2 1 1 1]
	[local54 7] = [1180 83 1 1 1 1]
	[local61 5] = [1180 61 1 1]
	[local66 4] = [1180 30 1]
	[local70 4] = [1180 31 1]
	[local74 4] = [1180 32 1]
	[local78 4] = [1180 33 1]
	[local82 4] = [1180 34 1]
	[local86 4] = [1180 35 1]
	[local90 4] = [1180 36 1]
	[local94 4] = [1180 37 1]
	[local98 4] = [1180 38 1]
	[local102 6] = [1180 68 2 1 1]
	[local108 5] = [1180 71 2 1]
	[local113 4] = [1180 73 1]
	[local117 4] = [1180 67 1]
	[local121 4] = [1180 87 1]
	[local125 4] = [1180 88 1]
	[local129 4] = [1180 92 1]
	[local133 4] = [1180 93 1]
	[local137 4] = [1180 89 1]
	[local141 5] = [1180 90 1 1]
	[local146 10] = [1180 94 2 1 1 1 1 1 1]
	[local156 4] = [1180 105 1]
	[local160 5] = [1180 103 1 1]
	[local165 4] = [1180 108 1]
	[local169 5] = [1180 77 2 1]
	[local174 5] = [1180 109 1 1]
	[local179 4] = [1180 126 1]
	[local183 9] = [186 0 2 4 22 24 19 16 26]
	[local192 9] = [46 0 2 4 17 37 14 22 26]
	[local201 8] = [-1]
	[local209 520]
	local729
	local730
	local731
	local732
	local733
	local734
	local735
	local736
	local737
	local738
	local739
	local740
	local741
	local742
)
(procedure (localproc_0012)
	(switch local730
		(0
			(localproc_03b8 (GetFarText 1180 2 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 1 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 0 @local209) 100 5 163)
		)
		(1
			(localproc_03b8 (GetFarText 1180 4 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 3 @local209) 100 5 172)
		)
		(2
			(localproc_03b8 (GetFarText 1180 8 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 7 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 6 @local209) 100 5 163)
			(localproc_03b8 (GetFarText 1180 5 @local209) 100 5 154)
		)
		(3
			(localproc_03b8 (GetFarText 1180 12 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 11 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 10 @local209) 100 5 163)
			(localproc_03b8 (GetFarText 1180 9 @local209) 100 5 154)
		)
		(4
			(localproc_03b8 (GetFarText 1180 16 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 15 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 14 @local209) 100 5 163)
			(localproc_03b8 (GetFarText 1180 13 @local209) 100 5 154)
		)
		(5
			(localproc_03b8 (GetFarText 1180 18 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 17 @local209) 100 5 172)
		)
		(6
			(localproc_03b8 (GetFarText 1180 22 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 21 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 20 @local209) 100 5 163)
			(localproc_03b8 (GetFarText 1180 19 @local209) 100 5 154)
		)
		(7
			(localproc_03b8 (GetFarText 1180 26 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 25 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 24 @local209) 100 5 163)
			(localproc_03b8 (GetFarText 1180 23 @local209) 100 5 154)
		)
		(8
			(localproc_03b8 (GetFarText 1180 29 @local209) 100 5 181)
			(localproc_03b8 (GetFarText 1180 28 @local209) 100 5 172)
			(localproc_03b8 (GetFarText 1180 27 @local209) 100 5 163)
		)
	)
	(= local735 0)
)

(procedure (localproc_03b8 param1 param2)
	(Display param1 param2 &rest 105 3 102 7 103 33 106 320)
)

(procedure (localproc_03d5 param1 param2)
	(proc13_4
		param1
		param2
		&rest
		67
		-1
		local738
		70
		local739
		30
		0
	)
)

(instance rm180 of Rm
	(properties
		picture 180
		style $0064
		horizon 30
		north 220
		east 220
		south 220
		west 220
	)
	
	(method (init)
		(proc958_0 128 0 3 2 1 245 4 5 183 46 185 186 188)
		(super init:)
		(gEgo actions: egoDoVerb)
		(cond 
			((== (gRgnMusic number?) 400)
				(gRgnMusic number: 400)
				(gEgo setScript: egoEnters 0 gGEgoEdgeHit)
			)
			((and (proc0_5 42) (not (proc0_5 118))) (gRgnMusic number: 901) (gEgo setScript: firstEncounter))
			(else
				(gRgnMusic number: 180)
				(gEgo setScript: egoEnters 0 gGEgoEdgeHit)
			)
		)
		(gRgnMusic play:)
		(proc0_2)
		(oakMan setPri: 7 init: stopUpd:)
		(global2
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						189
						156
						178
						160
						181
						170
						176
						173
						169
						171
						160
						166
						136
						166
						140
						161
						177
						153
						169
						149
						84
						149
						60
						157
						50
						165
						30
						165
						30
						160
						50
						155
						68
						144
						43
						152
						31
						152
						39
						142
						80
						141
						107
						129
						0
						129
						0
						0
						319
						0
						319
						132
						242
						132
						247
						156
						248
						165
						225
						151
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						300
						167
						277
						166
						266
						154
						251
						145
						255
						137
						277
						138
						319
						139
						319
						159
						300
						158
					yourself:
				)
		)
		(proc806_3 oakTree grove1 grove2)
	)
	
	(method (doit &tmp temp0)
		(cond 
			((and (< global137 3) (proc0_5 110)) (proc0_7 110) (oakHandSignCode doit:))
			(local735 (= local735 0) (localproc_0012 local730))
			((gEgo script?))
			((gEgo edgeHit?)
				(= temp0
					(switch (= gGEgoEdgeHit (gEgo edgeHit?))
						(1 north)
						(2 east)
						(3 south)
						(4 west)
					)
				)
				(gEgo setScript: walkOut 0 temp0)
			)
			((== (gEgo onControl: 1) 2)
				(global2 horizon: (gEgo y?))
				(gEgo setMotion: 0 setCycle: 0)
			)
			(else (super doit:))
		)
	)
	
	(method (dispose)
		(proc958_0 0 223 225 220)
		(super dispose:)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(switch register
					(1
						(gEgo
							posn: global104 238
							init:
							setMotion: PolyPath global104 185 self
						)
					)
					(2
						(if (< global105 165) (= global105 165))
						(gEgo
							posn: -10 global105
							init:
							setMotion: PolyPath 26 global105 self
						)
					)
					(3
						(if (< global104 160)
							(gEgo
								posn: 25 152
								loop: 2
								init:
								setMotion: PolyPath 27 157 self
							)
						else
							(gEgo
								posn: 274 157
								loop: 2
								init:
								setMotion: PolyPath 272 161 self
							)
						)
					)
					(4
						(if (< global105 165) (= global105 165))
						(gEgo
							posn: 330 global105
							init:
							setMotion: PolyPath 298 global105 self
						)
					)
					(else 
						(gEgo posn: 160 175 loop: 2 init:)
						(= ticks 24)
					)
				)
			)
			(1
				(if (proc0_5 179)
					(proc0_7 179)
					(proc851_0 1 @local174 @local201 0 self)
				else
					(self cue:)
				)
			)
			(2
				(proc0_4)
				(if (proc0_5 129)
					(if (> global137 3)
						(gIconBar disable: 5)
						(if (== gNewGuise 0)
							(proc0_2 0 3 1)
							(gEgoHead view: 1)
							(gEgo
								normal: 1
								moveHead: 1
								xStep: 8
								yStep: 6
								setMotion: PolyPath 160 170
							)
						)
					)
					(proc750_2)
				)
				(self dispose:)
			)
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY)
		(switch (= state newState)
			(0
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(switch gGEgoEdgeHit
					(3 (= gEgoY 240))
					(2 (= gEgoX (+ gEgoX 20)))
					(4 (= gEgoX (- gEgoX 20)))
				)
				(proc0_3)
				(if (!= gGEgoEdgeHit 1)
					(gEgo
						ignoreActors: 1
						setMotion: PolyPath gEgoX gEgoY self
					)
				else
					(self cue:)
				)
			)
			(1
				(proc0_4)
				(cond 
					(
					(and (== global130 7) (proc0_5 35) (proc0_5 34)) (global2 newRoom: 160))
					(
						(and
							(== global130 9)
							(proc0_5 36)
							(proc0_5 7)
							(proc0_5 113)
						)
						(gIconBar enable: 5)
						(global2 newRoom: 160)
					)
					(
					(and (== global130 12) (proc0_5 38) (proc0_5 27)) (gIconBar enable: 5) (global2 newRoom: 160))
					(else (global2 newRoom: register))
				)
			)
		)
	)
)

(instance overRidge of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setLoop: 3 setCycle: 0 setMotion: 0)
			)
			(1
				(global2 horizon: (gEgo y?))
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance firstEncounter of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(= local741 1)
				(proc0_6 118)
				(sprite
					posn: 300 220
					setLoop: 1
					init:
					setCycle: Walk
					setMotion: MoveTo 75 164 self
				)
			)
			(1
				(sprite view: 188 setLoop: 2 setCel: 0)
				(gEgo
					posn: 300 230
					init:
					setMotion: PolyPath 194 173 self
				)
			)
			(2
				(gEgo
					setMotion: PolyPath (- (gEgo x?) 1) (- (gEgo y?) 1)
				)
				(sprite cycleSpeed: 12 setCycle: End self)
			)
			(3
				(proc851_0 1 @local0 @local183 0 self)
			)
			(4
				(sprite
					view: 185
					setLoop: 1
					cel: 0
					cycleSpeed: 6
					setCycle: Walk
					setMotion: PolyPath -20 176 self
				)
			)
			(5
				(sprite dispose:)
				(gRgnMusic number: 181 loop: -1 play:)
				(oakMan setCycle: End self)
			)
			(6
				(= local742 1)
				(oakMan stopUpd:)
				(proc851_0 2 @local7 @local192 0 1 1 self)
			)
			(7
				(gEgo setScript: canWeTalkHere)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance canWeTalkHere of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0 (= seconds 5))
			(1 (oakMan setCycle: Beg self))
			(2
				(gRgnMusic number: 180 loop: -1 play:)
				(self dispose:)
			)
		)
	)
)

(instance callVainly of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(switch gNewGuise
					(0 (= temp0 1))
					(1 (= temp0 7))
					(4 (= temp0 6))
					(6 (= temp0 8))
					(5 (= temp0 9))
					(2 (= temp0 4))
					(else  (= temp0 5))
				)
				(proc851_0 1 @local43 temp0 1 self)
			)
			(1 (proc13_4 1180 57 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance blowIt of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1180 63 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance theRiddles of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= local730 (Random 0 8))
				(if
					(or
						(!= (gRgnMusic number?) 181)
						(not (gRgnMusic handle?))
					)
					(gRgnMusic number: 181 loop: -1 play:)
				)
				(if (!= (oakMan cel?) 10)
					(oakMan cycleSpeed: 12 setCycle: End self)
				else
					(self cue:)
				)
			)
			(1
				(proc851_0 2 @local169 @local192 0 1 1 self)
			)
			(2
				(gEgo
					setMotion: PolyPath (+ (gEgo x?) 1) (+ (gEgo y?) 1) self
				)
			)
			(3
				(oakMan loop: 1 cel: 0 setCycle: End self)
			)
			(4
				(oakMan setCycle: Beg)
				(razzleDazzle init: play:)
				(sparkle
					x: (gEgo x?)
					y: (gEgo y?)
					init:
					setCycle: End self
				)
			)
			(5
				(oakMan setLoop: 0 setCel: 10 stopUpd:)
				(sparkle dispose:)
				(gEgo
					view: 245
					setLoop: 0
					setCel: 0
					cycleSpeed: 8
					normal: 1
					moveHead: 1
					setCycle: CT 2 1 self
				)
			)
			(6
				(razzleDazzle dispose:)
				(proc851_0 2 @local47 @local192 0 1 1 self)
			)
			(7
				(proc851_0 1 @local54 @local192 0 self)
			)
			(8 (= ticks 36))
			(9
				(if (== local730 8) (= local730 0) else (++ local730))
				(switch local730
					(0
						(= local739 260)
						(= local738 110)
						(= local736 1180)
						(= local737 30)
						(= local731 @local66)
					)
					(1
						(= local739 260)
						(= local738 120)
						(= local736 1180)
						(= local737 31)
						(= local731 @local70)
					)
					(2
						(= local739 260)
						(= local738 110)
						(= local736 1180)
						(= local737 32)
						(= local731 @local74)
					)
					(3
						(= local739 260)
						(= local738 100)
						(= local736 1180)
						(= local737 33)
						(= local731 @local78)
					)
					(4
						(= local739 260)
						(= local738 90)
						(= local736 1180)
						(= local737 34)
						(= local731 @local82)
					)
					(5
						(= local739 260)
						(= local738 100)
						(= local736 1180)
						(= local737 35)
						(= local731 @local86)
					)
					(6
						(= local739 260)
						(= local738 100)
						(= local736 1180)
						(= local737 36)
						(= local731 @local90)
					)
					(7
						(= local739 260)
						(= local738 100)
						(= local736 1180)
						(= local737 37)
						(= local731 @local94)
					)
					(8
						(= local739 260)
						(= local738 110)
						(= local736 1180)
						(= local737 38)
						(= local731 @local98)
					)
				)
				(fakeFrame init:)
				(fakeBust init:)
				(fakeMouth init:)
				(proc13_6 26)
				(localproc_03d5 local736 local737 self)
			)
			(10
				(proc13_6 0)
				(fakeFrame dispose:)
				(fakeBust dispose:)
				(fakeMouth setCycle: 0 dispose:)
				(= ticks 8)
			)
			(11 (= ticks 6))
			(12
				(proc0_4)
				(= local735 1)
				(oakTree dispose:)
				(grove1 dispose:)
				(grove2 dispose:)
				((ScriptID 213) doit:)
			)
			(13
				(proc0_3)
				(proc806_3 oakTree grove1 grove2)
				(switch local730
					(0
						(if (or (== global124 22) (== global124 23))
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(1
						(if
							(or
								(== global124 24)
								(== global124 25)
								(== global124 26)
							)
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(2
						(if (or (== global124 27) (== global124 28))
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(3
						(if
							(or
								(== global124 29)
								(== global124 30)
								(== global124 31)
								(== global124 32)
							)
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(4
						(if
							(or
								(== global124 33)
								(== global124 34)
								(== global124 35)
								(== global124 36)
								(== global124 37)
								(== global124 38)
								(== global124 39)
							)
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(5
						(if (or (== global124 40) (== global124 41))
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(6
						(if (or (== global124 42) (== global124 43))
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(7
						(if
							(or
								(== global124 44)
								(== global124 45)
								(== global124 46)
								(== global124 47)
								(== global124 48)
							)
							(= local732 1)
						else
							(= local732 0)
						)
					)
					(8
						(if
							(or
								(== global124 49)
								(== global124 50)
								(== global124 51)
								(== global124 52)
							)
							(= local732 1)
						else
							(= local732 0)
						)
					)
				)
				(if (== local732 0)
					(self changeState: 14)
				else
					(self changeState: 16)
				)
			)
			(14
				(switch local733
					(0
						(proc851_0 1 @local121 @local192 0 self)
					)
					(1
						(proc851_0 1 @local125 @local192 0 self)
					)
					(2
						(proc0_4)
						(gEgo setScript: yourHistory)
					)
				)
				(++ local733)
			)
			(15 (self changeState: 9))
			(16
				(switch local734
					(0
						(proc851_0 1 @local129 @local192 0 self)
					)
					(1
						(proc851_0 1 @local133 @local192 0 self)
					)
					(2
						(proc0_4)
						(gEgo setScript: yourAWinner)
					)
				)
				(++ local734)
			)
			(17 (self changeState: 9))
		)
	)
)

(instance oakWindow of Window
	(properties)
	
	(method (init)
		(= color gColor)
		(= back gBack)
	)
)

(instance fakeFrame of View
	(properties
		x 43
		y 81
		view 805
		priority 14
		signal $4010
	)
)

(instance fakeBust of View
	(properties
		view 46
		loop 1
		priority 13
		signal $4010
	)
	
	(method (init)
		(self posn: (+ (fakeFrame x?) 2) (- (fakeFrame y?) 1))
		(super init:)
	)
)

(instance fakeMouth of Prop
	(properties
		view 46
		priority 14
		signal $4010
	)
	
	(method (init)
		(self
			posn: (fakeFrame x?) (- (fakeFrame y?) 13)
			setCycle: End self
		)
		(super init:)
	)
	
	(method (cue)
		(self cycleSpeed: (Random 3 18) setCycle: End self)
		(super cue:)
	)
)

(instance yourHistory of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 1 @local137 @local192 0 self)
			)
			(1
				(if
					(and
						(!= (oakMan cel?) 10)
						(or
							(!= (gRgnMusic number?) 181)
							(not (gRgnMusic handle?))
						)
					)
					(gRgnMusic number: 181 loop: -1 play:)
				)
				(oakMan setLoop: 1 setCel: 0 setCycle: End self)
			)
			(2
				(oakMan stopUpd:)
				(razzleDazzle init: play:)
				(gEgo setCycle: End)
				(sparkle
					x: (gEgo x?)
					y: (gEgo y?)
					init:
					setCycle: End self
				)
			)
			(3
				(sparkle dispose:)
				(oakMan setCycle: Beg self)
			)
			(4
				(razzleDazzle dispose:)
				(gRgnMusic number: 180 loop: -1 play:)
				(oakMan stopUpd:)
				(proc851_0 1 @local141 @local192 0 self)
			)
			(5 (proc806_0))
		)
	)
)

(instance yourAWinner of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(oakMan setLoop: 1 setCel: 0 setCycle: End self)
			)
			(1
				(oakMan stopUpd:)
				(razzleDazzle init: play:)
				(sparkle
					x: (gEgo x?)
					y: (gEgo y?)
					init:
					setCycle: End self
				)
			)
			(2
				(sparkle dispose:)
				(gEgo setLoop: 0 setCel: 2 setCycle: Beg self)
			)
			(3
				(razzleDazzle dispose:)
				(proc0_2 4)
				(oakMan setCycle: Beg self)
			)
			(4
				(oakMan stopUpd:)
				(proc806_1 200)
				(= ticks 6)
			)
			(5
				(gEgo
					setMotion: MoveTo (- (gEgo x?) 2) (- (gEgo y?) 2) self
				)
			)
			(6
				(proc851_0 2 @local146 @local192 0 1 1 self)
			)
			(7
				(gRgnMusic number: 180 loop: -1 play:)
				(oakMan setLoop: 0 setCel: 5 setCycle: Beg self)
			)
			(8
				(oakMan stopUpd:)
				(proc0_2)
				(gEgo cycleSpeed: 1)
				(proc0_4)
				(proc806_6 0)
				(= global19 0)
				(proc0_6 35)
				(self dispose:)
			)
		)
	)
)

(instance targetPractice of Script
	(properties)
	
	(method (dispose)
		(super dispose: &rest)
	)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0
				(proc0_3)
				(cond 
					(
						(or
							(<=
								(= temp0
									(GetAngle (gEgo x?) (gEgo y?) (oakMan x?) (oakMan y?))
								)
								20
							)
							(> temp0 340)
						)
						(gEgo setLoop: 3)
					)
					((<= temp0 60) (gEgo setLoop: 6))
					((<= temp0 100) (gEgo setLoop: 0))
					((<= temp0 160) (gEgo setLoop: 4))
					((<= temp0 200) (gEgo setLoop: 2))
					((<= temp0 240) (gEgo setLoop: 5))
					((<= temp0 290) (gEgo setLoop: 1))
					((<= temp0 340) (gEgo setLoop: 7))
				)
				(gEgo view: 4 setCel: 0 setCycle: End self)
			)
			(1
				(gEgo view: 5 setCel: 0 setCycle: End self)
			)
			(2
				(gSFX number: 906 loop: 1 play:)
				(proc0_2)
				(= ticks 12)
			)
			(3
				(gSFX number: 908 play: self)
			)
			(4
				(gRgnMusic number: 181 loop: -1 play:)
				(if (!= (oakMan cel?) 10)
					(oakMan setCycle: End self)
				else
					(self cue:)
				)
			)
			(5
				(proc851_0 1 @local156 @local192 0 self)
			)
			(6
				(oakMan setLoop: 1 setCel: 0 setCycle: End self)
				(gEgo
					setMotion: PolyPath (+ (gEgo x?) 1) (+ (gEgo y?) 1)
				)
			)
			(7
				(oakMan stopUpd:)
				(sparkle
					x: (gEgo x?)
					y: (gEgo y?)
					init:
					setCycle: End self
				)
			)
			(8
				(sparkle dispose:)
				(gEgo
					view: 245
					setLoop: 0
					cycleSpeed: 8
					cel: 0
					setCycle: End self
				)
			)
			(9 (oakMan setCycle: Beg self))
			(10
				(gRgnMusic number: 180 loop: 1 play:)
				(oakMan stopUpd:)
				(proc851_0 1 @local160 @local192 0 self)
			)
			(11 (proc806_0))
		)
	)
)

(instance callOutOakMan of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 2])
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo oakMan)
				(if
					(or
						(!= (gRgnMusic number?) 181)
						(not (gRgnMusic handle?))
					)
					(gRgnMusic number: 181 loop: -1 play:)
				)
				(if (!= (oakMan cel?) 10)
					(oakMan cycleSpeed: 18 setCycle: End self)
				else
					(self cue:)
				)
			)
			(1
				(proc851_0 1 @local38 @local192 0 self)
			)
			(2 (proc0_4) (= seconds 5))
			(3 (oakMan setCycle: Beg self))
			(4
				(gRgnMusic number: 180 loop: -1 play:)
				(self dispose:)
			)
		)
	)
)

(instance sprite of Actor
	(properties
		yStep 5
		view 185
		signal $4000
		xStep 9
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1180 39 1))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance oakMan of Prop
	(properties
		x 152
		y 131
		view 183
		priority 7
		signal $0010
		cycleSpeed 10
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (and (> cel 0) (proc0_5 118))
					(proc13_4 1180 54 1)
				else
					(proc13_4 1180 75 1)
				)
			)
			(3
				(if
					(or
						(== cel 0)
						(and (not (proc0_5 118)) (not (proc0_5 34)))
					)
					(proc13_4 1180 76 1)
				else
					(proc13_4 1180 55 1)
				)
			)
			(5
				(cond 
					((and (proc0_5 129) (> global137 2)) (proc851_0 1 @local179 1 0 self))
					((and (not (proc0_5 118)) (not (proc0_5 34))) (proc13_4 1180 107 1))
					((!= gNewGuise 0) (proc13_4 1180 106 1))
					(
					(and (proc0_5 118) (not (proc0_5 34)) (== local729 0)) (++ local729) (proc851_0 2 @local102 @local192 0 1 1))
					(
					(and (proc0_5 118) (not (proc0_5 34)) (== local729 1)) (++ local729) (proc851_0 2 @local108 @local192 0 1 1))
					(
					(and (proc0_5 118) (not (proc0_5 34)) (== local729 2))
						(++ local729)
						(proc851_0 2 @local113 @local192 0 1 1)
						(if (== (gEgo script?) firstEncounter) (proc0_3))
					)
					(
						(and
							(proc0_5 118)
							(proc0_5 34)
							(< global130 8)
							(not local740)
							(== local742 0)
						)
						(= local740 1)
						(gEgo setScript: callOutOakMan)
					)
					(
					(and (not (proc0_5 35)) (proc0_5 118) (proc0_5 34)) (gEgo setScript: theRiddles))
					(else (gEgo setScript: callVainly))
				)
			)
			(10
				(cond 
					((proc0_5 35) (proc13_4 1180 127 1))
					((== gNewGuise 0) (global2 setScript: targetPractice))
					(else (proc13_4 1180 127 1))
				)
			)
			(4
				(cond 
					((and (> cel 0) (proc0_5 118))
						(switch param2
							(2
								(proc851_0 1 @local20 @local192 0)
							)
							(10
								(proc851_0 1 @local25 @local192 0)
							)
							(18
								(proc851_0 1 @local61 @local192 0)
							)
							(17
								(if (proc0_5 34)
									(proc851_0 1 @local33 @local192 0)
								else
									(proc851_0 1 @local29 @local192 0)
								)
							)
							(else 
								(proc851_0 1 @local117 @local192 0)
							)
						)
					)
					((== param2 2) (proc13_4 1180 111 1))
					(else (super doVerb: theVerb &rest))
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance razzleDazzle of Sound
	(properties
		number 216
	)
)

(instance sparkle of Prop
	(properties
		view 245
		loop 1
		signal $4000
	)
)

(instance oakTree of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				211
				144
				185
				148
				176
				143
				189
				138
				183
				127
				130
				127
				67
				149
				68
				135
				79
				139
				125
				110
				134
				65
				31
				39
				16
				0
				319
				0
				319
				73
				221
				78
				194
				99
				196
				114
				208
				113
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1180 75 0))
			(3 (proc13_4 1180 76 0))
			(10
				(cond 
					((proc0_5 35) (proc13_4 1180 127 1))
					((== gNewGuise 0) (global2 setScript: targetPractice))
					(else (proc13_4 1180 127 1))
				)
			)
			(5
				(cond 
					((and (not (proc0_5 118)) (not (proc0_5 34))) (proc13_4 1180 107 1))
					((!= gNewGuise 0) (proc13_4 1180 106 1))
					((== (oakMan cel?) 0) (gEgo setScript: callVainly))
					(else (proc851_0 1 @local165 @local192 0))
				)
			)
			(4
				(if (== param2 2)
					(proc13_4 1180 111 1)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance grove1 of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 124 107 0 122 0 7 17 6 30 40 132 66
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1180 74 0))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance grove2 of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 319 119 267 120 212 106 197 99 222 79 319 75
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1180 74 0))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance oakHandSignCode of Code
	(properties)
	
	(method (doit)
		(cond 
			((!= gNewGuise 0) (proc13_4 1180 106 1))
			((== (gEgo script?) theRiddles) (theRiddles cue:))
			((proc0_5 35)
				(cond 
					((== global124 7) (gEgo setScript: (ScriptID 223 0)))
					((== global124 18) (gEgo setScript: (ScriptID 223 1)))
				)
			)
			((proc0_5 34)
				(cond 
					((== global124 7) (gEgo setScript: (ScriptID 223 0)))
					((== global124 18) (gEgo setScript: (ScriptID 223 2)))
				)
			)
		)
	)
)

(instance egoDoVerb of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 4)
			(switch param2
				(1
					(gEgo setScript: (ScriptID 5 0))
					1
				)
				(5
					(if (== gNewGuise 6) (gEgo setScript: blowIt) 1)
				)
			)
		)
	)
)
