#include <stdio.h>

#define MAX 100

typedef struct {
   int atomic_number;
   char name[MAX];
   char symbol[MAX];
   char element_class[MAX];
   float weight;
   int electrons[7];
} element_t;

void scan_element(element_t *elem) {
   int i;
   printf("Enter atomic number: ");
   scanf("%d", &elem->atomic_number);
   printf("Enter element name: ");
   scanf(" %[^\n]s", elem->name);
   printf("Enter element symbol: ");
   scanf(" %[^\n]s", elem->symbol);
   printf("Enter element class: ");
   scanf(" %[^\n]s", elem->element_class);
   printf("Enter element weight: ");
   scanf("%f", &elem->weight);
   printf("Enter electrons in each shell(space separated): ");
   for (i = 0; i < 7; i++)
      scanf(" %d", &elem->electrons[i]);
}

void print_element(element_t *elem) {
   int i;
   printf("\nAtomic Number: %d\n", elem->atomic_number);
   printf("Element Name: %s\n", elem->name);
   printf("Element Symbol: %s\n", elem->symbol);
   printf("Element Weight: %f\n", elem->weight);
   printf("Element Class: %s\n", elem->element_class);
   printf("Electrons in each shell:\n");
   for (i = 0; i < 7; i++)
      printf("Shell %d: %d\n", i+1, elem->electrons[i]);
}

void main() {
   element_t elem;
   scan_element(&elem);
   print_element(&elem);
}