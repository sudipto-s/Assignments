#include <iostream>
using namespace std;

int main() {
   enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };

   int d;
   cout << "Enter day number: ";
   cin >> d;

   Day day = static_cast<Day>(d);

   switch (day) {
      case SUNDAY:
         cout << "Today is Sunday" << endl;
         break;
      case MONDAY:
         cout << "Today is Monday" << endl;
         break;
      case TUESDAY:
         cout << "Today is Tuesday" << endl;
         break;
      case WEDNESDAY:
         cout << "Today is Wednesday" << endl;
         break;
      case THURSDAY:
         cout << "Today is Thursday" << endl;
         break;
      case FRIDAY:
         cout << "Today is Friday" << endl;
         break;
      case SATURDAY:
         cout << "Today is Saturday" << endl;
         break;
      default:
         cout << "Invalid" << endl;
   }
   return 0;
}