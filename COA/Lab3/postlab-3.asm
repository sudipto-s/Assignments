; 8086 Assembly Program to Calculate Sum and Average of an Array

.DATA
    SIZE DB 05H                     ; Length of the array
    ARR DB 01H, 02H, 03H, 04H, 05H  ; Example array of 8-bit numbers

    SUM DB 0                        ; Variable to store the sum
    AVG DB 0                        ; Variable to store the average

.CODE
MAIN PROC
    MOV AX, DATA
    MOV DS, AX                      ; Load data into SI - 0710:0000
                                    
    MOV CL, SIZE                    ; Load size into CL
    LEA SI, ARR                     ; Load array - 0701:0001, :0002....
    XOR AX, AX                      ; Clear AX
    L1:
        ADD AL, [SI]                ; Add AL & [SI]
        INC SI
        DEC CL
        JNZ L1
    MOV SUM, AL                     ; Load Al to the variable SUMA
    MOV BL, SIZE                    ; Load size to BL
    DIV BL                          ; AX/BL
    MOV AVG, AL                     ; Load average to AVG
    
END MAIN
