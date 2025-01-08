#include <stdio.h>
#include <unistd.h>
#include <string.h>

void to_binary(int num, char *binary) {
   int index = 0;
   while (num > 0) {
      binary[index++] = (num % 2) + '0';
      num /= 2;
   }
   binary[index] = '\0';

   for (int i = 0; i < index / 2; i++) {
      char temp = binary[i];
      binary[i] = binary[index - i - 1];
      binary[index - i - 1] = temp;
   }
}

int is_palindrome(char *str) {
   int len = strlen(str);
   for (int i = 0; i < len / 2; i++) {
      if (str[i] != str[len - i - 1]) {
         return 0;
      }
   }
   return 1;
}

int main() {
   char binary[32];
   int num;

   printf("Enter a number: ");
   scanf("%d", &num);

   if (vfork() == 0) {
      to_binary(num, binary);
      printf("Binary representation: %s\n", binary);
      _exit(0);
   } else {
      to_binary(num, binary);
      if (is_palindrome(binary)) {
         printf("The binary representation is a palindrome.\n");
      } else {
         printf("The binary representation is not a palindrome.\n");
      }
   }

   return 0;
}
