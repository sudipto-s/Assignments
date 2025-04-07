#include <iostream>
#include <cstring>
using namespace std;

class Bank {
   char name[50];
   int acc_no;
   char acc_type[10];
   double balance;
   public:
      Bank() {
         strcpy(name,"");
         acc_no = 0;
         strcpy(acc_type,"");
         balance = 0.0;
      }
      
      Bank(const char name[], int acc_no, const char acc_type[], double balance) {
         strcpy(this->name, name);
         this->acc_no = acc_no;
         strcpy(this->acc_type, acc_type);
         this->balance = balance;
      }

      void loadC() {
         int b;
         cout << endl << "Enter name: ";
         cin >> name;
         cout << "Enter Account Number: ";
         cin >> acc_no;
         cout << "Enter Account Type: ";
         cin >> acc_type;
         cout << "Enter Balance: ";
         cin >> b;
         if(b < 0)
            cout << "Invalid Balance. Please enter a positive number.";
         else
            balance = b;
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
   Bank accounts[10];
   int i;
   for(i = 0; i < 10; i++) {
      accounts[i].loadC();
   }
   for(i = 0; i < 10; i++) {
      accounts[i].display();
      accounts[i].deposit(100 + i * 10);
      accounts[i].withdraw(10 + i * 10);
      cout << endl;
   }
   
   return 0;
}