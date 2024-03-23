; NAME: 
; REDG: 
           
; Obj 1i - Smallest number in an array           
MOV SI, 2000H
MOV CL, [SI]
INC SI
MOV AL, [SI]
DEC CL

L1:
    INC SI
    MOV BL, [SI]
    CMP AL, BL
    JC L2
    MOV AL, BL
    
L2:
    DEC CL
    JNZ L1
    
MOV [3000H], AL ; Smallest number


; Obj 1ii - Largest number in an array
MOV SI, 2000H
MOV CL, [SI]
INC SI
MOV AL, [SI]
DEC CH

L3:
    INC SI
    MOV BL, [SI]
    CMP AL, BL
    JNC L4
    MOV AL, BL
    
L4:
    DEC CH
    JNZ L3
    
MOV [3001H], AL ; Largest number
    

HLT
                                                              