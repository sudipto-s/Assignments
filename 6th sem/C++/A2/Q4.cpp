/* CREDIT: AT */

#include <iostream>
#include <cmath>
using namespace std;
class Distance{
   private:
      int km,m;
      double cm;
   public:
      void input_distance(int km, int m, double cm){
         this->km = km;
         this->m=m;
         this->cm=cm;
      }
      void display(){
         cout<<"Distance in km: "<<km<<endl;
         cout<<"Distance in m: "<<m<<endl;
         cout<<"Distance in cm: "<<cm<<endl;
      }
      Distance add_distance(Distance d1, Distance d2){
         Distance temp;
         temp.km = d1.km + d2.km;
         temp.m = d1.m + d2.m;
         if(temp.m>1000){
               temp.m=temp.m/1000;
               temp.km+=temp.m%1000;
         }
         temp.cm = d1.cm + d2.cm;
         if(temp.cm>100){
               temp.cm=temp.cm/100;
               temp.m=temp.m+ int(temp.cm) % 100;
         }
         return temp;
      }
};
int main(){
   int n,x,y;
   cout<<"Enter Number of Distances: ";
   cin>>n;
   Distance d[100];
   for(int i=0;i<n;i++) {
      cout<<"Enter Distance "<<i+1<<": "<<endl;
      int km,m;
      double cm;
      cout<<"Enter KM: ";
      cin>>km;
      cout<<"Enter M: ";
      cin>>m;
      cout<<"Enter CM: ";
      cin>>cm;
      d[i].input_distance(km,m,cm);
   }
   cout<<"Enter the Two Indices of Distances to be Added: "<<endl;
   cout<<"Index 1:"<<endl;
   cin>>x;
   cout<<"Index 2:"<<endl;
   cin>>y;
   Distance res;
   res=res.add_distance(d[x],d[y]);
   res.display();
}