;;; Sierra Script 1.0 - (do not remove this comment)
(script# 14)
(include sci.sh)
(use n937)


(class RhIconItem of IconI
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
	)
	
	(method (highlight param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(asm
			pTos     signal
			ldi      32
			and     
			not     
			bnt      code_0010
			ret     
code_0010:
			lap      argc
			bnt      code_001f
			lap      param1
			bnt      code_001f
			pToa     highlightColor
			jmp      code_0021
code_001f:
			pToa     lowlightColor
code_0021:
			sat      temp4
			pToa     nsTop
			sat      temp0
			pToa     nsLeft
			sat      temp1
			pTos     nsBottom
			ldi      2
			sub     
			sat      temp2
			pTos     nsRight
			ldi      1
			sub     
			sat      temp3
			pushi    8
			pushi    4
			lst      temp0
			lst      temp1
			lst      temp0
			push    
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp0
			lst      temp3
			lst      temp2
			lst      temp3
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp2
			lst      temp3
			lst      temp2
			lst      temp1
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    8
			pushi    4
			lst      temp2
			lst      temp1
			lst      temp0
			lst      temp1
			lst      temp4
			pushi    65535
			dup     
			callk    Graph,  16
			pushi    6
			pushi    12
			pTos     nsTop
			ldi      2
			sub     
			push    
			pTos     nsLeft
			ldi      2
			sub     
			push    
			pTos     nsBottom
			pTos     nsRight
			ldi      3
			add     
			push    
			pushi    1
			callk    Graph,  12
			ret     
		)
	)
	
	(method (onMe param1 param2 &tmp temp0)
		(asm
			pTos     signal
			ldi      4
			and     
			bnt      code_00b4
			ldi      0
			jmp      code_00bf
code_00b4:
			pushi    #onMe
			pushi    1
			lsp      param1
			&rest    param2
			super    IconI,  6
code_00bf:
			ret     
		)
	)
)
