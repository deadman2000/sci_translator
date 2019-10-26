;;; Sierra Script 1.0 - (do not remove this comment)
(script# 995)
(include sci.sh)
(use n000)
(use n255)
(use n937)
(use n981)
(use n999)


(local
	local0
)
(procedure (localproc_0851 param1 param2 param3 &tmp temp0 newEvent temp2 temp3)
	(= temp3
		(+
			(/ (- (param1 nsRight?) (param1 nsLeft?)) 2)
			(param1 nsLeft?)
		)
	)
	(= temp2 param2)
	(return
		(while (>= (Abs (- temp2 param3)) 4)
			(if
				(= temp0
					(self
						firstTrue:
							#onMe
							((= newEvent (Event new:)) x: temp3 y: temp2 yourself:)
					)
				)
				(newEvent dispose:)
				(return temp0)
			)
			(newEvent dispose:)
			(if (< param2 param3)
				(= temp2 (+ temp2 4))
			else
				(= temp2 (- temp2 4))
			)
		)
	)
)

(class InvI of IconI
	(properties
		view 0
		loop 0
		cel 0
		nsLeft 0
		nsTop 0
		nsRight 0
		nsBottom 0
		state $0000
		cursor 999
		type $4000
		message 4
		modifiers $0000
		signal $0000
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		description 0
		owner 0
		script 0
		value 0
	)
	
	(method (show &tmp [temp0 4])
		(DrawCel view loop cel nsLeft nsTop -1)
	)
	
	(method (highlight param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(if (== highlightColor -1) (return))
		(= temp4
			(if (and argc param1) highlightColor else lowlightColor)
		)
		(= temp0 (- nsTop 2))
		(= temp1 (- nsLeft 2))
		(= temp2 (+ nsBottom 1))
		(= temp3 (+ nsRight 1))
		(Graph grDRAW_LINE temp0 temp1 temp0 temp3 temp4 -1 -1)
		(Graph grDRAW_LINE temp0 temp3 temp2 temp3 temp4 -1 -1)
		(Graph grDRAW_LINE temp2 temp3 temp2 temp1 temp4 -1 -1)
		(Graph grDRAW_LINE temp2 temp1 temp0 temp1 temp4 -1 -1)
		(Graph
			grUPDATE_BOX
			(- nsTop 2)
			(- nsLeft 2)
			(+ nsBottom 2)
			(+ nsRight 2)
			1
		)
	)
	
	(method (onMe param1)
		(return (if (super onMe: param1) (not (& signal $0004)) else 0))
	)
	
	(method (ownedBy param1)
		(return (== owner param1))
	)
	
	(method (moveTo theOwner)
		(= owner theOwner)
		(if (and value (== theOwner gEgo))
			(gGame changeScore: value)
			(= value 0)
		)
		(return self)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(proc255_4 995 0 description)
			)
		)
	)
)

(class Inv of IconBar
	(properties
		elements 0
		size 0
		height 0
		underBits 0
		oldMouseX 0
		oldMouseY 0
		curIcon 0
		highlightedIcon 0
		prevIcon 0
		curInvIcon 0
		useIconItem 0
		helpIconItem 0
		port 0
		window 0
		state $0400
		activateHeight 0
		y 0
		normalHeading 3753
		heading 0
		empty 3772
		curScore 3781
		showScore 1
		iconBarInvItem 0
		okButton 0
		selectIcon 0
	)
	
	(procedure (localproc_01ac param1 param2 &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 gInvFirst temp9 temp10 temp11 temp12 temp13 temp14 temp15 temp16 temp17 temp18 temp19 temp20)
		(= temp0
			(= temp1 (= temp2 (= temp3 (= temp4 (= temp5 0)))))
		)
		(= gInvFirst (gInv first:))
		(while gInvFirst
			(if
			((= temp9 (NodeValue gInvFirst)) isKindOf: InvI)
				(if (temp9 ownedBy: param1)
					(temp9 signal: (& (temp9 signal?) $fffb))
					(++ temp0)
					(if
						(>
							(= temp6
								(CelWide (temp9 view?) (temp9 loop?) (temp9 cel?))
							)
							temp2
						)
						(= temp2 temp6)
					)
					(if
						(>
							(= temp7
								(CelHigh (temp9 view?) (temp9 loop?) (temp9 cel?))
							)
							temp1
						)
						(= temp1 temp7)
					)
				else
					(temp9 signal: (| (temp9 signal?) $0004))
				)
			else
				(++ temp3)
				(= temp5
					(+
						temp5
						(CelWide (temp9 view?) (temp9 loop?) (temp9 cel?))
					)
				)
				(if
					(>
						(= temp7
							(CelHigh (temp9 view?) (temp9 loop?) (temp9 cel?))
						)
						temp4
					)
					(= temp4 temp7)
				)
			)
			(= gInvFirst (gInv next: gInvFirst))
		)
		(if (not temp0)
			(proc255_4 995 1 normalHeading empty)
			(return 0)
		)
		(if
			(>
				(* (= temp16 (Sqrt temp0)) (= temp16 (Sqrt temp0)))
				temp0
			)
			(-- temp16)
		)
		(if (> temp16 3) (= temp16 3))
		(if
		(< (* temp16 (= local0 (/ temp0 temp16))) temp0)
			(++ local0)
		)
		(= temp10
			(proc999_3 (+ 4 temp5) (* local0 (+ 4 temp2)))
		)
		(= temp12
			(/ (- 190 (= temp11 (* temp16 (+ 4 temp1)))) 2)
		)
		(= temp13 (/ (- 320 temp10) 2))
		(= temp14 (+ temp12 temp11))
		(= temp15 (+ temp13 temp10))
		(if (gInv window?)
			((gInv window?)
				top: temp12
				left: temp13
				right: temp15
				bottom: temp14
				open:
			)
		)
		(= temp20 local0)
		(if temp0
			(= temp18
				(+
					2
					(if ((gInv window?) respondsTo: #yOffset)
						((gInv window?) yOffset?)
					else
						0
					)
				)
			)
			(= temp19
				(= temp17
					(+
						4
						(if ((gInv window?) respondsTo: #xOffset)
							((gInv window?) xOffset?)
						else
							0
						)
					)
				)
			)
			(= gInvFirst (gInv first:))
			(while gInvFirst
				(if
					(and
						(not
							(& ((= temp9 (NodeValue gInvFirst)) signal?) $0004)
						)
						(temp9 isKindOf: InvI)
					)
					(if (not (& (temp9 signal?) $0080))
						(temp9
							nsLeft:
								(+
									temp17
									(/
										(-
											temp2
											(= temp6
												(CelWide (temp9 view?) (temp9 loop?) (temp9 cel?))
											)
										)
										2
									)
								)
							nsTop:
								(+
									temp18
									(/
										(-
											temp1
											(= temp7
												(CelHigh (temp9 view?) (temp9 loop?) (temp9 cel?))
											)
										)
										2
									)
								)
						)
						(temp9
							nsRight: (+ (temp9 nsLeft?) temp6)
							nsBottom: (+ (temp9 nsTop?) temp7)
						)
						(if (-- temp20)
							(= temp17 (+ temp17 temp2))
						else
							(= temp20 local0)
							(= temp18 (+ temp18 temp1))
							(= temp17 temp19)
						)
					else
						(= temp17 (temp9 nsLeft?))
						(= temp18 (temp9 nsTop?))
					)
					(temp9 show:)
					(if (== temp9 param2) (temp9 highlight:))
				)
				(= gInvFirst (gInv next: gInvFirst))
			)
		)
		(= temp17
			(/
				(-
					(- ((gInv window?) right?) ((gInv window?) left?))
					temp5
				)
				2
			)
		)
		(= temp11
			(- ((gInv window?) bottom?) ((gInv window?) top?))
		)
		(= temp18 32767)
		(= gInvFirst (gInv first:))
		(while gInvFirst
			(if
			(not ((= temp9 (NodeValue gInvFirst)) isKindOf: InvI))
				(= temp6
					(CelWide (temp9 view?) (temp9 loop?) (temp9 cel?))
				)
				(= temp7
					(CelHigh (temp9 view?) (temp9 loop?) (temp9 cel?))
				)
				(if (not (& (temp9 signal?) $0080))
					(if (== temp18 32767) (= temp18 (- temp11 temp7)))
					(temp9
						nsLeft: temp17
						nsTop: temp18
						nsBottom: temp11
						nsRight: (+ temp17 temp6)
					)
				)
				(= temp17 (+ (temp9 nsLeft?) temp6))
				(= temp18 (temp9 nsTop?))
				(temp9 signal: (& (temp9 signal?) $fffb) show:)
			)
			(= gInvFirst (gInv next: gInvFirst))
		)
		(return 1)
	)
	
	
	(method (init)
		(= gInv self)
		(= heading normalHeading)
	)
	
	(method (doit &tmp temp0 temp1 temp2 temp3 [temp4 3] temp7 temp8 temp9)
		(asm
code_08dd:
			pushi    #type
			pushi    0
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp1
			send     4
			bnt      code_08f8
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			jmp      code_08dd
code_08f8:
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			ldi      0
			sat      temp1
code_0903:
			pushi    #new
			pushi    0
			class    Event
			send     4
			sat      temp1
			bnt      code_0d0d
			pTos     state
			ldi      32
			and     
			bnt      code_0d0d
			ldi      0
			sat      temp9
			pushi    #localize
			pushi    0
			lat      temp1
			send     4
			pToa     curIcon
			bnt      code_09ad
			pushi    #modifiers
			pushi    0
			lat      temp1
			send     4
			not     
			bnt      code_09ad
			pTos     curIcon
			pToa     selectIcon
			ne?     
			bnt      code_09ad
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      1
			eq?     
			bt       code_0982
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      4
			eq?     
			bnt      code_096c
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      13
			eq?     
			bnt      code_096c
			ldi      1
			sat      temp9
			bt       code_0982
code_096c:
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      256
			eq?     
			bnt      code_09ad
			ldi      1
			sat      temp9
			bnt      code_09ad
code_0982:
			pTos     curIcon
			pToa     helpIconItem
			ne?     
			bt       code_0998
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      16
			and     
			bnt      code_09ad
code_0998:
			pushi    #type
			pushi    1
			pushi    16384
			pushi    40
			pushi    1
			pushi    #message
			pushi    0
			pToa     curIcon
			send     4
			push    
			lat      temp1
			send     12
code_09ad:
			pushi    1
			lst      temp1
			callk    MapKeyToDir,  2
			pushi    #type
			pushi    0
			lat      temp1
			send     4
			sat      temp3
			push    
			ldi      1
			eq?     
			bnt      code_09de
			pushi    #modifiers
			pushi    0
			lat      temp1
			send     4
			bnt      code_09de
			pushi    #advanceCurIcon
			pushi    0
			self     4
			pushi    #claimed
			pushi    1
			pushi    1
			lat      temp1
			send     6
			jmp      code_0d03
code_09de:
			lst      temp3
			ldi      0
			eq?     
			bnt      code_0a07
			pushi    #firstTrue
			pushi    2
			pushi    196
			lst      temp1
			self     8
			sat      temp0
			bnt      code_0a07
			push    
			pToa     highlightedIcon
			ne?     
			bnt      code_0a07
			pushi    #highlight
			pushi    1
			lst      temp0
			self     6
			jmp      code_0d03
code_0a07:
			lst      temp3
			ldi      1
			eq?     
			bt       code_0a2e
			lst      temp3
			ldi      4
			eq?     
			bnt      code_0a25
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      13
			eq?     
			bt       code_0a2e
code_0a25:
			lst      temp3
			ldi      256
			eq?     
			bnt      code_0abf
code_0a2e:
			pushi    1
			pTos     highlightedIcon
			callk    IsObject,  2
			bnt      code_0d03
			pushi    168
			pushi    #-info-
			pTos     highlightedIcon
			lst      temp3
			ldi      1
			eq?     
			push    
			self     8
			bnt      code_0d03
			pTos     highlightedIcon
			pToa     okButton
			eq?     
			bnt      code_0a56
			jmp      code_0d0d
			jmp      code_0d03
code_0a56:
			pTos     highlightedIcon
			pToa     helpIconItem
			eq?     
			bnt      code_0aa7
			pTos     state
			ldi      2048
			and     
			bnt      code_0a70
			pushi    #noClickHelp
			pushi    0
			self     4
			jmp      code_0d03
code_0a70:
			pushi    #cursor
			pushi    0
			pToa     highlightedIcon
			send     4
			push    
			ldi      65535
			ne?     
			bnt      code_0a8e
			pushi    #setCursor
			pushi    1
			pushi    #cursor
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			lag      gGame
			send     6
code_0a8e:
			pToa     helpIconItem
			bnt      code_0d03
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			send     4
			push    
			ldi      16
			or      
			push    
			pToa     helpIconItem
			send     6
			jmp      code_0d03
code_0aa7:
			pToa     highlightedIcon
			aTop     curIcon
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      gGame
			send     8
			jmp      code_0d03
code_0abf:
			lst      temp3
			ldi      64
			and     
			bnt      code_0b68
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			dup     
			ldi      3
			eq?     
			bnt      code_0adf
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0b64
code_0adf:
			dup     
			ldi      7
			eq?     
			bnt      code_0aef
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0b64
code_0aef:
			dup     
			ldi      1
			eq?     
			bnt      code_0b27
			pToa     highlightedIcon
			bnt      code_0b1e
			pushi    3
			push    
			pushi    #nsTop
			pushi    0
			send     4
			push    
			ldi      1
			sub     
			push    
			pushi    0
			call     localproc_0851,  6
			sat      temp0
			bnt      code_0b1e
			pushi    #highlight
			pushi    2
			lst      temp0
			pushi    1
			self     8
			jmp      code_0b64
code_0b1e:
			pushi    #retreat
			pushi    0
			self     4
			jmp      code_0b64
code_0b27:
			dup     
			ldi      5
			eq?     
			bnt      code_0b64
			pToa     highlightedIcon
			bnt      code_0b5e
			pushi    3
			push    
			pushi    #nsBottom
			pushi    0
			send     4
			push    
			ldi      1
			add     
			push    
			pushi    #bottom
			pushi    0
			pToa     window
			send     4
			push    
			call     localproc_0851,  6
			sat      temp0
			bnt      code_0b5e
			pushi    #highlight
			pushi    2
			lst      temp0
			pushi    1
			self     8
			jmp      code_0b64
code_0b5e:
			pushi    #advance
			pushi    0
			self     4
code_0b64:
			toss    
			jmp      code_0d03
code_0b68:
			lst      temp3
			ldi      4
			eq?     
			bnt      code_0b9a
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			dup     
			ldi      9
			eq?     
			bnt      code_0b88
			pushi    #advance
			pushi    0
			self     4
			jmp      code_0b96
code_0b88:
			dup     
			ldi      3840
			eq?     
			bnt      code_0b96
			pushi    #retreat
			pushi    0
			self     4
code_0b96:
			toss    
			jmp      code_0d03
code_0b9a:
			lst      temp3
			ldi      16384
			eq?     
			bnt      code_0d03
			pushi    #firstTrue
			pushi    2
			pushi    196
			lst      temp1
			self     8
			sat      temp0
			bnt      code_0d03
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			ldi      6
			eq?     
			bnt      code_0c42
			lat      temp0
			bnt      code_0c21
			pushi    #helpStr
			pushi    0
			send     4
			bnt      code_0c21
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      gSysWindow
			send     6
			bnt      code_0c0e
			pushi    #eraseOnly
			pushi    0
			lag      gSysWindow
			send     4
			sat      temp7
			pushi    #eraseOnly
			pushi    1
			pushi    1
			lag      gSysWindow
			send     6
			pushi    3
			pushi    995
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp0
			send     4
			push    
			calle    proc255_4,  6
			pushi    #eraseOnly
			pushi    1
			lst      temp7
			lag      gSysWindow
			send     6
			jmp      code_0c21
code_0c0e:
			pushi    3
			pushi    995
			pushi    0
			pushi    #helpStr
			pushi    0
			lat      temp0
			send     4
			push    
			calle    proc255_4,  6
code_0c21:
			pushi    17
			pushi    #superClass
			pushi    #signal
			pushi    0
			pToa     helpIconItem
			send     4
			push    
			ldi      65519
			and     
			push    
			pToa     helpIconItem
			send     6
			pushi    #setCursor
			pushi    1
			pushi    999
			lag      gGame
			send     6
			jmp      code_0d03
code_0c42:
			lst      temp0
			pToa     okButton
			eq?     
			bnt      code_0c59
			pushi    #select
			pushi    1
			lst      temp0
			super    IconBar,  6
			bnt      code_0c56
code_0c56:
			jmp      code_0d03
code_0c59:
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			lat      temp0
			send     6
			not     
			bnt      code_0c8e
			pushi    #select
			pushi    2
			lst      temp0
			lat      temp9
			not     
			push    
			self     8
			bnt      code_0d03
			lat      temp0
			aTop     curIcon
			pushi    #setCursor
			pushi    2
			pushi    #cursor
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    1
			lag      gGame
			send     8
			jmp      code_0d03
code_0c8e:
			pToa     curIcon
			bnt      code_0d03
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      gSysWindow
			send     6
			bnt      code_0cb3
			pushi    #eraseOnly
			pushi    0
			lag      gSysWindow
			send     4
			sat      temp7
			pushi    #eraseOnly
			pushi    1
			pushi    1
			lag      gSysWindow
			send     6
code_0cb3:
			pushi    #isKindOf
			pushi    1
			class    InvI
			push    
			pToa     curIcon
			send     6
			bnt      code_0cdc
			pushi    #doVerb
			pushi    2
			pushi    #message
			pushi    0
			pToa     curIcon
			send     4
			push    
			pushi    #indexOf
			pushi    1
			pTos     curIcon
			self     6
			push    
			lat      temp0
			send     8
			jmp      code_0cec
code_0cdc:
			pushi    #doVerb
			pushi    1
			pushi    #message
			pushi    0
			lat      temp1
			send     4
			push    
			lat      temp0
			send     6
code_0cec:
			pushi    #respondsTo
			pushi    1
			pushi    340
			lag      gSysWindow
			send     6
			bnt      code_0d03
			pushi    #eraseOnly
			pushi    1
			lst      temp7
			lag      gSysWindow
			send     6
code_0d03:
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			jmp      code_0903
code_0d0d:
			pushi    #dispose
			pushi    0
			lat      temp1
			send     4
			pushi    #hide
			pushi    0
			self     4
			ret     
		)
	)
	
	(method (showSelf param1)
		(gNewSounds pause:)
		(if (and global77 (global77 respondsTo: #stop))
			(global77 stop:)
		)
		(if (gIconBar height?) (gIconBar hide:))
		(if (not window) (= window (SysWindow new:)))
		(if (window window?) (window dispose:) (= window 0))
		(if (not okButton)
			(= okButton (NodeValue (self first:)))
		)
		(= curIcon 0)
		(if (self show: (if argc param1 else gEgo))
			(self doit:)
		)
	)
	
	(method (show param1 &tmp temp0 temp1)
		(gGame
			setCursor: (if curIcon (curIcon cursor?) else (selectIcon cursor?))
		)
		(= temp0 (PicNotValid))
		(PicNotValid 0)
		(= state (| state $0020))
		(if
			(not
				(= temp1
					(localproc_01ac
						(if argc param1 else gEgo)
						(gIconBar curIcon?)
					)
				)
			)
			(= state (& state $ffdf))
		)
		(PicNotValid temp0)
		(return temp1)
	)
	
	(method (hide)
		(if (& state $0020)
			(gNewSounds pause: 0)
			(= state (& state $ffdf))
		)
		(if window (window dispose:))
		(if
		(and (IsObject curIcon) (curIcon isKindOf: InvI))
			(if (not (gIconBar curInvIcon?))
				(gIconBar enable: (gIconBar useIconItem?))
			)
			(gIconBar
				curIcon: ((gIconBar useIconItem?)
					cursor: (curIcon cursor?)
					yourself:
				)
				curInvIcon: curIcon
			)
			(if (curIcon cursor?)
				(gGame setCursor: (curIcon cursor?) 1)
			)
		)
	)
	
	(method (advance param1 &tmp temp0 temp1 temp2 temp3)
		(= temp1 (if argc param1 else 1))
		(= temp3
			(+ temp1 (= temp2 (self indexOf: highlightedIcon)))
		)
		(repeat
			(= temp0
				(self
					at: (if (<= temp3 size) temp3 else (mod temp3 (- size 1)))
				)
			)
			(if (not (IsObject temp0))
				(= temp0 (NodeValue (self first:)))
			)
			(breakif (not (& (temp0 signal?) $0004)))
			(++ temp3)
		)
		(gGame
			setCursor:
				gCursorNumber
				1
				(+
					(temp0 nsLeft?)
					(/ (- (temp0 nsRight?) (temp0 nsLeft?)) 2)
				)
				(- (temp0 nsBottom?) 3)
		)
		(self highlight: temp0)
	)
	
	(method (retreat param1 &tmp temp0 temp1 temp2 temp3)
		(= temp1 (if argc param1 else 1))
		(= temp3
			(- (= temp2 (self indexOf: highlightedIcon)) temp1)
		)
		(repeat
			(= temp0 (self at: temp3))
			(if (not (IsObject temp0))
				(= temp0 (NodeValue (self last:)))
			)
			(breakif (not (& (temp0 signal?) $0004)))
			(-- temp3)
		)
		(gGame
			setCursor:
				gCursorNumber
				1
				(+
					(temp0 nsLeft?)
					(/ (- (temp0 nsRight?) (temp0 nsLeft?)) 2)
				)
				(- (temp0 nsBottom?) 3)
		)
		(self highlight: temp0)
	)
	
	(method (advanceCurIcon &tmp theCurIcon)
		(= theCurIcon curIcon)
		(while
			((= theCurIcon
				(self at: (mod (+ (self indexOf: theCurIcon) 1) size))
			)
				isKindOf: InvI
			)
		)
		(= curIcon theCurIcon)
		(gGame setCursor: (curIcon cursor?) 1)
	)
	
	(method (ownedBy param1)
		(self firstTrue: #ownedBy param1)
	)
)
