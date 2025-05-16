from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes
from Crypto.Util.Padding import pad, unpad
import base64

def encryption(plain_text, key):
   iv = get_random_bytes(AES.block_size)
   cipher = AES.new(key, AES.MODE_CBC, iv)
   padded_text = pad(plain_text.encode(), AES.block_size)
   encrypted_text = cipher.encrypt(padded_text)
   return base64.b64encode(iv + encrypted_text).decode('utf-8')

def decryption(encrypted_text, key):
   encrypted_data = base64.b64decode(encrypted_text)
   iv = encrypted_data[:AES.block_size]
   cipher_text = encrypted_data[AES.block_size:]
   cipher = AES.new(key, AES.MODE_CBC, iv)
   decrypted_text = unpad(cipher.decrypt(cipher_text), AES.block_size)
   return decrypted_text.decode('utf-8')

if __name__ == "__main__":
   key = get_random_bytes(16)
   plain_text = input("Enter message: ")
   
   encrypted_message = encryption(plain_text, key)
   print("Encrypted:", encrypted_message)
   
   decrypted_message = decryption(encrypted_message, key)
   print("Decrypted:", decrypted_message)