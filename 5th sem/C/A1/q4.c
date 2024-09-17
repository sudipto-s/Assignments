#include <stdio.h>
#include <math.h>

double per_month_payment(double, double, int);

int main() {
   double principle, purchase_price, rate, payment, down_payment;
   int num_payments;
   printf("Enter purchase price: ");
   scanf("%lf", &purchase_price);
   printf("Enter down paymant: ");
   scanf("%lf", &down_payment);
   printf("Enter rate of interest: ");
   scanf("%lf", &rate);
   printf("Enter total number of payments: ");
   scanf("%d", &num_payments);
   principle = purchase_price - down_payment;
   printf("Amount borrowed: $%.2f\n", principle);
   rate /= 12;
   payment = per_month_payment(principle, rate, num_payments);
   printf("Payment: $%.2f", payment);
   return 0;
}

double per_month_payment(double principle, double rate, int num_payments) {
   return ((rate * principle) / (1 - pow((1 + rate), -num_payments)));
}