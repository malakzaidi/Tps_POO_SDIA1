# TP4: Collections and Streams in Java  

This project (TP4) focuses on using **Collections** and **Streams** in Java. You'll work with Lists, Maps, and Sets to store and manipulate data, followed by functional programming techniques using Streams. Each exercise is designed to reinforce practical skills in handling Java data structures and stream operations.  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

## Table of Contents  

1. [Overview](#overview)  
2. [Exercise 1: Lists](#exercise-1-lists)  
3. [Exercise 2: Maps](#exercise-2-maps)  
4. [Exercise 3: Sets](#exercise-3-sets)  
5. [Exercise 4: Streams](#exercise-4-streams)  
6. [Installation](#installation)  
7. [Usage](#usage)  
8. [Contributing](#contributing)  
9. [License](#license)  

---

## Overview  

This TP includes exercises that demonstrate the following:  
- Using **Lists** to manage objects in a dynamic collection.  
- Applying **Maps** to associate data with unique keys.  
- Manipulating **Sets** to perform operations like union and intersection.  
- Using **Streams** for functional-style data processing.  

---

## Exercises  

### Exercise 1: Lists  

**Objective**: Create a simple application to manage a list of `Product` objects.  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

#### Steps:  
1. Create a `Product` class with the following attributes:  
   - `id` (long)  
   - `name` (String)  
   - `price` (double)
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/produiiit.PNG)

2. Create a `GestionProduitsApp` class containing a `main` method.  
3. Inside the `main` method, perform the following with an `ArrayList`:  
   - Add `Product` objects to the list.  
   - Remove a product by its index.  
   - Display the list of products.  
   - Modify a product at a specific index.  
   - Search for a product by name, entered by the user.
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/c2.PNG)     
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/c2.PNG)

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/c4.PNG)

#### Execution: 
   - Adding a product 'gomme' to the list.
   - Displaying the list of products to test if the product was added.  
   - Removing a product by its index , name or pricee .  
   
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/ex1.PNG)

   - Modifying the product 'stylo' at a specific index.
   - Displaying the list of products to test if the product was modified.

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/ex2.PNG)     

   - Searching for a product by name.
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/ex3.PNG)      

---

### Exercise 2: Maps  

**Objective**: Use a `HashMap` to store and manage students' grades.  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

#### Steps:  
1. Create a `HashMap` where:  
   - The key is a `String` (student's name).  
   - The value is a `double` (student's grade).  
2. Perform the following operations:  
   - Insert grades for multiple students.  
   - Increase the grade of a specific student.  
   - Remove a student's grade.  
   - Display the size of the map.  
   - Calculate and display the average, maximum, and minimum grades.  
   - Check if any grade equals 20.  
3. After each operation, display the list using the `forEach` method with a lambda expression.
 
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/b11.PNG)  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/b2.PNG) 

#### Execution: 

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/image_2024-11-17_150135423.png)

---

### Exercise 3: Sets  

**Objective**: Perform operations with `HashSet` to manage student groups. 

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

#### Steps:  
1. Create two `HashSet` objects named `groupA` and `groupB`, representing the names of students in groups A and B.  
2. Add student names to each `HashSet`.  
3. Perform and display the following operations:  
   - Intersection of the two sets (common students).  
   - Union of the two sets (all students).
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/exo3.PNG)

#### Execution: 

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/image_2024-11-17_150645686.png)


---

### Exercise 4: Streams  

#### Exercise 4.1: Processing a List of Words  

**Objective**: Perform various operations on a list of strings using Streams.  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

#### Steps:  

2. Filter words that contain the letter `"a"`.  
3. Filter words with a length greater than 3 and reverse each word.  
4. Filter strings that contain the letter `"e"` and flatten each string into a list of its characters.  
5. Convert each string to uppercase.  
6. Map each string to its length.  
7. Transform each string into a list of its characters, then flatten all lists into a single list of characters.  
8. Map each word to a string of the format `"Name - Index"`, where the index represents its position in the list.  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/image_2024-11-17_151222559.png)

---

#### Exercise 4.2: Processing a List of Employees  

**Objective**: Use Streams to analyze and manipulate a list of employees.  

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp3/screenshots/image_2024-11-04_104658881.png)

#### Steps:  
1. Create a `Employe` class with the following attributes:  
   - `id` (long)  
   - `name` (String)  
   - `price` (double)
  
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/d1.PNG)    
     
2. Create an `ArrayList` of employees, where each employee has:  
   - `name` (String)  
   - `department` (String)  
   - `salary` (double)  
3. Perform the following operations:  
   - Use `mapToDouble` and `sum` to calculate the total sum of all employees' salaries.  
   - Use `sorted` to sort the list of employees alphabetically by name.  
   - Use `min` to find the employee with the lowest salary.  
   - Use `filter` to get a list of employees with a salary greater than a given value.  
   - Use `reduce` to find the employee with the highest salary in the company.  
   - Use `reduce` to concatenate the names of all employees into a single string.
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp4/screenshots/d1.PNG) 


---

## Installation  

1. **Clone the repository**:  
   ```bash  
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git  
   ```  
2. **Navigate to the project directory**:  
   ```bash  
   cd Tps_POO_SDIA1/TP4  
   ```  
3. **Open the project** in IntelliJ IDEA or your preferred Java IDE.  

---

## Usage  

1. Compile and run the **Main class** to access the menu of exercises.  
2. Follow the prompts to interact with the program and test various features.  

---

## Contributing  

Contributions are welcome! If you have ideas for new features or improvements, please:  
- Create a pull request.  
- Open an issue for discussion.  

---

## License  

This project is licensed under the [MIT License](LICENSE).  

---  

Let me know if you need additional modifications!
