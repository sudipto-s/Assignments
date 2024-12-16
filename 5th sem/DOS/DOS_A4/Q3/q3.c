#include <stdio.h>
#include <unistd.h>
void main() {
   if(fork() == 0) {
      fprintf(stderr, "Child process: %d\tParent process: %d\n", getpid(), getppid());
      execl("/bin/cp", "cp", "file1", "file2", (char *)NULL);
   }
   sleep(1);
   if(fork() == 0) {
      fprintf(stderr, "Child process: %d\tParent process: %d\n", getpid(), getppid());
      execl("/bin/cat", "cat", "file2", (char *)NULL);
   }
   sleep(1);
   if(fork() == 0) {
      fprintf(stderr, "Child process: %d\tParent process: %d\n", getpid(), getppid());
      execl("/bin/sort", "sort", "-r", "file2", (char *)NULL);
   }
   sleep(1);
   fprintf(stderr, "Parent process: %d\n", getpid());
}