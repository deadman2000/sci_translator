;;; Sierra Script 1.0 - (do not remove this comment)
(script# 420)
(include sci.sh)
(use n000)
(use n851)
(use n958)
(use n994)
(use n998)
(use n999)

(public
	jment 0
)

(local
	[local0 9] = [43 0 2 4 25 37 21 25 28]
	[local9 9] = [44 0 2 4 27 37 21 25 20]
	[local18 9] = [58 0 2 4 22 36 22 26 26]
	[local27 9] = [59 0 2 4 21 32 20 23 31]
	[local36 9] = [131 0 2 4 24 38 23 27 14]
	[local45 9] = [133 3 2 4 24 37 20 24 16]
	[local54 9] = [135 0 2 4 14 37 14 26 15]
	[local63 9] = [253 0 2 4 21 37 19 27 10]
	[local72 9] = [431 0 2 4 21 32 23 25 25]
	[local81 9] = [673 0 2 4 18 33 21 20 21]
	[local90 9] = [-1 3854 27]
	[local99 9] = [-1 3862 6]
	[local108 7] = [1420 0 1 1 1 1]
	[local115 12] = [1420 4 2 2 2 2 1 1 1 1 1]
	[local127 13] = [1420 13 1 1 2 2 2 3 3 1 4 4]
	[local140 4] = [1420 23 1]
	[local144 11] = [1420 24 1 2 2 2 3 3 3 4]
	[local155 6] = [1420 32 1 2 3]
	[local161 4] = [1420 35 1]
	[local165 6] = [1420 36 1 2 3]
	[local171 7] = [1420 39 1 1 2 3]
	[local178 5] = [1420 43 1 2]
	[local183 12] = [1420 45 1 2 2 2 3 3 3 4 3]
	[local195 5] = [1420 54 1 1]
	[local200 5] = [1420 56 1 1]
	[local205 5] = [1420 58 1 1]
	[local210 4] = [1420 60 1]
	[local214 10] = [1420 61 1 1 1 2 1 1 3]
	[local224 5] = [1420 68 1 1]
	[local229 6] = [1420 70 1 2 2]
	[local235 15] = [1420 73 1 2 3 1 1 1 2 2 2 2 2 2]
	[local250 4] = [1420 85 1]
	[local254 5] = [1420 86 1 1]
)
(instance jment of Rm
	(properties
		picture 420
		style $800a
	)
	
	(method (init param1)
		(asm
			pushi    2
			pushi    129
			pushi    420
			callk    Load,  4
			pushi    15
			pushi    128
			pushi    420
			pushi    423
			pushi    425
			pushi    422
			pushi    43
			pushi    44
			pushi    58
			pushi    59
			pushi    131
			pushi    133
			pushi    135
			pushi    253
			pushi    431
			pushi    673
			calle    proc958_0,  30
			pushi    2
			pushi    132
			pushi    5
			calle    proc958_0,  4
			pushi    #init
			pushi    0
			&rest    param1
			super    Rm,  4
			pushi    #disable
			pushi    8
			pushi    0
			pushi    1
			pushi    2
			pushi    3
			pushi    4
			pushi    5
			pushi    6
			pushi    7
			lag      global69
			send     20
			pushi    0
			callb    proc0_3,  0
			pushi    #number
			pushi    1
			pushi    5
			pushi    6
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			pushi    158
			pushi    1
			pushi    1
			pushi    159
			pushi    4
			pushi    127
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     34
			pushi    1
			pushi    174
			callb    proc0_5,  2
			bnt      code_00ae
			pushi    #add
			pushi    1
			lofsa    poacher
			push    
			lag      global10
			send     6
code_00ae:
			pushi    1
			pushi    173
			callb    proc0_5,  2
			bnt      code_00c3
			pushi    #add
			pushi    1
			lofsa    peasant
			push    
			lag      global10
			send     6
code_00c3:
			pushi    1
			pushi    54
			callb    proc0_5,  2
			bnt      code_00d7
			pushi    #add
			pushi    1
			lofsa    beggar
			push    
			lag      global10
			send     6
code_00d7:
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_00eb
			pushi    #add
			pushi    1
			lofsa    marianM
			push    
			lag      global10
			send     6
code_00eb:
			pushi    1
			pushi    191
			callb    proc0_5,  2
			not     
			bnt      code_0101
			pushi    #add
			pushi    1
			lofsa    yeoman
			push    
			lag      global10
			send     6
code_0101:
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_0115
			pushi    #add
			pushi    1
			lofsa    jeweller
			push    
			lag      global10
			send     6
code_0115:
			pushi    #add
			pushi    22
			lofsa    robinH
			push    
			lofsa    guardR
			push    
			lofsa    guardL
			push    
			lofsa    guardD
			push    
			lofsa    bench1
			push    
			lofsa    bench2
			push    
			lofsa    spect1
			push    
			lofsa    spect2
			push    
			lofsa    spect3
			push    
			lofsa    spect4
			push    
			lofsa    spect5
			push    
			lofsa    spect6
			push    
			lofsa    spect7
			push    
			lofsa    spect8
			push    
			lofsa    tuckie
			push    
			lofsa    widow
			push    
			lofsa    lobb
			push    
			lofsa    fulkie
			push    
			lofsa    sheriff
			push    
			lofsa    abbot
			push    
			lofsa    monk
			push    
			lofsa    prior
			push    
			pushi    116
			pushi    1
			pushi    107
			pushi    60
			pushi    0
			lag      global10
			send     58
			pushi    #init
			pushi    0
			lofsa    kingRichie
			send     4
			pushi    #init
			pushi    0
			lofsa    scribe
			send     4
			pushi    #setScript
			pushi    1
			lofsa    debateIssue
			push    
			lag      global2
			send     6
			ret     
		)
	)
)

(instance robinH of PicView
	(properties
		x 88
		y 167
		view 420
		loop 10
		priority 11
		signal $0010
	)
)

(instance guardR of PicView
	(properties
		x 100
		y 210
		view 420
		loop 9
		priority 14
		signal $0010
	)
)

(instance guardL of PicView
	(properties
		x 13
		y 176
		view 420
		loop 9
		priority 13
		signal $0010
	)
)

(instance guardD of PicView
	(properties
		x 73
		y 122
		view 420
		loop 9
		priority 0
		signal $0010
	)
)

(instance bench1 of PicView
	(properties
		x 261
		y 187
		view 420
		loop 11
		priority 14
		signal $0010
	)
)

(instance bench2 of PicView
	(properties
		x 297
		y 185
		view 420
		loop 11
		priority 14
		signal $0010
	)
)

(instance spect1 of PicView
	(properties
		x 51
		y 32
		view 420
		loop 2
		priority 0
		signal $0010
	)
)

(instance spect2 of PicView
	(properties
		x 99
		y 19
		view 420
		loop 3
		priority 0
		signal $0010
	)
)

(instance spect3 of PicView
	(properties
		x 163
		y 9
		view 420
		loop 5
		priority 0
		signal $0010
	)
)

(instance spect4 of PicView
	(properties
		x 208
		y 11
		view 420
		loop 5
		cel 1
		priority 0
		signal $0010
	)
)

(instance spect5 of PicView
	(properties
		x 271
		y 18
		view 420
		loop 4
		priority 0
		signal $0010
	)
)

(instance spect6 of PicView
	(properties
		x 304
		y 14
		view 420
		loop 4
		cel 1
		priority 0
		signal $0010
	)
)

(instance spect7 of PicView
	(properties
		x 294
		y 189
		view 420
		loop 6
		priority 14
		signal $0010
	)
)

(instance spect8 of PicView
	(properties
		x 253
		y 189
		view 420
		loop 7
		priority 14
		signal $0010
	)
)

(instance marianM of PicView
	(properties
		x 127
		y 122
		view 423
		priority 8
		signal $0010
	)
)

(instance tuckie of PicView
	(properties
		x 150
		y 111
		view 423
		loop 1
		priority 6
		signal $0010
	)
)

(instance widow of PicView
	(properties
		x 163
		y 122
		view 423
		loop 2
		priority 6
		signal $0010
	)
)

(instance lobb of PicView
	(properties
		x 113
		y 111
		view 423
		loop 3
		priority 6
		signal $0010
	)
)

(instance poacher of PicView
	(properties
		x 143
		y 109
		view 423
		loop 5
		priority 6
		signal $0010
	)
)

(instance peasant of PicView
	(properties
		x 140
		y 118
		view 423
		loop 6
		priority 7
		signal $0010
	)
)

(instance yeoman of PicView
	(properties
		x 154
		y 100
		view 423
		loop 7
		priority 6
		signal $0010
	)
)

(instance jeweller of PicView
	(properties
		x 104
		y 122
		view 423
		loop 8
		priority 7
		signal $0010
	)
)

(instance beggar of PicView
	(properties
		x 177
		y 115
		view 423
		loop 9
		priority 0
		signal $0010
	)
)

(instance fulkie of PicView
	(properties
		x 196
		y 117
		view 423
		loop 10
		priority 7
		signal $0010
	)
)

(instance sheriff of PicView
	(properties
		x 251
		y 139
		view 425
		priority 9
		signal $0010
	)
)

(instance abbot of PicView
	(properties
		x 266
		y 134
		view 425
		cel 1
		priority 8
		signal $0010
	)
)

(instance monk of PicView
	(properties
		x 307
		y 135
		view 425
		cel 2
		priority 9
		signal $0010
	)
)

(instance prior of PicView
	(properties
		x 292
		y 130
		view 425
		loop 1
		cel 3
		priority 8
		signal $0010
	)
)

(instance scribe of Prop
	(properties
		x 268
		y 142
		view 420
		priority 9
		signal $0010
	)
)

(instance kingRichie of Prop
	(properties
		x 212
		y 108
		view 422
		priority 6
		signal $0010
	)
)

(instance debateIssue of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a9f
			ldi      90
			aTop     ticks
			jmp      code_0ed2
code_0a9f:
			dup     
			ldi      1
			eq?     
			bnt      code_0abc
			pushi    5
			pushi    1
			lea      @local108
			push    
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0abc:
			dup     
			ldi      2
			eq?     
			bnt      code_0ae2
			pushi    #release
			pushi    0
			lag      global100
			send     4
			pushi    7
			pushi    2
			lea      @local115
			push    
			lea      @local27
			push    
			pushi    1
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ed2
code_0ae2:
			dup     
			ldi      3
			eq?     
			bnt      code_0b0e
			pushi    11
			pushi    4
			lea      @local127
			push    
			pushi    15
			pushi    0
			lea      @local72
			push    
			pushi    3
			lea      @local18
			push    
			pushi    1
			lea      @local9
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  22
			jmp      code_0ed2
code_0b0e:
			dup     
			ldi      4
			eq?     
			bnt      code_0b3b
			pushi    1
			pushi    65
			callb    proc0_5,  2
			bnt      code_0b34
			pushi    5
			pushi    1
			lea      @local140
			push    
			lea      @local9
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0b34:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0b3b:
			dup     
			ldi      5
			eq?     
			bnt      code_0b66
			pushi    11
			pushi    4
			lea      @local144
			push    
			lea      @local27
			push    
			pushi    1
			lea      @local0
			push    
			pushi    3
			lea      @local81
			push    
			pushi    0
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  22
			jmp      code_0ed2
code_0b66:
			dup     
			ldi      6
			eq?     
			bnt      code_0b9c
			pushi    1
			pushi    61
			callb    proc0_5,  2
			bnt      code_0b95
			pushi    9
			pushi    3
			lea      @local155
			push    
			pushi    2
			pushi    2
			lea      @local72
			push    
			pushi    3
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ed2
code_0b95:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0b9c:
			dup     
			ldi      7
			eq?     
			bnt      code_0bca
			pushi    1
			pushi    61
			callb    proc0_5,  2
			not     
			bnt      code_0bc3
			pushi    5
			pushi    1
			lea      @local161
			push    
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0bc3:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0bca:
			dup     
			ldi      8
			eq?     
			bnt      code_0bee
			pushi    9
			pushi    3
			lea      @local165
			push    
			pushi    2
			pushi    2
			pushi    12
			pushi    3
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ed2
code_0bee:
			dup     
			ldi      9
			eq?     
			bnt      code_0c25
			pushi    1
			pushi    154
			callb    proc0_5,  2
			bnt      code_0c1e
			pushi    9
			pushi    3
			lea      @local171
			push    
			lea      @local81
			push    
			pushi    0
			lea      @local0
			push    
			pushi    3
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ed2
code_0c1e:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0c25:
			dup     
			ldi      10
			eq?     
			bnt      code_0c56
			pushi    1
			pushi    154
			callb    proc0_5,  2
			not     
			bnt      code_0c4f
			pushi    7
			pushi    2
			lea      @local178
			push    
			lea      @local81
			push    
			pushi    0
			pushi    2
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ed2
code_0c4f:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0c56:
			dup     
			ldi      11
			eq?     
			bnt      code_0c83
			pushi    11
			pushi    4
			lea      @local183
			push    
			lea      @local0
			push    
			pushi    3
			lea      @local27
			push    
			pushi    1
			lea      @local63
			push    
			pushi    2
			pushi    12
			pushi    3
			pushSelf
			calle    proc851_0,  22
			jmp      code_0ed2
code_0c83:
			dup     
			ldi      12
			eq?     
			bnt      code_0cb1
			pushi    1
			pushi    173
			callb    proc0_5,  2
			bnt      code_0caa
			pushi    5
			pushi    1
			lea      @local195
			push    
			lea      @local99
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0caa:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0cb1:
			dup     
			ldi      13
			eq?     
			bnt      code_0cdf
			pushi    1
			pushi    174
			callb    proc0_5,  2
			bnt      code_0cd8
			pushi    5
			pushi    1
			lea      @local200
			push    
			lea      @local90
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0cd8:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0cdf:
			dup     
			ldi      14
			eq?     
			bnt      code_0d17
			pushi    1
			pushi    54
			callb    proc0_5,  2
			bnt      code_0d10
			pushi    1
			pushi    151
			callb    proc0_5,  2
			not     
			bnt      code_0d10
			pushi    5
			pushi    1
			lea      @local205
			push    
			lea      @local36
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0d10:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0d17:
			dup     
			ldi      15
			eq?     
			bnt      code_0d4e
			pushi    1
			pushi    54
			callb    proc0_5,  2
			bnt      code_0d47
			pushi    1
			pushi    151
			callb    proc0_5,  2
			bnt      code_0d47
			pushi    5
			pushi    1
			lea      @local210
			push    
			lea      @local36
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0d47:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0d4e:
			dup     
			ldi      16
			eq?     
			bnt      code_0d8e
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_0d87
			pushi    1
			pushi    152
			callb    proc0_5,  2
			not     
			bnt      code_0d87
			pushi    9
			pushi    3
			lea      @local214
			push    
			lea      @local54
			push    
			pushi    0
			pushi    2
			pushi    2
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ed2
code_0d87:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0d8e:
			dup     
			ldi      17
			eq?     
			bnt      code_0dc5
			pushi    1
			pushi    113
			callb    proc0_5,  2
			bnt      code_0dbe
			pushi    1
			pushi    152
			callb    proc0_5,  2
			bnt      code_0dbe
			pushi    5
			pushi    1
			lea      @local224
			push    
			lea      @local54
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0dbe:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0dc5:
			dup     
			ldi      18
			eq?     
			bnt      code_0df9
			pushi    1
			pushi    191
			callb    proc0_5,  2
			not     
			bnt      code_0df2
			pushi    7
			pushi    2
			lea      @local229
			push    
			lea      @local27
			push    
			pushi    1
			lea      @local45
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  14
			jmp      code_0ed2
code_0df2:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0df9:
			dup     
			ldi      19
			eq?     
			bnt      code_0e30
			pushi    1
			pushi    62
			callb    proc0_5,  2
			bnt      code_0e29
			pushi    9
			pushi    3
			lea      @local235
			push    
			lea      @local27
			push    
			pushi    1
			pushi    21
			pushi    0
			lea      @local72
			push    
			pushi    3
			pushSelf
			calle    proc851_0,  18
			jmp      code_0ed2
code_0e29:
			ldi      6
			aTop     ticks
			jmp      code_0ed2
code_0e30:
			dup     
			ldi      20
			eq?     
			bnt      code_0e4d
			pushi    5
			pushi    1
			lea      @local250
			push    
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0e4d:
			dup     
			ldi      21
			eq?     
			bnt      code_0e5b
			ldi      96
			aTop     ticks
			jmp      code_0ed2
code_0e5b:
			dup     
			ldi      22
			eq?     
			bnt      code_0e78
			pushi    5
			pushi    1
			lea      @local254
			push    
			lea      @local27
			push    
			pushi    1
			pushSelf
			calle    proc851_0,  10
			jmp      code_0ed2
code_0e78:
			dup     
			ldi      23
			eq?     
			bnt      code_0e87
			ldi      180
			aTop     ticks
			jmp      code_0ed2
code_0e87:
			dup     
			ldi      24
			eq?     
			bnt      code_0ea5
			pushi    #fade
			pushi    4
			pushi    60
			pushi    6
			pushi    12
			pushi    0
			lag      global100
			send     12
			ldi      72
			aTop     ticks
			jmp      code_0ed2
code_0ea5:
			dup     
			ldi      25
			eq?     
			bnt      code_0ed2
			lsg      global151
			ldi      40
			eq?     
			bnt      code_0ec2
			pushi    #newRoom
			pushi    1
			pushi    422
			lag      global2
			send     6
			jmp      code_0ecd
code_0ec2:
			pushi    #newRoom
			pushi    1
			pushi    421
			lag      global2
			send     6
code_0ecd:
			pushi    #dispose
			pushi    0
			self     4
code_0ed2:
			toss    
			ret     
		)
	)
)
