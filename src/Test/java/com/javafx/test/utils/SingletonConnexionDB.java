package com.javafx.test.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingletonConnexionDB {
    private static Connection connection;

    private SingletonConnexionDB() {}  // private constructor

    public static Connection getConnexion() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/cabinet_medical",
                        "root",
                        "12345"
                );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

