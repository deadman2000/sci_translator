;;; Sierra Script 1.0 - (do not remove this comment)
(script# 994)
(include sci.sh)
(use n000)
(use n255)
(use n946)
(use n989)
(use n990)
(use n992)
(use n995)
(use n996)
(use n999)


(procedure (localproc_1016 param1 &tmp temp0 [temp1 40] [temp41 40] temp81)
	(asm
		pushi    2
		pushi    1
		ldi      0
		bnt      code_1025
		ldi      200
		jmp      code_1027
code_1025:
		ldi      80
code_1027:
		push    
		callk    Memory,  4
		sat      temp81
		ldi      1
		sat      temp0
		pushi    3
		pushi    0
		lsg      global29
		lea      @temp1
		push    
		callk    DeviceInfo,  6
		pushi    2
		pushi    1
		lea      @temp41
		push    
		callk    DeviceInfo,  4
		pushi    2
		pushi    3
		lea      @temp41
		push    
		callk    DeviceInfo,  4
		bnt      code_10f2
		pushi    3
		pushi    2
		lea      @temp1
		push    
		lea      @temp41
		push    
		callk    DeviceInfo,  6
		bt       code_1073
		pushi    2
		pushi    6
		pushi    #name
		pushi    0
		lag      global1
		send     4
		push    
		callk    DeviceInfo,  4
		not     
code_1073:
		bnt      code_10f2
		pushi    5
		lst      temp81
		pushi    994
		pushi    3
		lap      param1
		bnt      code_108a
		lofsa    {SAVE GAME}
		jmp      code_108d
code_108a:
		lofsa    {GAME}
code_108d:
		push    
		lea      @temp1
		push    
		callk    Format,  10
		pushi    2
		pushi    135
		lsg      global22
		callk    Load,  4
		pushi    1
		pushi    4
		callk    DeviceInfo,  2
		lap      param1
		bnt      code_10cc
		pushi    12
		lst      temp81
		pushi    33
		pushi    0
		pushi    81
		lofsa    {OK}
		push    
		pushi    1
		pushi    81
		lofsa    {Cancel}
		push    
		pushi    0
		pushi    81
		lofsa    {Change Directory}
		push    
		pushi    2
		calle    proc255_0,  24
		jmp      code_10de
code_10cc:
		pushi    6
		lst      temp81
		pushi    33
		pushi    0
		pushi    81
		lofsa    {OK}
		push    
		pushi    1
		calle    proc255_0,  12
code_10de:
		sat      temp0
		push    
		ldi      2
		eq?     
		bnt      code_10f2
		pushi    1
		lsg      global29
		calle    proc990_0,  2
		sat      temp0
code_10f2:
		pushi    2
		pushi    3
		lst      temp81
		callk    Memory,  4
		lat      temp0
		ret     
	)
)

(instance cast of EventHandler
	(properties)
)

(instance features of EventHandler
	(properties)
)

(instance theDoits of EventHandler
	(properties)
)

(instance sFeatures of EventHandler
	(properties)
	
	(method (delete param1)
		(asm
			pushi    #delete
			pushi    1
			lsp      param1
			super    EventHandler,  6
			lag      global34
			bnt      code_008e
			pushi    #isKindOf
			pushi    1
			class    Collect
			push    
			lap      param1
			send     6
			bnt      code_008e
			pushi    3
			lsp      param1
			lsg      global6
			lsg      global28
			calle    proc999_5,  6
			not     
			bnt      code_008e
			pushi    #release
			pushi    0
			pushi    108
			pushi    0
			lap      param1
			send     8
code_008e:
			ret     
		)
	)
)

(instance sounds of EventHandler
	(properties)
	
	(method (pause param1)
		(asm
			pushi    116
			pushi    3
			pushi    99
			lofsa    mayPause
			push    
			lap      argc
			bnt      code_00c8
			lap      param1
			jmp      code_00ca
code_00c8:
			ldi      1
code_00ca:
			push    
			self     10
			ret     
		)
	)
)

(instance mayPause of Code
	(properties)
	
	(method (doit param1 param2)
		(asm
			pushi    #flags
			pushi    0
			lap      param1
			send     4
			push    
			ldi      1
			and     
			not     
			bnt      code_010b
			pushi    #pause
			pushi    1
			lsp      param2
			lap      param1
			send     6
code_010b:
			ret     
		)
	)
)

(instance regions of EventHandler
	(properties)
)

(instance locales of EventHandler
	(properties)
)

(instance addToPics of EventHandler
	(properties)
	
	(method (doit)
		(asm
			pushi    #eachElementDo
			pushi    2
			pushi    99
			lofsa    aTOC
			push    
			self     8
			pushi    1
			pTos     elements
			callk    AddToPic,  2
			ret     
		)
	)
)

(instance controls of Controls
	(properties)
)

(instance timers of Set
	(properties)
)

(instance aTOC of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1)
		(asm
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			push    
			ldi      16384
			or      
			not     
			bnt      code_029e
			pushi    #xStep
			pushi    0
			lag      global0
			send     4
			push    
			pushi    3
			pushi    #view
			pushi    0
			lag      global0
			send     4
			push    
			pushi    2
			pushi    0
			callk    CelWide,  6
			push    
			ldi      2
			div     
			add     
			sat      temp0
			pushi    #yStep
			pushi    0
			lag      global0
			send     4
			push    
			ldi      2
			mul     
			sat      temp1
			pushi    374
			pushi    1
			pushi    107
			pushi    8
			pushi    #brLeft
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp0
			sub     
			push    
			pushi    2
			pushi    1
			pushi    1
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			callk    CoordPri,  2
			push    
			callk    CoordPri,  4
			push    
			lat      temp1
			sub     
			push    
			pushi    #brRight
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp0
			add     
			push    
			pushi    2
			pushi    1
			pushi    1
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			callk    CoordPri,  2
			push    
			callk    CoordPri,  4
			push    
			lat      temp1
			sub     
			push    
			pushi    #brRight
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp0
			add     
			push    
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp1
			add     
			push    
			pushi    #brLeft
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp0
			sub     
			push    
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp1
			add     
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     24
			push    
			lag      global2
			send     6
code_029e:
			ret     
		)
	)
)

(class Game of Obj
	(properties
		script 0
		parseLang 1
		printLang 1
		subtitleLang 0
		_detailLevel 3
		egoMoveSpeed 0
	)
	
	(method (init)
		(asm
			class    Motion
			class    Sound
			pushi    1
			pushi    932
			callk    ScriptID,  2
			pushi    #add
			pushi    0
			lofsa    cast
			sag      global5
			send     4
			pushi    #add
			pushi    0
			lofsa    features
			sag      global32
			send     4
			pushi    #add
			pushi    0
			lofsa    sFeatures
			sag      global33
			send     4
			pushi    #add
			pushi    0
			lofsa    sounds
			sag      global8
			send     4
			pushi    #add
			pushi    0
			lofsa    regions
			sag      global6
			send     4
			pushi    #add
			pushi    0
			lofsa    locales
			sag      global28
			send     4
			pushi    #add
			pushi    0
			lofsa    addToPics
			sag      global10
			send     4
			pushi    #add
			pushi    0
			lofsa    timers
			sag      global7
			send     4
			pushi    #add
			pushi    0
			lofsa    theDoits
			sag      global78
			send     4
			ldi      0
			sag      global84
			pushi    0
			callk    GetSaveDir,  0
			sag      global29
			pushi    #init
			pushi    0
			class    Inv
			send     4
			lag      global80
			not     
			bnt      code_04bb
			class    User
			sag      global80
code_04bb:
			pushi    #init
			pushi    0
			lag      global80
			send     4
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1)
		(asm
			lsg      global86
			pushi    0
			callk    GetTime,  0
			add     
			sag      global88
			lag      global84
			bnt      code_0582
			lsg      global88
			lag      global79
			add     
			sat      temp1
code_04da:
			lag      global84
			bnt      code_0613
			lsg      global86
			pushi    0
			callk    GetTime,  0
			add     
			sag      global88
			pushi    #eachElementDo
			pushi    1
			pushi    60
			lag      global84
			send     6
			pushi    #type
			pushi    1
			pushi    0
			pushi    40
			pushi    1
			pushi    0
			pushi    64
			pushi    1
			pushi    0
			pushi    3
			pushi    1
			pushi    0
			pushi    4
			pushi    1
			pushi    0
			pushi    76
			pushi    1
			pushi    0
			pushi    143
			pushi    1
			pushi    0
			lofsa    talkerEvent
			send     42
			pushi    2
			pushi    32767
			lofsa    talkerEvent
			push    
			callk    GetEvent,  4
			pushi    #type
			pushi    0
			lofsa    talkerEvent
			send     4
			bnt      code_04da
			lag      global84
			bnt      code_04da
			lsg      global88
			lat      temp1
			sub     
			push    
			ldi      0
			gt?     
			bnt      code_04da
			pushi    #type
			pushi    0
			lofsa    talkerEvent
			send     4
			push    
			ldi      256
			eq?     
			bnt      code_056e
			pushi    34
			pushi    1
			pushi    4
			pushi    40
			pushi    1
			pushi    #modifiers
			pushi    0
			lofsa    talkerEvent
			send     4
			push    
			ldi      3
			eq?     
			bnt      code_0566
			ldi      27
			jmp      code_0568
code_0566:
			ldi      13
code_0568:
			push    
			lofsa    talkerEvent
			send     12
code_056e:
			pushi    #firstTrue
			pushi    2
			pushi    129
			lofsa    talkerEvent
			push    
			lag      global84
			send     8
			jmp      code_04da
			jmp      code_0613
code_0582:
			pushi    #eachElementDo
			pushi    1
			pushi    164
			lag      global8
			send     6
			pushi    #eachElementDo
			pushi    1
			pushi    60
			lag      global7
			send     6
			lag      global25
			bnt      code_05a0
			pushi    #check
			pushi    0
			send     4
code_05a0:
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    1
			callk    Animate,  4
			lag      global84
			bnt      code_05b3
			ret     
code_05b3:
			lag      global37
			bnt      code_05c6
			ldi      0
			sag      global37
			pushi    #eachElementDo
			pushi    1
			pushi    218
			lag      global5
			send     6
code_05c6:
			pToa     script
			bnt      code_05d0
			pushi    #doit
			pushi    0
			send     4
code_05d0:
			pushi    #eachElementDo
			pushi    1
			pushi    60
			lag      global6
			send     6
			lag      global84
			bnt      code_05df
			ret     
code_05df:
			lsg      global13
			lag      global11
			eq?     
			bnt      code_05ee
			pushi    #doit
			pushi    0
			lag      global80
			send     4
code_05ee:
			pushi    #doit
			pushi    0
			lag      global78
			send     4
			lsg      global13
			lag      global11
			ne?     
			bnt      code_0605
			pushi    #newRoom
			pushi    1
			lsg      global13
			self     6
code_0605:
			pushi    #eachElementDo
			pushi    1
			pushi    84
			lag      global7
			send     6
			pushi    1
			pushi    0
			callk    GameIsRestarting,  2
code_0613:
			ret     
		)
	)
	
	(method (play)
		(asm
			selfID  
			sag      global1
			pushi    0
			callk    GetSaveDir,  0
			sag      global29
			pushi    0
			callk    GameIsRestarting,  0
			not     
			bnt      code_02d7
			pushi    1
			lsg      global29
			callk    GetCWD,  2
code_02d7:
			pushi    #setCursor
			pushi    2
			lsg      global21
			pushi    1
			pushi    107
			pushi    0
			pushi    187
			pushi    2
			lsg      global20
			pushi    1
			self     20
code_02ea:
			lag      global4
			not     
			bnt      code_02f8
			pushi    #doit
			pushi    0
			self     4
			jmp      code_02ea
code_02f8:
			ret     
		)
	)
	
	(method (replay)
		(asm
			lag      global24
			bnt      code_033e
			pushi    #dispose
			pushi    0
			send     4
code_033e:
			pushi    #release
			pushi    0
			lag      global33
			send     4
			lag      global25
			bnt      code_034f
			pushi    #dispose
			pushi    0
			send     4
code_034f:
			pushi    #eachElementDo
			pushi    2
			pushi    99
			lofsa    RU
			push    
			lag      global5
			send     8
			pushi    1
			lsg      global84
			callk    IsObject,  2
			bnt      code_036f
			pushi    #eachElementDo
			pushi    2
			pushi    8
			pushi    0
			lag      global84
			send     8
code_036f:
			pushi    #setCursor
			pushi    2
			lsg      global21
			pushi    1
			lag      global1
			send     8
			pushi    4
			pushi    #curPic
			pushi    0
			lag      global2
			send     4
			push    
			pushi    #style
			pushi    0
			lag      global2
			send     4
			push    
			ldi      65535
			eq?     
			bnt      code_0398
			ldi      100
			jmp      code_03a7
code_0398:
			pushi    100
			pushi    #style
			pushi    0
			lag      global2
			send     4
			push    
			ldi      24576
			and     
			or      
code_03a7:
			push    
			pushi    1
			lsg      global40
			callk    DrawPic,  8
			lsg      global36
			ldi      65535
			ne?     
			bnt      code_03c2
			pushi    4
			lsg      global36
			pushi    100
			pushi    0
			lsg      global40
			callk    DrawPic,  8
code_03c2:
			pushi    #controls
			pushi    0
			lag      global2
			send     4
			bnt      code_03da
			pushi    #draw
			pushi    0
			pushi    #controls
			pushi    0
			lag      global2
			send     4
			send     4
code_03da:
			lag      global10
			bnt      code_03e4
			pushi    #doit
			pushi    0
			send     4
code_03e4:
			pushi    187
			pushi    2
			lag      global69
			bnt      code_0406
			pushi    #curIcon
			pushi    0
			send     4
			bnt      code_0406
			pushi    #cursor
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			jmp      code_0408
code_0406:
			lag      global20
code_0408:
			push    
			pushi    1
			lag      global1
			send     8
			pushi    #doit
			pushi    0
			class    SL
			send     4
			pushi    1
			pushi    2
			callk    DoSound,  2
			pushi    #pause
			pushi    1
			pushi    0
			class    Sound
			send     6
			lsg      global88
			pushi    0
			callk    GetTime,  0
			sub     
			sag      global86
code_042c:
			lag      global4
			not     
			bnt      code_043a
			pushi    #doit
			pushi    0
			self     4
			jmp      code_042c
code_043a:
			ret     
		)
	)
	
	(method (newRoom newRoomNumber &tmp [temp0 5] temp5)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global10
			send     10
			pushi    #eachElementDo
			pushi    2
			pushi    99
			lofsa    fDC
			push    
			pushi    122
			pushi    0
			lag      global32
			send     12
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    116
			pushi    1
			pushi    84
			lag      global5
			send     12
			pushi    #eachElementDo
			pushi    1
			pushi    84
			lag      global7
			send     6
			pushi    #eachElementDo
			pushi    2
			pushi    99
			lofsa    DNKR
			push    
			pushi    122
			pushi    0
			lag      global6
			send     12
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			lag      global28
			send     10
			pushi    #release
			pushi    0
			lag      global78
			send     4
			pushi    1
			pushi    0
			callk    Animate,  2
			lag      global11
			sag      global12
			lap      newRoomNumber
			sag      global11
			lap      newRoomNumber
			sag      global13
			pushi    1
			lsp      newRoomNumber
			callk    FlushResources,  2
			pushi    #startRoom
			pushi    1
			lsg      global11
			pushi    381
			pushi    0
			self     10
			pushi    1
			lsg      global6
			callk    SetSynonyms,  2
code_0695:
			pushi    #type
			pushi    0
			pushi    #new
			pushi    1
			pushi    3
			class    Event
			send     6
			sat      temp5
			send     4
			bnt      code_06b2
			pushi    #dispose
			pushi    0
			lat      temp5
			send     4
			jmp      code_0695
code_06b2:
			pushi    #dispose
			pushi    0
			lat      temp5
			send     4
			ret     
		)
	)
	
	(method (startRoom param1)
		(asm
			lag      global14
			bnt      code_0725
			pushi    0
			callk    SetDebug,  0
code_0725:
			pushi    #addToFront
			pushi    1
			pushi    1
			lsp      param1
			callk    ScriptID,  2
			sag      global2
			push    
			lag      global6
			send     6
			pushi    #init
			pushi    0
			lag      global2
			send     4
			ret     
		)
	)
	
	(method (restart)
		(asm
			lag      global25
			bnt      code_0796
			pushi    #dispose
			pushi    0
			send     4
code_0796:
			pushi    0
			callk    RestartGame,  0
			ret     
		)
	)
	
	(method (restore param1 &tmp [temp0 20] temp20 temp21 temp22)
		(asm
			pToa     parseLang
			sat      temp22
			ldi      1
			aTop     parseLang
			pushi    2
			pushi    135
			lsg      global23
			callk    Load,  4
			pushi    2
			pushi    136
			lsg      global21
			callk    Load,  4
			pushi    1
			pushi    990
			callk    ScriptID,  2
			pushi    #setCursor
			pushi    1
			lsg      global20
			self     6
			sat      temp21
			pushi    #pause
			pushi    1
			pushi    1
			class    Sound
			send     6
			pushi    1
			pushi    1
			call     localproc_1016,  2
			bnt      code_0904
			lag      global25
			bnt      code_089f
			pushi    #dispose
			pushi    0
			send     4
code_089f:
			pushi    #doit
			pushi    0
			&rest    param1
			class    Restore
			send     4
			sat      temp20
			push    
			ldi      65535
			ne?     
			bnt      code_08fa
			pushi    #setCursor
			pushi    2
			lsg      global21
			pushi    1
			self     8
			pushi    3
			pTos     name
			lst      temp20
			lsg      global27
			callk    CheckSaveGame,  6
			bnt      code_08d6
			pushi    3
			pTos     name
			lst      temp20
			lsg      global27
			callk    RestoreGame,  6
			jmp      code_08fe
code_08d6:
			pushi    7
			pushi    994
			pushi    1
			pushi    33
			pushi    0
			pushi    81
			lofsa    {OK}
			push    
			pushi    1
			calle    proc255_0,  14
			pushi    #setCursor
			pushi    2
			lst      temp21
			pushi    1
			self     8
			lat      temp22
			aTop     parseLang
			jmp      code_08fe
code_08fa:
			lat      temp22
			aTop     parseLang
code_08fe:
			pushi    1
			pushi    0
			call     localproc_1016,  2
code_0904:
			pushi    #pause
			pushi    1
			pushi    0
			class    Sound
			send     6
			ret     
		)
	)
	
	(method (save &tmp [temp0 20] temp20 temp21 temp22)
		(asm
			pToa     parseLang
			sat      temp22
			ldi      1
			aTop     parseLang
			pushi    2
			pushi    135
			lsg      global23
			callk    Load,  4
			pushi    2
			pushi    136
			lsg      global21
			callk    Load,  4
			pushi    1
			pushi    990
			callk    ScriptID,  2
			pushi    #pause
			pushi    1
			pushi    1
			class    Sound
			send     6
			pushi    1
			pushi    1
			call     localproc_1016,  2
			bnt      code_0848
			lag      global25
			bnt      code_07da
			pushi    #dispose
			pushi    0
			send     4
code_07da:
			pushi    #setCursor
			pushi    2
			lsg      global20
			pushi    1
			self     8
			sat      temp21
			pushi    #doit
			pushi    1
			lea      @temp0
			push    
			class    Save
			send     6
			sat      temp20
			pushi    #setCursor
			pushi    2
			lst      temp21
			pushi    1
			self     8
			lst      temp20
			ldi      65535
			ne?     
			bnt      code_0842
			lat      temp22
			aTop     parseLang
			pushi    #setCursor
			pushi    2
			lsg      global21
			pushi    1
			self     8
			sat      temp21
			pushi    4
			pTos     name
			lst      temp20
			lea      @temp0
			push    
			lsg      global27
			callk    SaveGame,  8
			not     
			bnt      code_0839
			pushi    7
			pushi    994
			pushi    0
			pushi    33
			pushi    0
			pushi    81
			lofsa    {OK}
			push    
			pushi    1
			calle    proc255_0,  14
code_0839:
			pushi    #setCursor
			pushi    2
			lst      temp21
			pushi    1
			self     8
code_0842:
			pushi    1
			pushi    0
			call     localproc_1016,  2
code_0848:
			pushi    #pause
			pushi    1
			pushi    0
			class    Sound
			send     6
			lat      temp22
			aTop     parseLang
			ret     
		)
	)
	
	(method (changeScore param1)
		(asm
			lsg      global15
			lap      param1
			add     
			sag      global15
			pushi    #doit
			pushi    0
			class    SL
			send     4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_074c
			ldi      1
			jmp      code_0775
code_074c:
			pToa     script
			bnt      code_0761
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
			bnt      code_0761
			ldi      1
			jmp      code_0775
code_0761:
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      16384
			eq?     
			bnt      code_0775
			pushi    #pragmaFail
			pushi    0
			self     4
code_0775:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (showMem)
		(asm
			pushi    5
			lofsa    {Free Heap: %u Bytes\nLargest ptr: %u Bytes\nFreeHunk: %u KBytes\nLargest hunk: %u Bytes}
			push    
			pushi    1
			pushi    1
			callk    MemoryInfo,  2
			push    
			pushi    1
			pushi    0
			callk    MemoryInfo,  2
			push    
			pushi    1
			pushi    3
			callk    MemoryInfo,  2
			push    
			ldi      6
			shr     
			push    
			pushi    1
			pushi    2
			callk    MemoryInfo,  2
			push    
			calle    proc255_4,  10
			ret     
		)
	)
	
	(method (setSpeed newSpeed &tmp temp0)
		(asm
			lag      global3
			sat      temp0
			lap      newSpeed
			sag      global3
			lat      temp0
			ret     
		)
	)
	
	(method (setCursor cursorNumber param2 &tmp temp0)
		(asm
			lag      global19
			sat      temp0
			lap      cursorNumber
			sag      global19
			pushi    1
			lsp      cursorNumber
			&rest    param2
			callk    SetCursor,  2
			lat      temp0
			ret     
		)
	)
	
	(method (checkAni &tmp temp0)
		(asm
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
			pushi    1
			pushi    0
			callk    Wait,  2
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
code_06db:
			pushi    1
			pushi    0
			callk    Wait,  2
			push    
			lag      global30
			gt?     
			bnt      code_071b
			pushi    #firstTrue
			pushi    1
			pushi    291
			lag      global5
			send     6
			sat      temp0
			push    
			ldi      0
			eq?     
			bt       code_071b
			pushi    #addToPic
			pushi    0
			lat      temp0
			send     4
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
			pushi    #eachElementDo
			pushi    1
			pushi    84
			lag      global5
			send     6
			jmp      code_06db
code_071b:
			ret     
		)
	)
	
	(method (notify)
		(asm
			ret     
		)
	)
	
	(method (setScript theScript sendParams)
		(asm
			pToa     script
			bnt      code_0964
			pushi    #dispose
			pushi    0
			send     4
code_0964:
			lap      theScript
			bnt      code_0971
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			send     6
code_0971:
			ret     
		)
	)
	
	(method (cue)
		(asm
			pToa     script
			bnt      code_097d
			pushi    #cue
			pushi    0
			send     4
code_097d:
			ret     
		)
	)
	
	(method (quitGame param1)
		(asm
			lap      argc
			not     
			bt       code_0301
			lap      param1
code_0301:
			bnt      code_0308
			ldi      1
			sag      global4
code_0308:
			ret     
		)
	)
	
	(method (masterVolume param1)
		(asm
			lap      argc
			bnt      code_0318
			pushi    2
			pushi    0
			lsp      param1
			callk    DoSound,  4
			jmp      code_031d
code_0318:
			pushi    1
			pushi    0
			callk    DoSound,  2
code_031d:
			ret     
		)
	)
	
	(method (detailLevel param1)
		(asm
			lap      argc
			bnt      code_0331
			lap      param1
			aTop     _detailLevel
			pushi    #eachElementDo
			pushi    1
			pushi    292
			lag      global5
			send     6
code_0331:
			pToa     _detailLevel
			ret     
		)
	)
	
	(method (pragmaFail)
		(asm
			ret     
		)
	)
)

(instance talkerEvent of Event
	(properties)
)

(class Rgn of Obj
	(properties
		script 0
		number 0
		timer 0
		keep 0
		initialized 0
		lookStr 0
	)
	
	(method (init)
		(asm
			pToa     initialized
			not     
			bnt      code_0a5c
			ldi      1
			aTop     initialized
			pushi    #contains
			pushi    1
			pushSelf
			lag      global6
			send     6
			not     
			bnt      code_0a56
			pushi    #addToEnd
			pushi    1
			pushSelf
			lag      global6
			send     6
code_0a56:
			pushi    #init
			pushi    0
			super    Obj,  4
code_0a5c:
			ret     
		)
	)
	
	(method (doit)
		(asm
			pToa     script
			bnt      code_0a67
			pushi    #doit
			pushi    0
			send     4
code_0a67:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global6
			send     6
			pushi    1
			pTos     script
			callk    IsObject,  2
			bnt      code_0b1a
			pushi    #dispose
			pushi    0
			pToa     script
			send     4
code_0b1a:
			pushi    1
			pTos     timer
			callk    IsObject,  2
			bnt      code_0b2a
			pushi    #dispose
			pushi    0
			pToa     timer
			send     4
code_0b2a:
			pushi    #eachElementDo
			pushi    2
			pushi    165
			pushSelf
			lag      global8
			send     8
			pushi    1
			pTos     number
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_0a77
			ldi      1
			jmp      code_0ad7
code_0a77:
			pToa     script
			bnt      code_0a93
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
			bt       code_0a89
			ldi      1
code_0a89:
			bnt      code_0a93
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
code_0a93:
			not     
			bnt      code_0ad7
			pushi    76
			pushi    #superClass
			pushi    268
			pushi    2
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			lag      global9
			bnt      code_0acf
			lag      global69
			bnt      code_0acf
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_0acf
			pushi    #indexOf
			pushi    1
			pushi    #curInvIcon
			pushi    0
			lag      global69
			send     4
			push    
			lag      global9
			send     6
code_0acf:
			push    
			self     8
			push    
			lap      pEvent
			send     6
code_0ad7:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (doVerb theVerb)
		(asm
			lsp      theVerb
			ldi      2
			eq?     
			bnt      code_0afe
			pToa     lookStr
			bnt      code_0afe
			pushi    3
			pushi    994
			pushi    2
			pTos     lookStr
			calle    proc255_4,  6
			ldi      1
			ret     
			jmp      code_0b01
code_0afe:
			ldi      0
			ret     
code_0b01:
			ret     
		)
	)
	
	(method (setScript theScript sendParams)
		(asm
			pushi    1
			pTos     script
			callk    IsObject,  2
			bnt      code_0b4c
			pushi    #dispose
			pushi    0
			pToa     script
			send     4
code_0b4c:
			lap      theScript
			bnt      code_0b59
			pushi    #init
			pushi    1
			pushSelf
			&rest    sendParams
			send     6
code_0b59:
			ret     
		)
	)
	
	(method (cue)
		(asm
			pToa     script
			bnt      code_0b65
			pushi    #cue
			pushi    0
			send     4
code_0b65:
			ret     
		)
	)
	
	(method (newRoom)
		(asm
			ret     
		)
	)
	
	(method (notify)
		(asm
			ret     
		)
	)
)

(class Rm of Rgn
	(properties
		script 0
		number 0
		timer 0
		keep 0
		initialized 0
		lookStr 0
		picture 0
		style $ffff
		horizon 0
		controls 0
		north 0
		east 0
		south 0
		west 0
		curPic 0
		picAngle 0
		vanishingX 160
		vanishingY -30000
		obstacles 0
	)
	
	(method (init &tmp temp0)
		(asm
			lag      global11
			aTop     number
			lofsa    controls
			aTop     controls
			pToa     picAngle
			sag      global31
			pToa     picture
			bnt      code_0be3
			pushi    #drawPic
			pushi    1
			push    
			self     6
code_0be3:
			pushi    #reflectPosn
			pushi    2
			pushi    #alterEgo
			pushi    0
			lag      global80
			send     4
			push    
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			lag      global80
			send     4
			send     4
			push    
			self     8
			pushi    #edgeHit
			pushi    1
			pushi    0
			pushi    #alterEgo
			pushi    0
			lag      global80
			send     4
			send     6
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     script
			bnt      code_0c7d
			pushi    #doit
			pushi    0
			send     4
code_0c7d:
			pushi    #edgeToRoom
			pushi    1
			pushi    #edgeHit
			pushi    0
			pushi    #alterEgo
			pushi    0
			lag      global80
			send     4
			send     4
			push    
			self     6
			sat      temp0
			bnt      code_0c9e
			pushi    #newRoom
			pushi    1
			push    
			self     6
code_0c9e:
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     controls
			bnt      code_0d0b
			pushi    #dispose
			pushi    0
			send     4
code_0d0b:
			pToa     obstacles
			bnt      code_0d15
			pushi    #dispose
			pushi    0
			send     4
code_0d15:
			pushi    #dispose
			pushi    0
			super    Rgn,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Rgn,  6
			bt       code_0d35
			pToa     controls
			bnt      code_0d35
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			send     6
code_0d35:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
	
	(method (newRoom newRoomNumber)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			pushi    116
			pushi    2
			pushi    377
			lsp      newRoomNumber
			pushi    125
			pushi    1
			pushSelf
			lag      global6
			send     20
			lap      newRoomNumber
			sag      global13
			pushi    #newRoom
			pushi    1
			lsp      newRoomNumber
			super    Rgn,  6
			ret     
		)
	)
	
	(method (setRegions scriptNumbers &tmp temp0 temp1 temp2)
		(asm
			ldi      0
			sat      temp0
code_0d43:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_0d80
			lat      temp0
			lapi     scriptNumbers
			sat      temp1
			pushi    1
			push    
			callk    ScriptID,  2
			sat      temp2
			pushi    #number
			pushi    1
			lst      temp1
			send     6
			pushi    #add
			pushi    1
			lst      temp2
			lag      global6
			send     6
			pushi    #initialized
			pushi    0
			lat      temp2
			send     4
			not     
			bnt      code_0d7b
			pushi    #init
			pushi    0
			lat      temp2
			send     4
code_0d7b:
			+at      temp0
			jmp      code_0d43
code_0d80:
			ret     
		)
	)
	
	(method (setFeatures theFeatures &tmp temp0 [temp1 2])
		(asm
			ldi      0
			sat      temp0
code_0dbe:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_0dd6
			pushi    #add
			pushi    1
			lat      temp0
			lspi     theFeatures
			lag      global32
			send     6
			+at      temp0
			jmp      code_0dbe
code_0dd6:
			ret     
		)
	)
	
	(method (setLocales scriptNumbers &tmp temp0 temp1 temp2)
		(asm
			ldi      0
			sat      temp0
code_0d87:
			lst      temp0
			lap      argc
			lt?     
			bnt      code_0db7
			lat      temp0
			lapi     scriptNumbers
			sat      temp1
			pushi    #number
			pushi    1
			push    
			pushi    1
			push    
			callk    ScriptID,  2
			sat      temp2
			send     6
			pushi    #add
			pushi    1
			lst      temp2
			lag      global28
			send     6
			pushi    #init
			pushi    0
			lat      temp2
			send     4
			+at      temp0
			jmp      code_0d87
code_0db7:
			ret     
		)
	)
	
	(method (drawPic picNumber picAnimation)
		(asm
			lag      global10
			bnt      code_0e27
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			send     10
code_0e27:
			lsp      argc
			ldi      2
			ge?     
			bnt      code_0e40
			lsp      picAnimation
			ldi      16384
			and     
			bnt      code_0e40
			pTos     style
			ldi      16384
			or      
			aTop     style
code_0e40:
			lap      picNumber
			aTop     curPic
			ldi      65535
			sag      global36
			pushi    4
			lsp      picNumber
			lsp      argc
			ldi      2
			eq?     
			bnt      code_0e59
			lap      picAnimation
			jmp      code_0e68
code_0e59:
			pTos     style
			ldi      65535
			ne?     
			bnt      code_0e66
			pToa     style
			jmp      code_0e68
code_0e66:
			lag      global17
code_0e68:
			push    
			pushi    1
			lsg      global40
			callk    DrawPic,  8
			ret     
		)
	)
	
	(method (overlay picNumber picAnimation)
		(asm
			lap      picNumber
			sag      global36
			pushi    4
			lsp      picNumber
			lsp      argc
			ldi      2
			eq?     
			bnt      code_0e85
			lap      picAnimation
			jmp      code_0e94
code_0e85:
			pTos     style
			ldi      65535
			ne?     
			bnt      code_0e92
			pToa     style
			jmp      code_0e94
code_0e92:
			lag      global17
code_0e94:
			push    
			pushi    0
			lsg      global40
			callk    DrawPic,  8
			ret     
		)
	)
	
	(method (addObstacle param1 param2)
		(asm
			pushi    1
			pTos     obstacles
			callk    IsObject,  2
			not     
			bnt      code_0dea
			pushi    #new
			pushi    0
			class    List
			send     4
			aTop     obstacles
code_0dea:
			pushi    #add
			pushi    1
			lsp      param1
			&rest    param2
			pToa     obstacles
			send     6
			ret     
		)
	)
	
	(method (reflectPosn param1 param2)
		(asm
			lsp      param2
			dup     
			ldi      1
			eq?     
			bnt      code_0c27
			pushi    #y
			pushi    1
			pushi    188
			lap      param1
			send     6
			jmp      code_0c6f
code_0c27:
			dup     
			ldi      4
			eq?     
			bnt      code_0c44
			pushi    4
			pushi    #superClass
			pushi    319
			pushi    #xStep
			pushi    0
			lap      param1
			send     4
			sub     
			push    
			lap      param1
			send     6
			jmp      code_0c6f
code_0c44:
			dup     
			ldi      3
			eq?     
			bnt      code_0c60
			pushi    3
			pushi    #superClass
			pTos     horizon
			pushi    #yStep
			pushi    0
			lap      param1
			send     4
			add     
			push    
			lap      param1
			send     6
			jmp      code_0c6f
code_0c60:
			dup     
			ldi      2
			eq?     
			bnt      code_0c6f
			pushi    #x
			pushi    1
			pushi    1
			lap      param1
			send     6
code_0c6f:
			toss    
			ret     
		)
	)
	
	(method (edgeToRoom param1)
		(asm
			lsp      param1
			dup     
			ldi      1
			eq?     
			bnt      code_0cad
			pToa     north
			jmp      code_0cce
code_0cad:
			dup     
			ldi      2
			eq?     
			bnt      code_0cb9
			pToa     east
			jmp      code_0cce
code_0cb9:
			dup     
			ldi      3
			eq?     
			bnt      code_0cc5
			pToa     south
			jmp      code_0cce
code_0cc5:
			dup     
			ldi      4
			eq?     
			bnt      code_0cce
			pToa     west
code_0cce:
			toss    
			ret     
		)
	)
	
	(method (roomToEdge param1)
		(asm
			lsp      param1
			dup     
			pToa     north
			eq?     
			bnt      code_0cde
			ldi      1
			jmp      code_0cff
code_0cde:
			dup     
			pToa     south
			eq?     
			bnt      code_0cea
			ldi      3
			jmp      code_0cff
code_0cea:
			dup     
			pToa     east
			eq?     
			bnt      code_0cf6
			ldi      2
			jmp      code_0cff
code_0cf6:
			dup     
			pToa     west
			eq?     
			bnt      code_0cff
			ldi      4
code_0cff:
			toss    
			ret     
		)
	)
)

(class Locale of Obj
	(properties
		number 0
	)
	
	(method (dispose)
		(asm
			pushi    #delete
			pushi    1
			pushSelf
			lag      global28
			send     6
			pushi    1
			pTos     number
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
)

(class SL of Obj
	(properties
		state $0000
		code 0
	)
	
	(method (doit &tmp temp0)
		(asm
			pToa     code
			bnt      code_0fc9
			pushi    2
			pushi    1
			ldi      0
			bnt      code_0fa0
			ldi      240
			jmp      code_0fa2
code_0fa0:
			ldi      82
code_0fa2:
			push    
			callk    Memory,  4
			sat      temp0
			pushi    #doit
			pushi    1
			push    
			pToa     code
			send     6
			pushi    1
			pToa     state
			bnt      code_0fbb
			lat      temp0
			jmp      code_0fbd
code_0fbb:
			ldi      0
code_0fbd:
			push    
			callk    DrawStatus,  2
			pushi    2
			pushi    3
			lst      temp0
			callk    Memory,  4
code_0fc9:
			ret     
		)
	)
	
	(method (enable)
		(asm
			ldi      1
			aTop     state
			pushi    #doit
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (disable)
		(asm
			ldi      0
			aTop     state
			pushi    #doit
			pushi    0
			self     4
			ret     
		)
	)
)

(instance RU of Code
	(properties)
	
	(method (doit param1 &tmp temp0)
		(asm
			pushi    #underBits
			pushi    0
			lap      param1
			send     4
			bnt      code_112a
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			sat      temp0
			push    
			ldi      1
			or      
			sat      temp0
			push    
			ldi      65531
			and     
			sat      temp0
			pushi    #underBits
			pushi    1
			pushi    0
			pushi    17
			pushi    1
			push    
			lap      param1
			send     12
code_112a:
			ret     
		)
	)
)

(instance DNKR of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #keep
			pushi    0
			lap      param1
			send     4
			not     
			bnt      code_115f
			pushi    #dispose
			pushi    0
			lap      param1
			send     4
code_115f:
			ret     
		)
	)
)

(instance fDC of Code
	(properties)
	
	(method (doit param1)
		(asm
			pushi    #respondsTo
			pushi    1
			pushi    84
			lap      param1
			send     6
			bnt      code_11a8
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			lap      param1
			send     4
			push    
			ldi      65503
			and     
			push    
			pushi    108
			pushi    0
			pushi    84
			pushi    0
			lap      param1
			send     14
			jmp      code_11af
code_11a8:
			pushi    #dispose
			pushi    0
			lap      param1
			send     4
code_11af:
			ret     
		)
	)
)
