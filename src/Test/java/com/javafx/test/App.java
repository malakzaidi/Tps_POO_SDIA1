package com.javafx.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Get the resource URL
            URL fxmlUrl = getClass().getResource("/com/javafx/test/com.javafx.test.view/app.fxml");
            if (fxmlUrl == null) {
                throw new IOException("Cannot find FXML file: /com/javafx/test/view/app.fxml");
            }

            // Load the FXML
            FXMLLoader loader = new FXMLLoader(fxmlUrl);
            BorderPane root = loader.load();

            // Create the scene with the root layout
            Scene scene = new Scene(root, 1024, 768);

            // Optional: add CSS if needed
            // scene.getStylesheets().add(getClass().getResource("/com/javafx/tp5/css/styles.css").toExternalForm());

            // Set the stage properties
            primaryStage.setTitle("Cabinet Médical");
            primaryStage.setScene(scene);
            primaryStage.setMinWidth(800);
            primaryStage.setMinHeight(600);

            // Show the stage
            primaryStage.show();

        } catch (IOException e) {
            showErrorAlert("Application Error",
                    "Error Loading Application",
                    "Could not load the application: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            showErrorAlert("Application Error",
                    "Unexpected Error",
                    "An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void showErrorAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}