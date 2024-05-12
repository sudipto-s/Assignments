.data
    num1:   .word 7       @ First 32-bit number
    num2:   .word 4       @ Second 32-bit number

	.text
    .global main

main:
    LDR r1, =num1       @ Load the address of num1 into r1
    LDR r2, [r1]        @ Load the value of num1 into r2
    LDR r1, =num2       @ Load the address of num2 into r1
    LDR r3, [r1]        @ Load the value of num2 into r3
	
    ADD r4, r2, r3      @ Add the values of num1 and num2 and store the result in r4
	
    ORR r5, r2, r3      @ Subtract the values of num2 from num1 and store the result in r5
	
    EOR r6, r2, r3      @ XOR the values of num1 and num2 and store the result in r6
	
    MVN r7, r2	        @ NOT the value of num1 and store the result in r7
	
    B .					@ End of program
