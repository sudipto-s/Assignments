#include <stdio.h>
#include <unistd.h>

int main() { 
   pid_t pid; 
   int i=5; 
   pid=vfork(); 
   if(pid==0) 
   { 
      printf("Child: %d",i); 
      _exit(0); 
   } 
   else 
   { 
      i=i+1; 
      printf("Parent: %d",i); 
   } 
   return 0; 
}
