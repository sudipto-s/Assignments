#include <stdio.h>

#define gravity 9.8
#define efficiency 0.9
#define water_density 1000
#define wt_to_mgw 1e6

void main() {
   double height, flow, work_done, pw_output;
   printf("Enter height of the dam: ");
   scanf("%lf", &height);
   printf("Number of cubic meters of water: ");
   scanf("%lf", &flow);

   work_done = water_density * flow * gravity * height;
   pw_output = (efficiency * work_done) / wt_to_mgw;

   printf("Power prodeced: %lfMW", pw_output);
}