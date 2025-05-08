#include <iostream>
using namespace std;

class Number{
   int x;
   public:
      Number(int a): x(a) {}

      void operator++() {
         x += 1;
      }
      void operator++(int) {
         x += 1;
      }
      void display() {
         cout<<x<<endl;
      }
};

int main() {
   int n;
   cout<<"Enter a number: ";
   cin>>n;
   Number num(n);
   num.display();
   ++num;
   num.display();
   num++;
   num.display();

   return 0;
}