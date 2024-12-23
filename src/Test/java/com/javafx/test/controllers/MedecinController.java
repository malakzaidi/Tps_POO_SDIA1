package com.javafx.test.controllers;

import com.javafx.test.entities.Medecin;
import com.javafx.test.services.CabinetMetierImpl;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class MedecinController {

    @FXML private TextField searchField;
    @FXML private TableView<Medecin> medecinTable;
    @FXML private TableColumn<Medecin, Integer> idColumn;
    @FXML private TableColumn<Medecin, String> nomColumn;
    @FXML private TableColumn<Medecin, String> prenomColumn;
    @FXML private TableColumn<Medecin, String> emailColumn;
    @FXML private TableColumn<Medecin, String> telColumn;
    @FXML private TableColumn<Medecin, Void> actionsColumn;

    private final CabinetMetierImpl metier = new CabinetMetierImpl();

    @FXML
    public void initialize() {
        try {
            // Initialize columns
            idColumn.setCellValueFactory(new PropertyValueFactory<>("id_medecin"));
            nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
            prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
            emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
            telColumn.setCellValueFactory(new PropertyValueFactory<>("tel"));

            // Add action buttons to each row
            actionsColumn.setCellFactory(column -> new TableCell<>() {
                private final Button deleteButton = new Button("Supprimer");
                {
                    deleteButton.setOnAction(event -> {
                        Medecin medecin = getTableView().getItems().get(getIndex());
                        handleDeleteMedecin(medecin.getId_medecin());
                    });
                }

                @Override
                protected void updateItem(Void item, boolean empty) {
                    super.updateItem(item, empty);
                    setGraphic(empty ? null : deleteButton);
                }
            });

            loadMedecins();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error initializing MedecinController: " + e.getMessage());
        }
    }

    private void loadMedecins() {
        medecinTable.getItems().setAll(metier.getAllMedecins());
    }

    @FXML
    private void handleNewMedecin() {
        Dialog<Medecin> dialog = new Dialog<>();
        dialog.setTitle("Nouveau Médecin");
        dialog.setHeaderText("Ajouter un nouveau médecin");

        ButtonType saveButtonType = new ButtonType("Sauvegarder", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(saveButtonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField nom = new TextField();
        TextField prenom = new TextField();
        TextField email = new TextField();
        TextField tel = new TextField();

        grid.add(new Label("Nom:"), 0, 0);
        grid.add(nom, 1, 0);
        grid.add(new Label("Prénom:"), 0, 1);
        grid.add(prenom, 1, 1);
        grid.add(new Label("Email:"), 0, 2);
        grid.add(email, 1, 2);
        grid.add(new Label("Téléphone:"), 0, 3);
        grid.add(tel, 1, 3);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == saveButtonType) {
                Medecin medecin = new Medecin();
                medecin.setNom(nom.getText());
                medecin.setPrenom(prenom.getText());
                medecin.setEmail(email.getText());
                medecin.setTel(tel.getText());
                return medecin;
            }
            return null;
        });

        dialog.showAndWait().ifPresent(medecin -> {
            metier.addMedecin(medecin);
            loadMedecins();
        });
    }

    private void handleDeleteMedecin(int id) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Supprimer le médecin");
        alert.setContentText("Êtes-vous sûr de vouloir supprimer ce médecin ?");

        alert.showAndWait().ifPresent(result -> {
            if (result == ButtonType.OK) {
                metier.deleteMedecin(id);
                loadMedecins();
            }
        });
    }
}