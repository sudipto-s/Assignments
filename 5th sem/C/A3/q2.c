#include <stdio.h>

#define TAX 3.625

void main() {
   int i, id_number, employees;
   double wage_rate, overtime_wage, hours_worked, overtime, grosspay, netpay, overtimepay, total_payroll = 0, avg;

   printf("Enter the number of employees: ");
   scanf("%d", &employees);

   for(i = 0; i < employees; i++) {
      printf("Enter ID number of employee %d: ", i+1);
      scanf("%d", &id_number);
      printf("Enter hourly wage rate: ");
      scanf("%lf", &wage_rate);
      printf("Enter hours worked: ");
      scanf("%lf", &hours_worked);
      if (hours_worked < 0)
         printf("Invalid input");
      else if (hours_worked <= 40)
         grosspay = hours_worked * wage_rate;
      else {
         overtime_wage = 1.5 * wage_rate;
         overtimepay = (hours_worked - 40) * overtime_wage;
         grosspay = (40 * wage_rate) + overtimepay;
      }
      netpay = grosspay - (grosspay * (TAX / 100));
      total_payroll += netpay;
      printf("Employee ID: %d\n", id_number);
      printf("Net pay: %.2f\n", netpay);
   }
   avg = total_payroll / employees;
   printf("Total payroll: %.2f\n", total_payroll);
   printf("Average amount paid: %.2f\n", avg);
}


// Credit: lonks.vercel.app/c5th