@ Obj 3 - AND, OR, XOR & NOT of 32-bit numbers

.data
    num1:   .word 9       @ First 32-bit number
    num2:   .word 5       @ Second 32-bit number
	res_and:	.word 0   @ Variable to store AND
	res_or:		.word 0   @ Variable to store OR
	res_xor:	.word 0   @ Variable to store XOR
	res_not:	.word 0   @ Variable to store NOT
	
	.text
    .global main

main:
    LDR r1, =num1       @ Load the address of num1 into r1
    LDR r2, [r1]        @ Load the value of num1 into r2
    LDR r1, =num2       @ Load the address of num2 into r1
    LDR r3, [r1]        @ Load the value of num2 into r3
	
    ADD r4, r2, r3      @ Add the values of num1 and num2 and store the result in r4
	LDR r1, =res_and
	STR r4, [r1]
	
    ORR r5, r2, r3      @ Subtract the values of num2 from num1 and store the result in r5
	LDR r1, =res_or
	STR r5, [r1]
	
    EOR r6, r2, r3      @ XOR the values of num1 and num2 and store the result in r6
	LDR r1, =res_xor
	STR r6, [r1]
	
    MVN r7, r2	        @ NOT the value of num1 and store the result in r7
	LDR r1, =res_not
	STR r7, [r1]
	
    B .					@ End of program
