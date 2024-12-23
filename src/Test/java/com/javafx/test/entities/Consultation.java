package com.javafx.test.entities;

import java.util.Date;

public class Consultation {
    private int id_consultation;
    private Date date_consultation;
    private String motif;
    private String diagnostic;
    private String prescription;
    private Patient patient;
    private Medecin medecin;


    public Consultation(int id_consultation, Date date_consultation, String motif,
                        String diagnostic, String prescription, Patient patient, Medecin medecin) {
        this.id_consultation = id_consultation;
        this.date_consultation = date_consultation;
        this.motif = motif;
        this.diagnostic = diagnostic;
        this.prescription = prescription;
        this.patient = patient;
        this.medecin = medecin;
    }

    public Consultation(int id_consultation, Date date_consultation, Patient patient, Medecin medecin) {
        this.id_consultation = id_consultation;
        this.date_consultation = date_consultation;
        this.patient = patient;
        this.medecin = medecin;
    }


    public Consultation() {}

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public Date getDate_consultation() {
        return date_consultation;
    }

    public void setDate_consultation(Date date_consultation) {
        this.date_consultation = date_consultation;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}