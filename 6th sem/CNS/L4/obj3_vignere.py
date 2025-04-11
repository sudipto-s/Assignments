import re

def generate_key(text, key):
   text = re.sub(r'\s+', '', text)
   key = re.sub(r'\s+', '', key)
   extended_key = ""
   j = 0
   for char in text:
      if char.isalpha():
         extended_key += key[j % len(key)]
         j += 1
   return extended_key

def encrypt(text, key):
   text = text.upper()
   key = key.upper()
   key = generate_key(text, key)
   
   cipher_text = ""
   for i in range(len(text)):
      if text[i].isalpha():
         x = (ord(text[i]) - ord('A') + ord(key[i]) - ord('A')) % 26
         cipher_text += chr(x + ord('A'))
      else:
         cipher_text += text[i]
   return cipher_text

def decrypt(text, key):
   text = text.upper()
   key = key.upper()
   key = generate_key(text, key)
   
   plain_text = ""
   for i in range(len(text)):
      if text[i].isalpha():
         x = (ord(text[i]) - ord('A') - (ord(key[i]) - ord('A')) + 26) % 26
         plain_text += chr(x + ord('A'))
      else:
         plain_text += text[i]
   return plain_text

if __name__ == "__main__":
   choice = input("Choose Case:\n1. Encrypt\n2. Decrypt\nEnter choice: ")
   
   if choice == "1":
      text = input("Enter the plaintext: ")
      key = input("Enter the keyword: ")
      cipher_text = encrypt(text, key)
      print("Ciphertext:", cipher_text)
   elif choice == "2":
      text = input("Enter the ciphertext: ")
      key = input("Enter the keyword: ")
      plain_text = decrypt(text, key)
      print("Decrypted Text:", plain_text)
   else:
      print("Invalid choice!")
