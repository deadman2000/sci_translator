;;; Sierra Script 1.0 - (do not remove this comment)
(script# 856)
(include sci.sh)
(use n000)
(use n255)
(use n857)
(use n999)


(class Denomination of DIcon
	(properties
		type $0004
		state $0000
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		key 0
		said 0
		value 1
		view 0
		loop 0
		cel 0
		number 0
		taken 0
		taker 0
		giver 0
		client 0
	)
	
	(method (dispose)
		(= taker (= giver 0))
		(super dispose: &rest)
	)
	
	(method (get param1 &tmp temp0)
		(= temp0
			(cond 
				((not argc) 0)
				((not (IsObject param1)) param1)
				((== param1 taker) -1)
				(else 1)
			)
		)
		(if
		(and (<= 0 (- number temp0)) (<= 0 (+ taken temp0)))
			(= number (- number temp0))
			(= taken (+ taken temp0))
			(if (IsObject param1) (taker draw:) (giver draw:))
			(client get:)
		)
		(return (* value taken))
	)
	
	(method (put theTaken)
		(if argc (= taken theTaken))
		(self get: (- taken))
		(return (* value number))
	)
)

(instance addValue of Code
	(properties)
	
	(method (doit param1 param2)
		(param2
			value: (+
				(param2 value?)
				(* (param1 value?) (param1 number?))
			)
			taken: (+
				(param2 taken?)
				(* (param1 value?) (param1 taken?))
			)
		)
	)
)

(class Money of List
	(properties
		elements 0
		size 0
		value 0
		taken 0
		view 0
		loop 0
		window 0
		color 4
		font 1
		cursor 0
		keepStr 684
		giveStr 689
		owner 0
		number -1
		title 0
	)
	
	(method (init)
		(self add: &rest eachElementDo: #client self get:)
	)
	
	(method (doit &tmp newMoneyDialog temp1)
		(= taken 0)
		((= newMoneyDialog (MoneyDialog new:))
			name: {MoneyD}
			text: title
			init: self
			doit:
			dispose:
		)
		(return taken)
	)
	
	(method (get)
		(= value (= taken 0))
		(self eachElementDo: #perform addValue self)
		(if (not (proc999_5 -1 owner number))
			(cond 
				(value ((global9 at: number) owner: owner))
				((== owner gEgo) (gEgo put: number))
				(else ((global9 at: number) owner: 0))
			)
		)
		(return taken)
	)
	
	(method (put)
		(self eachElementDo: #put get:)
		(return value)
	)
)
