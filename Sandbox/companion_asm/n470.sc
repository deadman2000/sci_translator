;;; Sierra Script 1.0 - (do not remove this comment)
(script# 470)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n851)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n995)
(use n998)
(use n999)

(public
	rm470 0
)

(local
	[local0 4] = [1470 26 1]
	[local4 12] = [1470 33 1 2 1 2 1 2 1 2 1]
	[local16 6] = [1470 43 1 1 1]
	[local22 5] = [1470 56 1 1]
	[local27 8] = [113 117 213 137 94 168 8 139]
	[local35 12] = [5 164 7 146 17 143 47 153 47 172 28 176]
	[local47 18] = [138 126 136 114 129 113 126 103 153 93 158 107 173 109 173 126 154 129]
	[local65 14] = [295 117 294 155 277 161 277 151 253 150 248 133 265 114]
	[local79 8] = [261 123 284 125 278 135 252 133]
	[local87 22] = [102 122 83 120 105 113 145 120 139 125 151 130 148 141 143 132 128 127 104 130 91 129]
	local109
	local110
)
(instance rm470 of StdRoom
	(properties
		picture 470
		south 450
	)
	
	(method (init)
		(asm
			lag      global34
			sal      local109
			ldi      0
			sag      global34
			lsg      global12
			ldi      450
			eq?     
			bnt      code_0031
			pushi    #x
			pushi    1
			pushi    70
			lag      global0
			send     6
			pushi    #edgeHit
			pushi    1
			pushi    1
			lag      global0
			send     6
code_0031:
			pushi    #init
			pushi    2
			pushi    0
			pushi    3
			super    StdRoom,  8
			pToa     script
			bnt      code_0055
			pushi    1
			pushi    202
			callb    proc0_5,  2
			not     
			bnt      code_0055
			pushi    #next
			pushi    1
			lofsa    firstMess
			push    
			pToa     script
			send     6
code_0055:
			pushi    #play
			pushi    0
			lofsa    fireSound
			send     4
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    fire
			send     10
			pushi    #init
			pushi    0
			lofsa    pillow
			send     4
			pushi    #init
			pushi    0
			lofsa    pillowL
			send     4
			pushi    #init
			pushi    0
			lofsa    pillowM
			send     4
			pushi    #points
			pushi    1
			lea      @local27
			push    
			lofsa    rugPol
			send     6
			pushi    #points
			pushi    1
			lea      @local35
			push    
			lofsa    lChstPol
			send     6
			pushi    #points
			pushi    1
			lea      @local47
			push    
			lofsa    rChstPol
			send     6
			pushi    #points
			pushi    1
			lea      @local65
			push    
			lofsa    DeskPol
			send     6
			pushi    #points
			pushi    1
			lea      @local79
			push    
			lofsa    BookPol
			send     6
			pushi    #points
			pushi    1
			lea      @local87
			push    
			lofsa    SkinPol
			send     6
			pushi    #init
			pushi    0
			lofsa    rope
			send     4
			pushi    #init
			pushi    0
			lofsa    bCurtains
			send     4
			pushi    #init
			pushi    0
			lofsa    bTape
			send     4
			pushi    #init
			pushi    0
			lofsa    table
			send     4
			pushi    #init
			pushi    0
			lofsa    chair
			send     4
			pushi    #init
			pushi    0
			lofsa    windows
			send     4
			pushi    #init
			pushi    0
			lofsa    fTape
			send     4
			pushi    #onMeCheck
			pushi    1
			lofsa    SkinPol
			push    
			pushi    107
			pushi    0
			lofsa    skin
			send     10
			pushi    #init
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    bed
			send     10
			pushi    #onMeCheck
			pushi    1
			lofsa    rugPol
			push    
			pushi    107
			pushi    0
			lofsa    rug
			send     10
			pushi    #onMeCheck
			pushi    1
			lofsa    lChstPol
			push    
			pushi    107
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    lChest
			send     16
			pushi    #onMeCheck
			pushi    1
			lofsa    rChstPol
			push    
			pushi    107
			pushi    0
			pushi    281
			pushi    1
			pushi    3
			lofsa    rChest
			send     16
			pushi    #onMeCheck
			pushi    1
			lofsa    BookPol
			push    
			pushi    107
			pushi    0
			lofsa    book
			send     10
			pushi    #onMeCheck
			pushi    1
			lofsa    DeskPol
			push    
			pushi    107
			pushi    0
			lofsa    desk
			send     10
			pushi    #addObstacle
			pushi    2
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    12
			pushi    308
			pushi    152
			pushi    307
			pushi    157
			pushi    254
			pushi    173
			pushi    222
			pushi    162
			pushi    222
			pushi    157
			pushi    260
			pushi    141
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     38
			push    
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    46
			pushi    313
			pushi    137
			pushi    156
			pushi    117
			pushi    151
			pushi    118
			pushi    187
			pushi    125
			pushi    158
			pushi    131
			pushi    111
			pushi    121
			pushi    108
			pushi    122
			pushi    191
			pushi    139
			pushi    115
			pushi    161
			pushi    34
			pushi    136
			pushi    0
			pushi    152
			pushi    0
			pushi    163
			pushi    24
			pushi    159
			pushi    60
			pushi    171
			pushi    29
			pushi    179
			pushi    6
			pushi    173
			pushi    6
			pushi    189
			pushi    84
			pushi    189
			pushi    87
			pushi    186
			pushi    229
			pushi    186
			pushi    237
			pushi    189
			pushi    289
			pushi    189
			pushi    313
			pushi    169
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     106
			push    
			lag      global2
			send     8
			pushi    #actions
			pushi    1
			pushi    2
			pushi    452
			pushi    3
			callk    ScriptID,  4
			push    
			lag      global0
			send     6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			bnt      code_026d
			pushi    #doit
			pushi    0
			send     4
			jmp      code_0294
code_026d:
			pushi    #edgeHit
			pushi    0
			lag      global0
			send     4
			sat      temp0
			bnt      code_0294
			push    
			ldi      4
			eq?     
			bnt      code_028e
			pushi    #setScript
			pushi    1
			lofsa    chkPriv
			push    
			self     6
			jmp      code_0294
code_028e:
			pushi    #doit
			pushi    0
			super    StdRoom,  4
code_0294:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			lal      local109
			sag      global34
			pushi    #dispose
			pushi    0
			super    StdRoom,  4
			ret     
		)
	)
)

(instance firstMess of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			ldi      3
			lt?     
			bnt      code_0313
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1470
			pushi    0
			pToa     state
			add     
			push    
			pushSelf
			calle    proc13_4,  6
			jmp      code_0323
code_0313:
			pushi    1
			pushi    202
			callb    proc0_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0323:
			ret     
		)
	)
)

(instance pillow of Actor
	(properties
		x 92
		y 117
		description 6612
		view 470
		loop 2
		priority 7
		signal $6911
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_03ad
			lal      local110
			bnt      code_037b
			pushi    #setScript
			pushi    1
			lofsa    putBack
			push    
			lag      global2
			send     6
			jmp      code_03f5
code_037b:
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_03a0
			pushi    #setScript
			pushi    1
			lofsa    getBox
			push    
			lag      global2
			send     6
			jmp      code_03f5
code_03a0:
			pushi    2
			pushi    1470
			pushi    28
			calle    proc13_4,  4
			jmp      code_03f5
code_03ad:
			dup     
			ldi      2
			eq?     
			bnt      code_03ea
			pushi    3
			pushi    #x
			pushi    0
			lag      global0
			send     4
			push    
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lofsa    rugPol
			push    
			callk    AvoidPath,  6
			bnt      code_03dd
			pushi    2
			pushi    1470
			pushi    9
			calle    proc13_4,  4
			jmp      code_03f5
code_03dd:
			pushi    2
			pushi    1470
			pushi    8
			calle    proc13_4,  4
			jmp      code_03f5
code_03ea:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_03f5:
			toss    
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_0417
			pushi    #x
			pushi    0
			lap      param1
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lap      param1
			send     4
			sat      temp1
			jmp      code_041f
code_0417:
			lap      param1
			sat      temp0
			lap      param2
			sat      temp1
code_041f:
			pushi    #onMe
			pushi    2
			lst      temp0
			lst      temp1
			super    Actor,  8
			bnt      code_043d
			pushi    3
			pushi    2
			lst      temp0
			lst      temp1
			callk    OnControl,  6
			push    
			pushi    1
			pToa     priority
			shl     
			and     
code_043d:
			ret     
		)
	)
)

(instance pillowL of Actor
	(properties
		x 60
		y 122
		view 470
		loop 2
		priority 9
		signal $6911
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_04e0
			pushi    #setScript
			pushi    1
			lofsa    checkL
			push    
			lag      global2
			send     6
			jmp      code_0502
code_04e0:
			dup     
			ldi      2
			eq?     
			bnt      code_04f7
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    pillow
			send     8
			jmp      code_0502
code_04f7:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_0502:
			toss    
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0 temp1)
		(asm
			pushi    1
			lsp      param1
			callk    IsObject,  2
			bnt      code_0524
			pushi    #x
			pushi    0
			lap      param1
			send     4
			sat      temp0
			pushi    #y
			pushi    0
			lap      param1
			send     4
			sat      temp1
			jmp      code_052c
code_0524:
			lap      param1
			sat      temp0
			lap      param2
			sat      temp1
code_052c:
			pushi    #onMe
			pushi    2
			lst      temp0
			lst      temp1
			super    Actor,  8
			bnt      code_054a
			pushi    3
			pushi    2
			lst      temp0
			lst      temp1
			callk    OnControl,  6
			push    
			pushi    1
			pToa     priority
			shl     
			and     
code_054a:
			ret     
		)
	)
)

(instance pillowM of Actor
	(properties
		x 76
		y 119
		yStep 3
		view 470
		loop 2
		priority 8
		signal $6911
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_05ee
			pushi    #setScript
			pushi    1
			lofsa    checkM
			push    
			lag      global2
			send     6
			jmp      code_0610
code_05ee:
			dup     
			ldi      2
			eq?     
			bnt      code_0605
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    pillow
			send     8
			jmp      code_0610
code_0605:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_0610:
			toss    
			ret     
		)
	)
)

(instance putBack of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06b7
			pushi    0
			callb    proc0_3,  0
			pushi    3
			pushi    1470
			pushi    27
			pushSelf
			calle    proc13_4,  6
			jmp      code_0840
code_06b7:
			dup     
			ldi      1
			eq?     
			bnt      code_06e4
			pushi    2
			pushi    128
			pushi    28
			callk    Load,  4
			pushi    #startUpd
			pushi    0
			lofsa    pillow
			send     4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    123
			pushi    125
			pushSelf
			lag      global0
			send     12
			jmp      code_0840
code_06e4:
			dup     
			ldi      2
			eq?     
			bnt      code_0710
			pushi    #setPri
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    128
			pushSelf
			lag      global0
			send     24
			jmp      code_0840
code_0710:
			dup     
			ldi      3
			eq?     
			bnt      code_073b
			pushi    55
			pushi    #superClass
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    111
			pushi    138
			pushSelf
			lag      global0
			send     18
			jmp      code_0840
code_073b:
			dup     
			ldi      4
			eq?     
			bnt      code_0797
			pushi    5
			pushi    #superClass
			pushi    28
			pushi    162
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    55
			pushi    1
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     36
			pushi    17
			pushi    #superClass
			pushi    65279
			pushi    #signal
			pushi    0
			lofsa    pillow
			send     4
			and     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    92
			pushi    117
			pushSelf
			lofsa    pillow
			send     18
			jmp      code_0840
code_0797:
			dup     
			ldi      5
			eq?     
			bnt      code_07be
			pushi    #view
			pushi    1
			pushi    23
			pushi    162
			pushi    1
			pushi    5
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    128
			pushSelf
			lag      global0
			send     24
			jmp      code_0840
code_07be:
			dup     
			ldi      6
			eq?     
			bnt      code_07d9
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    123
			pushi    125
			pushSelf
			lag      global0
			send     12
			jmp      code_0840
code_07d9:
			dup     
			ldi      7
			eq?     
			bnt      code_0830
			ldi      0
			sal      local110
			pushi    1
			pushi    5
			callb    proc0_2,  2
			pushi    17
			pushi    #superClass
			pushi    256
			pushi    #signal
			pushi    0
			lofsa    pillow
			send     4
			or      
			push    
			pushi    285
			pushi    0
			lofsa    pillow
			send     10
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    0
			callk    HaveMouse,  0
			bnt      code_081a
			ldi      1
			aTop     cycles
			jmp      code_0840
code_081a:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    163
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_0840
code_0830:
			dup     
			ldi      8
			eq?     
			bnt      code_0840
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0840:
			toss    
			ret     
		)
	)
)

(instance getBox of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_08b2
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    128
			pushi    28
			callk    Load,  4
			pushi    #startUpd
			pushi    0
			lofsa    pillow
			send     4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    123
			pushi    125
			pushSelf
			lag      global0
			send     12
			jmp      code_0a4d
code_08b2:
			dup     
			ldi      1
			eq?     
			bnt      code_08de
			pushi    #setPri
			pushi    1
			pushi    #priority
			pushi    0
			lag      global0
			send     4
			push    
			pushi    150
			pushi    1
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    128
			pushSelf
			lag      global0
			send     24
			jmp      code_0a4d
code_08de:
			dup     
			ldi      2
			eq?     
			bnt      code_0909
			pushi    55
			pushi    #superClass
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    111
			pushi    138
			pushSelf
			lag      global0
			send     18
			jmp      code_0a4d
code_0909:
			dup     
			ldi      3
			eq?     
			bnt      code_0965
			pushi    5
			pushi    #superClass
			pushi    28
			pushi    162
			pushi    1
			pushi    4
			pushi    288
			pushi    1
			pushi    0
			pushi    55
			pushi    1
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    219
			pushi    1
			pushi    6
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     36
			pushi    17
			pushi    #superClass
			pushi    65279
			pushi    #signal
			pushi    0
			lofsa    pillow
			send     4
			and     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    102
			pushi    120
			pushSelf
			lofsa    pillow
			send     18
			jmp      code_0a4d
code_0965:
			dup     
			ldi      4
			eq?     
			bnt      code_097f
			ldi      1
			sal      local110
			pushi    3
			pushi    1470
			pushi    26
			pushSelf
			calle    proc13_4,  6
			jmp      code_0a4d
code_097f:
			dup     
			ldi      5
			eq?     
			bnt      code_0995
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0a4d
code_0995:
			dup     
			ldi      6
			eq?     
			bnt      code_09bc
			pushi    #view
			pushi    1
			pushi    23
			pushi    162
			pushi    1
			pushi    5
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    128
			pushSelf
			lag      global0
			send     24
			jmp      code_0a4d
code_09bc:
			dup     
			ldi      7
			eq?     
			bnt      code_09d7
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    123
			pushi    125
			pushSelf
			lag      global0
			send     12
			jmp      code_0a4d
code_09d7:
			dup     
			ldi      8
			eq?     
			bnt      code_0a34
			pushi    1
			pushi    5
			callb    proc0_2,  2
			pushi    #get
			pushi    1
			pushi    12
			lag      global0
			send     6
			pushi    1
			pushi    25
			calle    proc806_1,  2
			pushi    17
			pushi    #superClass
			pushi    256
			pushi    #signal
			pushi    0
			lofsa    pillow
			send     4
			or      
			push    
			pushi    285
			pushi    0
			lofsa    pillow
			send     10
			pushi    0
			callk    HaveMouse,  0
			bnt      code_0a1e
			ldi      1
			aTop     cycles
			jmp      code_0a4d
code_0a1e:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    163
			pushi    131
			pushSelf
			lag      global0
			send     12
			jmp      code_0a4d
code_0a34:
			dup     
			ldi      9
			eq?     
			bnt      code_0a4d
			pushi    0
			callb    proc0_4,  0
			pushi    #approachVerbs
			pushi    0
			lofsa    bed
			send     4
			pushi    #dispose
			pushi    0
			self     4
code_0a4d:
			toss    
			ret     
		)
	)
)

(instance checkM of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ac1
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    128
			pushi    28
			callk    Load,  4
			pushi    #startUpd
			pushi    0
			lofsa    pillowM
			send     4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    72
			pushi    146
			pushSelf
			lag      global0
			send     12
			jmp      code_0ba3
code_0ac1:
			dup     
			ldi      1
			eq?     
			bnt      code_0ad9
			pushi    2
			lsg      global0
			lofsa    pillowM
			push    
			callb    proc0_9,  4
			ldi      2
			aTop     cycles
			jmp      code_0ba3
code_0ad9:
			dup     
			ldi      2
			eq?     
			bnt      code_0b2c
			pushi    #view
			pushi    1
			pushi    28
			pushi    162
			pushi    1
			pushi    6
			pushi    288
			pushi    1
			pushi    6
			pushi    219
			pushi    1
			pushi    16
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    3
			pushi    65535
			lag      global0
			send     34
			pushi    17
			pushi    #superClass
			pushi    65279
			pushi    #signal
			pushi    0
			lofsa    pillowM
			send     4
			and     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    80
			pushi    110
			pushSelf
			lofsa    pillowM
			send     18
			jmp      code_0ba3
code_0b2c:
			dup     
			ldi      3
			eq?     
			bnt      code_0b42
			pushi    3
			pushi    1470
			pushi    29
			pushSelf
			calle    proc13_4,  6
			jmp      code_0ba3
code_0b42:
			dup     
			ldi      4
			eq?     
			bnt      code_0b73
			pushi    #cycleSpeed
			pushi    1
			pushi    6
			pushi    150
			pushi    3
			class    CT
			push    
			pushi    5
			pushi    1
			lag      global0
			send     16
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    76
			pushi    119
			pushSelf
			lofsa    pillowM
			send     12
			jmp      code_0ba3
code_0b73:
			dup     
			ldi      5
			eq?     
			bnt      code_0ba3
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    pillowM
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lofsa    pillowM
			send     10
			pushi    1
			pushi    6
			callb    proc0_2,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ba3:
			toss    
			ret     
		)
	)
)

(instance checkL of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c17
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    128
			pushi    28
			callk    Load,  4
			pushi    #startUpd
			pushi    0
			lofsa    pillowL
			send     4
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    47
			pushi    141
			pushSelf
			lag      global0
			send     12
			jmp      code_0ce9
code_0c17:
			dup     
			ldi      1
			eq?     
			bnt      code_0c2f
			pushi    2
			lsg      global0
			lofsa    pillowL
			push    
			callb    proc0_9,  4
			ldi      2
			aTop     cycles
			jmp      code_0ce9
code_0c2f:
			dup     
			ldi      2
			eq?     
			bnt      code_0c7c
			pushi    #view
			pushi    1
			pushi    28
			pushi    162
			pushi    1
			pushi    11
			pushi    288
			pushi    1
			pushi    0
			pushi    219
			pushi    1
			pushi    10
			pushi    150
			pushi    1
			class    End
			push    
			lag      global0
			send     30
			pushi    17
			pushi    #superClass
			pushi    65279
			pushi    #signal
			pushi    0
			lofsa    pillowL
			send     4
			and     
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    65
			pushi    120
			pushSelf
			lofsa    pillowL
			send     18
			jmp      code_0ce9
code_0c7c:
			dup     
			ldi      3
			eq?     
			bnt      code_0c92
			pushi    3
			pushi    1470
			pushi    29
			pushSelf
			calle    proc13_4,  6
			jmp      code_0ce9
code_0c92:
			dup     
			ldi      4
			eq?     
			bnt      code_0cb9
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			lag      global0
			send     6
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    60
			pushi    122
			pushSelf
			lofsa    pillowL
			send     12
			jmp      code_0ce9
code_0cb9:
			dup     
			ldi      5
			eq?     
			bnt      code_0ce9
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lofsa    pillowL
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    285
			pushi    0
			lofsa    pillowL
			send     10
			pushi    1
			pushi    6
			callb    proc0_2,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ce9:
			toss    
			ret     
		)
	)
)

(instance chkPriv of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d50
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    65516
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0da0
code_0d50:
			dup     
			ldi      1
			eq?     
			bnt      code_0d5e
			ldi      4
			aTop     seconds
			jmp      code_0da0
code_0d5e:
			dup     
			ldi      2
			eq?     
			bnt      code_0d7a
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    9
			pushi    157
			pushSelf
			lag      global0
			send     12
			jmp      code_0da0
code_0d7a:
			dup     
			ldi      3
			eq?     
			bnt      code_0d90
			pushi    3
			pushi    1470
			pushi    3
			pushSelf
			calle    proc13_4,  6
			jmp      code_0da0
code_0d90:
			dup     
			ldi      4
			eq?     
			bnt      code_0da0
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0da0:
			toss    
			ret     
		)
	)
)

(instance rope of Feature
	(properties
		x 33
		y 135
		onMeCheck $0002
		lookStr 11
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0df4
			pushi    #setScript
			pushi    1
			lofsa    ropePull
			push    
			lag      global2
			send     6
			jmp      code_0dff
code_0df4:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_0dff:
			toss    
			ret     
		)
	)
)

(instance ropePull of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e6b
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    36
			pushi    139
			pushSelf
			lag      global0
			send     12
			jmp      code_0f0b
code_0e6b:
			dup     
			ldi      1
			eq?     
			bnt      code_0e83
			pushi    2
			lsg      global0
			lofsa    rope
			push    
			callb    proc0_9,  4
			ldi      8
			aTop     cycles
			jmp      code_0f0b
code_0e83:
			dup     
			ldi      2
			eq?     
			bnt      code_0ece
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    452
			pushi    2
			callk    ScriptID,  4
			send     4
			bnt      code_0ea7
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			jmp      code_0f0b
code_0ea7:
			pushi    1
			pushi    100
			callb    proc0_5,  2
			bnt      code_0ebf
			pushi    3
			pushi    1470
			pushi    42
			pushSelf
			calle    proc13_4,  6
			jmp      code_0f0b
code_0ebf:
			pushi    3
			pushi    1470
			pushi    32
			pushSelf
			calle    proc13_4,  6
			jmp      code_0f0b
code_0ece:
			dup     
			ldi      3
			eq?     
			bnt      code_0f0b
			pushi    1
			pushi    100
			callb    proc0_5,  2
			not     
			bnt      code_0f02
			pushi    #setScript
			pushi    3
			pushi    2
			pushi    452
			pushi    2
			callk    ScriptID,  4
			push    
			pushi    0
			lofsa    doMonk
			push    
			pushi    2
			pushi    452
			pushi    0
			callk    ScriptID,  4
			send     10
			pushi    1
			pushi    100
			callb    proc0_6,  2
code_0f02:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0f0b:
			toss    
			ret     
		)
	)
)

(instance doMonk of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f8d
			pushi    0
			callb    proc0_3,  0
			pushi    #posn
			pushi    2
			pushi    70
			pushi    230
			pushi    107
			pushi    0
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    74
			pushi    188
			pushSelf
			pushi    #new
			pushi    0
			pushi    2
			pushi    452
			pushi    1
			callk    ScriptID,  4
			send     4
			aTop     register
			send     30
			jmp      code_1048
code_0f8d:
			dup     
			ldi      1
			eq?     
			bnt      code_0fab
			pushi    2
			lsg      global0
			pTos     register
			callb    proc0_9,  4
			pushi    2
			pTos     register
			lsg      global0
			callb    proc0_9,  4
			ldi      2
			aTop     cycles
			jmp      code_1048
code_0fab:
			dup     
			ldi      2
			eq?     
			bnt      code_0ffc
			lal      local110
			bnt      code_0fca
			pushi    4
			lea      @local16
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1048
code_0fca:
			pushi    1
			pushi    88
			callb    proc0_5,  2
			bnt      code_0fe6
			pushi    4
			lea      @local22
			push    
			pushi    10
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1048
code_0fe6:
			ipToa    state
			pushi    4
			lea      @local4
			push    
			pushi    10
			pushi    9
			pushSelf
			calle    proc851_0,  8
			jmp      code_1048
code_0ffc:
			dup     
			ldi      3
			eq?     
			bnt      code_1015
			ldi      24
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			jmp      code_1048
code_1015:
			dup     
			ldi      4
			eq?     
			bnt      code_1031
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    70
			pushi    230
			pushSelf
			pToa     register
			send     12
			jmp      code_1048
code_1031:
			dup     
			ldi      5
			eq?     
			bnt      code_1048
			pushi    #dispose
			pushi    0
			pToa     register
			send     4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1048:
			toss    
			ret     
		)
	)
)

(instance bCurtains of Feature
	(properties
		x 156
		y 184
		onMeCheck $0010
		lookStr 5
	)
)

(instance bTape of Feature
	(properties
		x 74
		y 127
		onMeCheck $0040
		lookStr 6
	)
)

(instance bed of Feature
	(properties
		x 106
		y 129
		onMeCheck $0200
		approachX 151
		approachY 150
		lookStr 7
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1139
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_112a
			pushi    3
			pushi    1470
			pushi    24
			pushi    1
			calle    proc13_4,  6
			jmp      code_11a7
code_112a:
			pushi    3
			pushi    1470
			pushi    25
			pushi    1
			calle    proc13_4,  6
			jmp      code_11a7
code_1139:
			dup     
			ldi      4
			eq?     
			bnt      code_119c
			pushi    4
			lsp      param2
			pushi    0
			pushi    2
			pushi    18
			calle    proc999_5,  8
			bnt      code_1160
			pushi    3
			pushi    1470
			pushi    62
			pushi    1
			calle    proc13_4,  6
			jmp      code_11a7
code_1160:
			lsp      param2
			ldi      13
			eq?     
			bnt      code_1177
			pushi    3
			pushi    1470
			pushi    63
			pushi    1
			calle    proc13_4,  6
			jmp      code_11a7
code_1177:
			lsp      param2
			ldi      12
			eq?     
			bnt      code_118e
			pushi    3
			pushi    1470
			pushi    64
			pushi    1
			calle    proc13_4,  6
			jmp      code_11a7
code_118e:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
			jmp      code_11a7
code_119c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_11a7:
			toss    
			ret     
		)
	)
)

(instance skin of Feature
	(properties
		x 117
		y 133
		description 6730
		lookStr 10
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_1205
			pushi    3
			pushi    1470
			pushi    31
			pushi    1
			calle    proc13_4,  6
			jmp      code_1210
code_1205:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1210:
			ret     
		)
	)
)

(instance table of Feature
	(properties
		x 156
		y 200
		onMeCheck $0080
		lookStr 12
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_126e
			pushi    3
			pushi    1470
			pushi    58
			pushi    1
			calle    proc13_4,  6
			jmp      code_1290
code_126e:
			dup     
			ldi      4
			eq?     
			bnt      code_1285
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    bed
			send     8
			jmp      code_1290
code_1285:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1290:
			toss    
			ret     
		)
	)
)

(instance desk of Feature
	(properties
		x 272
		y 153
		lookStr 13
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      4
			eq?     
			bnt      code_12ee
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    bed
			send     8
			jmp      code_12f9
code_12ee:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_12f9:
			ret     
		)
	)
)

(instance book of Feature
	(properties
		x 267
		y 155
		lookStr 14
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_1355
			pushi    3
			pushi    1470
			pushi    59
			pushi    1
			calle    proc13_4,  6
			jmp      code_1387
code_1355:
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_137c
			pushi    #distanceTo
			pushi    1
			pushSelf
			lag      global0
			send     6
			push    
			ldi      30
			lt?     
			bnt      code_137c
			pushi    #setScript
			pushi    1
			lofsa    readBook
			push    
			lag      global2
			send     6
			jmp      code_1387
code_137c:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1387:
			ret     
		)
	)
)

(instance readBook of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13e7
			pushi    3
			pushi    1470
			pushi    15
			pushSelf
			calle    proc13_4,  6
			jmp      code_141d
code_13e7:
			dup     
			ldi      1
			eq?     
			bnt      code_13fc
			pushi    3
			pushi    470
			pushi    0
			pushSelf
			calle    proc13_4,  6
			jmp      code_141d
code_13fc:
			dup     
			ldi      2
			eq?     
			bnt      code_1411
			pushi    3
			pushi    470
			pushi    1
			pushSelf
			calle    proc13_4,  6
			jmp      code_141d
code_1411:
			dup     
			ldi      3
			eq?     
			bnt      code_141d
			pushi    #dispose
			pushi    0
			self     4
code_141d:
			toss    
			ret     
		)
	)
)

(instance chair of Feature
	(properties
		x 253
		y 159
		onMeCheck $0100
		lookStr 16
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_1472
			pushi    3
			pushi    1470
			pushi    60
			pushi    1
			calle    proc13_4,  6
			jmp      code_1494
code_1472:
			dup     
			ldi      4
			eq?     
			bnt      code_1489
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    bed
			send     8
			jmp      code_1494
code_1489:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1494:
			toss    
			ret     
		)
	)
)

(instance rug of Feature
	(properties
		lookStr 17
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_1507
			pushi    #owner
			pushi    0
			pushi    #at
			pushi    1
			pushi    12
			class    Inv
			send     6
			send     4
			push    
			lag      global11
			eq?     
			bnt      code_1507
			pushi    3
			pushi    1470
			pushi    61
			pushi    1
			calle    proc13_4,  6
			jmp      code_1512
code_1507:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_1512:
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(asm
			lag      global70
			aTop     x
			lag      global71
			aTop     y
			pushi    #onMe
			pushi    2
			lsp      param1
			lsp      param2
			super    Feature,  8
			ret     
		)
	)
)

(instance windows of Feature
	(properties
		onMeCheck $0020
		lookStr 18
	)
	
	(method (onMe param1 param2)
		(asm
			lsg      global70
			ldi      228
			lt?     
			bnt      code_1581
			ldi      173
			jmp      code_1584
code_1581:
			ldi      283
code_1584:
			aTop     x
			lsg      global70
			ldi      228
			lt?     
			bnt      code_1594
			ldi      116
			jmp      code_1596
code_1594:
			ldi      127
code_1596:
			aTop     y
			pushi    #onMe
			pushi    2
			lsp      param1
			lsp      param2
			super    Feature,  8
			ret     
		)
	)
)

(instance fTape of Feature
	(properties
		x 222
		y 121
		onMeCheck $0008
		lookStr 19
	)
)

(instance rChest of Feature
	(properties
		x 159
		y 124
		approachX 173
		approachY 129
		lookStr 4
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_163c
			pushi    3
			pushi    1470
			pushi    21
			pushi    1
			calle    proc13_4,  6
			jmp      code_165e
code_163c:
			dup     
			ldi      4
			eq?     
			bnt      code_1653
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    bed
			send     8
			jmp      code_165e
code_1653:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_165e:
			toss    
			ret     
		)
	)
)

(instance lChest of View
	(properties
		x 28
		y 174
		approachX 61
		approachY 174
		lookStr 4
		view 470
		loop 1
		signal $4101
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_16bc
			pushi    #setScript
			pushi    1
			lofsa    openIt
			push    
			lag      global2
			send     6
			jmp      code_16de
code_16bc:
			dup     
			ldi      4
			eq?     
			bnt      code_16d3
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			lofsa    bed
			send     8
			jmp      code_16de
code_16d3:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    View,  8
code_16de:
			toss    
			ret     
		)
	)
)

(instance openIt of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1763
			pushi    0
			callb    proc0_3,  0
			pushi    #setHeading
			pushi    2
			pushi    225
			pushSelf
			lag      global0
			send     8
			jmp      code_1813
code_1763:
			dup     
			ldi      1
			eq?     
			bnt      code_1783
			pushi    #view
			pushi    1
			pushi    470
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			lag      global0
			send     18
			ldi      16
			aTop     ticks
			jmp      code_1813
code_1783:
			dup     
			ldi      2
			eq?     
			bnt      code_17a3
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    lChest
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lag      global0
			send     6
			ldi      10
			aTop     ticks
			jmp      code_1813
code_17a3:
			dup     
			ldi      3
			eq?     
			bnt      code_17b9
			pushi    3
			pushi    1470
			pushi    22
			pushSelf
			calle    proc13_4,  6
			jmp      code_1813
code_17b9:
			dup     
			ldi      4
			eq?     
			bnt      code_17d9
			pushi    #setCel
			pushi    1
			pushi    0
			lofsa    lChest
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lag      global0
			send     6
			ldi      15
			aTop     ticks
			jmp      code_1813
code_17d9:
			dup     
			ldi      5
			eq?     
			bnt      code_17ed
			pushi    1
			pushi    5
			callb    proc0_2,  2
			ldi      2
			aTop     cycles
			jmp      code_1813
code_17ed:
			dup     
			ldi      6
			eq?     
			bnt      code_1803
			pushi    3
			pushi    1470
			pushi    23
			pushSelf
			calle    proc13_4,  6
			jmp      code_1813
code_1803:
			dup     
			ldi      7
			eq?     
			bnt      code_1813
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1813:
			toss    
			ret     
		)
	)
)

(instance fire of Actor
	(properties
		x 222
		y 124
		lookStr 20
		view 470
		loop 3
		priority 2
		signal $6010
	)
)

(instance rugPol of Polygon
	(properties
		size 4
	)
)

(instance lChstPol of Polygon
	(properties
		size 6
	)
)

(instance rChstPol of Polygon
	(properties
		size 9
	)
)

(instance DeskPol of Polygon
	(properties
		size 7
	)
)

(instance BookPol of Polygon
	(properties
		size 4
	)
)

(instance SkinPol of Polygon
	(properties
		size 11
	)
)

(instance fireSound of Sound
	(properties
		flags $0001
		number 537
		loop -1
	)
)
