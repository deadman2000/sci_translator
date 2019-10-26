;;; Sierra Script 1.0 - (do not remove this comment)
(script# 480)
(include sci.sh)
(use n000)
(use n013)
(use n806)
(use n812)
(use n813)
(use n851)
(use n852)
(use n927)
(use n945)
(use n946)
(use n950)
(use n989)
(use n992)
(use n998)
(use n999)

(public
	rm480 0
)

(local
	local0
	local1
	[local2 9] = [330 169 250 174 208 188 208 238 -32768]
	[local11 17] = [-10 175 12 169 79 165 122 152 202 152 257 168 312 168 330 175 -32768]
	[local28 11] = [134 238 134 188 109 188 12 169 -10 175 -32768]
	[theRegister_2 7] = [23 163 23 156 54 145 -32768]
	[theRegister 7] = [296 163 296 156 267 145 -32768]
	[local53 5] = [1480 17 1]
	[local58 5] = [1480 0 1]
	[local63 5] = [1480 1 1]
	[local68 5] = [1480 2 1]
)
(instance rm480 of StdRoom
	(properties
		picture 480
		east 450
		south 450
		west 450
	)
	
	(method (init)
		(self setRegions: 452)
		(= local0 (ScriptID 452 1))
		(proc0_2 3)
		(if (== gHeading 45)
			(self setScript: arrived)
		else
			(gEgo edgeHit: 1)
			(gEgo x: 105 y: 188)
		)
		(super init:)
		(if (!= (gRgnMusic number?) 455)
			(gRgnMusic number: 455 loop: -1 play:)
		)
		(gClient
			addObstacle:
				((Polygon new:)
					type: 2
					init: 319 1 319 161 257 165 208 146 119 146 64 162 41 164 0 158 0 1
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 79 180 86 167 230 167 236 180
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 109 188 111 181 201 181 205 188
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 93 189 0 189 0 171
					yourself:
				)
				((Polygon new:)
					type: 2
					init: 213 189 306 166 307 179 319 179 319 189
					yourself:
				)
		)
		(gEgo illegalBits: 0)
		(lDoor init:)
		(rDoor init:)
		(ceiling init:)
		(altar init:)
		(reliquary init:)
		(windows init:)
		(pews init:)
		(book init:)
		(chapel init:)
		(if (proc0_5 95)
			(lDoor lookStr: 10)
			(rDoor lookStr: 10)
		)
		(if (== global130 10)
			(proc0_7 99)
		else
			(lDoor setScript: monks)
		)
		(gEgo actions: (ScriptID 452 3))
	)
	
	(method (dispose)
		(DisposeScript 852)
		(DisposeScript 927)
		(super dispose:)
	)
)

(instance arrived of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gEgo edgeHit: 0)
				(proc0_2 2)
				(if (> (gEgo x?) 227)
					(= register @theRegister)
					(rDoor setCel: (rDoor lastCel:))
				else
					(= register @theRegister_2)
					(lDoor setCel: (lDoor lastCel:))
				)
				(gEgo
					x: (proc999_6 register 4)
					y: (proc999_6 register 5)
					setMotion: PPath register 1 0 self
				)
			)
			(1
				(proc0_2 2)
				(if (== register @theRegister)
					(rDoor
						signal: (& (rDoor signal?) $feff)
						startUpd:
						setCycle: Beg self
					)
				else
					(lDoor startUpd: setCycle: Beg self)
				)
			)
			(2
				(doorSound number: 938 play:)
				(if (== register @theRegister)
					(rDoor signal: (| (rDoor signal?) $0100) stopUpd:)
				else
					(lDoor stopUpd:)
				)
				(proc0_4)
				(self dispose:)
			)
		)
	)
)

(instance monks of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= seconds
					(if (or (== global130 5) (== global130 6))
						(Random 15 30)
					else
						(Random 4 8)
					)
				)
			)
			(1
				(if (gClient script?)
					(= state -1)
					(= cycles 1)
				else
					(= register
						(switch (Random 1 3)
							(1 @local2)
							(2 @local11)
							(3 @local28)
						)
					)
					(local0
						init:
						posn: (proc999_6 register 0) (proc999_6 register 1)
						setCycle: SyncWalk
						setAvoider: PAvoider
						setMotion: PPath (+ register 4) self
						actions: wanderVerbs
					)
				)
			)
			(2
				(local0 dispose: actions: 0)
				(= state -1)
				(= cycles 1)
			)
		)
	)
)

(instance wanderVerbs of SpecialDoVerb
	(properties)
	
	(method (doVerb theVerb)
		(if (== theVerb 5) (proc851_0 @local53 10) (return 1))
		(return 0)
	)
)

(instance openDoor of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gEgo
					setAvoider: PAvoider
					setMotion: PolyPath (register x?) 163 self
				)
				(local0 setAvoider: 0)
			)
			(1
				(if (or (gNewCast contains: local0) (proc0_5 99))
					(cond 
						((proc0_5 99) (= state 9))
						((proc0_5 98) (proc0_6 99) (= state 7))
						((proc0_5 97) (proc0_6 98) (= state 3))
						(else (proc0_6 97) (= state 3))
					)
					(= cycles 1)
				else
					(register signal: 24582 setCycle: End self)
				)
			)
			(2
				(doorSound number: 937 play:)
				(if (== register lDoor)
					(gEgo setMotion: PPath @theRegister_2 1 2 self)
				else
					(gEgo setMotion: PPath @theRegister 1 2 self)
				)
			)
			(3
				(proc806_1 10 95)
				(gClient newRoom: 45)
			)
			(4
				(= local1 (local0 mover?))
				(local0 ignoreActors: 1 mover: 0)
				(proc0_9 local0 gEgo)
				(= cycles 1)
			)
			(5
				(proc851_0 @local58 10 0 self)
			)
			(6
				(gEgo setMotion: PolyPath 159 189 self)
			)
			(7
				(proc0_9 local0 gEgo)
				(gEgo setMotion: MoveTo 159 188 self)
			)
			(8 (= seconds 2))
			(9
				(local0 ignoreActors: 0 mover: local1)
				(proc0_9 local0 local1)
				(proc0_4)
				(self dispose:)
			)
			(10
				(local0 ignoreActors: 1 setMotion: 0)
				(proc0_9 local0 gEgo)
				(proc851_0 @local63 10 0 self)
			)
			(11
				(gEgo setMotion: PolyPath 108 190)
				(self dispose:)
			)
			(12
				(proc851_0 @local68 999 0 self)
			)
			(13 (proc0_4) (self dispose:))
		)
	)
)

(instance lDoor of Prop
	(properties
		x 41
		y 159
		lookStr 9
		view 480
		priority 10
		signal $6811
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(gClient setScript: openDoor 0 self)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance rDoor of Prop
	(properties
		x 282
		y 160
		lookStr 9
		view 480
		loop 1
		priority 11
		signal $6911
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(gClient setScript: openDoor 0 self)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance ceiling of Feature
	(properties
		onMeCheck $0008
		lookStr 4
	)
)

(instance altar of Feature
	(properties
		x 156
		y 184
		onMeCheck $0010
		lookStr 5
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(proc13_4 1480 14)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance reliquary of Feature
	(properties
		x 156
		y 174
		onMeCheck $0080
		lookStr 6
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 2)
			(super doVerb: theVerb)
		else
			(altar doVerb: theVerb param2)
		)
	)
)

(instance windows of Feature
	(properties
		y 146
		onMeCheck $0002
		lookStr 7
	)
	
	(method (onMe param1 param2)
		(if (IsObject param1)
			(= x (if (< (param1 x?) 160) 94 else 288))
		)
		(super onMe: param1 param2)
	)
)

(instance pews of Feature
	(properties
		onMeCheck $0100
		lookStr 8
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(proc13_4 1480 15)
		else
			(super doVerb: theVerb param2)
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(if (IsObject param1)
			(= x (param1 x?))
			(= y (+ (param1 y?) 10))
		)
		(super onMe: param1 param2)
	)
)

(instance book of Feature
	(properties
		x 156
		y 184
		onMeCheck $0020
		lookStr 13
	)
	
	(method (doVerb theVerb param2)
		(if (== theVerb 3)
			(proc13_4 1480 14)
		else
			(super doVerb: theVerb param2)
		)
	)
)

(instance chapel of Feature
	(properties
		onMeCheck $0001
		lookStr 11
	)
)

(instance doorSound of Sound
	(properties
		flags $0001
	)
)
