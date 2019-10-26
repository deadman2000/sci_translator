;;; Sierra Script 1.0 - (do not remove this comment)
(script# 260)
(include sci.sh)
(use n000)
(use n012)
(use n013)
(use n806)
(use n851)
(use n946)
(use n950)
(use n994)
(use n998)
(use n999)

(public
	rm260 0
)

(local
	local0
	local1
	local2
	local3
	local4
)
(instance rm260 of Rm
	(properties
		picture 260
	)
	
	(method (init)
		(super init:)
		(= local3
			(switch global87
				(0 40)
				(1 60)
				(2 80)
			))
		(if
			(and
				(== global130 10)
				(not
					(proc999_5 gHeading 450 440 350 390 270 280 290 300 310)
				)
				(>= global160 1)
			)
			(= global151 global159)
		)
		(if
			(or
				(!= (gRgnMusic number?) 902)
				(< (gRgnMusic vol?) 127)
			)
			(gRgnMusic number: 902 vol: 127 loop: -1 play:)
		)
		(= local1 global34)
		(= global34 0)
		(proc806_3
			castle
			pub
			shop
			abbey
			fair
			river
			watling
			inField
			inTown
			midTown
			northOfTown
			southOfTown
		)
		(castleFlag init:)
		(pubFlag init:)
		(abbeyFlag init:)
		(lobbFlag init:)
		(if (== global130 8) (fairFlag init:))
		(proc0_4)
		(gIconBar disable: 2 3 6 4)
		(if
			(and
				(<= 5 global130)
				(<= (gIconBar disable: 2 3 6 4) 6)
			)
			(if
				(and
					(>= global142 1)
					(== gNewGuise 5)
					(not
						(proc999_5 gHeading 450 440 350 390 270 280 290 300 310)
					)
				)
				(gIconBar disable: 5)
				(= local4 1)
			)
			(if
				(and
					(>= global142 2)
					(proc999_5 gHeading 450 440 350 390 270 280 290 300 310)
				)
				(gClient newRoom: 150)
			)
		)
		(if
			(and
				(== global130 10)
				(== global151 global159)
				(!= global156 global160)
			)
			(gIconBar disable: 5)
			(= local4 1)
		)
		(proc806_6 0)
		((gIconBar at: 0) message: 11)
	)
	
	(method (doit)
		(if (== (mod (++ local2) local3) 0)
			(Palette 6 245 254 -1)
		)
	)
	
	(method (dispose)
		(= global34 local1)
		((gIconBar at: 0) message: 1)
		(super dispose:)
	)
	
	(method (newRoom newRoomNumber)
		(if
			(and
				(proc999_5 gHeading 450 440 350 390 270 280 290 300 310)
				(not
					(proc999_5
						newRoomNumber
						450
						440
						350
						390
						270
						280
						290
						300
						310
					)
				)
			)
			(if (!= global130 10) (= global160 0))
			(= global156 global160)
			(++ global142)
		)
		(super newRoom: newRoomNumber)
	)
)

(instance castle of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init: 23 76 47 75 66 88 68 103 48 109 26 111 14 96 14 85
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: castleMessage)
			)
			(11
				(if (== gNewGuise 0)
					(proc13_4 1260 4 1)
				else
					(gClient newRoom: 390)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance pub of Feature
	(properties
		lookStr 5
	)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init: 52 109 62 106 64 121 51 121
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 11)
			(gClient newRoom: 270)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance shop of Feature
	(properties
		lookStr 6
	)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init: 193 94 235 94 235 109 193 116
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 11)
			(if (== gNewGuise 0)
				(proc13_4 1260 7 1)
			else
				(gClient newRoom: 350)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance abbey of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init: 209 53 227 53 252 77 252 87 235 89
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(gClient setScript: abbeyMessage)
			)
			(11
				(if (== gNewGuise 0)
					(proc13_4 1260 13 1)
				else
					(gClient newRoom: 440)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fair of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init: 76 47 116 47 74 71 60 64
						yourself:
					)
				)
		)
		(if (proc999_5 gHeading 280 290 300 310)
			(= heading gHeading)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== global130 8)
					(proc13_4 1260 16 1)
				else
					(gClient setScript: fairMessage)
				)
			)
			(11
				(if (== global130 8)
					(if (== gNewGuise 0)
						(proc13_4 1260 23 1)
					else
						(gClient newRoom: 310)
					)
				else
					(proc13_4 1260 17 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance river of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							0
							137
							28
							153
							48
							155
							86
							142
							125
							144
							172
							133
							201
							135
							222
							131
							255
							125
							273
							120
							293
							114
							319
							109
							319
							132
							298
							135
							251
							130
							218
							140
							189
							139
							173
							138
							130
							150
							113
							150
							88
							146
							50
							161
							24
							160
							0
							144
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 19 1))
			(11 (proc13_4 1260 20 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance watling of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							298
							0
							319
							65
							319
							75
							307
							80
							296
							77
							296
							71
							310
							71
							313
							65
							300
							48
							276
							30
							270
							0
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 21 1))
			(11
				(if (not local4) (gClient newRoom: 100))
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance inField of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							81
							44
							119
							45
							108
							76
							91
							77
							110
							103
							122
							105
							101
							118
							64
							119
							61
							105
							71
							100
							65
							87
							46
							74
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 25 1))
			(11
				(if (== gNewGuise 0)
					(proc13_4 1260 23 1)
				else
					(proc13_4 1260 26 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance inTown of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							82
							43
							86
							34
							114
							26
							228
							24
							263
							46
							277
							66
							284
							91
							271
							104
							244
							105
							224
							115
							202
							121
							178
							121
							159
							109
							128
							110
							99
							122
							48
							122
							46
							72
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 22 1))
			(11
				(if (== gNewGuise 0)
					(proc13_4 1260 23 1)
				else
					(proc13_4 1260 24 1)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance midTown of Feature
	(properties)
	
	(method (init)
		(gClient
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							0
							101
							13
							89
							14
							97
							26
							111
							49
							110
							49
							123
							101
							123
							128
							110
							159
							110
							178
							121
							202
							121
							235
							110
							244
							105
							271
							104
							284
							91
							281
							78
							319
							75
							319
							108
							253
							126
							202
							136
							166
							134
							126
							145
							86
							143
							49
							155
							28
							153
							0
							137
						yourself:
					)
				)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 28 1))
			(11
				(if (not local4) (gClient newRoom: 100))
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance northOfTown of Feature
	(properties
		nsBottom 95
		nsRight 319
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 27 1))
			(11
				(if (not local4) (gClient newRoom: 100))
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance southOfTown of Feature
	(properties
		nsTop 95
		nsBottom 189
		nsRight 319
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1260 29 1))
			(11
				(if (not local4) (gClient newRoom: 100))
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance castleFlag of MapButton
	(properties
		x 38
		y 81
		heading 390
		view 260
	)
	
	(method (init)
		((aPole new:) x: x y: y init:)
		(super init:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(== ((gIconBar curIcon?) message?) 11)
				(self onMe: pEvent)
				(== gNewGuise 0)
			)
			(proc13_4 1260 4 1)
			(pEvent claimed: 1)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb)
		(castle doVerb: theVerb &rest)
	)
)

(instance pubFlag of MapButton
	(properties
		x 58
		y 100
		heading 270
		view 260
		loop 1
	)
	
	(method (init)
		((aPole new:) x: x y: y init:)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(pub doVerb: theVerb &rest)
	)
)

(instance fairFlag of MapButton
	(properties
		x 81
		y 45
		heading 310
		view 260
		loop 2
	)
	
	(method (init)
		((aPole new:) x: x y: y init:)
		(super init:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(== ((gIconBar curIcon?) message?) 11)
				(self onMe: pEvent)
				(== gNewGuise 0)
			)
			(proc13_4 1260 23 1)
			(pEvent claimed: 1)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb)
		(fair doVerb: theVerb &rest)
	)
)

(instance abbeyFlag of MapButton
	(properties
		x 243
		y 62
		heading 440
		view 260
		loop 3
	)
	
	(method (init)
		((aPole new:) x: x y: y init:)
		(super init:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(== ((gIconBar curIcon?) message?) 11)
				(self onMe: pEvent)
				(== gNewGuise 0)
			)
			(proc13_4 1260 13 1)
			(pEvent claimed: 1)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb)
		(abbey doVerb: theVerb &rest)
	)
)

(instance lobbFlag of MapButton
	(properties
		x 199
		y 94
		heading 350
		view 260
		loop 4
	)
	
	(method (init)
		((aPole new:) x: x y: y init:)
		(super init:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(== ((gIconBar curIcon?) message?) 11)
				(self onMe: pEvent)
				(== gNewGuise 0)
			)
			(proc13_4 1260 7 1)
			(pEvent claimed: 1)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb)
		(shop doVerb: theVerb &rest)
	)
)

(instance aPole of View
	(properties
		view 260
		loop 5
		signal $0001
	)
)

(instance castleMessage of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1260 0 self))
			(1
				(if (not (proc0_5 2))
					(proc0_6 2)
					(proc13_4 1260 1 self)
				else
					(self dispose:)
				)
			)
			(2 (proc13_4 1260 2 self))
			(3 (proc13_4 1260 3 self))
			(4 (self dispose:))
		)
	)
)

(instance abbeyMessage of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1260 8 self))
			(1
				(if (not (proc0_5 3))
					(proc13_4 1260 9 self)
				else
					(++ state)
					(self cue:)
				)
			)
			(2 (proc13_4 1260 10 self))
			(3 (proc13_4 1260 11 self))
			(4
				(if (not (proc0_5 3))
					(proc0_6 3)
					(proc13_4 1260 12 self)
				else
					(self cue:)
				)
			)
			(5 (self dispose:))
		)
	)
)

(instance fairMessage of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1260 14 self))
			(1 (proc13_4 1260 15 self))
			(2 (self dispose:))
		)
	)
)
