.data
    num1:   .word 14      @ First 32-bit number
    num2:   .word 2       @ Second 32-bit number
	res_add:	.word 0   @ Variable to store addition
	res_sub:	.word 0   @ Variable to store addition
	res_mul:	.word 0   @ Variable to store addition

	.text
    .global main

main:
    LDR r1, =num1       @ Load the address of num1 into r1
    LDR r2, [r1]        @ Load the value of num1 into r2
    LDR r1, =num2       @ Load the address of num2 into r1
    LDR r3, [r1]        @ Load the value of num2 into r3
	
    ADD r4, r2, r3      @ Add the values of num1 and num2 and store the result in r4
	LDR r1, =res_add
	STR r4, [r1]
	
    SUB r5, r2, r3      @ Subtract the values of num2 from num1 and store the result in r5
	LDR r1, =res_sub
	STR r5, [r1]
	
    MUL r6, r2, r3      @ Multiply the values of num1 and num2 and store the result in r6
	LDR r1, =res_mul
	STR r6, [r1]
	
    B .					@ End of program
