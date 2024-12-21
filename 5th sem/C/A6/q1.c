#include <stdio.h>

#define MAX 100

typedef struct {
   int date;
   int month;
   int year;
} date_t;

typedef struct {
   float capacity;
   float current;
} tank_t;

typedef struct {
   char make[MAX];
   char model[MAX];
   int odometer;
   date_t manufacture;
   date_t purchase;
   tank_t gastank;
} auto_t;

date_t scan_date() {
   date_t date;
   scanf("%d %d %d", &date.date, &date.month, &date.year);
   return date;
}

tank_t scan_tank() {
   tank_t tank;
   printf("Enter tank capacity: ");
   scanf("%f", &tank.capacity);
   while(1) {
      printf("Enter current tank level: ");
      scanf("%f", &tank.current);
      if (tank.current <= tank.capacity)
         break;
      printf("Current level exceeds capacity\n");
   }
   return tank;
}

auto_t scan_auto() {
   auto_t auto_n;
   printf("Enter make: ");
   scanf(" %[^\n]s", auto_n.make);
   printf("Enter model: ");
   scanf(" %[^\n]s", auto_n.model);
   printf("Enter odometer reading: ");
   scanf("%d", &auto_n.odometer);
   printf("Enter manufacture date(DD MM YYYY): ");
   auto_n.manufacture = scan_date();
   printf("Enter purchase date(DD MM YYYY): ");
   auto_n.purchase = scan_date();
   auto_n.gastank = scan_tank();
   return auto_n;
}

void print_date(date_t date) {
   printf("%d/%d/%d\n", date.date, date.month, date.year);
}

void print_tank(tank_t tank) {
   printf("Tank capacity: %.2f\n", tank.capacity);
   printf("Current tank level: %.2f\n", tank.current);
}

void print_auto(auto_t auto_n) {
   printf("\nMake: %s\n", auto_n.make);
   printf("Model: %s\n", auto_n.model);
   printf("Odometer: %d\n", auto_n.odometer);
   printf("Manufactured on: ");
   print_date(auto_n.manufacture);
   printf("Purchased on: ");
   print_date(auto_n.purchase);
   print_tank(auto_n.gastank);
}

void main() {
   auto_t auto_n;
   auto_n = scan_auto();
   print_auto(auto_n);
}