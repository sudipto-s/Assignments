#include <stdio.h>
#include <math.h>

double acce(double, double, double);
double rest_time(double, double);

void main() {
   double init_speed, final_speed, acceleration, time_rest, time;
   printf("Enter initial speed(in mi/hr): ");
   scanf("%lf", &init_speed);
   printf("Enter final speed(in mi/hr): ");
   scanf("%lf", &final_speed);
   printf("Enter time(in min): ");
   scanf("%lf", &time);
   init_speed *= .447;
   final_speed *= .447;
   time /= 60;
   acceleration = acce(init_speed, final_speed, time);
   printf("Constant rate of acceleration: %lf m/s\n", acceleration);
   time_rest = rest_time(init_speed, acceleration);
   printf("Time taken to come to rest: %lf min", time_rest);
}

double acce(double init, double final, double time) {
   return (final - init)/time;
}
double rest_time(double init, double acc) {
   return (-init / acc)*60;
}