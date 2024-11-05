# TP3: Handling Exceptions

This project (TP3) is dedicated to understanding and implementing exception handling in Java. Exception handling is a crucial concept in programming that allows developers to manage errors gracefully, making applications more robust and reliable. In this TP, you will explore various scenarios where custom exceptions are used, how to throw exceptions under specific conditions, and how to catch and handle them effectively.

## Table of Contents

1. [Overview](#overview)
2. [Exercise 1: TropViteException](#exercise-1-tropviteexception)
3. [Exercise 2: RacineCarreeException](#exercise-2-racinecarreeexception)
4. [Exercise 3: NoteInvalideException](#exercise-3-noteinvalideexception)
5. [Installation](#installation)
6. [Usage](#usage)
7. [Contributing](#contributing)
8. [License](#license)

## Overview

This collection of exercises is designed to get familiar with exceptions in Java, containing three exercises:

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

## Exercises

### Exercise 1: TropViteException

- **Purpose**: In this exercise, you create a custom exception named `TropViteException`, designed to handle scenarios where a speed limit is exceeded. This introduces you to creating custom exceptions, setting custom messages, and throwing exceptions based on specific conditions.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_110140249.png)

- **Code**:
  1. **Class**: `TropViteException` extends the Exception class, making it a checked exception.
  2. **Constructor**: Takes an integer parameter `vitesse` (speed) and passes a custom message to the superclass constructor, indicating the speed that caused the exception.
     
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/exception.PNG)

  3. **`Vehicule` Class**: This is where the exception is used. The `testVitesse()` method in this class throws a `TropViteException` if the speed exceeds 90.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/vehicule.PNG)

  4. **Main Application**: In the main method, `Vehicule`'s `testVitesse()` is called with different speed values. If a speed exceeds 90, `TropViteException` is thrown, caught, and handled by displaying the message and stack trace.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/mainnn.PNG)

- **Execution**: Running the main application with an exceeded speed (like 120) triggers `TropViteException`, printing the exception message and stack trace.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/exec1.PNG)

---

### Exercise 2: RacineCarreeException

- **Purpose**: This exercise focuses on handling cases where square root calculation encounters a negative number, throwing a custom exception `RacineCarreeException`.

  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/RacineCarree.PNG)

1. **`RacineCarreeException` Class**: Extends `Exception` and has a constructor that takes an integer, passing a custom error message to the superclass.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_114301392.png)

2. **`Calculateur` Class**: This class has a method `testRacineCarree()` that throws `RacineCarreeException` if the input integer is negative.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/calculateur.PNG)

- **Explanation**: 
  - The `RacineCarreeException` is thrown when a negative number is passed to `testRacineCarree()`, with a message like: `"C'est une exception de type RacineCarreeException. Nombre négatif : -5"`.
  - If the input is positive, it calculates and prints the square root.

3. **Main Method**: Creates an instance of `Calculateur`, applying `testRacineCarree()` with -5 (triggers exception) and 25 (calculates square root). A try-catch block handles and prints the exception details.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/mainex2.PNG)

- **Execution**: Running the main application with -5 results in `RacineCarreeException`, displaying the message and stack trace.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/exec2.PNG)

---

### Exercise 3: NoteInvalideException

- **Purpose**: This exercise involves handling invalid grades using a custom exception `NoteInvalideException`.

  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_115345062.png)

1. **`NoteInvalideException` Class**: Extends `Exception` and is used to indicate that an invalid grade has been provided.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_115715861.png)

2. **`Evaluateur` Class**: Contains a method `verifierNote(int note)` to check if a grade is within 0 to 20. If not, it throws `NoteInvalideException`.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/evaaa.PNG)

3. **Main Method**: Uses `Evaluateur` to apply `verifierNote` on two values—one valid and one invalid (25), where the exception is caught and handled by printing the stack trace.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/mainex3.PNG)

- **Execution**: Running the main application with an invalid grade (25) results in `NoteInvalideException`, displaying the exception message and stack trace.

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/exec3.PNG)

---

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
2. Navigate to the project directory
     cd Tps_POO_SDIA1/TP
3. Open the project in IntelliJ IDEA or your preferred Java IDE.
## Usage
- Run the Main class to access the menu of exercises.
- Follow the prompts to select an exercise and provide any necessary input.
## Contributing
-Contributions are welcome! If you have suggestions for improvements or additional exercises, feel free to create a pull request or open an issue.
