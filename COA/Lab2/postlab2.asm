MOV AX, 0064H   ; Dividend
MOV CL, 0002H   ; Divisor
SHR AX, CL
MOV [3000H], AX

HLT
