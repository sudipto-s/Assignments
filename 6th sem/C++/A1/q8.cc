#include <iostream>
using namespace std;

double pow(double m, int n = 2) {
   double res = 1;
   int i;
   for (i = 0; i < n; i++)
      res *= m;
   return res;
}

int main() {
   double z;
   int n;
   cout << "Enter a number: ";
   cin >> z;
   cout << "Enter power: ";
   cin >> n;

   cout << "Without default parameter" << pow(z, n) << endl;
   cout << "With default parameter" << pow(z) << endl;

   return 0;
}