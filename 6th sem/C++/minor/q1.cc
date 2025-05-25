#include <iostream>
#include <vector>
using namespace std;

class Vector {
   vector<float> elements;

   public:
      Vector(const vector<float>& values): elements(values) {}

      void modify(int index, float value) {
         if (index >= 0 && index < elements.size())
            elements[index] = value;
         else
            cout << "Index out of range.\n";
      }

      void multiply(float scalar) {
         for (float& elem : elements)
            elem *= scalar;
      }

      void display() {
         cout << "(";
         for (size_t i = 0; i < elements.size(); ++i) {
            cout << elements[i];
            if (i != elements.size() - 1) cout << ", ";
         }
         cout << ")" << endl;
      }
};

int main() {
   Vector v({10.0, 20.0, 30.0});
   v.display();

   v.modify(1, 25.0);
   v.display();

   v.multiply(2.0);
   v.display();

   return 0;
}
