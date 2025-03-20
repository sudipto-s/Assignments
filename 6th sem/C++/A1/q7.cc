#include <iostream>
using namespace std;

#define MAX(x, y, z) ((x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z))

int main() {
   int p = 4, q = 0, r = 5;
   cout << MAX(p, q, r) << endl;

   return 0;
}