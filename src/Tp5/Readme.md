#  Professors and Departments Management System (JavaFx Application)

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/JavaFX_Logo.png)

This project is a **Professors and Departments Management System** built using **JavaFX** and **MySQL**. The system allows users to manage professors and departments in a university setting. It provides a graphical user interface (GUI) to interact with a MySQL database, where users can add, update, search, and delete professors and department

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/siiii.jpg)


## Table of Contents

1. [Project Purpose](#project-purpose)
2. [Technologies Used](#technologies-used)
3. [UI Overview](#ui-overview)
4. [Diagrams](#diagrams)
    - [UML Class Diagram](#uml-class-diagram)
    - [MLD Diagram](#mld-diagram)
5. [Database Setup and MySQL Integration](#database-setup-and-mysql-integration)
    - [Setting Up the Database](#setting-up-the-database)
    - [SQL Script](#sql-script)
6. [Project Walkthrough](#project-walkthrough)
    - [Classes](#classes)
    - [Interface IMetier](#interface-imetier)
    - [Database Connection (SingletonConnexionDB)](#database-connection-singletonconnexiondb)
    - [Implementation (MetierImpl)](#implementation-metierimpl)
    - [UI Components (ProfesseurController & DepartementController)](#ui-components-professeurcontroller--departementcontroller)
7. [Installation and Setup](#installation-and-setup)
    - [Prerequisites](#prerequisites)
    - [Steps to Install](#steps-to-install)
    - [Running the Application](#running-the-application)
8. [Contributing](#contributing)
9. [License](#license)

---

## Project Purpose

The purpose of this exercise is to develop an application that:
- Manages the data of **professors** and **departments**.
- Allows users to interact with a **MySQL database** through a JavaFX-based graphical user interface (GUI).
- Provides a simple and intuitive way to add, update, and delete records in the database.

---

## Technologies Used

- **JavaFX**: Used to create the graphical user interface.
- **MySQL**: Used to store and manage data.
- **Lombok**: Used for generating boilerplate code such as getters, setters, and constructors.
- **Maven**: Used for dependency management.
- **JDK 21** and **JavaFX 23**.

---

## UI Overview

### JavaFX Application
The application allows the user to manage professors and departments with the following features:

1. **Add Professors**: Enter details such as name, department, email, etc., and save them to the database.
2. **Edit Professors**: Modify existing professors' data.
3. **Delete Professors**: Remove a professor from the database.
4. **View Professors by Department**: View the list of professors in a specific department.

**Key Screens**:
- **Professors Management**: Display a table of professors with options to add, edit, or delete them.
  
  -Displaying the list of professors :
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/1.PNG)

  -Adding a professor :
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/2.PNG)
  
  -Deleting a professor :
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/3.PNG)
  
  -Modifying a professor:
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/4.PNG)

   -Assigning a departement to a professor:
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/5.PNG)

   -Professor Assigned:
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/6.PNG)

   -Searching a professor:
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/6.PNG)

  - **Departments Management**: Display a table of departments with options to add, edit, or delete them.

  -Displaying the list of departments :
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/8.PNG)

  -Modifying a departement:
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/9.PNG)
  
  -Displaying professors based on their departement:
  
  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/10.PNG)
  
  -Deleting a departement:

  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/11.PNG)

  -Adding a departement:

  ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/12.PNG)

  
---

## Diagrams

### Difference Between a Class Diagram and an MLD Diagram

  1. Class Diagram (UML):
     - Purpose: Represents the structure of the system from an object-oriented programming perspective.
     - Components:
      - Classes: Represent entities (e.g., Professeur, Departement).
      -  Attributes: Represent data fields in each class (e.g., nom, prenom in Professeur).
    -  Methods: Represent behaviors or functions (e.g., addProfesseur() in MetierImpl).
    - Relationships:
      - Associations: Show how classes relate (e.g., Professeur is associated with Departement via departement_id).
      - Inheritance: Show class hierarchies.
      - Multiplicity: Indicate the number of instances involved (e.g., 1 Department can have 0..* Professors).
        - Example: Used by developers to visualize and understand the codebase or plan object-oriented designs.
     
  2. MLD (Logical Data Model):
     - Purpose: Represents the structure of the relational database.
     -  Components:
      -  Tables: Represent entities stored in the database (professeur, departement).
      -   Columns: Represent fields in the table (nom, prenom).
     -  Relationships:
      - Foreign Keys: Show references between tables (departement_id in professeur references id in departement).
        - Example: Used by database administrators to design or maintain the database schema.
         
### Class Diagram 
  - Classe Professeur:
   - Attributes:
   - `id_prof (int)`: Unique identifier for each professor.
   - `nom (string)`: Last name of the professor.
   - `prenom (string):` First name of the professor.
   - `cin (string)`: National identity card number of the professor.
   - `adresse (string)`: Address of the professor.
   - `telephone (string)`: Phone number of the professor.
   - `email (string)`: Email address of the professor.
   - `date_recrutement (date)`: Recruitment date of the professor.     
  - Methods:
   - `afficher()`: Display the professor's information.
   - `rechercher(String motCle)`: Search for professors by keyword.
   - `ajouter()`: Add a new professor.
   - `supprimer()`: Delete a professor.
   - `modifier()`: Modify the professor's information.
  - Classe Departement:
  - Attributes:
   - `id_deprat (int)`: Unique identifier for each department.
   - `nom (string)`: Name of the department.
  - Methods:
   - `ajouterProfesseur(Professeur prof)`: Add a professor to the department.
   - `supprimerProfesseur(Professeur prof)`: Remove a professor from the department.
   - `afficherProfesseurs()`: Display the list of professors in the department.
   - `modifierDepartement()`: Modify the department's information.
  - Relationships:
    The Professeur class has a one-to-many relationship with the Departement class, indicating that each professor belongs to one department, and a department can have multiple professors.

    ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/22.png)

### MLD (Mapping Logic Diagram) 

For this application, the MLD diagram includes the following tables:
  - Professeur:
   - `id_prof (int)`: Unique identifier for each professor.
   - `nom (string)`: Last name of the professor.
   - `prenom (string):` First name of the professor.
   - `cin (string)`: National identity card number of the professor.
   - `adresse (string)`: Address of the professor.
   - `telephone (string)`: Phone number of the professor.
   - `email (string)`: Email address of the professor.
   - `date_recrutement (date)`: Recruitment date of the professor.
  - Departement:
   - `id_deprat (int)`: Unique identifier for each department.
   - `nom (string)`: Name of the department.
   - Relationships:
    - Each professor belongs to one department, and a department can have multiple professors. This is represented by a one-to-many relationship between the Departement and Professeur tables.
     
      ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/MLD.PNG)
   
---

## Database Setup and MySQL Integration

### Setting Up the Database

Follow these steps to create the database and tables in **MySQL**:

1. **Install MySQL Workbench**: If you don't have MySQL Workbench installed, [download and install MySQL Workbench](https://dev.mysql.com/downloads/workbench/).
2. **Create a Database**:
   - Open **MySQL Workbench**.
   - Connect to your MySQL server.
   - Run the following SQL script to create the database:

   ```sql
   CREATE DATABASE tp5;
   USE tp5;
   ```

3. **Create Tables**:
   - Create the `professeurs` and `departements` tables:

   ```sql
   CREATE TABLE professeurs (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nom VARCHAR(100),
       prenom VARCHAR(100),
       cin VARCHAR(50),
       adresse VARCHAR(255),
       telephone VARCHAR(50),
       email VARCHAR(100),
       date_recrutement DATE,
       departement_id INT,
       FOREIGN KEY (departements_id) REFERENCES departements(id)
   );

   CREATE TABLE departements (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nom VARCHAR(100)
   );
   ```
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/image_2024-12-01_045449742.png)

4. **Test the Database Connection**:
   - Make sure the **MySQL server** is running.
   - Use the **TestMySqlConnection** class to ensure your Java application can connect to the database.
     
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/21.PNG)

### SQL Script

This SQL script creates the `professeurs` and `departements` tables. These are the main tables that store professor and department data.

---

## Project Walkthrough

### Classes

- **Professeur**: Represents a professor entity with attributes like `id`, `nom` (name), `prenom` (first name), and other personal details. The class uses **Lombok** annotations to automatically generate getter, setter, and constructor methods.
  
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/13.PNG)  
  
- **Departement**: Represents a department entity with `id` and `nom` (name). This class has basic getters and setters.
  
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/14.PNG)  
  

### Interface `IMetier`

The interface `IMetier` defines the methods for the business logic. 

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/15.PNG)  

These methods will be implemented by the `MetierImpl` class. This interface is responsible for CRUD operations (Create, Read, Update, Delete) for both `Professeur` and `Departement`.
Here is some of the methods implemented :

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/16.PNG)  

### Database Connection (`SingletonConnexionDB`)

- **Singleton Pattern**: The `SingletonConnexionDB` class ensures that only one database connection exists throughout the application. The `getConnexion` method returns the same connection instance every time it's called.
  
![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/18.PNG)  

### Implementation (`MetierImpl`)

The `MetierImpl` class implements the `IMetier` interface and handles the actual database queries (using `PreparedStatement`) to manage professors and departments.

### Console App 

-**Testing the backend methods implemented in `IMetier` :
Example:

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp5/screenshots/17.PNG)  
  
### UI Components (`ProfesseurController` & `DepartementController`)

These controllers manage the user interface for professors and departments. They initialize the tables, load data, and handle user actions (such as adding, editing, or deleting).

Example of table setup:

```java
private void setupTable() {
    idColumn.setCellValueFactory(new PropertyValueFactory<>("idProf"));  // Binding ID to idProf
    nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));   // Binding Name to nom
    prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom")); // Binding First Name to prenom
    cinColumn.setCellValueFactory(new PropertyValueFactory<>("cin"));   // Binding CIN to cin
    emailColumn.setCellValueFactory(new PropertyValueFactory<>("email")); // Binding Email to email
    departementColumn.setCellValueFactory(cellData -> {
        var departementOptional = metier.getAllDepartements().stream()
                .filter(departement -> departement.getIdDeprat() == cellData.getValue().getIdDepart())
                .findFirst();
        return new SimpleStringProperty(departementOptional.map(Departement::getNom).orElse("Non trouvé"));
    });
}
```

---

## Installation and Setup

### Prerequisites

1. **JDK 21**: Make sure **JDK 21** is installed on your machine. Download it from [here](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
   
2. **JavaFX 23**: Install **JavaFX 23** to create GUI applications with Java. Download it from [here](https://openjfx.io/).

3. **Maven**: Make sure **Maven** is installed on your system. Download and install it from [here](https://maven.apache.org/download.cgi).

4. **MySQL Server**: Install **MySQL Server** and **MySQL Workbench** from [here](https://dev.mysql.com/downloads/).

### Steps to Install

1. **Install JDK 21**:
   - Download the JDK and install it.
2. **Install JavaFX**:
   - Download the JavaFX SDK from [openjfx.io](https://openjfx.io/).
   - Extract the SDK to a folder, and note the path (e.g., `C:\Program Files\Java\javafx-sdk-23.0.1`).
     
3. **Install Maven**:
   - Download Maven and extract it.
   - Add the `bin` directory to your system's PATH environment variable.
   - Verify installation by running `mvn -version` in the terminal.

4. **Set Up MySQL**:
   - Install MySQL Server and MySQL Workbench.
   - Create the `tp5` database and tables using the SQL script provided earlier.
     
5. **Set Up SceneBuilder for a smooth Ui Design**:
   - Install SceneBuilder from (https://gluonhq.com/products/scene-builder/).
   - Create the `tp5` database and tables using the SQL script provided earlier.   

6. **Clone the Repository**:
   - Clone the repository to your local machine:
     ```bash
     git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
     cd Tps_POO_SDIA1
     ```

7. **Build the Project**:
   - Navigate to the project folder and build it using Maven:
     ```bash
     mvn clean install
     ```

8. **Configure VM Options**:
   - Add the following VM options to run the JavaFX application:
     ```plaintext
     --module-path "path-to-javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml
     ```
   - Replace `path-to-javafx-sdk` with the actual path to your JavaFX installation.

### Running the Application
1. Open the project in your IDE.
2. Configure your `Run Configuration` to include the VM options above.
3. Run the `App` class from the `com.javafx.hada` package.

---

## Contributing

Contributions are welcome! If you'd like to contribute:
1. Fork the repository.
2. Create a feature branch: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m "Add feature-name"`.
4. Push to the branch: `git push origin feature-name`.
5. Open a pull request.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

