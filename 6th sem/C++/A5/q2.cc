#include <iostream>
using namespace std;

class Shape {
   protected:
      double x, y;

   public:
      void get_data(double a, double b) {
         x = a;
         y = b;
      }

      virtual void display_area() = 0;
};

class Rectangle : public Shape {
   public:
      void display_area() {
         cout << "Area of Rectangle = " << x * y << endl;
      }
};

class Triangle : public Shape {
   public:
      void display_area() {
         cout << "Area of Triangle = " << 0.5 * x * y << endl;
      }
};

int main() {
   Shape* shapePtr;
   Rectangle rect;
   Triangle tri;

   int choice;
   double a, b;

   cout << "Choose a shape to compute area:\n";
   cout << "1. Rectangle\n2. Triangle\n";
   cout << "Enter choice (1 or 2): ";
   cin >> choice;

   cout << "Enter two dimensions: ";
   cin >> a >> b;

   if (choice == 1)
      shapePtr = &rect;
   else if (choice == 2)
      shapePtr = &tri;
   else {
      cout << "Invalid choice!";
      return 0;
   }

   shapePtr->get_data(a, b);
   shapePtr->display_area();

   return 0;
}
