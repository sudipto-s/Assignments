; NAME: 
; REDG: 

; Obj 2 - i. Swapping a nibble of data1
MOV [1000H], 32H
MOV SI, 1000H
MOV AL, [SI]
MOV BL, AL
SHR AL, 04H
SHL BL, 04H
OR AL, BL
INC SI
MOV [SI], AL
HLT
