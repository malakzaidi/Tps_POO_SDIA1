# Project: Management of Professors and Departments (JavaFX Application)

## Purpose of the Exercise

This project is a management system for handling professors and departments in a university or educational institution. The purpose of this project is to implement a database-driven application with the following functionalities:

- Managing professors (adding, updating, deleting).
- Managing departments (adding, updating, deleting).
- Displaying the list of professors and departments.
- A JavaFX interface for easy interaction with the system.

The exercise involves implementing persistent classes, creating a service layer, establishing a database connection using MySQL, and building a graphical user interface using JavaFX and SceneBuilder.

## Screenshots of the JavaFX Application

### Managing Professors
![Manage Professors](path/to/your/screenshots/manage_professors.png)

### Managing Departments
![Manage Departments](path/to/your/screenshots/manage_departments.png)

## UML Diagrams

### 1. Class Diagram
![Class Diagram](path/to/your/diagrams/class_diagram.png)

**Purpose**: The class diagram provides a visual representation of the classes involved in the system. It shows the relationship between the `Professeur` and `Departement` classes, their attributes, and methods.

### 2. MLD (Logical Data Model) Diagram
![MLD Diagram](path/to/your/diagrams/mld_diagram.png)

**Purpose**: The MLD diagram shows how the data entities (tables in the database) are logically structured and how they relate to one another. This includes the relationship between `Professeur` and `Departement`, such as foreign key constraints.

## Database Setup

### Steps to Establish the Database Using MySQL Workbench

1. **Install MySQL Workbench**: You can download and install MySQL Workbench from the official MySQL website: [MySQL Workbench](https://dev.mysql.com/downloads/workbench/).
   
2. **Install MySQL Server**: Install MySQL Server by following the installation guide for your operating system: [MySQL Installation](https://dev.mysql.com/doc/refman/8.0/en/installing.html).

3. **Create the Database**:
   Open MySQL Workbench and connect to your MySQL server.

   Execute the following SQL script to create the database and tables:

   ```sql
   CREATE DATABASE IF NOT EXISTS management_depts_profs;

   USE management_depts_profs;

   -- Create the departement table
   CREATE TABLE IF NOT EXISTS departement (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nom VARCHAR(255) NOT NULL
   );

   -- Create the professeur table
   CREATE TABLE IF NOT EXISTS professeur (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nom VARCHAR(255) NOT NULL,
       prenom VARCHAR(255),
       cin VARCHAR(20),
       adresse VARCHAR(255),
       telephone VARCHAR(20),
       email VARCHAR(255),
       date_recrutement DATE,
       departement_id INT,
       FOREIGN KEY (departement_id) REFERENCES departement(id)
   );
   ```

4. **Run the SQL Script**:
   In MySQL Workbench, open a new SQL tab, paste the script, and execute it to create the required tables.

### SQL Script Explanation

- **`CREATE DATABASE`**: Creates the database `management_depts_profs`.
- **`CREATE TABLE`**: Defines two tables: `departement` and `professeur`. The `professeur` table contains a foreign key `departement_id` that references the `id` column in the `departement` table.

## Project Structure

### Package Breakdown

1. **Entities**
   - **`Professeur`**: Represents a professor with attributes like `id`, `nom`, `prenom`, etc.
   - **`Departement`**: Represents a department with `id` and `nom`.

2. **Services**
   - **`IMetier`**: The interface declaring the methods for interacting with the `Professeur` and `Departement` entities.
   - **`MetierImpl`**: The implementation of `IMetier`, responsible for interacting with the database to perform CRUD operations on professors and departments.

3. **Controllers**
   - **`AppController`**: Manages the interaction between the JavaFX interface and the underlying business logic for managing professors and departments.
   - **`ProfesseurController`**: Handles actions related to professors (adding, deleting, searching).
   - **`DepartementController`**: Handles actions related to departments (adding, deleting, viewing professors).

4. **Utils**
   - **`SingletonConnexionDB`**: Contains the method to establish a single connection to the database (singleton pattern).

5. **Tests**
   - **`TestMySqlConnection`**: A test class to verify the connection to the MySQL database.
   - **`ConsoleApp`**: A console-based application to test the business logic methods.

### How the Application Works
- The `ProfesseurController` and `DepartementController` are connected to JavaFX FXML views for the user interface.
- The JavaFX application allows users to manage professors and departments with the use of buttons and forms.
- The application communicates with the database through `MetierImpl`, which performs SQL queries to manipulate data.

## Installation and Setup

### Prerequisites
- **JDK 21**: You can download and install JDK 21 from [Oracle's JDK Download page](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
  
- **MySQL**: Install MySQL server and MySQL Workbench. Follow the guide to [Install MySQL Server](https://dev.mysql.com/doc/refman/8.0/en/installing.html).

- **Maven**: Install Maven if you don’t have it already. You can follow this guide: [Maven Installation](https://maven.apache.org/install.html).

### VM Options for JavaFX
To run the JavaFX application, set the following VM options in IntelliJ IDEA or your preferred IDE:

```
--module-path "C:\Program Files\Java\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml
```

### Installing JDK 21
To install JDK 21 on your system:
1. Download the installer from the [JDK 21 download page](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
2. Follow the installation instructions for your operating system.

### Installing Maven
To install Maven:
1. Download the latest Maven version from the [official Maven website](https://maven.apache.org/download.cgi).
2. Follow the [installation instructions](https://maven.apache.org/install.html).

### Resolving Dependency Issues
If you face issues with dependencies in `pom.xml`, you can resolve them by:
1. Ensuring that your Maven `settings.xml` file is correctly configured.
2. Using the `mvn clean install` command to refresh your dependencies.

### Executable Jar
To create an executable JAR file for the project, you can use Maven to package it:

```bash
mvn clean package
```

This will create a `.jar` file in the `target/` directory that you can run from the command line.

### Contributions
If you’d like to contribute to the project, feel free to fork it and submit pull requests. Contributions are welcome to improve the project, add features, or fix bugs!

### License
This project is licensed under the MIT License.

---

This `README.md` provides a comprehensive guide to set up and understand your project, from database creation to running the JavaFX application.
