; NAME: 
; REDG: 

; Obj 2i - Arrange elements (8-bit) in ascending order
MOV SI, 2000H
MOV DI, SI          ; Save the starting address of the array in DI
MOV CL, [SI]        ; Load the size of the array (n) into CL
INC SI              ; Point SI to the first element of the array

L1:
    MOV CH, CL       ; Copy the size of the array (n - 1) into CH for iteration
    DEC CH           ; Decrement CH to avoid the last comparison
    JZ L4            ; Terminate if CH becomes zero

L2:
    MOV AL, [SI]     ; Load the current value at memory address SI into AL
    INC SI           ; Move to the next element in the array
    CMP AL, [SI]     ; Compare AL with the next value in the array
    JC L3            ; Jump to L3 if AL > [SI] (no need to swap)

    XCHG AL, [SI]    ; Swap AL and [SI]
    DEC SI           ; Move back to the current position in the array
    XCHG AL, [SI]    ; Swap AL and [SI] back
    INC SI           ; Move to the next position in the array

L3:
    DEC CH           ; Decrement CH (to iterate through the remaining elements in the array)
    JNZ L2           ; Repeat L2 until CH becomes zero

    MOV SI, DI       ; Restore the starting address of the array for the next pass
    INC SI           ; Point SI to the first element of the array
    DEC CL           ; Decrement CL (to handle the next outer loop iteration)
    JNZ L1           ; Repeat L1 until CL becomes zero

L4:
    HLT
