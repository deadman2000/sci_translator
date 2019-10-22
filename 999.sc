(script 999)

(string
    string_0990 "Obj"
    string_0994 "Code"
    string_0999 "Collect"
    string_09a1 "List"
    string_09a6 "Set"
    string_09aa "EventHandler"
    string_09b7 "Script"
    string_09be "Event"
)

(said
)

(local
)

// 01b0
(class Obj of 
    (properties
    )
    (method (new) // method_0121
  0121:78               push1 
  0122:7c            pushSelf 
  0123:43 04 02         callk Clone 2 

  0126:48                 ret 
    )

    (method (init) // method_0127
  0127:48                 ret 
    )

    (method (doit) // method_0128
  0128:5c              selfID 
  0129:48                 ret 
    )

    (method (dispose) // method_012a
  012a:78               push1 
  012b:7c            pushSelf 
  012c:43 05 02         callk DisposeClone 2 

  012f:48                 ret 
    )

    (method (showStr) // method_0130
  0130:7a               push2 
  0131:8f 01              lsp param1 
  0133:67 06             pTos name 
  0135:43 47 04         callk StrCpy 4 

  0138:48                 ret 
    )

    (method (showSelf) // method_0139
  0139:3f c8             link c8 // (var $c8)
  013b:78               push1 
  013c:39 6d            pushi 6d // $6d showStr
  013e:78               push1 
  013f:5b 04 00           lea 4 0 
  0142:36                push 
  0143:54 06             self 6 

  0145:36                push 
  0146:47 ff 00 02      calle ff procedure_0000 2 //  

  014a:48                 ret 
    )

    (method (perform) // method_014b
  014b:39 3c            pushi 3c // $3c doit
  014d:78               push1 
  014e:7c            pushSelf 
  014f:59 02            &rest 2 
  0151:87 01              lap param1 
  0153:4a 06             send 6 

  0155:48                 ret 
    )

    (method (isKindOf) // method_0180
  0180:3f 01             link 1 // (var $1)
  0182:78               push1 
  0183:76               push0 
  0184:54 04             self 4 

  0186:a5 00              sat temp0 
  0188:67 00             pTos species 
  018a:76               push0 
  018b:76               push0 
  018c:87 01              lap param1 
  018e:4a 04             send 4 

  0190:1a                 eq? 
  0191:2e 0012             bt code_01a6 
  0194:78               push1 
  0195:8d 00              lst temp0 
  0197:43 06 02         callk IsObject 2 

  019a:30 0009            bnt code_01a6 
  019d:39 6f            pushi 6f // $6f isKindOf
  019f:78               push1 
  01a0:8f 01              lsp param1 
  01a2:85 00              lat temp0 
  01a4:4a 06             send 6 


        code_01a6
  01a6:48                 ret 
    )

    (method (isMemberOf) // method_015e
  015e:7a               push2 
  015f:76               push0 
  0160:87 01              lap param1 
  0162:4a 04             send 4 

  0164:36                push 
  0165:34 8000            ldi 8000 
  0168:12                 and 
  0169:30 0013            bnt code_017f 
  016c:67 04             pTos -info- 
  016e:34 8000            ldi 8000 
  0171:12                 and 
  0172:18                 not 
  0173:30 0009            bnt code_017f 
  0176:67 00             pTos species 
  0178:76               push0 
  0179:76               push0 
  017a:87 01              lap param1 
  017c:4a 04             send 4 

  017e:1a                 eq? 

        code_017f
  017f:48                 ret 
    )

    (method (respondsTo) // method_0156
  0156:7a               push2 
  0157:7c            pushSelf 
  0158:8f 01              lsp param1 
  015a:43 07 04         callk RespondsTo 4 

  015d:48                 ret 
    )

    (method (yourself) // method_01a7
  01a7:5c              selfID 
  01a8:48                 ret 
  01a9:00                bnot 
    )

)

// 0202
(class Code of Obj
    (properties
    )
    (method (doit) // method_01fa
  01fa:48                 ret 
  01fb:00                bnot 
    )

)

// 03c8
(class Collect of Obj
    (properties
        elements $0
        size $0
    )
    (method (doit) // method_0224
  0224:39 74            pushi 74 // $74 eachElementDo
  0226:78               push1 
  0227:39 3c            pushi 3c // $3c doit
  0229:59 01            &rest 1 
  022b:54 06             self 6 

  022d:48                 ret 
    )

    (method (dispose) // method_02af
  02af:63 08             pToa elements 
  02b1:30 000d            bnt code_02c1 
  02b4:39 74            pushi 74 // $74 eachElementDo
  02b6:78               push1 
  02b7:39 6c            pushi 6c // $6c dispose
  02b9:54 06             self 6 

  02bb:78               push1 
  02bc:67 08             pTos elements 
  02be:43 2f 02         callk DisposeList 2 


        code_02c1
  02c1:35 00              ldi 0 
  02c3:65 08             aTop elements 
  02c5:65 0a             aTop size 
  02c7:39 6c            pushi 6c // $6c dispose
  02c9:76               push0 
  02ca:57 00 04         super Obj 4 

  02cd:48                 ret 
    )

    (method (showStr) // method_022e
  022e:39 05            pushi 5 // $5 view
  0230:8f 01              lsp param1 
  0232:38 03e7          pushi 3e7 // $3e7 sel_999
  0235:76               push0 
  0236:67 06             pTos name 
  0238:67 0a             pTos size 
  023a:43 48 0a         callk Format a 

  023d:48                 ret 
    )

    (method (showSelf) // method_023e
  023e:3f 28             link 28 // (var $28)
  0240:78               push1 
  0241:39 6d            pushi 6d // $6d showStr
  0243:78               push1 
  0244:5b 04 00           lea 4 0 
  0247:36                push 
  0248:54 06             self 6 

  024a:36                push 
  024b:47 ff 00 02      calle ff procedure_0000 2 //  

  024f:39 74            pushi 74 // $74 eachElementDo
  0251:78               push1 
  0252:39 6e            pushi 6e // $6e showSelf
  0254:54 06             self 6 

  0256:48                 ret 
    )

    (method (add) // method_0257
  0257:3f 03             link 3 // (var $3)
  0259:63 08             pToa elements 
  025b:18                 not 
  025c:30 0006            bnt code_0265 
  025f:76               push0 
  0260:43 2e 00         callk NewList 0 

  0263:65 08             aTop elements 

        code_0265
  0265:35 00              ldi 0 
  0267:a5 01              sat temp1 

        code_0269
  0269:8d 01              lst temp1 
  026b:87 00              lap paramTotal 
  026d:22                 lt? 
  026e:30 0018            bnt code_0289 
  0271:7a               push2 
  0272:67 08             pTos elements 
  0274:7a               push2 
  0275:85 01              lat temp1 
  0277:9f 01             lspi param1 
  0279:9f 01             lspi param1 
  027b:43 30 04         callk NewNode 4 

  027e:36                push 
  027f:43 39 04         callk AddToEnd 4 

  0282:6b 0a            ipToa size 
  0284:c5 01              +at temp1 
  0286:32 ffe0            jmp code_0269 

        code_0289
  0289:5c              selfID 
  028a:48                 ret 
    )

    (method (delete) // method_028b
  028b:3f 01             link 1 // (var $1)
  028d:35 00              ldi 0 
  028f:a5 00              sat temp0 

        code_0291
  0291:8d 00              lst temp0 
  0293:87 00              lap paramTotal 
  0295:22                 lt? 
  0296:30 0014            bnt code_02ad 
  0299:7a               push2 
  029a:67 08             pTos elements 
  029c:85 00              lat temp0 
  029e:9f 01             lspi param1 
  02a0:43 3b 04         callk DeleteKey 4 

  02a3:30 0002            bnt code_02a8 
  02a6:6d 0a            dpToa size 

        code_02a8
  02a8:c5 00              +at temp0 
  02aa:32 ffe4            jmp code_0291 

        code_02ad
  02ad:5c              selfID 
  02ae:48                 ret 
    )

    (method (eachElementDo) // method_02f4
  02f4:3f 03             link 3 // (var $3)
  02f6:78               push1 
  02f7:67 08             pTos elements 
  02f9:43 31 02         callk FirstNode 2 

  02fc:a5 00              sat temp0 

        code_02fe
  02fe:85 00              lat temp0 
  0300:30 0029            bnt code_032c 
  0303:78               push1 
  0304:36                push 
  0305:43 34 02         callk NextNode 2 

  0308:a5 01              sat temp1 
  030a:78               push1 
  030b:78               push1 
  030c:8d 00              lst temp0 
  030e:43 36 02         callk NodeValue 2 

  0311:a5 02              sat temp2 
  0313:36                push 
  0314:43 06 02         callk IsObject 2 

  0317:18                 not 
  0318:30 0001            bnt code_031c 
  031b:48                 ret 

        code_031c
  031c:8f 01              lsp param1 
  031e:76               push0 
  031f:59 02            &rest 2 
  0321:85 02              lat temp2 
  0323:4a 04             send 4 

  0325:85 01              lat temp1 
  0327:a5 00              sat temp0 
  0329:32 ffd2            jmp code_02fe 

        code_032c
  032c:48                 ret 
    )

    (method (firstTrue) // method_032d
  032d:3f 03             link 3 // (var $3)
  032f:78               push1 
  0330:67 08             pTos elements 
  0332:43 31 02         callk FirstNode 2 

  0335:a5 00              sat temp0 

        code_0337
  0337:85 00              lat temp0 
  0339:30 0023            bnt code_035f 
  033c:78               push1 
  033d:36                push 
  033e:43 34 02         callk NextNode 2 

  0341:a5 01              sat temp1 
  0343:78               push1 
  0344:8d 00              lst temp0 
  0346:43 36 02         callk NodeValue 2 

  0349:a5 02              sat temp2 
  034b:8f 01              lsp param1 
  034d:76               push0 
  034e:59 02            &rest 2 
  0350:4a 04             send 4 

  0352:30 0003            bnt code_0358 
  0355:85 02              lat temp2 
  0357:48                 ret 

        code_0358
  0358:85 01              lat temp1 
  035a:a5 00              sat temp0 
  035c:32 ffd8            jmp code_0337 

        code_035f
  035f:35 00              ldi 0 
  0361:48                 ret 
    )

    (method (allTrue) // method_0362
  0362:3f 03             link 3 // (var $3)
  0364:78               push1 
  0365:67 08             pTos elements 
  0367:43 31 02         callk FirstNode 2 

  036a:a5 00              sat temp0 

        code_036c
  036c:85 00              lat temp0 
  036e:30 0024            bnt code_0395 
  0371:78               push1 
  0372:36                push 
  0373:43 34 02         callk NextNode 2 

  0376:a5 01              sat temp1 
  0378:78               push1 
  0379:8d 00              lst temp0 
  037b:43 36 02         callk NodeValue 2 

  037e:a5 02              sat temp2 
  0380:8f 01              lsp param1 
  0382:76               push0 
  0383:59 02            &rest 2 
  0385:4a 04             send 4 

  0387:18                 not 
  0388:30 0003            bnt code_038e 
  038b:35 00              ldi 0 
  038d:48                 ret 

        code_038e
  038e:85 01              lat temp1 
  0390:a5 00              sat temp0 
  0392:32 ffd7            jmp code_036c 

        code_0395
  0395:35 01              ldi 1 
  0397:48                 ret 
    )

    (method (contains) // method_02eb
  02eb:7a               push2 
  02ec:67 08             pTos elements 
  02ee:8f 01              lsp param1 
  02f0:43 3a 04         callk FindKey 4 

  02f3:48                 ret 
    )

    (method (isEmpty) // method_02dc
  02dc:67 08             pTos elements 
  02de:35 00              ldi 0 
  02e0:1a                 eq? 
  02e1:2e 0006             bt code_02ea 
  02e4:78               push1 
  02e5:67 08             pTos elements 
  02e7:43 33 02         callk EmptyList 2 


        code_02ea
  02ea:48                 ret 
    )

    (method (first) // method_02ce
  02ce:78               push1 
  02cf:67 08             pTos elements 
  02d1:43 31 02         callk FirstNode 2 

  02d4:48                 ret 
    )

    (method (next) // method_02d5
  02d5:78               push1 
  02d6:8f 01              lsp param1 
  02d8:43 34 02         callk NextNode 2 

  02db:48                 ret 
    )

    (method (release) // method_0398
  0398:3f 02             link 2 // (var $2)
  039a:78               push1 
  039b:67 08             pTos elements 
  039d:43 31 02         callk FirstNode 2 

  03a0:a5 00              sat temp0 

        code_03a2
  03a2:85 00              lat temp0 
  03a4:30 001a            bnt code_03c1 
  03a7:78               push1 
  03a8:36                push 
  03a9:43 34 02         callk NextNode 2 

  03ac:a5 01              sat temp1 
  03ae:39 54            pushi 54 // $54 delete
  03b0:78               push1 
  03b1:78               push1 
  03b2:8d 00              lst temp0 
  03b4:43 36 02         callk NodeValue 2 

  03b7:36                push 
  03b8:54 06             self 6 

  03ba:85 01              lat temp1 
  03bc:a5 00              sat temp0 
  03be:32 ffe1            jmp code_03a2 

        code_03c1
  03c1:48                 ret 
    )

)

// 0552
(class List of Collect
    (properties
        elements $0
        size $0
    )
    (method (showStr) // method_0426
  0426:39 05            pushi 5 // $5 view
  0428:8f 01              lsp param1 
  042a:38 03e7          pushi 3e7 // $3e7 sel_999
  042d:78               push1 
  042e:67 06             pTos name 
  0430:67 0a             pTos size 
  0432:43 48 0a         callk Format a 

  0435:48                 ret 
    )

    (method (at) // method_0436
  0436:3f 01             link 1 // (var $1)
  0438:78               push1 
  0439:67 08             pTos elements 
  043b:43 31 02         callk FirstNode 2 

  043e:a5 00              sat temp0 

        code_0440
  0440:87 01              lap param1 
  0442:30 0012            bnt code_0457 
  0445:85 00              lat temp0 
  0447:30 000d            bnt code_0457 
  044a:e7 01              -ap param1 
  044c:78               push1 
  044d:8d 00              lst temp0 
  044f:43 34 02         callk NextNode 2 

  0452:a5 00              sat temp0 
  0454:32 ffe9            jmp code_0440 

        code_0457
  0457:85 00              lat temp0 
  0459:30 0008            bnt code_0464 
  045c:78               push1 
  045d:36                push 
  045e:43 36 02         callk NodeValue 2 

  0461:32 0002            jmp code_0466 

        code_0464
  0464:35 00              ldi 0 

        code_0466
  0466:48                 ret 
    )

    (method (last) // method_0467
  0467:78               push1 
  0468:67 08             pTos elements 
  046a:43 32 02         callk LastNode 2 

  046d:48                 ret 
    )

    (method (prev) // method_046e
  046e:78               push1 
  046f:8f 01              lsp param1 
  0471:43 35 02         callk PrevNode 2 

  0474:48                 ret 
    )

    (method (addToFront) // method_0475
  0475:3f 01             link 1 // (var $1)
  0477:63 08             pToa elements 
  0479:18                 not 
  047a:30 0006            bnt code_0483 
  047d:76               push0 
  047e:43 2e 00         callk NewList 0 

  0481:65 08             aTop elements 

        code_0483
  0483:8f 00              lsp paramTotal 
  0485:35 01              ldi 1 
  0487:04                 sub 
  0488:a5 00              sat temp0 

        code_048a
  048a:76               push0 
  048b:85 00              lat temp0 
  048d:24                 le? 
  048e:30 0018            bnt code_04a9 
  0491:7a               push2 
  0492:67 08             pTos elements 
  0494:7a               push2 
  0495:85 00              lat temp0 
  0497:9f 01             lspi param1 
  0499:9f 01             lspi param1 
  049b:43 30 04         callk NewNode 4 

  049e:36                push 
  049f:43 38 04         callk AddToFront 4 

  04a2:6b 0a            ipToa size 
  04a4:e5 00              -at temp0 
  04a6:32 ffe1            jmp code_048a 

        code_04a9
  04a9:5c              selfID 
  04aa:48                 ret 
    )

    (method (addToEnd) // method_04ab
  04ab:3f 01             link 1 // (var $1)
  04ad:63 08             pToa elements 
  04af:18                 not 
  04b0:30 0006            bnt code_04b9 
  04b3:76               push0 
  04b4:43 2e 00         callk NewList 0 

  04b7:65 08             aTop elements 

        code_04b9
  04b9:35 00              ldi 0 
  04bb:a5 00              sat temp0 

        code_04bd
  04bd:8d 00              lst temp0 
  04bf:87 00              lap paramTotal 
  04c1:22                 lt? 
  04c2:30 0018            bnt code_04dd 
  04c5:7a               push2 
  04c6:67 08             pTos elements 
  04c8:7a               push2 
  04c9:85 00              lat temp0 
  04cb:9f 01             lspi param1 
  04cd:9f 01             lspi param1 
  04cf:43 30 04         callk NewNode 4 

  04d2:36                push 
  04d3:43 39 04         callk AddToEnd 4 

  04d6:6b 0a            ipToa size 
  04d8:c5 00              +at temp0 
  04da:32 ffe0            jmp code_04bd 

        code_04dd
  04dd:5c              selfID 
  04de:48                 ret 
    )

    (method (addAfter) // method_04df
  04df:3f 03             link 3 // (var $3)
  04e1:7a               push2 
  04e2:67 08             pTos elements 
  04e4:8f 01              lsp param1 
  04e6:43 3a 04         callk FindKey 4 

  04e9:a5 02              sat temp2 
  04eb:30 002b            bnt code_0519 
  04ee:e7 00              -ap paramTotal 
  04f0:35 00              ldi 0 
  04f2:a5 00              sat temp0 

        code_04f4
  04f4:8d 00              lst temp0 
  04f6:87 00              lap paramTotal 
  04f8:22                 lt? 
  04f9:30 001d            bnt code_0519 
  04fc:39 03            pushi 3 // $3 y
  04fe:67 08             pTos elements 
  0500:8d 02              lst temp2 
  0502:7a               push2 
  0503:85 00              lat temp0 
  0505:9f 02             lspi param2 
  0507:9f 02             lspi param2 
  0509:43 30 04         callk NewNode 4 

  050c:36                push 
  050d:43 37 06         callk AddAfter 6 

  0510:a5 02              sat temp2 
  0512:6b 0a            ipToa size 
  0514:c5 00              +at temp0 
  0516:32 ffdb            jmp code_04f4 

        code_0519
  0519:5c              selfID 
  051a:48                 ret 
    )

    (method (indexOf) // method_051b
  051b:3f 02             link 2 // (var $2)
  051d:35 00              ldi 0 
  051f:a5 00              sat temp0 
  0521:78               push1 
  0522:67 08             pTos elements 
  0524:43 31 02         callk FirstNode 2 

  0527:a5 01              sat temp1 

        code_0529
  0529:85 01              lat temp1 
  052b:30 001b            bnt code_0549 
  052e:8f 01              lsp param1 
  0530:78               push1 
  0531:36                push 
  0532:43 36 02         callk NodeValue 2 

  0535:1a                 eq? 
  0536:30 0003            bnt code_053c 
  0539:85 00              lat temp0 
  053b:48                 ret 

        code_053c
  053c:c5 00              +at temp0 
  053e:78               push1 
  053f:8d 01              lst temp1 
  0541:43 34 02         callk NextNode 2 

  0544:a5 01              sat temp1 
  0546:32 ffe0            jmp code_0529 

        code_0549
  0549:35 ff              ldi ff 
  054b:48                 ret 
    )

)

// 05ee
(class Set of List
    (properties
        elements $0
        size $0
    )
    (method (showStr) // method_0598
  0598:39 05            pushi 5 // $5 view
  059a:8f 01              lsp param1 
  059c:38 03e7          pushi 3e7 // $3e7 sel_999
  059f:7a               push2 
  05a0:67 06             pTos name 
  05a2:67 0a             pTos size 
  05a4:43 48 0a         callk Format a 

  05a7:48                 ret 
    )

    (method (add) // method_05a8
  05a8:3f 03             link 3 // (var $3)
  05aa:63 08             pToa elements 
  05ac:18                 not 
  05ad:30 0006            bnt code_05b6 
  05b0:76               push0 
  05b1:43 2e 00         callk NewList 0 

  05b4:65 08             aTop elements 

        code_05b6
  05b6:35 00              ldi 0 
  05b8:a5 01              sat temp1 

        code_05ba
  05ba:8d 01              lst temp1 
  05bc:87 00              lap paramTotal 
  05be:22                 lt? 
  05bf:30 0025            bnt code_05e7 
  05c2:85 01              lat temp1 
  05c4:97 01             lapi param1 
  05c6:a5 02              sat temp2 
  05c8:39 77            pushi 77 // $77 contains
  05ca:78               push1 
  05cb:36                push 
  05cc:54 06             self 6 

  05ce:18                 not 
  05cf:30 0010            bnt code_05e2 
  05d2:7a               push2 
  05d3:67 08             pTos elements 
  05d5:7a               push2 
  05d6:8d 02              lst temp2 
  05d8:3c                 dup 
  05d9:43 30 04         callk NewNode 4 

  05dc:36                push 
  05dd:43 39 04         callk AddToEnd 4 

  05e0:6b 0a            ipToa size 

        code_05e2
  05e2:c5 01              +at temp1 
  05e4:32 ffd3            jmp code_05ba 

        code_05e7
  05e7:48                 ret 
    )

)

// 066e
(class EventHandler of Set
    (properties
        elements $0
        size $0
    )
    (method (handleEvent) // method_061c
  061c:3f 03             link 3 // (var $3)
  061e:78               push1 
  061f:67 08             pTos elements 
  0621:43 31 02         callk FirstNode 2 

  0624:a5 00              sat temp0 

        code_0626
  0626:85 00              lat temp0 
  0628:30 0035            bnt code_0660 
  062b:39 4c            pushi 4c // $4c claimed
  062d:76               push0 
  062e:87 01              lap param1 
  0630:4a 04             send 4 

  0632:18                 not 
  0633:30 002a            bnt code_0660 
  0636:78               push1 
  0637:8d 00              lst temp0 
  0639:43 34 02         callk NextNode 2 

  063c:a5 01              sat temp1 
  063e:78               push1 
  063f:78               push1 
  0640:8d 00              lst temp0 
  0642:43 36 02         callk NodeValue 2 

  0645:a5 02              sat temp2 
  0647:36                push 
  0648:43 06 02         callk IsObject 2 

  064b:18                 not 
  064c:2e 0011             bt code_0660 
  064f:38 0081          pushi 81 // $81 handleEvent
  0652:78               push1 
  0653:8f 01              lsp param1 
  0655:85 02              lat temp2 
  0657:4a 06             send 6 

  0659:85 01              lat temp1 
  065b:a5 00              sat temp0 
  065d:32 ffc6            jmp code_0626 

        code_0660
  0660:39 4c            pushi 4c // $4c claimed
  0662:76               push0 
  0663:87 01              lap param1 
  0665:4a 04             send 4 

  0667:48                 ret 
    )

)

// 0838
(class Script of Obj
    (properties
        client $0
        state $ffff
        start $0
        timer $0
        cycles $0
        seconds $0
        lastSeconds $0
        ticks $0
        lastTicks $0
        register $0
        script $0
        caller $0
        next $0
    )
    (method (init) // method_0706
  0706:81 58              lag  
  0708:65 18             aTop lastTicks 
  070a:8f 00              lsp paramTotal 
  070c:35 01              ldi 1 
  070e:20                 ge? 
  070f:30 0023            bnt code_0735 
  0712:38 008a          pushi 8a // $8a script
  0715:78               push1 
  0716:7c            pushSelf 
  0717:87 01              lap param1 
  0719:65 08             aTop client 
  071b:4a 06             send 6 

  071d:8f 00              lsp paramTotal 
  071f:35 02              ldi 2 
  0721:20                 ge? 
  0722:30 0010            bnt code_0735 
  0725:87 02              lap param2 
  0727:65 1e             aTop caller 
  0729:8f 00              lsp paramTotal 
  072b:35 03              ldi 3 
  072d:20                 ge? 
  072e:30 0004            bnt code_0735 
  0731:87 03              lap param3 
  0733:65 1a             aTop register 

        code_0735
  0735:67 0c             pTos start 
  0737:35 01              ldi 1 
  0739:04                 sub 
  073a:65 0a             aTop state 
  073c:38 008d          pushi 8d // $8d cue
  073f:76               push0 
  0740:54 04             self 4 

  0742:48                 ret 
    )

    (method (doit) // method_0698
  0698:3f 01             link 1 // (var $1)
  069a:63 1c             pToa script 
  069c:30 0005            bnt code_06a4 
  069f:39 3c            pushi 3c // $3c doit
  06a1:76               push0 
  06a2:4a 04             send 4 


        code_06a4
  06a4:63 10             pToa cycles 
  06a6:30 000f            bnt code_06b8 
  06a9:6d 10            dpToa cycles 
  06ab:18                 not 
  06ac:30 0052            bnt code_0701 
  06af:38 008d          pushi 8d // $8d cue
  06b2:76               push0 
  06b3:54 04             self 4 

  06b5:32 0049            jmp code_0701 

        code_06b8
  06b8:63 12             pToa seconds 
  06ba:30 0020            bnt code_06dd 
  06bd:78               push1 
  06be:78               push1 
  06bf:43 42 02         callk GetTime 2 

  06c2:a5 00              sat temp0 
  06c4:67 14             pTos lastSeconds 
  06c6:1c                 ne? 
  06c7:30 0037            bnt code_0701 
  06ca:85 00              lat temp0 
  06cc:65 14             aTop lastSeconds 
  06ce:6d 12            dpToa seconds 
  06d0:18                 not 
  06d1:30 002d            bnt code_0701 
  06d4:38 008d          pushi 8d // $8d cue
  06d7:76               push0 
  06d8:54 04             self 4 

  06da:32 0024            jmp code_0701 

        code_06dd
  06dd:63 16             pToa ticks 
  06df:30 001f            bnt code_0701 
  06e2:36                push 
  06e3:78               push1 
  06e4:89 58              lsg  
  06e6:63 18             pToa lastTicks 
  06e8:04                 sub 
  06e9:36                push 
  06ea:43 3d 02         callk Abs 2 

  06ed:04                 sub 
  06ee:65 16             aTop ticks 
  06f0:36                push 
  06f1:35 00              ldi 0 
  06f3:24                 le? 
  06f4:30 000a            bnt code_0701 
  06f7:35 00              ldi 0 
  06f9:65 16             aTop ticks 
  06fb:38 008d          pushi 8d // $8d cue
  06fe:76               push0 
  06ff:54 04             self 4 


        code_0701
  0701:81 58              lag  
  0703:65 18             aTop lastTicks 
  0705:48                 ret 
    )

    (method (dispose) // method_0743
  0743:3f 01             link 1 // (var $1)
  0745:78               push1 
  0746:67 1c             pTos script 
  0748:43 06 02         callk IsObject 2 

  074b:30 0007            bnt code_0755 
  074e:39 6c            pushi 6c // $6c dispose
  0750:76               push0 
  0751:63 1c             pToa script 
  0753:4a 04             send 4 


        code_0755
  0755:78               push1 
  0756:67 0e             pTos timer 
  0758:43 06 02         callk IsObject 2 

  075b:30 0007            bnt code_0765 
  075e:39 6c            pushi 6c // $6c dispose
  0760:76               push0 
  0761:63 0e             pToa timer 
  0763:4a 04             send 4 


        code_0765
  0765:78               push1 
  0766:67 08             pTos client 
  0768:43 06 02         callk IsObject 2 

  076b:30 0049            bnt code_07b7 
  076e:38 008a          pushi 8a // $8a script
  0771:78               push1 
  0772:78               push1 
  0773:67 20             pTos next 
  0775:43 06 02         callk IsObject 2 

  0778:30 0005            bnt code_0780 
  077b:63 20             pToa next 
  077d:32 000a            jmp code_078a 

        code_0780
  0780:63 20             pToa next 
  0782:30 0005            bnt code_078a 
  0785:78               push1 
  0786:36                push 
  0787:43 02 02         callk ScriptID 2 


        code_078a
  078a:a5 00              sat temp0 
  078c:36                push 
  078d:63 08             pToa client 
  078f:4a 06             send 6 

  0791:85 00              lat temp0 
  0793:18                 not 
  0794:30 0005            bnt code_079c 
  0797:35 00              ldi 0 
  0799:32 001b            jmp code_07b7 

        code_079c
  079c:89 0d              lsg  
  079e:81 0b              lag  
  07a0:1a                 eq? 
  07a1:30 000c            bnt code_07b0 
  07a4:39 6b            pushi 6b // $6b init
  07a6:78               push1 
  07a7:67 08             pTos client 
  07a9:85 00              lat temp0 
  07ab:4a 06             send 6 

  07ad:32 0007            jmp code_07b7 

        code_07b0
  07b0:39 6c            pushi 6c // $6c dispose
  07b2:76               push0 
  07b3:85 00              lat temp0 
  07b5:4a 04             send 4 


        code_07b7
  07b7:78               push1 
  07b8:67 1e             pTos caller 
  07ba:43 06 02         callk IsObject 2 

  07bd:30 0012            bnt code_07d2 
  07c0:89 0d              lsg  
  07c2:81 0b              lag  
  07c4:1a                 eq? 
  07c5:30 000a            bnt code_07d2 
  07c8:38 008d          pushi 8d // $8d cue
  07cb:78               push1 
  07cc:67 1a             pTos register 
  07ce:63 1e             pToa caller 
  07d0:4a 06             send 6 


        code_07d2
  07d2:35 00              ldi 0 
  07d4:65 1e             aTop caller 
  07d6:65 20             aTop next 
  07d8:65 08             aTop client 
  07da:65 0e             aTop timer 
  07dc:65 1c             aTop script 
  07de:39 6c            pushi 6c // $6c dispose
  07e0:76               push0 
  07e1:57 00 04         super Obj 4 

  07e4:48                 ret 
    )

    (method (changeState) // method_07e5
  07e5:87 01              lap param1 
  07e7:65 0a             aTop state 
  07e9:48                 ret 
    )

    (method (cue) // method_07ea
  07ea:63 08             pToa client 
  07ec:30 000e            bnt code_07fd 
  07ef:38 008c          pushi 8c // $8c changeState
  07f2:78               push1 
  07f3:67 0a             pTos state 
  07f5:35 01              ldi 1 
  07f7:02                 add 
  07f8:36                push 
  07f9:59 01            &rest 1 
  07fb:54 06             self 6 


        code_07fd
  07fd:48                 ret 
    )

    (method (handleEvent) // method_081c
  081c:63 1c             pToa script 
  081e:30 0008            bnt code_0829 
  0821:38 0081          pushi 81 // $81 handleEvent
  0824:78               push1 
  0825:8f 01              lsp param1 
  0827:4a 06             send 6 


        code_0829
  0829:39 4c            pushi 4c // $4c claimed
  082b:76               push0 
  082c:87 01              lap param1 
  082e:4a 04             send 4 

  0830:48                 ret 
  0831:00                bnot 
    )

    (method (setScript) // method_07fe
  07fe:78               push1 
  07ff:67 1c             pTos script 
  0801:43 06 02         callk IsObject 2 

  0804:30 0007            bnt code_080e 
  0807:39 6c            pushi 6c // $6c dispose
  0809:76               push0 
  080a:63 1c             pToa script 
  080c:4a 04             send 4 


        code_080e
  080e:87 01              lap param1 
  0810:30 0008            bnt code_081b 
  0813:39 6b            pushi 6b // $6b init
  0815:78               push1 
  0816:7c            pushSelf 
  0817:59 02            &rest 2 
  0819:4a 06             send 6 


        code_081b
  081b:48                 ret 
    )

)

// 094a
(class Event of Obj
    (properties
        type $0
        message $0
        modifiers $0
        y $0
        x $0
        claimed $0
        port $0
    )
    (method (new) // method_08a6
  08a6:3f 01             link 1 // (var $1)
  08a8:39 6a            pushi 6a // $6a new
  08aa:76               push0 
  08ab:57 00 04         super Obj 4 

  08ae:a5 00              sat temp0 
  08b0:7a               push2 
  08b1:87 00              lap paramTotal 
  08b3:30 0005            bnt code_08bb 
  08b6:87 01              lap param1 
  08b8:32 0003            jmp code_08be 

        code_08bb
  08bb:34 7fff            ldi 7fff 

        code_08be
  08be:36                push 
  08bf:8d 00              lst temp0 
  08c1:43 1c 04         callk GetEvent 4 

  08c4:85 00              lat temp0 
  08c6:48                 ret 
    )

    (method (localize) // method_08c7
  08c7:3f 01             link 1 // (var $1)
  08c9:67 08             pTos type 
  08cb:34 4000            ldi 4000 
  08ce:1c                 ne? 
  08cf:30 0036            bnt code_0908 
  08d2:76               push0 
  08d3:43 14 00         callk GetPort 0 

  08d6:a5 00              sat temp0 
  08d8:63 14             pToa port 
  08da:18                 not 
  08db:30 0008            bnt code_08e6 
  08de:78               push1 
  08df:7c            pushSelf 
  08e0:43 1d 02         callk GlobalToLocal 2 

  08e3:32 001e            jmp code_0904 

        code_08e6
  08e6:67 14             pTos port 
  08e8:85 00              lat temp0 
  08ea:1c                 ne? 
  08eb:30 0016            bnt code_0904 
  08ee:78               push1 
  08ef:67 14             pTos port 
  08f1:43 15 02         callk SetPort 2 

  08f4:78               push1 
  08f5:7c            pushSelf 
  08f6:43 1e 02         callk LocalToGlobal 2 

  08f9:78               push1 
  08fa:8d 00              lst temp0 
  08fc:43 15 02         callk SetPort 2 

  08ff:78               push1 
  0900:7c            pushSelf 
  0901:43 1d 02         callk GlobalToLocal 2 


        code_0904
  0904:85 00              lat temp0 
  0906:65 14             aTop port 

        code_0908
  0908:5c              selfID 
  0909:48                 ret 
    )

    (method (globalize) // method_090a
  090a:3f 01             link 1 // (var $1)
  090c:67 08             pTos type 
  090e:34 4000            ldi 4000 
  0911:1c                 ne? 
  0912:30 002d            bnt code_0942 
  0915:76               push0 
  0916:43 14 00         callk GetPort 0 

  0919:a5 00              sat temp0 
  091b:67 14             pTos port 
  091d:1a                 eq? 
  091e:30 0008            bnt code_0929 
  0921:78               push1 
  0922:7c            pushSelf 
  0923:43 1e 02         callk LocalToGlobal 2 

  0926:32 0015            jmp code_093e 

        code_0929
  0929:63 14             pToa port 
  092b:30 0010            bnt code_093e 
  092e:78               push1 
  092f:36                push 
  0930:43 15 02         callk SetPort 2 

  0933:78               push1 
  0934:7c            pushSelf 
  0935:43 1e 02         callk LocalToGlobal 2 

  0938:78               push1 
  0939:8d 00              lst temp0 
  093b:43 15 02         callk SetPort 2 


        code_093e
  093e:35 00              ldi 0 
  0940:65 14             aTop port 

        code_0942
  0942:5c              selfID 
  0943:48                 ret 
    )

)


// EXPORTED procedure #0 ()
(procedure proc_002a
  002a:8f 01              lsp param1 
  002c:35 00              ldi 0 
  002e:22                 lt? 
  002f:30 0005            bnt code_0037 
  0032:35 ff              ldi ff 
  0034:32 0005            jmp code_003c 

        code_0037
  0037:8f 01              lsp param1 
  0039:35 00              ldi 0 
  003b:1e                 gt? 

        code_003c
  003c:48                 ret 
)

// EXPORTED procedure #1 ()
(procedure proc_003d
  003d:8f 01              lsp param1 
  003f:8f 02              lsp param2 
  0041:8f 01              lsp param1 
  0043:87 02              lap param2 
  0045:08                 div 
  0046:06                 mul 
  0047:04                 sub 
  0048:a7 01              sap param1 
  004a:36                push 
  004b:35 00              ldi 0 
  004d:22                 lt? 
  004e:30 0007            bnt code_0058 
  0051:8f 01              lsp param1 
  0053:87 02              lap param2 
  0055:02                 add 
  0056:a7 01              sap param1 

        code_0058
  0058:87 01              lap param1 
  005a:48                 ret 
)

// EXPORTED procedure #2 ()
(procedure proc_005b
  005b:3f 01             link 1 // (var $1)
  005d:8f 00              lsp paramTotal 
  005f:35 01              ldi 1 
  0061:1a                 eq? 
  0062:2e 000c             bt code_0071 
  0065:8f 01              lsp param1 
  0067:76               push0 
  0068:59 02            &rest 2 
  006a:40 ffed 00        call proc_005b 0 

  006e:a5 00              sat temp0 
  0070:22                 lt? 

        code_0071
  0071:30 0005            bnt code_0079 
  0074:87 01              lap param1 
  0076:32 0002            jmp code_007b 

        code_0079
  0079:85 00              lat temp0 

        code_007b
  007b:48                 ret 
)

// EXPORTED procedure #3 ()
(procedure proc_007c
  007c:3f 01             link 1 // (var $1)
  007e:8f 00              lsp paramTotal 
  0080:35 01              ldi 1 
  0082:1a                 eq? 
  0083:2e 000c             bt code_0092 
  0086:8f 01              lsp param1 
  0088:76               push0 
  0089:59 02            &rest 2 
  008b:40 ffed 00        call proc_007c 0 

  008f:a5 00              sat temp0 
  0091:1e                 gt? 

        code_0092
  0092:30 0005            bnt code_009a 
  0095:87 01              lap param1 
  0097:32 0002            jmp code_009c 

        code_009a
  009a:85 00              lat temp0 

        code_009c
  009c:48                 ret 
)

// EXPORTED procedure #4 ()
(procedure proc_009d
  009d:8f 01              lsp param1 
  009f:8f 00              lsp paramTotal 
  00a1:35 06              ldi 6 
  00a3:22                 lt? 
  00a4:30 000a            bnt code_00b1 
  00a7:39 04            pushi 4 // $4 x
  00a9:76               push0 
  00aa:87 05              lap param5 
  00ac:4a 04             send 4 

  00ae:32 0002            jmp code_00b3 

        code_00b1
  00b1:87 05              lap param5 

        code_00b3
  00b3:24                 le? 
  00b4:30 0025            bnt code_00dc 
  00b7:60               pprev 
  00b8:87 03              lap param3 
  00ba:24                 le? 
  00bb:30 001e            bnt code_00dc 
  00be:8f 02              lsp param2 
  00c0:8f 00              lsp paramTotal 
  00c2:35 06              ldi 6 
  00c4:22                 lt? 
  00c5:30 000a            bnt code_00d2 
  00c8:39 03            pushi 3 // $3 y
  00ca:76               push0 
  00cb:87 05              lap param5 
  00cd:4a 04             send 4 

  00cf:32 0002            jmp code_00d4 

        code_00d2
  00d2:87 06              lap param6 

        code_00d4
  00d4:24                 le? 
  00d5:30 0004            bnt code_00dc 
  00d8:60               pprev 
  00d9:87 04              lap param4 
  00db:24                 le? 

        code_00dc
  00dc:48                 ret 
)

// EXPORTED procedure #5 ()
(procedure proc_00dd
  00dd:3f 01             link 1 // (var $1)
  00df:35 00              ldi 0 
  00e1:a5 00              sat temp0 

        code_00e3
  00e3:8d 00              lst temp0 
  00e5:8f 00              lsp paramTotal 
  00e7:35 01              ldi 1 
  00e9:04                 sub 
  00ea:22                 lt? 
  00eb:30 0017            bnt code_0105 
  00ee:8f 01              lsp param1 
  00f0:85 00              lat temp0 
  00f2:97 02             lapi param2 
  00f4:1a                 eq? 
  00f5:30 0008            bnt code_0100 
  00f8:87 01              lap param1 
  00fa:2e 0002             bt code_00ff 
  00fd:35 01              ldi 1 

        code_00ff
  00ff:48                 ret 

        code_0100
  0100:c5 00              +at temp0 
  0102:32 ffde            jmp code_00e3 

        code_0105
  0105:35 00              ldi 0 
  0107:48                 ret 
)

// EXPORTED procedure #6 ()
(procedure proc_0108
  0108:7a               push2 
  0109:39 05            pushi 5 // $5 view
  010b:8f 01              lsp param1 
  010d:7a               push2 
  010e:87 02              lap param2 
  0110:06                 mul 
  0111:02                 add 
  0112:36                push 
  0113:43 72 04         callk Memory 4 

  0116:48                 ret 
)

// EXPORTED procedure #7 ()
(procedure proc_0117
  0117:8f 02              lsp param2 
  0119:76               push0 
  011a:59 03            &rest 3 
  011c:87 01              lap param1 
  011e:4a 04             send 4 

  0120:48                 ret 
)


