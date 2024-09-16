#include <stdio.h>

int main() {
   double takeoff_speed, distance, acceleration, time;
   printf("Enter the jet's takeoff speed in km/hr: ");
   scanf("%lf", &takeoff_speed);
   printf("Enter the distance (meters) over which the catapult accelerates the jet from rest to takeoff: ");
   scanf("%lf", &distance);
   takeoff_speed = takeoff_speed * 1000 / 3600; // convert km/h to m/s
   acceleration = (takeoff_speed * takeoff_speed) / ( 2 * distance); // calculate acceleration
   time = takeoff_speed / acceleration; // calculate time
   printf("The acceleration of the jet is: %.2f m/s^2\n", acceleration);
   printf("The time for the fighter to be accelerated to takeoff speed is: %.2f", time);
   retun 0;
}