; NAME: 
; REDG: 

; Obj 1 - Sum & average of N 16-bit numbers
MOV AX, 4000H    ; Load the base address of the data segment into AX
MOV DS, AX       ; Set the data segment register to point to the base address

MOV AX, 0000H    ; Initialize AX to hold the sum
MOV BX, 0000H    ; Initialize BX to hold the carry
MOV CX, 03H      ; Initialize CX to the count of numbers (N)
MOV SI, 3000H    ; Load the address of the first number into SI

L2:
    MOV DX, [SI] ; Load the next number into DX
    ADD AX, DX   ; Add the value in DX to the sum in AX
    JC L1        ; Jump to L1 if there is a carry after the addition
    INC SI       ; Move to the next number in memory
    INC SI       ; Increment SI by 2 to move to the next 16-bit number
    DEC CX       ; Decrement CX
    JNZ L2       ; Jump back to L2 if CX is not zero
    JMP L3       ; Jump to L3 after the loop ends

L1:              ; Label L1, indicating the end of the loop and a carry occurred
    INC BX       ; Increment BX to handle the carry
    INC SI       ; Move to the next number in memory
    INC SI       ; Increment SI by 2 to move to the next 16-bit number
    DEC CX       ; Decrement CX
    JNZ L2       ; Jump back to L2 if CX is not zero

L3:              ; Storing sum & carry
    MOV CX, 03H     ; Restore CX with the count of numbers (N)
    MOV [4000H], AX ; Store the sum in memory at address 4000H
    MOV [4002H], BX ; Store the carry count in memory at address 4002H

; Calculating average
MOV DX, 0000H       ; Clear DX
DIV CX              ; Divide AX by CX
MOV [4004H], AX     ; Quotient 
MOV [4006H], DX     ; Remainder

HLT             ; Halt the program
