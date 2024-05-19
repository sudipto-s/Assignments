@ NAME: 
@ REDG: 
@ Obj 2 - Even numbers fom an array

.global _start
_start:
	LDR R0, =count
	LDR R1,  [R0]
	LDR R3, =array
	LDR R4, =even
	LDR R5, =odd
back:
	LDR R6, [R3], #4
	ANDS R7, R6, #1
	BEQ fwd
	STR R6, [R5], #4
	B fwd1
fwd:
	STR R6, [R4], #4
fwd1:
	SUBS R1, R1, #1
	BNE back
B .
.data
	count: .word 0x06
	array: .word 0x22, 0xd5, 0x11, 0x4a, 0x19, 0x55
	even: .word 0, 0, 0, 0
	odd: .word 0, 0, 0, 0
	