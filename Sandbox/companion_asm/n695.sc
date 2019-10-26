;;; Sierra Script 1.0 - (do not remove this comment)
(script# 695)
(include sci.sh)
(use n000)
(use n625)
(use n806)
(use n851)
(use n945)
(use n946)
(use n961)
(use n989)
(use n992)
(use n994)
(use n999)

(public
	monDeath 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7
	local8
	local9
	local10
	[local11 4] = [1695 0 1]
	[local15 4] = [1695 1 1]
)
(procedure (localproc_000e)
	(asm
		pushi    4
		lea      @local11
		push    
		pushi    #tPRIOR
		pushi    0
		class    Monastery
		send     4
		push    
		pushi    0
		pushSelf
		calle    proc851_0,  8
		ret     
	)
)

(procedure (localproc_0026)
	(asm
		pushi    4
		lea      @local15
		push    
		pushi    11
		pushi    0
		pushSelf
		calle    proc851_0,  8
		ret     
	)
)

(instance monDeath of Rm
	(properties)
	
	(method (init)
		(asm
			pushi    #picture
			pushi    1
			pushi    #roomToDie
			pushi    0
			class    Monastery
			send     4
			push    
			self     6
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #view
			pushi    1
			pushi    16
			pushi    6
			pushi    1
			pushi    1
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local2
			send     12
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			dup     
			ldi      670
			eq?     
			bnt      code_0197
			pushi    #posn
			pushi    2
			pushi    142
			pushi    205
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_0152
			pushi    #view
			pushi    1
			pushi    641
			pushi    284
			pushi    2
			pushi    230
			pushi    177
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    642
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     38
			pushi    #view
			pushi    1
			pushi    16
			pushi    284
			pushi    2
			pushi    183
			pushi    179
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local1
			send     38
			pushi    #cel
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    199
			pushi    189
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			lal      local2
			send     26
			ldi      160
			sal      local3
			ldi      185
			sal      local4
			ldi      226
			sal      local5
			ldi      177
			sal      local6
			ldi      163
			sal      local7
			ldi      179
			sal      local8
			ldi      174
			sal      local9
			ldi      189
			sal      local10
			pushi    #setScript
			pushi    1
			lofsa    gotchaWater
			push    
			self     6
			jmp      code_0660
code_0152:
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0660
			pushi    #view
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    149
			pushi    169
			pushi    107
			pushi    0
			lal      local2
			send     30
			ldi      173
			sal      local3
			ldi      176
			sal      local4
			pushi    #setScript
			pushi    1
			lofsa    gotchaRing
			push    
			self     6
			jmp      code_0660
code_0197:
			dup     
			ldi      640
			eq?     
			bnt      code_0462
			pushi    #addObstacle
			pushi    4
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    42
			pushi    141
			pushi    144
			pushi    143
			pushi    134
			pushi    187
			pushi    19
			pushi    187
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
			pushi    8
			pushi    79
			pushi    92
			pushi    149
			pushi    89
			pushi    137
			pushi    138
			pushi    43
			pushi    138
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
			pushi    8
			pushi    243
			pushi    94
			pushi    266
			pushi    134
			pushi    176
			pushi    135
			pushi    167
			pushi    96
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
			pushi    8
			pushi    278
			pushi    138
			pushi    299
			pushi    185
			pushi    168
			pushi    185
			pushi    165
			pushi    143
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     12
			pushi    #whichDoor
			pushi    0
			class    Monastery
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0279
			pushi    #posn
			pushi    2
			pushi    59
			pushi    107
			dup     
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			jmp      code_0328
code_0279:
			dup     
			ldi      1
			eq?     
			bnt      code_0297
			pushi    #posn
			pushi    2
			pushi    26
			pushi    144
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			jmp      code_0328
code_0297:
			dup     
			ldi      2
			eq?     
			bnt      code_02b5
			pushi    #posn
			pushi    2
			pushi    6
			pushi    184
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			jmp      code_0328
code_02b5:
			dup     
			ldi      3
			eq?     
			bnt      code_02d4
			pushi    #posn
			pushi    2
			pushi    150
			pushi    184
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			jmp      code_0328
code_02d4:
			dup     
			ldi      4
			eq?     
			bnt      code_02ef
			pushi    #posn
			pushi    2
			pushi    309
			pushi    184
			pushi    107
			pushi    0
			lag      global0
			send     12
			jmp      code_0328
code_02ef:
			dup     
			ldi      5
			eq?     
			bnt      code_030e
			pushi    #posn
			pushi    2
			pushi    295
			pushi    144
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			jmp      code_0328
code_030e:
			dup     
			ldi      6
			eq?     
			bnt      code_0328
			pushi    #posn
			pushi    2
			pushi    262
			pushi    107
			dup     
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
code_0328:
			toss    
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_03ea
			pushi    #view
			pushi    1
			pushi    641
			pushi    284
			pushi    2
			pushi    151
			pushi    89
			pushi    6
			pushi    1
			pushi    2
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    642
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     38
			pushi    #view
			pushi    1
			pushi    16
			pushi    284
			pushi    2
			pushi    22
			pushi    154
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local1
			send     38
			pushi    #cel
			pushi    1
			pushi    1
			pushi    284
			pushi    2
			pushi    163
			pushi    152
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			lal      local2
			send     26
			ldi      146
			sal      local3
			ldi      142
			sal      local4
			ldi      146
			sal      local5
			ldi      125
			sal      local6
			ldi      125
			sal      local7
			ldi      142
			sal      local8
			ldi      163
			sal      local9
			ldi      152
			sal      local10
			pushi    #setScript
			pushi    1
			lofsa    gotchaWater
			push    
			self     6
			jmp      code_0660
code_03ea:
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0660
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pushi    2
			pushi    107
			pushi    8
			pushi    164
			pushi    139
			pushi    161
			pushi    154
			pushi    140
			pushi    153
			pushi    140
			dup     
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     30
			push    
			lag      global2
			send     6
			pushi    #view
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    130
			pushi    139
			pushi    107
			pushi    0
			lal      local2
			send     30
			ldi      154
			sal      local3
			ldi      151
			sal      local4
			pushi    #setScript
			pushi    1
			lofsa    gotchaRing
			push    
			self     6
			jmp      code_0660
code_0462:
			dup     
			ldi      650
			eq?     
			bnt      code_0583
			pushi    #posn
			pushi    2
			pushi    143
			dup     
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      1
			eq?     
			bnt      code_053f
			pushi    #view
			pushi    1
			pushi    641
			pushi    284
			pushi    2
			pushi    54
			pushi    130
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    4
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    642
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     38
			pushi    #view
			pushi    1
			pushi    16
			pushi    284
			pushi    2
			pushi    41
			pushi    158
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local1
			send     38
			pushi    #cel
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    61
			pushi    139
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			lal      local2
			send     26
			ldi      143
			sal      local3
			ldi      143
			sal      local4
			ldi      146
			sal      local5
			ldi      158
			sal      local6
			ldi      139
			sal      local7
			ldi      145
			sal      local8
			ldi      123
			sal      local9
			ldi      132
			sal      local10
			pushi    #setScript
			pushi    1
			lofsa    gotchaWater
			push    
			self     6
			jmp      code_0660
code_053f:
			pushi    #deathReason
			pushi    0
			class    Monastery
			send     4
			push    
			ldi      2
			eq?     
			bnt      code_0660
			pushi    #view
			pushi    1
			pushi    585
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    127
			pushi    144
			pushi    107
			pushi    0
			lal      local2
			send     30
			ldi      153
			sal      local3
			ldi      146
			sal      local4
			pushi    #setScript
			pushi    1
			lofsa    gotchaRing
			push    
			self     6
			jmp      code_0660
code_0583:
			dup     
			ldi      620
			eq?     
			bnt      code_0656
			pushi    #posn
			pushi    2
			pushi    113
			pushi    114
			pushi    107
			pushi    0
			lag      global0
			send     12
			pushi    0
			callb    proc0_2,  0
			pushi    #view
			pushi    1
			pushi    641
			pushi    284
			pushi    2
			pushi    227
			pushi    147
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    642
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     38
			pushi    #view
			pushi    1
			pushi    16
			pushi    284
			pushi    2
			pushi    95
			pushi    145
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			pushi    #new
			pushi    0
			pushi    2
			pushi    625
			pushi    1
			callk    ScriptID,  4
			send     4
			sal      local1
			send     38
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			pushi    195
			pushi    134
			pushi    107
			pushi    0
			pushi    150
			pushi    2
			class    StopWalk
			push    
			pushi    47
			lal      local2
			send     32
			ldi      142
			sal      local3
			ldi      125
			sal      local4
			ldi      200
			sal      local5
			ldi      147
			sal      local6
			ldi      139
			sal      local7
			ldi      145
			sal      local8
			ldi      148
			sal      local9
			ldi      132
			sal      local10
			pushi    #setScript
			pushi    1
			lofsa    gotchaWater
			push    
			self     6
			jmp      code_0660
code_0656:
			pushi    #setScript
			pushi    1
			lofsa    gotcha
			push    
			self     6
code_0660:
			toss    
			ret     
		)
	)
	
	(method (doit param1)
		(asm
			pushi    #picture
			pushi    0
			lag      global2
			send     4
			push    
			ldi      620
			eq?     
			bnt      code_068e
			+al      local0
			push    
			ldi      5
			mod     
			push    
			ldi      0
			eq?     
			bnt      code_068e
			pushi    4
			pushi    6
			pushi    226
			pushi    255
			pushi    65535
			callk    Palette,  8
code_068e:
			pushi    #doit
			pushi    0
			&rest    param1
			super    Rm,  4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #setScript
			pushi    1
			pushi    0
			self     6
			pushi    #dispose
			pushi    0
			super    Rm,  4
			ret     
		)
	)
)

(instance gotcha of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0707
			ldi      10
			aTop     cycles
			jmp      code_0715
code_0707:
			dup     
			ldi      1
			eq?     
			bnt      code_0715
			pushi    0
			calle    proc806_0,  0
code_0715:
			toss    
			ret     
		)
	)
)

(instance gotchaWater of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_077a
			pushi    0
			callb    proc0_3,  0
			ldi      23
			sag      global145
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local3
			lsl      local4
			pushSelf
			lag      global0
			send     12
			jmp      code_0848
code_077a:
			dup     
			ldi      1
			eq?     
			bnt      code_079b
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local5
			lsl      local6
			pushSelf
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			send     12
			jmp      code_0848
code_079b:
			dup     
			ldi      2
			eq?     
			bnt      code_07b6
			pushi    3
			lsg      global0
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0848
code_07b6:
			dup     
			ldi      3
			eq?     
			bnt      code_07d1
			pushi    3
			pushi    2
			pushi    625
			pushi    2
			callk    ScriptID,  4
			push    
			lsg      global0
			pushSelf
			callb    proc0_9,  6
			jmp      code_0848
code_07d1:
			dup     
			ldi      4
			eq?     
			bnt      code_07df
			ldi      10
			aTop     cycles
			jmp      code_0848
code_07df:
			dup     
			ldi      5
			eq?     
			bnt      code_07ee
			pushi    0
			call     localproc_000e,  0
			jmp      code_0848
code_07ee:
			dup     
			ldi      6
			eq?     
			bnt      code_0809
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local7
			lsl      local8
			pushSelf
			lal      local1
			send     12
			jmp      code_0848
code_0809:
			dup     
			ldi      7
			eq?     
			bnt      code_0836
			lsl      local9
			ldi      163
			eq?     
			bnt      code_0822
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0848
code_0822:
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local9
			lsl      local10
			pushSelf
			lal      local2
			send     12
			jmp      code_0848
code_0836:
			dup     
			ldi      8
			eq?     
			bnt      code_0848
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0848:
			toss    
			ret     
		)
	)
)

(instance gotchaRing of Script
	(properties)
	
	(method (doit)
		(asm
			lsg      global11
			ldi      620
			eq?     
			bnt      code_089c
			pushi    4
			pushi    6
			pushi    226
			pushi    255
			pushi    65535
			callk    Palette,  8
code_089c:
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
			bnt      code_08c5
			pushi    0
			callb    proc0_3,  0
			ldi      20
			sag      global145
			pushi    #setMotion
			pushi    4
			class    PolyPath
			push    
			lsl      local3
			lsl      local4
			pushSelf
			lag      global0
			send     12
			jmp      code_0934
code_08c5:
			dup     
			ldi      1
			eq?     
			bnt      code_08d9
			pushi    3
			lsg      global0
			lsl      local2
			pushSelf
			callb    proc0_9,  6
			jmp      code_0934
code_08d9:
			dup     
			ldi      2
			eq?     
			bnt      code_08e7
			ldi      10
			aTop     cycles
			jmp      code_0934
code_08e7:
			dup     
			ldi      3
			eq?     
			bnt      code_08f6
			pushi    0
			call     localproc_0026,  0
			jmp      code_0934
code_08f6:
			dup     
			ldi      4
			eq?     
			bnt      code_0910
			pushi    #setCycle
			pushi    4
			class    CT
			push    
			pushi    3
			pushi    1
			pushSelf
			lal      local2
			send     12
			jmp      code_0934
code_0910:
			dup     
			ldi      5
			eq?     
			bnt      code_0922
			pushi    #play
			pushi    0
			lofsa    dieSound
			send     4
			jmp      code_0934
code_0922:
			dup     
			ldi      6
			eq?     
			bnt      code_0934
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
code_0934:
			toss    
			ret     
		)
	)
)

(instance dieSound of Sound
	(properties
		flags $0001
		number 588
	)
)
