-- Create the database
CREATE DATABASE IF NOT EXISTS tp5;

USE tp5;

-- Create the tables
CREATE TABLE IF NOT EXISTS departements (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS professeurs (
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
