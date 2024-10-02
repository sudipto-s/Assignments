#include <stdio.h>
#include <math.h>

void main() {
   int n, t;
   double avg, std_dv, sum = 0, sqrs = 0;

   printf("Enter N: ");
   scanf("%d", &n);
   printf("Enter the numbers:\n");
   for (int i = 1; i <= n; i++) {
      scanf("%d", &t);
      sum += t;
      sqrs += (t * t);
   }

   avg = (double)sum / n;
   std_dv = sqrt((sqrs / n) - (avg * avg));
   printf("Standard deviation: %lf", std_dv);
}