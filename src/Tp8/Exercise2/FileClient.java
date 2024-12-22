package Tp8.Exercise2;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClient {
    private static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(serverAddress, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(in.readLine()); // Print server prompt
            String fileName = userInput.readLine();
            out.println(fileName);

            String response = in.readLine();
            if (response.startsWith("FILE_FOUND:")) {
                long fileSize = Long.parseLong(response.split(":")[1]);
                Path downloadPath = Paths.get("downloads", fileName);
                Files.createDirectories(downloadPath.getParent());
                receiveFile(socket, downloadPath, fileSize);
            } else {
                System.out.println("File not found on server.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void receiveFile(Socket socket, Path savePath, long fileSize) throws IOException {
        try (InputStream in = socket.getInputStream();
             OutputStream fileOut = Files.newOutputStream(savePath)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            long totalBytesReceived = 0;
            int bytesRead;

            while (totalBytesReceived < fileSize &&
                    (bytesRead = in.read(buffer, 0, (int)Math.min(buffer.length, fileSize - totalBytesReceived))) != -1) {
                fileOut.write(buffer, 0, bytesRead);
                totalBytesReceived += bytesRead;

                // Print progress
                int progress = (int)((totalBytesReceived * 100) / fileSize);
                System.out.printf("\rDownloading: %d%% complete", progress);
            }

            System.out.printf("%nFile saved to: %s (%d bytes)%n",
                    savePath.toAbsolutePath(), totalBytesReceived);
        }
    }
}