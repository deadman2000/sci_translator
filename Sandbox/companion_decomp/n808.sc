;;; Sierra Script 1.0 - (do not remove this comment)
(script# 808)
(include sci.sh)
(use n000)
(use n255)
(use n933)
(use n958)
(use n996)
(use n999)

(public
	initGame 0
	startUpRoom 1
)

(instance initGame of Code
	(properties)
	
	(method (doit param1 param2 param3 &tmp temp0 temp1 temp2 [temp3 20])
		(asm
			ldi      1
			sag      global102
			pushi    #color
			pushi    1
			lsg      gColor
			pushi    29
			pushi    1
			lsg      global186
			lap      param1
			send     12
			lap      param1
			sag      global38
			ldi      31
			sag      global138
			ldi      300
			sag      global139
			ldi      7325
			sag      global16
			ldi      1
			sag      global34
			lag      global102
			bnt      code_004d
			pushi    2
			lea      @global42
			push    
			lofsa    {LOOKUP\_ERROR}
			push    
			callk    StrCpy,  4
code_004d:
			class    PseudoMouse
			sag      global77
			ldi      30
			sag      global79
			pushi    #alterEgo
			pushi    1
			lsg      gEgo
			class    User
			send     6
			pushi    4
			pushi    128
			pushi    950
			pushi    900
			pushi    781
			calle    proc958_0,  8
			pushi    #setCursor
			pushi    4
			lsg      global19
			pushi    1
			pushi    304
			pushi    172
			lag      global1
			send     12
			ldi      300
			sag      global22
			lofsa    {x.yyy.zzz}
			sag      global27
			pushi    3
			pushi    0
			lofsa    {version}
			push    
			pushi    1
			callk    FileIO,  6
			sat      temp0
			pushi    4
			pushi    5
			lsg      global27
			pushi    11
			push    
			callk    FileIO,  8
			pushi    2
			pushi    1
			lst      temp0
			callk    FileIO,  4
			pushi    1
			pushi    3
			callk    DoSound,  2
			sag      global103
			pushi    1
			pushi    2
			callk    Graph,  2
			sat      temp1
			pushi    2
			le?     
			bnt      code_00d2
			pprev   
			ldi      16
			le?     
			bnt      code_00d2
			pushi    1
			pushi    0
			callb    proc0_7,  2
			jmp      code_00d7
code_00d2:
			pushi    1
			pushi    0
			callb    proc0_6,  2
code_00d7:
			pushi    #back
			pushi    1
			lsg      gColor
			pushi    345
			pushi    1
			lsg      gGColor
			pushi    346
			pushi    1
			lsg      gColor
			pushi    347
			pushi    1
			lsg      gGBack_2
			pushi    348
			pushi    1
			lsg      global189
			lap      param2
			send     30
			pushi    #back
			pushi    1
			lsg      gGBack
			pushi    345
			pushi    1
			lsg      gGColor
			pushi    346
			pushi    1
			lsg      gColor
			pushi    347
			pushi    1
			lsg      gGBack_2
			pushi    348
			pushi    1
			lsg      global189
			pushi    352
			pushi    1
			lsg      global170
			pushi    353
			pushi    1
			lsg      global193
			pushi    354
			pushi    1
			lsg      global192
			pushi    355
			pushi    1
			lsg      global194
			pushi    356
			pushi    1
			lsg      global191
			lap      param3
			send     60
			pushi    2
			pushi    0
			pushi    11
			callk    Random,  4
			sag      gRegister
			pushi    2
			pushi    22
			pushi    31
			callk    Random,  4
			sag      global140
			pushi    2
			pushi    0
			pushi    9
			callk    Random,  4
			sag      global144
			pushi    0
			callk    GameIsRestarting,  0
			bnt      code_0162
			ldi      140
			sag      global147
			jmp      code_022b
code_0162:
			pushi    4
			lea      @temp3
			push    
			pushi    808
			pushi    0
			pushi    799
			callk    Format,  8
			lag      global102
			bnt      code_0227
			pushi    2
			pushi    10
			lea      @temp3
			push    
			callk    FileIO,  4
			bnt      code_0227
			ldi      0
			sat      temp3
			ldi      0
			sat      temp2
code_018c:
			ldi      1
			bnt      code_022b
			pushi    22
			pushi    808
			pushi    1
			pushi    81
			lofsa    {Main Map}
			push    
			pushi    100
			pushi    81
			lofsa    { Cave_}
			push    
			pushi    140
			pushi    81
			lofsa    { Intro_}
			push    
			pushi    98
			pushi    81
			lofsa    { Move Ahead_}
			push    
			pushi    999
			pushi    81
			lofsa    {Restore}
			push    
			pushi    65535
			pushi    41
			lea      @temp3
			push    
			pushi    5
			pushi    35
			lsg      global38
			calle    proc255_0,  44
			sat      temp2
			lat      temp3
			bnt      code_01e2
			pushi    1
			lea      @temp3
			push    
			callk    ReadNumber,  2
			sat      temp2
code_01e2:
			lst      temp2
			ldi      999
			eq?     
			bnt      code_01fd
			pushi    #doit
			pushi    0
			pushi    1
			pushi    799
			callk    ScriptID,  2
			send     4
			jmp      code_022b
			jmp      code_018c
code_01fd:
			lst      temp2
			ldi      0
			gt?     
			bnt      code_020f
			lat      temp2
			sag      global147
			jmp      code_022b
			jmp      code_018c
code_020f:
			lst      temp2
			ldi      0
			lt?     
			bnt      code_018c
			pushi    #restore
			pushi    0
			lag      global1
			send     4
			jmp      code_022b
			jmp      code_018c
			jmp      code_022b
code_0227:
			ldi      98
			sag      global147
code_022b:
			pushi    #canInput
			pushi    1
			pushi    1
			pushi    282
			pushi    1
			pushi    1
			class    User
			send     12
			pushi    1
			pushi    940
			callk    DisposeScript,  2
			pushi    #newRoom
			pushi    1
			pushi    803
			lag      global1
			send     6
			ret     
		)
	)
)

(instance startUpRoom of Code
	(properties)
	
	(method (doit param1 &tmp [temp0 20])
		(if global77 (global77 stop:))
		(= gGEgoX (gEgo x?))
		(= gGEgoY (gEgo y?))
		(= gGEgoLoop (gEgo loop?))
		(= gGEgoEdgeHit ((User alterEgo?) edgeHit?))
		(proc0_7 110)
		(proc0_7 148)
		(proc958_0
			0
			12
			5
			181
			940
			13
			490
			800
			812
			969
			951
			807
			973
			928
			941
			939
			930
			927
			955
			953
			971
			974
			11
			15
			16
			851
			970
			806
			964
			855
			892
			991
			860
			852
			603
			891
			890
		)
		(Format @temp0 808 0 799)
		(if
			(and
				global102
				(FileIO 10 @temp0)
				(u> (MemoryInfo 1) (+ 10 (MemoryInfo 0)))
				(proc255_0 808 2 81 {Who cares} 0 81 {Debug} 1)
			)
			(SetDebug)
		)
		(if (and (== global130 11) (proc0_5 64))
			(++ global155)
		)
		(if (not (proc999_5 gNewGuise 0 4))
			(gIconBar disable: 4)
		)
		(if
			(and
				(proc999_5
					global11
					180
					210
					150
					250
					580
					120
					390
					270
					310
					440
					350
					110
					120
					160
					220
				)
				(proc999_5 gHeading 100 260 630 450)
			)
			(gRgnMusic fade: 0 20 12 1)
		)
		(if
			(and
				(not
					(proc999_5 global11 690 590 600 610 700 580 620 701 702)
				)
				(proc999_5 gHeading 690 590 600 610 700 580 620 701 702)
			)
			(gSFX2 fade: 0 15 12 1)
		)
		(if
			(and
				(proc999_5 global11 690 590 600 610 700 580 620 701 702)
				(not
					(proc999_5 gHeading 690 590 600 610 700 580 620 701 702)
				)
			)
			(gSFX2 number: 580 vol: 127 loop: -1 play:)
		)
		(if
			(and
				(not
					(proc999_5 global11 250 590 600 610 620 690 700 680)
				)
				(== (gSFX number?) 581)
			)
			(gSFX fade: 0 30 8 1)
		)
		(if (proc999_5 global11 100 260 630 450)
			(gIconBar disable: 2 3 4 6 7)
		)
		(if
			(not
				(proc999_5
					global11
					260
					220
					110
					120
					150
					180
					190
					210
					250
					590
					600
					580
					450
					440
					350
					390
					270
					280
					290
					300
					310
					455
					460
					470
					480
					45
					640
					280
					290
					300
					310
				)
			)
			(gIconBar disable: 5)
		)
		(cond 
			((proc999_5 param1 220 180 210 250)
				(if
					(or
						(and (== global130 9) (not (proc0_5 36)))
						(and (== global130 12) (not (proc0_5 38)))
					)
					(ScriptID 750)
					((ScriptID param1) setRegions: 750)
					(proc0_6 129)
				)
			)
			(
			(proc999_5 param1 620 630 640 650 660 670 680 690 695) (ScriptID 625) ((ScriptID param1) setRegions: 625))
			((proc999_5 param1 110 120 100) (ScriptID 125) ((ScriptID param1) setRegions: 125))
			((proc999_5 param1 701 702 705) (ScriptID 720) ((ScriptID param1) setRegions: 720))
			((proc999_5 param1 470 480 450 460 455) (ScriptID 452) ((ScriptID param1) setRegions: 452))
			((proc999_5 param1 550 560 561 562 570) (ScriptID 564) ((ScriptID param1) setRegions: 564))
			((proc999_5 param1 590 600 610)
				(ScriptID 601)
				(ScriptID 851)
				((ScriptID param1) setRegions: 601)
			)
			((proc999_5 param1 280 290 300 310) (ScriptID 311))
		)
		(global1 setCursor: global21 1)
	)
)
