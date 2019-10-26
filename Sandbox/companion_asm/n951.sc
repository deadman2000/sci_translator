;;; Sierra Script 1.0 - (do not remove this comment)
(script# 951)
(include sci.sh)
(use n945)


(class MoveFwd of PolyPath
	(properties
		client 0
		caller 0
		x 0
		y 0
		dx 0
		dy 0
		b-moveCnt 0
		b-i1 0
		b-i2 0
		b-di 0
		b-xAxis 0
		b-incr 0
		completed 0
		xLast 0
		yLast 0
		value 2
		points 0
		finalX 0
		finalY 0
		obstacles 0
	)
	
	(method (init param1 param2 param3)
		(asm
			lap      argc
			bnt      code_0050
			pushi    107
			pushi    4
			lsp      param1
			pushi    #x
			pushi    0
			lap      param1
			send     4
			push    
			pushi    2
			pushi    #heading
			pushi    0
			lap      param1
			send     4
			push    
			lsp      param2
			callk    SinMult,  4
			add     
			push    
			pushi    #y
			pushi    0
			lap      param1
			send     4
			push    
			pushi    2
			pushi    #heading
			pushi    0
			lap      param1
			send     4
			push    
			lsp      param2
			callk    CosMult,  4
			sub     
			push    
			lsp      argc
			ldi      3
			ge?     
			bnt      code_0049
			lap      param3
code_0049:
			push    
			super    PolyPath,  12
			jmp      code_0056
code_0050:
			pushi    #init
			pushi    0
			super    PolyPath,  4
code_0056:
			ret     
		)
	)
)
