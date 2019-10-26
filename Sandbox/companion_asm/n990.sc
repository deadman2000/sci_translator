;;; Sierra Script 1.0 - (do not remove this comment)
(script# 990)
(include sci.sh)
(use n000)
(use n255)
(use n932)
(use n940)
(use n993)

(public
	proc990_0 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	[local6 4] = [3002 3010 3019 3019]
	[local10 4] = [3027 3075 3116 3116]
)
(procedure (proc990_0 param1 &tmp temp0 [temp1 33] [temp34 100] temp134)
	(asm
code_088a:
		pushi    #parseLang
		pushi    0
		lag      global1
		send     4
		sat      temp134
		pushi    #parseLang
		pushi    1
		pushi    1
		lag      global1
		send     6
		pushi    13
		pushi    990
		pushi    1
		pushi    33
		pushi    0
		pushi    41
		pushi    2
		lea      @temp1
		push    
		lsp      param1
		callk    StrCpy,  4
		push    
		pushi    29
		pushi    81
		lofsa    {OK}
		push    
		pushi    1
		pushi    81
		lofsa    {Cancel}
		push    
		pushi    0
		calle    proc255_0,  26
		sat      temp0
		pushi    #parseLang
		pushi    1
		lst      temp134
		lag      global1
		send     6
		lat      temp0
		not     
		bnt      code_08d9
		ldi      0
		ret     
code_08d9:
		pushi    1
		lea      @temp1
		push    
		callk    StrLen,  2
		not     
		bnt      code_08ed
		pushi    1
		lea      @temp1
		push    
		callk    GetCWD,  2
code_08ed:
		pushi    1
		lea      @temp1
		push    
		callk    ValidPath,  2
		bnt      code_0908
		pushi    2
		lsp      param1
		lea      @temp1
		push    
		callk    StrCpy,  4
		ldi      1
		ret     
		jmp      code_088a
code_0908:
		pushi    3
		pushi    4
		lea      @temp34
		push    
		pushi    990
		pushi    2
		lea      @temp1
		push    
		callk    Format,  8
		push    
		pushi    33
		pushi    0
		calle    proc255_0,  6
		jmp      code_088a
		ret     
	)
)

(procedure (localproc_05b3)
	(asm
		pushSelf
		lofsa    Restore
		eq?     
		bnt      code_05c0
		ldi      0
		jmp      code_05d9
code_05c0:
		pushi    0
		call     localproc_0927,  0
		bnt      code_05cd
		ldi      1
		jmp      code_05d9
code_05cd:
		lal      local3
		bnt      code_05d7
		ldi      2
		jmp      code_05d9
code_05d7:
		ldi      3
code_05d9:
		ret     
	)
)

(procedure (localproc_0927)
	(asm
		lsl      local3
		ldi      20
		lt?     
		bnt      code_0935
		pushi    1
		lsg      global29
		callk    CheckFreeSpace,  2
code_0935:
		ret     
	)
)

(procedure (localproc_0936)
	(asm
		pushi    4
		pushi    990
		pushi    3
		pushi    33
		pushi    0
		calle    proc255_0,  8
		ret     
	)
)

(class SRDialog of Dialog
	(properties
		elements 0
		size 0
		text 0
		window 0
		theItem 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		time 0
		busy 0
		caller 0
		seconds 0
		lastSeconds 0
	)
	
	(method (init param1 param2 param3)
		(asm
			pushi    0
			calle    proc932_3,  0
			pushi    #parseLang
			pushi    0
			lag      global1
			send     4
			sal      local0
			pushi    #parseLang
			pushi    1
			pushi    1
			lag      global1
			send     6
			lag      global38
			aTop     window
			ldi      0
			aTop     nsBottom
			pushi    3
			pushi    #name
			pushi    0
			lag      global1
			send     4
			push    
			lsp      param2
			lsp      param3
			callk    GetSaveFiles,  6
			sal      local3
			push    
			ldi      65535
			eq?     
			bnt      code_0064
			ldi      0
			ret     
code_0064:
			pushi    0
			call     localproc_05b3,  0
			sal      local5
			push    
			ldi      1
			eq?     
			bnt      code_00a0
			pushi    #text
			pushi    1
			pushi    2
			lsp      param1
			lsp      param2
			callk    StrCpy,  4
			push    
			pushi    33
			pushi    1
			lsg      global23
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pushi    4
			dup     
			lofsa    editI
			send     24
			pushi    #add
			pushi    1
			lofsa    editI
			push    
			pushi    170
			pushi    0
			self     10
code_00a0:
			pushi    26
			pushi    #superClass
			lsp      param2
			pushi    33
			pushi    1
			lsg      global23
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pushi    4
			pTos     nsBottom
			ldi      4
			add     
			push    
			pushi    32
			pushi    1
			pushi    2
			lofsa    selectorI
			send     30
			pushi    #nsRight
			pushi    0
			lofsa    selectorI
			send     4
			push    
			ldi      4
			add     
			sal      local2
			pushi    26
			pushi    1
			lal      local5
			lsli     local6
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			lsl      local2
			pushi    #nsTop
			pushi    0
			lofsa    selectorI
			send     4
			push    
			pushi    32
			pushi    1
			lsl      local5
			ldi      0
			eq?     
			bnt      code_00f9
			lal      local3
			not     
code_00f9:
			bt       code_0101
			lsl      local5
			ldi      3
			eq?     
code_0101:
			bnt      code_0109
			ldi      0
			jmp      code_010b
code_0109:
			ldi      3
code_010b:
			push    
			lofsa    okI
			send     24
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			lsl      local2
			pushi    #nsBottom
			pushi    0
			lofsa    okI
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    32
			pushi    1
			lal      local3
			not     
			bnt      code_0136
			ldi      0
			jmp      code_0138
code_0136:
			ldi      3
code_0138:
			push    
			lofsa    deleteI
			send     18
			pushi    170
			pushi    0
			pushi    #moveTo
			pushi    2
			lsl      local2
			pushi    #nsBottom
			pushi    0
			lofsa    deleteI
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    32
			pushi    1
			pushi    #state
			pushi    0
			lofsa    changeDirI
			send     4
			push    
			ldi      65527
			and     
			push    
			lofsa    changeDirI
			send     18
			pushi    170
			pushi    0
			pushi    #moveTo
			pushi    2
			lsl      local2
			pushi    #nsBottom
			pushi    0
			lofsa    changeDirI
			send     4
			push    
			ldi      4
			add     
			push    
			pushi    32
			pushi    1
			pushi    #state
			pushi    0
			lofsa    cancelI
			send     4
			push    
			ldi      65527
			and     
			push    
			lofsa    cancelI
			send     18
			pushi    #add
			pushi    5
			lofsa    selectorI
			push    
			lofsa    okI
			push    
			lofsa    deleteI
			push    
			lofsa    changeDirI
			push    
			lofsa    cancelI
			push    
			pushi    170
			pushi    0
			self     18
			pushi    26
			pushi    1
			lal      local5
			lsli     local10
			pushi    170
			pushi    1
			pTos     nsRight
			pToa     nsLeft
			sub     
			push    
			ldi      8
			sub     
			push    
			pushi    172
			pushi    2
			pushi    4
			dup     
			lofsa    textI
			send     20
			pushi    #nsBottom
			pushi    0
			lofsa    textI
			send     4
			push    
			ldi      4
			add     
			sal      local2
			pushi    #eachElementDo
			pushi    3
			pushi    171
			pushi    0
			push    
			self     10
			pushi    #add
			pushi    1
			lofsa    textI
			push    
			pushi    170
			pushi    0
			pushi    182
			pushi    0
			pushi    181
			pushi    2
			pushi    4
			pushi    65535
			self     22
			ldi      1
			ret     
		)
	)
	
	(method (doit param1 &tmp temp0 temp1 temp2 [temp3 361] [temp364 21] [temp385 140])
		(asm
			pushSelf
			lofsa    Restore
			eq?     
			bnt      code_024d
			lap      argc
			bnt      code_024d
			lap      param1
			bnt      code_024d
			pushi    2
			pushi    0
			pushi    4
			lea      @temp385
			push    
			pushi    990
			pushi    0
			pushi    #name
			pushi    0
			lag      global1
			send     4
			push    
			callk    Format,  8
			push    
			callk    FileIO,  4
			sat      temp0
			push    
			ldi      65535
			eq?     
			bnt      code_0246
			ret     
code_0246:
			pushi    2
			pushi    1
			lst      temp0
			callk    FileIO,  4
code_024d:
			pushi    #init
			pushi    3
			lsp      param1
			lea      @temp3
			push    
			lea      @temp364
			push    
			self     10
			not     
			bnt      code_0266
			ldi      65535
			ret     
code_0266:
			lsl      local5
			dup     
			ldi      0
			eq?     
			bnt      code_0280
			lal      local3
			bnt      code_029d
			lofsa    okI
			jmp      code_029d
			lofsa    changeDirI
			jmp      code_029d
code_0280:
			dup     
			ldi      1
			eq?     
			bnt      code_028d
			lofsa    editI
			jmp      code_029d
code_028d:
			dup     
			ldi      2
			eq?     
			bnt      code_029a
			lofsa    okI
			jmp      code_029d
code_029a:
			lofsa    changeDirI
code_029d:
			toss    
			sal      local1
			pushi    #doit
			pushi    1
			push    
			super    Dialog,  6
			sal      local2
			pushi    #indexOf
			pushi    1
			pushi    #cursor
			pushi    0
			lofsa    selectorI
			send     4
			push    
			lofsa    selectorI
			send     6
			sal      local4
			push    
			ldi      18
			mul     
			sat      temp2
			lsl      local2
			lofsa    changeDirI
			eq?     
			bnt      code_0317
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			lsg      global29
			call     localproc_0888,  2
			bnt      code_0302
			pushi    3
			pushi    #name
			pushi    0
			lag      global1
			send     4
			push    
			lea      @temp3
			push    
			lea      @temp364
			push    
			callk    GetSaveFiles,  6
			sal      local3
			push    
			ldi      65535
			eq?     
			bnt      code_0302
			ldi      65535
			sat      temp1
			jmp      code_0596
code_0302:
			pushi    #init
			pushi    3
			lsp      param1
			lea      @temp3
			push    
			lea      @temp364
			push    
			self     10
			jmp      code_0266
code_0317:
			lsl      local5
			ldi      2
			eq?     
			bnt      code_0364
			lsl      local2
			lofsa    okI
			eq?     
			bnt      code_0364
			pushi    #dispose
			pushi    0
			self     4
			pushi    #doit
			pushi    1
			pushi    2
			lsp      param1
			lat      temp2
			leai     @temp3
			push    
			callk    StrCpy,  4
			push    
			lofsa    GetReplaceName
			send     6
			bnt      code_034f
			lal      local4
			lati     temp364
			sat      temp1
			jmp      code_0596
code_034f:
			pushi    #init
			pushi    3
			lsp      param1
			lea      @temp3
			push    
			lea      @temp364
			push    
			self     10
			jmp      code_0266
code_0364:
			lsl      local5
			ldi      1
			eq?     
			bnt      code_0431
			lsl      local2
			lofsa    okI
			eq?     
			bt       code_037b
			lsl      local2
			lofsa    editI
			eq?     
code_037b:
			bnt      code_0431
			pushi    1
			lsp      param1
			callk    StrLen,  2
			push    
			ldi      0
			eq?     
			bnt      code_03aa
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			call     localproc_0936,  0
			pushi    #init
			pushi    3
			lsp      param1
			lea      @temp3
			push    
			lea      @temp364
			push    
			self     10
			jmp      code_0266
code_03aa:
			ldi      65535
			sat      temp1
			ldi      0
			sal      local2
code_03b2:
			lsl      local2
			lal      local3
			lt?     
			bnt      code_03d4
			pushi    2
			lsp      param1
			lsl      local2
			ldi      18
			mul     
			leai     @temp3
			push    
			callk    StrCmp,  4
			sat      temp1
			not     
			bt       code_03d4
			+al      local2
			jmp      code_03b2
code_03d4:
			lat      temp1
			not     
			bnt      code_03e4
			lal      local2
			lati     temp364
			sat      temp1
			jmp      code_0596
code_03e4:
			lsl      local3
			ldi      20
			eq?     
			bnt      code_03f6
			lal      local4
			lati     temp364
			sat      temp1
			jmp      code_0596
code_03f6:
			ldi      0
			sat      temp1
code_03fa:
			ldi      1
			bnt      code_0596
			ldi      0
			sal      local2
code_0403:
			lsl      local2
			lal      local3
			lt?     
			bnt      code_041b
			lst      temp1
			lal      local2
			lati     temp364
			eq?     
			bt       code_041b
			+al      local2
			jmp      code_0403
code_041b:
			lsl      local2
			lal      local3
			eq?     
			bnt      code_0426
			jmp      code_0596
code_0426:
			+at      temp1
			jmp      code_03fa
			jmp      code_0596
			jmp      code_0266
code_0431:
			lsl      local2
			lofsa    deleteI
			eq?     
			bnt      code_053d
			pushi    #dispose
			pushi    0
			self     4
			pushi    8
			lofsa    {Are you sure you want to\ndelete this saved game?}
			push    
			pushi    106
			pushi    81
			lofsa    { No_}
			push    
			pushi    0
			pushi    81
			lofsa    {Yes}
			push    
			pushi    1
			calle    proc940_0,  16
			not     
			bnt      code_0474
			pushi    #init
			pushi    3
			lsp      param1
			lea      @temp3
			push    
			lea      @temp364
			push    
			self     10
			jmp      code_0266
code_0474:
			pushi    #name
			pushi    1
			pushi    3
			pushi    7
			lea      @temp385
			push    
			pushi    #name
			pushi    0
			lag      global1
			send     4
			push    
			callk    DeviceInfo,  6
			push    
			pushi    181
			pushi    1
			pushi    2
			pushi    #new
			pushi    0
			class    Class_993_0
			send     4
			sat      temp0
			send     12
			ldi      2570
			sat      temp1
			ldi      0
			sal      local2
code_04a6:
			lsl      local2
			lal      local3
			lt?     
			bnt      code_04ea
			lsl      local2
			lal      local4
			ne?     
			bnt      code_04e5
			pushi    #write
			pushi    2
			lal      local2
			leai     @temp364
			push    
			pushi    2
			lat      temp0
			send     8
			pushi    332
			pushi    #superClass
			lsl      local2
			ldi      18
			mul     
			leai     @temp3
			push    
			lat      temp0
			send     6
			pushi    #write
			pushi    2
			lea      @temp1
			push    
			pushi    1
			lat      temp0
			send     8
code_04e5:
			+al      local2
			jmp      code_04a6
code_04ea:
			ldi      65535
			sat      temp1
			pushi    #write
			pushi    2
			lea      @temp1
			push    
			pushi    2
			pushi    336
			pushi    0
			pushi    108
			pushi    0
			lat      temp0
			send     16
			pushi    4
			pushi    8
			lea      @temp385
			push    
			pushi    #name
			pushi    0
			lag      global1
			send     4
			push    
			lal      local4
			lsti     temp364
			callk    DeviceInfo,  8
			pushi    2
			pushi    4
			lea      @temp385
			push    
			callk    FileIO,  4
			pushi    #init
			pushi    3
			lsp      param1
			lea      @temp3
			push    
			lea      @temp364
			push    
			self     10
			jmp      code_0266
code_053d:
			lsl      local2
			lofsa    okI
			eq?     
			bnt      code_0553
			lal      local4
			lati     temp364
			sat      temp1
			jmp      code_0596
			jmp      code_0266
code_0553:
			lsl      local2
			ldi      0
			eq?     
			bt       code_0561
			lsl      local2
			lofsa    cancelI
			eq?     
code_0561:
			bnt      code_056e
			ldi      65535
			sat      temp1
			jmp      code_0596
			jmp      code_0266
code_056e:
			lsl      local5
			ldi      1
			eq?     
			bnt      code_0266
			pushi    #cursor
			pushi    1
			pushi    1
			pushi    2
			lsp      param1
			lat      temp2
			leai     @temp3
			push    
			callk    StrCpy,  4
			push    
			callk    StrLen,  2
			push    
			pushi    83
			pushi    0
			lofsa    editI
			send     10
			jmp      code_0266
code_0596:
			pushi    1
			pushi    993
			callk    DisposeScript,  2
			pushi    1
			pushi    940
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			pushi    990
			callk    DisposeScript,  2
			lat      temp1
			ret     
		)
	)
	
	(method (dispose param1)
		(asm
			pushi    0
			calle    proc932_4,  0
			pushi    #parseLang
			pushi    1
			lsl      local0
			lag      global1
			send     6
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Dialog,  4
			ret     
		)
	)
)

(class Restore of SRDialog
	(properties
		elements 0
		size 0
		text 3338
		window 0
		theItem 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		time 0
		busy 0
		caller 0
		seconds 0
		lastSeconds 0
	)
)

(class Save of SRDialog
	(properties
		elements 0
		size 0
		text 3353
		window 0
		theItem 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		time 0
		busy 0
		caller 0
		seconds 0
		lastSeconds 0
	)
)

(instance GetReplaceName of Dialog
	(properties)
	
	(method (doit param1 &tmp temp0 temp1)
		(asm
			pushi    #parseLang
			pushi    0
			lag      global1
			send     4
			sat      temp1
			pushi    #parseLang
			pushi    1
			pushi    1
			lag      global1
			send     6
			lag      global38
			aTop     window
			pushi    #setSize
			pushi    0
			pushi    172
			pushi    2
			pushi    4
			dup     
			lofsa    text1
			send     12
			pushi    #add
			pushi    1
			lofsa    text1
			push    
			pushi    170
			pushi    0
			self     10
			pushi    #text
			pushi    1
			lsp      param1
			pushi    33
			pushi    1
			lsg      global23
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pushi    4
			pTos     nsBottom
			lofsa    oldName
			send     24
			pushi    #add
			pushi    1
			lofsa    oldName
			push    
			pushi    170
			pushi    0
			self     10
			pushi    #setSize
			pushi    0
			pushi    172
			pushi    2
			pushi    4
			pTos     nsBottom
			lofsa    text2
			send     12
			pushi    #add
			pushi    1
			lofsa    text2
			push    
			pushi    170
			pushi    0
			self     10
			pushi    #text
			pushi    1
			lsp      param1
			pushi    33
			pushi    1
			lsg      global23
			pushi    170
			pushi    0
			pushi    172
			pushi    2
			pushi    4
			pTos     nsBottom
			lofsa    newName
			send     24
			pushi    #add
			pushi    1
			lofsa    newName
			push    
			pushi    170
			pushi    0
			self     10
			pushi    #nsLeft
			pushi    1
			pushi    0
			pushi    9
			pushi    1
			pushi    0
			pushi    170
			pushi    0
			lofsa    button1
			send     16
			pushi    #nsLeft
			pushi    1
			pushi    0
			pushi    9
			pushi    1
			pushi    0
			pushi    170
			pushi    0
			lofsa    button2
			send     16
			pushi    172
			pushi    2
			pTos     nsRight
			pushi    #nsRight
			pushi    0
			lofsa    button2
			send     4
			push    
			ldi      4
			add     
			sub     
			push    
			pTos     nsBottom
			lofsa    button2
			send     8
			pushi    172
			pushi    2
			pushi    #nsLeft
			pushi    0
			lofsa    button2
			send     4
			push    
			pushi    #nsRight
			pushi    0
			lofsa    button1
			send     4
			push    
			ldi      4
			add     
			sub     
			push    
			pTos     nsBottom
			lofsa    button1
			send     8
			pushi    #add
			pushi    2
			lofsa    button1
			push    
			lofsa    button2
			push    
			pushi    170
			pushi    0
			pushi    182
			pushi    0
			pushi    181
			pushi    2
			pushi    0
			pushi    65535
			self     24
			pushi    #doit
			pushi    1
			lofsa    newName
			push    
			super    Dialog,  6
			sat      temp0
			pushi    #dispose
			pushi    0
			self     4
			pushi    1
			lsp      param1
			callk    StrLen,  2
			not     
			bnt      code_0833
			pushi    0
			call     localproc_0936,  0
			ldi      0
			sat      temp0
code_0833:
			pushi    #parseLang
			pushi    1
			lst      temp1
			lag      global1
			send     6
			lst      temp0
			lofsa    newName
			eq?     
			bt       code_084b
			lst      temp0
			lofsa    button1
			eq?     
code_084b:
			ret     
		)
	)
)

(instance selectorI of DSelector
	(properties
		x 36
		y 8
	)
)

(instance editI of DEdit
	(properties
		max 35
	)
)

(instance okI of DButton
	(properties)
)

(instance cancelI of DButton
	(properties
		text 3415
	)
)

(instance changeDirI of DButton
	(properties
		text 3432
	)
)

(instance deleteI of DButton
	(properties
		text 3461
	)
)

(instance textI of DText
	(properties
		font 0
	)
)

(instance text1 of DText
	(properties
		text 3019
		font 0
	)
)

(instance text2 of DText
	(properties
		text 3490
		font 0
	)
)

(instance oldName of DText
	(properties)
)

(instance newName of DEdit
	(properties
		max 35
	)
)

(instance button1 of DButton
	(properties
		text 3019
	)
)

(instance button2 of DButton
	(properties
		text 3388
	)
)
