#include <stdio.h>

#define TAX 3.625

void main() {
   int id, hrs_worked, c = 0;
   double wage_rate, total = 0, avg = 0, gross = 0;

   while (1) {
      printf("Enter ID number of employee(0 to terminate): ");
      scanf("%d", &id);
      if (id == 0)
         break;
      printf("Enter hourly wage rate: ");
      scanf("%lf", &wage_rate);
      printf("Enter hours worked: ");
      scanf("%d", &hrs_worked);
      if (hrs_worked < 0)
         printf("Invalid input");
      else if (hrs_worked <= 40)
         gross = hrs_worked * wage_rate;
      else
         gross = (40 * wage_rate) + (hrs_worked - 40) * (1.5 * wage_rate);
      gross -= (gross * (TAX / 100));
      total += gross;
      printf("Employee ID: %d\n", id);
      printf("Net pay: %lf\n\n", gross);
      c++;
   }
   avg = total / c;
   printf("Total payroll: %lf\n", total);
   printf("Average amount paid: %lf", avg);
}


// Credit: lonks.onrender.com/c5th