#include <stdio.h>

void main() {
   int b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, opt = 1, qnt, b_id;
   for (int i = 1; i < 5; i++) {
      printf("\nEnter the number of beers of ID Number %d: ", i);
      scanf("%d", &qnt);
      if(i == 1)
         b1 += qnt;
      else if(i == 2)
         b2 += qnt;
      else if(i == 3)
         b3 += qnt;
      else
         b4 += qnt;
   }
   while (opt == 1) {
      printf("\nEnter the brand ID(0 to terminate): ");
      scanf("%d", &b_id);
      if (!b_id)
         break;
      switch (b_id) {
         case 1:
            printf("\nEnter the number of items purchased/sold: ");
            scanf("%d", &qnt);
            b1 += qnt;
            break;
         case 2:
            printf("\nEnter the number of items purchased/sold: ");
            scanf("%d", &qnt);
            b2 += qnt;
            break;
         case 3:
            printf("\nEnter the number of items purchased/sold: ");
            scanf("%d", &qnt);
            b3 += qnt;
            break;
         default:
            printf("\nEnter the number of items purchased/sold: ");
            scanf("%d", &qnt);
            b4 += qnt;
      }
   }
   printf("Final inventory:\n");
   printf("ID 1: %d\n", b1);
   printf("ID 2: %d\n", b2);
   printf("ID 3: %d\n", b3);
   printf("ID 4: %d", b4);
}


// Credit: lonks.onrender.com/c5th