package Tp8.Exercise1;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(serverAddress, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            String serverMessage;
            while ((serverMessage = in.readLine()) != null) {
                System.out.println(serverMessage);
                if (serverMessage.contains("Congratulations")) {
                    break;
                }
                String userGuess = userInput.readLine();
                out.println(userGuess);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

