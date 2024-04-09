; 8086 Assembly Program to Calculate Sum and Average of an Array

.DATA
    SIZE DB 05H                     ; Length of the array
    ARR DB 01H, 02H, 03H, 04H, 05H  ; Example array of numbers

    SUM DB 0                        ; Variable to store the sum
    AVG DB 0                        ; Variable to store the average

.CODE
MAIN PROC
    MOV AX, DATA
    MOV DS, AX
                                    ; Load size to CL
    MOV CL, SIZE                    ; Load array
    LEA SI, ARR                     ; Clear AX
    XOR AX, AX
    L1:
        ADD AL, [SI]                ; Add AL & [SI]
        INC SI
        DEC CL
        JNZ L1
    MOV SUM, AL                     ; Load SUM
    MOV BL, SIZE                    ; Load size to BL
    DIV BL                          ; Div AL/BL
    MOV AVG, AL                     ; Load average to AVG
    
END MAIN
