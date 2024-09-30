#include <stdio.h>

int isLeap(int year) {
   return year % 4 == 0 ? year % 100 == 0 ? year % 400 == 0 ? 1 : 0 : 1 : 0;
}

void main() {
   int month, date, year, day;
   printf("Enter date DD MM YYYY: ");
   scanf("%d %d %d", &date, &month, &year);
   if (date < 1 || date > 31) {
      printf("Invalid date");
      return;
   }
   if (month < 1 || month > 12) {
      printf("Invalid month");
      return;
   }
   if (year < 1) {
      printf("Invalid date");
      return;
   }
   switch (month) {
      case 12:
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+30+31+31+30+31+30+date;
         break;
      case 11:
         if (date > 30) {
            printf("Invalid date");
            return;
         }
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+30+31+31+30+31+date;
         break;
      case 10:
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+30+31+31+30+date;
         break;
      case 9: 
         if (date > 30) {
            printf("Invalid date");
            return;
         }
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+30+31+31+date;
         break;
      case 8:
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+30+31+date;
         break;
      case 7: 
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+30+date;
         break;
      case 6: 
         if (date > 30) {
            printf("Invalid date");
            return;
         }
         day = 31+(isLeap(year) ? 29 : 28)+31+30+31+date;
         break;
      case 5: 
         day = 31+(isLeap(year) ? 29 : 28)+31+30+date;
         break;
      case 4: 
         if (date > 30) {
            printf("Invalid date");
            return;
         }
         day = 31+(isLeap(year) ? 29 : 28)+31+date;
         break;
      case 3: 
         day = 31+(isLeap(year) ? 29 : 28)+date;
         break;
      case 2: 
         if (isLeap(year)) {
            if (date > 29) {
               printf("Invalid date");
               return;
            }
         } else {
            if (date > 28) {
               printf("Invalid date");
               return;
            }
         }
         day = 31+date;
         break;
      default:
         day = date;
   }

   printf("Day %d of the year %d", day, year);
}