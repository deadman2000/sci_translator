;;; Sierra Script 1.0 - (do not remove this comment)
(script# 943)
(include sci.sh)
(use n000)
(use n255)
(use n940)
(use n946)
(use n981)
(use n993)
(use n999)


(local
	local0
	local1
	[local2 40]
	local42
	local43
	local44
	local45
	[local46 25] = [6468 0 0 6476 0 0 6482 0 0 6486 0 0 6493 0 0 6498 0 0 6503 0 0 6508 120]
	[local71 22] = [6513 0 0 6476 0 0 6482 0 0 6522 0 0 6498 0 0 6503 0 0 6508 120]
)
(procedure (localproc_17cc param1 &tmp temp0 temp1 temp2)
	(asm
		ldi      0
		sal      local44
		sal      local45
		ldi      32767
		sal      local42
		sal      local43
		ldi      0
		sat      temp0
code_17df:
		lst      temp0
		lap      argc
		lt?     
		bnt      code_182f
		lat      temp0
		lapi     param1
		sat      temp1
		lst      temp0
		ldi      1
		add     
		lapi     param1
		sat      temp2
		push    
		lal      local42
		lt?     
		bnt      code_1801
		lat      temp2
		sal      local42
code_1801:
		lst      temp2
		lal      local44
		gt?     
		bnt      code_180d
		lat      temp2
		sal      local44
code_180d:
		lst      temp1
		lal      local43
		lt?     
		bnt      code_1819
		lat      temp1
		sal      local43
code_1819:
		lst      temp1
		lal      local45
		gt?     
		bnt      code_1825
		lat      temp1
		sal      local45
code_1825:
		lst      temp0
		ldi      2
		add     
		sat      temp0
		jmp      code_17df
code_182f:
		lsl      local43
		ldi      2
		sub     
		sal      local43
		lsl      local42
		ldi      2
		sub     
		sal      local42
		lsl      local45
		ldi      2
		add     
		sal      local45
		lsl      local44
		ldi      2
		add     
		sal      local44
		ret     
	)
)

(procedure (localproc_184c param1 param2 param3 param4)
	(asm
		lsp      param1
		ldi      2
		div     
		push    
		ldi      1
		add     
		push    
		lsp      param3
		ldi      2
		div     
		push    
		ldi      1
		add     
		mul     
		push    
		lsp      param2
		ldi      2
		div     
		push    
		ldi      1
		add     
		push    
		lsp      param4
		ldi      2
		div     
		push    
		ldi      1
		add     
		mul     
		add     
		ret     
	)
)

(procedure (localproc_1877 param1 param2 param3 param4 param5 param6 &tmp temp0)
	(asm
		pushi    0
		pushi    4
		lsp      param3
		lap      param1
		sub     
		push    
		lsp      param4
		lap      param2
		sub     
		push    
		lsp      param5
		lap      param1
		sub     
		push    
		lsp      param6
		lap      param2
		sub     
		push    
		call     localproc_184c,  8
		le?     
		bnt      code_1901
		pushi    0
		pushi    4
		lsp      param1
		lap      param3
		sub     
		push    
		lsp      param2
		lap      param4
		sub     
		push    
		lsp      param5
		lap      param3
		sub     
		push    
		lsp      param6
		lap      param4
		sub     
		push    
		call     localproc_184c,  8
		le?     
		bnt      code_1901
		pushi    4
		lsp      param1
		lsp      param2
		lsp      param3
		lsp      param4
		callk    GetDistance,  8
		sat      temp0
		bnt      code_18fb
		pushi    1
		pushi    4
		lsp      param4
		lap      param2
		sub     
		push    
		lsp      param1
		lap      param3
		sub     
		push    
		lsp      param5
		lap      param1
		sub     
		push    
		lsp      param6
		lap      param2
		sub     
		push    
		call     localproc_184c,  8
		push    
		callk    Abs,  2
		push    
		lat      temp0
		div     
		jmp      code_18fd
code_18fb:
		ldi      0
code_18fd:
		ret     
		jmp      code_1925
code_1901:
		pushi    2
		pushi    4
		lsp      param5
		lsp      param6
		lsp      param1
		lsp      param2
		callk    GetDistance,  8
		push    
		pushi    4
		lsp      param5
		lsp      param6
		lsp      param3
		lsp      param4
		callk    GetDistance,  8
		push    
		calle    proc999_2,  4
		ret     
code_1925:
		ret     
	)
)

(procedure (localproc_1926 param1)
	(asm
		pushi    6
		&rest    param1
		pushi    80
		lofsa    {Polygon Editor 1.11}
		push    
		pushi    33
		pushi    999
		pushi    70
		pushi    240
		calle    proc255_0,  12
		ret     
	)
)

(class ClickMenu of Obj
	(properties
		text 0
		array 0
	)
	
	(method (init param1 &tmp temp0 temp1 temp2 temp3 [temp4 4] [temp8 40] temp48 temp49)
		(asm
			pushi    2
			pushi    2
			pushi    81
			callk    Memory,  4
			aTop     text
			pushi    3
			pushi    6
			pTos     text
			pushi    0
			callk    Memory,  6
			lap      param1
			aTop     array
			sat      temp1
			ldi      0
			sat      temp48
			ldi      0
			sat      temp0
code_0027:
			pushi    2
			pushi    5
			lst      temp1
			callk    Memory,  4
			sat      temp2
			bnt      code_00d5
			pushi    2
			lea      @temp8
			push    
			lst      temp2
			callk    StrCpy,  4
			lat      temp0
			not     
			bnt      code_0050
			pushi    2
			lea      @temp8
			push    
			lofsa    {:_}
			push    
			callk    StrCat,  4
code_0050:
			pushi    2
			lea      @temp8
			push    
			lofsa    {_}
			push    
			callk    StrCat,  4
			pushi    2
			pTos     text
			lea      @temp8
			push    
			callk    StrCat,  4
			pushi    4
			lea      @temp4
			push    
			lea      @temp8
			push    
			pushi    0
			pushi    0
			callk    TextSize,  8
			lst      temp48
			ldi      3
			lati     temp4
			add     
			sat      temp48
			pushi    3
			pushi    6
			lst      temp1
			ldi      4
			add     
			push    
			lst      temp48
			callk    Memory,  6
			pushi    2
			pushi    5
			lst      temp1
			ldi      2
			add     
			push    
			callk    Memory,  4
			not     
			bnt      code_00c9
			pushi    2
			lst      temp2
			pushi    0
			callk    StrAt,  4
			sat      temp49
			pushi    65
			le?     
			bnt      code_00ba
			pprev   
			ldi      90
			le?     
			bnt      code_00ba
			lst      temp49
			ldi      32
			add     
			sat      temp49
code_00ba:
			pushi    3
			pushi    6
			lst      temp1
			ldi      2
			add     
			push    
			lst      temp49
			callk    Memory,  6
code_00c9:
			+at      temp0
			lst      temp1
			ldi      6
			add     
			sat      temp1
			jmp      code_0027
code_00d5:
			pushi    1
			pTos     text
			callk    DrawStatus,  2
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    2
			pushi    3
			pTos     text
			callk    Memory,  4
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1)
		(asm
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      1
			ne?     
			bnt      code_00ef
			ldi      0
			ret     
code_00ef:
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			ldi      10
			ge?     
			bnt      code_0100
			ldi      0
			ret     
code_0100:
			pToa     array
			sat      temp0
			ldi      0
			sat      temp1
code_0108:
			pushi    2
			pushi    5
			lst      temp0
			callk    Memory,  4
			bnt      code_0158
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    2
			pushi    5
			lst      temp0
			ldi      4
			add     
			push    
			callk    Memory,  4
			lt?     
			bnt      code_014c
			lat      temp1
			bnt      code_014c
			pushi    34
			pushi    #superClass
			pushi    4
			pushi    40
			pushi    1
			pushi    2
			pushi    5
			lst      temp0
			ldi      2
			add     
			push    
			callk    Memory,  4
			push    
			lap      pEvent
			send     12
			ldi      0
			ret     
code_014c:
			+at      temp1
			lst      temp0
			ldi      6
			add     
			sat      temp0
			jmp      code_0108
code_0158:
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ret     
		)
	)
)

(instance editMenu of ClickMenu
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    1
			lea      @local46
			push    
			super    ClickMenu,  6
			ret     
		)
	)
)

(instance addMenu of ClickMenu
	(properties)
	
	(method (init)
		(asm
			pushi    #init
			pushi    1
			lea      @local71
			push    
			super    ClickMenu,  6
			ret     
		)
	)
)

(class Class_943_3
	(properties
		y 0
		underBits 0
	)
	
	(method (new)
		(asm
			pushi    1
			pushSelf
			callk    Clone,  2
			ret     
		)
	)
	
	(method (yourself)
		(asm
			selfID  
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pToa     underBits
			bnt      code_02ac
			pushi    2
			pushi    133
			push    
			callk    UnLoad,  4
			ldi      0
			aTop     underBits
code_02ac:
			pushi    1
			pushSelf
			callk    DisposeClone,  2
			ret     
		)
	)
	
	(method (draw param1 &tmp temp0 temp1)
		(asm
			lsl      local0
			ldi      4
			eq?     
			bnt      code_0225
			ldi      65535
			sat      temp0
			ldi      4
			sat      temp1
			jmp      code_022d
code_0225:
			ldi      0
			sat      temp0
			ldi      65535
			sat      temp1
code_022d:
			pushi    8
			pushi    4
			pTos     y
			pTos     x
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			lst      temp0
			pushi    65535
			lst      temp1
			callk    Graph,  16
			ret     
		)
	)
	
	(method (save param1)
		(asm
			pushi    4
			pTos     x
			pTos     y
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			call     localproc_17cc,  8
			pToa     underBits
			bnt      code_0276
			pushi    2
			pushi    133
			push    
			callk    UnLoad,  4
code_0276:
			pushi    6
			pushi    7
			lsl      local42
			lsl      local43
			lsl      local44
			lsl      local45
			lsl      local0
			callk    Graph,  12
			aTop     underBits
			ret     
		)
	)
	
	(method (restore)
		(asm
			pToa     underBits
			bnt      code_029a
			pushi    2
			pushi    8
			push    
			callk    Graph,  4
			ldi      0
			aTop     underBits
code_029a:
			ret     
		)
	)
)

(class _EditablePolygon of List
	(properties
		elements 0
		size 0
		curNode 0
		curPt 0
		closed 0
		type $0002
		closestPt 0
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
	)
	
	(method (add param1 param2 param3)
		(asm
			pushi    #add
			pushi    1
			pushi    #x
			pushi    1
			lsp      param1
			pushi    3
			pushi    1
			lsp      param2
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Class_943_3
			send     4
			send     16
			aTop     curPt
			push    
			super    List,  6
			pushi    #setCur
			pushi    2
			pushi    2
			pTos     elements
			pTos     curPt
			callk    FindKey,  4
			push    
			lsp      param3
			self     8
			ret     
		)
	)
	
	(method (next param1 &tmp temp0)
		(asm
			pushi    #next
			pushi    1
			lsp      param1
			super    List,  6
			sat      temp0
			pToa     closed
			bnt      code_09dc
			lat      temp0
			not     
			bnt      code_09dc
			pushi    #first
			pushi    0
			super    List,  4
			ret     
code_09dc:
			lat      temp0
			ret     
		)
	)
	
	(method (prev param1 &tmp temp0)
		(asm
			pushi    #prev
			pushi    1
			lsp      param1
			super    List,  6
			sat      temp0
			pToa     closed
			bnt      code_09fd
			lat      temp0
			not     
			bnt      code_09fd
			pushi    #last
			pushi    0
			super    List,  4
			ret     
code_09fd:
			lat      temp0
			ret     
		)
	)
	
	(method (draw)
		(asm
			pushi    #eachLineDo
			pushi    1
			pushi    83
			self     6
			ret     
		)
	)
	
	(method (advance &tmp temp0)
		(asm
			pushi    #setCur
			pushi    1
			pushi    #next
			pushi    1
			pTos     curNode
			self     6
			push    
			self     6
			ret     
		)
	)
	
	(method (retreat &tmp temp0)
		(asm
			pushi    #setCur
			pushi    1
			pushi    #prev
			pushi    1
			pTos     curNode
			self     6
			push    
			self     6
			ret     
		)
	)
	
	(method (setCur param1 param2)
		(asm
			lap      param1
			aTop     curNode
			bnt      code_075b
			pushi    1
			push    
			callk    NodeValue,  2
			aTop     curPt
			lsp      argc
			ldi      2
			lt?     
			bt       code_0740
			lap      param2
code_0740:
			bnt      code_075b
			pushi    4
			lsg      global20
			pushi    1
			pushi    #x
			pushi    0
			pToa     curPt
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     curPt
			send     4
			push    
			callk    SetCursor,  8
code_075b:
			ret     
		)
	)
	
	(method (setCurClosest param1)
		(asm
			pushi    #setCur
			pushi    2
			pushi    2
			pTos     elements
			pTos     closestPt
			callk    FindKey,  4
			push    
			lsp      param1
			self     8
			ret     
		)
	)
	
	(method (insertPt param1 param2 &tmp temp0)
		(asm
			pushi    #x
			pushi    1
			lsp      param1
			pushi    3
			pushi    1
			lsp      param2
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Class_943_3
			send     4
			send     16
			sat      temp0
			pushi    #addAfter
			pushi    2
			pTos     closestPt
			push    
			self     8
			pushi    #setCur
			pushi    1
			pushi    2
			pTos     elements
			lst      temp0
			callk    FindKey,  4
			push    
			self     6
			ret     
		)
	)
	
	(method (deletePt &tmp temp0)
		(asm
			pTos     curNode
			pushi    #prev
			pushi    1
			pTos     curNode
			self     6
			sat      temp0
			eq?     
			bnt      code_09a7
			ldi      0
			sat      temp0
code_09a7:
			pushi    #delete
			pushi    1
			pTos     curPt
			self     6
			pushi    #dispose
			pushi    0
			pToa     curPt
			send     4
			pushi    #setCur
			pushi    1
			lst      temp0
			self     6
			ret     
		)
	)
	
	(method (movePt param1 param2)
		(asm
			pushi    #x
			pushi    1
			lsp      param1
			pushi    3
			pushi    1
			lsp      param2
			pToa     curPt
			send     12
			ret     
		)
	)
	
	(method (undo param1 &tmp temp0 temp1 temp2 temp3)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			self     10
			pushi    2
			pushi    5
			lsp      param1
			callk    Memory,  4
			aTop     closed
			lsp      param1
			ldi      2
			add     
			sap      param1
			pushi    2
			pushi    5
			push    
			callk    Memory,  4
			sat      temp1
			lsp      param1
			ldi      2
			add     
			sap      param1
			pushi    2
			pushi    5
			push    
			callk    Memory,  4
			sat      temp3
			lsp      param1
			ldi      2
			add     
			sap      param1
			ldi      0
			sat      temp2
code_0adf:
			lst      temp2
			lat      temp1
			lt?     
			bnt      code_0b12
			pushi    115
			pushi    #y
			pushi    2
			pushi    5
			lsp      param1
			callk    Memory,  4
			push    
			pushi    2
			pushi    5
			lsp      param1
			ldi      2
			add     
			sap      param1
			push    
			callk    Memory,  4
			push    
			pushi    0
			self     10
			+at      temp2
			lsp      param1
			ldi      2
			add     
			sap      param1
			jmp      code_0adf
code_0b12:
			pushi    #setCur
			pushi    2
			pushi    2
			pTos     elements
			pushi    #at
			pushi    1
			lst      temp3
			self     6
			push    
			callk    FindKey,  4
			push    
			pushi    0
			self     8
			ret     
		)
	)
	
	(method (saveForUndo &tmp temp0 temp1 temp2 temp3)
		(asm
			pushi    2
			pushi    2
			pushi    2
			pushi    2
			pToa     size
			mul     
			push    
			ldi      3
			add     
			mul     
			push    
			callk    Memory,  4
			sat      temp0
			sat      temp1
			pushi    3
			pushi    6
			push    
			pTos     closed
			callk    Memory,  6
			lst      temp1
			ldi      2
			add     
			sat      temp1
			pushi    3
			pushi    6
			push    
			pTos     size
			callk    Memory,  6
			lst      temp1
			ldi      2
			add     
			sat      temp1
			pushi    3
			pushi    6
			push    
			pushi    #indexOf
			pushi    1
			pTos     curPt
			self     6
			push    
			callk    Memory,  6
			lst      temp1
			ldi      2
			add     
			sat      temp1
			pushi    #first
			pushi    0
			self     4
			sat      temp2
code_0a57:
			lat      temp2
			bnt      code_0a9b
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp3
			pushi    3
			pushi    6
			lst      temp1
			pushi    #x
			pushi    0
			send     4
			push    
			callk    Memory,  6
			pushi    3
			pushi    6
			lst      temp1
			ldi      2
			add     
			sat      temp1
			push    
			pushi    #y
			pushi    0
			lat      temp3
			send     4
			push    
			callk    Memory,  6
			pushi    1
			lst      temp2
			callk    NextNode,  2
			sat      temp2
			lst      temp1
			ldi      2
			add     
			sat      temp1
			jmp      code_0a57
code_0a9b:
			lat      temp0
			ret     
		)
	)
	
	(method (getDistToLine param1 param2 param3 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
		(asm
			pTos     size
			ldi      2
			lt?     
			bnt      code_0893
			pushi    #getDistToPt
			pushi    2
			lsp      param1
			lsp      param2
			&rest    param3
			self     8
			ret     
code_0893:
			ldi      32767
			sat      temp4
			pushi    #first
			pushi    0
			self     4
			sat      temp1
			pushi    #last
			pushi    0
			self     4
			sat      temp0
code_08a6:
			ldi      1
			bnt      code_090d
			pushi    1
			lst      temp1
			callk    NodeValue,  2
			sat      temp2
			pushi    #next
			pushi    1
			lst      temp1
			self     6
			sat      temp6
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp5
			pushi    6
			pushi    #x
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #x
			pushi    0
			lat      temp5
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp5
			send     4
			push    
			lsp      param1
			lsp      param2
			call     localproc_1877,  12
			sat      temp3
			push    
			lat      temp4
			lt?     
			bnt      code_08fe
			lat      temp3
			sat      temp4
			lat      temp2
			aTop     closestPt
code_08fe:
			lst      temp1
			lat      temp0
			eq?     
			bt       code_090d
			lat      temp6
			sat      temp1
			jmp      code_08a6
code_090d:
			lat      temp4
			ret     
		)
	)
	
	(method (getDistToPt param1 param2 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			ldi      32767
			sat      temp4
			pushi    #first
			pushi    0
			self     4
			sat      temp1
			pushi    #last
			pushi    0
			self     4
			sat      temp0
code_0830:
			ldi      1
			bnt      code_0879
			pushi    1
			lst      temp1
			callk    NodeValue,  2
			sat      temp2
			pushi    4
			lsp      param1
			lsp      param2
			pushi    #x
			pushi    0
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			callk    GetDistance,  8
			sat      temp3
			push    
			lat      temp4
			lt?     
			bnt      code_0865
			lat      temp3
			sat      temp4
			lat      temp2
			aTop     closestPt
code_0865:
			lst      temp1
			lat      temp0
			eq?     
			bt       code_0879
			pushi    #next
			pushi    1
			lst      temp1
			self     6
			sat      temp1
			jmp      code_0830
code_0879:
			lat      temp4
			ret     
		)
	)
	
	(method (startRedraw &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pushi    #next
			pushi    1
			pTos     curNode
			self     6
			sat      temp0
			bnt      code_0786
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp3
			jmp      code_078a
code_0786:
			pToa     curPt
			sat      temp3
code_078a:
			pushi    #prev
			pushi    1
			pTos     curNode
			self     6
			sat      temp1
			bnt      code_07a0
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp4
			jmp      code_07a4
code_07a0:
			pToa     curPt
			sat      temp4
code_07a4:
			pushi    6
			pushi    #x
			pushi    0
			lat      temp4
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp4
			send     4
			push    
			pushi    #x
			pushi    0
			pToa     curPt
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     curPt
			send     4
			push    
			pushi    #x
			pushi    0
			lat      temp3
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp3
			send     4
			push    
			call     localproc_17cc,  12
			lal      local42
			aTop     lsTop
			lal      local43
			aTop     lsLeft
			lal      local44
			aTop     lsBottom
			lal      local45
			aTop     lsRight
			ret     
		)
	)
	
	(method (endRedraw)
		(asm
			pushi    6
			pushi    #x
			pushi    0
			pToa     curPt
			send     4
			push    
			pushi    #y
			pushi    0
			pToa     curPt
			send     4
			push    
			pTos     lsLeft
			pTos     lsTop
			pTos     lsRight
			pTos     lsBottom
			call     localproc_17cc,  12
			pushi    6
			pushi    12
			lsl      local42
			lsl      local43
			lsl      local44
			lsl      local45
			lsl      local0
			callk    Graph,  12
			ret     
		)
	)
	
	(method (restore)
		(asm
			pushi    #eachLineDo
			pushi    1
			pushi    79
			self     6
			ret     
		)
	)
	
	(method (save)
		(asm
			pushi    #eachLineDo
			pushi    1
			pushi    78
			self     6
			ret     
		)
	)
	
	(method (eachLineDo param1 param2 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pushi    #first
			pushi    0
			self     4
			sat      temp0
			pushi    #last
			pushi    0
			self     4
			sat      temp4
code_0952:
			lst      temp0
			lat      temp4
			ne?     
			bt       code_095c
			pToa     closed
code_095c:
			bnt      code_0991
			pushi    #next
			pushi    1
			lst      temp0
			self     6
			sat      temp1
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			pushi    1
			lst      temp1
			callk    NodeValue,  2
			sat      temp3
			lsp      param1
			pushi    1
			push    
			&rest    param2
			lat      temp2
			send     6
			lst      temp0
			lat      temp4
			eq?     
			bt       code_0991
			lat      temp1
			sat      temp0
			jmp      code_0952
code_0991:
			ret     
		)
	)
	
	(method (writeObstacle &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pushi    2
			pushi    2
			pTos     size
			ldi      4
			mul     
			push    
			callk    Memory,  4
			sat      temp1
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp2
			lat      temp1
			sat      temp0
code_063f:
			lat      temp2
			bnt      code_0681
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp3
			pushi    3
			pushi    6
			lst      temp0
			pushi    #x
			pushi    0
			send     4
			push    
			callk    Memory,  6
			pushi    3
			pushi    6
			lst      temp0
			ldi      2
			add     
			push    
			pushi    #y
			pushi    0
			lat      temp3
			send     4
			push    
			callk    Memory,  6
			pushi    1
			lst      temp2
			callk    NextNode,  2
			sat      temp2
			lst      temp0
			ldi      4
			add     
			sat      temp0
			jmp      code_063f
code_0681:
			pushi    #addObstacle
			pushi    1
			pushi    #type
			pushi    1
			pTos     type
			pushi    90
			pushi    1
			lst      temp1
			pushi    89
			pushi    1
			pTos     size
			pushi    231
			pushi    1
			pushi    1
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     28
			push    
			lag      global2
			send     6
			ret     
		)
	)
	
	(method (writeFile param1 &tmp temp0 temp1 temp2 temp3 [temp4 10] temp14)
		(asm
			pushi    332
			pushi    4
			lofsa    {\t\t\t((Polygon new:)\n}
			push    
			lofsa    {\t\t\t\ttype:_}
			push    
			pTos     type
			dup     
			ldi      0
			eq?     
			bnt      code_0352
			lofsa    {PTotalAccess}
			jmp      code_0376
code_0352:
			dup     
			ldi      1
			eq?     
			bnt      code_035f
			lofsa    {PNearestAccess}
			jmp      code_0376
code_035f:
			dup     
			ldi      2
			eq?     
			bnt      code_036c
			lofsa    {PBarredAccess}
			jmp      code_0376
code_036c:
			dup     
			ldi      3
			eq?     
			bnt      code_0376
			lofsa    {PContainedAccess}
code_0376:
			toss    
			push    
			lofsa    {,\n}
			push    
			lap      param1
			send     12
			pushi    #writeString
			pushi    1
			lofsa    {\t\t\t\tinit:\t}
			push    
			lap      param1
			send     6
			ldi      1
			sat      temp14
			ldi      17
			sat      temp0
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp3
code_039c:
			lat      temp3
			bnt      code_0423
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp2
			pushi    5
			lea      @temp4
			push    
			pushi    943
			pushi    0
			pushi    #x
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			callk    Format,  10
			lst      temp0
			pushi    1
			lea      @temp4
			push    
			callk    StrLen,  2
			push    
			ldi      1
			add     
			sat      temp1
			add     
			sat      temp0
			push    
			ldi      80
			ge?     
			bnt      code_03f6
			pushi    #writeString
			pushi    1
			lofsa    {\n\t\t\t\t\t\t}
			push    
			lap      param1
			send     6
			ldi      1
			sat      temp14
			pushi    17
			lat      temp1
			add     
			sat      temp0
code_03f6:
			lat      temp14
			not     
			bnt      code_0408
			pushi    #writeString
			pushi    1
			lofsa    {_}
			push    
			lap      param1
			send     6
code_0408:
			pushi    #writeString
			pushi    1
			lea      @temp4
			push    
			lap      param1
			send     6
			ldi      0
			sat      temp14
			pushi    1
			lst      temp3
			callk    NextNode,  2
			sat      temp3
			jmp      code_039c
code_0423:
			pushi    #writeString
			pushi    1
			lofsa    {,\n}
			push    
			lap      param1
			send     6
			pushi    #writeString
			pushi    2
			lofsa    {\t\t\t\tyourself\n}
			push    
			lofsa    {\t\t\t)\n}
			push    
			lap      param1
			send     8
			ret     
		)
	)
	
	(method (getAccessType &tmp temp0)
		(asm
			pushi    16
			pushi    80
			lofsa    {Polygon access type}
			push    
			pushi    81
			lofsa    {Total}
			push    
			pushi    1
			pushi    81
			lofsa    { Near_}
			push    
			pushi    2
			pushi    81
			lofsa    { Barred_}
			push    
			pushi    3
			pushi    81
			lofsa    { Container_}
			push    
			pushi    4
			pushi    121
			pTos     type
			calle    proc940_0,  32
			sat      temp0
			bnt      code_0333
			push    
			ldi      1
			sub     
			aTop     type
code_0333:
			ret     
		)
	)
	
	(method (check &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10 temp11 temp12 temp13 temp14 temp15 temp16)
		(asm
			pushi    #first
			pushi    0
			self     4
			sat      temp0
code_0449:
			lat      temp0
			bnt      code_04bb
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp2
			pushi    1
			lst      temp0
			callk    NextNode,  2
			sat      temp15
code_045d:
			lat      temp15
			bnt      code_04b0
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp16
			pushi    #x
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #x
			pushi    0
			lat      temp16
			send     4
			eq?     
			bnt      code_04a5
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp16
			send     4
			eq?     
			bnt      code_04a5
			pushi    1
			lst      temp15
			callk    PrevNode,  2
			sat      temp15
			pushi    #delete
			pushi    1
			lst      temp16
			self     6
			pushi    #dispose
			pushi    0
			lat      temp16
			send     4
code_04a5:
			pushi    1
			lst      temp15
			callk    NextNode,  2
			sat      temp15
			jmp      code_045d
code_04b0:
			pushi    1
			lst      temp0
			callk    NextNode,  2
			sat      temp0
			jmp      code_0449
code_04bb:
			ldi      0
			sat      temp4
			ldi      0
			sat      temp9
			ldi      0
			sat      temp7
			ldi      1
			sat      temp8
			pushi    #first
			pushi    0
			self     4
			sat      temp6
			sat      temp0
code_04d4:
			ldi      1
			bnt      code_056c
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			pushi    #next
			pushi    1
			lst      temp0
			self     6
			sat      temp1
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp3
			pushi    4
			dup     
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    #x
			pushi    0
			lat      temp3
			send     4
			push    
			pushi    #y
			pushi    0
			lat      temp3
			send     4
			push    
			callk    ATan,  8
			sat      temp4
			lat      temp8
			not     
			bnt      code_054f
			lst      temp4
			lat      temp9
			sub     
			sat      temp5
			push    
			ldi      180
			gt?     
			bnt      code_0537
			lst      temp5
			ldi      360
			sub     
			sat      temp5
			jmp      code_0548
code_0537:
			lst      temp5
			ldi      65356
			lt?     
			bnt      code_0548
			lst      temp5
			ldi      360
			add     
			sat      temp5
code_0548:
			lst      temp7
			lat      temp5
			add     
			sat      temp7
code_054f:
			lat      temp4
			sat      temp9
			lst      temp0
			lat      temp6
			eq?     
			bnt      code_055e
			lat      temp8
			not     
code_055e:
			bt       code_056c
			ldi      0
			sat      temp8
			lat      temp1
			sat      temp0
			jmp      code_04d4
code_056c:
			pTos     type
			ldi      3
			eq?     
			bnt      code_0579
			lat      temp7
			neg     
			sat      temp7
code_0579:
			lst      temp7
			ldi      65176
			eq?     
			bnt      code_060c
			pushi    #first
			pushi    0
			self     4
			sat      temp0
			pushi    #last
			pushi    0
			self     4
			sat      temp10
code_0590:
			lst      temp0
			lat      temp10
			ne?     
			bnt      code_0623
			lst      temp0
			pushi    1
			lst      temp10
			callk    NextNode,  2
			ne?     
			bnt      code_0623
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			sat      temp2
			pushi    1
			lst      temp10
			callk    NodeValue,  2
			sat      temp11
			pushi    #x
			pushi    0
			lat      temp2
			send     4
			sat      temp12
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			sat      temp13
			pushi    #x
			pushi    1
			pushi    #x
			pushi    0
			lat      temp11
			send     4
			push    
			lat      temp2
			send     6
			pushi    #y
			pushi    1
			pushi    #y
			pushi    0
			lat      temp11
			send     4
			push    
			lat      temp2
			send     6
			pushi    #x
			pushi    1
			lst      temp12
			lat      temp11
			send     6
			pushi    #y
			pushi    1
			lst      temp13
			lat      temp11
			send     6
			pushi    1
			lst      temp0
			callk    NextNode,  2
			sat      temp0
			pushi    1
			lst      temp10
			callk    PrevNode,  2
			sat      temp10
			jmp      code_0590
			jmp      code_0623
code_060c:
			lst      temp7
			ldi      360
			ne?     
			bnt      code_0623
			pushi    4
			pushi    943
			pushi    1
			pTos     name
			lst      temp7
			calle    proc255_4,  8
code_0623:
			ret     
		)
	)
)

(instance readObstacle of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2)
		(asm
			pushi    #add
			pushi    0
			lofsa    PolyEdit
			send     4
			sat      temp2
			ldi      0
			sat      temp0
			pushi    #points
			pushi    0
			lap      param1
			send     4
			sat      temp1
code_0bf3:
			lst      temp0
			pushi    #size
			pushi    0
			lap      param1
			send     4
			lt?     
			bnt      code_0c36
			pushi    115
			pushi    #y
			pushi    2
			pushi    5
			lst      temp1
			callk    Memory,  4
			push    
			pushi    2
			pushi    5
			lst      temp1
			ldi      2
			add     
			push    
			callk    Memory,  4
			push    
			pushi    0
			pushi    34
			pushi    1
			pushi    #type
			pushi    0
			lap      param1
			send     4
			push    
			lat      temp2
			send     16
			+at      temp0
			lst      temp1
			ldi      4
			add     
			sat      temp1
			jmp      code_0bf3
code_0c36:
			pushi    #closed
			pushi    1
			pushi    1
			lat      temp2
			send     6
			ret     
		)
	)
)

(class PolyEdit of List
	(properties
		elements 0
		size 0
		curPolygon 0
		x 0
		y 0
		state $0000
		isMouseDown 0
		curMenu 0
		undoPrvPoly 0
		undoPoly 0
		undoPolyBuf 0
		undoX 0
		undoY 0
		undoState 0
	)
	
	(method (init)
		(asm
			pushi    4
			pushi    #curPic
			pushi    0
			lag      global2
			send     4
			push    
			pushi    100
			pushi    1
			lsg      global40
			callk    DrawPic,  8
			lsg      global36
			ldi      65535
			ne?     
			bnt      code_1481
			pushi    4
			lsg      global36
			pushi    100
			pushi    0
			lsg      global40
			callk    DrawPic,  8
code_1481:
			pushi    #doit
			pushi    0
			lag      global10
			send     4
			pushi    #eachElementDo
			pushi    1
			pushi    285
			lag      global5
			send     6
			pushi    2
			pushi    #elements
			pushi    0
			lag      global5
			send     4
			push    
			pushi    0
			callk    Animate,  4
			lag      global38
			sal      local1
			class    SysWindow
			sag      global38
			ldi      1
			sal      local0
			pushi    #readObstacles
			pushi    0
			self     4
			pushi    140
			pushi    1
			pToa     size
			bnt      code_14bf
			ldi      1
			jmp      code_14c1
code_14bf:
			ldi      0
code_14c1:
			push    
			self     6
			pushi    #draw
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (doit &tmp temp0 [temp1 100])
		(asm
			pushi    #init
			pushi    0
			self     4
code_14d1:
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			pToa     curMenu
			bnt      code_14e7
			pushi    #handleEvent
			pushi    1
			lst      temp0
			send     6
code_14e7:
			not     
			bnt      code_14fc
			pushi    1
			lst      temp0
			callk    GlobalToLocal,  2
			pushi    #handleEvent
			pushi    1
			lst      temp0
			self     6
			bt       code_1506
code_14fc:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			jmp      code_14d1
code_1506:
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			pushi    #dispose
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #writeObstacles
			pushi    0
			self     4
			pToa     curMenu
			bnt      code_16b9
			pushi    #dispose
			pushi    0
			send     4
			ldi      0
			aTop     curMenu
code_16b9:
			pToa     undoPolyBuf
			bnt      code_16c9
			pushi    2
			pushi    3
			push    
			callk    Memory,  4
			ldi      0
			aTop     undoPolyBuf
code_16c9:
			pushi    3
			lofsa    {_}
			push    
			pushi    0
			pushi    0
			callk    DrawStatus,  6
			pushi    1
			pushi    0
			callk    DrawStatus,  2
			pushi    #eachElementDo
			pushi    1
			pushi    287
			lag      global5
			send     6
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
			pushi    83
			self     6
			lal      local1
			sag      global38
			pushi    1
			pushi    940
			callk    DisposeScript,  2
			pushi    1
			pushi    993
			callk    DisposeScript,  2
			pushi    #dispose
			pushi    0
			super    List,  4
			pushi    1
			pushi    943
			callk    DisposeScript,  2
			ret     
		)
	)
	
	(method (add)
		(asm
			pushi    115
			pushi    1
			pushi    #new
			pushi    0
			class    _EditablePolygon
			send     4
			send     0
			aTop     curPolygon
			push    
			super    List,  6
			pToa     curPolygon
			ret     
		)
	)
	
	(method (delete param1 &tmp temp0)
		(asm
			pToa     curPolygon
			sat      temp0
			pushi    #advanceRetreat
			pushi    2
			pushi    124
			pushi    68
			self     8
			pTos     curPolygon
			lat      temp0
			eq?     
			bnt      code_1207
			ldi      0
			aTop     curPolygon
code_1207:
			pushi    #delete
			pushi    1
			lst      temp0
			&rest    param1
			super    List,  6
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 temp2 [temp3 20])
		(asm
			pToa     x
			sat      temp1
			pToa     y
			sat      temp2
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			aTop     x
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			aTop     y
			pushi    #type
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0d21
			pToa     curPolygon
			bnt      code_0fda
			pToa     isMouseDown
			bnt      code_0cd7
			pushi    3
			pTos     state
			pushi    0
			pushi    2
			calle    proc999_5,  6
			not     
			bnt      code_0cd7
			pushi    1
			lst      temp1
			pToa     x
			sub     
			push    
			callk    Abs,  2
			push    
			pushi    1
			lst      temp2
			pToa     y
			sub     
			push    
			callk    Abs,  2
			add     
			push    
			ldi      1
			gt?     
			bnt      code_0cd7
			pTos     state
			ldi      3
			ne?     
			bnt      code_0cd0
			pushi    #saveForUndo
			pushi    0
			self     4
code_0cd0:
			pushi    #changeState
			pushi    1
			pushi    2
			self     6
code_0cd7:
			pushi    3
			pTos     state
			pushi    2
			pushi    0
			calle    proc999_5,  6
			bnt      code_0d00
			lst      temp1
			pToa     x
			ne?     
			bt       code_0cf3
			lst      temp2
			pToa     y
			ne?     
code_0cf3:
			bnt      code_0d00
			pushi    #movePt
			pushi    2
			pTos     x
			pTos     y
			self     8
code_0d00:
			pTos     state
			ldi      2
			eq?     
			bnt      code_0fda
			pushi    1
			pushi    5
			lea      @temp3
			push    
			pushi    943
			pushi    2
			pTos     x
			pTos     y
			callk    Format,  10
			push    
			callk    DrawStatus,  2
			jmp      code_0fda
code_0d21:
			dup     
			ldi      1
			eq?     
			bnt      code_0d92
			pushi    #modifiers
			pushi    0
			lap      pEvent
			send     4
			sat      temp0
			ldi      1
			aTop     isMouseDown
			lst      temp0
			ldi      4
			and     
			bnt      code_0d5b
			pTos     state
			ldi      0
			eq?     
			bnt      code_0d52
			pushi    #finishAdding
			pushi    0
			self     4
			ldi      0
			aTop     isMouseDown
			jmp      code_0fda
code_0d52:
			pushi    #insertPt
			pushi    0
			self     4
			jmp      code_0fda
code_0d5b:
			lst      temp0
			ldi      3
			and     
			bnt      code_0d78
			pTos     state
			ldi      0
			ne?     
			bnt      code_0d71
			pushi    #deletePt
			pushi    0
			self     4
code_0d71:
			ldi      0
			aTop     isMouseDown
			jmp      code_0fda
code_0d78:
			pTos     state
			ldi      0
			eq?     
			bnt      code_0d89
			pushi    #addPt
			pushi    0
			self     4
			jmp      code_0fda
code_0d89:
			pushi    #selectPt
			pushi    0
			self     4
			jmp      code_0fda
code_0d92:
			dup     
			ldi      2
			eq?     
			bnt      code_0db7
			ldi      0
			aTop     isMouseDown
			pushi    3
			pTos     state
			pushi    2
			pushi    3
			calle    proc999_5,  6
			bnt      code_0fda
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
			jmp      code_0fda
code_0db7:
			dup     
			ldi      4
			eq?     
			bnt      code_0fda
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      63
			eq?     
			bnt      code_0dd9
			pushi    #message
			pushi    1
			pushi    104
			lap      pEvent
			send     6
			jmp      code_0e13
code_0dd9:
			dup     
			ldi      19
			eq?     
			bnt      code_0dec
			pushi    #message
			pushi    1
			pushi    120
			lap      pEvent
			send     6
			jmp      code_0e13
code_0dec:
			dup     
			ldi      15360
			eq?     
			bnt      code_0e01
			pushi    #message
			pushi    1
			pushi    12032
			lap      pEvent
			send     6
			jmp      code_0e13
code_0e01:
			dup     
			ldi      15872
			eq?     
			bnt      code_0e13
			pushi    #message
			pushi    1
			pushi    11776
			lap      pEvent
			send     6
code_0e13:
			toss    
			pushi    #message
			pushi    0
			lap      pEvent
			send     4
			push    
			dup     
			ldi      9
			eq?     
			bnt      code_0e3d
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pToa     curPolygon
			bnt      code_0fd9
			pushi    #advanceRetreat
			pushi    2
			pushi    68
			pushi    121
			self     8
			jmp      code_0fd9
code_0e3d:
			dup     
			ldi      3840
			eq?     
			bnt      code_0e5f
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pToa     curPolygon
			bnt      code_0fd9
			pushi    #advanceRetreat
			pushi    2
			pushi    124
			pushi    123
			self     8
			jmp      code_0fd9
code_0e5f:
			dup     
			ldi      32
			eq?     
			bnt      code_0e7e
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pToa     curPolygon
			bnt      code_0fd9
			pushi    #advance
			pushi    0
			pToa     curPolygon
			send     4
			jmp      code_0fd9
code_0e7e:
			dup     
			ldi      8
			eq?     
			bnt      code_0e9d
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pToa     curPolygon
			bnt      code_0fd9
			pushi    #retreat
			pushi    0
			pToa     curPolygon
			send     4
			jmp      code_0fd9
code_0e9d:
			dup     
			ldi      99
			eq?     
			bnt      code_0eba
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pushi    #changeState
			pushi    1
			pushi    0
			self     6
			ldi      0
			aTop     curPolygon
			jmp      code_0fd9
code_0eba:
			dup     
			ldi      116
			eq?     
			bnt      code_0ed9
			pToa     curPolygon
			bnt      code_0fd9
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pushi    #getAccessType
			pushi    0
			pToa     curPolygon
			send     4
			jmp      code_0fd9
code_0ed9:
			dup     
			ldi      100
			eq?     
			bnt      code_0f07
			pTos     state
			ldi      1
			eq?     
			bnt      code_0ef6
			pToa     curPolygon
			bnt      code_0fd9
			pushi    #deletePt
			pushi    0
			self     4
			jmp      code_0fd9
code_0ef6:
			pTos     state
			ldi      0
			eq?     
			bnt      code_0fd9
			pushi    #finishAdding
			pushi    0
			self     4
			jmp      code_0fd9
code_0f07:
			dup     
			ldi      104
			eq?     
			bnt      code_0f3d
			pTos     state
			dup     
			ldi      0
			eq?     
			bnt      code_0f28
			pushi    4
			pushi    943
			pushi    3
			pushi    30
			pushi    1
			call     localproc_1926,  8
			jmp      code_0f39
code_0f28:
			dup     
			ldi      1
			eq?     
			bnt      code_0f39
			pushi    2
			pushi    943
			pushi    4
			call     localproc_1926,  4
code_0f39:
			toss    
			jmp      code_0fd9
code_0f3d:
			dup     
			ldi      117
			eq?     
			bnt      code_0f4d
			pushi    #undo
			pushi    0
			self     4
			jmp      code_0fd9
code_0f4d:
			dup     
			ldi      109
			eq?     
			bnt      code_0f5f
			pushi    #showMap
			pushi    1
			pushi    65535
			self     6
			jmp      code_0fd9
code_0f5f:
			dup     
			ldi      12032
			eq?     
			bnt      code_0f71
			pushi    #showMap
			pushi    1
			pushi    1
			self     6
			jmp      code_0fd9
code_0f71:
			dup     
			ldi      11776
			eq?     
			bnt      code_0f84
			pushi    #showMap
			pushi    1
			pushi    4
			self     6
			jmp      code_0fd9
code_0f84:
			dup     
			ldi      97
			eq?     
			bnt      code_0f9c
			pushi    4
			pushi    943
			pushi    5
			pushi    30
			pushi    1
			call     localproc_1926,  8
			jmp      code_0fd9
code_0f9c:
			dup     
			ldi      114
			eq?     
			bnt      code_0fb3
			pTos     state
			ldi      1
			eq?     
			bnt      code_0fd9
			pushi    #draw
			pushi    0
			self     4
			jmp      code_0fd9
code_0fb3:
			dup     
			ldi      120
			eq?     
			bnt      code_0fc4
			pushi    #exit
			pushi    0
			self     4
			ret     
			jmp      code_0fd9
code_0fc4:
			dup     
			ldi      27
			eq?     
			bnt      code_0fd9
			pTos     state
			ldi      0
			eq?     
			bnt      code_0fd9
			pushi    #finishAdding
			pushi    0
			self     4
code_0fd9:
			toss    
code_0fda:
			toss    
			ldi      0
			ret     
		)
	)
	
	(method (changeState newState)
		(asm
			pToa     curMenu
			bnt      code_0fe8
			pushi    #dispose
			pushi    0
			send     4
code_0fe8:
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ffa
			lofsa    addMenu
			jmp      code_1015
code_0ffa:
			dup     
			ldi      1
			eq?     
			bnt      code_1007
			lofsa    editMenu
			jmp      code_1015
code_1007:
			dup     
			ldi      2
			eq?     
			bnt      code_1013
			ldi      0
			jmp      code_1015
code_1013:
			ldi      0
code_1015:
			toss    
			aTop     curMenu
			pToa     curMenu
			bnt      code_1022
			pushi    #init
			pushi    0
			send     4
code_1022:
			ret     
		)
	)
	
	(method (draw)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    79
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    78
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    190
			pushi    320
			lsl      local0
			callk    Graph,  12
			ret     
		)
	)
	
	(method (select param1 param2 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			ldi      32767
			sat      temp0
			ldi      0
			sat      temp1
			pushi    1
			pTos     elements
			callk    FirstNode,  2
			sat      temp4
code_128c:
			lat      temp4
			bnt      code_12bd
			pushi    1
			push    
			callk    NodeValue,  2
			sat      temp3
			lsp      param1
			pushi    2
			pTos     x
			pTos     y
			send     8
			sat      temp2
			push    
			lat      temp0
			lt?     
			bnt      code_12b2
			lat      temp2
			sat      temp0
			lat      temp3
			sat      temp1
code_12b2:
			pushi    1
			lst      temp4
			callk    NextNode,  2
			sat      temp4
			jmp      code_128c
code_12bd:
			pushi    #setCurClosest
			pushi    1
			lsp      param2
			lat      temp1
			aTop     curPolygon
			send     6
			ret     
		)
	)
	
	(method (selectPt &tmp temp0)
		(asm
			pushi    #select
			pushi    2
			pushi    463
			pushi    1
			self     8
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp0
			pushi    1
			push    
			callk    GlobalToLocal,  2
			pushi    #x
			pushi    0
			lat      temp0
			send     4
			aTop     x
			pushi    #y
			pushi    0
			lat      temp0
			send     4
			aTop     y
			pushi    #dispose
			pushi    0
			lat      temp0
			send     4
			ret     
		)
	)
	
	(method (addPt)
		(asm
			pushi    #saveForUndo
			pushi    0
			self     4
			pToa     curPolygon
			not     
			bnt      code_10f6
			pushi    #add
			pushi    0
			self     4
			pushi    #add
			pushi    3
			pTos     x
			pTos     y
			pushi    0
			pToa     curPolygon
			send     10
code_10f6:
			pushi    #add
			pushi    2
			pTos     x
			pTos     y
			pToa     curPolygon
			send     8
			ret     
		)
	)
	
	(method (finishAdding &tmp temp0)
		(asm
			pToa     curPolygon
			bnt      code_1142
			pushi    #closed
			pushi    1
			pushi    1
			send     6
			pushi    #size
			pushi    0
			pToa     curPolygon
			send     4
			push    
			ldi      1
			gt?     
			bnt      code_1132
			pushi    #deletePt
			pushi    1
			pushi    #last
			pushi    0
			pToa     curPolygon
			send     4
			push    
			pushi    177
			pushi    0
			pToa     curPolygon
			send     10
code_1132:
			pushi    #draw
			pushi    0
			self     4
			pushi    #getAccessType
			pushi    0
			pToa     curPolygon
			send     4
			jmp      code_1161
code_1142:
			pushi    #first
			pushi    0
			self     4
			sat      temp0
			not     
			bnt      code_1154
			ldi      0
			aTop     curPolygon
			jmp      code_1161
code_1154:
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			aTop     curPolygon
			pushi    #draw
			pushi    0
			self     4
code_1161:
			pToa     curPolygon
			bnt      code_116d
			pushi    #changeState
			pushi    1
			pushi    1
			self     6
code_116d:
			ret     
		)
	)
	
	(method (movePt param1 param2)
		(asm
			pushi    #startRedraw
			pushi    0
			pToa     curPolygon
			send     4
			pushi    #eachElementDo
			pushi    1
			pushi    79
			self     6
			pushi    #movePt
			pushi    2
			lsp      param1
			lsp      param2
			pToa     curPolygon
			send     8
			pushi    #eachElementDo
			pushi    1
			pushi    78
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			pushi    #endRedraw
			pushi    0
			pToa     curPolygon
			send     4
			ret     
		)
	)
	
	(method (insertPt)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    79
			self     6
			pushi    #select
			pushi    2
			pushi    462
			pushi    0
			self     8
			pushi    #saveForUndo
			pushi    0
			self     4
			pushi    #insertPt
			pushi    2
			pTos     x
			pTos     y
			pToa     curPolygon
			send     8
			pushi    #changeState
			pushi    1
			pushi    3
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    78
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    190
			pushi    320
			lsl      local0
			callk    Graph,  12
			ret     
		)
	)
	
	(method (deletePt &tmp temp0)
		(asm
			pushi    #eachElementDo
			pushi    1
			pushi    79
			self     6
			pushi    #select
			pushi    2
			pushi    463
			pushi    0
			self     8
			pushi    #saveForUndo
			pushi    0
			self     4
			pushi    #deletePt
			pushi    0
			pToa     curPolygon
			send     4
			pushi    #size
			pushi    0
			pToa     curPolygon
			send     4
			not     
			bnt      code_1259
			pushi    #delete
			pushi    1
			pTos     curPolygon
			self     6
			pToa     size
			not     
			bnt      code_1259
			pushi    #changeState
			pushi    1
			pushi    0
			self     6
code_1259:
			pushi    #eachElementDo
			pushi    1
			pushi    78
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    190
			pushi    320
			lsl      local0
			callk    Graph,  12
			ret     
		)
	)
	
	(method (undo &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6)
		(asm
			pToa     undoPoly
			not     
			bnt      code_135e
			pushi    2
			pushi    943
			pushi    6
			calle    proc255_0,  4
			ret     
code_135e:
			pToa     undoPoly
			sat      temp1
			pToa     undoPrvPoly
			sat      temp2
			pToa     undoPolyBuf
			sat      temp3
			pToa     undoX
			sat      temp4
			pToa     undoY
			sat      temp5
			pToa     undoState
			sat      temp6
			pushi    #saveForUndo
			pushi    1
			pushi    0
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    79
			self     6
			lat      temp1
			aTop     curPolygon
			bnt      code_13c1
			pushi    #contains
			pushi    1
			pTos     curPolygon
			self     6
			not     
			bnt      code_13b4
			pushi    #add
			pushi    0
			self     4
			aTop     curPolygon
			lat      temp2
			bnt      code_13ad
			pushi    #addAfter
			pushi    2
			push    
			pTos     curPolygon
			self     8
			jmp      code_13b4
code_13ad:
			pushi    #addToFront
			pushi    1
			pTos     curPolygon
			self     6
code_13b4:
			pushi    #undo
			pushi    1
			lst      temp3
			pToa     curPolygon
			send     6
			jmp      code_13c8
code_13c1:
			pushi    #add
			pushi    0
			self     4
			aTop     curPolygon
code_13c8:
			pushi    2
			pushi    3
			lst      temp3
			callk    Memory,  4
			lat      temp4
			aTop     x
			lat      temp5
			aTop     y
			pushi    #changeState
			pushi    1
			lst      temp6
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    78
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    190
			pushi    320
			lsl      local0
			callk    Graph,  12
			pushi    4
			lsg      global20
			pushi    1
			pTos     x
			pTos     y
			callk    SetCursor,  8
			ret     
		)
	)
	
	(method (saveForUndo param1)
		(asm
			pToa     curPolygon
			aTop     undoPoly
			bnt      code_133e
			pushi    #prev
			pushi    1
			push    
			self     6
			aTop     undoPrvPoly
			lap      argc
			not     
			bt       code_1324
			lap      param1
code_1324:
			bnt      code_1334
			pToa     undoPolyBuf
			bnt      code_1334
			pushi    2
			pushi    3
			pTos     undoPolyBuf
			callk    Memory,  4
code_1334:
			pushi    #saveForUndo
			pushi    0
			pToa     curPolygon
			send     4
			aTop     undoPolyBuf
code_133e:
			pToa     x
			aTop     undoX
			pToa     y
			aTop     undoY
			pToa     state
			aTop     undoState
			ret     
		)
	)
	
	(method (advanceRetreat param1 param2 &tmp temp0 temp1)
		(asm
			pushi    2
			pTos     elements
			pTos     curPolygon
			callk    FindKey,  4
			sat      temp1
			lsp      param1
			pushi    1
			push    
			self     6
			sat      temp0
			not     
			bnt      code_12f3
			lsp      param2
			pushi    1
			lst      temp1
			self     6
			sat      temp0
			not     
			bnt      code_12f3
			lat      temp1
			sat      temp0
code_12f3:
			pushi    1
			lst      temp0
			callk    NodeValue,  2
			aTop     curPolygon
			pushi    #setCur
			pushi    1
			pushi    #curNode
			pushi    0
			pToa     curPolygon
			send     4
			push    
			pToa     curPolygon
			send     6
			ret     
		)
	)
	
	(method (readObstacles)
		(asm
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_1041
			pushi    #eachElementDo
			pushi    2
			pushi    99
			lofsa    readObstacle
			push    
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     8
code_1041:
			ret     
		)
	)
	
	(method (writeObstacles)
		(asm
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			bnt      code_105f
			pushi    #eachElementDo
			pushi    1
			pushi    108
			pushi    122
			pushi    0
			pushi    #obstacles
			pushi    0
			lag      global2
			send     4
			send     10
code_105f:
			pushi    #eachElementDo
			pushi    1
			pushi    467
			self     6
			ret     
		)
	)
	
	(method (showMap param1)
		(asm
			lsp      param1
			ldi      65535
			eq?     
			bnt      code_1427
			lsl      local0
			ldi      1
			eq?     
			bnt      code_1423
			ldi      4
			sap      param1
			jmp      code_1427
code_1423:
			ldi      1
			sap      param1
code_1427:
			lsl      local0
			lap      param1
			ne?     
			bnt      code_1459
			pushi    #eachElementDo
			pushi    1
			pushi    79
			self     6
			lap      param1
			sal      local0
			pushi    #eachElementDo
			pushi    1
			pushi    78
			self     6
			pushi    #eachElementDo
			pushi    1
			pushi    83
			self     6
			pushi    6
			pushi    12
			pushi    0
			pushi    0
			pushi    190
			pushi    320
			lsl      local0
			callk    Graph,  12
code_1459:
			ret     
		)
	)
	
	(method (exit &tmp [temp0 100] temp100 temp101 temp102)
		(asm
			pTos     state
			ldi      0
			eq?     
			bnt      code_1523
			pushi    #finishAdding
			pushi    0
			self     4
code_1523:
			pushi    #showMap
			pushi    1
			pushi    1
			self     6
			pToa     curPolygon
			not     
			bnt      code_1533
			ldi      1
			ret     
code_1533:
			pushi    #eachElementDo
			pushi    1
			pushi    164
			self     6
			lal      local2
			not     
			bnt      code_1558
			pushi    4
			lea      @local2
			push    
			pushi    943
			pushi    7
			pushi    #curPic
			pushi    0
			lag      global2
			send     4
			push    
			callk    Format,  8
code_1558:
			pushi    22
			pushi    80
			lofsa    {Save Polygons}
			push    
			lofsa    {File:_}
			push    
			pushi    41
			lea      @local2
			push    
			pushi    25
			pushi    106
			pushi    81
			lofsa    { Save_}
			push    
			pushi    1
			pushi    4
			pushi    1
			pushi    81
			lofsa    {Abandon}
			push    
			pushi    2
			pushi    4
			pushi    5
			pushi    81
			lofsa    {Cancel}
			push    
			pushi    0
			pushi    4
			pushi    5
			calle    proc940_0,  44
			sat      temp100
			not     
			bnt      code_159d
			ldi      0
			ret     
code_159d:
			lst      temp100
			ldi      2
			eq?     
			bnt      code_15a8
			ldi      1
			ret     
code_15a8:
			pushi    2
			pushi    10
			lea      @local2
			push    
			callk    FileIO,  4
			bnt      code_15f0
			pushi    11
			pushi    4
			lea      @temp0
			push    
			pushi    943
			pushi    8
			lea      @local2
			push    
			callk    Format,  8
			push    
			pushi    106
			pushi    81
			lofsa    {Replace}
			push    
			pushi    1
			pushi    81
			lofsa    {Append}
			push    
			pushi    2
			pushi    81
			lofsa    {Cancel}
			push    
			pushi    0
			calle    proc940_0,  22
			sat      temp100
			not     
			bnt      code_15f0
			ldi      0
			ret     
code_15f0:
			lst      temp100
			ldi      1
			eq?     
			bnt      code_15fd
			ldi      2
			jmp      code_15ff
code_15fd:
			ldi      0
code_15ff:
			sat      temp102
			pushi    #name
			pushi    1
			lea      @local2
			push    
			pushi    181
			pushi    1
			lst      temp102
			pushi    #new
			pushi    0
			class    Class_993_0
			send     4
			sat      temp101
			send     12
			not     
			bnt      code_163a
			pushi    3
			pushi    943
			pushi    9
			pushi    #name
			pushi    0
			lat      temp101
			send     4
			push    
			calle    proc255_4,  6
			pushi    #dispose
			pushi    0
			lat      temp101
			send     4
			ldi      0
			ret     
code_163a:
			pushi    #writeString
			pushi    1
			pushi    4
			lea      @temp0
			push    
			pushi    943
			pushi    10
			lofsa    {Polygon Editor 1.11}
			push    
			callk    Format,  8
			push    
			lat      temp101
			send     6
			pushi    #writeString
			pushi    1
			pushi    5
			lea      @temp0
			push    
			pushi    943
			pushi    11
			lofsa    {Dynamic Obstacles}
			push    
			pushi    #curPic
			pushi    0
			lag      global2
			send     4
			push    
			callk    Format,  10
			push    
			lat      temp101
			send     6
			pushi    #writeString
			pushi    1
			lofsa    {\t\t(curRoom addObstacle:\n}
			push    
			lat      temp101
			send     6
			pushi    #eachElementDo
			pushi    2
			pushi    468
			lst      temp101
			self     8
			pushi    #writeString
			pushi    1
			lofsa    {\t\t)\n}
			push    
			lat      temp101
			send     6
			pushi    #dispose
			pushi    0
			lat      temp101
			send     4
			ldi      1
			ret     
		)
	)
)
