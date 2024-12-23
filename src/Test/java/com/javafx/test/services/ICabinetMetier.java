package com.javafx.test.services;

import com.javafx.test.entities.Consultation;
import com.javafx.test.entities.Medecin;
import com.javafx.test.entities.Patient;

import java.util.List;

public interface ICabinetMetier {
    // Patient management
    List<Patient> getAllPatients();
    List<Patient> searchPatients(String keyword);
    void addPatient(Patient p);
    void deletePatient(int id);
    List<Consultation> getConsultationsForPatient(int patientId);

    // Doctor management
    void addMedecin(Medecin m);
    List<Medecin> getAllMedecins();
    void deleteMedecin(int id);
    List<Consultation> getConsultationsForMedecin(int medecinId);

    // Consultation management
    void addConsultation(Consultation c);
    List<Consultation> getAllConsultations();
    void deleteConsultation(int id);
}
