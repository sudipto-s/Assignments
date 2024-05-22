.global _start
_start:
	MOV R0, #0x40
	MOV R1, #0x50
	ADDS R2, R0, R1
	SUBS R3, R1, R0
B .
	