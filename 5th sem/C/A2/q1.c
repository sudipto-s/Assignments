# include <stdio.h>

void main() {
   double heading;
   printf("Enter the compass heading(0 - 360): ");
   scanf("%lf", &heading);

   if(heading >= 0 && heading < 90)
      printf("The bearing is North %lf degrees West.\n", heading);
   else if(heading >= 90 && heading < 180)
      printf("The bearing is South %lf degrees East.\n", 180 - heading);
   else if(heading >= 180 && heading < 270)
      printf("The bearing is South %lf degrees West.\n", heading - 180);
   else if(heading >= 270 && heading <= 360)
      printf("The bearing is North %lf degrees East.\n", 360 - heading);
   else
      printf("Entered heading is out of range.\n");
}