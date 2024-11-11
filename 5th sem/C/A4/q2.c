#include <stdio.h>

int multiple(int n) {
   return (n % 7 == 0 || n % 11 == 0 || n % 13 == 0);
}

int sumEvOd(int num) {
   int sum = 0;
   while (num > 0) {
      sum += (num % 10);
      num /= 10;
   }
   return sum % 2 == 0 ? 1 : 0;
}

int isPrime(int n) {
   if (n <= 1)
      return 0;
   for (int i = 2; i <= n/2; i++)
      if (n % i == 0) 
         return 0;
   return 1;
}

void point(int n, int *a, int *b, int *c) {
   if (multiple(n))
      *a = 1;
   if (sumEvOd(n))
      *b = 1;
   if (isPrime(n))
      *c = 1;
}

void main() {
   int a = 0, b = 0, c = 0, n;
   while (1) {
      printf("\n\nEnter a positive integer(negative value to stop): ");
      scanf("%d", &n);
      if (n < 0)
         break;
      point(n, &a, &b, &c);
      printf("\nIs the value a multiple of 7, 11, or 13? %c", a ? 'y' : 'n');
      printf("\nIs the sum of the digits odd or even? %c", b ? 'e' : 'o');
      printf("\nIs the value a prime number? %c", c ? 'y' : 'n');
   }
}