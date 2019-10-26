;;; Sierra Script 1.0 - (do not remove this comment)
(script# 213)
(include sci.sh)
(use n000)
(use n806)
(use n946)
(use n950)
(use n996)
(use n998)
(use n999)

(public
	handCode 0
)

(local
	[local0 15]
	local15
	[local16 6]
	[local22 15]
	local37
	local38
	local39
	local40
	local41
	[local42 53] = [1956 1962 1968 1972 1978 1984 1990 1996 2000 2007 2018 2022 2027 2032 2037 2043 2049 2054 2059 2064 2071 2076 2081 2086 2091 2096 2106 2117 2125 2134 2142 2151 2156 2162 2166 2171 2176 2182 2187 2193 2201 2206 2212 2219 2227 2232 2238 2244 2252 2258 2262 2267 2275]
	[local95 10] = [2284 2290 2296 2302 2308 2314 2321 2327 2334 2340]
	[local105 28] = [133 112 151 112 152 92 166 92 166 87 180 87 181 89 182 90 195 90 197 88 211 88 200 151 156 151 141 133]
	local133 =  2346
	theGNewCast
	theGNewFeatures
	local136
	theGMH
	theGDH
	theGKH
)
(procedure (localproc_000e)
	(-- local37)
	(Display 213 0 108 local39)
	(if (== local37 0)
		(= local37 (= local0 0))
	else
		(StrAt @local0 local37 0)
		(= local39
			(Display @local0 100 115 35 102 gColor 103 global186 107)
		)
	)
)

(procedure (localproc_0056 param1)
	(++ local37)
	(Display 213 0 108 local39)
	(if (>= local37 13)
		(StrCpy @local22 @local0)
		(= local37 (= local0 0))
	else
		(StrCat @local0 param1)
		(= local39
			(Display @local0 100 115 35 102 gColor 103 global186 107)
		)
	)
)

(procedure (localproc_00a8 &tmp temp0 temp1)
	(= temp0 0)
	(while (< temp0 53)
		(breakif (== (StrCmp @local22 [local42 temp0]) 0))
		(++ temp0)
	)
	(if (== (StrCmp @local22 local15) 0)
		(proc0_6 67)
		(= temp1 1)
	)
	(if (== temp1 0) (= global124 55))
)

(procedure (localproc_0101 &tmp temp0 temp1)
	(= temp1 22)
	(= temp0 0)
	(while (< temp0 10)
		(if (== global140 temp1) (= local15 [local95 temp0]))
		(++ temp1)
		(++ temp0)
	)
)

(procedure (localproc_01ba param1 param2)
	(gNewCast eachElementDo: #perform hideMe)
	(= theGNewCast gNewCast)
	(= theGNewFeatures gNewFeatures)
	(= local136 global10)
	(= theGMH gMH)
	(= theGKH gKH)
	(= theGDH gDH)
	(= gMH
		(= gKH
			(= gDH (= gNewCast (= gNewFeatures (= global10 0))))
		)
	)
	(DrawPic param1 param2)
	((= gNewCast newCast) add:)
	((= gNewFeatures newFeatures) add:)
	((= gMH newMH) add: gNewFeatures)
	((= gKH newKH) add: gNewFeatures)
	((= gDH newDH) add: gNewFeatures)
)

(procedure (localproc_022e)
	(gNewCast
		eachElementDo: #dispose
		eachElementDo: #delete
		release:
		dispose:
	)
	(gNewFeatures dispose:)
	(gMH dispose:)
	(gKH dispose:)
	(gDH dispose:)
	(DrawPic (gClient picture?) dpCLOSEREOPEN_VCENTER)
	(= gNewCast theGNewCast)
	(= gNewFeatures theGNewFeatures)
	((= global10 local136) doit:)
	(= gMH theGMH)
	(= gKH theGKH)
	(= gDH theGDH)
	(gNewCast eachElementDo: #perform showMe)
)

(instance newCast of EventHandler
	(properties)
)

(instance newFeatures of EventHandler
	(properties)
)

(instance newMH of EventHandler
	(properties)
)

(instance newKH of EventHandler
	(properties)
)

(instance newDH of EventHandler
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

(instance handCode of Code
	(properties)
	
	(method (doit)
		(= local41 global19)
		(proc0_7 67)
		(proc0_3)
		(gIconBar disable: 8)
		(= local40 global34)
		(localproc_01ba 213 10)
		(proc0_6 115)
		(pointHand posn: 180 125 init:)
		(polyLetter points: @local105)
		(proc806_3 letter clear letterbox behindTheHand)
		(localproc_0101)
		(= local0 0)
		(global1 setCursor: 5 1 180 125)
		(User canInput: 1)
	)
	
	(method (dispose)
		(localproc_022e)
		(= global34 local40)
		(global1 setCursor: local41 1 180 125)
		(gIconBar enable: 8)
		(super dispose:)
		(proc0_7 115)
		(proc0_6 110)
		(DisposeScript 213)
	)
)

(instance pointHand of Actor
	(properties
		x 180
		y 125
		view 182
		loop 1
		priority 15
		signal $6810
		illegalBits $0000
	)
	
	(method (doit)
		(self posn: global70 (- global71 10))
		(super doit:)
	)
)

(instance polyLetter of Polygon
	(properties
		size 14
	)
)

(instance behindTheHand of Feature
	(properties
		nsTop 45
		nsLeft 67
		nsBottom 152
		nsRight 249
	)
	
	(method (handleEvent pEvent)
		(if (self onMe: pEvent) (pEvent claimed: 1))
	)
)

(instance letter of Feature
	(properties)
	
	(method (handleEvent pEvent &tmp temp0 [temp1 2])
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(&
					(= local38 (OnControl 4 (pEvent x?) (pEvent y?)))
					$ffee
				)
			)
			(pEvent claimed: 1)
			(= temp0 -1)
			(while (and (not (& local38 $0001)) (< temp0 16))
				(++ temp0)
				(= local38 (>> local38 $0001))
			)
			(= local38 temp0)
			(if (AvoidPath (pEvent x?) (pEvent y?) polyLetter)
				(= local38 (+ local38 16))
			)
			(if (== local38 16)
				(= local37 13)
				(localproc_0056 0)
				(localproc_00a8)
				(proc0_4)
				(handCode dispose:)
			else
				(StrAt @temp1 0 (StrAt local133 local38))
				(StrAt @temp1 1 0)
				(localproc_0056 @temp1)
			)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance clear of Feature
	(properties
		nsBottom 189
		nsRight 319
		onMeCheck $0010
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(not (proc999_4 114 35 201 45 pEvent))
				(self onMe: pEvent)
			)
			(pEvent claimed: 1)
			(if (> local0 0)
				(= local37 13)
				(localproc_0056 temp0)
				(proc0_4)
			else
				(= local0 0)
				(proc0_4)
			)
			(handCode dispose:)
		else
			(super handleEvent: pEvent)
		)
	)
)

(instance letterbox of Feature
	(properties
		nsTop 15
		nsLeft 95
		nsBottom 42
		nsRight 225
	)
	
	(method (handleEvent pEvent &tmp temp0)
		(if
			(and
				(or
					(& (pEvent type?) evMOUSEBUTTON)
					(and
						(& (pEvent type?) evKEYBOARD)
						(== (pEvent message?) KEY_RETURN)
					)
				)
				(self onMe: pEvent)
			)
			(pEvent claimed: 1)
			(if local37 (localproc_000e))
			(super handleEvent: pEvent)
		)
	)
)
