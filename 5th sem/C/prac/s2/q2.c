#include <stdio.h>
#include <stdlib.h>

#define TAX 7.00

int main() {
   int projCompleted, identiNum, counter=0;
   double projRate, gross, net, total=0.0, avg=0.0;

   while(1) {
      printf("\nEnter the Identification Number of the Employee: (Enter 0 to Terminate)");
      scanf("%d", &identiNum);

      if(identiNum==0)
         break;
      printf("\nEnter Number Of Projects Completed:");
      scanf("%d", &projCompleted);
      printf("\nEnter Fixed Project Rate:");
      scanf("%lf", &projRate);
      
      if(projCompleted<=5)
         gross=projRate*projCompleted;
      else
         gross=(5*projRate)+(projCompleted-5)*(1.2*projRate);
      total+=gross;
      net=gross-0.07*gross;
      
      printf("\nIdentification Number: %d", identiNum);
      printf("\nNet Pay: %.2lf", net);
      counter++;
   }
   
   avg=total/counter;
   printf("\nGross Pay by Company: $%lf", total);
   printf("\nAverage Pay by Company: $%lf/freelancer", avg);
}