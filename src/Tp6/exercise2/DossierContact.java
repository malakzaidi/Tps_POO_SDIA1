package Tp6.exercise2;

import java.io.*;
import java.util.*;
public class DossierContact {
    private final Map<String, String> contacts = new HashMap<>();
    private final String directoryPath;
    private boolean modified = false;

    public DossierContact(String directoryPath) {
        this.directoryPath = directoryPath;
        loadContacts();
    }

    // Load contacts from the directory
    public void loadContacts() {
        File dir = new File(directoryPath);
        if (!dir.exists()) dir.mkdirs();

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String phoneNumber = reader.readLine();
                        contacts.put(file.getName(), phoneNumber);
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + file.getName());
                    }
                }
            }
        }
    }

    // Save contacts back to files
    public void saveContacts() {
        if (!modified) return;

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            File file = new File(directoryPath + File.separator + entry.getKey());
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(entry.getValue());
            } catch (IOException e) {
                System.out.println("Error writing file: " + file.getName());
            }
        }
        modified = false;
    }

    // Add a new contact
    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            System.out.println("Contact already exists.");
        } else {
            contacts.put(name, phoneNumber);
            modified = true;
        }
    }

    // Delete a contact
    public void deleteContact(String name) {
        if (contacts.remove(name) != null) {
            new File(directoryPath + File.separator + name).delete();
            modified = true;
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Update a contact's phone number
    public void updateContact(String name, String newPhoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newPhoneNumber);
            modified = true;
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Search for a contact
    public String searchContact(String name) {
        return contacts.get(name);
    }
}
