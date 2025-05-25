#include <iostream>
#include <vector>
using namespace std;

class Vector {
   vector<float> elements;

   public:
      Vector(const vector<float>& values) {
         elements = values;
      }

      void display() {
         cout << "(";
         for (size_t i = 0; i < elements.size(); ++i) {
            cout << elements[i];
            if (i != elements.size() - 1) cout << ", ";
         }
         cout << ")" << endl;
      }

      Vector addVector(const Vector& vt) {
         std::vector<float> result;
         size_t size = std::min(elements.size(), vt.elements.size());
         for (size_t i = 0; i < size; ++i) {
               result.push_back(elements[i] + vt.elements[i]);
         }
         return Vector(result);
      }
};

int main() {
   Vector v1({10.0, 20.0, 30.0});
   Vector v2({1.0, 2.0, 3.0});

   std::cout << "Vector 1: ";
   v1.display();

   std::cout << "Vector 2: ";
   v2.display();

   Vector v3 = v1.addVector(v2);

   std::cout << "Resultant vector: ";
   v3.display();

   return 0;
}
