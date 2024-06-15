; Post lab - Q2 - Divide two 16-bit numbers without DIV instruction in direct addressing mode

MOV AX, [1000H]  ; 0064H
MOV BX, [1002H]  ; 04H
XOR CX, CX

L1:
    CMP AX, BX
    JB L2
    SUB AX, BX
    INC CX
    JMP L1
    
L2:
    MOV [2000H], CX
    MOV [2002H], AX

HLT
