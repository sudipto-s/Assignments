#include <iostream>
#include <cmath>
using namespace std;

class Number {
   int num;

   public:
      void setNumber(int n) {
         num = n;
      }

      int getNumber() {
         return num;
      }

      void printNumber() {
         cout << "Number: " << num << endl;
      }

      bool isNegative() {
         return num < 0;
      }

      bool isDivisibleBy(int n) {
         return num % n == 0;
      }

      int absoluteValue() {
         return abs(num);
      }
};

int main() {
   Number n;
   n.setNumber(-6);
   cout << n.getNumber() << endl;
   n.printNumber();
   cout << "Negative: " << (n.isNegative() ? "Yes" : "No") << endl;
   cout << "Is divisible: " << (n.isDivisibleBy(4) ? "Yes" : "No") << endl;
   cout << "Absolute value: " << n.absoluteValue();
   
   return 0;
}