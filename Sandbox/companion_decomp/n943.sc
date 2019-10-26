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
	theGSysWindow
	[local2 40]
	theLsTop
	theLsLeft
	theLsBottom
	theLsRight
	[local46 25] = [6468 0 0 6476 0 0 6482 0 0 6486 0 0 6493 0 0 6498 0 0 6503 0 0 6508 120]
	[local71 22] = [6513 0 0 6476 0 0 6482 0 0 6522 0 0 6498 0 0 6503 0 0 6508 120]
)
(procedure (localproc_17cc theTheTheLsLeft &tmp temp0 theTheLsLeft theTheLsTop)
	(= theLsRight (= theLsBottom 0))
	(= theLsLeft (= theLsTop 32767))
	(= temp0 0)
	(while (< temp0 argc)
		(= theTheLsLeft [theTheTheLsLeft temp0])
		(if
			(<
				(= theTheLsTop [theTheTheLsLeft (+ temp0 1)])
				theLsTop
			)
			(= theLsTop theTheLsTop)
		)
		(if (> theTheLsTop theLsBottom)
			(= theLsBottom theTheLsTop)
		)
		(if (< theTheLsLeft theLsLeft)
			(= theLsLeft theTheLsLeft)
		)
		(if (> theTheLsLeft theLsRight)
			(= theLsRight theTheLsLeft)
		)
		(= temp0 (+ temp0 2))
	)
	(= theLsLeft (- theLsLeft 2))
	(= theLsTop (- theLsTop 2))
	(= theLsRight (+ theLsRight 2))
	(= theLsBottom (+ theLsBottom 2))
)

(procedure (localproc_184c param1 param2 param3 param4)
	(return
		(+
			(* (+ (/ param1 2) 1) (+ (/ param3 2) 1))
			(* (+ (/ param2 2) 1) (+ (/ param4 2) 1))
		)
	)
)

(procedure (localproc_1877 param1 param2 param3 param4 param5 param6 &tmp temp0)
	(return
		(if
			(and
				(<=
					0
					(localproc_184c
						(- param3 param1)
						(- param4 param2)
						(- param5 param1)
						(- param6 param2)
					)
				)
				(<=
					0
					(localproc_184c
						(- param1 param3)
						(- param2 param4)
						(- param5 param3)
						(- param6 param4)
					)
				)
			)
			(return
				(if
				(= temp0 (GetDistance param1 param2 param3 param4))
					(/
						(Abs
							(localproc_184c
								(- param4 param2)
								(- param1 param3)
								(- param5 param1)
								(- param6 param2)
							)
						)
						temp0
					)
				else
					0
				)
			)
		else
			(return
				(proc999_2
					(GetDistance param5 param6 param1 param2)
					(GetDistance param5 param6 param3 param4)
				)
			)
		)
	)
)

(procedure (localproc_1926)
	(proc255_0 &rest 80 {Polygon Editor 1.11} 33 999 70 240)
)

(class ClickMenu of Obj
	(properties
		text 0
		array 0
	)
	
	(method (init theArray &tmp temp0 temp1 temp2 temp3 [temp4 4] [temp8 40] temp48 temp49)
		(= text (Memory 2 81))
		(Memory 6 text 0)
		(= temp1 (= array theArray))
		(= temp48 0)
		(= temp0 0)
		(while (= temp2 (Memory 5 temp1))
			(StrCpy @temp8 temp2)
			(if (not temp0) (StrCat @temp8 {:_}))
			(StrCat @temp8 {_})
			(StrCat text @temp8)
			(TextSize @temp4 @temp8 0 0)
			(= temp48 (+ temp48 [temp4 3]))
			(Memory 6 (+ temp1 4) temp48)
			(if (not (Memory 5 (+ temp1 2)))
				(if
					(and
						(<= 65 (= temp49 (StrAt temp2 0)))
						(<= (= temp49 (StrAt temp2 0)) 90)
					)
					(= temp49 (+ temp49 32))
				)
				(Memory 6 (+ temp1 2) temp49)
			)
			(++ temp0)
			(= temp1 (+ temp1 6))
		)
		(DrawStatus text)
	)
	
	(method (dispose)
		(Memory 3 text)
		(super dispose:)
	)
	
	(method (handleEvent pEvent &tmp theArray temp1)
		(if (!= (pEvent type?) evMOUSEBUTTON) (return 0))
		(if (>= (pEvent y?) 10) (return 0))
		(= theArray array)
		(= temp1 0)
		(while (Memory 5 theArray)
			(if
			(and (< (pEvent x?) (Memory 5 (+ theArray 4))) temp1)
				(pEvent type: 4 message: (Memory 5 (+ theArray 2)))
				(return 0)
			)
			(++ temp1)
			(= theArray (+ theArray 6))
		)
		(return (pEvent claimed: 1))
	)
)

(instance editMenu of ClickMenu
	(properties)
	
	(method (init)
		(super init: @local46)
	)
)

(instance addMenu of ClickMenu
	(properties)
	
	(method (init)
		(super init: @local71)
	)
)

(class Class_943_3
	(properties
		y 0
		underBits 0
	)
	
	(method (new)
		(Clone self)
	)
	
	(method (yourself)
		(return self)
	)
	
	(method (dispose)
		(if underBits (UnLoad 133 underBits) (= underBits 0))
		(DisposeClone self)
	)
	
	(method (draw param1 &tmp temp0 temp1)
		(if (== local0 4)
			(= temp0 -1)
			(= temp1 4)
		else
			(= temp0 0)
			(= temp1 -1)
		)
		(Graph
			grDRAW_LINE
			y
			x
			(param1 y?)
			(param1 x?)
			temp0
			-1
			temp1
		)
	)
	
	(method (save param1)
		(localproc_17cc x y (param1 x?) (param1 y?))
		(if underBits (UnLoad 133 underBits))
		(= underBits
			(Graph
				grSAVE_BOX
				theLsTop
				theLsLeft
				theLsBottom
				theLsRight
				local0
			)
		)
	)
	
	(method (restore)
		(if underBits
			(Graph grRESTORE_BOX underBits)
			(= underBits 0)
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
		(super
			add: (= curPt
				((Class_943_3 new:) x: param1 y: param2 yourself:)
			)
		)
		(self setCur: (FindKey elements curPt) param3)
	)
	
	(method (next param1 &tmp temp0)
		(= temp0 (super next: param1))
		(if (and closed (not temp0)) (return (super first:)))
		(return temp0)
	)
	
	(method (prev param1 &tmp temp0)
		(= temp0 (super prev: param1))
		(if (and closed (not temp0)) (return (super last:)))
		(return temp0)
	)
	
	(method (draw)
		(self eachLineDo: 83)
	)
	
	(method (advance &tmp temp0)
		(self setCur: (self next: curNode))
	)
	
	(method (retreat &tmp temp0)
		(self setCur: (self prev: curNode))
	)
	
	(method (setCur theCurNode param2)
		(if (= curNode theCurNode)
			(= curPt (NodeValue (= curNode theCurNode)))
			(if (or (< argc 2) param2)
				(SetCursor global20 1 (curPt x?) (curPt y?))
			)
		)
	)
	
	(method (setCurClosest param1)
		(self setCur: (FindKey elements closestPt) param1)
	)
	
	(method (insertPt param1 param2 &tmp temp0)
		(= temp0
			((Class_943_3 new:) x: param1 y: param2 yourself:)
		)
		(self addAfter: closestPt temp0)
		(self setCur: (FindKey elements temp0))
	)
	
	(method (deletePt &tmp temp0)
		(if (== curNode (= temp0 (self prev: curNode)))
			(= temp0 0)
		)
		(self delete: curPt)
		(curPt dispose:)
		(self setCur: temp0)
	)
	
	(method (movePt param1 param2)
		(curPt x: param1 y: param2)
	)
	
	(method (undo param1 &tmp temp0 temp1 temp2 temp3)
		(self eachElementDo: #dispose release:)
		(= closed (Memory 5 param1))
		(= param1 (+ param1 2))
		(= temp1 (Memory 5 param1))
		(= param1 (+ param1 2))
		(= temp3 (Memory 5 param1))
		(= param1 (+ param1 2))
		(= temp2 0)
		(while (< temp2 temp1)
			(self
				add: (Memory 5 param1) (Memory 5 (= param1 (+ param1 2))) 0
			)
			(++ temp2)
			(= param1 (+ param1 2))
		)
		(self setCur: (FindKey elements (self at: temp3)) 0)
	)
	
	(method (saveForUndo &tmp temp0 temp1 _EditablePolygonFirst temp3)
		(= temp1 (= temp0 (Memory 2 (* 2 (+ (* 2 size) 3)))))
		(Memory 6 temp1 closed)
		(= temp1 (+ temp1 2))
		(Memory 6 temp1 size)
		(= temp1 (+ temp1 2))
		(Memory 6 temp1 (self indexOf: curPt))
		(= temp1 (+ temp1 2))
		(= _EditablePolygonFirst (self first:))
		(while _EditablePolygonFirst
			(= temp3 (NodeValue _EditablePolygonFirst))
			(Memory 6 temp1 (temp3 x?))
			(Memory 6 (= temp1 (+ temp1 2)) (temp3 y?))
			(= _EditablePolygonFirst
				(NextNode _EditablePolygonFirst)
			)
			(= temp1 (+ temp1 2))
		)
		(return temp0)
	)
	
	(method (getDistToLine param1 param2 &tmp _EditablePolygonLast _EditablePolygonFirst theClosestPt temp3 temp4 temp5 the_EditablePolygonFirst)
		(if (< size 2)
			(return (self getDistToPt: param1 param2 &rest))
		)
		(= temp4 32767)
		(= _EditablePolygonFirst (self first:))
		(= _EditablePolygonLast (self last:))
		(repeat
			(= theClosestPt (NodeValue _EditablePolygonFirst))
			(= the_EditablePolygonFirst
				(self next: _EditablePolygonFirst)
			)
			(= temp5 (NodeValue the_EditablePolygonFirst))
			(if
				(<
					(= temp3
						(localproc_1877
							(theClosestPt x?)
							(theClosestPt y?)
							(temp5 x?)
							(temp5 y?)
							param1
							param2
						)
					)
					temp4
				)
				(= temp4 temp3)
				(= closestPt theClosestPt)
			)
			(breakif (== _EditablePolygonFirst _EditablePolygonLast))
			(= _EditablePolygonFirst the_EditablePolygonFirst)
		)
		(return temp4)
	)
	
	(method (getDistToPt param1 param2 &tmp _EditablePolygonLast _EditablePolygonFirst theClosestPt temp3 temp4)
		(= temp4 32767)
		(= _EditablePolygonFirst (self first:))
		(= _EditablePolygonLast (self last:))
		(repeat
			(= theClosestPt (NodeValue _EditablePolygonFirst))
			(if
				(<
					(= temp3
						(GetDistance
							param1
							param2
							(theClosestPt x?)
							(theClosestPt y?)
						)
					)
					temp4
				)
				(= temp4 temp3)
				(= closestPt theClosestPt)
			)
			(breakif (== _EditablePolygonFirst _EditablePolygonLast))
			(= _EditablePolygonFirst
				(self next: _EditablePolygonFirst)
			)
		)
		(return temp4)
	)
	
	(method (startRedraw &tmp temp0 temp1 temp2 theCurPt theCurPt_2)
		(if (= temp0 (self next: curNode))
			(= theCurPt (NodeValue (= temp0 (self next: curNode))))
		else
			(= theCurPt curPt)
		)
		(if (= temp1 (self prev: curNode))
			(= theCurPt_2
				(NodeValue (= temp1 (self prev: curNode)))
			)
		else
			(= theCurPt_2 curPt)
		)
		(localproc_17cc
			(theCurPt_2 x?)
			(theCurPt_2 y?)
			(curPt x?)
			(curPt y?)
			(theCurPt x?)
			(theCurPt y?)
		)
		(= lsTop theLsTop)
		(= lsLeft theLsLeft)
		(= lsBottom theLsBottom)
		(= lsRight theLsRight)
	)
	
	(method (endRedraw)
		(localproc_17cc
			(curPt x?)
			(curPt y?)
			lsLeft
			lsTop
			lsRight
			lsBottom
		)
		(Graph
			grUPDATE_BOX
			theLsTop
			theLsLeft
			theLsBottom
			theLsRight
			local0
		)
	)
	
	(method (restore)
		(self eachLineDo: 79)
	)
	
	(method (save)
		(self eachLineDo: 78)
	)
	
	(method (eachLineDo param1 &tmp _EditablePolygonFirst the_EditablePolygonFirst temp2 temp3 _EditablePolygonLast)
		(= _EditablePolygonFirst (self first:))
		(= _EditablePolygonLast (self last:))
		(while
			(or
				(!= _EditablePolygonFirst _EditablePolygonLast)
				closed
			)
			(= the_EditablePolygonFirst
				(self next: _EditablePolygonFirst)
			)
			(= temp2 (NodeValue _EditablePolygonFirst))
			(= temp3 (NodeValue the_EditablePolygonFirst))
			(temp2 param1: temp3 &rest)
			(breakif (== _EditablePolygonFirst _EditablePolygonLast))
			(= _EditablePolygonFirst the_EditablePolygonFirst)
		)
	)
	
	(method (writeObstacle &tmp temp0 temp1 temp2 temp3 temp4)
		(= temp1 (Memory 2 (* size 4)))
		(= temp2 (FirstNode elements))
		(= temp0 temp1)
		(while temp2
			(= temp3 (NodeValue temp2))
			(Memory 6 temp0 (temp3 x?))
			(Memory 6 (+ temp0 2) (temp3 y?))
			(= temp2 (NextNode temp2))
			(= temp0 (+ temp0 4))
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: type
					points: temp1
					size: size
					dynamic: 1
					yourself:
				)
		)
	)
	
	(method (writeFile param1 &tmp temp0 temp1 temp2 temp3 [temp4 10] temp14)
		(param1
			writeString:
				{\t\t\t((Polygon new:)\n}
				{\t\t\t\ttype:_}
				(switch type
					(0 {PTotalAccess})
					(1 {PNearestAccess})
					(2 {PBarredAccess})
					(3 {PContainedAccess})
				)
				{,\n}
		)
		(param1 writeString: {\t\t\t\tinit:\t})
		(= temp14 1)
		(= temp0 17)
		(= temp3 (FirstNode elements))
		(while temp3
			(= temp2 (NodeValue temp3))
			(Format @temp4 943 0 (temp2 x?) (temp2 y?))
			(if
				(>=
					(= temp0 (+ temp0 (= temp1 (+ (StrLen @temp4) 1))))
					80
				)
				(param1 writeString: {\n\t\t\t\t\t\t})
				(= temp14 1)
				(= temp0 (+ 17 temp1))
			)
			(if (not temp14) (param1 writeString: {_}))
			(param1 writeString: @temp4)
			(= temp14 0)
			(= temp3 (NextNode temp3))
		)
		(param1 writeString: {,\n})
		(param1 writeString: {\t\t\t\tyourself\n} {\t\t\t)\n})
	)
	
	(method (getAccessType &tmp temp0)
		(if
			(= temp0
				(proc940_0
					80
					{Polygon access type}
					81
					{Total}
					1
					81
					{ Near_}
					2
					81
					{ Barred_}
					3
					81
					{ Container_}
					4
					121
					type
				)
			)
			(= type
				(-
					(= temp0
						(proc940_0
							80
							{Polygon access type}
							81
							{Total}
							1
							81
							{ Near_}
							2
							81
							{ Barred_}
							3
							81
							{ Container_}
							4
							121
							type
						)
					)
					1
				)
			)
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
			bnt      code_0561
			lat      temp8
			not     
			bnt      code_0561
code_0561:
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
	
	(method (doit param1 &tmp temp0 temp1 polyEditAdd)
		(= polyEditAdd (PolyEdit add:))
		(= temp0 0)
		(= temp1 (param1 points?))
		(while (< temp0 (param1 size?))
			(polyEditAdd
				add: (Memory 5 temp1) (Memory 5 (+ temp1 2)) 0
				type: (param1 type?)
			)
			(++ temp0)
			(= temp1 (+ temp1 4))
		)
		(polyEditAdd closed: 1)
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
		(DrawPic (gClient curPic?) 100 dpCLEAR global40)
		(if (!= global36 -1)
			(DrawPic global36 100 dpNO_CLEAR global40)
		)
		(global10 doit:)
		(gNewCast eachElementDo: #stopUpd)
		(Animate (gNewCast elements?) 0)
		(= theGSysWindow gSysWindow)
		(= gSysWindow SysWindow)
		(= local0 1)
		(self readObstacles:)
		(self changeState: (if size 1 else 0))
		(self draw:)
	)
	
	(method (doit &tmp newEvent [temp1 100])
		(self init:)
		(repeat
			(= newEvent (Event new:))
			(if
			(not (if curMenu (curMenu handleEvent: newEvent)))
				(GlobalToLocal newEvent)
				(breakif (self handleEvent: newEvent))
			)
			(newEvent dispose:)
		)
		(newEvent dispose:)
		(self dispose:)
	)
	
	(method (dispose)
		(self writeObstacles:)
		(if curMenu (curMenu dispose:) (= curMenu 0))
		(if undoPolyBuf
			(Memory 3 undoPolyBuf)
			(= undoPolyBuf 0)
		)
		(DrawStatus {_} 0 0)
		(DrawStatus 0)
		(gNewCast eachElementDo: #startUpd)
		(Animate (gNewCast elements?) 0)
		(self eachElementDo: #draw)
		(= gSysWindow theGSysWindow)
		(DisposeScript 940)
		(DisposeScript 993)
		(super dispose:)
		(DisposeScript 943)
	)
	
	(method (add)
		(super add: (= curPolygon ((_EditablePolygon new:))))
		(return curPolygon)
	)
	
	(method (delete &tmp theCurPolygon)
		(= theCurPolygon curPolygon)
		(self advanceRetreat: 124 68)
		(if (== curPolygon theCurPolygon) (= curPolygon 0))
		(super delete: theCurPolygon &rest)
		(theCurPolygon dispose:)
	)
	
	(method (handleEvent pEvent &tmp pEventModifiers theX theY [temp3 20])
		(= theX x)
		(= theY y)
		(= x (pEvent x?))
		(= y (pEvent y?))
		(switch (pEvent type?)
			(evNULL
				(if curPolygon
					(if
						(and
							isMouseDown
							(not (proc999_5 state 0 2))
							(> (+ (Abs (- theX x)) (Abs (- theY y))) 1)
						)
						(if (!= state 3) (self saveForUndo:))
						(self changeState: 2)
					)
					(if
						(and
							(proc999_5 state 2 0)
							(or (!= theX x) (!= theY y))
						)
						(self movePt: x y)
					)
					(if (== state 2)
						(DrawStatus (Format @temp3 943 2 x y))
					)
				)
			)
			(evMOUSEBUTTON
				(= pEventModifiers (pEvent modifiers?))
				(= isMouseDown 1)
				(cond 
					((& pEventModifiers emCTRL)
						(if (== state 0)
							(self finishAdding:)
							(= isMouseDown 0)
						else
							(self insertPt:)
						)
					)
					((& pEventModifiers emSHIFT) (if (!= state 0) (self deletePt:)) (= isMouseDown 0))
					((== state 0) (self addPt:))
					(else (self selectPt:))
				)
			)
			(evMOUSERELEASE
				(= isMouseDown 0)
				(if (proc999_5 state 2 3) (self changeState: 1))
			)
			(evKEYBOARD
				(switch (pEvent message?)
					(KEY_QUESTION
						(pEvent message: 104)
					)
					(KEY_PAUSE
						(pEvent message: 120)
					)
					(KEY_F2 (pEvent message: 12032))
					(KEY_F4 (pEvent message: 11776))
				)
				(switch (pEvent message?)
					(KEY_TAB
						(if (and (== state 1) curPolygon)
							(self advanceRetreat: 68 121)
						)
					)
					(KEY_SHIFTTAB
						(if (and (== state 1) curPolygon)
							(self advanceRetreat: 124 123)
						)
					)
					(KEY_SPACE
						(if (and (== state 1) curPolygon)
							(curPolygon advance:)
						)
					)
					(JOY_UPLEFT
						(if (and (== state 1) curPolygon)
							(curPolygon retreat:)
						)
					)
					(KEY_c
						(if (== state 1)
							(self changeState: 0)
							(= curPolygon 0)
						)
					)
					(KEY_t
						(if (and curPolygon (== state 1))
							(curPolygon getAccessType:)
						)
					)
					(KEY_d
						(cond 
							((== state 1) (if curPolygon (self deletePt:)))
							((== state 0) (self finishAdding:))
						)
					)
					(KEY_h
						(switch state
							(0 (localproc_1926 943 3 30 1))
							(1 (localproc_1926 943 4))
						)
					)
					(KEY_u (self undo:))
					(KEY_m (self showMap: -1))
					(KEY_ALT_v (self showMap: 1))
					(KEY_ALT_c (self showMap: 4))
					(KEY_a
						(localproc_1926 943 5 30 1)
					)
					(KEY_r
						(if (== state 1) (self draw:))
					)
					(KEY_x (return (self exit:)))
					(KEY_ESCAPE
						(if (== state 0) (self finishAdding:))
					)
				)
			)
		)
		(return 0)
	)
	
	(method (changeState newState)
		(if curMenu (curMenu dispose:))
		(= curMenu
			(switch (= state newState)
				(0 addMenu)
				(1 editMenu)
				(2 0)
				(else  0)
			)
		)
		(if curMenu (curMenu init:))
	)
	
	(method (draw)
		(self eachElementDo: #restore)
		(self eachElementDo: #save)
		(self eachElementDo: #draw)
		(Graph grUPDATE_BOX 0 0 190 320 local0)
	)
	
	(method (select param1 param2 &tmp temp0 theCurPolygon temp2 theTheCurPolygon temp4)
		(= temp0 32767)
		(= theCurPolygon 0)
		(= temp4 (FirstNode elements))
		(while temp4
			(if
				(<
					(= temp2
						((= theTheCurPolygon (NodeValue temp4)) param1: x y)
					)
					temp0
				)
				(= temp0 temp2)
				(= theCurPolygon theTheCurPolygon)
			)
			(= temp4 (NextNode temp4))
		)
		((= curPolygon theCurPolygon) setCurClosest: param2)
	)
	
	(method (selectPt &tmp newEvent)
		(self select: 463 1)
		(= newEvent (Event new:))
		(GlobalToLocal newEvent)
		(= x (newEvent x?))
		(= y (newEvent y?))
		(newEvent dispose:)
	)
	
	(method (addPt)
		(self saveForUndo:)
		(if (not curPolygon)
			(self add:)
			(curPolygon add: x y 0)
		)
		(curPolygon add: x y)
	)
	
	(method (finishAdding &tmp polyEditFirst)
		(cond 
			(curPolygon
				(curPolygon closed: 1)
				(if (> (curPolygon size?) 1)
					(curPolygon deletePt: (curPolygon last:) advance:)
				)
				(self draw:)
				(curPolygon getAccessType:)
			)
			((not (= polyEditFirst (self first:))) (= curPolygon 0))
			(else (= curPolygon (NodeValue polyEditFirst)) (self draw:))
		)
		(if curPolygon (self changeState: 1))
	)
	
	(method (movePt param1 param2)
		(curPolygon startRedraw:)
		(self eachElementDo: #restore)
		(curPolygon movePt: param1 param2)
		(self eachElementDo: #save)
		(self eachElementDo: #draw)
		(curPolygon endRedraw:)
	)
	
	(method (insertPt)
		(self eachElementDo: #restore)
		(self select: 462 0)
		(self saveForUndo:)
		(curPolygon insertPt: x y)
		(self changeState: 3)
		(self eachElementDo: #save)
		(self eachElementDo: #draw)
		(Graph grUPDATE_BOX 0 0 190 320 local0)
	)
	
	(method (deletePt &tmp temp0)
		(self eachElementDo: #restore)
		(self select: 463 0)
		(self saveForUndo:)
		(curPolygon deletePt:)
		(if (not (curPolygon size?))
			(self delete: curPolygon)
			(if (not size) (self changeState: 0))
		)
		(self eachElementDo: #save)
		(self eachElementDo: #draw)
		(Graph grUPDATE_BOX 0 0 190 320 local0)
	)
	
	(method (undo &tmp temp0 theUndoPoly theUndoPrvPoly theUndoPolyBuf theUndoX theUndoY theUndoState)
		(if (not undoPoly) (proc255_0 943 6) (return))
		(= theUndoPoly undoPoly)
		(= theUndoPrvPoly undoPrvPoly)
		(= theUndoPolyBuf undoPolyBuf)
		(= theUndoX undoX)
		(= theUndoY undoY)
		(= theUndoState undoState)
		(self saveForUndo: 0)
		(self eachElementDo: #restore)
		(if (= curPolygon theUndoPoly)
			(if (not (self contains: curPolygon))
				(= curPolygon (self add:))
				(if theUndoPrvPoly
					(self addAfter: theUndoPrvPoly curPolygon)
				else
					(self addToFront: curPolygon)
				)
			)
			(curPolygon undo: theUndoPolyBuf)
		else
			(= curPolygon (self add:))
		)
		(Memory 3 theUndoPolyBuf)
		(= x theUndoX)
		(= y theUndoY)
		(self changeState: theUndoState)
		(self eachElementDo: #save)
		(self eachElementDo: #draw)
		(Graph grUPDATE_BOX 0 0 190 320 local0)
		(SetCursor global20 1 x y)
	)
	
	(method (saveForUndo param1)
		(if (= undoPoly curPolygon)
			(= undoPrvPoly (self prev: (= undoPoly curPolygon)))
			(if (and (or (not argc) param1) undoPolyBuf)
				(Memory 3 undoPolyBuf)
			)
			(= undoPolyBuf (curPolygon saveForUndo:))
		)
		(= undoX x)
		(= undoY y)
		(= undoState state)
	)
	
	(method (advanceRetreat param1 param2 &tmp temp0 temp1)
		(= temp1 (FindKey elements curPolygon))
		(if
			(and
				(not (= temp0 (self param1: temp1)))
				(not (= temp0 (self param2: temp1)))
			)
			(= temp0 temp1)
		)
		(= curPolygon (NodeValue temp0))
		(curPolygon setCur: (curPolygon curNode?))
	)
	
	(method (readObstacles)
		(if (gClient obstacles?)
			((gClient obstacles?)
				eachElementDo: #perform readObstacle
			)
		)
	)
	
	(method (writeObstacles)
		(if (gClient obstacles?)
			((gClient obstacles?) eachElementDo: #dispose release:)
		)
		(self eachElementDo: #writeObstacle)
	)
	
	(method (showMap param1)
		(if (== param1 -1)
			(if (== local0 1) (= param1 4) else (= param1 1))
		)
		(if (!= local0 param1)
			(self eachElementDo: #restore)
			(= local0 param1)
			(self eachElementDo: #save)
			(self eachElementDo: #draw)
			(Graph grUPDATE_BOX 0 0 190 320 local0)
		)
	)
	
	(method (exit &tmp [temp0 100] temp100 newClass_993_0 temp102)
		(if (== state 0) (self finishAdding:))
		(self showMap: 1)
		(if (not curPolygon) (return 1))
		(self eachElementDo: #check)
		(if (not local2)
			(Format @local2 943 7 (gClient curPic?))
		)
		(if
			(not
				(= temp100
					(proc940_0
						80
						{Save Polygons}
						{File:_}
						41
						@local2
						25
						106
						81
						{ Save_}
						1
						4
						1
						81
						{Abandon}
						2
						4
						5
						81
						{Cancel}
						0
						4
						5
					)
				)
			)
			(return 0)
		)
		(if (== temp100 2) (return 1))
		(if
			(and
				(FileIO 10 @local2)
				(not
					(= temp100
						(proc940_0
							(Format @temp0 943 8 @local2)
							106
							81
							{Replace}
							1
							81
							{Append}
							2
							81
							{Cancel}
							0
						)
					)
				)
			)
			(return 0)
		)
		(= temp102 (if (== temp100 1) 2 else 0))
		(if
			(not
				((= newClass_993_0 (Class_993_0 new:))
					name: @local2
					open: temp102
				)
			)
			(proc255_4 943 9 (newClass_993_0 name?))
			(newClass_993_0 dispose:)
			(return 0)
		)
		(newClass_993_0
			writeString: (Format @temp0 943 10 {Polygon Editor 1.11})
		)
		(newClass_993_0
			writeString:
				(Format
					@temp0
					943
					11
					{Dynamic Obstacles}
					(gClient curPic?)
				)
		)
		(newClass_993_0
			writeString: {\t\t(curRoom addObstacle:\n}
		)
		(self eachElementDo: #writeFile newClass_993_0)
		(newClass_993_0 writeString: {\t\t)\n})
		(newClass_993_0 dispose:)
		(return 1)
	)
)
