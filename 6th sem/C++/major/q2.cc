#include <iostream>
using namespace std;

class Person {
   protected:
      string name;
      int code;
   public:
      Person(string n, int c): name(n), code(c) {}

      void updateName(string n) {
         name = n;
      }

      virtual void display() {
         cout << "Name: " << name << endl;
         cout << "Code: " << code << endl;
      }
};

class Account : virtual public Person {
   protected:
      double pay;
   public:
      Account(string n, int c, double p): Person(n, c), pay(p) {}

      void display() override {
         cout << "Pay: " << pay << endl;
      }
};

class Admin : virtual public Person {
   protected:
      double exp;
   public:
      Admin(string n, int c, double e): Person(n, c), exp(e) {}

      void display() override {
         cout << "Experience: " << exp << " years" << endl;
      }
};

class Master : public Account, Admin {
   public:
      Master(string n, int c, double e, double p):
         Person(n, c), Account(n, c, p), Admin(n, c, e) {}

      void display() {
         Person::display();
         Account::display();
         Admin::display();
      }
};

int main() {
   Master m("Sudipto", 1, 5, 95000);
   m.display();
   m.updateName("S");
   m.display();
   
   return 0;
}