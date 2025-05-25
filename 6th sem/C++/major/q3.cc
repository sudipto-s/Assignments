#include <iostream>
using namespace std;

const int MAX = 10;

class ShoppingList {
private:
   int count, code[MAX];
   float price[MAX];

public:
   ShoppingList(): count(0) {}

   void addItem(int itemCode, float itemPrice) {
      if (count < MAX) {
         code[count] = itemCode;
         price[count] = itemPrice;
         count++;
         cout << "Item added successfully.\n";
      } else
         cout << "List full! Cannot add more items.\n";
   }

   void deleteItem(int itemCode) {
      int i;
      for (i = 0; i < count; i++)
         if (code[i] == itemCode) {
            for (int j = i; j < count - 1; j++) {
               code[j] = code[j + 1];
               price[j] = price[j + 1];
            }
            count--;
            cout << "Item deleted successfully.\n";
            return;
         }
      cout << "Item not found!\n";
   }

   void displayItems() {
      cout << "--- Shopping List ---\n";
      for (int i = 0; i < count; i++)
         cout << "Code: " << code[i] << "  Price: Rs." << price[i] << endl;
   }

   void totalOrderValue() {
      float total = 0;
      for (int i = 0; i < count; i++)
         total += price[i];
      cout << "Total Order Value = Rs." << total << endl;
   }
};

int main() {
   ShoppingList shop;
   int choice, code;
   float price;

   do {
      cout << "\n1. Add Item\n2. Delete Item\n3. Print Total Value\n4. Display Items\n5. Exit\nEnter choice: ";
      cin >> choice;

      switch (choice) {
      case 1:
         cout << "Enter item code and price: ";
         cin >> code >> price;
         shop.addItem(code, price);
         break;

      case 2:
         cout << "Enter item code to delete: ";
         cin >> code;
         shop.deleteItem(code);
         break;

      case 3:
         shop.totalOrderValue();
         break;

      case 4:
         shop.displayItems();
         break;

      case 5:
         cout << "Exiting...\n";
         break;

      default:
         cout << "Invalid choice!\n";
      }

   } while (choice != 5);

   return 0;
}
