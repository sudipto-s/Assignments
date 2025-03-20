#include <iostream>
using namespace std;

void read(int** mtx, int n, int m = 2) {
   int i, j;
   cout << "Enter the matrix: " << endl;
   for (i = 0; i < m; i++)
      for (j = 0; j < n; j++)
         cin >> mtx[i][j];
}
void print(int** mtx, int n, int m = 2) {
   int i, j;
   cout << endl << "Matrix: " << endl;
   for(i = 0; i < m; i++) {
      for(j = 0; j < n; j++)
         cout << mtx[i][j] << " ";
      cout << endl;
   }
}

int main() {
   int m, n, i, j, c;
   
   cout << "Enter 0 for default row(m) value(2) | 1 for custom: ";
   cin >> c;
   if (c == 0)
      m = 2;
   else {
      cout << "Enter the value of m(mxn): ";
      cin >> m;
   }

   cout << "Enter the value of n(mxn): ";
   cin >> n;

   int** mtx = new int*[m];
   for(i = 0; i < m; i++)
      mtx[i] = new int[n];

   if(c == 0) {
      read(mtx, n);
      print(mtx, n);
   } else {
      read(mtx, n, m);
      print(mtx, n, m);
   }

   for(i = 0; i < n; i++)
      delete[] mtx[i];
   delete[] mtx;
   return 0;
}