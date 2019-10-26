;;; Sierra Script 1.0 - (do not remove this comment)
(script# 999)
(include sci.sh)
(use n000)
(use n255)

(public
	proc999_0 0
	proc999_1 1
	proc999_2 2
	proc999_3 3
	proc999_4 4
	proc999_5 5
	proc999_6 6
	proc999_7 7
)

(procedure (proc999_0 param1)
	(return (if (< param1 0) -1 else (> param1 0)))
)

(procedure (proc999_1 param1 param2)
	(if
		(<
			(= param1 (- param1 (* param2 (/ param1 param2))))
			0
		)
		(= param1 (+ param1 param2))
	)
	(return param1)
)

(procedure (proc999_2 param1 &tmp temp0)
	(return
		(if
			(or
				(== argc 1)
				(< param1 (= temp0 (proc999_2 &rest)))
			)
			param1
		else
			temp0
		)
	)
)

(procedure (proc999_3 param1 &tmp temp0)
	(return
		(if
			(or
				(== argc 1)
				(> param1 (= temp0 (proc999_3 &rest)))
			)
			param1
		else
			temp0
		)
	)
)

(procedure (proc999_4 param1 param2 param3 param4 param5 param6)
	(return
		(if
			(and
				(<= param1 (if (< argc 6) (param5 x?) else param5))
				(<= (if (< argc 6) (param5 x?) else param5) param3)
			)
			(if
			(<= param2 (if (< argc 6) (param5 y?) else param6))
				(<= (if (< argc 6) (param5 y?) else param6) param4)
			)
		else
			0
		)
	)
)

(procedure (proc999_5 param1 param2 &tmp temp0)
	(= temp0 0)
	(while (< temp0 (- argc 1))
		(if (== param1 [param2 temp0])
			(return (if param1 else 1))
		)
		(++ temp0)
	)
	(return 0)
)

(procedure (proc999_6 param1 param2)
	(Memory 5 (+ param1 (* 2 param2)))
)

(procedure (proc999_7 param1 param2)
	(param1 param2: &rest)
)

(class Obj
	(properties)
	
	(method (new)
		(Clone self)
	)
	
	(method (init)
	)
	
	(method (doit)
		(return self)
	)
	
	(method (dispose)
		(DisposeClone self)
	)
	
	(method (showStr param1)
		(StrCpy param1 name)
	)
	
	(method (showSelf &tmp [temp0 200])
		(proc255_0 (self showStr: @temp0))
	)
	
	(method (perform param1)
		(param1 doit: self &rest)
	)
	
	(method (isKindOf param1 &tmp objSuperClass)
		(= objSuperClass (self superClass?))
		(if
			(and
				(not (== species (param1 species?)))
				(IsObject objSuperClass)
			)
			(objSuperClass isKindOf: param1)
		)
	)
	
	(method (isMemberOf param1)
		(return
			(if
				(and
					(& (param1 -info-?) $8000)
					(not (& -info- $8000))
				)
				(== species (param1 species?))
			else
				0
			)
		)
	)
	
	(method (respondsTo param1)
		(RespondsTo self param1)
	)
	
	(method (yourself)
		(return self)
	)
)

(class Code of Obj
	(properties)
	
	(method (doit)
	)
)

(class Collect of Obj
	(properties
		elements 0
		size 0
	)
	
	(method (doit)
		(self eachElementDo: #doit &rest)
	)
	
	(method (dispose)
		(if elements
			(self eachElementDo: #dispose)
			(DisposeList elements)
		)
		(= size (= elements 0))
		(super dispose:)
	)
	
	(method (showStr param1)
		(Format param1 999 0 name size)
	)
	
	(method (showSelf &tmp [temp0 40])
		(proc255_0 (self showStr: @temp0))
		(self eachElementDo: #showSelf)
	)
	
	(method (add param1 &tmp temp0 temp1 temp2)
		(if (not elements) (= elements (NewList)))
		(= temp1 0)
		(while (< temp1 argc)
			(AddToEnd
				elements
				(NewNode [param1 temp1] [param1 temp1])
			)
			(++ size)
			(++ temp1)
		)
		(return self)
	)
	
	(method (delete param1 &tmp temp0)
		(= temp0 0)
		(while (< temp0 argc)
			(if (DeleteKey elements [param1 temp0]) (-- size))
			(++ temp0)
		)
		(return self)
	)
	
	(method (eachElementDo param1 &tmp temp0 temp1 temp2)
		(= temp0 (FirstNode elements))
		(while temp0
			(= temp1 (NextNode temp0))
			(if (not (IsObject (= temp2 (NodeValue temp0))))
				(return)
			)
			(temp2 param1: &rest)
			(= temp0 temp1)
		)
	)
	
	(method (firstTrue param1 &tmp temp0 temp1 temp2)
		(= temp0 (FirstNode elements))
		(while temp0
			(= temp1 (NextNode temp0))
			(if ((= temp2 (NodeValue temp0)) param1: &rest)
				(return temp2)
			)
			(= temp0 temp1)
		)
		(return 0)
	)
	
	(method (allTrue param1 &tmp temp0 temp1 temp2)
		(= temp0 (FirstNode elements))
		(while temp0
			(= temp1 (NextNode temp0))
			(if
			(not ((= temp2 (NodeValue temp0)) param1: &rest))
				(return 0)
			)
			(= temp0 temp1)
		)
		(return 1)
	)
	
	(method (contains param1)
		(FindKey elements param1)
	)
	
	(method (isEmpty)
		(if (== elements 0) else (EmptyList elements))
	)
	
	(method (first)
		(FirstNode elements)
	)
	
	(method (next param1)
		(NextNode param1)
	)
	
	(method (release &tmp temp0 temp1)
		(= temp0 (FirstNode elements))
		(while temp0
			(= temp1 (NextNode temp0))
			(self delete: (NodeValue temp0))
			(= temp0 temp1)
		)
	)
)

(class List of Collect
	(properties
		elements 0
		size 0
	)
	
	(method (showStr param1)
		(Format param1 999 1 name size)
	)
	
	(method (at param1 &tmp temp0)
		(= temp0 (FirstNode elements))
		(while (and param1 temp0)
			(-- param1)
			(= temp0 (NextNode temp0))
		)
		(return (if temp0 (NodeValue temp0) else 0))
	)
	
	(method (last)
		(LastNode elements)
	)
	
	(method (prev param1)
		(PrevNode param1)
	)
	
	(method (addToFront param1 &tmp temp0)
		(if (not elements) (= elements (NewList)))
		(= temp0 (- argc 1))
		(while (<= 0 temp0)
			(AddToFront
				elements
				(NewNode [param1 temp0] [param1 temp0])
			)
			(++ size)
			(-- temp0)
		)
		(return self)
	)
	
	(method (addToEnd param1 &tmp temp0)
		(if (not elements) (= elements (NewList)))
		(= temp0 0)
		(while (< temp0 argc)
			(AddToEnd
				elements
				(NewNode [param1 temp0] [param1 temp0])
			)
			(++ size)
			(++ temp0)
		)
		(return self)
	)
	
	(method (addAfter param1 param2 &tmp temp0 temp1 temp2)
		(if (= temp2 (FindKey elements param1))
			(-- argc)
			(= temp0 0)
			(while (< temp0 argc)
				(= temp2
					(AddAfter
						elements
						temp2
						(NewNode [param2 temp0] [param2 temp0])
					)
				)
				(++ size)
				(++ temp0)
			)
		)
		(return self)
	)
	
	(method (indexOf param1 &tmp temp0 temp1)
		(= temp0 0)
		(= temp1 (FirstNode elements))
		(while temp1
			(if (== param1 (NodeValue temp1)) (return temp0))
			(++ temp0)
			(= temp1 (NextNode temp1))
		)
		(return -1)
	)
)

(class Set of List
	(properties
		elements 0
		size 0
	)
	
	(method (showStr param1)
		(Format param1 999 2 name size)
	)
	
	(method (add param1 &tmp temp0 temp1 temp2)
		(if (not elements) (= elements (NewList)))
		(= temp1 0)
		(while (< temp1 argc)
			(= temp2 [param1 temp1])
			(if (not (self contains: temp2))
				(AddToEnd elements (NewNode temp2 temp2))
				(++ size)
			)
			(++ temp1)
		)
	)
)

(class EventHandler of Set
	(properties
		elements 0
		size 0
	)
	
	(method (handleEvent pEvent &tmp temp0 temp1 temp2)
		(= temp0 (FirstNode elements))
		(while (and temp0 (not (pEvent claimed?)))
			(= temp1 (NextNode temp0))
			(breakif (not (IsObject (= temp2 (NodeValue temp0)))))
			(temp2 handleEvent: pEvent)
			(= temp0 temp1)
		)
		(pEvent claimed?)
	)
)

(class Script of Obj
	(properties
		client 0
		state $ffff
		start 0
		timer 0
		cycles 0
		seconds 0
		lastSeconds 0
		ticks 0
		lastTicks 0
		register 0
		script 0
		caller 0
		next 0
	)
	
	(method (init theClient theCaller theRegister)
		(= lastTicks gB_moveCnt)
		(if (>= argc 1)
			((= client theClient) script: self)
			(if (>= argc 2)
				(= caller theCaller)
				(if (>= argc 3) (= register theRegister))
			)
		)
		(= state (- start 1))
		(self cue:)
	)
	
	(method (doit &tmp theLastSeconds)
		(if script (script doit:))
		(cond 
			(cycles (if (not (-- cycles)) (self cue:)))
			(seconds
				(if
				(!= lastSeconds (= theLastSeconds (GetTime 1)))
					(= lastSeconds theLastSeconds)
					(if (not (-- seconds)) (self cue:))
				)
			)
			(
				(and
					ticks
					(<=
						(= ticks (- ticks (Abs (- gB_moveCnt lastTicks))))
						0
					)
				)
				(= ticks 0)
				(self cue:)
			)
		)
		(= lastTicks gB_moveCnt)
	)
	
	(method (dispose &tmp temp0)
		(if (IsObject script) (script dispose:))
		(if (IsObject timer) (timer dispose:))
		(if (IsObject client)
			(client
				script:
					(= temp0
						(cond 
							((IsObject next) next)
							(next (ScriptID next))
						)
					)
			)
			(cond 
				((not temp0) 0)
				((== gNewRoomNumber gGHeading) (temp0 init: client))
				(else (temp0 dispose:))
			)
		)
		(if
		(and (IsObject caller) (== gNewRoomNumber gGHeading))
			(caller cue: register)
		)
		(= script (= timer (= client (= next (= caller 0)))))
		(super dispose:)
	)
	
	(method (changeState newState)
		(= state newState)
	)
	
	(method (cue)
		(if client (self changeState: (+ state 1) &rest))
	)
	
	(method (handleEvent pEvent)
		(if script (script handleEvent: pEvent))
		(pEvent claimed?)
	)
	
	(method (setScript theScript)
		(if (IsObject script) (script dispose:))
		(if theScript (theScript init: self &rest))
	)
)

(class Event of Obj
	(properties
		type $0000
		message 0
		modifiers $0000
		y 0
		x 0
		claimed 0
		port 0
	)
	
	(method (new param1 &tmp newSuper)
		(= newSuper (super new:))
		(GetEvent (if argc param1 else 32767) newSuper)
		(return newSuper)
	)
	
	(method (localize &tmp thePort)
		(if (!= type 16384)
			(= thePort (GetPort))
			(cond 
				((not port) (GlobalToLocal self))
				((!= port thePort)
					(SetPort port)
					(LocalToGlobal self)
					(SetPort thePort)
					(GlobalToLocal self)
				)
			)
			(= port thePort)
		)
		(return self)
	)
	
	(method (globalize &tmp temp0)
		(if (!= type 16384)
			(cond 
				((== port (= temp0 (GetPort))) (LocalToGlobal self))
				(port (SetPort port) (LocalToGlobal self) (SetPort temp0))
			)
			(= port 0)
		)
		(return self)
	)
)
