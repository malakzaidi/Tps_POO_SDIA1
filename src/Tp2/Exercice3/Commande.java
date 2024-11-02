package Tp2.Exercice3;

import java.util.Date;

public class Commande {
    private String reference ;
    private Client client ;
    private Date date ;
    private String etat;
    public Commande(String reference, Client client, Date date , String etat) {
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etat = etat;

    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;

    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }

}
