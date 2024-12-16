#include <stdio.h>

int rec(int x) {
   if(x <= 0)
      return 0;
   return rec(x - 1) + 2;
}

void main() {
   int x;
   printf("Enter a value: ");
   scanf("%d", &x);
   printf("f(%d) = %d", x, rec(x));
}