;;; Sierra Script 1.0 - (do not remove this comment)
(script# 532)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n813)
(use n851)
(use n852)
(use n945)
(use n946)
(use n951)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	party 0
)

(local
	[local0 9] = [535 0 2 4 26 38 22 26 27]
	[local9 3] = [-1 5004 19]
	[local12 3] = [-1 5018 19]
	[local15 6] = [1530 9 1 2 1]
	[local21 7] = [1530 12 2 1 1 2]
	[local28 4] = [1530 23 1]
	[local32 4] = [1530 16 1]
	[local36 9] = [1530 17 3 2 3 3 3 1]
	[local45 4] = [1530 112 1]
	[local49 4] = [1530 104 1]
	[local53 4] = [1530 129 1]
	[local57 39] = [186 101 187 109 191 114 192 118 -32768 182 162 178 168 174 172 165 176 159 182 153 196 153 239 -32768 186 165 181 170 174 172 165 176 159 182 153 196 153 239 -32768]
	local96
)
(instance party of Code
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    sheriff
			send     8
			pushi    #approachVerbs
			pushi    1
			pushi    0
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #setCel
			pushi    1
			pushi    #lastCel
			pushi    0
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     4
			push    
			pushi    281
			pushi    1
			pushi    0
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     12
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    3
			pushi    107
			pushi    60
			pushi    168
			pushi    129
			pushi    142
			pushi    129
			pushi    167
			pushi    140
			pushi    160
			pushi    150
			pushi    188
			pushi    150
			pushi    188
			pushi    165
			pushi    153
			pushi    165
			pushi    137
			pushi    189
			pushi    164
			pushi    189
			pushi    165
			pushi    184
			pushi    186
			pushi    184
			pushi    189
			pushi    177
			pushi    201
			pushi    177
			pushi    201
			pushi    159
			pushi    225
			pushi    159
			pushi    244
			pushi    170
			pushi    265
			pushi    178
			pushi    246
			pushi    163
			pushi    287
			pushi    152
			pushi    234
			pushi    156
			pushi    226
			pushi    149
			pushi    204
			pushi    150
			pushi    206
			pushi    129
			pushi    216
			pushi    109
			pushi    241
			pushi    109
			pushi    241
			pushi    105
			pushi    212
			pushi    105
			pushi    204
			pushi    114
			pushi    174
			pushi    114
			pushi    174
			pushi    125
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     134
			push    
			lag      global2
			send     6
			pushi    #init
			pushi    0
			pushi    281
			pushi    2
			pushi    5
			pushi    3
			lofsa    man1
			send     12
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    man2
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man3
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man4
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man5
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man6
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man7
			send     8
			pushi    #init
			pushi    0
			pushi    290
			pushi    0
			lofsa    man8
			send     8
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    wench1
			send     10
			pushi    #init
			pushi    0
			pushi    285
			pushi    0
			lofsa    wench2
			send     8
			pushi    #setScript
			pushi    1
			lofsa    enter
			push    
			lag      global2
			send     6
			pushi    #play
			pushi    0
			lofsa    pubSound
			send     4
			ret     
		)
	)
)

(instance enter of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Script,  4
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			ldi      142
			ge?     
			bnt      code_02d1
			pushi    #setMotion
			pushi    1
			pushi    0
			pushi    142
			pushi    1
			lofsa    prayOrDie
			push    
			lag      global0
			send     12
			pushi    #dispose
			pushi    0
			self     4
code_02d1:
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0208
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    escape
			push    
			pushSelf
			lofsa    dick
			send     8
			pushi    #posn
			pushi    2
			pushi    192
			pushi    99
			pushi    162
			pushi    1
			pushi    2
			pushi    283
			pushi    2
			class    PPath
			push    
			lea      @local57
			push    
			lag      global0
			send     22
			jmp      code_02a4
code_0208:
			dup     
			ldi      1
			eq?     
			bnt      code_024e
			pushi    #view
			pushi    1
			pushi    753
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    192
			pushi    111
			pushSelf
			lofsa    man1
			send     24
			pushi    #addToPic
			pushi    0
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     4
			pushi    #addToPic
			pushi    0
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     4
			jmp      code_02a4
code_024e:
			dup     
			ldi      2
			eq?     
			bnt      code_0290
			pushi    #doit
			pushi    0
			lag      global10
			send     4
			pushi    #actions
			pushi    1
			lofsa    vbKeeper
			push    
			pushi    2
			pushi    530
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #actions
			pushi    1
			lofsa    vbGate
			push    
			pushi    2
			pushi    530
			pushi    2
			callk    ScriptID,  4
			send     6
			pushi    #setHeading
			pushi    2
			pushi    180
			pushSelf
			lofsa    man1
			send     8
			jmp      code_02a4
code_0290:
			dup     
			ldi      3
			eq?     
			bnt      code_02a4
			pushi    #addToPic
			pushi    0
			lofsa    man1
			send     4
			pushi    0
			callb    proc0_4,  0
code_02a4:
			toss    
			ret     
		)
	)
)

(instance escape of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_03a1
			pushi    0
			callb    proc0_3,  0
			pushi    #init
			pushi    0
			pushi    284
			pushi    2
			pushi    168
			pushi    195
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    153
			pushi    239
			lofsa    hal
			push    
			lofsa    hal
			send     30
			pushi    #init
			pushi    0
			pushi    284
			pushi    2
			pushi    188
			pushi    180
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    153
			pushi    239
			lofsa    hob
			push    
			lofsa    hob
			send     30
			pushi    #init
			pushi    0
			pushi    284
			pushi    2
			pushi    190
			pushi    160
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    PolyPath
			push    
			pushi    152
			pushi    187
			pushSelf
			lofsa    dick
			send     30
			jmp      code_03e8
code_03a1:
			dup     
			ldi      1
			eq?     
			bnt      code_03bf
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    152
			pushi    239
			pushSelf
			lofsa    dick
			send     12
			jmp      code_03e8
code_03bf:
			dup     
			ldi      2
			eq?     
			bnt      code_03e8
			pushi    #setScript
			pushi    1
			lofsa    makeOut
			push    
			lofsa    wench2
			send     6
			pushi    #setScript
			pushi    1
			lofsa    drinking
			push    
			lofsa    man2
			send     6
			pushi    #dispose
			pushi    0
			lofsa    dick
			send     4
code_03e8:
			toss    
			ret     
		)
	)
)

(instance prayOrDie of Script
	(properties)
	
	(method (doit)
		(asm
			pushi    #doit
			pushi    0
			super    Script,  4
			lal      local96
			bnt      code_052c
			pushi    #mover
			pushi    0
			lag      global0
			send     4
			bnt      code_052c
			lofsa    die
			aTop     next
			pushi    #dispose
			pushi    0
			self     4
code_052c:
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0444
			pushi    0
			callb    proc0_3,  0
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    sheriff
			send     8
			jmp      code_050b
code_0444:
			dup     
			ldi      1
			eq?     
			bnt      code_045a
			pushi    3
			lsg      global0
			lofsa    sheriff
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_050b
code_045a:
			dup     
			ldi      2
			eq?     
			bnt      code_0468
			ldi      1
			aTop     cycles
			jmp      code_050b
code_0468:
			dup     
			ldi      3
			eq?     
			bnt      code_0484
			pushi    4
			lea      @local15
			push    
			pushi    12
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_050b
code_0484:
			dup     
			ldi      4
			eq?     
			bnt      code_049b
			pushi    #setScript
			pushi    3
			lofsa    changeLaughter
			push    
			pushSelf
			pushi    0
			self     10
			jmp      code_050b
code_049b:
			dup     
			ldi      5
			eq?     
			bnt      code_04ef
			ldi      1
			sal      local96
			pushi    #setCycle
			pushi    1
			class    Beg
			push    
			pushi    142
			pushi    1
			pushi    0
			lofsa    man2
			send     12
			pushi    #setScript
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    0
			lofsa    wench2
			send     12
			pushi    #setCel
			pushi    1
			pushi    #lastCel
			pushi    0
			lofsa    wench2
			send     4
			push    
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			lofsa    wench1
			push    
			lofsa    wench1
			send     18
			pushi    0
			callb    proc0_4,  0
			jmp      code_050b
code_04ef:
			dup     
			ldi      6
			eq?     
			bnt      code_050b
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			lofsa    sheriff
			push    
			lofsa    sheriff
			send     8
			pushi    #dispose
			pushi    0
			self     4
code_050b:
			toss    
			ret     
		)
	)
)

(instance bless of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05a8
			pushi    0
			callb    proc0_3,  0
			ldi      0
			sal      local96
			pushi    1
			pushi    10
			calle    proc806_1,  2
			pushi    #view
			pushi    1
			pushi    531
			pushi    162
			pushi    1
			pushi    2
			pushi    288
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lag      global0
			send     26
			jmp      code_06ba
code_05a8:
			dup     
			ldi      1
			eq?     
			bnt      code_05c4
			pushi    4
			lea      @local21
			push    
			pushi    12
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_06ba
code_05c4:
			dup     
			ldi      2
			eq?     
			bnt      code_05ef
			pushi    #put
			pushi    1
			pushi    1
			lag      global133
			send     6
			pushi    0
			callb    proc0_2,  0
			pushi    #setScript
			pushi    3
			lofsa    changeLaughter
			push    
			pushi    0
			pushi    1
			lofsa    wench1
			send     10
			ldi      30
			aTop     ticks
			jmp      code_06ba
code_05ef:
			dup     
			ldi      3
			eq?     
			bnt      code_0654
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			pushi    #detailLevel
			pushi    0
			lofsa    man2
			send     4
			ge?     
			bnt      code_0619
			pushi    #setScript
			pushi    1
			lofsa    drinking
			push    
			lofsa    man2
			send     6
code_0619:
			pushi    #detailLevel
			pushi    0
			lag      global1
			send     4
			push    
			pushi    #detailLevel
			pushi    0
			lofsa    wench2
			send     4
			ge?     
			bnt      code_063c
			pushi    #setScript
			pushi    1
			lofsa    makeOut
			push    
			lofsa    wench2
			send     6
code_063c:
			pushi    #setLoop
			pushi    1
			pushi    1
			pushi    150
			pushi    1
			class    Fwd
			push    
			lofsa    wench1
			send     12
			ldi      1
			aTop     cycles
			jmp      code_06ba
code_0654:
			dup     
			ldi      4
			eq?     
			bnt      code_0671
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    196
			pushi    156
			pushSelf
			lag      global0
			send     12
			jmp      code_06ba
code_0671:
			dup     
			ldi      5
			eq?     
			bnt      code_068e
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			pushi    155
			pushi    189
			pushSelf
			lag      global0
			send     12
			jmp      code_06ba
code_068e:
			dup     
			ldi      6
			eq?     
			bnt      code_06ae
			pushi    #setHeading
			pushi    1
			pushi    180
			pushi    283
			pushi    3
			class    MoveFwd
			push    
			pushi    40
			pushSelf
			lag      global0
			send     16
			jmp      code_06ba
code_06ae:
			dup     
			ldi      7
			eq?     
			bnt      code_06ba
			pushi    #dispose
			pushi    0
			self     4
code_06ba:
			toss    
			ret     
		)
	)
)

(instance die of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0709
			ldi      1
			aTop     seconds
			jmp      code_0773
code_0709:
			dup     
			ldi      1
			eq?     
			bnt      code_0730
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    4
			lea      @local32
			push    
			pushi    12
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0773
code_0730:
			dup     
			ldi      2
			eq?     
			bnt      code_0755
			pushi    9
			pushi    3
			lea      @local36
			push    
			pushi    12
			pushi    0
			pushi    999
			pushi    1
			lea      @local9
			push    
			pushi    2
			pushSelf
			calle    proc851_0,  18
			jmp      code_0773
code_0755:
			dup     
			ldi      3
			eq?     
			bnt      code_0773
			ldi      28
			sag      global145
			pushi    #stop
			pushi    0
			lag      global100
			send     4
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0773:
			toss    
			ret     
		)
	)
)

(instance drinking of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_07c9
			pushi    2
			pushi    3
			pushi    6
			callk    Random,  4
			aTop     seconds
			jmp      code_07f9
code_07c9:
			dup     
			ldi      1
			eq?     
			bnt      code_07e2
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			pToa     client
			send     12
			jmp      code_07f9
code_07e2:
			dup     
			ldi      2
			eq?     
			bnt      code_07f9
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			pToa     client
			send     8
			ldi      65535
			aTop     state
code_07f9:
			toss    
			ret     
		)
	)
)

(instance makeOut of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0852
			pushi    #setCycle
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    wench2
			send     8
			jmp      code_0889
code_0852:
			dup     
			ldi      1
			eq?     
			bnt      code_086e
			pushi    #setLoop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    wench2
			send     14
			jmp      code_0889
code_086e:
			dup     
			ldi      2
			eq?     
			bnt      code_0889
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    wench2
			send     8
			pTos     state
			ldi      2
			sub     
			aTop     state
code_0889:
			toss    
			ret     
		)
	)
)

(instance changeLaughter of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0935
			pTos     register
			ldi      0
			eq?     
			bnt      code_0907
			pushi    #number
			pushi    1
			pushi    541
			pushi    162
			pushi    1
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			lofsa    pubSound
			send     18
			pushi    #number
			pushi    1
			pushi    538
			pushi    162
			pushi    1
			pushi    0
			pushi    42
			pushi    0
			lag      global100
			send     16
			ldi      1
			aTop     cycles
			jmp      code_0970
code_0907:
			pushi    #number
			pushi    1
			pushi    540
			pushi    162
			pushi    1
			pushi    0
			pushi    42
			pushi    1
			pushSelf
			lofsa    pubSound
			send     18
			pushi    #number
			pushi    1
			pushi    530
			pushi    162
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lag      global100
			send     16
			ldi      1
			aTop     cycles
			jmp      code_0970
code_0935:
			dup     
			ldi      1
			eq?     
			bnt      code_0944
			ldi      1000
			aTop     ticks
			jmp      code_0970
code_0944:
			dup     
			ldi      2
			eq?     
			bnt      code_0970
			ldi      0
			aTop     ticks
			pTos     register
			ldi      1
			eq?     
			bnt      code_096b
			pushi    #number
			pushi    1
			pushi    539
			pushi    162
			pushi    1
			pushi    65535
			pushi    42
			pushi    0
			lofsa    pubSound
			send     16
code_096b:
			pushi    #dispose
			pushi    0
			self     4
code_0970:
			toss    
			ret     
		)
	)
)

(instance sheriff of Prop
	(properties
		x 169
		y 160
		approachX 190
		approachY 175
		lookStr 77
		view 531
		loop 1
		priority 12
		signal $4810
		cycleSpeed 9
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_09dc
			lal      local96
			bnt      code_09ce
			pushi    #setScript
			pushi    2
			lofsa    bless
			push    
			lofsa    prayOrDie
			push    
			lofsa    prayOrDie
			send     8
			jmp      code_0a53
code_09ce:
			pushi    3
			pushi    1530
			pushi    0
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a53
code_09dc:
			dup     
			ldi      3
			eq?     
			bnt      code_0a07
			lal      local96
			bnt      code_09f8
			pushi    2
			lea      @local28
			push    
			pushi    12
			calle    proc851_0,  4
			jmp      code_0a53
code_09f8:
			pushi    3
			pushi    1530
			pushi    111
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a53
code_0a07:
			dup     
			ldi      4
			eq?     
			bnt      code_0a48
			lsp      param2
			ldi      0
			eq?     
			bnt      code_0a26
			pushi    2
			lea      @local53
			push    
			pushi    12
			calle    proc851_0,  4
			jmp      code_0a53
code_0a26:
			lal      local96
			bnt      code_0a3a
			pushi    #setScript
			pushi    1
			lofsa    die
			push    
			lag      global0
			send     6
			jmp      code_0a53
code_0a3a:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
			jmp      code_0a53
code_0a48:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_0a53:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #addToPic
			pushi    0
			self     4
			ret     
		)
	)
)

(instance hal of Actor
	(properties
		view 23
		signal $6000
	)
	
	(method (cue)
		(asm
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
)

(instance hob of Actor
	(properties
		view 23
		signal $6000
	)
	
	(method (cue)
		(asm
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
)

(instance dick of Actor
	(properties
		view 23
		signal $6000
		illegalBits $0000
	)
)

(instance man1 of Actor
	(properties
		x 211
		y 112
		approachX 192
		approachY 116
		lookStr 81
		view 754
		loop 2
		signal $6000
		illegalBits $0000
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_0c82
			pushi    4
			pushi    1
			lea      @local45
			push    
			lea      @local12
			push    
			pushi    1
			calle    proc851_0,  8
			jmp      code_0ca9
code_0c82:
			dup     
			ldi      3
			eq?     
			bnt      code_0c9e
			pushi    4
			pushi    1
			lea      @local49
			push    
			lea      @local12
			push    
			pushi    1
			calle    proc851_0,  8
			jmp      code_0ca9
code_0c9e:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Actor,  8
code_0ca9:
			toss    
			ret     
		)
	)
)

(instance man2 of Prop
	(properties
		x 95
		y 131
		view 531
		signal $4000
		detailLevel 2
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0d4a
			pushi    3
			pushi    1530
			pushi    78
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d82
code_0d4a:
			dup     
			ldi      5
			eq?     
			bnt      code_0d60
			pushi    3
			pushi    1530
			pushi    114
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d82
code_0d60:
			dup     
			ldi      3
			eq?     
			bnt      code_0d76
			pushi    3
			pushi    1530
			pushi    110
			pushi    1
			calle    proc13_4,  6
			jmp      code_0d82
code_0d76:
			dup     
			class    6629
			eq?     
			bnt      code_0d82
			pToa     species
			lap      theVerb
code_0d82:
			toss    
			ret     
		)
	)
)

(instance man3 of Actor
	(properties
		x 133
		y 139
		lookStr 78
		view 754
		signal $6800
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e0a
			pushi    3
			pushi    1530
			pushi    78
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e41
code_0e0a:
			dup     
			ldi      5
			eq?     
			bnt      code_0e20
			pushi    3
			pushi    1530
			pushi    116
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e41
code_0e20:
			dup     
			ldi      3
			eq?     
			bnt      code_0e36
			pushi    3
			pushi    1530
			pushi    110
			pushi    1
			calle    proc13_4,  6
			jmp      code_0e41
code_0e36:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Actor,  6
code_0e41:
			toss    
			ret     
		)
	)
)

(instance man4 of View
	(properties
		x 219
		y 173
		view 754
		loop 1
		signal $4000
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man3
			send     4
			ret     
		)
	)
)

(instance man5 of View
	(properties
		x 128
		y 187
		view 754
		signal $4000
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man3
			send     4
			ret     
		)
	)
)

(instance man6 of View
	(properties
		x 75
		y 156
		view 531
		cel 6
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man3
			send     4
			ret     
		)
	)
)

(instance man7 of View
	(properties
		x 44
		y 185
		view 754
		cel 3
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man3
			send     4
			ret     
		)
	)
)

(instance man8 of View
	(properties
		x 227
		y 122
		view 531
		signal $4000
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    man3
			send     4
			ret     
		)
	)
)

(instance wench1 of Prop
	(properties
		x 108
		y 140
		view 532
		loop 1
		priority 13
		signal $4010
		cycleSpeed 9
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_1112
			pushi    3
			pushi    1530
			pushi    83
			pushi    1
			calle    proc13_4,  6
			jmp      code_1149
code_1112:
			dup     
			ldi      5
			eq?     
			bnt      code_1128
			pushi    3
			pushi    1530
			pushi    108
			pushi    1
			calle    proc13_4,  6
			jmp      code_1149
code_1128:
			dup     
			ldi      3
			eq?     
			bnt      code_113e
			pushi    3
			pushi    1530
			pushi    107
			pushi    1
			calle    proc13_4,  6
			jmp      code_1149
code_113e:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_1149:
			toss    
			ret     
		)
	)
	
	(method (cue)
		(asm
			pushi    #setLoop
			pushi    1
			pushi    3
			self     6
			ret     
		)
	)
)

(instance wench2 of Prop
	(properties
		x 157
		y 127
		view 532
		signal $4000
		cycleSpeed 10
		detailLevel 2
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_11de
			pushi    3
			pushi    1530
			pushi    82
			pushi    1
			calle    proc13_4,  6
			jmp      code_1215
code_11de:
			dup     
			ldi      5
			eq?     
			bnt      code_11f4
			pushi    3
			pushi    1530
			pushi    113
			pushi    1
			calle    proc13_4,  6
			jmp      code_1215
code_11f4:
			dup     
			ldi      3
			eq?     
			bnt      code_120a
			pushi    3
			pushi    1530
			pushi    105
			pushi    1
			calle    proc13_4,  6
			jmp      code_1215
code_120a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Prop,  6
code_1215:
			toss    
			ret     
		)
	)
)

(instance vbKeeper of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_129e
			pushi    3
			pushi    1530
			pushi    38
			pushi    1
			calle    proc13_4,  6
			jmp      code_12e0
code_129e:
			dup     
			ldi      3
			eq?     
			bnt      code_12ab
			ldi      0
			ret     
			jmp      code_12e0
code_12ab:
			dup     
			ldi      2
			eq?     
			bnt      code_12b8
			ldi      0
			ret     
			jmp      code_12e0
code_12b8:
			dup     
			ldi      4
			eq?     
			bnt      code_12dd
			lsp      param2
			ldi      0
			eq?     
			bnt      code_12d7
			pushi    3
			pushi    1530
			pushi    130
			pushi    1
			calle    proc13_4,  6
			jmp      code_12e0
code_12d7:
			ldi      1
			ret     
			jmp      code_12e0
code_12dd:
			ldi      1
			ret     
code_12e0:
			toss    
			ret     
		)
	)
)

(instance vbGate of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_131a
			pushi    3
			pushi    1530
			pushi    39
			pushi    1
			calle    proc13_4,  6
			jmp      code_1333
code_131a:
			dup     
			ldi      3
			eq?     
			bnt      code_1330
			pushi    3
			pushi    1530
			pushi    84
			pushi    1
			calle    proc13_4,  6
			jmp      code_1333
code_1330:
			ldi      0
			ret     
code_1333:
			toss    
			ret     
		)
	)
)

(instance pubSound of Sound
	(properties
		flags $0001
		number 539
		loop -1
	)
)
