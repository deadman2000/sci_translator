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
	local0
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
		(asm
			pushi    5
			pushi    128
			pushi    250
			pushi    252
			pushi    253
			pushi    254
			calle    proc958_0,  10
			pushi    #actions
			pushi    1
			lofsa    widowBlow
			push    
			lag      global0
			send     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    0
			callb    proc0_4,  0
			lsg      global12
			ldi      270
			eq?     
			bt       code_006e
			lsg      global12
			ldi      179
			eq?     
code_006e:
			bnt      code_01b9
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      40
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      14
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      11
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      67
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      11
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      83
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      78
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      38
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     6
			pushi    3
			pushi    0
			pushi    0
			pushi    1
			callb    proc0_2,  6
			ldi      0
			sag      global126
			pushi    #init
			pushi    0
			lofsa    hal
			send     4
			pushi    #init
			pushi    0
			lofsa    hob
			send     4
			pushi    #init
			pushi    0
			lofsa    dicken
			send     4
			pushi    #loop
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lofsa    widow
			send     10
			ldi      2
			sag      global108
			ldi      170
			sag      global105
			lofsa    boysSaved
			sal      local0
			jmp      code_0606
code_01b9:
			lsg      global130
			ldi      1
			eq?     
			bt       code_01e6
			lsg      global130
			ldi      2
			eq?     
			bt       code_01e6
			lsg      global130
			ldi      3
			eq?     
			bt       code_01e6
			lsg      global130
			ldi      4
			eq?     
			bt       code_01e6
			lsg      global130
			ldi      7
			eq?     
			bt       code_01e6
			lsg      global130
			ldi      9
			eq?     
code_01e6:
			bnt      code_03ef
			lsg      global130
			ldi      1
			eq?     
			bnt      code_0322
			pushi    1
			pushi    45
			callb    proc0_5,  2
			not     
			bnt      code_0322
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    18
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      40
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      14
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      25
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      11
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      61
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      11
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      75
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      5
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      67
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      2
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      38
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      28
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      13
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     50
			push    
			lag      global2
			send     6
			pushi    #init
			pushi    0
			lofsa    hal
			send     4
			pushi    #init
			pushi    0
			lofsa    hob
			send     4
			pushi    #init
			pushi    0
			lofsa    dicken
			send     4
			lofsa    firstTime
			sal      local0
			jmp      code_03e0
code_0322:
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      40
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      26
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      60
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      28
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      26
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      9
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			lofsa    handOut
			sal      local0
code_03e0:
			pushi    #loop
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			lofsa    widow
			send     10
			jmp      code_0606
code_03ef:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_051c
			lsg      global126
			ldi      0
			eq?     
			bnt      code_051c
			pushi    1
			pushi    111
			callb    proc0_5,  2
			not     
			bnt      code_051c
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      60
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      50
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      40
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      50
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			pushi    #loop
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			lofsa    widow
			send     10
			pushi    1
			pushi    23
			callk    ScriptID,  2
			pushi    284
			pushi    2
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      22
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    6
			pushi    1
			pushi    2
			pushi    293
			pushi    1
			pushi    2
			pushi    267
			pushi    1
			lofsa    tuckActions
			push    
			pushi    107
			pushi    0
			pushi    1
			pushi    23
			callk    ScriptID,  2
			send     30
			pushi    1
			pushi    111
			callb    proc0_6,  2
			lofsa    boysBusted
			sal      local0
			jmp      code_0606
code_051c:
			lsg      global130
			ldi      10
			eq?     
			bnt      code_0601
			pushi    1
			pushi    52
			callb    proc0_5,  2
			not     
			bnt      code_05f9
			pushi    374
			pushi    1
			pushi    34
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      25
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      15
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      24
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      3
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      15
			sub     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      16
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      12
			sub     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     6
			pushi    #loop
			pushi    1
			pushi    2
			pushi    107
			pushi    0
			lofsa    widow
			send     10
			pushi    1
			pushi    52
			callb    proc0_6,  2
code_05f9:
			lofsa    handOut
			sal      local0
			jmp      code_0606
code_0601:
			lofsa    handOut
			sal      local0
code_0606:
			pushi    #number
			pushi    1
			pushi    151
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global113
			send     16
			lsl      local84
			ldi      0
			eq?     
			bnt      code_062d
			pushi    #number
			pushi    1
			pushi    905
			lag      global100
			send     6
			jmp      code_065e
code_062d:
			lsg      global130
			ldi      5
			eq?     
			bt       code_063a
			lsg      global130
			ldi      6
			eq?     
code_063a:
			bnt      code_0654
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_0654
			pushi    #number
			pushi    1
			pushi    251
			lag      global100
			send     6
			jmp      code_065e
code_0654:
			pushi    #number
			pushi    1
			pushi    250
			lag      global100
			send     6
code_065e:
			pushi    #loop
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     10
			pushi    #addObstacle
			pushi    5
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    16
			pushi    299
			pushi    118
			pushi    261
			pushi    129
			pushi    220
			pushi    123
			pushi    157
			pushi    134
			pushi    71
			pushi    107
			pushi    89
			pushi    103
			pushi    69
			pushi    95
			pushi    161
			pushi    85
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     46
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    61
			pushi    124
			pushi    49
			pushi    135
			pushi    0
			pushi    144
			pushi    0
			pushi    123
			pushi    29
			pushi    120
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    0
			pushi    114
			pushi    0
			pushi    96
			pushi    28
			pushi    99
			pushi    38
			pushi    107
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    10
			pushi    319
			pushi    101
			pushi    276
			pushi    85
			pushi    260
			pushi    86
			pushi    249
			pushi    73
			pushi    319
			pushi    64
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     34
			push    
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    132
			pushi    189
			pushi    186
			pushi    175
			pushi    272
			pushi    141
			pushi    294
			pushi    135
			pushi    319
			pushi    135
			pushi    319
			pushi    189
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			lag      global2
			send     14
			lsg      global126
			dup     
			ldi      1
			eq?     
			bnt      code_0772
			ldi      7
			sal      local82
			jmp      code_07bc
code_0772:
			dup     
			ldi      5
			eq?     
			bnt      code_0780
			ldi      9
			sal      local82
			jmp      code_07bc
code_0780:
			dup     
			ldi      6
			eq?     
			bnt      code_078e
			ldi      8
			sal      local82
			jmp      code_07bc
code_078e:
			dup     
			ldi      4
			eq?     
			bnt      code_079c
			ldi      6
			sal      local82
			jmp      code_07bc
code_079c:
			dup     
			ldi      2
			eq?     
			bnt      code_07aa
			ldi      4
			sal      local82
			jmp      code_07bc
code_07aa:
			dup     
			ldi      3
			eq?     
			bnt      code_07b8
			ldi      5
			sal      local82
			jmp      code_07bc
code_07b8:
			ldi      1
			sal      local82
code_07bc:
			toss    
			pushi    #contains
			pushi    1
			lofsa    widow
			push    
			lag      global5
			send     6
			bnt      code_080a
			pushi    #init
			pushi    0
			lofsa    smoke
			send     4
			pushi    #init
			pushi    0
			lofsa    lamb
			send     4
			pushi    9
			lofsa    roof
			push    
			lofsa    theWoods
			push    
			lofsa    eastWall
			push    
			lofsa    midWall
			push    
			lofsa    westWall
			push    
			lofsa    door
			push    
			lofsa    chimney
			push    
			lofsa    rock
			push    
			lofsa    stream
			push    
			calle    proc806_3,  18
			jmp      code_083a
code_080a:
			pushi    10
			lofsa    roof
			push    
			lofsa    theWoods
			push    
			lofsa    eastWall
			push    
			lofsa    midWall
			push    
			lofsa    westWall
			push    
			lofsa    door
			push    
			lofsa    chimney
			push    
			lofsa    rock
			push    
			lofsa    stream
			push    
			lofsa    noGoat
			push    
			calle    proc806_3,  20
code_083a:
			pushi    #setScript
			pushi    1
			lofsa    egoEnters
			push    
			lag      global0
			send     6
			pushi    #setScript
			pushi    1
			lsl      local0
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (doit)
		(asm
			+al      local81
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			ldi      2
			gt?     
			bnt      code_0952
			pushi    1
			pushi    115
			callb    proc0_5,  2
			not     
			bnt      code_0952
			pushi    4
			pushi    6
			pushi    240
			pushi    250
			pushi    1
			callk    Palette,  8
			lal      local84
			bnt      code_089e
			lsl      local81
			ldi      65
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_089e
			pushi    #setCycle
			pushi    2
			class    End
			push    
			lofsa    widow
			push    
			lofsa    widow
			send     8
			jmp      code_0952
code_089e:
			lal      local83
			bnt      code_08c2
			lsl      local81
			ldi      90
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_08c2
			pushi    #setCycle
			pushi    2
			class    End
			push    
			lofsa    lamb
			push    
			lofsa    lamb
			send     8
			jmp      code_0952
code_08c2:
			lal      local85
			bnt      code_08f3
			lsl      local81
			ldi      147
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_08f3
			pushi    288
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    hal
			send     4
			bnt      code_08e8
			ldi      0
			jmp      code_08ea
code_08e8:
			ldi      1
code_08ea:
			push    
			lofsa    hal
			send     6
			jmp      code_0952
code_08f3:
			lal      local85
			bnt      code_0924
			lsl      local81
			ldi      153
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0924
			pushi    288
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    hob
			send     4
			bnt      code_0919
			ldi      0
			jmp      code_091b
code_0919:
			ldi      1
code_091b:
			push    
			lofsa    hob
			send     6
			jmp      code_0952
code_0924:
			lal      local85
			bnt      code_0952
			lsl      local81
			ldi      178
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_0952
			pushi    288
			pushi    1
			pushi    #cel
			pushi    0
			lofsa    dicken
			send     4
			bnt      code_094a
			ldi      0
			jmp      code_094c
code_094a:
			ldi      1
code_094c:
			push    
			lofsa    dicken
			send     6
code_0952:
			pushi    #script
			pushi    0
			lag      global0
			send     4
			bnt      code_0960
			jmp      code_09ad
code_0960:
			pushi    1
			pushi    110
			callb    proc0_5,  2
			bnt      code_0990
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0990
			pushi    1
			pushi    110
			callb    proc0_7,  2
			pushi    4
			pushi    1
			lea      @local496
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_09ad
code_0990:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sag      global108
			bnt      code_09ad
			pushi    #setScript
			pushi    3
			lofsa    walkOut
			push    
			pushi    0
			lsg      global108
			lag      global0
			send     10
code_09ad:
			pushi    #doit
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    20
			pushi    12
			pushi    1
			lag      global100
			send     12
			pushi    #stop
			pushi    0
			lag      global113
			send     4
			pushi    #dispose
			pushi    0
			lofsa    baaSound
			send     4
			pushi    1
			pushi    45
			callb    proc0_6,  2
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0026
			pushi    3
			pushi    1250
			pushi    223
			pushi    1
			calle    proc13_4,  6
			jmp      code_0031
code_0026:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Rm,  6
code_0031:
			ret     
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
		(asm
			ldi      1
			sal      local85
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0a56
			pushi    3
			pushi    1250
			pushi    173
			pushi    1
			calle    proc13_4,  6
			jmp      code_0afc
code_0a56:
			dup     
			ldi      3
			eq?     
			bnt      code_0a6d
			pushi    3
			pushi    1250
			pushi    162
			pushi    1
			calle    proc13_4,  6
			jmp      code_0afc
code_0a6d:
			dup     
			ldi      5
			eq?     
			bnt      code_0a8c
			pushi    5
			pushi    1
			lea      @local197
			push    
			lea      @local518
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0afc
code_0a8c:
			dup     
			ldi      10
			eq?     
			bnt      code_0aa3
			pushi    3
			pushi    1250
			pushi    163
			pushi    1
			calle    proc13_4,  6
			jmp      code_0afc
code_0aa3:
			dup     
			ldi      4
			eq?     
			bnt      code_0af5
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0acb
			pushi    5
			pushi    1
			lea      @local201
			push    
			lea      @local518
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0af1
code_0acb:
			dup     
			ldi      0
			eq?     
			bnt      code_0aea
			pushi    5
			pushi    1
			lea      @local205
			push    
			lea      @local518
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0af1
code_0aea:
			pushi    #doVerb
			pushi    0
			super    Prop,  4
code_0af1:
			toss    
			jmp      code_0afc
code_0af5:
			pushi    #doVerb
			pushi    0
			super    Prop,  4
code_0afc:
			toss    
			ret     
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
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0b89
			pushi    3
			pushi    1250
			pushi    177
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c26
code_0b89:
			dup     
			ldi      3
			eq?     
			bnt      code_0ba0
			pushi    3
			pushi    1250
			pushi    162
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c26
code_0ba0:
			dup     
			ldi      5
			eq?     
			bnt      code_0bbf
			pushi    5
			pushi    1
			lea      @local177
			push    
			lea      @local509
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0c26
code_0bbf:
			dup     
			ldi      10
			eq?     
			bnt      code_0bd6
			pushi    3
			pushi    1250
			pushi    163
			pushi    1
			calle    proc13_4,  6
			jmp      code_0c26
code_0bd6:
			dup     
			ldi      4
			eq?     
			bnt      code_0c1f
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0bfe
			pushi    5
			pushi    1
			lea      @local181
			push    
			lea      @local509
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_0c1b
code_0bfe:
			dup     
			ldi      0
			eq?     
			bnt      code_0c14
			pushi    #setScript
			pushi    1
			lofsa    giveHobBuck
			push    
			lag      global2
			send     6
			jmp      code_0c1b
code_0c14:
			pushi    #doVerb
			pushi    0
			super    Prop,  4
code_0c1b:
			toss    
			jmp      code_0c26
code_0c1f:
			pushi    #doVerb
			pushi    0
			super    Prop,  4
code_0c26:
			toss    
			ret     
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
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0caf
			pushi    3
			pushi    1250
			pushi    180
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d38
code_0caf:
			dup     
			ldi      3
			eq?     
			bnt      code_0cc6
			pushi    3
			pushi    1250
			pushi    162
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d38
code_0cc6:
			dup     
			ldi      5
			eq?     
			bnt      code_0cda
			pushi    #setScript
			pushi    1
			lofsa    talkToDicky
			push    
			self     6
			jmp      code_0d38
code_0cda:
			dup     
			ldi      10
			eq?     
			bnt      code_0cf1
			pushi    3
			pushi    1250
			pushi    163
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d38
code_0cf1:
			dup     
			ldi      4
			eq?     
			bnt      code_0d31
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0d10
			pushi    #setScript
			pushi    1
			lofsa    giveDickHorn
			push    
			lag      global2
			send     6
			jmp      code_0d2d
code_0d10:
			dup     
			ldi      0
			eq?     
			bnt      code_0d26
			pushi    #setScript
			pushi    1
			lofsa    giveDickBuck
			push    
			lag      global2
			send     6
			jmp      code_0d2d
code_0d26:
			pushi    #doVerb
			pushi    0
			super    Prop,  4
code_0d2d:
			toss    
			jmp      code_0d38
code_0d31:
			pushi    #doVerb
			pushi    0
			super    Prop,  4
code_0d38:
			toss    
			ret     
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
		(asm
			ldi      1
			sal      local84
			pushi    #loop
			pushi    0
			self     4
			push    
			ldi      0
			eq?     
			bnt      code_0dc1
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			self     6
code_0dc1:
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0eb5
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_0df3
			pushi    3
			pushi    1250
			pushi    49
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0df3:
			dup     
			ldi      2
			eq?     
			bnt      code_0e09
			pushi    3
			pushi    1250
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e09:
			dup     
			ldi      3
			eq?     
			bnt      code_0e1f
			pushi    3
			pushi    1250
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e1f:
			dup     
			ldi      4
			eq?     
			bnt      code_0e35
			pushi    3
			pushi    1250
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e35:
			dup     
			ldi      5
			eq?     
			bnt      code_0e4b
			pushi    3
			pushi    1250
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e4b:
			dup     
			ldi      6
			eq?     
			bnt      code_0e79
			pushi    1
			pushi    25
			callb    proc0_5,  2
			bnt      code_0e6a
			pushi    3
			pushi    1250
			pushi    50
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e6a:
			pushi    3
			pushi    1250
			pushi    51
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e79:
			dup     
			ldi      9
			eq?     
			bnt      code_0e8f
			pushi    3
			pushi    1250
			pushi    52
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0e8f:
			dup     
			ldi      10
			eq?     
			bnt      code_0ea5
			pushi    3
			pushi    1250
			pushi    53
			pushi    1
			calle    proc13_4,  6
			jmp      code_0eb1
code_0ea5:
			pushi    3
			pushi    1250
			pushi    52
			pushi    1
			calle    proc13_4,  6
code_0eb1:
			toss    
			jmp      code_151f
code_0eb5:
			dup     
			ldi      3
			eq?     
			bnt      code_0ecb
			pushi    3
			pushi    1250
			pushi    54
			pushi    1
			calle    proc13_4,  6
			jmp      code_151f
code_0ecb:
			dup     
			ldi      5
			eq?     
			bnt      code_12ab
			lsg      global130
			dup     
			ldi      1
			eq?     
			bnt      code_0f45
			pushi    1
			pushi    45
			callb    proc0_5,  2
			not     
			bnt      code_0f05
			pushi    1
			pushi    45
			callb    proc0_6,  2
			pushi    6
			pushi    2
			lea      @local245
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_12a7
code_0f05:
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_0f25
			pushi    4
			pushi    1
			lea      @local250
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_12a7
code_0f25:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    6
			pushi    2
			lea      @local254
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_12a7
code_0f45:
			dup     
			ldi      2
			eq?     
			bnt      code_0fb1
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_0f92
			lsg      global126
			ldi      0
			eq?     
			bnt      code_0f76
			pushi    4
			pushi    1
			lea      @local259
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_12a7
code_0f76:
			pushi    6
			pushi    2
			lea      @local263
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_12a7
code_0f92:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    4
			pushi    1
			lea      @local269
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_12a7
code_0fb1:
			dup     
			ldi      5
			eq?     
			bnt      code_0fd7
			pushi    4
			pushi    1
			lea      @local284
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			pushi    1
			pushi    66
			callb    proc0_6,  2
			jmp      code_12a7
code_0fd7:
			dup     
			ldi      6
			eq?     
			bnt      code_1007
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_12a7
			pushi    4
			pushi    1
			lea      @local284
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			pushi    1
			pushi    66
			callb    proc0_6,  2
			jmp      code_12a7
code_1007:
			dup     
			ldi      7
			eq?     
			bnt      code_1128
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_10e7
			pushi    1
			pushi    42
			callb    proc0_5,  2
			not     
			bnt      code_1047
			pushi    #has
			pushi    1
			pushi    4
			lag      global0
			send     6
			not     
			bnt      code_1047
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_1047
			pushi    #setScript
			pushi    1
			lofsa    getNetAfterMary
			push    
			lag      global0
			send     6
			jmp      code_1124
code_1047:
			pushi    1
			pushi    42
			callb    proc0_5,  2
			not     
			bnt      code_107e
			pushi    #has
			pushi    1
			pushi    4
			lag      global0
			send     6
			not     
			bnt      code_107e
			pushi    1
			pushi    34
			callb    proc0_5,  2
			not     
			bnt      code_107e
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    getTheNetJerk
			push    
			lag      global0
			send     6
			jmp      code_1124
code_107e:
			pushi    1
			pushi    34
			callb    proc0_5,  2
			bnt      code_10a0
			pushi    4
			pushi    1
			lea      @local301
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1124
code_10a0:
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_10c5
			pushi    6
			pushi    2
			lea      @local296
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_1124
code_10c5:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    6
			pushi    2
			lea      @local288
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_1124
code_10e7:
			dup     
			ldi      6
			eq?     
			bnt      code_1107
			pushi    4
			pushi    1
			lea      @local321
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1124
code_1107:
			dup     
			ldi      5
			eq?     
			bnt      code_1124
			pushi    4
			pushi    1
			lea      @local321
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
code_1124:
			toss    
			jmp      code_12a7
code_1128:
			dup     
			ldi      9
			eq?     
			bnt      code_1248
			lsg      global126
			dup     
			ldi      0
			eq?     
			bnt      code_117c
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_115a
			pushi    4
			pushi    1
			lea      @local325
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1244
code_115a:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    6
			pushi    2
			lea      @local329
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_1244
code_117c:
			dup     
			ldi      6
			eq?     
			bnt      code_119c
			pushi    4
			pushi    1
			lea      @local321
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1244
code_119c:
			dup     
			ldi      5
			eq?     
			bnt      code_11bc
			pushi    4
			pushi    1
			lea      @local321
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1244
code_11bc:
			dup     
			ldi      3
			eq?     
			bnt      code_11dc
			pushi    4
			pushi    1
			lea      @local335
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1244
code_11dc:
			dup     
			ldi      2
			eq?     
			bnt      code_11fc
			pushi    4
			pushi    1
			lea      @local335
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1244
code_11fc:
			dup     
			ldi      4
			eq?     
			bnt      code_1244
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_1225
			pushi    4
			pushi    1
			lea      @local350
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_1244
code_1225:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    6
			pushi    2
			lea      @local354
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
code_1244:
			toss    
			jmp      code_12a7
code_1248:
			dup     
			ldi      10
			eq?     
			bnt      code_1293
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_1271
			pushi    4
			pushi    1
			lea      @local362
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_12a7
code_1271:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    6
			pushi    2
			lea      @local366
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_12a7
code_1293:
			pushi    4
			pushi    1
			lea      @local250
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
code_12a7:
			toss    
			jmp      code_151f
code_12ab:
			dup     
			ldi      10
			eq?     
			bnt      code_12c1
			pushi    3
			pushi    1250
			pushi    119
			pushi    1
			calle    proc13_4,  6
			jmp      code_151f
code_12c1:
			dup     
			ldi      4
			eq?     
			bnt      code_151f
			pushi    #loop
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_12e6
			pushi    3
			pushi    1250
			pushi    120
			pushi    1
			calle    proc13_4,  6
			jmp      code_151f
code_12e6:
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_1308
			pushi    4
			pushi    1
			lea      @local376
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_1308:
			dup     
			ldi      0
			eq?     
			bnt      code_1328
			pushi    4
			pushi    1
			lea      @local380
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_1328:
			dup     
			ldi      2
			eq?     
			bnt      code_1348
			pushi    4
			pushi    1
			lea      @local384
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_1348:
			dup     
			ldi      3
			eq?     
			bnt      code_1368
			pushi    4
			pushi    1
			lea      @local388
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_1368:
			dup     
			ldi      15
			eq?     
			bnt      code_1388
			pushi    4
			pushi    1
			lea      @local392
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_1388:
			dup     
			ldi      14
			eq?     
			bnt      code_13a8
			pushi    4
			pushi    1
			lea      @local396
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_13a8:
			dup     
			ldi      12
			eq?     
			bnt      code_13fe
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bnt      code_13e2
			pushi    6
			pushi    2
			lea      @local400
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			pushi    #put
			pushi    1
			pushi    12
			lag      global0
			send     6
			jmp      code_151e
code_13e2:
			pushi    6
			pushi    2
			lea      @local405
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_151e
code_13fe:
			dup     
			ldi      10
			eq?     
			bnt      code_141e
			pushi    4
			pushi    1
			lea      @local411
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_141e:
			dup     
			ldi      13
			eq?     
			bnt      code_143e
			pushi    4
			pushi    1
			lea      @local415
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_143e:
			dup     
			ldi      17
			eq?     
			bnt      code_1461
			pushi    6
			pushi    2
			lea      @local423
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_151e
code_1461:
			dup     
			ldi      16
			eq?     
			bnt      code_14ad
			pushi    #has
			pushi    1
			pushi    10
			lag      global0
			send     6
			bnt      code_1491
			pushi    6
			pushi    2
			lea      @local429
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_151e
code_1491:
			pushi    6
			pushi    2
			lea      @local434
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			calle    proc851_0,  12
			jmp      code_151e
code_14ad:
			dup     
			ldi      18
			eq?     
			bnt      code_14cd
			pushi    4
			pushi    1
			lea      @local440
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_14cd:
			dup     
			ldi      4
			eq?     
			bnt      code_1515
			pushi    1
			pushi    66
			callb    proc0_5,  2
			bnt      code_14f6
			pushi    4
			pushi    1
			lea      @local444
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_14f6:
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    4
			pushi    1
			lea      @local448
			push    
			lea      @local500
			push    
			pushi    0
			calle    proc851_0,  8
			jmp      code_151e
code_1515:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_151e:
			toss    
code_151f:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			self     6
			ret     
		)
	)
)

(instance tuckActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_15b3
			pushi    3
			pushi    1250
			pushi    203
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_15e8
code_15b3:
			dup     
			ldi      3
			eq?     
			bnt      code_15cc
			pushi    3
			pushi    1250
			pushi    204
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_15e8
code_15cc:
			dup     
			ldi      5
			eq?     
			bnt      code_15e8
			pushi    5
			pushi    1
			lea      @local479
			push    
			pushi    15
			pushi    0
			pushi    0
			calle    proc851_0,  10
			ldi      1
code_15e8:
			toss    
			ret     
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
		(asm
			ldi      1
			sal      local83
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_164d
			pushi    3
			pushi    1250
			pushi    151
			pushi    1
			calle    proc13_4,  6
			jmp      code_182c
code_164d:
			dup     
			ldi      3
			eq?     
			bnt      code_166c
			pushi    5
			pushi    1
			lea      @local209
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_182c
code_166c:
			dup     
			ldi      5
			eq?     
			bnt      code_1682
			pushi    #setScript
			pushi    1
			lofsa    mouthyLamb
			push    
			lag      global2
			send     6
			jmp      code_182c
code_1682:
			dup     
			ldi      10
			eq?     
			bnt      code_1699
			pushi    3
			pushi    1250
			pushi    153
			pushi    1
			calle    proc13_4,  6
			jmp      code_182c
code_1699:
			dup     
			ldi      4
			eq?     
			bnt      code_1823
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_16c1
			pushi    5
			pushi    1
			lea      @local213
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_16c1:
			dup     
			ldi      0
			eq?     
			bnt      code_16e0
			pushi    5
			pushi    1
			lea      @local217
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_16e0:
			dup     
			ldi      2
			eq?     
			bnt      code_16ff
			pushi    5
			pushi    1
			lea      @local213
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_16ff:
			dup     
			ldi      14
			eq?     
			bnt      code_171e
			pushi    5
			pushi    1
			lea      @local213
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_171e:
			dup     
			ldi      12
			eq?     
			bnt      code_173d
			pushi    5
			pushi    1
			lea      @local213
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_173d:
			dup     
			ldi      10
			eq?     
			bnt      code_175c
			pushi    5
			pushi    1
			lea      @local213
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_175c:
			dup     
			ldi      3
			eq?     
			bnt      code_177b
			pushi    5
			pushi    1
			lea      @local229
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_177b:
			dup     
			ldi      15
			eq?     
			bnt      code_179a
			pushi    5
			pushi    1
			lea      @local233
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_179a:
			dup     
			ldi      13
			eq?     
			bnt      code_17b9
			pushi    5
			pushi    1
			lea      @local221
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_17b9:
			dup     
			ldi      17
			eq?     
			bnt      code_17d8
			pushi    5
			pushi    1
			lea      @local225
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_17d8:
			dup     
			ldi      16
			eq?     
			bnt      code_17f7
			pushi    5
			pushi    1
			lea      @local225
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_17f7:
			dup     
			ldi      4
			eq?     
			bnt      code_1816
			pushi    5
			pushi    1
			lea      @local241
			push    
			lea      @local554
			push    
			pushi    0
			pushi    0
			calle    proc851_0,  10
			jmp      code_181f
code_1816:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_181f:
			toss    
			jmp      code_182c
code_1823:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Prop,  6
code_182c:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #play
			pushi    0
			lofsa    baaSound
			send     4
			pushi    #cycleSpeed
			pushi    1
			pushi    2
			pushi    6
			pushi    24
			callk    Random,  4
			push    
			pushi    150
			pushi    1
			class    Beg
			push    
			self     12
			ret     
		)
	)
)

(instance getTheNetJerk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_18d1
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local288
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_198c
code_18d1:
			dup     
			ldi      1
			eq?     
			bnt      code_18f4
			pushi    7
			pushi    2
			lea      @local305
			push    
			pushi    1
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_198c
code_18f4:
			dup     
			ldi      2
			eq?     
			bnt      code_1921
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_198c
code_1921:
			dup     
			ldi      3
			eq?     
			bnt      code_1943
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    widow
			send     6
			pushi    2
			lsg      global0
			lofsa    widow
			push    
			callb    proc0_9,  4
			ldi      12
			aTop     ticks
			jmp      code_198c
code_1943:
			dup     
			ldi      4
			eq?     
			bnt      code_1966
			pushi    7
			pushi    2
			lea      @local315
			push    
			pushi    1
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_198c
code_1966:
			dup     
			ldi      5
			eq?     
			bnt      code_198c
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    widow
			send     6
			pushi    #get
			pushi    1
			pushi    4
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_198c:
			toss    
			ret     
		)
	)
)

(instance getNetAfterMary of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19f4
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local305
			push    
			pushi    1
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1a8c
code_19f4:
			dup     
			ldi      1
			eq?     
			bnt      code_1a21
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_1a8c
code_1a21:
			dup     
			ldi      2
			eq?     
			bnt      code_1a43
			pushi    #setCycle
			pushi    1
			pushi    0
			lofsa    widow
			send     6
			pushi    2
			lsg      global0
			lofsa    widow
			push    
			callb    proc0_9,  4
			ldi      12
			aTop     ticks
			jmp      code_1a8c
code_1a43:
			dup     
			ldi      3
			eq?     
			bnt      code_1a66
			pushi    7
			pushi    2
			lea      @local315
			push    
			pushi    1
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1a8c
code_1a66:
			dup     
			ldi      4
			eq?     
			bnt      code_1a8c
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			lofsa    widow
			send     6
			pushi    #get
			pushi    1
			pushi    4
			lag      global0
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1a8c:
			toss    
			ret     
		)
	)
)

(instance egoEnters of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1c03
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_3,  0
			lsg      global108
			dup     
			ldi      1
			eq?     
			bnt      code_1b14
			lsg      global104
			ldi      130
			gt?     
			bnt      code_1af3
			ldi      129
			sag      global104
code_1af3:
			pushi    #posn
			pushi    2
			lsg      global104
			pushi    240
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lsg      global104
			pushi    184
			pushSelf
			lag      global0
			send     24
			jmp      code_1bff
code_1b14:
			dup     
			ldi      2
			eq?     
			bnt      code_1b49
			pushi    284
			pushi    2
			pushi    1
			lsg      global105
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    26
			lsg      global105
			ldi      170
			lt?     
			bnt      code_1b3e
			ldi      170
			jmp      code_1b40
code_1b3e:
			lag      global105
code_1b40:
			push    
			pushSelf
			lag      global0
			send     24
			jmp      code_1bff
code_1b49:
			dup     
			ldi      3
			eq?     
			bnt      code_1b97
			lsg      global104
			ldi      180
			lt?     
			bnt      code_1b77
			pushi    #posn
			pushi    2
			pushi    65
			pushi    107
			dup     
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    65
			pushi    112
			pushSelf
			lag      global0
			send     24
			jmp      code_1bff
code_1b77:
			pushi    #posn
			pushi    2
			pushi    265
			pushi    107
			dup     
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    268
			pushi    112
			pushSelf
			lag      global0
			send     24
			jmp      code_1bff
code_1b97:
			dup     
			ldi      4
			eq?     
			bnt      code_1bdd
			lsg      global105
			ldi      137
			gt?     
			bnt      code_1bac
			ldi      136
			sag      global105
code_1bac:
			lsg      global105
			ldi      106
			lt?     
			bnt      code_1bb8
			ldi      106
			sag      global105
code_1bb8:
			pushi    284
			pushi    #-info-
			pushi    318
			lsg      global105
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    298
			lsg      global105
			ldi      5
			add     
			push    
			pushSelf
			lag      global0
			send     24
			jmp      code_1bff
code_1bdd:
			pushi    #posn
			pushi    2
			pushi    1
			pushi    185
			pushi    6
			pushi    1
			pushi    3
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    26
			pushi    185
			pushSelf
			lag      global0
			send     30
code_1bff:
			toss    
			jmp      code_1cfe
code_1c03:
			dup     
			ldi      1
			eq?     
			bnt      code_1c41
			pushi    1
			pushi    179
			callb    proc0_5,  2
			bnt      code_1c38
			pushi    1
			pushi    179
			callb    proc0_7,  2
			pushi    2
			pushi    1250
			pushi    201
			calle    proc13_4,  4
			pushi    2
			pushi    1250
			pushi    202
			calle    proc13_4,  4
			ldi      1
			aTop     cycles
			jmp      code_1cfe
code_1c38:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1cfe
code_1c41:
			dup     
			ldi      2
			eq?     
			bnt      code_1ce6
			lsg      global130
			dup     
			ldi      3
			eq?     
			bnt      code_1c8f
			pushi    1
			pushi    66
			callb    proc0_5,  2
			not     
			bnt      code_1c86
			lsg      global126
			ldi      1
			eq?     
			bnt      code_1c86
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    7
			pushi    2
			lea      @local273
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1ce2
code_1c86:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1ce2
code_1c8f:
			dup     
			ldi      9
			eq?     
			bnt      code_1cdc
			pushi    1
			pushi    66
			callb    proc0_5,  2
			not     
			bnt      code_1cd3
			lsg      global126
			ldi      3
			eq?     
			bt       code_1cad
			lsg      global126
			ldi      2
			eq?     
code_1cad:
			bnt      code_1cd3
			pushi    1
			pushi    66
			callb    proc0_6,  2
			pushi    7
			pushi    2
			lea      @local339
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_1ce2
code_1cd3:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1ce2
code_1cdc:
			pushi    #cue
			pushi    0
			self     4
code_1ce2:
			toss    
			jmp      code_1cfe
code_1ce6:
			dup     
			ldi      3
			eq?     
			bnt      code_1cfe
			pushi    0
			callb    proc0_2,  0
			pushi    #cue
			pushi    0
			lal      local0
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_1cfe:
			toss    
			ret     
		)
	)
)

(instance walkOut of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1db9
			pushi    0
			callb    proc0_3,  0
			pushi    #x
			pushi    0
			lag      global0
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lag      global0
			send     4
			sat      temp1
			pTos     register
			dup     
			ldi      3
			eq?     
			bnt      code_1d6f
			ldi      240
			sat      temp1
			jmp      code_1d8e
code_1d6f:
			dup     
			ldi      2
			eq?     
			bnt      code_1d80
			lst      temp0
			ldi      20
			add     
			sat      temp0
			jmp      code_1d8e
code_1d80:
			dup     
			ldi      4
			eq?     
			bnt      code_1d8e
			lst      temp0
			ldi      20
			sub     
			sat      temp0
code_1d8e:
			toss    
			pTos     register
			ldi      1
			ne?     
			bnt      code_1db0
			pushi    #ignoreActors
			pushi    1
			pushi    1
			pushi    283
			pushi    4
			class    PolyPath
			push    
			lst      temp0
			lst      temp1
			pushSelf
			lag      global0
			send     18
			jmp      code_1e38
code_1db0:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1e38
code_1db9:
			dup     
			ldi      1
			eq?     
			bnt      code_1dfa
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    46
			callb    proc0_5,  2
			bnt      code_1de7
			pushi    1
			pushi    44
			callb    proc0_5,  2
			bnt      code_1de7
			lsg      global130
			ldi      1
			eq?     
			bnt      code_1de7
			pushi    #cue
			pushi    0
			self     4
			jmp      code_1e38
code_1de7:
			pushi    #newRoom
			pushi    1
			pushi    220
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_1e38
code_1dfa:
			dup     
			ldi      2
			eq?     
			bnt      code_1e1c
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    #drawPic
			pushi    1
			pushi    803
			lag      global2
			send     6
			ldi      60
			aTop     ticks
			jmp      code_1e38
code_1e1c:
			dup     
			ldi      3
			eq?     
			bnt      code_1e38
			pushi    #style
			pushi    1
			pushi    8
			pushi    377
			pushi    1
			pushi    160
			lag      global2
			send     12
			pushi    #dispose
			pushi    0
			self     4
code_1e38:
			toss    
			ret     
		)
	)
)

(instance handOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1e83
			jmp      code_1e93
code_1e83:
			dup     
			ldi      1
			eq?     
			bnt      code_1e93
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1e93:
			toss    
			ret     
		)
	)
)

(instance firstTime of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1edf
			jmp      code_1f85
code_1edf:
			dup     
			ldi      1
			eq?     
			bnt      code_1ef7
			pushi    2
			lsg      global0
			lofsa    widow
			push    
			callb    proc0_9,  4
			ldi      18
			aTop     ticks
			jmp      code_1f85
code_1ef7:
			dup     
			ldi      2
			eq?     
			bnt      code_1f21
			pushi    9
			pushi    3
			lea      @local89
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			lea      @local518
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_1f85
code_1f21:
			dup     
			ldi      3
			eq?     
			bnt      code_1f53
			pushi    11
			pushi    4
			lea      @local98
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			lea      @local509
			push    
			pushi    2
			lea      @local527
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_1f85
code_1f53:
			dup     
			ldi      4
			eq?     
			bnt      code_1f75
			pushi    7
			pushi    2
			lea      @local106
			push    
			lsl      local82
			pushi    0
			lea      @local518
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_1f85
code_1f75:
			dup     
			ldi      5
			eq?     
			bnt      code_1f85
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1f85:
			toss    
			ret     
		)
	)
)

(instance boysBusted of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1fd1
			jmp      code_2051
code_1fd1:
			dup     
			ldi      1
			eq?     
			bnt      code_2002
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      30
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_2051
code_2002:
			dup     
			ldi      2
			eq?     
			bnt      code_201a
			pushi    2
			lsg      global0
			lofsa    widow
			push    
			callb    proc0_9,  4
			ldi      18
			aTop     ticks
			jmp      code_2051
code_201a:
			dup     
			ldi      3
			eq?     
			bnt      code_2041
			pushi    9
			pushi    3
			lea      @local452
			push    
			pushi    2
			pushi    0
			pushi    15
			pushi    1
			lea      @local500
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_2051
code_2041:
			dup     
			ldi      4
			eq?     
			bnt      code_2051
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2051:
			toss    
			ret     
		)
	)
)

(instance boysSaved of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_209d
			jmp      code_22f8
code_209d:
			dup     
			ldi      1
			eq?     
			bnt      code_20ce
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			add     
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      30
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_22f8
code_20ce:
			dup     
			ldi      2
			eq?     
			bnt      code_20e6
			pushi    2
			lsg      global0
			lofsa    widow
			push    
			callb    proc0_9,  4
			ldi      18
			aTop     ticks
			jmp      code_22f8
code_20e6:
			dup     
			ldi      3
			eq?     
			bnt      code_2154
			lsg      global12
			ldi      179
			eq?     
			bnt      code_2121
			pushi    11
			pushi    4
			lea      @local131
			push    
			lsl      local82
			pushi    0
			lea      @local500
			push    
			pushi    1
			lea      @local518
			push    
			pushi    2
			lea      @local509
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_22f8
code_2121:
			pushi    13
			pushi    5
			lea      @local111
			push    
			pushi    3
			pushi    0
			lea      @local500
			push    
			pushi    1
			lea      @local518
			push    
			pushi    2
			lea      @local509
			push    
			pushi    3
			lea      @local527
			push    
			pushi    4
			pushSelf
			calle    proc851_0,  26
			jmp      code_22f8
code_2154:
			dup     
			ldi      4
			eq?     
			bnt      code_2190
			lsg      global12
			ldi      179
			eq?     
			bnt      code_2187
			pushi    9
			pushi    3
			lea      @local142
			push    
			pushi    3
			pushi    0
			lea      @local500
			push    
			pushi    1
			lea      @local509
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_22f8
code_2187:
			pushi    #cue
			pushi    0
			self     4
			jmp      code_22f8
code_2190:
			dup     
			ldi      5
			eq?     
			bnt      code_21bd
			pushi    283
			pushi    #x
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lofsa    widow
			send     4
			push    
			pushi    #y
			pushi    0
			lofsa    widow
			send     4
			push    
			ldi      10
			add     
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_22f8
code_21bd:
			dup     
			ldi      6
			eq?     
			bnt      code_21df
			pushi    2
			lsg      global0
			lofsa    widow
			push    
			callb    proc0_9,  4
			pushi    #get
			pushi    1
			pushi    4
			lag      global0
			send     6
			ldi      12
			aTop     ticks
			jmp      code_22f8
code_21df:
			dup     
			ldi      7
			eq?     
			bnt      code_2210
			pushi    #number
			pushi    1
			pushi    916
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global113
			send     16
			lsg      global15
			ldi      50
			add     
			sag      global15
			pushi    #doit
			pushi    0
			pushi    2
			pushi    0
			pushi    1
			callk    ScriptID,  4
			send     4
			ldi      6
			aTop     ticks
			jmp      code_22f8
code_2210:
			dup     
			ldi      8
			eq?     
			bnt      code_2256
			lsg      global12
			ldi      179
			eq?     
			bnt      code_223b
			pushi    7
			pushi    2
			lea      @local150
			push    
			pushi    3
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_22f8
code_223b:
			pushi    7
			pushi    2
			lea      @local125
			push    
			pushi    3
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_22f8
code_2256:
			dup     
			ldi      9
			eq?     
			bnt      code_22b5
			pushi    1
			pushi    3
			calle    proc806_5,  2
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    hal
			send     6
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    hob
			send     6
			pushi    #setCycle
			pushi    1
			class    End
			push    
			lofsa    dicken
			send     6
			pushi    283
			pushi    3
			class    PolyPath
			push    
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			ldi      30
			sub     
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      15
			add     
			push    
			lag      global0
			send     10
			ldi      120
			aTop     ticks
			jmp      code_22f8
code_22b5:
			dup     
			ldi      10
			eq?     
			bnt      code_22e6
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lag      global0
			send     12
			pushi    #eachElementDo
			pushi    1
			pushi    105
			lag      global5
			send     6
			pushi    4
			pushi    803
			pushi    8
			pushi    1
			pushi    0
			callk    DrawPic,  8
			ldi      18
			aTop     ticks
			jmp      code_22f8
code_22e6:
			dup     
			ldi      11
			eq?     
			bnt      code_22f8
			pushi    #newRoom
			pushi    1
			pushi    160
			lag      global2
			send     6
code_22f8:
			toss    
			ret     
		)
	)
)

(instance mouthyLamb of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2363
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local157
			push    
			lea      @local500
			push    
			pushi    0
			lea      @local554
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_2373
code_2363:
			dup     
			ldi      1
			eq?     
			bnt      code_2373
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2373:
			toss    
			ret     
		)
	)
)

(instance talkToDicky of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_23df
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local165
			push    
			lea      @local500
			push    
			pushi    0
			lea      @local527
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_23ef
code_23df:
			dup     
			ldi      1
			eq?     
			bnt      code_23ef
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_23ef:
			toss    
			ret     
		)
	)
)

(instance giveHobBuck of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_245b
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local171
			push    
			lea      @local500
			push    
			pushi    0
			lea      @local509
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_246b
code_245b:
			dup     
			ldi      1
			eq?     
			bnt      code_246b
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_246b:
			toss    
			ret     
		)
	)
)

(instance giveDickBuck of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_24d7
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local185
			push    
			lea      @local500
			push    
			pushi    0
			lea      @local527
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_24e7
code_24d7:
			dup     
			ldi      1
			eq?     
			bnt      code_24e7
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_24e7:
			toss    
			ret     
		)
	)
)

(instance giveDickHorn of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2553
			pushi    0
			callb    proc0_3,  0
			pushi    7
			pushi    2
			lea      @local191
			push    
			lea      @local500
			push    
			pushi    0
			lea      @local527
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_2563
code_2553:
			dup     
			ldi      1
			eq?     
			bnt      code_2563
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2563:
			toss    
			ret     
		)
	)
)

(instance tuckChill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_260c
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_25e5
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bt       code_25e5
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_25e5
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_25e5:
			bnt      code_25f8
			pushi    #view
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    0
			lag      global0
			send     12
			jmp      code_2605
code_25f8:
			pushi    #view
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    1
			lag      global0
			send     12
code_2605:
			ldi      60
			aTop     ticks
			jmp      code_266a
code_260c:
			dup     
			ldi      1
			eq?     
			bnt      code_2629
			pushi    5
			pushi    1
			lea      @local468
			push    
			pushi    15
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_266a
code_2629:
			dup     
			ldi      2
			eq?     
			bnt      code_2637
			ldi      30
			aTop     ticks
			jmp      code_266a
code_2637:
			dup     
			ldi      3
			eq?     
			bnt      code_2656
			pushi    7
			pushi    2
			lea      @local472
			push    
			pushi    2
			pushi    0
			pushi    15
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_266a
code_2656:
			dup     
			ldi      4
			eq?     
			bnt      code_266a
			pushi    0
			callb    proc0_2,  0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_266a:
			toss    
			ret     
		)
	)
)

(instance widowChill of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_2712
			pushi    0
			callb    proc0_3,  0
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      0
			eq?     
			bt       code_26eb
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      3
			eq?     
			bt       code_26eb
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      4
			eq?     
			bt       code_26eb
			pushi    #loop
			pushi    0
			lag      global0
			send     4
			push    
			ldi      6
			eq?     
code_26eb:
			bnt      code_26fe
			pushi    #view
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    0
			lag      global0
			send     12
			jmp      code_270b
code_26fe:
			pushi    #view
			pushi    1
			pushi    10
			pushi    6
			pushi    1
			pushi    1
			lag      global0
			send     12
code_270b:
			ldi      30
			aTop     ticks
			jmp      code_2750
code_2712:
			dup     
			ldi      1
			eq?     
			bnt      code_2735
			pushi    7
			pushi    2
			lea      @local460
			push    
			pushi    2
			pushi    0
			lea      @local500
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  14
			jmp      code_2750
code_2735:
			dup     
			ldi      2
			eq?     
			bnt      code_2750
			pushi    0
			callb    proc0_2,  0
			pushi    1
			pushi    185
			callb    proc0_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_2750:
			toss    
			ret     
		)
	)
)

(instance widowBlow of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_2846
			lsp      param2
			ldi      1
			eq?     
			bnt      code_2846
			lsg      global130
			ldi      5
			eq?     
			bnt      code_27d0
			pushi    #contains
			pushi    1
			pushi    1
			pushi    23
			callk    ScriptID,  2
			push    
			lag      global5
			send     6
			bnt      code_27d0
			lal      local88
			not     
			bnt      code_27d0
			ldi      1
			sal      local88
			pushi    #setScript
			pushi    1
			lofsa    tuckChill
			push    
			lag      global0
			send     6
			ldi      1
			jmp      code_2846
code_27d0:
			lsg      global130
			ldi      5
			eq?     
			bnt      code_27ea
			pushi    3
			pushi    1250
			pushi    188
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2846
code_27ea:
			lsg      global130
			ldi      6
			eq?     
			bnt      code_280e
			pushi    1
			pushi    25
			callb    proc0_5,  2
			not     
			bnt      code_280e
			pushi    3
			pushi    1250
			pushi    189
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2846
code_280e:
			pushi    1
			pushi    185
			callb    proc0_5,  2
			bnt      code_282a
			pushi    3
			pushi    1250
			pushi    191
			pushi    1
			calle    proc13_4,  6
			ldi      1
			jmp      code_2846
code_282a:
			pushi    #contains
			pushi    1
			lofsa    widow
			push    
			lag      global5
			send     6
			bnt      code_2846
			pushi    #setScript
			pushi    1
			lofsa    widowChill
			push    
			lag      global0
			send     6
			ldi      1
code_2846:
			ret     
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
		(asm
			pushi    #setCycle
			pushi    1
			class    Fwd
			push    
			self     6
			pushi    #init
			pushi    0
			super    Prop,  4
			ret     
		)
	)
	
	(method (doVerb)
		(asm
			pushi    #doVerb
			pushi    0
			super    Prop,  4
			ret     
		)
	)
)

(instance noGoat of Feature
	(properties
		y 130
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    14
			pushi    272
			pushi    117
			pushi    250
			pushi    125
			pushi    224
			pushi    120
			pushi    223
			pushi    92
			pushi    240
			pushi    103
			pushi    252
			pushi    106
			pushi    272
			pushi    101
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     42
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_296f
			pushi    3
			pushi    1250
			pushi    205
			pushi    1
			calle    proc13_4,  6
			jmp      code_2991
code_296f:
			dup     
			ldi      3
			eq?     
			bnt      code_2986
			pushi    3
			pushi    1250
			pushi    206
			pushi    1
			calle    proc13_4,  6
			jmp      code_2991
code_2986:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2991:
			toss    
			ret     
		)
	)
)

(instance roof of Feature
	(properties
		y 85
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    36
			pushi    276
			pushi    99
			pushi    252
			pushi    105
			pushi    243
			pushi    104
			pushi    222
			pushi    91
			pushi    183
			pushi    97
			pushi    176
			pushi    92
			pushi    166
			pushi    94
			pushi    88
			pushi    76
			pushi    91
			pushi    70
			pushi    82
			pushi    65
			pushi    108
			pushi    51
			pushi    129
			pushi    26
			pushi    168
			pushi    25
			pushi    168
			pushi    19
			pushi    186
			pushi    20
			pushi    187
			pushi    24
			pushi    212
			pushi    24
			pushi    262
			pushi    89
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     86
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2a68
			pushi    3
			pushi    1250
			pushi    207
			pushi    1
			calle    proc13_4,  6
			jmp      code_2a8a
code_2a68:
			dup     
			ldi      3
			eq?     
			bnt      code_2a7f
			pushi    3
			pushi    1250
			pushi    208
			pushi    1
			calle    proc13_4,  6
			jmp      code_2a8a
code_2a7f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2a8a:
			toss    
			ret     
		)
	)
)

(instance theWoods of Feature
	(properties
		y 25
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    20
			pushi    81
			pushi    80
			pushi    0
			pushi    80
			pushi    0
			pushi    0
			pushi    319
			pushi    0
			pushi    319
			pushi    106
			pushi    263
			pushi    89
			pushi    212
			pushi    23
			pushi    133
			pushi    27
			pushi    109
			pushi    49
			pushi    81
			pushi    65
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     54
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2b33
			pushi    3
			pushi    1250
			pushi    209
			pushi    1
			calle    proc13_4,  6
			jmp      code_2b3e
code_2b33:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2b3e:
			toss    
			ret     
		)
	)
)

(instance eastWall of Feature
	(properties
		y 130
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    12
			pushi    221
			pushi    117
			pushi    161
			pushi    127
			pushi    161
			pushi    92
			pushi    178
			pushi    93
			pushi    185
			pushi    99
			pushi    222
			pushi    94
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     38
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2bdc
			pushi    3
			pushi    1250
			pushi    210
			pushi    1
			calle    proc13_4,  6
			jmp      code_2bfe
code_2bdc:
			dup     
			ldi      3
			eq?     
			bnt      code_2bf3
			pushi    3
			pushi    1250
			pushi    211
			pushi    1
			calle    proc13_4,  6
			jmp      code_2bfe
code_2bf3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2bfe:
			toss    
			ret     
		)
	)
)

(instance midWall of Feature
	(properties
		y 115
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    160
			pushi    127
			pushi    129
			pushi    119
			pushi    131
			pushi    87
			pushi    160
			pushi    93
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2c92
			pushi    3
			pushi    1250
			pushi    210
			pushi    1
			calle    proc13_4,  6
			jmp      code_2cb4
code_2c92:
			dup     
			ldi      3
			eq?     
			bnt      code_2ca9
			pushi    3
			pushi    1250
			pushi    211
			pushi    1
			calle    proc13_4,  6
			jmp      code_2cb4
code_2ca9:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2cb4:
			toss    
			ret     
		)
	)
)

(instance westWall of Feature
	(properties
		y 100
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    120
			pushi    116
			pushi    92
			pushi    106
			pushi    93
			pushi    101
			pushi    83
			pushi    96
			pushi    83
			pushi    69
			pushi    89
			pushi    71
			pushi    85
			pushi    75
			pushi    120
			pushi    85
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2d54
			pushi    3
			pushi    1250
			pushi    210
			pushi    1
			calle    proc13_4,  6
			jmp      code_2d76
code_2d54:
			dup     
			ldi      3
			eq?     
			bnt      code_2d6b
			pushi    3
			pushi    1250
			pushi    211
			pushi    1
			calle    proc13_4,  6
			jmp      code_2d76
code_2d6b:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2d76:
			toss    
			ret     
		)
	)
)

(instance door of Feature
	(properties
		y 120
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    129
			pushi    86
			pushi    128
			pushi    121
			pushi    120
			pushi    118
			pushi    120
			pushi    84
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2e08
			pushi    3
			pushi    1250
			pushi    212
			pushi    1
			calle    proc13_4,  6
			jmp      code_2e2a
code_2e08:
			dup     
			ldi      3
			eq?     
			bnt      code_2e1f
			pushi    3
			pushi    1250
			pushi    213
			pushi    1
			calle    proc13_4,  6
			jmp      code_2e2a
code_2e1f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2e2a:
			toss    
			ret     
		)
	)
)

(instance chimney of Feature
	(properties
		y 30
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    8
			pushi    187
			pushi    24
			pushi    168
			pushi    25
			pushi    168
			pushi    19
			pushi    185
			pushi    20
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     30
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2ebe
			pushi    3
			pushi    1250
			pushi    214
			pushi    1
			calle    proc13_4,  6
			jmp      code_2ee0
code_2ebe:
			dup     
			ldi      3
			eq?     
			bnt      code_2ed5
			pushi    3
			pushi    1250
			pushi    215
			pushi    1
			calle    proc13_4,  6
			jmp      code_2ee0
code_2ed5:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2ee0:
			toss    
			ret     
		)
	)
)

(instance rock of Feature
	(properties
		y 130
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    16
			pushi    48
			pushi    125
			pushi    38
			pushi    127
			pushi    32
			pushi    121
			pushi    0
			pushi    121
			pushi    0
			pushi    112
			pushi    8
			pushi    105
			pushi    21
			pushi    104
			pushi    34
			pushi    108
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     46
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_2f7e
			pushi    3
			pushi    1250
			pushi    216
			pushi    1
			calle    proc13_4,  6
			jmp      code_2fa0
code_2f7e:
			dup     
			ldi      3
			eq?     
			bnt      code_2f95
			pushi    3
			pushi    1250
			pushi    217
			pushi    1
			calle    proc13_4,  6
			jmp      code_2fa0
code_2f95:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_2fa0:
			toss    
			ret     
		)
	)
)

(instance stream of Feature
	(properties
		y 150
	)
	
	(method (init)
		(asm
			pushi    #type
			pushi    1
			pushi    0
			pushi    107
			pushi    18
			pushi    273
			pushi    93
			pushi    319
			pushi    107
			pushi    319
			pushi    145
			pushi    214
			pushi    189
			pushi    156
			pushi    189
			pushi    265
			pushi    147
			pushi    294
			pushi    144
			pushi    308
			pushi    129
			pushi    297
			pushi    107
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			aTop     onMeCheck
			send     50
			pushi    #init
			pushi    0
			super    Feature,  4
			ret     
		)
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_3053
			pushi    3
			pushi    1250
			pushi    218
			pushi    1
			calle    proc13_4,  6
			jmp      code_30cf
code_3053:
			dup     
			ldi      3
			eq?     
			bnt      code_306a
			pushi    3
			pushi    1250
			pushi    219
			pushi    1
			calle    proc13_4,  6
			jmp      code_30cf
code_306a:
			dup     
			ldi      5
			eq?     
			bnt      code_3097
			pushi    2
			pushi    1250
			pushi    220
			calle    proc13_4,  4
			pushi    1
			pushi    24
			calle    proc13_6,  2
			pushi    2
			pushi    1250
			pushi    221
			calle    proc13_4,  4
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_30cf
code_3097:
			dup     
			ldi      4
			eq?     
			bnt      code_30c4
			lsp      param2
			ldi      18
			eq?     
			bnt      code_30b6
			pushi    3
			pushi    1250
			pushi    222
			pushi    1
			calle    proc13_4,  6
			jmp      code_30cf
code_30b6:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
			jmp      code_30cf
code_30c4:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Feature,  6
code_30cf:
			toss    
			ret     
		)
	)
)

(instance baaSound of Sound
	(properties
		flags $0001
		number 936
	)
)
