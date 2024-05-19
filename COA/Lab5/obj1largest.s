@ NAME: 
@ REDG: 
@ Obj 1 - Largest number in an array

.global _start
_start:
	LDR R0, =count
	LDR R1, [R0]
	MOV R4, #0X00
	LDR R2, =array
back:
	LDR R3, [R2], #4;
	CMP R4, R3
	BGT fwd
	MOV R4, R3
fwd:
	SUBS R1, R1, #01
	BNE back
	STR R4, [R2]
B .
.data
	count: .word 0x05
	array: .word 0x24, 0x0d, 0xd6, 0x45, 0x4a