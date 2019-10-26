;;; Sierra Script 1.0 - (do not remove this comment)
(script# 140)
(include sci.sh)
(use n000)
(use n013)
(use n255)
(use n806)
(use n813)
(use n945)
(use n946)
(use n950)
(use n958)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm140 0
	fire 1
	ledge 2
	peg 3
)

(local
	local0
	local1
	local2
	theGNewGuise
	newPolygon
	newPolygon_2
	newPolygon_3
	newPolygon_4
	newPolygon_5
	newPolygon_6
	local10
	theGarbX
	theGarbY
	gRobinGarbX
	gRobinGarbY
	[local15 5] = [1140 0 1 1]
)
(procedure (localproc_001a)
	(if (and (== global130 1) (not (gEgo has: 1)))
		(horn init: stopUpd:)
	)
	(if (or (== gNewGuise 0) (== gNewGuise 4))
		(bow dispose:)
	else
		(bow init: stopUpd:)
	)
)

(procedure (localproc_0063)
	(cond 
		(
			(and
				(== gNewGuise 0)
				(or (== ((global9 at: 1) owner?) 140) (gEgo has: 1))
			)
			(gEgo get: 1)
		)
		((gEgo has: 1) (gEgo put: 1 140))
	)
	(cond 
		(
			(and
				(proc999_5 gNewGuise 0 5 6 2 3)
				(or (== ((global9 at: 2) owner?) 140) (gEgo has: 2))
			)
			(gEgo get: 2)
		)
		((gEgo has: 2) (gEgo put: 2 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 3) owner?) 140) (gEgo has: 3))
				(or (== gNewGuise 0) (== gNewGuise 1))
			)
			(gEgo get: 3)
		)
		((gEgo has: 3) (gEgo put: 3 140))
	)
	(cond 
		(
			(and
				(== gNewGuise 0)
				(or (== ((global9 at: 4) owner?) 140) (gEgo has: 4))
			)
			(gEgo get: 4)
		)
		((gEgo has: 4) (gEgo put: 4 140))
	)
	(cond 
		(
			(and
				(== gNewGuise 6)
				(or (== ((global9 at: 5) owner?) 140) (gEgo has: 5))
			)
			(gEgo get: 5)
		)
		((gEgo has: 5) (gEgo put: 5 140))
	)
	(cond 
		(
			(and
				(== gNewGuise 6)
				(or (== ((global9 at: 6) owner?) 140) (gEgo has: 6))
			)
			(gEgo get: 6)
		)
		((gEgo has: 6) (gEgo put: 6 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 7) owner?) 140) (gEgo has: 7))
				(or (== gNewGuise 2) (== gNewGuise 3))
			)
			(gEgo get: 7)
		)
		((gEgo has: 7) (gEgo put: 7 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 8) owner?) 140) (gEgo has: 8))
				(or (== gNewGuise 2) (== gNewGuise 3))
			)
			(gEgo get: 8)
		)
		((gEgo has: 8) (gEgo put: 8 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 9) owner?) 140) (gEgo has: 9))
				(== gNewGuise 0)
			)
			(gEgo get: 9)
		)
		((gEgo has: 9) (gEgo put: 9 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 10) owner?) 140) (gEgo has: 10))
				(proc999_5 gNewGuise 0 5 6 2 3)
			)
			(gEgo get: 10)
		)
		((gEgo has: 10) (gEgo put: 10 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 11) owner?) 140) (gEgo has: 11))
				(== gNewGuise 5)
			)
			(gEgo get: 11)
		)
		((gEgo has: 11) (gEgo put: 11 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 12) owner?) 140) (gEgo has: 12))
				(or (== gNewGuise 0) (== gNewGuise 5))
			)
			(gEgo get: 12)
		)
		((gEgo has: 12) (gEgo put: 12 140))
	)
	(if (proc0_5 101) (gEgo put: 12))
	(cond 
		(
			(and
				(or (== ((global9 at: 13) owner?) 140) (gEgo has: 13))
				(== gNewGuise 5)
			)
			(gEgo get: 13)
		)
		((gEgo has: 13) (gEgo put: 13 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 14) owner?) 140) (gEgo has: 14))
				(proc999_5 gNewGuise 0 5 6 2 3)
			)
			(gEgo get: 14)
		)
		((gEgo has: 14) (gEgo put: 14 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 15) owner?) 140) (gEgo has: 15))
				(or (== gNewGuise 0) (== gNewGuise 1))
			)
			(gEgo get: 15)
		)
		((gEgo has: 15) (gEgo put: 15 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 16) owner?) 140) (gEgo has: 16))
				(or (== gNewGuise 0) (== gNewGuise 6))
			)
			(gEgo get: 16)
		)
		((gEgo has: 16) (gEgo put: 16 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 17) owner?) 140) (gEgo has: 17))
				(or (== gNewGuise 0) (== gNewGuise 6) (== gNewGuise 4))
			)
			(gEgo get: 17)
		)
		((gEgo has: 17) (gEgo put: 17 140))
	)
	(cond 
		(
			(and
				(or (== ((global9 at: 18) owner?) 140) (gEgo has: 18))
				(or
					(== gNewGuise 0)
					(== gNewGuise 5)
					(== gNewGuise 6)
					(== gNewGuise 2)
					(== gNewGuise 3)
				)
			)
			(gEgo get: 18)
		)
		((gEgo has: 18) (gEgo put: 18 140))
	)
)

(procedure (localproc_06ca)
	(global2
		addObstacle:
			((Polygon new:)
				type: 2
				init:
					224
					0
					224
					71
					221
					75
					212
					75
					221
					84
					204
					87
					202
					92
					208
					98
					182
					106
					166
					107
					156
					102
					135
					102
					127
					99
					77
					104
					94
					115
					94
					125
					70
					125
					56
					122
					45
					118
					21
					118
					34
					123
					34
					146
					30
					160
					42
					175
					59
					184
					121
					187
					247
					187
					277
					170
					292
					141
					274
					124
					269
					119
					251
					111
					253
					107
					263
					96
					256
					89
					258
					83
					261
					80
					247
					68
					247
					0
					319
					0
					319
					189
					0
					189
					0
					0
				yourself:
			)
			((Polygon new:)
				type: 2
				init:
					205
					139
					205
					146
					192
					146
					182
					150
					156
					148
					147
					142
					134
					142
					134
					136
					156
					130
					169
					129
					184
					131
				yourself:
			)
	)
	(if (!= gNewGuise 0)
		(global2
			addObstacle:
				((= newPolygon (Polygon new:))
					type: 2
					init:
						(+ (gRobin x?) 9)
						(+ (gRobin y?) 5)
						(- (gRobin x?) 11)
						(+ (gRobin y?) 5)
						(- (gRobin x?) 19)
						(- (gRobin y?) 1)
						(- (gRobin x?) 11)
						(- (gRobin y?) 10)
						(+ (gRobin x?) 9)
						(- (gRobin y?) 10)
						(+ (gRobin x?) 17)
						(- (gRobin y?) 1)
					yourself:
				)
		)
	)
	(if
		(and
			(!= gNewGuise 4)
			(< 7 global130)
			(< global130 10)
			(proc0_5 57)
		)
		(global2
			addObstacle:
				((= newPolygon_2 (Polygon new:))
					type: 2
					init:
						(+ (gPuck x?) 9)
						(+ (gPuck y?) 5)
						(- (gPuck x?) 11)
						(+ (gPuck y?) 5)
						(- (gPuck x?) 19)
						(- (gPuck y?) 1)
						(- (gPuck x?) 11)
						(- (gPuck y?) 10)
						(+ (gPuck x?) 9)
						(- (gPuck y?) 10)
						(+ (gPuck x?) 17)
						(- (gPuck y?) 1)
					yourself:
				)
		)
	)
	(if
		(and
			(!= gNewGuise 2)
			(proc0_5 113)
			(!= gNewGuise 3)
			(== global130 9)
		)
		(global2
			addObstacle:
				((= newPolygon_3 (Polygon new:))
					type: 2
					init:
						(+ (gJeweler x?) 9)
						(+ (gJeweler y?) 5)
						(- (gJeweler x?) 11)
						(+ (gJeweler y?) 5)
						(- (gJeweler x?) 19)
						(- (gJeweler y?) 1)
						(- (gJeweler x?) 11)
						(- (gJeweler y?) 10)
						(+ (gJeweler x?) 9)
						(- (gJeweler y?) 10)
						(+ (gJeweler x?) 17)
						(- (gJeweler y?) 1)
					yourself:
				)
		)
	)
	(if
	(and (!= gNewGuise 1) (proc0_5 54) (== global130 3))
		(global2
			addObstacle:
				((= newPolygon_4 (Polygon new:))
					type: 2
					init:
						(+ (gBeggar x?) 9)
						(+ (gBeggar y?) 5)
						(- (gBeggar x?) 11)
						(+ (gBeggar y?) 5)
						(- (gBeggar x?) 19)
						(- (gBeggar y?) 1)
						(- (gBeggar x?) 11)
						(- (gBeggar y?) 10)
						(+ (gBeggar x?) 9)
						(- (gBeggar y?) 10)
						(+ (gBeggar x?) 17)
						(- (gBeggar y?) 1)
					yourself:
				)
		)
	)
	(if
		(and
			(!= gNewGuise 5)
			(proc0_5 55)
			(< 4 global130)
			(< global130 10)
		)
		(global2
			addObstacle:
				((= newPolygon_5 (Polygon new:))
					type: 2
					init:
						(+ (gAbbey x?) 9)
						(+ (gAbbey y?) 5)
						(- (gAbbey x?) 11)
						(+ (gAbbey y?) 5)
						(- (gAbbey x?) 19)
						(- (gAbbey y?) 1)
						(- (gAbbey x?) 11)
						(- (gAbbey y?) 10)
						(+ (gAbbey x?) 9)
						(- (gAbbey y?) 10)
						(+ (gAbbey x?) 17)
						(- (gAbbey y?) 1)
					yourself:
				)
		)
	)
	(if
		(and
			(!= gNewGuise 6)
			(proc0_5 147)
			(< 4 global130)
			(< global130 10)
		)
		(global2
			addObstacle:
				((= newPolygon_6 (Polygon new:))
					type: 2
					init:
						(+ (gFens x?) 9)
						(+ (gFens y?) 5)
						(- (gFens x?) 11)
						(+ (gFens y?) 5)
						(- (gFens x?) 19)
						(- (gFens y?) 15)
						(- (gFens x?) 11)
						(- (gFens y?) 15)
						(+ (gFens x?) 9)
						(- (gFens y?) 10)
						(+ (gFens x?) 17)
						(- (gFens y?) 10)
					yourself:
				)
		)
	)
)

(instance rm140 of Rm
	(properties
		picture 140
		style $0008
		north 150
	)
	
	(method (init)
		(proc0_3)
		(gRgnMusic number: 141 loop: -1 vol: 70 play:)
		(DoSound 19 20)
		(proc958_0 128 140 213 142 7)
		(Load rsSCRIPT 969)
		(Load rsPIC 803)
		(super init:)
		(gEgo actions: egoHorn)
		(proc0_2)
		(fireSound play:)
		(fire init:)
		(ledge init: stopUpd:)
		(peg init: stopUpd:)
		(localproc_0063)
		(proc806_3 skin1 skin2 skin3 bed vines floor drape entry)
		(localproc_06ca)
		(if (!= gNewGuise 0) (gRobin init: stopUpd:))
		(if
			(and
				(!= gNewGuise 4)
				(< 7 global130)
				(< global130 10)
				(proc0_5 57)
			)
			(gPuck init: stopUpd:)
		)
		(if
			(and
				(!= gNewGuise 2)
				(proc0_5 113)
				(!= gNewGuise 3)
				(== global130 9)
			)
			(gJeweler init: stopUpd:)
		)
		(if
		(and (!= gNewGuise 1) (proc0_5 54) (== global130 3))
			(gBeggar init: stopUpd:)
		)
		(if
			(and
				(!= gNewGuise 5)
				(proc0_5 55)
				(< 4 global130)
				(< global130 10)
			)
			(gAbbey init: stopUpd:)
		)
		(if
			(and
				(!= gNewGuise 6)
				(proc0_5 147)
				(< 4 global130)
				(< global130 10)
			)
			(gFens init: stopUpd:)
		)
		(localproc_001a)
		(localproc_0063)
		(cond 
			((== global12 150)
				(proc0_2)
				(gEgo posn: 235 82 loop: 5 init: setScript: enterTheCave)
			)
			((and (== global12 160) (== global130 2))
				(proc958_0 129 803 210 215)
				(gEgo put: 4 140)
				(gEgo
					view: 142
					loop: 0
					cel: 0
					x: 74
					y: 91
					init:
					setPri: 7
					setScript: (ScriptID 141 0)
				)
				(fireSound stop:)
			)
			(else (gEgo loop: 6 posn: 200 108 init:) (proc0_2) (proc0_4))
		)
	)
	
	(method (doit)
		(cond 
			((gEgo script?) 0)
			((< (gEgo y?) 78) (global2 newRoom: 150))
		)
		(super doit: &rest)
	)
	
	(method (dispose)
		(DoSound 19 0)
		(if (global2 obstacles?)
			((global2 obstacles?) dispose:)
		)
		(global2 obstacles: 0)
		(global2 setScript: 0)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 31 1))
			(3 (proc13_4 1140 32 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance floor of Feature
	(properties
		x 219
		y 90
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				219
				70
				252
				70
				265
				76
				262
				89
				269
				95
				259
				110
				261
				112
				276
				115
				277
				119
				278
				123
				283
				125
				277
				135
				277
				141
				273
				143
				273
				146
				249
				164
				223
				166
				221
				167
				218
				168
				214
				171
				208
				171
				202
				176
				196
				178
				133
				178
				122
				169
				111
				167
				100
				163
				83
				159
				77
				151
				49
				144
				32
				133
				28
				128
				27
				124
				48
				112
				64
				118
				78
				118
				89
				113
				77
				104
				124
				97
				124
				92
				133
				94
				137
				98
				157
				97
				170
				103
				180
				103
				193
				102
				202
				98
				200
				94
				197
				90
				200
				89
				198
				84
				214
				83
				208
				75
				215
				73
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 29 1))
			(3 (proc13_4 1140 30 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance vines of Feature
	(properties
		x 224
		y 20
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 233 18 229 22 224 17 219 22 216 19 220 12 230 6 233 15
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 27 1))
			(3 (proc13_4 1140 28 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance skin1 of Feature
	(properties
		x 278
		y 119
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				278
				133
				249
				139
				226
				138
				212
				139
				194
				131
				198
				127
				215
				120
				247
				122
				251
				119
				267
				120
				277
				129
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(skinDoVerb doit: theVerb param2)
	)
)

(instance skin2 of Feature
	(properties
		x 260
		y 151
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				260
				157
				250
				165
				222
				166
				215
				170
				195
				168
				185
				169
				185
				165
				175
				165
				175
				160
				194
				158
				199
				155
				212
				155
				220
				151
				244
				151
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(skinDoVerb doit: theVerb param2)
	)
)

(instance skin3 of Feature
	(properties
		x 169
		y 149
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				169
				165
				163
				168
				118
				167
				104
				165
				83
				159
				80
				156
				88
				152
				107
				149
				122
				149
				138
				155
				147
				155
				162
				162
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(skinDoVerb doit: theVerb param2)
	)
)

(instance bed of Feature
	(properties
		x 121
		y 85
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 121 96 80 100 76 97 71 89 71 71 101 73 124 77
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1140 25 1))
			(3 (proc13_4 1140 26 1))
			(4 (proc13_4 1140 33 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance entry of Feature
	(properties
		x 259
		y 31
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				259
				63
				255
				66
				212
				66
				206
				58
				208
				38
				216
				19
				219
				22
				225
				17
				228
				22
				234
				17
				235
				20
				245
				32
				252
				41
				250
				49
				249
				63
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1140 24 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance drape of Feature
	(properties
		x 253
		y 36
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				253
				41
				235
				19
				231
				6
				239
				4
				244
				6
				252
				7
				263
				18
				266
				33
				263
				59
				259
				62
				250
				62
				251
				50
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1140 22 1))
			(3 (proc13_4 1140 23 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance cover of View
	(properties
		x 237
		y 67
		view 140
		loop 4
		priority 4
		signal $0010
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1140 22 1))
			(3 (proc13_4 1140 23 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bow of View
	(properties
		x 158
		y 97
		view 140
		loop 6
		priority 3
		signal $4010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 20 1))
			(3 (proc13_4 1140 21 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance horn of View
	(properties
		x 156
		y 73
		view 140
		loop 6
		cel 1
		priority 6
		signal $4010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 16 1))
			(3 (gEgo setScript: getHorn))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance peg of View
	(properties
		x 158
		y 60
		view 140
		loop 1
		priority 7
		signal $4010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 66 1))
			(3 (proc13_4 1140 67 1))
			(5 (proc13_4 1140 68 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance ledge of View
	(properties
		x 38
		y 103
		view 140
		loop 3
		priority 8
		signal $0011
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (proc0_5 196)
					(proc13_4 1140 19 1)
				else
					(gEgo setScript: lookAtChest)
					(proc0_6 196)
				)
			)
			(3
				(if
				(or (< (gMoney value?) 50) (not (gEgo has: 0)))
					(gEgo setScript: stashIt)
				else
					(proc13_4 1140 15 1)
				)
			)
			(4
				(switch param2
					(0
						(gEgo setScript: putMoneyBack)
					)
					(1 (proc13_4 1140 49 1))
					(2 (proc13_4 1140 50 1))
					(3 (proc13_4 1140 51 1))
					(15 (proc13_4 1140 52 1))
					(11 (proc13_4 1140 51 1))
					(14 (proc13_4 1140 53 1))
					(12 (proc13_4 1140 51 1))
					(10 (proc13_4 1140 54 1))
					(13 (proc13_4 1140 55 1))
					(5 (proc13_4 1140 51 1))
					(6 (proc13_4 1140 56 1))
					(17 (proc13_4 1140 51 1))
					(16 (proc13_4 1140 51 1))
					(18 (proc13_4 1140 57 1))
					(4 (proc13_4 1140 58 1))
					(7 (proc13_4 1140 59 1))
					(8 (proc13_4 1140 51 1))
					(9 (proc13_4 1140 51 1))
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(class Garb of View
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 140
		loop 5
		cel 0
		priority 0
		underBits 0
		signal $4000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		newGuise 0
		garbX 0
		garbY 0
	)
	
	(method (doVerb theVerb param2 &tmp [temp0 40])
		(switch theVerb
			(2
				(proc255_0
					(Format @temp0 140 0 (self lookStr?))
					67
					-1
					10
				)
			)
			(3
				(= theGNewGuise gNewGuise)
				(= gNewGuise newGuise)
				(localproc_0063)
				(= theGarbX garbX)
				(= theGarbY garbY)
				(global2 setScript: wardrobeChange)
			)
			(4
				(switch param2
					(0 (proc13_4 1140 61 1))
					(1 (proc13_4 1140 60 1))
					(2 (proc13_4 1140 62 1))
					(3 (proc13_4 1140 60 1))
					(15 (proc13_4 1140 60 1))
					(11 (proc13_4 1140 60 1))
					(14 (proc13_4 1140 60 1))
					(12 (proc13_4 1140 60 1))
					(10 (proc13_4 1140 60 1))
					(13 (proc13_4 1140 63 1))
					(5 (proc13_4 1140 60 1))
					(6 (proc13_4 1140 60 1))
					(17 (proc13_4 1140 60 1))
					(16 (proc13_4 1140 60 1))
					(18 (proc13_4 1140 60 1))
					(4 (proc13_4 1140 60 1))
					(7 (proc13_4 1140 64 1))
					(8 (proc13_4 1140 60 1))
					(9 (proc13_4 1140 60 1))
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance gRobin of Garb
	(properties
		x 95
		y 153
		lookStr 13168
		garbX 91
		garbY 138
	)
)

(instance gBeggar of Garb
	(properties
		x 248
		y 160
		lookStr 13196
		cel 3
		newGuise 1
		garbX 244
		garbY 145
	)
)

(instance gJeweler of Garb
	(properties
		x 195
		y 165
		lookStr 13249
		cel 2
		newGuise 2
		garbX 189
		garbY 147
	)
)

(instance gPuck of Garb
	(properties
		x 140
		y 163
		lookStr 13298
		cel 1
		newGuise 4
		garbX 134
		garbY 148
	)
)

(instance gAbbey of Garb
	(properties
		x 255
		y 128
		lookStr 13333
		cel 5
		newGuise 5
		garbX 250
		garbY 113
	)
)

(instance gFens of Garb
	(properties
		x 210
		y 129
		lookStr 13368
		cel 4
		newGuise 6
		garbX 206
		garbY 114
	)
)

(instance fire of Prop
	(properties
		x 167
		y 140
		view 140
		signal $4000
	)
	
	(method (init)
		(self setCycle: End self)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1140 34 1))
			(3
				(if (== global115 2)
					(gEgo setScript: burnHand)
				else
					(proc13_4 1140 35 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
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

(instance lookAtChest of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc13_4 1140 17 self)
			)
			(1 (proc13_4 1140 18 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance getHorn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 162 110 self)
			)
			(1
				(gEgo setLoop: 3)
				(horn dispose:)
				(gEgo get: 1)
				(if (not (proc0_5 171)) (proc0_6 171) (proc806_1 50))
				(= ticks 20)
			)
			(2
				(gEgo actions: egoHorn)
				(proc0_2 0)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance wardrobeChange of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath theGarbX theGarbY self)
			)
			(1
				(gEgo setLoop: 2)
				(= ticks 30)
			)
			(2
				(switch gNewGuise
					(0 (proc13_4 1140 71 self))
					(1 (proc13_4 1140 76 self))
					(2 (proc13_4 1140 75 self))
					(4 (proc13_4 1140 74 self))
					(5 (proc13_4 1140 73 self))
					(6 (proc13_4 1140 72 self))
				)
			)
			(3
				(switch gNewGuise
					(0 (gRobin dispose:))
					(1 (gBeggar dispose:))
					(2 (gJeweler dispose:))
					(4 (gPuck dispose:))
					(5 (gAbbey dispose:))
					(6 (gFens dispose:))
				)
				(if (global2 obstacles?)
					((global2 obstacles?) dispose:)
				)
				(global2 obstacles: 0)
				(global5 eachElementDo: #hide)
				(global2 drawPic: 803 6 1 0)
				(= ticks 50)
			)
			(4
				(switch theGNewGuise
					(0
						(= gRobinGarbX (gRobin garbX?))
						(= gRobinGarbY (gRobin garbY?))
					)
					(1
						(= gRobinGarbX (gBeggar garbX?))
						(= gRobinGarbY (gBeggar garbY?))
					)
					(2
						(= gRobinGarbX (gJeweler garbX?))
						(= gRobinGarbY (gJeweler garbY?))
					)
					(3
						(= gRobinGarbX (gJeweler garbX?))
						(= gRobinGarbY (gJeweler garbY?))
					)
					(4
						(= gRobinGarbX (gPuck garbX?))
						(= gRobinGarbY (gPuck garbY?))
					)
					(5
						(= gRobinGarbX (gAbbey garbX?))
						(= gRobinGarbY (gAbbey garbY?))
					)
					(6
						(= gRobinGarbX (gFens garbX?))
						(= gRobinGarbY (gFens garbY?))
					)
				)
				(localproc_06ca)
				(= ticks 30)
			)
			(5
				(proc0_2)
				(global5 eachElementDo: #show)
				(localproc_001a)
				(if
				(and (!= gNewGuise 0) (not (global5 contains: gRobin)))
					(gRobin init:)
				)
				(if
					(and
						(!= gNewGuise 1)
						(proc0_5 54)
						(== global130 3)
						(not (global5 contains: gBeggar))
					)
					(gBeggar init:)
				)
				(if
					(and
						(!= gNewGuise 2)
						(proc0_5 113)
						(!= gNewGuise 3)
						(== global130 9)
						(not (global5 contains: gJeweler))
					)
					(gJeweler init:)
				)
				(if
					(and
						(!= gNewGuise 4)
						(< 7 global130)
						(< global130 10)
						(not (global5 contains: gPuck))
						(proc0_5 57)
					)
					(gPuck init:)
				)
				(if
					(and
						(!= gNewGuise 5)
						(proc0_5 55)
						(< 4 global130)
						(< global130 10)
						(not (global5 contains: gAbbey))
					)
					(gAbbey init:)
				)
				(if
					(and
						(!= gNewGuise 6)
						(proc0_5 147)
						(< 4 global130)
						(< global130 10)
						(not (global5 contains: gFens))
					)
					(gFens init:)
				)
				(global2 drawPic: 140 6 1 0)
				(= ticks 30)
			)
			(6
				(global5 eachElementDo: #stopUpd)
				(fire cue:)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance stashIt of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 44 118 self)
			)
			(1
				(if (== gNewGuise 0)
					(gEgo view: 7 loop: 5 cel: 0 setCycle: CT 4 1 self)
				else
					(self cue:)
				)
			)
			(2
				(chestSound play:)
				(proc13_4 1140 13 self)
			)
			(3
				(chingSound play:)
				(= ticks 10)
			)
			(4
				(chingSound play:)
				(= ticks 10)
			)
			(5
				(chingSound play:)
				(= ticks 10)
			)
			(6 (proc13_4 1140 14 self))
			(7
				(if (== gNewGuise 0)
					(gEgo setCycle: Beg self)
				else
					(self cue:)
				)
			)
			(8
				(chestSound play:)
				(if (not (gEgo has: 0))
					(gEgo get: 0)
					(if (< (gMoney value?) 50)
						(gPennies put: 5)
						(gHapennies put: 19)
						(gFarthings put: 26)
					)
				else
					(gPennies put: 5)
					(gHapennies put: 19)
					(gFarthings put: 26)
				)
				(= ticks 30)
			)
			(9
				(proc806_1 50 193)
				(proc0_2)
				(gEgo
					setMotion: PolyPath (+ (gEgo x?) 20) (gEgo y?) self
				)
			)
			(10 (proc0_4) (self dispose:))
		)
	)
)

(instance putMoneyBack of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 44 118 self)
			)
			(1
				(if (== gNewGuise 0)
					(gEgo view: 7 loop: 5 cel: 0 setCycle: CT 4 1 self)
				else
					(self cue:)
				)
			)
			(2
				(chestSound play:)
				(= seconds 2)
			)
			(3
				(chingSound play:)
				(= ticks 10)
			)
			(4
				(chingSound play:)
				(= ticks 10)
			)
			(5
				(chingSound play:)
				(= ticks 10)
			)
			(6
				(if (== gNewGuise 0)
					(gEgo setCycle: Beg self)
				else
					(self cue:)
				)
			)
			(7
				(chestSound play:)
				(gEgo put: 0 setHeading: 180)
				(= ticks 36)
			)
			(8 (proc13_4 1140 65 self))
			(9
				(proc0_2)
				(gEgo setHeading: 135 self)
			)
			(10 (proc0_4) (self dispose:))
		)
	)
)

(instance cantRap of Script
	(properties)
	
	(method (doit)
		(if (== (gEgo view?) 10)
			(gRgnMusic setVol: 0)
			(gRgnMusic fade: 127 30 8 1)
		)
		(super doit:)
	)
	
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
				(hornBadSound play:)
				(= seconds 4)
			)
			(2 (gEgo setCycle: Beg self))
			(3
				(proc0_2 gGEgoLoop 0 1)
				(proc13_4 1140 42 self)
			)
			(4 (proc13_4 1140 43 self))
			(5
				(proc0_4)
				(hornBadSound stop:)
				(self dispose:)
			)
		)
	)
)

(instance blowOut of Script
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
				(hornBadSound number: 904 play:)
				(= seconds 4)
			)
			(2 (gEgo setCycle: Beg self))
			(3
				(proc0_2 gGEgoLoop 0 1)
				(proc13_4 1140 43 self)
			)
			(4
				(proc0_4)
				(hornBadSound stop:)
				(self dispose:)
			)
		)
	)
)

(instance burnHand of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 156 149 self)
			)
			(1
				(proc0_9 gEgo fire)
				(= ticks 12)
			)
			(2
				(gEgo
					view: 7
					loop: 1
					cel: 0
					cycleSpeed: 12
					setCycle: CT 4 1 self
				)
			)
			(3 (proc13_4 1140 44 self))
			(4 (gEgo setCycle: End self))
			(5
				(proc0_2 6)
				(gEgo cycleSpeed: 6)
				(= ticks 12)
			)
			(6 (proc0_4) (self dispose:))
		)
	)
)

(instance enterTheCave of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: MoveTo 235 95 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance skinDoVerb of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2 (proc13_4 1140 45 1))
			(3 (proc13_4 1140 46 1))
			(4 (proc13_4 1140 33 1))
			(else 
				(gDoVerbCode doit: param1 &rest)
			)
		)
	)
)

(instance egoHorn of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== gNewGuise 0)
					(proc13_4 1140 70)
					1
				else
					(proc13_4 1140 69)
					1
				)
			)
			(4
				(if (== param2 1)
					(cond 
						(
							(and
								(== local1 0)
								(== global12 160)
								(== global130 2)
								(not (proc0_5 208))
							)
							(proc0_6 208)
							(= local1 1)
							(gRgnMusic number: 160 owner: self init: play:)
							(gEgo setScript: cantRap)
							1
						)
						((and (== local0 0) (not (proc0_5 208))) (= local0 1) (proc0_6 208) (gEgo setScript: blowOut) 1)
						(else (proc13_4 1140 47 1) 1)
					)
				)
			)
		)
	)
)

(instance hornBadSound of Sound
	(properties
		flags $0001
		number 903
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)

(instance chestSound of Sound
	(properties
		flags $0001
		number 459
	)
)

(instance chingSound of Sound
	(properties
		flags $0001
		number 914
		loop 3
	)
)

(instance magicSound of Sound
	(properties
		flags $0001
		number 216
	)
)

(instance vanishSound of Sound
	(properties
		flags $0001
		number 213
	)
)
