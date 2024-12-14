(Note : this Readme file was delivered the 8th December 2024 (before the due date) , it was re-uploaded the 14th december because of an unwanted delete , it was back-up)
# Generics and Input/Output in Java

This project contains solutions to exercises focusing on the concepts of **Generics** and **Input/Output (I/O)** in Java. These exercises aim to solidify understanding of file handling, data serialization, and working with generics to create flexible, type-safe code. Each exercise is structured to solve a practical problem and is accompanied by detailed explanations and screenshots of the implementation and execution.

---

## Table of Contents
1. [Overview](#overview)
2. [Exercises](#exercises)
   - [Exercise 1: Directory and File Listing](#exercise-1-directory-and-file-listing)
   - [Exercise 2: Contact Management System](#exercise-2-contact-management-system)
   - [Exercise 3: Product and Client Management](#exercise-3-product-and-client-management)
3. [How to Run](#how-to-run)
4. [Repository Structure](#repository-structure)
5. [License](#license)

---

## Overview

The TP consists of three exercises aimed at strengthening your knowledge of Java programming. By completing these exercises, you'll gain hands-on experience in:
- File handling and directory operations.
- Managing collections of objects.
- Implementing interfaces and generics.
- Persistent data storage using files.

---

## Exercises

### Exercise 1: Directory and File Listing

#### Features:
- **Recursive Listing**: Traverses subdirectories recursively.
- **File Properties**: Displays the type (`<FILE>` or `<DIR>`) and access permissions (`read`, `write`, `hidden`).

#### Code Screenshot:
Below is a code snippet showing the core functionality for listing files:

![Code for Exercise 1](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/1.PNG)

#### Execution:
The program outputs a list of files and directories, as shown below:
-if the directory exist and it is not empty : 

![Execution of Exercise 1](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/a.PNG)

-if the directory doesn't exist:

![Execution of Exercise 1](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/b.PNG)

-if the directory is empty :

![Execution of Exercise 1](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/c.PNG)

---

### Exercise 2: Contact Management System

#### Features:
- Add, search, update, and delete contacts.
- Save contacts to individual files for persistence.

#### Screenshots:
The following demonstrate the `DossierContact` class implementation and main menu execution:

- **DossierContact Class:**
  
  ![DossierContact Class](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/2.PNG)

- **Main Menu Implementation:**
  
  ![Main Menu](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/4.PNG)
  
  ![Main Class](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/3.PNG)
  
  

#### Execution:
The menu prompts the user to perform actions:

![Execution of Exercise 2](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/d.PNG)

---

### Exercise 3: Product and Client Management

#### Features:
- Add, search, and delete products and clients.
- Save objects to and load from serialized files.

#### Screenshots:
Below are the class and interface implementations:

- **Product Class:**
  
  ![Product Class](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/5.PNG)

- **Client Class:**
  
  ![Client Class](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/6.PNG)

- **IMetier Interface:**
  
  ![IMetier Interface](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/7.PNG)

- **MetierProfuitImpl class:**
  
  ![IMetier Interface](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/8.PNG)

#### Main:
The following shows the produit's main menu in action:

![Execution of Exercise 3](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/10.PNG)

Note : MetierClientImpl and the client's main application follow the same logic.

#### Execution:

![Execution of Exercise 3](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/e.PNG)

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
   ```
2. Navigate to the project directory and open it in an IDE (e.g., IntelliJ IDEA).
3. Compile and run the specific `main` classes for each exercise.


