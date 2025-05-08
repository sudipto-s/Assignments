#include <iostream>
#include <cmath>
using namespace std;

class Polar {
   double radius, angle;
   public:
      Polar(double r, double a): radius(r), angle(a) {}

      void toRectangle(double &x, double &y) {
         x = radius * cos(angle);
         y = radius * sin(angle);
      }

      Polar polarFromRectangular(double x, double y) {
         double a = atan2(y, x);
         double r = sqrt(x * x + y * y);
         return Polar(r, a);
      }
      
      Polar operator+(Polar p) {
         double x1,x2,y1,y2;
         toRectangle(x1,y2);
         p.toRectangle(x2,y2);
         double x = x1 + x2;
         double y = y1 + y2;
         return polarFromRectangular(x, y);
      }

      void print() {
         cout << "Polar(r=" << radius << ", a=" << angle << " rad)" << endl;
      }
};

double angleToRadian(double angle) {
   return angle * M_PI / 180.0;
}

int main() {
   double  r1,a1;
   double  r2,a2;

   cout << "Enter the first polar coordinate (r, a): ";
   cin >> r1 >> a1;
   cout << "Enter the second polar coordinate (r, a): ";
   cin >> r2 >> a2;
   Polar p1(r1,angleToRadian(a1));
   Polar p2(r2,angleToRadian(a2));
   p1.print();
   p2.print();
   cout << "Addition of p1 and p2: ";
   Polar p3 = p1 + p2;
   p3.print();
   return 0;
}
