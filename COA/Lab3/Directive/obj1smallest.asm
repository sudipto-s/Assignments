; NAME: 
; REDG: 

; Obj 1i - Finding smallest number in an array
.DATA
    SIZE DB 04H
    ARR DB 09H, 10H, 0FH, 23H
    RESULT DB 0
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
            JL FWD
            MOV AL, [SI]
        FWD:
            DEC CL
            JNZ UP
            LEA DI, RESULT
            MOV [DI], AL
    END MAIN
        