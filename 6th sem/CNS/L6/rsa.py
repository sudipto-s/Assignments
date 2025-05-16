import math
import random

def keyGeneration():
  p=int(input('Enter 1st large prime p:'))                  # input the prime p
  q=int(input('Enter 2nd large prime q:'))                  # input the prime q
  n=p*q                                                     # compute n
  phi_n=(p-1)*(q-1)                                         # compute phi_n
  e=int(input('Randomly choose e between 1 and phi_n:'))
  while(math.gcd(e,phi_n)!=1 and (1<e and e<phi_n)):        # This loop randomly choose e between 1 and phi_n until it is coprime to phi_n
    e=int(input('Randomly choose e between 1 and phi_n:'))

  k=random.randint(1,1000)
  while((k*phi_n+1)%e != 0):                                # This loop randomly select constant k until e properly divides k*phi_n+1
    k=random.randint(1,1000)
  d=int((k*phi_n+1)/e)                                      # Compute d

  return e,n,d

def encrypt(P,e,n):                                         # Encryption
  C=pow(P,e)%n
  return C

def decrypt(C,d,n):                                         # Decryption
  P=pow(C,d)%n
  return P

e=n=d=0
e,n,d = keyGeneration()                                     # Generates the key exponents (e,n) and d
print('e=',e,'n=',n,'d=',d)

P=int(input('Enter plaintext (integer):'))                            # Input plaintext as an integer
C=encrypt(P,e,n)                                            # Calls encrypt() method
print('Cipertext=',C)
P1=decrypt(C,d,n)                                           # Calls decrypt() method
print('Decrypted plaintext=',P1)

PP=input('Enter plaintext:')
PP=PP.lower().replace(" ","")               # convert the plaintext to lowercase and remove space
print('Plaintext is:',PP)
CC=""
CC_list=[]
for i in range(len(PP)):                    # iterate over the plaintext
  ch=ord(PP[i])-ord('a')                    # finds character position
  tmp=encrypt(ch,e,n)                       # encrypt
  CC_list.append(tmp)                       # append encrypted value to a list
for i in CC_list:                           # This loop takes value from list, convers to string and concatenate wit the ciphertext string
  CC+=str(i)
print('Cipertext=',CC)

PP1=""
for i in CC_list:
  ch=decrypt(i,d,n)                         # decrypt the encrypted value from the list
  ch=chr(97+ch)                             # covert to character
  PP1+=str(ch)                              # concatenate to plaitext string

print('Decrypted plaintext=',PP1)