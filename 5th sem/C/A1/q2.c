#include <stdio.h>

#define avg_flush_litres 15
#define avg_flush_per_day 14
#define avg_flush_litres_new 2
#define new_toilet_cost 150
#define person_per_toielt 3

int main() {
   int population, num_toilets, total_cost, litres_saved;
   printf("Enter the population of the community: ");
   scanf("%d", &population);
   num_toilets = population / person_per_toielt;
   litres_saved = (num_toilets * avg_flush_per_day * avg_flush_litres) - (num_toilets * avg_flush_per_day * avg_flush_litres_new);
   total_cost = num_toilets * new_toilet_cost;
   printf("The community will save %d liters of water per day.\n", litres_saved);
   printf("The total cost to install new toilets is $%d.\n", total_cost);
   return 0;
}