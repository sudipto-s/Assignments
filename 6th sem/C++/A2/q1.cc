#include <iostream>
#include <cstring>
using namespace std;

class Bank {
   char name[50];
   int acc_no;
   char acc_type[10];
   double balance;
   public:
      Bank(const char name[], int acc_no, const char acc_type[], double balance) {
         strcpy(this->name, name);
         this->acc_no = acc_no;
         strcpy(this->acc_type, acc_type);
         this->balance = balance;
      }

      void deposit(double val) {
         if(val <= 0)
            cout << "Invalid deposit amount" << endl;
         else {
            balance += val;
            cout << "Deposited: " << val << endl;
         }
      }

      void withdraw(double val) {
         if(val <= 0)
            cout << "Invalid withdrawal amount" << endl;
         else if(val > balance)
            cout << "Insufficient balance" << endl;
         else {
            balance -= val;
            cout << "Withdrawn: " << val << endl;
         }
      }

      void display() {
         cout << "Name: " << name << endl;
         cout << "Balance: " << balance << endl;
      }
};

int main() {
   Bank c1("John Doe", 12345, "Savings", 1000);
   c1.display();
   c1.deposit(500);
   c1.display();
   c1.withdraw(200);
   
   return 0;
}