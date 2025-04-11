# pip install pycryptodome

from Crypto.Cipher import DES
import binascii

def encryption(des, P, key):
   while len(P) % 8 != 0:
      P += " "
   P = P.encode()
   C = des.encrypt(P)
   C = binascii.hexlify(C)
   C = C.decode()
   return C

def decryption(des, C, key):
   C = binascii.unhexlify(C)
   P1 = des.decrypt(C)
   P1 = P1.decode().strip()
   return P1

key = input("Enter key(8-byte long): ")
P = input("Enter message: ")

key = key.encode()
des = DES.new(key, DES.MODE_ECB)

C = encryption(des, P, key)
print("Encrypted message: ", C)

P1 = decryption(des, C, key)
print("Plaintext after decryption: ", P1)
