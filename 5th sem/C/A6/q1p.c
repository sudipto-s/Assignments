/*
Another approach for structure with pointers
*/

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

void scan_date(date_t *date) {
   scanf("%d %d %d", &date->date, &date->month, &date->year);
}

void scan_tank(tank_t *tank) {
   printf("Enter tank capacity: ");
   scanf("%f", &tank->capacity);
   while(1) {
      printf("Enter current tank level: ");
      scanf("%f", &tank->current);
      if (tank->current <= tank->capacity)
         break;
      printf("Current level exceeds capacity\n");
   }
}

void scan_auto(auto_t *autoi) {
   printf("Enter make: ");
   scanf(" %[^\n]s", autoi->make);
   printf("Enter model: ");
   scanf(" %[^\n]s", autoi->model);
   printf("Enter odometer reading: ");
   scanf("%d", &autoi->odometer);
   printf("Enter manufacture date(DD MM YYYY): ");
   scan_date(&autoi->manufacture);
   printf("Enter purchase date(DD MM YYYY): ");
   scan_date(&autoi->purchase);
   scan_tank(&autoi->gastank);
}

void print_date(date_t date) {
   printf("%d/%d/%d\n", date.date, date.month, date.year);
}

void print_tank(tank_t tank) {
   printf("Tank capacity: %.2f\n", tank.capacity);
   printf("Current tank level: %.2f\n", tank.current);
}

void print_auto(auto_t autoi) {
   printf("\nMake: %s\n", autoi.make);
   printf("Model: %s\n", autoi.model);
   printf("Odometer: %d\n", autoi.odometer);
   printf("Manufactured on: ");
   print_date(autoi.manufacture);
   printf("Purchased on: ");
   print_date(autoi.purchase);
   print_tank(autoi.gastank);
}

void main() {
   auto_t autoi;
   scan_auto(&autoi);
   print_auto(autoi);
}