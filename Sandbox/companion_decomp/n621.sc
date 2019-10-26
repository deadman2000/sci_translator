;;; Sierra Script 1.0 - (do not remove this comment)
(script# 621)
(include sci.sh)
(use n000)
(use n625)
(use n806)
(use n851)
(use n937)
(use n946)
(use n950)
(use n998)
(use n999)

(public
	gems_room 0
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
	local8
	local9
	local10
	local11
	local12
	local13
	local14
	local15
	local16
	local17
	local18
	theGNewCast
	theGNewFeatures
	local21
	theGMH
	local23
	local24
	[local25 4] = [1621 0 1]
	[local29 8] = [1621 1 1 0 1621 3 1]
	[local37 4] = [1621 4 1]
	[local41 4] = [1621 5 1]
)
(procedure (localproc_0062)
	(gNewCast eachElementDo: #perform hideMe)
	(= theGNewCast gNewCast)
	(= theGNewFeatures gNewFeatures)
	(= local21 global10)
	(= theGMH gMH)
	(= gMH (= gNewCast (= gNewFeatures (= global10 0))))
	(gClient drawPic: 803 10)
	((= gNewCast newCast) add:)
	((= gNewFeatures newFeatures) add:)
	((= gMH newMDH) add: gNewFeatures)
)

(procedure (localproc_00b7)
	(if (GameIsRestarting)
		(= local16
			(Display local17 100 50 10 106 200 102 255 103 0 107)
		)
	)
)

(procedure (localproc_00dd)
	(gNewCast
		eachElementDo: #dispose
		eachElementDo: #delete
		release:
		dispose:
	)
	(gNewFeatures
		eachElementDo: #dispose
		eachElementDo: #delete
		release:
		dispose:
	)
	(bigGems dispose:)
	(gMH dispose:)
	(gClient drawPic: (gClient picture?) 10)
	(= gNewCast theGNewCast)
	(= gNewFeatures theGNewFeatures)
	((= global10 local21) doit:)
	(= gMH theGMH)
	(gNewCast eachElementDo: #perform showMe)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMDH of EventHandler
	(properties)
)

(instance hideMe of Code
	(properties)
	
	(method (doit param1)
		(param1 z: (+ (param1 z?) 1000))
	)
)

(instance showMe of Code
	(properties)
	
	(method (doit param1)
		(param1 z: (- (param1 z?) 1000))
	)
)

(instance gems_room of Code
	(properties)
	
	(method (doit &tmp temp0 temp1 temp2 temp3)
		(= local18 1)
		(= local23 global19)
		(gIconBar disable: 3 1 4 5 6 0 7)
		(= local1 ((= temp1 (IconBar at: 2)) cursor?))
		(temp1 cursor: 5)
		(= local2 ((= temp2 (IconBar at: 8)) cursor?))
		(temp2 cursor: 5)
		(= local24 global34)
		(= global34 1)
		(localproc_0062)
		(proc806_3
			agate
			turquoise
			sapphire
			carnelian
			lapisLazuli
			amber
			jet
			opal
			quartz
			everything
		)
		(bigGems init: stopUpd:)
		(army posn: 180 125 init:)
		(global1 setCursor: 5 1 180 125)
		(= local13 (Random 0 13))
		(if (gClient script?)
			0
		else
			(gClient setScript: doTheRiddles)
		)
	)
	
	(method (dispose)
		(localproc_00dd)
		(= global34 local24)
		(global1 setCursor: local23 1)
		((IconBar at: 2) cursor: local1)
		((IconBar at: 8) cursor: local2)
		(gMH delete: self)
		(gIconBar enable: 3 6 5 6 0 7 8)
		(gClient setScript: 0)
		(super dispose:)
		(DisposeScript 621)
	)
)

(instance everything of Feature
	(properties)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 0 0 319 0 319 189 0 189
			yourself:
		)
	)
)

(instance agate of Feature
	(properties
		y 90
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 158 78 158 82 152 90 146 88 144 86 144 82 146 80 150 77
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
				(and
					(not local4)
					(proc999_5 local13 0 3 6 7 8 10 11 14)
				)
				(= local4 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance turquoise of Feature
	(properties
		y 105
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 133 99 138 94 147 93 149 95 150 101 146 104 135 105 132 102
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local5 0) (proc999_5 local13 8 12 14))
				(= local5 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance sapphire of Feature
	(properties
		y 103
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init:
				156
				101
				154
				98
				154
				94
				160
				91
				165
				91
				167
				95
				167
				101
				161
				103
				157
				103
				155
				101
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local6 0) (proc999_5 local13 5 7 8 9 12 13))
				(= local6 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance carnelian of Feature
	(properties
		y 103
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 180 90 188 89 194 91 195 99 192 102 186 103 181 100 177 97 177 93
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local7 0) (proc999_5 local13 1 2 3 5 6 10 15))
				(= local7 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance lapisLazuli of Feature
	(properties
		y 118
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 121 115 121 112 125 109 133 108 135 111 135 114 129 118 123 117
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local8 0) (proc999_5 local13 0 5 7 9 11 13))
				(= local8 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance amber of Feature
	(properties
		y 119
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 145 115 145 111 150 107 156 107 158 109 159 115 155 119 148 119
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local9 0) (proc999_5 local13 3 4 9 14 15))
				(= local9 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance jet of Feature
	(properties
		y 113
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 166 111 166 106 169 104 174 104 177 108 177 111 171 113
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
				(and
					(== local10 0)
					(proc999_5 local13 0 1 2 9 11 12 13 15)
				)
				(= local10 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance opal of Feature
	(properties
		y 128
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 140 117 144 118 146 123 141 128 135 127 132 125 132 120
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local11 0) (proc999_5 local13 1 2 4 6))
				(= local11 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance quartz of Feature
	(properties
		y 128
	)
	
	(method (init)
		((= onMeCheck (Polygon new:))
			type: 0
			init: 187 116 187 123 183 127 177 128 174 126 171 120 179 112
			yourself:
		)
		(super init:)
	)
	
	(method (doVerb theVerb)
		(if (== theVerb 3)
			(++ local14)
			(if
			(and (== local12 0) (proc999_5 local13 0 4 5 10 13))
				(= local12 1)
				(gClient setScript: rightAns)
			else
				(gClient setScript: wrongAns)
			)
		else
			(super doVerb: theVerb &rest)
		)
	)
)

(instance bigGems of View
	(properties
		x 153
		y 72
		view 771
		loop 4
		cel 1
	)
)

(instance army of Actor
	(properties
		x 180
		y 125
		view 182
		loop 1
		priority 14
		signal $6810
		illegalBits $0000
	)
	
	(method (doit)
		(= x gX)
		(= y (- gY 10))
		(if (!= global19 5) (global1 setCursor: 5 1))
		(super doit:)
	)
)

(instance doTheRiddles of Script
	(properties)
	
	(method (doit)
		(super doit: &rest)
		(localproc_00b7)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local4 0)
				(= local5 0)
				(= local6 0)
				(= local7 0)
				(= local8 0)
				(= local9 0)
				(= local10 0)
				(= local11 0)
				(= local12 0)
				(switch local13
					(0
						(= local17
							{I will seek out the devil where he lies and I will cross many seas to do so.__Then I shall blast him with fire from heaven.}
						)
					)
					(1
						(= local17
							{Demons dance to my call.__I am a thief none can catch.__No sharp blade worries me.__What do I have?}
						)
					)
					(2
						(= local17
							{I would comfort a friend who is ill and fears that death will come upon him without warning.__But if death should come, let my gifts guide him beyond demon's reach and to new life. What should I give him?}
						)
					)
					(3
						(= local17
							{I have a fever which has driven me to madness.__My teeth loosen and I taste blood in my mouth.}
						)
					)
					(4
						(= local17
							{I am old and my hearing fails me, I am ill and wonder when death will come for me, my mouth is dry.__What would you give me?}
						)
					)
					(5
						(= local17
							{I must go into battle where I may well be wounded.__Then I will know great thirst and my eyes will burn.}
						)
					)
					(6
						(= local17
							{Sadness weighs upon my soul.__My heart aches to be filled.__Would that I could steal into my love's chamber unseen.}
						)
					)
					(7
						(= local17
							{I have three fears:__I fear travelling by ship;__I fear my wife will be unfaithful:__I fear the lies of men.__What should I take with me?}
						)
					)
					(8
						(= local17
							{I'll build a ship to carry me skyward.__If it falls, I'll not be harmed.__But I will never tell how it is done.__What do I have?}
						)
					)
					(9
						(= local17
							{A piece of sky fell to my feet and I picked it up.__Where it touched me, it raised boils.__I fear it poisons me.__What would you give me?}
						)
					)
					(10
						(= local17
							{My trees are heavy with fruit, my heart is full of all desires, and my wife gives birth to a holy child.__What do I have?}
						)
					)
					(11
						(= local17
							{The drought lengthens, the corn withers in my field, and a witch curses me with a glance.__What would you give me?}
						)
					)
					(12
						(= local17
							{I must ride upon a fiery horse, through valleys filled with adders and seek the fate that awaits me.__What should I take with me?}
						)
					)
					(13
						(= local17
							{In summer, my ice does not melt.__The red eye becomes clear.__Demons run when I raise my hand.__What do I have?}
						)
					)
					(14
						(= local17
							{Alas, sadness clothes me like a leaden cloak.__A wicked woman lies to me, but I fear danger will come upon me by surprise.__What would you give me?}
						)
					)
					(15
						(= local17
							{I lie dying, cut deeply by the sword, my flesh burns, spirits of Hades hover to take my soul.__What would you give me?}
						)
					)
				)
				(= cycles 2)
			)
			(1
				(= local16
					(Display local17 100 50 10 106 200 102 255 103 0 107)
				)
			)
		)
	)
)

(instance wrongAns of Script
	(properties)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= global145 21)
				(= local17
					{_____________________________________________________________________________________________________}
				)
				(Display 621 0 108 local16)
				(proc0_6 149)
				(self changeState: 1)
			)
			(1
				(self dispose:)
				(gems_room dispose:)
			)
		)
	)
)

(instance rightAns of Script
	(properties)
	
	(method (doit)
		(super doit: &rest)
		(localproc_00b7)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(switch local14
					(1
						(gIconBar disable: 8)
						(proc851_0 1 @local37 11 2)
					)
					(2 (proc851_0 1 @local41 11 2))
					(3
						(gIconBar enable: 8)
						(switch local15
							(0
								(gClient setScript: oneRiddle)
							)
							(1
								(gClient setScript: twoRiddle)
							)
							(2
								(gClient setScript: threeRiddle)
							)
						)
					)
				)
			)
		)
	)
)

(instance oneRiddle of Script
	(properties)
	
	(method (doit)
		(super doit: &rest)
		(localproc_00b7)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local14 0)
				(= local17
					{_____________________________________________________________________________________________________}
				)
				(Display 621 0 108 local16)
				(proc851_0 1 @local25 11 2)
				(++ local13)
				(++ local15)
				(self changeState: 1)
			)
			(1
				(gClient setScript: doTheRiddles)
			)
		)
	)
)

(instance twoRiddle of Script
	(properties)
	
	(method (doit)
		(super doit: &rest)
		(localproc_00b7)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local14 0)
				(= local17
					{_____________________________________________________________________________________________________}
				)
				(Display 621 0 108 local16)
				(proc851_0 1 @local29 11 2)
				(++ local13)
				(++ local15)
				(self changeState: 1)
			)
			(1
				(gClient setScript: doTheRiddles)
			)
		)
	)
)

(instance threeRiddle of Script
	(properties)
	
	(method (doit)
		(super doit: &rest)
		(localproc_00b7)
	)
	
	(method (changeState newState)
		(switch (= state newState)
			(0
				(= local17
					{_____________________________________________________________________________________________________}
				)
				(Display 621 0 108 local16)
				(Monastery backFromJewels: 1)
				(proc806_1 100)
				(self changeState: 1)
			)
			(1 (gems_room dispose:))
		)
	)
)
