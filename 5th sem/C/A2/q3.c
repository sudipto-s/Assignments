#include <stdio.h>

void display(int odometer, double emit, double max1, double max2) {
   if (odometer <= 50000) {
      if (emit <= max1)
         printf("Emissions are under permitted level of %lf grams/mile.", max1);
      else
         printf("Emissions exceed permitted level of %lf grams/mile.", max1);
   } else {
      double myEmit = odometer * emit;
      double left = odometer - 50000;
      double limit = (50000 * max1) + (left * max2);
      if (myEmit <= limit)
         printf("Emissions are under permitted level of %lf grams/mile.", max2);
      else
         printf("Emissions exceed permitted level of %lf grams/mile.", max2);
   }
}

void main() {
   int plt_num, odometer;
   double emit;
   printf("(1) Carbon monoxide\n(2) Hydrocarbons\n(3) Nitrogen oxides\n(4) Nonmethane hydrocarbons\n");
   printf("Enter pollutant no.: ");
   scanf("%d", &plt_num);
   if (plt_num < 1 || plt_num > 4) {
      printf("Invalid choice");
      return;
   }
   printf("Enter number of grams emitted per mile: ");
   scanf("%lf", &emit);
   if (emit < 0) {
      printf("Invalid input");
      return;
   }
   printf("Enter odometer reading: ");
   scanf("%d", &odometer);
   if (odometer < 0) {
      printf("Invalid input");
      return;
   }
   
   switch (plt_num) {
      case 1:
         display(odometer, emit, 3.4, 4.2);
         break;
      case 2:
         display(odometer, emit, 0.31, 0.39);
         break;
      case 3:
         display(odometer, emit, 0.4, 0.5);
         break;
      default:
         display(odometer, emit, 0.25, 0.31);
         break;
   }
   return;
}