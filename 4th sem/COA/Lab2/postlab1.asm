; Post lab - Q1 - Analyze & find out the value of registers

MOV AX, 4246H
MOV BX, 123FH

AND AX, BX      ; 0206
ADD AX, BX      ; 1445
ROR AX, 02H     ; 4511

INC BX          ; 1240
INC BX          ; 1241
MOV [1006H], BX ; 1241

MOV [BX], AX    ; [1241] -> 4511

HLT
                                                               