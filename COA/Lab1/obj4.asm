; NAME: 
; REDG: 

; Obj 4 - 8 bit 2's compliment
mov al, 34h
not al
inc al
mov [5000h], al

hlt
