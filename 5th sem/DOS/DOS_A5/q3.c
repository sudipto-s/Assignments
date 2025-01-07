#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

// Semaphores for synchronization
sem_t sem_A, sem_B;

// Function for thread A (prints 'A')
void* print_A(void* arg) {
   for (int i = 0; i < 10; i++) { // Print 10 'A's
      sem_wait(&sem_A); // Wait for permission to print
      printf("A");
      fflush(stdout); // Ensure immediate output
      sem_post(&sem_B); // Signal Thread B to print
   }
   pthread_exit(NULL);
}

// Function for thread B (prints 'B')
void* print_B(void* arg) {
   for (int i = 0; i < 10; i++) { // Print 10 'B's
      sem_wait(&sem_B); // Wait for permission to print
      printf("B");
      fflush(stdout); // Ensure immediate output
      sem_post(&sem_A); // Signal Thread A to print
   }
   pthread_exit(NULL);
}

int main() {
   // Initialize semaphores
   sem_init(&sem_A, 0, 1); // Start with Thread A
   sem_init(&sem_B, 0, 0); // Thread B starts blocked

   // Create threads
   pthread_t threadA, threadB;
   pthread_create(&threadA, NULL, print_A, NULL);
   pthread_create(&threadB, NULL, print_B, NULL);

   // Wait for threads to finish
   pthread_join(threadA, NULL);
   pthread_join(threadB, NULL);

   // Destroy semaphores
   sem_destroy(&sem_A);
   sem_destroy(&sem_B);

   printf("\nAlternating Characters program completed.\n");
   return 0;
}
