; NAME: 
; REDG: 

; Obj 2 - ii. Y = (data1 and data2 ) or (data1 xor data2)
MOV [1000H], 12H
MOV [1001H], 24H
MOV SI, 1000H
MOV AL, [SI]
MOV CL, AL
INC SI
MOV BL, [SI]
AND AL, BL
XOR CL, BL
OR AL, CL
INC SI
MOV [SI], AL
HLT
