#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

// Semaphores for synchronization
sem_t sem_A, sem_B, sem_C;

// Shared variable to keep track of the current number
int current_number = 1;

// Function for Thread A
void* thread_A(void* arg) {
   while (current_number <= 20) {
      sem_wait(&sem_A); // Wait for Thread A's turn
      if (current_number <= 20) {
         printf("A%d\n", current_number);
         current_number++;
      }
      sem_post(&sem_B); // Signal Thread B to execute
   }
   pthread_exit(NULL);
}

// Function for Thread B
void* thread_B(void* arg) {
   while (current_number <= 20) {
      sem_wait(&sem_B); // Wait for Thread B's turn
      if (current_number <= 20) {
         printf("B%d\n", current_number);
         current_number++;
      }
      sem_post(&sem_C); // Signal Thread C to execute
   }
   pthread_exit(NULL);
}

// Function for Thread C
void* thread_C(void* arg) {
   while (current_number <= 20) {
      sem_wait(&sem_C); // Wait for Thread C's turn
      if (current_number <= 20) {
         printf("C%d\n", current_number);
         current_number++;
      }
      sem_post(&sem_A); // Signal Thread A to execute
   }
   pthread_exit(NULL);
}

int main() {
   // Initialize semaphores
   sem_init(&sem_A, 0, 1); // Thread A starts first
   sem_init(&sem_B, 0, 0); // Thread B starts blocked
   sem_init(&sem_C, 0, 0); // Thread C starts blocked

   // Create threads
   pthread_t threadA, threadB, threadC;
   pthread_create(&threadA, NULL, thread_A, NULL);
   pthread_create(&threadB, NULL, thread_B, NULL);
   pthread_create(&threadC, NULL, thread_C, NULL);

   // Wait for threads to finish
   pthread_join(threadA, NULL);
   pthread_join(threadB, NULL);
   pthread_join(threadC, NULL);

   // Destroy semaphores
   sem_destroy(&sem_A);
   sem_destroy(&sem_B);
   sem_destroy(&sem_C);

   printf("Sequence printing program completed.\n");
   return 0;
}
