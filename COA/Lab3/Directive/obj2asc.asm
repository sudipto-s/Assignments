; NAME: 
; REDG: 

; Obj 2i - Sorting an array in ascending order
.DATA
    SIZE DB 05H
    ARR DB 09H, 8DH, 10H, 0FH, 23H
.CODE
MAIN PROC
    MOV AX, DATA
    MOV DS, AX
    
    MOV CH, SIZE
    DEC CH
UP2:
    MOV CL, CH
    LEA SI, ARR
UP1:
    MOV AL, [SI]
    CMP AL, [SI+1]
    JC DOWN
    MOV DL, [SI+1]
    XCHG [SI], DL
    MOV [SI+1], DL
DOWN:
    INC SI
    DEC CL
    JNZ UP1
    DEC CH
    JNZ UP2
END MAIN
        