#include <stdio.h>
#include <math.h>

void asr(int n, double lg, double *ng) {
   if (!n) {
      *ng = 0;
      return;
   }
   *ng = .5 * (lg + (n / lg));
   while (fabs(lg - *ng) > .005) {
      lg = *ng;
      *ng = .5 * (lg + (n / lg));
   }
}

void main() {
   int n;
   double lg = 1, ng;
   printf("Enter a number: ");
   scanf("%d", &n);
   asr(n, lg, &ng);
   printf("Square root of %d is: %lf", n, ng);
}