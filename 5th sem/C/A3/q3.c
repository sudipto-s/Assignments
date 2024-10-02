#include <stdio.h>

void main() {
   int brand1 = 0, brand2 = 0, brand3 = 0, brand4 = 0, brand_id, amount, final_inventory = 0, temp, quantity, option;

   printf("Please Enter the case inventory of each brand for the start of the week. ");
   for (int i = 1; i <= 4; i++) {
      printf("\nEnter the number of beers of ID Number %d-> ",i);
      scanf("%d", &quantity);
      if(i == 1)
         brand1 += quantity;
      else if(i == 2)
         brand2 += quantity;
      else if(i == 3)
         brand3 += quantity;
      else
         brand4 += quantity;
   }
   printf("\nDo you want to enter any sales and purchase records?(Press 1 for yes/ 0 for no)->");
   scanf("%d", &option);
   
   while(option == 1) {
      printf("\nEnter Brand ID Number -> ");
      scanf("%d", &brand_id);
      if (brand_id == 1) {
         printf("\nEnter the number of items purchased of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand1 += amount;
         printf("\nEnter the number of items sold of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand1 -= amount;
      }
      else if (brand_id == 2) {
         printf("\nEnter the number of items purchased of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand2 += amount;

         printf("\nEnter the number of items sold of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand2 -= amount;
      }
      else if (brand_id == 3) {
         printf("\nEnter the number of items purchased of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand3 += amount;
         printf("\nEnter the number of items sold of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand3 -= amount;
      }
      else if (brand_id == 4) {
         printf("\nEnter the number of items purchased of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand4 += amount;
         printf("\nEnter the number of items sold of Brand ID %d -> ",brand_id);

         scanf("%d", &amount);
         brand4 -= amount;
      }
      else
         printf("\nInvalid brand ID.");

      printf("\nDo you want to enter any more sales and purchase records?(Press 1 for yes/ 0 for no)->");
      scanf("%d", &option);
   }
   printf("\nNumber of beers in Brand ID Number 1 -> %d", brand1);
   printf("\nNumber of beers in Brand ID Number 2 -> %d", brand2);
   printf("\nNumber of beers in Brand ID Number 3 -> %d", brand3);
   printf("\nNumber of beers in Brand ID Number 4 -> %d", brand4);
}