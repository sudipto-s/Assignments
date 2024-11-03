#include <stdio.h>

double fast_food_billion(int year) {
   double charges = 33.2 + (16.8 * (double)(year - 2005));
   return charges;
}

void main() {
   int year;
   double charges;
   printf("Enter year(any year before 2005 stops): ");
   scanf("%d", &year);
   if (year < 2005) {
      printf("No data available for years before 2005");
      return;
   }
   while(year >= 2005) {
      charges = fast_food_billion(year);
      printf("\nCharges for %d - %f billions", year, charges);
      printf("\nEnter year (or any year before 2005 to stop): ");
      scanf("%d", &year);
   }
}


// Credit: lonks.onrender.com/c5th