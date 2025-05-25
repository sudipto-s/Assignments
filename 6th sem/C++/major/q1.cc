#include <iostream>
#include <cmath>
using namespace std;

class Account {
   protected:
      string customerName;
      int accountNumber;
      string accountType;
      double balance;

   public:
      Account(string name, int accNo, string type, double bal)
         : customerName(name), accountNumber(accNo), accountType(type), balance(bal) {}

      void deposit(double amount) {
         balance += amount;
         cout << "Deposited: " << amount << endl;
      }

      void displayBalance() const {
         cout << "Account Number: " << accountNumber << endl;
         cout << "Current Balance: " << balance << endl;
      }

      virtual void withdraw(double) = 0;
};

class SavAct : public Account {
   public:
      SavAct(string name, int accNo, double bal)
         : Account(name, accNo, "Savings", bal) {}

      void computeInterest(double rate, int time) {
         double interest = balance * (pow((1 + rate / 100), time) - 1);
         cout << "Compound Interest added: " << interest << endl;
         balance += interest;
      }

      void withdraw(double amount) {
         if (amount > balance) {
            cout << "Insufficient funds for withdrawal." << endl;
         } else {
            balance -= amount;
            cout << "Withdrawn: " << amount << endl;
         }
      }
};

class CurAct : public Account {
   const double MIN_BALANCE = 500.0;
   const double SERVICE_CHRG = 50.0;

   public:
      CurAct(string name, int accNo, double bal)
         : Account(name, accNo, "Current", bal) {}
      
      void checkMinimumBalance() {
         if (balance < MIN_BALANCE) {
            balance -= SERVICE_CHRG;
            cout << "Below minimum balance. Service charge of " << SERVICE_CHRG << " applied." << endl;
         }
      }

      void withdraw(double amount) {
         if (amount > balance) {
            cout << "Insufficient funds for withdrawal." << endl;
         } else {
            balance -= amount;
            cout << "Withdrawn: " << amount << endl;
            checkMinimumBalance();
         }
      }

      void issueCheque(double amount) {
         if (amount > balance) {
            cout << "Cheque cannot be issued. Insufficient balance." << endl;
         } else {
            balance -= amount;
            cout << "Cheque issued for amount: " << amount << endl;
            checkMinimumBalance();
         }
      }
};

int main() {
   SavAct sav("Alice", 4001, 1500);
   CurAct cur("Bob", 4511, 1000);

   cout << "\n--- Savings Account ---\n";
   sav.displayBalance();
   sav.deposit(500);
   sav.computeInterest(5.1, 4); // 5% rate for 2 years
   sav.withdraw(700);
   sav.displayBalance();

   cout << "\n--- Current Account ---\n";
   cur.displayBalance();
   cur.deposit(300);
   cur.issueCheque(200);   // Withdraw using cheque
   cur.withdraw(350);      // Regular withdrawal
   cur.displayBalance();

   return 0;
}
