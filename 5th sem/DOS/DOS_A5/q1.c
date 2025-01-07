#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

// Constants
#define BUFFER_SIZE 10
#define ITERATIONS 20

// Shared buffer and synchronization primitives
int buffer[BUFFER_SIZE];
int in = 0, out = 0;
sem_t empty_slots, full_slots;
pthread_mutex_t mutex;

// Producer function
void* producer(void* arg) {
   for (int i = 1; i <= ITERATIONS; i++) {
      // Wait for an empty slot
      sem_wait(&empty_slots);
      // Lock the buffer
      pthread_mutex_lock(&mutex);

      // Produce item
      buffer[in] = i;
      printf("Producer produced: %d\n", buffer[in]);
      in = (in + 1) % BUFFER_SIZE;

      // Unlock the buffer
      pthread_mutex_unlock(&mutex);
      // Signal that a new item is available
      sem_post(&full_slots);

      // Simulate production time
      usleep(100000);
   }
   pthread_exit(NULL);
}

// Consumer function
void* consumer(void* arg) {
   for (int i = 1; i <= ITERATIONS; i++) {
      // Wait for an available item
      sem_wait(&full_slots);
      // Lock the buffer
      pthread_mutex_lock(&mutex);

      // Consume item
      int item = buffer[out];
      printf("Consumer consumed: %d\n", item);
      out = (out + 1) % BUFFER_SIZE;

      // Unlock the buffer
      pthread_mutex_unlock(&mutex);
      // Signal that a slot is now empty
      sem_post(&empty_slots);

      // Simulate consumption time
      usleep(150000);
   }
   pthread_exit(NULL);
}

int main() {
   // Initialize semaphores and mutex
   sem_init(&empty_slots, 0, BUFFER_SIZE);
   sem_init(&full_slots, 0, 0);
   pthread_mutex_init(&mutex, NULL);

   // Create producer and consumer threads
   pthread_t producer_thread, consumer_thread;
   pthread_create(&producer_thread, NULL, producer, NULL);
   pthread_create(&consumer_thread, NULL, consumer, NULL);

   // Wait for threads to finish
   pthread_join(producer_thread, NULL);
   pthread_join(consumer_thread, NULL);

   // Destroy semaphores and mutex
   sem_destroy(&empty_slots);
   sem_destroy(&full_slots);
   pthread_mutex_destroy(&mutex);

   printf("Producer-Consumer program completed.\n");
   return 0;
}