#include <stdio.h>

void display(int, int, int, int, int, int, double, int, int, int);

void main() {
   char type;
   int double_loaf, manual_baking;

   printf("Enter type of bread (w - white, s - sweet): ");
   scanf("%c", &type);
   fflush(stdin);
   if (type != 'w' && type != 's') {
      printf("Invalid input");
      return;
   }

   printf("Is the loaf size double? (1 - yes, 0 - no): ");
   scanf("%d", &double_loaf);
   fflush(stdin);
   if (double_loaf != 1 && double_loaf != 0) {
      printf("Invalid input");
      return;
   }

   printf("Is baking manual? (1 - yes, 0 - no): ");
   scanf("%d", &manual_baking);
   if (manual_baking != 1 && manual_baking != 0) {
      printf("Invalid input");
      return;
   }
   
   if (type == 'w')
      display(15, 60, 18, 20, 2, 75, 45, 30, manual_baking, double_loaf);
   else
      display(20, 60, 33, 30, 2, 75, 35, 30, manual_baking, double_loaf);

   return;
}

void display(int a, int b, int c, int d, int e, int f, double g, int h, int manual_bkn, int dbl_loaf) {
   if (dbl_loaf)
      g *= 1.5;
   printf("Primary kneading: %d mins\n", a);
   printf("Primary rising: %d mins\n", b);
   printf("Secondary kneading: %d mins\n", c);
   printf("Secondary rising: %d mins\n", d);
   printf("Loaf shaping: %d seconds\n", e);
   if (manual_bkn) {
      printf("Remove the dough\n");
      printf("Total time: %d mins %d secs", a+b+c+d, e);
      return;
   }
   printf("Final rising: %d mins\n", f);
   printf("Baking: %.0f mins\n", g);
   printf("Cooling: %d mins\n", h);
   printf("Total time: %.0f mins %d secs", f+g+h, e);
}