#include <iostream>
using namespace std;

void read(int** mtx, int m, int n) {
   int i, j;
   cout << "Enter the matrix: " << endl;
   for (i = 0; i < m; i++)
      for (j = 0; j < n; j++)
         cin >> mtx[i][j];
}
void print(int** mtx, int m, int n) {
   int i, j;
   cout << endl << "Matrix: " << endl;
   for(i = 0; i < m; i++) {
      for(j = 0; j < n; j++)
         cout << mtx[i][j] << " ";
      cout << endl;
   }
}

int main() {
   int m, n, i, j;
   
   cout << "Enter the value of m(mxn): ";
   cin >> m;
   cout << "Enter the value of n(mxn): ";
   cin >> n;

   int** mtx = new int*[m];
   for(i = 0; i < m; i++)
      mtx[i] = new int[n];

   read(mtx, m, n);
   print(mtx, m, n);

   for(i = 0; i < n; i++)
      delete[] mtx[i];
   delete[] mtx;
   return 0;
}