package com.javafx.test.tests;

import com.javafx.test.entities.Consultation;
import com.javafx.test.entities.Medecin;
import com.javafx.test.entities.Patient;
import com.javafx.test.services.CabinetMetierImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {
    private static CabinetMetierImpl metier = new CabinetMetierImpl();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        System.out.println("=== Application Console - Cabinet Médical ===");

        while (true) {
            displayMenu();
            int choice = getIntInput("Votre choix: ");

            switch (choice) {
                case 1:
                    testPatients();
                    break;
                case 2:
                    testMedecins();
                    break;
                case 3:
                    testConsultations();
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Choix invalide!");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Gestion des Patients");
        System.out.println("2. Gestion des Médecins");
        System.out.println("3. Gestion des Consultations");
        System.out.println("0. Quitter");
    }

    private static void testPatients() {
        while (true) {
            System.out.println("\n=== Gestion des Patients ===");
            System.out.println("1. Ajouter un patient");
            System.out.println("2. Rechercher des patients");
            System.out.println("3. Afficher tous les patients");
            System.out.println("4. Supprimer un patient");
            System.out.println("0. Retour au menu principal");

            int choice = getIntInput("Votre choix: ");

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    searchPatients();
                    break;
                case 3:
                    displayAllPatients();
                    break;
                case 4:
                    deletePatient();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choix invalide!");
            }
        }
    }

    private static void testMedecins() {
        while (true) {
            System.out.println("\n=== Gestion des Médecins ===");
            System.out.println("1. Ajouter un médecin");
            System.out.println("2. Afficher tous les médecins");
            System.out.println("3. Supprimer un médecin");
            System.out.println("0. Retour au menu principal");

            int choice = getIntInput("Votre choix: ");

            switch (choice) {
                case 1:
                    addMedecin();
                    break;
                case 2:
                    displayAllMedecins();
                    break;
                case 3:
                    deleteMedecin();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choix invalide!");
            }
        }
    }

    private static void testConsultations() {
        while (true) {
            System.out.println("\n=== Gestion des Consultations ===");
            System.out.println("1. Ajouter une consultation");
            System.out.println("2. Afficher toutes les consultations");
            System.out.println("3. Afficher les consultations d'un patient");
            System.out.println("4. Afficher les consultations d'un médecin");
            System.out.println("5. Supprimer une consultation");
            System.out.println("0. Retour au menu principal");

            int choice = getIntInput("Votre choix: ");

            switch (choice) {
                case 1:
                    addConsultation();
                    break;
                case 2:
                    displayAllConsultations();
                    break;
                case 3:
                    displayPatientConsultations();
                    break;
                case 4:
                    displayMedecinConsultations();
                    break;
                case 5:
                    deleteConsultation();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choix invalide!");
            }
        }
    }


    private static void addPatient() {
        try {
            Patient patient = new Patient();
            System.out.println("\nAjout d'un nouveau patient:");
            patient.setNom(getStringInput("Nom: "));
            patient.setPrenom(getStringInput("Prénom: "));
            patient.setCin(getStringInput("CIN: "));
            patient.setTelephone(getStringInput("Téléphone: "));
            patient.setEmail(getStringInput("Email: "));
            patient.setDate_naissance(getDateInput("Date de naissance (dd/MM/yyyy): "));

            metier.addPatient(patient);
            System.out.println("Patient ajouté avec succès!");
        } catch (Exception e) {
            System.out.println("Erreur lors de l'ajout du patient: " + e.getMessage());
        }
    }

    private static void searchPatients() {
        String keyword = getStringInput("\nEntrez le mot-clé de recherche: ");
        List<Patient> patients = metier.searchPatients(keyword);
        if (patients.isEmpty()) {
            System.out.println("Aucun patient trouvé.");
        } else {
            System.out.println("\nRésultats de la recherche:");
            displayPatientsList(patients);
        }
    }

    private static void displayAllPatients() {
        List<Patient> patients = metier.getAllPatients();
        if (patients.isEmpty()) {
            System.out.println("\nAucun patient enregistré.");
        } else {
            System.out.println("\nListe de tous les patients:");
            displayPatientsList(patients);
        }
    }

    private static void deletePatient() {
        displayAllPatients();
        int id = getIntInput("\nEntrez l'ID du patient à supprimer (0 pour annuler): ");
        if (id != 0) {
            try {
                metier.deletePatient(id);
                System.out.println("Patient supprimé avec succès!");
            } catch (Exception e) {
                System.out.println("Erreur lors de la suppression: " + e.getMessage());
            }
        }
    }

    // Helper methods for Medecin operations
    private static void addMedecin() {
        try {
            Medecin medecin = new Medecin();
            System.out.println("\nAjout d'un nouveau médecin:");
            medecin.setNom(getStringInput("Nom: "));
            medecin.setPrenom(getStringInput("Prénom: "));
            medecin.setEmail(getStringInput("Email: "));
            medecin.setTel(getStringInput("Téléphone: "));

            metier.addMedecin(medecin);
            System.out.println("Médecin ajouté avec succès!");
        } catch (Exception e) {
            System.out.println("Erreur lors de l'ajout du médecin: " + e.getMessage());
        }
    }

    private static void displayAllMedecins() {
        List<Medecin> medecins = metier.getAllMedecins();
        if (medecins.isEmpty()) {
            System.out.println("\nAucun médecin enregistré.");
        } else {
            System.out.println("\nListe de tous les médecins:");
            for (Medecin m : medecins) {
                System.out.printf("ID: %d - Dr. %s %s - Tel: %s%n",
                        m.getId_medecin(), m.getNom(), m.getPrenom(), m.getTel());
            }
        }
    }

    private static void deleteMedecin() {
        displayAllMedecins();
        int id = getIntInput("\nEntrez l'ID du médecin à supprimer (0 pour annuler): ");
        if (id != 0) {
            try {
                metier.deleteMedecin(id);
                System.out.println("Médecin supprimé avec succès!");
            } catch (Exception e) {
                System.out.println("Erreur lors de la suppression: " + e.getMessage());
            }
        }
    }

    // Helper methods for Consultation operations
    private static void addConsultation() {
        try {
            displayAllPatients();
            int patientId = getIntInput("\nID du patient: ");

            displayAllMedecins();
            int medecinId = getIntInput("\nID du médecin: ");

            Consultation consultation = new Consultation();
            consultation.setDate_consultation(new Date());

            Patient patient = new Patient();
            patient.setId_patient(patientId);
            consultation.setPatient(patient);

            Medecin medecin = new Medecin();
            medecin.setId_medecin(medecinId);
            consultation.setMedecin(medecin);

            consultation.setMotif(getStringInput("Motif: "));
            consultation.setDiagnostic(getStringInput("Diagnostic: "));
            consultation.setPrescription(getStringInput("Prescription: "));

            metier.addConsultation(consultation);
            System.out.println("Consultation ajoutée avec succès!");
        } catch (Exception e) {
            System.out.println("Erreur lors de l'ajout de la consultation: " + e.getMessage());
        }
    }

    private static void displayAllConsultations() {
        List<Consultation> consultations = metier.getAllConsultations();
        displayConsultationsList(consultations);
    }

    private static void displayPatientConsultations() {
        displayAllPatients();
        int patientId = getIntInput("\nEntrez l'ID du patient: ");
        List<Consultation> consultations = metier.getConsultationsForPatient(patientId);
        displayConsultationsList(consultations);
    }

    private static void displayMedecinConsultations() {
        displayAllMedecins();
        int medecinId = getIntInput("\nEntrez l'ID du médecin: ");
        List<Consultation> consultations = metier.getConsultationsForMedecin(medecinId);
        displayConsultationsList(consultations);
    }

    private static void deleteConsultation() {
        displayAllConsultations();
        int id = getIntInput("\nEntrez l'ID de la consultation à supprimer (0 pour annuler): ");
        if (id != 0) {
            try {
                metier.deleteConsultation(id);
                System.out.println("Consultation supprimée avec succès!");
            } catch (Exception e) {
                System.out.println("Erreur lors de la suppression: " + e.getMessage());
            }
        }
    }

    // Utility methods
    private static void displayPatientsList(List<Patient> patients) {
        for (Patient p : patients) {
            System.out.printf("ID: %d - %s %s - CIN: %s - Tel: %s%n",
                    p.getId_patient(), p.getNom(), p.getPrenom(), p.getCin(), p.getTelephone());
        }
    }

    private static void displayConsultationsList(List<Consultation> consultations) {
        if (consultations.isEmpty()) {
            System.out.println("\nAucune consultation trouvée.");
        } else {
            System.out.println("\nListe des consultations:");
            for (Consultation c : consultations) {
                System.out.printf("ID: %d - Date: %s%n",
                        c.getId_consultation(), dateFormat.format(c.getDate_consultation()));
                System.out.printf("Patient: %s %s%n",
                        c.getPatient().getNom(), c.getPatient().getPrenom());
                System.out.printf("Médecin: Dr. %s %s%n",
                        c.getMedecin().getNom(), c.getMedecin().getPrenom());
                System.out.printf("Motif: %s%n", c.getMotif());
                System.out.println("------------------------");
            }
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }
    }

    private static Date getDateInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return dateFormat.parse(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Format de date invalide. Utilisez le format dd/MM/yyyy");
            }
        }
    }
}