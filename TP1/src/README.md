## TP1: Tables and strings 

This collection of exercises is designed to get familiar with Java and be able to manipulate tables and strings, it contains 4 exercises.

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_043038262.png?raw=true)

## Overview

This project is a collection of exercises designed to enhance understanding and practical skills in Java programming. Each exercise addresses a specific concept or problem, providing a hands-on approach to learning Java. The exercises cover various topics, including data structures, algorithms, object-oriented programming, and more.

## Table of Contents

- [Overview](#overview)
- [Exercises](#exercises)
  - [Exercise 1: Managing Student Grades](#exercise-1-managing-student-grades)
  - [Exercise 2: Verb Conjugation](#exercise-2-verb-conjugation)
  - [Exercise 3: String Operations](#exercise-3-string-operations)
  - [Exercise 4: Letter Occurrences](#exercise-4-letter-occurrences)
- [Main](#main)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Exercises

### Exercise 1: Managing Student Grades
   - Description: A program to manage and analyze student grades, including sorting, calculating averages, and counting occurrences of specific grades.
     
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_111933283.png?raw=true)
    
   - Key Methods:
     - `trierNotes()`: Sorts the list of grades.
     - `moyenne()`: Calculates the average grade.
     - `noteminimale()`: Finds the minimum grade.
     - `notemaximale()`: Finds the maximum grade.
     - `compterEtudiants(double note)`: Counts the number of students with a specific grade.
   - Code:
   - Explanation 
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
     This Java code defines a class `Exercice1` that handles various operations on a set of student grades. Here's a breakdown of each part:
     1. **Attributes and Initialization**:
       The `notes` attribute is an array to store student grades. The constructor `Exercice1` takes the number of students (`numEtudiants`) as a parameter and initializes the `notes` array to that size. It then 
       prompts the user to enter a grade for each student, storing each entry in the array. The `Scanner` used for input is closed after all entries to free resources.
     2. **Sorting Grades**:
        The `trierNotes` method sorts the `notes` array in ascending order using `Arrays.sort()`. This allows easier access to the minimum and maximum values.
     3. **Calculating the Average Grade**:
        The `moyenne` method calculates the average grade by summing all values in `notes` and dividing by the number of entries. It then returns this average.
     4. **Finding the Minimum and Maximum Grades**:
        - `noteminimale`: Returns the first element in the `notes` array, which is the smallest value if the array is sorted.
        - `notemaximale`: Returns the last element in the `notes` array, which is the largest value if the array is sorted.
     5. **Counting Students with a Specific Grade**:
        The `compterEtudiants` method counts how many students have a particular grade (`noteSaisie`). It loops through the `notes` array, increments a counter each time a grade matches `noteSaisie`, and then 
        returns this count.
        In summary, `Exercice1` allows users to enter and manage student grades, providing functionality to sort, average, find min/max grades, and count occurrences of a specific grade.
       
        ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_122132950.png?raw=true)

     - Usage in main, check it:
       [Main](#main)
  
        
### Exercise 2: Verb Conjugation
   - Description: A program to conjugate verbs from the first group in French.
   - Key Method:
      - `conjuguer()`: Conjugates the given verb according to French grammar rules.

     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/tp1ex2.PNG?raw=true)
   
   - Code:
     - Explanation 
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
     
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/tp1exo2.PNG?raw=true)
     
     - Usage in main, check it:
       [Main](#main)
          
 
### Exercise 3: String Operations
   - Description: Various operations on strings, such as reversal, counting characters, and more.
   - Key Method:
     - `menu()`: Displays the options for string operations and processes user input.

     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/tp1ex3.PNG?raw=true)

   - Code:
       - Explanation 
      - Attributes:
        - `chaine`: Stores the string entered by the user.
      - Methods:
        - `saisir()`: Prompts the user to enter a string, which is then stored in the chaine attribute.
        - `afficher()`: Displays the stored string to the console.
        - `inverser()`: Reverses the stored string using StringBuilder and displays the reversed version.
        - `compterMots()`: Counts the words in the string. It trims any extra spaces and splits the string by spaces, then prints the word count.
        - `menu()`: Shows a menu for the user to perform various operations on the string. It uses a do-while loop to keep showing the menu until the user chooses to quit by entering 0.
      Each option in the menu() corresponds to a method, allowing the user to input, view, reverse, or count words in the string as needed. This structure provides interactive control
      to manage the chaine string in multiple ways.
   
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/tp1exo3.PNG?raw=true)
   
     - Usage in main, check it:
       [Main](#main)
    
 
### Exercise 4: Letter Occurrences
   - Description: A program to count occurrences of each letter in a given text.
    - Key Method:
     - `compterOccurrences()`: Analyzes the input text and counts the frequency of each letter.

     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_131207489.png?raw=true)
   
   - Code:
      - Explanation:
     This Java code defines a class `Exercice4` that counts the occurrences of each letter in a given text. Here's a breakdown of the key parts:
     1. **Attributes**: 
       The `occurences` array holds the count of each letter (from 'a' to 'z'). The total count of letters is stored in `totalLettre`.
     2. **Input Handling**: 
        The `saisirTexte()` method prompts the user for input, storing it in the `texte` attribute after converting it to lowercase and removing all non-letter characters. This ensures only valid letters are 
        counted.
     3. **Counting Logic**: 
        In `compterOccurrences()`, the code loops through the cleaned text. For each character, it checks if it’s between 'a' and 'z'. If so, it increments the corresponding index in `occurences`. Finally, it prints each letter along with its count, based on the values stored in the `occurences` array.
     Overall, this class provides a straightforward way to analyze text for letter frequency, ensuring accurate results by filtering input and counting only valid characters.
    
      ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_140459682.png?raw=true)
   
   - Usage in main, check it:
     [Main](#main)
    
## Main

The `Main` class is designed as the entry point of a Java program that serves as a menu-driven interface for selecting different exercises.
 - Description :
        The Main class is designed as the entry point of a Java program that serves as a menu-driven interface for selecting different exercises. Each exercise focuses on a specific topic, like student grades 
        management, verb conjugation, string operations, and letter frequency analysis. This class uses a do-while loop to repeatedly display a menu of options until the user chooses to exit the program. 
        Depending on the user’s choice, it creates instances of different classes (Exercice1, Exercice2, Exercice3, and Exercice4) and calls their methods to perform the respective operations.
      - Code:
         Explanation:
         1. **Scanner and Menu Display**:  
         The program starts by creating a Scanner object to capture user input and an integer choix to hold the user’s choice. A do-while loop then displays the menu options, each associated with a specific 
         exercise, until the user selects the option to quit by entering 0.
         2. **User Choices and Exercise Execution**:
           - **Case 1 (Student Grades Management)**:  
         If the user selects 1, the program prompts them to enter the number of students, initializes an Exercice1 instance with that number, and:
             - Sorts and displays student grades.
             - Displays the average, minimum, and maximum grades.
             - Asks the user to enter a specific grade and displays the count of students who achieved that grade.
           - **Case 2 (Verb Conjugation)**:  
              When 2 is chosen, the program prompts the user to enter a first-group French verb, initializes an Exercice2 instance with this verb, and then conjugates it in the present tense if it’s valid.
           - **Case 3 (String Operations)**:  
              With option 3, an Exercice3 instance is created. The menu method of Exercice3 is called, which displays its own submenu for various string operations like entering a string, displaying it, 
              reversing it, and counting words.
           - **Case 4 (Letter Occurrence Counting)**:  
              If the user selects 4, an instance of Exercice4 is created. The user is asked to input a line of text, and the program calculates and displays the frequency of each letter within the entered 
              text.
           - **Case 0 (Exit)**:  
              Selecting 0 exits the loop, ending the program, and a closing message is displayed.
           - **Default Case**:  
              If the user enters an invalid option, an error message is shown, and the menu is redisplayed.
          3. **Loop Continuation and Resource Management**:  
              The do-while loop continues running until choix is 0. Finally, the scanner is closed to release resources once the user exits
        
           ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_135703106.png?raw=true)
        
### Execution
- **Case 1 (Student Grades Management)**:
  
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_140852238.png?raw=true)
  
- **Case 2 (Verb Conjugation)**:
  
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_142030792.png?raw=true)
  
- **Case 3 (String Operations)**:
  
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_142525505.png?raw=true)
  
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_142839389.png?raw=true)
  
- **Case 4 (Letter Occurrence Counting)**:
  
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_143341201.png?raw=true)
  
- **Case 0 (Exit)**:
  
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/TP1/src/screenshots/image_2024-10-27_145014335.png?raw=true)

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
2. Navigate to the project directory
   ```bash
     cd Tps_POO_SDIA1/TP1
3. Open the project in IntelliJ IDEA or your preferred Java IDE.
## Usage
- Run the Main class to access the menu of exercises.
- Follow the prompts to select an exercise and provide any necessary input.
## Contributing
-Contributions are welcome! If you have suggestions for improvements or additional exercises, feel free to create a pull request or open an issue.
## License
This project is licensed under the MIT License - see the LICENSE file for details.

   
