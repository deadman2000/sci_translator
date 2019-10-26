;;; Sierra Script 1.0 - (do not remove this comment)
(script# 927)
(include sci.sh)
(use n945)
(use n946)
(use n999)


(class PAvoider of Code
	(properties
		client 0
	)
	
	(method (init param1)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_0010
			lap      param1
			aTop     client
code_0010:
			ret     
		)
	)
	
	(method (doit &tmp temp0 temp1 temp2 temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10 temp11 temp12)
		(asm
			pushi    #mover
			pushi    0
			pToa     client
			send     4
			sat      temp8
			bnt      code_021b
			pushi    1
			pushi    #doit
			pushi    0
			send     4
			sat      temp2
			push    
			callk    IsObject,  2
			bnt      code_021b
			pushi    #completed
			pushi    0
			lat      temp8
			send     4
			not     
			bnt      code_021b
			pushi    #isKindOf
			pushi    1
			class    PolyPath
			push    
			lat      temp8
			send     6
			bnt      code_021b
			pushi    1
			pushi    234
			pushi    0
			lat      temp8
			send     0
			send     4
			push    
			callk    IsObject,  2
			bnt      code_021b
			pushi    #brLeft
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    2
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			mul     
			push    
			pushi    2
			pushi    3
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pushi    2
			pushi    0
			callk    CelWide,  6
			push    
			pushi    3
			pushi    #view
			pushi    0
			pToa     client
			send     4
			push    
			pushi    0
			pushi    0
			callk    CelWide,  6
			push    
			calle    proc999_3,  4
			push    
			ldi      2
			div     
			add     
			sat      temp0
			sub     
			sat      temp4
			pushi    2
			pushi    1
			pushi    1
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			callk    CoordPri,  2
			push    
			callk    CoordPri,  4
			push    
			pushi    #yStep
			pushi    0
			pToa     client
			send     4
			push    
			ldi      2
			mul     
			sat      temp1
			sub     
			sat      temp5
			pushi    #brRight
			pushi    0
			lat      temp2
			send     4
			push    
			lat      temp0
			add     
			sat      temp6
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			lat      temp1
			add     
			sat      temp7
			pushi    #mover
			pushi    0
			lat      temp2
			send     4
			bnt      code_0184
			pushi    #heading
			pushi    0
			lat      temp2
			send     4
			sat      temp9
			pushi    2
			pushi    60
			pushi    #moveSpeed
			pushi    0
			lat      temp2
			send     4
			push    
			ldi      1
			add     
			mul     
			push    
			pushi    10
			pushi    #moveSpeed
			pushi    0
			pToa     client
			send     4
			push    
			ldi      1
			add     
			mul     
			div     
			push    
			pushi    20
			calle    proc999_2,  4
			sat      temp12
			push    
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			mul     
			sat      temp10
			lst      temp12
			pushi    #yStep
			pushi    0
			pToa     client
			send     4
			mul     
			sat      temp11
			pushi    2
			lst      temp9
			lst      temp10
			callk    SinMult,  4
			sat      temp0
			pushi    2
			lst      temp9
			lst      temp11
			callk    CosMult,  4
			neg     
			sat      temp1
			lst      temp0
			ldi      0
			lt?     
			bnt      code_0154
			lst      temp4
			lat      temp0
			add     
			sat      temp4
			jmp      code_0163
code_0154:
			lst      temp0
			ldi      0
			gt?     
			bnt      code_0163
			lst      temp6
			lat      temp0
			add     
			sat      temp6
code_0163:
			lst      temp1
			ldi      0
			lt?     
			bnt      code_0175
			lst      temp5
			lat      temp0
			add     
			sat      temp5
			jmp      code_0184
code_0175:
			lst      temp1
			ldi      0
			gt?     
			bnt      code_0184
			lst      temp7
			lat      temp0
			add     
			sat      temp7
code_0184:
			pushi    115
			pushi    1
			pushi    #init
			pushi    12
			lst      temp4
			lst      temp5
			lst      temp6
			lst      temp5
			lst      temp6
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			add     
			push    
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			lst      temp6
			lst      temp7
			lst      temp4
			lst      temp7
			lst      temp4
			pushi    #xStep
			pushi    0
			pToa     client
			send     4
			sub     
			push    
			pushi    #y
			pushi    0
			lat      temp2
			send     4
			push    
			pushi    34
			pushi    1
			pushi    2
			pushi    23
			pushi    1
			lofsa    {isBlockedPoly}
			push    
			pushi    114
			pushi    0
			pushi    #new
			pushi    0
			class    Polygon
			send     4
			send     44
			sat      temp3
			push    
			pushi    #obstacles
			pushi    0
			lat      temp8
			send     4
			send     6
			pushi    #value
			pushi    1
			pushi    2
			pushi    107
			pushi    3
			pTos     client
			pushi    #finalX
			pushi    0
			lat      temp8
			send     4
			push    
			pushi    #finalY
			pushi    0
			lat      temp8
			send     4
			push    
			lat      temp8
			send     16
			pushi    #delete
			pushi    1
			lst      temp3
			pushi    #obstacles
			pushi    0
			lat      temp8
			send     4
			send     6
			pushi    #dispose
			pushi    0
			lat      temp3
			send     4
code_021b:
			ret     
		)
	)
)
