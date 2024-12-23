package com.javafx.test.controllers;

import com.javafx.test.entities.Patient;
import com.javafx.test.services.CabinetMetierImpl;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Date;

public class PatientController {

    @FXML private TextField searchField;
    @FXML private TableView<Patient> patientTable;
    @FXML private TableColumn<Patient, Integer> idColumn;
    @FXML private TableColumn<Patient, String> nomColumn;
    @FXML private TableColumn<Patient, String> prenomColumn;
    @FXML private TableColumn<Patient, String> cinColumn;
    @FXML private TableColumn<Patient, String> telephoneColumn;
    @FXML private TableColumn<Patient, String> emailColumn;
    @FXML private TableColumn<Patient, Date> dateNaissanceColumn;
    @FXML private TableColumn<Patient, Void> actionsColumn;

    private CabinetMetierImpl metier = new CabinetMetierImpl();

    @FXML
    public void initialize() {
        // Initialize columns
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id_patient"));
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        cinColumn.setCellValueFactory(new PropertyValueFactory<>("cin"));
        telephoneColumn.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        dateNaissanceColumn.setCellValueFactory(new PropertyValueFactory<>("date_naissance"));

        loadPatients();
    }

    private void loadPatients() {
        patientTable.getItems().setAll(metier.getAllPatients());
    }

    @FXML
    private void handleSearch() {
        String keyword = searchField.getText();
        patientTable.getItems().setAll(metier.searchPatients(keyword));
    }

    @FXML
    private void handleNewPatient() {
        // Open new patient dialog
    }
}