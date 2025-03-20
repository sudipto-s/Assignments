#include <iostream>
using namespace std;

void swap(int& y, int& z) {
   y ^= z;
   z = y ^ z;
   y ^= z;
}

int main() {
   int a = 5, b = 6;

   cout << "Before swap: a = " << a << ", b = " << b << endl;
   swap(a, b);
   cout << "After swap: a = " << a << ", b = " << b << endl;

   return 0;
}