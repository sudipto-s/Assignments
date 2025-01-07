#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

// Semaphores for synchronization
sem_t sem_odd, sem_even;

// Function for thread A (prints odd numbers)
void* print_odd(void* arg) {
   for (int i = 1; i <= 19; i += 2) {
      sem_wait(&sem_odd); // Wait for permission to print
      printf("Thread A (Odd): %d\n", i);
      sem_post(&sem_even); // Signal Thread B to print
   }
   pthread_exit(NULL);
}

// Function for thread B (prints even numbers)
void* print_even(void* arg) {
   for (int i = 2; i <= 20; i += 2) {
      sem_wait(&sem_even); // Wait for permission to print
      printf("Thread B (Even): %d\n", i);
      sem_post(&sem_odd); // Signal Thread A to print
   }
   pthread_exit(NULL);
}

int main() {
   // Initialize semaphores
   sem_init(&sem_odd, 0, 1);  // Start with odd numbers
   sem_init(&sem_even, 0, 0); // Even thread starts blocked

   // Create threads
   pthread_t threadA, threadB;
   pthread_create(&threadA, NULL, print_odd, NULL);
   pthread_create(&threadB, NULL, print_even, NULL);

   // Wait for threads to finish
   pthread_join(threadA, NULL);
   pthread_join(threadB, NULL);

   // Destroy semaphores
   sem_destroy(&sem_odd);
   sem_destroy(&sem_even);

   printf("Alternating Numbers program completed.\n");
   return 0;
} 
