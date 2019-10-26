;;; Sierra Script 1.0 - (do not remove this comment)
(script# 141)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n961)
(use n964)
(use n989)
(use n992)
(use n998)

(public
	theStupor 0
	dancer 1
	spinDown 2
	day2Script 3
)

(local
	local0
	local1
	local2
	[local3 5] = [1140 0 1 1]
)
(instance thisCover of View
	(properties
		x 237
		y 67
		view 140
		loop 4
		priority 4
		signal $0010
	)
)

(instance theEmerald of View
	(properties
		x 210
		y 124
		view 216
		loop 2
		priority 4
		signal $0011
	)
)

(instance flashGreen of Prop
	(properties
		x 165
		y 153
		view 140
		loop 2
	)
)

(instance marian of Actor
	(properties
		x 87
		y 166
		view 220
	)
)

(instance theStupor of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(Load rsSCRIPT 964)
				(= local0 global19)
				(proc0_3)
				(ScriptID 19)
				(thisCover init: stopUpd:)
				(global2 north: 0)
				((ScriptID 19)
					loop: 1
					posn: 164 108
					setCycle: StopWalk 152
					init:
				)
				(= ticks 12)
			)
			(1
				(proc851_0 1 @local3 13 0 self)
			)
			(2
				((ScriptID 19) setMotion: MoveTo 214 104 self)
			)
			(3
				((ScriptID 19) setMotion: MoveTo 229 83 self)
			)
			(4
				(= notKilled 1)
				(gIconBar disable:)
				(global1 setCursor: 5 1 180 125)
				(global5 eachElementDo: #hide)
				(DoSound 19 0)
				(gRgnMusic fade: 0 30 8 1)
				(DrawPic 803 dpOPEN_CHECKBOARD dpCLEAR 0)
				(= ticks 120)
			)
			(5
				((ScriptID 19) dispose:)
				(thisCover dispose:)
				(Display 141 0 100 35 40 102 global185)
				(Display 141 1 100 50 55 102 global185)
				(Display 141 2 100 35 70 102 global185)
				(Display 141 3 100 130 85 102 global185)
				(= seconds 10)
			)
			(6
				(= notKilled 1)
				(DrawPic 210 dpOPEN_CHECKBOARD dpCLEAR 0)
				(marian cycleSpeed: 12 init:)
				(self setScript: dancer self)
				(= ticks 160)
			)
			(7
				(Display 141 4 100 50 10 102 global185)
				(Display 141 5 100 40 25 102 global185)
			)
			(8
				(DrawPic 803 dpOPEN_CHECKBOARD dpCLEAR 0)
				(gEgo hide:)
				(= ticks 80)
			)
			(9
				(DoSound 19 20)
				(gRgnMusic number: 141 loop: -1 vol: 127 play:)
				(DrawPic 140 dpOPEN_CHECKBOARD dpCLEAR 0)
				(gEgo view: 142 loop: 0 cel: 0 posn: 89 92)
				(global5 eachElementDo: #show)
				(global2 north: 150)
				(gEgo get: 2)
				(= ticks 80)
			)
			(10
				(gEgo setCycle: CT 2 1 self)
			)
			(11
				(gEgo setScript: day2Script)
			)
		)
	)
)

(instance dancer of TScript
	(properties)
	
	(method (dispose)
		(gRgnMusic fade: 0 20 12 1)
		(DisposeScript 964)
		(super dispose:)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(gRgnMusic number: 211 loop: -1 vol: 127 play:)
				(++ local1)
				(= cycles 15)
			)
			(1
				(marian loop: 0 cel: 0 posn: 87 166 setCycle: End self)
			)
			(2
				(marian
					loop: 2
					cel: 0
					posn: 100 166
					setCycle: CT 10 1 self
				)
			)
			(3
				(marian
					view: 213
					setLoop: 3
					cel: 3
					posn: 105 167
					setStep: 1 1
					cycleSpeed: 6
					setCycle: Fwd
				)
				(= ticks 30)
			)
			(4
				(marian
					cycleSpeed: 6
					setCycle: Walk
					setMotion:
						DPath
						87
						163
						96
						160
						107
						156
						120
						154
						138
						148
						146
						150
						161
						152
						172
						155
						182
						163
						177
						171
						164
						176
						152
						180
						140
						178
						135
						172
						144
						161
						148
						157
						self
				)
			)
			(5
				(marian setCycle: CT 1 1 self)
			)
			(6
				(marian
					loop: 0
					cel: 2
					posn: 151 156
					cycleSpeed: 12
					setStep: 3 2
					setCycle: Walk
					setMotion: MoveTo 150 155 self
				)
			)
			(7
				(marian view: 220 loop: 1 cel: 0 x: 153 y: 151)
				(self cue:)
			)
			(8
				(marian
					setLoop: 1
					posn: 153 152
					setCel: 0
					setCycle: End self
				)
			)
			(9
				(marian view: 220 setLoop: 0 setCel: 0 setCycle: End self)
			)
			(10
				(marian view: 213 setLoop: 3 setCel: 0 setCycle: End self)
			)
			(11
				(marian view: 213 setLoop: 2 setCel: 0 setCycle: End self)
			)
			(12
				(marian setLoop: 2 setCel: 0 setCycle: End self)
			)
			(13
				(= notKilled 1)
				(marian view: 220 setLoop: 5 setCel: 0 setCycle: End self)
			)
			(14
				(proc0_2)
				(gEgo
					view: 0
					cycleSpeed: 6
					moveSpeed: 6
					posn: 172 230
					show:
					setMotion: MoveTo 172 189 self
				)
			)
			(15 (marian setCycle: Beg self))
			(16
				(DrawPic 210 100 dpCLEAR 0)
				(gRgnMusic fade: 80 20 12 0)
				(marian view: 220 setLoop: 7 setCel: 0 setCycle: End self)
				(vanishSound play:)
			)
			(17
				(marian hide:)
				(flashGreen init: setCycle: Fwd)
				(gEgo
					setMotion: MoveTo (+ (marian x?) 20) (+ (marian y?) 10) self
				)
			)
			(18
				(magicSound play:)
				(marian dispose:)
				(gEgo loop: 7)
				(= ticks 6)
			)
			(19
				(= notKilled 1)
				(proc13_4 1140 2 self)
			)
			(20
				(flashGreen setCycle: 0 dispose:)
				(gEgo view: 7 loop: 0 setCycle: End self)
				(gEgo get: 2)
			)
			(21
				(= notKilled 1)
				(proc13_4 1140 3 self)
			)
			(22 (proc13_4 1140 4 self))
			(23 (self dispose:))
		)
	)
)

(instance spinDown of TScript
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(marian setLoop: 9 setCel: 6)
				(= cycles 1)
			)
			(1
				(marian setLoop: 9 setCel: 1)
				(= cycles 1)
			)
			(2
				(marian setLoop: 11 setCel: 0)
				(= cycles 1)
			)
			(3
				(marian setCel: 1)
				(= cycles 1)
			)
			(4
				(marian setCel: 2)
				(= cycles 1)
			)
			(5
				(marian setCel: 3)
				(= cycles 1)
			)
			(6
				(marian setCel: 4)
				(= cycles 1)
			)
			(7
				(marian setCel: 5)
				(= cycles 1)
			)
			(8
				(marian setCel: 6)
				(= cycles 1)
			)
			(9 (self dispose:))
		)
	)
)

(instance day2Script of TScript
	(properties)
	
	(method (doit)
		(super doit:)
		(if local2 (Palette 6 224 254 local2))
	)
	
	(method (dispose)
		(magicSound dispose:)
		(vanishSound dispose:)
		(global1 setCursor: 0 1)
		(super dispose: &rest)
		(DisposeScript 141)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (proc13_4 1140 5 self))
			(1 (proc13_4 1140 6 self))
			(2 (gEgo setCycle: End self))
			(3 (proc13_4 1140 7 self))
			(4
				(gEgo setLoop: 1 setCel: 1)
				(= ticks 20)
			)
			(5 (proc13_4 1140 8 self))
			(6
				(= local2 -2)
				(gEgo hide:)
				((ScriptID 140 1) hide:)
				((ScriptID 140 2) hide:)
				((ScriptID 140 3) hide:)
				(= notKilled 1)
				(DrawPic 215 dpOPEN_CHECKBOARD dpCLEAR 0)
				(theEmerald init:)
				(magicSound number: 13 play:)
				(= seconds 5)
			)
			(7
				(= local2 0)
				(proc13_4 1140 9 self)
			)
			(8
				((ScriptID 140 1) show:)
				(gEgo show:)
				((ScriptID 140 2) show:)
				((ScriptID 140 3) show:)
				(theEmerald dispose:)
				(DrawPic 140 dpOPEN_CHECKBOARD dpCLEAR 0)
				(magicSound stop: dispose:)
				(= cycles 1)
			)
			(9
				(gEgo setLoop: 1 setCel: 0)
				(= ticks 20)
			)
			(10 (proc13_4 1140 10 self))
			(11
				(gEgo view: 7 setLoop: 2 setCel: 2 posn: 92 101)
				(= ticks 6)
			)
			(12
				(gEgo setCel: 1)
				(= ticks 6)
			)
			(13
				(proc0_2)
				(proc13_4 1140 11 self)
			)
			(14 (proc13_4 1140 12 self))
			(15
				(proc0_4)
				(gIconBar enable:)
				(self dispose:)
			)
		)
	)
)

(instance vanishSound of Sound
	(properties
		flags $0001
		number 213
	)
)

(instance magicSound of Sound
	(properties
		flags $0001
		number 216
	)
)
