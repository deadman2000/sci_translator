;;; Sierra Script 1.0 - (do not remove this comment)
(script# 96)
(include sci.sh)
(use n000)
(use n255)
(use n806)
(use n939)
(use n958)
(use n967)
(use n994)
(use n998)
(use n999)

(public
	cred 0
)

(local
	local0
	local1
	local2
	local3 =  114
	local4 =  26
	local5
	local6
	[local7 2]
	local9
)
(instance cred of Rm
	(properties
		picture 95
		style $000f
	)
	
	(method (init)
		(proc0_3)
		(gRgnMusic prevSignal: 0)
		(gMH add: theMumble)
		(gKH add: theMumble)
		(proc958_0 129 95 905 803 96)
		(proc958_0 128 95 905 906)
		(if (proc0_5 0) (= local9 10) else (= local9 -32762))
		(super init:)
		(gRgnMusic2 number: 905 play:)
		(proc806_2 bowPiece)
		(hand setPri: 13 init:)
		(grin setPri: 13 init:)
		(arrow setPri: 13 init:)
		(Graph grDRAW_LINE 63 67 0 130 local3 -1 -1)
		(Graph grDRAW_LINE 63 66 0 129 local4 -1 -1)
		(Graph grDRAW_LINE 71 68 189 127 local3 -1 -1)
		(Graph grDRAW_LINE 71 67 189 126 local4 -1 -1)
		(self setScript: theMumble)
	)
	
	(method (doit &tmp temp0 temp1)
		(++ local6)
		(= temp0 3)
		(if (and local5 (== (mod local6 8) 0))
			(Palette 6 241 255 -1)
		)
		(cond 
			((== (mod local6 80) 0)
				(Palette 6 216 218 temp0)
				(Palette 6 233 235 temp0)
				(Palette 6 225 227 temp0)
			)
			((== (mod local6 80) 16)
				(Palette 6 217 219 temp0)
				(Palette 6 234 236 temp0)
				(Palette 6 227 229 temp0)
			)
			((== (mod local6 80) 32)
				(Palette 6 218 220 temp0)
				(Palette 6 235 237 temp0)
				(Palette 6 228 230 temp0)
			)
			((== (mod local6 80) 48)
				(Palette 6 219 221 temp0)
				(Palette 6 236 238 temp0)
				(Palette 6 229 231 temp0)
			)
			((== (mod local6 80) 64)
				(Palette 6 220 222 temp0)
				(Palette 6 237 239 temp0)
				(Palette 6 230 232 temp0)
			)
		)
		(super doit:)
	)
	
	(method (dispose)
		(gRgnMusic flags: (| (gRgnMusic flags?) $0001))
		(gMH delete: theMumble)
		(gKH delete: theMumble)
		(super dispose: &rest)
	)
)

(instance bowPiece of PicView
	(properties
		x 216
		y 100
		view 95
		loop 3
		priority 15
		signal $4000
	)
)

(instance quitIcon of DCIcon
	(properties
		view 903
		cycleSpeed 18
	)
	
	(method (init)
		((= cycler (Osc new:)) init: self 1)
	)
)

(instance hand of Prop
	(properties
		x 44
		y 63
		view 95
		signal $4000
	)
)

(instance grin of Prop
	(properties
		x 99
		y 77
		view 95
		loop 1
		signal $4000
	)
)

(instance arrow of Actor
	(properties
		x 69
		y 67
		view 95
		loop 2
		signal $4000
	)
)

(instance titleName of PicView
	(properties
		x 45
		y 93
		view 905
	)
)

(instance NWview of PicView
	(properties
		view 905
	)
)

(instance NEview of PicView
	(properties
		x 258
		y 41
		view 906
	)
)

(instance SWview of PicView
	(properties
		x 63
		y 154
		view 906
		cel 4
	)
)

(instance theMumble of Script
	(properties)
	
	(method (doit)
		(if (== (gRgnMusic prevSignal?) -1)
			(proc0_4)
			(global2 newRoom: 95)
		)
		(super doit: &rest)
	)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_06bd
			pushi    0
			callb    proc0_3,  0
			pushi    #setCursor
			pushi    2
			pushi    5
			pushi    1
			lag      global1
			send     8
			ldi      3
			aTop     seconds
			jmp      code_0c47
code_06bd:
			dup     
			ldi      1
			eq?     
			bnt      code_06d2
			pushi    #setScript
			pushi    2
			lofsa    bowString
			push    
			pushSelf
			self     8
			jmp      code_0c47
code_06d2:
			dup     
			ldi      2
			eq?     
			bnt      code_06e0
			ldi      30
			aTop     ticks
			jmp      code_0c47
code_06e0:
			dup     
			ldi      3
			eq?     
			bnt      code_06ff
			pushi    #number
			pushi    1
			pushi    908
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    0
			lag      gSFX
			send     16
			ldi      30
			aTop     ticks
			jmp      code_0c47
code_06ff:
			dup     
			ldi      4
			eq?     
			bnt      code_0717
			pushi    #setCel
			pushi    1
			pushi    1
			lofsa    grin
			send     6
			ldi      24
			aTop     ticks
			jmp      code_0c47
code_0717:
			dup     
			ldi      5
			eq?     
			bnt      code_0854
			pushi    #drawPic
			pushi    1
			pushi    95
			lag      global2
			send     6
			pushi    #init
			pushi    0
			lofsa    grin
			send     4
			pushi    8
			pushi    4
			pushi    0
			pushi    142
			pushi    38
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    0
			pushi    141
			pushi    38
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    47
			pushi    142
			pushi    65
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    46
			pushi    141
			pushi    66
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    72
			pushi    142
			pushi    78
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    73
			pushi    141
			pushi    86
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    82
			pushi    142
			pushi    85
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    107
			pushi    142
			pushi    131
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    107
			pushi    141
			pushi    160
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    148
			pushi    142
			pushi    160
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    168
			pushi    142
			pushi    189
			pushi    142
			lsl      local3
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			pushi    168
			pushi    141
			pushi    189
			pushi    141
			lsl      local4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    #overlay
			pushi    1
			pushi    96
			lag      global2
			send     6
			pushi    1
			pushi    0
			callk    Animate,  2
			ldi      60
			aTop     ticks
			jmp      code_0c47
code_0854:
			dup     
			ldi      6
			eq?     
			bnt      code_08d0
code_085b:
			pushi    #setCursor
			pushi    4
			pushi    999
			pushi    1
			pushi    293
			pushi    168
			lag      global1
			send     12
			pushi    17
			pushi    96
			pushi    0
			pushi    30
			pushi    1
			pushi    81
			lofsa    {___Start____}
			push    
			pushi    1
			pushi    81
			lofsa    {__Restore___}
			push    
			pushi    2
			pushi    81
			lofsa    {Introduction}
			push    
			pushi    3
			pushi    82
			lofsa    quitIcon
			push    
			pushi    1
			pushi    0
			calle    proc255_0,  34
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_08aa
			pushi    #restart
			pushi    0
			lag      global1
			send     4
			jmp      code_08c9
code_08aa:
			dup     
			ldi      2
			eq?     
			bnt      code_08bb
			pushi    #restore
			pushi    0
			lag      global1
			send     4
			jmp      code_08c9
code_08bb:
			dup     
			ldi      3
			eq?     
			bnt      code_08c9
			pushi    #cue
			pushi    0
			self     4
			ret     
code_08c9:
			toss    
			jmp      code_085b
			jmp      code_0c47
code_08d0:
			dup     
			ldi      7
			eq?     
			bnt      code_0908
			pushi    #setCursor
			pushi    1
			pushi    5
			lag      global1
			send     6
			pushi    43
			pushi    #superClass
			pushi    100
			pushi    6
			pushi    1
			pushi    1
			pushi    42
			pushi    1
			pushSelf
			pushi    102
			pushi    1
			pushi    #flags
			pushi    0
			lag      gRgnMusic
			send     4
			push    
			ldi      65534
			and     
			push    
			lag      gRgnMusic
			send     24
			ldi      1
			sal      local5
			jmp      code_0c47
code_0908:
			dup     
			ldi      8
			eq?     
			bnt      code_0940
			pushi    #eachElementDo
			pushi    1
			pushi    108
			lag      global5
			send     6
			ldi      0
			sal      local5
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0940:
			dup     
			ldi      9
			eq?     
			bnt      code_0987
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    titleName
			send     6
			pushi    #cel
			pushi    1
			pushi    4
			lofsa    SWview
			send     6
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    NEview
			send     6
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0987:
			dup     
			ldi      10
			eq?     
			bnt      code_09ea
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    titleName
			send     6
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    93
			pushi    7
			pushi    1
			pushi    4
			lofsa    NWview
			send     18
			pushi    #cel
			pushi    1
			pushi    4
			dup     
			pushi    1
			pushi    66
			lofsa    SWview
			send     12
			pushi    #cel
			pushi    1
			pushi    0
			lofsa    NEview
			send     6
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    4
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  8
			jmp      code_0c47
code_09ea:
			dup     
			ldi      11
			eq?     
			bnt      code_0a52
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    93
			pushi    7
			pushi    1
			pushi    5
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    90
			pushi    3
			pushi    1
			pushi    131
			pushi    7
			pushi    1
			pushi    6
			lofsa    NWview
			send     18
			pushi    #x
			pushi    1
			pushi    268
			pushi    3
			pushi    1
			pushi    100
			pushi    7
			pushi    1
			pushi    2
			lofsa    SWview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0a52:
			dup     
			ldi      12
			eq?     
			bnt      code_0ad2
			pushi    #x
			pushi    1
			pushi    52
			pushi    3
			pushi    1
			pushi    89
			pushi    7
			pushi    1
			pushi    3
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    57
			pushi    3
			pushi    1
			pushi    91
			pushi    7
			pushi    1
			pushi    4
			lofsa    NWview
			send     18
			pushi    #x
			pushi    1
			pushi    280
			pushi    3
			pushi    1
			pushi    65
			pushi    7
			pushi    1
			pushi    2
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    49
			pushi    3
			pushi    1
			pushi    149
			pushi    7
			pushi    1
			pushi    5
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    4
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  8
			jmp      code_0c47
code_0ad2:
			dup     
			ldi      13
			eq?     
			bnt      code_0b3a
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    93
			pushi    7
			pushi    1
			pushi    7
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    256
			pushi    3
			pushi    1
			pushi    42
			pushi    7
			pushi    1
			pushi    0
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    45
			pushi    3
			pushi    1
			pushi    150
			pushi    7
			pushi    1
			pushi    5
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0b3a:
			dup     
			ldi      14
			eq?     
			bnt      code_0bbb
			pushi    #x
			pushi    1
			pushi    41
			pushi    3
			pushi    1
			pushi    102
			pushi    7
			pushi    1
			pushi    8
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    161
			pushi    3
			pushi    1
			pushi    102
			pushi    7
			pushi    1
			pushi    9
			lofsa    NWview
			send     18
			pushi    #x
			pushi    1
			pushi    91
			pushi    3
			pushi    1
			pushi    43
			pushi    7
			pushi    1
			pushi    0
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    209
			pushi    3
			pushi    1
			pushi    155
			pushi    7
			pushi    1
			pushi    4
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    4
			lofsa    titleName
			push    
			lofsa    NWview
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  8
			jmp      code_0c47
code_0bbb:
			dup     
			ldi      15
			eq?     
			bnt      code_0c23
			pushi    #x
			pushi    1
			pushi    77
			pushi    3
			pushi    1
			pushi    90
			pushi    7
			pushi    1
			pushi    10
			lofsa    titleName
			send     18
			pushi    #x
			pushi    1
			pushi    245
			pushi    3
			pushi    1
			pushi    43
			pushi    7
			pushi    1
			pushi    0
			lofsa    SWview
			send     18
			pushi    #x
			pushi    1
			pushi    67
			pushi    3
			pushi    1
			pushi    150
			pushi    7
			pushi    1
			pushi    5
			lofsa    NEview
			send     18
			pushi    #drawPic
			pushi    2
			pushi    905
			lsl      local9
			lag      global2
			send     8
			pushi    3
			lofsa    titleName
			push    
			lofsa    SWview
			push    
			lofsa    NEview
			push    
			calle    proc806_2,  6
			jmp      code_0c47
code_0c23:
			dup     
			ldi      16
			eq?     
			bnt      code_0c2d
			jmp      code_0c47
code_0c2d:
			dup     
			ldi      17
			eq?     
			bnt      code_0c47
			pushi    0
			callb    proc0_4,  0
			pushi    #newRoom
			pushi    1
			pushi    95
			lag      global2
			send     6
			pushi    #dispose
			pushi    0
			self     4
code_0c47:
			toss    
			ret     
		)
	)
	
	(method (handleEvent pEvent)
		(if (pEvent claimed?) (return))
		(pEvent claimed: 1)
		(if
			(or
				(and
					(& (pEvent modifiers?) emSHIFT)
					(& (pEvent type?) evMOUSEBUTTON)
				)
				(and
					(& (pEvent type?) evKEYBOARD)
					(== (pEvent message?) KEY_ESCAPE)
				)
			)
			(self dispose:)
			(global2 newRoom: 95)
		)
		(if
			(or
				(== (pEvent type?) evMOUSEBUTTON)
				(and
					(& (pEvent type?) evKEYBOARD)
					(== (pEvent message?) KEY_RETURN)
				)
			)
			(self cue:)
		)
	)
)

(instance bowString of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(global2 drawPic: 95)
				(proc806_2 bowPiece)
				(arrow posn: 183 84 init:)
				(hand init: setCel: 1)
				(grin init:)
				(= ticks 4)
			)
			(1
				(hand dispose:)
				(arrow dispose:)
				(= local0 (Graph grSAVE_BOX 0 132 189 141 1))
				(= local1 (Graph grSAVE_BOX 0 143 189 151 1))
				(Graph grDRAW_LINE 30 139 159 139 local3 -1 -1)
				(Graph grDRAW_LINE 70 136 119 136 local3 -1 -1)
				(Graph grDRAW_LINE 90 133 99 133 local3 -1 -1)
				(Graph grDRAW_LINE 30 144 159 144 local4 -1 -1)
				(Graph grDRAW_LINE 70 147 119 147 local4 -1 -1)
				(Graph grDRAW_LINE 90 150 99 150 local4 -1 -1)
				(Graph grDRAW_LINE 0 142 189 142 local3 1 -1)
				(Graph grDRAW_LINE 0 141 189 141 local4 1 -1)
				(Graph grREDRAW_BOX 0 64 189 148)
				(= ticks 4)
			)
			(2
				(gSFX number: 906 loop: 1 play:)
				(Graph grRESTORE_BOX local0)
				(Graph grRESTORE_BOX local1)
				(Graph grREDRAW_BOX 0 132 189 141)
				(Graph grREDRAW_BOX 0 143 189 151)
				(= ticks 4)
			)
			(3
				(= local0 (Graph grSAVE_BOX 0 132 189 141 1))
				(= local1 (Graph grSAVE_BOX 0 143 189 151 1))
				(Graph grDRAW_LINE 30 139 159 139 local4 -1 -1)
				(Graph grDRAW_LINE 30 144 159 144 local3 -1 -1)
				(Graph grREDRAW_BOX 0 64 189 148)
				(= ticks 4)
			)
			(4
				(Graph grRESTORE_BOX local0)
				(Graph grRESTORE_BOX local1)
				(Graph grREDRAW_BOX 0 132 189 141)
				(Graph grREDRAW_BOX 0 143 189 151)
				(= ticks 4)
			)
			(5 (self dispose:))
		)
	)
)
