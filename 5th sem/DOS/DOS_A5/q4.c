#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

// Semaphores for synchronization
sem_t sem_A, sem_B;

// Function for Thread A (counts down from 10 to 1)
void* countdown(void* arg) {
   for (int i = 10; i >= 1; i--) {
      sem_wait(&sem_A); // Wait for permission to execute
      printf("Thread A (Countdown): %d\n", i);
      sem_post(&sem_B); // Signal Thread B to execute
   }
   pthread_exit(NULL);
}

// Function for Thread B (counts up from 1 to 10)
void* countup(void* arg) {
   for (int i = 1; i <= 10; i++) {
      sem_wait(&sem_B); // Wait for permission to execute
      printf("Thread B (Countup): %d\n", i);
      sem_post(&sem_A); // Signal Thread A to execute
   }
   pthread_exit(NULL);
}

int main() {
   // Initialize semaphores
   sem_init(&sem_A, 0, 1); // Thread A starts first
   sem_init(&sem_B, 0, 0); // Thread B starts blocked

   // Create threads
   pthread_t threadA, threadB;
   pthread_create(&threadA, NULL, countdown, NULL);
   pthread_create(&threadB, NULL, countup, NULL);

   // Wait for threads to finish
   pthread_join(threadA, NULL);
   pthread_join(threadB, NULL);

   // Destroy semaphores
   sem_destroy(&sem_A);
   sem_destroy(&sem_B);

   printf("Countdown and Countup program completed.\n");
   return 0;
}
