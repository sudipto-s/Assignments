#include <stdio.h>
#include <unistd.h>
void main() {
   int len, i, j;
   printf("Enter the length: ");
   scanf("%d", &len);
   int arr[len];
   if(vfork() == 0) {
      arr[0] = 0;
      arr[1] = 1;
      for(i = 2; i < len; i++)
         arr[i] = arr[i-1] + arr[i-2];
      _exit(0);
   } else {
      printf("Fibonacci numbers: ");
      for(i = 0; i < len; i++)
         printf("%d ", arr[i]);
      printf("\n");

      printf("Prime fibonacci numbers:\n");
      for (int i = 0; i < len; i++) {
         int is_prime = 1;
         if (arr[i] <= 1) {
            is_prime = 0;
         } else {
            for (int j = 2; j * j <= arr[i]; j++) {
               if (arr[i] % j == 0) {
                  is_prime = 0;
                  break;
               }
            }
         }
         if (is_prime)
            printf("%d at index %d\n", arr[i], i);
      }
   }
}