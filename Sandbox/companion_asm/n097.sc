;;; Sierra Script 1.0 - (do not remove this comment)
(script# 97)
(include sci.sh)
(use n000)
(use n958)
(use n994)
(use n998)
(use n999)

(public
	theEnd 0
)

(local
	local0
)
(instance theEnd of Rm
	(properties
		picture 905
		style $000f
	)
	
	(method (init)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    129
			pushi    905
			pushi    803
			calle    proc958_0,  6
			pushi    2
			pushi    128
			pushi    861
			calle    proc958_0,  4
			pushi    #add
			pushi    1
			lofsa    giveEmTheWorks
			push    
			lag      global73
			send     6
			pushi    #add
			pushi    1
			lofsa    giveEmTheWorks
			push    
			lag      global72
			send     6
			pushi    3
			lofsa    {LOOKUP\_ERROR}
			push    
			pushi    0
			pushi    0
			callk    DrawStatus,  6
			pushi    1
			pushi    0
			callb    proc0_5,  2
			bnt      code_0060
			ldi      10
			sal      local0
			jmp      code_0065
code_0060:
			ldi      32774
			sal      local0
code_0065:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    43
			pushi    1
			pushi    1
			pushi    3
			callk    DoSound,  2
			push    
			ldi      32
			eq?     
			bnt      code_0080
			ldi      27
			jmp      code_0082
code_0080:
			ldi      28
code_0082:
			push    
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      global100
			send     16
			pushi    #init
			pushi    0
			lofsa    title1
			send     4
			pushi    #init
			pushi    0
			lofsa    name1
			send     4
			pushi    #init
			pushi    0
			lofsa    name2
			send     4
			pushi    #init
			pushi    0
			lofsa    name3
			send     4
			pushi    #init
			pushi    0
			lofsa    name4
			send     4
			pushi    #init
			pushi    0
			lofsa    name5
			send     4
			pushi    #init
			pushi    0
			lofsa    name6
			send     4
			pushi    #init
			pushi    0
			lofsa    name7
			send     4
			pushi    #init
			pushi    0
			lofsa    name8
			send     4
			pushi    #init
			pushi    0
			lofsa    name9
			send     4
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    name10
			send     8
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    name11
			send     8
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    name12
			send     8
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    name13
			send     8
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    name14
			send     8
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    name15
			send     8
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			pushi    #setScript
			pushi    1
			lofsa    giveEmTheWorks
			push    
			self     6
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    #fade
			pushi    4
			pushi    0
			pushi    12
			dup     
			pushi    1
			lag      global100
			send     12
			pushi    #delete
			pushi    1
			lofsa    giveEmTheWorks
			push    
			lag      global73
			send     6
			pushi    #delete
			pushi    1
			lofsa    giveEmTheWorks
			push    
			lag      global72
			send     6
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
)

(instance title1 of View
	(properties
		x 4
		y 10
		view 861
	)
)

(instance name1 of View
	(properties
		x 140
		y 10
		view 861
		loop 2
		cel 1
	)
)

(instance name2 of View
	(properties
		x 140
		y 30
		view 861
		cel 1
	)
)

(instance name3 of View
	(properties
		x 140
		y 50
		view 861
		cel 2
	)
)

(instance name4 of View
	(properties
		x 140
		y 70
		view 861
		cel 3
	)
)

(instance name5 of View
	(properties
		x 140
		y 110
		view 861
		loop 2
		cel 2
	)
)

(instance name6 of View
	(properties
		x 140
		y 130
		view 861
		loop 1
		cel 1
	)
)

(instance name7 of View
	(properties
		x 140
		y 170
		view 861
		loop 1
		cel 2
	)
)

(instance name8 of View
	(properties
		x 140
		y 150
		view 861
		loop 3
	)
)

(instance name9 of View
	(properties
		x 140
		y 90
		view 861
		loop 1
	)
)

(instance name10 of View
	(properties
		x 170
		y 110
		view 861
		loop 9
		cel 2
	)
)

(instance name11 of View
	(properties
		x 40
		y 130
		view 861
		loop 9
		cel 3
	)
)

(instance name12 of View
	(properties
		x 170
		y 130
		view 861
		loop 8
		cel 3
	)
)

(instance name13 of View
	(properties
		x 40
		y 150
		view 861
		loop 9
		cel 4
	)
)

(instance name14 of View
	(properties
		x 170
		y 150
		view 861
		loop 9
		cel 5
	)
)

(instance name15 of View
	(properties
		x 107
		y 170
		view 861
		loop 9
		cel 6
	)
)

(instance giveEmTheWorks of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_081a
			ldi      0
			pushi    0
			callb    proc0_3,  0
			ldi      600
			aTop     ticks
			jmp      code_1138
code_081a:
			dup     
			ldi      1
			eq?     
			bnt      code_088f
			ldi      1
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			lsl      local0
			lag      global2
			send     8
			pushi    #hide
			pushi    0
			lofsa    title1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name2
			send     4
			pushi    #hide
			pushi    0
			lofsa    name3
			send     4
			pushi    #hide
			pushi    0
			lofsa    name4
			send     4
			pushi    #hide
			pushi    0
			lofsa    name5
			send     4
			pushi    #hide
			pushi    0
			lofsa    name6
			send     4
			pushi    #hide
			pushi    0
			lofsa    name7
			send     4
			pushi    #hide
			pushi    0
			lofsa    name8
			send     4
			pushi    #hide
			pushi    0
			lofsa    name9
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1138
code_088f:
			dup     
			ldi      2
			eq?     
			bnt      code_0957
			ldi      2
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local0
			lag      global2
			send     8
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    4
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    title1
			send     28
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name1
			send     28
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name2
			send     28
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    3
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name3
			send     28
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    130
			pushi    194
			pushi    0
			lofsa    name4
			send     28
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    150
			pushi    194
			pushi    0
			lofsa    name5
			send     28
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0957:
			dup     
			ldi      3
			eq?     
			bnt      code_0970
			ldi      3
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ldi      600
			aTop     ticks
			jmp      code_1138
code_0970:
			dup     
			ldi      4
			eq?     
			bnt      code_09c5
			ldi      4
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			lsl      local0
			lag      global2
			send     8
			pushi    #hide
			pushi    0
			lofsa    title1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name2
			send     4
			pushi    #hide
			pushi    0
			lofsa    name3
			send     4
			pushi    #hide
			pushi    0
			lofsa    name4
			send     4
			pushi    #hide
			pushi    0
			lofsa    name5
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1138
code_09c5:
			dup     
			ldi      5
			eq?     
			bnt      code_0b1f
			ldi      5
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local0
			lag      global2
			send     8
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    107
			pushi    3
			pushi    1
			pushi    30
			pushi    194
			pushi    0
			lofsa    title1
			send     28
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    name1
			send     28
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    name2
			send     28
			pushi    #loop
			pushi    1
			pushi    4
			pushi    7
			pushi    1
			pushi    3
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name3
			send     28
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name4
			send     28
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name5
			send     28
			pushi    #loop
			pushi    1
			pushi    5
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name6
			send     28
			pushi    #loop
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name7
			send     28
			pushi    #loop
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name8
			send     28
			pushi    #loop
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    130
			pushi    194
			pushi    0
			lofsa    name9
			send     28
			pushi    #loop
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    130
			pushi    194
			pushi    0
			lofsa    name10
			send     28
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0b1f:
			dup     
			ldi      6
			eq?     
			bnt      code_0b38
			ldi      6
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ldi      600
			aTop     ticks
			jmp      code_1138
code_0b38:
			dup     
			ldi      7
			eq?     
			bnt      code_0bb5
			ldi      7
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			lsl      local0
			lag      global2
			send     8
			pushi    #hide
			pushi    0
			lofsa    title1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name2
			send     4
			pushi    #hide
			pushi    0
			lofsa    name3
			send     4
			pushi    #hide
			pushi    0
			lofsa    name4
			send     4
			pushi    #hide
			pushi    0
			lofsa    name5
			send     4
			pushi    #hide
			pushi    0
			lofsa    name6
			send     4
			pushi    #hide
			pushi    0
			lofsa    name7
			send     4
			pushi    #hide
			pushi    0
			lofsa    name8
			send     4
			pushi    #hide
			pushi    0
			lofsa    name9
			send     4
			pushi    #hide
			pushi    0
			lofsa    name10
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0bb5:
			dup     
			ldi      8
			eq?     
			bnt      code_0d4f
			ldi      8
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local0
			lag      global2
			send     8
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    50
			pushi    3
			pushi    1
			pushi    10
			pushi    194
			pushi    0
			lofsa    title1
			send     28
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    30
			pushi    194
			pushi    0
			lofsa    name1
			send     28
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    30
			pushi    194
			pushi    0
			lofsa    name2
			send     28
			pushi    #loop
			pushi    1
			pushi    8
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    name3
			send     28
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    name4
			send     28
			pushi    #loop
			pushi    1
			pushi    6
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name5
			send     28
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    5
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name6
			send     28
			pushi    #loop
			pushi    1
			pushi    7
			dup     
			pushi    1
			pushi    6
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name7
			send     28
			pushi    #loop
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name8
			send     28
			pushi    #loop
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name9
			send     28
			pushi    #loop
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    170
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name10
			send     28
			pushi    #view
			pushi    1
			pushi    861
			pushi    6
			pushi    1
			pushi    9
			pushi    7
			pushi    1
			pushi    3
			pushi    4
			pushi    1
			pushi    40
			pushi    3
			pushi    1
			pushi    130
			pushi    194
			pushi    0
			lofsa    name11
			send     34
			pushi    #show
			pushi    0
			lofsa    name12
			send     4
			pushi    #show
			pushi    0
			lofsa    name13
			send     4
			pushi    #show
			pushi    0
			lofsa    name14
			send     4
			pushi    #show
			pushi    0
			lofsa    name15
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0d4f:
			dup     
			ldi      9
			eq?     
			bnt      code_0d68
			ldi      9
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ldi      900
			aTop     ticks
			jmp      code_1138
code_0d68:
			dup     
			ldi      10
			eq?     
			bnt      code_0e0d
			ldi      10
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			lsl      local0
			lag      global2
			send     8
			pushi    #hide
			pushi    0
			lofsa    title1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name2
			send     4
			pushi    #hide
			pushi    0
			lofsa    name3
			send     4
			pushi    #hide
			pushi    0
			lofsa    name4
			send     4
			pushi    #hide
			pushi    0
			lofsa    name5
			send     4
			pushi    #hide
			pushi    0
			lofsa    name6
			send     4
			pushi    #hide
			pushi    0
			lofsa    name7
			send     4
			pushi    #hide
			pushi    0
			lofsa    name8
			send     4
			pushi    #hide
			pushi    0
			lofsa    name9
			send     4
			pushi    #hide
			pushi    0
			lofsa    name10
			send     4
			pushi    #hide
			pushi    0
			lofsa    name11
			send     4
			pushi    #hide
			pushi    0
			lofsa    name12
			send     4
			pushi    #hide
			pushi    0
			lofsa    name13
			send     4
			pushi    #hide
			pushi    0
			lofsa    name14
			send     4
			pushi    #hide
			pushi    0
			lofsa    name15
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0e0d:
			dup     
			ldi      11
			eq?     
			bnt      code_0ebd
			ldi      11
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local0
			lag      global2
			send     8
			pushi    #loop
			pushi    1
			pushi    12
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    217
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    title1
			send     28
			pushi    #loop
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    150
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name1
			send     28
			pushi    #loop
			pushi    1
			pushi    12
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    150
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name2
			send     28
			pushi    #loop
			pushi    1
			pushi    12
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    150
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name3
			send     28
			pushi    #loop
			pushi    1
			pushi    10
			pushi    7
			pushi    1
			pushi    3
			pushi    4
			pushi    1
			pushi    150
			pushi    3
			pushi    1
			pushi    130
			pushi    194
			pushi    0
			lofsa    name4
			send     28
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0ebd:
			dup     
			ldi      12
			eq?     
			bnt      code_0ed6
			ldi      12
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ldi      900
			aTop     ticks
			jmp      code_1138
code_0ed6:
			dup     
			ldi      13
			eq?     
			bnt      code_0f23
			ldi      13
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			lsl      local0
			lag      global2
			send     8
			pushi    #hide
			pushi    0
			lofsa    title1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name2
			send     4
			pushi    #hide
			pushi    0
			lofsa    name3
			send     4
			pushi    #hide
			pushi    0
			lofsa    name4
			send     4
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0f23:
			dup     
			ldi      14
			eq?     
			bnt      code_0f79
			ldi      14
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local0
			lag      global2
			send     8
			pushi    #loop
			pushi    1
			pushi    11
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    4
			pushi    3
			pushi    1
			pushi    60
			pushi    194
			pushi    0
			lofsa    title1
			send     28
			pushi    #loop
			pushi    1
			pushi    11
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    80
			pushi    194
			pushi    0
			lofsa    name1
			send     28
			ldi      6
			aTop     ticks
			jmp      code_1138
code_0f79:
			dup     
			ldi      15
			eq?     
			bnt      code_0f92
			ldi      15
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ldi      300
			aTop     ticks
			jmp      code_1138
code_0f92:
			dup     
			ldi      16
			eq?     
			bnt      code_0fc7
			ldi      16
			pushi    #disable
			pushi    0
			lag      global69
			send     4
			pushi    #drawPic
			pushi    2
			pushi    803
			lsl      local0
			lag      global2
			send     8
			pushi    #hide
			pushi    0
			lofsa    title1
			send     4
			pushi    #hide
			pushi    0
			lofsa    name1
			send     4
			ldi      1
			aTop     ticks
			jmp      code_1138
code_0fc7:
			dup     
			ldi      17
			eq?     
			bnt      code_110c
			ldi      17
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local0
			lag      global2
			send     8
			pushi    #view
			pushi    1
			pushi    861
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    4
			pushi    3
			pushi    1
			pushi    10
			pushi    194
			pushi    0
			lofsa    title1
			send     34
			pushi    #view
			pushi    1
			pushi    861
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    10
			pushi    194
			pushi    0
			lofsa    name1
			send     34
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    30
			pushi    194
			pushi    0
			lofsa    name2
			send     28
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    50
			pushi    194
			pushi    0
			lofsa    name3
			send     28
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    3
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    70
			pushi    194
			pushi    0
			lofsa    name4
			send     28
			pushi    #loop
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    110
			pushi    194
			pushi    0
			lofsa    name5
			send     28
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    1
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    130
			pushi    194
			pushi    0
			lofsa    name6
			send     28
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    2
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    170
			pushi    194
			pushi    0
			lofsa    name7
			send     28
			pushi    #loop
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    150
			pushi    194
			pushi    0
			lofsa    name8
			send     28
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    140
			pushi    3
			pushi    1
			pushi    90
			pushi    194
			pushi    0
			lofsa    name9
			send     28
			ldi      6
			aTop     ticks
			jmp      code_1138
code_110c:
			dup     
			ldi      18
			eq?     
			bnt      code_1125
			ldi      18
			pushi    #enable
			pushi    0
			lag      global69
			send     4
			ldi      300
			aTop     ticks
			jmp      code_1138
code_1125:
			dup     
			ldi      19
			eq?     
			bnt      code_1138
			ldi      19
			ldi      65535
			aTop     state
			pushi    #cue
			pushi    0
			self     4
code_1138:
			toss    
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      3
			and     
			bnt      code_0787
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			and     
code_0787:
			bt       code_07a3
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_07b2
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      27
			eq?     
code_07a3:
			bnt      code_07b2
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Script,  6
			jmp      code_07ff
code_07b2:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			eq?     
			bt       code_07d9
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			and     
			bnt      code_07f6
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      13
			eq?     
code_07d9:
			bnt      code_07f6
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #cue
			pushi    0
			self     4
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Script,  6
			jmp      code_07ff
code_07f6:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Script,  6
code_07ff:
			ret     
		)
	)
)
