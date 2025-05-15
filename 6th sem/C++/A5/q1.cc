#include <iostream>
using namespace std;

class Staff {
   protected:
      int code;
      string name;

   public:
      Staff(int c, string n) : code(c), name(n) {}
      virtual void display() {
         cout << "Code: " << code << ", Name: " << name << endl;
      }
};

class Teacher : public Staff {
   string subject, publication;

   public:
      Teacher(int c, string n, string subj, string pub)
         : Staff(c, n), subject(subj), publication(pub) {}

      void display() override {
         Staff::display();
         cout << "Subject: " << subject << ", Publication: " << publication << endl;
      }
};

class Officer : public Staff {
   char grade;

   public:
      Officer(int c, string n, char g) : Staff(c, n), grade(g) {}

      void display() override {
         Staff::display();
         cout << "Grade: " << grade << endl;
      }
};

class Typist : public Staff {
   protected:
      int speed;

   public:
      Typist(int c, string n, int s) : Staff(c, n), speed(s) {}
      void display() override {
         Staff::display();
         cout << "Typing Speed: " << speed << " wpm" << endl;
      }
};

class Regular : public Typist {
   public:
      Regular(int c, string n, int s) : Typist(c, n, s) {}

      void display() override {
         Typist::display();
      }
};

class Casual : public Typist {
   float dailyWages;

   public:
      Casual(int c, string n, int s, float wage)
         : Typist(c, n, s), dailyWages(wage) {}

      void display() override {
         Typist::display();
         cout << "Daily Wages: $" << dailyWages << endl;
      }
};

int main() {
   Teacher t(101, "Alice", "Mathematics", "Pearson");
   Officer o(102, "Bob", 'A');
   Regular r(103, "Charlie", 50);
   Casual c(104, "Daisy", 40, 75.5);

   cout << "Teacher Info:\n";
   t.display();
   cout << "\nOfficer Info:\n";
   o.display();
   cout << "\nRegular Typist Info:\n";
   r.display();
   cout << "\nCasual Typist Info:\n";
   c.display();

   return 0;
}
