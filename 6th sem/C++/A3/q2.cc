#include <iostream>
using namespace std;

class Book {
   string author;
   string title;
   float price;
   string publisher;

   public:
      Book(string a = "", string b = "", float c = 0.0, string d = ""):
         author(a), title(b), price(c), publisher(d) {}

      void display() {
         cout << author << '\n' << title << endl;
         cout << "Price: " << price << endl;
         cout << "Publisher: " << publisher << endl;
      }

      int matchIt(string t, string a) {
         return (t == title && a == author);
      }

      void inputBookDetails() {
         cout << "Enter author: ";
         getline(cin, author);
         cout << "Enter title: ";
         getline(cin, title);
         cout << "Enter publisher: ";
         getline(cin, publisher);
         cout << "Enter price: ";
         cin >> price;
         cin.ignore();
     }
};

int main() {
   int inventorySize = 2;
   Book inventory[inventorySize];

   cout << "Enter details: ";
   for (int i = 0; i < inventorySize; ++i) {
      cout << "Book " << i + 1 << ":\n";
      inventory[i].inputBookDetails();
   }

   string title, author;
   cout << "Search title: ";
   getline(cin, title);
   cout << "Search author name: ";
   getline(cin, author);

   for (int i = 0; i < inventorySize; i++)
      if (inventory[i].matchIt(title, author)) {
         inventory[i].display();
         return 0;
      }

   cout << "No match found!";
   
   return 0;
}