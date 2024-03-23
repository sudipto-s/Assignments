; Post lab - Q1 - Analyze & find out the value of registers

MOV AX, 4246H
MOV BX, 123FH

AND AX, BX
MOV [1000H], AX ; 0206

ADD AX, BX
MOV [1002H], AX ; 1445

ROR AX, 02H
MOV [1004H], AX ; 4511

INC BX          ; 1240
INC BX          ; 1241
MOV [1006H], BX ; 1241

MOV [BX], AX    ; [1241] -> 4511

HLT
                                                               