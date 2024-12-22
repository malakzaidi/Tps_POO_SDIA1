package Tp8.Exercise1;

import java.io.*;
import java.net.*;
import java.util.Random;

public class Server {
    public static void main(String[] args) {
        int port = 12345;
        int magicNumber = new Random().nextInt(101); // Magic number between 0 and 100
        System.out.println("The magic number has been generated (server)");

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("The server is ready to accept connections on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("A client is connected.");
                new ClientHandler(clientSocket, magicNumber).start(); // Start a thread for each client
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class ClientHandler extends Thread {
    private Socket clientSocket;
    private int magicNumber;

    public ClientHandler(Socket clientSocket, int magicNumber) {
        this.clientSocket = clientSocket;
        this.magicNumber = magicNumber;
    }
    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            out.println("Welcome to the Magic Number game! Try to guess the magic number between 0 and 100.");

            String line;
            while ((line = in.readLine()) != null) {
                try {
                    int guess = Integer.parseInt(line);
                    if (guess < magicNumber) {
                        out.println("It's higher!");
                    } else if (guess > magicNumber) {
                        out.println("It's lower!");
                    } else {
                        out.println("Congratulations, you found the magic number!");
                        break;
                    }
                } catch (NumberFormatException e) {
                    out.println("Please enter a valid number.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
