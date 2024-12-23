package com.javafx.test.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import javafx.event.ActionEvent;
import java.io.IOException;

public class AppController {

    @FXML private BorderPane mainContainer;

    @FXML
    public void initialize() {
        showPatientView(); // Show patient view by default
    }

    @FXML
    private void showPatientView() {
        loadView("/views/patient.fxml");
    }

    @FXML
    private void showMedecinView() {
        loadView("/views/medecin.fxml");
    }

    @FXML
    private void showConsultationView() {
        loadView("/views/consultation.fxml");
    }

    private void loadView(String fxmlPath) {
        try {
            Parent view = FXMLLoader.load(getClass().getResource(fxmlPath));
            mainContainer.setCenter(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void handleExit(ActionEvent event) {
        System.exit(0);
    }
}