#include <stdio.h>

float celcius_at_depth(double);
float farenheit(double);

void main() {
   double depth, celcius, frhen;
   printf("Enter depth(in kilometers): ");
   scanf("%lf", &depth);
   celcius = celcius_at_depth(depth);
   frhen = farenheit(celcius);
   printf("Temperature at depth of %lf km is %lf℃ and %lf℉", depth, celcius, frhen);
}

double celcius_at_depth(double depth) {
   return 10 * depth + 20;
}

double farenheit(double celcius) {
   return 1.8 * celcius + 32;
}
