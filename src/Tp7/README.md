# Multi-threading Exercises in Java 

   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/0_KUpV2JHrD_-ffajr.png)

## Overview

This repository contains two exercises related to multi-threading in Java. Each exercise demonstrates different concepts of concurrent programming, using threads and the `Runnable` interface to perform tasks concurrently.

### Exercise 1: Talkative Threads
In this exercise, we create multiple threads where each thread continuously prints a message indicating its "talkative" behavior. The goal of this exercise is to demonstrate how threads can be used to run multiple tasks concurrently, each performing a simple operation.

### Exercise 2: Sum Calculation Using Multiple Threads
In this exercise, the task is to calculate the sum of a range of numbers within an array, using multiple threads. Each thread is responsible for summing a portion of the array. This exercise helps to demonstrate how parallelization can be used to speed up computational tasks by splitting the work across multiple threads.

---

## Table of Contents
1. [Exercise 1: Talkative Threads](#exercise-1-talkative-threads)
   - [Objective](#objective)
   - [Code Structure](#code-structure)
   - [Execution and Output](#execution-and-output)
2. [Exercise 2: Sum Calculation Using Multiple Threads](#exercise-2-sum-calculation-using-multiple-threads)
   - [Objective](#objective-1)
   - [Code Structure](#code-structure-1)
   - [Execution and Output](#execution-and-output-1)
3. [Conclusion](#conclusion)

---

## Exercise 1: Talkative Threads

### Objective
The objective of this exercise is to create 10 threads, each of which prints a message indicating that it is "talking" (printing its ID and count). This demonstrates how threads can be created and managed in Java, as well as how to work with the `Runnable` interface.

### Code Structure

In this exercise, we have two main classes:

1. **`Talkactive`**:
    - Implements the `Runnable` interface and overrides the `run()` method.
    - Each instance of this class is assigned an `id`, which will be printed along with a count from 0 to 99.
      
   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/2.PNG)

2. **`App1`**:
    - The entry point of the program.
    - Creates 10 instances of `Talkactive` and wraps them in `Thread` objects.
    - Starts all threads concurrently using `start()`.
      
   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/1.PNG)

### Execution and Output
When the program is executed, it creates 10 threads, each printing a line that includes its `id` and a count from 0 to 99. The output will be interleaved, as all threads are running concurrently.

   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/output1.PNG)

  - Multithreading Behavior:
   The output suggests that there are multiple threads running in parallel, each printing its own ID and count.
   Each thread runs a loop, incrementing its count from 0 to 9 and printing it along with its ID.
  - Order of Output:
   The output is interleaved because threads are running concurrently. The operating system schedules the threads, and their execution order is unpredictable.
  - Summary of Thread Activity: 
    Thread : Runs its loop first, iterating from 0 to 9.
    Thread : Starts its loop after another Thread , completing its iterations.
    Thread : Runs last and completes its loop from 0 to 9.
   
---

## Exercise 2: Sum Calculation Using Multiple Threads

### Objective
The objective of this exercise is to calculate the sum of an array of integers (from 1 to 100) using multiple threads. The array is divided into parts, and each thread is responsible for summing a portion of the array. After all threads finish, the sums are combined to produce the total sum.

### Code Structure

In this exercise, we have two main classes:

1. **`Sommeur`**:
    - Implements the `Runnable` interface.
    - Each instance is assigned a range of indices (`debut` and `fin`) within the array and calculates the sum for that range.
      
   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/3.PNG)

2. **`App2`**:
    - The entry point of the program.
    - Creates an array of 100 integers.
    - Divides the array into 10 parts and creates 10 threads, each responsible for calculating the sum of one part.
    - After all threads finish, it sums the results from each thread to calculate the total sum.
      
   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/4.PNG)

### Execution and Output
When the program is executed, it creates 10 threads, each summing a portion of the array. The total sum of the array is calculated by combining the results from all threads.

   ![Screenshot Placeholder](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp7/screenshots/output2.PNG)

 -Why Is the Output 5050?
  The sum of integers from 1 to 100 can be calculated using the formula for the sum of an arithmetic series:
  This formula matches the program's output because:
  The array contains integers from 1 to 100.
  The threads collectively compute the sum of all elements in the array, ensuring no overlaps or missed indices.

  -Behind the Scenes:
   Thread Contributions: Each thread contributes a partial sum:
   Thread 0 (indices 0-9): Sum of 1-10 = 55
   Thread 1 (indices 10-19): Sum of 11-20 = 155
   ...
   Thread 9 (indices 90-99): Sum of 91-100 = 955

-Concurrency:
   All threads run concurrently, but the order of their execution is managed by the JVM and OS thread scheduler.
   The join() ensures that all threads finish before the main thread computes the final sum.

-Accuracy:
   The Sommeur objects are isolated and handle disjoint ranges of the array, avoiding race conditions.
   This ensures that the final sum is accurate.

---

## Conclusion
   Both exercises demonstrate key concepts in multi-threading using Java. Exercise 1 illustrates how multiple threads can be run concurrently to perform simple tasks. Exercise 2 shows how computational tasks can 
   be parallelized to improve efficiency by splitting the work across multiple threads.

These exercises provide a solid foundation for understanding multi-threading in Java, which is essential for writing efficient, concurrent programs.

---

### License
This repository is licensed under the MIT License. See the LICENSE file for more details.

---

### Acknowledgments
- Thanks to all contributors and the Java community for providing the resources and documentation used in this project.

