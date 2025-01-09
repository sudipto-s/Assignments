#include <stdio.h>
#include <string.h>

void calculate_lab_statistics(int a1, int a2, int a3, int *low, int *high, double *avg, char *grade) {
   *low = a1;
   if (a2 < *low) {
      *low = a2;
   }
   if (a3 < *low) {
      *low = a3;
   }

   *high = a1;
   if (a2 > *high) {
      *high = a2;
   }
   if (a3 > *high) {
      *high = a3;
   }

   *avg = (a1+a2+a3)/3.0;

   if(*avg >= 90)
      strcpy(grade, "A");
   else if(*avg >= 80)
      strcpy(grade, "B");
   else if(*avg >= 70)
      strcpy(grade, "C");
   else if(*avg >= 60)
      strcpy(grade, "D");
   else
      strcpy(grade, "F");
}

void main() {
   int a1, a2, a3, low, high, i;
   double avg;
   char grade[5];
   for(i = 1; i <= 3; i++) {
      printf("Enter the marks of assesment %d: ", i);
      if(i == 1)
         scanf("%d", &a1);
      else if(i == 2)
         scanf("%d", &a2);
      else
         scanf("%d", &a3);
   }
   calculate_lab_statistics(a1, a2, a3, &low, &high, &avg, grade);

   printf("Lowest: %d\n", low);
   printf("Highest: %d\n", high);
   printf("Average: %lf\n", avg);
   printf("Grade: %s", grade);
}