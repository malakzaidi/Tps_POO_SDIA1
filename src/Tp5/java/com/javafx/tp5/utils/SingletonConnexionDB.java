package com.javafx.tp5.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnexionDB {
    private static Connection connection;

    private SingletonConnexionDB() {}

    public static Connection getConnexion() {
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/tp5", // URL de la base de données
                            "root", // Nom d'utilisateur
                            "12345" // Mot de passe
                    );
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return connection;
        }
        }


