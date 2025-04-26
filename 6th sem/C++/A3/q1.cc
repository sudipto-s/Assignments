#include <iostream>
using namespace std;

class MyString {
   string str;
   public:
      MyString() {
         str = "";
      }
      MyString(string s): str(s) {}

      MyString operator=(const MyString &s) {
         return str += s.str;
      }

      void display() {
         cout << str << endl;
      }
};

int main() {
   MyString s1;
   MyString s2("Hello");
   MyString s3("World");

   s1.display();
   s2.display();
   s3.display();

   s2 = s3;
   s2.display();
   
   s3 = s2;
   s3.display();
   
   return 0;
}