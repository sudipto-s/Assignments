#include <stdio.h>
#include <string.h>
#include <ctype.h>

void pluralize(char noun[], char plural[]) {
   int len = strlen(noun);

   if (len > 1 && noun[len - 1] == 'y' && !strchr("aeiou", tolower(noun[len - 2]))) {
      // Ends with 'y' and preceded by a consonant
      strncpy(plural, noun, len - 1);
      plural[len - 1] = '\0';
      strcat(plural, "ies");
   } else if ((len > 1 && noun[len - 1] == 's') ||
            (len > 2 && (noun[len - 2] == 'c' && noun[len - 1] == 'h')) ||
            (len > 2 && (noun[len - 2] == 's' && noun[len - 1] == 'h'))) {
      // Ends with 's', 'ch', or 'sh'
      strcpy(plural, noun);
      strcat(plural, "es");
   } else {
      // Default case: Append 's'
      strcpy(plural, noun);
      strcat(plural, "s");
   }
}

int main() {
   int n;
   printf("Enter the number of nouns: ");
   scanf("%d", &n);

   char nouns[n][50], plural[50];

   printf("Enter the nouns:\n");
   for (int i = 0; i < n; i++) {
      scanf("%s", nouns[i]);
   }

   printf("Noun\tPlural\n");
   for (int i = 0; i < n; i++) {
      pluralize(nouns[i], plural);
      printf("%s\t%s\n", nouns[i], plural);
   }

   return 0;
}
