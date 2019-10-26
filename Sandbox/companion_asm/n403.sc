;;; Sierra Script 1.0 - (do not remove this comment)
(script# 403)
(include sci.sh)
(use n000)
(use n013)
(use n400)
(use n806)
(use n813)
(use n851)
(use n945)
(use n953)
(use n992)
(use n996)
(use n998)

(public
	jewelerArrivesScript 0
	matilda 1
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
	[local8 9] = [404 0 2 4 25 29 22 20 18]
	[local17 11] = [1403 0 1 3 2 3 3 1 3 2]
	[local28 10] = [1403 8 1 1 3 3 1 2 3]
	[local38 7] = [1403 16 2 1 1 3]
	[local45 5] = [1403 20 2 1]
	[local50 4] = [1403 22 2]
	[local54 7] = [1403 23 3 1 3 3]
	[local61 4] = [1403 27 2]
	[local65 4] = [1403 28 1]
	[local69 5] = [1403 29 1 2]
	[local74 4] = [1403 32 2]
	[local78 5] = [1403 33 1 2]
	[local83 4] = [1403 35 2]
	[local87 6] = [1403 36 1 3 3]
	[local93 5] = [1403 39 1 3]
	[local98 6] = [1403 41 1 3 3]
	[local104 4] = [1403 44 3]
	[local108 4] = [1403 45 1]
	[local112 6] = [1403 46 1 2 2]
	[local118 6] = [1403 50 2 2 1]
	[local124 7] = [1403 53 1 3 3 2]
	[local131 5] = [1403 57 1 3]
	[local136 6] = [1403 59 3 2 1]
	[local142 7] = [1403 63 1 3 3 2]
	[local149 5] = [1403 67 1 2]
	[local154 5] = [1403 69 1 2]
	[local159 5] = [1403 71 1 3]
	[local164 6] = [1403 73 1 3 3]
	[local170 8] = [1403 76 2 2 1 2 2]
	[local178 4] = [1403 81 2]
	[local182 5] = [1403 82 3 3]
	[local187 4] = [1403 84 3]
	[local191 10] = [1403 85 2 2 1 2 1 2 2]
	[local201 4] = [1403 92 2]
	[local205 5] = [1403 93 3 3]
	[local210 4] = [1403 95 3]
	[local214 13] = [1403 96 1 3 3 2 3 2 1 2 1 3]
	[local227 5] = [1403 106 2 1]
	[local232 9] = [1403 108 2 1 1 2 1 2]
	[local241 34] = [1403 114 2 1 2 1 1 3 1 1 3 1 1 1 3 1 2 2 1 2 1 2 1 1 2 1 2 1 3 3 2 2 2]
	[local275 4] = [1403 145 3]
	[local279 5] = [1403 146 1 3]
	[local284 6] = [1403 148 2 1 3]
	[local290 4] = [1403 151 1]
	[local294 4] = [1403 152 3]
)
(procedure (localproc_0012 param1 param2)
	(asm
		pushi    8
		pushi    3
		lsp      param1
		pushi    999
		pushi    3
		pushi    12
		pushi    1
		lea      @local8
		push    
		pushi    0
		&rest    param2
		calle    proc851_0,  16
		ret     
	)
)

(instance jewelerArrivesScript of TScript
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
		(asm
			pushi    #doit
			pushi    0
			&rest    param1
			super    TScript,  4
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
			pushi    #controls
			pushi    0
			class    User
			send     4
			bnt      code_015c
			pushi    #mover
			pushi    0
			lag      global0
			send     4
code_015c:
			sat      temp2
			not     
			bnt      code_0166
			ret     
			jmp      code_019e
code_0166:
			pushi    #isMemberOf
			pushi    1
			class    PolyPath
			push    
			lat      temp2
			send     6
			sat      temp5
			bnt      code_018c
			pushi    #finalX
			pushi    0
			lat      temp2
			send     4
			sat      temp3
			pushi    #finalY
			pushi    0
			lat      temp2
			send     4
			sat      temp4
			jmp      code_019e
code_018c:
			pushi    #x
			pushi    0
			lat      temp2
			send     4
			sat      temp3
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			sat      temp4
code_019e:
			lst      temp0
			lat      temp3
			eq?     
			bnt      code_01af
			lst      temp1
			lat      temp4
			eq?     
			bnt      code_01af
			ret     
code_01af:
			ldi      1
			bnt      code_01ea
			lst      temp3
			pushi    #x
			pushi    0
			lag      global0
			send     4
			lt?     
			bnt      code_01ea
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			lal      local7
			bnt      code_01de
			pushi    #setScript
			pushi    1
			lofsa    getTableJewels
			push    
			pToa     client
			send     6
			jmp      code_01ea
code_01de:
			pushi    #setScript
			pushi    1
			lofsa    leaveBeforeJewels
			push    
			pToa     client
			send     6
code_01ea:
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
			bnt      code_00e1
			pushi    0
			callb    proc0_3,  0
			pushi    #actions
			pushi    1
			lofsa    SheriffJewelerActions
			push    
			pushi    2
			pushi    400
			pushi    2
			callk    ScriptID,  4
			sal      local0
			send     6
			pushi    #actions
			pushi    1
			lofsa    TableActions
			push    
			pushi    2
			pushi    400
			pushi    3
			callk    ScriptID,  4
			sal      local1
			send     6
			pushi    2
			pushi    400
			pushi    4
			callk    ScriptID,  4
			sal      local2
			pushi    2
			pushi    400
			pushi    5
			callk    ScriptID,  4
			sal      local3
			pushi    2
			pushi    400
			pushi    6
			callk    ScriptID,  4
			sal      local4
			pushi    1
			pushi    145
			callb    proc0_6,  2
			pushi    #approachX
			pushi    1
			pushi    #approachX
			pushi    0
			lal      local1
			send     4
			push    
			pushi    274
			pushi    1
			pushi    #approachY
			pushi    0
			lal      local1
			send     4
			push    
			pushi    281
			pushi    1
			pushi    5
			lofsa    matilda
			send     18
			pushi    #init
			pushi    0
			pushi    105
			pushi    0
			lofsa    jewelProp
			send     8
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #approachX
			pushi    0
			lal      local1
			send     4
			push    
			pushi    #approachY
			pushi    0
			lal      local1
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_012c
code_00e1:
			dup     
			ldi      1
			eq?     
			bnt      code_00ef
			ldi      1
			aTop     cycles
			jmp      code_012c
code_00ef:
			dup     
			ldi      2
			eq?     
			bnt      code_0121
			lsg      global126
			ldi      2
			eq?     
			bnt      code_0114
			pushi    1
			pushi    10
			callb    proc0_5,  2
			bnt      code_0114
			pushi    #setScript
			pushi    1
			lofsa    blondScript
			push    
			self     6
			jmp      code_012c
code_0114:
			pushi    2
			lea      @local28
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_012c
code_0121:
			dup     
			ldi      3
			eq?     
			bnt      code_012c
			pushi    0
			callb    proc0_4,  0
code_012c:
			toss    
			ret     
		)
	)
)

(instance showJewel of TScript
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_029c
			pushi    0
			callb    proc0_2,  0
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
			pushi    #approachX
			pushi    0
			lal      local1
			sat      temp2
			send     4
			sat      temp3
			pushi    #approachY
			pushi    0
			lat      temp2
			send     4
			sat      temp4
			lst      temp0
			lat      temp3
			ne?     
			bt       code_0273
			lst      temp1
			lat      temp4
			ne?     
code_0273:
			bnt      code_028a
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lst      temp3
			lst      temp4
			pushSelf
			lag      global0
			send     12
			jmp      code_02ee
code_028a:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #cue
			pushi    0
			self     4
			jmp      code_02ee
code_029c:
			dup     
			ldi      1
			eq?     
			bnt      code_02c7
			pushi    #view
			pushi    1
			pushi    32
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    58
			pushi    1
			pushi    90
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     36
			jmp      code_02ee
code_02c7:
			dup     
			ldi      2
			eq?     
			bnt      code_02dd
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_02ee
code_02dd:
			dup     
			ldi      3
			eq?     
			bnt      code_02ee
			pushi    1
			pushi    0
			callb    proc0_2,  2
			pushi    #dispose
			pushi    0
			self     4
code_02ee:
			toss    
			ret     
		)
	)
)

(instance blondScript of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0349
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lea      @local17
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_03af
code_0349:
			dup     
			ldi      1
			eq?     
			bnt      code_0363
			pushi    #setMotion
			pushi    4
			class    Approach
			push    
			lsg      global0
			pushi    1
			pushSelf
			lal      local2
			send     12
			jmp      code_03af
code_0363:
			dup     
			ldi      2
			eq?     
			bnt      code_0394
			pushi    #setMotion
			pushi    3
			class    GuardFollow
			push    
			lsg      global0
			pushi    30
			lal      local2
			send     10
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    20
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_03af
code_0394:
			dup     
			ldi      3
			eq?     
			bnt      code_03af
			ldi      9
			sag      global145
			pushi    #newRoom
			pushi    1
			pushi    170
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_03af:
			toss    
			ret     
		)
	)
)

(instance jewelProp of Prop
	(properties
		x 162
		y 150
		z 22
		view 400
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0411
			pushi    0
			pTos     signal
			ldi      128
			and     
			eq?     
			bnt      code_0426
			pushi    #setScript
			pushi    1
			lofsa    getTableJewels
			push    
			lag      global2
			send     6
			jmp      code_0426
code_0411:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			pushi    #at
			pushi    1
			pushi    7
			lag      global9
			send     6
			send     8
code_0426:
			toss    
			ret     
		)
	)
)

(instance getTableJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_04b4
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    gatherJewels
			push    
			pushSelf
			self     8
			jmp      code_0512
code_04b4:
			dup     
			ldi      1
			eq?     
			bnt      code_04c8
			pushi    2
			lea      @local54
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0512
code_04c8:
			dup     
			ldi      2
			eq?     
			bnt      code_04dd
			pushi    #setScript
			pushi    2
			lofsa    spreadJewels
			push    
			pushSelf
			self     8
			jmp      code_0512
code_04dd:
			dup     
			ldi      3
			eq?     
			bnt      code_04f1
			pushi    2
			lea      @local61
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0512
code_04f1:
			dup     
			ldi      4
			eq?     
			bnt      code_0506
			pushi    #setScript
			pushi    2
			lofsa    sheriffConvinced
			push    
			pushSelf
			self     8
			jmp      code_0512
code_0506:
			dup     
			ldi      5
			eq?     
			bnt      code_0512
			pushi    #dispose
			pushi    0
			self     4
code_0512:
			toss    
			ret     
		)
	)
)

(instance gatherJewels of TScript
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_05c6
			pushi    #get
			pushi    1
			pushi    7
			lag      global0
			send     6
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
			pushi    #approachX
			pushi    0
			lal      local1
			sat      temp2
			send     4
			sat      temp3
			pushi    #approachY
			pushi    0
			lat      temp2
			send     4
			sat      temp4
			lst      temp0
			lat      temp3
			ne?     
			bt       code_059d
			lst      temp1
			lat      temp4
			ne?     
code_059d:
			bnt      code_05b4
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lst      temp3
			lst      temp4
			pushSelf
			lag      global0
			send     12
			jmp      code_0636
code_05b4:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0636
code_05c6:
			dup     
			ldi      1
			eq?     
			bnt      code_05ec
			pushi    #view
			pushi    1
			pushi    32
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_0636
code_05ec:
			dup     
			ldi      2
			eq?     
			bnt      code_0607
			pushi    #loop
			pushi    1
			pushi    1
			pushi    150
			pushi    2
			class    Beg
			push    
			pushSelf
			lofsa    jewelProp
			send     14
			jmp      code_0636
code_0607:
			dup     
			ldi      3
			eq?     
			bnt      code_0625
			pushi    #hide
			pushi    0
			lofsa    jewelProp
			send     4
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0636
code_0625:
			dup     
			ldi      4
			eq?     
			bnt      code_0636
			pushi    1
			pushi    0
			callb    proc0_2,  2
			pushi    #dispose
			pushi    0
			self     4
code_0636:
			toss    
			ret     
		)
	)
)

(instance spreadJewels of TScript
	(properties)
	
	(method (changeState newState &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06ea
			pushi    #put
			pushi    1
			pushi    7
			lag      global0
			send     6
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
			pushi    #approachX
			pushi    0
			lal      local1
			sat      temp2
			send     4
			sat      temp3
			pushi    #approachY
			pushi    0
			lat      temp2
			send     4
			sat      temp4
			lst      temp0
			lat      temp3
			ne?     
			bt       code_06c1
			lst      temp1
			lat      temp4
			ne?     
code_06c1:
			bnt      code_06d8
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			lst      temp3
			lst      temp4
			pushSelf
			lag      global0
			send     12
			jmp      code_0756
code_06d8:
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    #cue
			pushi    0
			self     4
			jmp      code_0756
code_06ea:
			dup     
			ldi      1
			eq?     
			bnt      code_0710
			pushi    #view
			pushi    1
			pushi    32
			pushi    6
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    4
			class    CT
			push    
			pushi    2
			pushi    1
			pushSelf
			lag      global0
			send     30
			jmp      code_0756
code_0710:
			dup     
			ldi      2
			eq?     
			bnt      code_072f
			pushi    #loop
			pushi    1
			pushi    1
			pushi    194
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lofsa    jewelProp
			send     18
			jmp      code_0756
code_072f:
			dup     
			ldi      3
			eq?     
			bnt      code_0745
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lag      global0
			send     8
			jmp      code_0756
code_0745:
			dup     
			ldi      4
			eq?     
			bnt      code_0756
			pushi    1
			pushi    0
			callb    proc0_2,  2
			pushi    #dispose
			pushi    0
			self     4
code_0756:
			toss    
			ret     
		)
	)
)

(instance leaveBeforeJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_07ba
			pushi    0
			callb    proc0_3,  0
			pushi    #setMotion
			pushi    1
			pushi    0
			lag      global0
			send     6
			pushi    2
			lea      @local45
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0830
code_07ba:
			dup     
			ldi      1
			eq?     
			bnt      code_07d4
			pushi    #loop
			pushi    1
			pushi    2
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lal      local0
			send     14
			jmp      code_0830
code_07d4:
			dup     
			ldi      2
			eq?     
			bnt      code_07e8
			pushi    2
			lea      @local50
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0830
code_07e8:
			dup     
			ldi      3
			eq?     
			bnt      code_0803
			pushi    #setMotion
			pushi    4
			class    Approach
			push    
			lsg      global0
			pushi    15
			pushSelf
			lal      local2
			send     12
			jmp      code_0830
code_0803:
			dup     
			ldi      4
			eq?     
			bnt      code_0830
			pushi    #setMotion
			pushi    3
			class    GuardFollow
			push    
			lsg      global0
			pushi    15
			lal      local2
			send     10
			pushi    #setMotion
			pushi    3
			class    MoveTo
			push    
			pushi    65531
			pushi    #y
			pushi    0
			lag      global0
			send     4
			push    
			lag      global0
			send     10
code_0830:
			toss    
			ret     
		)
	)
)

(instance sheriffConvinced of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0887
			pushi    2
			lea      @local38
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_08bd
code_0887:
			dup     
			ldi      1
			eq?     
			bnt      code_08ad
			pushi    1
			pushi    300
			calle    proc806_1,  2
			pushi    1
			pushi    181
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    240
			lag      global2
			send     6
			jmp      code_08bd
code_08ad:
			dup     
			ldi      2
			eq?     
			bnt      code_08bd
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_08bd:
			toss    
			ret     
		)
	)
)

(instance jewelerTalkToSheriffAfterJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0925
			ipToa    register
			pushi    2
			pTos     register
			ldi      1
			eq?     
			bnt      code_0919
			lea      @local78
			jmp      code_091c
code_0919:
			lea      @local83
code_091c:
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0931
code_0925:
			dup     
			ldi      1
			eq?     
			bnt      code_0931
			pushi    #dispose
			pushi    0
			self     4
code_0931:
			toss    
			ret     
		)
	)
)

(instance jewelerTalkToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0999
			ipToa    register
			pushi    2
			pTos     register
			ldi      1
			eq?     
			bnt      code_098d
			lea      @local69
			jmp      code_0990
code_098d:
			lea      @local74
code_0990:
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_09a5
code_0999:
			dup     
			ldi      1
			eq?     
			bnt      code_09a5
			pushi    #dispose
			pushi    0
			self     4
code_09a5:
			toss    
			ret     
		)
	)
)

(instance matilda of Prop
	(properties
		x 151
		y 131
		z 7
		lookStr 6306
		view 403
		loop 1
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_09fd
			pushi    2
			ldi      0
			lsli     local65
			ldi      1
			lsli     local65
			calle    proc13_4,  4
			jmp      code_0b01
code_09fd:
			dup     
			ldi      5
			eq?     
			bnt      code_0a11
			pushi    #setScript
			pushi    1
			lofsa    jewelerTalkToMatilda
			push    
			self     6
			jmp      code_0b01
code_0a11:
			dup     
			ldi      4
			eq?     
			bnt      code_0af4
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0a31
			pushi    2
			ldi      0
			lsli     local108
			ldi      1
			lsli     local108
			calle    proc13_4,  4
			jmp      code_0af0
code_0a31:
			dup     
			ldi      2
			eq?     
			bnt      code_0a50
			pushi    142
			pushi    1
			lal      local7
			bnt      code_0a47
			lofsa    EmToMatildaJewels
			jmp      code_0a4a
code_0a47:
			lofsa    EmToMatilda
code_0a4a:
			push    
			self     6
			jmp      code_0af0
code_0a50:
			dup     
			ldi      14
			eq?     
			bnt      code_0a6f
			pushi    142
			pushi    1
			lal      local7
			bnt      code_0a66
			lofsa    AmToMatildaJewels
			jmp      code_0a69
code_0a66:
			lofsa    AmToMatilda
code_0a69:
			push    
			self     6
			jmp      code_0af0
code_0a6f:
			dup     
			ldi      10
			eq?     
			bnt      code_0a8e
			pushi    142
			pushi    1
			lal      local7
			bnt      code_0a85
			lofsa    FireToMatildaJewels
			jmp      code_0a88
code_0a85:
			lofsa    FireToMatilda
code_0a88:
			push    
			self     6
			jmp      code_0af0
code_0a8e:
			dup     
			ldi      18
			eq?     
			bnt      code_0aad
			pushi    142
			pushi    1
			lal      local7
			bnt      code_0aa4
			lofsa    WaterToMatildaJewels
			jmp      code_0aa7
code_0aa4:
			lofsa    WaterToMatilda
code_0aa7:
			push    
			self     6
			jmp      code_0af0
code_0aad:
			dup     
			ldi      7
			eq?     
			bnt      code_0acf
			pushi    1
			lal      local7
			bnt      code_0ac2
			lea      @local279
			jmp      code_0ac7
code_0ac2:
			lea      @local275
code_0ac7:
			push    
			call     localproc_0012,  2
			jmp      code_0af0
code_0acf:
			dup     
			ldi      8
			eq?     
			bnt      code_0ae3
			pushi    #setScript
			pushi    1
			lofsa    RougeToMatilda
			push    
			self     6
			jmp      code_0af0
code_0ae3:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Prop,  8
code_0af0:
			toss    
			jmp      code_0b01
code_0af4:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			&rest    param3
			super    Prop,  8
code_0b01:
			toss    
			ret     
		)
	)
)

(instance EmToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0b8f
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lea      @local131
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0bb6
code_0b8f:
			dup     
			ldi      1
			eq?     
			bnt      code_0ba6
			pushi    3
			lsg      global0
			pushi    10
			pushSelf
			calle    proc400_1,  6
			jmp      code_0bb6
code_0ba6:
			dup     
			ldi      2
			eq?     
			bnt      code_0bb6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0bb6:
			toss    
			ret     
		)
	)
)

(instance EmToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c11
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lea      @local136
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0c64
code_0c11:
			dup     
			ldi      1
			eq?     
			bnt      code_0c28
			pushi    3
			lsg      global0
			pushi    10
			pushSelf
			calle    proc400_1,  6
			jmp      code_0c64
code_0c28:
			dup     
			ldi      2
			eq?     
			bnt      code_0c3c
			pushi    2
			lea      @local142
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0c64
code_0c3c:
			dup     
			ldi      3
			eq?     
			bnt      code_0c54
			pushi    #setScript
			pushi    3
			lofsa    sheriffConvinced
			push    
			pushSelf
			pTos     register
			self     10
			jmp      code_0c64
code_0c54:
			dup     
			ldi      4
			eq?     
			bnt      code_0c64
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0c64:
			toss    
			ret     
		)
	)
)

(instance AmToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0cc0
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_0ce4
code_0cc0:
			dup     
			ldi      1
			eq?     
			bnt      code_0cd4
			pushi    2
			lea      @local159
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0ce4
code_0cd4:
			dup     
			ldi      2
			eq?     
			bnt      code_0ce4
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0ce4:
			toss    
			ret     
		)
	)
)

(instance AmToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d3b
			pushi    2
			lea      @local164
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0d47
code_0d3b:
			dup     
			ldi      1
			eq?     
			bnt      code_0d47
			pushi    #dispose
			pushi    0
			self     4
code_0d47:
			toss    
			ret     
		)
	)
)

(instance FireToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0da4
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_0dc8
code_0da4:
			dup     
			ldi      1
			eq?     
			bnt      code_0db8
			pushi    2
			lea      @local182
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0dc8
code_0db8:
			dup     
			ldi      2
			eq?     
			bnt      code_0dc8
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0dc8:
			toss    
			ret     
		)
	)
)

(instance FireToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e1f
			pushi    2
			lea      @local187
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0e2b
code_0e1f:
			dup     
			ldi      1
			eq?     
			bnt      code_0e2b
			pushi    #dispose
			pushi    0
			self     4
code_0e2b:
			toss    
			ret     
		)
	)
)

(instance WaterToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0e88
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_0eac
code_0e88:
			dup     
			ldi      1
			eq?     
			bnt      code_0e9c
			pushi    2
			lea      @local205
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0eac
code_0e9c:
			dup     
			ldi      2
			eq?     
			bnt      code_0eac
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0eac:
			toss    
			ret     
		)
	)
)

(instance WaterToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f03
			pushi    2
			lea      @local210
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0f0f
code_0f03:
			dup     
			ldi      1
			eq?     
			bnt      code_0f0f
			pushi    #dispose
			pushi    0
			self     4
code_0f0f:
			toss    
			ret     
		)
	)
)

(instance RougeToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0f6d
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lea      @local290
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0fdf
code_0f6d:
			dup     
			ldi      1
			eq?     
			bnt      code_0f96
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    #approachX
			pushi    0
			lal      local1
			send     4
			push    
			pushi    #approachY
			pushi    0
			lal      local1
			send     4
			push    
			pushSelf
			lag      global0
			send     12
			jmp      code_0fdf
code_0f96:
			dup     
			ldi      2
			eq?     
			bnt      code_0fad
			pushi    3
			lsg      global0
			pushi    10
			pushSelf
			calle    proc400_1,  6
			jmp      code_0fdf
code_0fad:
			dup     
			ldi      3
			eq?     
			bnt      code_0fc3
			pushi    2
			lea      @local294
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_0fdf
code_0fc3:
			dup     
			ldi      4
			eq?     
			bnt      code_0fdf
			pushi    #put
			pushi    2
			pushi    8
			lsg      global11
			lag      global0
			send     8
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_0fdf:
			toss    
			ret     
		)
	)
)

(instance jewelerTalkToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1061
			ipToa    register
			pushi    2
			lal      local7
			not     
			bnt      code_1047
			pTos     register
			ldi      1
			eq?     
			bnt      code_1041
			lea      @local87
			jmp      code_1058
code_1041:
			lea      @local93
			jmp      code_1058
code_1047:
			pTos     register
			ldi      1
			eq?     
			bnt      code_1055
			lea      @local98
			jmp      code_1058
code_1055:
			lea      @local104
code_1058:
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_106d
code_1061:
			dup     
			ldi      1
			eq?     
			bnt      code_106d
			pushi    #dispose
			pushi    0
			self     4
code_106d:
			toss    
			ret     
		)
	)
)

(instance EmToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_10c9
			pushi    0
			callb    proc0_3,  0
			pushi    2
			lea      @local112
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_10d9
code_10c9:
			dup     
			ldi      1
			eq?     
			bnt      code_10d9
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_10d9:
			toss    
			ret     
		)
	)
)

(instance EmToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1139
			pushi    0
			callb    proc0_3,  0
			ldi      1
			aTop     notKilled
			pushi    2
			lea      @local118
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_1175
code_1139:
			dup     
			ldi      1
			eq?     
			bnt      code_114d
			pushi    2
			lea      @local124
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_1175
code_114d:
			dup     
			ldi      2
			eq?     
			bnt      code_1165
			pushi    #setScript
			pushi    3
			lofsa    sheriffConvinced
			push    
			pushSelf
			pTos     register
			self     10
			jmp      code_1175
code_1165:
			dup     
			ldi      3
			eq?     
			bnt      code_1175
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_1175:
			toss    
			ret     
		)
	)
)

(instance AmToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_11d2
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_120d
code_11d2:
			dup     
			ldi      1
			eq?     
			bnt      code_11e6
			pushi    2
			lea      @local149
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_120d
code_11e6:
			dup     
			ldi      2
			eq?     
			bnt      code_11fd
			pushi    3
			lsg      global0
			pushi    10
			pushSelf
			calle    proc400_1,  6
			jmp      code_120d
code_11fd:
			dup     
			ldi      3
			eq?     
			bnt      code_120d
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_120d:
			toss    
			ret     
		)
	)
)

(instance AmToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1265
			pushi    2
			lea      @local154
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_1271
code_1265:
			dup     
			ldi      1
			eq?     
			bnt      code_1271
			pushi    #dispose
			pushi    0
			self     4
code_1271:
			toss    
			ret     
		)
	)
)

(instance FireToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_12ce
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_12f2
code_12ce:
			dup     
			ldi      1
			eq?     
			bnt      code_12e2
			pushi    2
			lea      @local170
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_12f2
code_12e2:
			dup     
			ldi      2
			eq?     
			bnt      code_12f2
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_12f2:
			toss    
			ret     
		)
	)
)

(instance FireToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1349
			pushi    2
			lea      @local178
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_1355
code_1349:
			dup     
			ldi      1
			eq?     
			bnt      code_1355
			pushi    #dispose
			pushi    0
			self     4
code_1355:
			toss    
			ret     
		)
	)
)

(instance WaterToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_13b2
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_13d6
code_13b2:
			dup     
			ldi      1
			eq?     
			bnt      code_13c6
			pushi    2
			lea      @local191
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_13d6
code_13c6:
			dup     
			ldi      2
			eq?     
			bnt      code_13d6
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_13d6:
			toss    
			ret     
		)
	)
)

(instance WaterToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_142d
			pushi    2
			lea      @local201
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_1439
code_142d:
			dup     
			ldi      1
			eq?     
			bnt      code_1439
			pushi    #dispose
			pushi    0
			self     4
code_1439:
			toss    
			ret     
		)
	)
)

(instance JewelsToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_149c
			pushi    0
			callb    proc0_3,  0
			ldi      1
			aTop     notKilled
			sal      local7
			pushi    #setScript
			pushi    2
			lofsa    spreadJewels
			push    
			pushSelf
			self     8
			jmp      code_158d
code_149c:
			dup     
			ldi      1
			eq?     
			bnt      code_14b0
			pushi    2
			lea      @local214
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_158d
code_14b0:
			dup     
			ldi      2
			eq?     
			bnt      code_14ce
			pushi    #loop
			pushi    1
			pushi    1
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    2
			class    End
			push    
			pushSelf
			lal      local0
			send     20
			jmp      code_158d
code_14ce:
			dup     
			ldi      3
			eq?     
			bnt      code_14e2
			pushi    2
			lea      @local227
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_158d
code_14e2:
			dup     
			ldi      4
			eq?     
			bnt      code_14f8
			pushi    #setCycle
			pushi    2
			class    Beg
			push    
			pushSelf
			lal      local0
			send     8
			jmp      code_158d
code_14f8:
			dup     
			ldi      5
			eq?     
			bnt      code_151d
			pushi    #loop
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			pushi    0
			pushi    150
			pushi    1
			pushi    0
			lal      local0
			send     18
			pushi    2
			lea      @local232
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_158d
code_151d:
			dup     
			ldi      6
			eq?     
			bnt      code_153e
			pushi    #setMotion
			pushi    4
			class    MoveTo
			push    
			pushi    65501
			pushi    #y
			pushi    0
			lal      local2
			send     4
			push    
			pushSelf
			lal      local2
			send     12
			jmp      code_158d
code_153e:
			dup     
			ldi      7
			eq?     
			bnt      code_1552
			pushi    2
			lea      @local241
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_158d
code_1552:
			dup     
			ldi      8
			eq?     
			bnt      code_156d
			pushi    #setMotion
			pushi    4
			class    Approach
			push    
			lsg      global0
			pushi    30
			pushSelf
			lal      local2
			send     12
			jmp      code_158d
code_156d:
			dup     
			ldi      9
			eq?     
			bnt      code_158d
			pushi    #setMotion
			pushi    3
			class    GuardFollow
			push    
			lsg      global0
			pushi    30
			lal      local2
			send     10
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_158d:
			toss    
			ret     
		)
	)
)

(instance RougeToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_15ea
			pushi    0
			callb    proc0_3,  0
			pushi    #setScript
			pushi    2
			lofsa    showJewel
			push    
			pushSelf
			self     8
			jmp      code_161c
code_15ea:
			dup     
			ldi      1
			eq?     
			bnt      code_1600
			pushi    2
			lea      @local284
			push    
			pushSelf
			call     localproc_0012,  4
			jmp      code_161c
code_1600:
			dup     
			ldi      2
			eq?     
			bnt      code_161c
			pushi    #put
			pushi    2
			pushi    8
			lsg      global11
			lag      global0
			send     8
			pushi    0
			callb    proc0_4,  0
			pushi    #dispose
			pushi    0
			self     4
code_161c:
			toss    
			ret     
		)
	)
)

(instance TableActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(asm
			lal      local7
			bnt      code_166a
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    jewelProp
			send     4
code_166a:
			bt       code_1678
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    SheriffJewelerActions
			send     4
code_1678:
			ret     
		)
	)
)

(instance SheriffJewelerActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 &tmp temp0 temp1)
		(asm
			lal      local0
			sat      temp0
			ldi      1
			sat      temp1
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_16c7
			pushi    142
			pushi    1
			lal      local7
			bnt      code_16bc
			lofsa    jewelerTalkToSheriffAfterJewels
			jmp      code_16bf
code_16bc:
			lofsa    jewelerTalkToSheriff
code_16bf:
			push    
			lat      temp0
			send     6
			jmp      code_17c7
code_16c7:
			dup     
			ldi      4
			eq?     
			bnt      code_17c3
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_16e7
			pushi    2
			ldi      0
			lsli     local108
			ldi      1
			lsli     local108
			calle    proc13_4,  4
			jmp      code_17bf
code_16e7:
			dup     
			ldi      2
			eq?     
			bnt      code_172c
			lsl      local6
			ldi      0
			eq?     
			bnt      code_1709
			ldi      1
			sal      local6
			pushi    #setScript
			pushi    1
			lofsa    EmToSheriff
			push    
			lag      global0
			send     6
			jmp      code_17bf
code_1709:
			lal      local7
			bnt      code_171d
			pushi    #setScript
			pushi    1
			lofsa    EmToSheriffJewels
			push    
			lag      global0
			send     6
			jmp      code_17bf
code_171d:
			pushi    3
			pushi    1403
			pushi    49
			pushi    1
			calle    proc13_4,  6
			jmp      code_17bf
code_172c:
			dup     
			ldi      14
			eq?     
			bnt      code_174d
			pushi    142
			pushi    1
			lal      local7
			bnt      code_1742
			lofsa    AmToSheriffJewels
			jmp      code_1745
code_1742:
			lofsa    AmToSheriff
code_1745:
			push    
			lat      temp0
			send     6
			jmp      code_17bf
code_174d:
			dup     
			ldi      10
			eq?     
			bnt      code_176e
			pushi    142
			pushi    1
			lal      local7
			bnt      code_1763
			lofsa    FireToSheriffJewels
			jmp      code_1766
code_1763:
			lofsa    FireToSheriff
code_1766:
			push    
			lat      temp0
			send     6
			jmp      code_17bf
code_176e:
			dup     
			ldi      18
			eq?     
			bnt      code_178f
			pushi    142
			pushi    1
			lal      local7
			bnt      code_1784
			lofsa    WaterToSheriffJewels
			jmp      code_1787
code_1784:
			lofsa    WaterToSheriff
code_1787:
			push    
			lat      temp0
			send     6
			jmp      code_17bf
code_178f:
			dup     
			ldi      7
			eq?     
			bnt      code_17a5
			pushi    #setScript
			pushi    1
			lofsa    JewelsToSheriff
			push    
			lat      temp0
			send     6
			jmp      code_17bf
code_17a5:
			dup     
			ldi      8
			eq?     
			bnt      code_17bb
			pushi    #setScript
			pushi    1
			lofsa    RougeToSheriff
			push    
			lat      temp0
			send     6
			jmp      code_17bf
code_17bb:
			ldi      0
			sat      temp1
code_17bf:
			toss    
			jmp      code_17c7
code_17c3:
			ldi      0
			sat      temp1
code_17c7:
			toss    
			lat      temp1
			ret     
		)
	)
)
