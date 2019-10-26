;;; Sierra Script 1.0 - (do not remove this comment)
(script# 420)
(include sci.sh)
(use n000)
(use n851)
(use n958)
(use n994)
(use n998)
(use n999)

(public
	jment 0
)

(local
	[local0 9] = [43 0 2 4 25 37 21 25 28]
	[local9 9] = [44 0 2 4 27 37 21 25 20]
	[local18 9] = [58 0 2 4 22 36 22 26 26]
	[local27 9] = [59 0 2 4 21 32 20 23 31]
	[local36 9] = [131 0 2 4 24 38 23 27 14]
	[local45 9] = [133 3 2 4 24 37 20 24 16]
	[local54 9] = [135 0 2 4 14 37 14 26 15]
	[local63 9] = [253 0 2 4 21 37 19 27 10]
	[local72 9] = [431 0 2 4 21 32 23 25 25]
	[local81 9] = [673 0 2 4 18 33 21 20 21]
	[local90 9] = [-1 3854 27]
	[local99 9] = [-1 3862 6]
	[local108 7] = [1420 0 1 1 1 1]
	[local115 12] = [1420 4 2 2 2 2 1 1 1 1 1]
	[local127 13] = [1420 13 1 1 2 2 2 3 3 1 4 4]
	[local140 4] = [1420 23 1]
	[local144 11] = [1420 24 1 2 2 2 3 3 3 4]
	[local155 6] = [1420 32 1 2 3]
	[local161 4] = [1420 35 1]
	[local165 6] = [1420 36 1 2 3]
	[local171 7] = [1420 39 1 1 2 3]
	[local178 5] = [1420 43 1 2]
	[local183 12] = [1420 45 1 2 2 2 3 3 3 4 3]
	[local195 5] = [1420 54 1 1]
	[local200 5] = [1420 56 1 1]
	[local205 5] = [1420 58 1 1]
	[local210 4] = [1420 60 1]
	[local214 10] = [1420 61 1 1 1 2 1 1 3]
	[local224 5] = [1420 68 1 1]
	[local229 6] = [1420 70 1 2 2]
	[local235 15] = [1420 73 1 2 3 1 1 1 2 2 2 2 2 2]
	[local250 4] = [1420 85 1]
	[local254 5] = [1420 86 1 1]
)
(instance jment of Rm
	(properties
		picture 420
		style $800a
	)
	
	(method (init)
		(Load rsPIC 420)
		(proc958_0
			128
			420
			423
			425
			422
			43
			44
			58
			59
			131
			133
			135
			253
			431
			673
		)
		(proc958_0 132 5)
		(super init: &rest)
		(gIconBar disable: 0 1 2 3 4 5 6 7)
		(proc0_3)
		(gRgnMusic
			number: 5
			loop: -1
			play:
			hold: 1
			fade: 127 6 12 0
		)
		(if (proc0_5 174) (global10 add: poacher))
		(if (proc0_5 173) (global10 add: peasant))
		(if (proc0_5 54) (global10 add: beggar))
		(if (proc0_5 62) (global10 add: marianM))
		(if (not (proc0_5 191)) (global10 add: yeoman))
		(if (proc0_5 113) (global10 add: jeweller))
		(global10
			add:
				robinH
				guardR
				guardL
				guardD
				bench1
				bench2
				spect1
				spect2
				spect3
				spect4
				spect5
				spect6
				spect7
				spect8
				tuckie
				widow
				lobb
				fulkie
				sheriff
				abbot
				monk
				prior
			eachElementDo: #init
			doit:
		)
		(kingRichie init:)
		(scribe init:)
		(gClient setScript: debateIssue)
	)
)

(instance robinH of PicView
	(properties
		x 88
		y 167
		view 420
		loop 10
		priority 11
		signal $0010
	)
)

(instance guardR of PicView
	(properties
		x 100
		y 210
		view 420
		loop 9
		priority 14
		signal $0010
	)
)

(instance guardL of PicView
	(properties
		x 13
		y 176
		view 420
		loop 9
		priority 13
		signal $0010
	)
)

(instance guardD of PicView
	(properties
		x 73
		y 122
		view 420
		loop 9
		priority 0
		signal $0010
	)
)

(instance bench1 of PicView
	(properties
		x 261
		y 187
		view 420
		loop 11
		priority 14
		signal $0010
	)
)

(instance bench2 of PicView
	(properties
		x 297
		y 185
		view 420
		loop 11
		priority 14
		signal $0010
	)
)

(instance spect1 of PicView
	(properties
		x 51
		y 32
		view 420
		loop 2
		priority 0
		signal $0010
	)
)

(instance spect2 of PicView
	(properties
		x 99
		y 19
		view 420
		loop 3
		priority 0
		signal $0010
	)
)

(instance spect3 of PicView
	(properties
		x 163
		y 9
		view 420
		loop 5
		priority 0
		signal $0010
	)
)

(instance spect4 of PicView
	(properties
		x 208
		y 11
		view 420
		loop 5
		cel 1
		priority 0
		signal $0010
	)
)

(instance spect5 of PicView
	(properties
		x 271
		y 18
		view 420
		loop 4
		priority 0
		signal $0010
	)
)

(instance spect6 of PicView
	(properties
		x 304
		y 14
		view 420
		loop 4
		cel 1
		priority 0
		signal $0010
	)
)

(instance spect7 of PicView
	(properties
		x 294
		y 189
		view 420
		loop 6
		priority 14
		signal $0010
	)
)

(instance spect8 of PicView
	(properties
		x 253
		y 189
		view 420
		loop 7
		priority 14
		signal $0010
	)
)

(instance marianM of PicView
	(properties
		x 127
		y 122
		view 423
		priority 8
		signal $0010
	)
)

(instance tuckie of PicView
	(properties
		x 150
		y 111
		view 423
		loop 1
		priority 6
		signal $0010
	)
)

(instance widow of PicView
	(properties
		x 163
		y 122
		view 423
		loop 2
		priority 6
		signal $0010
	)
)

(instance lobb of PicView
	(properties
		x 113
		y 111
		view 423
		loop 3
		priority 6
		signal $0010
	)
)

(instance poacher of PicView
	(properties
		x 143
		y 109
		view 423
		loop 5
		priority 6
		signal $0010
	)
)

(instance peasant of PicView
	(properties
		x 140
		y 118
		view 423
		loop 6
		priority 7
		signal $0010
	)
)

(instance yeoman of PicView
	(properties
		x 154
		y 100
		view 423
		loop 7
		priority 6
		signal $0010
	)
)

(instance jeweller of PicView
	(properties
		x 104
		y 122
		view 423
		loop 8
		priority 7
		signal $0010
	)
)

(instance beggar of PicView
	(properties
		x 177
		y 115
		view 423
		loop 9
		priority 0
		signal $0010
	)
)

(instance fulkie of PicView
	(properties
		x 196
		y 117
		view 423
		loop 10
		priority 7
		signal $0010
	)
)

(instance sheriff of PicView
	(properties
		x 251
		y 139
		view 425
		priority 9
		signal $0010
	)
)

(instance abbot of PicView
	(properties
		x 266
		y 134
		view 425
		cel 1
		priority 8
		signal $0010
	)
)

(instance monk of PicView
	(properties
		x 307
		y 135
		view 425
		cel 2
		priority 9
		signal $0010
	)
)

(instance prior of PicView
	(properties
		x 292
		y 130
		view 425
		loop 1
		cel 3
		priority 8
		signal $0010
	)
)

(instance scribe of Prop
	(properties
		x 268
		y 142
		view 420
		priority 9
		signal $0010
	)
)

(instance kingRichie of Prop
	(properties
		x 212
		y 108
		view 422
		priority 6
		signal $0010
	)
)

(instance debateIssue of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0 (= ticks 90))
			(1
				(proc851_0 1 @local108 @local27 1 self)
			)
			(2
				(gRgnMusic release:)
				(proc851_0 2 @local115 @local27 1 2 2 self)
			)
			(3
				(proc851_0
					4
					@local127
					15
					0
					@local72
					3
					@local18
					1
					@local9
					2
					self
				)
			)
			(4
				(if (proc0_5 65)
					(proc851_0 1 @local140 @local9 2 self)
				else
					(= ticks 6)
				)
			)
			(5
				(proc851_0
					4
					@local144
					@local27
					1
					@local0
					3
					@local81
					0
					2
					2
					self
				)
			)
			(6
				(if (proc0_5 61)
					(proc851_0 3 @local155 2 2 @local72 3 @local27 1 self)
				else
					(= ticks 6)
				)
			)
			(7
				(if (not (proc0_5 61))
					(proc851_0 1 @local161 @local27 1 self)
				else
					(= ticks 6)
				)
			)
			(8
				(proc851_0 3 @local165 2 2 12 3 @local27 1 self)
			)
			(9
				(if (proc0_5 154)
					(proc851_0 3 @local171 @local81 0 @local0 3 2 2 self)
				else
					(= ticks 6)
				)
			)
			(10
				(if (not (proc0_5 154))
					(proc851_0 2 @local178 @local81 0 2 2 self)
				else
					(= ticks 6)
				)
			)
			(11
				(proc851_0
					4
					@local183
					@local0
					3
					@local27
					1
					@local63
					2
					12
					3
					self
				)
			)
			(12
				(if (proc0_5 173)
					(proc851_0 1 @local195 @local99 0 self)
				else
					(= ticks 6)
				)
			)
			(13
				(if (proc0_5 174)
					(proc851_0 1 @local200 @local90 0 self)
				else
					(= ticks 6)
				)
			)
			(14
				(if (and (proc0_5 54) (not (proc0_5 151)))
					(proc851_0 1 @local205 @local36 2 self)
				else
					(= ticks 6)
				)
			)
			(15
				(if (and (proc0_5 54) (proc0_5 151))
					(proc851_0 1 @local210 @local36 2 self)
				else
					(= ticks 6)
				)
			)
			(16
				(if (and (proc0_5 113) (not (proc0_5 152)))
					(proc851_0 3 @local214 @local54 0 2 2 @local27 1 self)
				else
					(= ticks 6)
				)
			)
			(17
				(if (and (proc0_5 113) (proc0_5 152))
					(proc851_0 1 @local224 @local54 0 self)
				else
					(= ticks 6)
				)
			)
			(18
				(if (not (proc0_5 191))
					(proc851_0 2 @local229 @local27 1 @local45 2 self)
				else
					(= ticks 6)
				)
			)
			(19
				(if (proc0_5 62)
					(proc851_0 3 @local235 @local27 1 21 0 @local72 3 self)
				else
					(= ticks 6)
				)
			)
			(20
				(proc851_0 1 @local250 @local27 1 self)
			)
			(21 (= ticks 96))
			(22
				(proc851_0 1 @local254 @local27 1 self)
			)
			(23 (= ticks 180))
			(24
				(gRgnMusic fade: 60 6 12 0)
				(= ticks 72)
			)
			(25
				(if (== global151 40)
					(gClient newRoom: 422)
				else
					(gClient newRoom: 421)
				)
				(self dispose:)
			)
		)
	)
)
