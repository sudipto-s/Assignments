#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
void main() {
   pid_t c1 = fork();
   if(c1 == 0) {
      fprintf(stderr, "Child process: %d\n", getpid());
      while(1);
   } else {
      fprintf(stderr, "Parent process: %d\n", getpid());
      wait(NULL);
      while(1);
   }
}