#include <stdio.h>

void dispense(int amount, int *tenP, int *tweP, int *fiftyP) {
   *fiftyP = amount/50;
   amount %= 50;
   *tweP = amount/20;
   amount %= 20;
   *tenP = amount/10;
   amount %= 10;
}
void main() {
   int amount, ten, twenty, fifty;
   printf("Enter amount (a multiple of 10 dollars): ");
   scanf("%d", &amount);
   if (amount % 10 != 0) {
      printf("Invalid amount");
      return;
   }
   dispense(amount, &ten, &twenty, &fifty);
   printf("Ten dollar bills: %d\n", ten);
   printf("Twenty dollar bills: %d\n", twenty);
   printf("Fifty dollar bills: %d\n", fifty);
}