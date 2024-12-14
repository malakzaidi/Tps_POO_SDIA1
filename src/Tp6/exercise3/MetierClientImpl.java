package Tp6.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import exercise3.Client;
public class MetierClientImpl implements exercise3.IMetier<exercise3.Client> {
    private List<Client> clients;
    private final String fileName;

    public MetierClientImpl(String fileName) {
        this.fileName = fileName;
        this.clients = new ArrayList<>();
        loadFromFile();
    }

    @Override
    public Client add(Client client) {
        clients.add(client);
        return client;
    }

    @Override
    public List<Client> getAll() {
        return clients;
    }

    @Override
    public Client findByNom(String nom) {
        return clients.stream()
                .filter(c -> c.getNom().equalsIgnoreCase(nom))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(String nom) {
        clients.removeIf(c -> c.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(clients);
            System.out.println("Clients sauvegardés avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde des clients !");
        }
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            clients = (List<Client>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            clients = new ArrayList<>();
        }
    }
}
