#include <stdio.h>

#define RHO 1.23

void calc(double *f, double area, double cd, int v) {
   *f = .5 * cd * area * RHO * v * v;
}

void main() {
   int v;
   double f, area, cd;
   printf("Enter area: ");
   scanf("%lf", &area);
   printf("Enter drag coefficient: ");
   scanf("%lf", &cd);
   for (v = 0; v <= 40; v += 5) {
      calc(&f, area, cd, v);
      printf("%dm/s - %.2lfN\n", v, f);
   }
}