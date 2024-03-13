; NAME: SUDIPTA SINGHA
; REDG: 2241019529

; 8 bit gray code converter
mov al, 34h
mov bl, al 
shr al, 01h
xor al, bl
mov [5000h], al 

hlt
