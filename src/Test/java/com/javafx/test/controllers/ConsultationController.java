package com.javafx.test.controllers;

import com.javafx.test.entities.Consultation;
import com.javafx.test.entities.Medecin;
import com.javafx.test.entities.Patient;
import com.javafx.test.services.CabinetMetierImpl;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.util.StringConverter;
import javafx.geometry.Insets;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ConsultationController {

    @FXML private DatePicker dateFilter;
    @FXML private ComboBox<Medecin> medecinFilter;
    @FXML private ComboBox<Patient> patientFilter;
    @FXML private TableView<Consultation> consultationTable;
    @FXML private TableColumn<Consultation, Integer> idColumn;
    @FXML private TableColumn<Consultation, Date> dateColumn;
    @FXML private TableColumn<Consultation, String> patientColumn;
    @FXML private TableColumn<Consultation, String> medecinColumn;
    @FXML private TableColumn<Consultation, String> motifColumn;
    @FXML private TableColumn<Consultation, String> diagnosticColumn;
    @FXML private TableColumn<Consultation, String> prescriptionColumn;
    @FXML private TableColumn<Consultation, Void> actionsColumn;

    private CabinetMetierImpl metier = new CabinetMetierImpl();

    @FXML
    public void initialize() {
        // Initialize columns
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id_consultation"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date_consultation"));
        motifColumn.setCellValueFactory(new PropertyValueFactory<>("motif"));
        diagnosticColumn.setCellValueFactory(new PropertyValueFactory<>("diagnostic"));
        prescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("prescription"));

        // Custom cell factories for patient and medecin columns
        patientColumn.setCellValueFactory(cellData -> {
            Patient patient = cellData.getValue().getPatient();
            return javafx.beans.binding.Bindings.createStringBinding(
                    () -> patient.getNom() + " " + patient.getPrenom()
            );
        });

        medecinColumn.setCellValueFactory(cellData -> {
            Medecin medecin = cellData.getValue().getMedecin();
            return javafx.beans.binding.Bindings.createStringBinding(
                    () -> medecin.getNom() + " " + medecin.getPrenom()
            );
        });

        // Setup action column
        actionsColumn.setCellFactory(column -> {
            return new TableCell<>() {
                private final Button deleteButton = new Button("Supprimer");
                private final Button viewButton = new Button("Voir détails");

                {
                    deleteButton.setOnAction(event -> {
                        Consultation consultation = getTableView().getItems().get(getIndex());
                        handleDeleteConsultation(consultation.getId_consultation());
                    });

                    viewButton.setOnAction(event -> {
                        Consultation consultation = getTableView().getItems().get(getIndex());
                        showConsultationDetails(consultation);
                    });
                }

                @Override
                protected void updateItem(Void item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                    } else {
                        HBox buttons = new HBox(5, viewButton, deleteButton);
                        setGraphic(buttons);
                    }
                }
            };
        });

        // Setup filters
        setupFilters();

        // Load initial data
        loadConsultations();
    }

    private void setupFilters() {
        // Setup medecin filter
        medecinFilter.getItems().setAll(metier.getAllMedecins());
        medecinFilter.setConverter(new StringConverter<>() {
            @Override
            public String toString(Medecin medecin) {
                return medecin != null ? medecin.getNom() + " " + medecin.getPrenom() : "";
            }

            @Override
            public Medecin fromString(String string) {
                return null;
            }
        });

        // Setup patient filter
        patientFilter.getItems().setAll(metier.getAllPatients());
        patientFilter.setConverter(new StringConverter<>() {
            @Override
            public String toString(Patient patient) {
                return patient != null ? patient.getNom() + " " + patient.getPrenom() : "";
            }

            @Override
            public Patient fromString(String string) {
                return null;
            }
        });

        // Add listeners to filters
        dateFilter.valueProperty().addListener((obs, oldVal, newVal) -> loadConsultations());
        medecinFilter.valueProperty().addListener((obs, oldVal, newVal) -> loadConsultations());
        patientFilter.valueProperty().addListener((obs, oldVal, newVal) -> loadConsultations());
    }

    private void loadConsultations() {
        consultationTable.getItems().setAll(metier.getAllConsultations());
    }

    @FXML
    private void handleNewConsultation() {
        Dialog<Consultation> dialog = new Dialog<>();
        dialog.setTitle("Nouvelle Consultation");
        dialog.setHeaderText("Ajouter une nouvelle consultation");

        // Set the button types
        ButtonType saveButtonType = new ButtonType("Sauvegarder", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(saveButtonType, ButtonType.CANCEL);

        // Create the form grid
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        DatePicker datePicker = new DatePicker(LocalDate.now());
        ComboBox<Patient> patientCombo = new ComboBox<>(patientFilter.getItems());
        ComboBox<Medecin> medecinCombo = new ComboBox<>(medecinFilter.getItems());
        TextArea motifArea = new TextArea();
        TextArea diagnosticArea = new TextArea();
        TextArea prescriptionArea = new TextArea();

        patientCombo.setConverter(patientFilter.getConverter());
        medecinCombo.setConverter(medecinFilter.getConverter());

        grid.add(new Label("Date:"), 0, 0);
        grid.add(datePicker, 1, 0);
        grid.add(new Label("Patient:"), 0, 1);
        grid.add(patientCombo, 1, 1);
        grid.add(new Label("Médecin:"), 0, 2);
        grid.add(medecinCombo, 1, 2);
        grid.add(new Label("Motif:"), 0, 3);
        grid.add(motifArea, 1, 3);
        grid.add(new Label("Diagnostic:"), 0, 4);
        grid.add(diagnosticArea, 1, 4);
        grid.add(new Label("Prescription:"), 0, 5);
        grid.add(prescriptionArea, 1, 5);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == saveButtonType) {
                Consultation consultation = new Consultation();
                consultation.setDate_consultation(Date.from(
                        datePicker.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()
                ));
                consultation.setPatient(patientCombo.getValue());
                consultation.setMedecin(medecinCombo.getValue());
                consultation.setMotif(motifArea.getText());
                consultation.setDiagnostic(diagnosticArea.getText());
                consultation.setPrescription(prescriptionArea.getText());
                return consultation;
            }
            return null;
        });

        dialog.showAndWait().ifPresent(consultation -> {
            metier.addConsultation(consultation);
            loadConsultations();
        });
    }

    private void handleDeleteConsultation(int id) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Supprimer la consultation");
        alert.setContentText("Êtes-vous sûr de vouloir supprimer cette consultation ?");

        alert.showAndWait().ifPresent(result -> {
            if (result == ButtonType.OK) {
                metier.deleteConsultation(id);
                loadConsultations();
            }
        });
    }

    private void showConsultationDetails(Consultation consultation) {
        Dialog<Void> dialog = new Dialog<>();
        dialog.setTitle("Détails de la consultation");
        dialog.setHeaderText("Consultation du " + consultation.getDate_consultation());

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        grid.add(new Label("Patient:"), 0, 0);
        grid.add(new Label(consultation.getPatient().getNom() + " " +
                consultation.getPatient().getPrenom()), 1, 0);

        grid.add(new Label("Médecin:"), 0, 1);
        grid.add(new Label(consultation.getMedecin().getNom() + " " +
                consultation.getMedecin().getPrenom()), 1, 1);

        grid.add(new Label("Motif:"), 0, 2);
        grid.add(new TextArea(consultation.getMotif()), 1, 2);

        grid.add(new Label("Diagnostic:"), 0, 3);
        grid.add(new TextArea(consultation.getDiagnostic()), 1, 3);

        grid.add(new Label("Prescription:"), 0, 4);
        grid.add(new TextArea(consultation.getPrescription()), 1, 4);

        dialog.getDialogPane().setContent(grid);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);

        dialog.showAndWait();
    }
}