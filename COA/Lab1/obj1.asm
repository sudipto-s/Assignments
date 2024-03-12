; NAME: SUDIPTA SINGHA
; REGD NO: 2241019529
             
; Start of Data Segment             
;mov ax, 5000h           
;mov ds, ax

; 16 bit Addition
mov ax, 0009h ; or 0ffffh
mov cx, ax
mov bx, 0002h
add ax, bx
mov [5000h], ax

; 16 bit Subtraction
mov ax, cx
sub ax, bx
mov [5002h], ax

; 16 bit Multiply
mov dx, 0000h
mov ax, cx

; Multiply ax & bx
mul bx
mov [5004h], ax
mov [5006h], dx

; Divide
mov dx, 0000h
mov ax, cx
mul bx
mov [5008h], ax
mov [500Ah], dx

hlt
