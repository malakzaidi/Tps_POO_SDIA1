package com.javafx.test.services;


import com.javafx.test.entities.Consultation;
import com.javafx.test.entities.Medecin;
import com.javafx.test.entities.Patient;
import com.javafx.test.utils.SingletonConnexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CabinetMetierImpl implements ICabinetMetier {

    // Patient management methods
    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM patient");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Patient p = new Patient();
                p.setId_patient(rs.getInt("id_patient"));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                p.setCin(rs.getString("cin"));
                p.setTelephone(rs.getString("telephone"));
                p.setEmail(rs.getString("email"));
                p.setDate_naissance(rs.getDate("date_naissance"));
                patients.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    @Override
    public List<Patient> searchPatients(String keyword) {
        List<Patient> patients = new ArrayList<>();
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM patient WHERE nom LIKE ? OR prenom LIKE ? OR cin LIKE ?"
            );
            String searchKey = "%" + keyword + "%";
            ps.setString(1, searchKey);
            ps.setString(2, searchKey);
            ps.setString(3, searchKey);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Patient p = new Patient();
                p.setId_patient(rs.getInt("id_patient"));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                p.setCin(rs.getString("cin"));
                p.setTelephone(rs.getString("telephone"));
                p.setEmail(rs.getString("email"));
                p.setDate_naissance(rs.getDate("date_naissance"));
                patients.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    @Override
    public void addPatient(Patient p) {
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO patient (nom, prenom, cin, telephone, email, date_naissance) VALUES (?,?,?,?,?,?)"
            );
            ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setString(3, p.getCin());
            ps.setString(4, p.getTelephone());
            ps.setString(5, p.getEmail());
            ps.setDate(6, new java.sql.Date(p.getDate_naissance().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePatient(int id) {
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            // First delete related consultations
            PreparedStatement psConsult = conn.prepareStatement(
                    "DELETE FROM consultation WHERE id_patient = ?"
            );
            psConsult.setInt(1, id);
            psConsult.executeUpdate();

            // Then delete the patient
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM patient WHERE id_patient = ?"
            );
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Consultation> getConsultationsForPatient(int patientId) {
        List<Consultation> consultations = new ArrayList<>();
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT c.*, m.nom as medecin_nom, m.prenom as medecin_prenom " +
                            "FROM consultation c " +
                            "JOIN medecin m ON c.id_medecin = m.id_medecin " +
                            "WHERE c.id_patient = ? " +
                            "ORDER BY c.date_consultation DESC"
            );
            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Consultation c = new Consultation();
                c.setId_consultation(rs.getInt("id_consultation"));
                c.setDate_consultation(rs.getDate("date_consultation"));
                c.setMotif(rs.getString("motif"));
                c.setDiagnostic(rs.getString("diagnostic"));
                c.setPrescription(rs.getString("prescription"));

                // Set medecin info
                Medecin m = new Medecin();
                m.setId_medecin(rs.getInt("id_medecin"));
                m.setNom(rs.getString("medecin_nom"));
                m.setPrenom(rs.getString("medecin_prenom"));
                c.setMedecin(m);

                consultations.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return consultations;
    }

    // Doctor management methods
    @Override
    public void addMedecin(Medecin m) {
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO medecin (nom, prenom, email, tel) VALUES (?,?,?,?)"
            );
            ps.setString(1, m.getNom());
            ps.setString(2, m.getPrenom());
            ps.setString(3, m.getEmail());
            ps.setString(4, m.getTel());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Medecin> getAllMedecins() {
        List<Medecin> medecins = new ArrayList<>();
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM medecin");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Medecin m = new Medecin();
                m.setId_medecin(rs.getInt("id_medecin"));
                m.setNom(rs.getString("nom"));
                m.setPrenom(rs.getString("prenom"));
                m.setEmail(rs.getString("email"));
                m.setTel(rs.getString("tel"));
                medecins.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medecins;
    }

    @Override
    public void deleteMedecin(int id) {
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            // First delete related consultations
            PreparedStatement psConsult = conn.prepareStatement(
                    "DELETE FROM consultation WHERE id_medecin = ?"
            );
            psConsult.setInt(1, id);
            psConsult.executeUpdate();

            // Then delete the doctor
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM medecin WHERE id_medecin = ?"
            );
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Consultation> getConsultationsForMedecin(int medecinId) {
        List<Consultation> consultations = new ArrayList<>();
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT c.*, p.nom as patient_nom, p.prenom as patient_prenom " +
                            "FROM consultation c " +
                            "JOIN patient p ON c.id_patient = p.id_patient " +
                            "WHERE c.id_medecin = ? " +
                            "ORDER BY c.date_consultation DESC"
            );
            ps.setInt(1, medecinId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Consultation c = new Consultation();
                c.setId_consultation(rs.getInt("id_consultation"));
                c.setDate_consultation(rs.getDate("date_consultation"));
                c.setMotif(rs.getString("motif"));
                c.setDiagnostic(rs.getString("diagnostic"));
                c.setPrescription(rs.getString("prescription"));

                // Set patient info
                Patient p = new Patient();
                p.setId_patient(rs.getInt("id_patient"));
                p.setNom(rs.getString("patient_nom"));
                p.setPrenom(rs.getString("patient_prenom"));
                c.setPatient(p);

                consultations.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return consultations;
    }

    // Consultation management methods
    @Override
    public void addConsultation(Consultation c) {
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO consultation (date_consultation, motif, diagnostic, prescription, id_patient, id_medecin) " +
                            "VALUES (?,?,?,?,?,?)"
            );
            ps.setDate(1, new java.sql.Date(c.getDate_consultation().getTime()));
            ps.setString(2, c.getMotif());
            ps.setString(3, c.getDiagnostic());
            ps.setString(4, c.getPrescription());
            ps.setInt(5, c.getPatient().getId_patient());
            ps.setInt(6, c.getMedecin().getId_medecin());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Consultation> getAllConsultations() {
        List<Consultation> consultations = new ArrayList<>();
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT c.*, p.nom as patient_nom, p.prenom as patient_prenom, " +
                            "m.nom as medecin_nom, m.prenom as medecin_prenom " +
                            "FROM consultation c " +
                            "JOIN patient p ON c.id_patient = p.id_patient " +
                            "JOIN medecin m ON c.id_medecin = m.id_medecin " +
                            "ORDER BY c.date_consultation DESC"
            );
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Consultation c = new Consultation();
                c.setId_consultation(rs.getInt("id_consultation"));
                c.setDate_consultation(rs.getDate("date_consultation"));
                c.setMotif(rs.getString("motif"));
                c.setDiagnostic(rs.getString("diagnostic"));
                c.setPrescription(rs.getString("prescription"));

                // Set patient info
                Patient p = new Patient();
                p.setId_patient(rs.getInt("id_patient"));
                p.setNom(rs.getString("patient_nom"));
                p.setPrenom(rs.getString("patient_prenom"));
                c.setPatient(p);

                // Set medecin info
                Medecin m = new Medecin();
                m.setId_medecin(rs.getInt("id_medecin"));
                m.setNom(rs.getString("medecin_nom"));
                m.setPrenom(rs.getString("medecin_prenom"));
                c.setMedecin(m);

                consultations.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return consultations;
    }

    @Override
    public void deleteConsultation(int id) {
        try {
            Connection conn = SingletonConnexionDB.getConnexion();
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM consultation WHERE id_consultation = ?"
            );
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}