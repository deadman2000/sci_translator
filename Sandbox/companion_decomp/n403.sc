;;; Sierra Script 1.0 - (do not remove this comment)
(script# 403)
(include sci.sh)
(use n000)
(use n013)
(use n400)
(use n806)
(use n813)
(use n851)
(use n945)
(use n953)
(use n992)
(use n996)
(use n998)

(public
	jewelerArrivesScript 0
	matilda 1
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
	[local8 9] = [404 0 2 4 25 29 22 20 18]
	[local17 11] = [1403 0 1 3 2 3 3 1 3 2]
	[local28 10] = [1403 8 1 1 3 3 1 2 3]
	[local38 7] = [1403 16 2 1 1 3]
	[local45 5] = [1403 20 2 1]
	[local50 4] = [1403 22 2]
	[local54 7] = [1403 23 3 1 3 3]
	[local61 4] = [1403 27 2]
	[local65 4] = [1403 28 1]
	[local69 5] = [1403 29 1 2]
	[local74 4] = [1403 32 2]
	[local78 5] = [1403 33 1 2]
	[local83 4] = [1403 35 2]
	[local87 6] = [1403 36 1 3 3]
	[local93 5] = [1403 39 1 3]
	[local98 6] = [1403 41 1 3 3]
	[local104 4] = [1403 44 3]
	[local108 4] = [1403 45 1]
	[local112 6] = [1403 46 1 2 2]
	[local118 6] = [1403 50 2 2 1]
	[local124 7] = [1403 53 1 3 3 2]
	[local131 5] = [1403 57 1 3]
	[local136 6] = [1403 59 3 2 1]
	[local142 7] = [1403 63 1 3 3 2]
	[local149 5] = [1403 67 1 2]
	[local154 5] = [1403 69 1 2]
	[local159 5] = [1403 71 1 3]
	[local164 6] = [1403 73 1 3 3]
	[local170 8] = [1403 76 2 2 1 2 2]
	[local178 4] = [1403 81 2]
	[local182 5] = [1403 82 3 3]
	[local187 4] = [1403 84 3]
	[local191 10] = [1403 85 2 2 1 2 1 2 2]
	[local201 4] = [1403 92 2]
	[local205 5] = [1403 93 3 3]
	[local210 4] = [1403 95 3]
	[local214 13] = [1403 96 1 3 3 2 3 2 1 2 1 3]
	[local227 5] = [1403 106 2 1]
	[local232 9] = [1403 108 2 1 1 2 1 2]
	[local241 34] = [1403 114 2 1 2 1 1 3 1 1 3 1 1 1 3 1 2 2 1 2 1 2 1 1 2 1 2 1 3 3 2 2 2]
	[local275 4] = [1403 145 3]
	[local279 5] = [1403 146 1 3]
	[local284 6] = [1403 148 2 1 3]
	[local290 4] = [1403 151 1]
	[local294 4] = [1403 152 3]
)
(procedure (localproc_0012 param1)
	(proc851_0 3 param1 999 3 12 1 @local8 0 &rest)
)

(instance jewelerArrivesScript of TScript
	(properties)
	
	(method (doit &tmp gEgoX gEgoY temp2 temp3 temp4 temp5 temp6)
		(super doit: &rest)
		(= gEgoX (gEgo x?))
		(= gEgoY (gEgo y?))
		(cond 
			(
			(not (= temp2 (if (User controls?) (gEgo mover?)))) (return))
			((= temp5 (temp2 isMemberOf: PolyPath)) (= temp3 (temp2 finalX?)) (= temp4 (temp2 finalY?)))
			(else (= temp3 (temp2 x?)) (= temp4 (temp2 y?)))
		)
		(if (and (== gEgoX temp3) (== gEgoY temp4)) (return))
		(if (and 1 (< temp3 (gEgo x?)))
			(gEgo setMotion: 0)
			(if local7
				(client setScript: getTableJewels)
			else
				(client setScript: leaveBeforeJewels)
			)
		)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				((= local0 (ScriptID 400 2))
					actions: SheriffJewelerActions
				)
				((= local1 (ScriptID 400 3)) actions: TableActions)
				(= local2 (ScriptID 400 4))
				(= local3 (ScriptID 400 5))
				(= local4 (ScriptID 400 6))
				(proc0_6 145)
				(matilda
					approachX: (local1 approachX?)
					approachY: (local1 approachY?)
					approachVerbs: 5
				)
				(jewelProp init: hide:)
				(gEgo
					setMotion: MoveTo (local1 approachX?) (local1 approachY?) self
				)
			)
			(1 (= cycles 1))
			(2
				(if (and (== gNewGuise 2) (proc0_5 10))
					(self setScript: blondScript)
				else
					(localproc_0012 @local28 self)
				)
			)
			(3 (proc0_4))
		)
	)
)

(instance showJewel of TScript
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY temp2 temp3 temp4)
		(switch (= state newState)
			(0
				(proc0_2)
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(= temp3 ((= temp2 local1) approachX?))
				(= temp4 (temp2 approachY?))
				(if (or (!= gEgoX temp3) (!= gEgoY temp4))
					(gEgo setMotion: MoveTo temp3 temp4 self)
				else
					(gEgo setMotion: 0)
					(self cue:)
				)
			)
			(1
				(gEgo
					view: 32
					loop: 0
					cel: 0
					heading: 90
					setCycle: CT 2 1 self
				)
			)
			(2 (gEgo setCycle: Beg self))
			(3 (proc0_2 0) (self dispose:))
		)
	)
)

(instance blondScript of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_0012 @local17 self)
			)
			(1
				(local2 setMotion: Approach gEgo 1 self)
			)
			(2
				(local2 setMotion: GuardFollow gEgo 30)
				(gEgo setMotion: MoveTo 20 (gEgo y?) self)
			)
			(3
				(= global145 9)
				(gClient newRoom: 170)
				(self dispose:)
			)
		)
	)
)

(instance jewelProp of Prop
	(properties
		x 162
		y 150
		z 22
		view 400
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(if (== 0 (& signal $0080))
					(gClient setScript: getTableJewels)
				)
			)
			(else 
				((global9 at: 7) doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance getTableJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: gatherJewels self)
			)
			(1
				(localproc_0012 @local54 self)
			)
			(2
				(self setScript: spreadJewels self)
			)
			(3
				(localproc_0012 @local61 self)
			)
			(4
				(self setScript: sheriffConvinced self)
			)
			(5 (self dispose:))
		)
	)
)

(instance gatherJewels of TScript
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY temp2 temp3 temp4)
		(switch (= state newState)
			(0
				(gEgo get: 7)
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(= temp3 ((= temp2 local1) approachX?))
				(= temp4 (temp2 approachY?))
				(if (or (!= gEgoX temp3) (!= gEgoY temp4))
					(gEgo setMotion: MoveTo temp3 temp4 self)
				else
					(gEgo setMotion: 0)
					(self cue:)
				)
			)
			(1
				(gEgo view: 32 loop: 1 cel: 0 setCycle: CT 2 1 self)
			)
			(2
				(jewelProp loop: 1 setCycle: Beg self)
			)
			(3
				(jewelProp hide:)
				(gEgo setCycle: Beg self)
			)
			(4 (proc0_2 0) (self dispose:))
		)
	)
)

(instance spreadJewels of TScript
	(properties)
	
	(method (changeState newState &tmp gEgoX gEgoY temp2 temp3 temp4)
		(switch (= state newState)
			(0
				(gEgo put: 7)
				(= gEgoX (gEgo x?))
				(= gEgoY (gEgo y?))
				(= temp3 ((= temp2 local1) approachX?))
				(= temp4 (temp2 approachY?))
				(if (or (!= gEgoX temp3) (!= gEgoY temp4))
					(gEgo setMotion: MoveTo temp3 temp4 self)
				else
					(gEgo setMotion: 0)
					(self cue:)
				)
			)
			(1
				(gEgo view: 32 loop: 1 cel: 0 setCycle: CT 2 1 self)
			)
			(2
				(jewelProp loop: 1 show: setCycle: End self)
			)
			(3 (gEgo setCycle: Beg self))
			(4 (proc0_2 0) (self dispose:))
		)
	)
)

(instance leaveBeforeJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo setMotion: 0)
				(localproc_0012 @local45 self)
			)
			(1
				(local0 loop: 2 setCycle: End self)
			)
			(2
				(localproc_0012 @local50 self)
			)
			(3
				(local2 setMotion: Approach gEgo 15 self)
			)
			(4
				(local2 setMotion: GuardFollow gEgo 15)
				(gEgo setMotion: MoveTo -5 (gEgo y?))
			)
		)
	)
)

(instance sheriffConvinced of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local38 self)
			)
			(1
				(proc806_1 300)
				(proc0_6 181)
				(gClient newRoom: 240)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance jewelerTalkToSheriffAfterJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(++ register)
				(localproc_0012
					(if (== register 1) @local78 else @local83)
					self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance jewelerTalkToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(++ register)
				(localproc_0012
					(if (== register 1) @local69 else @local74)
					self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance matilda of Prop
	(properties
		x 151
		y 131
		z 7
		lookStr 6306
		view 403
		loop 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(3
				(proc13_4 [local65 0] [local65 1])
			)
			(5
				(self setScript: jewelerTalkToMatilda)
			)
			(4
				(switch param2
					(0
						(proc13_4 [local108 0] [local108 1])
					)
					(2
						(self
							setScript: (if local7 EmToMatildaJewels else EmToMatilda)
						)
					)
					(14
						(self
							setScript: (if local7 AmToMatildaJewels else AmToMatilda)
						)
					)
					(10
						(self
							setScript: (if local7 FireToMatildaJewels else FireToMatilda)
						)
					)
					(18
						(self
							setScript: (if local7 WaterToMatildaJewels else WaterToMatilda)
						)
					)
					(7
						(localproc_0012 (if local7 @local279 else @local275))
					)
					(8
						(self setScript: RougeToMatilda)
					)
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance EmToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_0012 @local131 self)
			)
			(1 (proc400_1 gEgo 10 self))
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance EmToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_0012 @local136 self)
			)
			(1 (proc400_1 gEgo 10 self))
			(2
				(localproc_0012 @local142 self)
			)
			(3
				(self setScript: sheriffConvinced self register)
			)
			(4 (proc0_4) (self dispose:))
		)
	)
)

(instance AmToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local159 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance AmToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local164 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance FireToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local182 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance FireToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local187 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance WaterToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local205 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance WaterToMatildaJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local210 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance RougeToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_0012 @local290 self)
			)
			(1
				(gEgo
					setMotion: MoveTo (local1 approachX?) (local1 approachY?) self
				)
			)
			(2 (proc400_1 gEgo 10 self))
			(3
				(localproc_0012 @local294 self)
			)
			(4
				(gEgo put: 8 global11)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance jewelerTalkToMatilda of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(++ register)
				(localproc_0012
					(cond 
						((not local7) (if (== register 1) @local87 else @local93))
						((== register 1) @local98)
						(else @local104)
					)
					self
				)
			)
			(1 (self dispose:))
		)
	)
)

(instance EmToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(localproc_0012 @local112 self)
			)
			(1 (proc0_4) (self dispose:))
		)
	)
)

(instance EmToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= notKilled 1)
				(localproc_0012 @local118 self)
			)
			(1
				(localproc_0012 @local124 self)
			)
			(2
				(self setScript: sheriffConvinced self register)
			)
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance AmToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local149 self)
			)
			(2 (proc400_1 gEgo 10 self))
			(3 (proc0_4) (self dispose:))
		)
	)
)

(instance AmToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local154 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance FireToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local170 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance FireToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local178 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance WaterToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local191 self)
			)
			(2 (proc0_4) (self dispose:))
		)
	)
)

(instance WaterToSheriffJewels of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(localproc_0012 @local201 self)
			)
			(1 (self dispose:))
		)
	)
)

(instance JewelsToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(= local7 (= notKilled 1))
				(self setScript: spreadJewels self)
			)
			(1
				(localproc_0012 @local214 self)
			)
			(2
				(local0 loop: 1 cel: 0 setCycle: End self)
			)
			(3
				(localproc_0012 @local227 self)
			)
			(4 (local0 setCycle: Beg self))
			(5
				(local0 loop: 0 cel: 0 setCycle: 0)
				(localproc_0012 @local232 self)
			)
			(6
				(local2 setMotion: MoveTo -35 (local2 y?) self)
			)
			(7
				(localproc_0012 @local241 self)
			)
			(8
				(local2 setMotion: Approach gEgo 30 self)
			)
			(9
				(local2 setMotion: GuardFollow gEgo 30)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance RougeToSheriff of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(self setScript: showJewel self)
			)
			(1
				(localproc_0012 @local284 self)
			)
			(2
				(gEgo put: 8 global11)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance TableActions of SpecialDoVerb
	(properties)
	
	(method (doVerb)
		(if (and local7 (jewelProp doVerb: &rest))
		else
			(SheriffJewelerActions doVerb: &rest)
		)
	)
)

(instance SheriffJewelerActions of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb param2 &tmp temp0 temp1)
		(= temp0 local0)
		(= temp1 1)
		(switch theVerb
			(5
				(temp0
					setScript:
						(if local7
							jewelerTalkToSheriffAfterJewels
						else
							jewelerTalkToSheriff
						)
				)
			)
			(4
				(switch param2
					(0
						(proc13_4 [local108 0] [local108 1])
					)
					(2
						(cond 
							((== local6 0) (= local6 1) (gEgo setScript: EmToSheriff))
							(local7 (gEgo setScript: EmToSheriffJewels))
							(else (proc13_4 1403 49 1))
						)
					)
					(14
						(temp0
							setScript: (if local7 AmToSheriffJewels else AmToSheriff)
						)
					)
					(10
						(temp0
							setScript: (if local7 FireToSheriffJewels else FireToSheriff)
						)
					)
					(18
						(temp0
							setScript: (if local7 WaterToSheriffJewels else WaterToSheriff)
						)
					)
					(7
						(temp0 setScript: JewelsToSheriff)
					)
					(8
						(temp0 setScript: RougeToSheriff)
					)
					(else  (= temp1 0))
				)
			)
			(else  (= temp1 0))
		)
		(return temp1)
	)
)
