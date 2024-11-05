# TP2 - Object-Oriented Programming in Java

This project contains four exercises designed to build object-oriented programming skills using Java. Each exercise explores a different management system (library, salary, command, and product management), allowing practical experience with classes, inheritance, interfaces, and polymorphism.

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/image_2024-11-03_140447238.png)

## Table of Contents

1. [Overview](#overview)
2. [Exercise 1: Library Management](#exercise-1-library-management)
3. [Exercise 2: Salary Management](#exercise-2-salary-management)
4. [Exercise 3: Command Management](#exercise-3-command-management)
5. [Exercise 4: Product Management System](#exercise-4-product-management-system)
6. [Main Application](#main-application)
7. [Installation](#installation)
8. [Usage](#usage)
9. [License](#license)

---

## Overview

This TP2 project covers four management exercises:
- **Library Management**: Manages library members and book information.
- **Salary Management**: Calculates and manages the salaries of engineers and managers.
- **Command Management**: Handles customer orders, product categories, and order lines.
- **Product Management System**: Uses an interface and list structures to manage products.

Each exercise includes various classes, attributes, methods, and relationships to demonstrate effective object-oriented programming techniques.

---

## Exercise 1: Library Management

### Description
The **Library Management** exercise creates an application to manage books and library members.

### Classes

1. **Personne**:
   - **Attributes**: `nom`, `prenom`, `email`, `tel`, `age`
   - **Methods**: `afficher()` – Displays information about a person.
     
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/image_2024-11-03_140905299.png)
   
2. **Adherent** (inherits from `Personne`):
   - **Attributes**: `numAdherent` (unique member ID)
   - **Methods**: `afficher()` – Overrides `Personne` to include `numAdherent`.
     
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/adherent.PNG)
     
3. **Auteur** (inherits from `Personne`):
   - **Attributes**: `numAuteur` (unique author ID)
   - **Methods**: `afficher()` – Overrides `Personne` to include `numAuteur`.
     
      ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/author.PNG)
     
4. **Livre**:
   - **Attributes**: `ISBN`, `titre`, `auteur`
   - **Methods**: `afficher()` – Displays the ISBN, title, and author details of the book.
     
      ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/livree.PNG)
     
### Usage in Main
The `Main` class demonstrates:
- Creating an `Adherent` and an `Auteur`.
- Adding a `Livre` written by the author.
- Displaying information about the library member and the book.
- Check the main application :
  [Main Application](#main-application)
---

## Exercise 2: Salary Management

### Description
The **Salary Management** exercise builds a payroll system for managing the salaries of engineers and managers.

### Classes

1. **Employe** (abstract class):
   - **Attributes**: `nom`, `prenom`, `email`, `telephone`, `salaire`
   - **Methods**: `calculerSalaire()` (abstract) – Calculates an employee's salary.
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/employe.PNG)
   
2. **Ingenieur** (inherits from `Employe`):
   - **Attributes**: `specialite` (specialty field)
   - **Methods**: `calculerSalaire()` – Calculates salary with a 15% increase.
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/engineer.PNG)
     
3. **Manager** (inherits from `Employe`):
   - **Attributes**: `service` (department name)
   - **Methods**: `calculerSalaire()` – Calculates salary with a 20% increase.
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/manager.PNG)
     
### Usage in Main
The `Main` class demonstrates:
- Creating an `Ingenieur` and a `Manager`.
- Calculating and displaying their salaries with respective increases.
- Check the main application :
  [Main Application](#main-application)
---

## Exercise 3: Command Management

### Description
The **Command Management** exercise creates an application to handle orders, customers, and categories of products.

### Classes

1. **Ordinateur**:
   - **Attributes**: `nom`, `marque`, `prix`, `description`, `nombreStock`
   - **Methods**: `calculerPrix(int quantite)` – Calculates the total price for a given quantity.
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/Ordinateur.PNG)
   
2. **Categorie**:
   - **Attributes**: `nom`, `description`, `ordinateurs` (list of `Ordinateur` objects)
   - **Methods**:
     - `ajouterOrdinateur()` – Adds a computer to the list, ensuring no duplicates.
     - `supprimerOrdinateur()` – Removes a computer from the list.
     - `rechercherParPrix(double prix)` – Finds computers within a specified price range.
        ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/Categorie.PNG)
   
3. **Commande**:
   - **Attributes**: `reference`, `client`, `date`, `etat`
        ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/Commande.PNG)
   
4. **LigneCommande**:
   - **Attributes**: `quantite`, `commande`, `ordinateur`
     
        ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/lignecommande.PNG)
         
5. **Client**:
   - **Attributes**: `nom`, `prenom`, `adresse`, `email`, `ville`, `telephone`, `commandes` (list of `Commande` objects)
   - **Methods**:
     - `ajouterCommande()` – Adds a command to the client’s list.
     - `supprimerCommande()` – Removes a command from the list.
       ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/client.PNG)
       
### Usage in Main
The `Main` class demonstrates:
- Creating a `Categorie` and adding `Ordinateur` objects to it.
- Creating a `Client` and a `Commande` associated with this client.
- Adding `LigneCommande` entries to the `Commande` and displaying details.
- Check the main application :
  [Main Application](#main-application)
---

## Exercise 4: Product Management System

### Description
The **Product Management System** manipulates a collection of `Produit` objects using an interface and a list.

### Classes

1. **Produit**:
   - **Attributes**: `id`, `nom`, `marque`, `prix`, `description`, `nombreStock`
   - **Methods**: Getters and setters for each attribute.
     ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/produit.PNG)

2. **IMetierProduit** (interface):
   - **Methods**:
     - `add(Produit p)`: Adds a product to the list.
     - `getAll()`: Returns a list of all products.
     - `findByNom(String motCle)`: Finds products by name keyword.
     - `findById(long id)`: Retrieves a product by ID.
     - `delete(long id)`: Deletes a product by ID.
       ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/image_2024-11-03_161558010.png)

3. **MetierProduitImpl** (implements `IMetierProduit`):
   - **Attributes**: `produits` (list of `Produit` objects)
   - **Methods**:
     - Implements all methods in `IMetierProduit` for adding, finding, and deleting products.
       ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/MetierImpl.PNG)

4. **Application**:
   - **Methods**:
     - Provides a user menu with options to:
       - Display all products.
       - Search products by keyword.
       - Add a new product.
       - Find a product by ID.
       - Delete a product by ID.
         
       ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/appex4.PNG)

       ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/app2.PNG)
       
### Usage in Main
The `Application` class provides an interactive menu allowing users to manage products with options for displaying, adding, finding, and deleting products.
### Exécution
   - Ajouter un nouveau produit dans la liste
     
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/app3.PNG)

   - Afficher la liste des produits
     
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/app1.PNG)

   - Rechercher des produits par mot clé
     
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/app22.PNG)

   - Récupérer et afficher un produit par ID
     
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/id.PNG)

   - Supprimer un produit par ID
     
   ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/supp.PNG)

  - Quitter
    
    ![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/Quit.PNG)
   
    



---

## Main Application

The `Main` class brings together the first three exercises with a menu for easy navigation:
1. **Exercise 1 (Library Management)**: Demonstrates creating and displaying an `Adherent`, `Auteur`, and `Livre`.
2. **Exercise 2 (Salary Management)**: Demonstrates creating and displaying salary details for an `Ingenieur` and `Manager`.
3. **Exercise 3 (Command Management)**: Demonstrates creating a `Client`, `Commande`, `Categorie`, and associated `LigneCommande` entries.
---

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/image_2024-11-03_174745608.png)

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/mainn.PNG)

### Exécution

**Case 1 (Exercise1)**:

![image_alt](https://github.com/user-attachments/assets/f411eb79-eb11-4ac4-a581-e8ab5fa8aeae)

**Case 2 (Exercise2)**:

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/main2.PNG)

**Case 3 (Exercise3)**:

![image_alt](https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp2/screenshots/main3.PNG)

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/malakzaidi/Tps_POO_SDIA1.git
   cd Tps_POO_SDIA1/TP2
   ```

2. **Compile and Run**:
   Ensure Java is installed. Compile and run the Java files with:
   ```bash
   javac *.java
   java Main
   ```

---

## Usage

Run the `Main` class to access the menu. Follow the prompts to navigate between exercises, view outputs, and interact with the management systems.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

