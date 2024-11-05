## TP3:Handling Exceptions 

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

This collection of exercises is designed to get familiar with exceptions in Java , it contains 3 exercices

## Overview
This project (TP3) is dedicated to understanding and implementing exception handling in Java. Exception handling is a crucial concept in programming that allows developers to manage errors gracefully, making applications more robust and reliable. In this TP, you will explore various scenarios where custom exceptions are used, how to throw exceptions under specific conditions, and how to catch and handle them effectively.

## Table of Contents

1. [Overview](#overview)
2. [Exercise 1: TropViteException](#exercise-1-Trop_vite_exception)
3. [Exercise 2: RacineCarreeException](#exercise-2-racine_carree_exceeption)
4. [Exercise 3: NoteInvalideExcepion](#exercise-3-note_invalide_exception)
7. [Installation](#installation)
8. [Usage](#usage)
9. [License](#license)



 
## Exercises

1. **Exercise 1: TropViteException**
   
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_110140249.png)
   
   - Purpose: 
     In this exercise, you create a custom exception named TropViteException, designed to handle scenarios where a speed limit is exceeded. This exercise introduces you to creating custom exceptions, setting 
     custom messages, and throwing exceptions based on specific conditions.
  
   - Code:
     
     1. **Class**:
         `TropViteException ` extends the Exception class, making it a checked exception.
     2. **Constructor**: Takes an integer parameter vitesse (speed) and passes a custom message to the superclass constructor, indicating the speed that caused the exception.
         
          ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_111012124.png)
        
     3.`Vehicule `is a car class where the usage of the exeception is as the following :
        
     4. **Usage**: The  `TropViteException ` is thrown in a method testVitesse() of the Vehicule class if the speed exceeds 90.

          ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/vehicule.PNG)

     5. **Main Application** :
        In the main method, the Vehicule class’s `testVitesse()` method is called with different speed values.
        If a speed exceeds 90, `TropViteException` is thrown, caught, and handled by displaying the message and stack trace.

          ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/mainnn.PNG)
     
    - Execution :
       
    
    
        
2. **Exercise 2: RacineCarreeException**

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/RacineCarree.PNG)
   
   - Description: A program that manages the RacineCarre Exception
     
    1. `RacineCarreeException` Class
    The RacineCarreeException class inherits from Exception and has a constructor that takes an integer and passes a custom error message to the superclass.

     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_114301392.png)

    3. `Calculateur` Class
    The Calculateur class has a method testRacineCarree() that throws a RacineCarreeException if the input integer is negative.

     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/calculator.PNG)
     
    Here’s how to implement the RacineCarreeException and Calculateur classes based on the instructions:

      - Explanation
      `RacineCarreeException` Class: This custom exception class is thrown when a negative number is passed to the testRacineCarree() method.
      The constructor takes an integer and constructs a message like: "C'est une exception de type RacineCarreeException. Nombre négatif : -5".
      Calculateur Class:
      The `testRacineCarree()` method checks if the input number is negative.
      If it’s negative, it throws a RacineCarreeException.
      If it’s positive, it calculates and prints the square root using Math.sqrt().
      `main` Method:
      Creates an instance of Calculateur and calls testRacineCarree() with -5 (which will trigger the exception) and 25 (which will calculate the square root).
      The try-catch block catches the exception and prints the stack trace for debugging.
 
3. **Exercise 3: NoteInvalideException**
   
    ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_115345062.png)
   
    The project consists of the following classes:
    `NoteInvalideException`:
    -This class extends the built-in Exception class.
    -It is used to signal that an invalid grade has been provided.
   
    ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_115715861.png)
   
    `Evaluateur`:
    This class does not contain attributes.
    It includes a method verifierNote(int note) that checks whether a grade is within the valid range (0 to 20).
    If the grade is invalid, it throws a NoteInvalideException.
   
    ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/Evaluateur.PNG)
    
  
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
