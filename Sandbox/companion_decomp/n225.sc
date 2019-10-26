;;; Sierra Script 1.0 - (do not remove this comment)
(script# 225)
(include sci.sh)
(use n000)
(use n013)
(use n222)
(use n232)
(use n242)
(use n255)
(use n750)
(use n806)
(use n992)
(use n998)
(use n999)

(public
	proc225_0 0
	proc225_1 1
	proc225_2 2
	moveBushes 3
	liveBush 4
	treeClue 5
	dummyHint 6
	makeClue 7
	dumpClue 8
	dummyBush 9
)

(local
	[local0 8] = [7102 7108 7114 7119 7124 7134 7144 7154]
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	[newATree 4]
	[local20 96] = [34 121 260 227 45 164 163 285 49 34 199 267 34 124 201 214 48 88 185 198 41 84 163 288 35 120 254 219 49 174 147 284 58 42 164 295 76 180 259 221 38 177 142 280 40 87 164 272 23 114 221 297 47 170 256 289 52 143 102 189 53 183 215 280 42 167 167 293 27 86 136 238 53 178 291 -1 10 176 275 -1 32 264 161 -1 84 189 288 217 54 164 249 295 31 58 143 211]
	[local116 96] = [116 118 138 185 117 102 183 164 106 160 151 102 121 121 90 182 156 89 103 185 161 108 184 140 119 119 141 188 115 102 181 165 107 160 189 140 123 92 141 188 119 104 189 182 163 107 189 100 123 121 188 143 118 105 92 181 106 84 102 189 119 89 185 138 155 102 178 180 159 107 184 150 120 89 144 -1 116 102 134 -1 107 103 189 -1 127 95 147 187 121 108 93 186 164 113 89 159]
	[local212 4] = [0 1 0 1]
	[local216 24] = [174 314 27 0 0 161 305 307 173 287 65 -15 0 156 305 316 151 300 10 0 0 178 305 321]
	[local240 24] = [85 60 73 118 223 235 221 130 77 63 83 145 223 221 221 158 81 76 99 152 223 229 221 142]
	[newBerryBush 8]
	[local272 2] = [272 43]
	[local274 4] = [159 272 170 300]
	[local278 6] = [294 294 272 166 43 294]
	[local284 6] = [23 23 272 166 43 23]
	[local290 9] = [294 294 272 159 55 30 100 200 300]
	[local299 9] = [23 23 55 159 272 30 100 200 300]
	[local308 10] = [272 55 159 272 166 43 30 100 200 300]
	[local318 3] = [189 99 235]
	[local321 3] = [189 91 235]
	[local324 6] = [189 99 86 86 86 230]
	[local330 6] = [189 91 86 86 86 230]
	[local336 9] = [99 189 189 189 189 230 235 230 220]
	[local345 9] = [189 91 181 189 189 235 230 220 230]
	[local354 10] = [189 189 189 86 86 86 230 235 230 220]
	[local364 4] = [189 189 230 230]
	local368
	[local369 2]
)
(procedure (proc225_0 &tmp temp0)
	(switch (gClient picture?)
		(220 (= local14 0))
		(230 (= local14 4))
		(240 (= local14 8))
	)
	(cond 
		((== global112 34) (= local15 0))
		((== global112 66) (= local15 12))
		((== global112 114) (= local15 24))
		((or (== global112 53) (== global112 120)) (= local15 36))
		((or (== global112 132) (== global112 155)) (= local15 48))
		((or (== global112 22) (== global112 122)) (= local15 60))
		((or (== global112 88) (== global112 49)) (= local15 72))
		((== global112 20) (= local15 84))
	)
	(= temp0 0)
	(while (< temp0 4)
		((= [newATree temp0] (aTree new:))
			view:
				(cond 
					((or (== global112 132) (== global112 155)) 234)
					((== global112 34) 230)
					((or (== global112 53) (== global112 120)) 233)
					((== global112 66) 231)
					((== global112 20) 237)
					((== global112 114) 232)
					((or (== global112 22) (== global112 122)) 235)
					((or (== global112 88) (== global112 49)) 236)
				)
			loop: [local212 temp0]
			x: [local20 (+ temp0 local15 local14)]
			y: [local116 (+ temp0 local15 local14)]
		)
		(++ temp0)
	)
	(proc806_2
		[newATree 0]
		[newATree 1]
		[newATree 2]
		[newATree 3]
	)
)

(procedure (proc225_1)
	(cond 
		(
			(or
				(== global112 18)
				(== global112 33)
				(== global112 35)
			)
			(= local9 230)
		)
		(
			(or
				(== global112 51)
				(== global112 65)
				(== global112 82)
			)
			(= local9 231)
		)
		(
			(or
				(== global112 98)
				(== global112 115)
				(== global112 130)
			)
			(= local9 232)
		)
		(
			(or
				(== global112 52)
				(== global112 54)
				(== global112 69)
				(== global112 119)
				(== global112 121)
				(== global112 135)
				(== global112 137)
			)
			(= local9 233)
		)
		(
			(or
				(== global112 116)
				(== global112 117)
				(== global112 131)
				(== global112 133)
				(== global112 154)
			)
			(= local9 234)
		)
		(
			(or
				(== global112 23)
				(== global112 37)
				(== global112 38)
				(== global112 106)
				(== global112 138)
			)
			(= local9 235)
		)
		(
			(or
				(== global112 50)
				(== global112 67)
				(== global112 68)
				(== global112 72)
				(== global112 83)
				(== global112 85)
				(== global112 86)
				(== global112 89)
				(== global112 99)
				(== global112 100)
				(== global112 101)
				(== global112 104)
			)
			(= local9 236)
		)
		(
			(or
				(== global112 19)
				(== global112 21)
				(== global112 36)
			)
			(= local9 237)
		)
		(
			(or
				(== global112 136)
				(== global112 151)
				(== global112 153)
				(== global112 167)
			)
			(= local9 239)
		)
	)
	(switch (gClient curPic?)
		(220
			(cond 
				(
					(or
						(== global112 36)
						(== global112 38)
						(== global112 69)
						(== global112 82)
						(== global112 100)
						(== global112 104)
						(== global112 130)
						(== global112 138)
					)
					(= local11 0)
					(= local10 -1)
				)
				(
					(or
						(== global112 37)
						(== global112 99)
						(== global112 135)
						(== global112 167)
					)
					(= local11 1)
					(= local10 -1)
				)
				((or (== global112 101) (== global112 137)) (= local11 2) (= local10 -1))
				(
					(or
						(== global112 21)
						(== global112 23)
						(== global112 35)
						(== global112 50)
						(== global112 54)
						(== global112 85)
						(== global112 86)
						(== global112 89)
						(== global112 115)
						(== global112 121)
						(== global112 133)
						(== global112 153)
					)
					(= local11 3)
					(= local10 -1)
				)
				((or (== global112 51) (== global112 117)) (= local11 4) (= local10 15))
				(
					(or
						(== global112 18)
						(== global112 68)
						(== global112 72)
						(== global112 98)
						(== global112 106)
						(== global112 116)
						(== global112 136)
					)
					(= local11 5)
					(= local10 15)
				)
				((== global112 67) (= local11 6) (= local10 15))
				(
					(or
						(== global112 19)
						(== global112 33)
						(== global112 52)
						(== global112 65)
						(== global112 83)
						(== global112 119)
						(== global112 131)
						(== global112 151)
						(== global112 154)
					)
					(= local11 7)
					(= local10 -1)
				)
			)
		)
		(230
			(cond 
				(
					(or
						(== global112 36)
						(== global112 38)
						(== global112 69)
						(== global112 82)
						(== global112 100)
						(== global112 104)
						(== global112 130)
						(== global112 138)
					)
					(= local11 8)
					(= local10 -1)
				)
				(
					(or
						(== global112 37)
						(== global112 99)
						(== global112 135)
						(== global112 167)
					)
					(= local11 9)
					(= local10 -1)
				)
				((or (== global112 101) (== global112 137)) (= local11 10) (= local10 -1))
				(
					(or
						(== global112 21)
						(== global112 23)
						(== global112 35)
						(== global112 50)
						(== global112 54)
						(== global112 85)
						(== global112 86)
						(== global112 89)
						(== global112 115)
						(== global112 121)
						(== global112 133)
						(== global112 153)
					)
					(= local11 11)
					(= local10 -1)
				)
				((or (== global112 51) (== global112 117)) (= local11 12) (= local10 15))
				(
					(or
						(== global112 18)
						(== global112 68)
						(== global112 72)
						(== global112 98)
						(== global112 106)
						(== global112 116)
						(== global112 136)
					)
					(= local11 13)
					(= local10 15)
				)
				((== global112 67) (= local11 14) (= local10 15))
				(
					(or
						(== global112 19)
						(== global112 33)
						(== global112 52)
						(== global112 65)
						(== global112 83)
						(== global112 119)
						(== global112 131)
						(== global112 151)
						(== global112 154)
					)
					(= local11 15)
					(= local10 -1)
				)
			)
		)
		(240
			(cond 
				(
					(or
						(== global112 36)
						(== global112 38)
						(== global112 69)
						(== global112 82)
						(== global112 100)
						(== global112 104)
						(== global112 130)
						(== global112 138)
					)
					(= local11 16)
					(= local10 -1)
				)
				(
					(or
						(== global112 37)
						(== global112 99)
						(== global112 135)
						(== global112 167)
					)
					(= local11 17)
					(= local10 -1)
				)
				((or (== global112 101) (== global112 137)) (= local11 18) (= local10 -1))
				(
					(or
						(== global112 21)
						(== global112 23)
						(== global112 35)
						(== global112 50)
						(== global112 54)
						(== global112 85)
						(== global112 86)
						(== global112 89)
						(== global112 115)
						(== global112 121)
						(== global112 133)
						(== global112 153)
					)
					(= local11 19)
					(= local10 -1)
				)
				((or (== global112 51) (== global112 117)) (= local11 20) (= local10 15))
				(
					(or
						(== global112 18)
						(== global112 68)
						(== global112 72)
						(== global112 98)
						(== global112 106)
						(== global112 116)
						(== global112 136)
					)
					(= local11 21)
					(= local10 15)
				)
				((== global112 67) (= local11 22) (= local10 15))
				(
					(or
						(== global112 19)
						(== global112 33)
						(== global112 52)
						(== global112 65)
						(== global112 83)
						(== global112 119)
						(== global112 131)
						(== global112 151)
						(== global112 154)
					)
					(= local11 23)
					(= local10 -1)
				)
			)
		)
	)
	((= [newATree 0] (aTree new:))
		view: local9
		priority: local10
		x: [local216 local11]
		y:
			(if
				(or
					(== global112 18)
					(== global112 68)
					(== global112 72)
					(== global112 98)
					(== global112 106)
					(== global112 116)
					(== global112 136)
				)
				(switch local9
					(232 205)
					(233 229)
					(234 249)
					(236 253)
					(237 209)
					(239 249)
					(else  221)
				)
			else
				[local240 local11]
			)
		signal: 16400
	)
	(proc806_2 [newATree 0])
)

(procedure (proc225_2 &tmp temp0)
	(cond 
		(
			(or
				(== global112 3)
				(== global112 4)
				(== global112 5)
				(== global112 6)
				(== global112 24)
				(== global112 25)
				(== global112 26)
			)
			(= local368 2)
			(= local12 166)
			(= local13 86)
		)
		(
			(or
				(== global112 147)
				(== global112 148)
				(== global112 149)
				(== global112 168)
				(== global112 169)
				(== global112 170)
				(== global112 182)
			)
			(= local368 4)
			(= local12 55)
			(= local13 189)
		)
		(
			(or
				(== global112 43)
				(== global112 91)
				(== global112 107)
				(== global112 123)
				(== global112 139)
			)
			(= local368 3)
			(= local12 294)
			(= local13 145)
		)
		(
			(or
				(== global112 48)
				(== global112 81)
				(== global112 97)
				(== global112 113)
			)
			(= local368 3)
			(= local12 23)
			(= local13 132)
		)
		(
			(or
				(== global112 7)
				(== global112 27)
				(== global112 60)
			)
			(= local368 6)
			(= local12 294)
			(= local13 145)
		)
		(
			(or
				(== global112 2)
				(== global112 17)
				(== global112 32)
			)
			(= local368 6)
			(= local12 23)
			(= local13 132)
		)
		(
			(or
				(== global112 76)
				(== global112 171)
				(== global112 183)
			)
			(= local368 9)
			(= local12 294)
			(= local13 145)
		)
		(
			(or
				(== global112 64)
				(== global112 129)
				(== global112 146)
			)
			(= local368 9)
			(= local12 23)
			(= local13 132)
		)
		((== global112 156) (= local368 10) (= local12 294) (= local13 132))
	)
	(liveBush posn: local12 local13 signal: 16449 init:)
	(= temp0 0)
	(while (< temp0 local368)
		((= [newBerryBush temp0] (berryBush new:))
			x:
				(cond 
					(
						(or
							(== global112 3)
							(== global112 4)
							(== global112 5)
							(== global112 6)
							(== global112 24)
							(== global112 25)
							(== global112 26)
						)
						(+ [local272 temp0] (Random -3 3))
					)
					(
						(or
							(== global112 147)
							(== global112 148)
							(== global112 149)
							(== global112 168)
							(== global112 169)
							(== global112 170)
							(== global112 182)
						)
						(+ [local274 temp0] (Random -3 3))
					)
					(
						(or
							(== global112 43)
							(== global112 91)
							(== global112 107)
							(== global112 123)
							(== global112 139)
						)
						(Random 292 295)
					)
					(
						(or
							(== global112 48)
							(== global112 81)
							(== global112 97)
							(== global112 113)
						)
						(Random 20 24)
					)
					(
						(or
							(== global112 7)
							(== global112 27)
							(== global112 60)
						)
						[local278 temp0]
					)
					(
						(or
							(== global112 2)
							(== global112 17)
							(== global112 32)
						)
						[local284 temp0]
					)
					(
						(or
							(== global112 76)
							(== global112 171)
							(== global112 183)
						)
						[local290 temp0]
					)
					(
						(or
							(== global112 64)
							(== global112 129)
							(== global112 146)
						)
						[local299 temp0]
					)
					((== global112 156) [local308 temp0])
				)
			y:
				(cond 
					(
						(or
							(== global112 3)
							(== global112 4)
							(== global112 5)
							(== global112 6)
							(== global112 24)
							(== global112 25)
							(== global112 26)
						)
						86
					)
					(
						(or
							(== global112 147)
							(== global112 148)
							(== global112 149)
							(== global112 168)
							(== global112 169)
							(== global112 170)
							(== global112 182)
						)
						[local364 temp0]
					)
					(
						(or
							(== global112 43)
							(== global112 91)
							(== global112 107)
							(== global112 123)
							(== global112 139)
						)
						(+ [local318 temp0] (Random -2 2))
					)
					(
						(or
							(== global112 48)
							(== global112 81)
							(== global112 97)
							(== global112 113)
						)
						(+ [local321 temp0] (Random -2 2))
					)
					(
						(or
							(== global112 7)
							(== global112 27)
							(== global112 60)
						)
						[local324 temp0]
					)
					(
						(or
							(== global112 2)
							(== global112 17)
							(== global112 32)
						)
						[local330 temp0]
					)
					(
						(or
							(== global112 76)
							(== global112 171)
							(== global112 183)
						)
						[local336 temp0]
					)
					(
						(or
							(== global112 64)
							(== global112 129)
							(== global112 146)
						)
						[local345 temp0]
					)
					((== global112 156) [local354 temp0])
				)
			init:
		)
		(global10 add: [newBerryBush temp0])
		(++ temp0)
	)
	(global10 doit:)
)

(instance berryBush of PicView
	(properties
		view 238
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (gNewCast contains: treeClue)
					(treeClue dispose:)
				else
					(gEgo setScript: makeClue 0 (self view?))
				)
			)
			(3
				(if (proc0_5 129)
					(proc13_4 1225 0 0)
				else
					(proc13_4 1225 1 0)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance liveBush of Actor
	(properties
		yStep 8
		view 238
		illegalBits $0000
		xStep 8
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (gNewCast contains: treeClue)
					(treeClue dispose:)
				else
					(self setScript: makeClue 0 (self view?))
				)
			)
			(3
				(if (proc0_5 129)
					(proc13_4 1225 0 0)
				else
					(proc13_4 1225 1 0)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance dummyBush of PicView
	(properties)
	
	(method (init)
		(self
			view: 238
			priority: (liveBush priority?)
			signal: 16
			x: (liveBush x?)
			y: (liveBush y?)
		)
		(super init:)
	)
)

(instance aHint of PicView
	(properties
		priority 15
		signal $4010
	)
	
	(method (doVerb theVerb param2)
		(super doVerb: theVerb &rest)
	)
)

(instance dummyHint of PicView
	(properties)
	
	(method (init)
		(self
			view: (treeClue view?)
			loop: (treeClue loop?)
			cel: (treeClue cel?)
			x: (treeClue x?)
			y: (treeClue y?)
			priority: (treeClue priority?)
		)
		(super init:)
	)
)

(instance treeClue of View
	(properties
		cel 1
		priority 15
	)
	
	(method (init)
		(gMH add: self)
		(gKH add: self)
		(super init:)
	)
	
	(method (dispose)
		(gMH delete: self)
		(gKH delete: self)
		(super dispose:)
	)
	
	(method (handleEvent pEvent)
		(if
			(and
				(== (pEvent modifiers?) 0)
				(or
					(== (pEvent type?) evMOUSEBUTTON)
					(== (pEvent type?) evKEYBOARD)
				)
			)
			(self dispose:)
			(pEvent claimed?)
		else
			(super handleEvent: pEvent)
		)
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(gEgo setScript: dumpClue)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance makeClue of Script
	(properties)
	
	(method (changeState newState &tmp [temp0 32])
		(switch (= state newState)
			(0
				(cond 
					(
						(or
							(== global112 36)
							(== global112 38)
							(== global112 69)
							(== global112 82)
							(== global112 100)
							(== global112 104)
							(== global112 130)
							(== global112 138)
						)
						(= local8 0)
					)
					(
						(or
							(== global112 18)
							(== global112 68)
							(== global112 72)
							(== global112 98)
							(== global112 106)
							(== global112 116)
							(== global112 136)
						)
						(= local8 1)
					)
					(
						(or
							(== global112 19)
							(== global112 33)
							(== global112 52)
							(== global112 65)
							(== global112 83)
							(== global112 119)
							(== global112 131)
							(== global112 151)
							(== global112 154)
						)
						(= local8 2)
					)
					(
						(or
							(== global112 21)
							(== global112 23)
							(== global112 35)
							(== global112 50)
							(== global112 54)
							(== global112 85)
							(== global112 86)
							(== global112 89)
							(== global112 115)
							(== global112 121)
							(== global112 133)
							(== global112 153)
						)
						(= local8 3)
					)
					(
						(or
							(== global112 37)
							(== global112 99)
							(== global112 135)
							(== global112 167)
						)
						(= local8 4)
					)
					((or (== global112 101) (== global112 137)) (= local8 5))
					((== global112 67) (= local8 6))
					((or (== global112 51) (== global112 117)) (= local8 7))
				)
				(treeClue
					view: register
					x:
						(switch register
							(230 57)
							(231 27)
							(232 31)
							(233 45)
							(234 35)
							(235 39)
							(236 28)
							(237 38)
							(238 41)
							(239 35)
						)
					y:
						(switch register
							(230 57)
							(231 58)
							(232 39)
							(233 57)
							(234 70)
							(235 54)
							(236 56)
							(237 65)
							(238 76)
							(239 71)
						)
					signal: 16400
					init:
				)
				(= ticks 6)
			)
			(1
				(if
					(or
						(== global112 116)
						(== global112 117)
						(== global112 131)
						(== global112 133)
						(== global112 154)
						(== global112 18)
						(== global112 33)
						(== global112 35)
						(== global112 52)
						(== global112 54)
						(== global112 69)
						(== global112 119)
						(== global112 121)
						(== global112 135)
						(== global112 137)
						(== global112 51)
						(== global112 65)
						(== global112 82)
						(== global112 19)
						(== global112 21)
						(== global112 36)
						(== global112 98)
						(== global112 115)
						(== global112 130)
						(== global112 23)
						(== global112 37)
						(== global112 38)
						(== global112 106)
						(== global112 138)
						(== global112 50)
						(== global112 67)
						(== global112 68)
						(== global112 72)
						(== global112 83)
						(== global112 85)
						(== global112 86)
						(== global112 89)
						(== global112 99)
						(== global112 100)
						(== global112 101)
						(== global112 104)
						(== global112 136)
						(== global112 151)
						(== global112 153)
						(== global112 167)
					)
					(proc255_0
						(Format @temp0 225 0 [local0 local8])
						67
						100
						15
						70
						180
						25
						4
					)
				)
				(treeClue signal: (| (treeClue signal?) $0041))
				(self dispose:)
			)
		)
	)
)

(instance dumpClue of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(treeClue signal: (& (treeClue signal?) $ffbe))
				(= ticks 6)
			)
			(1
				(treeClue dispose:)
				(self dispose:)
			)
		)
	)
)

(instance aTree of PicView
	(properties
		signal $4000
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (gNewCast contains: treeClue)
					(gEgo setScript: dumpClue)
				else
					(gEgo setScript: makeClue 0 (self view?))
				)
			)
			(3 (proc13_4 1225 2 1))
			(5 (proc13_4 1225 3 1))
			(10 (proc13_4 1225 4 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance dummyLiveBush of PicView
	(properties)
	
	(method (init)
		(self
			view: (liveBush view?)
			loop: (liveBush loop?)
			cel: (liveBush cel?)
			signal: 16384
			x: (liveBush x?)
			y: (liveBush y?)
		)
		(super init:)
	)
)

(instance moveBushes of Script
	(properties)
	
	(method (dispose)
		(super dispose:)
		(DisposeScript 225)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (gClient obstacles?)
					((gClient obstacles?) dispose:)
				)
				(gClient obstacles: 0)
				(liveBush signal: (& (liveBush signal?) $ffbe))
				(= cycles 12)
			)
			(1
				(liveBush
					setMotion: MoveTo ([newBerryBush 0] x?) ([newBerryBush 0] y?) self
				)
			)
			(2
				(liveBush signal: (| (liveBush signal?) $0041))
				(switch (gClient picture?)
					(220 (proc222_0))
					(230 (proc232_0))
					(240 (proc242_0))
				)
				(= global124 53)
				(proc0_4)
				(proc806_6 0)
				(dummyLiveBush init:)
				(global10 add: dummyLiveBush)
				(= seconds 5)
			)
			(3
				(gSFX number: 401 loop: -1 play:)
				(gIconBar disable: 5)
				(liveBush dispose: delete:)
				(proc750_1)
				(global10 eachElementDo: #dispose release:)
				(self dispose:)
			)
		)
	)
)
