#include <iostream>
using namespace std;

void swap(int& a, int& b) {
   a ^= b;
   b = a ^ b;
   a ^= b;
}

int main() {
   int a = 5, b = 6;

   cout << "Before swap: a = " << a << ", b = " << b << endl;
   swap(a, b);
   cout << "After swap: a = " << a << ", b = " << b << endl;

   return 0;
}