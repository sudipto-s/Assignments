; NAME: 
; REDG: 

; Obj 3 - Move a block of 16-bit data from one location to other 
MOV AX, 4000H
MOV DS, AX

MOV CL, 03H
MOV SI, 3000H
MOV DI, 5000H
L1: MOV BX, [SI]
MOV [DI], BX
INC SI
INC SI
INC DI
INC DI
DEC CL
JNZ L1

HLT
