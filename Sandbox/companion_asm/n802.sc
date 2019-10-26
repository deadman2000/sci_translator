;;; Sierra Script 1.0 - (do not remove this comment)
(script# 802)
(include sci.sh)
(use n000)

(public
	proc802_0 0
)

(procedure (proc802_0)
	(asm
		pushi    1
		pushi    2
		callk    Graph,  2
		push    
		ldi      16
		gt?     
		bnt      code_01a0
		pushi    4
		pushi    5
		pushi    31
		dup     
		dup     
		callk    Palette,  8
		sag      global170
		pushi    4
		pushi    5
		pushi    11
		dup     
		pushi    123
		callk    Palette,  8
		sag      global171
		pushi    4
		pushi    5
		pushi    7
		pushi    91
		pushi    11
		callk    Palette,  8
		sag      global172
		pushi    4
		pushi    5
		pushi    27
		pushi    151
		dup     
		callk    Palette,  8
		sag      global173
		pushi    4
		pushi    5
		pushi    135
		pushi    47
		dup     
		callk    Palette,  8
		sag      global174
		pushi    4
		pushi    5
		pushi    139
		pushi    55
		pushi    159
		callk    Palette,  8
		sag      global175
		pushi    4
		pushi    5
		pushi    111
		pushi    67
		pushi    27
		callk    Palette,  8
		sag      global176
		pushi    4
		pushi    5
		pushi    95
		dup     
		dup     
		callk    Palette,  8
		sag      global177
		pushi    4
		pushi    5
		pushi    191
		dup     
		dup     
		callk    Palette,  8
		sag      global178
		pushi    4
		pushi    5
		pushi    71
		dup     
		pushi    187
		callk    Palette,  8
		sag      global179
		pushi    4
		pushi    5
		pushi    103
		pushi    211
		pushi    143
		callk    Palette,  8
		sag      global180
		pushi    4
		pushi    5
		pushi    103
		pushi    231
		dup     
		callk    Palette,  8
		sag      global181
		pushi    4
		pushi    5
		pushi    207
		pushi    123
		dup     
		callk    Palette,  8
		sag      global182
		pushi    4
		pushi    5
		pushi    215
		pushi    159
		pushi    255
		callk    Palette,  8
		sag      global183
		pushi    4
		pushi    5
		pushi    255
		pushi    247
		pushi    191
		callk    Palette,  8
		sag      global184
		pushi    4
		pushi    5
		pushi    223
		dup     
		dup     
		callk    Palette,  8
		sag      global185
		pushi    4
		pushi    5
		pushi    231
		pushi    211
		pushi    155
		callk    Palette,  8
		sag      global187
		pushi    4
		pushi    5
		pushi    19
		pushi    115
		pushi    31
		callk    Palette,  8
		sag      global186
		pushi    4
		pushi    5
		pushi    135
		pushi    87
		pushi    43
		callk    Palette,  8
		sag      global190
		pushi    4
		pushi    5
		pushi    183
		pushi    143
		pushi    71
		callk    Palette,  8
		sag      global188
		pushi    4
		pushi    5
		pushi    159
		pushi    115
		pushi    47
		callk    Palette,  8
		sag      global189
		pushi    4
		pushi    5
		pushi    7
		pushi    91
		pushi    11
		callk    Palette,  8
		sag      global193
		pushi    4
		pushi    5
		pushi    19
		pushi    115
		pushi    31
		callk    Palette,  8
		sag      global192
		pushi    4
		pushi    5
		pushi    31
		pushi    139
		pushi    51
		callk    Palette,  8
		sag      global191
		pushi    4
		pushi    5
		pushi    51
		pushi    163
		pushi    79
		callk    Palette,  8
		sag      global194
		jmp      code_0204
code_01a0:
		ldi      0
		sag      global170
		ldi      1
		sag      global171
		ldi      2
		sag      global172
		ldi      3
		sag      global173
		ldi      4
		sag      global174
		ldi      5
		sag      global175
		ldi      6
		sag      global176
		ldi      7
		sag      global177
		ldi      8
		sag      global178
		ldi      9
		sag      global179
		ldi      10
		sag      global180
		ldi      11
		sag      global181
		ldi      12
		sag      global182
		ldi      13
		sag      global183
		ldi      14
		sag      global184
		ldi      15
		sag      global185
		lag      global172
		sag      global186
		lag      global184
		sag      global187
		lag      global176
		sag      global190
		lag      global176
		sag      global188
		lag      global174
		sag      global189
		lag      global172
		sag      global193
		lag      global172
		sag      global192
		lag      global180
		sag      global191
		lag      global180
		sag      global194
code_0204:
		ret     
	)
)
