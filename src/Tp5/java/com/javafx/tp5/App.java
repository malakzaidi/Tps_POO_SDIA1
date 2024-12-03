package com.javafx.tp5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Correct path to the FXML file
        BorderPane root = FXMLLoader.load(getClass().getResource("/com/javafx/tp5/view/main.fxml"));

        // Create the scene with the root layout
        Scene scene = new Scene(root, 800, 600); // Adjust size as needed

        // Set the stage title and scene
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the application
    }
}

