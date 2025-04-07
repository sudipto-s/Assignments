/* CREDIT: AT */

#include <iostream>
using namespace std;
class DB;
class DM{
   int m;
   double cm;
   public:
      void input(){
         cout<<"Enter distance in meter-centimeter: ";
         cin>>m>>cm;
      }
      void show(){
         cout<<"Distance is: "<<m<<"m "<<cm<<"cm"<<endl;
      }
      int getM(){
         return m;
      }
      double getCM(){
         return cm;
      }
   friend DM add(DM,DB);
};
class DB{
   int ft;
   double in;
   public:
      DB() {
         ft=0;
         in=0;
      }
      DB(DM dm) {
         double temp;
         temp=(dm.getM()*100+dm.getCM())*0.3937;
         ft=temp/12;
         in=temp-(ft*12);
      }
      void input() {
         cout<<"Enter distance in feet-inch: ";
         cin>>ft>>in;
      }
      void show() {
         cout<<"Distance is: "<<ft<<"ft "<<in<<"in"<<endl;
      }
      friend DM add(DM,DB);
};

DM add(DM MeterCenti, DB FeetInch){
   DM temp;
   double cm,in,compCM;
   cm=MeterCenti.getM()*100+MeterCenti.getCM();
   in=FeetInch.ft*12+FeetInch.in;

   compCM=cm+in*2.54;
   temp.m=compCM/100;
   temp.cm=compCM-(temp.m*100);
   return temp;
}
int main() {
   DM a;
   DB b;
   a.input();
   b.input();
   cout<<"After adding : ";
   DM c;
   DB d;
   c = add(a,b);
   d = add(a,b);
   c.show();
   d.show();
   return 0;
}