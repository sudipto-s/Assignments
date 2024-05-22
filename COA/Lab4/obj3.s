.global _start
_start:
	LDR R0, =0X10100000
	LDR R1, [R0], #4
	LDR R2, [R0], #4
	ANDS R3, R1, R2
	STR R3, [R0], #4
	ORR R4, R1, R2
	STR R4, [R0], #4
	EOR R5, R1, R2
	STR R5, [R0], #4
	MVN R6, R1
	STR R6, [R0]
B .
