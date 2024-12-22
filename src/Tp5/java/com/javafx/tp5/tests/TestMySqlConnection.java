package Tp5.java.com.javafx.tp5.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySqlConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/management_depts_profs"; // Replace with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "12345"; // Replace with your MySQL password

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed.");
        }
    }
}
