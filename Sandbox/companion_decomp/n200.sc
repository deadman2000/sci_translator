;;; Sierra Script 1.0 - (do not remove this comment)
(script# 200)
(include sci.sh)
(use n000)
(use n013)
(use n851)
(use n939)
(use n950)
(use n989)
(use n992)
(use n994)
(use n996)
(use n998)
(use n999)

(public
	povGladeArchery 0
)

(local
	local0
	local1
	local2
	local3
	local4
	local5
	local6
	local7 =  1
	local8 =  1
	local9 =  1
	local10 =  1
	local11
	local12
	local13
	local14
	[local15 6]
	[local21 6]
	[local27 6]
	[local33 6]
	local39
	local40
	local41
	local42
	local43
	local44
	local45
	local46
	local47
	[local48 3] = [160 187 218]
	[local51 3] = [117 100 107]
	[local54 3] = [65 151 258]
	[local57 3] = [40 60 47]
	[local60 3] = [0 6 4]
	[local63 3] = [3 5 4]
	[local66 3] = [63 150 256]
	local69
	local70
	[local71 4] = [1200 0 1]
	[local75 4] = [1200 1 1]
	[local79 4] = [1200 2 1]
	[local83 4] = [1200 3 1]
)
(procedure (localproc_000e &tmp temp0)
	(switch local70
		(0
			(= temp0 0)
			(while (< temp0 local12)
				([local21 temp0] hide:)
				(++ temp0)
			)
		)
		(1
			(= temp0 0)
			(while (< temp0 local13)
				([local27 temp0] hide:)
				(++ temp0)
			)
		)
		(2
			(= temp0 0)
			(while (< temp0 local14)
				([local33 temp0] hide:)
				(++ temp0)
			)
		)
	)
)

(procedure (localproc_007d)
	(while (>= (-- local11) 0)
		([local15 local11] dispose:)
	)
	(= local11 0)
	(while (>= (-- local12) 0)
		([local21 local12] dispose:)
	)
	(= local12 0)
	(while (>= (-- local13) 0)
		([local27 local13] dispose:)
	)
	(= local13 0)
	(while (>= (-- local14) 0)
		([local33 local14] dispose:)
	)
	(= local14 0)
)

(procedure (localproc_00e2)
	(if (== global125 2)
		(= local45 (Random 0 20))
	else
		(= local45 (Random 21 100))
	)
	(cond 
		((> local45 80) (= local44 (/ 120 global125)))
		((> local45 60) (= local44 (/ 160 global125)))
		((> local45 40) (= local44 (/ 200 global125)))
		((> local45 20) (= local44 (/ 320 global125)))
		(else (= local44 (/ 360 global125)))
	)
)

(procedure (localproc_0154)
	(if (== global125 2)
		(= local46 (Random 6 8))
	else
		(= local46 (Random 4 7))
	)
	(cond 
		((<= local46 5) (= local47 (Random 8 11)))
		((<= local46 7) (= local47 (Random 17 21)))
		((= local46 8) (= local47 (Random 65 74)))
	)
	(windFlags init:)
)

(procedure (localproc_01b7)
	(proc0_3)
	(bigTarget hide:)
	(localproc_007d)
	(flagTree hide:)
	(garland1 hide:)
	(garland2 hide:)
	(garland3 hide:)
	(windFlags hide:)
	(bowHand hide:)
	(bow hide:)
	(arrow hide:)
	(global2 drawPic: 803)
)

(procedure (localproc_0214)
	(global2 drawPic: 200 setScript: prepareArrow)
	(flagTree show:)
	(garland1 show:)
	(garland2 show:)
	(garland3 show:)
	(windFlags show:)
	(bowHand show:)
	(bow show:)
	(arrow show:)
	(= local43 0)
)

(instance povGladeArchery of Rm
	(properties
		picture 200
		style $0003
	)
	
	(method (init)
		(gIconBar disable: 2 3 5 6 7)
		(global77 joyInc: 2)
		(super init:)
		(= local69 global34)
		(= global34 0)
		(garland1 cel: 3 setPri: 3 init:)
		(garland2 cel: 4 setPri: 3 init:)
		(garland3 cel: 0 setPri: 3 init:)
		(bigTarget setPri: 10 init: hide:)
		(= local6
			(if (== global130 8) (== gNewGuise 4) else 0)
		)
		(bowHand setPri: 12 init:)
		(bow setPri: 12 loop: 0 cel: 0 init:)
		(arrow setPri: 14 loop: 0 cel: 0 init:)
		(flagTree init: stopUpd:)
		(localproc_00e2)
		(localproc_0154)
		(rock1 init:)
		(rock2 init:)
		(rock3 init:)
		(leftTargetArea init:)
		(midTargetArea init:)
		(rightTargetArea init:)
		(if
			(and
				(== global12 190)
				(== global130 1)
				(not (proc0_5 76))
			)
			(proc0_6 76)
		)
	)
	
	(method (doit)
		(if (== (-- local44) 0)
			(localproc_0154)
			(localproc_00e2)
		)
		(super doit:)
	)
	
	(method (dispose)
		(shootSound dispose:)
		(hitSound dispose:)
		(global77 joyInc: 5)
		(= global34 local69)
		(super dispose:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1200 7 1))
			(1
				(global2 setScript: leaveGlade)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance windFlags of Prop
	(properties
		x 35
		y 85
		view 200
	)
	
	(method (init)
		(super init:)
		(self
			loop: local46
			setPri: 3
			setCycle: Fwd
			cycleSpeed: local47
		)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(1
				(global2 setScript: leaveGlade)
			)
			(2 (proc13_4 1200 11 1))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garland1 of Prop
	(properties
		x 160
		y 129
		view 200
		loop 2
	)
	
	(method (doVerb theVerb)
		(= local70 0)
		(switch theVerb
			(2
				(if local12
					(self setScript: closeUpGarland)
				else
					(self setScript: showEmptyTarget)
				)
			)
			(10 (leftTargetArea doVerb: 10))
			(1
				(global2 setScript: leaveGlade)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garland2 of Prop
	(properties
		x 186
		y 110
		view 200
		loop 2
	)
	
	(method (doVerb theVerb)
		(= local70 1)
		(switch theVerb
			(2
				(if local13
					(self setScript: closeUpGarland)
				else
					(self setScript: showEmptyTarget)
				)
			)
			(1
				(global2 setScript: leaveGlade)
			)
			(10 (midTargetArea doVerb: 10))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance garland3 of Prop
	(properties
		x 217
		y 121
		view 200
		loop 2
	)
	
	(method (doVerb theVerb)
		(= local70 2)
		(switch theVerb
			(2
				(if local14
					(self setScript: closeUpGarland)
				else
					(self setScript: showEmptyTarget)
				)
			)
			(1
				(global2 setScript: leaveGlade)
			)
			(10
				(rightTargetArea doVerb: 10)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bowHand of View
	(properties
		x 137
		y 239
		lookStr 7379
		view 201
		loop 1
		signal $5000
	)
	
	(method (init)
		(super init:)
		(self setCel: local6)
	)
	
	(method (doit)
		(if (proc999_5 global19 4 5)
			(= x (- (proc999_3 135 (proc999_2 240 global70)) 22))
			(= y (+ (proc999_3 80 (proc999_2 130 global71)) 109))
			(if
				(and
					local10
					(<= 148 global70)
					(<= global70 226)
					(<= 82 global71)
					(<= global71 132)
				)
				(global1 setCursor: 5 1)
			else
				(global1 setCursor: ((gIconBar curIcon?) cursor?))
			)
		)
		(super doit:)
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if (not local10)
					(if (< local11 6)
						(global2 setScript: prepareArrow)
					else
						(global2 setScript: newRound)
					)
				)
			)
			(1
				(global2 setScript: leaveGlade)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bow of View
	(properties
		x 195
		y 144
		lookStr 7418
		view 201
		signal $5000
	)
	
	(method (doit)
		(= x (+ (bowHand x?) 58))
		(= y (- (bowHand y?) 95))
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(1
				(global2 setScript: leaveGlade)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance arrow of View
	(properties
		x 159
		y 133
		lookStr 7495
		view 332
		priority 16
		signal $4010
	)
	
	(method (doit)
		(= x (+ (bowHand x?) 22))
		(= y (- (bowHand y?) 106))
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(1
				(global2 setScript: leaveGlade)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance smallArrow of View
	(properties
		view 332
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1200 12))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance bigTarget of View
	(properties
		x 151
		y 167
		view 200
		signal $4008
	)
	
	(method (onMe param1)
		(return
			(if
				(and
					(<= nsLeft (param1 x?))
					(<= (param1 x?) nsRight)
					(<= nsTop (param1 y?))
				)
				(<= (param1 y?) nsBottom)
			else
				0
			)
		)
	)
)

(instance flagTree of View
	(properties
		x 32
		y 143
		view 200
		loop 1
		priority 9
		signal $0010
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(1
				(global2 setScript: leaveGlade)
			)
			(2 (proc13_4 1200 11))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rock1 of Feature
	(properties
		x 32
		y 122
		nsTop 114
		nsLeft 17
		nsBottom 131
		nsRight 47
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (proc13_4 1200 8 1))
			(1
				(global2 setScript: leaveGlade)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rock2 of Feature
	(properties
		x 124
		y 137
		nsTop 129
		nsLeft 113
		nsBottom 145
		nsRight 136
		sightAngle 90
	)
	
	(method (doVerb)
		(rock1 doVerb: &rest)
	)
)

(instance rock3 of Feature
	(properties
		x 282
		y 172
		nsTop 156
		nsLeft 246
		nsBottom 189
		nsRight 319
		sightAngle 90
	)
	
	(method (doVerb)
		(rock1 doVerb: &rest)
	)
)

(instance prepareArrow of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(arrow
					cel: 0
					posn: (+ (bowHand x?) 22) (- (bowHand y?) 106)
					show:
				)
				(= local10 1)
				(global1 setCursor: 5 1)
				(= cycles 5)
			)
			(1 (self dispose:))
		)
	)
)

(instance fireArrow of Script
	(properties)
	
	(method (changeState newState)
		(asm
			lap      newState
			aTop     state
			push    
			dup     
			ldi      0
			eq?     
			bnt      code_0ded
			pushi    #canInput
			pushi    1
			pushi    0
			class    User
			send     6
			pushi    #cel
			pushi    1
			pushi    1
			lofsa    arrow
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1484
code_0ded:
			dup     
			ldi      1
			eq?     
			bnt      code_0e0c
			pushi    #play
			pushi    0
			lofsa    shootSound
			send     4
			pushi    #cel
			pushi    1
			pushi    2
			lofsa    arrow
			send     6
			ldi      1
			aTop     cycles
			jmp      code_1484
code_0e0c:
			dup     
			ldi      2
			eq?     
			bnt      code_0e5c
			pushi    #hide
			pushi    0
			lofsa    arrow
			send     4
			pushi    #x
			pushi    0
			lofsa    arrow
			send     4
			sal      local39
			pushi    #y
			pushi    0
			lofsa    arrow
			send     4
			sal      local40
			ldi      0
			sal      local10
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0e41
			ldi      5
			jmp      code_0e56
code_0e41:
			dup     
			ldi      1
			eq?     
			bnt      code_0e4d
			ldi      20
			jmp      code_0e56
code_0e4d:
			dup     
			ldi      2
			eq?     
			bnt      code_0e56
			ldi      15
code_0e56:
			toss    
			aTop     ticks
			jmp      code_1484
code_0e5c:
			dup     
			ldi      3
			eq?     
			bnt      code_11fc
			lsl      local39
			lsl      local46
			dup     
			ldi      4
			eq?     
			bnt      code_0ea6
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0e82
			pushi    2
			pushi    3
			pushi    7
			callk    Random,  4
			jmp      code_0ea1
code_0e82:
			dup     
			ldi      1
			eq?     
			bnt      code_0e93
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			jmp      code_0ea1
code_0e93:
			dup     
			ldi      2
			eq?     
			bnt      code_0ea1
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
code_0ea1:
			toss    
			neg     
			jmp      code_0f5c
code_0ea6:
			dup     
			ldi      5
			eq?     
			bnt      code_0ee4
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0ec1
			pushi    2
			pushi    3
			pushi    7
			callk    Random,  4
			jmp      code_0ee0
code_0ec1:
			dup     
			ldi      1
			eq?     
			bnt      code_0ed2
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
			jmp      code_0ee0
code_0ed2:
			dup     
			ldi      2
			eq?     
			bnt      code_0ee0
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
code_0ee0:
			toss    
			jmp      code_0f5c
code_0ee4:
			dup     
			ldi      6
			eq?     
			bnt      code_0f22
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0efe
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
			jmp      code_0f1d
code_0efe:
			dup     
			ldi      1
			eq?     
			bnt      code_0f0f
			pushi    2
			pushi    1
			pushi    4
			callk    Random,  4
			jmp      code_0f1d
code_0f0f:
			dup     
			ldi      2
			eq?     
			bnt      code_0f1d
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
code_0f1d:
			toss    
			neg     
			jmp      code_0f5c
code_0f22:
			dup     
			ldi      7
			eq?     
			bnt      code_0f5c
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_0f3c
			pushi    2
			pushi    2
			pushi    6
			callk    Random,  4
			jmp      code_0f5b
code_0f3c:
			dup     
			ldi      1
			eq?     
			bnt      code_0f4d
			pushi    2
			pushi    1
			pushi    4
			callk    Random,  4
			jmp      code_0f5b
code_0f4d:
			dup     
			ldi      2
			eq?     
			bnt      code_0f5b
			pushi    2
			pushi    1
			pushi    5
			callk    Random,  4
code_0f5b:
			toss    
code_0f5c:
			toss    
			add     
			sal      local39
			lsl      local40
			lal      local70
			lali     local60
			add     
			sal      local40
			pushi    #cel
			pushi    1
			lal      local70
			lsli     local63
			lofsa    arrow
			send     6
			pushi    5
			pushi    #superClass
			pushi    332
			pushi    6
			pushi    1
			pushi    0
			pushi    7
			pushi    1
			lal      local70
			lsli     local63
			pushi    284
			pushi    2
			lsl      local39
			lsl      local40
			pushi    289
			pushi    0
			pushi    66
			pushi    1
			pushi    5
			pushi    107
			pushi    0
			pushi    285
			pushi    0
			pushi    #new
			pushi    0
			lofsa    smallArrow
			send     4
			push    
			lal      local11
			sali     local15
			send     44
			pushi    280
			lal      local39
			gt?     
			bnt      code_0fbe
			pprev   
			ldi      230
			gt?     
			bt       code_100e
code_0fbe:
			pushi    137
			lal      local39
			gt?     
			bnt      code_0fce
			pprev   
			ldi      35
			gt?     
			bt       code_100e
code_0fce:
			pushi    179
			lal      local39
			gt?     
			bnt      code_0fee
			pprev   
			ldi      172
			gt?     
			bnt      code_0fee
			pushi    103
			lal      local40
			gt?     
			bnt      code_0fee
			pprev   
			ldi      71
			gt?     
			bt       code_100e
code_0fee:
			pushi    205
			lal      local39
			gt?     
			bnt      code_101b
			pprev   
			ldi      194
			gt?     
			bnt      code_101b
			pushi    115
			lal      local40
			gt?     
			bnt      code_101b
			pprev   
			ldi      78
			gt?     
			bnt      code_101b
code_100e:
			ldi      999
			sal      local41
			ldi      999
			sal      local42
			jmp      code_105a
code_101b:
			lsl      local39
			lal      local70
			lali     local48
			sub     
			push    
			lal      local70
			lali     local57
			mul     
			push    
			ldi      10
			div     
			push    
			lal      local70
			lali     local54
			add     
			sal      local41
			lsl      local39
			lal      local43
			eq?     
			bnt      code_1043
			lsl      local41
			ldi      1
			sub     
			sal      local41
code_1043:
			lsl      local40
			lal      local70
			lali     local51
			sub     
			push    
			lal      local70
			lali     local57
			mul     
			push    
			ldi      10
			div     
			push    
			ldi      122
			add     
			sal      local42
code_105a:
			lal      local39
			sal      local43
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_10a4
			pushi    5
			pushi    #superClass
			pushi    200
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local41
			lsl      local42
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			push    
			lal      local12
			sali     local21
			send     44
			+al      local12
			ldi      0
			sal      local0
			jmp      code_1129
code_10a4:
			dup     
			ldi      1
			eq?     
			bnt      code_10e8
			pushi    5
			pushi    #superClass
			pushi    200
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local41
			lsl      local42
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			push    
			lal      local13
			sali     local27
			send     44
			+al      local13
			ldi      0
			sal      local1
			jmp      code_1129
code_10e8:
			dup     
			ldi      2
			eq?     
			bnt      code_1129
			pushi    5
			pushi    #superClass
			pushi    200
			pushi    6
			pushi    1
			pushi    3
			pushi    7
			pushi    1
			pushi    0
			pushi    284
			pushi    2
			lsl      local41
			lsl      local42
			pushi    66
			pushi    1
			pushi    11
			pushi    289
			pushi    0
			pushi    107
			pushi    0
			pushi    105
			pushi    0
			pushi    #new
			pushi    0
			class    Prop
			send     4
			push    
			lal      local14
			sali     local33
			send     44
			+al      local14
			ldi      0
			sal      local2
code_1129:
			toss    
			pushi    280
			lal      local39
			gt?     
			bnt      code_113b
			pprev   
			ldi      230
			gt?     
			bt       code_118b
code_113b:
			pushi    137
			lal      local39
			gt?     
			bnt      code_114b
			pprev   
			ldi      35
			gt?     
			bt       code_118b
code_114b:
			pushi    179
			lal      local39
			gt?     
			bnt      code_116b
			pprev   
			ldi      172
			gt?     
			bnt      code_116b
			pushi    103
			lal      local40
			gt?     
			bnt      code_116b
			pprev   
			ldi      71
			gt?     
			bt       code_118b
code_116b:
			pushi    205
			lal      local39
			gt?     
			bnt      code_11a2
			pprev   
			ldi      194
			gt?     
			bnt      code_11a2
			pushi    115
			lal      local40
			gt?     
			bnt      code_11a2
			pprev   
			ldi      78
			gt?     
			bnt      code_11a2
code_118b:
			pushi    #hide
			pushi    0
			lal      local11
			lali     local15
			send     4
			pushi    #number
			pushi    1
			pushi    357
			lofsa    hitSound
			send     6
			jmp      code_11ad
code_11a2:
			pushi    #number
			pushi    1
			pushi    908
			lofsa    hitSound
			send     6
code_11ad:
			lsg      global130
			ldi      1
			eq?     
			bnt      code_11bb
			pushi    1
			pushi    41
			callb    proc0_6,  2
code_11bb:
			+al      local11
			pushi    187
			pushi    4
			lsg      global19
			pushi    1
			lsg      global70
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			add     
			push    
			ldi      65532
			add     
			push    
			lsg      global71
			pushi    2
			pushi    0
			pushi    8
			callk    Random,  4
			add     
			push    
			ldi      65532
			add     
			push    
			lag      global1
			send     12
			lsl      local41
			ldi      999
			eq?     
			bnt      code_11f5
			ldi      10
			jmp      code_11f7
code_11f5:
			ldi      1
code_11f7:
			aTop     cycles
			jmp      code_1484
code_11fc:
			dup     
			ldi      4
			eq?     
			bnt      code_1450
			pushi    #canInput
			pushi    1
			pushi    1
			class    User
			send     6
			pushi    #play
			pushi    0
			lofsa    hitSound
			send     4
			pushi    1
			pushi    43
			callb    proc0_5,  2
			bnt      code_1449
			pushi    280
			lal      local39
			gt?     
			bnt      code_122e
			pprev   
			ldi      230
			gt?     
			bt       code_127e
code_122e:
			pushi    137
			lal      local39
			gt?     
			bnt      code_123e
			pprev   
			ldi      35
			gt?     
			bt       code_127e
code_123e:
			pushi    179
			lal      local39
			gt?     
			bnt      code_125e
			pprev   
			ldi      172
			gt?     
			bnt      code_125e
			pushi    103
			lal      local40
			gt?     
			bnt      code_125e
			pprev   
			ldi      71
			gt?     
			bt       code_127e
code_125e:
			pushi    205
			lal      local39
			gt?     
			bnt      code_1295
			pprev   
			ldi      194
			gt?     
			bnt      code_1295
			pushi    115
			lal      local40
			gt?     
			bnt      code_1295
			pprev   
			ldi      78
			gt?     
			bnt      code_1295
code_127e:
			lal      local9
			bnt      code_1295
			pushi    #setScript
			pushi    3
			lofsa    saySomethingWill
			push    
			pushSelf
			pushi    2
			pToa     client
			send     10
			jmp      code_1484
code_1295:
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_12a7
			lsl      local39
			ldi      160
			eq?     
			jmp      code_12c4
code_12a7:
			dup     
			ldi      1
			eq?     
			bnt      code_12b7
			lsl      local39
			ldi      187
			eq?     
			jmp      code_12c4
code_12b7:
			dup     
			ldi      2
			eq?     
			bnt      code_12c4
			lsl      local39
			ldi      218
			eq?     
code_12c4:
			toss    
			bnt      code_131f
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_12e1
			lsl      local40
			ldi      117
			eq?     
			bt       code_1304
			lsl      local40
			ldi      118
			eq?     
			jmp      code_1304
code_12e1:
			dup     
			ldi      1
			eq?     
			bnt      code_12f8
			lsl      local40
			ldi      99
			eq?     
			bt       code_1304
			lsl      local40
			ldi      100
			eq?     
			jmp      code_1304
code_12f8:
			dup     
			ldi      2
			eq?     
			bnt      code_1304
			lsl      local40
			ldi      107
			eq?     
code_1304:
			toss    
			bnt      code_131f
			lal      local7
			bnt      code_131f
			pushi    #setScript
			pushi    3
			lofsa    saySomethingWill
			push    
			pushSelf
			pushi    0
			pToa     client
			send     10
			jmp      code_1484
code_131f:
			lsl      local70
			dup     
			ldi      0
			eq?     
			bnt      code_137a
			pushi    179
			lal      local39
			ge?     
			bnt      code_1339
			pprev   
			ldi      168
			ge?     
			bt       code_1427
code_1339:
			pushi    154
			lal      local39
			ge?     
			bnt      code_134a
			pprev   
			ldi      138
			ge?     
			bt       code_1427
code_134a:
			pushi    179
			lal      local39
			ge?     
			bnt      code_1427
			pprev   
			ldi      138
			ge?     
			bnt      code_1427
			pushi    110
			lal      local40
			gt?     
			bnt      code_136a
			pprev   
			ldi      64
			gt?     
			bt       code_1427
code_136a:
			pushi    151
			lal      local40
			gt?     
			bnt      code_1427
			pprev   
			ldi      125
			gt?     
			jmp      code_1427
code_137a:
			dup     
			ldi      1
			eq?     
			bnt      code_13d2
			pushi    193
			lal      local39
			ge?     
			bnt      code_1392
			pprev   
			ldi      191
			ge?     
			bt       code_1427
code_1392:
			pushi    183
			lal      local39
			ge?     
			bnt      code_13a3
			pprev   
			ldi      180
			ge?     
			bt       code_1427
code_13a3:
			pushi    193
			lal      local39
			ge?     
			bnt      code_1427
			pprev   
			ldi      180
			ge?     
			bnt      code_1427
			pushi    92
			lal      local40
			ge?     
			bnt      code_13c3
			pprev   
			ldi      56
			ge?     
			bt       code_1427
code_13c3:
			pushi    114
			lal      local40
			ge?     
			bnt      code_1427
			pprev   
			ldi      102
			ge?     
			jmp      code_1427
code_13d2:
			dup     
			ldi      2
			eq?     
			bnt      code_1427
			pushi    228
			lal      local39
			ge?     
			bnt      code_13ea
			pprev   
			ldi      222
			ge?     
			bt       code_1427
code_13ea:
			pushi    213
			lal      local39
			ge?     
			bnt      code_13fb
			pprev   
			ldi      206
			ge?     
			bt       code_1427
code_13fb:
			pushi    228
			lal      local39
			ge?     
			bnt      code_1427
			pprev   
			ldi      206
			ge?     
			bnt      code_1427
			pushi    100
			lal      local40
			gt?     
			bnt      code_141b
			pprev   
			ldi      82
			gt?     
			bt       code_1427
code_141b:
			pushi    124
			lal      local40
			gt?     
			bnt      code_1427
			pprev   
			ldi      113
			gt?     
code_1427:
			toss    
			bnt      code_1442
			lal      local8
			bnt      code_1442
			pushi    #setScript
			pushi    3
			lofsa    saySomethingWill
			push    
			pushSelf
			pushi    1
			pToa     client
			send     10
			jmp      code_1484
code_1442:
			ldi      1
			aTop     cycles
			jmp      code_1484
code_1449:
			ldi      1
			aTop     cycles
			jmp      code_1484
code_1450:
			dup     
			ldi      5
			eq?     
			bnt      code_1478
			pushi    1
			pushi    166
			callb    proc0_6,  2
			not     
			bnt      code_1471
			pushi    #setScript
			pushi    1
			lofsa    showCloseUpGarland
			push    
			lag      global2
			send     6
			jmp      code_1484
code_1471:
			ldi      1
			aTop     cycles
			jmp      code_1484
code_1478:
			dup     
			ldi      6
			eq?     
			bnt      code_1484
			pushi    #dispose
			pushi    0
			self     4
code_1484:
			toss    
			ret     
		)
	)
)

(instance showCloseUpGarland of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(gIconBar select: (gIconBar at: 1))
				(global1 setCursor: 1 1)
				(= ticks 60)
			)
			(1
				(proc0_4 1)
				(client setScript: closeUpGarland)
			)
		)
	)
)

(instance closeUpGarland of Script
	(properties)
	
	(method (changeState newState &tmp temp0 temp1)
		(switch (= state newState)
			(0
				(proc0_3)
				(arrow hide:)
				(bow hide:)
				(bowHand hide:)
				(bigTarget x: [local66 local70])
				(= cycles 1)
			)
			(1
				(bigTarget show:)
				(SetNowSeen bigTarget)
				(switch local70
					(0
						(= temp0 0)
						(while (< temp0 local12)
							(= temp1 [local21 temp0])
							(if (bigTarget onMe: temp1) (temp1 show:))
							(++ temp0)
						)
						(if (not local0) (temp1 setCycle: Osc 1))
						(= local0 1)
					)
					(1
						(= temp0 0)
						(while (< temp0 local13)
							(= temp1 [local27 temp0])
							(if (bigTarget onMe: temp1) (temp1 show:))
							(++ temp0)
						)
						(if (not local1) (temp1 setCycle: Osc 1))
						(= local1 1)
					)
					(2
						(= temp0 0)
						(while (< temp0 local14)
							(= temp1 [local33 temp0])
							(if (bigTarget onMe: temp1) (temp1 show:))
							(++ temp0)
						)
						(if (not local2) (temp1 setCycle: Osc 1))
						(= local2 1)
					)
				)
				(= ticks 150)
			)
			(2
				(localproc_000e)
				(bigTarget hide:)
				(= cycles 5)
			)
			(3
				(bow show:)
				(bowHand show:)
				(if (== local10 1) (arrow show:))
				(= cycles 2)
			)
			(4 (proc0_4 1) (self dispose:))
		)
	)
)

(instance saySomethingWill of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(switch register
					(0
						(= local7 0)
						(proc851_0 1 @local71 14 0 self)
					)
					(1
						(= local8 0)
						(proc851_0 1 @local75 14 0 self)
					)
					(2
						(= local9 0)
						(proc851_0 1 @local83 14 0 self)
					)
				)
			)
			(1 (proc0_4 1) (self dispose:))
		)
	)
)

(instance leaveGlade of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(if local11 (proc13_4 1200 10 self) else (= cycles 1))
			)
			(1
				(global2 newRoom: 190)
				(self dispose:)
			)
		)
	)
)

(instance newRound of Script
	(properties)
	
	(method (changeState newState &tmp temp0)
		(switch (= state newState)
			(0 (proc0_3) (= ticks 18))
			(1
				(if (proc0_5 43)
					(proc851_0 1 @local79 14 0 self)
				else
					(proc13_4 1200 9 self)
				)
			)
			(2
				(proc0_4 1)
				(gIconBar disable: 0 4 select: (gIconBar at: 1))
				(= ticks 300)
			)
			(3
				(if (bigTarget isNotHidden:) (-- state))
				(= ticks 10)
			)
			(4
				(localproc_01b7)
				(= ticks 60)
			)
			(5
				(localproc_0214)
				(proc0_4 1)
				(gIconBar enable: 0 4 curIcon: (gIconBar at: 4))
				(global1 setCursor: 4 1)
				(= ticks 30)
			)
			(6 (self dispose:))
		)
	)
)

(instance showEmptyTarget of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(proc0_3)
				(arrow hide:)
				(bow hide:)
				(bowHand hide:)
				(= cycles 1)
			)
			(1
				(bigTarget x: [local66 local70] show:)
				(= cycles 2)
			)
			(2
				(switch local70
					(0
						(if local3 (= local3 0) (proc13_4 1200 4))
					)
					(1
						(if local4 (= local4 0) (proc13_4 1200 5))
					)
					(2
						(if local5 (= local5 0) (proc13_4 1200 6))
					)
				)
				(= cycles 5)
			)
			(3
				(bigTarget x: [local66 local70] hide:)
				(= cycles 3)
			)
			(4
				(bow show:)
				(bowHand show:)
				(if (== local10 1) (arrow show:))
				(proc0_4 1)
				(self dispose:)
			)
		)
	)
)

(instance shootSound of Sound
	(properties
		flags $0001
		number 906
	)
)

(instance hitSound of Sound
	(properties
		flags $0001
	)
)

(instance leftTargetArea of Feature
	(properties
		x 161
		y 130
		nsTop 80
		nsLeft 140
		nsBottom 134
		nsRight 174
		description 7722
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if (and local10 (< local11 6))
					(= local70 0)
					(global2 setScript: fireArrow)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance midTargetArea of Feature
	(properties
		x 188
		y 101
		nsTop 70
		nsLeft 175
		nsBottom 122
		nsRight 200
		description 7722
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if (and local10 (< local11 6))
					(= local70 1)
					(global2 setScript: fireArrow)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rightTargetArea of Feature
	(properties
		x 218
		y 105
		nsTop 75
		nsLeft 201
		nsBottom 125
		nsRight 234
		description 7722
		sightAngle 90
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(10
				(if (and local10 (< local11 6))
					(= local70 2)
					(global2 setScript: fireArrow)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)
