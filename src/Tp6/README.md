# Generics and Input/Output in Java.

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

This program simulates the `ls` command to list files and directories along with their properties.

#### Features:
- **Recursive Listing**: Traverses subdirectories recursively.
- **File Properties**: Displays the type (`<FILE>` or `<DIR>`) and access permissions (`read`, `write`, `hidden`).

#### Code Explanation:
The program uses the `File` class to interact with the file system:
- **Recursion**: A method is defined to recursively traverse directories.
- **Permissions**: Methods like `canRead()` and `canWrite()` are used to check file permissions.

#### Code Screenshot:
Below is a code snippet showing the core functionality for listing files:

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/1.PNG)

#### Execution:
When executed, the program outputs a list of files and directories, as shown below:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/1.PNG)


---

### Exercise 2: Contact Management System

This exercise implements a contact management system that allows users to manage their contact details persistently.

#### Features:
- Add, search, update, and delete contacts.
- Save contacts to individual files for persistence.

#### Code Explanation:
The program uses the following structure:
- **File-Based Storage**: Each contact is stored in a separate file named after the contact.
- **CRUD Operations**: The system provides Create, Read, Update, and Delete functionalities.
- **User Interface**: A menu-driven system interacts with the user.

Below is a screenshot of the dossier contract class :

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/2.PNG)

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/3.PNG)

Below is a screenshot of the main menu implementation:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/4.PNG)

#### Execution:
The menu prompts the user to perform actions, as shown in this execution screenshot:

![Execution Screenshot](path/to/exercise2-execution-screenshot.png)

---

### Exercise 3: Product and Client Management

This exercise demonstrates how to manage collections of `Product` and `Client` objects using a generic interface and serialization.

#### Features:
- Add, search, and delete products and clients.
- Save objects to and load from serialized files.

#### Code Explanation:
- **Serializable Classes**: `Product` and `Client` implement the `Serializable` interface for persistence.
- **Generic Interface**: `IMetier<T>` is a generic interface defining the operations.
- **Implementation Classes**: `MetierProduitImpl` and `MetierClientImpl` provide concrete implementations.

Here's a screenshot of the `Product` class:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/5.PNG)

Here's a screenshot of the `Client` class:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/6.PNG)

Here's a screenshot of the `IMetier<T>` interface:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/7.PNG)

Here's a screenshot of the  `MetierProduitImpl` class:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/8.PNG)

Note : `MetierClientImpl` follows the same logic also .

The main menu for managing products looks like this:

![image alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp6/screenshots/8.PNG)

Note :The main menu for managing clients follows the same logic also .

#### Execution:
Below is a screenshot of the program execution showing the menu in action:

![Execution Screenshot](path/to/exercise3-execution-screenshot.png)


## How to Run

### Prerequisites
- Java Development Kit (JDK) installed.
- A terminal or IDE like IntelliJ IDEA.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
   ```
2. Navigate to the exercise directory:
   ```bash
   cd Tps_POO_SDIA1/Tp6
   ```
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the desired exercise:
   ```bash
   java Exercise1
 

