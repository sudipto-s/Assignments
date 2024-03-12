;mov ax, 5000
;mov ds, ax

; Q2 - 8 bit 1's compliment
mov al, 34h
not al
inc al
mov [5000h], al

hlt
