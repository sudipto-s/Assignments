#include <iostream>
using namespace std;

class Complex {
   float real, imag;
   public:
      Complex(float r = 0, float i = 0): real(r), imag(i) {}

   static Complex addcomplex(const Complex &a, const Complex &b) {
      return Complex(a.real + b.real, a.imag + b.imag);
   }

   void display() {
      cout << real << " + " << imag << "i" << endl;
   }
};

int main() {
   Complex a(3.12, 5.65);
   Complex b(2.75, 1.21);
   Complex c = Complex::addcomplex(a, b);
   c.display();

   return 0;
}