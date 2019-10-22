(script 813)

(string
    string_07c0 "rhEgo"
    string_07c6 "Head"
    string_07cb "SpecialDoVerb"
    string_07d9 "Beard"
    string_07df ""
)

(said
)

(local
    local0 = $0000
    local1 = $0004
    local2 = $0006
    local3 = $0002
    local4 = $0007
    local5 = $0005
    local6 = $0001
    local7 = $0003
)

// 0180
(class rhEgo of Ego
    (properties
        x $0
        y $0
        z $0
        heading $0
        noun $0
        nsTop $0
        nsLeft $0
        nsBottom $0
        nsRight $0
        description $0
        sightAngle $6789
        actions $0
        onMeCheck $6789
        approachX $0
        approachY $0
        approachDist $0
        _approachVerbs $6789
        lookStr $0
        yStep $2
        view $0
        loop $0
        cel $0
        priority $0
        underBits $0
        signal $2000
        lsTop $0
        lsLeft $0
        lsBottom $0
        lsRight $0
        brTop $0
        brLeft $0
        brBottom $0
        brRight $0
        palette $0
        cycleSpeed $6
        script $0
        cycler $0
        timer $0
        detailLevel $0
        illegalBits $8000
        xLast $0
        yLast $0
        xStep $3
        moveSpeed $6
        blocks $0
        baseSetter $0
        mover $0
        looper $0
        viewer $0
        avoider $0
        code $0
        edgeHit $0
        _head $0
        normal $1
        moveHead $1
        beard $0
        abnormal $1
    )
    (method (dispose) // method_011f
  011f:63 70             pToa _head 
  0121:30 0005            bnt code_0129 
  0124:39 6c            pushi 6c // $6c dispose
  0126:76               push0 
  0127:4a 04             send 4 


        code_0129
  0129:63 76             pToa beard 
  012b:30 0005            bnt code_0133 
  012e:39 6c            pushi 6c // $6c dispose
  0130:76               push0 
  0131:4a 04             send 4 


        code_0133
  0133:39 6c            pushi 6c // $6c dispose
  0135:76               push0 
  0136:57 32 04         super Ego 4 

  0139:48                 ret 
    )

    (method (setPri) // method_009b
  009b:8f 00              lsp paramTotal 
  009d:35 00              ldi 0 
  009f:1a                 eq? 
  00a0:30 0011            bnt code_00b4 
  00a3:67 38             pTos signal 
  00a5:35 10              ldi 10 
  00a7:14                  or 
  00a8:65 38             aTop signal 
  00aa:39 42            pushi 42 // $42 setPri
  00ac:76               push0 
  00ad:63 70             pToa _head 
  00af:4a 04             send 4 

  00b1:32 002f            jmp code_00e3 

        code_00b4
  00b4:8f 01              lsp param1 
  00b6:35 ff              ldi ff 
  00b8:1a                 eq? 
  00b9:30 0013            bnt code_00cf 
  00bc:67 38             pTos signal 
  00be:35 ef              ldi ef 
  00c0:12                 and 
  00c1:65 38             aTop signal 
  00c3:39 42            pushi 42 // $42 setPri
  00c5:78               push1 
  00c6:39 ff            pushi ff // $ff syncNum
  00c8:63 70             pToa _head 
  00ca:4a 06             send 6 

  00cc:32 0014            jmp code_00e3 

        code_00cf
  00cf:87 01              lap param1 
  00d1:65 34             aTop priority 
  00d3:67 38             pTos signal 
  00d5:35 10              ldi 10 
  00d7:14                  or 
  00d8:65 38             aTop signal 
  00da:39 42            pushi 42 // $42 setPri
  00dc:78               push1 
  00dd:8f 01              lsp param1 
  00df:63 70             pToa _head 
  00e1:4a 06             send 6 


        code_00e3
  00e3:48                 ret 
    )

    (method (setLoop) // method_001e
  001e:3f 01             link 1 // (var $1)
  0020:8f 00              lsp paramTotal 
  0022:35 00              ldi 0 
  0024:1a                 eq? 
  0025:30 000d            bnt code_0035 
  0028:67 38             pTos signal 
  002a:34 0800            ldi 800 
  002d:14                  or 
  002e:65 38             aTop signal 
  0030:35 00              ldi 0 
  0032:32 004a            jmp code_007f 

        code_0035
  0035:8f 01              lsp param1 
  0037:35 ff              ldi ff 
  0039:1a                 eq? 
  003a:30 000d            bnt code_004a 
  003d:67 38             pTos signal 
  003f:34 f7ff            ldi f7ff 
  0042:12                 and 
  0043:65 38             aTop signal 
  0045:35 00              ldi 0 
  0047:32 0035            jmp code_007f 

        code_004a
  004a:78               push1 
  004b:8f 01              lsp param1 
  004d:43 06 02         callk IsObject 2 

  0050:18                 not 
  0051:30 0011            bnt code_0065 
  0054:87 01              lap param1 
  0056:65 30             aTop loop 
  0058:67 38             pTos signal 
  005a:34 0800            ldi 800 
  005d:14                  or 
  005e:65 38             aTop signal 
  0060:35 00              ldi 0 
  0062:32 001a            jmp code_007f 

        code_0065
  0065:7a               push2 
  0066:76               push0 
  0067:87 01              lap param1 
  0069:4a 04             send 4 

  006b:36                push 
  006c:34 8000            ldi 8000 
  006f:12                 and 
  0070:30 000a            bnt code_007d 
  0073:39 6a            pushi 6a // $6a new
  0075:76               push0 
  0076:87 01              lap param1 
  0078:4a 04             send 4 

  007a:32 0002            jmp code_007f 

        code_007d
  007d:87 01              lap param1 

        code_007f
  007f:a5 00              sat temp0 
  0081:30 0016            bnt code_009a 
  0084:63 66             pToa looper 
  0086:30 0005            bnt code_008e 
  0089:39 6c            pushi 6c // $6c dispose
  008b:76               push0 
  008c:4a 04             send 4 


        code_008e
  008e:39 6b            pushi 6b // $6b init
  0090:78               push1 
  0091:7c            pushSelf 
  0092:59 02            &rest 2 
  0094:85 00              lat temp0 
  0096:65 66             aTop looper 
  0098:4a 06             send 6 


        code_009a
  009a:48                 ret 
    )

    (method (setCel) // method_0004
  0004:8f 01              lsp param1 
  0006:38 00dd          pushi dd // $dd lastCel
  0009:76               push0 
  000a:54 04             self 4 

  000c:20                 ge? 
  000d:30 0009            bnt code_0019 
  0010:38 00dd          pushi dd // $dd lastCel
  0013:76               push0 
  0014:54 04             self 4 

  0016:32 0002            jmp code_001b 

        code_0019
  0019:87 01              lap param1 

        code_001b
  001b:65 32             aTop cel 
  001d:48                 ret 
    )

    (method (hide) // method_0104
  0104:63 70             pToa _head 
  0106:30 0005            bnt code_010e 
  0109:39 69            pushi 69 // $69 hide
  010b:76               push0 
  010c:4a 04             send 4 


        code_010e
  010e:63 76             pToa beard 
  0110:30 0005            bnt code_0118 
  0113:39 69            pushi 69 // $69 hide
  0115:76               push0 
  0116:4a 04             send 4 


        code_0118
  0118:39 69            pushi 69 // $69 hide
  011a:76               push0 
  011b:57 32 04         super Ego 4 

  011e:48                 ret 
    )

    (method (headView) // method_00e4
  00e4:39 05            pushi 5 // $5 view
  00e6:78               push1 
  00e7:8f 01              lsp param1 
  00e9:63 70             pToa _head 
  00eb:4a 06             send 6 

  00ed:39 11            pushi 11 // $11 signal
  00ef:76               push0 
  00f0:63 70             pToa _head 
  00f2:4a 04             send 4 

  00f4:36                push 
  00f5:35 08              ldi 8 
  00f7:12                 and 
  00f8:18                 not 
  00f9:30 0007            bnt code_0103 
  00fc:39 6e            pushi 6e // $6e showSelf
  00fe:76               push0 
  00ff:63 70             pToa _head 
  0101:4a 04             send 4 


        code_0103
  0103:48                 ret 
    )

    (method (egoSpeed) // method_013a
  013a:87 00              lap paramTotal 
  013c:30 0010            bnt code_014f 
  013f:38 00db          pushi db // $db cycleSpeed
  0142:78               push1 
  0143:8f 01              lsp param1 
  0145:39 38            pushi 38 // $38 moveSpeed
  0147:78               push1 
  0148:8f 01              lsp param1 
  014a:54 0c             self c 

  014c:32 000d            jmp code_015c 

        code_014f
  014f:38 00db          pushi db // $db cycleSpeed
  0152:78               push1 
  0153:89 8d              lsg  
  0155:39 38            pushi 38 // $38 moveSpeed
  0157:78               push1 
  0158:89 8d              lsg  
  015a:54 0c             self c 


        code_015c
  015c:48                 ret 
    )

    (method (userSpeed) // method_015d
  015d:38 00db          pushi db // $db cycleSpeed
  0160:78               push1 
  0161:38 0178          pushi 178 // $178 egoMoveSpeed
  0164:76               push0 
  0165:81 01              lag  
  0167:4a 04             send 4 

  0169:36                push 
  016a:39 38            pushi 38 // $38 moveSpeed
  016c:78               push1 
  016d:38 0178          pushi 178 // $178 egoMoveSpeed
  0170:76               push0 
  0171:81 01              lag  
  0173:4a 04             send 4 

  0175:36                push 
  0176:54 0c             self c 

  0178:48                 ret 
  0179:00                bnot 
    )

)

// 04f4
(class Head of Prop
    (properties
        x $0
        y $0
        z $0
        heading $0
        noun $0
        nsTop $0
        nsLeft $0
        nsBottom $0
        nsRight $0
        description $0
        sightAngle $6789
        actions $0
        onMeCheck $6789
        approachX $0
        approachY $0
        approachDist $0
        _approachVerbs $6789
        lookStr $0
        yStep $2
        view $0
        loop $0
        cel $0
        priority $0
        underBits $0
        signal $0
        lsTop $0
        lsLeft $0
        lsBottom $0
        lsRight $0
        brTop $0
        brLeft $0
        brBottom $0
        brRight $0
        palette $0
        cycleSpeed $b4
        script $0
        cycler $0
        timer $0
        detailLevel $0
        client $0
        _cnt $0
    )
    (method (init) // method_02a2
  02a2:39 2d            pushi 2d // $2d client
  02a4:78               push1 
  02a5:8f 01              lsp param1 
  02a7:38 0121          pushi 121 // $121 ignoreActors
  02aa:78               push1 
  02ab:78               push1 
  02ac:54 0c             self c 

  02ae:38 0203          pushi 203 // $203 _head
  02b1:78               push1 
  02b2:7c            pushSelf 
  02b3:87 01              lap param1 
  02b5:4a 06             send 6 

  02b7:39 6b            pushi 6b // $6b init
  02b9:76               push0 
  02ba:57 2f 04         super Prop 4 

  02bd:39 69            pushi 69 // $69 hide
  02bf:76               push0 
  02c0:54 04             self 4 

  02c2:48                 ret 
    )

    (method (doit) // method_02fd
  02fd:38 019c          pushi 19c // $19c normal
  0300:76               push0 
  0301:63 56             pToa client 
  0303:4a 04             send 4 

  0305:30 00a1            bnt code_03a9 
  0308:39 11            pushi 11 // $11 signal
  030a:76               push0 
  030b:63 56             pToa client 
  030d:4a 04             send 4 

  030f:36                push 
  0310:35 08              ldi 8 
  0312:12                 and 
  0313:18                 not 
  0314:30 0092            bnt code_03a9 
  0317:38 00de          pushi de // $de isStopped
  031a:76               push0 
  031b:63 56             pToa client 
  031d:4a 04             send 4 

  031f:30 0087            bnt code_03a9 
  0322:78               push1 
  0323:38 00dc          pushi dc // $dc cycler
  0326:76               push0 
  0327:63 56             pToa client 
  0329:4a 04             send 4 

  032b:36                push 
  032c:43 06 02         callk IsObject 2 

  032f:30 0077            bnt code_03a9 
  0332:39 6f            pushi 6f // $6f isKindOf
  0334:78               push1 
  0335:51 56            class StopWalk 
  0337:36                push 
  0338:38 00dc          pushi dc // $dc cycler
  033b:76               push0 
  033c:63 56             pToa client 
  033e:4a 04             send 4 

  0340:4a 06             send 6 

  0342:2e 0010             bt code_0355 
  0345:39 6f            pushi 6f // $6f isKindOf
  0347:78               push1 
  0348:51 70            class SyncStop 
  034a:36                push 
  034b:38 00dc          pushi dc // $dc cycler
  034e:76               push0 
  034f:63 56             pToa client 
  0351:4a 04             send 4 

  0353:4a 06             send 6 


        code_0355
  0355:30 0051            bnt code_03a9 
  0358:39 05            pushi 5 // $5 view
  035a:76               push0 
  035b:63 56             pToa client 
  035d:4a 04             send 4 

  035f:36                push 
  0360:38 01bb          pushi 1bb // $1bb vStopped
  0363:76               push0 
  0364:38 00dc          pushi dc // $dc cycler
  0367:76               push0 
  0368:63 56             pToa client 
  036a:4a 04             send 4 

  036c:4a 04             send 4 

  036e:1a                 eq? 
  036f:30 0037            bnt code_03a9 
  0372:67 38             pTos signal 
  0374:35 04              ldi 4 
  0376:12                 and 
  0377:30 0021            bnt code_039b 
  037a:67 38             pTos signal 
  037c:35 02              ldi 2 
  037e:12                 and 
  037f:18                 not 
  0380:30 0018            bnt code_039b 
  0383:39 11            pushi 11 // $11 signal
  0385:76               push0 
  0386:63 56             pToa client 
  0388:4a 04             send 4 

  038a:36                push 
  038b:35 04              ldi 4 
  038d:12                 and 
  038e:30 0004            bnt code_0395 
  0391:48                 ret 
  0392:32 0006            jmp code_039b 

        code_0395
  0395:38 011f          pushi 11f // $11f startUpd
  0398:76               push0 
  0399:54 04             self 4 


        code_039b
  039b:39 6e            pushi 6e // $6e showSelf
  039d:76               push0 
  039e:54 04             self 4 

  03a0:38 020b          pushi 20b // $20b lookAround
  03a3:76               push0 
  03a4:54 04             self 4 

  03a6:32 000e            jmp code_03b7 

        code_03a9
  03a9:67 38             pTos signal 
  03ab:35 08              ldi 8 
  03ad:12                 and 
  03ae:18                 not 
  03af:30 0005            bnt code_03b7 
  03b2:39 69            pushi 69 // $69 hide
  03b4:76               push0 
  03b5:54 04             self 4 


        code_03b7
  03b7:39 3c            pushi 3c // $3c doit
  03b9:76               push0 
  03ba:57 2f 04         super Prop 4 

  03bd:48                 ret 
    )

    (method (showSelf) // method_03be
  03be:3f 01             link 1 // (var $1)
  03c0:67 38             pTos signal 
  03c2:35 08              ldi 8 
  03c4:12                 and 
  03c5:30 0015            bnt code_03dd 
  03c8:39 06            pushi 6 // $6 loop
  03ca:76               push0 
  03cb:63 56             pToa client 
  03cd:4a 04             send 4 

  03cf:93 00             lali local0 
  03d1:65 32             aTop cel 
  03d3:63 4c             pToa cycleSpeed 
  03d5:65 58             aTop _cnt 
  03d7:38 00c2          pushi c2 // $c2 show
  03da:76               push0 
  03db:54 04             self 4 


        code_03dd
  03dd:39 04            pushi 4 // $4 x
  03df:78               push1 
  03e0:39 04            pushi 4 // $4 x
  03e2:76               push0 
  03e3:63 56             pToa client 
  03e5:4a 04             send 4 

  03e7:36                push 
  03e8:39 03            pushi 3 // $3 y
  03ea:78               push1 
  03eb:39 03            pushi 3 // $3 y
  03ed:76               push0 
  03ee:63 56             pToa client 
  03f0:4a 04             send 4 

  03f2:36                push 
  03f3:54 0c             self c 

  03f5:48                 ret 
    )

    (method (doVerb) // method_02c3
  02c3:63 56             pToa client 
  02c5:30 0022            bnt code_02ea 
  02c8:78               push1 
  02c9:38 010b          pushi 10b // $10b actions
  02cc:76               push0 
  02cd:4a 04             send 4 

  02cf:36                push 
  02d0:43 06 02         callk IsObject 2 

  02d3:30 0014            bnt code_02ea 
  02d6:38 010c          pushi 10c // $10c doVerb
  02d9:7a               push2 
  02da:8f 01              lsp param1 
  02dc:8f 02              lsp param2 
  02de:59 03            &rest 3 
  02e0:38 010b          pushi 10b // $10b actions
  02e3:76               push0 
  02e4:63 56             pToa client 
  02e6:4a 04             send 4 

  02e8:4a 08             send 8 


        code_02ea
  02ea:18                 not 
  02eb:30 000e            bnt code_02fc 
  02ee:38 010c          pushi 10c // $10c doVerb
  02f1:7a               push2 
  02f2:8f 01              lsp param1 
  02f4:8f 02              lsp param2 
  02f6:59 03            &rest 3 
  02f8:63 56             pToa client 
  02fa:4a 08             send 8 


        code_02fc
  02fc:48                 ret 
    )

    (method (lookAround) // method_04a4
  04a4:3f 01             link 1 // (var $1)
  04a6:38 0204          pushi 204 // $204 moveHead
  04a9:76               push0 
  04aa:63 56             pToa client 
  04ac:4a 04             send 4 

  04ae:30 003b            bnt code_04ec 
  04b1:6d 58            dpToa _cnt 
  04b3:36                push 
  04b4:35 01              ldi 1 
  04b6:22                 lt? 
  04b7:30 0032            bnt code_04ec 
  04ba:63 4c             pToa cycleSpeed 
  04bc:65 58             aTop _cnt 
  04be:39 06            pushi 6 // $6 loop
  04c0:76               push0 
  04c1:63 56             pToa client 
  04c3:4a 04             send 4 

  04c5:9b 00             lsli local0 
  04c7:7a               push2 
  04c8:76               push0 
  04c9:7a               push2 
  04ca:43 3c 04         callk Random 4 

  04cd:36                push 
  04ce:35 01              ldi 1 
  04d0:04                 sub 
  04d1:02                 add 
  04d2:65 32             aTop cel 
  04d4:67 32             pTos cel 
  04d6:35 07              ldi 7 
  04d8:1e                 gt? 
  04d9:30 0004            bnt code_04e0 
  04dc:35 00              ldi 0 
  04de:65 32             aTop cel 

        code_04e0
  04e0:67 32             pTos cel 
  04e2:35 00              ldi 0 
  04e4:22                 lt? 
  04e5:30 0004            bnt code_04ec 
  04e8:35 07              ldi 7 
  04ea:65 32             aTop cel 

        code_04ec
  04ec:48                 ret 
  04ed:00                bnot 
    )

    (method (normalize) // method_03f6
  03f6:39 05            pushi 5 // $5 view
  03f8:78               push1 
  03f9:39 08            pushi 8 // $8 underBits
  03fb:39 05            pushi 5 // $5 view
  03fd:76               push0 
  03fe:81 00              lag  
  0400:4a 04             send 4 

  0402:36                push 
  0403:78               push1 
  0404:39 0d            pushi d // $d lsTop
  0406:39 1e            pushi 1e // $1e mode
  0408:39 22            pushi 22 // $22 type
  040a:39 18            pushi 18 // $18 key
  040c:39 11            pushi 11 // $11 signal
  040e:38 02bf          pushi 2bf // $2bf sel_703
  0411:46 03e7 0005 10  calle 3e7 procedure_0005 10 //  

  0417:30 000a            bnt code_0424 
  041a:39 05            pushi 5 // $5 view
  041c:76               push0 
  041d:81 00              lag  
  041f:4a 04             send 4 

  0421:32 000b            jmp code_042f 

        code_0424
  0424:39 05            pushi 5 // $5 view
  0426:76               push0 
  0427:81 00              lag  
  0429:4a 04             send 4 

  042b:36                push 
  042c:35 01              ldi 1 
  042e:02                 add 

        code_042f
  042f:36                push 
  0430:39 06            pushi 6 // $6 loop
  0432:78               push1 
  0433:89 7e              lsg  
  0435:35 02              ldi 2 
  0437:1a                 eq? 
  0438:30 0005            bnt code_0440 
  043b:35 09              ldi 9 
  043d:32 0016            jmp code_0456 

        code_0440
  0440:39 05            pushi 5 // $5 view
  0442:76               push0 
  0443:81 00              lag  
  0445:4a 04             send 4 

  0447:36                push 
  0448:34 02be            ldi 2be 
  044b:1a                 eq? 
  044c:30 0005            bnt code_0454 
  044f:35 04              ldi 4 
  0451:32 0002            jmp code_0456 

        code_0454
  0454:35 08              ldi 8 

        code_0456
  0456:36                push 
  0457:39 07            pushi 7 // $7 cel
  0459:78               push1 
  045a:39 06            pushi 6 // $6 loop
  045c:76               push0 
  045d:63 56             pToa client 
  045f:4a 04             send 4 

  0461:9b 00             lsli local0 
  0463:39 55            pushi 55 // $55 z
  0465:78               push1 
  0466:89 7e              lsg  
  0468:3c                 dup 
  0469:35 05              ldi 5 
  046b:1a                 eq? 
  046c:30 0005            bnt code_0474 
  046f:35 26              ldi 26 
  0471:32 001a            jmp code_048e 

        code_0474
  0474:3c                 dup 
  0475:35 02              ldi 2 
  0477:1a                 eq? 
  0478:30 0005            bnt code_0480 
  047b:35 27              ldi 27 
  047d:32 000e            jmp code_048e 

        code_0480
  0480:3c                 dup 
  0481:35 03              ldi 3 
  0483:1a                 eq? 
  0484:30 0005            bnt code_048c 
  0487:35 27              ldi 27 
  0489:32 0002            jmp code_048e 

        code_048c
  048c:35 28              ldi 28 

        code_048e
  048e:3a                toss 
  048f:36                push 
  0490:54 18             self 18 

  0492:39 77            pushi 77 // $77 contains
  0494:78               push1 
  0495:89 00              lsg  
  0497:81 05              lag  
  0499:4a 06             send 6 

  049b:30 0005            bnt code_04a3 
  049e:39 3c            pushi 3c // $3c doit
  04a0:76               push0 
  04a1:54 04             self 4 


        code_04a3
  04a3:48                 ret 
    )

)

// 05e2
(class SpecialDoVerb of Code
    (properties
    )
    (method (doVerb) // method_05ce
  05ce:38 010c          pushi 10c // $10c doVerb
  05d1:78               push1 
  05d2:8f 01              lsp param1 
  05d4:59 04            &rest 4 
  05d6:87 03              lap param3 
  05d8:4a 06             send 6 

  05da:48                 ret 
  05db:00                bnot 
    )

)

// 06f6
(class Beard of Prop
    (properties
        x $0
        y $0
        z $0
        heading $0
        noun $0
        nsTop $0
        nsLeft $0
        nsBottom $0
        nsRight $0
        description $0
        sightAngle $6789
        actions $0
        onMeCheck $6789
        approachX $0
        approachY $0
        approachDist $0
        _approachVerbs $6789
        lookStr $0
        yStep $2
        view $0
        loop $0
        cel $0
        priority $0
        underBits $0
        signal $0
        lsTop $0
        lsLeft $0
        lsBottom $0
        lsRight $0
        brTop $0
        brLeft $0
        brBottom $0
        brRight $0
        palette $0
        cycleSpeed $6
        script $0
        cycler $0
        timer $0
        detailLevel $0
        client $0
    )
    (method (init) // method_0604
  0604:39 2d            pushi 2d // $2d client
  0606:78               push1 
  0607:8f 01              lsp param1 
  0609:38 0121          pushi 121 // $121 ignoreActors
  060c:78               push1 
  060d:78               push1 
  060e:54 0c             self c 

  0610:38 0205          pushi 205 // $205 beard
  0613:78               push1 
  0614:7c            pushSelf 
  0615:87 01              lap param1 
  0617:4a 06             send 6 

  0619:39 6b            pushi 6b // $6b init
  061b:76               push0 
  061c:57 2f 04         super Prop 4 

  061f:39 69            pushi 69 // $69 hide
  0621:76               push0 
  0622:54 04             self 4 

  0624:48                 ret 
    )

    (method (doit) // method_0625
  0625:38 0206          pushi 206 // $206 abnormal
  0628:76               push0 
  0629:63 56             pToa client 
  062b:4a 04             send 4 

  062d:30 0074            bnt code_06a4 
  0630:39 11            pushi 11 // $11 signal
  0632:76               push0 
  0633:63 56             pToa client 
  0635:4a 04             send 4 

  0637:36                push 
  0638:35 08              ldi 8 
  063a:12                 and 
  063b:18                 not 
  063c:30 0065            bnt code_06a4 
  063f:38 00de          pushi de // $de isStopped
  0642:76               push0 
  0643:63 56             pToa client 
  0645:4a 04             send 4 

  0647:18                 not 
  0648:30 0059            bnt code_06a4 
  064b:78               push1 
  064c:38 00dc          pushi dc // $dc cycler
  064f:76               push0 
  0650:63 56             pToa client 
  0652:4a 04             send 4 

  0654:36                push 
  0655:43 06 02         callk IsObject 2 

  0658:30 0049            bnt code_06a4 
  065b:39 6f            pushi 6f // $6f isKindOf
  065d:78               push1 
  065e:51 56            class StopWalk 
  0660:36                push 
  0661:38 00dc          pushi dc // $dc cycler
  0664:76               push0 
  0665:63 56             pToa client 
  0667:4a 04             send 4 

  0669:4a 06             send 6 

  066b:2e 0010             bt code_067e 
  066e:39 6f            pushi 6f // $6f isKindOf
  0670:78               push1 
  0671:51 70            class SyncStop 
  0673:36                push 
  0674:38 00dc          pushi dc // $dc cycler
  0677:76               push0 
  0678:63 56             pToa client 
  067a:4a 04             send 4 

  067c:4a 06             send 6 


        code_067e
  067e:30 0023            bnt code_06a4 
  0681:39 05            pushi 5 // $5 view
  0683:76               push0 
  0684:63 56             pToa client 
  0686:4a 04             send 4 

  0688:36                push 
  0689:38 01bb          pushi 1bb // $1bb vStopped
  068c:76               push0 
  068d:38 00dc          pushi dc // $dc cycler
  0690:76               push0 
  0691:63 56             pToa client 
  0693:4a 04             send 4 

  0695:4a 04             send 4 

  0697:1a                 eq? 
  0698:18                 not 
  0699:30 0008            bnt code_06a4 
  069c:39 6e            pushi 6e // $6e showSelf
  069e:76               push0 
  069f:54 04             self 4 

  06a1:32 000e            jmp code_06b2 

        code_06a4
  06a4:67 38             pTos signal 
  06a6:35 08              ldi 8 
  06a8:12                 and 
  06a9:18                 not 
  06aa:30 0005            bnt code_06b2 
  06ad:39 69            pushi 69 // $69 hide
  06af:76               push0 
  06b0:54 04             self 4 


        code_06b2
  06b2:39 3c            pushi 3c // $3c doit
  06b4:76               push0 
  06b5:59 01            &rest 1 
  06b7:57 2f 04         super Prop 4 

  06ba:48                 ret 
    )

    (method (showSelf) // method_06bb
  06bb:38 00c2          pushi c2 // $c2 show
  06be:76               push0 
  06bf:54 04             self 4 

  06c1:39 06            pushi 6 // $6 loop
  06c3:78               push1 
  06c4:39 06            pushi 6 // $6 loop
  06c6:76               push0 
  06c7:63 56             pToa client 
  06c9:4a 04             send 4 

  06cb:36                push 
  06cc:39 07            pushi 7 // $7 cel
  06ce:78               push1 
  06cf:39 07            pushi 7 // $7 cel
  06d1:76               push0 
  06d2:63 56             pToa client 
  06d4:4a 04             send 4 

  06d6:36                push 
  06d7:39 04            pushi 4 // $4 x
  06d9:78               push1 
  06da:39 04            pushi 4 // $4 x
  06dc:76               push0 
  06dd:63 56             pToa client 
  06df:4a 04             send 4 

  06e1:36                push 
  06e2:39 03            pushi 3 // $3 y
  06e4:78               push1 
  06e5:39 03            pushi 3 // $3 y
  06e7:76               push0 
  06e8:63 56             pToa client 
  06ea:4a 04             send 4 

  06ec:36                push 
  06ed:54 18             self 18 

  06ef:48                 ret 
    )

)



