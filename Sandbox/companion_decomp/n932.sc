;;; Sierra Script 1.0 - (do not remove this comment)
(script# 932)
(include sci.sh)
(use n000)
(use n255)

(public
	proc932_0 0
	proc932_1 1
	proc932_2 2
	proc932_3 3
	proc932_4 4
	proc932_5 5
	proc932_6 6
	proc932_7 7
)

(local
	local0
	local1
)
(procedure (proc932_0)
	(localproc_003c 0 &rest)
)

(procedure (proc932_1)
	(localproc_003c 1 &rest)
)

(procedure (proc932_2 param1 param2 param3 param4)
	(return
		(cond 
			((== (global1 printLang?) 1)
				(if
				(or (< argc 3) (== (global1 subtitleLang?) 0))
					param1
				else
					param3
				)
			)
			(
			(or (< argc 4) (== (global1 subtitleLang?) 0)) param2)
			(else param4)
		)
	)
)

(procedure (proc932_3 &tmp temp0)
	(if
	(and (not local0) (= temp0 (global1 subtitleLang?)))
		(= local0 temp0)
		(global1 subtitleLang: 0)
	)
	(return temp0)
)

(procedure (proc932_4 &tmp temp0)
	(if
	(and (= temp0 local0) (not (global1 subtitleLang?)))
		(global1 subtitleLang: local0)
		(= local0 0)
	)
	(return temp0)
)

(procedure (proc932_5 &tmp temp0)
	(return
		(if (= temp0 (global1 subtitleLang?))
			(global1 subtitleLang: (global1 printLang?))
			(global1 printLang: temp0)
			(return 1)
		else
			0
		)
	)
)

(procedure (proc932_6 param1 param2 param3 param4 &tmp temp0 temp1 temp2 [temp3 1000])
	(if (== argc 4)
		(GetFarText @temp3 param3 param4)
	else
		(StrCpy @temp3 param3)
	)
	(= temp0 (global1 printLang?))
	(= temp1 (global1 subtitleLang?))
	(global1 printLang: 1 subtitleLang: 0)
	(kernel_123 param1 @temp3 0)
	(if (= temp2 0)
		(global1 printLang: (= temp2 0))
		(kernel_123 param2 @temp3 0)
	else
		(StrCpy param2 {})
	)
	(global1 printLang: temp0 subtitleLang: temp1)
	(return param1)
)

(procedure (proc932_7 param1 param2)
	(return (if (== (global1 parseLang?) 1) param1 else param2))
)

(procedure (localproc_003c param1 &tmp temp0 temp1)
	(= temp1 (global1 subtitleLang?))
	(global1 subtitleLang: 0)
	(if param1 (Display &rest) else (proc255_0 &rest 121))
	(if temp1
		(= temp0 (global1 printLang?))
		(global1 printLang: temp1)
		(if param1 (Display &rest) else (proc255_0 &rest))
		(global1 printLang: temp0)
	)
	(global1 subtitleLang: temp1)
)
