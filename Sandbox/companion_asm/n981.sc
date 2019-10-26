;;; Sierra Script 1.0 - (do not remove this comment)
(script# 981)
(include sci.sh)
(use n999)


(class SysWindow of Obj
	(properties
		top 0
		left 0
		bottom 0
		right 0
		color 0
		back 15
		priority 15
		window 0
		type $0000
		title 0
		brTop 0
		brLeft 0
		brBottom 190
		brRight 320
		eraseOnly 0
	)
	
	(method (dispose)
		(asm
			pToa     window
			bnt      code_002e
			pushi    2
			push    
			pTos     eraseOnly
			callk    DisposeWindow,  4
			ldi      0
			aTop     window
code_002e:
			pushi    #dispose
			pushi    0
			super    Obj,  4
			ret     
		)
	)
	
	(method (open)
		(asm
			pushi    9
			pTos     top
			pTos     left
			pTos     bottom
			pTos     right
			pTos     title
			pTos     type
			pTos     priority
			pTos     color
			pTos     back
			callk    NewWindow,  18
			aTop     window
			ret     
		)
	)
)

(class Window of SysWindow
	(properties
		top 0
		left 0
		bottom 0
		right 0
		color 0
		back 15
		priority -1
		window 0
		type $0000
		title 0
		brTop 0
		brLeft 0
		brBottom 190
		brRight 320
		eraseOnly 0
		underBits 0
	)
	
	(method (doit)
		(asm
			ret     
		)
	)
	
	(method (dispose)
		(asm
			pushi    #restore
			pushi    0
			self     4
			pToa     window
			bnt      code_01dc
			pushi    1
			push    
			callk    DisposeWindow,  2
			ldi      0
			aTop     window
code_01dc:
			pushi    #dispose
			pushi    0
			super    SysWindow,  4
			ret     
		)
	)
	
	(method (open)
		(asm
			pushi    9
			pTos     top
			pTos     left
			pTos     bottom
			pTos     right
			pTos     title
			pTos     type
			pTos     priority
			pTos     color
			pTos     back
			callk    NewWindow,  18
			aTop     window
			ret     
		)
	)
	
	(method (handleEvent)
		(asm
			ldi      0
			ret     
		)
	)
	
	(method (setMapSet &tmp temp0)
		(asm
			ldi      0
			sat      temp0
			pushi    65535
			pToa     color
			ne?     
			bnt      code_0129
			lst      temp0
			ldi      1
			or      
			sat      temp0
code_0129:
			pushi    65535
			pToa     priority
			ne?     
			bnt      code_0138
			lst      temp0
			ldi      2
			or      
			sat      temp0
code_0138:
			lat      temp0
			ret     
		)
	)
	
	(method (move param1 param2)
		(asm
			pTos     left
			lap      param1
			add     
			aTop     left
			pTos     right
			lap      param2
			add     
			aTop     right
			pTos     right
			lap      param1
			add     
			aTop     right
			pTos     bottom
			lap      param2
			add     
			aTop     bottom
			ret     
		)
	)
	
	(method (moveTo param1 param2)
		(asm
			pushi    171
			pushi    2
			lsp      param1
			pToa     left
			sub     
			push    
			lsp      param2
			pToa     top
			sub     
			push    
			self     8
			ret     
		)
	)
	
	(method (draw param1 param2)
		(asm
			lsp      argc
			ldi      1
			ge?     
			bnt      code_015e
			lap      param1
			aTop     color
code_015e:
			lsp      argc
			ldi      2
			ge?     
			bnt      code_016a
			lap      param2
			aTop     priority
code_016a:
			pushi    8
			pushi    11
			pTos     top
			pTos     left
			pTos     bottom
			pTos     right
			pushi    #setMapSet
			pushi    0
			self     4
			push    
			pTos     color
			pTos     priority
			callk    Graph,  16
			ret     
		)
	)
	
	(method (save)
		(asm
			pushi    6
			pushi    7
			pTos     top
			pTos     left
			pTos     bottom
			pTos     right
			pushi    #setMapSet
			pushi    0
			self     4
			push    
			callk    Graph,  12
			aTop     underBits
			ret     
		)
	)
	
	(method (restore)
		(asm
			pToa     underBits
			bnt      code_01aa
			pushi    2
			pushi    8
			push    
			callk    Graph,  4
code_01aa:
			ret     
		)
	)
	
	(method (inset param1 param2)
		(asm
			pTos     top
			lap      param2
			add     
			aTop     top
			pTos     left
			lap      param1
			add     
			aTop     left
			pTos     bottom
			lap      param2
			sub     
			aTop     bottom
			pTos     right
			lap      param1
			sub     
			aTop     right
			ret     
		)
	)
	
	(method (show)
		(asm
			pushi    6
			pushi    12
			pTos     top
			pTos     left
			pTos     bottom
			pTos     right
			pushi    #setMapSet
			pushi    0
			self     4
			push    
			callk    Graph,  12
			ret     
		)
	)
	
	(method (erase)
		(asm
			pushi    #draw
			pushi    2
			pTos     back
			pushi    65535
			self     8
			ret     
		)
	)
	
	(method (center)
		(asm
			pushi    172
			pushi    2
			pTos     brRight
			pToa     left
			sub     
			push    
			pTos     right
			pToa     left
			sub     
			sub     
			push    
			ldi      2
			div     
			push    
			pTos     brBottom
			pToa     top
			sub     
			push    
			pTos     bottom
			pToa     top
			sub     
			sub     
			push    
			ldi      2
			div     
			push    
			self     8
			ret     
		)
	)
)
