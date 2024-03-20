; NAME: 
; REDG: 

; Obj 2 - Count number of 0's in an 8-bit number
MOV [4000H], 71H
MOV BX, 4000H
MOV AL, [BX]
MOV CL, 00H
MOV CH, 08H
L2: SHR AL, 01H
JC L1
INC CL      
L1: DEC CH     
JNZ L2      
INC BX      
MOV [BX], CL      

HLT                            
                                                                                                                                                                                                                                                                             