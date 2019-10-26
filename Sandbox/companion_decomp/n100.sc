;;; Sierra Script 1.0 - (do not remove this comment)
(script# 100)
(include sci.sh)
(use n000)
(use n012)
(use n013)
(use n125)
(use n806)
(use n946)
(use n950)
(use n994)

(public
	rm100 0
)

(local
	theOnMeCheck
	local1
	local2
	local3
)
(instance rm100 of Rm
	(properties
		picture 100
	)
	
	(method (init)
		(if
			(or
				(and
					(== global130 1)
					(proc0_5 46)
					(proc0_5 45)
					(proc0_5 44)
					(not (Wat whichChar?))
				)
				(and (== global130 3) (proc0_5 54) (proc0_5 82))
				(and
					(== global130 4)
					(proc0_5 48)
					(proc0_5 47)
					(not (Wat whichChar?))
				)
				(and (== global130 7) (proc0_5 34) (proc0_5 35))
				(and
					(== global130 8)
					(proc0_5 58)
					(or
						(proc0_5 191)
						(and
							(not (proc0_5 191))
							(or
								(proc0_5 10)
								(proc0_5 160)
								(proc0_5 131)
								(> global155 42)
							)
						)
					)
				)
				(and
					(== global130 9)
					(or (proc0_5 145) (proc0_5 146))
				)
				(and (== global130 12) (proc0_5 27))
			)
			(global2 newRoom: 160)
		)
		(super init:)
		(= local3 global34)
		(= global34 0)
		(= local2
			(switch global87
				(0 40)
				(1 60)
				(2 80)
			))
		(proc0_6 4)
		(if
			(or
				(!= (gRgnMusic number?) 902)
				(not (gRgnMusic handle?))
				(not (gRgnMusic vol?))
			)
			(gRgnMusic number: 902 loop: -1 play:)
		)
		(town init:)
		(cottage init:)
		(monks init:)
		(willowGrove init:)
		(camp init:)
		(oakGrove init:)
		(if (proc0_5 137) (overlook init:))
		(proc806_3
			watlingStGood
			watlingStBad
			banner
			riverTrent
			riverLeene
			forestBad1
			forestBad2
			lion1
			lion2
			emblem1
			emblem2
			forestGood
		)
		(proc0_4)
		(proc806_6 0)
		((gIconBar at: 0) message: 11)
	)
	
	(method (doit)
		(++ local1)
		(cond 
			((proc0_5 70) (proc0_7 70) (proc13_4 1100 18))
			((== (mod local1 local2) 0) (Palette 6 240 247 -1))
		)
	)
	
	(method (dispose)
		(proc0_7 4)
		(gIconBar enable: 2 3 4 5 6 7)
		(= global34 local3)
		((gIconBar at: 0) message: 1)
		(super dispose:)
	)
)

(instance town of MapButton
	(properties
		x 146
		y 130
		heading 260
		lookStr 1
		view 100
		loop 5
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
				(or
					(and (== global130 9) (not (proc0_5 36)))
					(and (== global130 12) (not (proc0_5 38)))
				)
			)
			(proc13_4 1100 19 1)
			(pEvent claimed: 1)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance cottage of MapButton
	(properties
		x 209
		y 87
		heading 250
		lookStr 2
		view 100
		loop 2
	)
)

(instance monks of MapButton
	(properties
		x 117
		y 182
		heading 580
		lookStr 3
		view 100
		loop 4
	)
)

(instance willowGrove of MapButton
	(properties
		x 192
		y 111
		heading 210
		lookStr 4
		view 100
		loop 3
	)
)

(instance overlook of MapButton
	(properties
		x 196
		y 65
		heading 110
		lookStr 6
		view 100
		loop 6
	)
)

(instance camp of MapButton
	(properties
		x 214
		y 65
		heading 150
		lookStr 5
		view 100
		loop 1
	)
	
	(method (init)
		(if (proc0_5 137) (= x 218))
		(super init:)
	)
)

(instance oakGrove of MapButton
	(properties
		x 144
		y 74
		heading 180
		lookStr 7
		view 100
	)
)

(instance watlingStGood of Feature
	(properties
		onMeCheck $8000
		lookStr 8
	)
	
	(method (init)
		(= theOnMeCheck
			(= onMeCheck
				((Polygon new:)
					type: 0
					init:
						209
						25
						209
						28
						202
						31
						202
						36
						194
						45
						194
						58
						191
						63
						186
						70
						189
						73
						189
						77
						186
						76
						182
						91
						180
						93
						176
						112
						163
						110
						164
						108
						167
						103
						161
						95
						167
						89
						161
						82
						169
						78
						166
						70
						173
						64
						168
						58
						178
						55
						179
						42
						189
						36
						186
						33
						193
						28
						193
						22
					yourself:
				)
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(theOnMeCheck dispose:)
		(super dispose:)
	)
	
	(method (handleEvent pEvent &tmp watSection)
		(if (not (pEvent claimed?))
			(if
				(or
					(!= ((gIconBar curIcon?) message?) 11)
					(& (pEvent modifiers?) emSHIFT)
					(& (pEvent modifiers?) emCTRL)
				)
				(super handleEvent: pEvent)
			else
				(= watSection (Wat section?))
				(= onMeCheck 0)
				(if
					(or
						(and
							(= onMeCheck 2)
							(self onMe: pEvent)
							(Wat section: 1)
							(= global112 24)
						)
						(and
							(= onMeCheck 4)
							(self onMe: pEvent)
							(Wat section: 2)
							(= global112 39)
						)
						(and
							(= onMeCheck 8)
							(self onMe: pEvent)
							(Wat section: 3)
							(= global112 54)
						)
						(and
							(= onMeCheck 16)
							(self onMe: pEvent)
							(Wat section: 4)
							(= global112 70)
						)
						(and
							(= onMeCheck 32)
							(self onMe: pEvent)
							(Wat section: 5)
							(= global112 86)
						)
						(and
							(= onMeCheck 64)
							(self onMe: pEvent)
							(Wat section: 6)
							(= global112 101)
						)
						(and
							(= onMeCheck 128)
							(self onMe: pEvent)
							(Wat section: 7)
							(= global112 117)
						)
						(and
							(= onMeCheck 256)
							(self onMe: pEvent)
							(Wat section: 8)
							(= global112 133)
						)
						(and
							(= onMeCheck 512)
							(self onMe: pEvent)
							(Wat section: 9)
							(= global112 149)
						)
					)
					(if (>= (Wat section?) watSection)
						(Wat enterDir: 1)
					else
						(Wat enterDir: 3)
					)
					(if (== ((gIconBar curIcon?) message?) 11)
						(pEvent claimed: 1)
						(global2 newRoom: 120)
					)
				else
					(= onMeCheck theOnMeCheck)
				)
			)
		)
	)
)

(instance watlingStBad of Feature
	(properties
		lookStr 9
	)
	
	(method (init)
		(global2
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							160
							110
							178
							113
							173
							133
							184
							143
							187
							158
							182
							189
							165
							189
							175
							151
							167
							147
							167
							121
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
)

(instance riverTrent of Feature
	(properties
		lookStr 13
	)
	
	(method (init)
		(global2
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							89
							189
							91
							172
							131
							135
							148
							136
							183
							116
							222
							109
							240
							114
							240
							125
							218
							117
							183
							127
							165
							142
							135
							148
							124
							155
							133
							159
							154
							189
							138
							189
							119
							160
							100
							178
							100
							189
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
)

(instance riverLeene of Feature
	(properties
		lookStr 14
	)
	
	(method (init)
		(global2
			addObstacle:
				(= onMeCheck
					((Polygon new:)
						type: 0
						init:
							106
							26
							103
							46
							113
							60
							112
							75
							118
							83
							112
							92
							127
							112
							126
							123
							158
							131
							147
							136
							121
							131
							114
							122
							113
							110
							101
							99
							101
							87
							105
							82
							98
							73
							99
							59
							93
							45
							96
							28
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
)

(instance banner of Feature
	(properties
		nsLeft 80
		nsBottom 29
		nsRight 239
		lookStr 10
	)
)

(instance forestGood of Feature
	(properties
		nsTop 30
		nsLeft 80
		nsBottom 111
		nsRight 239
		lookStr 11
	)
	
	(method (handleEvent pEvent)
		(if
		(and (self onMe: pEvent) (not (pEvent claimed?)))
			(cond 
				(
					(or
						(!= ((gIconBar curIcon?) message?) 11)
						(& (pEvent modifiers?) emSHIFT)
						(& (pEvent modifiers?) emCTRL)
					)
					(super handleEvent: pEvent)
				)
				((== global12 220) (global2 newRoom: 220))
				(else (= global112 73) (global2 newRoom: 220))
			)
		)
	)
)

(instance forestBad1 of Feature
	(properties
		nsTop 110
		nsLeft 80
		nsBottom 190
		nsRight 239
		lookStr 12
	)
)

(instance forestBad2 of Feature
	(properties
		nsTop 110
		nsLeft 80
		nsBottom 190
		nsRight 239
		lookStr 12
	)
	
	(method (init)
		(= onMeCheck
			((Polygon new:)
				type: 0
				init:
					92
					39
					99
					60
					97
					74
					105
					83
					99
					88
					101
					101
					112
					110
					115
					133
					79
					133
					80
					121
					88
					110
					78
					107
					79
					84
					90
					84
					95
					76
					89
					54
				yourself:
			)
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
)

(instance emblem1 of Feature
	(properties
		nsTop 124
		nsBottom 189
		nsRight 80
		lookStr 15
	)
)

(instance emblem2 of Feature
	(properties
		nsTop 124
		nsLeft 239
		nsBottom 189
		nsRight 320
		lookStr 16
	)
)

(instance lion1 of Feature
	(properties
		nsTop 19
		nsBottom 124
		nsRight 81
		lookStr 17
	)
)

(instance lion2 of Feature
	(properties
		nsTop 19
		nsLeft 240
		nsBottom 124
		nsRight 319
		lookStr 17
	)
)
