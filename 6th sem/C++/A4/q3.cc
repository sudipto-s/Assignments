#include <iostream>
using namespace std;

class FLOAT{
   float value;
   public:
      FLOAT(float val): value(val) {}

      void print() {
         cout << value << endl;
      }
      FLOAT operator+(FLOAT obj) {
         return FLOAT(value + obj.value);
      }
      FLOAT operator-(FLOAT obj) {
         return FLOAT(value - obj.value);
      }
      FLOAT operator*(FLOAT obj) {
         return FLOAT(value * obj.value);
      }
      FLOAT operator/(FLOAT obj) {
         return FLOAT(value / obj.value);
      }
};

int main() {
   float n1, n2;
   cout << "Enter a number: ";
   cin >> n1;
   FLOAT f1(n1);
   cout << "Enter another number: ";
   cin >> n2;
   FLOAT f2(n2);
   FLOAT f3 = f1 + f2;
   cout << "Addition: ";
   f3.print();
   cout << "Subtraction: ";
   f3 = f1 - f2;
   f3.print();
   cout << "Multiplication: ";
   f3 = f1 * f2;
   f3.print();
   cout << "Division: ";
   f3 = f1 / f2;
   f3.print();

   return 0;
}