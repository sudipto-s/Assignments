#include <stdio.h>

void main() {
   int l, s, n, t, sum = 0;
   double avg;
   printf("Enter N: ");
   scanf("%d", &n);
   printf("Enter the numbers:\n");
   for (int i = 1; i <= n; i++) {
      scanf("%d", &t);
      if (i > 1) {
         if (t > l)
            l = t;
         if (t < s)
            s = t;
      } else {
         l = t;
         s = t;
      }
      sum += t;
   }

   avg = (double)sum / n;
   printf("Smallest: %d\n", s);
   printf("Largest: %d\n", l);
   printf("Average: %.2f", avg);
}