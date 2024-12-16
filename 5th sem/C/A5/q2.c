#include <stdio.h>
#include <math.h>

void main() {
   int x[20], y[20], z[20], n = 0, sum = 0, i;
   double sqrt_sum = 0;

   printf("Enter the elements of first array(-1 to stop): ");
   for (i = 0; i < 20; i++) {
      scanf("%d", &x[i]);
      if (x[i] == -1) break;
      n++;
   }

   printf("Enter the elements of second array(-1 to stop): ");
   for (i = 0; i < n; i++)
      scanf("%d", &y[i]);

   for (i = 0; i < n; i++) {
      z[i] = x[i] * y[i];
      sum += z[i];
   }
   
   printf("x\ty\tz\n");
   for (int i = 0; i < n; i++)
      printf("%d\t%d\t%d\n", x[i], y[i], z[i]);
   
   sqrt_sum = sqrt(sum);
   printf("\nSquare root of the sum of elements of z: %.2lf", sqrt_sum);
}