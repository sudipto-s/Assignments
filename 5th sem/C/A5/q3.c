#include <stdio.h>

#define MAX 100

void deblank(char *s1, char *s2) {
   while(*s1 != '\0') {
      if(*s1 != ' ')
         *s2++ = *s1;
      s1++;
   }
   *s2 = '\0';
}

void main() {
   char s1[MAX], s2[MAX];
   printf("Enter a string to deblank: ");
   scanf(" %[^\n]s", s1);      // or, fgets(s1, MAX, stdin);
   deblank(s1, s2);
   printf("Deblanked string: %s", s2);
}