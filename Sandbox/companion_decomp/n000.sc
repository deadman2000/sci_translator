;;; Sierra Script 1.0 - (do not remove this comment)
(script# 0)
(include sci.sh)
(use n013)
(use n014)
(use n255)
(use n802)
(use n813)
(use n856)
(use n934)
(use n936)
(use n937)
(use n939)
(use n945)
(use n946)
(use n961)
(use n967)
(use n977)
(use n981)
(use n989)
(use n994)
(use n995)
(use n996)
(use n999)

(public
	Longbow 0
	statLine 1
	proc0_2 2
	proc0_3 3
	proc0_4 4
	proc0_5 5
	proc0_6 6
	proc0_7 7
	proc0_9 9
)

(local
	gEgo
	global1
	global2
	global3 =  6
	global4
	global5
	global6
	global7
	global8
	global9
	global10
	global11
	global12
	global13
	global14
	global15
	global16
	global17 =  7
	global18
	global19
	global20 =  999
	global21 =  20
	global22 =  1
	global23 =  4
	global24
	global25
	global26 =  1
	global27
	global28
	global29
	global30 =  10
	global31
	global32
	global33
	global34
	global35
	global36 =  -1
	global37
	global38
	global39 =  3
	global40
	global41
	global42
	global43
	global44
	global45
	global46
	global47
	global48
	global49
	global50
	global51
	global52
	global53
	global54
	global55
	global56
	global57
	global58
	global59
	global60
	global61
	global62
	global63
	gFtrInit
	gDoVerbCode
	global66
	global67 =  1
	global68
	gIconBar
	global70
	global71
	gKH
	gMH
	gDH
	global75
	global76
	global77
	global78
	global79 =  60
	global80
	global81
	global82
	global83
	global84
	global85
	global86
	global87
	global88
	global89
	global90
	global91
	global92
	global93
	global94
	global95
	global96
	global97
	global98
	global99
	gRgnMusic
	global101 =  1234
	global102
	global103
	global104
	global105
	global106
	global107
	global108
	gEgoHead
	global110
	global111
	global112
	gSFX
	gSFX2
	global115
	global116
	global117
	global118 =  1
	global119 =  2
	global120 =  1
	global121 =  5
	global122 =  4
	global123
	global124
	global125 =  2
	global126
	global127
	global128
	global129
	global130 =  1
	global131
	global132
	gPennies
	gHapennies
	gFarthings
	global136
	global137
	global138 =  50
	global139 =  2000
	global140
	global141 =  4
	global142
	global143
	global144
	global145
	global146
	global147 =  140
	global148
	global149
	global150
	global151
	gMoney
	global153
	global154
	global155
	global156
	global157
	global158
	global159
	global160
	gEgoBeard
	global162 =  180
	global163 =  7
	global164
	global165
	global166
	global167
	gRgnMusic2
	global169
	global170
	global171
	global172
	global173
	global174
	global175
	global176
	global177
	global178
	global179
	global180
	global181
	global182
	global183
	global184
	global185
	global186
	global187
	global188
	global189
	global190
	global191
	global192
	global193
	global194
	global195
	global196
	global197
	global198
	global199
	global200
	global201
	global202
	global203
	global204
	global205
	global206
	global207
	global208
	global209
	global210
	global211
	global212
	global213
	global214
	global215
)
(procedure (proc0_2 param1 param2 param3 &tmp temp0 temp1 temp2)
	(= temp0
		(switch global126
			(1 36)
			(2 29)
			(3 29)
			(4 33)
			(5 23)
			(6 16)
			(else  0)
		)
	)
	(= temp1
		(switch global126
			(1 37)
			(2 30)
			(3 30)
			(4 34)
			(5 24)
			(6 17)
			(else  1)
		)
	)
	(if argc
		(gEgo loop: param1)
		(if (> argc 1)
			(= temp0 param2)
			(if (> argc 2) (= temp1 param3))
		)
	)
	(= temp2
		(switch (gEgo loop?)
			(6 45)
			(0 90)
			(4 135)
			(2 180)
			(5 225)
			(1 270)
			(7 315)
		)
	)
	(gEgo
		view: temp0
		normal:
			(if
				(proc999_5
					temp0
					0
					1
					3
					12
					13
					29
					30
					245
					33
					34
					23
					24
					16
					17
					702
					703
					25
					245
				)
				1
			else
				0
			)
		abnormal: (proc999_5 global126 3 2)
		moveHead:
			(if
				(proc999_5
					temp0
					0
					1
					3
					12
					13
					29
					30
					245
					33
					34
					23
					24
					16
					17
					702
					703
					25
					245
				)
				1
			else
				0
			)
		setLoop: -1
		setLoop: stopGroop
		setPri: -1
		setCycle: StopWalk temp1
		setStep: 3 2
		illegalBits: -32768
		ignoreActors: 0
		heading: temp2
	)
	(cond 
		(
			(not
				(proc999_5
					(gEgo view?)
					0
					1
					3
					12
					13
					29
					30
					245
					33
					34
					23
					24
					16
					17
					702
					703
					25
					245
				)
			)
			(egoHead dispose:)
		)
		((global5 contains: egoHead) (egoHead normalize:))
		((global5 contains: gEgo) (localproc_3126))
	)
	(cond 
		((not (proc999_5 global126 3 2)) (egoBeard dispose:))
		((global5 contains: gEgo) (localproc_3178))
	)
	(if
	(and (proc999_5 global126 0 4) (not global143))
		(gIconBar enable: 4)
	else
		(gIconBar disable: 4)
	)
)

(procedure (proc0_3 &tmp gIconBarCurIcon)
	(if global143 (return))
	(= global143 1)
	(User canControl: 0 canInput: 0)
	(= gIconBarCurIcon (gIconBar curIcon?))
	(= global157 (global1 egoMoveSpeed?))
	(= global165 0)
	(gIconBar eachElementDo: #perform checkIcon)
	(gIconBar disable: 0 1 2 3 4 5 6 7)
	(gIconBar curIcon: gIconBarCurIcon)
	(if (HaveMouse)
		(global1 setCursor: global21 1)
	else
		(= global127 ((User curEvent?) x?))
		(= global128 ((User curEvent?) y?))
		(global1 setCursor: global21 1 310 185)
	)
)

(procedure (proc0_4 param1 &tmp temp0 temp1)
	(if global143
		(= global143 0)
		(global1 setSpeed: global157)
		(= global157 global141)
		(User canControl: 1 canInput: 1)
	)
	(if (and argc param1)
		(= temp0 0)
		(while (< temp0 7)
			(if (not (& global165 (>> $8000 temp0)))
				(gIconBar enable: temp0)
			)
			(++ temp0)
		)
	else
		(if (gIconBar curInvIcon?)
			(gIconBar enable: (gIconBar useIconItem?))
		)
		(gIconBar enable: 0 1 2 3 7)
		(if (proc999_5 global126 0 4) (gIconBar enable: 4))
		(if (proc999_5 global11 100 260 630 450)
			(gIconBar disable: 2 3 4 5 6 7)
		)
		(if
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
			(gIconBar enable: 5)
		)
	)
	(if
		(and
			(not (gIconBar curInvIcon?))
			(== (gIconBar curIcon?) (gIconBar at: 6))
		)
		(gIconBar advanceCurIcon:)
	)
	(if (HaveMouse)
		(global1 setCursor: ((gIconBar curIcon?) cursor?))
	else
		(global1
			setCursor: ((gIconBar curIcon?) cursor?) 1 global127 global128
		)
	)
)

(procedure (proc0_5 param1)
	(return
		(&
			[global200 (/ param1 16)]
			(>> $8000 (mod param1 16))
		)
	)
)

(procedure (proc0_6 param1 &tmp temp0)
	(= temp0 (proc0_5 param1))
	(= [global200 (/ param1 16)]
		(|
			[global200 (/ param1 16)]
			(>> $8000 (mod param1 16))
		)
	)
	(return temp0)
)

(procedure (proc0_7 param1 &tmp temp0)
	(= temp0 (proc0_5 param1))
	(= [global200 (/ param1 16)]
		(&
			[global200 (/ param1 16)]
			(~ (>> $8000 (mod param1 16)))
		)
	)
	(return temp0)
)

(procedure (proc0_9 param1 param2 param3 param4 &tmp temp0 temp1 temp2 temp3)
	(= temp3 0)
	(if (IsObject param2)
		(= temp1 (param2 x?))
		(= temp2 (param2 y?))
		(if (== argc 3) (= temp3 param3))
	else
		(= temp1 param2)
		(= temp2 param3)
		(if (== argc 4) (= temp3 param4))
	)
	(= temp0
		(GetAngle (param1 x?) (param1 y?) temp1 temp2)
	)
	(cond 
		((> (Abs (- temp0 (gEgo heading?))) 23)
			(param1
				setHeading: temp0 (if (IsObject temp3) temp3 else 0)
			)
		)
		((IsObject temp3) (temp3 cue:))
	)
)

(procedure (localproc_3126)
	((= gEgoHead egoHead)
		view:
			(if (proc999_5 (gEgo view?) 1 13 30 34 24 17 703)
				(gEgo view?)
			else
				(+ (gEgo view?) 1)
			)
		init: gEgo
		cycleSpeed: 180
		normalize:
	)
)

(procedure (localproc_3178)
	((= gEgoBeard egoBeard)
		init: gEgo
		view: (if (== global126 3) 77 else 76)
	)
)

(instance ego of rhEgo
	(properties)
	
	(method (init)
		(super init:)
		(if
			(and
				(proc999_5
					view
					0
					1
					3
					12
					13
					29
					30
					245
					33
					34
					23
					24
					16
					17
					702
					703
					25
					245
				)
				(not (global5 contains: egoHead))
				normal
			)
			(localproc_3126)
		)
		(if
			(and
				(proc999_5 global126 3 2)
				(not (global5 contains: egoBeard))
				abnormal
			)
			(localproc_3178)
		)
	)
	
	(method (doVerb theVerb param2)
		((ScriptID 804) doit: theVerb param2)
	)
)

(instance egoHead of Head
	(properties
		view 1
	)
)

(instance egoBeard of Beard
	(properties
		view 77
	)
	
	(method (doVerb)
		(gEgo doVerb: &rest)
	)
)

(instance rgnMusic of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance rgnMusic2 of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance SFX of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance SFX2 of Sound
	(properties
		flags $0001
		loop -1
	)
)

(instance moneySound of Sound
	(properties
		flags $0001
		number 914
	)
)

(instance stopGroop of Grooper
	(properties)
	
	(method (doit)
		(if
			(and
				(IsObject (gEgo cycler?))
				((gEgo cycler?) isKindOf: StopWalk)
			)
			(gEgo view: ((gEgo cycler?) vWalking?))
		)
		(super doit: &rest)
	)
)

(instance money of Money
	(properties
		view 771
		loop 5
		keepStr 12861
		giveStr 12866
		number 0
		title 12846
	)
	
	(method (doit)
		(moneySound play:)
		(super doit: &rest)
	)
)

(instance pennies of Denomination
	(properties
		value 4
	)
)

(instance hapennies of Denomination
	(properties
		value 2
	)
)

(instance farthings of Denomination
	(properties)
)

(instance MH of EventHandler
	(properties)
)

(instance KH of EventHandler
	(properties)
)

(instance DH of EventHandler
	(properties)
)

(instance rhWindow of SysWindow
	(properties)
)

(instance statLine of Code
	(properties)
	
	(method (doit &tmp [temp0 70] [temp70 100] [temp170 8] [temp178 12] [temp190 10] [temp200 6] [temp206 4] [temp210 4] [temp214 4] [temp218 4] [temp222 4] temp226)
		(StrCpy @temp170 {Ransom:_})
		(StrCpy @temp178 {_____Outlaws:_})
		(StrCpy @temp190 {_____Score:_})
		(Format @temp200 0 0 global139)
		(Format @temp206 0 1 global138)
		(Format @temp210 0 1 global15)
		(StrCpy @temp214 { of_})
		(Format @temp218 0 1 global16)
		(Format
			@temp0
			0
			2
			@temp170
			@temp200
			@temp178
			@temp206
			@temp190
			@temp210
			@temp214
			@temp218
		)
		(TextSize @temp222 @temp0 0 -1)
		(StrCpy @temp70 {})
		(= temp226 (/ (- 326 (- [temp222 3] [temp222 1])) 2))
		(while (> temp226 0)
			(StrCat @temp70 {})
			(-- temp226)
		)
		(StrCat @temp70 @temp0)
		(DrawStatus @temp70 global182 0)
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

(instance Longbow of Game
	(properties)
	
	(method (init)
		StopWalk
		PolyPath
		Polygon
		(ScriptID 982)
		(proc802_0)
		(super init:)
		(= gDoVerbCode DoVerbCode)
		(= gFtrInit FtrInit)
		((= gMH MH) add:)
		((= gKH KH) add:)
		((= gDH DH) add:)
		((= gEgo ego)
			_head: (= gEgoHead egoHead)
			beard: (= gEgoBeard egoBeard)
		)
		((gEgo _head?) client: gEgo)
		((gEgo beard?) client: gEgo)
		(User alterEgo: gEgo)
		(rgnMusic2 owner: self init:)
		(rgnMusic owner: self init:)
		(SFX owner: self init:)
		(SFX2 owner: self init:)
		(= gRgnMusic2 rgnMusic2)
		(= gRgnMusic rgnMusic)
		(= gSFX SFX)
		(= gSFX2 SFX2)
		((= gIconBar IconBar)
			add:
				iconWalk
				iconLook
				iconDo
				iconTalk
				iconBow
				iconMap
				iconUse
				iconInvSel
				iconControl
				iconWhat
			eachElementDo: #init
			eachElementDo: #highlightColor global184
			curIcon: iconWalk
			useIconItem: iconUse
			helpIconItem: iconWhat
			disable:
		)
		(iconInvSel message: (if (HaveMouse) 3840 else 9))
		(GameControls
			window: gcWindow
			add:
				iconOk
				(detailSlider
					theObj: self
					selector: 293
					yStep: 5
					yourself:
				)
				(volumeSlider
					theObj: self
					selector: 383
					topValue: (if (> (DoSound sndDISPOSE) 1) 15 else 1)
					yourself:
				)
				(moveSpeedSlider
					theObj: self
					selector: 380
					yStep: 5
					yourself:
				)
				(arcadeSlider yStep: 5 yourself:)
				(iconSave theObj: self selector: 78 yourself:)
				(iconRestore theObj: self selector: 79 yourself:)
				(iconRestart theObj: self selector: 104 yourself:)
				(iconQuit theObj: self selector: 103 yourself:)
				(iconAbout
					theObj: (ScriptID 809 0)
					selector: 60
					yourself:
				)
				iconHelp
			eachElementDo: #highlightColor global184
			helpIconItem: iconHelp
			curIcon: iconRestore
		)
		(global9
			normalHeading: {I am carrying}
			empty: {nothing.}
			init:
			add:
				bucks
				horn
				halfHeart
				slipper
				net
				pipe
				gems
				jewels
				rouge
				message
				fireRing
				cask
				puzzleBox
				robes
				amethyst
				comb
				fulkScroll
				handScroll
				waterRing
				invLook
				invHand
				invSelect
				invHelp
				ok
			eachElementDo: #highlightColor global184
			eachElementDo: #lowlightColor global170
			window: invWindow
			helpIconItem: invHelp
			selectIcon: invSelect
			okButton: ok
		)
		(invLook
			lowlightColor: global187
			highlightColor: global174
		)
		(invHand
			lowlightColor: global187
			highlightColor: global174
		)
		(invSelect
			lowlightColor: global187
			highlightColor: global174
		)
		(invHelp
			lowlightColor: global187
			highlightColor: global174
		)
		(ok lowlightColor: global187 highlightColor: global174)
		(= gFarthings farthings)
		(= gHapennies hapennies)
		(= gPennies pennies)
		((= gMoney money)
			color: global184
			owner: gEgo
			init: gPennies gHapennies gFarthings
		)
		((ScriptID 808 0) doit: rhWindow gcWindow invWindow)
	)
	
	(method (replay)
		(statLine doit:)
		(super replay:)
	)
	
	(method (newRoom)
		(if global25 (global25 dispose:))
		(super newRoom: &rest)
	)
	
	(method (startRoom param1)
		((ScriptID 808 1) doit: param1)
		(super startRoom: param1)
		(if (not (proc999_5 param1 97 98 96 95 803))
			(statLine doit:)
		)
		(if (and (User controls?) (User input?))
			(global1 setCursor: ((gIconBar curIcon?) cursor?))
		)
	)
	
	(method (restart &tmp temp0)
		(asm
			pushi    1
			lsg      global25
			callk    IsObject,  2
			bnt      code_0a82
			pushi    1
			pushi    #caller
			pushi    0
			lag      global25
			send     4
			sat      temp0
			push    
			callk    IsObject,  2
			bnt      code_0a7b
			pushi    #caller
			pushi    1
			pushi    0
			lag      global25
			send     6
code_0a7b:
			pushi    #dispose
			pushi    0
			lag      global25
			send     4
code_0a82:
			pushi    16
			pushi    0
			pushi    3
			pushi    80
			lofsa    {RESTART}
			push    
			pushi    30
			pushi    1
			pushi    81
			lofsa    {Aye, start from scratch.}
			push    
			pushi    1
			pushi    81
			lofsa    {Nay, go back to where I was.}
			push    
			pushi    2
			pushi    82
			lofsa    quitIcon
			push    
			pushi    1
			pushi    0
			calle    proc255_0,  32
			push    
			dup     
			ldi      1
			eq?     
			bnt      code_0abb
			pushi    #restart
			pushi    0
			super    Game,  4
			jmp      code_0ad4
code_0abb:
			dup     
			ldi      2
			eq?     
			bnt      code_0ad4
			pushi    1
			lst      temp0
			callk    IsObject,  2
			bnt      code_0ad3
			pushi    #cue
			pushi    0
			lat      temp0
			send     4
code_0ad3:
			ret     
code_0ad4:
			toss    
			jmp      code_0a82
			ret     
		)
	)
	
	(method (handleEvent pEvent &tmp [temp0 2] [temp2 10])
		(if (== (pEvent type?) evKEYBOARD)
			(switch (pEvent message?)
				(KEY_TAB
					(if
						(not
							(if global143
							else
								(& ((gIconBar at: 7) signal?) $0004)
							)
						)
						(global9 showSelf:)
					)
				)
				(KEY_SHIFTTAB
					(if
						(not
							(if global143
							else
								(& ((gIconBar at: 7) signal?) $0004)
							)
						)
						(global9 showSelf:)
					)
				)
				(KEY_CONTROL
					(global1 quitGame:)
					(pEvent claimed: 1)
				)
				(KEY_F2
					(cond 
						((global1 masterVolume:) (global1 masterVolume: 0))
						((> global103 1) (global1 masterVolume: 15))
						(else (global1 masterVolume: 1))
					)
					(pEvent claimed: 1)
				)
				(KEY_F5
					(if
						(not
							(if (& ((gIconBar at: 8) signal?) $0004)
							else
								(& (gIconBar state?) $0004)
							)
						)
						(if (and (IsObject global84) (global84 elements?))
							(return)
						)
						(global1 save:)
						(pEvent claimed: 1)
					)
				)
				(KEY_F7
					(if
						(not
							(if (& ((gIconBar at: 8) signal?) $0004)
							else
								(& (gIconBar state?) $0004)
							)
						)
						(if (and (IsObject global84) (global84 elements?))
							(return)
						)
						(global1 restore:)
						(pEvent claimed: 1)
					)
				)
				(KEY_F9
					(global1 restart:)
					(pEvent claimed: 1)
				)
				(KEY_EXECUTE
					(if (User controls?)
						(global1
							setSpeed: (proc999_3 1 (- (global1 egoMoveSpeed?) 1))
						)
					)
				)
				(KEY_SUBTRACT
					(if (User controls?)
						(global1 setSpeed: (+ (global1 egoMoveSpeed?) 1))
					)
				)
				(61
					(if (User controls?) (global1 setSpeed: global141))
				)
				(else 
					(Format @temp2 0 6 800)
					(if (and global102 (FileIO 10 @temp2))
						((ScriptID 800) handleEvent: pEvent)
					)
				)
			)
		)
		(if (not (pEvent claimed?))
			(super handleEvent: pEvent)
		)
	)
	
	(method (setSpeed newSpeed)
		(if argc
			(gEgo
				moveSpeed: (= egoMoveSpeed newSpeed)
				cycleSpeed: (= egoMoveSpeed newSpeed)
			)
		)
		(return egoMoveSpeed)
	)
	
	(method (quitGame)
		(super
			quitGame:
				(if (== global11 97)
					(proc255_0
						0
						4
						80
						{QUIT}
						81
						{Farewell, I must go.}
						1
						81
						{Let me tarry here a while longer.}
						0
						82
						quitIcon
						0
						0
					)
				else
					(proc255_0
						0
						5
						80
						{QUIT}
						81
						{Farewell, I must go.}
						1
						81
						{Let me tarry here a while longer.}
						0
						82
						quitIcon
						0
						0
					)
				)
		)
	)
	
	(method (pragmaFail &tmp temp0 [temp1 31])
		(if global25 (global25 dispose:) (return 1))
		(return
			(if (User canInput:)
				(switch (= temp0 ((User curEvent?) message?))
					(2 (proc13_4 1000 75 1))
					(3 (proc13_4 1000 76 1))
					(5 (proc13_4 1000 77 1))
					(10 (proc13_4 1000 78 1))
					(4 (proc13_4 1000 79 1))
				)
			else
				0
			)
		)
	)
)

(instance iconWalk of RhIconItem
	(properties
		view 781
		loop 0
		cel 0
		cursor 0
		message 1
		signal $0041
		helpStr 13132
		maskView 781
		maskLoop 10
	)
)

(instance iconLook of RhIconItem
	(properties
		view 781
		loop 1
		cel 0
		cursor 1
		message 2
		signal $0041
		helpStr 13167
		maskView 781
		maskLoop 10
	)
)

(instance iconDo of RhIconItem
	(properties
		view 781
		loop 2
		cel 0
		cursor 2
		message 3
		signal $0041
		helpStr 13202
		maskView 781
		maskLoop 10
	)
)

(instance iconTalk of RhIconItem
	(properties
		view 781
		loop 3
		cel 0
		cursor 3
		message 5
		signal $0041
		helpStr 13233
		maskView 781
		maskLoop 10
	)
)

(instance iconBow of RhIconItem
	(properties
		view 781
		loop 4
		cel 0
		cursor 4
		message 10
		signal $0041
		helpStr 13268
		maskView 781
		maskLoop 10
	)
)

(instance iconMap of RhIconItem
	(properties
		view 781
		loop 5
		cel 0
		cursor 5
		message 11
		signal $0043
		helpStr 13313
		maskView 781
		maskLoop 10
	)
	
	(method (select)
		(if (super select: &rest)
			(cond 
				((== global11 220) (proc0_6 170) (global2 newRoom: 100))
				(
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
					)
					(global2 newRoom: 100)
				)
				(
				(proc999_5 global11 450 440 350 390 270 280 290 300 310) (global2 newRoom: 260))
				((proc999_5 global11 455 460 470 480 45) (global2 newRoom: 450))
				((proc999_5 global11 640) (global2 newRoom: 630))
				(else (proc13_4 1000 6))
			)
		)
	)
)

(instance iconUse of RhIconItem
	(properties
		view 781
		loop 6
		cel 0
		cursor 999
		message 4
		signal $0041
		helpStr 13362
		maskView 781
		maskLoop 10
		maskCel 1
	)
)

(instance iconInvSel of RhIconItem
	(properties
		view 781
		loop 7
		cel 0
		cursor 2
		type $0000
		message 0
		signal $0043
		helpStr 13416
		maskView 781
		maskLoop 10
	)
	
	(method (select)
		(if (super select: &rest) (global9 showSelf:))
	)
)

(instance iconControl of RhIconItem
	(properties
		view 781
		loop 8
		cel 0
		cursor 999
		signal $0043
		helpStr 13469
		maskView 781
		maskLoop 10
	)
	
	(method (select)
		(if (super select: &rest)
			(gIconBar hide:)
			(proc13_6 0)
			(GameControls show:)
		)
	)
)

(instance iconWhat of RhIconItem
	(properties
		view 781
		loop 9
		cel 0
		cursor 6
		message 6
		signal $0003
		helpStr 13520
		maskView 781
		maskLoop 10
	)
)

(instance ok of IconI
	(properties
		view 900
		loop 3
		cel 0
		nsLeft 40
		cursor 999
		signal $0043
		helpStr 13587
		lowlightColor 5
	)
	
	(method (select)
		(return
			(if (super select: &rest)
				(if (not (gems cel?))
					(gems owner: gEgo loop: 2 cel: 7)
				)
				(if (== (fulkScroll cel?) 3) (fulkScroll cel: 2))
				(if (== (handScroll cel?) 5) (handScroll cel: 4))
				(if (== (message cel?) 7) (message cel: 6))
				(if (== (rouge cel?) 14) (rouge cel: 13))
				(if (jewels loop?) (jewels loop: 0 cel: 15))
				(return 1)
			else
				0
			)
		)
	)
)

(instance invLook of IconI
	(properties
		view 900
		loop 2
		cel 0
		cursor 1
		message 2
		helpStr 13635
		lowlightColor 5
	)
)

(instance invHand of IconI
	(properties
		view 900
		loop 0
		cel 0
		cursor 2
		message 3
		helpStr 13721
		lowlightColor 5
	)
)

(instance invHelp of IconI
	(properties
		view 900
		loop 1
		cel 0
		cursor 6
		message 6
		lowlightColor 5
	)
)

(instance invSelect of IconI
	(properties
		view 900
		loop 4
		cel 0
		cursor 999
		helpStr 13830
		lowlightColor 5
	)
)

(instance bucks of InvI
	(properties
		view 771
		loop 2
		cel 3
		cursor 104
		signal $0002
	)
	
	(method (doVerb theVerb &tmp [temp0 12] [temp12 15] [temp27 15] [temp42 3] [temp45 6] [temp51 55])
		(switch (gPennies number?)
			(0 (Format @temp0 0 7))
			(1 (Format @temp0 0 8))
			(else 
				(Format @temp0 0 9 (gPennies number?))
			)
		)
		(switch (gHapennies number?)
			(0 (Format @temp12 0 7))
			(1 (Format @temp12 0 10))
			(else 
				(Format @temp12 0 11 (gHapennies number?))
			)
		)
		(switch (gFarthings number?)
			(0 (Format @temp27 0 7))
			(1 (Format @temp27 0 12))
			(else 
				(Format @temp27 0 13 (gFarthings number?))
			)
		)
		(cond 
			(
				(and
					(gPennies number?)
					(gHapennies number?)
					(gFarthings number?)
				)
				(Format @temp42 0 14)
				(Format @temp45 0 15)
			)
			(
				(and
					(gPennies number?)
					(gHapennies number?)
					(not (gFarthings number?))
				)
				(Format @temp42 0 16)
				(Format @temp45 0 7)
			)
			(
				(and
					(gPennies number?)
					(not (gHapennies number?))
					(gFarthings number?)
				)
				(Format @temp42 0 7)
				(Format @temp45 0 16)
			)
			(
				(and
					(not (gPennies number?))
					(gHapennies number?)
					(gFarthings number?)
				)
				(Format @temp42 0 7)
				(Format @temp45 0 16)
			)
			(else (Format @temp42 0 7) (Format @temp45 0 7))
		)
		(switch theVerb
			(2
				(proc13_1
					(Format
						@temp51
						0
						17
						@temp0
						@temp42
						@temp12
						@temp45
						@temp27
					)
				)
			)
			(3 (proc13_4 1000 16))
			(else  (super doVerb: theVerb))
		)
	)
)

(instance horn of InvI
	(properties
		view 771
		loop 2
		cel 5
		cursor 100
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 17))
			(3 (proc13_4 1000 18))
		)
	)
)

(instance halfHeart of InvI
	(properties
		view 771
		cel 10
		cursor 127
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 19))
			(3 (proc13_4 1000 20))
		)
	)
)

(instance slipper of InvI
	(properties
		view 771
		cel 12
		cursor 121
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 21))
			(3 (proc13_4 1000 22))
		)
	)
)

(instance net of InvI
	(properties
		view 771
		cursor 102
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 23))
			(3 (proc13_4 1000 24))
		)
	)
)

(instance pipe of InvI
	(properties
		view 771
		cel 1
		cursor 130
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 25))
			(3 (proc13_4 1000 26))
		)
	)
)

(instance gems of InvI
	(properties
		view 771
		loop 2
		cel 7
		cursor 120
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== loop 2)
					(proc13_4 1000 27)
				else
					(proc13_4 1000 28)
				)
			)
			(3
				(global9 hide:)
				(if cel
					(self owner: global1 loop: 4 cel: 0)
					(global9 show: global1)
				else
					(self owner: gEgo loop: 2 cel: 7)
					(global9 show: gEgo)
				)
			)
		)
	)
)

(instance jewels of InvI
	(properties
		view 771
		cel 15
		cursor 132
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if loop (proc13_4 1000 29) else (proc13_4 1000 30))
			)
			(3
				(if loop
					(proc13_4 1000 31)
					(= loop 0)
					(= cel 15)
				else
					(proc13_4 1000 32)
					(= loop 2)
					(= cel 1)
				)
				(global9 hide:)
				(global9 show: gEgo)
			)
		)
	)
)

(instance rouge of InvI
	(properties
		view 771
		cel 13
		cursor 131
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== cel 13)
					(proc13_4 1000 33)
				else
					(proc13_4 1000 34)
				)
			)
			(3
				(global9 hide:)
				(= cel (if (== cel 13) 14 else 13))
				(global9 show: gEgo)
			)
		)
	)
)

(instance message of InvI
	(properties
		view 771
		cel 6
		cursor 123
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== cel 6)
					(proc13_4 1000 35)
				else
					(proc13_4 1000 36)
				)
			)
			(3
				(if (== cel 6)
					(proc13_4 1000 37)
					(= cel 7)
				else
					(proc13_4 1000 38)
					(= cel 6)
				)
				(global9 hide:)
				(global9 show: gEgo)
			)
		)
	)
)

(instance fireRing of InvI
	(properties
		view 771
		cel 11
		cursor 101
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 39))
			(3
				(switch global115
					(0
						(proc13_4 1000 40)
						(= global115 2)
						(proc0_6 168)
						(global9 hide:)
						(= cel 8)
						(= loop 2)
						(global9 show: gEgo)
					)
					(2
						(proc13_4 1000 41)
						(= global115 0)
						(proc0_7 168)
						(global9 hide:)
						(= cel 11)
						(= loop 0)
						(global9 show: gEgo)
					)
					(1 (proc13_4 1000 42))
				)
			)
		)
	)
)

(instance cask of InvI
	(properties
		view 771
		loop 2
		cel 4
		cursor 128
		signal $0002
		owner 460
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 43))
			(3 (proc13_4 1000 44))
		)
	)
)

(instance puzzleBox of InvI
	(properties
		view 771
		loop 2
		cel 6
		cursor 126
		signal $0002
		owner 460
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 45))
			(3
				(global9 hide:)
				(global1 setScript: (ScriptID 853 1))
			)
		)
	)
)

(instance robes of InvI
	(properties
		view 771
		loop 2
		cursor 125
		signal $0002
		owner 455
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 46))
			(3 (proc13_4 1000 47))
		)
	)
)

(instance amethyst of InvI
	(properties
		view 771
		cel 9
		cursor 129
		signal $0002
		owner 540
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 48))
			(3 (proc13_4 1000 49))
		)
	)
)

(instance comb of InvI
	(properties
		view 771
		cel 8
		cursor 124
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 50))
			(3 (proc13_4 1000 51))
		)
	)
)

(instance fulkScroll of InvI
	(properties
		view 771
		cel 2
		cursor 133
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== cel 2)
					(proc13_4 1000 52)
				else
					(global9 hide:)
					(global1 setScript: (ScriptID 806 7))
				)
			)
			(3
				(if (global6 contains: 625)
					(proc13_4 1000 53)
				else
					(if (== cel 2)
						(= cel 3)
						(proc13_4 1000 54)
					else
						(= cel 2)
						(proc13_4 1000 55)
					)
					(global9 hide:)
					(global9 show: gEgo)
				)
			)
		)
	)
)

(instance handScroll of InvI
	(properties
		view 771
		cel 4
		cursor 122
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(if (== cel 4)
					(proc13_4 1000 56)
				else
					(proc13_4 1000 57)
				)
			)
			(3
				(if (global6 contains: 625)
					(proc13_4 1000 58)
				else
					(if (== cel 4)
						(proc13_4 1000 59)
						(= cel 5)
					else
						(proc13_4 1000 60)
						(= cel 4)
					)
					(global9 hide:)
					(global9 show: gEgo)
				)
			)
		)
	)
)

(instance waterRing of InvI
	(properties
		view 771
		loop 2
		cel 2
		cursor 101
		signal $0002
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1000 61))
			(3
				(switch global115
					(0
						(proc13_4 1000 62)
						(= global115 1)
						(global9 hide:)
						(= cel 9)
						(= loop 2)
						(global9 show: gEgo)
					)
					(1
						(proc13_4 1000 63)
						(= global115 0)
						(global9 hide:)
						(= loop (= cel 2))
						(global9 show: gEgo)
					)
					(2 (proc13_4 1000 64))
				)
			)
		)
	)
)

(instance detailSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 89
		nsTop 49
		signal $0080
		helpStr 14034
		sliderView 950
		topValue 3
	)
)

(instance volumeSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 135
		nsTop 49
		signal $0080
		helpStr 14204
		sliderView 950
		topValue 15
	)
)

(instance moveSpeedSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 181
		nsTop 49
		signal $0080
		helpStr 14315
		sliderView 950
		bottomValue 15
		topValue 1
	)
	
	(method (show)
		(if (not (User controls?))
			(= signal 132)
			(= sliderLoop 9)
		else
			(= sliderLoop 0)
			(= signal 128)
		)
		(super show: &rest)
	)
	
	(method (mask)
	)
	
	(method (move)
		(if (User controls?) (super move: &rest))
	)
)

(instance arcadeSlider of Slider
	(properties
		view 950
		loop 0
		cel 1
		nsLeft 227
		nsTop 49
		signal $0080
		helpStr 14424
		sliderView 950
		bottomValue 1
		topValue 22
	)
	
	(method (doit param1)
		(return
			(if argc
				(cond 
					((<= param1 1) (= global125 1))
					((<= param1 8) (= global125 2))
					((<= param1 15) (= global125 3))
					(else (= global125 4))
				)
				(return param1)
			else
				(return global125)
			)
		)
	)
	
	(method (valueToPosn &tmp temp0)
		(= temp0
			(switch global125
				(1 1)
				(2 7)
				(3 15)
				(4 22)
			)
		)
		(super valueToPosn: temp0)
	)
)

(instance iconSave of ControlIcon
	(properties
		view 950
		loop 2
		cel 0
		nsLeft 25
		nsTop 26
		signal $01c3
		helpStr 14567
		lowlightColor 52
	)
)

(instance iconRestore of ControlIcon
	(properties
		view 950
		loop 3
		cel 0
		nsLeft 25
		nsTop 46
		signal $01c3
		helpStr 14601
		lowlightColor 60
	)
)

(instance iconRestart of ControlIcon
	(properties
		view 950
		loop 4
		cel 0
		nsLeft 25
		nsTop 66
		signal $01c3
		helpStr 14647
		lowlightColor 42
	)
)

(instance iconQuit of ControlIcon
	(properties
		view 950
		loop 5
		cel 0
		nsLeft 43
		nsTop 86
		signal $01c3
		helpStr 14697
		lowlightColor 12
	)
)

(instance iconHelp of IconI
	(properties
		view 950
		loop 6
		cel 0
		nsLeft 25
		nsTop 106
		cursor 6
		message 6
		signal $0183
		lowlightColor 4
	)
)

(instance iconAbout of ControlIcon
	(properties
		view 950
		loop 8
		cel 0
		nsLeft 25
		nsTop 86
		signal $0183
		helpStr 14731
		lowlightColor 6
	)
)

(instance iconOk of IconI
	(properties
		view 950
		loop 7
		cel 0
		nsLeft 43
		nsTop 106
		signal $00c3
		helpStr 14769
		lowlightColor 34
	)
)

(instance gcWindow of BorderWindow
	(properties)
	
	(method (open &tmp temp0 temp1)
		(= temp1 -1)
		(self
			top: 25
			left: 26
			bottom: 166
			right: 296
			priority: temp1
		)
		(super open:)
		(= temp0 (PicNotValid))
		(PicNotValid 1)
		(DrawCel 950 1 2 0 0 temp1)
		(DrawCel 950 1 2 54 0 temp1)
		(DrawCel 950 1 2 108 0 temp1)
		(DrawCel 950 1 2 162 0 temp1)
		(DrawCel 950 1 2 216 0 temp1)
		(DrawCel 950 1 2 0 47 temp1)
		(DrawCel 950 1 2 54 47 temp1)
		(DrawCel 950 1 2 108 47 temp1)
		(DrawCel 950 1 2 162 47 temp1)
		(DrawCel 950 1 2 216 47 temp1)
		(DrawCel 950 1 2 0 94 temp1)
		(DrawCel 950 1 2 54 94 temp1)
		(DrawCel 950 1 2 108 94 temp1)
		(DrawCel 950 1 2 162 94 temp1)
		(DrawCel 950 1 2 216 94 temp1)
		(DrawCel 950 0 5 146 9 temp1)
		(DrawCel 950 1 1 14 17 temp1)
		(DrawCel 950 1 0 119 50 temp1)
		(DrawCel 950 1 0 165 50 temp1)
		(DrawCel 950 1 0 211 50 temp1)
		(DrawCel 950 0 4 85 33 temp1)
		(DrawCel 950 0 3 128 33 temp1)
		(DrawCel 950 0 2 180 33 temp1)
		(DrawCel 950 0 6 219 33 temp1)
		(Graph
			grUPDATE_BOX
			0
			0
			(+ 94 (CelHigh 950 1 2))
			(+ 216 (CelWide 950 1 2))
			1
		)
		(PicNotValid temp0)
	)
)

(instance invWindow of InsetWindow
	(properties
		priority -1
	)
	
	(method (dispose)
		(super dispose: &rest)
		(proc13_7)
	)
)

(instance DoVerbCode of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2
				(cond 
					((not (param2 lookStr?)) (proc13_4 1000 75 1))
					((u>= (param2 lookStr?) 1000) (proc13_1 (param2 lookStr?)))
					(else (proc13_4 (+ global11 1000) (param2 lookStr?) 1))
				)
			)
			(3 (proc13_4 1000 76 1))
			(5 (proc13_4 1000 77 1))
			(10 (proc13_4 1000 78 1))
			(4 (proc13_4 1000 79 1))
		)
	)
)

(instance FtrInit of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9)
		(if (== (param1 sightAngle?) 26505)
			(param1 sightAngle: 90)
		)
		(if (== (param1 actions?) 26505) (param1 actions: 0))
		(cond 
			((or (param1 x?) (param1 y?) (param1 z?)))
			(
			(not (IsObject (= temp0 (param1 onMeCheck?))))
				(param1
					x: (/ (+ (param1 nsLeft?) (param1 nsRight?)) 2)
				)
				(param1 y: (param1 nsTop?))
			)
			(else
				(= temp8 (= temp9 0))
				(= temp6 (= temp7 32767))
				(= temp2 (temp0 points?))
				(= temp1 0)
				(= temp3 (* 4 (temp0 size?)))
				(while (< temp1 temp3)
					(= temp4 (Memory 5 (+ temp2 temp1)))
					(= temp5 (Memory 5 (+ temp2 temp1 2)))
					(if (<= temp4 temp6) (= temp6 temp4))
					(if (<= temp5 temp7) (= temp7 temp5))
					(if (>= temp4 temp8) (= temp8 temp4))
					(if (>= temp5 temp9) (= temp9 temp5))
					(= temp1 (+ temp1 4))
				)
				(param1 x: (/ (+ temp6 temp8) 2))
				(param1 y: temp7)
			)
		)
	)
)

(instance checkIcon of Code
	(properties)
	
	(method (doit param1)
		(if
			(and
				(param1 isKindOf: IconI)
				(& (param1 signal?) $0004)
			)
			(= global165
				(| global165 (>> $8000 (gIconBar indexOf: param1)))
			)
		)
	)
)
