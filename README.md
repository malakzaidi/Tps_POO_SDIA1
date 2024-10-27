# Tps_POO_SDIA1
This repository contains a series of Java exercises designed for the Master’s degree program in Artificial Intelligence and Distributed Systems, specifically for the first semester. The exercises adhere to Java Standard practices and cover fundamental concepts essential for building a solid foundation in Java programming.
# Java Exercises Project

## Overview

This project is a collection of exercises designed to enhance understanding and practical skills in Java programming. Each exercise addresses a specific concept or problem, providing a hands-on approach to learning Java. The exercises cover various topics, including data structures, algorithms, object-oriented programming, and more.

## Table of Contents

- [Overview](#overview)
- [TP1](#tp1)
- [TP1's Exercises](#tp1'sexercises)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## TP1:Tables and strings 
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/image_2024-10-27_043038262.png?raw=true)

This collection of exercises is designed to get familiar with Java and be able to manipulate tables and strings, it contains 4 exercices
 
## Exercises

1. **Exercise 1: Managing Student Grades**
   
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/image_2024-10-27_111933283.png?raw=true)
   
   - Description: A program to manage and analyze student grades, including sorting, calculating averages, and counting occurrences of specific grades.
   - Key Methods:
     - `trierNotes()`: Sorts the list of grades.
     - `moyenne()`: Calculates the average grade.
     - `noteminimale()`: Finds the minimum grade.
     - `notemaximale()`: Finds the maximum grade.
     - `compterEtudiants(double note)`: Counts the number of students with a specific grade.
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/image_2024-10-27_122132950.png?raw=true)

   -Explanation 
    - Imports:
      - `java.util.Arrays`: Provides utility functions for working with arrays, specifically sort() to sort grades in ascending order.
      - `java.util.Scanner`: Allows capturing user input for student grades.
    - Attributes:
      - `notes`: A double array to store each student's grade.
    - Constructor:
   Initializes the notes array with user-specified grades, using a loop to request each grade.
   The Scanner instance is used for input and closed after the input is complete to avoid resource leaks.
   - Methods:
      -  `trierNotes()`: Sorts the notes array in ascending order.
      -  `moyenne()`: Calculates and returns the average grade by summing all grades and dividing by the number of grades.
      -  `noteminimale()`: Returns the lowest grade, assuming the array is sorted.
      -  `notemaximale()`: Returns the highest grade, assuming the array is sorted.
      -  `compterEtudiants(double noteSaisie)`: Counts how many students received a specific grade by looping through the array and incrementing a counter each time the grade matches noteSaisie.

2. **Exercise 2: Verb Conjugation**

   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/tp1ex2.PNG?raw=true)
   
   - Description: A program to conjugate verbs from the first group in French.
   - Key Method:
      - `conjuguer()`: Conjugates the given verb according to French grammar rules.
   ![image_alt]( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/tp1exo2.PNG?raw=true)

   -Explanation 
     - Attributes:
       - `verbe`: A private String attribute that stores the verb to be conjugated.
     - Constructor:
       - `Exercice2(String verbe)`: Initializes the verbe attribute with the verb provided by the user.
     - Methods:
       - `estVerbePremierGroupe()`: Checks if the verb belongs to the first group (i.e., if it ends with "er" and has more than two characters).
       Returns true if the verb is valid, allowing conjugation in the first group.
       - `conjuguer()`: Conjugates the verb in the present tense.
   It first verifies if the verb belongs to the first group by calling estVerbePremierGroupe().
   If valid, it extracts the root by removing "er" from the verb and adds the appropriate endings for each subject pronoun ("e," "es," "e," etc.).
   If the verb is invalid, it displays a message indicating the verb is not first-group.         
 
3. **Exercise 3: String Operations**

    ![image_alt]( ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/tp1ex2.PNG?raw=true)
   
   - Description: Various operations on strings, such as reversal, counting characters, and more.
   - Key Method:
     - `menu()`: Displays the options for string operations and processes user input.

4. **Exercise 4: Letter Occurrences**
   - Description: A program to count occurrences of each letter in a given text.
   - Key Method:
     - `compterOccurrences()`: Analyzes the input text and counts the frequency of each letter.

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
2. Navigate to the project directory
   cd Tps_POO_SDIA1
3. Open the project in IntelliJ IDEA or your preferred Java IDE.
## Usage
-Run the Main class to access the menu of exercises.
-Follow the prompts to select an exercise and provide any necessary input.
## Contributing
-Contributions are welcome! If you have suggestions for improvements or additional exercises, feel free to create a pull request or open an issue.
## License
This project is licensed under the MIT License - see the LICENSE file for details.

   
