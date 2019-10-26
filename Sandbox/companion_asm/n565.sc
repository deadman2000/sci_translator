;;; Sierra Script 1.0 - (do not remove this comment)
(script# 565)
(include sci.sh)
(use n000)
(use n013)
(use n564)
(use n806)
(use n851)
(use n992)
(use n998)
(use n999)

(public
	peephole 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	[local6 15]
)
(procedure (localproc_0062 param1 param2)
	(asm
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    hideMe
		push    
		lag      global5
		send     8
		lag      global5
		sal      local0
		lag      global32
		sal      local1
		lag      global10
		sal      local2
		lag      global73
		sal      local3
		ldi      0
		sag      global10
		sag      global32
		sag      global5
		sag      global73
		pushi    #drawPic
		pushi    2
		lsp      param1
		lsp      param2
		lag      global2
		send     8
		pushi    #add
		pushi    0
		lofsa    newCast
		sag      global5
		send     4
		pushi    #add
		pushi    0
		lofsa    newFeatures
		sag      global32
		send     4
		pushi    #add
		pushi    1
		lsg      global32
		lofsa    newMDH
		sag      global73
		send     6
		pushi    1
		pushi    19
		calle    proc13_6,  2
		ret     
	)
)

(procedure (localproc_00bd)
	(asm
		pushi    1
		pushi    0
		calle    proc13_6,  2
		pushi    #eachElementDo
		pushi    1
		pushi    108
		pushi    116
		pushi    1
		pushi    84
		pushi    122
		pushi    0
		pushi    108
		pushi    0
		lag      global5
		send     20
		pushi    #dispose
		pushi    0
		lag      global32
		send     4
		pushi    #dispose
		pushi    0
		lag      global73
		send     4
		pushi    #drawPic
		pushi    2
		pushi    #picture
		pushi    0
		lag      global2
		send     4
		push    
		pushi    10
		lag      global2
		send     8
		lal      local0
		sag      global5
		lal      local1
		sag      global32
		pushi    #doit
		pushi    0
		lal      local2
		sag      global10
		send     4
		lal      local3
		sag      global73
		pushi    #eachElementDo
		pushi    2
		pushi    99
		lofsa    showMe
		push    
		lag      global5
		send     8
		pushi    2
		pushi    #elements
		pushi    0
		lag      global5
		send     4
		push    
		pushi    0
		callk    Animate,  4
		ret     
	)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMDH of EventHandler
	(properties)
)

(instance hideMe of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    85
			pushi    #superClass
			pushi    #z
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1000
			add     
			push    
			lap      param1
			send     6
			ret     
		)
	)
)

(instance showMe of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    85
			pushi    #superClass
			pushi    #z
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1000
			sub     
			push    
			lap      param1
			send     6
			ret     
		)
	)
)

(instance peephole of Code
	(properties)
	
	(method (doit)
		(asm
			pushi    0
			callb    proc0_3,  0
			pushi    2
			pushi    565
			pushi    10
			call     localproc_0062,  4
			lsg      global130
			ldi      10
			eq?     
			bnt      code_01b9
			pushi    #setScript
			pushi    1
			lofsa    dayTenScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_01b9:
			pushi    1
			pushi    213
			callb    proc0_5,  2
			bnt      code_01d2
			pushi    #setScript
			pushi    1
			lofsa    allDone
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_01d2:
			pushi    1
			pushi    195
			callb    proc0_5,  2
			bnt      code_01eb
			pushi    #setScript
			pushi    1
			lofsa    allDone
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_01eb:
			lsg      global12
			ldi      570
			eq?     
			bnt      code_0226
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_0226
			pushi    1
			pushi    214
			callb    proc0_5,  2
			not     
			bnt      code_0217
			pushi    #setScript
			pushi    1
			lofsa    guardsDoneDrinking
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0217:
			pushi    #setScript
			pushi    1
			lofsa    randomScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0226:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_0249
			pushi    1
			pushi    214
			callb    proc0_5,  2
			not     
			bnt      code_0249
			pushi    #setScript
			pushi    1
			lofsa    guardsDoneDrinkingTwo
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0249:
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_0261
			pushi    #setScript
			pushi    1
			lofsa    randomScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0261:
			pushi    #has
			pushi    1
			pushi    13
			lag      global0
			send     6
			not     
			bnt      code_02a2
			pushi    1
			pushi    125
			callb    proc0_5,  2
			not     
			bnt      code_02a2
			pushi    #firstLook
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0293
			pushi    #setScript
			pushi    1
			lofsa    rogerEnter
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0293:
			pushi    #setScript
			pushi    1
			lofsa    randomScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_02a2:
			pushi    1
			pushi    31
			callb    proc0_5,  2
			bnt      code_02d4
			pushi    #firstLook
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_02c5
			pushi    #setScript
			pushi    1
			lofsa    rogerEnter
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_02c5:
			pushi    #setScript
			pushi    1
			lofsa    randomScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_02d4:
			pushi    #timerHasFired
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_02ef
			pushi    #setScript
			pushi    1
			lofsa    rogerPace
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_02ef:
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     4
			bt       code_030f
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    564
			pushi    3
			callk    ScriptID,  4
			send     4
code_030f:
			bnt      code_0321
			pushi    #setScript
			pushi    1
			lofsa    shortTimerScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0321:
			pushi    #coinsLeft
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_0356
			pushi    #firstShortTimer
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0347
			pushi    #setScript
			pushi    1
			lofsa    tryAgain
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0347:
			pushi    #setScript
			pushi    1
			lofsa    noMoreChances
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0356:
			pushi    #longTimerGone
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_03cf
			pushi    #valueCoins
			pushi    0
			class    TheDungeon
			send     4
			push    
			ldi      14
			lt?     
			bnt      code_03a0
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     4
			bnt      code_0391
			pushi    #setScript
			pushi    1
			lofsa    goneForAle
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_0391:
			pushi    #setScript
			pushi    1
			lofsa    longTimerOne
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_03a0:
			pushi    #seconds
			pushi    0
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     4
			bnt      code_03c0
			pushi    #setScript
			pushi    1
			lofsa    goneForAle
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_03c0:
			pushi    #setScript
			pushi    1
			lofsa    longTimerTwo
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_03cf:
			pushi    #boysRescued
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_03ea
			pushi    #setScript
			pushi    1
			lofsa    randomScript
			push    
			lag      global2
			send     6
			jmp      code_03f6
code_03ea:
			pushi    #setScript
			pushi    1
			lofsa    randomScript
			push    
			lag      global2
			send     6
code_03f6:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    0
			call     localproc_00bd,  0
			pushi    1
			pushi    565
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance roger of Actor
	(properties
		view 753
		signal $0001
	)
)

(instance giles of Actor
	(properties
		view 753
		signal $0001
	)
)

(instance coins of View
	(properties
		x 138
		y 112
		view 570
		loop 3
	)
)

(instance dayTenScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_059c
			pushi    2
			pushi    1565
			pushi    0
			calle    proc13_4,  4
			ldi      1
			aTop     cycles
			jmp      code_05c6
code_059c:
			dup     
			ldi      1
			eq?     
			bnt      code_05c6
			pushi    #guardsGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timeToDie
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_05c6:
			toss    
			ret     
		)
	)
)

(instance randomScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06c3
			pushi    2
			pushi    1
			pushi    3
			callk    Random,  4
			sal      local4
			pushi    #view
			pushi    1
			pushi    565
			pushi    284
			pushi    2
			pushi    163
			pushi    136
			pushi    66
			pushi    1
			pushi    9
			pushi    107
			pushi    0
			lofsa    giles
			send     24
			lsl      local4
			dup     
			ldi      1
			eq?     
			bnt      code_065d
			pushi    #posn
			pushi    2
			pushi    2
			pushi    111
			pushi    191
			callk    Random,  4
			push    
			pushi    2
			pushi    123
			pushi    130
			callk    Random,  4
			push    
			lofsa    roger
			send     8
			jmp      code_06a8
code_065d:
			dup     
			ldi      2
			eq?     
			bnt      code_0683
			pushi    #posn
			pushi    2
			pushi    2
			pushi    111
			pushi    119
			callk    Random,  4
			push    
			pushi    2
			pushi    123
			pushi    147
			callk    Random,  4
			push    
			lofsa    roger
			send     8
			jmp      code_06a8
code_0683:
			dup     
			ldi      3
			eq?     
			bnt      code_06a8
			pushi    #posn
			pushi    2
			pushi    2
			pushi    106
			pushi    148
			callk    Random,  4
			push    
			pushi    2
			pushi    145
			pushi    147
			callk    Random,  4
			push    
			lofsa    roger
			send     8
code_06a8:
			toss    
			pushi    #loop
			pushi    1
			pushi    2
			pushi    0
			pushi    4
			callk    Random,  4
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     10
			ldi      10
			aTop     cycles
			jmp      code_0775
code_06c3:
			dup     
			ldi      1
			eq?     
			bnt      code_0775
			pushi    1
			pushi    125
			callb    proc0_5,  2
			bnt      code_06f8
			pushi    4
			pushi    1565
			pushi    6
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1565
			pushi    7
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  8
			jmp      code_0764
code_06f8:
			pushi    #has
			pushi    1
			pushi    13
			lag      global0
			send     6
			not     
			bt       code_070c
			pushi    1
			pushi    31
			callb    proc0_5,  2
code_070c:
			bnt      code_0732
			pushi    4
			pushi    1565
			pushi    1
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1565
			pushi    2
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  8
			jmp      code_0764
code_0732:
			pushi    4
			pushi    1565
			pushi    3
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  8
			pushi    4
			pushi    1565
			pushi    4
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  8
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1565
			pushi    5
			calle    proc13_4,  4
code_0764:
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_0775:
			toss    
			ret     
		)
	)
)

(instance rogerEnter of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0804
			pushi    #view
			pushi    1
			pushi    565
			pushi    284
			pushi    2
			pushi    163
			pushi    136
			pushi    66
			pushi    1
			pushi    9
			pushi    107
			pushi    0
			lofsa    giles
			send     24
			pushi    #posn
			pushi    2
			pushi    102
			pushi    105
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    143
			pushi    128
			pushSelf
			lofsa    roger
			send     30
			jmp      code_09be
code_0804:
			dup     
			ldi      1
			eq?     
			bnt      code_0820
			pushi    5
			pushi    1565
			pushi    8
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_09be
code_0820:
			dup     
			ldi      2
			eq?     
			bnt      code_083c
			pushi    5
			pushi    1565
			pushi    9
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_09be
code_083c:
			dup     
			ldi      3
			eq?     
			bnt      code_0858
			pushi    5
			pushi    1565
			pushi    10
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_09be
code_0858:
			dup     
			ldi      4
			eq?     
			bnt      code_0874
			pushi    5
			pushi    1565
			pushi    11
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_09be
code_0874:
			dup     
			ldi      5
			eq?     
			bnt      code_0890
			pushi    5
			pushi    1565
			pushi    12
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_09be
code_0890:
			dup     
			ldi      6
			eq?     
			bnt      code_08ac
			pushi    5
			pushi    1565
			pushi    13
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_09be
code_08ac:
			dup     
			ldi      7
			eq?     
			bnt      code_08c8
			pushi    5
			pushi    1565
			pushi    14
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_09be
code_08c8:
			dup     
			ldi      8
			eq?     
			bnt      code_08e4
			pushi    5
			pushi    1565
			pushi    15
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_09be
code_08e4:
			dup     
			ldi      9
			eq?     
			bnt      code_0901
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    85
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_09be
code_0901:
			dup     
			ldi      10
			eq?     
			bnt      code_090f
			ldi      3
			aTop     seconds
			jmp      code_09be
code_090f:
			dup     
			ldi      11
			eq?     
			bnt      code_092d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    143
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_09be
code_092d:
			dup     
			ldi      12
			eq?     
			bnt      code_0949
			pushi    5
			pushi    1565
			pushi    16
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_09be
code_0949:
			dup     
			ldi      13
			eq?     
			bnt      code_0965
			pushi    5
			pushi    1565
			pushi    17
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_09be
code_0965:
			dup     
			ldi      14
			eq?     
			bnt      code_0981
			pushi    5
			pushi    1565
			pushi    18
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_09be
code_0981:
			dup     
			ldi      15
			eq?     
			bnt      code_099d
			pushi    5
			pushi    1565
			pushi    19
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_09be
code_099d:
			dup     
			ldi      16
			eq?     
			bnt      code_09be
			pushi    #firstLook
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_09be:
			toss    
			ret     
		)
	)
)

(instance rogerPace of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0a49
			pushi    #posn
			pushi    2
			pushi    153
			pushi    146
			pushi    219
			pushi    1
			pushi    6
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    #posn
			pushi    2
			pushi    93
			pushi    128
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     18
			pushi    3
			lofsa    giles
			push    
			lofsa    roger
			push    
			pushSelf
			callb    proc0_9,  6
			jmp      code_0e08
code_0a49:
			dup     
			ldi      1
			eq?     
			bnt      code_0a67
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    215
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0a67:
			dup     
			ldi      2
			eq?     
			bnt      code_0a84
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    93
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0a84:
			dup     
			ldi      3
			eq?     
			bnt      code_0aa2
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    215
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0aa2:
			dup     
			ldi      4
			eq?     
			bnt      code_0ac0
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    143
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0ac0:
			dup     
			ldi      5
			eq?     
			bnt      code_0aef
			pushi    5
			pushi    1565
			pushi    20
			pushi    1
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    93
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0aef:
			dup     
			ldi      6
			eq?     
			bnt      code_0b0d
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    143
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0b0d:
			dup     
			ldi      7
			eq?     
			bnt      code_0b3d
			pushi    5
			pushi    1565
			pushi    21
			pushi    1
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    215
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0b3d:
			dup     
			ldi      8
			eq?     
			bnt      code_0b5b
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    143
			pushi    128
			pushSelf
			lofsa    roger
			send     12
			jmp      code_0e08
code_0b5b:
			dup     
			ldi      9
			eq?     
			bnt      code_0b77
			pushi    5
			pushi    1565
			pushi    22
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0b77:
			dup     
			ldi      10
			eq?     
			bnt      code_0b93
			pushi    5
			pushi    1565
			pushi    23
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0b93:
			dup     
			ldi      11
			eq?     
			bnt      code_0baf
			pushi    5
			pushi    1565
			pushi    24
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0baf:
			dup     
			ldi      12
			eq?     
			bnt      code_0bcb
			pushi    5
			pushi    1565
			pushi    25
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0bcb:
			dup     
			ldi      13
			eq?     
			bnt      code_0be7
			pushi    5
			pushi    1565
			pushi    26
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0be7:
			dup     
			ldi      14
			eq?     
			bnt      code_0c03
			pushi    5
			pushi    1565
			pushi    27
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0c03:
			dup     
			ldi      15
			eq?     
			bnt      code_0c1f
			pushi    5
			pushi    1565
			pushi    28
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0c1f:
			dup     
			ldi      16
			eq?     
			bnt      code_0c2d
			ldi      1
			aTop     cycles
			jmp      code_0e08
code_0c2d:
			dup     
			ldi      17
			eq?     
			bnt      code_0c49
			pushi    5
			pushi    1565
			pushi    29
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0c49:
			dup     
			ldi      18
			eq?     
			bnt      code_0c65
			pushi    5
			pushi    1565
			pushi    30
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0c65:
			dup     
			ldi      19
			eq?     
			bnt      code_0c81
			pushi    5
			pushi    1565
			pushi    31
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0c81:
			dup     
			ldi      20
			eq?     
			bnt      code_0c9d
			pushi    5
			pushi    1565
			pushi    32
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0c9d:
			dup     
			ldi      21
			eq?     
			bnt      code_0cb9
			pushi    5
			pushi    1565
			pushi    33
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0cb9:
			dup     
			ldi      22
			eq?     
			bnt      code_0cd5
			pushi    5
			pushi    1565
			pushi    34
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_0e08
code_0cd5:
			dup     
			ldi      23
			eq?     
			bnt      code_0cf1
			pushi    5
			pushi    1565
			pushi    35
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_0e08
code_0cf1:
			dup     
			ldi      24
			eq?     
			bnt      code_0d10
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    102
			pushi    105
			lofsa    roger
			send     10
			ldi      4
			aTop     seconds
			jmp      code_0e08
code_0d10:
			dup     
			ldi      25
			eq?     
			bnt      code_0d45
			pushi    4
			pushi    1565
			pushi    36
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  8
			pushi    #setCycle
			pushi    1
			class    Walk
			push    
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    116
			pushi    146
			pushSelf
			lofsa    giles
			send     18
			jmp      code_0e08
code_0d45:
			dup     
			ldi      26
			eq?     
			bnt      code_0d62
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    128
			pushSelf
			lofsa    giles
			send     12
			jmp      code_0e08
code_0d62:
			dup     
			ldi      27
			eq?     
			bnt      code_0d7f
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    giles
			send     12
			jmp      code_0e08
code_0d7f:
			dup     
			ldi      28
			eq?     
			bnt      code_0d9b
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    92
			pushi    107
			pushSelf
			lofsa    giles
			send     12
			jmp      code_0e08
code_0d9b:
			dup     
			ldi      29
			eq?     
			bnt      code_0e08
			pushi    #seconds
			pushi    1
			pushi    15
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			push    
			class    TheDungeon
			send     6
			pushi    #neverBefore
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timeToDie
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #guardsGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #firstShortTimer
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    1
			pushi    212
			callb    proc0_6,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_0e08:
			toss    
			ret     
		)
	)
)

(instance shortTimerScript of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0eb2
			pushi    #coinsLeft
			pushi    0
			class    TheDungeon
			send     4
			bnt      code_0eab
			ldi      1
			sal      local5
code_0e61:
			lsl      local5
			pushi    #numberCoins
			pushi    0
			class    TheDungeon
			send     4
			le?     
			bnt      code_0eab
			lsl      local5
			ldi      15
			lt?     
			bnt      code_0eab
			pushi    66
			pushi    #superClass
			pushi    11
			pushi    107
			pushi    0
			pushi    284
			pushi    2
			pushi    2
			pushi    133
			pushi    163
			callk    Random,  4
			push    
			pushi    2
			pushi    109
			pushi    113
			callk    Random,  4
			push    
			pushi    #new
			pushi    0
			lofsa    coins
			send     4
			push    
			lal      local5
			sali     local6
			send     18
			+al      local5
			jmp      code_0e61
code_0eab:
			ldi      1
			aTop     cycles
			jmp      code_0ed4
code_0eb2:
			dup     
			ldi      1
			eq?     
			bnt      code_0ed4
			pushi    2
			pushi    1565
			pushi    37
			calle    proc13_4,  4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_0ed4:
			toss    
			ret     
		)
	)
)

(instance tryAgain of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f7a
			pushi    #posn
			pushi    2
			pushi    187
			pushi    144
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    #posn
			pushi    2
			pushi    114
			pushi    145
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     18
			pushi    2
			lofsa    roger
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    giles
			push    
			lofsa    roger
			push    
			callb    proc0_9,  4
			pushi    5
			pushi    1565
			pushi    38
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1132
code_0f7a:
			dup     
			ldi      1
			eq?     
			bnt      code_0f96
			pushi    5
			pushi    1565
			pushi    39
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1132
code_0f96:
			dup     
			ldi      2
			eq?     
			bnt      code_0fb2
			pushi    5
			pushi    1565
			pushi    40
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1132
code_0fb2:
			dup     
			ldi      3
			eq?     
			bnt      code_0fce
			pushi    5
			pushi    1565
			pushi    41
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1132
code_0fce:
			dup     
			ldi      4
			eq?     
			bnt      code_0fea
			pushi    5
			pushi    1565
			pushi    42
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1132
code_0fea:
			dup     
			ldi      5
			eq?     
			bnt      code_1006
			pushi    5
			pushi    1565
			pushi    43
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1132
code_1006:
			dup     
			ldi      6
			eq?     
			bnt      code_1024
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    152
			pushi    146
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1132
code_1024:
			dup     
			ldi      7
			eq?     
			bnt      code_1053
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    116
			pushi    146
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1132
code_1053:
			dup     
			ldi      8
			eq?     
			bnt      code_1082
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    giles
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    roger
			send     12
			jmp      code_1132
code_1082:
			dup     
			ldi      9
			eq?     
			bnt      code_10b0
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    102
			pushi    105
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1132
code_10b0:
			dup     
			ldi      10
			eq?     
			bnt      code_10cc
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    92
			pushi    107
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1132
code_10cc:
			dup     
			ldi      11
			eq?     
			bnt      code_1132
			pushi    #seconds
			pushi    1
			pushi    15
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    564
			pushi    1
			callk    ScriptID,  4
			push    
			class    TheDungeon
			send     6
			pushi    #neverBefore
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timeToDie
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #guardsGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #firstShortTimer
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_1132:
			toss    
			ret     
		)
	)
)

(instance noMoreChances of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11cc
			pushi    #posn
			pushi    2
			pushi    130
			pushi    124
			pushi    107
			pushi    0
			lofsa    roger
			send     12
			pushi    #posn
			pushi    2
			pushi    142
			pushi    147
			pushi    107
			pushi    0
			lofsa    giles
			send     12
			pushi    2
			lofsa    giles
			push    
			lofsa    roger
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    roger
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			pushi    5
			pushi    1565
			pushi    44
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_122c
code_11cc:
			dup     
			ldi      1
			eq?     
			bnt      code_11e8
			pushi    5
			pushi    1565
			pushi    45
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_122c
code_11e8:
			dup     
			ldi      2
			eq?     
			bnt      code_1204
			pushi    5
			pushi    1565
			pushi    46
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_122c
code_1204:
			dup     
			ldi      3
			eq?     
			bnt      code_122c
			pushi    1
			pushi    195
			callb    proc0_6,  2
			pushi    #tooLate
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_122c:
			toss    
			ret     
		)
	)
)

(instance allDone of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12bb
			pushi    #posn
			pushi    2
			pushi    135
			pushi    120
			pushi    107
			pushi    0
			lofsa    roger
			send     12
			pushi    #view
			pushi    1
			pushi    565
			pushi    284
			pushi    2
			pushi    163
			pushi    136
			pushi    66
			pushi    1
			pushi    9
			pushi    107
			pushi    0
			lofsa    giles
			send     24
			pushi    1
			pushi    0
			calle    proc13_6,  2
			pushi    2
			pushi    1565
			pushi    47
			calle    proc13_4,  4
			ldi      1
			aTop     cycles
			jmp      code_12d3
code_12bb:
			dup     
			ldi      1
			eq?     
			bnt      code_12d3
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_12d3:
			toss    
			ret     
		)
	)
)

(instance goneForAle of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_137d
			pushi    #coinsDoneBeenTook
			pushi    0
			class    TheDungeon
			send     4
			not     
			bnt      code_1376
			ldi      1
			sal      local5
code_132c:
			lsl      local5
			pushi    #numberCoins
			pushi    0
			class    TheDungeon
			send     4
			le?     
			bnt      code_1376
			lsl      local5
			ldi      15
			lt?     
			bnt      code_1376
			pushi    66
			pushi    #superClass
			pushi    11
			pushi    107
			pushi    0
			pushi    284
			pushi    2
			pushi    2
			pushi    133
			pushi    163
			callk    Random,  4
			push    
			pushi    2
			pushi    109
			pushi    113
			callk    Random,  4
			push    
			pushi    #new
			pushi    0
			lofsa    coins
			send     4
			push    
			lal      local5
			sali     local6
			send     18
			+al      local5
			jmp      code_132c
code_1376:
			ldi      2
			aTop     cycles
			jmp      code_13ad
code_137d:
			dup     
			ldi      1
			eq?     
			bnt      code_1395
			pushi    2
			pushi    1565
			pushi    48
			calle    proc13_4,  4
			ldi      1
			aTop     cycles
			jmp      code_13ad
code_1395:
			dup     
			ldi      2
			eq?     
			bnt      code_13ad
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_13ad:
			toss    
			ret     
		)
	)
)

(instance longTimerOne of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1461
			pushi    #posn
			pushi    2
			pushi    130
			pushi    124
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     18
			pushi    #posn
			pushi    2
			pushi    151
			pushi    147
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    2
			lofsa    roger
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    giles
			push    
			lofsa    roger
			push    
			callb    proc0_9,  4
			pushi    #setPri
			pushi    1
			pushi    9
			pushi    107
			pushi    0
			lofsa    coins
			send     10
			pushi    5
			pushi    1565
			pushi    49
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1662
code_1461:
			dup     
			ldi      1
			eq?     
			bnt      code_147d
			pushi    5
			pushi    1565
			pushi    50
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1662
code_147d:
			dup     
			ldi      2
			eq?     
			bnt      code_1499
			pushi    5
			pushi    1565
			pushi    51
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1662
code_1499:
			dup     
			ldi      3
			eq?     
			bnt      code_14b5
			pushi    5
			pushi    1565
			pushi    52
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1662
code_14b5:
			dup     
			ldi      4
			eq?     
			bnt      code_14d1
			pushi    5
			pushi    1565
			pushi    53
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1662
code_14d1:
			dup     
			ldi      5
			eq?     
			bnt      code_14ed
			pushi    5
			pushi    1565
			pushi    54
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1662
code_14ed:
			dup     
			ldi      6
			eq?     
			bnt      code_1509
			pushi    5
			pushi    1565
			pushi    55
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1662
code_1509:
			dup     
			ldi      7
			eq?     
			bnt      code_1525
			pushi    5
			pushi    1565
			pushi    56
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1662
code_1525:
			dup     
			ldi      8
			eq?     
			bnt      code_1543
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    138
			pushi    146
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1662
code_1543:
			dup     
			ldi      9
			eq?     
			bnt      code_1583
			pushi    #dispose
			pushi    0
			lofsa    coins
			send     4
			pushi    #coinsDoneBeenTook
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    116
			pushi    146
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1662
code_1583:
			dup     
			ldi      10
			eq?     
			bnt      code_15b2
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    giles
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    roger
			send     12
			jmp      code_1662
code_15b2:
			dup     
			ldi      11
			eq?     
			bnt      code_15e0
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    102
			pushi    105
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1662
code_15e0:
			dup     
			ldi      12
			eq?     
			bnt      code_15fc
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    92
			pushi    107
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1662
code_15fc:
			dup     
			ldi      13
			eq?     
			bnt      code_1662
			pushi    #seconds
			pushi    1
			pushi    60
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			push    
			class    TheDungeon
			send     6
			pushi    #neverBefore
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timeToDie
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #guardsGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_1662:
			toss    
			ret     
		)
	)
)

(instance longTimerTwo of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1717
			pushi    #posn
			pushi    2
			pushi    130
			pushi    124
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    roger
			send     18
			pushi    #posn
			pushi    2
			pushi    151
			pushi    147
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    2
			lofsa    roger
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    giles
			push    
			lofsa    roger
			push    
			callb    proc0_9,  4
			pushi    #setPri
			pushi    1
			pushi    9
			pushi    107
			pushi    0
			lofsa    coins
			send     10
			pushi    5
			pushi    1565
			pushi    57
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1934
code_1717:
			dup     
			ldi      1
			eq?     
			bnt      code_1733
			pushi    5
			pushi    1565
			pushi    58
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1934
code_1733:
			dup     
			ldi      2
			eq?     
			bnt      code_174f
			pushi    5
			pushi    1565
			pushi    59
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1934
code_174f:
			dup     
			ldi      3
			eq?     
			bnt      code_176b
			pushi    5
			pushi    1565
			pushi    60
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1934
code_176b:
			dup     
			ldi      4
			eq?     
			bnt      code_1787
			pushi    5
			pushi    1565
			pushi    61
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1934
code_1787:
			dup     
			ldi      5
			eq?     
			bnt      code_17a3
			pushi    5
			pushi    1565
			pushi    62
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1934
code_17a3:
			dup     
			ldi      6
			eq?     
			bnt      code_17bf
			pushi    5
			pushi    1565
			pushi    63
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1934
code_17bf:
			dup     
			ldi      7
			eq?     
			bnt      code_17db
			pushi    5
			pushi    1565
			pushi    64
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1934
code_17db:
			dup     
			ldi      8
			eq?     
			bnt      code_17f7
			pushi    5
			pushi    1565
			pushi    65
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1934
code_17f7:
			dup     
			ldi      9
			eq?     
			bnt      code_1815
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    138
			pushi    146
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1934
code_1815:
			dup     
			ldi      10
			eq?     
			bnt      code_1855
			pushi    #dispose
			pushi    0
			lofsa    coins
			send     4
			pushi    #coinsDoneBeenTook
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    116
			pushi    146
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1934
code_1855:
			dup     
			ldi      11
			eq?     
			bnt      code_1884
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    giles
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    roger
			send     12
			jmp      code_1934
code_1884:
			dup     
			ldi      12
			eq?     
			bnt      code_18b2
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    102
			pushi    105
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1934
code_18b2:
			dup     
			ldi      13
			eq?     
			bnt      code_18ce
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    92
			pushi    107
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1934
code_18ce:
			dup     
			ldi      14
			eq?     
			bnt      code_1934
			pushi    1
			pushi    100
			calle    proc806_1,  2
			pushi    #seconds
			pushi    1
			pushi    60
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			send     6
			pushi    #setScript
			pushi    1
			pushi    2
			pushi    564
			pushi    2
			callk    ScriptID,  4
			push    
			class    TheDungeon
			send     6
			pushi    #neverBefore
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timeToDie
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    #guardsGone
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    #timerHasFired
			pushi    1
			pushi    1
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_1934:
			toss    
			ret     
		)
	)
)

(instance guardsDoneDrinking of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_19a6
			pushi    #posn
			pushi    2
			pushi    102
			pushi    105
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			pushi    283
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    roger
			send     30
			jmp      code_1b2f
code_19a6:
			dup     
			ldi      1
			eq?     
			bnt      code_19ec
			pushi    #posn
			pushi    2
			pushi    92
			pushi    107
			pushi    150
			pushi    1
			class    Walk
			push    
			pushi    107
			pushi    0
			lofsa    giles
			send     18
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    117
			pushi    128
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    135
			pushi    120
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1b2f
code_19ec:
			dup     
			ldi      2
			eq?     
			bnt      code_1a1b
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    116
			pushi    146
			lofsa    roger
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    117
			pushi    128
			pushSelf
			lofsa    giles
			send     12
			jmp      code_1b2f
code_1a1b:
			dup     
			ldi      3
			eq?     
			bnt      code_1a39
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    152
			pushi    146
			pushSelf
			lofsa    roger
			send     12
			jmp      code_1b2f
code_1a39:
			dup     
			ldi      4
			eq?     
			bnt      code_1a5f
			pushi    2
			lofsa    roger
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    giles
			push    
			lofsa    roger
			push    
			callb    proc0_9,  4
			ldi      1
			aTop     cycles
			jmp      code_1b2f
code_1a5f:
			dup     
			ldi      5
			eq?     
			bnt      code_1a7b
			pushi    5
			pushi    1565
			pushi    66
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1b2f
code_1a7b:
			dup     
			ldi      6
			eq?     
			bnt      code_1a97
			pushi    5
			pushi    1565
			pushi    67
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1b2f
code_1a97:
			dup     
			ldi      7
			eq?     
			bnt      code_1ab3
			pushi    5
			pushi    1565
			pushi    68
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1b2f
code_1ab3:
			dup     
			ldi      8
			eq?     
			bnt      code_1acf
			pushi    5
			pushi    1565
			pushi    69
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1b2f
code_1acf:
			dup     
			ldi      9
			eq?     
			bnt      code_1aeb
			pushi    5
			pushi    1565
			pushi    70
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1b2f
code_1aeb:
			dup     
			ldi      10
			eq?     
			bnt      code_1b07
			pushi    5
			pushi    1565
			pushi    71
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1b2f
code_1b07:
			dup     
			ldi      11
			eq?     
			bnt      code_1b2f
			pushi    1
			pushi    214
			callb    proc0_6,  2
			pushi    #firstAfterRescue
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_1b2f:
			toss    
			ret     
		)
	)
)

(instance guardsDoneDrinkingTwo of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1bbc
			pushi    #posn
			pushi    2
			pushi    121
			pushi    141
			pushi    107
			pushi    0
			lofsa    roger
			send     12
			pushi    #posn
			pushi    2
			pushi    173
			pushi    130
			pushi    107
			pushi    0
			lofsa    giles
			send     12
			pushi    2
			lofsa    giles
			push    
			lofsa    roger
			push    
			callb    proc0_9,  4
			pushi    2
			lofsa    roger
			push    
			lofsa    giles
			push    
			callb    proc0_9,  4
			ldi      1
			aTop     cycles
			jmp      code_1c8c
code_1bbc:
			dup     
			ldi      1
			eq?     
			bnt      code_1bd8
			pushi    5
			pushi    1565
			pushi    72
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1c8c
code_1bd8:
			dup     
			ldi      2
			eq?     
			bnt      code_1bf4
			pushi    5
			pushi    1565
			pushi    73
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1c8c
code_1bf4:
			dup     
			ldi      3
			eq?     
			bnt      code_1c10
			pushi    5
			pushi    1565
			pushi    74
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1c8c
code_1c10:
			dup     
			ldi      4
			eq?     
			bnt      code_1c2c
			pushi    5
			pushi    1565
			pushi    75
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1c8c
code_1c2c:
			dup     
			ldi      5
			eq?     
			bnt      code_1c48
			pushi    5
			pushi    1565
			pushi    76
			pushSelf
			pushi    80
			lofsa    {Roger}
			push    
			calle    proc13_4,  10
			jmp      code_1c8c
code_1c48:
			dup     
			ldi      6
			eq?     
			bnt      code_1c64
			pushi    5
			pushi    1565
			pushi    77
			pushSelf
			pushi    80
			lofsa    {Giles}
			push    
			calle    proc13_5,  10
			jmp      code_1c8c
code_1c64:
			dup     
			ldi      7
			eq?     
			bnt      code_1c8c
			pushi    1
			pushi    214
			callb    proc0_6,  2
			pushi    #firstAfterRescue
			pushi    1
			pushi    0
			class    TheDungeon
			send     6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
			pushi    #dispose
			pushi    0
			lofsa    peephole
			send     4
code_1c8c:
			toss    
			ret     
		)
	)
)
