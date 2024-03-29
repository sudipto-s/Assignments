; NAME: 
; REDG: 

; Obj 1ii - Largest number in an array
MOV SI, 2000H
MOV CL, [SI]
INC SI
MOV AL, [SI]
DEC CL
JZ L3

L1:
    INC SI
    CMP AL, [SI]
    JNC L2
    MOV AL, [SI]
    
L2:
    DEC CL
    JNZ L1
    
L3:
    MOV [3000H], AL
    

HLT
