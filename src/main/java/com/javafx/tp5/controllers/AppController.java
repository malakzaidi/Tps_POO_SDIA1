package com.javafx.tp5.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class AppController {
    @FXML
    private TabPane mainTabPane;

    @FXML
    private void showProfesseurs() {
        mainTabPane.getSelectionModel().select(0);
    }

    @FXML
    private void showDepartements() {
        mainTabPane.getSelectionModel().select(1);
    }
}