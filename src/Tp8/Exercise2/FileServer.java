package Tp8.Exercise2;
import java.io.*;
import java.net.*;
import java.nio.file.*;

public class FileServer {
    private static final int PORT = 12345;
    private static final int BUFFER_SIZE = 8192; // Larger buffer for better performance

    public static void main(String[] args) {
        Path directory = Paths.get("server_files");

        // Create directory if it doesn't exist
        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            System.err.println("Failed to create server directory: " + e.getMessage());
            return;
        }

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server listening on port " + PORT);

            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected from: " + clientSocket.getInetAddress());
                    new ClientHandler(clientSocket, directory).start();
                } catch (IOException e) {
                    System.err.println("Error accepting client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Server failed to start: " + e.getMessage());
        }
    }
}

class ClientHandler extends Thread {
    private final Socket clientSocket;
    private final Path directory;

    public ClientHandler(Socket clientSocket, Path directory) {
        this.clientSocket = clientSocket;
        this.directory = directory;
    }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            out.println("Enter file name to download:");
            String fileName = in.readLine();

            // Sanitize file name to prevent directory traversal
            fileName = new File(fileName).getName();
            Path filePath = directory.resolve(fileName);

            if (Files.exists(filePath) && Files.isRegularFile(filePath)) {
                out.println("FILE_FOUND:" + Files.size(filePath));
                sendFile(filePath);
            } else {
                out.println("FILE_NOT_FOUND");
            }

        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing client socket: " + e.getMessage());
            }
        }
    }

    private void sendFile(Path filePath) {
        try (OutputStream out = clientSocket.getOutputStream();
             BufferedInputStream fileIn = new BufferedInputStream(Files.newInputStream(filePath))) {

            byte[] buffer = new byte[8192];
            long totalBytesSent = 0;
            int bytesRead;

            while ((bytesRead = fileIn.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                totalBytesSent += bytesRead;
            }

            out.flush();
            System.out.printf("File %s sent successfully (%d bytes)%n",
                    filePath.getFileName(), totalBytesSent);

        } catch (IOException e) {
            System.err.println("Error sending file: " + e.getMessage());
        }
    }
}