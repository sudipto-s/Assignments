#include <iostream>
using namespace std;

int main() {
   int m;
   cout << "Enter size of the vectors: ";
   cin >> m;

   int* v = new int[m];

   cout << "Enter vectors: ";
   for (int i = 0; i < m; i++)
      cin >> v[i];

   cout << "Vectors: ";
   for (int i = 0; i < m; i++)
      cout << v[i] << " ";

   delete[] v;
   return 0;
}