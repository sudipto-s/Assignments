#include <iostream>
using namespace std;

int main() {
   int m;
   cout << "Enter size of the vectors: ";
   cin >> m;

   int* vctr = new int[m];

   cout << "Enter vectors: ";
   for (int i = 0; i < m; i++)
      cin >> vctr[i];

   cout << "Vectors: ";
   for (int i = 0; i < m; i++)
      cout << vctr[i] << " ";

   delete[] vctr;
   return 0;
}