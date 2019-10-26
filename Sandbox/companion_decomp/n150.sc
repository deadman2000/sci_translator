;;; Sierra Script 1.0 - (do not remove this comment)
(script# 150)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n961)
(use n969)
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm150 0
)

(local
	[newWave 3]
	[local3 3] = [27 54 78]
	[local6 3] = [82 79 72]
	[local9 3] = [0 0 2]
	theTuckAlone
	local13
	local14
	local15
	local16
	local17
	theFwd
	local19
	local20
	local21
	local22
	local23
	theFwd_3
	local25
	local26
	local27
	local28
	local29
	local30
	local31
	local32
	local33
	local34
	local35
	theFwd_2
	local37
	local38
	local39
	local40
	local41
	local42
	local43
	local44
	local45
	local46
	local47
	local48
	local49
	local50
	local51
	local52
	local53
	local54
	local55
	local56
	[local57 4] = [1150 13 1]
	[local61 4] = [1150 24 1]
	[local65 4] = [1150 25 1]
	[local69 4] = [1150 26 1]
	[local73 4] = [1150 27 1]
	[local77 4] = [1150 30 1]
	[local81 6] = [1150 31 2 1 2]
	[local87 4] = [1150 34 1]
	[local91 5] = [1150 16 1 2]
	[local96 5] = [1150 18 1 2]
	[local101 4] = [1150 20 1]
	[local105 4] = [1150 21 1]
	[local109 5] = [1150 22 1 2]
	[local114 5] = [1150 39 2 1]
	[local119 5] = [1150 41 2 1]
	[local124 5] = [1150 28 1 1]
	[local129 5] = [1150 49 1 1]
)
(procedure (localproc_001e &tmp temp0)
	(= temp0 0)
	(while (< temp0 3)
		((= [newWave temp0] (wave new:))
			x: [local3 temp0]
			y: [local6 temp0]
			cel: [local9 temp0]
			init:
		)
		(++ temp0)
	)
)

(procedure (localproc_0055)
	(switch global130
		(1
			(= local44 1)
			(cond 
				((not (proc0_5 71))
					(proc0_6 71)
					(= local49 1)
					(= theTuckAlone (ScriptID 151 0))
					(= local13 (ScriptID 23))
					(= local16 168)
					(= local17 3)
					(= theFwd Fwd)
					(= local14 147)
					(= local15 103)
					(= local19 (ScriptID 19))
					(= local20 71)
					(= local21 136)
					(= local25 (ScriptID 20))
					(= local26 265)
					(= local27 96)
					(= local31 (ScriptID 21))
					(= local34 170)
					(gRgnMusic2 number: 154 loop: -1)
					(= local35 1)
					(= theFwd_2 Fwd)
					(= local32 226)
					(= local33 103)
					((ScriptID 23) actions: tucksActions detailLevel: 2)
					((ScriptID 19) actions: johnsActions)
					((ScriptID 20) actions: willsActions)
					((ScriptID 21) actions: alansActions detailLevel: 2)
				)
				((and (not (proc0_5 163)) (not (proc0_5 44)))
					(proc0_6 163)
					(= local43 1)
					(= theTuckAlone tuckAlone)
					(= local13 (ScriptID 23))
					(= local14 207)
					(= local15 88)
					(= local16 168)
					(= local17 0)
					(= theFwd End)
					((ScriptID 23) actions: tucksActions)
				)
			)
		)
		(2
			(if (not (proc0_5 71))
				150
				(proc0_6 71)
				(proc0_6 21)
				(= theTuckAlone (ScriptID 151 1))
				(= local13 (ScriptID 23))
				(= local14 210)
				(= local15 129)
				(= local19 (ScriptID 19))
				(= local20 232)
				(= local21 111)
				(= local25 (ScriptID 21))
				(= local29 3)
				(= local26 148)
				(= local27 167)
				(= local31 (ScriptID 20))
				(= local32 -15)
				(= local33 131)
				((ScriptID 23) actions: tucksActions)
				((ScriptID 19) actions: johnsActions)
				((ScriptID 21) actions: alansActions)
				((ScriptID 20) actions: willsActions)
			)
		)
		(3
			(if (and (proc0_5 49) (not (proc0_5 54)))
				(proc0_6 54)
				(proc0_6 151)
				(= theTuckAlone (ScriptID 151 2))
				(= local13 (ScriptID 19))
				(= local17 2)
				(= local14 218)
				(= local15 77)
				((ScriptID 19) actions: johnsActions)
			)
		)
		(4
			(if (not (proc0_5 71))
				(proc0_6 71)
				(= theTuckAlone (ScriptID 151 3))
				(= local13 (ScriptID 20))
				(= local14 78)
				(= local15 185)
				(= local17 3)
				((ScriptID 20) actions: willsActions)
			)
		)
		(5
			(cond 
				((not (proc0_5 71))
					(proc0_6 71)
					(= theTuckAlone (ScriptID 151 4))
					(= local13 (ScriptID 21))
					(= local14 230)
					(= local15 111)
					(= local17 2)
					((ScriptID 21) actions: alansActions)
				)
				((and (proc0_5 169) (not (proc0_5 55)))
					(proc0_6 55)
					(proc0_6 25)
					(= global160 0)
					(= theTuckAlone (ScriptID 151 5))
					(= local13 (ScriptID 23))
					(= local14 88)
					(= local15 177)
					((ScriptID 23) actions: tucksActions)
				)
				(
					(and
						(proc0_5 39)
						(not (proc0_5 147))
						(not (proc0_5 25))
					)
					(proc0_6 147)
					(= theTuckAlone (ScriptID 151 6))
					(= local13 (ScriptID 19))
					(= local17 2)
					(= local14 266)
					(= local15 97)
					((ScriptID 19) actions: johnsActions)
				)
				(
					(and
						(== gNewGuise 5)
						(not (proc0_5 56))
						(not (proc0_5 161))
						(== global142 2)
					)
					(proc0_6 161)
					(= theTuckAlone (ScriptID 151 7))
					(= local13 (ScriptID 20))
					(= local14 141)
					(= local15 98)
					(= theFwd Walk)
					((ScriptID 20) actions: willsActions)
				)
				(
					(and
						(== gNewGuise 5)
						(not (proc0_5 56))
						(== global142 3)
					)
					(proc0_6 56)
					(= local43 1)
					(= theTuckAlone (ScriptID 151 8))
					(= local13 (ScriptID 23))
					(= local14 204)
					(= local15 88)
					(= local16 168)
					(= local17 0)
					(= theFwd End)
					((ScriptID 23) actions: tucksActions)
				)
			)
		)
		(6
			(proc0_7 19)
			(cond 
				((and (not (proc0_5 71)) (proc0_5 25))
					(proc0_6 71)
					(= theTuckAlone (ScriptID 151 9))
					(= local53 1)
					(= local13 (ScriptID 19))
					(= local16 167)
					(= local17 1)
					(= theFwd End)
					(= local14 201)
					(= local15 71)
					(= local19 (ScriptID 21))
					(= local22 147)
					(= local23 4)
					(= theFwd_3 Fwd)
					(= local20 242)
					(= local21 108)
					(gRgnMusic2 number: 154 loop: -1)
					((ScriptID 19) detailLevel: 2 actions: johnsActions)
					((ScriptID 21) detailLevel: 1 actions: alansActions)
				)
				((not (proc0_5 71))
					(proc0_6 71)
					(= theTuckAlone (ScriptID 151 10))
					(= local13 (ScriptID 22))
					(= local14 71)
					(= local15 136)
					((ScriptID 22) actions: muchsActions)
				)
				(
					(and
						(proc0_5 169)
						(not (proc0_5 25))
						(not (proc0_5 55))
					)
					(proc0_6 55)
					(= theTuckAlone (ScriptID 151 5))
					(= local13 (ScriptID 23))
					(= local14 88)
					(= local15 177)
					((ScriptID 23) actions: tucksActions)
				)
				((and (proc0_5 39) (not (proc0_5 147)))
					(proc0_6 147)
					(= theTuckAlone (ScriptID 151 6))
					(= local13 (ScriptID 19))
					(= local17 2)
					(= local14 266)
					(= local15 97)
					((ScriptID 19) actions: johnsActions)
				)
				(
					(and
						(== gNewGuise 5)
						(== global142 2)
						(not (proc0_5 56))
						(not (proc0_5 161))
					)
					(proc0_6 161)
					(= theTuckAlone (ScriptID 151 7))
					(= local13 (ScriptID 20))
					(= theFwd Walk)
					(= local14 141)
					(= local15 98)
					((ScriptID 20) actions: willsActions)
				)
				(
					(and
						(== gNewGuise 5)
						(== global142 3)
						(not (proc0_5 56))
					)
					(proc0_6 56)
					(= theTuckAlone (ScriptID 151 8))
					(= local43 1)
					(= local13 (ScriptID 23))
					(= local14 204)
					(= local15 88)
					(= local16 168)
					(= local17 0)
					(= theFwd End)
					((ScriptID 23) actions: tucksActions)
				)
			)
		)
		(7
			(if
				(and
					(proc0_5 34)
					(not (gEgo has: 4))
					(not (proc0_5 71))
				)
				(proc0_6 71)
				(= theTuckAlone (ScriptID 151 11))
				(= local13 (ScriptID 23))
				(= local17 1)
				(= local14 71)
				(= local15 136)
				(proc0_6 19)
				((ScriptID 23) actions: tucksActions)
			)
		)
		(8
			(cond 
				((not (proc0_5 71))
					(proc0_6 71)
					(= theTuckAlone (ScriptID 151 12))
					(= local13 (ScriptID 23))
					(= local14 104)
					(= local15 147)
					(= local17 2)
					(= local19 (ScriptID 19))
					(= local53 1)
					(= local20 55)
					(= local21 186)
					(= local23 0)
					(= local31 (ScriptID 21))
					(= local32 100)
					(= local33 189)
					(= local35 1)
					(= local25 (ScriptID 22))
					(= local26 76)
					(= local27 172)
					(= local29 2)
					((ScriptID 19) actions: johnsActions)
					((ScriptID 21) actions: alansActions)
					((ScriptID 23) actions: tucksActions)
					((ScriptID 22) actions: muchsActions)
				)
				(
				(and (proc0_5 135) (proc0_5 191) (not (proc0_5 57)))
					(proc0_6 57)
					(= theTuckAlone (ScriptID 151 13))
					(= local13 (ScriptID 19))
					(= local14 192)
					(= local15 151)
				)
			)
		)
		(9
			(cond 
				((not (proc0_5 71))
					(proc0_6 71)
					(= theTuckAlone (ScriptID 151 14))
					(= local43 1)
					(= local13 (ScriptID 20))
					(= local17 0)
					(= theFwd Walk)
					(= local14 192)
					(= local15 151)
				)
				((proc0_5 102)
					(= gNewGuise 0)
					(= theTuckAlone (ScriptID 153 0))
					(= local13 (ScriptID 23))
					(= local14 205)
					(= local15 82)
					(= local17 2)
					(= local16 168)
					(= theFwd End)
					(= local19 (ScriptID 19))
					(= local53 1)
					(= local23 0)
					(= local20 77)
					(= local21 92)
					(= local25 (ScriptID 20))
					(= local26 160)
					(= local27 84)
					(= local31 (ScriptID 21))
					(= local34 170)
					(gRgnMusic2 number: 393 loop: -1)
					(= local34 0)
					(= local54 1)
					(= local32 38)
					(= local33 170)
					(= local37 (ScriptID 22))
					(= local38 148)
					(= local39 167)
					((ScriptID 23) actions: tucksActions)
					((ScriptID 21) actions: alansActions)
					((ScriptID 20) actions: willsActions)
					((ScriptID 19) actions: johnsActions)
					((ScriptID 22) actions: muchsActions)
				)
			)
		)
		(10
			(if (not (proc0_5 71))
				(proc0_6 71)
				(= theTuckAlone (ScriptID 151 15))
				(= local13 (ScriptID 19))
				(= local14 191)
				(= local15 85)
				((ScriptID 19) actions: johnsActions)
			)
		)
		(11
			(if (not (proc0_5 71))
				(proc0_6 71)
				(= theTuckAlone (ScriptID 151 16))
				(= local13 (ScriptID 23))
				(= local14 310)
				(= local15 90)
				(= local17 1)
				(= theFwd Walk)
				((ScriptID 23) actions: tucksActions)
			)
		)
		(12
			(if (not (proc0_5 71))
				(proc0_6 71)
				(= theTuckAlone (ScriptID 151 17))
				(= local13 (ScriptID 19))
				(= local43 1)
				(= local17 0)
				(= local14 192)
				(= local15 151)
			)
		)
		(13
			(if (not (proc0_5 71))
				(proc0_6 71)
				(= theTuckAlone (ScriptID 151 18))
				(= local13 (ScriptID 20))
				(= local14 150)
				(= local15 176)
				((ScriptID 20) actions: willsActions)
			)
		)
	)
)

(instance rm150 of Rm
	(properties
		picture 150
		style $0064
		north 220
		east 140
		south 220
		west 220
	)
	
	(method (init)
		(gRgnMusic2 number: 0)
		(localproc_0055)
		(proc958_0 128 150 7 157 143)
		(if (and (not (proc0_5 0)) (not (proc0_5 115)))
			(localproc_001e)
		)
		(gMH addToFront: self)
		(gKH addToFront: self)
		(global2
			addObstacle:
				((Polygon new:)
					type: 2
					init:
						319
						155
						319
						189
						213
						189
						192
						189
						123
						189
						130
						176
						270
						179
						292
						178
						249
						131
						289
						124
						319
						123
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						204
						113
						176
						117
						166
						113
						144
						113
						116
						105
						116
						93
						120
						91
						126
						85
						137
						85
						162
						94
						169
						96
						177
						101
						179
						104
						203
						109
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						240
						111
						229
						112
						206
						108
						170
						93
						164
						93
						163
						89
						229
						76
						265
						63
						292
						77
						280
						87
						252
						91
						275
						98
						277
						101
						247
						107
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						140
						128
						125
						131
						103
						135
						77
						143
						62
						142
						54
						136
						32
						138
						18
						133
						17
						128
						104
						103
						129
						117
						144
						120
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						233
						140
						216
						148
						207
						151
						209
						165
						187
						171
						175
						171
						171
						169
						162
						170
						132
						171
						119
						174
						87
						158
						96
						152
						165
						119
						220
						127
					yourself:
				)
				((Polygon new:)
					type: 2
					init:
						74
						163
						45
						165
						33
						172
						21
						177
						9
						178
						0
						184
						0
						137
						23
						145
						41
						145
						53
						152
						70
						158
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 71 81 77 90 68 95 33 96 14 92 24 86
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 56 110 53 115 32 118 12 115 14 110 33 106 48 105
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 88 101 74 107 60 107 52 103 56 101 80 98
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 97 319 118 279 121 254 123 231 121 251 110 253 108
					yourself:
				)
		)
		(streamSound play:)
		(if local13
			(if (!= theFwd 0)
				(local13 setCycle: theFwd)
			else
				(local13 setCycle: StopWalk (+ (local13 view?) 1))
			)
			(local13 x: local14 y: local15 cel: 0 signal: 16384 init:)
			(if
			(and (== local53 1) (proc0_5 25) (== global130 6))
				((ScriptID 19) setPri: 3)
			)
			(cond 
				((> local17 0) (local13 loop: local17))
				(local43 (local13 loop: 0))
				(else (local13 loop: 2))
			)
			(if (!= local16 0) (local13 view: local16))
		)
		(if local19
			(local19 x: local20 y: local21 ignoreActors: 1 init:)
			(cond 
				((!= local23 0) (local19 loop: local23))
				((== local53 1) (local19 loop: 0))
				(else (local19 loop: 2))
			)
			(if (!= local22 0) (local19 view: local22))
			(cond 
				((!= theFwd_3 0) (local19 setCycle: theFwd_3))
				((== local53 1) (local19 setCycle: 0))
				(else (local19 setCycle: StopWalk (+ (local19 view?) 1)))
			)
		)
		(if local25
			(local25 x: local26 y: local27 ignoreActors: 1 init:)
			(cond 
				((!= local29 0) (local25 loop: local29))
				((== local55 1) (local25 loop: 0))
				(else (local25 loop: 2))
			)
			(if (!= local28 0) (local25 view: local28))
			(if (!= local30 0)
				(local25 setCycle: local30)
			else
				(local25 setCycle: StopWalk (+ (local25 view?) 1))
			)
		)
		(if local31
			(if (!= theFwd_2 0)
				(local31 setCycle: theFwd_2)
			else
				(local31 setCycle: StopWalk (+ (local31 view?) 1))
			)
			(local31 x: local32 y: local33 ignoreActors: 1 init:)
			(cond 
				((!= local35 0) (local31 loop: local35))
				((== local54 1) (local31 loop: 0))
				(else (local31 loop: 2))
			)
			(if (!= local34 0) (local31 view: local34))
		)
		(if local37
			(local37 x: local38 y: local39 ignoreActors: 1 init:)
			(if (!= local41 0)
				(local37 loop: local41)
			else
				(local37 loop: 2)
			)
			(if (!= local40 0) (local37 view: local40))
			(if (!= local42 0)
				(local37 setCycle: local42)
			else
				(local37 setCycle: StopWalk (+ (local37 view?) 1))
			)
		)
		(if (and (proc0_5 102) (== global130 9))
			((ScriptID 22) setPri: 15)
			((ScriptID 19) setPri: 10 signal: 16)
		)
		(if (== local44 1) (theFire init:) (fireSound play:))
		(if (== local49 1) (proc806_3 food))
		(proc806_3
			table1
			table2
			table3
			table4
			rock1
			rock2
			rock3
			rock4
			rock5
			stump1
			stump2
			stump3
			stump4
			stump5
			cave
			stream
			cliffs
			woods
			everyThing
		)
		(if (== global12 140) (= gGEgoEdgeHit 4))
		(if (and (proc0_5 102) (== global130 9))
			(= gNewGuise 0)
		)
		(super init:)
		(gEgo actions: bowActions)
		(gRgnMusic number: 905 play:)
		(if
			(or
				(== (gRgnMusic2 number?) 154)
				(== (gRgnMusic2 number?) 393)
			)
			(gRgnMusic2 play:)
		)
		(if (and (proc0_5 102) (== global130 9))
			(proc0_2 1 0 1)
			(gEgo posn: 262 119 loop: 2 init: setScript: theTuckAlone)
		else
			(gEgo setScript: egoEnters 0 gGEgoEdgeHit)
		)
	)
	
	(method (doit &tmp temp0)
		(if
		(and (> (global1 detailLevel:) 2) (not (proc0_5 115)))
			(Palette 6 236 253 -1)
		)
		(cond 
			((gEgo script?) 0)
			((gEgo edgeHit?)
				(= temp0
					(switch (= gGEgoEdgeHit (gEgo edgeHit?))
						(2 east)
						(3 south)
						(4 west)
						(1 north)
					)
				)
				(if (!= gGEgoEdgeHit 2)
					(gEgo setScript: walkOutOfHere 0 temp0)
				else
					(gEgo setScript: walkOutOfHere 0 temp0)
				)
			)
			((== (gEgo onControl: 1) 2)
				(global2 horizon: (gEgo y?))
				(gEgo setMotion: 0 setCycle: 0)
			)
			(else (super doit:))
		)
	)
	
	(method (dispose)
		(gMH delete: self)
		(gKH delete: self)
		(gRgnMusic2 fade: 0 20 12 1)
		(super dispose:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(cave onMe: pEvent)
				(== global19 0)
				(== (pEvent modifiers?) 0)
				(or
					(== (pEvent type?) evMOUSEBUTTON)
					(== (pEvent type?) evKEYBOARD)
				)
			)
			(pEvent claimed: 1)
			(gEgo setScript: walkInToCave)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance bowActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(10 (proc13_4 1150 0 1))
			(4
				(if (== param2 1) (global2 setScript: (ScriptID 5 0)))
			)
		)
	)
)

(instance tucksActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(switch global130
					(1
						(if (not local52)
							(= local52 1)
							(proc851_0 2 @local96 2 0 15 3 0)
							1
						)
					)
					(5
						(if (proc0_5 111)
							(proc851_0 1 @local101 15 0 0)
							1
						else
							(proc851_0 1 @local105 15 0 0)
							1
						)
					)
					(11
						(proc851_0 2 @local109 1 0 15 3 0)
						1
					)
				)
			)
		)
	)
)

(instance alansActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(switch global130
					(1
						(proc851_0 1 @local61 16 0 0)
						1
					)
					(6
						(proc851_0 1 @local65 16 0 0)
						1
					)
				)
			)
		)
	)
)

(instance willsActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(switch global130
					(5
						(if (or (== gNewGuise 6) (== gNewGuise 5))
							(proc851_0 1 @local69 14 0 0)
							1
						)
					)
					(6
						(if (or (== gNewGuise 6) (== gNewGuise 5))
							(proc851_0 1 @local69 14 0 0)
							1
						)
					)
				)
			)
		)
	)
)

(instance johnsActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(switch global130
					(6
						(if (== local51 0)
							(= local51 1)
							(proc851_0 @local124 13 0)
						else
							(proc851_0 @local73 13 0)
						)
						1
					)
					(10
						(if local50
							(proc851_0 1 @local77 13 0 0)
							1
						else
							(proc851_0 2 @local81 2 0 13 3 0)
							(= local50 1)
							1
						)
					)
				)
			)
		)
	)
)

(instance muchsActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(5
				(if (== global130 6) (proc851_0 @local87 17 0) 1)
			)
		)
	)
)

(instance tableDoVerb of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2 (proc13_4 1150 6 1))
			(3 (proc13_4 1150 7 1))
			(10 (proc13_4 1150 0 1))
			(4
				(switch param2
					(1 (proc13_4 1150 8 1))
					(0 (proc13_4 1150 9 1))
					(else  (proc13_4 1150 10 1))
				)
			)
			(else 
				(gDoVerbCode doit: param1 &rest)
			)
		)
	)
)

(instance stumpDoVerb of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2 (proc13_4 1150 11 1))
			(3 (proc13_4 1150 1 1))
			(10 (proc13_4 1150 0 1))
			(else 
				(gDoVerbCode doit: param1 &rest)
			)
		)
	)
)

(instance rockDoVerb of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2 (proc13_4 1150 12 1))
			(3 (proc13_4 1150 1 1))
			(10 (proc13_4 1150 0 1))
			(else 
				(gDoVerbCode doit: param1 &rest)
			)
		)
	)
)

(instance table1 of Feature
	(properties
		x 35
		y 131
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 35 143 0 155 0 131 33 137
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(tableDoVerb doit: theVerb param2)
	)
)

(instance table2 of Feature
	(properties
		x 129
		y 93
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 129 101 67 117 30 110 30 107 91 93 128 98
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(tableDoVerb doit: theVerb param2)
	)
)

(instance table3 of Feature
	(properties
		x 207
		y 113
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 207 121 158 150 110 141 108 137 165 113 204 117
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(tableDoVerb doit: theVerb param2)
	)
)

(instance table4 of Feature
	(properties
		x 273
		y 63
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 273 71 209 85 174 78 174 74 230 63 271 68
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(tableDoVerb doit: theVerb param2)
	)
)

(instance rock1 of Feature
	(properties
		x 220
		y 131
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 220 138 212 143 188 143 187 138 215 131 220 134
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(rockDoVerb doit: theVerb param2)
	)
)

(instance rock2 of Feature
	(properties
		x 105
		y 117
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 105 127 91 129 82 126 86 120 95 117 102 120
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(rockDoVerb doit: theVerb param2)
	)
)

(instance rock3 of Feature
	(properties
		x 57
		y 120
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 57 130 52 132 31 132 18 127 25 121 45 120
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(rockDoVerb doit: theVerb param2)
	)
)

(instance rock4 of Feature
	(properties
		x 72
		y 162
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				72
				189
				0
				189
				0
				177
				6
				173
				1
				167
				7
				162
				26
				163
				31
				171
				51
				180
				63
				179
				71
				184
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(rockDoVerb doit: theVerb param2)
	)
)

(instance rock5 of Feature
	(properties
		x 208
		y 172
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				208
				178
				177
				181
				154
				189
				145
				189
				142
				184
				146
				180
				155
				177
				170
				172
				195
				174
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(rockDoVerb doit: theVerb param2)
	)
)

(instance stump1 of Feature
	(properties
		x 255
		y 86
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 255 99 244 105 230 104 222 100 223 90 229 86 247 86 251 89
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(stumpDoVerb doit: theVerb param2)
	)
)

(instance stump2 of Feature
	(properties
		x 195
		y 150
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 195 162 179 165 162 160 167 153 171 150 187 150 193 153
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(stumpDoVerb doit: theVerb param2)
	)
)

(instance stump3 of Feature
	(properties
		x 137
		y 112
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 137 123 124 127 113 126 107 123 109 114 115 112 129 112 136 114
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(stumpDoVerb doit: theVerb param2)
	)
)

(instance stump4 of Feature
	(properties
		x 46
		y 142
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 46 155 32 164 25 161 11 160 11 152 39 142 43 143
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(stumpDoVerb doit: theVerb param2)
	)
)

(instance stump5 of Feature
	(properties
		x 142
		y 149
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 142 163 134 167 123 168 101 160 102 153 109 149 118 150 139 157
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(stumpDoVerb doit: theVerb param2)
	)
)

(instance cave of Feature
	(properties
		x 319
		y 28
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 319 111 301 94 308 63 319 64
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1150 2 1))
			(10 (proc13_4 1150 0 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance stream of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				0
				83
				19
				82
				23
				76
				34
				78
				41
				75
				72
				75
				77
				69
				183
				61
				181
				56
				211
				56
				210
				53
				236
				50
				290
				47
				289
				51
				129
				74
				100
				74
				85
				81
				41
				82
				25
				91
				0
				91
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1150 4 1))
			(10 (proc13_4 1150 0 1))
			(3 (proc13_4 1150 51 1))
			(4
				(if (== param2 18)
					(proc13_4 1150 52 1)
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

(instance cliffs of Feature
	(properties
		x 60
		y 1
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 120 41 0 42 0 0 82 0
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1150 3 1))
			(10 (proc13_4 1150 0 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance woods of Feature
	(properties
		x 190
		y 1
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 125 45 85 0 295 0 293 39
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1150 5 1))
			(10 (proc13_4 1150 0 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance food of Feature
	(properties
		x 164
		y 94
		nsTop 77
		nsLeft 143
		nsBottom 94
		nsRight 186
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1150 37 1))
			(3
				(cond 
					((or (== local46 0) (== local47 0))
						(if (== local46 1) (= local47 1))
						(= local46 1)
						(gEgo setScript: takeFood)
					)
					(
					(and (== local46 1) (== local47 1) (== local48 0)) (= local48 1) (proc851_0 @local114 3 15))
					(else (proc13_4 1150 38 1))
				)
			)
			(10 (proc13_4 1150 0 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance everyThing of Feature
	(properties
		nsBottom 190
		nsRight 322
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 10)
			(proc13_4 1150 0 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance wave of Prop
	(properties
		view 150
		loop 7
		signal $4000
		cycleSpeed 18
		detailLevel 2
	)
	
	(method (init)
		(if (Random 0 1)
			(self setCycle: Fwd)
		else
			(self setCycle: Rev)
		)
		(super init:)
	)
)

(instance theFire of Prop
	(properties
		x 155
		y 105
		view 140
		priority 7
		signal $4010
		cycleSpeed 12
		detailLevel 2
	)
	
	(method (init)
		(self setCycle: Fwd self)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1150 15 1))
			(3
				(if (== global115 2)
					(gEgo setScript: burnHand)
				else
					(proc13_4 1150 14 1)
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

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_2)
				(gEgo illegalBits: 0)
				(switch register
					(2
						(gEgo posn: -15 124 init: setMotion: PolyPath 26 124 self)
					)
					(3
						(gEgo
							posn: 181 70
							init:
							loop: 5
							setMotion: PolyPath 252 125 self
						)
					)
					(4
						(if (== global12 140)
							(gEgo
								posn: 339 119
								init:
								setMotion: PolyPath 262 125 self
							)
						else
							(gEgo posn: 302 88 init: setMotion: PolyPath 262 125 self)
						)
					)
					(else 
						(gEgo
							loop: 3
							posn: 107 241
							init:
							setMotion: PolyPath 107 184 self
						)
					)
				)
			)
			(1
				(if (proc0_5 179)
					(proc0_7 179)
					(proc851_0 @local129 1 0 self)
				else
					(self cue:)
				)
			)
			(2
				(if theTuckAlone
					(gEgo setScript: theTuckAlone)
				else
					(proc0_4)
				)
				(proc0_2)
				(self dispose:)
			)
		)
	)
)

(instance walkOutOfHere of Script
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
				(global2 newRoom: register)
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
				(Load rsVIEW 7)
				(gEgo setMotion: PolyPath 154 117 self)
			)
			(1 (gEgo loop: 3) (= ticks 6))
			(2
				(gEgo
					view: 7
					loop: 1
					cel: 0
					cycleSpeed: 1
					setCycle: End self
				)
			)
			(3 (proc0_2 6) (= ticks 6))
			(4
				(proc851_0 1 @local57 1 0 self)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance tuckAlone of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 30))
			(1
				(proc851_0 2 @local91 3 0 15 3 self)
				1
			)
			(2
				((ScriptID 23) actions: tucksActions)
				(= ticks 6)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance takeFood of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 154 117 self)
			)
			(1 (gEgo loop: 3) (= ticks 6))
			(2 (proc0_2 6) (= ticks 6))
			(3
				(proc851_0 @local119 3 15 self)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance walkInToCave of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: PolyPath 300 113 self)
			)
			(1
				(gEgo setMotion: PolyPath 330 119 self)
			)
			(2 (global2 newRoom: 140))
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

(instance streamSound of Sound
	(properties
		flags $0001
		number 581
		loop -1
	)
)
