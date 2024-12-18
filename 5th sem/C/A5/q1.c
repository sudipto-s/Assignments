#include <stdio.h>

void main() {
   int barcode[12], ev_sum = 0, od_sum = 0, sum = 0, chk_bit, i;
   printf("Enter 12 digits of barcode(space separated): ");
   for (i = 0; i < 12; i++)
      scanf(" %d", &barcode[i]);

   for (i = 0; i < 12; i += 2)
      od_sum += barcode[i];
   od_sum *= 3;
   for (i = 1; i < 11; i += 2)
      ev_sum += barcode[i];
   
   sum = od_sum + ev_sum;
   
   chk_bit = sum % 10 ? 10 - (sum % 10) : 0;

   printf("Odd sum: %d\n", od_sum);
   printf("Even sum: %d\n", ev_sum);
   printf("Total sum: %d\n", sum);
   if (chk_bit == barcode[11])
      printf("Barcode validated");
   else
      printf("Error in barcode");
}