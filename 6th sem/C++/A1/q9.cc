#include <iostream>
using namespace std;

double pow(int m, int n = 2) {
   cout << "IN the int" << endl;
   int res = 1;
   int i;
   for (i = 0; i < n; i++)
      res *= m;
   return res;
}
double pow(double m, int n = 2) {
   cout << "IN the double" << endl;
   double res = 1, i;
   for (i = 0; i < n; i++)
      res *= m;
   return res;
}

int main() {
   double m1;
   int m2, n, c;

   cout << "Entering integer(1 or 0)? ";
   cin >> c;
   
   cout << "Enter the number: ";
   if(c == 0)
      cin >> m1;
   else
      cin >> m2;
   cout << "Enter power: ";
   cin >> n;
   
   if(c == 0) {
      cout << pow(m1, n) << endl;
      cout << pow(m1) << endl;
   } else {
      cout << pow(m2, n) << endl;
      cout << pow(m2) << endl;
   }

   return 0;
}