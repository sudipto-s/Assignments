#include <stdio.h>

void main() {
   int l, s, n, temp;
   double avg, sum = 0;
   printf("Enter N: ");
   scanf("%d", &n);
   printf("Enter the numbers:\n");
   for (int i = 1; i <= n; i++) {
      scanf("%d", &temp);
      if (i == 1) {
         l = temp;
         s = temp;
      } else {
         if (temp > l)
            l = temp;
         if (temp < s)
            s = temp;
      }
      sum += temp;
   }

   avg = sum / n;
   printf("Smallest: %d\n", s);
   printf("Largest: %d\n", l);
   printf("Average: %.2f", avg);
}


// Credit: lonks.onrender.com/c5th