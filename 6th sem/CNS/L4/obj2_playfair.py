import re

def remove_spaces(text):
   return re.sub(r'\s+', '', text)

def generate_key_table(key):
   key = remove_spaces((key).lower()).replace('j', 'i')
   matrix = []
   seen = set()
   
   for char in key:
      if char not in seen:
         seen.add(char)
         matrix.append(char)
   
   for char in "abcdefghiklmnopqrstuvwxyz":
      if char not in seen:
         seen.add(char)
         matrix.append(char)
   
   return [matrix[i:i+5] for i in range(0, 25, 5)]

def find_position(matrix, letter):
   if letter == 'j':
      letter = 'i'
   for row in range(5):
      for col in range(5):
         if matrix[row][col] == letter:
               return row, col

def prepare_text(text):
   text = remove_spaces((text).lower()).replace('j', 'i')
   new_text = ""
   i = 0
   while i < len(text):
      if i < len(text) - 1 and text[i] == text[i + 1]:
         new_text += text[i] + 'x'
         i += 1
      else:
         new_text += text[i]
         i += 1
   if len(new_text) % 2 != 0:
      new_text += 'x'
   return new_text

def encrypt(text, key_matrix):
   text = prepare_text(text)
   encrypted_text = ""
   
   for i in range(0, len(text), 2):
      row1, col1 = find_position(key_matrix, text[i])
      row2, col2 = find_position(key_matrix, text[i + 1])
      
      if row1 == row2:
         encrypted_text += key_matrix[row1][(col1 + 1) % 5]
         encrypted_text += key_matrix[row2][(col2 + 1) % 5]
      elif col1 == col2:
         encrypted_text += key_matrix[(row1 + 1) % 5][col1]
         encrypted_text += key_matrix[(row2 + 1) % 5][col2]
      else:
         encrypted_text += key_matrix[row1][col2]
         encrypted_text += key_matrix[row2][col1]
   
   return encrypted_text

def decrypt(text, key_matrix):
   decrypted_text = ""
   
   for i in range(0, len(text), 2):
      row1, col1 = find_position(key_matrix, text[i])
      row2, col2 = find_position(key_matrix, text[i + 1])
      
      if row1 == row2:
         decrypted_text += key_matrix[row1][(col1 - 1) % 5]
         decrypted_text += key_matrix[row2][(col2 - 1) % 5]
      elif col1 == col2:
         decrypted_text += key_matrix[(row1 - 1) % 5][col1]
         decrypted_text += key_matrix[(row2 - 1) % 5][col2]
      else:
         decrypted_text += key_matrix[row1][col2]
         decrypted_text += key_matrix[row2][col1]
   
   return clean_decrypted_text(decrypted_text)

def clean_decrypted_text(text):
   cleaned_text = ""
   i = 0
   while i < len(text):
      if i < len(text) - 2 and text[i] == text[i + 2] and text[i + 1] == 'x':
         cleaned_text += text[i]
         i += 2
      else:
         cleaned_text += text[i]
         i += 1
   return cleaned_text.rstrip('x')

if __name__ == "__main__":
   choice = input("Choose Case:\n1. Encrypt\n2. Decrypt\nEnter choice: ")
   
   if choice == "1":
      text = input("Enter the plaintext: ")
      key = input("Enter the keyword: ")
      key_matrix = generate_key_table(key)
      ciphertext = encrypt(text, key_matrix)
      print("Ciphertext:", ciphertext)
   elif choice == "2":
      text = input("Enter the ciphertext: ")
      key = input("Enter the keyword: ")
      key_matrix = generate_key_table(key)
      plain_text = decrypt(text, key_matrix)
      print("Decrypted Text:", plain_text)
   else:
      print("Invalid choice!")