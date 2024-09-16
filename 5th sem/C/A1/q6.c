#include <stdio.h>

float celcius_at_depth(float);
float farenheit(float);

void main() {
   float depth;
   printf("Enter depth(in kilometers): ");
   scanf("%f", &depth);
   float celcius = celcius_at_depth(depth);
   float frhen = farenheit(celcius);
   printf("Temperature at depth of %.2f km is %.2f℃ and %.2f℉", depth, celcius, frhen);
}

float celcius_at_depth(float depth) {
   return 10 * depth + 20;
}

float farenheit(float celcius) {
   return 1.8 * celcius + 32;
}