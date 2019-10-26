;;; Sierra Script 1.0 - (do not remove this comment)
(script# 540)
(include sci.sh)
(use n000)
(use n013)
(use n541)
(use n806)
(use n851)
(use n941)
(use n946)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	rm540 0
)

(local
	local0 =  1
	[local1 32] = [107 156 203 0 120 153 185 0 133 150 165 0 100 115 131 0 163 179 195 0 129 145 160 0 109 142 174 0 92 140 188]
	[local33 32] = [132 124 116 0 118 113 107 0 104 101 99 0 99 96 93 0 87 84 81 0 82 79 76 0 74 69 63 0 64 57 50]
	[local65 31]
	[local96 63] = [1 5 18 0 5 13 17 0 9 5 16 0 13 25 13 0 17 5 17 0 14 25 21 0 13 17 25 0 12 25 29 28 0 0 0 13 1 5 0 20 8 8 0 28 14 20 0 10 18 2 0 22 22 10 0 25 29 17 0 30 30 2 -1]
	[local159 165] = [1794 1793 1792 -1 -1 -1 -1 1794 1793 -1 -1 -1 -1 -1 1794 -1 -1 -1 -1 -1 -1 1794 1538 1537 1536 -1 -1 -1 1794 1538 1537 -1 -1 -1 -1 1794 1538 -1 -1 -1 -1 -1 1794 1538 1282 1281 1280 -1 -1 1794 1538 1282 1281 -1 -1 -1 1794 1538 1282 -1 -1 -1 -1 1794 1538 1281 1025 1024 -1 -1 1794 1538 1282 1026 1025 -1 -1 1794 1538 1281 1026 -1 -1 -1 1794 1538 1282 1027 -1 -1 -1 1794 1538 1028 -1 -1 -1 -1 1794 1029 -1 -1 -1 -1 -1 1794 1538 1027 769 768 -1 -1 1794 1538 1027 769 -1 -1 -1 1794 1538 1027 770 -1 -1 -1 1794 1538 1027 769 512 -1 -1 1794 1538 1027 770 513 -1 -1 1794 1538 1028 514 -1 -1 -1 1794 1538 1282 768 512 256 -1 1794 1538 1028 513 257 -1 -1 1794 1029 258 -1]
	[local324 16] = [167 92 154 92 141 87 131 87 87 80 83 60 195 41 205 95]
	[local340 18] = [32 65 17 56 11 47 0 43 0 47 12 57 9 76 26 91 38 84]
	[local358 12] = [258 133 270 133 284 150 277 163 259 164 250 154]
	[local370 14] = [237 46 263 47 278 41 281 46 263 51 242 63 228 59]
	[local384 8] = [71 61 208 36 228 122 91 143]
	[local392 20] = [98 54 100 17 160 0 193 0 210 17 213 46 193 46 194 33 184 19 165 46]
	[local412 19] = [189 163 100 185 77 159 81 132 101 138 96 147 107 157 126 143 189 124]
	[local431 9] = [541 0 2 4 22 31 25 23 5]
	[local440 6] = [1540 0 1 1 1]
	[local446 4] = [1540 3 1]
	[local450 5] = [1540 4 2 1]
	[local455 5] = [1540 6 2 1]
	[local460 4] = [1540 8 1]
	[local464 5] = [1540 9 2 1]
	[local469 8] = [1540 11 1 2 1 2 1]
	[local477 4] = [1540 16 1]
	[local481 6] = [1540 17 1 2 2]
	[local487 4] = [1540 21 1]
	[local491 5] = [1540 22 2 1]
	[local496 5] = [1540 24 2 1]
	[local501 4] = [1540 26 1]
	[local505 11] = [1540 27 2 1 1 2 1 1 2 1]
	[local516 5] = [1540 35 2 1]
	[local521 11] = [1540 37 1 1 0 1540 39 1 1 1]
	[local532 5] = [1540 42 1 2]
	[local537 5] = [1540 44 2 1]
	[local542 12] = [1540 46 2 1 2 1 2 1 2 2 1]
	[local554 9] = [1540 55 2 1 2 1 1 1]
	[local563 5] = [1540 61 1 1]
	[local568 4] = [1540 64 1]
	[local572 16] = [1540 65 1 0 1540 66 1 0 1540 67 1 0 1540 68 1]
	[local588 4] = [1540 78 1]
	[local592 4] = [1540 79 1]
	[local596 4] = [1540 80 1]
	[local600 4] = [1540 81 1]
	[local604 4] = [1540 82 1]
	[local608 4] = [1540 83 1]
	[local612 4] = [1540 20 1]
	[local616 4] = [1540 86 1]
	[local620 4] = [1540 88 1]
	[local624 4] = [1540 90 1]
	[local628 4] = [1540 70 1]
	[local632 7] = [1534 23 1 2 1 1]
	[local639 4] = [1534 27 1]
	[local643 4] = [1534 29 1]
	local647
	local648
	local649
	local650
	[local651 9] = [80 87 92 96 85 99 85 78 89]
	[local660 9] = [90 81 91 109 99 122 109 75 118]
	[local669 9] = [207 202 212 207 207 218 215 196 212]
	[local678 9] = [58 68 73 95 82 99 88 56 107]
	[local687 9]
	[local696 9]
)
(instance rm540 of Rm
	(properties
		picture 540
		style $0064
		west 310
	)
	
	(method (init &tmp temp0)
		(asm
			pushi    0
			callb    proc0_3,  0
			lsg      global12
			ldi      550
			eq?     
			bnt      code_0022
			ldi      32774
			aTop     style
code_0022:
			pushi    #init
			pushi    0
			super    Rm,  4
			pushi    #points
			pushi    1
			lea      @local340
			push    
			lofsa    cat1Poly
			send     6
			pushi    #points
			pushi    1
			lea      @local358
			push    
			lofsa    cat2Poly
			send     6
			pushi    #points
			pushi    1
			lea      @local370
			push    
			lofsa    meatPoly
			send     6
			pushi    #points
			pushi    1
			lea      @local384
			push    
			lofsa    brdPoly
			send     6
			pushi    #points
			pushi    1
			lea      @local392
			push    
			lofsa    harryPoly
			send     6
			pushi    #points
			pushi    1
			lea      @local412
			push    
			lofsa    robPoly
			send     6
			pushi    #points
			pushi    1
			lea      @local324
			push    
			lofsa    halfBoard
			send     6
			pushi    #init
			pushi    0
			pushi    272
			pushi    1
			lofsa    brdPoly
			push    
			lofsa    board
			send     10
			pushi    #init
			pushi    0
			pushi    272
			pushi    1
			lofsa    cat1Poly
			push    
			lofsa    cat1
			send     10
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    Fwd
			push    
			pushi    142
			pushi    1
			lofsa    meow
			push    
			lofsa    tail
			send     16
			pushi    #init
			pushi    0
			pushi    272
			pushi    1
			lofsa    cat2Poly
			push    
			lofsa    cat2
			send     10
			pushi    #init
			pushi    0
			lofsa    mugFloor
			send     4
			pushi    #init
			pushi    0
			pushi    272
			pushi    1
			lofsa    harryPoly
			push    
			lofsa    harry
			send     10
			pushi    #init
			pushi    0
			pushi    272
			pushi    1
			lofsa    robPoly
			push    
			lofsa    rob
			send     10
			pushi    #init
			pushi    0
			lofsa    fish
			send     4
			pushi    #init
			pushi    0
			lofsa    bones
			send     4
			pushi    #init
			pushi    0
			pushi    272
			pushi    1
			lofsa    meatPoly
			push    
			lofsa    meat
			send     10
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    RandCycle
			push    
			lofsa    rHead
			send     10
			pushi    #init
			pushi    0
			pushi    150
			pushi    1
			class    RandCycle
			push    
			lofsa    hHead
			send     10
			pushi    #init
			pushi    0
			lofsa    floor
			send     4
			pushi    #message
			pushi    1
			pushi    11
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			ldi      0
			sat      temp0
code_0152:
			lst      temp0
			ldi      8
			le?     
			bnt      code_01a1
			pushi    284
			pushi    #-info-
			lat      temp0
			lsli     local669
			lsli     local678
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    piece
			send     4
			push    
			lat      temp0
			sali     local687
			send     12
			pushi    284
			pushi    #-info-
			lat      temp0
			lsli     local651
			lsli     local660
			pushi    7
			pushi    1
			pushi    1
			pushi    107
			pushi    0
			pushi    #new
			pushi    0
			lofsa    piece
			send     4
			push    
			lat      temp0
			sali     local696
			send     18
			+at      temp0
			jmp      code_0152
code_01a1:
			pushi    #init
			pushi    0
			lofsa    arm
			send     4
			pushi    #init
			pushi    0
			lofsa    cArm
			send     4
			pushi    #setScript
			pushi    1
			lofsa    offer
			push    
			self     6
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #dispose
			pushi    0
			super    Rm,  4
			pushi    1
			pushi    541
			callk    DisposeScript,  2
			ret     
		)
	)
)

(instance board of Feature
	(properties
		y 30
		lookStr 69
	)
	
	(method (handleEvent pEvent)
		(asm
			ldi      1
			aTop     description
			pushi    #script
			pushi    0
			lag      global2
			send     4
			bnt      code_023a
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			bnt      code_023a
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			lofsa    theMorris
			send     6
code_023a:
			not     
			bnt      code_024b
			ldi      0
			aTop     description
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
code_024b:
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
			ldi      3
			eq?     
			bnt      code_0273
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_0273
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
			jmp      code_02b5
code_0273:
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_029e
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			not     
			bnt      code_029e
			pushi    2
			lea      @local628
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_02b5
code_029e:
			lsp      theVerb
			ldi      3
			ne?     
			bt       code_02a9
			pToa     description
			not     
code_02a9:
			bnt      code_02b5
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			super    Feature,  6
code_02b5:
			ret     
		)
	)
)

(instance tail of Prop
	(properties
		x 271
		y 182
		view 542
		loop 9
		signal $1000
		cycleSpeed 60
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    cat2
			send     4
			ret     
		)
	)
)

(instance cat1 of Feature
	(properties
		lookStr 73
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_0390
			pushi    3
			pushi    1540
			pushi    91
			pushi    1
			calle    proc13_4,  6
			jmp      code_03be
code_0390:
			dup     
			ldi      5
			eq?     
			bnt      code_03b3
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    3
			pushi    1540
			pushi    94
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_03be
code_03b3:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_03be:
			toss    
			ret     
		)
	)
)

(instance cat2 of Feature
	(properties
		lookStr 75
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      3
			eq?     
			bnt      code_041c
			pushi    3
			pushi    1540
			pushi    91
			pushi    1
			calle    proc13_4,  6
			jmp      code_044a
code_041c:
			dup     
			ldi      5
			eq?     
			bnt      code_043f
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    3
			pushi    1540
			pushi    95
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_044a
code_043f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_044a:
			toss    
			ret     
		)
	)
)

(instance mugFloor of Feature
	(properties
		onMeCheck $1000
		lookStr 71
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_04a7
			pushi    3
			pushi    1540
			pushi    93
			pushi    1
			calle    proc13_4,  6
			jmp      code_04b2
code_04a7:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_04b2:
			ret     
		)
	)
)

(instance bones of Feature
	(properties
		onMeCheck $0010
		lookStr 76
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			ldi      3
			eq?     
			bnt      code_050f
			pushi    3
			pushi    1540
			pushi    92
			pushi    1
			calle    proc13_4,  6
			jmp      code_051a
code_050f:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_051a:
			ret     
		)
	)
)

(instance fish of Feature
	(properties
		onMeCheck $0100
		lookStr 76
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_0584
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    3
			pushi    540
			pushi    0
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_05a5
code_0584:
			dup     
			ldi      3
			eq?     
			bnt      code_059a
			pushi    3
			pushi    1540
			pushi    92
			pushi    1
			calle    proc13_4,  6
			jmp      code_05a5
code_059a:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_05a5:
			toss    
			ret     
		)
	)
)

(instance harry of Feature
	(properties
		lookStr 63
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_0653
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_061b
			pushi    3
			lea      @local516
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_090b
code_061b:
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			bnt      code_063d
			pushi    2
			lea      @local572
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_090b
code_063d:
			pushi    2
			lea      @local568
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_090b
code_0653:
			dup     
			ldi      4
			eq?     
			bnt      code_08ea
			lsp      param2
			dup     
			ldi      0
			eq?     
			bnt      code_0828
			pushi    #moves
			pushi    0
			lofsa    theMorris
			send     4
			not     
			bt       code_0688
			pushi    1
			pushi    186
			callb    proc0_5,  2
			not     
			bnt      code_06c2
			pushi    #moves
			pushi    0
			lofsa    theMorris
			send     4
			push    
			ldi      2
			le?     
code_0688:
			bnt      code_06c2
			pushi    #doit
			pushi    0
			lag      global152
			send     4
			bnt      code_06c1
			pushi    #taken
			pushi    0
			lag      global135
			send     4
			sal      local648
			pushi    #taken
			pushi    0
			lag      global134
			send     4
			sal      local649
			pushi    #taken
			pushi    0
			lag      global133
			send     4
			sal      local650
			pushi    #put
			pushi    0
			lag      global152
			send     4
			jmp      code_06c2
code_06c1:
			ret     
code_06c2:
			pushi    #script
			pushi    0
			lag      global2
			send     4
			not     
			bnt      code_06e8
			pushi    3
			lea      @local516
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_08e6
code_06e8:
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			bnt      code_076b
			pushi    1
			pushi    186
			callb    proc0_5,  2
			bnt      code_0718
			pushi    3
			lea      @local455
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_08e6
code_0718:
			pushi    #moves
			pushi    0
			lofsa    theMorris
			send     4
			push    
			ldi      2
			lt?     
			bnt      code_0751
			pushi    3
			lea      @local491
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			pushi    1
			pushi    186
			callb    proc0_6,  2
			pushi    1
			pushi    2
			calle    proc806_6,  2
			jmp      code_08e6
code_0751:
			pushi    3
			lea      @local496
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_08e6
code_076b:
			lsg      global12
			ldi      550
			ne?     
			bnt      code_07a7
			pushi    1
			pushi    186
			callb    proc0_6,  2
			pushi    #state
			pushi    1
			pushi    0
			pushi    133
			pushi    1
			pushi    0
			lofsa    offer
			send     12
			pushi    4
			lea      @local450
			push    
			lea      @local431
			push    
			pushi    999
			lofsa    offer
			push    
			calle    proc851_0,  8
			jmp      code_08e6
code_07a7:
			pushi    1
			pushi    186
			callb    proc0_5,  2
			bnt      code_07e9
			pushi    32
			pushi    #superClass
			pushi    #state
			pushi    0
			lofsa    offer
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    133
			pushi    1
			pushi    0
			lofsa    offer
			send     12
			pushi    4
			lea      @local464
			push    
			lea      @local431
			push    
			pushi    999
			lofsa    offer
			push    
			calle    proc851_0,  8
			jmp      code_08e6
code_07e9:
			pushi    1
			pushi    186
			callb    proc0_6,  2
			pushi    32
			pushi    #superClass
			pushi    #state
			pushi    0
			lofsa    offer
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    133
			pushi    1
			pushi    0
			lofsa    offer
			send     12
			pushi    4
			lea      @local481
			push    
			lea      @local431
			push    
			pushi    999
			lofsa    offer
			push    
			calle    proc851_0,  8
			jmp      code_08e6
code_0828:
			dup     
			ldi      18
			eq?     
			bnt      code_083e
			pushi    #setScript
			pushi    1
			lofsa    pissOff
			push    
			lag      global2
			send     6
			jmp      code_08e6
code_083e:
			dup     
			ldi      2
			eq?     
			bnt      code_0880
			lal      local647
			bnt      code_0861
			pushi    2
			lea      @local563
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_08e6
code_0861:
			pushi    3
			lea      @local554
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			ldi      1
			sal      local647
			jmp      code_08e6
code_0880:
			dup     
			ldi      11
			eq?     
			bnt      code_08a1
			pushi    3
			lea      @local632
			push    
			lea      @local431
			push    
			pushi    999
			calle    proc851_0,  6
			jmp      code_08e6
code_08a1:
			dup     
			ldi      14
			eq?     
			bnt      code_08be
			pushi    2
			lea      @local639
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_08e6
code_08be:
			dup     
			ldi      13
			eq?     
			bnt      code_08db
			pushi    2
			lea      @local643
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_08e6
code_08db:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_08e6:
			toss    
			jmp      code_090b
code_08ea:
			dup     
			ldi      3
			eq?     
			bnt      code_0900
			pushi    3
			pushi    1540
			pushi    84
			pushi    1
			calle    proc13_4,  6
			jmp      code_090b
code_0900:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Feature,  8
code_090b:
			toss    
			ret     
		)
	)
)

(instance pissOff of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_097d
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local542
			push    
			lea      @local431
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_0995
code_097d:
			dup     
			ldi      1
			eq?     
			bnt      code_0995
			pushi    1
			pushi    124
			callb    proc0_6,  2
			pushi    #newRoom
			pushi    1
			pushi    530
			lag      global2
			send     6
code_0995:
			toss    
			ret     
		)
	)
)

(instance meat of Feature
	(properties
		lookStr 77
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      5
			eq?     
			bnt      code_09f6
			pushi    1
			pushi    32
			calle    proc13_6,  2
			pushi    3
			pushi    540
			pushi    1
			pushi    1
			calle    proc13_4,  6
			pushi    1
			pushi    0
			calle    proc13_6,  2
			jmp      code_0a17
code_09f6:
			dup     
			ldi      3
			eq?     
			bnt      code_0a0c
			pushi    3
			pushi    1540
			pushi    92
			pushi    1
			calle    proc13_4,  6
			jmp      code_0a17
code_0a0c:
			pushi    #doVerb
			pushi    1
			lsp      theVerb
			&rest    param2
			super    Feature,  6
code_0a17:
			toss    
			ret     
		)
	)
)

(instance rob of Feature
	(properties)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lag      global0
			send     4
			ret     
		)
	)
)

(instance rHead of Prop
	(properties
		x 168
		y 20
		z -150
		view 542
		priority 14
		signal $4010
		cycleSpeed 540
	)
	
	(method (onMe)
		(asm
			ldi      0
			ret     
		)
	)
)

(instance hHead of Prop
	(properties
		x 139
		y 8
		view 543
		priority 13
		signal $4010
		cycleSpeed 200
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    harry
			send     4
			ret     
		)
	)
)

(instance floor of Feature
	(properties
		onMeCheck $0001
		lookStr 76
	)
	
	(method (handleEvent pEvent)
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			not     
			bnt      code_0c13
			pushi    #message
			pushi    0
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			send     4
			push    
			ldi      11
			eq?     
			bnt      code_0c0a
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			pushi    #message
			pushi    1
			pushi    1
			pushi    #at
			pushi    1
			pushi    0
			lag      global69
			send     6
			send     6
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			bnt      code_0bfc
			pushi    #get
			pushi    1
			lsl      local648
			lag      global135
			send     6
			pushi    #get
			pushi    1
			lsl      local649
			lag      global134
			send     6
			pushi    #get
			pushi    1
			lsl      local650
			lag      global133
			send     6
code_0bfc:
			pushi    #newRoom
			pushi    1
			pushi    530
			lag      global2
			send     6
			jmp      code_0c13
code_0c0a:
			pushi    #handleEvent
			pushi    1
			lsp      pEvent
			super    Feature,  6
code_0c13:
			ret     
		)
	)
)

(instance meow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0c73
			pushi    2
			pushi    520
			pushi    720
			callk    Random,  4
			aTop     ticks
			jmp      code_0c98
code_0c73:
			dup     
			ldi      1
			eq?     
			bnt      code_0c98
			pushi    #number
			pushi    1
			pushi    2
			pushi    354
			pushi    355
			callk    Random,  4
			push    
			pushi    42
			pushi    0
			lofsa    catSound
			send     10
			ldi      65535
			aTop     state
			ldi      1
			aTop     cycles
code_0c98:
			toss    
			ret     
		)
	)
)

(instance brdPoly of Polygon
	(properties
		size 4
	)
)

(instance cat1Poly of Polygon
	(properties
		size 9
	)
)

(instance cat2Poly of Polygon
	(properties
		size 6
	)
)

(instance meatPoly of Polygon
	(properties
		size 7
	)
)

(instance harryPoly of Polygon
	(properties
		size 10
	)
)

(instance robPoly of Polygon
	(properties
		size 9
	)
)

(instance halfBoard of Polygon
	(properties
		size 8
	)
)

(instance offer of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0dd7
			lsg      global12
			ldi      550
			ne?     
			bnt      code_0dd0
			pTos     state
			ldi      3
			add     
			aTop     state
code_0dd0:
			ldi      1
			aTop     cycles
			jmp      code_1066
code_0dd7:
			dup     
			ldi      1
			eq?     
			bnt      code_0df7
			pushi    4
			lea      @local612
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1066
code_0df7:
			dup     
			ldi      2
			eq?     
			bnt      code_0e0c
			pushi    #setScript
			pushi    2
			lofsa    theMorris
			push    
			pushSelf
			self     8
			jmp      code_1066
code_0e0c:
			dup     
			ldi      3
			eq?     
			bnt      code_0ec8
			pushi    #moves
			pushi    1
			pushi    0
			lofsa    theMorris
			send     6
			pushi    1
			pushi    186
			callb    proc0_5,  2
			bnt      code_0e86
			lal      local0
			bnt      code_0e4c
			pTos     state
			ldi      4
			add     
			aTop     state
			pushi    4
			lea      @local501
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_0ec0
code_0e4c:
			pushi    4
			lea      @local521
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pushi    #get
			pushi    1
			lsl      local648
			lag      global135
			send     6
			pushi    #get
			pushi    1
			lsl      local649
			lag      global134
			send     6
			pushi    #get
			pushi    1
			lsl      local650
			lag      global133
			send     6
			jmp      code_0ec0
code_0e86:
			lal      local0
			bnt      code_0ea7
			pushi    5
			lea      @local532
			push    
			lea      @local431
			push    
			pushi    999
			pushSelf
			pushi    0
			calle    proc851_0,  10
			jmp      code_0ec0
code_0ea7:
			pushi    5
			lea      @local537
			push    
			lea      @local431
			push    
			pushi    999
			pushSelf
			pushi    0
			calle    proc851_0,  10
code_0ec0:
			ldi      550
			sag      global12
			jmp      code_1066
code_0ec8:
			dup     
			ldi      4
			eq?     
			bnt      code_0f1d
			pushi    1
			pushi    186
			callb    proc0_5,  2
			bnt      code_0ee0
			ldi      1
			aTop     cycles
			jmp      code_1066
code_0ee0:
			lsg      global12
			ldi      550
			eq?     
			bnt      code_0f04
			pushi    4
			lea      @local469
			push    
			lea      @local431
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_1066
code_0f04:
			pushi    4
			lea      @local440
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1066
code_0f1d:
			dup     
			ldi      5
			eq?     
			bnt      code_0f37
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    1
			calle    proc806_6,  2
			ldi      15
			aTop     seconds
			jmp      code_1066
code_0f37:
			dup     
			ldi      6
			eq?     
			bnt      code_0fac
			pushi    0
			callb    proc0_3,  0
			pushi    1
			pushi    186
			callb    proc0_5,  2
			bnt      code_0f6c
			pTos     state
			ldi      2
			sub     
			aTop     state
			pushi    4
			lea      @local460
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1066
code_0f6c:
			lsg      global12
			ldi      550
			eq?     
			bnt      code_0f8e
			pushi    4
			lea      @local477
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			jmp      code_1066
code_0f8e:
			pushi    5
			lea      @local446
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			pushi    0
			calle    proc851_0,  10
			ldi      0
			aTop     state
			jmp      code_1066
code_0fac:
			dup     
			ldi      7
			eq?     
			bnt      code_0fbb
			ldi      550
			sag      global11
			jmp      code_1066
code_0fbb:
			dup     
			ldi      8
			eq?     
			bnt      code_0fdc
			pushi    150
			pushi    #y
			class    ATo
			push    
			lea      @local159
			push    
			ldi      154
			add     
			push    
			pushSelf
			lofsa    cArm
			send     10
			jmp      code_1066
code_0fdc:
			dup     
			ldi      9
			eq?     
			bnt      code_1011
			pushi    #get
			pushi    1
			pushi    14
			lag      global0
			send     6
			pushi    1
			pushi    50
			calle    proc806_1,  2
			pushi    6
			lofsa    {LOOKUP\_ERROR}
			push    
			pushi    82
			pushi    771
			pushi    0
			pushi    9
			pushi    108
			calle    proc13_0,  12
			ldi      4
			aTop     seconds
			jmp      code_1066
code_1011:
			dup     
			ldi      10
			eq?     
			bnt      code_1034
			pushi    150
			pushi    #x
			class    ATo
			push    
			lea      @local159
			push    
			ldi      154
			add     
			push    
			pushi    65535
			pushSelf
			lofsa    cArm
			send     12
			jmp      code_1066
code_1034:
			dup     
			ldi      11
			eq?     
			bnt      code_1056
			pushi    4
			lea      @local505
			push    
			lea      @local431
			push    
			pushi    999
			pushSelf
			calle    proc851_0,  8
			jmp      code_1066
code_1056:
			dup     
			ldi      12
			eq?     
			bnt      code_1066
			pushi    #dispose
			pushi    0
			self     4
			pushi    0
			callb    proc0_4,  0
code_1066:
			toss    
			ret     
		)
	)
)

(instance piece of Prop
	(properties
		lookStr 69
		view 542
		loop 10
		priority 3
		signal $5110
	)
	
	(method (doVerb theVerb param2)
		(asm
			lsp      theVerb
			dup     
			ldi      2
			eq?     
			bnt      code_10f3
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			bnt      code_10c6
			pushi    3
			pushi    1540
			pushi    87
			pushi    1
			calle    proc13_4,  6
			jmp      code_118c
code_10c6:
			pushi    #state
			pushi    0
			lofsa    theMorris
			send     4
			push    
			ldi      65535
			ne?     
			bnt      code_10e4
			pushi    3
			pushi    1540
			pushi    89
			pushi    1
			calle    proc13_4,  6
			jmp      code_118c
code_10e4:
			pushi    3
			pushi    1540
			pushi    85
			pushi    1
			calle    proc13_4,  6
			jmp      code_118c
code_10f3:
			dup     
			ldi      3
			eq?     
			bnt      code_1181
			pushi    #script
			pushi    0
			lofsa    offer
			send     4
			bnt      code_1146
			pToa     noun
			bnt      code_1130
			pushi    #handleEvent
			pushi    1
			pushi    #x
			pushi    1
			pTos     x
			pushi    3
			pushi    1
			pTos     y
			pushi    76
			pushi    1
			pushi    0
			pushi    #curEvent
			pushi    0
			class    User
			send     4
			send     18
			push    
			lofsa    theMorris
			send     6
			jmp      code_118c
code_1130:
			pushi    2
			lea      @local620
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_118c
code_1146:
			pushi    #state
			pushi    0
			lofsa    theMorris
			send     4
			push    
			ldi      65535
			ne?     
			bnt      code_116b
			pushi    2
			lea      @local624
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_118c
code_116b:
			pushi    2
			lea      @local616
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_118c
code_1181:
			pushi    #doVerb
			pushi    2
			lsp      theVerb
			lsp      param2
			super    Prop,  8
code_118c:
			toss    
			ret     
		)
	)
)

(instance arm of Prop
	(properties
		x 196
		y 20
		z -121
		view 542
		loop 8
		priority 10
		signal $5010
		cycleSpeed 0
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lag      global0
			send     4
			ret     
		)
	)
)

(instance cArm of Prop
	(properties
		x 102
		y 8
		z -32
		view 543
		loop 8
		priority 10
		signal $5010
		cycleSpeed 0
	)
	
	(method (doVerb theVerb)
		(asm
			pushi    #doVerb
			pushi    0
			&rest    theVerb
			lofsa    harry
			send     4
			ret     
		)
	)
)

(instance theMorris of Morris
	(properties)
	
	(method (dispose param1)
		(asm
			lsl      local0
			ldi      32768
			eq?     
			bt       code_1827
			pTos     us
			ldi      2
			le?     
code_1827:
			sal      local0
			pushi    #dispose
			pushi    0
			&rest    param1
			super    Morris,  4
			ret     
		)
	)
	
	(method (changeState newState &tmp [temp0 100] temp100 temp101 temp102 temp103)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_1327
			pushi    #init
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			lofsa    arm
			send     10
			ldi      9
			aTop     them
			aTop     us
			pushi    #setCursor
			pushi    2
			lsg      global20
			pushi    0
			callk    HaveMouse,  0
			push    
			lag      global1
			send     8
			ldi      1
			aTop     cycles
			jmp      code_1817
code_1327:
			dup     
			ldi      1
			eq?     
			bnt      code_1359
			pTos     moves
			ldi      18
			lt?     
			bnt      code_134a
			pTos     moves
			ldi      2
			div     
			lali     local687
			aTop     register
			pushi    #setCel
			pushi    1
			pushi    0
			lofsa    arm
			send     6
code_134a:
			ldi      65516
			aTop     doTake
			aTop     doTo
			aTop     doFrom
			ldi      1
			aTop     cycles
			jmp      code_1817
code_1359:
			dup     
			ldi      2
			eq?     
			bnt      code_1373
			pushi    0
			callb    proc0_4,  0
			pushi    1
			pushi    2
			calle    proc806_6,  2
			ldi      50
			aTop     seconds
			jmp      code_1817
code_1373:
			dup     
			ldi      3
			eq?     
			bnt      code_1401
			pToa     seconds
			bnt      code_1386
			ldi      0
			aTop     seconds
			jmp      code_13a8
code_1386:
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local487
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pTos     state
			ldi      2
			sub     
			aTop     state
			ret     
code_13a8:
			pTos     moves
			ldi      18
			lt?     
			bnt      code_13dc
			pushi    #hide
			pushi    0
			pToa     register
			send     4
			pushi    150
			pushi    3
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    #y
			pushi    1
			pToa     doTo
			add     
			mul     
			push    
			ldi      4
			div     
			mul     
			add     
			push    
			pushSelf
			lofsa    arm
			send     10
			jmp      code_1817
code_13dc:
			pushi    150
			pushi    3
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    #y
			pushi    1
			pToa     doFrom
			add     
			mul     
			push    
			ldi      4
			div     
			mul     
			add     
			push    
			pushSelf
			lofsa    arm
			send     10
			jmp      code_1817
code_1401:
			dup     
			ldi      4
			eq?     
			bnt      code_145b
			pushi    150
			pushi    4
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    #y
			pushi    1
			pToa     doTo
			add     
			mul     
			push    
			ldi      4
			div     
			mul     
			add     
			push    
			pushi    65535
			pushSelf
			lofsa    arm
			send     12
			pTos     moves
			ldi      18
			lt?     
			bnt      code_143c
			pushi    #play
			pushi    0
			lofsa    clickSound
			send     4
code_143c:
			pushi    1
			pushi    #cycleSpeed
			pushi    0
			lofsa    arm
			send     4
			add     
			aTop     ticks
			pTos     moves
			ldi      18
			ge?     
			bnt      code_1817
			pushi    #hide
			pushi    0
			pToa     register
			send     4
			jmp      code_1817
code_145b:
			dup     
			ldi      5
			eq?     
			bnt      code_1495
			pushi    #show
			pushi    0
			pushi    284
			pushi    2
			pToa     doTo
			lsli     local1
			lsli     local33
			pushi    269
			pushi    1
			pushi    1
			pushi    66
			pushi    1
			pushi    65535
			pToa     register
			send     24
			pTos     moves
			ldi      18
			ge?     
			bnt      code_148e
			pushi    #play
			pushi    0
			lofsa    clickSound
			send     4
code_148e:
			ldi      0
			aTop     register
			jmp      code_1817
code_1495:
			dup     
			ldi      6
			eq?     
			bnt      code_14fc
			pToa     usThreat
			sat      temp100
			pToa     usMills
			sat      temp101
			pToa     themThreat
			sat      temp102
			pToa     themMills
			sat      temp103
			ldi      65516
			aTop     doTake
			pushi    #doMove
			pushi    2
			pushi    16
			pushi    1
			self     8
			pushi    #inMill
			pushi    1
			pTos     doTo
			self     6
			not     
			bnt      code_14cc
			pTos     state
			ldi      3
			add     
			aTop     state
code_14cc:
			pushi    #unDoMove
			pushi    2
			pushi    16
			pushi    1
			self     8
			lat      temp100
			aTop     usThreat
			lat      temp101
			aTop     usMills
			lat      temp102
			aTop     themThreat
			lat      temp103
			aTop     themMills
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    8
			lofsa    arm
			send     12
			ldi      1
			aTop     cycles
			jmp      code_1817
code_14fc:
			dup     
			ldi      7
			eq?     
			bnt      code_151f
			pushi    0
			callb    proc0_4,  0
			pushi    #curIcon
			pushi    1
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			push    
			lag      global69
			send     6
			ldi      30
			aTop     seconds
			jmp      code_1817
code_151f:
			dup     
			ldi      8
			eq?     
			bnt      code_1578
			pToa     seconds
			bnt      code_1554
			ldi      0
			aTop     seconds
			pushi    150
			pushi    3
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    #y
			pushi    1
			pToa     doTake
			add     
			mul     
			push    
			ldi      4
			div     
			mul     
			add     
			push    
			pushSelf
			lofsa    arm
			send     10
			jmp      code_1817
code_1554:
			pushi    0
			callb    proc0_3,  0
			pushi    4
			lea      @local487
			push    
			lea      @local431
			push    
			pushi    0
			pushSelf
			calle    proc851_0,  8
			pTos     state
			ldi      2
			sub     
			aTop     state
			jmp      code_1817
code_1578:
			dup     
			ldi      9
			eq?     
			bnt      code_15b4
			pushi    #dispose
			pushi    0
			pToa     doTake
			lali     local65
			send     4
			pushi    0
			pToa     doTake
			sali     local65
			pushi    150
			pushi    4
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    #y
			pushi    1
			pToa     doTake
			add     
			mul     
			push    
			ldi      4
			div     
			mul     
			add     
			push    
			pushi    65535
			pushSelf
			lofsa    arm
			send     12
			jmp      code_1817
code_15b4:
			dup     
			ldi      10
			eq?     
			bnt      code_15d2
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    8
			lofsa    arm
			send     12
			ldi      2
			aTop     cycles
			jmp      code_1817
code_15d2:
			dup     
			ldi      11
			eq?     
			bnt      code_16c9
			pushi    #doMove
			pushi    2
			pushi    16
			pushi    1
			self     8
			pTos     us
			ldi      2
			le?     
			bnt      code_15f0
			pushi    #dispose
			pushi    0
			self     4
			ret     
code_15f0:
			pTos     moves
			ldi      18
			ge?     
			bnt      code_15fc
			ldi      3
			aTop     scan
code_15fc:
			pTos     moves
			ldi      1
			eq?     
			bnt      code_1617
			pTos     doTo
			pushi    31
			pushi    2
			pushi    0
			pushi    1
			callk    Random,  4
			mul     
			add     
			lali     local96
			aTop     doTo
			jmp      code_1629
code_1617:
			pushi    #minimax
			pushi    5
			pTos     scan
			pushi    0
			pushi    1
			pushi    16
			pushi    32767
			self     14
			sal      local0
code_1629:
			pTos     doTo
			ldi      65516
			eq?     
			bnt      code_1637
			pushi    #dispose
			pushi    0
			self     4
			ret     
code_1637:
			pushi    #doMove
			pushi    2
			pushi    1
			pushi    16
			self     8
			pushi    #lowerize
			pushi    1
			pTos     doFrom
			self     6
			aTop     doFrom
			pushi    #lowerize
			pushi    1
			pTos     doTo
			self     6
			aTop     doTo
			pushi    #lowerize
			pushi    1
			pTos     doTake
			self     6
			aTop     doTake
			pTos     moves
			ldi      18
			le?     
			bnt      code_16a1
			pushi    105
			pushi    0
			pTos     moves
			ldi      2
			div     
			push    
			ldi      1
			sub     
			lali     local696
			aTop     register
			send     4
			pushi    150
			pushi    3
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    23
			pushi    #y
			pushi    1
			pToa     doTo
			add     
			mul     
			push    
			ldi      4
			div     
			sub     
			mul     
			add     
			push    
			pushSelf
			lofsa    cArm
			send     10
			jmp      code_1817
code_16a1:
			pushi    150
			pushi    3
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    23
			pushi    #y
			pushi    1
			pToa     doFrom
			add     
			mul     
			push    
			ldi      4
			div     
			sub     
			mul     
			add     
			push    
			pushSelf
			lofsa    cArm
			send     10
			jmp      code_1817
code_16c9:
			dup     
			ldi      12
			eq?     
			bnt      code_1717
			pushi    150
			pushi    4
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    23
			pushi    #y
			pushi    1
			pToa     doTo
			add     
			mul     
			push    
			ldi      4
			div     
			sub     
			mul     
			add     
			push    
			pushi    65535
			pushSelf
			lofsa    cArm
			send     12
			pTos     moves
			ldi      18
			le?     
			bnt      code_1707
			pushi    #play
			pushi    0
			lofsa    clickSound
			send     4
code_1707:
			pushi    1
			pushi    #cycleSpeed
			pushi    0
			lofsa    cArm
			send     4
			add     
			aTop     cycles
			jmp      code_1817
code_1717:
			dup     
			ldi      13
			eq?     
			bnt      code_1760
			pTos     moves
			ldi      18
			le?     
			bnt      code_173a
			pushi    269
			pushi    #superClass
			pushi    1
			pushi    194
			pushi    0
			pTos     register
			pToa     doTo
			sali     local65
			send     10
			jmp      code_174f
code_173a:
			pushi    #play
			pushi    0
			lofsa    clickSound
			send     4
			pToa     doFrom
			lsli     local65
			pToa     doTo
			sali     local65
			pushi    0
			pToa     doFrom
			sali     local65
code_174f:
			pushi    #posn
			pushi    2
			pToa     doTo
			lsli     local1
			lsli     local33
			lali     local65
			send     8
			jmp      code_1817
code_1760:
			dup     
			ldi      14
			eq?     
			bnt      code_17a0
			pTos     doTake
			ldi      65516
			eq?     
			bnt      code_1778
			ipToa    state
			ldi      1
			aTop     cycles
			jmp      code_1817
code_1778:
			pushi    150
			pushi    3
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    23
			pushi    #y
			pushi    1
			pToa     doTake
			add     
			mul     
			push    
			ldi      4
			div     
			sub     
			mul     
			add     
			push    
			pushSelf
			lofsa    cArm
			send     10
			jmp      code_1817
code_17a0:
			dup     
			ldi      15
			eq?     
			bnt      code_17df
			pushi    #dispose
			pushi    0
			pToa     doTake
			lali     local65
			send     4
			pushi    0
			pToa     doTake
			sali     local65
			pushi    150
			pushi    4
			class    ATo
			push    
			lea      @local159
			push    
			pushi    14
			pushi    23
			pushi    #y
			pushi    1
			pToa     doTake
			add     
			mul     
			push    
			ldi      4
			div     
			sub     
			mul     
			add     
			push    
			pushi    65535
			pushSelf
			lofsa    cArm
			send     12
			jmp      code_1817
code_17df:
			dup     
			ldi      16
			eq?     
			bnt      code_1817
			pushi    #setCel
			pushi    1
			pushi    0
			pushi    162
			pushi    1
			pushi    8
			lofsa    cArm
			send     12
			pTos     them
			ldi      2
			gt?     
			bnt      code_1812
			lsl      local0
			ldi      32767
			ne?     
			bnt      code_1812
			ldi      0
			aTop     state
			ldi      1
			aTop     cycles
			jmp      code_1817
code_1812:
			pushi    #dispose
			pushi    0
			self     4
code_1817:
			toss    
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 [temp2 3])
		(asm
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			bnt      code_183f
			ret     
code_183f:
			pTos     state
			ldi      2
			eq?     
			bt       code_184c
			pTos     state
			ldi      7
			eq?     
code_184c:
			bnt      code_1a6b
			pushi    3
			pushi    4
			dup     
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			callk    OnControl,  6
			sat      temp0
			push    
			ldi      61166
			and     
			bnt      code_1a6b
			pushi    #curIcon
			pushi    0
			lag      global69
			send     4
			push    
			pushi    #at
			pushi    1
			pushi    2
			lag      global69
			send     6
			eq?     
			bnt      code_1a6b
			pushi    #claimed
			pushi    1
			pushi    1
			lap      pEvent
			send     6
			ldi      65535
			sat      temp1
code_1890:
			lst      temp0
			ldi      1
			and     
			not     
			bnt      code_18ad
			lst      temp1
			ldi      16
			lt?     
			bnt      code_18ad
			+at      temp1
			lst      temp0
			ldi      1
			shr     
			sat      temp0
			jmp      code_1890
code_18ad:
			lat      temp1
			sat      temp0
			pushi    3
			pushi    #x
			pushi    0
			lap      pEvent
			send     4
			push    
			pushi    #y
			pushi    0
			lap      pEvent
			send     4
			push    
			lofsa    halfBoard
			push    
			callk    AvoidPath,  6
			bnt      code_18d4
			lst      temp0
			ldi      16
			add     
			sat      temp0
code_18d4:
			pTos     moves
			ldi      18
			lt?     
			bt       code_18e1
			pTos     doFrom
			ldi      65516
			ne?     
code_18e1:
			bnt      code_19fd
			pTos     doTo
			ldi      65516
			ne?     
			bnt      code_1967
			pushi    1
			lat      temp0
			lsli     local65
			callk    IsObject,  2
			not     
			bnt      code_190e
			pushi    2
			lea      @local588
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_190e:
			pushi    #cel
			pushi    0
			lat      temp0
			lali     local65
			send     4
			not     
			bnt      code_1931
			pushi    2
			lea      @local592
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_1931:
			pushi    #isValid
			pushi    3
			pTos     doFrom
			pTos     doTo
			lst      temp0
			self     10
			not     
			bnt      code_1958
			pushi    2
			lea      @local596
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_1958:
			lat      temp0
			aTop     doTake
			ldi      1
			aTop     cycles
			pushi    0
			callb    proc0_3,  0
			jmp      code_1a6b
code_1967:
			pushi    1
			lat      temp0
			lsli     local65
			callk    IsObject,  2
			bnt      code_1988
			pushi    2
			lea      @local600
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_1988:
			pushi    #isValid
			pushi    3
			pTos     doFrom
			lst      temp0
			pushi    65516
			self     10
			bt       code_199d
			lst      temp0
			pToa     doFrom
			eq?     
code_199d:
			bnt      code_19e2
			pTos     register
			lat      temp0
			sali     local65
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pToa     register
			send     4
			push    
			ldi      256
			or      
			push    
			pushi    150
			pushi    1
			pushi    0
			pushi    288
			pushi    1
			pushi    0
			pToa     register
			send     18
			lst      temp0
			pToa     doFrom
			eq?     
			bnt      code_19d3
			ldi      65516
			aTop     doFrom
			jmp      code_1a6b
code_19d3:
			lat      temp0
			aTop     doTo
			ldi      1
			aTop     cycles
			pushi    0
			callb    proc0_3,  0
			jmp      code_1a6b
code_19e2:
			ldi      1
			bnt      code_1a6b
			pushi    2
			lea      @local604
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_19fd:
			pushi    1
			lat      temp0
			lsli     local65
			callk    IsObject,  2
			not     
			bnt      code_1a1f
			pushi    2
			lea      @local588
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_1a1f:
			pushi    #cel
			pushi    0
			lat      temp0
			lali     local65
			send     4
			bnt      code_1a41
			pushi    2
			lea      @local608
			push    
			lea      @local431
			push    
			calle    proc851_0,  4
			jmp      code_1a6b
code_1a41:
			lat      temp0
			aTop     doFrom
			pToa     doFrom
			lali     local65
			aTop     register
			pushi    0
			pToa     doFrom
			sali     local65
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pToa     register
			send     4
			push    
			ldi      65279
			and     
			push    
			pushi    150
			pushi    1
			class    Fwd
			push    
			pToa     register
			send     12
code_1a6b:
			pushi    #claimed
			pushi    0
			lap      pEvent
			send     4
			ret     
		)
	)
)

(class ATo of CT
	(properties
		client 0
		caller 0
		cycleDir 1
		cycleCnt 0
		completed 0
		endCel -1
		pnts 0
	)
	
	(method (init param1 param2 param3 param4 &tmp temp0)
		(asm
			lap      param1
			aTop     client
			lap      param2
			aTop     pnts
			lsp      argc
			ldi      3
			ge?     
			bnt      code_1b1b
			pushi    1
			lsp      param3
			callk    IsObject,  2
			bnt      code_1aee
			lap      param3
			aTop     caller
			jmp      code_1b1b
code_1aee:
			lap      param3
			aTop     cycleDir
			push    
			ldi      0
			lt?     
			bnt      code_1b0f
code_1af9:
			pushi    2
			pTos     pnts
			ipToa    endCel
			push    
			calle    proc999_6,  4
			push    
			ldi      65535
			ne?     
			bnt      code_1b0f
			jmp      code_1af9
code_1b0f:
			lsp      argc
			ldi      4
			ge?     
			bnt      code_1b1b
			lap      param4
			aTop     caller
code_1b1b:
			ret     
		)
	)
	
	(method (doit &tmp temp0)
		(asm
			pushi    #cel
			pushi    0
			pToa     client
			send     4
			push    
			pushi    #nextCel
			pushi    0
			self     4
			eq?     
			bnt      code_1b31
			ret     
code_1b31:
			pushi    2
			pTos     pnts
			pTos     endCel
			pToa     cycleDir
			add     
			aTop     endCel
			push    
			calle    proc999_6,  4
			sat      temp0
			push    
			ldi      65535
			eq?     
			bnt      code_1b54
			pushi    #cycleDone
			pushi    0
			self     4
			jmp      code_1b74
code_1b54:
			pushi    7
			pushi    #superClass
			lst      temp0
			ldi      255
			and     
			push    
			pToa     client
			send     6
			pushi    6
			pushi    1
			lst      temp0
			ldi      8
			shr     
			push    
			ldi      255
			and     
			push    
			pToa     client
			send     6
code_1b74:
			ret     
		)
	)
)

(instance clickSound of Sound
	(properties
		flags $0001
		number 533
	)
)

(instance catSound of Sound
	(properties
		flags $0001
	)
)
