#include <stdio.h>
#include <math.h>

void main() {
   int l, s, n, temp, range;
   double avg, std_dv, sum = 0, sqrs = 0;
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
      sqrs += (temp * temp);
   }

   range = l - s;
   avg = sum / n;
   std_dv = sqrt((sqrs / n) - (avg * avg));
   printf("Smallest: %d\n", s);
   printf("Largest: %d\n", l);
   printf("Range: %d\n", range);
   printf("Average: %.2f\n", avg);
   printf("Standard deviation: %lf", std_dv);
}


// Credit: lonks.onrender.com/c5th