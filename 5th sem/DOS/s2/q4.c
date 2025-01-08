#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <semaphore.h>

sem_t sem_a, sem_b, sem_c;
int c = 1;

void* print_A() {
   while(c <= 20) {
      sem_wait(&sem_a);
      if(c <= 20)
         printf("A%d\n", c++);
      sem_post(&sem_c);
   }
   pthread_exit(NULL);
}

void* print_B() {
   while(c <= 20) {
      sem_wait(&sem_b);
      if(c <= 20)
         printf("B%d\n", c++);
      sem_post(&sem_a);
   }
   pthread_exit(NULL);
}

void* print_C() {
   while(c <= 20) {
      sem_wait(&sem_c);
      if(c <= 20)
         printf("C%d\n", c++);
      sem_post(&sem_b);
   }
   pthread_exit(NULL);
}

void main() {
   sem_init(&sem_a, 0, 0);
   sem_init(&sem_b, 0, 0);
   sem_init(&sem_c, 0, 1);

   pthread_t tA, tB, tC;
   pthread_create(&tA, NULL, print_A, NULL);
   pthread_create(&tB, NULL, print_B, NULL);
   pthread_create(&tC, NULL, print_C, NULL);

   pthread_join(tA, NULL);
   pthread_join(tB, NULL);
   pthread_join(tC, NULL);

   sem_destroy(&sem_a);
   sem_destroy(&sem_b);
   sem_destroy(&sem_c);
}