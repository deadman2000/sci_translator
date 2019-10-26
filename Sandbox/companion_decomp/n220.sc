;;; Sierra Script 1.0 - (do not remove this comment)
(script# 220)
(include sci.sh)
(use n000)
(use n013)
(use n221)
(use n225)
(use n228)
(use n231)
(use n233)
(use n241)
(use n750)
(use n806)
(use n813)
(use n851)
(use n926)
(use n945)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	forest 0
	forestBlown 1
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7 =  1
	local8 =  1
	local9
	local10
	[local11 10] = [-190 42 -150 74 -180 84 -250 105 -210 152]
	[local21 4] = [5 3 4 2]
	[local25 5] = [1220 10 1 1]
	[local30 8] = [-1]
)
(procedure (localproc_0022)
	(gSFX2 number: 916 loop: 1 play:)
	(= global15 (+ global15 75))
	((ScriptID 0 1) doit:)
)

(procedure (localproc_0046)
	(if (gClient obstacles?)
		((gClient obstacles?) dispose:)
	)
	(gClient obstacles: 0)
)

(procedure (localproc_0068 param1 param2 &tmp temp0 temp1)
	(if (< (= temp1 param1) 0)
		(= temp0 0)
		(while [local11 temp0]
			(if (== param1 [local11 temp0])
				(= temp1 [local11 (+ temp0 1)])
				(switch param2
					(1 (= temp1 (- temp1 16)))
					(3 (= temp1 (+ temp1 16)))
					(2 (++ temp1))
					(4 (-- temp1))
				)
				(break)
			)
			(= temp0 (+ temp0 2))
		)
		(if (< temp1 0)
			(= temp1 1158)
			(= param2 3)
			(gEgo posn: 160 80)
		)
	)
	(switch param2
		(1 (= temp1 (- temp1 16)))
		(3 (= temp1 (+ temp1 16)))
		(2 (++ temp1))
		(4 (-- temp1))
	)
	(= temp0 1)
	(while (< temp0 10)
		(if (== temp1 [local11 temp0])
			(return [local11 (- temp0 1)])
		)
		(= temp0 (+ temp0 2))
	)
	(return temp1)
)

(procedure (localproc_0160 param1 param2 &tmp temp0 temp1)
	(= global112 param1)
	(= global40 0)
	(= gGEgoX (gEgo x?))
	(if (< (= gGEgoY (gEgo y?)) 83) (= gGEgoY 85))
	(cond 
		((== (mod global112 3) 0) (= local8 0) (= local0 220))
		((== (mod global112 3) 1) (= local7 0) (= local0 230))
		((== (mod global112 3) 2) (= local8 0) (= local7 0) (= local0 240))
	)
	(if local9
		(= local9 0)
		(= temp0 100)
	else
		(= temp0 [local21 (- param2 1)])
	)
	(if
		(proc999_5
			global112
			19
			21
			23
			35
			50
			52
			65
			68
			82
			83
			85
			86
			89
			115
			121
			131
			133
			151
			154
		)
		(if (== local0 230) (proc233_0) else (proc228_0))
	else
		(switch local0
			(220 (proc221_0))
			(230 (proc231_0))
			(240 (proc241_0))
		)
	)
	(if
		(or
			(and (== global130 9) (not (proc0_5 36)))
			(and (== global130 12) (not (proc0_5 38)))
		)
		(proc750_3)
	)
	(if
		(proc999_5
			global112
			21
			36
			37
			38
			50
			56
			67
			75
			98
			99
			103
			115
			119
			135
			167
		)
		(= local8 0)
		(= local7 0)
		(gClient curPic: local0)
		(gClient picture: local0)
		(gClient drawPic: local0 (| temp0 $4000) 1 0)
		(if
			(not
				(proc999_5
					global112
					19
					21
					23
					35
					50
					52
					65
					68
					82
					83
					85
					86
					89
					115
					121
					131
					133
					151
					154
				)
			)
			(proc926_0)
		)
	else
		(gClient
			style: temp0
			picture: local0
			curPic: local0
			drawPic: local0
		)
	)
	(cond 
		(
			(proc999_5
				global112
				2
				3
				4
				5
				6
				7
				17
				24
				25
				26
				27
				32
				43
				48
				60
				64
				76
				81
				91
				97
				107
				113
				123
				129
				139
				146
				147
				148
				149
				156
				168
				169
				170
				171
				182
				183
			)
			(= local8 0)
			(= local7 0)
			(proc225_2)
		)
		(
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
			(proc225_1)
		)
	)
	(if
		(or
			(== global112 132)
			(== global112 155)
			(== global112 34)
			(== global112 53)
			(== global112 120)
			(== global112 66)
			(== global112 20)
			(== global112 114)
			(== global112 22)
			(== global112 122)
			(== global112 88)
			(== global112 49)
		)
		(proc225_0)
	else
		(= local8 0)
		(= local7 0)
	)
	(if
		(and
			(proc0_5 21)
			(proc0_5 199)
			(== global130 2)
			(proc999_5
				global112
				19
				40
				52
				70
				82
				100
				106
				118
				130
				136
				151
				166
			)
			(!= gGEgoEdgeHit 3)
		)
		(forest setScript: 0)
		((ScriptID 226 0) init:)
	else
		(if
			(and
				local7
				(not (Random 0 8))
				(> global3 4)
				(!= global130 9)
				(!= global130 12)
			)
			(bunny init:)
		)
		(if
			(and
				local8
				(not (Random 0 25))
				(or (== gGEgoEdgeHit 2) (== gGEgoEdgeHit 4))
				(> global3 4)
				(!= global130 9)
				(!= global130 12)
			)
			(buck init: setScript: stampede 0 param2)
		)
		(gEgo setScript: egoEnters 0 param2)
	)
)

(instance forest of Rm
	(properties
		horizon 82
		north 220
		east 220
		south 220
		west 220
	)
	
	(method (init &tmp temp0)
		(ScriptID 225)
		(proc958_0
			128
			805
			792
			764
			763
			230
			231
			232
			233
			234
			235
			236
			237
			238
			(if (== global130 2) 214 218 16 4 5 7 585 else 0)
			(switch gNewGuise
				(0 0 1 2)
				(1 36 37 38)
				(2 29 30 31)
				(3 29 30 31)
				(4 33 34 35)
				(5 23 24 27)
				(6 16 17 18)
			)
		)
		(switch global12
			(100 (= temp0 global112))
			(110
				(gEgo posn: 1 170)
				(= temp0 (= global112 71))
			)
			(120
				(if
					(and
						(or
							(== global112 9)
							(== global112 25)
							(== global112 40)
							(== global112 55)
							(== global112 71)
							(== global112 87)
							(== global112 102)
							(== global112 118)
							(== global112 134)
							(== global112 150)
						)
						(== gGEgoEdgeHit 4)
					)
					(-- global112)
				)
				(if
					(and
						(or
							(== global112 24)
							(== global112 39)
							(== global112 54)
							(== global112 70)
							(== global112 86)
							(== global112 101)
							(== global112 117)
							(== global112 133)
							(== global112 149)
						)
						(== gGEgoEdgeHit 2)
					)
					(++ global112)
				)
				(= temp0 global112)
			)
			(else 
				(= global112 (- (= temp0 global12)))
				(= temp0 (localproc_0068 global112 gGEgoEdgeHit))
			)
		)
		(= local9 1)
		(proc0_4)
		(super init: &rest)
		(if
			(or
				(!= (gRgnMusic number?) 905)
				(not (gRgnMusic handle?))
			)
			(gRgnMusic number: 905 play:)
		)
		(localproc_0160 temp0 gGEgoEdgeHit)
	)
	
	(method (doit &tmp temp0)
		(cond 
			((gEgo script?))
			((and (not (proc0_5 129)) (proc0_5 110)) (proc0_7 110) (handSignCode doit:))
			((gEgo edgeHit?)
				(= gGEgoEdgeHit (gEgo edgeHit?))
				(if global25 (global25 dispose:))
				(if (and (< global130 8) (not (proc0_5 118)))
					((ScriptID 185 4) doit:)
				)
				(if local6 (proc806_2 funnyBunny) (bunny dispose:))
				(gEgo setScript: walkOut 0 gGEgoEdgeHit)
			)
			(else (super doit:))
		)
	)
	
	(method (dispose)
		(if global25 (global25 dispose:))
		(= gGEgoX (gEgo x?))
		(= gGEgoY (gEgo y?))
		(= gGEgoLoop (gEgo loop?))
		(= global12 global11)
		(proc958_0 0 223 225 226)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(proc13_4 1220 (+ 12 (- global130 1)) 1)
			)
			(3 (proc13_4 1220 25 1))
			(5 (proc13_4 1220 26 1))
			(4
				(if
					(and
						(== param2 4)
						(> global71 (+ horizon 10))
						(not (gEgo script?))
					)
					(if
						(proc999_5
							global112
							2
							3
							4
							5
							6
							7
							17
							24
							25
							26
							27
							32
							43
							48
							60
							64
							76
							81
							91
							97
							107
							113
							123
							129
							139
							146
							147
							148
							149
							156
							168
							169
							170
							171
							182
							183
						)
						(proc13_4 1220 31 1)
					else
						(gEgo setScript: (ScriptID 181 1) global70 global71)
					)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (cue)
		(gEgo actions: forestBlown)
		(if (and (< global130 8) (not (proc0_5 118)))
			(self setScript: PT)
		)
	)
	
	(method (newRoom newRoomNumber)
		(if (and (== global130 11) (proc0_5 64))
			(++ global155)
		)
		(localproc_0046)
		(gNewFeatures eachElementDo: #dispose release:)
		(global10 eachElementDo: #dispose release:)
		(if (not (gEgo script?)) (proc0_4))
		(cond 
			((== global145 33) (= newRoomNumber 170) (super newRoom: newRoomNumber))
			(local3 (= newRoomNumber 180) (super newRoom: newRoomNumber))
			(local1
				((ScriptID 226 14) doit:)
				(= newRoomNumber 160)
				(super newRoom: newRoomNumber)
			)
			(local4
				(if (and (== gGEgoEdgeHit 4) (== global112 71))
					(= newRoomNumber 110)
				else
					(= newRoomNumber 120)
				)
				(super newRoom: newRoomNumber)
			)
			((proc0_5 194)
				(if
					(proc999_5
						global112
						2
						3
						4
						5
						6
						7
						17
						24
						25
						26
						27
						32
						43
						48
						60
						64
						76
						81
						91
						97
						107
						113
						123
						129
						139
						146
						147
						148
						149
						156
						168
						169
						170
						171
						182
						183
					)
					(proc806_2 (ScriptID 225 9))
				)
				(= newRoomNumber 170)
				(super newRoom: newRoomNumber)
			)
			((proc0_5 176)
				(if (proc0_5 37) ((ScriptID 185 4) doit:))
				(proc0_7 176)
				(= newRoomNumber 171)
				(super newRoom: newRoomNumber)
			)
			((proc0_5 170)
				(proc0_7 170)
				(if (< global137 3) (= global137 0))
				(cond 
					((and (== global130 2) (proc0_5 182))
						(if (and (not (gEgo mover?)) (!= gNewGuise 1))
							(robinHead init:)
							(global10 add: robinHead)
						)
						(robin init:)
						(global10 add: robin)
						(global10 doit:)
						((ScriptID 226 14) doit:)
						(= newRoomNumber 160)
					)
					((and (< global130 8) (not (proc0_5 118)))
						(if (and (not (gEgo mover?)) (!= gNewGuise 1))
							(robinHead init:)
							(global10 add: robinHead)
						)
						(robin init:)
						(global10 add: robin)
						(global10 doit:)
						((ScriptID 185 4) doit:)
						(= newRoomNumber 100)
					)
					(else (= newRoomNumber 100))
				)
				((ScriptID 0 1) doit:)
				(super newRoom: newRoomNumber)
			)
			(local5 (= newRoomNumber 100) (super newRoom: newRoomNumber))
			(
				(<
					(= newRoomNumber
						(localproc_0068
							global112
							(= gGEgoEdgeHit (gEgo edgeHit?))
						)
					)
					0
				)
				(super newRoom: (- newRoomNumber))
			)
			(else
				(if
					(proc999_5
						global112
						2
						3
						4
						5
						6
						7
						17
						24
						25
						26
						27
						32
						43
						48
						60
						64
						76
						81
						91
						97
						107
						113
						123
						129
						139
						146
						147
						148
						149
						156
						168
						169
						170
						171
						182
						183
					)
					((ScriptID 225 4)
						signal: (& ((ScriptID 225 4) signal?) $ffbe)
						dispose:
						delete:
					)
				)
				(localproc_0160 newRoomNumber gGEgoEdgeHit)
			)
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10cd
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    129
			callb    proc0_5,  2
			not     
			bnt      code_0e97
			pushi    0
			callb    proc0_2,  0
code_0e97:
			pTos     register
			dup     
			ldi      1
			eq?     
			bnt      code_0fb4
			lsl      local0
			ldi      220
			eq?     
			bnt      code_0f17
			ldi      21
			bnt      code_0ef1
			ldi      36
			ldi      37
			ldi      38
			ldi      50
			ldi      56
			ldi      67
			ldi      75
			ldi      98
			ldi      99
			ldi      103
			ldi      115
			ldi      119
			ldi      135
			ldi      167
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      35
			gt?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      150
			lt?     
			bnt      code_0f67
			ldi      155
			sag      gGEgoX
			jmp      code_0f67
code_0ef1:
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      170
			gt?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      285
			lt?     
			bnt      code_0f67
			ldi      165
			sag      gGEgoX
			jmp      code_0f67
code_0f17:
			lsl      local0
			ldi      240
			eq?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      160
			lt?     
			bnt      code_0f44
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      60
			gt?     
			bnt      code_0f44
			ldi      56
			sag      gGEgoX
			jmp      code_0f67
code_0f44:
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      160
			ge?     
			bnt      code_0f67
			pushi    #x
			pushi    0
			lag      gEgo
			send     4
			push    
			ldi      260
			lt?     
			bnt      code_0f67
			ldi      264
			sag      gGEgoX
code_0f67:
			pushi    #posn
			pushi    2
			lsg      gGEgoX
			pushi    240
			pushi    107
			pushi    0
			lag      gEgo
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_0f9f
			lsg      global137
			ldi      3
			gt?     
			bnt      code_0f9f
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_0f9f:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsg      gGEgoX
			pushi    184
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_0fb4:
			dup     
			ldi      2
			eq?     
			bnt      code_1006
			pushi    #posn
			pushi    2
			pushi    65516
			lsg      gGEgoY
			pushi    107
			pushi    0
			lag      gEgo
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_0ff2
			lsg      global137
			ldi      3
			gt?     
			bnt      code_0ff2
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_0ff2:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    60
			lsg      gGEgoY
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_1006:
			dup     
			ldi      3
			eq?     
			bnt      code_1058
			pushi    #posn
			pushi    2
			lsg      gGEgoX
			pushi    89
			pushi    107
			pushi    0
			lag      gEgo
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1044
			lsg      global137
			ldi      3
			gt?     
			bnt      code_1044
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_1044:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsg      gGEgoX
			pushi    110
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_1058:
			dup     
			ldi      4
			eq?     
			bnt      code_10ac
			pushi    #posn
			pushi    2
			pushi    345
			lsg      gGEgoY
			pushi    107
			pushi    0
			lag      gEgo
			send     12
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1097
			lsg      global137
			ldi      3
			gt?     
			bnt      code_1097
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    160
			pushi    150
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_1097:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    260
			lsg      gGEgoY
			pushSelf
			lag      gEgo
			send     12
			jmp      code_10c9
code_10ac:
			pushi    #posn
			pushi    2
			pushi    185
			pushi    130
			pushi    6
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lag      gEgo
			send     18
			pushi    0
			callb    proc0_2,  0
			ldi      12
			aTop     ticks
code_10c9:
			toss    
			jmp      code_1264
code_10cd:
			dup     
			ldi      1
			eq?     
			bnt      code_1104
			pushi    1
			pushi    179
			callb    proc0_5,  2
			bnt      code_10fb
			pushi    1
			pushi    179
			callb    proc0_7,  2
			pushi    5
			pushi    1
			lea      @local25
			push    
			lea      @local30
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_1264
code_10fb:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1264
code_1104:
			dup     
			ldi      2
			eq?     
			bnt      code_1264
			pushi    0
			callb    proc0_4,  0
			lsg      global12
			ldi      120
			eq?     
			bnt      code_1132
			pushi    1
			pushi    70
			callb    proc0_5,  2
			bnt      code_1132
			pushi    1
			pushi    70
			callb    proc0_7,  2
			pushi    3
			pushi    1220
			pushi    9
			pushi    0
			calle    proc13_4,  6
code_1132:
			pushi    1
			pushi    129
			callb    proc0_5,  2
			bnt      code_1158
			lsg      gNewGuise
			ldi      1
			ne?     
			bnt      code_1158
			pushi    #disable
			pushi    1
			pushi    5
			lag      gIconBar
			send     6
			pushi    0
			calle    proc750_2,  0
			jmp      code_1164
code_1158:
			pushi    #actions
			pushi    1
			lofsa    forestBlown
			push    
			lag      gEgo
			send     6
code_1164:
			pushi    37
			lsg      global112
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			pushi    17
			pushi    24
			pushi    25
			pushi    26
			pushi    27
			pushi    32
			pushi    43
			pushi    48
			pushi    60
			pushi    64
			pushi    76
			pushi    81
			pushi    91
			pushi    97
			pushi    107
			pushi    113
			pushi    123
			pushi    129
			pushi    139
			pushi    146
			pushi    147
			pushi    148
			pushi    149
			pushi    156
			pushi    168
			pushi    169
			pushi    170
			pushi    171
			pushi    182
			pushi    183
			calle    proc999_5,  74
			not     
			bnt      code_1255
			pushi    1
			pushi    118
			callb    proc0_5,  2
			not     
			bnt      code_1255
			lsg      global130
			ldi      8
			lt?     
			bnt      code_1255
			lsg      global112
			ldi      132
			eq?     
			bt       code_1237
			lsg      global112
			ldi      155
			eq?     
			bt       code_1237
			lsg      global112
			ldi      34
			eq?     
			bt       code_1237
			lsg      global112
			ldi      53
			eq?     
			bt       code_1237
			lsg      global112
			ldi      120
			eq?     
			bt       code_1237
			lsg      global112
			ldi      66
			eq?     
			bt       code_1237
			lsg      global112
			ldi      20
			eq?     
			bt       code_1237
			lsg      global112
			ldi      114
			eq?     
			bt       code_1237
			lsg      global112
			ldi      22
			eq?     
			bt       code_1237
			lsg      global112
			ldi      122
			eq?     
			bt       code_1237
			lsg      global112
			ldi      88
			eq?     
			bt       code_1237
			lsg      global112
			ldi      49
			eq?     
code_1237:
			not     
			bnt      code_1255
			pushi    2
			pushi    130
			pushi    185
			callk    Load,  4
			pushi    #setScript
			pushi    1
			lofsa    PT
			push    
			lofsa    forest
			send     6
			jmp      code_125f
code_1255:
			pushi    #setScript
			pushi    1
			pushi    0
			lofsa    forest
			send     6
code_125f:
			pushi    #dispose
			pushi    0
			self     4
code_1264:
			toss    
			ret     
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
					(gEgo setMotion: PolyPath gEgoX gEgoY self)
				else
					(self cue:)
				)
			)
			(1
				(switch gGEgoEdgeHit
					(1
						(cond 
							(
								(or
									(== global112 59)
									(== global112 23)
									(== global112 155)
								)
								(if (> (gEgo x?) 210) (gEgo x: 210))
								(self cue:)
							)
							((or (== global112 18) (== global112 33)) (if (< (gEgo x?) 110) (gEgo x: 110)) (self cue:))
							(else (self cue:))
						)
					)
					(3
						(cond 
							(
								(or
									(== global112 75)
									(== global112 155)
									(== global112 167)
								)
								(if (> (gEgo x?) 210) (gEgo x: 210))
								(self cue:)
							)
							((or (== global112 130) (== global112 65)) (if (< (gEgo x?) 110) (gEgo x: 110)) (self cue:))
							(else (self cue:))
						)
					)
					(else 
						(if
							(and
								(or
									(== global112 75)
									(== global112 155)
									(== global112 167)
								)
								(> (gEgo y?) 120)
							)
							(gEgo y: 120)
						)
						(self cue:)
					)
				)
			)
			(2
				(if
					(and
						(not (proc0_5 199))
						(== global130 2)
						(proc999_5
							global112
							19
							40
							52
							70
							82
							100
							106
							118
							130
							136
							151
							166
						)
					)
					(proc0_6 199)
				)
				(if (< global130 8)
					(gEgo actions: forestBlown)
					((ScriptID 185 4) doit:)
				)
				(cond 
					((and (== global130 9) (proc0_5 36)) (gIconBar enable: 5) (gEgo actions: forestBlown))
					((and (== global130 12) (proc0_5 38)) (gIconBar enable: 5) (gEgo actions: forestBlown))
				)
				(cond 
					((and (proc0_5 42) (not (proc0_5 118))) (= local3 1) (gClient newRoom: 180))
					((and (== global130 2) (proc0_5 182)) (= local1 1) (gClient newRoom: 160))
					(
						(or
							(and
								(or
									(== global112 24)
									(== global112 39)
									(== global112 54)
									(== global112 70)
									(== global112 86)
									(== global112 101)
									(== global112 117)
									(== global112 133)
									(== global112 149)
								)
								(== gGEgoEdgeHit 2)
							)
							(and
								(or
									(== global112 9)
									(== global112 25)
									(== global112 40)
									(== global112 55)
									(== global112 71)
									(== global112 87)
									(== global112 102)
									(== global112 118)
									(== global112 134)
									(== global112 150)
								)
								(== gGEgoEdgeHit 4)
							)
							(and
								(or
									(== global112 24)
									(== global112 39)
									(== global112 86)
								)
								(== gGEgoEdgeHit 3)
							)
							(and
								(or
									(== global112 40)
									(== global112 55)
									(== global112 102)
								)
								(== gGEgoEdgeHit 1)
							)
						)
						(= local4 1)
						(if (and (== gGEgoEdgeHit 4) (== global112 71))
							(= temp2 110)
						else
							(= temp2 120)
						)
						(gClient newRoom: temp2)
					)
					(
						(or
							(and
								(or
									(== global112 48)
									(== global112 81)
									(== global112 97)
									(== global112 113)
									(== global112 2)
									(== global112 17)
									(== global112 32)
									(== global112 64)
									(== global112 129)
									(== global112 146)
									(== global112 166)
									(== global112 182)
								)
								(== gGEgoEdgeHit 4)
							)
							(and
								(or
									(== global112 43)
									(== global112 91)
									(== global112 107)
									(== global112 123)
									(== global112 139)
									(== global112 76)
									(== global112 171)
									(== global112 183)
									(== global112 7)
									(== global112 27)
									(== global112 60)
									(== global112 156)
								)
								(== gGEgoEdgeHit 2)
							)
							(and
								(or
									(== global112 3)
									(== global112 4)
									(== global112 5)
									(== global112 6)
									(== global112 24)
									(== global112 25)
									(== global112 26)
									(== global112 2)
									(== global112 17)
									(== global112 32)
									(== global112 7)
									(== global112 27)
									(== global112 60)
								)
								(== gGEgoEdgeHit 1)
							)
							(and
								(or
									(== global112 147)
									(== global112 148)
									(== global112 149)
									(== global112 168)
									(== global112 169)
									(== global112 170)
									(== global112 182)
									(== global112 64)
									(== global112 129)
									(== global112 146)
									(== global112 76)
									(== global112 171)
									(== global112 183)
								)
								(== gGEgoEdgeHit 3)
							)
						)
						(= local5 1)
						(cond 
							(
								(and
									(== global130 9)
									(proc0_5 129)
									(not (proc0_5 36))
								)
								(gSFX fade: 0 15 16 1)
								(proc0_6 36)
								(localproc_0022)
								(= global137 0)
							)
							(
								(and
									(== global130 12)
									(proc0_5 129)
									(not (proc0_5 38))
								)
								(gSFX fade: 0 15 16 1)
								(proc0_6 38)
								(localproc_0022)
								(= global137 0)
							)
						)
						(= temp2 100)
						(gClient newRoom: temp2)
					)
					(else (gClient newRoom: 220))
				)
				(forest setScript: 0)
				(self dispose:)
			)
		)
	)
)

(instance bunny of Actor
	(properties
		view 764
		signal $4000
		xStep 8
	)
	
	(method (init &tmp temp0)
		(super init:)
		(= local6 1)
		(= temp0 (Random 1 2))
		(gEgo signal: (| (gEgo signal?) $4000))
		(gSFX2 number: (Random 921 923) loop: 1 play:)
		(cond 
			((> (gEgo x?) 185)
				(if (== temp0 2)
					(bunny
						x: -15
						y: (Random 91 101)
						setLoop: 3
						setCycle: Walk
						setMotion: PolyPath 330 (Random 91 101) self
					)
				else
					(bunny
						x: -15
						y: (Random 145 175)
						setLoop: 3
						setCycle: Walk
						setMotion: PolyPath 330 (Random 145 175) self
					)
				)
			)
			((== temp0 2)
				(bunny
					x: 330
					y: (Random 91 101)
					setLoop: 2
					setCycle: Walk
					setMotion: MoveTo -15 (Random 91 101) self
				)
			)
			(else
				(bunny
					x: 330
					y: (Random 145 175)
					setLoop: 2
					setCycle: Walk
					setMotion: MoveTo -15 (Random 145 175) self
				)
			)
		)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1220 0 0))
			(10 (proc13_4 1220 1 0))
			(3 (proc13_4 1220 2 0))
			(5 (proc13_4 1220 3 0))
			(4
				(if (== param2 4)
					(proc13_4 1220 4 0)
				else
					(super doVerb: theVerb &rest)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
	
	(method (cue)
		(= local6 0)
		(gEgo signal: (& (gEgo signal?) $bfff))
		(self dispose:)
		(super cue:)
	)
)

(instance robin of PicView
	(properties)
	
	(method (init)
		(super init:)
		(self
			view: (gEgo view?)
			loop: (gEgo loop?)
			cel: (gEgo cel?)
			signal: (gEgo signal?)
			x: (gEgo x?)
			y: (gEgo y?)
		)
	)
)

(instance robinHead of PicView
	(properties)
	
	(method (init)
		(super init:)
		(self
			view: (gEgoHead view?)
			loop: (gEgoHead loop?)
			cel: (gEgoHead cel?)
			signal: (gEgoHead signal?)
			x: (gEgoHead x?)
			y: (gEgoHead y?)
			z: (gEgoHead z?)
		)
	)
)

(instance funnyBunny of PicView
	(properties)
	
	(method (init)
		(super init:)
		(self
			view: (bunny view?)
			loop: (bunny loop?)
			cel: (bunny cel?)
			x: (bunny x?)
			y: (bunny y?)
		)
	)
)

(instance buck of Actor
	(properties
		view 763
		signal $4000
		xStep 80
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (proc13_4 1220 5 0))
			(10 (proc13_4 1220 6 0))
			(5 (proc13_4 1220 7 0))
			(4
				(if (== param2 4)
					(proc13_4 1220 8 0)
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

(instance doe1 of Actor
	(properties
		view 763
		signal $4000
		xStep 80
	)
	
	(method (doVerb theVerb)
		(buck doVerb: theVerb)
	)
)

(instance doe2 of Actor
	(properties
		view 763
		signal $4000
		xStep 80
	)
	
	(method (doVerb theVerb)
		(buck doVerb: theVerb)
	)
)

(instance stampede of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gSFX2 number: (Random 897 899) loop: 1 play:)
				(if (== register 2)
					(buck
						x: -15
						y: 140
						setLoop: 3
						init:
						setCycle: Fwd
						setMotion: PolyPath 400 115 self
					)
					(doe1
						x: -30
						y: 120
						setLoop: 1
						cel: 2
						init:
						setCycle: Fwd
						setMotion: PolyPath 395 95
					)
					(doe2
						x: -25
						y: 182
						setLoop: 1
						cel: 5
						init:
						setCycle: Fwd
						setMotion: PolyPath 380 157
					)
				else
					(buck
						x: 370
						y: 120
						setLoop: 4
						init:
						setCycle: Fwd
						setMotion: PolyPath -75 160 self
					)
					(doe1
						x: 325
						y: 90
						setLoop: 2
						cel: 2
						init:
						setCycle: Fwd
						setMotion: PolyPath -70 130
					)
					(doe2
						x: 360
						y: 140
						setLoop: 2
						cel: 5
						init:
						setCycle: Fwd
						setMotion: PolyPath -55 182
					)
				)
			)
			(1
				(doe1 dispose:)
				(doe2 dispose:)
				(buck dispose:)
				(self dispose:)
			)
		)
	)
)

(instance handSignCode of Code
	(properties)
	
	(method (doit)
		(cond 
			(
				(and
					(!= gNewGuise 0)
					(or
						(== global112 132)
						(== global112 155)
						(== global112 34)
						(== global112 53)
						(== global112 120)
						(== global112 66)
						(== global112 20)
						(== global112 114)
						(== global112 22)
						(== global112 122)
						(== global112 88)
						(== global112 49)
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
				)
				(if
					(proc999_5
						global112
						2
						3
						4
						5
						6
						7
						17
						24
						25
						26
						27
						32
						43
						48
						60
						64
						76
						81
						91
						97
						107
						113
						123
						129
						139
						146
						147
						148
						149
						156
						168
						169
						170
						171
						182
						183
					)
					(proc13_4 1220 29 1)
				else
					(proc13_4 1220 28 1)
				)
			)
			(
				(and
					(or
						(and
							(or (== global112 132) (== global112 155))
							(== global124 0)
						)
						(and (== global112 34) (== global124 1))
						(and
							(or (== global112 53) (== global112 120))
							(== global124 2)
						)
						(and (== global112 66) (== global124 3))
						(and (== global112 20) (== global124 4))
						(and (== global112 114) (== global124 5))
						(and
							(or (== global112 22) (== global112 122))
							(== global124 6)
						)
						(and
							(or (== global112 88) (== global112 49))
							(== global124 7)
						)
						(and 1 (== global124 9))
					)
					(or
						(== global112 132)
						(== global112 155)
						(== global112 34)
						(== global112 53)
						(== global112 120)
						(== global112 66)
						(== global112 20)
						(== global112 114)
						(== global112 22)
						(== global112 122)
						(== global112 88)
						(== global112 49)
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
				)
				(gEgo setScript: (ScriptID 223 0))
			)
			(
				(and
					(proc0_5 34)
					(not (proc0_5 35))
					(or
						(== global112 132)
						(== global112 155)
						(== global112 34)
						(== global112 53)
						(== global112 120)
						(== global112 66)
						(== global112 20)
						(== global112 114)
						(== global112 22)
						(== global112 122)
						(== global112 88)
						(== global112 49)
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
				)
				(gEgo setScript: (ScriptID 223 2))
			)
			(
				(and
					(proc0_5 34)
					(proc0_5 35)
					(< global137 3)
					(not (proc0_5 129))
					(or
						(== global112 132)
						(== global112 155)
						(== global112 34)
						(== global112 53)
						(== global112 120)
						(== global112 66)
						(== global112 20)
						(== global112 114)
						(== global112 22)
						(== global112 122)
						(== global112 88)
						(== global112 49)
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
				)
				(gEgo setScript: (ScriptID 223 1))
			)
		)
	)
)

(instance forestBlown of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(return
			(if (and (== theVerb 4) (== param2 1))
				(cond 
					(
						(proc999_5
							global112
							2
							3
							4
							5
							6
							7
							17
							24
							25
							26
							27
							32
							43
							48
							60
							64
							76
							81
							91
							97
							107
							113
							123
							129
							139
							146
							147
							148
							149
							156
							168
							169
							170
							171
							182
							183
						)
						(proc13_4 1220 30 1)
						1
					)
					(
						(or
							(and (== global130 9) (proc0_5 36))
							(and (== global130 12) (proc0_5 38))
						)
						(proc13_4 1220 27 1)
						1
					)
					(else (gEgo setScript: (ScriptID 5 0)) 1)
				)
			else
				0
			)
		)
	)
)

(instance PT of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= seconds 6))
			(1
				(cond 
					((and (<= 1 global130) (<= global130 3)) (= ticks (Random 600 2100)))
					((and (<= 4 global130) (<= global130 6)) (= ticks (Random 1800 6000)))
					(else (= ticks (Random 60 900)))
				)
			)
			(2
				(if
				(and (not (proc0_5 126)) (not (proc0_5 115)))
					(forest setScript: (ScriptID 185 1))
				else
					(self dispose:)
				)
			)
		)
	)
)
