; NAME: 
; REDG: 

; Obj 1ii - Finding largest number in an array
.DATA
    ARR DB 09H, 10H, 0FH, 23H
    SIZE DB EQN 04H
    RESULT DB 00H
.CODE
    MAIN PROC
        MOV AX, DATA
        MOV DS, AX
        
        MOV CL, SIZE
        DEC CL
        LEA SI, ARR
        MOV AL, [SI]
        UP:
            INC SI
            CMP AL, [SI]
            JNL FWD
            MOV AL, [SI]
        FWD:
            DEC CL
            JNZ UP
            LEA DI, RESULT
            MOV [DI], AL
    END MAIN
        