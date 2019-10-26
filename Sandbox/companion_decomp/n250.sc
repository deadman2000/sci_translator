;;; Sierra Script 1.0 - (do not remove this comment)
(script# 250)
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
(use n989)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm250 0
)

(local
	theBoysSaved
	[local1 80]
	local81
	local82
	local83
	local84
	local85
	[local86 2]
	local88
	[local89 9] = [1250 0 1 3 1 2 1 2]
	[local98 8] = [1250 6 3 1 4 2 4]
	[local106 5] = [1250 11 2 1]
	[local111 14] = [1250 13 3 4 5 2 2 2 1 2 3 2 2]
	[local125 6] = [1250 24 2 2 1]
	[local131 11] = [1250 27 2 3 4 1 2 1 2 2]
	[local142 8] = [1250 35 1 2 3 2 2]
	[local150 7] = [1250 40 2 2 1 1]
	[local157 8] = [1250 145 2 2 2 2 2]
	[local165 6] = [1250 183 2 1 2]
	[local171 6] = [1250 164 2 1 2]
	[local177 4] = [1250 178 1]
	[local181 4] = [1250 179 1]
	[local185 6] = [1250 167 2 1 2]
	[local191 6] = [1250 170 2 1 2]
	[local197 4] = [1250 174 1]
	[local201 4] = [1250 175 1]
	[local205 4] = [1250 176 1]
	[local209 4] = [1250 152 1]
	[local213 4] = [1250 154 1]
	[local217 4] = [1250 155 1]
	[local221 4] = [1250 158 1]
	[local225 4] = [1250 159 1]
	[local229 4] = [1250 156 1]
	[local233 8] = [1250 157 1 0 1250 160 1]
	[local241 4] = [1250 161 1]
	[local245 5] = [1250 55 2 1]
	[local250 4] = [1250 57 1]
	[local254 5] = [1250 58 2 1]
	[local259 4] = [1250 60 1]
	[local263 6] = [1250 61 2 1 2]
	[local269 4] = [1250 64 1]
	[local273 11] = [1250 65 1 2 1 2 1 2 1 2]
	[local284 4] = [1250 73 1]
	[local288 8] = [1250 74 2 1 2 1 2]
	[local296 5] = [1250 89 1 2]
	[local301 4] = [1250 224 1]
	[local305 10] = [1250 79 2 1 2 2 2 1 2]
	[local315 6] = [1250 86 1 2 1]
	[local321 4] = [1250 91 1]
	[local325 4] = [1250 92 1]
	[local329 6] = [1250 93 2 1 2]
	[local335 4] = [1250 96 1]
	[local339 11] = [1250 97 1 2 1 2 2 1 2 2]
	[local350 4] = [1250 105 1]
	[local354 8] = [1250 106 1 2 2 1 2]
	[local362 4] = [1250 111 1]
	[local366 10] = [1250 112 2 1 2 1 2 1 1]
	[local376 4] = [1250 121 1]
	[local380 4] = [1250 122 1]
	[local384 4] = [1250 123 1]
	[local388 4] = [1250 124 1]
	[local392 4] = [1250 125 1]
	[local396 4] = [1250 126 1]
	[local400 5] = [1250 127 1 2]
	[local405 6] = [1250 129 2 1 2]
	[local411 4] = [1250 132 1]
	[local415 8] = [1250 133 1 0 1250 143 1]
	[local423 6] = [1250 134 2 1 2]
	[local429 5] = [1250 137 2 1]
	[local434 6] = [1250 139 2 1 2]
	[local440 4] = [1250 142 1]
	[local444 4] = [1250 143 1]
	[local448 4] = [1250 144 1]
	[local452 8] = [1250 44 2 1 3 2 1]
	[local460 8] = [1250 196 2 1 2 2 1]
	[local468 4] = [1250 190 1]
	[local472 7] = [1250 192 1 2 2 1]
	[local479 17] = [1250 187 1 0 1250 201 1 0 1250 202 1 0 1250 220 1 2]
	[local496 4] = [1250 225 1]
	[local500 9] = [253 0 2 4 21 37 19 27 10]
	[local509 9] = [-1 12624 12]
	[local518 9] = [-1 12628 11]
	[local527 27] = [-1 12632 13 0 0 0 0 0 0 -1 12639 0 0 0 0 0 0 0 -1 12650 24]
	[local554 9] = [-1 12662 32]
)
(instance rm250 of Rm
	(properties
		picture 250
		style $0064
		horizon 105
	)
	
	(method (init)
		(proc958_0 128 250 252 253 254)
		(gEgo actions: widowBlow)
		(super init:)
		(proc0_4)
		(cond 
			((or (== global12 270) (== global12 179))
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init:
								(+ (widow x?) 40)
								(- (widow y?) 4)
								(+ (widow x?) 28)
								(+ (widow y?) 4)
								(- (widow x?) 14)
								(+ (widow y?) 4)
								(- (widow x?) 25)
								(+ (widow y?) 11)
								(- (widow x?) 67)
								(+ (widow y?) 11)
								(- (widow x?) 83)
								(+ (widow y?) 5)
								(- (widow x?) 78)
								(- (widow y?) 2)
								(- (widow x?) 38)
								(- (widow y?) 13)
								(+ (widow x?) 28)
								(- (widow y?) 13)
							yourself:
						)
				)
				(proc0_2 0 0 1)
				(= gNewGuise 0)
				(hal init:)
				(hob init:)
				(dicken init:)
				(widow loop: 2 init:)
				(= gGEgoEdgeHit 2)
				(= gGEgoY 170)
				(= theBoysSaved boysSaved)
			)
			(
				(or
					(== global130 1)
					(== global130 2)
					(== global130 3)
					(== global130 4)
					(== global130 7)
					(== global130 9)
				)
				(if (and (== global130 1) (not (proc0_5 45)))
					(gClient
						addObstacle:
							((Polygon new:)
								type: 2
								init:
									(+ (widow x?) 40)
									(- (widow y?) 4)
									(+ (widow x?) 28)
									(+ (widow y?) 4)
									(- (widow x?) 14)
									(+ (widow y?) 4)
									(- (widow x?) 25)
									(+ (widow y?) 11)
									(- (widow x?) 61)
									(+ (widow y?) 11)
									(- (widow x?) 75)
									(+ (widow y?) 5)
									(- (widow x?) 67)
									(- (widow y?) 2)
									(- (widow x?) 38)
									(- (widow y?) 13)
									(+ (widow x?) 28)
									(- (widow y?) 13)
								yourself:
							)
					)
					(hal init:)
					(hob init:)
					(dicken init:)
					(= theBoysSaved firstTime)
				else
					(gClient
						addObstacle:
							((Polygon new:)
								type: 2
								init:
									(+ (widow x?) 40)
									(- (widow y?) 4)
									(+ (widow x?) 26)
									(+ (widow y?) 4)
									(- (widow x?) 28)
									(+ (widow y?) 4)
									(- (widow x?) 60)
									(- (widow y?) 4)
									(- (widow x?) 28)
									(- (widow y?) 9)
									(+ (widow x?) 26)
									(- (widow y?) 9)
								yourself:
							)
					)
					(= theBoysSaved handOut)
				)
				(widow loop: 0 init:)
			)
			(
				(and
					(== global130 5)
					(== gNewGuise 0)
					(not (proc0_5 111))
				)
				(gClient
					addObstacle:
						((Polygon new:)
							type: 2
							init:
								(+ (widow x?) 60)
								(- (widow y?) 4)
								(+ (widow x?) 50)
								(+ (widow y?) 4)
								(- (widow x?) 30)
								(+ (widow y?) 4)
								(- (widow x?) 40)
								(- (widow y?) 4)
								(- (widow x?) 30)
								(- (widow y?) 10)
								(+ (widow x?) 50)
								(- (widow y?) 10)
							yourself:
						)
				)
				(widow loop: 1 init:)
				(ScriptID 23)
				((ScriptID 23)
					posn: (+ (widow x?) 22) (- (widow y?) 3)
					loop: 2
					detailLevel: 2
					actions: tuckActions
					init:
				)
				(proc0_6 111)
				(= theBoysSaved boysBusted)
			)
			((== global130 10)
				(if (not (proc0_5 52))
					(gClient
						addObstacle:
							((Polygon new:)
								type: 2
								init:
									(+ (widow x?) 25)
									(- (widow y?) 3)
									(+ (widow x?) 16)
									(+ (widow y?) 4)
									(- (widow x?) 15)
									(+ (widow y?) 4)
									(- (widow x?) 24)
									(- (widow y?) 3)
									(- (widow x?) 15)
									(- (widow y?) 12)
									(+ (widow x?) 16)
									(- (widow y?) 12)
								yourself:
							)
					)
					(widow loop: 2 init:)
					(proc0_6 52)
				)
				(= theBoysSaved handOut)
			)
			(else (= theBoysSaved handOut))
		)
		(gSFX number: 151 loop: -1 play:)
		(cond 
			((== local84 0) (gRgnMusic number: 905))
			(
				(and
					(or (== global130 5) (== global130 6))
					(not (proc0_5 125))
				)
				(gRgnMusic number: 251)
			)
			(else (gRgnMusic number: 250))
		)
		(gRgnMusic loop: -1 play:)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 299 118 261 129 220 123 157 134 71 107 89 103 69 95 161 85
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 61 124 49 135 0 144 0 123 29 120
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 0 114 0 96 28 99 38 107
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 319 101 276 85 260 86 249 73 319 64
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 132 189 186 175 272 141 294 135 319 135 319 189
					yourself:
				)
		)
		(switch gNewGuise
			(1 (= local82 7))
			(5 (= local82 9))
			(6 (= local82 8))
			(4 (= local82 6))
			(2 (= local82 4))
			(3 (= local82 5))
			(else  (= local82 1))
		)
		(if (gNewCast contains: widow)
			(smoke init:)
			(lamb init:)
			(proc806_3
				roof
				theWoods
				eastWall
				midWall
				westWall
				door
				chimney
				rock
				stream
			)
		else
			(proc806_3
				roof
				theWoods
				eastWall
				midWall
				westWall
				door
				chimney
				rock
				stream
				noGoat
			)
		)
		(gEgo setScript: egoEnters)
		(gClient setScript: theBoysSaved)
	)
	
	(method (doit)
		(++ local81)
		(if
		(and (> (global1 detailLevel:) 2) (not (proc0_5 115)))
			(Palette 6 240 250 1)
			(cond 
				((and local84 (== (mod local81 65) 0)) (widow setCycle: End widow))
				((and local83 (== (mod local81 90) 0)) (lamb setCycle: End lamb))
				((and local85 (== (mod local81 147) 0)) (hal setCel: (if (hal cel?) 0 else 1)))
				((and local85 (== (mod local81 153) 0)) (hob setCel: (if (hob cel?) 0 else 1)))
				((and local85 (== (mod local81 178) 0)) (dicken setCel: (if (dicken cel?) 0 else 1)))
			)
		)
		(cond 
			((gEgo script?))
			((and (proc0_5 110) (== global130 9)) (proc0_7 110) (proc851_0 1 @local496 @local500 0))
			((= gGEgoEdgeHit (gEgo edgeHit?)) (gEgo setScript: walkOut 0 gGEgoEdgeHit))
		)
		(super doit:)
	)
	
	(method (dispose)
		(gRgnMusic fade: 0 20 12 1)
		(gSFX stop:)
		(baaSound dispose:)
		(proc0_6 45)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1250 223 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance hal of Prop
	(properties
		x 91
		y 143
		view 254
		loop 2
		signal $4000
		detailLevel 2
	)
	
	(method (init)
		(= local85 1)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 173 1))
			(3 (proc13_4 1250 162 1))
			(5
				(proc851_0 1 @local197 @local518 0 0)
			)
			(10 (proc13_4 1250 163 1))
			(4
				(switch param2
					(1
						(proc851_0 1 @local201 @local518 0 0)
					)
					(0
						(proc851_0 1 @local205 @local518 0 0)
					)
					(else  (super doVerb:))
				)
			)
			(else  (super doVerb:))
		)
	)
)

(instance hob of Prop
	(properties
		x 81
		y 148
		view 254
		loop 1
		signal $4000
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 177 1))
			(3 (proc13_4 1250 162 1))
			(5
				(proc851_0 1 @local177 @local509 0 0)
			)
			(10 (proc13_4 1250 163 1))
			(4
				(switch param2
					(1
						(proc851_0 1 @local181 @local509 0 0)
					)
					(0
						(gClient setScript: giveHobBuck)
					)
					(else  (super doVerb:))
				)
			)
			(else  (super doVerb:))
		)
	)
)

(instance dicken of Prop
	(properties
		x 66
		y 153
		view 254
		signal $4000
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 180 1))
			(3 (proc13_4 1250 162 1))
			(5
				(self setScript: talkToDicky)
			)
			(10 (proc13_4 1250 163 1))
			(4
				(switch param2
					(1
						(gClient setScript: giveDickHorn)
					)
					(0
						(gClient setScript: giveDickBuck)
					)
					(else  (super doVerb:))
				)
			)
			(else  (super doVerb:))
		)
	)
)

(instance widow of Prop
	(properties
		x 120
		y 149
		view 252
		signal $5000
		detailLevel 2
	)
	
	(method (init)
		(= local84 1)
		(if (== (self loop?) 0) (self setCycle: Fwd))
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(switch global130
					(1 (proc13_4 1250 49 1))
					(2 (proc13_4 1250 50 1))
					(3 (proc13_4 1250 50 1))
					(4 (proc13_4 1250 50 1))
					(5 (proc13_4 1250 51 1))
					(6
						(if (proc0_5 25)
							(proc13_4 1250 50 1)
						else
							(proc13_4 1250 51 1)
						)
					)
					(9 (proc13_4 1250 52 1))
					(10 (proc13_4 1250 53 1))
					(else  (proc13_4 1250 52 1))
				)
			)
			(3 (proc13_4 1250 54 1))
			(5
				(switch global130
					(1
						(cond 
							((not (proc0_5 45))
								(proc0_6 45)
								(proc851_0 2 @local245 local82 0 @local500 1)
							)
							((proc0_5 66) (proc851_0 1 @local250 @local500 0))
							(else
								(proc0_6 66)
								(proc851_0 2 @local254 local82 0 @local500 1)
							)
						)
					)
					(2
						(if (proc0_5 66)
							(if (== gNewGuise 0)
								(proc851_0 1 @local259 @local500 0)
							else
								(proc851_0 2 @local263 local82 0 @local500 1)
							)
						else
							(proc0_6 66)
							(proc851_0 1 @local269 @local500 0)
						)
					)
					(5
						(proc851_0 1 @local284 @local500 0)
						(proc0_6 66)
					)
					(6
						(if (not (proc0_5 25))
							(proc851_0 1 @local284 @local500 0)
							(proc0_6 66)
						)
					)
					(7
						(switch gNewGuise
							(0
								(cond 
									(
										(and
											(not (proc0_5 42))
											(not (gEgo has: 4))
											(proc0_5 34)
										)
										(gEgo setScript: getNetAfterMary)
									)
									(
										(and
											(not (proc0_5 42))
											(not (gEgo has: 4))
											(not (proc0_5 34))
										)
										(proc0_6 66)
										(gEgo setScript: getTheNetJerk)
									)
									((proc0_5 34) (proc851_0 1 @local301 @local500 0))
									((proc0_5 66) (proc851_0 2 @local296 local82 0 @local500 1))
									(else
										(proc0_6 66)
										(proc851_0 2 @local288 local82 0 @local500 1)
									)
								)
							)
							(6
								(proc851_0 1 @local321 @local500 0)
							)
							(5
								(proc851_0 1 @local321 @local500 0)
							)
						)
					)
					(9
						(switch gNewGuise
							(0
								(if (proc0_5 66)
									(proc851_0 1 @local325 @local500 0)
								else
									(proc0_6 66)
									(proc851_0 2 @local329 local82 0 @local500 1)
								)
							)
							(6
								(proc851_0 1 @local321 @local500 0)
							)
							(5
								(proc851_0 1 @local321 @local500 0)
							)
							(3
								(proc851_0 1 @local335 @local500 0)
							)
							(2
								(proc851_0 1 @local335 @local500 0)
							)
							(4
								(if (proc0_5 66)
									(proc851_0 1 @local350 @local500 0)
								else
									(proc0_6 66)
									(proc851_0 2 @local354 local82 0 @local500 1)
								)
							)
						)
					)
					(10
						(if (proc0_5 66)
							(proc851_0 1 @local362 @local500 0)
						else
							(proc0_6 66)
							(proc851_0 2 @local366 local82 0 @local500 1)
						)
					)
					(else 
						(proc851_0 1 @local250 @local500 0)
					)
				)
			)
			(10 (proc13_4 1250 119 1))
			(4
				(if (== (widow loop?) 1)
					(proc13_4 1250 120 1)
				else
					(switch param2
						(1
							(proc851_0 1 @local376 @local500 0)
						)
						(0
							(proc851_0 1 @local380 @local500 0)
						)
						(2
							(proc851_0 1 @local384 @local500 0)
						)
						(3
							(proc851_0 1 @local388 @local500 0)
						)
						(15
							(proc851_0 1 @local392 @local500 0)
						)
						(14
							(proc851_0 1 @local396 @local500 0)
						)
						(12
							(if (gEgo has: 10)
								(proc851_0 2 @local400 local82 0 @local500 1)
								(gEgo put: 12)
							else
								(proc851_0 2 @local405 local82 0 @local500 1)
							)
						)
						(10
							(proc851_0 1 @local411 @local500 0)
						)
						(13
							(proc851_0 1 @local415 @local500 0)
						)
						(17
							(proc851_0 2 @local423 local82 0 @local500 1)
						)
						(16
							(if (gEgo has: 10)
								(proc851_0 2 @local429 local82 0 @local500 1)
							else
								(proc851_0 2 @local434 local82 0 @local500 1)
							)
						)
						(18
							(proc851_0 1 @local440 @local500 0)
						)
						(4
							(if (proc0_5 66)
								(proc851_0 1 @local444 @local500 0)
							else
								(proc0_6 66)
								(proc851_0 1 @local448 @local500 0)
							)
						)
						(else  (super doVerb: theVerb))
					)
				)
			)
		)
	)
	
	(method (cue)
		(self setCycle: Beg)
	)
)

(instance tuckActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1250 203 1) 1)
			(3 (proc13_4 1250 204 1) 1)
			(5
				(proc851_0 1 @local479 15 0 0)
				1
			)
		)
	)
)

(instance lamb of Prop
	(properties
		x 242
		y 122
		view 250
		signal $4041
		detailLevel 2
	)
	
	(method (init)
		(= local83 1)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 151 1))
			(3
				(proc851_0 1 @local209 @local554 0 0)
			)
			(5
				(gClient setScript: mouthyLamb)
			)
			(10 (proc13_4 1250 153 1))
			(4
				(switch param2
					(1
						(proc851_0 1 @local213 @local554 0 0)
					)
					(0
						(proc851_0 1 @local217 @local554 0 0)
					)
					(2
						(proc851_0 1 @local213 @local554 0 0)
					)
					(14
						(proc851_0 1 @local213 @local554 0 0)
					)
					(12
						(proc851_0 1 @local213 @local554 0 0)
					)
					(10
						(proc851_0 1 @local213 @local554 0 0)
					)
					(3
						(proc851_0 1 @local229 @local554 0 0)
					)
					(15
						(proc851_0 1 @local233 @local554 0 0)
					)
					(13
						(proc851_0 1 @local221 @local554 0 0)
					)
					(17
						(proc851_0 1 @local225 @local554 0 0)
					)
					(16
						(proc851_0 1 @local225 @local554 0 0)
					)
					(4
						(proc851_0 1 @local241 @local554 0 0)
					)
					(else  (super doVerb: theVerb))
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
	
	(method (cue)
		(baaSound play:)
		(self cycleSpeed: (Random 6 24) setCycle: Beg)
	)
)

(instance getTheNetJerk of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local288 local82 0 @local500 1 self)
			)
			(1
				(proc851_0 2 @local305 1 0 @local500 1 self)
			)
			(2
				(gEgo
					setMotion: PolyPath (widow x?) (+ (widow y?) 10) self
				)
			)
			(3
				(widow setCycle: 0)
				(proc0_9 gEgo widow)
				(= ticks 12)
			)
			(4
				(proc851_0 2 @local315 1 0 @local500 1 self)
			)
			(5
				(widow setCycle: Fwd)
				(gEgo get: 4)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance getNetAfterMary of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local305 1 0 @local500 1 self)
			)
			(1
				(gEgo
					setMotion: PolyPath (widow x?) (+ (widow y?) 10) self
				)
			)
			(2
				(widow setCycle: 0)
				(proc0_9 gEgo widow)
				(= ticks 12)
			)
			(3
				(proc851_0 2 @local315 1 0 @local500 1 self)
			)
			(4
				(widow setCycle: Fwd)
				(gEgo get: 4)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_2)
				(proc0_3)
				(switch gGEgoEdgeHit
					(1
						(if (> gGEgoX 130) (= gGEgoX 129))
						(gEgo
							posn: gGEgoX 240
							init:
							setMotion: PolyPath gGEgoX 184 self
						)
					)
					(2
						(gEgo
							posn: 1 gGEgoY
							init:
							setMotion: PolyPath 26 (if (< gGEgoY 170) 170 else gGEgoY) self
						)
					)
					(3
						(if (< gGEgoX 180)
							(gEgo posn: 65 107 init: setMotion: PolyPath 65 112 self)
						else
							(gEgo
								posn: 265 107
								init:
								setMotion: PolyPath 268 112 self
							)
						)
					)
					(4
						(if (> gGEgoY 137) (= gGEgoY 136))
						(if (< gGEgoY 106) (= gGEgoY 106))
						(gEgo
							posn: 318 gGEgoY
							init:
							setMotion: PolyPath 298 (+ gGEgoY 5) self
						)
					)
					(else 
						(gEgo
							posn: 1 185
							loop: 3
							init:
							setMotion: PolyPath 26 185 self
						)
					)
				)
			)
			(1
				(if (proc0_5 179)
					(proc0_7 179)
					(proc13_4 1250 201)
					(proc13_4 1250 202)
					(= cycles 1)
				else
					(self cue:)
				)
			)
			(2
				(switch global130
					(3
						(if (and (not (proc0_5 66)) (== gNewGuise 1))
							(proc0_6 66)
							(proc851_0 2 @local273 local82 0 @local500 1 self)
						else
							(self cue:)
						)
					)
					(9
						(if
							(and
								(not (proc0_5 66))
								(or (== gNewGuise 3) (== gNewGuise 2))
							)
							(proc0_6 66)
							(proc851_0 2 @local339 local82 0 @local500 1 self)
						else
							(self cue:)
						)
					)
					(else  (self cue:))
				)
			)
			(3
				(proc0_2)
				(theBoysSaved cue:)
				(self dispose:)
			)
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY temp2)
		(switch (= state newState)
			(0
				(proc0_3)
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(switch register
					(3 (= gEgoY 240))
					(2 (= gEgoX (+ gEgoX 20)))
					(4 (= gEgoX (- gEgoX 20)))
				)
				(if (!= register 1)
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
				(if
				(and (proc0_5 46) (proc0_5 44) (== global130 1))
					(self cue:)
				else
					(gClient newRoom: 220)
					(self dispose:)
				)
			)
			(2
				(gNewCast eachElementDo: #hide)
				(gClient drawPic: 803)
				(= ticks 60)
			)
			(3
				(gClient style: 8 newRoom: 160)
				(self dispose:)
			)
		)
	)
)

(instance handOut of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance firstTime of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0)
			(1
				(proc0_9 gEgo widow)
				(= ticks 18)
			)
			(2
				(proc851_0
					3
					@local89
					local82
					0
					@local500
					1
					@local518
					2
					self
				)
			)
			(3
				(proc851_0
					4
					@local98
					local82
					0
					@local500
					1
					@local509
					2
					@local527
					3
					self
				)
			)
			(4
				(proc851_0 2 @local106 local82 0 @local518 2 self)
			)
			(5 (proc0_4) (self dispose:))
		)
	)
)

(instance boysBusted of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0)
			(1
				(gEgo
					setMotion: PolyPath (+ (widow x?) 10) (+ (widow y?) 30) self
				)
			)
			(2
				(proc0_9 gEgo widow)
				(= ticks 18)
			)
			(3
				(proc851_0 3 @local452 2 0 15 1 @local500 2 self)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance boysSaved of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0)
			(1
				(gEgo
					setMotion: PolyPath (+ (widow x?) 10) (+ (widow y?) 30) self
				)
			)
			(2
				(proc0_9 gEgo widow)
				(= ticks 18)
			)
			(3
				(if (== global12 179)
					(proc851_0
						4
						@local131
						local82
						0
						@local500
						1
						@local518
						2
						@local509
						3
						self
					)
				else
					(proc851_0
						5
						@local111
						3
						0
						@local500
						1
						@local518
						2
						@local509
						3
						@local527
						4
						self
					)
				)
			)
			(4
				(if (== global12 179)
					(proc851_0 3 @local142 3 0 @local500 1 @local509 2 self)
				else
					(self cue:)
				)
			)
			(5
				(gEgo
					setMotion: PolyPath (widow x?) (+ (widow y?) 10) self
				)
			)
			(6
				(proc0_9 gEgo widow)
				(gEgo get: 4)
				(= ticks 12)
			)
			(7
				(gSFX number: 916 loop: 1 play:)
				(= global15 (+ global15 50))
				((ScriptID 0 1) doit:)
				(= ticks 6)
			)
			(8
				(if (== global12 179)
					(proc851_0 2 @local150 3 0 @local500 1 self)
				else
					(proc851_0 2 @local125 3 0 @local500 1 self)
				)
			)
			(9
				(proc806_5 3)
				(hal setCycle: End)
				(hob setCycle: End)
				(dicken setCycle: End)
				(gEgo
					setMotion: PolyPath (- (gEgo x?) 30) (+ (gEgo y?) 15)
				)
				(= ticks 120)
			)
			(10
				(gEgo setMotion: 0 setCycle: 0)
				(gNewCast eachElementDo: #hide)
				(DrawPic 803 dpOPEN_CHECKBOARD dpCLEAR 0)
				(= ticks 18)
			)
			(11 (gClient newRoom: 160))
		)
	)
)

(instance mouthyLamb of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local157 @local500 0 @local554 1 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance talkToDicky of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local165 @local500 0 @local527 1 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance giveHobBuck of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local171 @local500 0 @local509 1 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance giveDickBuck of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local185 @local500 0 @local527 1 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance giveDickHorn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 2 @local191 @local500 0 @local527 1 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance tuckChill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
					(or
						(== (gEgo loop?) 0)
						(== (gEgo loop?) 3)
						(== (gEgo loop?) 4)
						(== (gEgo loop?) 6)
					)
					(gEgo view: 10 loop: 0)
				else
					(gEgo view: 10 loop: 1)
				)
				(= ticks 60)
			)
			(1
				(proc851_0 1 @local468 15 0 self)
			)
			(2 (= ticks 30))
			(3
				(proc851_0 2 @local472 2 0 15 1 self)
			)
			(4
				(proc0_2)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance widowChill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if
					(or
						(== (gEgo loop?) 0)
						(== (gEgo loop?) 3)
						(== (gEgo loop?) 4)
						(== (gEgo loop?) 6)
					)
					(gEgo view: 10 loop: 0)
				else
					(gEgo view: 10 loop: 1)
				)
				(= ticks 30)
			)
			(1
				(proc851_0 2 @local460 2 0 @local500 1 self)
			)
			(2
				(proc0_2)
				(proc0_6 185)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance widowBlow of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(cond 
					(
						(and
							(== global130 5)
							(gNewCast contains: (ScriptID 23))
							(not local88)
						)
						(= local88 1)
						(gEgo setScript: tuckChill)
						1
					)
					((== global130 5) (proc13_4 1250 188 1) 1)
					((and (== global130 6) (not (proc0_5 25))) (proc13_4 1250 189 1) 1)
					((proc0_5 185) (proc13_4 1250 191 1) 1)
					((gNewCast contains: widow) (gEgo setScript: widowChill) 1)
				)
			else
				0
			)
		)
	)
)

(instance smoke of Prop
	(properties
		x 175
		y 20
		view 250
		loop 2
		cycleSpeed 12
		detailLevel 2
	)
	
	(method (init)
		(self setCycle: Fwd)
		(super init:)
	)
	
	(method (doVerb)
		(super doVerb:)
	)
)

(instance noGoat of Feature
	(properties
		y 130
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 272 117 250 125 224 120 223 92 240 103 252 106 272 101
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 205 1))
			(3 (proc13_4 1250 206 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance roof of Feature
	(properties
		y 85
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				276
				99
				252
				105
				243
				104
				222
				91
				183
				97
				176
				92
				166
				94
				88
				76
				91
				70
				82
				65
				108
				51
				129
				26
				168
				25
				168
				19
				186
				20
				187
				24
				212
				24
				262
				89
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 207 1))
			(3 (proc13_4 1250 208 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance theWoods of Feature
	(properties
		y 25
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 81 80 0 80 0 0 319 0 319 106 263 89 212 23 133 27 109 49 81 65
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 209 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance eastWall of Feature
	(properties
		y 130
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 221 117 161 127 161 92 178 93 185 99 222 94
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 210 1))
			(3 (proc13_4 1250 211 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance midWall of Feature
	(properties
		y 115
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 160 127 129 119 131 87 160 93
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 210 1))
			(3 (proc13_4 1250 211 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance westWall of Feature
	(properties
		y 100
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 120 116 92 106 93 101 83 96 83 69 89 71 85 75 120 85
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 210 1))
			(3 (proc13_4 1250 211 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance door of Feature
	(properties
		y 120
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 129 86 128 121 120 118 120 84
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 212 1))
			(3 (proc13_4 1250 213 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance chimney of Feature
	(properties
		y 30
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 187 24 168 25 168 19 185 20
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 214 1))
			(3 (proc13_4 1250 215 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rock of Feature
	(properties
		y 130
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 48 125 38 127 32 121 0 121 0 112 8 105 21 104 34 108
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 216 1))
			(3 (proc13_4 1250 217 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance stream of Feature
	(properties
		y 150
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				273
				93
				319
				107
				319
				145
				214
				189
				156
				189
				265
				147
				294
				144
				308
				129
				297
				107
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1250 218 1))
			(3 (proc13_4 1250 219 1))
			(5
				(proc13_4 1250 220)
				(proc13_6 24)
				(proc13_4 1250 221)
				(proc13_6 0)
			)
			(4
				(if (== param2 18)
					(proc13_4 1250 222 1)
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

(instance baaSound of Sound
	(properties
		flags $0001
		number 936
	)
)
