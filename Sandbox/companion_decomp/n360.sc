;;; Sierra Script 1.0 - (do not remove this comment)
(script# 360)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n851)
(use n945)
(use n946)
(use n950)
(use n958)
(use n992)
(use n994)
(use n998)
(use n999)

(public
	rm360 0
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
	[local11 4] = [1360 75 1]
	[local15 4] = [1360 0 1]
	[local19 8] = [1360 1 1 0 1360 2 1]
	[local27 4] = [1360 19 1]
	[local31 4] = [1360 31 1]
	[local35 4] = [1360 30 1]
	[local39 7] = [1360 24 1 2 1 2]
	[local46 5] = [1360 28 1 2]
	[local51 6] = [1360 39 1 2 2]
	[local57 4] = [1360 42 1]
	[local61 4] = [1360 54 1]
	[local65 4] = [1360 55 1]
	[local69 4] = [1360 57 1]
	[local73 4] = [1360 82 1]
	[local77 4] = [1360 83 1]
	[local81 5] = [1360 84 1 1]
	[local86 4] = [1360 65 1]
	[local90 4] = [1360 66 1]
	[local94 4] = [1360 67 1]
	[local98 4] = [1360 74 1]
	[local102 4] = [1360 68 1]
	[local106 8] = [1360 69 2 2 1 2 1]
	[local114 5] = [1360 76 1 1]
	[local119 4] = [1360 16 1]
	[local123 4] = [1360 17 1]
	[local127 4] = [1360 18 1]
	[local131 4] = [1360 32 1]
	[local135 8] = [1360 33 2 2 1 2 2]
	[local143 4] = [1360 38 1]
	[local147 6] = [1360 43 1 2 1]
	[local153 11] = [1360 46 2 1 2 2 1 2 1 2]
	[local164 7] = [1360 58 2 1 2 2]
	[local171 6] = [1360 62 2 1 2]
	[local177 7] = [1360 86 2 1 2 2]
	[local184 4] = [1360 90 1]
	[local188 9] = [44 0 2 3 26 37 20 25 20]
)
(instance rm360 of Rm
	(properties
		picture 360
		north 350
	)
	
	(method (init)
		(super init:)
		(Load rsSCRIPT 927)
		(proc958_0 128 362 39 361)
		(if (== gNewGuise 3)
			(proc0_6 162)
			(= local9 1)
			(= local6 1)
		)
		(gIconBar disable: 4)
		(gIconBar disable: 5)
		(proc806_3
			lobbWindow
			lobbShelfDoor
			lobbDoor
			lobbBoots
			lobbTopShelf
			lobbCloak
			lobbTools
			lobbStool
			lobbChest
			lobbFrontWall
			lobbLeftWall
			lobbRightWall
			lobbCeiling
			lobbFloor
			lobbBackWall
		)
		(openDoor init:)
		(if
			(or
				(!= (gRgnMusic number?) 362)
				(< (gRgnMusic vol?) 127)
			)
			(gRgnMusic number: 362 loop: -1 play:)
		)
		(proc0_2)
		(if (== gHeading 350)
			(lobb init:)
			(gEgo
				posn: 131 142
				init:
				illegalBits: 0
				setScript: stepIn
			)
		else
			(gClient
				addObstacle:
					((Polygon new:)
						type: 2
						init: 191 148 209 163 195 172 179 160 185 154
						yourself:
					)
			)
			(proc0_4)
			(gEgo posn: 159 165 loop: 0 init:)
			(lobb posn: 195 165 loop: 1 init:)
			(proc806_6 0)
		)
		(gEgo observeControl: -32768)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 0 189 0 0 53 0 132 88 119 91 123 146 85 162 58 165 13 189
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 152 0 319 0 319 189 308 189 278 171 222 163 204 142 140 143
					yourself:
				)
		)
	)
	
	(method (doit)
		(cond 
			((gEgo script?) 0)
			((< (gEgo y?) 146) (gEgo setScript: goOutside))
			((> (gEgo y?) 185) (gEgo setMotion: 0 setScript: moveFromTheWall))
			((and (== gNewGuise 3) (not local8)) (proc0_6 162) (= local8 1))
			((and local8 (not local9)) (= local9 1))
		)
		(super doit:)
	)
	
	(method (dispose)
		(DisposeScript 927)
		(super dispose:)
	)
)

(instance lobbWindow of Feature
	(properties
		x 198
		y 106
		nsTop 78
		nsLeft 174
		nsBottom 114
		nsRight 226
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(proc13_6 20)
				(proc13_4 1360 6 1)
				(proc13_6 0)
			)
			(3
				(proc851_0 @local27 @local188 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobbShelfDoor of Feature
	(properties
		x 130
		y 64
		nsTop 60
		nsLeft 107
		nsBottom 68
		nsRight 154
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1360 15 1))
			(3 (proc13_4 1360 20 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobbDoor of Feature
	(properties
		x 129
		y 113
		nsTop 87
		nsLeft 115
		nsBottom 139
		nsRight 144
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(proc13_6 20)
				(proc13_4 1360 5 1)
				(proc13_6 0)
			)
			(3
				(proc851_0 @local27 @local188 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobbCloak of Feature
	(properties
		x 158
		y 106
		nsTop 79
		nsLeft 152
		nsBottom 133
		nsRight 165
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1360 11 1))
			(3 (proc13_4 1360 20 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobbStool of Feature
	(properties
		x 131
		y 143
		nsTop 131
		nsLeft 224
		nsBottom 155
		nsRight 239
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1360 12 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobbBoots of Feature
	(properties
		x 47
		y 108
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 47 94 63 94 102 89 102 98 64 108 47 107
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb param2)
		(cond 
			((== theVerb 2) (proc13_4 1360 8 1))
			((== theVerb 3) (proc13_4 1360 21 1))
			((== theVerb 4) (if (== param2 0) (proc13_4 1360 56 1)))
			(else (super doVerb: theVerb &rest))
		)
	)
)

(instance lobbTopShelf of Feature
	(properties
		x 47
		y 91
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 47 78 100 77 101 85 62 90 46 91
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(cond 
			((== theVerb 2) (proc13_4 1360 7 1))
			((== theVerb 3) (proc13_4 1360 20 1))
			(else (super doVerb: theVerb &rest))
		)
	)
)

(instance lobbTools of Feature
	(properties
		x 234
		y 128
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 234 117 256 105 275 125 252 128
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(cond 
			((== theVerb 2) (proc13_4 1360 10 1))
			((== theVerb 3) (proc13_4 1360 23 1))
			(else (super doVerb: theVerb &rest))
		)
	)
)

(instance lobbChest of Feature
	(properties
		x 53
		y 160
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 53 135 80 124 96 124 99 148 78 160 52 157
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(cond 
			((== theVerb 2) (proc13_4 1360 9 1))
			((== theVerb 3) (proc13_4 1360 22 1))
			(else (super doVerb: theVerb &rest))
		)
	)
)

(instance lobbFrontWall of Feature
	(properties
		x 89
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				89
				58
				234
				59
				224
				138
				100
				139
				98
				122
				79
				122
				80
				108
				103
				101
				103
				75
				86
				75
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1360 13 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance lobbLeftWall of Feature
	(properties
		x 1
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 1 29 3 84 58 82 73 44 75 42 111 76 110 75 124 47 134 50 158 4 187
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1360 13 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance lobbRightWall of Feature
	(properties
		x 315
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 315 180 260 148 285 129 258 100 234 112 236 63 317 1
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1360 13 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance lobbCeiling of Feature
	(properties
		x 34
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 34 0 303 1 240 58 87 56 36 1
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1360 13 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance lobbFloor of Feature
	(properties
		x 27
		y 139
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 27 173 52 160 79 160 110 141 216 141 216 159 273 163 299 174
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1360 13 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance lobbBackWall of Feature
	(properties
		x 17
		y 178
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 17 180 308 178 316 185 9 187
			yourself:
		)
		(super init:)
	)
	
	(method (dispose)
		(onMeCheck dispose:)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 2)
			(proc13_4 1360 14 1)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance openDoor of View
	(properties
		x 114
		y 84
		view 350
		loop 5
		priority 10
		signal $0011
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(proc13_6 20)
				(proc13_4 1360 5 1)
				(proc13_6 0)
			)
			(3
				(proc851_0 @local27 @local188 0)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance lobb of Actor
	(properties
		x 266
		y 162
		view 361
		loop 3
		cel 2
	)
	
	(method (doVerb theVerb param2 param3)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_0e16
			pushi    #has
			pushi    1
			pushi    3
			lag      gEgo
			send     6
			bnt      code_0e07
			pushi    3
			pushi    1360
			pushi    3
			pushi    1
			calle    proc13_4,  6
			jmp      code_121d
code_0e07:
			pushi    3
			pushi    1360
			pushi    4
			pushi    1
			calle    proc13_4,  6
			jmp      code_121d
code_0e16:
			dup     
			ldi      3
			eq?     
			bnt      code_0e2c
			pushi    #setScript
			pushi    1
			lofsa    handLobb
			push    
			lag      gEgo
			send     6
			jmp      code_121d
code_0e2c:
			dup     
			ldi      5
			eq?     
			bnt      code_1026
			lsg      gNewGuise
			ldi      1
			eq?     
			bnt      code_0e5d
			pushi    #has
			pushi    1
			pushi    15
			lag      gEgo
			send     6
			bnt      code_0e5d
			pushi    4
			lea      @local31
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_0e5d:
			pushi    #has
			pushi    1
			pushi    3
			lag      gEgo
			send     6
			bnt      code_0edd
			lsg      gNewGuise
			ldi      1
			eq?     
			bnt      code_0edd
			pushi    1
			pushi    8
			callb    proc0_5,  2
			not     
			bnt      code_0edd
			lsl      local3
			ldi      1
			eq?     
			bnt      code_0e99
			pushi    4
			lea      @local35
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			bt       code_121d
code_0e99:
			lsl      local2
			ldi      0
			eq?     
			bnt      code_0ebb
			pushi    4
			lea      @local39
			push    
			pushi    7
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local2
			bt       code_121d
code_0ebb:
			lsl      local2
			ldi      1
			eq?     
			bnt      code_121d
			pushi    4
			lea      @local46
			push    
			pushi    7
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local3
			jmp      code_121d
code_0edd:
			lsg      gNewGuise
			ldi      2
			eq?     
			bnt      code_0f89
			lsg      global130
			ldi      9
			eq?     
			bnt      code_0f89
			pushi    1
			pushi    162
			callb    proc0_5,  2
			bnt      code_0f19
			lsl      local7
			ldi      0
			eq?     
			bnt      code_0f19
			ldi      1
			sal      local7
			pushi    3
			lea      @local177
			push    
			pushi    999
			lea      @local188
			push    
			calle    proc851_0,  6
			jmp      code_121d
code_0f19:
			pushi    1
			pushi    162
			callb    proc0_5,  2
			bnt      code_0f3f
			lsl      local7
			ldi      1
			eq?     
			bnt      code_0f3f
			pushi    3
			lea      @local184
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_0f3f:
			pushi    1
			pushi    138
			callb    proc0_5,  2
			not     
			bnt      code_0f74
			pushi    #has
			pushi    1
			pushi    8
			lag      gEgo
			send     6
			bnt      code_0f74
			pushi    1
			pushi    138
			callb    proc0_6,  2
			pushi    1
			pushi    24
			callb    proc0_6,  2
			pushi    #setScript
			pushi    1
			lofsa    moveToRobin
			push    
			lofsa    lobb
			send     6
			jmp      code_121d
code_0f74:
			pushi    4
			lea      @local143
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_0f89:
			lsg      gNewGuise
			ldi      3
			eq?     
			bnt      code_121d
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			lsl      local1
			ldi      0
			eq?     
			bnt      code_0fc6
			pushi    1
			pushi    24
			callb    proc0_5,  2
			not     
			bnt      code_0fc6
			ldi      1
			sal      local1
			pushi    1
			pushi    24
			callb    proc0_6,  2
			pushi    #setScript
			pushi    2
			lofsa    moveCloseAndAway
			push    
			pushSelf
			lofsa    lobb
			send     8
			jmp      code_121d
code_0fc6:
			lsl      local8
			ldi      1
			eq?     
			bnt      code_1011
			lsl      local6
			ldi      0
			eq?     
			bnt      code_1011
			ldi      1
			sal      local6
			lsl      local5
			ldi      0
			eq?     
			bnt      code_0ffc
			pushi    4
			lea      @local51
			push    
			pushi    5
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local5
			jmp      code_121d
code_0ffc:
			pushi    4
			lea      @local57
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_1011:
			pushi    4
			lea      @local61
			push    
			lea      @local188
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_121d
code_1026:
			dup     
			ldi      4
			eq?     
			bnt      code_1212
			lsp      param2
			ldi      0
			eq?     
			bnt      code_10c1
			lsg      global130
			ldi      3
			eq?     
			bnt      code_105e
			pushi    #has
			pushi    1
			pushi    15
			lag      gEgo
			send     6
			bnt      code_105e
			pushi    3
			lea      @local73
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_105e:
			lsg      global130
			ldi      3
			eq?     
			bnt      code_1088
			pushi    #has
			pushi    1
			pushi    15
			lag      gEgo
			send     6
			not     
			bnt      code_1088
			pushi    3
			lea      @local77
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1088:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_10ad
			pushi    1
			pushi    24
			callb    proc0_5,  2
			bnt      code_10ad
			pushi    3
			lea      @local81
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_10ad:
			pushi    3
			lea      @local65
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_10c1:
			lsp      param2
			ldi      2
			eq?     
			bnt      code_10dd
			pushi    3
			lea      @local69
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_10dd:
			lsp      param2
			ldi      3
			eq?     
			bnt      code_111c
			pushi    1
			pushi    5
			callb    proc0_5,  2
			not     
			bnt      code_110b
			pushi    1
			pushi    190
			callb    proc0_5,  2
			not     
			bnt      code_110b
			pushi    #setScript
			pushi    2
			lofsa    goBackRoom
			push    
			pushSelf
			lofsa    lobb
			send     8
			jmp      code_121d
code_110b:
			pushi    #setScript
			pushi    2
			lofsa    killRobinScript
			push    
			pushSelf
			lofsa    lobb
			send     8
			jmp      code_121d
code_111c:
			lsp      param2
			ldi      15
			eq?     
			bnt      code_1138
			pushi    3
			lea      @local86
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1138:
			lsp      param2
			ldi      14
			eq?     
			bnt      code_1154
			pushi    3
			lea      @local90
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1154:
			lsp      param2
			ldi      10
			eq?     
			bt       code_1164
			lsp      param2
			ldi      18
			eq?     
			bnt      code_1180
code_1164:
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			pushi    3
			lea      @local94
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1180:
			lsp      param2
			ldi      7
			eq?     
			bnt      code_11ee
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			lsl      local4
			ldi      1
			eq?     
			bnt      code_11ac
			pushi    3
			lea      @local98
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_11ac:
			pushi    1
			pushi    24
			callb    proc0_5,  2
			not     
			bnt      code_11ca
			pushi    3
			lea      @local102
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_11ca:
			pushi    1
			pushi    24
			callb    proc0_5,  2
			bnt      code_121d
			pushi    4
			lea      @local106
			push    
			pushi    999
			lea      @local188
			push    
			pushSelf
			calle    proc851_0,  8
			ldi      1
			sal      local4
			jmp      code_121d
code_11ee:
			lsp      param2
			ldi      8
			eq?     
			bnt      code_121d
			lsg      global130
			ldi      9
			eq?     
			bnt      code_121d
			pushi    3
			lea      @local114
			push    
			lea      @local188
			push    
			pushi    0
			calle    proc851_0,  6
			jmp      code_121d
code_1212:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param3
			super    Actor,  6
code_121d:
			toss    
			ret     
		)
	)
)

(instance goOutside of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(if (>= (gEgo x?) 136)
					(gEgo setMotion: MoveTo 130 146 self)
				else
					(self cue:)
				)
			)
			(1
				(gEgo setMotion: MoveTo 135 130 self)
			)
			(2
				(gRgnMusic fade: 0 30 8 1)
				(gClient newRoom: 350)
			)
		)
	)
)

(instance putOnRouge of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc851_0 @local11 4 0)
				(gEgo setHeading: 0 self)
			)
			(1 (gEgo setHeading: 90 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance stepIn of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 lobb gEgo)
				(gEgo setMotion: MoveTo 131 170 self)
			)
			(1
				(proc0_9 gEgo lobb self)
				(lobb setLoop: 1 setCel: 0 illegalBits: 0)
			)
			(2
				(cond 
					((and (== gNewGuise 1) (not (proc0_5 19))) (proc0_6 19) (proc851_0 @local15 @local188 0))
					(
						(and
							(not (proc0_5 20))
							(or (== gNewGuise 2) (== gNewGuise 3))
						)
						(proc0_6 20)
						(proc851_0 @local19 @local188 0)
					)
				)
				(gEgo illegalBits: -32768)
				(= ticks 12)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance moveFromTheWall of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= local10 1)
				(proc13_4 1360 2 self)
			)
			(1
				(gEgo
					setMotion: PolyPath (gEgo x?) (- (gEgo y?) 10) self
				)
			)
			(2
				(proc0_4)
				(= local10 0)
				(self dispose:)
			)
		)
	)
)

(instance handLobb of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo lobb self)
			)
			(1
				(cond 
					((and (== global130 3) (gEgo has: 3)) (proc851_0 @local119 @local188 0 self))
					((and (== global130 9) (not (proc0_5 24))) (proc851_0 @local123 @local188 0 self))
					(else (proc851_0 @local127 @local188 0 self))
				)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance moveToRobin of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 gEgo lobb self)
			)
			(1 (proc0_9 lobb gEgo self))
			(2
				(if (== local0 0)
					(proc851_0 @local131 4 0 self)
				else
					(self cue:)
				)
			)
			(3
				(if (> (gEgo distanceTo: lobb) 30)
					(lobb
						setCycle: Walk
						setMotion: PolyPath (+ (gEgo x?) 30) (gEgo y?) self
					)
				else
					(self cue:)
				)
			)
			(4
				(if (== local0 0)
					(= local0 1)
					(proc851_0 @local135 4 @local188 self)
				else
					(proc851_0 @local143 @local188 0 self)
				)
			)
			(5 (proc0_4) (self dispose:))
		)
	)
)

(instance moveCloseAndAway of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(proc0_9 lobb gEgo self)
			)
			(1 (proc0_9 gEgo lobb self))
			(2
				(proc851_0 @local147 5 @local188 self)
			)
			(3
				(if (> (gEgo distanceTo: lobb) 30)
					(lobb
						setCycle: Walk
						setMotion: PolyPath (+ (gEgo x?) 30) (gEgo y?) self
					)
				else
					(self cue:)
				)
			)
			(4 (proc0_9 lobb gEgo self))
			(5
				(proc851_0 @local153 5 @local188 self)
			)
			(6 (proc0_4) (self dispose:))
		)
	)
)

(instance goBackRoom of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setCycle: Walk
					setMotion: PolyPath (- (lobb x?) 25) (+ (lobb y?) 5) self
				)
			)
			(1
				(lobb view: 362 setLoop: 0 setCel: 0 setCycle: End)
				(gEgo view: 39 setLoop: 0 setCel: 0 setCycle: End self)
			)
			(2
				(proc851_0 @local164 7 @local188 self)
				(proc806_1 25)
			)
			(3
				(lobb setCel: 0 setCycle: End self)
			)
			(4
				(lobb setHeading: 180)
				(= ticks 12)
			)
			(5
				(lobb
					view: 361
					setLoop: 2
					setCel: 0
					setCycle: Walk
					setMotion: PolyPath (lobb x?) 190
				)
				(gEgo
					view: 36
					setLoop: 2
					setCel: 0
					setCycle: Walk
					setMotion: PolyPath (gEgo x?) 180 self
				)
			)
			(6
				(proc0_6 8)
				(gEgo put: 3)
				(gClient newRoom: 370)
			)
		)
	)
)

(instance killRobinScript of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setMotion: PolyPath (- (lobb x?) 10) (lobb y?) self
				)
			)
			(1 (proc0_9 lobb gEgo self))
			(2
				(lobb view: 362 setLoop: 0 setCel: 0 setCycle: End)
				(gEgo view: 39 setLoop: 0 setCel: 0 setCycle: End self)
			)
			(3
				(lobb setLoop: 3 setCel: 1 setCycle: End self)
			)
			(4
				(proc851_0 @local171 7 @local188 self)
			)
			(5
				(lobb view: 362 setLoop: 1 setCel: 0 setCycle: End self)
			)
			(6
				(= global145 5)
				(gRgnMusic fade: 0 30 8 1)
				(gClient newRoom: 170)
			)
		)
	)
)
